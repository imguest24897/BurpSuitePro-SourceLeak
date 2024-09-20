package burp;

import java.math.BigInteger;

class Zzh0 extends ClassLoader {
  static Object Z_;
  
  static String ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zz(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   250: ldc2_w 8682522807148012
    //   253: invokestatic currentTimeMillis : ()J
    //   256: lxor
    //   257: lstore #4
    //   259: lload #4
    //   261: ldc2_w 25214903917
    //   264: lmul
    //   265: ldc2_w 11
    //   268: ladd
    //   269: ldc2_w 281474976710655
    //   272: land
    //   273: lstore #4
    //   275: lload #4
    //   277: bipush #32
    //   279: lshl
    //   280: lstore #6
    //   282: lload #4
    //   284: ldc2_w 25214903917
    //   287: lmul
    //   288: ldc2_w 11
    //   291: ladd
    //   292: ldc2_w 281474976710655
    //   295: land
    //   296: lstore #4
    //   298: lload #6
    //   300: lload #4
    //   302: ladd
    //   303: lstore #6
    //   305: bipush #16
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #48
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #49
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #50
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #51
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #52
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #53
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #54
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #55
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #56
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #57
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #97
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #98
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #99
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #100
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #101
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #102
    //   398: bastore
    //   399: astore #8
    //   401: bipush #64
    //   403: newarray byte
    //   405: astore #9
    //   407: bipush #64
    //   409: istore #10
    //   411: bipush #16
    //   413: istore #11
    //   415: iload #11
    //   417: iconst_1
    //   418: isub
    //   419: i2l
    //   420: lstore #12
    //   422: aload #9
    //   424: iinc #10, -1
    //   427: iload #10
    //   429: aload #8
    //   431: lload #6
    //   433: lload #12
    //   435: land
    //   436: l2i
    //   437: baload
    //   438: bastore
    //   439: lload #6
    //   441: iconst_4
    //   442: lushr
    //   443: lstore #6
    //   445: lload #6
    //   447: lconst_0
    //   448: lcmp
    //   449: ifne -> 422
    //   452: bipush #64
    //   454: iload #10
    //   456: isub
    //   457: newarray byte
    //   459: astore_3
    //   460: iconst_0
    //   461: istore #14
    //   463: iload #14
    //   465: aload_3
    //   466: arraylength
    //   467: if_icmpge -> 489
    //   470: aload_3
    //   471: iload #14
    //   473: aload #9
    //   475: iload #10
    //   477: iload #14
    //   479: iadd
    //   480: baload
    //   481: bastore
    //   482: iinc #14, 1
    //   485: iload_2
    //   486: ifeq -> 463
    //   489: aload_3
    //   490: arraylength
    //   491: bipush #10
    //   493: if_icmplt -> 259
    //   496: sipush #21016
    //   499: sipush #29208
    //   502: invokestatic a : (II)Ljava/lang/String;
    //   505: iconst_1
    //   506: ldc burp/Zt5b
    //   508: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   511: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   514: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   517: astore_3
    //   518: aload_3
    //   519: arraylength
    //   520: istore #4
    //   522: iconst_0
    //   523: istore #5
    //   525: iload #5
    //   527: iload #4
    //   529: if_icmpge -> 666
    //   532: aload_3
    //   533: iload #5
    //   535: aaload
    //   536: astore #6
    //   538: aload #6
    //   540: invokevirtual getModifiers : ()I
    //   543: invokestatic isStatic : (I)Z
    //   546: ifne -> 556
    //   549: goto -> 659
    //   552: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   555: athrow
    //   556: aload #6
    //   558: invokevirtual getType : ()Ljava/lang/Class;
    //   561: astore #7
    //   563: aload #7
    //   565: ifnull -> 646
    //   568: aload #7
    //   570: invokevirtual isPrimitive : ()Z
    //   573: ifne -> 646
    //   576: goto -> 583
    //   579: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   582: athrow
    //   583: aload #7
    //   585: invokevirtual getPackage : ()Ljava/lang/Package;
    //   588: ifnull -> 646
    //   591: goto -> 598
    //   594: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   597: athrow
    //   598: aload #7
    //   600: invokevirtual getPackage : ()Ljava/lang/Package;
    //   603: invokevirtual getName : ()Ljava/lang/String;
    //   606: ifnull -> 646
    //   609: goto -> 616
    //   612: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   615: athrow
    //   616: aload #7
    //   618: invokevirtual getPackage : ()Ljava/lang/Package;
    //   621: invokevirtual getName : ()Ljava/lang/String;
    //   624: sipush #21007
    //   627: sipush #31514
    //   630: invokestatic a : (II)Ljava/lang/String;
    //   633: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   636: ifne -> 646
    //   639: goto -> 646
    //   642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   645: athrow
    //   646: aload #6
    //   648: iconst_1
    //   649: invokevirtual setAccessible : (Z)V
    //   652: aload #6
    //   654: aconst_null
    //   655: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   658: pop
    //   659: iinc #5, 1
    //   662: iload_2
    //   663: ifeq -> 525
    //   666: sipush #21000
    //   669: sipush #-6673
    //   672: invokestatic a : (II)Ljava/lang/String;
    //   675: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   678: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   681: astore_3
    //   682: aload_3
    //   683: arraylength
    //   684: istore #4
    //   686: iconst_0
    //   687: istore #5
    //   689: iload #5
    //   691: iload #4
    //   693: if_icmpge -> 825
    //   696: aload_3
    //   697: iload #5
    //   699: aaload
    //   700: astore #6
    //   702: aload #6
    //   704: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   707: pop
    //   708: aload #6
    //   710: invokevirtual getModifiers : ()I
    //   713: invokestatic isStatic : (I)Z
    //   716: ifeq -> 811
    //   719: aload #6
    //   721: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   724: arraylength
    //   725: iconst_2
    //   726: if_icmpne -> 811
    //   729: goto -> 736
    //   732: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   735: athrow
    //   736: aload #6
    //   738: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   741: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   744: invokevirtual equals : (Ljava/lang/Object;)Z
    //   747: ifeq -> 811
    //   750: goto -> 757
    //   753: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   756: athrow
    //   757: aload #6
    //   759: iconst_1
    //   760: invokevirtual setAccessible : (Z)V
    //   763: aload #6
    //   765: aconst_null
    //   766: iconst_2
    //   767: anewarray java/lang/Object
    //   770: dup
    //   771: iconst_0
    //   772: aload_0
    //   773: aastore
    //   774: dup
    //   775: iconst_1
    //   776: aload_1
    //   777: ifnonnull -> 795
    //   780: goto -> 787
    //   783: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   786: athrow
    //   787: aload_1
    //   788: goto -> 802
    //   791: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   794: athrow
    //   795: aload_1
    //   796: checkcast [B
    //   799: invokevirtual clone : ()Ljava/lang/Object;
    //   802: aastore
    //   803: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   806: pop
    //   807: iload_2
    //   808: ifeq -> 825
    //   811: iinc #5, 1
    //   814: iload_2
    //   815: ifeq -> 689
    //   818: goto -> 825
    //   821: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   824: athrow
    //   825: getstatic burp/Zmlu.Zi : Ljava/lang/Object;
    //   828: checkcast java/math/BigInteger
    //   831: invokevirtual intValue : ()I
    //   834: i2l
    //   835: invokestatic currentTimeMillis : ()J
    //   838: ladd
    //   839: getstatic burp/Ztys.Zs : Ljava/lang/Object;
    //   842: checkcast java/math/BigInteger
    //   845: invokevirtual intValue : ()I
    //   848: i2l
    //   849: lcmp
    //   850: ifge -> 1182
    //   853: sipush #21010
    //   856: sipush #-21393
    //   859: invokestatic a : (II)Ljava/lang/String;
    //   862: iconst_1
    //   863: ldc burp/Zrf9
    //   865: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   868: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   871: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   874: astore_3
    //   875: aload_3
    //   876: arraylength
    //   877: istore #4
    //   879: iconst_0
    //   880: istore #5
    //   882: iload #5
    //   884: iload #4
    //   886: if_icmpge -> 1023
    //   889: aload_3
    //   890: iload #5
    //   892: aaload
    //   893: astore #6
    //   895: aload #6
    //   897: invokevirtual getModifiers : ()I
    //   900: invokestatic isStatic : (I)Z
    //   903: ifne -> 913
    //   906: goto -> 1016
    //   909: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   912: athrow
    //   913: aload #6
    //   915: invokevirtual getType : ()Ljava/lang/Class;
    //   918: astore #7
    //   920: aload #7
    //   922: ifnull -> 1003
    //   925: aload #7
    //   927: invokevirtual isPrimitive : ()Z
    //   930: ifne -> 1003
    //   933: goto -> 940
    //   936: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   939: athrow
    //   940: aload #7
    //   942: invokevirtual getPackage : ()Ljava/lang/Package;
    //   945: ifnull -> 1003
    //   948: goto -> 955
    //   951: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   954: athrow
    //   955: aload #7
    //   957: invokevirtual getPackage : ()Ljava/lang/Package;
    //   960: invokevirtual getName : ()Ljava/lang/String;
    //   963: ifnull -> 1003
    //   966: goto -> 973
    //   969: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   972: athrow
    //   973: aload #7
    //   975: invokevirtual getPackage : ()Ljava/lang/Package;
    //   978: invokevirtual getName : ()Ljava/lang/String;
    //   981: sipush #20996
    //   984: sipush #-9577
    //   987: invokestatic a : (II)Ljava/lang/String;
    //   990: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   993: ifne -> 1003
    //   996: goto -> 1003
    //   999: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1002: athrow
    //   1003: aload #6
    //   1005: iconst_1
    //   1006: invokevirtual setAccessible : (Z)V
    //   1009: aload #6
    //   1011: aconst_null
    //   1012: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1015: pop
    //   1016: iinc #5, 1
    //   1019: iload_2
    //   1020: ifeq -> 882
    //   1023: sipush #21021
    //   1026: sipush #18967
    //   1029: invokestatic a : (II)Ljava/lang/String;
    //   1032: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1035: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1038: astore_3
    //   1039: aload_3
    //   1040: arraylength
    //   1041: istore #4
    //   1043: iconst_0
    //   1044: istore #5
    //   1046: iload #5
    //   1048: iload #4
    //   1050: if_icmpge -> 1182
    //   1053: aload_3
    //   1054: iload #5
    //   1056: aaload
    //   1057: astore #6
    //   1059: aload #6
    //   1061: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1064: pop
    //   1065: aload #6
    //   1067: invokevirtual getModifiers : ()I
    //   1070: invokestatic isStatic : (I)Z
    //   1073: ifeq -> 1168
    //   1076: aload #6
    //   1078: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1081: arraylength
    //   1082: iconst_2
    //   1083: if_icmpne -> 1168
    //   1086: goto -> 1093
    //   1089: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1092: athrow
    //   1093: aload #6
    //   1095: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1098: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1101: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1104: ifeq -> 1168
    //   1107: goto -> 1114
    //   1110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1113: athrow
    //   1114: aload #6
    //   1116: iconst_1
    //   1117: invokevirtual setAccessible : (Z)V
    //   1120: aload #6
    //   1122: aconst_null
    //   1123: iconst_2
    //   1124: anewarray java/lang/Object
    //   1127: dup
    //   1128: iconst_0
    //   1129: aload_0
    //   1130: aastore
    //   1131: dup
    //   1132: iconst_1
    //   1133: aload_1
    //   1134: ifnonnull -> 1152
    //   1137: goto -> 1144
    //   1140: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1143: athrow
    //   1144: aload_1
    //   1145: goto -> 1159
    //   1148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1151: athrow
    //   1152: aload_1
    //   1153: checkcast [B
    //   1156: invokevirtual clone : ()Ljava/lang/Object;
    //   1159: aastore
    //   1160: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1163: pop
    //   1164: iload_2
    //   1165: ifeq -> 1182
    //   1168: iinc #5, 1
    //   1171: iload_2
    //   1172: ifeq -> 1046
    //   1175: goto -> 1182
    //   1178: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1181: athrow
    //   1182: new java/io/ByteArrayOutputStream
    //   1185: dup
    //   1186: invokespecial <init> : ()V
    //   1189: astore_3
    //   1190: getstatic burp/Zlsw.ZE : Ljava/lang/String;
    //   1193: astore #4
    //   1195: iconst_0
    //   1196: istore #5
    //   1198: iload #5
    //   1200: aload #4
    //   1202: invokevirtual length : ()I
    //   1205: if_icmpge -> 1235
    //   1208: aload_3
    //   1209: aload #4
    //   1211: iload #5
    //   1213: iload #5
    //   1215: iconst_2
    //   1216: iadd
    //   1217: invokevirtual substring : (II)Ljava/lang/String;
    //   1220: bipush #16
    //   1222: invokestatic parseInt : (Ljava/lang/String;I)I
    //   1225: invokevirtual write : (I)V
    //   1228: iinc #5, 2
    //   1231: iload_2
    //   1232: ifeq -> 1198
    //   1235: aload_3
    //   1236: invokevirtual toByteArray : ()[B
    //   1239: astore #5
    //   1241: getstatic burp/Zz35.ZB : Ljava/lang/Object;
    //   1244: checkcast java/math/BigInteger
    //   1247: invokevirtual toByteArray : ()[B
    //   1250: astore #6
    //   1252: sipush #256
    //   1255: newarray byte
    //   1257: astore #8
    //   1259: sipush #256
    //   1262: newarray int
    //   1264: astore #9
    //   1266: sipush #256
    //   1269: newarray int
    //   1271: astore #10
    //   1273: sipush #256
    //   1276: newarray int
    //   1278: astore #11
    //   1280: sipush #256
    //   1283: newarray int
    //   1285: astore #12
    //   1287: bipush #10
    //   1289: newarray int
    //   1291: astore #13
    //   1293: sipush #283
    //   1296: istore #14
    //   1298: iconst_0
    //   1299: istore #16
    //   1301: iload #16
    //   1303: sipush #256
    //   1306: if_icmpge -> 1540
    //   1309: sipush #21011
    //   1312: sipush #31209
    //   1315: invokestatic a : (II)Ljava/lang/String;
    //   1318: iload #16
    //   1320: iconst_1
    //   1321: iushr
    //   1322: invokevirtual charAt : (I)C
    //   1325: istore #25
    //   1327: iload #16
    //   1329: iconst_1
    //   1330: iand
    //   1331: ifne -> 1346
    //   1334: iload #25
    //   1336: bipush #8
    //   1338: iushr
    //   1339: goto -> 1348
    //   1342: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1345: athrow
    //   1346: iload #25
    //   1348: i2b
    //   1349: sipush #255
    //   1352: iand
    //   1353: istore #15
    //   1355: iload #16
    //   1357: iconst_1
    //   1358: ishl
    //   1359: istore #17
    //   1361: iload #17
    //   1363: sipush #256
    //   1366: if_icmplt -> 1376
    //   1369: iload #17
    //   1371: iload #14
    //   1373: ixor
    //   1374: istore #17
    //   1376: iload #17
    //   1378: iconst_1
    //   1379: ishl
    //   1380: istore #18
    //   1382: iload #18
    //   1384: sipush #256
    //   1387: if_icmplt -> 1397
    //   1390: iload #18
    //   1392: iload #14
    //   1394: ixor
    //   1395: istore #18
    //   1397: iload #18
    //   1399: iconst_1
    //   1400: ishl
    //   1401: istore #19
    //   1403: iload #19
    //   1405: sipush #256
    //   1408: if_icmplt -> 1418
    //   1411: iload #19
    //   1413: iload #14
    //   1415: ixor
    //   1416: istore #19
    //   1418: iload #19
    //   1420: iload #16
    //   1422: ixor
    //   1423: istore #20
    //   1425: iload #20
    //   1427: iload #17
    //   1429: ixor
    //   1430: istore #21
    //   1432: iload #20
    //   1434: iload #18
    //   1436: ixor
    //   1437: istore #22
    //   1439: iload #19
    //   1441: iload #18
    //   1443: ixor
    //   1444: iload #17
    //   1446: ixor
    //   1447: istore #23
    //   1449: aload #8
    //   1451: iload #16
    //   1453: iload #15
    //   1455: i2b
    //   1456: bastore
    //   1457: aload #9
    //   1459: iload #15
    //   1461: iload #23
    //   1463: bipush #24
    //   1465: ishl
    //   1466: iload #20
    //   1468: bipush #16
    //   1470: ishl
    //   1471: ior
    //   1472: iload #22
    //   1474: bipush #8
    //   1476: ishl
    //   1477: ior
    //   1478: iload #21
    //   1480: ior
    //   1481: dup
    //   1482: istore #24
    //   1484: iastore
    //   1485: aload #10
    //   1487: iload #15
    //   1489: iload #24
    //   1491: bipush #8
    //   1493: iushr
    //   1494: iload #24
    //   1496: bipush #24
    //   1498: ishl
    //   1499: ior
    //   1500: iastore
    //   1501: aload #11
    //   1503: iload #15
    //   1505: iload #24
    //   1507: bipush #16
    //   1509: iushr
    //   1510: iload #24
    //   1512: bipush #16
    //   1514: ishl
    //   1515: ior
    //   1516: iastore
    //   1517: aload #12
    //   1519: iload #15
    //   1521: iload #24
    //   1523: bipush #24
    //   1525: iushr
    //   1526: iload #24
    //   1528: bipush #8
    //   1530: ishl
    //   1531: ior
    //   1532: iastore
    //   1533: iinc #16, 1
    //   1536: iload_2
    //   1537: ifeq -> 1301
    //   1540: iconst_1
    //   1541: istore #25
    //   1543: aload #13
    //   1545: iconst_0
    //   1546: iload #25
    //   1548: bipush #24
    //   1550: ishl
    //   1551: iastore
    //   1552: iconst_1
    //   1553: istore #26
    //   1555: iload #26
    //   1557: bipush #10
    //   1559: if_icmpge -> 1600
    //   1562: iload #25
    //   1564: iconst_1
    //   1565: ishl
    //   1566: istore #25
    //   1568: iload #25
    //   1570: sipush #256
    //   1573: if_icmplt -> 1583
    //   1576: iload #25
    //   1578: iload #14
    //   1580: ixor
    //   1581: istore #25
    //   1583: aload #13
    //   1585: iload #26
    //   1587: iload #25
    //   1589: bipush #24
    //   1591: ishl
    //   1592: iastore
    //   1593: iinc #26, 1
    //   1596: iload_2
    //   1597: ifeq -> 1555
    //   1600: iconst_4
    //   1601: istore #26
    //   1603: iload #26
    //   1605: bipush #6
    //   1607: iadd
    //   1608: istore #27
    //   1610: iconst_4
    //   1611: iload #27
    //   1613: iconst_1
    //   1614: iadd
    //   1615: imul
    //   1616: istore #28
    //   1618: iload #28
    //   1620: newarray int
    //   1622: astore #29
    //   1624: iload #28
    //   1626: newarray int
    //   1628: astore #30
    //   1630: iconst_0
    //   1631: istore #25
    //   1633: iconst_0
    //   1634: istore #32
    //   1636: iconst_0
    //   1637: istore #33
    //   1639: iload #32
    //   1641: iload #26
    //   1643: if_icmpge -> 1711
    //   1646: aload #29
    //   1648: iload #32
    //   1650: aload #5
    //   1652: iload #33
    //   1654: baload
    //   1655: bipush #24
    //   1657: ishl
    //   1658: aload #5
    //   1660: iload #33
    //   1662: iconst_1
    //   1663: iadd
    //   1664: baload
    //   1665: sipush #255
    //   1668: iand
    //   1669: bipush #16
    //   1671: ishl
    //   1672: ior
    //   1673: aload #5
    //   1675: iload #33
    //   1677: iconst_2
    //   1678: iadd
    //   1679: baload
    //   1680: sipush #255
    //   1683: iand
    //   1684: bipush #8
    //   1686: ishl
    //   1687: ior
    //   1688: aload #5
    //   1690: iload #33
    //   1692: iconst_3
    //   1693: iadd
    //   1694: baload
    //   1695: sipush #255
    //   1698: iand
    //   1699: ior
    //   1700: iastore
    //   1701: iinc #32, 1
    //   1704: iinc #33, 4
    //   1707: iload_2
    //   1708: ifeq -> 1639
    //   1711: iload #26
    //   1713: istore #32
    //   1715: iconst_0
    //   1716: istore #33
    //   1718: iload #32
    //   1720: iload #28
    //   1722: if_icmpge -> 1849
    //   1725: aload #29
    //   1727: iload #32
    //   1729: iconst_1
    //   1730: isub
    //   1731: iaload
    //   1732: istore #31
    //   1734: iload #33
    //   1736: ifne -> 1823
    //   1739: iload #26
    //   1741: istore #33
    //   1743: aload #8
    //   1745: iload #31
    //   1747: bipush #16
    //   1749: iushr
    //   1750: sipush #255
    //   1753: iand
    //   1754: baload
    //   1755: bipush #24
    //   1757: ishl
    //   1758: aload #8
    //   1760: iload #31
    //   1762: bipush #8
    //   1764: iushr
    //   1765: sipush #255
    //   1768: iand
    //   1769: baload
    //   1770: sipush #255
    //   1773: iand
    //   1774: bipush #16
    //   1776: ishl
    //   1777: ior
    //   1778: aload #8
    //   1780: iload #31
    //   1782: sipush #255
    //   1785: iand
    //   1786: baload
    //   1787: sipush #255
    //   1790: iand
    //   1791: bipush #8
    //   1793: ishl
    //   1794: ior
    //   1795: aload #8
    //   1797: iload #31
    //   1799: bipush #24
    //   1801: iushr
    //   1802: baload
    //   1803: sipush #255
    //   1806: iand
    //   1807: ior
    //   1808: istore #31
    //   1810: iload #31
    //   1812: aload #13
    //   1814: iload #25
    //   1816: iinc #25, 1
    //   1819: iaload
    //   1820: ixor
    //   1821: istore #31
    //   1823: aload #29
    //   1825: iload #32
    //   1827: aload #29
    //   1829: iload #32
    //   1831: iload #26
    //   1833: isub
    //   1834: iaload
    //   1835: iload #31
    //   1837: ixor
    //   1838: iastore
    //   1839: iinc #32, 1
    //   1842: iinc #33, -1
    //   1845: iload_2
    //   1846: ifeq -> 1718
    //   1849: iconst_0
    //   1850: istore #32
    //   1852: iconst_4
    //   1853: iload #27
    //   1855: imul
    //   1856: istore #33
    //   1858: aload #30
    //   1860: iload #32
    //   1862: aload #29
    //   1864: iload #33
    //   1866: iaload
    //   1867: iastore
    //   1868: aload #30
    //   1870: iload #32
    //   1872: iconst_1
    //   1873: iadd
    //   1874: aload #29
    //   1876: iload #33
    //   1878: iconst_1
    //   1879: iadd
    //   1880: iaload
    //   1881: iastore
    //   1882: aload #30
    //   1884: iload #32
    //   1886: iconst_2
    //   1887: iadd
    //   1888: aload #29
    //   1890: iload #33
    //   1892: iconst_2
    //   1893: iadd
    //   1894: iaload
    //   1895: iastore
    //   1896: aload #30
    //   1898: iload #32
    //   1900: iconst_3
    //   1901: iadd
    //   1902: aload #29
    //   1904: iload #33
    //   1906: iconst_3
    //   1907: iadd
    //   1908: iaload
    //   1909: iastore
    //   1910: iinc #32, 4
    //   1913: iinc #33, -4
    //   1916: iconst_1
    //   1917: istore #35
    //   1919: iload #35
    //   1921: iload #27
    //   1923: if_icmpge -> 2287
    //   1926: aload #29
    //   1928: iload #33
    //   1930: iaload
    //   1931: istore #34
    //   1933: aload #30
    //   1935: iload #32
    //   1937: aload #9
    //   1939: aload #8
    //   1941: iload #34
    //   1943: bipush #24
    //   1945: iushr
    //   1946: baload
    //   1947: sipush #255
    //   1950: iand
    //   1951: iaload
    //   1952: aload #10
    //   1954: aload #8
    //   1956: iload #34
    //   1958: bipush #16
    //   1960: iushr
    //   1961: sipush #255
    //   1964: iand
    //   1965: baload
    //   1966: sipush #255
    //   1969: iand
    //   1970: iaload
    //   1971: ixor
    //   1972: aload #11
    //   1974: aload #8
    //   1976: iload #34
    //   1978: bipush #8
    //   1980: iushr
    //   1981: sipush #255
    //   1984: iand
    //   1985: baload
    //   1986: sipush #255
    //   1989: iand
    //   1990: iaload
    //   1991: ixor
    //   1992: aload #12
    //   1994: aload #8
    //   1996: iload #34
    //   1998: sipush #255
    //   2001: iand
    //   2002: baload
    //   2003: sipush #255
    //   2006: iand
    //   2007: iaload
    //   2008: ixor
    //   2009: iastore
    //   2010: aload #29
    //   2012: iload #33
    //   2014: iconst_1
    //   2015: iadd
    //   2016: iaload
    //   2017: istore #34
    //   2019: aload #30
    //   2021: iload #32
    //   2023: iconst_1
    //   2024: iadd
    //   2025: aload #9
    //   2027: aload #8
    //   2029: iload #34
    //   2031: bipush #24
    //   2033: iushr
    //   2034: baload
    //   2035: sipush #255
    //   2038: iand
    //   2039: iaload
    //   2040: aload #10
    //   2042: aload #8
    //   2044: iload #34
    //   2046: bipush #16
    //   2048: iushr
    //   2049: sipush #255
    //   2052: iand
    //   2053: baload
    //   2054: sipush #255
    //   2057: iand
    //   2058: iaload
    //   2059: ixor
    //   2060: aload #11
    //   2062: aload #8
    //   2064: iload #34
    //   2066: bipush #8
    //   2068: iushr
    //   2069: sipush #255
    //   2072: iand
    //   2073: baload
    //   2074: sipush #255
    //   2077: iand
    //   2078: iaload
    //   2079: ixor
    //   2080: aload #12
    //   2082: aload #8
    //   2084: iload #34
    //   2086: sipush #255
    //   2089: iand
    //   2090: baload
    //   2091: sipush #255
    //   2094: iand
    //   2095: iaload
    //   2096: ixor
    //   2097: iastore
    //   2098: aload #29
    //   2100: iload #33
    //   2102: iconst_2
    //   2103: iadd
    //   2104: iaload
    //   2105: istore #34
    //   2107: aload #30
    //   2109: iload #32
    //   2111: iconst_2
    //   2112: iadd
    //   2113: aload #9
    //   2115: aload #8
    //   2117: iload #34
    //   2119: bipush #24
    //   2121: iushr
    //   2122: baload
    //   2123: sipush #255
    //   2126: iand
    //   2127: iaload
    //   2128: aload #10
    //   2130: aload #8
    //   2132: iload #34
    //   2134: bipush #16
    //   2136: iushr
    //   2137: sipush #255
    //   2140: iand
    //   2141: baload
    //   2142: sipush #255
    //   2145: iand
    //   2146: iaload
    //   2147: ixor
    //   2148: aload #11
    //   2150: aload #8
    //   2152: iload #34
    //   2154: bipush #8
    //   2156: iushr
    //   2157: sipush #255
    //   2160: iand
    //   2161: baload
    //   2162: sipush #255
    //   2165: iand
    //   2166: iaload
    //   2167: ixor
    //   2168: aload #12
    //   2170: aload #8
    //   2172: iload #34
    //   2174: sipush #255
    //   2177: iand
    //   2178: baload
    //   2179: sipush #255
    //   2182: iand
    //   2183: iaload
    //   2184: ixor
    //   2185: iastore
    //   2186: aload #29
    //   2188: iload #33
    //   2190: iconst_3
    //   2191: iadd
    //   2192: iaload
    //   2193: istore #34
    //   2195: aload #30
    //   2197: iload #32
    //   2199: iconst_3
    //   2200: iadd
    //   2201: aload #9
    //   2203: aload #8
    //   2205: iload #34
    //   2207: bipush #24
    //   2209: iushr
    //   2210: baload
    //   2211: sipush #255
    //   2214: iand
    //   2215: iaload
    //   2216: aload #10
    //   2218: aload #8
    //   2220: iload #34
    //   2222: bipush #16
    //   2224: iushr
    //   2225: sipush #255
    //   2228: iand
    //   2229: baload
    //   2230: sipush #255
    //   2233: iand
    //   2234: iaload
    //   2235: ixor
    //   2236: aload #11
    //   2238: aload #8
    //   2240: iload #34
    //   2242: bipush #8
    //   2244: iushr
    //   2245: sipush #255
    //   2248: iand
    //   2249: baload
    //   2250: sipush #255
    //   2253: iand
    //   2254: iaload
    //   2255: ixor
    //   2256: aload #12
    //   2258: aload #8
    //   2260: iload #34
    //   2262: sipush #255
    //   2265: iand
    //   2266: baload
    //   2267: sipush #255
    //   2270: iand
    //   2271: iaload
    //   2272: ixor
    //   2273: iastore
    //   2274: iinc #32, 4
    //   2277: iinc #33, -4
    //   2280: iinc #35, 1
    //   2283: iload_2
    //   2284: ifeq -> 1919
    //   2287: aload #30
    //   2289: iload #32
    //   2291: aload #29
    //   2293: iload #33
    //   2295: iaload
    //   2296: iastore
    //   2297: aload #30
    //   2299: iload #32
    //   2301: iconst_1
    //   2302: iadd
    //   2303: aload #29
    //   2305: iload #33
    //   2307: iconst_1
    //   2308: iadd
    //   2309: iaload
    //   2310: iastore
    //   2311: aload #30
    //   2313: iload #32
    //   2315: iconst_2
    //   2316: iadd
    //   2317: aload #29
    //   2319: iload #33
    //   2321: iconst_2
    //   2322: iadd
    //   2323: iaload
    //   2324: iastore
    //   2325: aload #30
    //   2327: iload #32
    //   2329: iconst_3
    //   2330: iadd
    //   2331: aload #29
    //   2333: iload #33
    //   2335: iconst_3
    //   2336: iadd
    //   2337: iaload
    //   2338: iastore
    //   2339: iconst_0
    //   2340: newarray byte
    //   2342: astore #35
    //   2344: aload #6
    //   2346: arraylength
    //   2347: bipush #16
    //   2349: irem
    //   2350: ifeq -> 2374
    //   2353: new java/lang/Exception
    //   2356: dup
    //   2357: sipush #21005
    //   2360: sipush #9463
    //   2363: invokestatic a : (II)Ljava/lang/String;
    //   2366: invokespecial <init> : (Ljava/lang/String;)V
    //   2369: athrow
    //   2370: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2373: athrow
    //   2374: bipush #10
    //   2376: istore #36
    //   2378: sipush #20993
    //   2381: sipush #256
    //   2384: newarray byte
    //   2386: astore #37
    //   2388: sipush #7284
    //   2391: sipush #256
    //   2394: newarray int
    //   2396: astore #38
    //   2398: sipush #256
    //   2401: newarray int
    //   2403: astore #39
    //   2405: sipush #256
    //   2408: newarray int
    //   2410: astore #40
    //   2412: sipush #256
    //   2415: newarray int
    //   2417: astore #41
    //   2419: sipush #283
    //   2422: istore #14
    //   2424: invokestatic a : (II)Ljava/lang/String;
    //   2427: astore #42
    //   2429: iconst_0
    //   2430: istore #16
    //   2432: iload #16
    //   2434: sipush #256
    //   2437: if_icmpge -> 2664
    //   2440: aload #42
    //   2442: iload #16
    //   2444: iconst_1
    //   2445: iushr
    //   2446: invokevirtual charAt : (I)C
    //   2449: istore #43
    //   2451: iload #16
    //   2453: iconst_1
    //   2454: iand
    //   2455: ifne -> 2470
    //   2458: iload #43
    //   2460: bipush #8
    //   2462: iushr
    //   2463: goto -> 2472
    //   2466: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2469: athrow
    //   2470: iload #43
    //   2472: i2b
    //   2473: sipush #255
    //   2476: iand
    //   2477: istore #15
    //   2479: iload #16
    //   2481: iconst_1
    //   2482: ishl
    //   2483: istore #17
    //   2485: iload #17
    //   2487: sipush #256
    //   2490: if_icmplt -> 2500
    //   2493: iload #17
    //   2495: iload #14
    //   2497: ixor
    //   2498: istore #17
    //   2500: iload #17
    //   2502: iconst_1
    //   2503: ishl
    //   2504: istore #18
    //   2506: iload #18
    //   2508: sipush #256
    //   2511: if_icmplt -> 2521
    //   2514: iload #18
    //   2516: iload #14
    //   2518: ixor
    //   2519: istore #18
    //   2521: iload #18
    //   2523: iconst_1
    //   2524: ishl
    //   2525: istore #19
    //   2527: iload #19
    //   2529: sipush #256
    //   2532: if_icmplt -> 2542
    //   2535: iload #19
    //   2537: iload #14
    //   2539: ixor
    //   2540: istore #19
    //   2542: iload #19
    //   2544: iload #16
    //   2546: ixor
    //   2547: istore #20
    //   2549: iload #20
    //   2551: iload #17
    //   2553: ixor
    //   2554: istore #21
    //   2556: iload #20
    //   2558: iload #18
    //   2560: ixor
    //   2561: istore #22
    //   2563: iload #19
    //   2565: iload #18
    //   2567: ixor
    //   2568: iload #17
    //   2570: ixor
    //   2571: istore #23
    //   2573: aload #37
    //   2575: iload #15
    //   2577: iload #16
    //   2579: i2b
    //   2580: bastore
    //   2581: aload #38
    //   2583: iload #15
    //   2585: iload #23
    //   2587: bipush #24
    //   2589: ishl
    //   2590: iload #20
    //   2592: bipush #16
    //   2594: ishl
    //   2595: ior
    //   2596: iload #22
    //   2598: bipush #8
    //   2600: ishl
    //   2601: ior
    //   2602: iload #21
    //   2604: ior
    //   2605: dup
    //   2606: istore #24
    //   2608: iastore
    //   2609: aload #39
    //   2611: iload #15
    //   2613: iload #24
    //   2615: bipush #8
    //   2617: iushr
    //   2618: iload #24
    //   2620: bipush #24
    //   2622: ishl
    //   2623: ior
    //   2624: iastore
    //   2625: aload #40
    //   2627: iload #15
    //   2629: iload #24
    //   2631: bipush #16
    //   2633: iushr
    //   2634: iload #24
    //   2636: bipush #16
    //   2638: ishl
    //   2639: ior
    //   2640: iastore
    //   2641: aload #41
    //   2643: iload #15
    //   2645: iload #24
    //   2647: bipush #24
    //   2649: iushr
    //   2650: iload #24
    //   2652: bipush #8
    //   2654: ishl
    //   2655: ior
    //   2656: iastore
    //   2657: iinc #16, 1
    //   2660: iload_2
    //   2661: ifeq -> 2432
    //   2664: aload #6
    //   2666: arraylength
    //   2667: newarray byte
    //   2669: astore #43
    //   2671: iconst_0
    //   2672: istore #44
    //   2674: iload #44
    //   2676: aload #6
    //   2678: arraylength
    //   2679: bipush #16
    //   2681: idiv
    //   2682: if_icmpge -> 3596
    //   2685: bipush #16
    //   2687: newarray byte
    //   2689: astore #45
    //   2691: bipush #16
    //   2693: newarray byte
    //   2695: astore #46
    //   2697: iconst_0
    //   2698: istore #47
    //   2700: iload #47
    //   2702: bipush #16
    //   2704: if_icmpge -> 2730
    //   2707: aload #45
    //   2709: iload #47
    //   2711: aload #6
    //   2713: iload #47
    //   2715: iload #44
    //   2717: bipush #16
    //   2719: imul
    //   2720: iadd
    //   2721: baload
    //   2722: bastore
    //   2723: iinc #47, 1
    //   2726: iload_2
    //   2727: ifeq -> 2700
    //   2730: iconst_0
    //   2731: istore #47
    //   2733: aload #45
    //   2735: iconst_0
    //   2736: baload
    //   2737: bipush #24
    //   2739: ishl
    //   2740: aload #45
    //   2742: iconst_1
    //   2743: baload
    //   2744: sipush #255
    //   2747: iand
    //   2748: bipush #16
    //   2750: ishl
    //   2751: ior
    //   2752: aload #45
    //   2754: iconst_2
    //   2755: baload
    //   2756: sipush #255
    //   2759: iand
    //   2760: bipush #8
    //   2762: ishl
    //   2763: ior
    //   2764: aload #45
    //   2766: iconst_3
    //   2767: baload
    //   2768: sipush #255
    //   2771: iand
    //   2772: ior
    //   2773: aload #30
    //   2775: iconst_0
    //   2776: iaload
    //   2777: ixor
    //   2778: istore #49
    //   2780: aload #45
    //   2782: iconst_4
    //   2783: baload
    //   2784: bipush #24
    //   2786: ishl
    //   2787: aload #45
    //   2789: iconst_5
    //   2790: baload
    //   2791: sipush #255
    //   2794: iand
    //   2795: bipush #16
    //   2797: ishl
    //   2798: ior
    //   2799: aload #45
    //   2801: bipush #6
    //   2803: baload
    //   2804: sipush #255
    //   2807: iand
    //   2808: bipush #8
    //   2810: ishl
    //   2811: ior
    //   2812: aload #45
    //   2814: bipush #7
    //   2816: baload
    //   2817: sipush #255
    //   2820: iand
    //   2821: ior
    //   2822: aload #30
    //   2824: iconst_1
    //   2825: iaload
    //   2826: ixor
    //   2827: istore #50
    //   2829: aload #45
    //   2831: bipush #8
    //   2833: baload
    //   2834: bipush #24
    //   2836: ishl
    //   2837: aload #45
    //   2839: bipush #9
    //   2841: baload
    //   2842: sipush #255
    //   2845: iand
    //   2846: bipush #16
    //   2848: ishl
    //   2849: ior
    //   2850: aload #45
    //   2852: bipush #10
    //   2854: baload
    //   2855: sipush #255
    //   2858: iand
    //   2859: bipush #8
    //   2861: ishl
    //   2862: ior
    //   2863: aload #45
    //   2865: bipush #11
    //   2867: baload
    //   2868: sipush #255
    //   2871: iand
    //   2872: ior
    //   2873: aload #30
    //   2875: iconst_2
    //   2876: iaload
    //   2877: ixor
    //   2878: istore #51
    //   2880: aload #45
    //   2882: bipush #12
    //   2884: baload
    //   2885: bipush #24
    //   2887: ishl
    //   2888: aload #45
    //   2890: bipush #13
    //   2892: baload
    //   2893: sipush #255
    //   2896: iand
    //   2897: bipush #16
    //   2899: ishl
    //   2900: ior
    //   2901: aload #45
    //   2903: bipush #14
    //   2905: baload
    //   2906: sipush #255
    //   2909: iand
    //   2910: bipush #8
    //   2912: ishl
    //   2913: ior
    //   2914: aload #45
    //   2916: bipush #15
    //   2918: baload
    //   2919: sipush #255
    //   2922: iand
    //   2923: ior
    //   2924: aload #30
    //   2926: iconst_3
    //   2927: iaload
    //   2928: ixor
    //   2929: istore #52
    //   2931: iconst_1
    //   2932: istore #53
    //   2934: iload #53
    //   2936: iload #36
    //   2938: if_icmpge -> 3181
    //   2941: iinc #47, 4
    //   2944: aload #38
    //   2946: iload #49
    //   2948: bipush #24
    //   2950: iushr
    //   2951: iaload
    //   2952: aload #39
    //   2954: iload #52
    //   2956: bipush #16
    //   2958: iushr
    //   2959: sipush #255
    //   2962: iand
    //   2963: iaload
    //   2964: ixor
    //   2965: aload #40
    //   2967: iload #51
    //   2969: bipush #8
    //   2971: iushr
    //   2972: sipush #255
    //   2975: iand
    //   2976: iaload
    //   2977: ixor
    //   2978: aload #41
    //   2980: iload #50
    //   2982: sipush #255
    //   2985: iand
    //   2986: iaload
    //   2987: ixor
    //   2988: aload #30
    //   2990: iload #47
    //   2992: iaload
    //   2993: ixor
    //   2994: istore #54
    //   2996: aload #38
    //   2998: iload #50
    //   3000: bipush #24
    //   3002: iushr
    //   3003: iaload
    //   3004: aload #39
    //   3006: iload #49
    //   3008: bipush #16
    //   3010: iushr
    //   3011: sipush #255
    //   3014: iand
    //   3015: iaload
    //   3016: ixor
    //   3017: aload #40
    //   3019: iload #52
    //   3021: bipush #8
    //   3023: iushr
    //   3024: sipush #255
    //   3027: iand
    //   3028: iaload
    //   3029: ixor
    //   3030: aload #41
    //   3032: iload #51
    //   3034: sipush #255
    //   3037: iand
    //   3038: iaload
    //   3039: ixor
    //   3040: aload #30
    //   3042: iload #47
    //   3044: iconst_1
    //   3045: iadd
    //   3046: iaload
    //   3047: ixor
    //   3048: istore #55
    //   3050: aload #38
    //   3052: iload #51
    //   3054: bipush #24
    //   3056: iushr
    //   3057: iaload
    //   3058: aload #39
    //   3060: iload #50
    //   3062: bipush #16
    //   3064: iushr
    //   3065: sipush #255
    //   3068: iand
    //   3069: iaload
    //   3070: ixor
    //   3071: aload #40
    //   3073: iload #49
    //   3075: bipush #8
    //   3077: iushr
    //   3078: sipush #255
    //   3081: iand
    //   3082: iaload
    //   3083: ixor
    //   3084: aload #41
    //   3086: iload #52
    //   3088: sipush #255
    //   3091: iand
    //   3092: iaload
    //   3093: ixor
    //   3094: aload #30
    //   3096: iload #47
    //   3098: iconst_2
    //   3099: iadd
    //   3100: iaload
    //   3101: ixor
    //   3102: istore #56
    //   3104: aload #38
    //   3106: iload #52
    //   3108: bipush #24
    //   3110: iushr
    //   3111: iaload
    //   3112: aload #39
    //   3114: iload #51
    //   3116: bipush #16
    //   3118: iushr
    //   3119: sipush #255
    //   3122: iand
    //   3123: iaload
    //   3124: ixor
    //   3125: aload #40
    //   3127: iload #50
    //   3129: bipush #8
    //   3131: iushr
    //   3132: sipush #255
    //   3135: iand
    //   3136: iaload
    //   3137: ixor
    //   3138: aload #41
    //   3140: iload #49
    //   3142: sipush #255
    //   3145: iand
    //   3146: iaload
    //   3147: ixor
    //   3148: aload #30
    //   3150: iload #47
    //   3152: iconst_3
    //   3153: iadd
    //   3154: iaload
    //   3155: ixor
    //   3156: istore #57
    //   3158: iload #54
    //   3160: istore #49
    //   3162: iload #55
    //   3164: istore #50
    //   3166: iload #56
    //   3168: istore #51
    //   3170: iload #57
    //   3172: istore #52
    //   3174: iinc #53, 1
    //   3177: iload_2
    //   3178: ifeq -> 2934
    //   3181: iinc #47, 4
    //   3184: aload #30
    //   3186: iload #47
    //   3188: iaload
    //   3189: istore #48
    //   3191: aload #46
    //   3193: iconst_0
    //   3194: aload #37
    //   3196: iload #49
    //   3198: bipush #24
    //   3200: iushr
    //   3201: baload
    //   3202: iload #48
    //   3204: bipush #24
    //   3206: iushr
    //   3207: ixor
    //   3208: i2b
    //   3209: bastore
    //   3210: aload #46
    //   3212: iconst_1
    //   3213: aload #37
    //   3215: iload #52
    //   3217: bipush #16
    //   3219: iushr
    //   3220: sipush #255
    //   3223: iand
    //   3224: baload
    //   3225: iload #48
    //   3227: bipush #16
    //   3229: iushr
    //   3230: ixor
    //   3231: i2b
    //   3232: bastore
    //   3233: aload #46
    //   3235: iconst_2
    //   3236: aload #37
    //   3238: iload #51
    //   3240: bipush #8
    //   3242: iushr
    //   3243: sipush #255
    //   3246: iand
    //   3247: baload
    //   3248: iload #48
    //   3250: bipush #8
    //   3252: iushr
    //   3253: ixor
    //   3254: i2b
    //   3255: bastore
    //   3256: aload #46
    //   3258: iconst_3
    //   3259: aload #37
    //   3261: iload #50
    //   3263: sipush #255
    //   3266: iand
    //   3267: baload
    //   3268: iload #48
    //   3270: ixor
    //   3271: i2b
    //   3272: bastore
    //   3273: aload #30
    //   3275: iload #47
    //   3277: iconst_1
    //   3278: iadd
    //   3279: iaload
    //   3280: istore #48
    //   3282: aload #46
    //   3284: iconst_4
    //   3285: aload #37
    //   3287: iload #50
    //   3289: bipush #24
    //   3291: iushr
    //   3292: baload
    //   3293: iload #48
    //   3295: bipush #24
    //   3297: iushr
    //   3298: ixor
    //   3299: i2b
    //   3300: bastore
    //   3301: aload #46
    //   3303: iconst_5
    //   3304: aload #37
    //   3306: iload #49
    //   3308: bipush #16
    //   3310: iushr
    //   3311: sipush #255
    //   3314: iand
    //   3315: baload
    //   3316: iload #48
    //   3318: bipush #16
    //   3320: iushr
    //   3321: ixor
    //   3322: i2b
    //   3323: bastore
    //   3324: aload #46
    //   3326: bipush #6
    //   3328: aload #37
    //   3330: iload #52
    //   3332: bipush #8
    //   3334: iushr
    //   3335: sipush #255
    //   3338: iand
    //   3339: baload
    //   3340: iload #48
    //   3342: bipush #8
    //   3344: iushr
    //   3345: ixor
    //   3346: i2b
    //   3347: bastore
    //   3348: aload #46
    //   3350: bipush #7
    //   3352: aload #37
    //   3354: iload #51
    //   3356: sipush #255
    //   3359: iand
    //   3360: baload
    //   3361: iload #48
    //   3363: ixor
    //   3364: i2b
    //   3365: bastore
    //   3366: aload #30
    //   3368: iload #47
    //   3370: iconst_2
    //   3371: iadd
    //   3372: iaload
    //   3373: istore #48
    //   3375: aload #46
    //   3377: bipush #8
    //   3379: aload #37
    //   3381: iload #51
    //   3383: bipush #24
    //   3385: iushr
    //   3386: baload
    //   3387: iload #48
    //   3389: bipush #24
    //   3391: iushr
    //   3392: ixor
    //   3393: i2b
    //   3394: bastore
    //   3395: aload #46
    //   3397: bipush #9
    //   3399: aload #37
    //   3401: iload #50
    //   3403: bipush #16
    //   3405: iushr
    //   3406: sipush #255
    //   3409: iand
    //   3410: baload
    //   3411: iload #48
    //   3413: bipush #16
    //   3415: iushr
    //   3416: ixor
    //   3417: i2b
    //   3418: bastore
    //   3419: aload #46
    //   3421: bipush #10
    //   3423: aload #37
    //   3425: iload #49
    //   3427: bipush #8
    //   3429: iushr
    //   3430: sipush #255
    //   3433: iand
    //   3434: baload
    //   3435: iload #48
    //   3437: bipush #8
    //   3439: iushr
    //   3440: ixor
    //   3441: i2b
    //   3442: bastore
    //   3443: aload #46
    //   3445: bipush #11
    //   3447: aload #37
    //   3449: iload #52
    //   3451: sipush #255
    //   3454: iand
    //   3455: baload
    //   3456: iload #48
    //   3458: ixor
    //   3459: i2b
    //   3460: bastore
    //   3461: aload #30
    //   3463: iload #47
    //   3465: iconst_3
    //   3466: iadd
    //   3467: iaload
    //   3468: istore #48
    //   3470: aload #46
    //   3472: bipush #12
    //   3474: aload #37
    //   3476: iload #52
    //   3478: bipush #24
    //   3480: iushr
    //   3481: baload
    //   3482: iload #48
    //   3484: bipush #24
    //   3486: iushr
    //   3487: ixor
    //   3488: i2b
    //   3489: bastore
    //   3490: aload #46
    //   3492: bipush #13
    //   3494: aload #37
    //   3496: iload #51
    //   3498: bipush #16
    //   3500: iushr
    //   3501: sipush #255
    //   3504: iand
    //   3505: baload
    //   3506: iload #48
    //   3508: bipush #16
    //   3510: iushr
    //   3511: ixor
    //   3512: i2b
    //   3513: bastore
    //   3514: aload #46
    //   3516: bipush #14
    //   3518: aload #37
    //   3520: iload #50
    //   3522: bipush #8
    //   3524: iushr
    //   3525: sipush #255
    //   3528: iand
    //   3529: baload
    //   3530: iload #48
    //   3532: bipush #8
    //   3534: iushr
    //   3535: ixor
    //   3536: i2b
    //   3537: bastore
    //   3538: aload #46
    //   3540: bipush #15
    //   3542: aload #37
    //   3544: iload #49
    //   3546: sipush #255
    //   3549: iand
    //   3550: baload
    //   3551: iload #48
    //   3553: ixor
    //   3554: i2b
    //   3555: bastore
    //   3556: iconst_0
    //   3557: istore #53
    //   3559: iload #53
    //   3561: bipush #16
    //   3563: if_icmpge -> 3589
    //   3566: aload #43
    //   3568: iload #53
    //   3570: iload #44
    //   3572: bipush #16
    //   3574: imul
    //   3575: iadd
    //   3576: aload #46
    //   3578: iload #53
    //   3580: baload
    //   3581: bastore
    //   3582: iinc #53, 1
    //   3585: iload_2
    //   3586: ifeq -> 3559
    //   3589: iinc #44, 1
    //   3592: iload_2
    //   3593: ifeq -> 2674
    //   3596: aload #43
    //   3598: arraylength
    //   3599: ifle -> 3680
    //   3602: aload #43
    //   3604: aload #43
    //   3606: arraylength
    //   3607: iconst_1
    //   3608: isub
    //   3609: baload
    //   3610: istore #44
    //   3612: iload #44
    //   3614: bipush #16
    //   3616: if_icmple -> 3627
    //   3619: aload #43
    //   3621: astore #35
    //   3623: iload_2
    //   3624: ifeq -> 3680
    //   3627: aload #43
    //   3629: arraylength
    //   3630: iload #44
    //   3632: isub
    //   3633: newarray byte
    //   3635: astore #35
    //   3637: iconst_0
    //   3638: istore #45
    //   3640: iload #45
    //   3642: aload #35
    //   3644: arraylength
    //   3645: if_icmpge -> 3680
    //   3648: iload #45
    //   3650: aload #43
    //   3652: arraylength
    //   3653: if_icmpge -> 3680
    //   3656: aload #35
    //   3658: iload #45
    //   3660: aload #43
    //   3662: iload #45
    //   3664: baload
    //   3665: bastore
    //   3666: iinc #45, 1
    //   3669: iload_2
    //   3670: ifeq -> 3640
    //   3673: goto -> 3680
    //   3676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3679: athrow
    //   3680: aload #35
    //   3682: astore #7
    //   3684: iconst_0
    //   3685: istore_3
    //   3686: getstatic burp/Zx8t.Zi : Ljava/lang/String;
    //   3689: getstatic burp/Zlps.ZU : Ljava/lang/Object;
    //   3692: checkcast java/math/BigInteger
    //   3695: invokevirtual intValue : ()I
    //   3698: bipush #32
    //   3700: irem
    //   3701: invokestatic abs : (I)I
    //   3704: invokevirtual charAt : (I)C
    //   3707: getstatic burp/Zro5.ZY : Ljava/lang/String;
    //   3710: getstatic burp/Zrf9.Zu : Ljava/lang/Object;
    //   3713: checkcast java/math/BigInteger
    //   3716: invokevirtual intValue : ()I
    //   3719: bipush #32
    //   3721: irem
    //   3722: invokestatic abs : (I)I
    //   3725: invokevirtual charAt : (I)C
    //   3728: if_icmpgt -> 4072
    //   3731: sipush #21023
    //   3734: sipush #-15113
    //   3737: invokestatic a : (II)Ljava/lang/String;
    //   3740: iconst_1
    //   3741: ldc burp/Zera
    //   3743: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3746: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3749: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3752: astore #4
    //   3754: aload #4
    //   3756: arraylength
    //   3757: istore #5
    //   3759: iconst_0
    //   3760: istore #6
    //   3762: iload #6
    //   3764: iload #5
    //   3766: if_icmpge -> 3904
    //   3769: aload #4
    //   3771: iload #6
    //   3773: aaload
    //   3774: astore #7
    //   3776: aload #7
    //   3778: invokevirtual getModifiers : ()I
    //   3781: invokestatic isStatic : (I)Z
    //   3784: ifne -> 3794
    //   3787: goto -> 3897
    //   3790: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3793: athrow
    //   3794: aload #7
    //   3796: invokevirtual getType : ()Ljava/lang/Class;
    //   3799: astore #8
    //   3801: aload #8
    //   3803: ifnull -> 3884
    //   3806: aload #8
    //   3808: invokevirtual isPrimitive : ()Z
    //   3811: ifne -> 3884
    //   3814: goto -> 3821
    //   3817: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3820: athrow
    //   3821: aload #8
    //   3823: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3826: ifnull -> 3884
    //   3829: goto -> 3836
    //   3832: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3835: athrow
    //   3836: aload #8
    //   3838: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3841: invokevirtual getName : ()Ljava/lang/String;
    //   3844: ifnull -> 3884
    //   3847: goto -> 3854
    //   3850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3853: athrow
    //   3854: aload #8
    //   3856: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3859: invokevirtual getName : ()Ljava/lang/String;
    //   3862: sipush #20996
    //   3865: sipush #-9577
    //   3868: invokestatic a : (II)Ljava/lang/String;
    //   3871: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3874: ifne -> 3884
    //   3877: goto -> 3884
    //   3880: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3883: athrow
    //   3884: aload #7
    //   3886: iconst_1
    //   3887: invokevirtual setAccessible : (Z)V
    //   3890: aload #7
    //   3892: aconst_null
    //   3893: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3896: pop
    //   3897: iinc #6, 1
    //   3900: iload_2
    //   3901: ifeq -> 3762
    //   3904: sipush #21001
    //   3907: sipush #9728
    //   3910: invokestatic a : (II)Ljava/lang/String;
    //   3913: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3916: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3919: astore #4
    //   3921: aload #4
    //   3923: arraylength
    //   3924: istore #5
    //   3926: iconst_0
    //   3927: istore #6
    //   3929: iload #6
    //   3931: iload #5
    //   3933: if_icmpge -> 4069
    //   3936: aload #4
    //   3938: iload #6
    //   3940: aaload
    //   3941: astore #7
    //   3943: aload #7
    //   3945: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3948: pop
    //   3949: aload #7
    //   3951: invokevirtual getModifiers : ()I
    //   3954: invokestatic isStatic : (I)Z
    //   3957: ifeq -> 4055
    //   3960: aload #7
    //   3962: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3965: arraylength
    //   3966: iconst_2
    //   3967: if_icmpne -> 4055
    //   3970: goto -> 3977
    //   3973: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3976: athrow
    //   3977: aload #7
    //   3979: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3982: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3985: if_acmpne -> 4055
    //   3988: goto -> 3995
    //   3991: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3994: athrow
    //   3995: aload #7
    //   3997: iconst_1
    //   3998: invokevirtual setAccessible : (Z)V
    //   4001: aload #7
    //   4003: aconst_null
    //   4004: iconst_2
    //   4005: anewarray java/lang/Object
    //   4008: dup
    //   4009: iconst_0
    //   4010: aload_0
    //   4011: aastore
    //   4012: dup
    //   4013: iconst_1
    //   4014: aload_1
    //   4015: ifnonnull -> 4033
    //   4018: goto -> 4025
    //   4021: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4024: athrow
    //   4025: aload_1
    //   4026: goto -> 4040
    //   4029: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4032: athrow
    //   4033: aload_1
    //   4034: checkcast [B
    //   4037: invokevirtual clone : ()Ljava/lang/Object;
    //   4040: aastore
    //   4041: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4044: checkcast java/lang/Boolean
    //   4047: invokevirtual booleanValue : ()Z
    //   4050: istore_3
    //   4051: iload_2
    //   4052: ifeq -> 4069
    //   4055: iinc #6, 1
    //   4058: iload_2
    //   4059: ifeq -> 3929
    //   4062: goto -> 4069
    //   4065: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4068: athrow
    //   4069: goto -> 4410
    //   4072: sipush #21013
    //   4075: sipush #15554
    //   4078: invokestatic a : (II)Ljava/lang/String;
    //   4081: iconst_1
    //   4082: ldc burp/Zstf
    //   4084: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4087: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4090: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4093: astore #4
    //   4095: aload #4
    //   4097: arraylength
    //   4098: istore #5
    //   4100: iconst_0
    //   4101: istore #6
    //   4103: iload #6
    //   4105: iload #5
    //   4107: if_icmpge -> 4245
    //   4110: aload #4
    //   4112: iload #6
    //   4114: aaload
    //   4115: astore #7
    //   4117: aload #7
    //   4119: invokevirtual getModifiers : ()I
    //   4122: invokestatic isStatic : (I)Z
    //   4125: ifne -> 4135
    //   4128: goto -> 4238
    //   4131: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4134: athrow
    //   4135: aload #7
    //   4137: invokevirtual getType : ()Ljava/lang/Class;
    //   4140: astore #8
    //   4142: aload #8
    //   4144: ifnull -> 4225
    //   4147: aload #8
    //   4149: invokevirtual isPrimitive : ()Z
    //   4152: ifne -> 4225
    //   4155: goto -> 4162
    //   4158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4161: athrow
    //   4162: aload #8
    //   4164: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4167: ifnull -> 4225
    //   4170: goto -> 4177
    //   4173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4176: athrow
    //   4177: aload #8
    //   4179: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4182: invokevirtual getName : ()Ljava/lang/String;
    //   4185: ifnull -> 4225
    //   4188: goto -> 4195
    //   4191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4194: athrow
    //   4195: aload #8
    //   4197: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4200: invokevirtual getName : ()Ljava/lang/String;
    //   4203: sipush #20996
    //   4206: sipush #-9577
    //   4209: invokestatic a : (II)Ljava/lang/String;
    //   4212: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4215: ifne -> 4225
    //   4218: goto -> 4225
    //   4221: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4224: athrow
    //   4225: aload #7
    //   4227: iconst_1
    //   4228: invokevirtual setAccessible : (Z)V
    //   4231: aload #7
    //   4233: aconst_null
    //   4234: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4237: pop
    //   4238: iinc #6, 1
    //   4241: iload_2
    //   4242: ifeq -> 4103
    //   4245: sipush #20999
    //   4248: sipush #5768
    //   4251: invokestatic a : (II)Ljava/lang/String;
    //   4254: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4257: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4260: astore #4
    //   4262: aload #4
    //   4264: arraylength
    //   4265: istore #5
    //   4267: iconst_0
    //   4268: istore #6
    //   4270: iload #6
    //   4272: iload #5
    //   4274: if_icmpge -> 4410
    //   4277: aload #4
    //   4279: iload #6
    //   4281: aaload
    //   4282: astore #7
    //   4284: aload #7
    //   4286: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4289: pop
    //   4290: aload #7
    //   4292: invokevirtual getModifiers : ()I
    //   4295: invokestatic isStatic : (I)Z
    //   4298: ifeq -> 4396
    //   4301: aload #7
    //   4303: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4306: arraylength
    //   4307: iconst_2
    //   4308: if_icmpne -> 4396
    //   4311: goto -> 4318
    //   4314: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4317: athrow
    //   4318: aload #7
    //   4320: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4323: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4326: if_acmpne -> 4396
    //   4329: goto -> 4336
    //   4332: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4335: athrow
    //   4336: aload #7
    //   4338: iconst_1
    //   4339: invokevirtual setAccessible : (Z)V
    //   4342: aload #7
    //   4344: aconst_null
    //   4345: iconst_2
    //   4346: anewarray java/lang/Object
    //   4349: dup
    //   4350: iconst_0
    //   4351: aload_0
    //   4352: aastore
    //   4353: dup
    //   4354: iconst_1
    //   4355: aload_1
    //   4356: ifnonnull -> 4374
    //   4359: goto -> 4366
    //   4362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4365: athrow
    //   4366: aload_1
    //   4367: goto -> 4381
    //   4370: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4373: athrow
    //   4374: aload_1
    //   4375: checkcast [B
    //   4378: invokevirtual clone : ()Ljava/lang/Object;
    //   4381: aastore
    //   4382: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4385: checkcast java/lang/Boolean
    //   4388: invokevirtual booleanValue : ()Z
    //   4391: istore_3
    //   4392: iload_2
    //   4393: ifeq -> 4410
    //   4396: iinc #6, 1
    //   4399: iload_2
    //   4400: ifeq -> 4270
    //   4403: goto -> 4410
    //   4406: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4409: athrow
    //   4410: iload_3
    //   4411: ifeq -> 4416
    //   4414: iload_3
    //   4415: ireturn
    //   4416: getstatic burp/Zscs.Zw : Ljava/lang/String;
    //   4419: getstatic burp/Zb2k.ZZ : Ljava/lang/Object;
    //   4422: checkcast java/math/BigInteger
    //   4425: invokevirtual intValue : ()I
    //   4428: bipush #32
    //   4430: irem
    //   4431: invokestatic abs : (I)I
    //   4434: invokevirtual charAt : (I)C
    //   4437: getstatic burp/Zlo2.ZJ : Ljava/lang/String;
    //   4440: getstatic burp/Zx4y.Zc : Ljava/lang/Object;
    //   4443: checkcast java/math/BigInteger
    //   4446: invokevirtual intValue : ()I
    //   4449: bipush #32
    //   4451: irem
    //   4452: invokestatic abs : (I)I
    //   4455: invokevirtual charAt : (I)C
    //   4458: if_icmpgt -> 4803
    //   4461: sipush #21015
    //   4464: sipush #-25120
    //   4467: invokestatic a : (II)Ljava/lang/String;
    //   4470: iconst_1
    //   4471: ldc burp/Ztkh
    //   4473: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4476: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4479: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4482: astore #4
    //   4484: aload #4
    //   4486: arraylength
    //   4487: istore #5
    //   4489: iconst_0
    //   4490: istore #6
    //   4492: iload #6
    //   4494: iload #5
    //   4496: if_icmpge -> 4634
    //   4499: aload #4
    //   4501: iload #6
    //   4503: aaload
    //   4504: astore #7
    //   4506: aload #7
    //   4508: invokevirtual getModifiers : ()I
    //   4511: invokestatic isStatic : (I)Z
    //   4514: ifne -> 4524
    //   4517: goto -> 4627
    //   4520: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4523: athrow
    //   4524: aload #7
    //   4526: invokevirtual getType : ()Ljava/lang/Class;
    //   4529: astore #8
    //   4531: aload #8
    //   4533: ifnull -> 4614
    //   4536: aload #8
    //   4538: invokevirtual isPrimitive : ()Z
    //   4541: ifne -> 4614
    //   4544: goto -> 4551
    //   4547: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4550: athrow
    //   4551: aload #8
    //   4553: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4556: ifnull -> 4614
    //   4559: goto -> 4566
    //   4562: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4565: athrow
    //   4566: aload #8
    //   4568: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4571: invokevirtual getName : ()Ljava/lang/String;
    //   4574: ifnull -> 4614
    //   4577: goto -> 4584
    //   4580: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4583: athrow
    //   4584: aload #8
    //   4586: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4589: invokevirtual getName : ()Ljava/lang/String;
    //   4592: sipush #20996
    //   4595: sipush #-9577
    //   4598: invokestatic a : (II)Ljava/lang/String;
    //   4601: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4604: ifne -> 4614
    //   4607: goto -> 4614
    //   4610: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4613: athrow
    //   4614: aload #7
    //   4616: iconst_1
    //   4617: invokevirtual setAccessible : (Z)V
    //   4620: aload #7
    //   4622: aconst_null
    //   4623: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4626: pop
    //   4627: iinc #6, 1
    //   4630: iload_2
    //   4631: ifeq -> 4492
    //   4634: sipush #21014
    //   4637: sipush #7276
    //   4640: invokestatic a : (II)Ljava/lang/String;
    //   4643: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4646: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4649: astore #4
    //   4651: aload #4
    //   4653: arraylength
    //   4654: istore #5
    //   4656: iconst_0
    //   4657: istore #6
    //   4659: iload #6
    //   4661: iload #5
    //   4663: if_icmpge -> 4799
    //   4666: aload #4
    //   4668: iload #6
    //   4670: aaload
    //   4671: astore #7
    //   4673: aload #7
    //   4675: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4678: pop
    //   4679: aload #7
    //   4681: invokevirtual getModifiers : ()I
    //   4684: invokestatic isStatic : (I)Z
    //   4687: ifeq -> 4785
    //   4690: aload #7
    //   4692: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4695: arraylength
    //   4696: iconst_2
    //   4697: if_icmpne -> 4785
    //   4700: goto -> 4707
    //   4703: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4706: athrow
    //   4707: aload #7
    //   4709: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4712: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4715: if_acmpne -> 4785
    //   4718: goto -> 4725
    //   4721: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4724: athrow
    //   4725: aload #7
    //   4727: iconst_1
    //   4728: invokevirtual setAccessible : (Z)V
    //   4731: aload #7
    //   4733: aconst_null
    //   4734: iconst_2
    //   4735: anewarray java/lang/Object
    //   4738: dup
    //   4739: iconst_0
    //   4740: aload_0
    //   4741: aastore
    //   4742: dup
    //   4743: iconst_1
    //   4744: aload_1
    //   4745: ifnonnull -> 4763
    //   4748: goto -> 4755
    //   4751: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4754: athrow
    //   4755: aload_1
    //   4756: goto -> 4770
    //   4759: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4762: athrow
    //   4763: aload_1
    //   4764: checkcast [B
    //   4767: invokevirtual clone : ()Ljava/lang/Object;
    //   4770: aastore
    //   4771: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4774: checkcast java/lang/Boolean
    //   4777: invokevirtual booleanValue : ()Z
    //   4780: istore_3
    //   4781: iload_2
    //   4782: ifeq -> 4799
    //   4785: iinc #6, 1
    //   4788: iload_2
    //   4789: ifeq -> 4659
    //   4792: goto -> 4799
    //   4795: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4798: athrow
    //   4799: iload_2
    //   4800: ifeq -> 5141
    //   4803: sipush #21006
    //   4806: sipush #-908
    //   4809: invokestatic a : (II)Ljava/lang/String;
    //   4812: iconst_1
    //   4813: ldc burp/Zszz
    //   4815: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4818: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4821: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4824: astore #4
    //   4826: aload #4
    //   4828: arraylength
    //   4829: istore #5
    //   4831: iconst_0
    //   4832: istore #6
    //   4834: iload #6
    //   4836: iload #5
    //   4838: if_icmpge -> 4976
    //   4841: aload #4
    //   4843: iload #6
    //   4845: aaload
    //   4846: astore #7
    //   4848: aload #7
    //   4850: invokevirtual getModifiers : ()I
    //   4853: invokestatic isStatic : (I)Z
    //   4856: ifne -> 4866
    //   4859: goto -> 4969
    //   4862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4865: athrow
    //   4866: aload #7
    //   4868: invokevirtual getType : ()Ljava/lang/Class;
    //   4871: astore #8
    //   4873: aload #8
    //   4875: ifnull -> 4956
    //   4878: aload #8
    //   4880: invokevirtual isPrimitive : ()Z
    //   4883: ifne -> 4956
    //   4886: goto -> 4893
    //   4889: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4892: athrow
    //   4893: aload #8
    //   4895: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4898: ifnull -> 4956
    //   4901: goto -> 4908
    //   4904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4907: athrow
    //   4908: aload #8
    //   4910: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4913: invokevirtual getName : ()Ljava/lang/String;
    //   4916: ifnull -> 4956
    //   4919: goto -> 4926
    //   4922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4925: athrow
    //   4926: aload #8
    //   4928: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4931: invokevirtual getName : ()Ljava/lang/String;
    //   4934: sipush #20996
    //   4937: sipush #-9577
    //   4940: invokestatic a : (II)Ljava/lang/String;
    //   4943: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4946: ifne -> 4956
    //   4949: goto -> 4956
    //   4952: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4955: athrow
    //   4956: aload #7
    //   4958: iconst_1
    //   4959: invokevirtual setAccessible : (Z)V
    //   4962: aload #7
    //   4964: aconst_null
    //   4965: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4968: pop
    //   4969: iinc #6, 1
    //   4972: iload_2
    //   4973: ifeq -> 4834
    //   4976: sipush #21009
    //   4979: sipush #20286
    //   4982: invokestatic a : (II)Ljava/lang/String;
    //   4985: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4988: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4991: astore #4
    //   4993: aload #4
    //   4995: arraylength
    //   4996: istore #5
    //   4998: iconst_0
    //   4999: istore #6
    //   5001: iload #6
    //   5003: iload #5
    //   5005: if_icmpge -> 5141
    //   5008: aload #4
    //   5010: iload #6
    //   5012: aaload
    //   5013: astore #7
    //   5015: aload #7
    //   5017: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5020: pop
    //   5021: aload #7
    //   5023: invokevirtual getModifiers : ()I
    //   5026: invokestatic isStatic : (I)Z
    //   5029: ifeq -> 5127
    //   5032: aload #7
    //   5034: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5037: arraylength
    //   5038: iconst_2
    //   5039: if_icmpne -> 5127
    //   5042: goto -> 5049
    //   5045: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5048: athrow
    //   5049: aload #7
    //   5051: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5054: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5057: if_acmpne -> 5127
    //   5060: goto -> 5067
    //   5063: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5066: athrow
    //   5067: aload #7
    //   5069: iconst_1
    //   5070: invokevirtual setAccessible : (Z)V
    //   5073: aload #7
    //   5075: aconst_null
    //   5076: iconst_2
    //   5077: anewarray java/lang/Object
    //   5080: dup
    //   5081: iconst_0
    //   5082: aload_0
    //   5083: aastore
    //   5084: dup
    //   5085: iconst_1
    //   5086: aload_1
    //   5087: ifnonnull -> 5105
    //   5090: goto -> 5097
    //   5093: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5096: athrow
    //   5097: aload_1
    //   5098: goto -> 5112
    //   5101: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5104: athrow
    //   5105: aload_1
    //   5106: checkcast [B
    //   5109: invokevirtual clone : ()Ljava/lang/Object;
    //   5112: aastore
    //   5113: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5116: checkcast java/lang/Boolean
    //   5119: invokevirtual booleanValue : ()Z
    //   5122: istore_3
    //   5123: iload_2
    //   5124: ifeq -> 5141
    //   5127: iinc #6, 1
    //   5130: iload_2
    //   5131: ifeq -> 5001
    //   5134: goto -> 5141
    //   5137: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5140: athrow
    //   5141: iload_3
    //   5142: ifeq -> 5147
    //   5145: iload_3
    //   5146: ireturn
    //   5147: getstatic burp/Zx_x.Zv : Ljava/lang/String;
    //   5150: getstatic burp/Zztz.Zq : Ljava/lang/Object;
    //   5153: checkcast java/math/BigInteger
    //   5156: invokevirtual intValue : ()I
    //   5159: bipush #32
    //   5161: irem
    //   5162: invokestatic abs : (I)I
    //   5165: invokevirtual charAt : (I)C
    //   5168: getstatic burp/Zgta.ZL : Ljava/lang/String;
    //   5171: getstatic burp/Zm8i.Zm : Ljava/lang/Object;
    //   5174: checkcast java/math/BigInteger
    //   5177: invokevirtual intValue : ()I
    //   5180: bipush #32
    //   5182: irem
    //   5183: invokestatic abs : (I)I
    //   5186: invokevirtual charAt : (I)C
    //   5189: if_icmple -> 5534
    //   5192: sipush #20998
    //   5195: sipush #-4970
    //   5198: invokestatic a : (II)Ljava/lang/String;
    //   5201: iconst_1
    //   5202: ldc burp/Zs1d
    //   5204: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5207: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5210: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5213: astore #4
    //   5215: aload #4
    //   5217: arraylength
    //   5218: istore #5
    //   5220: iconst_0
    //   5221: istore #6
    //   5223: iload #6
    //   5225: iload #5
    //   5227: if_icmpge -> 5365
    //   5230: aload #4
    //   5232: iload #6
    //   5234: aaload
    //   5235: astore #7
    //   5237: aload #7
    //   5239: invokevirtual getModifiers : ()I
    //   5242: invokestatic isStatic : (I)Z
    //   5245: ifne -> 5255
    //   5248: goto -> 5358
    //   5251: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5254: athrow
    //   5255: aload #7
    //   5257: invokevirtual getType : ()Ljava/lang/Class;
    //   5260: astore #8
    //   5262: aload #8
    //   5264: ifnull -> 5345
    //   5267: aload #8
    //   5269: invokevirtual isPrimitive : ()Z
    //   5272: ifne -> 5345
    //   5275: goto -> 5282
    //   5278: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5281: athrow
    //   5282: aload #8
    //   5284: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5287: ifnull -> 5345
    //   5290: goto -> 5297
    //   5293: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5296: athrow
    //   5297: aload #8
    //   5299: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5302: invokevirtual getName : ()Ljava/lang/String;
    //   5305: ifnull -> 5345
    //   5308: goto -> 5315
    //   5311: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5314: athrow
    //   5315: aload #8
    //   5317: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5320: invokevirtual getName : ()Ljava/lang/String;
    //   5323: sipush #20996
    //   5326: sipush #-9577
    //   5329: invokestatic a : (II)Ljava/lang/String;
    //   5332: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5335: ifne -> 5345
    //   5338: goto -> 5345
    //   5341: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5344: athrow
    //   5345: aload #7
    //   5347: iconst_1
    //   5348: invokevirtual setAccessible : (Z)V
    //   5351: aload #7
    //   5353: aconst_null
    //   5354: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5357: pop
    //   5358: iinc #6, 1
    //   5361: iload_2
    //   5362: ifeq -> 5223
    //   5365: sipush #21019
    //   5368: sipush #-32678
    //   5371: invokestatic a : (II)Ljava/lang/String;
    //   5374: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5377: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5380: astore #4
    //   5382: aload #4
    //   5384: arraylength
    //   5385: istore #5
    //   5387: iconst_0
    //   5388: istore #6
    //   5390: iload #6
    //   5392: iload #5
    //   5394: if_icmpge -> 5530
    //   5397: aload #4
    //   5399: iload #6
    //   5401: aaload
    //   5402: astore #7
    //   5404: aload #7
    //   5406: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5409: pop
    //   5410: aload #7
    //   5412: invokevirtual getModifiers : ()I
    //   5415: invokestatic isStatic : (I)Z
    //   5418: ifeq -> 5516
    //   5421: aload #7
    //   5423: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5426: arraylength
    //   5427: iconst_2
    //   5428: if_icmpne -> 5516
    //   5431: goto -> 5438
    //   5434: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5437: athrow
    //   5438: aload #7
    //   5440: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5443: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5446: if_acmpne -> 5516
    //   5449: goto -> 5456
    //   5452: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5455: athrow
    //   5456: aload #7
    //   5458: iconst_1
    //   5459: invokevirtual setAccessible : (Z)V
    //   5462: aload #7
    //   5464: aconst_null
    //   5465: iconst_2
    //   5466: anewarray java/lang/Object
    //   5469: dup
    //   5470: iconst_0
    //   5471: aload_0
    //   5472: aastore
    //   5473: dup
    //   5474: iconst_1
    //   5475: aload_1
    //   5476: ifnonnull -> 5494
    //   5479: goto -> 5486
    //   5482: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5485: athrow
    //   5486: aload_1
    //   5487: goto -> 5501
    //   5490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5493: athrow
    //   5494: aload_1
    //   5495: checkcast [B
    //   5498: invokevirtual clone : ()Ljava/lang/Object;
    //   5501: aastore
    //   5502: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5505: checkcast java/lang/Boolean
    //   5508: invokevirtual booleanValue : ()Z
    //   5511: istore_3
    //   5512: iload_2
    //   5513: ifeq -> 5530
    //   5516: iinc #6, 1
    //   5519: iload_2
    //   5520: ifeq -> 5390
    //   5523: goto -> 5530
    //   5526: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5529: athrow
    //   5530: iload_2
    //   5531: ifeq -> 5872
    //   5534: sipush #21017
    //   5537: sipush #9490
    //   5540: invokestatic a : (II)Ljava/lang/String;
    //   5543: iconst_1
    //   5544: ldc burp/Zeqo
    //   5546: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5549: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5552: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5555: astore #4
    //   5557: aload #4
    //   5559: arraylength
    //   5560: istore #5
    //   5562: iconst_0
    //   5563: istore #6
    //   5565: iload #6
    //   5567: iload #5
    //   5569: if_icmpge -> 5707
    //   5572: aload #4
    //   5574: iload #6
    //   5576: aaload
    //   5577: astore #7
    //   5579: aload #7
    //   5581: invokevirtual getModifiers : ()I
    //   5584: invokestatic isStatic : (I)Z
    //   5587: ifne -> 5597
    //   5590: goto -> 5700
    //   5593: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5596: athrow
    //   5597: aload #7
    //   5599: invokevirtual getType : ()Ljava/lang/Class;
    //   5602: astore #8
    //   5604: aload #8
    //   5606: ifnull -> 5687
    //   5609: aload #8
    //   5611: invokevirtual isPrimitive : ()Z
    //   5614: ifne -> 5687
    //   5617: goto -> 5624
    //   5620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5623: athrow
    //   5624: aload #8
    //   5626: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5629: ifnull -> 5687
    //   5632: goto -> 5639
    //   5635: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5638: athrow
    //   5639: aload #8
    //   5641: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5644: invokevirtual getName : ()Ljava/lang/String;
    //   5647: ifnull -> 5687
    //   5650: goto -> 5657
    //   5653: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5656: athrow
    //   5657: aload #8
    //   5659: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5662: invokevirtual getName : ()Ljava/lang/String;
    //   5665: sipush #20996
    //   5668: sipush #-9577
    //   5671: invokestatic a : (II)Ljava/lang/String;
    //   5674: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5677: ifne -> 5687
    //   5680: goto -> 5687
    //   5683: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5686: athrow
    //   5687: aload #7
    //   5689: iconst_1
    //   5690: invokevirtual setAccessible : (Z)V
    //   5693: aload #7
    //   5695: aconst_null
    //   5696: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5699: pop
    //   5700: iinc #6, 1
    //   5703: iload_2
    //   5704: ifeq -> 5565
    //   5707: sipush #20997
    //   5710: sipush #4464
    //   5713: invokestatic a : (II)Ljava/lang/String;
    //   5716: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5719: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5722: astore #4
    //   5724: aload #4
    //   5726: arraylength
    //   5727: istore #5
    //   5729: iconst_0
    //   5730: istore #6
    //   5732: iload #6
    //   5734: iload #5
    //   5736: if_icmpge -> 5872
    //   5739: aload #4
    //   5741: iload #6
    //   5743: aaload
    //   5744: astore #7
    //   5746: aload #7
    //   5748: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5751: pop
    //   5752: aload #7
    //   5754: invokevirtual getModifiers : ()I
    //   5757: invokestatic isStatic : (I)Z
    //   5760: ifeq -> 5858
    //   5763: aload #7
    //   5765: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5768: arraylength
    //   5769: iconst_2
    //   5770: if_icmpne -> 5858
    //   5773: goto -> 5780
    //   5776: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5779: athrow
    //   5780: aload #7
    //   5782: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5785: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5788: if_acmpne -> 5858
    //   5791: goto -> 5798
    //   5794: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5797: athrow
    //   5798: aload #7
    //   5800: iconst_1
    //   5801: invokevirtual setAccessible : (Z)V
    //   5804: aload #7
    //   5806: aconst_null
    //   5807: iconst_2
    //   5808: anewarray java/lang/Object
    //   5811: dup
    //   5812: iconst_0
    //   5813: aload_0
    //   5814: aastore
    //   5815: dup
    //   5816: iconst_1
    //   5817: aload_1
    //   5818: ifnonnull -> 5836
    //   5821: goto -> 5828
    //   5824: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5827: athrow
    //   5828: aload_1
    //   5829: goto -> 5843
    //   5832: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5835: athrow
    //   5836: aload_1
    //   5837: checkcast [B
    //   5840: invokevirtual clone : ()Ljava/lang/Object;
    //   5843: aastore
    //   5844: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5847: checkcast java/lang/Boolean
    //   5850: invokevirtual booleanValue : ()Z
    //   5853: istore_3
    //   5854: iload_2
    //   5855: ifeq -> 5872
    //   5858: iinc #6, 1
    //   5861: iload_2
    //   5862: ifeq -> 5732
    //   5865: goto -> 5872
    //   5868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5871: athrow
    //   5872: iload_3
    //   5873: ifeq -> 5878
    //   5876: iload_3
    //   5877: ireturn
    //   5878: getstatic burp/Ztkc.ZU : Ljava/lang/String;
    //   5881: getstatic burp/Ztys.Zs : Ljava/lang/Object;
    //   5884: checkcast java/math/BigInteger
    //   5887: invokevirtual intValue : ()I
    //   5890: bipush #32
    //   5892: irem
    //   5893: invokestatic abs : (I)I
    //   5896: invokevirtual charAt : (I)C
    //   5899: getstatic burp/Zgta.ZL : Ljava/lang/String;
    //   5902: getstatic burp/Zrf9.Zu : Ljava/lang/Object;
    //   5905: checkcast java/math/BigInteger
    //   5908: invokevirtual intValue : ()I
    //   5911: bipush #32
    //   5913: irem
    //   5914: invokestatic abs : (I)I
    //   5917: invokevirtual charAt : (I)C
    //   5920: if_icmpgt -> 6265
    //   5923: sipush #21020
    //   5926: sipush #-23147
    //   5929: invokestatic a : (II)Ljava/lang/String;
    //   5932: iconst_1
    //   5933: ldc burp/Ztmy
    //   5935: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5938: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5941: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5944: astore #4
    //   5946: aload #4
    //   5948: arraylength
    //   5949: istore #5
    //   5951: iconst_0
    //   5952: istore #6
    //   5954: iload #6
    //   5956: iload #5
    //   5958: if_icmpge -> 6096
    //   5961: aload #4
    //   5963: iload #6
    //   5965: aaload
    //   5966: astore #7
    //   5968: aload #7
    //   5970: invokevirtual getModifiers : ()I
    //   5973: invokestatic isStatic : (I)Z
    //   5976: ifne -> 5986
    //   5979: goto -> 6089
    //   5982: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5985: athrow
    //   5986: aload #7
    //   5988: invokevirtual getType : ()Ljava/lang/Class;
    //   5991: astore #8
    //   5993: aload #8
    //   5995: ifnull -> 6076
    //   5998: aload #8
    //   6000: invokevirtual isPrimitive : ()Z
    //   6003: ifne -> 6076
    //   6006: goto -> 6013
    //   6009: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6012: athrow
    //   6013: aload #8
    //   6015: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6018: ifnull -> 6076
    //   6021: goto -> 6028
    //   6024: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6027: athrow
    //   6028: aload #8
    //   6030: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6033: invokevirtual getName : ()Ljava/lang/String;
    //   6036: ifnull -> 6076
    //   6039: goto -> 6046
    //   6042: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6045: athrow
    //   6046: aload #8
    //   6048: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6051: invokevirtual getName : ()Ljava/lang/String;
    //   6054: sipush #20996
    //   6057: sipush #-9577
    //   6060: invokestatic a : (II)Ljava/lang/String;
    //   6063: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6066: ifne -> 6076
    //   6069: goto -> 6076
    //   6072: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6075: athrow
    //   6076: aload #7
    //   6078: iconst_1
    //   6079: invokevirtual setAccessible : (Z)V
    //   6082: aload #7
    //   6084: aconst_null
    //   6085: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6088: pop
    //   6089: iinc #6, 1
    //   6092: iload_2
    //   6093: ifeq -> 5954
    //   6096: sipush #21012
    //   6099: sipush #19533
    //   6102: invokestatic a : (II)Ljava/lang/String;
    //   6105: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6108: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6111: astore #4
    //   6113: aload #4
    //   6115: arraylength
    //   6116: istore #5
    //   6118: iconst_0
    //   6119: istore #6
    //   6121: iload #6
    //   6123: iload #5
    //   6125: if_icmpge -> 6261
    //   6128: aload #4
    //   6130: iload #6
    //   6132: aaload
    //   6133: astore #7
    //   6135: aload #7
    //   6137: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6140: pop
    //   6141: aload #7
    //   6143: invokevirtual getModifiers : ()I
    //   6146: invokestatic isStatic : (I)Z
    //   6149: ifeq -> 6247
    //   6152: aload #7
    //   6154: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6157: arraylength
    //   6158: iconst_2
    //   6159: if_icmpne -> 6247
    //   6162: goto -> 6169
    //   6165: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6168: athrow
    //   6169: aload #7
    //   6171: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6174: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6177: if_acmpne -> 6247
    //   6180: goto -> 6187
    //   6183: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6186: athrow
    //   6187: aload #7
    //   6189: iconst_1
    //   6190: invokevirtual setAccessible : (Z)V
    //   6193: aload #7
    //   6195: aconst_null
    //   6196: iconst_2
    //   6197: anewarray java/lang/Object
    //   6200: dup
    //   6201: iconst_0
    //   6202: aload_0
    //   6203: aastore
    //   6204: dup
    //   6205: iconst_1
    //   6206: aload_1
    //   6207: ifnonnull -> 6225
    //   6210: goto -> 6217
    //   6213: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6216: athrow
    //   6217: aload_1
    //   6218: goto -> 6232
    //   6221: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6224: athrow
    //   6225: aload_1
    //   6226: checkcast [B
    //   6229: invokevirtual clone : ()Ljava/lang/Object;
    //   6232: aastore
    //   6233: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6236: checkcast java/lang/Boolean
    //   6239: invokevirtual booleanValue : ()Z
    //   6242: istore_3
    //   6243: iload_2
    //   6244: ifeq -> 6261
    //   6247: iinc #6, 1
    //   6250: iload_2
    //   6251: ifeq -> 6121
    //   6254: goto -> 6261
    //   6257: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6260: athrow
    //   6261: iload_2
    //   6262: ifeq -> 6603
    //   6265: sipush #21018
    //   6268: sipush #-7584
    //   6271: invokestatic a : (II)Ljava/lang/String;
    //   6274: iconst_1
    //   6275: ldc burp/Zscz
    //   6277: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6280: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6283: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6286: astore #4
    //   6288: aload #4
    //   6290: arraylength
    //   6291: istore #5
    //   6293: iconst_0
    //   6294: istore #6
    //   6296: iload #6
    //   6298: iload #5
    //   6300: if_icmpge -> 6438
    //   6303: aload #4
    //   6305: iload #6
    //   6307: aaload
    //   6308: astore #7
    //   6310: aload #7
    //   6312: invokevirtual getModifiers : ()I
    //   6315: invokestatic isStatic : (I)Z
    //   6318: ifne -> 6328
    //   6321: goto -> 6431
    //   6324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6327: athrow
    //   6328: aload #7
    //   6330: invokevirtual getType : ()Ljava/lang/Class;
    //   6333: astore #8
    //   6335: aload #8
    //   6337: ifnull -> 6418
    //   6340: aload #8
    //   6342: invokevirtual isPrimitive : ()Z
    //   6345: ifne -> 6418
    //   6348: goto -> 6355
    //   6351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6354: athrow
    //   6355: aload #8
    //   6357: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6360: ifnull -> 6418
    //   6363: goto -> 6370
    //   6366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6369: athrow
    //   6370: aload #8
    //   6372: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6375: invokevirtual getName : ()Ljava/lang/String;
    //   6378: ifnull -> 6418
    //   6381: goto -> 6388
    //   6384: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6387: athrow
    //   6388: aload #8
    //   6390: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6393: invokevirtual getName : ()Ljava/lang/String;
    //   6396: sipush #20996
    //   6399: sipush #-9577
    //   6402: invokestatic a : (II)Ljava/lang/String;
    //   6405: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6408: ifne -> 6418
    //   6411: goto -> 6418
    //   6414: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6417: athrow
    //   6418: aload #7
    //   6420: iconst_1
    //   6421: invokevirtual setAccessible : (Z)V
    //   6424: aload #7
    //   6426: aconst_null
    //   6427: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6430: pop
    //   6431: iinc #6, 1
    //   6434: iload_2
    //   6435: ifeq -> 6296
    //   6438: sipush #21004
    //   6441: sipush #31754
    //   6444: invokestatic a : (II)Ljava/lang/String;
    //   6447: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6450: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6453: astore #4
    //   6455: aload #4
    //   6457: arraylength
    //   6458: istore #5
    //   6460: iconst_0
    //   6461: istore #6
    //   6463: iload #6
    //   6465: iload #5
    //   6467: if_icmpge -> 6603
    //   6470: aload #4
    //   6472: iload #6
    //   6474: aaload
    //   6475: astore #7
    //   6477: aload #7
    //   6479: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6482: pop
    //   6483: aload #7
    //   6485: invokevirtual getModifiers : ()I
    //   6488: invokestatic isStatic : (I)Z
    //   6491: ifeq -> 6589
    //   6494: aload #7
    //   6496: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6499: arraylength
    //   6500: iconst_2
    //   6501: if_icmpne -> 6589
    //   6504: goto -> 6511
    //   6507: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6510: athrow
    //   6511: aload #7
    //   6513: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6516: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6519: if_acmpne -> 6589
    //   6522: goto -> 6529
    //   6525: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6528: athrow
    //   6529: aload #7
    //   6531: iconst_1
    //   6532: invokevirtual setAccessible : (Z)V
    //   6535: aload #7
    //   6537: aconst_null
    //   6538: iconst_2
    //   6539: anewarray java/lang/Object
    //   6542: dup
    //   6543: iconst_0
    //   6544: aload_0
    //   6545: aastore
    //   6546: dup
    //   6547: iconst_1
    //   6548: aload_1
    //   6549: ifnonnull -> 6567
    //   6552: goto -> 6559
    //   6555: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6558: athrow
    //   6559: aload_1
    //   6560: goto -> 6574
    //   6563: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6566: athrow
    //   6567: aload_1
    //   6568: checkcast [B
    //   6571: invokevirtual clone : ()Ljava/lang/Object;
    //   6574: aastore
    //   6575: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6578: checkcast java/lang/Boolean
    //   6581: invokevirtual booleanValue : ()Z
    //   6584: istore_3
    //   6585: iload_2
    //   6586: ifeq -> 6603
    //   6589: iinc #6, 1
    //   6592: iload_2
    //   6593: ifeq -> 6463
    //   6596: goto -> 6603
    //   6599: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6602: athrow
    //   6603: iload_3
    //   6604: ireturn
    //   6605: astore_3
    //   6606: new java/lang/Exception
    //   6609: dup
    //   6610: aload_3
    //   6611: invokevirtual getMessage : ()Ljava/lang/String;
    //   6614: invokespecial <init> : (Ljava/lang/String;)V
    //   6617: athrow
    // Exception table:
    //   from	to	target	type
    //   4	4415	6605	java/lang/Throwable
    //   538	552	552	java/lang/Throwable
    //   563	576	579	java/lang/Throwable
    //   568	591	594	java/lang/Throwable
    //   583	609	612	java/lang/Throwable
    //   598	639	642	java/lang/Throwable
    //   702	729	732	java/lang/Throwable
    //   719	750	753	java/lang/Throwable
    //   736	780	783	java/lang/Throwable
    //   757	791	791	java/lang/Throwable
    //   802	818	821	java/lang/Throwable
    //   895	909	909	java/lang/Throwable
    //   920	933	936	java/lang/Throwable
    //   925	948	951	java/lang/Throwable
    //   940	966	969	java/lang/Throwable
    //   955	996	999	java/lang/Throwable
    //   1059	1086	1089	java/lang/Throwable
    //   1076	1107	1110	java/lang/Throwable
    //   1093	1137	1140	java/lang/Throwable
    //   1114	1148	1148	java/lang/Throwable
    //   1159	1175	1178	java/lang/Throwable
    //   1327	1342	1342	java/lang/Throwable
    //   2344	2370	2370	java/lang/Throwable
    //   2451	2466	2466	java/lang/Throwable
    //   3648	3673	3676	java/lang/Throwable
    //   3776	3790	3790	java/lang/Throwable
    //   3801	3814	3817	java/lang/Throwable
    //   3806	3829	3832	java/lang/Throwable
    //   3821	3847	3850	java/lang/Throwable
    //   3836	3877	3880	java/lang/Throwable
    //   3943	3970	3973	java/lang/Throwable
    //   3960	3988	3991	java/lang/Throwable
    //   3977	4018	4021	java/lang/Throwable
    //   3995	4029	4029	java/lang/Throwable
    //   4051	4062	4065	java/lang/Throwable
    //   4117	4131	4131	java/lang/Throwable
    //   4142	4155	4158	java/lang/Throwable
    //   4147	4170	4173	java/lang/Throwable
    //   4162	4188	4191	java/lang/Throwable
    //   4177	4218	4221	java/lang/Throwable
    //   4284	4311	4314	java/lang/Throwable
    //   4301	4329	4332	java/lang/Throwable
    //   4318	4359	4362	java/lang/Throwable
    //   4336	4370	4370	java/lang/Throwable
    //   4392	4403	4406	java/lang/Throwable
    //   4416	5146	6605	java/lang/Throwable
    //   4506	4520	4520	java/lang/Throwable
    //   4531	4544	4547	java/lang/Throwable
    //   4536	4559	4562	java/lang/Throwable
    //   4551	4577	4580	java/lang/Throwable
    //   4566	4607	4610	java/lang/Throwable
    //   4673	4700	4703	java/lang/Throwable
    //   4690	4718	4721	java/lang/Throwable
    //   4707	4748	4751	java/lang/Throwable
    //   4725	4759	4759	java/lang/Throwable
    //   4781	4792	4795	java/lang/Throwable
    //   4848	4862	4862	java/lang/Throwable
    //   4873	4886	4889	java/lang/Throwable
    //   4878	4901	4904	java/lang/Throwable
    //   4893	4919	4922	java/lang/Throwable
    //   4908	4949	4952	java/lang/Throwable
    //   5015	5042	5045	java/lang/Throwable
    //   5032	5060	5063	java/lang/Throwable
    //   5049	5090	5093	java/lang/Throwable
    //   5067	5101	5101	java/lang/Throwable
    //   5123	5134	5137	java/lang/Throwable
    //   5147	5877	6605	java/lang/Throwable
    //   5237	5251	5251	java/lang/Throwable
    //   5262	5275	5278	java/lang/Throwable
    //   5267	5290	5293	java/lang/Throwable
    //   5282	5308	5311	java/lang/Throwable
    //   5297	5338	5341	java/lang/Throwable
    //   5404	5431	5434	java/lang/Throwable
    //   5421	5449	5452	java/lang/Throwable
    //   5438	5479	5482	java/lang/Throwable
    //   5456	5490	5490	java/lang/Throwable
    //   5512	5523	5526	java/lang/Throwable
    //   5579	5593	5593	java/lang/Throwable
    //   5604	5617	5620	java/lang/Throwable
    //   5609	5632	5635	java/lang/Throwable
    //   5624	5650	5653	java/lang/Throwable
    //   5639	5680	5683	java/lang/Throwable
    //   5746	5773	5776	java/lang/Throwable
    //   5763	5791	5794	java/lang/Throwable
    //   5780	5821	5824	java/lang/Throwable
    //   5798	5832	5832	java/lang/Throwable
    //   5854	5865	5868	java/lang/Throwable
    //   5878	6604	6605	java/lang/Throwable
    //   5968	5982	5982	java/lang/Throwable
    //   5993	6006	6009	java/lang/Throwable
    //   5998	6021	6024	java/lang/Throwable
    //   6013	6039	6042	java/lang/Throwable
    //   6028	6069	6072	java/lang/Throwable
    //   6135	6162	6165	java/lang/Throwable
    //   6152	6180	6183	java/lang/Throwable
    //   6169	6210	6213	java/lang/Throwable
    //   6187	6221	6221	java/lang/Throwable
    //   6243	6254	6257	java/lang/Throwable
    //   6310	6324	6324	java/lang/Throwable
    //   6335	6348	6351	java/lang/Throwable
    //   6340	6363	6366	java/lang/Throwable
    //   6355	6381	6384	java/lang/Throwable
    //   6370	6411	6414	java/lang/Throwable
    //   6477	6504	6507	java/lang/Throwable
    //   6494	6522	6525	java/lang/Throwable
    //   6511	6552	6555	java/lang/Throwable
    //   6529	6563	6563	java/lang/Throwable
    //   6585	6596	6599	java/lang/Throwable
  }
  
  static void ZH(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZM(Object paramObject) {
    Zkco.Zz = a(20994, 28603);
    Zkco.Zg = new BigInteger(a(20995, -11520));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zldt.Zj.charAt(Math.abs(((BigInteger)Zrod.ZX).intValue() % 32)) > Zmrc.Zx.charAt(Math.abs(((BigInteger)Ztys.Zs).intValue() % 32))) {
          try {
            Zz9v.ZV(Class.forName(a(21002, 11989)));
            if (bool)
              Zrs0.ZS(Class.forName(a(21003, -27367))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrs0.ZS(Class.forName(a(21003, -27367)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'qäc_\\ts¿#4P'úÞM¤Á?*Qw]×\\rmª³dÆ%]\\tþNý"3s\\t²JWðy5©\\tÑ\\fwBÚéÄ\\tØJVþðS"\\tG9¥ä=ì\\tfÝ@s6\\tðrS^@-\\tDSÅ©\\f¹Ã5ëLúIl\\t"©B$gHEfwÄ¹TÍ"ª.4óÇ\ÇØq¡[®\\tßpµ¨XÏ Û{|Áoæ|ÜQ{¡À/Êãò ±Ï£,2ñÀ»>n§îØâ_vÊ¥ÁME>掱睽漖ブ朑︠ꭔ쪦쥞嘆䟏귅ꊴ鰜爁띟鎶㚰㑧焨ㅣѩ⌾᠁תܸ聻닌ॊⳝᯘ娌劎횗⤆⾕匋G‸뇮檾뺼䨏壃탇꫻䎪㍯䔠ʁ偻鼄儹䂿鉼㠔백?Ⴕ춷Ᏻ径䐾쓗縃撺ᦄ怱伹⊛遭䛾롮?஑㪾䧰Ⓦ쉅갡醅㟝货亜泐斔긇멚○᳔둙瑂䭹讻瀗떄䠕憜埴虄ᶂ頁槗軯鬠螗캀⢷豃觎뽳䈻䅈ⴁ낹믕MDªEêA®×;ñ¢²rD6åY£Åv·®³þä¼¹_\]ÊÌ°Pá¸5§Â±L^¡Ü{» ®9ûýYljê*ð\\t/¨!ã¨@q !¯¾Ã1IXHÄfJÞÃ«KVØÈÑoô\\t\\fÌc­Í9I\\tèPR>ëGI \\t¿ÿ4Ë'òËÁ\\t@Ç©s_æ\\tZÛ¸ô¶çm\\téGp+:ÄÔ®\\t\\t>òeÿ&Ôo\\t½ntù/µÎ\\tu½m\\fò¿¢\\tib`8P>揇矓濃』枫︛ꬃ쫁즴﫛䞒굘ꈟ鲯牴뜩錘㙾㒾焓ㄴЎ⏔ᣭַޥ胐늹़ⱳᬖ嫙剗혭⤽⿂卬­⃔놳樣븗䪼墶킱꩕䍤㎺䗹Ȼ偀齓兞䁕銐㡉벬?ဆ췁፝彊䓫쐎纹撁᧓恖俓≷逰䙣룅?௤㨐䤾␙슜겛醾㜷跋仁汍攧깲먬╥ᰚ뒌瓸䭂诬灰땮䣹愁坟蛷᷷颯椙踺鯹蜭캻⣠谤褤뾟䉦䇕ⶪ뀊뮠'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #59
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
    //   67: ldc 'qÀ¬nìhg\\t Ëu)Àj¿t'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #53
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
    //   128: putstatic burp/Zzh0.a : [Ljava/lang/String;
    //   131: bipush #31
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zzh0.b : [Ljava/lang/String;
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
    //   212: bipush #112
    //   214: goto -> 244
    //   217: bipush #19
    //   219: goto -> 244
    //   222: bipush #67
    //   224: goto -> 244
    //   227: bipush #86
    //   229: goto -> 244
    //   232: bipush #18
    //   234: goto -> 244
    //   237: bipush #19
    //   239: goto -> 244
    //   242: bipush #18
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: sipush #20992
    //   307: sipush #-16834
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zzh0.Z_ : Ljava/lang/Object;
    //   319: sipush #21022
    //   322: sipush #-4547
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zzh0.ZK : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x520F) & 0xFFFF;
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
      byte b1 = 54;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzh0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */