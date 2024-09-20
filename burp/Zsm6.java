package burp;

import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zrze;
import net.portswigger.Zuh;
import net.portswigger.Zz_;

public class Zsm6 {
  public static final Zewx Z_ = new Zeww();
  
  public static Ztxo ZX(Zer0 paramZer0) {
    return Zsxf.Zb.get(Ztxo.ZK(ZQ(paramZer0)));
  }
  
  public static Zrsr ZB(Zer0 paramZer0) {
    Ztxo ztxo = ZX(paramZer0);
    return (ztxo == null) ? null : (new Zxov(null, ztxo, ZQ(paramZer0))).Zi(paramZer0);
  }
  
  public static Zrze ZQ(Zer0 paramZer0) {
    return Zrze.Zi(paramZer0.Zi().substring(paramZer0.Zi().indexOf("w") + 1));
  }
  
  public static String Zv(Zer0 paramZer0) {
    List<Zen> list = (new Zz_(Zkb.Zy(paramZer0.Zx()))).Z_();
    if (list.isEmpty()) {
      Zuh.Zb(false, Zqf.Zr);
      return "";
    } 
    return Zen.Zh(list.get(0)).toString();
  }
  
  public static Zmzk ZN(Zer0 paramZer0, Zr_4 paramZr_4, Zes1 paramZes1) {
    int i = Zg13.Zy();
    if (paramZes1.Zu.Zi())
      return paramZr_4.<Zmzk>ZH(new Zmhr(paramZes1.Zu.ZJ(), 80, false)); 
    if (Zbqc.Zwu() == null)
      Zg13.Zr(++i); 
    return paramZr_4.<Zmzk>ZH(new Zmhr(paramZer0.Zx() + "." + paramZer0.Zx(), 80, false));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsm6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */