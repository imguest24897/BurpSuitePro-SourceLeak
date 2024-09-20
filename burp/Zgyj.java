package burp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Zgyj {
  private static int[] ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static int Zi(Zstu paramZstu) {
    return Zp(paramZstu, 0, false, false);
  }
  
  public static int Zm(Zstu paramZstu, int paramInt) {
    return Zp(paramZstu, paramInt, false, false);
  }
  
  private static int ZN(Zstu paramZstu, int paramInt, boolean paramBoolean) {
    return Zp(paramZstu, paramInt, paramBoolean, false);
  }
  
  public static int Zg(Zstu paramZstu) {
    return Zp(paramZstu, 0, false, true);
  }
  
  public static int ZW(Zstu paramZstu, int paramInt) {
    return Zp(paramZstu, paramInt, false, true);
  }
  
  public static int Zj(Zstu paramZstu, int paramInt, boolean paramBoolean) {
    return Zp(paramZstu, paramInt, paramBoolean, true);
  }
  
  private static int Zp(Zstu paramZstu, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: invokestatic ZP : ()[I
    //   3: astore #4
    //   5: aload_0
    //   6: ifnonnull -> 15
    //   9: iconst_m1
    //   10: ireturn
    //   11: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   14: athrow
    //   15: iconst_m1
    //   16: istore #5
    //   18: aload_0
    //   19: invokeinterface Zpu : ()I
    //   24: istore #6
    //   26: iload_2
    //   27: ifeq -> 174
    //   30: iload_1
    //   31: istore #7
    //   33: iload #7
    //   35: iload #6
    //   37: iconst_3
    //   38: isub
    //   39: if_icmpge -> 169
    //   42: aload_0
    //   43: iload #7
    //   45: invokeinterface Zp : (I)B
    //   50: bipush #13
    //   52: if_icmpne -> 154
    //   55: aload_0
    //   56: iload #7
    //   58: iconst_1
    //   59: iadd
    //   60: invokeinterface Zp : (I)B
    //   65: bipush #10
    //   67: if_icmpne -> 154
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: aload_0
    //   78: iload #7
    //   80: iconst_2
    //   81: iadd
    //   82: invokeinterface Zp : (I)B
    //   87: bipush #13
    //   89: if_icmpne -> 154
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: aload_0
    //   100: iload #7
    //   102: iconst_3
    //   103: iadd
    //   104: invokeinterface Zp : (I)B
    //   109: bipush #10
    //   111: if_icmpne -> 154
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: iload_3
    //   122: ifeq -> 143
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   131: athrow
    //   132: iload #7
    //   134: iconst_4
    //   135: iadd
    //   136: goto -> 147
    //   139: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   142: athrow
    //   143: iload #7
    //   145: iconst_2
    //   146: iadd
    //   147: istore #5
    //   149: aload #4
    //   151: ifnonnull -> 169
    //   154: iinc #7, 1
    //   157: aload #4
    //   159: ifnonnull -> 33
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   168: athrow
    //   169: aload #4
    //   171: ifnonnull -> 505
    //   174: iload_1
    //   175: istore #7
    //   177: iload #7
    //   179: iload #6
    //   181: iconst_3
    //   182: isub
    //   183: if_icmpge -> 388
    //   186: aload_0
    //   187: iload #7
    //   189: invokeinterface Zp : (I)B
    //   194: bipush #13
    //   196: if_icmpne -> 298
    //   199: aload_0
    //   200: iload #7
    //   202: iconst_1
    //   203: iadd
    //   204: invokeinterface Zp : (I)B
    //   209: bipush #10
    //   211: if_icmpne -> 298
    //   214: goto -> 221
    //   217: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   220: athrow
    //   221: aload_0
    //   222: iload #7
    //   224: iconst_2
    //   225: iadd
    //   226: invokeinterface Zp : (I)B
    //   231: bipush #13
    //   233: if_icmpne -> 298
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   242: athrow
    //   243: aload_0
    //   244: iload #7
    //   246: iconst_3
    //   247: iadd
    //   248: invokeinterface Zp : (I)B
    //   253: bipush #10
    //   255: if_icmpne -> 298
    //   258: goto -> 265
    //   261: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   264: athrow
    //   265: iload_3
    //   266: ifeq -> 287
    //   269: goto -> 276
    //   272: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   275: athrow
    //   276: iload #7
    //   278: iconst_4
    //   279: iadd
    //   280: goto -> 291
    //   283: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   286: athrow
    //   287: iload #7
    //   289: iconst_2
    //   290: iadd
    //   291: istore #5
    //   293: aload #4
    //   295: ifnonnull -> 388
    //   298: aload_0
    //   299: iload #7
    //   301: invokeinterface Zp : (I)B
    //   306: bipush #10
    //   308: if_icmpne -> 373
    //   311: goto -> 318
    //   314: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   317: athrow
    //   318: aload_0
    //   319: iload #7
    //   321: iconst_1
    //   322: iadd
    //   323: invokeinterface Zp : (I)B
    //   328: bipush #10
    //   330: if_icmpne -> 373
    //   333: goto -> 340
    //   336: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   339: athrow
    //   340: iload_3
    //   341: ifeq -> 362
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   350: athrow
    //   351: iload #7
    //   353: iconst_2
    //   354: iadd
    //   355: goto -> 366
    //   358: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   361: athrow
    //   362: iload #7
    //   364: iconst_1
    //   365: iadd
    //   366: istore #5
    //   368: aload #4
    //   370: ifnonnull -> 388
    //   373: iinc #7, 1
    //   376: aload #4
    //   378: ifnonnull -> 177
    //   381: goto -> 388
    //   384: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   387: athrow
    //   388: iload #5
    //   390: iconst_m1
    //   391: if_icmpne -> 505
    //   394: iload #6
    //   396: iconst_3
    //   397: if_icmplt -> 505
    //   400: goto -> 407
    //   403: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   406: athrow
    //   407: iload #6
    //   409: iconst_3
    //   410: isub
    //   411: istore #7
    //   413: iload #7
    //   415: iload #6
    //   417: iconst_1
    //   418: isub
    //   419: if_icmpge -> 505
    //   422: aload_0
    //   423: iload #7
    //   425: invokeinterface Zp : (I)B
    //   430: bipush #10
    //   432: if_icmpne -> 490
    //   435: aload_0
    //   436: iload #7
    //   438: iconst_1
    //   439: iadd
    //   440: invokeinterface Zp : (I)B
    //   445: bipush #10
    //   447: if_icmpne -> 490
    //   450: goto -> 457
    //   453: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   456: athrow
    //   457: iload_3
    //   458: ifeq -> 479
    //   461: goto -> 468
    //   464: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   467: athrow
    //   468: iload #7
    //   470: iconst_2
    //   471: iadd
    //   472: goto -> 483
    //   475: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   478: athrow
    //   479: iload #7
    //   481: iconst_1
    //   482: iadd
    //   483: istore #5
    //   485: aload #4
    //   487: ifnonnull -> 505
    //   490: iinc #7, 1
    //   493: aload #4
    //   495: ifnonnull -> 413
    //   498: goto -> 505
    //   501: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   504: athrow
    //   505: iload #5
    //   507: ireturn
    // Exception table:
    //   from	to	target	type
    //   5	11	11	java/lang/IllegalArgumentException
    //   42	70	73	java/lang/IllegalArgumentException
    //   55	92	95	java/lang/IllegalArgumentException
    //   77	114	117	java/lang/IllegalArgumentException
    //   99	125	128	java/lang/IllegalArgumentException
    //   121	139	139	java/lang/IllegalArgumentException
    //   149	162	165	java/lang/IllegalArgumentException
    //   186	214	217	java/lang/IllegalArgumentException
    //   199	236	239	java/lang/IllegalArgumentException
    //   221	258	261	java/lang/IllegalArgumentException
    //   243	269	272	java/lang/IllegalArgumentException
    //   265	283	283	java/lang/IllegalArgumentException
    //   293	311	314	java/lang/IllegalArgumentException
    //   298	333	336	java/lang/IllegalArgumentException
    //   318	344	347	java/lang/IllegalArgumentException
    //   340	358	358	java/lang/IllegalArgumentException
    //   368	381	384	java/lang/IllegalArgumentException
    //   388	400	403	java/lang/IllegalArgumentException
    //   422	450	453	java/lang/IllegalArgumentException
    //   435	461	464	java/lang/IllegalArgumentException
    //   457	475	475	java/lang/IllegalArgumentException
    //   485	498	501	java/lang/IllegalArgumentException
  }
  
  public static Zstu ZQ(Zstu paramZstu, String paramString) {
    return ZG(paramZstu, Zkb.Zy(paramString), false);
  }
  
  private static Zstu ZG(Zstu paramZstu, byte[] paramArrayOfbyte, boolean paramBoolean) {
    try {
      if (paramZstu == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = ZN(paramZstu, 0, paramBoolean);
    if (i == -1)
      i = paramZstu.Zpu(); 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      paramZstu.Zo(byteArrayOutputStream, 0, i);
      byteArrayOutputStream.write(paramArrayOfbyte);
      byteArrayOutputStream.write(13);
      byteArrayOutputStream.write(10);
      paramZstu.Zo(byteArrayOutputStream, i, paramZstu.Zpu() - i);
      return Zyf.Zy(byteArrayOutputStream.toByteArray());
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IMPOSSIBLE);
      return null;
    } 
  }
  
  public static String ZB(List<String> paramList, String paramString, boolean paramBoolean) {
    String str = ZZ(paramList, paramString, paramBoolean);
    if (str != null) {
      str = str.substring(paramString.length()).trim();
      if (str.isEmpty())
        str = null; 
    } 
    return str;
  }
  
  public static List<String> ZI(Zstu paramZstu) {
    try {
      if (paramZstu == null)
        return new ArrayList<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = ZN(paramZstu, 0, false);
    try {
      if (i == -1)
        return ZQ(paramZstu, 0, paramZstu.Zpu()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return ZQ(paramZstu, 0, i);
  }
  
  public static List<String> ZQ(Zstu paramZstu, int paramInt1, int paramInt2) {
    return ZX(paramZstu, paramInt1, paramInt2, null, false, Zgyj::lambda$getHeaders$0);
  }
  
  public static List<String> ZZ(Zstu paramZstu, int paramInt1, int paramInt2, List<Integer> paramList) {
    return ZX(paramZstu, paramInt1, paramInt2, paramList, false, Zgyj::lambda$getHeaders$0);
  }
  
  public static List<String> ZX(Zstu paramZstu, int paramInt1, int paramInt2, List<Integer> paramList, boolean paramBoolean, Supplier<Boolean> paramSupplier) {
    int[] arrayOfInt = ZP();
    try {
      if (paramZstu == null)
        return new ArrayList<>(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (((Boolean)paramSupplier.get()).booleanValue())
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = paramZstu.Zpu();
    if (paramInt2 > i)
      paramInt2 = i; 
    ArrayList<String> arrayList = new ArrayList();
    int j = paramInt1;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int k = paramBoolean ? (paramInt2 - 1) : paramInt2;
    int m = paramInt1;
    while (m < k) {
      try {
        if (((Boolean)paramSupplier.get()).booleanValue())
          return null; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        if (paramZstu.Zp(m) == 13)
          try {
            if (m + 1 < i && paramZstu.Zp(m + 1) == 10) {
              String str = paramZstu.Zb(j, m).Zis();
              try {
                if (!str.isEmpty())
                  try {
                    arrayList.add(str);
                    if (paramList != null)
                      paramList.add(Integer.valueOf(j)); 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  }  
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              j = m + 2;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      m++;
      if (arrayOfInt == null)
        break; 
    } 
    try {
      if (((Boolean)paramSupplier.get()).booleanValue())
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (j < paramInt2)
        try {
          arrayList.add(paramZstu.Zb(j, paramInt2).Zis());
          if (paramList != null)
            paramList.add(Integer.valueOf(j)); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return arrayList;
  }
  
  public static String ZV(Zstu paramZstu, String paramString, boolean paramBoolean) {
    return ZZ(ZI(paramZstu), paramString, paramBoolean);
  }
  
  public static String ZZ(List<String> paramList, String paramString, boolean paramBoolean) {
    int[] arrayOfInt = ZP();
    try {
      if (paramList == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (!paramBoolean)
      paramString = paramString.toLowerCase(Locale.ENGLISH); 
    for (String str : paramList) {
      try {
        if (paramBoolean) {
          try {
            if (str.startsWith(paramString))
              return str; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } else {
          try {
            if (str.toLowerCase(Locale.ENGLISH).startsWith(paramString))
              return str; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      if (arrayOfInt == null)
        break; 
    } 
    return null;
  }
  
  public static List<String> ZN(List<String> paramList, String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZP : ()[I
    //   3: astore_3
    //   4: aload_0
    //   5: ifnonnull -> 20
    //   8: new java/util/ArrayList
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: areturn
    //   16: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   19: athrow
    //   20: new java/util/ArrayList
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore #4
    //   29: iload_2
    //   30: ifne -> 41
    //   33: aload_1
    //   34: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   37: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   40: astore_1
    //   41: aload_0
    //   42: invokeinterface iterator : ()Ljava/util/Iterator;
    //   47: astore #5
    //   49: aload #5
    //   51: invokeinterface hasNext : ()Z
    //   56: ifeq -> 134
    //   59: aload #5
    //   61: invokeinterface next : ()Ljava/lang/Object;
    //   66: checkcast java/lang/String
    //   69: astore #6
    //   71: iload_2
    //   72: ifeq -> 98
    //   75: aload #6
    //   77: aload_1
    //   78: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   81: ifeq -> 130
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   90: athrow
    //   91: goto -> 113
    //   94: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   97: athrow
    //   98: aload #6
    //   100: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   103: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   106: aload_1
    //   107: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   110: ifeq -> 130
    //   113: aload #4
    //   115: aload #6
    //   117: invokeinterface add : (Ljava/lang/Object;)Z
    //   122: pop
    //   123: goto -> 130
    //   126: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   129: athrow
    //   130: aload_3
    //   131: ifnonnull -> 49
    //   134: aload #4
    //   136: areturn
    // Exception table:
    //   from	to	target	type
    //   4	16	16	java/lang/IllegalArgumentException
    //   71	84	87	java/lang/IllegalArgumentException
    //   75	94	94	java/lang/IllegalArgumentException
    //   98	123	126	java/lang/IllegalArgumentException
  }
  
  public static Zstu Zh(Zstu paramZstu, String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2, boolean paramBoolean3) {
    try {
      if (paramZstu == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = ZN(paramZstu, 0, false);
    try {
      if (i == -1)
        return ZF(paramZstu, paramZstu.Zpu(), paramString1, paramBoolean1, paramString2, paramBoolean2, paramBoolean3); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return ZF(paramZstu, i, paramString1, paramBoolean1, paramString2, paramBoolean2, paramBoolean3);
  }
  
  private static Zstu ZF(Zstu paramZstu, int paramInt, String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2, boolean paramBoolean3) {
    List<String> list = ZQ(paramZstu, 0, paramInt);
    return Zo(list, paramZstu, paramInt, paramString1, paramBoolean1, paramString2, paramBoolean2, paramBoolean3);
  }
  
  private static Zstu Zo(List<String> paramList, Zstu paramZstu, int paramInt, String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2, boolean paramBoolean3) {
    ZF(paramList, paramString1, paramBoolean1, paramString2, paramBoolean2, paramBoolean3);
    return Zmvc.ZY(paramList, paramZstu, paramInt);
  }
  
  public static void ZF(List<String> paramList, String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2, boolean paramBoolean3) {
    ZV(paramList, paramString1, paramBoolean1, paramString2, paramBoolean2, paramBoolean3, false);
  }
  
  public static void ZV(List<String> paramList, String paramString1, boolean paramBoolean1, String paramString2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    // Byte code:
    //   0: invokestatic ZP : ()[I
    //   3: astore #7
    //   5: aload_1
    //   6: ifnull -> 17
    //   9: iconst_1
    //   10: goto -> 18
    //   13: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   16: athrow
    //   17: iconst_0
    //   18: getstatic net/portswigger/Zqf.Zv : Lnet/portswigger/Zqf;
    //   21: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   24: aload_0
    //   25: ifnull -> 39
    //   28: aload_1
    //   29: ifnonnull -> 44
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   38: athrow
    //   39: return
    //   40: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   43: athrow
    //   44: iconst_0
    //   45: istore #8
    //   47: iload_2
    //   48: ifne -> 59
    //   51: aload_1
    //   52: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   55: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   58: astore_1
    //   59: iconst_0
    //   60: istore #9
    //   62: iload #9
    //   64: aload_0
    //   65: invokeinterface size : ()I
    //   70: if_icmpge -> 224
    //   73: aload_0
    //   74: iload #9
    //   76: invokeinterface get : (I)Ljava/lang/Object;
    //   81: checkcast java/lang/String
    //   84: astore #10
    //   86: iload_2
    //   87: ifeq -> 113
    //   90: aload #10
    //   92: aload_1
    //   93: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   96: ifeq -> 216
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   105: athrow
    //   106: goto -> 128
    //   109: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   112: athrow
    //   113: aload #10
    //   115: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   118: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   121: aload_1
    //   122: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   125: ifeq -> 216
    //   128: aload_0
    //   129: iload #9
    //   131: invokeinterface remove : (I)Ljava/lang/Object;
    //   136: pop
    //   137: aload_3
    //   138: ifnull -> 172
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   147: athrow
    //   148: iload #6
    //   150: ifeq -> 187
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   159: athrow
    //   160: iload #8
    //   162: ifeq -> 187
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   171: athrow
    //   172: iinc #9, -1
    //   175: aload #7
    //   177: ifnonnull -> 203
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   186: athrow
    //   187: aload_0
    //   188: iload #9
    //   190: aload_3
    //   191: invokeinterface add : (ILjava/lang/Object;)V
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   202: athrow
    //   203: iconst_1
    //   204: istore #8
    //   206: iload #5
    //   208: ifeq -> 216
    //   211: return
    //   212: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   215: athrow
    //   216: iinc #9, 1
    //   219: aload #7
    //   221: ifnonnull -> 62
    //   224: iload #8
    //   226: ifne -> 267
    //   229: iload #4
    //   231: ifeq -> 267
    //   234: goto -> 241
    //   237: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   240: athrow
    //   241: aload_3
    //   242: ifnull -> 267
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   251: athrow
    //   252: aload_0
    //   253: aload_3
    //   254: invokeinterface add : (Ljava/lang/Object;)Z
    //   259: pop
    //   260: goto -> 267
    //   263: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   266: athrow
    //   267: return
    // Exception table:
    //   from	to	target	type
    //   5	13	13	java/lang/IllegalArgumentException
    //   18	32	35	java/lang/IllegalArgumentException
    //   28	40	40	java/lang/IllegalArgumentException
    //   86	99	102	java/lang/IllegalArgumentException
    //   90	109	109	java/lang/IllegalArgumentException
    //   113	141	144	java/lang/IllegalArgumentException
    //   128	153	156	java/lang/IllegalArgumentException
    //   148	165	168	java/lang/IllegalArgumentException
    //   160	180	183	java/lang/IllegalArgumentException
    //   172	196	199	java/lang/IllegalArgumentException
    //   206	212	212	java/lang/IllegalArgumentException
    //   224	234	237	java/lang/IllegalArgumentException
    //   229	245	248	java/lang/IllegalArgumentException
    //   241	260	263	java/lang/IllegalArgumentException
  }
  
  public static Zstu Ze(Zstu paramZstu) {
    try {
      if (paramZstu == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = ZN(paramZstu, 0, true);
    try {
      if (i == -1)
        return paramZstu; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    List<String> list = ZQ(paramZstu, 0, i);
    int j = paramZstu.Zpu() - i - 2;
    try {
      if (j > 0 || ZZ(list, a(-6239, 22246), false) != null)
        paramZstu = Zo(list, paramZstu, i, a(-6235, 19351), false, a(-6240, 6509) + a(-6240, 6509), true, false); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramZstu;
  }
  
  public static Zefx Zp(Zefx paramZefx) {
    try {
      if (paramZefx == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if ((paramZefx.Zw()).length > 0 || paramZefx.Zh(a(-6237, 872))) {
        Zb92 zb92 = new Zb92(paramZefx);
        paramZefx.Zi(zb92);
        return zb92.ZN;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramZefx;
  }
  
  public static Zefx Zi(Zefx paramZefx, Zey9 paramZey9) {
    try {
      if (paramZefx == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zel3 zel3 = new Zel3(paramZey9);
    paramZefx.Zi(zel3);
    return zel3.Zy;
  }
  
  public static Zstu ZC(Zstu paramZstu) {
    try {
      if (paramZstu == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return ZA(paramZstu, 0, paramZstu.Zpu());
  }
  
  private static Zstu ZA(Zstu paramZstu, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZP : ()[I
    //   3: astore_3
    //   4: aload_0
    //   5: ifnonnull -> 14
    //   8: aconst_null
    //   9: areturn
    //   10: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   13: athrow
    //   14: iload_1
    //   15: ifge -> 20
    //   18: iconst_0
    //   19: istore_1
    //   20: iload_2
    //   21: aload_0
    //   22: invokeinterface Zpu : ()I
    //   27: if_icmple -> 37
    //   30: aload_0
    //   31: invokeinterface Zpu : ()I
    //   36: istore_2
    //   37: iload_1
    //   38: iload_2
    //   39: if_icmpne -> 48
    //   42: aload_0
    //   43: areturn
    //   44: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   47: athrow
    //   48: new java/io/ByteArrayOutputStream
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: astore #4
    //   57: iload_1
    //   58: ifne -> 121
    //   61: aload_0
    //   62: iconst_0
    //   63: invokeinterface Zp : (I)B
    //   68: bipush #10
    //   70: if_icmpne -> 99
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: aload #4
    //   82: getstatic net/portswigger/Zdo.Zn : [B
    //   85: invokevirtual write : ([B)V
    //   88: aload_3
    //   89: ifnonnull -> 118
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: aload #4
    //   101: aload_0
    //   102: iconst_0
    //   103: invokeinterface Zp : (I)B
    //   108: invokevirtual write : (I)V
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: iinc #1, 1
    //   121: iconst_0
    //   122: istore #5
    //   124: iconst_0
    //   125: istore #6
    //   127: iload_1
    //   128: istore #7
    //   130: iload #7
    //   132: iload_2
    //   133: if_icmpge -> 255
    //   136: iload #5
    //   138: ifne -> 235
    //   141: aload_0
    //   142: iload #7
    //   144: invokeinterface Zp : (I)B
    //   149: bipush #10
    //   151: if_icmpne -> 212
    //   154: goto -> 161
    //   157: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   160: athrow
    //   161: aload_0
    //   162: iload #7
    //   164: iconst_1
    //   165: isub
    //   166: invokeinterface Zp : (I)B
    //   171: bipush #13
    //   173: if_icmpeq -> 197
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   182: athrow
    //   183: aload #4
    //   185: bipush #13
    //   187: invokevirtual write : (I)V
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   196: athrow
    //   197: iload #6
    //   199: ifeq -> 205
    //   202: iconst_1
    //   203: istore #5
    //   205: iconst_1
    //   206: istore #6
    //   208: aload_3
    //   209: ifnonnull -> 235
    //   212: aload_0
    //   213: iload #7
    //   215: invokeinterface Zp : (I)B
    //   220: bipush #13
    //   222: if_icmpeq -> 235
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   231: athrow
    //   232: iconst_0
    //   233: istore #6
    //   235: aload #4
    //   237: aload_0
    //   238: iload #7
    //   240: invokeinterface Zp : (I)B
    //   245: invokevirtual write : (I)V
    //   248: iinc #7, 1
    //   251: aload_3
    //   252: ifnonnull -> 130
    //   255: goto -> 268
    //   258: astore #5
    //   260: aload #5
    //   262: getstatic net/portswigger/Zk_.IMPOSSIBLE : Lnet/portswigger/Zk_;
    //   265: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   268: aload #4
    //   270: invokevirtual toByteArray : ()[B
    //   273: astore #5
    //   275: aload #5
    //   277: arraylength
    //   278: aload_0
    //   279: invokeinterface Zpu : ()I
    //   284: if_icmpne -> 295
    //   287: aload_0
    //   288: goto -> 300
    //   291: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   294: athrow
    //   295: aload #5
    //   297: invokestatic Zy : ([B)Lburp/Zyf;
    //   300: areturn
    // Exception table:
    //   from	to	target	type
    //   4	10	10	java/io/IOException
    //   37	44	44	java/io/IOException
    //   57	73	76	java/io/IOException
    //   57	255	258	java/io/IOException
    //   61	92	95	java/io/IOException
    //   80	111	114	java/io/IOException
    //   136	154	157	java/io/IOException
    //   141	176	179	java/io/IOException
    //   161	190	193	java/io/IOException
    //   208	225	228	java/io/IOException
    //   275	291	291	java/io/IOException
  }
  
  public static boolean Zl(List<String> paramList, String paramString1, String paramString2) {
    String str = ZB(paramList, paramString1, false);
    return paramString2.equalsIgnoreCase(str);
  }
  
  public static boolean Zu(List<String> paramList, String paramString1, String paramString2) {
    try {
      if (paramString1 != null)
        try {
          if (!paramString1.isEmpty()) {
            String str = ZB(paramList, paramString1, false);
            try {
              if (str == null)
                return false; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return str.toLowerCase(Locale.ENGLISH).contains(paramString2.toLowerCase(Locale.ENGLISH));
          } 
          return false;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public static Zstu Zp(Zstu paramZstu, String paramString) {
    int[] arrayOfInt = ZP();
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(-6238, 16655)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = ZN(paramZstu, 0, false);
    List<String> list = ZQ(paramZstu, 0, i);
    try {
      list.add(paramString);
      if (Zbqc.Zwu() == null)
        ZI(new int[3]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zmvc.ZY(list, paramZstu, i);
  }
  
  private static Boolean lambda$getHeaders$0() {
    return Boolean.valueOf(false);
  }
  
  public static void ZI(int[] paramArrayOfint) {
    ZF = paramArrayOfint;
  }
  
  public static int[] ZP() {
    return ZF;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'D×Kv×x3)6½¢Û\\f\\rc¸'ÞÕk\\n7TaHû/ãü7V×+(?'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_3
    //   18: newarray int
    //   20: bipush #15
    //   22: istore_1
    //   23: invokestatic ZI : ([I)V
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #69
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 147
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc 'O\\tÖ²åmôQØP¡@3\\rÉÜ(ºGu»4äyhÙy¦àø@ÖñÙ'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #28
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #65
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 147
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic burp/Zgyj.a : [Ljava/lang/String;
    //   137: iconst_5
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zgyj.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #74
    //   218: goto -> 248
    //   221: bipush #101
    //   223: goto -> 248
    //   226: bipush #6
    //   228: goto -> 248
    //   231: bipush #59
    //   233: goto -> 248
    //   236: bipush #27
    //   238: goto -> 248
    //   241: bipush #7
    //   243: goto -> 248
    //   246: bipush #120
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 45, 0 -> 104
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE7A1) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgyj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */