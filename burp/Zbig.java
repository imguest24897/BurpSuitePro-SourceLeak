package burp;

import java.awt.Graphics;
import java.awt.Graphics2D;

class Zbig extends Zbic {
  private int ZS;
  
  Zbig(double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, Object paramObject1, Object paramObject2) {
    super(paramDouble1, paramDouble2, paramDouble3, paramInt1, paramInt2, paramDouble4, paramDouble5, paramDouble6, paramDouble7, paramDouble8, paramDouble9, paramObject1, paramObject2);
  }
  
  void ZC(Graphics paramGraphics) {
    super.ZC(paramGraphics);
    int[][] arrayOfInt = this.ZH;
    int i = arrayOfInt.length;
    Zbqc[] arrayOfZbqc = Zbck.Zr();
    byte b = 0;
    while (b < i) {
      int[] arrayOfInt1 = arrayOfInt[b];
      if (arrayOfInt1[0] > this.ZS)
        this.ZS = arrayOfInt1[0]; 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    this.Zq = 10 + this.ZS + 15 + this.ZN[0];
    this.Zv = true;
  }
  
  int Ze() {
    return this.Zq;
  }
  
  int Zv() {
    return this.Zx;
  }
  
  void ZH(Graphics2D paramGraphics2D, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zr : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield Zv : Z
    //   9: ifne -> 17
    //   12: aload_0
    //   13: aload_1
    //   14: invokevirtual ZC : (Ljava/awt/Graphics;)V
    //   17: iload_2
    //   18: aload_0
    //   19: getfield Zq : I
    //   22: iadd
    //   23: istore #5
    //   25: aload_1
    //   26: getstatic burp/Zt00.DEFAULT_FONT : Lburp/Zt00;
    //   29: invokevirtual ZV : ()Ljava/awt/Font;
    //   32: invokevirtual setFont : (Ljava/awt/Font;)V
    //   35: aload_1
    //   36: iload #5
    //   38: iload_3
    //   39: iload #5
    //   41: iload_3
    //   42: aload_0
    //   43: getfield Zx : I
    //   46: iadd
    //   47: invokevirtual drawLine : (IIII)V
    //   50: aload_0
    //   51: getfield ZW : D
    //   54: dstore #6
    //   56: dload #6
    //   58: aload_0
    //   59: getfield Zj : D
    //   62: dcmpg
    //   63: ifgt -> 128
    //   66: dload #6
    //   68: aload_0
    //   69: getfield Zf : D
    //   72: dsub
    //   73: aload_0
    //   74: getfield ZM : D
    //   77: dmul
    //   78: invokestatic round : (D)J
    //   81: l2i
    //   82: istore #8
    //   84: iload_3
    //   85: aload_0
    //   86: getfield Zx : I
    //   89: iadd
    //   90: aload_0
    //   91: getfield ZU : I
    //   94: isub
    //   95: iload #8
    //   97: isub
    //   98: istore #9
    //   100: aload_1
    //   101: iload #5
    //   103: iconst_5
    //   104: isub
    //   105: iload #9
    //   107: iload #5
    //   109: iload #9
    //   111: invokevirtual drawLine : (IIII)V
    //   114: dload #6
    //   116: aload_0
    //   117: getfield Zr : D
    //   120: dadd
    //   121: dstore #6
    //   123: aload #4
    //   125: ifnonnull -> 56
    //   128: aload_0
    //   129: getfield Ze : D
    //   132: dstore #6
    //   134: dload #6
    //   136: aload_0
    //   137: getfield Zj : D
    //   140: dcmpg
    //   141: ifgt -> 206
    //   144: dload #6
    //   146: aload_0
    //   147: getfield Zf : D
    //   150: dsub
    //   151: aload_0
    //   152: getfield ZM : D
    //   155: dmul
    //   156: invokestatic round : (D)J
    //   159: l2i
    //   160: istore #8
    //   162: iload_3
    //   163: aload_0
    //   164: getfield Zx : I
    //   167: iadd
    //   168: aload_0
    //   169: getfield ZU : I
    //   172: isub
    //   173: iload #8
    //   175: isub
    //   176: istore #9
    //   178: aload_1
    //   179: iload #5
    //   181: iconst_2
    //   182: isub
    //   183: iload #9
    //   185: iload #5
    //   187: iload #9
    //   189: invokevirtual drawLine : (IIII)V
    //   192: dload #6
    //   194: aload_0
    //   195: getfield ZF : D
    //   198: dadd
    //   199: dstore #6
    //   201: aload #4
    //   203: ifnonnull -> 134
    //   206: iconst_0
    //   207: istore #6
    //   209: iload_2
    //   210: aload_0
    //   211: getfield Zq : I
    //   214: iadd
    //   215: iconst_1
    //   216: isub
    //   217: iconst_5
    //   218: isub
    //   219: iconst_5
    //   220: isub
    //   221: istore #7
    //   223: aload_0
    //   224: getfield Zu : D
    //   227: dstore #8
    //   229: dload #8
    //   231: aload_0
    //   232: getfield Zj : D
    //   235: dcmpg
    //   236: ifgt -> 412
    //   239: iload_3
    //   240: aload_0
    //   241: getfield Zx : I
    //   244: iadd
    //   245: aload_0
    //   246: getfield ZU : I
    //   249: isub
    //   250: dload #8
    //   252: aload_0
    //   253: getfield Zf : D
    //   256: dsub
    //   257: aload_0
    //   258: getfield ZM : D
    //   261: dmul
    //   262: aload_0
    //   263: getfield ZH : [[I
    //   266: iload #6
    //   268: aaload
    //   269: iconst_1
    //   270: iaload
    //   271: i2d
    //   272: ldc2_w 2.0
    //   275: ddiv
    //   276: dsub
    //   277: d2i
    //   278: isub
    //   279: iconst_1
    //   280: isub
    //   281: istore #10
    //   283: aload_0
    //   284: getfield ZZ : Ljava/lang/Object;
    //   287: instanceof java/util/ArrayList
    //   290: ifeq -> 358
    //   293: iload #6
    //   295: aload_0
    //   296: getfield ZZ : Ljava/lang/Object;
    //   299: checkcast java/util/ArrayList
    //   302: invokevirtual size : ()I
    //   305: if_icmplt -> 320
    //   308: iconst_0
    //   309: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   312: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   315: aload #4
    //   317: ifnonnull -> 412
    //   320: aload_1
    //   321: aload_0
    //   322: getfield ZZ : Ljava/lang/Object;
    //   325: checkcast java/util/ArrayList
    //   328: iload #6
    //   330: invokevirtual get : (I)Ljava/lang/Object;
    //   333: checkcast java/lang/String
    //   336: iload #7
    //   338: aload_0
    //   339: getfield ZH : [[I
    //   342: iload #6
    //   344: aaload
    //   345: iconst_0
    //   346: iaload
    //   347: isub
    //   348: iload #10
    //   350: invokevirtual drawString : (Ljava/lang/String;II)V
    //   353: aload #4
    //   355: ifnonnull -> 395
    //   358: aload_0
    //   359: getfield ZZ : Ljava/lang/Object;
    //   362: instanceof burp/Zvd
    //   365: ifeq -> 395
    //   368: aload_0
    //   369: getfield ZZ : Ljava/lang/Object;
    //   372: checkcast burp/Zvd
    //   375: aload_1
    //   376: iload #7
    //   378: aload_0
    //   379: getfield ZH : [[I
    //   382: iload #6
    //   384: aaload
    //   385: iconst_0
    //   386: iaload
    //   387: isub
    //   388: iload #10
    //   390: invokeinterface ZJ : (Ljava/awt/Graphics2D;II)V
    //   395: iinc #6, 1
    //   398: dload #8
    //   400: aload_0
    //   401: getfield Zl : D
    //   404: dadd
    //   405: dstore #8
    //   407: aload #4
    //   409: ifnonnull -> 229
    //   412: iload #7
    //   414: aload_0
    //   415: getfield ZS : I
    //   418: isub
    //   419: bipush #15
    //   421: isub
    //   422: aload_0
    //   423: getfield ZN : [I
    //   426: iconst_0
    //   427: iaload
    //   428: isub
    //   429: istore #8
    //   431: iload_3
    //   432: aload_0
    //   433: getfield Zx : I
    //   436: aload_0
    //   437: getfield ZN : [I
    //   440: iconst_1
    //   441: iaload
    //   442: isub
    //   443: iconst_2
    //   444: idiv
    //   445: iadd
    //   446: istore #9
    //   448: aload_0
    //   449: getfield ZY : Ljava/lang/Object;
    //   452: instanceof java/lang/String
    //   455: ifeq -> 488
    //   458: aload_1
    //   459: getstatic burp/Zt00.BOLD_FONT : Lburp/Zt00;
    //   462: invokevirtual ZV : ()Ljava/awt/Font;
    //   465: invokevirtual setFont : (Ljava/awt/Font;)V
    //   468: aload_1
    //   469: aload_0
    //   470: getfield ZY : Ljava/lang/Object;
    //   473: checkcast java/lang/String
    //   476: iload #8
    //   478: iload #9
    //   480: invokevirtual drawString : (Ljava/lang/String;II)V
    //   483: aload #4
    //   485: ifnonnull -> 515
    //   488: aload_0
    //   489: getfield ZY : Ljava/lang/Object;
    //   492: instanceof burp/Zzji
    //   495: ifeq -> 515
    //   498: aload_0
    //   499: getfield ZY : Ljava/lang/Object;
    //   502: checkcast burp/Zzji
    //   505: aload_1
    //   506: iload #8
    //   508: iload #9
    //   510: invokeinterface ZL : (Ljava/awt/Graphics2D;II)V
    //   515: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */