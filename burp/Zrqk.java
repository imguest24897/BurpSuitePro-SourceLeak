package burp;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.List;

public class Zrqk implements Zrs_ {
  private final boolean ZG;
  
  private final Zerg ZS;
  
  private final Zbiv Zo;
  
  private final Zkl6 ZC;
  
  private final Zeew ZA;
  
  private final Zgso ZZ;
  
  private final Zg5d Zl;
  
  private final Zeie Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrqk(boolean paramBoolean, Zerg paramZerg, Zr_4 paramZr_4, Ztwv paramZtwv, Zbiv paramZbiv, Zbnt paramZbnt, Zkl6 paramZkl6, Zeew paramZeew, Zgli paramZgli, Zm6x paramZm6x, Zb9b paramZb9b) {
    this.ZG = paramBoolean;
    this.ZS = paramZerg;
    this.Zo = paramZbiv;
    this.ZC = paramZkl6;
    this.ZA = paramZeew;
    this.ZZ = new Zgso(paramZbnt, paramZkl6, paramZerg, paramZeew, paramZgli, paramZm6x);
    this.Zl = (paramZr_4 != null) ? new Zg5d(paramZerg, paramZr_4, paramZtwv, paramZeew) : null;
    this.Zv = new Zeie(paramZb9b);
  }
  
  public List<Component> Zi(Zmgv paramZmgv, Zlbp paramZlbp, Zgu3 paramZgu3, Zgsq paramZgsq, MouseEvent paramMouseEvent, Zzyl paramZzyl, Component paramComponent, boolean paramBoolean, int[] paramArrayOfint) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #11
    //   9: invokestatic ZM : ()[I
    //   12: aload_0
    //   13: getfield ZC : Lburp/Zkl6;
    //   16: invokeinterface ZH : ()Lburp/Zey9;
    //   21: astore #12
    //   23: astore #10
    //   25: aload_0
    //   26: aload_1
    //   27: aload #12
    //   29: invokevirtual Zu : (Lburp/Zmgv;Lburp/Zey9;)Z
    //   32: ifeq -> 81
    //   35: aload #11
    //   37: aload_0
    //   38: getfield Zl : Lburp/Zg5d;
    //   41: aload_1
    //   42: aload_2
    //   43: aload_0
    //   44: getfield ZG : Z
    //   47: aload_3
    //   48: aload #12
    //   50: invokevirtual ZR : (Lburp/Zmgv;Lburp/Zlbp;ZLburp/Zgu3;Lburp/Zey9;)Ljava/awt/Component;
    //   53: invokeinterface add : (Ljava/lang/Object;)Z
    //   58: pop
    //   59: aload #11
    //   61: new burp/Zem9
    //   64: dup
    //   65: invokespecial <init> : ()V
    //   68: invokeinterface add : (Ljava/lang/Object;)Z
    //   73: pop
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   80: athrow
    //   81: aload_1
    //   82: ifnull -> 128
    //   85: aload_1
    //   86: invokeinterface Zo3 : ()Lburp/Zbr;
    //   91: ifnull -> 128
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   100: athrow
    //   101: aload_1
    //   102: invokeinterface Zo3 : ()Lburp/Zbr;
    //   107: invokevirtual Zd : ()Z
    //   110: ifne -> 128
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   119: athrow
    //   120: iconst_1
    //   121: goto -> 129
    //   124: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   127: athrow
    //   128: iconst_0
    //   129: istore #13
    //   131: aload_1
    //   132: ifnull -> 159
    //   135: aload_1
    //   136: invokeinterface ZoO : ()Lburp/Zstu;
    //   141: ifnull -> 159
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   150: athrow
    //   151: iconst_1
    //   152: goto -> 160
    //   155: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   158: athrow
    //   159: iconst_0
    //   160: istore #14
    //   162: aload_3
    //   163: getstatic burp/Zgu3.WS_MESSAGE : Lburp/Zgu3;
    //   166: if_acmpne -> 177
    //   169: iconst_1
    //   170: goto -> 178
    //   173: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   176: athrow
    //   177: iconst_0
    //   178: istore #15
    //   180: aload_3
    //   181: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   184: if_acmpeq -> 199
    //   187: iload #13
    //   189: ifeq -> 207
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   198: athrow
    //   199: iconst_1
    //   200: goto -> 208
    //   203: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   206: athrow
    //   207: iconst_0
    //   208: istore #16
    //   210: aload_3
    //   211: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   214: if_acmpeq -> 229
    //   217: iload #14
    //   219: ifeq -> 237
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   228: athrow
    //   229: iconst_1
    //   230: goto -> 238
    //   233: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   236: athrow
    //   237: iconst_0
    //   238: istore #17
    //   240: aload_0
    //   241: getfield Zv : Lburp/Zeie;
    //   244: aload_3
    //   245: aload #9
    //   247: aload #6
    //   249: invokevirtual Zr : (Lburp/Zgu3;[ILburp/Zzyl;)Ljava/util/List;
    //   252: astore #18
    //   254: aload #18
    //   256: invokeinterface isEmpty : ()Z
    //   261: ifne -> 296
    //   264: aload #11
    //   266: aload #18
    //   268: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   273: pop
    //   274: aload #11
    //   276: new burp/Zem9
    //   279: dup
    //   280: invokespecial <init> : ()V
    //   283: invokeinterface add : (Ljava/lang/Object;)Z
    //   288: pop
    //   289: goto -> 296
    //   292: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   295: athrow
    //   296: iload #16
    //   298: ifeq -> 485
    //   301: new burp/Zsqz
    //   304: dup
    //   305: aload_1
    //   306: aload_2
    //   307: aload_3
    //   308: aload #12
    //   310: invokespecial <init> : (Lburp/Zmgv;Lburp/Zsmh;Lburp/Zgu3;Lburp/Zey9;)V
    //   313: astore #19
    //   315: sipush #29978
    //   318: sipush #19400
    //   321: invokestatic a : (II)Ljava/lang/String;
    //   324: aload #19
    //   326: dup
    //   327: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   330: pop
    //   331: <illegal opcode> accept : (Lburp/Zsqz;)Ljava/util/function/Consumer;
    //   336: invokestatic ZA : (Ljava/lang/String;Ljava/util/function/Consumer;)Lburp/Zmwa;
    //   339: astore #20
    //   341: aload #9
    //   343: ifnull -> 437
    //   346: aload #9
    //   348: arraylength
    //   349: iconst_2
    //   350: if_icmpne -> 437
    //   353: goto -> 360
    //   356: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   359: athrow
    //   360: aload #9
    //   362: iconst_0
    //   363: iaload
    //   364: aload #9
    //   366: iconst_1
    //   367: iaload
    //   368: if_icmpeq -> 437
    //   371: goto -> 378
    //   374: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   377: athrow
    //   378: sipush #29981
    //   381: sipush #-16055
    //   384: invokestatic a : (II)Ljava/lang/String;
    //   387: aload #19
    //   389: aload #9
    //   391: <illegal opcode> accept : (Lburp/Zsqz;[I)Ljava/util/function/Consumer;
    //   396: invokestatic Zo : (Ljava/lang/String;Ljava/util/function/Consumer;)Lburp/Zmwa;
    //   399: astore #21
    //   401: aload #11
    //   403: aload_0
    //   404: getfield Zo : Lburp/Zbiv;
    //   407: aload #6
    //   409: iconst_2
    //   410: anewarray burp/Zmwa
    //   413: dup
    //   414: iconst_0
    //   415: aload #20
    //   417: aastore
    //   418: dup
    //   419: iconst_1
    //   420: aload #21
    //   422: aastore
    //   423: invokevirtual ZT : (Lburp/Zzyl;[Lburp/Zmwa;)Ljava/util/List;
    //   426: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   431: pop
    //   432: aload #10
    //   434: ifnull -> 470
    //   437: aload #11
    //   439: aload_0
    //   440: getfield Zo : Lburp/Zbiv;
    //   443: aload #6
    //   445: iconst_1
    //   446: anewarray burp/Zmwa
    //   449: dup
    //   450: iconst_0
    //   451: aload #20
    //   453: aastore
    //   454: invokevirtual ZT : (Lburp/Zzyl;[Lburp/Zmwa;)Ljava/util/List;
    //   457: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   462: pop
    //   463: goto -> 470
    //   466: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   469: athrow
    //   470: aload #11
    //   472: new burp/Zem9
    //   475: dup
    //   476: invokespecial <init> : ()V
    //   479: invokeinterface add : (Ljava/lang/Object;)Z
    //   484: pop
    //   485: iload #16
    //   487: ifeq -> 529
    //   490: aload_0
    //   491: getfield ZS : Lburp/Zerg;
    //   494: invokevirtual Zg : ()Lburp/Zr00;
    //   497: ifnull -> 529
    //   500: goto -> 507
    //   503: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   506: athrow
    //   507: aload #11
    //   509: aload #6
    //   511: ldc 131584
    //   513: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   516: invokeinterface add : (Ljava/lang/Object;)Z
    //   521: pop
    //   522: goto -> 529
    //   525: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   528: athrow
    //   529: iload #16
    //   531: ifne -> 563
    //   534: iload #15
    //   536: ifeq -> 602
    //   539: goto -> 546
    //   542: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   545: athrow
    //   546: aload_0
    //   547: getfield ZA : Lburp/Zeew;
    //   550: getstatic burp/Zeew.EXTENDER : Lburp/Zeew;
    //   553: if_acmpeq -> 602
    //   556: goto -> 563
    //   559: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   562: athrow
    //   563: aload_0
    //   564: getfield ZS : Lburp/Zerg;
    //   567: invokevirtual Zm : ()Lburp/Zx_a;
    //   570: ifnull -> 602
    //   573: goto -> 580
    //   576: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   579: athrow
    //   580: aload #11
    //   582: aload #6
    //   584: ldc 131328
    //   586: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   589: invokeinterface add : (Ljava/lang/Object;)Z
    //   594: pop
    //   595: goto -> 602
    //   598: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   601: athrow
    //   602: iload #16
    //   604: ifeq -> 646
    //   607: aload_0
    //   608: getfield ZS : Lburp/Zerg;
    //   611: invokevirtual ZK : ()Lburp/Zbui;
    //   614: ifnull -> 646
    //   617: goto -> 624
    //   620: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   623: athrow
    //   624: aload #11
    //   626: aload #6
    //   628: ldc 133120
    //   630: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   633: invokeinterface add : (Ljava/lang/Object;)Z
    //   638: pop
    //   639: goto -> 646
    //   642: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   645: athrow
    //   646: aload_0
    //   647: getfield ZS : Lburp/Zerg;
    //   650: invokevirtual ZH : ()Lburp/Zg_j;
    //   653: ifnull -> 678
    //   656: aload #11
    //   658: aload #6
    //   660: ldc 132608
    //   662: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   665: invokeinterface add : (Ljava/lang/Object;)Z
    //   670: pop
    //   671: goto -> 678
    //   674: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   677: athrow
    //   678: aload_0
    //   679: getfield ZS : Lburp/Zerg;
    //   682: invokevirtual Za : ()Lburp/Ztw;
    //   685: ifnull -> 710
    //   688: aload #11
    //   690: aload #6
    //   692: ldc 132864
    //   694: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   697: invokeinterface add : (Ljava/lang/Object;)Z
    //   702: pop
    //   703: goto -> 710
    //   706: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   709: athrow
    //   710: iload #16
    //   712: ifne -> 727
    //   715: iload #17
    //   717: ifeq -> 879
    //   720: goto -> 727
    //   723: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   726: athrow
    //   727: aload_0
    //   728: getfield ZS : Lburp/Zerg;
    //   731: invokevirtual Ze : ()Lburp/Zeu0;
    //   734: ifnull -> 777
    //   737: goto -> 744
    //   740: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   743: athrow
    //   744: aload #6
    //   746: ldc 132992
    //   748: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   751: astore #19
    //   753: aload #19
    //   755: sipush #29982
    //   758: sipush #-16859
    //   761: invokestatic a : (II)Ljava/lang/String;
    //   764: invokevirtual setName : (Ljava/lang/String;)V
    //   767: aload #11
    //   769: aload #19
    //   771: invokeinterface add : (Ljava/lang/Object;)Z
    //   776: pop
    //   777: aload_0
    //   778: getfield ZS : Lburp/Zerg;
    //   781: invokevirtual ZM : ()Lburp/Zgvn;
    //   784: astore #19
    //   786: aload #19
    //   788: ifnull -> 879
    //   791: aload #19
    //   793: invokeinterface ZR : ()Z
    //   798: ifeq -> 879
    //   801: goto -> 808
    //   804: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   807: athrow
    //   808: aload #6
    //   810: ldc 133008
    //   812: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   815: astore #20
    //   817: aload #20
    //   819: sipush #29977
    //   822: sipush #5925
    //   825: invokestatic a : (II)Ljava/lang/String;
    //   828: invokevirtual setName : (Ljava/lang/String;)V
    //   831: aload_1
    //   832: ifnull -> 859
    //   835: aload_1
    //   836: invokeinterface Zod : ()Lburp/Zmzk;
    //   841: ifnull -> 859
    //   844: goto -> 851
    //   847: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   850: athrow
    //   851: iconst_1
    //   852: goto -> 860
    //   855: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   858: athrow
    //   859: iconst_0
    //   860: istore #21
    //   862: aload #20
    //   864: iload #21
    //   866: invokevirtual setEnabled : (Z)V
    //   869: aload #11
    //   871: aload #20
    //   873: invokeinterface add : (Ljava/lang/Object;)Z
    //   878: pop
    //   879: aload_0
    //   880: getfield ZG : Z
    //   883: ifeq -> 908
    //   886: aload #11
    //   888: aload #6
    //   890: ldc 405248
    //   892: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   895: invokeinterface add : (Ljava/lang/Object;)Z
    //   900: pop
    //   901: goto -> 908
    //   904: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   907: athrow
    //   908: iload #16
    //   910: ifeq -> 947
    //   913: iload #17
    //   915: ifeq -> 947
    //   918: goto -> 925
    //   921: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   924: athrow
    //   925: aload #11
    //   927: aload #6
    //   929: ldc 134912
    //   931: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   934: invokeinterface add : (Ljava/lang/Object;)Z
    //   939: pop
    //   940: goto -> 947
    //   943: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   946: athrow
    //   947: iload #16
    //   949: ifeq -> 1024
    //   952: new burp/Zztv
    //   955: dup
    //   956: sipush #29980
    //   959: sipush #-32705
    //   962: invokestatic a : (II)Ljava/lang/String;
    //   965: invokespecial <init> : (Ljava/lang/String;)V
    //   968: astore #19
    //   970: aload #11
    //   972: aload #19
    //   974: invokeinterface add : (Ljava/lang/Object;)Z
    //   979: pop
    //   980: aload #19
    //   982: aload #6
    //   984: ldc 135168
    //   986: sipush #29979
    //   989: sipush #-32319
    //   992: invokestatic a : (II)Ljava/lang/String;
    //   995: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   998: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1001: pop
    //   1002: aload #19
    //   1004: aload #6
    //   1006: ldc 135424
    //   1008: sipush #29983
    //   1011: sipush #16325
    //   1014: invokestatic a : (II)Ljava/lang/String;
    //   1017: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   1020: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1023: pop
    //   1024: aload_0
    //   1025: getfield ZS : Lburp/Zerg;
    //   1028: invokevirtual ZM : ()Lburp/Zgvn;
    //   1031: invokeinterface ZY : ()Ljava/util/List;
    //   1036: astore #19
    //   1038: aload #19
    //   1040: ifnull -> 1303
    //   1043: aload_0
    //   1044: getfield ZG : Z
    //   1047: ifeq -> 1132
    //   1050: goto -> 1057
    //   1053: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   1056: athrow
    //   1057: getstatic burp/Zkqh.Zm : [I
    //   1060: aload_3
    //   1061: invokevirtual ordinal : ()I
    //   1064: iaload
    //   1065: tableswitch default -> 1096, 1 -> 1110, 2 -> 1116, 3 -> 1122
    //   1092: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   1095: athrow
    //   1096: new java/lang/MatchException
    //   1099: dup
    //   1100: aconst_null
    //   1101: aconst_null
    //   1102: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1105: athrow
    //   1106: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   1109: athrow
    //   1110: getstatic burp/Zrpb.CONTEXT_MESSAGE_EDITOR_REQUEST : Lburp/Zrpb;
    //   1113: goto -> 1125
    //   1116: getstatic burp/Zrpb.CONTEXT_MESSAGE_EDITOR_RESPONSE : Lburp/Zrpb;
    //   1119: goto -> 1125
    //   1122: getstatic burp/Zrpb.CONTEXT_WEB_SOCKET_EDITOR : Lburp/Zrpb;
    //   1125: astore #20
    //   1127: aload #10
    //   1129: ifnull -> 1203
    //   1132: getstatic burp/Zkqh.Zm : [I
    //   1135: aload_3
    //   1136: invokevirtual ordinal : ()I
    //   1139: iaload
    //   1140: tableswitch default -> 1172, 1 -> 1186, 2 -> 1192, 3 -> 1198
    //   1168: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   1171: athrow
    //   1172: new java/lang/MatchException
    //   1175: dup
    //   1176: aconst_null
    //   1177: aconst_null
    //   1178: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1181: athrow
    //   1182: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   1185: athrow
    //   1186: getstatic burp/Zrpb.CONTEXT_MESSAGE_VIEWER_REQUEST : Lburp/Zrpb;
    //   1189: goto -> 1201
    //   1192: getstatic burp/Zrpb.CONTEXT_MESSAGE_VIEWER_RESPONSE : Lburp/Zrpb;
    //   1195: goto -> 1201
    //   1198: getstatic burp/Zrpb.CONTEXT_WEB_SOCKET_VIEWER : Lburp/Zrpb;
    //   1201: astore #20
    //   1203: getstatic burp/Zkqh.Zm : [I
    //   1206: aload_3
    //   1207: invokevirtual ordinal : ()I
    //   1210: iaload
    //   1211: tableswitch default -> 1303, 1 -> 1270, 2 -> 1270, 3 -> 1236
    //   1236: aload #11
    //   1238: aload_0
    //   1239: getfield ZZ : Lburp/Zgso;
    //   1242: aload #20
    //   1244: aload #5
    //   1246: aload #9
    //   1248: aload_2
    //   1249: invokevirtual ZW : (Lburp/Zrpb;Ljava/awt/event/InputEvent;[ILburp/Zlbp;)Ljava/util/List;
    //   1252: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   1257: pop
    //   1258: aload #10
    //   1260: ifnull -> 1303
    //   1263: goto -> 1270
    //   1266: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   1269: athrow
    //   1270: aload_1
    //   1271: aload_2
    //   1272: aload_3
    //   1273: aload #4
    //   1275: invokestatic Zj : (Lburp/Zmgv;Lburp/Zsmh;Lburp/Zgu3;Lburp/Zgsq;)Lburp/Zmgv;
    //   1278: astore #21
    //   1280: aload #11
    //   1282: aload_0
    //   1283: getfield ZZ : Lburp/Zgso;
    //   1286: aload #20
    //   1288: aload #5
    //   1290: aload #9
    //   1292: aload #21
    //   1294: invokevirtual ZN : (Lburp/Zrpb;Ljava/awt/event/InputEvent;[ILburp/Zmgv;)Ljava/util/List;
    //   1297: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   1302: pop
    //   1303: iload #16
    //   1305: ifeq -> 1407
    //   1308: aload #11
    //   1310: new burp/Zem9
    //   1313: dup
    //   1314: invokespecial <init> : ()V
    //   1317: invokeinterface add : (Ljava/lang/Object;)Z
    //   1322: pop
    //   1323: new burp/Zztv
    //   1326: dup
    //   1327: sipush #29974
    //   1330: sipush #14434
    //   1333: invokestatic a : (II)Ljava/lang/String;
    //   1336: invokespecial <init> : (Ljava/lang/String;)V
    //   1339: astore #20
    //   1341: aload #11
    //   1343: aload #20
    //   1345: invokeinterface add : (Ljava/lang/Object;)Z
    //   1350: pop
    //   1351: aload #20
    //   1353: aload #6
    //   1355: ldc 133376
    //   1357: iconst_1
    //   1358: invokestatic ZY : (Lburp/Zzyl;IZ)Lburp/Zepk;
    //   1361: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1364: pop
    //   1365: aload #20
    //   1367: aload #6
    //   1369: ldc 133632
    //   1371: iconst_1
    //   1372: invokestatic ZY : (Lburp/Zzyl;IZ)Lburp/Zepk;
    //   1375: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1378: pop
    //   1379: aload #20
    //   1381: aload #6
    //   1383: ldc 133888
    //   1385: iconst_1
    //   1386: invokestatic ZY : (Lburp/Zzyl;IZ)Lburp/Zepk;
    //   1389: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1392: pop
    //   1393: aload #20
    //   1395: aload #6
    //   1397: ldc 134144
    //   1399: iconst_1
    //   1400: invokestatic ZY : (Lburp/Zzyl;IZ)Lburp/Zepk;
    //   1403: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1406: pop
    //   1407: aload #11
    //   1409: new burp/Zem9
    //   1412: dup
    //   1413: invokespecial <init> : ()V
    //   1416: invokeinterface add : (Ljava/lang/Object;)Z
    //   1421: pop
    //   1422: aload_3
    //   1423: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   1426: if_acmpne -> 1480
    //   1429: aload_0
    //   1430: getfield ZG : Z
    //   1433: ifeq -> 1480
    //   1436: goto -> 1443
    //   1439: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   1442: athrow
    //   1443: aload #11
    //   1445: aload #6
    //   1447: ldc 395264
    //   1449: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   1452: invokeinterface add : (Ljava/lang/Object;)Z
    //   1457: pop
    //   1458: aload #11
    //   1460: aload #6
    //   1462: ldc 395328
    //   1464: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   1467: invokeinterface add : (Ljava/lang/Object;)Z
    //   1472: pop
    //   1473: goto -> 1480
    //   1476: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   1479: athrow
    //   1480: iload #8
    //   1482: ifne -> 1507
    //   1485: aload #11
    //   1487: aload #6
    //   1489: ldc 393728
    //   1491: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   1494: invokeinterface add : (Ljava/lang/Object;)Z
    //   1499: pop
    //   1500: goto -> 1507
    //   1503: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   1506: athrow
    //   1507: iload #16
    //   1509: ifeq -> 1549
    //   1512: aload #11
    //   1514: aload #6
    //   1516: ldc 134400
    //   1518: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   1521: invokeinterface add : (Ljava/lang/Object;)Z
    //   1526: pop
    //   1527: aload #11
    //   1529: aload #6
    //   1531: ldc 134416
    //   1533: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   1536: invokeinterface add : (Ljava/lang/Object;)Z
    //   1541: pop
    //   1542: goto -> 1549
    //   1545: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   1548: athrow
    //   1549: aload #11
    //   1551: aload #6
    //   1553: ldc 394048
    //   1555: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   1558: invokeinterface add : (Ljava/lang/Object;)Z
    //   1563: pop
    //   1564: aload_0
    //   1565: getfield ZG : Z
    //   1568: ifeq -> 1604
    //   1571: aload #6
    //   1573: ldc 394112
    //   1575: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   1578: astore #20
    //   1580: aload #20
    //   1582: sipush #29976
    //   1585: sipush #-31446
    //   1588: invokestatic a : (II)Ljava/lang/String;
    //   1591: invokevirtual setName : (Ljava/lang/String;)V
    //   1594: aload #11
    //   1596: aload #20
    //   1598: invokeinterface add : (Ljava/lang/Object;)Z
    //   1603: pop
    //   1604: iload #16
    //   1606: ifeq -> 1640
    //   1609: aload #11
    //   1611: aload #6
    //   1613: ldc 134784
    //   1615: sipush #29975
    //   1618: sipush #16741
    //   1621: invokestatic a : (II)Ljava/lang/String;
    //   1624: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   1627: invokeinterface add : (Ljava/lang/Object;)Z
    //   1632: pop
    //   1633: goto -> 1640
    //   1636: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   1639: athrow
    //   1640: aload_1
    //   1641: ifnull -> 1706
    //   1644: aload_1
    //   1645: invokeinterface Zof : ()Ljava/util/List;
    //   1650: astore #20
    //   1652: aload #20
    //   1654: ifnull -> 1706
    //   1657: aload #20
    //   1659: invokeinterface isEmpty : ()Z
    //   1664: ifne -> 1706
    //   1667: goto -> 1674
    //   1670: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   1673: athrow
    //   1674: aload #11
    //   1676: new burp/Zem9
    //   1679: dup
    //   1680: invokespecial <init> : ()V
    //   1683: invokeinterface add : (Ljava/lang/Object;)Z
    //   1688: pop
    //   1689: aload #11
    //   1691: aload #20
    //   1693: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   1698: pop
    //   1699: goto -> 1706
    //   1702: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   1705: athrow
    //   1706: aload #11
    //   1708: areturn
    // Exception table:
    //   from	to	target	type
    //   25	74	77	java/lang/MatchException
    //   81	94	97	java/lang/MatchException
    //   85	113	116	java/lang/MatchException
    //   101	124	124	java/lang/MatchException
    //   131	144	147	java/lang/MatchException
    //   135	155	155	java/lang/MatchException
    //   162	173	173	java/lang/MatchException
    //   180	192	195	java/lang/MatchException
    //   187	203	203	java/lang/MatchException
    //   210	222	225	java/lang/MatchException
    //   217	233	233	java/lang/MatchException
    //   254	289	292	java/lang/MatchException
    //   341	353	356	java/lang/MatchException
    //   346	371	374	java/lang/MatchException
    //   401	463	466	java/lang/MatchException
    //   485	500	503	java/lang/MatchException
    //   490	522	525	java/lang/MatchException
    //   529	539	542	java/lang/MatchException
    //   534	556	559	java/lang/MatchException
    //   546	573	576	java/lang/MatchException
    //   563	595	598	java/lang/MatchException
    //   602	617	620	java/lang/MatchException
    //   607	639	642	java/lang/MatchException
    //   646	671	674	java/lang/MatchException
    //   678	703	706	java/lang/MatchException
    //   710	720	723	java/lang/MatchException
    //   715	737	740	java/lang/MatchException
    //   786	801	804	java/lang/MatchException
    //   817	844	847	java/lang/MatchException
    //   835	855	855	java/lang/MatchException
    //   879	901	904	java/lang/MatchException
    //   908	918	921	java/lang/MatchException
    //   913	940	943	java/lang/MatchException
    //   1038	1050	1053	java/lang/MatchException
    //   1043	1092	1092	java/lang/MatchException
    //   1057	1106	1106	java/lang/MatchException
    //   1127	1168	1168	java/lang/MatchException
    //   1132	1182	1182	java/lang/MatchException
    //   1203	1263	1266	java/lang/MatchException
    //   1407	1436	1439	java/lang/MatchException
    //   1429	1473	1476	java/lang/MatchException
    //   1480	1500	1503	java/lang/MatchException
    //   1507	1542	1545	java/lang/MatchException
    //   1604	1633	1636	java/lang/MatchException
    //   1652	1667	1670	java/lang/MatchException
    //   1657	1699	1702	java/lang/MatchException
  }
  
  private boolean Zu(Zmgv paramZmgv, Zey9 paramZey9) {
    try {
      if (this.Zl != null)
        try {
          if (paramZmgv != null)
            try {
              if (paramZmgv.Zo3() != null && (new Zkid()).Zz(paramZmgv.Zo3().ZP(paramZmgv.Zod(), paramZey9)));
            } catch (MatchException matchException) {
              throw a(null);
            }  
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  private static void lambda$getContextMenuItems$0(Zsqz paramZsqz, int[] paramArrayOfint, Ztj1 paramZtj1) {
    paramZsqz.Zw(paramZtj1, (List)List.of(paramArrayOfint));
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÎEìªy÷IÒb\\r(a;Äî56¾Ýtº>È§Çº+\\tàù4\\f~ËÆL¸ù©CÛgõèêv¤Ö· r`Ík(DNöF©º}Ýf*B{ æ¹g¦ÙÚØoµ\\ræ¬Ø bü¿qâÿÙû=åZïÿÄ!u)=ì+¨é8ðdj²ËM#õçºË5L@nÀøp'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #26
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #16
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'AqÊ¬$Ò\\b\\f2Eap­!D%ç´euà,_µ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #47
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zrqk.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrqk.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #11
    //   214: goto -> 244
    //   217: bipush #45
    //   219: goto -> 244
    //   222: bipush #6
    //   224: goto -> 244
    //   227: bipush #117
    //   229: goto -> 244
    //   232: bipush #103
    //   234: goto -> 244
    //   237: bipush #99
    //   239: goto -> 244
    //   242: bipush #49
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x751F) & 0xFFFF;
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
      char c = 'Ù';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrqk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */