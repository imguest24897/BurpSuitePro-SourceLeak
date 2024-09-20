package burp;

import java.util.Map;

public class Zxa {
  private final Map<Integer, Ztou> Zj;
  
  public Zxa(Map<Integer, Ztou> paramMap) {
    this.Zj = paramMap;
  }
  
  public Ztou Zo(int paramInt) {
    String str = Ztou.ZC();
    if (this.Zj.containsKey(Integer.valueOf(paramInt)))
      return this.Zj.get(Integer.valueOf(paramInt)); 
    Ztou ztou = new Ztou();
    this.Zj.put(Integer.valueOf(paramInt), ztou);
    if (str != null)
      Zbqc.Zr(new Zbqc[3]); 
    return ztou;
  }
  
  public void ZS(int paramInt, Zxr8<?> paramZxr8) {
    if (this.Zj.containsKey(Integer.valueOf(paramInt))) {
      Ztou ztou = this.Zj.get(Integer.valueOf(paramInt));
      ztou.ZD(paramZxr8);
    } 
  }
  
  public void ZI(int paramInt) {
    this.Zj.remove(Integer.valueOf(paramInt));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */