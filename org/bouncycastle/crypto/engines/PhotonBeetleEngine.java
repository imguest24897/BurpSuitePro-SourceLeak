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

public class PhotonBeetleEngine implements AEADCipher {
  private boolean input_empty;
  
  private boolean forEncryption;
  
  private byte[] K;
  
  private byte[] N;
  
  private byte[] state;
  
  private byte[][] state_2d;
  
  private byte[] A;
  
  private byte[] T;
  
  private boolean encrypted;
  
  private boolean initialised;
  
  private final ByteArrayOutputStream aadData = new ByteArrayOutputStream();
  
  private final ByteArrayOutputStream message = new ByteArrayOutputStream();
  
  private final int CRYPTO_KEYBYTES = 16;
  
  private final int CRYPTO_NPUBBYTES = 16;
  
  private final int RATE_INBYTES;
  
  private final int RATE_INBYTES_HALF;
  
  private final int STATE_INBYTES;
  
  private final int TAG_INBYTES = 16;
  
  private final int LAST_THREE_BITS_OFFSET;
  
  private final int ROUND = 12;
  
  private final int D = 8;
  
  private final int Dq = 3;
  
  private final int Dr = 7;
  
  private final int DSquare = 64;
  
  private final int S = 4;
  
  private final int S_1 = 3;
  
  private final byte[][] RC = new byte[][] { { 
        1, 3, 7, 14, 13, 11, 6, 12, 9, 2, 
        5, 10 }, { 
        0, 2, 6, 15, 12, 10, 7, 13, 8, 3, 
        4, 11 }, { 
        2, 0, 4, 13, 14, 8, 5, 15, 10, 1, 
        6, 9 }, { 
        6, 4, 0, 9, 10, 12, 1, 11, 14, 5, 
        2, 13 }, { 
        14, 12, 8, 1, 2, 4, 9, 3, 6, 13, 
        10, 5 }, { 
        15, 13, 9, 0, 3, 5, 8, 2, 7, 12, 
        11, 4 }, { 
        13, 15, 11, 2, 1, 7, 10, 0, 5, 14, 
        9, 6 }, { 
        9, 11, 15, 6, 5, 3, 14, 4, 1, 10, 
        13, 2 } };
  
  private final byte[][] MixColMatrix = new byte[][] { { 2, 4, 2, 11, 2, 8, 5, 6 }, { 12, 9, 8, 13, 7, 7, 5, 2 }, { 4, 4, 13, 13, 9, 4, 13, 9 }, { 1, 6, 5, 1, 12, 13, 15, 14 }, { 15, 12, 9, 13, 14, 5, 14, 13 }, { 9, 14, 5, 15, 4, 12, 9, 6 }, { 12, 2, 2, 10, 3, 1, 1, 14 }, { 15, 1, 13, 10, 5, 10, 2, 3 } };
  
  private final byte[] sbox = new byte[] { 
      12, 5, 6, 11, 9, 0, 10, 13, 3, 14, 
      15, 8, 4, 7, 1, 2 };
  
  public PhotonBeetleEngine(PhotonBeetleParameters paramPhotonBeetleParameters) {
    char c1 = Character.MIN_VALUE;
    char c2 = Character.MIN_VALUE;
    switch (paramPhotonBeetleParameters) {
      case pb32:
        c2 = ' ';
        c1 = 'à';
        break;
      case pb128:
        c2 = '';
        c1 = '';
        break;
    } 
    this.RATE_INBYTES = c2 + 7 >>> 3;
    this.RATE_INBYTES_HALF = this.RATE_INBYTES >>> 1;
    int i = c2 + c1;
    this.STATE_INBYTES = i + 7 >>> 3;
    this.LAST_THREE_BITS_OFFSET = i - (this.STATE_INBYTES - 1 << 3) - 3;
    this.initialised = false;
  }
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) throws IllegalArgumentException {
    this.forEncryption = paramBoolean;
    if (!(paramCipherParameters instanceof ParametersWithIV))
      throw new IllegalArgumentException("Photon-Beetle AEAD init parameters must include an IV"); 
    ParametersWithIV parametersWithIV = (ParametersWithIV)paramCipherParameters;
    this.N = parametersWithIV.getIV();
    if (this.N == null || this.N.length != 16)
      throw new IllegalArgumentException("Photon-Beetle AEAD requires exactly 16 bytes of IV"); 
    if (!(parametersWithIV.getParameters() instanceof KeyParameter))
      throw new IllegalArgumentException("Photon-Beetle AEAD init parameters must include a key"); 
    KeyParameter keyParameter = (KeyParameter)parametersWithIV.getParameters();
    this.K = keyParameter.getKey();
    if (this.K.length != 16)
      throw new IllegalArgumentException("Photon-Beetle AEAD key must be 128 bits long"); 
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties(getAlgorithmName(), 128, paramCipherParameters, Utils.getPurpose(paramBoolean)));
    this.state = new byte[this.STATE_INBYTES];
    this.state_2d = new byte[8][8];
    this.T = new byte[16];
    this.initialised = true;
    reset(false);
  }
  
  public String getAlgorithmName() {
    return "Photon-Beetle AEAD";
  }
  
  public void processAADByte(byte paramByte) {
    this.aadData.write(paramByte);
  }
  
  public void processAADBytes(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt1 + paramInt2 > paramArrayOfbyte.length)
      throw new DataLengthException("input buffer too short"); 
    this.aadData.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public int processByte(byte paramByte, byte[] paramArrayOfbyte, int paramInt) throws DataLengthException {
    return processBytes(new byte[] { paramByte }, 0, 1, paramArrayOfbyte, paramInt);
  }
  
  public int processBytes(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws DataLengthException {
    if (paramInt1 + paramInt2 > paramArrayOfbyte1.length)
      throw new DataLengthException("input buffer too short"); 
    this.message.write(paramArrayOfbyte1, paramInt1, paramInt2);
    return 0;
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) throws IllegalStateException, InvalidCipherTextException {
    if (!this.initialised)
      throw new IllegalArgumentException("Need call init function before encryption/decryption"); 
    int i = this.message.size() - (this.forEncryption ? 0 : 16);
    if ((this.forEncryption && i + 16 + paramInt > paramArrayOfbyte.length) || (!this.forEncryption && i + paramInt > paramArrayOfbyte.length))
      throw new OutputLengthException("output buffer too short"); 
    byte[] arrayOfByte = this.message.toByteArray();
    byte b = 0;
    this.A = this.aadData.toByteArray();
    int j = this.A.length;
    if (j != 0 || i != 0)
      this.input_empty = false; 
    byte b1 = select((i != 0), (j % this.RATE_INBYTES == 0), (byte)3, (byte)4);
    byte b2 = select((j != 0), (i % this.RATE_INBYTES == 0), (byte)5, (byte)6);
    if (j != 0) {
      int k = (j + this.RATE_INBYTES - 1) / this.RATE_INBYTES;
      byte b3;
      for (b3 = 0; b3 < k - 1; b3++) {
        PHOTON_Permutation();
        XOR(this.A, b3 * this.RATE_INBYTES, this.RATE_INBYTES);
      } 
      PHOTON_Permutation();
      int m = j - b3 * this.RATE_INBYTES;
      XOR(this.A, b3 * this.RATE_INBYTES, m);
      if (m < this.RATE_INBYTES)
        this.state[m] = (byte)(this.state[m] ^ 0x1); 
      this.state[this.STATE_INBYTES - 1] = (byte)(this.state[this.STATE_INBYTES - 1] ^ b1 << this.LAST_THREE_BITS_OFFSET);
    } 
    if (i != 0) {
      int k = (i + this.RATE_INBYTES - 1) / this.RATE_INBYTES;
      byte b3;
      for (b3 = 0; b3 < k - 1; b3++) {
        PHOTON_Permutation();
        rhoohr(paramArrayOfbyte, paramInt + b3 * this.RATE_INBYTES, arrayOfByte, b + b3 * this.RATE_INBYTES, this.RATE_INBYTES);
      } 
      PHOTON_Permutation();
      int m = i - b3 * this.RATE_INBYTES;
      rhoohr(paramArrayOfbyte, paramInt + b3 * this.RATE_INBYTES, arrayOfByte, b + b3 * this.RATE_INBYTES, m);
      if (m < this.RATE_INBYTES)
        this.state[m] = (byte)(this.state[m] ^ 0x1); 
      this.state[this.STATE_INBYTES - 1] = (byte)(this.state[this.STATE_INBYTES - 1] ^ b2 << this.LAST_THREE_BITS_OFFSET);
    } 
    paramInt += i;
    if (this.input_empty)
      this.state[this.STATE_INBYTES - 1] = (byte)(this.state[this.STATE_INBYTES - 1] ^ 1 << this.LAST_THREE_BITS_OFFSET); 
    PHOTON_Permutation();
    this.T = new byte[16];
    System.arraycopy(this.state, 0, this.T, 0, 16);
    if (this.forEncryption) {
      System.arraycopy(this.T, 0, paramArrayOfbyte, paramInt, 16);
      i += 16;
    } else {
      for (byte b3 = 0; b3 < 16; b3++) {
        if (this.T[b3] != arrayOfByte[i + b3])
          throw new IllegalArgumentException("Mac does not match"); 
      } 
    } 
    reset(false);
    return i;
  }
  
  public byte[] getMac() {
    return this.T;
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
      this.T = null; 
    this.input_empty = true;
    this.aadData.reset();
    this.message.reset();
    System.arraycopy(this.K, 0, this.state, 0, this.K.length);
    System.arraycopy(this.N, 0, this.state, this.K.length, this.N.length);
    this.encrypted = false;
  }
  
  private void PHOTON_Permutation() {
    byte b1;
    for (b1 = 0; b1 < 64; b1++)
      this.state_2d[b1 >>> 3][b1 & 0x7] = (byte)((this.state[b1 >> 1] & 0xFF) >>> 4 * (b1 & 0x1) & 0xF); 
    for (byte b2 = 0; b2 < 12; b2++) {
      for (b1 = 0; b1 < 8; b1++)
        this.state_2d[b1][0] = (byte)(this.state_2d[b1][0] ^ this.RC[b1][b2]); 
      for (b1 = 0; b1 < 8; b1++) {
        for (byte b3 = 0; b3 < 8; b3++)
          this.state_2d[b1][b3] = this.sbox[this.state_2d[b1][b3]]; 
      } 
      for (b1 = 1; b1 < 8; b1++) {
        System.arraycopy(this.state_2d[b1], 0, this.state, 0, 8);
        System.arraycopy(this.state, b1, this.state_2d[b1], 0, 8 - b1);
        System.arraycopy(this.state, 0, this.state_2d[b1], 8 - b1, b1);
      } 
      for (byte b = 0; b < 8; b++) {
        for (b1 = 0; b1 < 8; b1++) {
          byte b4 = 0;
          for (byte b3 = 0; b3 < 8; b3++) {
            byte b6 = this.MixColMatrix[b1][b3];
            int i = 0;
            byte b7 = this.state_2d[b3][b];
            for (byte b5 = 0; b5 < 4; b5++) {
              int j;
              if ((b7 >>> b5 & 0x1) != 0)
                i ^= b6; 
              if ((b6 >>> 3 & 0x1) != 0) {
                j = b6 << 1;
                j ^= 0x3;
              } else {
                j <<= 1;
              } 
            } 
            b4 = (byte)(b4 ^ i & 0xF);
          } 
          this.state[b1] = b4;
        } 
        for (b1 = 0; b1 < 8; b1++)
          this.state_2d[b1][b] = this.state[b1]; 
      } 
    } 
    for (b1 = 0; b1 < 64; b1 += 2)
      this.state[b1 >>> 1] = (byte)(this.state_2d[b1 >>> 3][b1 & 0x7] & 0xF | (this.state_2d[b1 >>> 3][b1 + 1 & 0x7] & 0xF) << 4); 
  }
  
  private byte select(boolean paramBoolean1, boolean paramBoolean2, byte paramByte1, byte paramByte2) {
    return (paramBoolean1 && paramBoolean2) ? 1 : (paramBoolean1 ? 2 : (paramBoolean2 ? paramByte1 : paramByte2));
  }
  
  private void rhoohr(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, int paramInt3) {
    byte[] arrayOfByte = this.state_2d[0];
    int i = Math.min(paramInt3, this.RATE_INBYTES_HALF);
    byte b;
    for (b = 0; b < this.RATE_INBYTES_HALF - 1; b++)
      arrayOfByte[b] = (byte)((this.state[b] & 0xFF) >>> 1 | (this.state[b + 1] & 0x1) << 7); 
    arrayOfByte[this.RATE_INBYTES_HALF - 1] = (byte)((this.state[b] & 0xFF) >>> 1 | (this.state[0] & 0x1) << 7);
    b = 0;
    while (b < i)
      paramArrayOfbyte1[b + paramInt1] = (byte)(this.state[b + this.RATE_INBYTES_HALF] ^ paramArrayOfbyte2[b++ + paramInt2]); 
    while (b < paramInt3)
      paramArrayOfbyte1[b + paramInt1] = (byte)(arrayOfByte[b - this.RATE_INBYTES_HALF] ^ paramArrayOfbyte2[b++ + paramInt2]); 
    if (this.forEncryption) {
      XOR(paramArrayOfbyte2, paramInt2, paramInt3);
    } else {
      XOR(paramArrayOfbyte1, paramInt2, paramInt3);
    } 
  }
  
  private void XOR(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    for (byte b = 0; b < paramInt2; b++)
      this.state[b] = (byte)(this.state[b] ^ paramArrayOfbyte[paramInt1++]); 
  }
  
  public int getBlockSize() {
    return this.RATE_INBYTES;
  }
  
  public int getKeyBytesSize() {
    return 16;
  }
  
  public int getIVBytesSize() {
    return 16;
  }
  
  public enum PhotonBeetleParameters {
    pb32, pb128;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\engines\PhotonBeetleEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */