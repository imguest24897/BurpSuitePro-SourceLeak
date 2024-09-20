package org.bouncycastle.pqc.crypto.picnic;

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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\picnic\KMatricesWithPointer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */