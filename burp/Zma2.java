package burp;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zkb;

public class Zma2 {
  private static final List<Zg_0> Zf;
  
  private static final List<Zg_0> Zb;
  
  private static final List<Zg_0> Zw;
  
  private final Zefx Zh;
  
  private final Zs68 Zk;
  
  private final EnumSet<Zzgt> ZG;
  
  private static String[] ZD;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zma2(Zefx paramZefx, Zs68 paramZs68) {
    this.Zh = paramZefx;
    String[] arrayOfString = Zm();
    this.Zk = paramZs68;
    this.ZG = EnumSet.noneOf(Zzgt.class);
    if (Zbqc.Zwu() == null)
      Zk(new String[4]); 
  }
  
  public EnumSet<Zzgt> Zb() {
    Zg();
    ZG();
    String[] arrayOfString = Zm();
    Zl();
    if (this.Zk != null && this.Zk.Zd != null)
      Zk(); 
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[1]); 
    return this.ZG;
  }
  
  private void Zk() {
    String[] arrayOfString = Zm();
    for (Ztu8 ztu8 : this.Zk.Zd) {
      if (ztu8.ZlD() == 1 && a(-18224, -14482).equals(ztu8.ZlP().ZJ3()))
        break; 
      if (ztu8.ZlP() != null && a(-18212, -19734).equals(ztu8.ZlP().ZJ3())) {
        Zs5n zs5n = ztu8.ZlP().ZIm(a(-18214, 818));
        if (zs5n != null && a(-18213, 30255).equalsIgnoreCase(zs5n.ZQG())) {
          this.ZG.add(Zzgt.RAILS);
          if (arrayOfString == null)
            continue; 
          break;
        } 
      } 
      continue;
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private void Zl() {
    String[] arrayOfString = Zm();
    if (this.Zk.ZN != null) {
      for (Ztbr ztbr : this.Zk.ZN) {
        String str = ztbr.Zqy().toLowerCase();
        Zu(str);
        if (arrayOfString == null)
          break; 
      } 
      for (Zlou zlou : this.Zh.Zc()) {
        if (Zrdu.COOKIE == zlou.Zx) {
          String str = zlou.ZA.toLowerCase();
          Zu(str);
        } 
        if (arrayOfString == null)
          break; 
      } 
    } 
  }
  
  private void ZG() {
    String str = Zkb.ZG(this.Zh.ZF().Zd4()).toLowerCase();
    Iterator<Zg_0> iterator = Zw.iterator();
    String[] arrayOfString = Zm();
    while (iterator.hasNext()) {
      Zg_0 zg_0 = iterator.next();
      if (str.endsWith(zg_0.Zo))
        this.ZG.add(zg_0.Zm); 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private void Zg() {
    // Byte code:
    //   0: invokestatic Zm : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zk : Lburp/Zs68;
    //   8: invokevirtual Zy : ()Ljava/util/List;
    //   11: invokeinterface iterator : ()Ljava/util/Iterator;
    //   16: astore_2
    //   17: aload_2
    //   18: invokeinterface hasNext : ()Z
    //   23: ifeq -> 206
    //   26: aload_2
    //   27: invokeinterface next : ()Ljava/lang/Object;
    //   32: checkcast java/lang/String
    //   35: astore_3
    //   36: aload_3
    //   37: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   40: astore #4
    //   42: aload #4
    //   44: sipush #-18239
    //   47: sipush #-27599
    //   50: invokestatic a : (II)Ljava/lang/String;
    //   53: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   56: ifne -> 76
    //   59: aload #4
    //   61: sipush #-18229
    //   64: sipush #19858
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   73: ifeq -> 142
    //   76: getstatic burp/Zma2.Zf : Ljava/util/List;
    //   79: invokeinterface iterator : ()Ljava/util/Iterator;
    //   84: astore #5
    //   86: aload #5
    //   88: invokeinterface hasNext : ()Z
    //   93: ifeq -> 138
    //   96: aload #5
    //   98: invokeinterface next : ()Ljava/lang/Object;
    //   103: checkcast burp/Zg_0
    //   106: astore #6
    //   108: aload #4
    //   110: aload #6
    //   112: getfield Zo : Ljava/lang/String;
    //   115: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   118: ifeq -> 134
    //   121: aload_0
    //   122: getfield ZG : Ljava/util/EnumSet;
    //   125: aload #6
    //   127: getfield Zm : Lburp/Zzgt;
    //   130: invokevirtual add : (Ljava/lang/Object;)Z
    //   133: pop
    //   134: aload_1
    //   135: ifnonnull -> 86
    //   138: aload_1
    //   139: ifnonnull -> 202
    //   142: aload #4
    //   144: sipush #-18209
    //   147: sipush #-1009
    //   150: invokestatic a : (II)Ljava/lang/String;
    //   153: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   156: ifeq -> 174
    //   159: aload_0
    //   160: getfield ZG : Ljava/util/EnumSet;
    //   163: getstatic burp/Zzgt.RAILS : Lburp/Zzgt;
    //   166: invokevirtual add : (Ljava/lang/Object;)Z
    //   169: pop
    //   170: aload_1
    //   171: ifnonnull -> 202
    //   174: aload #4
    //   176: sipush #-18228
    //   179: sipush #-22692
    //   182: invokestatic a : (II)Ljava/lang/String;
    //   185: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   188: ifeq -> 202
    //   191: aload_0
    //   192: getfield ZG : Ljava/util/EnumSet;
    //   195: getstatic burp/Zzgt.ASP : Lburp/Zzgt;
    //   198: invokevirtual add : (Ljava/lang/Object;)Z
    //   201: pop
    //   202: aload_1
    //   203: ifnonnull -> 17
    //   206: return
  }
  
  private void Zu(String paramString) {
    String[] arrayOfString = Zm();
    for (Zg_0 zg_0 : Zb) {
      if (paramString.equals(zg_0.Zo))
        this.ZG.add(zg_0.Zm); 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #30
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_1
    //   8: anewarray java/lang/String
    //   11: iconst_0
    //   12: istore_3
    //   13: invokestatic Zk : ([Ljava/lang/String;)V
    //   16: ldc '»Þßæ!¤lH-ùÝ¼\ßþ;AFaH'PëZ3Y³z6SDÄòø\\nÜ]­åöö¼í1I[J+uÜU(&pÀC79yNkÙæEðÞjÜÚ![ûä¨Qs)t{¤Ò\\fìwZ3LäÆWG\\tÈú\\nþYT,I¼F\\tUÍ­;ú¬Ë¡-ÊSG¼Ñ\\r²Ýz®DËÌ^Ø&ã¿iÈgHÀï8óë¡M6L®6Ä8ßÀm(K¾Ä4òË¥½´L¶,'Ôx6ý`ËI_/'
    //   18: dup
    //   19: astore_2
    //   20: invokevirtual length : ()I
    //   23: istore #4
    //   25: bipush #7
    //   27: istore_1
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #35
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 149
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc 'µáfc\\nÿdC(ù'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: iconst_5
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #30
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Zma2.b : [Ljava/lang/String;
    //   138: bipush #30
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Zma2.c : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 267
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 249, 0 -> 220, 1 -> 225, 2 -> 229, 3 -> 234, 4 -> 239, 5 -> 244
    //   220: bipush #61
    //   222: goto -> 251
    //   225: iconst_5
    //   226: goto -> 251
    //   229: bipush #41
    //   231: goto -> 251
    //   234: bipush #44
    //   236: goto -> 251
    //   239: bipush #126
    //   241: goto -> 251
    //   244: bipush #46
    //   246: goto -> 251
    //   249: bipush #125
    //   251: ixor
    //   252: ixor
    //   253: i2c
    //   254: castore
    //   255: iinc #6, 1
    //   258: dup
    //   259: ifne -> 267
    //   262: dup2
    //   263: dup_x1
    //   264: goto -> 172
    //   267: dup2_x1
    //   268: pop2
    //   269: dup_x2
    //   270: iload #6
    //   272: if_icmpgt -> 168
    //   275: pop
    //   276: new java/lang/String
    //   279: dup_x1
    //   280: swap
    //   281: invokespecial <init> : ([C)V
    //   284: invokevirtual intern : ()Ljava/lang/String;
    //   287: swap
    //   288: pop
    //   289: swap
    //   290: tableswitch default -> 47, 0 -> 105
    //   308: bipush #8
    //   310: anewarray burp/Zg_0
    //   313: dup
    //   314: iconst_0
    //   315: new burp/Zg_0
    //   318: dup
    //   319: sipush #-18219
    //   322: sipush #-18131
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: getstatic burp/Zzgt.IIS : Lburp/Zzgt;
    //   331: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   334: aastore
    //   335: dup
    //   336: iconst_1
    //   337: new burp/Zg_0
    //   340: dup
    //   341: sipush #-18230
    //   344: sipush #-14291
    //   347: invokestatic a : (II)Ljava/lang/String;
    //   350: getstatic burp/Zzgt.APACHE : Lburp/Zzgt;
    //   353: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   356: aastore
    //   357: dup
    //   358: iconst_2
    //   359: new burp/Zg_0
    //   362: dup
    //   363: sipush #-18237
    //   366: sipush #-24035
    //   369: invokestatic a : (II)Ljava/lang/String;
    //   372: getstatic burp/Zzgt.NGINX : Lburp/Zzgt;
    //   375: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   378: aastore
    //   379: dup
    //   380: iconst_3
    //   381: new burp/Zg_0
    //   384: dup
    //   385: sipush #-18227
    //   388: sipush #30565
    //   391: invokestatic a : (II)Ljava/lang/String;
    //   394: getstatic burp/Zzgt.PHP : Lburp/Zzgt;
    //   397: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   400: aastore
    //   401: dup
    //   402: iconst_4
    //   403: new burp/Zg_0
    //   406: dup
    //   407: sipush #-18233
    //   410: sipush #-323
    //   413: invokestatic a : (II)Ljava/lang/String;
    //   416: getstatic burp/Zzgt.JAVAEE : Lburp/Zzgt;
    //   419: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   422: aastore
    //   423: dup
    //   424: iconst_5
    //   425: new burp/Zg_0
    //   428: dup
    //   429: sipush #-18223
    //   432: sipush #4632
    //   435: invokestatic a : (II)Ljava/lang/String;
    //   438: getstatic burp/Zzgt.JAVAEE : Lburp/Zzgt;
    //   441: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   444: aastore
    //   445: dup
    //   446: bipush #6
    //   448: new burp/Zg_0
    //   451: dup
    //   452: sipush #-18232
    //   455: sipush #1802
    //   458: invokestatic a : (II)Ljava/lang/String;
    //   461: getstatic burp/Zzgt.JAVAEE : Lburp/Zzgt;
    //   464: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   467: aastore
    //   468: dup
    //   469: bipush #7
    //   471: new burp/Zg_0
    //   474: dup
    //   475: sipush #-18210
    //   478: sipush #-16085
    //   481: invokestatic a : (II)Ljava/lang/String;
    //   484: getstatic burp/Zzgt.JAVAEE : Lburp/Zzgt;
    //   487: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   490: aastore
    //   491: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   494: putstatic burp/Zma2.Zf : Ljava/util/List;
    //   497: bipush #6
    //   499: anewarray burp/Zg_0
    //   502: dup
    //   503: iconst_0
    //   504: new burp/Zg_0
    //   507: dup
    //   508: sipush #-18217
    //   511: sipush #14004
    //   514: invokestatic a : (II)Ljava/lang/String;
    //   517: getstatic burp/Zzgt.JAVAEE : Lburp/Zzgt;
    //   520: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   523: aastore
    //   524: dup
    //   525: iconst_1
    //   526: new burp/Zg_0
    //   529: dup
    //   530: sipush #-18220
    //   533: sipush #-14092
    //   536: invokestatic a : (II)Ljava/lang/String;
    //   539: getstatic burp/Zzgt.PHP : Lburp/Zzgt;
    //   542: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   545: aastore
    //   546: dup
    //   547: iconst_2
    //   548: new burp/Zg_0
    //   551: dup
    //   552: sipush #-18218
    //   555: sipush #-15347
    //   558: invokestatic a : (II)Ljava/lang/String;
    //   561: getstatic burp/Zzgt.PHP : Lburp/Zzgt;
    //   564: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   567: aastore
    //   568: dup
    //   569: iconst_3
    //   570: new burp/Zg_0
    //   573: dup
    //   574: sipush #-18238
    //   577: sipush #-2766
    //   580: invokestatic a : (II)Ljava/lang/String;
    //   583: getstatic burp/Zzgt.PHP : Lburp/Zzgt;
    //   586: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   589: aastore
    //   590: dup
    //   591: iconst_4
    //   592: new burp/Zg_0
    //   595: dup
    //   596: sipush #-18211
    //   599: sipush #7224
    //   602: invokestatic a : (II)Ljava/lang/String;
    //   605: getstatic burp/Zzgt.PHP : Lburp/Zzgt;
    //   608: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   611: aastore
    //   612: dup
    //   613: iconst_5
    //   614: new burp/Zg_0
    //   617: dup
    //   618: sipush #-18222
    //   621: sipush #-7063
    //   624: invokestatic a : (II)Ljava/lang/String;
    //   627: getstatic burp/Zzgt.DJANGO : Lburp/Zzgt;
    //   630: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   633: aastore
    //   634: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   637: putstatic burp/Zma2.Zb : Ljava/util/List;
    //   640: bipush #8
    //   642: anewarray burp/Zg_0
    //   645: dup
    //   646: iconst_0
    //   647: new burp/Zg_0
    //   650: dup
    //   651: sipush #-18225
    //   654: sipush #26580
    //   657: invokestatic a : (II)Ljava/lang/String;
    //   660: getstatic burp/Zzgt.PHP : Lburp/Zzgt;
    //   663: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   666: aastore
    //   667: dup
    //   668: iconst_1
    //   669: new burp/Zg_0
    //   672: dup
    //   673: sipush #-18234
    //   676: sipush #-25655
    //   679: invokestatic a : (II)Ljava/lang/String;
    //   682: getstatic burp/Zzgt.PHP : Lburp/Zzgt;
    //   685: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   688: aastore
    //   689: dup
    //   690: iconst_2
    //   691: new burp/Zg_0
    //   694: dup
    //   695: sipush #-18216
    //   698: sipush #-21638
    //   701: invokestatic a : (II)Ljava/lang/String;
    //   704: getstatic burp/Zzgt.PERL : Lburp/Zzgt;
    //   707: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   710: aastore
    //   711: dup
    //   712: iconst_3
    //   713: new burp/Zg_0
    //   716: dup
    //   717: sipush #-18231
    //   720: sipush #22576
    //   723: invokestatic a : (II)Ljava/lang/String;
    //   726: getstatic burp/Zzgt.ASP : Lburp/Zzgt;
    //   729: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   732: aastore
    //   733: dup
    //   734: iconst_4
    //   735: new burp/Zg_0
    //   738: dup
    //   739: sipush #-18215
    //   742: sipush #-11191
    //   745: invokestatic a : (II)Ljava/lang/String;
    //   748: getstatic burp/Zzgt.ASP : Lburp/Zzgt;
    //   751: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   754: aastore
    //   755: dup
    //   756: iconst_5
    //   757: new burp/Zg_0
    //   760: dup
    //   761: sipush #-18240
    //   764: sipush #27420
    //   767: invokestatic a : (II)Ljava/lang/String;
    //   770: getstatic burp/Zzgt.JAVAEE : Lburp/Zzgt;
    //   773: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   776: aastore
    //   777: dup
    //   778: bipush #6
    //   780: new burp/Zg_0
    //   783: dup
    //   784: sipush #-18221
    //   787: sipush #-15529
    //   790: invokestatic a : (II)Ljava/lang/String;
    //   793: getstatic burp/Zzgt.STRUTS : Lburp/Zzgt;
    //   796: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   799: aastore
    //   800: dup
    //   801: bipush #7
    //   803: new burp/Zg_0
    //   806: dup
    //   807: sipush #-18226
    //   810: sipush #4292
    //   813: invokestatic a : (II)Ljava/lang/String;
    //   816: getstatic burp/Zzgt.STRUTS : Lburp/Zzgt;
    //   819: invokespecial <init> : (Ljava/lang/String;Lburp/Zzgt;)V
    //   822: aastore
    //   823: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   826: putstatic burp/Zma2.Zw : Ljava/util/List;
    //   829: return
  }
  
  public static void Zk(String[] paramArrayOfString) {
    ZD = paramArrayOfString;
  }
  
  public static String[] Zm() {
    return ZD;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB8DA) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      byte b1 = 116;
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zma2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */