package burp;

class Zzdo implements Runnable {
  private Zez3 Ze;
  
  private byte[] Zo;
  
  private Zz1p Zj;
  
  private Zt8g ZU;
  
  private int ZK;
  
  final Zl4n ZV;
  
  Zzdo(Zl4n paramZl4n) {}
  
  public void run() {
    // Byte code:
    //   0: invokestatic ZT : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZV : Lburp/Zl4n;
    //   8: getfield Zl : Z
    //   11: ifeq -> 15
    //   14: return
    //   15: aload_0
    //   16: getfield ZV : Lburp/Zl4n;
    //   19: getfield Zb : Lburp/Zzdy;
    //   22: invokevirtual isSelected : ()Z
    //   25: ifne -> 116
    //   28: aload_0
    //   29: getfield ZV : Lburp/Zl4n;
    //   32: dup
    //   33: astore_2
    //   34: monitorenter
    //   35: aload_0
    //   36: getfield ZV : Lburp/Zl4n;
    //   39: getfield Zd : Lburp/Zm99;
    //   42: ldc ''
    //   44: invokevirtual setText : (Ljava/lang/String;)V
    //   47: aload_0
    //   48: getfield ZV : Lburp/Zl4n;
    //   51: getfield ZO : Lburp/Zm99;
    //   54: ldc ''
    //   56: invokevirtual setText : (Ljava/lang/String;)V
    //   59: aload_0
    //   60: getfield ZV : Lburp/Zl4n;
    //   63: getfield Zy : Lburp/Zm99;
    //   66: ldc ''
    //   68: invokevirtual setText : (Ljava/lang/String;)V
    //   71: aload_0
    //   72: getfield ZV : Lburp/Zl4n;
    //   75: getfield ZQ : Lburp/Zm99;
    //   78: ldc ''
    //   80: invokevirtual setText : (Ljava/lang/String;)V
    //   83: aload_0
    //   84: getfield ZV : Lburp/Zl4n;
    //   87: getfield Zx : Lburp/Zm99;
    //   90: ldc ''
    //   92: invokevirtual setText : (Ljava/lang/String;)V
    //   95: aload_0
    //   96: getfield ZV : Lburp/Zl4n;
    //   99: invokevirtual wait : ()V
    //   102: aload_2
    //   103: monitorexit
    //   104: goto -> 112
    //   107: astore_3
    //   108: aload_2
    //   109: monitorexit
    //   110: aload_3
    //   111: athrow
    //   112: aload_1
    //   113: ifnonnull -> 4
    //   116: aload_0
    //   117: getfield Ze : Lburp/Zez3;
    //   120: ifnull -> 140
    //   123: invokestatic random : ()D
    //   126: ldc2_w 0.9
    //   129: dcmpl
    //   130: ifle -> 475
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: aload_0
    //   141: aload_0
    //   142: getfield ZV : Lburp/Zl4n;
    //   145: getfield ZJ : [Lburp/Zez3;
    //   148: invokestatic random : ()D
    //   151: aload_0
    //   152: getfield ZV : Lburp/Zl4n;
    //   155: getfield ZJ : [Lburp/Zez3;
    //   158: arraylength
    //   159: i2d
    //   160: dmul
    //   161: d2i
    //   162: aaload
    //   163: putfield Ze : Lburp/Zez3;
    //   166: aload_0
    //   167: getfield Ze : Lburp/Zez3;
    //   170: invokeinterface Zos : ()Lburp/Zstu;
    //   175: astore_2
    //   176: aload_2
    //   177: ifnull -> 201
    //   180: aload_0
    //   181: aload_2
    //   182: invokeinterface ZiD : ()[B
    //   187: putfield Zo : [B
    //   190: aload_1
    //   191: ifnonnull -> 249
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   200: athrow
    //   201: aload_0
    //   202: aload_0
    //   203: getfield ZV : Lburp/Zl4n;
    //   206: getfield ZV : Lburp/Zkl6;
    //   209: invokeinterface Zs : ()Lburp/Zm6e;
    //   214: invokeinterface ZO : ()Lburp/Ztom;
    //   219: aload_0
    //   220: getfield Ze : Lburp/Zez3;
    //   223: invokeinterface ZlL : ()Lburp/Zlit;
    //   228: invokevirtual Zf : (Lburp/Zlit;)Lburp/Ztom;
    //   231: invokevirtual Zr : ()Lburp/Zstu;
    //   234: invokeinterface ZiD : ()[B
    //   239: putfield Zo : [B
    //   242: goto -> 249
    //   245: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   248: athrow
    //   249: aload_0
    //   250: aload_0
    //   251: getfield Ze : Lburp/Zez3;
    //   254: invokeinterface Zod : ()Lburp/Zmzk;
    //   259: aload_0
    //   260: getfield Zo : [B
    //   263: iconst_3
    //   264: aload_0
    //   265: getfield ZV : Lburp/Zl4n;
    //   268: getfield ZF : Lburp/Zbnt;
    //   271: invokestatic Zu : (Lburp/Zmzk;[BBLburp/Zbnt;)Lburp/Zz1p;
    //   274: putfield Zj : Lburp/Zz1p;
    //   277: new java/util/ArrayList
    //   280: dup
    //   281: aload_0
    //   282: getfield Zo : [B
    //   285: invokestatic ZS : ([B)Ljava/util/List;
    //   288: invokespecial <init> : (Ljava/util/Collection;)V
    //   291: astore_3
    //   292: aload_3
    //   293: aload_0
    //   294: getfield Zo : [B
    //   297: aload_0
    //   298: getfield Zj : Lburp/Zz1p;
    //   301: invokestatic Zn : ([BLburp/Zz1p;)Ljava/util/List;
    //   304: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   309: pop
    //   310: aload_0
    //   311: aload_0
    //   312: getfield Zj : Lburp/Zz1p;
    //   315: invokestatic ZA : (Lburp/Zz1p;)Lburp/Ztvi;
    //   318: aload_3
    //   319: invokevirtual ZB : (Ljava/util/List;)Lburp/Ztvi;
    //   322: invokevirtual Zi : ()Lburp/Zz1p;
    //   325: putfield Zj : Lburp/Zz1p;
    //   328: aload_3
    //   329: invokeinterface isEmpty : ()Z
    //   334: ifeq -> 377
    //   337: invokestatic random : ()D
    //   340: ldc2_w 0.1
    //   343: dcmpl
    //   344: ifle -> 363
    //   347: goto -> 354
    //   350: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   353: athrow
    //   354: aload_0
    //   355: aconst_null
    //   356: putfield Ze : Lburp/Zez3;
    //   359: aload_1
    //   360: ifnonnull -> 4
    //   363: aload_3
    //   364: aload_0
    //   365: getfield Zo : [B
    //   368: invokestatic ZI : ([B)Ljava/util/List;
    //   371: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   376: pop
    //   377: aload_3
    //   378: invokeinterface isEmpty : ()Z
    //   383: ifeq -> 431
    //   386: aload_0
    //   387: getfield Zo : [B
    //   390: invokestatic ZV : ([B)Ljava/util/List;
    //   393: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   398: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   403: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   408: aload_3
    //   409: dup
    //   410: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   413: pop
    //   414: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   419: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   424: goto -> 431
    //   427: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   430: athrow
    //   431: aload_0
    //   432: aload_0
    //   433: getfield Zj : Lburp/Zz1p;
    //   436: invokestatic ZA : (Lburp/Zz1p;)Lburp/Ztvi;
    //   439: aload_3
    //   440: invokevirtual ZB : (Ljava/util/List;)Lburp/Ztvi;
    //   443: invokevirtual Zi : ()Lburp/Zz1p;
    //   446: putfield Zj : Lburp/Zz1p;
    //   449: aload_3
    //   450: invokeinterface isEmpty : ()Z
    //   455: ifeq -> 470
    //   458: new java/lang/Exception
    //   461: dup
    //   462: invokespecial <init> : ()V
    //   465: athrow
    //   466: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   469: athrow
    //   470: aload_0
    //   471: aconst_null
    //   472: putfield ZU : Lburp/Zt8g;
    //   475: aload_0
    //   476: getfield ZU : Lburp/Zt8g;
    //   479: ifnull -> 499
    //   482: invokestatic random : ()D
    //   485: ldc2_w 0.6
    //   488: dcmpl
    //   489: ifle -> 557
    //   492: goto -> 499
    //   495: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   498: athrow
    //   499: aload_0
    //   500: aload_0
    //   501: getfield Zj : Lburp/Zz1p;
    //   504: getfield ZV : Ljava/util/List;
    //   507: invokestatic random : ()D
    //   510: aload_0
    //   511: getfield Zj : Lburp/Zz1p;
    //   514: getfield ZV : Ljava/util/List;
    //   517: invokeinterface size : ()I
    //   522: i2d
    //   523: dmul
    //   524: d2i
    //   525: invokeinterface get : (I)Ljava/lang/Object;
    //   530: checkcast burp/Zt8g
    //   533: putfield ZU : Lburp/Zt8g;
    //   536: aload_0
    //   537: invokestatic random : ()D
    //   540: getstatic burp/Zl4n.ZX : [Ljava/lang/String;
    //   543: arraylength
    //   544: i2d
    //   545: dmul
    //   546: d2i
    //   547: putfield ZK : I
    //   550: goto -> 557
    //   553: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   556: athrow
    //   557: invokestatic random : ()D
    //   560: ldc2_w 0.5
    //   563: dcmpl
    //   564: ifle -> 588
    //   567: aload_0
    //   568: dup
    //   569: getfield ZK : I
    //   572: iconst_1
    //   573: iadd
    //   574: putfield ZK : I
    //   577: aload_1
    //   578: ifnonnull -> 605
    //   581: goto -> 588
    //   584: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   587: athrow
    //   588: aload_0
    //   589: dup
    //   590: getfield ZK : I
    //   593: iconst_1
    //   594: isub
    //   595: putfield ZK : I
    //   598: goto -> 605
    //   601: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   604: athrow
    //   605: aload_0
    //   606: getfield ZK : I
    //   609: ifge -> 633
    //   612: aload_0
    //   613: getstatic burp/Zl4n.ZX : [Ljava/lang/String;
    //   616: arraylength
    //   617: iconst_1
    //   618: isub
    //   619: putfield ZK : I
    //   622: aload_1
    //   623: ifnonnull -> 663
    //   626: goto -> 633
    //   629: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   632: athrow
    //   633: aload_0
    //   634: getfield ZK : I
    //   637: getstatic burp/Zl4n.ZX : [Ljava/lang/String;
    //   640: arraylength
    //   641: if_icmplt -> 663
    //   644: goto -> 651
    //   647: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   650: athrow
    //   651: aload_0
    //   652: iconst_0
    //   653: putfield ZK : I
    //   656: goto -> 663
    //   659: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   662: athrow
    //   663: getstatic burp/Zl4n.ZX : [Ljava/lang/String;
    //   666: aload_0
    //   667: getfield ZK : I
    //   670: aaload
    //   671: ldc '*'
    //   673: aload_0
    //   674: getfield ZV : Lburp/Zl4n;
    //   677: getfield Zk : Lnet/portswigger/Zsy;
    //   680: invokevirtual Zi : ()Lnet/portswigger/Zk5;
    //   683: invokevirtual ZG : ()Lnet/portswigger/Zk5;
    //   686: iconst_1
    //   687: invokestatic random : ()D
    //   690: ldc2_w 8.0
    //   693: dmul
    //   694: d2i
    //   695: iadd
    //   696: invokevirtual ZK : (I)Ljava/lang/String;
    //   699: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   702: astore_2
    //   703: invokestatic random : ()D
    //   706: ldc2_w 0.5
    //   709: dcmpg
    //   710: ifge -> 721
    //   713: iconst_1
    //   714: goto -> 722
    //   717: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   720: athrow
    //   721: iconst_0
    //   722: istore_3
    //   723: iload_3
    //   724: ifeq -> 855
    //   727: aload_0
    //   728: getfield ZU : Lburp/Zt8g;
    //   731: invokeinterface Zbl : ()I
    //   736: aload_2
    //   737: invokevirtual length : ()I
    //   740: iadd
    //   741: aload_0
    //   742: getfield Zo : [B
    //   745: arraylength
    //   746: iadd
    //   747: aload_0
    //   748: getfield ZU : Lburp/Zt8g;
    //   751: invokeinterface Zb2 : ()I
    //   756: isub
    //   757: newarray byte
    //   759: astore #4
    //   761: aload_0
    //   762: getfield Zo : [B
    //   765: iconst_0
    //   766: aload #4
    //   768: iconst_0
    //   769: aload_0
    //   770: getfield ZU : Lburp/Zt8g;
    //   773: invokeinterface Zbl : ()I
    //   778: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   781: aload_2
    //   782: invokestatic Zy : (Ljava/lang/String;)[B
    //   785: iconst_0
    //   786: aload #4
    //   788: aload_0
    //   789: getfield ZU : Lburp/Zt8g;
    //   792: invokeinterface Zbl : ()I
    //   797: aload_2
    //   798: invokevirtual length : ()I
    //   801: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   804: aload_0
    //   805: getfield Zo : [B
    //   808: aload_0
    //   809: getfield ZU : Lburp/Zt8g;
    //   812: invokeinterface Zb2 : ()I
    //   817: aload #4
    //   819: aload_0
    //   820: getfield ZU : Lburp/Zt8g;
    //   823: invokeinterface Zbl : ()I
    //   828: aload_2
    //   829: invokevirtual length : ()I
    //   832: iadd
    //   833: aload_0
    //   834: getfield Zo : [B
    //   837: arraylength
    //   838: aload_0
    //   839: getfield ZU : Lburp/Zt8g;
    //   842: invokeinterface Zb2 : ()I
    //   847: isub
    //   848: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   851: aload_1
    //   852: ifnonnull -> 959
    //   855: aload_0
    //   856: getfield Zo : [B
    //   859: arraylength
    //   860: aload_2
    //   861: invokevirtual length : ()I
    //   864: iadd
    //   865: newarray byte
    //   867: astore #4
    //   869: aload_0
    //   870: getfield Zo : [B
    //   873: iconst_0
    //   874: aload #4
    //   876: iconst_0
    //   877: aload_0
    //   878: getfield ZU : Lburp/Zt8g;
    //   881: invokeinterface Zb2 : ()I
    //   886: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   889: aload_2
    //   890: invokestatic Zy : (Ljava/lang/String;)[B
    //   893: iconst_0
    //   894: aload #4
    //   896: aload_0
    //   897: getfield ZU : Lburp/Zt8g;
    //   900: invokeinterface Zb2 : ()I
    //   905: aload_2
    //   906: invokevirtual length : ()I
    //   909: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   912: aload_0
    //   913: getfield Zo : [B
    //   916: aload_0
    //   917: getfield ZU : Lburp/Zt8g;
    //   920: invokeinterface Zb2 : ()I
    //   925: aload #4
    //   927: aload_0
    //   928: getfield ZU : Lburp/Zt8g;
    //   931: invokeinterface Zb2 : ()I
    //   936: aload_2
    //   937: invokevirtual length : ()I
    //   940: iadd
    //   941: aload_0
    //   942: getfield Zo : [B
    //   945: arraylength
    //   946: aload_0
    //   947: getfield ZU : Lburp/Zt8g;
    //   950: invokeinterface Zb2 : ()I
    //   955: isub
    //   956: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   959: aload_0
    //   960: getfield ZV : Lburp/Zl4n;
    //   963: getfield Zd : Lburp/Zm99;
    //   966: aload_0
    //   967: getfield ZV : Lburp/Zl4n;
    //   970: aload_0
    //   971: getfield Ze : Lburp/Zez3;
    //   974: invokeinterface ZlL : ()Lburp/Zlit;
    //   979: invokeinterface Zd1 : ()Ljava/lang/String;
    //   984: invokevirtual Zd : (Ljava/lang/String;)Ljava/lang/String;
    //   987: invokevirtual setText : (Ljava/lang/String;)V
    //   990: aload_0
    //   991: getfield ZV : Lburp/Zl4n;
    //   994: getfield ZO : Lburp/Zm99;
    //   997: aload_0
    //   998: getfield ZV : Lburp/Zl4n;
    //   1001: aload_0
    //   1002: getfield Ze : Lburp/Zez3;
    //   1005: invokeinterface ZlL : ()Lburp/Zlit;
    //   1010: invokeinterface Zd4 : ()[B
    //   1015: invokestatic ZG : ([B)Ljava/lang/String;
    //   1018: invokevirtual Zd : (Ljava/lang/String;)Ljava/lang/String;
    //   1021: invokevirtual setText : (Ljava/lang/String;)V
    //   1024: aload_0
    //   1025: getfield ZV : Lburp/Zl4n;
    //   1028: getfield Zy : Lburp/Zm99;
    //   1031: aload_0
    //   1032: getfield ZV : Lburp/Zl4n;
    //   1035: aload_0
    //   1036: getfield ZU : Lburp/Zt8g;
    //   1039: invokeinterface Zbc : ()Ljava/lang/String;
    //   1044: aload_0
    //   1045: getfield ZU : Lburp/Zt8g;
    //   1048: invokeinterface Zns : ()Ljava/lang/String;
    //   1053: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1058: invokevirtual Zd : (Ljava/lang/String;)Ljava/lang/String;
    //   1061: invokevirtual setText : (Ljava/lang/String;)V
    //   1064: aload_0
    //   1065: getfield ZV : Lburp/Zl4n;
    //   1068: getfield ZQ : Lburp/Zm99;
    //   1071: aload_0
    //   1072: getfield ZV : Lburp/Zl4n;
    //   1075: aload_0
    //   1076: getfield ZU : Lburp/Zt8g;
    //   1079: invokeinterface Zbn : ()Ljava/lang/String;
    //   1084: invokevirtual Zd : (Ljava/lang/String;)Ljava/lang/String;
    //   1087: invokevirtual setText : (Ljava/lang/String;)V
    //   1090: aload_0
    //   1091: getfield ZV : Lburp/Zl4n;
    //   1094: getfield Zx : Lburp/Zm99;
    //   1097: aload_0
    //   1098: getfield ZV : Lburp/Zl4n;
    //   1101: iload_3
    //   1102: ifeq -> 1113
    //   1105: aload_2
    //   1106: goto -> 1128
    //   1109: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1112: athrow
    //   1113: aload_0
    //   1114: getfield ZU : Lburp/Zt8g;
    //   1117: invokeinterface Zbn : ()Ljava/lang/String;
    //   1122: aload_2
    //   1123: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1128: invokevirtual Zd : (Ljava/lang/String;)Ljava/lang/String;
    //   1131: invokevirtual setText : (Ljava/lang/String;)V
    //   1134: aload_0
    //   1135: getfield ZV : Lburp/Zl4n;
    //   1138: getfield ZT : Lburp/Zlll;
    //   1141: aload_0
    //   1142: getfield ZV : Lburp/Zl4n;
    //   1145: getfield Zr : Lburp/Zey9;
    //   1148: aload_0
    //   1149: getfield Ze : Lburp/Zez3;
    //   1152: invokeinterface Zod : ()Lburp/Zmzk;
    //   1157: aload #4
    //   1159: invokevirtual ZY : (Lburp/Zmzk;[B)Lburp/Zefx;
    //   1162: invokevirtual Zv : (Lburp/Zefx;)Lburp/Zg3d;
    //   1165: astore #5
    //   1167: aload_0
    //   1168: getfield ZV : Lburp/Zl4n;
    //   1171: dup
    //   1172: getfield ZZ : I
    //   1175: iconst_1
    //   1176: iadd
    //   1177: putfield ZZ : I
    //   1180: aload #5
    //   1182: invokeinterface Ze : ()Lburp/Zb6q;
    //   1187: ifnonnull -> 1198
    //   1190: aconst_null
    //   1191: goto -> 1215
    //   1194: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1197: athrow
    //   1198: aload #5
    //   1200: invokeinterface Ze : ()Lburp/Zb6q;
    //   1205: invokeinterface Za : ()Lburp/Zstu;
    //   1210: invokeinterface ZiD : ()[B
    //   1215: astore #6
    //   1217: aload #6
    //   1219: ifnull -> 1235
    //   1222: aload #6
    //   1224: arraylength
    //   1225: ifne -> 1259
    //   1228: goto -> 1235
    //   1231: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1234: athrow
    //   1235: aload_0
    //   1236: getfield ZV : Lburp/Zl4n;
    //   1239: dup
    //   1240: getfield ZL : I
    //   1243: iconst_1
    //   1244: iadd
    //   1245: putfield ZL : I
    //   1248: aload_1
    //   1249: ifnonnull -> 1282
    //   1252: goto -> 1259
    //   1255: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1258: athrow
    //   1259: aload_0
    //   1260: getfield ZV : Lburp/Zl4n;
    //   1263: dup
    //   1264: getfield Zq : J
    //   1267: aload #6
    //   1269: arraylength
    //   1270: i2l
    //   1271: ladd
    //   1272: putfield Zq : J
    //   1275: goto -> 1282
    //   1278: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1281: athrow
    //   1282: aload_0
    //   1283: getfield ZV : Lburp/Zl4n;
    //   1286: getfield Zi : Lburp/Zm99;
    //   1289: getstatic burp/Zlb0.Zl : Ljava/text/NumberFormat;
    //   1292: aload_0
    //   1293: getfield ZV : Lburp/Zl4n;
    //   1296: getfield ZZ : I
    //   1299: i2l
    //   1300: invokevirtual format : (J)Ljava/lang/String;
    //   1303: invokevirtual setText : (Ljava/lang/String;)V
    //   1306: aload_0
    //   1307: getfield ZV : Lburp/Zl4n;
    //   1310: getfield ZH : Lburp/Zm99;
    //   1313: getstatic burp/Zlb0.Zl : Ljava/text/NumberFormat;
    //   1316: aload_0
    //   1317: getfield ZV : Lburp/Zl4n;
    //   1320: getfield Zq : J
    //   1323: invokevirtual format : (J)Ljava/lang/String;
    //   1326: invokevirtual setText : (Ljava/lang/String;)V
    //   1329: aload_0
    //   1330: getfield ZV : Lburp/Zl4n;
    //   1333: getfield ZA : Lburp/Zm99;
    //   1336: getstatic burp/Zlb0.Zl : Ljava/text/NumberFormat;
    //   1339: aload_0
    //   1340: getfield ZV : Lburp/Zl4n;
    //   1343: getfield ZL : I
    //   1346: i2l
    //   1347: invokevirtual format : (J)Ljava/lang/String;
    //   1350: invokevirtual setText : (Ljava/lang/String;)V
    //   1353: aload_0
    //   1354: getfield ZV : Lburp/Zl4n;
    //   1357: invokevirtual Zu : ()V
    //   1360: goto -> 4
    //   1363: astore_2
    //   1364: aload_2
    //   1365: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   1368: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1371: aload_0
    //   1372: getfield ZV : Lburp/Zl4n;
    //   1375: invokevirtual Zu : ()V
    //   1378: goto -> 4
    // Exception table:
    //   from	to	target	type
    //   4	14	1363	java/lang/Exception
    //   15	112	1363	java/lang/Exception
    //   35	104	107	finally
    //   107	110	107	finally
    //   116	133	136	java/lang/Exception
    //   116	359	1363	java/lang/Exception
    //   176	194	197	java/lang/Exception
    //   180	242	245	java/lang/Exception
    //   292	347	350	java/lang/Exception
    //   363	1360	1363	java/lang/Exception
    //   377	424	427	java/lang/Exception
    //   431	466	466	java/lang/Exception
    //   475	492	495	java/lang/Exception
    //   482	550	553	java/lang/Exception
    //   557	581	584	java/lang/Exception
    //   567	598	601	java/lang/Exception
    //   605	626	629	java/lang/Exception
    //   612	644	647	java/lang/Exception
    //   633	656	659	java/lang/Exception
    //   703	717	717	java/lang/Exception
    //   959	1109	1109	java/lang/Exception
    //   1167	1194	1194	java/lang/Exception
    //   1217	1228	1231	java/lang/Exception
    //   1222	1252	1255	java/lang/Exception
    //   1235	1275	1278	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzdo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */