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

public class Grain128AEADEngine implements AEADCipher {
  private static final int STATE_SIZE = 4;
  
  private byte[] workingKey;
  
  private byte[] workingIV;
  
  private int[] lfsr;
  
  private int[] nfsr;
  
  private int[] authAcc;
  
  private int[] authSr;
  
  private boolean initialised = false;
  
  private boolean aadFinished = false;
  
  private ErasableOutputStream aadData = new ErasableOutputStream();
  
  private byte[] mac;
  
  public String getAlgorithmName() {
    return "Grain-128AEAD";
  }
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) throws IllegalArgumentException {
    if (!(paramCipherParameters instanceof ParametersWithIV))
      throw new IllegalArgumentException("Grain-128AEAD init parameters must include an IV"); 
    ParametersWithIV parametersWithIV = (ParametersWithIV)paramCipherParameters;
    byte[] arrayOfByte1 = parametersWithIV.getIV();
    if (arrayOfByte1 == null || arrayOfByte1.length != 12)
      throw new IllegalArgumentException("Grain-128AEAD requires exactly 12 bytes of IV"); 
    if (!(parametersWithIV.getParameters() instanceof KeyParameter))
      throw new IllegalArgumentException("Grain-128AEAD init parameters must include a key"); 
    KeyParameter keyParameter = (KeyParameter)parametersWithIV.getParameters();
    byte[] arrayOfByte2 = keyParameter.getKey();
    if (arrayOfByte2.length != 16)
      throw new IllegalArgumentException("Grain-128AEAD key must be 128 bits long"); 
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties(getAlgorithmName(), 128, paramCipherParameters, Utils.getPurpose(paramBoolean)));
    this.workingIV = new byte[16];
    this.workingKey = new byte[16];
    this.lfsr = new int[4];
    this.nfsr = new int[4];
    this.authAcc = new int[2];
    this.authSr = new int[2];
    System.arraycopy(arrayOfByte1, 0, this.workingIV, 0, arrayOfByte1.length);
    System.arraycopy(arrayOfByte2, 0, this.workingKey, 0, arrayOfByte2.length);
    reset();
  }
  
  private void initGrain() {
    byte b;
    for (b = 0; b < 'ŀ'; b++) {
      int i = getOutput();
      this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0] ^ i) & 0x1);
      this.lfsr = shift(this.lfsr, (getOutputLFSR() ^ i) & 0x1);
    } 
    for (b = 0; b < 8; b++) {
      for (byte b1 = 0; b1 < 8; b1++) {
        int i = getOutput();
        this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0] ^ i ^ this.workingKey[b] >> b1) & 0x1);
        this.lfsr = shift(this.lfsr, (getOutputLFSR() ^ i ^ this.workingKey[b + 8] >> b1) & 0x1);
      } 
    } 
    for (b = 0; b < 2; b++) {
      for (byte b1 = 0; b1 < 32; b1++) {
        int i = getOutput();
        this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 0x1);
        this.lfsr = shift(this.lfsr, getOutputLFSR() & 0x1);
        this.authAcc[b] = this.authAcc[b] | i << b1;
      } 
    } 
    for (b = 0; b < 2; b++) {
      for (byte b1 = 0; b1 < 32; b1++) {
        int i = getOutput();
        this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 0x1);
        this.lfsr = shift(this.lfsr, getOutputLFSR() & 0x1);
        this.authSr[b] = this.authSr[b] | i << b1;
      } 
    } 
    this.initialised = true;
  }
  
  private int getOutputNFSR() {
    int i = this.nfsr[0];
    int j = this.nfsr[0] >>> 3;
    int k = this.nfsr[0] >>> 11;
    int m = this.nfsr[0] >>> 13;
    int n = this.nfsr[0] >>> 17;
    int i1 = this.nfsr[0] >>> 18;
    int i2 = this.nfsr[0] >>> 22;
    int i3 = this.nfsr[0] >>> 24;
    int i4 = this.nfsr[0] >>> 25;
    int i5 = this.nfsr[0] >>> 26;
    int i6 = this.nfsr[0] >>> 27;
    int i7 = this.nfsr[1] >>> 8;
    int i8 = this.nfsr[1] >>> 16;
    int i9 = this.nfsr[1] >>> 24;
    int i10 = this.nfsr[1] >>> 27;
    int i11 = this.nfsr[1] >>> 29;
    int i12 = this.nfsr[2] >>> 1;
    int i13 = this.nfsr[2] >>> 3;
    int i14 = this.nfsr[2] >>> 4;
    int i15 = this.nfsr[2] >>> 6;
    int i16 = this.nfsr[2] >>> 14;
    int i17 = this.nfsr[2] >>> 18;
    int i18 = this.nfsr[2] >>> 20;
    int i19 = this.nfsr[2] >>> 24;
    int i20 = this.nfsr[2] >>> 27;
    int i21 = this.nfsr[2] >>> 28;
    int i22 = this.nfsr[2] >>> 29;
    int i23 = this.nfsr[2] >>> 31;
    int i24 = this.nfsr[3];
    return (i ^ i5 ^ i9 ^ i20 ^ i24 ^ j & i13 ^ k & m ^ n & i1 ^ i6 & i10 ^ i7 & i8 ^ i11 & i12 ^ i14 & i18 ^ i2 & i3 & i4 ^ i15 & i16 & i17 ^ i19 & i21 & i22 & i23) & 0x1;
  }
  
  private int getOutputLFSR() {
    int i = this.lfsr[0];
    int j = this.lfsr[0] >>> 7;
    int k = this.lfsr[1] >>> 6;
    int m = this.lfsr[2] >>> 6;
    int n = this.lfsr[2] >>> 17;
    int i1 = this.lfsr[3];
    return (i ^ j ^ k ^ m ^ n ^ i1) & 0x1;
  }
  
  private int getOutput() {
    int i = this.nfsr[0] >>> 2;
    int j = this.nfsr[0] >>> 12;
    int k = this.nfsr[0] >>> 15;
    int m = this.nfsr[1] >>> 4;
    int n = this.nfsr[1] >>> 13;
    int i1 = this.nfsr[2];
    int i2 = this.nfsr[2] >>> 9;
    int i3 = this.nfsr[2] >>> 25;
    int i4 = this.nfsr[2] >>> 31;
    int i5 = this.lfsr[0] >>> 8;
    int i6 = this.lfsr[0] >>> 13;
    int i7 = this.lfsr[0] >>> 20;
    int i8 = this.lfsr[1] >>> 10;
    int i9 = this.lfsr[1] >>> 28;
    int i10 = this.lfsr[2] >>> 15;
    int i11 = this.lfsr[2] >>> 29;
    int i12 = this.lfsr[2] >>> 30;
    return (j & i5 ^ i6 & i7 ^ i4 & i8 ^ i9 & i10 ^ j & i4 & i12 ^ i11 ^ i ^ k ^ m ^ n ^ i1 ^ i2 ^ i3) & 0x1;
  }
  
  private int[] shift(int[] paramArrayOfint, int paramInt) {
    paramArrayOfint[0] = paramArrayOfint[0] >>> 1 | paramArrayOfint[1] << 31;
    paramArrayOfint[1] = paramArrayOfint[1] >>> 1 | paramArrayOfint[2] << 31;
    paramArrayOfint[2] = paramArrayOfint[2] >>> 1 | paramArrayOfint[3] << 31;
    paramArrayOfint[3] = paramArrayOfint[3] >>> 1 | paramInt << 31;
    return paramArrayOfint;
  }
  
  private void setKey(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    paramArrayOfbyte2[12] = -1;
    paramArrayOfbyte2[13] = -1;
    paramArrayOfbyte2[14] = -1;
    paramArrayOfbyte2[15] = Byte.MAX_VALUE;
    this.workingKey = paramArrayOfbyte1;
    this.workingIV = paramArrayOfbyte2;
    Pack.littleEndianToInt(this.workingKey, 0, this.nfsr);
    Pack.littleEndianToInt(this.workingIV, 0, this.lfsr);
  }
  
  public int processBytes(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws DataLengthException {
    if (!this.initialised)
      throw new IllegalStateException(getAlgorithmName() + " not initialised"); 
    if (!this.aadFinished) {
      doProcessAADBytes(this.aadData.getBuf(), 0, this.aadData.size());
      this.aadFinished = true;
    } 
    if (paramInt1 + paramInt2 > paramArrayOfbyte1.length)
      throw new DataLengthException("input buffer too short"); 
    if (paramInt3 + paramInt2 > paramArrayOfbyte2.length)
      throw new OutputLengthException("output buffer too short"); 
    getKeyStream(paramArrayOfbyte1, paramInt1, paramInt2, paramArrayOfbyte2, paramInt3);
    return paramInt2;
  }
  
  public void reset() {
    reset(true);
  }
  
  private void reset(boolean paramBoolean) {
    if (paramBoolean)
      this.mac = null; 
    this.aadData.reset();
    this.aadFinished = false;
    setKey(this.workingKey, this.workingIV);
    initGrain();
  }
  
  private byte[] getKeyStream(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) {
    for (byte b = 0; b < paramInt2; b++) {
      byte b1 = 0;
      byte b2 = paramArrayOfbyte1[paramInt1 + b];
      for (byte b3 = 0; b3 < 8; b3++) {
        int i = getOutput();
        this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 0x1);
        this.lfsr = shift(this.lfsr, getOutputLFSR() & 0x1);
        int j = b2 >> b3 & 0x1;
        b1 = (byte)(b1 | (j ^ i) << b3);
        int k = -j;
        this.authAcc[0] = this.authAcc[0] ^ this.authSr[0] & k;
        this.authAcc[1] = this.authAcc[1] ^ this.authSr[1] & k;
        authShift(getOutput());
        this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 0x1);
        this.lfsr = shift(this.lfsr, getOutputLFSR() & 0x1);
      } 
      paramArrayOfbyte2[paramInt3 + b] = b1;
    } 
    return paramArrayOfbyte2;
  }
  
  public void processAADByte(byte paramByte) {
    if (this.aadFinished)
      throw new IllegalStateException("associated data must be added before plaintext/ciphertext"); 
    this.aadData.write(paramByte);
  }
  
  public void processAADBytes(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.aadFinished)
      throw new IllegalStateException("associated data must be added before plaintext/ciphertext"); 
    this.aadData.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  private void doProcessAADBytes(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[] arrayOfByte;
    int i;
    if (paramInt2 < 128) {
      arrayOfByte = new byte[1 + paramInt2];
      arrayOfByte[0] = (byte)paramInt2;
      i = 0;
    } else {
      i = len_length(paramInt2);
      arrayOfByte = new byte[1 + i + paramInt2];
      arrayOfByte[0] = (byte)(0x80 | i);
      int j = paramInt2;
      for (byte b1 = 0; b1 < i; b1++) {
        arrayOfByte[1 + b1] = (byte)j;
        j >>>= 8;
      } 
    } 
    byte b;
    for (b = 0; b < paramInt2; b++)
      arrayOfByte[1 + i + b] = paramArrayOfbyte[paramInt1 + b]; 
    for (b = 0; b < arrayOfByte.length; b++) {
      byte b1 = arrayOfByte[b];
      for (byte b2 = 0; b2 < 8; b2++) {
        this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 0x1);
        this.lfsr = shift(this.lfsr, getOutputLFSR() & 0x1);
        int j = b1 >> b2 & 0x1;
        int k = -j;
        this.authAcc[0] = this.authAcc[0] ^ this.authSr[0] & k;
        this.authAcc[1] = this.authAcc[1] ^ this.authSr[1] & k;
        authShift(getOutput());
        this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 0x1);
        this.lfsr = shift(this.lfsr, getOutputLFSR() & 0x1);
      } 
    } 
  }
  
  private void accumulate() {
    this.authAcc[0] = this.authAcc[0] ^ this.authSr[0];
    this.authAcc[1] = this.authAcc[1] ^ this.authSr[1];
  }
  
  private void authShift(int paramInt) {
    this.authSr[0] = this.authSr[0] >>> 1 | this.authSr[1] << 31;
    this.authSr[1] = this.authSr[1] >>> 1 | paramInt << 31;
  }
  
  public int processByte(byte paramByte, byte[] paramArrayOfbyte, int paramInt) throws DataLengthException {
    return processBytes(new byte[] { paramByte }, 0, 1, paramArrayOfbyte, paramInt);
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) throws IllegalStateException, InvalidCipherTextException {
    if (!this.aadFinished) {
      doProcessAADBytes(this.aadData.getBuf(), 0, this.aadData.size());
      this.aadFinished = true;
    } 
    accumulate();
    this.mac = Pack.intToLittleEndian(this.authAcc);
    System.arraycopy(this.mac, 0, paramArrayOfbyte, paramInt, this.mac.length);
    reset(false);
    return this.mac.length;
  }
  
  public byte[] getMac() {
    return this.mac;
  }
  
  public int getUpdateOutputSize(int paramInt) {
    return paramInt;
  }
  
  public int getOutputSize(int paramInt) {
    return paramInt + 8;
  }
  
  private static int len_length(int paramInt) {
    return ((paramInt & 0xFF) == paramInt) ? 1 : (((paramInt & 0xFFFF) == paramInt) ? 2 : (((paramInt & 0xFFFFFF) == paramInt) ? 3 : 4));
  }
  
  private static final class ErasableOutputStream extends ByteArrayOutputStream {
    public byte[] getBuf() {
      return this.buf;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\engines\Grain128AEADEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */