package burp;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.JTextField;

public class Zg85 extends JTextField {
  private static final RenderingHints ZN;
  
  private Zlkk Zw;
  
  private Zlkk ZZ;
  
  private Zlkk ZD;
  
  private Zt00 Zs;
  
  private boolean ZC;
  
  private String Zy;
  
  private Zt00 ZJ;
  
  private Icon Zp;
  
  private boolean ZS;
  
  private Ze9n ZL;
  
  private boolean Zx;
  
  private static int ZA;
  
  private static final String a;
  
  public Zg85() {
    Zh(Zt00.DEFAULT_FONT);
    Zt(Zt00.DEFAULT_FONT);
  }
  
  public Zg85(String paramString) {
    this();
    setText(paramString);
  }
  
  public Zg85(int paramInt) {
    this();
    setColumns(paramInt);
  }
  
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
  
  public void setEditable(boolean paramBoolean) {
    this.ZC = paramBoolean;
    setFocusable(paramBoolean);
    super.setEditable(paramBoolean);
  }
  
  public void Zt(boolean paramBoolean) {
    super.setEditable((paramBoolean && this.ZC));
    setFocusable((paramBoolean && this.ZC));
    Zi(paramBoolean ? Zlkk.FOREGROUND : Zlkk.TEXT_FIELD_DISABLED_TEXT_COLOUR);
  }
  
  public void Zg(Zlkk paramZlkk) {
    setDisabledTextColor(paramZlkk.ZS());
    this.Zw = paramZlkk;
  }
  
  public void Zi(Zlkk paramZlkk) {
    setForeground(paramZlkk.ZS());
    this.ZZ = paramZlkk;
  }
  
  public void Zu(Zlkk paramZlkk) {
    setBackground(paramZlkk.ZS());
    this.ZD = paramZlkk;
  }
  
  public void Zh(Zt00 paramZt00) {
    setFont(paramZt00.ZV());
    this.Zs = paramZt00;
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.Zw != null)
      setDisabledTextColor(this.Zw.ZS()); 
    if (this.ZZ != null)
      setForeground(this.ZZ.ZS()); 
    if (this.ZD != null)
      setBackground(this.ZD.ZS()); 
    if (this.Zs != null)
      setFont(this.Zs.ZV()); 
  }
  
  public String ZQ() {
    return this.Zy;
  }
  
  public void ZM(String paramString) {
    this.Zy = paramString;
    putClientProperty(a, paramString);
  }
  
  public void Zt(Zt00 paramZt00) {
    this.ZJ = paramZt00;
  }
  
  public void Zg(Icon paramIcon) {
    this.Zp = paramIcon;
  }
  
  public void Zo(Zb2o paramZb2o) {
    if (this.ZL == null) {
      this.ZL = Ze3m.ZC(Zeuf.CLOSE, Zlkk.ACTION_NORMAL).ZG(Zlkk.ACTION_HOVER).ZU(Zmcx.SMALL_LINE_SIZE).Z_();
      Zgam zgam = new Zgam(this, paramZb2o);
      addMouseListener(zgam);
      addMouseMotionListener(zgam);
      getDocument().addDocumentListener(new Zzd(this, zgam));
    } 
    this.ZS = true;
  }
  
  public Insets getInsets() {
    Insets insets = super.getInsets();
    return (this.ZS && !ZA()) ? new Insets(insets.top, insets.left, insets.bottom, insets.right + this.ZL.getIconWidth()) : ((this.Zp == null) ? insets : new Insets(insets.top, insets.left, insets.bottom, insets.right + this.Zp.getIconWidth()));
  }
  
  public void paint(Graphics paramGraphics) {
    // Byte code:
    //   0: invokestatic ZM : ()Z
    //   3: aload_0
    //   4: aload_1
    //   5: invokespecial paint : (Ljava/awt/Graphics;)V
    //   8: istore_2
    //   9: aload_0
    //   10: getfield Zy : Ljava/lang/String;
    //   13: ifnull -> 124
    //   16: aload_0
    //   17: invokevirtual hasFocus : ()Z
    //   20: ifne -> 124
    //   23: aload_0
    //   24: invokevirtual ZA : ()Z
    //   27: ifeq -> 124
    //   30: aload_0
    //   31: invokevirtual getInsets : ()Ljava/awt/Insets;
    //   34: getfield left : I
    //   37: istore_3
    //   38: aload_0
    //   39: aload_0
    //   40: invokevirtual getWidth : ()I
    //   43: aload_0
    //   44: invokevirtual getHeight : ()I
    //   47: invokevirtual getBaseline : (II)I
    //   50: istore #4
    //   52: aload_1
    //   53: instanceof java/awt/Graphics2D
    //   56: ifeq -> 73
    //   59: aload_1
    //   60: checkcast java/awt/Graphics2D
    //   63: astore #5
    //   65: aload #5
    //   67: getstatic burp/Zg85.ZN : Ljava/awt/RenderingHints;
    //   70: invokevirtual setRenderingHints : (Ljava/util/Map;)V
    //   73: aload_1
    //   74: invokevirtual getFont : ()Ljava/awt/Font;
    //   77: astore #5
    //   79: aload_0
    //   80: getfield ZJ : Lburp/Zt00;
    //   83: ifnull -> 97
    //   86: aload_1
    //   87: aload_0
    //   88: getfield ZJ : Lburp/Zt00;
    //   91: invokevirtual ZV : ()Ljava/awt/Font;
    //   94: invokevirtual setFont : (Ljava/awt/Font;)V
    //   97: aload_1
    //   98: getstatic burp/Zlkk.CLUE_TEXT_FOREGROUND : Lburp/Zlkk;
    //   101: invokevirtual ZS : ()Ljava/awt/Color;
    //   104: invokevirtual setColor : (Ljava/awt/Color;)V
    //   107: aload_1
    //   108: aload_0
    //   109: getfield Zy : Ljava/lang/String;
    //   112: iload_3
    //   113: iload #4
    //   115: invokevirtual drawString : (Ljava/lang/String;II)V
    //   118: aload_1
    //   119: aload #5
    //   121: invokevirtual setFont : (Ljava/awt/Font;)V
    //   124: aload_0
    //   125: getfield ZS : Z
    //   128: ifeq -> 189
    //   131: aload_0
    //   132: invokevirtual ZA : ()Z
    //   135: ifne -> 189
    //   138: aload_0
    //   139: invokevirtual Zg : ()Ljava/awt/Rectangle;
    //   142: astore_3
    //   143: aload_0
    //   144: getfield Zx : Z
    //   147: ifeq -> 161
    //   150: aload_0
    //   151: getfield ZL : Lburp/Ze9n;
    //   154: invokevirtual Zx : ()V
    //   157: iload_2
    //   158: ifne -> 168
    //   161: aload_0
    //   162: getfield ZL : Lburp/Ze9n;
    //   165: invokevirtual Zm : ()V
    //   168: aload_0
    //   169: getfield ZL : Lburp/Ze9n;
    //   172: aload_0
    //   173: aload_1
    //   174: aload_3
    //   175: getfield x : I
    //   178: aload_3
    //   179: getfield y : I
    //   182: invokevirtual paintIcon : (Ljava/awt/Component;Ljava/awt/Graphics;II)V
    //   185: iload_2
    //   186: ifne -> 220
    //   189: aload_0
    //   190: getfield Zp : Ljavax/swing/Icon;
    //   193: ifnull -> 220
    //   196: aload_0
    //   197: invokevirtual ZB : ()Ljava/awt/Rectangle;
    //   200: astore_3
    //   201: aload_0
    //   202: getfield Zp : Ljavax/swing/Icon;
    //   205: aload_0
    //   206: aload_1
    //   207: aload_3
    //   208: getfield x : I
    //   211: aload_3
    //   212: getfield y : I
    //   215: invokeinterface paintIcon : (Ljava/awt/Component;Ljava/awt/Graphics;II)V
    //   220: return
  }
  
  private boolean ZA() {
    return "".equals(getText());
  }
  
  private boolean Zg(int paramInt1, int paramInt2) {
    if (!this.ZS || ZA())
      return false; 
    Rectangle rectangle = Zg();
    int i = rectangle.x;
    int j = rectangle.y;
    int k = i + rectangle.width;
    int m = j + rectangle.height;
    return (i <= paramInt1 && j <= paramInt2 && k >= paramInt1 && m >= paramInt2);
  }
  
  private Rectangle Zg() {
    int i = getWidth() - (getInsets()).right;
    int j = (getHeight() - this.ZL.getIconHeight()) / 2;
    return new Rectangle(i, j, this.ZL.getIconWidth(), this.ZL.getIconHeight());
  }
  
  private Rectangle ZB() {
    if (this.Zp == null)
      return new Rectangle(0, 0, 0, 0); 
    int i = getWidth() - (getInsets()).right;
    int j = (getHeight() - this.Zp.getIconHeight()) / 2;
    return new Rectangle(i, j, this.Zp.getIconWidth(), this.Zp.getIconHeight());
  }
  
  private static void lambda$setClearable$0() {}
  
  static {
    // Byte code:
    //   0: invokestatic ZY : ()I
    //   3: ifeq -> 10
    //   6: iconst_5
    //   7: invokestatic Zk : (I)V
    //   10: bipush #83
    //   12: ldc '%M\XF)9EXI'
    //   14: iconst_m1
    //   15: goto -> 24
    //   18: putstatic burp/Zg85.a : Ljava/lang/String;
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
    //   92: bipush #6
    //   94: goto -> 124
    //   97: bipush #114
    //   99: goto -> 124
    //   102: bipush #110
    //   104: goto -> 124
    //   107: bipush #104
    //   109: goto -> 124
    //   112: bipush #112
    //   114: goto -> 124
    //   117: bipush #18
    //   119: goto -> 124
    //   122: bipush #38
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
    //   166: new java/awt/RenderingHints
    //   169: dup
    //   170: getstatic java/awt/RenderingHints.KEY_ANTIALIASING : Ljava/awt/RenderingHints$Key;
    //   173: getstatic java/awt/RenderingHints.VALUE_ANTIALIAS_ON : Ljava/lang/Object;
    //   176: invokespecial <init> : (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
    //   179: putstatic burp/Zg85.ZN : Ljava/awt/RenderingHints;
    //   182: return
  }
  
  public static void Zk(int paramInt) {
    ZA = paramInt;
  }
  
  public static int ZD() {
    return ZA;
  }
  
  public static int ZY() {
    int i = ZD();
    return (i == 0) ? 16 : 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg85.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */