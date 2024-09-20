package burp;

import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zlku implements Runnable {
  private final Zmgr ZA;
  
  private final Zrj ZY;
  
  private final Zlsy ZN;
  
  private final Zk9e ZP;
  
  private static String[] ZI;
  
  public Zlku(Zmgr paramZmgr, Zrj paramZrj, Zlsy paramZlsy, Zk9e paramZk9e) {
    this.ZA = Objects.<Zmgr>requireNonNull(paramZmgr);
    this.ZY = Objects.<Zrj>requireNonNull(paramZrj);
    this.ZN = Objects.<Zlsy>requireNonNull(paramZlsy);
    this.ZP = Objects.<Zk9e>requireNonNull(paramZk9e);
  }
  
  public void run() {
    try {
      this.ZP.ZQ();
      this.ZA.Za(this.ZY, this.ZN);
      this.ZP.ZV();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      this.ZP.ZY();
    } finally {
      this.ZP.Zg();
    } 
  }
  
  public static void Zt(String[] paramArrayOfString) {
    ZI = paramArrayOfString;
  }
  
  public static String[] ZH() {
    return ZI;
  }
  
  static {
    if (ZH() != null)
      Zt(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlku.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */