package burp.theme;

import com.formdev.flatlaf.ui.FlatToggleButtonUI;
import com.formdev.flatlaf.ui.FlatUIUtils;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

public class QuestionnaireToggleButtonUI extends FlatToggleButtonUI {
  private static final String a;
  
  protected QuestionnaireToggleButtonUI(boolean paramBoolean) {
    super(paramBoolean);
  }
  
  public static ComponentUI createUI(JComponent paramJComponent) {
    return FlatUIUtils.canUseSharedUI(paramJComponent) ? FlatUIUtils.createSharedUI(QuestionnaireToggleButtonUI.class, QuestionnaireToggleButtonUI::lambda$createUI$0) : (ComponentUI)new QuestionnaireToggleButtonUI(false);
  }
  
  protected String getPropertyPrefix() {
    return super.getPropertyPrefix() + super.getPropertyPrefix();
  }
  
  private static ComponentUI lambda$createUI$0() {
    return (ComponentUI)new QuestionnaireToggleButtonUI(true);
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: ldc '=\U4lh["GQ.jd'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/theme/QuestionnaireToggleButtonUI.a : Ljava/lang/String;
    //   10: goto -> 153
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 127
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #73
    //   82: goto -> 111
    //   85: bipush #44
    //   87: goto -> 111
    //   90: bipush #53
    //   92: goto -> 111
    //   95: bipush #66
    //   97: goto -> 111
    //   100: bipush #29
    //   102: goto -> 111
    //   105: iconst_4
    //   106: goto -> 111
    //   109: bipush #49
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 34
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 31
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 7
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\QuestionnaireToggleButtonUI.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */