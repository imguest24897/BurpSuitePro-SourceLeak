package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zb3h {
  private final Zlof ZR;
  
  private final Zxfv ZE;
  
  private final Zkit Zt;
  
  private final Ze24 ZK;
  
  Zb3h(Zxfv paramZxfv, Zlof paramZlof, Zkit paramZkit, Ze24 paramZe24) {
    this.ZR = paramZlof;
    this.ZE = paramZxfv;
    this.Zt = paramZkit;
    this.ZK = paramZe24;
  }
  
  <T extends Zgpi> T ZO(T paramT) {
    Zgpi zgpi;
    Zeu4<Object> zeu4 = paramT.ZF();
    T t = (T)this.ZK.ZS((Object)paramT, zeu4);
    try {
      if (t != null)
        return t; 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      zgpi = this.Zt.ZH((Zsqx)new Zbjy<>(zeu4));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.ZR.ZK(throwable);
      return null;
    } 
    this.ZK.Zb((Zgpi)paramT, zgpi);
    Zs7v zs7v = this.ZE.Zh((Zgpi)paramT, zgpi);
    paramT.ZQ(zeu4.Zc(), zs7v);
    return (T)zgpi;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb3h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */