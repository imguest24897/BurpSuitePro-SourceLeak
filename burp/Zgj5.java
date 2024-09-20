package burp;

import java.math.BigInteger;

class Zgj5 extends ClassLoader {
  static Object ZO;
  
  static String ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZU(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
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
    //   240: ifeq -> 217
    //   243: aload_3
    //   244: arraylength
    //   245: bipush #10
    //   247: if_icmplt -> 13
    //   250: getstatic burp/Zero.ZE : Ljava/lang/Object;
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
    //   412: ifeq -> 266
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
    //   580: ifeq -> 427
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
    //   609: ifeq -> 594
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
    //   648: ifeq -> 885
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
    //   681: ifeq -> 885
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
    //   714: ifeq -> 885
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
    //   769: ifeq -> 885
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
    //   824: ifeq -> 885
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
    //   889: ifeq -> 626
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
    //   1005: ifeq -> 898
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
    //   1102: sipush #18236
    //   1105: new java/math/BigInteger
    //   1108: dup
    //   1109: aload #4
    //   1111: invokespecial <init> : ([B)V
    //   1114: invokevirtual abs : ()Ljava/math/BigInteger;
    //   1117: putstatic burp/Ztt0.ZF : Ljava/lang/Object;
    //   1120: sipush #-7586
    //   1123: invokestatic a : (II)Ljava/lang/String;
    //   1126: iconst_1
    //   1127: ldc burp/Zz0
    //   1129: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1132: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1135: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1138: astore_3
    //   1139: aload_3
    //   1140: arraylength
    //   1141: istore #4
    //   1143: iconst_0
    //   1144: istore #5
    //   1146: iload #5
    //   1148: iload #4
    //   1150: if_icmpge -> 1287
    //   1153: aload_3
    //   1154: iload #5
    //   1156: aaload
    //   1157: astore #6
    //   1159: aload #6
    //   1161: invokevirtual getModifiers : ()I
    //   1164: invokestatic isStatic : (I)Z
    //   1167: ifne -> 1177
    //   1170: goto -> 1280
    //   1173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1176: athrow
    //   1177: aload #6
    //   1179: invokevirtual getType : ()Ljava/lang/Class;
    //   1182: astore #7
    //   1184: aload #7
    //   1186: ifnull -> 1267
    //   1189: aload #7
    //   1191: invokevirtual isPrimitive : ()Z
    //   1194: ifne -> 1267
    //   1197: goto -> 1204
    //   1200: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1203: athrow
    //   1204: aload #7
    //   1206: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1209: ifnull -> 1267
    //   1212: goto -> 1219
    //   1215: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1218: athrow
    //   1219: aload #7
    //   1221: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1224: invokevirtual getName : ()Ljava/lang/String;
    //   1227: ifnull -> 1267
    //   1230: goto -> 1237
    //   1233: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1236: athrow
    //   1237: aload #7
    //   1239: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1242: invokevirtual getName : ()Ljava/lang/String;
    //   1245: sipush #18238
    //   1248: sipush #-12854
    //   1251: invokestatic a : (II)Ljava/lang/String;
    //   1254: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1257: ifne -> 1267
    //   1260: goto -> 1267
    //   1263: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1266: athrow
    //   1267: aload #6
    //   1269: iconst_1
    //   1270: invokevirtual setAccessible : (Z)V
    //   1273: aload #6
    //   1275: aconst_null
    //   1276: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1279: pop
    //   1280: iinc #5, 1
    //   1283: iload_2
    //   1284: ifeq -> 1146
    //   1287: sipush #18224
    //   1290: sipush #20456
    //   1293: invokestatic a : (II)Ljava/lang/String;
    //   1296: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1299: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1302: astore_3
    //   1303: aload_3
    //   1304: arraylength
    //   1305: istore #4
    //   1307: iconst_0
    //   1308: istore #5
    //   1310: iload #5
    //   1312: iload #4
    //   1314: if_icmpge -> 1446
    //   1317: aload_3
    //   1318: iload #5
    //   1320: aaload
    //   1321: astore #6
    //   1323: aload #6
    //   1325: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1328: pop
    //   1329: aload #6
    //   1331: invokevirtual getModifiers : ()I
    //   1334: invokestatic isStatic : (I)Z
    //   1337: ifeq -> 1432
    //   1340: aload #6
    //   1342: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1345: arraylength
    //   1346: iconst_2
    //   1347: if_icmpne -> 1432
    //   1350: goto -> 1357
    //   1353: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1356: athrow
    //   1357: aload #6
    //   1359: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1362: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1365: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1368: ifeq -> 1432
    //   1371: goto -> 1378
    //   1374: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1377: athrow
    //   1378: aload #6
    //   1380: iconst_1
    //   1381: invokevirtual setAccessible : (Z)V
    //   1384: aload #6
    //   1386: aconst_null
    //   1387: iconst_2
    //   1388: anewarray java/lang/Object
    //   1391: dup
    //   1392: iconst_0
    //   1393: aload_0
    //   1394: aastore
    //   1395: dup
    //   1396: iconst_1
    //   1397: aload_1
    //   1398: ifnonnull -> 1416
    //   1401: goto -> 1408
    //   1404: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1407: athrow
    //   1408: aload_1
    //   1409: goto -> 1423
    //   1412: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1415: athrow
    //   1416: aload_1
    //   1417: checkcast [B
    //   1420: invokevirtual clone : ()Ljava/lang/Object;
    //   1423: aastore
    //   1424: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1427: pop
    //   1428: iload_2
    //   1429: ifeq -> 1446
    //   1432: iinc #5, 1
    //   1435: iload_2
    //   1436: ifeq -> 1310
    //   1439: goto -> 1446
    //   1442: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1445: athrow
    //   1446: getstatic burp/Zryq.ZR : Ljava/lang/Object;
    //   1449: checkcast java/math/BigInteger
    //   1452: invokevirtual toByteArray : ()[B
    //   1455: astore_3
    //   1456: bipush #32
    //   1458: newarray int
    //   1460: dup
    //   1461: iconst_0
    //   1462: ldc 943331329
    //   1464: iastore
    //   1465: dup
    //   1466: iconst_1
    //   1467: ldc 170788368
    //   1469: iastore
    //   1470: dup
    //   1471: iconst_2
    //   1472: ldc 1008414755
    //   1474: iastore
    //   1475: dup
    //   1476: iconst_3
    //   1477: ldc 187049985
    //   1479: iastore
    //   1480: dup
    //   1481: iconst_4
    //   1482: ldc 1010368540
    //   1484: iastore
    //   1485: dup
    //   1486: iconst_5
    //   1487: ldc 220604441
    //   1489: iastore
    //   1490: dup
    //   1491: bipush #6
    //   1493: ldc 940377620
    //   1495: iastore
    //   1496: dup
    //   1497: bipush #7
    //   1499: ldc 255209728
    //   1501: iastore
    //   1502: dup
    //   1503: bipush #8
    //   1505: ldc 689771012
    //   1507: iastore
    //   1508: dup
    //   1509: bipush #9
    //   1511: ldc 221709344
    //   1513: iastore
    //   1514: dup
    //   1515: bipush #10
    //   1517: ldc 957157408
    //   1519: iastore
    //   1520: dup
    //   1521: bipush #11
    //   1523: ldc 892536332
    //   1525: iastore
    //   1526: dup
    //   1527: bipush #12
    //   1529: ldc 722417666
    //   1531: iastore
    //   1532: dup
    //   1533: bipush #13
    //   1535: ldc 1026621720
    //   1537: iastore
    //   1538: dup
    //   1539: bipush #14
    //   1541: ldc 655302664
    //   1543: iastore
    //   1544: dup
    //   1545: bipush #15
    //   1547: ldc 890966315
    //   1549: iastore
    //   1550: dup
    //   1551: bipush #16
    //   1553: ldc 187632156
    //   1555: iastore
    //   1556: dup
    //   1557: bipush #17
    //   1559: ldc 874189824
    //   1561: iastore
    //   1562: dup
    //   1563: bipush #18
    //   1565: ldc 254150144
    //   1567: iastore
    //   1568: dup
    //   1569: bipush #19
    //   1571: ldc 924386310
    //   1573: iastore
    //   1574: dup
    //   1575: bipush #20
    //   1577: ldc 121057538
    //   1579: iastore
    //   1580: dup
    //   1581: bipush #21
    //   1583: ldc 840500228
    //   1585: iastore
    //   1586: dup
    //   1587: bipush #22
    //   1589: ldc 389160971
    //   1591: iastore
    //   1592: dup
    //   1593: bipush #23
    //   1595: ldc 907870729
    //   1597: iastore
    //   1598: dup
    //   1599: bipush #24
    //   1601: ldc 389426184
    //   1603: iastore
    //   1604: dup
    //   1605: bipush #25
    //   1607: ldc 973875457
    //   1609: iastore
    //   1610: dup
    //   1611: bipush #26
    //   1613: ldc 372376604
    //   1615: iastore
    //   1616: dup
    //   1617: bipush #27
    //   1619: ldc 707731490
    //   1621: iastore
    //   1622: dup
    //   1623: bipush #28
    //   1625: ldc 1043334948
    //   1627: iastore
    //   1628: dup
    //   1629: bipush #29
    //   1631: ldc 439222784
    //   1633: iastore
    //   1634: dup
    //   1635: bipush #30
    //   1637: ldc 876216579
    //   1639: iastore
    //   1640: dup
    //   1641: bipush #31
    //   1643: ldc 455999525
    //   1645: iastore
    //   1646: astore #5
    //   1648: bipush #8
    //   1650: aload_3
    //   1651: arraylength
    //   1652: bipush #8
    //   1654: irem
    //   1655: isub
    //   1656: istore #6
    //   1658: aload_3
    //   1659: arraylength
    //   1660: iload #6
    //   1662: iadd
    //   1663: newarray byte
    //   1665: astore #7
    //   1667: iconst_0
    //   1668: istore #8
    //   1670: iload #8
    //   1672: aload_3
    //   1673: arraylength
    //   1674: if_icmpge -> 1693
    //   1677: aload #7
    //   1679: iload #8
    //   1681: aload_3
    //   1682: iload #8
    //   1684: baload
    //   1685: bastore
    //   1686: iinc #8, 1
    //   1689: iload_2
    //   1690: ifeq -> 1670
    //   1693: aload_3
    //   1694: arraylength
    //   1695: istore #8
    //   1697: iload #8
    //   1699: aload #7
    //   1701: arraylength
    //   1702: if_icmpge -> 1720
    //   1705: aload #7
    //   1707: iload #8
    //   1709: iload #6
    //   1711: i2b
    //   1712: bastore
    //   1713: iinc #8, 1
    //   1716: iload_2
    //   1717: ifeq -> 1697
    //   1720: aload #7
    //   1722: astore_3
    //   1723: bipush #64
    //   1725: newarray int
    //   1727: dup
    //   1728: iconst_0
    //   1729: ldc 16843776
    //   1731: iastore
    //   1732: dup
    //   1733: iconst_1
    //   1734: iconst_0
    //   1735: iastore
    //   1736: dup
    //   1737: iconst_2
    //   1738: ldc 65536
    //   1740: iastore
    //   1741: dup
    //   1742: iconst_3
    //   1743: ldc 16843780
    //   1745: iastore
    //   1746: dup
    //   1747: iconst_4
    //   1748: ldc 16842756
    //   1750: iastore
    //   1751: dup
    //   1752: iconst_5
    //   1753: ldc 66564
    //   1755: iastore
    //   1756: dup
    //   1757: bipush #6
    //   1759: iconst_4
    //   1760: iastore
    //   1761: dup
    //   1762: bipush #7
    //   1764: ldc 65536
    //   1766: iastore
    //   1767: dup
    //   1768: bipush #8
    //   1770: sipush #1024
    //   1773: iastore
    //   1774: dup
    //   1775: bipush #9
    //   1777: ldc 16843776
    //   1779: iastore
    //   1780: dup
    //   1781: bipush #10
    //   1783: ldc 16843780
    //   1785: iastore
    //   1786: dup
    //   1787: bipush #11
    //   1789: sipush #1024
    //   1792: iastore
    //   1793: dup
    //   1794: bipush #12
    //   1796: ldc 16778244
    //   1798: iastore
    //   1799: dup
    //   1800: bipush #13
    //   1802: ldc 16842756
    //   1804: iastore
    //   1805: dup
    //   1806: bipush #14
    //   1808: ldc 16777216
    //   1810: iastore
    //   1811: dup
    //   1812: bipush #15
    //   1814: iconst_4
    //   1815: iastore
    //   1816: dup
    //   1817: bipush #16
    //   1819: sipush #1028
    //   1822: iastore
    //   1823: dup
    //   1824: bipush #17
    //   1826: ldc 16778240
    //   1828: iastore
    //   1829: dup
    //   1830: bipush #18
    //   1832: ldc 16778240
    //   1834: iastore
    //   1835: dup
    //   1836: bipush #19
    //   1838: ldc 66560
    //   1840: iastore
    //   1841: dup
    //   1842: bipush #20
    //   1844: ldc 66560
    //   1846: iastore
    //   1847: dup
    //   1848: bipush #21
    //   1850: ldc 16842752
    //   1852: iastore
    //   1853: dup
    //   1854: bipush #22
    //   1856: ldc 16842752
    //   1858: iastore
    //   1859: dup
    //   1860: bipush #23
    //   1862: ldc 16778244
    //   1864: iastore
    //   1865: dup
    //   1866: bipush #24
    //   1868: ldc 65540
    //   1870: iastore
    //   1871: dup
    //   1872: bipush #25
    //   1874: ldc 16777220
    //   1876: iastore
    //   1877: dup
    //   1878: bipush #26
    //   1880: ldc 16777220
    //   1882: iastore
    //   1883: dup
    //   1884: bipush #27
    //   1886: ldc 65540
    //   1888: iastore
    //   1889: dup
    //   1890: bipush #28
    //   1892: iconst_0
    //   1893: iastore
    //   1894: dup
    //   1895: bipush #29
    //   1897: sipush #1028
    //   1900: iastore
    //   1901: dup
    //   1902: bipush #30
    //   1904: ldc 66564
    //   1906: iastore
    //   1907: dup
    //   1908: bipush #31
    //   1910: ldc 16777216
    //   1912: iastore
    //   1913: dup
    //   1914: bipush #32
    //   1916: ldc 65536
    //   1918: iastore
    //   1919: dup
    //   1920: bipush #33
    //   1922: ldc 16843780
    //   1924: iastore
    //   1925: dup
    //   1926: bipush #34
    //   1928: iconst_4
    //   1929: iastore
    //   1930: dup
    //   1931: bipush #35
    //   1933: ldc 16842752
    //   1935: iastore
    //   1936: dup
    //   1937: bipush #36
    //   1939: ldc 16843776
    //   1941: iastore
    //   1942: dup
    //   1943: bipush #37
    //   1945: ldc 16777216
    //   1947: iastore
    //   1948: dup
    //   1949: bipush #38
    //   1951: ldc 16777216
    //   1953: iastore
    //   1954: dup
    //   1955: bipush #39
    //   1957: sipush #1024
    //   1960: iastore
    //   1961: dup
    //   1962: bipush #40
    //   1964: ldc 16842756
    //   1966: iastore
    //   1967: dup
    //   1968: bipush #41
    //   1970: ldc 65536
    //   1972: iastore
    //   1973: dup
    //   1974: bipush #42
    //   1976: ldc 66560
    //   1978: iastore
    //   1979: dup
    //   1980: bipush #43
    //   1982: ldc 16777220
    //   1984: iastore
    //   1985: dup
    //   1986: bipush #44
    //   1988: sipush #1024
    //   1991: iastore
    //   1992: dup
    //   1993: bipush #45
    //   1995: iconst_4
    //   1996: iastore
    //   1997: dup
    //   1998: bipush #46
    //   2000: ldc 16778244
    //   2002: iastore
    //   2003: dup
    //   2004: bipush #47
    //   2006: ldc 66564
    //   2008: iastore
    //   2009: dup
    //   2010: bipush #48
    //   2012: ldc 16843780
    //   2014: iastore
    //   2015: dup
    //   2016: bipush #49
    //   2018: ldc 65540
    //   2020: iastore
    //   2021: dup
    //   2022: bipush #50
    //   2024: ldc 16842752
    //   2026: iastore
    //   2027: dup
    //   2028: bipush #51
    //   2030: ldc 16778244
    //   2032: iastore
    //   2033: dup
    //   2034: bipush #52
    //   2036: ldc 16777220
    //   2038: iastore
    //   2039: dup
    //   2040: bipush #53
    //   2042: sipush #1028
    //   2045: iastore
    //   2046: dup
    //   2047: bipush #54
    //   2049: ldc 66564
    //   2051: iastore
    //   2052: dup
    //   2053: bipush #55
    //   2055: ldc 16843776
    //   2057: iastore
    //   2058: dup
    //   2059: bipush #56
    //   2061: sipush #1028
    //   2064: iastore
    //   2065: dup
    //   2066: bipush #57
    //   2068: ldc 16778240
    //   2070: iastore
    //   2071: dup
    //   2072: bipush #58
    //   2074: ldc 16778240
    //   2076: iastore
    //   2077: dup
    //   2078: bipush #59
    //   2080: iconst_0
    //   2081: iastore
    //   2082: dup
    //   2083: bipush #60
    //   2085: ldc 65540
    //   2087: iastore
    //   2088: dup
    //   2089: bipush #61
    //   2091: ldc 66560
    //   2093: iastore
    //   2094: dup
    //   2095: bipush #62
    //   2097: iconst_0
    //   2098: iastore
    //   2099: dup
    //   2100: bipush #63
    //   2102: ldc 16842756
    //   2104: iastore
    //   2105: astore #8
    //   2107: bipush #64
    //   2109: newarray int
    //   2111: dup
    //   2112: iconst_0
    //   2113: ldc -2146402272
    //   2115: iastore
    //   2116: dup
    //   2117: iconst_1
    //   2118: ldc -2147450880
    //   2120: iastore
    //   2121: dup
    //   2122: iconst_2
    //   2123: ldc 32768
    //   2125: iastore
    //   2126: dup
    //   2127: iconst_3
    //   2128: ldc 1081376
    //   2130: iastore
    //   2131: dup
    //   2132: iconst_4
    //   2133: ldc 1048576
    //   2135: iastore
    //   2136: dup
    //   2137: iconst_5
    //   2138: bipush #32
    //   2140: iastore
    //   2141: dup
    //   2142: bipush #6
    //   2144: ldc -2146435040
    //   2146: iastore
    //   2147: dup
    //   2148: bipush #7
    //   2150: ldc -2147450848
    //   2152: iastore
    //   2153: dup
    //   2154: bipush #8
    //   2156: ldc -2147483616
    //   2158: iastore
    //   2159: dup
    //   2160: bipush #9
    //   2162: ldc -2146402272
    //   2164: iastore
    //   2165: dup
    //   2166: bipush #10
    //   2168: ldc -2146402304
    //   2170: iastore
    //   2171: dup
    //   2172: bipush #11
    //   2174: ldc -2147483648
    //   2176: iastore
    //   2177: dup
    //   2178: bipush #12
    //   2180: ldc -2147450880
    //   2182: iastore
    //   2183: dup
    //   2184: bipush #13
    //   2186: ldc 1048576
    //   2188: iastore
    //   2189: dup
    //   2190: bipush #14
    //   2192: bipush #32
    //   2194: iastore
    //   2195: dup
    //   2196: bipush #15
    //   2198: ldc -2146435040
    //   2200: iastore
    //   2201: dup
    //   2202: bipush #16
    //   2204: ldc 1081344
    //   2206: iastore
    //   2207: dup
    //   2208: bipush #17
    //   2210: ldc 1048608
    //   2212: iastore
    //   2213: dup
    //   2214: bipush #18
    //   2216: ldc -2147450848
    //   2218: iastore
    //   2219: dup
    //   2220: bipush #19
    //   2222: iconst_0
    //   2223: iastore
    //   2224: dup
    //   2225: bipush #20
    //   2227: ldc -2147483648
    //   2229: iastore
    //   2230: dup
    //   2231: bipush #21
    //   2233: ldc 32768
    //   2235: iastore
    //   2236: dup
    //   2237: bipush #22
    //   2239: ldc 1081376
    //   2241: iastore
    //   2242: dup
    //   2243: bipush #23
    //   2245: ldc -2146435072
    //   2247: iastore
    //   2248: dup
    //   2249: bipush #24
    //   2251: ldc 1048608
    //   2253: iastore
    //   2254: dup
    //   2255: bipush #25
    //   2257: ldc -2147483616
    //   2259: iastore
    //   2260: dup
    //   2261: bipush #26
    //   2263: iconst_0
    //   2264: iastore
    //   2265: dup
    //   2266: bipush #27
    //   2268: ldc 1081344
    //   2270: iastore
    //   2271: dup
    //   2272: bipush #28
    //   2274: ldc 32800
    //   2276: iastore
    //   2277: dup
    //   2278: bipush #29
    //   2280: ldc -2146402304
    //   2282: iastore
    //   2283: dup
    //   2284: bipush #30
    //   2286: ldc -2146435072
    //   2288: iastore
    //   2289: dup
    //   2290: bipush #31
    //   2292: ldc 32800
    //   2294: iastore
    //   2295: dup
    //   2296: bipush #32
    //   2298: iconst_0
    //   2299: iastore
    //   2300: dup
    //   2301: bipush #33
    //   2303: ldc 1081376
    //   2305: iastore
    //   2306: dup
    //   2307: bipush #34
    //   2309: ldc -2146435040
    //   2311: iastore
    //   2312: dup
    //   2313: bipush #35
    //   2315: ldc 1048576
    //   2317: iastore
    //   2318: dup
    //   2319: bipush #36
    //   2321: ldc -2147450848
    //   2323: iastore
    //   2324: dup
    //   2325: bipush #37
    //   2327: ldc -2146435072
    //   2329: iastore
    //   2330: dup
    //   2331: bipush #38
    //   2333: ldc -2146402304
    //   2335: iastore
    //   2336: dup
    //   2337: bipush #39
    //   2339: ldc 32768
    //   2341: iastore
    //   2342: dup
    //   2343: bipush #40
    //   2345: ldc -2146435072
    //   2347: iastore
    //   2348: dup
    //   2349: bipush #41
    //   2351: ldc -2147450880
    //   2353: iastore
    //   2354: dup
    //   2355: bipush #42
    //   2357: bipush #32
    //   2359: iastore
    //   2360: dup
    //   2361: bipush #43
    //   2363: ldc -2146402272
    //   2365: iastore
    //   2366: dup
    //   2367: bipush #44
    //   2369: ldc 1081376
    //   2371: iastore
    //   2372: dup
    //   2373: bipush #45
    //   2375: bipush #32
    //   2377: iastore
    //   2378: dup
    //   2379: bipush #46
    //   2381: ldc 32768
    //   2383: iastore
    //   2384: dup
    //   2385: bipush #47
    //   2387: ldc -2147483648
    //   2389: iastore
    //   2390: dup
    //   2391: bipush #48
    //   2393: ldc 32800
    //   2395: iastore
    //   2396: dup
    //   2397: bipush #49
    //   2399: ldc -2146402304
    //   2401: iastore
    //   2402: dup
    //   2403: bipush #50
    //   2405: ldc 1048576
    //   2407: iastore
    //   2408: dup
    //   2409: bipush #51
    //   2411: ldc -2147483616
    //   2413: iastore
    //   2414: dup
    //   2415: bipush #52
    //   2417: ldc 1048608
    //   2419: iastore
    //   2420: dup
    //   2421: bipush #53
    //   2423: ldc -2147450848
    //   2425: iastore
    //   2426: dup
    //   2427: bipush #54
    //   2429: ldc -2147483616
    //   2431: iastore
    //   2432: dup
    //   2433: bipush #55
    //   2435: ldc 1048608
    //   2437: iastore
    //   2438: dup
    //   2439: bipush #56
    //   2441: ldc 1081344
    //   2443: iastore
    //   2444: dup
    //   2445: bipush #57
    //   2447: iconst_0
    //   2448: iastore
    //   2449: dup
    //   2450: bipush #58
    //   2452: ldc -2147450880
    //   2454: iastore
    //   2455: dup
    //   2456: bipush #59
    //   2458: ldc 32800
    //   2460: iastore
    //   2461: dup
    //   2462: bipush #60
    //   2464: ldc -2147483648
    //   2466: iastore
    //   2467: dup
    //   2468: bipush #61
    //   2470: ldc -2146435040
    //   2472: iastore
    //   2473: dup
    //   2474: bipush #62
    //   2476: ldc -2146402272
    //   2478: iastore
    //   2479: dup
    //   2480: bipush #63
    //   2482: ldc 1081344
    //   2484: iastore
    //   2485: astore #9
    //   2487: bipush #64
    //   2489: newarray int
    //   2491: dup
    //   2492: iconst_0
    //   2493: sipush #520
    //   2496: iastore
    //   2497: dup
    //   2498: iconst_1
    //   2499: ldc 134349312
    //   2501: iastore
    //   2502: dup
    //   2503: iconst_2
    //   2504: iconst_0
    //   2505: iastore
    //   2506: dup
    //   2507: iconst_3
    //   2508: ldc 134348808
    //   2510: iastore
    //   2511: dup
    //   2512: iconst_4
    //   2513: ldc 134218240
    //   2515: iastore
    //   2516: dup
    //   2517: iconst_5
    //   2518: iconst_0
    //   2519: iastore
    //   2520: dup
    //   2521: bipush #6
    //   2523: ldc 131592
    //   2525: iastore
    //   2526: dup
    //   2527: bipush #7
    //   2529: ldc 134218240
    //   2531: iastore
    //   2532: dup
    //   2533: bipush #8
    //   2535: ldc 131080
    //   2537: iastore
    //   2538: dup
    //   2539: bipush #9
    //   2541: ldc 134217736
    //   2543: iastore
    //   2544: dup
    //   2545: bipush #10
    //   2547: ldc 134217736
    //   2549: iastore
    //   2550: dup
    //   2551: bipush #11
    //   2553: ldc 131072
    //   2555: iastore
    //   2556: dup
    //   2557: bipush #12
    //   2559: ldc 134349320
    //   2561: iastore
    //   2562: dup
    //   2563: bipush #13
    //   2565: ldc 131080
    //   2567: iastore
    //   2568: dup
    //   2569: bipush #14
    //   2571: ldc 134348800
    //   2573: iastore
    //   2574: dup
    //   2575: bipush #15
    //   2577: sipush #520
    //   2580: iastore
    //   2581: dup
    //   2582: bipush #16
    //   2584: ldc 134217728
    //   2586: iastore
    //   2587: dup
    //   2588: bipush #17
    //   2590: bipush #8
    //   2592: iastore
    //   2593: dup
    //   2594: bipush #18
    //   2596: ldc 134349312
    //   2598: iastore
    //   2599: dup
    //   2600: bipush #19
    //   2602: sipush #512
    //   2605: iastore
    //   2606: dup
    //   2607: bipush #20
    //   2609: ldc 131584
    //   2611: iastore
    //   2612: dup
    //   2613: bipush #21
    //   2615: ldc 134348800
    //   2617: iastore
    //   2618: dup
    //   2619: bipush #22
    //   2621: ldc 134348808
    //   2623: iastore
    //   2624: dup
    //   2625: bipush #23
    //   2627: ldc 131592
    //   2629: iastore
    //   2630: dup
    //   2631: bipush #24
    //   2633: ldc 134218248
    //   2635: iastore
    //   2636: dup
    //   2637: bipush #25
    //   2639: ldc 131584
    //   2641: iastore
    //   2642: dup
    //   2643: bipush #26
    //   2645: ldc 131072
    //   2647: iastore
    //   2648: dup
    //   2649: bipush #27
    //   2651: ldc 134218248
    //   2653: iastore
    //   2654: dup
    //   2655: bipush #28
    //   2657: bipush #8
    //   2659: iastore
    //   2660: dup
    //   2661: bipush #29
    //   2663: ldc 134349320
    //   2665: iastore
    //   2666: dup
    //   2667: bipush #30
    //   2669: sipush #512
    //   2672: iastore
    //   2673: dup
    //   2674: bipush #31
    //   2676: ldc 134217728
    //   2678: iastore
    //   2679: dup
    //   2680: bipush #32
    //   2682: ldc 134349312
    //   2684: iastore
    //   2685: dup
    //   2686: bipush #33
    //   2688: ldc 134217728
    //   2690: iastore
    //   2691: dup
    //   2692: bipush #34
    //   2694: ldc 131080
    //   2696: iastore
    //   2697: dup
    //   2698: bipush #35
    //   2700: sipush #520
    //   2703: iastore
    //   2704: dup
    //   2705: bipush #36
    //   2707: ldc 131072
    //   2709: iastore
    //   2710: dup
    //   2711: bipush #37
    //   2713: ldc 134349312
    //   2715: iastore
    //   2716: dup
    //   2717: bipush #38
    //   2719: ldc 134218240
    //   2721: iastore
    //   2722: dup
    //   2723: bipush #39
    //   2725: iconst_0
    //   2726: iastore
    //   2727: dup
    //   2728: bipush #40
    //   2730: sipush #512
    //   2733: iastore
    //   2734: dup
    //   2735: bipush #41
    //   2737: ldc 131080
    //   2739: iastore
    //   2740: dup
    //   2741: bipush #42
    //   2743: ldc 134349320
    //   2745: iastore
    //   2746: dup
    //   2747: bipush #43
    //   2749: ldc 134218240
    //   2751: iastore
    //   2752: dup
    //   2753: bipush #44
    //   2755: ldc 134217736
    //   2757: iastore
    //   2758: dup
    //   2759: bipush #45
    //   2761: sipush #512
    //   2764: iastore
    //   2765: dup
    //   2766: bipush #46
    //   2768: iconst_0
    //   2769: iastore
    //   2770: dup
    //   2771: bipush #47
    //   2773: ldc 134348808
    //   2775: iastore
    //   2776: dup
    //   2777: bipush #48
    //   2779: ldc 134218248
    //   2781: iastore
    //   2782: dup
    //   2783: bipush #49
    //   2785: ldc 131072
    //   2787: iastore
    //   2788: dup
    //   2789: bipush #50
    //   2791: ldc 134217728
    //   2793: iastore
    //   2794: dup
    //   2795: bipush #51
    //   2797: ldc 134349320
    //   2799: iastore
    //   2800: dup
    //   2801: bipush #52
    //   2803: bipush #8
    //   2805: iastore
    //   2806: dup
    //   2807: bipush #53
    //   2809: ldc 131592
    //   2811: iastore
    //   2812: dup
    //   2813: bipush #54
    //   2815: ldc 131584
    //   2817: iastore
    //   2818: dup
    //   2819: bipush #55
    //   2821: ldc 134217736
    //   2823: iastore
    //   2824: dup
    //   2825: bipush #56
    //   2827: ldc 134348800
    //   2829: iastore
    //   2830: dup
    //   2831: bipush #57
    //   2833: ldc 134218248
    //   2835: iastore
    //   2836: dup
    //   2837: bipush #58
    //   2839: sipush #520
    //   2842: iastore
    //   2843: dup
    //   2844: bipush #59
    //   2846: ldc 134348800
    //   2848: iastore
    //   2849: dup
    //   2850: bipush #60
    //   2852: ldc 131592
    //   2854: iastore
    //   2855: dup
    //   2856: bipush #61
    //   2858: bipush #8
    //   2860: iastore
    //   2861: dup
    //   2862: bipush #62
    //   2864: ldc 134348808
    //   2866: iastore
    //   2867: dup
    //   2868: bipush #63
    //   2870: ldc 131584
    //   2872: iastore
    //   2873: astore #10
    //   2875: bipush #64
    //   2877: newarray int
    //   2879: dup
    //   2880: iconst_0
    //   2881: ldc 8396801
    //   2883: iastore
    //   2884: dup
    //   2885: iconst_1
    //   2886: sipush #8321
    //   2889: iastore
    //   2890: dup
    //   2891: iconst_2
    //   2892: sipush #8321
    //   2895: iastore
    //   2896: dup
    //   2897: iconst_3
    //   2898: sipush #128
    //   2901: iastore
    //   2902: dup
    //   2903: iconst_4
    //   2904: ldc 8396928
    //   2906: iastore
    //   2907: dup
    //   2908: iconst_5
    //   2909: ldc 8388737
    //   2911: iastore
    //   2912: dup
    //   2913: bipush #6
    //   2915: ldc 8388609
    //   2917: iastore
    //   2918: dup
    //   2919: bipush #7
    //   2921: sipush #8193
    //   2924: iastore
    //   2925: dup
    //   2926: bipush #8
    //   2928: iconst_0
    //   2929: iastore
    //   2930: dup
    //   2931: bipush #9
    //   2933: ldc 8396800
    //   2935: iastore
    //   2936: dup
    //   2937: bipush #10
    //   2939: ldc 8396800
    //   2941: iastore
    //   2942: dup
    //   2943: bipush #11
    //   2945: ldc 8396929
    //   2947: iastore
    //   2948: dup
    //   2949: bipush #12
    //   2951: sipush #129
    //   2954: iastore
    //   2955: dup
    //   2956: bipush #13
    //   2958: iconst_0
    //   2959: iastore
    //   2960: dup
    //   2961: bipush #14
    //   2963: ldc 8388736
    //   2965: iastore
    //   2966: dup
    //   2967: bipush #15
    //   2969: ldc 8388609
    //   2971: iastore
    //   2972: dup
    //   2973: bipush #16
    //   2975: iconst_1
    //   2976: iastore
    //   2977: dup
    //   2978: bipush #17
    //   2980: sipush #8192
    //   2983: iastore
    //   2984: dup
    //   2985: bipush #18
    //   2987: ldc 8388608
    //   2989: iastore
    //   2990: dup
    //   2991: bipush #19
    //   2993: ldc 8396801
    //   2995: iastore
    //   2996: dup
    //   2997: bipush #20
    //   2999: sipush #128
    //   3002: iastore
    //   3003: dup
    //   3004: bipush #21
    //   3006: ldc 8388608
    //   3008: iastore
    //   3009: dup
    //   3010: bipush #22
    //   3012: sipush #8193
    //   3015: iastore
    //   3016: dup
    //   3017: bipush #23
    //   3019: sipush #8320
    //   3022: iastore
    //   3023: dup
    //   3024: bipush #24
    //   3026: ldc 8388737
    //   3028: iastore
    //   3029: dup
    //   3030: bipush #25
    //   3032: iconst_1
    //   3033: iastore
    //   3034: dup
    //   3035: bipush #26
    //   3037: sipush #8320
    //   3040: iastore
    //   3041: dup
    //   3042: bipush #27
    //   3044: ldc 8388736
    //   3046: iastore
    //   3047: dup
    //   3048: bipush #28
    //   3050: sipush #8192
    //   3053: iastore
    //   3054: dup
    //   3055: bipush #29
    //   3057: ldc 8396928
    //   3059: iastore
    //   3060: dup
    //   3061: bipush #30
    //   3063: ldc 8396929
    //   3065: iastore
    //   3066: dup
    //   3067: bipush #31
    //   3069: sipush #129
    //   3072: iastore
    //   3073: dup
    //   3074: bipush #32
    //   3076: ldc 8388736
    //   3078: iastore
    //   3079: dup
    //   3080: bipush #33
    //   3082: ldc 8388609
    //   3084: iastore
    //   3085: dup
    //   3086: bipush #34
    //   3088: ldc 8396800
    //   3090: iastore
    //   3091: dup
    //   3092: bipush #35
    //   3094: ldc 8396929
    //   3096: iastore
    //   3097: dup
    //   3098: bipush #36
    //   3100: sipush #129
    //   3103: iastore
    //   3104: dup
    //   3105: bipush #37
    //   3107: iconst_0
    //   3108: iastore
    //   3109: dup
    //   3110: bipush #38
    //   3112: iconst_0
    //   3113: iastore
    //   3114: dup
    //   3115: bipush #39
    //   3117: ldc 8396800
    //   3119: iastore
    //   3120: dup
    //   3121: bipush #40
    //   3123: sipush #8320
    //   3126: iastore
    //   3127: dup
    //   3128: bipush #41
    //   3130: ldc 8388736
    //   3132: iastore
    //   3133: dup
    //   3134: bipush #42
    //   3136: ldc 8388737
    //   3138: iastore
    //   3139: dup
    //   3140: bipush #43
    //   3142: iconst_1
    //   3143: iastore
    //   3144: dup
    //   3145: bipush #44
    //   3147: ldc 8396801
    //   3149: iastore
    //   3150: dup
    //   3151: bipush #45
    //   3153: sipush #8321
    //   3156: iastore
    //   3157: dup
    //   3158: bipush #46
    //   3160: sipush #8321
    //   3163: iastore
    //   3164: dup
    //   3165: bipush #47
    //   3167: sipush #128
    //   3170: iastore
    //   3171: dup
    //   3172: bipush #48
    //   3174: ldc 8396929
    //   3176: iastore
    //   3177: dup
    //   3178: bipush #49
    //   3180: sipush #129
    //   3183: iastore
    //   3184: dup
    //   3185: bipush #50
    //   3187: iconst_1
    //   3188: iastore
    //   3189: dup
    //   3190: bipush #51
    //   3192: sipush #8192
    //   3195: iastore
    //   3196: dup
    //   3197: bipush #52
    //   3199: ldc 8388609
    //   3201: iastore
    //   3202: dup
    //   3203: bipush #53
    //   3205: sipush #8193
    //   3208: iastore
    //   3209: dup
    //   3210: bipush #54
    //   3212: ldc 8396928
    //   3214: iastore
    //   3215: dup
    //   3216: bipush #55
    //   3218: ldc 8388737
    //   3220: iastore
    //   3221: dup
    //   3222: bipush #56
    //   3224: sipush #8193
    //   3227: iastore
    //   3228: dup
    //   3229: bipush #57
    //   3231: sipush #8320
    //   3234: iastore
    //   3235: dup
    //   3236: bipush #58
    //   3238: ldc 8388608
    //   3240: iastore
    //   3241: dup
    //   3242: bipush #59
    //   3244: ldc 8396801
    //   3246: iastore
    //   3247: dup
    //   3248: bipush #60
    //   3250: sipush #128
    //   3253: iastore
    //   3254: dup
    //   3255: bipush #61
    //   3257: ldc 8388608
    //   3259: iastore
    //   3260: dup
    //   3261: bipush #62
    //   3263: sipush #8192
    //   3266: iastore
    //   3267: dup
    //   3268: bipush #63
    //   3270: ldc 8396928
    //   3272: iastore
    //   3273: astore #11
    //   3275: bipush #64
    //   3277: newarray int
    //   3279: dup
    //   3280: iconst_0
    //   3281: sipush #256
    //   3284: iastore
    //   3285: dup
    //   3286: iconst_1
    //   3287: ldc 34078976
    //   3289: iastore
    //   3290: dup
    //   3291: iconst_2
    //   3292: ldc 34078720
    //   3294: iastore
    //   3295: dup
    //   3296: iconst_3
    //   3297: ldc 1107296512
    //   3299: iastore
    //   3300: dup
    //   3301: iconst_4
    //   3302: ldc 524288
    //   3304: iastore
    //   3305: dup
    //   3306: iconst_5
    //   3307: sipush #256
    //   3310: iastore
    //   3311: dup
    //   3312: bipush #6
    //   3314: ldc 1073741824
    //   3316: iastore
    //   3317: dup
    //   3318: bipush #7
    //   3320: ldc 34078720
    //   3322: iastore
    //   3323: dup
    //   3324: bipush #8
    //   3326: ldc 1074266368
    //   3328: iastore
    //   3329: dup
    //   3330: bipush #9
    //   3332: ldc 524288
    //   3334: iastore
    //   3335: dup
    //   3336: bipush #10
    //   3338: ldc 33554688
    //   3340: iastore
    //   3341: dup
    //   3342: bipush #11
    //   3344: ldc 1074266368
    //   3346: iastore
    //   3347: dup
    //   3348: bipush #12
    //   3350: ldc 1107296512
    //   3352: iastore
    //   3353: dup
    //   3354: bipush #13
    //   3356: ldc 1107820544
    //   3358: iastore
    //   3359: dup
    //   3360: bipush #14
    //   3362: ldc 524544
    //   3364: iastore
    //   3365: dup
    //   3366: bipush #15
    //   3368: ldc 1073741824
    //   3370: iastore
    //   3371: dup
    //   3372: bipush #16
    //   3374: ldc 33554432
    //   3376: iastore
    //   3377: dup
    //   3378: bipush #17
    //   3380: ldc 1074266112
    //   3382: iastore
    //   3383: dup
    //   3384: bipush #18
    //   3386: ldc 1074266112
    //   3388: iastore
    //   3389: dup
    //   3390: bipush #19
    //   3392: iconst_0
    //   3393: iastore
    //   3394: dup
    //   3395: bipush #20
    //   3397: ldc 1073742080
    //   3399: iastore
    //   3400: dup
    //   3401: bipush #21
    //   3403: ldc 1107820800
    //   3405: iastore
    //   3406: dup
    //   3407: bipush #22
    //   3409: ldc 1107820800
    //   3411: iastore
    //   3412: dup
    //   3413: bipush #23
    //   3415: ldc 33554688
    //   3417: iastore
    //   3418: dup
    //   3419: bipush #24
    //   3421: ldc 1107820544
    //   3423: iastore
    //   3424: dup
    //   3425: bipush #25
    //   3427: ldc 1073742080
    //   3429: iastore
    //   3430: dup
    //   3431: bipush #26
    //   3433: iconst_0
    //   3434: iastore
    //   3435: dup
    //   3436: bipush #27
    //   3438: ldc 1107296256
    //   3440: iastore
    //   3441: dup
    //   3442: bipush #28
    //   3444: ldc 34078976
    //   3446: iastore
    //   3447: dup
    //   3448: bipush #29
    //   3450: ldc 33554432
    //   3452: iastore
    //   3453: dup
    //   3454: bipush #30
    //   3456: ldc 1107296256
    //   3458: iastore
    //   3459: dup
    //   3460: bipush #31
    //   3462: ldc 524544
    //   3464: iastore
    //   3465: dup
    //   3466: bipush #32
    //   3468: ldc 524288
    //   3470: iastore
    //   3471: dup
    //   3472: bipush #33
    //   3474: ldc 1107296512
    //   3476: iastore
    //   3477: dup
    //   3478: bipush #34
    //   3480: sipush #256
    //   3483: iastore
    //   3484: dup
    //   3485: bipush #35
    //   3487: ldc 33554432
    //   3489: iastore
    //   3490: dup
    //   3491: bipush #36
    //   3493: ldc 1073741824
    //   3495: iastore
    //   3496: dup
    //   3497: bipush #37
    //   3499: ldc 34078720
    //   3501: iastore
    //   3502: dup
    //   3503: bipush #38
    //   3505: ldc 1107296512
    //   3507: iastore
    //   3508: dup
    //   3509: bipush #39
    //   3511: ldc 1074266368
    //   3513: iastore
    //   3514: dup
    //   3515: bipush #40
    //   3517: ldc 33554688
    //   3519: iastore
    //   3520: dup
    //   3521: bipush #41
    //   3523: ldc 1073741824
    //   3525: iastore
    //   3526: dup
    //   3527: bipush #42
    //   3529: ldc 1107820544
    //   3531: iastore
    //   3532: dup
    //   3533: bipush #43
    //   3535: ldc 34078976
    //   3537: iastore
    //   3538: dup
    //   3539: bipush #44
    //   3541: ldc 1074266368
    //   3543: iastore
    //   3544: dup
    //   3545: bipush #45
    //   3547: sipush #256
    //   3550: iastore
    //   3551: dup
    //   3552: bipush #46
    //   3554: ldc 33554432
    //   3556: iastore
    //   3557: dup
    //   3558: bipush #47
    //   3560: ldc 1107820544
    //   3562: iastore
    //   3563: dup
    //   3564: bipush #48
    //   3566: ldc 1107820800
    //   3568: iastore
    //   3569: dup
    //   3570: bipush #49
    //   3572: ldc 524544
    //   3574: iastore
    //   3575: dup
    //   3576: bipush #50
    //   3578: ldc 1107296256
    //   3580: iastore
    //   3581: dup
    //   3582: bipush #51
    //   3584: ldc 1107820800
    //   3586: iastore
    //   3587: dup
    //   3588: bipush #52
    //   3590: ldc 34078720
    //   3592: iastore
    //   3593: dup
    //   3594: bipush #53
    //   3596: iconst_0
    //   3597: iastore
    //   3598: dup
    //   3599: bipush #54
    //   3601: ldc 1074266112
    //   3603: iastore
    //   3604: dup
    //   3605: bipush #55
    //   3607: ldc 1107296256
    //   3609: iastore
    //   3610: dup
    //   3611: bipush #56
    //   3613: ldc 524544
    //   3615: iastore
    //   3616: dup
    //   3617: bipush #57
    //   3619: ldc 33554688
    //   3621: iastore
    //   3622: dup
    //   3623: bipush #58
    //   3625: ldc 1073742080
    //   3627: iastore
    //   3628: dup
    //   3629: bipush #59
    //   3631: ldc 524288
    //   3633: iastore
    //   3634: dup
    //   3635: bipush #60
    //   3637: iconst_0
    //   3638: iastore
    //   3639: dup
    //   3640: bipush #61
    //   3642: ldc 1074266112
    //   3644: iastore
    //   3645: dup
    //   3646: bipush #62
    //   3648: ldc 34078976
    //   3650: iastore
    //   3651: dup
    //   3652: bipush #63
    //   3654: ldc 1073742080
    //   3656: iastore
    //   3657: astore #12
    //   3659: bipush #64
    //   3661: newarray int
    //   3663: dup
    //   3664: iconst_0
    //   3665: ldc 536870928
    //   3667: iastore
    //   3668: dup
    //   3669: iconst_1
    //   3670: ldc 541065216
    //   3672: iastore
    //   3673: dup
    //   3674: iconst_2
    //   3675: sipush #16384
    //   3678: iastore
    //   3679: dup
    //   3680: iconst_3
    //   3681: ldc 541081616
    //   3683: iastore
    //   3684: dup
    //   3685: iconst_4
    //   3686: ldc 541065216
    //   3688: iastore
    //   3689: dup
    //   3690: iconst_5
    //   3691: bipush #16
    //   3693: iastore
    //   3694: dup
    //   3695: bipush #6
    //   3697: ldc 541081616
    //   3699: iastore
    //   3700: dup
    //   3701: bipush #7
    //   3703: ldc 4194304
    //   3705: iastore
    //   3706: dup
    //   3707: bipush #8
    //   3709: ldc 536887296
    //   3711: iastore
    //   3712: dup
    //   3713: bipush #9
    //   3715: ldc 4210704
    //   3717: iastore
    //   3718: dup
    //   3719: bipush #10
    //   3721: ldc 4194304
    //   3723: iastore
    //   3724: dup
    //   3725: bipush #11
    //   3727: ldc 536870928
    //   3729: iastore
    //   3730: dup
    //   3731: bipush #12
    //   3733: ldc 4194320
    //   3735: iastore
    //   3736: dup
    //   3737: bipush #13
    //   3739: ldc 536887296
    //   3741: iastore
    //   3742: dup
    //   3743: bipush #14
    //   3745: ldc 536870912
    //   3747: iastore
    //   3748: dup
    //   3749: bipush #15
    //   3751: sipush #16400
    //   3754: iastore
    //   3755: dup
    //   3756: bipush #16
    //   3758: iconst_0
    //   3759: iastore
    //   3760: dup
    //   3761: bipush #17
    //   3763: ldc 4194320
    //   3765: iastore
    //   3766: dup
    //   3767: bipush #18
    //   3769: ldc 536887312
    //   3771: iastore
    //   3772: dup
    //   3773: bipush #19
    //   3775: sipush #16384
    //   3778: iastore
    //   3779: dup
    //   3780: bipush #20
    //   3782: ldc 4210688
    //   3784: iastore
    //   3785: dup
    //   3786: bipush #21
    //   3788: ldc 536887312
    //   3790: iastore
    //   3791: dup
    //   3792: bipush #22
    //   3794: bipush #16
    //   3796: iastore
    //   3797: dup
    //   3798: bipush #23
    //   3800: ldc 541065232
    //   3802: iastore
    //   3803: dup
    //   3804: bipush #24
    //   3806: ldc 541065232
    //   3808: iastore
    //   3809: dup
    //   3810: bipush #25
    //   3812: iconst_0
    //   3813: iastore
    //   3814: dup
    //   3815: bipush #26
    //   3817: ldc 4210704
    //   3819: iastore
    //   3820: dup
    //   3821: bipush #27
    //   3823: ldc 541081600
    //   3825: iastore
    //   3826: dup
    //   3827: bipush #28
    //   3829: sipush #16400
    //   3832: iastore
    //   3833: dup
    //   3834: bipush #29
    //   3836: ldc 4210688
    //   3838: iastore
    //   3839: dup
    //   3840: bipush #30
    //   3842: ldc 541081600
    //   3844: iastore
    //   3845: dup
    //   3846: bipush #31
    //   3848: ldc 536870912
    //   3850: iastore
    //   3851: dup
    //   3852: bipush #32
    //   3854: ldc 536887296
    //   3856: iastore
    //   3857: dup
    //   3858: bipush #33
    //   3860: bipush #16
    //   3862: iastore
    //   3863: dup
    //   3864: bipush #34
    //   3866: ldc 541065232
    //   3868: iastore
    //   3869: dup
    //   3870: bipush #35
    //   3872: ldc 4210688
    //   3874: iastore
    //   3875: dup
    //   3876: bipush #36
    //   3878: ldc 541081616
    //   3880: iastore
    //   3881: dup
    //   3882: bipush #37
    //   3884: ldc 4194304
    //   3886: iastore
    //   3887: dup
    //   3888: bipush #38
    //   3890: sipush #16400
    //   3893: iastore
    //   3894: dup
    //   3895: bipush #39
    //   3897: ldc 536870928
    //   3899: iastore
    //   3900: dup
    //   3901: bipush #40
    //   3903: ldc 4194304
    //   3905: iastore
    //   3906: dup
    //   3907: bipush #41
    //   3909: ldc 536887296
    //   3911: iastore
    //   3912: dup
    //   3913: bipush #42
    //   3915: ldc 536870912
    //   3917: iastore
    //   3918: dup
    //   3919: bipush #43
    //   3921: sipush #16400
    //   3924: iastore
    //   3925: dup
    //   3926: bipush #44
    //   3928: ldc 536870928
    //   3930: iastore
    //   3931: dup
    //   3932: bipush #45
    //   3934: ldc 541081616
    //   3936: iastore
    //   3937: dup
    //   3938: bipush #46
    //   3940: ldc 4210688
    //   3942: iastore
    //   3943: dup
    //   3944: bipush #47
    //   3946: ldc 541065216
    //   3948: iastore
    //   3949: dup
    //   3950: bipush #48
    //   3952: ldc 4210704
    //   3954: iastore
    //   3955: dup
    //   3956: bipush #49
    //   3958: ldc 541081600
    //   3960: iastore
    //   3961: dup
    //   3962: bipush #50
    //   3964: iconst_0
    //   3965: iastore
    //   3966: dup
    //   3967: bipush #51
    //   3969: ldc 541065232
    //   3971: iastore
    //   3972: dup
    //   3973: bipush #52
    //   3975: bipush #16
    //   3977: iastore
    //   3978: dup
    //   3979: bipush #53
    //   3981: sipush #16384
    //   3984: iastore
    //   3985: dup
    //   3986: bipush #54
    //   3988: ldc 541065216
    //   3990: iastore
    //   3991: dup
    //   3992: bipush #55
    //   3994: ldc 4210704
    //   3996: iastore
    //   3997: dup
    //   3998: bipush #56
    //   4000: sipush #16384
    //   4003: iastore
    //   4004: dup
    //   4005: bipush #57
    //   4007: ldc 4194320
    //   4009: iastore
    //   4010: dup
    //   4011: bipush #58
    //   4013: ldc 536887312
    //   4015: iastore
    //   4016: dup
    //   4017: bipush #59
    //   4019: iconst_0
    //   4020: iastore
    //   4021: dup
    //   4022: bipush #60
    //   4024: ldc 541081600
    //   4026: iastore
    //   4027: dup
    //   4028: bipush #61
    //   4030: ldc 536870912
    //   4032: iastore
    //   4033: dup
    //   4034: bipush #62
    //   4036: ldc 4194320
    //   4038: iastore
    //   4039: dup
    //   4040: bipush #63
    //   4042: ldc 536887312
    //   4044: iastore
    //   4045: astore #13
    //   4047: bipush #64
    //   4049: newarray int
    //   4051: dup
    //   4052: iconst_0
    //   4053: ldc 2097152
    //   4055: iastore
    //   4056: dup
    //   4057: iconst_1
    //   4058: ldc 69206018
    //   4060: iastore
    //   4061: dup
    //   4062: iconst_2
    //   4063: ldc 67110914
    //   4065: iastore
    //   4066: dup
    //   4067: iconst_3
    //   4068: iconst_0
    //   4069: iastore
    //   4070: dup
    //   4071: iconst_4
    //   4072: sipush #2048
    //   4075: iastore
    //   4076: dup
    //   4077: iconst_5
    //   4078: ldc 67110914
    //   4080: iastore
    //   4081: dup
    //   4082: bipush #6
    //   4084: ldc 2099202
    //   4086: iastore
    //   4087: dup
    //   4088: bipush #7
    //   4090: ldc 69208064
    //   4092: iastore
    //   4093: dup
    //   4094: bipush #8
    //   4096: ldc 69208066
    //   4098: iastore
    //   4099: dup
    //   4100: bipush #9
    //   4102: ldc 2097152
    //   4104: iastore
    //   4105: dup
    //   4106: bipush #10
    //   4108: iconst_0
    //   4109: iastore
    //   4110: dup
    //   4111: bipush #11
    //   4113: ldc 67108866
    //   4115: iastore
    //   4116: dup
    //   4117: bipush #12
    //   4119: iconst_2
    //   4120: iastore
    //   4121: dup
    //   4122: bipush #13
    //   4124: ldc 67108864
    //   4126: iastore
    //   4127: dup
    //   4128: bipush #14
    //   4130: ldc 69206018
    //   4132: iastore
    //   4133: dup
    //   4134: bipush #15
    //   4136: sipush #2050
    //   4139: iastore
    //   4140: dup
    //   4141: bipush #16
    //   4143: ldc 67110912
    //   4145: iastore
    //   4146: dup
    //   4147: bipush #17
    //   4149: ldc 2099202
    //   4151: iastore
    //   4152: dup
    //   4153: bipush #18
    //   4155: ldc 2097154
    //   4157: iastore
    //   4158: dup
    //   4159: bipush #19
    //   4161: ldc 67110912
    //   4163: iastore
    //   4164: dup
    //   4165: bipush #20
    //   4167: ldc 67108866
    //   4169: iastore
    //   4170: dup
    //   4171: bipush #21
    //   4173: ldc 69206016
    //   4175: iastore
    //   4176: dup
    //   4177: bipush #22
    //   4179: ldc 69208064
    //   4181: iastore
    //   4182: dup
    //   4183: bipush #23
    //   4185: ldc 2097154
    //   4187: iastore
    //   4188: dup
    //   4189: bipush #24
    //   4191: ldc 69206016
    //   4193: iastore
    //   4194: dup
    //   4195: bipush #25
    //   4197: sipush #2048
    //   4200: iastore
    //   4201: dup
    //   4202: bipush #26
    //   4204: sipush #2050
    //   4207: iastore
    //   4208: dup
    //   4209: bipush #27
    //   4211: ldc 69208066
    //   4213: iastore
    //   4214: dup
    //   4215: bipush #28
    //   4217: ldc 2099200
    //   4219: iastore
    //   4220: dup
    //   4221: bipush #29
    //   4223: iconst_2
    //   4224: iastore
    //   4225: dup
    //   4226: bipush #30
    //   4228: ldc 67108864
    //   4230: iastore
    //   4231: dup
    //   4232: bipush #31
    //   4234: ldc 2099200
    //   4236: iastore
    //   4237: dup
    //   4238: bipush #32
    //   4240: ldc 67108864
    //   4242: iastore
    //   4243: dup
    //   4244: bipush #33
    //   4246: ldc 2099200
    //   4248: iastore
    //   4249: dup
    //   4250: bipush #34
    //   4252: ldc 2097152
    //   4254: iastore
    //   4255: dup
    //   4256: bipush #35
    //   4258: ldc 67110914
    //   4260: iastore
    //   4261: dup
    //   4262: bipush #36
    //   4264: ldc 67110914
    //   4266: iastore
    //   4267: dup
    //   4268: bipush #37
    //   4270: ldc 69206018
    //   4272: iastore
    //   4273: dup
    //   4274: bipush #38
    //   4276: ldc 69206018
    //   4278: iastore
    //   4279: dup
    //   4280: bipush #39
    //   4282: iconst_2
    //   4283: iastore
    //   4284: dup
    //   4285: bipush #40
    //   4287: ldc 2097154
    //   4289: iastore
    //   4290: dup
    //   4291: bipush #41
    //   4293: ldc 67108864
    //   4295: iastore
    //   4296: dup
    //   4297: bipush #42
    //   4299: ldc 67110912
    //   4301: iastore
    //   4302: dup
    //   4303: bipush #43
    //   4305: ldc 2097152
    //   4307: iastore
    //   4308: dup
    //   4309: bipush #44
    //   4311: ldc 69208064
    //   4313: iastore
    //   4314: dup
    //   4315: bipush #45
    //   4317: sipush #2050
    //   4320: iastore
    //   4321: dup
    //   4322: bipush #46
    //   4324: ldc 2099202
    //   4326: iastore
    //   4327: dup
    //   4328: bipush #47
    //   4330: ldc 69208064
    //   4332: iastore
    //   4333: dup
    //   4334: bipush #48
    //   4336: sipush #2050
    //   4339: iastore
    //   4340: dup
    //   4341: bipush #49
    //   4343: ldc 67108866
    //   4345: iastore
    //   4346: dup
    //   4347: bipush #50
    //   4349: ldc 69208066
    //   4351: iastore
    //   4352: dup
    //   4353: bipush #51
    //   4355: ldc 69206016
    //   4357: iastore
    //   4358: dup
    //   4359: bipush #52
    //   4361: ldc 2099200
    //   4363: iastore
    //   4364: dup
    //   4365: bipush #53
    //   4367: iconst_0
    //   4368: iastore
    //   4369: dup
    //   4370: bipush #54
    //   4372: iconst_2
    //   4373: iastore
    //   4374: dup
    //   4375: bipush #55
    //   4377: ldc 69208066
    //   4379: iastore
    //   4380: dup
    //   4381: bipush #56
    //   4383: iconst_0
    //   4384: iastore
    //   4385: dup
    //   4386: bipush #57
    //   4388: ldc 2099202
    //   4390: iastore
    //   4391: dup
    //   4392: bipush #58
    //   4394: ldc 69206016
    //   4396: iastore
    //   4397: dup
    //   4398: bipush #59
    //   4400: sipush #2048
    //   4403: iastore
    //   4404: dup
    //   4405: bipush #60
    //   4407: ldc 67108866
    //   4409: iastore
    //   4410: dup
    //   4411: bipush #61
    //   4413: ldc 67110912
    //   4415: iastore
    //   4416: dup
    //   4417: bipush #62
    //   4419: sipush #2048
    //   4422: iastore
    //   4423: dup
    //   4424: bipush #63
    //   4426: ldc 2097154
    //   4428: iastore
    //   4429: astore #14
    //   4431: bipush #64
    //   4433: newarray int
    //   4435: dup
    //   4436: iconst_0
    //   4437: ldc 268439616
    //   4439: iastore
    //   4440: dup
    //   4441: iconst_1
    //   4442: sipush #4096
    //   4445: iastore
    //   4446: dup
    //   4447: iconst_2
    //   4448: ldc 262144
    //   4450: iastore
    //   4451: dup
    //   4452: iconst_3
    //   4453: ldc 268701760
    //   4455: iastore
    //   4456: dup
    //   4457: iconst_4
    //   4458: ldc 268435456
    //   4460: iastore
    //   4461: dup
    //   4462: iconst_5
    //   4463: ldc 268439616
    //   4465: iastore
    //   4466: dup
    //   4467: bipush #6
    //   4469: bipush #64
    //   4471: iastore
    //   4472: dup
    //   4473: bipush #7
    //   4475: ldc 268435456
    //   4477: iastore
    //   4478: dup
    //   4479: bipush #8
    //   4481: ldc 262208
    //   4483: iastore
    //   4484: dup
    //   4485: bipush #9
    //   4487: ldc 268697600
    //   4489: iastore
    //   4490: dup
    //   4491: bipush #10
    //   4493: ldc 268701760
    //   4495: iastore
    //   4496: dup
    //   4497: bipush #11
    //   4499: ldc 266240
    //   4501: iastore
    //   4502: dup
    //   4503: bipush #12
    //   4505: ldc 268701696
    //   4507: iastore
    //   4508: dup
    //   4509: bipush #13
    //   4511: ldc 266304
    //   4513: iastore
    //   4514: dup
    //   4515: bipush #14
    //   4517: sipush #4096
    //   4520: iastore
    //   4521: dup
    //   4522: bipush #15
    //   4524: bipush #64
    //   4526: iastore
    //   4527: dup
    //   4528: bipush #16
    //   4530: ldc 268697600
    //   4532: iastore
    //   4533: dup
    //   4534: bipush #17
    //   4536: ldc 268435520
    //   4538: iastore
    //   4539: dup
    //   4540: bipush #18
    //   4542: ldc 268439552
    //   4544: iastore
    //   4545: dup
    //   4546: bipush #19
    //   4548: sipush #4160
    //   4551: iastore
    //   4552: dup
    //   4553: bipush #20
    //   4555: ldc 266240
    //   4557: iastore
    //   4558: dup
    //   4559: bipush #21
    //   4561: ldc 262208
    //   4563: iastore
    //   4564: dup
    //   4565: bipush #22
    //   4567: ldc 268697664
    //   4569: iastore
    //   4570: dup
    //   4571: bipush #23
    //   4573: ldc 268701696
    //   4575: iastore
    //   4576: dup
    //   4577: bipush #24
    //   4579: sipush #4160
    //   4582: iastore
    //   4583: dup
    //   4584: bipush #25
    //   4586: iconst_0
    //   4587: iastore
    //   4588: dup
    //   4589: bipush #26
    //   4591: iconst_0
    //   4592: iastore
    //   4593: dup
    //   4594: bipush #27
    //   4596: ldc 268697664
    //   4598: iastore
    //   4599: dup
    //   4600: bipush #28
    //   4602: ldc 268435520
    //   4604: iastore
    //   4605: dup
    //   4606: bipush #29
    //   4608: ldc 268439552
    //   4610: iastore
    //   4611: dup
    //   4612: bipush #30
    //   4614: ldc 266304
    //   4616: iastore
    //   4617: dup
    //   4618: bipush #31
    //   4620: ldc 262144
    //   4622: iastore
    //   4623: dup
    //   4624: bipush #32
    //   4626: ldc 266304
    //   4628: iastore
    //   4629: dup
    //   4630: bipush #33
    //   4632: ldc 262144
    //   4634: iastore
    //   4635: dup
    //   4636: bipush #34
    //   4638: ldc 268701696
    //   4640: iastore
    //   4641: dup
    //   4642: bipush #35
    //   4644: sipush #4096
    //   4647: iastore
    //   4648: dup
    //   4649: bipush #36
    //   4651: bipush #64
    //   4653: iastore
    //   4654: dup
    //   4655: bipush #37
    //   4657: ldc 268697664
    //   4659: iastore
    //   4660: dup
    //   4661: bipush #38
    //   4663: sipush #4096
    //   4666: iastore
    //   4667: dup
    //   4668: bipush #39
    //   4670: ldc 266304
    //   4672: iastore
    //   4673: dup
    //   4674: bipush #40
    //   4676: ldc 268439552
    //   4678: iastore
    //   4679: dup
    //   4680: bipush #41
    //   4682: bipush #64
    //   4684: iastore
    //   4685: dup
    //   4686: bipush #42
    //   4688: ldc 268435520
    //   4690: iastore
    //   4691: dup
    //   4692: bipush #43
    //   4694: ldc 268697600
    //   4696: iastore
    //   4697: dup
    //   4698: bipush #44
    //   4700: ldc 268697664
    //   4702: iastore
    //   4703: dup
    //   4704: bipush #45
    //   4706: ldc 268435456
    //   4708: iastore
    //   4709: dup
    //   4710: bipush #46
    //   4712: ldc 262144
    //   4714: iastore
    //   4715: dup
    //   4716: bipush #47
    //   4718: ldc 268439616
    //   4720: iastore
    //   4721: dup
    //   4722: bipush #48
    //   4724: iconst_0
    //   4725: iastore
    //   4726: dup
    //   4727: bipush #49
    //   4729: ldc 268701760
    //   4731: iastore
    //   4732: dup
    //   4733: bipush #50
    //   4735: ldc 262208
    //   4737: iastore
    //   4738: dup
    //   4739: bipush #51
    //   4741: ldc 268435520
    //   4743: iastore
    //   4744: dup
    //   4745: bipush #52
    //   4747: ldc 268697600
    //   4749: iastore
    //   4750: dup
    //   4751: bipush #53
    //   4753: ldc 268439552
    //   4755: iastore
    //   4756: dup
    //   4757: bipush #54
    //   4759: ldc 268439616
    //   4761: iastore
    //   4762: dup
    //   4763: bipush #55
    //   4765: iconst_0
    //   4766: iastore
    //   4767: dup
    //   4768: bipush #56
    //   4770: ldc 268701760
    //   4772: iastore
    //   4773: dup
    //   4774: bipush #57
    //   4776: ldc 266240
    //   4778: iastore
    //   4779: dup
    //   4780: bipush #58
    //   4782: ldc 266240
    //   4784: iastore
    //   4785: dup
    //   4786: bipush #59
    //   4788: sipush #4160
    //   4791: iastore
    //   4792: dup
    //   4793: bipush #60
    //   4795: sipush #4160
    //   4798: iastore
    //   4799: dup
    //   4800: bipush #61
    //   4802: ldc 262208
    //   4804: iastore
    //   4805: dup
    //   4806: bipush #62
    //   4808: ldc 268435456
    //   4810: iastore
    //   4811: dup
    //   4812: bipush #63
    //   4814: ldc 268701696
    //   4816: iastore
    //   4817: astore #15
    //   4819: aload_3
    //   4820: arraylength
    //   4821: istore #16
    //   4823: iconst_2
    //   4824: newarray int
    //   4826: astore #17
    //   4828: iload #16
    //   4830: newarray byte
    //   4832: astore #4
    //   4834: iload #16
    //   4836: bipush #8
    //   4838: idiv
    //   4839: istore #18
    //   4841: iconst_0
    //   4842: istore #19
    //   4844: iload #19
    //   4846: iload #18
    //   4848: if_icmpge -> 5762
    //   4851: iload #19
    //   4853: bipush #8
    //   4855: imul
    //   4856: istore #20
    //   4858: iconst_0
    //   4859: istore #21
    //   4861: iload #21
    //   4863: iconst_2
    //   4864: if_icmpge -> 4949
    //   4867: aload #17
    //   4869: iload #21
    //   4871: aload_3
    //   4872: iload #20
    //   4874: iload #21
    //   4876: iconst_4
    //   4877: imul
    //   4878: iadd
    //   4879: baload
    //   4880: sipush #255
    //   4883: iand
    //   4884: bipush #24
    //   4886: ishl
    //   4887: aload_3
    //   4888: iload #20
    //   4890: iload #21
    //   4892: iconst_4
    //   4893: imul
    //   4894: iadd
    //   4895: iconst_1
    //   4896: iadd
    //   4897: baload
    //   4898: sipush #255
    //   4901: iand
    //   4902: bipush #16
    //   4904: ishl
    //   4905: ior
    //   4906: aload_3
    //   4907: iload #20
    //   4909: iload #21
    //   4911: iconst_4
    //   4912: imul
    //   4913: iadd
    //   4914: iconst_2
    //   4915: iadd
    //   4916: baload
    //   4917: sipush #255
    //   4920: iand
    //   4921: bipush #8
    //   4923: ishl
    //   4924: ior
    //   4925: aload_3
    //   4926: iload #20
    //   4928: iload #21
    //   4930: iconst_4
    //   4931: imul
    //   4932: iadd
    //   4933: iconst_3
    //   4934: iadd
    //   4935: baload
    //   4936: sipush #255
    //   4939: iand
    //   4940: ior
    //   4941: iastore
    //   4942: iinc #21, 1
    //   4945: iload_2
    //   4946: ifeq -> 4861
    //   4949: iconst_0
    //   4950: istore #26
    //   4952: aload #17
    //   4954: iconst_0
    //   4955: iaload
    //   4956: istore #24
    //   4958: aload #17
    //   4960: iconst_1
    //   4961: iaload
    //   4962: istore #23
    //   4964: iload #24
    //   4966: iconst_4
    //   4967: iushr
    //   4968: iload #23
    //   4970: ixor
    //   4971: ldc 252645135
    //   4973: iand
    //   4974: istore #22
    //   4976: iload #23
    //   4978: iload #22
    //   4980: ixor
    //   4981: istore #23
    //   4983: iload #24
    //   4985: iload #22
    //   4987: iconst_4
    //   4988: ishl
    //   4989: ixor
    //   4990: istore #24
    //   4992: iload #24
    //   4994: bipush #16
    //   4996: iushr
    //   4997: iload #23
    //   4999: ixor
    //   5000: ldc 65535
    //   5002: iand
    //   5003: istore #22
    //   5005: iload #23
    //   5007: iload #22
    //   5009: ixor
    //   5010: istore #23
    //   5012: iload #24
    //   5014: iload #22
    //   5016: bipush #16
    //   5018: ishl
    //   5019: ixor
    //   5020: istore #24
    //   5022: iload #23
    //   5024: iconst_2
    //   5025: iushr
    //   5026: iload #24
    //   5028: ixor
    //   5029: ldc 858993459
    //   5031: iand
    //   5032: istore #22
    //   5034: iload #24
    //   5036: iload #22
    //   5038: ixor
    //   5039: istore #24
    //   5041: iload #23
    //   5043: iload #22
    //   5045: iconst_2
    //   5046: ishl
    //   5047: ixor
    //   5048: istore #23
    //   5050: iload #23
    //   5052: bipush #8
    //   5054: iushr
    //   5055: iload #24
    //   5057: ixor
    //   5058: ldc 16711935
    //   5060: iand
    //   5061: istore #22
    //   5063: iload #24
    //   5065: iload #22
    //   5067: ixor
    //   5068: istore #24
    //   5070: iload #23
    //   5072: iload #22
    //   5074: bipush #8
    //   5076: ishl
    //   5077: ixor
    //   5078: istore #23
    //   5080: iload #23
    //   5082: iconst_1
    //   5083: ishl
    //   5084: iload #23
    //   5086: bipush #31
    //   5088: iushr
    //   5089: iconst_1
    //   5090: iand
    //   5091: ior
    //   5092: istore #23
    //   5094: iload #24
    //   5096: iload #23
    //   5098: ixor
    //   5099: ldc -1431655766
    //   5101: iand
    //   5102: istore #22
    //   5104: iload #24
    //   5106: iload #22
    //   5108: ixor
    //   5109: istore #24
    //   5111: iload #23
    //   5113: iload #22
    //   5115: ixor
    //   5116: istore #23
    //   5118: iload #24
    //   5120: iconst_1
    //   5121: ishl
    //   5122: iload #24
    //   5124: bipush #31
    //   5126: iushr
    //   5127: iconst_1
    //   5128: iand
    //   5129: ior
    //   5130: istore #24
    //   5132: iconst_0
    //   5133: istore #25
    //   5135: iload #25
    //   5137: bipush #8
    //   5139: if_icmpge -> 5477
    //   5142: iload #23
    //   5144: bipush #28
    //   5146: ishl
    //   5147: iload #23
    //   5149: iconst_4
    //   5150: iushr
    //   5151: ior
    //   5152: istore #22
    //   5154: iload #22
    //   5156: aload #5
    //   5158: iload #26
    //   5160: iinc #26, 1
    //   5163: iaload
    //   5164: ixor
    //   5165: istore #22
    //   5167: aload #14
    //   5169: iload #22
    //   5171: bipush #63
    //   5173: iand
    //   5174: iaload
    //   5175: istore #21
    //   5177: iload #21
    //   5179: aload #12
    //   5181: iload #22
    //   5183: bipush #8
    //   5185: iushr
    //   5186: bipush #63
    //   5188: iand
    //   5189: iaload
    //   5190: ior
    //   5191: istore #21
    //   5193: iload #21
    //   5195: aload #10
    //   5197: iload #22
    //   5199: bipush #16
    //   5201: iushr
    //   5202: bipush #63
    //   5204: iand
    //   5205: iaload
    //   5206: ior
    //   5207: istore #21
    //   5209: iload #21
    //   5211: aload #8
    //   5213: iload #22
    //   5215: bipush #24
    //   5217: iushr
    //   5218: bipush #63
    //   5220: iand
    //   5221: iaload
    //   5222: ior
    //   5223: istore #21
    //   5225: iload #23
    //   5227: aload #5
    //   5229: iload #26
    //   5231: iinc #26, 1
    //   5234: iaload
    //   5235: ixor
    //   5236: istore #22
    //   5238: iload #21
    //   5240: aload #15
    //   5242: iload #22
    //   5244: bipush #63
    //   5246: iand
    //   5247: iaload
    //   5248: ior
    //   5249: istore #21
    //   5251: iload #21
    //   5253: aload #13
    //   5255: iload #22
    //   5257: bipush #8
    //   5259: iushr
    //   5260: bipush #63
    //   5262: iand
    //   5263: iaload
    //   5264: ior
    //   5265: istore #21
    //   5267: iload #21
    //   5269: aload #11
    //   5271: iload #22
    //   5273: bipush #16
    //   5275: iushr
    //   5276: bipush #63
    //   5278: iand
    //   5279: iaload
    //   5280: ior
    //   5281: istore #21
    //   5283: iload #21
    //   5285: aload #9
    //   5287: iload #22
    //   5289: bipush #24
    //   5291: iushr
    //   5292: bipush #63
    //   5294: iand
    //   5295: iaload
    //   5296: ior
    //   5297: istore #21
    //   5299: iload #24
    //   5301: iload #21
    //   5303: ixor
    //   5304: istore #24
    //   5306: iload #24
    //   5308: bipush #28
    //   5310: ishl
    //   5311: iload #24
    //   5313: iconst_4
    //   5314: iushr
    //   5315: ior
    //   5316: istore #22
    //   5318: iload #22
    //   5320: aload #5
    //   5322: iload #26
    //   5324: iinc #26, 1
    //   5327: iaload
    //   5328: ixor
    //   5329: istore #22
    //   5331: aload #14
    //   5333: iload #22
    //   5335: bipush #63
    //   5337: iand
    //   5338: iaload
    //   5339: istore #21
    //   5341: iload #21
    //   5343: aload #12
    //   5345: iload #22
    //   5347: bipush #8
    //   5349: iushr
    //   5350: bipush #63
    //   5352: iand
    //   5353: iaload
    //   5354: ior
    //   5355: istore #21
    //   5357: iload #21
    //   5359: aload #10
    //   5361: iload #22
    //   5363: bipush #16
    //   5365: iushr
    //   5366: bipush #63
    //   5368: iand
    //   5369: iaload
    //   5370: ior
    //   5371: istore #21
    //   5373: iload #21
    //   5375: aload #8
    //   5377: iload #22
    //   5379: bipush #24
    //   5381: iushr
    //   5382: bipush #63
    //   5384: iand
    //   5385: iaload
    //   5386: ior
    //   5387: istore #21
    //   5389: iload #24
    //   5391: aload #5
    //   5393: iload #26
    //   5395: iinc #26, 1
    //   5398: iaload
    //   5399: ixor
    //   5400: istore #22
    //   5402: iload #21
    //   5404: aload #15
    //   5406: iload #22
    //   5408: bipush #63
    //   5410: iand
    //   5411: iaload
    //   5412: ior
    //   5413: istore #21
    //   5415: iload #21
    //   5417: aload #13
    //   5419: iload #22
    //   5421: bipush #8
    //   5423: iushr
    //   5424: bipush #63
    //   5426: iand
    //   5427: iaload
    //   5428: ior
    //   5429: istore #21
    //   5431: iload #21
    //   5433: aload #11
    //   5435: iload #22
    //   5437: bipush #16
    //   5439: iushr
    //   5440: bipush #63
    //   5442: iand
    //   5443: iaload
    //   5444: ior
    //   5445: istore #21
    //   5447: iload #21
    //   5449: aload #9
    //   5451: iload #22
    //   5453: bipush #24
    //   5455: iushr
    //   5456: bipush #63
    //   5458: iand
    //   5459: iaload
    //   5460: ior
    //   5461: istore #21
    //   5463: iload #23
    //   5465: iload #21
    //   5467: ixor
    //   5468: istore #23
    //   5470: iinc #25, 1
    //   5473: iload_2
    //   5474: ifeq -> 5135
    //   5477: iload #23
    //   5479: bipush #31
    //   5481: ishl
    //   5482: iload #23
    //   5484: iconst_1
    //   5485: iushr
    //   5486: ior
    //   5487: istore #23
    //   5489: iload #24
    //   5491: iload #23
    //   5493: ixor
    //   5494: ldc -1431655766
    //   5496: iand
    //   5497: istore #22
    //   5499: iload #24
    //   5501: iload #22
    //   5503: ixor
    //   5504: istore #24
    //   5506: iload #23
    //   5508: iload #22
    //   5510: ixor
    //   5511: istore #23
    //   5513: iload #24
    //   5515: bipush #31
    //   5517: ishl
    //   5518: iload #24
    //   5520: iconst_1
    //   5521: iushr
    //   5522: ior
    //   5523: istore #24
    //   5525: iload #24
    //   5527: bipush #8
    //   5529: iushr
    //   5530: iload #23
    //   5532: ixor
    //   5533: ldc 16711935
    //   5535: iand
    //   5536: istore #22
    //   5538: iload #23
    //   5540: iload #22
    //   5542: ixor
    //   5543: istore #23
    //   5545: iload #24
    //   5547: iload #22
    //   5549: bipush #8
    //   5551: ishl
    //   5552: ixor
    //   5553: istore #24
    //   5555: iload #24
    //   5557: iconst_2
    //   5558: iushr
    //   5559: iload #23
    //   5561: ixor
    //   5562: ldc 858993459
    //   5564: iand
    //   5565: istore #22
    //   5567: iload #23
    //   5569: iload #22
    //   5571: ixor
    //   5572: istore #23
    //   5574: iload #24
    //   5576: iload #22
    //   5578: iconst_2
    //   5579: ishl
    //   5580: ixor
    //   5581: istore #24
    //   5583: iload #23
    //   5585: bipush #16
    //   5587: iushr
    //   5588: iload #24
    //   5590: ixor
    //   5591: ldc 65535
    //   5593: iand
    //   5594: istore #22
    //   5596: iload #24
    //   5598: iload #22
    //   5600: ixor
    //   5601: istore #24
    //   5603: iload #23
    //   5605: iload #22
    //   5607: bipush #16
    //   5609: ishl
    //   5610: ixor
    //   5611: istore #23
    //   5613: iload #23
    //   5615: iconst_4
    //   5616: iushr
    //   5617: iload #24
    //   5619: ixor
    //   5620: ldc 252645135
    //   5622: iand
    //   5623: istore #22
    //   5625: iload #24
    //   5627: iload #22
    //   5629: ixor
    //   5630: istore #24
    //   5632: iload #23
    //   5634: iload #22
    //   5636: iconst_4
    //   5637: ishl
    //   5638: ixor
    //   5639: istore #23
    //   5641: aload #17
    //   5643: iconst_0
    //   5644: iload #23
    //   5646: iastore
    //   5647: aload #17
    //   5649: iconst_1
    //   5650: iload #24
    //   5652: iastore
    //   5653: iload #19
    //   5655: bipush #8
    //   5657: imul
    //   5658: istore #27
    //   5660: iconst_0
    //   5661: istore #28
    //   5663: iload #28
    //   5665: iconst_2
    //   5666: if_icmpge -> 5755
    //   5669: aload #4
    //   5671: iload #27
    //   5673: iload #28
    //   5675: iconst_4
    //   5676: imul
    //   5677: iadd
    //   5678: aload #17
    //   5680: iload #28
    //   5682: iaload
    //   5683: bipush #24
    //   5685: iushr
    //   5686: i2b
    //   5687: bastore
    //   5688: aload #4
    //   5690: iload #27
    //   5692: iload #28
    //   5694: iconst_4
    //   5695: imul
    //   5696: iadd
    //   5697: iconst_1
    //   5698: iadd
    //   5699: aload #17
    //   5701: iload #28
    //   5703: iaload
    //   5704: bipush #16
    //   5706: iushr
    //   5707: i2b
    //   5708: bastore
    //   5709: aload #4
    //   5711: iload #27
    //   5713: iload #28
    //   5715: iconst_4
    //   5716: imul
    //   5717: iadd
    //   5718: iconst_2
    //   5719: iadd
    //   5720: aload #17
    //   5722: iload #28
    //   5724: iaload
    //   5725: bipush #8
    //   5727: iushr
    //   5728: i2b
    //   5729: bastore
    //   5730: aload #4
    //   5732: iload #27
    //   5734: iload #28
    //   5736: iconst_4
    //   5737: imul
    //   5738: iadd
    //   5739: iconst_3
    //   5740: iadd
    //   5741: aload #17
    //   5743: iload #28
    //   5745: iaload
    //   5746: i2b
    //   5747: bastore
    //   5748: iinc #28, 1
    //   5751: iload_2
    //   5752: ifeq -> 5663
    //   5755: iinc #19, 1
    //   5758: iload_2
    //   5759: ifeq -> 4844
    //   5762: iconst_0
    //   5763: istore_3
    //   5764: getstatic burp/Zl5b.Zi : Ljava/lang/String;
    //   5767: getstatic burp/Zs9k.ZX : Ljava/lang/Object;
    //   5770: checkcast java/math/BigInteger
    //   5773: invokevirtual intValue : ()I
    //   5776: bipush #32
    //   5778: irem
    //   5779: invokestatic abs : (I)I
    //   5782: invokevirtual charAt : (I)C
    //   5785: getstatic burp/Ztdt.Zk : Ljava/lang/String;
    //   5788: getstatic burp/Zry7.ZZ : Ljava/lang/Object;
    //   5791: checkcast java/math/BigInteger
    //   5794: invokevirtual intValue : ()I
    //   5797: bipush #32
    //   5799: irem
    //   5800: invokestatic abs : (I)I
    //   5803: invokevirtual charAt : (I)C
    //   5806: if_icmpgt -> 6150
    //   5809: sipush #18217
    //   5812: sipush #-15210
    //   5815: invokestatic a : (II)Ljava/lang/String;
    //   5818: iconst_1
    //   5819: ldc burp/Zgx6
    //   5821: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5824: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5827: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5830: astore #4
    //   5832: aload #4
    //   5834: arraylength
    //   5835: istore #5
    //   5837: iconst_0
    //   5838: istore #6
    //   5840: iload #6
    //   5842: iload #5
    //   5844: if_icmpge -> 5982
    //   5847: aload #4
    //   5849: iload #6
    //   5851: aaload
    //   5852: astore #7
    //   5854: aload #7
    //   5856: invokevirtual getModifiers : ()I
    //   5859: invokestatic isStatic : (I)Z
    //   5862: ifne -> 5872
    //   5865: goto -> 5975
    //   5868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5871: athrow
    //   5872: aload #7
    //   5874: invokevirtual getType : ()Ljava/lang/Class;
    //   5877: astore #8
    //   5879: aload #8
    //   5881: ifnull -> 5962
    //   5884: aload #8
    //   5886: invokevirtual isPrimitive : ()Z
    //   5889: ifne -> 5962
    //   5892: goto -> 5899
    //   5895: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5898: athrow
    //   5899: aload #8
    //   5901: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5904: ifnull -> 5962
    //   5907: goto -> 5914
    //   5910: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5913: athrow
    //   5914: aload #8
    //   5916: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5919: invokevirtual getName : ()Ljava/lang/String;
    //   5922: ifnull -> 5962
    //   5925: goto -> 5932
    //   5928: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5931: athrow
    //   5932: aload #8
    //   5934: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5937: invokevirtual getName : ()Ljava/lang/String;
    //   5940: sipush #18219
    //   5943: sipush #14686
    //   5946: invokestatic a : (II)Ljava/lang/String;
    //   5949: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5952: ifne -> 5962
    //   5955: goto -> 5962
    //   5958: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5961: athrow
    //   5962: aload #7
    //   5964: iconst_1
    //   5965: invokevirtual setAccessible : (Z)V
    //   5968: aload #7
    //   5970: aconst_null
    //   5971: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5974: pop
    //   5975: iinc #6, 1
    //   5978: iload_2
    //   5979: ifeq -> 5840
    //   5982: sipush #18233
    //   5985: sipush #21816
    //   5988: invokestatic a : (II)Ljava/lang/String;
    //   5991: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5994: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5997: astore #4
    //   5999: aload #4
    //   6001: arraylength
    //   6002: istore #5
    //   6004: iconst_0
    //   6005: istore #6
    //   6007: iload #6
    //   6009: iload #5
    //   6011: if_icmpge -> 6147
    //   6014: aload #4
    //   6016: iload #6
    //   6018: aaload
    //   6019: astore #7
    //   6021: aload #7
    //   6023: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6026: pop
    //   6027: aload #7
    //   6029: invokevirtual getModifiers : ()I
    //   6032: invokestatic isStatic : (I)Z
    //   6035: ifeq -> 6133
    //   6038: aload #7
    //   6040: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6043: arraylength
    //   6044: iconst_2
    //   6045: if_icmpne -> 6133
    //   6048: goto -> 6055
    //   6051: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6054: athrow
    //   6055: aload #7
    //   6057: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6060: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6063: if_acmpne -> 6133
    //   6066: goto -> 6073
    //   6069: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6072: athrow
    //   6073: aload #7
    //   6075: iconst_1
    //   6076: invokevirtual setAccessible : (Z)V
    //   6079: aload #7
    //   6081: aconst_null
    //   6082: iconst_2
    //   6083: anewarray java/lang/Object
    //   6086: dup
    //   6087: iconst_0
    //   6088: aload_0
    //   6089: aastore
    //   6090: dup
    //   6091: iconst_1
    //   6092: aload_1
    //   6093: ifnonnull -> 6111
    //   6096: goto -> 6103
    //   6099: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6102: athrow
    //   6103: aload_1
    //   6104: goto -> 6118
    //   6107: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6110: athrow
    //   6111: aload_1
    //   6112: checkcast [B
    //   6115: invokevirtual clone : ()Ljava/lang/Object;
    //   6118: aastore
    //   6119: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6122: checkcast java/lang/Boolean
    //   6125: invokevirtual booleanValue : ()Z
    //   6128: istore_3
    //   6129: iload_2
    //   6130: ifeq -> 6147
    //   6133: iinc #6, 1
    //   6136: iload_2
    //   6137: ifeq -> 6007
    //   6140: goto -> 6147
    //   6143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6146: athrow
    //   6147: goto -> 6488
    //   6150: sipush #18239
    //   6153: sipush #-18451
    //   6156: invokestatic a : (II)Ljava/lang/String;
    //   6159: iconst_1
    //   6160: ldc burp/Zs5k
    //   6162: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6165: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6168: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6171: astore #4
    //   6173: aload #4
    //   6175: arraylength
    //   6176: istore #5
    //   6178: iconst_0
    //   6179: istore #6
    //   6181: iload #6
    //   6183: iload #5
    //   6185: if_icmpge -> 6323
    //   6188: aload #4
    //   6190: iload #6
    //   6192: aaload
    //   6193: astore #7
    //   6195: aload #7
    //   6197: invokevirtual getModifiers : ()I
    //   6200: invokestatic isStatic : (I)Z
    //   6203: ifne -> 6213
    //   6206: goto -> 6316
    //   6209: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6212: athrow
    //   6213: aload #7
    //   6215: invokevirtual getType : ()Ljava/lang/Class;
    //   6218: astore #8
    //   6220: aload #8
    //   6222: ifnull -> 6303
    //   6225: aload #8
    //   6227: invokevirtual isPrimitive : ()Z
    //   6230: ifne -> 6303
    //   6233: goto -> 6240
    //   6236: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6239: athrow
    //   6240: aload #8
    //   6242: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6245: ifnull -> 6303
    //   6248: goto -> 6255
    //   6251: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6254: athrow
    //   6255: aload #8
    //   6257: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6260: invokevirtual getName : ()Ljava/lang/String;
    //   6263: ifnull -> 6303
    //   6266: goto -> 6273
    //   6269: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6272: athrow
    //   6273: aload #8
    //   6275: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6278: invokevirtual getName : ()Ljava/lang/String;
    //   6281: sipush #18219
    //   6284: sipush #14686
    //   6287: invokestatic a : (II)Ljava/lang/String;
    //   6290: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6293: ifne -> 6303
    //   6296: goto -> 6303
    //   6299: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6302: athrow
    //   6303: aload #7
    //   6305: iconst_1
    //   6306: invokevirtual setAccessible : (Z)V
    //   6309: aload #7
    //   6311: aconst_null
    //   6312: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6315: pop
    //   6316: iinc #6, 1
    //   6319: iload_2
    //   6320: ifeq -> 6181
    //   6323: sipush #18221
    //   6326: sipush #-23805
    //   6329: invokestatic a : (II)Ljava/lang/String;
    //   6332: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6335: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6338: astore #4
    //   6340: aload #4
    //   6342: arraylength
    //   6343: istore #5
    //   6345: iconst_0
    //   6346: istore #6
    //   6348: iload #6
    //   6350: iload #5
    //   6352: if_icmpge -> 6488
    //   6355: aload #4
    //   6357: iload #6
    //   6359: aaload
    //   6360: astore #7
    //   6362: aload #7
    //   6364: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6367: pop
    //   6368: aload #7
    //   6370: invokevirtual getModifiers : ()I
    //   6373: invokestatic isStatic : (I)Z
    //   6376: ifeq -> 6474
    //   6379: aload #7
    //   6381: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6384: arraylength
    //   6385: iconst_2
    //   6386: if_icmpne -> 6474
    //   6389: goto -> 6396
    //   6392: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6395: athrow
    //   6396: aload #7
    //   6398: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6401: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6404: if_acmpne -> 6474
    //   6407: goto -> 6414
    //   6410: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6413: athrow
    //   6414: aload #7
    //   6416: iconst_1
    //   6417: invokevirtual setAccessible : (Z)V
    //   6420: aload #7
    //   6422: aconst_null
    //   6423: iconst_2
    //   6424: anewarray java/lang/Object
    //   6427: dup
    //   6428: iconst_0
    //   6429: aload_0
    //   6430: aastore
    //   6431: dup
    //   6432: iconst_1
    //   6433: aload_1
    //   6434: ifnonnull -> 6452
    //   6437: goto -> 6444
    //   6440: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6443: athrow
    //   6444: aload_1
    //   6445: goto -> 6459
    //   6448: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6451: athrow
    //   6452: aload_1
    //   6453: checkcast [B
    //   6456: invokevirtual clone : ()Ljava/lang/Object;
    //   6459: aastore
    //   6460: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6463: checkcast java/lang/Boolean
    //   6466: invokevirtual booleanValue : ()Z
    //   6469: istore_3
    //   6470: iload_2
    //   6471: ifeq -> 6488
    //   6474: iinc #6, 1
    //   6477: iload_2
    //   6478: ifeq -> 6348
    //   6481: goto -> 6488
    //   6484: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6487: athrow
    //   6488: iload_3
    //   6489: ifeq -> 6494
    //   6492: iload_3
    //   6493: ireturn
    //   6494: getstatic burp/Zct.Zy : Ljava/lang/String;
    //   6497: getstatic burp/Zblj.Zl : Ljava/lang/Object;
    //   6500: checkcast java/math/BigInteger
    //   6503: invokevirtual intValue : ()I
    //   6506: bipush #32
    //   6508: irem
    //   6509: invokestatic abs : (I)I
    //   6512: invokevirtual charAt : (I)C
    //   6515: getstatic burp/Zb_c.ZS : Ljava/lang/String;
    //   6518: getstatic burp/Zb29.ZM : Ljava/lang/Object;
    //   6521: checkcast java/math/BigInteger
    //   6524: invokevirtual intValue : ()I
    //   6527: bipush #32
    //   6529: irem
    //   6530: invokestatic abs : (I)I
    //   6533: invokevirtual charAt : (I)C
    //   6536: if_icmpgt -> 6881
    //   6539: sipush #18228
    //   6542: sipush #-7144
    //   6545: invokestatic a : (II)Ljava/lang/String;
    //   6548: iconst_1
    //   6549: ldc burp/Zs00
    //   6551: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6554: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6557: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6560: astore #4
    //   6562: aload #4
    //   6564: arraylength
    //   6565: istore #5
    //   6567: iconst_0
    //   6568: istore #6
    //   6570: iload #6
    //   6572: iload #5
    //   6574: if_icmpge -> 6712
    //   6577: aload #4
    //   6579: iload #6
    //   6581: aaload
    //   6582: astore #7
    //   6584: aload #7
    //   6586: invokevirtual getModifiers : ()I
    //   6589: invokestatic isStatic : (I)Z
    //   6592: ifne -> 6602
    //   6595: goto -> 6705
    //   6598: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6601: athrow
    //   6602: aload #7
    //   6604: invokevirtual getType : ()Ljava/lang/Class;
    //   6607: astore #8
    //   6609: aload #8
    //   6611: ifnull -> 6692
    //   6614: aload #8
    //   6616: invokevirtual isPrimitive : ()Z
    //   6619: ifne -> 6692
    //   6622: goto -> 6629
    //   6625: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6628: athrow
    //   6629: aload #8
    //   6631: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6634: ifnull -> 6692
    //   6637: goto -> 6644
    //   6640: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6643: athrow
    //   6644: aload #8
    //   6646: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6649: invokevirtual getName : ()Ljava/lang/String;
    //   6652: ifnull -> 6692
    //   6655: goto -> 6662
    //   6658: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6661: athrow
    //   6662: aload #8
    //   6664: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6667: invokevirtual getName : ()Ljava/lang/String;
    //   6670: sipush #18219
    //   6673: sipush #14686
    //   6676: invokestatic a : (II)Ljava/lang/String;
    //   6679: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6682: ifne -> 6692
    //   6685: goto -> 6692
    //   6688: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6691: athrow
    //   6692: aload #7
    //   6694: iconst_1
    //   6695: invokevirtual setAccessible : (Z)V
    //   6698: aload #7
    //   6700: aconst_null
    //   6701: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6704: pop
    //   6705: iinc #6, 1
    //   6708: iload_2
    //   6709: ifeq -> 6570
    //   6712: sipush #18230
    //   6715: sipush #26629
    //   6718: invokestatic a : (II)Ljava/lang/String;
    //   6721: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6724: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6727: astore #4
    //   6729: aload #4
    //   6731: arraylength
    //   6732: istore #5
    //   6734: iconst_0
    //   6735: istore #6
    //   6737: iload #6
    //   6739: iload #5
    //   6741: if_icmpge -> 6877
    //   6744: aload #4
    //   6746: iload #6
    //   6748: aaload
    //   6749: astore #7
    //   6751: aload #7
    //   6753: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6756: pop
    //   6757: aload #7
    //   6759: invokevirtual getModifiers : ()I
    //   6762: invokestatic isStatic : (I)Z
    //   6765: ifeq -> 6863
    //   6768: aload #7
    //   6770: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6773: arraylength
    //   6774: iconst_2
    //   6775: if_icmpne -> 6863
    //   6778: goto -> 6785
    //   6781: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6784: athrow
    //   6785: aload #7
    //   6787: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6790: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6793: if_acmpne -> 6863
    //   6796: goto -> 6803
    //   6799: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6802: athrow
    //   6803: aload #7
    //   6805: iconst_1
    //   6806: invokevirtual setAccessible : (Z)V
    //   6809: aload #7
    //   6811: aconst_null
    //   6812: iconst_2
    //   6813: anewarray java/lang/Object
    //   6816: dup
    //   6817: iconst_0
    //   6818: aload_0
    //   6819: aastore
    //   6820: dup
    //   6821: iconst_1
    //   6822: aload_1
    //   6823: ifnonnull -> 6841
    //   6826: goto -> 6833
    //   6829: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6832: athrow
    //   6833: aload_1
    //   6834: goto -> 6848
    //   6837: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6840: athrow
    //   6841: aload_1
    //   6842: checkcast [B
    //   6845: invokevirtual clone : ()Ljava/lang/Object;
    //   6848: aastore
    //   6849: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6852: checkcast java/lang/Boolean
    //   6855: invokevirtual booleanValue : ()Z
    //   6858: istore_3
    //   6859: iload_2
    //   6860: ifeq -> 6877
    //   6863: iinc #6, 1
    //   6866: iload_2
    //   6867: ifeq -> 6737
    //   6870: goto -> 6877
    //   6873: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6876: athrow
    //   6877: iload_2
    //   6878: ifeq -> 7219
    //   6881: sipush #18223
    //   6884: sipush #6552
    //   6887: invokestatic a : (II)Ljava/lang/String;
    //   6890: iconst_1
    //   6891: ldc burp/Zlwm
    //   6893: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6896: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6899: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6902: astore #4
    //   6904: aload #4
    //   6906: arraylength
    //   6907: istore #5
    //   6909: iconst_0
    //   6910: istore #6
    //   6912: iload #6
    //   6914: iload #5
    //   6916: if_icmpge -> 7054
    //   6919: aload #4
    //   6921: iload #6
    //   6923: aaload
    //   6924: astore #7
    //   6926: aload #7
    //   6928: invokevirtual getModifiers : ()I
    //   6931: invokestatic isStatic : (I)Z
    //   6934: ifne -> 6944
    //   6937: goto -> 7047
    //   6940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6943: athrow
    //   6944: aload #7
    //   6946: invokevirtual getType : ()Ljava/lang/Class;
    //   6949: astore #8
    //   6951: aload #8
    //   6953: ifnull -> 7034
    //   6956: aload #8
    //   6958: invokevirtual isPrimitive : ()Z
    //   6961: ifne -> 7034
    //   6964: goto -> 6971
    //   6967: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6970: athrow
    //   6971: aload #8
    //   6973: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6976: ifnull -> 7034
    //   6979: goto -> 6986
    //   6982: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6985: athrow
    //   6986: aload #8
    //   6988: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6991: invokevirtual getName : ()Ljava/lang/String;
    //   6994: ifnull -> 7034
    //   6997: goto -> 7004
    //   7000: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7003: athrow
    //   7004: aload #8
    //   7006: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7009: invokevirtual getName : ()Ljava/lang/String;
    //   7012: sipush #18219
    //   7015: sipush #14686
    //   7018: invokestatic a : (II)Ljava/lang/String;
    //   7021: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7024: ifne -> 7034
    //   7027: goto -> 7034
    //   7030: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7033: athrow
    //   7034: aload #7
    //   7036: iconst_1
    //   7037: invokevirtual setAccessible : (Z)V
    //   7040: aload #7
    //   7042: aconst_null
    //   7043: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7046: pop
    //   7047: iinc #6, 1
    //   7050: iload_2
    //   7051: ifeq -> 6912
    //   7054: sipush #18232
    //   7057: sipush #18408
    //   7060: invokestatic a : (II)Ljava/lang/String;
    //   7063: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7066: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7069: astore #4
    //   7071: aload #4
    //   7073: arraylength
    //   7074: istore #5
    //   7076: iconst_0
    //   7077: istore #6
    //   7079: iload #6
    //   7081: iload #5
    //   7083: if_icmpge -> 7219
    //   7086: aload #4
    //   7088: iload #6
    //   7090: aaload
    //   7091: astore #7
    //   7093: aload #7
    //   7095: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7098: pop
    //   7099: aload #7
    //   7101: invokevirtual getModifiers : ()I
    //   7104: invokestatic isStatic : (I)Z
    //   7107: ifeq -> 7205
    //   7110: aload #7
    //   7112: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7115: arraylength
    //   7116: iconst_2
    //   7117: if_icmpne -> 7205
    //   7120: goto -> 7127
    //   7123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7126: athrow
    //   7127: aload #7
    //   7129: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7132: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7135: if_acmpne -> 7205
    //   7138: goto -> 7145
    //   7141: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7144: athrow
    //   7145: aload #7
    //   7147: iconst_1
    //   7148: invokevirtual setAccessible : (Z)V
    //   7151: aload #7
    //   7153: aconst_null
    //   7154: iconst_2
    //   7155: anewarray java/lang/Object
    //   7158: dup
    //   7159: iconst_0
    //   7160: aload_0
    //   7161: aastore
    //   7162: dup
    //   7163: iconst_1
    //   7164: aload_1
    //   7165: ifnonnull -> 7183
    //   7168: goto -> 7175
    //   7171: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7174: athrow
    //   7175: aload_1
    //   7176: goto -> 7190
    //   7179: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7182: athrow
    //   7183: aload_1
    //   7184: checkcast [B
    //   7187: invokevirtual clone : ()Ljava/lang/Object;
    //   7190: aastore
    //   7191: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7194: checkcast java/lang/Boolean
    //   7197: invokevirtual booleanValue : ()Z
    //   7200: istore_3
    //   7201: iload_2
    //   7202: ifeq -> 7219
    //   7205: iinc #6, 1
    //   7208: iload_2
    //   7209: ifeq -> 7079
    //   7212: goto -> 7219
    //   7215: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7218: athrow
    //   7219: iload_3
    //   7220: ifeq -> 7225
    //   7223: iload_3
    //   7224: ireturn
    //   7225: getstatic burp/Ze0w.ZT : Ljava/lang/String;
    //   7228: getstatic burp/Zzr.ZZ : Ljava/lang/Object;
    //   7231: checkcast java/math/BigInteger
    //   7234: invokevirtual intValue : ()I
    //   7237: bipush #32
    //   7239: irem
    //   7240: invokestatic abs : (I)I
    //   7243: invokevirtual charAt : (I)C
    //   7246: getstatic burp/Zlp7.ZO : Ljava/lang/String;
    //   7249: getstatic burp/Zlpl.Ze : Ljava/lang/Object;
    //   7252: checkcast java/math/BigInteger
    //   7255: invokevirtual intValue : ()I
    //   7258: bipush #32
    //   7260: irem
    //   7261: invokestatic abs : (I)I
    //   7264: invokevirtual charAt : (I)C
    //   7267: if_icmple -> 7612
    //   7270: sipush #18231
    //   7273: sipush #-25596
    //   7276: invokestatic a : (II)Ljava/lang/String;
    //   7279: iconst_1
    //   7280: ldc burp/Zl_9
    //   7282: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   7285: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   7288: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   7291: astore #4
    //   7293: aload #4
    //   7295: arraylength
    //   7296: istore #5
    //   7298: iconst_0
    //   7299: istore #6
    //   7301: iload #6
    //   7303: iload #5
    //   7305: if_icmpge -> 7443
    //   7308: aload #4
    //   7310: iload #6
    //   7312: aaload
    //   7313: astore #7
    //   7315: aload #7
    //   7317: invokevirtual getModifiers : ()I
    //   7320: invokestatic isStatic : (I)Z
    //   7323: ifne -> 7333
    //   7326: goto -> 7436
    //   7329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7332: athrow
    //   7333: aload #7
    //   7335: invokevirtual getType : ()Ljava/lang/Class;
    //   7338: astore #8
    //   7340: aload #8
    //   7342: ifnull -> 7423
    //   7345: aload #8
    //   7347: invokevirtual isPrimitive : ()Z
    //   7350: ifne -> 7423
    //   7353: goto -> 7360
    //   7356: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7359: athrow
    //   7360: aload #8
    //   7362: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7365: ifnull -> 7423
    //   7368: goto -> 7375
    //   7371: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7374: athrow
    //   7375: aload #8
    //   7377: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7380: invokevirtual getName : ()Ljava/lang/String;
    //   7383: ifnull -> 7423
    //   7386: goto -> 7393
    //   7389: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7392: athrow
    //   7393: aload #8
    //   7395: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7398: invokevirtual getName : ()Ljava/lang/String;
    //   7401: sipush #18219
    //   7404: sipush #14686
    //   7407: invokestatic a : (II)Ljava/lang/String;
    //   7410: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7413: ifne -> 7423
    //   7416: goto -> 7423
    //   7419: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7422: athrow
    //   7423: aload #7
    //   7425: iconst_1
    //   7426: invokevirtual setAccessible : (Z)V
    //   7429: aload #7
    //   7431: aconst_null
    //   7432: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7435: pop
    //   7436: iinc #6, 1
    //   7439: iload_2
    //   7440: ifeq -> 7301
    //   7443: sipush #18225
    //   7446: sipush #29772
    //   7449: invokestatic a : (II)Ljava/lang/String;
    //   7452: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7455: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7458: astore #4
    //   7460: aload #4
    //   7462: arraylength
    //   7463: istore #5
    //   7465: iconst_0
    //   7466: istore #6
    //   7468: iload #6
    //   7470: iload #5
    //   7472: if_icmpge -> 7608
    //   7475: aload #4
    //   7477: iload #6
    //   7479: aaload
    //   7480: astore #7
    //   7482: aload #7
    //   7484: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7487: pop
    //   7488: aload #7
    //   7490: invokevirtual getModifiers : ()I
    //   7493: invokestatic isStatic : (I)Z
    //   7496: ifeq -> 7594
    //   7499: aload #7
    //   7501: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7504: arraylength
    //   7505: iconst_2
    //   7506: if_icmpne -> 7594
    //   7509: goto -> 7516
    //   7512: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7515: athrow
    //   7516: aload #7
    //   7518: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7521: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7524: if_acmpne -> 7594
    //   7527: goto -> 7534
    //   7530: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7533: athrow
    //   7534: aload #7
    //   7536: iconst_1
    //   7537: invokevirtual setAccessible : (Z)V
    //   7540: aload #7
    //   7542: aconst_null
    //   7543: iconst_2
    //   7544: anewarray java/lang/Object
    //   7547: dup
    //   7548: iconst_0
    //   7549: aload_0
    //   7550: aastore
    //   7551: dup
    //   7552: iconst_1
    //   7553: aload_1
    //   7554: ifnonnull -> 7572
    //   7557: goto -> 7564
    //   7560: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7563: athrow
    //   7564: aload_1
    //   7565: goto -> 7579
    //   7568: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7571: athrow
    //   7572: aload_1
    //   7573: checkcast [B
    //   7576: invokevirtual clone : ()Ljava/lang/Object;
    //   7579: aastore
    //   7580: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7583: checkcast java/lang/Boolean
    //   7586: invokevirtual booleanValue : ()Z
    //   7589: istore_3
    //   7590: iload_2
    //   7591: ifeq -> 7608
    //   7594: iinc #6, 1
    //   7597: iload_2
    //   7598: ifeq -> 7468
    //   7601: goto -> 7608
    //   7604: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7607: athrow
    //   7608: iload_2
    //   7609: ifeq -> 7950
    //   7612: sipush #18218
    //   7615: sipush #-6468
    //   7618: invokestatic a : (II)Ljava/lang/String;
    //   7621: iconst_1
    //   7622: ldc burp/Zxti
    //   7624: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   7627: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   7630: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   7633: astore #4
    //   7635: aload #4
    //   7637: arraylength
    //   7638: istore #5
    //   7640: iconst_0
    //   7641: istore #6
    //   7643: iload #6
    //   7645: iload #5
    //   7647: if_icmpge -> 7785
    //   7650: aload #4
    //   7652: iload #6
    //   7654: aaload
    //   7655: astore #7
    //   7657: aload #7
    //   7659: invokevirtual getModifiers : ()I
    //   7662: invokestatic isStatic : (I)Z
    //   7665: ifne -> 7675
    //   7668: goto -> 7778
    //   7671: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7674: athrow
    //   7675: aload #7
    //   7677: invokevirtual getType : ()Ljava/lang/Class;
    //   7680: astore #8
    //   7682: aload #8
    //   7684: ifnull -> 7765
    //   7687: aload #8
    //   7689: invokevirtual isPrimitive : ()Z
    //   7692: ifne -> 7765
    //   7695: goto -> 7702
    //   7698: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7701: athrow
    //   7702: aload #8
    //   7704: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7707: ifnull -> 7765
    //   7710: goto -> 7717
    //   7713: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7716: athrow
    //   7717: aload #8
    //   7719: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7722: invokevirtual getName : ()Ljava/lang/String;
    //   7725: ifnull -> 7765
    //   7728: goto -> 7735
    //   7731: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7734: athrow
    //   7735: aload #8
    //   7737: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7740: invokevirtual getName : ()Ljava/lang/String;
    //   7743: sipush #18219
    //   7746: sipush #14686
    //   7749: invokestatic a : (II)Ljava/lang/String;
    //   7752: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7755: ifne -> 7765
    //   7758: goto -> 7765
    //   7761: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7764: athrow
    //   7765: aload #7
    //   7767: iconst_1
    //   7768: invokevirtual setAccessible : (Z)V
    //   7771: aload #7
    //   7773: aconst_null
    //   7774: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7777: pop
    //   7778: iinc #6, 1
    //   7781: iload_2
    //   7782: ifeq -> 7643
    //   7785: sipush #18237
    //   7788: sipush #-17081
    //   7791: invokestatic a : (II)Ljava/lang/String;
    //   7794: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7797: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7800: astore #4
    //   7802: aload #4
    //   7804: arraylength
    //   7805: istore #5
    //   7807: iconst_0
    //   7808: istore #6
    //   7810: iload #6
    //   7812: iload #5
    //   7814: if_icmpge -> 7950
    //   7817: aload #4
    //   7819: iload #6
    //   7821: aaload
    //   7822: astore #7
    //   7824: aload #7
    //   7826: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7829: pop
    //   7830: aload #7
    //   7832: invokevirtual getModifiers : ()I
    //   7835: invokestatic isStatic : (I)Z
    //   7838: ifeq -> 7936
    //   7841: aload #7
    //   7843: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7846: arraylength
    //   7847: iconst_2
    //   7848: if_icmpne -> 7936
    //   7851: goto -> 7858
    //   7854: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7857: athrow
    //   7858: aload #7
    //   7860: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7863: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7866: if_acmpne -> 7936
    //   7869: goto -> 7876
    //   7872: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7875: athrow
    //   7876: aload #7
    //   7878: iconst_1
    //   7879: invokevirtual setAccessible : (Z)V
    //   7882: aload #7
    //   7884: aconst_null
    //   7885: iconst_2
    //   7886: anewarray java/lang/Object
    //   7889: dup
    //   7890: iconst_0
    //   7891: aload_0
    //   7892: aastore
    //   7893: dup
    //   7894: iconst_1
    //   7895: aload_1
    //   7896: ifnonnull -> 7914
    //   7899: goto -> 7906
    //   7902: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7905: athrow
    //   7906: aload_1
    //   7907: goto -> 7921
    //   7910: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7913: athrow
    //   7914: aload_1
    //   7915: checkcast [B
    //   7918: invokevirtual clone : ()Ljava/lang/Object;
    //   7921: aastore
    //   7922: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7925: checkcast java/lang/Boolean
    //   7928: invokevirtual booleanValue : ()Z
    //   7931: istore_3
    //   7932: iload_2
    //   7933: ifeq -> 7950
    //   7936: iinc #6, 1
    //   7939: iload_2
    //   7940: ifeq -> 7810
    //   7943: goto -> 7950
    //   7946: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7949: athrow
    //   7950: iload_3
    //   7951: ifeq -> 7956
    //   7954: iload_3
    //   7955: ireturn
    //   7956: getstatic burp/Zepm.Zl : Ljava/lang/String;
    //   7959: getstatic burp/Zx4k.ZE : Ljava/lang/Object;
    //   7962: checkcast java/math/BigInteger
    //   7965: invokevirtual intValue : ()I
    //   7968: bipush #32
    //   7970: irem
    //   7971: invokestatic abs : (I)I
    //   7974: invokevirtual charAt : (I)C
    //   7977: getstatic burp/Zldx.Zm : Ljava/lang/String;
    //   7980: getstatic burp/Zdm.ZA : Ljava/lang/Object;
    //   7983: checkcast java/math/BigInteger
    //   7986: invokevirtual intValue : ()I
    //   7989: bipush #32
    //   7991: irem
    //   7992: invokestatic abs : (I)I
    //   7995: invokevirtual charAt : (I)C
    //   7998: if_icmpgt -> 8343
    //   8001: sipush #18235
    //   8004: sipush #16464
    //   8007: invokestatic a : (II)Ljava/lang/String;
    //   8010: iconst_1
    //   8011: ldc burp/Ze5t
    //   8013: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   8016: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   8019: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   8022: astore #4
    //   8024: aload #4
    //   8026: arraylength
    //   8027: istore #5
    //   8029: iconst_0
    //   8030: istore #6
    //   8032: iload #6
    //   8034: iload #5
    //   8036: if_icmpge -> 8174
    //   8039: aload #4
    //   8041: iload #6
    //   8043: aaload
    //   8044: astore #7
    //   8046: aload #7
    //   8048: invokevirtual getModifiers : ()I
    //   8051: invokestatic isStatic : (I)Z
    //   8054: ifne -> 8064
    //   8057: goto -> 8167
    //   8060: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8063: athrow
    //   8064: aload #7
    //   8066: invokevirtual getType : ()Ljava/lang/Class;
    //   8069: astore #8
    //   8071: aload #8
    //   8073: ifnull -> 8154
    //   8076: aload #8
    //   8078: invokevirtual isPrimitive : ()Z
    //   8081: ifne -> 8154
    //   8084: goto -> 8091
    //   8087: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8090: athrow
    //   8091: aload #8
    //   8093: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8096: ifnull -> 8154
    //   8099: goto -> 8106
    //   8102: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8105: athrow
    //   8106: aload #8
    //   8108: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8111: invokevirtual getName : ()Ljava/lang/String;
    //   8114: ifnull -> 8154
    //   8117: goto -> 8124
    //   8120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8123: athrow
    //   8124: aload #8
    //   8126: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8129: invokevirtual getName : ()Ljava/lang/String;
    //   8132: sipush #18219
    //   8135: sipush #14686
    //   8138: invokestatic a : (II)Ljava/lang/String;
    //   8141: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   8144: ifne -> 8154
    //   8147: goto -> 8154
    //   8150: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8153: athrow
    //   8154: aload #7
    //   8156: iconst_1
    //   8157: invokevirtual setAccessible : (Z)V
    //   8160: aload #7
    //   8162: aconst_null
    //   8163: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   8166: pop
    //   8167: iinc #6, 1
    //   8170: iload_2
    //   8171: ifeq -> 8032
    //   8174: sipush #18222
    //   8177: sipush #-30805
    //   8180: invokestatic a : (II)Ljava/lang/String;
    //   8183: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   8186: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   8189: astore #4
    //   8191: aload #4
    //   8193: arraylength
    //   8194: istore #5
    //   8196: iconst_0
    //   8197: istore #6
    //   8199: iload #6
    //   8201: iload #5
    //   8203: if_icmpge -> 8339
    //   8206: aload #4
    //   8208: iload #6
    //   8210: aaload
    //   8211: astore #7
    //   8213: aload #7
    //   8215: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   8218: pop
    //   8219: aload #7
    //   8221: invokevirtual getModifiers : ()I
    //   8224: invokestatic isStatic : (I)Z
    //   8227: ifeq -> 8325
    //   8230: aload #7
    //   8232: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   8235: arraylength
    //   8236: iconst_2
    //   8237: if_icmpne -> 8325
    //   8240: goto -> 8247
    //   8243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8246: athrow
    //   8247: aload #7
    //   8249: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   8252: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   8255: if_acmpne -> 8325
    //   8258: goto -> 8265
    //   8261: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8264: athrow
    //   8265: aload #7
    //   8267: iconst_1
    //   8268: invokevirtual setAccessible : (Z)V
    //   8271: aload #7
    //   8273: aconst_null
    //   8274: iconst_2
    //   8275: anewarray java/lang/Object
    //   8278: dup
    //   8279: iconst_0
    //   8280: aload_0
    //   8281: aastore
    //   8282: dup
    //   8283: iconst_1
    //   8284: aload_1
    //   8285: ifnonnull -> 8303
    //   8288: goto -> 8295
    //   8291: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8294: athrow
    //   8295: aload_1
    //   8296: goto -> 8310
    //   8299: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8302: athrow
    //   8303: aload_1
    //   8304: checkcast [B
    //   8307: invokevirtual clone : ()Ljava/lang/Object;
    //   8310: aastore
    //   8311: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   8314: checkcast java/lang/Boolean
    //   8317: invokevirtual booleanValue : ()Z
    //   8320: istore_3
    //   8321: iload_2
    //   8322: ifeq -> 8339
    //   8325: iinc #6, 1
    //   8328: iload_2
    //   8329: ifeq -> 8199
    //   8332: goto -> 8339
    //   8335: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8338: athrow
    //   8339: iload_2
    //   8340: ifeq -> 8681
    //   8343: sipush #18227
    //   8346: sipush #-32110
    //   8349: invokestatic a : (II)Ljava/lang/String;
    //   8352: iconst_1
    //   8353: ldc burp/Zmly
    //   8355: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   8358: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   8361: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   8364: astore #4
    //   8366: aload #4
    //   8368: arraylength
    //   8369: istore #5
    //   8371: iconst_0
    //   8372: istore #6
    //   8374: iload #6
    //   8376: iload #5
    //   8378: if_icmpge -> 8516
    //   8381: aload #4
    //   8383: iload #6
    //   8385: aaload
    //   8386: astore #7
    //   8388: aload #7
    //   8390: invokevirtual getModifiers : ()I
    //   8393: invokestatic isStatic : (I)Z
    //   8396: ifne -> 8406
    //   8399: goto -> 8509
    //   8402: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8405: athrow
    //   8406: aload #7
    //   8408: invokevirtual getType : ()Ljava/lang/Class;
    //   8411: astore #8
    //   8413: aload #8
    //   8415: ifnull -> 8496
    //   8418: aload #8
    //   8420: invokevirtual isPrimitive : ()Z
    //   8423: ifne -> 8496
    //   8426: goto -> 8433
    //   8429: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8432: athrow
    //   8433: aload #8
    //   8435: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8438: ifnull -> 8496
    //   8441: goto -> 8448
    //   8444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8447: athrow
    //   8448: aload #8
    //   8450: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8453: invokevirtual getName : ()Ljava/lang/String;
    //   8456: ifnull -> 8496
    //   8459: goto -> 8466
    //   8462: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8465: athrow
    //   8466: aload #8
    //   8468: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8471: invokevirtual getName : ()Ljava/lang/String;
    //   8474: sipush #18219
    //   8477: sipush #14686
    //   8480: invokestatic a : (II)Ljava/lang/String;
    //   8483: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   8486: ifne -> 8496
    //   8489: goto -> 8496
    //   8492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8495: athrow
    //   8496: aload #7
    //   8498: iconst_1
    //   8499: invokevirtual setAccessible : (Z)V
    //   8502: aload #7
    //   8504: aconst_null
    //   8505: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   8508: pop
    //   8509: iinc #6, 1
    //   8512: iload_2
    //   8513: ifeq -> 8374
    //   8516: sipush #18226
    //   8519: sipush #27504
    //   8522: invokestatic a : (II)Ljava/lang/String;
    //   8525: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   8528: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   8531: astore #4
    //   8533: aload #4
    //   8535: arraylength
    //   8536: istore #5
    //   8538: iconst_0
    //   8539: istore #6
    //   8541: iload #6
    //   8543: iload #5
    //   8545: if_icmpge -> 8681
    //   8548: aload #4
    //   8550: iload #6
    //   8552: aaload
    //   8553: astore #7
    //   8555: aload #7
    //   8557: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   8560: pop
    //   8561: aload #7
    //   8563: invokevirtual getModifiers : ()I
    //   8566: invokestatic isStatic : (I)Z
    //   8569: ifeq -> 8667
    //   8572: aload #7
    //   8574: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   8577: arraylength
    //   8578: iconst_2
    //   8579: if_icmpne -> 8667
    //   8582: goto -> 8589
    //   8585: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8588: athrow
    //   8589: aload #7
    //   8591: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   8594: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   8597: if_acmpne -> 8667
    //   8600: goto -> 8607
    //   8603: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8606: athrow
    //   8607: aload #7
    //   8609: iconst_1
    //   8610: invokevirtual setAccessible : (Z)V
    //   8613: aload #7
    //   8615: aconst_null
    //   8616: iconst_2
    //   8617: anewarray java/lang/Object
    //   8620: dup
    //   8621: iconst_0
    //   8622: aload_0
    //   8623: aastore
    //   8624: dup
    //   8625: iconst_1
    //   8626: aload_1
    //   8627: ifnonnull -> 8645
    //   8630: goto -> 8637
    //   8633: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8636: athrow
    //   8637: aload_1
    //   8638: goto -> 8652
    //   8641: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8644: athrow
    //   8645: aload_1
    //   8646: checkcast [B
    //   8649: invokevirtual clone : ()Ljava/lang/Object;
    //   8652: aastore
    //   8653: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   8656: checkcast java/lang/Boolean
    //   8659: invokevirtual booleanValue : ()Z
    //   8662: istore_3
    //   8663: iload_2
    //   8664: ifeq -> 8681
    //   8667: iinc #6, 1
    //   8670: iload_2
    //   8671: ifeq -> 8541
    //   8674: goto -> 8681
    //   8677: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8680: athrow
    //   8681: iload_3
    //   8682: ireturn
    //   8683: astore_3
    //   8684: new java/lang/Exception
    //   8687: dup
    //   8688: aload_3
    //   8689: invokevirtual getMessage : ()Ljava/lang/String;
    //   8692: invokespecial <init> : (Ljava/lang/String;)V
    //   8695: athrow
    // Exception table:
    //   from	to	target	type
    //   4	6493	8683	java/lang/Throwable
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
    //   1159	1173	1173	java/lang/Throwable
    //   1184	1197	1200	java/lang/Throwable
    //   1189	1212	1215	java/lang/Throwable
    //   1204	1230	1233	java/lang/Throwable
    //   1219	1260	1263	java/lang/Throwable
    //   1323	1350	1353	java/lang/Throwable
    //   1340	1371	1374	java/lang/Throwable
    //   1357	1401	1404	java/lang/Throwable
    //   1378	1412	1412	java/lang/Throwable
    //   1423	1439	1442	java/lang/Throwable
    //   5854	5868	5868	java/lang/Throwable
    //   5879	5892	5895	java/lang/Throwable
    //   5884	5907	5910	java/lang/Throwable
    //   5899	5925	5928	java/lang/Throwable
    //   5914	5955	5958	java/lang/Throwable
    //   6021	6048	6051	java/lang/Throwable
    //   6038	6066	6069	java/lang/Throwable
    //   6055	6096	6099	java/lang/Throwable
    //   6073	6107	6107	java/lang/Throwable
    //   6129	6140	6143	java/lang/Throwable
    //   6195	6209	6209	java/lang/Throwable
    //   6220	6233	6236	java/lang/Throwable
    //   6225	6248	6251	java/lang/Throwable
    //   6240	6266	6269	java/lang/Throwable
    //   6255	6296	6299	java/lang/Throwable
    //   6362	6389	6392	java/lang/Throwable
    //   6379	6407	6410	java/lang/Throwable
    //   6396	6437	6440	java/lang/Throwable
    //   6414	6448	6448	java/lang/Throwable
    //   6470	6481	6484	java/lang/Throwable
    //   6494	7224	8683	java/lang/Throwable
    //   6584	6598	6598	java/lang/Throwable
    //   6609	6622	6625	java/lang/Throwable
    //   6614	6637	6640	java/lang/Throwable
    //   6629	6655	6658	java/lang/Throwable
    //   6644	6685	6688	java/lang/Throwable
    //   6751	6778	6781	java/lang/Throwable
    //   6768	6796	6799	java/lang/Throwable
    //   6785	6826	6829	java/lang/Throwable
    //   6803	6837	6837	java/lang/Throwable
    //   6859	6870	6873	java/lang/Throwable
    //   6926	6940	6940	java/lang/Throwable
    //   6951	6964	6967	java/lang/Throwable
    //   6956	6979	6982	java/lang/Throwable
    //   6971	6997	7000	java/lang/Throwable
    //   6986	7027	7030	java/lang/Throwable
    //   7093	7120	7123	java/lang/Throwable
    //   7110	7138	7141	java/lang/Throwable
    //   7127	7168	7171	java/lang/Throwable
    //   7145	7179	7179	java/lang/Throwable
    //   7201	7212	7215	java/lang/Throwable
    //   7225	7955	8683	java/lang/Throwable
    //   7315	7329	7329	java/lang/Throwable
    //   7340	7353	7356	java/lang/Throwable
    //   7345	7368	7371	java/lang/Throwable
    //   7360	7386	7389	java/lang/Throwable
    //   7375	7416	7419	java/lang/Throwable
    //   7482	7509	7512	java/lang/Throwable
    //   7499	7527	7530	java/lang/Throwable
    //   7516	7557	7560	java/lang/Throwable
    //   7534	7568	7568	java/lang/Throwable
    //   7590	7601	7604	java/lang/Throwable
    //   7657	7671	7671	java/lang/Throwable
    //   7682	7695	7698	java/lang/Throwable
    //   7687	7710	7713	java/lang/Throwable
    //   7702	7728	7731	java/lang/Throwable
    //   7717	7758	7761	java/lang/Throwable
    //   7824	7851	7854	java/lang/Throwable
    //   7841	7869	7872	java/lang/Throwable
    //   7858	7899	7902	java/lang/Throwable
    //   7876	7910	7910	java/lang/Throwable
    //   7932	7943	7946	java/lang/Throwable
    //   7956	8682	8683	java/lang/Throwable
    //   8046	8060	8060	java/lang/Throwable
    //   8071	8084	8087	java/lang/Throwable
    //   8076	8099	8102	java/lang/Throwable
    //   8091	8117	8120	java/lang/Throwable
    //   8106	8147	8150	java/lang/Throwable
    //   8213	8240	8243	java/lang/Throwable
    //   8230	8258	8261	java/lang/Throwable
    //   8247	8288	8291	java/lang/Throwable
    //   8265	8299	8299	java/lang/Throwable
    //   8321	8332	8335	java/lang/Throwable
    //   8388	8402	8402	java/lang/Throwable
    //   8413	8426	8429	java/lang/Throwable
    //   8418	8441	8444	java/lang/Throwable
    //   8433	8459	8462	java/lang/Throwable
    //   8448	8489	8492	java/lang/Throwable
    //   8555	8582	8585	java/lang/Throwable
    //   8572	8600	8603	java/lang/Throwable
    //   8589	8630	8633	java/lang/Throwable
    //   8607	8641	8641	java/lang/Throwable
    //   8663	8674	8677	java/lang/Throwable
  }
  
  static void ZN(Object paramObject) {
    Zttq.ZO = a(18220, -808);
    Zttq.Zh = new BigInteger(a(18234, 22380));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Ztap.Zk.charAt(Math.abs(((BigInteger)Zexu.ZI).intValue() % 32)) > Zs9k.Zx.charAt(Math.abs(((BigInteger)Zete.Zm).intValue() % 32))) {
          try {
            Zkht.ZN(Class.forName(a(18229, 22502)));
            if (bool)
              Zxjw.ZK(Class.forName(a(18216, -28896))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zxjw.ZK(Class.forName(a(18216, -28896)));
    } catch (Throwable throwable) {}
  }
  
  static void ZT(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' üY¦Zo®\\tmôÈ#ßëÕ3Ç¼¡®\\t­ºêWÒÇ[\\t_²)ëãëIG\\t¥øí& =æMX¤¾Ý5P1ÒNja+CýËÎu~§»\\nÑc;89ÁPñbTõäÏ6]©²ë|¾íåHÝ²7Wbý^Å÷cHÓcÆ`(W"¼\\tI!p³eê=\\t.¢m.kM\\\t¸·NÏt?Ì.\\tVKÏ¯gßÎ\\t\\fÈ¸¤Ñ\\n3\\tì}Ä%,¯`\\t|,Ö¼gQd]t\\tO,°¼«Qü\\fP\\t§Ï­À\\bÞýÞ QÌ=¬­ÍÈî«ÅGBWéÏ¬A]µíÇí¼Jd\\tÚ©æóSSk\\tçû¥F\\t îÉ\\t8Ç^ÁvþXê1\\tD­ÑWfÀã\\t -¬cGN\\tºè$|B fN'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #113
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc '?h mô=o£h®@/(Í#B 6¯frèÏ"u'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #31
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
    //   128: putstatic burp/Zgj5.a : [Ljava/lang/String;
    //   131: bipush #25
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zgj5.b : [Ljava/lang/String;
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
    //   212: bipush #40
    //   214: goto -> 244
    //   217: bipush #71
    //   219: goto -> 244
    //   222: bipush #95
    //   224: goto -> 244
    //   227: bipush #37
    //   229: goto -> 244
    //   232: bipush #27
    //   234: goto -> 244
    //   237: bipush #25
    //   239: goto -> 244
    //   242: bipush #51
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #58
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #121
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #19
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-19
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #78
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #121
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #98
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #80
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #17
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #53
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #54
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #38
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-99
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: iconst_2
    //   384: bastore
    //   385: dup
    //   386: bipush #14
    //   388: bipush #-127
    //   390: bastore
    //   391: dup
    //   392: bipush #15
    //   394: bipush #56
    //   396: bastore
    //   397: dup
    //   398: bipush #16
    //   400: bipush #-46
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #81
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #-108
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #-57
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #95
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #45
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #-52
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #18
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #-119
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #50
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #112
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #122
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #116
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #61
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #16
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #12
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Zgj5.ZO : Ljava/lang/Object;
    //   499: sipush #18212
    //   502: sipush #978
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zgj5.ZH : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x473C) & 0xFFFF;
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
      char c = 'Ì';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgj5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */