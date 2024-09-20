package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsz8 {
  private static final byte[] ZD;
  
  private static final byte[] Zv;
  
  private static final byte[] ZH;
  
  private static final byte[] ZI;
  
  private static final List<byte[]> Zu;
  
  private final int ZN;
  
  private final int Zl;
  
  private final Zstu ZK;
  
  private final byte ZC;
  
  private final Zkgo ZY;
  
  private final String Zd;
  
  private final List<Ztu8> ZJ = new LinkedList<>();
  
  private int Zb;
  
  private boolean ZF;
  
  private static final Zzrd ZL;
  
  private static final Zzrd ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static List<Ztu8> ZA(Zstu paramZstu, int paramInt1, int paramInt2, byte paramByte, String paramString) {
    return ZB(paramZstu, paramInt1, paramInt2, paramByte, Zsz8::lambda$getHtmlElements$0, paramString);
  }
  
  public static List<Ztu8> ZJ(Zstu paramZstu, int paramInt1, int paramInt2, byte paramByte) {
    return ZB(paramZstu, paramInt1, paramInt2, paramByte, Zsz8::lambda$getHtmlElements$0, null);
  }
  
  public static List<Ztu8> ZB(Zstu paramZstu, int paramInt1, int paramInt2, byte paramByte, Supplier<Boolean> paramSupplier, String paramString) {
    return Zs(paramZstu, paramInt1, paramInt2, paramByte, Zkgo.FULL, paramSupplier, paramString);
  }
  
  public static List<Ztu8> Zs(Zstu paramZstu, int paramInt1, int paramInt2, byte paramByte, Zkgo paramZkgo, Supplier<Boolean> paramSupplier, String paramString) {
    Zsz8 zsz8 = new Zsz8(paramInt1, paramInt2, paramZstu, paramByte, paramZkgo, paramString);
    zsz8.Zm(paramSupplier);
    return zsz8.Zs();
  }
  
  private Zsz8(int paramInt1, int paramInt2, Zstu paramZstu, byte paramByte, Zkgo paramZkgo, String paramString) {
    this.ZN = paramInt1;
    this.Zl = paramInt2;
    this.ZK = paramZstu;
    this.ZC = paramByte;
    this.ZY = paramZkgo;
    this.Zd = paramString;
  }
  
  private void Zm(Supplier<Boolean> paramSupplier) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZN : I
    //   4: iflt -> 56
    //   7: aload_0
    //   8: getfield ZN : I
    //   11: aload_0
    //   12: getfield Zl : I
    //   15: if_icmpgt -> 56
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: aload_0
    //   26: getfield Zl : I
    //   29: aload_0
    //   30: getfield ZK : Lburp/Zstu;
    //   33: invokeinterface Zpu : ()I
    //   38: if_icmpgt -> 56
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   47: athrow
    //   48: iconst_1
    //   49: goto -> 57
    //   52: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: iconst_0
    //   57: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   60: aload_0
    //   61: getfield ZN : I
    //   64: i2l
    //   65: aload_0
    //   66: getfield Zl : I
    //   69: i2l
    //   70: aload_0
    //   71: getfield ZK : Lburp/Zstu;
    //   74: invokeinterface Zpu : ()I
    //   79: i2l
    //   80: invokestatic Zi : (ZLnet/portswigger/Zqf;JJJ)V
    //   83: aload_0
    //   84: aload_0
    //   85: getfield ZN : I
    //   88: putfield Zb : I
    //   91: aload_0
    //   92: getfield Zb : I
    //   95: aload_0
    //   96: getfield Zl : I
    //   99: if_icmpge -> 1546
    //   102: aload_0
    //   103: getfield ZJ : Ljava/util/List;
    //   106: aload_0
    //   107: getfield ZC : B
    //   110: aload_0
    //   111: getfield ZY : Lburp/Zkgo;
    //   114: invokestatic Zh : (Ljava/util/List;BLburp/Zkgo;)Z
    //   117: ifeq -> 1546
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: aload_1
    //   128: invokeinterface get : ()Ljava/lang/Object;
    //   133: checkcast java/lang/Boolean
    //   136: invokevirtual booleanValue : ()Z
    //   139: ifeq -> 150
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   148: athrow
    //   149: return
    //   150: aload_0
    //   151: getfield Zb : I
    //   154: istore_2
    //   155: aload_0
    //   156: invokevirtual Zq : ()V
    //   159: aload_0
    //   160: getfield Zb : I
    //   163: iload_2
    //   164: if_icmple -> 279
    //   167: aload_0
    //   168: getfield ZK : Lburp/Zstu;
    //   171: iload_2
    //   172: aload_0
    //   173: getfield Zb : I
    //   176: invokeinterface Zb : (II)Lburp/Zstu;
    //   181: astore_3
    //   182: aload_0
    //   183: getfield ZJ : Ljava/util/List;
    //   186: invokeinterface isEmpty : ()Z
    //   191: ifeq -> 201
    //   194: aload_0
    //   195: iload_2
    //   196: aload_3
    //   197: invokevirtual ZO : (ILburp/Zstu;)Lburp/Zstu;
    //   200: astore_3
    //   201: aload_3
    //   202: invokeinterface Zpu : ()I
    //   207: ifle -> 279
    //   210: aload_0
    //   211: getfield Zd : Ljava/lang/String;
    //   214: ifnonnull -> 237
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   223: athrow
    //   224: aload_3
    //   225: invokeinterface Zis : ()Ljava/lang/String;
    //   230: goto -> 247
    //   233: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   236: athrow
    //   237: aload_3
    //   238: aload_0
    //   239: getfield Zd : Ljava/lang/String;
    //   242: invokeinterface ZE : (Ljava/lang/String;)Ljava/lang/String;
    //   247: astore #4
    //   249: new burp/Zcv
    //   252: dup
    //   253: iload_2
    //   254: aload_0
    //   255: getfield Zb : I
    //   258: iconst_3
    //   259: aconst_null
    //   260: aload #4
    //   262: invokespecial <init> : (IIBLburp/Zs_n;Ljava/lang/String;)V
    //   265: astore #5
    //   267: aload_0
    //   268: getfield ZJ : Ljava/util/List;
    //   271: aload #5
    //   273: invokeinterface add : (Ljava/lang/Object;)Z
    //   278: pop
    //   279: aload_0
    //   280: getfield Zb : I
    //   283: aload_0
    //   284: getfield Zl : I
    //   287: iconst_1
    //   288: isub
    //   289: if_icmplt -> 299
    //   292: goto -> 1546
    //   295: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   298: athrow
    //   299: aload_0
    //   300: getfield ZK : Lburp/Zstu;
    //   303: aload_0
    //   304: getfield Zb : I
    //   307: iconst_1
    //   308: iadd
    //   309: invokeinterface Zp : (I)B
    //   314: bipush #33
    //   316: if_icmpne -> 330
    //   319: aload_0
    //   320: invokevirtual ZQ : ()V
    //   323: goto -> 91
    //   326: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   329: athrow
    //   330: aload_0
    //   331: getfield Zb : I
    //   334: istore_3
    //   335: iconst_0
    //   336: istore #4
    //   338: aload_0
    //   339: dup
    //   340: getfield Zb : I
    //   343: iconst_1
    //   344: iadd
    //   345: putfield Zb : I
    //   348: aload_0
    //   349: getfield Zb : I
    //   352: aload_0
    //   353: getfield Zl : I
    //   356: if_icmpge -> 455
    //   359: aload_0
    //   360: getfield ZK : Lburp/Zstu;
    //   363: aload_0
    //   364: getfield Zb : I
    //   367: invokeinterface Zp : (I)B
    //   372: bipush #47
    //   374: if_icmpne -> 455
    //   377: goto -> 384
    //   380: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   383: athrow
    //   384: aload_0
    //   385: getfield Zb : I
    //   388: iconst_1
    //   389: iadd
    //   390: aload_0
    //   391: getfield Zl : I
    //   394: if_icmpge -> 442
    //   397: goto -> 404
    //   400: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   403: athrow
    //   404: aload_0
    //   405: getfield ZK : Lburp/Zstu;
    //   408: aload_0
    //   409: getfield Zb : I
    //   412: iconst_1
    //   413: iadd
    //   414: invokeinterface Zp : (I)B
    //   419: bipush #46
    //   421: if_icmpne -> 442
    //   424: goto -> 431
    //   427: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   430: athrow
    //   431: aload_0
    //   432: invokevirtual ZQ : ()V
    //   435: goto -> 91
    //   438: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   441: athrow
    //   442: iconst_1
    //   443: istore #4
    //   445: aload_0
    //   446: dup
    //   447: getfield Zb : I
    //   450: iconst_1
    //   451: iadd
    //   452: putfield Zb : I
    //   455: aload_0
    //   456: getfield Zb : I
    //   459: istore_2
    //   460: aload_0
    //   461: invokevirtual Ze : ()Ljava/lang/String;
    //   464: astore #5
    //   466: aload_0
    //   467: getfield Zb : I
    //   470: aload_0
    //   471: getfield Zl : I
    //   474: if_icmplt -> 484
    //   477: goto -> 1546
    //   480: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   483: athrow
    //   484: iload_2
    //   485: istore #6
    //   487: aload_0
    //   488: getfield Zb : I
    //   491: istore #7
    //   493: aload_0
    //   494: getfield ZK : Lburp/Zstu;
    //   497: iload_2
    //   498: invokeinterface Zp : (I)B
    //   503: bipush #63
    //   505: if_icmpne -> 511
    //   508: iconst_4
    //   509: istore #4
    //   511: new burp/Zyu
    //   514: dup
    //   515: getstatic burp/Zs5n.Zi : Lburp/Zeu4;
    //   518: iconst_0
    //   519: invokespecial <init> : (Lburp/Zeu4;I)V
    //   522: astore #8
    //   524: iload #4
    //   526: iconst_1
    //   527: if_icmpne -> 772
    //   530: aload_0
    //   531: iconst_0
    //   532: putfield ZF : Z
    //   535: goto -> 542
    //   538: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   541: athrow
    //   542: aload_0
    //   543: getfield Zb : I
    //   546: aload_0
    //   547: getfield Zl : I
    //   550: if_icmpge -> 1480
    //   553: aload_0
    //   554: invokevirtual Zh : ()V
    //   557: aload_0
    //   558: getfield Zb : I
    //   561: aload_0
    //   562: getfield Zl : I
    //   565: if_icmplt -> 582
    //   568: goto -> 575
    //   571: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   574: athrow
    //   575: goto -> 1480
    //   578: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   581: athrow
    //   582: aload_0
    //   583: getfield ZK : Lburp/Zstu;
    //   586: aload_0
    //   587: getfield Zb : I
    //   590: invokeinterface Zp : (I)B
    //   595: bipush #62
    //   597: if_icmpne -> 607
    //   600: goto -> 1480
    //   603: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   606: athrow
    //   607: aload_0
    //   608: getfield Zb : I
    //   611: istore #9
    //   613: aload_0
    //   614: getfield Zb : I
    //   617: aload_0
    //   618: getfield Zl : I
    //   621: if_icmpge -> 691
    //   624: aload_0
    //   625: getfield ZK : Lburp/Zstu;
    //   628: aload_0
    //   629: getfield Zb : I
    //   632: invokeinterface Zp : (I)B
    //   637: bipush #32
    //   639: if_icmple -> 691
    //   642: goto -> 649
    //   645: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   648: athrow
    //   649: aload_0
    //   650: getfield ZK : Lburp/Zstu;
    //   653: aload_0
    //   654: getfield Zb : I
    //   657: invokeinterface Zp : (I)B
    //   662: bipush #62
    //   664: if_icmpeq -> 691
    //   667: goto -> 674
    //   670: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   673: athrow
    //   674: aload_0
    //   675: dup
    //   676: getfield Zb : I
    //   679: iconst_1
    //   680: iadd
    //   681: putfield Zb : I
    //   684: goto -> 613
    //   687: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   690: athrow
    //   691: aload_0
    //   692: getfield Zb : I
    //   695: aload_0
    //   696: getfield Zl : I
    //   699: if_icmplt -> 709
    //   702: goto -> 1480
    //   705: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   708: athrow
    //   709: aload_0
    //   710: getfield Zb : I
    //   713: istore #10
    //   715: aload_0
    //   716: getfield ZK : Lburp/Zstu;
    //   719: iload #9
    //   721: iload #10
    //   723: invokeinterface Zb : (II)Lburp/Zstu;
    //   728: invokeinterface Zis : ()Ljava/lang/String;
    //   733: invokestatic Zn : (Ljava/lang/String;)Ljava/lang/String;
    //   736: astore #11
    //   738: aload #8
    //   740: new burp/Zcb
    //   743: dup
    //   744: aload #11
    //   746: aconst_null
    //   747: iload #9
    //   749: iload #10
    //   751: aload_0
    //   752: getfield Zb : I
    //   755: aload_0
    //   756: getfield Zb : I
    //   759: iconst_3
    //   760: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;IIIIB)V
    //   763: invokeinterface add : (Ljava/lang/Object;)Z
    //   768: pop
    //   769: goto -> 542
    //   772: aload_0
    //   773: getfield ZC : B
    //   776: ifne -> 938
    //   779: iload #4
    //   781: ifne -> 938
    //   784: goto -> 791
    //   787: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   790: athrow
    //   791: sipush #-15187
    //   794: sipush #7893
    //   797: invokestatic a : (II)Ljava/lang/String;
    //   800: aload #5
    //   802: invokevirtual equals : (Ljava/lang/Object;)Z
    //   805: ifne -> 935
    //   808: goto -> 815
    //   811: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   814: athrow
    //   815: sipush #-15189
    //   818: sipush #-13056
    //   821: invokestatic a : (II)Ljava/lang/String;
    //   824: aload #5
    //   826: invokevirtual equals : (Ljava/lang/Object;)Z
    //   829: ifne -> 935
    //   832: goto -> 839
    //   835: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   838: athrow
    //   839: sipush #-15191
    //   842: sipush #-29822
    //   845: invokestatic a : (II)Ljava/lang/String;
    //   848: aload #5
    //   850: invokevirtual equals : (Ljava/lang/Object;)Z
    //   853: ifne -> 935
    //   856: goto -> 863
    //   859: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   862: athrow
    //   863: sipush #-15190
    //   866: sipush #-2103
    //   869: invokestatic a : (II)Ljava/lang/String;
    //   872: aload #5
    //   874: invokevirtual equals : (Ljava/lang/Object;)Z
    //   877: ifne -> 935
    //   880: goto -> 887
    //   883: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   886: athrow
    //   887: sipush #-15192
    //   890: sipush #17874
    //   893: invokestatic a : (II)Ljava/lang/String;
    //   896: aload #5
    //   898: invokevirtual equals : (Ljava/lang/Object;)Z
    //   901: ifne -> 935
    //   904: goto -> 911
    //   907: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   910: athrow
    //   911: sipush #-15185
    //   914: sipush #-22845
    //   917: invokestatic a : (II)Ljava/lang/String;
    //   920: aload #5
    //   922: invokevirtual equals : (Ljava/lang/Object;)Z
    //   925: ifeq -> 938
    //   928: goto -> 935
    //   931: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   934: athrow
    //   935: iconst_4
    //   936: istore #4
    //   938: aload_0
    //   939: sipush #-15186
    //   942: sipush #-25568
    //   945: invokestatic a : (II)Ljava/lang/String;
    //   948: aload #5
    //   950: invokevirtual equals : (Ljava/lang/Object;)Z
    //   953: putfield ZF : Z
    //   956: aload_0
    //   957: getfield Zb : I
    //   960: aload_0
    //   961: getfield Zl : I
    //   964: if_icmpge -> 1480
    //   967: aload_0
    //   968: invokevirtual Zh : ()V
    //   971: aload_0
    //   972: getfield Zb : I
    //   975: aload_0
    //   976: getfield Zl : I
    //   979: if_icmplt -> 996
    //   982: goto -> 989
    //   985: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   988: athrow
    //   989: goto -> 1480
    //   992: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   995: athrow
    //   996: aload_0
    //   997: getfield ZK : Lburp/Zstu;
    //   1000: aload_0
    //   1001: getfield Zb : I
    //   1004: invokeinterface Zp : (I)B
    //   1009: bipush #62
    //   1011: if_icmpne -> 1021
    //   1014: goto -> 1480
    //   1017: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1020: athrow
    //   1021: aload_0
    //   1022: getfield ZK : Lburp/Zstu;
    //   1025: aload_0
    //   1026: getfield Zb : I
    //   1029: invokeinterface Zp : (I)B
    //   1034: bipush #47
    //   1036: if_icmpne -> 1055
    //   1039: iconst_4
    //   1040: istore #4
    //   1042: aload_0
    //   1043: dup
    //   1044: getfield Zb : I
    //   1047: iconst_1
    //   1048: iadd
    //   1049: putfield Zb : I
    //   1052: goto -> 956
    //   1055: aload_0
    //   1056: getfield Zb : I
    //   1059: istore #9
    //   1061: aload_0
    //   1062: getfield Zb : I
    //   1065: aload_0
    //   1066: getfield Zl : I
    //   1069: if_icmpge -> 1189
    //   1072: aload_0
    //   1073: getfield ZK : Lburp/Zstu;
    //   1076: aload_0
    //   1077: getfield Zb : I
    //   1080: invokeinterface Zp : (I)B
    //   1085: bipush #32
    //   1087: if_icmple -> 1189
    //   1090: goto -> 1097
    //   1093: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1096: athrow
    //   1097: aload_0
    //   1098: getfield ZK : Lburp/Zstu;
    //   1101: aload_0
    //   1102: getfield Zb : I
    //   1105: invokeinterface Zp : (I)B
    //   1110: bipush #61
    //   1112: if_icmpeq -> 1189
    //   1115: goto -> 1122
    //   1118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1121: athrow
    //   1122: aload_0
    //   1123: getfield ZK : Lburp/Zstu;
    //   1126: aload_0
    //   1127: getfield Zb : I
    //   1130: invokeinterface Zp : (I)B
    //   1135: bipush #47
    //   1137: if_icmpeq -> 1189
    //   1140: goto -> 1147
    //   1143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1146: athrow
    //   1147: aload_0
    //   1148: getfield ZK : Lburp/Zstu;
    //   1151: aload_0
    //   1152: getfield Zb : I
    //   1155: invokeinterface Zp : (I)B
    //   1160: bipush #62
    //   1162: if_icmpeq -> 1189
    //   1165: goto -> 1172
    //   1168: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1171: athrow
    //   1172: aload_0
    //   1173: dup
    //   1174: getfield Zb : I
    //   1177: iconst_1
    //   1178: iadd
    //   1179: putfield Zb : I
    //   1182: goto -> 1061
    //   1185: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1188: athrow
    //   1189: aload_0
    //   1190: getfield Zb : I
    //   1193: aload_0
    //   1194: getfield Zl : I
    //   1197: if_icmplt -> 1207
    //   1200: goto -> 1480
    //   1203: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1206: athrow
    //   1207: aload_0
    //   1208: getfield Zb : I
    //   1211: istore #10
    //   1213: aload_0
    //   1214: getfield ZK : Lburp/Zstu;
    //   1217: iload #9
    //   1219: iload #10
    //   1221: invokeinterface Zb : (II)Lburp/Zstu;
    //   1226: invokeinterface Zis : ()Ljava/lang/String;
    //   1231: invokestatic Zn : (Ljava/lang/String;)Ljava/lang/String;
    //   1234: astore #11
    //   1236: aload_0
    //   1237: invokevirtual Zh : ()V
    //   1240: aload_0
    //   1241: getfield Zb : I
    //   1244: aload_0
    //   1245: getfield Zl : I
    //   1248: if_icmplt -> 1258
    //   1251: goto -> 1480
    //   1254: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1257: athrow
    //   1258: ldc ''
    //   1260: astore #12
    //   1262: aload_0
    //   1263: getfield Zb : I
    //   1266: istore #13
    //   1268: aload_0
    //   1269: getfield Zb : I
    //   1272: istore #14
    //   1274: iconst_3
    //   1275: istore #15
    //   1277: aload_0
    //   1278: getfield ZK : Lburp/Zstu;
    //   1281: aload_0
    //   1282: getfield Zb : I
    //   1285: invokeinterface Zp : (I)B
    //   1290: bipush #61
    //   1292: if_icmpne -> 1425
    //   1295: aload_0
    //   1296: dup
    //   1297: getfield Zb : I
    //   1300: iconst_1
    //   1301: iadd
    //   1302: putfield Zb : I
    //   1305: aload_0
    //   1306: invokevirtual Zh : ()V
    //   1309: aload_0
    //   1310: getfield Zb : I
    //   1313: aload_0
    //   1314: getfield Zl : I
    //   1317: if_icmplt -> 1334
    //   1320: goto -> 1327
    //   1323: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1326: athrow
    //   1327: goto -> 1480
    //   1330: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1333: athrow
    //   1334: aload_0
    //   1335: invokevirtual ZF : ()B
    //   1338: istore #15
    //   1340: aload_0
    //   1341: getfield Zb : I
    //   1344: istore #13
    //   1346: aload_0
    //   1347: iload #15
    //   1349: invokevirtual ZK : (B)V
    //   1352: aload_0
    //   1353: getfield Zb : I
    //   1356: istore #14
    //   1358: aload_0
    //   1359: getfield ZK : Lburp/Zstu;
    //   1362: iload #13
    //   1364: iload #14
    //   1366: invokeinterface Zb : (II)Lburp/Zstu;
    //   1371: invokeinterface Zis : ()Ljava/lang/String;
    //   1376: invokestatic Zn : (Ljava/lang/String;)Ljava/lang/String;
    //   1379: astore #12
    //   1381: iload #15
    //   1383: tableswitch default -> 1425, 0 -> 1408, 1 -> 1408, 2 -> 1408
    //   1408: aload_0
    //   1409: dup
    //   1410: getfield Zb : I
    //   1413: iconst_1
    //   1414: iadd
    //   1415: putfield Zb : I
    //   1418: goto -> 1425
    //   1421: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1424: athrow
    //   1425: aload_0
    //   1426: getfield ZK : Lburp/Zstu;
    //   1429: iload #9
    //   1431: invokeinterface Zp : (I)B
    //   1436: bipush #63
    //   1438: if_icmpeq -> 1477
    //   1441: aload #8
    //   1443: new burp/Zcb
    //   1446: dup
    //   1447: aload #11
    //   1449: aload #12
    //   1451: iload #9
    //   1453: iload #10
    //   1455: iload #13
    //   1457: iload #14
    //   1459: iload #15
    //   1461: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;IIIIB)V
    //   1464: invokeinterface add : (Ljava/lang/Object;)Z
    //   1469: pop
    //   1470: goto -> 1477
    //   1473: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1476: athrow
    //   1477: goto -> 956
    //   1480: new burp/Zcm
    //   1483: dup
    //   1484: aload #5
    //   1486: iload #6
    //   1488: iload #7
    //   1490: aload #8
    //   1492: invokespecial <init> : (Ljava/lang/String;IILburp/Zefg;)V
    //   1495: astore #9
    //   1497: aload_0
    //   1498: getfield ZJ : Ljava/util/List;
    //   1501: new burp/Zcv
    //   1504: dup
    //   1505: iload_3
    //   1506: aload_0
    //   1507: getfield Zb : I
    //   1510: iconst_1
    //   1511: iadd
    //   1512: aload_0
    //   1513: getfield Zl : I
    //   1516: invokestatic min : (II)I
    //   1519: iload #4
    //   1521: aload #9
    //   1523: aconst_null
    //   1524: invokespecial <init> : (IIBLburp/Zs_n;Ljava/lang/String;)V
    //   1527: invokeinterface add : (Ljava/lang/Object;)Z
    //   1532: pop
    //   1533: aload_0
    //   1534: dup
    //   1535: getfield Zb : I
    //   1538: iconst_1
    //   1539: iadd
    //   1540: putfield Zb : I
    //   1543: goto -> 91
    //   1546: goto -> 1561
    //   1549: astore_2
    //   1550: aload_2
    //   1551: aload_0
    //   1552: invokevirtual Zm : ()Ljava/lang/String;
    //   1555: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   1558: invokestatic ZU : (Ljava/lang/Throwable;Ljava/lang/String;Lnet/portswigger/Zk_;)V
    //   1561: return
    // Exception table:
    //   from	to	target	type
    //   0	18	21	java/lang/Exception
    //   7	41	44	java/lang/Exception
    //   25	52	52	java/lang/Exception
    //   91	120	123	java/lang/Exception
    //   91	149	1549	java/lang/Exception
    //   102	142	145	java/lang/Exception
    //   150	1546	1549	java/lang/Exception
    //   201	217	220	java/lang/Exception
    //   210	233	233	java/lang/Exception
    //   279	295	295	java/lang/Exception
    //   299	326	326	java/lang/Exception
    //   338	377	380	java/lang/Exception
    //   359	397	400	java/lang/Exception
    //   384	424	427	java/lang/Exception
    //   404	438	438	java/lang/Exception
    //   466	480	480	java/lang/Exception
    //   524	535	538	java/lang/Exception
    //   542	568	571	java/lang/Exception
    //   553	578	578	java/lang/Exception
    //   582	603	603	java/lang/Exception
    //   613	642	645	java/lang/Exception
    //   624	667	670	java/lang/Exception
    //   649	687	687	java/lang/Exception
    //   691	705	705	java/lang/Exception
    //   772	784	787	java/lang/Exception
    //   779	808	811	java/lang/Exception
    //   791	832	835	java/lang/Exception
    //   815	856	859	java/lang/Exception
    //   839	880	883	java/lang/Exception
    //   863	904	907	java/lang/Exception
    //   887	928	931	java/lang/Exception
    //   956	982	985	java/lang/Exception
    //   967	992	992	java/lang/Exception
    //   996	1017	1017	java/lang/Exception
    //   1061	1090	1093	java/lang/Exception
    //   1072	1115	1118	java/lang/Exception
    //   1097	1140	1143	java/lang/Exception
    //   1122	1165	1168	java/lang/Exception
    //   1147	1185	1185	java/lang/Exception
    //   1189	1203	1203	java/lang/Exception
    //   1236	1254	1254	java/lang/Exception
    //   1277	1320	1323	java/lang/Exception
    //   1295	1330	1330	java/lang/Exception
    //   1381	1418	1421	java/lang/Exception
    //   1425	1470	1473	java/lang/Exception
  }
  
  private Zstu ZO(int paramInt, Zstu paramZstu) {
    for (byte[] arrayOfByte : Zu) {
      if (arrayOfByte.length <= paramZstu.Zpu() && Zlt_.ZT(paramZstu, arrayOfByte, 0))
        return this.ZK.Zb(paramInt + arrayOfByte.length, this.Zb); 
    } 
    return paramZstu;
  }
  
  private String Zm() {
    int i = Math.max(this.Zb - 20, 0);
    int j = Math.min(this.Zb + 20, this.ZK.Zpu());
    if (i > j)
      i = j; 
    String str = this.ZK.Zb(i, j).Zis();
    return Zuh.Zr(new Object[] { Integer.valueOf(this.ZN), Integer.valueOf(this.Zl), Integer.valueOf(this.ZK.Zpu()), Integer.valueOf(this.Zb), Integer.valueOf(i), Integer.valueOf(j), str });
  }
  
  private byte ZF() {
    byte b = 3;
    if (this.ZK.Zp(this.Zb) == 34) {
      b = 0;
      this.Zb++;
    } else if (this.ZK.Zp(this.Zb) == 39) {
      b = 1;
      this.Zb++;
    } else if (this.ZK.Zp(this.Zb) == 96) {
      b = 2;
      this.Zb++;
    } 
    return b;
  }
  
  private void Zq() {
    while (this.Zb < this.Zl) {
      if (this.ZC == 1 && this.Zb < this.Zl - 10 && Zlt_.ZT(this.ZK, Zv, this.Zb)) {
        int i = ZL.Zi(this.ZK, this.Zb, this.Zl).ZR();
        if (i != -1) {
          this.Zb = i + 3;
          continue;
        } 
        this.Zb++;
        continue;
      } 
      if (this.Zb + 1 < this.Zl && this.ZK.Zp(this.Zb) == 60 && (Zlt_.ZL(this.ZK, ZI, false, this.Zb + 1) || (ZZ() && !this.ZF)))
        break; 
      this.Zb++;
    } 
  }
  
  private boolean ZZ() {
    byte b = this.ZK.Zp(this.Zb + 1);
    return (b > 32 && b != 46);
  }
  
  private void ZQ() {
    int i = this.Zb;
    boolean bool = false;
    if (this.Zb + 3 < this.Zl && this.ZK.Zp(this.Zb + 2) == 45 && this.ZK.Zp(this.Zb + 3) == 45) {
      int j = ZR.Zi(this.ZK, this.Zb + 3, this.Zl).ZR();
      if (j > 0) {
        this.Zb = j + 2;
        bool = true;
      } 
    } 
    if (!bool)
      while (this.Zb < this.Zl && this.ZK.Zp(this.Zb) != 62)
        this.Zb++;  
    if (this.Zb < this.Zl)
      this.Zb++; 
    this.ZJ.add(new Zcv(i, this.Zb, (byte)2, null, this.ZK.Zb(i, this.Zb).Zis()));
  }
  
  private String Ze() {
    int i = this.Zb;
    while (this.Zb < this.Zl && this.ZK.Zp(this.Zb) > 32 && this.ZK.Zp(this.Zb) != 62 && this.ZK.Zp(this.Zb) != 47)
      this.Zb++; 
    return this.ZK.Zb(i, this.Zb).Zis().toLowerCase();
  }
  
  private void Zh() {
    while (this.Zb < this.Zl && this.ZK.Zp(this.Zb) <= 32)
      this.Zb++; 
  }
  
  private void ZK(byte paramByte) {
    switch (paramByte) {
      case 0:
        while (this.Zb < this.Zl && this.ZK.Zp(this.Zb) != 34)
          this.Zb++; 
        return;
      case 1:
        while (this.Zb < this.Zl && this.ZK.Zp(this.Zb) != 39)
          this.Zb++; 
        return;
      case 2:
        while (this.Zb < this.Zl && this.ZK.Zp(this.Zb) != 96)
          this.Zb++; 
        return;
      case 3:
        while (this.Zb < this.Zl && this.ZK.Zp(this.Zb) > 32 && this.ZK.Zp(this.Zb) != 62)
          this.Zb++; 
        return;
    } 
    Zuh.Zv(false, Zqf.Zk, paramByte);
  }
  
  private List<Ztu8> Zs() {
    return this.ZJ;
  }
  
  private static Boolean lambda$getHtmlElements$0() {
    return Boolean.valueOf(false);
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ec }19qùXâDïÒì'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #34
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
    //   67: ldc 'ÕDÅå[½Ù'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #57
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
    //   128: putstatic burp/Zsz8.a : [Ljava/lang/String;
    //   131: bipush #7
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zsz8.b : [Ljava/lang/String;
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
    //   212: bipush #117
    //   214: goto -> 244
    //   217: bipush #46
    //   219: goto -> 244
    //   222: bipush #33
    //   224: goto -> 244
    //   227: bipush #58
    //   229: goto -> 244
    //   232: bipush #27
    //   234: goto -> 244
    //   237: bipush #67
    //   239: goto -> 244
    //   242: bipush #96
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
    //   300: iconst_3
    //   301: newarray byte
    //   303: dup
    //   304: iconst_0
    //   305: bipush #45
    //   307: bastore
    //   308: dup
    //   309: iconst_1
    //   310: bipush #45
    //   312: bastore
    //   313: dup
    //   314: iconst_2
    //   315: bipush #62
    //   317: bastore
    //   318: putstatic burp/Zsz8.ZD : [B
    //   321: bipush #9
    //   323: newarray byte
    //   325: dup
    //   326: iconst_0
    //   327: bipush #60
    //   329: bastore
    //   330: dup
    //   331: iconst_1
    //   332: bipush #33
    //   334: bastore
    //   335: dup
    //   336: iconst_2
    //   337: bipush #91
    //   339: bastore
    //   340: dup
    //   341: iconst_3
    //   342: bipush #67
    //   344: bastore
    //   345: dup
    //   346: iconst_4
    //   347: bipush #68
    //   349: bastore
    //   350: dup
    //   351: iconst_5
    //   352: bipush #65
    //   354: bastore
    //   355: dup
    //   356: bipush #6
    //   358: bipush #84
    //   360: bastore
    //   361: dup
    //   362: bipush #7
    //   364: bipush #65
    //   366: bastore
    //   367: dup
    //   368: bipush #8
    //   370: bipush #91
    //   372: bastore
    //   373: putstatic burp/Zsz8.Zv : [B
    //   376: iconst_3
    //   377: newarray byte
    //   379: dup
    //   380: iconst_0
    //   381: bipush #93
    //   383: bastore
    //   384: dup
    //   385: iconst_1
    //   386: bipush #93
    //   388: bastore
    //   389: dup
    //   390: iconst_2
    //   391: bipush #62
    //   393: bastore
    //   394: putstatic burp/Zsz8.ZH : [B
    //   397: bipush #7
    //   399: newarray byte
    //   401: dup
    //   402: iconst_0
    //   403: bipush #47
    //   405: bastore
    //   406: dup
    //   407: iconst_1
    //   408: bipush #115
    //   410: bastore
    //   411: dup
    //   412: iconst_2
    //   413: bipush #99
    //   415: bastore
    //   416: dup
    //   417: iconst_3
    //   418: bipush #114
    //   420: bastore
    //   421: dup
    //   422: iconst_4
    //   423: bipush #105
    //   425: bastore
    //   426: dup
    //   427: iconst_5
    //   428: bipush #112
    //   430: bastore
    //   431: dup
    //   432: bipush #6
    //   434: bipush #116
    //   436: bastore
    //   437: putstatic burp/Zsz8.ZI : [B
    //   440: iconst_5
    //   441: anewarray [B
    //   444: dup
    //   445: iconst_0
    //   446: iconst_4
    //   447: newarray byte
    //   449: dup
    //   450: iconst_0
    //   451: iconst_0
    //   452: bastore
    //   453: dup
    //   454: iconst_1
    //   455: iconst_0
    //   456: bastore
    //   457: dup
    //   458: iconst_2
    //   459: bipush #-2
    //   461: bastore
    //   462: dup
    //   463: iconst_3
    //   464: iconst_m1
    //   465: bastore
    //   466: aastore
    //   467: dup
    //   468: iconst_1
    //   469: iconst_4
    //   470: newarray byte
    //   472: dup
    //   473: iconst_0
    //   474: iconst_m1
    //   475: bastore
    //   476: dup
    //   477: iconst_1
    //   478: bipush #-2
    //   480: bastore
    //   481: dup
    //   482: iconst_2
    //   483: iconst_0
    //   484: bastore
    //   485: dup
    //   486: iconst_3
    //   487: iconst_0
    //   488: bastore
    //   489: aastore
    //   490: dup
    //   491: iconst_2
    //   492: iconst_3
    //   493: newarray byte
    //   495: dup
    //   496: iconst_0
    //   497: bipush #-17
    //   499: bastore
    //   500: dup
    //   501: iconst_1
    //   502: bipush #-69
    //   504: bastore
    //   505: dup
    //   506: iconst_2
    //   507: bipush #-65
    //   509: bastore
    //   510: aastore
    //   511: dup
    //   512: iconst_3
    //   513: iconst_2
    //   514: newarray byte
    //   516: dup
    //   517: iconst_0
    //   518: bipush #-2
    //   520: bastore
    //   521: dup
    //   522: iconst_1
    //   523: iconst_m1
    //   524: bastore
    //   525: aastore
    //   526: dup
    //   527: iconst_4
    //   528: iconst_2
    //   529: newarray byte
    //   531: dup
    //   532: iconst_0
    //   533: iconst_m1
    //   534: bastore
    //   535: dup
    //   536: iconst_1
    //   537: bipush #-2
    //   539: bastore
    //   540: aastore
    //   541: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   544: putstatic burp/Zsz8.Zu : Ljava/util/List;
    //   547: getstatic burp/Zsz8.ZH : [B
    //   550: iconst_0
    //   551: iconst_0
    //   552: invokestatic ZJ : ([BZZ)Lburp/Zzrd;
    //   555: putstatic burp/Zsz8.ZL : Lburp/Zzrd;
    //   558: getstatic burp/Zsz8.ZD : [B
    //   561: iconst_0
    //   562: iconst_0
    //   563: invokestatic ZJ : ([BZZ)Lburp/Zzrd;
    //   566: putstatic burp/Zsz8.ZR : Lburp/Zzrd;
    //   569: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC4AB) & 0xFFFF;
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
      char c = 'Û';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsz8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */