package burp;

import java.util.List;
import net.portswigger.Zmw;
import net.portswigger.Ztu;

public class Zku_ {
  public static List<Ztkq> Zu(String paramString, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZE : ()[I
    //   3: astore_3
    //   4: new java/util/ArrayList
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore #4
    //   13: iload_1
    //   14: istore #5
    //   16: iload #5
    //   18: iload_2
    //   19: if_icmpge -> 502
    //   22: iconst_2
    //   23: istore #6
    //   25: iload #5
    //   27: iload_2
    //   28: if_icmpge -> 200
    //   31: aload_0
    //   32: iload #5
    //   34: invokevirtual charAt : (I)C
    //   37: istore #7
    //   39: iload #7
    //   41: bipush #39
    //   43: if_icmpne -> 53
    //   46: iconst_1
    //   47: istore #6
    //   49: aload_3
    //   50: ifnull -> 200
    //   53: iload #7
    //   55: bipush #34
    //   57: if_icmpne -> 74
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: iconst_0
    //   68: istore #6
    //   70: aload_3
    //   71: ifnull -> 200
    //   74: iload #5
    //   76: iconst_1
    //   77: iadd
    //   78: iload_2
    //   79: if_icmpge -> 130
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: iload #7
    //   91: bipush #47
    //   93: if_icmpne -> 130
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: aload_0
    //   104: iload #5
    //   106: iconst_1
    //   107: iadd
    //   108: invokevirtual charAt : (I)C
    //   111: bipush #47
    //   113: if_icmpne -> 130
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: iconst_3
    //   124: istore #6
    //   126: aload_3
    //   127: ifnull -> 200
    //   130: iload #5
    //   132: iconst_1
    //   133: iadd
    //   134: iload_2
    //   135: if_icmpge -> 186
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   144: athrow
    //   145: iload #7
    //   147: bipush #47
    //   149: if_icmpne -> 186
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   158: athrow
    //   159: aload_0
    //   160: iload #5
    //   162: iconst_1
    //   163: iadd
    //   164: invokevirtual charAt : (I)C
    //   167: bipush #42
    //   169: if_icmpne -> 186
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   178: athrow
    //   179: iconst_4
    //   180: istore #6
    //   182: aload_3
    //   183: ifnull -> 200
    //   186: iinc #5, 1
    //   189: aload_3
    //   190: ifnull -> 25
    //   193: goto -> 200
    //   196: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   199: athrow
    //   200: iinc #5, 1
    //   203: iload #5
    //   205: istore #7
    //   207: iload #5
    //   209: iload_2
    //   210: if_icmpge -> 405
    //   213: aload_0
    //   214: iload #5
    //   216: invokevirtual charAt : (I)C
    //   219: istore #8
    //   221: iload #8
    //   223: bipush #92
    //   225: if_icmpne -> 242
    //   228: iinc #5, 2
    //   231: aload_3
    //   232: ifnull -> 207
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   241: athrow
    //   242: iload #6
    //   244: iconst_1
    //   245: if_icmpne -> 269
    //   248: iload #8
    //   250: bipush #39
    //   252: if_icmpne -> 269
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   261: athrow
    //   262: goto -> 405
    //   265: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   268: athrow
    //   269: iload #6
    //   271: ifne -> 295
    //   274: iload #8
    //   276: bipush #34
    //   278: if_icmpne -> 295
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   287: athrow
    //   288: goto -> 405
    //   291: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   294: athrow
    //   295: iload #6
    //   297: iconst_3
    //   298: if_icmpne -> 336
    //   301: iload #8
    //   303: bipush #10
    //   305: if_icmpeq -> 405
    //   308: goto -> 315
    //   311: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   314: athrow
    //   315: iload #8
    //   317: bipush #13
    //   319: if_icmpne -> 336
    //   322: goto -> 329
    //   325: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   328: athrow
    //   329: goto -> 405
    //   332: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   335: athrow
    //   336: iload #6
    //   338: iconst_4
    //   339: if_icmpne -> 398
    //   342: iload #5
    //   344: iconst_1
    //   345: iadd
    //   346: iload_2
    //   347: if_icmpge -> 398
    //   350: goto -> 357
    //   353: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   356: athrow
    //   357: iload #8
    //   359: bipush #42
    //   361: if_icmpne -> 398
    //   364: goto -> 371
    //   367: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   370: athrow
    //   371: aload_0
    //   372: iload #5
    //   374: iconst_1
    //   375: iadd
    //   376: invokevirtual charAt : (I)C
    //   379: bipush #47
    //   381: if_icmpne -> 398
    //   384: goto -> 391
    //   387: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   390: athrow
    //   391: goto -> 405
    //   394: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   397: athrow
    //   398: iinc #5, 1
    //   401: aload_3
    //   402: ifnull -> 207
    //   405: iload #5
    //   407: iload_2
    //   408: if_icmplt -> 418
    //   411: goto -> 502
    //   414: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   417: athrow
    //   418: iload #6
    //   420: iconst_1
    //   421: if_icmpeq -> 436
    //   424: iload #6
    //   426: ifne -> 468
    //   429: goto -> 436
    //   432: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   435: athrow
    //   436: aload #4
    //   438: new burp/Ztkq
    //   441: dup
    //   442: aload_0
    //   443: iload #7
    //   445: iload #5
    //   447: invokevirtual substring : (II)Ljava/lang/String;
    //   450: iload #7
    //   452: invokespecial <init> : (Ljava/lang/String;I)V
    //   455: invokeinterface add : (Ljava/lang/Object;)Z
    //   460: pop
    //   461: goto -> 468
    //   464: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   467: athrow
    //   468: iload #6
    //   470: iconst_4
    //   471: if_icmpne -> 488
    //   474: iinc #5, 2
    //   477: aload_3
    //   478: ifnull -> 498
    //   481: goto -> 488
    //   484: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   487: athrow
    //   488: iinc #5, 1
    //   491: goto -> 498
    //   494: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   497: athrow
    //   498: aload_3
    //   499: ifnull -> 16
    //   502: goto -> 515
    //   505: astore #5
    //   507: aload #5
    //   509: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   512: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   515: aload #4
    //   517: areturn
    // Exception table:
    //   from	to	target	type
    //   13	502	505	java/lang/Exception
    //   49	60	63	java/lang/Exception
    //   70	82	85	java/lang/Exception
    //   74	96	99	java/lang/Exception
    //   89	116	119	java/lang/Exception
    //   126	138	141	java/lang/Exception
    //   130	152	155	java/lang/Exception
    //   145	172	175	java/lang/Exception
    //   182	193	196	java/lang/Exception
    //   221	235	238	java/lang/Exception
    //   242	255	258	java/lang/Exception
    //   248	265	265	java/lang/Exception
    //   269	281	284	java/lang/Exception
    //   274	291	291	java/lang/Exception
    //   295	308	311	java/lang/Exception
    //   301	322	325	java/lang/Exception
    //   315	332	332	java/lang/Exception
    //   336	350	353	java/lang/Exception
    //   342	364	367	java/lang/Exception
    //   357	384	387	java/lang/Exception
    //   371	394	394	java/lang/Exception
    //   405	414	414	java/lang/Exception
    //   418	429	432	java/lang/Exception
    //   424	461	464	java/lang/Exception
    //   468	481	484	java/lang/Exception
    //   474	491	494	java/lang/Exception
  }
  
  public static byte Zi(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt2 < paramInt1 || paramInt1 < 0)
      return 2; 
    byte[] arrayOfByte = Ztu.ZM(Zmw.Zz(paramArrayOfbyte, paramInt1, paramInt2));
    return ZU(arrayOfByte, 0, arrayOfByte.length);
  }
  
  private static byte ZU(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZE : ()[I
    //   3: astore_3
    //   4: iload_1
    //   5: istore #4
    //   7: iload #4
    //   9: iload_2
    //   10: if_icmpgt -> 402
    //   13: iconst_2
    //   14: istore #5
    //   16: iload #4
    //   18: iload_2
    //   19: if_icmpgt -> 164
    //   22: iload #4
    //   24: iload_2
    //   25: if_icmplt -> 31
    //   28: iload #5
    //   30: ireturn
    //   31: aload_0
    //   32: iload #4
    //   34: baload
    //   35: istore #6
    //   37: iload #6
    //   39: bipush #39
    //   41: if_icmpne -> 51
    //   44: iconst_1
    //   45: istore #5
    //   47: aload_3
    //   48: ifnull -> 164
    //   51: iload #6
    //   53: bipush #34
    //   55: if_icmpne -> 72
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   64: athrow
    //   65: iconst_0
    //   66: istore #5
    //   68: aload_3
    //   69: ifnull -> 164
    //   72: iload #6
    //   74: bipush #47
    //   76: if_icmpne -> 111
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: aload_0
    //   87: iload #4
    //   89: iconst_1
    //   90: iadd
    //   91: baload
    //   92: bipush #47
    //   94: if_icmpne -> 111
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: iconst_3
    //   105: istore #5
    //   107: aload_3
    //   108: ifnull -> 164
    //   111: iload #6
    //   113: bipush #47
    //   115: if_icmpne -> 150
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: aload_0
    //   126: iload #4
    //   128: iconst_1
    //   129: iadd
    //   130: baload
    //   131: bipush #42
    //   133: if_icmpne -> 150
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   142: athrow
    //   143: iconst_4
    //   144: istore #5
    //   146: aload_3
    //   147: ifnull -> 164
    //   150: iinc #4, 1
    //   153: aload_3
    //   154: ifnull -> 16
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: iinc #4, 1
    //   167: iload #4
    //   169: iload_2
    //   170: if_icmpgt -> 355
    //   173: iload #4
    //   175: iload_2
    //   176: if_icmplt -> 182
    //   179: iload #5
    //   181: ireturn
    //   182: aload_0
    //   183: iload #4
    //   185: baload
    //   186: istore #6
    //   188: iload #6
    //   190: bipush #92
    //   192: if_icmpne -> 209
    //   195: iinc #4, 2
    //   198: aload_3
    //   199: ifnull -> 167
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   208: athrow
    //   209: iload #5
    //   211: iconst_1
    //   212: if_icmpne -> 236
    //   215: iload #6
    //   217: bipush #39
    //   219: if_icmpne -> 236
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   228: athrow
    //   229: goto -> 355
    //   232: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   235: athrow
    //   236: iload #5
    //   238: ifne -> 262
    //   241: iload #6
    //   243: bipush #34
    //   245: if_icmpne -> 262
    //   248: goto -> 255
    //   251: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   254: athrow
    //   255: goto -> 355
    //   258: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   261: athrow
    //   262: iload #5
    //   264: iconst_3
    //   265: if_icmpne -> 303
    //   268: iload #6
    //   270: bipush #10
    //   272: if_icmpeq -> 355
    //   275: goto -> 282
    //   278: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   281: athrow
    //   282: iload #6
    //   284: bipush #13
    //   286: if_icmpne -> 303
    //   289: goto -> 296
    //   292: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   295: athrow
    //   296: goto -> 355
    //   299: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   302: athrow
    //   303: iload #5
    //   305: iconst_4
    //   306: if_icmpne -> 348
    //   309: iload #6
    //   311: bipush #42
    //   313: if_icmpne -> 348
    //   316: goto -> 323
    //   319: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   322: athrow
    //   323: aload_0
    //   324: iload #4
    //   326: iconst_1
    //   327: iadd
    //   328: baload
    //   329: bipush #47
    //   331: if_icmpne -> 348
    //   334: goto -> 341
    //   337: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   340: athrow
    //   341: goto -> 355
    //   344: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   347: athrow
    //   348: iinc #4, 1
    //   351: aload_3
    //   352: ifnull -> 167
    //   355: iload #4
    //   357: iload_2
    //   358: if_icmplt -> 368
    //   361: goto -> 402
    //   364: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   367: athrow
    //   368: iload #5
    //   370: iconst_4
    //   371: if_icmpne -> 388
    //   374: iinc #4, 2
    //   377: aload_3
    //   378: ifnull -> 398
    //   381: goto -> 388
    //   384: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   387: athrow
    //   388: iinc #4, 1
    //   391: goto -> 398
    //   394: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   397: athrow
    //   398: aload_3
    //   399: ifnull -> 7
    //   402: goto -> 415
    //   405: astore #4
    //   407: aload #4
    //   409: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   412: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   415: iconst_2
    //   416: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	30	405	java/lang/Exception
    //   31	181	405	java/lang/Exception
    //   47	58	61	java/lang/Exception
    //   68	79	82	java/lang/Exception
    //   72	97	100	java/lang/Exception
    //   107	118	121	java/lang/Exception
    //   111	136	139	java/lang/Exception
    //   146	157	160	java/lang/Exception
    //   182	402	405	java/lang/Exception
    //   188	202	205	java/lang/Exception
    //   209	222	225	java/lang/Exception
    //   215	232	232	java/lang/Exception
    //   236	248	251	java/lang/Exception
    //   241	258	258	java/lang/Exception
    //   262	275	278	java/lang/Exception
    //   268	289	292	java/lang/Exception
    //   282	299	299	java/lang/Exception
    //   303	316	319	java/lang/Exception
    //   309	334	337	java/lang/Exception
    //   323	344	344	java/lang/Exception
    //   355	364	364	java/lang/Exception
    //   368	381	384	java/lang/Exception
    //   374	391	394	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zku_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */