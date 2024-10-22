package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class Ztfc {
  private static final Zllt ZG;
  
  private static final Zllt Zr;
  
  private static final Zllt Zb;
  
  private static final Zllt ZY;
  
  private static final Zllt Zn;
  
  private static final Zllt Zq;
  
  private static final Zllt Zt;
  
  private static final Zllt Zj;
  
  private static final Zllt ZO;
  
  private static final Zllt Zs;
  
  private static final Zllt Zc;
  
  private static final Zllt Zu;
  
  private static final Zllt Zk;
  
  private static final Zllt ZK;
  
  private static final Zllt Zo;
  
  private static final Zllt Z_;
  
  private static final Zllt Zf;
  
  private static final Zllt Zl;
  
  private static final Zllt ZR;
  
  private static final List<Zllt> ZD;
  
  private final Zlk4 ZU;
  
  public Ztfc(Zlk4 paramZlk4) {
    this.ZU = paramZlk4;
  }
  
  public List<Zllr> Zn() {
    return Zq(EnumSet.of(Zzu2.UNIDENTIFIED_CODE_INJECTION), EnumSet.of(Zxrs.SINGLE_QUOTED, Zxrs.DOUBLE_QUOTED, Zxrs.UNQUOTED, Zxrs.INTERPOLATED));
  }
  
  public List<Zllr> ZR() {
    return Zq(EnumSet.of(Zzu2.RUBY_CODE_INJECTION), EnumSet.of(Zxrs.SINGLE_QUOTED, Zxrs.DOUBLE_QUOTED));
  }
  
  public List<Zllr> ZS() {
    return Zq(EnumSet.of(Zzu2.PYTHON_CODE_INJECTION), EnumSet.of(Zxrs.SINGLE_QUOTED, Zxrs.DOUBLE_QUOTED, Zxrs.UNQUOTED));
  }
  
  public List<Zllr> Zi(String paramString) {
    return ZY.ZW.equals(paramString) ? Zq(EnumSet.of(Zzu2.PHP_CODE_INJECTION, Zzu2.PERL_CODE_INJECTION), EnumSet.of(Zxrs.SINGLE_QUOTED)) : (Zb.ZW.equals(paramString) ? Zq(EnumSet.of(Zzu2.PHP_CODE_INJECTION, Zzu2.PERL_CODE_INJECTION), EnumSet.of(Zxrs.DOUBLE_QUOTED)) : (ZG.ZW.equals(paramString) ? Zq(EnumSet.of(Zzu2.PHP_CODE_INJECTION, Zzu2.PERL_CODE_INJECTION, Zzu2.RUBY_CODE_INJECTION), EnumSet.of(Zxrs.UNQUOTED)) : (Zr.ZW.equals(paramString) ? Zq(EnumSet.of(Zzu2.PHP_CODE_INJECTION, Zzu2.PERL_CODE_INJECTION, Zzu2.RUBY_CODE_INJECTION), EnumSet.of(Zxrs.INTERPOLATED)) : Collections.emptyList())));
  }
  
  public List<Zllr> ZF() {
    return Zq(EnumSet.of(Zzu2.PYTHON_CODE_INJECTION, Zzu2.RUBY_CODE_INJECTION, Zzu2.PHP_CODE_INJECTION, Zzu2.PERL_CODE_INJECTION), EnumSet.of(Zxrs.SINGLE_QUOTED, Zxrs.DOUBLE_QUOTED, Zxrs.UNQUOTED));
  }
  
  private List<Zllr> Zq(EnumSet<? extends Zvs> paramEnumSet, EnumSet<Zxrs> paramEnumSet1) {
    ArrayList<Zllt> arrayList = new ArrayList();
    Iterator<Zllt> iterator = ZD.iterator();
    int[] arrayOfInt = Zxsl.Ze();
    while (iterator.hasNext()) {
      Zllt zllt = iterator.next();
      if (paramEnumSet1.contains(zllt.ZX) && paramEnumSet.contains(zllt.ZM.ZU) && this.ZU.ZH(zllt.Zf))
        arrayList.add(zllt); 
      if (arrayOfInt != null)
        break; 
    } 
    return (List)arrayList;
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '%) zE)tTBDPWb@CDC[b[ODX"\\bObNFM\\bRPjHNMEaWUXViU@NVZ/\\t|_nUWNREsQJD|_sQJDBSb]W\\t  @tQIFLT.%tTBDP"SNX, ,\\ttTBDP"|\,zE \\rtTBDPSd\\t|\ ))%'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: iconst_2
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #13
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 128
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: ldc 'Wa^m'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: iconst_2
    //   77: istore_2
    //   78: iconst_m1
    //   79: istore_1
    //   80: bipush #127
    //   82: iinc #1, 1
    //   85: aload_3
    //   86: iload_1
    //   87: dup
    //   88: iload_2
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 128
    //   97: aload_0
    //   98: swap
    //   99: iload #4
    //   101: iinc #4, 1
    //   104: swap
    //   105: aastore
    //   106: iload_1
    //   107: iload_2
    //   108: iadd
    //   109: dup
    //   110: istore_1
    //   111: iload #5
    //   113: if_icmpge -> 125
    //   116: aload_3
    //   117: iload_1
    //   118: invokevirtual charAt : (I)C
    //   121: istore_2
    //   122: goto -> 80
    //   125: goto -> 284
    //   128: dup_x2
    //   129: pop
    //   130: invokevirtual toCharArray : ()[C
    //   133: dup_x1
    //   134: arraylength
    //   135: dup_x2
    //   136: pop
    //   137: iconst_0
    //   138: istore #6
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iconst_1
    //   144: if_icmpgt -> 244
    //   147: dup2
    //   148: swap
    //   149: iload #6
    //   151: dup2_x1
    //   152: caload
    //   153: swap
    //   154: iload #6
    //   156: bipush #7
    //   158: irem
    //   159: tableswitch default -> 226, 0 -> 196, 1 -> 201, 2 -> 206, 3 -> 211, 4 -> 216, 5 -> 221
    //   196: bipush #10
    //   198: goto -> 228
    //   201: bipush #53
    //   203: goto -> 228
    //   206: bipush #42
    //   208: goto -> 228
    //   211: bipush #44
    //   213: goto -> 228
    //   216: bipush #45
    //   218: goto -> 228
    //   221: bipush #60
    //   223: goto -> 228
    //   226: bipush #50
    //   228: ixor
    //   229: ixor
    //   230: i2c
    //   231: castore
    //   232: iinc #6, 1
    //   235: dup
    //   236: ifne -> 244
    //   239: dup2
    //   240: dup_x1
    //   241: goto -> 151
    //   244: dup2_x1
    //   245: pop2
    //   246: dup_x2
    //   247: iload #6
    //   249: if_icmpgt -> 147
    //   252: pop
    //   253: new java/lang/String
    //   256: dup_x1
    //   257: swap
    //   258: invokespecial <init> : ([C)V
    //   261: invokevirtual intern : ()Ljava/lang/String;
    //   264: swap
    //   265: pop
    //   266: swap
    //   267: tableswitch default -> 39, 0 -> 97
    //   284: new burp/Zllt
    //   287: dup
    //   288: getstatic burp/Zzu2.UNIDENTIFIED_CODE_INJECTION : Lburp/Zzu2;
    //   291: aload_0
    //   292: bipush #12
    //   294: aaload
    //   295: getstatic burp/Zxrs.UNQUOTED : Lburp/Zxrs;
    //   298: new burp/Zs9i
    //   301: dup
    //   302: iconst_3
    //   303: invokespecial <init> : (B)V
    //   306: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   309: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   312: putstatic burp/Ztfc.ZG : Lburp/Zllt;
    //   315: new burp/Zllt
    //   318: dup
    //   319: getstatic burp/Zzu2.UNIDENTIFIED_CODE_INJECTION : Lburp/Zzu2;
    //   322: getstatic burp/Ztfc.ZG : Lburp/Zllt;
    //   325: getfield ZW : Ljava/lang/String;
    //   328: aload_0
    //   329: bipush #13
    //   331: aaload
    //   332: swap
    //   333: aload_0
    //   334: iconst_3
    //   335: aaload
    //   336: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   341: getstatic burp/Zxrs.INTERPOLATED : Lburp/Zxrs;
    //   344: new burp/Zs9i
    //   347: dup
    //   348: iconst_2
    //   349: invokespecial <init> : (B)V
    //   352: getstatic burp/Zlk4.FAST : Lburp/Zlk4;
    //   355: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   358: putstatic burp/Ztfc.Zr : Lburp/Zllt;
    //   361: new burp/Zllt
    //   364: dup
    //   365: getstatic burp/Zzu2.UNIDENTIFIED_CODE_INJECTION : Lburp/Zzu2;
    //   368: getstatic burp/Ztfc.ZG : Lburp/Zllt;
    //   371: getfield ZW : Ljava/lang/String;
    //   374: aload_0
    //   375: iconst_0
    //   376: aaload
    //   377: swap
    //   378: aload_0
    //   379: iconst_1
    //   380: aaload
    //   381: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   386: getstatic burp/Zxrs.DOUBLE_QUOTED : Lburp/Zxrs;
    //   389: new burp/Zs9i
    //   392: dup
    //   393: iconst_0
    //   394: invokespecial <init> : (B)V
    //   397: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   400: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   403: putstatic burp/Ztfc.Zb : Lburp/Zllt;
    //   406: new burp/Zllt
    //   409: dup
    //   410: getstatic burp/Zzu2.UNIDENTIFIED_CODE_INJECTION : Lburp/Zzu2;
    //   413: getstatic burp/Ztfc.ZG : Lburp/Zllt;
    //   416: getfield ZW : Ljava/lang/String;
    //   419: aload_0
    //   420: bipush #16
    //   422: aaload
    //   423: swap
    //   424: aload_0
    //   425: bipush #21
    //   427: aaload
    //   428: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   433: getstatic burp/Zxrs.SINGLE_QUOTED : Lburp/Zxrs;
    //   436: new burp/Zs9i
    //   439: dup
    //   440: iconst_1
    //   441: invokespecial <init> : (B)V
    //   444: getstatic burp/Zlk4.NORMAL : Lburp/Zlk4;
    //   447: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   450: putstatic burp/Ztfc.ZY : Lburp/Zllt;
    //   453: new burp/Zllt
    //   456: dup
    //   457: getstatic burp/Zzu2.PERL_CODE_INJECTION : Lburp/Zzu2;
    //   460: aload_0
    //   461: bipush #17
    //   463: aaload
    //   464: getstatic burp/Zxrs.UNQUOTED : Lburp/Zxrs;
    //   467: new burp/Zlmy
    //   470: dup
    //   471: iconst_3
    //   472: invokespecial <init> : (B)V
    //   475: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   478: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   481: putstatic burp/Ztfc.Zn : Lburp/Zllt;
    //   484: new burp/Zllt
    //   487: dup
    //   488: getstatic burp/Zzu2.PERL_CODE_INJECTION : Lburp/Zzu2;
    //   491: getstatic burp/Ztfc.Zn : Lburp/Zllt;
    //   494: getfield ZW : Ljava/lang/String;
    //   497: aload_0
    //   498: bipush #18
    //   500: aaload
    //   501: swap
    //   502: aload_0
    //   503: bipush #15
    //   505: aaload
    //   506: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   511: getstatic burp/Zxrs.INTERPOLATED : Lburp/Zxrs;
    //   514: new burp/Zlmy
    //   517: dup
    //   518: iconst_2
    //   519: invokespecial <init> : (B)V
    //   522: getstatic burp/Zlk4.FAST : Lburp/Zlk4;
    //   525: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   528: putstatic burp/Ztfc.Zq : Lburp/Zllt;
    //   531: new burp/Zllt
    //   534: dup
    //   535: getstatic burp/Zzu2.PERL_CODE_INJECTION : Lburp/Zzu2;
    //   538: getstatic burp/Ztfc.Zn : Lburp/Zllt;
    //   541: getfield ZW : Ljava/lang/String;
    //   544: aload_0
    //   545: bipush #22
    //   547: aaload
    //   548: swap
    //   549: aload_0
    //   550: bipush #20
    //   552: aaload
    //   553: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   558: getstatic burp/Zxrs.DOUBLE_QUOTED : Lburp/Zxrs;
    //   561: new burp/Zlmy
    //   564: dup
    //   565: iconst_0
    //   566: invokespecial <init> : (B)V
    //   569: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   572: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   575: putstatic burp/Ztfc.Zt : Lburp/Zllt;
    //   578: new burp/Zllt
    //   581: dup
    //   582: getstatic burp/Zzu2.PERL_CODE_INJECTION : Lburp/Zzu2;
    //   585: getstatic burp/Ztfc.Zn : Lburp/Zllt;
    //   588: getfield ZW : Ljava/lang/String;
    //   591: aload_0
    //   592: bipush #10
    //   594: aaload
    //   595: swap
    //   596: aload_0
    //   597: iconst_4
    //   598: aaload
    //   599: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   604: getstatic burp/Zxrs.SINGLE_QUOTED : Lburp/Zxrs;
    //   607: new burp/Zlmy
    //   610: dup
    //   611: iconst_1
    //   612: invokespecial <init> : (B)V
    //   615: getstatic burp/Zlk4.NORMAL : Lburp/Zlk4;
    //   618: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   621: putstatic burp/Ztfc.Zj : Lburp/Zllt;
    //   624: new burp/Zllt
    //   627: dup
    //   628: getstatic burp/Zzu2.PHP_CODE_INJECTION : Lburp/Zzu2;
    //   631: getstatic burp/Zr3z.TIME_BASED : Lburp/Zr3z;
    //   634: invokestatic Zo : (Lburp/Zvs;Lburp/Zr3z;)Lburp/Ze46;
    //   637: aload_0
    //   638: iconst_5
    //   639: aaload
    //   640: getstatic burp/Zxrs.UNQUOTED : Lburp/Zxrs;
    //   643: new burp/Zrsk
    //   646: dup
    //   647: iconst_3
    //   648: invokespecial <init> : (B)V
    //   651: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   654: invokespecial <init> : (Lburp/Ze46;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   657: putstatic burp/Ztfc.ZO : Lburp/Zllt;
    //   660: new burp/Zllt
    //   663: dup
    //   664: getstatic burp/Zzu2.PHP_CODE_INJECTION : Lburp/Zzu2;
    //   667: getstatic burp/Zr3z.TIME_BASED : Lburp/Zr3z;
    //   670: invokestatic Zo : (Lburp/Zvs;Lburp/Zr3z;)Lburp/Ze46;
    //   673: getstatic burp/Ztfc.ZO : Lburp/Zllt;
    //   676: getfield ZW : Ljava/lang/String;
    //   679: aload_0
    //   680: bipush #18
    //   682: aaload
    //   683: swap
    //   684: aload_0
    //   685: bipush #15
    //   687: aaload
    //   688: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   693: getstatic burp/Zxrs.INTERPOLATED : Lburp/Zxrs;
    //   696: new burp/Zrsk
    //   699: dup
    //   700: iconst_2
    //   701: invokespecial <init> : (B)V
    //   704: getstatic burp/Zlk4.FAST : Lburp/Zlk4;
    //   707: invokespecial <init> : (Lburp/Ze46;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   710: putstatic burp/Ztfc.Zs : Lburp/Zllt;
    //   713: new burp/Zllt
    //   716: dup
    //   717: getstatic burp/Zzu2.PHP_CODE_INJECTION : Lburp/Zzu2;
    //   720: getstatic burp/Zr3z.TIME_BASED : Lburp/Zr3z;
    //   723: invokestatic Zo : (Lburp/Zvs;Lburp/Zr3z;)Lburp/Ze46;
    //   726: getstatic burp/Ztfc.ZO : Lburp/Zllt;
    //   729: getfield ZW : Ljava/lang/String;
    //   732: aload_0
    //   733: bipush #22
    //   735: aaload
    //   736: swap
    //   737: aload_0
    //   738: bipush #20
    //   740: aaload
    //   741: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   746: getstatic burp/Zxrs.DOUBLE_QUOTED : Lburp/Zxrs;
    //   749: new burp/Zrsk
    //   752: dup
    //   753: iconst_0
    //   754: invokespecial <init> : (B)V
    //   757: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   760: invokespecial <init> : (Lburp/Ze46;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   763: putstatic burp/Ztfc.Zc : Lburp/Zllt;
    //   766: new burp/Zllt
    //   769: dup
    //   770: getstatic burp/Zzu2.PHP_CODE_INJECTION : Lburp/Zzu2;
    //   773: getstatic burp/Zr3z.TIME_BASED : Lburp/Zr3z;
    //   776: invokestatic Zo : (Lburp/Zvs;Lburp/Zr3z;)Lburp/Ze46;
    //   779: getstatic burp/Ztfc.ZO : Lburp/Zllt;
    //   782: getfield ZW : Ljava/lang/String;
    //   785: aload_0
    //   786: bipush #10
    //   788: aaload
    //   789: swap
    //   790: aload_0
    //   791: iconst_4
    //   792: aaload
    //   793: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   798: getstatic burp/Zxrs.SINGLE_QUOTED : Lburp/Zxrs;
    //   801: new burp/Zrsk
    //   804: dup
    //   805: iconst_1
    //   806: invokespecial <init> : (B)V
    //   809: getstatic burp/Zlk4.NORMAL : Lburp/Zlk4;
    //   812: invokespecial <init> : (Lburp/Ze46;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   815: putstatic burp/Ztfc.Zu : Lburp/Zllt;
    //   818: new burp/Zllt
    //   821: dup
    //   822: getstatic burp/Zzu2.PYTHON_CODE_INJECTION : Lburp/Zzu2;
    //   825: aload_0
    //   826: bipush #6
    //   828: aaload
    //   829: getstatic burp/Zxrs.UNQUOTED : Lburp/Zxrs;
    //   832: new burp/Zsvt
    //   835: dup
    //   836: iconst_2
    //   837: invokespecial <init> : (B)V
    //   840: getstatic burp/Zlk4.FAST : Lburp/Zlk4;
    //   843: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   846: putstatic burp/Ztfc.Zk : Lburp/Zllt;
    //   849: new burp/Zllt
    //   852: dup
    //   853: getstatic burp/Zzu2.PYTHON_CODE_INJECTION : Lburp/Zzu2;
    //   856: getstatic burp/Ztfc.Zk : Lburp/Zllt;
    //   859: getfield ZW : Ljava/lang/String;
    //   862: aload_0
    //   863: bipush #7
    //   865: aaload
    //   866: swap
    //   867: aload_0
    //   868: bipush #14
    //   870: aaload
    //   871: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   876: getstatic burp/Zxrs.DOUBLE_QUOTED : Lburp/Zxrs;
    //   879: new burp/Zsvt
    //   882: dup
    //   883: iconst_0
    //   884: invokespecial <init> : (B)V
    //   887: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   890: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   893: putstatic burp/Ztfc.ZK : Lburp/Zllt;
    //   896: new burp/Zllt
    //   899: dup
    //   900: getstatic burp/Zzu2.PYTHON_CODE_INJECTION : Lburp/Zzu2;
    //   903: getstatic burp/Ztfc.Zk : Lburp/Zllt;
    //   906: getfield ZW : Ljava/lang/String;
    //   909: aload_0
    //   910: iconst_2
    //   911: aaload
    //   912: swap
    //   913: aload_0
    //   914: bipush #24
    //   916: aaload
    //   917: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   922: getstatic burp/Zxrs.SINGLE_QUOTED : Lburp/Zxrs;
    //   925: new burp/Zsvt
    //   928: dup
    //   929: iconst_1
    //   930: invokespecial <init> : (B)V
    //   933: getstatic burp/Zlk4.NORMAL : Lburp/Zlk4;
    //   936: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   939: putstatic burp/Ztfc.Zo : Lburp/Zllt;
    //   942: new burp/Zllt
    //   945: dup
    //   946: getstatic burp/Zzu2.RUBY_CODE_INJECTION : Lburp/Zzu2;
    //   949: aload_0
    //   950: bipush #8
    //   952: aaload
    //   953: getstatic burp/Zxrs.UNQUOTED : Lburp/Zxrs;
    //   956: new burp/Zkjc
    //   959: dup
    //   960: iconst_3
    //   961: invokespecial <init> : (B)V
    //   964: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   967: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   970: putstatic burp/Ztfc.Z_ : Lburp/Zllt;
    //   973: new burp/Zllt
    //   976: dup
    //   977: getstatic burp/Zzu2.RUBY_CODE_INJECTION : Lburp/Zzu2;
    //   980: getstatic burp/Ztfc.Z_ : Lburp/Zllt;
    //   983: getfield ZW : Ljava/lang/String;
    //   986: aload_0
    //   987: bipush #18
    //   989: aaload
    //   990: swap
    //   991: aload_0
    //   992: bipush #15
    //   994: aaload
    //   995: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1000: getstatic burp/Zxrs.INTERPOLATED : Lburp/Zxrs;
    //   1003: new burp/Zkjc
    //   1006: dup
    //   1007: iconst_2
    //   1008: invokespecial <init> : (B)V
    //   1011: getstatic burp/Zlk4.FAST : Lburp/Zlk4;
    //   1014: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   1017: putstatic burp/Ztfc.Zf : Lburp/Zllt;
    //   1020: new burp/Zllt
    //   1023: dup
    //   1024: getstatic burp/Zzu2.RUBY_CODE_INJECTION : Lburp/Zzu2;
    //   1027: getstatic burp/Ztfc.Z_ : Lburp/Zllt;
    //   1030: getfield ZW : Ljava/lang/String;
    //   1033: aload_0
    //   1034: bipush #23
    //   1036: aaload
    //   1037: swap
    //   1038: aload_0
    //   1039: bipush #11
    //   1041: aaload
    //   1042: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1047: getstatic burp/Zxrs.DOUBLE_QUOTED : Lburp/Zxrs;
    //   1050: new burp/Zkjc
    //   1053: dup
    //   1054: iconst_0
    //   1055: invokespecial <init> : (B)V
    //   1058: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   1061: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   1064: putstatic burp/Ztfc.Zl : Lburp/Zllt;
    //   1067: new burp/Zllt
    //   1070: dup
    //   1071: getstatic burp/Zzu2.RUBY_CODE_INJECTION : Lburp/Zzu2;
    //   1074: getstatic burp/Ztfc.Z_ : Lburp/Zllt;
    //   1077: getfield ZW : Ljava/lang/String;
    //   1080: aload_0
    //   1081: bipush #19
    //   1083: aaload
    //   1084: swap
    //   1085: aload_0
    //   1086: bipush #9
    //   1088: aaload
    //   1089: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1094: getstatic burp/Zxrs.SINGLE_QUOTED : Lburp/Zxrs;
    //   1097: new burp/Zkjc
    //   1100: dup
    //   1101: iconst_1
    //   1102: invokespecial <init> : (B)V
    //   1105: getstatic burp/Zlk4.NORMAL : Lburp/Zlk4;
    //   1108: invokespecial <init> : (Lburp/Zzu2;Ljava/lang/String;Lburp/Zxrs;Lburp/Zxsx;Lburp/Zlk4;)V
    //   1111: putstatic burp/Ztfc.ZR : Lburp/Zllt;
    //   1114: bipush #19
    //   1116: anewarray burp/Zllt
    //   1119: dup
    //   1120: iconst_0
    //   1121: getstatic burp/Ztfc.ZY : Lburp/Zllt;
    //   1124: aastore
    //   1125: dup
    //   1126: iconst_1
    //   1127: getstatic burp/Ztfc.Zb : Lburp/Zllt;
    //   1130: aastore
    //   1131: dup
    //   1132: iconst_2
    //   1133: getstatic burp/Ztfc.Zr : Lburp/Zllt;
    //   1136: aastore
    //   1137: dup
    //   1138: iconst_3
    //   1139: getstatic burp/Ztfc.ZG : Lburp/Zllt;
    //   1142: aastore
    //   1143: dup
    //   1144: iconst_4
    //   1145: getstatic burp/Ztfc.Zo : Lburp/Zllt;
    //   1148: aastore
    //   1149: dup
    //   1150: iconst_5
    //   1151: getstatic burp/Ztfc.ZK : Lburp/Zllt;
    //   1154: aastore
    //   1155: dup
    //   1156: bipush #6
    //   1158: getstatic burp/Ztfc.Zk : Lburp/Zllt;
    //   1161: aastore
    //   1162: dup
    //   1163: bipush #7
    //   1165: getstatic burp/Ztfc.Zf : Lburp/Zllt;
    //   1168: aastore
    //   1169: dup
    //   1170: bipush #8
    //   1172: getstatic burp/Ztfc.ZR : Lburp/Zllt;
    //   1175: aastore
    //   1176: dup
    //   1177: bipush #9
    //   1179: getstatic burp/Ztfc.Zl : Lburp/Zllt;
    //   1182: aastore
    //   1183: dup
    //   1184: bipush #10
    //   1186: getstatic burp/Ztfc.Z_ : Lburp/Zllt;
    //   1189: aastore
    //   1190: dup
    //   1191: bipush #11
    //   1193: getstatic burp/Ztfc.ZO : Lburp/Zllt;
    //   1196: aastore
    //   1197: dup
    //   1198: bipush #12
    //   1200: getstatic burp/Ztfc.Zs : Lburp/Zllt;
    //   1203: aastore
    //   1204: dup
    //   1205: bipush #13
    //   1207: getstatic burp/Ztfc.Zc : Lburp/Zllt;
    //   1210: aastore
    //   1211: dup
    //   1212: bipush #14
    //   1214: getstatic burp/Ztfc.Zu : Lburp/Zllt;
    //   1217: aastore
    //   1218: dup
    //   1219: bipush #15
    //   1221: getstatic burp/Ztfc.Zn : Lburp/Zllt;
    //   1224: aastore
    //   1225: dup
    //   1226: bipush #16
    //   1228: getstatic burp/Ztfc.Zq : Lburp/Zllt;
    //   1231: aastore
    //   1232: dup
    //   1233: bipush #17
    //   1235: getstatic burp/Ztfc.Zt : Lburp/Zllt;
    //   1238: aastore
    //   1239: dup
    //   1240: bipush #18
    //   1242: getstatic burp/Ztfc.Zj : Lburp/Zllt;
    //   1245: aastore
    //   1246: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1249: putstatic burp/Ztfc.ZD : Ljava/util/List;
    //   1252: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztfc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */