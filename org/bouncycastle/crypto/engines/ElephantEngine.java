package org.bouncycastle.crypto.engines;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
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

public class ElephantEngine implements AEADCipher {
  private boolean forEncryption;
  
  private final String algorithmName;
  
  private final ElephantParameters parameters;
  
  private final int BLOCK_SIZE;
  
  private int nBits;
  
  private int nSBox;
  
  private final int nRounds;
  
  private byte lfsrIV;
  
  private byte[] tag;
  
  private byte[] npub;
  
  private byte[] expanded_key;
  
  private final byte CRYPTO_KEYBYTES = 16;
  
  private final byte CRYPTO_NPUBBYTES = 12;
  
  private final byte CRYPTO_ABYTES;
  
  private boolean initialised;
  
  private int nb_its;
  
  private byte[] ad;
  
  private int adOff;
  
  private int adlen;
  
  private final byte[] tag_buffer;
  
  private byte[] previous_mask;
  
  private byte[] current_mask;
  
  private byte[] next_mask;
  
  private final byte[] buffer;
  
  private State m_state = State.Uninitialized;
  
  private final ByteArrayOutputStream aadData = new ByteArrayOutputStream();
  
  private int inputOff;
  
  private byte[] inputMessage;
  
  private final byte[] previous_outputMessage;
  
  private final byte[] outputMessage;
  
  private final byte[] sBoxLayer = new byte[] { 
      -18, -19, -21, -32, -30, -31, -28, -17, -25, -22, 
      -24, -27, -23, -20, -29, -26, -34, -35, -37, -48, 
      -46, -47, -44, -33, -41, -38, -40, -43, -39, -36, 
      -45, -42, -66, -67, -69, -80, -78, -79, -76, -65, 
      -73, -70, -72, -75, -71, -68, -77, -74, 14, 13, 
      11, 0, 2, 1, 4, 15, 7, 10, 8, 5, 
      9, 12, 3, 6, 46, 45, 43, 32, 34, 33, 
      36, 47, 39, 42, 40, 37, 41, 44, 35, 38, 
      30, 29, 27, 16, 18, 17, 20, 31, 23, 26, 
      24, 21, 25, 28, 19, 22, 78, 77, 75, 64, 
      66, 65, 68, 79, 71, 74, 72, 69, 73, 76, 
      67, 70, -2, -3, -5, -16, -14, -15, -12, -1, 
      -9, -6, -8, -11, -7, -4, -13, -10, 126, 125, 
      123, 112, 114, 113, 116, Byte.MAX_VALUE, 119, 122, 120, 117, 
      121, 124, 115, 118, -82, -83, -85, -96, -94, -95, 
      -92, -81, -89, -86, -88, -91, -87, -84, -93, -90, 
      -114, -115, -117, Byte.MIN_VALUE, -126, -127, -124, -113, -121, -118, 
      -120, -123, -119, -116, -125, -122, 94, 93, 91, 80, 
      82, 81, 84, 95, 87, 90, 88, 85, 89, 92, 
      83, 86, -98, -99, -101, -112, -110, -111, -108, -97, 
      -105, -102, -104, -107, -103, -100, -109, -106, -50, -51, 
      -53, -64, -62, -63, -60, -49, -57, -54, -56, -59, 
      -55, -52, -61, -58, 62, 61, 59, 48, 50, 49, 
      52, 63, 55, 58, 56, 53, 57, 60, 51, 54, 
      110, 109, 107, 96, 98, 97, 100, 111, 103, 106, 
      104, 101, 105, 108, 99, 102 };
  
  private final byte[] KeccakRoundConstants = new byte[] { 
      1, -126, -118, 0, -117, 1, -127, 9, -118, -120, 
      9, 10, -117, -117, -119, 3, 2, Byte.MIN_VALUE };
  
  private final int[] KeccakRhoOffsets = new int[] { 
      0, 1, 6, 4, 3, 4, 4, 6, 7, 4, 
      3, 2, 3, 1, 7, 1, 5, 7, 5, 0, 
      2, 2, 5, 0, 6 };
  
  public ElephantEngine(ElephantParameters paramElephantParameters) {
    switch (paramElephantParameters) {
      case EncInit:
        this.BLOCK_SIZE = 20;
        this.nBits = 160;
        this.nSBox = 20;
        this.nRounds = 80;
        this.lfsrIV = 117;
        this.CRYPTO_ABYTES = 8;
        this.algorithmName = "Elephant 160 AEAD";
        break;
      case DecInit:
        this.BLOCK_SIZE = 22;
        this.nBits = 176;
        this.nSBox = 22;
        this.nRounds = 90;
        this.lfsrIV = 69;
        this.CRYPTO_ABYTES = 8;
        this.algorithmName = "Elephant 176 AEAD";
        break;
      case Uninitialized:
        this.BLOCK_SIZE = 25;
        this.nRounds = 18;
        this.CRYPTO_ABYTES = 16;
        this.algorithmName = "Elephant 200 AEAD";
        break;
      default:
        throw new IllegalArgumentException("Invalid parameter settings for Elephant");
    } 
    this.parameters = paramElephantParameters;
    this.tag_buffer = new byte[this.BLOCK_SIZE];
    this.previous_mask = new byte[this.BLOCK_SIZE];
    this.current_mask = new byte[this.BLOCK_SIZE];
    this.next_mask = new byte[this.BLOCK_SIZE];
    this.buffer = new byte[this.BLOCK_SIZE];
    this.previous_outputMessage = new byte[this.BLOCK_SIZE];
    this.outputMessage = new byte[this.BLOCK_SIZE];
    this.initialised = false;
    reset(false);
  }
  
  private void permutation(byte[] paramArrayOfbyte) {
    byte b;
    byte[] arrayOfByte;
    byte b1;
    switch (this.parameters) {
      case EncInit:
      case DecInit:
        b = this.lfsrIV;
        arrayOfByte = new byte[this.nSBox];
        for (b1 = 0; b1 < this.nRounds; b1++) {
          paramArrayOfbyte[0] = (byte)(paramArrayOfbyte[0] ^ b);
          paramArrayOfbyte[this.nSBox - 1] = (byte)(paramArrayOfbyte[this.nSBox - 1] ^ (byte)((b & 0x1) << 7 | (b & 0x2) << 5 | (b & 0x4) << 3 | (b & 0x8) << 1 | (b & 0x10) >>> 1 | (b & 0x20) >>> 3 | (b & 0x40) >>> 5 | (b & 0x80) >>> 7));
          b = (byte)((b << 1 | (0x40 & b) >>> 6 ^ (0x20 & b) >>> 5) & 0x7F);
          int i;
          for (i = 0; i < this.nSBox; i++)
            paramArrayOfbyte[i] = this.sBoxLayer[paramArrayOfbyte[i] & 0xFF]; 
          Arrays.fill(arrayOfByte, (byte)0);
          for (byte b2 = 0; b2 < this.nSBox; b2++) {
            for (byte b3 = 0; b3 < 8; b3++) {
              i = (b2 << 3) + b3;
              if (i != this.nBits - 1)
                i = (i * this.nBits >> 2) % (this.nBits - 1); 
              arrayOfByte[i >>> 3] = (byte)(arrayOfByte[i >>> 3] ^ ((paramArrayOfbyte[b2] & 0xFF) >>> b3 & 0x1) << (i & 0x7));
            } 
          } 
          System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, 0, this.nSBox);
        } 
        break;
      case Uninitialized:
        for (b1 = 0; b1 < this.nRounds; b1++)
          KeccakP200Round(paramArrayOfbyte, b1); 
        break;
    } 
  }
  
  private byte rotl(byte paramByte) {
    return (byte)((paramByte & 0xFF) << 1 | (paramByte & 0xFF) >>> 7);
  }
  
  private byte ROL8(byte paramByte, int paramInt) {
    return (byte)((paramInt != 0) ? ((paramByte & 0xFF) << paramInt ^ (paramByte & 0xFF) >>> 8 - paramInt) : paramByte);
  }
  
  private int index(int paramInt1, int paramInt2) {
    return paramInt1 + paramInt2 * 5;
  }
  
  private void KeccakP200Round(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = new byte[25];
    byte b1;
    for (b1 = 0; b1 < 5; b1++) {
      for (byte b = 0; b < 5; b++)
        arrayOfByte[b1] = (byte)(arrayOfByte[b1] ^ paramArrayOfbyte[index(b1, b)]); 
    } 
    for (b1 = 0; b1 < 5; b1++)
      arrayOfByte[b1 + 5] = (byte)(ROL8(arrayOfByte[(b1 + 1) % 5], 1) ^ arrayOfByte[(b1 + 4) % 5]); 
    for (b1 = 0; b1 < 5; b1++) {
      for (byte b = 0; b < 5; b++)
        paramArrayOfbyte[index(b1, b)] = (byte)(paramArrayOfbyte[index(b1, b)] ^ arrayOfByte[b1 + 5]); 
    } 
    for (b1 = 0; b1 < 5; b1++) {
      for (byte b = 0; b < 5; b++)
        arrayOfByte[index(b1, b)] = ROL8(paramArrayOfbyte[index(b1, b)], this.KeccakRhoOffsets[index(b1, b)]); 
    } 
    for (b1 = 0; b1 < 5; b1++) {
      for (byte b = 0; b < 5; b++)
        paramArrayOfbyte[index(b, (2 * b1 + 3 * b) % 5)] = arrayOfByte[index(b1, b)]; 
    } 
    for (byte b2 = 0; b2 < 5; b2++) {
      for (b1 = 0; b1 < 5; b1++)
        arrayOfByte[b1] = (byte)(paramArrayOfbyte[index(b1, b2)] ^ (paramArrayOfbyte[index((b1 + 1) % 5, b2)] ^ 0xFFFFFFFF) & paramArrayOfbyte[index((b1 + 2) % 5, b2)]); 
      for (b1 = 0; b1 < 5; b1++)
        paramArrayOfbyte[index(b1, b2)] = arrayOfByte[b1]; 
    } 
    paramArrayOfbyte[0] = (byte)(paramArrayOfbyte[0] ^ this.KeccakRoundConstants[paramInt]);
  }
  
  private void lfsr_step(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    switch (this.parameters) {
      case EncInit:
        paramArrayOfbyte1[this.BLOCK_SIZE - 1] = (byte)(((paramArrayOfbyte2[0] & 0xFF) << 3 | (paramArrayOfbyte2[0] & 0xFF) >>> 5) ^ (paramArrayOfbyte2[3] & 0xFF) << 7 ^ (paramArrayOfbyte2[13] & 0xFF) >>> 7);
        break;
      case DecInit:
        paramArrayOfbyte1[this.BLOCK_SIZE - 1] = (byte)(rotl(paramArrayOfbyte2[0]) ^ (paramArrayOfbyte2[3] & 0xFF) << 7 ^ (paramArrayOfbyte2[19] & 0xFF) >>> 7);
        break;
      case Uninitialized:
        paramArrayOfbyte1[this.BLOCK_SIZE - 1] = (byte)(rotl(paramArrayOfbyte2[0]) ^ rotl(paramArrayOfbyte2[2]) ^ paramArrayOfbyte2[13] << 1);
        break;
    } 
    System.arraycopy(paramArrayOfbyte2, 1, paramArrayOfbyte1, 0, this.BLOCK_SIZE - 1);
  }
  
  private void xor_block(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    for (byte b = 0; b < paramInt2; b++)
      paramArrayOfbyte1[b] = (byte)(paramArrayOfbyte1[b] ^ paramArrayOfbyte2[b + paramInt1]); 
  }
  
  private void get_c_block(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt3 * this.BLOCK_SIZE;
    if (i == paramInt2) {
      Arrays.fill(paramArrayOfbyte1, 0, this.BLOCK_SIZE, (byte)0);
      paramArrayOfbyte1[0] = 1;
      return;
    } 
    int j = paramInt2 - i;
    if (this.BLOCK_SIZE <= j) {
      System.arraycopy(paramArrayOfbyte2, paramInt1, paramArrayOfbyte1, 0, this.BLOCK_SIZE);
    } else {
      if (j > 0)
        System.arraycopy(paramArrayOfbyte2, paramInt1, paramArrayOfbyte1, 0, j); 
      Arrays.fill(paramArrayOfbyte1, j, this.BLOCK_SIZE, (byte)0);
      paramArrayOfbyte1[j] = 1;
    } 
  }
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) throws IllegalArgumentException {
    this.forEncryption = paramBoolean;
    if (!(paramCipherParameters instanceof ParametersWithIV))
      throw new IllegalArgumentException(this.algorithmName + " init parameters must include an IV"); 
    ParametersWithIV parametersWithIV = (ParametersWithIV)paramCipherParameters;
    this.npub = parametersWithIV.getIV();
    if (this.npub == null || this.npub.length != 12)
      throw new IllegalArgumentException(this.algorithmName + " requires exactly 12 bytes of IV"); 
    if (!(parametersWithIV.getParameters() instanceof KeyParameter))
      throw new IllegalArgumentException(this.algorithmName + " init parameters must include a key"); 
    KeyParameter keyParameter = (KeyParameter)parametersWithIV.getParameters();
    byte[] arrayOfByte = keyParameter.getKey();
    if (arrayOfByte.length != 16)
      throw new IllegalArgumentException(this.algorithmName + " key must be 128 bits long"); 
    this.expanded_key = new byte[this.BLOCK_SIZE];
    System.arraycopy(arrayOfByte, 0, this.expanded_key, 0, 16);
    permutation(this.expanded_key);
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties(getAlgorithmName(), 128, paramCipherParameters, Utils.getPurpose(paramBoolean)));
    this.initialised = true;
    this.m_state = paramBoolean ? State.EncInit : State.DecInit;
    this.inputMessage = new byte[this.BLOCK_SIZE + (paramBoolean ? 0 : this.CRYPTO_ABYTES)];
    reset(false);
  }
  
  public String getAlgorithmName() {
    return this.algorithmName;
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
    byte[] arrayOfByte = this.aadData.toByteArray();
    if (this.inputOff + paramInt2 - (this.forEncryption ? 0 : this.CRYPTO_ABYTES) >= this.BLOCK_SIZE) {
      switch (this.m_state) {
        case EncInit:
        case DecInit:
          processAADBytes(this.tag_buffer);
          break;
      } 
      int i = this.inputOff + paramInt2 - (this.forEncryption ? 0 : this.CRYPTO_ABYTES);
      int j = arrayOfByte.length;
      int k = i / this.BLOCK_SIZE;
      int m = 1 + ((i % this.BLOCK_SIZE != 0) ? k : (k - 1));
      int n = 1 + (12 + j) / this.BLOCK_SIZE;
      byte[] arrayOfByte1 = new byte[Math.max(k, 1) * this.BLOCK_SIZE];
      System.arraycopy(this.inputMessage, 0, arrayOfByte1, 0, this.inputOff);
      int i1 = arrayOfByte1.length - this.inputOff;
      System.arraycopy(paramArrayOfbyte1, paramInt1, arrayOfByte1, this.inputOff, arrayOfByte1.length - this.inputOff);
      processBytes(arrayOfByte1, paramArrayOfbyte2, paramInt3, k, m, k, i, n);
      this.inputOff = paramInt2 - i1;
      System.arraycopy(paramArrayOfbyte1, paramInt1 + i1, this.inputMessage, 0, this.inputOff);
      this.nb_its += k;
      return k * this.BLOCK_SIZE;
    } 
    System.arraycopy(paramArrayOfbyte1, paramInt1, this.inputMessage, this.inputOff, paramInt2);
    this.inputOff += paramInt2;
    return 0;
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) throws IllegalStateException, InvalidCipherTextException {
    if (!this.initialised)
      throw new IllegalArgumentException(this.algorithmName + " needs call init function before doFinal"); 
    int i = this.inputOff;
    if ((this.forEncryption && i + paramInt + this.CRYPTO_ABYTES > paramArrayOfbyte.length) || (!this.forEncryption && i + paramInt - this.CRYPTO_ABYTES > paramArrayOfbyte.length))
      throw new OutputLengthException("output buffer is too short"); 
    byte[] arrayOfByte = this.aadData.toByteArray();
    switch (this.m_state) {
      case EncInit:
      case DecInit:
        processAADBytes(this.tag_buffer);
        break;
    } 
    int j = i + this.nb_its * this.BLOCK_SIZE - (this.forEncryption ? 0 : this.CRYPTO_ABYTES);
    int k = arrayOfByte.length;
    int m = 1 + j / this.BLOCK_SIZE;
    int n = (j % this.BLOCK_SIZE != 0) ? m : (m - 1);
    int i1 = 1 + (12 + k) / this.BLOCK_SIZE;
    int i2 = Math.max(m + 1, i1 - 1);
    paramInt += processBytes(this.inputMessage, paramArrayOfbyte, paramInt, i2, n, m, j, i1);
    this.tag = new byte[this.CRYPTO_ABYTES];
    xor_block(this.tag_buffer, this.expanded_key, 0, this.BLOCK_SIZE);
    permutation(this.tag_buffer);
    xor_block(this.tag_buffer, this.expanded_key, 0, this.BLOCK_SIZE);
    if (this.forEncryption) {
      System.arraycopy(this.tag_buffer, 0, this.tag, 0, this.CRYPTO_ABYTES);
      System.arraycopy(this.tag, 0, paramArrayOfbyte, paramInt, this.tag.length);
      j += this.CRYPTO_ABYTES;
    } else {
      this.inputOff -= this.CRYPTO_ABYTES;
      for (byte b = 0; b < this.CRYPTO_ABYTES; b++) {
        if (this.tag_buffer[b] != this.inputMessage[this.inputOff + b])
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
    switch (this.m_state) {
      case Uninitialized:
        throw new IllegalArgumentException(this.algorithmName + " needs call init function before getUpdateOutputSize");
      case DecFinal:
      case EncFinal:
        return 0;
      case EncInit:
      case EncAad:
      case EncData:
        return this.inputOff + paramInt + this.CRYPTO_ABYTES;
    } 
    return Math.max(0, paramInt + this.inputOff - this.CRYPTO_ABYTES);
  }
  
  public int getOutputSize(int paramInt) {
    switch (this.m_state) {
      case Uninitialized:
        throw new IllegalArgumentException(this.algorithmName + " needs call init function before getUpdateOutputSize");
      case DecFinal:
      case EncFinal:
        return 0;
      case EncInit:
      case EncAad:
      case EncData:
        return paramInt + this.CRYPTO_ABYTES;
    } 
    return Math.max(0, paramInt - this.CRYPTO_ABYTES);
  }
  
  public void reset() {
    reset(true);
  }
  
  private void reset(boolean paramBoolean) {
    if (paramBoolean)
      this.tag = null; 
    this.aadData.reset();
    Arrays.fill(this.tag_buffer, (byte)0);
    this.inputOff = 0;
    this.nb_its = 0;
    this.adOff = -1;
  }
  
  public int getKeyBytesSize() {
    return 16;
  }
  
  public int getIVBytesSize() {
    return 12;
  }
  
  public int getBlockSize() {
    return this.CRYPTO_ABYTES;
  }
  
  private void checkAad() {
    switch (this.m_state) {
      case DecData:
        throw new IllegalArgumentException(this.algorithmName + " cannot process AAD when the length of the plaintext to be processed exceeds the a block size");
      case EncData:
        throw new IllegalArgumentException(this.algorithmName + " cannot process AAD when the length of the ciphertext to be processed exceeds the a block size");
      case EncFinal:
        throw new IllegalArgumentException(this.algorithmName + " cannot be reused for encryption");
    } 
  }
  
  private void processAADBytes(byte[] paramArrayOfbyte) {
    checkAad();
    if (this.adOff == -1) {
      this.adlen = this.aadData.size();
      this.ad = this.aadData.toByteArray();
      this.adOff = 0;
    } 
    byte b = 0;
    switch (this.m_state) {
      case DecInit:
        System.arraycopy(this.expanded_key, 0, this.current_mask, 0, this.BLOCK_SIZE);
        System.arraycopy(this.npub, 0, paramArrayOfbyte, 0, 12);
        b += true;
        this.m_state = State.DecAad;
        break;
      case EncInit:
        System.arraycopy(this.expanded_key, 0, this.current_mask, 0, this.BLOCK_SIZE);
        System.arraycopy(this.npub, 0, paramArrayOfbyte, 0, 12);
        b += true;
        this.m_state = State.EncAad;
        break;
      case EncAad:
      case DecAad:
        if (this.adOff == this.adlen) {
          Arrays.fill(paramArrayOfbyte, 0, this.BLOCK_SIZE, (byte)0);
          paramArrayOfbyte[0] = 1;
          return;
        } 
        break;
      case DecData:
        throw new IllegalArgumentException(this.algorithmName + " cannot process AAD when the length of the plaintext to be processed exceeds the a block size");
      case EncData:
        throw new IllegalArgumentException(this.algorithmName + " cannot process AAD when the length of the ciphertext to be processed exceeds the a block size");
      case EncFinal:
        throw new IllegalArgumentException(this.algorithmName + " cannot be reused for encryption");
    } 
    int i = this.BLOCK_SIZE - b;
    int j = this.adlen - this.adOff;
    if (i <= j) {
      System.arraycopy(this.ad, this.adOff, paramArrayOfbyte, b, i);
      this.adOff += i;
    } else {
      if (j > 0) {
        System.arraycopy(this.ad, this.adOff, paramArrayOfbyte, b, j);
        this.adOff += j;
      } 
      Arrays.fill(paramArrayOfbyte, b + j, b + i, (byte)0);
      paramArrayOfbyte[b + j] = 1;
      switch (this.m_state) {
        case DecAad:
          this.m_state = State.DecData;
          break;
        case EncAad:
          this.m_state = State.EncData;
          break;
      } 
    } 
  }
  
  private int processBytes(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    int i = 0;
    for (int j = this.nb_its; j < paramInt2; j++) {
      lfsr_step(this.next_mask, this.current_mask);
      if (j < paramInt3) {
        System.arraycopy(this.npub, 0, this.buffer, 0, 12);
        Arrays.fill(this.buffer, 12, this.BLOCK_SIZE, (byte)0);
        xor_block(this.buffer, this.current_mask, 0, this.BLOCK_SIZE);
        xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
        permutation(this.buffer);
        xor_block(this.buffer, this.current_mask, 0, this.BLOCK_SIZE);
        xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
        int k = (j == paramInt3 - 1) ? (paramInt5 - j * this.BLOCK_SIZE) : this.BLOCK_SIZE;
        xor_block(this.buffer, paramArrayOfbyte1, 0, k);
        System.arraycopy(this.buffer, 0, paramArrayOfbyte2, paramInt1, k);
        if (this.forEncryption) {
          System.arraycopy(this.buffer, 0, this.outputMessage, 0, k);
        } else {
          System.arraycopy(paramArrayOfbyte1, 0, this.outputMessage, 0, k);
        } 
        i += k;
      } 
      if (j > 0 && j <= paramInt4) {
        get_c_block(this.buffer, this.previous_outputMessage, 0, paramInt5, j - 1);
        xor_block(this.buffer, this.previous_mask, 0, this.BLOCK_SIZE);
        xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
        permutation(this.buffer);
        xor_block(this.buffer, this.previous_mask, 0, this.BLOCK_SIZE);
        xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
        xor_block(this.tag_buffer, this.buffer, 0, this.BLOCK_SIZE);
      } 
      if (j + 1 < paramInt6) {
        processAADBytes(this.buffer);
        xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
        permutation(this.buffer);
        xor_block(this.buffer, this.next_mask, 0, this.BLOCK_SIZE);
        xor_block(this.tag_buffer, this.buffer, 0, this.BLOCK_SIZE);
      } 
      byte[] arrayOfByte = this.previous_mask;
      this.previous_mask = this.current_mask;
      this.current_mask = this.next_mask;
      this.next_mask = arrayOfByte;
      System.arraycopy(this.outputMessage, 0, this.previous_outputMessage, 0, this.BLOCK_SIZE);
    } 
    return i;
  }
  
  public enum ElephantParameters {
    elephant160, elephant176, elephant200;
  }
  
  private enum State {
    Uninitialized, EncInit, EncAad, EncData, EncFinal, DecInit, DecAad, DecData, DecFinal;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\engines\ElephantEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */