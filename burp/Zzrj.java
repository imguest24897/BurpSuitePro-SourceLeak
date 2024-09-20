package burp;

import java.util.concurrent.Executor;
import javax.swing.SwingUtilities;

class Zzrj implements Executor {
  public void execute(Runnable paramRunnable) {
    SwingUtilities.invokeLater(paramRunnable);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzrj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */