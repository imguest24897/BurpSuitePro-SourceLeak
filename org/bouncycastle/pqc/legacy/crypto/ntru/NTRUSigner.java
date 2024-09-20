package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.nio.ByteBuffer;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.IntegerPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial;

public class NTRUSigner {
  private NTRUSigningParameters params;
  
  private Digest hashAlg;
  
  private NTRUSigningPrivateKeyParameters signingKeyPair;
  
  private NTRUSigningPublicKeyParameters verificationKey;
  
  public NTRUSigner(NTRUSigningParameters paramNTRUSigningParameters) {
    this.params = paramNTRUSigningParameters;
  }
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    if (paramBoolean) {
      this.signingKeyPair = (NTRUSigningPrivateKeyParameters)paramCipherParameters;
    } else {
      this.verificationKey = (NTRUSigningPublicKeyParameters)paramCipherParameters;
    } 
    this.hashAlg = this.params.hashAlg;
    this.hashAlg.reset();
  }
  
  public void update(byte paramByte) {
    if (this.hashAlg == null)
      throw new IllegalStateException("Call initSign or initVerify first!"); 
    this.hashAlg.update(paramByte);
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.hashAlg == null)
      throw new IllegalStateException("Call initSign or initVerify first!"); 
    this.hashAlg.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public byte[] generateSignature() {
    if (this.hashAlg == null || this.signingKeyPair == null)
      throw new IllegalStateException("Call initSign first!"); 
    byte[] arrayOfByte = new byte[this.hashAlg.getDigestSize()];
    this.hashAlg.doFinal(arrayOfByte, 0);
    return signHash(arrayOfByte, this.signingKeyPair);
  }
  
  private byte[] signHash(byte[] paramArrayOfbyte, NTRUSigningPrivateKeyParameters paramNTRUSigningPrivateKeyParameters) {
    byte b = 0;
    NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters = paramNTRUSigningPrivateKeyParameters.getPublicKey();
    while (true) {
      if (++b > this.params.signFailTolerance)
        throw new IllegalStateException("Signing failed: too many retries (max=" + this.params.signFailTolerance + ")"); 
      IntegerPolynomial integerPolynomial2 = createMsgRep(paramArrayOfbyte, b);
      IntegerPolynomial integerPolynomial1 = sign(integerPolynomial2, paramNTRUSigningPrivateKeyParameters);
      if (verify(integerPolynomial2, integerPolynomial1, nTRUSigningPublicKeyParameters.h)) {
        byte[] arrayOfByte = integerPolynomial1.toBinary(this.params.q);
        ByteBuffer byteBuffer = ByteBuffer.allocate(arrayOfByte.length + 4);
        byteBuffer.put(arrayOfByte);
        byteBuffer.putInt(b);
        return byteBuffer.array();
      } 
    } 
  }
  
  private IntegerPolynomial sign(IntegerPolynomial paramIntegerPolynomial, NTRUSigningPrivateKeyParameters paramNTRUSigningPrivateKeyParameters) {
    int i = this.params.N;
    int j = this.params.q;
    int k = this.params.B;
    NTRUSigningPrivateKeyParameters nTRUSigningPrivateKeyParameters = paramNTRUSigningPrivateKeyParameters;
    NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters = paramNTRUSigningPrivateKeyParameters.getPublicKey();
    IntegerPolynomial integerPolynomial1 = new IntegerPolynomial(i);
    for (int m = k; m >= 1; m--) {
      Polynomial polynomial3 = (nTRUSigningPrivateKeyParameters.getBasis(m)).f;
      Polynomial polynomial4 = (nTRUSigningPrivateKeyParameters.getBasis(m)).fPrime;
      IntegerPolynomial integerPolynomial4 = polynomial3.mult(paramIntegerPolynomial);
      integerPolynomial4.div(j);
      integerPolynomial4 = polynomial4.mult(integerPolynomial4);
      IntegerPolynomial integerPolynomial5 = polynomial4.mult(paramIntegerPolynomial);
      integerPolynomial5.div(j);
      integerPolynomial5 = polynomial3.mult(integerPolynomial5);
      IntegerPolynomial integerPolynomial6 = integerPolynomial4;
      integerPolynomial6.sub(integerPolynomial5);
      integerPolynomial1.add(integerPolynomial6);
      IntegerPolynomial integerPolynomial7 = (IntegerPolynomial)(nTRUSigningPrivateKeyParameters.getBasis(m)).h.clone();
      if (m > 1) {
        integerPolynomial7.sub((nTRUSigningPrivateKeyParameters.getBasis(m - 1)).h);
      } else {
        integerPolynomial7.sub(nTRUSigningPublicKeyParameters.h);
      } 
      paramIntegerPolynomial = integerPolynomial6.mult(integerPolynomial7, j);
    } 
    Polynomial polynomial1 = (nTRUSigningPrivateKeyParameters.getBasis(0)).f;
    Polynomial polynomial2 = (nTRUSigningPrivateKeyParameters.getBasis(0)).fPrime;
    IntegerPolynomial integerPolynomial2 = polynomial1.mult(paramIntegerPolynomial);
    integerPolynomial2.div(j);
    integerPolynomial2 = polynomial2.mult(integerPolynomial2);
    IntegerPolynomial integerPolynomial3 = polynomial2.mult(paramIntegerPolynomial);
    integerPolynomial3.div(j);
    integerPolynomial3 = polynomial1.mult(integerPolynomial3);
    integerPolynomial2.sub(integerPolynomial3);
    integerPolynomial1.add(integerPolynomial2);
    integerPolynomial1.modPositive(j);
    return integerPolynomial1;
  }
  
  public boolean verifySignature(byte[] paramArrayOfbyte) {
    if (this.hashAlg == null || this.verificationKey == null)
      throw new IllegalStateException("Call initVerify first!"); 
    byte[] arrayOfByte = new byte[this.hashAlg.getDigestSize()];
    this.hashAlg.doFinal(arrayOfByte, 0);
    return verifyHash(arrayOfByte, paramArrayOfbyte, this.verificationKey);
  }
  
  private boolean verifyHash(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, NTRUSigningPublicKeyParameters paramNTRUSigningPublicKeyParameters) {
    ByteBuffer byteBuffer = ByteBuffer.wrap(paramArrayOfbyte2);
    byte[] arrayOfByte = new byte[paramArrayOfbyte2.length - 4];
    byteBuffer.get(arrayOfByte);
    IntegerPolynomial integerPolynomial = IntegerPolynomial.fromBinary(arrayOfByte, this.params.N, this.params.q);
    int i = byteBuffer.getInt();
    return verify(createMsgRep(paramArrayOfbyte1, i), integerPolynomial, paramNTRUSigningPublicKeyParameters.h);
  }
  
  private boolean verify(IntegerPolynomial paramIntegerPolynomial1, IntegerPolynomial paramIntegerPolynomial2, IntegerPolynomial paramIntegerPolynomial3) {
    int i = this.params.q;
    double d1 = this.params.normBoundSq;
    double d2 = this.params.betaSq;
    IntegerPolynomial integerPolynomial = paramIntegerPolynomial3.mult(paramIntegerPolynomial2, i);
    integerPolynomial.sub(paramIntegerPolynomial1);
    long l = (long)(paramIntegerPolynomial2.centeredNormSq(i) + d2 * integerPolynomial.centeredNormSq(i));
    return (l <= d1);
  }
  
  protected IntegerPolynomial createMsgRep(byte[] paramArrayOfbyte, int paramInt) {
    int i = this.params.N;
    int j = this.params.q;
    int k = 31 - Integer.numberOfLeadingZeros(j);
    int m = (k + 7) / 8;
    IntegerPolynomial integerPolynomial = new IntegerPolynomial(i);
    ByteBuffer byteBuffer = ByteBuffer.allocate(paramArrayOfbyte.length + 4);
    byteBuffer.put(paramArrayOfbyte);
    byteBuffer.putInt(paramInt);
    NTRUSignerPrng nTRUSignerPrng = new NTRUSignerPrng(byteBuffer.array(), this.params.hashAlg);
    for (byte b = 0; b < i; b++) {
      byte[] arrayOfByte = nTRUSignerPrng.nextBytes(m);
      byte b1 = arrayOfByte[arrayOfByte.length - 1];
      int n = b1 >> 8 * m - k;
      n <<= 8 * m - k;
      arrayOfByte[arrayOfByte.length - 1] = (byte)n;
      ByteBuffer byteBuffer1 = ByteBuffer.allocate(4);
      byteBuffer1.put(arrayOfByte);
      byteBuffer1.rewind();
      integerPolynomial.coeffs[b] = Integer.reverseBytes(byteBuffer1.getInt());
    } 
    return integerPolynomial;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\ntru\NTRUSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */