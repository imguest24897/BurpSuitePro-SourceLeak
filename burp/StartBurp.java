package burp;

import java.awt.GraphicsEnvironment;
import java.awt.desktop.OpenFilesEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class StartBurp {
  public static Zxei ZL;
  
  public static Zra1 ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static void main(String... paramVarArgs) {
    // Byte code:
    //   0: iconst_0
    //   1: invokestatic ZT : (Z)V
    //   4: invokestatic ZD : ()Ljava/lang/String;
    //   7: iconst_0
    //   8: invokestatic ZK : (Z)V
    //   11: aload_0
    //   12: invokestatic of : ([Ljava/lang/Object;)Ljava/util/List;
    //   15: invokestatic Zs : (Ljava/util/List;)Lburp/Zzxi;
    //   18: astore_2
    //   19: aload_2
    //   20: invokevirtual ZM : ()Lburp/Zra1;
    //   23: putstatic burp/StartBurp.ZY : Lburp/Zra1;
    //   26: astore_1
    //   27: invokestatic Zd : ()V
    //   30: aload_2
    //   31: invokevirtual Zl : ()Z
    //   34: ifeq -> 62
    //   37: invokestatic ZI : ()V
    //   40: aload_2
    //   41: invokevirtual ZX : ()Ljava/lang/String;
    //   44: astore_3
    //   45: aload_3
    //   46: invokestatic Zh : (Ljava/lang/String;)Lburp/Zg69;
    //   49: astore #4
    //   51: aload #4
    //   53: invokeinterface Zm : ()V
    //   58: aload_1
    //   59: ifnull -> 662
    //   62: sipush #-14879
    //   65: sipush #24504
    //   68: invokestatic a : (II)Ljava/lang/String;
    //   71: sipush #-14853
    //   74: sipush #6442
    //   77: invokestatic a : (II)Ljava/lang/String;
    //   80: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   83: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   86: ifne -> 141
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: getstatic burp/StartBurp.ZY : Lburp/Zra1;
    //   99: getstatic burp/Zra1.EXECUTION_MODE_DESKTOP : Lburp/Zra1;
    //   102: if_acmpeq -> 141
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   111: athrow
    //   112: sipush #-14864
    //   115: sipush #2857
    //   118: invokestatic a : (II)Ljava/lang/String;
    //   121: sipush #-14855
    //   124: sipush #16579
    //   127: invokestatic a : (II)Ljava/lang/String;
    //   130: invokestatic setProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   133: pop
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: invokestatic Zc : ()V
    //   144: sipush #-14862
    //   147: sipush #13552
    //   150: invokestatic a : (II)Ljava/lang/String;
    //   153: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   156: astore_3
    //   157: aload_3
    //   158: ifnull -> 241
    //   161: aload_3
    //   162: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   165: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   168: sipush #-14856
    //   171: sipush #28569
    //   174: invokestatic a : (II)Ljava/lang/String;
    //   177: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   180: ifeq -> 241
    //   183: goto -> 190
    //   186: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   189: athrow
    //   190: sipush #-14851
    //   193: sipush #-30269
    //   196: invokestatic a : (II)Ljava/lang/String;
    //   199: sipush #-14850
    //   202: sipush #23915
    //   205: invokestatic a : (II)Ljava/lang/String;
    //   208: invokestatic setProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   211: pop
    //   212: sipush #-14857
    //   215: sipush #-12788
    //   218: invokestatic a : (II)Ljava/lang/String;
    //   221: sipush #-14860
    //   224: sipush #11501
    //   227: invokestatic a : (II)Ljava/lang/String;
    //   230: invokestatic setProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   233: pop
    //   234: goto -> 241
    //   237: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   240: athrow
    //   241: sipush #-14858
    //   244: sipush #22974
    //   247: invokestatic a : (II)Ljava/lang/String;
    //   250: sipush #-14855
    //   253: sipush #16579
    //   256: invokestatic a : (II)Ljava/lang/String;
    //   259: invokestatic setProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   262: pop
    //   263: sipush #-14861
    //   266: sipush #-7312
    //   269: invokestatic a : (II)Ljava/lang/String;
    //   272: sipush #-14854
    //   275: sipush #-8891
    //   278: invokestatic a : (II)Ljava/lang/String;
    //   281: invokestatic setProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   284: pop
    //   285: invokestatic ZB : ()V
    //   288: invokestatic Zu : ()Z
    //   291: invokestatic ZA : (Z)V
    //   294: goto -> 307
    //   297: astore #4
    //   299: aload #4
    //   301: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   304: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   307: new burp/Zexp
    //   310: dup
    //   311: invokespecial <init> : ()V
    //   314: astore #4
    //   316: invokestatic ZG : ()Z
    //   319: ifne -> 338
    //   322: new burp/Ztr0
    //   325: dup
    //   326: aload #4
    //   328: invokespecial <init> : (Lburp/Zb_j;)V
    //   331: astore #5
    //   333: aload #5
    //   335: invokevirtual Zm : ()V
    //   338: new burp/Zrth
    //   341: dup
    //   342: invokestatic ZG : ()Z
    //   345: aload_2
    //   346: invokespecial <init> : (ZLburp/Zzxi;)V
    //   349: astore #5
    //   351: new burp/Zzw4
    //   354: dup
    //   355: aload #5
    //   357: aload #4
    //   359: invokespecial <init> : (Lburp/Zz0n;Lburp/Zexp;)V
    //   362: putstatic burp/StartBurp.ZL : Lburp/Zxei;
    //   365: getstatic burp/StartBurp.ZL : Lburp/Zxei;
    //   368: invokeinterface Zy : ()V
    //   373: aload_2
    //   374: invokevirtual ZR : ()Z
    //   377: ifeq -> 404
    //   380: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   383: getstatic burp/StartBurp.ZL : Lburp/Zxei;
    //   386: invokeinterface ZZ : ()Lburp/Zg1j;
    //   391: aload #5
    //   393: invokeinterface Zo : ()Lnet/portswigger/browser/service/Zi;
    //   398: invokestatic ZL : (Lburp/Zg1j;Lnet/portswigger/browser/service/Zi;)Ljava/lang/String;
    //   401: invokevirtual println : (Ljava/lang/String;)V
    //   404: getstatic burp/StartBurp.ZY : Lburp/Zra1;
    //   407: getstatic burp/Zra1.EXECUTION_MODE_DESKTOP : Lburp/Zra1;
    //   410: if_acmpeq -> 488
    //   413: getstatic burp/StartBurp.ZL : Lburp/Zxei;
    //   416: invokeinterface ZZ : ()Lburp/Zg1j;
    //   421: astore #6
    //   423: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   426: aload #6
    //   428: invokevirtual ZY : ()Ljava/lang/String;
    //   431: sipush #-14863
    //   434: sipush #-2918
    //   437: invokestatic a : (II)Ljava/lang/String;
    //   440: swap
    //   441: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   446: invokevirtual println : (Ljava/lang/String;)V
    //   449: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   452: invokestatic ZQ : ()Ljava/lang/String;
    //   455: sipush #-14878
    //   458: sipush #25580
    //   461: invokestatic a : (II)Ljava/lang/String;
    //   464: swap
    //   465: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   470: invokevirtual println : (Ljava/lang/String;)V
    //   473: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   476: sipush #-14880
    //   479: sipush #-15099
    //   482: invokestatic a : (II)Ljava/lang/String;
    //   485: invokevirtual println : (Ljava/lang/String;)V
    //   488: getstatic burp/Zrrh.SUITE_PROCESS_BURP_LAUNCHED : Lburp/Zrrh;
    //   491: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   494: invokestatic ZG : ()Z
    //   497: ifeq -> 513
    //   500: getstatic burp/Zrrh.SUITE_PROCESS_HEADLESS_MODE : Lburp/Zrrh;
    //   503: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   506: goto -> 513
    //   509: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   512: athrow
    //   513: goto -> 662
    //   516: astore #4
    //   518: aload #4
    //   520: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   523: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   526: getstatic burp/Zmg9.INVALID_LICENSE : Lburp/Zmg9;
    //   529: invokestatic ZT : (Lburp/Zmg9;)V
    //   532: goto -> 662
    //   535: astore #4
    //   537: aload #4
    //   539: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   542: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   545: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   548: aload #4
    //   550: invokevirtual getMessage : ()Ljava/lang/String;
    //   553: invokevirtual println : (Ljava/lang/String;)V
    //   556: getstatic burp/Zmg9.DATA_STORE_INITIALIZATION_FAILURE : Lburp/Zmg9;
    //   559: invokestatic ZT : (Lburp/Zmg9;)V
    //   562: goto -> 662
    //   565: astore #4
    //   567: aload #4
    //   569: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   572: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   575: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   578: aload #4
    //   580: invokevirtual getMessage : ()Ljava/lang/String;
    //   583: invokevirtual println : (Ljava/lang/String;)V
    //   586: getstatic burp/Zmg9.PROJECT_INITIALIZATION_FAILURE : Lburp/Zmg9;
    //   589: invokestatic ZT : (Lburp/Zmg9;)V
    //   592: goto -> 662
    //   595: astore #4
    //   597: aload #4
    //   599: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   602: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   605: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   608: aload #4
    //   610: invokevirtual getMessage : ()Ljava/lang/String;
    //   613: invokevirtual println : (Ljava/lang/String;)V
    //   616: getstatic burp/Zmg9.INVALID_JSON_CONFIGURATION : Lburp/Zmg9;
    //   619: invokestatic ZT : (Lburp/Zmg9;)V
    //   622: goto -> 662
    //   625: astore #4
    //   627: aload #4
    //   629: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   632: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   635: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   638: getstatic burp/Zrgs.UNABLE_TO_START_BURP : Lburp/Zrgs;
    //   641: iconst_1
    //   642: anewarray java/lang/Object
    //   645: dup
    //   646: iconst_0
    //   647: aload #4
    //   649: aastore
    //   650: invokevirtual ZN : ([Ljava/lang/Object;)Ljava/lang/String;
    //   653: invokevirtual println : (Ljava/lang/String;)V
    //   656: getstatic burp/Zmg9.GENERAL_STARTUP_FAILURE : Lburp/Zmg9;
    //   659: invokestatic ZT : (Lburp/Zmg9;)V
    //   662: return
    // Exception table:
    //   from	to	target	type
    //   51	89	92	java/lang/Exception
    //   62	105	108	java/lang/Exception
    //   96	134	137	java/lang/Exception
    //   157	183	186	java/lang/Exception
    //   161	234	237	java/lang/Exception
    //   288	294	297	java/lang/Exception
    //   288	513	516	burp/Ztkd
    //   288	513	535	burp/Zev3
    //   288	513	565	burp/Zxcc
    //   288	513	595	burp/Ze0d
    //   288	513	625	java/lang/Throwable
    //   488	506	509	java/lang/Exception
  }
  
  private static void Zd() {}
  
  private static Zzxi Zs(List<String> paramList) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: aload_0
    //   5: invokespecial <init> : (Ljava/util/Collection;)V
    //   8: astore_1
    //   9: getstatic net/portswigger/Zvh.ZU : Lnet/portswigger/Zvh;
    //   12: invokevirtual ZG : ()Z
    //   15: ifeq -> 71
    //   18: new java/util/concurrent/CountDownLatch
    //   21: dup
    //   22: iconst_1
    //   23: invokespecial <init> : (I)V
    //   26: astore_2
    //   27: invokestatic getDesktop : ()Ljava/awt/Desktop;
    //   30: getstatic java/awt/desktop/QuitStrategy.CLOSE_ALL_WINDOWS : Ljava/awt/desktop/QuitStrategy;
    //   33: invokevirtual setQuitStrategy : (Ljava/awt/desktop/QuitStrategy;)V
    //   36: invokestatic getDesktop : ()Ljava/awt/Desktop;
    //   39: aload_1
    //   40: aload_2
    //   41: <illegal opcode> openFiles : (Ljava/util/List;Ljava/util/concurrent/CountDownLatch;)Ljava/awt/desktop/OpenFilesHandler;
    //   46: invokevirtual setOpenFileHandler : (Ljava/awt/desktop/OpenFilesHandler;)V
    //   49: aload_2
    //   50: ldc2_w 200
    //   53: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   56: invokevirtual await : (JLjava/util/concurrent/TimeUnit;)Z
    //   59: pop
    //   60: goto -> 71
    //   63: astore_3
    //   64: aload_3
    //   65: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   68: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   71: new burp/Zzxi
    //   74: dup
    //   75: aload_1
    //   76: invokespecial <init> : (Ljava/util/List;)V
    //   79: areturn
    // Exception table:
    //   from	to	target	type
    //   27	60	63	java/lang/Exception
  }
  
  private static void ZB() {
    Zsvi zsvi = Zsvi.Zb(System.getProperty(a(-14849, 2173)));
    if (zsvi.Zc() < 13)
      System.setProperty(a(-14852, -24610), a(-14859, 15399)); 
  }
  
  private static void ZT(Zmg9 paramZmg9) {
    if (System.getProperty(a(-14877, -13774)) != null)
      return; 
    if (ZL != null)
      ZL.ZX(paramZmg9); 
    System.exit(paramZmg9.processExitCode);
  }
  
  private static boolean Zu() {
    String str = System.getProperty(a(-14864, 2857));
    return (str == null) ? GraphicsEnvironment.isHeadless() : str.equals(a(-14855, 16579));
  }
  
  private static void lambda$getCommandLineOptions$0(List<String> paramList, CountDownLatch paramCountDownLatch, OpenFilesEvent paramOpenFilesEvent) {
    String str = Zra1.ZD();
    for (File file : paramOpenFilesEvent.getFiles()) {
      paramList.add(file.getAbsolutePath());
      if (str != null)
        break; 
    } 
    paramCountDownLatch.countDown();
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'i~vçîGÌ|ü#rß7Î°¶½R;æ¢!_©ZÖ¹|[LúþÂQkÜfúÄ\·ÓªÙ ÖÞàr µQà óÉ¶.¦S\ß-É\\fÐÿUyï§G@¯AìG*s6Î¨"éªtÓÑ¾¨ÜªHöÿ­®[úR#'ÙUØX½gtqô*ò ¥isÙ¶ríØÅ§\\tjN"BOkð±bè_CVÃugGd$\\r÷æd£U3/MÝ ¾ÉðxøøeßlÐMmlÅ³ìGn'åK÷Ù|þ-¥¶M£Þs8òä¬:ù°ã\CóGEÖ_>\\nEM\\f¤M8 IrH£:rÂÀÄ,ÞËù§ï¢ûpàúO<ñ#L%½²+ÏYÚ~ã ÔÛHbÂ\\rTÖìbÙ;ë1{ð´MYF'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #93
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
    //   68: ldc 'Æ$¼ÏÀ¶¢Oe°qVe`+ü\\b\\rnýn'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #12
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #17
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
    //   129: putstatic burp/StartBurp.a : [Ljava/lang/String;
    //   132: bipush #20
    //   134: anewarray java/lang/String
    //   137: putstatic burp/StartBurp.b : [Ljava/lang/String;
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
    //   212: bipush #81
    //   214: goto -> 244
    //   217: bipush #60
    //   219: goto -> 244
    //   222: bipush #33
    //   224: goto -> 244
    //   227: bipush #84
    //   229: goto -> 244
    //   232: bipush #82
    //   234: goto -> 244
    //   237: bipush #93
    //   239: goto -> 244
    //   242: bipush #89
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
    //   300: getstatic burp/Zra1.EXECUTION_MODE_DESKTOP : Lburp/Zra1;
    //   303: putstatic burp/StartBurp.ZY : Lburp/Zra1;
    //   306: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC5F1) & 0xFFFF;
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
      char c = 'ê';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\StartBurp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */