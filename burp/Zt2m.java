package burp;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.List;
import java.util.stream.IntStream;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public final class Zt2m {
  public static final List<Image> ZT = ZJ();
  
  private static int[] Z_;
  
  public static Window ZF(Component paramComponent) {
    return (paramComponent == null) ? null : ((paramComponent instanceof Window) ? (Window)paramComponent : ZF(paramComponent.getParent()));
  }
  
  public static boolean ZT(Window paramWindow1, Window paramWindow2) {
    return (paramWindow1 == null) ? false : ((paramWindow1 == paramWindow2) ? true : ZT(paramWindow1.getOwner(), paramWindow2));
  }
  
  public static Component Zb(Component paramComponent) {
    Container container = paramComponent.getParent();
    return (container == null || !container.isVisible()) ? paramComponent : Zb(container);
  }
  
  public static Rectangle Zs(Point paramPoint) {
    GraphicsDevice[] arrayOfGraphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
    int i = arrayOfGraphicsDevice.length;
    String[] arrayOfString = Zbv5.ZvS();
    byte b = 0;
    while (b < i) {
      GraphicsDevice graphicsDevice = arrayOfGraphicsDevice[b];
      Rectangle rectangle = Zs(graphicsDevice.getDefaultConfiguration());
      if (rectangle.contains(paramPoint))
        return rectangle; 
      b++;
      if (arrayOfString == null)
        break; 
    } 
    return Zs(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration());
  }
  
  private static Rectangle Zs(GraphicsConfiguration paramGraphicsConfiguration) {
    Rectangle rectangle = paramGraphicsConfiguration.getBounds();
    try {
      Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(paramGraphicsConfiguration);
      rectangle.x += insets.left;
      rectangle.width -= insets.left + insets.right;
      rectangle.y += insets.top;
      rectangle.height -= insets.top + insets.bottom;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
    } 
    return rectangle;
  }
  
  public static Rectangle ZW(Window paramWindow) {
    return ZX(paramWindow.getX(), paramWindow.getY(), paramWindow.getWidth(), paramWindow.getHeight());
  }
  
  private static Rectangle ZX(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return Zs(new Point(paramInt1 + paramInt3 / 2, paramInt2 + paramInt4 / 2));
  }
  
  public static void Zy(Window paramWindow1, Window paramWindow2) {
    ZB(paramWindow1, paramWindow2, 0, 0);
  }
  
  public static void ZB(Window paramWindow1, Window paramWindow2, int paramInt1, int paramInt2) {
    if (paramWindow1 == null || paramWindow2 == null)
      return; 
    paramWindow1.setLocation(paramWindow2.getX() + (paramWindow2.getWidth() - paramWindow1.getWidth()) / 2 + paramInt1, paramWindow2.getY() + (paramWindow2.getHeight() - paramWindow1.getHeight()) / 2 + paramInt2);
    ZK(paramWindow1, ZW(paramWindow2));
  }
  
  public static void Zq(Window paramWindow1, Window paramWindow2) {
    Z_(paramWindow1, paramWindow2, 0, 0);
  }
  
  public static void Z_(Window paramWindow1, Window paramWindow2, int paramInt1, int paramInt2) {
    Rectangle rectangle = (paramWindow2 == null) ? Zs(new Point(100, 100)) : ZW(paramWindow2);
    paramWindow1.setLocation(rectangle.x + (rectangle.width - paramWindow1.getWidth()) / 2 + paramInt1, rectangle.y + (rectangle.height - paramWindow1.getHeight()) / 2 + paramInt2);
    ZK(paramWindow1, rectangle);
  }
  
  public static boolean ZZ(Window paramWindow) {
    Point point1 = new Point(paramWindow.getX(), paramWindow.getY());
    Point point2 = new Point(paramWindow.getX() + paramWindow.getWidth() - 1, paramWindow.getY());
    Point point3 = new Point(paramWindow.getX(), paramWindow.getY() + paramWindow.getHeight() - 1);
    Point point4 = new Point(paramWindow.getX() + paramWindow.getWidth() - 1, paramWindow.getY() + paramWindow.getHeight() - 1);
    return ZN(new Point[] { point1, point2, point3, point4 });
  }
  
  private static boolean ZN(Point... paramVarArgs) {
    // Byte code:
    //   0: aload_0
    //   1: astore_2
    //   2: invokestatic ZvS : ()[Ljava/lang/String;
    //   5: aload_2
    //   6: arraylength
    //   7: istore_3
    //   8: iconst_0
    //   9: istore #4
    //   11: astore_1
    //   12: iload #4
    //   14: iload_3
    //   15: if_icmpge -> 105
    //   18: aload_2
    //   19: iload #4
    //   21: aaload
    //   22: astore #5
    //   24: iconst_0
    //   25: istore #6
    //   27: invokestatic getLocalGraphicsEnvironment : ()Ljava/awt/GraphicsEnvironment;
    //   30: invokevirtual getScreenDevices : ()[Ljava/awt/GraphicsDevice;
    //   33: astore #7
    //   35: aload #7
    //   37: arraylength
    //   38: istore #8
    //   40: iconst_0
    //   41: istore #9
    //   43: iload #9
    //   45: iload #8
    //   47: if_icmpge -> 91
    //   50: aload #7
    //   52: iload #9
    //   54: aaload
    //   55: astore #10
    //   57: aload #10
    //   59: invokevirtual getDefaultConfiguration : ()Ljava/awt/GraphicsConfiguration;
    //   62: invokestatic Zs : (Ljava/awt/GraphicsConfiguration;)Ljava/awt/Rectangle;
    //   65: astore #11
    //   67: aload #11
    //   69: aload #5
    //   71: invokevirtual contains : (Ljava/awt/Point;)Z
    //   74: ifeq -> 84
    //   77: iconst_1
    //   78: istore #6
    //   80: aload_1
    //   81: ifnonnull -> 91
    //   84: iinc #9, 1
    //   87: aload_1
    //   88: ifnonnull -> 43
    //   91: iload #6
    //   93: ifne -> 98
    //   96: iconst_0
    //   97: ireturn
    //   98: iinc #4, 1
    //   101: aload_1
    //   102: ifnonnull -> 12
    //   105: iconst_1
    //   106: ireturn
  }
  
  public static void ZK(Window paramWindow, Rectangle paramRectangle) {
    Rectangle rectangle = Zh(paramWindow.getBounds(), paramRectangle);
    if (rectangle.width != paramWindow.getWidth() || rectangle.height != paramWindow.getHeight())
      paramWindow.setSize(rectangle.width, rectangle.height); 
    if (rectangle.x != paramWindow.getX() || rectangle.y != paramWindow.getY())
      paramWindow.setLocation(rectangle.x, rectangle.y); 
  }
  
  public static Rectangle Zh(Rectangle paramRectangle1, Rectangle paramRectangle2) {
    // Byte code:
    //   0: invokestatic ZvS : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield x : I
    //   7: istore_3
    //   8: aload_0
    //   9: getfield y : I
    //   12: istore #4
    //   14: aload_0
    //   15: getfield width : I
    //   18: istore #5
    //   20: aload_0
    //   21: getfield height : I
    //   24: istore #6
    //   26: astore_2
    //   27: iload #5
    //   29: aload_1
    //   30: getfield width : I
    //   33: if_icmple -> 42
    //   36: aload_1
    //   37: getfield width : I
    //   40: istore #5
    //   42: iload #6
    //   44: aload_1
    //   45: getfield height : I
    //   48: if_icmple -> 57
    //   51: aload_1
    //   52: getfield height : I
    //   55: istore #6
    //   57: iload_3
    //   58: aload_1
    //   59: getfield x : I
    //   62: if_icmpge -> 74
    //   65: aload_1
    //   66: getfield x : I
    //   69: istore_3
    //   70: aload_2
    //   71: ifnonnull -> 103
    //   74: iload_3
    //   75: iload #5
    //   77: iadd
    //   78: aload_1
    //   79: getfield x : I
    //   82: aload_1
    //   83: getfield width : I
    //   86: iadd
    //   87: if_icmple -> 103
    //   90: aload_1
    //   91: getfield x : I
    //   94: aload_1
    //   95: getfield width : I
    //   98: iadd
    //   99: iload #5
    //   101: isub
    //   102: istore_3
    //   103: iload #4
    //   105: aload_1
    //   106: getfield y : I
    //   109: if_icmpge -> 122
    //   112: aload_1
    //   113: getfield y : I
    //   116: istore #4
    //   118: aload_2
    //   119: ifnonnull -> 153
    //   122: iload #4
    //   124: iload #6
    //   126: iadd
    //   127: aload_1
    //   128: getfield y : I
    //   131: aload_1
    //   132: getfield height : I
    //   135: iadd
    //   136: if_icmple -> 153
    //   139: aload_1
    //   140: getfield y : I
    //   143: aload_1
    //   144: getfield height : I
    //   147: iadd
    //   148: iload #6
    //   150: isub
    //   151: istore #4
    //   153: new java/awt/Rectangle
    //   156: dup
    //   157: iload_3
    //   158: iload #4
    //   160: iload #5
    //   162: iload #6
    //   164: invokespecial <init> : (IIII)V
    //   167: areturn
  }
  
  public static void Zn(Window paramWindow) {
    Window[] arrayOfWindow = paramWindow.getOwnedWindows();
    int i = arrayOfWindow.length;
    String[] arrayOfString = Zbv5.ZvS();
    byte b = 0;
    while (b < i) {
      Window window = arrayOfWindow[b];
      window.setVisible(false);
      window.dispose();
      b++;
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private static List<Image> ZJ() {
    FlatSVGIcon flatSVGIcon = new FlatSVGIcon(Zeuf.BURP_SUITE.ZX(), 10.0F);
    FlatSVGIcon.ColorFilter colorFilter = new FlatSVGIcon.ColorFilter(Zt2m::lambda$createIconImages$0);
    flatSVGIcon.setColorFilter(colorFilter);
    return IntStream.of(new int[] { 16, 20, 28, 32, 64 }).mapToObj(Zt2m::lambda$createIconImages$1).map(flatSVGIcon::lambda$createIconImages$2).toList();
  }
  
  private static Image lambda$createIconImages$2(FlatSVGIcon paramFlatSVGIcon, Dimension paramDimension) {
    return paramFlatSVGIcon.getImage().getScaledInstance(paramDimension.width, paramDimension.height, 4);
  }
  
  private static Dimension lambda$createIconImages$1(int paramInt) {
    return new Dimension(paramInt, paramInt);
  }
  
  private static Color lambda$createIconImages$0(Color paramColor) {
    return Color.BLACK.equals(paramColor) ? Zi0.ZT().ZS() : paramColor;
  }
  
  static {
    Zi(new int[3]);
  }
  
  public static void Zi(int[] paramArrayOfint) {
    Z_ = paramArrayOfint;
  }
  
  public static int[] ZH() {
    return Z_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt2m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */