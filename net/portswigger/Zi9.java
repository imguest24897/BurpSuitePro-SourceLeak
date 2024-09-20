package net.portswigger;

import java.util.ArrayDeque;
import java.util.Deque;

public class Zi9 {
  private static final char[] Zy;
  
  private static final char[] Ze;
  
  private static final char[] ZH;
  
  private static final char[] Zz;
  
  private static final char[] Zj;
  
  private static final char[] ZB;
  
  private static final char[] Zr;
  
  Deque<Zga> ZW = new ArrayDeque<>();
  
  private final Zrmo Zf;
  
  Zdm Zi;
  
  Zrx0 ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private static char[] Zt(char[] paramArrayOfchar1, char[] paramArrayOfchar2) {
    char[] arrayOfChar = new char[paramArrayOfchar1.length + paramArrayOfchar2.length];
    System.arraycopy(paramArrayOfchar1, 0, arrayOfChar, 0, paramArrayOfchar1.length);
    System.arraycopy(paramArrayOfchar2, 0, arrayOfChar, paramArrayOfchar1.length, paramArrayOfchar2.length);
    return arrayOfChar;
  }
  
  private Zi9(Zrmo paramZrmo, Zdm paramZdm, Zrx0 paramZrx0) {
    this.Zf = paramZrmo;
    this.Zi = paramZdm;
    this.ZF = paramZrx0;
  }
  
  private Zrmq Zt() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zf : Lnet/portswigger/Zrmo;
    //   4: invokevirtual Zx : ()Lnet/portswigger/Zrmo;
    //   7: invokevirtual Ze : ()Z
    //   10: ifne -> 1717
    //   13: aload_0
    //   14: getfield Zf : Lnet/portswigger/Zrmo;
    //   17: invokevirtual Zx : ()Lnet/portswigger/Zrmo;
    //   20: invokevirtual ZY : ()C
    //   23: istore_1
    //   24: iload_1
    //   25: lookupswitch default -> 917, 34 -> 84, 44 -> 593, 91 -> 127, 93 -> 212, 123 -> 335, 125 -> 447
    //   84: aload_0
    //   85: getfield Zf : Lnet/portswigger/Zrmo;
    //   88: getstatic net/portswigger/Zi9.Zy : [C
    //   91: aload_0
    //   92: getfield Zi : Lnet/portswigger/Zdm;
    //   95: invokestatic Zv : (Lnet/portswigger/Zrmo;[CLnet/portswigger/Zdm;)Lnet/portswigger/Zrmq;
    //   98: astore_2
    //   99: aload_2
    //   100: aload_0
    //   101: invokevirtual Zb : ()Ljava/lang/String;
    //   104: invokeinterface Zi : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   109: pop
    //   110: aload_0
    //   111: aload_2
    //   112: invokevirtual Zi : (Lnet/portswigger/Zrmq;)Z
    //   115: ifeq -> 125
    //   118: goto -> 0
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: aload_2
    //   126: areturn
    //   127: invokestatic ZG : ()Lnet/portswigger/Zfb;
    //   130: astore_2
    //   131: aload_0
    //   132: getfield Zf : Lnet/portswigger/Zrmo;
    //   135: invokevirtual ZX : ()Lnet/portswigger/Zrmo;
    //   138: pop
    //   139: aload_2
    //   140: aload_0
    //   141: invokevirtual Zb : ()Ljava/lang/String;
    //   144: invokeinterface ZK : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   149: pop
    //   150: aload_0
    //   151: getfield ZW : Ljava/util/Deque;
    //   154: new net/portswigger/Zgw
    //   157: dup
    //   158: aload_2
    //   159: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   164: invokespecial <init> : (Lnet/portswigger/Zrmq;)V
    //   167: invokeinterface push : (Ljava/lang/Object;)V
    //   172: aload_0
    //   173: getfield Zf : Lnet/portswigger/Zrmo;
    //   176: invokevirtual Zx : ()Lnet/portswigger/Zrmo;
    //   179: pop
    //   180: aload_0
    //   181: getfield Zi : Lnet/portswigger/Zdm;
    //   184: getstatic net/portswigger/Zdm.STRICT : Lnet/portswigger/Zdm;
    //   187: if_acmpne -> 0
    //   190: aload_0
    //   191: getfield Zf : Lnet/portswigger/Zrmo;
    //   194: invokevirtual ZY : ()C
    //   197: bipush #44
    //   199: if_icmpne -> 0
    //   202: aload_0
    //   203: getfield Zf : Lnet/portswigger/Zrmo;
    //   206: invokevirtual Zt : ()V
    //   209: goto -> 0
    //   212: aload_0
    //   213: getfield ZW : Ljava/util/Deque;
    //   216: invokeinterface isEmpty : ()Z
    //   221: ifeq -> 238
    //   224: aload_0
    //   225: getfield Zf : Lnet/portswigger/Zrmo;
    //   228: invokevirtual Zt : ()V
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   237: athrow
    //   238: aload_0
    //   239: getfield ZW : Ljava/util/Deque;
    //   242: invokeinterface pop : ()Ljava/lang/Object;
    //   247: checkcast net/portswigger/Zga
    //   250: astore_2
    //   251: aload_2
    //   252: invokeinterface ZW : ()Z
    //   257: ifne -> 274
    //   260: aload_0
    //   261: getfield Zf : Lnet/portswigger/Zrmo;
    //   264: invokevirtual Zt : ()V
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   273: athrow
    //   274: aload_0
    //   275: getfield Zf : Lnet/portswigger/Zrmo;
    //   278: invokevirtual ZX : ()Lnet/portswigger/Zrmo;
    //   281: pop
    //   282: aload_2
    //   283: invokeinterface Zg : ()Lnet/portswigger/Zrmq;
    //   288: aload_0
    //   289: invokevirtual Zb : ()Ljava/lang/String;
    //   292: invokeinterface Zj : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   297: pop
    //   298: aload_0
    //   299: getfield ZW : Ljava/util/Deque;
    //   302: invokeinterface isEmpty : ()Z
    //   307: ifeq -> 321
    //   310: aload_2
    //   311: invokeinterface Zg : ()Lnet/portswigger/Zrmq;
    //   316: areturn
    //   317: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   320: athrow
    //   321: aload_0
    //   322: aload_2
    //   323: invokeinterface Zg : ()Lnet/portswigger/Zrmq;
    //   328: invokevirtual Zi : (Lnet/portswigger/Zrmq;)Z
    //   331: pop
    //   332: goto -> 0
    //   335: invokestatic ZU : ()Lnet/portswigger/Zi7;
    //   338: astore_2
    //   339: aload_0
    //   340: getfield Zf : Lnet/portswigger/Zrmo;
    //   343: invokevirtual ZX : ()Lnet/portswigger/Zrmo;
    //   346: pop
    //   347: aload_2
    //   348: aload_0
    //   349: invokevirtual Zb : ()Ljava/lang/String;
    //   352: invokeinterface ZK : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   357: pop
    //   358: new net/portswigger/Za2
    //   361: dup
    //   362: aload_2
    //   363: invokeinterface ZP : ()Lnet/portswigger/Zrmq;
    //   368: invokespecial <init> : (Lnet/portswigger/Zrmq;)V
    //   371: astore_3
    //   372: aload_0
    //   373: getfield ZW : Ljava/util/Deque;
    //   376: aload_3
    //   377: invokeinterface push : (Ljava/lang/Object;)V
    //   382: aload_0
    //   383: getfield Zf : Lnet/portswigger/Zrmo;
    //   386: invokevirtual Zx : ()Lnet/portswigger/Zrmo;
    //   389: invokevirtual ZY : ()C
    //   392: bipush #125
    //   394: if_icmpne -> 404
    //   397: goto -> 0
    //   400: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   403: athrow
    //   404: aload_0
    //   405: getfield Zf : Lnet/portswigger/Zrmo;
    //   408: aload_0
    //   409: getfield Zi : Lnet/portswigger/Zdm;
    //   412: invokestatic Zd : (Lnet/portswigger/Zrmo;Lnet/portswigger/Zdm;)Lnet/portswigger/Zrmq;
    //   415: astore #4
    //   417: aload_3
    //   418: aload #4
    //   420: invokeinterface ZW : ()Ljava/lang/String;
    //   425: invokevirtual ZU : (Ljava/lang/String;)V
    //   428: aload_0
    //   429: getfield Zf : Lnet/portswigger/Zrmo;
    //   432: invokevirtual Zx : ()Lnet/portswigger/Zrmo;
    //   435: bipush #58
    //   437: invokevirtual ZR : (C)Lnet/portswigger/Zrmo;
    //   440: invokevirtual ZX : ()Lnet/portswigger/Zrmo;
    //   443: pop
    //   444: goto -> 0
    //   447: aload_0
    //   448: getfield ZW : Ljava/util/Deque;
    //   451: invokeinterface isEmpty : ()Z
    //   456: ifeq -> 473
    //   459: aload_0
    //   460: getfield Zf : Lnet/portswigger/Zrmo;
    //   463: invokevirtual Zt : ()V
    //   466: goto -> 473
    //   469: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   472: athrow
    //   473: aload_0
    //   474: getfield ZW : Ljava/util/Deque;
    //   477: invokeinterface pop : ()Ljava/lang/Object;
    //   482: checkcast net/portswigger/Zga
    //   485: astore_2
    //   486: aload_2
    //   487: invokeinterface ZL : ()Z
    //   492: ifne -> 509
    //   495: aload_0
    //   496: getfield Zf : Lnet/portswigger/Zrmo;
    //   499: invokevirtual Zt : ()V
    //   502: goto -> 509
    //   505: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   508: athrow
    //   509: aload_2
    //   510: invokeinterface Zf : ()Z
    //   515: ifeq -> 532
    //   518: aload_0
    //   519: getfield Zf : Lnet/portswigger/Zrmo;
    //   522: invokevirtual Zt : ()V
    //   525: goto -> 532
    //   528: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   531: athrow
    //   532: aload_0
    //   533: getfield Zf : Lnet/portswigger/Zrmo;
    //   536: invokevirtual ZX : ()Lnet/portswigger/Zrmo;
    //   539: pop
    //   540: aload_2
    //   541: invokeinterface Zg : ()Lnet/portswigger/Zrmq;
    //   546: aload_0
    //   547: invokevirtual Zb : ()Ljava/lang/String;
    //   550: invokeinterface Zj : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   555: pop
    //   556: aload_0
    //   557: getfield ZW : Ljava/util/Deque;
    //   560: invokeinterface isEmpty : ()Z
    //   565: ifeq -> 579
    //   568: aload_2
    //   569: invokeinterface Zg : ()Lnet/portswigger/Zrmq;
    //   574: areturn
    //   575: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   578: athrow
    //   579: aload_0
    //   580: aload_2
    //   581: invokeinterface Zg : ()Lnet/portswigger/Zrmq;
    //   586: invokevirtual Zi : (Lnet/portswigger/Zrmq;)Z
    //   589: pop
    //   590: goto -> 0
    //   593: aload_0
    //   594: getfield Zf : Lnet/portswigger/Zrmo;
    //   597: invokevirtual Zf : ()Lnet/portswigger/Zrmo;
    //   600: pop
    //   601: aload_0
    //   602: getfield ZW : Ljava/util/Deque;
    //   605: invokeinterface isEmpty : ()Z
    //   610: ifeq -> 627
    //   613: aload_0
    //   614: getfield Zf : Lnet/portswigger/Zrmo;
    //   617: invokevirtual Zt : ()V
    //   620: goto -> 627
    //   623: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   626: athrow
    //   627: aload_0
    //   628: getfield Zf : Lnet/portswigger/Zrmo;
    //   631: invokevirtual ZX : ()Lnet/portswigger/Zrmo;
    //   634: invokevirtual Zx : ()Lnet/portswigger/Zrmo;
    //   637: pop
    //   638: aload_0
    //   639: getfield Zi : Lnet/portswigger/Zdm;
    //   642: getstatic net/portswigger/Zdm.STRICT : Lnet/portswigger/Zdm;
    //   645: if_acmpne -> 681
    //   648: aload_0
    //   649: getfield Zf : Lnet/portswigger/Zrmo;
    //   652: invokevirtual ZY : ()C
    //   655: bipush #44
    //   657: if_icmpne -> 681
    //   660: goto -> 667
    //   663: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   666: athrow
    //   667: aload_0
    //   668: getfield Zf : Lnet/portswigger/Zrmo;
    //   671: invokevirtual Zd : ()V
    //   674: goto -> 728
    //   677: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   680: athrow
    //   681: aload_0
    //   682: getfield Zi : Lnet/portswigger/Zdm;
    //   685: getstatic net/portswigger/Zdm.LAX : Lnet/portswigger/Zdm;
    //   688: if_acmpne -> 728
    //   691: aload_0
    //   692: getfield Zf : Lnet/portswigger/Zrmo;
    //   695: invokevirtual ZY : ()C
    //   698: bipush #44
    //   700: if_icmpne -> 728
    //   703: goto -> 710
    //   706: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   709: athrow
    //   710: aload_0
    //   711: getfield Zf : Lnet/portswigger/Zrmo;
    //   714: invokevirtual ZX : ()Lnet/portswigger/Zrmo;
    //   717: invokevirtual Zx : ()Lnet/portswigger/Zrmo;
    //   720: pop
    //   721: goto -> 691
    //   724: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   727: athrow
    //   728: aload_0
    //   729: getfield ZW : Ljava/util/Deque;
    //   732: invokeinterface peek : ()Ljava/lang/Object;
    //   737: checkcast net/portswigger/Zga
    //   740: astore_2
    //   741: aload_2
    //   742: invokeinterface ZW : ()Z
    //   747: ifeq -> 792
    //   750: aload_0
    //   751: getfield Zf : Lnet/portswigger/Zrmo;
    //   754: invokevirtual ZY : ()C
    //   757: bipush #93
    //   759: if_icmpne -> 0
    //   762: goto -> 769
    //   765: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   768: athrow
    //   769: aload_0
    //   770: getfield Zi : Lnet/portswigger/Zdm;
    //   773: getstatic net/portswigger/Zdm.STRICT : Lnet/portswigger/Zdm;
    //   776: if_acmpne -> 0
    //   779: aload_0
    //   780: getfield Zf : Lnet/portswigger/Zrmo;
    //   783: bipush #93
    //   785: invokevirtual ZU : (C)Lnet/portswigger/Zrmo;
    //   788: pop
    //   789: goto -> 0
    //   792: aload_2
    //   793: invokeinterface ZL : ()Z
    //   798: ifeq -> 890
    //   801: aload_0
    //   802: getfield Zf : Lnet/portswigger/Zrmo;
    //   805: invokevirtual ZY : ()C
    //   808: bipush #125
    //   810: if_icmpne -> 847
    //   813: goto -> 820
    //   816: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   819: athrow
    //   820: aload_0
    //   821: getfield Zi : Lnet/portswigger/Zdm;
    //   824: getstatic net/portswigger/Zdm.STRICT : Lnet/portswigger/Zdm;
    //   827: if_acmpne -> 0
    //   830: goto -> 837
    //   833: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   836: athrow
    //   837: aload_0
    //   838: getfield Zf : Lnet/portswigger/Zrmo;
    //   841: bipush #125
    //   843: invokevirtual ZU : (C)Lnet/portswigger/Zrmo;
    //   846: pop
    //   847: aload_0
    //   848: getfield Zf : Lnet/portswigger/Zrmo;
    //   851: aload_0
    //   852: getfield Zi : Lnet/portswigger/Zdm;
    //   855: invokestatic Zd : (Lnet/portswigger/Zrmo;Lnet/portswigger/Zdm;)Lnet/portswigger/Zrmq;
    //   858: astore_3
    //   859: aload_2
    //   860: aload_3
    //   861: invokeinterface ZW : ()Ljava/lang/String;
    //   866: invokeinterface ZU : (Ljava/lang/String;)V
    //   871: aload_0
    //   872: getfield Zf : Lnet/portswigger/Zrmo;
    //   875: invokevirtual Zx : ()Lnet/portswigger/Zrmo;
    //   878: bipush #58
    //   880: invokevirtual ZR : (C)Lnet/portswigger/Zrmo;
    //   883: invokevirtual ZX : ()Lnet/portswigger/Zrmo;
    //   886: pop
    //   887: goto -> 0
    //   890: new java/lang/IllegalStateException
    //   893: dup
    //   894: aload_2
    //   895: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   898: sipush #25700
    //   901: sipush #10253
    //   904: invokestatic a : (II)Ljava/lang/String;
    //   907: swap
    //   908: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   913: invokespecial <init> : (Ljava/lang/String;)V
    //   916: athrow
    //   917: aload_0
    //   918: getfield Zi : Lnet/portswigger/Zdm;
    //   921: getstatic net/portswigger/Zdm.LAX : Lnet/portswigger/Zdm;
    //   924: if_acmpne -> 983
    //   927: iload_1
    //   928: bipush #39
    //   930: if_icmpne -> 983
    //   933: goto -> 940
    //   936: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   939: athrow
    //   940: aload_0
    //   941: getfield Zf : Lnet/portswigger/Zrmo;
    //   944: getstatic net/portswigger/Zi9.Ze : [C
    //   947: aload_0
    //   948: getfield Zi : Lnet/portswigger/Zdm;
    //   951: invokestatic Zv : (Lnet/portswigger/Zrmo;[CLnet/portswigger/Zdm;)Lnet/portswigger/Zrmq;
    //   954: astore_2
    //   955: aload_2
    //   956: aload_0
    //   957: invokevirtual Zb : ()Ljava/lang/String;
    //   960: invokeinterface Zi : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   965: pop
    //   966: aload_0
    //   967: aload_2
    //   968: invokevirtual Zi : (Lnet/portswigger/Zrmq;)Z
    //   971: ifeq -> 981
    //   974: goto -> 0
    //   977: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   980: athrow
    //   981: aload_2
    //   982: areturn
    //   983: aload_0
    //   984: getfield ZF : Lnet/portswigger/Zrx0;
    //   987: getstatic net/portswigger/Zrx0.ALLOW : Lnet/portswigger/Zrx0;
    //   990: if_acmpne -> 1049
    //   993: iload_1
    //   994: bipush #47
    //   996: if_icmpne -> 1049
    //   999: goto -> 1006
    //   1002: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1005: athrow
    //   1006: aload_0
    //   1007: getfield Zf : Lnet/portswigger/Zrmo;
    //   1010: getstatic net/portswigger/Zi9.ZH : [C
    //   1013: aload_0
    //   1014: getfield Zi : Lnet/portswigger/Zdm;
    //   1017: invokestatic Zv : (Lnet/portswigger/Zrmo;[CLnet/portswigger/Zdm;)Lnet/portswigger/Zrmq;
    //   1020: astore_2
    //   1021: aload_2
    //   1022: aload_0
    //   1023: invokevirtual Zb : ()Ljava/lang/String;
    //   1026: invokeinterface Zi : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   1031: pop
    //   1032: aload_0
    //   1033: aload_2
    //   1034: invokevirtual Zi : (Lnet/portswigger/Zrmq;)Z
    //   1037: ifeq -> 1047
    //   1040: goto -> 0
    //   1043: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1046: athrow
    //   1047: aload_2
    //   1048: areturn
    //   1049: aload_0
    //   1050: getfield Zf : Lnet/portswigger/Zrmo;
    //   1053: invokevirtual Zf : ()Lnet/portswigger/Zrmo;
    //   1056: pop
    //   1057: aload_0
    //   1058: invokevirtual ZU : ()Ljava/lang/String;
    //   1061: astore_2
    //   1062: aload_2
    //   1063: astore_3
    //   1064: iconst_m1
    //   1065: istore #4
    //   1067: aload_3
    //   1068: invokevirtual hashCode : ()I
    //   1071: lookupswitch default -> 1264, 78043 -> 1245, 3392903 -> 1128, 3569038 -> 1157, 97196323 -> 1179, 237817416 -> 1201, 506745205 -> 1223
    //   1128: aload_3
    //   1129: sipush #25696
    //   1132: sipush #28590
    //   1135: invokestatic a : (II)Ljava/lang/String;
    //   1138: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1141: ifeq -> 1264
    //   1144: goto -> 1151
    //   1147: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1150: athrow
    //   1151: iconst_0
    //   1152: istore #4
    //   1154: goto -> 1264
    //   1157: aload_3
    //   1158: sipush #25707
    //   1161: sipush #25772
    //   1164: invokestatic a : (II)Ljava/lang/String;
    //   1167: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1170: ifeq -> 1264
    //   1173: iconst_1
    //   1174: istore #4
    //   1176: goto -> 1264
    //   1179: aload_3
    //   1180: sipush #25706
    //   1183: sipush #3766
    //   1186: invokestatic a : (II)Ljava/lang/String;
    //   1189: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1192: ifeq -> 1264
    //   1195: iconst_2
    //   1196: istore #4
    //   1198: goto -> 1264
    //   1201: aload_3
    //   1202: sipush #25710
    //   1205: sipush #12034
    //   1208: invokestatic a : (II)Ljava/lang/String;
    //   1211: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1214: ifeq -> 1264
    //   1217: iconst_3
    //   1218: istore #4
    //   1220: goto -> 1264
    //   1223: aload_3
    //   1224: sipush #25702
    //   1227: sipush #14989
    //   1230: invokestatic a : (II)Ljava/lang/String;
    //   1233: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1236: ifeq -> 1264
    //   1239: iconst_4
    //   1240: istore #4
    //   1242: goto -> 1264
    //   1245: aload_3
    //   1246: sipush #25703
    //   1249: sipush #524
    //   1252: invokestatic a : (II)Ljava/lang/String;
    //   1255: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1258: ifeq -> 1264
    //   1261: iconst_5
    //   1262: istore #4
    //   1264: iload #4
    //   1266: tableswitch default -> 1663, 0 -> 1304, 1 -> 1344, 2 -> 1385, 3 -> 1426, 4 -> 1505, 5 -> 1584
    //   1304: new net/portswigger/Zrzd
    //   1307: dup
    //   1308: invokespecial <init> : ()V
    //   1311: astore #5
    //   1313: aload #5
    //   1315: aload_0
    //   1316: invokevirtual Zb : ()Ljava/lang/String;
    //   1319: invokeinterface Zi : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   1324: pop
    //   1325: aload_0
    //   1326: aload #5
    //   1328: invokevirtual Zi : (Lnet/portswigger/Zrmq;)Z
    //   1331: ifeq -> 1341
    //   1334: goto -> 0
    //   1337: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1340: athrow
    //   1341: aload #5
    //   1343: areturn
    //   1344: new net/portswigger/Zrzq
    //   1347: dup
    //   1348: iconst_1
    //   1349: invokespecial <init> : (Z)V
    //   1352: astore #5
    //   1354: aload #5
    //   1356: aload_0
    //   1357: invokevirtual Zb : ()Ljava/lang/String;
    //   1360: invokeinterface Zi : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   1365: pop
    //   1366: aload_0
    //   1367: aload #5
    //   1369: invokevirtual Zi : (Lnet/portswigger/Zrmq;)Z
    //   1372: ifeq -> 1382
    //   1375: goto -> 0
    //   1378: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1381: athrow
    //   1382: aload #5
    //   1384: areturn
    //   1385: new net/portswigger/Zrzq
    //   1388: dup
    //   1389: iconst_0
    //   1390: invokespecial <init> : (Z)V
    //   1393: astore #5
    //   1395: aload #5
    //   1397: aload_0
    //   1398: invokevirtual Zb : ()Ljava/lang/String;
    //   1401: invokeinterface Zi : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   1406: pop
    //   1407: aload_0
    //   1408: aload #5
    //   1410: invokevirtual Zi : (Lnet/portswigger/Zrmq;)Z
    //   1413: ifeq -> 1423
    //   1416: goto -> 0
    //   1419: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1422: athrow
    //   1423: aload #5
    //   1425: areturn
    //   1426: aload_0
    //   1427: getfield Zi : Lnet/portswigger/Zdm;
    //   1430: getstatic net/portswigger/Zdm.STRICT : Lnet/portswigger/Zdm;
    //   1433: if_acmpne -> 1459
    //   1436: aload_0
    //   1437: getfield Zf : Lnet/portswigger/Zrmo;
    //   1440: sipush #25701
    //   1443: sipush #21414
    //   1446: invokestatic a : (II)Ljava/lang/String;
    //   1449: invokevirtual Zn : (Ljava/lang/String;)V
    //   1452: goto -> 1505
    //   1455: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1458: athrow
    //   1459: new net/portswigger/Zrz2
    //   1462: dup
    //   1463: ldc2_w Infinity
    //   1466: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1469: invokespecial <init> : (Ljava/lang/Number;)V
    //   1472: astore #5
    //   1474: aload #5
    //   1476: aload_0
    //   1477: invokevirtual Zb : ()Ljava/lang/String;
    //   1480: invokeinterface Zi : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   1485: pop
    //   1486: aload_0
    //   1487: aload #5
    //   1489: invokevirtual Zi : (Lnet/portswigger/Zrmq;)Z
    //   1492: ifeq -> 1502
    //   1495: goto -> 0
    //   1498: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1501: athrow
    //   1502: aload #5
    //   1504: areturn
    //   1505: aload_0
    //   1506: getfield Zi : Lnet/portswigger/Zdm;
    //   1509: getstatic net/portswigger/Zdm.STRICT : Lnet/portswigger/Zdm;
    //   1512: if_acmpne -> 1538
    //   1515: aload_0
    //   1516: getfield Zf : Lnet/portswigger/Zrmo;
    //   1519: sipush #25699
    //   1522: sipush #15165
    //   1525: invokestatic a : (II)Ljava/lang/String;
    //   1528: invokevirtual Zn : (Ljava/lang/String;)V
    //   1531: goto -> 1584
    //   1534: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1537: athrow
    //   1538: new net/portswigger/Zrz2
    //   1541: dup
    //   1542: ldc2_w -Infinity
    //   1545: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1548: invokespecial <init> : (Ljava/lang/Number;)V
    //   1551: astore #5
    //   1553: aload #5
    //   1555: aload_0
    //   1556: invokevirtual Zb : ()Ljava/lang/String;
    //   1559: invokeinterface Zi : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   1564: pop
    //   1565: aload_0
    //   1566: aload #5
    //   1568: invokevirtual Zi : (Lnet/portswigger/Zrmq;)Z
    //   1571: ifeq -> 1581
    //   1574: goto -> 0
    //   1577: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1580: athrow
    //   1581: aload #5
    //   1583: areturn
    //   1584: aload_0
    //   1585: getfield Zi : Lnet/portswigger/Zdm;
    //   1588: getstatic net/portswigger/Zdm.STRICT : Lnet/portswigger/Zdm;
    //   1591: if_acmpne -> 1617
    //   1594: aload_0
    //   1595: getfield Zf : Lnet/portswigger/Zrmo;
    //   1598: sipush #25725
    //   1601: sipush #28244
    //   1604: invokestatic a : (II)Ljava/lang/String;
    //   1607: invokevirtual Zn : (Ljava/lang/String;)V
    //   1610: goto -> 1663
    //   1613: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1616: athrow
    //   1617: new net/portswigger/Zrz2
    //   1620: dup
    //   1621: ldc2_w NaN
    //   1624: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1627: invokespecial <init> : (Ljava/lang/Number;)V
    //   1630: astore #5
    //   1632: aload #5
    //   1634: aload_0
    //   1635: invokevirtual Zb : ()Ljava/lang/String;
    //   1638: invokeinterface Zi : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   1643: pop
    //   1644: aload_0
    //   1645: aload #5
    //   1647: invokevirtual Zi : (Lnet/portswigger/Zrmq;)Z
    //   1650: ifeq -> 1660
    //   1653: goto -> 0
    //   1656: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1659: athrow
    //   1660: aload #5
    //   1662: areturn
    //   1663: aload_0
    //   1664: aload_2
    //   1665: invokevirtual ZZ : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   1668: astore #5
    //   1670: aload #5
    //   1672: aload_0
    //   1673: invokevirtual Zb : ()Ljava/lang/String;
    //   1676: invokeinterface Zi : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   1681: pop
    //   1682: aload_0
    //   1683: aload #5
    //   1685: invokevirtual Zi : (Lnet/portswigger/Zrmq;)Z
    //   1688: ifne -> 1694
    //   1691: aload #5
    //   1693: areturn
    //   1694: goto -> 1714
    //   1697: astore #5
    //   1699: aload #5
    //   1701: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   1704: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1707: aload_0
    //   1708: getfield Zf : Lnet/portswigger/Zrmo;
    //   1711: invokevirtual Zd : ()V
    //   1714: goto -> 0
    //   1717: new net/portswigger/Zrzb
    //   1720: dup
    //   1721: invokespecial <init> : ()V
    //   1724: areturn
    // Exception table:
    //   from	to	target	type
    //   99	121	121	java/lang/NumberFormatException
    //   212	231	234	java/lang/NumberFormatException
    //   251	267	270	java/lang/NumberFormatException
    //   274	317	317	java/lang/NumberFormatException
    //   372	400	400	java/lang/NumberFormatException
    //   447	466	469	java/lang/NumberFormatException
    //   486	502	505	java/lang/NumberFormatException
    //   509	525	528	java/lang/NumberFormatException
    //   532	575	575	java/lang/NumberFormatException
    //   593	620	623	java/lang/NumberFormatException
    //   627	660	663	java/lang/NumberFormatException
    //   648	677	677	java/lang/NumberFormatException
    //   681	703	706	java/lang/NumberFormatException
    //   691	724	724	java/lang/NumberFormatException
    //   741	762	765	java/lang/NumberFormatException
    //   792	813	816	java/lang/NumberFormatException
    //   801	830	833	java/lang/NumberFormatException
    //   917	933	936	java/lang/NumberFormatException
    //   955	977	977	java/lang/NumberFormatException
    //   983	999	1002	java/lang/NumberFormatException
    //   1021	1043	1043	java/lang/NumberFormatException
    //   1067	1144	1147	java/lang/NumberFormatException
    //   1313	1337	1337	java/lang/NumberFormatException
    //   1354	1378	1378	java/lang/NumberFormatException
    //   1395	1419	1419	java/lang/NumberFormatException
    //   1426	1455	1455	java/lang/NumberFormatException
    //   1474	1498	1498	java/lang/NumberFormatException
    //   1505	1534	1534	java/lang/NumberFormatException
    //   1553	1577	1577	java/lang/NumberFormatException
    //   1584	1613	1613	java/lang/NumberFormatException
    //   1632	1656	1656	java/lang/NumberFormatException
    //   1663	1693	1697	java/lang/NumberFormatException
  }
  
  private Zrmq ZZ(String paramString) {
    try {
      if (paramString.indexOf('.') == -1)
        try {
          if (paramString.indexOf('e') == -1 && paramString.indexOf('E') == -1)
            return new Zrz2(ZU(paramString)); 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      double d = Double.parseDouble(paramString);
      try {
        float f = Float.parseFloat(paramString);
        if (d == f)
          return new Zrz2(Float.valueOf(f)); 
      } catch (NumberFormatException numberFormatException) {
        Zah.Zl(numberFormatException, Zk_.IGNORED);
      } 
      return new Zrz2(Double.valueOf(d));
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      this.Zf.Zd();
      return null;
    } 
  }
  
  private Number ZU(String paramString) {
    try {
      long l = Long.parseLong(paramString);
      try {
        if (l <= 127L && l >= -128L)
          return Byte.valueOf((byte)(int)l); 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      try {
        if (l <= 32767L && l >= -32768L)
          return Short.valueOf((short)(int)l); 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      try {
        if (l <= 2147483647L && l >= -2147483648L)
          return Integer.valueOf((int)l); 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      return Long.valueOf(l);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      this.Zf.Zd();
      return null;
    } 
  }
  
  private String Zb() {
    try {
      this.Zf.Zx();
      if (!this.Zf.Ze())
        try {
          if (this.Zf.ZY() == '/') {
            this.Zf.Zf().ZX();
            if (!this.Zf.Ze()) {
              char c = this.Zf.ZY();
              try {
                if (c == '/') {
                  try {
                    if (this.Zi == Zdm.STRICT)
                      this.Zf.Zn(a(25709, -1548)); 
                  } catch (IllegalStateException illegalStateException) {
                    throw a(null);
                  } 
                  this.Zf.ZX().Zx();
                  StringBuilder stringBuilder = new StringBuilder();
                  while (true) {
                    try {
                      if (!this.Zf.Ze()) {
                        try {
                          if (this.Zf.ZY() == '\n')
                            break; 
                        } catch (IllegalStateException illegalStateException) {
                          throw a(null);
                        } 
                        stringBuilder.append(this.Zf.ZY());
                        this.Zf.ZX();
                        continue;
                      } 
                    } catch (IllegalStateException illegalStateException) {
                      throw a(null);
                    } 
                    break;
                  } 
                  return stringBuilder.toString().trim();
                } 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
              try {
                if (c == '*') {
                  try {
                    if (this.Zi == Zdm.STRICT)
                      this.Zf.Zn(a(25711, 11526)); 
                  } catch (IllegalStateException illegalStateException) {
                    throw a(null);
                  } 
                  this.Zf.ZX().Zx();
                  StringBuilder stringBuilder = new StringBuilder();
                  while (true) {
                    try {
                      if (!this.Zf.Ze()) {
                        try {
                          if (this.Zf.ZY() == '*') {
                            try {
                              if (this.Zf.ZX().ZY() == '/') {
                                this.Zf.ZX();
                                break;
                              } 
                            } catch (IllegalStateException illegalStateException) {
                              throw a(null);
                            } 
                            stringBuilder.append('*');
                          } 
                        } catch (IllegalStateException illegalStateException) {
                          throw a(null);
                        } 
                        stringBuilder.append(this.Zf.ZY());
                        this.Zf.ZX();
                        continue;
                      } 
                    } catch (IllegalStateException illegalStateException) {
                      throw a(null);
                    } 
                    break;
                  } 
                  return stringBuilder.toString().trim();
                } 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
              this.Zf.Zd();
            } 
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return null;
  }
  
  private String ZU() {
    StringBuilder stringBuilder = new StringBuilder();
    while (!this.Zf.Ze()) {
      char c = this.Zf.ZY();
      try {
        if (!Zv3.Zj(c))
          try {
            if (!Zv3.Zh(c))
              try {
                if (c != '.')
                  try {
                    if (c != '-') {
                      try {
                        if (c == '+')
                          continue; 
                      } catch (IllegalStateException illegalStateException) {
                        throw a(null);
                      } 
                      break;
                    } 
                  } catch (IllegalStateException illegalStateException) {
                    throw a(null);
                  }  
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              }  
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      continue;
      stringBuilder.append(SYNTHETIC_LOCAL_VARIABLE_2);
      this.Zf.ZX();
    } 
    return stringBuilder.toString();
  }
  
  private boolean Zi(Zrmq paramZrmq) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZW : Ljava/util/Deque;
    //   4: invokeinterface isEmpty : ()Z
    //   9: ifeq -> 18
    //   12: iconst_0
    //   13: ireturn
    //   14: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   17: athrow
    //   18: aload_0
    //   19: getfield ZW : Ljava/util/Deque;
    //   22: invokeinterface peek : ()Ljava/lang/Object;
    //   27: checkcast net/portswigger/Zga
    //   30: astore_2
    //   31: aload_2
    //   32: aload_1
    //   33: invokeinterface ZJ : (Lnet/portswigger/Zrmq;)V
    //   38: aload_0
    //   39: getfield Zf : Lnet/portswigger/Zrmo;
    //   42: invokevirtual Zx : ()Lnet/portswigger/Zrmo;
    //   45: invokevirtual ZY : ()C
    //   48: istore_3
    //   49: iload_3
    //   50: bipush #44
    //   52: if_icmpeq -> 127
    //   55: aload_2
    //   56: invokeinterface ZW : ()Z
    //   61: ifeq -> 84
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   70: athrow
    //   71: iload_3
    //   72: bipush #93
    //   74: if_icmpeq -> 127
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: aload_2
    //   85: invokeinterface ZL : ()Z
    //   90: ifeq -> 113
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   99: athrow
    //   100: iload_3
    //   101: bipush #125
    //   103: if_icmpeq -> 127
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   112: athrow
    //   113: aload_0
    //   114: getfield Zf : Lnet/portswigger/Zrmo;
    //   117: invokevirtual Zt : ()V
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: iconst_1
    //   128: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	14	java/lang/IllegalStateException
    //   49	64	67	java/lang/IllegalStateException
    //   55	77	80	java/lang/IllegalStateException
    //   71	93	96	java/lang/IllegalStateException
    //   84	106	109	java/lang/IllegalStateException
    //   100	120	123	java/lang/IllegalStateException
  }
  
  private static Zrmq Zv(Zrmo paramZrmo, char[] paramArrayOfchar, Zdm paramZdm) {
    paramZrmo.ZR(paramArrayOfchar[0]).ZX();
    Zrmq zrmq = Zs(paramZrmo, paramArrayOfchar, paramZdm);
    paramZrmo.ZR(paramArrayOfchar[0]).ZX();
    return zrmq;
  }
  
  private static Zrmq Zs(Zrmo paramZrmo, char[] paramArrayOfchar, Zdm paramZdm) {
    StringBuilder stringBuilder = new StringBuilder();
    label69: while (!paramZrmo.Ze()) {
      char c = paramZrmo.ZY();
      for (char c1 : paramArrayOfchar) {
        try {
          if (c == c1)
            break label69; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
      try {
        if (c == '\\') {
          try {
            paramZrmo.Zf().ZX();
            if (paramZrmo.Ze())
              paramZrmo.Zy(a(25704, 17628)); 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          char c1 = paramZrmo.ZY();
          try {
            char c2;
            switch (c1) {
              case '/':
              case '\\':
                stringBuilder.append(c1);
                break;
              case 'b':
                stringBuilder.append('\b');
                break;
              case 'f':
                stringBuilder.append('\f');
                break;
              case 'n':
                stringBuilder.append('\n');
                break;
              case 'r':
                stringBuilder.append('\r');
                break;
              case 't':
                stringBuilder.append('\t');
                break;
              case 'u':
                c2 = ZS(paramZrmo);
                stringBuilder.append(c2);
                break;
              default:
                for (char c3 : paramArrayOfchar) {
                  try {
                    if (c1 == c3) {
                      stringBuilder.append(c1);
                      continue label69;
                    } 
                  } catch (IllegalStateException illegalStateException) {
                    throw a(null);
                  } 
                } 
                try {
                  if (paramZdm == Zdm.LAX)
                    try {
                      if (c1 == 'x') {
                        stringBuilder.append((char)Integer.parseInt("" + paramZrmo.ZX().ZY(a(25705, 1455)).ZY() + paramZrmo.ZX().ZY(a(25705, 1455)).ZY(), 16));
                        break;
                      } 
                    } catch (IllegalStateException illegalStateException) {
                      throw a(null);
                    }  
                } catch (IllegalStateException illegalStateException) {
                  throw a(null);
                } 
                paramZrmo.Zy(a(25708, 2500));
                break;
            } 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        } else {
          stringBuilder.append(c);
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      paramZrmo.ZX();
    } 
    return new Zrzf(stringBuilder.toString());
  }
  
  private static char ZS(Zrmo paramZrmo) {
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    try {
      while (b < 4) {
        stringBuilder.append(paramZrmo.ZX().ZY(a(25698, -29450)).ZY());
        b++;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (char)Integer.parseInt(stringBuilder.toString(), 16);
  }
  
  private static Zrmq Zd(Zrmo paramZrmo, Zdm paramZdm) {
    char c = paramZrmo.ZY();
    try {
      if (c == '"')
        return Zv(paramZrmo, Zy, paramZdm); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramZdm == Zdm.LAX)
        try {
          if (c == '\'')
            return Zv(paramZrmo, Ze, paramZdm); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramZdm == Zdm.LAX)
        try {
          if (Zv3.Zj(c))
            return Zs(paramZrmo, Zr, paramZdm); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    paramZrmo.ZR('"');
    return null;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'YáXº$rë¯|³8.öÇ/TËaóö&öüìpö&húß6è8*à$Uùæ£ï ö_Ég1ùÂM-°Ô<\\tô/ÀùòyÆaÝóÇø^¢Ó ¨<-µ±?7ëuo|F¶à\\bäÅwäÎ±E\\na\\bQMÖ¥3ªÄ$)û0_(ì@¤HÌ"µ7#Ö$+©½9×Ë~\\nªÈx5GÔØ!0DÅ«xÅn$Ëâeÿ­¦À8<qxÇT*7òd¢3!+þ¾å­\\nc"¿¿2gm±b÷ú/ðÒéµÈ)¢"*êð¬SøÇ4\\t½ ­|¥ùà^dñü'vúl.hYîÕ+(<pÛ.VI<AÑÌaK§&þ`7A<ó½V'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #45
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_2
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
    //   64: goto -> 23
    //   67: ldc '©b #¢¿¾üÄÙ ´L)dÓ 5¾­_ykð¡"¢G^¾ûL¬²d\\t'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #22
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #59
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
    //   128: putstatic net/portswigger/Zi9.a : [Ljava/lang/String;
    //   131: bipush #17
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/Zi9.b : [Ljava/lang/String;
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
    //   212: bipush #75
    //   214: goto -> 244
    //   217: bipush #109
    //   219: goto -> 244
    //   222: bipush #116
    //   224: goto -> 244
    //   227: bipush #80
    //   229: goto -> 244
    //   232: bipush #84
    //   234: goto -> 244
    //   237: bipush #69
    //   239: goto -> 244
    //   242: bipush #50
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
    //   300: iconst_1
    //   301: newarray char
    //   303: dup
    //   304: iconst_0
    //   305: bipush #34
    //   307: castore
    //   308: putstatic net/portswigger/Zi9.Zy : [C
    //   311: iconst_1
    //   312: newarray char
    //   314: dup
    //   315: iconst_0
    //   316: bipush #39
    //   318: castore
    //   319: putstatic net/portswigger/Zi9.Ze : [C
    //   322: iconst_1
    //   323: newarray char
    //   325: dup
    //   326: iconst_0
    //   327: bipush #47
    //   329: castore
    //   330: putstatic net/portswigger/Zi9.ZH : [C
    //   333: iconst_4
    //   334: newarray char
    //   336: dup
    //   337: iconst_0
    //   338: bipush #9
    //   340: castore
    //   341: dup
    //   342: iconst_1
    //   343: bipush #10
    //   345: castore
    //   346: dup
    //   347: iconst_2
    //   348: bipush #13
    //   350: castore
    //   351: dup
    //   352: iconst_3
    //   353: bipush #32
    //   355: castore
    //   356: putstatic net/portswigger/Zi9.Zz : [C
    //   359: iconst_2
    //   360: newarray char
    //   362: dup
    //   363: iconst_0
    //   364: bipush #12
    //   366: castore
    //   367: dup
    //   368: iconst_1
    //   369: iconst_0
    //   370: castore
    //   371: putstatic net/portswigger/Zi9.Zj : [C
    //   374: getstatic net/portswigger/Zi9.Zz : [C
    //   377: getstatic net/portswigger/Zi9.Zj : [C
    //   380: invokestatic Zt : ([C[C)[C
    //   383: putstatic net/portswigger/Zi9.ZB : [C
    //   386: getstatic net/portswigger/Zi9.ZB : [C
    //   389: iconst_1
    //   390: newarray char
    //   392: dup
    //   393: iconst_0
    //   394: bipush #58
    //   396: castore
    //   397: invokestatic Zt : ([C[C)[C
    //   400: putstatic net/portswigger/Zi9.Zr : [C
    //   403: return
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x646D) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zi9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */