package burp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;

public class Zrku extends DefaultHighlighter.DefaultHighlightPainter {
  Zrku(Color paramColor) {
    super(paramColor);
  }
  
  public Shape paintLayer(Graphics paramGraphics, int paramInt1, int paramInt2, Shape paramShape, JTextComponent paramJTextComponent, View paramView) {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore #7
    //   5: aload_1
    //   6: aload_0
    //   7: invokevirtual getColor : ()Ljava/awt/Color;
    //   10: invokevirtual setColor : (Ljava/awt/Color;)V
    //   13: iload_2
    //   14: iload_3
    //   15: if_icmpne -> 85
    //   18: aload #6
    //   20: iload_2
    //   21: aload #4
    //   23: getstatic javax/swing/text/Position$Bias.Forward : Ljavax/swing/text/Position$Bias;
    //   26: invokevirtual modelToView : (ILjava/awt/Shape;Ljavax/swing/text/Position$Bias;)Ljava/awt/Shape;
    //   29: astore #8
    //   31: aload #8
    //   33: invokeinterface getBounds : ()Ljava/awt/Rectangle;
    //   38: astore #9
    //   40: aload_1
    //   41: aload #9
    //   43: getfield x : I
    //   46: aload #9
    //   48: getfield y : I
    //   51: aload #9
    //   53: getfield x : I
    //   56: aload #9
    //   58: getfield y : I
    //   61: aload #9
    //   63: getfield height : I
    //   66: iadd
    //   67: invokevirtual drawLine : (IIII)V
    //   70: aload #9
    //   72: areturn
    //   73: astore #8
    //   75: aload #8
    //   77: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   80: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   83: aconst_null
    //   84: areturn
    //   85: iload_2
    //   86: aload #6
    //   88: invokevirtual getStartOffset : ()I
    //   91: if_icmpne -> 177
    //   94: iload_3
    //   95: aload #6
    //   97: invokevirtual getEndOffset : ()I
    //   100: if_icmpne -> 177
    //   103: goto -> 110
    //   106: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   109: athrow
    //   110: aload #4
    //   112: instanceof java/awt/Rectangle
    //   115: ifeq -> 137
    //   118: goto -> 125
    //   121: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   124: athrow
    //   125: aload #4
    //   127: checkcast java/awt/Rectangle
    //   130: astore #8
    //   132: aload #7
    //   134: ifnonnull -> 146
    //   137: aload #4
    //   139: invokeinterface getBounds : ()Ljava/awt/Rectangle;
    //   144: astore #8
    //   146: aload_1
    //   147: aload #8
    //   149: getfield x : I
    //   152: aload #8
    //   154: getfield y : I
    //   157: aload #8
    //   159: getfield width : I
    //   162: iconst_1
    //   163: isub
    //   164: aload #8
    //   166: getfield height : I
    //   169: iconst_1
    //   170: isub
    //   171: invokevirtual drawRect : (IIII)V
    //   174: aload #8
    //   176: areturn
    //   177: aload #6
    //   179: iload_2
    //   180: getstatic javax/swing/text/Position$Bias.Forward : Ljavax/swing/text/Position$Bias;
    //   183: iload_3
    //   184: getstatic javax/swing/text/Position$Bias.Backward : Ljavax/swing/text/Position$Bias;
    //   187: aload #4
    //   189: invokevirtual modelToView : (ILjavax/swing/text/Position$Bias;ILjavax/swing/text/Position$Bias;Ljava/awt/Shape;)Ljava/awt/Shape;
    //   192: astore #8
    //   194: aload #8
    //   196: instanceof java/awt/Rectangle
    //   199: ifeq -> 214
    //   202: aload #8
    //   204: checkcast java/awt/Rectangle
    //   207: goto -> 221
    //   210: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   213: athrow
    //   214: aload #8
    //   216: invokeinterface getBounds : ()Ljava/awt/Rectangle;
    //   221: astore #9
    //   223: aload_1
    //   224: aload #9
    //   226: getfield x : I
    //   229: aload #9
    //   231: getfield y : I
    //   234: aload #9
    //   236: getfield width : I
    //   239: iconst_1
    //   240: isub
    //   241: aload #9
    //   243: getfield height : I
    //   246: iconst_1
    //   247: isub
    //   248: invokevirtual drawRect : (IIII)V
    //   251: aload #9
    //   253: areturn
    //   254: astore #8
    //   256: aload #8
    //   258: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   261: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   264: aconst_null
    //   265: areturn
    // Exception table:
    //   from	to	target	type
    //   18	72	73	javax/swing/text/BadLocationException
    //   85	103	106	javax/swing/text/BadLocationException
    //   94	118	121	javax/swing/text/BadLocationException
    //   177	253	254	javax/swing/text/BadLocationException
    //   194	210	210	javax/swing/text/BadLocationException
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrku.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */