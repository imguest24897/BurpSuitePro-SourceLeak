package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

class NTRUOWCPA {
  private final NTRUParameterSet params;
  
  private final NTRUSampling sampling;
  
  public NTRUOWCPA(NTRUParameterSet paramNTRUParameterSet) {
    this.params = paramNTRUParameterSet;
    this.sampling = new NTRUSampling(paramNTRUParameterSet);
  }
  
  public OWCPAKeyPair keypair(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte2 = new byte[this.params.owcpaSecretKeyBytes()];
    int i = this.params.n();
    int j = this.params.q();
    Polynomial polynomial1 = this.params.createPolynomial();
    Polynomial polynomial2 = this.params.createPolynomial();
    Polynomial polynomial3 = this.params.createPolynomial();
    Polynomial polynomial6 = polynomial1;
    Polynomial polynomial7 = polynomial1;
    Polynomial polynomial8 = polynomial2;
    Polynomial polynomial9 = polynomial3;
    Polynomial polynomial10 = polynomial1;
    Polynomial polynomial11 = polynomial1;
    PolynomialPair polynomialPair = this.sampling.sampleFg(paramArrayOfbyte);
    Polynomial polynomial4 = polynomialPair.f();
    Polynomial polynomial5 = polynomialPair.g();
    polynomial6.s3Inv(polynomial4);
    byte[] arrayOfByte3 = polynomial4.s3ToBytes(this.params.owcpaMsgBytes());
    System.arraycopy(arrayOfByte3, 0, arrayOfByte2, 0, arrayOfByte3.length);
    byte[] arrayOfByte4 = polynomial6.s3ToBytes(arrayOfByte2.length - this.params.packTrinaryBytes());
    System.arraycopy(arrayOfByte4, 0, arrayOfByte2, this.params.packTrinaryBytes(), arrayOfByte4.length);
    polynomial4.z3ToZq();
    polynomial5.z3ToZq();
    if (this.params instanceof org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet) {
      for (int k = i - 1; k > 0; k--)
        polynomial5.coeffs[k] = (short)(3 * (polynomial5.coeffs[k - 1] - polynomial5.coeffs[k])); 
      polynomial5.coeffs[0] = (short)-(3 * polynomial5.coeffs[0]);
    } else {
      for (byte b = 0; b < i; b++)
        polynomial5.coeffs[b] = (short)(3 * polynomial5.coeffs[b]); 
    } 
    polynomial7.rqMul(polynomial5, polynomial4);
    polynomial8.rqInv(polynomial7);
    polynomial9.rqMul(polynomial8, polynomial4);
    polynomial10.sqMul(polynomial9, polynomial4);
    byte[] arrayOfByte5 = polynomial10.sqToBytes(arrayOfByte2.length - 2 * this.params.packTrinaryBytes());
    System.arraycopy(arrayOfByte5, 0, arrayOfByte2, 2 * this.params.packTrinaryBytes(), arrayOfByte5.length);
    polynomial9.rqMul(polynomial8, polynomial5);
    polynomial11.rqMul(polynomial9, polynomial5);
    byte[] arrayOfByte1 = polynomial11.rqSumZeroToBytes(this.params.owcpaPublicKeyBytes());
    return new OWCPAKeyPair(arrayOfByte1, arrayOfByte2);
  }
  
  public byte[] encrypt(Polynomial paramPolynomial1, Polynomial paramPolynomial2, byte[] paramArrayOfbyte) {
    Polynomial polynomial1 = this.params.createPolynomial();
    Polynomial polynomial2 = this.params.createPolynomial();
    Polynomial polynomial3 = polynomial1;
    Polynomial polynomial4 = polynomial1;
    Polynomial polynomial5 = polynomial2;
    polynomial3.rqSumZeroFromBytes(paramArrayOfbyte);
    polynomial5.rqMul(paramPolynomial1, polynomial3);
    polynomial4.lift(paramPolynomial2);
    for (byte b = 0; b < this.params.n(); b++)
      polynomial5.coeffs[b] = (short)(polynomial5.coeffs[b] + polynomial4.coeffs[b]); 
    return polynomial5.rqSumZeroToBytes(this.params.ntruCiphertextBytes());
  }
  
  public OWCPADecryptResult decrypt(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte1 = paramArrayOfbyte2;
    byte[] arrayOfByte2 = new byte[this.params.owcpaMsgBytes()];
    Polynomial polynomial1 = this.params.createPolynomial();
    Polynomial polynomial2 = this.params.createPolynomial();
    Polynomial polynomial3 = this.params.createPolynomial();
    Polynomial polynomial4 = this.params.createPolynomial();
    Polynomial polynomial5 = polynomial1;
    Polynomial polynomial6 = polynomial2;
    Polynomial polynomial7 = polynomial3;
    Polynomial polynomial8 = polynomial2;
    Polynomial polynomial9 = polynomial3;
    Polynomial polynomial10 = polynomial4;
    Polynomial polynomial11 = polynomial2;
    Polynomial polynomial12 = polynomial3;
    Polynomial polynomial13 = polynomial4;
    Polynomial polynomial14 = polynomial1;
    polynomial5.rqSumZeroFromBytes(paramArrayOfbyte1);
    polynomial6.s3FromBytes(arrayOfByte1);
    polynomial6.z3ToZq();
    polynomial7.rqMul(polynomial5, polynomial6);
    polynomial8.rqToS3(polynomial7);
    polynomial9.s3FromBytes(Arrays.copyOfRange(arrayOfByte1, this.params.packTrinaryBytes(), arrayOfByte1.length));
    polynomial10.s3Mul(polynomial8, polynomial9);
    byte[] arrayOfByte3 = polynomial10.s3ToBytes(arrayOfByte2.length - this.params.packTrinaryBytes());
    int i = 0;
    i |= checkCiphertext(paramArrayOfbyte1);
    if (this.params instanceof NTRUHPSParameterSet)
      i |= checkM((HPSPolynomial)polynomial10); 
    polynomial11.lift(polynomial10);
    for (byte b = 0; b < this.params.n(); b++)
      polynomial14.coeffs[b] = (short)(polynomial5.coeffs[b] - polynomial11.coeffs[b]); 
    polynomial12.sqFromBytes(Arrays.copyOfRange(arrayOfByte1, 2 * this.params.packTrinaryBytes(), arrayOfByte1.length));
    polynomial13.sqMul(polynomial14, polynomial12);
    i |= checkR(polynomial13);
    polynomial13.trinaryZqToZ3();
    byte[] arrayOfByte4 = polynomial13.s3ToBytes(this.params.owcpaMsgBytes());
    System.arraycopy(arrayOfByte4, 0, arrayOfByte2, 0, arrayOfByte4.length);
    System.arraycopy(arrayOfByte3, 0, arrayOfByte2, this.params.packTrinaryBytes(), arrayOfByte3.length);
    return new OWCPADecryptResult(arrayOfByte2, i);
  }
  
  private int checkCiphertext(byte[] paramArrayOfbyte) {
    short s = (short)paramArrayOfbyte[this.params.ntruCiphertextBytes() - 1];
    s = (short)(s & 255 << 8 - (0x7 & this.params.logQ() * this.params.packDegree()));
    return 0x1 & (s ^ 0xFFFFFFFF) + 1 >>> 15;
  }
  
  private int checkR(Polynomial paramPolynomial) {
    int i = 0;
    for (byte b = 0; b < this.params.n() - 1; b++) {
      short s = paramPolynomial.coeffs[b];
      i |= s + 1 & this.params.q() - 4;
      i |= s + 2 & 0x4;
    } 
    i |= paramPolynomial.coeffs[this.params.n() - 1];
    return 0x1 & (i ^ 0xFFFFFFFF) + 1 >>> 31;
  }
  
  private int checkM(HPSPolynomial paramHPSPolynomial) {
    int i = 0;
    short s1 = 0;
    short s2 = 0;
    for (byte b = 0; b < this.params.n() - 1; b++) {
      s1 = (short)(s1 + (paramHPSPolynomial.coeffs[b] & 0x1));
      s2 = (short)(s2 + (paramHPSPolynomial.coeffs[b] & 0x2));
    } 
    i |= s1 ^ s2 >>> 1;
    i |= s2 ^ ((NTRUHPSParameterSet)this.params).weight();
    return 0x1 & (i ^ 0xFFFFFFFF) + 1 >>> 31;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntru\NTRUOWCPA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */