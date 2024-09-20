package burp;

import java.util.concurrent.locks.ReentrantLock;

public class Zlj6 extends ReentrantLock {
  public void unlock() {
    if (isHeldByCurrentThread())
      super.unlock(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlj6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */