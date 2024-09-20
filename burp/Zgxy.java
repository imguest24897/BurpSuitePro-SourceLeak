package burp;

import net.portswigger.Zm2;

public class Zgxy<T> extends Zgxr<T> {
  private final Zln7<T> ZL;
  
  private final Zv8r Zc;
  
  private long ZH;
  
  private static boolean ZT;
  
  private Zgxy(Zln7<T> paramZln7, Zv8r paramZv8r) {
    this.ZL = paramZln7;
    this.Zc = paramZv8r;
  }
  
  public static <T> void ZH(Zln7<T> paramZln7, Zv8r paramZv8r) {
    paramZln7.Zb(new Zgxy<>(paramZln7, paramZv8r));
  }
  
  public void ZH() {
    this.ZH = System.currentTimeMillis();
  }
  
  public void Za() {
    boolean bool = Zr();
    this.ZL.ZA(this);
    Zm2.Zi(this.Zc, (System.currentTimeMillis() - this.ZH) / 1000L);
    if (!bool)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public static void Zc(boolean paramBoolean) {
    ZT = paramBoolean;
  }
  
  public static boolean Zl() {
    return ZT;
  }
  
  public static boolean Zr() {
    boolean bool = Zl();
    return !bool;
  }
  
  static {
    if (Zl())
      Zc(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgxy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */