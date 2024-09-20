package burp;

import java.math.BigInteger;

class Zgvl extends ClassLoader {
  static Object ZK;
  
  static String Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zd(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
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
    //   250: sipush #24917
    //   253: sipush #-5874
    //   256: invokestatic a : (II)Ljava/lang/String;
    //   259: iconst_1
    //   260: ldc burp/Zexn
    //   262: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   265: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   268: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   271: astore_3
    //   272: aload_3
    //   273: arraylength
    //   274: istore #4
    //   276: iconst_0
    //   277: istore #5
    //   279: iload #5
    //   281: iload #4
    //   283: if_icmpge -> 420
    //   286: aload_3
    //   287: iload #5
    //   289: aaload
    //   290: astore #6
    //   292: aload #6
    //   294: invokevirtual getModifiers : ()I
    //   297: invokestatic isStatic : (I)Z
    //   300: ifne -> 310
    //   303: goto -> 413
    //   306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   309: athrow
    //   310: aload #6
    //   312: invokevirtual getType : ()Ljava/lang/Class;
    //   315: astore #7
    //   317: aload #7
    //   319: ifnull -> 400
    //   322: aload #7
    //   324: invokevirtual isPrimitive : ()Z
    //   327: ifne -> 400
    //   330: goto -> 337
    //   333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   336: athrow
    //   337: aload #7
    //   339: invokevirtual getPackage : ()Ljava/lang/Package;
    //   342: ifnull -> 400
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   351: athrow
    //   352: aload #7
    //   354: invokevirtual getPackage : ()Ljava/lang/Package;
    //   357: invokevirtual getName : ()Ljava/lang/String;
    //   360: ifnull -> 400
    //   363: goto -> 370
    //   366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   369: athrow
    //   370: aload #7
    //   372: invokevirtual getPackage : ()Ljava/lang/Package;
    //   375: invokevirtual getName : ()Ljava/lang/String;
    //   378: sipush #24918
    //   381: sipush #-2517
    //   384: invokestatic a : (II)Ljava/lang/String;
    //   387: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   390: ifne -> 400
    //   393: goto -> 400
    //   396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   399: athrow
    //   400: aload #6
    //   402: iconst_1
    //   403: invokevirtual setAccessible : (Z)V
    //   406: aload #6
    //   408: aconst_null
    //   409: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   412: pop
    //   413: iinc #5, 1
    //   416: iload_2
    //   417: ifne -> 279
    //   420: sipush #24901
    //   423: sipush #-17532
    //   426: invokestatic a : (II)Ljava/lang/String;
    //   429: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   432: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   435: astore_3
    //   436: aload_3
    //   437: arraylength
    //   438: istore #4
    //   440: iconst_0
    //   441: istore #5
    //   443: iload #5
    //   445: iload #4
    //   447: if_icmpge -> 558
    //   450: aload_3
    //   451: iload #5
    //   453: aaload
    //   454: astore #6
    //   456: aload #6
    //   458: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   461: pop
    //   462: aload #6
    //   464: invokevirtual getModifiers : ()I
    //   467: invokestatic isStatic : (I)Z
    //   470: ifeq -> 544
    //   473: aload #6
    //   475: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   478: arraylength
    //   479: iconst_2
    //   480: if_icmpne -> 544
    //   483: goto -> 490
    //   486: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   489: athrow
    //   490: aload #6
    //   492: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   495: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   498: if_acmpne -> 544
    //   501: goto -> 508
    //   504: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   507: athrow
    //   508: aload #6
    //   510: iconst_1
    //   511: invokevirtual setAccessible : (Z)V
    //   514: aload #6
    //   516: aconst_null
    //   517: iconst_2
    //   518: anewarray java/lang/Object
    //   521: dup
    //   522: iconst_0
    //   523: aload_0
    //   524: aastore
    //   525: dup
    //   526: iconst_1
    //   527: aload_1
    //   528: aastore
    //   529: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   532: pop
    //   533: iload_2
    //   534: ifne -> 558
    //   537: goto -> 544
    //   540: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   543: athrow
    //   544: iinc #5, 1
    //   547: iload_2
    //   548: ifne -> 443
    //   551: goto -> 558
    //   554: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   557: athrow
    //   558: sipush #24910
    //   561: sipush #29514
    //   564: invokestatic a : (II)Ljava/lang/String;
    //   567: iconst_1
    //   568: ldc burp/Zr_k
    //   570: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   573: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   576: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   579: astore_3
    //   580: aload_3
    //   581: arraylength
    //   582: istore #4
    //   584: iconst_0
    //   585: istore #5
    //   587: iload #5
    //   589: iload #4
    //   591: if_icmpge -> 728
    //   594: aload_3
    //   595: iload #5
    //   597: aaload
    //   598: astore #6
    //   600: aload #6
    //   602: invokevirtual getModifiers : ()I
    //   605: invokestatic isStatic : (I)Z
    //   608: ifne -> 618
    //   611: goto -> 721
    //   614: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   617: athrow
    //   618: aload #6
    //   620: invokevirtual getType : ()Ljava/lang/Class;
    //   623: astore #7
    //   625: aload #7
    //   627: ifnull -> 708
    //   630: aload #7
    //   632: invokevirtual isPrimitive : ()Z
    //   635: ifne -> 708
    //   638: goto -> 645
    //   641: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   644: athrow
    //   645: aload #7
    //   647: invokevirtual getPackage : ()Ljava/lang/Package;
    //   650: ifnull -> 708
    //   653: goto -> 660
    //   656: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   659: athrow
    //   660: aload #7
    //   662: invokevirtual getPackage : ()Ljava/lang/Package;
    //   665: invokevirtual getName : ()Ljava/lang/String;
    //   668: ifnull -> 708
    //   671: goto -> 678
    //   674: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   677: athrow
    //   678: aload #7
    //   680: invokevirtual getPackage : ()Ljava/lang/Package;
    //   683: invokevirtual getName : ()Ljava/lang/String;
    //   686: sipush #24925
    //   689: sipush #-1399
    //   692: invokestatic a : (II)Ljava/lang/String;
    //   695: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   698: ifne -> 708
    //   701: goto -> 708
    //   704: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   707: athrow
    //   708: aload #6
    //   710: iconst_1
    //   711: invokevirtual setAccessible : (Z)V
    //   714: aload #6
    //   716: aconst_null
    //   717: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   720: pop
    //   721: iinc #5, 1
    //   724: iload_2
    //   725: ifne -> 587
    //   728: sipush #24897
    //   731: sipush #30821
    //   734: invokestatic a : (II)Ljava/lang/String;
    //   737: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   740: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   743: astore_3
    //   744: aload_3
    //   745: arraylength
    //   746: istore #4
    //   748: iconst_0
    //   749: istore #5
    //   751: iload #5
    //   753: iload #4
    //   755: if_icmpge -> 887
    //   758: aload_3
    //   759: iload #5
    //   761: aaload
    //   762: astore #6
    //   764: aload #6
    //   766: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   769: pop
    //   770: aload #6
    //   772: invokevirtual getModifiers : ()I
    //   775: invokestatic isStatic : (I)Z
    //   778: ifeq -> 873
    //   781: aload #6
    //   783: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   786: arraylength
    //   787: iconst_2
    //   788: if_icmpne -> 873
    //   791: goto -> 798
    //   794: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   797: athrow
    //   798: aload #6
    //   800: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   803: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   806: invokevirtual equals : (Ljava/lang/Object;)Z
    //   809: ifeq -> 873
    //   812: goto -> 819
    //   815: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   818: athrow
    //   819: aload #6
    //   821: iconst_1
    //   822: invokevirtual setAccessible : (Z)V
    //   825: aload #6
    //   827: aconst_null
    //   828: iconst_2
    //   829: anewarray java/lang/Object
    //   832: dup
    //   833: iconst_0
    //   834: aload_0
    //   835: aastore
    //   836: dup
    //   837: iconst_1
    //   838: aload_1
    //   839: ifnonnull -> 857
    //   842: goto -> 849
    //   845: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   848: athrow
    //   849: aload_1
    //   850: goto -> 864
    //   853: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   856: athrow
    //   857: aload_1
    //   858: checkcast [B
    //   861: invokevirtual clone : ()Ljava/lang/Object;
    //   864: aastore
    //   865: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   868: pop
    //   869: iload_2
    //   870: ifne -> 887
    //   873: iinc #5, 1
    //   876: iload_2
    //   877: ifne -> 751
    //   880: goto -> 887
    //   883: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   886: athrow
    //   887: iconst_0
    //   888: istore_3
    //   889: getstatic burp/Zm84.Zd : Ljava/lang/String;
    //   892: getstatic burp/Zzky.Zo : Ljava/lang/Object;
    //   895: checkcast java/math/BigInteger
    //   898: invokevirtual intValue : ()I
    //   901: bipush #32
    //   903: irem
    //   904: invokestatic abs : (I)I
    //   907: invokevirtual charAt : (I)C
    //   910: getstatic burp/Ztdt.Zk : Ljava/lang/String;
    //   913: getstatic burp/Ztdt.ZN : Ljava/lang/Object;
    //   916: checkcast java/math/BigInteger
    //   919: invokevirtual intValue : ()I
    //   922: bipush #32
    //   924: irem
    //   925: invokestatic abs : (I)I
    //   928: invokevirtual charAt : (I)C
    //   931: if_icmple -> 1275
    //   934: sipush #24919
    //   937: sipush #-25468
    //   940: invokestatic a : (II)Ljava/lang/String;
    //   943: iconst_1
    //   944: ldc burp/Ztvn
    //   946: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   949: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   952: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   955: astore #4
    //   957: aload #4
    //   959: arraylength
    //   960: istore #5
    //   962: iconst_0
    //   963: istore #6
    //   965: iload #6
    //   967: iload #5
    //   969: if_icmpge -> 1107
    //   972: aload #4
    //   974: iload #6
    //   976: aaload
    //   977: astore #7
    //   979: aload #7
    //   981: invokevirtual getModifiers : ()I
    //   984: invokestatic isStatic : (I)Z
    //   987: ifne -> 997
    //   990: goto -> 1100
    //   993: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   996: athrow
    //   997: aload #7
    //   999: invokevirtual getType : ()Ljava/lang/Class;
    //   1002: astore #8
    //   1004: aload #8
    //   1006: ifnull -> 1087
    //   1009: aload #8
    //   1011: invokevirtual isPrimitive : ()Z
    //   1014: ifne -> 1087
    //   1017: goto -> 1024
    //   1020: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1023: athrow
    //   1024: aload #8
    //   1026: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1029: ifnull -> 1087
    //   1032: goto -> 1039
    //   1035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1038: athrow
    //   1039: aload #8
    //   1041: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1044: invokevirtual getName : ()Ljava/lang/String;
    //   1047: ifnull -> 1087
    //   1050: goto -> 1057
    //   1053: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1056: athrow
    //   1057: aload #8
    //   1059: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1062: invokevirtual getName : ()Ljava/lang/String;
    //   1065: sipush #24925
    //   1068: sipush #-1399
    //   1071: invokestatic a : (II)Ljava/lang/String;
    //   1074: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1077: ifne -> 1087
    //   1080: goto -> 1087
    //   1083: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1086: athrow
    //   1087: aload #7
    //   1089: iconst_1
    //   1090: invokevirtual setAccessible : (Z)V
    //   1093: aload #7
    //   1095: aconst_null
    //   1096: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1099: pop
    //   1100: iinc #6, 1
    //   1103: iload_2
    //   1104: ifne -> 965
    //   1107: sipush #24907
    //   1110: sipush #18806
    //   1113: invokestatic a : (II)Ljava/lang/String;
    //   1116: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1119: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1122: astore #4
    //   1124: aload #4
    //   1126: arraylength
    //   1127: istore #5
    //   1129: iconst_0
    //   1130: istore #6
    //   1132: iload #6
    //   1134: iload #5
    //   1136: if_icmpge -> 1272
    //   1139: aload #4
    //   1141: iload #6
    //   1143: aaload
    //   1144: astore #7
    //   1146: aload #7
    //   1148: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1151: pop
    //   1152: aload #7
    //   1154: invokevirtual getModifiers : ()I
    //   1157: invokestatic isStatic : (I)Z
    //   1160: ifeq -> 1258
    //   1163: aload #7
    //   1165: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1168: arraylength
    //   1169: iconst_2
    //   1170: if_icmpne -> 1258
    //   1173: goto -> 1180
    //   1176: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1179: athrow
    //   1180: aload #7
    //   1182: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1185: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1188: if_acmpne -> 1258
    //   1191: goto -> 1198
    //   1194: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1197: athrow
    //   1198: aload #7
    //   1200: iconst_1
    //   1201: invokevirtual setAccessible : (Z)V
    //   1204: aload #7
    //   1206: aconst_null
    //   1207: iconst_2
    //   1208: anewarray java/lang/Object
    //   1211: dup
    //   1212: iconst_0
    //   1213: aload_0
    //   1214: aastore
    //   1215: dup
    //   1216: iconst_1
    //   1217: aload_1
    //   1218: ifnonnull -> 1236
    //   1221: goto -> 1228
    //   1224: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1227: athrow
    //   1228: aload_1
    //   1229: goto -> 1243
    //   1232: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1235: athrow
    //   1236: aload_1
    //   1237: checkcast [B
    //   1240: invokevirtual clone : ()Ljava/lang/Object;
    //   1243: aastore
    //   1244: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1247: checkcast java/lang/Boolean
    //   1250: invokevirtual booleanValue : ()Z
    //   1253: istore_3
    //   1254: iload_2
    //   1255: ifne -> 1272
    //   1258: iinc #6, 1
    //   1261: iload_2
    //   1262: ifne -> 1132
    //   1265: goto -> 1272
    //   1268: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1271: athrow
    //   1272: goto -> 1613
    //   1275: sipush #24922
    //   1278: sipush #9432
    //   1281: invokestatic a : (II)Ljava/lang/String;
    //   1284: iconst_1
    //   1285: ldc burp/Zej5
    //   1287: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1290: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1293: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1296: astore #4
    //   1298: aload #4
    //   1300: arraylength
    //   1301: istore #5
    //   1303: iconst_0
    //   1304: istore #6
    //   1306: iload #6
    //   1308: iload #5
    //   1310: if_icmpge -> 1448
    //   1313: aload #4
    //   1315: iload #6
    //   1317: aaload
    //   1318: astore #7
    //   1320: aload #7
    //   1322: invokevirtual getModifiers : ()I
    //   1325: invokestatic isStatic : (I)Z
    //   1328: ifne -> 1338
    //   1331: goto -> 1441
    //   1334: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1337: athrow
    //   1338: aload #7
    //   1340: invokevirtual getType : ()Ljava/lang/Class;
    //   1343: astore #8
    //   1345: aload #8
    //   1347: ifnull -> 1428
    //   1350: aload #8
    //   1352: invokevirtual isPrimitive : ()Z
    //   1355: ifne -> 1428
    //   1358: goto -> 1365
    //   1361: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1364: athrow
    //   1365: aload #8
    //   1367: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1370: ifnull -> 1428
    //   1373: goto -> 1380
    //   1376: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1379: athrow
    //   1380: aload #8
    //   1382: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1385: invokevirtual getName : ()Ljava/lang/String;
    //   1388: ifnull -> 1428
    //   1391: goto -> 1398
    //   1394: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1397: athrow
    //   1398: aload #8
    //   1400: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1403: invokevirtual getName : ()Ljava/lang/String;
    //   1406: sipush #24925
    //   1409: sipush #-1399
    //   1412: invokestatic a : (II)Ljava/lang/String;
    //   1415: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1418: ifne -> 1428
    //   1421: goto -> 1428
    //   1424: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1427: athrow
    //   1428: aload #7
    //   1430: iconst_1
    //   1431: invokevirtual setAccessible : (Z)V
    //   1434: aload #7
    //   1436: aconst_null
    //   1437: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1440: pop
    //   1441: iinc #6, 1
    //   1444: iload_2
    //   1445: ifne -> 1306
    //   1448: sipush #24927
    //   1451: sipush #-23315
    //   1454: invokestatic a : (II)Ljava/lang/String;
    //   1457: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1460: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1463: astore #4
    //   1465: aload #4
    //   1467: arraylength
    //   1468: istore #5
    //   1470: iconst_0
    //   1471: istore #6
    //   1473: iload #6
    //   1475: iload #5
    //   1477: if_icmpge -> 1613
    //   1480: aload #4
    //   1482: iload #6
    //   1484: aaload
    //   1485: astore #7
    //   1487: aload #7
    //   1489: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1492: pop
    //   1493: aload #7
    //   1495: invokevirtual getModifiers : ()I
    //   1498: invokestatic isStatic : (I)Z
    //   1501: ifeq -> 1599
    //   1504: aload #7
    //   1506: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1509: arraylength
    //   1510: iconst_2
    //   1511: if_icmpne -> 1599
    //   1514: goto -> 1521
    //   1517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1520: athrow
    //   1521: aload #7
    //   1523: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1526: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1529: if_acmpne -> 1599
    //   1532: goto -> 1539
    //   1535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1538: athrow
    //   1539: aload #7
    //   1541: iconst_1
    //   1542: invokevirtual setAccessible : (Z)V
    //   1545: aload #7
    //   1547: aconst_null
    //   1548: iconst_2
    //   1549: anewarray java/lang/Object
    //   1552: dup
    //   1553: iconst_0
    //   1554: aload_0
    //   1555: aastore
    //   1556: dup
    //   1557: iconst_1
    //   1558: aload_1
    //   1559: ifnonnull -> 1577
    //   1562: goto -> 1569
    //   1565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1568: athrow
    //   1569: aload_1
    //   1570: goto -> 1584
    //   1573: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1576: athrow
    //   1577: aload_1
    //   1578: checkcast [B
    //   1581: invokevirtual clone : ()Ljava/lang/Object;
    //   1584: aastore
    //   1585: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1588: checkcast java/lang/Boolean
    //   1591: invokevirtual booleanValue : ()Z
    //   1594: istore_3
    //   1595: iload_2
    //   1596: ifne -> 1613
    //   1599: iinc #6, 1
    //   1602: iload_2
    //   1603: ifne -> 1473
    //   1606: goto -> 1613
    //   1609: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1612: athrow
    //   1613: iload_3
    //   1614: ifeq -> 1619
    //   1617: iload_3
    //   1618: ireturn
    //   1619: getstatic burp/Zrm4.ZK : Ljava/lang/String;
    //   1622: getstatic burp/Ze0w.ZU : Ljava/lang/Object;
    //   1625: checkcast java/math/BigInteger
    //   1628: invokevirtual intValue : ()I
    //   1631: bipush #32
    //   1633: irem
    //   1634: invokestatic abs : (I)I
    //   1637: invokevirtual charAt : (I)C
    //   1640: getstatic burp/Zsq5.ZA : Ljava/lang/String;
    //   1643: getstatic burp/Zryq.ZR : Ljava/lang/Object;
    //   1646: checkcast java/math/BigInteger
    //   1649: invokevirtual intValue : ()I
    //   1652: bipush #32
    //   1654: irem
    //   1655: invokestatic abs : (I)I
    //   1658: invokevirtual charAt : (I)C
    //   1661: if_icmpgt -> 2006
    //   1664: sipush #24909
    //   1667: sipush #-22835
    //   1670: invokestatic a : (II)Ljava/lang/String;
    //   1673: iconst_1
    //   1674: ldc burp/Zb_u
    //   1676: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1679: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1682: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1685: astore #4
    //   1687: aload #4
    //   1689: arraylength
    //   1690: istore #5
    //   1692: iconst_0
    //   1693: istore #6
    //   1695: iload #6
    //   1697: iload #5
    //   1699: if_icmpge -> 1837
    //   1702: aload #4
    //   1704: iload #6
    //   1706: aaload
    //   1707: astore #7
    //   1709: aload #7
    //   1711: invokevirtual getModifiers : ()I
    //   1714: invokestatic isStatic : (I)Z
    //   1717: ifne -> 1727
    //   1720: goto -> 1830
    //   1723: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1726: athrow
    //   1727: aload #7
    //   1729: invokevirtual getType : ()Ljava/lang/Class;
    //   1732: astore #8
    //   1734: aload #8
    //   1736: ifnull -> 1817
    //   1739: aload #8
    //   1741: invokevirtual isPrimitive : ()Z
    //   1744: ifne -> 1817
    //   1747: goto -> 1754
    //   1750: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1753: athrow
    //   1754: aload #8
    //   1756: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1759: ifnull -> 1817
    //   1762: goto -> 1769
    //   1765: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1768: athrow
    //   1769: aload #8
    //   1771: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1774: invokevirtual getName : ()Ljava/lang/String;
    //   1777: ifnull -> 1817
    //   1780: goto -> 1787
    //   1783: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1786: athrow
    //   1787: aload #8
    //   1789: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1792: invokevirtual getName : ()Ljava/lang/String;
    //   1795: sipush #24925
    //   1798: sipush #-1399
    //   1801: invokestatic a : (II)Ljava/lang/String;
    //   1804: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1807: ifne -> 1817
    //   1810: goto -> 1817
    //   1813: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1816: athrow
    //   1817: aload #7
    //   1819: iconst_1
    //   1820: invokevirtual setAccessible : (Z)V
    //   1823: aload #7
    //   1825: aconst_null
    //   1826: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1829: pop
    //   1830: iinc #6, 1
    //   1833: iload_2
    //   1834: ifne -> 1695
    //   1837: sipush #24920
    //   1840: sipush #28224
    //   1843: invokestatic a : (II)Ljava/lang/String;
    //   1846: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1849: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1852: astore #4
    //   1854: aload #4
    //   1856: arraylength
    //   1857: istore #5
    //   1859: iconst_0
    //   1860: istore #6
    //   1862: iload #6
    //   1864: iload #5
    //   1866: if_icmpge -> 2002
    //   1869: aload #4
    //   1871: iload #6
    //   1873: aaload
    //   1874: astore #7
    //   1876: aload #7
    //   1878: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1881: pop
    //   1882: aload #7
    //   1884: invokevirtual getModifiers : ()I
    //   1887: invokestatic isStatic : (I)Z
    //   1890: ifeq -> 1988
    //   1893: aload #7
    //   1895: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1898: arraylength
    //   1899: iconst_2
    //   1900: if_icmpne -> 1988
    //   1903: goto -> 1910
    //   1906: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1909: athrow
    //   1910: aload #7
    //   1912: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1915: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1918: if_acmpne -> 1988
    //   1921: goto -> 1928
    //   1924: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1927: athrow
    //   1928: aload #7
    //   1930: iconst_1
    //   1931: invokevirtual setAccessible : (Z)V
    //   1934: aload #7
    //   1936: aconst_null
    //   1937: iconst_2
    //   1938: anewarray java/lang/Object
    //   1941: dup
    //   1942: iconst_0
    //   1943: aload_0
    //   1944: aastore
    //   1945: dup
    //   1946: iconst_1
    //   1947: aload_1
    //   1948: ifnonnull -> 1966
    //   1951: goto -> 1958
    //   1954: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1957: athrow
    //   1958: aload_1
    //   1959: goto -> 1973
    //   1962: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1965: athrow
    //   1966: aload_1
    //   1967: checkcast [B
    //   1970: invokevirtual clone : ()Ljava/lang/Object;
    //   1973: aastore
    //   1974: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1977: checkcast java/lang/Boolean
    //   1980: invokevirtual booleanValue : ()Z
    //   1983: istore_3
    //   1984: iload_2
    //   1985: ifne -> 2002
    //   1988: iinc #6, 1
    //   1991: iload_2
    //   1992: ifne -> 1862
    //   1995: goto -> 2002
    //   1998: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2001: athrow
    //   2002: iload_2
    //   2003: ifne -> 2344
    //   2006: sipush #24906
    //   2009: sipush #-31122
    //   2012: invokestatic a : (II)Ljava/lang/String;
    //   2015: iconst_1
    //   2016: ldc burp/Zl_k
    //   2018: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2021: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2024: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2027: astore #4
    //   2029: aload #4
    //   2031: arraylength
    //   2032: istore #5
    //   2034: iconst_0
    //   2035: istore #6
    //   2037: iload #6
    //   2039: iload #5
    //   2041: if_icmpge -> 2179
    //   2044: aload #4
    //   2046: iload #6
    //   2048: aaload
    //   2049: astore #7
    //   2051: aload #7
    //   2053: invokevirtual getModifiers : ()I
    //   2056: invokestatic isStatic : (I)Z
    //   2059: ifne -> 2069
    //   2062: goto -> 2172
    //   2065: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2068: athrow
    //   2069: aload #7
    //   2071: invokevirtual getType : ()Ljava/lang/Class;
    //   2074: astore #8
    //   2076: aload #8
    //   2078: ifnull -> 2159
    //   2081: aload #8
    //   2083: invokevirtual isPrimitive : ()Z
    //   2086: ifne -> 2159
    //   2089: goto -> 2096
    //   2092: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2095: athrow
    //   2096: aload #8
    //   2098: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2101: ifnull -> 2159
    //   2104: goto -> 2111
    //   2107: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2110: athrow
    //   2111: aload #8
    //   2113: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2116: invokevirtual getName : ()Ljava/lang/String;
    //   2119: ifnull -> 2159
    //   2122: goto -> 2129
    //   2125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2128: athrow
    //   2129: aload #8
    //   2131: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2134: invokevirtual getName : ()Ljava/lang/String;
    //   2137: sipush #24925
    //   2140: sipush #-1399
    //   2143: invokestatic a : (II)Ljava/lang/String;
    //   2146: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2149: ifne -> 2159
    //   2152: goto -> 2159
    //   2155: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2158: athrow
    //   2159: aload #7
    //   2161: iconst_1
    //   2162: invokevirtual setAccessible : (Z)V
    //   2165: aload #7
    //   2167: aconst_null
    //   2168: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2171: pop
    //   2172: iinc #6, 1
    //   2175: iload_2
    //   2176: ifne -> 2037
    //   2179: sipush #24902
    //   2182: sipush #-22606
    //   2185: invokestatic a : (II)Ljava/lang/String;
    //   2188: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2191: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2194: astore #4
    //   2196: aload #4
    //   2198: arraylength
    //   2199: istore #5
    //   2201: iconst_0
    //   2202: istore #6
    //   2204: iload #6
    //   2206: iload #5
    //   2208: if_icmpge -> 2344
    //   2211: aload #4
    //   2213: iload #6
    //   2215: aaload
    //   2216: astore #7
    //   2218: aload #7
    //   2220: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2223: pop
    //   2224: aload #7
    //   2226: invokevirtual getModifiers : ()I
    //   2229: invokestatic isStatic : (I)Z
    //   2232: ifeq -> 2330
    //   2235: aload #7
    //   2237: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2240: arraylength
    //   2241: iconst_2
    //   2242: if_icmpne -> 2330
    //   2245: goto -> 2252
    //   2248: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2251: athrow
    //   2252: aload #7
    //   2254: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2257: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2260: if_acmpne -> 2330
    //   2263: goto -> 2270
    //   2266: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2269: athrow
    //   2270: aload #7
    //   2272: iconst_1
    //   2273: invokevirtual setAccessible : (Z)V
    //   2276: aload #7
    //   2278: aconst_null
    //   2279: iconst_2
    //   2280: anewarray java/lang/Object
    //   2283: dup
    //   2284: iconst_0
    //   2285: aload_0
    //   2286: aastore
    //   2287: dup
    //   2288: iconst_1
    //   2289: aload_1
    //   2290: ifnonnull -> 2308
    //   2293: goto -> 2300
    //   2296: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2299: athrow
    //   2300: aload_1
    //   2301: goto -> 2315
    //   2304: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2307: athrow
    //   2308: aload_1
    //   2309: checkcast [B
    //   2312: invokevirtual clone : ()Ljava/lang/Object;
    //   2315: aastore
    //   2316: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2319: checkcast java/lang/Boolean
    //   2322: invokevirtual booleanValue : ()Z
    //   2325: istore_3
    //   2326: iload_2
    //   2327: ifne -> 2344
    //   2330: iinc #6, 1
    //   2333: iload_2
    //   2334: ifne -> 2204
    //   2337: goto -> 2344
    //   2340: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2343: athrow
    //   2344: iload_3
    //   2345: ifeq -> 2350
    //   2348: iload_3
    //   2349: ireturn
    //   2350: getstatic burp/Zlpl.ZO : Ljava/lang/String;
    //   2353: getstatic burp/Zetv.ZI : Ljava/lang/Object;
    //   2356: checkcast java/math/BigInteger
    //   2359: invokevirtual intValue : ()I
    //   2362: bipush #32
    //   2364: irem
    //   2365: invokestatic abs : (I)I
    //   2368: invokevirtual charAt : (I)C
    //   2371: getstatic burp/Zezn.Ze : Ljava/lang/String;
    //   2374: getstatic burp/Zlxm.Zc : Ljava/lang/Object;
    //   2377: checkcast java/math/BigInteger
    //   2380: invokevirtual intValue : ()I
    //   2383: bipush #32
    //   2385: irem
    //   2386: invokestatic abs : (I)I
    //   2389: invokevirtual charAt : (I)C
    //   2392: if_icmple -> 2737
    //   2395: sipush #24923
    //   2398: sipush #30053
    //   2401: invokestatic a : (II)Ljava/lang/String;
    //   2404: iconst_1
    //   2405: ldc burp/Zlr2
    //   2407: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2410: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2413: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2416: astore #4
    //   2418: aload #4
    //   2420: arraylength
    //   2421: istore #5
    //   2423: iconst_0
    //   2424: istore #6
    //   2426: iload #6
    //   2428: iload #5
    //   2430: if_icmpge -> 2568
    //   2433: aload #4
    //   2435: iload #6
    //   2437: aaload
    //   2438: astore #7
    //   2440: aload #7
    //   2442: invokevirtual getModifiers : ()I
    //   2445: invokestatic isStatic : (I)Z
    //   2448: ifne -> 2458
    //   2451: goto -> 2561
    //   2454: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2457: athrow
    //   2458: aload #7
    //   2460: invokevirtual getType : ()Ljava/lang/Class;
    //   2463: astore #8
    //   2465: aload #8
    //   2467: ifnull -> 2548
    //   2470: aload #8
    //   2472: invokevirtual isPrimitive : ()Z
    //   2475: ifne -> 2548
    //   2478: goto -> 2485
    //   2481: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2484: athrow
    //   2485: aload #8
    //   2487: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2490: ifnull -> 2548
    //   2493: goto -> 2500
    //   2496: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2499: athrow
    //   2500: aload #8
    //   2502: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2505: invokevirtual getName : ()Ljava/lang/String;
    //   2508: ifnull -> 2548
    //   2511: goto -> 2518
    //   2514: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2517: athrow
    //   2518: aload #8
    //   2520: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2523: invokevirtual getName : ()Ljava/lang/String;
    //   2526: sipush #24925
    //   2529: sipush #-1399
    //   2532: invokestatic a : (II)Ljava/lang/String;
    //   2535: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2538: ifne -> 2548
    //   2541: goto -> 2548
    //   2544: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2547: athrow
    //   2548: aload #7
    //   2550: iconst_1
    //   2551: invokevirtual setAccessible : (Z)V
    //   2554: aload #7
    //   2556: aconst_null
    //   2557: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2560: pop
    //   2561: iinc #6, 1
    //   2564: iload_2
    //   2565: ifne -> 2426
    //   2568: sipush #24903
    //   2571: sipush #18314
    //   2574: invokestatic a : (II)Ljava/lang/String;
    //   2577: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2580: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2583: astore #4
    //   2585: aload #4
    //   2587: arraylength
    //   2588: istore #5
    //   2590: iconst_0
    //   2591: istore #6
    //   2593: iload #6
    //   2595: iload #5
    //   2597: if_icmpge -> 2733
    //   2600: aload #4
    //   2602: iload #6
    //   2604: aaload
    //   2605: astore #7
    //   2607: aload #7
    //   2609: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2612: pop
    //   2613: aload #7
    //   2615: invokevirtual getModifiers : ()I
    //   2618: invokestatic isStatic : (I)Z
    //   2621: ifeq -> 2719
    //   2624: aload #7
    //   2626: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2629: arraylength
    //   2630: iconst_2
    //   2631: if_icmpne -> 2719
    //   2634: goto -> 2641
    //   2637: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2640: athrow
    //   2641: aload #7
    //   2643: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2646: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2649: if_acmpne -> 2719
    //   2652: goto -> 2659
    //   2655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2658: athrow
    //   2659: aload #7
    //   2661: iconst_1
    //   2662: invokevirtual setAccessible : (Z)V
    //   2665: aload #7
    //   2667: aconst_null
    //   2668: iconst_2
    //   2669: anewarray java/lang/Object
    //   2672: dup
    //   2673: iconst_0
    //   2674: aload_0
    //   2675: aastore
    //   2676: dup
    //   2677: iconst_1
    //   2678: aload_1
    //   2679: ifnonnull -> 2697
    //   2682: goto -> 2689
    //   2685: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2688: athrow
    //   2689: aload_1
    //   2690: goto -> 2704
    //   2693: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2696: athrow
    //   2697: aload_1
    //   2698: checkcast [B
    //   2701: invokevirtual clone : ()Ljava/lang/Object;
    //   2704: aastore
    //   2705: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2708: checkcast java/lang/Boolean
    //   2711: invokevirtual booleanValue : ()Z
    //   2714: istore_3
    //   2715: iload_2
    //   2716: ifne -> 2733
    //   2719: iinc #6, 1
    //   2722: iload_2
    //   2723: ifne -> 2593
    //   2726: goto -> 2733
    //   2729: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2732: athrow
    //   2733: iload_2
    //   2734: ifne -> 3075
    //   2737: sipush #24911
    //   2740: sipush #10934
    //   2743: invokestatic a : (II)Ljava/lang/String;
    //   2746: iconst_1
    //   2747: ldc burp/Zl5d
    //   2749: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2752: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2755: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2758: astore #4
    //   2760: aload #4
    //   2762: arraylength
    //   2763: istore #5
    //   2765: iconst_0
    //   2766: istore #6
    //   2768: iload #6
    //   2770: iload #5
    //   2772: if_icmpge -> 2910
    //   2775: aload #4
    //   2777: iload #6
    //   2779: aaload
    //   2780: astore #7
    //   2782: aload #7
    //   2784: invokevirtual getModifiers : ()I
    //   2787: invokestatic isStatic : (I)Z
    //   2790: ifne -> 2800
    //   2793: goto -> 2903
    //   2796: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2799: athrow
    //   2800: aload #7
    //   2802: invokevirtual getType : ()Ljava/lang/Class;
    //   2805: astore #8
    //   2807: aload #8
    //   2809: ifnull -> 2890
    //   2812: aload #8
    //   2814: invokevirtual isPrimitive : ()Z
    //   2817: ifne -> 2890
    //   2820: goto -> 2827
    //   2823: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2826: athrow
    //   2827: aload #8
    //   2829: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2832: ifnull -> 2890
    //   2835: goto -> 2842
    //   2838: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2841: athrow
    //   2842: aload #8
    //   2844: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2847: invokevirtual getName : ()Ljava/lang/String;
    //   2850: ifnull -> 2890
    //   2853: goto -> 2860
    //   2856: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2859: athrow
    //   2860: aload #8
    //   2862: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2865: invokevirtual getName : ()Ljava/lang/String;
    //   2868: sipush #24925
    //   2871: sipush #-1399
    //   2874: invokestatic a : (II)Ljava/lang/String;
    //   2877: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2880: ifne -> 2890
    //   2883: goto -> 2890
    //   2886: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2889: athrow
    //   2890: aload #7
    //   2892: iconst_1
    //   2893: invokevirtual setAccessible : (Z)V
    //   2896: aload #7
    //   2898: aconst_null
    //   2899: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2902: pop
    //   2903: iinc #6, 1
    //   2906: iload_2
    //   2907: ifne -> 2768
    //   2910: sipush #24899
    //   2913: sipush #-6821
    //   2916: invokestatic a : (II)Ljava/lang/String;
    //   2919: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2922: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2925: astore #4
    //   2927: aload #4
    //   2929: arraylength
    //   2930: istore #5
    //   2932: iconst_0
    //   2933: istore #6
    //   2935: iload #6
    //   2937: iload #5
    //   2939: if_icmpge -> 3075
    //   2942: aload #4
    //   2944: iload #6
    //   2946: aaload
    //   2947: astore #7
    //   2949: aload #7
    //   2951: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2954: pop
    //   2955: aload #7
    //   2957: invokevirtual getModifiers : ()I
    //   2960: invokestatic isStatic : (I)Z
    //   2963: ifeq -> 3061
    //   2966: aload #7
    //   2968: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2971: arraylength
    //   2972: iconst_2
    //   2973: if_icmpne -> 3061
    //   2976: goto -> 2983
    //   2979: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2982: athrow
    //   2983: aload #7
    //   2985: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2988: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2991: if_acmpne -> 3061
    //   2994: goto -> 3001
    //   2997: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3000: athrow
    //   3001: aload #7
    //   3003: iconst_1
    //   3004: invokevirtual setAccessible : (Z)V
    //   3007: aload #7
    //   3009: aconst_null
    //   3010: iconst_2
    //   3011: anewarray java/lang/Object
    //   3014: dup
    //   3015: iconst_0
    //   3016: aload_0
    //   3017: aastore
    //   3018: dup
    //   3019: iconst_1
    //   3020: aload_1
    //   3021: ifnonnull -> 3039
    //   3024: goto -> 3031
    //   3027: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3030: athrow
    //   3031: aload_1
    //   3032: goto -> 3046
    //   3035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3038: athrow
    //   3039: aload_1
    //   3040: checkcast [B
    //   3043: invokevirtual clone : ()Ljava/lang/Object;
    //   3046: aastore
    //   3047: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3050: checkcast java/lang/Boolean
    //   3053: invokevirtual booleanValue : ()Z
    //   3056: istore_3
    //   3057: iload_2
    //   3058: ifne -> 3075
    //   3061: iinc #6, 1
    //   3064: iload_2
    //   3065: ifne -> 2935
    //   3068: goto -> 3075
    //   3071: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3074: athrow
    //   3075: iload_3
    //   3076: ifeq -> 3081
    //   3079: iload_3
    //   3080: ireturn
    //   3081: getstatic burp/Zryq.Zb : Ljava/lang/String;
    //   3084: getstatic burp/Zxdh.ZD : Ljava/lang/Object;
    //   3087: checkcast java/math/BigInteger
    //   3090: invokevirtual intValue : ()I
    //   3093: bipush #32
    //   3095: irem
    //   3096: invokestatic abs : (I)I
    //   3099: invokevirtual charAt : (I)C
    //   3102: getstatic burp/Zbnb.Zd : Ljava/lang/String;
    //   3105: getstatic burp/Zr9p.ZC : Ljava/lang/Object;
    //   3108: checkcast java/math/BigInteger
    //   3111: invokevirtual intValue : ()I
    //   3114: bipush #32
    //   3116: irem
    //   3117: invokestatic abs : (I)I
    //   3120: invokevirtual charAt : (I)C
    //   3123: if_icmpgt -> 3468
    //   3126: sipush #24926
    //   3129: sipush #9045
    //   3132: invokestatic a : (II)Ljava/lang/String;
    //   3135: iconst_1
    //   3136: ldc burp/Zrva
    //   3138: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3141: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3144: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3147: astore #4
    //   3149: aload #4
    //   3151: arraylength
    //   3152: istore #5
    //   3154: iconst_0
    //   3155: istore #6
    //   3157: iload #6
    //   3159: iload #5
    //   3161: if_icmpge -> 3299
    //   3164: aload #4
    //   3166: iload #6
    //   3168: aaload
    //   3169: astore #7
    //   3171: aload #7
    //   3173: invokevirtual getModifiers : ()I
    //   3176: invokestatic isStatic : (I)Z
    //   3179: ifne -> 3189
    //   3182: goto -> 3292
    //   3185: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3188: athrow
    //   3189: aload #7
    //   3191: invokevirtual getType : ()Ljava/lang/Class;
    //   3194: astore #8
    //   3196: aload #8
    //   3198: ifnull -> 3279
    //   3201: aload #8
    //   3203: invokevirtual isPrimitive : ()Z
    //   3206: ifne -> 3279
    //   3209: goto -> 3216
    //   3212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3215: athrow
    //   3216: aload #8
    //   3218: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3221: ifnull -> 3279
    //   3224: goto -> 3231
    //   3227: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3230: athrow
    //   3231: aload #8
    //   3233: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3236: invokevirtual getName : ()Ljava/lang/String;
    //   3239: ifnull -> 3279
    //   3242: goto -> 3249
    //   3245: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3248: athrow
    //   3249: aload #8
    //   3251: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3254: invokevirtual getName : ()Ljava/lang/String;
    //   3257: sipush #24925
    //   3260: sipush #-1399
    //   3263: invokestatic a : (II)Ljava/lang/String;
    //   3266: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3269: ifne -> 3279
    //   3272: goto -> 3279
    //   3275: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3278: athrow
    //   3279: aload #7
    //   3281: iconst_1
    //   3282: invokevirtual setAccessible : (Z)V
    //   3285: aload #7
    //   3287: aconst_null
    //   3288: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3291: pop
    //   3292: iinc #6, 1
    //   3295: iload_2
    //   3296: ifne -> 3157
    //   3299: sipush #24908
    //   3302: sipush #8815
    //   3305: invokestatic a : (II)Ljava/lang/String;
    //   3308: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3311: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3314: astore #4
    //   3316: aload #4
    //   3318: arraylength
    //   3319: istore #5
    //   3321: iconst_0
    //   3322: istore #6
    //   3324: iload #6
    //   3326: iload #5
    //   3328: if_icmpge -> 3464
    //   3331: aload #4
    //   3333: iload #6
    //   3335: aaload
    //   3336: astore #7
    //   3338: aload #7
    //   3340: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3343: pop
    //   3344: aload #7
    //   3346: invokevirtual getModifiers : ()I
    //   3349: invokestatic isStatic : (I)Z
    //   3352: ifeq -> 3450
    //   3355: aload #7
    //   3357: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3360: arraylength
    //   3361: iconst_2
    //   3362: if_icmpne -> 3450
    //   3365: goto -> 3372
    //   3368: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3371: athrow
    //   3372: aload #7
    //   3374: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3377: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3380: if_acmpne -> 3450
    //   3383: goto -> 3390
    //   3386: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3389: athrow
    //   3390: aload #7
    //   3392: iconst_1
    //   3393: invokevirtual setAccessible : (Z)V
    //   3396: aload #7
    //   3398: aconst_null
    //   3399: iconst_2
    //   3400: anewarray java/lang/Object
    //   3403: dup
    //   3404: iconst_0
    //   3405: aload_0
    //   3406: aastore
    //   3407: dup
    //   3408: iconst_1
    //   3409: aload_1
    //   3410: ifnonnull -> 3428
    //   3413: goto -> 3420
    //   3416: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3419: athrow
    //   3420: aload_1
    //   3421: goto -> 3435
    //   3424: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3427: athrow
    //   3428: aload_1
    //   3429: checkcast [B
    //   3432: invokevirtual clone : ()Ljava/lang/Object;
    //   3435: aastore
    //   3436: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3439: checkcast java/lang/Boolean
    //   3442: invokevirtual booleanValue : ()Z
    //   3445: istore_3
    //   3446: iload_2
    //   3447: ifne -> 3464
    //   3450: iinc #6, 1
    //   3453: iload_2
    //   3454: ifne -> 3324
    //   3457: goto -> 3464
    //   3460: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3463: athrow
    //   3464: iload_2
    //   3465: ifne -> 3806
    //   3468: sipush #24921
    //   3471: sipush #-1954
    //   3474: invokestatic a : (II)Ljava/lang/String;
    //   3477: iconst_1
    //   3478: ldc burp/Zldx
    //   3480: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3483: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3486: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3489: astore #4
    //   3491: aload #4
    //   3493: arraylength
    //   3494: istore #5
    //   3496: iconst_0
    //   3497: istore #6
    //   3499: iload #6
    //   3501: iload #5
    //   3503: if_icmpge -> 3641
    //   3506: aload #4
    //   3508: iload #6
    //   3510: aaload
    //   3511: astore #7
    //   3513: aload #7
    //   3515: invokevirtual getModifiers : ()I
    //   3518: invokestatic isStatic : (I)Z
    //   3521: ifne -> 3531
    //   3524: goto -> 3634
    //   3527: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3530: athrow
    //   3531: aload #7
    //   3533: invokevirtual getType : ()Ljava/lang/Class;
    //   3536: astore #8
    //   3538: aload #8
    //   3540: ifnull -> 3621
    //   3543: aload #8
    //   3545: invokevirtual isPrimitive : ()Z
    //   3548: ifne -> 3621
    //   3551: goto -> 3558
    //   3554: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3557: athrow
    //   3558: aload #8
    //   3560: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3563: ifnull -> 3621
    //   3566: goto -> 3573
    //   3569: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3572: athrow
    //   3573: aload #8
    //   3575: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3578: invokevirtual getName : ()Ljava/lang/String;
    //   3581: ifnull -> 3621
    //   3584: goto -> 3591
    //   3587: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3590: athrow
    //   3591: aload #8
    //   3593: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3596: invokevirtual getName : ()Ljava/lang/String;
    //   3599: sipush #24925
    //   3602: sipush #-1399
    //   3605: invokestatic a : (II)Ljava/lang/String;
    //   3608: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3611: ifne -> 3621
    //   3614: goto -> 3621
    //   3617: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3620: athrow
    //   3621: aload #7
    //   3623: iconst_1
    //   3624: invokevirtual setAccessible : (Z)V
    //   3627: aload #7
    //   3629: aconst_null
    //   3630: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3633: pop
    //   3634: iinc #6, 1
    //   3637: iload_2
    //   3638: ifne -> 3499
    //   3641: sipush #24900
    //   3644: sipush #28936
    //   3647: invokestatic a : (II)Ljava/lang/String;
    //   3650: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3653: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3656: astore #4
    //   3658: aload #4
    //   3660: arraylength
    //   3661: istore #5
    //   3663: iconst_0
    //   3664: istore #6
    //   3666: iload #6
    //   3668: iload #5
    //   3670: if_icmpge -> 3806
    //   3673: aload #4
    //   3675: iload #6
    //   3677: aaload
    //   3678: astore #7
    //   3680: aload #7
    //   3682: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3685: pop
    //   3686: aload #7
    //   3688: invokevirtual getModifiers : ()I
    //   3691: invokestatic isStatic : (I)Z
    //   3694: ifeq -> 3792
    //   3697: aload #7
    //   3699: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3702: arraylength
    //   3703: iconst_2
    //   3704: if_icmpne -> 3792
    //   3707: goto -> 3714
    //   3710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3713: athrow
    //   3714: aload #7
    //   3716: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3719: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3722: if_acmpne -> 3792
    //   3725: goto -> 3732
    //   3728: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3731: athrow
    //   3732: aload #7
    //   3734: iconst_1
    //   3735: invokevirtual setAccessible : (Z)V
    //   3738: aload #7
    //   3740: aconst_null
    //   3741: iconst_2
    //   3742: anewarray java/lang/Object
    //   3745: dup
    //   3746: iconst_0
    //   3747: aload_0
    //   3748: aastore
    //   3749: dup
    //   3750: iconst_1
    //   3751: aload_1
    //   3752: ifnonnull -> 3770
    //   3755: goto -> 3762
    //   3758: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3761: athrow
    //   3762: aload_1
    //   3763: goto -> 3777
    //   3766: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3769: athrow
    //   3770: aload_1
    //   3771: checkcast [B
    //   3774: invokevirtual clone : ()Ljava/lang/Object;
    //   3777: aastore
    //   3778: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3781: checkcast java/lang/Boolean
    //   3784: invokevirtual booleanValue : ()Z
    //   3787: istore_3
    //   3788: iload_2
    //   3789: ifne -> 3806
    //   3792: iinc #6, 1
    //   3795: iload_2
    //   3796: ifne -> 3666
    //   3799: goto -> 3806
    //   3802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3805: athrow
    //   3806: iload_3
    //   3807: ireturn
    //   3808: astore_3
    //   3809: new java/lang/Exception
    //   3812: dup
    //   3813: aload_3
    //   3814: invokevirtual getMessage : ()Ljava/lang/String;
    //   3817: invokespecial <init> : (Ljava/lang/String;)V
    //   3820: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1618	3808	java/lang/Throwable
    //   292	306	306	java/lang/Throwable
    //   317	330	333	java/lang/Throwable
    //   322	345	348	java/lang/Throwable
    //   337	363	366	java/lang/Throwable
    //   352	393	396	java/lang/Throwable
    //   456	483	486	java/lang/Throwable
    //   473	501	504	java/lang/Throwable
    //   490	537	540	java/lang/Throwable
    //   508	551	554	java/lang/Throwable
    //   600	614	614	java/lang/Throwable
    //   625	638	641	java/lang/Throwable
    //   630	653	656	java/lang/Throwable
    //   645	671	674	java/lang/Throwable
    //   660	701	704	java/lang/Throwable
    //   764	791	794	java/lang/Throwable
    //   781	812	815	java/lang/Throwable
    //   798	842	845	java/lang/Throwable
    //   819	853	853	java/lang/Throwable
    //   864	880	883	java/lang/Throwable
    //   979	993	993	java/lang/Throwable
    //   1004	1017	1020	java/lang/Throwable
    //   1009	1032	1035	java/lang/Throwable
    //   1024	1050	1053	java/lang/Throwable
    //   1039	1080	1083	java/lang/Throwable
    //   1146	1173	1176	java/lang/Throwable
    //   1163	1191	1194	java/lang/Throwable
    //   1180	1221	1224	java/lang/Throwable
    //   1198	1232	1232	java/lang/Throwable
    //   1254	1265	1268	java/lang/Throwable
    //   1320	1334	1334	java/lang/Throwable
    //   1345	1358	1361	java/lang/Throwable
    //   1350	1373	1376	java/lang/Throwable
    //   1365	1391	1394	java/lang/Throwable
    //   1380	1421	1424	java/lang/Throwable
    //   1487	1514	1517	java/lang/Throwable
    //   1504	1532	1535	java/lang/Throwable
    //   1521	1562	1565	java/lang/Throwable
    //   1539	1573	1573	java/lang/Throwable
    //   1595	1606	1609	java/lang/Throwable
    //   1619	2349	3808	java/lang/Throwable
    //   1709	1723	1723	java/lang/Throwable
    //   1734	1747	1750	java/lang/Throwable
    //   1739	1762	1765	java/lang/Throwable
    //   1754	1780	1783	java/lang/Throwable
    //   1769	1810	1813	java/lang/Throwable
    //   1876	1903	1906	java/lang/Throwable
    //   1893	1921	1924	java/lang/Throwable
    //   1910	1951	1954	java/lang/Throwable
    //   1928	1962	1962	java/lang/Throwable
    //   1984	1995	1998	java/lang/Throwable
    //   2051	2065	2065	java/lang/Throwable
    //   2076	2089	2092	java/lang/Throwable
    //   2081	2104	2107	java/lang/Throwable
    //   2096	2122	2125	java/lang/Throwable
    //   2111	2152	2155	java/lang/Throwable
    //   2218	2245	2248	java/lang/Throwable
    //   2235	2263	2266	java/lang/Throwable
    //   2252	2293	2296	java/lang/Throwable
    //   2270	2304	2304	java/lang/Throwable
    //   2326	2337	2340	java/lang/Throwable
    //   2350	3080	3808	java/lang/Throwable
    //   2440	2454	2454	java/lang/Throwable
    //   2465	2478	2481	java/lang/Throwable
    //   2470	2493	2496	java/lang/Throwable
    //   2485	2511	2514	java/lang/Throwable
    //   2500	2541	2544	java/lang/Throwable
    //   2607	2634	2637	java/lang/Throwable
    //   2624	2652	2655	java/lang/Throwable
    //   2641	2682	2685	java/lang/Throwable
    //   2659	2693	2693	java/lang/Throwable
    //   2715	2726	2729	java/lang/Throwable
    //   2782	2796	2796	java/lang/Throwable
    //   2807	2820	2823	java/lang/Throwable
    //   2812	2835	2838	java/lang/Throwable
    //   2827	2853	2856	java/lang/Throwable
    //   2842	2883	2886	java/lang/Throwable
    //   2949	2976	2979	java/lang/Throwable
    //   2966	2994	2997	java/lang/Throwable
    //   2983	3024	3027	java/lang/Throwable
    //   3001	3035	3035	java/lang/Throwable
    //   3057	3068	3071	java/lang/Throwable
    //   3081	3807	3808	java/lang/Throwable
    //   3171	3185	3185	java/lang/Throwable
    //   3196	3209	3212	java/lang/Throwable
    //   3201	3224	3227	java/lang/Throwable
    //   3216	3242	3245	java/lang/Throwable
    //   3231	3272	3275	java/lang/Throwable
    //   3338	3365	3368	java/lang/Throwable
    //   3355	3383	3386	java/lang/Throwable
    //   3372	3413	3416	java/lang/Throwable
    //   3390	3424	3424	java/lang/Throwable
    //   3446	3457	3460	java/lang/Throwable
    //   3513	3527	3527	java/lang/Throwable
    //   3538	3551	3554	java/lang/Throwable
    //   3543	3566	3569	java/lang/Throwable
    //   3558	3584	3587	java/lang/Throwable
    //   3573	3614	3617	java/lang/Throwable
    //   3680	3707	3710	java/lang/Throwable
    //   3697	3725	3728	java/lang/Throwable
    //   3714	3755	3758	java/lang/Throwable
    //   3732	3766	3766	java/lang/Throwable
    //   3788	3799	3802	java/lang/Throwable
  }
  
  static void Zg(Object paramObject) {
    Zezn.Ze = a(24924, -19350);
    Zezn.Zh = new BigInteger(a(24904, 22229));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Ztap.Zk.charAt(Math.abs(((BigInteger)Zek5.ZP).intValue() % 32)) <= Zl7k.ZX.charAt(Math.abs(((BigInteger)Zgj5.ZO).intValue() % 32))) {
          try {
            Zth7.ZN(Class.forName(a(24896, -20460)));
            if (bool)
              Ztgv.Zt(Class.forName(a(24898, 8664))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ztgv.Zt(Class.forName(a(24898, 8664)));
    } catch (Throwable throwable) {}
  }
  
  static void ZC(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'â]k?öËðº\\têèj3 Ïu<\\ta¡1É\\t´,¡«f3ðTÐ\\tÄÜ¯µ§ðÂ6ß\\tÓM<ûÁV© ×ÇSqNµÚ´A@(e¶3Ì"EPË,jµ/dcÙl­M}Áe8¬¶ÄÔ¶ø²»à^ðÅþóÊkóÄ¿$éÑCyb,m~õìTð©[W¬~gd-XÑ]Ü~N®öÒ?\\ti & ï\\t½²uk\\t|h¸#E"5T\\tIÉ¤¢\\b\\tuÄ¶a <Ã\\tìªÿ¹ÃCX\\t\\rÛUì5ªK\\tküZ±p}3\\t½/ËB?d@\\t_¦ÜúÉV~³oAÃ 3¨ÃßÖtÅW¿Eih@éëÄñ5¹uÔïB¾\\tëðJ0@^r \\tô©_g­ÅÅÁ\\t¨;Ð!1\\r\\tË²NxIIc\\t|O¸ÇE¾ÿT'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #99
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 141
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
    //   68: ldc 'ºZÊÏ\\tY¶f. [ß'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: iconst_5
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 81
    //   125: aload #5
    //   127: putstatic burp/Zgvl.a : [Ljava/lang/String;
    //   130: bipush #27
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zgvl.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #121
    //   214: goto -> 244
    //   217: bipush #69
    //   219: goto -> 244
    //   222: bipush #75
    //   224: goto -> 244
    //   227: bipush #34
    //   229: goto -> 244
    //   232: bipush #38
    //   234: goto -> 244
    //   237: bipush #41
    //   239: goto -> 244
    //   242: bipush #110
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 97
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #46
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #44
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-22
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-99
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-88
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-67
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-113
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #42
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #40
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #-70
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-110
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-10
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-57
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #125
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #52
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #67
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #40
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-48
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #70
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #85
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #75
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-34
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-99
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-86
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #33
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #119
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #49
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #122
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #25
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #27
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #-8
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #117
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zgvl.ZK : Ljava/lang/Object;
    //   500: sipush #24905
    //   503: sipush #-19108
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zgvl.Zc : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x614F) & 0xFFFF;
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
      byte b1 = 79;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgvl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */