package burp;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zr8j implements Zgzy {
  private final Zxx6 Zn;
  
  private final Zrag ZV;
  
  private Zxzh ZG;
  
  private Ztik Zy;
  
  private Zg7n ZD;
  
  private Zxg_ ZW;
  
  private Zte ZE;
  
  private Ztbq Zv;
  
  private volatile boolean ZC;
  
  private Ztks ZO;
  
  public Zr8j(Zxx6 paramZxx6, Zrag paramZrag) {
    this.Zn = paramZxx6;
    this.ZV = paramZrag;
  }
  
  public void ZI(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zxgc paramZxgc, Zskh paramZskh, Zslu paramZslu, Zkl6 paramZkl6, Zr_4 paramZr_41, Zr_4 paramZr_42, Zgb6 paramZgb6, Zm39 paramZm39, Ztwv paramZtwv, Zra1 paramZra1, Ztks paramZtks) {
    Zbqc[] arrayOfZbqc = Ztbb.ZB();
    Zuh.Zv((paramZerg != null), Zqf.Zv, 0L);
    Zuh.Zv((paramZkl6 != null), Zqf.Zv, 1L);
    Zuh.Zv((paramZr_42 != null), Zqf.Zv, 2L);
    Zuh.Zv((paramZgb6 != null), Zqf.Zv, 3L);
    Zuh.Zv((paramZm39 != null), Zqf.Zv, 4L);
    Zuh.Zv((paramZt4u != null), Zqf.Zv, 5L);
    this.ZO = paramZtks;
    Zbnt zbnt = paramZkl6.ZB();
    Zefg<Zmk5> zefg = paramZm39.Zf6();
    Zefg<Zt9r> zefg1 = paramZm39.Zfu();
    this.Zy = new Ztik(paramZgb6, paramZxgc.ZK1(), zbnt, paramZr_42, zefg);
    Objects.requireNonNull(paramZerg);
    Supplier<Zgvn> supplier = paramZerg::ZM;
    Function<Zeew, Zskh> function = paramZerg::lambda$initialise$0;
    this.ZG = new Zxzh(paramZt4u, supplier, function, paramZgb6, paramZxgc, paramZslu, paramZkl6, this.Zy, zefg1, paramZr_41, paramZr_42, paramZz0n.ZP());
    this.Zy.Zt(this.ZG);
    this.ZD = new Zkbe(paramZt4u, paramZgb6, paramZr_41, paramZr_42, paramZkl6.Zq());
    this.ZW = new Zz9h(paramZt4u, paramZgb6, paramZslu, paramZr_41, paramZr_42, paramZkl6.Zq());
    this.ZE = new Zte(paramZz0n, this.ZV, paramZgb6, paramZskh, paramZtwv, paramZr_42, paramZra1);
    this.Zv = new Ze03();
    this.ZC = true;
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public Zxzh Zh() {
    Zuh.Zb(this.ZC, Zqf.Zr);
    return this.ZG;
  }
  
  public Ztik Zu() {
    Zuh.Zb(this.ZC, Zqf.Zr);
    return this.Zy;
  }
  
  public Zte Zw() {
    Zuh.Zb(this.ZC, Zqf.Zr);
    return this.ZE;
  }
  
  public Ztbq Z_() {
    Zuh.Zb(this.ZC, Zqf.Zr);
    return this.Zv;
  }
  
  public Zg7n ZF() {
    Zuh.Zb(this.ZC, Zqf.Zr);
    return this.ZD;
  }
  
  public Zxg_ Zq() {
    Zuh.Zb(this.ZC, Zqf.Zr);
    return this.ZW;
  }
  
  public Ztks Zy() {
    Zuh.Zb(this.ZC, Zqf.Zk);
    return this.ZO;
  }
  
  public boolean ZC() {
    return this.Zn.ZG();
  }
  
  private static Zskh lambda$initialise$0(Zerg paramZerg, Zeew paramZeew) {
    return paramZerg.ZU(paramZeew) ? paramZerg.ZI(paramZeew).ZY4() : Zskh.Zo;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr8j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */