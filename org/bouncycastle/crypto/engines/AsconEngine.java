package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

public class AsconEngine implements AEADCipher {
  private final AsconParameters asconParameters;
  
  private State m_state = State.Uninitialized;
  
  private byte[] mac;
  
  private byte[] initialAssociatedText;
  
  private final String algorithmName;
  
  private final int CRYPTO_KEYBYTES;
  
  private final int CRYPTO_ABYTES;
  
  private final int ASCON_AEAD_RATE;
  
  private final int nr;
  
  private long K0;
  
  private long K1;
  
  private long K2;
  
  private long N0;
  
  private long N1;
  
  private final long ASCON_IV;
  
  private long x0;
  
  private long x1;
  
  private long x2;
  
  private long x3;
  
  private long x4;
  
  private final int m_bufferSizeDecrypt;
  
  private final byte[] m_buf;
  
  private int m_bufPos = 0;
  
  public AsconEngine(AsconParameters paramAsconParameters) {
    this.asconParameters = paramAsconParameters;
    switch (paramAsconParameters) {
      case DecInit:
        this.CRYPTO_KEYBYTES = 20;
        this.CRYPTO_ABYTES = 16;
        this.ASCON_AEAD_RATE = 8;
        this.ASCON_IV = -6899501409222262784L;
        this.algorithmName = "Ascon-80pq AEAD";
        break;
      case EncInit:
        this.CRYPTO_KEYBYTES = 16;
        this.CRYPTO_ABYTES = 16;
        this.ASCON_AEAD_RATE = 16;
        this.ASCON_IV = -9187330011336540160L;
        this.algorithmName = "Ascon-128a AEAD";
        break;
      case DecAad:
        this.CRYPTO_KEYBYTES = 16;
        this.CRYPTO_ABYTES = 16;
        this.ASCON_AEAD_RATE = 8;
        this.ASCON_IV = -9205344418435956736L;
        this.algorithmName = "Ascon-128 AEAD";
        break;
      default:
        throw new IllegalArgumentException("invalid parameter setting for ASCON AEAD");
    } 
    this.nr = (this.ASCON_AEAD_RATE == 8) ? 6 : 8;
    this.m_bufferSizeDecrypt = this.ASCON_AEAD_RATE + this.CRYPTO_ABYTES;
    this.m_buf = new byte[this.m_bufferSizeDecrypt];
  }
  
  private long PAD(int paramInt) {
    return 128L << 56 - (paramInt << 3);
  }
  
  private void ROUND(long paramLong) {
    long l1 = this.x0 ^ this.x1 ^ this.x2 ^ this.x3 ^ paramLong ^ this.x1 & (this.x0 ^ this.x2 ^ this.x4 ^ paramLong);
    long l2 = this.x0 ^ this.x2 ^ this.x3 ^ this.x4 ^ paramLong ^ (this.x1 ^ this.x2 ^ paramLong) & (this.x1 ^ this.x3);
    long l3 = this.x1 ^ this.x2 ^ this.x4 ^ paramLong ^ this.x3 & this.x4;
    long l4 = this.x0 ^ this.x1 ^ this.x2 ^ paramLong ^ (this.x0 ^ 0xFFFFFFFFFFFFFFFFL) & (this.x3 ^ this.x4);
    long l5 = this.x1 ^ this.x3 ^ this.x4 ^ (this.x0 ^ this.x4) & this.x1;
    this.x0 = l1 ^ Longs.rotateRight(l1, 19) ^ Longs.rotateRight(l1, 28);
    this.x1 = l2 ^ Longs.rotateRight(l2, 39) ^ Longs.rotateRight(l2, 61);
    this.x2 = l3 ^ Longs.rotateRight(l3, 1) ^ Longs.rotateRight(l3, 6) ^ 0xFFFFFFFFFFFFFFFFL;
    this.x3 = l4 ^ Longs.rotateRight(l4, 10) ^ Longs.rotateRight(l4, 17);
    this.x4 = l5 ^ Longs.rotateRight(l5, 7) ^ Longs.rotateRight(l5, 41);
  }
  
  private void P(int paramInt) {
    if (paramInt >= 8) {
      if (paramInt == 12) {
        ROUND(240L);
        ROUND(225L);
        ROUND(210L);
        ROUND(195L);
      } 
      ROUND(180L);
      ROUND(165L);
    } 
    ROUND(150L);
    ROUND(135L);
    ROUND(120L);
    ROUND(105L);
    ROUND(90L);
    ROUND(75L);
  }
  
  private void ascon_aeadinit() {
    this.x0 = this.ASCON_IV;
    if (this.CRYPTO_KEYBYTES == 20)
      this.x0 ^= this.K0; 
    this.x1 = this.K1;
    this.x2 = this.K2;
    this.x3 = this.N0;
    this.x4 = this.N1;
    P(12);
    if (this.CRYPTO_KEYBYTES == 20)
      this.x2 ^= this.K0; 
    this.x3 ^= this.K1;
    this.x4 ^= this.K2;
  }
  
  private void checkAAD() {
    switch (this.m_state) {
      case DecInit:
        this.m_state = State.DecAad;
      case EncInit:
        this.m_state = State.EncAad;
      case DecAad:
      case EncAad:
        return;
      case EncFinal:
        throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
    } 
    throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
  }
  
  private boolean checkData() {
    switch (this.m_state) {
      case DecInit:
      case DecAad:
        finishAAD(State.DecData);
        return false;
      case EncInit:
      case EncAad:
        finishAAD(State.EncData);
        return true;
      case DecData:
        return false;
      case EncData:
        return true;
      case EncFinal:
        throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
    } 
    throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
  }
  
  private void processBufferAAD(byte[] paramArrayOfbyte, int paramInt) {
    this.x0 ^= Pack.bigEndianToLong(paramArrayOfbyte, paramInt);
    if (this.ASCON_AEAD_RATE == 16)
      this.x1 ^= Pack.bigEndianToLong(paramArrayOfbyte, 8 + paramInt); 
    P(this.nr);
  }
  
  private void finishAAD(State paramState) {
    switch (this.m_state) {
      case DecAad:
      case EncAad:
        this.m_buf[this.m_bufPos] = Byte.MIN_VALUE;
        if (this.m_bufPos >= 8) {
          this.x0 ^= Pack.bigEndianToLong(this.m_buf, 0);
          this.x1 ^= Pack.bigEndianToLong(this.m_buf, 8) & -1L << 56 - (this.m_bufPos - 8 << 3);
        } else {
          this.x0 ^= Pack.bigEndianToLong(this.m_buf, 0) & -1L << 56 - (this.m_bufPos << 3);
        } 
        P(this.nr);
        break;
    } 
    this.x4 ^= 0x1L;
    this.m_bufPos = 0;
    this.m_state = paramState;
  }
  
  private void processBufferDecrypt(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2) {
    if (paramInt2 + this.ASCON_AEAD_RATE > paramArrayOfbyte2.length)
      throw new OutputLengthException("output buffer too short"); 
    long l = Pack.bigEndianToLong(paramArrayOfbyte1, paramInt1);
    Pack.longToBigEndian(this.x0 ^ l, paramArrayOfbyte2, paramInt2);
    this.x0 = l;
    if (this.ASCON_AEAD_RATE == 16) {
      long l1 = Pack.bigEndianToLong(paramArrayOfbyte1, paramInt1 + 8);
      Pack.longToBigEndian(this.x1 ^ l1, paramArrayOfbyte2, paramInt2 + 8);
      this.x1 = l1;
    } 
    P(this.nr);
  }
  
  private void processBufferEncrypt(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2) {
    if (paramInt2 + this.ASCON_AEAD_RATE > paramArrayOfbyte2.length)
      throw new OutputLengthException("output buffer too short"); 
    this.x0 ^= Pack.bigEndianToLong(paramArrayOfbyte1, paramInt1);
    Pack.longToBigEndian(this.x0, paramArrayOfbyte2, paramInt2);
    if (this.ASCON_AEAD_RATE == 16) {
      this.x1 ^= Pack.bigEndianToLong(paramArrayOfbyte1, paramInt1 + 8);
      Pack.longToBigEndian(this.x1, paramArrayOfbyte2, paramInt2 + 8);
    } 
    P(this.nr);
  }
  
  private void processFinalDecrypt(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) {
    if (paramInt2 >= 8) {
      long l = Pack.bigEndianToLong(paramArrayOfbyte1, paramInt1);
      this.x0 ^= l;
      Pack.longToBigEndian(this.x0, paramArrayOfbyte2, paramInt3);
      this.x0 = l;
      paramInt1 += 8;
      paramInt3 += 8;
      paramInt2 -= 8;
      this.x1 ^= PAD(paramInt2);
      if (paramInt2 != 0) {
        long l1 = Pack.littleEndianToLong_High(paramArrayOfbyte1, paramInt1, paramInt2);
        this.x1 ^= l1;
        Pack.longToLittleEndian_High(this.x1, paramArrayOfbyte2, paramInt3, paramInt2);
        this.x1 &= -1L >>> paramInt2 << 3;
        this.x1 ^= l1;
      } 
    } else {
      this.x0 ^= PAD(paramInt2);
      if (paramInt2 != 0) {
        long l = Pack.littleEndianToLong_High(paramArrayOfbyte1, paramInt1, paramInt2);
        this.x0 ^= l;
        Pack.longToLittleEndian_High(this.x0, paramArrayOfbyte2, paramInt3, paramInt2);
        this.x0 &= -1L >>> paramInt2 << 3;
        this.x0 ^= l;
      } 
    } 
    finishData(State.DecFinal);
  }
  
  private void processFinalEncrypt(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) {
    if (paramInt2 >= 8) {
      this.x0 ^= Pack.bigEndianToLong(paramArrayOfbyte1, paramInt1);
      Pack.longToBigEndian(this.x0, paramArrayOfbyte2, paramInt3);
      paramInt1 += 8;
      paramInt3 += 8;
      paramInt2 -= 8;
      this.x1 ^= PAD(paramInt2);
      if (paramInt2 != 0) {
        this.x1 ^= Pack.littleEndianToLong_High(paramArrayOfbyte1, paramInt1, paramInt2);
        Pack.longToLittleEndian_High(this.x1, paramArrayOfbyte2, paramInt3, paramInt2);
      } 
    } else {
      this.x0 ^= PAD(paramInt2);
      if (paramInt2 != 0) {
        this.x0 ^= Pack.littleEndianToLong_High(paramArrayOfbyte1, paramInt1, paramInt2);
        Pack.longToLittleEndian_High(this.x0, paramArrayOfbyte2, paramInt3, paramInt2);
      } 
    } 
    finishData(State.EncFinal);
  }
  
  private void finishData(State paramState) {
    switch (this.asconParameters) {
      case DecAad:
        this.x1 ^= this.K1;
        this.x2 ^= this.K2;
        break;
      case EncInit:
        this.x2 ^= this.K1;
        this.x3 ^= this.K2;
        break;
      case DecInit:
        this.x1 ^= this.K0 << 32L | this.K1 >> 32L;
        this.x2 ^= this.K1 << 32L | this.K2 >> 32L;
        this.x3 ^= this.K2 << 32L;
        break;
      default:
        throw new IllegalStateException();
    } 
    P(12);
    this.x3 ^= this.K1;
    this.x4 ^= this.K2;
    this.m_state = paramState;
  }
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) throws IllegalArgumentException {
    KeyParameter keyParameter;
    byte[] arrayOfByte1;
    if (paramCipherParameters instanceof AEADParameters) {
      AEADParameters aEADParameters = (AEADParameters)paramCipherParameters;
      keyParameter = aEADParameters.getKey();
      arrayOfByte1 = aEADParameters.getNonce();
      this.initialAssociatedText = aEADParameters.getAssociatedText();
      int i = aEADParameters.getMacSize();
      if (i != this.CRYPTO_ABYTES * 8)
        throw new IllegalArgumentException("Invalid value for MAC size: " + i); 
    } else if (paramCipherParameters instanceof ParametersWithIV) {
      ParametersWithIV parametersWithIV = (ParametersWithIV)paramCipherParameters;
      keyParameter = (KeyParameter)parametersWithIV.getParameters();
      arrayOfByte1 = parametersWithIV.getIV();
      this.initialAssociatedText = null;
    } else {
      throw new IllegalArgumentException("invalid parameters passed to Ascon");
    } 
    if (keyParameter == null)
      throw new IllegalArgumentException("Ascon Init parameters must include a key"); 
    if (arrayOfByte1 == null || arrayOfByte1.length != this.CRYPTO_ABYTES)
      throw new IllegalArgumentException(this.asconParameters + " requires exactly " + this.CRYPTO_ABYTES + " bytes of IV"); 
    byte[] arrayOfByte2 = keyParameter.getKey();
    if (arrayOfByte2.length != this.CRYPTO_KEYBYTES)
      throw new IllegalArgumentException(this.asconParameters + " key must be " + this.CRYPTO_KEYBYTES + " bytes long"); 
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties(getAlgorithmName(), 128, paramCipherParameters, Utils.getPurpose(paramBoolean)));
    this.N0 = Pack.bigEndianToLong(arrayOfByte1, 0);
    this.N1 = Pack.bigEndianToLong(arrayOfByte1, 8);
    if (this.CRYPTO_KEYBYTES == 16) {
      this.K1 = Pack.bigEndianToLong(arrayOfByte2, 0);
      this.K2 = Pack.bigEndianToLong(arrayOfByte2, 8);
    } else if (this.CRYPTO_KEYBYTES == 20) {
      this.K0 = Pack.bigEndianToInt(arrayOfByte2, 0);
      this.K1 = Pack.bigEndianToLong(arrayOfByte2, 4);
      this.K2 = Pack.bigEndianToLong(arrayOfByte2, 12);
    } else {
      throw new IllegalStateException();
    } 
    this.m_state = paramBoolean ? State.EncInit : State.DecInit;
    reset(true);
  }
  
  public String getAlgorithmName() {
    return this.algorithmName;
  }
  
  public String getAlgorithmVersion() {
    return "v1.2";
  }
  
  public void processAADByte(byte paramByte) {
    checkAAD();
    this.m_buf[this.m_bufPos] = paramByte;
    if (++this.m_bufPos == this.ASCON_AEAD_RATE)
      processBufferAAD(this.m_buf, 0); 
  }
  
  public void processAADBytes(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt1 + paramInt2 > paramArrayOfbyte.length)
      throw new DataLengthException("input buffer too short"); 
    if (paramInt2 <= 0)
      return; 
    checkAAD();
    if (this.m_bufPos > 0) {
      int i = this.ASCON_AEAD_RATE - this.m_bufPos;
      if (paramInt2 < i) {
        System.arraycopy(paramArrayOfbyte, paramInt1, this.m_buf, this.m_bufPos, paramInt2);
        this.m_bufPos += paramInt2;
        return;
      } 
      System.arraycopy(paramArrayOfbyte, paramInt1, this.m_buf, this.m_bufPos, i);
      paramInt1 += i;
      paramInt2 -= i;
      processBufferAAD(this.m_buf, 0);
    } 
    while (paramInt2 >= this.ASCON_AEAD_RATE) {
      processBufferAAD(paramArrayOfbyte, paramInt1);
      paramInt1 += this.ASCON_AEAD_RATE;
      paramInt2 -= this.ASCON_AEAD_RATE;
    } 
    System.arraycopy(paramArrayOfbyte, paramInt1, this.m_buf, 0, paramInt2);
    this.m_bufPos = paramInt2;
  }
  
  public int processByte(byte paramByte, byte[] paramArrayOfbyte, int paramInt) throws DataLengthException {
    return processBytes(new byte[] { paramByte }, 0, 1, paramArrayOfbyte, paramInt);
  }
  
  public int processBytes(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws DataLengthException {
    if (paramInt1 + paramInt2 > paramArrayOfbyte1.length)
      throw new DataLengthException("input buffer too short"); 
    boolean bool = checkData();
    int i = 0;
    if (bool) {
      if (this.m_bufPos > 0) {
        int j = this.ASCON_AEAD_RATE - this.m_bufPos;
        if (paramInt2 < j) {
          System.arraycopy(paramArrayOfbyte1, paramInt1, this.m_buf, this.m_bufPos, paramInt2);
          this.m_bufPos += paramInt2;
          return 0;
        } 
        System.arraycopy(paramArrayOfbyte1, paramInt1, this.m_buf, this.m_bufPos, j);
        paramInt1 += j;
        paramInt2 -= j;
        processBufferEncrypt(this.m_buf, 0, paramArrayOfbyte2, paramInt3);
        i = this.ASCON_AEAD_RATE;
      } 
      while (paramInt2 >= this.ASCON_AEAD_RATE) {
        processBufferEncrypt(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt3 + i);
        paramInt1 += this.ASCON_AEAD_RATE;
        paramInt2 -= this.ASCON_AEAD_RATE;
        i += this.ASCON_AEAD_RATE;
      } 
    } else {
      int j = this.m_bufferSizeDecrypt - this.m_bufPos;
      if (paramInt2 < j) {
        System.arraycopy(paramArrayOfbyte1, paramInt1, this.m_buf, this.m_bufPos, paramInt2);
        this.m_bufPos += paramInt2;
        return 0;
      } 
      while (this.m_bufPos >= this.ASCON_AEAD_RATE) {
        processBufferDecrypt(this.m_buf, 0, paramArrayOfbyte2, paramInt3 + i);
        this.m_bufPos -= this.ASCON_AEAD_RATE;
        System.arraycopy(this.m_buf, this.ASCON_AEAD_RATE, this.m_buf, 0, this.m_bufPos);
        i += this.ASCON_AEAD_RATE;
        j += this.ASCON_AEAD_RATE;
        if (paramInt2 < j) {
          System.arraycopy(paramArrayOfbyte1, paramInt1, this.m_buf, this.m_bufPos, paramInt2);
          this.m_bufPos += paramInt2;
          return i;
        } 
      } 
      j = this.ASCON_AEAD_RATE - this.m_bufPos;
      System.arraycopy(paramArrayOfbyte1, paramInt1, this.m_buf, this.m_bufPos, j);
      paramInt1 += j;
      paramInt2 -= j;
      processBufferDecrypt(this.m_buf, 0, paramArrayOfbyte2, paramInt3 + i);
      for (i += this.ASCON_AEAD_RATE; paramInt2 >= this.m_bufferSizeDecrypt; i += this.ASCON_AEAD_RATE) {
        processBufferDecrypt(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt3 + i);
        paramInt1 += this.ASCON_AEAD_RATE;
        paramInt2 -= this.ASCON_AEAD_RATE;
      } 
    } 
    System.arraycopy(paramArrayOfbyte1, paramInt1, this.m_buf, 0, paramInt2);
    this.m_bufPos = paramInt2;
    return i;
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) throws IllegalStateException, InvalidCipherTextException, DataLengthException {
    int i;
    boolean bool = checkData();
    if (bool) {
      i = this.m_bufPos + this.CRYPTO_ABYTES;
      if (paramInt + i > paramArrayOfbyte.length)
        throw new OutputLengthException("output buffer too short"); 
      processFinalEncrypt(this.m_buf, 0, this.m_bufPos, paramArrayOfbyte, paramInt);
      this.mac = new byte[this.CRYPTO_ABYTES];
      Pack.longToBigEndian(this.x3, this.mac, 0);
      Pack.longToBigEndian(this.x4, this.mac, 8);
      System.arraycopy(this.mac, 0, paramArrayOfbyte, paramInt + this.m_bufPos, this.CRYPTO_ABYTES);
      reset(false);
    } else {
      if (this.m_bufPos < this.CRYPTO_ABYTES)
        throw new InvalidCipherTextException("data too short"); 
      this.m_bufPos -= this.CRYPTO_ABYTES;
      i = this.m_bufPos;
      if (paramInt + i > paramArrayOfbyte.length)
        throw new OutputLengthException("output buffer too short"); 
      processFinalDecrypt(this.m_buf, 0, this.m_bufPos, paramArrayOfbyte, paramInt);
      this.x3 ^= Pack.bigEndianToLong(this.m_buf, this.m_bufPos);
      this.x4 ^= Pack.bigEndianToLong(this.m_buf, this.m_bufPos + 8);
      if ((this.x3 | this.x4) != 0L)
        throw new InvalidCipherTextException("mac check in " + getAlgorithmName() + " failed"); 
      reset(true);
    } 
    return i;
  }
  
  public byte[] getMac() {
    return this.mac;
  }
  
  public int getUpdateOutputSize(int paramInt) {
    int i = Math.max(0, paramInt);
    switch (this.m_state) {
      case DecInit:
      case DecAad:
        i = Math.max(0, i - this.CRYPTO_ABYTES);
        break;
      case DecData:
      case DecFinal:
        i = Math.max(0, i + this.m_bufPos - this.CRYPTO_ABYTES);
        break;
      case EncFinal:
      case EncData:
        i += this.m_bufPos;
        break;
    } 
    return i - i % this.ASCON_AEAD_RATE;
  }
  
  public int getOutputSize(int paramInt) {
    int i = Math.max(0, paramInt);
    switch (this.m_state) {
      case DecInit:
      case DecAad:
        return Math.max(0, i - this.CRYPTO_ABYTES);
      case DecData:
      case DecFinal:
        return Math.max(0, i + this.m_bufPos - this.CRYPTO_ABYTES);
      case EncFinal:
      case EncData:
        return i + this.m_bufPos + this.CRYPTO_ABYTES;
    } 
    return i + this.CRYPTO_ABYTES;
  }
  
  public void reset() {
    reset(true);
  }
  
  private void reset(boolean paramBoolean) {
    if (paramBoolean)
      this.mac = null; 
    Arrays.clear(this.m_buf);
    this.m_bufPos = 0;
    switch (this.m_state) {
      case DecInit:
      case EncInit:
        break;
      case DecAad:
      case DecData:
      case DecFinal:
        this.m_state = State.DecInit;
        break;
      case EncAad:
      case EncFinal:
      case EncData:
        this.m_state = State.EncFinal;
        return;
      default:
        throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
    } 
    ascon_aeadinit();
    if (this.initialAssociatedText != null)
      processAADBytes(this.initialAssociatedText, 0, this.initialAssociatedText.length); 
  }
  
  public int getKeyBytesSize() {
    return this.CRYPTO_KEYBYTES;
  }
  
  public int getIVBytesSize() {
    return this.CRYPTO_ABYTES;
  }
  
  public enum AsconParameters {
    ascon80pq, ascon128a, ascon128;
  }
  
  private enum State {
    Uninitialized, EncInit, EncAad, EncData, EncFinal, DecInit, DecAad, DecData, DecFinal;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\engines\AsconEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */