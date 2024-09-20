package burp;

import java.awt.Toolkit;
import java.awt.Window;

public class Zl09 extends Zl04 {
  private final Window Zx;
  
  private boolean Zm = false;
  
  private static final String a;
  
  public Zl09(Window paramWindow, Zgb6 paramZgb6, Zkc0 paramZkc0, Zed0 paramZed0) {
    this.Zx = paramWindow;
    setTitle(a);
    setContentPane(new Zbvh(paramZgb6, paramZkc0, paramZed0));
    Toolkit.getDefaultToolkit().addAWTEventListener(new Zrvc(this), 24L);
  }
  
  public void setVisible(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZH : ()Ljava/lang/String;
    //   3: astore_2
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: ifeq -> 19
    //   10: aload_0
    //   11: iload_1
    //   12: invokevirtual ZO : (Z)V
    //   15: aload_2
    //   16: ifnull -> 29
    //   19: aload_0
    //   20: iload_1
    //   21: <illegal opcode> run : (Lburp/Zl09;Z)Ljava/lang/Runnable;
    //   26: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   29: return
  }
  
  private void ZO(boolean paramBoolean) {
    if (paramBoolean && !this.Zm) {
      Zmse.Zf(this, 120, 50);
      pack();
      ZO(this.Zx);
      this.Zm = true;
    } 
    super.setVisible(paramBoolean);
  }
  
  private void lambda$setVisible$0(boolean paramBoolean) {
    ZO(paramBoolean);
  }
  
  static {
    // Byte code:
    //   0: bipush #58
    //   2: ldc 'Y:G(_'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zl09.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #119
    //   82: goto -> 112
    //   85: bipush #6
    //   87: goto -> 112
    //   90: bipush #75
    //   92: goto -> 112
    //   95: bipush #32
    //   97: goto -> 112
    //   100: bipush #121
    //   102: goto -> 112
    //   105: bipush #62
    //   107: goto -> 112
    //   110: bipush #80
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl09.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */