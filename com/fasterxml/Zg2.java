package com.fasterxml;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public final class Zg2 extends Writer {
  private final Zv9 ZH;
  
  private OutputStream ZI;
  
  private byte[] Zt;
  
  private final int ZA;
  
  private int Zg;
  
  private int ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg2(Zv9 paramZv9, OutputStream paramOutputStream) {
    this.ZH = paramZv9;
    this.ZI = paramOutputStream;
    this.Zt = paramZv9.ZD();
    this.ZA = this.Zt.length - 4;
    this.Zg = 0;
  }
  
  public Writer append(char paramChar) throws IOException {
    write(paramChar);
    return this;
  }
  
  public void close() throws IOException {
    try {
      if (this.ZI != null) {
        try {
          if (this.Zg > 0) {
            this.ZI.write(this.Zt, 0, this.Zg);
            this.Zg = 0;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        OutputStream outputStream = this.ZI;
        this.ZI = null;
        byte[] arrayOfByte = this.Zt;
        try {
          if (arrayOfByte != null) {
            this.Zt = null;
            this.ZH.Zs(arrayOfByte);
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        outputStream.close();
        int i = this.ZW;
        try {
          this.ZW = 0;
          if (i > 0)
            Zn(i); 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZH.close();
  }
  
  public void flush() throws IOException {
    try {
      if (this.ZI != null) {
        try {
          if (this.Zg > 0) {
            this.ZI.write(this.Zt, 0, this.Zg);
            this.Zg = 0;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        this.ZI.flush();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void write(char[] paramArrayOfchar) throws IOException {
    write(paramArrayOfchar, 0, paramArrayOfchar.length);
  }
  
  public void write(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic ZD : ()I
    //   3: istore #4
    //   5: iload_3
    //   6: iconst_2
    //   7: if_icmpge -> 37
    //   10: iload_3
    //   11: iconst_1
    //   12: if_icmpne -> 36
    //   15: goto -> 22
    //   18: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   21: athrow
    //   22: aload_0
    //   23: aload_1
    //   24: iload_2
    //   25: caload
    //   26: invokevirtual write : (I)V
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   35: athrow
    //   36: return
    //   37: aload_0
    //   38: getfield ZW : I
    //   41: ifle -> 65
    //   44: aload_1
    //   45: iload_2
    //   46: iinc #2, 1
    //   49: caload
    //   50: istore #5
    //   52: iinc #3, -1
    //   55: aload_0
    //   56: aload_0
    //   57: iload #5
    //   59: invokevirtual Zm : (I)I
    //   62: invokevirtual write : (I)V
    //   65: aload_0
    //   66: getfield Zg : I
    //   69: istore #5
    //   71: aload_0
    //   72: getfield Zt : [B
    //   75: astore #6
    //   77: aload_0
    //   78: getfield ZA : I
    //   81: istore #7
    //   83: iload_3
    //   84: iload_2
    //   85: iadd
    //   86: istore_3
    //   87: iload_2
    //   88: iload_3
    //   89: if_icmpge -> 553
    //   92: iload #5
    //   94: iload #7
    //   96: if_icmplt -> 114
    //   99: aload_0
    //   100: getfield ZI : Ljava/io/OutputStream;
    //   103: aload #6
    //   105: iconst_0
    //   106: iload #5
    //   108: invokevirtual write : ([BII)V
    //   111: iconst_0
    //   112: istore #5
    //   114: aload_1
    //   115: iload_2
    //   116: iinc #2, 1
    //   119: caload
    //   120: istore #8
    //   122: iload #8
    //   124: sipush #128
    //   127: if_icmpge -> 232
    //   130: aload #6
    //   132: iload #5
    //   134: iinc #5, 1
    //   137: iload #8
    //   139: i2b
    //   140: bastore
    //   141: iload_3
    //   142: iload_2
    //   143: isub
    //   144: istore #9
    //   146: iload #7
    //   148: iload #5
    //   150: isub
    //   151: istore #10
    //   153: iload #9
    //   155: iload #10
    //   157: if_icmple -> 164
    //   160: iload #10
    //   162: istore #9
    //   164: iload #9
    //   166: iload_2
    //   167: iadd
    //   168: istore #9
    //   170: iload_2
    //   171: iload #9
    //   173: if_icmplt -> 181
    //   176: iload #4
    //   178: ifne -> 87
    //   181: aload_1
    //   182: iload_2
    //   183: iinc #2, 1
    //   186: caload
    //   187: istore #8
    //   189: iload #8
    //   191: sipush #128
    //   194: if_icmplt -> 209
    //   197: iload #4
    //   199: ifne -> 232
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   208: athrow
    //   209: aload #6
    //   211: iload #5
    //   213: iinc #5, 1
    //   216: iload #8
    //   218: i2b
    //   219: bastore
    //   220: iload #4
    //   222: ifne -> 170
    //   225: goto -> 232
    //   228: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   231: athrow
    //   232: iload #8
    //   234: sipush #2048
    //   237: if_icmpge -> 288
    //   240: aload #6
    //   242: iload #5
    //   244: iinc #5, 1
    //   247: sipush #192
    //   250: iload #8
    //   252: bipush #6
    //   254: ishr
    //   255: ior
    //   256: i2b
    //   257: bastore
    //   258: aload #6
    //   260: iload #5
    //   262: iinc #5, 1
    //   265: sipush #128
    //   268: iload #8
    //   270: bipush #63
    //   272: iand
    //   273: ior
    //   274: i2b
    //   275: bastore
    //   276: iload #4
    //   278: ifne -> 548
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   287: athrow
    //   288: iload #8
    //   290: ldc 55296
    //   292: if_icmplt -> 316
    //   295: goto -> 302
    //   298: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   301: athrow
    //   302: iload #8
    //   304: ldc 57343
    //   306: if_icmple -> 385
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   315: athrow
    //   316: aload #6
    //   318: iload #5
    //   320: iinc #5, 1
    //   323: sipush #224
    //   326: iload #8
    //   328: bipush #12
    //   330: ishr
    //   331: ior
    //   332: i2b
    //   333: bastore
    //   334: aload #6
    //   336: iload #5
    //   338: iinc #5, 1
    //   341: sipush #128
    //   344: iload #8
    //   346: bipush #6
    //   348: ishr
    //   349: bipush #63
    //   351: iand
    //   352: ior
    //   353: i2b
    //   354: bastore
    //   355: aload #6
    //   357: iload #5
    //   359: iinc #5, 1
    //   362: sipush #128
    //   365: iload #8
    //   367: bipush #63
    //   369: iand
    //   370: ior
    //   371: i2b
    //   372: bastore
    //   373: iload #4
    //   375: ifne -> 87
    //   378: goto -> 385
    //   381: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   384: athrow
    //   385: iload #8
    //   387: ldc 56319
    //   389: if_icmple -> 410
    //   392: aload_0
    //   393: iload #5
    //   395: putfield Zg : I
    //   398: iload #8
    //   400: invokestatic Zn : (I)V
    //   403: goto -> 410
    //   406: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   409: athrow
    //   410: aload_0
    //   411: iload #8
    //   413: putfield ZW : I
    //   416: iload_2
    //   417: iload_3
    //   418: if_icmplt -> 433
    //   421: iload #4
    //   423: ifne -> 553
    //   426: goto -> 433
    //   429: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   432: athrow
    //   433: aload_0
    //   434: aload_1
    //   435: iload_2
    //   436: iinc #2, 1
    //   439: caload
    //   440: invokevirtual Zm : (I)I
    //   443: istore #8
    //   445: iload #8
    //   447: ldc 1114111
    //   449: if_icmple -> 470
    //   452: aload_0
    //   453: iload #5
    //   455: putfield Zg : I
    //   458: iload #8
    //   460: invokestatic Zn : (I)V
    //   463: goto -> 470
    //   466: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   469: athrow
    //   470: aload #6
    //   472: iload #5
    //   474: iinc #5, 1
    //   477: sipush #240
    //   480: iload #8
    //   482: bipush #18
    //   484: ishr
    //   485: ior
    //   486: i2b
    //   487: bastore
    //   488: aload #6
    //   490: iload #5
    //   492: iinc #5, 1
    //   495: sipush #128
    //   498: iload #8
    //   500: bipush #12
    //   502: ishr
    //   503: bipush #63
    //   505: iand
    //   506: ior
    //   507: i2b
    //   508: bastore
    //   509: aload #6
    //   511: iload #5
    //   513: iinc #5, 1
    //   516: sipush #128
    //   519: iload #8
    //   521: bipush #6
    //   523: ishr
    //   524: bipush #63
    //   526: iand
    //   527: ior
    //   528: i2b
    //   529: bastore
    //   530: aload #6
    //   532: iload #5
    //   534: iinc #5, 1
    //   537: sipush #128
    //   540: iload #8
    //   542: bipush #63
    //   544: iand
    //   545: ior
    //   546: i2b
    //   547: bastore
    //   548: iload #4
    //   550: ifne -> 87
    //   553: aload_0
    //   554: iload #5
    //   556: putfield Zg : I
    //   559: return
    // Exception table:
    //   from	to	target	type
    //   5	15	18	java/io/IOException
    //   10	29	32	java/io/IOException
    //   189	202	205	java/io/IOException
    //   197	225	228	java/io/IOException
    //   232	281	284	java/io/IOException
    //   240	295	298	java/io/IOException
    //   288	309	312	java/io/IOException
    //   302	378	381	java/io/IOException
    //   385	403	406	java/io/IOException
    //   410	426	429	java/io/IOException
    //   445	463	466	java/io/IOException
  }
  
  public void write(int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZW : I
    //   8: ifle -> 21
    //   11: aload_0
    //   12: iload_1
    //   13: invokevirtual Zm : (I)I
    //   16: istore_1
    //   17: iload_2
    //   18: ifeq -> 77
    //   21: iload_1
    //   22: ldc 55296
    //   24: if_icmplt -> 77
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   33: athrow
    //   34: iload_1
    //   35: ldc 57343
    //   37: if_icmpgt -> 77
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   46: athrow
    //   47: iload_1
    //   48: ldc 56319
    //   50: if_icmple -> 71
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   59: athrow
    //   60: iload_1
    //   61: invokestatic Zn : (I)V
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   70: athrow
    //   71: aload_0
    //   72: iload_1
    //   73: putfield ZW : I
    //   76: return
    //   77: aload_0
    //   78: getfield Zg : I
    //   81: aload_0
    //   82: getfield ZA : I
    //   85: if_icmplt -> 116
    //   88: aload_0
    //   89: getfield ZI : Ljava/io/OutputStream;
    //   92: aload_0
    //   93: getfield Zt : [B
    //   96: iconst_0
    //   97: aload_0
    //   98: getfield Zg : I
    //   101: invokevirtual write : ([BII)V
    //   104: aload_0
    //   105: iconst_0
    //   106: putfield Zg : I
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   115: athrow
    //   116: iload_1
    //   117: sipush #128
    //   120: if_icmpge -> 152
    //   123: aload_0
    //   124: getfield Zt : [B
    //   127: aload_0
    //   128: dup
    //   129: getfield Zg : I
    //   132: dup_x1
    //   133: iconst_1
    //   134: iadd
    //   135: putfield Zg : I
    //   138: iload_1
    //   139: i2b
    //   140: bastore
    //   141: iload_2
    //   142: ifeq -> 399
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   151: athrow
    //   152: aload_0
    //   153: getfield Zg : I
    //   156: istore_3
    //   157: iload_1
    //   158: sipush #2048
    //   161: if_icmpge -> 211
    //   164: aload_0
    //   165: getfield Zt : [B
    //   168: iload_3
    //   169: iinc #3, 1
    //   172: sipush #192
    //   175: iload_1
    //   176: bipush #6
    //   178: ishr
    //   179: ior
    //   180: i2b
    //   181: bastore
    //   182: aload_0
    //   183: getfield Zt : [B
    //   186: iload_3
    //   187: iinc #3, 1
    //   190: sipush #128
    //   193: iload_1
    //   194: bipush #63
    //   196: iand
    //   197: ior
    //   198: i2b
    //   199: bastore
    //   200: iload_2
    //   201: ifeq -> 394
    //   204: goto -> 211
    //   207: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   210: athrow
    //   211: iload_1
    //   212: ldc 65535
    //   214: if_icmpgt -> 292
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   223: athrow
    //   224: aload_0
    //   225: getfield Zt : [B
    //   228: iload_3
    //   229: iinc #3, 1
    //   232: sipush #224
    //   235: iload_1
    //   236: bipush #12
    //   238: ishr
    //   239: ior
    //   240: i2b
    //   241: bastore
    //   242: aload_0
    //   243: getfield Zt : [B
    //   246: iload_3
    //   247: iinc #3, 1
    //   250: sipush #128
    //   253: iload_1
    //   254: bipush #6
    //   256: ishr
    //   257: bipush #63
    //   259: iand
    //   260: ior
    //   261: i2b
    //   262: bastore
    //   263: aload_0
    //   264: getfield Zt : [B
    //   267: iload_3
    //   268: iinc #3, 1
    //   271: sipush #128
    //   274: iload_1
    //   275: bipush #63
    //   277: iand
    //   278: ior
    //   279: i2b
    //   280: bastore
    //   281: iload_2
    //   282: ifeq -> 394
    //   285: goto -> 292
    //   288: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   291: athrow
    //   292: iload_1
    //   293: ldc 1114111
    //   295: if_icmple -> 316
    //   298: goto -> 305
    //   301: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   304: athrow
    //   305: iload_1
    //   306: invokestatic Zn : (I)V
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   315: athrow
    //   316: aload_0
    //   317: getfield Zt : [B
    //   320: iload_3
    //   321: iinc #3, 1
    //   324: sipush #240
    //   327: iload_1
    //   328: bipush #18
    //   330: ishr
    //   331: ior
    //   332: i2b
    //   333: bastore
    //   334: aload_0
    //   335: getfield Zt : [B
    //   338: iload_3
    //   339: iinc #3, 1
    //   342: sipush #128
    //   345: iload_1
    //   346: bipush #12
    //   348: ishr
    //   349: bipush #63
    //   351: iand
    //   352: ior
    //   353: i2b
    //   354: bastore
    //   355: aload_0
    //   356: getfield Zt : [B
    //   359: iload_3
    //   360: iinc #3, 1
    //   363: sipush #128
    //   366: iload_1
    //   367: bipush #6
    //   369: ishr
    //   370: bipush #63
    //   372: iand
    //   373: ior
    //   374: i2b
    //   375: bastore
    //   376: aload_0
    //   377: getfield Zt : [B
    //   380: iload_3
    //   381: iinc #3, 1
    //   384: sipush #128
    //   387: iload_1
    //   388: bipush #63
    //   390: iand
    //   391: ior
    //   392: i2b
    //   393: bastore
    //   394: aload_0
    //   395: iload_3
    //   396: putfield Zg : I
    //   399: return
    // Exception table:
    //   from	to	target	type
    //   17	27	30	java/io/IOException
    //   21	40	43	java/io/IOException
    //   34	53	56	java/io/IOException
    //   47	64	67	java/io/IOException
    //   77	109	112	java/io/IOException
    //   116	145	148	java/io/IOException
    //   157	204	207	java/io/IOException
    //   164	217	220	java/io/IOException
    //   211	285	288	java/io/IOException
    //   224	298	301	java/io/IOException
    //   292	309	312	java/io/IOException
  }
  
  public void write(String paramString) throws IOException {
    write(paramString, 0, paramString.length());
  }
  
  public void write(String paramString, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic ZD : ()I
    //   3: istore #4
    //   5: iload_3
    //   6: iconst_2
    //   7: if_icmpge -> 39
    //   10: iload_3
    //   11: iconst_1
    //   12: if_icmpne -> 38
    //   15: goto -> 22
    //   18: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   21: athrow
    //   22: aload_0
    //   23: aload_1
    //   24: iload_2
    //   25: invokevirtual charAt : (I)C
    //   28: invokevirtual write : (I)V
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   37: athrow
    //   38: return
    //   39: aload_0
    //   40: getfield ZW : I
    //   43: ifle -> 69
    //   46: aload_1
    //   47: iload_2
    //   48: iinc #2, 1
    //   51: invokevirtual charAt : (I)C
    //   54: istore #5
    //   56: iinc #3, -1
    //   59: aload_0
    //   60: aload_0
    //   61: iload #5
    //   63: invokevirtual Zm : (I)I
    //   66: invokevirtual write : (I)V
    //   69: aload_0
    //   70: getfield Zg : I
    //   73: istore #5
    //   75: aload_0
    //   76: getfield Zt : [B
    //   79: astore #6
    //   81: aload_0
    //   82: getfield ZA : I
    //   85: istore #7
    //   87: iload_3
    //   88: iload_2
    //   89: iadd
    //   90: istore_3
    //   91: iload_2
    //   92: iload_3
    //   93: if_icmpge -> 563
    //   96: iload #5
    //   98: iload #7
    //   100: if_icmplt -> 118
    //   103: aload_0
    //   104: getfield ZI : Ljava/io/OutputStream;
    //   107: aload #6
    //   109: iconst_0
    //   110: iload #5
    //   112: invokevirtual write : ([BII)V
    //   115: iconst_0
    //   116: istore #5
    //   118: aload_1
    //   119: iload_2
    //   120: iinc #2, 1
    //   123: invokevirtual charAt : (I)C
    //   126: istore #8
    //   128: iload #8
    //   130: sipush #128
    //   133: if_icmpge -> 240
    //   136: aload #6
    //   138: iload #5
    //   140: iinc #5, 1
    //   143: iload #8
    //   145: i2b
    //   146: bastore
    //   147: iload_3
    //   148: iload_2
    //   149: isub
    //   150: istore #9
    //   152: iload #7
    //   154: iload #5
    //   156: isub
    //   157: istore #10
    //   159: iload #9
    //   161: iload #10
    //   163: if_icmple -> 170
    //   166: iload #10
    //   168: istore #9
    //   170: iload #9
    //   172: iload_2
    //   173: iadd
    //   174: istore #9
    //   176: iload_2
    //   177: iload #9
    //   179: if_icmplt -> 187
    //   182: iload #4
    //   184: ifne -> 91
    //   187: aload_1
    //   188: iload_2
    //   189: iinc #2, 1
    //   192: invokevirtual charAt : (I)C
    //   195: istore #8
    //   197: iload #8
    //   199: sipush #128
    //   202: if_icmplt -> 217
    //   205: iload #4
    //   207: ifne -> 240
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   216: athrow
    //   217: aload #6
    //   219: iload #5
    //   221: iinc #5, 1
    //   224: iload #8
    //   226: i2b
    //   227: bastore
    //   228: iload #4
    //   230: ifne -> 176
    //   233: goto -> 240
    //   236: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   239: athrow
    //   240: iload #8
    //   242: sipush #2048
    //   245: if_icmpge -> 296
    //   248: aload #6
    //   250: iload #5
    //   252: iinc #5, 1
    //   255: sipush #192
    //   258: iload #8
    //   260: bipush #6
    //   262: ishr
    //   263: ior
    //   264: i2b
    //   265: bastore
    //   266: aload #6
    //   268: iload #5
    //   270: iinc #5, 1
    //   273: sipush #128
    //   276: iload #8
    //   278: bipush #63
    //   280: iand
    //   281: ior
    //   282: i2b
    //   283: bastore
    //   284: iload #4
    //   286: ifne -> 558
    //   289: goto -> 296
    //   292: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   295: athrow
    //   296: iload #8
    //   298: ldc 55296
    //   300: if_icmplt -> 324
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   309: athrow
    //   310: iload #8
    //   312: ldc 57343
    //   314: if_icmple -> 393
    //   317: goto -> 324
    //   320: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   323: athrow
    //   324: aload #6
    //   326: iload #5
    //   328: iinc #5, 1
    //   331: sipush #224
    //   334: iload #8
    //   336: bipush #12
    //   338: ishr
    //   339: ior
    //   340: i2b
    //   341: bastore
    //   342: aload #6
    //   344: iload #5
    //   346: iinc #5, 1
    //   349: sipush #128
    //   352: iload #8
    //   354: bipush #6
    //   356: ishr
    //   357: bipush #63
    //   359: iand
    //   360: ior
    //   361: i2b
    //   362: bastore
    //   363: aload #6
    //   365: iload #5
    //   367: iinc #5, 1
    //   370: sipush #128
    //   373: iload #8
    //   375: bipush #63
    //   377: iand
    //   378: ior
    //   379: i2b
    //   380: bastore
    //   381: iload #4
    //   383: ifne -> 91
    //   386: goto -> 393
    //   389: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   392: athrow
    //   393: iload #8
    //   395: ldc 56319
    //   397: if_icmple -> 418
    //   400: aload_0
    //   401: iload #5
    //   403: putfield Zg : I
    //   406: iload #8
    //   408: invokestatic Zn : (I)V
    //   411: goto -> 418
    //   414: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   417: athrow
    //   418: aload_0
    //   419: iload #8
    //   421: putfield ZW : I
    //   424: iload_2
    //   425: iload_3
    //   426: if_icmplt -> 441
    //   429: iload #4
    //   431: ifne -> 563
    //   434: goto -> 441
    //   437: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   440: athrow
    //   441: aload_0
    //   442: aload_1
    //   443: iload_2
    //   444: iinc #2, 1
    //   447: invokevirtual charAt : (I)C
    //   450: invokevirtual Zm : (I)I
    //   453: istore #8
    //   455: iload #8
    //   457: ldc 1114111
    //   459: if_icmple -> 480
    //   462: aload_0
    //   463: iload #5
    //   465: putfield Zg : I
    //   468: iload #8
    //   470: invokestatic Zn : (I)V
    //   473: goto -> 480
    //   476: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   479: athrow
    //   480: aload #6
    //   482: iload #5
    //   484: iinc #5, 1
    //   487: sipush #240
    //   490: iload #8
    //   492: bipush #18
    //   494: ishr
    //   495: ior
    //   496: i2b
    //   497: bastore
    //   498: aload #6
    //   500: iload #5
    //   502: iinc #5, 1
    //   505: sipush #128
    //   508: iload #8
    //   510: bipush #12
    //   512: ishr
    //   513: bipush #63
    //   515: iand
    //   516: ior
    //   517: i2b
    //   518: bastore
    //   519: aload #6
    //   521: iload #5
    //   523: iinc #5, 1
    //   526: sipush #128
    //   529: iload #8
    //   531: bipush #6
    //   533: ishr
    //   534: bipush #63
    //   536: iand
    //   537: ior
    //   538: i2b
    //   539: bastore
    //   540: aload #6
    //   542: iload #5
    //   544: iinc #5, 1
    //   547: sipush #128
    //   550: iload #8
    //   552: bipush #63
    //   554: iand
    //   555: ior
    //   556: i2b
    //   557: bastore
    //   558: iload #4
    //   560: ifne -> 91
    //   563: aload_0
    //   564: iload #5
    //   566: putfield Zg : I
    //   569: return
    // Exception table:
    //   from	to	target	type
    //   5	15	18	java/io/IOException
    //   10	31	34	java/io/IOException
    //   197	210	213	java/io/IOException
    //   205	233	236	java/io/IOException
    //   240	289	292	java/io/IOException
    //   248	303	306	java/io/IOException
    //   296	317	320	java/io/IOException
    //   310	386	389	java/io/IOException
    //   393	411	414	java/io/IOException
    //   418	434	437	java/io/IOException
    //   455	473	476	java/io/IOException
  }
  
  protected int Zm(int paramInt) throws IOException {
    int i = this.ZW;
    try {
      this.ZW = 0;
      if (paramInt >= 56320)
        try {
          if (paramInt <= 57343)
            return (i << 10) + paramInt + -56613888; 
          throw new IOException(a(-6726, -398) + Integer.toHexString(i) + a(-6727, 21756) + Integer.toHexString(paramInt) + a(-6723, 13919));
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    throw new IOException(a(-6726, -398) + Integer.toHexString(i) + a(-6727, 21756) + Integer.toHexString(paramInt) + a(-6723, 13919));
  }
  
  protected static void Zn(int paramInt) throws IOException {
    throw new IOException(ZL(paramInt));
  }
  
  protected static String ZL(int paramInt) {
    return (paramInt > 1114111) ? (a(-6722, 16348) + Integer.toHexString(paramInt) + a(-6724, -9111)) : ((paramInt >= 55296) ? ((paramInt <= 56319) ? (a(-6721, -31608) + Integer.toHexString(paramInt) + ")") : (a(-6725, 5632) + Integer.toHexString(paramInt) + ")")) : (a(-6731, -29777) + Integer.toHexString(paramInt) + a(-6728, 17482)));
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'dK;jòyaåºå§ì:?SIP,:½b]ê\_ª ´!*5ªó2!{Áõ"þ·¡¦áòa$0Ár(Ð!]m*V4Úßôy\\rÊ5$E£à+Y@'d¬sô:'íÜv/ÙYöÜì1éÔ®mAæõû©0õÅ´ê3ZsÒoÃÉèzQð D]7QæÀ\\nYN)Äd+ü ×iêF¹ôÁ<M°ó,¾l>ç¸¬íLF±v¬[á?ãÎ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #21
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #47
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
    //   68: ldc 'Ò\\n»$¸Ù¨ï@«ÍEÆºjæÎsé°x\\tº2F&âWÜ¨béss}pw'Ø÷Q¸4Ì±6$'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #36
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #31
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
    //   129: putstatic com/fasterxml/Zg2.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zg2.b : [Ljava/lang/String;
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
    //   212: bipush #57
    //   214: goto -> 244
    //   217: bipush #100
    //   219: goto -> 244
    //   222: bipush #111
    //   224: goto -> 244
    //   227: bipush #13
    //   229: goto -> 244
    //   232: bipush #23
    //   234: goto -> 244
    //   237: bipush #80
    //   239: goto -> 244
    //   242: bipush #56
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
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE5BD) & 0xFFFF;
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
      byte b1 = 84;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */