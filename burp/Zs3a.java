package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Zs3a implements Ze4y {
  private final List<Zl30> Zc;
  
  private final List<Zbop> Zn;
  
  private final List<Zr9_> Zj;
  
  private final Ztta ZY;
  
  private final Zkch Zs;
  
  private List<Zbop> ZW;
  
  private Map<Zbop, Zgfr> Zp;
  
  private Zs3a(List<Zl30> paramList, Set<Zbop> paramSet, Set<Zr9_> paramSet1, Ztta paramZtta, Zkch paramZkch, List<Zbop> paramList1, Map<Zbop, Zgfr> paramMap) {
    this.Zc = paramList;
    this.Zn = Collections.unmodifiableList(new ArrayList<>(paramSet));
    this.Zj = Collections.unmodifiableList(new ArrayList<>(paramSet1));
    this.ZY = paramZtta;
    this.Zs = paramZkch;
    this.ZW = paramList1;
    this.Zp = paramMap;
  }
  
  public List<Zl30> Zw() {
    return this.Zc;
  }
  
  public List<Zbop> Zp() {
    return this.Zn;
  }
  
  public List<Zr9_> Z_() {
    return this.Zj;
  }
  
  public Ztta ZH() {
    return this.ZY;
  }
  
  public Zmf5 ZD() {
    return this.Zs.Zh();
  }
  
  public Zl38 ZH(Zbop paramZbop1, Zbop paramZbop2) {
    if (paramZbop1 == paramZbop2)
      return Zl38.SAME; 
    int i = this.ZW.indexOf(paramZbop1);
    int j = this.ZW.indexOf(paramZbop2);
    return (i == -1 || j == -1) ? Zl38.UNKNOWN : ((i < j) ? Zl38.FIRST : Zl38.SECOND);
  }
  
  public Zgfr Zk(Zbop paramZbop) {
    String[] arrayOfString = Zl30.ZM();
    Zgfr zgfr = this.Zp.get(paramZbop);
    if (zgfr == null)
      return Zgfr.UNKNOWN; 
    if (Zbqc.Zwu() == null)
      Zl30.ZF(new String[5]); 
    return zgfr;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs3a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */