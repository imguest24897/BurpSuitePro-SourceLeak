package burp;

import java.util.ArrayList;
import java.util.List;

public class Zgxm implements Ze4y {
  private final Ze4y ZC;
  
  private final List<Zl30> ZO = new ArrayList<>();
  
  public Zgxm(Ze4y paramZe4y) {
    Zbqc[] arrayOfZbqc = Zm_m.ZW();
    this.ZC = paramZe4y;
    List<Zl30> list = paramZe4y.Zw();
    Zl30 zl30 = (new Zl7_()).Ze(Zmax.FOLLOW_START).ZW(new Ztx4[] { ((Zl30)paramZe4y.Zw().get(0)).ZC(), Zrl.EOF }).ZS(new Ze_k()).ZX();
    this.ZO.add(zl30);
    this.ZO.addAll(list);
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public List<Zl30> Zw() {
    return this.ZO;
  }
  
  public List<Zbop> Zp() {
    return this.ZC.Zp();
  }
  
  public List<Zr9_> Z_() {
    return this.ZC.Z_();
  }
  
  public Ztta ZH() {
    return this.ZC.ZH();
  }
  
  public Zmf5 ZD() {
    return this.ZC.ZD();
  }
  
  public Zl38 ZH(Zbop paramZbop1, Zbop paramZbop2) {
    return this.ZC.ZH(paramZbop1, paramZbop2);
  }
  
  public Zgfr Zk(Zbop paramZbop) {
    return this.ZC.Zk(paramZbop);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgxm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */