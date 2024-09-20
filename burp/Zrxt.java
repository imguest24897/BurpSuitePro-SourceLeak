package burp;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Timer;

class Zrxt extends MouseAdapter {
  private Zlqr ZV;
  
  private final Object Za = Toolkit.getDefaultToolkit().getDesktopProperty(a);
  
  private final int ZZ = (this.Za == null) ? 500 : ((Integer)this.Za).intValue();
  
  private final Object Zj = new Object();
  
  private final Timer ZP = new Timer(this.ZZ, new Zxwt(this));
  
  final Zxer ZU;
  
  private static final String a;
  
  Zrxt(Zxer paramZxer) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: invokestatic Zr : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZU : Lburp/Zxer;
    //   7: aload_1
    //   8: invokevirtual getX : ()I
    //   11: aload_1
    //   12: invokevirtual getY : ()I
    //   15: invokevirtual indexAtLocation : (II)I
    //   18: istore_3
    //   19: astore_2
    //   20: iload_3
    //   21: iconst_m1
    //   22: if_icmpeq -> 207
    //   25: aload_1
    //   26: invokestatic isRightMouseButton : (Ljava/awt/event/MouseEvent;)Z
    //   29: ifeq -> 62
    //   32: aload_0
    //   33: getfield ZU : Lburp/Zxer;
    //   36: iload_3
    //   37: invokevirtual setSelectedIndex : (I)V
    //   40: aload_0
    //   41: getfield ZU : Lburp/Zxer;
    //   44: iload_3
    //   45: invokevirtual getTabComponentAt : (I)Ljava/awt/Component;
    //   48: checkcast burp/Zewb
    //   51: aload_1
    //   52: iload_3
    //   53: invokeinterface ZA : (Ljava/awt/event/MouseEvent;I)V
    //   58: aload_2
    //   59: ifnull -> 207
    //   62: aload_1
    //   63: invokestatic isLeftMouseButton : (Ljava/awt/event/MouseEvent;)Z
    //   66: ifeq -> 207
    //   69: aload_0
    //   70: getfield ZU : Lburp/Zxer;
    //   73: getfield ZN : Lburp/Zrsj;
    //   76: iload_3
    //   77: invokeinterface Zf : (I)Z
    //   82: ifeq -> 207
    //   85: aload_0
    //   86: getfield ZU : Lburp/Zxer;
    //   89: iload_3
    //   90: invokevirtual getTabComponentAt : (I)Ljava/awt/Component;
    //   93: checkcast burp/Zr88
    //   96: astore #4
    //   98: aload #4
    //   100: getfield Zc : Lburp/Zg85;
    //   103: astore #5
    //   105: aload_0
    //   106: getfield ZU : Lburp/Zxer;
    //   109: aload_1
    //   110: invokevirtual getPoint : ()Ljava/awt/Point;
    //   113: aload #5
    //   115: invokestatic convertPoint : (Ljava/awt/Component;Ljava/awt/Point;Ljava/awt/Component;)Ljava/awt/Point;
    //   118: astore #6
    //   120: aload #5
    //   122: aload #6
    //   124: invokevirtual contains : (Ljava/awt/Point;)Z
    //   127: ifeq -> 201
    //   130: aload_0
    //   131: getfield Zj : Ljava/lang/Object;
    //   134: dup
    //   135: astore #7
    //   137: monitorenter
    //   138: aload_0
    //   139: getfield ZV : Lburp/Zlqr;
    //   142: ifnull -> 170
    //   145: aload_0
    //   146: getfield ZV : Lburp/Zlqr;
    //   149: aload #4
    //   151: if_acmpne -> 170
    //   154: aload_0
    //   155: getfield ZP : Ljavax/swing/Timer;
    //   158: invokevirtual stop : ()V
    //   161: aload_0
    //   162: aconst_null
    //   163: putfield ZV : Lburp/Zlqr;
    //   166: aload_2
    //   167: ifnull -> 183
    //   170: aload_0
    //   171: aload #4
    //   173: putfield ZV : Lburp/Zlqr;
    //   176: aload_0
    //   177: getfield ZP : Ljavax/swing/Timer;
    //   180: invokevirtual start : ()V
    //   183: aload #7
    //   185: monitorexit
    //   186: goto -> 197
    //   189: astore #8
    //   191: aload #7
    //   193: monitorexit
    //   194: aload #8
    //   196: athrow
    //   197: aload_2
    //   198: ifnull -> 207
    //   201: aload_0
    //   202: aload #4
    //   204: invokevirtual Zd : (Lburp/Zlqr;)V
    //   207: return
    // Exception table:
    //   from	to	target	type
    //   138	186	189	finally
    //   189	194	189	finally
  }
  
  private void Zd(Zlqr paramZlqr) {
    paramZlqr.ZR().ZyX();
    this.ZU.ZX.ZT();
    this.ZU.revalidate();
    this.ZU.repaint();
  }
  
  static {
    // Byte code:
    //   0: bipush #54
    //   2: ldc '\\fy^;@g.?G$`$\\rM'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrxt.a : Ljava/lang/String;
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
    //   80: bipush #91
    //   82: goto -> 112
    //   85: bipush #56
    //   87: goto -> 112
    //   90: bipush #91
    //   92: goto -> 112
    //   95: bipush #70
    //   97: goto -> 112
    //   100: bipush #96
    //   102: goto -> 112
    //   105: bipush #77
    //   107: goto -> 112
    //   110: bipush #26
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrxt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */