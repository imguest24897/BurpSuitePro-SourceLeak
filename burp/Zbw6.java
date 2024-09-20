package burp;

import java.io.File;
import java.util.concurrent.TimeUnit;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbw6 {
  public static boolean ZF(File paramFile) {
    return Zl(new Zlwn(paramFile));
  }
  
  public static boolean ZL(File paramFile1, File paramFile2) {
    return Zl(new Zvoz(paramFile1, paramFile2));
  }
  
  private static boolean Zl(Ztay paramZtay) {
    byte b = 0;
    int[] arrayOfInt = Zlvs.Zd();
    while (b < 10 && !paramZtay.Zm()) {
      ZL();
      System.gc();
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    boolean bool = (b < 10) ? true : false;
    Zuh.Zb(bool, Zqf.ZH);
    return bool;
  }
  
  private static void ZL() {
    try {
      TimeUnit.MILLISECONDS.sleep(200L);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.UNEXPECTED);
      Thread.currentThread().interrupt();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbw6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */