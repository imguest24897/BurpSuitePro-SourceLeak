package burp;

import java.awt.event.ActionEvent;

class Ze0e extends Ze01 {
  private int Zn;
  
  Ze0e(Zrkp paramZrkp, Runnable paramRunnable1, Runnable paramRunnable2) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: getfield ZW : Ljavax/swing/Icon;
    //   9: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   12: aload_0
    //   13: iconst_0
    //   14: invokevirtual setIconTextGap : (I)V
    //   17: aload_0
    //   18: new java/awt/Insets
    //   21: dup
    //   22: iconst_0
    //   23: iconst_5
    //   24: iconst_0
    //   25: iconst_5
    //   26: invokespecial <init> : (IIII)V
    //   29: invokevirtual setMargin : (Ljava/awt/Insets;)V
    //   32: aload_0
    //   33: aload_1
    //   34: getfield Zd : Ljava/lang/String;
    //   37: invokevirtual setToolTipText : (Ljava/lang/String;)V
    //   40: aload_0
    //   41: aload_1
    //   42: getfield Zv : Ljava/lang/String;
    //   45: invokevirtual setName : (Ljava/lang/String;)V
    //   48: aload_0
    //   49: new burp/Zzyx
    //   52: dup
    //   53: aload_0
    //   54: invokespecial <init> : (Lburp/Ze0e;)V
    //   57: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   60: aload_0
    //   61: aload_0
    //   62: aload_2
    //   63: aload_3
    //   64: <illegal opcode> actionPerformed : (Lburp/Ze0e;Ljava/lang/Runnable;Ljava/lang/Runnable;)Ljava/awt/event/ActionListener;
    //   69: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   72: return
  }
  
  private boolean ZJ() {
    return (this.Zn > getWidth() * 0.66F);
  }
  
  private void lambda$new$0(Runnable paramRunnable1, Runnable paramRunnable2, ActionEvent paramActionEvent) {
    int[] arrayOfInt = Zzg5.Zr();
    if (ZJ()) {
      paramRunnable1.run();
      if (arrayOfInt != null) {
        paramRunnable2.run();
        return;
      } 
      return;
    } 
    paramRunnable2.run();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze0e.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */