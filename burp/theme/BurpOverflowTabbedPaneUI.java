package burp.theme;

import burp.Zt0b;
import com.formdev.flatlaf.ui.FlatTabbedPaneUI;
import com.formdev.flatlaf.ui.FlatUIUtils;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.JViewport;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class BurpOverflowTabbedPaneUI extends BurpTabbedPaneUI {
  Zt0b tabbedPane;
  
  private BurpOverflowTabbedPaneUI$MoreTabsButton moreTabsButton;
  
  private static final String c;
  
  public static ComponentUI createUI(JComponent paramJComponent) {
    return (ComponentUI)new BurpOverflowTabbedPaneUI();
  }
  
  public void installUI(JComponent paramJComponent) {
    super.installUI(paramJComponent);
    this.tabbedPane = (Zt0b)paramJComponent;
  }
  
  protected void paintTabArea(Graphics paramGraphics, int paramInt1, int paramInt2) {
    Object[] arrayOfObject = FlatUIUtils.setRenderingHints(paramGraphics);
    paintOverflowStyleTabArea(paramGraphics, paramInt1);
    FlatUIUtils.resetRenderingHints(paramGraphics, arrayOfObject);
  }
  
  private void paintOverflowStyleTabArea(Graphics paramGraphics, int paramInt) {
    Rectangle rectangle1 = new Rectangle();
    Rectangle rectangle2 = new Rectangle();
    int i = BurpTableUI.Zk();
    Rectangle rectangle3 = paramGraphics.getClipBounds();
    int j = this.tabPane.getSelectedIndex();
    if (tabsInOriginalOrder(j)) {
      paintAllTabs(paramGraphics, paramInt, rectangle1, rectangle2, rectangle3);
      return;
    } 
    byte b = 0;
    while (b < this.rects.length && rectangle3.x > (this.rects[b]).x) {
      b++;
      if (i != 0)
        break; 
    } 
    while (b < this.tabbedPane.ZI()) {
      Rectangle rectangle = this.rects[b];
      if (rectangle3.contains(rectangle))
        paintTab(paramGraphics, paramInt, this.rects, b, rectangle1, rectangle2); 
      b++;
      if (i != 0)
        break; 
    } 
    if (b == this.tabbedPane.ZI()) {
      Rectangle rectangle = this.rects[this.tabbedPane.ZI()];
      if (rectangle3.contains(rectangle)) {
        Rectangle[] arrayOfRectangle = new Rectangle[j + 1];
        arrayOfRectangle[j] = rectangle;
        paintTab(paramGraphics, paramInt, arrayOfRectangle, j, rectangle1, rectangle2);
        b++;
      } 
    } 
    if (this.tabbedPane.ZO() != -1 && this.tabbedPane.ZO() < this.rects.length && this.tabbedPane.ZO() != j) {
      while (b < this.tabbedPane.Zy()) {
        Rectangle rectangle4 = this.rects[b];
        if (rectangle3.contains(rectangle4))
          paintTab(paramGraphics, paramInt, this.rects, b, rectangle1, rectangle2); 
        b++;
        if (i != 0)
          break; 
      } 
      Rectangle rectangle = this.rects[this.tabbedPane.Zy()];
      if (rectangle3.contains(rectangle)) {
        Rectangle[] arrayOfRectangle = new Rectangle[this.tabbedPane.ZO() + 1];
        arrayOfRectangle[this.tabbedPane.ZO()] = rectangle;
        paintTab(paramGraphics, paramInt, arrayOfRectangle, this.tabbedPane.ZO(), rectangle1, rectangle2);
      } 
    } 
  }
  
  private void paintAllTabs(Graphics paramGraphics, int paramInt, Rectangle paramRectangle1, Rectangle paramRectangle2, Rectangle paramRectangle3) {
    byte b = 0;
    int i = BurpTableUI.Zk();
    while (b < this.rects.length) {
      Rectangle rectangle = this.rects[b];
      if (paramRectangle3.intersects(rectangle))
        paintTab(paramGraphics, paramInt, this.rects, b, paramRectangle1, paramRectangle2); 
      b++;
      if (i != 0)
        break; 
    } 
  }
  
  protected Rectangle getTabBounds(int paramInt, Rectangle paramRectangle) {
    // Byte code:
    //   0: invokestatic ZL : ()I
    //   3: aload_0
    //   4: getfield tabPane : Ljavax/swing/JTabbedPane;
    //   7: invokevirtual getSelectedIndex : ()I
    //   10: istore #4
    //   12: istore_3
    //   13: aload_0
    //   14: iload #4
    //   16: invokevirtual tabsInOriginalOrder : (I)Z
    //   19: ifne -> 33
    //   22: iload_1
    //   23: aload_0
    //   24: getfield tabbedPane : Lburp/Zt0b;
    //   27: invokevirtual ZI : ()I
    //   30: if_icmpge -> 40
    //   33: aload_0
    //   34: iload_1
    //   35: aload_2
    //   36: invokespecial getTabBounds : (ILjava/awt/Rectangle;)Ljava/awt/Rectangle;
    //   39: areturn
    //   40: iload_1
    //   41: aload_0
    //   42: getfield tabbedPane : Lburp/Zt0b;
    //   45: invokevirtual ZI : ()I
    //   48: if_icmpne -> 65
    //   51: aload_2
    //   52: aload_0
    //   53: getfield rects : [Ljava/awt/Rectangle;
    //   56: iload_1
    //   57: aaload
    //   58: invokevirtual setBounds : (Ljava/awt/Rectangle;)V
    //   61: iload_3
    //   62: ifne -> 208
    //   65: iload_1
    //   66: iload #4
    //   68: if_icmpge -> 87
    //   71: aload_2
    //   72: aload_0
    //   73: getfield rects : [Ljava/awt/Rectangle;
    //   76: iload_1
    //   77: iconst_1
    //   78: iadd
    //   79: aaload
    //   80: invokevirtual setBounds : (Ljava/awt/Rectangle;)V
    //   83: iload_3
    //   84: ifne -> 208
    //   87: iload_1
    //   88: iload #4
    //   90: if_icmpne -> 113
    //   93: aload_2
    //   94: aload_0
    //   95: getfield rects : [Ljava/awt/Rectangle;
    //   98: aload_0
    //   99: getfield tabbedPane : Lburp/Zt0b;
    //   102: invokevirtual ZI : ()I
    //   105: aaload
    //   106: invokevirtual setBounds : (Ljava/awt/Rectangle;)V
    //   109: iload_3
    //   110: ifne -> 208
    //   113: aload_0
    //   114: getfield tabbedPane : Lburp/Zt0b;
    //   117: invokevirtual ZO : ()I
    //   120: iconst_m1
    //   121: if_icmpeq -> 198
    //   124: aload_0
    //   125: getfield tabbedPane : Lburp/Zt0b;
    //   128: invokevirtual ZO : ()I
    //   131: aload_0
    //   132: getfield rects : [Ljava/awt/Rectangle;
    //   135: arraylength
    //   136: if_icmpge -> 198
    //   139: aload_0
    //   140: getfield tabbedPane : Lburp/Zt0b;
    //   143: invokevirtual ZO : ()I
    //   146: iload #4
    //   148: if_icmpeq -> 198
    //   151: iload_1
    //   152: aload_0
    //   153: getfield tabbedPane : Lburp/Zt0b;
    //   156: invokevirtual ZO : ()I
    //   159: if_icmpge -> 178
    //   162: aload_2
    //   163: aload_0
    //   164: getfield rects : [Ljava/awt/Rectangle;
    //   167: iload_1
    //   168: iconst_1
    //   169: iadd
    //   170: aaload
    //   171: invokevirtual setBounds : (Ljava/awt/Rectangle;)V
    //   174: iload_3
    //   175: ifne -> 208
    //   178: aload_2
    //   179: aload_0
    //   180: getfield rects : [Ljava/awt/Rectangle;
    //   183: aload_0
    //   184: getfield tabbedPane : Lburp/Zt0b;
    //   187: invokevirtual Zy : ()I
    //   190: aaload
    //   191: invokevirtual setBounds : (Ljava/awt/Rectangle;)V
    //   194: iload_3
    //   195: ifne -> 208
    //   198: aload_2
    //   199: aload_0
    //   200: getfield rects : [Ljava/awt/Rectangle;
    //   203: iload_1
    //   204: aaload
    //   205: invokevirtual setBounds : (Ljava/awt/Rectangle;)V
    //   208: aload_0
    //   209: getfield tabViewport : Ljavax/swing/JViewport;
    //   212: invokevirtual getViewPosition : ()Ljava/awt/Point;
    //   215: astore #5
    //   217: aload_2
    //   218: aload_2
    //   219: getfield x : I
    //   222: aload_0
    //   223: getfield tabViewport : Ljavax/swing/JViewport;
    //   226: invokevirtual getX : ()I
    //   229: iadd
    //   230: aload #5
    //   232: getfield x : I
    //   235: isub
    //   236: putfield x : I
    //   239: aload_2
    //   240: aload_2
    //   241: getfield y : I
    //   244: aload_0
    //   245: getfield tabViewport : Ljavax/swing/JViewport;
    //   248: invokevirtual getY : ()I
    //   251: iadd
    //   252: aload #5
    //   254: getfield y : I
    //   257: isub
    //   258: putfield y : I
    //   261: aload_2
    //   262: areturn
  }
  
  public int tabForCoordinate(JTabbedPane paramJTabbedPane, int paramInt1, int paramInt2) {
    Point point = this.tabViewport.getViewPosition();
    paramInt1 = paramInt1 - this.tabViewport.getX() + point.x;
    paramInt2 = paramInt2 - this.tabViewport.getY() + point.y;
    int i = BurpTableUI.Zk();
    Rectangle rectangle = this.tabViewport.getViewRect();
    if (!rectangle.contains(paramInt1, paramInt2))
      return -1; 
    int j = this.tabPane.getSelectedIndex();
    byte b = 0;
    while (b < this.rects.length) {
      Rectangle rectangle1 = this.rects[b];
      if (rectangle.contains(rectangle1) && rectangle1.contains(paramInt1, paramInt2)) {
        if (b >= this.tabbedPane.ZI() && !tabsInOriginalOrder(j)) {
          if (b == this.tabbedPane.ZI())
            return j; 
          if (b == this.tabbedPane.Zy())
            return this.tabbedPane.ZO(); 
        } 
        return b;
      } 
      b++;
      if (i != 0)
        break; 
    } 
    return -1;
  }
  
  protected JButton createMoreTabsButton() {
    this.moreTabsButton = new BurpOverflowTabbedPaneUI$MoreTabsButton(this);
    this.moreTabsButton.setName(c);
    return (JButton)this.moreTabsButton;
  }
  
  protected int getScrollButtonsPolicy() {
    return 0;
  }
  
  protected LayoutManager createScrollLayoutManager(BasicTabbedPaneUI.TabbedPaneLayout paramTabbedPaneLayout) {
    return (LayoutManager)new BurpOverflowTabbedPaneUI$1(this, paramTabbedPaneLayout);
  }
  
  private boolean tabsInOriginalOrder(int paramInt) {
    return ((paramInt == -1 || this.tabbedPane.ZI() == paramInt) && this.tabbedPane.ZO() == -1);
  }
  
  protected FlatTabbedPaneUI.FlatWheelTabScroller createWheelTabScroller() {
    return null;
  }
  
  protected void ensureSelectedTabIsVisible() {}
  
  protected void paintText(Graphics paramGraphics, int paramInt1, Font paramFont, FontMetrics paramFontMetrics, int paramInt2, String paramString, Rectangle paramRectangle, boolean paramBoolean) {
    if (this.tabPane.isEnabled() && this.tabPane.isEnabledAt(paramInt2) && getRolloverTab() == paramInt2 && paramGraphics instanceof Graphics2D)
      paramGraphics = new BurpOverflowTabbedPaneUI$2(this, (Graphics2D)paramGraphics); 
    super.paintText(paramGraphics, paramInt1, paramFont, paramFontMetrics, paramInt2, paramString, paramRectangle, paramBoolean);
  }
  
  static {
    // Byte code:
    //   0: bipush #72
    //   2: ldc '9"C[To*<`{yP.5k\L_x?}iyP?zxY^s'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/theme/BurpOverflowTabbedPaneUI.c : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #85
    //   82: goto -> 111
    //   85: iconst_4
    //   86: goto -> 111
    //   89: bipush #24
    //   91: goto -> 111
    //   94: bipush #71
    //   96: goto -> 111
    //   99: bipush #68
    //   101: goto -> 111
    //   104: bipush #101
    //   106: goto -> 111
    //   109: bipush #121
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
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
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpOverflowTabbedPaneUI.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */