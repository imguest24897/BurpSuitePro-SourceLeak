package com.fasterxml;

import burp.Zbqc;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Zlr extends Reader {
  protected final Zv9 Zs;
  
  protected InputStream ZJ;
  
  protected byte[] Zu;
  
  protected int ZE;
  
  protected int ZH;
  
  protected final boolean Zp;
  
  protected char Zh = Character.MIN_VALUE;
  
  protected int Zw;
  
  protected int Zg;
  
  protected final boolean Z_;
  
  protected char[] Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zlr(Zv9 paramZv9, InputStream paramInputStream, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.Zs = paramZv9;
    this.ZJ = paramInputStream;
    this.Zu = paramArrayOfbyte;
    this.ZE = paramInt1;
    this.ZH = paramInt2;
    this.Zp = paramBoolean;
    int i = Zyt.Zn();
    try {
    
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    try {
      this.Z_ = (paramInputStream != null);
      if (Zbqc.Zwu() == null)
        Zyt.ZY(++i); 
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
  }
  
  public void close() throws IOException {
    InputStream inputStream = this.ZJ;
    try {
      if (inputStream != null) {
        this.ZJ = null;
        Zg();
        inputStream.close();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public int read() throws IOException {
    try {
      if (this.Zr == null)
        this.Zr = new char[1]; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (read(this.Zr, 0, 1) < 1)
        return -1; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this.Zr[0];
  }
  
  public int read(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: getfield Zu : [B
    //   9: ifnonnull -> 18
    //   12: iconst_m1
    //   13: ireturn
    //   14: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   17: athrow
    //   18: iload_3
    //   19: iconst_1
    //   20: if_icmpge -> 29
    //   23: iload_3
    //   24: ireturn
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: iload_2
    //   30: iflt -> 48
    //   33: iload_2
    //   34: iload_3
    //   35: iadd
    //   36: aload_1
    //   37: arraylength
    //   38: if_icmple -> 62
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   47: athrow
    //   48: aload_0
    //   49: aload_1
    //   50: iload_2
    //   51: iload_3
    //   52: invokespecial Zb : ([CII)V
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: iload_2
    //   63: istore #5
    //   65: iload_3
    //   66: iload_2
    //   67: iadd
    //   68: istore #6
    //   70: aload_0
    //   71: getfield Zh : C
    //   74: ifeq -> 105
    //   77: aload_1
    //   78: iload #5
    //   80: iinc #5, 1
    //   83: aload_0
    //   84: getfield Zh : C
    //   87: castore
    //   88: aload_0
    //   89: iconst_0
    //   90: putfield Zh : C
    //   93: iload #4
    //   95: ifeq -> 170
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   104: athrow
    //   105: aload_0
    //   106: getfield ZH : I
    //   109: aload_0
    //   110: getfield ZE : I
    //   113: isub
    //   114: istore #7
    //   116: iload #7
    //   118: iconst_4
    //   119: if_icmpge -> 170
    //   122: aload_0
    //   123: iload #7
    //   125: invokespecial Zl : (I)Z
    //   128: ifne -> 170
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: iload #7
    //   140: ifne -> 156
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   149: athrow
    //   150: iconst_m1
    //   151: ireturn
    //   152: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   155: athrow
    //   156: aload_0
    //   157: aload_0
    //   158: getfield ZH : I
    //   161: aload_0
    //   162: getfield ZE : I
    //   165: isub
    //   166: iconst_4
    //   167: invokespecial Zo : (II)V
    //   170: aload_0
    //   171: getfield ZH : I
    //   174: iconst_4
    //   175: isub
    //   176: istore #7
    //   178: iload #5
    //   180: iload #6
    //   182: if_icmpge -> 485
    //   185: aload_0
    //   186: getfield ZE : I
    //   189: iload #7
    //   191: if_icmpgt -> 485
    //   194: aload_0
    //   195: getfield ZE : I
    //   198: istore #8
    //   200: aload_0
    //   201: getfield Zp : Z
    //   204: ifeq -> 270
    //   207: aload_0
    //   208: getfield Zu : [B
    //   211: iload #8
    //   213: baload
    //   214: bipush #8
    //   216: ishl
    //   217: aload_0
    //   218: getfield Zu : [B
    //   221: iload #8
    //   223: iconst_1
    //   224: iadd
    //   225: baload
    //   226: sipush #255
    //   229: iand
    //   230: ior
    //   231: istore #9
    //   233: aload_0
    //   234: getfield Zu : [B
    //   237: iload #8
    //   239: iconst_2
    //   240: iadd
    //   241: baload
    //   242: sipush #255
    //   245: iand
    //   246: bipush #8
    //   248: ishl
    //   249: aload_0
    //   250: getfield Zu : [B
    //   253: iload #8
    //   255: iconst_3
    //   256: iadd
    //   257: baload
    //   258: sipush #255
    //   261: iand
    //   262: ior
    //   263: istore #10
    //   265: iload #4
    //   267: ifeq -> 328
    //   270: aload_0
    //   271: getfield Zu : [B
    //   274: iload #8
    //   276: baload
    //   277: sipush #255
    //   280: iand
    //   281: aload_0
    //   282: getfield Zu : [B
    //   285: iload #8
    //   287: iconst_1
    //   288: iadd
    //   289: baload
    //   290: sipush #255
    //   293: iand
    //   294: bipush #8
    //   296: ishl
    //   297: ior
    //   298: istore #10
    //   300: aload_0
    //   301: getfield Zu : [B
    //   304: iload #8
    //   306: iconst_2
    //   307: iadd
    //   308: baload
    //   309: sipush #255
    //   312: iand
    //   313: aload_0
    //   314: getfield Zu : [B
    //   317: iload #8
    //   319: iconst_3
    //   320: iadd
    //   321: baload
    //   322: bipush #8
    //   324: ishl
    //   325: ior
    //   326: istore #9
    //   328: aload_0
    //   329: dup
    //   330: getfield ZE : I
    //   333: iconst_4
    //   334: iadd
    //   335: putfield ZE : I
    //   338: iload #9
    //   340: ifeq -> 463
    //   343: iload #9
    //   345: ldc 65535
    //   347: iand
    //   348: istore #9
    //   350: iload #9
    //   352: iconst_1
    //   353: isub
    //   354: bipush #16
    //   356: ishl
    //   357: iload #10
    //   359: ior
    //   360: istore #11
    //   362: iload #9
    //   364: bipush #16
    //   366: if_icmple -> 410
    //   369: aload_0
    //   370: iload #11
    //   372: iload #5
    //   374: iload_2
    //   375: isub
    //   376: sipush #4071
    //   379: sipush #-1719
    //   382: invokestatic a : (II)Ljava/lang/String;
    //   385: iconst_1
    //   386: anewarray java/lang/Object
    //   389: dup
    //   390: iconst_0
    //   391: ldc 1114111
    //   393: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   396: aastore
    //   397: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   400: invokespecial Zn : (IILjava/lang/String;)V
    //   403: goto -> 410
    //   406: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   409: athrow
    //   410: aload_1
    //   411: iload #5
    //   413: iinc #5, 1
    //   416: ldc 55296
    //   418: iload #11
    //   420: bipush #10
    //   422: ishr
    //   423: iadd
    //   424: i2c
    //   425: castore
    //   426: ldc 56320
    //   428: iload #11
    //   430: sipush #1023
    //   433: iand
    //   434: ior
    //   435: istore #10
    //   437: iload #5
    //   439: iload #6
    //   441: if_icmplt -> 463
    //   444: aload_0
    //   445: iload #11
    //   447: i2c
    //   448: putfield Zh : C
    //   451: iload #4
    //   453: ifeq -> 485
    //   456: goto -> 463
    //   459: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   462: athrow
    //   463: aload_1
    //   464: iload #5
    //   466: iinc #5, 1
    //   469: iload #10
    //   471: i2c
    //   472: castore
    //   473: iload #4
    //   475: ifeq -> 178
    //   478: goto -> 485
    //   481: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   484: athrow
    //   485: iload #5
    //   487: iload_2
    //   488: isub
    //   489: istore #8
    //   491: aload_0
    //   492: dup
    //   493: getfield Zw : I
    //   496: iload #8
    //   498: iadd
    //   499: putfield Zw : I
    //   502: iload #8
    //   504: ireturn
    // Exception table:
    //   from	to	target	type
    //   5	14	14	java/io/IOException
    //   18	25	25	java/io/IOException
    //   29	41	44	java/io/IOException
    //   33	55	58	java/io/IOException
    //   70	98	101	java/io/IOException
    //   116	131	134	java/io/IOException
    //   122	143	146	java/io/IOException
    //   138	152	152	java/io/IOException
    //   362	403	406	java/io/IOException
    //   437	456	459	java/io/IOException
    //   444	478	481	java/io/IOException
  }
  
  private void Zo(int paramInt1, int paramInt2) throws IOException {
    int i = this.Zg + paramInt1;
    int j = this.Zw;
    throw new CharConversionException(a(4066, 13347) + paramInt1 + a(4070, -14424) + paramInt2 + a(4067, -28845) + j + a(4068, -870) + i + ")");
  }
  
  private void Zn(int paramInt1, int paramInt2, String paramString) throws IOException {
    int i = this.Zg + this.ZE - 1;
    int j = this.Zw + paramInt2;
    throw new CharConversionException(a(4064, 29268) + Integer.toHexString(paramInt1) + paramString + a(4075, 5440) + j + a(4074, -8292) + i + ")");
  }
  
  private boolean Zl(int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZD : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZJ : Ljava/io/InputStream;
    //   8: ifnull -> 25
    //   11: aload_0
    //   12: getfield Zu : [B
    //   15: ifnonnull -> 31
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: iconst_0
    //   26: ireturn
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_0
    //   32: dup
    //   33: getfield Zg : I
    //   36: aload_0
    //   37: getfield ZH : I
    //   40: iload_1
    //   41: isub
    //   42: iadd
    //   43: putfield Zg : I
    //   46: iload_1
    //   47: ifle -> 102
    //   50: aload_0
    //   51: getfield ZE : I
    //   54: ifle -> 93
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   63: athrow
    //   64: aload_0
    //   65: getfield Zu : [B
    //   68: aload_0
    //   69: getfield ZE : I
    //   72: aload_0
    //   73: getfield Zu : [B
    //   76: iconst_0
    //   77: iload_1
    //   78: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   81: aload_0
    //   82: iconst_0
    //   83: putfield ZE : I
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: aload_0
    //   94: iload_1
    //   95: putfield ZH : I
    //   98: iload_2
    //   99: ifne -> 176
    //   102: aload_0
    //   103: iconst_0
    //   104: putfield ZE : I
    //   107: aload_0
    //   108: getfield ZJ : Ljava/io/InputStream;
    //   111: aload_0
    //   112: getfield Zu : [B
    //   115: invokevirtual read : ([B)I
    //   118: istore_3
    //   119: iload_3
    //   120: iconst_1
    //   121: if_icmpge -> 171
    //   124: aload_0
    //   125: iconst_0
    //   126: putfield ZH : I
    //   129: iload_3
    //   130: ifge -> 167
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: aload_0
    //   141: getfield Z_ : Z
    //   144: ifeq -> 165
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   153: athrow
    //   154: aload_0
    //   155: invokespecial Zg : ()V
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   164: athrow
    //   165: iconst_0
    //   166: ireturn
    //   167: aload_0
    //   168: invokespecial Zy : ()V
    //   171: aload_0
    //   172: iload_3
    //   173: putfield ZH : I
    //   176: aload_0
    //   177: getfield ZH : I
    //   180: iconst_4
    //   181: if_icmpge -> 278
    //   184: aload_0
    //   185: getfield ZJ : Ljava/io/InputStream;
    //   188: aload_0
    //   189: getfield Zu : [B
    //   192: aload_0
    //   193: getfield ZH : I
    //   196: aload_0
    //   197: getfield Zu : [B
    //   200: arraylength
    //   201: aload_0
    //   202: getfield ZH : I
    //   205: isub
    //   206: invokevirtual read : ([BII)I
    //   209: istore_3
    //   210: iload_3
    //   211: iconst_1
    //   212: if_icmpge -> 264
    //   215: iload_3
    //   216: ifge -> 260
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   225: athrow
    //   226: aload_0
    //   227: getfield Z_ : Z
    //   230: ifeq -> 251
    //   233: goto -> 240
    //   236: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   239: athrow
    //   240: aload_0
    //   241: invokespecial Zg : ()V
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   250: athrow
    //   251: aload_0
    //   252: aload_0
    //   253: getfield ZH : I
    //   256: iconst_4
    //   257: invokespecial Zo : (II)V
    //   260: aload_0
    //   261: invokespecial Zy : ()V
    //   264: aload_0
    //   265: dup
    //   266: getfield ZH : I
    //   269: iload_3
    //   270: iadd
    //   271: putfield ZH : I
    //   274: iload_2
    //   275: ifne -> 176
    //   278: iconst_1
    //   279: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	18	21	java/io/IOException
    //   11	27	27	java/io/IOException
    //   31	57	60	java/io/IOException
    //   50	86	89	java/io/IOException
    //   119	133	136	java/io/IOException
    //   124	147	150	java/io/IOException
    //   140	158	161	java/io/IOException
    //   210	219	222	java/io/IOException
    //   215	233	236	java/io/IOException
    //   226	244	247	java/io/IOException
  }
  
  private void Zg() {
    byte[] arrayOfByte = this.Zu;
    try {
      if (arrayOfByte != null)
        try {
          this.Zu = null;
          if (this.Zs != null)
            this.Zs.ZO(arrayOfByte); 
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
  }
  
  private void Zb(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    throw new ArrayIndexOutOfBoundsException(String.format(a(4069, 32705), new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramArrayOfchar.length) }));
  }
  
  private void Zy() throws IOException {
    throw new IOException(a(4065, -338));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Òb¦"t4×ÔÆô}P&`\\nyí³gë¦Wlt©çù"O¬~zå[bqÙ&£Ú"*@äºù'K³a'E|ÿT2`d\\t4-lÖÖ=ð|múí\\rSý-,<]ÌOø;§\\nn²Ö¡Ì¢c,BùpOÔÔ6\\r¦14DgÌx\\rÿpëñÆ!> R\\tÖ{G°rJöj$v£N¤ã\\b·y[Ç(x3¤OÕ\\rÙ§8Ö/MçF'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #58
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #57
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
    //   68: ldc 'Y·H>1÷\\nò¸ãDw¬ÕKH'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #94
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
    //   129: putstatic com/fasterxml/Zlr.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zlr.b : [Ljava/lang/String;
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
    //   212: bipush #65
    //   214: goto -> 244
    //   217: bipush #37
    //   219: goto -> 244
    //   222: bipush #80
    //   224: goto -> 244
    //   227: bipush #15
    //   229: goto -> 244
    //   232: bipush #13
    //   234: goto -> 244
    //   237: bipush #49
    //   239: goto -> 244
    //   242: bipush #24
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
    int i = (paramInt1 ^ 0xFE2) & 0xFFFF;
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
      byte b1 = 70;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zlr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */