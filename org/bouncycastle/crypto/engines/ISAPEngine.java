package org.bouncycastle.crypto.engines;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

public class ISAPEngine implements AEADCipher {
  private String algorithmName;
  
  private boolean forEncryption;
  
  private boolean initialised;
  
  final int CRYPTO_KEYBYTES = 16;
  
  final int CRYPTO_NPUBBYTES = 16;
  
  final int ISAP_STATE_SZ = 40;
  
  private byte[] k;
  
  private byte[] c;
  
  private byte[] ad;
  
  private byte[] npub;
  
  private byte[] mac;
  
  private ByteArrayOutputStream aadData = new ByteArrayOutputStream();
  
  private final ByteArrayOutputStream message = new ByteArrayOutputStream();
  
  private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
  
  private int ISAP_rH;
  
  private int ISAP_rH_SZ;
  
  private ISAP_AEAD ISAPAEAD;
  
  public ISAPEngine(IsapType paramIsapType) {
    switch (paramIsapType) {
      case ISAP_A_128A:
        this.ISAPAEAD = new ISAPAEAD_A_128A();
        this.algorithmName = "ISAP-A-128A AEAD";
        break;
      case ISAP_K_128A:
        this.ISAPAEAD = new ISAPAEAD_K_128A();
        this.algorithmName = "ISAP-K-128A AEAD";
        break;
      case ISAP_A_128:
        this.ISAPAEAD = new ISAPAEAD_A_128();
        this.algorithmName = "ISAP-A-128 AEAD";
        break;
      case ISAP_K_128:
        this.ISAPAEAD = new ISAPAEAD_K_128();
        this.algorithmName = "ISAP-K-128 AEAD";
        break;
    } 
  }
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) throws IllegalArgumentException {
    this.forEncryption = paramBoolean;
    if (!(paramCipherParameters instanceof ParametersWithIV))
      throw new IllegalArgumentException("ISAP AEAD init parameters must include an IV"); 
    ParametersWithIV parametersWithIV = (ParametersWithIV)paramCipherParameters;
    byte[] arrayOfByte1 = parametersWithIV.getIV();
    if (arrayOfByte1 == null || arrayOfByte1.length != 16)
      throw new IllegalArgumentException("ISAP AEAD requires exactly 12 bytes of IV"); 
    if (!(parametersWithIV.getParameters() instanceof KeyParameter))
      throw new IllegalArgumentException("ISAP AEAD init parameters must include a key"); 
    KeyParameter keyParameter = (KeyParameter)parametersWithIV.getParameters();
    byte[] arrayOfByte2 = keyParameter.getKey();
    if (arrayOfByte2.length != 16)
      throw new IllegalArgumentException("ISAP AEAD key must be 128 bits long"); 
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties(getAlgorithmName(), 128, paramCipherParameters, Utils.getPurpose(paramBoolean)));
    this.npub = new byte[arrayOfByte1.length];
    this.k = new byte[arrayOfByte2.length];
    System.arraycopy(arrayOfByte1, 0, this.npub, 0, arrayOfByte1.length);
    System.arraycopy(arrayOfByte2, 0, this.k, 0, arrayOfByte2.length);
    this.ISAPAEAD.init();
    this.initialised = true;
    reset();
  }
  
  public String getAlgorithmName() {
    return this.algorithmName;
  }
  
  public void processAADByte(byte paramByte) {
    this.aadData.write(paramByte);
  }
  
  public void processAADBytes(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt1 + paramInt2 > paramArrayOfbyte.length)
      throw new DataLengthException("input buffer too short" + (this.forEncryption ? "encryption" : "decryption")); 
    this.aadData.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public int processByte(byte paramByte, byte[] paramArrayOfbyte, int paramInt) throws DataLengthException {
    return processBytes(new byte[] { paramByte }, 0, 1, paramArrayOfbyte, paramInt);
  }
  
  public int processBytes(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws DataLengthException {
    if (!this.initialised)
      throw new IllegalArgumentException("Need call init function before encryption/decryption"); 
    if (paramInt1 + paramInt2 > paramArrayOfbyte1.length)
      throw new DataLengthException("input buffer too short"); 
    this.message.write(paramArrayOfbyte1, paramInt1, paramInt2);
    if (this.forEncryption && this.message.size() >= this.ISAP_rH_SZ) {
      paramInt2 = this.message.size() / this.ISAP_rH_SZ * this.ISAP_rH_SZ;
      if (paramInt3 + paramInt2 > paramArrayOfbyte2.length)
        throw new OutputLengthException("output buffer is too short"); 
      byte[] arrayOfByte = this.message.toByteArray();
      this.ISAPAEAD.isap_enc(arrayOfByte, 0, paramInt2, paramArrayOfbyte2, paramInt3, paramArrayOfbyte2.length);
      this.outputStream.write(paramArrayOfbyte2, paramInt3, paramInt2);
      this.message.reset();
      this.message.write(arrayOfByte, paramInt2, arrayOfByte.length - paramInt2);
      return paramInt2;
    } 
    return 0;
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) throws IllegalStateException, InvalidCipherTextException {
    int i;
    if (!this.initialised)
      throw new IllegalArgumentException("Need call init function before encryption/decryption"); 
    if (this.forEncryption) {
      byte[] arrayOfByte = this.message.toByteArray();
      i = arrayOfByte.length;
      if (paramInt + i + 16 > paramArrayOfbyte.length)
        throw new OutputLengthException("output buffer is too short"); 
      this.ISAPAEAD.isap_enc(arrayOfByte, 0, i, paramArrayOfbyte, paramInt, paramArrayOfbyte.length);
      this.outputStream.write(paramArrayOfbyte, paramInt, i);
      paramInt += i;
      this.ad = this.aadData.toByteArray();
      this.c = this.outputStream.toByteArray();
      this.mac = new byte[16];
      this.ISAPAEAD.isap_mac(this.ad, this.ad.length, this.c, this.c.length, this.mac, 0);
      System.arraycopy(this.mac, 0, paramArrayOfbyte, paramInt, 16);
      i += 16;
    } else {
      this.ad = this.aadData.toByteArray();
      this.c = this.message.toByteArray();
      this.mac = new byte[16];
      i = this.c.length - this.mac.length;
      if (i + paramInt > paramArrayOfbyte.length)
        throw new OutputLengthException("output buffer is too short"); 
      this.ISAPAEAD.isap_mac(this.ad, this.ad.length, this.c, i, this.mac, 0);
      this.ISAPAEAD.reset();
      for (byte b = 0; b < 16; b++) {
        if (this.mac[b] != this.c[i + b])
          throw new IllegalArgumentException("Mac does not match"); 
      } 
      this.ISAPAEAD.isap_enc(this.c, 0, i, paramArrayOfbyte, paramInt, paramArrayOfbyte.length);
    } 
    return i;
  }
  
  public byte[] getMac() {
    return this.mac;
  }
  
  public int getUpdateOutputSize(int paramInt) {
    return paramInt;
  }
  
  public int getOutputSize(int paramInt) {
    return paramInt + 16;
  }
  
  public void reset() {
    if (!this.initialised)
      throw new IllegalArgumentException("Need call init function before encryption/decryption"); 
    this.aadData.reset();
    this.ISAPAEAD.reset();
    this.message.reset();
    this.outputStream.reset();
  }
  
  public int getKeyBytesSize() {
    return 16;
  }
  
  public int getIVBytesSize() {
    return 16;
  }
  
  public int getBlockSize() {
    return this.ISAP_rH_SZ;
  }
  
  public abstract class ISAPAEAD_A implements ISAP_AEAD {
    protected long[] k64;
    
    protected long[] npub64;
    
    protected long ISAP_IV1_64;
    
    protected long ISAP_IV2_64;
    
    protected long ISAP_IV3_64;
    
    protected long x0;
    
    protected long x1;
    
    protected long x2;
    
    protected long x3;
    
    protected long x4;
    
    protected long t0;
    
    protected long t1;
    
    protected long t2;
    
    protected long t3;
    
    protected long t4;
    
    public ISAPAEAD_A() {
      ISAPEngine.this.ISAP_rH = 64;
      ISAPEngine.this.ISAP_rH_SZ = ISAPEngine.this.ISAP_rH + 7 >> 3;
    }
    
    public void init() {
      this.npub64 = new long[getLongSize(ISAPEngine.this.npub.length)];
      Pack.littleEndianToLong(ISAPEngine.this.npub, 0, this.npub64, 0, this.npub64.length);
      this.npub64[0] = U64BIG(this.npub64[0]);
      this.npub64[1] = U64BIG(this.npub64[1]);
      this.k64 = new long[getLongSize(ISAPEngine.this.k.length)];
      Pack.littleEndianToLong(ISAPEngine.this.k, 0, this.k64, 0, this.k64.length);
      this.k64[0] = U64BIG(this.k64[0]);
      this.k64[1] = U64BIG(this.k64[1]);
      reset();
    }
    
    protected abstract void PX1();
    
    protected abstract void PX2();
    
    protected void ABSORB_MAC(byte[] param1ArrayOfbyte, int param1Int) {
      long[] arrayOfLong = new long[param1ArrayOfbyte.length >> 3];
      Pack.littleEndianToLong(param1ArrayOfbyte, 0, arrayOfLong, 0, arrayOfLong.length);
      byte b1 = 0;
      while (param1Int >= ISAPEngine.this.ISAP_rH_SZ) {
        this.x0 ^= U64BIG(arrayOfLong[b1++]);
        P12();
        param1Int -= ISAPEngine.this.ISAP_rH_SZ;
      } 
      for (byte b2 = 0; b2 < param1Int; b2++)
        this.x0 ^= (param1ArrayOfbyte[(b1 << 3) + b2] & 0xFFL) << 7 - b2 << 3; 
      this.x0 ^= 128L << 7 - param1Int << 3;
      P12();
    }
    
    public void isap_mac(byte[] param1ArrayOfbyte1, int param1Int1, byte[] param1ArrayOfbyte2, int param1Int2, byte[] param1ArrayOfbyte3, int param1Int3) {
      this.x0 = this.npub64[0];
      this.x1 = this.npub64[1];
      this.x2 = this.ISAP_IV1_64;
      this.x3 = this.x4 = 0L;
      P12();
      ABSORB_MAC(param1ArrayOfbyte1, param1Int1);
      this.x4 ^= 0x1L;
      ABSORB_MAC(param1ArrayOfbyte2, param1Int2);
      Pack.longToLittleEndian(U64BIG(this.x0), param1ArrayOfbyte3, 0);
      Pack.longToLittleEndian(U64BIG(this.x1), param1ArrayOfbyte3, 8);
      long l1 = this.x2;
      long l2 = this.x3;
      long l3 = this.x4;
      isap_rk(this.ISAP_IV2_64, param1ArrayOfbyte3, 16);
      this.x2 = l1;
      this.x3 = l2;
      this.x4 = l3;
      P12();
      Pack.longToLittleEndian(U64BIG(this.x0), param1ArrayOfbyte3, param1Int3);
      Pack.longToLittleEndian(U64BIG(this.x1), param1ArrayOfbyte3, param1Int3 + 8);
    }
    
    public void isap_rk(long param1Long, byte[] param1ArrayOfbyte, int param1Int) {
      this.x0 = this.k64[0];
      this.x1 = this.k64[1];
      this.x2 = param1Long;
      this.x3 = this.x4 = 0L;
      P12();
      for (byte b = 0; b < (param1Int << 3) - 1; b++) {
        this.x0 ^= (((param1ArrayOfbyte[b >>> 3] >>> 7 - (b & 0x7) & 0x1) << 7) & 0xFFL) << 56L;
        PX2();
      } 
      this.x0 ^= (param1ArrayOfbyte[param1Int - 1] & 0x1L) << 7L << 56L;
      P12();
    }
    
    public void isap_enc(byte[] param1ArrayOfbyte1, int param1Int1, int param1Int2, byte[] param1ArrayOfbyte2, int param1Int3, int param1Int4) {
      long[] arrayOfLong1 = new long[param1Int2 >> 3];
      Pack.littleEndianToLong(param1ArrayOfbyte1, param1Int1, arrayOfLong1, 0, arrayOfLong1.length);
      long[] arrayOfLong2 = new long[arrayOfLong1.length];
      byte b = 0;
      while (param1Int2 >= ISAPEngine.this.ISAP_rH_SZ) {
        arrayOfLong2[b] = U64BIG(this.x0) ^ arrayOfLong1[b];
        PX1();
        b++;
        param1Int2 -= ISAPEngine.this.ISAP_rH_SZ;
      } 
      Pack.longToLittleEndian(arrayOfLong2, 0, arrayOfLong2.length, param1ArrayOfbyte2, param1Int3);
      byte[] arrayOfByte = Pack.longToLittleEndian(this.x0);
      while (param1Int2 > 0)
        param1ArrayOfbyte2[(b << 3) + param1Int3 + param1Int2 - 1] = (byte)(arrayOfByte[ISAPEngine.this.ISAP_rH_SZ - param1Int2] ^ param1ArrayOfbyte1[(b << 3) + param1Int1 + --param1Int2]); 
    }
    
    public void reset() {
      isap_rk(this.ISAP_IV3_64, ISAPEngine.this.npub, 16);
      this.x3 = this.npub64[0];
      this.x4 = this.npub64[1];
      PX1();
    }
    
    private int getLongSize(int param1Int) {
      return (param1Int >>> 3) + (((param1Int & 0x7) != 0) ? 1 : 0);
    }
    
    private long ROTR(long param1Long1, long param1Long2) {
      return param1Long1 >>> (int)param1Long2 | param1Long1 << (int)(64L - param1Long2);
    }
    
    protected long U64BIG(long param1Long) {
      return ROTR(param1Long, 8L) & 0xFF000000FF000000L | ROTR(param1Long, 24L) & 0xFF000000FF0000L | ROTR(param1Long, 40L) & 0xFF000000FF00L | ROTR(param1Long, 56L) & 0xFF000000FFL;
    }
    
    protected void ROUND(long param1Long) {
      this.t0 = this.x0 ^ this.x1 ^ this.x2 ^ this.x3 ^ param1Long ^ this.x1 & (this.x0 ^ this.x2 ^ this.x4 ^ param1Long);
      this.t1 = this.x0 ^ this.x2 ^ this.x3 ^ this.x4 ^ param1Long ^ (this.x1 ^ this.x2 ^ param1Long) & (this.x1 ^ this.x3);
      this.t2 = this.x1 ^ this.x2 ^ this.x4 ^ param1Long ^ this.x3 & this.x4;
      this.t3 = this.x0 ^ this.x1 ^ this.x2 ^ param1Long ^ (this.x0 ^ 0xFFFFFFFFFFFFFFFFL) & (this.x3 ^ this.x4);
      this.t4 = this.x1 ^ this.x3 ^ this.x4 ^ (this.x0 ^ this.x4) & this.x1;
      this.x0 = this.t0 ^ ROTR(this.t0, 19L) ^ ROTR(this.t0, 28L);
      this.x1 = this.t1 ^ ROTR(this.t1, 39L) ^ ROTR(this.t1, 61L);
      this.x2 = this.t2 ^ ROTR(this.t2, 1L) ^ ROTR(this.t2, 6L) ^ 0xFFFFFFFFFFFFFFFFL;
      this.x3 = this.t3 ^ ROTR(this.t3, 10L) ^ ROTR(this.t3, 17L);
      this.x4 = this.t4 ^ ROTR(this.t4, 7L) ^ ROTR(this.t4, 41L);
    }
    
    public void P12() {
      ROUND(240L);
      ROUND(225L);
      ROUND(210L);
      ROUND(195L);
      ROUND(180L);
      ROUND(165L);
      P6();
    }
    
    protected void P6() {
      ROUND(150L);
      ROUND(135L);
      ROUND(120L);
      ROUND(105L);
      ROUND(90L);
      ROUND(75L);
    }
  }
  
  private class ISAPAEAD_A_128 extends ISAPAEAD_A {
    protected void PX1() {
      P12();
    }
    
    protected void PX2() {
      P12();
    }
  }
  
  private class ISAPAEAD_A_128A extends ISAPAEAD_A {
    protected void PX1() {
      P6();
    }
    
    protected void PX2() {
      ROUND(75L);
    }
  }
  
  private abstract class ISAPAEAD_K implements ISAP_AEAD {
    final int ISAP_STATE_SZ_CRYPTO_NPUBBYTES = 24;
    
    protected short[] ISAP_IV1_16;
    
    protected short[] ISAP_IV2_16;
    
    protected short[] ISAP_IV3_16;
    
    protected short[] k16;
    
    protected short[] iv16;
    
    private final int[] KeccakF400RoundConstants = new int[] { 
        1, 32898, 32906, 32768, 32907, 1, 32897, 32777, 138, 136, 
        32777, 10, 32907, 139, 32905, 32771, 32770, 128, 32778, 10 };
    
    protected short[] SX = new short[25];
    
    protected short[] E = new short[25];
    
    protected short[] C = new short[5];
    
    public ISAPAEAD_K() {
      ISAPEngine.this.ISAP_rH = 144;
      ISAPEngine.this.ISAP_rH_SZ = ISAPEngine.this.ISAP_rH + 7 >> 3;
    }
    
    public void init() {
      this.k16 = new short[ISAPEngine.this.k.length >> 1];
      byteToShort(ISAPEngine.this.k, this.k16, this.k16.length);
      this.iv16 = new short[ISAPEngine.this.npub.length >> 1];
      byteToShort(ISAPEngine.this.npub, this.iv16, this.iv16.length);
      reset();
    }
    
    public void reset() {
      this.SX = new short[25];
      this.E = new short[25];
      this.C = new short[5];
      isap_rk(this.ISAP_IV3_16, ISAPEngine.this.npub, 16, this.SX, 24, this.C);
      System.arraycopy(this.iv16, 0, this.SX, 17, 8);
      PermuteRoundsKX(this.SX, this.E, this.C);
    }
    
    protected abstract void PermuteRoundsHX(short[] param1ArrayOfshort1, short[] param1ArrayOfshort2, short[] param1ArrayOfshort3);
    
    protected abstract void PermuteRoundsKX(short[] param1ArrayOfshort1, short[] param1ArrayOfshort2, short[] param1ArrayOfshort3);
    
    protected abstract void PermuteRoundsBX(short[] param1ArrayOfshort1, short[] param1ArrayOfshort2, short[] param1ArrayOfshort3);
    
    protected void ABSORB_MAC(short[] param1ArrayOfshort1, byte[] param1ArrayOfbyte, int param1Int, short[] param1ArrayOfshort2, short[] param1ArrayOfshort3) {
      int i = param1Int;
      int j = 0;
      while (i > ISAPEngine.this.ISAP_rH_SZ) {
        byteToShortXor(param1ArrayOfbyte, param1ArrayOfshort1, ISAPEngine.this.ISAP_rH_SZ >> 1);
        j += ISAPEngine.this.ISAP_rH_SZ;
        i -= ISAPEngine.this.ISAP_rH_SZ;
        PermuteRoundsHX(param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
      } 
      if (i == ISAPEngine.this.ISAP_rH_SZ) {
        byteToShortXor(param1ArrayOfbyte, param1ArrayOfshort1, ISAPEngine.this.ISAP_rH_SZ >> 1);
        PermuteRoundsHX(param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
        param1ArrayOfshort1[0] = (short)(param1ArrayOfshort1[0] ^ 0x80);
        PermuteRoundsHX(param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
      } else {
        for (byte b = 0; b < i; b++)
          param1ArrayOfshort1[b >> 1] = (short)(param1ArrayOfshort1[b >> 1] ^ (param1ArrayOfbyte[j++] & 0xFF) << (b & 0x1) << 3); 
        param1ArrayOfshort1[i >> 1] = (short)(param1ArrayOfshort1[i >> 1] ^ 128 << (i & 0x1) << 3);
        PermuteRoundsHX(param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
      } 
    }
    
    public void isap_rk(short[] param1ArrayOfshort1, byte[] param1ArrayOfbyte, int param1Int1, short[] param1ArrayOfshort2, int param1Int2, short[] param1ArrayOfshort3) {
      short[] arrayOfShort1 = new short[25];
      short[] arrayOfShort2 = new short[25];
      System.arraycopy(this.k16, 0, arrayOfShort1, 0, 8);
      System.arraycopy(param1ArrayOfshort1, 0, arrayOfShort1, 8, 4);
      PermuteRoundsKX(arrayOfShort1, arrayOfShort2, param1ArrayOfshort3);
      for (byte b = 0; b < (param1Int1 << 3) - 1; b++) {
        arrayOfShort1[0] = (short)(arrayOfShort1[0] ^ (param1ArrayOfbyte[b >> 3] >>> 7 - (b & 0x7) & 0x1) << 7);
        PermuteRoundsBX(arrayOfShort1, arrayOfShort2, param1ArrayOfshort3);
      } 
      arrayOfShort1[0] = (short)(arrayOfShort1[0] ^ (param1ArrayOfbyte[param1Int1 - 1] & 0x1) << 7);
      PermuteRoundsKX(arrayOfShort1, arrayOfShort2, param1ArrayOfshort3);
      System.arraycopy(arrayOfShort1, 0, param1ArrayOfshort2, 0, (param1Int2 == 24) ? 17 : 8);
    }
    
    public void isap_mac(byte[] param1ArrayOfbyte1, int param1Int1, byte[] param1ArrayOfbyte2, int param1Int2, byte[] param1ArrayOfbyte3, int param1Int3) {
      this.SX = new short[25];
      System.arraycopy(this.iv16, 0, this.SX, 0, 8);
      System.arraycopy(this.ISAP_IV1_16, 0, this.SX, 8, 4);
      PermuteRoundsHX(this.SX, this.E, this.C);
      ABSORB_MAC(this.SX, param1ArrayOfbyte1, param1Int1, this.E, this.C);
      this.SX[24] = (short)(this.SX[24] ^ 0x100);
      ABSORB_MAC(this.SX, param1ArrayOfbyte2, param1Int2, this.E, this.C);
      shortToByte(this.SX, param1ArrayOfbyte3, param1Int3);
      isap_rk(this.ISAP_IV2_16, param1ArrayOfbyte3, 16, this.SX, 16, this.C);
      PermuteRoundsHX(this.SX, this.E, this.C);
      shortToByte(this.SX, param1ArrayOfbyte3, param1Int3);
    }
    
    public void isap_enc(byte[] param1ArrayOfbyte1, int param1Int1, int param1Int2, byte[] param1ArrayOfbyte2, int param1Int3, int param1Int4) {
      while (param1Int2 >= ISAPEngine.this.ISAP_rH_SZ) {
        for (byte b1 = 0; b1 < ISAPEngine.this.ISAP_rH_SZ; b1++)
          param1ArrayOfbyte2[param1Int3++] = (byte)(this.SX[b1 >> 1] >>> (b1 & 0x1) << 3 ^ param1ArrayOfbyte1[param1Int1++]); 
        param1Int2 -= ISAPEngine.this.ISAP_rH_SZ;
        PermuteRoundsKX(this.SX, this.E, this.C);
      } 
      for (byte b = 0; b < param1Int2; b++)
        param1ArrayOfbyte2[param1Int3++] = (byte)(this.SX[b >> 1] >>> (b & 0x1) << 3 ^ param1ArrayOfbyte1[param1Int1++]); 
    }
    
    private void byteToShortXor(byte[] param1ArrayOfbyte, short[] param1ArrayOfshort, int param1Int) {
      for (byte b = 0; b < param1Int; b++)
        param1ArrayOfshort[b] = (short)(param1ArrayOfshort[b] ^ Pack.littleEndianToShort(param1ArrayOfbyte, b << 1)); 
    }
    
    private void byteToShort(byte[] param1ArrayOfbyte, short[] param1ArrayOfshort, int param1Int) {
      for (byte b = 0; b < param1Int; b++)
        param1ArrayOfshort[b] = Pack.littleEndianToShort(param1ArrayOfbyte, b << 1); 
    }
    
    private void shortToByte(short[] param1ArrayOfshort, byte[] param1ArrayOfbyte, int param1Int) {
      for (byte b = 0; b < 8; b++)
        Pack.shortToLittleEndian(param1ArrayOfshort[b], param1ArrayOfbyte, param1Int + (b << 1)); 
    }
    
    protected void rounds12X(short[] param1ArrayOfshort1, short[] param1ArrayOfshort2, short[] param1ArrayOfshort3) {
      prepareThetaX(param1ArrayOfshort1, param1ArrayOfshort3);
      rounds_8_18(param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
    }
    
    protected void rounds_4_18(short[] param1ArrayOfshort1, short[] param1ArrayOfshort2, short[] param1ArrayOfshort3) {
      thetaRhoPiChiIotaPrepareTheta(4, param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(5, param1ArrayOfshort2, param1ArrayOfshort1, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(6, param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(7, param1ArrayOfshort2, param1ArrayOfshort1, param1ArrayOfshort3);
      rounds_8_18(param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
    }
    
    protected void rounds_8_18(short[] param1ArrayOfshort1, short[] param1ArrayOfshort2, short[] param1ArrayOfshort3) {
      thetaRhoPiChiIotaPrepareTheta(8, param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(9, param1ArrayOfshort2, param1ArrayOfshort1, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(10, param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(11, param1ArrayOfshort2, param1ArrayOfshort1, param1ArrayOfshort3);
      rounds_12_18(param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
    }
    
    protected void rounds_12_18(short[] param1ArrayOfshort1, short[] param1ArrayOfshort2, short[] param1ArrayOfshort3) {
      thetaRhoPiChiIotaPrepareTheta(12, param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(13, param1ArrayOfshort2, param1ArrayOfshort1, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(14, param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(15, param1ArrayOfshort2, param1ArrayOfshort1, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(16, param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(17, param1ArrayOfshort2, param1ArrayOfshort1, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(18, param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
      thetaRhoPiChiIota(param1ArrayOfshort2, param1ArrayOfshort1, param1ArrayOfshort3);
    }
    
    protected void prepareThetaX(short[] param1ArrayOfshort1, short[] param1ArrayOfshort2) {
      param1ArrayOfshort2[0] = (short)(param1ArrayOfshort1[0] ^ param1ArrayOfshort1[5] ^ param1ArrayOfshort1[10] ^ param1ArrayOfshort1[15] ^ param1ArrayOfshort1[20]);
      param1ArrayOfshort2[1] = (short)(param1ArrayOfshort1[1] ^ param1ArrayOfshort1[6] ^ param1ArrayOfshort1[11] ^ param1ArrayOfshort1[16] ^ param1ArrayOfshort1[21]);
      param1ArrayOfshort2[2] = (short)(param1ArrayOfshort1[2] ^ param1ArrayOfshort1[7] ^ param1ArrayOfshort1[12] ^ param1ArrayOfshort1[17] ^ param1ArrayOfshort1[22]);
      param1ArrayOfshort2[3] = (short)(param1ArrayOfshort1[3] ^ param1ArrayOfshort1[8] ^ param1ArrayOfshort1[13] ^ param1ArrayOfshort1[18] ^ param1ArrayOfshort1[23]);
      param1ArrayOfshort2[4] = (short)(param1ArrayOfshort1[4] ^ param1ArrayOfshort1[9] ^ param1ArrayOfshort1[14] ^ param1ArrayOfshort1[19] ^ param1ArrayOfshort1[24]);
    }
    
    private short ROL16(short param1Short, int param1Int) {
      return (short)((param1Short & 0xFFFF) << param1Int ^ (param1Short & 0xFFFF) >>> 16 - param1Int);
    }
    
    protected void thetaRhoPiChiIotaPrepareTheta(int param1Int, short[] param1ArrayOfshort1, short[] param1ArrayOfshort2, short[] param1ArrayOfshort3) {
      short s1 = (short)(param1ArrayOfshort3[4] ^ ROL16(param1ArrayOfshort3[1], 1));
      short s2 = (short)(param1ArrayOfshort3[0] ^ ROL16(param1ArrayOfshort3[2], 1));
      short s3 = (short)(param1ArrayOfshort3[1] ^ ROL16(param1ArrayOfshort3[3], 1));
      short s4 = (short)(param1ArrayOfshort3[2] ^ ROL16(param1ArrayOfshort3[4], 1));
      short s5 = (short)(param1ArrayOfshort3[3] ^ ROL16(param1ArrayOfshort3[0], 1));
      short s6 = param1ArrayOfshort1[0] = (short)(param1ArrayOfshort1[0] ^ s1);
      param1ArrayOfshort1[6] = (short)(param1ArrayOfshort1[6] ^ s2);
      short s7 = ROL16(param1ArrayOfshort1[6], 12);
      param1ArrayOfshort1[12] = (short)(param1ArrayOfshort1[12] ^ s3);
      short s8 = ROL16(param1ArrayOfshort1[12], 11);
      param1ArrayOfshort1[18] = (short)(param1ArrayOfshort1[18] ^ s4);
      short s9 = ROL16(param1ArrayOfshort1[18], 5);
      param1ArrayOfshort1[24] = (short)(param1ArrayOfshort1[24] ^ s5);
      short s10 = ROL16(param1ArrayOfshort1[24], 14);
      param1ArrayOfshort2[0] = (short)(s6 ^ (s7 ^ 0xFFFFFFFF) & s8 ^ this.KeccakF400RoundConstants[param1Int]);
      param1ArrayOfshort3[0] = (short)(s6 ^ (s7 ^ 0xFFFFFFFF) & s8 ^ this.KeccakF400RoundConstants[param1Int]);
      param1ArrayOfshort2[1] = (short)(s7 ^ (s8 ^ 0xFFFFFFFF) & s9);
      param1ArrayOfshort3[1] = (short)(s7 ^ (s8 ^ 0xFFFFFFFF) & s9);
      param1ArrayOfshort2[2] = (short)(s8 ^ (s9 ^ 0xFFFFFFFF) & s10);
      param1ArrayOfshort3[2] = (short)(s8 ^ (s9 ^ 0xFFFFFFFF) & s10);
      param1ArrayOfshort2[3] = (short)(s9 ^ (s10 ^ 0xFFFFFFFF) & s6);
      param1ArrayOfshort3[3] = (short)(s9 ^ (s10 ^ 0xFFFFFFFF) & s6);
      param1ArrayOfshort2[4] = (short)(s10 ^ (s6 ^ 0xFFFFFFFF) & s7);
      param1ArrayOfshort3[4] = (short)(s10 ^ (s6 ^ 0xFFFFFFFF) & s7);
      param1ArrayOfshort1[3] = (short)(param1ArrayOfshort1[3] ^ s4);
      s6 = ROL16(param1ArrayOfshort1[3], 12);
      param1ArrayOfshort1[9] = (short)(param1ArrayOfshort1[9] ^ s5);
      s7 = ROL16(param1ArrayOfshort1[9], 4);
      param1ArrayOfshort1[10] = (short)(param1ArrayOfshort1[10] ^ s1);
      s8 = ROL16(param1ArrayOfshort1[10], 3);
      param1ArrayOfshort1[16] = (short)(param1ArrayOfshort1[16] ^ s2);
      s9 = ROL16(param1ArrayOfshort1[16], 13);
      param1ArrayOfshort1[22] = (short)(param1ArrayOfshort1[22] ^ s3);
      s10 = ROL16(param1ArrayOfshort1[22], 13);
      param1ArrayOfshort2[5] = (short)(s6 ^ (s7 ^ 0xFFFFFFFF) & s8);
      param1ArrayOfshort3[0] = (short)(param1ArrayOfshort3[0] ^ param1ArrayOfshort2[5]);
      param1ArrayOfshort2[6] = (short)(s7 ^ (s8 ^ 0xFFFFFFFF) & s9);
      param1ArrayOfshort3[1] = (short)(param1ArrayOfshort3[1] ^ param1ArrayOfshort2[6]);
      param1ArrayOfshort2[7] = (short)(s8 ^ (s9 ^ 0xFFFFFFFF) & s10);
      param1ArrayOfshort3[2] = (short)(param1ArrayOfshort3[2] ^ param1ArrayOfshort2[7]);
      param1ArrayOfshort2[8] = (short)(s9 ^ (s10 ^ 0xFFFFFFFF) & s6);
      param1ArrayOfshort3[3] = (short)(param1ArrayOfshort3[3] ^ param1ArrayOfshort2[8]);
      param1ArrayOfshort2[9] = (short)(s10 ^ (s6 ^ 0xFFFFFFFF) & s7);
      param1ArrayOfshort3[4] = (short)(param1ArrayOfshort3[4] ^ param1ArrayOfshort2[9]);
      param1ArrayOfshort1[1] = (short)(param1ArrayOfshort1[1] ^ s2);
      s6 = ROL16(param1ArrayOfshort1[1], 1);
      param1ArrayOfshort1[7] = (short)(param1ArrayOfshort1[7] ^ s3);
      s7 = ROL16(param1ArrayOfshort1[7], 6);
      param1ArrayOfshort1[13] = (short)(param1ArrayOfshort1[13] ^ s4);
      s8 = ROL16(param1ArrayOfshort1[13], 9);
      param1ArrayOfshort1[19] = (short)(param1ArrayOfshort1[19] ^ s5);
      s9 = ROL16(param1ArrayOfshort1[19], 8);
      param1ArrayOfshort1[20] = (short)(param1ArrayOfshort1[20] ^ s1);
      s10 = ROL16(param1ArrayOfshort1[20], 2);
      param1ArrayOfshort2[10] = (short)(s6 ^ (s7 ^ 0xFFFFFFFF) & s8);
      param1ArrayOfshort3[0] = (short)(param1ArrayOfshort3[0] ^ param1ArrayOfshort2[10]);
      param1ArrayOfshort2[11] = (short)(s7 ^ (s8 ^ 0xFFFFFFFF) & s9);
      param1ArrayOfshort3[1] = (short)(param1ArrayOfshort3[1] ^ param1ArrayOfshort2[11]);
      param1ArrayOfshort2[12] = (short)(s8 ^ (s9 ^ 0xFFFFFFFF) & s10);
      param1ArrayOfshort3[2] = (short)(param1ArrayOfshort3[2] ^ param1ArrayOfshort2[12]);
      param1ArrayOfshort2[13] = (short)(s9 ^ (s10 ^ 0xFFFFFFFF) & s6);
      param1ArrayOfshort3[3] = (short)(param1ArrayOfshort3[3] ^ param1ArrayOfshort2[13]);
      param1ArrayOfshort2[14] = (short)(s10 ^ (s6 ^ 0xFFFFFFFF) & s7);
      param1ArrayOfshort3[4] = (short)(param1ArrayOfshort3[4] ^ param1ArrayOfshort2[14]);
      param1ArrayOfshort1[4] = (short)(param1ArrayOfshort1[4] ^ s5);
      s6 = ROL16(param1ArrayOfshort1[4], 11);
      param1ArrayOfshort1[5] = (short)(param1ArrayOfshort1[5] ^ s1);
      s7 = ROL16(param1ArrayOfshort1[5], 4);
      param1ArrayOfshort1[11] = (short)(param1ArrayOfshort1[11] ^ s2);
      s8 = ROL16(param1ArrayOfshort1[11], 10);
      param1ArrayOfshort1[17] = (short)(param1ArrayOfshort1[17] ^ s3);
      s9 = ROL16(param1ArrayOfshort1[17], 15);
      param1ArrayOfshort1[23] = (short)(param1ArrayOfshort1[23] ^ s4);
      s10 = ROL16(param1ArrayOfshort1[23], 8);
      param1ArrayOfshort2[15] = (short)(s6 ^ (s7 ^ 0xFFFFFFFF) & s8);
      param1ArrayOfshort3[0] = (short)(param1ArrayOfshort3[0] ^ param1ArrayOfshort2[15]);
      param1ArrayOfshort2[16] = (short)(s7 ^ (s8 ^ 0xFFFFFFFF) & s9);
      param1ArrayOfshort3[1] = (short)(param1ArrayOfshort3[1] ^ param1ArrayOfshort2[16]);
      param1ArrayOfshort2[17] = (short)(s8 ^ (s9 ^ 0xFFFFFFFF) & s10);
      param1ArrayOfshort3[2] = (short)(param1ArrayOfshort3[2] ^ param1ArrayOfshort2[17]);
      param1ArrayOfshort2[18] = (short)(s9 ^ (s10 ^ 0xFFFFFFFF) & s6);
      param1ArrayOfshort3[3] = (short)(param1ArrayOfshort3[3] ^ param1ArrayOfshort2[18]);
      param1ArrayOfshort2[19] = (short)(s10 ^ (s6 ^ 0xFFFFFFFF) & s7);
      param1ArrayOfshort3[4] = (short)(param1ArrayOfshort3[4] ^ param1ArrayOfshort2[19]);
      param1ArrayOfshort1[2] = (short)(param1ArrayOfshort1[2] ^ s3);
      s6 = ROL16(param1ArrayOfshort1[2], 14);
      param1ArrayOfshort1[8] = (short)(param1ArrayOfshort1[8] ^ s4);
      s7 = ROL16(param1ArrayOfshort1[8], 7);
      param1ArrayOfshort1[14] = (short)(param1ArrayOfshort1[14] ^ s5);
      s8 = ROL16(param1ArrayOfshort1[14], 7);
      param1ArrayOfshort1[15] = (short)(param1ArrayOfshort1[15] ^ s1);
      s9 = ROL16(param1ArrayOfshort1[15], 9);
      param1ArrayOfshort1[21] = (short)(param1ArrayOfshort1[21] ^ s2);
      s10 = ROL16(param1ArrayOfshort1[21], 2);
      param1ArrayOfshort2[20] = (short)(s6 ^ (s7 ^ 0xFFFFFFFF) & s8);
      param1ArrayOfshort3[0] = (short)(param1ArrayOfshort3[0] ^ param1ArrayOfshort2[20]);
      param1ArrayOfshort2[21] = (short)(s7 ^ (s8 ^ 0xFFFFFFFF) & s9);
      param1ArrayOfshort3[1] = (short)(param1ArrayOfshort3[1] ^ param1ArrayOfshort2[21]);
      param1ArrayOfshort2[22] = (short)(s8 ^ (s9 ^ 0xFFFFFFFF) & s10);
      param1ArrayOfshort3[2] = (short)(param1ArrayOfshort3[2] ^ param1ArrayOfshort2[22]);
      param1ArrayOfshort2[23] = (short)(s9 ^ (s10 ^ 0xFFFFFFFF) & s6);
      param1ArrayOfshort3[3] = (short)(param1ArrayOfshort3[3] ^ param1ArrayOfshort2[23]);
      param1ArrayOfshort2[24] = (short)(s10 ^ (s6 ^ 0xFFFFFFFF) & s7);
      param1ArrayOfshort3[4] = (short)(param1ArrayOfshort3[4] ^ param1ArrayOfshort2[24]);
    }
    
    protected void thetaRhoPiChiIota(short[] param1ArrayOfshort1, short[] param1ArrayOfshort2, short[] param1ArrayOfshort3) {
      short s1 = (short)(param1ArrayOfshort3[4] ^ ROL16(param1ArrayOfshort3[1], 1));
      short s2 = (short)(param1ArrayOfshort3[0] ^ ROL16(param1ArrayOfshort3[2], 1));
      short s3 = (short)(param1ArrayOfshort3[1] ^ ROL16(param1ArrayOfshort3[3], 1));
      short s4 = (short)(param1ArrayOfshort3[2] ^ ROL16(param1ArrayOfshort3[4], 1));
      short s5 = (short)(param1ArrayOfshort3[3] ^ ROL16(param1ArrayOfshort3[0], 1));
      short s6 = param1ArrayOfshort1[0] = (short)(param1ArrayOfshort1[0] ^ s1);
      param1ArrayOfshort1[6] = (short)(param1ArrayOfshort1[6] ^ s2);
      short s7 = ROL16(param1ArrayOfshort1[6], 12);
      param1ArrayOfshort1[12] = (short)(param1ArrayOfshort1[12] ^ s3);
      short s8 = ROL16(param1ArrayOfshort1[12], 11);
      param1ArrayOfshort1[18] = (short)(param1ArrayOfshort1[18] ^ s4);
      short s9 = ROL16(param1ArrayOfshort1[18], 5);
      param1ArrayOfshort1[24] = (short)(param1ArrayOfshort1[24] ^ s5);
      short s10 = ROL16(param1ArrayOfshort1[24], 14);
      param1ArrayOfshort2[0] = (short)(s6 ^ (s7 ^ 0xFFFFFFFF) & s8 ^ this.KeccakF400RoundConstants[19]);
      param1ArrayOfshort2[1] = (short)(s7 ^ (s8 ^ 0xFFFFFFFF) & s9);
      param1ArrayOfshort2[2] = (short)(s8 ^ (s9 ^ 0xFFFFFFFF) & s10);
      param1ArrayOfshort2[3] = (short)(s9 ^ (s10 ^ 0xFFFFFFFF) & s6);
      param1ArrayOfshort2[4] = (short)(s10 ^ (s6 ^ 0xFFFFFFFF) & s7);
      param1ArrayOfshort1[3] = (short)(param1ArrayOfshort1[3] ^ s4);
      s6 = ROL16(param1ArrayOfshort1[3], 12);
      param1ArrayOfshort1[9] = (short)(param1ArrayOfshort1[9] ^ s5);
      s7 = ROL16(param1ArrayOfshort1[9], 4);
      param1ArrayOfshort1[10] = (short)(param1ArrayOfshort1[10] ^ s1);
      s8 = ROL16(param1ArrayOfshort1[10], 3);
      param1ArrayOfshort1[16] = (short)(param1ArrayOfshort1[16] ^ s2);
      s9 = ROL16(param1ArrayOfshort1[16], 13);
      param1ArrayOfshort1[22] = (short)(param1ArrayOfshort1[22] ^ s3);
      s10 = ROL16(param1ArrayOfshort1[22], 13);
      param1ArrayOfshort2[5] = (short)(s6 ^ (s7 ^ 0xFFFFFFFF) & s8);
      param1ArrayOfshort2[6] = (short)(s7 ^ (s8 ^ 0xFFFFFFFF) & s9);
      param1ArrayOfshort2[7] = (short)(s8 ^ (s9 ^ 0xFFFFFFFF) & s10);
      param1ArrayOfshort2[8] = (short)(s9 ^ (s10 ^ 0xFFFFFFFF) & s6);
      param1ArrayOfshort2[9] = (short)(s10 ^ (s6 ^ 0xFFFFFFFF) & s7);
      param1ArrayOfshort1[1] = (short)(param1ArrayOfshort1[1] ^ s2);
      s6 = ROL16(param1ArrayOfshort1[1], 1);
      param1ArrayOfshort1[7] = (short)(param1ArrayOfshort1[7] ^ s3);
      s7 = ROL16(param1ArrayOfshort1[7], 6);
      param1ArrayOfshort1[13] = (short)(param1ArrayOfshort1[13] ^ s4);
      s8 = ROL16(param1ArrayOfshort1[13], 9);
      param1ArrayOfshort1[19] = (short)(param1ArrayOfshort1[19] ^ s5);
      s9 = ROL16(param1ArrayOfshort1[19], 8);
      param1ArrayOfshort1[20] = (short)(param1ArrayOfshort1[20] ^ s1);
      s10 = ROL16(param1ArrayOfshort1[20], 2);
      param1ArrayOfshort2[10] = (short)(s6 ^ (s7 ^ 0xFFFFFFFF) & s8);
      param1ArrayOfshort2[11] = (short)(s7 ^ (s8 ^ 0xFFFFFFFF) & s9);
      param1ArrayOfshort2[12] = (short)(s8 ^ (s9 ^ 0xFFFFFFFF) & s10);
      param1ArrayOfshort2[13] = (short)(s9 ^ (s10 ^ 0xFFFFFFFF) & s6);
      param1ArrayOfshort2[14] = (short)(s10 ^ (s6 ^ 0xFFFFFFFF) & s7);
      param1ArrayOfshort1[4] = (short)(param1ArrayOfshort1[4] ^ s5);
      s6 = ROL16(param1ArrayOfshort1[4], 11);
      param1ArrayOfshort1[5] = (short)(param1ArrayOfshort1[5] ^ s1);
      s7 = ROL16(param1ArrayOfshort1[5], 4);
      param1ArrayOfshort1[11] = (short)(param1ArrayOfshort1[11] ^ s2);
      s8 = ROL16(param1ArrayOfshort1[11], 10);
      param1ArrayOfshort1[17] = (short)(param1ArrayOfshort1[17] ^ s3);
      s9 = ROL16(param1ArrayOfshort1[17], 15);
      param1ArrayOfshort1[23] = (short)(param1ArrayOfshort1[23] ^ s4);
      s10 = ROL16(param1ArrayOfshort1[23], 8);
      param1ArrayOfshort2[15] = (short)(s6 ^ (s7 ^ 0xFFFFFFFF) & s8);
      param1ArrayOfshort2[16] = (short)(s7 ^ (s8 ^ 0xFFFFFFFF) & s9);
      param1ArrayOfshort2[17] = (short)(s8 ^ (s9 ^ 0xFFFFFFFF) & s10);
      param1ArrayOfshort2[18] = (short)(s9 ^ (s10 ^ 0xFFFFFFFF) & s6);
      param1ArrayOfshort2[19] = (short)(s10 ^ (s6 ^ 0xFFFFFFFF) & s7);
      param1ArrayOfshort1[2] = (short)(param1ArrayOfshort1[2] ^ s3);
      s6 = ROL16(param1ArrayOfshort1[2], 14);
      param1ArrayOfshort1[8] = (short)(param1ArrayOfshort1[8] ^ s4);
      s7 = ROL16(param1ArrayOfshort1[8], 7);
      param1ArrayOfshort1[14] = (short)(param1ArrayOfshort1[14] ^ s5);
      s8 = ROL16(param1ArrayOfshort1[14], 7);
      param1ArrayOfshort1[15] = (short)(param1ArrayOfshort1[15] ^ s1);
      s9 = ROL16(param1ArrayOfshort1[15], 9);
      param1ArrayOfshort1[21] = (short)(param1ArrayOfshort1[21] ^ s2);
      s10 = ROL16(param1ArrayOfshort1[21], 2);
      param1ArrayOfshort2[20] = (short)(s6 ^ (s7 ^ 0xFFFFFFFF) & s8);
      param1ArrayOfshort2[21] = (short)(s7 ^ (s8 ^ 0xFFFFFFFF) & s9);
      param1ArrayOfshort2[22] = (short)(s8 ^ (s9 ^ 0xFFFFFFFF) & s10);
      param1ArrayOfshort2[23] = (short)(s9 ^ (s10 ^ 0xFFFFFFFF) & s6);
      param1ArrayOfshort2[24] = (short)(s10 ^ (s6 ^ 0xFFFFFFFF) & s7);
    }
  }
  
  private class ISAPAEAD_K_128 extends ISAPAEAD_K {
    protected void PermuteRoundsHX(short[] param1ArrayOfshort1, short[] param1ArrayOfshort2, short[] param1ArrayOfshort3) {
      prepareThetaX(param1ArrayOfshort1, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(0, param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(1, param1ArrayOfshort2, param1ArrayOfshort1, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(2, param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(3, param1ArrayOfshort2, param1ArrayOfshort1, param1ArrayOfshort3);
      rounds_4_18(param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
    }
    
    protected void PermuteRoundsKX(short[] param1ArrayOfshort1, short[] param1ArrayOfshort2, short[] param1ArrayOfshort3) {
      rounds12X(param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
    }
    
    protected void PermuteRoundsBX(short[] param1ArrayOfshort1, short[] param1ArrayOfshort2, short[] param1ArrayOfshort3) {
      rounds12X(param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
    }
  }
  
  private class ISAPAEAD_K_128A extends ISAPAEAD_K {
    protected void PermuteRoundsHX(short[] param1ArrayOfshort1, short[] param1ArrayOfshort2, short[] param1ArrayOfshort3) {
      prepareThetaX(param1ArrayOfshort1, param1ArrayOfshort3);
      rounds_4_18(param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
    }
    
    protected void PermuteRoundsKX(short[] param1ArrayOfshort1, short[] param1ArrayOfshort2, short[] param1ArrayOfshort3) {
      prepareThetaX(param1ArrayOfshort1, param1ArrayOfshort3);
      rounds_12_18(param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
    }
    
    protected void PermuteRoundsBX(short[] param1ArrayOfshort1, short[] param1ArrayOfshort2, short[] param1ArrayOfshort3) {
      prepareThetaX(param1ArrayOfshort1, param1ArrayOfshort3);
      thetaRhoPiChiIotaPrepareTheta(19, param1ArrayOfshort1, param1ArrayOfshort2, param1ArrayOfshort3);
      System.arraycopy(param1ArrayOfshort2, 0, param1ArrayOfshort1, 0, param1ArrayOfshort2.length);
    }
  }
  
  private static interface ISAP_AEAD {
    void isap_enc(byte[] param1ArrayOfbyte1, int param1Int1, int param1Int2, byte[] param1ArrayOfbyte2, int param1Int3, int param1Int4);
    
    void init();
    
    void isap_mac(byte[] param1ArrayOfbyte1, int param1Int1, byte[] param1ArrayOfbyte2, int param1Int2, byte[] param1ArrayOfbyte3, int param1Int3);
    
    void reset();
  }
  
  public enum IsapType {
    ISAP_A_128A, ISAP_K_128A, ISAP_A_128, ISAP_K_128;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\engines\ISAPEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */