package com.fasterxml.Zv;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.ref.SoftReference;

public final class Zd extends Reader {
  protected static final ThreadLocal<SoftReference<byte[][]>> Zz;
  
  protected final byte[][] Zm;
  
  private InputStream ZP = null;
  
  private final boolean ZU;
  
  protected byte[] ZN;
  
  protected int Zq;
  
  protected int Zt;
  
  protected int ZZ = -1;
  
  int Zp = 0;
  
  int Ze = 0;
  
  private char[] ZW = null;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zd(InputStream paramInputStream, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zr : ()Z
    //   3: istore_3
    //   4: aload_0
    //   5: aload_1
    //   6: ifnonnull -> 19
    //   9: new java/lang/Object
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: goto -> 20
    //   19: aload_1
    //   20: invokespecial <init> : (Ljava/lang/Object;)V
    //   23: aload_0
    //   24: iconst_m1
    //   25: putfield ZZ : I
    //   28: aload_0
    //   29: iconst_0
    //   30: putfield Zp : I
    //   33: aload_0
    //   34: iconst_0
    //   35: putfield Ze : I
    //   38: aload_0
    //   39: aconst_null
    //   40: putfield ZW : [C
    //   43: aload_0
    //   44: aload_1
    //   45: putfield ZP : Ljava/io/InputStream;
    //   48: aload_0
    //   49: invokestatic Zv : ()[[B
    //   52: putfield Zm : [[B
    //   55: aload_0
    //   56: getfield Zm : [[B
    //   59: iconst_0
    //   60: aaload
    //   61: astore #4
    //   63: aload #4
    //   65: ifnonnull -> 86
    //   68: sipush #8000
    //   71: newarray byte
    //   73: astore #4
    //   75: iload_3
    //   76: ifne -> 93
    //   79: iconst_1
    //   80: anewarray burp/Zbqc
    //   83: invokestatic Zr : ([Lburp/Zbqc;)V
    //   86: aload_0
    //   87: getfield Zm : [[B
    //   90: iconst_0
    //   91: aconst_null
    //   92: aastore
    //   93: aload_0
    //   94: aload #4
    //   96: putfield ZN : [B
    //   99: aload_0
    //   100: iconst_0
    //   101: putfield Zq : I
    //   104: aload_0
    //   105: iconst_0
    //   106: putfield Zt : I
    //   109: aload_0
    //   110: iload_2
    //   111: putfield ZU : Z
    //   114: return
  }
  
  public Zd(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    super(new Object());
    this.ZN = paramArrayOfbyte;
    this.Zq = paramInt1;
    this.Zt = paramInt1 + paramInt2;
    this.ZU = paramBoolean;
    this.Zm = (byte[][])null;
  }
  
  private static byte[][] Zv() {
    byte[][] arrayOfByte = (byte[][])null;
    SoftReference<byte[][]> softReference = Zz.get();
    if (softReference != null)
      arrayOfByte = softReference.get(); 
    if (arrayOfByte == null) {
      arrayOfByte = new byte[1][];
      Zz.set((SoftReference)new SoftReference<>(arrayOfByte));
    } 
    return arrayOfByte;
  }
  
  protected final boolean Zk() {
    return (this.Zm != null);
  }
  
  public void close() throws IOException {
    InputStream inputStream = this.ZP;
    try {
      if (inputStream != null)
        try {
          this.ZP = null;
          if (this.ZU)
            inputStream.close(); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zu();
  }
  
  public int read() throws IOException {
    try {
      if (this.ZW == null)
        this.ZW = new char[1]; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (read(this.ZW, 0, 1) < 1)
        return -1; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this.ZW[0];
  }
  
  public int read(char[] paramArrayOfchar) throws IOException {
    return read(paramArrayOfchar, 0, paramArrayOfchar.length);
  }
  
  public int read(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()Z
    //   3: istore #4
    //   5: aload_0
    //   6: getfield ZN : [B
    //   9: ifnonnull -> 18
    //   12: iconst_m1
    //   13: ireturn
    //   14: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   17: athrow
    //   18: iload_3
    //   19: iload_2
    //   20: iadd
    //   21: istore_3
    //   22: iload_2
    //   23: istore #5
    //   25: aload_0
    //   26: getfield ZZ : I
    //   29: iflt -> 83
    //   32: aload_1
    //   33: iload #5
    //   35: iinc #5, 1
    //   38: aload_0
    //   39: getfield ZZ : I
    //   42: i2c
    //   43: castore
    //   44: aload_0
    //   45: iconst_m1
    //   46: putfield ZZ : I
    //   49: aload_0
    //   50: getfield Zq : I
    //   53: aload_0
    //   54: getfield Zt : I
    //   57: if_icmplt -> 154
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   66: athrow
    //   67: aload_0
    //   68: dup
    //   69: getfield Zp : I
    //   72: iconst_1
    //   73: iadd
    //   74: putfield Zp : I
    //   77: iconst_1
    //   78: ireturn
    //   79: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   82: athrow
    //   83: aload_0
    //   84: getfield Zt : I
    //   87: aload_0
    //   88: getfield Zq : I
    //   91: isub
    //   92: istore #6
    //   94: iload #6
    //   96: iconst_4
    //   97: if_icmpge -> 154
    //   100: iload #6
    //   102: iconst_1
    //   103: if_icmplt -> 132
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   112: athrow
    //   113: aload_0
    //   114: getfield ZN : [B
    //   117: aload_0
    //   118: getfield Zq : I
    //   121: baload
    //   122: ifge -> 154
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   131: athrow
    //   132: aload_0
    //   133: iload #6
    //   135: invokespecial ZL : (I)Z
    //   138: ifne -> 154
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   147: athrow
    //   148: iconst_m1
    //   149: ireturn
    //   150: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   153: athrow
    //   154: aload_0
    //   155: getfield ZN : [B
    //   158: astore #6
    //   160: aload_0
    //   161: getfield Zq : I
    //   164: istore #7
    //   166: aload_0
    //   167: getfield Zt : I
    //   170: istore #8
    //   172: iload #5
    //   174: iload_3
    //   175: if_icmpge -> 723
    //   178: aload #6
    //   180: iload #7
    //   182: iinc #7, 1
    //   185: baload
    //   186: istore #9
    //   188: iload #9
    //   190: iflt -> 300
    //   193: aload_1
    //   194: iload #5
    //   196: iinc #5, 1
    //   199: iload #9
    //   201: i2c
    //   202: castore
    //   203: iload_3
    //   204: iload #5
    //   206: isub
    //   207: istore #10
    //   209: iload #8
    //   211: iload #7
    //   213: isub
    //   214: istore #11
    //   216: iload #7
    //   218: iload #11
    //   220: iload #10
    //   222: if_icmpge -> 234
    //   225: iload #11
    //   227: goto -> 236
    //   230: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   233: athrow
    //   234: iload #10
    //   236: iadd
    //   237: istore #12
    //   239: iload #7
    //   241: iload #12
    //   243: if_icmplt -> 251
    //   246: iload #4
    //   248: ifeq -> 723
    //   251: aload #6
    //   253: iload #7
    //   255: iinc #7, 1
    //   258: baload
    //   259: istore #9
    //   261: iload #9
    //   263: ifge -> 278
    //   266: iload #4
    //   268: ifeq -> 300
    //   271: goto -> 278
    //   274: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   277: athrow
    //   278: aload_1
    //   279: iload #5
    //   281: iinc #5, 1
    //   284: iload #9
    //   286: i2c
    //   287: castore
    //   288: iload #4
    //   290: ifeq -> 239
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   299: athrow
    //   300: iload #9
    //   302: sipush #224
    //   305: iand
    //   306: sipush #192
    //   309: if_icmpne -> 327
    //   312: iload #9
    //   314: bipush #31
    //   316: iand
    //   317: istore #9
    //   319: iconst_1
    //   320: istore #10
    //   322: iload #4
    //   324: ifeq -> 412
    //   327: iload #9
    //   329: sipush #240
    //   332: iand
    //   333: sipush #224
    //   336: if_icmpne -> 361
    //   339: goto -> 346
    //   342: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   345: athrow
    //   346: iload #9
    //   348: bipush #15
    //   350: iand
    //   351: istore #9
    //   353: iconst_2
    //   354: istore #10
    //   356: iload #4
    //   358: ifeq -> 412
    //   361: iload #9
    //   363: sipush #248
    //   366: iand
    //   367: sipush #240
    //   370: if_icmpne -> 395
    //   373: goto -> 380
    //   376: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   379: athrow
    //   380: iload #9
    //   382: bipush #15
    //   384: iand
    //   385: istore #9
    //   387: iconst_3
    //   388: istore #10
    //   390: iload #4
    //   392: ifeq -> 412
    //   395: aload_0
    //   396: iload #9
    //   398: sipush #255
    //   401: iand
    //   402: iload #5
    //   404: iload_2
    //   405: isub
    //   406: invokespecial Zb : (II)V
    //   409: iconst_1
    //   410: istore #10
    //   412: iload #8
    //   414: iload #7
    //   416: isub
    //   417: iload #10
    //   419: if_icmpge -> 437
    //   422: iinc #7, -1
    //   425: iload #4
    //   427: ifeq -> 723
    //   430: goto -> 437
    //   433: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   436: athrow
    //   437: aload #6
    //   439: iload #7
    //   441: iinc #7, 1
    //   444: baload
    //   445: istore #11
    //   447: iload #11
    //   449: sipush #192
    //   452: iand
    //   453: sipush #128
    //   456: if_icmpeq -> 480
    //   459: aload_0
    //   460: iload #11
    //   462: sipush #255
    //   465: iand
    //   466: iload #5
    //   468: iload_2
    //   469: isub
    //   470: invokespecial ZO : (II)V
    //   473: goto -> 480
    //   476: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   479: athrow
    //   480: iload #9
    //   482: bipush #6
    //   484: ishl
    //   485: iload #11
    //   487: bipush #63
    //   489: iand
    //   490: ior
    //   491: istore #9
    //   493: iload #10
    //   495: iconst_1
    //   496: if_icmple -> 675
    //   499: aload #6
    //   501: iload #7
    //   503: iinc #7, 1
    //   506: baload
    //   507: istore #11
    //   509: iload #11
    //   511: sipush #192
    //   514: iand
    //   515: sipush #128
    //   518: if_icmpeq -> 542
    //   521: aload_0
    //   522: iload #11
    //   524: sipush #255
    //   527: iand
    //   528: iload #5
    //   530: iload_2
    //   531: isub
    //   532: invokespecial ZO : (II)V
    //   535: goto -> 542
    //   538: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   541: athrow
    //   542: iload #9
    //   544: bipush #6
    //   546: ishl
    //   547: iload #11
    //   549: bipush #63
    //   551: iand
    //   552: ior
    //   553: istore #9
    //   555: iload #10
    //   557: iconst_2
    //   558: if_icmple -> 675
    //   561: aload #6
    //   563: iload #7
    //   565: iinc #7, 1
    //   568: baload
    //   569: istore #11
    //   571: iload #11
    //   573: sipush #192
    //   576: iand
    //   577: sipush #128
    //   580: if_icmpeq -> 604
    //   583: aload_0
    //   584: iload #11
    //   586: sipush #255
    //   589: iand
    //   590: iload #5
    //   592: iload_2
    //   593: isub
    //   594: invokespecial ZO : (II)V
    //   597: goto -> 604
    //   600: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   603: athrow
    //   604: iload #9
    //   606: bipush #6
    //   608: ishl
    //   609: iload #11
    //   611: bipush #63
    //   613: iand
    //   614: ior
    //   615: istore #9
    //   617: iload #9
    //   619: ldc 65536
    //   621: isub
    //   622: istore #9
    //   624: aload_1
    //   625: iload #5
    //   627: iinc #5, 1
    //   630: ldc 55296
    //   632: iload #9
    //   634: bipush #10
    //   636: ishr
    //   637: iadd
    //   638: i2c
    //   639: castore
    //   640: ldc 56320
    //   642: iload #9
    //   644: sipush #1023
    //   647: iand
    //   648: ior
    //   649: istore #9
    //   651: iload #5
    //   653: iload_3
    //   654: if_icmplt -> 675
    //   657: aload_0
    //   658: iload #9
    //   660: putfield ZZ : I
    //   663: iload #4
    //   665: ifeq -> 723
    //   668: goto -> 675
    //   671: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   674: athrow
    //   675: aload_1
    //   676: iload #5
    //   678: iinc #5, 1
    //   681: iload #9
    //   683: i2c
    //   684: castore
    //   685: iload #7
    //   687: iload #8
    //   689: if_icmplt -> 711
    //   692: goto -> 699
    //   695: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   698: athrow
    //   699: iload #4
    //   701: ifeq -> 723
    //   704: goto -> 711
    //   707: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   710: athrow
    //   711: iload #4
    //   713: ifeq -> 172
    //   716: goto -> 723
    //   719: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   722: athrow
    //   723: aload_0
    //   724: iload #7
    //   726: putfield Zq : I
    //   729: iload #5
    //   731: iload_2
    //   732: isub
    //   733: istore #9
    //   735: aload_0
    //   736: dup
    //   737: getfield Zp : I
    //   740: iload #9
    //   742: iadd
    //   743: putfield Zp : I
    //   746: iload #9
    //   748: ireturn
    // Exception table:
    //   from	to	target	type
    //   5	14	14	java/io/IOException
    //   25	60	63	java/io/IOException
    //   32	79	79	java/io/IOException
    //   94	106	109	java/io/IOException
    //   100	125	128	java/io/IOException
    //   113	141	144	java/io/IOException
    //   132	150	150	java/io/IOException
    //   216	230	230	java/io/IOException
    //   261	271	274	java/io/IOException
    //   266	293	296	java/io/IOException
    //   322	339	342	java/io/IOException
    //   356	373	376	java/io/IOException
    //   412	430	433	java/io/IOException
    //   447	473	476	java/io/IOException
    //   509	535	538	java/io/IOException
    //   571	597	600	java/io/IOException
    //   651	668	671	java/io/IOException
    //   657	692	695	java/io/IOException
    //   675	704	707	java/io/IOException
    //   699	716	719	java/io/IOException
  }
  
  protected final int ZE() throws IOException {
    this.Zq = 0;
    this.Zt = 0;
    if (this.ZP != null) {
      int i = this.ZP.read(this.ZN, 0, this.ZN.length);
      try {
        if (i > 0)
          this.Zt = i; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return i;
    } 
    return -1;
  }
  
  protected final int ZF(int paramInt) throws IOException {
    if (this.ZP != null) {
      int i = this.ZP.read(this.ZN, paramInt, this.ZN.length - paramInt);
      try {
        if (i > 0)
          this.Zt += i; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return i;
    } 
    return -1;
  }
  
  public final void Zu() {
    if (this.Zm != null) {
      byte[] arrayOfByte = this.ZN;
      if (arrayOfByte != null) {
        this.ZN = null;
        this.Zm[0] = arrayOfByte;
      } 
    } 
  }
  
  private void Zb(int paramInt1, int paramInt2) throws IOException {
    int i = this.Ze + this.Zq - 1;
    int j = this.Zp + paramInt2 + 1;
    throw new CharConversionException(a(12822, -7756) + Integer.toHexString(paramInt1) + a(12820, 20941) + j + a(12819, 18030) + i + ")");
  }
  
  private void ZO(int paramInt1, int paramInt2) throws IOException {
    int i = this.Ze + this.Zq - 1;
    int j = this.Zp + paramInt2;
    throw new CharConversionException(a(12826, -27602) + Integer.toHexString(paramInt1) + a(12817, -16253) + j + a(12824, -3114) + i + ")");
  }
  
  private void Zs(int paramInt1, int paramInt2) throws IOException {
    int i = this.Ze + paramInt1;
    int j = this.Zp;
    throw new CharConversionException(a(12818, 24660) + paramInt1 + a(12816, 30304) + paramInt2 + a(12827, 22443) + j + a(12819, 18030) + i + ")");
  }
  
  private boolean ZL(int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic Zr : ()Z
    //   3: aload_0
    //   4: dup
    //   5: getfield Ze : I
    //   8: aload_0
    //   9: getfield Zt : I
    //   12: iload_1
    //   13: isub
    //   14: iadd
    //   15: putfield Ze : I
    //   18: istore_2
    //   19: iload_1
    //   20: ifle -> 145
    //   23: aload_0
    //   24: getfield Zq : I
    //   27: ifle -> 180
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   36: athrow
    //   37: aload_0
    //   38: invokevirtual Zk : ()Z
    //   41: ifne -> 100
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   50: athrow
    //   51: aload_0
    //   52: getfield ZP : Ljava/io/InputStream;
    //   55: ifnonnull -> 100
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   64: athrow
    //   65: new java/io/IOException
    //   68: dup
    //   69: sipush #12823
    //   72: sipush #-17676
    //   75: invokestatic a : (II)Ljava/lang/String;
    //   78: iconst_1
    //   79: anewarray java/lang/Object
    //   82: dup
    //   83: iconst_0
    //   84: iload_1
    //   85: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   88: aastore
    //   89: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   92: invokespecial <init> : (Ljava/lang/String;)V
    //   95: athrow
    //   96: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   99: athrow
    //   100: iconst_0
    //   101: istore_3
    //   102: iload_3
    //   103: iload_1
    //   104: if_icmpge -> 131
    //   107: aload_0
    //   108: getfield ZN : [B
    //   111: iload_3
    //   112: aload_0
    //   113: getfield ZN : [B
    //   116: aload_0
    //   117: getfield Zq : I
    //   120: iload_3
    //   121: iadd
    //   122: baload
    //   123: bastore
    //   124: iinc #3, 1
    //   127: iload_2
    //   128: ifne -> 102
    //   131: aload_0
    //   132: iconst_0
    //   133: putfield Zq : I
    //   136: aload_0
    //   137: iload_1
    //   138: putfield Zt : I
    //   141: iload_2
    //   142: ifne -> 180
    //   145: aload_0
    //   146: invokevirtual ZE : ()I
    //   149: istore_3
    //   150: iload_3
    //   151: iconst_1
    //   152: if_icmpge -> 180
    //   155: aload_0
    //   156: invokevirtual Zu : ()V
    //   159: iload_3
    //   160: ifge -> 176
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   169: athrow
    //   170: iconst_0
    //   171: ireturn
    //   172: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   175: athrow
    //   176: aload_0
    //   177: invokevirtual ZR : ()V
    //   180: aload_0
    //   181: getfield ZN : [B
    //   184: aload_0
    //   185: getfield Zq : I
    //   188: baload
    //   189: istore_3
    //   190: iload_3
    //   191: iflt -> 200
    //   194: iconst_1
    //   195: ireturn
    //   196: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   199: athrow
    //   200: iload_3
    //   201: sipush #224
    //   204: iand
    //   205: sipush #192
    //   208: if_icmpne -> 218
    //   211: iconst_2
    //   212: istore #4
    //   214: iload_2
    //   215: ifne -> 274
    //   218: iload_3
    //   219: sipush #240
    //   222: iand
    //   223: sipush #224
    //   226: if_icmpne -> 243
    //   229: goto -> 236
    //   232: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   235: athrow
    //   236: iconst_3
    //   237: istore #4
    //   239: iload_2
    //   240: ifne -> 274
    //   243: iload_3
    //   244: sipush #248
    //   247: iand
    //   248: sipush #240
    //   251: if_icmpne -> 268
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   260: athrow
    //   261: iconst_4
    //   262: istore #4
    //   264: iload_2
    //   265: ifne -> 274
    //   268: iconst_1
    //   269: ireturn
    //   270: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   273: athrow
    //   274: aload_0
    //   275: getfield Zq : I
    //   278: iload #4
    //   280: iadd
    //   281: aload_0
    //   282: getfield Zt : I
    //   285: if_icmple -> 345
    //   288: aload_0
    //   289: aload_0
    //   290: getfield Zt : I
    //   293: invokevirtual ZF : (I)I
    //   296: istore #5
    //   298: iload #5
    //   300: iconst_1
    //   301: if_icmpge -> 341
    //   304: iload #5
    //   306: ifge -> 337
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   315: athrow
    //   316: aload_0
    //   317: invokevirtual Zu : ()V
    //   320: aload_0
    //   321: aload_0
    //   322: getfield Zt : I
    //   325: iload #4
    //   327: invokespecial Zs : (II)V
    //   330: goto -> 337
    //   333: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   336: athrow
    //   337: aload_0
    //   338: invokevirtual ZR : ()V
    //   341: iload_2
    //   342: ifne -> 274
    //   345: iconst_1
    //   346: ireturn
    // Exception table:
    //   from	to	target	type
    //   19	30	33	java/io/IOException
    //   23	44	47	java/io/IOException
    //   37	58	61	java/io/IOException
    //   51	96	96	java/io/IOException
    //   150	163	166	java/io/IOException
    //   155	172	172	java/io/IOException
    //   190	196	196	java/io/IOException
    //   214	229	232	java/io/IOException
    //   239	254	257	java/io/IOException
    //   264	270	270	java/io/IOException
    //   298	309	312	java/io/IOException
    //   304	330	333	java/io/IOException
  }
  
  protected void ZR() throws IOException {
    throw new IOException(a(12821, -27150));
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '6d»EWI¬ôÇçÈøéùâ*úGztå8pv¯PPºX p%ìÉÓìÐ§ÉìÎÑÎ$â\\b¯¶Ùøóô\\tp;.4Ø¤÷EUm\\bæõ¶©ØNøwî>ÌW(@ã$Cì« À*xêR\\rÏ®çÈ\\bºß?ï ßÓ8\\n®WmåÁ:Ò"çe·å©án}aXolw)ßì_² ¤úGÌÌmÊò©\\fäïÞ\\t¾;7å8ËÝ'ÿDhF¦¢ÃZWÁç,@C£ééö25­ýôXIºý<6g%ª`üdv][óP\¶º!i'óàûÔßÉgzÞR¥ÐRÎ\\tÓ&'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #55
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #56
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
    //   68: ldc 'Wòè1Äa¢VFê\\b¤6¤\y''
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #11
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #16
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
    //   129: putstatic com/fasterxml/Zv/Zd.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zv/Zd.b : [Ljava/lang/String;
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
    //   212: bipush #119
    //   214: goto -> 244
    //   217: bipush #10
    //   219: goto -> 244
    //   222: bipush #54
    //   224: goto -> 244
    //   227: bipush #108
    //   229: goto -> 244
    //   232: bipush #96
    //   234: goto -> 244
    //   237: bipush #65
    //   239: goto -> 244
    //   242: bipush #104
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
    //   307: putstatic com/fasterxml/Zv/Zd.Zz : Ljava/lang/ThreadLocal;
    //   310: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3212) & 0xFFFF;
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
      char c = 'ë';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zv\Zd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */