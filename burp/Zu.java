package burp;

import java.util.concurrent.Executor;

class Zu implements Executor {
  public void execute(Runnable paramRunnable) {
    paramRunnable.run();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */