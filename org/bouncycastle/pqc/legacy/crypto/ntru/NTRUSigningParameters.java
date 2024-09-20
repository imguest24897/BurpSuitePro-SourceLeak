package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;

public class NTRUSigningParameters implements Cloneable {
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
  
  int bitsF = 6;
  
  public Digest hashAlg;
  
  public NTRUSigningParameters(int paramInt1, int paramInt2, int paramInt3, int paramInt4, double paramDouble1, double paramDouble2, Digest paramDigest) {
    this.N = paramInt1;
    this.q = paramInt2;
    this.d = paramInt3;
    this.B = paramInt4;
    this.beta = paramDouble1;
    this.normBound = paramDouble2;
    this.hashAlg = paramDigest;
    init();
  }
  
  public NTRUSigningParameters(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double paramDouble1, double paramDouble2, double paramDouble3, Digest paramDigest) {
    this.N = paramInt1;
    this.q = paramInt2;
    this.d1 = paramInt3;
    this.d2 = paramInt4;
    this.d3 = paramInt5;
    this.B = paramInt6;
    this.beta = paramDouble1;
    this.normBound = paramDouble2;
    this.hashAlg = paramDigest;
    init();
  }
  
  private void init() {
    this.betaSq = this.beta * this.beta;
    this.normBoundSq = this.normBound * this.normBound;
  }
  
  public NTRUSigningParameters(InputStream paramInputStream) throws IOException {
    DataInputStream dataInputStream = new DataInputStream(paramInputStream);
    this.N = dataInputStream.readInt();
    this.q = dataInputStream.readInt();
    this.d = dataInputStream.readInt();
    this.d1 = dataInputStream.readInt();
    this.d2 = dataInputStream.readInt();
    this.d3 = dataInputStream.readInt();
    this.B = dataInputStream.readInt();
    this.beta = dataInputStream.readDouble();
    this.normBound = dataInputStream.readDouble();
    this.signFailTolerance = dataInputStream.readInt();
    this.bitsF = dataInputStream.readInt();
    String str = dataInputStream.readUTF();
    if ("SHA-512".equals(str)) {
      this.hashAlg = (Digest)new SHA512Digest();
    } else if ("SHA-256".equals(str)) {
      this.hashAlg = (Digest)new SHA256Digest();
    } 
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
    dataOutputStream.writeDouble(this.beta);
    dataOutputStream.writeDouble(this.normBound);
    dataOutputStream.writeInt(this.signFailTolerance);
    dataOutputStream.writeInt(this.bitsF);
    dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
  }
  
  public NTRUSigningParameters clone() {
    return new NTRUSigningParameters(this.N, this.q, this.d, this.B, this.beta, this.normBound, this.hashAlg);
  }
  
  public int hashCode() {
    null = 1;
    null = 31 * null + this.B;
    null = 31 * null + this.N;
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
    l = Double.doubleToLongBits(this.normBound);
    null = 31 * null + (int)(l ^ l >>> 32L);
    l = Double.doubleToLongBits(this.normBoundSq);
    null = 31 * null + (int)(l ^ l >>> 32L);
    null = 31 * null + this.q;
    return 31 * null + this.signFailTolerance;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (!(paramObject instanceof NTRUSigningParameters))
      return false; 
    NTRUSigningParameters nTRUSigningParameters = (NTRUSigningParameters)paramObject;
    if (this.B != nTRUSigningParameters.B)
      return false; 
    if (this.N != nTRUSigningParameters.N)
      return false; 
    if (Double.doubleToLongBits(this.beta) != Double.doubleToLongBits(nTRUSigningParameters.beta))
      return false; 
    if (Double.doubleToLongBits(this.betaSq) != Double.doubleToLongBits(nTRUSigningParameters.betaSq))
      return false; 
    if (this.bitsF != nTRUSigningParameters.bitsF)
      return false; 
    if (this.d != nTRUSigningParameters.d)
      return false; 
    if (this.d1 != nTRUSigningParameters.d1)
      return false; 
    if (this.d2 != nTRUSigningParameters.d2)
      return false; 
    if (this.d3 != nTRUSigningParameters.d3)
      return false; 
    if (this.hashAlg == null) {
      if (nTRUSigningParameters.hashAlg != null)
        return false; 
    } else if (!this.hashAlg.getAlgorithmName().equals(nTRUSigningParameters.hashAlg.getAlgorithmName())) {
      return false;
    } 
    return (Double.doubleToLongBits(this.normBound) != Double.doubleToLongBits(nTRUSigningParameters.normBound)) ? false : ((Double.doubleToLongBits(this.normBoundSq) != Double.doubleToLongBits(nTRUSigningParameters.normBoundSq)) ? false : ((this.q != nTRUSigningParameters.q) ? false : (!(this.signFailTolerance != nTRUSigningParameters.signFailTolerance))));
  }
  
  public String toString() {
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    StringBuilder stringBuilder = new StringBuilder("SignatureParameters(N=" + this.N + " q=" + this.q);
    stringBuilder.append(" B=" + this.B + " beta=" + decimalFormat.format(this.beta) + " normBound=" + decimalFormat.format(this.normBound) + " hashAlg=" + this.hashAlg + ")");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\ntru\NTRUSigningParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */