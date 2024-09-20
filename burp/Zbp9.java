package burp;

import java.awt.AWTEvent;
import java.awt.EventQueue;
import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbp9 extends EventQueue {
  private final Zlmc ZO;
  
  private boolean ZL;
  
  private Thread Zl;
  
  public Zbp9() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.Zl = Thread.currentThread();
    this.ZO = new Zlmc(this);
  }
  
  public Thread ZJ() {
    return this.Zl;
  }
  
  public void ZD(boolean paramBoolean) {
    this.ZL = paramBoolean;
  }
  
  protected void dispatchEvent(AWTEvent paramAWTEvent) {
    boolean bool = false;
    try {
      this.Zl = Thread.currentThread();
      bool = Zj(paramAWTEvent);
      super.dispatchEvent(paramAWTEvent);
    } finally {
      if (bool)
        this.ZO.ZB(); 
    } 
  }
  
  private boolean Zj(AWTEvent paramAWTEvent) {
    try {
      if (!this.ZL)
        return false; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      return this.ZO.Zr(paramAWTEvent, System.currentTimeMillis());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return false;
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbp9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */