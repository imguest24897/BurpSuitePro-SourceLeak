package burp;

import javax.swing.SortOrder;

public class Z_k extends Zni implements Zzrc {
  @Zzvo(1)
  private int ZM;
  
  private SortOrder ZY;
  
  public Z_k(int paramInt, SortOrder paramSortOrder) {
    this.ZM = paramInt;
    this.ZY = paramSortOrder;
  }
  
  public int ZeK() {
    return this.ZM;
  }
  
  public SortOrder Ze3() {
    return (this.ZY == null) ? SortOrder.UNSORTED : this.ZY;
  }
  
  @Zzvo(2)
  private int ZHw() {
    return Zkgm.ZZ(this.ZY);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Z_k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */