package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.digests.SparkleDigest;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

public class SparkleEngine implements AEADCipher {
  private static final int[] RCON = new int[] { -1209970334, -1083090816, 951376470, 844003128, -1156479509, 1333558103, -809524792, -1028445891 };
  
  private String algorithmName;
  
  private final int[] state;
  
  private final int[] k;
  
  private final int[] npub;
  
  private byte[] tag;
  
  private boolean encrypted;
  
  private State m_state;
  
  private byte[] initialAssociatedText;
  
  private final int m_bufferSizeDecrypt;
  
  private final byte[] m_buf;
  
  private int m_bufPos;
  
  private final int SCHWAEMM_KEY_LEN;
  
  private final int SCHWAEMM_NONCE_LEN;
  
  private final int SPARKLE_STEPS_SLIM;
  
  private final int SPARKLE_STEPS_BIG;
  
  private final int KEY_WORDS;
  
  private final int KEY_BYTES;
  
  private final int TAG_WORDS;
  
  private final int TAG_BYTES;
  
  private final int STATE_WORDS;
  
  private final int RATE_WORDS;
  
  private final int RATE_BYTES;
  
  private final int CAP_MASK;
  
  private final int _A0;
  
  private final int _A1;
  
  private final int _M2;
  
  private final int _M3;
  
  public SparkleEngine(SparkleParameters paramSparkleParameters) {
    char c1;
    char c2;
    char c3;
    this.m_state = State.Uninitialized;
    this.m_bufPos = 0;
    switch (paramSparkleParameters) {
      case DecInit:
        this.SCHWAEMM_KEY_LEN = 128;
        this.SCHWAEMM_NONCE_LEN = 128;
        c2 = '';
        c1 = 'Ā';
        c3 = '';
        this.SPARKLE_STEPS_SLIM = 7;
        this.SPARKLE_STEPS_BIG = 10;
        this.algorithmName = "SCHWAEMM128-128";
        break;
      case DecAad:
        this.SCHWAEMM_KEY_LEN = 128;
        this.SCHWAEMM_NONCE_LEN = 256;
        c2 = '';
        c1 = 'ƀ';
        c3 = '';
        this.SPARKLE_STEPS_SLIM = 7;
        this.SPARKLE_STEPS_BIG = 11;
        this.algorithmName = "SCHWAEMM256-128";
        break;
      case DecData:
        this.SCHWAEMM_KEY_LEN = 192;
        this.SCHWAEMM_NONCE_LEN = 192;
        c2 = 'À';
        c1 = 'ƀ';
        c3 = 'À';
        this.SPARKLE_STEPS_SLIM = 7;
        this.SPARKLE_STEPS_BIG = 11;
        this.algorithmName = "SCHWAEMM192-192";
        break;
      case DecFinal:
        this.SCHWAEMM_KEY_LEN = 256;
        this.SCHWAEMM_NONCE_LEN = 256;
        c2 = 'Ā';
        c1 = 'Ȁ';
        c3 = 'Ā';
        this.SPARKLE_STEPS_SLIM = 8;
        this.SPARKLE_STEPS_BIG = 12;
        this.algorithmName = "SCHWAEMM256-256";
        break;
      default:
        throw new IllegalArgumentException("Invalid definition of SCHWAEMM instance");
    } 
    this.KEY_WORDS = this.SCHWAEMM_KEY_LEN >>> 5;
    this.KEY_BYTES = this.SCHWAEMM_KEY_LEN >>> 3;
    this.TAG_WORDS = c2 >>> 5;
    this.TAG_BYTES = c2 >>> 3;
    this.STATE_WORDS = c1 >>> 5;
    this.RATE_WORDS = this.SCHWAEMM_NONCE_LEN >>> 5;
    this.RATE_BYTES = this.SCHWAEMM_NONCE_LEN >>> 3;
    int i = c3 >>> 6;
    int j = c3 >>> 5;
    this.CAP_MASK = (this.RATE_WORDS > j) ? (j - 1) : -1;
    this._A0 = 1 << i << 24;
    this._A1 = (0x1 ^ 1 << i) << 24;
    this._M2 = (0x2 ^ 1 << i) << 24;
    this._M3 = (0x3 ^ 1 << i) << 24;
    this.state = new int[this.STATE_WORDS];
    this.k = new int[this.KEY_WORDS];
    this.npub = new int[this.RATE_WORDS];
    this.m_bufferSizeDecrypt = this.RATE_BYTES + this.TAG_BYTES;
    this.m_buf = new byte[this.m_bufferSizeDecrypt];
  }
  
  public int getKeyBytesSize() {
    return this.KEY_BYTES;
  }
  
  public int getIVBytesSize() {
    return this.RATE_BYTES;
  }
  
  public String getAlgorithmName() {
    return this.algorithmName;
  }
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) throws IllegalArgumentException {
    byte[] arrayOfByte;
    KeyParameter keyParameter = null;
    if (paramCipherParameters instanceof AEADParameters) {
      AEADParameters aEADParameters = (AEADParameters)paramCipherParameters;
      keyParameter = aEADParameters.getKey();
      arrayOfByte = aEADParameters.getNonce();
      this.initialAssociatedText = aEADParameters.getAssociatedText();
      int k = aEADParameters.getMacSize();
      if (k != this.TAG_BYTES * 8)
        throw new IllegalArgumentException("Invalid value for MAC size: " + k); 
    } else if (paramCipherParameters instanceof ParametersWithIV) {
      ParametersWithIV parametersWithIV = (ParametersWithIV)paramCipherParameters;
      CipherParameters cipherParameters = parametersWithIV.getParameters();
      if (cipherParameters instanceof KeyParameter)
        keyParameter = (KeyParameter)cipherParameters; 
      arrayOfByte = parametersWithIV.getIV();
      this.initialAssociatedText = null;
    } else {
      throw new IllegalArgumentException("invalid parameters passed to Sparkle");
    } 
    if (keyParameter == null)
      throw new IllegalArgumentException("Sparkle init parameters must include a key"); 
    int i = this.KEY_WORDS * 4;
    if (i != keyParameter.getKeyLength())
      throw new IllegalArgumentException(this.algorithmName + " requires exactly " + i + " bytes of key"); 
    int j = this.RATE_WORDS * 4;
    if (arrayOfByte == null || j != arrayOfByte.length)
      throw new IllegalArgumentException(this.algorithmName + " requires exactly " + j + " bytes of IV"); 
    Pack.littleEndianToInt(keyParameter.getKey(), 0, this.k);
    Pack.littleEndianToInt(arrayOfByte, 0, this.npub);
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties(getAlgorithmName(), 128, paramCipherParameters, Utils.getPurpose(paramBoolean)));
    this.m_state = paramBoolean ? State.EncInit : State.DecInit;
    reset();
  }
  
  public void processAADByte(byte paramByte) {
    checkAAD();
    if (this.m_bufPos == this.RATE_BYTES) {
      processBufferAAD(this.m_buf, 0);
      this.m_bufPos = 0;
    } 
    this.m_buf[this.m_bufPos++] = paramByte;
  }
  
  public void processAADBytes(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt1 > paramArrayOfbyte.length - paramInt2)
      throw new DataLengthException("input buffer too short"); 
    if (paramInt2 <= 0)
      return; 
    checkAAD();
    if (this.m_bufPos > 0) {
      int i = this.RATE_BYTES - this.m_bufPos;
      if (paramInt2 <= i) {
        System.arraycopy(paramArrayOfbyte, paramInt1, this.m_buf, this.m_bufPos, paramInt2);
        this.m_bufPos += paramInt2;
        return;
      } 
      System.arraycopy(paramArrayOfbyte, paramInt1, this.m_buf, this.m_bufPos, i);
      paramInt1 += i;
      paramInt2 -= i;
      processBufferAAD(this.m_buf, 0);
    } 
    while (paramInt2 > this.RATE_BYTES) {
      processBufferAAD(paramArrayOfbyte, paramInt1);
      paramInt1 += this.RATE_BYTES;
      paramInt2 -= this.RATE_BYTES;
    } 
    System.arraycopy(paramArrayOfbyte, paramInt1, this.m_buf, 0, paramInt2);
    this.m_bufPos = paramInt2;
  }
  
  public int processByte(byte paramByte, byte[] paramArrayOfbyte, int paramInt) throws DataLengthException {
    return processBytes(new byte[] { paramByte }, 0, 1, paramArrayOfbyte, paramInt);
  }
  
  public int processBytes(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws DataLengthException {
    if (paramInt1 > paramArrayOfbyte1.length - paramInt2)
      throw new DataLengthException("input buffer too short"); 
    boolean bool = checkData();
    int i = 0;
    if (bool) {
      if (this.m_bufPos > 0) {
        int j = this.RATE_BYTES - this.m_bufPos;
        if (paramInt2 <= j) {
          System.arraycopy(paramArrayOfbyte1, paramInt1, this.m_buf, this.m_bufPos, paramInt2);
          this.m_bufPos += paramInt2;
          return 0;
        } 
        System.arraycopy(paramArrayOfbyte1, paramInt1, this.m_buf, this.m_bufPos, j);
        paramInt1 += j;
        paramInt2 -= j;
        processBufferEncrypt(this.m_buf, 0, paramArrayOfbyte2, paramInt3);
        i = this.RATE_BYTES;
      } 
      while (paramInt2 > this.RATE_BYTES) {
        processBufferEncrypt(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt3 + i);
        paramInt1 += this.RATE_BYTES;
        paramInt2 -= this.RATE_BYTES;
        i += this.RATE_BYTES;
      } 
    } else {
      int j = this.m_bufferSizeDecrypt - this.m_bufPos;
      if (paramInt2 <= j) {
        System.arraycopy(paramArrayOfbyte1, paramInt1, this.m_buf, this.m_bufPos, paramInt2);
        this.m_bufPos += paramInt2;
        return 0;
      } 
      if (this.m_bufPos > this.RATE_BYTES) {
        processBufferDecrypt(this.m_buf, 0, paramArrayOfbyte2, paramInt3);
        this.m_bufPos -= this.RATE_BYTES;
        System.arraycopy(this.m_buf, this.RATE_BYTES, this.m_buf, 0, this.m_bufPos);
        i = this.RATE_BYTES;
        j += this.RATE_BYTES;
        if (paramInt2 <= j) {
          System.arraycopy(paramArrayOfbyte1, paramInt1, this.m_buf, this.m_bufPos, paramInt2);
          this.m_bufPos += paramInt2;
          return i;
        } 
      } 
      j = this.RATE_BYTES - this.m_bufPos;
      System.arraycopy(paramArrayOfbyte1, paramInt1, this.m_buf, this.m_bufPos, j);
      paramInt1 += j;
      paramInt2 -= j;
      processBufferDecrypt(this.m_buf, 0, paramArrayOfbyte2, paramInt3 + i);
      for (i += this.RATE_BYTES; paramInt2 > this.m_bufferSizeDecrypt; i += this.RATE_BYTES) {
        processBufferDecrypt(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt3 + i);
        paramInt1 += this.RATE_BYTES;
        paramInt2 -= this.RATE_BYTES;
      } 
    } 
    System.arraycopy(paramArrayOfbyte1, paramInt1, this.m_buf, 0, paramInt2);
    this.m_bufPos = paramInt2;
    return i;
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) throws IllegalStateException, InvalidCipherTextException {
    int i;
    boolean bool = checkData();
    if (bool) {
      i = this.m_bufPos + this.TAG_BYTES;
    } else {
      if (this.m_bufPos < this.TAG_BYTES)
        throw new InvalidCipherTextException("data too short"); 
      this.m_bufPos -= this.TAG_BYTES;
      i = this.m_bufPos;
    } 
    if (paramInt > paramArrayOfbyte.length - i)
      throw new OutputLengthException("output buffer too short"); 
    if (this.encrypted || this.m_bufPos > 0) {
      this.state[this.STATE_WORDS - 1] = this.state[this.STATE_WORDS - 1] ^ ((this.m_bufPos < this.RATE_BYTES) ? this._M2 : this._M3);
      int[] arrayOfInt = new int[this.RATE_WORDS];
      int j;
      for (j = 0; j < this.m_bufPos; j++)
        arrayOfInt[j >>> 2] = arrayOfInt[j >>> 2] | (this.m_buf[j] & 0xFF) << (j & 0x3) << 3; 
      if (this.m_bufPos < this.RATE_BYTES) {
        if (!bool) {
          j = (this.m_bufPos & 0x3) << 3;
          arrayOfInt[this.m_bufPos >>> 2] = arrayOfInt[this.m_bufPos >>> 2] | this.state[this.m_bufPos >>> 2] >>> j << j;
          j = (this.m_bufPos >>> 2) + 1;
          System.arraycopy(this.state, j, arrayOfInt, j, this.RATE_WORDS - j);
        } 
        arrayOfInt[this.m_bufPos >>> 2] = arrayOfInt[this.m_bufPos >>> 2] ^ 128 << (this.m_bufPos & 0x3) << 3;
      } 
      for (j = 0; j < this.RATE_WORDS / 2; j++) {
        int k = j + this.RATE_WORDS / 2;
        int m = this.state[j];
        int n = this.state[k];
        if (bool) {
          this.state[j] = n ^ arrayOfInt[j] ^ this.state[this.RATE_WORDS + j];
          this.state[k] = m ^ n ^ arrayOfInt[k] ^ this.state[this.RATE_WORDS + (k & this.CAP_MASK)];
        } else {
          this.state[j] = m ^ n ^ arrayOfInt[j] ^ this.state[this.RATE_WORDS + j];
          this.state[k] = m ^ arrayOfInt[k] ^ this.state[this.RATE_WORDS + (k & this.CAP_MASK)];
        } 
        arrayOfInt[j] = arrayOfInt[j] ^ m;
        arrayOfInt[k] = arrayOfInt[k] ^ n;
      } 
      for (j = 0; j < this.m_bufPos; j++)
        paramArrayOfbyte[paramInt++] = (byte)(arrayOfInt[j >>> 2] >>> (j & 0x3) << 3); 
      sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
    } 
    for (byte b = 0; b < this.KEY_WORDS; b++)
      this.state[this.RATE_WORDS + b] = this.state[this.RATE_WORDS + b] ^ this.k[b]; 
    this.tag = new byte[this.TAG_BYTES];
    Pack.intToLittleEndian(this.state, this.RATE_WORDS, this.TAG_WORDS, this.tag, 0);
    if (bool) {
      System.arraycopy(this.tag, 0, paramArrayOfbyte, paramInt, this.TAG_BYTES);
    } else if (!Arrays.constantTimeAreEqual(this.TAG_BYTES, this.tag, 0, this.m_buf, this.m_bufPos)) {
      throw new InvalidCipherTextException(this.algorithmName + " mac does not match");
    } 
    reset(!bool);
    return i;
  }
  
  public byte[] getMac() {
    return this.tag;
  }
  
  public int getUpdateOutputSize(int paramInt) {
    int i = Math.max(0, paramInt) - 1;
    switch (this.m_state) {
      case DecInit:
      case DecAad:
        i = Math.max(0, i - this.TAG_BYTES);
        break;
      case DecData:
      case DecFinal:
        i = Math.max(0, i + this.m_bufPos - this.TAG_BYTES);
        break;
      case EncData:
      case EncFinal:
        i = Math.max(0, i + this.m_bufPos);
        break;
    } 
    return i - i % this.RATE_BYTES;
  }
  
  public int getOutputSize(int paramInt) {
    int i = Math.max(0, paramInt);
    switch (this.m_state) {
      case DecInit:
      case DecAad:
        return Math.max(0, i - this.TAG_BYTES);
      case DecData:
      case DecFinal:
        return Math.max(0, i + this.m_bufPos - this.TAG_BYTES);
      case EncData:
      case EncFinal:
        return i + this.m_bufPos + this.TAG_BYTES;
    } 
    return i + this.TAG_BYTES;
  }
  
  public void reset() {
    reset(true);
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
  
  private void finishAAD(State paramState) {
    switch (this.m_state) {
      case DecAad:
      case EncAad:
        processFinalAAD();
        break;
    } 
    this.m_bufPos = 0;
    this.m_state = paramState;
  }
  
  private void processBufferAAD(byte[] paramArrayOfbyte, int paramInt) {
    for (byte b = 0; b < this.RATE_WORDS / 2; b++) {
      int i = b + this.RATE_WORDS / 2;
      int j = this.state[b];
      int k = this.state[i];
      int m = Pack.littleEndianToInt(paramArrayOfbyte, paramInt + b * 4);
      int n = Pack.littleEndianToInt(paramArrayOfbyte, paramInt + i * 4);
      this.state[b] = k ^ m ^ this.state[this.RATE_WORDS + b];
      this.state[i] = j ^ k ^ n ^ this.state[this.RATE_WORDS + (i & this.CAP_MASK)];
    } 
    sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
  }
  
  private void processBufferDecrypt(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2) {
    if (paramInt2 > paramArrayOfbyte2.length - this.RATE_BYTES)
      throw new OutputLengthException("output buffer too short"); 
    for (byte b = 0; b < this.RATE_WORDS / 2; b++) {
      int i = b + this.RATE_WORDS / 2;
      int j = this.state[b];
      int k = this.state[i];
      int m = Pack.littleEndianToInt(paramArrayOfbyte1, paramInt1 + b * 4);
      int n = Pack.littleEndianToInt(paramArrayOfbyte1, paramInt1 + i * 4);
      this.state[b] = j ^ k ^ m ^ this.state[this.RATE_WORDS + b];
      this.state[i] = j ^ n ^ this.state[this.RATE_WORDS + (i & this.CAP_MASK)];
      Pack.intToLittleEndian(m ^ j, paramArrayOfbyte2, paramInt2 + b * 4);
      Pack.intToLittleEndian(n ^ k, paramArrayOfbyte2, paramInt2 + i * 4);
    } 
    sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
    this.encrypted = true;
  }
  
  private void processBufferEncrypt(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2) {
    if (paramInt2 > paramArrayOfbyte2.length - this.RATE_BYTES)
      throw new OutputLengthException("output buffer too short"); 
    for (byte b = 0; b < this.RATE_WORDS / 2; b++) {
      int i = b + this.RATE_WORDS / 2;
      int j = this.state[b];
      int k = this.state[i];
      int m = Pack.littleEndianToInt(paramArrayOfbyte1, paramInt1 + b * 4);
      int n = Pack.littleEndianToInt(paramArrayOfbyte1, paramInt1 + i * 4);
      this.state[b] = k ^ m ^ this.state[this.RATE_WORDS + b];
      this.state[i] = j ^ k ^ n ^ this.state[this.RATE_WORDS + (i & this.CAP_MASK)];
      Pack.intToLittleEndian(m ^ j, paramArrayOfbyte2, paramInt2 + b * 4);
      Pack.intToLittleEndian(n ^ k, paramArrayOfbyte2, paramInt2 + i * 4);
    } 
    sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
    this.encrypted = true;
  }
  
  private void processFinalAAD() {
    if (this.m_bufPos < this.RATE_BYTES) {
      this.state[this.STATE_WORDS - 1] = this.state[this.STATE_WORDS - 1] ^ this._A0;
      this.m_buf[this.m_bufPos] = Byte.MIN_VALUE;
      while (++this.m_bufPos < this.RATE_BYTES)
        this.m_buf[this.m_bufPos] = 0; 
    } else {
      this.state[this.STATE_WORDS - 1] = this.state[this.STATE_WORDS - 1] ^ this._A1;
    } 
    for (byte b = 0; b < this.RATE_WORDS / 2; b++) {
      int i = b + this.RATE_WORDS / 2;
      int j = this.state[b];
      int k = this.state[i];
      int m = Pack.littleEndianToInt(this.m_buf, b * 4);
      int n = Pack.littleEndianToInt(this.m_buf, i * 4);
      this.state[b] = k ^ m ^ this.state[this.RATE_WORDS + b];
      this.state[i] = j ^ k ^ n ^ this.state[this.RATE_WORDS + (i & this.CAP_MASK)];
    } 
    sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
  }
  
  private void reset(boolean paramBoolean) {
    if (paramBoolean)
      this.tag = null; 
    Arrays.clear(this.m_buf);
    this.m_bufPos = 0;
    this.encrypted = false;
    switch (this.m_state) {
      case DecInit:
      case EncInit:
        break;
      case DecAad:
      case DecData:
      case DecFinal:
        this.m_state = State.DecInit;
        break;
      case EncData:
      case EncFinal:
      case EncAad:
        this.m_state = State.EncFinal;
        return;
      default:
        throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
    } 
    System.arraycopy(this.npub, 0, this.state, 0, this.RATE_WORDS);
    System.arraycopy(this.k, 0, this.state, this.RATE_WORDS, this.KEY_WORDS);
    sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
    if (this.initialAssociatedText != null)
      processAADBytes(this.initialAssociatedText, 0, this.initialAssociatedText.length); 
  }
  
  private static int ELL(int paramInt) {
    return Integers.rotateRight(paramInt, 16) ^ paramInt & 0xFFFF;
  }
  
  private static void sparkle_opt(int[] paramArrayOfint, int paramInt) {
    switch (paramArrayOfint.length) {
      case 8:
        sparkle_opt8(paramArrayOfint, paramInt);
        return;
      case 12:
        sparkle_opt12(paramArrayOfint, paramInt);
        return;
      case 16:
        sparkle_opt16(paramArrayOfint, paramInt);
        return;
    } 
    throw new IllegalStateException();
  }
  
  static void sparkle_opt8(int[] paramArrayOfint, int paramInt) {
    int i = paramArrayOfint[0];
    int j = paramArrayOfint[1];
    int k = paramArrayOfint[2];
    int m = paramArrayOfint[3];
    int n = paramArrayOfint[4];
    int i1 = paramArrayOfint[5];
    int i2 = paramArrayOfint[6];
    int i3 = paramArrayOfint[7];
    for (byte b = 0; b < paramInt; b++) {
      j ^= RCON[b & 0x7];
      m ^= b;
      int i4 = RCON[0];
      i += Integers.rotateRight(j, 31);
      j ^= Integers.rotateRight(i, 24);
      i ^= i4;
      i += Integers.rotateRight(j, 17);
      j ^= Integers.rotateRight(i, 17);
      i ^= i4;
      i += j;
      j ^= Integers.rotateRight(i, 31);
      i ^= i4;
      i += Integers.rotateRight(j, 24);
      j ^= Integers.rotateRight(i, 16);
      i ^= i4;
      i4 = RCON[1];
      k += Integers.rotateRight(m, 31);
      m ^= Integers.rotateRight(k, 24);
      k ^= i4;
      k += Integers.rotateRight(m, 17);
      m ^= Integers.rotateRight(k, 17);
      k ^= i4;
      k += m;
      m ^= Integers.rotateRight(k, 31);
      k ^= i4;
      k += Integers.rotateRight(m, 24);
      m ^= Integers.rotateRight(k, 16);
      k ^= i4;
      i4 = RCON[2];
      n += Integers.rotateRight(i1, 31);
      i1 ^= Integers.rotateRight(n, 24);
      n ^= i4;
      n += Integers.rotateRight(i1, 17);
      i1 ^= Integers.rotateRight(n, 17);
      n ^= i4;
      n += i1;
      i1 ^= Integers.rotateRight(n, 31);
      n ^= i4;
      n += Integers.rotateRight(i1, 24);
      i1 ^= Integers.rotateRight(n, 16);
      n ^= i4;
      i4 = RCON[3];
      i2 += Integers.rotateRight(i3, 31);
      i3 ^= Integers.rotateRight(i2, 24);
      i2 ^= i4;
      i2 += Integers.rotateRight(i3, 17);
      i3 ^= Integers.rotateRight(i2, 17);
      i2 ^= i4;
      i2 += i3;
      i3 ^= Integers.rotateRight(i2, 31);
      i2 ^= i4;
      i2 += Integers.rotateRight(i3, 24);
      i3 ^= Integers.rotateRight(i2, 16);
      i2 ^= i4;
      i4 = ELL(i ^ k);
      int i5 = ELL(j ^ m);
      int i6 = i ^ n;
      int i7 = j ^ i1;
      int i8 = k ^ i2;
      int i9 = m ^ i3;
      n = i;
      i1 = j;
      i2 = k;
      i3 = m;
      i = i8 ^ i5;
      j = i9 ^ i4;
      k = i6 ^ i5;
      m = i7 ^ i4;
    } 
    paramArrayOfint[0] = i;
    paramArrayOfint[1] = j;
    paramArrayOfint[2] = k;
    paramArrayOfint[3] = m;
    paramArrayOfint[4] = n;
    paramArrayOfint[5] = i1;
    paramArrayOfint[6] = i2;
    paramArrayOfint[7] = i3;
  }
  
  static void sparkle_opt12(int[] paramArrayOfint, int paramInt) {
    int i = paramArrayOfint[0];
    int j = paramArrayOfint[1];
    int k = paramArrayOfint[2];
    int m = paramArrayOfint[3];
    int n = paramArrayOfint[4];
    int i1 = paramArrayOfint[5];
    int i2 = paramArrayOfint[6];
    int i3 = paramArrayOfint[7];
    int i4 = paramArrayOfint[8];
    int i5 = paramArrayOfint[9];
    int i6 = paramArrayOfint[10];
    int i7 = paramArrayOfint[11];
    for (byte b = 0; b < paramInt; b++) {
      j ^= RCON[b & 0x7];
      m ^= b;
      int i8 = RCON[0];
      i += Integers.rotateRight(j, 31);
      j ^= Integers.rotateRight(i, 24);
      i ^= i8;
      i += Integers.rotateRight(j, 17);
      j ^= Integers.rotateRight(i, 17);
      i ^= i8;
      i += j;
      j ^= Integers.rotateRight(i, 31);
      i ^= i8;
      i += Integers.rotateRight(j, 24);
      j ^= Integers.rotateRight(i, 16);
      i ^= i8;
      i8 = RCON[1];
      k += Integers.rotateRight(m, 31);
      m ^= Integers.rotateRight(k, 24);
      k ^= i8;
      k += Integers.rotateRight(m, 17);
      m ^= Integers.rotateRight(k, 17);
      k ^= i8;
      k += m;
      m ^= Integers.rotateRight(k, 31);
      k ^= i8;
      k += Integers.rotateRight(m, 24);
      m ^= Integers.rotateRight(k, 16);
      k ^= i8;
      i8 = RCON[2];
      n += Integers.rotateRight(i1, 31);
      i1 ^= Integers.rotateRight(n, 24);
      n ^= i8;
      n += Integers.rotateRight(i1, 17);
      i1 ^= Integers.rotateRight(n, 17);
      n ^= i8;
      n += i1;
      i1 ^= Integers.rotateRight(n, 31);
      n ^= i8;
      n += Integers.rotateRight(i1, 24);
      i1 ^= Integers.rotateRight(n, 16);
      n ^= i8;
      i8 = RCON[3];
      i2 += Integers.rotateRight(i3, 31);
      i3 ^= Integers.rotateRight(i2, 24);
      i2 ^= i8;
      i2 += Integers.rotateRight(i3, 17);
      i3 ^= Integers.rotateRight(i2, 17);
      i2 ^= i8;
      i2 += i3;
      i3 ^= Integers.rotateRight(i2, 31);
      i2 ^= i8;
      i2 += Integers.rotateRight(i3, 24);
      i3 ^= Integers.rotateRight(i2, 16);
      i2 ^= i8;
      i8 = RCON[4];
      i4 += Integers.rotateRight(i5, 31);
      i5 ^= Integers.rotateRight(i4, 24);
      i4 ^= i8;
      i4 += Integers.rotateRight(i5, 17);
      i5 ^= Integers.rotateRight(i4, 17);
      i4 ^= i8;
      i4 += i5;
      i5 ^= Integers.rotateRight(i4, 31);
      i4 ^= i8;
      i4 += Integers.rotateRight(i5, 24);
      i5 ^= Integers.rotateRight(i4, 16);
      i4 ^= i8;
      i8 = RCON[5];
      i6 += Integers.rotateRight(i7, 31);
      i7 ^= Integers.rotateRight(i6, 24);
      i6 ^= i8;
      i6 += Integers.rotateRight(i7, 17);
      i7 ^= Integers.rotateRight(i6, 17);
      i6 ^= i8;
      i6 += i7;
      i7 ^= Integers.rotateRight(i6, 31);
      i6 ^= i8;
      i6 += Integers.rotateRight(i7, 24);
      i7 ^= Integers.rotateRight(i6, 16);
      i6 ^= i8;
      i8 = ELL(i ^ k ^ n);
      int i9 = ELL(j ^ m ^ i1);
      int i10 = i ^ i2;
      int i11 = j ^ i3;
      int i12 = k ^ i4;
      int i13 = m ^ i5;
      int i14 = n ^ i6;
      int i15 = i1 ^ i7;
      i2 = i;
      i3 = j;
      i4 = k;
      i5 = m;
      i6 = n;
      i7 = i1;
      i = i12 ^ i9;
      j = i13 ^ i8;
      k = i14 ^ i9;
      m = i15 ^ i8;
      n = i10 ^ i9;
      i1 = i11 ^ i8;
    } 
    paramArrayOfint[0] = i;
    paramArrayOfint[1] = j;
    paramArrayOfint[2] = k;
    paramArrayOfint[3] = m;
    paramArrayOfint[4] = n;
    paramArrayOfint[5] = i1;
    paramArrayOfint[6] = i2;
    paramArrayOfint[7] = i3;
    paramArrayOfint[8] = i4;
    paramArrayOfint[9] = i5;
    paramArrayOfint[10] = i6;
    paramArrayOfint[11] = i7;
  }
  
  public static void sparkle_opt12(SparkleDigest.Friend paramFriend, int[] paramArrayOfint, int paramInt) {
    if (null == paramFriend)
      throw new NullPointerException("This method is only for use by SparkleDigest"); 
    sparkle_opt12(paramArrayOfint, paramInt);
  }
  
  static void sparkle_opt16(int[] paramArrayOfint, int paramInt) {
    int i = paramArrayOfint[0];
    int j = paramArrayOfint[1];
    int k = paramArrayOfint[2];
    int m = paramArrayOfint[3];
    int n = paramArrayOfint[4];
    int i1 = paramArrayOfint[5];
    int i2 = paramArrayOfint[6];
    int i3 = paramArrayOfint[7];
    int i4 = paramArrayOfint[8];
    int i5 = paramArrayOfint[9];
    int i6 = paramArrayOfint[10];
    int i7 = paramArrayOfint[11];
    int i8 = paramArrayOfint[12];
    int i9 = paramArrayOfint[13];
    int i10 = paramArrayOfint[14];
    int i11 = paramArrayOfint[15];
    for (byte b = 0; b < paramInt; b++) {
      j ^= RCON[b & 0x7];
      m ^= b;
      int i12 = RCON[0];
      i += Integers.rotateRight(j, 31);
      j ^= Integers.rotateRight(i, 24);
      i ^= i12;
      i += Integers.rotateRight(j, 17);
      j ^= Integers.rotateRight(i, 17);
      i ^= i12;
      i += j;
      j ^= Integers.rotateRight(i, 31);
      i ^= i12;
      i += Integers.rotateRight(j, 24);
      j ^= Integers.rotateRight(i, 16);
      i ^= i12;
      i12 = RCON[1];
      k += Integers.rotateRight(m, 31);
      m ^= Integers.rotateRight(k, 24);
      k ^= i12;
      k += Integers.rotateRight(m, 17);
      m ^= Integers.rotateRight(k, 17);
      k ^= i12;
      k += m;
      m ^= Integers.rotateRight(k, 31);
      k ^= i12;
      k += Integers.rotateRight(m, 24);
      m ^= Integers.rotateRight(k, 16);
      k ^= i12;
      i12 = RCON[2];
      n += Integers.rotateRight(i1, 31);
      i1 ^= Integers.rotateRight(n, 24);
      n ^= i12;
      n += Integers.rotateRight(i1, 17);
      i1 ^= Integers.rotateRight(n, 17);
      n ^= i12;
      n += i1;
      i1 ^= Integers.rotateRight(n, 31);
      n ^= i12;
      n += Integers.rotateRight(i1, 24);
      i1 ^= Integers.rotateRight(n, 16);
      n ^= i12;
      i12 = RCON[3];
      i2 += Integers.rotateRight(i3, 31);
      i3 ^= Integers.rotateRight(i2, 24);
      i2 ^= i12;
      i2 += Integers.rotateRight(i3, 17);
      i3 ^= Integers.rotateRight(i2, 17);
      i2 ^= i12;
      i2 += i3;
      i3 ^= Integers.rotateRight(i2, 31);
      i2 ^= i12;
      i2 += Integers.rotateRight(i3, 24);
      i3 ^= Integers.rotateRight(i2, 16);
      i2 ^= i12;
      i12 = RCON[4];
      i4 += Integers.rotateRight(i5, 31);
      i5 ^= Integers.rotateRight(i4, 24);
      i4 ^= i12;
      i4 += Integers.rotateRight(i5, 17);
      i5 ^= Integers.rotateRight(i4, 17);
      i4 ^= i12;
      i4 += i5;
      i5 ^= Integers.rotateRight(i4, 31);
      i4 ^= i12;
      i4 += Integers.rotateRight(i5, 24);
      i5 ^= Integers.rotateRight(i4, 16);
      i4 ^= i12;
      i12 = RCON[5];
      i6 += Integers.rotateRight(i7, 31);
      i7 ^= Integers.rotateRight(i6, 24);
      i6 ^= i12;
      i6 += Integers.rotateRight(i7, 17);
      i7 ^= Integers.rotateRight(i6, 17);
      i6 ^= i12;
      i6 += i7;
      i7 ^= Integers.rotateRight(i6, 31);
      i6 ^= i12;
      i6 += Integers.rotateRight(i7, 24);
      i7 ^= Integers.rotateRight(i6, 16);
      i6 ^= i12;
      i12 = RCON[6];
      i8 += Integers.rotateRight(i9, 31);
      i9 ^= Integers.rotateRight(i8, 24);
      i8 ^= i12;
      i8 += Integers.rotateRight(i9, 17);
      i9 ^= Integers.rotateRight(i8, 17);
      i8 ^= i12;
      i8 += i9;
      i9 ^= Integers.rotateRight(i8, 31);
      i8 ^= i12;
      i8 += Integers.rotateRight(i9, 24);
      i9 ^= Integers.rotateRight(i8, 16);
      i8 ^= i12;
      i12 = RCON[7];
      i10 += Integers.rotateRight(i11, 31);
      i11 ^= Integers.rotateRight(i10, 24);
      i10 ^= i12;
      i10 += Integers.rotateRight(i11, 17);
      i11 ^= Integers.rotateRight(i10, 17);
      i10 ^= i12;
      i10 += i11;
      i11 ^= Integers.rotateRight(i10, 31);
      i10 ^= i12;
      i10 += Integers.rotateRight(i11, 24);
      i11 ^= Integers.rotateRight(i10, 16);
      i10 ^= i12;
      i12 = ELL(i ^ k ^ n ^ i2);
      int i13 = ELL(j ^ m ^ i1 ^ i3);
      int i14 = i ^ i4;
      int i15 = j ^ i5;
      int i16 = k ^ i6;
      int i17 = m ^ i7;
      int i18 = n ^ i8;
      int i19 = i1 ^ i9;
      int i20 = i2 ^ i10;
      int i21 = i3 ^ i11;
      i4 = i;
      i5 = j;
      i6 = k;
      i7 = m;
      i8 = n;
      i9 = i1;
      i10 = i2;
      i11 = i3;
      i = i16 ^ i13;
      j = i17 ^ i12;
      k = i18 ^ i13;
      m = i19 ^ i12;
      n = i20 ^ i13;
      i1 = i21 ^ i12;
      i2 = i14 ^ i13;
      i3 = i15 ^ i12;
    } 
    paramArrayOfint[0] = i;
    paramArrayOfint[1] = j;
    paramArrayOfint[2] = k;
    paramArrayOfint[3] = m;
    paramArrayOfint[4] = n;
    paramArrayOfint[5] = i1;
    paramArrayOfint[6] = i2;
    paramArrayOfint[7] = i3;
    paramArrayOfint[8] = i4;
    paramArrayOfint[9] = i5;
    paramArrayOfint[10] = i6;
    paramArrayOfint[11] = i7;
    paramArrayOfint[12] = i8;
    paramArrayOfint[13] = i9;
    paramArrayOfint[14] = i10;
    paramArrayOfint[15] = i11;
  }
  
  public static void sparkle_opt16(SparkleDigest.Friend paramFriend, int[] paramArrayOfint, int paramInt) {
    if (null == paramFriend)
      throw new NullPointerException("This method is only for use by SparkleDigest"); 
    sparkle_opt16(paramArrayOfint, paramInt);
  }
  
  public enum SparkleParameters {
    SCHWAEMM128_128, SCHWAEMM256_128, SCHWAEMM192_192, SCHWAEMM256_256;
  }
  
  private enum State {
    Uninitialized, EncInit, EncAad, EncData, EncFinal, DecInit, DecAad, DecData, DecFinal;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\engines\SparkleEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */