package burp;

import java.awt.Graphics;
import java.awt.Graphics2D;

abstract class Zbic {
  protected double Zf;
  
  protected double Zj;
  
  protected double ZM;
  
  protected int ZU;
  
  protected int ZC;
  
  protected double ZW;
  
  protected double Zr;
  
  protected double Ze;
  
  protected double ZF;
  
  protected double Zu;
  
  protected double Zl;
  
  protected Object ZZ;
  
  protected Object ZY;
  
  protected boolean Zv;
  
  protected int Zx;
  
  protected int Zq;
  
  protected int[][] ZH;
  
  protected int[] ZN;
  
  protected Zbic(double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9, Object paramObject1, Object paramObject2) {
    this.Zf = paramDouble1;
    this.Zj = paramDouble2;
    this.ZM = paramDouble3;
    this.ZU = paramInt1;
    this.ZC = paramInt2;
    this.ZW = paramDouble4;
    this.Zr = paramDouble5;
    this.Ze = paramDouble6;
    this.ZF = paramDouble7;
    this.Zl = paramDouble9;
    this.Zu = paramDouble8;
    this.ZZ = paramObject1;
    this.ZY = paramObject2;
  }
  
  void ZC(Graphics paramGraphics) {
    // Byte code:
    //   0: invokestatic Zr : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: aload_0
    //   6: getfield ZU : I
    //   9: aload_0
    //   10: getfield Zj : D
    //   13: aload_0
    //   14: getfield Zf : D
    //   17: dsub
    //   18: aload_0
    //   19: getfield ZM : D
    //   22: dmul
    //   23: d2i
    //   24: iadd
    //   25: aload_0
    //   26: getfield ZC : I
    //   29: iadd
    //   30: putfield Zx : I
    //   33: aload_0
    //   34: getfield ZZ : Ljava/lang/Object;
    //   37: ifnonnull -> 102
    //   40: new java/util/ArrayList
    //   43: dup
    //   44: invokespecial <init> : ()V
    //   47: astore_3
    //   48: aload_0
    //   49: getfield Zu : D
    //   52: dstore #4
    //   54: dload #4
    //   56: aload_0
    //   57: getfield Zj : D
    //   60: aload_0
    //   61: getfield Zl : D
    //   64: dadd
    //   65: dcmpg
    //   66: ifgt -> 97
    //   69: aload_3
    //   70: getstatic burp/Zlb0.Zl : Ljava/text/NumberFormat;
    //   73: dload #4
    //   75: invokevirtual format : (D)Ljava/lang/String;
    //   78: invokeinterface add : (Ljava/lang/Object;)Z
    //   83: pop
    //   84: dload #4
    //   86: aload_0
    //   87: getfield Zl : D
    //   90: dadd
    //   91: dstore #4
    //   93: aload_2
    //   94: ifnonnull -> 54
    //   97: aload_0
    //   98: aload_3
    //   99: putfield ZZ : Ljava/lang/Object;
    //   102: aload_0
    //   103: getfield Zj : D
    //   106: aload_0
    //   107: getfield Zl : D
    //   110: ldc2_w 2.0
    //   113: ddiv
    //   114: dadd
    //   115: aload_0
    //   116: getfield Zu : D
    //   119: dsub
    //   120: aload_0
    //   121: getfield Zl : D
    //   124: ddiv
    //   125: invokestatic ceil : (D)D
    //   128: d2i
    //   129: istore_3
    //   130: aload_0
    //   131: iload_3
    //   132: iconst_2
    //   133: multianewarray[[I 2
    //   137: putfield ZH : [[I
    //   140: aload_0
    //   141: getfield ZZ : Ljava/lang/Object;
    //   144: instanceof java/util/ArrayList
    //   147: ifeq -> 258
    //   150: aload_1
    //   151: invokevirtual getFontMetrics : ()Ljava/awt/FontMetrics;
    //   154: astore #4
    //   156: iconst_0
    //   157: istore #5
    //   159: iload #5
    //   161: iload_3
    //   162: if_icmpge -> 254
    //   165: iload #5
    //   167: aload_0
    //   168: getfield ZZ : Ljava/lang/Object;
    //   171: checkcast java/util/ArrayList
    //   174: invokevirtual size : ()I
    //   177: if_icmplt -> 183
    //   180: goto -> 254
    //   183: aload_0
    //   184: getfield ZH : [[I
    //   187: iload #5
    //   189: aaload
    //   190: iconst_0
    //   191: aload #4
    //   193: aload_0
    //   194: getfield ZZ : Ljava/lang/Object;
    //   197: checkcast java/util/ArrayList
    //   200: iload #5
    //   202: invokevirtual get : (I)Ljava/lang/Object;
    //   205: checkcast java/lang/String
    //   208: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   211: iastore
    //   212: aload_0
    //   213: getfield ZH : [[I
    //   216: iload #5
    //   218: aaload
    //   219: iconst_1
    //   220: aload #4
    //   222: aload_0
    //   223: getfield ZZ : Ljava/lang/Object;
    //   226: checkcast java/util/ArrayList
    //   229: iload #5
    //   231: invokevirtual get : (I)Ljava/lang/Object;
    //   234: checkcast java/lang/String
    //   237: aload_1
    //   238: invokevirtual getStringBounds : (Ljava/lang/String;Ljava/awt/Graphics;)Ljava/awt/geom/Rectangle2D;
    //   241: invokevirtual getMinY : ()D
    //   244: d2i
    //   245: ineg
    //   246: iastore
    //   247: iinc #5, 1
    //   250: aload_2
    //   251: ifnonnull -> 159
    //   254: aload_2
    //   255: ifnonnull -> 369
    //   258: aload_0
    //   259: getfield ZZ : Ljava/lang/Object;
    //   262: instanceof burp/Zvd
    //   265: ifeq -> 352
    //   268: aload_0
    //   269: getfield ZZ : Ljava/lang/Object;
    //   272: checkcast burp/Zvd
    //   275: astore #4
    //   277: iconst_0
    //   278: istore #5
    //   280: aload_0
    //   281: getfield Zu : D
    //   284: dstore #6
    //   286: dload #6
    //   288: aload_0
    //   289: getfield Zj : D
    //   292: dcmpg
    //   293: ifgt -> 348
    //   296: aload_0
    //   297: getfield ZH : [[I
    //   300: iload #5
    //   302: aaload
    //   303: iconst_0
    //   304: aload #4
    //   306: dload #6
    //   308: invokeinterface ZZ : (D)I
    //   313: iastore
    //   314: aload_0
    //   315: getfield ZH : [[I
    //   318: iload #5
    //   320: aaload
    //   321: iconst_1
    //   322: aload #4
    //   324: dload #6
    //   326: invokeinterface ZM : (D)I
    //   331: iastore
    //   332: iinc #5, 1
    //   335: dload #6
    //   337: aload_0
    //   338: getfield Zl : D
    //   341: dadd
    //   342: dstore #6
    //   344: aload_2
    //   345: ifnonnull -> 286
    //   348: aload_2
    //   349: ifnonnull -> 369
    //   352: iconst_0
    //   353: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   356: aload_0
    //   357: getfield ZZ : Ljava/lang/Object;
    //   360: invokevirtual getClass : ()Ljava/lang/Class;
    //   363: invokevirtual toString : ()Ljava/lang/String;
    //   366: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   369: aload_0
    //   370: iconst_2
    //   371: newarray int
    //   373: putfield ZN : [I
    //   376: aload_0
    //   377: getfield ZY : Ljava/lang/Object;
    //   380: ifnonnull -> 401
    //   383: aload_0
    //   384: getfield ZN : [I
    //   387: iconst_0
    //   388: iconst_0
    //   389: iastore
    //   390: aload_0
    //   391: getfield ZN : [I
    //   394: iconst_1
    //   395: iconst_0
    //   396: iastore
    //   397: aload_2
    //   398: ifnonnull -> 536
    //   401: aload_0
    //   402: getfield ZY : Ljava/lang/Object;
    //   405: instanceof java/lang/String
    //   408: ifeq -> 469
    //   411: aload_1
    //   412: getstatic burp/Zt00.BOLD_FONT : Lburp/Zt00;
    //   415: invokevirtual ZV : ()Ljava/awt/Font;
    //   418: invokevirtual getFontMetrics : (Ljava/awt/Font;)Ljava/awt/FontMetrics;
    //   421: astore #4
    //   423: aload_0
    //   424: getfield ZN : [I
    //   427: iconst_0
    //   428: aload #4
    //   430: aload_0
    //   431: getfield ZY : Ljava/lang/Object;
    //   434: checkcast java/lang/String
    //   437: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   440: iastore
    //   441: aload_0
    //   442: getfield ZN : [I
    //   445: iconst_1
    //   446: aload #4
    //   448: aload_0
    //   449: getfield ZY : Ljava/lang/Object;
    //   452: checkcast java/lang/String
    //   455: aload_1
    //   456: invokevirtual getStringBounds : (Ljava/lang/String;Ljava/awt/Graphics;)Ljava/awt/geom/Rectangle2D;
    //   459: invokevirtual getMinY : ()D
    //   462: d2i
    //   463: ineg
    //   464: iastore
    //   465: aload_2
    //   466: ifnonnull -> 536
    //   469: aload_0
    //   470: getfield ZY : Ljava/lang/Object;
    //   473: instanceof burp/Zzji
    //   476: ifeq -> 519
    //   479: aload_0
    //   480: getfield ZN : [I
    //   483: iconst_0
    //   484: aload_0
    //   485: getfield ZY : Ljava/lang/Object;
    //   488: checkcast burp/Zzji
    //   491: invokeinterface ZZ : ()I
    //   496: iastore
    //   497: aload_0
    //   498: getfield ZN : [I
    //   501: iconst_1
    //   502: aload_0
    //   503: getfield ZY : Ljava/lang/Object;
    //   506: checkcast burp/Zzji
    //   509: invokeinterface ZU : ()I
    //   514: iastore
    //   515: aload_2
    //   516: ifnonnull -> 536
    //   519: iconst_0
    //   520: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   523: aload_0
    //   524: getfield ZY : Ljava/lang/Object;
    //   527: invokevirtual getClass : ()Ljava/lang/Class;
    //   530: invokevirtual toString : ()Ljava/lang/String;
    //   533: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   536: return
  }
  
  abstract int Ze();
  
  abstract int Zv();
  
  abstract void ZH(Graphics2D paramGraphics2D, int paramInt1, int paramInt2);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbic.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */