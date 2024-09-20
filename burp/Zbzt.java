package burp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Zbzt extends WindowAdapter {
  final Ztn8 ZH;
  
  final Zbza ZB;
  
  Zbzt(Zl03 paramZl03, Ztn8 paramZtn8, Zbza paramZbza) {}
  
  public void windowClosing(WindowEvent paramWindowEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZH : Lburp/Ztn8;
    //   4: aload_0
    //   5: getfield ZB : Lburp/Zbza;
    //   8: <illegal opcode> run : (Lburp/Ztn8;Lburp/Zbza;)Ljava/lang/Runnable;
    //   13: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   16: return
  }
  
  private static void lambda$windowClosing$0(Ztn8 paramZtn8, Zbza paramZbza) {
    Zl03 zl03 = paramZtn8.Za(paramZbza);
    if (zl03 != null) {
      zl03.dispose();
      paramZtn8.ZF(paramZbza);
      System.gc();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbzt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */