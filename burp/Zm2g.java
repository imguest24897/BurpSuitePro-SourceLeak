package burp;

import java.awt.Component;
import javax.swing.JTable;

class Zm2g extends Zm2i {
  final Zl0r ZT;
  
  Zm2g(Zl0r paramZl0r) {}
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZY : ()[I
    //   3: astore #7
    //   5: aload_0
    //   6: aload_1
    //   7: aload_2
    //   8: iload_3
    //   9: iload #4
    //   11: iload #5
    //   13: iload #6
    //   15: invokespecial getTableCellRendererComponent : (Ljavax/swing/JTable;Ljava/lang/Object;ZZII)Ljava/awt/Component;
    //   18: pop
    //   19: aload_0
    //   20: getstatic burp/Zt00.DEFAULT_FONT : Lburp/Zt00;
    //   23: invokevirtual ZV : ()Ljava/awt/Font;
    //   26: invokevirtual setFont : (Ljava/awt/Font;)V
    //   29: aload_0
    //   30: getfield ZT : Lburp/Zl0r;
    //   33: getfield ZB : Lburp/Zmjg;
    //   36: getfield ZG : Ljava/util/List;
    //   39: iload #5
    //   41: invokeinterface get : (I)Ljava/lang/Object;
    //   46: checkcast burp/Zgp3
    //   49: invokevirtual ZA : ()Lburp/Zgsg;
    //   52: astore #10
    //   54: getstatic burp/Zzs.Zc : [I
    //   57: aload #10
    //   59: invokevirtual ordinal : ()I
    //   62: iaload
    //   63: tableswitch default -> 209, 1 -> 104, 2 -> 119, 3 -> 134, 4 -> 149, 5 -> 164, 6 -> 179, 7 -> 194
    //   104: getstatic java/awt/Color.LIGHT_GRAY : Ljava/awt/Color;
    //   107: astore #9
    //   109: getstatic java/awt/Color.BLACK : Ljava/awt/Color;
    //   112: astore #8
    //   114: aload #7
    //   116: ifnonnull -> 231
    //   119: getstatic java/awt/Color.WHITE : Ljava/awt/Color;
    //   122: astore #9
    //   124: getstatic java/awt/Color.BLACK : Ljava/awt/Color;
    //   127: astore #8
    //   129: aload #7
    //   131: ifnonnull -> 231
    //   134: getstatic java/awt/Color.WHITE : Ljava/awt/Color;
    //   137: astore #9
    //   139: getstatic burp/Zlb0.ZJ : Ljava/awt/Color;
    //   142: astore #8
    //   144: aload #7
    //   146: ifnonnull -> 231
    //   149: getstatic java/awt/Color.WHITE : Ljava/awt/Color;
    //   152: astore #9
    //   154: getstatic java/awt/Color.RED : Ljava/awt/Color;
    //   157: astore #8
    //   159: aload #7
    //   161: ifnonnull -> 231
    //   164: getstatic java/awt/Color.WHITE : Ljava/awt/Color;
    //   167: astore #9
    //   169: getstatic java/awt/Color.BLACK : Ljava/awt/Color;
    //   172: astore #8
    //   174: aload #7
    //   176: ifnonnull -> 231
    //   179: getstatic burp/Zlb0.ZR : Ljava/awt/Color;
    //   182: astore #9
    //   184: getstatic java/awt/Color.BLACK : Ljava/awt/Color;
    //   187: astore #8
    //   189: aload #7
    //   191: ifnonnull -> 231
    //   194: getstatic burp/Zlb0.ZR : Ljava/awt/Color;
    //   197: astore #9
    //   199: getstatic java/awt/Color.BLACK : Ljava/awt/Color;
    //   202: astore #8
    //   204: aload #7
    //   206: ifnonnull -> 231
    //   209: iconst_0
    //   210: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   213: aload #10
    //   215: invokevirtual toString : ()Ljava/lang/String;
    //   218: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   221: getstatic java/awt/Color.WHITE : Ljava/awt/Color;
    //   224: astore #9
    //   226: getstatic java/awt/Color.BLACK : Ljava/awt/Color;
    //   229: astore #8
    //   231: iload_3
    //   232: ifeq -> 280
    //   235: aload #9
    //   237: getstatic java/awt/Color.WHITE : Ljava/awt/Color;
    //   240: if_acmpne -> 263
    //   243: goto -> 250
    //   246: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   249: athrow
    //   250: getstatic burp/Zlkk.SELECTION_BACKGROUND : Lburp/Zlkk;
    //   253: invokevirtual ZS : ()Ljava/awt/Color;
    //   256: astore #9
    //   258: aload #7
    //   260: ifnonnull -> 280
    //   263: new java/awt/Color
    //   266: dup
    //   267: aload #9
    //   269: invokevirtual getRGB : ()I
    //   272: ldc 2105376
    //   274: isub
    //   275: invokespecial <init> : (I)V
    //   278: astore #9
    //   280: aload_0
    //   281: aload #8
    //   283: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   286: aload_0
    //   287: aload #9
    //   289: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   292: goto -> 305
    //   295: astore #8
    //   297: aload #8
    //   299: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   302: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   305: aload_0
    //   306: areturn
    // Exception table:
    //   from	to	target	type
    //   19	292	295	java/lang/Exception
    //   231	243	246	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */