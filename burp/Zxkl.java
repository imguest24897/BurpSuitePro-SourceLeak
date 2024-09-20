package burp;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;
import java.util.function.Consumer;
import javax.swing.KeyStroke;

class Zxkl implements KeyEventDispatcher {
  private final Consumer<KeyStroke> Zr;
  
  private final Runnable Zo;
  
  private final Runnable ZB;
  
  Zxkl(Consumer<KeyStroke> paramConsumer, Runnable paramRunnable1, Runnable paramRunnable2) {
    this.Zr = paramConsumer;
    this.Zo = paramRunnable1;
    this.ZB = paramRunnable2;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: invokestatic ZQ : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: invokestatic Zz : (Ljava/awt/event/KeyEvent;)Z
    //   8: ifeq -> 37
    //   11: aload_1
    //   12: invokevirtual getModifiers : ()I
    //   15: getstatic burp/Zsqw.Zz : I
    //   18: iconst_m1
    //   19: ixor
    //   20: iand
    //   21: istore #4
    //   23: iload #4
    //   25: aload_1
    //   26: invokevirtual getKeyCode : ()I
    //   29: invokestatic ZW : (II)Ljavax/swing/KeyStroke;
    //   32: astore_3
    //   33: aload_2
    //   34: ifnonnull -> 91
    //   37: aload_0
    //   38: aload_1
    //   39: invokevirtual Zn : (Ljava/awt/event/KeyEvent;)Z
    //   42: ifeq -> 51
    //   45: aconst_null
    //   46: astore_3
    //   47: aload_2
    //   48: ifnonnull -> 91
    //   51: aload_0
    //   52: aload_1
    //   53: invokevirtual Zg : (Ljava/awt/event/KeyEvent;)Z
    //   56: ifeq -> 70
    //   59: aload_0
    //   60: getfield Zo : Ljava/lang/Runnable;
    //   63: invokeinterface run : ()V
    //   68: iconst_1
    //   69: ireturn
    //   70: aload_0
    //   71: aload_1
    //   72: invokevirtual Zf : (Ljava/awt/event/KeyEvent;)Z
    //   75: ifeq -> 89
    //   78: aload_0
    //   79: getfield ZB : Ljava/lang/Runnable;
    //   82: invokeinterface run : ()V
    //   87: iconst_1
    //   88: ireturn
    //   89: iconst_0
    //   90: ireturn
    //   91: aload_0
    //   92: getfield Zr : Ljava/util/function/Consumer;
    //   95: aload_3
    //   96: invokeinterface accept : (Ljava/lang/Object;)V
    //   101: aload_1
    //   102: invokevirtual consume : ()V
    //   105: iconst_1
    //   106: ireturn
  }
  
  private boolean Zf(KeyEvent paramKeyEvent) {
    return (paramKeyEvent.getID() != 401) ? false : ((paramKeyEvent.getKeyCode() == 27));
  }
  
  private boolean Zg(KeyEvent paramKeyEvent) {
    return (paramKeyEvent.getID() != 401) ? false : ((paramKeyEvent.getKeyCode() == 10));
  }
  
  private boolean Zn(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getID() != 401)
      return false; 
    switch (paramKeyEvent.getKeyCode()) {
      case 8:
      case 127:
      
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxkl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */