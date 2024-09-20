package META-INF.versions.9.org.bouncycastle.pqc.math.ntru.parameters;

import org.bouncycastle.pqc.math.ntru.Polynomial;

public abstract class NTRUParameterSet {
  private final int n;
  
  private final int logQ;
  
  private final int seedBytes;
  
  private final int prfKeyBytes;
  
  private final int sharedKeyBytes;
  
  public NTRUParameterSet(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.n = paramInt1;
    this.logQ = paramInt2;
    this.seedBytes = paramInt3;
    this.prfKeyBytes = paramInt4;
    this.sharedKeyBytes = paramInt5;
  }
  
  public abstract Polynomial createPolynomial();
  
  public int n() {
    return this.n;
  }
  
  public int logQ() {
    return this.logQ;
  }
  
  public int q() {
    return 1 << this.logQ;
  }
  
  public int seedBytes() {
    return this.seedBytes;
  }
  
  public int prfKeyBytes() {
    return this.prfKeyBytes;
  }
  
  public int sharedKeyBytes() {
    return this.sharedKeyBytes;
  }
  
  public int sampleIidBytes() {
    return this.n - 1;
  }
  
  public int sampleFixedTypeBytes() {
    return (30 * (this.n - 1) + 7) / 8;
  }
  
  public abstract int sampleFgBytes();
  
  public abstract int sampleRmBytes();
  
  public int packDegree() {
    return this.n - 1;
  }
  
  public int packTrinaryBytes() {
    return (packDegree() + 4) / 5;
  }
  
  public int owcpaMsgBytes() {
    return 2 * packTrinaryBytes();
  }
  
  public int owcpaPublicKeyBytes() {
    return (this.logQ * packDegree() + 7) / 8;
  }
  
  public int owcpaSecretKeyBytes() {
    return 2 * packTrinaryBytes() + owcpaPublicKeyBytes();
  }
  
  public int owcpaBytes() {
    return (this.logQ * packDegree() + 7) / 8;
  }
  
  public int ntruPublicKeyBytes() {
    return owcpaPublicKeyBytes();
  }
  
  public int ntruSecretKeyBytes() {
    return owcpaSecretKeyBytes() + this.prfKeyBytes;
  }
  
  public int ntruCiphertextBytes() {
    return owcpaBytes();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\math\ntru\parameters\NTRUParameterSet.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */