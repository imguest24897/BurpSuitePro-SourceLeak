package burp;

import java.util.List;

public class Ztl1 {
  private final List<Zmo7> ZK;
  
  private Ztl1(List<Zmo7> paramList) {
    this.ZK = paramList;
  }
  
  public Zmo7 Za(int paramInt) {
    return this.ZK.get(paramInt);
  }
  
  public int ZC() {
    return this.ZK.size();
  }
  
  public int Zv(int paramInt) {
    int i = Zzzt.ZE();
    if (paramInt == 0)
      return -1; 
    byte b = 0;
    while (b < this.ZK.size()) {
      if (((Zmo7)this.ZK.get(b)).Zz() == paramInt)
        return b; 
      b++;
      if (i == 0)
        break; 
    } 
    return -1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztl1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */