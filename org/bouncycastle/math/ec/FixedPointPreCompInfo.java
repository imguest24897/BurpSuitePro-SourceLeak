package org.bouncycastle.math.ec;

public class FixedPointPreCompInfo implements PreCompInfo {
  protected ECPoint offset = null;
  
  protected ECLookupTable lookupTable = null;
  
  protected int width = -1;
  
  public ECLookupTable getLookupTable() {
    return this.lookupTable;
  }
  
  public void setLookupTable(ECLookupTable paramECLookupTable) {
    this.lookupTable = paramECLookupTable;
  }
  
  public ECPoint getOffset() {
    return this.offset;
  }
  
  public void setOffset(ECPoint paramECPoint) {
    this.offset = paramECPoint;
  }
  
  public int getWidth() {
    return this.width;
  }
  
  public void setWidth(int paramInt) {
    this.width = paramInt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\FixedPointPreCompInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */