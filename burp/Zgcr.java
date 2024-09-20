package burp;

import java.util.List;
import java.util.Locale;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zto;

public class Zgcr {
  private static final String[][] ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zs0d Zd(Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2, List<String> paramList, int paramInt1, short paramShort, int paramInt2, Zbnt paramZbnt) {
    try {
      Zs0c zs0c = ZV(paramZstu2, paramList, paramInt1, paramShort, paramInt2);
      if (zs0c == null)
        return null; 
      Zlit zlit = Zd(paramZmzk, Zp(paramZstu1), paramZbnt, zs0c.Zx());
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      return (zlit == null) ? null : new Zs0d(zs0c, zlit);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  public static String ZR(Zstu paramZstu, List<String> paramList, int paramInt1, short paramShort, int paramInt2) {
    Zs0c zs0c = ZV(paramZstu, paramList, paramInt1, paramShort, paramInt2);
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (zs0c == null) ? null : zs0c.Zx();
  }
  
  private static Zs0c ZV(Zstu paramZstu, List<String> paramList, int paramInt1, short paramShort, int paramInt2) {
    if ((paramInt2 & 0x11) != 0) {
      Zs0c zs0c = Zv(paramList, paramShort, paramInt2);
      try {
        if (zs0c != null)
          return zs0c; 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } 
    if ((paramInt2 & 0x2) != 0) {
      Zs0c zs0c = Ze(paramList);
      try {
        if (zs0c != null)
          return zs0c; 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } 
    Zto<Zk8m, List<Ztu8>> zto = Z_(paramZstu, paramList, paramInt1);
    Zk8m zk8m = (Zk8m)zto.Zq;
    List<Ztu8> list = (List)zto.Zo;
    if ((paramInt2 & 0x4) != 0) {
      Zs0c zs0c = ZY(list, zk8m);
      try {
        if (zs0c != null)
          return zs0c; 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } 
    if ((paramInt2 & 0x8) != 0) {
      String str = ZQ(list, zk8m);
      try {
        if (str != null)
          return new Zs0c(Zlju.JAVASCRIPT, str, 0); 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  public static Zlit Zd(Zmzk paramZmzk, String paramString1, Zbnt paramZbnt, String paramString2) {
    // Byte code:
    //   0: invokestatic Zo : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_3
    //   6: sipush #-30668
    //   9: sipush #15701
    //   12: invokestatic a : (II)Ljava/lang/String;
    //   15: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   18: ifeq -> 34
    //   21: aload_0
    //   22: invokeinterface ZJQ : ()Ljava/lang/String;
    //   27: aload_3
    //   28: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   33: astore_3
    //   34: aload_3
    //   35: iconst_0
    //   36: aload_3
    //   37: invokevirtual length : ()I
    //   40: bipush #8
    //   42: invokestatic min : (II)I
    //   45: invokevirtual substring : (II)Ljava/lang/String;
    //   48: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   51: astore #5
    //   53: aload #5
    //   55: sipush #-30664
    //   58: sipush #31450
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   67: ifne -> 94
    //   70: aload #5
    //   72: sipush #-30687
    //   75: sipush #-24051
    //   78: invokestatic a : (II)Ljava/lang/String;
    //   81: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   84: ifeq -> 102
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: iconst_1
    //   95: goto -> 103
    //   98: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: iconst_0
    //   103: istore #6
    //   105: iload #6
    //   107: ifne -> 143
    //   110: aload_3
    //   111: ldc '/'
    //   113: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   116: ifne -> 143
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   125: athrow
    //   126: aload_1
    //   127: ifnull -> 143
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   136: athrow
    //   137: aload_1
    //   138: aload_3
    //   139: invokestatic ZC : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   142: astore_3
    //   143: iload #6
    //   145: ifeq -> 243
    //   148: new java/net/URL
    //   151: dup
    //   152: aload_3
    //   153: invokespecial <init> : (Ljava/lang/String;)V
    //   156: astore #9
    //   158: aload #9
    //   160: invokevirtual getProtocol : ()Ljava/lang/String;
    //   163: sipush #-30678
    //   166: sipush #-21617
    //   169: invokestatic a : (II)Ljava/lang/String;
    //   172: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   175: istore #10
    //   177: aload #9
    //   179: invokevirtual getPort : ()I
    //   182: istore #11
    //   184: iload #11
    //   186: iconst_m1
    //   187: if_icmpne -> 216
    //   190: iload #10
    //   192: ifeq -> 212
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   201: athrow
    //   202: sipush #443
    //   205: goto -> 214
    //   208: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   211: athrow
    //   212: bipush #80
    //   214: istore #11
    //   216: aload_2
    //   217: aload #9
    //   219: invokevirtual getHost : ()Ljava/lang/String;
    //   222: iload #11
    //   224: iload #10
    //   226: invokevirtual ZY : (Ljava/lang/String;IZ)Lburp/Zmzk;
    //   229: astore #7
    //   231: aload #9
    //   233: invokevirtual getFile : ()Ljava/lang/String;
    //   236: astore #8
    //   238: aload #4
    //   240: ifnonnull -> 249
    //   243: aload_0
    //   244: astore #7
    //   246: aload_3
    //   247: astore #8
    //   249: aload #8
    //   251: invokevirtual isEmpty : ()Z
    //   254: ifeq -> 261
    //   257: ldc '/'
    //   259: astore #8
    //   261: aload #8
    //   263: ldc '?'
    //   265: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   268: ifeq -> 280
    //   271: aload #8
    //   273: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   278: astore #8
    //   280: aload #8
    //   282: ldc ' '
    //   284: sipush #-30674
    //   287: sipush #-3199
    //   290: invokestatic a : (II)Ljava/lang/String;
    //   293: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   296: astore #8
    //   298: new burp/Zax
    //   301: dup
    //   302: aload #7
    //   304: aload #8
    //   306: invokestatic Zy : (Ljava/lang/String;)[B
    //   309: invokespecial <init> : (Lburp/Zmzk;[B)V
    //   312: astore #9
    //   314: new burp/Ztr7
    //   317: dup
    //   318: aload_2
    //   319: invokespecial <init> : (Lburp/Zbnt;)V
    //   322: aload #9
    //   324: invokevirtual Zdw : ()Ljava/lang/String;
    //   327: invokevirtual ZN : (Ljava/lang/String;)Lburp/Zlit;
    //   330: pop
    //   331: aload #9
    //   333: areturn
    //   334: astore #5
    //   336: aload #5
    //   338: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   341: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   344: aconst_null
    //   345: areturn
    //   346: astore #5
    //   348: aload #5
    //   350: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   353: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   356: aconst_null
    //   357: areturn
    // Exception table:
    //   from	to	target	type
    //   5	333	334	burp/Zxgy
    //   5	333	334	java/net/MalformedURLException
    //   5	333	334	burp/Zxg5
    //   5	333	346	java/lang/Exception
    //   53	87	90	burp/Zxgy
    //   70	98	98	burp/Zxgy
    //   105	119	122	burp/Zxgy
    //   110	130	133	burp/Zxgy
    //   184	195	198	burp/Zxgy
    //   190	208	208	burp/Zxgy
  }
  
  private static String Zp(Zstu paramZstu) {
    try {
      if (paramZstu == null)
        return null; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    List<String> list = Zgyj.ZI(paramZstu);
    return ((String)list.get(0)).split(a(-30679, -25388), 3)[1].trim();
  }
  
  private static String ZC(String paramString1, String paramString2) {
    // Byte code:
    //   0: invokestatic Zo : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: iconst_0
    //   6: aload_0
    //   7: invokevirtual length : ()I
    //   10: bipush #8
    //   12: invokestatic min : (II)I
    //   15: invokevirtual substring : (II)Ljava/lang/String;
    //   18: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   21: astore_3
    //   22: aload_3
    //   23: sipush #-30677
    //   26: sipush #-10504
    //   29: invokestatic a : (II)Ljava/lang/String;
    //   32: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   35: ifne -> 61
    //   38: aload_3
    //   39: sipush #-30676
    //   42: sipush #1774
    //   45: invokestatic a : (II)Ljava/lang/String;
    //   48: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   51: ifeq -> 91
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: aload_0
    //   62: ldc '/'
    //   64: bipush #8
    //   66: invokevirtual indexOf : (Ljava/lang/String;I)I
    //   69: istore #4
    //   71: iload #4
    //   73: iconst_m1
    //   74: if_icmpeq -> 88
    //   77: aload_0
    //   78: iload #4
    //   80: invokevirtual substring : (I)Ljava/lang/String;
    //   83: astore_0
    //   84: aload_2
    //   85: ifnonnull -> 91
    //   88: ldc '/'
    //   90: astore_0
    //   91: aload_0
    //   92: invokestatic ZO : (Ljava/lang/String;)I
    //   95: istore #4
    //   97: iload #4
    //   99: iconst_m1
    //   100: if_icmpeq -> 111
    //   103: aload_0
    //   104: iconst_0
    //   105: iload #4
    //   107: invokevirtual substring : (II)Ljava/lang/String;
    //   110: astore_0
    //   111: aload_0
    //   112: ldc '/'
    //   114: invokevirtual lastIndexOf : (Ljava/lang/String;)I
    //   117: istore #4
    //   119: iload #4
    //   121: iconst_m1
    //   122: if_icmpeq -> 135
    //   125: aload_0
    //   126: iconst_0
    //   127: iload #4
    //   129: iconst_1
    //   130: iadd
    //   131: invokevirtual substring : (II)Ljava/lang/String;
    //   134: astore_0
    //   135: aload_0
    //   136: aload_1
    //   137: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   142: astore_1
    //   143: aload_1
    //   144: areturn
    // Exception table:
    //   from	to	target	type
    //   22	54	57	java/lang/NumberFormatException
  }
  
  private static Zs0c Zv(List<String> paramList, short paramShort, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: sipush #-30670
    //   4: sipush #18717
    //   7: invokestatic a : (II)Ljava/lang/String;
    //   10: iconst_0
    //   11: invokestatic ZZ : (Ljava/util/List;Ljava/lang/String;Z)Ljava/lang/String;
    //   14: astore_3
    //   15: aload_3
    //   16: ifnull -> 150
    //   19: iload_2
    //   20: bipush #16
    //   22: iand
    //   23: ifne -> 61
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   32: athrow
    //   33: iload_1
    //   34: sipush #300
    //   37: if_icmplt -> 150
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   46: athrow
    //   47: iload_1
    //   48: sipush #400
    //   51: if_icmpge -> 150
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: iload_1
    //   62: sipush #307
    //   65: if_icmpeq -> 89
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: iload_1
    //   76: sipush #308
    //   79: if_icmpne -> 97
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: iconst_1
    //   90: goto -> 98
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: iconst_0
    //   98: istore #4
    //   100: new burp/Zs0c
    //   103: dup
    //   104: iload_1
    //   105: sipush #300
    //   108: if_icmplt -> 131
    //   111: iload_1
    //   112: sipush #400
    //   115: if_icmpge -> 131
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: getstatic burp/Zlju.LOCATION_3XX : Lburp/Zlju;
    //   128: goto -> 134
    //   131: getstatic burp/Zlju.LOCATION_XXX : Lburp/Zlju;
    //   134: aload_3
    //   135: bipush #9
    //   137: invokevirtual substring : (I)Ljava/lang/String;
    //   140: invokevirtual trim : ()Ljava/lang/String;
    //   143: iconst_0
    //   144: iload #4
    //   146: invokespecial <init> : (Lburp/Zlju;Ljava/lang/String;IZ)V
    //   149: areturn
    //   150: aconst_null
    //   151: areturn
    // Exception table:
    //   from	to	target	type
    //   15	26	29	java/lang/NumberFormatException
    //   19	40	43	java/lang/NumberFormatException
    //   33	54	57	java/lang/NumberFormatException
    //   47	68	71	java/lang/NumberFormatException
    //   61	82	85	java/lang/NumberFormatException
    //   75	93	93	java/lang/NumberFormatException
    //   100	118	121	java/lang/NumberFormatException
  }
  
  public static Zs0c Ze(List<String> paramList) {
    String str = Zgyj.ZZ(paramList, a(-30665, 2971), false);
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return (str == null) ? null : Zw(str.substring(8), Zlju.REFRESH);
  }
  
  private static Zto<Zk8m, List<Ztu8>> Z_(Zstu paramZstu, List<String> paramList, int paramInt) {
    Zk8m zk8m = Zt1t.ZJ(paramZstu, paramInt, paramList);
    try {
      if (zk8m.ZJ == 256 || zk8m.Zj == 256) {
        String str = Zg12.ZY(zk8m);
        return Zto.ZM(zk8m, Zsz8.ZA(paramZstu, paramInt, paramZstu.Zpu(), (byte)0, str));
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return Zto.ZM(zk8m, null);
  }
  
  public static Zs0c ZY(List<Ztu8> paramList, Zk8m paramZk8m) {
    // Byte code:
    //   0: invokestatic Zo : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: getfield ZJ : S
    //   8: ifeq -> 28
    //   11: aload_1
    //   12: getfield ZJ : S
    //   15: sipush #256
    //   18: if_icmpne -> 36
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: iconst_1
    //   29: goto -> 37
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: iconst_0
    //   37: istore_3
    //   38: aload_0
    //   39: ifnull -> 67
    //   42: aload_1
    //   43: getfield Zl : Z
    //   46: ifne -> 67
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: iload_3
    //   57: ifne -> 73
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: aconst_null
    //   68: areturn
    //   69: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   72: athrow
    //   73: iconst_0
    //   74: istore #4
    //   76: aload_0
    //   77: invokeinterface iterator : ()Ljava/util/Iterator;
    //   82: astore #5
    //   84: aload #5
    //   86: invokeinterface hasNext : ()Z
    //   91: ifeq -> 400
    //   94: aload #5
    //   96: invokeinterface next : ()Ljava/lang/Object;
    //   101: checkcast burp/Ztu8
    //   104: astore #6
    //   106: aload #6
    //   108: invokeinterface ZlD : ()B
    //   113: iconst_1
    //   114: if_icmpne -> 158
    //   117: sipush #-30685
    //   120: sipush #20398
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: aload #6
    //   128: invokeinterface ZlP : ()Lburp/Zs_n;
    //   133: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   138: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   141: ifeq -> 158
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: goto -> 400
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: aload #6
    //   160: invokeinterface ZlP : ()Lburp/Zs_n;
    //   165: ifnull -> 234
    //   168: sipush #-30671
    //   171: sipush #22484
    //   174: invokestatic a : (II)Ljava/lang/String;
    //   177: aload #6
    //   179: invokeinterface ZlP : ()Lburp/Zs_n;
    //   184: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   189: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   192: ifeq -> 234
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   201: athrow
    //   202: aload #6
    //   204: invokeinterface ZlD : ()B
    //   209: ifne -> 227
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   218: athrow
    //   219: iconst_1
    //   220: goto -> 228
    //   223: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   226: athrow
    //   227: iconst_0
    //   228: istore #4
    //   230: aload_2
    //   231: ifnonnull -> 84
    //   234: aload #6
    //   236: invokeinterface ZlD : ()B
    //   241: ifeq -> 262
    //   244: aload #6
    //   246: invokeinterface ZlD : ()B
    //   251: iconst_4
    //   252: if_icmpne -> 84
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   261: athrow
    //   262: sipush #-30663
    //   265: sipush #12170
    //   268: invokestatic a : (II)Ljava/lang/String;
    //   271: aload #6
    //   273: invokeinterface ZlP : ()Lburp/Zs_n;
    //   278: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   283: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   286: ifne -> 296
    //   289: goto -> 84
    //   292: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   295: athrow
    //   296: aload #6
    //   298: invokeinterface ZlP : ()Lburp/Zs_n;
    //   303: sipush #-30688
    //   306: sipush #30936
    //   309: invokestatic a : (II)Ljava/lang/String;
    //   312: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   317: astore #7
    //   319: sipush #-30673
    //   322: sipush #-12386
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: aload #7
    //   330: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   333: ifeq -> 396
    //   336: aload #6
    //   338: invokeinterface ZlP : ()Lburp/Zs_n;
    //   343: sipush #-30680
    //   346: sipush #-13869
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: invokeinterface ZI2 : (Ljava/lang/String;)Ljava/lang/String;
    //   357: astore #8
    //   359: aload #8
    //   361: iload #4
    //   363: ifeq -> 376
    //   366: getstatic burp/Zlju.META_REFRESH_NOSCRIPT : Lburp/Zlju;
    //   369: goto -> 379
    //   372: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   375: athrow
    //   376: getstatic burp/Zlju.META_REFRESH : Lburp/Zlju;
    //   379: invokestatic Zw : (Ljava/lang/String;Lburp/Zlju;)Lburp/Zs0c;
    //   382: astore #9
    //   384: aload #9
    //   386: ifnull -> 396
    //   389: aload #9
    //   391: areturn
    //   392: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   395: athrow
    //   396: aload_2
    //   397: ifnonnull -> 84
    //   400: aconst_null
    //   401: areturn
    // Exception table:
    //   from	to	target	type
    //   4	21	24	java/lang/NumberFormatException
    //   11	32	32	java/lang/NumberFormatException
    //   38	49	52	java/lang/NumberFormatException
    //   42	60	63	java/lang/NumberFormatException
    //   56	69	69	java/lang/NumberFormatException
    //   106	144	147	java/lang/NumberFormatException
    //   117	154	154	java/lang/NumberFormatException
    //   158	195	198	java/lang/NumberFormatException
    //   168	212	215	java/lang/NumberFormatException
    //   202	223	223	java/lang/NumberFormatException
    //   234	255	258	java/lang/NumberFormatException
    //   262	292	292	java/lang/NumberFormatException
    //   359	372	372	java/lang/NumberFormatException
    //   384	392	392	java/lang/NumberFormatException
  }
  
  private static String ZQ(List<Ztu8> paramList, Zk8m paramZk8m) {
    // Byte code:
    //   0: invokestatic Zo : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: getfield ZJ : S
    //   8: ifeq -> 28
    //   11: aload_1
    //   12: getfield ZJ : S
    //   15: sipush #256
    //   18: if_icmpne -> 36
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: iconst_1
    //   29: goto -> 37
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: iconst_0
    //   37: istore_3
    //   38: aload_0
    //   39: ifnull -> 67
    //   42: aload_1
    //   43: getfield Zl : Z
    //   46: ifne -> 67
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: iload_3
    //   57: ifne -> 73
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: aconst_null
    //   68: areturn
    //   69: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   72: athrow
    //   73: aload_0
    //   74: invokeinterface iterator : ()Ljava/util/Iterator;
    //   79: astore #4
    //   81: aload #4
    //   83: invokeinterface hasNext : ()Z
    //   88: ifeq -> 222
    //   91: aload #4
    //   93: invokeinterface next : ()Ljava/lang/Object;
    //   98: checkcast burp/Ztu8
    //   101: astore #5
    //   103: aload #5
    //   105: invokeinterface ZlD : ()B
    //   110: ifne -> 81
    //   113: sipush #-30682
    //   116: sipush #11387
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: aload #5
    //   124: invokeinterface ZlP : ()Lburp/Zs_n;
    //   129: invokeinterface ZJ3 : ()Ljava/lang/String;
    //   134: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   137: ifne -> 147
    //   140: goto -> 81
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: aload #4
    //   149: invokeinterface hasNext : ()Z
    //   154: ifeq -> 169
    //   157: aload #4
    //   159: invokeinterface next : ()Ljava/lang/Object;
    //   164: checkcast burp/Ztu8
    //   167: astore #5
    //   169: aload #5
    //   171: invokeinterface ZlD : ()B
    //   176: iconst_3
    //   177: if_icmpeq -> 187
    //   180: goto -> 81
    //   183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   186: athrow
    //   187: new burp/Zkja
    //   190: dup
    //   191: aload #5
    //   193: invokeinterface Zlv : ()Ljava/lang/String;
    //   198: invokespecial <init> : (Ljava/lang/String;)V
    //   201: invokevirtual Zu : ()Ljava/lang/String;
    //   204: astore #6
    //   206: aload #6
    //   208: ifnull -> 218
    //   211: aload #6
    //   213: areturn
    //   214: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   217: athrow
    //   218: aload_2
    //   219: ifnonnull -> 81
    //   222: aconst_null
    //   223: areturn
    // Exception table:
    //   from	to	target	type
    //   4	21	24	java/lang/NumberFormatException
    //   11	32	32	java/lang/NumberFormatException
    //   38	49	52	java/lang/NumberFormatException
    //   42	60	63	java/lang/NumberFormatException
    //   56	69	69	java/lang/NumberFormatException
    //   113	143	143	java/lang/NumberFormatException
    //   169	183	183	java/lang/NumberFormatException
    //   206	214	214	java/lang/NumberFormatException
  }
  
  private static Zs0c Zw(String paramString, Zlju paramZlju) {
    if (paramString != null) {
      int i = paramString.toLowerCase(Locale.US).indexOf(a(-30675, 8705));
      try {
        if (i != -1 && paramString.length() > i + 4) {
          int j = i + 4;
          int k = paramString.length() - 1;
          try {
            if (k - j > 2)
              try {
                if (paramString.charAt(j) == '\'')
                  try {
                    j++;
                    if (paramString.charAt(k) == '\'')
                      k--; 
                  } catch (NumberFormatException numberFormatException) {
                    throw a(null);
                  }  
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              }  
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          String str = paramString.substring(j, k + 1);
          int m = ZQ(paramString);
          return new Zs0c(paramZlju, str, m);
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  private static int ZQ(String paramString) {
    int i = paramString.indexOf(";");
    try {
      if (i == -1)
        return 0; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    String str = paramString.substring(0, i).trim();
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
      return 0;
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\nÅ0=wNæz\\b=ÍÖ<õ1ç&hS" ) A±Êtª5ëòü§è'QFjvÆêÉ*ÿ\\b?¼{}¹6 Ôó¼½sUwwim,yÒ<K­Ø´âö:oåUO<ÓaÝ\\b¦¡¥±MÑ^\\r¯ílÀ"-}\\bá«=ÊC?Ã}D61E)r_\\bkÝ|rÀ\\tBÆ4\\fP³\\rÄ8zë«ËÌú2Éày"ðõxzCíF>hã4ÛÌØîgÚ¹WÛügÖ x:­±>Ö5mç o>$\\bö"Àðq£ÀÓc¾¢ó\\fÕHQñîr`MÃm'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #65
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
    //   68: ldc 'óê3á£°±ÝÌJ'×g=\¯Æ¿_¶g'­<àý'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #15
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #43
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
    //   129: putstatic burp/Zgcr.a : [Ljava/lang/String;
    //   132: bipush #29
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgcr.b : [Ljava/lang/String;
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
    //   212: bipush #49
    //   214: goto -> 244
    //   217: bipush #66
    //   219: goto -> 244
    //   222: bipush #47
    //   224: goto -> 244
    //   227: bipush #46
    //   229: goto -> 244
    //   232: bipush #42
    //   234: goto -> 244
    //   237: bipush #94
    //   239: goto -> 244
    //   242: bipush #32
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
    //   300: bipush #11
    //   302: anewarray [Ljava/lang/String;
    //   305: dup
    //   306: iconst_0
    //   307: iconst_2
    //   308: anewarray java/lang/String
    //   311: dup
    //   312: iconst_0
    //   313: sipush #-30683
    //   316: sipush #-24590
    //   319: invokestatic a : (II)Ljava/lang/String;
    //   322: aastore
    //   323: dup
    //   324: iconst_1
    //   325: ldc '='
    //   327: aastore
    //   328: aastore
    //   329: dup
    //   330: iconst_1
    //   331: iconst_2
    //   332: anewarray java/lang/String
    //   335: dup
    //   336: iconst_0
    //   337: sipush #-30669
    //   340: sipush #16580
    //   343: invokestatic a : (II)Ljava/lang/String;
    //   346: aastore
    //   347: dup
    //   348: iconst_1
    //   349: ldc '='
    //   351: aastore
    //   352: aastore
    //   353: dup
    //   354: iconst_2
    //   355: iconst_2
    //   356: anewarray java/lang/String
    //   359: dup
    //   360: iconst_0
    //   361: sipush #-30684
    //   364: sipush #-16506
    //   367: invokestatic a : (II)Ljava/lang/String;
    //   370: aastore
    //   371: dup
    //   372: iconst_1
    //   373: ldc '='
    //   375: aastore
    //   376: aastore
    //   377: dup
    //   378: iconst_3
    //   379: iconst_2
    //   380: anewarray java/lang/String
    //   383: dup
    //   384: iconst_0
    //   385: sipush #-30666
    //   388: sipush #-708
    //   391: invokestatic a : (II)Ljava/lang/String;
    //   394: aastore
    //   395: dup
    //   396: iconst_1
    //   397: ldc '='
    //   399: aastore
    //   400: aastore
    //   401: dup
    //   402: iconst_4
    //   403: iconst_2
    //   404: anewarray java/lang/String
    //   407: dup
    //   408: iconst_0
    //   409: sipush #-30661
    //   412: sipush #-11469
    //   415: invokestatic a : (II)Ljava/lang/String;
    //   418: aastore
    //   419: dup
    //   420: iconst_1
    //   421: ldc '='
    //   423: aastore
    //   424: aastore
    //   425: dup
    //   426: iconst_5
    //   427: iconst_2
    //   428: anewarray java/lang/String
    //   431: dup
    //   432: iconst_0
    //   433: sipush #-30660
    //   436: sipush #19738
    //   439: invokestatic a : (II)Ljava/lang/String;
    //   442: aastore
    //   443: dup
    //   444: iconst_1
    //   445: ldc '='
    //   447: aastore
    //   448: aastore
    //   449: dup
    //   450: bipush #6
    //   452: iconst_2
    //   453: anewarray java/lang/String
    //   456: dup
    //   457: iconst_0
    //   458: sipush #-30662
    //   461: sipush #25086
    //   464: invokestatic a : (II)Ljava/lang/String;
    //   467: aastore
    //   468: dup
    //   469: iconst_1
    //   470: ldc '='
    //   472: aastore
    //   473: aastore
    //   474: dup
    //   475: bipush #7
    //   477: iconst_2
    //   478: anewarray java/lang/String
    //   481: dup
    //   482: iconst_0
    //   483: sipush #-30686
    //   486: sipush #-8194
    //   489: invokestatic a : (II)Ljava/lang/String;
    //   492: aastore
    //   493: dup
    //   494: iconst_1
    //   495: ldc '('
    //   497: aastore
    //   498: aastore
    //   499: dup
    //   500: bipush #8
    //   502: iconst_2
    //   503: anewarray java/lang/String
    //   506: dup
    //   507: iconst_0
    //   508: sipush #-30681
    //   511: sipush #9639
    //   514: invokestatic a : (II)Ljava/lang/String;
    //   517: aastore
    //   518: dup
    //   519: iconst_1
    //   520: ldc '('
    //   522: aastore
    //   523: aastore
    //   524: dup
    //   525: bipush #9
    //   527: iconst_2
    //   528: anewarray java/lang/String
    //   531: dup
    //   532: iconst_0
    //   533: sipush #-30667
    //   536: sipush #-31487
    //   539: invokestatic a : (II)Ljava/lang/String;
    //   542: aastore
    //   543: dup
    //   544: iconst_1
    //   545: ldc '('
    //   547: aastore
    //   548: aastore
    //   549: dup
    //   550: bipush #10
    //   552: iconst_2
    //   553: anewarray java/lang/String
    //   556: dup
    //   557: iconst_0
    //   558: sipush #-30672
    //   561: sipush #1521
    //   564: invokestatic a : (II)Ljava/lang/String;
    //   567: aastore
    //   568: dup
    //   569: iconst_1
    //   570: ldc '('
    //   572: aastore
    //   573: aastore
    //   574: putstatic burp/Zgcr.ZB : [[Ljava/lang/String;
    //   577: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8820) & 0xFFFF;
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
      byte b1 = 119;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgcr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */