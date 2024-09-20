package burp;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Path2D;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;

public class Zz6c extends Zz6a {
  private final Zlkk Zt;
  
  public Zz6c(Zlkk paramZlkk) {
    this.Zt = paramZlkk;
  }
  
  public Shape paintLayer(Graphics paramGraphics, int paramInt1, int paramInt2, Shape paramShape, JTextComponent paramJTextComponent, View paramView) {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: istore #7
    //   5: aload_1
    //   6: aload_0
    //   7: getfield Zt : Lburp/Zlkk;
    //   10: invokevirtual ZS : ()Ljava/awt/Color;
    //   13: invokevirtual setColor : (Ljava/awt/Color;)V
    //   16: iload_2
    //   17: aload #6
    //   19: invokevirtual getStartOffset : ()I
    //   22: if_icmpne -> 87
    //   25: iload_3
    //   26: aload #6
    //   28: invokevirtual getEndOffset : ()I
    //   31: if_icmpne -> 87
    //   34: goto -> 41
    //   37: invokestatic b : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   40: athrow
    //   41: aload #4
    //   43: instanceof java/awt/Rectangle
    //   46: ifeq -> 68
    //   49: goto -> 56
    //   52: invokestatic b : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   55: athrow
    //   56: aload #4
    //   58: checkcast java/awt/Rectangle
    //   61: astore #8
    //   63: iload #7
    //   65: ifne -> 77
    //   68: aload #4
    //   70: invokeinterface getBounds : ()Ljava/awt/Rectangle;
    //   75: astore #8
    //   77: aload_0
    //   78: aload_1
    //   79: aload #8
    //   81: invokevirtual ZN : (Ljava/awt/Graphics;Ljava/awt/Rectangle;)V
    //   84: aload #8
    //   86: areturn
    //   87: aload #6
    //   89: iload_2
    //   90: getstatic javax/swing/text/Position$Bias.Forward : Ljavax/swing/text/Position$Bias;
    //   93: iload_3
    //   94: getstatic javax/swing/text/Position$Bias.Backward : Ljavax/swing/text/Position$Bias;
    //   97: aload #4
    //   99: invokevirtual modelToView : (ILjavax/swing/text/Position$Bias;ILjavax/swing/text/Position$Bias;Ljava/awt/Shape;)Ljava/awt/Shape;
    //   102: astore #8
    //   104: aload #8
    //   106: instanceof java/awt/Rectangle
    //   109: ifeq -> 124
    //   112: aload #8
    //   114: checkcast java/awt/Rectangle
    //   117: goto -> 131
    //   120: invokestatic b : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   123: athrow
    //   124: aload #8
    //   126: invokeinterface getBounds : ()Ljava/awt/Rectangle;
    //   131: astore #9
    //   133: aload_0
    //   134: aload_1
    //   135: aload #9
    //   137: invokevirtual ZN : (Ljava/awt/Graphics;Ljava/awt/Rectangle;)V
    //   140: aload #9
    //   142: areturn
    //   143: astore #8
    //   145: aload #8
    //   147: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   150: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   153: aconst_null
    //   154: areturn
    // Exception table:
    //   from	to	target	type
    //   5	34	37	javax/swing/text/BadLocationException
    //   25	49	52	javax/swing/text/BadLocationException
    //   87	142	143	javax/swing/text/BadLocationException
    //   104	120	120	javax/swing/text/BadLocationException
  }
  
  private void ZN(Graphics paramGraphics, Rectangle paramRectangle) {
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    Path2D.Double double_ = new Path2D.Double();
    int j = paramRectangle.x;
    int k = paramRectangle.y + paramRectangle.height - 2;
    byte b = -2;
    int i = Zz85.Zm();
    double_.moveTo(j, k);
    while (j < paramRectangle.x + paramRectangle.width) {
      double_.lineTo((j + 2), (k + b));
      k += b;
      b = -b;
      j += 2;
      if (i != 0)
        break; 
    } 
    graphics2D.draw(double_);
  }
  
  private static BadLocationException b(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz6c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */