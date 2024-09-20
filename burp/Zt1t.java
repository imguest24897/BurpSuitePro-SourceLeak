package burp;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Supplier;

public class Zt1t {
  private static final Zr6d Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zk8m ZJ(Zstu paramZstu, int paramInt, List<String> paramList) {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: iload_1
    //   3: <illegal opcode> apply : (Lburp/Zstu;I)Ljava/util/function/Function;
    //   8: invokestatic Zl : (Ljava/util/List;Ljava/util/function/Function;)Lburp/Zk8m;
    //   11: areturn
  }
  
  public static Zk8m ZC(List<String> paramList) {
    return Zl(paramList, Zt1t::lambda$getMimeType$1);
  }
  
  private static Zk8m Zl(List<String> paramList, Function<Short, Short> paramFunction) {
    int[] arrayOfInt = Zk8m.ZO();
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
    if (paramList != null)
      for (String str : paramList) {
        if (str.toLowerCase(Locale.ENGLISH).startsWith(a(-28190, -30597)))
          linkedHashSet.add(str.substring(a(-28223, -4872).length()).strip()); 
        if (arrayOfInt == null)
          break; 
      }  
    TreeSet<String> treeSet = new TreeSet();
    short s = Zg(linkedHashSet, treeSet);
    Ztiy ztiy = Ztiy.ZU().ZQ(s).Zg(((Short)paramFunction.apply(Short.valueOf(s))).shortValue()).ZR(linkedHashSet).ZE(Zgyj.Zl(paramList, a(-28178, 7744), a(-28185, -22126))).ZB(Zgyj.Zu(paramList, a(-28182, -12533), a(-28224, 20640)));
    if (treeSet.size() > 0)
      ztiy.Ze(treeSet); 
    return ztiy.ZI();
  }
  
  private static short Zg(short paramShort1, short paramShort2) {
    return !ZY(paramShort1) ? paramShort2 : (!ZY(paramShort2) ? paramShort2 : paramShort1);
  }
  
  private static boolean ZY(short paramShort) {
    return (paramShort == 257 || paramShort == 259 || paramShort == 258);
  }
  
  public static Zk8m Zi(Zk8m paramZk8m, List<Ztu8> paramList, Supplier<Boolean> paramSupplier) {
    // Byte code:
    //   0: invokestatic ZO : ()[I
    //   3: astore_3
    //   4: aload_0
    //   5: invokestatic ZQ : (Lburp/Zk8m;)Lburp/Ztiy;
    //   8: astore #4
    //   10: aload_0
    //   11: getfield Zb : Ljava/util/Set;
    //   14: ifnonnull -> 27
    //   17: new java/util/TreeSet
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: goto -> 38
    //   27: new java/util/TreeSet
    //   30: dup
    //   31: aload_0
    //   32: getfield Zb : Ljava/util/Set;
    //   35: invokespecial <init> : (Ljava/util/Collection;)V
    //   38: astore #5
    //   40: new java/util/LinkedHashSet
    //   43: dup
    //   44: aload_0
    //   45: invokevirtual ZY : ()Ljava/util/Set;
    //   48: invokespecial <init> : (Ljava/util/Collection;)V
    //   51: astore #6
    //   53: aload_0
    //   54: getfield ZJ : S
    //   57: istore #7
    //   59: aload_1
    //   60: invokeinterface iterator : ()Ljava/util/Iterator;
    //   65: astore #8
    //   67: aload #8
    //   69: invokeinterface hasNext : ()Z
    //   74: ifeq -> 442
    //   77: aload #8
    //   79: invokeinterface next : ()Ljava/lang/Object;
    //   84: checkcast burp/Ztu8
    //   87: astore #9
    //   89: aload_2
    //   90: invokeinterface get : ()Ljava/lang/Object;
    //   95: checkcast java/lang/Boolean
    //   98: invokevirtual booleanValue : ()Z
    //   101: ifeq -> 106
    //   104: aconst_null
    //   105: areturn
    //   106: aload #9
    //   108: invokeinterface ZlD : ()B
    //   113: iconst_1
    //   114: if_icmpne -> 147
    //   117: sipush #-28187
    //   120: sipush #1523
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: aload #9
    //   128: invokeinterface ZlP : ()Lburp/Zs_n;
    //   133: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   138: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   141: ifeq -> 147
    //   144: goto -> 442
    //   147: aload #9
    //   149: invokeinterface ZlD : ()B
    //   154: ifeq -> 168
    //   157: aload #9
    //   159: invokeinterface ZlD : ()B
    //   164: iconst_4
    //   165: if_icmpne -> 67
    //   168: sipush #-28168
    //   171: sipush #-10028
    //   174: invokestatic a : (II)Ljava/lang/String;
    //   177: aload #9
    //   179: invokeinterface ZlP : ()Lburp/Zs_n;
    //   184: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   189: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   192: ifne -> 198
    //   195: goto -> 67
    //   198: aload #9
    //   200: invokeinterface ZlP : ()Lburp/Zs_n;
    //   205: sipush #-28199
    //   208: sipush #1055
    //   211: invokestatic a : (II)Ljava/lang/String;
    //   214: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   219: astore #10
    //   221: aload #10
    //   223: ifnull -> 239
    //   226: aload #5
    //   228: aload #10
    //   230: invokevirtual trim : ()Ljava/lang/String;
    //   233: invokeinterface add : (Ljava/lang/Object;)Z
    //   238: pop
    //   239: aload #9
    //   241: invokeinterface ZlP : ()Lburp/Zs_n;
    //   246: sipush #-28197
    //   249: sipush #1044
    //   252: invokestatic a : (II)Ljava/lang/String;
    //   255: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   260: astore #11
    //   262: sipush #-28209
    //   265: sipush #3038
    //   268: invokestatic a : (II)Ljava/lang/String;
    //   271: aload #11
    //   273: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   276: ifeq -> 324
    //   279: aload #9
    //   281: invokeinterface ZlP : ()Lburp/Zs_n;
    //   286: sipush #-28218
    //   289: sipush #16089
    //   292: invokestatic a : (II)Ljava/lang/String;
    //   295: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   300: astore #12
    //   302: aload #12
    //   304: ifnull -> 320
    //   307: aload #5
    //   309: aload #12
    //   311: invokevirtual trim : ()Ljava/lang/String;
    //   314: invokeinterface add : (Ljava/lang/Object;)Z
    //   319: pop
    //   320: aload_3
    //   321: ifnonnull -> 438
    //   324: sipush #-28200
    //   327: sipush #-27064
    //   330: invokestatic a : (II)Ljava/lang/String;
    //   333: aload #11
    //   335: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   338: ifeq -> 438
    //   341: aload #9
    //   343: invokeinterface ZlP : ()Lburp/Zs_n;
    //   348: sipush #-28189
    //   351: sipush #7458
    //   354: invokestatic a : (II)Ljava/lang/String;
    //   357: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   362: astore #12
    //   364: aload #12
    //   366: ifnull -> 397
    //   369: aload #6
    //   371: aload #12
    //   373: invokeinterface add : (Ljava/lang/Object;)Z
    //   378: pop
    //   379: aload #12
    //   381: aload #5
    //   383: invokestatic Zt : (Ljava/lang/String;Ljava/util/Set;)S
    //   386: istore #13
    //   388: iload #7
    //   390: ifne -> 397
    //   393: iload #13
    //   395: istore #7
    //   397: aload #9
    //   399: invokeinterface ZlP : ()Lburp/Zs_n;
    //   404: sipush #-28209
    //   407: sipush #3038
    //   410: invokestatic a : (II)Ljava/lang/String;
    //   413: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   418: astore #13
    //   420: aload #13
    //   422: ifnull -> 438
    //   425: aload #5
    //   427: aload #13
    //   429: invokevirtual trim : ()Ljava/lang/String;
    //   432: invokeinterface add : (Ljava/lang/Object;)Z
    //   437: pop
    //   438: aload_3
    //   439: ifnonnull -> 67
    //   442: aload #4
    //   444: iload #7
    //   446: invokevirtual ZQ : (S)Lburp/Ztiy;
    //   449: aload #5
    //   451: invokevirtual Ze : (Ljava/util/Set;)Lburp/Ztiy;
    //   454: aload #6
    //   456: invokevirtual Zg : (Ljava/util/Set;)Lburp/Ztiy;
    //   459: invokevirtual ZI : ()Lburp/Zk8m;
    //   462: invokestatic Zwu : ()[Lburp/Zbqc;
    //   465: ifnonnull -> 474
    //   468: iconst_5
    //   469: newarray int
    //   471: invokestatic Zc : ([I)V
    //   474: areturn
  }
  
  private static short Zg(Set<String> paramSet1, Set<String> paramSet2) {
    short s = 0;
    Iterator<String> iterator = paramSet1.iterator();
    int[] arrayOfInt = Zk8m.ZO();
    while (iterator.hasNext()) {
      String str = iterator.next();
      short s1 = Zt(str, paramSet2);
      if (s1 != 0)
        s = s1; 
      if (arrayOfInt == null)
        break; 
    } 
    return s;
  }
  
  public static short Zv(String paramString) {
    return Zt(paramString, null);
  }
  
  static short Zt(String paramString, Set<String> paramSet) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 10
    //   4: iconst_0
    //   5: ireturn
    //   6: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   9: athrow
    //   10: aload_0
    //   11: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   14: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   17: astore_2
    //   18: aload_2
    //   19: sipush #-28210
    //   22: sipush #25496
    //   25: invokestatic a : (II)Ljava/lang/String;
    //   28: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   31: ifeq -> 99
    //   34: aload_2
    //   35: sipush #-28214
    //   38: sipush #-17622
    //   41: invokestatic a : (II)Ljava/lang/String;
    //   44: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   47: ifne -> 99
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_0
    //   58: invokestatic ZX : (Ljava/lang/String;)Ljava/lang/String;
    //   61: astore_3
    //   62: aload_3
    //   63: ifnull -> 95
    //   66: aload_1
    //   67: ifnull -> 95
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: aload_1
    //   78: aload_3
    //   79: invokevirtual trim : ()Ljava/lang/String;
    //   82: invokeinterface add : (Ljava/lang/Object;)Z
    //   87: pop
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   94: athrow
    //   95: sipush #256
    //   98: ireturn
    //   99: aload_2
    //   100: sipush #-28211
    //   103: sipush #9653
    //   106: invokestatic a : (II)Ljava/lang/String;
    //   109: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   112: ifeq -> 119
    //   115: sipush #260
    //   118: ireturn
    //   119: aload_2
    //   120: sipush #-28212
    //   123: sipush #6622
    //   126: invokestatic a : (II)Ljava/lang/String;
    //   129: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   132: ifne -> 158
    //   135: aload_2
    //   136: sipush #-28204
    //   139: sipush #21203
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   148: ifeq -> 162
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: sipush #263
    //   161: ireturn
    //   162: aload_2
    //   163: invokestatic Zb : (Ljava/lang/String;)Z
    //   166: ifeq -> 173
    //   169: sipush #259
    //   172: ireturn
    //   173: aload_2
    //   174: sipush #-28165
    //   177: sipush #-5307
    //   180: invokestatic a : (II)Ljava/lang/String;
    //   183: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   186: ifeq -> 193
    //   189: sipush #258
    //   192: ireturn
    //   193: aload_2
    //   194: sipush #-28170
    //   197: sipush #9607
    //   200: invokestatic a : (II)Ljava/lang/String;
    //   203: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   206: ifeq -> 340
    //   209: aload_2
    //   210: sipush #-28167
    //   213: sipush #-20082
    //   216: invokestatic a : (II)Ljava/lang/String;
    //   219: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   222: ifeq -> 236
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   231: athrow
    //   232: sipush #513
    //   235: ireturn
    //   236: aload_2
    //   237: sipush #-28163
    //   240: sipush #-6763
    //   243: invokestatic a : (II)Ljava/lang/String;
    //   246: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   249: ifeq -> 256
    //   252: sipush #515
    //   255: ireturn
    //   256: aload_2
    //   257: sipush #-28192
    //   260: sipush #623
    //   263: invokestatic a : (II)Ljava/lang/String;
    //   266: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   269: ifeq -> 276
    //   272: sipush #514
    //   275: ireturn
    //   276: aload_2
    //   277: sipush #-28227
    //   280: sipush #27505
    //   283: invokestatic a : (II)Ljava/lang/String;
    //   286: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   289: ifeq -> 296
    //   292: sipush #516
    //   295: ireturn
    //   296: aload_2
    //   297: sipush #-28162
    //   300: sipush #-32461
    //   303: invokestatic a : (II)Ljava/lang/String;
    //   306: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   309: ifeq -> 316
    //   312: sipush #517
    //   315: ireturn
    //   316: aload_2
    //   317: sipush #-28201
    //   320: sipush #-17432
    //   323: invokestatic a : (II)Ljava/lang/String;
    //   326: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   329: ifeq -> 336
    //   332: sipush #518
    //   335: ireturn
    //   336: sipush #512
    //   339: ireturn
    //   340: aload_2
    //   341: sipush #-28184
    //   344: sipush #-22728
    //   347: invokestatic a : (II)Ljava/lang/String;
    //   350: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   353: ifeq -> 360
    //   356: sipush #257
    //   359: ireturn
    //   360: aload_2
    //   361: sipush #-28171
    //   364: sipush #25352
    //   367: invokestatic a : (II)Ljava/lang/String;
    //   370: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   373: ifeq -> 380
    //   376: sipush #262
    //   379: ireturn
    //   380: aload_2
    //   381: sipush #-28179
    //   384: sipush #-2305
    //   387: invokestatic a : (II)Ljava/lang/String;
    //   390: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   393: ifeq -> 400
    //   396: sipush #261
    //   399: ireturn
    //   400: aload_2
    //   401: sipush #-28196
    //   404: sipush #23716
    //   407: invokestatic a : (II)Ljava/lang/String;
    //   410: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   413: ifne -> 439
    //   416: aload_2
    //   417: sipush #-28221
    //   420: sipush #5971
    //   423: invokestatic a : (II)Ljava/lang/String;
    //   426: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   429: ifeq -> 443
    //   432: goto -> 439
    //   435: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   438: athrow
    //   439: sipush #768
    //   442: ireturn
    //   443: aload_2
    //   444: sipush #-28215
    //   447: sipush #-22011
    //   450: invokestatic a : (II)Ljava/lang/String;
    //   453: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   456: ifne -> 482
    //   459: aload_2
    //   460: sipush #-28188
    //   463: sipush #30363
    //   466: invokestatic a : (II)Ljava/lang/String;
    //   469: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   472: ifeq -> 486
    //   475: goto -> 482
    //   478: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   481: athrow
    //   482: sipush #769
    //   485: ireturn
    //   486: aload_2
    //   487: sipush #-28161
    //   490: sipush #-12484
    //   493: invokestatic a : (II)Ljava/lang/String;
    //   496: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   499: ifeq -> 506
    //   502: sipush #1026
    //   505: ireturn
    //   506: aload_2
    //   507: sipush #-28222
    //   510: sipush #11612
    //   513: invokestatic a : (II)Ljava/lang/String;
    //   516: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   519: ifne -> 545
    //   522: aload_2
    //   523: sipush #-28174
    //   526: sipush #-32046
    //   529: invokestatic a : (II)Ljava/lang/String;
    //   532: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   535: ifeq -> 592
    //   538: goto -> 545
    //   541: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   544: athrow
    //   545: aload_2
    //   546: sipush #-28217
    //   549: sipush #3561
    //   552: invokestatic a : (II)Ljava/lang/String;
    //   555: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   558: ifeq -> 572
    //   561: goto -> 568
    //   564: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   567: athrow
    //   568: sipush #1537
    //   571: ireturn
    //   572: aload_2
    //   573: sipush #-28175
    //   576: sipush #-11766
    //   579: invokestatic a : (II)Ljava/lang/String;
    //   582: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   585: ifeq -> 592
    //   588: sipush #1536
    //   591: ireturn
    //   592: aload_2
    //   593: sipush #-28181
    //   596: sipush #26715
    //   599: invokestatic a : (II)Ljava/lang/String;
    //   602: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   605: ifeq -> 612
    //   608: sipush #1025
    //   611: ireturn
    //   612: goto -> 623
    //   615: astore_2
    //   616: aload_2
    //   617: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   620: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   623: iconst_1
    //   624: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	6	6	java/lang/Exception
    //   10	98	615	java/lang/Exception
    //   18	50	53	java/lang/Exception
    //   62	70	73	java/lang/Exception
    //   66	88	91	java/lang/Exception
    //   99	118	615	java/lang/Exception
    //   119	151	154	java/lang/Exception
    //   119	161	615	java/lang/Exception
    //   162	172	615	java/lang/Exception
    //   173	192	615	java/lang/Exception
    //   193	225	228	java/lang/Exception
    //   193	235	615	java/lang/Exception
    //   236	255	615	java/lang/Exception
    //   256	275	615	java/lang/Exception
    //   276	295	615	java/lang/Exception
    //   296	315	615	java/lang/Exception
    //   316	335	615	java/lang/Exception
    //   336	339	615	java/lang/Exception
    //   340	359	615	java/lang/Exception
    //   360	379	615	java/lang/Exception
    //   380	399	615	java/lang/Exception
    //   400	432	435	java/lang/Exception
    //   400	442	615	java/lang/Exception
    //   443	475	478	java/lang/Exception
    //   443	485	615	java/lang/Exception
    //   486	505	615	java/lang/Exception
    //   506	538	541	java/lang/Exception
    //   506	571	615	java/lang/Exception
    //   522	561	564	java/lang/Exception
    //   572	591	615	java/lang/Exception
    //   592	611	615	java/lang/Exception
  }
  
  public static boolean Zb(String paramString) {
    return (paramString != null && paramString.toLowerCase(Locale.ENGLISH).contains(a(-28191, 11045)));
  }
  
  static short Zs(Zstu paramZstu, int paramInt) {
    if (paramZstu != null && paramZstu.Zpu() - paramInt > 10000) {
      Zyf zyf = Zyf.Zy(Arrays.copyOfRange(paramZstu.ZiD(), 0, 10000 + paramInt));
      return Zg.ZM(zyf, paramInt);
    } 
    return Zg.ZM(paramZstu, paramInt);
  }
  
  public static short ZC(String paramString) {
    if (paramString == null)
      return 0; 
    paramString = paramString.toLowerCase(Locale.ENGLISH);
    return a(-28208, 14375).equals(paramString) ? 256 : (a(-28225, 10692).equals(paramString) ? 256 : (a(-28205, 3222).equals(paramString) ? 256 : (a(-28172, -31460).equals(paramString) ? 256 : (a(-28193, 28919).equals(paramString) ? 256 : (a(-28177, 21803).equals(paramString) ? 256 : (a(-28207, 26722).equals(paramString) ? 513 : (a(-28226, 7945).equals(paramString) ? 513 : (a(-28216, -30203).equals(paramString) ? 514 : (a(-28195, 4796).equals(paramString) ? 515 : (a(-28169, -25896).equals(paramString) ? 516 : (a(-28231, 1248).equals(paramString) ? 517 : (a(-28180, -506).equals(paramString) ? 517 : (a(-28194, 23007).equals(paramString) ? 512 : (a(-28213, 7206).equals(paramString) ? 259 : (a(-28164, 24084).equals(paramString) ? 262 : (a(-28186, -27845).equals(paramString) ? 258 : (a(-28183, 10350).equals(paramString) ? 257 : (a(-28173, 12789).equals(paramString) ? 261 : (a(-28206, 21532).equals(paramString) ? 259 : (a(-28228, -27374).equals(paramString) ? 263 : (a(-28176, -25065).equals(paramString) ? 768 : (a(-28166, -27993).equals(paramString) ? 769 : (a(-28219, 30423).equals(paramString) ? 769 : (a(-28203, 12663).equals(paramString) ? 1026 : (a(-28198, -17608).equals(paramString) ? 1025 : (a(-28202, -29784).equals(paramString) ? 1536 : (a(-28220, -30162).equals(paramString) ? 1537 : 0)))))))))))))))))))))))))));
  }
  
  public static short Zl(Zs68 paramZs68) {
    return (paramZs68.ZH.Zj != 0 && paramZs68.ZH.Zj != 1) ? paramZs68.ZH.Zj : ((paramZs68.ZH.ZJ != 0 && paramZs68.ZH.ZJ != 1) ? paramZs68.ZH.ZJ : 0);
  }
  
  private static Short lambda$getMimeType$1(Short paramShort) {
    return paramShort;
  }
  
  private static Short lambda$getMimeType$0(Zstu paramZstu, int paramInt, Short paramShort) {
    return Short.valueOf(Zg(paramShort.shortValue(), Zs(paramZstu, paramInt)));
  }
  
  static {
    // Byte code:
    //   0: bipush #69
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÛÕÆôû!^úR¶l8£6W çÒ0X`-\î\\bÑê'Üù<Tä°t\\b3È@n»J>ûÕ³J¸ö\\nïØGÊßyzB(\\b^/_ ÒÐ¤ýdß°\\bÎÿåL*ÇÑà¥$\^xat>ÜMs4©¬qº2ÊÜ\Q=Tüzµ\\n¸1µ"äó5©í¬ei0ø³ÜG{dìI¡¾ÍÀ·I)EØ8íÆ×±\\ts¸¶ëJ¨üÖ®:/\\tQU\\f5Zt\\rhB/×ËxFù²újrÇ\\ræ¥3ø3_¾±ÕÝ¢¦òG¾~$FÞÉ¿ó*«ì\\fkwQÃ 5TÏß¹#\\nÛG;Ôb>£Î{·¥®a!#ûU§*÷L¥§ú®¹M`² _^rìL$º¼¼>ª\\rtV]ÌÅb4øê7ô¯ô§HHÑõ¦ka®5åmè¿¾árvàÑ×ã¡RGv6òëÔ0\\rYæñhsMü GN\\n*|ý¹-ùì&^©§))¼ýk#¸ÑÔz'±'âW¦WtO¸p¸'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_3
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #45
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc '­éûD='
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_3
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #75
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
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zt1t.a : [Ljava/lang/String;
    //   130: bipush #69
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zt1t.b : [Ljava/lang/String;
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
    //   212: bipush #41
    //   214: goto -> 244
    //   217: bipush #105
    //   219: goto -> 244
    //   222: bipush #9
    //   224: goto -> 244
    //   227: bipush #111
    //   229: goto -> 244
    //   232: bipush #66
    //   234: goto -> 244
    //   237: bipush #123
    //   239: goto -> 244
    //   242: bipush #48
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
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: new burp/Zr6d
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zt1t.Zg : Lburp/Zr6d;
    //   310: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF91FD) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt1t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */