package burp;

import java.math.BigInteger;

class Zkby extends ClassLoader {
  static String Zf;
  
  static Object Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZQ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zv(Object paramObject) {
    Zzuh.ZX = a(-31554, -24761);
    Zzuh.ZV = new BigInteger(a(-31553, 926));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Ze0z.ZU.charAt(Math.abs(((BigInteger)Ze0z.ZQ).intValue() % 32)) <= Ze0z.ZU.charAt(Math.abs(((BigInteger)Zzuh.ZV).intValue() % 32))) {
          try {
            Zgz1.ZE(Class.forName(a(-31555, 16875)));
            if (bool)
              Zt0t.ZM(Class.forName(a(-31559, 25576))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zt0t.ZM(Class.forName(a(-31559, 25576)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zr(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   250: getstatic burp/Zbu6.ZJ : Ljava/lang/Object;
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
    //   1102: sipush #-31557
    //   1105: new java/math/BigInteger
    //   1108: dup
    //   1109: aload #4
    //   1111: invokespecial <init> : ([B)V
    //   1114: invokevirtual abs : ()Ljava/math/BigInteger;
    //   1117: putstatic burp/Zkor.Ze : Ljava/lang/Object;
    //   1120: sipush #-16203
    //   1123: invokestatic a : (II)Ljava/lang/String;
    //   1126: iconst_1
    //   1127: ldc burp/Zxxo
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
    //   1245: sipush #-31560
    //   1248: sipush #-31653
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
    //   1284: ifne -> 1146
    //   1287: sipush #-31556
    //   1290: sipush #22805
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
    //   1429: ifne -> 1446
    //   1432: iinc #5, 1
    //   1435: iload_2
    //   1436: ifne -> 1310
    //   1439: goto -> 1446
    //   1442: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1445: athrow
    //   1446: getstatic burp/Zxzt.ZG : Ljava/lang/String;
    //   1449: getstatic burp/Zrdo.ZK : Ljava/lang/Object;
    //   1452: checkcast java/math/BigInteger
    //   1455: invokevirtual intValue : ()I
    //   1458: bipush #32
    //   1460: irem
    //   1461: invokestatic abs : (I)I
    //   1464: invokevirtual charAt : (I)C
    //   1467: getstatic burp/Zsvh.ZV : Ljava/lang/String;
    //   1470: getstatic burp/Zr64.ZN : Ljava/lang/Object;
    //   1473: checkcast java/math/BigInteger
    //   1476: invokevirtual intValue : ()I
    //   1479: bipush #32
    //   1481: irem
    //   1482: invokestatic abs : (I)I
    //   1485: invokevirtual charAt : (I)C
    //   1488: if_icmple -> 1595
    //   1491: getstatic burp/Zgqp.ZA : Ljava/lang/String;
    //   1494: getstatic burp/Zxti.ZJ : Ljava/lang/Object;
    //   1497: checkcast java/math/BigInteger
    //   1500: invokevirtual intValue : ()I
    //   1503: bipush #32
    //   1505: irem
    //   1506: invokestatic abs : (I)I
    //   1509: invokevirtual charAt : (I)C
    //   1512: getstatic burp/Zrqd.Zk : Ljava/lang/String;
    //   1515: getstatic burp/Zg_y.ZR : Ljava/lang/Object;
    //   1518: checkcast java/math/BigInteger
    //   1521: invokevirtual intValue : ()I
    //   1524: bipush #32
    //   1526: irem
    //   1527: invokestatic abs : (I)I
    //   1530: invokevirtual charAt : (I)C
    //   1533: if_icmpgt -> 1595
    //   1536: goto -> 1543
    //   1539: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1542: athrow
    //   1543: getstatic burp/Zg_i.ZW : Ljava/lang/String;
    //   1546: getstatic burp/Zg3v.Zk : Ljava/lang/Object;
    //   1549: checkcast java/math/BigInteger
    //   1552: invokevirtual intValue : ()I
    //   1555: bipush #32
    //   1557: irem
    //   1558: invokestatic abs : (I)I
    //   1561: invokevirtual charAt : (I)C
    //   1564: getstatic burp/Zeoa.Zn : Ljava/lang/String;
    //   1567: getstatic burp/Zr_w.ZK : Ljava/lang/Object;
    //   1570: checkcast java/math/BigInteger
    //   1573: invokevirtual intValue : ()I
    //   1576: bipush #32
    //   1578: irem
    //   1579: invokestatic abs : (I)I
    //   1582: invokevirtual charAt : (I)C
    //   1585: if_icmpgt -> 1603
    //   1588: goto -> 1595
    //   1591: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1594: athrow
    //   1595: iconst_1
    //   1596: goto -> 1604
    //   1599: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1602: athrow
    //   1603: iconst_0
    //   1604: ireturn
    //   1605: astore_3
    //   1606: new java/lang/Exception
    //   1609: dup
    //   1610: aload_3
    //   1611: invokevirtual getMessage : ()Ljava/lang/String;
    //   1614: invokespecial <init> : (Ljava/lang/String;)V
    //   1617: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1604	1605	java/lang/Throwable
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
    //   1446	1536	1539	java/lang/Throwable
    //   1491	1588	1591	java/lang/Throwable
    //   1543	1599	1599	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '£±.u`¶/ I§îÈOI\\f¼¬y¥Ó\\bÞI\\fR='-8Âff^hÚA\\tÚNiå.\\fÂMp«/Äµ¨wTâIl0OèÄ"&*ÕÜªð3¬â#jÍUCötLW`ÜõÁóW^$p»_:ìmVô <aZW]§\\nÔ«%ìu µfñ#ô»5æCÆ[3¤ë\\tÀjskÿÐÀ3J'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #12
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
    //   68: ldc 'Ð£÷uÔ»è\\t)ü¿{(<'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #97
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
    //   129: putstatic burp/Zkby.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zkby.b : [Ljava/lang/String;
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
    //   212: bipush #77
    //   214: goto -> 244
    //   217: bipush #67
    //   219: goto -> 244
    //   222: bipush #34
    //   224: goto -> 244
    //   227: bipush #13
    //   229: goto -> 244
    //   232: bipush #126
    //   234: goto -> 244
    //   237: bipush #48
    //   239: goto -> 244
    //   242: bipush #116
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
    //   300: sipush #-31558
    //   303: sipush #-19357
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zkby.Zf : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #57
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #115
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-14
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #70
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-5
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-114
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #72
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #47
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-38
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-79
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-44
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-32
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #28
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-51
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #41
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #51
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #38
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #31
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #10
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #-83
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-116
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-78
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-17
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-73
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #11
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-114
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #123
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #51
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #15
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-69
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #96
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #-62
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zkby.Zv : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF84BB) & 0xFFFF;
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
      char c = 'Á';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkby.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */