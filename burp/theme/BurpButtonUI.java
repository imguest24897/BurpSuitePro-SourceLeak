package burp.theme;

import burp.Zbqc;
import burp.Zlkk;
import burp.Zt00;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.ui.FlatButtonBorder;
import com.formdev.flatlaf.ui.FlatButtonUI;
import com.formdev.flatlaf.util.SystemInfo;
import java.awt.Component;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.border.Border;

public class BurpButtonUI extends FlatButtonUI {
  private static final String a;
  
  protected BurpButtonUI(boolean paramBoolean) {
    super(paramBoolean);
  }
  
  protected static boolean needsLightAwtPeer(JComponent paramJComponent) {
    return (isAwtPeer(paramJComponent) && FlatLaf.isLafDark());
  }
  
  protected static boolean isAwtPeer(Component paramComponent) {
    return (SystemInfo.isMacOS && paramComponent.getClass().getName().startsWith(a));
  }
  
  protected void installDefaults(AbstractButton paramAbstractButton) {
    paramAbstractButton.setFont(font().ZV());
    paramAbstractButton.setBackground(background().ZS());
    paramAbstractButton.setForeground(foreground().ZS());
    super.installDefaults(paramAbstractButton);
    int i = BurpTableUI.ZL();
    this.background = background().ZS();
    this.foreground = foreground().ZS();
    this.startBackground = background().ZS();
    this.endBackground = background().ZS();
    this.focusedBackground = focusedBackground().ZS();
    this.focusedForeground = focusedForeground().ZS();
    this.hoverBackground = hoverBackground().ZS();
    this.hoverForeground = hoverForeground().ZS();
    this.pressedBackground = pressedBackground().ZS();
    this.pressedForeground = pressedForeground().ZS();
    this.selectedBackground = selectedBackground().ZS();
    this.selectedForeground = selectedForeground().ZS();
    this.disabledBackground = disabledBackground().ZS();
    this.disabledText = disabledForeground().ZS();
    this.disabledSelectedBackground = disabledSelectedBackground().ZS();
    this.disabledSelectedForeground = disabledSelectedForeground().ZS();
    this.defaultBackground = background().ZS();
    this.defaultEndBackground = background().ZS();
    this.defaultForeground = foreground().ZS();
    this.defaultFocusedBackground = focusedBackground().ZS();
    this.defaultFocusedForeground = focusedForeground().ZS();
    this.defaultHoverBackground = hoverBackground().ZS();
    this.defaultHoverForeground = hoverForeground().ZS();
    this.defaultPressedBackground = pressedBackground().ZS();
    this.defaultPressedForeground = pressedForeground().ZS();
    paramAbstractButton.setBorder((Border)border());
    if (i == 0)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  protected Zt00 font() {
    return Zt00.BOLD_FONT;
  }
  
  protected Zlkk foreground() {
    return Zlkk.BUTTON_FOREGROUND;
  }
  
  protected Zlkk focusedForeground() {
    return foreground();
  }
  
  protected Zlkk hoverForeground() {
    return Zlkk.BUTTON_HOVER_FOREGROUND;
  }
  
  protected Zlkk pressedForeground() {
    return foreground();
  }
  
  protected Zlkk selectedForeground() {
    return foreground();
  }
  
  protected Zlkk disabledForeground() {
    return Zlkk.BUTTON_DISABLED_FOREGROUND;
  }
  
  protected Zlkk disabledSelectedForeground() {
    return disabledForeground();
  }
  
  protected Zlkk background() {
    return Zlkk.BUTTON_BACKGROUND;
  }
  
  protected Zlkk focusedBackground() {
    return background();
  }
  
  protected Zlkk hoverBackground() {
    return Zlkk.BUTTON_HOVER_BACKGROUND;
  }
  
  protected Zlkk pressedBackground() {
    return background();
  }
  
  protected Zlkk selectedBackground() {
    return background();
  }
  
  protected Zlkk disabledBackground() {
    return Zlkk.BUTTON_DISABLED_BACKGROUND;
  }
  
  protected Zlkk disabledSelectedBackground() {
    return disabledBackground();
  }
  
  protected FlatButtonBorder border() {
    return new BurpButtonUI$ButtonBorder();
  }
  
  static {
    // Byte code:
    //   0: bipush #78
    //   2: ldc 'CuAG?`N'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/theme/BurpButtonUI.a : Ljava/lang/String;
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
    //   80: bipush #126
    //   82: goto -> 112
    //   85: bipush #34
    //   87: goto -> 112
    //   90: bipush #95
    //   92: goto -> 112
    //   95: bipush #98
    //   97: goto -> 112
    //   100: bipush #87
    //   102: goto -> 112
    //   105: bipush #32
    //   107: goto -> 112
    //   110: bipush #110
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpButtonUI.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */