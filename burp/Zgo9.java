package burp;

import java.awt.Color;
import java.util.List;

class Zgo9 extends Zgoi {
  private static final String[] c;
  
  private static final String[] d;
  
  public Zgo9(byte paramByte, String paramString1, Zbcc paramZbcc, List<Zrmm> paramList, int paramInt, boolean[] paramArrayOfboolean, String paramString2, String paramString3) {
    super(paramString1, paramZbcc, paramList, paramInt, paramArrayOfboolean, paramString2, paramString3);
    paramZbcc.ZF(6.0D + Math.log10(Zlse.ZS(paramByte)), Color.BLUE, b(-6698, 13438));
  }
  
  protected Zbqc ZP(List<Zrmm> paramList, int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: invokestatic ZD : ()I
    //   6: iconst_0
    //   7: istore #5
    //   9: istore_3
    //   10: iload #5
    //   12: aload_0
    //   13: getfield Zk : [Z
    //   16: arraylength
    //   17: if_icmpge -> 40
    //   20: aload_0
    //   21: getfield Zk : [Z
    //   24: iload #5
    //   26: baload
    //   27: ifeq -> 33
    //   30: iinc #4, 1
    //   33: iinc #5, 1
    //   36: iload_3
    //   37: ifne -> 10
    //   40: new java/lang/StringBuilder
    //   43: dup
    //   44: invokespecial <init> : ()V
    //   47: astore #5
    //   49: iload #4
    //   51: ifne -> 73
    //   54: aload #5
    //   56: sipush #-6712
    //   59: sipush #20369
    //   62: invokestatic b : (II)Ljava/lang/String;
    //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: iload_3
    //   70: ifne -> 610
    //   73: iload #4
    //   75: aload_0
    //   76: getfield Zk : [Z
    //   79: arraylength
    //   80: if_icmpne -> 102
    //   83: aload #5
    //   85: sipush #-6710
    //   88: sipush #12071
    //   91: invokestatic b : (II)Ljava/lang/String;
    //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: iload_3
    //   99: ifne -> 610
    //   102: iload #4
    //   104: iconst_1
    //   105: if_icmpne -> 190
    //   108: iconst_0
    //   109: istore #6
    //   111: iconst_0
    //   112: istore #7
    //   114: iload #7
    //   116: aload_0
    //   117: getfield Zk : [Z
    //   120: arraylength
    //   121: if_icmpge -> 145
    //   124: aload_0
    //   125: getfield Zk : [Z
    //   128: iload #7
    //   130: baload
    //   131: ifeq -> 138
    //   134: iload #7
    //   136: istore #6
    //   138: iinc #7, 1
    //   141: iload_3
    //   142: ifne -> 114
    //   145: aload #5
    //   147: sipush #-6708
    //   150: sipush #-12863
    //   153: invokestatic b : (II)Ljava/lang/String;
    //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: aload #5
    //   162: iload #6
    //   164: invokestatic toString : (I)Ljava/lang/String;
    //   167: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: pop
    //   171: aload #5
    //   173: sipush #-6705
    //   176: sipush #-27484
    //   179: invokestatic b : (II)Ljava/lang/String;
    //   182: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: pop
    //   186: iload_3
    //   187: ifne -> 610
    //   190: aload_0
    //   191: getfield Zk : [Z
    //   194: arraylength
    //   195: iload #4
    //   197: isub
    //   198: iconst_1
    //   199: if_icmpne -> 284
    //   202: iconst_0
    //   203: istore #6
    //   205: iconst_0
    //   206: istore #7
    //   208: iload #7
    //   210: aload_0
    //   211: getfield Zk : [Z
    //   214: arraylength
    //   215: if_icmpge -> 239
    //   218: aload_0
    //   219: getfield Zk : [Z
    //   222: iload #7
    //   224: baload
    //   225: ifne -> 232
    //   228: iload #7
    //   230: istore #6
    //   232: iinc #7, 1
    //   235: iload_3
    //   236: ifne -> 208
    //   239: aload #5
    //   241: sipush #-6700
    //   244: sipush #19824
    //   247: invokestatic b : (II)Ljava/lang/String;
    //   250: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: pop
    //   254: aload #5
    //   256: iload #6
    //   258: invokestatic toString : (I)Ljava/lang/String;
    //   261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: pop
    //   265: aload #5
    //   267: sipush #-6714
    //   270: sipush #24703
    //   273: invokestatic b : (II)Ljava/lang/String;
    //   276: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: pop
    //   280: iload_3
    //   281: ifne -> 610
    //   284: iload #4
    //   286: aload_0
    //   287: getfield Zk : [Z
    //   290: arraylength
    //   291: iconst_2
    //   292: idiv
    //   293: if_icmple -> 455
    //   296: aload #5
    //   298: iload #4
    //   300: invokestatic toString : (I)Ljava/lang/String;
    //   303: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: pop
    //   307: aload #5
    //   309: sipush #-6717
    //   312: sipush #-10634
    //   315: invokestatic b : (II)Ljava/lang/String;
    //   318: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: pop
    //   322: aload #5
    //   324: aload_0
    //   325: getfield Zk : [Z
    //   328: arraylength
    //   329: iload #4
    //   331: isub
    //   332: invokestatic toString : (I)Ljava/lang/String;
    //   335: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   338: pop
    //   339: aload #5
    //   341: sipush #-6713
    //   344: sipush #26013
    //   347: invokestatic b : (II)Ljava/lang/String;
    //   350: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: pop
    //   354: iconst_1
    //   355: istore #6
    //   357: iconst_0
    //   358: istore #7
    //   360: iload #7
    //   362: aload_0
    //   363: getfield Zk : [Z
    //   366: arraylength
    //   367: if_icmpge -> 436
    //   370: aload_0
    //   371: getfield Zk : [Z
    //   374: iload #7
    //   376: baload
    //   377: ifne -> 429
    //   380: iload #6
    //   382: ifeq -> 403
    //   385: aload #5
    //   387: iload #7
    //   389: invokestatic toString : (I)Ljava/lang/String;
    //   392: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   395: pop
    //   396: iconst_0
    //   397: istore #6
    //   399: iload_3
    //   400: ifne -> 429
    //   403: aload #5
    //   405: sipush #-6699
    //   408: sipush #25073
    //   411: invokestatic b : (II)Ljava/lang/String;
    //   414: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   417: pop
    //   418: aload #5
    //   420: iload #7
    //   422: invokestatic toString : (I)Ljava/lang/String;
    //   425: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   428: pop
    //   429: iinc #7, 1
    //   432: iload_3
    //   433: ifne -> 360
    //   436: aload #5
    //   438: sipush #-6719
    //   441: sipush #14609
    //   444: invokestatic b : (II)Ljava/lang/String;
    //   447: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   450: pop
    //   451: iload_3
    //   452: ifne -> 610
    //   455: aload #5
    //   457: aload_0
    //   458: getfield Zk : [Z
    //   461: arraylength
    //   462: iload #4
    //   464: isub
    //   465: invokestatic toString : (I)Ljava/lang/String;
    //   468: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   471: pop
    //   472: aload #5
    //   474: sipush #-6709
    //   477: sipush #-17536
    //   480: invokestatic b : (II)Ljava/lang/String;
    //   483: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   486: pop
    //   487: aload #5
    //   489: iload #4
    //   491: invokestatic toString : (I)Ljava/lang/String;
    //   494: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   497: pop
    //   498: aload #5
    //   500: sipush #-6711
    //   503: sipush #-30092
    //   506: invokestatic b : (II)Ljava/lang/String;
    //   509: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: pop
    //   513: iconst_1
    //   514: istore #6
    //   516: iconst_0
    //   517: istore #7
    //   519: iload #7
    //   521: aload_0
    //   522: getfield Zk : [Z
    //   525: arraylength
    //   526: if_icmpge -> 595
    //   529: aload_0
    //   530: getfield Zk : [Z
    //   533: iload #7
    //   535: baload
    //   536: ifeq -> 588
    //   539: iload #6
    //   541: ifeq -> 562
    //   544: aload #5
    //   546: iload #7
    //   548: invokestatic toString : (I)Ljava/lang/String;
    //   551: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   554: pop
    //   555: iconst_0
    //   556: istore #6
    //   558: iload_3
    //   559: ifne -> 588
    //   562: aload #5
    //   564: sipush #-6707
    //   567: sipush #14208
    //   570: invokestatic b : (II)Ljava/lang/String;
    //   573: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   576: pop
    //   577: aload #5
    //   579: iload #7
    //   581: invokestatic toString : (I)Ljava/lang/String;
    //   584: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   587: pop
    //   588: iinc #7, 1
    //   591: iload_3
    //   592: ifne -> 519
    //   595: aload #5
    //   597: sipush #-6718
    //   600: sipush #18522
    //   603: invokestatic b : (II)Ljava/lang/String;
    //   606: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   609: pop
    //   610: aload_0
    //   611: getfield ZG : Ljava/lang/String;
    //   614: ifnull -> 632
    //   617: iload #4
    //   619: ifle -> 632
    //   622: aload #5
    //   624: aload_0
    //   625: getfield ZG : Ljava/lang/String;
    //   628: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   631: pop
    //   632: new burp/Zbqc
    //   635: dup
    //   636: invokespecial <init> : ()V
    //   639: astore #6
    //   641: aload #6
    //   643: new javax/swing/border/EmptyBorder
    //   646: dup
    //   647: iconst_0
    //   648: iconst_0
    //   649: bipush #15
    //   651: iconst_0
    //   652: invokespecial <init> : (IIII)V
    //   655: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   658: aload #6
    //   660: new java/awt/BorderLayout
    //   663: dup
    //   664: invokespecial <init> : ()V
    //   667: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   670: new burp/Zbkc
    //   673: dup
    //   674: sipush #-6706
    //   677: sipush #-14722
    //   680: invokestatic b : (II)Ljava/lang/String;
    //   683: invokespecial <init> : (Ljava/lang/String;)V
    //   686: astore #7
    //   688: aload #6
    //   690: aload #7
    //   692: sipush #-6715
    //   695: sipush #4508
    //   698: invokestatic b : (II)Ljava/lang/String;
    //   701: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   704: new burp/Zl8w
    //   707: dup
    //   708: aload #5
    //   710: invokevirtual toString : ()Ljava/lang/String;
    //   713: invokespecial <init> : (Ljava/lang/String;)V
    //   716: astore #8
    //   718: aload #6
    //   720: aload #8
    //   722: sipush #-6720
    //   725: sipush #4804
    //   728: invokestatic b : (II)Ljava/lang/String;
    //   731: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   734: new burp/Zbqc
    //   737: dup
    //   738: invokespecial <init> : ()V
    //   741: astore #9
    //   743: aload #9
    //   745: new java/awt/BorderLayout
    //   748: dup
    //   749: invokespecial <init> : ()V
    //   752: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   755: aload_0
    //   756: aload_1
    //   757: iload_2
    //   758: invokespecial ZP : (Ljava/util/List;I)Lburp/Zbqc;
    //   761: astore #10
    //   763: aload #9
    //   765: aload #6
    //   767: sipush #-6697
    //   770: sipush #-16321
    //   773: invokestatic b : (II)Ljava/lang/String;
    //   776: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   779: aload #9
    //   781: aload #10
    //   783: sipush #-6716
    //   786: sipush #-30992
    //   789: invokestatic b : (II)Ljava/lang/String;
    //   792: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   795: aload #9
    //   797: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'öf;H\\b@Þdý¯Ådø#3[0·\\bFÆsØï¼6aySë\\btú Éq;|Å*:ë®ñFX\\r¨d¹C¹ä¤}P*öy\$*%v"J0YXµpAXv®L{`ã6à°tpY¾\\fw0Iïè\\bãað¿ÿ3î®&÷Ù£<+*¯ýt#\\bIä­óü¡ó]óÛ3ÔJd½Ð¾Ç¯Î2bFÍoreé6BÏTÿ»÷rRW~Ä[ÚÁªg>'3¤ç³HÅÇÇT\á¡NRRÕØ[ÈáæHÁô%x\\tUa<I ì?6ehE;V¢iÆRDC9ÁRRí£|Wà®ÉyDåÛ..§}ý\\f~÷Ò¢¸Ðc\\nú2ø=èñCêÝ´7e³iÚ´÷£t/a­Øê}æ\\bÜ=CÔ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #35
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #97
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
    //   68: ldc '­EåÞGe¼ä`m½_üsËHnVt?õ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #29
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #21
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
    //   129: putstatic burp/Zgo9.c : [Ljava/lang/String;
    //   132: bipush #20
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgo9.d : [Ljava/lang/String;
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
    //   212: bipush #46
    //   214: goto -> 244
    //   217: bipush #88
    //   219: goto -> 244
    //   222: bipush #65
    //   224: goto -> 244
    //   227: bipush #104
    //   229: goto -> 244
    //   232: bipush #66
    //   234: goto -> 244
    //   237: bipush #12
    //   239: goto -> 244
    //   242: bipush #27
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
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE5C6) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      char c = '';
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgo9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */