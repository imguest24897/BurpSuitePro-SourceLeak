package burp;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.DocumentEvent;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zmzn {
  protected List<Zbjz> Zh = new ArrayList<>();
  
  private static String ZC;
  
  public void ZQ(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZB : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_0
    //   5: iload_1
    //   6: invokevirtual Zw : (I)Ljava/util/List;
    //   9: astore #4
    //   11: aload #4
    //   13: invokeinterface iterator : ()Ljava/util/Iterator;
    //   18: astore #5
    //   20: aload #5
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 86
    //   30: aload #5
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast burp/Zbjz
    //   40: astore #6
    //   42: aload #6
    //   44: invokevirtual startOffset : ()I
    //   47: iload_1
    //   48: if_icmplt -> 70
    //   51: aload #6
    //   53: aload #6
    //   55: invokevirtual startOffset : ()I
    //   58: iload_2
    //   59: iadd
    //   60: invokevirtual Zz : (I)V
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: aload #6
    //   72: aload #6
    //   74: invokevirtual endOffset : ()I
    //   77: iload_2
    //   78: iadd
    //   79: invokevirtual ZO : (I)V
    //   82: aload_3
    //   83: ifnonnull -> 20
    //   86: iconst_0
    //   87: istore #5
    //   89: iload_1
    //   90: iload_2
    //   91: iadd
    //   92: istore #6
    //   94: iload_1
    //   95: istore #7
    //   97: iload #7
    //   99: iload #6
    //   101: if_icmpge -> 140
    //   104: aload_0
    //   105: invokevirtual Ze : ()Ljava/lang/String;
    //   108: iload #7
    //   110: invokevirtual charAt : (I)C
    //   113: sipush #167
    //   116: if_icmpne -> 126
    //   119: iconst_1
    //   120: istore #5
    //   122: aload_3
    //   123: ifnonnull -> 140
    //   126: iinc #7, 1
    //   129: aload_3
    //   130: ifnonnull -> 97
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: iload #5
    //   142: ifeq -> 521
    //   145: aload_0
    //   146: iload_1
    //   147: aload_0
    //   148: invokevirtual Ze : ()Ljava/lang/String;
    //   151: invokevirtual ZV : (ILjava/lang/String;)Lburp/Zbjz;
    //   154: astore #7
    //   156: aload #7
    //   158: ifnull -> 177
    //   161: aload #7
    //   163: invokevirtual startOffset : ()I
    //   166: iload_1
    //   167: if_icmplt -> 185
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   176: athrow
    //   177: iconst_1
    //   178: goto -> 186
    //   181: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   184: athrow
    //   185: iconst_0
    //   186: istore #8
    //   188: iload_1
    //   189: istore #9
    //   191: iload #9
    //   193: iload #6
    //   195: if_icmpge -> 470
    //   198: aload_0
    //   199: invokevirtual Ze : ()Ljava/lang/String;
    //   202: iload #9
    //   204: invokevirtual charAt : (I)C
    //   207: sipush #167
    //   210: if_icmpne -> 463
    //   213: aload #7
    //   215: ifnonnull -> 269
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   224: athrow
    //   225: aload_0
    //   226: iload #9
    //   228: aload_0
    //   229: invokevirtual Ze : ()Ljava/lang/String;
    //   232: invokevirtual ZV : (ILjava/lang/String;)Lburp/Zbjz;
    //   235: astore #7
    //   237: aload #7
    //   239: ifnonnull -> 269
    //   242: new burp/Zbjz
    //   245: dup
    //   246: iconst_m1
    //   247: iconst_m1
    //   248: invokespecial <init> : (II)V
    //   251: astore #10
    //   253: aload_0
    //   254: getfield Zh : Ljava/util/List;
    //   257: aload #10
    //   259: invokeinterface add : (Ljava/lang/Object;)Z
    //   264: pop
    //   265: aload #10
    //   267: astore #7
    //   269: iload #8
    //   271: ifeq -> 345
    //   274: aload #7
    //   276: invokevirtual startOffset : ()I
    //   279: iconst_m1
    //   280: if_icmpeq -> 331
    //   283: goto -> 290
    //   286: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   289: athrow
    //   290: new burp/Zbjz
    //   293: dup
    //   294: iconst_m1
    //   295: iconst_m1
    //   296: invokespecial <init> : (II)V
    //   299: astore #10
    //   301: aload_0
    //   302: getfield Zh : Ljava/util/List;
    //   305: aload #7
    //   307: invokeinterface indexOf : (Ljava/lang/Object;)I
    //   312: istore #11
    //   314: aload_0
    //   315: getfield Zh : Ljava/util/List;
    //   318: iload #11
    //   320: aload #10
    //   322: invokeinterface add : (ILjava/lang/Object;)V
    //   327: aload #10
    //   329: astore #7
    //   331: aload #7
    //   333: iload #9
    //   335: invokevirtual Zz : (I)V
    //   338: iconst_0
    //   339: istore #8
    //   341: aload_3
    //   342: ifnonnull -> 463
    //   345: aload_0
    //   346: getfield Zh : Ljava/util/List;
    //   349: aload #7
    //   351: invokeinterface indexOf : (Ljava/lang/Object;)I
    //   356: iconst_1
    //   357: iadd
    //   358: istore #10
    //   360: aload #7
    //   362: invokevirtual endOffset : ()I
    //   365: iload_1
    //   366: if_icmpeq -> 413
    //   369: aload #7
    //   371: invokevirtual endOffset : ()I
    //   374: iconst_m1
    //   375: if_icmpeq -> 413
    //   378: goto -> 385
    //   381: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   384: athrow
    //   385: new burp/Zbjz
    //   388: dup
    //   389: iconst_m1
    //   390: aload #7
    //   392: invokevirtual endOffset : ()I
    //   395: invokespecial <init> : (II)V
    //   398: astore #11
    //   400: aload_0
    //   401: getfield Zh : Ljava/util/List;
    //   404: iload #10
    //   406: aload #11
    //   408: invokeinterface add : (ILjava/lang/Object;)V
    //   413: aload #7
    //   415: iload #9
    //   417: iconst_1
    //   418: iadd
    //   419: invokevirtual ZO : (I)V
    //   422: iconst_1
    //   423: istore #8
    //   425: iload #10
    //   427: aload_0
    //   428: getfield Zh : Ljava/util/List;
    //   431: invokeinterface size : ()I
    //   436: if_icmpge -> 460
    //   439: aload_0
    //   440: getfield Zh : Ljava/util/List;
    //   443: iload #10
    //   445: invokeinterface get : (I)Ljava/lang/Object;
    //   450: checkcast burp/Zbjz
    //   453: goto -> 461
    //   456: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   459: athrow
    //   460: aconst_null
    //   461: astore #7
    //   463: iinc #9, 1
    //   466: aload_3
    //   467: ifnonnull -> 191
    //   470: aload #7
    //   472: ifnull -> 518
    //   475: aload #7
    //   477: invokevirtual startOffset : ()I
    //   480: iconst_m1
    //   481: if_icmpeq -> 507
    //   484: goto -> 491
    //   487: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   490: athrow
    //   491: aload #7
    //   493: invokevirtual endOffset : ()I
    //   496: iconst_m1
    //   497: if_icmpne -> 518
    //   500: goto -> 507
    //   503: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   506: athrow
    //   507: aload_0
    //   508: invokevirtual ZO : ()V
    //   511: goto -> 518
    //   514: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   517: athrow
    //   518: goto -> 660
    //   521: iload_1
    //   522: iload_2
    //   523: iadd
    //   524: aload_0
    //   525: invokevirtual Zn : ()I
    //   528: if_icmpne -> 660
    //   531: aload_0
    //   532: getfield Zh : Ljava/util/List;
    //   535: invokeinterface isEmpty : ()Z
    //   540: ifeq -> 558
    //   543: goto -> 550
    //   546: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   549: athrow
    //   550: aconst_null
    //   551: goto -> 581
    //   554: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   557: athrow
    //   558: aload_0
    //   559: getfield Zh : Ljava/util/List;
    //   562: aload_0
    //   563: getfield Zh : Ljava/util/List;
    //   566: invokeinterface size : ()I
    //   571: iconst_1
    //   572: isub
    //   573: invokeinterface get : (I)Ljava/lang/Object;
    //   578: checkcast burp/Zbjz
    //   581: astore #7
    //   583: aload #7
    //   585: ifnull -> 660
    //   588: aload #7
    //   590: invokevirtual endOffset : ()I
    //   593: iload_1
    //   594: if_icmpne -> 660
    //   597: goto -> 604
    //   600: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   603: athrow
    //   604: aload_0
    //   605: invokevirtual Ze : ()Ljava/lang/String;
    //   608: iload_1
    //   609: iconst_1
    //   610: isub
    //   611: invokevirtual charAt : (I)C
    //   614: sipush #167
    //   617: if_icmpne -> 645
    //   620: goto -> 627
    //   623: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   626: athrow
    //   627: aload #7
    //   629: invokevirtual startOffset : ()I
    //   632: iload_1
    //   633: iconst_1
    //   634: isub
    //   635: if_icmpne -> 660
    //   638: goto -> 645
    //   641: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   644: athrow
    //   645: aload #7
    //   647: iload_1
    //   648: iload_2
    //   649: iadd
    //   650: invokevirtual ZO : (I)V
    //   653: goto -> 660
    //   656: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   659: athrow
    //   660: goto -> 673
    //   663: astore #4
    //   665: aload #4
    //   667: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   670: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   673: aload_0
    //   674: invokevirtual ZJ : ()V
    //   677: return
    // Exception table:
    //   from	to	target	type
    //   4	660	663	java/lang/Exception
    //   42	63	66	java/lang/Exception
    //   122	133	136	java/lang/Exception
    //   156	170	173	java/lang/Exception
    //   161	181	181	java/lang/Exception
    //   198	218	221	java/lang/Exception
    //   269	283	286	java/lang/Exception
    //   360	378	381	java/lang/Exception
    //   425	456	456	java/lang/Exception
    //   470	484	487	java/lang/Exception
    //   475	500	503	java/lang/Exception
    //   491	511	514	java/lang/Exception
    //   521	543	546	java/lang/Exception
    //   531	554	554	java/lang/Exception
    //   583	597	600	java/lang/Exception
    //   588	620	623	java/lang/Exception
    //   604	638	641	java/lang/Exception
    //   627	653	656	java/lang/Exception
  }
  
  public void ZN(DocumentEvent paramDocumentEvent) {
    // Byte code:
    //   0: invokestatic ZB : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokeinterface getOffset : ()I
    //   10: istore_3
    //   11: aload_1
    //   12: invokeinterface getLength : ()I
    //   17: istore #4
    //   19: iconst_0
    //   20: istore #5
    //   22: aload_0
    //   23: iload_3
    //   24: invokevirtual Zw : (I)Ljava/util/List;
    //   27: astore #6
    //   29: aconst_null
    //   30: astore #7
    //   32: aload #6
    //   34: invokeinterface iterator : ()Ljava/util/Iterator;
    //   39: astore #8
    //   41: aload #8
    //   43: invokeinterface hasNext : ()Z
    //   48: ifeq -> 369
    //   51: aload #8
    //   53: invokeinterface next : ()Ljava/lang/Object;
    //   58: checkcast burp/Zbjz
    //   61: astore #9
    //   63: aload #9
    //   65: invokevirtual startOffset : ()I
    //   68: iload_3
    //   69: if_icmplt -> 271
    //   72: aload #9
    //   74: invokevirtual startOffset : ()I
    //   77: iload_3
    //   78: iload #4
    //   80: iadd
    //   81: if_icmpge -> 234
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   90: athrow
    //   91: aload #9
    //   93: invokevirtual endOffset : ()I
    //   96: iload_3
    //   97: iload #4
    //   99: iadd
    //   100: if_icmpgt -> 129
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: aload_0
    //   111: getfield Zh : Ljava/util/List;
    //   114: aload #9
    //   116: invokeinterface remove : (Ljava/lang/Object;)Z
    //   121: pop
    //   122: iconst_1
    //   123: istore #5
    //   125: aload_2
    //   126: ifnonnull -> 365
    //   129: aload #7
    //   131: ifnonnull -> 168
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: aload #9
    //   143: astore #7
    //   145: aload #7
    //   147: iconst_m1
    //   148: invokevirtual Zz : (I)V
    //   151: aload #7
    //   153: aload #7
    //   155: invokevirtual endOffset : ()I
    //   158: iload #4
    //   160: isub
    //   161: invokevirtual ZO : (I)V
    //   164: aload_2
    //   165: ifnonnull -> 227
    //   168: aload #7
    //   170: invokevirtual endOffset : ()I
    //   173: iconst_m1
    //   174: if_icmpne -> 192
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   183: athrow
    //   184: iconst_1
    //   185: goto -> 193
    //   188: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   191: athrow
    //   192: iconst_0
    //   193: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   196: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   199: aload #7
    //   201: aload #9
    //   203: invokevirtual endOffset : ()I
    //   206: iload #4
    //   208: isub
    //   209: invokevirtual ZO : (I)V
    //   212: aload_0
    //   213: getfield Zh : Ljava/util/List;
    //   216: aload #9
    //   218: invokeinterface remove : (Ljava/lang/Object;)Z
    //   223: pop
    //   224: aconst_null
    //   225: astore #7
    //   227: iconst_1
    //   228: istore #5
    //   230: aload_2
    //   231: ifnonnull -> 365
    //   234: aload #9
    //   236: aload #9
    //   238: invokevirtual startOffset : ()I
    //   241: iload #4
    //   243: isub
    //   244: invokevirtual Zz : (I)V
    //   247: aload #9
    //   249: aload #9
    //   251: invokevirtual endOffset : ()I
    //   254: iload #4
    //   256: isub
    //   257: invokevirtual ZO : (I)V
    //   260: aload_2
    //   261: ifnonnull -> 365
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   270: athrow
    //   271: iload_3
    //   272: iload #4
    //   274: iadd
    //   275: aload #9
    //   277: invokevirtual endOffset : ()I
    //   280: if_icmpge -> 314
    //   283: goto -> 290
    //   286: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   289: athrow
    //   290: aload #9
    //   292: aload #9
    //   294: invokevirtual endOffset : ()I
    //   297: iload #4
    //   299: isub
    //   300: invokevirtual ZO : (I)V
    //   303: aload_2
    //   304: ifnonnull -> 365
    //   307: goto -> 314
    //   310: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   313: athrow
    //   314: aload #7
    //   316: ifnonnull -> 334
    //   319: goto -> 326
    //   322: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   325: athrow
    //   326: iconst_1
    //   327: goto -> 335
    //   330: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   333: athrow
    //   334: iconst_0
    //   335: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   338: iload_3
    //   339: i2l
    //   340: iload #4
    //   342: i2l
    //   343: aload #9
    //   345: invokevirtual endOffset : ()I
    //   348: i2l
    //   349: invokestatic Zi : (ZLnet/portswigger/Zqf;JJJ)V
    //   352: aload #9
    //   354: astore #7
    //   356: aload #7
    //   358: iconst_m1
    //   359: invokevirtual ZO : (I)V
    //   362: iconst_1
    //   363: istore #5
    //   365: aload_2
    //   366: ifnonnull -> 41
    //   369: aload #7
    //   371: ifnull -> 393
    //   374: iload #5
    //   376: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   379: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   382: aload_0
    //   383: invokevirtual ZO : ()V
    //   386: goto -> 393
    //   389: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   392: athrow
    //   393: aload_0
    //   394: invokevirtual ZJ : ()V
    //   397: goto -> 408
    //   400: astore_3
    //   401: aload_3
    //   402: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   405: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   408: return
    // Exception table:
    //   from	to	target	type
    //   4	397	400	java/lang/Exception
    //   63	84	87	java/lang/Exception
    //   72	103	106	java/lang/Exception
    //   125	134	137	java/lang/Exception
    //   145	177	180	java/lang/Exception
    //   168	188	188	java/lang/Exception
    //   230	264	267	java/lang/Exception
    //   234	283	286	java/lang/Exception
    //   271	307	310	java/lang/Exception
    //   290	319	322	java/lang/Exception
    //   314	330	330	java/lang/Exception
    //   369	386	389	java/lang/Exception
  }
  
  private List<Zbjz> Zw(int paramInt) {
    return ZI().stream().filter(paramInt::lambda$getAffectedHighlights$0).toList();
  }
  
  public void Zh() {
    // Byte code:
    //   0: invokestatic ZB : ()Ljava/lang/String;
    //   3: astore_1
    //   4: iconst_m1
    //   5: istore_3
    //   6: aload_0
    //   7: invokevirtual Ze : ()Ljava/lang/String;
    //   10: astore #4
    //   12: aload_0
    //   13: new java/util/ArrayList
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: putfield Zh : Ljava/util/List;
    //   23: aload #4
    //   25: sipush #167
    //   28: iload_3
    //   29: iconst_1
    //   30: iadd
    //   31: invokevirtual indexOf : (II)I
    //   34: istore_2
    //   35: iload_2
    //   36: iconst_m1
    //   37: if_icmpeq -> 115
    //   40: aload #4
    //   42: sipush #167
    //   45: iload_2
    //   46: iconst_1
    //   47: iadd
    //   48: invokevirtual indexOf : (II)I
    //   51: istore_3
    //   52: iload_3
    //   53: iconst_m1
    //   54: if_icmpeq -> 89
    //   57: aload_0
    //   58: getfield Zh : Ljava/util/List;
    //   61: new burp/Zbjz
    //   64: dup
    //   65: iload_2
    //   66: iload_3
    //   67: iconst_1
    //   68: iadd
    //   69: invokespecial <init> : (II)V
    //   72: invokeinterface add : (Ljava/lang/Object;)Z
    //   77: pop
    //   78: aload_1
    //   79: ifnonnull -> 23
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: aload_0
    //   90: getfield Zh : Ljava/util/List;
    //   93: new burp/Zbjz
    //   96: dup
    //   97: iload_2
    //   98: aload #4
    //   100: invokevirtual length : ()I
    //   103: invokespecial <init> : (II)V
    //   106: invokeinterface add : (Ljava/lang/Object;)Z
    //   111: pop
    //   112: goto -> 115
    //   115: goto -> 128
    //   118: astore #4
    //   120: aload #4
    //   122: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   125: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   128: aload_0
    //   129: invokevirtual ZJ : ()V
    //   132: return
    // Exception table:
    //   from	to	target	type
    //   6	115	118	java/lang/Exception
    //   52	82	85	java/lang/Exception
  }
  
  public void ZU() {
    this.Zh.clear();
    ZJ();
  }
  
  public int ZF() {
    return this.Zh.size();
  }
  
  private void ZO() {
    int i = Zn();
    List<Zbjz> list = this.Zh.stream().filter(Zmzn::lambda$fixUnmatchedMarkers$1).toList();
    Zbjz zbjz = list.get(0);
    String str = ZB();
    Zuh.Zb((zbjz.startOffset() == -1 || zbjz.endOffset() == -1), Zqf.Zr);
    if (zbjz.startOffset() == -1) {
      if (zbjz.endOffset() == i && Ze().charAt(i - 1) != '§') {
        this.Zh.remove(zbjz);
        return;
      } 
      zbjz.Zz(zbjz.endOffset() - 1);
    } 
    while (true) {
      if (this.Zh.indexOf(zbjz) == this.Zh.size() - 1) {
        if (zbjz.startOffset() == i && this.Zh.indexOf(zbjz) != 0)
          this.Zh.remove(zbjz); 
        zbjz.ZO(i);
        return;
      } 
      zbjz.ZO(((Zbjz)this.Zh.get(this.Zh.indexOf(zbjz) + 1)).startOffset() + 1);
      zbjz = this.Zh.get(this.Zh.indexOf(zbjz) + 1);
      if (zbjz.endOffset() == i && !Zs(zbjz)) {
        zbjz.Zz(zbjz.endOffset());
        if (str == null)
          continue; 
        continue;
      } 
      continue;
      zbjz.Zz(zbjz.endOffset() - 1);
    } 
  }
  
  private boolean Zs(Zbjz paramZbjz) {
    boolean bool1 = (Ze().charAt(Zn() - 1) == '§') ? true : false;
    boolean bool2 = (this.Zh.indexOf(paramZbjz) == 0) ? true : false;
    return (bool1 && (bool2 || ((Zbjz)this.Zh.get(this.Zh.indexOf(paramZbjz) - 1)).endOffset() <= Zn() - 1));
  }
  
  private Zbjz ZV(int paramInt, String paramString) {
    String str = ZB();
    for (Zbjz zbjz : this.Zh) {
      if (zbjz.endOffset() > paramInt)
        return zbjz; 
      if (zbjz.endOffset() == paramInt && (paramString.charAt(paramInt - 1) != '§' || zbjz.startOffset() == paramInt - 1))
        return zbjz; 
      if (str == null)
        break; 
    } 
    return null;
  }
  
  protected abstract String Ze();
  
  protected abstract int Zn();
  
  protected abstract List<Zbjz> ZI();
  
  protected abstract void ZJ();
  
  private static boolean lambda$fixUnmatchedMarkers$1(Zbjz paramZbjz) {
    return (paramZbjz.startOffset() == -1 || paramZbjz.endOffset() == -1);
  }
  
  private static boolean lambda$getAffectedHighlights$0(int paramInt, Zbjz paramZbjz) {
    return (paramZbjz.endOffset() > paramInt);
  }
  
  public static void ZO(String paramString) {
    ZC = paramString;
  }
  
  public static String ZB() {
    return ZC;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    if (ZB() == null)
      ZO("oy18Lc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmzn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */