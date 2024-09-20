package burp;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Zbcc extends Zbck {
  private static final int Zl;
  
  private boolean Zi;
  
  private Zznt Zg;
  
  private int ZX;
  
  private int ZE;
  
  private int ZK;
  
  private int ZM;
  
  private int Zm;
  
  private int ZC;
  
  private double ZW;
  
  private double Zb;
  
  private double Zy;
  
  private int ZG;
  
  private double Zr;
  
  private double Zj;
  
  private List<Zs8p> Z_;
  
  public Zbcc(boolean paramBoolean, int[] paramArrayOfint, Zznt paramZznt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, Object paramObject1, Object paramObject2, double paramDouble7, double paramDouble8, double paramDouble9, int paramInt7, int paramInt8, double paramDouble10, double paramDouble11, double paramDouble12, double paramDouble13, double paramDouble14, double paramDouble15, Object paramObject3, Object paramObject4, double paramDouble16, double paramDouble17) {
    this.Zi = paramBoolean;
    this.ZD = paramArrayOfint;
    this.Zg = paramZznt;
    this.ZX = paramInt1;
    this.Zr = paramDouble16;
    this.Zj = paramDouble17;
    this.Z_ = new ArrayList<>();
    this.ZE = paramInt2;
    this.ZK = paramInt3;
    this.ZM = paramInt4;
    this.Zm = paramInt5;
    Zbqc[] arrayOfZbqc = Zbck.Zr();
    this.ZC = paramInt6;
    this.ZW = paramDouble7;
    this.Zb = paramDouble8;
    this.Zy = paramDouble9;
    this.ZG = paramInt7;
    this.ZJ = paramBoolean ? new Zbid(paramDouble7, paramDouble8, paramDouble9, paramInt7, paramInt8, paramDouble10, paramDouble11, paramDouble12, paramDouble13, paramDouble14, paramDouble15, paramObject3, paramObject4) : new Zbid(paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramObject1, paramObject2);
    this.Zo = paramBoolean ? new Zbig(paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramObject1, paramObject2) : new Zbig(paramDouble7, paramDouble8, paramDouble9, paramInt7, paramInt8, paramDouble10, paramDouble11, paramDouble12, paramDouble13, paramDouble14, paramDouble15, paramObject3, paramObject4);
    this.Zs = paramArrayOfint[0] + paramArrayOfint[2] + (int)(paramBoolean ? (paramInt5 + paramInt6 + paramInt4 * (paramInt3 - paramInt2) + ((paramObject4 != null) ? 16 : 0)) : ((paramInt7 + paramInt8) + paramDouble9 * (paramDouble8 - paramDouble7) + ((paramObject2 != null) ? 16 : false))) + 5 + 5 + 5 + 15 + 20;
    this.ZS = paramArrayOfint[1] + paramArrayOfint[3] + (int)(paramBoolean ? ((paramInt7 + paramInt8) + paramDouble9 * (paramDouble8 - paramDouble7) + ((paramObject2 instanceof String) ? (4 * ((String)paramObject2).length()) : false)) : (paramInt5 + paramInt6 + paramInt4 * (paramInt3 - paramInt2) + ((paramObject4 instanceof String) ? (4 * ((String)paramObject4).length()) : 0))) + 5 + 5 + 5 + 15 + 50 + Zl;
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  void ZO(Graphics2D paramGraphics2D, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zr : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield ZE : I
    //   9: istore #5
    //   11: iload #5
    //   13: aload_0
    //   14: getfield ZK : I
    //   17: if_icmpgt -> 276
    //   20: aload_0
    //   21: getfield Zg : Lburp/Zznt;
    //   24: iload #5
    //   26: invokeinterface Zj : (I)Lburp/Zeh4;
    //   31: astore #6
    //   33: aload #6
    //   35: getfield Ze : D
    //   38: aload_0
    //   39: getfield ZW : D
    //   42: dcmpg
    //   43: iflt -> 59
    //   46: aload #6
    //   48: getfield Ze : D
    //   51: aload_0
    //   52: getfield Zb : D
    //   55: dcmpl
    //   56: ifle -> 84
    //   59: iconst_0
    //   60: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   63: aload #6
    //   65: getfield Ze : D
    //   68: aload_0
    //   69: getfield ZW : D
    //   72: aload_0
    //   73: getfield Zb : D
    //   76: invokestatic Zw : (ZLnet/portswigger/Zqf;DDD)V
    //   79: aload #4
    //   81: ifnonnull -> 268
    //   84: aload_1
    //   85: aload #6
    //   87: getfield ZH : Ljava/awt/Color;
    //   90: invokevirtual setColor : (Ljava/awt/Color;)V
    //   93: aload_0
    //   94: getfield Zi : Z
    //   97: ifeq -> 185
    //   100: aload_1
    //   101: new java/awt/Rectangle
    //   104: dup
    //   105: iload_2
    //   106: iconst_1
    //   107: iadd
    //   108: ldc2_w 0.5
    //   111: iload_3
    //   112: i2d
    //   113: dadd
    //   114: aload_0
    //   115: getfield Zm : I
    //   118: i2d
    //   119: dsub
    //   120: iload #5
    //   122: aload_0
    //   123: getfield ZE : I
    //   126: isub
    //   127: aload_0
    //   128: getfield ZM : I
    //   131: imul
    //   132: i2d
    //   133: dsub
    //   134: aload_0
    //   135: getfield ZX : I
    //   138: iconst_2
    //   139: idiv
    //   140: i2d
    //   141: dsub
    //   142: invokestatic round : (D)J
    //   145: l2i
    //   146: aload_0
    //   147: getfield ZG : I
    //   150: i2d
    //   151: aload #6
    //   153: getfield Ze : D
    //   156: aload_0
    //   157: getfield ZW : D
    //   160: dsub
    //   161: aload_0
    //   162: getfield Zy : D
    //   165: dmul
    //   166: dadd
    //   167: dconst_1
    //   168: dsub
    //   169: d2i
    //   170: aload_0
    //   171: getfield ZX : I
    //   174: invokespecial <init> : (IIII)V
    //   177: invokevirtual fill : (Ljava/awt/Shape;)V
    //   180: aload #4
    //   182: ifnonnull -> 268
    //   185: aload_0
    //   186: getfield ZG : I
    //   189: i2d
    //   190: aload #6
    //   192: getfield Ze : D
    //   195: aload_0
    //   196: getfield ZW : D
    //   199: dsub
    //   200: aload_0
    //   201: getfield Zy : D
    //   204: dmul
    //   205: dadd
    //   206: d2i
    //   207: istore #7
    //   209: aload_1
    //   210: new java/awt/Rectangle
    //   213: dup
    //   214: ldc2_w 0.5
    //   217: iload_2
    //   218: i2d
    //   219: dadd
    //   220: aload_0
    //   221: getfield Zm : I
    //   224: i2d
    //   225: dadd
    //   226: iload #5
    //   228: aload_0
    //   229: getfield ZE : I
    //   232: isub
    //   233: aload_0
    //   234: getfield ZM : I
    //   237: imul
    //   238: i2d
    //   239: dadd
    //   240: aload_0
    //   241: getfield ZX : I
    //   244: iconst_2
    //   245: idiv
    //   246: i2d
    //   247: dsub
    //   248: invokestatic round : (D)J
    //   251: l2i
    //   252: iload_3
    //   253: iload #7
    //   255: isub
    //   256: aload_0
    //   257: getfield ZX : I
    //   260: iload #7
    //   262: invokespecial <init> : (IIII)V
    //   265: invokevirtual fill : (Ljava/awt/Shape;)V
    //   268: iinc #5, 1
    //   271: aload #4
    //   273: ifnonnull -> 11
    //   276: return
  }
  
  void Zp(Graphics2D paramGraphics2D, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zr : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: getstatic java/awt/Color.LIGHT_GRAY : Ljava/awt/Color;
    //   9: invokevirtual setColor : (Ljava/awt/Color;)V
    //   12: aload_0
    //   13: getfield Zi : Z
    //   16: ifeq -> 298
    //   19: aload_0
    //   20: getfield Zr : D
    //   23: dstore #5
    //   25: dload #5
    //   27: aload_0
    //   28: getfield Zb : D
    //   31: dcmpg
    //   32: ifgt -> 130
    //   35: dload #5
    //   37: aload_0
    //   38: getfield ZW : D
    //   41: dcmpl
    //   42: ifne -> 55
    //   45: aload_0
    //   46: getfield ZG : I
    //   49: ifne -> 55
    //   52: goto -> 116
    //   55: iload_2
    //   56: aload_0
    //   57: getfield ZG : I
    //   60: iadd
    //   61: i2d
    //   62: dload #5
    //   64: aload_0
    //   65: getfield ZW : D
    //   68: dsub
    //   69: aload_0
    //   70: getfield Zy : D
    //   73: dmul
    //   74: dadd
    //   75: invokestatic round : (D)J
    //   78: l2i
    //   79: istore #7
    //   81: aload_1
    //   82: iload #7
    //   84: iload_3
    //   85: iload #7
    //   87: iload_3
    //   88: aload_0
    //   89: getfield Zm : I
    //   92: isub
    //   93: aload_0
    //   94: getfield ZK : I
    //   97: aload_0
    //   98: getfield ZE : I
    //   101: isub
    //   102: aload_0
    //   103: getfield ZM : I
    //   106: imul
    //   107: isub
    //   108: aload_0
    //   109: getfield ZC : I
    //   112: isub
    //   113: invokevirtual drawLine : (IIII)V
    //   116: dload #5
    //   118: aload_0
    //   119: getfield Zj : D
    //   122: dadd
    //   123: dstore #5
    //   125: aload #4
    //   127: ifnonnull -> 25
    //   130: aload_0
    //   131: getfield Z_ : Ljava/util/List;
    //   134: invokeinterface iterator : ()Ljava/util/Iterator;
    //   139: astore #5
    //   141: aload #5
    //   143: invokeinterface hasNext : ()Z
    //   148: ifeq -> 293
    //   151: aload #5
    //   153: invokeinterface next : ()Ljava/lang/Object;
    //   158: checkcast burp/Zs8p
    //   161: astore #6
    //   163: iload_2
    //   164: aload_0
    //   165: getfield ZG : I
    //   168: iadd
    //   169: i2d
    //   170: aload #6
    //   172: getfield ZH : D
    //   175: aload_0
    //   176: getfield ZW : D
    //   179: dsub
    //   180: aload_0
    //   181: getfield Zy : D
    //   184: dmul
    //   185: dadd
    //   186: invokestatic round : (D)J
    //   189: l2i
    //   190: istore #7
    //   192: iload_3
    //   193: aload_0
    //   194: getfield Zm : I
    //   197: isub
    //   198: aload_0
    //   199: getfield ZK : I
    //   202: aload_0
    //   203: getfield ZE : I
    //   206: isub
    //   207: aload_0
    //   208: getfield ZM : I
    //   211: imul
    //   212: isub
    //   213: aload_0
    //   214: getfield ZC : I
    //   217: isub
    //   218: bipush #20
    //   220: isub
    //   221: istore #8
    //   223: aload_1
    //   224: aload #6
    //   226: getfield Zb : Ljava/awt/Color;
    //   229: invokevirtual setColor : (Ljava/awt/Color;)V
    //   232: aload_1
    //   233: iload #7
    //   235: iload_3
    //   236: iload #7
    //   238: iload #8
    //   240: invokevirtual drawLine : (IIII)V
    //   243: iload #7
    //   245: aload_1
    //   246: invokevirtual getFontMetrics : ()Ljava/awt/FontMetrics;
    //   249: aload #6
    //   251: getfield ZN : Ljava/lang/String;
    //   254: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   257: iconst_2
    //   258: idiv
    //   259: isub
    //   260: istore #9
    //   262: aload_1
    //   263: getstatic burp/Zt00.DEFAULT_FONT : Lburp/Zt00;
    //   266: invokevirtual ZV : ()Ljava/awt/Font;
    //   269: invokevirtual setFont : (Ljava/awt/Font;)V
    //   272: aload_1
    //   273: aload #6
    //   275: getfield ZN : Ljava/lang/String;
    //   278: iload #9
    //   280: iload #8
    //   282: bipush #10
    //   284: isub
    //   285: invokevirtual drawString : (Ljava/lang/String;II)V
    //   288: aload #4
    //   290: ifnonnull -> 141
    //   293: aload #4
    //   295: ifnonnull -> 581
    //   298: aload_0
    //   299: getfield Zr : D
    //   302: dstore #5
    //   304: dload #5
    //   306: aload_0
    //   307: getfield Zb : D
    //   310: dcmpg
    //   311: ifgt -> 409
    //   314: dload #5
    //   316: aload_0
    //   317: getfield ZW : D
    //   320: dcmpl
    //   321: ifne -> 334
    //   324: aload_0
    //   325: getfield ZG : I
    //   328: ifne -> 334
    //   331: goto -> 395
    //   334: iload_3
    //   335: aload_0
    //   336: getfield ZG : I
    //   339: isub
    //   340: i2d
    //   341: dload #5
    //   343: aload_0
    //   344: getfield ZW : D
    //   347: dsub
    //   348: aload_0
    //   349: getfield Zy : D
    //   352: dmul
    //   353: dsub
    //   354: invokestatic round : (D)J
    //   357: l2i
    //   358: istore #7
    //   360: aload_1
    //   361: iload_2
    //   362: iload #7
    //   364: iload_2
    //   365: aload_0
    //   366: getfield Zm : I
    //   369: iadd
    //   370: aload_0
    //   371: getfield ZK : I
    //   374: aload_0
    //   375: getfield ZE : I
    //   378: isub
    //   379: aload_0
    //   380: getfield ZM : I
    //   383: imul
    //   384: iadd
    //   385: aload_0
    //   386: getfield ZC : I
    //   389: iadd
    //   390: iload #7
    //   392: invokevirtual drawLine : (IIII)V
    //   395: dload #5
    //   397: aload_0
    //   398: getfield Zj : D
    //   401: dadd
    //   402: dstore #5
    //   404: aload #4
    //   406: ifnonnull -> 304
    //   409: aload_0
    //   410: getfield Z_ : Ljava/util/List;
    //   413: invokeinterface iterator : ()Ljava/util/Iterator;
    //   418: astore #5
    //   420: aload #5
    //   422: invokeinterface hasNext : ()Z
    //   427: ifeq -> 581
    //   430: aload #5
    //   432: invokeinterface next : ()Ljava/lang/Object;
    //   437: checkcast burp/Zs8p
    //   440: astore #6
    //   442: iload_3
    //   443: aload_0
    //   444: getfield ZG : I
    //   447: isub
    //   448: i2d
    //   449: aload #6
    //   451: getfield ZH : D
    //   454: aload_0
    //   455: getfield ZW : D
    //   458: dsub
    //   459: aload_0
    //   460: getfield Zy : D
    //   463: dmul
    //   464: dsub
    //   465: invokestatic round : (D)J
    //   468: l2i
    //   469: istore #7
    //   471: iload_2
    //   472: aload_0
    //   473: getfield Zm : I
    //   476: iadd
    //   477: aload_0
    //   478: getfield ZK : I
    //   481: aload_0
    //   482: getfield ZE : I
    //   485: isub
    //   486: aload_0
    //   487: getfield ZM : I
    //   490: imul
    //   491: iadd
    //   492: aload_0
    //   493: getfield ZC : I
    //   496: iadd
    //   497: bipush #20
    //   499: iadd
    //   500: istore #8
    //   502: aload_1
    //   503: aload #6
    //   505: getfield Zb : Ljava/awt/Color;
    //   508: invokevirtual setColor : (Ljava/awt/Color;)V
    //   511: aload_1
    //   512: iload_2
    //   513: iload #7
    //   515: iload #8
    //   517: iload #7
    //   519: invokevirtual drawLine : (IIII)V
    //   522: iload #7
    //   524: aload_1
    //   525: invokevirtual getFontMetrics : ()Ljava/awt/FontMetrics;
    //   528: aload #6
    //   530: getfield ZN : Ljava/lang/String;
    //   533: aload_1
    //   534: invokevirtual getStringBounds : (Ljava/lang/String;Ljava/awt/Graphics;)Ljava/awt/geom/Rectangle2D;
    //   537: invokevirtual getMinY : ()D
    //   540: ldc2_w 2.0
    //   543: ddiv
    //   544: d2i
    //   545: isub
    //   546: iconst_1
    //   547: isub
    //   548: istore #9
    //   550: aload_1
    //   551: getstatic burp/Zt00.DEFAULT_FONT : Lburp/Zt00;
    //   554: invokevirtual ZV : ()Ljava/awt/Font;
    //   557: invokevirtual setFont : (Ljava/awt/Font;)V
    //   560: aload_1
    //   561: aload #6
    //   563: getfield ZN : Ljava/lang/String;
    //   566: iload #8
    //   568: bipush #10
    //   570: iadd
    //   571: iload #9
    //   573: invokevirtual drawString : (Ljava/lang/String;II)V
    //   576: aload #4
    //   578: ifnonnull -> 420
    //   581: return
  }
  
  int Zv(Graphics2D paramGraphics2D) {
    return (this.Z_.size() > 0) ? Zl : 0;
  }
  
  public void ZF(double paramDouble, Color paramColor, String paramString) {
    this.Z_.add(new Zs8p(this, paramDouble, paramColor, paramString));
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: ldc 'Dp5A2iDp5A2iDp5A2iDp5A2iDp'
    //   3: iconst_m1
    //   4: goto -> 11
    //   7: astore_0
    //   8: goto -> 150
    //   11: dup_x2
    //   12: pop
    //   13: invokevirtual toCharArray : ()[C
    //   16: dup_x1
    //   17: arraylength
    //   18: dup_x2
    //   19: pop
    //   20: iconst_0
    //   21: istore_1
    //   22: dup2_x1
    //   23: pop2
    //   24: dup_x2
    //   25: iconst_1
    //   26: if_icmpgt -> 124
    //   29: dup2
    //   30: swap
    //   31: iload_1
    //   32: dup2_x1
    //   33: caload
    //   34: swap
    //   35: iload_1
    //   36: bipush #7
    //   38: irem
    //   39: tableswitch default -> 106, 0 -> 76, 1 -> 81, 2 -> 86, 3 -> 91, 4 -> 96, 5 -> 101
    //   76: bipush #62
    //   78: goto -> 108
    //   81: bipush #10
    //   83: goto -> 108
    //   86: bipush #79
    //   88: goto -> 108
    //   91: bipush #121
    //   93: goto -> 108
    //   96: bipush #59
    //   98: goto -> 108
    //   101: bipush #72
    //   103: goto -> 108
    //   106: bipush #19
    //   108: ixor
    //   109: ixor
    //   110: i2c
    //   111: castore
    //   112: iinc #1, 1
    //   115: dup
    //   116: ifne -> 124
    //   119: dup2
    //   120: dup_x1
    //   121: goto -> 32
    //   124: dup2_x1
    //   125: pop2
    //   126: dup_x2
    //   127: iload_1
    //   128: if_icmpgt -> 29
    //   131: pop
    //   132: new java/lang/String
    //   135: dup_x1
    //   136: swap
    //   137: invokespecial <init> : ([C)V
    //   140: invokevirtual intern : ()Ljava/lang/String;
    //   143: swap
    //   144: pop
    //   145: swap
    //   146: pop
    //   147: goto -> 7
    //   150: new burp/Zm99
    //   153: dup
    //   154: aload_0
    //   155: invokespecial <init> : (Ljava/lang/String;)V
    //   158: invokevirtual getPreferredSize : ()Ljava/awt/Dimension;
    //   161: getfield width : I
    //   164: putstatic burp/Zbcc.Zl : I
    //   167: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbcc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */