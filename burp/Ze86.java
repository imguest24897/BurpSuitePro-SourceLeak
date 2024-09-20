package burp;

import java.io.IOException;
import java.io.Reader;
import javax.swing.Action;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.Document;

public class Ze86 extends DefaultEditorKit {
  private static final Zz85[] Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zzbj Zg(Zmgw paramZmgw) {
    return new Zzbj(paramZmgw);
  }
  
  public Action[] getActions() {
    return (Action[])Zq;
  }
  
  public void read(Reader paramReader, Document paramDocument, int paramInt) throws IOException, BadLocationException {
    // Byte code:
    //   0: ldc 32768
    //   2: newarray char
    //   4: astore #5
    //   6: iconst_0
    //   7: istore #7
    //   9: iconst_0
    //   10: istore #8
    //   12: invokestatic ZT : ()I
    //   15: iconst_0
    //   16: istore #9
    //   18: istore #4
    //   20: aload_2
    //   21: invokeinterface getLength : ()I
    //   26: ifne -> 37
    //   29: iconst_1
    //   30: goto -> 38
    //   33: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   36: athrow
    //   37: iconst_0
    //   38: istore #11
    //   40: aload_1
    //   41: aload #5
    //   43: iconst_0
    //   44: aload #5
    //   46: arraylength
    //   47: invokevirtual read : ([CII)I
    //   50: dup
    //   51: istore #6
    //   53: iconst_m1
    //   54: if_icmpeq -> 431
    //   57: iconst_0
    //   58: istore #10
    //   60: iconst_0
    //   61: istore #12
    //   63: iload #12
    //   65: iload #6
    //   67: if_icmpge -> 325
    //   70: aload #5
    //   72: iload #12
    //   74: caload
    //   75: lookupswitch default -> 253, 10 -> 174, 13 -> 100
    //   100: iload #7
    //   102: ifeq -> 166
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   111: athrow
    //   112: iconst_1
    //   113: istore #9
    //   115: iload #12
    //   117: ifne -> 145
    //   120: aload_2
    //   121: iload_3
    //   122: ldc '\\n'
    //   124: aconst_null
    //   125: invokeinterface insertString : (ILjava/lang/String;Ljavax/swing/text/AttributeSet;)V
    //   130: iinc #3, 1
    //   133: iload #4
    //   135: ifne -> 317
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   144: athrow
    //   145: aload #5
    //   147: iload #12
    //   149: iconst_1
    //   150: isub
    //   151: bipush #10
    //   153: castore
    //   154: iload #4
    //   156: ifne -> 317
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   165: athrow
    //   166: iconst_1
    //   167: istore #7
    //   169: iload #4
    //   171: ifne -> 317
    //   174: iload #7
    //   176: ifeq -> 317
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   185: athrow
    //   186: iload #12
    //   188: iload #10
    //   190: iconst_1
    //   191: iadd
    //   192: if_icmple -> 238
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   201: athrow
    //   202: aload_2
    //   203: iload_3
    //   204: new java/lang/String
    //   207: dup
    //   208: aload #5
    //   210: iload #10
    //   212: iload #12
    //   214: iload #10
    //   216: isub
    //   217: iconst_1
    //   218: isub
    //   219: invokespecial <init> : ([CII)V
    //   222: aconst_null
    //   223: invokeinterface insertString : (ILjava/lang/String;Ljavax/swing/text/AttributeSet;)V
    //   228: iload_3
    //   229: iload #12
    //   231: iload #10
    //   233: isub
    //   234: iconst_1
    //   235: isub
    //   236: iadd
    //   237: istore_3
    //   238: iconst_0
    //   239: istore #7
    //   241: iload #12
    //   243: istore #10
    //   245: iconst_1
    //   246: istore #8
    //   248: iload #4
    //   250: ifne -> 317
    //   253: iload #7
    //   255: ifeq -> 317
    //   258: goto -> 265
    //   261: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   264: athrow
    //   265: iconst_1
    //   266: istore #9
    //   268: iload #12
    //   270: ifne -> 298
    //   273: aload_2
    //   274: iload_3
    //   275: ldc '\\n'
    //   277: aconst_null
    //   278: invokeinterface insertString : (ILjava/lang/String;Ljavax/swing/text/AttributeSet;)V
    //   283: iinc #3, 1
    //   286: iload #4
    //   288: ifne -> 314
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   297: athrow
    //   298: aload #5
    //   300: iload #12
    //   302: iconst_1
    //   303: isub
    //   304: bipush #10
    //   306: castore
    //   307: goto -> 314
    //   310: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   313: athrow
    //   314: iconst_0
    //   315: istore #7
    //   317: iinc #12, 1
    //   320: iload #4
    //   322: ifne -> 63
    //   325: iload #10
    //   327: iload #6
    //   329: if_icmpge -> 40
    //   332: iload #7
    //   334: ifeq -> 394
    //   337: iload #10
    //   339: iload #6
    //   341: iconst_1
    //   342: isub
    //   343: if_icmpge -> 40
    //   346: goto -> 353
    //   349: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   352: athrow
    //   353: aload_2
    //   354: iload_3
    //   355: new java/lang/String
    //   358: dup
    //   359: aload #5
    //   361: iload #10
    //   363: iload #6
    //   365: iload #10
    //   367: isub
    //   368: iconst_1
    //   369: isub
    //   370: invokespecial <init> : ([CII)V
    //   373: aconst_null
    //   374: invokeinterface insertString : (ILjava/lang/String;Ljavax/swing/text/AttributeSet;)V
    //   379: iload_3
    //   380: iload #6
    //   382: iload #10
    //   384: isub
    //   385: iconst_1
    //   386: isub
    //   387: iadd
    //   388: istore_3
    //   389: iload #4
    //   391: ifne -> 40
    //   394: aload_2
    //   395: iload_3
    //   396: new java/lang/String
    //   399: dup
    //   400: aload #5
    //   402: iload #10
    //   404: iload #6
    //   406: iload #10
    //   408: isub
    //   409: invokespecial <init> : ([CII)V
    //   412: aconst_null
    //   413: invokeinterface insertString : (ILjava/lang/String;Ljavax/swing/text/AttributeSet;)V
    //   418: iload_3
    //   419: iload #6
    //   421: iload #10
    //   423: isub
    //   424: iadd
    //   425: istore_3
    //   426: iload #4
    //   428: ifne -> 40
    //   431: iload #7
    //   433: ifeq -> 449
    //   436: aload_2
    //   437: iload_3
    //   438: ldc '\\n'
    //   440: aconst_null
    //   441: invokeinterface insertString : (ILjava/lang/String;Ljavax/swing/text/AttributeSet;)V
    //   446: iconst_1
    //   447: istore #9
    //   449: iload #11
    //   451: ifeq -> 567
    //   454: iload #8
    //   456: ifeq -> 502
    //   459: goto -> 466
    //   462: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   465: athrow
    //   466: aload_2
    //   467: sipush #-8150
    //   470: sipush #27772
    //   473: invokestatic a : (II)Ljava/lang/String;
    //   476: sipush #-8149
    //   479: sipush #-171
    //   482: invokestatic a : (II)Ljava/lang/String;
    //   485: invokeinterface putProperty : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   490: iload #4
    //   492: ifne -> 567
    //   495: goto -> 502
    //   498: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   501: athrow
    //   502: iload #9
    //   504: ifeq -> 543
    //   507: goto -> 514
    //   510: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   513: athrow
    //   514: aload_2
    //   515: sipush #-8175
    //   518: sipush #-28360
    //   521: invokestatic a : (II)Ljava/lang/String;
    //   524: ldc '\\r'
    //   526: invokeinterface putProperty : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   531: iload #4
    //   533: ifne -> 567
    //   536: goto -> 543
    //   539: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   542: athrow
    //   543: aload_2
    //   544: sipush #-8175
    //   547: sipush #-28360
    //   550: invokestatic a : (II)Ljava/lang/String;
    //   553: ldc '\\n'
    //   555: invokeinterface putProperty : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   560: goto -> 567
    //   563: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   566: athrow
    //   567: return
    // Exception table:
    //   from	to	target	type
    //   20	33	33	java/io/IOException
    //   70	105	108	java/io/IOException
    //   115	138	141	java/io/IOException
    //   120	159	162	java/io/IOException
    //   169	179	182	java/io/IOException
    //   174	195	198	java/io/IOException
    //   248	258	261	java/io/IOException
    //   268	291	294	java/io/IOException
    //   273	307	310	java/io/IOException
    //   332	346	349	java/io/IOException
    //   449	459	462	java/io/IOException
    //   454	495	498	java/io/IOException
    //   466	507	510	java/io/IOException
    //   502	536	539	java/io/IOException
    //   514	560	563	java/io/IOException
  }
  
  static {
    // Byte code:
    //   0: bipush #35
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'è¦çNy+·B -iúi^ìz¿¸k]¥-ÍSmn,p?¿Å $¨SWÿ²l«ºlê+` qKj\\n÷ÔÓ×ËØRÓi_ÊxkJ¶ôp£Ë\\t&e§u±ÍgÓUQ¹8Ë&ñÁSÌ\ÌÔÝùpm?ÈÅUt4GUäYtµíyåRfÏ)Òië}Ò}}@nNpo3(Z'((\ÐTLÉ¢»2ÊàdÙñdzï«¥H ç#\\fCïÎÀeÜèøÁX5bÐ!=Ë¯F®\\t<\R©SàIP\\r,Ä¸]jô\\týíæhÅù-Å?BW£cÝÉ´1Ï/\\rC­îê>ø.\\tê&^/û¼~0~$8/³§ã¬ïh¶,Euø!¢zIe!õä- RÎ¿µÍèN'Í¬\\b·öj]j!~òc¢MÜ&py¨Ð?E£Ë¿+ÆÞ÷\\b¦øe=[;ÿU\\rO3Ëåµ W5»º¯ñÈûd ÈgÞ¾xqÍØXBvä¾z¬Ó¡ïÎx/AÄô\\nÌBÖÃr\_Za¢\\rí,m³9ãÑ³Ì\\nCÎÙûÌãQr\\nh]QÚñnb²¡ã­?µ\\t¥?ÅW$n¨ÙeÍâß°z{¦«$4Bª#\\rÃßE+ñFe¤×'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #10
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
    //   68: ldc 'àùÝ»¬µ<\\föEÙþY'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_2
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #112
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
    //   128: putstatic burp/Ze86.a : [Ljava/lang/String;
    //   131: bipush #35
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Ze86.b : [Ljava/lang/String;
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
    //   212: bipush #71
    //   214: goto -> 244
    //   217: bipush #75
    //   219: goto -> 244
    //   222: bipush #111
    //   224: goto -> 244
    //   227: bipush #40
    //   229: goto -> 244
    //   232: bipush #25
    //   234: goto -> 244
    //   237: bipush #54
    //   239: goto -> 244
    //   242: bipush #115
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
    //   300: bipush #53
    //   302: anewarray burp/Zz85
    //   305: dup
    //   306: iconst_0
    //   307: new burp/Zzfz
    //   310: dup
    //   311: sipush #-8190
    //   314: sipush #-24236
    //   317: invokestatic a : (II)Ljava/lang/String;
    //   320: iconst_0
    //   321: invokespecial <init> : (Ljava/lang/String;Z)V
    //   324: aastore
    //   325: dup
    //   326: iconst_1
    //   327: new burp/Zzfz
    //   330: dup
    //   331: sipush #-8161
    //   334: sipush #-19593
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: iconst_1
    //   341: invokespecial <init> : (Ljava/lang/String;Z)V
    //   344: aastore
    //   345: dup
    //   346: iconst_2
    //   347: new burp/Zzfx
    //   350: dup
    //   351: sipush #-8186
    //   354: sipush #23894
    //   357: invokestatic a : (II)Ljava/lang/String;
    //   360: iconst_0
    //   361: invokespecial <init> : (Ljava/lang/String;Z)V
    //   364: aastore
    //   365: dup
    //   366: iconst_3
    //   367: new burp/Zzfx
    //   370: dup
    //   371: sipush #-8166
    //   374: sipush #27419
    //   377: invokestatic a : (II)Ljava/lang/String;
    //   380: iconst_1
    //   381: invokespecial <init> : (Ljava/lang/String;Z)V
    //   384: aastore
    //   385: dup
    //   386: iconst_4
    //   387: new burp/Zzfw
    //   390: dup
    //   391: sipush #-8162
    //   394: sipush #-2483
    //   397: invokestatic a : (II)Ljava/lang/String;
    //   400: iconst_0
    //   401: invokespecial <init> : (Ljava/lang/String;Z)V
    //   404: aastore
    //   405: dup
    //   406: iconst_5
    //   407: new burp/Zzfw
    //   410: dup
    //   411: sipush #-8180
    //   414: sipush #2192
    //   417: invokestatic a : (II)Ljava/lang/String;
    //   420: iconst_1
    //   421: invokespecial <init> : (Ljava/lang/String;Z)V
    //   424: aastore
    //   425: dup
    //   426: bipush #6
    //   428: new burp/Zzf0
    //   431: dup
    //   432: invokespecial <init> : ()V
    //   435: aastore
    //   436: dup
    //   437: bipush #7
    //   439: new burp/Zzfp
    //   442: dup
    //   443: invokespecial <init> : ()V
    //   446: aastore
    //   447: dup
    //   448: bipush #8
    //   450: new burp/Zzfs
    //   453: dup
    //   454: invokespecial <init> : ()V
    //   457: aastore
    //   458: dup
    //   459: bipush #9
    //   461: new burp/Zzf3
    //   464: dup
    //   465: invokespecial <init> : ()V
    //   468: aastore
    //   469: dup
    //   470: bipush #10
    //   472: new burp/Zzf1
    //   475: dup
    //   476: invokespecial <init> : ()V
    //   479: aastore
    //   480: dup
    //   481: bipush #11
    //   483: new burp/Zzfi
    //   486: dup
    //   487: invokespecial <init> : ()V
    //   490: aastore
    //   491: dup
    //   492: bipush #12
    //   494: new burp/Zzf9
    //   497: dup
    //   498: sipush #-8172
    //   501: sipush #28121
    //   504: invokestatic a : (II)Ljava/lang/String;
    //   507: iconst_0
    //   508: invokespecial <init> : (Ljava/lang/String;Z)V
    //   511: aastore
    //   512: dup
    //   513: bipush #13
    //   515: new burp/Zzf9
    //   518: dup
    //   519: sipush #-8188
    //   522: sipush #-21722
    //   525: invokestatic a : (II)Ljava/lang/String;
    //   528: iconst_1
    //   529: invokespecial <init> : (Ljava/lang/String;Z)V
    //   532: aastore
    //   533: dup
    //   534: bipush #14
    //   536: new burp/Zzf2
    //   539: dup
    //   540: sipush #-8167
    //   543: sipush #15573
    //   546: invokestatic a : (II)Ljava/lang/String;
    //   549: iconst_0
    //   550: invokespecial <init> : (Ljava/lang/String;Z)V
    //   553: aastore
    //   554: dup
    //   555: bipush #15
    //   557: new burp/Zzf2
    //   560: dup
    //   561: sipush #-8189
    //   564: sipush #25931
    //   567: invokestatic a : (II)Ljava/lang/String;
    //   570: iconst_1
    //   571: invokespecial <init> : (Ljava/lang/String;Z)V
    //   574: aastore
    //   575: dup
    //   576: bipush #16
    //   578: new burp/Zzfq
    //   581: dup
    //   582: sipush #-8165
    //   585: sipush #-16384
    //   588: invokestatic a : (II)Ljava/lang/String;
    //   591: iconst_0
    //   592: invokespecial <init> : (Ljava/lang/String;Z)V
    //   595: aastore
    //   596: dup
    //   597: bipush #17
    //   599: new burp/Zzfq
    //   602: dup
    //   603: sipush #-8184
    //   606: sipush #27305
    //   609: invokestatic a : (II)Ljava/lang/String;
    //   612: iconst_1
    //   613: invokespecial <init> : (Ljava/lang/String;Z)V
    //   616: aastore
    //   617: dup
    //   618: bipush #18
    //   620: new burp/Zzfv
    //   623: dup
    //   624: invokespecial <init> : ()V
    //   627: aastore
    //   628: dup
    //   629: bipush #19
    //   631: new burp/Zzfb
    //   634: dup
    //   635: invokespecial <init> : ()V
    //   638: aastore
    //   639: dup
    //   640: bipush #20
    //   642: new burp/Zzfe
    //   645: dup
    //   646: invokespecial <init> : ()V
    //   649: aastore
    //   650: dup
    //   651: bipush #21
    //   653: new burp/Zzfa
    //   656: dup
    //   657: invokespecial <init> : ()V
    //   660: aastore
    //   661: dup
    //   662: bipush #22
    //   664: new burp/Zzfk
    //   667: dup
    //   668: invokespecial <init> : ()V
    //   671: aastore
    //   672: dup
    //   673: bipush #23
    //   675: new burp/Zzfd
    //   678: dup
    //   679: invokespecial <init> : ()V
    //   682: aastore
    //   683: dup
    //   684: bipush #24
    //   686: new burp/Zzfc
    //   689: dup
    //   690: sipush #-8182
    //   693: sipush #-9629
    //   696: invokestatic a : (II)Ljava/lang/String;
    //   699: iconst_m1
    //   700: invokespecial <init> : (Ljava/lang/String;I)V
    //   703: aastore
    //   704: dup
    //   705: bipush #25
    //   707: new burp/Zzfc
    //   710: dup
    //   711: sipush #-8187
    //   714: sipush #11033
    //   717: invokestatic a : (II)Ljava/lang/String;
    //   720: iconst_1
    //   721: invokespecial <init> : (Ljava/lang/String;I)V
    //   724: aastore
    //   725: dup
    //   726: bipush #26
    //   728: new burp/Zzfg
    //   731: dup
    //   732: sipush #-8163
    //   735: sipush #-21128
    //   738: invokestatic a : (II)Ljava/lang/String;
    //   741: iconst_0
    //   742: iconst_3
    //   743: invokespecial <init> : (Ljava/lang/String;ZI)V
    //   746: aastore
    //   747: dup
    //   748: bipush #27
    //   750: new burp/Zzfg
    //   753: dup
    //   754: sipush #-8178
    //   757: sipush #1291
    //   760: invokestatic a : (II)Ljava/lang/String;
    //   763: iconst_0
    //   764: bipush #7
    //   766: invokespecial <init> : (Ljava/lang/String;ZI)V
    //   769: aastore
    //   770: dup
    //   771: bipush #28
    //   773: new burp/Zzfg
    //   776: dup
    //   777: sipush #-8179
    //   780: sipush #-28718
    //   783: invokestatic a : (II)Ljava/lang/String;
    //   786: iconst_1
    //   787: iconst_3
    //   788: invokespecial <init> : (Ljava/lang/String;ZI)V
    //   791: aastore
    //   792: dup
    //   793: bipush #29
    //   795: new burp/Zzfg
    //   798: dup
    //   799: sipush #-8192
    //   802: sipush #-403
    //   805: invokestatic a : (II)Ljava/lang/String;
    //   808: iconst_1
    //   809: bipush #7
    //   811: invokespecial <init> : (Ljava/lang/String;ZI)V
    //   814: aastore
    //   815: dup
    //   816: bipush #30
    //   818: new burp/Zzfg
    //   821: dup
    //   822: sipush #-8164
    //   825: sipush #16110
    //   828: invokestatic a : (II)Ljava/lang/String;
    //   831: iconst_0
    //   832: iconst_1
    //   833: invokespecial <init> : (Ljava/lang/String;ZI)V
    //   836: aastore
    //   837: dup
    //   838: bipush #31
    //   840: new burp/Zzfg
    //   843: dup
    //   844: sipush #-8170
    //   847: sipush #21972
    //   850: invokestatic a : (II)Ljava/lang/String;
    //   853: iconst_0
    //   854: iconst_5
    //   855: invokespecial <init> : (Ljava/lang/String;ZI)V
    //   858: aastore
    //   859: dup
    //   860: bipush #32
    //   862: new burp/Zzfg
    //   865: dup
    //   866: sipush #-8191
    //   869: sipush #-31286
    //   872: invokestatic a : (II)Ljava/lang/String;
    //   875: iconst_1
    //   876: iconst_1
    //   877: invokespecial <init> : (Ljava/lang/String;ZI)V
    //   880: aastore
    //   881: dup
    //   882: bipush #33
    //   884: new burp/Zzfg
    //   887: dup
    //   888: sipush #-8183
    //   891: sipush #20363
    //   894: invokestatic a : (II)Ljava/lang/String;
    //   897: iconst_1
    //   898: iconst_5
    //   899: invokespecial <init> : (Ljava/lang/String;ZI)V
    //   902: aastore
    //   903: dup
    //   904: bipush #34
    //   906: new burp/Zzfr
    //   909: dup
    //   910: sipush #-8152
    //   913: sipush #-12813
    //   916: invokestatic a : (II)Ljava/lang/String;
    //   919: iconst_0
    //   920: invokespecial <init> : (Ljava/lang/String;Z)V
    //   923: aastore
    //   924: dup
    //   925: bipush #35
    //   927: new burp/Zzfr
    //   930: dup
    //   931: sipush #-8174
    //   934: sipush #-16690
    //   937: invokestatic a : (II)Ljava/lang/String;
    //   940: iconst_1
    //   941: invokespecial <init> : (Ljava/lang/String;Z)V
    //   944: aastore
    //   945: dup
    //   946: bipush #36
    //   948: new burp/Zzfy
    //   951: dup
    //   952: sipush #-8181
    //   955: sipush #-31704
    //   958: invokestatic a : (II)Ljava/lang/String;
    //   961: iconst_0
    //   962: invokespecial <init> : (Ljava/lang/String;Z)V
    //   965: aastore
    //   966: dup
    //   967: bipush #37
    //   969: new burp/Zzfy
    //   972: dup
    //   973: sipush #-8177
    //   976: sipush #2025
    //   979: invokestatic a : (II)Ljava/lang/String;
    //   982: iconst_1
    //   983: invokespecial <init> : (Ljava/lang/String;Z)V
    //   986: aastore
    //   987: dup
    //   988: bipush #38
    //   990: new burp/Zzjo
    //   993: dup
    //   994: sipush #-8168
    //   997: sipush #29780
    //   1000: invokestatic a : (II)Ljava/lang/String;
    //   1003: iconst_m1
    //   1004: invokespecial <init> : (Ljava/lang/String;I)V
    //   1007: aastore
    //   1008: dup
    //   1009: bipush #39
    //   1011: new burp/Zzjo
    //   1014: dup
    //   1015: sipush #-8169
    //   1018: sipush #9813
    //   1021: invokestatic a : (II)Ljava/lang/String;
    //   1024: iconst_1
    //   1025: invokespecial <init> : (Ljava/lang/String;I)V
    //   1028: aastore
    //   1029: dup
    //   1030: bipush #40
    //   1032: new burp/Zzj8
    //   1035: dup
    //   1036: invokespecial <init> : ()V
    //   1039: aastore
    //   1040: dup
    //   1041: bipush #41
    //   1043: new burp/Zzjf
    //   1046: dup
    //   1047: invokespecial <init> : ()V
    //   1050: aastore
    //   1051: dup
    //   1052: bipush #42
    //   1054: new burp/Zzjj
    //   1057: dup
    //   1058: invokespecial <init> : ()V
    //   1061: aastore
    //   1062: dup
    //   1063: bipush #43
    //   1065: new burp/Zzj6
    //   1068: dup
    //   1069: invokespecial <init> : ()V
    //   1072: aastore
    //   1073: dup
    //   1074: bipush #44
    //   1076: new burp/Zzjz
    //   1079: dup
    //   1080: invokespecial <init> : ()V
    //   1083: aastore
    //   1084: dup
    //   1085: bipush #45
    //   1087: new burp/Zzjx
    //   1090: dup
    //   1091: invokespecial <init> : ()V
    //   1094: aastore
    //   1095: dup
    //   1096: bipush #46
    //   1098: new burp/Zzjw
    //   1101: dup
    //   1102: invokespecial <init> : ()V
    //   1105: aastore
    //   1106: dup
    //   1107: bipush #47
    //   1109: new burp/Zzjn
    //   1112: dup
    //   1113: invokespecial <init> : ()V
    //   1116: aastore
    //   1117: dup
    //   1118: bipush #48
    //   1120: new burp/Zzj_
    //   1123: dup
    //   1124: invokespecial <init> : ()V
    //   1127: aastore
    //   1128: dup
    //   1129: bipush #49
    //   1131: new burp/Zzj0
    //   1134: dup
    //   1135: sipush #-8173
    //   1138: sipush #9901
    //   1141: invokestatic a : (II)Ljava/lang/String;
    //   1144: iconst_m1
    //   1145: iconst_0
    //   1146: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   1149: aastore
    //   1150: dup
    //   1151: bipush #50
    //   1153: new burp/Zzj0
    //   1156: dup
    //   1157: sipush #-8185
    //   1160: sipush #12726
    //   1163: invokestatic a : (II)Ljava/lang/String;
    //   1166: iconst_1
    //   1167: iconst_0
    //   1168: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   1171: aastore
    //   1172: dup
    //   1173: bipush #51
    //   1175: new burp/Zzj0
    //   1178: dup
    //   1179: sipush #-8171
    //   1182: sipush #23771
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: iconst_m1
    //   1189: iconst_1
    //   1190: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   1193: aastore
    //   1194: dup
    //   1195: bipush #52
    //   1197: new burp/Zzj0
    //   1200: dup
    //   1201: sipush #-8176
    //   1204: sipush #-15654
    //   1207: invokestatic a : (II)Ljava/lang/String;
    //   1210: iconst_1
    //   1211: iconst_1
    //   1212: invokespecial <init> : (Ljava/lang/String;IZ)V
    //   1215: aastore
    //   1216: putstatic burp/Ze86.Zq : [Lburp/Zz85;
    //   1219: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE00A) & 0xFFFF;
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
      char c = 'Ì';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze86.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */