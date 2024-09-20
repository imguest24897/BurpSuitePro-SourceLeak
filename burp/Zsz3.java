package burp;

import java.util.Iterator;
import java.util.List;

class Zsz3 extends Zszs {
  final Zl4s Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zsz3(Zl4s paramZl4s) {
    super(paramZl4s.Zb, paramZl4s, paramZl4s.ZW, paramZl4s.ZU);
  }
  
  protected Zmj3 Zt(Zll9 paramZll9) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface ZoO : ()Lburp/Zstu;
    //   6: astore_3
    //   7: aconst_null
    //   8: checkcast burp/Zlit
    //   11: aload_3
    //   12: getstatic burp/Zt0k.HTML_ANALYSIS : Lburp/Zt0k;
    //   15: aload_0
    //   16: getfield Zv : Lburp/Zl4s;
    //   19: getfield ZV : Lburp/Zbnt;
    //   22: invokestatic Zt : (Lburp/Zlit;Lburp/Zstu;Lburp/Zt0k;Lburp/Zbnt;)Lburp/Zs68;
    //   25: astore #4
    //   27: invokestatic ZU : ()Ljava/lang/String;
    //   30: new java/util/ArrayList
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: astore #5
    //   39: astore_2
    //   40: aload #4
    //   42: getfield ZH : Lburp/Zk8m;
    //   45: getfield Zj : S
    //   48: tableswitch default -> 195, 256 -> 92, 257 -> 195, 258 -> 177, 259 -> 155, 260 -> 195, 261 -> 195, 262 -> 109
    //   92: aload_0
    //   93: aload_3
    //   94: aload #4
    //   96: getfield Zd : Ljava/util/List;
    //   99: aload #5
    //   101: iconst_1
    //   102: invokevirtual Zn : (Lburp/Zstu;Ljava/util/List;Ljava/util/List;Z)V
    //   105: aload_2
    //   106: ifnull -> 195
    //   109: aload #4
    //   111: getfield Zd : Ljava/util/List;
    //   114: ifnonnull -> 134
    //   117: aload #4
    //   119: getfield Zk : I
    //   122: aload_3
    //   123: aload #4
    //   125: getfield ZH : Lburp/Zk8m;
    //   128: invokestatic ZO : (ILburp/Zstu;Lburp/Zk8m;)Ljava/util/List;
    //   131: goto -> 139
    //   134: aload #4
    //   136: getfield Zd : Ljava/util/List;
    //   139: astore #6
    //   141: aload_0
    //   142: aload_3
    //   143: aload #6
    //   145: aload #5
    //   147: iconst_0
    //   148: invokevirtual Zn : (Lburp/Zstu;Ljava/util/List;Ljava/util/List;Z)V
    //   151: aload_2
    //   152: ifnull -> 195
    //   155: aload_0
    //   156: aload_3
    //   157: aload #4
    //   159: getfield Zk : I
    //   162: aload #4
    //   164: getfield Zs : I
    //   167: aload #5
    //   169: iconst_1
    //   170: invokevirtual Zj : (Lburp/Zstu;IILjava/util/List;Z)V
    //   173: aload_2
    //   174: ifnull -> 195
    //   177: aload_0
    //   178: aload_3
    //   179: aload #4
    //   181: getfield Zk : I
    //   184: aload #4
    //   186: getfield Zs : I
    //   189: aload #5
    //   191: iconst_0
    //   192: invokevirtual Zj : (Lburp/Zstu;IILjava/util/List;Z)V
    //   195: aload #5
    //   197: invokeinterface size : ()I
    //   202: ifle -> 218
    //   205: new burp/Zmj3
    //   208: dup
    //   209: aload_1
    //   210: aload #5
    //   212: invokespecial <init> : (Lburp/Zll9;Ljava/util/List;)V
    //   215: goto -> 219
    //   218: aconst_null
    //   219: areturn
  }
  
  private void Zn(Zstu paramZstu, List<Ztu8> paramList, List<Zkv5> paramList1, boolean paramBoolean) {
    Ztu8 ztu8 = null;
    Iterator<Ztu8> iterator = paramList.iterator();
    String str = Zl41.ZU();
    while (iterator.hasNext()) {
      Ztu8 ztu81 = iterator.next();
      switch (ztu81.ZlD()) {
        case 2:
        
        case 0:
          ztu8 = ztu81;
        case 1:
        case 4:
          ztu8 = null;
          break;
        case 3:
          if (paramBoolean && ztu8 != null && a(-20682, -2929).equalsIgnoreCase(ztu8.ZlP().ZJ3()))
            Zj(paramZstu, ztu81.ZlK(), ztu81.Zli(), paramList1, true); 
          break;
      } 
      continue;
      if (str != null)
        break; 
    } 
  }
  
  private void Zj(Zstu paramZstu, int paramInt1, int paramInt2, List<Zkv5> paramList, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZU : ()Ljava/lang/String;
    //   3: astore #6
    //   5: iload_2
    //   6: istore #7
    //   8: iload #7
    //   10: iload_3
    //   11: if_icmpge -> 596
    //   14: iconst_2
    //   15: istore #8
    //   17: iload #7
    //   19: iload_3
    //   20: if_icmpge -> 249
    //   23: aload_1
    //   24: iload #7
    //   26: invokeinterface Zp : (I)B
    //   31: bipush #39
    //   33: if_icmpne -> 44
    //   36: iconst_1
    //   37: istore #8
    //   39: aload #6
    //   41: ifnull -> 249
    //   44: aload_1
    //   45: iload #7
    //   47: invokeinterface Zp : (I)B
    //   52: bipush #34
    //   54: if_icmpne -> 72
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   63: athrow
    //   64: iconst_0
    //   65: istore #8
    //   67: aload #6
    //   69: ifnull -> 249
    //   72: iload #7
    //   74: iconst_1
    //   75: iadd
    //   76: iload_3
    //   77: if_icmpge -> 140
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   86: athrow
    //   87: aload_1
    //   88: iload #7
    //   90: invokeinterface Zp : (I)B
    //   95: bipush #47
    //   97: if_icmpne -> 140
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: aload_1
    //   108: iload #7
    //   110: iconst_1
    //   111: iadd
    //   112: invokeinterface Zp : (I)B
    //   117: bipush #47
    //   119: if_icmpne -> 140
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: iconst_3
    //   130: istore #8
    //   132: iinc #7, 1
    //   135: aload #6
    //   137: ifnull -> 249
    //   140: iload #7
    //   142: iconst_1
    //   143: iadd
    //   144: iload_3
    //   145: if_icmpge -> 241
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: aload_1
    //   156: iload #7
    //   158: invokeinterface Zp : (I)B
    //   163: bipush #47
    //   165: if_icmpne -> 241
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   174: athrow
    //   175: aload_1
    //   176: iload #7
    //   178: iconst_1
    //   179: iadd
    //   180: invokeinterface Zp : (I)B
    //   185: bipush #42
    //   187: if_icmpne -> 241
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   196: athrow
    //   197: iconst_4
    //   198: istore #8
    //   200: iinc #7, 1
    //   203: iload #7
    //   205: iconst_1
    //   206: iadd
    //   207: iload_3
    //   208: if_icmpge -> 249
    //   211: aload_1
    //   212: iload #7
    //   214: iconst_1
    //   215: iadd
    //   216: invokeinterface Zp : (I)B
    //   221: bipush #42
    //   223: if_icmpne -> 249
    //   226: iinc #7, 1
    //   229: aload #6
    //   231: ifnull -> 203
    //   234: goto -> 241
    //   237: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   240: athrow
    //   241: iinc #7, 1
    //   244: aload #6
    //   246: ifnull -> 17
    //   249: iinc #7, 1
    //   252: iload #7
    //   254: istore #9
    //   256: iload #7
    //   258: iload_3
    //   259: if_icmpge -> 560
    //   262: aload_1
    //   263: iload #7
    //   265: invokeinterface Zp : (I)B
    //   270: bipush #92
    //   272: if_icmpne -> 290
    //   275: iinc #7, 2
    //   278: aload #6
    //   280: ifnull -> 256
    //   283: goto -> 290
    //   286: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   289: athrow
    //   290: iload #8
    //   292: iconst_1
    //   293: if_icmpne -> 323
    //   296: aload_1
    //   297: iload #7
    //   299: invokeinterface Zp : (I)B
    //   304: bipush #39
    //   306: if_icmpne -> 323
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   315: athrow
    //   316: goto -> 560
    //   319: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   322: athrow
    //   323: iload #8
    //   325: ifne -> 355
    //   328: aload_1
    //   329: iload #7
    //   331: invokeinterface Zp : (I)B
    //   336: bipush #34
    //   338: if_icmpne -> 355
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   347: athrow
    //   348: goto -> 560
    //   351: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   354: athrow
    //   355: iload #8
    //   357: iconst_3
    //   358: if_icmpne -> 444
    //   361: aload_1
    //   362: iload #7
    //   364: invokeinterface Zp : (I)B
    //   369: bipush #10
    //   371: if_icmpeq -> 401
    //   374: goto -> 381
    //   377: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   380: athrow
    //   381: aload_1
    //   382: iload #7
    //   384: invokeinterface Zp : (I)B
    //   389: bipush #13
    //   391: if_icmpne -> 444
    //   394: goto -> 401
    //   397: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   400: athrow
    //   401: iload #5
    //   403: ifeq -> 560
    //   406: goto -> 413
    //   409: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   412: athrow
    //   413: aload #4
    //   415: new burp/Zlsh
    //   418: dup
    //   419: iload #9
    //   421: iload #7
    //   423: invokespecial <init> : (II)V
    //   426: invokeinterface add : (Ljava/lang/Object;)Z
    //   431: pop
    //   432: aload #6
    //   434: ifnull -> 560
    //   437: goto -> 444
    //   440: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   443: athrow
    //   444: iload #8
    //   446: iconst_4
    //   447: if_icmpne -> 545
    //   450: goto -> 457
    //   453: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   456: athrow
    //   457: iload #7
    //   459: iconst_1
    //   460: iadd
    //   461: iload_3
    //   462: if_icmpge -> 545
    //   465: goto -> 472
    //   468: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   471: athrow
    //   472: aload_1
    //   473: iload #7
    //   475: invokeinterface Zp : (I)B
    //   480: bipush #42
    //   482: if_icmpne -> 545
    //   485: goto -> 492
    //   488: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   491: athrow
    //   492: aload_1
    //   493: iload #7
    //   495: iconst_1
    //   496: iadd
    //   497: invokeinterface Zp : (I)B
    //   502: bipush #47
    //   504: if_icmpne -> 545
    //   507: goto -> 514
    //   510: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   513: athrow
    //   514: aload #4
    //   516: new burp/Zlsh
    //   519: dup
    //   520: iload #9
    //   522: iload #7
    //   524: invokespecial <init> : (II)V
    //   527: invokeinterface add : (Ljava/lang/Object;)Z
    //   532: pop
    //   533: aload #6
    //   535: ifnull -> 560
    //   538: goto -> 545
    //   541: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   544: athrow
    //   545: iinc #7, 1
    //   548: aload #6
    //   550: ifnull -> 256
    //   553: goto -> 560
    //   556: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   559: athrow
    //   560: iload #8
    //   562: iconst_4
    //   563: if_icmpne -> 581
    //   566: iinc #7, 2
    //   569: aload #6
    //   571: ifnull -> 591
    //   574: goto -> 581
    //   577: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   580: athrow
    //   581: iinc #7, 1
    //   584: goto -> 591
    //   587: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   590: athrow
    //   591: aload #6
    //   593: ifnull -> 8
    //   596: goto -> 609
    //   599: astore #7
    //   601: aload #7
    //   603: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   606: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   609: return
    // Exception table:
    //   from	to	target	type
    //   5	596	599	java/lang/Exception
    //   39	57	60	java/lang/Exception
    //   67	80	83	java/lang/Exception
    //   72	100	103	java/lang/Exception
    //   87	122	125	java/lang/Exception
    //   132	148	151	java/lang/Exception
    //   140	168	171	java/lang/Exception
    //   155	190	193	java/lang/Exception
    //   211	234	237	java/lang/Exception
    //   262	283	286	java/lang/Exception
    //   290	309	312	java/lang/Exception
    //   296	319	319	java/lang/Exception
    //   323	341	344	java/lang/Exception
    //   328	351	351	java/lang/Exception
    //   355	374	377	java/lang/Exception
    //   361	394	397	java/lang/Exception
    //   381	406	409	java/lang/Exception
    //   401	437	440	java/lang/Exception
    //   413	450	453	java/lang/Exception
    //   444	465	468	java/lang/Exception
    //   457	485	488	java/lang/Exception
    //   472	507	510	java/lang/Exception
    //   492	538	541	java/lang/Exception
    //   514	553	556	java/lang/Exception
    //   560	574	577	java/lang/Exception
    //   566	584	587	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'êbyòY\\tBÔünÄÂßô'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #6
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #35
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zsz3.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zsz3.b : [Ljava/lang/String;
    //   79: goto -> 226
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: bipush #64
    //   154: goto -> 183
    //   157: bipush #125
    //   159: goto -> 183
    //   162: iconst_4
    //   163: goto -> 183
    //   166: bipush #86
    //   168: goto -> 183
    //   171: bipush #86
    //   173: goto -> 183
    //   176: bipush #118
    //   178: goto -> 183
    //   181: bipush #13
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFAF36) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsz3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */