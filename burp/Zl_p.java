package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zl_p<T extends Zgpi> implements Zeu4<Zefg<T>> {
  public final Zekv Zz = new Zekv(0);
  
  public final Zeki<Zrte<T>> ZU;
  
  private final Zm31[] Zc;
  
  private final Zllo<Zefg<T>> ZT;
  
  private final Zsqx<Zefg<T>> Zu;
  
  private static int[] ZI;
  
  public Zl_p(Zeu4<T> paramZeu4) {
    this.ZU = new Zeki<>(1, new Zguz<>(paramZeu4));
    this.Zc = new Zm31[] { this.Zz, this.ZU };
    this.ZT = new Zbxc<>(this, paramZeu4);
    this.Zu = new Zgw2<>(this, paramZeu4, 10);
  }
  
  public Zm31[] Zc() {
    return this.Zc;
  }
  
  public Zllo<Zefg<T>> ZI() {
    return this.ZT;
  }
  
  public Zeu4<? extends Zefg<T>> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public Zsqx<Zefg<T>> Zq() {
    return this.Zu;
  }
  
  public static void Zg(int[] paramArrayOfint) {
    ZI = paramArrayOfint;
  }
  
  public static int[] Zu() {
    return ZI;
  }
  
  static {
    if (Zu() != null)
      Zg(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl_p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */