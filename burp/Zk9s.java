package burp;

import java.math.BigInteger;

class Zk9s extends ClassLoader {
  static String ZM;
  
  static Object ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zn(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZW(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: ldc2_w 8682522807148012
    //   7: invokestatic currentTimeMillis : ()J
    //   10: lxor
    //   11: lstore #4
    //   13: lload #4
    //   15: ldc2_w 25214903917
    //   18: lmul
    //   19: ldc2_w 11
    //   22: ladd
    //   23: ldc2_w 281474976710655
    //   26: land
    //   27: lstore #4
    //   29: lload #4
    //   31: bipush #32
    //   33: lshl
    //   34: lstore #6
    //   36: lload #4
    //   38: ldc2_w 25214903917
    //   41: lmul
    //   42: ldc2_w 11
    //   45: ladd
    //   46: ldc2_w 281474976710655
    //   49: land
    //   50: lstore #4
    //   52: lload #6
    //   54: lload #4
    //   56: ladd
    //   57: lstore #6
    //   59: bipush #16
    //   61: newarray byte
    //   63: dup
    //   64: iconst_0
    //   65: bipush #48
    //   67: bastore
    //   68: dup
    //   69: iconst_1
    //   70: bipush #49
    //   72: bastore
    //   73: dup
    //   74: iconst_2
    //   75: bipush #50
    //   77: bastore
    //   78: dup
    //   79: iconst_3
    //   80: bipush #51
    //   82: bastore
    //   83: dup
    //   84: iconst_4
    //   85: bipush #52
    //   87: bastore
    //   88: dup
    //   89: iconst_5
    //   90: bipush #53
    //   92: bastore
    //   93: dup
    //   94: bipush #6
    //   96: bipush #54
    //   98: bastore
    //   99: dup
    //   100: bipush #7
    //   102: bipush #55
    //   104: bastore
    //   105: dup
    //   106: bipush #8
    //   108: bipush #56
    //   110: bastore
    //   111: dup
    //   112: bipush #9
    //   114: bipush #57
    //   116: bastore
    //   117: dup
    //   118: bipush #10
    //   120: bipush #97
    //   122: bastore
    //   123: dup
    //   124: bipush #11
    //   126: bipush #98
    //   128: bastore
    //   129: dup
    //   130: bipush #12
    //   132: bipush #99
    //   134: bastore
    //   135: dup
    //   136: bipush #13
    //   138: bipush #100
    //   140: bastore
    //   141: dup
    //   142: bipush #14
    //   144: bipush #101
    //   146: bastore
    //   147: dup
    //   148: bipush #15
    //   150: bipush #102
    //   152: bastore
    //   153: astore #8
    //   155: bipush #64
    //   157: newarray byte
    //   159: astore #9
    //   161: bipush #64
    //   163: istore #10
    //   165: bipush #16
    //   167: istore #11
    //   169: iload #11
    //   171: iconst_1
    //   172: isub
    //   173: i2l
    //   174: lstore #12
    //   176: aload #9
    //   178: iinc #10, -1
    //   181: iload #10
    //   183: aload #8
    //   185: lload #6
    //   187: lload #12
    //   189: land
    //   190: l2i
    //   191: baload
    //   192: bastore
    //   193: lload #6
    //   195: iconst_4
    //   196: lushr
    //   197: lstore #6
    //   199: lload #6
    //   201: lconst_0
    //   202: lcmp
    //   203: ifne -> 176
    //   206: bipush #64
    //   208: iload #10
    //   210: isub
    //   211: newarray byte
    //   213: astore_3
    //   214: iconst_0
    //   215: istore #14
    //   217: iload #14
    //   219: aload_3
    //   220: arraylength
    //   221: if_icmpge -> 243
    //   224: aload_3
    //   225: iload #14
    //   227: aload #9
    //   229: iload #10
    //   231: iload #14
    //   233: iadd
    //   234: baload
    //   235: bastore
    //   236: iinc #14, 1
    //   239: iload_2
    //   240: ifne -> 217
    //   243: aload_3
    //   244: arraylength
    //   245: bipush #10
    //   247: if_icmplt -> 13
    //   250: getstatic burp/Zr8h.ZH : Ljava/lang/Object;
    //   253: checkcast java/math/BigInteger
    //   256: invokevirtual toByteArray : ()[B
    //   259: astore_3
    //   260: iconst_0
    //   261: istore #5
    //   263: iconst_0
    //   264: istore #6
    //   266: iload #6
    //   268: aload_3
    //   269: arraylength
    //   270: if_icmpge -> 415
    //   273: aload_3
    //   274: iload #6
    //   276: baload
    //   277: istore #7
    //   279: iload #7
    //   281: bipush #48
    //   283: if_icmplt -> 300
    //   286: iload #7
    //   288: bipush #57
    //   290: if_icmple -> 398
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   299: athrow
    //   300: iload #7
    //   302: bipush #65
    //   304: if_icmplt -> 328
    //   307: goto -> 314
    //   310: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   313: athrow
    //   314: iload #7
    //   316: bipush #90
    //   318: if_icmple -> 398
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   327: athrow
    //   328: iload #7
    //   330: bipush #97
    //   332: if_icmplt -> 356
    //   335: goto -> 342
    //   338: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   341: athrow
    //   342: iload #7
    //   344: bipush #122
    //   346: if_icmple -> 398
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   355: athrow
    //   356: iload #7
    //   358: bipush #43
    //   360: if_icmpeq -> 398
    //   363: goto -> 370
    //   366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   369: athrow
    //   370: iload #7
    //   372: bipush #47
    //   374: if_icmpeq -> 398
    //   377: goto -> 384
    //   380: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   383: athrow
    //   384: iload #7
    //   386: bipush #61
    //   388: if_icmpne -> 408
    //   391: goto -> 398
    //   394: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   397: athrow
    //   398: iinc #5, 1
    //   401: goto -> 408
    //   404: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   407: athrow
    //   408: iinc #6, 1
    //   411: iload_2
    //   412: ifne -> 266
    //   415: iload #5
    //   417: newarray byte
    //   419: astore #6
    //   421: iconst_0
    //   422: istore #7
    //   424: iconst_0
    //   425: istore #8
    //   427: iload #8
    //   429: aload_3
    //   430: arraylength
    //   431: if_icmpge -> 583
    //   434: aload_3
    //   435: iload #8
    //   437: baload
    //   438: istore #9
    //   440: iload #9
    //   442: bipush #48
    //   444: if_icmplt -> 461
    //   447: iload #9
    //   449: bipush #57
    //   451: if_icmple -> 559
    //   454: goto -> 461
    //   457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   460: athrow
    //   461: iload #9
    //   463: bipush #65
    //   465: if_icmplt -> 489
    //   468: goto -> 475
    //   471: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   474: athrow
    //   475: iload #9
    //   477: bipush #90
    //   479: if_icmple -> 559
    //   482: goto -> 489
    //   485: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   488: athrow
    //   489: iload #9
    //   491: bipush #97
    //   493: if_icmplt -> 517
    //   496: goto -> 503
    //   499: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   502: athrow
    //   503: iload #9
    //   505: bipush #122
    //   507: if_icmple -> 559
    //   510: goto -> 517
    //   513: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   516: athrow
    //   517: iload #9
    //   519: bipush #43
    //   521: if_icmpeq -> 559
    //   524: goto -> 531
    //   527: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   530: athrow
    //   531: iload #9
    //   533: bipush #47
    //   535: if_icmpeq -> 559
    //   538: goto -> 545
    //   541: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   544: athrow
    //   545: iload #9
    //   547: bipush #61
    //   549: if_icmpne -> 576
    //   552: goto -> 559
    //   555: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   558: athrow
    //   559: aload #6
    //   561: iload #7
    //   563: iload #9
    //   565: bastore
    //   566: iinc #7, 1
    //   569: goto -> 576
    //   572: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   575: athrow
    //   576: iinc #8, 1
    //   579: iload_2
    //   580: ifne -> 427
    //   583: aload #6
    //   585: astore #4
    //   587: aload #4
    //   589: astore_3
    //   590: aload_3
    //   591: arraylength
    //   592: istore #5
    //   594: aload_3
    //   595: iload #5
    //   597: iconst_1
    //   598: isub
    //   599: baload
    //   600: bipush #61
    //   602: if_icmpne -> 612
    //   605: iinc #5, -1
    //   608: iload_2
    //   609: ifne -> 594
    //   612: iload #5
    //   614: aload_3
    //   615: arraylength
    //   616: iconst_4
    //   617: idiv
    //   618: isub
    //   619: newarray byte
    //   621: astore #6
    //   623: iconst_0
    //   624: istore #7
    //   626: iload #7
    //   628: aload_3
    //   629: arraylength
    //   630: if_icmpge -> 892
    //   633: aload_3
    //   634: iload #7
    //   636: baload
    //   637: bipush #61
    //   639: if_icmpne -> 658
    //   642: aload_3
    //   643: iload #7
    //   645: iconst_0
    //   646: bastore
    //   647: iload_2
    //   648: ifne -> 885
    //   651: goto -> 658
    //   654: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   657: athrow
    //   658: aload_3
    //   659: iload #7
    //   661: baload
    //   662: bipush #47
    //   664: if_icmpne -> 691
    //   667: goto -> 674
    //   670: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   673: athrow
    //   674: aload_3
    //   675: iload #7
    //   677: bipush #63
    //   679: bastore
    //   680: iload_2
    //   681: ifne -> 885
    //   684: goto -> 691
    //   687: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   690: athrow
    //   691: aload_3
    //   692: iload #7
    //   694: baload
    //   695: bipush #43
    //   697: if_icmpne -> 724
    //   700: goto -> 707
    //   703: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   706: athrow
    //   707: aload_3
    //   708: iload #7
    //   710: bipush #62
    //   712: bastore
    //   713: iload_2
    //   714: ifne -> 885
    //   717: goto -> 724
    //   720: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   723: athrow
    //   724: aload_3
    //   725: iload #7
    //   727: baload
    //   728: bipush #48
    //   730: if_icmplt -> 779
    //   733: goto -> 740
    //   736: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   739: athrow
    //   740: aload_3
    //   741: iload #7
    //   743: baload
    //   744: bipush #57
    //   746: if_icmpgt -> 779
    //   749: goto -> 756
    //   752: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   755: athrow
    //   756: aload_3
    //   757: iload #7
    //   759: aload_3
    //   760: iload #7
    //   762: baload
    //   763: bipush #-4
    //   765: isub
    //   766: i2b
    //   767: bastore
    //   768: iload_2
    //   769: ifne -> 885
    //   772: goto -> 779
    //   775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   778: athrow
    //   779: aload_3
    //   780: iload #7
    //   782: baload
    //   783: bipush #97
    //   785: if_icmplt -> 834
    //   788: goto -> 795
    //   791: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   794: athrow
    //   795: aload_3
    //   796: iload #7
    //   798: baload
    //   799: bipush #122
    //   801: if_icmpgt -> 834
    //   804: goto -> 811
    //   807: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   810: athrow
    //   811: aload_3
    //   812: iload #7
    //   814: aload_3
    //   815: iload #7
    //   817: baload
    //   818: bipush #71
    //   820: isub
    //   821: i2b
    //   822: bastore
    //   823: iload_2
    //   824: ifne -> 885
    //   827: goto -> 834
    //   830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   833: athrow
    //   834: aload_3
    //   835: iload #7
    //   837: baload
    //   838: bipush #65
    //   840: if_icmplt -> 885
    //   843: goto -> 850
    //   846: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   849: athrow
    //   850: aload_3
    //   851: iload #7
    //   853: baload
    //   854: bipush #90
    //   856: if_icmpgt -> 885
    //   859: goto -> 866
    //   862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   865: athrow
    //   866: aload_3
    //   867: iload #7
    //   869: aload_3
    //   870: iload #7
    //   872: baload
    //   873: bipush #65
    //   875: isub
    //   876: i2b
    //   877: bastore
    //   878: goto -> 885
    //   881: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   884: athrow
    //   885: iinc #7, 1
    //   888: iload_2
    //   889: ifne -> 626
    //   892: iconst_0
    //   893: istore #7
    //   895: iconst_0
    //   896: istore #8
    //   898: iload #8
    //   900: aload #6
    //   902: arraylength
    //   903: iconst_2
    //   904: isub
    //   905: if_icmpge -> 1008
    //   908: aload #6
    //   910: iload #8
    //   912: aload_3
    //   913: iload #7
    //   915: baload
    //   916: iconst_2
    //   917: ishl
    //   918: sipush #255
    //   921: iand
    //   922: aload_3
    //   923: iload #7
    //   925: iconst_1
    //   926: iadd
    //   927: baload
    //   928: iconst_4
    //   929: iushr
    //   930: iconst_3
    //   931: iand
    //   932: ior
    //   933: i2b
    //   934: bastore
    //   935: aload #6
    //   937: iload #8
    //   939: iconst_1
    //   940: iadd
    //   941: aload_3
    //   942: iload #7
    //   944: iconst_1
    //   945: iadd
    //   946: baload
    //   947: iconst_4
    //   948: ishl
    //   949: sipush #255
    //   952: iand
    //   953: aload_3
    //   954: iload #7
    //   956: iconst_2
    //   957: iadd
    //   958: baload
    //   959: iconst_2
    //   960: iushr
    //   961: bipush #15
    //   963: iand
    //   964: ior
    //   965: i2b
    //   966: bastore
    //   967: aload #6
    //   969: iload #8
    //   971: iconst_2
    //   972: iadd
    //   973: aload_3
    //   974: iload #7
    //   976: iconst_2
    //   977: iadd
    //   978: baload
    //   979: bipush #6
    //   981: ishl
    //   982: sipush #255
    //   985: iand
    //   986: aload_3
    //   987: iload #7
    //   989: iconst_3
    //   990: iadd
    //   991: baload
    //   992: bipush #63
    //   994: iand
    //   995: ior
    //   996: i2b
    //   997: bastore
    //   998: iinc #7, 4
    //   1001: iinc #8, 3
    //   1004: iload_2
    //   1005: ifne -> 898
    //   1008: iload #8
    //   1010: aload #6
    //   1012: arraylength
    //   1013: if_icmpge -> 1050
    //   1016: aload #6
    //   1018: iload #8
    //   1020: aload_3
    //   1021: iload #7
    //   1023: baload
    //   1024: iconst_2
    //   1025: ishl
    //   1026: sipush #255
    //   1029: iand
    //   1030: aload_3
    //   1031: iload #7
    //   1033: iconst_1
    //   1034: iadd
    //   1035: baload
    //   1036: iconst_4
    //   1037: iushr
    //   1038: iconst_3
    //   1039: iand
    //   1040: ior
    //   1041: i2b
    //   1042: bastore
    //   1043: goto -> 1050
    //   1046: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1049: athrow
    //   1050: iinc #8, 1
    //   1053: iload #8
    //   1055: aload #6
    //   1057: arraylength
    //   1058: if_icmpge -> 1098
    //   1061: aload #6
    //   1063: iload #8
    //   1065: aload_3
    //   1066: iload #7
    //   1068: iconst_1
    //   1069: iadd
    //   1070: baload
    //   1071: iconst_4
    //   1072: ishl
    //   1073: sipush #255
    //   1076: iand
    //   1077: aload_3
    //   1078: iload #7
    //   1080: iconst_2
    //   1081: iadd
    //   1082: baload
    //   1083: iconst_2
    //   1084: iushr
    //   1085: bipush #15
    //   1087: iand
    //   1088: ior
    //   1089: i2b
    //   1090: bastore
    //   1091: goto -> 1098
    //   1094: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1097: athrow
    //   1098: aload #6
    //   1100: astore #4
    //   1102: sipush #-17100
    //   1105: new java/math/BigInteger
    //   1108: dup
    //   1109: aload #4
    //   1111: invokespecial <init> : ([B)V
    //   1114: invokevirtual abs : ()Ljava/math/BigInteger;
    //   1117: putstatic burp/Zbp.ZD : Ljava/lang/Object;
    //   1120: sipush #11698
    //   1123: getstatic burp/Zlv6.ZN : Ljava/lang/Object;
    //   1126: checkcast java/math/BigInteger
    //   1129: getstatic burp/Zt4g.Zv : Ljava/lang/Object;
    //   1132: checkcast java/math/BigInteger
    //   1135: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   1138: putstatic burp/Zzai.Z_ : Ljava/lang/Object;
    //   1141: invokestatic a : (II)Ljava/lang/String;
    //   1144: iconst_1
    //   1145: ldc burp/Zro5
    //   1147: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1150: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1153: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1156: astore_3
    //   1157: aload_3
    //   1158: arraylength
    //   1159: istore #4
    //   1161: iconst_0
    //   1162: istore #5
    //   1164: iload #5
    //   1166: iload #4
    //   1168: if_icmpge -> 1305
    //   1171: aload_3
    //   1172: iload #5
    //   1174: aaload
    //   1175: astore #6
    //   1177: aload #6
    //   1179: invokevirtual getModifiers : ()I
    //   1182: invokestatic isStatic : (I)Z
    //   1185: ifne -> 1195
    //   1188: goto -> 1298
    //   1191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1194: athrow
    //   1195: aload #6
    //   1197: invokevirtual getType : ()Ljava/lang/Class;
    //   1200: astore #7
    //   1202: aload #7
    //   1204: ifnull -> 1285
    //   1207: aload #7
    //   1209: invokevirtual isPrimitive : ()Z
    //   1212: ifne -> 1285
    //   1215: goto -> 1222
    //   1218: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1221: athrow
    //   1222: aload #7
    //   1224: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1227: ifnull -> 1285
    //   1230: goto -> 1237
    //   1233: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1236: athrow
    //   1237: aload #7
    //   1239: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1242: invokevirtual getName : ()Ljava/lang/String;
    //   1245: ifnull -> 1285
    //   1248: goto -> 1255
    //   1251: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1254: athrow
    //   1255: aload #7
    //   1257: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1260: invokevirtual getName : ()Ljava/lang/String;
    //   1263: sipush #-17097
    //   1266: sipush #13498
    //   1269: invokestatic a : (II)Ljava/lang/String;
    //   1272: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1275: ifne -> 1285
    //   1278: goto -> 1285
    //   1281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1284: athrow
    //   1285: aload #6
    //   1287: iconst_1
    //   1288: invokevirtual setAccessible : (Z)V
    //   1291: aload #6
    //   1293: aconst_null
    //   1294: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1297: pop
    //   1298: iinc #5, 1
    //   1301: iload_2
    //   1302: ifne -> 1164
    //   1305: sipush #-17104
    //   1308: sipush #-25687
    //   1311: invokestatic a : (II)Ljava/lang/String;
    //   1314: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1317: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1320: astore_3
    //   1321: aload_3
    //   1322: arraylength
    //   1323: istore #4
    //   1325: iconst_0
    //   1326: istore #5
    //   1328: iload #5
    //   1330: iload #4
    //   1332: if_icmpge -> 1464
    //   1335: aload_3
    //   1336: iload #5
    //   1338: aaload
    //   1339: astore #6
    //   1341: aload #6
    //   1343: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1346: pop
    //   1347: aload #6
    //   1349: invokevirtual getModifiers : ()I
    //   1352: invokestatic isStatic : (I)Z
    //   1355: ifeq -> 1450
    //   1358: aload #6
    //   1360: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1363: arraylength
    //   1364: iconst_2
    //   1365: if_icmpne -> 1450
    //   1368: goto -> 1375
    //   1371: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1374: athrow
    //   1375: aload #6
    //   1377: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1380: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1383: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1386: ifeq -> 1450
    //   1389: goto -> 1396
    //   1392: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1395: athrow
    //   1396: aload #6
    //   1398: iconst_1
    //   1399: invokevirtual setAccessible : (Z)V
    //   1402: aload #6
    //   1404: aconst_null
    //   1405: iconst_2
    //   1406: anewarray java/lang/Object
    //   1409: dup
    //   1410: iconst_0
    //   1411: aload_0
    //   1412: aastore
    //   1413: dup
    //   1414: iconst_1
    //   1415: aload_1
    //   1416: ifnonnull -> 1434
    //   1419: goto -> 1426
    //   1422: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1425: athrow
    //   1426: aload_1
    //   1427: goto -> 1441
    //   1430: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1433: athrow
    //   1434: aload_1
    //   1435: checkcast [B
    //   1438: invokevirtual clone : ()Ljava/lang/Object;
    //   1441: aastore
    //   1442: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1445: pop
    //   1446: iload_2
    //   1447: ifne -> 1464
    //   1450: iinc #5, 1
    //   1453: iload_2
    //   1454: ifne -> 1328
    //   1457: goto -> 1464
    //   1460: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1463: athrow
    //   1464: iconst_0
    //   1465: istore_3
    //   1466: getstatic burp/Zeh9.ZF : Ljava/lang/String;
    //   1469: getstatic burp/Zg99.ZZ : Ljava/lang/Object;
    //   1472: checkcast java/math/BigInteger
    //   1475: invokevirtual intValue : ()I
    //   1478: bipush #32
    //   1480: irem
    //   1481: invokestatic abs : (I)I
    //   1484: invokevirtual charAt : (I)C
    //   1487: getstatic burp/Zb8v.Zo : Ljava/lang/String;
    //   1490: getstatic burp/Zxso.ZF : Ljava/lang/Object;
    //   1493: checkcast java/math/BigInteger
    //   1496: invokevirtual intValue : ()I
    //   1499: bipush #32
    //   1501: irem
    //   1502: invokestatic abs : (I)I
    //   1505: invokevirtual charAt : (I)C
    //   1508: if_icmple -> 1852
    //   1511: sipush #-17090
    //   1514: sipush #-2161
    //   1517: invokestatic a : (II)Ljava/lang/String;
    //   1520: iconst_1
    //   1521: ldc burp/Zlv6
    //   1523: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1526: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1529: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1532: astore #4
    //   1534: aload #4
    //   1536: arraylength
    //   1537: istore #5
    //   1539: iconst_0
    //   1540: istore #6
    //   1542: iload #6
    //   1544: iload #5
    //   1546: if_icmpge -> 1684
    //   1549: aload #4
    //   1551: iload #6
    //   1553: aaload
    //   1554: astore #7
    //   1556: aload #7
    //   1558: invokevirtual getModifiers : ()I
    //   1561: invokestatic isStatic : (I)Z
    //   1564: ifne -> 1574
    //   1567: goto -> 1677
    //   1570: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1573: athrow
    //   1574: aload #7
    //   1576: invokevirtual getType : ()Ljava/lang/Class;
    //   1579: astore #8
    //   1581: aload #8
    //   1583: ifnull -> 1664
    //   1586: aload #8
    //   1588: invokevirtual isPrimitive : ()Z
    //   1591: ifne -> 1664
    //   1594: goto -> 1601
    //   1597: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1600: athrow
    //   1601: aload #8
    //   1603: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1606: ifnull -> 1664
    //   1609: goto -> 1616
    //   1612: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1615: athrow
    //   1616: aload #8
    //   1618: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1621: invokevirtual getName : ()Ljava/lang/String;
    //   1624: ifnull -> 1664
    //   1627: goto -> 1634
    //   1630: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1633: athrow
    //   1634: aload #8
    //   1636: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1639: invokevirtual getName : ()Ljava/lang/String;
    //   1642: sipush #-17096
    //   1645: sipush #-23376
    //   1648: invokestatic a : (II)Ljava/lang/String;
    //   1651: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1654: ifne -> 1664
    //   1657: goto -> 1664
    //   1660: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1663: athrow
    //   1664: aload #7
    //   1666: iconst_1
    //   1667: invokevirtual setAccessible : (Z)V
    //   1670: aload #7
    //   1672: aconst_null
    //   1673: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1676: pop
    //   1677: iinc #6, 1
    //   1680: iload_2
    //   1681: ifne -> 1542
    //   1684: sipush #-17091
    //   1687: sipush #-12853
    //   1690: invokestatic a : (II)Ljava/lang/String;
    //   1693: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1696: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1699: astore #4
    //   1701: aload #4
    //   1703: arraylength
    //   1704: istore #5
    //   1706: iconst_0
    //   1707: istore #6
    //   1709: iload #6
    //   1711: iload #5
    //   1713: if_icmpge -> 1849
    //   1716: aload #4
    //   1718: iload #6
    //   1720: aaload
    //   1721: astore #7
    //   1723: aload #7
    //   1725: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1728: pop
    //   1729: aload #7
    //   1731: invokevirtual getModifiers : ()I
    //   1734: invokestatic isStatic : (I)Z
    //   1737: ifeq -> 1835
    //   1740: aload #7
    //   1742: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1745: arraylength
    //   1746: iconst_2
    //   1747: if_icmpne -> 1835
    //   1750: goto -> 1757
    //   1753: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1756: athrow
    //   1757: aload #7
    //   1759: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1762: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1765: if_acmpne -> 1835
    //   1768: goto -> 1775
    //   1771: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1774: athrow
    //   1775: aload #7
    //   1777: iconst_1
    //   1778: invokevirtual setAccessible : (Z)V
    //   1781: aload #7
    //   1783: aconst_null
    //   1784: iconst_2
    //   1785: anewarray java/lang/Object
    //   1788: dup
    //   1789: iconst_0
    //   1790: aload_0
    //   1791: aastore
    //   1792: dup
    //   1793: iconst_1
    //   1794: aload_1
    //   1795: ifnonnull -> 1813
    //   1798: goto -> 1805
    //   1801: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1804: athrow
    //   1805: aload_1
    //   1806: goto -> 1820
    //   1809: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1812: athrow
    //   1813: aload_1
    //   1814: checkcast [B
    //   1817: invokevirtual clone : ()Ljava/lang/Object;
    //   1820: aastore
    //   1821: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1824: checkcast java/lang/Boolean
    //   1827: invokevirtual booleanValue : ()Z
    //   1830: istore_3
    //   1831: iload_2
    //   1832: ifne -> 1849
    //   1835: iinc #6, 1
    //   1838: iload_2
    //   1839: ifne -> 1709
    //   1842: goto -> 1849
    //   1845: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1848: athrow
    //   1849: goto -> 2190
    //   1852: sipush #-17099
    //   1855: sipush #13562
    //   1858: invokestatic a : (II)Ljava/lang/String;
    //   1861: iconst_1
    //   1862: ldc burp/Zg2
    //   1864: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1867: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1870: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1873: astore #4
    //   1875: aload #4
    //   1877: arraylength
    //   1878: istore #5
    //   1880: iconst_0
    //   1881: istore #6
    //   1883: iload #6
    //   1885: iload #5
    //   1887: if_icmpge -> 2025
    //   1890: aload #4
    //   1892: iload #6
    //   1894: aaload
    //   1895: astore #7
    //   1897: aload #7
    //   1899: invokevirtual getModifiers : ()I
    //   1902: invokestatic isStatic : (I)Z
    //   1905: ifne -> 1915
    //   1908: goto -> 2018
    //   1911: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1914: athrow
    //   1915: aload #7
    //   1917: invokevirtual getType : ()Ljava/lang/Class;
    //   1920: astore #8
    //   1922: aload #8
    //   1924: ifnull -> 2005
    //   1927: aload #8
    //   1929: invokevirtual isPrimitive : ()Z
    //   1932: ifne -> 2005
    //   1935: goto -> 1942
    //   1938: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1941: athrow
    //   1942: aload #8
    //   1944: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1947: ifnull -> 2005
    //   1950: goto -> 1957
    //   1953: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1956: athrow
    //   1957: aload #8
    //   1959: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1962: invokevirtual getName : ()Ljava/lang/String;
    //   1965: ifnull -> 2005
    //   1968: goto -> 1975
    //   1971: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1974: athrow
    //   1975: aload #8
    //   1977: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1980: invokevirtual getName : ()Ljava/lang/String;
    //   1983: sipush #-17096
    //   1986: sipush #-23376
    //   1989: invokestatic a : (II)Ljava/lang/String;
    //   1992: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1995: ifne -> 2005
    //   1998: goto -> 2005
    //   2001: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2004: athrow
    //   2005: aload #7
    //   2007: iconst_1
    //   2008: invokevirtual setAccessible : (Z)V
    //   2011: aload #7
    //   2013: aconst_null
    //   2014: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2017: pop
    //   2018: iinc #6, 1
    //   2021: iload_2
    //   2022: ifne -> 1883
    //   2025: sipush #-17098
    //   2028: sipush #6440
    //   2031: invokestatic a : (II)Ljava/lang/String;
    //   2034: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2037: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2040: astore #4
    //   2042: aload #4
    //   2044: arraylength
    //   2045: istore #5
    //   2047: iconst_0
    //   2048: istore #6
    //   2050: iload #6
    //   2052: iload #5
    //   2054: if_icmpge -> 2190
    //   2057: aload #4
    //   2059: iload #6
    //   2061: aaload
    //   2062: astore #7
    //   2064: aload #7
    //   2066: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2069: pop
    //   2070: aload #7
    //   2072: invokevirtual getModifiers : ()I
    //   2075: invokestatic isStatic : (I)Z
    //   2078: ifeq -> 2176
    //   2081: aload #7
    //   2083: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2086: arraylength
    //   2087: iconst_2
    //   2088: if_icmpne -> 2176
    //   2091: goto -> 2098
    //   2094: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2097: athrow
    //   2098: aload #7
    //   2100: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2103: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2106: if_acmpne -> 2176
    //   2109: goto -> 2116
    //   2112: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2115: athrow
    //   2116: aload #7
    //   2118: iconst_1
    //   2119: invokevirtual setAccessible : (Z)V
    //   2122: aload #7
    //   2124: aconst_null
    //   2125: iconst_2
    //   2126: anewarray java/lang/Object
    //   2129: dup
    //   2130: iconst_0
    //   2131: aload_0
    //   2132: aastore
    //   2133: dup
    //   2134: iconst_1
    //   2135: aload_1
    //   2136: ifnonnull -> 2154
    //   2139: goto -> 2146
    //   2142: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2145: athrow
    //   2146: aload_1
    //   2147: goto -> 2161
    //   2150: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2153: athrow
    //   2154: aload_1
    //   2155: checkcast [B
    //   2158: invokevirtual clone : ()Ljava/lang/Object;
    //   2161: aastore
    //   2162: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2165: checkcast java/lang/Boolean
    //   2168: invokevirtual booleanValue : ()Z
    //   2171: istore_3
    //   2172: iload_2
    //   2173: ifne -> 2190
    //   2176: iinc #6, 1
    //   2179: iload_2
    //   2180: ifne -> 2050
    //   2183: goto -> 2190
    //   2186: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2189: athrow
    //   2190: iload_3
    //   2191: ifeq -> 2196
    //   2194: iload_3
    //   2195: ireturn
    //   2196: getstatic burp/Zxso.ZH : Ljava/lang/String;
    //   2199: getstatic burp/Zrdy.Zt : Ljava/lang/Object;
    //   2202: checkcast java/math/BigInteger
    //   2205: invokevirtual intValue : ()I
    //   2208: bipush #32
    //   2210: irem
    //   2211: invokestatic abs : (I)I
    //   2214: invokevirtual charAt : (I)C
    //   2217: getstatic burp/Ze3j.ZI : Ljava/lang/String;
    //   2220: getstatic burp/Zzsq.Zh : Ljava/lang/Object;
    //   2223: checkcast java/math/BigInteger
    //   2226: invokevirtual intValue : ()I
    //   2229: bipush #32
    //   2231: irem
    //   2232: invokestatic abs : (I)I
    //   2235: invokevirtual charAt : (I)C
    //   2238: if_icmpgt -> 2583
    //   2241: sipush #-17110
    //   2244: sipush #-11729
    //   2247: invokestatic a : (II)Ljava/lang/String;
    //   2250: iconst_1
    //   2251: ldc burp/Zge1
    //   2253: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2256: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2259: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2262: astore #4
    //   2264: aload #4
    //   2266: arraylength
    //   2267: istore #5
    //   2269: iconst_0
    //   2270: istore #6
    //   2272: iload #6
    //   2274: iload #5
    //   2276: if_icmpge -> 2414
    //   2279: aload #4
    //   2281: iload #6
    //   2283: aaload
    //   2284: astore #7
    //   2286: aload #7
    //   2288: invokevirtual getModifiers : ()I
    //   2291: invokestatic isStatic : (I)Z
    //   2294: ifne -> 2304
    //   2297: goto -> 2407
    //   2300: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2303: athrow
    //   2304: aload #7
    //   2306: invokevirtual getType : ()Ljava/lang/Class;
    //   2309: astore #8
    //   2311: aload #8
    //   2313: ifnull -> 2394
    //   2316: aload #8
    //   2318: invokevirtual isPrimitive : ()Z
    //   2321: ifne -> 2394
    //   2324: goto -> 2331
    //   2327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2330: athrow
    //   2331: aload #8
    //   2333: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2336: ifnull -> 2394
    //   2339: goto -> 2346
    //   2342: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2345: athrow
    //   2346: aload #8
    //   2348: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2351: invokevirtual getName : ()Ljava/lang/String;
    //   2354: ifnull -> 2394
    //   2357: goto -> 2364
    //   2360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2363: athrow
    //   2364: aload #8
    //   2366: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2369: invokevirtual getName : ()Ljava/lang/String;
    //   2372: sipush #-17096
    //   2375: sipush #-23376
    //   2378: invokestatic a : (II)Ljava/lang/String;
    //   2381: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2384: ifne -> 2394
    //   2387: goto -> 2394
    //   2390: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2393: athrow
    //   2394: aload #7
    //   2396: iconst_1
    //   2397: invokevirtual setAccessible : (Z)V
    //   2400: aload #7
    //   2402: aconst_null
    //   2403: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2406: pop
    //   2407: iinc #6, 1
    //   2410: iload_2
    //   2411: ifne -> 2272
    //   2414: sipush #-17107
    //   2417: sipush #31312
    //   2420: invokestatic a : (II)Ljava/lang/String;
    //   2423: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2426: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2429: astore #4
    //   2431: aload #4
    //   2433: arraylength
    //   2434: istore #5
    //   2436: iconst_0
    //   2437: istore #6
    //   2439: iload #6
    //   2441: iload #5
    //   2443: if_icmpge -> 2579
    //   2446: aload #4
    //   2448: iload #6
    //   2450: aaload
    //   2451: astore #7
    //   2453: aload #7
    //   2455: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2458: pop
    //   2459: aload #7
    //   2461: invokevirtual getModifiers : ()I
    //   2464: invokestatic isStatic : (I)Z
    //   2467: ifeq -> 2565
    //   2470: aload #7
    //   2472: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2475: arraylength
    //   2476: iconst_2
    //   2477: if_icmpne -> 2565
    //   2480: goto -> 2487
    //   2483: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2486: athrow
    //   2487: aload #7
    //   2489: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2492: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2495: if_acmpne -> 2565
    //   2498: goto -> 2505
    //   2501: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2504: athrow
    //   2505: aload #7
    //   2507: iconst_1
    //   2508: invokevirtual setAccessible : (Z)V
    //   2511: aload #7
    //   2513: aconst_null
    //   2514: iconst_2
    //   2515: anewarray java/lang/Object
    //   2518: dup
    //   2519: iconst_0
    //   2520: aload_0
    //   2521: aastore
    //   2522: dup
    //   2523: iconst_1
    //   2524: aload_1
    //   2525: ifnonnull -> 2543
    //   2528: goto -> 2535
    //   2531: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2534: athrow
    //   2535: aload_1
    //   2536: goto -> 2550
    //   2539: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2542: athrow
    //   2543: aload_1
    //   2544: checkcast [B
    //   2547: invokevirtual clone : ()Ljava/lang/Object;
    //   2550: aastore
    //   2551: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2554: checkcast java/lang/Boolean
    //   2557: invokevirtual booleanValue : ()Z
    //   2560: istore_3
    //   2561: iload_2
    //   2562: ifne -> 2579
    //   2565: iinc #6, 1
    //   2568: iload_2
    //   2569: ifne -> 2439
    //   2572: goto -> 2579
    //   2575: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2578: athrow
    //   2579: iload_2
    //   2580: ifne -> 2921
    //   2583: sipush #-17093
    //   2586: sipush #15898
    //   2589: invokestatic a : (II)Ljava/lang/String;
    //   2592: iconst_1
    //   2593: ldc burp/Zmh0
    //   2595: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2598: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2601: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2604: astore #4
    //   2606: aload #4
    //   2608: arraylength
    //   2609: istore #5
    //   2611: iconst_0
    //   2612: istore #6
    //   2614: iload #6
    //   2616: iload #5
    //   2618: if_icmpge -> 2756
    //   2621: aload #4
    //   2623: iload #6
    //   2625: aaload
    //   2626: astore #7
    //   2628: aload #7
    //   2630: invokevirtual getModifiers : ()I
    //   2633: invokestatic isStatic : (I)Z
    //   2636: ifne -> 2646
    //   2639: goto -> 2749
    //   2642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2645: athrow
    //   2646: aload #7
    //   2648: invokevirtual getType : ()Ljava/lang/Class;
    //   2651: astore #8
    //   2653: aload #8
    //   2655: ifnull -> 2736
    //   2658: aload #8
    //   2660: invokevirtual isPrimitive : ()Z
    //   2663: ifne -> 2736
    //   2666: goto -> 2673
    //   2669: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2672: athrow
    //   2673: aload #8
    //   2675: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2678: ifnull -> 2736
    //   2681: goto -> 2688
    //   2684: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2687: athrow
    //   2688: aload #8
    //   2690: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2693: invokevirtual getName : ()Ljava/lang/String;
    //   2696: ifnull -> 2736
    //   2699: goto -> 2706
    //   2702: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2705: athrow
    //   2706: aload #8
    //   2708: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2711: invokevirtual getName : ()Ljava/lang/String;
    //   2714: sipush #-17096
    //   2717: sipush #-23376
    //   2720: invokestatic a : (II)Ljava/lang/String;
    //   2723: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2726: ifne -> 2736
    //   2729: goto -> 2736
    //   2732: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2735: athrow
    //   2736: aload #7
    //   2738: iconst_1
    //   2739: invokevirtual setAccessible : (Z)V
    //   2742: aload #7
    //   2744: aconst_null
    //   2745: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2748: pop
    //   2749: iinc #6, 1
    //   2752: iload_2
    //   2753: ifne -> 2614
    //   2756: sipush #-17109
    //   2759: sipush #-24398
    //   2762: invokestatic a : (II)Ljava/lang/String;
    //   2765: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2768: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2771: astore #4
    //   2773: aload #4
    //   2775: arraylength
    //   2776: istore #5
    //   2778: iconst_0
    //   2779: istore #6
    //   2781: iload #6
    //   2783: iload #5
    //   2785: if_icmpge -> 2921
    //   2788: aload #4
    //   2790: iload #6
    //   2792: aaload
    //   2793: astore #7
    //   2795: aload #7
    //   2797: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2800: pop
    //   2801: aload #7
    //   2803: invokevirtual getModifiers : ()I
    //   2806: invokestatic isStatic : (I)Z
    //   2809: ifeq -> 2907
    //   2812: aload #7
    //   2814: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2817: arraylength
    //   2818: iconst_2
    //   2819: if_icmpne -> 2907
    //   2822: goto -> 2829
    //   2825: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2828: athrow
    //   2829: aload #7
    //   2831: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2834: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2837: if_acmpne -> 2907
    //   2840: goto -> 2847
    //   2843: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2846: athrow
    //   2847: aload #7
    //   2849: iconst_1
    //   2850: invokevirtual setAccessible : (Z)V
    //   2853: aload #7
    //   2855: aconst_null
    //   2856: iconst_2
    //   2857: anewarray java/lang/Object
    //   2860: dup
    //   2861: iconst_0
    //   2862: aload_0
    //   2863: aastore
    //   2864: dup
    //   2865: iconst_1
    //   2866: aload_1
    //   2867: ifnonnull -> 2885
    //   2870: goto -> 2877
    //   2873: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2876: athrow
    //   2877: aload_1
    //   2878: goto -> 2892
    //   2881: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2884: athrow
    //   2885: aload_1
    //   2886: checkcast [B
    //   2889: invokevirtual clone : ()Ljava/lang/Object;
    //   2892: aastore
    //   2893: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2896: checkcast java/lang/Boolean
    //   2899: invokevirtual booleanValue : ()Z
    //   2902: istore_3
    //   2903: iload_2
    //   2904: ifne -> 2921
    //   2907: iinc #6, 1
    //   2910: iload_2
    //   2911: ifne -> 2781
    //   2914: goto -> 2921
    //   2917: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2920: athrow
    //   2921: iload_3
    //   2922: ifeq -> 2927
    //   2925: iload_3
    //   2926: ireturn
    //   2927: getstatic burp/Zgss.Zc : Ljava/lang/String;
    //   2930: getstatic burp/Zllw.ZW : Ljava/lang/Object;
    //   2933: checkcast java/math/BigInteger
    //   2936: invokevirtual intValue : ()I
    //   2939: bipush #32
    //   2941: irem
    //   2942: invokestatic abs : (I)I
    //   2945: invokevirtual charAt : (I)C
    //   2948: getstatic burp/Zk9s.ZM : Ljava/lang/String;
    //   2951: getstatic burp/Zt3l.Zq : Ljava/lang/Object;
    //   2954: checkcast java/math/BigInteger
    //   2957: invokevirtual intValue : ()I
    //   2960: bipush #32
    //   2962: irem
    //   2963: invokestatic abs : (I)I
    //   2966: invokevirtual charAt : (I)C
    //   2969: if_icmple -> 3314
    //   2972: sipush #-17094
    //   2975: sipush #10122
    //   2978: invokestatic a : (II)Ljava/lang/String;
    //   2981: iconst_1
    //   2982: ldc burp/Zeyt
    //   2984: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2987: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2990: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2993: astore #4
    //   2995: aload #4
    //   2997: arraylength
    //   2998: istore #5
    //   3000: iconst_0
    //   3001: istore #6
    //   3003: iload #6
    //   3005: iload #5
    //   3007: if_icmpge -> 3145
    //   3010: aload #4
    //   3012: iload #6
    //   3014: aaload
    //   3015: astore #7
    //   3017: aload #7
    //   3019: invokevirtual getModifiers : ()I
    //   3022: invokestatic isStatic : (I)Z
    //   3025: ifne -> 3035
    //   3028: goto -> 3138
    //   3031: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3034: athrow
    //   3035: aload #7
    //   3037: invokevirtual getType : ()Ljava/lang/Class;
    //   3040: astore #8
    //   3042: aload #8
    //   3044: ifnull -> 3125
    //   3047: aload #8
    //   3049: invokevirtual isPrimitive : ()Z
    //   3052: ifne -> 3125
    //   3055: goto -> 3062
    //   3058: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3061: athrow
    //   3062: aload #8
    //   3064: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3067: ifnull -> 3125
    //   3070: goto -> 3077
    //   3073: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3076: athrow
    //   3077: aload #8
    //   3079: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3082: invokevirtual getName : ()Ljava/lang/String;
    //   3085: ifnull -> 3125
    //   3088: goto -> 3095
    //   3091: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3094: athrow
    //   3095: aload #8
    //   3097: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3100: invokevirtual getName : ()Ljava/lang/String;
    //   3103: sipush #-17096
    //   3106: sipush #-23376
    //   3109: invokestatic a : (II)Ljava/lang/String;
    //   3112: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3115: ifne -> 3125
    //   3118: goto -> 3125
    //   3121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3124: athrow
    //   3125: aload #7
    //   3127: iconst_1
    //   3128: invokevirtual setAccessible : (Z)V
    //   3131: aload #7
    //   3133: aconst_null
    //   3134: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3137: pop
    //   3138: iinc #6, 1
    //   3141: iload_2
    //   3142: ifne -> 3003
    //   3145: sipush #-17105
    //   3148: sipush #-18641
    //   3151: invokestatic a : (II)Ljava/lang/String;
    //   3154: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3157: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3160: astore #4
    //   3162: aload #4
    //   3164: arraylength
    //   3165: istore #5
    //   3167: iconst_0
    //   3168: istore #6
    //   3170: iload #6
    //   3172: iload #5
    //   3174: if_icmpge -> 3310
    //   3177: aload #4
    //   3179: iload #6
    //   3181: aaload
    //   3182: astore #7
    //   3184: aload #7
    //   3186: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3189: pop
    //   3190: aload #7
    //   3192: invokevirtual getModifiers : ()I
    //   3195: invokestatic isStatic : (I)Z
    //   3198: ifeq -> 3296
    //   3201: aload #7
    //   3203: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3206: arraylength
    //   3207: iconst_2
    //   3208: if_icmpne -> 3296
    //   3211: goto -> 3218
    //   3214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3217: athrow
    //   3218: aload #7
    //   3220: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3223: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3226: if_acmpne -> 3296
    //   3229: goto -> 3236
    //   3232: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3235: athrow
    //   3236: aload #7
    //   3238: iconst_1
    //   3239: invokevirtual setAccessible : (Z)V
    //   3242: aload #7
    //   3244: aconst_null
    //   3245: iconst_2
    //   3246: anewarray java/lang/Object
    //   3249: dup
    //   3250: iconst_0
    //   3251: aload_0
    //   3252: aastore
    //   3253: dup
    //   3254: iconst_1
    //   3255: aload_1
    //   3256: ifnonnull -> 3274
    //   3259: goto -> 3266
    //   3262: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3265: athrow
    //   3266: aload_1
    //   3267: goto -> 3281
    //   3270: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3273: athrow
    //   3274: aload_1
    //   3275: checkcast [B
    //   3278: invokevirtual clone : ()Ljava/lang/Object;
    //   3281: aastore
    //   3282: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3285: checkcast java/lang/Boolean
    //   3288: invokevirtual booleanValue : ()Z
    //   3291: istore_3
    //   3292: iload_2
    //   3293: ifne -> 3310
    //   3296: iinc #6, 1
    //   3299: iload_2
    //   3300: ifne -> 3170
    //   3303: goto -> 3310
    //   3306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3309: athrow
    //   3310: iload_2
    //   3311: ifne -> 3652
    //   3314: sipush #-17106
    //   3317: sipush #-29645
    //   3320: invokestatic a : (II)Ljava/lang/String;
    //   3323: iconst_1
    //   3324: ldc burp/Zm8i
    //   3326: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3329: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3332: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3335: astore #4
    //   3337: aload #4
    //   3339: arraylength
    //   3340: istore #5
    //   3342: iconst_0
    //   3343: istore #6
    //   3345: iload #6
    //   3347: iload #5
    //   3349: if_icmpge -> 3487
    //   3352: aload #4
    //   3354: iload #6
    //   3356: aaload
    //   3357: astore #7
    //   3359: aload #7
    //   3361: invokevirtual getModifiers : ()I
    //   3364: invokestatic isStatic : (I)Z
    //   3367: ifne -> 3377
    //   3370: goto -> 3480
    //   3373: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3376: athrow
    //   3377: aload #7
    //   3379: invokevirtual getType : ()Ljava/lang/Class;
    //   3382: astore #8
    //   3384: aload #8
    //   3386: ifnull -> 3467
    //   3389: aload #8
    //   3391: invokevirtual isPrimitive : ()Z
    //   3394: ifne -> 3467
    //   3397: goto -> 3404
    //   3400: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3403: athrow
    //   3404: aload #8
    //   3406: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3409: ifnull -> 3467
    //   3412: goto -> 3419
    //   3415: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3418: athrow
    //   3419: aload #8
    //   3421: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3424: invokevirtual getName : ()Ljava/lang/String;
    //   3427: ifnull -> 3467
    //   3430: goto -> 3437
    //   3433: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3436: athrow
    //   3437: aload #8
    //   3439: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3442: invokevirtual getName : ()Ljava/lang/String;
    //   3445: sipush #-17096
    //   3448: sipush #-23376
    //   3451: invokestatic a : (II)Ljava/lang/String;
    //   3454: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3457: ifne -> 3467
    //   3460: goto -> 3467
    //   3463: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3466: athrow
    //   3467: aload #7
    //   3469: iconst_1
    //   3470: invokevirtual setAccessible : (Z)V
    //   3473: aload #7
    //   3475: aconst_null
    //   3476: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3479: pop
    //   3480: iinc #6, 1
    //   3483: iload_2
    //   3484: ifne -> 3345
    //   3487: sipush #-17103
    //   3490: sipush #23388
    //   3493: invokestatic a : (II)Ljava/lang/String;
    //   3496: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3499: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3502: astore #4
    //   3504: aload #4
    //   3506: arraylength
    //   3507: istore #5
    //   3509: iconst_0
    //   3510: istore #6
    //   3512: iload #6
    //   3514: iload #5
    //   3516: if_icmpge -> 3652
    //   3519: aload #4
    //   3521: iload #6
    //   3523: aaload
    //   3524: astore #7
    //   3526: aload #7
    //   3528: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3531: pop
    //   3532: aload #7
    //   3534: invokevirtual getModifiers : ()I
    //   3537: invokestatic isStatic : (I)Z
    //   3540: ifeq -> 3638
    //   3543: aload #7
    //   3545: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3548: arraylength
    //   3549: iconst_2
    //   3550: if_icmpne -> 3638
    //   3553: goto -> 3560
    //   3556: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3559: athrow
    //   3560: aload #7
    //   3562: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3565: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3568: if_acmpne -> 3638
    //   3571: goto -> 3578
    //   3574: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3577: athrow
    //   3578: aload #7
    //   3580: iconst_1
    //   3581: invokevirtual setAccessible : (Z)V
    //   3584: aload #7
    //   3586: aconst_null
    //   3587: iconst_2
    //   3588: anewarray java/lang/Object
    //   3591: dup
    //   3592: iconst_0
    //   3593: aload_0
    //   3594: aastore
    //   3595: dup
    //   3596: iconst_1
    //   3597: aload_1
    //   3598: ifnonnull -> 3616
    //   3601: goto -> 3608
    //   3604: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3607: athrow
    //   3608: aload_1
    //   3609: goto -> 3623
    //   3612: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3615: athrow
    //   3616: aload_1
    //   3617: checkcast [B
    //   3620: invokevirtual clone : ()Ljava/lang/Object;
    //   3623: aastore
    //   3624: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3627: checkcast java/lang/Boolean
    //   3630: invokevirtual booleanValue : ()Z
    //   3633: istore_3
    //   3634: iload_2
    //   3635: ifne -> 3652
    //   3638: iinc #6, 1
    //   3641: iload_2
    //   3642: ifne -> 3512
    //   3645: goto -> 3652
    //   3648: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3651: athrow
    //   3652: iload_3
    //   3653: ifeq -> 3658
    //   3656: iload_3
    //   3657: ireturn
    //   3658: getstatic burp/Zl_u.Zc : Ljava/lang/String;
    //   3661: getstatic burp/Zkig.ZK : Ljava/lang/Object;
    //   3664: checkcast java/math/BigInteger
    //   3667: invokevirtual intValue : ()I
    //   3670: bipush #32
    //   3672: irem
    //   3673: invokestatic abs : (I)I
    //   3676: invokevirtual charAt : (I)C
    //   3679: getstatic burp/Zedz.Zh : Ljava/lang/String;
    //   3682: getstatic burp/Zkbm.Zp : Ljava/lang/Object;
    //   3685: checkcast java/math/BigInteger
    //   3688: invokevirtual intValue : ()I
    //   3691: bipush #32
    //   3693: irem
    //   3694: invokestatic abs : (I)I
    //   3697: invokevirtual charAt : (I)C
    //   3700: if_icmpgt -> 4045
    //   3703: sipush #-17104
    //   3706: sipush #-25687
    //   3709: invokestatic a : (II)Ljava/lang/String;
    //   3712: iconst_1
    //   3713: ldc burp/Zrh1
    //   3715: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3718: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3721: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3724: astore #4
    //   3726: aload #4
    //   3728: arraylength
    //   3729: istore #5
    //   3731: iconst_0
    //   3732: istore #6
    //   3734: iload #6
    //   3736: iload #5
    //   3738: if_icmpge -> 3876
    //   3741: aload #4
    //   3743: iload #6
    //   3745: aaload
    //   3746: astore #7
    //   3748: aload #7
    //   3750: invokevirtual getModifiers : ()I
    //   3753: invokestatic isStatic : (I)Z
    //   3756: ifne -> 3766
    //   3759: goto -> 3869
    //   3762: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3765: athrow
    //   3766: aload #7
    //   3768: invokevirtual getType : ()Ljava/lang/Class;
    //   3771: astore #8
    //   3773: aload #8
    //   3775: ifnull -> 3856
    //   3778: aload #8
    //   3780: invokevirtual isPrimitive : ()Z
    //   3783: ifne -> 3856
    //   3786: goto -> 3793
    //   3789: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3792: athrow
    //   3793: aload #8
    //   3795: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3798: ifnull -> 3856
    //   3801: goto -> 3808
    //   3804: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3807: athrow
    //   3808: aload #8
    //   3810: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3813: invokevirtual getName : ()Ljava/lang/String;
    //   3816: ifnull -> 3856
    //   3819: goto -> 3826
    //   3822: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3825: athrow
    //   3826: aload #8
    //   3828: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3831: invokevirtual getName : ()Ljava/lang/String;
    //   3834: sipush #-17096
    //   3837: sipush #-23376
    //   3840: invokestatic a : (II)Ljava/lang/String;
    //   3843: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3846: ifne -> 3856
    //   3849: goto -> 3856
    //   3852: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3855: athrow
    //   3856: aload #7
    //   3858: iconst_1
    //   3859: invokevirtual setAccessible : (Z)V
    //   3862: aload #7
    //   3864: aconst_null
    //   3865: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3868: pop
    //   3869: iinc #6, 1
    //   3872: iload_2
    //   3873: ifne -> 3734
    //   3876: sipush #-17104
    //   3879: sipush #-25687
    //   3882: invokestatic a : (II)Ljava/lang/String;
    //   3885: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3888: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3891: astore #4
    //   3893: aload #4
    //   3895: arraylength
    //   3896: istore #5
    //   3898: iconst_0
    //   3899: istore #6
    //   3901: iload #6
    //   3903: iload #5
    //   3905: if_icmpge -> 4041
    //   3908: aload #4
    //   3910: iload #6
    //   3912: aaload
    //   3913: astore #7
    //   3915: aload #7
    //   3917: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3920: pop
    //   3921: aload #7
    //   3923: invokevirtual getModifiers : ()I
    //   3926: invokestatic isStatic : (I)Z
    //   3929: ifeq -> 4027
    //   3932: aload #7
    //   3934: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3937: arraylength
    //   3938: iconst_2
    //   3939: if_icmpne -> 4027
    //   3942: goto -> 3949
    //   3945: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3948: athrow
    //   3949: aload #7
    //   3951: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3954: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3957: if_acmpne -> 4027
    //   3960: goto -> 3967
    //   3963: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3966: athrow
    //   3967: aload #7
    //   3969: iconst_1
    //   3970: invokevirtual setAccessible : (Z)V
    //   3973: aload #7
    //   3975: aconst_null
    //   3976: iconst_2
    //   3977: anewarray java/lang/Object
    //   3980: dup
    //   3981: iconst_0
    //   3982: aload_0
    //   3983: aastore
    //   3984: dup
    //   3985: iconst_1
    //   3986: aload_1
    //   3987: ifnonnull -> 4005
    //   3990: goto -> 3997
    //   3993: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3996: athrow
    //   3997: aload_1
    //   3998: goto -> 4012
    //   4001: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4004: athrow
    //   4005: aload_1
    //   4006: checkcast [B
    //   4009: invokevirtual clone : ()Ljava/lang/Object;
    //   4012: aastore
    //   4013: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4016: checkcast java/lang/Boolean
    //   4019: invokevirtual booleanValue : ()Z
    //   4022: istore_3
    //   4023: iload_2
    //   4024: ifne -> 4041
    //   4027: iinc #6, 1
    //   4030: iload_2
    //   4031: ifne -> 3901
    //   4034: goto -> 4041
    //   4037: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4040: athrow
    //   4041: iload_2
    //   4042: ifne -> 4383
    //   4045: sipush #-17101
    //   4048: sipush #27424
    //   4051: invokestatic a : (II)Ljava/lang/String;
    //   4054: iconst_1
    //   4055: ldc burp/Ztkc
    //   4057: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4060: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4063: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4066: astore #4
    //   4068: aload #4
    //   4070: arraylength
    //   4071: istore #5
    //   4073: iconst_0
    //   4074: istore #6
    //   4076: iload #6
    //   4078: iload #5
    //   4080: if_icmpge -> 4218
    //   4083: aload #4
    //   4085: iload #6
    //   4087: aaload
    //   4088: astore #7
    //   4090: aload #7
    //   4092: invokevirtual getModifiers : ()I
    //   4095: invokestatic isStatic : (I)Z
    //   4098: ifne -> 4108
    //   4101: goto -> 4211
    //   4104: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4107: athrow
    //   4108: aload #7
    //   4110: invokevirtual getType : ()Ljava/lang/Class;
    //   4113: astore #8
    //   4115: aload #8
    //   4117: ifnull -> 4198
    //   4120: aload #8
    //   4122: invokevirtual isPrimitive : ()Z
    //   4125: ifne -> 4198
    //   4128: goto -> 4135
    //   4131: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4134: athrow
    //   4135: aload #8
    //   4137: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4140: ifnull -> 4198
    //   4143: goto -> 4150
    //   4146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4149: athrow
    //   4150: aload #8
    //   4152: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4155: invokevirtual getName : ()Ljava/lang/String;
    //   4158: ifnull -> 4198
    //   4161: goto -> 4168
    //   4164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4167: athrow
    //   4168: aload #8
    //   4170: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4173: invokevirtual getName : ()Ljava/lang/String;
    //   4176: sipush #-17096
    //   4179: sipush #-23376
    //   4182: invokestatic a : (II)Ljava/lang/String;
    //   4185: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4188: ifne -> 4198
    //   4191: goto -> 4198
    //   4194: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4197: athrow
    //   4198: aload #7
    //   4200: iconst_1
    //   4201: invokevirtual setAccessible : (Z)V
    //   4204: aload #7
    //   4206: aconst_null
    //   4207: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4210: pop
    //   4211: iinc #6, 1
    //   4214: iload_2
    //   4215: ifne -> 4076
    //   4218: sipush #-17095
    //   4221: sipush #-30973
    //   4224: invokestatic a : (II)Ljava/lang/String;
    //   4227: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4230: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4233: astore #4
    //   4235: aload #4
    //   4237: arraylength
    //   4238: istore #5
    //   4240: iconst_0
    //   4241: istore #6
    //   4243: iload #6
    //   4245: iload #5
    //   4247: if_icmpge -> 4383
    //   4250: aload #4
    //   4252: iload #6
    //   4254: aaload
    //   4255: astore #7
    //   4257: aload #7
    //   4259: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4262: pop
    //   4263: aload #7
    //   4265: invokevirtual getModifiers : ()I
    //   4268: invokestatic isStatic : (I)Z
    //   4271: ifeq -> 4369
    //   4274: aload #7
    //   4276: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4279: arraylength
    //   4280: iconst_2
    //   4281: if_icmpne -> 4369
    //   4284: goto -> 4291
    //   4287: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4290: athrow
    //   4291: aload #7
    //   4293: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4296: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4299: if_acmpne -> 4369
    //   4302: goto -> 4309
    //   4305: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4308: athrow
    //   4309: aload #7
    //   4311: iconst_1
    //   4312: invokevirtual setAccessible : (Z)V
    //   4315: aload #7
    //   4317: aconst_null
    //   4318: iconst_2
    //   4319: anewarray java/lang/Object
    //   4322: dup
    //   4323: iconst_0
    //   4324: aload_0
    //   4325: aastore
    //   4326: dup
    //   4327: iconst_1
    //   4328: aload_1
    //   4329: ifnonnull -> 4347
    //   4332: goto -> 4339
    //   4335: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4338: athrow
    //   4339: aload_1
    //   4340: goto -> 4354
    //   4343: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4346: athrow
    //   4347: aload_1
    //   4348: checkcast [B
    //   4351: invokevirtual clone : ()Ljava/lang/Object;
    //   4354: aastore
    //   4355: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4358: checkcast java/lang/Boolean
    //   4361: invokevirtual booleanValue : ()Z
    //   4364: istore_3
    //   4365: iload_2
    //   4366: ifne -> 4383
    //   4369: iinc #6, 1
    //   4372: iload_2
    //   4373: ifne -> 4243
    //   4376: goto -> 4383
    //   4379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4382: athrow
    //   4383: iload_3
    //   4384: ireturn
    //   4385: astore_3
    //   4386: new java/lang/Exception
    //   4389: dup
    //   4390: aload_3
    //   4391: invokevirtual getMessage : ()Ljava/lang/String;
    //   4394: invokespecial <init> : (Ljava/lang/String;)V
    //   4397: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2195	4385	java/lang/Throwable
    //   279	293	296	java/lang/Throwable
    //   286	307	310	java/lang/Throwable
    //   300	321	324	java/lang/Throwable
    //   314	335	338	java/lang/Throwable
    //   328	349	352	java/lang/Throwable
    //   342	363	366	java/lang/Throwable
    //   356	377	380	java/lang/Throwable
    //   370	391	394	java/lang/Throwable
    //   384	401	404	java/lang/Throwable
    //   440	454	457	java/lang/Throwable
    //   447	468	471	java/lang/Throwable
    //   461	482	485	java/lang/Throwable
    //   475	496	499	java/lang/Throwable
    //   489	510	513	java/lang/Throwable
    //   503	524	527	java/lang/Throwable
    //   517	538	541	java/lang/Throwable
    //   531	552	555	java/lang/Throwable
    //   545	569	572	java/lang/Throwable
    //   633	651	654	java/lang/Throwable
    //   642	667	670	java/lang/Throwable
    //   658	684	687	java/lang/Throwable
    //   674	700	703	java/lang/Throwable
    //   691	717	720	java/lang/Throwable
    //   707	733	736	java/lang/Throwable
    //   724	749	752	java/lang/Throwable
    //   740	772	775	java/lang/Throwable
    //   756	788	791	java/lang/Throwable
    //   779	804	807	java/lang/Throwable
    //   795	827	830	java/lang/Throwable
    //   811	843	846	java/lang/Throwable
    //   834	859	862	java/lang/Throwable
    //   850	878	881	java/lang/Throwable
    //   1008	1043	1046	java/lang/Throwable
    //   1050	1091	1094	java/lang/Throwable
    //   1177	1191	1191	java/lang/Throwable
    //   1202	1215	1218	java/lang/Throwable
    //   1207	1230	1233	java/lang/Throwable
    //   1222	1248	1251	java/lang/Throwable
    //   1237	1278	1281	java/lang/Throwable
    //   1341	1368	1371	java/lang/Throwable
    //   1358	1389	1392	java/lang/Throwable
    //   1375	1419	1422	java/lang/Throwable
    //   1396	1430	1430	java/lang/Throwable
    //   1441	1457	1460	java/lang/Throwable
    //   1556	1570	1570	java/lang/Throwable
    //   1581	1594	1597	java/lang/Throwable
    //   1586	1609	1612	java/lang/Throwable
    //   1601	1627	1630	java/lang/Throwable
    //   1616	1657	1660	java/lang/Throwable
    //   1723	1750	1753	java/lang/Throwable
    //   1740	1768	1771	java/lang/Throwable
    //   1757	1798	1801	java/lang/Throwable
    //   1775	1809	1809	java/lang/Throwable
    //   1831	1842	1845	java/lang/Throwable
    //   1897	1911	1911	java/lang/Throwable
    //   1922	1935	1938	java/lang/Throwable
    //   1927	1950	1953	java/lang/Throwable
    //   1942	1968	1971	java/lang/Throwable
    //   1957	1998	2001	java/lang/Throwable
    //   2064	2091	2094	java/lang/Throwable
    //   2081	2109	2112	java/lang/Throwable
    //   2098	2139	2142	java/lang/Throwable
    //   2116	2150	2150	java/lang/Throwable
    //   2172	2183	2186	java/lang/Throwable
    //   2196	2926	4385	java/lang/Throwable
    //   2286	2300	2300	java/lang/Throwable
    //   2311	2324	2327	java/lang/Throwable
    //   2316	2339	2342	java/lang/Throwable
    //   2331	2357	2360	java/lang/Throwable
    //   2346	2387	2390	java/lang/Throwable
    //   2453	2480	2483	java/lang/Throwable
    //   2470	2498	2501	java/lang/Throwable
    //   2487	2528	2531	java/lang/Throwable
    //   2505	2539	2539	java/lang/Throwable
    //   2561	2572	2575	java/lang/Throwable
    //   2628	2642	2642	java/lang/Throwable
    //   2653	2666	2669	java/lang/Throwable
    //   2658	2681	2684	java/lang/Throwable
    //   2673	2699	2702	java/lang/Throwable
    //   2688	2729	2732	java/lang/Throwable
    //   2795	2822	2825	java/lang/Throwable
    //   2812	2840	2843	java/lang/Throwable
    //   2829	2870	2873	java/lang/Throwable
    //   2847	2881	2881	java/lang/Throwable
    //   2903	2914	2917	java/lang/Throwable
    //   2927	3657	4385	java/lang/Throwable
    //   3017	3031	3031	java/lang/Throwable
    //   3042	3055	3058	java/lang/Throwable
    //   3047	3070	3073	java/lang/Throwable
    //   3062	3088	3091	java/lang/Throwable
    //   3077	3118	3121	java/lang/Throwable
    //   3184	3211	3214	java/lang/Throwable
    //   3201	3229	3232	java/lang/Throwable
    //   3218	3259	3262	java/lang/Throwable
    //   3236	3270	3270	java/lang/Throwable
    //   3292	3303	3306	java/lang/Throwable
    //   3359	3373	3373	java/lang/Throwable
    //   3384	3397	3400	java/lang/Throwable
    //   3389	3412	3415	java/lang/Throwable
    //   3404	3430	3433	java/lang/Throwable
    //   3419	3460	3463	java/lang/Throwable
    //   3526	3553	3556	java/lang/Throwable
    //   3543	3571	3574	java/lang/Throwable
    //   3560	3601	3604	java/lang/Throwable
    //   3578	3612	3612	java/lang/Throwable
    //   3634	3645	3648	java/lang/Throwable
    //   3658	4384	4385	java/lang/Throwable
    //   3748	3762	3762	java/lang/Throwable
    //   3773	3786	3789	java/lang/Throwable
    //   3778	3801	3804	java/lang/Throwable
    //   3793	3819	3822	java/lang/Throwable
    //   3808	3849	3852	java/lang/Throwable
    //   3915	3942	3945	java/lang/Throwable
    //   3932	3960	3963	java/lang/Throwable
    //   3949	3990	3993	java/lang/Throwable
    //   3967	4001	4001	java/lang/Throwable
    //   4023	4034	4037	java/lang/Throwable
    //   4090	4104	4104	java/lang/Throwable
    //   4115	4128	4131	java/lang/Throwable
    //   4120	4143	4146	java/lang/Throwable
    //   4135	4161	4164	java/lang/Throwable
    //   4150	4191	4194	java/lang/Throwable
    //   4257	4284	4287	java/lang/Throwable
    //   4274	4302	4305	java/lang/Throwable
    //   4291	4332	4335	java/lang/Throwable
    //   4309	4343	4343	java/lang/Throwable
    //   4365	4376	4379	java/lang/Throwable
  }
  
  static void Zr(Object paramObject) {
    Zg7z.Zf = a(-17089, -10210);
    Zg7z.ZV = new BigInteger(a(-17111, 12356));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zrbp.Ze.charAt(Math.abs(((BigInteger)Zzip.ZW).intValue() % 32)) > Zehi.Zi.charAt(Math.abs(((BigInteger)Zxso.ZF).intValue() % 32))) {
          try {
            Zrnu.ZT(Class.forName(a(-17092, -31158)));
            if (!bool)
              Zxwl.Zk(Class.forName(a(-17108, -17629))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxwl.Zk(Class.forName(a(-17108, -17629)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ªúê¨Öøð&¥"¨2éâÔl¼¬zíö\\n;>®Kæ\\tÓ'­ÚÈÅ¨÷q\\tÜLîôC7uÚ\\t¦\©ð°\\tÅýo®ªÏZ\\tTë]CÖöeX\\tM~²çÙZ\\nO>\\r\\tÎ¼_/©ô\\t'¡3\\nßÛ¹j\\tÍný°! 6Á\\tª^-Uä¦ o?òTêi[*E«²2:ùusä¨ë5iÛ*êç ãhO\\tE}1÷vR\\tx1ß¸M|\\te±{\\bú®V\\t;°ïkcÈ<µ\\tÂô 6J)\\t£'J×¶7\\tÍnN°W®®ß'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #126
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
    //   68: ldc '¤]R&ré°LÏÆ1d(ìçYkT¹Ê¸ºE:ÜçSI¢Tú£ñý.w#\\fâýøPÝ!Y±ý0XÒð{ÐK½Ñ;ï/ÒïàÂsÙÆ=Fóº'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #36
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
    //   129: putstatic burp/Zk9s.a : [Ljava/lang/String;
    //   132: bipush #23
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zk9s.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
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
    //   212: bipush #107
    //   214: goto -> 243
    //   217: bipush #32
    //   219: goto -> 243
    //   222: bipush #87
    //   224: goto -> 243
    //   227: bipush #32
    //   229: goto -> 243
    //   232: bipush #52
    //   234: goto -> 243
    //   237: bipush #15
    //   239: goto -> 243
    //   242: iconst_1
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: sipush #-17102
    //   303: sipush #-19802
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zk9s.ZM : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #14
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-102
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-96
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #24
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #94
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #52
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #71
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #85
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #127
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-124
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #68
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #24
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-86
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-35
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #51
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-127
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #-76
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #39
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #-126
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #-102
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #61
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-57
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #7
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-64
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #-55
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-2
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #117
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #42
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #-95
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-42
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #122
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #-82
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zk9s.ZY : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBD3F) & 0xFFFF;
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
      byte b1 = 39;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk9s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */