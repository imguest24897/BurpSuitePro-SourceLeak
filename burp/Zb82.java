package burp;

import java.awt.event.MouseEvent;

class Zb82 extends Zb8i {
  final Zbkb ZA;
  
  private Zb82(Zbkb paramZbkb) {
    super(paramZbkb);
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: invokestatic ZQ : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: invokestatic isLeftMouseButton : (Ljava/awt/event/MouseEvent;)Z
    //   8: ifeq -> 37
    //   11: aload_0
    //   12: getfield ZA : Lburp/Zbkb;
    //   15: aload_0
    //   16: getfield ZA : Lburp/Zbkb;
    //   19: invokevirtual Zk : ()Z
    //   22: ifne -> 29
    //   25: iconst_1
    //   26: goto -> 30
    //   29: iconst_0
    //   30: invokevirtual ZH : (Z)V
    //   33: iload_2
    //   34: ifeq -> 63
    //   37: aload_1
    //   38: invokestatic isRightMouseButton : (Ljava/awt/event/MouseEvent;)Z
    //   41: ifeq -> 63
    //   44: aload_0
    //   45: getfield ZA : Lburp/Zbkb;
    //   48: invokevirtual ZH : ()Ljava/util/function/Consumer;
    //   51: astore_3
    //   52: aload_3
    //   53: ifnull -> 63
    //   56: aload_3
    //   57: aload_1
    //   58: invokeinterface accept : (Ljava/lang/Object;)V
    //   63: aload_0
    //   64: aload_1
    //   65: invokespecial mouseReleased : (Ljava/awt/event/MouseEvent;)V
    //   68: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb82.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */