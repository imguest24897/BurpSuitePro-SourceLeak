package net.portswigger;

import burp.Zbqc;
import java.util.Arrays;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Stack;

public class Z_z implements Zz6 {
  private final Stack<Zrm4> ZJ = new Stack<>();
  
  private int Zm;
  
  final Ze7 Zx;
  
  private static final Ze7 ZB;
  
  private static final Ze7 ZP;
  
  private CharSequence ZH;
  
  private String ZM;
  
  private int[] Zn;
  
  private int ZK;
  
  private int Zr;
  
  private int Zj;
  
  private BitSet Zv;
  
  private BitSet Zz;
  
  private Ze7[] ZD;
  
  private BitSet ZV;
  
  private BitSet Zg;
  
  EnumSet<Zkd> ZU;
  
  static final EnumSet<Zkd> Zp;
  
  static final EnumSet<Zkd> Zs;
  
  static final EnumSet<Zkd> ZE;
  
  private static final EnumSet<Zkd> ZZ;
  
  Zrm4 ZA;
  
  private static final String[] a;
  
  private static final String[] b;
  
  void Zy(Zrm4 paramZrm4) {
    ZL(paramZrm4);
    this.ZJ.add(paramZrm4);
  }
  
  void Zj() {
    this.ZJ.pop();
    ZL(this.ZJ.peek());
  }
  
  void Zq() {
    boolean bool = Ze7.ZN();
    while (!ZP(this.ZJ.peek())) {
      Zj();
      if (!bool)
        break; 
    } 
  }
  
  boolean ZP(Zrm4 paramZrm4) {
    return (paramZrm4 == Zrm4.DEFAULT || paramZrm4 == Zrm4.ActiveCheck || paramZrm4 == Zrm4.PassiveCheck || paramZrm4 == Zrm4.InsertionPointCheck);
  }
  
  public String ZO() {
    return this.ZM;
  }
  
  public Z_z(String paramString, CharSequence paramCharSequence) {
    this(paramString, paramCharSequence, Zrm4.DEFAULT, 1, 1);
  }
  
  public Z_z(String paramString, CharSequence paramCharSequence, Zrm4 paramZrm4, int paramInt1, int paramInt2) {
    this.ZJ.add(Zrm4.DEFAULT);
    this.Zm = 1;
    this.Zx = new Ze7();
    this.ZM = a(18310, -21544);
    this.Zz = new BitSet();
    boolean bool = Ze7.ZN();
    this.ZV = new BitSet(295);
    this.Zg = new BitSet(295);
    this.ZU = EnumSet.allOf(Zkd.class);
    this.ZA = Zrm4.values()[0];
    this.ZM = paramString;
    this.ZH = ZI(paramCharSequence, true, true, false, false);
    this.ZM = paramString;
    Zs();
    this.ZD = new Ze7[this.ZH.length() + 1];
    this.Zv = new BitSet(this.ZH.length() + 1);
    this.ZK = paramInt1;
    this.Zr = paramInt2;
    ZL(paramZrm4);
    if (Zbqc.Zwu() == null)
      Ze7.ZA(!bool); 
  }
  
  private Ze7 Zm() {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: invokestatic ZN : ()Z
    //   5: aload_0
    //   6: invokevirtual ZI : ()Lnet/portswigger/Ze7;
    //   9: astore_3
    //   10: istore_1
    //   11: aload_3
    //   12: instanceof net/portswigger/Zpv
    //   15: ifeq -> 48
    //   18: aload_2
    //   19: ifnonnull -> 31
    //   22: aload_3
    //   23: checkcast net/portswigger/Zpv
    //   26: astore_2
    //   27: iload_1
    //   28: ifne -> 39
    //   31: aload_2
    //   32: aload_3
    //   33: invokevirtual Zu : ()I
    //   36: invokevirtual Zf : (I)V
    //   39: aload_0
    //   40: invokevirtual ZI : ()Lnet/portswigger/Ze7;
    //   43: astore_3
    //   44: iload_1
    //   45: ifne -> 11
    //   48: aload_2
    //   49: ifnull -> 57
    //   52: aload_0
    //   53: aload_2
    //   54: invokevirtual ZN : (Lnet/portswigger/Ze7;)V
    //   57: aload_0
    //   58: aload_3
    //   59: invokevirtual ZN : (Lnet/portswigger/Ze7;)V
    //   62: aload_2
    //   63: ifnull -> 76
    //   66: aload_0
    //   67: aload_2
    //   68: invokevirtual Zu : ()I
    //   71: invokevirtual ZV : (I)V
    //   74: aload_2
    //   75: areturn
    //   76: aload_3
    //   77: areturn
  }
  
  public Ze7 Za(Ze7 paramZe7) {
    if (paramZe7 == null)
      return Zm(); 
    Ze7 ze7 = paramZe7.ZC();
    if (ze7 != null && !this.ZU.contains(ze7.ZX())) {
      ZS(paramZe7);
      ze7 = null;
    } 
    return (ze7 != null) ? ze7 : Zs(paramZe7.Zu());
  }
  
  public Ze7 Zs(int paramInt) {
    ZV(paramInt);
    return Zm();
  }
  
  private final Ze7 ZI() {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: aload_0
    //   5: getfield Zj : I
    //   8: istore #4
    //   10: invokestatic Zy : ()Z
    //   13: iconst_0
    //   14: istore #5
    //   16: istore_1
    //   17: aload_2
    //   18: ifnonnull -> 485
    //   21: iconst_0
    //   22: istore #7
    //   24: iconst_0
    //   25: istore #8
    //   27: aconst_null
    //   28: astore #9
    //   30: iconst_0
    //   31: istore #10
    //   33: iload_3
    //   34: ifeq -> 56
    //   37: aload_0
    //   38: invokevirtual Zt : ()I
    //   41: istore #6
    //   43: iload #6
    //   45: iconst_m1
    //   46: if_icmpne -> 85
    //   49: iconst_1
    //   50: istore #10
    //   52: iload_1
    //   53: ifeq -> 85
    //   56: aload_0
    //   57: getfield Zj : I
    //   60: istore #4
    //   62: aload_0
    //   63: invokevirtual Zt : ()I
    //   66: dup
    //   67: istore #6
    //   69: istore #5
    //   71: iload #6
    //   73: iconst_m1
    //   74: if_icmpne -> 85
    //   77: getstatic net/portswigger/Zkd.EOF : Lnet/portswigger/Zkd;
    //   80: astore #9
    //   82: iconst_1
    //   83: istore #10
    //   85: aload_0
    //   86: getfield ZA : Lnet/portswigger/Zrm4;
    //   89: invokestatic Za : (Lnet/portswigger/Zrm4;)[Lnet/portswigger/Zch;
    //   92: astore #11
    //   94: iload #10
    //   96: ifne -> 301
    //   99: aconst_null
    //   100: astore #12
    //   102: iload #7
    //   104: ifle -> 153
    //   107: aload_0
    //   108: getfield Zg : Ljava/util/BitSet;
    //   111: astore #13
    //   113: aload_0
    //   114: aload_0
    //   115: getfield ZV : Ljava/util/BitSet;
    //   118: putfield Zg : Ljava/util/BitSet;
    //   121: aload_0
    //   122: aload #13
    //   124: putfield ZV : Ljava/util/BitSet;
    //   127: aload_0
    //   128: invokevirtual Zt : ()I
    //   131: istore #14
    //   133: iload #14
    //   135: iflt -> 146
    //   138: iload #14
    //   140: istore #6
    //   142: iload_1
    //   143: ifeq -> 153
    //   146: iconst_1
    //   147: istore #10
    //   149: iload_1
    //   150: ifeq -> 301
    //   153: aload_0
    //   154: getfield ZV : Ljava/util/BitSet;
    //   157: invokevirtual clear : ()V
    //   160: iload #7
    //   162: ifne -> 169
    //   165: iconst_0
    //   166: goto -> 177
    //   169: aload_0
    //   170: getfield Zg : Ljava/util/BitSet;
    //   173: iconst_0
    //   174: invokevirtual nextSetBit : (I)I
    //   177: istore #13
    //   179: aload #11
    //   181: iload #13
    //   183: aaload
    //   184: iload #6
    //   186: aload_0
    //   187: getfield ZV : Ljava/util/BitSet;
    //   190: aload_0
    //   191: getfield ZU : Ljava/util/EnumSet;
    //   194: invokeinterface Ze : (ILjava/util/BitSet;Ljava/util/EnumSet;)Lnet/portswigger/Zkd;
    //   199: astore #14
    //   201: aload #14
    //   203: ifnull -> 228
    //   206: aload #12
    //   208: ifnull -> 224
    //   211: aload #14
    //   213: invokevirtual ordinal : ()I
    //   216: aload #12
    //   218: invokevirtual ordinal : ()I
    //   221: if_icmpge -> 228
    //   224: aload #14
    //   226: astore #12
    //   228: iload #7
    //   230: ifne -> 237
    //   233: iconst_m1
    //   234: goto -> 248
    //   237: aload_0
    //   238: getfield Zg : Ljava/util/BitSet;
    //   241: iload #13
    //   243: iconst_1
    //   244: iadd
    //   245: invokevirtual nextSetBit : (I)I
    //   248: istore #13
    //   250: iload #13
    //   252: iconst_m1
    //   253: if_icmpne -> 179
    //   256: iinc #7, 1
    //   259: iload #6
    //   261: ldc 65535
    //   263: if_icmple -> 269
    //   266: iinc #7, 1
    //   269: aload #12
    //   271: ifnull -> 291
    //   274: aload #12
    //   276: astore #9
    //   278: getstatic net/portswigger/Z_z.ZZ : Ljava/util/EnumSet;
    //   281: aload #9
    //   283: invokevirtual contains : (Ljava/lang/Object;)Z
    //   286: istore_3
    //   287: iload #7
    //   289: istore #8
    //   291: aload_0
    //   292: getfield ZV : Ljava/util/BitSet;
    //   295: invokevirtual isEmpty : ()Z
    //   298: ifeq -> 99
    //   301: aload #9
    //   303: ifnonnull -> 346
    //   306: aload_0
    //   307: iload #4
    //   309: iconst_1
    //   310: iadd
    //   311: putfield Zj : I
    //   314: iload #5
    //   316: ldc 65535
    //   318: if_icmple -> 331
    //   321: aload_0
    //   322: dup
    //   323: getfield Zj : I
    //   326: iconst_1
    //   327: iadd
    //   328: putfield Zj : I
    //   331: new net/portswigger/Zpv
    //   334: dup
    //   335: aload_0
    //   336: iload #4
    //   338: aload_0
    //   339: getfield Zj : I
    //   342: invokespecial <init> : (Lnet/portswigger/Z_z;II)V
    //   345: areturn
    //   346: aload_0
    //   347: dup
    //   348: getfield Zj : I
    //   351: iload #7
    //   353: iload #8
    //   355: isub
    //   356: isub
    //   357: putfield Zj : I
    //   360: getstatic net/portswigger/Z_z.ZE : Ljava/util/EnumSet;
    //   363: aload #9
    //   365: invokevirtual contains : (Ljava/lang/Object;)Z
    //   368: ifeq -> 418
    //   371: iload #4
    //   373: istore #12
    //   375: iload #12
    //   377: aload_0
    //   378: getfield Zj : I
    //   381: if_icmpge -> 414
    //   384: aload_0
    //   385: getfield ZD : [Lnet/portswigger/Ze7;
    //   388: iload #12
    //   390: aaload
    //   391: getstatic net/portswigger/Z_z.ZB : Lnet/portswigger/Ze7;
    //   394: if_acmpeq -> 407
    //   397: aload_0
    //   398: getfield ZD : [Lnet/portswigger/Ze7;
    //   401: iload #12
    //   403: getstatic net/portswigger/Z_z.ZP : Lnet/portswigger/Ze7;
    //   406: aastore
    //   407: iinc #12, 1
    //   410: iload_1
    //   411: ifeq -> 375
    //   414: iload_1
    //   415: ifeq -> 473
    //   418: getstatic net/portswigger/Z_z.Zp : Ljava/util/EnumSet;
    //   421: aload #9
    //   423: invokevirtual contains : (Ljava/lang/Object;)Z
    //   426: ifne -> 440
    //   429: getstatic net/portswigger/Z_z.Zs : Ljava/util/EnumSet;
    //   432: aload #9
    //   434: invokevirtual contains : (Ljava/lang/Object;)Z
    //   437: ifeq -> 473
    //   440: aload #9
    //   442: aload_0
    //   443: iload #4
    //   445: aload_0
    //   446: getfield Zj : I
    //   449: invokestatic ZV : (Lnet/portswigger/Zkd;Lnet/portswigger/Z_z;II)Lnet/portswigger/Ze7;
    //   452: astore_2
    //   453: aload_2
    //   454: getstatic net/portswigger/Z_z.Zp : Ljava/util/EnumSet;
    //   457: aload #9
    //   459: invokevirtual contains : (Ljava/lang/Object;)Z
    //   462: ifne -> 469
    //   465: iconst_1
    //   466: goto -> 470
    //   469: iconst_0
    //   470: invokevirtual Zx : (Z)V
    //   473: aload_0
    //   474: aload_2
    //   475: aload #9
    //   477: invokevirtual Zb : (Lnet/portswigger/Ze7;Lnet/portswigger/Zkd;)Lnet/portswigger/Ze7;
    //   480: astore_2
    //   481: iload_1
    //   482: ifeq -> 17
    //   485: aload_2
    //   486: areturn
  }
  
  public boolean ZL(Zrm4 paramZrm4) {
    if (this.ZA != paramZrm4) {
      this.ZA = paramZrm4;
      return true;
    } 
    return false;
  }
  
  void ZK(Ze7 paramZe7, Zrm4 paramZrm4) {
    ZV(paramZe7.Zu());
    Zs(paramZe7);
    if (paramZrm4 != null)
      ZL(paramZrm4); 
  }
  
  void ZS(Ze7 paramZe7) {
    ZK(paramZe7, null);
  }
  
  private Ze7 Zb(Ze7 paramZe7, Zkd paramZkd) {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_3
    //   4: getstatic net/portswigger/Zrm5.ZE : [I
    //   7: aload_2
    //   8: invokevirtual ordinal : ()I
    //   11: iaload
    //   12: tableswitch default -> 210, 1 -> 80, 2 -> 91, 3 -> 102, 4 -> 113, 5 -> 124, 6 -> 135, 7 -> 146, 8 -> 157, 9 -> 165, 10 -> 173, 11 -> 184, 12 -> 192, 13 -> 203
    //   80: aload_0
    //   81: getstatic net/portswigger/Zrm4.ActiveCheck : Lnet/portswigger/Zrm4;
    //   84: invokevirtual Zy : (Lnet/portswigger/Zrm4;)V
    //   87: iload_3
    //   88: ifne -> 210
    //   91: aload_0
    //   92: getstatic net/portswigger/Zrm4.ActiveCheck : Lnet/portswigger/Zrm4;
    //   95: invokevirtual Zy : (Lnet/portswigger/Zrm4;)V
    //   98: iload_3
    //   99: ifne -> 210
    //   102: aload_0
    //   103: getstatic net/portswigger/Zrm4.PassiveCheck : Lnet/portswigger/Zrm4;
    //   106: invokevirtual Zy : (Lnet/portswigger/Zrm4;)V
    //   109: iload_3
    //   110: ifne -> 210
    //   113: aload_0
    //   114: getstatic net/portswigger/Zrm4.ActiveCheck : Lnet/portswigger/Zrm4;
    //   117: invokevirtual Zy : (Lnet/portswigger/Zrm4;)V
    //   120: iload_3
    //   121: ifne -> 210
    //   124: aload_0
    //   125: getstatic net/portswigger/Zrm4.InsertionPointCheck : Lnet/portswigger/Zrm4;
    //   128: invokevirtual Zy : (Lnet/portswigger/Zrm4;)V
    //   131: iload_3
    //   132: ifne -> 210
    //   135: aload_0
    //   136: getstatic net/portswigger/Zrm4.WithinInterpolatableString : Lnet/portswigger/Zrm4;
    //   139: invokevirtual Zy : (Lnet/portswigger/Zrm4;)V
    //   142: iload_3
    //   143: ifne -> 210
    //   146: aload_0
    //   147: getstatic net/portswigger/Zrm4.WithinLiteralString : Lnet/portswigger/Zrm4;
    //   150: invokevirtual Zy : (Lnet/portswigger/Zrm4;)V
    //   153: iload_3
    //   154: ifne -> 210
    //   157: aload_0
    //   158: invokevirtual Zj : ()V
    //   161: iload_3
    //   162: ifne -> 210
    //   165: aload_0
    //   166: invokevirtual Zj : ()V
    //   169: iload_3
    //   170: ifne -> 210
    //   173: aload_0
    //   174: getstatic net/portswigger/Zrm4.WithinVariableRef : Lnet/portswigger/Zrm4;
    //   177: invokevirtual Zy : (Lnet/portswigger/Zrm4;)V
    //   180: iload_3
    //   181: ifne -> 210
    //   184: aload_0
    //   185: invokevirtual Zj : ()V
    //   188: iload_3
    //   189: ifne -> 210
    //   192: aload_0
    //   193: getstatic net/portswigger/Zrm4.RequestNaming : Lnet/portswigger/Zrm4;
    //   196: invokevirtual Zy : (Lnet/portswigger/Zrm4;)V
    //   199: iload_3
    //   200: ifne -> 210
    //   203: aload_0
    //   204: invokevirtual Zj : ()V
    //   207: goto -> 210
    //   210: aload_1
    //   211: areturn
  }
  
  private void ZV(int paramInt) {
    boolean bool = Ze7.Zy();
    while (paramInt < this.ZH.length() && this.ZD[paramInt] == ZB) {
      paramInt++;
      if (bool)
        break; 
    } 
    this.Zj = paramInt;
  }
  
  private int Zt() {
    boolean bool = Ze7.ZN();
    while (this.ZD[this.Zj] == ZB && this.Zj < this.ZH.length()) {
      this.Zj++;
      if (!bool)
        break; 
    } 
    if (this.Zj >= this.ZH.length())
      return -1; 
    char c = this.ZH.charAt(this.Zj++);
    if (Character.isHighSurrogate(c) && this.Zj < this.ZH.length()) {
      char c1 = this.ZH.charAt(this.Zj);
      if (Character.isLowSurrogate(c1)) {
        this.Zj++;
        return Character.toCodePoint(c, c1);
      } 
    } 
    return c;
  }
  
  public int ZN(int paramInt) {
    if (paramInt >= this.ZH.length())
      return (this.ZH.charAt(this.ZH.length() - 1) == '\n') ? (this.ZK + this.Zn.length) : (this.ZK + this.Zn.length - 1); 
    int i = Arrays.binarySearch(this.Zn, paramInt);
    return (i >= 0) ? (this.ZK + i) : (this.ZK - i + 2);
  }
  
  public int ZO(int paramInt) {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: iload_1
    //   5: aload_0
    //   6: getfield ZH : Ljava/lang/CharSequence;
    //   9: invokeinterface length : ()I
    //   14: if_icmplt -> 19
    //   17: iconst_1
    //   18: ireturn
    //   19: iload_1
    //   20: ifne -> 28
    //   23: aload_0
    //   24: getfield Zr : I
    //   27: ireturn
    //   28: aload_0
    //   29: iload_1
    //   30: invokevirtual ZN : (I)I
    //   33: aload_0
    //   34: getfield ZK : I
    //   37: isub
    //   38: istore_3
    //   39: aload_0
    //   40: getfield Zn : [I
    //   43: iload_3
    //   44: iaload
    //   45: istore #4
    //   47: iload_3
    //   48: ifle -> 55
    //   51: iconst_1
    //   52: goto -> 59
    //   55: aload_0
    //   56: getfield Zr : I
    //   59: istore #5
    //   61: iload_1
    //   62: iload #4
    //   64: isub
    //   65: iload #5
    //   67: iadd
    //   68: istore #6
    //   70: aload_0
    //   71: getfield Zz : Ljava/util/BitSet;
    //   74: iload_3
    //   75: invokevirtual get : (I)Z
    //   78: ifne -> 84
    //   81: iload #6
    //   83: ireturn
    //   84: aload_0
    //   85: getfield ZH : Ljava/lang/CharSequence;
    //   88: iload_1
    //   89: invokeinterface charAt : (I)C
    //   94: invokestatic isLowSurrogate : (C)Z
    //   97: ifeq -> 103
    //   100: iinc #1, -1
    //   103: iload #5
    //   105: istore #7
    //   107: iload #4
    //   109: istore #8
    //   111: iload #8
    //   113: iload_1
    //   114: if_icmpge -> 188
    //   117: aload_0
    //   118: getfield ZH : Ljava/lang/CharSequence;
    //   121: iload #8
    //   123: invokeinterface charAt : (I)C
    //   128: istore #9
    //   130: iload #9
    //   132: bipush #9
    //   134: if_icmpne -> 160
    //   137: iload #7
    //   139: aload_0
    //   140: getfield Zm : I
    //   143: iload #7
    //   145: iconst_1
    //   146: isub
    //   147: aload_0
    //   148: getfield Zm : I
    //   151: irem
    //   152: isub
    //   153: iadd
    //   154: istore #7
    //   156: iload_2
    //   157: ifne -> 181
    //   160: iload #9
    //   162: invokestatic isHighSurrogate : (C)Z
    //   165: ifeq -> 178
    //   168: iinc #7, 1
    //   171: iinc #8, 1
    //   174: iload_2
    //   175: ifne -> 181
    //   178: iinc #7, 1
    //   181: iinc #8, 1
    //   184: iload_2
    //   185: ifne -> 111
    //   188: iload #7
    //   190: ireturn
  }
  
  public String ZH(int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool = Ze7.ZN();
    int i = paramInt1;
    while (i < paramInt2) {
      if (this.ZD[i] != ZB)
        stringBuilder.append(this.ZH.charAt(i)); 
      i++;
      if (!bool)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  void ZN(Ze7 paramZe7) {
    if (paramZe7.Zl()) {
      Ze7 ze7 = paramZe7.ZC();
      if (ze7 != null)
        ZN(ze7); 
      return;
    } 
    int i = paramZe7.Zg();
    if (this.ZD[i] != ZB) {
      this.Zv.set(i);
      this.ZD[i] = paramZe7;
    } 
  }
  
  void Zs(Ze7 paramZe7) {
    int i = paramZe7.Zu();
    if (i < this.Zv.length())
      this.Zv.clear(paramZe7.Zu(), this.Zv.length()); 
    paramZe7.ZO();
  }
  
  Ze7 ZF(int paramInt) {
    int i = this.Zv.nextSetBit(paramInt);
    return (i != -1) ? this.ZD[i] : null;
  }
  
  Ze7 Zo(int paramInt) {
    int i = this.Zv.previousSetBit(paramInt - 1);
    return (i == -1) ? null : this.ZD[i];
  }
  
  private void Zs() {
    boolean bool = Ze7.ZN();
    if (this.ZH.length() == 0) {
      this.Zn = new int[0];
      return;
    } 
    byte b1 = 0;
    int i = this.ZH.length();
    byte b2 = 0;
    while (b2 < i) {
      char c = this.ZH.charAt(b2);
      if (c == '\t' || Character.isHighSurrogate(c))
        this.Zz.set(b1); 
      if (c == '\n')
        b1++; 
      b2++;
      if (!bool)
        break; 
    } 
    if (this.ZH.charAt(i - 1) != '\n')
      b1++; 
    int[] arrayOfInt = new int[b1];
    arrayOfInt[0] = 0;
    byte b3 = 1;
    byte b4 = 0;
    while (b4 < i) {
      char c = this.ZH.charAt(b4);
      if (c == '\n') {
        if (b4 + 1 == i)
          break; 
        arrayOfInt[b3++] = b4 + 1;
      } 
      b4++;
      if (!bool)
        break; 
    } 
    this.Zn = arrayOfInt;
  }
  
  private static String ZI(CharSequence paramCharSequence, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore #5
    //   5: iload_1
    //   6: ifeq -> 122
    //   9: iload_2
    //   10: ifeq -> 122
    //   13: iload_3
    //   14: ifne -> 122
    //   17: iload #4
    //   19: ifeq -> 115
    //   22: aload_0
    //   23: invokeinterface length : ()I
    //   28: ifne -> 39
    //   31: ldc '\\n'
    //   33: astore_0
    //   34: iload #5
    //   36: ifne -> 115
    //   39: aload_0
    //   40: aload_0
    //   41: invokeinterface length : ()I
    //   46: iconst_1
    //   47: isub
    //   48: invokeinterface charAt : (I)C
    //   53: istore #6
    //   55: iload #6
    //   57: bipush #10
    //   59: if_icmpeq -> 115
    //   62: iload #6
    //   64: bipush #13
    //   66: if_icmpeq -> 115
    //   69: aload_0
    //   70: instanceof java/lang/StringBuilder
    //   73: ifeq -> 91
    //   76: aload_0
    //   77: checkcast java/lang/StringBuilder
    //   80: bipush #10
    //   82: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: iload #5
    //   88: ifne -> 115
    //   91: new java/lang/StringBuilder
    //   94: dup
    //   95: aload_0
    //   96: invokespecial <init> : (Ljava/lang/CharSequence;)V
    //   99: astore #7
    //   101: aload #7
    //   103: bipush #10
    //   105: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: aload #7
    //   111: invokevirtual toString : ()Ljava/lang/String;
    //   114: astore_0
    //   115: aload_0
    //   116: invokeinterface toString : ()Ljava/lang/String;
    //   121: areturn
    //   122: new java/lang/StringBuilder
    //   125: dup
    //   126: invokespecial <init> : ()V
    //   129: astore #6
    //   131: iconst_0
    //   132: istore #7
    //   134: iconst_0
    //   135: istore #8
    //   137: aload_0
    //   138: invokeinterface length : ()I
    //   143: istore #9
    //   145: iload #8
    //   147: iload #9
    //   149: if_icmpge -> 501
    //   152: aload_0
    //   153: iload #8
    //   155: iinc #8, 1
    //   158: invokeinterface charAt : (I)C
    //   163: istore #10
    //   165: iload #10
    //   167: bipush #10
    //   169: if_icmpne -> 188
    //   172: aload #6
    //   174: iload #10
    //   176: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   179: pop
    //   180: iconst_0
    //   181: istore #7
    //   183: iload #5
    //   185: ifne -> 496
    //   188: iload_3
    //   189: ifeq -> 374
    //   192: iload #10
    //   194: bipush #92
    //   196: if_icmpne -> 374
    //   199: iload #8
    //   201: iload #9
    //   203: if_icmpge -> 374
    //   206: aload_0
    //   207: iload #8
    //   209: invokeinterface charAt : (I)C
    //   214: bipush #117
    //   216: if_icmpne -> 374
    //   219: iconst_0
    //   220: istore #11
    //   222: iload #8
    //   224: iconst_1
    //   225: isub
    //   226: istore #12
    //   228: iload #12
    //   230: iflt -> 257
    //   233: aload_0
    //   234: iload #12
    //   236: invokeinterface charAt : (I)C
    //   241: bipush #92
    //   243: if_icmpne -> 257
    //   246: iinc #11, 1
    //   249: iinc #12, -1
    //   252: iload #5
    //   254: ifne -> 228
    //   257: iload #11
    //   259: iconst_2
    //   260: irem
    //   261: ifne -> 280
    //   264: aload #6
    //   266: bipush #92
    //   268: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   271: pop
    //   272: iinc #7, 1
    //   275: iload #5
    //   277: ifne -> 145
    //   280: iconst_0
    //   281: istore #12
    //   283: iload #8
    //   285: istore #13
    //   287: iload #13
    //   289: iload #9
    //   291: if_icmpge -> 318
    //   294: aload_0
    //   295: iload #13
    //   297: invokeinterface charAt : (I)C
    //   302: bipush #117
    //   304: if_icmpne -> 318
    //   307: iinc #12, 1
    //   310: iinc #13, 1
    //   313: iload #5
    //   315: ifne -> 287
    //   318: aload_0
    //   319: iload #8
    //   321: iload #12
    //   323: iadd
    //   324: iload #8
    //   326: iload #12
    //   328: iadd
    //   329: iconst_4
    //   330: iadd
    //   331: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   336: invokeinterface toString : ()Ljava/lang/String;
    //   341: astore #13
    //   343: aload #6
    //   345: aload #13
    //   347: bipush #16
    //   349: invokestatic parseInt : (Ljava/lang/String;I)I
    //   352: i2c
    //   353: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   356: pop
    //   357: iload #8
    //   359: iload #12
    //   361: iconst_4
    //   362: iadd
    //   363: iadd
    //   364: istore #8
    //   366: iinc #7, 1
    //   369: iload #5
    //   371: ifne -> 496
    //   374: iload_2
    //   375: ifne -> 424
    //   378: iload #10
    //   380: bipush #13
    //   382: if_icmpne -> 424
    //   385: aload #6
    //   387: bipush #10
    //   389: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   392: pop
    //   393: iconst_0
    //   394: istore #7
    //   396: iload #8
    //   398: iload #9
    //   400: if_icmpge -> 496
    //   403: aload_0
    //   404: iload #8
    //   406: invokeinterface charAt : (I)C
    //   411: bipush #10
    //   413: if_icmpne -> 496
    //   416: iinc #8, 1
    //   419: iload #5
    //   421: ifne -> 496
    //   424: iload #10
    //   426: bipush #9
    //   428: if_icmpne -> 477
    //   431: iload_1
    //   432: ifne -> 477
    //   435: iconst_1
    //   436: iload #7
    //   438: iconst_1
    //   439: irem
    //   440: isub
    //   441: istore #11
    //   443: iconst_0
    //   444: istore #12
    //   446: iload #12
    //   448: iload #11
    //   450: if_icmpge -> 472
    //   453: aload #6
    //   455: bipush #32
    //   457: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   460: pop
    //   461: iinc #7, 1
    //   464: iinc #12, 1
    //   467: iload #5
    //   469: ifne -> 446
    //   472: iload #5
    //   474: ifne -> 496
    //   477: aload #6
    //   479: iload #10
    //   481: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   484: pop
    //   485: iload #10
    //   487: invokestatic isLowSurrogate : (C)Z
    //   490: ifne -> 496
    //   493: iinc #7, 1
    //   496: iload #5
    //   498: ifne -> 145
    //   501: iload #4
    //   503: ifeq -> 553
    //   506: aload #6
    //   508: invokevirtual length : ()I
    //   511: ifne -> 517
    //   514: ldc '\\n'
    //   516: areturn
    //   517: aload #6
    //   519: aload #6
    //   521: invokevirtual length : ()I
    //   524: iconst_1
    //   525: isub
    //   526: invokevirtual charAt : (I)C
    //   529: istore #10
    //   531: iload #10
    //   533: bipush #10
    //   535: if_icmpeq -> 553
    //   538: iload #10
    //   540: bipush #13
    //   542: if_icmpeq -> 553
    //   545: aload #6
    //   547: bipush #10
    //   549: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   552: pop
    //   553: aload #6
    //   555: invokevirtual toString : ()Ljava/lang/String;
    //   558: areturn
  }
  
  static String Zk(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    int[] arrayOfInt = paramString.codePoints().toArray();
    boolean bool = Ze7.ZN();
    int i = arrayOfInt.length;
    byte b = 0;
    while (b < i) {
      int j = arrayOfInt[b];
      switch (j) {
        case 8:
          stringBuilder.append(a(18311, 20263));
        case 9:
          stringBuilder.append(a(18317, 22231));
        case 10:
          stringBuilder.append(a(18315, -29481));
        case 12:
          stringBuilder.append(a(18308, -21012));
        case 13:
          stringBuilder.append(a(18313, -5367));
        case 34:
          stringBuilder.append(a(18319, 1533));
        case 39:
          stringBuilder.append(a(18314, -28101));
        case 92:
          stringBuilder.append(a(18316, -30496));
        default:
        
      } 
      b++;
      continue;
      if (!bool)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\brG}X«|,«°z¾Ê~FêFÛ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #108
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
    //   67: ldc 'si¥¢'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_2
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #124
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic net/portswigger/Z_z.a : [Ljava/lang/String;
    //   130: bipush #11
    //   132: anewarray java/lang/String
    //   135: putstatic net/portswigger/Z_z.b : [Ljava/lang/String;
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
    //   212: bipush #105
    //   214: goto -> 244
    //   217: bipush #21
    //   219: goto -> 244
    //   222: bipush #118
    //   224: goto -> 244
    //   227: bipush #19
    //   229: goto -> 244
    //   232: bipush #97
    //   234: goto -> 244
    //   237: bipush #70
    //   239: goto -> 244
    //   242: bipush #55
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
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: new net/portswigger/Ze7
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic net/portswigger/Z_z.ZB : Lnet/portswigger/Ze7;
    //   310: new net/portswigger/Ze7
    //   313: dup
    //   314: invokespecial <init> : ()V
    //   317: putstatic net/portswigger/Z_z.ZP : Lnet/portswigger/Ze7;
    //   320: getstatic net/portswigger/Z_z.ZB : Lnet/portswigger/Ze7;
    //   323: iconst_1
    //   324: invokevirtual Zx : (Z)V
    //   327: getstatic net/portswigger/Z_z.ZP : Lnet/portswigger/Ze7;
    //   330: iconst_1
    //   331: invokevirtual Zx : (Z)V
    //   334: getstatic net/portswigger/Zkd.EOF : Lnet/portswigger/Zkd;
    //   337: bipush #99
    //   339: anewarray net/portswigger/Zkd
    //   342: dup
    //   343: iconst_0
    //   344: getstatic net/portswigger/Zkd.COMMENT : Lnet/portswigger/Zkd;
    //   347: aastore
    //   348: dup
    //   349: iconst_1
    //   350: getstatic net/portswigger/Zkd.METADATA_HEADER : Lnet/portswigger/Zkd;
    //   353: aastore
    //   354: dup
    //   355: iconst_2
    //   356: getstatic net/portswigger/Zkd.NAME_HEADER : Lnet/portswigger/Zkd;
    //   359: aastore
    //   360: dup
    //   361: iconst_3
    //   362: getstatic net/portswigger/Zkd.DESCRIPTION_HEADER : Lnet/portswigger/Zkd;
    //   365: aastore
    //   366: dup
    //   367: iconst_4
    //   368: getstatic net/portswigger/Zkd.LANGUAGE_HEADER : Lnet/portswigger/Zkd;
    //   371: aastore
    //   372: dup
    //   373: iconst_5
    //   374: getstatic net/portswigger/Zkd.LANGUAGE_LEVEL_1 : Lnet/portswigger/Zkd;
    //   377: aastore
    //   378: dup
    //   379: bipush #6
    //   381: getstatic net/portswigger/Zkd.AUTHOR_HEADER : Lnet/portswigger/Zkd;
    //   384: aastore
    //   385: dup
    //   386: bipush #7
    //   388: getstatic net/portswigger/Zkd.TAGS_HEADER : Lnet/portswigger/Zkd;
    //   391: aastore
    //   392: dup
    //   393: bipush #8
    //   395: getstatic net/portswigger/Zkd.GIVEN_HEADER : Lnet/portswigger/Zkd;
    //   398: aastore
    //   399: dup
    //   400: bipush #9
    //   402: getstatic net/portswigger/Zkd.HOST_FREQ : Lnet/portswigger/Zkd;
    //   405: aastore
    //   406: dup
    //   407: bipush #10
    //   409: getstatic net/portswigger/Zkd.REQUEST_FREQ : Lnet/portswigger/Zkd;
    //   412: aastore
    //   413: dup
    //   414: bipush #11
    //   416: getstatic net/portswigger/Zkd.RESPONSE_FREQ : Lnet/portswigger/Zkd;
    //   419: aastore
    //   420: dup
    //   421: bipush #12
    //   423: getstatic net/portswigger/Zkd.PATH_FREQ : Lnet/portswigger/Zkd;
    //   426: aastore
    //   427: dup
    //   428: bipush #13
    //   430: getstatic net/portswigger/Zkd.INSERTION_POINT_FREQ : Lnet/portswigger/Zkd;
    //   433: aastore
    //   434: dup
    //   435: bipush #14
    //   437: getstatic net/portswigger/Zkd.ANY : Lnet/portswigger/Zkd;
    //   440: aastore
    //   441: dup
    //   442: bipush #15
    //   444: getstatic net/portswigger/Zkd.HEADER : Lnet/portswigger/Zkd;
    //   447: aastore
    //   448: dup
    //   449: bipush #16
    //   451: getstatic net/portswigger/Zkd.QUERY : Lnet/portswigger/Zkd;
    //   454: aastore
    //   455: dup
    //   456: bipush #17
    //   458: getstatic net/portswigger/Zkd.COOKIE : Lnet/portswigger/Zkd;
    //   461: aastore
    //   462: dup
    //   463: bipush #18
    //   465: getstatic net/portswigger/Zkd.DEFINE_HEADER : Lnet/portswigger/Zkd;
    //   468: aastore
    //   469: dup
    //   470: bipush #19
    //   472: getstatic net/portswigger/Zkd.RUN_FOR_EACH_HEADER : Lnet/portswigger/Zkd;
    //   475: aastore
    //   476: dup
    //   477: bipush #20
    //   479: getstatic net/portswigger/Zkd.EQUALS : Lnet/portswigger/Zkd;
    //   482: aastore
    //   483: dup
    //   484: bipush #21
    //   486: getstatic net/portswigger/Zkd.INTERPOLATABLE_STRING_OPENING_QUOTE : Lnet/portswigger/Zkd;
    //   489: aastore
    //   490: dup
    //   491: bipush #22
    //   493: getstatic net/portswigger/Zkd.LITERAL_STRING_OPENING_QUOTE : Lnet/portswigger/Zkd;
    //   496: aastore
    //   497: dup
    //   498: bipush #23
    //   500: getstatic net/portswigger/Zkd.OPEN_BRACKET : Lnet/portswigger/Zkd;
    //   503: aastore
    //   504: dup
    //   505: bipush #24
    //   507: getstatic net/portswigger/Zkd.CLOSE_BRACKET : Lnet/portswigger/Zkd;
    //   510: aastore
    //   511: dup
    //   512: bipush #25
    //   514: getstatic net/portswigger/Zkd.NATURAL_NUMBER : Lnet/portswigger/Zkd;
    //   517: aastore
    //   518: dup
    //   519: bipush #26
    //   521: getstatic net/portswigger/Zkd.COMMA : Lnet/portswigger/Zkd;
    //   524: aastore
    //   525: dup
    //   526: bipush #27
    //   528: getstatic net/portswigger/Zkd.INTERPOLATABLE_STRING_CLOSING_QUOTE : Lnet/portswigger/Zkd;
    //   531: aastore
    //   532: dup
    //   533: bipush #28
    //   535: getstatic net/portswigger/Zkd.INTERPOLATABLE_STRING_LITERAL : Lnet/portswigger/Zkd;
    //   538: aastore
    //   539: dup
    //   540: bipush #29
    //   542: getstatic net/portswigger/Zkd.LITERAL_STRING_CLOSING_QUOTE : Lnet/portswigger/Zkd;
    //   545: aastore
    //   546: dup
    //   547: bipush #30
    //   549: getstatic net/portswigger/Zkd.LITERAL_STRING : Lnet/portswigger/Zkd;
    //   552: aastore
    //   553: dup
    //   554: bipush #31
    //   556: getstatic net/portswigger/Zkd.VARIABLE_START : Lnet/portswigger/Zkd;
    //   559: aastore
    //   560: dup
    //   561: bipush #32
    //   563: getstatic net/portswigger/Zkd.VARIABLE_END : Lnet/portswigger/Zkd;
    //   566: aastore
    //   567: dup
    //   568: bipush #33
    //   570: getstatic net/portswigger/Zkd.GENERATE_COLLABORATOR_ADDRESS_FUNCTION : Lnet/portswigger/Zkd;
    //   573: aastore
    //   574: dup
    //   575: bipush #34
    //   577: getstatic net/portswigger/Zkd.RANDOM_STR_FUNCTION : Lnet/portswigger/Zkd;
    //   580: aastore
    //   581: dup
    //   582: bipush #35
    //   584: getstatic net/portswigger/Zkd.TO_LOWER_FUNCTION : Lnet/portswigger/Zkd;
    //   587: aastore
    //   588: dup
    //   589: bipush #36
    //   591: getstatic net/portswigger/Zkd.TO_UPPER_FUNCTION : Lnet/portswigger/Zkd;
    //   594: aastore
    //   595: dup
    //   596: bipush #37
    //   598: getstatic net/portswigger/Zkd.REGEX_REPLACE_FUNCTION : Lnet/portswigger/Zkd;
    //   601: aastore
    //   602: dup
    //   603: bipush #38
    //   605: getstatic net/portswigger/Zkd.BASE64_ENCODE_FUNCTION : Lnet/portswigger/Zkd;
    //   608: aastore
    //   609: dup
    //   610: bipush #39
    //   612: getstatic net/portswigger/Zkd.BASE64_DECODE_FUNCTION : Lnet/portswigger/Zkd;
    //   615: aastore
    //   616: dup
    //   617: bipush #40
    //   619: getstatic net/portswigger/Zkd.SHA1_FUNCTION : Lnet/portswigger/Zkd;
    //   622: aastore
    //   623: dup
    //   624: bipush #41
    //   626: getstatic net/portswigger/Zkd.SHA256_FUNCTION : Lnet/portswigger/Zkd;
    //   629: aastore
    //   630: dup
    //   631: bipush #42
    //   633: getstatic net/portswigger/Zkd.MD5_FUNCTION : Lnet/portswigger/Zkd;
    //   636: aastore
    //   637: dup
    //   638: bipush #43
    //   640: getstatic net/portswigger/Zkd.REQUEST_OBJECT : Lnet/portswigger/Zkd;
    //   643: aastore
    //   644: dup
    //   645: bipush #44
    //   647: getstatic net/portswigger/Zkd.RESPONSE_OBJECT : Lnet/portswigger/Zkd;
    //   650: aastore
    //   651: dup
    //   652: bipush #45
    //   654: getstatic net/portswigger/Zkd.REQUEST_RESPONSE_COMMON_PROPERTY : Lnet/portswigger/Zkd;
    //   657: aastore
    //   658: dup
    //   659: bipush #46
    //   661: getstatic net/portswigger/Zkd.REQUEST_SPECIFIC_PROPERTY : Lnet/portswigger/Zkd;
    //   664: aastore
    //   665: dup
    //   666: bipush #47
    //   668: getstatic net/portswigger/Zkd.RESPONSE_SPECIFIC_PROPERTY : Lnet/portswigger/Zkd;
    //   671: aastore
    //   672: dup
    //   673: bipush #48
    //   675: getstatic net/portswigger/Zkd.URL : Lnet/portswigger/Zkd;
    //   678: aastore
    //   679: dup
    //   680: bipush #49
    //   682: getstatic net/portswigger/Zkd.URL_PROPERTY : Lnet/portswigger/Zkd;
    //   685: aastore
    //   686: dup
    //   687: bipush #50
    //   689: getstatic net/portswigger/Zkd.REPORT_ISSUE_HEADER : Lnet/portswigger/Zkd;
    //   692: aastore
    //   693: dup
    //   694: bipush #51
    //   696: getstatic net/portswigger/Zkd.AND_CONTINUE : Lnet/portswigger/Zkd;
    //   699: aastore
    //   700: dup
    //   701: bipush #52
    //   703: getstatic net/portswigger/Zkd.SEVERITY_HEADER : Lnet/portswigger/Zkd;
    //   706: aastore
    //   707: dup
    //   708: bipush #53
    //   710: getstatic net/portswigger/Zkd.HIGH_SEVERITY : Lnet/portswigger/Zkd;
    //   713: aastore
    //   714: dup
    //   715: bipush #54
    //   717: getstatic net/portswigger/Zkd.MEDIUM_SEVERITY : Lnet/portswigger/Zkd;
    //   720: aastore
    //   721: dup
    //   722: bipush #55
    //   724: getstatic net/portswigger/Zkd.LOW_SEVERITY : Lnet/portswigger/Zkd;
    //   727: aastore
    //   728: dup
    //   729: bipush #56
    //   731: getstatic net/portswigger/Zkd.INFO_SEVERITY : Lnet/portswigger/Zkd;
    //   734: aastore
    //   735: dup
    //   736: bipush #57
    //   738: getstatic net/portswigger/Zkd.ISSUE_NAME_HEADER : Lnet/portswigger/Zkd;
    //   741: aastore
    //   742: dup
    //   743: bipush #58
    //   745: getstatic net/portswigger/Zkd.CONFIDENCE_HEADER : Lnet/portswigger/Zkd;
    //   748: aastore
    //   749: dup
    //   750: bipush #59
    //   752: getstatic net/portswigger/Zkd.CERTAIN_CONFIDENCE : Lnet/portswigger/Zkd;
    //   755: aastore
    //   756: dup
    //   757: bipush #60
    //   759: getstatic net/portswigger/Zkd.FIRM_CONFIDENCE : Lnet/portswigger/Zkd;
    //   762: aastore
    //   763: dup
    //   764: bipush #61
    //   766: getstatic net/portswigger/Zkd.TENTATIVE_CONFIDENCE : Lnet/portswigger/Zkd;
    //   769: aastore
    //   770: dup
    //   771: bipush #62
    //   773: getstatic net/portswigger/Zkd.REMEDIATION_HEADER : Lnet/portswigger/Zkd;
    //   776: aastore
    //   777: dup
    //   778: bipush #63
    //   780: getstatic net/portswigger/Zkd.DETAIL_HEADER : Lnet/portswigger/Zkd;
    //   783: aastore
    //   784: dup
    //   785: bipush #64
    //   787: getstatic net/portswigger/Zkd.IF_HEADER : Lnet/portswigger/Zkd;
    //   790: aastore
    //   791: dup
    //   792: bipush #65
    //   794: getstatic net/portswigger/Zkd.ELSE_HEADER : Lnet/portswigger/Zkd;
    //   797: aastore
    //   798: dup
    //   799: bipush #66
    //   801: getstatic net/portswigger/Zkd.IF_FOOTER : Lnet/portswigger/Zkd;
    //   804: aastore
    //   805: dup
    //   806: bipush #67
    //   808: getstatic net/portswigger/Zkd.IN_KEY : Lnet/portswigger/Zkd;
    //   811: aastore
    //   812: dup
    //   813: bipush #68
    //   815: getstatic net/portswigger/Zkd.IS_KEY : Lnet/portswigger/Zkd;
    //   818: aastore
    //   819: dup
    //   820: bipush #69
    //   822: getstatic net/portswigger/Zkd.MATCHES_KEY : Lnet/portswigger/Zkd;
    //   825: aastore
    //   826: dup
    //   827: bipush #70
    //   829: getstatic net/portswigger/Zkd.DIFFERS_FROM_KEY : Lnet/portswigger/Zkd;
    //   832: aastore
    //   833: dup
    //   834: bipush #71
    //   836: getstatic net/portswigger/Zkd.COLON : Lnet/portswigger/Zkd;
    //   839: aastore
    //   840: dup
    //   841: bipush #72
    //   843: getstatic net/portswigger/Zkd.THEN : Lnet/portswigger/Zkd;
    //   846: aastore
    //   847: dup
    //   848: bipush #73
    //   850: getstatic net/portswigger/Zkd.BODY : Lnet/portswigger/Zkd;
    //   853: aastore
    //   854: dup
    //   855: bipush #74
    //   857: getstatic net/portswigger/Zkd.SEND : Lnet/portswigger/Zkd;
    //   860: aastore
    //   861: dup
    //   862: bipush #75
    //   864: getstatic net/portswigger/Zkd.REQUEST_HEADER : Lnet/portswigger/Zkd;
    //   867: aastore
    //   868: dup
    //   869: bipush #76
    //   871: getstatic net/portswigger/Zkd.CALLED : Lnet/portswigger/Zkd;
    //   874: aastore
    //   875: dup
    //   876: bipush #77
    //   878: getstatic net/portswigger/Zkd.METHOD : Lnet/portswigger/Zkd;
    //   881: aastore
    //   882: dup
    //   883: bipush #78
    //   885: getstatic net/portswigger/Zkd.PATH : Lnet/portswigger/Zkd;
    //   888: aastore
    //   889: dup
    //   890: bipush #79
    //   892: getstatic net/portswigger/Zkd.QUERIES : Lnet/portswigger/Zkd;
    //   895: aastore
    //   896: dup
    //   897: bipush #80
    //   899: getstatic net/portswigger/Zkd.QUERY_STRING : Lnet/portswigger/Zkd;
    //   902: aastore
    //   903: dup
    //   904: bipush #81
    //   906: getstatic net/portswigger/Zkd.APPENDING : Lnet/portswigger/Zkd;
    //   909: aastore
    //   910: dup
    //   911: bipush #82
    //   913: getstatic net/portswigger/Zkd.REMOVING : Lnet/portswigger/Zkd;
    //   916: aastore
    //   917: dup
    //   918: bipush #83
    //   920: getstatic net/portswigger/Zkd.REPLACING : Lnet/portswigger/Zkd;
    //   923: aastore
    //   924: dup
    //   925: bipush #84
    //   927: getstatic net/portswigger/Zkd.HEADERS : Lnet/portswigger/Zkd;
    //   930: aastore
    //   931: dup
    //   932: bipush #85
    //   934: getstatic net/portswigger/Zkd.ANY_KEY : Lnet/portswigger/Zkd;
    //   937: aastore
    //   938: dup
    //   939: bipush #86
    //   941: getstatic net/portswigger/Zkd.DNS_KEY : Lnet/portswigger/Zkd;
    //   944: aastore
    //   945: dup
    //   946: bipush #87
    //   948: getstatic net/portswigger/Zkd.HTTP_KEY : Lnet/portswigger/Zkd;
    //   951: aastore
    //   952: dup
    //   953: bipush #88
    //   955: getstatic net/portswigger/Zkd.SMTP_KEY : Lnet/portswigger/Zkd;
    //   958: aastore
    //   959: dup
    //   960: bipush #89
    //   962: getstatic net/portswigger/Zkd.INTERACTIONS_KEY : Lnet/portswigger/Zkd;
    //   965: aastore
    //   966: dup
    //   967: bipush #90
    //   969: getstatic net/portswigger/Zkd.PAYLOAD_HEADER : Lnet/portswigger/Zkd;
    //   972: aastore
    //   973: dup
    //   974: bipush #91
    //   976: getstatic net/portswigger/Zkd.BOOL_AND : Lnet/portswigger/Zkd;
    //   979: aastore
    //   980: dup
    //   981: bipush #92
    //   983: getstatic net/portswigger/Zkd.BOOL_OR : Lnet/portswigger/Zkd;
    //   986: aastore
    //   987: dup
    //   988: bipush #93
    //   990: getstatic net/portswigger/Zkd.BOOL_NOT : Lnet/portswigger/Zkd;
    //   993: aastore
    //   994: dup
    //   995: bipush #94
    //   997: getstatic net/portswigger/Zkd.VARIABLE_NAME : Lnet/portswigger/Zkd;
    //   1000: aastore
    //   1001: dup
    //   1002: bipush #95
    //   1004: getstatic net/portswigger/Zkd.REQUEST_NAME : Lnet/portswigger/Zkd;
    //   1007: aastore
    //   1008: dup
    //   1009: bipush #96
    //   1011: getstatic net/portswigger/Zkd.DOT : Lnet/portswigger/Zkd;
    //   1014: aastore
    //   1015: dup
    //   1016: bipush #97
    //   1018: getstatic net/portswigger/Zkd.UNKNOWN : Lnet/portswigger/Zkd;
    //   1021: aastore
    //   1022: dup
    //   1023: bipush #98
    //   1025: getstatic net/portswigger/Zkd.UNKNOWN_STRING : Lnet/portswigger/Zkd;
    //   1028: aastore
    //   1029: invokestatic of : (Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;
    //   1032: putstatic net/portswigger/Z_z.Zp : Ljava/util/EnumSet;
    //   1035: getstatic net/portswigger/Zkd.NEWLINE : Lnet/portswigger/Zkd;
    //   1038: invokestatic of : (Ljava/lang/Enum;)Ljava/util/EnumSet;
    //   1041: putstatic net/portswigger/Z_z.Zs : Ljava/util/EnumSet;
    //   1044: getstatic net/portswigger/Zkd._TOKEN_1 : Lnet/portswigger/Zkd;
    //   1047: getstatic net/portswigger/Zkd._TOKEN_2 : Lnet/portswigger/Zkd;
    //   1050: getstatic net/portswigger/Zkd._TOKEN_3 : Lnet/portswigger/Zkd;
    //   1053: getstatic net/portswigger/Zkd._TOKEN_4 : Lnet/portswigger/Zkd;
    //   1056: getstatic net/portswigger/Zkd._TOKEN_5 : Lnet/portswigger/Zkd;
    //   1059: invokestatic of : (Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;
    //   1062: putstatic net/portswigger/Z_z.ZE : Ljava/util/EnumSet;
    //   1065: ldc net/portswigger/Zkd
    //   1067: invokestatic noneOf : (Ljava/lang/Class;)Ljava/util/EnumSet;
    //   1070: putstatic net/portswigger/Z_z.ZZ : Ljava/util/EnumSet;
    //   1073: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x478E) & 0xFFFF;
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
      byte b1 = 65;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Z_z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */