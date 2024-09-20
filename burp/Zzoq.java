package burp;

import java.io.IOException;
import java.io.Writer;

public class Zzoq {
  private final Zzi8 Zm;
  
  private final int Zp;
  
  private final Zey9 ZA;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zzoq(Zzi8 paramZzi8, int paramInt, Zey9 paramZey9) {
    this.Zm = paramZzi8;
    this.Zp = paramInt;
    this.ZA = paramZey9;
  }
  
  public void Za(boolean paramBoolean, String paramString, Writer paramWriter, Zsh9 paramZsh9) throws IOException {
    // Byte code:
    //   0: invokestatic Zq : ()Z
    //   3: istore #5
    //   5: iload_1
    //   6: ifeq -> 21
    //   9: aload #4
    //   11: getfield Zk : B
    //   14: goto -> 26
    //   17: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   20: athrow
    //   21: aload #4
    //   23: getfield Zs : B
    //   26: istore #6
    //   28: iload #6
    //   30: ifne -> 38
    //   33: return
    //   34: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   37: athrow
    //   38: iload_1
    //   39: ifeq -> 71
    //   42: aload_0
    //   43: getfield Zm : Lburp/Zzi8;
    //   46: aload_0
    //   47: getfield Zm : Lburp/Zzi8;
    //   50: invokeinterface Zod : ()Lburp/Zmzk;
    //   55: aload_0
    //   56: getfield ZA : Lburp/Zey9;
    //   59: invokeinterface ZL : (Lburp/Zmzk;Lburp/Zey9;)Lburp/Zstu;
    //   64: goto -> 80
    //   67: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   70: athrow
    //   71: aload_0
    //   72: getfield Zm : Lburp/Zzi8;
    //   75: invokeinterface ZoO : ()Lburp/Zstu;
    //   80: astore #7
    //   82: aload #7
    //   84: ifnull -> 104
    //   87: aload #7
    //   89: invokeinterface Zpu : ()I
    //   94: ifne -> 109
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: return
    //   105: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   108: athrow
    //   109: aload #7
    //   111: invokeinterface ZiD : ()[B
    //   116: astore #8
    //   118: aload_3
    //   119: aload_0
    //   120: getfield Zp : I
    //   123: aload_2
    //   124: aload_0
    //   125: getfield Zp : I
    //   128: istore #16
    //   130: astore #17
    //   132: istore #18
    //   134: sipush #-28666
    //   137: sipush #8333
    //   140: invokestatic a : (II)Ljava/lang/String;
    //   143: iload #18
    //   145: ldc '>'
    //   147: aload #17
    //   149: sipush #-28670
    //   152: sipush #-22162
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: iload #16
    //   160: sipush #-28672
    //   163: sipush #-4607
    //   166: invokestatic a : (II)Ljava/lang/String;
    //   169: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   174: invokevirtual write : (Ljava/lang/String;)V
    //   177: aload_3
    //   178: sipush #-28669
    //   181: sipush #-8593
    //   184: invokestatic a : (II)Ljava/lang/String;
    //   187: invokevirtual write : (Ljava/lang/String;)V
    //   190: iload #6
    //   192: lookupswitch default -> 715, 1 -> 220, 2 -> 268
    //   220: iload_1
    //   221: aload #8
    //   223: new burp/Znx
    //   226: dup
    //   227: aload_3
    //   228: invokespecial <init> : (Ljava/io/Writer;)V
    //   231: iload_1
    //   232: ifeq -> 251
    //   235: aload_0
    //   236: getfield Zm : Lburp/Zzi8;
    //   239: invokeinterface ZaC : ()Lburp/Zefg;
    //   244: goto -> 260
    //   247: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   250: athrow
    //   251: aload_0
    //   252: getfield Zm : Lburp/Zzi8;
    //   255: invokeinterface Zae : ()Lburp/Zefg;
    //   260: invokestatic ZD : (Z[BLburp/Zxek;Lburp/Zefg;)V
    //   263: iload #5
    //   265: ifeq -> 732
    //   268: iload_1
    //   269: ifeq -> 291
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   278: athrow
    //   279: aload #4
    //   281: getfield ZH : I
    //   284: goto -> 296
    //   287: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   290: athrow
    //   291: aload #4
    //   293: getfield Zz : I
    //   296: istore #9
    //   298: iconst_0
    //   299: istore #10
    //   301: iload_1
    //   302: ifeq -> 321
    //   305: aload_0
    //   306: getfield Zm : Lburp/Zzi8;
    //   309: invokeinterface ZaC : ()Lburp/Zefg;
    //   314: goto -> 330
    //   317: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   320: athrow
    //   321: aload_0
    //   322: getfield Zm : Lburp/Zzi8;
    //   325: invokeinterface Zae : ()Lburp/Zefg;
    //   330: astore #11
    //   332: aload #11
    //   334: ifnull -> 632
    //   337: aload #11
    //   339: invokeinterface iterator : ()Ljava/util/Iterator;
    //   344: astore #12
    //   346: aload #12
    //   348: invokeinterface hasNext : ()Z
    //   353: ifeq -> 632
    //   356: aload #12
    //   358: invokeinterface next : ()Ljava/lang/Object;
    //   363: checkcast burp/Zrrc
    //   366: astore #13
    //   368: aload #13
    //   370: invokeinterface startOffset : ()I
    //   375: istore #14
    //   377: aload #13
    //   379: invokeinterface endOffset : ()I
    //   384: istore #15
    //   386: iload #14
    //   388: iload #10
    //   390: if_icmpge -> 397
    //   393: iload #10
    //   395: istore #14
    //   397: iload #15
    //   399: iload #14
    //   401: if_icmpge -> 408
    //   404: iload #14
    //   406: istore #15
    //   408: iload #15
    //   410: aload #8
    //   412: arraylength
    //   413: if_icmple -> 421
    //   416: aload #8
    //   418: arraylength
    //   419: istore #15
    //   421: iload #14
    //   423: iload #10
    //   425: if_icmple -> 499
    //   428: iload #14
    //   430: iload #9
    //   432: if_icmpgt -> 465
    //   435: goto -> 442
    //   438: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   441: athrow
    //   442: aload_3
    //   443: aload #8
    //   445: iload #10
    //   447: iload #14
    //   449: iconst_0
    //   450: invokestatic ZE : (Ljava/io/Writer;[BIIZ)V
    //   453: iload #5
    //   455: ifeq -> 499
    //   458: goto -> 465
    //   461: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   464: athrow
    //   465: aload_3
    //   466: aload #8
    //   468: iload #10
    //   470: iload #9
    //   472: iconst_0
    //   473: invokestatic ZE : (Ljava/io/Writer;[BIIZ)V
    //   476: aload_3
    //   477: sipush #-28664
    //   480: sipush #-27262
    //   483: invokestatic a : (II)Ljava/lang/String;
    //   486: invokevirtual write : (Ljava/lang/String;)V
    //   489: aload #8
    //   491: arraylength
    //   492: istore #10
    //   494: iload #5
    //   496: ifeq -> 632
    //   499: iload #15
    //   501: iload #14
    //   503: if_icmple -> 623
    //   506: goto -> 513
    //   509: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   512: athrow
    //   513: iload #15
    //   515: iload #9
    //   517: if_icmpgt -> 576
    //   520: goto -> 527
    //   523: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   526: athrow
    //   527: aload_3
    //   528: sipush #-28668
    //   531: sipush #-23006
    //   534: invokestatic a : (II)Ljava/lang/String;
    //   537: invokevirtual write : (Ljava/lang/String;)V
    //   540: aload_3
    //   541: aload #8
    //   543: iload #14
    //   545: iload #15
    //   547: iconst_0
    //   548: invokestatic ZE : (Ljava/io/Writer;[BIIZ)V
    //   551: aload_3
    //   552: sipush #-28661
    //   555: sipush #19166
    //   558: invokestatic a : (II)Ljava/lang/String;
    //   561: invokevirtual write : (Ljava/lang/String;)V
    //   564: iload #5
    //   566: ifeq -> 623
    //   569: goto -> 576
    //   572: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   575: athrow
    //   576: aload_3
    //   577: sipush #-28667
    //   580: sipush #-3659
    //   583: invokestatic a : (II)Ljava/lang/String;
    //   586: invokevirtual write : (Ljava/lang/String;)V
    //   589: aload_3
    //   590: aload #8
    //   592: iload #14
    //   594: iload #9
    //   596: iconst_0
    //   597: invokestatic ZE : (Ljava/io/Writer;[BIIZ)V
    //   600: aload_3
    //   601: sipush #-28662
    //   604: sipush #-30104
    //   607: invokestatic a : (II)Ljava/lang/String;
    //   610: invokevirtual write : (Ljava/lang/String;)V
    //   613: aload #8
    //   615: arraylength
    //   616: istore #10
    //   618: iload #5
    //   620: ifeq -> 632
    //   623: iload #15
    //   625: istore #10
    //   627: iload #5
    //   629: ifeq -> 346
    //   632: iload #10
    //   634: aload #8
    //   636: arraylength
    //   637: if_icmpge -> 732
    //   640: aload #8
    //   642: arraylength
    //   643: iload #9
    //   645: if_icmpgt -> 679
    //   648: goto -> 655
    //   651: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   654: athrow
    //   655: aload_3
    //   656: aload #8
    //   658: iload #10
    //   660: aload #8
    //   662: arraylength
    //   663: iconst_0
    //   664: invokestatic ZE : (Ljava/io/Writer;[BIIZ)V
    //   667: iload #5
    //   669: ifeq -> 732
    //   672: goto -> 679
    //   675: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   678: athrow
    //   679: aload_3
    //   680: aload #8
    //   682: iload #10
    //   684: iload #9
    //   686: iconst_0
    //   687: invokestatic ZE : (Ljava/io/Writer;[BIIZ)V
    //   690: aload_3
    //   691: sipush #-28665
    //   694: sipush #-7209
    //   697: invokestatic a : (II)Ljava/lang/String;
    //   700: invokevirtual write : (Ljava/lang/String;)V
    //   703: iload #5
    //   705: ifeq -> 732
    //   708: goto -> 715
    //   711: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   714: athrow
    //   715: iconst_0
    //   716: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   719: iload #6
    //   721: i2l
    //   722: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   725: goto -> 732
    //   728: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   731: athrow
    //   732: goto -> 745
    //   735: astore #9
    //   737: aload #9
    //   739: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   742: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   745: aload_3
    //   746: sipush #-28671
    //   749: sipush #8591
    //   752: invokestatic a : (II)Ljava/lang/String;
    //   755: invokevirtual write : (Ljava/lang/String;)V
    //   758: return
    // Exception table:
    //   from	to	target	type
    //   5	17	17	java/lang/Exception
    //   28	34	34	java/lang/Exception
    //   38	67	67	java/lang/Exception
    //   82	97	100	java/lang/Exception
    //   87	105	105	java/lang/Exception
    //   190	732	735	java/lang/Exception
    //   220	247	247	java/lang/Exception
    //   260	272	275	java/lang/Exception
    //   268	287	287	java/lang/Exception
    //   301	317	317	java/lang/Exception
    //   421	435	438	java/lang/Exception
    //   428	458	461	java/lang/Exception
    //   494	506	509	java/lang/Exception
    //   499	520	523	java/lang/Exception
    //   513	569	572	java/lang/Exception
    //   632	648	651	java/lang/Exception
    //   640	672	675	java/lang/Exception
    //   655	708	711	java/lang/Exception
    //   679	725	728	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'yøÝuÔb]Y49['ðübchècÈöîtLã³Þ(2ØXçïØ¾JÚäátl¡O\\rjûÛ×\\t¯CÒWHò:lên·äÏ¯³Fò\\ne¡¥m^ÇlxÊÎQHìû00Lµ\\rtvÓXZR¡ 5Q"ÉþÑuØÝÀÑü0ÅG¾ñ\w´¥4dµ­M<k«î'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_3
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #59
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc 'sÛVª|ó\\b2êhézþ2ÂQ®ÄOëèí\\t'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #7
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #12
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
    //   128: putstatic burp/Zzoq.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zzoq.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_1
    //   213: goto -> 243
    //   216: bipush #86
    //   218: goto -> 243
    //   221: bipush #93
    //   223: goto -> 243
    //   226: bipush #44
    //   228: goto -> 243
    //   231: bipush #21
    //   233: goto -> 243
    //   236: bipush #49
    //   238: goto -> 243
    //   241: bipush #113
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9002) & 0xFFFF;
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
      byte b1 = 2;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzoq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */