package burp;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;

class Zzmz implements ActionListener {
  private final List<Ztv7> ZT = new ArrayList<>();
  
  Zzmz() {
    Timer timer = new Timer(0, this);
    timer.setDelay(3000);
    timer.start();
  }
  
  void Ze(Component paramComponent, Runnable paramRunnable) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZT : Ljava/util/List;
    //   7: dup
    //   8: astore #4
    //   10: monitorenter
    //   11: astore_3
    //   12: invokestatic currentTimeMillis : ()J
    //   15: ldc2_w 3000
    //   18: ladd
    //   19: lstore #5
    //   21: aload_0
    //   22: getfield ZT : Ljava/util/List;
    //   25: invokeinterface iterator : ()Ljava/util/Iterator;
    //   30: astore #7
    //   32: aload #7
    //   34: invokeinterface hasNext : ()Z
    //   39: ifeq -> 78
    //   42: aload #7
    //   44: invokeinterface next : ()Ljava/lang/Object;
    //   49: checkcast burp/Ztv7
    //   52: astore #8
    //   54: aload_1
    //   55: aload #8
    //   57: getfield ZH : Ljava/awt/Component;
    //   60: if_acmpne -> 74
    //   63: aload #8
    //   65: lload #5
    //   67: putfield Zp : J
    //   70: aload #4
    //   72: monitorexit
    //   73: return
    //   74: aload_3
    //   75: ifnull -> 32
    //   78: aload_0
    //   79: getfield ZT : Ljava/util/List;
    //   82: new burp/Ztv7
    //   85: dup
    //   86: aload_1
    //   87: aload_2
    //   88: lload #5
    //   90: invokespecial <init> : (Ljava/awt/Component;Ljava/lang/Runnable;J)V
    //   93: invokeinterface add : (Ljava/lang/Object;)Z
    //   98: pop
    //   99: aload #4
    //   101: monitorexit
    //   102: goto -> 113
    //   105: astore #9
    //   107: aload #4
    //   109: monitorexit
    //   110: aload #9
    //   112: athrow
    //   113: return
    // Exception table:
    //   from	to	target	type
    //   12	73	105	finally
    //   74	102	105	finally
    //   105	110	105	finally
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZT : Ljava/util/List;
    //   7: dup
    //   8: astore_3
    //   9: monitorenter
    //   10: astore_2
    //   11: invokestatic currentTimeMillis : ()J
    //   14: lstore #4
    //   16: aload_0
    //   17: getfield ZT : Ljava/util/List;
    //   20: invokeinterface iterator : ()Ljava/util/Iterator;
    //   25: astore #6
    //   27: aload #6
    //   29: invokeinterface hasNext : ()Z
    //   34: ifeq -> 105
    //   37: aload #6
    //   39: invokeinterface next : ()Ljava/lang/Object;
    //   44: checkcast burp/Ztv7
    //   47: astore #7
    //   49: aload #7
    //   51: getfield Zp : J
    //   54: lload #4
    //   56: lcmp
    //   57: ifle -> 71
    //   60: aload_2
    //   61: ifnull -> 27
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   70: athrow
    //   71: aload #7
    //   73: getfield Zq : Ljava/lang/Runnable;
    //   76: invokeinterface run : ()V
    //   81: goto -> 94
    //   84: astore #8
    //   86: aload #8
    //   88: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   91: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   94: aload #6
    //   96: invokeinterface remove : ()V
    //   101: aload_2
    //   102: ifnull -> 27
    //   105: aload_3
    //   106: monitorexit
    //   107: goto -> 117
    //   110: astore #9
    //   112: aload_3
    //   113: monitorexit
    //   114: aload #9
    //   116: athrow
    //   117: return
    // Exception table:
    //   from	to	target	type
    //   11	107	110	finally
    //   49	64	67	java/lang/Exception
    //   71	81	84	java/lang/Exception
    //   110	114	110	finally
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzmz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */