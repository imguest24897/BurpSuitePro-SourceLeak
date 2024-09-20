package net.portswigger;

import burp.Zbqc;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Stack;

public class Zgp implements Zgc {
  private final Stack<Zzv> ZS = new Stack<>();
  
  private int Zp;
  
  final Zz Zn;
  
  private static final Zz Zt;
  
  private static final Zz Zq;
  
  private CharSequence Zd;
  
  private String ZW;
  
  private int[] ZF;
  
  private int ZP;
  
  private int ZY;
  
  private int Zj;
  
  private BitSet ZH;
  
  private BitSet ZE;
  
  private Zz[] ZX;
  
  private BitSet Zu;
  
  private BitSet ZV;
  
  EnumSet<Zfh> Zc;
  
  static final EnumSet<Zfh> Zb;
  
  static final EnumSet<Zfh> ZN;
  
  static final EnumSet<Zfh> Za;
  
  private static final EnumSet<Zfh> ZQ;
  
  Zzv ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  void Zk(Zzv paramZzv) {
    Zj(paramZzv);
    this.ZS.add(paramZzv);
  }
  
  void ZB() {
    this.ZS.pop();
    Zj(this.ZS.peek());
  }
  
  void ZC() {
    String[] arrayOfString = Zz.Za();
    while (!Z_(this.ZS.peek())) {
      ZB();
      if (arrayOfString == null)
        break; 
    } 
  }
  
  boolean Z_(Zzv paramZzv) {
    try {
      if (paramZzv != Zzv.DEFAULT)
        try {
          if (paramZzv != Zzv.ActiveCheck)
            try {
              if (paramZzv != Zzv.PassiveCheck) {
                try {
                  if (paramZzv == Zzv.InsertionPointCheck);
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                return false;
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public String Zd() {
    return this.ZW;
  }
  
  public Zgp(String paramString, CharSequence paramCharSequence) {
    this(paramString, paramCharSequence, Zzv.DEFAULT, 1, 1);
  }
  
  public Zgp(String paramString, CharSequence paramCharSequence, Zzv paramZzv, int paramInt1, int paramInt2) {
    this.ZS.add(Zzv.DEFAULT);
    this.Zp = 1;
    this.Zn = new Zz();
    this.ZW = a(27665, -32394);
    this.ZE = new BitSet();
    this.Zu = new BitSet(267);
    this.ZV = new BitSet(267);
    this.Zc = EnumSet.allOf(Zfh.class);
    String[] arrayOfString = Zz.Za();
    try {
      this.ZB = Zzv.values()[0];
      this.ZW = paramString;
      this.Zd = Zs(paramCharSequence, true, true, false, false);
      this.ZW = paramString;
      Zr();
      this.ZX = new Zz[this.Zd.length() + 1];
      this.ZH = new BitSet(this.Zd.length() + 1);
      this.ZP = paramInt1;
      this.ZY = paramInt2;
      Zj(paramZzv);
      if (Zbqc.Zwu() == null)
        Zz.ZW(new String[2]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public Zgp(String paramString, Reader paramReader) {
    this(paramString, paramReader, Zzv.DEFAULT, 1, 1);
  }
  
  public Zgp(String paramString, Reader paramReader, Zzv paramZzv, int paramInt1, int paramInt2) {
    this(paramString, Zc(paramReader), paramZzv, paramInt1, paramInt2);
    Zj(paramZzv);
  }
  
  private Zz Zz() {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: invokestatic Za : ()[Ljava/lang/String;
    //   5: aload_0
    //   6: invokevirtual ZU : ()Lnet/portswigger/Zz;
    //   9: astore_3
    //   10: astore_1
    //   11: aload_3
    //   12: instanceof net/portswigger/Zr5
    //   15: ifeq -> 55
    //   18: aload_2
    //   19: ifnonnull -> 31
    //   22: aload_3
    //   23: checkcast net/portswigger/Zr5
    //   26: astore_2
    //   27: aload_1
    //   28: ifnonnull -> 46
    //   31: aload_2
    //   32: aload_3
    //   33: invokevirtual Z_ : ()I
    //   36: invokevirtual Zn : (I)V
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: aload_0
    //   47: invokevirtual ZU : ()Lnet/portswigger/Zz;
    //   50: astore_3
    //   51: aload_1
    //   52: ifnonnull -> 11
    //   55: aload_2
    //   56: ifnull -> 71
    //   59: aload_0
    //   60: aload_2
    //   61: invokevirtual ZD : (Lnet/portswigger/Zz;)V
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   70: athrow
    //   71: aload_0
    //   72: aload_3
    //   73: invokevirtual ZD : (Lnet/portswigger/Zz;)V
    //   76: aload_2
    //   77: ifnull -> 94
    //   80: aload_0
    //   81: aload_2
    //   82: invokevirtual Z_ : ()I
    //   85: invokevirtual Zv : (I)V
    //   88: aload_2
    //   89: areturn
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: aload_3
    //   95: areturn
    // Exception table:
    //   from	to	target	type
    //   27	39	42	java/lang/RuntimeException
    //   55	64	67	java/lang/RuntimeException
    //   71	90	90	java/lang/RuntimeException
  }
  
  public Zz ZP(Zz paramZz) {
    try {
      if (paramZz == null)
        return Zz(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Zz zz = paramZz.ZX();
    try {
      if (zz != null && !this.Zc.contains(zz.Zb())) {
        ZK(paramZz);
        zz = null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (zz != null) ? zz : ZK(paramZz.Z_());
  }
  
  public Zz ZK(int paramInt) {
    Zv(paramInt);
    return Zz();
  }
  
  private final Zz ZU() {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: aconst_null
    //   4: astore_2
    //   5: astore_1
    //   6: iconst_0
    //   7: istore_3
    //   8: aload_0
    //   9: getfield Zj : I
    //   12: istore #4
    //   14: iconst_0
    //   15: istore #5
    //   17: aload_2
    //   18: ifnonnull -> 553
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
    //   38: invokevirtual Z_ : ()I
    //   41: istore #6
    //   43: iload #6
    //   45: iconst_m1
    //   46: if_icmpne -> 85
    //   49: iconst_1
    //   50: istore #10
    //   52: aload_1
    //   53: ifnonnull -> 85
    //   56: aload_0
    //   57: getfield Zj : I
    //   60: istore #4
    //   62: aload_0
    //   63: invokevirtual Z_ : ()I
    //   66: dup
    //   67: istore #6
    //   69: istore #5
    //   71: iload #6
    //   73: iconst_m1
    //   74: if_icmpne -> 85
    //   77: getstatic net/portswigger/Zfh.EOF : Lnet/portswigger/Zfh;
    //   80: astore #9
    //   82: iconst_1
    //   83: istore #10
    //   85: aload_0
    //   86: getfield ZB : Lnet/portswigger/Zzv;
    //   89: invokestatic ZK : (Lnet/portswigger/Zzv;)[Lnet/portswigger/Zfw;
    //   92: astore #11
    //   94: iload #10
    //   96: ifne -> 330
    //   99: aconst_null
    //   100: astore #12
    //   102: iload #7
    //   104: ifle -> 153
    //   107: aload_0
    //   108: getfield ZV : Ljava/util/BitSet;
    //   111: astore #13
    //   113: aload_0
    //   114: aload_0
    //   115: getfield Zu : Ljava/util/BitSet;
    //   118: putfield ZV : Ljava/util/BitSet;
    //   121: aload_0
    //   122: aload #13
    //   124: putfield Zu : Ljava/util/BitSet;
    //   127: aload_0
    //   128: invokevirtual Z_ : ()I
    //   131: istore #14
    //   133: iload #14
    //   135: iflt -> 146
    //   138: iload #14
    //   140: istore #6
    //   142: aload_1
    //   143: ifnonnull -> 153
    //   146: iconst_1
    //   147: istore #10
    //   149: aload_1
    //   150: ifnonnull -> 330
    //   153: aload_0
    //   154: getfield Zu : Ljava/util/BitSet;
    //   157: invokevirtual clear : ()V
    //   160: iload #7
    //   162: ifne -> 180
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   171: athrow
    //   172: iconst_0
    //   173: goto -> 188
    //   176: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   179: athrow
    //   180: aload_0
    //   181: getfield ZV : Ljava/util/BitSet;
    //   184: iconst_0
    //   185: invokevirtual nextSetBit : (I)I
    //   188: istore #13
    //   190: aload #11
    //   192: iload #13
    //   194: aaload
    //   195: iload #6
    //   197: aload_0
    //   198: getfield Zu : Ljava/util/BitSet;
    //   201: aload_0
    //   202: getfield Zc : Ljava/util/EnumSet;
    //   205: invokeinterface Zx : (ILjava/util/BitSet;Ljava/util/EnumSet;)Lnet/portswigger/Zfh;
    //   210: astore #14
    //   212: aload #14
    //   214: ifnull -> 246
    //   217: aload #12
    //   219: ifnull -> 242
    //   222: aload #14
    //   224: invokevirtual ordinal : ()I
    //   227: aload #12
    //   229: invokevirtual ordinal : ()I
    //   232: if_icmpge -> 246
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   241: athrow
    //   242: aload #14
    //   244: astore #12
    //   246: iload #7
    //   248: ifne -> 259
    //   251: iconst_m1
    //   252: goto -> 270
    //   255: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   258: athrow
    //   259: aload_0
    //   260: getfield ZV : Ljava/util/BitSet;
    //   263: iload #13
    //   265: iconst_1
    //   266: iadd
    //   267: invokevirtual nextSetBit : (I)I
    //   270: istore #13
    //   272: iload #13
    //   274: iconst_m1
    //   275: if_icmpne -> 190
    //   278: iinc #7, 1
    //   281: iload #6
    //   283: ldc 65535
    //   285: if_icmple -> 298
    //   288: iinc #7, 1
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   297: athrow
    //   298: aload #12
    //   300: ifnull -> 320
    //   303: aload #12
    //   305: astore #9
    //   307: getstatic net/portswigger/Zgp.ZQ : Ljava/util/EnumSet;
    //   310: aload #9
    //   312: invokevirtual contains : (Ljava/lang/Object;)Z
    //   315: istore_3
    //   316: iload #7
    //   318: istore #8
    //   320: aload_0
    //   321: getfield Zu : Ljava/util/BitSet;
    //   324: invokevirtual isEmpty : ()Z
    //   327: ifeq -> 99
    //   330: aload #9
    //   332: ifnonnull -> 389
    //   335: aload_0
    //   336: iload #4
    //   338: iconst_1
    //   339: iadd
    //   340: putfield Zj : I
    //   343: iload #5
    //   345: ldc 65535
    //   347: if_icmple -> 374
    //   350: goto -> 357
    //   353: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   356: athrow
    //   357: aload_0
    //   358: dup
    //   359: getfield Zj : I
    //   362: iconst_1
    //   363: iadd
    //   364: putfield Zj : I
    //   367: goto -> 374
    //   370: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   373: athrow
    //   374: new net/portswigger/Zr5
    //   377: dup
    //   378: aload_0
    //   379: iload #4
    //   381: aload_0
    //   382: getfield Zj : I
    //   385: invokespecial <init> : (Lnet/portswigger/Zgp;II)V
    //   388: areturn
    //   389: aload_0
    //   390: dup
    //   391: getfield Zj : I
    //   394: iload #7
    //   396: iload #8
    //   398: isub
    //   399: isub
    //   400: putfield Zj : I
    //   403: getstatic net/portswigger/Zgp.Za : Ljava/util/EnumSet;
    //   406: aload #9
    //   408: invokevirtual contains : (Ljava/lang/Object;)Z
    //   411: ifeq -> 468
    //   414: iload #4
    //   416: istore #12
    //   418: iload #12
    //   420: aload_0
    //   421: getfield Zj : I
    //   424: if_icmpge -> 464
    //   427: aload_0
    //   428: getfield ZX : [Lnet/portswigger/Zz;
    //   431: iload #12
    //   433: aaload
    //   434: getstatic net/portswigger/Zgp.Zt : Lnet/portswigger/Zz;
    //   437: if_acmpeq -> 457
    //   440: aload_0
    //   441: getfield ZX : [Lnet/portswigger/Zz;
    //   444: iload #12
    //   446: getstatic net/portswigger/Zgp.Zq : Lnet/portswigger/Zz;
    //   449: aastore
    //   450: goto -> 457
    //   453: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   456: athrow
    //   457: iinc #12, 1
    //   460: aload_1
    //   461: ifnonnull -> 418
    //   464: aload_1
    //   465: ifnonnull -> 541
    //   468: getstatic net/portswigger/Zgp.Zb : Ljava/util/EnumSet;
    //   471: aload #9
    //   473: invokevirtual contains : (Ljava/lang/Object;)Z
    //   476: ifne -> 504
    //   479: goto -> 486
    //   482: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   485: athrow
    //   486: getstatic net/portswigger/Zgp.ZN : Ljava/util/EnumSet;
    //   489: aload #9
    //   491: invokevirtual contains : (Ljava/lang/Object;)Z
    //   494: ifeq -> 541
    //   497: goto -> 504
    //   500: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   503: athrow
    //   504: aload #9
    //   506: aload_0
    //   507: iload #4
    //   509: aload_0
    //   510: getfield Zj : I
    //   513: invokestatic ZO : (Lnet/portswigger/Zfh;Lnet/portswigger/Zgp;II)Lnet/portswigger/Zz;
    //   516: astore_2
    //   517: aload_2
    //   518: getstatic net/portswigger/Zgp.Zb : Ljava/util/EnumSet;
    //   521: aload #9
    //   523: invokevirtual contains : (Ljava/lang/Object;)Z
    //   526: ifne -> 537
    //   529: iconst_1
    //   530: goto -> 538
    //   533: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   536: athrow
    //   537: iconst_0
    //   538: invokevirtual ZD : (Z)V
    //   541: aload_0
    //   542: aload_2
    //   543: aload #9
    //   545: invokevirtual Ze : (Lnet/portswigger/Zz;Lnet/portswigger/Zfh;)Lnet/portswigger/Zz;
    //   548: astore_2
    //   549: aload_1
    //   550: ifnonnull -> 17
    //   553: aload_2
    //   554: areturn
    // Exception table:
    //   from	to	target	type
    //   149	165	168	java/lang/RuntimeException
    //   153	176	176	java/lang/RuntimeException
    //   217	235	238	java/lang/RuntimeException
    //   246	255	255	java/lang/RuntimeException
    //   278	291	294	java/lang/RuntimeException
    //   330	350	353	java/lang/RuntimeException
    //   335	367	370	java/lang/RuntimeException
    //   427	450	453	java/lang/RuntimeException
    //   464	479	482	java/lang/RuntimeException
    //   468	497	500	java/lang/RuntimeException
    //   517	533	533	java/lang/RuntimeException
  }
  
  public boolean Zj(Zzv paramZzv) {
    try {
      if (this.ZB != paramZzv) {
        this.ZB = paramZzv;
        return true;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  void Zz(Zz paramZz, Zzv paramZzv) {
    try {
      Zv(paramZz.Z_());
      ZG(paramZz);
      if (paramZzv != null)
        Zj(paramZzv); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void ZK(Zz paramZz) {
    Zz(paramZz, null);
  }
  
  private Zz Ze(Zz paramZz, Zfh paramZfh) {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: getstatic net/portswigger/Zqd.Zh : [I
    //   7: aload_2
    //   8: invokevirtual ordinal : ()I
    //   11: iaload
    //   12: tableswitch default -> 276, 1 -> 76, 2 -> 94, 3 -> 112, 4 -> 130, 5 -> 148, 6 -> 166, 7 -> 184, 8 -> 199, 9 -> 214, 10 -> 232, 11 -> 247, 12 -> 265
    //   76: aload_0
    //   77: getstatic net/portswigger/Zzv.ActiveCheck : Lnet/portswigger/Zzv;
    //   80: invokevirtual Zk : (Lnet/portswigger/Zzv;)V
    //   83: aload_3
    //   84: ifnonnull -> 276
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: aload_0
    //   95: getstatic net/portswigger/Zzv.ActiveCheck : Lnet/portswigger/Zzv;
    //   98: invokevirtual Zk : (Lnet/portswigger/Zzv;)V
    //   101: aload_3
    //   102: ifnonnull -> 276
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   111: athrow
    //   112: aload_0
    //   113: getstatic net/portswigger/Zzv.PassiveCheck : Lnet/portswigger/Zzv;
    //   116: invokevirtual Zk : (Lnet/portswigger/Zzv;)V
    //   119: aload_3
    //   120: ifnonnull -> 276
    //   123: goto -> 130
    //   126: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   129: athrow
    //   130: aload_0
    //   131: getstatic net/portswigger/Zzv.InsertionPointCheck : Lnet/portswigger/Zzv;
    //   134: invokevirtual Zk : (Lnet/portswigger/Zzv;)V
    //   137: aload_3
    //   138: ifnonnull -> 276
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   147: athrow
    //   148: aload_0
    //   149: getstatic net/portswigger/Zzv.WithinInterpolatableString : Lnet/portswigger/Zzv;
    //   152: invokevirtual Zk : (Lnet/portswigger/Zzv;)V
    //   155: aload_3
    //   156: ifnonnull -> 276
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   165: athrow
    //   166: aload_0
    //   167: getstatic net/portswigger/Zzv.WithinLiteralString : Lnet/portswigger/Zzv;
    //   170: invokevirtual Zk : (Lnet/portswigger/Zzv;)V
    //   173: aload_3
    //   174: ifnonnull -> 276
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   183: athrow
    //   184: aload_0
    //   185: invokevirtual ZB : ()V
    //   188: aload_3
    //   189: ifnonnull -> 276
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   198: athrow
    //   199: aload_0
    //   200: invokevirtual ZB : ()V
    //   203: aload_3
    //   204: ifnonnull -> 276
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   213: athrow
    //   214: aload_0
    //   215: getstatic net/portswigger/Zzv.WithinVariableRef : Lnet/portswigger/Zzv;
    //   218: invokevirtual Zk : (Lnet/portswigger/Zzv;)V
    //   221: aload_3
    //   222: ifnonnull -> 276
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   231: athrow
    //   232: aload_0
    //   233: invokevirtual ZB : ()V
    //   236: aload_3
    //   237: ifnonnull -> 276
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   246: athrow
    //   247: aload_0
    //   248: getstatic net/portswigger/Zzv.RequestNaming : Lnet/portswigger/Zzv;
    //   251: invokevirtual Zk : (Lnet/portswigger/Zzv;)V
    //   254: aload_3
    //   255: ifnonnull -> 276
    //   258: goto -> 265
    //   261: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   264: athrow
    //   265: aload_0
    //   266: invokevirtual ZB : ()V
    //   269: goto -> 276
    //   272: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   275: athrow
    //   276: aload_1
    //   277: areturn
    // Exception table:
    //   from	to	target	type
    //   4	87	90	java/lang/RuntimeException
    //   76	105	108	java/lang/RuntimeException
    //   94	123	126	java/lang/RuntimeException
    //   112	141	144	java/lang/RuntimeException
    //   130	159	162	java/lang/RuntimeException
    //   148	177	180	java/lang/RuntimeException
    //   166	192	195	java/lang/RuntimeException
    //   184	207	210	java/lang/RuntimeException
    //   199	225	228	java/lang/RuntimeException
    //   214	240	243	java/lang/RuntimeException
    //   232	258	261	java/lang/RuntimeException
    //   247	272	272	java/lang/RuntimeException
  }
  
  private void Zv(int paramInt) {
    String[] arrayOfString = Zz.Za();
    while (paramInt < this.Zd.length()) {
      try {
        if (this.ZX[paramInt] == Zt) {
          paramInt++;
          if (arrayOfString == null)
            break; 
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    this.Zj = paramInt;
  }
  
  private int Z_() {
    String[] arrayOfString = Zz.Za();
    while (this.ZX[this.Zj] == Zt) {
      try {
        if (this.Zj < this.Zd.length()) {
          this.Zj++;
          if (arrayOfString == null)
            break; 
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    try {
      if (this.Zj >= this.Zd.length())
        return -1; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    char c = this.Zd.charAt(this.Zj++);
    try {
      if (Character.isHighSurrogate(c) && this.Zj < this.Zd.length()) {
        char c1 = this.Zd.charAt(this.Zj);
        try {
          if (Character.isLowSurrogate(c1)) {
            this.Zj++;
            return Character.toCodePoint(c, c1);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return c;
  }
  
  public int Z_(int paramInt) {
    try {
      if (paramInt >= this.Zd.length()) {
        try {
          if (this.Zd.charAt(this.Zd.length() - 1) == '\n')
            return this.ZP + this.ZF.length; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return this.ZP + this.ZF.length - 1;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = Arrays.binarySearch(this.ZF, paramInt);
    try {
      if (i >= 0)
        return this.ZP + i; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.ZP - i + 2;
  }
  
  public int ZJ(int paramInt) {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: iload_1
    //   5: aload_0
    //   6: getfield Zd : Ljava/lang/CharSequence;
    //   9: invokeinterface length : ()I
    //   14: if_icmplt -> 23
    //   17: iconst_1
    //   18: ireturn
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: iload_1
    //   24: ifne -> 36
    //   27: aload_0
    //   28: getfield ZY : I
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_0
    //   37: iload_1
    //   38: invokevirtual Z_ : (I)I
    //   41: aload_0
    //   42: getfield ZP : I
    //   45: isub
    //   46: istore_3
    //   47: aload_0
    //   48: getfield ZF : [I
    //   51: iload_3
    //   52: iaload
    //   53: istore #4
    //   55: iload_3
    //   56: ifle -> 67
    //   59: iconst_1
    //   60: goto -> 71
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: aload_0
    //   68: getfield ZY : I
    //   71: istore #5
    //   73: iload_1
    //   74: iload #4
    //   76: isub
    //   77: iload #5
    //   79: iadd
    //   80: istore #6
    //   82: aload_0
    //   83: getfield ZE : Ljava/util/BitSet;
    //   86: iload_3
    //   87: invokevirtual get : (I)Z
    //   90: ifne -> 100
    //   93: iload #6
    //   95: ireturn
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: aload_0
    //   101: getfield Zd : Ljava/lang/CharSequence;
    //   104: iload_1
    //   105: invokeinterface charAt : (I)C
    //   110: invokestatic isLowSurrogate : (C)Z
    //   113: ifeq -> 126
    //   116: iinc #1, -1
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   125: athrow
    //   126: iload #5
    //   128: istore #7
    //   130: iload #4
    //   132: istore #8
    //   134: iload #8
    //   136: iload_1
    //   137: if_icmpge -> 232
    //   140: aload_0
    //   141: getfield Zd : Ljava/lang/CharSequence;
    //   144: iload #8
    //   146: invokeinterface charAt : (I)C
    //   151: istore #9
    //   153: iload #9
    //   155: bipush #9
    //   157: if_icmpne -> 183
    //   160: iload #7
    //   162: aload_0
    //   163: getfield Zp : I
    //   166: iload #7
    //   168: iconst_1
    //   169: isub
    //   170: aload_0
    //   171: getfield Zp : I
    //   174: irem
    //   175: isub
    //   176: iadd
    //   177: istore #7
    //   179: aload_2
    //   180: ifnonnull -> 225
    //   183: iload #9
    //   185: invokestatic isHighSurrogate : (C)Z
    //   188: ifeq -> 215
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   197: athrow
    //   198: iinc #7, 1
    //   201: iinc #8, 1
    //   204: aload_2
    //   205: ifnonnull -> 225
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   214: athrow
    //   215: iinc #7, 1
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   224: athrow
    //   225: iinc #8, 1
    //   228: aload_2
    //   229: ifnonnull -> 134
    //   232: iload #7
    //   234: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	19	19	java/lang/RuntimeException
    //   23	32	32	java/lang/RuntimeException
    //   55	63	63	java/lang/RuntimeException
    //   82	96	96	java/lang/RuntimeException
    //   100	119	122	java/lang/RuntimeException
    //   179	191	194	java/lang/RuntimeException
    //   183	208	211	java/lang/RuntimeException
    //   198	218	221	java/lang/RuntimeException
  }
  
  public String Zo(int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    String[] arrayOfString = Zz.Za();
    int i = paramInt1;
    while (i < paramInt2) {
      try {
        if (this.ZX[i] != Zt)
          stringBuilder.append(this.Zd.charAt(i)); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      i++;
      if (arrayOfString == null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  void ZD(Zz paramZz) {
    if (paramZz.ZK()) {
      Zz zz = paramZz.ZX();
      try {
        if (zz != null)
          ZD(zz); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return;
    } 
    int i = paramZz.ZZ();
    try {
      if (this.ZX[i] != Zt) {
        this.ZH.set(i);
        this.ZX[i] = paramZz;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void ZG(Zz paramZz) {
    int i = paramZz.Z_();
    try {
      if (i < this.ZH.length())
        this.ZH.clear(paramZz.Z_(), this.ZH.length()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    paramZz.Zd();
  }
  
  Zz Zx(int paramInt) {
    int i = this.ZH.nextSetBit(paramInt);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (i != -1) ? this.ZX[i] : null;
  }
  
  Zz ZC(int paramInt) {
    int i = this.ZH.previousSetBit(paramInt - 1);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (i == -1) ? null : this.ZX[i];
  }
  
  private void Zr() {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zd : Ljava/lang/CharSequence;
    //   8: invokeinterface length : ()I
    //   13: ifne -> 28
    //   16: aload_0
    //   17: iconst_0
    //   18: newarray int
    //   20: putfield ZF : [I
    //   23: return
    //   24: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: iconst_0
    //   29: istore_2
    //   30: aload_0
    //   31: getfield Zd : Ljava/lang/CharSequence;
    //   34: invokeinterface length : ()I
    //   39: istore_3
    //   40: iconst_0
    //   41: istore #4
    //   43: iload #4
    //   45: iload_3
    //   46: if_icmpge -> 123
    //   49: aload_0
    //   50: getfield Zd : Ljava/lang/CharSequence;
    //   53: iload #4
    //   55: invokeinterface charAt : (I)C
    //   60: istore #5
    //   62: iload #5
    //   64: bipush #9
    //   66: if_icmpeq -> 84
    //   69: iload #5
    //   71: invokestatic isHighSurrogate : (C)Z
    //   74: ifeq -> 99
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: aload_0
    //   85: getfield ZE : Ljava/util/BitSet;
    //   88: iload_2
    //   89: invokevirtual set : (I)V
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: iload #5
    //   101: bipush #10
    //   103: if_icmpne -> 116
    //   106: iinc #2, 1
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   115: athrow
    //   116: iinc #4, 1
    //   119: aload_1
    //   120: ifnonnull -> 43
    //   123: aload_0
    //   124: getfield Zd : Ljava/lang/CharSequence;
    //   127: iload_3
    //   128: iconst_1
    //   129: isub
    //   130: invokeinterface charAt : (I)C
    //   135: bipush #10
    //   137: if_icmpeq -> 150
    //   140: iinc #2, 1
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   149: athrow
    //   150: iload_2
    //   151: newarray int
    //   153: astore #4
    //   155: aload #4
    //   157: iconst_0
    //   158: iconst_0
    //   159: iastore
    //   160: iconst_1
    //   161: istore #5
    //   163: iconst_0
    //   164: istore #6
    //   166: iload #6
    //   168: iload_3
    //   169: if_icmpge -> 233
    //   172: aload_0
    //   173: getfield Zd : Ljava/lang/CharSequence;
    //   176: iload #6
    //   178: invokeinterface charAt : (I)C
    //   183: istore #7
    //   185: iload #7
    //   187: bipush #10
    //   189: if_icmpne -> 226
    //   192: iload #6
    //   194: iconst_1
    //   195: iadd
    //   196: iload_3
    //   197: if_icmpne -> 214
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   206: athrow
    //   207: goto -> 233
    //   210: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   213: athrow
    //   214: aload #4
    //   216: iload #5
    //   218: iinc #5, 1
    //   221: iload #6
    //   223: iconst_1
    //   224: iadd
    //   225: iastore
    //   226: iinc #6, 1
    //   229: aload_1
    //   230: ifnonnull -> 166
    //   233: aload_0
    //   234: aload #4
    //   236: putfield ZF : [I
    //   239: return
    // Exception table:
    //   from	to	target	type
    //   4	24	24	java/lang/RuntimeException
    //   62	77	80	java/lang/RuntimeException
    //   69	92	95	java/lang/RuntimeException
    //   99	109	112	java/lang/RuntimeException
    //   123	143	146	java/lang/RuntimeException
    //   185	200	203	java/lang/RuntimeException
    //   192	210	210	java/lang/RuntimeException
  }
  
  private static String Zs(CharSequence paramCharSequence, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: astore #5
    //   5: iload_1
    //   6: ifeq -> 171
    //   9: iload_2
    //   10: ifeq -> 171
    //   13: goto -> 20
    //   16: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   19: athrow
    //   20: iload_3
    //   21: ifne -> 171
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: iload #4
    //   33: ifeq -> 164
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: aload_0
    //   44: invokeinterface length : ()I
    //   49: ifne -> 67
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   58: athrow
    //   59: ldc '\\n'
    //   61: astore_0
    //   62: aload #5
    //   64: ifnonnull -> 164
    //   67: aload_0
    //   68: aload_0
    //   69: invokeinterface length : ()I
    //   74: iconst_1
    //   75: isub
    //   76: invokeinterface charAt : (I)C
    //   81: istore #6
    //   83: iload #6
    //   85: bipush #10
    //   87: if_icmpeq -> 164
    //   90: iload #6
    //   92: bipush #13
    //   94: if_icmpeq -> 164
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: aload_0
    //   105: instanceof java/lang/StringBuilder
    //   108: ifeq -> 140
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: aload_0
    //   119: checkcast java/lang/StringBuilder
    //   122: bipush #10
    //   124: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: aload #5
    //   130: ifnonnull -> 164
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: new java/lang/StringBuilder
    //   143: dup
    //   144: aload_0
    //   145: invokespecial <init> : (Ljava/lang/CharSequence;)V
    //   148: astore #7
    //   150: aload #7
    //   152: bipush #10
    //   154: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   157: pop
    //   158: aload #7
    //   160: invokevirtual toString : ()Ljava/lang/String;
    //   163: astore_0
    //   164: aload_0
    //   165: invokeinterface toString : ()Ljava/lang/String;
    //   170: areturn
    //   171: new java/lang/StringBuilder
    //   174: dup
    //   175: invokespecial <init> : ()V
    //   178: astore #6
    //   180: iconst_0
    //   181: istore #7
    //   183: iconst_0
    //   184: istore #8
    //   186: aload_0
    //   187: invokeinterface length : ()I
    //   192: istore #9
    //   194: iload #8
    //   196: iload #9
    //   198: if_icmpge -> 655
    //   201: aload_0
    //   202: iload #8
    //   204: iinc #8, 1
    //   207: invokeinterface charAt : (I)C
    //   212: istore #10
    //   214: iload #10
    //   216: bipush #10
    //   218: if_icmpne -> 237
    //   221: aload #6
    //   223: iload #10
    //   225: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   228: pop
    //   229: iconst_0
    //   230: istore #7
    //   232: aload #5
    //   234: ifnonnull -> 650
    //   237: iload_3
    //   238: ifeq -> 472
    //   241: goto -> 248
    //   244: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   247: athrow
    //   248: iload #10
    //   250: bipush #92
    //   252: if_icmpne -> 472
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   261: athrow
    //   262: iload #8
    //   264: iload #9
    //   266: if_icmpge -> 472
    //   269: goto -> 276
    //   272: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   275: athrow
    //   276: aload_0
    //   277: iload #8
    //   279: invokeinterface charAt : (I)C
    //   284: bipush #117
    //   286: if_icmpne -> 472
    //   289: goto -> 296
    //   292: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   295: athrow
    //   296: iconst_0
    //   297: istore #11
    //   299: iload #8
    //   301: iconst_1
    //   302: isub
    //   303: istore #12
    //   305: iload #12
    //   307: iflt -> 341
    //   310: aload_0
    //   311: iload #12
    //   313: invokeinterface charAt : (I)C
    //   318: bipush #92
    //   320: if_icmpne -> 341
    //   323: iinc #11, 1
    //   326: iinc #12, -1
    //   329: aload #5
    //   331: ifnonnull -> 305
    //   334: goto -> 341
    //   337: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   340: athrow
    //   341: iload #11
    //   343: iconst_2
    //   344: irem
    //   345: ifne -> 371
    //   348: aload #6
    //   350: bipush #92
    //   352: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   355: pop
    //   356: iinc #7, 1
    //   359: aload #5
    //   361: ifnonnull -> 194
    //   364: goto -> 371
    //   367: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   370: athrow
    //   371: iconst_0
    //   372: istore #12
    //   374: iload #8
    //   376: istore #13
    //   378: iload #13
    //   380: iload #9
    //   382: if_icmpge -> 416
    //   385: aload_0
    //   386: iload #13
    //   388: invokeinterface charAt : (I)C
    //   393: bipush #117
    //   395: if_icmpne -> 416
    //   398: iinc #12, 1
    //   401: iinc #13, 1
    //   404: aload #5
    //   406: ifnonnull -> 378
    //   409: goto -> 416
    //   412: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   415: athrow
    //   416: aload_0
    //   417: iload #8
    //   419: iload #12
    //   421: iadd
    //   422: iload #8
    //   424: iload #12
    //   426: iadd
    //   427: iconst_4
    //   428: iadd
    //   429: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   434: invokeinterface toString : ()Ljava/lang/String;
    //   439: astore #13
    //   441: aload #6
    //   443: aload #13
    //   445: bipush #16
    //   447: invokestatic parseInt : (Ljava/lang/String;I)I
    //   450: i2c
    //   451: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   454: pop
    //   455: iload #8
    //   457: iload #12
    //   459: iconst_4
    //   460: iadd
    //   461: iadd
    //   462: istore #8
    //   464: iinc #7, 1
    //   467: aload #5
    //   469: ifnonnull -> 650
    //   472: iload_2
    //   473: ifne -> 550
    //   476: goto -> 483
    //   479: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   482: athrow
    //   483: iload #10
    //   485: bipush #13
    //   487: if_icmpne -> 550
    //   490: goto -> 497
    //   493: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   496: athrow
    //   497: aload #6
    //   499: bipush #10
    //   501: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   504: pop
    //   505: iconst_0
    //   506: istore #7
    //   508: iload #8
    //   510: iload #9
    //   512: if_icmpge -> 650
    //   515: aload_0
    //   516: iload #8
    //   518: invokeinterface charAt : (I)C
    //   523: bipush #10
    //   525: if_icmpne -> 650
    //   528: goto -> 535
    //   531: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   534: athrow
    //   535: iinc #8, 1
    //   538: aload #5
    //   540: ifnonnull -> 650
    //   543: goto -> 550
    //   546: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   549: athrow
    //   550: iload #10
    //   552: bipush #9
    //   554: if_icmpne -> 617
    //   557: goto -> 564
    //   560: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   563: athrow
    //   564: iload_1
    //   565: ifne -> 617
    //   568: goto -> 575
    //   571: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   574: athrow
    //   575: iconst_1
    //   576: iload #7
    //   578: iconst_1
    //   579: irem
    //   580: isub
    //   581: istore #11
    //   583: iconst_0
    //   584: istore #12
    //   586: iload #12
    //   588: iload #11
    //   590: if_icmpge -> 612
    //   593: aload #6
    //   595: bipush #32
    //   597: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   600: pop
    //   601: iinc #7, 1
    //   604: iinc #12, 1
    //   607: aload #5
    //   609: ifnonnull -> 586
    //   612: aload #5
    //   614: ifnonnull -> 650
    //   617: aload #6
    //   619: iload #10
    //   621: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   624: pop
    //   625: iload #10
    //   627: invokestatic isLowSurrogate : (C)Z
    //   630: ifne -> 650
    //   633: goto -> 640
    //   636: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   639: athrow
    //   640: iinc #7, 1
    //   643: goto -> 650
    //   646: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   649: athrow
    //   650: aload #5
    //   652: ifnonnull -> 194
    //   655: iload #4
    //   657: ifeq -> 732
    //   660: aload #6
    //   662: invokevirtual length : ()I
    //   665: ifne -> 682
    //   668: goto -> 675
    //   671: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   674: athrow
    //   675: ldc '\\n'
    //   677: areturn
    //   678: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   681: athrow
    //   682: aload #6
    //   684: aload #6
    //   686: invokevirtual length : ()I
    //   689: iconst_1
    //   690: isub
    //   691: invokevirtual charAt : (I)C
    //   694: istore #10
    //   696: iload #10
    //   698: bipush #10
    //   700: if_icmpeq -> 732
    //   703: iload #10
    //   705: bipush #13
    //   707: if_icmpeq -> 732
    //   710: goto -> 717
    //   713: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   716: athrow
    //   717: aload #6
    //   719: bipush #10
    //   721: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   724: pop
    //   725: goto -> 732
    //   728: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   731: athrow
    //   732: aload #6
    //   734: invokevirtual toString : ()Ljava/lang/String;
    //   737: areturn
    // Exception table:
    //   from	to	target	type
    //   5	13	16	java/lang/RuntimeException
    //   9	24	27	java/lang/RuntimeException
    //   20	36	39	java/lang/RuntimeException
    //   31	52	55	java/lang/RuntimeException
    //   83	97	100	java/lang/RuntimeException
    //   90	111	114	java/lang/RuntimeException
    //   104	133	136	java/lang/RuntimeException
    //   232	241	244	java/lang/RuntimeException
    //   237	255	258	java/lang/RuntimeException
    //   248	269	272	java/lang/RuntimeException
    //   262	289	292	java/lang/RuntimeException
    //   310	334	337	java/lang/RuntimeException
    //   341	364	367	java/lang/RuntimeException
    //   385	409	412	java/lang/RuntimeException
    //   464	476	479	java/lang/RuntimeException
    //   472	490	493	java/lang/RuntimeException
    //   508	528	531	java/lang/RuntimeException
    //   515	543	546	java/lang/RuntimeException
    //   535	557	560	java/lang/RuntimeException
    //   550	568	571	java/lang/RuntimeException
    //   612	633	636	java/lang/RuntimeException
    //   617	643	646	java/lang/RuntimeException
    //   655	668	671	java/lang/RuntimeException
    //   660	678	678	java/lang/RuntimeException
    //   696	710	713	java/lang/RuntimeException
    //   703	725	728	java/lang/RuntimeException
  }
  
  static String ZS(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    int[] arrayOfInt = paramString.codePoints().toArray();
    int i = arrayOfInt.length;
    String[] arrayOfString = Zz.Za();
    byte b = 0;
    while (b < i) {
      int j = arrayOfInt[b];
      try {
        switch (j) {
          case 8:
          
          case 9:
          
          case 10:
          
          case 12:
          
          case 13:
          
          case 34:
          
          case 39:
          
          case 92:
          
          default:
          
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      b++;
      continue;
      if (arrayOfString == null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  static String Zc(Reader paramReader) {
    try {
      return ZZ(paramReader);
    } catch (IOException iOException) {
      throw new RuntimeException(iOException);
    } 
  }
  
  static String ZZ(Reader paramReader) throws IOException {
    char[] arrayOfChar = new char[65536];
    int i = paramReader.read(arrayOfChar);
    try {
      if (i < 0)
        throw new IOException(a(27668, -13867)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (i < 65536) {
      char[] arrayOfChar1 = new char[i];
      System.arraycopy(arrayOfChar, 0, arrayOfChar1, 0, i);
      paramReader.close();
      return new String(arrayOfChar, 0, i);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(arrayOfChar);
    while (true) {
      i = paramReader.read(arrayOfChar);
      if (i > 0)
        stringBuilder.append(arrayOfChar, 0, i); 
      if (i != 65536) {
        paramReader.close();
        return stringBuilder.toString();
      } 
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'áÛ¢\\nÍN Ûpä'¯(Y¤\\bà¿û s¨¾÷'OÈ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #65
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
    //   67: ldc '#Èz'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_2
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #28
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
    //   127: putstatic net/portswigger/Zgp.a : [Ljava/lang/String;
    //   130: bipush #12
    //   132: anewarray java/lang/String
    //   135: putstatic net/portswigger/Zgp.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #47
    //   214: goto -> 243
    //   217: iconst_5
    //   218: goto -> 243
    //   221: bipush #38
    //   223: goto -> 243
    //   226: bipush #110
    //   228: goto -> 243
    //   231: bipush #62
    //   233: goto -> 243
    //   236: bipush #24
    //   238: goto -> 243
    //   241: bipush #120
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 97
    //   300: new net/portswigger/Zz
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic net/portswigger/Zgp.Zt : Lnet/portswigger/Zz;
    //   310: new net/portswigger/Zz
    //   313: dup
    //   314: invokespecial <init> : ()V
    //   317: putstatic net/portswigger/Zgp.Zq : Lnet/portswigger/Zz;
    //   320: getstatic net/portswigger/Zgp.Zt : Lnet/portswigger/Zz;
    //   323: iconst_1
    //   324: invokevirtual ZD : (Z)V
    //   327: getstatic net/portswigger/Zgp.Zq : Lnet/portswigger/Zz;
    //   330: iconst_1
    //   331: invokevirtual ZD : (Z)V
    //   334: getstatic net/portswigger/Zfh.EOF : Lnet/portswigger/Zfh;
    //   337: bipush #95
    //   339: anewarray net/portswigger/Zfh
    //   342: dup
    //   343: iconst_0
    //   344: getstatic net/portswigger/Zfh.COMMENT : Lnet/portswigger/Zfh;
    //   347: aastore
    //   348: dup
    //   349: iconst_1
    //   350: getstatic net/portswigger/Zfh.METADATA_HEADER : Lnet/portswigger/Zfh;
    //   353: aastore
    //   354: dup
    //   355: iconst_2
    //   356: getstatic net/portswigger/Zfh.NAME_HEADER : Lnet/portswigger/Zfh;
    //   359: aastore
    //   360: dup
    //   361: iconst_3
    //   362: getstatic net/portswigger/Zfh.DESCRIPTION_HEADER : Lnet/portswigger/Zfh;
    //   365: aastore
    //   366: dup
    //   367: iconst_4
    //   368: getstatic net/portswigger/Zfh.LANGUAGE_HEADER : Lnet/portswigger/Zfh;
    //   371: aastore
    //   372: dup
    //   373: iconst_5
    //   374: getstatic net/portswigger/Zfh.LANGUAGE_LEVEL_1 : Lnet/portswigger/Zfh;
    //   377: aastore
    //   378: dup
    //   379: bipush #6
    //   381: getstatic net/portswigger/Zfh.AUTHOR_HEADER : Lnet/portswigger/Zfh;
    //   384: aastore
    //   385: dup
    //   386: bipush #7
    //   388: getstatic net/portswigger/Zfh.TAGS_HEADER : Lnet/portswigger/Zfh;
    //   391: aastore
    //   392: dup
    //   393: bipush #8
    //   395: getstatic net/portswigger/Zfh.GIVEN_HEADER : Lnet/portswigger/Zfh;
    //   398: aastore
    //   399: dup
    //   400: bipush #9
    //   402: getstatic net/portswigger/Zfh.HOST_FREQ : Lnet/portswigger/Zfh;
    //   405: aastore
    //   406: dup
    //   407: bipush #10
    //   409: getstatic net/portswigger/Zfh.REQUEST_FREQ : Lnet/portswigger/Zfh;
    //   412: aastore
    //   413: dup
    //   414: bipush #11
    //   416: getstatic net/portswigger/Zfh.RESPONSE_FREQ : Lnet/portswigger/Zfh;
    //   419: aastore
    //   420: dup
    //   421: bipush #12
    //   423: getstatic net/portswigger/Zfh.INSERTION_POINT_FREQ : Lnet/portswigger/Zfh;
    //   426: aastore
    //   427: dup
    //   428: bipush #13
    //   430: getstatic net/portswigger/Zfh.ANY : Lnet/portswigger/Zfh;
    //   433: aastore
    //   434: dup
    //   435: bipush #14
    //   437: getstatic net/portswigger/Zfh.HEADER : Lnet/portswigger/Zfh;
    //   440: aastore
    //   441: dup
    //   442: bipush #15
    //   444: getstatic net/portswigger/Zfh.QUERY : Lnet/portswigger/Zfh;
    //   447: aastore
    //   448: dup
    //   449: bipush #16
    //   451: getstatic net/portswigger/Zfh.COOKIE : Lnet/portswigger/Zfh;
    //   454: aastore
    //   455: dup
    //   456: bipush #17
    //   458: getstatic net/portswigger/Zfh.DEFINE_HEADER : Lnet/portswigger/Zfh;
    //   461: aastore
    //   462: dup
    //   463: bipush #18
    //   465: getstatic net/portswigger/Zfh.RUN_FOR_EACH_HEADER : Lnet/portswigger/Zfh;
    //   468: aastore
    //   469: dup
    //   470: bipush #19
    //   472: getstatic net/portswigger/Zfh.EQUALS : Lnet/portswigger/Zfh;
    //   475: aastore
    //   476: dup
    //   477: bipush #20
    //   479: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_OPENING_QUOTE : Lnet/portswigger/Zfh;
    //   482: aastore
    //   483: dup
    //   484: bipush #21
    //   486: getstatic net/portswigger/Zfh.LITERAL_STRING_OPENING_QUOTE : Lnet/portswigger/Zfh;
    //   489: aastore
    //   490: dup
    //   491: bipush #22
    //   493: getstatic net/portswigger/Zfh.OPEN_BRACKET : Lnet/portswigger/Zfh;
    //   496: aastore
    //   497: dup
    //   498: bipush #23
    //   500: getstatic net/portswigger/Zfh.CLOSE_BRACKET : Lnet/portswigger/Zfh;
    //   503: aastore
    //   504: dup
    //   505: bipush #24
    //   507: getstatic net/portswigger/Zfh.NATURAL_NUMBER : Lnet/portswigger/Zfh;
    //   510: aastore
    //   511: dup
    //   512: bipush #25
    //   514: getstatic net/portswigger/Zfh.COMMA : Lnet/portswigger/Zfh;
    //   517: aastore
    //   518: dup
    //   519: bipush #26
    //   521: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_CLOSING_QUOTE : Lnet/portswigger/Zfh;
    //   524: aastore
    //   525: dup
    //   526: bipush #27
    //   528: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_LITERAL : Lnet/portswigger/Zfh;
    //   531: aastore
    //   532: dup
    //   533: bipush #28
    //   535: getstatic net/portswigger/Zfh.LITERAL_STRING_CLOSING_QUOTE : Lnet/portswigger/Zfh;
    //   538: aastore
    //   539: dup
    //   540: bipush #29
    //   542: getstatic net/portswigger/Zfh.LITERAL_STRING : Lnet/portswigger/Zfh;
    //   545: aastore
    //   546: dup
    //   547: bipush #30
    //   549: getstatic net/portswigger/Zfh.VARIABLE_START : Lnet/portswigger/Zfh;
    //   552: aastore
    //   553: dup
    //   554: bipush #31
    //   556: getstatic net/portswigger/Zfh.VARIABLE_END : Lnet/portswigger/Zfh;
    //   559: aastore
    //   560: dup
    //   561: bipush #32
    //   563: getstatic net/portswigger/Zfh.GENERATE_COLLABORATOR_ADDRESS_FUNCTION : Lnet/portswigger/Zfh;
    //   566: aastore
    //   567: dup
    //   568: bipush #33
    //   570: getstatic net/portswigger/Zfh.RANDOM_STR_FUNCTION : Lnet/portswigger/Zfh;
    //   573: aastore
    //   574: dup
    //   575: bipush #34
    //   577: getstatic net/portswigger/Zfh.TO_LOWER_FUNCTION : Lnet/portswigger/Zfh;
    //   580: aastore
    //   581: dup
    //   582: bipush #35
    //   584: getstatic net/portswigger/Zfh.TO_UPPER_FUNCTION : Lnet/portswigger/Zfh;
    //   587: aastore
    //   588: dup
    //   589: bipush #36
    //   591: getstatic net/portswigger/Zfh.REGEX_REPLACE_FUNCTION : Lnet/portswigger/Zfh;
    //   594: aastore
    //   595: dup
    //   596: bipush #37
    //   598: getstatic net/portswigger/Zfh.BASE64_ENCODE_FUNCTION : Lnet/portswigger/Zfh;
    //   601: aastore
    //   602: dup
    //   603: bipush #38
    //   605: getstatic net/portswigger/Zfh.BASE64_DECODE_FUNCTION : Lnet/portswigger/Zfh;
    //   608: aastore
    //   609: dup
    //   610: bipush #39
    //   612: getstatic net/portswigger/Zfh.SHA1_FUNCTION : Lnet/portswigger/Zfh;
    //   615: aastore
    //   616: dup
    //   617: bipush #40
    //   619: getstatic net/portswigger/Zfh.SHA256_FUNCTION : Lnet/portswigger/Zfh;
    //   622: aastore
    //   623: dup
    //   624: bipush #41
    //   626: getstatic net/portswigger/Zfh.MD5_FUNCTION : Lnet/portswigger/Zfh;
    //   629: aastore
    //   630: dup
    //   631: bipush #42
    //   633: getstatic net/portswigger/Zfh.REQUEST_OBJECT : Lnet/portswigger/Zfh;
    //   636: aastore
    //   637: dup
    //   638: bipush #43
    //   640: getstatic net/portswigger/Zfh.RESPONSE_OBJECT : Lnet/portswigger/Zfh;
    //   643: aastore
    //   644: dup
    //   645: bipush #44
    //   647: getstatic net/portswigger/Zfh.REQUEST_RESPONSE_COMMON_PROPERTY : Lnet/portswigger/Zfh;
    //   650: aastore
    //   651: dup
    //   652: bipush #45
    //   654: getstatic net/portswigger/Zfh.REQUEST_SPECIFIC_PROPERTY : Lnet/portswigger/Zfh;
    //   657: aastore
    //   658: dup
    //   659: bipush #46
    //   661: getstatic net/portswigger/Zfh.RESPONSE_SPECIFIC_PROPERTY : Lnet/portswigger/Zfh;
    //   664: aastore
    //   665: dup
    //   666: bipush #47
    //   668: getstatic net/portswigger/Zfh.URL : Lnet/portswigger/Zfh;
    //   671: aastore
    //   672: dup
    //   673: bipush #48
    //   675: getstatic net/portswigger/Zfh.URL_PROPERTY : Lnet/portswigger/Zfh;
    //   678: aastore
    //   679: dup
    //   680: bipush #49
    //   682: getstatic net/portswigger/Zfh.REPORT_ISSUE_HEADER : Lnet/portswigger/Zfh;
    //   685: aastore
    //   686: dup
    //   687: bipush #50
    //   689: getstatic net/portswigger/Zfh.SEVERITY_HEADER : Lnet/portswigger/Zfh;
    //   692: aastore
    //   693: dup
    //   694: bipush #51
    //   696: getstatic net/portswigger/Zfh.HIGH_SEVERITY : Lnet/portswigger/Zfh;
    //   699: aastore
    //   700: dup
    //   701: bipush #52
    //   703: getstatic net/portswigger/Zfh.MEDIUM_SEVERITY : Lnet/portswigger/Zfh;
    //   706: aastore
    //   707: dup
    //   708: bipush #53
    //   710: getstatic net/portswigger/Zfh.LOW_SEVERITY : Lnet/portswigger/Zfh;
    //   713: aastore
    //   714: dup
    //   715: bipush #54
    //   717: getstatic net/portswigger/Zfh.INFO_SEVERITY : Lnet/portswigger/Zfh;
    //   720: aastore
    //   721: dup
    //   722: bipush #55
    //   724: getstatic net/portswigger/Zfh.CONFIDENCE_HEADER : Lnet/portswigger/Zfh;
    //   727: aastore
    //   728: dup
    //   729: bipush #56
    //   731: getstatic net/portswigger/Zfh.CERTAIN_CONFIDENCE : Lnet/portswigger/Zfh;
    //   734: aastore
    //   735: dup
    //   736: bipush #57
    //   738: getstatic net/portswigger/Zfh.FIRM_CONFIDENCE : Lnet/portswigger/Zfh;
    //   741: aastore
    //   742: dup
    //   743: bipush #58
    //   745: getstatic net/portswigger/Zfh.TENTATIVE_CONFIDENCE : Lnet/portswigger/Zfh;
    //   748: aastore
    //   749: dup
    //   750: bipush #59
    //   752: getstatic net/portswigger/Zfh.REMEDIATION_HEADER : Lnet/portswigger/Zfh;
    //   755: aastore
    //   756: dup
    //   757: bipush #60
    //   759: getstatic net/portswigger/Zfh.DETAIL_HEADER : Lnet/portswigger/Zfh;
    //   762: aastore
    //   763: dup
    //   764: bipush #61
    //   766: getstatic net/portswigger/Zfh.IF_HEADER : Lnet/portswigger/Zfh;
    //   769: aastore
    //   770: dup
    //   771: bipush #62
    //   773: getstatic net/portswigger/Zfh.ELSE_HEADER : Lnet/portswigger/Zfh;
    //   776: aastore
    //   777: dup
    //   778: bipush #63
    //   780: getstatic net/portswigger/Zfh.IF_FOOTER : Lnet/portswigger/Zfh;
    //   783: aastore
    //   784: dup
    //   785: bipush #64
    //   787: getstatic net/portswigger/Zfh.IN_KEY : Lnet/portswigger/Zfh;
    //   790: aastore
    //   791: dup
    //   792: bipush #65
    //   794: getstatic net/portswigger/Zfh.IS_KEY : Lnet/portswigger/Zfh;
    //   797: aastore
    //   798: dup
    //   799: bipush #66
    //   801: getstatic net/portswigger/Zfh.MATCHES_KEY : Lnet/portswigger/Zfh;
    //   804: aastore
    //   805: dup
    //   806: bipush #67
    //   808: getstatic net/portswigger/Zfh.DIFFERS_FROM_KEY : Lnet/portswigger/Zfh;
    //   811: aastore
    //   812: dup
    //   813: bipush #68
    //   815: getstatic net/portswigger/Zfh.COLON : Lnet/portswigger/Zfh;
    //   818: aastore
    //   819: dup
    //   820: bipush #69
    //   822: getstatic net/portswigger/Zfh.THEN : Lnet/portswigger/Zfh;
    //   825: aastore
    //   826: dup
    //   827: bipush #70
    //   829: getstatic net/portswigger/Zfh.BODY : Lnet/portswigger/Zfh;
    //   832: aastore
    //   833: dup
    //   834: bipush #71
    //   836: getstatic net/portswigger/Zfh.SEND : Lnet/portswigger/Zfh;
    //   839: aastore
    //   840: dup
    //   841: bipush #72
    //   843: getstatic net/portswigger/Zfh.REQUEST_HEADER : Lnet/portswigger/Zfh;
    //   846: aastore
    //   847: dup
    //   848: bipush #73
    //   850: getstatic net/portswigger/Zfh.CALLED : Lnet/portswigger/Zfh;
    //   853: aastore
    //   854: dup
    //   855: bipush #74
    //   857: getstatic net/portswigger/Zfh.METHOD : Lnet/portswigger/Zfh;
    //   860: aastore
    //   861: dup
    //   862: bipush #75
    //   864: getstatic net/portswigger/Zfh.PATH : Lnet/portswigger/Zfh;
    //   867: aastore
    //   868: dup
    //   869: bipush #76
    //   871: getstatic net/portswigger/Zfh.QUERIES : Lnet/portswigger/Zfh;
    //   874: aastore
    //   875: dup
    //   876: bipush #77
    //   878: getstatic net/portswigger/Zfh.APPENDING : Lnet/portswigger/Zfh;
    //   881: aastore
    //   882: dup
    //   883: bipush #78
    //   885: getstatic net/portswigger/Zfh.REMOVING : Lnet/portswigger/Zfh;
    //   888: aastore
    //   889: dup
    //   890: bipush #79
    //   892: getstatic net/portswigger/Zfh.REPLACING : Lnet/portswigger/Zfh;
    //   895: aastore
    //   896: dup
    //   897: bipush #80
    //   899: getstatic net/portswigger/Zfh.HEADERS : Lnet/portswigger/Zfh;
    //   902: aastore
    //   903: dup
    //   904: bipush #81
    //   906: getstatic net/portswigger/Zfh.ANY_KEY : Lnet/portswigger/Zfh;
    //   909: aastore
    //   910: dup
    //   911: bipush #82
    //   913: getstatic net/portswigger/Zfh.DNS_KEY : Lnet/portswigger/Zfh;
    //   916: aastore
    //   917: dup
    //   918: bipush #83
    //   920: getstatic net/portswigger/Zfh.HTTP_KEY : Lnet/portswigger/Zfh;
    //   923: aastore
    //   924: dup
    //   925: bipush #84
    //   927: getstatic net/portswigger/Zfh.SMTP_KEY : Lnet/portswigger/Zfh;
    //   930: aastore
    //   931: dup
    //   932: bipush #85
    //   934: getstatic net/portswigger/Zfh.INTERACTIONS_KEY : Lnet/portswigger/Zfh;
    //   937: aastore
    //   938: dup
    //   939: bipush #86
    //   941: getstatic net/portswigger/Zfh.PAYLOAD_HEADER : Lnet/portswigger/Zfh;
    //   944: aastore
    //   945: dup
    //   946: bipush #87
    //   948: getstatic net/portswigger/Zfh.BOOL_AND : Lnet/portswigger/Zfh;
    //   951: aastore
    //   952: dup
    //   953: bipush #88
    //   955: getstatic net/portswigger/Zfh.BOOL_OR : Lnet/portswigger/Zfh;
    //   958: aastore
    //   959: dup
    //   960: bipush #89
    //   962: getstatic net/portswigger/Zfh.BOOL_NOT : Lnet/portswigger/Zfh;
    //   965: aastore
    //   966: dup
    //   967: bipush #90
    //   969: getstatic net/portswigger/Zfh.VARIABLE_NAME : Lnet/portswigger/Zfh;
    //   972: aastore
    //   973: dup
    //   974: bipush #91
    //   976: getstatic net/portswigger/Zfh.REQUEST_NAME : Lnet/portswigger/Zfh;
    //   979: aastore
    //   980: dup
    //   981: bipush #92
    //   983: getstatic net/portswigger/Zfh.DOT : Lnet/portswigger/Zfh;
    //   986: aastore
    //   987: dup
    //   988: bipush #93
    //   990: getstatic net/portswigger/Zfh.UNKNOWN : Lnet/portswigger/Zfh;
    //   993: aastore
    //   994: dup
    //   995: bipush #94
    //   997: getstatic net/portswigger/Zfh.UNKNOWN_STRING : Lnet/portswigger/Zfh;
    //   1000: aastore
    //   1001: invokestatic of : (Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;
    //   1004: putstatic net/portswigger/Zgp.Zb : Ljava/util/EnumSet;
    //   1007: getstatic net/portswigger/Zfh.NEWLINE : Lnet/portswigger/Zfh;
    //   1010: invokestatic of : (Ljava/lang/Enum;)Ljava/util/EnumSet;
    //   1013: putstatic net/portswigger/Zgp.ZN : Ljava/util/EnumSet;
    //   1016: getstatic net/portswigger/Zfh._TOKEN_1 : Lnet/portswigger/Zfh;
    //   1019: getstatic net/portswigger/Zfh._TOKEN_2 : Lnet/portswigger/Zfh;
    //   1022: getstatic net/portswigger/Zfh._TOKEN_3 : Lnet/portswigger/Zfh;
    //   1025: getstatic net/portswigger/Zfh._TOKEN_4 : Lnet/portswigger/Zfh;
    //   1028: getstatic net/portswigger/Zfh._TOKEN_5 : Lnet/portswigger/Zfh;
    //   1031: invokestatic of : (Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;
    //   1034: putstatic net/portswigger/Zgp.Za : Ljava/util/EnumSet;
    //   1037: ldc net/portswigger/Zfh
    //   1039: invokestatic noneOf : (Ljava/lang/Class;)Ljava/util/EnumSet;
    //   1042: putstatic net/portswigger/Zgp.ZQ : Ljava/util/EnumSet;
    //   1045: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6C11) & 0xFFFF;
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
      char c = 'ú';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zgp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */