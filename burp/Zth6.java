package burp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zrzt;

public class Zth6 {
  private static final String[] Zf;
  
  private static int[] Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static List<Ztbr> Z_(Zmzk paramZmzk, List<String> paramList, List<Integer> paramList1) {
    // Byte code:
    //   0: invokestatic Zo : ()[I
    //   3: astore_3
    //   4: aload_1
    //   5: ifnonnull -> 14
    //   8: aconst_null
    //   9: areturn
    //   10: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   13: athrow
    //   14: new java/util/ArrayList
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #4
    //   23: aload_1
    //   24: invokeinterface iterator : ()Ljava/util/Iterator;
    //   29: astore #5
    //   31: aload_2
    //   32: ifnonnull -> 43
    //   35: aconst_null
    //   36: goto -> 49
    //   39: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: aload_2
    //   44: invokeinterface iterator : ()Ljava/util/Iterator;
    //   49: astore #6
    //   51: aload #5
    //   53: invokeinterface hasNext : ()Z
    //   58: ifeq -> 731
    //   61: aload #5
    //   63: invokeinterface next : ()Ljava/lang/Object;
    //   68: checkcast java/lang/String
    //   71: astore #7
    //   73: aload #7
    //   75: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   78: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   81: sipush #-15330
    //   84: sipush #12692
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   93: ifne -> 127
    //   96: aload #6
    //   98: ifnull -> 123
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload #6
    //   110: invokeinterface next : ()Ljava/lang/Object;
    //   115: pop
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload_3
    //   124: ifnonnull -> 51
    //   127: aload #6
    //   129: ifnonnull -> 140
    //   132: iconst_0
    //   133: goto -> 153
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: aload #6
    //   142: invokeinterface next : ()Ljava/lang/Object;
    //   147: checkcast java/lang/Integer
    //   150: invokevirtual intValue : ()I
    //   153: istore #8
    //   155: aload_0
    //   156: ifnonnull -> 167
    //   159: aconst_null
    //   160: goto -> 173
    //   163: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   166: athrow
    //   167: aload_0
    //   168: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   173: astore #9
    //   175: aconst_null
    //   176: astore #10
    //   178: aload #7
    //   180: invokestatic Zd : (Ljava/lang/String;)Lburp/Zkd;
    //   183: astore #11
    //   185: new java/util/LinkedList
    //   188: dup
    //   189: invokespecial <init> : ()V
    //   192: astore #12
    //   194: aload #11
    //   196: getfield Zj : I
    //   199: iconst_1
    //   200: iadd
    //   201: istore #13
    //   203: iload #13
    //   205: aload #7
    //   207: invokevirtual length : ()I
    //   210: if_icmpge -> 645
    //   213: iload #13
    //   215: istore #14
    //   217: iload #13
    //   219: aload #7
    //   221: invokevirtual length : ()I
    //   224: if_icmpge -> 272
    //   227: aload #7
    //   229: iload #13
    //   231: invokevirtual charAt : (I)C
    //   234: bipush #59
    //   236: if_icmpeq -> 272
    //   239: aload #7
    //   241: iload #13
    //   243: invokevirtual charAt : (I)C
    //   246: bipush #61
    //   248: if_icmpeq -> 272
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   257: athrow
    //   258: iinc #13, 1
    //   261: aload_3
    //   262: ifnonnull -> 217
    //   265: goto -> 272
    //   268: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   271: athrow
    //   272: iload #13
    //   274: istore #15
    //   276: iload #13
    //   278: istore #16
    //   280: iload #13
    //   282: istore #17
    //   284: iload #13
    //   286: aload #7
    //   288: invokevirtual length : ()I
    //   291: if_icmpge -> 360
    //   294: aload #7
    //   296: iload #13
    //   298: invokevirtual charAt : (I)C
    //   301: bipush #61
    //   303: if_icmpne -> 360
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   312: athrow
    //   313: iinc #13, 1
    //   316: iload #13
    //   318: istore #16
    //   320: iload #13
    //   322: aload #7
    //   324: invokevirtual length : ()I
    //   327: if_icmpge -> 356
    //   330: aload #7
    //   332: iload #13
    //   334: invokevirtual charAt : (I)C
    //   337: bipush #59
    //   339: if_icmpeq -> 356
    //   342: iinc #13, 1
    //   345: aload_3
    //   346: ifnonnull -> 320
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   355: athrow
    //   356: iload #13
    //   358: istore #17
    //   360: aload #7
    //   362: iload #14
    //   364: iload #15
    //   366: invokevirtual substring : (II)Ljava/lang/String;
    //   369: invokevirtual trim : ()Ljava/lang/String;
    //   372: invokestatic ZJ : (Ljava/lang/String;)Ljava/lang/String;
    //   375: astore #18
    //   377: sipush #-15332
    //   380: aload #7
    //   382: iload #16
    //   384: iload #17
    //   386: invokevirtual substring : (II)Ljava/lang/String;
    //   389: invokevirtual trim : ()Ljava/lang/String;
    //   392: invokestatic ZJ : (Ljava/lang/String;)Ljava/lang/String;
    //   395: astore #19
    //   397: sipush #-17818
    //   400: aload #12
    //   402: aload #18
    //   404: aload #19
    //   406: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   409: invokeinterface add : (Ljava/lang/Object;)Z
    //   414: pop
    //   415: iinc #13, 1
    //   418: invokestatic a : (II)Ljava/lang/String;
    //   421: aload #18
    //   423: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   426: ifeq -> 610
    //   429: aload #19
    //   431: invokevirtual length : ()I
    //   434: istore #20
    //   436: aload #19
    //   438: iload #20
    //   440: invokestatic ZW : (Ljava/lang/String;I)Ljava/lang/String;
    //   443: astore #21
    //   445: aload #21
    //   447: ifnull -> 606
    //   450: iload #20
    //   452: aload #21
    //   454: invokevirtual length : ()I
    //   457: iconst_1
    //   458: iadd
    //   459: isub
    //   460: istore #20
    //   462: aload #19
    //   464: iload #20
    //   466: invokestatic ZW : (Ljava/lang/String;I)Ljava/lang/String;
    //   469: astore #21
    //   471: aload #21
    //   473: ifnull -> 606
    //   476: iload #20
    //   478: aload #21
    //   480: invokevirtual length : ()I
    //   483: iconst_1
    //   484: iadd
    //   485: isub
    //   486: istore #20
    //   488: aload #21
    //   490: invokevirtual length : ()I
    //   493: iconst_2
    //   494: if_icmpgt -> 506
    //   497: aload #19
    //   499: iload #20
    //   501: invokestatic ZW : (Ljava/lang/String;I)Ljava/lang/String;
    //   504: astore #21
    //   506: aload #21
    //   508: ifnull -> 606
    //   511: aload #19
    //   513: ldc '.'
    //   515: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   518: ifne -> 538
    //   521: goto -> 528
    //   524: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   527: athrow
    //   528: aload #19
    //   530: ldc '*'
    //   532: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   535: ifeq -> 550
    //   538: aload #19
    //   540: iconst_1
    //   541: invokevirtual substring : (I)Ljava/lang/String;
    //   544: astore #19
    //   546: aload_3
    //   547: ifnonnull -> 511
    //   550: aload #9
    //   552: ifnonnull -> 563
    //   555: aload #19
    //   557: astore #9
    //   559: aload_3
    //   560: ifnonnull -> 606
    //   563: aload #9
    //   565: aload #19
    //   567: invokevirtual equals : (Ljava/lang/Object;)Z
    //   570: ifne -> 602
    //   573: goto -> 580
    //   576: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   579: athrow
    //   580: aload #9
    //   582: aload #19
    //   584: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   589: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   592: ifeq -> 606
    //   595: goto -> 602
    //   598: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   601: athrow
    //   602: aload #19
    //   604: astore #9
    //   606: aload_3
    //   607: ifnonnull -> 641
    //   610: sipush #-15333
    //   613: sipush #9355
    //   616: invokestatic a : (II)Ljava/lang/String;
    //   619: aload #18
    //   621: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   624: ifeq -> 641
    //   627: goto -> 634
    //   630: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   633: athrow
    //   634: aload #19
    //   636: invokestatic ZY : (Ljava/lang/String;)Ljava/util/Date;
    //   639: astore #10
    //   641: aload_3
    //   642: ifnonnull -> 203
    //   645: new burp/Zce
    //   648: dup
    //   649: aload #7
    //   651: aload #9
    //   653: aload #11
    //   655: getfield Zp : Ljava/lang/String;
    //   658: aload #11
    //   660: getfield Zn : Ljava/lang/String;
    //   663: aload #10
    //   665: iload #8
    //   667: aload #11
    //   669: getfield ZM : I
    //   672: iadd
    //   673: iload #8
    //   675: aload #11
    //   677: getfield ZE : I
    //   680: iadd
    //   681: iload #8
    //   683: aload #11
    //   685: getfield ZO : I
    //   688: iadd
    //   689: iload #8
    //   691: aload #11
    //   693: getfield Zj : I
    //   696: iadd
    //   697: aload #12
    //   699: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;IIIILjava/util/List;)V
    //   702: astore #14
    //   704: aload #4
    //   706: aload #14
    //   708: invokeinterface add : (Ljava/lang/Object;)Z
    //   713: pop
    //   714: goto -> 51
    //   717: astore #7
    //   719: aload #7
    //   721: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   724: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   727: aload_3
    //   728: ifnonnull -> 51
    //   731: aload #4
    //   733: areturn
    // Exception table:
    //   from	to	target	type
    //   4	10	10	java/lang/Exception
    //   31	39	39	java/lang/Exception
    //   61	123	717	java/lang/Exception
    //   73	101	104	java/lang/Exception
    //   96	116	119	java/lang/Exception
    //   127	136	136	java/lang/Exception
    //   127	714	717	java/lang/Exception
    //   155	163	163	java/lang/Exception
    //   227	251	254	java/lang/Exception
    //   239	265	268	java/lang/Exception
    //   284	306	309	java/lang/Exception
    //   330	349	352	java/lang/Exception
    //   506	521	524	java/lang/Exception
    //   559	573	576	java/lang/Exception
    //   563	595	598	java/lang/Exception
    //   606	627	630	java/lang/Exception
  }
  
  private static Date ZY(String paramString) {
    int[] arrayOfInt = Zo();
    if (paramString != null) {
      String[] arrayOfString = Zf;
      int i = arrayOfString.length;
      byte b = 0;
      while (b < i) {
        String str = arrayOfString[b];
        try {
          Date date = (new SimpleDateFormat(str)).parse(paramString);
          return ZM(date);
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.IGNORED);
          b++;
          if (arrayOfInt == null)
            break; 
        } 
      } 
    } 
    return null;
  }
  
  private static Date ZM(Date paramDate) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTimeInMillis(paramDate.getTime());
    int i = calendar.get(1);
    int[] arrayOfInt = Zo();
    if (i >= 100)
      return paramDate; 
    if (i < 70) {
      i += 2000;
      if (arrayOfInt == null) {
        i += 1900;
        calendar.set(1, i);
        return new Date(calendar.getTimeInMillis());
      } 
      calendar.set(1, i);
      return new Date(calendar.getTimeInMillis());
    } 
    i += 1900;
    calendar.set(1, i);
    return new Date(calendar.getTimeInMillis());
  }
  
  private static Zkd Zd(String paramString) {
    int[] arrayOfInt = Zo();
    int m = paramString.indexOf(";");
    if (m != -1)
      paramString = paramString.substring(0, m); 
    if (paramString.contains("=")) {
      int n = paramString.indexOf("=", 11);
      int i1 = n + 1;
      int i2 = paramString.length();
      if (arrayOfInt == null) {
        n = paramString.length();
        i1 = n;
        i2 = n;
        String str5 = paramString.substring(11, n).trim();
        String str6 = paramString.substring(i1, i2).trim();
        return new Zkd(str5, str6, 11, n, i1, i2);
      } 
      String str3 = paramString.substring(11, n).trim();
      String str4 = paramString.substring(i1, i2).trim();
      return new Zkd(str3, str4, 11, n, i1, i2);
    } 
    int i = paramString.length();
    int j = i;
    int k = i;
    String str1 = paramString.substring(11, i).trim();
    String str2 = paramString.substring(j, k).trim();
    return new Zkd(str1, str2, 11, i, j, k);
  }
  
  public static List<Ztbr> Zl(Zmzk paramZmzk, List<String> paramList) {
    // Byte code:
    //   0: invokestatic Zo : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: sipush #-15331
    //   8: sipush #-29088
    //   11: invokestatic a : (II)Ljava/lang/String;
    //   14: iconst_0
    //   15: invokestatic ZZ : (Ljava/util/List;Ljava/lang/String;Z)Ljava/lang/String;
    //   18: astore_3
    //   19: aload_3
    //   20: ifnonnull -> 25
    //   23: aconst_null
    //   24: areturn
    //   25: new java/util/ArrayList
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: astore #4
    //   34: new java/util/StringTokenizer
    //   37: dup
    //   38: aload_3
    //   39: bipush #7
    //   41: invokevirtual substring : (I)Ljava/lang/String;
    //   44: ldc ';'
    //   46: iconst_0
    //   47: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Z)V
    //   50: astore #5
    //   52: aload #5
    //   54: invokevirtual hasMoreTokens : ()Z
    //   57: ifeq -> 281
    //   60: aload #5
    //   62: invokevirtual nextToken : ()Ljava/lang/String;
    //   65: invokevirtual trim : ()Ljava/lang/String;
    //   68: astore #6
    //   70: aload #6
    //   72: ldc '='
    //   74: invokevirtual indexOf : (Ljava/lang/String;)I
    //   77: istore #9
    //   79: iload #9
    //   81: iconst_m1
    //   82: if_icmpne -> 97
    //   85: aload #6
    //   87: astore #7
    //   89: ldc ''
    //   91: astore #8
    //   93: aload_2
    //   94: ifnonnull -> 124
    //   97: aload #6
    //   99: iconst_0
    //   100: iload #9
    //   102: invokevirtual substring : (II)Ljava/lang/String;
    //   105: invokevirtual trim : ()Ljava/lang/String;
    //   108: astore #7
    //   110: aload #6
    //   112: iload #9
    //   114: iconst_1
    //   115: iadd
    //   116: invokevirtual substring : (I)Ljava/lang/String;
    //   119: invokevirtual trim : ()Ljava/lang/String;
    //   122: astore #8
    //   124: aload #7
    //   126: invokevirtual isEmpty : ()Z
    //   129: ifne -> 277
    //   132: aload_0
    //   133: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   138: astore #10
    //   140: iconst_0
    //   141: aload_0
    //   142: invokeinterface ZJY : ()B
    //   147: if_icmpne -> 255
    //   150: aload #10
    //   152: invokevirtual length : ()I
    //   155: istore #11
    //   157: aload #10
    //   159: iload #11
    //   161: invokestatic ZW : (Ljava/lang/String;I)Ljava/lang/String;
    //   164: astore #12
    //   166: aload #12
    //   168: ifnull -> 255
    //   171: iload #11
    //   173: aload #12
    //   175: invokevirtual length : ()I
    //   178: iconst_1
    //   179: iadd
    //   180: isub
    //   181: istore #11
    //   183: aload #10
    //   185: iload #11
    //   187: invokestatic ZW : (Ljava/lang/String;I)Ljava/lang/String;
    //   190: astore #12
    //   192: aload #12
    //   194: ifnull -> 255
    //   197: iload #11
    //   199: aload #12
    //   201: invokevirtual length : ()I
    //   204: iconst_1
    //   205: iadd
    //   206: isub
    //   207: istore #11
    //   209: aload #12
    //   211: invokevirtual length : ()I
    //   214: iconst_3
    //   215: if_icmpgt -> 244
    //   218: aload #10
    //   220: iload #11
    //   222: invokestatic ZW : (Ljava/lang/String;I)Ljava/lang/String;
    //   225: astore #12
    //   227: aload #12
    //   229: ifnull -> 244
    //   232: iload #11
    //   234: aload #12
    //   236: invokevirtual length : ()I
    //   239: iconst_1
    //   240: iadd
    //   241: isub
    //   242: istore #11
    //   244: aload #10
    //   246: iload #11
    //   248: iconst_1
    //   249: iadd
    //   250: invokevirtual substring : (I)Ljava/lang/String;
    //   253: astore #10
    //   255: aload #4
    //   257: new burp/Zce
    //   260: dup
    //   261: aconst_null
    //   262: aload #10
    //   264: aload #7
    //   266: aload #8
    //   268: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   271: invokeinterface add : (Ljava/lang/Object;)Z
    //   276: pop
    //   277: aload_2
    //   278: ifnonnull -> 52
    //   281: aload #4
    //   283: areturn
  }
  
  public static Map<String, String> Zl(List<String> paramList) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Iterator<String> iterator = paramList.iterator();
    int[] arrayOfInt = Zo();
    while (iterator.hasNext()) {
      String str = iterator.next();
      try {
        Zkd zkd = Zd(str);
        String str1 = Zrzt.ZJ(zkd.Zp).trim();
        String str2 = Zrzt.ZJ(zkd.Zn).trim();
        hashMap.put(str1, str2);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      } 
      if (arrayOfInt == null) {
        Zbqc.Zr(new Zbqc[1]);
        break;
      } 
    } 
    return (Map)hashMap;
  }
  
  public static String ZW(String paramString, int paramInt) {
    int[] arrayOfInt = Zo();
    int i = paramInt;
    while (i > 0 && paramString.charAt(i - 1) != '.') {
      i--;
      if (arrayOfInt == null)
        break; 
    } 
    if (paramInt - i < 2)
      return null; 
    if (Zbqc.Zwu() == null)
      Zg(new int[5]); 
    return paramString.substring(i, paramInt);
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_1
    //   10: newarray int
    //   12: ldc 'y£/ãjâVû¡Xìªï)dH÷¾7WØ9J/Ð¦ÐVwØGó_E>\\f@Å '
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: invokestatic Zg : ([I)V
    //   24: bipush #11
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #51
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 149
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc 'lîAe1ìñªÒYNOñØA5é-Yô´ÝRì'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #26
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #21
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Zth6.a : [Ljava/lang/String;
    //   138: bipush #6
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Zth6.b : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 268
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #13
    //   222: goto -> 252
    //   225: bipush #36
    //   227: goto -> 252
    //   230: bipush #48
    //   232: goto -> 252
    //   235: bipush #110
    //   237: goto -> 252
    //   240: bipush #121
    //   242: goto -> 252
    //   245: bipush #12
    //   247: goto -> 252
    //   250: bipush #12
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 172
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 168
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 46, 0 -> 105
    //   308: iconst_2
    //   309: anewarray java/lang/String
    //   312: dup
    //   313: iconst_0
    //   314: sipush #-15334
    //   317: sipush #-21694
    //   320: invokestatic a : (II)Ljava/lang/String;
    //   323: aastore
    //   324: dup
    //   325: iconst_1
    //   326: sipush #-15329
    //   329: sipush #-4244
    //   332: invokestatic a : (II)Ljava/lang/String;
    //   335: aastore
    //   336: putstatic burp/Zth6.Zf : [Ljava/lang/String;
    //   339: return
  }
  
  public static void Zg(int[] paramArrayOfint) {
    Zt = paramArrayOfint;
  }
  
  public static int[] Zo() {
    return Zt;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC41E) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zth6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */