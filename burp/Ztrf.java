package burp;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.util.NavigableMap;
import javax.swing.event.DocumentEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultCaret;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Ztrf extends View {
  private final NavigableMap<Integer, Integer> Zz;
  
  private int ZI;
  
  private boolean Zw;
  
  private Float Z_;
  
  private boolean Zi;
  
  private int ZO;
  
  private int Zp;
  
  final Zgpw ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Ztrf(Zgpw paramZgpw, Element paramElement) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield ZT : Lburp/Zgpw;
    //   5: aload_0
    //   6: aload_2
    //   7: invokespecial <init> : (Ljavax/swing/text/Element;)V
    //   10: aload_0
    //   11: new java/util/TreeMap
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: putfield Zz : Ljava/util/NavigableMap;
    //   21: aload_0
    //   22: iconst_m1
    //   23: putfield Zp : I
    //   26: aload_0
    //   27: aload_1
    //   28: getfield ZJ : I
    //   31: iconst_m1
    //   32: if_icmpeq -> 64
    //   35: aload_0
    //   36: invokevirtual getEndOffset : ()I
    //   39: aload_1
    //   40: getfield ZA : I
    //   43: if_icmplt -> 72
    //   46: aload_0
    //   47: invokevirtual getStartOffset : ()I
    //   50: aload_1
    //   51: getfield ZJ : I
    //   54: if_icmpgt -> 72
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   63: athrow
    //   64: iconst_1
    //   65: goto -> 73
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: iconst_0
    //   73: putfield Zi : Z
    //   76: return
    // Exception table:
    //   from	to	target	type
    //   35	57	60	java/lang/IllegalArgumentException
    //   46	68	68	java/lang/IllegalArgumentException
  }
  
  int ZF() {
    return Zg(getStartOffset(), getEndOffset(), true);
  }
  
  int Zc(int paramInt1, int paramInt2) {
    return Zg(paramInt1, paramInt2, false);
  }
  
  int Zg(int paramInt1, int paramInt2, boolean paramBoolean) {
    byte b = 0;
    Ze9f ze9f = (Ze9f)getDocument();
    Element element = ze9f.getDefaultRootElement();
    int i = element.getElementIndex(paramInt1);
    int[] arrayOfInt = Zgpw.ZW();
    Ze7g ze7g = ze9f.Zw(i);
    Zzkh zzkh = this.ZT.Zr.Zi();
    int j = paramInt1;
    while (j < paramInt2) {
      Integer integer = this.Zz.get(Integer.valueOf(j));
      if (integer == null) {
        ze7g = ze7g.ZW(j);
        integer = Integer.valueOf(this.ZT.Zc(j, ze7g, zzkh));
        try {
          if (paramBoolean)
            this.Zz.put(Integer.valueOf(j), integer); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
      try {
        b++;
        if (integer.intValue() != j) {
          try {
            if (integer.intValue() == this.ZT.ZP.getLength())
              break; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          j = integer.intValue();
          if (arrayOfInt == null)
            break; 
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return b;
  }
  
  public float getPreferredSpan(int paramInt) {
    // Byte code:
    //   0: invokestatic ZW : ()[I
    //   3: astore_2
    //   4: iload_1
    //   5: lookupswitch default -> 298, 0 -> 32, 1 -> 139
    //   32: aload_0
    //   33: getfield ZT : Lburp/Zgpw;
    //   36: getfield Zp : Z
    //   39: ifeq -> 55
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   48: athrow
    //   49: fconst_0
    //   50: freturn
    //   51: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   54: athrow
    //   55: aload_0
    //   56: getfield ZT : Lburp/Zgpw;
    //   59: getfield Zr : Lburp/Zmgn;
    //   62: invokevirtual getLineWrap : ()Z
    //   65: ifeq -> 81
    //   68: aload_0
    //   69: getfield ZT : Lburp/Zgpw;
    //   72: invokevirtual getWidth : ()I
    //   75: i2f
    //   76: fstore_3
    //   77: aload_2
    //   78: ifnonnull -> 116
    //   81: aload_0
    //   82: invokevirtual ZD : ()F
    //   85: aload_0
    //   86: getfield Zw : Z
    //   89: ifeq -> 107
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: fconst_0
    //   100: goto -> 112
    //   103: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: aload_0
    //   108: invokevirtual ZQ : ()I
    //   111: i2f
    //   112: invokestatic max : (FF)F
    //   115: fstore_3
    //   116: fload_3
    //   117: ldc 2.1474836E9
    //   119: fcmpl
    //   120: iflt -> 132
    //   123: ldc 100.0
    //   125: goto -> 138
    //   128: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   131: athrow
    //   132: fload_3
    //   133: f2d
    //   134: invokestatic ceil : (D)D
    //   137: d2f
    //   138: freturn
    //   139: aload_0
    //   140: getfield ZT : Lburp/Zgpw;
    //   143: getfield Zp : Z
    //   146: ifeq -> 165
    //   149: aload_0
    //   150: iconst_1
    //   151: putfield ZI : I
    //   154: aload_2
    //   155: ifnonnull -> 276
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   164: athrow
    //   165: aload_0
    //   166: getfield ZI : I
    //   169: ifeq -> 193
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   178: athrow
    //   179: aload_0
    //   180: getfield Zw : Z
    //   183: ifeq -> 276
    //   186: goto -> 193
    //   189: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   192: athrow
    //   193: aload_0
    //   194: getfield Zi : Z
    //   197: ifeq -> 250
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   206: athrow
    //   207: aload_0
    //   208: getfield ZT : Lburp/Zgpw;
    //   211: getfield ZJ : I
    //   214: iconst_m1
    //   215: if_icmpeq -> 259
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   224: athrow
    //   225: aload_0
    //   226: invokevirtual getEndOffset : ()I
    //   229: aload_0
    //   230: getfield ZT : Lburp/Zgpw;
    //   233: getfield ZJ : I
    //   236: sipush #500
    //   239: iadd
    //   240: if_icmple -> 259
    //   243: goto -> 250
    //   246: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   249: athrow
    //   250: aload_0
    //   251: invokevirtual ZI : ()F
    //   254: freturn
    //   255: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   258: athrow
    //   259: aload_0
    //   260: invokevirtual Z_ : ()V
    //   263: aload_0
    //   264: aload_0
    //   265: invokevirtual ZF : ()I
    //   268: putfield ZI : I
    //   271: aload_0
    //   272: iconst_0
    //   273: putfield Zw : Z
    //   276: aload_0
    //   277: getfield ZI : I
    //   280: i2f
    //   281: aload_0
    //   282: getfield ZT : Lburp/Zgpw;
    //   285: getfield Zr : Lburp/Zmgn;
    //   288: invokevirtual ZS : ()F
    //   291: fmul
    //   292: f2d
    //   293: invokestatic ceil : (D)D
    //   296: d2f
    //   297: freturn
    //   298: new java/lang/IllegalArgumentException
    //   301: dup
    //   302: iload_1
    //   303: sipush #8094
    //   306: sipush #-32622
    //   309: invokestatic a : (II)Ljava/lang/String;
    //   312: swap
    //   313: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   318: invokespecial <init> : (Ljava/lang/String;)V
    //   321: athrow
    // Exception table:
    //   from	to	target	type
    //   4	42	45	java/lang/IllegalArgumentException
    //   32	51	51	java/lang/IllegalArgumentException
    //   77	92	95	java/lang/IllegalArgumentException
    //   81	103	103	java/lang/IllegalArgumentException
    //   116	128	128	java/lang/IllegalArgumentException
    //   139	158	161	java/lang/IllegalArgumentException
    //   149	172	175	java/lang/IllegalArgumentException
    //   165	186	189	java/lang/IllegalArgumentException
    //   179	200	203	java/lang/IllegalArgumentException
    //   193	218	221	java/lang/IllegalArgumentException
    //   207	243	246	java/lang/IllegalArgumentException
    //   225	255	255	java/lang/IllegalArgumentException
  }
  
  private float ZI() {
    try {
      this.ZI = 0;
      if (this.Zp == this.ZT.ZJ)
        try {
          if (!this.Zw)
            return (float)Math.ceil((this.ZO * this.ZT.Zr.ZS())); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      this.Zw = false;
      Z_();
      if (!this.Zi)
        return (float)Math.ceil(this.ZT.Zr.ZS()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = Zc(getStartOffset(), this.ZT.ZJ);
    Insets insets = this.ZT.Zr.getMargin();
    int j = this.ZT.Zr.getWidth() - insets.left - insets.right;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte b = this.ZT.Zr.getLineWrap() ? (int)Math.max(j / this.ZT.Zr.Zi().Zm('A'), 1.0F) : 500;
    int k = (getEndOffset() - this.ZT.ZJ) / b;
    this.ZO = i + k;
    this.Zp = this.ZT.ZJ;
    return (float)Math.ceil(((i + k) * this.ZT.Zr.ZS()));
  }
  
  private int ZQ() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.ZT.ZY == null) ? 0 : (this.ZT.ZY.getWidth() - (this.ZT.Zr.getInsets()).left - (this.ZT.Zr.getInsets()).right);
  }
  
  private float ZD() {
    // Byte code:
    //   0: invokestatic ZW : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Z_ : Ljava/lang/Float;
    //   8: ifnull -> 23
    //   11: aload_0
    //   12: getfield Z_ : Ljava/lang/Float;
    //   15: invokevirtual floatValue : ()F
    //   18: freturn
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: aload_0
    //   24: invokevirtual getStartOffset : ()I
    //   27: istore_2
    //   28: aload_0
    //   29: getfield ZT : Lburp/Zgpw;
    //   32: getfield ZP : Lburp/Ze9f;
    //   35: invokevirtual getDefaultRootElement : ()Ljavax/swing/text/Element;
    //   38: astore_3
    //   39: aload_3
    //   40: iload_2
    //   41: invokeinterface getElementIndex : (I)I
    //   46: istore #4
    //   48: aload_0
    //   49: getfield ZT : Lburp/Zgpw;
    //   52: getfield ZP : Lburp/Ze9f;
    //   55: iload #4
    //   57: invokevirtual Zw : (I)Lburp/Ze7g;
    //   60: astore #5
    //   62: aload_0
    //   63: getfield ZT : Lburp/Zgpw;
    //   66: getfield Zr : Lburp/Zmgn;
    //   69: invokevirtual Zi : ()Lburp/Zzkh;
    //   72: astore #6
    //   74: iconst_1
    //   75: istore #7
    //   77: fconst_0
    //   78: fstore #8
    //   80: fconst_0
    //   81: fstore #9
    //   83: iconst_0
    //   84: istore #10
    //   86: iload_2
    //   87: istore #11
    //   89: aload_0
    //   90: getfield ZT : Lburp/Zgpw;
    //   93: getfield Zr : Lburp/Zmgn;
    //   96: invokevirtual ZE : ()Z
    //   99: ifeq -> 113
    //   102: aload_0
    //   103: invokevirtual getEndOffset : ()I
    //   106: goto -> 127
    //   109: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   112: athrow
    //   113: aload_0
    //   114: getfield ZT : Lburp/Zgpw;
    //   117: getfield ZP : Lburp/Ze9f;
    //   120: aload_0
    //   121: invokevirtual getEndOffset : ()I
    //   124: invokevirtual Zz : (I)I
    //   127: istore #12
    //   129: iload #11
    //   131: iload #12
    //   133: if_icmpge -> 385
    //   136: aload #5
    //   138: iload #11
    //   140: invokevirtual ZW : (I)Lburp/Ze7g;
    //   143: astore #5
    //   145: aload #5
    //   147: invokevirtual Zs : ()Lburp/Zska;
    //   150: astore #13
    //   152: aload #13
    //   154: invokevirtual Za : ()I
    //   157: ifne -> 167
    //   160: goto -> 385
    //   163: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   166: athrow
    //   167: iload #7
    //   169: ifeq -> 188
    //   172: aload_0
    //   173: getfield ZT : Lburp/Zgpw;
    //   176: aload #5
    //   178: aload #6
    //   180: invokevirtual Zi : (Lburp/Ze7g;Lburp/Zzkh;)F
    //   183: fstore #9
    //   185: iconst_0
    //   186: istore #10
    //   188: iload #10
    //   190: aload #13
    //   192: invokevirtual Za : ()I
    //   195: iadd
    //   196: sipush #500
    //   199: if_icmple -> 210
    //   202: iconst_1
    //   203: goto -> 211
    //   206: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   209: athrow
    //   210: iconst_0
    //   211: istore #14
    //   213: iload #14
    //   215: ifeq -> 286
    //   218: sipush #500
    //   221: iload #10
    //   223: isub
    //   224: istore #15
    //   226: aload #13
    //   228: iload #15
    //   230: invokevirtual ZC : (I)Lburp/Zska;
    //   233: astore #16
    //   235: fload #9
    //   237: aload #16
    //   239: aload_0
    //   240: getfield ZT : Lburp/Zgpw;
    //   243: getfield Zr : Lburp/Zmgn;
    //   246: aload_0
    //   247: getfield ZT : Lburp/Zgpw;
    //   250: getfield ZU : Lburp/Zse3;
    //   253: fload #9
    //   255: aload #6
    //   257: invokevirtual ZB : (Lburp/Zmgn;Ljavax/swing/text/TabExpander;FLburp/Zzkh;)F
    //   260: fadd
    //   261: fstore #9
    //   263: fload #8
    //   265: fload #9
    //   267: invokestatic max : (FF)F
    //   270: fstore #8
    //   272: iload #11
    //   274: iload #15
    //   276: iadd
    //   277: istore #11
    //   279: iconst_1
    //   280: istore #7
    //   282: aload_1
    //   283: ifnonnull -> 381
    //   286: fload #9
    //   288: aload #13
    //   290: aload_0
    //   291: getfield ZT : Lburp/Zgpw;
    //   294: getfield Zr : Lburp/Zmgn;
    //   297: aload_0
    //   298: getfield ZT : Lburp/Zgpw;
    //   301: getfield ZU : Lburp/Zse3;
    //   304: fload #9
    //   306: aload #6
    //   308: invokevirtual ZB : (Lburp/Zmgn;Ljavax/swing/text/TabExpander;FLburp/Zzkh;)F
    //   311: fadd
    //   312: fstore #9
    //   314: iload #10
    //   316: aload #13
    //   318: invokevirtual Za : ()I
    //   321: iadd
    //   322: istore #10
    //   324: iload #11
    //   326: aload #13
    //   328: invokevirtual Za : ()I
    //   331: iadd
    //   332: istore #11
    //   334: aload_0
    //   335: getfield ZT : Lburp/Zgpw;
    //   338: getfield Zr : Lburp/Zmgn;
    //   341: invokevirtual Zb : ()Z
    //   344: ifeq -> 378
    //   347: aload #13
    //   349: invokevirtual ZC : ()Z
    //   352: ifeq -> 378
    //   355: goto -> 362
    //   358: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   361: athrow
    //   362: fload #8
    //   364: fload #9
    //   366: invokestatic max : (FF)F
    //   369: fstore #8
    //   371: iconst_1
    //   372: istore #7
    //   374: aload_1
    //   375: ifnonnull -> 381
    //   378: iconst_0
    //   379: istore #7
    //   381: aload_1
    //   382: ifnonnull -> 129
    //   385: aload_0
    //   386: fload #8
    //   388: fload #9
    //   390: invokestatic max : (FF)F
    //   393: invokestatic valueOf : (F)Ljava/lang/Float;
    //   396: putfield Z_ : Ljava/lang/Float;
    //   399: aload_0
    //   400: getfield Z_ : Ljava/lang/Float;
    //   403: invokevirtual floatValue : ()F
    //   406: freturn
    // Exception table:
    //   from	to	target	type
    //   4	19	19	java/lang/IllegalArgumentException
    //   89	109	109	java/lang/IllegalArgumentException
    //   152	163	163	java/lang/IllegalArgumentException
    //   188	206	206	java/lang/IllegalArgumentException
    //   334	355	358	java/lang/IllegalArgumentException
  }
  
  public float getAlignment(int paramInt) {
    return 0.0F;
  }
  
  public void paint(Graphics paramGraphics, Shape paramShape) {}
  
  public Shape modelToView(int paramInt, Shape paramShape, Position.Bias paramBias) throws BadLocationException {
    // Byte code:
    //   0: invokestatic ZW : ()[I
    //   3: astore #4
    //   5: iload_1
    //   6: aload_0
    //   7: getfield ZT : Lburp/Zgpw;
    //   10: getfield ZP : Lburp/Ze9f;
    //   13: invokevirtual getLength : ()I
    //   16: if_icmple -> 41
    //   19: new javax/swing/text/BadLocationException
    //   22: dup
    //   23: sipush #8093
    //   26: sipush #12677
    //   29: invokestatic a : (II)Ljava/lang/String;
    //   32: iload_1
    //   33: invokespecial <init> : (Ljava/lang/String;I)V
    //   36: athrow
    //   37: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   40: athrow
    //   41: aload_2
    //   42: invokeinterface getBounds : ()Ljava/awt/Rectangle;
    //   47: astore #5
    //   49: aload #5
    //   51: invokevirtual getX : ()D
    //   54: d2f
    //   55: fstore #6
    //   57: aload #5
    //   59: invokevirtual getY : ()D
    //   62: d2f
    //   63: fstore #7
    //   65: fconst_1
    //   66: fstore #8
    //   68: aload_0
    //   69: getfield ZT : Lburp/Zgpw;
    //   72: getfield Zr : Lburp/Zmgn;
    //   75: invokevirtual ZS : ()F
    //   78: fstore #9
    //   80: aload_0
    //   81: getfield ZT : Lburp/Zgpw;
    //   84: getfield Zp : Z
    //   87: ifeq -> 114
    //   90: new java/awt/geom/Rectangle2D$Double
    //   93: dup
    //   94: fload #6
    //   96: f2d
    //   97: fload #7
    //   99: f2d
    //   100: fload #8
    //   102: f2d
    //   103: fload #9
    //   105: f2d
    //   106: invokespecial <init> : (DDDD)V
    //   109: areturn
    //   110: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   113: athrow
    //   114: aload_0
    //   115: invokevirtual getStartOffset : ()I
    //   118: istore #10
    //   120: aload_0
    //   121: invokevirtual getEndOffset : ()I
    //   124: istore #11
    //   126: aload_3
    //   127: getstatic javax/swing/text/Position$Bias.Forward : Ljavax/swing/text/Position$Bias;
    //   130: if_acmpne -> 141
    //   133: iload_1
    //   134: goto -> 149
    //   137: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: iload #10
    //   143: iload_1
    //   144: iconst_1
    //   145: isub
    //   146: invokestatic max : (II)I
    //   149: istore #12
    //   151: aload_0
    //   152: getfield ZT : Lburp/Zgpw;
    //   155: getfield ZP : Lburp/Ze9f;
    //   158: invokevirtual getDefaultRootElement : ()Ljavax/swing/text/Element;
    //   161: astore #13
    //   163: aload #13
    //   165: iload #10
    //   167: invokeinterface getElementIndex : (I)I
    //   172: istore #14
    //   174: aload_0
    //   175: getfield ZT : Lburp/Zgpw;
    //   178: getfield ZP : Lburp/Ze9f;
    //   181: iload #14
    //   183: invokevirtual Zw : (I)Lburp/Ze7g;
    //   186: astore #15
    //   188: aload #5
    //   190: invokevirtual getX : ()D
    //   193: d2f
    //   194: fstore #16
    //   196: aload_0
    //   197: getfield ZT : Lburp/Zgpw;
    //   200: getfield Zr : Lburp/Zmgn;
    //   203: invokevirtual Zi : ()Lburp/Zzkh;
    //   206: astore #17
    //   208: aload_0
    //   209: getfield Zz : Ljava/util/NavigableMap;
    //   212: iload_1
    //   213: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   216: invokeinterface lowerKey : (Ljava/lang/Object;)Ljava/lang/Object;
    //   221: checkcast java/lang/Integer
    //   224: astore #18
    //   226: aload #18
    //   228: ifnull -> 284
    //   231: aload #18
    //   233: invokevirtual intValue : ()I
    //   236: iload #10
    //   238: if_icmple -> 284
    //   241: goto -> 248
    //   244: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   247: athrow
    //   248: aload #18
    //   250: invokevirtual intValue : ()I
    //   253: istore #10
    //   255: aload_0
    //   256: getfield Zz : Ljava/util/NavigableMap;
    //   259: aload #18
    //   261: invokeinterface headMap : (Ljava/lang/Object;)Ljava/util/SortedMap;
    //   266: invokeinterface size : ()I
    //   271: istore #19
    //   273: fload #7
    //   275: iload #19
    //   277: i2f
    //   278: fload #9
    //   280: fmul
    //   281: fadd
    //   282: fstore #7
    //   284: iload #10
    //   286: iload #11
    //   288: if_icmpge -> 686
    //   291: aload #15
    //   293: iload #10
    //   295: invokevirtual ZW : (I)Lburp/Ze7g;
    //   298: astore #15
    //   300: aload_0
    //   301: getfield Zz : Ljava/util/NavigableMap;
    //   304: iload #10
    //   306: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   309: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   314: checkcast java/lang/Integer
    //   317: astore #19
    //   319: aload #19
    //   321: ifnonnull -> 359
    //   324: aload_0
    //   325: getfield ZT : Lburp/Zgpw;
    //   328: iload #10
    //   330: aload #15
    //   332: aload #17
    //   334: invokevirtual Zc : (ILburp/Ze7g;Lburp/Zzkh;)I
    //   337: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   340: astore #19
    //   342: aload_0
    //   343: getfield Zz : Ljava/util/NavigableMap;
    //   346: iload #10
    //   348: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   351: aload #19
    //   353: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   358: pop
    //   359: iload_1
    //   360: iload #10
    //   362: if_icmplt -> 390
    //   365: iload #12
    //   367: aload #19
    //   369: invokevirtual intValue : ()I
    //   372: if_icmpge -> 390
    //   375: goto -> 382
    //   378: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   381: athrow
    //   382: iconst_1
    //   383: goto -> 391
    //   386: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   389: athrow
    //   390: iconst_0
    //   391: istore #20
    //   393: iload #20
    //   395: ifeq -> 456
    //   398: fload #16
    //   400: aload_0
    //   401: getfield ZT : Lburp/Zgpw;
    //   404: aload #15
    //   406: aload #17
    //   408: invokevirtual Zi : (Lburp/Ze7g;Lburp/Zzkh;)F
    //   411: fadd
    //   412: fstore #21
    //   414: aload #15
    //   416: aload_0
    //   417: getfield ZT : Lburp/Zgpw;
    //   420: getfield Zr : Lburp/Zmgn;
    //   423: aload_0
    //   424: getfield ZT : Lburp/Zgpw;
    //   427: getfield ZU : Lburp/Zse3;
    //   430: iload_1
    //   431: fload #21
    //   433: new java/awt/geom/Rectangle2D$Double
    //   436: dup
    //   437: fload #6
    //   439: f2d
    //   440: fload #7
    //   442: f2d
    //   443: fload #8
    //   445: f2d
    //   446: fload #9
    //   448: f2d
    //   449: invokespecial <init> : (DDDD)V
    //   452: invokestatic ZD : (Lburp/Ze7g;Lburp/Zmgn;Ljavax/swing/text/TabExpander;IFLjava/awt/geom/Rectangle2D;)Ljava/awt/geom/Rectangle2D;
    //   455: areturn
    //   456: aload_0
    //   457: getfield ZT : Lburp/Zgpw;
    //   460: getfield Zr : Lburp/Zmgn;
    //   463: invokevirtual ZE : ()Z
    //   466: ifeq -> 478
    //   469: iload #11
    //   471: goto -> 490
    //   474: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   477: athrow
    //   478: aload_0
    //   479: getfield ZT : Lburp/Zgpw;
    //   482: getfield ZP : Lburp/Ze9f;
    //   485: iload #11
    //   487: invokevirtual Zz : (I)I
    //   490: istore #21
    //   492: iload #21
    //   494: aload #13
    //   496: invokeinterface getEndOffset : ()I
    //   501: if_icmpne -> 512
    //   504: iconst_1
    //   505: goto -> 513
    //   508: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   511: athrow
    //   512: iconst_0
    //   513: istore #22
    //   515: iload #22
    //   517: ifeq -> 534
    //   520: aload_0
    //   521: getfield ZT : Lburp/Zgpw;
    //   524: getfield ZP : Lburp/Ze9f;
    //   527: iload #11
    //   529: invokevirtual Zz : (I)I
    //   532: istore #21
    //   534: aload #19
    //   536: invokevirtual intValue : ()I
    //   539: iload #21
    //   541: if_icmpne -> 648
    //   544: iload_1
    //   545: iload #21
    //   547: if_icmpne -> 648
    //   550: goto -> 557
    //   553: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   556: athrow
    //   557: iload_1
    //   558: iload #10
    //   560: if_icmple -> 628
    //   563: goto -> 570
    //   566: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   569: athrow
    //   570: fload #16
    //   572: aload_0
    //   573: getfield ZT : Lburp/Zgpw;
    //   576: aload #15
    //   578: aload #17
    //   580: invokevirtual Zi : (Lburp/Ze7g;Lburp/Zzkh;)F
    //   583: fadd
    //   584: fstore #23
    //   586: aload #15
    //   588: aload_0
    //   589: getfield ZT : Lburp/Zgpw;
    //   592: getfield Zr : Lburp/Zmgn;
    //   595: aload_0
    //   596: getfield ZT : Lburp/Zgpw;
    //   599: getfield ZU : Lburp/Zse3;
    //   602: iload_1
    //   603: fload #23
    //   605: new java/awt/geom/Rectangle2D$Double
    //   608: dup
    //   609: fload #6
    //   611: f2d
    //   612: fload #7
    //   614: f2d
    //   615: fload #8
    //   617: f2d
    //   618: fload #9
    //   620: f2d
    //   621: invokespecial <init> : (DDDD)V
    //   624: invokestatic ZD : (Lburp/Ze7g;Lburp/Zmgn;Ljavax/swing/text/TabExpander;IFLjava/awt/geom/Rectangle2D;)Ljava/awt/geom/Rectangle2D;
    //   627: areturn
    //   628: new java/awt/geom/Rectangle2D$Double
    //   631: dup
    //   632: fload #6
    //   634: f2d
    //   635: fload #7
    //   637: f2d
    //   638: fload #8
    //   640: f2d
    //   641: fload #9
    //   643: f2d
    //   644: invokespecial <init> : (DDDD)V
    //   647: areturn
    //   648: aload #19
    //   650: invokevirtual intValue : ()I
    //   653: iload #10
    //   655: if_icmpne -> 667
    //   658: iload #11
    //   660: goto -> 672
    //   663: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   666: athrow
    //   667: aload #19
    //   669: invokevirtual intValue : ()I
    //   672: istore #10
    //   674: fload #7
    //   676: fload #9
    //   678: fadd
    //   679: fstore #7
    //   681: aload #4
    //   683: ifnonnull -> 284
    //   686: new java/awt/geom/Rectangle2D$Double
    //   689: dup
    //   690: fload #6
    //   692: f2d
    //   693: fload #7
    //   695: f2d
    //   696: fload #8
    //   698: f2d
    //   699: fload #9
    //   701: f2d
    //   702: invokespecial <init> : (DDDD)V
    //   705: areturn
    // Exception table:
    //   from	to	target	type
    //   5	37	37	javax/swing/text/BadLocationException
    //   80	110	110	javax/swing/text/BadLocationException
    //   126	137	137	javax/swing/text/BadLocationException
    //   226	241	244	javax/swing/text/BadLocationException
    //   359	375	378	javax/swing/text/BadLocationException
    //   365	386	386	javax/swing/text/BadLocationException
    //   456	474	474	javax/swing/text/BadLocationException
    //   492	508	508	javax/swing/text/BadLocationException
    //   534	550	553	javax/swing/text/BadLocationException
    //   544	563	566	javax/swing/text/BadLocationException
    //   648	663	663	javax/swing/text/BadLocationException
  }
  
  public int viewToModel(float paramFloat1, float paramFloat2, Shape paramShape, Position.Bias[] paramArrayOfBias) {
    // Byte code:
    //   0: aload #4
    //   2: iconst_0
    //   3: getstatic javax/swing/text/Position$Bias.Forward : Ljavax/swing/text/Position$Bias;
    //   6: aastore
    //   7: aload_3
    //   8: checkcast java/awt/geom/Rectangle2D
    //   11: astore #5
    //   13: fload_2
    //   14: f2d
    //   15: aload #5
    //   17: invokevirtual getY : ()D
    //   20: dcmpg
    //   21: ifge -> 33
    //   24: aload_0
    //   25: invokevirtual getStartOffset : ()I
    //   28: ireturn
    //   29: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   32: athrow
    //   33: fload_2
    //   34: f2d
    //   35: aload #5
    //   37: invokevirtual getY : ()D
    //   40: aload #5
    //   42: invokevirtual getHeight : ()D
    //   45: dadd
    //   46: dcmpl
    //   47: iflt -> 69
    //   50: aload_0
    //   51: getfield ZT : Lburp/Zgpw;
    //   54: getfield ZP : Lburp/Ze9f;
    //   57: aload_0
    //   58: invokevirtual getEndOffset : ()I
    //   61: invokevirtual Zz : (I)I
    //   64: ireturn
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: aload_0
    //   70: getfield ZT : Lburp/Zgpw;
    //   73: getfield Zr : Lburp/Zmgn;
    //   76: invokevirtual ZS : ()F
    //   79: fstore #6
    //   81: aload_0
    //   82: getfield ZT : Lburp/Zgpw;
    //   85: getfield ZP : Lburp/Ze9f;
    //   88: invokevirtual getDefaultRootElement : ()Ljavax/swing/text/Element;
    //   91: astore #7
    //   93: aload_0
    //   94: invokevirtual getStartOffset : ()I
    //   97: istore #8
    //   99: aload #7
    //   101: iload #8
    //   103: invokeinterface getElementIndex : (I)I
    //   108: istore #9
    //   110: aload_0
    //   111: getfield ZT : Lburp/Zgpw;
    //   114: getfield ZP : Lburp/Ze9f;
    //   117: iload #9
    //   119: invokevirtual Zw : (I)Lburp/Ze7g;
    //   122: astore #10
    //   124: aload #5
    //   126: invokevirtual getX : ()D
    //   129: d2f
    //   130: fstore #11
    //   132: aload_0
    //   133: getfield ZT : Lburp/Zgpw;
    //   136: getfield Zr : Lburp/Zmgn;
    //   139: invokevirtual Zi : ()Lburp/Zzkh;
    //   142: astore #12
    //   144: fload_2
    //   145: f2d
    //   146: aload #5
    //   148: invokevirtual getY : ()D
    //   151: dsub
    //   152: aload_0
    //   153: getfield ZT : Lburp/Zgpw;
    //   156: getfield Zr : Lburp/Zmgn;
    //   159: invokevirtual ZS : ()F
    //   162: f2d
    //   163: ddiv
    //   164: invokestatic floor : (D)D
    //   167: d2i
    //   168: istore #13
    //   170: new burp/Zl75
    //   173: dup
    //   174: aload_0
    //   175: getfield ZT : Lburp/Zgpw;
    //   178: aload_0
    //   179: getfield Zz : Ljava/util/NavigableMap;
    //   182: aload #12
    //   184: invokespecial <init> : (Lburp/Zgpw;Ljava/util/Map;Lburp/Zzkh;)V
    //   187: aload #10
    //   189: iload #8
    //   191: fload_2
    //   192: iload #13
    //   194: fload #6
    //   196: invokevirtual ZQ : (Lburp/Ze7g;IFIF)Lburp/Zm1s;
    //   199: astore #14
    //   201: aload #14
    //   203: getfield Zu : Lburp/Ze7g;
    //   206: astore #10
    //   208: aload #14
    //   210: getfield Zm : I
    //   213: istore #8
    //   215: fload_1
    //   216: fload #11
    //   218: fcmpg
    //   219: ifge -> 230
    //   222: iconst_1
    //   223: goto -> 231
    //   226: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   229: athrow
    //   230: iconst_0
    //   231: istore #15
    //   233: iload #15
    //   235: ifeq -> 245
    //   238: iload #8
    //   240: ireturn
    //   241: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   244: athrow
    //   245: aload_0
    //   246: getfield Zz : Ljava/util/NavigableMap;
    //   249: iload #8
    //   251: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   254: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   259: checkcast java/lang/Integer
    //   262: astore #16
    //   264: aload #16
    //   266: ifnonnull -> 304
    //   269: aload_0
    //   270: getfield ZT : Lburp/Zgpw;
    //   273: iload #8
    //   275: aload #10
    //   277: aload #12
    //   279: invokevirtual Zc : (ILburp/Ze7g;Lburp/Zzkh;)I
    //   282: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   285: astore #16
    //   287: aload_0
    //   288: getfield Zz : Ljava/util/NavigableMap;
    //   291: iload #8
    //   293: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   296: aload #16
    //   298: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   303: pop
    //   304: aload #10
    //   306: iload #8
    //   308: invokevirtual ZW : (I)Lburp/Ze7g;
    //   311: astore #10
    //   313: fload #11
    //   315: aload_0
    //   316: getfield ZT : Lburp/Zgpw;
    //   319: aload #10
    //   321: aload #12
    //   323: invokevirtual Zi : (Lburp/Ze7g;Lburp/Zzkh;)F
    //   326: fadd
    //   327: fstore #17
    //   329: aload #10
    //   331: aload_0
    //   332: getfield ZT : Lburp/Zgpw;
    //   335: getfield Zr : Lburp/Zmgn;
    //   338: aload_0
    //   339: getfield ZT : Lburp/Zgpw;
    //   342: getfield ZU : Lburp/Zse3;
    //   345: fload #17
    //   347: fload_1
    //   348: invokestatic ZE : (Lburp/Ze7g;Lburp/Zmgn;Ljavax/swing/text/TabExpander;FF)I
    //   351: istore #18
    //   353: iload #18
    //   355: aload #16
    //   357: invokevirtual intValue : ()I
    //   360: invokestatic min : (II)I
    //   363: istore #18
    //   365: iload #18
    //   367: ifle -> 439
    //   370: iload #18
    //   372: aload #16
    //   374: invokevirtual intValue : ()I
    //   377: if_icmpne -> 439
    //   380: goto -> 387
    //   383: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   386: athrow
    //   387: iload #18
    //   389: aload_0
    //   390: getfield ZT : Lburp/Zgpw;
    //   393: getfield ZP : Lburp/Ze9f;
    //   396: invokevirtual getLength : ()I
    //   399: if_icmpge -> 439
    //   402: goto -> 409
    //   405: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   408: athrow
    //   409: aload_0
    //   410: getfield ZT : Lburp/Zgpw;
    //   413: getfield ZP : Lburp/Ze9f;
    //   416: iload #18
    //   418: invokevirtual Zr : (I)Z
    //   421: ifne -> 439
    //   424: goto -> 431
    //   427: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   430: athrow
    //   431: iconst_1
    //   432: goto -> 440
    //   435: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   438: athrow
    //   439: iconst_0
    //   440: istore #19
    //   442: iload #18
    //   444: aload #16
    //   446: invokevirtual intValue : ()I
    //   449: if_icmpne -> 502
    //   452: aload_0
    //   453: getfield ZT : Lburp/Zgpw;
    //   456: getfield Zr : Lburp/Zmgn;
    //   459: invokevirtual ZE : ()Z
    //   462: ifeq -> 502
    //   465: goto -> 472
    //   468: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   471: athrow
    //   472: aload_0
    //   473: getfield ZT : Lburp/Zgpw;
    //   476: getfield ZP : Lburp/Ze9f;
    //   479: iload #18
    //   481: invokevirtual Zr : (I)Z
    //   484: ifeq -> 502
    //   487: goto -> 494
    //   490: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   493: athrow
    //   494: iconst_1
    //   495: goto -> 503
    //   498: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   501: athrow
    //   502: iconst_0
    //   503: istore #20
    //   505: iload #19
    //   507: ifne -> 522
    //   510: iload #20
    //   512: ifeq -> 539
    //   515: goto -> 522
    //   518: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   521: athrow
    //   522: aload #4
    //   524: iconst_0
    //   525: getstatic javax/swing/text/Position$Bias.Backward : Ljavax/swing/text/Position$Bias;
    //   528: aastore
    //   529: aload #16
    //   531: invokevirtual intValue : ()I
    //   534: ireturn
    //   535: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   538: athrow
    //   539: iload #18
    //   541: iload #8
    //   543: invokestatic max : (II)I
    //   546: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	29	29	java/lang/IllegalArgumentException
    //   33	65	65	java/lang/IllegalArgumentException
    //   215	226	226	java/lang/IllegalArgumentException
    //   233	241	241	java/lang/IllegalArgumentException
    //   365	380	383	java/lang/IllegalArgumentException
    //   370	402	405	java/lang/IllegalArgumentException
    //   387	424	427	java/lang/IllegalArgumentException
    //   409	435	435	java/lang/IllegalArgumentException
    //   442	465	468	java/lang/IllegalArgumentException
    //   452	487	490	java/lang/IllegalArgumentException
    //   472	498	498	java/lang/IllegalArgumentException
    //   505	515	518	java/lang/IllegalArgumentException
    //   510	535	535	java/lang/IllegalArgumentException
  }
  
  private void Za(Shape paramShape) {
    Z_();
    int i = ZF();
    int[] arrayOfInt = Zgpw.ZW();
    if (this.ZI != i) {
      this.ZI = i;
      this.ZT.preferenceChanged(this, true, true);
      Zmgn zmgn = (Zmgn)getContainer();
      zmgn.repaint();
      Zsqn zsqn = Zk80.Zh(zmgn);
      try {
        if (zsqn != null) {
          zsqn.revalidate();
          zsqn.repaint();
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        if (arrayOfInt == null) {
          if (paramShape != null) {
            Container container = getContainer();
            Rectangle rectangle = (Rectangle)paramShape;
            container.repaint(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
          } 
          return;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return;
    } 
    if (paramShape != null) {
      Container container = getContainer();
      Rectangle rectangle = (Rectangle)paramShape;
      container.repaint(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    } 
  }
  
  public void insertUpdate(DocumentEvent paramDocumentEvent, Shape paramShape, ViewFactory paramViewFactory) {
    Za(paramShape);
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent, Shape paramShape, ViewFactory paramViewFactory) {
    Za(paramShape);
  }
  
  public int getNextVisualPositionFrom(int paramInt1, Position.Bias paramBias, Shape paramShape, int paramInt2, Position.Bias[] paramArrayOfBias) throws BadLocationException {
    try {
      if (paramInt1 < -1)
        throw new BadLocationException(a(8095, -11637), paramInt1); 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    try {
      DefaultCaret defaultCaret;
      Point point;
      float f;
      switch (paramInt2) {
        case 1:
        case 5:
          try {
            if (paramInt1 == -1) {
              try {
              
              } catch (BadLocationException badLocationException) {
                throw a(null);
              } 
              return (paramInt2 == 1) ? Math.max(0, this.ZT.ZP.Zz(getEndOffset())) : getStartOffset();
            } 
          } catch (BadLocationException badLocationException) {
            throw a(null);
          } 
          defaultCaret = (DefaultCaret)this.ZT.Zr.getCaret();
          try {
          
          } catch (BadLocationException badLocationException) {
            throw a(null);
          } 
          point = (defaultCaret != null) ? defaultCaret.getMagicCaretPosition() : null;
          try {
          
          } catch (BadLocationException badLocationException) {
            throw a(null);
          } 
          f = (paramInt2 == 1) ? -this.ZT.Zr.ZS() : this.ZT.Zr.ZS();
          return Ze(paramInt1, paramBias, paramShape, f, point, paramArrayOfBias);
        case 3:
          return Zh(paramInt1, paramBias, paramShape, paramArrayOfBias);
        case 7:
          return Zo(paramInt1, paramBias, paramShape, paramArrayOfBias);
      } 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(a(8092, 12307) + a(8092, 12307));
  }
  
  private int Zh(int paramInt, Position.Bias paramBias, Shape paramShape, Position.Bias[] paramArrayOfBias) throws BadLocationException {
    try {
      if (paramInt == -1)
        return getStartOffset(); 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    try {
      paramArrayOfBias[0] = Position.Bias.Forward;
      if (this.ZT.Zr.ZE())
        try {
          if (this.ZT.ZP.Zr(paramInt))
            try {
              if (paramBias == Position.Bias.Backward)
                return paramInt; 
            } catch (BadLocationException badLocationException) {
              throw a(null);
            }  
        } catch (BadLocationException badLocationException) {
          throw a(null);
        }  
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    int i = Zf(paramInt);
    try {
      if (this.ZT.ZP.Zs(i)) {
        try {
          if (this.ZT.Zr.ZE())
            try {
              if (i < this.ZT.ZP.getDefaultRootElement().getEndOffset() - 1) {
                try {
                
                } catch (BadLocationException badLocationException) {
                  throw a(null);
                } 
                boolean bool = (this.ZT.ZP.Zc(i) == '\n') ? true : false;
                try {
                  if (bool)
                    paramArrayOfBias[0] = Position.Bias.Backward; 
                } catch (BadLocationException badLocationException) {
                  throw a(null);
                } 
                try {
                
                } catch (BadLocationException badLocationException) {
                  throw a(null);
                } 
                return Math.min(this.ZT.ZP.getLength(), (paramBias == Position.Bias.Backward) ? i : (i + 1));
              } 
            } catch (BadLocationException badLocationException) {
              throw a(null);
            }  
        } catch (BadLocationException badLocationException) {
          throw a(null);
        } 
        return Math.min(this.ZT.ZP.getLength(), this.ZT.ZP.Za(i));
      } 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    int j = Math.min(this.ZT.ZP.getLength(), i + 1);
    try {
      if (ZJ(paramInt, i, paramShape)) {
        try {
          if (paramBias == Position.Bias.Backward)
            return i; 
        } catch (BadLocationException badLocationException) {
          throw a(null);
        } 
        paramArrayOfBias[0] = ZC(j, paramShape, 3);
        return j;
      } 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    paramArrayOfBias[0] = ZC(j, paramShape, 3);
    return j;
  }
  
  private int Zo(int paramInt, Position.Bias paramBias, Shape paramShape, Position.Bias[] paramArrayOfBias) throws BadLocationException {
    try {
      if (paramInt == -1)
        return Math.max(0, this.ZT.ZP.Zz(getEndOffset())); 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    paramArrayOfBias[0] = Position.Bias.Forward;
    int i = Zc(paramInt);
    try {
      if (this.ZT.ZP.Zr(i)) {
        try {
          if (this.ZT.Zr.ZE()) {
            try {
              if (paramBias == Position.Bias.Forward) {
                paramArrayOfBias[0] = Position.Bias.Backward;
                return i;
              } 
            } catch (BadLocationException badLocationException) {
              throw a(null);
            } 
            return i - 1;
          } 
        } catch (BadLocationException badLocationException) {
          throw a(null);
        } 
        return this.ZT.ZP.Zz(i);
      } 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    int j = Math.max(0, i - 1);
    try {
      if (ZJ(i, paramInt, paramShape)) {
        try {
          if (paramBias == Position.Bias.Forward) {
            paramArrayOfBias[0] = Position.Bias.Backward;
            return i;
          } 
        } catch (BadLocationException badLocationException) {
          throw a(null);
        } 
        paramArrayOfBias[0] = ZC(j, paramShape, 7);
        return j;
      } 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    paramArrayOfBias[0] = ZC(j, paramShape, 7);
    return j;
  }
  
  private Position.Bias ZC(int paramInt1, Shape paramShape, int paramInt2) throws BadLocationException {
    try {
      if (ZJ(paramInt1, paramInt1, paramShape)) {
        try {
        
        } catch (BadLocationException badLocationException) {
          throw a(null);
        } 
        return (paramInt2 == 3) ? Position.Bias.Backward : Position.Bias.Forward;
      } 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    return Position.Bias.Forward;
  }
  
  private int Zf(int paramInt) {
    int[] arrayOfInt = Zgpw.ZW();
    if (this.ZT.Zr.Zb()) {
      Zska zska = Zk80.Zf(this.ZT.ZP, paramInt);
      try {
        if (zska != null)
          try {
            if (zska.Zj())
              if (this.ZT.Zr.ZE()) {
                Zska zska1 = zska.ZX(paramInt);
                int i = zska1.ZY('\t');
                try {
                  if (i != -1)
                    return paramInt + i; 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                try {
                  if (arrayOfInt == null)
                    return zska.ZF(); 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
              } else {
                return zska.ZF();
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return paramInt;
  }
  
  private int Zc(int paramInt) {
    int[] arrayOfInt = Zgpw.ZW();
    if (this.ZT.Zr.Zb()) {
      Zska zska = Zk80.Zf(this.ZT.ZP, paramInt - 1);
      try {
        if (zska != null)
          try {
            if (zska.Zj())
              if (this.ZT.Zr.ZE()) {
                Zska zska1 = zska.Zb(paramInt);
                int i = zska1.Za('\t');
                try {
                  if (i != -1)
                    return zska1.ZJ() + i + 1; 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                try {
                  if (arrayOfInt == null)
                    return zska.ZJ(); 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
              } else {
                return zska.ZJ();
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return paramInt;
  }
  
  private boolean ZJ(int paramInt1, int paramInt2, Shape paramShape) throws BadLocationException {
    try {
      if (paramInt1 == paramInt2)
        try {
          if (paramInt1 == this.ZT.ZP.getLength())
            return false; 
        } catch (BadLocationException badLocationException) {
          throw a(null);
        }  
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    Rectangle rectangle1 = modelToView(paramInt1, paramShape, Position.Bias.Backward).getBounds();
    Rectangle rectangle2 = modelToView(paramInt2, paramShape, Position.Bias.Forward).getBounds();
    try {
    
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    return (rectangle1.y != rectangle2.y);
  }
  
  private int Ze(int paramInt, Position.Bias paramBias, Shape paramShape, float paramFloat, Point paramPoint, Position.Bias[] paramArrayOfBias) {
    paramArrayOfBias[0] = Position.Bias.Forward;
    try {
      Rectangle rectangle = modelToView(paramInt, paramShape, paramBias).getBounds();
      try {
      
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
      int i = (paramPoint != null) ? paramPoint.x : rectangle.x;
      float f = rectangle.y + paramFloat;
      return (f < 0.0F) ? 0 : this.ZT.Zr.Zd(new Point2D.Double(i, f), paramArrayOfBias);
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.COMMON_RUNTIME_FAILURE);
      return 0;
    } catch (NullPointerException nullPointerException) {
      Zah.Zl(nullPointerException, Zk_.UNEXPECTED);
      return 0;
    } 
  }
  
  public void Z_() {
    this.Zz.clear();
    this.Z_ = null;
    this.Zp = -1;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ODke:¯1%#lo\\n´íM?D°`¡ë!j|l)'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #14
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #33
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'æÜb2.!7PÁáDÞLcD3y_Ñ)ß;ö²¸L­7'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #15
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #29
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Ztrf.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Ztrf.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #124
    //   214: goto -> 244
    //   217: bipush #66
    //   219: goto -> 244
    //   222: bipush #30
    //   224: goto -> 244
    //   227: bipush #98
    //   229: goto -> 244
    //   232: bipush #69
    //   234: goto -> 244
    //   237: bipush #110
    //   239: goto -> 244
    //   242: bipush #94
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1F9E) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = 'È';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztrf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */