package burp;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;

public class Zbs6 extends AbstractBorder {
  private static final RenderingHints ZD = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
  
  private static final Insets ZE = new Insets(2, 2, 2, 2);
  
  private final Zev8 ZB;
  
  private final boolean ZA;
  
  private Zbs6(Zev8 paramZev8, boolean paramBoolean) {
    this.ZB = paramZev8;
    this.ZA = paramBoolean;
  }
  
  public static Border Ze() {
    return new Zbs6(Zev8.BOTH, false);
  }
  
  public static Border Zj(boolean paramBoolean) {
    return new Zbs6(Zev8.LEFT, paramBoolean);
  }
  
  public static Border ZJ() {
    return new Zbs6(Zev8.RIGHT, false);
  }
  
  public static Border ZJ(boolean paramBoolean) {
    return new Zbs6(Zev8.NONE, paramBoolean);
  }
  
  public Insets getBorderInsets(Component paramComponent) {
    return ZE;
  }
  
  public Insets getBorderInsets(Component paramComponent, Insets paramInsets) {
    paramInsets.top = ZE.top;
    paramInsets.left = ZE.left;
    paramInsets.bottom = ZE.bottom;
    paramInsets.right = ZE.right;
    return paramInsets;
  }
  
  public void paintBorder(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: invokestatic ZL : ()Z
    //   3: aload_2
    //   4: invokevirtual getColor : ()Ljava/awt/Color;
    //   7: astore #8
    //   9: istore #7
    //   11: aload_2
    //   12: invokestatic Zs : (Ljava/awt/Graphics;)Ljava/awt/Graphics2D;
    //   15: astore #9
    //   17: new java/awt/geom/Area
    //   20: dup
    //   21: new java/awt/Rectangle
    //   24: dup
    //   25: iload_3
    //   26: iload #4
    //   28: iload #5
    //   30: iload #6
    //   32: invokespecial <init> : (IIII)V
    //   35: invokespecial <init> : (Ljava/awt/Shape;)V
    //   38: astore #10
    //   40: new java/awt/geom/Area
    //   43: dup
    //   44: new java/awt/Rectangle
    //   47: dup
    //   48: iload_3
    //   49: getstatic burp/Zbs6.ZE : Ljava/awt/Insets;
    //   52: getfield left : I
    //   55: iadd
    //   56: iload #4
    //   58: getstatic burp/Zbs6.ZE : Ljava/awt/Insets;
    //   61: getfield top : I
    //   64: iadd
    //   65: iload #5
    //   67: getstatic burp/Zbs6.ZE : Ljava/awt/Insets;
    //   70: getfield left : I
    //   73: isub
    //   74: getstatic burp/Zbs6.ZE : Ljava/awt/Insets;
    //   77: getfield right : I
    //   80: isub
    //   81: iload #6
    //   83: getstatic burp/Zbs6.ZE : Ljava/awt/Insets;
    //   86: getfield top : I
    //   89: isub
    //   90: getstatic burp/Zbs6.ZE : Ljava/awt/Insets;
    //   93: getfield bottom : I
    //   96: isub
    //   97: invokespecial <init> : (IIII)V
    //   100: invokespecial <init> : (Ljava/awt/Shape;)V
    //   103: astore #11
    //   105: aload #10
    //   107: aload #11
    //   109: invokevirtual subtract : (Ljava/awt/geom/Area;)V
    //   112: aload #10
    //   114: new java/awt/geom/Area
    //   117: dup
    //   118: aload #9
    //   120: invokevirtual getClip : ()Ljava/awt/Shape;
    //   123: invokespecial <init> : (Ljava/awt/Shape;)V
    //   126: invokevirtual intersect : (Ljava/awt/geom/Area;)V
    //   129: aload #9
    //   131: aload #10
    //   133: invokevirtual setClip : (Ljava/awt/Shape;)V
    //   136: new java/awt/geom/Area
    //   139: dup
    //   140: aload_0
    //   141: getfield ZB : Lburp/Zev8;
    //   144: getstatic burp/Zev8.NONE : Lburp/Zev8;
    //   147: if_acmpne -> 166
    //   150: new java/awt/Rectangle
    //   153: dup
    //   154: iconst_0
    //   155: iconst_0
    //   156: iload #5
    //   158: iload #6
    //   160: invokespecial <init> : (IIII)V
    //   163: goto -> 190
    //   166: new java/awt/geom/RoundRectangle2D$Double
    //   169: dup
    //   170: iload_3
    //   171: i2d
    //   172: iload #4
    //   174: i2d
    //   175: iload #5
    //   177: i2d
    //   178: iload #6
    //   180: i2d
    //   181: ldc2_w 8.0
    //   184: ldc2_w 8.0
    //   187: invokespecial <init> : (DDDDDD)V
    //   190: invokespecial <init> : (Ljava/awt/Shape;)V
    //   193: astore #12
    //   195: aload_0
    //   196: getfield ZB : Lburp/Zev8;
    //   199: getstatic burp/Zev8.LEFT : Lburp/Zev8;
    //   202: if_acmpne -> 254
    //   205: aload #12
    //   207: new java/awt/geom/Area
    //   210: dup
    //   211: new java/awt/geom/Rectangle2D$Double
    //   214: dup
    //   215: iload #5
    //   217: i2d
    //   218: ldc2_w 2.0
    //   221: ddiv
    //   222: dconst_0
    //   223: iload #5
    //   225: i2d
    //   226: ldc2_w 2.0
    //   229: ddiv
    //   230: iload #6
    //   232: i2d
    //   233: invokespecial <init> : (DDDD)V
    //   236: invokespecial <init> : (Ljava/awt/Shape;)V
    //   239: invokevirtual add : (Ljava/awt/geom/Area;)V
    //   242: iload #7
    //   244: ifne -> 291
    //   247: iconst_5
    //   248: anewarray burp/Zbqc
    //   251: invokestatic Zr : ([Lburp/Zbqc;)V
    //   254: aload_0
    //   255: getfield ZB : Lburp/Zev8;
    //   258: getstatic burp/Zev8.RIGHT : Lburp/Zev8;
    //   261: if_acmpne -> 291
    //   264: aload #12
    //   266: new java/awt/geom/Area
    //   269: dup
    //   270: new java/awt/Rectangle
    //   273: dup
    //   274: iconst_0
    //   275: iconst_0
    //   276: iload #5
    //   278: iconst_2
    //   279: idiv
    //   280: iload #6
    //   282: invokespecial <init> : (IIII)V
    //   285: invokespecial <init> : (Ljava/awt/Shape;)V
    //   288: invokevirtual add : (Ljava/awt/geom/Area;)V
    //   291: aload #9
    //   293: aload_1
    //   294: invokevirtual getParent : ()Ljava/awt/Container;
    //   297: ifnull -> 310
    //   300: aload_1
    //   301: invokevirtual getParent : ()Ljava/awt/Container;
    //   304: invokevirtual getBackground : ()Ljava/awt/Color;
    //   307: goto -> 316
    //   310: getstatic burp/Zlkk.PANEL_BACKGROUND : Lburp/Zlkk;
    //   313: invokevirtual ZS : ()Ljava/awt/Color;
    //   316: invokevirtual setColor : (Ljava/awt/Color;)V
    //   319: aload #9
    //   321: aload #10
    //   323: invokevirtual fill : (Ljava/awt/Shape;)V
    //   326: aload #9
    //   328: aload_1
    //   329: invokevirtual getBackground : ()Ljava/awt/Color;
    //   332: invokevirtual setColor : (Ljava/awt/Color;)V
    //   335: aload #9
    //   337: aload #12
    //   339: invokevirtual fill : (Ljava/awt/Shape;)V
    //   342: aload_0
    //   343: getfield ZA : Z
    //   346: ifeq -> 374
    //   349: aload_2
    //   350: getstatic burp/Zlkk.RADIO_BAR_DIVIDER : Lburp/Zlkk;
    //   353: invokevirtual ZS : ()Ljava/awt/Color;
    //   356: invokevirtual setColor : (Ljava/awt/Color;)V
    //   359: aload_2
    //   360: iload_3
    //   361: iload #5
    //   363: iadd
    //   364: iconst_1
    //   365: isub
    //   366: iload #4
    //   368: iconst_1
    //   369: iload #6
    //   371: invokevirtual fillRect : (IIII)V
    //   374: aload_2
    //   375: aload #8
    //   377: invokevirtual setColor : (Ljava/awt/Color;)V
    //   380: return
  }
  
  private static Graphics2D Zs(Graphics paramGraphics) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics.create();
    graphics2D.setRenderingHints(ZD);
    return graphics2D;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbs6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */