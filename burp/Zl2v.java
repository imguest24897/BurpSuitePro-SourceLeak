package burp;

import java.util.Map;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zl2v implements Zlfv<Zg3y> {
  private final Zrde Zy;
  
  private final Zei8<? extends Zrde> Zl;
  
  private final Zrde ZS;
  
  private final Zei8<? extends Zrde> Zf;
  
  private static Zbqc[] Zj;
  
  private Zl2v(Zei8<? extends Zrde> paramZei81, Zei8<? extends Zrde> paramZei82) {
    Zuh.Zb((paramZei81.getClass() == paramZei82.getClass()), Zqf.Zs, paramZei81.getClass().getName(), paramZei82.getClass().getName());
    this.Zl = paramZei81;
    this.Zf = paramZei82;
    this.Zy = null;
    this.ZS = null;
  }
  
  public Zsqx<Zg3y> Zc(Map<Zvow, Zzi8> paramMap) {
    return new Zm60(this, paramMap);
  }
  
  public static Zlfv<? extends Zgkc> Zp(Zei8<? extends Zrde> paramZei81, Zei8<? extends Zrde> paramZei82) {
    if (paramZei81.getClass() != paramZei82.getClass()) {
      Zuh.ZT(false, Zqf.Zs, paramZei81.getClass().getName() + "," + paramZei81.getClass().getName());
      return null;
    } 
    return new Zl2v(paramZei81, paramZei82);
  }
  
  public static void Zu(Zbqc[] paramArrayOfZbqc) {
    Zj = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zs() {
    return Zj;
  }
  
  static {
    if (Zs() != null)
      Zu(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl2v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */