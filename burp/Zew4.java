package burp;

import java.util.List;
import java.util.Optional;
import net.portswigger.Zen;
import net.portswigger.Zkb;

public class Zew4 extends Zewx {
  private final Ze2o ZB;
  
  private final Zs40 ZZ;
  
  Zs2i Zi;
  
  Zew4(Zen paramZen, Ze2o paramZe2o, Zzi5 paramZzi5, Zlp9 paramZlp9) {
    super(paramZen, Zkb.Zy(paramZe2o.ZJ()), paramZlp9, new Zmhr(paramZzi5.ZU(paramZen), 80, false), (byte)0, ZP);
    this.ZB = paramZe2o;
    this.ZZ = new Zxnv(Zkb.Zy(paramZe2o.ZJ()), (byte)0);
  }
  
  public Zs2i Zu(Zxs7 paramZxs7) {
    return paramZxs7.<Zs2i>Zk(new Zrre(this));
  }
  
  public Optional<Zlvf> Zs(Zmhe paramZmhe) {
    return Optional.of(paramZmhe.ZK(Zri7.ZJ(new Zrre(this)), Zlp5.Zc().Zd(true)));
  }
  
  public List<Zl1r> Zn(Zbll paramZbll, Zxs7 paramZxs7) {
    Zs2i zs2i = this.Zi;
    if (zs2i == null)
      zs2i = Zu(paramZxs7); 
    return (zs2i.ZO() == null) ? this.ZZ.Zn(paramZbll, paramZxs7) : zs2i.ZO();
  }
  
  public void Ze(Zxs7 paramZxs7, Zmhe paramZmhe, Zz4_ paramZz4_, Ze3n paramZe3n, Zbnt paramZbnt) {
    Zlvf zlvf = paramZmhe.ZK(Zri7.ZJ(new Zrre(this)), Zlp5.Zc().Zd(true));
    this.Zi = zlvf.ZY();
    byte[] arrayOfByte = this.Zi.ZE();
    int[] arrayOfInt = Zkgq.Zr();
    boolean bool = Zlep.Zb(zlvf.ZM().ZT());
    if (!bool) {
      this.ZB.ZS(zlvf, arrayOfByte, paramZxs7, paramZz4_, paramZe3n, Zh(), this.Zi.ZO(), paramZbnt);
      if (arrayOfInt == null) {
        if (Zlep.ZJ(paramZxs7))
          this.ZB.Zu(zlvf, arrayOfByte, paramZxs7, paramZz4_, paramZe3n, Zh(), this.Zi.ZO()); 
        return;
      } 
      return;
    } 
    if (Zlep.ZJ(paramZxs7))
      this.ZB.Zu(zlvf, arrayOfByte, paramZxs7, paramZz4_, paramZe3n, Zh(), this.Zi.ZO()); 
  }
  
  boolean ZN() {
    return true;
  }
  
  private static String Zb(String paramString1, String paramString2) {
    return paramString2.substring(2, Math.min(12, paramString2.length())) + "." + paramString2.substring(2, Math.min(12, paramString2.length()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zew4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */