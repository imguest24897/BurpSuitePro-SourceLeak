package burp;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.Shape;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.LayeredHighlighter;
import javax.swing.text.View;

public class Zz6a extends LayeredHighlighter.LayerPainter {
  private Paint Zy;
  
  private AlphaComposite Zs;
  
  private float Zh;
  
  public Zz6a() {
    this(null);
  }
  
  public Zz6a(Paint paramPaint) {
    this(paramPaint, 1.0F);
  }
  
  private Zz6a(Paint paramPaint, float paramFloat) {
    ZX(paramPaint);
    Zs(paramFloat);
  }
  
  public float Za() {
    return this.Zh;
  }
  
  private AlphaComposite Zi() {
    if (this.Zs == null)
      this.Zs = AlphaComposite.getInstance(3, this.Zh); 
    return this.Zs;
  }
  
  public Paint ZJ() {
    return this.Zy;
  }
  
  public void paint(Graphics paramGraphics, int paramInt1, int paramInt2, Shape paramShape, JTextComponent paramJTextComponent) {
    // Byte code:
    //   0: aload #4
    //   2: invokeinterface getBounds : ()Ljava/awt/Rectangle;
    //   7: astore #7
    //   9: invokestatic ZT : ()I
    //   12: aload_1
    //   13: checkcast java/awt/Graphics2D
    //   16: astore #8
    //   18: istore #6
    //   20: aconst_null
    //   21: astore #9
    //   23: aload_0
    //   24: invokevirtual Za : ()F
    //   27: fconst_1
    //   28: fcmpg
    //   29: ifge -> 48
    //   32: aload #8
    //   34: invokevirtual getComposite : ()Ljava/awt/Composite;
    //   37: astore #9
    //   39: aload #8
    //   41: aload_0
    //   42: invokevirtual Zi : ()Ljava/awt/AlphaComposite;
    //   45: invokevirtual setComposite : (Ljava/awt/Composite;)V
    //   48: aload #5
    //   50: invokevirtual getUI : ()Ljavax/swing/plaf/TextUI;
    //   53: astore #10
    //   55: aload #10
    //   57: aload #5
    //   59: iload_2
    //   60: invokevirtual modelToView : (Ljavax/swing/text/JTextComponent;I)Ljava/awt/Rectangle;
    //   63: astore #11
    //   65: aload #10
    //   67: aload #5
    //   69: iload_3
    //   70: invokevirtual modelToView : (Ljavax/swing/text/JTextComponent;I)Ljava/awt/Rectangle;
    //   73: astore #12
    //   75: aload_0
    //   76: invokevirtual ZJ : ()Ljava/awt/Paint;
    //   79: astore #13
    //   81: aload #13
    //   83: ifnonnull -> 108
    //   86: aload #8
    //   88: aload #5
    //   90: invokevirtual getSelectionColor : ()Ljava/awt/Color;
    //   93: invokevirtual setColor : (Ljava/awt/Color;)V
    //   96: iload #6
    //   98: ifne -> 122
    //   101: goto -> 108
    //   104: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   107: athrow
    //   108: aload #8
    //   110: aload #13
    //   112: invokevirtual setPaint : (Ljava/awt/Paint;)V
    //   115: goto -> 122
    //   118: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   121: athrow
    //   122: aload #11
    //   124: getfield y : I
    //   127: aload #12
    //   129: getfield y : I
    //   132: if_icmpne -> 180
    //   135: aload #12
    //   137: iconst_0
    //   138: putfield width : I
    //   141: aload #11
    //   143: aload #12
    //   145: invokevirtual union : (Ljava/awt/Rectangle;)Ljava/awt/Rectangle;
    //   148: astore #14
    //   150: aload #8
    //   152: aload #14
    //   154: getfield x : I
    //   157: aload #14
    //   159: getfield y : I
    //   162: aload #14
    //   164: getfield width : I
    //   167: aload #14
    //   169: getfield height : I
    //   172: invokevirtual fillRect : (IIII)V
    //   175: iload #6
    //   177: ifne -> 321
    //   180: aload #7
    //   182: getfield x : I
    //   185: aload #7
    //   187: getfield width : I
    //   190: iadd
    //   191: aload #11
    //   193: getfield x : I
    //   196: isub
    //   197: istore #14
    //   199: aload #8
    //   201: aload #11
    //   203: getfield x : I
    //   206: aload #11
    //   208: getfield y : I
    //   211: iload #14
    //   213: aload #11
    //   215: getfield height : I
    //   218: invokevirtual fillRect : (IIII)V
    //   221: aload #11
    //   223: getfield y : I
    //   226: aload #11
    //   228: getfield height : I
    //   231: iadd
    //   232: aload #12
    //   234: getfield y : I
    //   237: if_icmpeq -> 290
    //   240: aload #8
    //   242: aload #7
    //   244: getfield x : I
    //   247: aload #11
    //   249: getfield y : I
    //   252: aload #11
    //   254: getfield height : I
    //   257: iadd
    //   258: aload #7
    //   260: getfield width : I
    //   263: aload #12
    //   265: getfield y : I
    //   268: aload #11
    //   270: getfield y : I
    //   273: aload #11
    //   275: getfield height : I
    //   278: iadd
    //   279: isub
    //   280: invokevirtual fillRect : (IIII)V
    //   283: goto -> 290
    //   286: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   289: athrow
    //   290: aload #8
    //   292: aload #7
    //   294: getfield x : I
    //   297: aload #12
    //   299: getfield y : I
    //   302: aload #12
    //   304: getfield x : I
    //   307: aload #7
    //   309: getfield x : I
    //   312: isub
    //   313: aload #12
    //   315: getfield height : I
    //   318: invokevirtual fillRect : (IIII)V
    //   321: aload_0
    //   322: invokevirtual Za : ()F
    //   325: fconst_1
    //   326: fcmpg
    //   327: ifge -> 401
    //   330: aload #8
    //   332: aload #9
    //   334: invokevirtual setComposite : (Ljava/awt/Composite;)V
    //   337: goto -> 401
    //   340: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   343: athrow
    //   344: astore #10
    //   346: aload #10
    //   348: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   351: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   354: aload_0
    //   355: invokevirtual Za : ()F
    //   358: fconst_1
    //   359: fcmpg
    //   360: ifge -> 401
    //   363: aload #8
    //   365: aload #9
    //   367: invokevirtual setComposite : (Ljava/awt/Composite;)V
    //   370: goto -> 401
    //   373: astore #15
    //   375: aload_0
    //   376: invokevirtual Za : ()F
    //   379: fconst_1
    //   380: fcmpg
    //   381: ifge -> 398
    //   384: aload #8
    //   386: aload #9
    //   388: invokevirtual setComposite : (Ljava/awt/Composite;)V
    //   391: goto -> 398
    //   394: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   397: athrow
    //   398: aload #15
    //   400: athrow
    //   401: return
    // Exception table:
    //   from	to	target	type
    //   48	321	344	javax/swing/text/BadLocationException
    //   48	321	373	finally
    //   81	101	104	javax/swing/text/BadLocationException
    //   86	115	118	javax/swing/text/BadLocationException
    //   199	283	286	javax/swing/text/BadLocationException
    //   321	340	340	javax/swing/text/BadLocationException
    //   344	354	373	finally
    //   373	375	373	finally
    //   375	391	394	javax/swing/text/BadLocationException
  }
  
  public Shape paintLayer(Graphics paramGraphics, int paramInt1, int paramInt2, Shape paramShape, JTextComponent paramJTextComponent, View paramView) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast java/awt/Graphics2D
    //   4: astore #8
    //   6: invokestatic ZT : ()I
    //   9: aconst_null
    //   10: astore #9
    //   12: istore #7
    //   14: aload_0
    //   15: invokevirtual Za : ()F
    //   18: fconst_1
    //   19: fcmpg
    //   20: ifge -> 39
    //   23: aload #8
    //   25: invokevirtual getComposite : ()Ljava/awt/Composite;
    //   28: astore #9
    //   30: aload #8
    //   32: aload_0
    //   33: invokevirtual Zi : ()Ljava/awt/AlphaComposite;
    //   36: invokevirtual setComposite : (Ljava/awt/Composite;)V
    //   39: aload_0
    //   40: invokevirtual ZJ : ()Ljava/awt/Paint;
    //   43: astore #10
    //   45: aload #10
    //   47: ifnonnull -> 72
    //   50: aload #8
    //   52: aload #5
    //   54: invokevirtual getSelectionColor : ()Ljava/awt/Color;
    //   57: invokevirtual setColor : (Ljava/awt/Color;)V
    //   60: iload #7
    //   62: ifne -> 86
    //   65: goto -> 72
    //   68: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   71: athrow
    //   72: aload #8
    //   74: aload #10
    //   76: invokevirtual setPaint : (Ljava/awt/Paint;)V
    //   79: goto -> 86
    //   82: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   85: athrow
    //   86: iload_2
    //   87: iload_3
    //   88: if_icmpne -> 158
    //   91: aload #6
    //   93: iload_2
    //   94: aload #4
    //   96: getstatic javax/swing/text/Position$Bias.Forward : Ljavax/swing/text/Position$Bias;
    //   99: invokevirtual modelToView : (ILjava/awt/Shape;Ljavax/swing/text/Position$Bias;)Ljava/awt/Shape;
    //   102: astore #11
    //   104: aload #11
    //   106: invokeinterface getBounds : ()Ljava/awt/Rectangle;
    //   111: astore #12
    //   113: aload_1
    //   114: aload #12
    //   116: getfield x : I
    //   119: aload #12
    //   121: getfield y : I
    //   124: aload #12
    //   126: getfield x : I
    //   129: aload #12
    //   131: getfield y : I
    //   134: aload #12
    //   136: getfield height : I
    //   139: iadd
    //   140: invokevirtual drawLine : (IIII)V
    //   143: aload #12
    //   145: areturn
    //   146: astore #11
    //   148: aload #11
    //   150: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   153: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   156: aconst_null
    //   157: areturn
    //   158: iload_2
    //   159: aload #6
    //   161: invokevirtual getStartOffset : ()I
    //   164: if_icmpne -> 270
    //   167: iload_3
    //   168: aload #6
    //   170: invokevirtual getEndOffset : ()I
    //   173: if_icmpne -> 270
    //   176: goto -> 183
    //   179: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   182: athrow
    //   183: aload #4
    //   185: instanceof java/awt/Rectangle
    //   188: ifeq -> 210
    //   191: goto -> 198
    //   194: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   197: athrow
    //   198: aload #4
    //   200: checkcast java/awt/Rectangle
    //   203: astore #11
    //   205: iload #7
    //   207: ifne -> 219
    //   210: aload #4
    //   212: invokeinterface getBounds : ()Ljava/awt/Rectangle;
    //   217: astore #11
    //   219: aload #8
    //   221: aload #11
    //   223: getfield x : I
    //   226: aload #11
    //   228: getfield y : I
    //   231: aload #11
    //   233: getfield width : I
    //   236: aload #11
    //   238: getfield height : I
    //   241: invokevirtual fillRect : (IIII)V
    //   244: aload_0
    //   245: invokevirtual Za : ()F
    //   248: fconst_1
    //   249: fcmpg
    //   250: ifge -> 267
    //   253: aload #8
    //   255: aload #9
    //   257: invokevirtual setComposite : (Ljava/awt/Composite;)V
    //   260: goto -> 267
    //   263: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   266: athrow
    //   267: aload #11
    //   269: areturn
    //   270: aload #6
    //   272: iload_2
    //   273: getstatic javax/swing/text/Position$Bias.Forward : Ljavax/swing/text/Position$Bias;
    //   276: iload_3
    //   277: getstatic javax/swing/text/Position$Bias.Backward : Ljavax/swing/text/Position$Bias;
    //   280: aload #4
    //   282: invokevirtual modelToView : (ILjavax/swing/text/Position$Bias;ILjavax/swing/text/Position$Bias;Ljava/awt/Shape;)Ljava/awt/Shape;
    //   285: astore #11
    //   287: aload #11
    //   289: instanceof java/awt/Rectangle
    //   292: ifeq -> 307
    //   295: aload #11
    //   297: checkcast java/awt/Rectangle
    //   300: goto -> 314
    //   303: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   306: athrow
    //   307: aload #11
    //   309: invokeinterface getBounds : ()Ljava/awt/Rectangle;
    //   314: astore #12
    //   316: aload #8
    //   318: aload #12
    //   320: getfield x : I
    //   323: aload #12
    //   325: getfield y : I
    //   328: aload #12
    //   330: getfield width : I
    //   333: aload #12
    //   335: getfield height : I
    //   338: invokevirtual fillRect : (IIII)V
    //   341: aload_0
    //   342: invokevirtual Za : ()F
    //   345: fconst_1
    //   346: fcmpg
    //   347: ifge -> 364
    //   350: aload #8
    //   352: aload #9
    //   354: invokevirtual setComposite : (Ljava/awt/Composite;)V
    //   357: goto -> 364
    //   360: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   363: athrow
    //   364: aload #12
    //   366: astore #13
    //   368: aload_0
    //   369: invokevirtual Za : ()F
    //   372: fconst_1
    //   373: fcmpg
    //   374: ifge -> 391
    //   377: aload #8
    //   379: aload #9
    //   381: invokevirtual setComposite : (Ljava/awt/Composite;)V
    //   384: goto -> 391
    //   387: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   390: athrow
    //   391: aload #13
    //   393: areturn
    //   394: astore #11
    //   396: aload #11
    //   398: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   401: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   404: aload_0
    //   405: invokevirtual Za : ()F
    //   408: fconst_1
    //   409: fcmpg
    //   410: ifge -> 451
    //   413: aload #8
    //   415: aload #9
    //   417: invokevirtual setComposite : (Ljava/awt/Composite;)V
    //   420: goto -> 451
    //   423: astore #14
    //   425: aload_0
    //   426: invokevirtual Za : ()F
    //   429: fconst_1
    //   430: fcmpg
    //   431: ifge -> 448
    //   434: aload #8
    //   436: aload #9
    //   438: invokevirtual setComposite : (Ljava/awt/Composite;)V
    //   441: goto -> 448
    //   444: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   447: athrow
    //   448: aload #14
    //   450: athrow
    //   451: aconst_null
    //   452: areturn
    // Exception table:
    //   from	to	target	type
    //   45	65	68	javax/swing/text/BadLocationException
    //   50	79	82	javax/swing/text/BadLocationException
    //   91	145	146	javax/swing/text/BadLocationException
    //   158	176	179	javax/swing/text/BadLocationException
    //   167	191	194	javax/swing/text/BadLocationException
    //   219	260	263	javax/swing/text/BadLocationException
    //   270	368	394	javax/swing/text/BadLocationException
    //   270	368	423	finally
    //   287	303	303	javax/swing/text/BadLocationException
    //   316	357	360	javax/swing/text/BadLocationException
    //   368	384	387	javax/swing/text/BadLocationException
    //   394	404	423	finally
    //   423	425	423	finally
    //   425	441	444	javax/swing/text/BadLocationException
  }
  
  public void Zs(float paramFloat) {
    paramFloat = Math.max(paramFloat, 0.0F);
    paramFloat = Math.min(1.0F, paramFloat);
    this.Zh = paramFloat;
    this.Zs = null;
  }
  
  public void ZX(Paint paramPaint) {
    this.Zy = paramPaint;
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz6a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */