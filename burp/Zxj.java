package burp;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.ResourceBundle;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;

public class Zxj implements Zsy1 {
  private final Zr93 ZE;
  
  private JTextArea Zk;
  
  private Zzl2 ZV;
  
  private String Zs;
  
  private final Rectangle ZQ;
  
  private static final ResourceBundle Zt;
  
  private static Zbqc[] Zi;
  
  public Zxj(JTextArea paramJTextArea) {
    Zv(paramJTextArea);
    this.ZE = new Zr93(this);
    this.ZQ = new Rectangle();
  }
  
  private void ZJ() {
    Rectangle rectangle = this.ZV.getBounds();
    Point point = rectangle.getLocation();
    SwingUtilities.convertPointFromScreen(point, this.Zk);
    rectangle.setLocation(point);
    this.ZQ.setBounds(rectangle.x, rectangle.y - 15, rectangle.width, rectangle.height + 30);
  }
  
  private void ZK(MouseEvent paramMouseEvent, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zk : Ljavax/swing/JTextArea;
    //   4: invokestatic getWindowAncestor : (Ljava/awt/Component;)Ljava/awt/Window;
    //   7: astore_3
    //   8: aload_0
    //   9: new burp/Zzl2
    //   12: dup
    //   13: aload_3
    //   14: aload_0
    //   15: aload_2
    //   16: invokespecial <init> : (Ljava/awt/Window;Lburp/Zxj;Ljava/lang/String;)V
    //   19: putfield ZV : Lburp/Zzl2;
    //   22: aload_0
    //   23: aload_1
    //   24: aload_2
    //   25: <illegal opcode> run : (Lburp/Zxj;Ljava/awt/event/MouseEvent;Ljava/lang/String;)Ljava/lang/Runnable;
    //   30: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   33: return
  }
  
  static String ZR(String paramString) {
    return Zt.getString(paramString);
  }
  
  public void ZX() {
    if (this.ZV != null) {
      this.ZV.dispose();
      this.ZV = null;
      this.ZE.ZG();
      this.ZQ.setBounds(-1, -1, 0, 0);
      this.Zs = null;
      this.Zk.requestFocus();
    } 
  }
  
  void ZE() {
    this.ZE.ZG();
  }
  
  private void Zv(JTextArea paramJTextArea) {
    this.Zk = paramJTextArea;
    ToolTipManager.sharedInstance().registerComponent(paramJTextArea);
  }
  
  public String ZT(MouseEvent paramMouseEvent, String paramString) {
    if (paramString == null || paramString.isEmpty()) {
      ZX();
      this.Zs = paramString;
      return null;
    } 
    if (this.Zs == null || paramString.length() != this.Zs.length() || !paramString.equals(this.Zs)) {
      ZX();
      ZK(paramMouseEvent, paramString);
    } 
    return null;
  }
  
  private void lambda$createAndShowTipWindow$0(MouseEvent paramMouseEvent, String paramString) {
    // Byte code:
    //   0: invokestatic Zt : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield ZV : Lburp/Zzl2;
    //   8: ifnonnull -> 12
    //   11: return
    //   12: aload_0
    //   13: getfield ZV : Lburp/Zzl2;
    //   16: invokevirtual Zo : ()V
    //   19: aload_0
    //   20: getfield Zk : Ljavax/swing/JTextArea;
    //   23: invokevirtual getComponentOrientation : ()Ljava/awt/ComponentOrientation;
    //   26: astore #4
    //   28: aload_1
    //   29: invokevirtual getPoint : ()Ljava/awt/Point;
    //   32: astore #5
    //   34: aload #5
    //   36: aload_0
    //   37: getfield Zk : Ljavax/swing/JTextArea;
    //   40: invokestatic convertPointToScreen : (Ljava/awt/Point;Ljava/awt/Component;)V
    //   43: aload #5
    //   45: getfield x : I
    //   48: aload #5
    //   50: getfield y : I
    //   53: invokestatic Z_ : (II)Ljava/awt/Rectangle;
    //   56: astore #6
    //   58: aload #5
    //   60: getfield y : I
    //   63: bipush #12
    //   65: iadd
    //   66: istore #7
    //   68: iload #7
    //   70: aload_0
    //   71: getfield ZV : Lburp/Zzl2;
    //   74: invokevirtual getHeight : ()I
    //   77: iadd
    //   78: aload #6
    //   80: getfield y : I
    //   83: aload #6
    //   85: getfield height : I
    //   88: iadd
    //   89: if_icmplt -> 110
    //   92: aload #5
    //   94: getfield y : I
    //   97: bipush #12
    //   99: isub
    //   100: aload_0
    //   101: getfield ZV : Lburp/Zzl2;
    //   104: invokevirtual getHeight : ()I
    //   107: isub
    //   108: istore #7
    //   110: aload #5
    //   112: getfield x : I
    //   115: bipush #18
    //   117: isub
    //   118: istore #8
    //   120: aload #4
    //   122: invokevirtual isLeftToRight : ()Z
    //   125: ifne -> 146
    //   128: aload #5
    //   130: getfield x : I
    //   133: aload_0
    //   134: getfield ZV : Lburp/Zzl2;
    //   137: invokevirtual getWidth : ()I
    //   140: isub
    //   141: bipush #18
    //   143: iadd
    //   144: istore #8
    //   146: iload #8
    //   148: aload #6
    //   150: getfield x : I
    //   153: if_icmpge -> 167
    //   156: aload #6
    //   158: getfield x : I
    //   161: istore #8
    //   163: aload_3
    //   164: ifnonnull -> 212
    //   167: iload #8
    //   169: aload_0
    //   170: getfield ZV : Lburp/Zzl2;
    //   173: invokevirtual getWidth : ()I
    //   176: iadd
    //   177: aload #6
    //   179: getfield x : I
    //   182: aload #6
    //   184: getfield width : I
    //   187: iadd
    //   188: if_icmple -> 212
    //   191: aload #6
    //   193: getfield x : I
    //   196: aload #6
    //   198: getfield width : I
    //   201: iadd
    //   202: aload_0
    //   203: getfield ZV : Lburp/Zzl2;
    //   206: invokevirtual getWidth : ()I
    //   209: isub
    //   210: istore #8
    //   212: aload_0
    //   213: getfield ZV : Lburp/Zzl2;
    //   216: iload #8
    //   218: iload #7
    //   220: invokevirtual setLocation : (II)V
    //   223: aload_0
    //   224: getfield ZV : Lburp/Zzl2;
    //   227: iconst_1
    //   228: invokevirtual setVisible : (Z)V
    //   231: aload_0
    //   232: invokevirtual ZJ : ()V
    //   235: aload_0
    //   236: getfield ZE : Lburp/Zr93;
    //   239: aload_0
    //   240: getfield Zk : Ljavax/swing/JTextArea;
    //   243: invokevirtual ZM : (Ljavax/swing/JTextArea;)V
    //   246: aload_0
    //   247: aload_2
    //   248: putfield Zs : Ljava/lang/String;
    //   251: return
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zt : ()[Lburp/Zbqc;
    //   3: ifnonnull -> 13
    //   6: iconst_5
    //   7: anewarray burp/Zbqc
    //   10: invokestatic ZE : ([Lburp/Zbqc;)V
    //   13: bipush #10
    //   15: ldc '7aP~7p^zt1+'
    //   17: iconst_m1
    //   18: goto -> 25
    //   21: astore_0
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_1
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_1
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_1
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #111
    //   94: goto -> 124
    //   97: bipush #72
    //   99: goto -> 124
    //   102: bipush #108
    //   104: goto -> 124
    //   107: bipush #27
    //   109: goto -> 124
    //   112: bipush #54
    //   114: goto -> 124
    //   117: bipush #28
    //   119: goto -> 124
    //   122: bipush #27
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #1, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_1
    //   144: if_icmpgt -> 43
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
    //   163: goto -> 21
    //   166: aload_0
    //   167: invokestatic getBundle : (Ljava/lang/String;)Ljava/util/ResourceBundle;
    //   170: putstatic burp/Zxj.Zt : Ljava/util/ResourceBundle;
    //   173: return
  }
  
  public static void ZE(Zbqc[] paramArrayOfZbqc) {
    Zi = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zt() {
    return Zi;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */