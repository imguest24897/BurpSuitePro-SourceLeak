package burp;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.concurrent.TimeUnit;

class Zr8z extends ComponentAdapter {
  final Zl49 Zo;
  
  Zr8z(Zl49 paramZl49) {}
  
  public void componentResized(ComponentEvent paramComponentEvent) {
    if (this.Zo.ZK != null)
      this.Zo.ZK.cancel(false); 
    this.Zo.ZK = this.Zo.Zf.schedule(this::lambda$componentResized$0, 100L, TimeUnit.MILLISECONDS);
  }
  
  private void lambda$componentResized$0() {
    this.Zo.ZV();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr8z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */