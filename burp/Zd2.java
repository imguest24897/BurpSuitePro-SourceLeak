package burp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

class Zd2 extends KeyAdapter {
  private static final int[] ZI = new int[] { 
      10, 38, 40, 37, 39, 10, 9, 36, 35, 33, 
      34 };
  
  boolean Zi;
  
  final Zljk Zb;
  
  Zd2(Zljk paramZljk) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    this.Zi = this.Zb.Zj();
  }
  
  public void keyReleased(KeyEvent paramKeyEvent) {
    if (ZS(paramKeyEvent))
      paramKeyEvent.consume(); 
  }
  
  private boolean ZS(KeyEvent paramKeyEvent) {
    return ((this.Zi && paramKeyEvent.getKeyCode() == 27) || (this.Zb.ZI instanceof javax.swing.JTextArea && Zm(paramKeyEvent)));
  }
  
  private boolean Zm(KeyEvent paramKeyEvent) {
    return (Arrays.stream(ZI).anyMatch(paramKeyEvent::lambda$consumeTextAreaKeyEvent$0) || (paramKeyEvent.getKeyCode() == 67 && paramKeyEvent.isControlDown()));
  }
  
  private static boolean lambda$consumeTextAreaKeyEvent$0(KeyEvent paramKeyEvent, int paramInt) {
    return (paramInt == paramKeyEvent.getKeyCode());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zd2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */