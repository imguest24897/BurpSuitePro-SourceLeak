package burp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Zl2f extends WindowAdapter {
  final Zgsl ZC;
  
  Zl2f(Zgsl paramZgsl) {}
  
  public void windowClosed(WindowEvent paramWindowEvent) {
    Zmt5[] arrayOfZmt5 = this.ZC.ZM;
    int i = arrayOfZmt5.length;
    byte b = 0;
    boolean bool = Ztua.Zo();
    while (b < i) {
      Zmt5 zmt5 = arrayOfZmt5[b];
      this.ZC.ZI.Ze((Zmt5<?>[])new Zmt5[] { zmt5 });
      b++;
      if (!bool)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl2f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */