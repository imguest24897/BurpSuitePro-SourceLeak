package burp;

import java.math.BigInteger;

class Zzb2 extends ClassLoader {
  static String ZJ;
  
  static Object ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zw(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zer.Zk : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Ztid.ZL : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zeu2.ZW : Ljava/lang/Object;
    //   22: sipush #16019
    //   25: getstatic burp/Zss8.ZO : Ljava/lang/Object;
    //   28: checkcast java/math/BigInteger
    //   31: getstatic burp/Zoa.ZI : Ljava/lang/Object;
    //   34: checkcast java/math/BigInteger
    //   37: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   40: putstatic burp/Ztgt.ZU : Ljava/lang/Object;
    //   43: sipush #18881
    //   46: getstatic burp/Zrjg.ZG : Ljava/lang/Object;
    //   49: checkcast java/math/BigInteger
    //   52: getstatic burp/Zrbp.Z_ : Ljava/lang/Object;
    //   55: checkcast java/math/BigInteger
    //   58: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   61: putstatic burp/Zm14.ZZ : Ljava/lang/Object;
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: iconst_1
    //   68: ldc burp/Zec_
    //   70: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   73: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   76: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   79: astore_3
    //   80: aload_3
    //   81: arraylength
    //   82: istore #4
    //   84: iconst_0
    //   85: istore #5
    //   87: iload #5
    //   89: iload #4
    //   91: if_icmpge -> 228
    //   94: aload_3
    //   95: iload #5
    //   97: aaload
    //   98: astore #6
    //   100: aload #6
    //   102: invokevirtual getModifiers : ()I
    //   105: invokestatic isStatic : (I)Z
    //   108: ifne -> 118
    //   111: goto -> 221
    //   114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   117: athrow
    //   118: aload #6
    //   120: invokevirtual getType : ()Ljava/lang/Class;
    //   123: astore #7
    //   125: aload #7
    //   127: ifnull -> 208
    //   130: aload #7
    //   132: invokevirtual isPrimitive : ()Z
    //   135: ifne -> 208
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   144: athrow
    //   145: aload #7
    //   147: invokevirtual getPackage : ()Ljava/lang/Package;
    //   150: ifnull -> 208
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   159: athrow
    //   160: aload #7
    //   162: invokevirtual getPackage : ()Ljava/lang/Package;
    //   165: invokevirtual getName : ()Ljava/lang/String;
    //   168: ifnull -> 208
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   177: athrow
    //   178: aload #7
    //   180: invokevirtual getPackage : ()Ljava/lang/Package;
    //   183: invokevirtual getName : ()Ljava/lang/String;
    //   186: sipush #16025
    //   189: sipush #-2507
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   198: ifne -> 208
    //   201: goto -> 208
    //   204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   207: athrow
    //   208: aload #6
    //   210: iconst_1
    //   211: invokevirtual setAccessible : (Z)V
    //   214: aload #6
    //   216: aconst_null
    //   217: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   220: pop
    //   221: iinc #5, 1
    //   224: iload_2
    //   225: ifeq -> 87
    //   228: sipush #16017
    //   231: sipush #-16463
    //   234: invokestatic a : (II)Ljava/lang/String;
    //   237: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   240: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   243: astore_3
    //   244: aload_3
    //   245: arraylength
    //   246: istore #4
    //   248: iconst_0
    //   249: istore #5
    //   251: iload #5
    //   253: iload #4
    //   255: if_icmpge -> 387
    //   258: aload_3
    //   259: iload #5
    //   261: aaload
    //   262: astore #6
    //   264: aload #6
    //   266: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   269: pop
    //   270: aload #6
    //   272: invokevirtual getModifiers : ()I
    //   275: invokestatic isStatic : (I)Z
    //   278: ifeq -> 373
    //   281: aload #6
    //   283: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   286: arraylength
    //   287: iconst_2
    //   288: if_icmpne -> 373
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   297: athrow
    //   298: aload #6
    //   300: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   303: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   306: invokevirtual equals : (Ljava/lang/Object;)Z
    //   309: ifeq -> 373
    //   312: goto -> 319
    //   315: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   318: athrow
    //   319: aload #6
    //   321: iconst_1
    //   322: invokevirtual setAccessible : (Z)V
    //   325: aload #6
    //   327: aconst_null
    //   328: iconst_2
    //   329: anewarray java/lang/Object
    //   332: dup
    //   333: iconst_0
    //   334: aload_0
    //   335: aastore
    //   336: dup
    //   337: iconst_1
    //   338: aload_1
    //   339: ifnonnull -> 357
    //   342: goto -> 349
    //   345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   348: athrow
    //   349: aload_1
    //   350: goto -> 364
    //   353: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   356: athrow
    //   357: aload_1
    //   358: checkcast [B
    //   361: invokevirtual clone : ()Ljava/lang/Object;
    //   364: aastore
    //   365: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   368: pop
    //   369: iload_2
    //   370: ifeq -> 387
    //   373: iinc #5, 1
    //   376: iload_2
    //   377: ifeq -> 251
    //   380: goto -> 387
    //   383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   386: athrow
    //   387: getstatic burp/Zefn.ZJ : Ljava/lang/Object;
    //   390: checkcast java/math/BigInteger
    //   393: invokevirtual toByteArray : ()[B
    //   396: astore_3
    //   397: aload_3
    //   398: arraylength
    //   399: iconst_2
    //   400: iadd
    //   401: newarray byte
    //   403: astore #5
    //   405: iconst_0
    //   406: istore #6
    //   408: iload #6
    //   410: aload_3
    //   411: arraylength
    //   412: if_icmpge -> 431
    //   415: aload #5
    //   417: iload #6
    //   419: aload_3
    //   420: iload #6
    //   422: baload
    //   423: bastore
    //   424: iinc #6, 1
    //   427: iload_2
    //   428: ifeq -> 408
    //   431: aload #5
    //   433: arraylength
    //   434: iconst_3
    //   435: idiv
    //   436: iconst_4
    //   437: imul
    //   438: newarray byte
    //   440: astore #4
    //   442: iconst_0
    //   443: istore #6
    //   445: iconst_0
    //   446: istore #7
    //   448: iload #6
    //   450: aload_3
    //   451: arraylength
    //   452: if_icmpge -> 563
    //   455: aload #4
    //   457: iload #7
    //   459: aload #5
    //   461: iload #6
    //   463: baload
    //   464: iconst_2
    //   465: iushr
    //   466: bipush #63
    //   468: iand
    //   469: i2b
    //   470: bastore
    //   471: aload #4
    //   473: iload #7
    //   475: iconst_1
    //   476: iadd
    //   477: aload #5
    //   479: iload #6
    //   481: iconst_1
    //   482: iadd
    //   483: baload
    //   484: iconst_4
    //   485: iushr
    //   486: bipush #15
    //   488: iand
    //   489: aload #5
    //   491: iload #6
    //   493: baload
    //   494: iconst_4
    //   495: ishl
    //   496: bipush #63
    //   498: iand
    //   499: ior
    //   500: i2b
    //   501: bastore
    //   502: aload #4
    //   504: iload #7
    //   506: iconst_2
    //   507: iadd
    //   508: aload #5
    //   510: iload #6
    //   512: iconst_2
    //   513: iadd
    //   514: baload
    //   515: bipush #6
    //   517: iushr
    //   518: iconst_3
    //   519: iand
    //   520: aload #5
    //   522: iload #6
    //   524: iconst_1
    //   525: iadd
    //   526: baload
    //   527: iconst_2
    //   528: ishl
    //   529: bipush #63
    //   531: iand
    //   532: ior
    //   533: i2b
    //   534: bastore
    //   535: aload #4
    //   537: iload #7
    //   539: iconst_3
    //   540: iadd
    //   541: aload #5
    //   543: iload #6
    //   545: iconst_2
    //   546: iadd
    //   547: baload
    //   548: bipush #63
    //   550: iand
    //   551: i2b
    //   552: bastore
    //   553: iinc #6, 3
    //   556: iinc #7, 4
    //   559: iload_2
    //   560: ifeq -> 448
    //   563: iconst_0
    //   564: istore #6
    //   566: iload #6
    //   568: aload #4
    //   570: arraylength
    //   571: if_icmpge -> 755
    //   574: aload #4
    //   576: iload #6
    //   578: baload
    //   579: bipush #26
    //   581: if_icmpge -> 609
    //   584: aload #4
    //   586: iload #6
    //   588: aload #4
    //   590: iload #6
    //   592: baload
    //   593: bipush #65
    //   595: iadd
    //   596: i2b
    //   597: bastore
    //   598: iload_2
    //   599: ifeq -> 748
    //   602: goto -> 609
    //   605: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   608: athrow
    //   609: aload #4
    //   611: iload #6
    //   613: baload
    //   614: bipush #52
    //   616: if_icmpge -> 654
    //   619: goto -> 626
    //   622: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   625: athrow
    //   626: aload #4
    //   628: iload #6
    //   630: aload #4
    //   632: iload #6
    //   634: baload
    //   635: bipush #97
    //   637: iadd
    //   638: bipush #26
    //   640: isub
    //   641: i2b
    //   642: bastore
    //   643: iload_2
    //   644: ifeq -> 748
    //   647: goto -> 654
    //   650: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   653: athrow
    //   654: aload #4
    //   656: iload #6
    //   658: baload
    //   659: bipush #62
    //   661: if_icmpge -> 699
    //   664: goto -> 671
    //   667: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   670: athrow
    //   671: aload #4
    //   673: iload #6
    //   675: aload #4
    //   677: iload #6
    //   679: baload
    //   680: bipush #48
    //   682: iadd
    //   683: bipush #52
    //   685: isub
    //   686: i2b
    //   687: bastore
    //   688: iload_2
    //   689: ifeq -> 748
    //   692: goto -> 699
    //   695: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   698: athrow
    //   699: aload #4
    //   701: iload #6
    //   703: baload
    //   704: bipush #63
    //   706: if_icmpge -> 734
    //   709: goto -> 716
    //   712: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   715: athrow
    //   716: aload #4
    //   718: iload #6
    //   720: bipush #43
    //   722: bastore
    //   723: iload_2
    //   724: ifeq -> 748
    //   727: goto -> 734
    //   730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   733: athrow
    //   734: aload #4
    //   736: iload #6
    //   738: bipush #47
    //   740: bastore
    //   741: goto -> 748
    //   744: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   747: athrow
    //   748: iinc #6, 1
    //   751: iload_2
    //   752: ifeq -> 566
    //   755: aload #4
    //   757: arraylength
    //   758: iconst_1
    //   759: isub
    //   760: istore #6
    //   762: iload #6
    //   764: aload_3
    //   765: arraylength
    //   766: iconst_4
    //   767: imul
    //   768: iconst_3
    //   769: idiv
    //   770: if_icmple -> 787
    //   773: aload #4
    //   775: iload #6
    //   777: bipush #61
    //   779: bastore
    //   780: iinc #6, -1
    //   783: iload_2
    //   784: ifeq -> 762
    //   787: iconst_0
    //   788: istore_3
    //   789: sipush #16029
    //   792: sipush #1333
    //   795: invokestatic a : (II)Ljava/lang/String;
    //   798: iconst_1
    //   799: ldc burp/Ztvp
    //   801: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   804: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   807: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   810: astore #4
    //   812: aload #4
    //   814: arraylength
    //   815: istore #5
    //   817: iconst_0
    //   818: istore #6
    //   820: iload #6
    //   822: iload #5
    //   824: if_icmpge -> 962
    //   827: aload #4
    //   829: iload #6
    //   831: aaload
    //   832: astore #7
    //   834: aload #7
    //   836: invokevirtual getModifiers : ()I
    //   839: invokestatic isStatic : (I)Z
    //   842: ifne -> 852
    //   845: goto -> 955
    //   848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   851: athrow
    //   852: aload #7
    //   854: invokevirtual getType : ()Ljava/lang/Class;
    //   857: astore #8
    //   859: aload #8
    //   861: ifnull -> 942
    //   864: aload #8
    //   866: invokevirtual isPrimitive : ()Z
    //   869: ifne -> 942
    //   872: goto -> 879
    //   875: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   878: athrow
    //   879: aload #8
    //   881: invokevirtual getPackage : ()Ljava/lang/Package;
    //   884: ifnull -> 942
    //   887: goto -> 894
    //   890: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   893: athrow
    //   894: aload #8
    //   896: invokevirtual getPackage : ()Ljava/lang/Package;
    //   899: invokevirtual getName : ()Ljava/lang/String;
    //   902: ifnull -> 942
    //   905: goto -> 912
    //   908: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   911: athrow
    //   912: aload #8
    //   914: invokevirtual getPackage : ()Ljava/lang/Package;
    //   917: invokevirtual getName : ()Ljava/lang/String;
    //   920: sipush #16028
    //   923: sipush #1798
    //   926: invokestatic a : (II)Ljava/lang/String;
    //   929: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   932: ifne -> 942
    //   935: goto -> 942
    //   938: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   941: athrow
    //   942: aload #7
    //   944: iconst_1
    //   945: invokevirtual setAccessible : (Z)V
    //   948: aload #7
    //   950: aconst_null
    //   951: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   954: pop
    //   955: iinc #6, 1
    //   958: iload_2
    //   959: ifeq -> 820
    //   962: sipush #16024
    //   965: sipush #-2160
    //   968: invokestatic a : (II)Ljava/lang/String;
    //   971: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   974: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   977: astore #4
    //   979: aload #4
    //   981: arraylength
    //   982: istore #5
    //   984: iconst_0
    //   985: istore #6
    //   987: iload #6
    //   989: iload #5
    //   991: if_icmpge -> 1127
    //   994: aload #4
    //   996: iload #6
    //   998: aaload
    //   999: astore #7
    //   1001: aload #7
    //   1003: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1006: pop
    //   1007: aload #7
    //   1009: invokevirtual getModifiers : ()I
    //   1012: invokestatic isStatic : (I)Z
    //   1015: ifeq -> 1113
    //   1018: aload #7
    //   1020: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1023: arraylength
    //   1024: iconst_2
    //   1025: if_icmpne -> 1113
    //   1028: goto -> 1035
    //   1031: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1034: athrow
    //   1035: aload #7
    //   1037: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1040: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1043: if_acmpne -> 1113
    //   1046: goto -> 1053
    //   1049: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1052: athrow
    //   1053: aload #7
    //   1055: iconst_1
    //   1056: invokevirtual setAccessible : (Z)V
    //   1059: aload #7
    //   1061: aconst_null
    //   1062: iconst_2
    //   1063: anewarray java/lang/Object
    //   1066: dup
    //   1067: iconst_0
    //   1068: aload_0
    //   1069: aastore
    //   1070: dup
    //   1071: iconst_1
    //   1072: aload_1
    //   1073: ifnonnull -> 1091
    //   1076: goto -> 1083
    //   1079: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1082: athrow
    //   1083: aload_1
    //   1084: goto -> 1098
    //   1087: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1090: athrow
    //   1091: aload_1
    //   1092: checkcast [B
    //   1095: invokevirtual clone : ()Ljava/lang/Object;
    //   1098: aastore
    //   1099: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1102: checkcast java/lang/Boolean
    //   1105: invokevirtual booleanValue : ()Z
    //   1108: istore_3
    //   1109: iload_2
    //   1110: ifeq -> 1127
    //   1113: iinc #6, 1
    //   1116: iload_2
    //   1117: ifeq -> 987
    //   1120: goto -> 1127
    //   1123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1126: athrow
    //   1127: iload_3
    //   1128: ireturn
    //   1129: astore_3
    //   1130: new java/lang/Exception
    //   1133: dup
    //   1134: aload_3
    //   1135: invokevirtual getMessage : ()Ljava/lang/String;
    //   1138: invokespecial <init> : (Ljava/lang/String;)V
    //   1141: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1128	1129	java/lang/Throwable
    //   100	114	114	java/lang/Throwable
    //   125	138	141	java/lang/Throwable
    //   130	153	156	java/lang/Throwable
    //   145	171	174	java/lang/Throwable
    //   160	201	204	java/lang/Throwable
    //   264	291	294	java/lang/Throwable
    //   281	312	315	java/lang/Throwable
    //   298	342	345	java/lang/Throwable
    //   319	353	353	java/lang/Throwable
    //   364	380	383	java/lang/Throwable
    //   574	602	605	java/lang/Throwable
    //   584	619	622	java/lang/Throwable
    //   609	647	650	java/lang/Throwable
    //   626	664	667	java/lang/Throwable
    //   654	692	695	java/lang/Throwable
    //   671	709	712	java/lang/Throwable
    //   699	727	730	java/lang/Throwable
    //   716	741	744	java/lang/Throwable
    //   834	848	848	java/lang/Throwable
    //   859	872	875	java/lang/Throwable
    //   864	887	890	java/lang/Throwable
    //   879	905	908	java/lang/Throwable
    //   894	935	938	java/lang/Throwable
    //   1001	1028	1031	java/lang/Throwable
    //   1018	1046	1049	java/lang/Throwable
    //   1035	1076	1079	java/lang/Throwable
    //   1053	1087	1087	java/lang/Throwable
    //   1109	1120	1123	java/lang/Throwable
  }
  
  static void Zu(Object paramObject) {
    Zlvx.Zr = a(16031, 20976);
    Zlvx.ZM = new BigInteger(a(16026, -22850));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zecm.Zv.charAt(Math.abs(((BigInteger)Zzxa.ZI).intValue() % 32)) <= Zxee.Zd.charAt(Math.abs(((BigInteger)Zbzj.Zz).intValue() % 32))) {
          try {
            Zgs6.Zt(Class.forName(a(16018, -19622)));
            if (bool)
              Zein.Zs(Class.forName(a(16030, 20792))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zein.Zs(Class.forName(a(16030, 20792)));
    } catch (Throwable throwable) {}
  }
  
  static void Zm(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÙØÉ¶ÀÄÌ§õ2ûqÇæÏÜ¿ö@EÙ M\\b_£*l­ãÑÆ0Kw¦©Ò_oãzg-ÖÚ³ÊlðÖ_lãBÒN>?{ZÆ X8§Ë4ÔrôZ0¤d#²)æåù\\täP'1/N» ç¦`n&uþ9£) v\\tÈ½è®QïµÅÂ¬ºÎ\\t³×ÍÁrP°*'\\tóÞÅàstæB\û°\\t8\\b<Êï¾Þ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #75
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
    //   68: ldc 'ýÃáSï\\t_É kå\\n°'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #60
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
    //   129: putstatic burp/Zzb2.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzb2.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #14
    //   214: goto -> 243
    //   217: bipush #68
    //   219: goto -> 243
    //   222: iconst_4
    //   223: goto -> 243
    //   226: bipush #58
    //   228: goto -> 243
    //   231: bipush #123
    //   233: goto -> 243
    //   236: bipush #41
    //   238: goto -> 243
    //   241: bipush #53
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
    //   300: sipush #16027
    //   303: sipush #-12065
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zzb2.ZJ : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #113
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #-93
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #-73
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #127
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #103
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #120
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #108
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #47
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #-37
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-91
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-85
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: iconst_4
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-47
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-20
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #86
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-102
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #-110
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #59
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #-42
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #-108
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #98
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #105
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-83
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #117
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #-53
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-9
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #7
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #108
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #49
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-37
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #122
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #-119
    //   505: bastore
    //   506: invokespecial <init> : (I[B)V
    //   509: putstatic burp/Zzb2.ZW : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3E9B) & 0xFFFF;
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
      char c = '¬';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzb2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */