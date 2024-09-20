package burp;

import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Zzm8 extends WindowAdapter {
  final Runnable Zo;
  
  final Zzjc Zv;
  
  final Toolkit ZK;
  
  final AWTEventListener Zb;
  
  final Zl02 Zh;
  
  Zzm8(Zl02 paramZl02, Runnable paramRunnable, Zzjc paramZzjc, Toolkit paramToolkit, AWTEventListener paramAWTEventListener) {}
  
  public void windowClosing(WindowEvent paramWindowEvent) {
    if (this.Zh.ZJ(this.Zh))
      this.Zh.dispose(); 
  }
  
  public void windowClosed(WindowEvent paramWindowEvent) {
    this.Zo.run();
    this.Zv.ZX();
    this.ZK.removeAWTEventListener(this.Zb);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzm8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */