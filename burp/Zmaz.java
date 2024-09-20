package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.InputEvent;
import java.util.List;

class Zmaz implements Zsh3<Zeo2>, Zzyl {
  private final Zz28 Zb;
  
  private final Zbiv ZP;
  
  private final Zzp8<Zeo2> Zy;
  
  private final Zerg ZT;
  
  private final Zgso ZL;
  
  private List<Zeo2> Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zmaz(Zzp8<Zeo2> paramZzp8, Zerg paramZerg, Zz28 paramZz28, Zbiv paramZbiv, Zbnt paramZbnt, Zkl6 paramZkl6, Zm6x paramZm6x) {
    this.Zy = paramZzp8;
    this.ZT = paramZerg;
    this.Zb = paramZz28;
    this.ZP = paramZbiv;
    this.ZL = new Zgso(paramZbnt, paramZkl6, paramZerg, Zeew.PROXY, new Zsai(), paramZm6x);
  }
  
  public void ZK(List<Zeo2> paramList, InputEvent paramInputEvent, Component paramComponent, Point paramPoint) {
    // Byte code:
    //   0: invokestatic ZxL : ()I
    //   3: istore #5
    //   5: aload_1
    //   6: ifnull -> 18
    //   9: aload_1
    //   10: invokeinterface isEmpty : ()Z
    //   15: ifeq -> 19
    //   18: return
    //   19: new burp/Zb_g
    //   22: dup
    //   23: aload_0
    //   24: getfield Zy : Lburp/Zzp8;
    //   27: aload_1
    //   28: aload #4
    //   30: invokespecial <init> : (Lburp/Zzp8;Ljava/util/List;Ljava/awt/Point;)V
    //   33: astore #6
    //   35: aload_0
    //   36: aload_1
    //   37: putfield Zh : Ljava/util/List;
    //   40: aload_1
    //   41: iconst_0
    //   42: invokeinterface get : (I)Ljava/lang/Object;
    //   47: checkcast burp/Zeo2
    //   50: astore #7
    //   52: aload_1
    //   53: invokeinterface size : ()I
    //   58: istore #8
    //   60: iload #8
    //   62: iconst_1
    //   63: if_icmple -> 70
    //   66: iconst_1
    //   67: goto -> 71
    //   70: iconst_0
    //   71: istore #9
    //   73: iload #9
    //   75: ifne -> 84
    //   78: aload #7
    //   80: ifnonnull -> 84
    //   83: return
    //   84: iload #9
    //   86: ifeq -> 97
    //   89: iload #8
    //   91: invokestatic ZA : (I)Lburp/Zkj9;
    //   94: goto -> 112
    //   97: aload #7
    //   99: invokeinterface ZlL : ()Lburp/Zlit;
    //   104: invokeinterface toString : ()Ljava/lang/String;
    //   109: invokestatic ZR : (Ljava/lang/String;)Lburp/Zkj9;
    //   112: astore #10
    //   114: iload #9
    //   116: ifeq -> 150
    //   119: aload #10
    //   121: aload #6
    //   123: ldc 133408
    //   125: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   128: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   131: pop
    //   132: aload #10
    //   134: aload #6
    //   136: ldc 133440
    //   138: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   141: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   144: pop
    //   145: iload #5
    //   147: ifeq -> 204
    //   150: aload #7
    //   152: invokeinterface ZlL : ()Lburp/Zlit;
    //   157: astore #11
    //   159: aload_0
    //   160: getfield Zb : Lburp/Zz28;
    //   163: aload #11
    //   165: invokeinterface ZG : (Lburp/Zlit;)Z
    //   170: ifeq -> 191
    //   173: aload #10
    //   175: aload #6
    //   177: ldc 133440
    //   179: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   182: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   185: pop
    //   186: iload #5
    //   188: ifeq -> 204
    //   191: aload #10
    //   193: aload #6
    //   195: ldc 133408
    //   197: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   200: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   203: pop
    //   204: aload #10
    //   206: new javax/swing/JSeparator
    //   209: dup
    //   210: invokespecial <init> : ()V
    //   213: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   216: pop
    //   217: new burp/Ztz4
    //   220: dup
    //   221: aload_0
    //   222: invokespecial <init> : (Lburp/Zmaz;)V
    //   225: astore #11
    //   227: aload_0
    //   228: getfield ZP : Lburp/Zbiv;
    //   231: aload #10
    //   233: aload #11
    //   235: dup
    //   236: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   239: pop
    //   240: <illegal opcode> accept : (Lburp/Ztz4;)Ljava/util/function/Consumer;
    //   245: aload #6
    //   247: invokevirtual ZA : (Lburp/Zkj9;Ljava/util/function/Consumer;Lburp/Zzyl;)V
    //   250: aload #10
    //   252: new javax/swing/JSeparator
    //   255: dup
    //   256: invokespecial <init> : ()V
    //   259: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   262: pop
    //   263: iload #9
    //   265: ifne -> 587
    //   268: aload_0
    //   269: getfield ZT : Lburp/Zerg;
    //   272: invokevirtual Zg : ()Lburp/Zr00;
    //   275: ifnull -> 291
    //   278: aload #10
    //   280: aload #6
    //   282: ldc 131584
    //   284: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   287: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   290: pop
    //   291: aload_0
    //   292: getfield ZT : Lburp/Zerg;
    //   295: invokevirtual Zm : ()Lburp/Zx_a;
    //   298: ifnull -> 314
    //   301: aload #10
    //   303: aload #6
    //   305: ldc 131328
    //   307: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   310: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   313: pop
    //   314: aload_0
    //   315: getfield ZT : Lburp/Zerg;
    //   318: invokevirtual ZK : ()Lburp/Zbui;
    //   321: ifnull -> 337
    //   324: aload #10
    //   326: aload #6
    //   328: ldc 133120
    //   330: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   333: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   336: pop
    //   337: aload_0
    //   338: getfield ZT : Lburp/Zerg;
    //   341: invokevirtual Ze : ()Lburp/Zeu0;
    //   344: ifnull -> 360
    //   347: aload #10
    //   349: aload #6
    //   351: ldc 132992
    //   353: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   356: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   359: pop
    //   360: aload_0
    //   361: getfield ZT : Lburp/Zerg;
    //   364: invokevirtual ZM : ()Lburp/Zgvn;
    //   367: ifnull -> 398
    //   370: aload_0
    //   371: getfield ZT : Lburp/Zerg;
    //   374: invokevirtual ZM : ()Lburp/Zgvn;
    //   377: invokeinterface ZR : ()Z
    //   382: ifeq -> 398
    //   385: aload #10
    //   387: aload #6
    //   389: ldc 133008
    //   391: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   394: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   397: pop
    //   398: aload_0
    //   399: getfield ZT : Lburp/Zerg;
    //   402: invokevirtual ZH : ()Lburp/Zg_j;
    //   405: ifnull -> 489
    //   408: aload #7
    //   410: invokeinterface ZX7 : ()Lburp/Zstu;
    //   415: ifnonnull -> 445
    //   418: aload #10
    //   420: aload #6
    //   422: ldc 132672
    //   424: sipush #-10850
    //   427: sipush #-16876
    //   430: invokestatic a : (II)Ljava/lang/String;
    //   433: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   436: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   439: pop
    //   440: iload #5
    //   442: ifeq -> 489
    //   445: aload #10
    //   447: aload #6
    //   449: ldc 132672
    //   451: sipush #-10860
    //   454: sipush #-30884
    //   457: invokestatic a : (II)Ljava/lang/String;
    //   460: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   463: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   466: pop
    //   467: aload #10
    //   469: aload #6
    //   471: ldc 132736
    //   473: sipush #-10862
    //   476: sipush #27313
    //   479: invokestatic a : (II)Ljava/lang/String;
    //   482: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   485: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   488: pop
    //   489: aload #7
    //   491: invokeinterface ZX7 : ()Lburp/Zstu;
    //   496: ifnull -> 512
    //   499: aload #10
    //   501: aload #6
    //   503: ldc 134912
    //   505: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   508: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   511: pop
    //   512: new burp/Zztv
    //   515: dup
    //   516: sipush #-10861
    //   519: sipush #-15747
    //   522: invokestatic a : (II)Ljava/lang/String;
    //   525: invokespecial <init> : (Ljava/lang/String;)V
    //   528: astore #12
    //   530: aload #12
    //   532: aload #6
    //   534: ldc 135168
    //   536: sipush #-10851
    //   539: sipush #20785
    //   542: invokestatic a : (II)Ljava/lang/String;
    //   545: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   548: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   551: pop
    //   552: aload #12
    //   554: aload #6
    //   556: ldc 135424
    //   558: sipush #-10856
    //   561: sipush #27817
    //   564: invokestatic a : (II)Ljava/lang/String;
    //   567: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   570: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   573: pop
    //   574: aload #10
    //   576: aload #12
    //   578: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   581: pop
    //   582: iload #5
    //   584: ifeq -> 631
    //   587: aload #10
    //   589: aload #6
    //   591: ldc 132672
    //   593: sipush #-10857
    //   596: sipush #-2402
    //   599: invokestatic a : (II)Ljava/lang/String;
    //   602: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   605: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   608: pop
    //   609: aload #10
    //   611: aload #6
    //   613: ldc 132736
    //   615: sipush #-10863
    //   618: sipush #2993
    //   621: invokestatic a : (II)Ljava/lang/String;
    //   624: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   627: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   630: pop
    //   631: aload_0
    //   632: getfield ZT : Lburp/Zerg;
    //   635: invokevirtual ZM : ()Lburp/Zgvn;
    //   638: invokeinterface ZY : ()Ljava/util/List;
    //   643: astore #12
    //   645: aload #12
    //   647: ifnull -> 712
    //   650: aload_0
    //   651: getfield ZL : Lburp/Zgso;
    //   654: getstatic burp/Zrpb.CONTEXT_PROXY_HISTORY : Lburp/Zrpb;
    //   657: aload_2
    //   658: aconst_null
    //   659: aload_1
    //   660: invokestatic ZZ : (Ljava/util/List;)[Lburp/Zeo2;
    //   663: invokevirtual ZU : (Lburp/Zrpb;Ljava/awt/event/InputEvent;[I[Lburp/Zmgv;)Ljava/util/List;
    //   666: astore #13
    //   668: aload #13
    //   670: invokeinterface iterator : ()Ljava/util/Iterator;
    //   675: astore #14
    //   677: aload #14
    //   679: invokeinterface hasNext : ()Z
    //   684: ifeq -> 712
    //   687: aload #14
    //   689: invokeinterface next : ()Ljava/lang/Object;
    //   694: checkcast java/awt/Component
    //   697: astore #15
    //   699: aload #10
    //   701: aload #15
    //   703: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   706: pop
    //   707: iload #5
    //   709: ifeq -> 677
    //   712: iload #9
    //   714: ifne -> 812
    //   717: aload #10
    //   719: new javax/swing/JSeparator
    //   722: dup
    //   723: invokespecial <init> : ()V
    //   726: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   729: pop
    //   730: new burp/Zztv
    //   733: dup
    //   734: sipush #-10849
    //   737: sipush #26094
    //   740: invokestatic a : (II)Ljava/lang/String;
    //   743: invokespecial <init> : (Ljava/lang/String;)V
    //   746: astore #13
    //   748: aload #10
    //   750: aload #13
    //   752: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   755: pop
    //   756: aload #13
    //   758: aload #6
    //   760: ldc 133376
    //   762: iconst_1
    //   763: invokestatic ZY : (Lburp/Zzyl;IZ)Lburp/Zepk;
    //   766: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   769: pop
    //   770: aload #13
    //   772: aload #6
    //   774: ldc 133632
    //   776: iconst_1
    //   777: invokestatic ZY : (Lburp/Zzyl;IZ)Lburp/Zepk;
    //   780: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   783: pop
    //   784: aload #13
    //   786: aload #6
    //   788: ldc 133888
    //   790: iconst_1
    //   791: invokestatic ZY : (Lburp/Zzyl;IZ)Lburp/Zepk;
    //   794: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   797: pop
    //   798: aload #13
    //   800: aload #6
    //   802: ldc 134144
    //   804: iconst_1
    //   805: invokestatic ZY : (Lburp/Zzyl;IZ)Lburp/Zepk;
    //   808: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   811: pop
    //   812: aload #10
    //   814: new javax/swing/JSeparator
    //   817: dup
    //   818: invokespecial <init> : ()V
    //   821: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   824: pop
    //   825: aload #10
    //   827: aload #6
    //   829: ldc 524800
    //   831: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   834: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   837: pop
    //   838: aload #10
    //   840: new javax/swing/JSeparator
    //   843: dup
    //   844: invokespecial <init> : ()V
    //   847: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   850: pop
    //   851: aload #7
    //   853: invokeinterface Zod : ()Lburp/Zmzk;
    //   858: aload #10
    //   860: aload #6
    //   862: invokestatic ZL : (Lburp/Zmzk;Lburp/Zkj9;Lburp/Zzyl;)V
    //   865: iload #9
    //   867: ifeq -> 897
    //   870: aload #10
    //   872: aload #6
    //   874: ldc 134656
    //   876: sipush #-10858
    //   879: sipush #-1091
    //   882: invokestatic a : (II)Ljava/lang/String;
    //   885: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   888: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   891: pop
    //   892: iload #5
    //   894: ifeq -> 919
    //   897: aload #10
    //   899: aload #6
    //   901: ldc 134656
    //   903: sipush #-10859
    //   906: sipush #6830
    //   909: invokestatic a : (II)Ljava/lang/String;
    //   912: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   915: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   918: pop
    //   919: aload #10
    //   921: aload #6
    //   923: ldc 525056
    //   925: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   928: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   931: pop
    //   932: iload #9
    //   934: ifeq -> 977
    //   937: aload #10
    //   939: aload #6
    //   941: ldc 134400
    //   943: sipush #-10854
    //   946: sipush #-28526
    //   949: invokestatic a : (II)Ljava/lang/String;
    //   952: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   955: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   958: pop
    //   959: aload #10
    //   961: aload #6
    //   963: ldc 134432
    //   965: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   968: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   971: pop
    //   972: iload #5
    //   974: ifeq -> 1026
    //   977: aload #10
    //   979: aload #6
    //   981: ldc 134400
    //   983: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   986: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   989: pop
    //   990: aload #10
    //   992: aload #6
    //   994: ldc 134416
    //   996: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   999: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1002: pop
    //   1003: aload #7
    //   1005: invokeinterface ZX7 : ()Lburp/Zstu;
    //   1010: ifnull -> 1026
    //   1013: aload #10
    //   1015: aload #6
    //   1017: ldc 134432
    //   1019: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   1022: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1025: pop
    //   1026: iload #9
    //   1028: ifeq -> 1058
    //   1031: aload #10
    //   1033: aload #6
    //   1035: ldc 134784
    //   1037: sipush #-10853
    //   1040: sipush #18808
    //   1043: invokestatic a : (II)Ljava/lang/String;
    //   1046: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   1049: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1052: pop
    //   1053: iload #5
    //   1055: ifeq -> 1080
    //   1058: aload #10
    //   1060: aload #6
    //   1062: ldc 134784
    //   1064: sipush #-10852
    //   1067: sipush #9731
    //   1070: invokestatic a : (II)Ljava/lang/String;
    //   1073: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   1076: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1079: pop
    //   1080: aload #10
    //   1082: new javax/swing/JSeparator
    //   1085: dup
    //   1086: invokespecial <init> : ()V
    //   1089: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   1092: pop
    //   1093: aload #10
    //   1095: new burp/Zepa
    //   1098: dup
    //   1099: sipush #-10855
    //   1102: sipush #-11805
    //   1105: invokestatic a : (II)Ljava/lang/String;
    //   1108: getstatic burp/Zk97.DESKTOP_TOOLS_PROXY_HISTORY : Lburp/Zk97;
    //   1111: aload_3
    //   1112: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   1115: invokespecial <init> : (Ljava/lang/String;Lburp/Zk97;Ljava/awt/Window;)V
    //   1118: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   1121: pop
    //   1122: aload #10
    //   1124: aload_3
    //   1125: aload #4
    //   1127: getfield x : I
    //   1130: aload #4
    //   1132: getfield y : I
    //   1135: invokevirtual show : (Ljava/awt/Component;II)V
    //   1138: return
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return this.Zy.Zd(paramInt, this.Zh, null);
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ñ=Ã?17jI!®õ¤ðnÞ.yø×(löØ¨G¤ þçÎÿñp\\t}H{Ï7ô~\\n°KdTÔíp\\tZ¯ê¦ê1AXüIwèÐZ2fEÌekÅSf²B\Î¼Ccí²6¿ZÄ§ñº\w|ÈëñWö³OO§DSb'¹Kch»ûG+oÛ7ÁôV<åÓÞû\\f±e±ZïWRÊ½Óùöâ-ü0á?¢©§äZÑÝðê »'Ìîýs£sòåk'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #23
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
    //   68: ldc '52«~ÚôúN³F\\nUÀÉÆ¤çVÔ^b5«k~$ô%µÌFå¨ÀvÆSç¨Ô_¥8$'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #27
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
    //   129: putstatic burp/Zmaz.a : [Ljava/lang/String;
    //   132: bipush #15
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmaz.b : [Ljava/lang/String;
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
    //   212: bipush #15
    //   214: goto -> 244
    //   217: bipush #103
    //   219: goto -> 244
    //   222: bipush #99
    //   224: goto -> 244
    //   227: bipush #67
    //   229: goto -> 244
    //   232: bipush #60
    //   234: goto -> 244
    //   237: bipush #101
    //   239: goto -> 244
    //   242: bipush #47
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
    int i = (paramInt1 ^ 0xFFFFD59F) & 0xFFFF;
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
      byte b1 = 101;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmaz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */