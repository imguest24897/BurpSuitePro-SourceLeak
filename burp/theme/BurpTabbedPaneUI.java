package burp.theme;

import burp.Zlqr;
import burp.Zr6e;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.ui.FlatTabbedPaneUI;
import java.awt.Component;
import java.awt.Container;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ComponentUI;

public class BurpTabbedPaneUI extends FlatTabbedPaneUI {
  private static final int LOZENGE_X_INSET = 2;
  
  private static final int LOZENGE_Y_INSET = 2;
  
  private static final int GROUPED_TAB_GAP = 1;
  
  private Container emptyComponent;
  
  private ChangeListener emptyComponentChangeListener;
  
  private PropertyChangeListener emptyComponentPropertyChangeListener;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static ComponentUI createUI(JComponent paramJComponent) {
    return (ComponentUI)new BurpTabbedPaneUI();
  }
  
  protected void installComponents() {
    super.installComponents();
    installEmptyComponent();
    installEmptyComponentPropertyChangeListener();
  }
  
  protected void installEmptyComponent() {
    Object object = this.tabPane.getClientProperty(a(-7540, -28198));
    if (object instanceof Component) {
      Component component = (Component)object;
      this.emptyComponent = (Container)new BurpTabbedPaneUI$EmptyComponentUIResource(component);
      this.emptyComponent.setVisible((this.tabPane.getTabCount() == 0));
      this.emptyComponentChangeListener = this::lambda$installEmptyComponent$0;
      this.tabPane.add(this.emptyComponent);
      this.tabPane.addChangeListener(this.emptyComponentChangeListener);
    } 
  }
  
  protected void installEmptyComponentPropertyChangeListener() {
    this.emptyComponentPropertyChangeListener = this::lambda$installEmptyComponentPropertyChangeListener$1;
    this.tabPane.addPropertyChangeListener(a(-7537, -12347), this.emptyComponentPropertyChangeListener);
  }
  
  protected void uninstallComponents() {
    uninstallEmptyComponentPropertyChangeListener();
    uninstallEmptyComponent();
    super.uninstallComponents();
  }
  
  protected void uninstallEmptyComponentPropertyChangeListener() {
    this.tabPane.removePropertyChangeListener(this.emptyComponentPropertyChangeListener);
    this.emptyComponentPropertyChangeListener = null;
  }
  
  protected void uninstallEmptyComponent() {
    if (this.emptyComponent != null) {
      this.tabPane.remove(this.emptyComponent);
      this.emptyComponent = null;
    } 
    if (this.emptyComponentChangeListener != null) {
      this.tabPane.removeChangeListener(this.emptyComponentChangeListener);
      this.emptyComponentChangeListener = null;
    } 
  }
  
  protected boolean shouldRotateTabRuns(int paramInt) {
    return false;
  }
  
  protected void paintTabBorder(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean) {
    if (!usingLozengeTabs()) {
      super.paintTabBorder(paramGraphics, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean);
      boolean bool = (this.runCount == 0 || paramInt2 >= this.tabRuns[this.runCount - 1]) ? true : false;
      boolean bool1 = FlatClientProperties.clientPropertyBoolean(this.tabPane, a(-7539, 27695), false);
      if (bool1 && !bool)
        super.paintTabBorder(paramGraphics, 2, 0, paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean); 
    } 
  }
  
  protected void paintTabBackground(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZL : ()I
    //   3: istore #9
    //   5: aload_0
    //   6: invokevirtual usingLozengeTabs : ()Z
    //   9: ifeq -> 336
    //   12: iload #4
    //   14: iconst_2
    //   15: iadd
    //   16: istore #10
    //   18: iload #5
    //   20: iconst_2
    //   21: iadd
    //   22: istore #11
    //   24: iload #6
    //   26: iconst_4
    //   27: isub
    //   28: iconst_0
    //   29: invokestatic max : (II)I
    //   32: istore #12
    //   34: iload #7
    //   36: iconst_4
    //   37: isub
    //   38: iconst_0
    //   39: invokestatic max : (II)I
    //   42: istore #13
    //   44: aload_0
    //   45: iload_3
    //   46: invokevirtual getTabGroup : (I)Lburp/Zr6e;
    //   49: astore #14
    //   51: aload #14
    //   53: ifnull -> 305
    //   56: aload #14
    //   58: invokeinterface Zyd : ()Lburp/Zbf6;
    //   63: astore #15
    //   65: aload_1
    //   66: aload_0
    //   67: iload_3
    //   68: invokevirtual isGroupTabDropTarget : (I)Z
    //   71: ifeq -> 82
    //   74: aload #15
    //   76: invokevirtual ZA : ()Ljava/awt/Color;
    //   79: goto -> 87
    //   82: aload #15
    //   84: invokevirtual ZO : ()Ljava/awt/Color;
    //   87: invokevirtual setColor : (Ljava/awt/Color;)V
    //   90: aload_0
    //   91: iload_3
    //   92: aload #14
    //   94: invokevirtual isFirstTabInGroup : (ILburp/Zr6e;)Z
    //   97: ifeq -> 169
    //   100: aload_1
    //   101: iload #10
    //   103: iload #11
    //   105: iload #12
    //   107: iload #13
    //   109: bipush #10
    //   111: bipush #10
    //   113: invokevirtual fillRoundRect : (IIIIII)V
    //   116: aload #14
    //   118: invokeinterface Zy7 : ()Z
    //   123: ifeq -> 300
    //   126: iload #6
    //   128: iconst_2
    //   129: idiv
    //   130: istore #16
    //   132: iload #4
    //   134: iload #16
    //   136: iadd
    //   137: istore #17
    //   139: iload #6
    //   141: iconst_1
    //   142: isub
    //   143: iload #16
    //   145: isub
    //   146: iconst_0
    //   147: invokestatic max : (II)I
    //   150: istore #18
    //   152: aload_1
    //   153: iload #17
    //   155: iload #11
    //   157: iload #18
    //   159: iload #13
    //   161: invokevirtual fillRect : (IIII)V
    //   164: iload #9
    //   166: ifne -> 300
    //   169: aload_0
    //   170: iload_3
    //   171: invokevirtual isFirstTabOnRow : (I)Z
    //   174: istore #16
    //   176: aload_0
    //   177: iload_3
    //   178: aload #14
    //   180: invokevirtual isLastTabInGroup : (ILburp/Zr6e;)Z
    //   183: ifeq -> 235
    //   186: aload_1
    //   187: iload #10
    //   189: iload #11
    //   191: iload #12
    //   193: iload #13
    //   195: bipush #10
    //   197: bipush #10
    //   199: invokevirtual fillRoundRect : (IIIIII)V
    //   202: iload #16
    //   204: ifeq -> 212
    //   207: iload #10
    //   209: goto -> 214
    //   212: iload #4
    //   214: istore #17
    //   216: aload_1
    //   217: iload #17
    //   219: iload #11
    //   221: iload #12
    //   223: iconst_2
    //   224: idiv
    //   225: iload #13
    //   227: invokevirtual fillRect : (IIII)V
    //   230: iload #9
    //   232: ifne -> 300
    //   235: aload_0
    //   236: iload_3
    //   237: invokevirtual isLastTabOnRow : (I)Z
    //   240: istore #17
    //   242: iload #16
    //   244: ifeq -> 252
    //   247: iload #10
    //   249: goto -> 254
    //   252: iload #4
    //   254: istore #18
    //   256: iload #16
    //   258: ifeq -> 265
    //   261: iconst_3
    //   262: goto -> 275
    //   265: iload #17
    //   267: ifeq -> 274
    //   270: iconst_2
    //   271: goto -> 275
    //   274: iconst_1
    //   275: istore #19
    //   277: iload #6
    //   279: iload #19
    //   281: isub
    //   282: iconst_0
    //   283: invokestatic max : (II)I
    //   286: istore #20
    //   288: aload_1
    //   289: iload #18
    //   291: iload #11
    //   293: iload #20
    //   295: iload #13
    //   297: invokevirtual fillRect : (IIII)V
    //   300: iload #9
    //   302: ifne -> 331
    //   305: aload_1
    //   306: getstatic burp/Zlkk.GROUPED_TAB_BAR_DEFAULT_TAB_BACKGROUND : Lburp/Zlkk;
    //   309: invokevirtual ZS : ()Ljava/awt/Color;
    //   312: invokevirtual setColor : (Ljava/awt/Color;)V
    //   315: aload_1
    //   316: iload #10
    //   318: iload #11
    //   320: iload #12
    //   322: iload #13
    //   324: bipush #10
    //   326: bipush #10
    //   328: invokevirtual fillRoundRect : (IIIIII)V
    //   331: iload #9
    //   333: ifne -> 353
    //   336: aload_0
    //   337: aload_1
    //   338: iload_2
    //   339: iload_3
    //   340: iload #4
    //   342: iload #5
    //   344: iload #6
    //   346: iload #7
    //   348: iload #8
    //   350: invokespecial paintTabBackground : (Ljava/awt/Graphics;IIIIIIZ)V
    //   353: return
  }
  
  protected void paintTabSelection(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    // Byte code:
    //   0: invokestatic Zk : ()I
    //   3: istore #8
    //   5: aload_0
    //   6: invokevirtual usingLozengeTabs : ()Z
    //   9: ifeq -> 362
    //   12: aload_0
    //   13: iload_3
    //   14: invokevirtual isGroupTab : (I)Z
    //   17: ifeq -> 21
    //   20: return
    //   21: iload #4
    //   23: iconst_2
    //   24: iadd
    //   25: istore #9
    //   27: iload #5
    //   29: iconst_2
    //   30: iadd
    //   31: istore #10
    //   33: iload #6
    //   35: iconst_4
    //   36: isub
    //   37: iconst_0
    //   38: invokestatic max : (II)I
    //   41: istore #11
    //   43: iload #7
    //   45: iconst_4
    //   46: isub
    //   47: iconst_0
    //   48: invokestatic max : (II)I
    //   51: istore #12
    //   53: aload_0
    //   54: iload_3
    //   55: invokevirtual getTabGroup : (I)Lburp/Zr6e;
    //   58: astore #13
    //   60: aload #13
    //   62: ifnull -> 249
    //   65: aload_0
    //   66: iload_3
    //   67: invokevirtual isFirstTabOnRow : (I)Z
    //   70: istore #15
    //   72: aload_0
    //   73: iload_3
    //   74: aload #13
    //   76: invokevirtual isLastTabInGroup : (ILburp/Zr6e;)Z
    //   79: ifeq -> 174
    //   82: new java/awt/geom/RoundRectangle2D$Float
    //   85: dup
    //   86: iload #9
    //   88: i2f
    //   89: iload #10
    //   91: i2f
    //   92: iload #11
    //   94: i2f
    //   95: iload #12
    //   97: i2f
    //   98: ldc 10.0
    //   100: ldc 10.0
    //   102: invokespecial <init> : (FFFFFF)V
    //   105: astore #16
    //   107: iload #15
    //   109: ifeq -> 117
    //   112: iload #9
    //   114: goto -> 119
    //   117: iload #4
    //   119: istore #17
    //   121: new java/awt/Rectangle
    //   124: dup
    //   125: iload #17
    //   127: iload #10
    //   129: iload #11
    //   131: iconst_2
    //   132: idiv
    //   133: iload #12
    //   135: invokespecial <init> : (IIII)V
    //   138: astore #18
    //   140: new java/awt/geom/Area
    //   143: dup
    //   144: aload #16
    //   146: invokespecial <init> : (Ljava/awt/Shape;)V
    //   149: astore #19
    //   151: aload #19
    //   153: new java/awt/geom/Area
    //   156: dup
    //   157: aload #18
    //   159: invokespecial <init> : (Ljava/awt/Shape;)V
    //   162: invokevirtual add : (Ljava/awt/geom/Area;)V
    //   165: aload #19
    //   167: astore #14
    //   169: iload #8
    //   171: ifeq -> 244
    //   174: aload_0
    //   175: iload_3
    //   176: invokevirtual isLastTabOnRow : (I)Z
    //   179: istore #16
    //   181: iload #15
    //   183: ifeq -> 191
    //   186: iload #9
    //   188: goto -> 193
    //   191: iload #4
    //   193: istore #17
    //   195: iload #15
    //   197: ifeq -> 204
    //   200: iconst_3
    //   201: goto -> 214
    //   204: iload #16
    //   206: ifeq -> 213
    //   209: iconst_2
    //   210: goto -> 214
    //   213: iconst_1
    //   214: istore #18
    //   216: iload #6
    //   218: iload #18
    //   220: isub
    //   221: iconst_0
    //   222: invokestatic max : (II)I
    //   225: istore #19
    //   227: new java/awt/Rectangle
    //   230: dup
    //   231: iload #17
    //   233: iload #10
    //   235: iload #19
    //   237: iload #12
    //   239: invokespecial <init> : (IIII)V
    //   242: astore #14
    //   244: iload #8
    //   246: ifeq -> 274
    //   249: new java/awt/geom/RoundRectangle2D$Float
    //   252: dup
    //   253: iload #9
    //   255: i2f
    //   256: iload #10
    //   258: i2f
    //   259: iload #11
    //   261: i2f
    //   262: iload #12
    //   264: i2f
    //   265: ldc 10.0
    //   267: ldc 10.0
    //   269: invokespecial <init> : (FFFFFF)V
    //   272: astore #14
    //   274: aload_1
    //   275: invokevirtual create : ()Ljava/awt/Graphics;
    //   278: astore #15
    //   280: new java/awt/geom/Area
    //   283: dup
    //   284: aload #15
    //   286: invokevirtual getClip : ()Ljava/awt/Shape;
    //   289: invokespecial <init> : (Ljava/awt/Shape;)V
    //   292: astore #16
    //   294: aload #16
    //   296: new java/awt/geom/Area
    //   299: dup
    //   300: aload #14
    //   302: invokespecial <init> : (Ljava/awt/Shape;)V
    //   305: invokevirtual intersect : (Ljava/awt/geom/Area;)V
    //   308: aload #15
    //   310: aload #16
    //   312: invokevirtual setClip : (Ljava/awt/Shape;)V
    //   315: aload_0
    //   316: aload #15
    //   318: iload_2
    //   319: iload_3
    //   320: iload #4
    //   322: iload #5
    //   324: iconst_2
    //   325: isub
    //   326: iload #6
    //   328: iload #7
    //   330: iconst_1
    //   331: isub
    //   332: iconst_0
    //   333: invokestatic max : (II)I
    //   336: invokespecial paintTabSelection : (Ljava/awt/Graphics;IIIIII)V
    //   339: aload #15
    //   341: invokevirtual dispose : ()V
    //   344: goto -> 357
    //   347: astore #20
    //   349: aload #15
    //   351: invokevirtual dispose : ()V
    //   354: aload #20
    //   356: athrow
    //   357: iload #8
    //   359: ifeq -> 417
    //   362: iload_2
    //   363: lookupswitch default -> 396, 1 -> 388, 3 -> 392
    //   388: iconst_m1
    //   389: goto -> 397
    //   392: iconst_1
    //   393: goto -> 397
    //   396: iconst_0
    //   397: istore #9
    //   399: aload_0
    //   400: aload_1
    //   401: iload_2
    //   402: iload_3
    //   403: iload #4
    //   405: iload #5
    //   407: iload #9
    //   409: iadd
    //   410: iload #6
    //   412: iload #7
    //   414: invokespecial paintTabSelection : (Ljava/awt/Graphics;IIIIII)V
    //   417: return
    // Exception table:
    //   from	to	target	type
    //   280	339	347	finally
    //   347	349	347	finally
  }
  
  protected int calculateMaxTabWidth(int paramInt) {
    return (this.tabPane.getTabCount() == 0) ? calculateTabWidth() : super.calculateMaxTabWidth(paramInt);
  }
  
  private int calculateTabWidth() {
    return getFontMetrics().charWidth('W') + this.tabInsets.left + this.tabInsets.right + 2;
  }
  
  protected int calculateMaxTabHeight(int paramInt) {
    int i = (this.tabPane.getTabCount() == 0) ? calculateTabHeight() : super.calculateMaxTabHeight(paramInt);
    return i + (usingLozengeTabs() ? 4 : 0);
  }
  
  private int calculateTabHeight() {
    return getFontMetrics().getHeight() + this.tabInsets.top + this.tabInsets.bottom + 2;
  }
  
  protected int calculateTabWidth(int paramInt1, int paramInt2, FontMetrics paramFontMetrics) {
    Zr6e zr6e = getTabGroup(paramInt2);
    return (zr6e == null || zr6e.Zy7() || isFirstTabInGroup(paramInt2, zr6e)) ? super.calculateTabWidth(paramInt1, paramInt2, paramFontMetrics) : 0;
  }
  
  protected Insets getTabInsets(int paramInt1, int paramInt2) {
    Insets insets = super.getTabInsets(paramInt1, paramInt2);
    return (insets == null) ? new Insets(0, 4, 1, 4) : insets;
  }
  
  protected LayoutManager createLayoutManager() {
    return (LayoutManager)((this.tabPane.getTabLayoutPolicy() == 0) ? new BurpTabbedPaneUI$1(this) : super.createLayoutManager());
  }
  
  protected FlatTabbedPaneUI.FlatWheelTabScroller createWheelTabScroller() {
    return new BurpTabbedPaneUI$2(this);
  }
  
  private boolean isFirstTabInGroup(int paramInt, Zr6e paramZr6e) {
    Component component = (paramInt == 0) ? null : this.tabPane.getTabComponentAt(paramInt - 1);
    if (component == null)
      return true; 
    Zr6e zr6e = getTabGroup(component);
    return !paramZr6e.ZF(zr6e);
  }
  
  private boolean isLastTabInGroup(int paramInt, Zr6e paramZr6e) {
    Component component = (paramInt == this.tabPane.getTabCount() - 1) ? null : this.tabPane.getTabComponentAt(paramInt + 1);
    if (component == null)
      return true; 
    Zr6e zr6e = getTabGroup(component);
    return !paramZr6e.ZF(zr6e);
  }
  
  private boolean isGroupTab(int paramInt) {
    Component component = this.tabPane.getTabComponentAt(paramInt);
    return (component instanceof Zlqr && ((Zlqr)component).Zp());
  }
  
  private boolean isGroupTabDropTarget(int paramInt) {
    Component component = this.tabPane.getTabComponentAt(paramInt);
    return (component instanceof Zlqr && ((Zlqr)component).ZZ());
  }
  
  private Zr6e getTabGroup(int paramInt) {
    return getTabGroup(this.tabPane.getTabComponentAt(paramInt));
  }
  
  private Zr6e getTabGroup(Component paramComponent) {
    return (paramComponent instanceof Zlqr) ? ((Zlqr)paramComponent).ZR() : null;
  }
  
  private boolean usingLozengeTabs() {
    return FlatClientProperties.clientPropertyBoolean(this.tabPane, a(-7538, 11422), false);
  }
  
  private boolean isFirstTabOnRow(int paramInt) {
    int i = BurpTableUI.Zk();
    if (this.tabPane.getTabLayoutPolicy() != 0)
      return false; 
    byte b = 0;
    while (b < this.runCount) {
      if (paramInt == this.tabRuns[b])
        return true; 
      b++;
      if (i != 0)
        break; 
    } 
    return false;
  }
  
  private boolean isLastTabOnRow(int paramInt) {
    int i = BurpTableUI.Zk();
    if (this.tabPane.getTabLayoutPolicy() != 0)
      return false; 
    byte b = 0;
    while (b < this.runCount) {
      if (paramInt == this.tabRuns[b] - 1)
        return true; 
      b++;
      if (i != 0)
        break; 
    } 
    return false;
  }
  
  private void lambda$installEmptyComponentPropertyChangeListener$1(PropertyChangeEvent paramPropertyChangeEvent) {
    uninstallEmptyComponent();
    installEmptyComponent();
  }
  
  private void lambda$installEmptyComponent$0(ChangeEvent paramChangeEvent) {
    this.emptyComponent.setVisible((this.tabPane.getTabCount() == 0));
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Õ1Ë<ëf+ÄM¶'æãYdÁhðQ,0¬]f-Î®¡Ï¦xOÙ6¡î!À;}O¨'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #28
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #58
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'ùÆ¢aÂä°rX¾ÍQd÷SºFy6^û`¿}ÎA¤à|òÁ®î2:ÝÉ×*R'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #26
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #87
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/theme/BurpTabbedPaneUI.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/theme/BurpTabbedPaneUI.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #67
    //   214: goto -> 244
    //   217: bipush #116
    //   219: goto -> 244
    //   222: bipush #15
    //   224: goto -> 244
    //   227: bipush #85
    //   229: goto -> 244
    //   232: bipush #33
    //   234: goto -> 244
    //   237: bipush #125
    //   239: goto -> 244
    //   242: bipush #69
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE28D) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = '¹';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\BurpTabbedPaneUI.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */