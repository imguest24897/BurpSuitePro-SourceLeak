package net.portswigger;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;
import java.util.Optional;

class Ztd implements Runnable {
  private final Socket Zq;
  
  private final Zay Zf;
  
  final Zgn Ze;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Ztd(Zgn paramZgn, Socket paramSocket, Zay paramZay) {
    this.Zq = paramSocket;
    this.Zf = paramZay;
  }
  
  public void run() {
    // Byte code:
    //   0: invokestatic ZK : ()Ljava/lang/String;
    //   3: iconst_1
    //   4: istore_2
    //   5: new net/portswigger/Zrxj
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore_3
    //   13: astore_1
    //   14: aload_0
    //   15: getfield Ze : Lnet/portswigger/Zgn;
    //   18: getfield Za : Lnet/portswigger/Zvk;
    //   21: aload_3
    //   22: invokeinterface ZU : (Lnet/portswigger/Zrxj;)V
    //   27: aload_0
    //   28: getfield Zq : Ljava/net/Socket;
    //   31: invokevirtual getOutputStream : ()Ljava/io/OutputStream;
    //   34: astore #4
    //   36: new java/io/BufferedInputStream
    //   39: dup
    //   40: aload_0
    //   41: getfield Zq : Ljava/net/Socket;
    //   44: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   47: invokespecial <init> : (Ljava/io/InputStream;)V
    //   50: astore #5
    //   52: aload_0
    //   53: <illegal opcode> run : (Lnet/portswigger/Ztd;)Ljava/lang/Runnable;
    //   58: astore #6
    //   60: aload_0
    //   61: <illegal opcode> run : (Lnet/portswigger/Ztd;)Ljava/lang/Runnable;
    //   66: astore #7
    //   68: aload_0
    //   69: getfield Ze : Lnet/portswigger/Zgn;
    //   72: getfield ZP : Lnet/portswigger/Zow;
    //   75: aload_0
    //   76: getfield Zq : Ljava/net/Socket;
    //   79: invokevirtual getRemoteSocketAddress : ()Ljava/net/SocketAddress;
    //   82: aload_0
    //   83: getfield Zq : Ljava/net/Socket;
    //   86: invokevirtual getLocalSocketAddress : ()Ljava/net/SocketAddress;
    //   89: aload #5
    //   91: invokeinterface Zo : (Ljava/net/SocketAddress;Ljava/net/SocketAddress;Ljava/io/InputStream;)Lnet/portswigger/Zto;
    //   96: astore #8
    //   98: aload_0
    //   99: getfield Zf : Lnet/portswigger/Zay;
    //   102: aload #8
    //   104: getfield Zo : Ljava/lang/Object;
    //   107: checkcast net/portswigger/Zgk
    //   110: aload #5
    //   112: aload_0
    //   113: getfield Zq : Ljava/net/Socket;
    //   116: aload_3
    //   117: invokeinterface Ze : (Lnet/portswigger/Zgk;Ljava/io/InputStream;Ljava/net/Socket;Lnet/portswigger/Zrxj;)Lnet/portswigger/Zd7;
    //   122: astore #9
    //   124: aload #9
    //   126: invokevirtual ordinal : ()I
    //   129: lookupswitch default -> 240, 0 -> 156, 1 -> 167
    //   156: aload_1
    //   157: ifnull -> 270
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   166: athrow
    //   167: iconst_0
    //   168: istore_2
    //   169: iload_2
    //   170: ifeq -> 239
    //   173: aload_0
    //   174: getfield Ze : Lnet/portswigger/Zgn;
    //   177: getfield Za : Lnet/portswigger/Zvk;
    //   180: aload_3
    //   181: invokeinterface Zg : (Lnet/portswigger/Zrxj;)V
    //   186: goto -> 196
    //   189: astore #10
    //   191: aload #10
    //   193: invokevirtual printStackTrace : ()V
    //   196: aload_0
    //   197: getfield Zq : Ljava/net/Socket;
    //   200: invokevirtual isClosed : ()Z
    //   203: ifne -> 239
    //   206: aload_0
    //   207: getfield Zq : Ljava/net/Socket;
    //   210: invokevirtual close : ()V
    //   213: goto -> 239
    //   216: astore #10
    //   218: aload #10
    //   220: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   223: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   226: goto -> 239
    //   229: astore #10
    //   231: aload #10
    //   233: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   236: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   239: return
    //   240: new java/lang/IllegalStateException
    //   243: dup
    //   244: aload_0
    //   245: getfield Zf : Lnet/portswigger/Zay;
    //   248: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   251: sipush #-18197
    //   254: sipush #-16728
    //   257: invokestatic a : (II)Ljava/lang/String;
    //   260: swap
    //   261: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   266: invokespecial <init> : (Ljava/lang/String;)V
    //   269: athrow
    //   270: aload_0
    //   271: getfield Ze : Lnet/portswigger/Zgn;
    //   274: getfield Zv : Lnet/portswigger/Zc4;
    //   277: aload #5
    //   279: invokevirtual ZU : (Ljava/io/InputStream;)Lnet/portswigger/Zrmy;
    //   282: astore #10
    //   284: aload #10
    //   286: aload #7
    //   288: aload #6
    //   290: invokevirtual ZL : (Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    //   293: aload #10
    //   295: invokevirtual ZL : ()Lnet/portswigger/Zc9;
    //   298: astore #11
    //   300: aload #11
    //   302: ifnonnull -> 376
    //   305: iload_2
    //   306: ifeq -> 375
    //   309: aload_0
    //   310: getfield Ze : Lnet/portswigger/Zgn;
    //   313: getfield Za : Lnet/portswigger/Zvk;
    //   316: aload_3
    //   317: invokeinterface Zg : (Lnet/portswigger/Zrxj;)V
    //   322: goto -> 332
    //   325: astore #12
    //   327: aload #12
    //   329: invokevirtual printStackTrace : ()V
    //   332: aload_0
    //   333: getfield Zq : Ljava/net/Socket;
    //   336: invokevirtual isClosed : ()Z
    //   339: ifne -> 375
    //   342: aload_0
    //   343: getfield Zq : Ljava/net/Socket;
    //   346: invokevirtual close : ()V
    //   349: goto -> 375
    //   352: astore #12
    //   354: aload #12
    //   356: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   359: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   362: goto -> 375
    //   365: astore #12
    //   367: aload #12
    //   369: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   372: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   375: return
    //   376: aload #10
    //   378: invokevirtual ZY : ()V
    //   381: aload #10
    //   383: invokevirtual Zt : ()Lnet/portswigger/Zvw;
    //   386: astore #12
    //   388: aload_0
    //   389: getfield Ze : Lnet/portswigger/Zgn;
    //   392: aload #12
    //   394: invokevirtual ZK : (Lnet/portswigger/Zvw;)Z
    //   397: ifne -> 485
    //   400: aload #4
    //   402: invokestatic Zb : ()Lnet/portswigger/Zu0;
    //   405: invokevirtual Zt : ()Lnet/portswigger/Zu0;
    //   408: invokevirtual ZW : ()[B
    //   411: invokevirtual write : ([B)V
    //   414: iload_2
    //   415: ifeq -> 484
    //   418: aload_0
    //   419: getfield Ze : Lnet/portswigger/Zgn;
    //   422: getfield Za : Lnet/portswigger/Zvk;
    //   425: aload_3
    //   426: invokeinterface Zg : (Lnet/portswigger/Zrxj;)V
    //   431: goto -> 441
    //   434: astore #13
    //   436: aload #13
    //   438: invokevirtual printStackTrace : ()V
    //   441: aload_0
    //   442: getfield Zq : Ljava/net/Socket;
    //   445: invokevirtual isClosed : ()Z
    //   448: ifne -> 484
    //   451: aload_0
    //   452: getfield Zq : Ljava/net/Socket;
    //   455: invokevirtual close : ()V
    //   458: goto -> 484
    //   461: astore #13
    //   463: aload #13
    //   465: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   468: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   471: goto -> 484
    //   474: astore #13
    //   476: aload #13
    //   478: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   481: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   484: return
    //   485: aload #12
    //   487: sipush #-18202
    //   490: sipush #10511
    //   493: invokestatic a : (II)Ljava/lang/String;
    //   496: invokevirtual Zk : (Ljava/lang/String;)Ljava/util/Optional;
    //   499: aconst_null
    //   500: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   503: checkcast java/lang/String
    //   506: astore #13
    //   508: aload_0
    //   509: getfield Ze : Lnet/portswigger/Zgn;
    //   512: getfield Za : Lnet/portswigger/Zvk;
    //   515: instanceof net/portswigger/Zlk
    //   518: ifeq -> 569
    //   521: aload #13
    //   523: aload #12
    //   525: invokestatic ZF : (Ljava/lang/String;Lnet/portswigger/Zvw;)Z
    //   528: ifeq -> 569
    //   531: goto -> 538
    //   534: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   537: athrow
    //   538: aload #10
    //   540: aload #8
    //   542: getfield Zo : Ljava/lang/Object;
    //   545: checkcast net/portswigger/Zgk
    //   548: invokevirtual Zi : (Lnet/portswigger/Zgk;)Lnet/portswigger/Zq9;
    //   551: astore #14
    //   553: aload_0
    //   554: aload #4
    //   556: aload #5
    //   558: aload #14
    //   560: aload #13
    //   562: invokevirtual ZD : (Ljava/io/OutputStream;Ljava/io/InputStream;Lnet/portswigger/Zq9;Ljava/lang/String;)V
    //   565: aload_1
    //   566: ifnull -> 605
    //   569: aload #10
    //   571: aload #8
    //   573: getfield Zo : Ljava/lang/Object;
    //   576: checkcast net/portswigger/Zgk
    //   579: invokevirtual Zi : (Lnet/portswigger/Zgk;)Lnet/portswigger/Zq9;
    //   582: astore #14
    //   584: aload_0
    //   585: aload #6
    //   587: aload #7
    //   589: aload #8
    //   591: getfield Zo : Ljava/lang/Object;
    //   594: checkcast net/portswigger/Zgk
    //   597: aload_3
    //   598: aload #5
    //   600: aload #14
    //   602: invokevirtual Zv : (Ljava/lang/Runnable;Ljava/lang/Runnable;Lnet/portswigger/Zgk;Lnet/portswigger/Zrxj;Ljava/io/InputStream;Lnet/portswigger/Zq9;)V
    //   605: goto -> 723
    //   608: astore #8
    //   610: aload #8
    //   612: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   615: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   618: aload #4
    //   620: aload #8
    //   622: getfield ZN : Lnet/portswigger/Zu0;
    //   625: invokevirtual ZW : ()[B
    //   628: invokevirtual write : ([B)V
    //   631: goto -> 723
    //   634: astore #8
    //   636: aload #8
    //   638: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   641: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   644: aload #4
    //   646: getstatic net/portswigger/Zgn.Zn : [B
    //   649: invokevirtual write : ([B)V
    //   652: goto -> 723
    //   655: astore #8
    //   657: aload #8
    //   659: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   662: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   665: goto -> 723
    //   668: astore #8
    //   670: aload #8
    //   672: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   675: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   678: aload #4
    //   680: aload_0
    //   681: getfield Ze : Lnet/portswigger/Zgn;
    //   684: getfield Zc : I
    //   687: sipush #-18204
    //   690: sipush #25937
    //   693: invokestatic a : (II)Ljava/lang/String;
    //   696: swap
    //   697: sipush #-18193
    //   700: sipush #28676
    //   703: invokestatic a : (II)Ljava/lang/String;
    //   706: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   711: invokestatic ZE : (Ljava/lang/String;)Lnet/portswigger/Zu0;
    //   714: invokevirtual Zt : ()Lnet/portswigger/Zu0;
    //   717: invokevirtual ZW : ()[B
    //   720: invokevirtual write : ([B)V
    //   723: iload_2
    //   724: ifeq -> 1037
    //   727: aload_0
    //   728: getfield Ze : Lnet/portswigger/Zgn;
    //   731: getfield Za : Lnet/portswigger/Zvk;
    //   734: aload_3
    //   735: invokeinterface Zg : (Lnet/portswigger/Zrxj;)V
    //   740: goto -> 750
    //   743: astore #4
    //   745: aload #4
    //   747: invokevirtual printStackTrace : ()V
    //   750: aload_0
    //   751: getfield Zq : Ljava/net/Socket;
    //   754: invokevirtual isClosed : ()Z
    //   757: ifne -> 1037
    //   760: aload_0
    //   761: getfield Zq : Ljava/net/Socket;
    //   764: invokevirtual close : ()V
    //   767: goto -> 1037
    //   770: astore #4
    //   772: aload #4
    //   774: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   777: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   780: goto -> 1037
    //   783: astore #4
    //   785: aload #4
    //   787: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   790: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   793: goto -> 1037
    //   796: astore #4
    //   798: aload #4
    //   800: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   803: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   806: iload_2
    //   807: ifeq -> 1037
    //   810: aload_0
    //   811: getfield Ze : Lnet/portswigger/Zgn;
    //   814: getfield Za : Lnet/portswigger/Zvk;
    //   817: aload_3
    //   818: invokeinterface Zg : (Lnet/portswigger/Zrxj;)V
    //   823: goto -> 833
    //   826: astore #4
    //   828: aload #4
    //   830: invokevirtual printStackTrace : ()V
    //   833: aload_0
    //   834: getfield Zq : Ljava/net/Socket;
    //   837: invokevirtual isClosed : ()Z
    //   840: ifne -> 1037
    //   843: aload_0
    //   844: getfield Zq : Ljava/net/Socket;
    //   847: invokevirtual close : ()V
    //   850: goto -> 1037
    //   853: astore #4
    //   855: aload #4
    //   857: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   860: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   863: goto -> 1037
    //   866: astore #4
    //   868: aload #4
    //   870: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   873: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   876: goto -> 1037
    //   879: astore #4
    //   881: aload #4
    //   883: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   886: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   889: iload_2
    //   890: ifeq -> 1037
    //   893: aload_0
    //   894: getfield Ze : Lnet/portswigger/Zgn;
    //   897: getfield Za : Lnet/portswigger/Zvk;
    //   900: aload_3
    //   901: invokeinterface Zg : (Lnet/portswigger/Zrxj;)V
    //   906: goto -> 916
    //   909: astore #4
    //   911: aload #4
    //   913: invokevirtual printStackTrace : ()V
    //   916: aload_0
    //   917: getfield Zq : Ljava/net/Socket;
    //   920: invokevirtual isClosed : ()Z
    //   923: ifne -> 1037
    //   926: aload_0
    //   927: getfield Zq : Ljava/net/Socket;
    //   930: invokevirtual close : ()V
    //   933: goto -> 1037
    //   936: astore #4
    //   938: aload #4
    //   940: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   943: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   946: goto -> 1037
    //   949: astore #4
    //   951: aload #4
    //   953: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   956: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   959: goto -> 1037
    //   962: astore #15
    //   964: iload_2
    //   965: ifeq -> 1034
    //   968: aload_0
    //   969: getfield Ze : Lnet/portswigger/Zgn;
    //   972: getfield Za : Lnet/portswigger/Zvk;
    //   975: aload_3
    //   976: invokeinterface Zg : (Lnet/portswigger/Zrxj;)V
    //   981: goto -> 991
    //   984: astore #16
    //   986: aload #16
    //   988: invokevirtual printStackTrace : ()V
    //   991: aload_0
    //   992: getfield Zq : Ljava/net/Socket;
    //   995: invokevirtual isClosed : ()Z
    //   998: ifne -> 1034
    //   1001: aload_0
    //   1002: getfield Zq : Ljava/net/Socket;
    //   1005: invokevirtual close : ()V
    //   1008: goto -> 1034
    //   1011: astore #16
    //   1013: aload #16
    //   1015: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   1018: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1021: goto -> 1034
    //   1024: astore #16
    //   1026: aload #16
    //   1028: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   1031: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1034: aload #15
    //   1036: athrow
    //   1037: return
    // Exception table:
    //   from	to	target	type
    //   14	169	796	java/io/IOException
    //   14	169	879	java/lang/Throwable
    //   14	169	962	finally
    //   68	169	608	net/portswigger/Zrzz
    //   68	169	634	net/portswigger/Zib
    //   68	169	655	net/portswigger/Zuy
    //   68	169	668	java/net/SocketTimeoutException
    //   124	160	163	java/lang/Exception
    //   173	186	189	java/lang/Exception
    //   206	213	216	java/io/IOException
    //   206	213	229	java/lang/Throwable
    //   240	305	608	net/portswigger/Zrzz
    //   240	305	634	net/portswigger/Zib
    //   240	305	655	net/portswigger/Zuy
    //   240	305	668	java/net/SocketTimeoutException
    //   240	305	796	java/io/IOException
    //   240	305	879	java/lang/Throwable
    //   240	305	962	finally
    //   309	322	325	java/lang/Exception
    //   342	349	352	java/io/IOException
    //   342	349	365	java/lang/Throwable
    //   376	414	608	net/portswigger/Zrzz
    //   376	414	634	net/portswigger/Zib
    //   376	414	655	net/portswigger/Zuy
    //   376	414	668	java/net/SocketTimeoutException
    //   376	414	796	java/io/IOException
    //   376	414	879	java/lang/Throwable
    //   376	414	962	finally
    //   418	431	434	java/lang/Exception
    //   451	458	461	java/io/IOException
    //   451	458	474	java/lang/Throwable
    //   485	605	608	net/portswigger/Zrzz
    //   485	605	634	net/portswigger/Zib
    //   485	605	655	net/portswigger/Zuy
    //   485	605	668	java/net/SocketTimeoutException
    //   485	723	796	java/io/IOException
    //   485	723	879	java/lang/Throwable
    //   485	723	962	finally
    //   508	531	534	java/lang/Exception
    //   727	740	743	java/lang/Exception
    //   760	767	770	java/io/IOException
    //   760	767	783	java/lang/Throwable
    //   796	806	962	finally
    //   810	823	826	java/lang/Exception
    //   843	850	853	java/io/IOException
    //   843	850	866	java/lang/Throwable
    //   879	889	962	finally
    //   893	906	909	java/lang/Exception
    //   926	933	936	java/io/IOException
    //   926	933	949	java/lang/Throwable
    //   962	964	962	finally
    //   968	981	984	java/lang/Exception
    //   1001	1008	1011	java/io/IOException
    //   1001	1008	1024	java/lang/Throwable
  }
  
  private void Zv(Runnable paramRunnable1, Runnable paramRunnable2, Zgk paramZgk, Zrxj paramZrxj, InputStream paramInputStream, Zq9 paramZq9) throws IOException, Zib {
    // Byte code:
    //   0: invokestatic ZK : ()Ljava/lang/String;
    //   3: aload #6
    //   5: astore #8
    //   7: astore #7
    //   9: aload_0
    //   10: getfield Ze : Lnet/portswigger/Zgn;
    //   13: getfield Zo : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   16: invokevirtual get : ()Z
    //   19: ifeq -> 178
    //   22: aload #8
    //   24: ifnull -> 178
    //   27: aload #8
    //   29: getfield Zo : Lnet/portswigger/Zvw;
    //   32: sipush #-18194
    //   35: sipush #18779
    //   38: invokestatic a : (II)Ljava/lang/String;
    //   41: sipush #-18203
    //   44: sipush #2163
    //   47: invokestatic a : (II)Ljava/lang/String;
    //   50: invokevirtual Zm : (Ljava/lang/String;Ljava/lang/String;)Z
    //   53: istore #9
    //   55: iconst_0
    //   56: istore #10
    //   58: aload_0
    //   59: getfield Ze : Lnet/portswigger/Zgn;
    //   62: getfield Zo : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   65: invokevirtual get : ()Z
    //   68: ifeq -> 149
    //   71: aload_0
    //   72: aload #4
    //   74: aload #8
    //   76: iload #9
    //   78: invokevirtual Zl : (Lnet/portswigger/Zrxj;Lnet/portswigger/Zq9;Z)Ljava/util/Optional;
    //   81: astore #11
    //   83: aload #8
    //   85: invokevirtual ZX : ()[B
    //   88: pop
    //   89: aload #8
    //   91: getfield Zy : Lnet/portswigger/Zd1;
    //   94: getfield Zc : Z
    //   97: ifne -> 138
    //   100: aload #11
    //   102: invokevirtual isPresent : ()Z
    //   105: ifeq -> 138
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: aload #11
    //   117: invokevirtual get : ()Ljava/lang/Object;
    //   120: checkcast net/portswigger/Zr
    //   123: invokeinterface Zr : ()Z
    //   128: ifeq -> 146
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: iconst_1
    //   139: goto -> 147
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: iconst_0
    //   147: istore #10
    //   149: iload #10
    //   151: ifeq -> 162
    //   154: aconst_null
    //   155: goto -> 171
    //   158: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   161: athrow
    //   162: aload_0
    //   163: aload_1
    //   164: aload_2
    //   165: aload_3
    //   166: aload #5
    //   168: invokevirtual Zf : (Ljava/lang/Runnable;Ljava/lang/Runnable;Lnet/portswigger/Zgk;Ljava/io/InputStream;)Lnet/portswigger/Zq9;
    //   171: astore #8
    //   173: aload #7
    //   175: ifnull -> 9
    //   178: return
    // Exception table:
    //   from	to	target	type
    //   83	108	111	java/io/IOException
    //   100	131	134	java/io/IOException
    //   115	142	142	java/io/IOException
    //   149	158	158	java/io/IOException
  }
  
  private Optional<Zr> Zl(Zrxj paramZrxj, Zq9 paramZq9, boolean paramBoolean) throws IOException {
    // Byte code:
    //   0: invokestatic ZK : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield Ze : Lnet/portswigger/Zgn;
    //   9: getfield Za : Lnet/portswigger/Zvk;
    //   12: aload_1
    //   13: aload_2
    //   14: invokeinterface ZV : (Lnet/portswigger/Zrxj;Lnet/portswigger/Zq9;)Lnet/portswigger/Zr;
    //   19: astore #5
    //   21: aload #5
    //   23: ifnonnull -> 57
    //   26: new java/lang/NullPointerException
    //   29: dup
    //   30: aload_2
    //   31: getfield ZJ : Ljava/lang/String;
    //   34: sipush #-18205
    //   37: sipush #25437
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: swap
    //   44: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   49: invokespecial <init> : (Ljava/lang/String;)V
    //   52: invokestatic ZJ : (Ljava/lang/Throwable;)Lnet/portswigger/Zu0;
    //   55: astore #5
    //   57: goto -> 115
    //   60: astore #6
    //   62: aload #6
    //   64: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   67: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   70: aload #6
    //   72: getfield ZN : Lnet/portswigger/Zu0;
    //   75: astore #5
    //   77: goto -> 115
    //   80: astore #6
    //   82: aload #6
    //   84: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   87: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   90: getstatic net/portswigger/Zgn.Zz : Lnet/portswigger/Zu0;
    //   93: astore #5
    //   95: goto -> 115
    //   98: astore #6
    //   100: aload #6
    //   102: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   105: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   108: aload #6
    //   110: invokestatic ZJ : (Ljava/lang/Throwable;)Lnet/portswigger/Zu0;
    //   113: astore #5
    //   115: aload_0
    //   116: getfield Zq : Ljava/net/Socket;
    //   119: invokevirtual isClosed : ()Z
    //   122: ifne -> 288
    //   125: aload #5
    //   127: astore #6
    //   129: aload_0
    //   130: getfield Ze : Lnet/portswigger/Zgn;
    //   133: getfield Zf : Z
    //   136: ifeq -> 192
    //   139: aload_2
    //   140: getfield Zo : Lnet/portswigger/Zvw;
    //   143: sipush #-18201
    //   146: sipush #27231
    //   149: invokestatic a : (II)Ljava/lang/String;
    //   152: sipush #-18206
    //   155: sipush #19245
    //   158: invokestatic a : (II)Ljava/lang/String;
    //   161: sipush #-18198
    //   164: sipush #-8037
    //   167: invokestatic a : (II)Ljava/lang/String;
    //   170: invokevirtual Zy : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    //   173: ifeq -> 192
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   182: athrow
    //   183: aload #6
    //   185: invokeinterface ZP : ()Lnet/portswigger/Zr;
    //   190: astore #6
    //   192: aload_0
    //   193: getfield Ze : Lnet/portswigger/Zgn;
    //   196: getfield Zp : Z
    //   199: ifne -> 213
    //   202: iload_3
    //   203: ifeq -> 227
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   212: athrow
    //   213: aload #6
    //   215: invokeinterface Zu : ()Lnet/portswigger/Zr;
    //   220: astore #6
    //   222: aload #4
    //   224: ifnull -> 243
    //   227: aload #6
    //   229: aload_0
    //   230: getfield Ze : Lnet/portswigger/Zgn;
    //   233: getfield Zu : I
    //   236: invokeinterface Za : (I)Lnet/portswigger/Zr;
    //   241: astore #6
    //   243: sipush #-18196
    //   246: sipush #16621
    //   249: invokestatic a : (II)Ljava/lang/String;
    //   252: aload_2
    //   253: getfield ZE : Ljava/lang/String;
    //   256: invokevirtual equals : (Ljava/lang/Object;)Z
    //   259: ifeq -> 271
    //   262: aload #6
    //   264: invokeinterface ZO : ()Lnet/portswigger/Zr;
    //   269: astore #6
    //   271: aload_0
    //   272: aload #6
    //   274: invokeinterface ZW : ()[B
    //   279: invokevirtual ZV : ([B)V
    //   282: aload #6
    //   284: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   287: areturn
    //   288: invokestatic empty : ()Ljava/util/Optional;
    //   291: areturn
    // Exception table:
    //   from	to	target	type
    //   5	57	60	net/portswigger/Zrzz
    //   5	57	80	net/portswigger/Zib
    //   5	57	98	java/lang/Throwable
    //   129	176	179	net/portswigger/Zrzz
    //   192	206	209	net/portswigger/Zrzz
  }
  
  private void ZV(byte[] paramArrayOfbyte) throws IOException {
    Zvo.ZL(this::lambda$sendResponse$2, paramArrayOfbyte, this.Ze.ZX, null);
  }
  
  private Zq9 Zf(Runnable paramRunnable1, Runnable paramRunnable2, Zgk paramZgk, InputStream paramInputStream) throws IOException, Zib {
    Zrmy zrmy = this.Ze.Zv.ZU(paramInputStream);
    zrmy.ZL(paramRunnable2, paramRunnable1);
    Zc9 zc9 = zrmy.ZL();
    try {
      if (zc9 == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    zrmy.ZY();
    return zrmy.Zi(paramZgk);
  }
  
  private void ZD(OutputStream paramOutputStream, InputStream paramInputStream, Zq9 paramZq9, String paramString) throws IOException {
    List<Zhb> list;
    this.Zq.setSoTimeout(0);
    Zd2 zd2 = Zd2.Zd(paramZq9.Zo);
    String str = Zu0.ZK();
    try {
      if (!zd2.ZW(a(-18199, -27590), a(-18207, 27400))) {
        paramOutputStream.write(Zu0.ZQ(new String[] { a(-18208, -22408), a(-18195, 6211) }).Zt().ZW());
        return;
      } 
    } catch (Zrmv zrmv) {
      throw a(null);
    } 
    try {
      list = Zhb.ZO(zd2, Zlj.SERVER);
    } catch (Zrmv zrmv) {
      Zah.Zl(zrmv, Zk_.USER_ERROR);
      paramOutputStream.write(Zrxs.ZE(zrmv.getMessage()).Zt().ZW());
      return;
    } 
    Zaa zaa = new Zaa(this.Zq, false, list, Zod.Zv);
    Zb4<? extends Zr, Zzw> zb4 = ((Zlk)this.Ze.Za).ZD(paramZq9, zaa);
    try {
      if (zb4.Zk != null) {
        paramOutputStream.write(((Zr)zb4.Zk).Zu().ZW());
        if (str != null) {
          Zzw zzw1 = (Zzw)zb4.Za;
          Zb(paramOutputStream, paramInputStream, paramString, list, zaa, zzw1);
          return;
        } 
        return;
      } 
    } catch (Zrmv zrmv) {
      throw a(null);
    } 
    Zzw zzw = (Zzw)zb4.Za;
    Zb(paramOutputStream, paramInputStream, paramString, list, zaa, zzw);
  }
  
  private void Zb(OutputStream paramOutputStream, InputStream paramInputStream, String paramString, List<Zhb> paramList, Zaa paramZaa, Zzw paramZzw) throws IOException {
    paramOutputStream.write(Zu0.Zt(paramString, paramList, paramZzw.Za()).ZW());
    (new Ztl(paramInputStream, new Zvg(this.Ze.Zq.Zv(paramZaa), paramZzw, paramZaa, paramList))).run();
    paramZaa.Zn();
  }
  
  private Socket lambda$sendResponse$2() throws IOException {
    return this.Zq;
  }
  
  private void lambda$run$1() {
    try {
      this.Zq.setSoTimeout(this.Ze.Zu);
    } catch (SocketException socketException) {
      Zah.Zl(socketException, Zk_.IGNORED);
    } 
  }
  
  private void lambda$run$0() {
    try {
      this.Zq.setSoTimeout(this.Ze.Zc);
    } catch (SocketException socketException) {
      Zah.Zl(socketException, Zk_.IGNORED);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'z_¦ÒÉ:µnl1eZ~Ú®ÆÙcÆ¹é:¶àFÉB,g³Ru&S=qcê¹äÒu{/Z\\f x:qAi|Îq,øMµºW1PSsFÊSÿÒóZwz§ñ·»x]¶ ÑgM£MáÐû<¨UË\\ruïö°tA¿êuÊ{\\n¢ÝGðáp¡GHÚîÎ!*ÔÔVæAñ{xÙÇuvÖ.z¬OÎipIåò~F'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #15
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #110
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc '"·G£êëæT\ê0¤én -ªú¥c'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #123
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
    //   128: putstatic net/portswigger/Ztd.a : [Ljava/lang/String;
    //   131: bipush #15
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/Ztd.b : [Ljava/lang/String;
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
    //   212: bipush #86
    //   214: goto -> 244
    //   217: bipush #27
    //   219: goto -> 244
    //   222: bipush #63
    //   224: goto -> 244
    //   227: bipush #103
    //   229: goto -> 244
    //   232: bipush #118
    //   234: goto -> 244
    //   237: bipush #112
    //   239: goto -> 244
    //   242: bipush #35
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB8E7) & 0xFFFF;
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
      byte b1 = 124;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Ztd.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */