package burp;

import java.util.ArrayList;
import java.util.List;

class Zzzz {
  private final List<Integer> ZF = new ArrayList<>();
  
  public Zzzz() {}
  
  private Zzzz(List<Integer> paramList) {}
  
  public Zzzz Zp(int paramInt) {
    ArrayList<Integer> arrayList = new ArrayList<>(this.ZF);
    arrayList.add(Integer.valueOf(paramInt));
    return new Zzzz(arrayList);
  }
  
  public int Zt() {
    return this.ZF.size();
  }
  
  public int ZV(int paramInt) {
    return ((Integer)this.ZF.get(paramInt)).intValue();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzzz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */