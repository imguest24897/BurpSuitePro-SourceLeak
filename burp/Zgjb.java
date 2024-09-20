package burp;

import java.awt.Window;
import javax.swing.JWindow;

public class Zgjb extends JWindow {
  public Zgjb() {}
  
  public Zgjb(Window paramWindow) {
    super(paramWindow);
  }
  
  public void setVisible(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZQ : ()Z
    //   3: istore_2
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: ifeq -> 26
    //   10: aload_0
    //   11: iload_1
    //   12: invokespecial setVisible : (Z)V
    //   15: iload_2
    //   16: ifeq -> 43
    //   19: goto -> 26
    //   22: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   25: athrow
    //   26: aload_0
    //   27: iload_1
    //   28: <illegal opcode> run : (Lburp/Zgjb;Z)Ljava/lang/Runnable;
    //   33: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   36: goto -> 43
    //   39: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: goto -> 54
    //   46: astore_3
    //   47: aload_3
    //   48: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   51: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   54: return
    // Exception table:
    //   from	to	target	type
    //   4	19	22	java/lang/Exception
    //   4	43	46	java/lang/Exception
    //   10	36	39	java/lang/Exception
  }
  
  private void lambda$setVisible$0(boolean paramBoolean) {
    ZP(this, paramBoolean);
  }
  
  static void ZP(Zgjb paramZgjb, boolean paramBoolean) {
    paramZgjb.setVisible(paramBoolean);
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgjb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */