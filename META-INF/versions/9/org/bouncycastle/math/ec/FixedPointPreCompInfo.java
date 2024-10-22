package META-INF.versions.9.org.bouncycastle.math.ec;

import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.PreCompInfo;

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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\FixedPointPreCompInfo.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */