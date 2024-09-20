package burp;

import java.io.IOException;
import java.util.ArrayList;

public class Zkyj extends Zkte {
  private static final byte[] ZZ = new byte[] { 
      48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
      97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 
      107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 
      117, 118, 119, 120, 121, 122 };
  
  private static final byte[][][] Zd = new byte[256][][];
  
  private final Zg66 ZC;
  
  public Zkyj(Zg66 paramZg66, Zr_4 paramZr_4) {
    super(paramZr_4, paramZg66);
    this.ZC = paramZg66;
  }
  
  protected byte[][] Zw(Zzlx paramZzlx, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZC : Lburp/Zg66;
    //   4: invokeinterface Zgl : ()Lburp/Zefg;
    //   9: astore #4
    //   11: invokestatic Zo : ()Ljava/lang/String;
    //   14: aload_0
    //   15: getfield ZC : Lburp/Zg66;
    //   18: invokeinterface ZgQ : ()Lburp/Zrte;
    //   23: astore #5
    //   25: astore_3
    //   26: aload_0
    //   27: getfield ZC : Lburp/Zg66;
    //   30: invokeinterface ZgZ : ()B
    //   35: istore #6
    //   37: aload_0
    //   38: getfield ZC : Lburp/Zg66;
    //   41: invokeinterface Zg4 : ()I
    //   46: iconst_m1
    //   47: if_icmpeq -> 90
    //   50: aload_0
    //   51: getfield ZC : Lburp/Zg66;
    //   54: invokeinterface Zg4 : ()I
    //   59: aload #5
    //   61: invokeinterface Zpu : ()I
    //   66: if_icmpeq -> 90
    //   69: aload_0
    //   70: getfield ZC : Lburp/Zg66;
    //   73: invokeinterface Zg4 : ()I
    //   78: aload_0
    //   79: getfield ZC : Lburp/Zg66;
    //   82: invokeinterface ZgF : ()I
    //   87: if_icmplt -> 227
    //   90: aload_0
    //   91: getfield ZC : Lburp/Zg66;
    //   94: invokeinterface Zgs : ()I
    //   99: aload #4
    //   101: invokeinterface size : ()I
    //   106: if_icmpne -> 139
    //   109: aload_0
    //   110: getfield ZC : Lburp/Zg66;
    //   113: aload_0
    //   114: getfield ZC : Lburp/Zg66;
    //   117: invokeinterface ZgB : ()I
    //   122: invokeinterface ZvH : (I)V
    //   127: aload_0
    //   128: getfield ZC : Lburp/Zg66;
    //   131: iconst_0
    //   132: invokeinterface ZcN : (Z)V
    //   137: aconst_null
    //   138: areturn
    //   139: aload_0
    //   140: getfield ZC : Lburp/Zg66;
    //   143: aload #4
    //   145: aload_0
    //   146: getfield ZC : Lburp/Zg66;
    //   149: invokeinterface Zgs : ()I
    //   154: invokeinterface get : (I)Ljava/lang/Object;
    //   159: checkcast burp/Zstu
    //   162: invokeinterface Zq : (Lburp/Zstu;)V
    //   167: aload_0
    //   168: getfield ZC : Lburp/Zg66;
    //   171: aload_0
    //   172: getfield ZC : Lburp/Zg66;
    //   175: invokeinterface Zgs : ()I
    //   180: iconst_1
    //   181: iadd
    //   182: invokeinterface ZDb : (I)V
    //   187: aload_0
    //   188: getfield ZC : Lburp/Zg66;
    //   191: invokeinterface ZgE : ()Lburp/Zstu;
    //   196: invokeinterface ZiD : ()[B
    //   201: iconst_1
    //   202: newarray byte
    //   204: dup
    //   205: iconst_0
    //   206: iload #6
    //   208: bastore
    //   209: iconst_1
    //   210: invokestatic ZL : ([B[BZ)I
    //   213: iconst_m1
    //   214: if_icmpeq -> 90
    //   217: aload_0
    //   218: getfield ZC : Lburp/Zg66;
    //   221: iconst_0
    //   222: invokeinterface ZDW : (I)V
    //   227: new java/io/ByteArrayOutputStream
    //   230: dup
    //   231: invokespecial <init> : ()V
    //   234: astore #7
    //   236: iconst_0
    //   237: istore #8
    //   239: iload #8
    //   241: aload_0
    //   242: getfield ZC : Lburp/Zg66;
    //   245: invokeinterface ZgE : ()Lburp/Zstu;
    //   250: invokeinterface Zpu : ()I
    //   255: if_icmpge -> 365
    //   258: aload_0
    //   259: getfield ZC : Lburp/Zg66;
    //   262: invokeinterface ZgE : ()Lburp/Zstu;
    //   267: iload #8
    //   269: invokeinterface Zp : (I)B
    //   274: iload #6
    //   276: if_icmpne -> 337
    //   279: aload #7
    //   281: aload #5
    //   283: aload_0
    //   284: getfield ZC : Lburp/Zg66;
    //   287: invokeinterface Zg4 : ()I
    //   292: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   297: checkcast burp/Zstu
    //   300: invokeinterface ZiD : ()[B
    //   305: iconst_0
    //   306: aload #5
    //   308: aload_0
    //   309: getfield ZC : Lburp/Zg66;
    //   312: invokeinterface Zg4 : ()I
    //   317: invokeinterface ZdF : (I)Lburp/Zgpi;
    //   322: checkcast burp/Zstu
    //   325: invokeinterface Zpu : ()I
    //   330: invokevirtual write : ([BII)V
    //   333: aload_3
    //   334: ifnonnull -> 358
    //   337: aload #7
    //   339: aload_0
    //   340: getfield ZC : Lburp/Zg66;
    //   343: invokeinterface ZgE : ()Lburp/Zstu;
    //   348: iload #8
    //   350: invokeinterface Zp : (I)B
    //   355: invokevirtual write : (I)V
    //   358: iinc #8, 1
    //   361: aload_3
    //   362: ifnonnull -> 239
    //   365: aload_0
    //   366: getfield ZC : Lburp/Zg66;
    //   369: aload_0
    //   370: getfield ZC : Lburp/Zg66;
    //   373: invokeinterface Zg4 : ()I
    //   378: iconst_1
    //   379: iadd
    //   380: invokeinterface ZDW : (I)V
    //   385: aload_0
    //   386: getfield ZC : Lburp/Zg66;
    //   389: aload_0
    //   390: getfield ZC : Lburp/Zg66;
    //   393: invokeinterface ZgB : ()I
    //   398: iconst_1
    //   399: iadd
    //   400: invokeinterface ZDx : (I)V
    //   405: aload_0
    //   406: getfield ZC : Lburp/Zg66;
    //   409: invokeinterface Zyn : ()Lburp/Zm41;
    //   414: new burp/Zr1f
    //   417: dup
    //   418: aload_1
    //   419: invokespecial <init> : (Lburp/Zzlx;)V
    //   422: aload_2
    //   423: aload #7
    //   425: invokevirtual toByteArray : ()[B
    //   428: invokeinterface Zm : (Lburp/Zm42;[B[B)[[B
    //   433: areturn
  }
  
  public void Zy4() {
    this.ZC.Zy4();
  }
  
  public void ZS(Zs4f paramZs4f) throws IOException {
    this.ZC.ZS(paramZs4f);
  }
  
  public static Zrte<Zstu> Zs(Zg66 paramZg66, Zr_4 paramZr_4) {
    byte[][] arrayOfByte = ZL(paramZg66);
    Zrte<Zstu> zrte = paramZr_4.<Zrte>Zv((Zllg)new Zguz<>(Zstu.Zc), arrayOfByte.length);
    String str = Ztpi.Zo();
    byte b = 0;
    while (b < arrayOfByte.length) {
      byte[] arrayOfByte1 = arrayOfByte[b];
      zrte.ZU(b, (arrayOfByte1 == null) ? null : paramZr_4.ZZ(arrayOfByte1));
      b++;
      if (str == null)
        break; 
    } 
    return zrte;
  }
  
  private static byte[][] ZL(Zg66 paramZg66) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface ZgF : ()I
    //   6: istore_2
    //   7: aload_0
    //   8: invokeinterface Zgm : ()B
    //   13: istore_3
    //   14: aload_0
    //   15: invokeinterface ZgN : ()B
    //   20: istore #4
    //   22: invokestatic Zo : ()Ljava/lang/String;
    //   25: aload_0
    //   26: invokeinterface ZgO : ()Z
    //   31: istore #5
    //   33: aload_0
    //   34: invokeinterface ZgU : ()Z
    //   39: istore #6
    //   41: new java/util/ArrayList
    //   44: dup
    //   45: invokespecial <init> : ()V
    //   48: astore #7
    //   50: astore_1
    //   51: new java/util/ArrayList
    //   54: dup
    //   55: invokespecial <init> : ()V
    //   58: astore #8
    //   60: iconst_0
    //   61: istore #9
    //   63: aload #7
    //   65: iconst_1
    //   66: newarray byte
    //   68: dup
    //   69: iconst_0
    //   70: iload_3
    //   71: bastore
    //   72: invokeinterface add : (Ljava/lang/Object;)Z
    //   77: pop
    //   78: iload #4
    //   80: iconst_1
    //   81: if_icmple -> 119
    //   84: aload #7
    //   86: iconst_2
    //   87: newarray byte
    //   89: dup
    //   90: iconst_0
    //   91: bipush #-64
    //   93: bastore
    //   94: dup
    //   95: iconst_1
    //   96: sipush #128
    //   99: iload_3
    //   100: bipush #63
    //   102: iand
    //   103: ixor
    //   104: i2b
    //   105: bastore
    //   106: invokeinterface add : (Ljava/lang/Object;)Z
    //   111: pop
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   118: athrow
    //   119: iload #4
    //   121: iconst_2
    //   122: if_icmple -> 165
    //   125: aload #7
    //   127: iconst_3
    //   128: newarray byte
    //   130: dup
    //   131: iconst_0
    //   132: bipush #-32
    //   134: bastore
    //   135: dup
    //   136: iconst_1
    //   137: bipush #-128
    //   139: bastore
    //   140: dup
    //   141: iconst_2
    //   142: sipush #128
    //   145: iload_3
    //   146: bipush #63
    //   148: iand
    //   149: ixor
    //   150: i2b
    //   151: bastore
    //   152: invokeinterface add : (Ljava/lang/Object;)Z
    //   157: pop
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   164: athrow
    //   165: iload #4
    //   167: iconst_3
    //   168: if_icmple -> 216
    //   171: aload #7
    //   173: iconst_4
    //   174: newarray byte
    //   176: dup
    //   177: iconst_0
    //   178: bipush #-16
    //   180: bastore
    //   181: dup
    //   182: iconst_1
    //   183: bipush #-128
    //   185: bastore
    //   186: dup
    //   187: iconst_2
    //   188: bipush #-128
    //   190: bastore
    //   191: dup
    //   192: iconst_3
    //   193: sipush #128
    //   196: iload_3
    //   197: bipush #63
    //   199: iand
    //   200: ixor
    //   201: i2b
    //   202: bastore
    //   203: invokeinterface add : (Ljava/lang/Object;)Z
    //   208: pop
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   215: athrow
    //   216: iload #4
    //   218: iconst_4
    //   219: if_icmple -> 272
    //   222: aload #7
    //   224: iconst_5
    //   225: newarray byte
    //   227: dup
    //   228: iconst_0
    //   229: bipush #-8
    //   231: bastore
    //   232: dup
    //   233: iconst_1
    //   234: bipush #-128
    //   236: bastore
    //   237: dup
    //   238: iconst_2
    //   239: bipush #-128
    //   241: bastore
    //   242: dup
    //   243: iconst_3
    //   244: bipush #-128
    //   246: bastore
    //   247: dup
    //   248: iconst_4
    //   249: sipush #128
    //   252: iload_3
    //   253: bipush #63
    //   255: iand
    //   256: ixor
    //   257: i2b
    //   258: bastore
    //   259: invokeinterface add : (Ljava/lang/Object;)Z
    //   264: pop
    //   265: goto -> 272
    //   268: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   271: athrow
    //   272: iload #4
    //   274: iconst_5
    //   275: if_icmple -> 334
    //   278: aload #7
    //   280: bipush #6
    //   282: newarray byte
    //   284: dup
    //   285: iconst_0
    //   286: bipush #-4
    //   288: bastore
    //   289: dup
    //   290: iconst_1
    //   291: bipush #-128
    //   293: bastore
    //   294: dup
    //   295: iconst_2
    //   296: bipush #-128
    //   298: bastore
    //   299: dup
    //   300: iconst_3
    //   301: bipush #-128
    //   303: bastore
    //   304: dup
    //   305: iconst_4
    //   306: bipush #-128
    //   308: bastore
    //   309: dup
    //   310: iconst_5
    //   311: sipush #128
    //   314: iload_3
    //   315: bipush #63
    //   317: iand
    //   318: ixor
    //   319: i2b
    //   320: bastore
    //   321: invokeinterface add : (Ljava/lang/Object;)Z
    //   326: pop
    //   327: goto -> 334
    //   330: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   333: athrow
    //   334: aload_0
    //   335: invokeinterface Zgk : ()Z
    //   340: ifeq -> 781
    //   343: aload #7
    //   345: invokeinterface size : ()I
    //   350: istore #10
    //   352: iconst_0
    //   353: istore #11
    //   355: iload #11
    //   357: iload #10
    //   359: if_icmpge -> 781
    //   362: aload #7
    //   364: iload #11
    //   366: invokeinterface get : (I)Ljava/lang/Object;
    //   371: checkcast [B
    //   374: astore #12
    //   376: aload #12
    //   378: arraylength
    //   379: iconst_1
    //   380: if_icmple -> 774
    //   383: aload_0
    //   384: invokeinterface Zgp : ()Z
    //   389: ifeq -> 647
    //   392: goto -> 399
    //   395: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   398: athrow
    //   399: aload #12
    //   401: arraylength
    //   402: iconst_1
    //   403: isub
    //   404: newarray int
    //   406: astore #13
    //   408: aload #13
    //   410: iconst_0
    //   411: iaload
    //   412: iconst_4
    //   413: if_icmpge -> 643
    //   416: aload #12
    //   418: invokevirtual clone : ()Ljava/lang/Object;
    //   421: checkcast [B
    //   424: astore #14
    //   426: iconst_0
    //   427: istore #15
    //   429: iload #15
    //   431: aload #13
    //   433: arraylength
    //   434: if_icmpge -> 565
    //   437: aload #13
    //   439: iload #15
    //   441: iaload
    //   442: tableswitch default -> 558, 1 -> 468, 2 -> 497, 3 -> 529
    //   468: aload #14
    //   470: iload #15
    //   472: iconst_1
    //   473: iadd
    //   474: aload #14
    //   476: iload #15
    //   478: iconst_1
    //   479: iadd
    //   480: baload
    //   481: bipush #63
    //   483: iand
    //   484: i2b
    //   485: bastore
    //   486: aload_1
    //   487: ifnonnull -> 558
    //   490: goto -> 497
    //   493: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   496: athrow
    //   497: aload #14
    //   499: iload #15
    //   501: iconst_1
    //   502: iadd
    //   503: aload #14
    //   505: iload #15
    //   507: iconst_1
    //   508: iadd
    //   509: baload
    //   510: bipush #63
    //   512: iand
    //   513: bipush #64
    //   515: ixor
    //   516: i2b
    //   517: bastore
    //   518: aload_1
    //   519: ifnonnull -> 558
    //   522: goto -> 529
    //   525: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   528: athrow
    //   529: aload #14
    //   531: iload #15
    //   533: iconst_1
    //   534: iadd
    //   535: aload #14
    //   537: iload #15
    //   539: iconst_1
    //   540: iadd
    //   541: baload
    //   542: bipush #63
    //   544: iand
    //   545: sipush #192
    //   548: ixor
    //   549: i2b
    //   550: bastore
    //   551: goto -> 558
    //   554: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   557: athrow
    //   558: iinc #15, 1
    //   561: aload_1
    //   562: ifnonnull -> 429
    //   565: aload #7
    //   567: aload #14
    //   569: invokeinterface add : (Ljava/lang/Object;)Z
    //   574: pop
    //   575: aload #13
    //   577: aload #13
    //   579: arraylength
    //   580: iconst_1
    //   581: isub
    //   582: dup2
    //   583: iaload
    //   584: iconst_1
    //   585: iadd
    //   586: iastore
    //   587: aload #13
    //   589: arraylength
    //   590: iconst_1
    //   591: isub
    //   592: istore #15
    //   594: iload #15
    //   596: ifle -> 639
    //   599: aload #13
    //   601: iload #15
    //   603: iaload
    //   604: iconst_3
    //   605: if_icmple -> 632
    //   608: aload #13
    //   610: iload #15
    //   612: iconst_0
    //   613: iastore
    //   614: aload #13
    //   616: iload #15
    //   618: iconst_1
    //   619: isub
    //   620: dup2
    //   621: iaload
    //   622: iconst_1
    //   623: iadd
    //   624: iastore
    //   625: goto -> 632
    //   628: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   631: athrow
    //   632: iinc #15, -1
    //   635: aload_1
    //   636: ifnonnull -> 594
    //   639: aload_1
    //   640: ifnonnull -> 408
    //   643: aload_1
    //   644: ifnonnull -> 774
    //   647: iconst_1
    //   648: istore #13
    //   650: iload #13
    //   652: aload #12
    //   654: arraylength
    //   655: if_icmpge -> 774
    //   658: aload #12
    //   660: invokevirtual clone : ()Ljava/lang/Object;
    //   663: checkcast [B
    //   666: astore #14
    //   668: aload #14
    //   670: iload #13
    //   672: aload #14
    //   674: iload #13
    //   676: baload
    //   677: bipush #63
    //   679: iand
    //   680: i2b
    //   681: bastore
    //   682: aload #7
    //   684: aload #14
    //   686: invokeinterface add : (Ljava/lang/Object;)Z
    //   691: pop
    //   692: aload #12
    //   694: invokevirtual clone : ()Ljava/lang/Object;
    //   697: checkcast [B
    //   700: astore #14
    //   702: aload #14
    //   704: iload #13
    //   706: aload #14
    //   708: iload #13
    //   710: baload
    //   711: bipush #63
    //   713: iand
    //   714: bipush #64
    //   716: ixor
    //   717: i2b
    //   718: bastore
    //   719: aload #7
    //   721: aload #14
    //   723: invokeinterface add : (Ljava/lang/Object;)Z
    //   728: pop
    //   729: aload #12
    //   731: invokevirtual clone : ()Ljava/lang/Object;
    //   734: checkcast [B
    //   737: astore #14
    //   739: aload #14
    //   741: iload #13
    //   743: aload #14
    //   745: iload #13
    //   747: baload
    //   748: bipush #63
    //   750: iand
    //   751: sipush #192
    //   754: ixor
    //   755: i2b
    //   756: bastore
    //   757: aload #7
    //   759: aload #14
    //   761: invokeinterface add : (Ljava/lang/Object;)Z
    //   766: pop
    //   767: iinc #13, 1
    //   770: aload_1
    //   771: ifnonnull -> 650
    //   774: iinc #11, 1
    //   777: aload_1
    //   778: ifnonnull -> 355
    //   781: aload_0
    //   782: invokeinterface Zg7 : ()Z
    //   787: ifeq -> 1438
    //   790: aload #7
    //   792: invokeinterface iterator : ()Ljava/util/Iterator;
    //   797: astore #10
    //   799: aload #10
    //   801: invokeinterface hasNext : ()Z
    //   806: ifeq -> 1434
    //   809: aload #10
    //   811: invokeinterface next : ()Ljava/lang/Object;
    //   816: checkcast [B
    //   819: astore #11
    //   821: aload_0
    //   822: invokeinterface ZgG : ()Z
    //   827: ifeq -> 1161
    //   830: aload #11
    //   832: arraylength
    //   833: newarray int
    //   835: astore #12
    //   837: aload #11
    //   839: arraylength
    //   840: newarray int
    //   842: astore #13
    //   844: iconst_0
    //   845: istore #14
    //   847: iload #14
    //   849: aload #13
    //   851: arraylength
    //   852: if_icmpge -> 898
    //   855: aload #13
    //   857: iload #14
    //   859: aload #11
    //   861: iload #14
    //   863: baload
    //   864: iastore
    //   865: aload #13
    //   867: iload #14
    //   869: iaload
    //   870: ifge -> 891
    //   873: aload #13
    //   875: iload #14
    //   877: dup2
    //   878: iaload
    //   879: sipush #256
    //   882: iadd
    //   883: iastore
    //   884: goto -> 891
    //   887: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   890: athrow
    //   891: iinc #14, 1
    //   894: aload_1
    //   895: ifnonnull -> 847
    //   898: aload #12
    //   900: iconst_0
    //   901: iaload
    //   902: getstatic burp/Zkyj.Zd : [[[B
    //   905: aload #13
    //   907: iconst_0
    //   908: iaload
    //   909: aaload
    //   910: arraylength
    //   911: if_icmpge -> 1157
    //   914: iload #9
    //   916: iload_2
    //   917: if_icmplt -> 938
    //   920: iload_2
    //   921: ifeq -> 938
    //   924: goto -> 931
    //   927: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   930: athrow
    //   931: goto -> 1157
    //   934: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   937: athrow
    //   938: new java/io/ByteArrayOutputStream
    //   941: dup
    //   942: invokespecial <init> : ()V
    //   945: astore #14
    //   947: iconst_0
    //   948: istore #15
    //   950: iload #15
    //   952: aload #11
    //   954: arraylength
    //   955: if_icmpge -> 1017
    //   958: iload #5
    //   960: ifeq -> 977
    //   963: aload #14
    //   965: bipush #37
    //   967: invokevirtual write : (I)V
    //   970: goto -> 977
    //   973: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   976: athrow
    //   977: aload #14
    //   979: getstatic burp/Zkyj.Zd : [[[B
    //   982: aload #13
    //   984: iload #15
    //   986: iaload
    //   987: aaload
    //   988: aload #12
    //   990: iload #15
    //   992: iaload
    //   993: aaload
    //   994: invokevirtual write : ([B)V
    //   997: goto -> 1010
    //   1000: astore #16
    //   1002: aload #16
    //   1004: getstatic net/portswigger/Zk_.IMPOSSIBLE : Lnet/portswigger/Zk_;
    //   1007: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1010: iinc #15, 1
    //   1013: aload_1
    //   1014: ifnonnull -> 950
    //   1017: aload #14
    //   1019: invokevirtual toByteArray : ()[B
    //   1022: astore #15
    //   1024: iload #6
    //   1026: ifne -> 1041
    //   1029: aload #15
    //   1031: invokestatic ZO : ([B)V
    //   1034: goto -> 1041
    //   1037: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1040: athrow
    //   1041: aload #15
    //   1043: invokestatic ZG : ([B)Ljava/lang/String;
    //   1046: astore #16
    //   1048: aload #8
    //   1050: aload #16
    //   1052: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1057: ifne -> 1080
    //   1060: aload #8
    //   1062: aload #16
    //   1064: invokeinterface add : (Ljava/lang/Object;)Z
    //   1069: pop
    //   1070: iinc #9, 1
    //   1073: goto -> 1080
    //   1076: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1079: athrow
    //   1080: aload #12
    //   1082: aload #12
    //   1084: arraylength
    //   1085: iconst_1
    //   1086: isub
    //   1087: dup2
    //   1088: iaload
    //   1089: iconst_1
    //   1090: iadd
    //   1091: iastore
    //   1092: aload #12
    //   1094: arraylength
    //   1095: iconst_1
    //   1096: isub
    //   1097: istore #17
    //   1099: iload #17
    //   1101: ifle -> 1153
    //   1104: aload #12
    //   1106: iload #17
    //   1108: iaload
    //   1109: getstatic burp/Zkyj.Zd : [[[B
    //   1112: aload #13
    //   1114: iload #17
    //   1116: iaload
    //   1117: aaload
    //   1118: arraylength
    //   1119: if_icmplt -> 1146
    //   1122: aload #12
    //   1124: iload #17
    //   1126: iconst_0
    //   1127: iastore
    //   1128: aload #12
    //   1130: iload #17
    //   1132: iconst_1
    //   1133: isub
    //   1134: dup2
    //   1135: iaload
    //   1136: iconst_1
    //   1137: iadd
    //   1138: iastore
    //   1139: goto -> 1146
    //   1142: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1145: athrow
    //   1146: iinc #17, -1
    //   1149: aload_1
    //   1150: ifnonnull -> 1099
    //   1153: aload_1
    //   1154: ifnonnull -> 898
    //   1157: aload_1
    //   1158: ifnonnull -> 1430
    //   1161: iconst_0
    //   1162: istore #12
    //   1164: iload #12
    //   1166: aload #11
    //   1168: arraylength
    //   1169: if_icmpge -> 1430
    //   1172: aload #11
    //   1174: iload #12
    //   1176: baload
    //   1177: istore #13
    //   1179: iload #13
    //   1181: ifge -> 1197
    //   1184: wide iinc #13 256
    //   1190: goto -> 1197
    //   1193: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1196: athrow
    //   1197: iconst_0
    //   1198: istore #14
    //   1200: iload #14
    //   1202: getstatic burp/Zkyj.Zd : [[[B
    //   1205: iload #13
    //   1207: aaload
    //   1208: arraylength
    //   1209: if_icmpge -> 1423
    //   1212: iload #9
    //   1214: iload_2
    //   1215: if_icmplt -> 1236
    //   1218: iload_2
    //   1219: ifeq -> 1236
    //   1222: goto -> 1229
    //   1225: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1228: athrow
    //   1229: goto -> 1423
    //   1232: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1235: athrow
    //   1236: new java/io/ByteArrayOutputStream
    //   1239: dup
    //   1240: invokespecial <init> : ()V
    //   1243: astore #15
    //   1245: iconst_0
    //   1246: istore #16
    //   1248: iload #16
    //   1250: aload #11
    //   1252: arraylength
    //   1253: if_icmpge -> 1353
    //   1256: iload #5
    //   1258: ifeq -> 1275
    //   1261: aload #15
    //   1263: bipush #37
    //   1265: invokevirtual write : (I)V
    //   1268: goto -> 1275
    //   1271: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1274: athrow
    //   1275: iload #16
    //   1277: iload #12
    //   1279: if_icmpne -> 1307
    //   1282: aload #15
    //   1284: getstatic burp/Zkyj.Zd : [[[B
    //   1287: iload #13
    //   1289: aaload
    //   1290: iload #14
    //   1292: aaload
    //   1293: invokevirtual write : ([B)V
    //   1296: aload_1
    //   1297: ifnonnull -> 1333
    //   1300: goto -> 1307
    //   1303: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1306: athrow
    //   1307: aload #15
    //   1309: iconst_1
    //   1310: newarray byte
    //   1312: dup
    //   1313: iconst_0
    //   1314: aload #11
    //   1316: iload #16
    //   1318: baload
    //   1319: bastore
    //   1320: invokestatic Zv : ([B)[B
    //   1323: invokevirtual write : ([B)V
    //   1326: goto -> 1333
    //   1329: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1332: athrow
    //   1333: goto -> 1346
    //   1336: astore #17
    //   1338: aload #17
    //   1340: getstatic net/portswigger/Zk_.IMPOSSIBLE : Lnet/portswigger/Zk_;
    //   1343: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1346: iinc #16, 1
    //   1349: aload_1
    //   1350: ifnonnull -> 1248
    //   1353: aload #15
    //   1355: invokevirtual toByteArray : ()[B
    //   1358: astore #16
    //   1360: iload #6
    //   1362: ifne -> 1377
    //   1365: aload #16
    //   1367: invokestatic ZO : ([B)V
    //   1370: goto -> 1377
    //   1373: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1376: athrow
    //   1377: aload #16
    //   1379: invokestatic ZG : ([B)Ljava/lang/String;
    //   1382: astore #17
    //   1384: aload #8
    //   1386: aload #17
    //   1388: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1393: ifne -> 1416
    //   1396: aload #8
    //   1398: aload #17
    //   1400: invokeinterface add : (Ljava/lang/Object;)Z
    //   1405: pop
    //   1406: iinc #9, 1
    //   1409: goto -> 1416
    //   1412: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1415: athrow
    //   1416: iinc #14, 1
    //   1419: aload_1
    //   1420: ifnonnull -> 1200
    //   1423: iinc #12, 1
    //   1426: aload_1
    //   1427: ifnonnull -> 1164
    //   1430: aload_1
    //   1431: ifnonnull -> 799
    //   1434: aload_1
    //   1435: ifnonnull -> 1650
    //   1438: aload #7
    //   1440: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1445: astore #10
    //   1447: aload #10
    //   1449: invokeinterface hasNext : ()Z
    //   1454: ifeq -> 1650
    //   1457: aload #10
    //   1459: invokeinterface next : ()Ljava/lang/Object;
    //   1464: checkcast [B
    //   1467: astore #11
    //   1469: iload #9
    //   1471: iload_2
    //   1472: if_icmplt -> 1493
    //   1475: iload_2
    //   1476: ifeq -> 1493
    //   1479: goto -> 1486
    //   1482: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1485: athrow
    //   1486: goto -> 1650
    //   1489: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1492: athrow
    //   1493: new java/io/ByteArrayOutputStream
    //   1496: dup
    //   1497: invokespecial <init> : ()V
    //   1500: astore #12
    //   1502: aload #11
    //   1504: astore #13
    //   1506: aload #13
    //   1508: arraylength
    //   1509: istore #14
    //   1511: iconst_0
    //   1512: istore #15
    //   1514: iload #15
    //   1516: iload #14
    //   1518: if_icmpge -> 1583
    //   1521: aload #13
    //   1523: iload #15
    //   1525: baload
    //   1526: istore #16
    //   1528: iload #5
    //   1530: ifeq -> 1547
    //   1533: aload #12
    //   1535: bipush #37
    //   1537: invokevirtual write : (I)V
    //   1540: goto -> 1547
    //   1543: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1546: athrow
    //   1547: aload #12
    //   1549: iconst_1
    //   1550: newarray byte
    //   1552: dup
    //   1553: iconst_0
    //   1554: iload #16
    //   1556: bastore
    //   1557: invokestatic Zv : ([B)[B
    //   1560: invokevirtual write : ([B)V
    //   1563: goto -> 1576
    //   1566: astore #17
    //   1568: aload #17
    //   1570: getstatic net/portswigger/Zk_.IMPOSSIBLE : Lnet/portswigger/Zk_;
    //   1573: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   1576: iinc #15, 1
    //   1579: aload_1
    //   1580: ifnonnull -> 1514
    //   1583: aload #12
    //   1585: invokevirtual toByteArray : ()[B
    //   1588: astore #13
    //   1590: iload #6
    //   1592: ifne -> 1607
    //   1595: aload #13
    //   1597: invokestatic ZO : ([B)V
    //   1600: goto -> 1607
    //   1603: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1606: athrow
    //   1607: aload #13
    //   1609: invokestatic ZG : ([B)Ljava/lang/String;
    //   1612: astore #14
    //   1614: aload #8
    //   1616: aload #14
    //   1618: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1623: ifne -> 1646
    //   1626: aload #8
    //   1628: aload #14
    //   1630: invokeinterface add : (Ljava/lang/Object;)Z
    //   1635: pop
    //   1636: iinc #9, 1
    //   1639: goto -> 1646
    //   1642: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   1645: athrow
    //   1646: aload_1
    //   1647: ifnonnull -> 1447
    //   1650: aload #8
    //   1652: invokeinterface size : ()I
    //   1657: anewarray [B
    //   1660: astore #10
    //   1662: iconst_0
    //   1663: istore #11
    //   1665: iload #11
    //   1667: aload #8
    //   1669: invokeinterface size : ()I
    //   1674: if_icmpge -> 1704
    //   1677: aload #10
    //   1679: iload #11
    //   1681: aload #8
    //   1683: iload #11
    //   1685: invokeinterface get : (I)Ljava/lang/Object;
    //   1690: checkcast java/lang/String
    //   1693: invokestatic Zy : (Ljava/lang/String;)[B
    //   1696: aastore
    //   1697: iinc #11, 1
    //   1700: aload_1
    //   1701: ifnonnull -> 1665
    //   1704: aload #10
    //   1706: areturn
    // Exception table:
    //   from	to	target	type
    //   63	112	115	java/io/IOException
    //   119	158	161	java/io/IOException
    //   165	209	212	java/io/IOException
    //   216	265	268	java/io/IOException
    //   272	327	330	java/io/IOException
    //   376	392	395	java/io/IOException
    //   437	490	493	java/io/IOException
    //   468	522	525	java/io/IOException
    //   497	551	554	java/io/IOException
    //   599	625	628	java/io/IOException
    //   855	884	887	java/io/IOException
    //   914	924	927	java/io/IOException
    //   920	934	934	java/io/IOException
    //   958	970	973	java/io/IOException
    //   977	997	1000	java/io/IOException
    //   1024	1034	1037	java/io/IOException
    //   1048	1073	1076	java/io/IOException
    //   1104	1139	1142	java/io/IOException
    //   1179	1190	1193	java/io/IOException
    //   1212	1222	1225	java/io/IOException
    //   1218	1232	1232	java/io/IOException
    //   1256	1268	1271	java/io/IOException
    //   1275	1300	1303	java/io/IOException
    //   1275	1333	1336	java/io/IOException
    //   1282	1326	1329	java/io/IOException
    //   1360	1370	1373	java/io/IOException
    //   1384	1409	1412	java/io/IOException
    //   1469	1479	1482	java/io/IOException
    //   1475	1489	1489	java/io/IOException
    //   1528	1540	1543	java/io/IOException
    //   1547	1563	1566	java/io/IOException
    //   1590	1600	1603	java/io/IOException
    //   1614	1639	1642	java/io/IOException
  }
  
  static {
    for (byte b = 0; b < 'Ā'; b++) {
      byte b1 = (byte)b;
      ArrayList<byte[]> arrayList = new ArrayList();
      for (byte b2 = 0; b2 < 36; b2++) {
        for (byte b3 = 0; b3 < 36; b3++) {
          byte b4 = (byte)(b2 * 16 + b3 & 0xFF);
          if (b4 == b1)
            arrayList.add(new byte[] { ZZ[b2], ZZ[b3] }); 
        } 
      } 
      Zd[b] = new byte[arrayList.size()][];
      Zd[b] = arrayList.<byte[]>toArray(Zd[b]);
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkyj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */