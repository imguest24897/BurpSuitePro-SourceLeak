package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class Zmhp {
  public static final TimeUnit ZH = TimeUnit.MINUTES;
  
  private final List<Zk1k> Zx = new CopyOnWriteArrayList<>();
  
  private final Zej7 ZO;
  
  private static int[] ZA;
  
  public Zmhp(Zgqy paramZgqy) {
    int[] arrayOfInt = Zl();
    this.ZO = null;
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  private void lambda$new$0(Zgqy paramZgqy) {
    this.Zx.forEach(Zk1k::ZH);
    paramZgqy.Zx(1);
  }
  
  public static void Zl(int[] paramArrayOfint) {
    ZA = paramArrayOfint;
  }
  
  public static int[] Zl() {
    return ZA;
  }
  
  static {
    if (Zl() == null)
      Zl(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmhp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */