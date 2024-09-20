package META-INF.versions.9.org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;

public abstract class Polynomial {
  public short[] coeffs;
  
  protected NTRUParameterSet params;
  
  public Polynomial(NTRUParameterSet paramNTRUParameterSet) {
    this.coeffs = new short[paramNTRUParameterSet.n()];
    this.params = paramNTRUParameterSet;
  }
  
  static short bothNegativeMask(short paramShort1, short paramShort2) {
    return (short)((paramShort1 & paramShort2) >>> 15);
  }
  
  static short mod3(short paramShort) {
    return (short)((paramShort & 0xFFFF) % 3);
  }
  
  static byte mod3(byte paramByte) {
    return (byte)((paramByte & 0xFF) % 3);
  }
  
  static int modQ(int paramInt1, int paramInt2) {
    return paramInt1 % paramInt2;
  }
  
  public void mod3PhiN() {
    int i = this.params.n();
    for (byte b = 0; b < i; b++)
      this.coeffs[b] = mod3((short)(this.coeffs[b] + 2 * this.coeffs[i - 1])); 
  }
  
  public void modQPhiN() {
    int i = this.params.n();
    for (byte b = 0; b < i; b++)
      this.coeffs[b] = (short)(this.coeffs[b] - this.coeffs[i - 1]); 
  }
  
  public abstract byte[] sqToBytes(int paramInt);
  
  public abstract void sqFromBytes(byte[] paramArrayOfbyte);
  
  public byte[] rqSumZeroToBytes(int paramInt) {
    return sqToBytes(paramInt);
  }
  
  public void rqSumZeroFromBytes(byte[] paramArrayOfbyte) {
    int i = this.coeffs.length;
    sqFromBytes(paramArrayOfbyte);
    this.coeffs[i - 1] = 0;
    for (byte b = 0; b < this.params.packDegree(); b++)
      this.coeffs[i - 1] = (short)(this.coeffs[i - 1] - this.coeffs[b]); 
  }
  
  public byte[] s3ToBytes(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    int i;
    for (i = 0; i < this.params.packDegree() / 5; i++) {
      byte b = (byte)(this.coeffs[5 * i + 4] & 0xFF);
      b = (byte)(3 * b + this.coeffs[5 * i + 3] & 0xFF);
      b = (byte)(3 * b + this.coeffs[5 * i + 2] & 0xFF);
      b = (byte)(3 * b + this.coeffs[5 * i + 1] & 0xFF);
      b = (byte)(3 * b + this.coeffs[5 * i + 0] & 0xFF);
      arrayOfByte[i] = b;
    } 
    if (this.params.packDegree() > this.params.packDegree() / 5 * 5) {
      i = this.params.packDegree() / 5;
      byte b = 0;
      for (int j = this.params.packDegree() - 5 * i - 1; j >= 0; j--)
        b = (byte)(3 * b + this.coeffs[5 * i + j] & 0xFF); 
      arrayOfByte[i] = b;
    } 
    return arrayOfByte;
  }
  
  public void s3FromBytes(byte[] paramArrayOfbyte) {
    int i = this.coeffs.length;
    int j;
    for (j = 0; j < this.params.packDegree() / 5; j++) {
      byte b = paramArrayOfbyte[j];
      this.coeffs[5 * j + 0] = (short)b;
      this.coeffs[5 * j + 1] = (short)((b & 0xFF) * 171 >>> 9);
      this.coeffs[5 * j + 2] = (short)((b & 0xFF) * 57 >>> 9);
      this.coeffs[5 * j + 3] = (short)((b & 0xFF) * 19 >>> 9);
      this.coeffs[5 * j + 4] = (short)((b & 0xFF) * 203 >>> 14);
    } 
    if (this.params.packDegree() > this.params.packDegree() / 5 * 5) {
      j = this.params.packDegree() / 5;
      byte b = paramArrayOfbyte[j];
      for (byte b1 = 0; 5 * j + b1 < this.params.packDegree(); b1++) {
        this.coeffs[5 * j + b1] = (short)b;
        b = (byte)((b & 0xFF) * 171 >> 9);
      } 
    } 
    this.coeffs[i - 1] = 0;
    mod3PhiN();
  }
  
  public void sqMul(org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial1, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial2) {
    rqMul(paramPolynomial1, paramPolynomial2);
    modQPhiN();
  }
  
  public void rqMul(org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial1, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial2) {
    int i = this.coeffs.length;
    for (byte b = 0; b < i; b++) {
      this.coeffs[b] = 0;
      byte b1;
      for (b1 = 1; b1 < i - b; b1++)
        this.coeffs[b] = (short)(this.coeffs[b] + paramPolynomial1.coeffs[b + b1] * paramPolynomial2.coeffs[i - b1]); 
      for (b1 = 0; b1 < b + 1; b1++)
        this.coeffs[b] = (short)(this.coeffs[b] + paramPolynomial1.coeffs[b - b1] * paramPolynomial2.coeffs[b1]); 
    } 
  }
  
  public void s3Mul(org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial1, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial2) {
    rqMul(paramPolynomial1, paramPolynomial2);
    mod3PhiN();
  }
  
  public abstract void lift(org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial);
  
  public void rqToS3(org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial) {
    int i = this.coeffs.length;
    for (byte b = 0; b < i; b++) {
      this.coeffs[b] = (short)modQ(paramPolynomial.coeffs[b] & 0xFFFF, this.params.q());
      short s = (short)(this.coeffs[b] >>> this.params.logQ() - 1);
      this.coeffs[b] = (short)(this.coeffs[b] + (s << 1 - (this.params.logQ() & 0x1)));
    } 
    mod3PhiN();
  }
  
  public void r2Inv(org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial) {
    org.bouncycastle.pqc.math.ntru.Polynomial polynomial1 = this.params.createPolynomial();
    org.bouncycastle.pqc.math.ntru.Polynomial polynomial2 = this.params.createPolynomial();
    org.bouncycastle.pqc.math.ntru.Polynomial polynomial3 = this.params.createPolynomial();
    org.bouncycastle.pqc.math.ntru.Polynomial polynomial4 = this.params.createPolynomial();
    r2Inv(paramPolynomial, polynomial1, polynomial2, polynomial3, polynomial4);
  }
  
  public void rqInv(org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial) {
    org.bouncycastle.pqc.math.ntru.Polynomial polynomial1 = this.params.createPolynomial();
    org.bouncycastle.pqc.math.ntru.Polynomial polynomial2 = this.params.createPolynomial();
    org.bouncycastle.pqc.math.ntru.Polynomial polynomial3 = this.params.createPolynomial();
    org.bouncycastle.pqc.math.ntru.Polynomial polynomial4 = this.params.createPolynomial();
    rqInv(paramPolynomial, polynomial1, polynomial2, polynomial3, polynomial4);
  }
  
  public void s3Inv(org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial) {
    org.bouncycastle.pqc.math.ntru.Polynomial polynomial1 = this.params.createPolynomial();
    org.bouncycastle.pqc.math.ntru.Polynomial polynomial2 = this.params.createPolynomial();
    org.bouncycastle.pqc.math.ntru.Polynomial polynomial3 = this.params.createPolynomial();
    org.bouncycastle.pqc.math.ntru.Polynomial polynomial4 = this.params.createPolynomial();
    s3Inv(paramPolynomial, polynomial1, polynomial2, polynomial3, polynomial4);
  }
  
  void r2Inv(org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial1, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial2, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial3, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial4, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial5) {
    int i = this.coeffs.length;
    paramPolynomial5.coeffs[0] = 1;
    int j;
    for (j = 0; j < i; j++)
      paramPolynomial2.coeffs[j] = 1; 
    for (j = 0; j < i - 1; j++)
      paramPolynomial3.coeffs[i - 2 - j] = (short)((paramPolynomial1.coeffs[j] ^ paramPolynomial1.coeffs[i - 1]) & 0x1); 
    paramPolynomial3.coeffs[i - 1] = 0;
    short s = 1;
    for (byte b = 0; b < 2 * (i - 1) - 1; b++) {
      for (j = i - 1; j > 0; j--)
        paramPolynomial4.coeffs[j] = paramPolynomial4.coeffs[j - 1]; 
      paramPolynomial4.coeffs[0] = 0;
      short s1 = (short)(paramPolynomial3.coeffs[0] & paramPolynomial2.coeffs[0]);
      short s2 = bothNegativeMask((short)-s, (short)-paramPolynomial3.coeffs[0]);
      s = (short)(s ^ s2 & (s ^ -s));
      s = (short)(s + 1);
      for (j = 0; j < i; j++) {
        short s3 = (short)(s2 & (paramPolynomial2.coeffs[j] ^ paramPolynomial3.coeffs[j]));
        paramPolynomial2.coeffs[j] = (short)(paramPolynomial2.coeffs[j] ^ s3);
        paramPolynomial3.coeffs[j] = (short)(paramPolynomial3.coeffs[j] ^ s3);
        s3 = (short)(s2 & (paramPolynomial4.coeffs[j] ^ paramPolynomial5.coeffs[j]));
        paramPolynomial4.coeffs[j] = (short)(paramPolynomial4.coeffs[j] ^ s3);
        paramPolynomial5.coeffs[j] = (short)(paramPolynomial5.coeffs[j] ^ s3);
      } 
      for (j = 0; j < i; j++)
        paramPolynomial3.coeffs[j] = (short)(paramPolynomial3.coeffs[j] ^ s1 & paramPolynomial2.coeffs[j]); 
      for (j = 0; j < i; j++)
        paramPolynomial5.coeffs[j] = (short)(paramPolynomial5.coeffs[j] ^ s1 & paramPolynomial4.coeffs[j]); 
      for (j = 0; j < i - 1; j++)
        paramPolynomial3.coeffs[j] = paramPolynomial3.coeffs[j + 1]; 
      paramPolynomial3.coeffs[i - 1] = 0;
    } 
    for (j = 0; j < i - 1; j++)
      this.coeffs[j] = paramPolynomial4.coeffs[i - 2 - j]; 
    this.coeffs[i - 1] = 0;
  }
  
  void rqInv(org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial1, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial2, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial3, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial4, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial5) {
    paramPolynomial2.r2Inv(paramPolynomial1);
    r2InvToRqInv(paramPolynomial2, paramPolynomial1, paramPolynomial3, paramPolynomial4, paramPolynomial5);
  }
  
  private void r2InvToRqInv(org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial1, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial2, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial3, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial4, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial5) {
    int i = this.coeffs.length;
    byte b;
    for (b = 0; b < i; b++)
      paramPolynomial3.coeffs[b] = (short)-paramPolynomial2.coeffs[b]; 
    for (b = 0; b < i; b++)
      this.coeffs[b] = paramPolynomial1.coeffs[b]; 
    paramPolynomial4.rqMul(this, paramPolynomial3);
    paramPolynomial4.coeffs[0] = (short)(paramPolynomial4.coeffs[0] + 2);
    paramPolynomial5.rqMul(paramPolynomial4, this);
    paramPolynomial4.rqMul(paramPolynomial5, paramPolynomial3);
    paramPolynomial4.coeffs[0] = (short)(paramPolynomial4.coeffs[0] + 2);
    rqMul(paramPolynomial4, paramPolynomial5);
    paramPolynomial4.rqMul(this, paramPolynomial3);
    paramPolynomial4.coeffs[0] = (short)(paramPolynomial4.coeffs[0] + 2);
    paramPolynomial5.rqMul(paramPolynomial4, this);
    paramPolynomial4.rqMul(paramPolynomial5, paramPolynomial3);
    paramPolynomial4.coeffs[0] = (short)(paramPolynomial4.coeffs[0] + 2);
    rqMul(paramPolynomial4, paramPolynomial5);
  }
  
  void s3Inv(org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial1, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial2, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial3, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial4, org.bouncycastle.pqc.math.ntru.Polynomial paramPolynomial5) {
    int i = this.coeffs.length;
    paramPolynomial5.coeffs[0] = 1;
    int j;
    for (j = 0; j < i; j++)
      paramPolynomial2.coeffs[j] = 1; 
    for (j = 0; j < i - 1; j++)
      paramPolynomial3.coeffs[i - 2 - j] = mod3((short)((paramPolynomial1.coeffs[j] & 0x3) + 2 * (paramPolynomial1.coeffs[i - 1] & 0x3))); 
    paramPolynomial3.coeffs[i - 1] = 0;
    short s = 1;
    for (byte b = 0; b < 2 * (i - 1) - 1; b++) {
      for (j = i - 1; j > 0; j--)
        paramPolynomial4.coeffs[j] = paramPolynomial4.coeffs[j - 1]; 
      paramPolynomial4.coeffs[0] = 0;
      short s2 = (short)mod3((byte)(2 * paramPolynomial3.coeffs[0] * paramPolynomial2.coeffs[0]));
      short s3 = bothNegativeMask((short)-s, (short)-paramPolynomial3.coeffs[0]);
      s = (short)(s ^ s3 & (s ^ -s));
      s = (short)(s + 1);
      for (j = 0; j < i; j++) {
        short s4 = (short)(s3 & (paramPolynomial2.coeffs[j] ^ paramPolynomial3.coeffs[j]));
        paramPolynomial2.coeffs[j] = (short)(paramPolynomial2.coeffs[j] ^ s4);
        paramPolynomial3.coeffs[j] = (short)(paramPolynomial3.coeffs[j] ^ s4);
        s4 = (short)(s3 & (paramPolynomial4.coeffs[j] ^ paramPolynomial5.coeffs[j]));
        paramPolynomial4.coeffs[j] = (short)(paramPolynomial4.coeffs[j] ^ s4);
        paramPolynomial5.coeffs[j] = (short)(paramPolynomial5.coeffs[j] ^ s4);
      } 
      for (j = 0; j < i; j++)
        paramPolynomial3.coeffs[j] = (short)mod3((byte)(paramPolynomial3.coeffs[j] + s2 * paramPolynomial2.coeffs[j])); 
      for (j = 0; j < i; j++)
        paramPolynomial5.coeffs[j] = (short)mod3((byte)(paramPolynomial5.coeffs[j] + s2 * paramPolynomial4.coeffs[j])); 
      for (j = 0; j < i - 1; j++)
        paramPolynomial3.coeffs[j] = paramPolynomial3.coeffs[j + 1]; 
      paramPolynomial3.coeffs[i - 1] = 0;
    } 
    short s1 = paramPolynomial2.coeffs[0];
    for (j = 0; j < i - 1; j++)
      this.coeffs[j] = (short)mod3((byte)(s1 * paramPolynomial4.coeffs[i - 2 - j])); 
    this.coeffs[i - 1] = 0;
  }
  
  public void z3ToZq() {
    int i = this.coeffs.length;
    for (byte b = 0; b < i; b++)
      this.coeffs[b] = (short)(this.coeffs[b] | -(this.coeffs[b] >>> 1) & this.params.q() - 1); 
  }
  
  public void trinaryZqToZ3() {
    int i = this.coeffs.length;
    for (byte b = 0; b < i; b++) {
      this.coeffs[b] = (short)modQ(this.coeffs[b] & 0xFFFF, this.params.q());
      this.coeffs[b] = (short)(0x3 & (this.coeffs[b] ^ this.coeffs[b] >>> this.params.logQ() - 1));
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\math\ntru\Polynomial.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */