package com.fasterxml.Zs;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zm.Zee;
import com.fasterxml.Zo.Zf;
import com.fasterxml.Zo.Zt;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import java.io.IOException;

public class Zs extends Zt {
  private static final long serialVersionUID = 1L;
  
  private static final String[] i;
  
  private static final String[] j;
  
  protected Zs(Zt paramZt, Zee paramZee) {
    super((Zf)paramZt, paramZee);
  }
  
  public static Zs ZY(Zyg paramZyg, Zt paramZt) {
    return new Zs(paramZt, (Zee)null);
  }
  
  public Zyo<Object> Zv(Zee paramZee) {
    return (Zyo<Object>)((getClass() != Zs.class) ? this : new Zs(this, paramZee));
  }
  
  public Object ZJ(Zg paramZg, Zyg paramZyg) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield ZT : Lcom/fasterxml/Ze/Zc;
    //   8: ifnull -> 22
    //   11: aload_0
    //   12: aload_1
    //   13: aload_2
    //   14: invokevirtual ZZ : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   17: areturn
    //   18: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   21: athrow
    //   22: aload_0
    //   23: getfield Zo : Lcom/fasterxml/Zor/Zyo;
    //   26: ifnull -> 51
    //   29: aload_0
    //   30: getfield Zb : Lcom/fasterxml/Zo/Zzp;
    //   33: aload_2
    //   34: aload_0
    //   35: getfield Zo : Lcom/fasterxml/Zor/Zyo;
    //   38: aload_1
    //   39: aload_2
    //   40: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   43: invokevirtual Zu : (Lcom/fasterxml/Zor/Zyg;Ljava/lang/Object;)Ljava/lang/Object;
    //   46: areturn
    //   47: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   50: athrow
    //   51: aload_0
    //   52: getfield ZF : Lcom/fasterxml/Zor/Zk;
    //   55: invokevirtual ZV : ()Z
    //   58: ifeq -> 92
    //   61: aload_2
    //   62: aload_0
    //   63: invokevirtual ZX : ()Ljava/lang/Class;
    //   66: aload_0
    //   67: invokevirtual Zw : ()Lcom/fasterxml/Zo/Zzp;
    //   70: aload_1
    //   71: sipush #12144
    //   74: sipush #-15588
    //   77: invokestatic e : (II)Ljava/lang/String;
    //   80: iconst_0
    //   81: anewarray java/lang/Object
    //   84: invokevirtual ZV : (Ljava/lang/Class;Lcom/fasterxml/Zo/Zzp;Lcom/fasterxml/Zb/Zg;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   87: areturn
    //   88: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   91: athrow
    //   92: aload_0
    //   93: getfield Zb : Lcom/fasterxml/Zo/Zzp;
    //   96: invokevirtual Zp : ()Z
    //   99: istore #4
    //   101: aload_0
    //   102: getfield Zb : Lcom/fasterxml/Zo/Zzp;
    //   105: invokevirtual ZJ : ()Z
    //   108: istore #5
    //   110: iload #4
    //   112: ifne -> 158
    //   115: iload #5
    //   117: ifne -> 158
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   126: athrow
    //   127: aload_2
    //   128: aload_0
    //   129: invokevirtual ZX : ()Ljava/lang/Class;
    //   132: aload_0
    //   133: invokevirtual Zw : ()Lcom/fasterxml/Zo/Zzp;
    //   136: aload_1
    //   137: sipush #12148
    //   140: sipush #-11409
    //   143: invokestatic e : (II)Ljava/lang/String;
    //   146: iconst_0
    //   147: anewarray java/lang/Object
    //   150: invokevirtual ZV : (Ljava/lang/Class;Lcom/fasterxml/Zo/Zzp;Lcom/fasterxml/Zb/Zg;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   153: areturn
    //   154: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   157: athrow
    //   158: aconst_null
    //   159: astore #6
    //   161: aconst_null
    //   162: astore #7
    //   164: aconst_null
    //   165: astore #8
    //   167: iconst_0
    //   168: istore #9
    //   170: aload_1
    //   171: getstatic com/fasterxml/Zb/Zl.END_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   174: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   177: ifne -> 714
    //   180: aload_1
    //   181: invokevirtual ZS : ()Ljava/lang/String;
    //   184: astore #10
    //   186: aload_0
    //   187: getfield ZX : Lcom/fasterxml/Ze/Zo8;
    //   190: aload #10
    //   192: invokevirtual ZI : (Ljava/lang/String;)Lcom/fasterxml/Zo/Zv;
    //   195: astore #11
    //   197: aload_1
    //   198: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   201: pop
    //   202: aload #11
    //   204: ifnull -> 385
    //   207: sipush #12151
    //   210: sipush #29564
    //   213: invokestatic e : (II)Ljava/lang/String;
    //   216: aload #11
    //   218: invokevirtual ZT : ()Ljava/lang/String;
    //   221: invokevirtual equals : (Ljava/lang/Object;)Z
    //   224: ifeq -> 262
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   233: athrow
    //   234: aload_1
    //   235: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   238: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   241: ifeq -> 262
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   250: athrow
    //   251: aload_3
    //   252: ifnull -> 705
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   261: athrow
    //   262: aload #6
    //   264: ifnull -> 294
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   273: athrow
    //   274: aload #11
    //   276: aload_1
    //   277: aload_2
    //   278: aload #6
    //   280: invokevirtual ZP : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/Object;)V
    //   283: aload_3
    //   284: ifnull -> 705
    //   287: goto -> 294
    //   290: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   293: athrow
    //   294: aload #7
    //   296: ifnonnull -> 329
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   305: athrow
    //   306: aload_0
    //   307: getfield ZX : Lcom/fasterxml/Ze/Zo8;
    //   310: invokevirtual Zm : ()I
    //   313: istore #12
    //   315: iload #12
    //   317: iload #12
    //   319: iadd
    //   320: anewarray java/lang/Object
    //   323: astore #7
    //   325: aload_3
    //   326: ifnull -> 356
    //   329: iload #9
    //   331: aload #7
    //   333: arraylength
    //   334: if_icmpne -> 356
    //   337: goto -> 344
    //   340: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   343: athrow
    //   344: aload #7
    //   346: iload #9
    //   348: bipush #16
    //   350: iadd
    //   351: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   354: astore #7
    //   356: aload #7
    //   358: iload #9
    //   360: iinc #9, 1
    //   363: aload #11
    //   365: aastore
    //   366: aload #7
    //   368: iload #9
    //   370: iinc #9, 1
    //   373: aload #11
    //   375: aload_1
    //   376: aload_2
    //   377: invokevirtual Zt : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   380: aastore
    //   381: aload_3
    //   382: ifnull -> 705
    //   385: sipush #12150
    //   388: sipush #-31923
    //   391: invokestatic e : (II)Ljava/lang/String;
    //   394: aload #10
    //   396: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   399: ifeq -> 426
    //   402: goto -> 409
    //   405: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   408: athrow
    //   409: aload_0
    //   410: aload_2
    //   411: iload #4
    //   413: aload_1
    //   414: invokevirtual Zd : ()Ljava/lang/String;
    //   417: invokespecial ZV : (Lcom/fasterxml/Zor/Zyg;ZLjava/lang/String;)Ljava/lang/Throwable;
    //   420: astore #6
    //   422: aload_3
    //   423: ifnull -> 705
    //   426: aload_0
    //   427: getfield Zq : Ljava/util/Set;
    //   430: ifnull -> 477
    //   433: goto -> 440
    //   436: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   439: athrow
    //   440: aload_0
    //   441: getfield Zq : Ljava/util/Set;
    //   444: aload #10
    //   446: invokeinterface contains : (Ljava/lang/Object;)Z
    //   451: ifeq -> 477
    //   454: goto -> 461
    //   457: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   460: athrow
    //   461: aload_1
    //   462: invokevirtual Zc : ()Lcom/fasterxml/Zb/Zg;
    //   465: pop
    //   466: aload_3
    //   467: ifnull -> 705
    //   470: goto -> 477
    //   473: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   476: athrow
    //   477: sipush #12149
    //   480: sipush #18570
    //   483: invokestatic e : (II)Ljava/lang/String;
    //   486: aload #10
    //   488: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   491: ifeq -> 555
    //   494: goto -> 501
    //   497: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   500: athrow
    //   501: aload_1
    //   502: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   505: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   508: ifeq -> 524
    //   511: goto -> 518
    //   514: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   517: athrow
    //   518: aconst_null
    //   519: astore #8
    //   521: goto -> 705
    //   524: aload_2
    //   525: aload_2
    //   526: ldc [Ljava/lang/Throwable;
    //   528: invokevirtual ZW : (Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   531: invokevirtual ZP : (Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyo;
    //   534: astore #12
    //   536: aload #12
    //   538: aload_1
    //   539: aload_2
    //   540: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   543: checkcast [Ljava/lang/Throwable;
    //   546: checkcast [Ljava/lang/Throwable;
    //   549: astore #8
    //   551: aload_3
    //   552: ifnull -> 705
    //   555: sipush #12147
    //   558: sipush #-7708
    //   561: invokestatic e : (II)Ljava/lang/String;
    //   564: aload #10
    //   566: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   569: ifeq -> 595
    //   572: goto -> 579
    //   575: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   578: athrow
    //   579: aload_1
    //   580: invokevirtual Zc : ()Lcom/fasterxml/Zb/Zg;
    //   583: pop
    //   584: aload_3
    //   585: ifnull -> 705
    //   588: goto -> 595
    //   591: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   594: athrow
    //   595: aload_0
    //   596: getfield ZA : Lcom/fasterxml/Zo/Zl;
    //   599: ifnull -> 648
    //   602: goto -> 609
    //   605: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   608: athrow
    //   609: aload #6
    //   611: ifnonnull -> 631
    //   614: goto -> 621
    //   617: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   620: athrow
    //   621: aload_0
    //   622: aload_2
    //   623: iload #4
    //   625: aconst_null
    //   626: invokespecial ZV : (Lcom/fasterxml/Zor/Zyg;ZLjava/lang/String;)Ljava/lang/Throwable;
    //   629: astore #6
    //   631: aload_0
    //   632: getfield ZA : Lcom/fasterxml/Zo/Zl;
    //   635: aload_1
    //   636: aload_2
    //   637: aload #6
    //   639: aload #10
    //   641: invokevirtual ZU : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/Object;Ljava/lang/String;)V
    //   644: aload_3
    //   645: ifnull -> 705
    //   648: sipush #12146
    //   651: sipush #30488
    //   654: invokestatic e : (II)Ljava/lang/String;
    //   657: aload #10
    //   659: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   662: ifeq -> 688
    //   665: goto -> 672
    //   668: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   671: athrow
    //   672: aload_1
    //   673: invokevirtual Zc : ()Lcom/fasterxml/Zb/Zg;
    //   676: pop
    //   677: aload_3
    //   678: ifnull -> 705
    //   681: goto -> 688
    //   684: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   687: athrow
    //   688: aload_0
    //   689: aload_1
    //   690: aload_2
    //   691: aload #6
    //   693: aload #10
    //   695: invokevirtual Zb : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/Object;Ljava/lang/String;)V
    //   698: goto -> 705
    //   701: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   704: athrow
    //   705: aload_1
    //   706: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   709: pop
    //   710: aload_3
    //   711: ifnull -> 170
    //   714: aload #6
    //   716: ifnonnull -> 729
    //   719: aload_0
    //   720: aload_2
    //   721: iload #4
    //   723: aconst_null
    //   724: invokespecial ZV : (Lcom/fasterxml/Zor/Zyg;ZLjava/lang/String;)Ljava/lang/Throwable;
    //   727: astore #6
    //   729: aload #7
    //   731: ifnull -> 779
    //   734: iconst_0
    //   735: istore #10
    //   737: iload #9
    //   739: istore #11
    //   741: iload #10
    //   743: iload #11
    //   745: if_icmpge -> 779
    //   748: aload #7
    //   750: iload #10
    //   752: aaload
    //   753: checkcast com/fasterxml/Zo/Zv
    //   756: astore #12
    //   758: aload #12
    //   760: aload #6
    //   762: aload #7
    //   764: iload #10
    //   766: iconst_1
    //   767: iadd
    //   768: aaload
    //   769: invokevirtual Zj : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   772: iinc #10, 2
    //   775: aload_3
    //   776: ifnull -> 741
    //   779: aload #8
    //   781: ifnull -> 836
    //   784: aload #8
    //   786: astore #10
    //   788: aload #10
    //   790: arraylength
    //   791: istore #11
    //   793: iconst_0
    //   794: istore #12
    //   796: iload #12
    //   798: iload #11
    //   800: if_icmpge -> 836
    //   803: aload #10
    //   805: iload #12
    //   807: aaload
    //   808: astore #13
    //   810: aload #13
    //   812: ifnull -> 829
    //   815: aload #6
    //   817: aload #13
    //   819: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   822: goto -> 829
    //   825: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   828: athrow
    //   829: iinc #12, 1
    //   832: aload_3
    //   833: ifnull -> 796
    //   836: aload #6
    //   838: areturn
    // Exception table:
    //   from	to	target	type
    //   4	18	18	java/io/IOException
    //   22	47	47	java/io/IOException
    //   51	88	88	java/io/IOException
    //   110	120	123	java/io/IOException
    //   115	154	154	java/io/IOException
    //   197	227	230	java/io/IOException
    //   207	244	247	java/io/IOException
    //   234	255	258	java/io/IOException
    //   251	267	270	java/io/IOException
    //   262	287	290	java/io/IOException
    //   274	299	302	java/io/IOException
    //   325	337	340	java/io/IOException
    //   356	402	405	java/io/IOException
    //   422	433	436	java/io/IOException
    //   426	454	457	java/io/IOException
    //   440	470	473	java/io/IOException
    //   461	494	497	java/io/IOException
    //   477	511	514	java/io/IOException
    //   551	572	575	java/io/IOException
    //   555	588	591	java/io/IOException
    //   579	602	605	java/io/IOException
    //   595	614	617	java/io/IOException
    //   631	665	668	java/io/IOException
    //   648	681	684	java/io/IOException
    //   672	698	701	java/io/IOException
    //   810	822	825	java/io/IOException
  }
  
  private Throwable ZV(Zyg paramZyg, boolean paramBoolean, String paramString) throws IOException {
    try {
      if (paramBoolean) {
        try {
          if (paramString != null)
            return (Throwable)this.Zb.Zm(paramZyg, paramString); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return (Throwable)this.Zb.Zm(paramZyg, null);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (Throwable)this.Zb.Zy(paramZyg);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '<P©Ýa`²Õ,`$Jµ.Õø%3¬/®ÚYXÉ~L¤ÄSS.>ö¶>\\fè£!²6¨Ío²½Øií¬8ö¸KäÚiV&ïS»àð$CúZUK4Û z_P^`J,%\\nb¼Å³}]1ÂûrQ~'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #112
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
    //   68: ldc '2\\fÀÊ±?ªóÕd/4`ú6ñâ¡Ø^b\\t8[_'Ùø~DPo¾uWÞó6»äñ|ñ¸~»fr¯&b<Â'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #16
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #7
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
    //   129: putstatic com/fasterxml/Zs/Zs.i : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zs/Zs.j : [Ljava/lang/String;
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
    //   212: bipush #22
    //   214: goto -> 244
    //   217: bipush #40
    //   219: goto -> 244
    //   222: bipush #33
    //   224: goto -> 244
    //   227: bipush #22
    //   229: goto -> 244
    //   232: bipush #114
    //   234: goto -> 244
    //   237: bipush #98
    //   239: goto -> 244
    //   242: bipush #84
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
    //   300: return
  }
  
  private static String e(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2F76) & 0xFFFF;
    if (j[i] == null) {
      char[] arrayOfChar = i[i].toCharArray();
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
      byte b1 = 55;
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
      j[i] = (new String(arrayOfChar)).intern();
    } 
    return j[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */