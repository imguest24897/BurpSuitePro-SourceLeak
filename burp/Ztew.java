package burp;

import java.util.Iterator;
import java.util.function.Consumer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztew {
  private final Zrw4 ZG;
  
  private final Ztj9<Consumer<Ztew>> ZA = new Ztj9<>();
  
  private static boolean ZW;
  
  public Ztew(Zrw4 paramZrw4) {
    boolean bool = Zu();
    this.ZG = paramZrw4;
    if (Zbqc.Zwu() == null)
      Zd(!bool); 
  }
  
  public <T extends Zgpi> T ZT(T paramT) {
    Iterator<Consumer<Ztew>> iterator = this.ZA.ZH();
    T t = (T)Zc((Object)paramT);
    boolean bool = ZC();
    while (iterator.hasNext()) {
      ((Consumer<Ztew>)iterator.next()).accept(this);
      if (bool) {
        Zbqc.Zr(new Zbqc[2]);
        break;
      } 
    } 
    return t;
  }
  
  public <T extends Zgpi> T Zc(T paramT) {
    if (paramT == null)
      return null; 
    Zz8x<T> zz8x = this.ZG.Z_(paramT);
    if (zz8x.ZO)
      return zz8x.ZS; 
    try {
      if (paramT instanceof Ze34)
        return (T)ZD((Ze34)paramT); 
      if (this.ZG.ZG(paramT))
        return null; 
      if (paramT instanceof Zsdr)
        return (T)ZU((Zsdr)paramT); 
      if (paramT instanceof Zefg)
        return (T)ZE((Zefg)paramT); 
      if (paramT instanceof Zmfv)
        return (T)ZT((Zmfv)paramT); 
      if (paramT instanceof Zg06)
        return (T)ZS((Zg06)paramT); 
      if (paramT instanceof Zmg)
        return (T)Zm((Zmg)paramT); 
      if (paramT instanceof Zxsn)
        return (T)Zy((Zxsn)paramT); 
      if (paramT instanceof Zmkl || paramT instanceof Zsli || paramT instanceof Ztrr || paramT instanceof Zkc3 || paramT instanceof Zm0z || paramT instanceof Zl5f || paramT instanceof Zif) {
        Zuh.Zb(false, Zqf.Zs);
        return null;
      } 
      if (paramT instanceof Zrvk) {
        Zuh.Zb(false, Zqf.Zs);
        return null;
      } 
      if (paramT instanceof Ze2p)
        return (T)ZB((Ze2p)paramT); 
      if (paramT instanceof Zgi5)
        return (T)ZA((Zgi5)paramT); 
      return (T)ZZ((Object)paramT);
    } finally {
      this.ZG.ZS(paramT);
    } 
  }
  
  public void ZN(Consumer<Ztew> paramConsumer) {
    this.ZA.push(paramConsumer);
  }
  
  private <T extends Zgpi> T ZD(Ze34 paramZe34) {
    Zmss zmss = new Zmss(this, this.ZG);
    paramZe34.ZC(zmss);
    return (T)zmss.Ze();
  }
  
  private <T extends Zgpi> T ZU(Zsdr paramZsdr) {
    Zb0 zb0 = new Zb0(this.ZG);
    paramZsdr.ZH(zb0);
    return (T)zb0.Zs();
  }
  
  private <T extends Zgpi> T ZE(Zefg paramZefg) {
    Zem_ zem_ = new Zem_(this, this.ZG);
    paramZefg.ZB(zem_);
    return (T)zem_.Zy();
  }
  
  private <T extends Zgpi> T ZT(Zmfv paramZmfv) {
    return (T)this.ZG.ZO(this, paramZmfv);
  }
  
  private <T extends Zgpi> T ZS(Zg06 paramZg06) {
    return (T)this.ZG.ZR(this, paramZg06);
  }
  
  private <T extends Zgpi> T Zm(Zmg paramZmg) {
    Zbn9 zbn9 = new Zbn9(this.ZG);
    paramZmg.ZE(zbn9);
    return (T)zbn9.ZU();
  }
  
  private <T extends Zgpi> T Zy(Zxsn paramZxsn) {
    return (T)this.ZG.ZD(this, paramZxsn);
  }
  
  private <T extends Zgpi> T ZB(Ze2p paramZe2p) {
    Zlfn zlfn = new Zlfn(this, this.ZG);
    paramZe2p.ZE(zlfn);
    return (T)zlfn.ZC();
  }
  
  private <T extends Zgpi> T ZA(Zgi5 paramZgi5) {
    Zxzb zxzb = new Zxzb(this, this.ZG);
    paramZgi5.ZH(zxzb);
    return (T)zxzb.ZV();
  }
  
  private <T extends Zgpi> T ZZ(T paramT) {
    return this.ZG.Zd(this, paramT);
  }
  
  public static void Zd(boolean paramBoolean) {
    ZW = paramBoolean;
  }
  
  public static boolean Zu() {
    return ZW;
  }
  
  public static boolean ZC() {
    boolean bool = Zu();
    return !bool;
  }
  
  static {
    if (ZC())
      Zd(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztew.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */