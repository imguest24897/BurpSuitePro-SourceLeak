package burp;

import java.net.InetAddress;
import java.net.UnknownHostException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zsfr {
  private final int[][] Zs = new int[4][2];
  
  private final Zr1j Zv;
  
  public static boolean Zg(String paramString) {
    try {
      new Zsfr(paramString, null);
      return true;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return false;
    } 
  }
  
  public Zsfr(String paramString, Zr1j paramZr1j) {
    this.Zv = paramZr1j;
    ZO(paramString);
  }
  
  private void ZO(String paramString) {
    // Byte code:
    //   0: invokestatic ZD : ()I
    //   3: istore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: iconst_0
    //   7: istore #4
    //   9: iload_3
    //   10: aload_1
    //   11: invokevirtual length : ()I
    //   14: if_icmpge -> 662
    //   17: iload_3
    //   18: istore #5
    //   20: iload_3
    //   21: aload_1
    //   22: invokevirtual length : ()I
    //   25: if_icmpge -> 69
    //   28: aload_1
    //   29: iload_3
    //   30: invokevirtual charAt : (I)C
    //   33: bipush #48
    //   35: if_icmplt -> 69
    //   38: aload_1
    //   39: iload_3
    //   40: invokevirtual charAt : (I)C
    //   43: bipush #57
    //   45: if_icmpgt -> 69
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   54: athrow
    //   55: iinc #3, 1
    //   58: iload_2
    //   59: ifeq -> 20
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: aload_0
    //   70: getfield Zs : [[I
    //   73: iload #4
    //   75: aaload
    //   76: iconst_0
    //   77: aload_1
    //   78: iload #5
    //   80: iload_3
    //   81: invokevirtual substring : (II)Ljava/lang/String;
    //   84: invokestatic parseInt : (Ljava/lang/String;)I
    //   87: iastore
    //   88: aload_0
    //   89: getfield Zs : [[I
    //   92: iload #4
    //   94: aaload
    //   95: iconst_0
    //   96: iaload
    //   97: iflt -> 122
    //   100: aload_0
    //   101: getfield Zs : [[I
    //   104: iload #4
    //   106: aaload
    //   107: iconst_0
    //   108: iaload
    //   109: sipush #255
    //   112: if_icmple -> 134
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   121: athrow
    //   122: new java/lang/IllegalArgumentException
    //   125: dup
    //   126: invokespecial <init> : ()V
    //   129: athrow
    //   130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: iload_3
    //   135: aload_1
    //   136: invokevirtual length : ()I
    //   139: if_icmpge -> 307
    //   142: aload_1
    //   143: iload_3
    //   144: invokevirtual charAt : (I)C
    //   147: bipush #45
    //   149: if_icmpne -> 307
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   158: athrow
    //   159: iinc #3, 1
    //   162: iload_3
    //   163: istore #5
    //   165: iload_3
    //   166: aload_1
    //   167: invokevirtual length : ()I
    //   170: if_icmpge -> 214
    //   173: aload_1
    //   174: iload_3
    //   175: invokevirtual charAt : (I)C
    //   178: bipush #48
    //   180: if_icmplt -> 214
    //   183: aload_1
    //   184: iload_3
    //   185: invokevirtual charAt : (I)C
    //   188: bipush #57
    //   190: if_icmpgt -> 214
    //   193: goto -> 200
    //   196: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   199: athrow
    //   200: iinc #3, 1
    //   203: iload_2
    //   204: ifeq -> 165
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   213: athrow
    //   214: aload_0
    //   215: getfield Zs : [[I
    //   218: iload #4
    //   220: aaload
    //   221: iconst_1
    //   222: aload_1
    //   223: iload #5
    //   225: iload_3
    //   226: invokevirtual substring : (II)Ljava/lang/String;
    //   229: invokestatic parseInt : (Ljava/lang/String;)I
    //   232: iastore
    //   233: aload_0
    //   234: getfield Zs : [[I
    //   237: iload #4
    //   239: aaload
    //   240: iconst_1
    //   241: iaload
    //   242: iflt -> 295
    //   245: aload_0
    //   246: getfield Zs : [[I
    //   249: iload #4
    //   251: aaload
    //   252: iconst_1
    //   253: iaload
    //   254: sipush #255
    //   257: if_icmpgt -> 295
    //   260: goto -> 267
    //   263: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   266: athrow
    //   267: aload_0
    //   268: getfield Zs : [[I
    //   271: iload #4
    //   273: aaload
    //   274: iconst_1
    //   275: iaload
    //   276: aload_0
    //   277: getfield Zs : [[I
    //   280: iload #4
    //   282: aaload
    //   283: iconst_0
    //   284: iaload
    //   285: if_icmpgt -> 325
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   294: athrow
    //   295: new java/lang/IllegalArgumentException
    //   298: dup
    //   299: invokespecial <init> : ()V
    //   302: athrow
    //   303: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   306: athrow
    //   307: aload_0
    //   308: getfield Zs : [[I
    //   311: iload #4
    //   313: aaload
    //   314: iconst_1
    //   315: aload_0
    //   316: getfield Zs : [[I
    //   319: iload #4
    //   321: aaload
    //   322: iconst_0
    //   323: iaload
    //   324: iastore
    //   325: iload_3
    //   326: aload_1
    //   327: invokevirtual length : ()I
    //   330: if_icmpge -> 545
    //   333: iload #4
    //   335: iconst_3
    //   336: if_icmpne -> 545
    //   339: goto -> 346
    //   342: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   345: athrow
    //   346: aload_1
    //   347: iload_3
    //   348: invokevirtual charAt : (I)C
    //   351: bipush #47
    //   353: if_icmpne -> 545
    //   356: goto -> 363
    //   359: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   362: athrow
    //   363: aload_1
    //   364: iload_3
    //   365: iconst_1
    //   366: iadd
    //   367: invokevirtual substring : (I)Ljava/lang/String;
    //   370: invokestatic parseInt : (Ljava/lang/String;)I
    //   373: istore #6
    //   375: iload #6
    //   377: iflt -> 394
    //   380: iload #6
    //   382: bipush #32
    //   384: if_icmple -> 406
    //   387: goto -> 394
    //   390: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   393: athrow
    //   394: new java/lang/IllegalArgumentException
    //   397: dup
    //   398: invokespecial <init> : ()V
    //   401: athrow
    //   402: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   405: athrow
    //   406: iload #6
    //   408: bipush #8
    //   410: idiv
    //   411: istore #7
    //   413: iload #7
    //   415: iconst_4
    //   416: if_icmpne -> 426
    //   419: goto -> 662
    //   422: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   425: athrow
    //   426: iload #6
    //   428: bipush #8
    //   430: irem
    //   431: istore #6
    //   433: ldc2_w 2.0
    //   436: bipush #8
    //   438: iload #6
    //   440: isub
    //   441: i2d
    //   442: invokestatic pow : (DD)D
    //   445: d2i
    //   446: istore #6
    //   448: aload_0
    //   449: getfield Zs : [[I
    //   452: iload #7
    //   454: aaload
    //   455: iconst_0
    //   456: iload #6
    //   458: aload_0
    //   459: getfield Zs : [[I
    //   462: iload #7
    //   464: aaload
    //   465: iconst_0
    //   466: iaload
    //   467: iload #6
    //   469: idiv
    //   470: imul
    //   471: iastore
    //   472: aload_0
    //   473: getfield Zs : [[I
    //   476: iload #7
    //   478: aaload
    //   479: iconst_1
    //   480: iload #6
    //   482: iconst_1
    //   483: aload_0
    //   484: getfield Zs : [[I
    //   487: iload #7
    //   489: aaload
    //   490: iconst_1
    //   491: iaload
    //   492: iload #6
    //   494: idiv
    //   495: iadd
    //   496: imul
    //   497: iconst_1
    //   498: isub
    //   499: iastore
    //   500: iload #7
    //   502: iconst_1
    //   503: iadd
    //   504: istore #8
    //   506: iload #8
    //   508: iconst_4
    //   509: if_icmpge -> 541
    //   512: aload_0
    //   513: getfield Zs : [[I
    //   516: iload #8
    //   518: aaload
    //   519: iconst_0
    //   520: iconst_0
    //   521: iastore
    //   522: aload_0
    //   523: getfield Zs : [[I
    //   526: iload #8
    //   528: aaload
    //   529: iconst_1
    //   530: sipush #255
    //   533: iastore
    //   534: iinc #8, 1
    //   537: iload_2
    //   538: ifeq -> 506
    //   541: iload_2
    //   542: ifeq -> 662
    //   545: iload_3
    //   546: aload_1
    //   547: invokevirtual length : ()I
    //   550: iconst_1
    //   551: isub
    //   552: if_icmplt -> 575
    //   555: goto -> 562
    //   558: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   561: athrow
    //   562: iload #4
    //   564: iconst_3
    //   565: if_icmpne -> 603
    //   568: goto -> 575
    //   571: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   574: athrow
    //   575: iload #4
    //   577: iconst_3
    //   578: if_icmpne -> 615
    //   581: goto -> 588
    //   584: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   587: athrow
    //   588: iload_3
    //   589: aload_1
    //   590: invokevirtual length : ()I
    //   593: if_icmpeq -> 615
    //   596: goto -> 603
    //   599: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   602: athrow
    //   603: new java/lang/IllegalArgumentException
    //   606: dup
    //   607: invokespecial <init> : ()V
    //   610: athrow
    //   611: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   614: athrow
    //   615: iload_3
    //   616: aload_1
    //   617: invokevirtual length : ()I
    //   620: if_icmpge -> 652
    //   623: aload_1
    //   624: iload_3
    //   625: invokevirtual charAt : (I)C
    //   628: bipush #46
    //   630: if_icmpeq -> 652
    //   633: goto -> 640
    //   636: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   639: athrow
    //   640: new java/lang/IllegalArgumentException
    //   643: dup
    //   644: invokespecial <init> : ()V
    //   647: athrow
    //   648: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   651: athrow
    //   652: iinc #3, 1
    //   655: iinc #4, 1
    //   658: iload_2
    //   659: ifeq -> 9
    //   662: goto -> 681
    //   665: astore_3
    //   666: aload_3
    //   667: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   670: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   673: new java/lang/IllegalArgumentException
    //   676: dup
    //   677: invokespecial <init> : ()V
    //   680: athrow
    //   681: return
    // Exception table:
    //   from	to	target	type
    //   4	662	665	java/lang/NumberFormatException
    //   28	48	51	java/lang/NumberFormatException
    //   38	62	65	java/lang/NumberFormatException
    //   69	115	118	java/lang/NumberFormatException
    //   100	130	130	java/lang/NumberFormatException
    //   134	152	155	java/lang/NumberFormatException
    //   173	193	196	java/lang/NumberFormatException
    //   183	207	210	java/lang/NumberFormatException
    //   214	260	263	java/lang/NumberFormatException
    //   245	288	291	java/lang/NumberFormatException
    //   267	303	303	java/lang/NumberFormatException
    //   325	339	342	java/lang/NumberFormatException
    //   333	356	359	java/lang/NumberFormatException
    //   375	387	390	java/lang/NumberFormatException
    //   380	402	402	java/lang/NumberFormatException
    //   413	422	422	java/lang/NumberFormatException
    //   541	555	558	java/lang/NumberFormatException
    //   545	568	571	java/lang/NumberFormatException
    //   562	581	584	java/lang/NumberFormatException
    //   575	596	599	java/lang/NumberFormatException
    //   588	611	611	java/lang/NumberFormatException
    //   615	633	636	java/lang/NumberFormatException
    //   623	648	648	java/lang/NumberFormatException
  }
  
  public boolean ZA(String paramString) {
    try {
      if (this.Zv == null) {
        Zuh.Zb(false, Zqf.Zr);
        return false;
      } 
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    try {
      return ZS(this.Zv.Zt(paramString));
    } catch (UnknownHostException unknownHostException) {
      Zah.Zl(unknownHostException, Zk_.COMMON_RUNTIME_FAILURE);
      return false;
    } 
  }
  
  public boolean ZS(InetAddress paramInetAddress) {
    int i = Zkh7.ZP();
    try {
      if (paramInetAddress == null)
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte[] arrayOfByte = paramInetAddress.getAddress();
    byte b = 0;
    while (b < 4) {
      byte b1 = arrayOfByte[b];
      try {
        if (b1 < 0)
          b1 += 256; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        if (b1 >= this.Zs[b][0])
          try {
            if (b1 <= this.Zs[b][1]) {
              b++;
              if (i == 0)
                break; 
              continue;
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
    return true;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsfr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */