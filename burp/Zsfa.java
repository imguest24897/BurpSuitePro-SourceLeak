package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.InputEvent;
import java.util.List;

class Zsfa {
  private final Zz28 Zi;
  
  private final Zbiv ZV;
  
  private final Zey9 ZW;
  
  private final Zs9q Zk;
  
  private final Zerg ZA;
  
  private final Zgso ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zsfa(Zs9q paramZs9q, Zerg paramZerg, Zz28 paramZz28, Zbiv paramZbiv, Zey9 paramZey9, Zgso paramZgso) {
    this.Zk = paramZs9q;
    this.ZA = paramZerg;
    this.Zi = paramZz28;
    this.ZV = paramZbiv;
    this.ZW = paramZey9;
    this.ZH = paramZgso;
  }
  
  void Zm(List<Zzme> paramList, Component paramComponent, Point paramPoint, InputEvent paramInputEvent, Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload #5
    //   4: <illegal opcode> ZI : (Lburp/Zsfa;Ljava/util/List;Ljava/lang/Runnable;)Lburp/Zzyl;
    //   9: astore #7
    //   11: invokestatic ZI : ()Z
    //   14: aload_1
    //   15: iconst_0
    //   16: invokeinterface get : (I)Ljava/lang/Object;
    //   21: checkcast burp/Zzme
    //   24: astore #8
    //   26: istore #6
    //   28: aload_1
    //   29: invokeinterface size : ()I
    //   34: iconst_1
    //   35: if_icmple -> 42
    //   38: iconst_1
    //   39: goto -> 43
    //   42: iconst_0
    //   43: istore #9
    //   45: iload #9
    //   47: ifne -> 56
    //   50: aload #8
    //   52: ifnonnull -> 56
    //   55: return
    //   56: aload_0
    //   57: aload_1
    //   58: invokevirtual ZT : (Ljava/util/List;)Lburp/Zkj9;
    //   61: astore #10
    //   63: iload #9
    //   65: ifeq -> 99
    //   68: aload #10
    //   70: aload #7
    //   72: ldc 133408
    //   74: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   77: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   80: pop
    //   81: aload #10
    //   83: aload #7
    //   85: ldc 133440
    //   87: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   90: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   93: pop
    //   94: iload #6
    //   96: ifne -> 149
    //   99: aload_0
    //   100: getfield Zi : Lburp/Zz28;
    //   103: aload #8
    //   105: invokeinterface ZHm : ()Lburp/Zlit;
    //   110: invokeinterface ZG : (Lburp/Zlit;)Z
    //   115: ifeq -> 136
    //   118: aload #10
    //   120: aload #7
    //   122: ldc 133440
    //   124: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   127: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   130: pop
    //   131: iload #6
    //   133: ifne -> 149
    //   136: aload #10
    //   138: aload #7
    //   140: ldc 133408
    //   142: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   145: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   148: pop
    //   149: aload #10
    //   151: new javax/swing/JSeparator
    //   154: dup
    //   155: invokespecial <init> : ()V
    //   158: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   161: pop
    //   162: new burp/Zeur
    //   165: dup
    //   166: aload_1
    //   167: aload_0
    //   168: getfield ZW : Lburp/Zey9;
    //   171: invokespecial <init> : (Ljava/util/List;Lburp/Zey9;)V
    //   174: astore #11
    //   176: aload_0
    //   177: getfield ZV : Lburp/Zbiv;
    //   180: aload #10
    //   182: aload #11
    //   184: dup
    //   185: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   188: pop
    //   189: <illegal opcode> accept : (Lburp/Zeur;)Ljava/util/function/Consumer;
    //   194: aload #7
    //   196: invokevirtual ZA : (Lburp/Zkj9;Ljava/util/function/Consumer;Lburp/Zzyl;)V
    //   199: aload #10
    //   201: new javax/swing/JSeparator
    //   204: dup
    //   205: invokespecial <init> : ()V
    //   208: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   211: pop
    //   212: iload #9
    //   214: ifne -> 590
    //   217: aload_0
    //   218: getfield ZA : Lburp/Zerg;
    //   221: invokevirtual Zg : ()Lburp/Zr00;
    //   224: ifnull -> 240
    //   227: aload #10
    //   229: aload #7
    //   231: ldc 131584
    //   233: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   236: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   239: pop
    //   240: aload_0
    //   241: getfield ZA : Lburp/Zerg;
    //   244: invokevirtual Zm : ()Lburp/Zx_a;
    //   247: ifnull -> 281
    //   250: aload #7
    //   252: ldc 131328
    //   254: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   257: astore #12
    //   259: aload #12
    //   261: sipush #18009
    //   264: sipush #5599
    //   267: invokestatic a : (II)Ljava/lang/String;
    //   270: invokevirtual setName : (Ljava/lang/String;)V
    //   273: aload #10
    //   275: aload #12
    //   277: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   280: pop
    //   281: aload_0
    //   282: getfield ZA : Lburp/Zerg;
    //   285: invokevirtual ZK : ()Lburp/Zbui;
    //   288: ifnull -> 304
    //   291: aload #10
    //   293: aload #7
    //   295: ldc 133120
    //   297: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   300: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   303: pop
    //   304: aload_0
    //   305: getfield ZA : Lburp/Zerg;
    //   308: invokevirtual ZH : ()Lburp/Zg_j;
    //   311: ifnull -> 395
    //   314: aload #8
    //   316: invokeinterface ZHh : ()Lburp/Zstu;
    //   321: ifnonnull -> 351
    //   324: aload #10
    //   326: aload #7
    //   328: ldc 132672
    //   330: sipush #17995
    //   333: sipush #16073
    //   336: invokestatic a : (II)Ljava/lang/String;
    //   339: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   342: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   345: pop
    //   346: iload #6
    //   348: ifne -> 395
    //   351: aload #10
    //   353: aload #7
    //   355: ldc 132672
    //   357: sipush #17992
    //   360: sipush #23982
    //   363: invokestatic a : (II)Ljava/lang/String;
    //   366: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   369: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   372: pop
    //   373: aload #10
    //   375: aload #7
    //   377: ldc 132736
    //   379: sipush #17984
    //   382: sipush #-3024
    //   385: invokestatic a : (II)Ljava/lang/String;
    //   388: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   391: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   394: pop
    //   395: aload_0
    //   396: getfield ZA : Lburp/Zerg;
    //   399: invokevirtual Ze : ()Lburp/Zeu0;
    //   402: ifnull -> 436
    //   405: aload #7
    //   407: ldc 132992
    //   409: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   412: astore #12
    //   414: aload #12
    //   416: sipush #17989
    //   419: sipush #16864
    //   422: invokestatic a : (II)Ljava/lang/String;
    //   425: invokevirtual setName : (Ljava/lang/String;)V
    //   428: aload #10
    //   430: aload #12
    //   432: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   435: pop
    //   436: aload_0
    //   437: getfield ZA : Lburp/Zerg;
    //   440: invokevirtual ZM : ()Lburp/Zgvn;
    //   443: ifnull -> 492
    //   446: aload_0
    //   447: getfield ZA : Lburp/Zerg;
    //   450: invokevirtual ZM : ()Lburp/Zgvn;
    //   453: invokeinterface ZR : ()Z
    //   458: ifeq -> 492
    //   461: aload #7
    //   463: ldc 133008
    //   465: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   468: astore #12
    //   470: aload #12
    //   472: sipush #17996
    //   475: sipush #11917
    //   478: invokestatic a : (II)Ljava/lang/String;
    //   481: invokevirtual setName : (Ljava/lang/String;)V
    //   484: aload #10
    //   486: aload #12
    //   488: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   491: pop
    //   492: aload #8
    //   494: invokeinterface ZHh : ()Lburp/Zstu;
    //   499: ifnull -> 515
    //   502: aload #10
    //   504: aload #7
    //   506: ldc 134912
    //   508: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   511: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   514: pop
    //   515: new burp/Zztv
    //   518: dup
    //   519: sipush #18010
    //   522: sipush #6480
    //   525: invokestatic a : (II)Ljava/lang/String;
    //   528: invokespecial <init> : (Ljava/lang/String;)V
    //   531: astore #12
    //   533: aload #12
    //   535: aload #7
    //   537: ldc 135168
    //   539: sipush #18008
    //   542: sipush #18828
    //   545: invokestatic a : (II)Ljava/lang/String;
    //   548: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   551: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   554: pop
    //   555: aload #12
    //   557: aload #7
    //   559: ldc 135424
    //   561: sipush #17990
    //   564: sipush #29718
    //   567: invokestatic a : (II)Ljava/lang/String;
    //   570: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   573: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   576: pop
    //   577: aload #10
    //   579: aload #12
    //   581: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   584: pop
    //   585: iload #6
    //   587: ifne -> 634
    //   590: aload #10
    //   592: aload #7
    //   594: ldc 132672
    //   596: sipush #17991
    //   599: sipush #-11766
    //   602: invokestatic a : (II)Ljava/lang/String;
    //   605: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   608: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   611: pop
    //   612: aload #10
    //   614: aload #7
    //   616: ldc 132736
    //   618: sipush #17998
    //   621: sipush #-1311
    //   624: invokestatic a : (II)Ljava/lang/String;
    //   627: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   630: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   633: pop
    //   634: aload_0
    //   635: getfield ZA : Lburp/Zerg;
    //   638: invokevirtual ZM : ()Lburp/Zgvn;
    //   641: invokeinterface ZY : ()Ljava/util/List;
    //   646: astore #12
    //   648: aload #12
    //   650: ifnull -> 742
    //   653: aload_0
    //   654: getfield ZH : Lburp/Zgso;
    //   657: getstatic burp/Zrpb.CONTEXT_ORGANIZER_TABLE : Lburp/Zrpb;
    //   660: aload #4
    //   662: aconst_null
    //   663: aload_1
    //   664: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   669: aload_0
    //   670: <illegal opcode> apply : (Lburp/Zsfa;)Ljava/util/function/Function;
    //   675: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   680: <illegal opcode> apply : ()Ljava/util/function/IntFunction;
    //   685: invokeinterface toArray : (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    //   690: checkcast [Lburp/Zmgv;
    //   693: invokevirtual ZU : (Lburp/Zrpb;Ljava/awt/event/InputEvent;[I[Lburp/Zmgv;)Ljava/util/List;
    //   696: astore #13
    //   698: aload #13
    //   700: invokeinterface iterator : ()Ljava/util/Iterator;
    //   705: astore #14
    //   707: aload #14
    //   709: invokeinterface hasNext : ()Z
    //   714: ifeq -> 742
    //   717: aload #14
    //   719: invokeinterface next : ()Ljava/lang/Object;
    //   724: checkcast java/awt/Component
    //   727: astore #15
    //   729: aload #10
    //   731: aload #15
    //   733: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   736: pop
    //   737: iload #6
    //   739: ifne -> 707
    //   742: aload #10
    //   744: new javax/swing/JSeparator
    //   747: dup
    //   748: invokespecial <init> : ()V
    //   751: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   754: pop
    //   755: aload #7
    //   757: ldc 135680
    //   759: sipush #17985
    //   762: sipush #22384
    //   765: invokestatic a : (II)Ljava/lang/String;
    //   768: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   771: astore #13
    //   773: aload #13
    //   775: sipush #18013
    //   778: sipush #-28045
    //   781: invokestatic a : (II)Ljava/lang/String;
    //   784: invokevirtual setName : (Ljava/lang/String;)V
    //   787: aload #10
    //   789: aload #13
    //   791: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   794: pop
    //   795: new burp/Zztv
    //   798: dup
    //   799: sipush #17997
    //   802: sipush #15800
    //   805: invokestatic a : (II)Ljava/lang/String;
    //   808: invokespecial <init> : (Ljava/lang/String;)V
    //   811: astore #14
    //   813: invokestatic ZP : ()[Lburp/Zzsm;
    //   816: astore #15
    //   818: iconst_0
    //   819: istore #16
    //   821: iload #16
    //   823: aload #15
    //   825: arraylength
    //   826: if_icmpge -> 878
    //   829: aload #15
    //   831: iload #16
    //   833: aaload
    //   834: astore #17
    //   836: aload #7
    //   838: getstatic burp/Ztde.Zp : [I
    //   841: iload #16
    //   843: iaload
    //   844: aload #17
    //   846: getfield displayLabel : Ljava/lang/String;
    //   849: aload #17
    //   851: getfield svgIconFile : Lburp/Zgzq;
    //   854: invokevirtual ZD : ()Ljavax/swing/ImageIcon;
    //   857: invokestatic ZO : (Lburp/Zzyl;ILjava/lang/String;Ljavax/swing/Icon;)Lburp/Zepk;
    //   860: astore #18
    //   862: aload #14
    //   864: aload #18
    //   866: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   869: pop
    //   870: iinc #16, 1
    //   873: iload #6
    //   875: ifne -> 821
    //   878: aload #10
    //   880: aload #14
    //   882: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   885: pop
    //   886: new burp/Zztv
    //   889: dup
    //   890: sipush #17993
    //   893: sipush #1606
    //   896: invokestatic a : (II)Ljava/lang/String;
    //   899: invokespecial <init> : (Ljava/lang/String;)V
    //   902: astore #16
    //   904: aload #10
    //   906: aload #16
    //   908: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   911: pop
    //   912: iconst_0
    //   913: istore #17
    //   915: iload #17
    //   917: getstatic burp/Ztde.Zs : [I
    //   920: arraylength
    //   921: if_icmpge -> 961
    //   924: aload #16
    //   926: iload #17
    //   928: aload #7
    //   930: getstatic burp/Ztde.Zs : [I
    //   933: iload #17
    //   935: iaload
    //   936: aload #8
    //   938: invokeinterface ZHT : ()Ljava/lang/String;
    //   943: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   946: invokestatic ZE : (ILburp/Zepe;)Lburp/Zepe;
    //   949: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   952: pop
    //   953: iinc #17, 1
    //   956: iload #6
    //   958: ifne -> 915
    //   961: iload #9
    //   963: ifeq -> 978
    //   966: sipush #18011
    //   969: sipush #-16772
    //   972: invokestatic a : (II)Ljava/lang/String;
    //   975: goto -> 987
    //   978: sipush #17994
    //   981: sipush #22960
    //   984: invokestatic a : (II)Ljava/lang/String;
    //   987: astore #17
    //   989: aload #7
    //   991: ldc 134656
    //   993: aload #17
    //   995: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   998: astore #18
    //   1000: aload #18
    //   1002: sipush #17988
    //   1005: sipush #23403
    //   1008: invokestatic a : (II)Ljava/lang/String;
    //   1011: invokevirtual setName : (Ljava/lang/String;)V
    //   1014: aload #10
    //   1016: aload #18
    //   1018: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1021: pop
    //   1022: aload #7
    //   1024: ldc 540672
    //   1026: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   1029: astore #19
    //   1031: aload #19
    //   1033: sipush #17987
    //   1036: sipush #19422
    //   1039: invokestatic a : (II)Ljava/lang/String;
    //   1042: invokevirtual setName : (Ljava/lang/String;)V
    //   1045: aload #10
    //   1047: aload #19
    //   1049: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1052: pop
    //   1053: iload #9
    //   1055: ifeq -> 1085
    //   1058: aload #10
    //   1060: aload #7
    //   1062: ldc 134400
    //   1064: sipush #17986
    //   1067: sipush #32088
    //   1070: invokestatic a : (II)Ljava/lang/String;
    //   1073: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   1076: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1079: pop
    //   1080: iload #6
    //   1082: ifne -> 1111
    //   1085: aload #10
    //   1087: aload #7
    //   1089: ldc 134400
    //   1091: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   1094: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1097: pop
    //   1098: aload #10
    //   1100: aload #7
    //   1102: ldc 134416
    //   1104: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   1107: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1110: pop
    //   1111: aload #10
    //   1113: new javax/swing/JSeparator
    //   1116: dup
    //   1117: invokespecial <init> : ()V
    //   1120: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   1123: pop
    //   1124: aload #10
    //   1126: new burp/Zepa
    //   1129: dup
    //   1130: sipush #17999
    //   1133: sipush #-25311
    //   1136: invokestatic a : (II)Ljava/lang/String;
    //   1139: getstatic burp/Zk97.DESKTOP_TOOLS_ORGANISER : Lburp/Zk97;
    //   1142: aload_2
    //   1143: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   1146: invokespecial <init> : (Ljava/lang/String;Lburp/Zk97;Ljava/awt/Window;)V
    //   1149: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1152: pop
    //   1153: aload #10
    //   1155: aload_2
    //   1156: aload_3
    //   1157: getfield x : I
    //   1160: aload_3
    //   1161: getfield y : I
    //   1164: invokevirtual show : (Ljava/awt/Component;II)V
    //   1167: return
  }
  
  private Zkj9 ZT(List<Zzme> paramList) {
    if (paramList.size() > 1)
      return Zsn5.ZA(paramList.size()); 
    Zlit zlit = ((Zzme)paramList.get(0)).ZHm();
    return (zlit == null) ? new Zkj9() : Zsn5.ZR(zlit.toString());
  }
  
  private static Ze6z[] lambda$showPopup$3(int paramInt) {
    return new Ze6z[paramInt];
  }
  
  private Ze6z lambda$showPopup$2(Zzme paramZzme) {
    return new Ze6z(paramZzme, this.ZW, Zsfa::lambda$showPopup$1);
  }
  
  private static void lambda$showPopup$1() {}
  
  private boolean lambda$showPopup$0(List<Zzme> paramList, Runnable paramRunnable, int paramInt, Object paramObject) {
    return this.Zk.Z_(paramInt, paramList, paramRunnable);
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '»ÂÃÒ$ufÁ8ýUqÒêoT/Ï»q\\fÅæTû°=oiÊèÓÉå«Êå­þæDÔºÉqÓä7/¼]ñÞSÝ2ZñáZ4.*wöüI±<Ôfõ®Cx¨.^°Tå\\r´ªÚ*ºÇc4©ÔûâÌìED7g®®ÉÎna¢®Z^ÁÓ\\thlºøXªÎQ£ö­g\\n©µwåW©F?áé·í"B"ZSliénSý{H\\b.Â?FK`\\t Ég*Ë¸7ØIZJ"Óµ\\tß"®ÝÎ2×¨"âbØdmÄÀ^¶ä,FëR~3Â `LÉü±QNyïöDaÍØûHâðÆÈÿ#½G7¦4ëä¯ÚeÅ¢mk/·+?WÙ\\nË\\t_eóïÙ¶Æ+õ"_¾Hñ¥·+òÂ¸ÕpòlbUPMéúòÌ4mÞ3'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #38
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
    //   68: ldc '@Cq%XÛfÏ.Xsíkk9Ç S7'~v5Õ×ÚÚÆ! a·ì×ÒÿÁË®ÜÀdðØ`¡Â'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #18
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #63
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
    //   129: putstatic burp/Zsfa.a : [Ljava/lang/String;
    //   132: bipush #21
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zsfa.b : [Ljava/lang/String;
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
    //   212: bipush #32
    //   214: goto -> 244
    //   217: bipush #56
    //   219: goto -> 244
    //   222: bipush #116
    //   224: goto -> 244
    //   227: bipush #26
    //   229: goto -> 244
    //   232: bipush #33
    //   234: goto -> 244
    //   237: bipush #69
    //   239: goto -> 244
    //   242: bipush #62
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
    int i = (paramInt1 ^ 0x4649) & 0xFFFF;
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
      char c = 'ì';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsfa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */