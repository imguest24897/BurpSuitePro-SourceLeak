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
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class XoodyakEngine implements AEADCipher {
  private boolean forEncryption;
  
  private byte[] state;
  
  private int phase;
  
  private MODE mode;
  
  private int Rabsorb;
  
  private final int f_bPrime = 48;
  
  private final int Rkout = 24;
  
  private byte[] K;
  
  private byte[] iv;
  
  private final int PhaseDown = 1;
  
  private final int PhaseUp = 2;
  
  private final int NLANES = 12;
  
  private final int NROWS = 3;
  
  private final int NCOLUMS = 4;
  
  private final int MAXROUNDS = 12;
  
  private final int TAGLEN = 16;
  
  final int Rkin = 44;
  
  private byte[] tag;
  
  private final int[] RC = new int[] { 
      88, 56, 960, 208, 288, 20, 96, 44, 896, 240, 
      416, 18 };
  
  private boolean aadFinished;
  
  private boolean encrypted;
  
  private boolean initialised = false;
  
  private final ByteArrayOutputStream aadData = new ByteArrayOutputStream();
  
  private final ByteArrayOutputStream message = new ByteArrayOutputStream();
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) throws IllegalArgumentException {
    this.forEncryption = paramBoolean;
    if (!(paramCipherParameters instanceof ParametersWithIV))
      throw new IllegalArgumentException("Xoodyak init parameters must include an IV"); 
    ParametersWithIV parametersWithIV = (ParametersWithIV)paramCipherParameters;
    this.iv = parametersWithIV.getIV();
    if (this.iv == null || this.iv.length != 16)
      throw new IllegalArgumentException("Xoodyak requires exactly 16 bytes of IV"); 
    if (!(parametersWithIV.getParameters() instanceof KeyParameter))
      throw new IllegalArgumentException("Xoodyak init parameters must include a key"); 
    KeyParameter keyParameter = (KeyParameter)parametersWithIV.getParameters();
    this.K = keyParameter.getKey();
    if (this.K.length != 16)
      throw new IllegalArgumentException("Xoodyak key must be 128 bits long"); 
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties(getAlgorithmName(), 128, paramCipherParameters, Utils.getPurpose(paramBoolean)));
    this.state = new byte[48];
    this.tag = new byte[16];
    this.initialised = true;
    reset();
  }
  
  public String getAlgorithmName() {
    return "Xoodyak AEAD";
  }
  
  public void processAADByte(byte paramByte) {
    if (this.aadFinished)
      throw new IllegalArgumentException("AAD cannot be added after reading a full block(" + getBlockSize() + " bytes) of input for " + (this.forEncryption ? "encryption" : "decryption")); 
    this.aadData.write(paramByte);
  }
  
  public void processAADBytes(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.aadFinished)
      throw new IllegalArgumentException("AAD cannot be added after reading a full block(" + getBlockSize() + " bytes) of input for " + (this.forEncryption ? "encryption" : "decryption")); 
    if (paramInt1 + paramInt2 > paramArrayOfbyte.length)
      throw new DataLengthException("input buffer too short"); 
    this.aadData.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public int processByte(byte paramByte, byte[] paramArrayOfbyte, int paramInt) throws DataLengthException {
    return processBytes(new byte[] { paramByte }, 0, 1, paramArrayOfbyte, paramInt);
  }
  
  private void processAAD() {
    if (!this.aadFinished) {
      byte[] arrayOfByte = this.aadData.toByteArray();
      AbsorbAny(arrayOfByte, 0, arrayOfByte.length, this.Rabsorb, 3);
      this.aadFinished = true;
    } 
  }
  
  public int processBytes(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws DataLengthException {
    if (!this.initialised)
      throw new IllegalArgumentException("Need call init function before encryption/decryption"); 
    if (this.mode != MODE.ModeKeyed)
      throw new IllegalArgumentException("Xoodyak has not been initialised"); 
    if (paramInt1 + paramInt2 > paramArrayOfbyte1.length)
      throw new DataLengthException("input buffer too short"); 
    this.message.write(paramArrayOfbyte1, paramInt1, paramInt2);
    int i = this.message.size() - (this.forEncryption ? 0 : 16);
    if (i >= getBlockSize()) {
      byte[] arrayOfByte = this.message.toByteArray();
      paramInt2 = i / getBlockSize() * getBlockSize();
      if (paramInt2 + paramInt3 > paramArrayOfbyte2.length)
        throw new OutputLengthException("output buffer is too short"); 
      processAAD();
      encrypt(arrayOfByte, 0, paramInt2, paramArrayOfbyte2, paramInt3);
      this.message.reset();
      this.message.write(arrayOfByte, paramInt2, arrayOfByte.length - paramInt2);
      return paramInt2;
    } 
    return 0;
  }
  
  private int encrypt(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) {
    int i = paramInt2;
    byte[] arrayOfByte = new byte[24];
    boolean bool = this.encrypted ? false : true;
    while (true) {
      if (i != 0 || !this.encrypted) {
        int j = Math.min(i, 24);
        if (this.forEncryption)
          System.arraycopy(paramArrayOfbyte1, paramInt1, arrayOfByte, 0, j); 
        Up(null, 0, bool);
        for (byte b = 0; b < j; b++)
          paramArrayOfbyte2[paramInt3 + b] = (byte)(paramArrayOfbyte1[paramInt1++] ^ this.state[b]); 
        if (this.forEncryption) {
          Down(arrayOfByte, 0, j, 0);
        } else {
          Down(paramArrayOfbyte2, paramInt3, j, 0);
        } 
        bool = false;
        paramInt3 += j;
        i -= j;
        this.encrypted = true;
        continue;
      } 
      return paramInt2;
    } 
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) throws IllegalStateException, InvalidCipherTextException {
    if (!this.initialised)
      throw new IllegalArgumentException("Need call init function before encryption/decryption"); 
    byte[] arrayOfByte = this.message.toByteArray();
    int i = this.message.size();
    if ((this.forEncryption && i + 16 + paramInt > paramArrayOfbyte.length) || (!this.forEncryption && i - 16 + paramInt > paramArrayOfbyte.length))
      throw new OutputLengthException("output buffer too short"); 
    processAAD();
    int j = 0;
    if (this.forEncryption) {
      encrypt(arrayOfByte, 0, i, paramArrayOfbyte, paramInt);
      paramInt += i;
      this.tag = new byte[16];
      Up(this.tag, 16, 64);
      System.arraycopy(this.tag, 0, paramArrayOfbyte, paramInt, 16);
      j = i + 16;
    } else {
      int k = i - 16;
      j = k;
      encrypt(arrayOfByte, 0, k, paramArrayOfbyte, paramInt);
      this.tag = new byte[16];
      Up(this.tag, 16, 64);
      for (byte b = 0; b < 16; b++) {
        if (this.tag[b] != arrayOfByte[k++])
          throw new IllegalArgumentException("Mac does not match"); 
      } 
    } 
    reset(false);
    return j;
  }
  
  public byte[] getMac() {
    return this.tag;
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
    reset(true);
  }
  
  private void reset(boolean paramBoolean) {
    if (paramBoolean)
      this.tag = null; 
    Arrays.fill(this.state, (byte)0);
    this.aadFinished = false;
    this.encrypted = false;
    this.phase = 2;
    this.message.reset();
    this.aadData.reset();
    int i = this.K.length;
    int j = this.iv.length;
    byte[] arrayOfByte = new byte[44];
    this.mode = MODE.ModeKeyed;
    this.Rabsorb = 44;
    System.arraycopy(this.K, 0, arrayOfByte, 0, i);
    System.arraycopy(this.iv, 0, arrayOfByte, i, j);
    arrayOfByte[i + j] = (byte)j;
    AbsorbAny(arrayOfByte, 0, i + j + 1, this.Rabsorb, 2);
  }
  
  private void AbsorbAny(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    do {
      if (this.phase != 2)
        Up(null, 0, 0); 
      int i = Math.min(paramInt2, paramInt3);
      Down(paramArrayOfbyte, paramInt1, i, paramInt4);
      paramInt4 = 0;
      paramInt1 += i;
      paramInt2 -= i;
    } while (paramInt2 != 0);
  }
  
  private void Up(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.mode != MODE.ModeHash)
      this.state[47] = (byte)(this.state[47] ^ paramInt2); 
    int[] arrayOfInt1 = new int[12];
    Pack.littleEndianToInt(this.state, 0, arrayOfInt1, 0, arrayOfInt1.length);
    int[] arrayOfInt2 = new int[12];
    int[] arrayOfInt3 = new int[4];
    int[] arrayOfInt4 = new int[4];
    for (byte b = 0; b < 12; b++) {
      byte b1;
      for (b1 = 0; b1 < 4; b1++)
        arrayOfInt3[b1] = arrayOfInt1[index(b1, 0)] ^ arrayOfInt1[index(b1, 1)] ^ arrayOfInt1[index(b1, 2)]; 
      for (b1 = 0; b1 < 4; b1++) {
        int i = arrayOfInt3[b1 + 3 & 0x3];
        arrayOfInt4[b1] = ROTL32(i, 5) ^ ROTL32(i, 14);
      } 
      for (b1 = 0; b1 < 4; b1++) {
        for (byte b2 = 0; b2 < 3; b2++)
          arrayOfInt1[index(b1, b2)] = arrayOfInt1[index(b1, b2)] ^ arrayOfInt4[b1]; 
      } 
      for (b1 = 0; b1 < 4; b1++) {
        arrayOfInt2[index(b1, 0)] = arrayOfInt1[index(b1, 0)];
        arrayOfInt2[index(b1, 1)] = arrayOfInt1[index(b1 + 3, 1)];
        arrayOfInt2[index(b1, 2)] = ROTL32(arrayOfInt1[index(b1, 2)], 11);
      } 
      arrayOfInt2[0] = arrayOfInt2[0] ^ this.RC[b];
      for (b1 = 0; b1 < 4; b1++) {
        for (byte b2 = 0; b2 < 3; b2++)
          arrayOfInt1[index(b1, b2)] = arrayOfInt2[index(b1, b2)] ^ (arrayOfInt2[index(b1, b2 + 1)] ^ 0xFFFFFFFF) & arrayOfInt2[index(b1, b2 + 2)]; 
      } 
      for (b1 = 0; b1 < 4; b1++) {
        arrayOfInt2[index(b1, 0)] = arrayOfInt1[index(b1, 0)];
        arrayOfInt2[index(b1, 1)] = ROTL32(arrayOfInt1[index(b1, 1)], 1);
        arrayOfInt2[index(b1, 2)] = ROTL32(arrayOfInt1[index(b1 + 2, 2)], 8);
      } 
      System.arraycopy(arrayOfInt2, 0, arrayOfInt1, 0, 12);
    } 
    Pack.intToLittleEndian(arrayOfInt1, 0, arrayOfInt1.length, this.state, 0);
    this.phase = 2;
    if (paramArrayOfbyte != null)
      System.arraycopy(this.state, 0, paramArrayOfbyte, 0, paramInt1); 
  }
  
  void Down(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    for (byte b = 0; b < paramInt2; b++)
      this.state[b] = (byte)(this.state[b] ^ paramArrayOfbyte[paramInt1++]); 
    this.state[paramInt2] = (byte)(this.state[paramInt2] ^ 0x1);
    this.state[47] = (byte)(this.state[47] ^ ((this.mode == MODE.ModeHash) ? (paramInt3 & 0x1) : paramInt3));
    this.phase = 1;
  }
  
  private int index(int paramInt1, int paramInt2) {
    return paramInt2 % 3 * 4 + paramInt1 % 4;
  }
  
  private int ROTL32(int paramInt1, int paramInt2) {
    return paramInt1 << (paramInt2 & 0x1F) ^ paramInt1 >>> (32 - paramInt2 & 0x1F);
  }
  
  public int getBlockSize() {
    return 24;
  }
  
  public int getKeyBytesSize() {
    return 16;
  }
  
  public int getIVBytesSize() {
    return 16;
  }
  
  enum MODE {
    ModeHash, ModeKeyed;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\engines\XoodyakEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */