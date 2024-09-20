package META-INF.versions.9.org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.pqc.crypto.picnic.KMatrices;

class KMatricesWithPointer extends KMatrices {
  private int matrixPointer = 0;
  
  public KMatricesWithPointer(KMatrices paramKMatrices) {
    super(paramKMatrices.getNmatrices(), paramKMatrices.getRows(), paramKMatrices.getColumns(), paramKMatrices.getData());
  }
  
  public int getMatrixPointer() {
    return this.matrixPointer;
  }
  
  public void setMatrixPointer(int paramInt) {
    this.matrixPointer = paramInt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\picnic\KMatricesWithPointer.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */