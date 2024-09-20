package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;

public class NTRUSigningKeyGenerationParameters extends KeyGenerationParameters implements Cloneable {
  public static final int BASIS_TYPE_STANDARD = 0;
  
  public static final int BASIS_TYPE_TRANSPOSE = 1;
  
  public static final int KEY_GEN_ALG_RESULTANT = 0;
  
  public static final int KEY_GEN_ALG_FLOAT = 1;
  
  public static final NTRUSigningKeyGenerationParameters APR2011_439 = new NTRUSigningKeyGenerationParameters(439, 2048, 146, 1, 1, 0.165D, 490.0D, 280.0D, false, true, 0, (Digest)new SHA256Digest());
  
  public static final NTRUSigningKeyGenerationParameters APR2011_439_PROD = new NTRUSigningKeyGenerationParameters(439, 2048, 9, 8, 5, 1, 1, 0.165D, 490.0D, 280.0D, false, true, 0, (Digest)new SHA256Digest());
  
  public static final NTRUSigningKeyGenerationParameters APR2011_743 = new NTRUSigningKeyGenerationParameters(743, 2048, 248, 1, 1, 0.127D, 560.0D, 360.0D, true, false, 0, (Digest)new SHA512Digest());
  
  public static final NTRUSigningKeyGenerationParameters APR2011_743_PROD = new NTRUSigningKeyGenerationParameters(743, 2048, 11, 11, 15, 1, 1, 0.127D, 560.0D, 360.0D, true, false, 0, (Digest)new SHA512Digest());
  
  public static final NTRUSigningKeyGenerationParameters TEST157 = new NTRUSigningKeyGenerationParameters(157, 256, 29, 1, 1, 0.38D, 200.0D, 80.0D, false, false, 0, (Digest)new SHA256Digest());
  
  public static final NTRUSigningKeyGenerationParameters TEST157_PROD = new NTRUSigningKeyGenerationParameters(157, 256, 5, 5, 8, 1, 1, 0.38D, 200.0D, 80.0D, false, false, 0, (Digest)new SHA256Digest());
  
  public int N;
  
  public int q;
  
  public int d;
  
  public int d1;
  
  public int d2;
  
  public int d3;
  
  public int B;
  
  double beta;
  
  public double betaSq;
  
  double normBound;
  
  public double normBoundSq;
  
  public int signFailTolerance = 100;
  
  double keyNormBound;
  
  public double keyNormBoundSq;
  
  public boolean primeCheck;
  
  public int basisType;
  
  int bitsF = 6;
  
  public boolean sparse;
  
  public int keyGenAlg;
  
  public Digest hashAlg;
  
  public int polyType;
  
  public NTRUSigningKeyGenerationParameters(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean1, boolean paramBoolean2, int paramInt6, Digest paramDigest) {
    super(CryptoServicesRegistrar.getSecureRandom(), paramInt1);
    this.N = paramInt1;
    this.q = paramInt2;
    this.d = paramInt3;
    this.B = paramInt4;
    this.basisType = paramInt5;
    this.beta = paramDouble1;
    this.normBound = paramDouble2;
    this.keyNormBound = paramDouble3;
    this.primeCheck = paramBoolean1;
    this.sparse = paramBoolean2;
    this.keyGenAlg = paramInt6;
    this.hashAlg = paramDigest;
    this.polyType = 0;
    init();
  }
  
  public NTRUSigningKeyGenerationParameters(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean1, boolean paramBoolean2, int paramInt8, Digest paramDigest) {
    super(CryptoServicesRegistrar.getSecureRandom(), paramInt1);
    this.N = paramInt1;
    this.q = paramInt2;
    this.d1 = paramInt3;
    this.d2 = paramInt4;
    this.d3 = paramInt5;
    this.B = paramInt6;
    this.basisType = paramInt7;
    this.beta = paramDouble1;
    this.normBound = paramDouble2;
    this.keyNormBound = paramDouble3;
    this.primeCheck = paramBoolean1;
    this.sparse = paramBoolean2;
    this.keyGenAlg = paramInt8;
    this.hashAlg = paramDigest;
    this.polyType = 1;
    init();
  }
  
  private void init() {
    this.betaSq = this.beta * this.beta;
    this.normBoundSq = this.normBound * this.normBound;
    this.keyNormBoundSq = this.keyNormBound * this.keyNormBound;
  }
  
  public NTRUSigningKeyGenerationParameters(InputStream paramInputStream) throws IOException {
    super(CryptoServicesRegistrar.getSecureRandom(), 0);
    DataInputStream dataInputStream = new DataInputStream(paramInputStream);
    this.N = dataInputStream.readInt();
    this.q = dataInputStream.readInt();
    this.d = dataInputStream.readInt();
    this.d1 = dataInputStream.readInt();
    this.d2 = dataInputStream.readInt();
    this.d3 = dataInputStream.readInt();
    this.B = dataInputStream.readInt();
    this.basisType = dataInputStream.readInt();
    this.beta = dataInputStream.readDouble();
    this.normBound = dataInputStream.readDouble();
    this.keyNormBound = dataInputStream.readDouble();
    this.signFailTolerance = dataInputStream.readInt();
    this.primeCheck = dataInputStream.readBoolean();
    this.sparse = dataInputStream.readBoolean();
    this.bitsF = dataInputStream.readInt();
    this.keyGenAlg = dataInputStream.read();
    String str = dataInputStream.readUTF();
    if ("SHA-512".equals(str)) {
      this.hashAlg = (Digest)new SHA512Digest();
    } else if ("SHA-256".equals(str)) {
      this.hashAlg = (Digest)new SHA256Digest();
    } 
    this.polyType = dataInputStream.read();
    init();
  }
  
  public void writeTo(OutputStream paramOutputStream) throws IOException {
    DataOutputStream dataOutputStream = new DataOutputStream(paramOutputStream);
    dataOutputStream.writeInt(this.N);
    dataOutputStream.writeInt(this.q);
    dataOutputStream.writeInt(this.d);
    dataOutputStream.writeInt(this.d1);
    dataOutputStream.writeInt(this.d2);
    dataOutputStream.writeInt(this.d3);
    dataOutputStream.writeInt(this.B);
    dataOutputStream.writeInt(this.basisType);
    dataOutputStream.writeDouble(this.beta);
    dataOutputStream.writeDouble(this.normBound);
    dataOutputStream.writeDouble(this.keyNormBound);
    dataOutputStream.writeInt(this.signFailTolerance);
    dataOutputStream.writeBoolean(this.primeCheck);
    dataOutputStream.writeBoolean(this.sparse);
    dataOutputStream.writeInt(this.bitsF);
    dataOutputStream.write(this.keyGenAlg);
    dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
    dataOutputStream.write(this.polyType);
  }
  
  public NTRUSigningParameters getSigningParameters() {
    return new NTRUSigningParameters(this.N, this.q, this.d, this.B, this.beta, this.normBound, this.hashAlg);
  }
  
  public NTRUSigningKeyGenerationParameters clone() {
    return (this.polyType == 0) ? new NTRUSigningKeyGenerationParameters(this.N, this.q, this.d, this.B, this.basisType, this.beta, this.normBound, this.keyNormBound, this.primeCheck, this.sparse, this.keyGenAlg, this.hashAlg) : new NTRUSigningKeyGenerationParameters(this.N, this.q, this.d1, this.d2, this.d3, this.B, this.basisType, this.beta, this.normBound, this.keyNormBound, this.primeCheck, this.sparse, this.keyGenAlg, this.hashAlg);
  }
  
  public int hashCode() {
    null = 1;
    null = 31 * null + this.B;
    null = 31 * null + this.N;
    null = 31 * null + this.basisType;
    long l = Double.doubleToLongBits(this.beta);
    null = 31 * null + (int)(l ^ l >>> 32L);
    l = Double.doubleToLongBits(this.betaSq);
    null = 31 * null + (int)(l ^ l >>> 32L);
    null = 31 * null + this.bitsF;
    null = 31 * null + this.d;
    null = 31 * null + this.d1;
    null = 31 * null + this.d2;
    null = 31 * null + this.d3;
    null = 31 * null + ((this.hashAlg == null) ? 0 : this.hashAlg.getAlgorithmName().hashCode());
    null = 31 * null + this.keyGenAlg;
    l = Double.doubleToLongBits(this.keyNormBound);
    null = 31 * null + (int)(l ^ l >>> 32L);
    l = Double.doubleToLongBits(this.keyNormBoundSq);
    null = 31 * null + (int)(l ^ l >>> 32L);
    l = Double.doubleToLongBits(this.normBound);
    null = 31 * null + (int)(l ^ l >>> 32L);
    l = Double.doubleToLongBits(this.normBoundSq);
    null = 31 * null + (int)(l ^ l >>> 32L);
    null = 31 * null + this.polyType;
    null = 31 * null + (this.primeCheck ? 1231 : 1237);
    null = 31 * null + this.q;
    null = 31 * null + this.signFailTolerance;
    return 31 * null + (this.sparse ? 1231 : 1237);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (!(paramObject instanceof NTRUSigningKeyGenerationParameters))
      return false; 
    NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = (NTRUSigningKeyGenerationParameters)paramObject;
    if (this.B != nTRUSigningKeyGenerationParameters.B)
      return false; 
    if (this.N != nTRUSigningKeyGenerationParameters.N)
      return false; 
    if (this.basisType != nTRUSigningKeyGenerationParameters.basisType)
      return false; 
    if (Double.doubleToLongBits(this.beta) != Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.beta))
      return false; 
    if (Double.doubleToLongBits(this.betaSq) != Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.betaSq))
      return false; 
    if (this.bitsF != nTRUSigningKeyGenerationParameters.bitsF)
      return false; 
    if (this.d != nTRUSigningKeyGenerationParameters.d)
      return false; 
    if (this.d1 != nTRUSigningKeyGenerationParameters.d1)
      return false; 
    if (this.d2 != nTRUSigningKeyGenerationParameters.d2)
      return false; 
    if (this.d3 != nTRUSigningKeyGenerationParameters.d3)
      return false; 
    if (this.hashAlg == null) {
      if (nTRUSigningKeyGenerationParameters.hashAlg != null)
        return false; 
    } else if (!this.hashAlg.getAlgorithmName().equals(nTRUSigningKeyGenerationParameters.hashAlg.getAlgorithmName())) {
      return false;
    } 
    return (this.keyGenAlg != nTRUSigningKeyGenerationParameters.keyGenAlg) ? false : ((Double.doubleToLongBits(this.keyNormBound) != Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.keyNormBound)) ? false : ((Double.doubleToLongBits(this.keyNormBoundSq) != Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.keyNormBoundSq)) ? false : ((Double.doubleToLongBits(this.normBound) != Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.normBound)) ? false : ((Double.doubleToLongBits(this.normBoundSq) != Double.doubleToLongBits(nTRUSigningKeyGenerationParameters.normBoundSq)) ? false : ((this.polyType != nTRUSigningKeyGenerationParameters.polyType) ? false : ((this.primeCheck != nTRUSigningKeyGenerationParameters.primeCheck) ? false : ((this.q != nTRUSigningKeyGenerationParameters.q) ? false : ((this.signFailTolerance != nTRUSigningKeyGenerationParameters.signFailTolerance) ? false : (!(this.sparse != nTRUSigningKeyGenerationParameters.sparse))))))))));
  }
  
  public String toString() {
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    StringBuilder stringBuilder = new StringBuilder("SignatureParameters(N=" + this.N + " q=" + this.q);
    if (this.polyType == 0) {
      stringBuilder.append(" polyType=SIMPLE d=" + this.d);
    } else {
      stringBuilder.append(" polyType=PRODUCT d1=" + this.d1 + " d2=" + this.d2 + " d3=" + this.d3);
    } 
    stringBuilder.append(" B=" + this.B + " basisType=" + this.basisType + " beta=" + decimalFormat.format(this.beta) + " normBound=" + decimalFormat.format(this.normBound) + " keyNormBound=" + decimalFormat.format(this.keyNormBound) + " prime=" + this.primeCheck + " sparse=" + this.sparse + " keyGenAlg=" + this.keyGenAlg + " hashAlg=" + this.hashAlg + ")");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\ntru\NTRUSigningKeyGenerationParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */