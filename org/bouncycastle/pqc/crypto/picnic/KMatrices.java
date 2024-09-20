package org.bouncycastle.pqc.crypto.picnic;

class KMatrices {
  private int nmatrices;
  
  private int rows;
  
  private int columns;
  
  private int[] data;
  
  public KMatrices(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint) {
    this.nmatrices = paramInt1;
    this.rows = paramInt2;
    this.columns = paramInt3;
    this.data = paramArrayOfint;
  }
  
  public int getNmatrices() {
    return this.nmatrices;
  }
  
  public int getSize() {
    return this.rows * this.columns;
  }
  
  public int getRows() {
    return this.rows;
  }
  
  public int getColumns() {
    return this.columns;
  }
  
  public int[] getData() {
    return this.data;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\picnic\KMatrices.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */