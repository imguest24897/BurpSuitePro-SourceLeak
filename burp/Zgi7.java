package burp;

import com.formdev.flatlaf.ui.FlatMenuItemUI;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class Zgi7 extends FlatMenuItemUI {
  private static boolean ZC;
  
  private static final String a;
  
  public static ComponentUI createUI(JComponent paramJComponent) {
    paramJComponent.putClientProperty(a, Boolean.TRUE);
    return FlatMenuItemUI.createUI(paramJComponent);
  }
  
  public static void ZW(boolean paramBoolean) {
    ZC = paramBoolean;
  }
  
  public static boolean ZF() {
    return ZC;
  }
  
  public static boolean Zd() {
    boolean bool = ZF();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZF : ()Z
    //   3: ifeq -> 10
    //   6: iconst_1
    //   7: invokestatic ZW : (Z)V
    //   10: bipush #39
    //   12: ldc 'r.V%i.'
    //   14: iconst_m1
    //   15: goto -> 24
    //   18: putstatic burp/Zgi7.a : Ljava/lang/String;
    //   21: goto -> 166
    //   24: dup_x2
    //   25: pop
    //   26: invokevirtual toCharArray : ()[C
    //   29: dup_x1
    //   30: arraylength
    //   31: dup_x2
    //   32: pop
    //   33: iconst_0
    //   34: istore_0
    //   35: dup2_x1
    //   36: pop2
    //   37: dup_x2
    //   38: iconst_1
    //   39: if_icmpgt -> 140
    //   42: dup2
    //   43: swap
    //   44: iload_0
    //   45: dup2_x1
    //   46: caload
    //   47: swap
    //   48: iload_0
    //   49: bipush #7
    //   51: irem
    //   52: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #61
    //   94: goto -> 124
    //   97: bipush #81
    //   99: goto -> 124
    //   102: bipush #75
    //   104: goto -> 124
    //   107: bipush #101
    //   109: goto -> 124
    //   112: bipush #95
    //   114: goto -> 124
    //   117: bipush #70
    //   119: goto -> 124
    //   122: bipush #107
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 45
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 42
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 18
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgi7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */