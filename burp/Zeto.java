package burp;

import java.util.ArrayList;
import java.util.List;

public class Zeto implements Ze4y {
  private final Ze4y ZG;
  
  private final List<Zl30> Z_ = new ArrayList<>();
  
  private final List<Zr9_> Zx = new ArrayList<>();
  
  private static boolean ZK;
  
  public Zeto(Ze4y paramZe4y) {
    this.ZG = paramZe4y;
    List<Zl30> list = paramZe4y.Zw();
    boolean bool = Zj();
    Zl30 zl30 = (new Zl7_()).Ze(Zzyi.START).ZW(new Ztx4[] { ((Zl30)list.get(0)).ZC() }).ZS(new Ze_k()).ZX();
    this.Z_.add(zl30);
    this.Z_.addAll(list);
    this.Zx.add(Zzyi.START);
    this.Zx.addAll(paramZe4y.Z_());
    if (!bool)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public List<Zl30> Zw() {
    return this.Z_;
  }
  
  public List<Zbop> Zp() {
    return this.ZG.Zp();
  }
  
  public List<Zr9_> Z_() {
    return this.Zx;
  }
  
  public Ztta ZH() {
    return this.ZG.ZH();
  }
  
  public Zmf5 ZD() {
    return this.ZG.ZD();
  }
  
  public Zl38 ZH(Zbop paramZbop1, Zbop paramZbop2) {
    return this.ZG.ZH(paramZbop1, paramZbop2);
  }
  
  public Zgfr Zk(Zbop paramZbop) {
    return this.ZG.Zk(paramZbop);
  }
  
  public static void Zd(boolean paramBoolean) {
    ZK = paramBoolean;
  }
  
  public static boolean Zj() {
    return ZK;
  }
  
  public static boolean ZJ() {
    boolean bool = Zj();
    return !bool;
  }
  
  static {
    if (ZJ())
      Zd(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeto.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */