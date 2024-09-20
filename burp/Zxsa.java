package burp;

import net.portswigger.Zah;

class Zxsa implements Thread.UncaughtExceptionHandler {
  public void uncaughtException(Thread paramThread, Throwable paramThrowable) {
    Zah.Zl(paramThrowable, Zed7.ZW(paramThrowable));
    paramThrowable.printStackTrace();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxsa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */