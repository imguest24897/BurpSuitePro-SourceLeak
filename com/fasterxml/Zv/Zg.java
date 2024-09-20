package com.fasterxml.Zv;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.ref.SoftReference;

public final class Zg extends Writer {
  protected static final ThreadLocal<SoftReference<byte[][]>> Zo;
  
  protected final byte[][] ZK;
  
  private OutputStream ZR;
  
  private byte[] Zl;
  
  private final int Zg;
  
  private int Zx;
  
  int Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg(OutputStream paramOutputStream) {
    // Byte code:
    //   0: invokestatic Zr : ()Z
    //   3: aload_0
    //   4: invokespecial <init> : ()V
    //   7: aload_0
    //   8: iconst_0
    //   9: putfield Zw : I
    //   12: aload_0
    //   13: aload_1
    //   14: putfield ZR : Ljava/io/OutputStream;
    //   17: aload_0
    //   18: invokestatic Zg : ()[[B
    //   21: putfield ZK : [[B
    //   24: aload_0
    //   25: getfield ZK : [[B
    //   28: iconst_0
    //   29: aaload
    //   30: astore_3
    //   31: istore_2
    //   32: aload_3
    //   33: ifnonnull -> 46
    //   36: sipush #8000
    //   39: newarray byte
    //   41: astore_3
    //   42: iload_2
    //   43: ifne -> 53
    //   46: aload_0
    //   47: getfield ZK : [[B
    //   50: iconst_0
    //   51: aconst_null
    //   52: aastore
    //   53: aload_0
    //   54: aload_3
    //   55: putfield Zl : [B
    //   58: aload_0
    //   59: aload_0
    //   60: getfield Zl : [B
    //   63: arraylength
    //   64: iconst_4
    //   65: isub
    //   66: putfield Zg : I
    //   69: aload_0
    //   70: iconst_0
    //   71: putfield Zx : I
    //   74: return
  }
  
  private static byte[][] Zg() {
    byte[][] arrayOfByte = (byte[][])null;
    SoftReference<byte[][]> softReference = Zo.get();
    if (softReference != null)
      arrayOfByte = softReference.get(); 
    if (arrayOfByte == null) {
      arrayOfByte = new byte[1][];
      Zo.set((SoftReference)new SoftReference<>(arrayOfByte));
    } 
    return arrayOfByte;
  }
  
  public Writer append(char paramChar) throws IOException {
    write(paramChar);
    return this;
  }
  
  public void close() throws IOException {
    try {
      if (this.ZR != null) {
        try {
          if (this.Zx > 0) {
            this.ZR.write(this.Zl, 0, this.Zx);
            this.Zx = 0;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        OutputStream outputStream = this.ZR;
        this.ZR = null;
        if (this.ZK != null) {
          byte[] arrayOfByte = this.Zl;
          try {
            if (arrayOfByte != null) {
              this.Zl = null;
              this.ZK[0] = arrayOfByte;
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
        } 
        outputStream.close();
        int i = this.Zw;
        try {
          this.Zw = 0;
          if (i > 0)
            Zr(i); 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void flush() throws IOException {
    try {
      if (this.ZR != null) {
        try {
          if (this.Zx > 0) {
            this.ZR.write(this.Zl, 0, this.Zx);
            this.Zx = 0;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        this.ZR.flush();
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
    //   0: invokestatic Zr : ()Z
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
    //   38: getfield Zw : I
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
    //   59: invokespecial ZQ : (I)I
    //   62: invokevirtual write : (I)V
    //   65: aload_0
    //   66: getfield Zx : I
    //   69: istore #5
    //   71: aload_0
    //   72: getfield Zl : [B
    //   75: astore #6
    //   77: aload_0
    //   78: getfield Zg : I
    //   81: istore #7
    //   83: iload_3
    //   84: iload_2
    //   85: iadd
    //   86: istore_3
    //   87: iload_2
    //   88: iload_3
    //   89: if_icmpge -> 555
    //   92: iload #5
    //   94: iload #7
    //   96: if_icmplt -> 114
    //   99: aload_0
    //   100: getfield ZR : Ljava/io/OutputStream;
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
    //   278: ifne -> 550
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
    //   389: if_icmple -> 411
    //   392: aload_0
    //   393: iload #5
    //   395: putfield Zx : I
    //   398: aload_0
    //   399: iload #8
    //   401: invokespecial Zr : (I)V
    //   404: goto -> 411
    //   407: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   410: athrow
    //   411: aload_0
    //   412: iload #8
    //   414: putfield Zw : I
    //   417: iload_2
    //   418: iload_3
    //   419: if_icmplt -> 434
    //   422: iload #4
    //   424: ifne -> 555
    //   427: goto -> 434
    //   430: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   433: athrow
    //   434: aload_0
    //   435: aload_1
    //   436: iload_2
    //   437: iinc #2, 1
    //   440: caload
    //   441: invokespecial ZQ : (I)I
    //   444: istore #8
    //   446: iload #8
    //   448: ldc 1114111
    //   450: if_icmple -> 472
    //   453: aload_0
    //   454: iload #5
    //   456: putfield Zx : I
    //   459: aload_0
    //   460: iload #8
    //   462: invokespecial Zr : (I)V
    //   465: goto -> 472
    //   468: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   471: athrow
    //   472: aload #6
    //   474: iload #5
    //   476: iinc #5, 1
    //   479: sipush #240
    //   482: iload #8
    //   484: bipush #18
    //   486: ishr
    //   487: ior
    //   488: i2b
    //   489: bastore
    //   490: aload #6
    //   492: iload #5
    //   494: iinc #5, 1
    //   497: sipush #128
    //   500: iload #8
    //   502: bipush #12
    //   504: ishr
    //   505: bipush #63
    //   507: iand
    //   508: ior
    //   509: i2b
    //   510: bastore
    //   511: aload #6
    //   513: iload #5
    //   515: iinc #5, 1
    //   518: sipush #128
    //   521: iload #8
    //   523: bipush #6
    //   525: ishr
    //   526: bipush #63
    //   528: iand
    //   529: ior
    //   530: i2b
    //   531: bastore
    //   532: aload #6
    //   534: iload #5
    //   536: iinc #5, 1
    //   539: sipush #128
    //   542: iload #8
    //   544: bipush #63
    //   546: iand
    //   547: ior
    //   548: i2b
    //   549: bastore
    //   550: iload #4
    //   552: ifne -> 87
    //   555: aload_0
    //   556: iload #5
    //   558: putfield Zx : I
    //   561: return
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
    //   385	404	407	java/io/IOException
    //   411	427	430	java/io/IOException
    //   446	465	468	java/io/IOException
  }
  
  public void write(int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic Zr : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zw : I
    //   8: ifle -> 21
    //   11: aload_0
    //   12: iload_1
    //   13: invokespecial ZQ : (I)I
    //   16: istore_1
    //   17: iload_2
    //   18: ifne -> 78
    //   21: iload_1
    //   22: ldc 55296
    //   24: if_icmplt -> 78
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   33: athrow
    //   34: iload_1
    //   35: ldc 57343
    //   37: if_icmpgt -> 78
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   46: athrow
    //   47: iload_1
    //   48: ldc 56319
    //   50: if_icmple -> 72
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   59: athrow
    //   60: aload_0
    //   61: iload_1
    //   62: invokespecial Zr : (I)V
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   71: athrow
    //   72: aload_0
    //   73: iload_1
    //   74: putfield Zw : I
    //   77: return
    //   78: aload_0
    //   79: getfield Zx : I
    //   82: aload_0
    //   83: getfield Zg : I
    //   86: if_icmplt -> 117
    //   89: aload_0
    //   90: getfield ZR : Ljava/io/OutputStream;
    //   93: aload_0
    //   94: getfield Zl : [B
    //   97: iconst_0
    //   98: aload_0
    //   99: getfield Zx : I
    //   102: invokevirtual write : ([BII)V
    //   105: aload_0
    //   106: iconst_0
    //   107: putfield Zx : I
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   116: athrow
    //   117: iload_1
    //   118: sipush #128
    //   121: if_icmpge -> 153
    //   124: aload_0
    //   125: getfield Zl : [B
    //   128: aload_0
    //   129: dup
    //   130: getfield Zx : I
    //   133: dup_x1
    //   134: iconst_1
    //   135: iadd
    //   136: putfield Zx : I
    //   139: iload_1
    //   140: i2b
    //   141: bastore
    //   142: iload_2
    //   143: ifne -> 401
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   152: athrow
    //   153: aload_0
    //   154: getfield Zx : I
    //   157: istore_3
    //   158: iload_1
    //   159: sipush #2048
    //   162: if_icmpge -> 212
    //   165: aload_0
    //   166: getfield Zl : [B
    //   169: iload_3
    //   170: iinc #3, 1
    //   173: sipush #192
    //   176: iload_1
    //   177: bipush #6
    //   179: ishr
    //   180: ior
    //   181: i2b
    //   182: bastore
    //   183: aload_0
    //   184: getfield Zl : [B
    //   187: iload_3
    //   188: iinc #3, 1
    //   191: sipush #128
    //   194: iload_1
    //   195: bipush #63
    //   197: iand
    //   198: ior
    //   199: i2b
    //   200: bastore
    //   201: iload_2
    //   202: ifne -> 396
    //   205: goto -> 212
    //   208: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   211: athrow
    //   212: iload_1
    //   213: ldc 65535
    //   215: if_icmpgt -> 293
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   224: athrow
    //   225: aload_0
    //   226: getfield Zl : [B
    //   229: iload_3
    //   230: iinc #3, 1
    //   233: sipush #224
    //   236: iload_1
    //   237: bipush #12
    //   239: ishr
    //   240: ior
    //   241: i2b
    //   242: bastore
    //   243: aload_0
    //   244: getfield Zl : [B
    //   247: iload_3
    //   248: iinc #3, 1
    //   251: sipush #128
    //   254: iload_1
    //   255: bipush #6
    //   257: ishr
    //   258: bipush #63
    //   260: iand
    //   261: ior
    //   262: i2b
    //   263: bastore
    //   264: aload_0
    //   265: getfield Zl : [B
    //   268: iload_3
    //   269: iinc #3, 1
    //   272: sipush #128
    //   275: iload_1
    //   276: bipush #63
    //   278: iand
    //   279: ior
    //   280: i2b
    //   281: bastore
    //   282: iload_2
    //   283: ifne -> 396
    //   286: goto -> 293
    //   289: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   292: athrow
    //   293: iload_1
    //   294: ldc 1114111
    //   296: if_icmple -> 318
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   305: athrow
    //   306: aload_0
    //   307: iload_1
    //   308: invokespecial Zr : (I)V
    //   311: goto -> 318
    //   314: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   317: athrow
    //   318: aload_0
    //   319: getfield Zl : [B
    //   322: iload_3
    //   323: iinc #3, 1
    //   326: sipush #240
    //   329: iload_1
    //   330: bipush #18
    //   332: ishr
    //   333: ior
    //   334: i2b
    //   335: bastore
    //   336: aload_0
    //   337: getfield Zl : [B
    //   340: iload_3
    //   341: iinc #3, 1
    //   344: sipush #128
    //   347: iload_1
    //   348: bipush #12
    //   350: ishr
    //   351: bipush #63
    //   353: iand
    //   354: ior
    //   355: i2b
    //   356: bastore
    //   357: aload_0
    //   358: getfield Zl : [B
    //   361: iload_3
    //   362: iinc #3, 1
    //   365: sipush #128
    //   368: iload_1
    //   369: bipush #6
    //   371: ishr
    //   372: bipush #63
    //   374: iand
    //   375: ior
    //   376: i2b
    //   377: bastore
    //   378: aload_0
    //   379: getfield Zl : [B
    //   382: iload_3
    //   383: iinc #3, 1
    //   386: sipush #128
    //   389: iload_1
    //   390: bipush #63
    //   392: iand
    //   393: ior
    //   394: i2b
    //   395: bastore
    //   396: aload_0
    //   397: iload_3
    //   398: putfield Zx : I
    //   401: return
    // Exception table:
    //   from	to	target	type
    //   17	27	30	java/io/IOException
    //   21	40	43	java/io/IOException
    //   34	53	56	java/io/IOException
    //   47	65	68	java/io/IOException
    //   78	110	113	java/io/IOException
    //   117	146	149	java/io/IOException
    //   158	205	208	java/io/IOException
    //   165	218	221	java/io/IOException
    //   212	286	289	java/io/IOException
    //   225	299	302	java/io/IOException
    //   293	311	314	java/io/IOException
  }
  
  public void write(String paramString) throws IOException {
    write(paramString, 0, paramString.length());
  }
  
  public void write(String paramString, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()Z
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
    //   40: getfield Zw : I
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
    //   63: invokespecial ZQ : (I)I
    //   66: invokevirtual write : (I)V
    //   69: aload_0
    //   70: getfield Zx : I
    //   73: istore #5
    //   75: aload_0
    //   76: getfield Zl : [B
    //   79: astore #6
    //   81: aload_0
    //   82: getfield Zg : I
    //   85: istore #7
    //   87: iload_3
    //   88: iload_2
    //   89: iadd
    //   90: istore_3
    //   91: iload_2
    //   92: iload_3
    //   93: if_icmpge -> 565
    //   96: iload #5
    //   98: iload #7
    //   100: if_icmplt -> 118
    //   103: aload_0
    //   104: getfield ZR : Ljava/io/OutputStream;
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
    //   184: ifeq -> 91
    //   187: aload_1
    //   188: iload_2
    //   189: iinc #2, 1
    //   192: invokevirtual charAt : (I)C
    //   195: istore #8
    //   197: iload #8
    //   199: sipush #128
    //   202: if_icmplt -> 217
    //   205: iload #4
    //   207: ifeq -> 240
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
    //   230: ifeq -> 176
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
    //   286: ifeq -> 560
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
    //   383: ifeq -> 91
    //   386: goto -> 393
    //   389: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   392: athrow
    //   393: iload #8
    //   395: ldc 56319
    //   397: if_icmple -> 419
    //   400: aload_0
    //   401: iload #5
    //   403: putfield Zx : I
    //   406: aload_0
    //   407: iload #8
    //   409: invokespecial Zr : (I)V
    //   412: goto -> 419
    //   415: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   418: athrow
    //   419: aload_0
    //   420: iload #8
    //   422: putfield Zw : I
    //   425: iload_2
    //   426: iload_3
    //   427: if_icmplt -> 442
    //   430: iload #4
    //   432: ifeq -> 565
    //   435: goto -> 442
    //   438: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   441: athrow
    //   442: aload_0
    //   443: aload_1
    //   444: iload_2
    //   445: iinc #2, 1
    //   448: invokevirtual charAt : (I)C
    //   451: invokespecial ZQ : (I)I
    //   454: istore #8
    //   456: iload #8
    //   458: ldc 1114111
    //   460: if_icmple -> 482
    //   463: aload_0
    //   464: iload #5
    //   466: putfield Zx : I
    //   469: aload_0
    //   470: iload #8
    //   472: invokespecial Zr : (I)V
    //   475: goto -> 482
    //   478: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   481: athrow
    //   482: aload #6
    //   484: iload #5
    //   486: iinc #5, 1
    //   489: sipush #240
    //   492: iload #8
    //   494: bipush #18
    //   496: ishr
    //   497: ior
    //   498: i2b
    //   499: bastore
    //   500: aload #6
    //   502: iload #5
    //   504: iinc #5, 1
    //   507: sipush #128
    //   510: iload #8
    //   512: bipush #12
    //   514: ishr
    //   515: bipush #63
    //   517: iand
    //   518: ior
    //   519: i2b
    //   520: bastore
    //   521: aload #6
    //   523: iload #5
    //   525: iinc #5, 1
    //   528: sipush #128
    //   531: iload #8
    //   533: bipush #6
    //   535: ishr
    //   536: bipush #63
    //   538: iand
    //   539: ior
    //   540: i2b
    //   541: bastore
    //   542: aload #6
    //   544: iload #5
    //   546: iinc #5, 1
    //   549: sipush #128
    //   552: iload #8
    //   554: bipush #63
    //   556: iand
    //   557: ior
    //   558: i2b
    //   559: bastore
    //   560: iload #4
    //   562: ifeq -> 91
    //   565: aload_0
    //   566: iload #5
    //   568: putfield Zx : I
    //   571: return
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
    //   393	412	415	java/io/IOException
    //   419	435	438	java/io/IOException
    //   456	475	478	java/io/IOException
  }
  
  private int ZQ(int paramInt) throws IOException {
    int i = this.Zw;
    try {
      this.Zw = 0;
      if (paramInt >= 56320)
        try {
          if (paramInt <= 57343)
            return 65536 + (i - 55296 << 10) + paramInt - 56320; 
          throw new IOException(a(11744, -16335) + Integer.toHexString(i) + a(11748, 30533) + Integer.toHexString(paramInt) + a(11757, 1819));
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    throw new IOException(a(11744, -16335) + Integer.toHexString(i) + a(11748, 30533) + Integer.toHexString(paramInt) + a(11757, 1819));
  }
  
  private void Zr(int paramInt) throws IOException {
    try {
      if (paramInt > 1114111)
        throw new IOException(a(11747, 26184) + Integer.toHexString(paramInt) + a(11746, -18391)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramInt >= 55296) {
        try {
          if (paramInt <= 56319)
            throw new IOException(a(11745, 13066) + Integer.toHexString(paramInt) + ")"); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        throw new IOException(a(11749, 16162) + Integer.toHexString(paramInt) + ")");
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    throw new IOException(a(11750, -26606) + Integer.toHexString(paramInt) + a(11751, -13091));
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'W|k:*µÑA[ÔµK¤ê/ío¶Fé6\llnZú)ÒøÇÒ}újeSWâ}5a6ù5@pAôÔÆ¯SÓ$ 8¦£ÛêaoTØusx¡gGâO**×ïðÑWcó><æì¹ç®CÏµO¬»^Ú»Xd(üùð;¹P£$W»\\b_òâÁ)Ø]9wWÄnÅ3å"WÕ®¹ËöÅlÃN@ôû«ôSÐ°¦¤pi U1UN|ç³òÑ('
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #43
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #67
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
    //   68: ldc 'LèôÔ%º¢Ýwâ¦ÏÁ#S}à^ØýCØ*I·xÉÌ^ë#´BÀ"L9¹FY-yÍ´$Bû¥_J\\n/'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #44
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #84
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
    //   129: putstatic com/fasterxml/Zv/Zg.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zv/Zg.b : [Ljava/lang/String;
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
    //   212: bipush #109
    //   214: goto -> 244
    //   217: bipush #119
    //   219: goto -> 244
    //   222: bipush #118
    //   224: goto -> 244
    //   227: bipush #25
    //   229: goto -> 244
    //   232: bipush #86
    //   234: goto -> 244
    //   237: bipush #43
    //   239: goto -> 244
    //   242: bipush #32
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
    //   300: new java/lang/ThreadLocal
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic com/fasterxml/Zv/Zg.Zo : Ljava/lang/ThreadLocal;
    //   310: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2DE5) & 0xFFFF;
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
      byte b1 = 95;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zv\Zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */