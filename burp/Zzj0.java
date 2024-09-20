package burp;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

public class Zzj0 extends Zz85 {
  private final boolean Zi;
  
  private final int ZF;
  
  public Zzj0(String paramString, int paramInt, boolean paramBoolean) {
    super(paramString);
    this.Zi = paramBoolean;
    this.ZF = paramInt;
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual getVisibleRect : ()Ljava/awt/Rectangle;
    //   4: astore #4
    //   6: new java/awt/Rectangle
    //   9: dup
    //   10: aload #4
    //   12: invokespecial <init> : (Ljava/awt/Rectangle;)V
    //   15: astore #5
    //   17: invokestatic Zm : ()I
    //   20: aload_2
    //   21: invokevirtual getCaretPosition : ()I
    //   24: istore #6
    //   26: aload_2
    //   27: aload #4
    //   29: iconst_1
    //   30: aload_0
    //   31: getfield ZF : I
    //   34: invokevirtual getScrollableBlockIncrement : (Ljava/awt/Rectangle;II)I
    //   37: istore #7
    //   39: istore_3
    //   40: aload #4
    //   42: getfield y : I
    //   45: istore #8
    //   47: aload_2
    //   48: invokevirtual getCaret : ()Ljavax/swing/text/Caret;
    //   51: astore #9
    //   53: aload #9
    //   55: invokeinterface getMagicCaretPosition : ()Ljava/awt/Point;
    //   60: astore #10
    //   62: iload #6
    //   64: iconst_m1
    //   65: if_icmpeq -> 357
    //   68: aload_2
    //   69: iload #6
    //   71: invokevirtual modelToView : (I)Ljava/awt/Rectangle;
    //   74: astore #12
    //   76: aload #10
    //   78: ifnull -> 93
    //   81: aload #10
    //   83: getfield x : I
    //   86: goto -> 98
    //   89: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   92: athrow
    //   93: aload #12
    //   95: getfield x : I
    //   98: istore #13
    //   100: aload #12
    //   102: getfield height : I
    //   105: istore #14
    //   107: aload_0
    //   108: getfield ZF : I
    //   111: iload #7
    //   113: i2d
    //   114: iload #14
    //   116: i2d
    //   117: ddiv
    //   118: invokestatic ceil : (D)D
    //   121: d2i
    //   122: iconst_1
    //   123: isub
    //   124: imul
    //   125: iload #14
    //   127: imul
    //   128: istore #11
    //   130: aload #5
    //   132: aload_0
    //   133: aload_2
    //   134: iload #8
    //   136: iload #11
    //   138: iadd
    //   139: iload #11
    //   141: aload #4
    //   143: getfield height : I
    //   146: invokevirtual ZV : (Ljavax/swing/text/JTextComponent;III)I
    //   149: putfield y : I
    //   152: aload #4
    //   154: aload #12
    //   156: getfield x : I
    //   159: aload #12
    //   161: getfield y : I
    //   164: invokevirtual contains : (II)Z
    //   167: ifeq -> 204
    //   170: aload_2
    //   171: new java/awt/Point
    //   174: dup
    //   175: iload #13
    //   177: aload_0
    //   178: aload_2
    //   179: aload #12
    //   181: getfield y : I
    //   184: iload #11
    //   186: iadd
    //   187: iconst_0
    //   188: iconst_0
    //   189: invokevirtual ZV : (Ljavax/swing/text/JTextComponent;III)I
    //   192: invokespecial <init> : (II)V
    //   195: invokevirtual viewToModel : (Ljava/awt/Point;)I
    //   198: istore #15
    //   200: iload_3
    //   201: ifeq -> 269
    //   204: aload_0
    //   205: getfield ZF : I
    //   208: iconst_m1
    //   209: if_icmpne -> 243
    //   212: goto -> 219
    //   215: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   218: athrow
    //   219: aload_2
    //   220: new java/awt/Point
    //   223: dup
    //   224: iload #13
    //   226: aload #5
    //   228: getfield y : I
    //   231: invokespecial <init> : (II)V
    //   234: invokevirtual viewToModel : (Ljava/awt/Point;)I
    //   237: istore #15
    //   239: iload_3
    //   240: ifeq -> 269
    //   243: aload_2
    //   244: new java/awt/Point
    //   247: dup
    //   248: iload #13
    //   250: aload #5
    //   252: getfield y : I
    //   255: aload #4
    //   257: getfield height : I
    //   260: iadd
    //   261: invokespecial <init> : (II)V
    //   264: invokevirtual viewToModel : (Ljava/awt/Point;)I
    //   267: istore #15
    //   269: aload_0
    //   270: aload_2
    //   271: iload #15
    //   273: invokevirtual Zj : (Ljavax/swing/text/JTextComponent;I)I
    //   276: istore #15
    //   278: iload #15
    //   280: iload #6
    //   282: if_icmpeq -> 340
    //   285: aload_0
    //   286: aload_2
    //   287: aload #5
    //   289: iload #8
    //   291: iload #15
    //   293: invokevirtual ZP : (Ljavax/swing/text/JTextComponent;Ljava/awt/Rectangle;II)V
    //   296: aload_0
    //   297: getfield Zi : Z
    //   300: ifeq -> 327
    //   303: goto -> 310
    //   306: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   309: athrow
    //   310: aload_2
    //   311: iload #15
    //   313: invokevirtual moveCaretPosition : (I)V
    //   316: iload_3
    //   317: ifeq -> 340
    //   320: goto -> 327
    //   323: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   326: athrow
    //   327: aload_2
    //   328: iload #15
    //   330: invokevirtual setCaretPosition : (I)V
    //   333: goto -> 340
    //   336: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   339: athrow
    //   340: goto -> 388
    //   343: astore #12
    //   345: aload #12
    //   347: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   350: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   353: iload_3
    //   354: ifeq -> 388
    //   357: aload_0
    //   358: getfield ZF : I
    //   361: iload #7
    //   363: imul
    //   364: istore #11
    //   366: aload #5
    //   368: aload_0
    //   369: aload_2
    //   370: iload #8
    //   372: iload #11
    //   374: iadd
    //   375: iload #11
    //   377: aload #4
    //   379: getfield height : I
    //   382: invokevirtual ZV : (Ljavax/swing/text/JTextComponent;III)I
    //   385: putfield y : I
    //   388: aload #10
    //   390: ifnull -> 409
    //   393: aload #9
    //   395: aload #10
    //   397: invokeinterface setMagicCaretPosition : (Ljava/awt/Point;)V
    //   402: goto -> 409
    //   405: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   408: athrow
    //   409: aload_2
    //   410: aload #5
    //   412: invokevirtual scrollRectToVisible : (Ljava/awt/Rectangle;)V
    //   415: return
    // Exception table:
    //   from	to	target	type
    //   68	340	343	javax/swing/text/BadLocationException
    //   76	89	89	javax/swing/text/BadLocationException
    //   200	212	215	javax/swing/text/BadLocationException
    //   278	303	306	javax/swing/text/BadLocationException
    //   285	320	323	javax/swing/text/BadLocationException
    //   310	333	336	javax/swing/text/BadLocationException
    //   388	402	405	javax/swing/text/BadLocationException
  }
  
  private int ZV(JTextComponent paramJTextComponent, int paramInt1, int paramInt2, int paramInt3) {
    int i = Zz85.ZT();
    if (paramInt1 < 0) {
      paramInt1 = 0;
      if (i == 0) {
        if (paramInt1 + paramInt2 > paramJTextComponent.getHeight())
          paramInt1 = Math.max(0, paramJTextComponent.getHeight() - paramInt3); 
        return paramInt1;
      } 
      return paramInt1;
    } 
    if (paramInt1 + paramInt2 > paramJTextComponent.getHeight())
      paramInt1 = Math.max(0, paramJTextComponent.getHeight() - paramInt3); 
    return paramInt1;
  }
  
  private int Zj(JTextComponent paramJTextComponent, int paramInt) {
    Document document = paramJTextComponent.getDocument();
    if (paramInt != 0 && paramInt > document.getLength())
      paramInt = document.getLength(); 
    if (paramInt < 0)
      paramInt = 0; 
    return paramInt;
  }
  
  private void ZP(JTextComponent paramJTextComponent, Rectangle paramRectangle, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: istore #5
    //   5: aload_1
    //   6: iload #4
    //   8: invokevirtual modelToView : (I)Ljava/awt/Rectangle;
    //   11: astore #6
    //   13: aload #6
    //   15: getfield y : I
    //   18: aload_2
    //   19: getfield y : I
    //   22: if_icmplt -> 79
    //   25: aload #6
    //   27: getfield y : I
    //   30: aload_2
    //   31: getfield y : I
    //   34: aload_2
    //   35: getfield height : I
    //   38: iadd
    //   39: if_icmpgt -> 79
    //   42: goto -> 49
    //   45: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   48: athrow
    //   49: aload #6
    //   51: getfield y : I
    //   54: aload #6
    //   56: getfield height : I
    //   59: iadd
    //   60: aload_2
    //   61: getfield y : I
    //   64: aload_2
    //   65: getfield height : I
    //   68: iadd
    //   69: if_icmple -> 190
    //   72: goto -> 79
    //   75: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   78: athrow
    //   79: aload #6
    //   81: getfield y : I
    //   84: aload_2
    //   85: getfield y : I
    //   88: if_icmpge -> 110
    //   91: goto -> 98
    //   94: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   97: athrow
    //   98: aload #6
    //   100: getfield y : I
    //   103: istore #7
    //   105: iload #5
    //   107: ifne -> 128
    //   110: aload #6
    //   112: getfield y : I
    //   115: aload #6
    //   117: getfield height : I
    //   120: iadd
    //   121: aload_2
    //   122: getfield height : I
    //   125: isub
    //   126: istore #7
    //   128: aload_0
    //   129: getfield ZF : I
    //   132: iconst_m1
    //   133: if_icmpne -> 149
    //   136: iload #7
    //   138: iload_3
    //   139: if_icmplt -> 177
    //   142: goto -> 149
    //   145: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   148: athrow
    //   149: aload_0
    //   150: getfield ZF : I
    //   153: iconst_1
    //   154: if_icmpne -> 190
    //   157: goto -> 164
    //   160: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   163: athrow
    //   164: iload #7
    //   166: iload_3
    //   167: if_icmple -> 190
    //   170: goto -> 177
    //   173: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   176: athrow
    //   177: aload_2
    //   178: iload #7
    //   180: putfield y : I
    //   183: goto -> 190
    //   186: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   189: athrow
    //   190: goto -> 203
    //   193: astore #6
    //   195: aload #6
    //   197: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   200: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   203: return
    // Exception table:
    //   from	to	target	type
    //   5	190	193	javax/swing/text/BadLocationException
    //   13	42	45	javax/swing/text/BadLocationException
    //   25	72	75	javax/swing/text/BadLocationException
    //   49	91	94	javax/swing/text/BadLocationException
    //   128	142	145	javax/swing/text/BadLocationException
    //   136	157	160	javax/swing/text/BadLocationException
    //   149	170	173	javax/swing/text/BadLocationException
    //   164	183	186	javax/swing/text/BadLocationException
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzj0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */