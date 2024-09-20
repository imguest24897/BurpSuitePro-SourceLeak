package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zkbj extends MouseAdapter {
  private final Zejo ZS;
  
  private final Zb00 Zq;
  
  private final Zbdr Zb;
  
  private Zkbj(Zejo paramZejo, Zb00 paramZb00, Zbdr paramZbdr) {
    this.ZS = paramZejo;
    this.Zq = paramZb00;
    this.Zb = paramZbdr;
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: invokestatic Zz : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zq : Lburp/Zb00;
    //   8: invokeinterface ZLR : ()I
    //   13: istore_3
    //   14: aload_0
    //   15: getfield ZS : Lburp/Zejo;
    //   18: iload_3
    //   19: invokeinterface ZE : (I)Z
    //   24: ifeq -> 41
    //   27: aload_0
    //   28: getfield ZS : Lburp/Zejo;
    //   31: iload_3
    //   32: invokeinterface ZF : (I)V
    //   37: iload_2
    //   38: ifne -> 72
    //   41: aload_0
    //   42: getfield Zq : Lburp/Zb00;
    //   45: invokeinterface Zsc : ()Lburp/Zze0;
    //   50: astore #4
    //   52: aload #4
    //   54: ifnull -> 62
    //   57: aload #4
    //   59: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   62: aload_0
    //   63: getfield ZS : Lburp/Zejo;
    //   66: iload_3
    //   67: invokeinterface ZZ : (I)V
    //   72: aload_0
    //   73: aload_1
    //   74: invokespecial mousePressed : (Ljava/awt/event/MouseEvent;)V
    //   77: return
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {
    int i = this.Zq.ZLR();
    boolean bool = this.ZS.ZE(i);
    if (!bool) {
      this.Zb.Zl(Zlkk.COLLAPSIBLE_SIDEBAR_HOVER_LABEL_BACKGROUND);
      this.Zb.Zq(Zlkk.COLLAPSIBLE_SIDEBAR_HOVER_LABEL_FOREGROUND);
    } 
    super.mouseEntered(paramMouseEvent);
  }
  
  public void mouseExited(MouseEvent paramMouseEvent) {
    int i = this.Zq.ZLR();
    boolean bool = this.ZS.ZE(i);
    Zbd5.ZN(this.Zb, bool);
    super.mouseEntered(paramMouseEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkbj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */