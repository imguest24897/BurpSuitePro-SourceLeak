package META-INF.versions.9.org.bouncycastle.pqc.crypto.frodo;

abstract class FrodoMatrixGenerator {
  int n;
  
  int q;
  
  public FrodoMatrixGenerator(int paramInt1, int paramInt2) {
    this.n = paramInt1;
    this.q = paramInt2;
  }
  
  abstract short[] genMatrix(byte[] paramArrayOfbyte);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\frodo\FrodoMatrixGenerator.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */