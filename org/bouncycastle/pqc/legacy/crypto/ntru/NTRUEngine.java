package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.DenseTernaryPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.IntegerPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.ProductFormPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.SparseTernaryPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.TernaryPolynomial;
import org.bouncycastle.util.Arrays;

public class NTRUEngine implements AsymmetricBlockCipher {
  private boolean forEncryption;
  
  private NTRUEncryptionParameters params;
  
  private NTRUEncryptionPublicKeyParameters pubKey;
  
  private NTRUEncryptionPrivateKeyParameters privKey;
  
  private SecureRandom random;
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    this.forEncryption = paramBoolean;
    SecureRandom secureRandom = null;
    if (paramCipherParameters instanceof ParametersWithRandom) {
      ParametersWithRandom parametersWithRandom = (ParametersWithRandom)paramCipherParameters;
      secureRandom = parametersWithRandom.getRandom();
      paramCipherParameters = parametersWithRandom.getParameters();
    } 
    if (paramBoolean) {
      this.pubKey = (NTRUEncryptionPublicKeyParameters)paramCipherParameters;
      this.privKey = null;
      this.params = this.pubKey.getParameters();
      this.random = CryptoServicesRegistrar.getSecureRandom(secureRandom);
    } else {
      this.pubKey = null;
      this.privKey = (NTRUEncryptionPrivateKeyParameters)paramCipherParameters;
      this.params = this.privKey.getParameters();
      this.random = null;
    } 
  }
  
  public int getInputBlockSize() {
    return this.params.maxMsgLenBytes;
  }
  
  public int getOutputBlockSize() {
    return (this.params.N * log2(this.params.q) + 7) / 8;
  }
  
  public byte[] processBlock(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws InvalidCipherTextException {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, 0, paramInt2);
    return this.forEncryption ? encrypt(arrayOfByte, this.pubKey) : decrypt(arrayOfByte, this.privKey);
  }
  
  private byte[] encrypt(byte[] paramArrayOfbyte, NTRUEncryptionPublicKeyParameters paramNTRUEncryptionPublicKeyParameters) {
    IntegerPolynomial integerPolynomial = paramNTRUEncryptionPublicKeyParameters.h;
    int i = this.params.N;
    int j = this.params.q;
    int k = this.params.maxMsgLenBytes;
    int m = this.params.db;
    int n = this.params.bufferLenBits;
    int i1 = this.params.dm0;
    int i2 = this.params.pkLen;
    int i3 = this.params.minCallsMask;
    boolean bool = this.params.hashSeed;
    byte[] arrayOfByte = this.params.oid;
    int i4 = paramArrayOfbyte.length;
    if (k > 255)
      throw new IllegalArgumentException("llen values bigger than 1 are not supported"); 
    if (i4 > k)
      throw new DataLengthException("Message too long: " + i4 + ">" + k); 
    while (true) {
      byte[] arrayOfByte1 = new byte[m / 8];
      this.random.nextBytes(arrayOfByte1);
      byte[] arrayOfByte2 = new byte[k + 1 - i4];
      byte[] arrayOfByte3 = new byte[n / 8];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, arrayOfByte1.length);
      arrayOfByte3[arrayOfByte1.length] = (byte)i4;
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte3, arrayOfByte1.length + 1, paramArrayOfbyte.length);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte3, arrayOfByte1.length + 1 + paramArrayOfbyte.length, arrayOfByte2.length);
      IntegerPolynomial integerPolynomial1 = IntegerPolynomial.fromBinary3Sves(arrayOfByte3, i);
      byte[] arrayOfByte4 = integerPolynomial.toBinary(j);
      byte[] arrayOfByte5 = copyOf(arrayOfByte4, i2 / 8);
      byte[] arrayOfByte6 = buildSData(arrayOfByte, paramArrayOfbyte, i4, arrayOfByte1, arrayOfByte5);
      Polynomial polynomial = generateBlindingPoly(arrayOfByte6, arrayOfByte3);
      IntegerPolynomial integerPolynomial2 = polynomial.mult(integerPolynomial, j);
      IntegerPolynomial integerPolynomial3 = (IntegerPolynomial)integerPolynomial2.clone();
      integerPolynomial3.modPositive(4);
      byte[] arrayOfByte7 = integerPolynomial3.toBinary(4);
      IntegerPolynomial integerPolynomial4 = MGF(arrayOfByte7, i, i3, bool);
      integerPolynomial1.add(integerPolynomial4);
      integerPolynomial1.mod3();
      if (integerPolynomial1.count(-1) < i1 || integerPolynomial1.count(0) < i1 || integerPolynomial1.count(1) < i1)
        continue; 
      integerPolynomial2.add(integerPolynomial1, j);
      integerPolynomial2.ensurePositive(j);
      return integerPolynomial2.toBinary(j);
    } 
  }
  
  private byte[] buildSData(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4) {
    byte[] arrayOfByte = new byte[paramArrayOfbyte1.length + paramInt + paramArrayOfbyte3.length + paramArrayOfbyte4.length];
    System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramArrayOfbyte1.length);
    System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, paramArrayOfbyte1.length, paramArrayOfbyte2.length);
    System.arraycopy(paramArrayOfbyte3, 0, arrayOfByte, paramArrayOfbyte1.length + paramArrayOfbyte2.length, paramArrayOfbyte3.length);
    System.arraycopy(paramArrayOfbyte4, 0, arrayOfByte, paramArrayOfbyte1.length + paramArrayOfbyte2.length + paramArrayOfbyte3.length, paramArrayOfbyte4.length);
    return arrayOfByte;
  }
  
  protected IntegerPolynomial encrypt(IntegerPolynomial paramIntegerPolynomial1, TernaryPolynomial paramTernaryPolynomial, IntegerPolynomial paramIntegerPolynomial2) {
    IntegerPolynomial integerPolynomial = paramTernaryPolynomial.mult(paramIntegerPolynomial2, this.params.q);
    integerPolynomial.add(paramIntegerPolynomial1, this.params.q);
    integerPolynomial.ensurePositive(this.params.q);
    return integerPolynomial;
  }
  
  private Polynomial generateBlindingPoly(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    IndexGenerator indexGenerator = new IndexGenerator(paramArrayOfbyte1, this.params);
    if (this.params.polyType == 1) {
      SparseTernaryPolynomial sparseTernaryPolynomial1 = new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, this.params.dr1));
      SparseTernaryPolynomial sparseTernaryPolynomial2 = new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, this.params.dr2));
      SparseTernaryPolynomial sparseTernaryPolynomial3 = new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, this.params.dr3));
      return (Polynomial)new ProductFormPolynomial(sparseTernaryPolynomial1, sparseTernaryPolynomial2, sparseTernaryPolynomial3);
    } 
    int i = this.params.dr;
    boolean bool = this.params.sparse;
    int[] arrayOfInt = generateBlindingCoeffs(indexGenerator, i);
    return (Polynomial)(bool ? new SparseTernaryPolynomial(arrayOfInt) : new DenseTernaryPolynomial(arrayOfInt));
  }
  
  private int[] generateBlindingCoeffs(IndexGenerator paramIndexGenerator, int paramInt) {
    int i = this.params.N;
    int[] arrayOfInt = new int[i];
    for (byte b = -1; b <= 1; b += 2) {
      byte b1 = 0;
      while (b1 < paramInt) {
        int j = paramIndexGenerator.nextIndex();
        if (arrayOfInt[j] == 0) {
          arrayOfInt[j] = b;
          b1++;
        } 
      } 
    } 
    return arrayOfInt;
  }
  
  private IntegerPolynomial MGF(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    Digest digest = this.params.hashAlg;
    int i = digest.getDigestSize();
    byte[] arrayOfByte1 = new byte[paramInt2 * i];
    byte[] arrayOfByte2 = paramBoolean ? calcHash(digest, paramArrayOfbyte) : paramArrayOfbyte;
    byte b;
    for (b = 0; b < paramInt2; b++) {
      digest.update(arrayOfByte2, 0, arrayOfByte2.length);
      putInt(digest, b);
      byte[] arrayOfByte = calcHash(digest);
      System.arraycopy(arrayOfByte, 0, arrayOfByte1, b * i, i);
    } 
    IntegerPolynomial integerPolynomial = new IntegerPolynomial(paramInt1);
    while (true) {
      byte b1 = 0;
      for (byte b2 = 0; b2 != arrayOfByte1.length; b2++) {
        int j = arrayOfByte1[b2] & 0xFF;
        if (j < 243) {
          for (byte b3 = 0; b3 < 4; b3++) {
            int k = j % 3;
            integerPolynomial.coeffs[b1] = k - 1;
            if (++b1 == paramInt1)
              return integerPolynomial; 
            j = (j - k) / 3;
          } 
          integerPolynomial.coeffs[b1] = j - 1;
          if (++b1 == paramInt1)
            return integerPolynomial; 
        } 
      } 
      if (b1 >= paramInt1)
        return integerPolynomial; 
      digest.update(arrayOfByte2, 0, arrayOfByte2.length);
      putInt(digest, b);
      byte[] arrayOfByte = calcHash(digest);
      arrayOfByte1 = arrayOfByte;
      b++;
    } 
  }
  
  private void putInt(Digest paramDigest, int paramInt) {
    paramDigest.update((byte)(paramInt >> 24));
    paramDigest.update((byte)(paramInt >> 16));
    paramDigest.update((byte)(paramInt >> 8));
    paramDigest.update((byte)paramInt);
  }
  
  private byte[] calcHash(Digest paramDigest) {
    byte[] arrayOfByte = new byte[paramDigest.getDigestSize()];
    paramDigest.doFinal(arrayOfByte, 0);
    return arrayOfByte;
  }
  
  private byte[] calcHash(Digest paramDigest, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[paramDigest.getDigestSize()];
    paramDigest.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    paramDigest.doFinal(arrayOfByte, 0);
    return arrayOfByte;
  }
  
  private byte[] decrypt(byte[] paramArrayOfbyte, NTRUEncryptionPrivateKeyParameters paramNTRUEncryptionPrivateKeyParameters) throws InvalidCipherTextException {
    Polynomial polynomial1 = paramNTRUEncryptionPrivateKeyParameters.t;
    IntegerPolynomial integerPolynomial1 = paramNTRUEncryptionPrivateKeyParameters.fp;
    IntegerPolynomial integerPolynomial2 = paramNTRUEncryptionPrivateKeyParameters.h;
    int i = this.params.N;
    int j = this.params.q;
    int k = this.params.db;
    int m = this.params.maxMsgLenBytes;
    int n = this.params.dm0;
    int i1 = this.params.pkLen;
    int i2 = this.params.minCallsMask;
    boolean bool = this.params.hashSeed;
    byte[] arrayOfByte1 = this.params.oid;
    if (m > 255)
      throw new DataLengthException("maxMsgLenBytes values bigger than 255 are not supported"); 
    int i3 = k / 8;
    IntegerPolynomial integerPolynomial3 = IntegerPolynomial.fromBinary(paramArrayOfbyte, i, j);
    IntegerPolynomial integerPolynomial4 = decrypt(integerPolynomial3, polynomial1, integerPolynomial1);
    if (integerPolynomial4.count(-1) < n)
      throw new InvalidCipherTextException("Less than dm0 coefficients equal -1"); 
    if (integerPolynomial4.count(0) < n)
      throw new InvalidCipherTextException("Less than dm0 coefficients equal 0"); 
    if (integerPolynomial4.count(1) < n)
      throw new InvalidCipherTextException("Less than dm0 coefficients equal 1"); 
    IntegerPolynomial integerPolynomial5 = (IntegerPolynomial)integerPolynomial3.clone();
    integerPolynomial5.sub(integerPolynomial4);
    integerPolynomial5.modPositive(j);
    IntegerPolynomial integerPolynomial6 = (IntegerPolynomial)integerPolynomial5.clone();
    integerPolynomial6.modPositive(4);
    byte[] arrayOfByte2 = integerPolynomial6.toBinary(4);
    IntegerPolynomial integerPolynomial7 = MGF(arrayOfByte2, i, i2, bool);
    IntegerPolynomial integerPolynomial8 = integerPolynomial4;
    integerPolynomial8.sub(integerPolynomial7);
    integerPolynomial8.mod3();
    byte[] arrayOfByte3 = integerPolynomial8.toBinary3Sves();
    byte[] arrayOfByte4 = new byte[i3];
    System.arraycopy(arrayOfByte3, 0, arrayOfByte4, 0, i3);
    int i4 = arrayOfByte3[i3] & 0xFF;
    if (i4 > m)
      throw new InvalidCipherTextException("Message too long: " + i4 + ">" + m); 
    byte[] arrayOfByte5 = new byte[i4];
    System.arraycopy(arrayOfByte3, i3 + 1, arrayOfByte5, 0, i4);
    byte[] arrayOfByte6 = new byte[arrayOfByte3.length - i3 + 1 + i4];
    System.arraycopy(arrayOfByte3, i3 + 1 + i4, arrayOfByte6, 0, arrayOfByte6.length);
    if (!Arrays.constantTimeAreEqual(arrayOfByte6, new byte[arrayOfByte6.length]))
      throw new InvalidCipherTextException("The message is not followed by zeroes"); 
    byte[] arrayOfByte7 = integerPolynomial2.toBinary(j);
    byte[] arrayOfByte8 = copyOf(arrayOfByte7, i1 / 8);
    byte[] arrayOfByte9 = buildSData(arrayOfByte1, arrayOfByte5, i4, arrayOfByte4, arrayOfByte8);
    Polynomial polynomial2 = generateBlindingPoly(arrayOfByte9, arrayOfByte5);
    IntegerPolynomial integerPolynomial9 = polynomial2.mult(integerPolynomial2);
    integerPolynomial9.modPositive(j);
    if (!integerPolynomial9.equals(integerPolynomial5))
      throw new InvalidCipherTextException("Invalid message encoding"); 
    return arrayOfByte5;
  }
  
  protected IntegerPolynomial decrypt(IntegerPolynomial paramIntegerPolynomial1, Polynomial paramPolynomial, IntegerPolynomial paramIntegerPolynomial2) {
    IntegerPolynomial integerPolynomial1;
    if (this.params.fastFp) {
      integerPolynomial1 = paramPolynomial.mult(paramIntegerPolynomial1, this.params.q);
      integerPolynomial1.mult(3);
      integerPolynomial1.add(paramIntegerPolynomial1);
    } else {
      integerPolynomial1 = paramPolynomial.mult(paramIntegerPolynomial1, this.params.q);
    } 
    integerPolynomial1.center0(this.params.q);
    integerPolynomial1.mod3();
    IntegerPolynomial integerPolynomial2 = this.params.fastFp ? integerPolynomial1 : (new DenseTernaryPolynomial(integerPolynomial1)).mult(paramIntegerPolynomial2, 3);
    integerPolynomial2.center0(3);
    return integerPolynomial2;
  }
  
  private byte[] copyOf(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, (paramInt < paramArrayOfbyte.length) ? paramInt : paramArrayOfbyte.length);
    return arrayOfByte;
  }
  
  private int log2(int paramInt) {
    if (paramInt == 2048)
      return 11; 
    throw new IllegalStateException("log2 not fully implemented");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\ntru\NTRUEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */