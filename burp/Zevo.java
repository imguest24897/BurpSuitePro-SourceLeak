package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zevo extends MouseAdapter {
  final Zmq5 Zp;
  
  Zevo(Zmq5 paramZmq5) {}
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    this.Zp.setIcon(this.Zp.Za.getAndSet(!this.Zp.Za.get()) ? Zgzq.LARGE_SWITCH_OFF.ZD() : Zgzq.LARGE_SWITCH_ON.ZD());
    this.Zp.ZT.forEach(Zevo::lambda$mouseReleased$0);
  }
  
  private static void lambda$mouseReleased$0(Runnable paramRunnable) {
    try {
      paramRunnable.run();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zevo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */