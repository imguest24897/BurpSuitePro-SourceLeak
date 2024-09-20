package burp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import net.portswigger.Zm2;

public class Zg2a extends Zg2b<Zbza> {
  public static final Zmk7<Zbza> Za;
  
  public static final Zmk7<Zbza> Zu;
  
  public static final Zmk7<Zbza> Zm;
  
  public static final Zmk7<Zbza> Zj;
  
  public static final Zmk7<Zbza> ZE;
  
  public static final Zmk7<Zbza> ZJ;
  
  public static final Zmk7<Zbza> Zx;
  
  public static final Zmk7<Zbza> ZA;
  
  public static final Zmk7<Zbza> Zy;
  
  public static final Zmk7<Zbza> ZD;
  
  public static final Zmk7<Zbza> ZF;
  
  public static final Zmk7<Zbza> ZU;
  
  public static final Zmk7<Zbza> ZC;
  
  public static final Zmk7<Zbza> Zf;
  
  public static final Zmk7<Zbza> ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg2a() {
    super(new Zgjg<>((Zmk7<Zbza>[])new Zmk7[] { 
            Za, Zu, Zm, Zj, ZE, ZJ, Zx, ZA, Zy, ZD, 
            ZF, ZU, ZC, Zf, ZR }));
  }
  
  private static Optional<String> ZP(Zbza paramZbza) {
    HashMap<Object, Object> hashMap1 = new HashMap<>();
    Iterator<Zb09> iterator = paramZbza.ZgA().iterator();
    String[] arrayOfString = Zxcf.Zq();
    while (iterator.hasNext()) {
      Zb09 zb09 = iterator.next();
      hashMap1.compute(zb09.ZJz(), zb09::lambda$getErrorDetails$12);
      if (arrayOfString != null)
        break; 
    } 
    List list = paramZbza.ZgA().stream().filter(paramZbza::lambda$getErrorDetails$13).filter(hashMap1::lambda$getErrorDetails$14).toList();
    if (list.isEmpty())
      return Optional.empty(); 
    HashMap<Object, Object> hashMap2 = new HashMap<>();
    for (Zb09 zb09 : list) {
      for (Zblb zblb : zb09.ZJk()) {
        ((List<Zb09>)hashMap2.computeIfAbsent(zblb, Zg2a::lambda$getErrorDetails$15)).add(zb09);
        if (arrayOfString != null)
          break; 
      } 
      if (arrayOfString != null)
        break; 
    } 
    for (List list1 : hashMap2.values()) {
      list1.sort(Zg2a::lambda$getErrorDetails$16);
      if (arrayOfString != null)
        break; 
    } 
    String str = hashMap2.entrySet().stream().map(Zg2a::lambda$getErrorDetails$17).sorted().collect(Collectors.joining(" "));
    return Optional.of(a(-29657, -4855) + a(-29657, -4855));
  }
  
  private static String lambda$getErrorDetails$17(Map.Entry paramEntry) {
    return ((Zblb)paramEntry.getKey()).Zi(new Object[] { ((Zb09)((List<Zb09>)paramEntry.getValue()).getFirst()).ZJd() });
  }
  
  private static int lambda$getErrorDetails$16(Zb09 paramZb091, Zb09 paramZb092) {
    return (paramZb091.ZJ2() == null && paramZb092.ZJ2() != null) ? -1 : ((paramZb091.ZJ2() != null && paramZb092.ZJ2() == null) ? -1 : ((paramZb091.ZJ4() == null && paramZb092.ZJ4() != null) ? -1 : ((paramZb091.ZJ4() != null && paramZb092.ZJ4() == null) ? 1 : 0)));
  }
  
  private static List lambda$getErrorDetails$15(Zblb paramZblb) {
    return new LinkedList();
  }
  
  private static boolean lambda$getErrorDetails$14(Map paramMap, Zb09 paramZb09) {
    return (paramZb09.ZJL() >= ((Long)paramMap.getOrDefault(paramZb09.ZJz(), Long.valueOf(0L))).longValue());
  }
  
  private static boolean lambda$getErrorDetails$13(Zbza paramZbza, Zb09 paramZb09) {
    return (paramZbza.ZW(paramZb09.ZJz()) != null && paramZbza.ZW(paramZb09.ZJz()).Zx());
  }
  
  private static Long lambda$getErrorDetails$12(Zb09 paramZb09, Zl5x paramZl5x, Long paramLong) {
    return Long.valueOf((paramLong == null || paramLong.longValue() < paramZb09.ZJL()) ? paramZb09.ZJL() : paramLong.longValue());
  }
  
  private static void lambda$static$11(Zbza paramZbza, Object paramObject) {
    paramZbza.Zxg((String)paramObject);
    Zm2.ZC(Zrrh.SCANNER_SCAN_QUEUE_ADD_COMMENT);
  }
  
  private static Object lambda$static$10(Zbza paramZbza) {
    return Integer.valueOf(paramZbza.ZgP());
  }
  
  private static int lambda$static$4(Object paramObject1, Object paramObject2) {
    return 0;
  }
  
  private static Object lambda$static$3(Zbza paramZbza) {
    return paramZbza;
  }
  
  private static Object lambda$static$2(Zbza paramZbza) {
    switch (paramZbza.Zg6()) {
      case 1:
      
      case 4:
      
      case 2:
      
    } 
    return "";
  }
  
  private static void lambda$static$1(Zbza paramZbza, Object paramObject) {
    byte b = ((Byte)paramObject).byteValue();
    paramZbza.ZB(b);
    Zlxk.ZS = paramZbza.ZaP();
    Zm2.Zi(Zv8r.SCANNER_SCAN_QUEUE_HIGHLIGHT, b);
  }
  
  private static Object lambda$static$0(Zbza paramZbza) {
    return Integer.valueOf(1 + paramZbza.Zgv());
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '#\\b§EQyà£¦ mË¨ñ\\rËd¨iõ²ÜâàV\\bE<OT@M\\tâÕ73ì%\\b:U©Æ\H$X³z ­ÄÒßÜ¡­4²`/\õéH!ÖXz±eÈ7Kç:x\\b)Zb9ª+<v ZçQWÀSYq!bÌÆeëÖÂ:¶å§f§òJoOc\\b© ª´T%'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_3
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
    //   36: goto -> 142
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
    //   67: ldc '­c¿¥¡G".c\\nEÌ5(æôg·y'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #16
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #119
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
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
    //   128: putstatic burp/Zg2a.a : [Ljava/lang/String;
    //   131: bipush #18
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zg2a.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #98
    //   214: goto -> 244
    //   217: bipush #15
    //   219: goto -> 244
    //   222: bipush #97
    //   224: goto -> 244
    //   227: bipush #109
    //   229: goto -> 244
    //   232: bipush #61
    //   234: goto -> 244
    //   237: bipush #104
    //   239: goto -> 244
    //   242: bipush #65
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
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
    //   300: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   305: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   308: ldc '#'
    //   310: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   313: ldc java/lang/Integer
    //   315: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   318: bipush #7
    //   320: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   323: getstatic javax/swing/SortOrder.ASCENDING : Ljavax/swing/SortOrder;
    //   326: invokevirtual ZV : (Ljavax/swing/SortOrder;)Lburp/Zz_2;
    //   329: <illegal opcode> ZG : ()Lburp/Zzbi;
    //   334: invokevirtual ZR : (Lburp/Zzbi;)Lburp/Zz_2;
    //   337: new burp/Zlxk
    //   340: dup
    //   341: invokespecial <init> : ()V
    //   344: invokevirtual Zb : ()Ljavax/swing/table/TableCellEditor;
    //   347: invokevirtual ZE : (Ljavax/swing/table/TableCellEditor;)Lburp/Zz_2;
    //   350: invokevirtual ZH : ()Lburp/Zmk7;
    //   353: putstatic burp/Zg2a.Za : Lburp/Zmk7;
    //   356: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   361: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   364: sipush #-29663
    //   367: sipush #11193
    //   370: invokestatic a : (II)Ljava/lang/String;
    //   373: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   376: ldc burp/Zmzk
    //   378: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   381: bipush #30
    //   383: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   386: new burp/Ztwu
    //   389: dup
    //   390: invokespecial <init> : ()V
    //   393: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   396: new burp/Zmq1
    //   399: dup
    //   400: invokespecial <init> : ()V
    //   403: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   406: invokevirtual ZH : ()Lburp/Zmk7;
    //   409: putstatic burp/Zg2a.Zu : Lburp/Zmk7;
    //   412: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   417: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   420: sipush #-29656
    //   423: sipush #-17929
    //   426: invokestatic a : (II)Ljava/lang/String;
    //   429: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   432: ldc java/lang/String
    //   434: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   437: bipush #40
    //   439: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   442: invokevirtual ZH : ()Lburp/Zmk7;
    //   445: putstatic burp/Zg2a.Zm : Lburp/Zmk7;
    //   448: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   453: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   456: sipush #-29661
    //   459: sipush #-24685
    //   462: invokestatic a : (II)Ljava/lang/String;
    //   465: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   468: ldc java/lang/String
    //   470: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   473: bipush #15
    //   475: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   478: invokevirtual ZH : ()Lburp/Zmk7;
    //   481: putstatic burp/Zg2a.Zj : Lburp/Zmk7;
    //   484: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   489: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   492: sipush #-29662
    //   495: sipush #-21584
    //   498: invokestatic a : (II)Ljava/lang/String;
    //   501: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   504: ldc java/lang/String
    //   506: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   509: bipush #9
    //   511: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   514: <illegal opcode> compare : ()Ljava/util/Comparator;
    //   519: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   522: iconst_0
    //   523: invokevirtual ZK : (Z)Lburp/Zz_2;
    //   526: iconst_0
    //   527: invokevirtual ZU : (Z)Lburp/Zz_2;
    //   530: new burp/Zbgp
    //   533: dup
    //   534: invokespecial <init> : ()V
    //   537: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   540: invokevirtual ZH : ()Lburp/Zmk7;
    //   543: putstatic burp/Zg2a.ZE : Lburp/Zmk7;
    //   546: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   551: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   554: sipush #-29653
    //   557: sipush #15452
    //   560: invokestatic a : (II)Ljava/lang/String;
    //   563: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   566: ldc java/lang/String
    //   568: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   571: bipush #20
    //   573: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   576: <illegal opcode> compare : ()Ljava/util/Comparator;
    //   581: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   584: iconst_0
    //   585: invokevirtual ZK : (Z)Lburp/Zz_2;
    //   588: iconst_0
    //   589: invokevirtual ZU : (Z)Lburp/Zz_2;
    //   592: new burp/Zbg0
    //   595: dup
    //   596: invokespecial <init> : ()V
    //   599: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   602: invokevirtual ZH : ()Lburp/Zmk7;
    //   605: putstatic burp/Zg2a.ZJ : Lburp/Zmk7;
    //   608: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   613: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   616: sipush #-29660
    //   619: sipush #13445
    //   622: invokestatic a : (II)Ljava/lang/String;
    //   625: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   628: ldc java/lang/String
    //   630: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   633: bipush #11
    //   635: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   638: <illegal opcode> compare : ()Ljava/util/Comparator;
    //   643: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   646: iconst_0
    //   647: invokevirtual ZK : (Z)Lburp/Zz_2;
    //   650: iconst_0
    //   651: invokevirtual ZU : (Z)Lburp/Zz_2;
    //   654: new burp/Zbg4
    //   657: dup
    //   658: invokespecial <init> : ()V
    //   661: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   664: invokevirtual ZH : ()Lburp/Zmk7;
    //   667: putstatic burp/Zg2a.Zx : Lburp/Zmk7;
    //   670: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   675: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   678: sipush #-29654
    //   681: sipush #-18912
    //   684: invokestatic a : (II)Ljava/lang/String;
    //   687: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   690: ldc burp/Zbza
    //   692: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   695: bipush #25
    //   697: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   700: new burp/Zt60
    //   703: dup
    //   704: invokespecial <init> : ()V
    //   707: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   710: new burp/Zbcf
    //   713: dup
    //   714: invokespecial <init> : ()V
    //   717: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   720: iconst_0
    //   721: invokevirtual ZU : (Z)Lburp/Zz_2;
    //   724: invokevirtual ZH : ()Lburp/Zmk7;
    //   727: putstatic burp/Zg2a.ZA : Lburp/Zmk7;
    //   730: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   735: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   738: sipush #-29655
    //   741: sipush #5324
    //   744: invokestatic a : (II)Ljava/lang/String;
    //   747: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   750: ldc java/lang/Integer
    //   752: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   755: new burp/Zmqp
    //   758: dup
    //   759: invokespecial <init> : ()V
    //   762: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   765: new burp/Zs46
    //   768: dup
    //   769: invokespecial <init> : ()V
    //   772: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   775: bipush #12
    //   777: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   780: invokevirtual ZH : ()Lburp/Zmk7;
    //   783: putstatic burp/Zg2a.Zy : Lburp/Zmk7;
    //   786: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   791: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   794: sipush #-29659
    //   797: sipush #18621
    //   800: invokestatic a : (II)Ljava/lang/String;
    //   803: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   806: ldc java/lang/Integer
    //   808: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   811: new burp/Zmqp
    //   814: dup
    //   815: invokespecial <init> : ()V
    //   818: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   821: new burp/Zs46
    //   824: dup
    //   825: invokespecial <init> : ()V
    //   828: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   831: bipush #12
    //   833: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   836: invokevirtual ZH : ()Lburp/Zmk7;
    //   839: putstatic burp/Zg2a.ZD : Lburp/Zmk7;
    //   842: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   847: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   850: sipush #-29640
    //   853: sipush #8348
    //   856: invokestatic a : (II)Ljava/lang/String;
    //   859: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   862: ldc java/lang/Integer
    //   864: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   867: new burp/Zmqp
    //   870: dup
    //   871: invokespecial <init> : ()V
    //   874: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   877: new burp/Zs46
    //   880: dup
    //   881: invokespecial <init> : ()V
    //   884: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   887: bipush #15
    //   889: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   892: invokevirtual ZH : ()Lburp/Zmk7;
    //   895: putstatic burp/Zg2a.ZF : Lburp/Zmk7;
    //   898: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   903: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   906: sipush #-29649
    //   909: sipush #-18165
    //   912: invokestatic a : (II)Ljava/lang/String;
    //   915: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   918: ldc java/lang/Integer
    //   920: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   923: new burp/Zmqp
    //   926: dup
    //   927: invokespecial <init> : ()V
    //   930: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   933: new burp/Zs46
    //   936: dup
    //   937: invokespecial <init> : ()V
    //   940: invokevirtual Zh : (Ljava/util/Comparator;)Lburp/Zz_2;
    //   943: bipush #15
    //   945: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   948: invokevirtual ZH : ()Lburp/Zmk7;
    //   951: putstatic burp/Zg2a.ZU : Lburp/Zmk7;
    //   954: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   959: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   962: sipush #-29639
    //   965: sipush #-10283
    //   968: invokestatic a : (II)Ljava/lang/String;
    //   971: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   974: ldc java/lang/Long
    //   976: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   979: new burp/Zmqw
    //   982: dup
    //   983: invokespecial <init> : ()V
    //   986: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   989: bipush #20
    //   991: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   994: invokevirtual ZH : ()Lburp/Zmk7;
    //   997: putstatic burp/Zg2a.ZC : Lburp/Zmk7;
    //   1000: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   1005: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   1008: sipush #-29650
    //   1011: sipush #-16300
    //   1014: invokestatic a : (II)Ljava/lang/String;
    //   1017: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   1020: ldc java/lang/Long
    //   1022: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   1025: new burp/Zmqw
    //   1028: dup
    //   1029: invokespecial <init> : ()V
    //   1032: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   1035: bipush #20
    //   1037: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   1040: invokevirtual ZH : ()Lburp/Zmk7;
    //   1043: putstatic burp/Zg2a.Zf : Lburp/Zmk7;
    //   1046: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   1051: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   1054: sipush #-29664
    //   1057: sipush #25430
    //   1060: invokestatic a : (II)Ljava/lang/String;
    //   1063: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   1066: ldc java/lang/String
    //   1068: invokevirtual Zg : (Ljava/lang/Class;)Lburp/Zz_2;
    //   1071: bipush #25
    //   1073: invokevirtual ZZ : (I)Lburp/Zz_2;
    //   1076: <illegal opcode> ZG : ()Lburp/Zzbi;
    //   1081: invokevirtual ZR : (Lburp/Zzbi;)Lburp/Zz_2;
    //   1084: invokevirtual ZH : ()Lburp/Zmk7;
    //   1087: putstatic burp/Zg2a.ZR : Lburp/Zmk7;
    //   1090: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8C28) & 0xFFFF;
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
      char c = '³';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg2a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */