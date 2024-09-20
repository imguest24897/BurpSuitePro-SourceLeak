package burp;

import java.awt.Graphics;
import java.awt.Graphics2D;

class Zbid extends Zbic {
  private int Zd;
  
  Zbid(double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, Object paramObject1, Object paramObject2) {
    super(paramDouble1, paramDouble2, paramDouble3, paramInt1, paramInt2, paramDouble4, paramDouble5, paramDouble6, paramDouble7, paramDouble8, paramDouble9, paramObject1, paramObject2);
  }
  
  void ZC(Graphics paramGraphics) {
    super.ZC(paramGraphics);
    int[][] arrayOfInt = this.ZH;
    int i = arrayOfInt.length;
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zbck.Zr();
    while (b < i) {
      int[] arrayOfInt1 = arrayOfInt[b];
      if (arrayOfInt1[1] > this.Zd)
        this.Zd = arrayOfInt1[1]; 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    this.Zq = 10 + this.Zd + 15 + this.ZN[1];
    this.Zv = true;
  }
  
  int Ze() {
    return this.Zx;
  }
  
  int Zv() {
    return this.Zq;
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
    //   17: aload_1
    //   18: getstatic burp/Zt00.DEFAULT_FONT : Lburp/Zt00;
    //   21: invokevirtual ZV : ()Ljava/awt/Font;
    //   24: invokevirtual setFont : (Ljava/awt/Font;)V
    //   27: aload_1
    //   28: iload_2
    //   29: iload_3
    //   30: iload_2
    //   31: aload_0
    //   32: getfield Zx : I
    //   35: iadd
    //   36: iload_3
    //   37: invokevirtual drawLine : (IIII)V
    //   40: aload_0
    //   41: getfield ZW : D
    //   44: dstore #5
    //   46: dload #5
    //   48: aload_0
    //   49: getfield Zj : D
    //   52: dcmpg
    //   53: ifgt -> 111
    //   56: dload #5
    //   58: aload_0
    //   59: getfield Zf : D
    //   62: dsub
    //   63: aload_0
    //   64: getfield ZM : D
    //   67: dmul
    //   68: invokestatic round : (D)J
    //   71: l2i
    //   72: istore #7
    //   74: iload_2
    //   75: aload_0
    //   76: getfield ZU : I
    //   79: iadd
    //   80: iload #7
    //   82: iadd
    //   83: istore #8
    //   85: aload_1
    //   86: iload #8
    //   88: iload_3
    //   89: iload #8
    //   91: iload_3
    //   92: iconst_5
    //   93: iadd
    //   94: invokevirtual drawLine : (IIII)V
    //   97: dload #5
    //   99: aload_0
    //   100: getfield Zr : D
    //   103: dadd
    //   104: dstore #5
    //   106: aload #4
    //   108: ifnonnull -> 46
    //   111: aload_0
    //   112: getfield Ze : D
    //   115: dstore #5
    //   117: dload #5
    //   119: aload_0
    //   120: getfield Zj : D
    //   123: dcmpg
    //   124: ifgt -> 182
    //   127: dload #5
    //   129: aload_0
    //   130: getfield Zf : D
    //   133: dsub
    //   134: aload_0
    //   135: getfield ZM : D
    //   138: dmul
    //   139: invokestatic round : (D)J
    //   142: l2i
    //   143: istore #7
    //   145: iload_2
    //   146: aload_0
    //   147: getfield ZU : I
    //   150: iadd
    //   151: iload #7
    //   153: iadd
    //   154: istore #8
    //   156: aload_1
    //   157: iload #8
    //   159: iload_3
    //   160: iload #8
    //   162: iload_3
    //   163: iconst_2
    //   164: iadd
    //   165: invokevirtual drawLine : (IIII)V
    //   168: dload #5
    //   170: aload_0
    //   171: getfield ZF : D
    //   174: dadd
    //   175: dstore #5
    //   177: aload #4
    //   179: ifnonnull -> 117
    //   182: iconst_0
    //   183: istore #5
    //   185: iload_3
    //   186: iconst_5
    //   187: iadd
    //   188: iconst_5
    //   189: iadd
    //   190: istore #6
    //   192: aload_0
    //   193: getfield Zu : D
    //   196: dstore #7
    //   198: dload #7
    //   200: aload_0
    //   201: getfield Zj : D
    //   204: dcmpg
    //   205: ifgt -> 347
    //   208: iload_2
    //   209: aload_0
    //   210: getfield ZU : I
    //   213: iadd
    //   214: dload #7
    //   216: aload_0
    //   217: getfield Zf : D
    //   220: dsub
    //   221: aload_0
    //   222: getfield ZM : D
    //   225: dmul
    //   226: aload_0
    //   227: getfield ZH : [[I
    //   230: iload #5
    //   232: aaload
    //   233: iconst_0
    //   234: iaload
    //   235: i2d
    //   236: ldc2_w 2.0
    //   239: ddiv
    //   240: dsub
    //   241: d2i
    //   242: iadd
    //   243: istore #9
    //   245: aload_0
    //   246: getfield ZZ : Ljava/lang/Object;
    //   249: instanceof java/util/ArrayList
    //   252: ifeq -> 293
    //   255: aload_1
    //   256: aload_0
    //   257: getfield ZZ : Ljava/lang/Object;
    //   260: checkcast java/util/ArrayList
    //   263: iload #5
    //   265: invokevirtual get : (I)Ljava/lang/Object;
    //   268: checkcast java/lang/String
    //   271: iload #9
    //   273: iload #6
    //   275: aload_0
    //   276: getfield ZH : [[I
    //   279: iload #5
    //   281: aaload
    //   282: iconst_1
    //   283: iaload
    //   284: iadd
    //   285: invokevirtual drawString : (Ljava/lang/String;II)V
    //   288: aload #4
    //   290: ifnonnull -> 330
    //   293: aload_0
    //   294: getfield ZZ : Ljava/lang/Object;
    //   297: instanceof burp/Zvd
    //   300: ifeq -> 330
    //   303: aload_0
    //   304: getfield ZZ : Ljava/lang/Object;
    //   307: checkcast burp/Zvd
    //   310: aload_1
    //   311: iload #9
    //   313: iload #6
    //   315: aload_0
    //   316: getfield ZH : [[I
    //   319: iload #5
    //   321: aaload
    //   322: iconst_1
    //   323: iaload
    //   324: iadd
    //   325: invokeinterface ZJ : (Ljava/awt/Graphics2D;II)V
    //   330: iinc #5, 1
    //   333: dload #7
    //   335: aload_0
    //   336: getfield Zl : D
    //   339: dadd
    //   340: dstore #7
    //   342: aload #4
    //   344: ifnonnull -> 198
    //   347: iload_2
    //   348: aload_0
    //   349: getfield Zx : I
    //   352: aload_0
    //   353: getfield ZN : [I
    //   356: iconst_0
    //   357: iaload
    //   358: isub
    //   359: iconst_2
    //   360: idiv
    //   361: iadd
    //   362: istore #7
    //   364: iload #6
    //   366: aload_0
    //   367: getfield Zd : I
    //   370: iadd
    //   371: bipush #15
    //   373: iadd
    //   374: aload_0
    //   375: getfield ZN : [I
    //   378: iconst_1
    //   379: iaload
    //   380: iadd
    //   381: istore #8
    //   383: aload_0
    //   384: getfield ZY : Ljava/lang/Object;
    //   387: instanceof java/lang/String
    //   390: ifeq -> 423
    //   393: aload_1
    //   394: getstatic burp/Zt00.BOLD_FONT : Lburp/Zt00;
    //   397: invokevirtual ZV : ()Ljava/awt/Font;
    //   400: invokevirtual setFont : (Ljava/awt/Font;)V
    //   403: aload_1
    //   404: aload_0
    //   405: getfield ZY : Ljava/lang/Object;
    //   408: checkcast java/lang/String
    //   411: iload #7
    //   413: iload #8
    //   415: invokevirtual drawString : (Ljava/lang/String;II)V
    //   418: aload #4
    //   420: ifnonnull -> 450
    //   423: aload_0
    //   424: getfield ZY : Ljava/lang/Object;
    //   427: instanceof burp/Zzji
    //   430: ifeq -> 450
    //   433: aload_0
    //   434: getfield ZY : Ljava/lang/Object;
    //   437: checkcast burp/Zzji
    //   440: aload_1
    //   441: iload #7
    //   443: iload #8
    //   445: invokeinterface ZL : (Ljava/awt/Graphics2D;II)V
    //   450: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbid.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */