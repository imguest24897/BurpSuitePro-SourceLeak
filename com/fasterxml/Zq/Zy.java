package com.fasterxml.Zq;

import burp.Zbqc;
import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zi;
import com.fasterxml.Zb.Zj;
import com.fasterxml.Zb.Zm1;
import com.fasterxml.Zb.Zmd;
import com.fasterxml.Zv9;
import com.fasterxml.Zvr;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Zy extends Zv {
  private static final byte[] ZJ;
  
  private static final byte[] Zx;
  
  private static final byte[] ZU;
  
  private static final byte[] ZN;
  
  private static final byte[] Za;
  
  protected final OutputStream ZO;
  
  protected byte Zd;
  
  protected byte[] ZY;
  
  protected int Zi;
  
  protected final int ZR;
  
  protected final int ZX;
  
  protected char[] Zg;
  
  protected final int ZD;
  
  protected boolean ZS;
  
  private static final String[] f;
  
  private static final String[] g;
  
  public Zy(Zv9 paramZv9, int paramInt, Zmd paramZmd, OutputStream paramOutputStream, char paramChar) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iload_2
    //   3: aload_3
    //   4: invokespecial <init> : (Lcom/fasterxml/Zv9;ILcom/fasterxml/Zb/Zmd;)V
    //   7: aload_0
    //   8: aload #4
    //   10: putfield ZO : Ljava/io/OutputStream;
    //   13: aload_0
    //   14: iload #5
    //   16: i2b
    //   17: putfield Zd : B
    //   20: aload_0
    //   21: getstatic com/fasterxml/Zq/Zo.ESCAPE_FORWARD_SLASHES : Lcom/fasterxml/Zq/Zo;
    //   24: invokevirtual Z_ : ()Lcom/fasterxml/Zb/Zi;
    //   27: invokevirtual Za : (Lcom/fasterxml/Zb/Zi;)Z
    //   30: istore #6
    //   32: iload #5
    //   34: bipush #34
    //   36: if_icmpne -> 51
    //   39: iload #6
    //   41: ifeq -> 69
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: aload_0
    //   52: iload #5
    //   54: iload #6
    //   56: invokestatic ZI : (IZ)[I
    //   59: putfield Zp : [I
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: aload_0
    //   70: iconst_1
    //   71: putfield ZS : Z
    //   74: aload_0
    //   75: aload_1
    //   76: invokevirtual ZD : ()[B
    //   79: putfield ZY : [B
    //   82: aload_0
    //   83: aload_0
    //   84: getfield ZY : [B
    //   87: arraylength
    //   88: putfield ZR : I
    //   91: aload_0
    //   92: aload_0
    //   93: getfield ZR : I
    //   96: iconst_3
    //   97: ishr
    //   98: putfield ZX : I
    //   101: aload_0
    //   102: aload_1
    //   103: invokevirtual Zc : ()[C
    //   106: putfield Zg : [C
    //   109: aload_0
    //   110: aload_0
    //   111: getfield Zg : [C
    //   114: arraylength
    //   115: putfield ZD : I
    //   118: aload_0
    //   119: getstatic com/fasterxml/Zb/Zi.ESCAPE_NON_ASCII : Lcom/fasterxml/Zb/Zi;
    //   122: invokevirtual Za : (Lcom/fasterxml/Zb/Zi;)Z
    //   125: ifeq -> 142
    //   128: aload_0
    //   129: bipush #127
    //   131: invokevirtual ZP : (I)Lcom/fasterxml/Zb/Zf;
    //   134: pop
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   141: athrow
    //   142: return
    // Exception table:
    //   from	to	target	type
    //   32	44	47	java/lang/RuntimeException
    //   39	62	65	java/lang/RuntimeException
    //   69	135	138	java/lang/RuntimeException
  }
  
  public void ZY(String paramString) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   8: ifnull -> 21
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual Zq : (Ljava/lang/String;)V
    //   16: return
    //   17: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   20: athrow
    //   21: aload_0
    //   22: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   25: aload_1
    //   26: invokevirtual Zc : (Ljava/lang/String;)I
    //   29: istore_3
    //   30: iload_3
    //   31: iconst_4
    //   32: if_icmpne -> 55
    //   35: aload_0
    //   36: sipush #-626
    //   39: sipush #22961
    //   42: invokestatic c : (II)Ljava/lang/String;
    //   45: invokevirtual Zr : (Ljava/lang/String;)V
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   54: athrow
    //   55: iload_3
    //   56: iconst_1
    //   57: if_icmpne -> 107
    //   60: aload_0
    //   61: getfield Zi : I
    //   64: aload_0
    //   65: getfield ZR : I
    //   68: if_icmplt -> 89
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: aload_0
    //   79: invokevirtual ZQ : ()V
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: aload_0
    //   90: getfield ZY : [B
    //   93: aload_0
    //   94: dup
    //   95: getfield Zi : I
    //   98: dup_x1
    //   99: iconst_1
    //   100: iadd
    //   101: putfield Zi : I
    //   104: bipush #44
    //   106: bastore
    //   107: aload_0
    //   108: getfield ZA : Z
    //   111: ifeq -> 125
    //   114: aload_0
    //   115: aload_1
    //   116: iconst_0
    //   117: invokespecial ZH : (Ljava/lang/String;Z)V
    //   120: return
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: aload_1
    //   126: invokevirtual length : ()I
    //   129: istore #4
    //   131: iload #4
    //   133: aload_0
    //   134: getfield ZD : I
    //   137: if_icmple -> 151
    //   140: aload_0
    //   141: aload_1
    //   142: iconst_1
    //   143: invokespecial ZH : (Ljava/lang/String;Z)V
    //   146: return
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: aload_0
    //   152: getfield Zi : I
    //   155: aload_0
    //   156: getfield ZR : I
    //   159: if_icmplt -> 173
    //   162: aload_0
    //   163: invokevirtual ZQ : ()V
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   172: athrow
    //   173: aload_0
    //   174: getfield ZY : [B
    //   177: aload_0
    //   178: dup
    //   179: getfield Zi : I
    //   182: dup_x1
    //   183: iconst_1
    //   184: iadd
    //   185: putfield Zi : I
    //   188: aload_0
    //   189: getfield Zd : B
    //   192: bastore
    //   193: iload #4
    //   195: aload_0
    //   196: getfield ZX : I
    //   199: if_icmpgt -> 246
    //   202: aload_0
    //   203: getfield Zi : I
    //   206: iload #4
    //   208: iadd
    //   209: aload_0
    //   210: getfield ZR : I
    //   213: if_icmple -> 234
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   222: athrow
    //   223: aload_0
    //   224: invokevirtual ZQ : ()V
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   233: athrow
    //   234: aload_0
    //   235: aload_1
    //   236: iconst_0
    //   237: iload #4
    //   239: invokespecial ZJ : (Ljava/lang/String;II)V
    //   242: iload_2
    //   243: ifne -> 261
    //   246: aload_0
    //   247: aload_1
    //   248: iconst_0
    //   249: iload #4
    //   251: invokespecial ZF : (Ljava/lang/String;II)V
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   260: athrow
    //   261: aload_0
    //   262: getfield Zi : I
    //   265: aload_0
    //   266: getfield ZR : I
    //   269: if_icmplt -> 283
    //   272: aload_0
    //   273: invokevirtual ZQ : ()V
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   282: athrow
    //   283: aload_0
    //   284: getfield ZY : [B
    //   287: aload_0
    //   288: dup
    //   289: getfield Zi : I
    //   292: dup_x1
    //   293: iconst_1
    //   294: iadd
    //   295: putfield Zi : I
    //   298: aload_0
    //   299: getfield Zd : B
    //   302: bastore
    //   303: return
    // Exception table:
    //   from	to	target	type
    //   4	17	17	java/io/IOException
    //   30	48	51	java/io/IOException
    //   55	71	74	java/io/IOException
    //   60	82	85	java/io/IOException
    //   107	121	121	java/io/IOException
    //   131	147	147	java/io/IOException
    //   151	166	169	java/io/IOException
    //   173	216	219	java/io/IOException
    //   202	227	230	java/io/IOException
    //   234	254	257	java/io/IOException
    //   261	276	279	java/io/IOException
  }
  
  public void Zm(Zj paramZj) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   8: ifnull -> 21
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual ZW : (Lcom/fasterxml/Zb/Zj;)V
    //   16: return
    //   17: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   20: athrow
    //   21: aload_0
    //   22: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   25: aload_1
    //   26: invokeinterface ZV : ()Ljava/lang/String;
    //   31: invokevirtual Zc : (Ljava/lang/String;)I
    //   34: istore_3
    //   35: iload_3
    //   36: iconst_4
    //   37: if_icmpne -> 60
    //   40: aload_0
    //   41: sipush #-626
    //   44: sipush #22961
    //   47: invokestatic c : (II)Ljava/lang/String;
    //   50: invokevirtual Zr : (Ljava/lang/String;)V
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   59: athrow
    //   60: iload_3
    //   61: iconst_1
    //   62: if_icmpne -> 112
    //   65: aload_0
    //   66: getfield Zi : I
    //   69: aload_0
    //   70: getfield ZR : I
    //   73: if_icmplt -> 94
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload_0
    //   84: invokevirtual ZQ : ()V
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: aload_0
    //   95: getfield ZY : [B
    //   98: aload_0
    //   99: dup
    //   100: getfield Zi : I
    //   103: dup_x1
    //   104: iconst_1
    //   105: iadd
    //   106: putfield Zi : I
    //   109: bipush #44
    //   111: bastore
    //   112: aload_0
    //   113: getfield ZA : Z
    //   116: ifeq -> 129
    //   119: aload_0
    //   120: aload_1
    //   121: invokespecial Zx : (Lcom/fasterxml/Zb/Zj;)V
    //   124: return
    //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: aload_0
    //   130: getfield Zi : I
    //   133: aload_0
    //   134: getfield ZR : I
    //   137: if_icmplt -> 151
    //   140: aload_0
    //   141: invokevirtual ZQ : ()V
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: aload_0
    //   152: getfield ZY : [B
    //   155: aload_0
    //   156: dup
    //   157: getfield Zi : I
    //   160: dup_x1
    //   161: iconst_1
    //   162: iadd
    //   163: putfield Zi : I
    //   166: aload_0
    //   167: getfield Zd : B
    //   170: bastore
    //   171: aload_1
    //   172: aload_0
    //   173: getfield ZY : [B
    //   176: aload_0
    //   177: getfield Zi : I
    //   180: invokeinterface ZN : ([BI)I
    //   185: istore #4
    //   187: iload #4
    //   189: ifge -> 213
    //   192: aload_0
    //   193: aload_1
    //   194: invokeinterface Zx : ()[B
    //   199: invokespecial Zk : ([B)V
    //   202: iload_2
    //   203: ifne -> 231
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   212: athrow
    //   213: aload_0
    //   214: dup
    //   215: getfield Zi : I
    //   218: iload #4
    //   220: iadd
    //   221: putfield Zi : I
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   230: athrow
    //   231: aload_0
    //   232: getfield Zi : I
    //   235: aload_0
    //   236: getfield ZR : I
    //   239: if_icmplt -> 253
    //   242: aload_0
    //   243: invokevirtual ZQ : ()V
    //   246: goto -> 253
    //   249: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   252: athrow
    //   253: aload_0
    //   254: getfield ZY : [B
    //   257: aload_0
    //   258: dup
    //   259: getfield Zi : I
    //   262: dup_x1
    //   263: iconst_1
    //   264: iadd
    //   265: putfield Zi : I
    //   268: aload_0
    //   269: getfield Zd : B
    //   272: bastore
    //   273: return
    // Exception table:
    //   from	to	target	type
    //   4	17	17	java/io/IOException
    //   35	53	56	java/io/IOException
    //   60	76	79	java/io/IOException
    //   65	87	90	java/io/IOException
    //   112	125	125	java/io/IOException
    //   129	144	147	java/io/IOException
    //   187	206	209	java/io/IOException
    //   192	224	227	java/io/IOException
    //   231	246	249	java/io/IOException
  }
  
  private final void Zx(Zj paramZj) throws IOException {
    int j = paramZj.ZN(this.ZY, this.Zi);
    int i = Zf.ZH();
    try {
      if (j < 0) {
        try {
          Zk(paramZj.Zx());
          if (i == 0) {
            this.Zi += j;
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.Zi += j;
  }
  
  public final void Zd() throws IOException {
    Zk(c(-638, 30576));
    this.Zo = this.Zo.Ze();
    int i = Zf.ZI();
    try {
      ZV().Zj(this.Zo.Zs());
      if (this.Ze != null) {
        try {
          this.Ze.Zy((Zf)this);
          if (i != 0) {
            try {
              if (this.Zi >= this.ZR)
                ZQ(); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            this.ZY[this.Zi++] = 91;
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zi >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZY[this.Zi++] = 91;
  }
  
  public final void Zo(Object paramObject) throws IOException {
    Zk(c(-640, -7577));
    int i = Zf.ZH();
    try {
      this.Zo = this.Zo.Zx(paramObject);
      ZV().Zj(this.Zo.Zs());
      if (this.Ze != null) {
        try {
          this.Ze.Zy((Zf)this);
          if (i == 0) {
            try {
              if (this.Zi >= this.ZR)
                ZQ(); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            this.ZY[this.Zi++] = 91;
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zi >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZY[this.Zi++] = 91;
  }
  
  public void Zf(Object paramObject, int paramInt) throws IOException {
    Zk(c(-640, -7577));
    this.Zo = this.Zo.Zx(paramObject);
    ZV().Zj(this.Zo.Zs());
    int i = Zf.ZI();
    try {
      if (this.Ze != null) {
        try {
          this.Ze.Zy((Zf)this);
          if (i != 0) {
            try {
              if (this.Zi >= this.ZR)
                ZQ(); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            this.ZY[this.Zi++] = 91;
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zi >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZY[this.Zi++] = 91;
  }
  
  public final void ZI() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   8: invokevirtual Zo : ()Z
    //   11: ifne -> 57
    //   14: aload_0
    //   15: new java/lang/StringBuilder
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: sipush #-610
    //   25: sipush #22290
    //   28: invokestatic c : (II)Ljava/lang/String;
    //   31: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: aload_0
    //   35: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   38: invokevirtual ZF : ()Ljava/lang/String;
    //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: invokevirtual toString : ()Ljava/lang/String;
    //   47: invokevirtual Zr : (Ljava/lang/String;)V
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_0
    //   58: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   61: ifnull -> 92
    //   64: aload_0
    //   65: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   68: aload_0
    //   69: aload_0
    //   70: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   73: invokevirtual Zc : ()I
    //   76: invokeinterface Zi : (Lcom/fasterxml/Zb/Zf;I)V
    //   81: iload_1
    //   82: ifne -> 139
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: aload_0
    //   93: getfield Zi : I
    //   96: aload_0
    //   97: getfield ZR : I
    //   100: if_icmplt -> 121
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: aload_0
    //   111: invokevirtual ZQ : ()V
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: aload_0
    //   122: getfield ZY : [B
    //   125: aload_0
    //   126: dup
    //   127: getfield Zi : I
    //   130: dup_x1
    //   131: iconst_1
    //   132: iadd
    //   133: putfield Zi : I
    //   136: bipush #93
    //   138: bastore
    //   139: aload_0
    //   140: aload_0
    //   141: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   144: invokevirtual Zp : ()Lcom/fasterxml/Zq/Zf;
    //   147: putfield Zo : Lcom/fasterxml/Zq/Zf;
    //   150: return
    // Exception table:
    //   from	to	target	type
    //   4	50	53	java/io/IOException
    //   57	85	88	java/io/IOException
    //   64	103	106	java/io/IOException
    //   92	114	117	java/io/IOException
  }
  
  public final void ZJ() throws IOException {
    Zk(c(-634, 21673));
    int i = Zf.ZH();
    try {
      this.Zo = this.Zo.ZD();
      ZV().Zj(this.Zo.Zs());
      if (this.Ze != null) {
        try {
          this.Ze.ZN((Zf)this);
          if (i == 0) {
            try {
              if (this.Zi >= this.ZR)
                ZQ(); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            this.ZY[this.Zi++] = 123;
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zi >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZY[this.Zi++] = 123;
  }
  
  public void ZB(Object paramObject) throws IOException {
    Zk(c(-613, -1439));
    Zf zf = this.Zo.Zu(paramObject);
    ZV().Zj(zf.Zs());
    int i = Zf.ZI();
    try {
      this.Zo = zf;
      if (this.Ze != null) {
        try {
          this.Ze.ZN((Zf)this);
          if (i != 0) {
            try {
              if (this.Zi >= this.ZR)
                ZQ(); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            this.ZY[this.Zi++] = 123;
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zi >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZY[this.Zi++] = 123;
  }
  
  public void Ze(Object paramObject, int paramInt) throws IOException {
    ZB(paramObject);
  }
  
  public final void Zh() throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   8: invokevirtual ZQ : ()Z
    //   11: ifne -> 57
    //   14: aload_0
    //   15: new java/lang/StringBuilder
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: sipush #-614
    //   25: sipush #29734
    //   28: invokestatic c : (II)Ljava/lang/String;
    //   31: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: aload_0
    //   35: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   38: invokevirtual ZF : ()Ljava/lang/String;
    //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: invokevirtual toString : ()Ljava/lang/String;
    //   47: invokevirtual Zr : (Ljava/lang/String;)V
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_0
    //   58: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   61: ifnull -> 92
    //   64: aload_0
    //   65: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   68: aload_0
    //   69: aload_0
    //   70: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   73: invokevirtual Zc : ()I
    //   76: invokeinterface Zy : (Lcom/fasterxml/Zb/Zf;I)V
    //   81: iload_1
    //   82: ifeq -> 139
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: aload_0
    //   93: getfield Zi : I
    //   96: aload_0
    //   97: getfield ZR : I
    //   100: if_icmplt -> 121
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: aload_0
    //   111: invokevirtual ZQ : ()V
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: aload_0
    //   122: getfield ZY : [B
    //   125: aload_0
    //   126: dup
    //   127: getfield Zi : I
    //   130: dup_x1
    //   131: iconst_1
    //   132: iadd
    //   133: putfield Zi : I
    //   136: bipush #125
    //   138: bastore
    //   139: aload_0
    //   140: aload_0
    //   141: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   144: invokevirtual Zp : ()Lcom/fasterxml/Zq/Zf;
    //   147: putfield Zo : Lcom/fasterxml/Zq/Zf;
    //   150: return
    // Exception table:
    //   from	to	target	type
    //   4	50	53	java/io/IOException
    //   57	85	88	java/io/IOException
    //   64	103	106	java/io/IOException
    //   92	114	117	java/io/IOException
  }
  
  protected final void Zq(String paramString) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   7: aload_1
    //   8: invokevirtual Zc : (Ljava/lang/String;)I
    //   11: istore_3
    //   12: istore_2
    //   13: iload_3
    //   14: iconst_4
    //   15: if_icmpne -> 38
    //   18: aload_0
    //   19: sipush #-626
    //   22: sipush #22961
    //   25: invokestatic c : (II)Ljava/lang/String;
    //   28: invokevirtual Zr : (Ljava/lang/String;)V
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   37: athrow
    //   38: iload_3
    //   39: iconst_1
    //   40: if_icmpne -> 64
    //   43: aload_0
    //   44: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   47: aload_0
    //   48: invokeinterface ZK : (Lcom/fasterxml/Zb/Zf;)V
    //   53: iload_2
    //   54: ifne -> 81
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   63: athrow
    //   64: aload_0
    //   65: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   68: aload_0
    //   69: invokeinterface ZV : (Lcom/fasterxml/Zb/Zf;)V
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   80: athrow
    //   81: aload_0
    //   82: getfield ZA : Z
    //   85: ifeq -> 99
    //   88: aload_0
    //   89: aload_1
    //   90: iconst_0
    //   91: invokespecial ZH : (Ljava/lang/String;Z)V
    //   94: return
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: aload_1
    //   100: invokevirtual length : ()I
    //   103: istore #4
    //   105: iload #4
    //   107: aload_0
    //   108: getfield ZD : I
    //   111: if_icmple -> 125
    //   114: aload_0
    //   115: aload_1
    //   116: iconst_1
    //   117: invokespecial ZH : (Ljava/lang/String;Z)V
    //   120: return
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: aload_0
    //   126: getfield Zi : I
    //   129: aload_0
    //   130: getfield ZR : I
    //   133: if_icmplt -> 147
    //   136: aload_0
    //   137: invokevirtual ZQ : ()V
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: aload_0
    //   148: getfield ZY : [B
    //   151: aload_0
    //   152: dup
    //   153: getfield Zi : I
    //   156: dup_x1
    //   157: iconst_1
    //   158: iadd
    //   159: putfield Zi : I
    //   162: aload_0
    //   163: getfield Zd : B
    //   166: bastore
    //   167: aload_1
    //   168: iconst_0
    //   169: iload #4
    //   171: aload_0
    //   172: getfield Zg : [C
    //   175: iconst_0
    //   176: invokevirtual getChars : (II[CI)V
    //   179: iload #4
    //   181: aload_0
    //   182: getfield ZX : I
    //   185: if_icmpgt -> 235
    //   188: aload_0
    //   189: getfield Zi : I
    //   192: iload #4
    //   194: iadd
    //   195: aload_0
    //   196: getfield ZR : I
    //   199: if_icmple -> 220
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   208: athrow
    //   209: aload_0
    //   210: invokevirtual ZQ : ()V
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   219: athrow
    //   220: aload_0
    //   221: aload_0
    //   222: getfield Zg : [C
    //   225: iconst_0
    //   226: iload #4
    //   228: invokespecial Ze : ([CII)V
    //   231: iload_2
    //   232: ifne -> 253
    //   235: aload_0
    //   236: aload_0
    //   237: getfield Zg : [C
    //   240: iconst_0
    //   241: iload #4
    //   243: invokespecial ZI : ([CII)V
    //   246: goto -> 253
    //   249: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   252: athrow
    //   253: aload_0
    //   254: getfield Zi : I
    //   257: aload_0
    //   258: getfield ZR : I
    //   261: if_icmplt -> 275
    //   264: aload_0
    //   265: invokevirtual ZQ : ()V
    //   268: goto -> 275
    //   271: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   274: athrow
    //   275: aload_0
    //   276: getfield ZY : [B
    //   279: aload_0
    //   280: dup
    //   281: getfield Zi : I
    //   284: dup_x1
    //   285: iconst_1
    //   286: iadd
    //   287: putfield Zi : I
    //   290: aload_0
    //   291: getfield Zd : B
    //   294: bastore
    //   295: return
    // Exception table:
    //   from	to	target	type
    //   13	31	34	java/io/IOException
    //   38	57	60	java/io/IOException
    //   43	74	77	java/io/IOException
    //   81	95	95	java/io/IOException
    //   105	121	121	java/io/IOException
    //   125	140	143	java/io/IOException
    //   147	202	205	java/io/IOException
    //   188	213	216	java/io/IOException
    //   220	246	249	java/io/IOException
    //   253	268	271	java/io/IOException
  }
  
  protected final void ZW(Zj paramZj) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   7: aload_1
    //   8: invokeinterface ZV : ()Ljava/lang/String;
    //   13: invokevirtual Zc : (Ljava/lang/String;)I
    //   16: istore_3
    //   17: istore_2
    //   18: iload_3
    //   19: iconst_4
    //   20: if_icmpne -> 43
    //   23: aload_0
    //   24: sipush #-616
    //   27: sipush #18199
    //   30: invokestatic c : (II)Ljava/lang/String;
    //   33: invokevirtual Zr : (Ljava/lang/String;)V
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: iload_3
    //   44: iconst_1
    //   45: if_icmpne -> 69
    //   48: aload_0
    //   49: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   52: aload_0
    //   53: invokeinterface ZK : (Lcom/fasterxml/Zb/Zf;)V
    //   58: iload_2
    //   59: ifne -> 86
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: aload_0
    //   70: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   73: aload_0
    //   74: invokeinterface ZV : (Lcom/fasterxml/Zb/Zf;)V
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: aload_0
    //   87: getfield ZA : Z
    //   90: ifne -> 101
    //   93: iconst_1
    //   94: goto -> 102
    //   97: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   100: athrow
    //   101: iconst_0
    //   102: istore #4
    //   104: iload #4
    //   106: ifeq -> 158
    //   109: aload_0
    //   110: getfield Zi : I
    //   113: aload_0
    //   114: getfield ZR : I
    //   117: if_icmplt -> 138
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: aload_0
    //   128: invokevirtual ZQ : ()V
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: aload_0
    //   139: getfield ZY : [B
    //   142: aload_0
    //   143: dup
    //   144: getfield Zi : I
    //   147: dup_x1
    //   148: iconst_1
    //   149: iadd
    //   150: putfield Zi : I
    //   153: aload_0
    //   154: getfield Zd : B
    //   157: bastore
    //   158: aload_1
    //   159: aload_0
    //   160: getfield ZY : [B
    //   163: aload_0
    //   164: getfield Zi : I
    //   167: invokeinterface ZN : ([BI)I
    //   172: istore #5
    //   174: iload #5
    //   176: ifge -> 200
    //   179: aload_0
    //   180: aload_1
    //   181: invokeinterface Zx : ()[B
    //   186: invokespecial Zk : ([B)V
    //   189: iload_2
    //   190: ifne -> 218
    //   193: goto -> 200
    //   196: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   199: athrow
    //   200: aload_0
    //   201: dup
    //   202: getfield Zi : I
    //   205: iload #5
    //   207: iadd
    //   208: putfield Zi : I
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   217: athrow
    //   218: iload #4
    //   220: ifeq -> 272
    //   223: aload_0
    //   224: getfield Zi : I
    //   227: aload_0
    //   228: getfield ZR : I
    //   231: if_icmplt -> 252
    //   234: goto -> 241
    //   237: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   240: athrow
    //   241: aload_0
    //   242: invokevirtual ZQ : ()V
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   251: athrow
    //   252: aload_0
    //   253: getfield ZY : [B
    //   256: aload_0
    //   257: dup
    //   258: getfield Zi : I
    //   261: dup_x1
    //   262: iconst_1
    //   263: iadd
    //   264: putfield Zi : I
    //   267: aload_0
    //   268: getfield Zd : B
    //   271: bastore
    //   272: return
    // Exception table:
    //   from	to	target	type
    //   18	36	39	java/io/IOException
    //   43	62	65	java/io/IOException
    //   48	79	82	java/io/IOException
    //   86	97	97	java/io/IOException
    //   104	120	123	java/io/IOException
    //   109	131	134	java/io/IOException
    //   174	193	196	java/io/IOException
    //   179	211	214	java/io/IOException
    //   218	234	237	java/io/IOException
    //   223	245	248	java/io/IOException
  }
  
  public void ZD(String paramString) throws IOException {
    try {
      Zk(c(-635, 13413));
      if (paramString == null) {
        ZL();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = paramString.length();
    try {
      if (i > this.ZX) {
        ZH(paramString, true);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zi + i >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.ZY[this.Zi++] = this.Zd;
      ZJ(paramString, 0, i);
      if (this.Zi >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZY[this.Zi++] = this.Zd;
  }
  
  public void ZA(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: aload_0
    //   4: sipush #-632
    //   7: sipush #-14409
    //   10: invokestatic c : (II)Ljava/lang/String;
    //   13: invokevirtual Zk : (Ljava/lang/String;)V
    //   16: istore #4
    //   18: aload_0
    //   19: getfield Zi : I
    //   22: aload_0
    //   23: getfield ZR : I
    //   26: if_icmplt -> 40
    //   29: aload_0
    //   30: invokevirtual ZQ : ()V
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   39: athrow
    //   40: aload_0
    //   41: getfield ZY : [B
    //   44: aload_0
    //   45: dup
    //   46: getfield Zi : I
    //   49: dup_x1
    //   50: iconst_1
    //   51: iadd
    //   52: putfield Zi : I
    //   55: aload_0
    //   56: getfield Zd : B
    //   59: bastore
    //   60: iload_3
    //   61: aload_0
    //   62: getfield ZX : I
    //   65: if_icmpgt -> 111
    //   68: aload_0
    //   69: getfield Zi : I
    //   72: iload_3
    //   73: iadd
    //   74: aload_0
    //   75: getfield ZR : I
    //   78: if_icmple -> 99
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   87: athrow
    //   88: aload_0
    //   89: invokevirtual ZQ : ()V
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: aload_0
    //   100: aload_1
    //   101: iload_2
    //   102: iload_3
    //   103: invokespecial Ze : ([CII)V
    //   106: iload #4
    //   108: ifeq -> 125
    //   111: aload_0
    //   112: aload_1
    //   113: iload_2
    //   114: iload_3
    //   115: invokespecial ZI : ([CII)V
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: aload_0
    //   126: getfield Zi : I
    //   129: aload_0
    //   130: getfield ZR : I
    //   133: if_icmplt -> 147
    //   136: aload_0
    //   137: invokevirtual ZQ : ()V
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: aload_0
    //   148: getfield ZY : [B
    //   151: aload_0
    //   152: dup
    //   153: getfield Zi : I
    //   156: dup_x1
    //   157: iconst_1
    //   158: iadd
    //   159: putfield Zi : I
    //   162: aload_0
    //   163: getfield Zd : B
    //   166: bastore
    //   167: return
    // Exception table:
    //   from	to	target	type
    //   18	33	36	java/io/IOException
    //   40	81	84	java/io/IOException
    //   68	92	95	java/io/IOException
    //   99	118	121	java/io/IOException
    //   125	140	143	java/io/IOException
  }
  
  public final void Zr(Zj paramZj) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: sipush #-632
    //   7: sipush #-14409
    //   10: invokestatic c : (II)Ljava/lang/String;
    //   13: invokevirtual Zk : (Ljava/lang/String;)V
    //   16: istore_2
    //   17: aload_0
    //   18: getfield Zi : I
    //   21: aload_0
    //   22: getfield ZR : I
    //   25: if_icmplt -> 39
    //   28: aload_0
    //   29: invokevirtual ZQ : ()V
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   38: athrow
    //   39: aload_0
    //   40: getfield ZY : [B
    //   43: aload_0
    //   44: dup
    //   45: getfield Zi : I
    //   48: dup_x1
    //   49: iconst_1
    //   50: iadd
    //   51: putfield Zi : I
    //   54: aload_0
    //   55: getfield Zd : B
    //   58: bastore
    //   59: aload_1
    //   60: aload_0
    //   61: getfield ZY : [B
    //   64: aload_0
    //   65: getfield Zi : I
    //   68: invokeinterface ZN : ([BI)I
    //   73: istore_3
    //   74: iload_3
    //   75: ifge -> 99
    //   78: aload_0
    //   79: aload_1
    //   80: invokeinterface Zx : ()[B
    //   85: invokespecial Zk : ([B)V
    //   88: iload_2
    //   89: ifne -> 116
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: aload_0
    //   100: dup
    //   101: getfield Zi : I
    //   104: iload_3
    //   105: iadd
    //   106: putfield Zi : I
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   115: athrow
    //   116: aload_0
    //   117: getfield Zi : I
    //   120: aload_0
    //   121: getfield ZR : I
    //   124: if_icmplt -> 138
    //   127: aload_0
    //   128: invokevirtual ZQ : ()V
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: aload_0
    //   139: getfield ZY : [B
    //   142: aload_0
    //   143: dup
    //   144: getfield Zi : I
    //   147: dup_x1
    //   148: iconst_1
    //   149: iadd
    //   150: putfield Zi : I
    //   153: aload_0
    //   154: getfield Zd : B
    //   157: bastore
    //   158: return
    // Exception table:
    //   from	to	target	type
    //   17	32	35	java/io/IOException
    //   74	92	95	java/io/IOException
    //   78	109	112	java/io/IOException
    //   116	131	134	java/io/IOException
  }
  
  public void ZM(String paramString) throws IOException {
    int j = paramString.length();
    int i = Zf.ZI();
    char[] arrayOfChar = this.Zg;
    try {
      if (j <= arrayOfChar.length) {
        try {
          paramString.getChars(0, j, arrayOfChar, 0);
          Zh(arrayOfChar, 0, j);
          if (i != 0) {
            Zt(paramString, 0, j);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zt(paramString, 0, j);
  }
  
  public void Zt(String paramString, int paramInt1, int paramInt2) throws IOException {
    Zp(paramString, paramInt1, paramInt2);
    char[] arrayOfChar = this.Zg;
    int i = Zf.ZH();
    int j = arrayOfChar.length;
    try {
      if (paramInt2 <= j) {
        paramString.getChars(paramInt1, paramInt1 + paramInt2, arrayOfChar, 0);
        Zh(arrayOfChar, 0, paramInt2);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int k = Math.min(j, (this.ZR >> 2) + (this.ZR >> 4));
    int m = k * 3;
    while (paramInt2 > 0) {
      int n = Math.min(k, paramInt2);
      try {
        paramString.getChars(paramInt1, paramInt1 + n, arrayOfChar, 0);
        if (this.Zi + m > this.ZR)
          ZQ(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      if (n > 1) {
        char c = arrayOfChar[n - 1];
        try {
          if (c >= '?')
            try {
              if (c <= '?')
                n--; 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
      Zy(arrayOfChar, 0, n);
      paramInt1 += n;
      paramInt2 -= n;
      if (i == 0)
        break; 
    } 
  }
  
  public void Zg(Zj paramZj) throws IOException {
    int j = paramZj.Zk(this.ZY, this.Zi);
    int i = Zf.ZI();
    try {
      if (j < 0) {
        try {
          Zk(paramZj.Zv());
          if (i != 0) {
            this.Zi += j;
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.Zi += j;
  }
  
  public void Zh(Zj paramZj) throws IOException {
    Zk(c(-633, -29623));
    int j = paramZj.Zk(this.ZY, this.Zi);
    int i = Zf.ZH();
    try {
      if (j < 0) {
        try {
          Zk(paramZj.Zv());
          if (i == 0) {
            this.Zi += j;
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.Zi += j;
  }
  
  public final void Zh(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iload_2
    //   3: iload_3
    //   4: invokevirtual Zs : ([CII)V
    //   7: invokestatic ZI : ()I
    //   10: iload_3
    //   11: iload_3
    //   12: iadd
    //   13: iload_3
    //   14: iadd
    //   15: istore #5
    //   17: istore #4
    //   19: aload_0
    //   20: getfield Zi : I
    //   23: iload #5
    //   25: iadd
    //   26: aload_0
    //   27: getfield ZR : I
    //   30: if_icmple -> 65
    //   33: aload_0
    //   34: getfield ZR : I
    //   37: iload #5
    //   39: if_icmpge -> 61
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   48: athrow
    //   49: aload_0
    //   50: aload_1
    //   51: iload_2
    //   52: iload_3
    //   53: invokespecial ZO : ([CII)V
    //   56: return
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: aload_0
    //   62: invokevirtual ZQ : ()V
    //   65: iload_3
    //   66: iload_2
    //   67: iadd
    //   68: istore_3
    //   69: iload_2
    //   70: iload_3
    //   71: if_icmpge -> 244
    //   74: aload_1
    //   75: iload_2
    //   76: caload
    //   77: istore #5
    //   79: iload #5
    //   81: bipush #127
    //   83: if_icmple -> 91
    //   86: iload #4
    //   88: ifeq -> 149
    //   91: aload_0
    //   92: getfield ZY : [B
    //   95: aload_0
    //   96: dup
    //   97: getfield Zi : I
    //   100: dup_x1
    //   101: iconst_1
    //   102: iadd
    //   103: putfield Zi : I
    //   106: iload #5
    //   108: i2b
    //   109: bastore
    //   110: iinc #2, 1
    //   113: iload_2
    //   114: iload_3
    //   115: if_icmplt -> 137
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: iload #4
    //   127: ifeq -> 244
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   136: athrow
    //   137: iload #4
    //   139: ifeq -> 74
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   148: athrow
    //   149: aload_1
    //   150: iload_2
    //   151: iinc #2, 1
    //   154: caload
    //   155: istore #5
    //   157: iload #5
    //   159: sipush #2048
    //   162: if_icmpge -> 229
    //   165: aload_0
    //   166: getfield ZY : [B
    //   169: aload_0
    //   170: dup
    //   171: getfield Zi : I
    //   174: dup_x1
    //   175: iconst_1
    //   176: iadd
    //   177: putfield Zi : I
    //   180: sipush #192
    //   183: iload #5
    //   185: bipush #6
    //   187: ishr
    //   188: ior
    //   189: i2b
    //   190: bastore
    //   191: aload_0
    //   192: getfield ZY : [B
    //   195: aload_0
    //   196: dup
    //   197: getfield Zi : I
    //   200: dup_x1
    //   201: iconst_1
    //   202: iadd
    //   203: putfield Zi : I
    //   206: sipush #128
    //   209: iload #5
    //   211: bipush #63
    //   213: iand
    //   214: ior
    //   215: i2b
    //   216: bastore
    //   217: iload #4
    //   219: ifeq -> 239
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   228: athrow
    //   229: aload_0
    //   230: iload #5
    //   232: aload_1
    //   233: iload_2
    //   234: iload_3
    //   235: invokespecial Zh : (I[CII)I
    //   238: istore_2
    //   239: iload #4
    //   241: ifeq -> 69
    //   244: return
    // Exception table:
    //   from	to	target	type
    //   19	42	45	java/io/IOException
    //   33	57	57	java/io/IOException
    //   86	118	121	java/io/IOException
    //   91	130	133	java/io/IOException
    //   125	142	145	java/io/IOException
    //   157	222	225	java/io/IOException
  }
  
  public void ZB(char paramChar) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield Zi : I
    //   8: iconst_3
    //   9: iadd
    //   10: aload_0
    //   11: getfield ZR : I
    //   14: if_icmplt -> 28
    //   17: aload_0
    //   18: invokevirtual ZQ : ()V
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: aload_0
    //   29: getfield ZY : [B
    //   32: astore_3
    //   33: iload_1
    //   34: bipush #127
    //   36: if_icmpgt -> 65
    //   39: aload_3
    //   40: aload_0
    //   41: dup
    //   42: getfield Zi : I
    //   45: dup_x1
    //   46: iconst_1
    //   47: iadd
    //   48: putfield Zi : I
    //   51: iload_1
    //   52: i2b
    //   53: bastore
    //   54: iload_2
    //   55: ifeq -> 150
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   64: athrow
    //   65: iload_1
    //   66: sipush #2048
    //   69: if_icmpge -> 134
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   78: athrow
    //   79: aload_3
    //   80: aload_0
    //   81: dup
    //   82: getfield Zi : I
    //   85: dup_x1
    //   86: iconst_1
    //   87: iadd
    //   88: putfield Zi : I
    //   91: sipush #192
    //   94: iload_1
    //   95: bipush #6
    //   97: ishr
    //   98: ior
    //   99: i2b
    //   100: bastore
    //   101: aload_3
    //   102: aload_0
    //   103: dup
    //   104: getfield Zi : I
    //   107: dup_x1
    //   108: iconst_1
    //   109: iadd
    //   110: putfield Zi : I
    //   113: sipush #128
    //   116: iload_1
    //   117: bipush #63
    //   119: iand
    //   120: ior
    //   121: i2b
    //   122: bastore
    //   123: iload_2
    //   124: ifeq -> 150
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: aload_0
    //   135: iload_1
    //   136: aconst_null
    //   137: iconst_0
    //   138: iconst_0
    //   139: invokespecial Zh : (I[CII)I
    //   142: pop
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   149: athrow
    //   150: return
    // Exception table:
    //   from	to	target	type
    //   4	21	24	java/io/IOException
    //   33	58	61	java/io/IOException
    //   39	72	75	java/io/IOException
    //   65	127	130	java/io/IOException
    //   79	143	146	java/io/IOException
  }
  
  private final void ZO(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: aload_0
    //   4: getfield ZR : I
    //   7: istore #5
    //   9: istore #4
    //   11: aload_0
    //   12: getfield ZY : [B
    //   15: astore #6
    //   17: iload_2
    //   18: iload_3
    //   19: iadd
    //   20: istore #7
    //   22: iload_2
    //   23: iload #7
    //   25: if_icmpge -> 238
    //   28: aload_1
    //   29: iload_2
    //   30: caload
    //   31: istore #8
    //   33: iload #8
    //   35: bipush #127
    //   37: if_icmple -> 45
    //   40: iload #4
    //   42: ifeq -> 122
    //   45: aload_0
    //   46: getfield Zi : I
    //   49: iload #5
    //   51: if_icmplt -> 72
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: aload_0
    //   62: invokevirtual ZQ : ()V
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: aload #6
    //   74: aload_0
    //   75: dup
    //   76: getfield Zi : I
    //   79: dup_x1
    //   80: iconst_1
    //   81: iadd
    //   82: putfield Zi : I
    //   85: iload #8
    //   87: i2b
    //   88: bastore
    //   89: iinc #2, 1
    //   92: iload_2
    //   93: iload #7
    //   95: if_icmplt -> 110
    //   98: iload #4
    //   100: ifeq -> 238
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: iload #4
    //   112: ifeq -> 28
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   121: athrow
    //   122: aload_0
    //   123: getfield Zi : I
    //   126: iconst_3
    //   127: iadd
    //   128: aload_0
    //   129: getfield ZR : I
    //   132: if_icmplt -> 146
    //   135: aload_0
    //   136: invokevirtual ZQ : ()V
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: aload_1
    //   147: iload_2
    //   148: iinc #2, 1
    //   151: caload
    //   152: istore #8
    //   154: iload #8
    //   156: sipush #2048
    //   159: if_icmpge -> 222
    //   162: aload #6
    //   164: aload_0
    //   165: dup
    //   166: getfield Zi : I
    //   169: dup_x1
    //   170: iconst_1
    //   171: iadd
    //   172: putfield Zi : I
    //   175: sipush #192
    //   178: iload #8
    //   180: bipush #6
    //   182: ishr
    //   183: ior
    //   184: i2b
    //   185: bastore
    //   186: aload #6
    //   188: aload_0
    //   189: dup
    //   190: getfield Zi : I
    //   193: dup_x1
    //   194: iconst_1
    //   195: iadd
    //   196: putfield Zi : I
    //   199: sipush #128
    //   202: iload #8
    //   204: bipush #63
    //   206: iand
    //   207: ior
    //   208: i2b
    //   209: bastore
    //   210: iload #4
    //   212: ifeq -> 233
    //   215: goto -> 222
    //   218: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   221: athrow
    //   222: aload_0
    //   223: iload #8
    //   225: aload_1
    //   226: iload_2
    //   227: iload #7
    //   229: invokespecial Zh : (I[CII)I
    //   232: istore_2
    //   233: iload #4
    //   235: ifeq -> 22
    //   238: return
    // Exception table:
    //   from	to	target	type
    //   40	54	57	java/io/IOException
    //   45	65	68	java/io/IOException
    //   72	103	106	java/io/IOException
    //   98	115	118	java/io/IOException
    //   122	139	142	java/io/IOException
    //   154	215	218	java/io/IOException
  }
  
  private void Zy(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore #4
    //   5: iload_2
    //   6: iload_3
    //   7: if_icmpge -> 180
    //   10: aload_1
    //   11: iload_2
    //   12: caload
    //   13: istore #5
    //   15: iload #5
    //   17: bipush #127
    //   19: if_icmple -> 27
    //   22: iload #4
    //   24: ifne -> 85
    //   27: aload_0
    //   28: getfield ZY : [B
    //   31: aload_0
    //   32: dup
    //   33: getfield Zi : I
    //   36: dup_x1
    //   37: iconst_1
    //   38: iadd
    //   39: putfield Zi : I
    //   42: iload #5
    //   44: i2b
    //   45: bastore
    //   46: iinc #2, 1
    //   49: iload_2
    //   50: iload_3
    //   51: if_icmplt -> 73
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: iload #4
    //   63: ifne -> 180
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   72: athrow
    //   73: iload #4
    //   75: ifne -> 10
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   84: athrow
    //   85: aload_1
    //   86: iload_2
    //   87: iinc #2, 1
    //   90: caload
    //   91: istore #5
    //   93: iload #5
    //   95: sipush #2048
    //   98: if_icmpge -> 165
    //   101: aload_0
    //   102: getfield ZY : [B
    //   105: aload_0
    //   106: dup
    //   107: getfield Zi : I
    //   110: dup_x1
    //   111: iconst_1
    //   112: iadd
    //   113: putfield Zi : I
    //   116: sipush #192
    //   119: iload #5
    //   121: bipush #6
    //   123: ishr
    //   124: ior
    //   125: i2b
    //   126: bastore
    //   127: aload_0
    //   128: getfield ZY : [B
    //   131: aload_0
    //   132: dup
    //   133: getfield Zi : I
    //   136: dup_x1
    //   137: iconst_1
    //   138: iadd
    //   139: putfield Zi : I
    //   142: sipush #128
    //   145: iload #5
    //   147: bipush #63
    //   149: iand
    //   150: ior
    //   151: i2b
    //   152: bastore
    //   153: iload #4
    //   155: ifne -> 175
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   164: athrow
    //   165: aload_0
    //   166: iload #5
    //   168: aload_1
    //   169: iload_2
    //   170: iload_3
    //   171: invokespecial Zh : (I[CII)I
    //   174: istore_2
    //   175: iload #4
    //   177: ifne -> 5
    //   180: return
    // Exception table:
    //   from	to	target	type
    //   22	54	57	java/io/IOException
    //   27	66	69	java/io/IOException
    //   61	78	81	java/io/IOException
    //   93	158	161	java/io/IOException
  }
  
  public void Z_(com.fasterxml.Zb.Zy paramZy, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException, Zm1 {
    try {
      ZX(paramArrayOfbyte, paramInt1, paramInt2);
      Zk(c(-615, 19595));
      if (this.Zi >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.ZY[this.Zi++] = this.Zd;
      Zu(paramZy, paramArrayOfbyte, paramInt1, paramInt1 + paramInt2);
      if (this.Zi >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZY[this.Zi++] = this.Zd;
  }
  
  public int ZE(com.fasterxml.Zb.Zy paramZy, InputStream paramInputStream, int paramInt) throws IOException, Zm1 {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: sipush #-609
    //   7: sipush #-24522
    //   10: invokestatic c : (II)Ljava/lang/String;
    //   13: invokevirtual Zk : (Ljava/lang/String;)V
    //   16: istore #4
    //   18: aload_0
    //   19: getfield Zi : I
    //   22: aload_0
    //   23: getfield ZR : I
    //   26: if_icmplt -> 40
    //   29: aload_0
    //   30: invokevirtual ZQ : ()V
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   39: athrow
    //   40: aload_0
    //   41: getfield ZY : [B
    //   44: aload_0
    //   45: dup
    //   46: getfield Zi : I
    //   49: dup_x1
    //   50: iconst_1
    //   51: iadd
    //   52: putfield Zi : I
    //   55: aload_0
    //   56: getfield Zd : B
    //   59: bastore
    //   60: aload_0
    //   61: getfield Zb : Lcom/fasterxml/Zv9;
    //   64: invokevirtual Ze : ()[B
    //   67: astore #5
    //   69: iload_3
    //   70: ifge -> 88
    //   73: aload_0
    //   74: aload_1
    //   75: aload_2
    //   76: aload #5
    //   78: invokevirtual Zc : (Lcom/fasterxml/Zb/Zy;Ljava/io/InputStream;[B)I
    //   81: istore #6
    //   83: iload #4
    //   85: ifne -> 166
    //   88: aload_0
    //   89: aload_1
    //   90: aload_2
    //   91: aload #5
    //   93: iload_3
    //   94: invokevirtual Zi : (Lcom/fasterxml/Zb/Zy;Ljava/io/InputStream;[BI)I
    //   97: istore #7
    //   99: iload #7
    //   101: ifle -> 163
    //   104: aload_0
    //   105: new java/lang/StringBuilder
    //   108: dup
    //   109: invokespecial <init> : ()V
    //   112: sipush #-629
    //   115: sipush #-24400
    //   118: invokestatic c : (II)Ljava/lang/String;
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: iload #7
    //   126: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   129: sipush #-636
    //   132: sipush #-31680
    //   135: invokestatic c : (II)Ljava/lang/String;
    //   138: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: iload_3
    //   142: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   145: ldc ')'
    //   147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: invokevirtual toString : ()Ljava/lang/String;
    //   153: invokevirtual Zr : (Ljava/lang/String;)V
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   162: athrow
    //   163: iload_3
    //   164: istore #6
    //   166: aload_0
    //   167: getfield Zb : Lcom/fasterxml/Zv9;
    //   170: aload #5
    //   172: invokevirtual Za : ([B)V
    //   175: goto -> 192
    //   178: astore #8
    //   180: aload_0
    //   181: getfield Zb : Lcom/fasterxml/Zv9;
    //   184: aload #5
    //   186: invokevirtual Za : ([B)V
    //   189: aload #8
    //   191: athrow
    //   192: aload_0
    //   193: getfield Zi : I
    //   196: aload_0
    //   197: getfield ZR : I
    //   200: if_icmplt -> 214
    //   203: aload_0
    //   204: invokevirtual ZQ : ()V
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   213: athrow
    //   214: aload_0
    //   215: getfield ZY : [B
    //   218: aload_0
    //   219: dup
    //   220: getfield Zi : I
    //   223: dup_x1
    //   224: iconst_1
    //   225: iadd
    //   226: putfield Zi : I
    //   229: aload_0
    //   230: getfield Zd : B
    //   233: bastore
    //   234: iload #6
    //   236: ireturn
    // Exception table:
    //   from	to	target	type
    //   18	33	36	java/io/IOException
    //   69	166	178	finally
    //   99	156	159	java/io/IOException
    //   178	180	178	finally
    //   192	207	210	java/io/IOException
  }
  
  public void ZF(short paramShort) throws IOException {
    try {
      Zk(c(-639, -11948));
      if (this.Zi + 6 >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zz) {
        Zr(paramShort);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.Zi = Zvr.ZG(paramShort, this.ZY, this.Zi);
  }
  
  private final void Zr(short paramShort) throws IOException {
    try {
      if (this.Zi + 8 >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZY[this.Zi++] = this.Zd;
    this.Zi = Zvr.ZG(paramShort, this.ZY, this.Zi);
    this.ZY[this.Zi++] = this.Zd;
  }
  
  public void Zd(int paramInt) throws IOException {
    try {
      Zk(c(-639, -11948));
      if (this.Zi + 11 >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zz) {
        Zi(paramInt);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.Zi = Zvr.ZG(paramInt, this.ZY, this.Zi);
  }
  
  private final void Zi(int paramInt) throws IOException {
    try {
      if (this.Zi + 13 >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZY[this.Zi++] = this.Zd;
    this.Zi = Zvr.ZG(paramInt, this.ZY, this.Zi);
    this.ZY[this.Zi++] = this.Zd;
  }
  
  public void Zw(long paramLong) throws IOException {
    try {
      Zk(c(-639, -11948));
      if (this.Zz) {
        Zz(paramLong);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zi + 21 >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.Zi = Zvr.Ze(paramLong, this.ZY, this.Zi);
  }
  
  private final void Zz(long paramLong) throws IOException {
    try {
      if (this.Zi + 23 >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZY[this.Zi++] = this.Zd;
    this.Zi = Zvr.Ze(paramLong, this.ZY, this.Zi);
    this.ZY[this.Zi++] = this.Zd;
  }
  
  public void Zy(BigInteger paramBigInteger) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: sipush #-639
    //   7: sipush #-11948
    //   10: invokestatic c : (II)Ljava/lang/String;
    //   13: invokevirtual Zk : (Ljava/lang/String;)V
    //   16: istore_2
    //   17: aload_1
    //   18: ifnonnull -> 36
    //   21: aload_0
    //   22: invokespecial ZL : ()V
    //   25: iload_2
    //   26: ifne -> 84
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_0
    //   37: getfield Zz : Z
    //   40: ifeq -> 69
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: aload_0
    //   51: aload_1
    //   52: invokevirtual toString : ()Ljava/lang/String;
    //   55: invokespecial ZL : (Ljava/lang/String;)V
    //   58: iload_2
    //   59: ifne -> 84
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: aload_0
    //   70: aload_1
    //   71: invokevirtual toString : ()Ljava/lang/String;
    //   74: invokevirtual ZM : (Ljava/lang/String;)V
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: return
    // Exception table:
    //   from	to	target	type
    //   17	29	32	java/io/IOException
    //   21	43	46	java/io/IOException
    //   36	62	65	java/io/IOException
    //   50	77	80	java/io/IOException
  }
  
  public void ZF(double paramDouble) throws IOException {
    try {
      if (!this.Zz) {
        try {
          if (Zvr.ZV(paramDouble))
            try {
              if (Zi.QUOTE_NON_NUMERIC_NUMBERS.Zw(this.ZE)) {
                ZD(Zvr.ZR(paramDouble, Za(Zi.USE_FAST_DOUBLE_WRITER)));
                return;
              } 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        } 
        Zk(c(-639, -11948));
        ZM(Zvr.ZR(paramDouble, Za(Zi.USE_FAST_DOUBLE_WRITER)));
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZD(Zvr.ZR(paramDouble, Za(Zi.USE_FAST_DOUBLE_WRITER)));
  }
  
  public void Za(float paramFloat) throws IOException {
    try {
      if (!this.Zz) {
        try {
          if (Zvr.Zi(paramFloat))
            try {
              if (Zi.QUOTE_NON_NUMERIC_NUMBERS.Zw(this.ZE)) {
                ZD(Zvr.Zh(paramFloat, Za(Zi.USE_FAST_DOUBLE_WRITER)));
                return;
              } 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        } 
        Zk(c(-639, -11948));
        ZM(Zvr.Zh(paramFloat, Za(Zi.USE_FAST_DOUBLE_WRITER)));
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZD(Zvr.Zh(paramFloat, Za(Zi.USE_FAST_DOUBLE_WRITER)));
  }
  
  public void ZI(BigDecimal paramBigDecimal) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: sipush #-639
    //   7: sipush #-11948
    //   10: invokestatic c : (II)Ljava/lang/String;
    //   13: invokevirtual Zk : (Ljava/lang/String;)V
    //   16: istore_2
    //   17: aload_1
    //   18: ifnonnull -> 36
    //   21: aload_0
    //   22: invokespecial ZL : ()V
    //   25: iload_2
    //   26: ifne -> 86
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_0
    //   37: getfield Zz : Z
    //   40: ifeq -> 70
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: aload_0
    //   51: aload_0
    //   52: aload_1
    //   53: invokevirtual Zz : (Ljava/math/BigDecimal;)Ljava/lang/String;
    //   56: invokespecial ZL : (Ljava/lang/String;)V
    //   59: iload_2
    //   60: ifne -> 86
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: aload_0
    //   71: aload_0
    //   72: aload_1
    //   73: invokevirtual Zz : (Ljava/math/BigDecimal;)Ljava/lang/String;
    //   76: invokevirtual ZM : (Ljava/lang/String;)V
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: return
    // Exception table:
    //   from	to	target	type
    //   17	29	32	java/io/IOException
    //   21	43	46	java/io/IOException
    //   36	63	66	java/io/IOException
    //   50	79	82	java/io/IOException
  }
  
  public void Zu(String paramString) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: sipush #-627
    //   7: sipush #-5696
    //   10: invokestatic c : (II)Ljava/lang/String;
    //   13: invokevirtual Zk : (Ljava/lang/String;)V
    //   16: istore_2
    //   17: aload_1
    //   18: ifnonnull -> 36
    //   21: aload_0
    //   22: invokespecial ZL : ()V
    //   25: iload_2
    //   26: ifne -> 78
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_0
    //   37: getfield Zz : Z
    //   40: ifeq -> 66
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: aload_0
    //   51: aload_1
    //   52: invokespecial ZL : (Ljava/lang/String;)V
    //   55: iload_2
    //   56: ifne -> 78
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   65: athrow
    //   66: aload_0
    //   67: aload_1
    //   68: invokevirtual ZM : (Ljava/lang/String;)V
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: return
    // Exception table:
    //   from	to	target	type
    //   17	29	32	java/io/IOException
    //   21	43	46	java/io/IOException
    //   36	59	62	java/io/IOException
    //   50	71	74	java/io/IOException
  }
  
  private final void ZL(String paramString) throws IOException {
    try {
      if (this.Zi >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.ZY[this.Zi++] = this.Zd;
      ZM(paramString);
      if (this.Zi >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZY[this.Zi++] = this.Zd;
  }
  
  public void Zs(boolean paramBoolean) throws IOException {
    try {
      Zk(c(-612, -4257));
      if (this.Zi + 5 >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte[] arrayOfByte = paramBoolean ? ZN : Za;
    int i = arrayOfByte.length;
    System.arraycopy(arrayOfByte, 0, this.ZY, this.Zi, i);
    this.Zi += i;
  }
  
  public void ZT() throws IOException {
    Zk(c(-631, 6848));
    ZL();
  }
  
  protected final void Zk(String paramString) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: aload_0
    //   4: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   7: invokevirtual Zz : ()I
    //   10: istore_3
    //   11: istore_2
    //   12: aload_0
    //   13: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   16: ifnull -> 30
    //   19: aload_0
    //   20: aload_1
    //   21: iload_3
    //   22: invokevirtual Zd : (Ljava/lang/String;I)V
    //   25: return
    //   26: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   29: athrow
    //   30: iload_3
    //   31: tableswitch default -> 68, 0 -> 68, 1 -> 73, 2 -> 81, 3 -> 89, 4 -> 68, 5 -> 134
    //   68: return
    //   69: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   72: athrow
    //   73: bipush #44
    //   75: istore #4
    //   77: iload_2
    //   78: ifeq -> 140
    //   81: bipush #58
    //   83: istore #4
    //   85: iload_2
    //   86: ifeq -> 140
    //   89: aload_0
    //   90: getfield ZP : Lcom/fasterxml/Zb/Zj;
    //   93: ifnull -> 133
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: aload_0
    //   104: getfield ZP : Lcom/fasterxml/Zb/Zj;
    //   107: invokeinterface Zv : ()[B
    //   112: astore #5
    //   114: aload #5
    //   116: arraylength
    //   117: ifle -> 133
    //   120: aload_0
    //   121: aload #5
    //   123: invokespecial Zk : ([B)V
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   132: athrow
    //   133: return
    //   134: aload_0
    //   135: aload_1
    //   136: invokevirtual Zg : (Ljava/lang/String;)V
    //   139: return
    //   140: aload_0
    //   141: getfield Zi : I
    //   144: aload_0
    //   145: getfield ZR : I
    //   148: if_icmplt -> 162
    //   151: aload_0
    //   152: invokevirtual ZQ : ()V
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   161: athrow
    //   162: aload_0
    //   163: getfield ZY : [B
    //   166: aload_0
    //   167: dup
    //   168: getfield Zi : I
    //   171: dup_x1
    //   172: iconst_1
    //   173: iadd
    //   174: putfield Zi : I
    //   177: iload #4
    //   179: bastore
    //   180: return
    // Exception table:
    //   from	to	target	type
    //   12	26	26	java/io/IOException
    //   30	69	69	java/io/IOException
    //   85	96	99	java/io/IOException
    //   114	126	129	java/io/IOException
    //   140	155	158	java/io/IOException
  }
  
  public void flush() throws IOException {
    try {
      ZQ();
      if (this.ZO != null)
        try {
          if (Za(Zi.FLUSH_PASSED_TO_STREAM))
            this.ZO.flush(); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void close() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial close : ()V
    //   4: invokestatic ZI : ()I
    //   7: aconst_null
    //   8: astore_2
    //   9: istore_1
    //   10: aload_0
    //   11: getfield ZY : [B
    //   14: ifnull -> 83
    //   17: aload_0
    //   18: getstatic com/fasterxml/Zb/Zi.AUTO_CLOSE_JSON_CONTENT : Lcom/fasterxml/Zb/Zi;
    //   21: invokevirtual Za : (Lcom/fasterxml/Zb/Zi;)Z
    //   24: ifeq -> 83
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: aload_0
    //   35: invokevirtual Zz : ()Lcom/fasterxml/Zb/Ze;
    //   38: astore_3
    //   39: aload_3
    //   40: invokevirtual Zo : ()Z
    //   43: ifeq -> 54
    //   46: aload_0
    //   47: invokevirtual ZI : ()V
    //   50: iload_1
    //   51: ifeq -> 79
    //   54: aload_3
    //   55: invokevirtual ZQ : ()Z
    //   58: ifeq -> 83
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   67: athrow
    //   68: aload_0
    //   69: invokevirtual Zh : ()V
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   78: athrow
    //   79: iload_1
    //   80: ifeq -> 34
    //   83: aload_0
    //   84: invokevirtual ZQ : ()V
    //   87: goto -> 93
    //   90: astore_3
    //   91: aload_3
    //   92: astore_2
    //   93: aload_0
    //   94: iconst_0
    //   95: putfield Zi : I
    //   98: aload_0
    //   99: getfield ZO : Ljava/io/OutputStream;
    //   102: ifnull -> 203
    //   105: aload_0
    //   106: getfield Zb : Lcom/fasterxml/Zv9;
    //   109: invokevirtual Z_ : ()Z
    //   112: ifne -> 132
    //   115: aload_0
    //   116: getstatic com/fasterxml/Zb/Zi.AUTO_CLOSE_TARGET : Lcom/fasterxml/Zb/Zi;
    //   119: invokevirtual Za : (Lcom/fasterxml/Zb/Zi;)Z
    //   122: ifeq -> 150
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   131: athrow
    //   132: aload_0
    //   133: getfield ZO : Ljava/io/OutputStream;
    //   136: invokevirtual close : ()V
    //   139: iload_1
    //   140: ifeq -> 181
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   149: athrow
    //   150: aload_0
    //   151: getstatic com/fasterxml/Zb/Zi.FLUSH_PASSED_TO_STREAM : Lcom/fasterxml/Zb/Zi;
    //   154: invokevirtual Za : (Lcom/fasterxml/Zb/Zi;)Z
    //   157: ifeq -> 181
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   166: athrow
    //   167: aload_0
    //   168: getfield ZO : Ljava/io/OutputStream;
    //   171: invokevirtual flush : ()V
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   180: athrow
    //   181: goto -> 203
    //   184: astore_3
    //   185: aload_2
    //   186: ifnull -> 201
    //   189: aload_3
    //   190: aload_2
    //   191: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   200: athrow
    //   201: aload_3
    //   202: athrow
    //   203: aload_0
    //   204: invokevirtual ZS : ()V
    //   207: aload_2
    //   208: ifnull -> 217
    //   211: aload_2
    //   212: athrow
    //   213: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   216: athrow
    //   217: return
    // Exception table:
    //   from	to	target	type
    //   10	27	30	java/io/IOException
    //   10	87	90	java/io/IOException
    //   46	61	64	java/io/IOException
    //   54	72	75	java/io/IOException
    //   105	125	128	java/io/IOException
    //   105	181	184	java/io/IOException
    //   105	181	184	java/lang/RuntimeException
    //   115	143	146	java/io/IOException
    //   132	160	163	java/io/IOException
    //   150	174	177	java/io/IOException
    //   185	194	197	java/io/IOException
    //   203	213	213	java/io/IOException
  }
  
  protected void ZS() {
    byte[] arrayOfByte = this.ZY;
    try {
      if (arrayOfByte != null)
        try {
          if (this.ZS) {
            this.ZY = null;
            this.Zb.Zs(arrayOfByte);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    char[] arrayOfChar = this.Zg;
    try {
      if (arrayOfChar != null) {
        this.Zg = null;
        this.Zb.Zf(arrayOfChar);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private final void Zk(byte[] paramArrayOfbyte) throws IOException {
    int i = paramArrayOfbyte.length;
    try {
      if (this.Zi + i > this.ZR)
        try {
          ZQ();
          if (i > 512) {
            this.ZO.write(paramArrayOfbyte, 0, i);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    System.arraycopy(paramArrayOfbyte, 0, this.ZY, this.Zi, i);
    this.Zi += i;
  }
  
  private final void ZH(String paramString, boolean paramBoolean) throws IOException {
    int i = Zf.ZH();
    try {
      if (paramBoolean) {
        try {
          if (this.Zi >= this.ZR)
            ZQ(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        this.ZY[this.Zi++] = this.Zd;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int j = paramString.length();
    int k = 0;
    while (j > 0) {
      int m = Math.min(this.ZX, j);
      try {
        if (this.Zi + m > this.ZR)
          ZQ(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      ZJ(paramString, k, m);
      k += m;
      j -= m;
      if (i == 0)
        break; 
    } 
    try {
      if (paramBoolean) {
        try {
          if (this.Zi >= this.ZR)
            ZQ(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        this.ZY[this.Zi++] = this.Zd;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private final void ZI(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    do {
      int i = Math.min(this.ZX, paramInt2);
      if (this.Zi + i > this.ZR)
        ZQ(); 
      Ze(paramArrayOfchar, paramInt1, i);
      paramInt1 += i;
      paramInt2 -= i;
    } while (paramInt2 > 0);
  }
  
  private final void ZF(String paramString, int paramInt1, int paramInt2) throws IOException {
    do {
      int i = Math.min(this.ZX, paramInt2);
      if (this.Zi + i > this.ZR)
        ZQ(); 
      ZJ(paramString, paramInt1, i);
      paramInt1 += i;
      paramInt2 -= i;
    } while (paramInt2 > 0);
  }
  
  private final void Ze(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: iload_3
    //   4: iload_2
    //   5: iadd
    //   6: istore_3
    //   7: istore #4
    //   9: aload_0
    //   10: getfield Zi : I
    //   13: istore #5
    //   15: aload_0
    //   16: getfield ZY : [B
    //   19: astore #6
    //   21: aload_0
    //   22: getfield Zp : [I
    //   25: astore #7
    //   27: iload_2
    //   28: iload_3
    //   29: if_icmpge -> 97
    //   32: aload_1
    //   33: iload_2
    //   34: caload
    //   35: istore #8
    //   37: iload #8
    //   39: bipush #127
    //   41: if_icmpgt -> 97
    //   44: aload #7
    //   46: iload #8
    //   48: iaload
    //   49: ifeq -> 71
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   58: athrow
    //   59: iload #4
    //   61: ifne -> 97
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   70: athrow
    //   71: aload #6
    //   73: iload #5
    //   75: iinc #5, 1
    //   78: iload #8
    //   80: i2b
    //   81: bastore
    //   82: iinc #2, 1
    //   85: iload #4
    //   87: ifne -> 27
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: aload_0
    //   98: iload #5
    //   100: putfield Zi : I
    //   103: iload_2
    //   104: iload_3
    //   105: if_icmpge -> 188
    //   108: aload_0
    //   109: getfield Zr : Lcom/fasterxml/Zyh;
    //   112: ifnull -> 141
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   121: athrow
    //   122: aload_0
    //   123: aload_1
    //   124: iload_2
    //   125: iload_3
    //   126: invokespecial Zq : ([CII)V
    //   129: iload #4
    //   131: ifne -> 188
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: aload_0
    //   142: getfield ZM : I
    //   145: ifne -> 174
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: aload_0
    //   156: aload_1
    //   157: iload_2
    //   158: iload_3
    //   159: invokespecial Zi : ([CII)V
    //   162: iload #4
    //   164: ifne -> 188
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   173: athrow
    //   174: aload_0
    //   175: aload_1
    //   176: iload_2
    //   177: iload_3
    //   178: invokespecial Zl : ([CII)V
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   187: athrow
    //   188: return
    // Exception table:
    //   from	to	target	type
    //   37	52	55	java/io/IOException
    //   44	64	67	java/io/IOException
    //   59	90	93	java/io/IOException
    //   97	115	118	java/io/IOException
    //   108	134	137	java/io/IOException
    //   122	148	151	java/io/IOException
    //   141	167	170	java/io/IOException
    //   155	181	184	java/io/IOException
  }
  
  private final void ZJ(String paramString, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: iload_3
    //   1: iload_2
    //   2: iadd
    //   3: istore_3
    //   4: aload_0
    //   5: getfield Zi : I
    //   8: istore #5
    //   10: invokestatic ZI : ()I
    //   13: aload_0
    //   14: getfield ZY : [B
    //   17: astore #6
    //   19: aload_0
    //   20: getfield Zp : [I
    //   23: astore #7
    //   25: istore #4
    //   27: iload_2
    //   28: iload_3
    //   29: if_icmpge -> 99
    //   32: aload_1
    //   33: iload_2
    //   34: invokevirtual charAt : (I)C
    //   37: istore #8
    //   39: iload #8
    //   41: bipush #127
    //   43: if_icmpgt -> 99
    //   46: aload #7
    //   48: iload #8
    //   50: iaload
    //   51: ifeq -> 73
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: iload #4
    //   63: ifeq -> 99
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   72: athrow
    //   73: aload #6
    //   75: iload #5
    //   77: iinc #5, 1
    //   80: iload #8
    //   82: i2b
    //   83: bastore
    //   84: iinc #2, 1
    //   87: iload #4
    //   89: ifeq -> 27
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: aload_0
    //   100: iload #5
    //   102: putfield Zi : I
    //   105: iload_2
    //   106: iload_3
    //   107: if_icmpge -> 190
    //   110: aload_0
    //   111: getfield Zr : Lcom/fasterxml/Zyh;
    //   114: ifnull -> 143
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   123: athrow
    //   124: aload_0
    //   125: aload_1
    //   126: iload_2
    //   127: iload_3
    //   128: invokespecial ZM : (Ljava/lang/String;II)V
    //   131: iload #4
    //   133: ifeq -> 190
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   142: athrow
    //   143: aload_0
    //   144: getfield ZM : I
    //   147: ifne -> 176
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   156: athrow
    //   157: aload_0
    //   158: aload_1
    //   159: iload_2
    //   160: iload_3
    //   161: invokespecial ZV : (Ljava/lang/String;II)V
    //   164: iload #4
    //   166: ifeq -> 190
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   175: athrow
    //   176: aload_0
    //   177: aload_1
    //   178: iload_2
    //   179: iload_3
    //   180: invokespecial Zj : (Ljava/lang/String;II)V
    //   183: goto -> 190
    //   186: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   189: athrow
    //   190: return
    // Exception table:
    //   from	to	target	type
    //   39	54	57	java/io/IOException
    //   46	66	69	java/io/IOException
    //   61	92	95	java/io/IOException
    //   99	117	120	java/io/IOException
    //   110	136	139	java/io/IOException
    //   124	150	153	java/io/IOException
    //   143	169	172	java/io/IOException
    //   157	183	186	java/io/IOException
  }
  
  private final void Zi(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: getfield Zi : I
    //   9: bipush #6
    //   11: iload_3
    //   12: iload_2
    //   13: isub
    //   14: imul
    //   15: iadd
    //   16: aload_0
    //   17: getfield ZR : I
    //   20: if_icmple -> 34
    //   23: aload_0
    //   24: invokevirtual ZQ : ()V
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: aload_0
    //   35: getfield Zi : I
    //   38: istore #5
    //   40: aload_0
    //   41: getfield ZY : [B
    //   44: astore #6
    //   46: aload_0
    //   47: getfield Zp : [I
    //   50: astore #7
    //   52: iload_2
    //   53: iload_3
    //   54: if_icmpge -> 241
    //   57: aload_1
    //   58: iload_2
    //   59: iinc #2, 1
    //   62: caload
    //   63: istore #8
    //   65: iload #8
    //   67: bipush #127
    //   69: if_icmpgt -> 170
    //   72: aload #7
    //   74: iload #8
    //   76: iaload
    //   77: ifne -> 110
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   86: athrow
    //   87: aload #6
    //   89: iload #5
    //   91: iinc #5, 1
    //   94: iload #8
    //   96: i2b
    //   97: bastore
    //   98: iload #4
    //   100: ifeq -> 52
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: aload #7
    //   112: iload #8
    //   114: iaload
    //   115: istore #9
    //   117: iload #9
    //   119: ifle -> 155
    //   122: aload #6
    //   124: iload #5
    //   126: iinc #5, 1
    //   129: bipush #92
    //   131: bastore
    //   132: aload #6
    //   134: iload #5
    //   136: iinc #5, 1
    //   139: iload #9
    //   141: i2b
    //   142: bastore
    //   143: iload #4
    //   145: ifeq -> 52
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: aload_0
    //   156: iload #8
    //   158: iload #5
    //   160: invokespecial ZP : (II)I
    //   163: istore #5
    //   165: iload #4
    //   167: ifeq -> 52
    //   170: iload #8
    //   172: sipush #2047
    //   175: if_icmpgt -> 226
    //   178: aload #6
    //   180: iload #5
    //   182: iinc #5, 1
    //   185: sipush #192
    //   188: iload #8
    //   190: bipush #6
    //   192: ishr
    //   193: ior
    //   194: i2b
    //   195: bastore
    //   196: aload #6
    //   198: iload #5
    //   200: iinc #5, 1
    //   203: sipush #128
    //   206: iload #8
    //   208: bipush #63
    //   210: iand
    //   211: ior
    //   212: i2b
    //   213: bastore
    //   214: iload #4
    //   216: ifeq -> 236
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   225: athrow
    //   226: aload_0
    //   227: iload #8
    //   229: iload #5
    //   231: invokespecial Zg : (II)I
    //   234: istore #5
    //   236: iload #4
    //   238: ifeq -> 52
    //   241: aload_0
    //   242: iload #5
    //   244: putfield Zi : I
    //   247: return
    // Exception table:
    //   from	to	target	type
    //   5	27	30	java/io/IOException
    //   65	80	83	java/io/IOException
    //   72	103	106	java/io/IOException
    //   117	148	151	java/io/IOException
    //   170	219	222	java/io/IOException
  }
  
  private final void ZV(String paramString, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: getfield Zi : I
    //   9: bipush #6
    //   11: iload_3
    //   12: iload_2
    //   13: isub
    //   14: imul
    //   15: iadd
    //   16: aload_0
    //   17: getfield ZR : I
    //   20: if_icmple -> 34
    //   23: aload_0
    //   24: invokevirtual ZQ : ()V
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: aload_0
    //   35: getfield Zi : I
    //   38: istore #5
    //   40: aload_0
    //   41: getfield ZY : [B
    //   44: astore #6
    //   46: aload_0
    //   47: getfield Zp : [I
    //   50: astore #7
    //   52: iload_2
    //   53: iload_3
    //   54: if_icmpge -> 243
    //   57: aload_1
    //   58: iload_2
    //   59: iinc #2, 1
    //   62: invokevirtual charAt : (I)C
    //   65: istore #8
    //   67: iload #8
    //   69: bipush #127
    //   71: if_icmpgt -> 172
    //   74: aload #7
    //   76: iload #8
    //   78: iaload
    //   79: ifne -> 112
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: aload #6
    //   91: iload #5
    //   93: iinc #5, 1
    //   96: iload #8
    //   98: i2b
    //   99: bastore
    //   100: iload #4
    //   102: ifne -> 52
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   111: athrow
    //   112: aload #7
    //   114: iload #8
    //   116: iaload
    //   117: istore #9
    //   119: iload #9
    //   121: ifle -> 157
    //   124: aload #6
    //   126: iload #5
    //   128: iinc #5, 1
    //   131: bipush #92
    //   133: bastore
    //   134: aload #6
    //   136: iload #5
    //   138: iinc #5, 1
    //   141: iload #9
    //   143: i2b
    //   144: bastore
    //   145: iload #4
    //   147: ifne -> 52
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   156: athrow
    //   157: aload_0
    //   158: iload #8
    //   160: iload #5
    //   162: invokespecial ZP : (II)I
    //   165: istore #5
    //   167: iload #4
    //   169: ifne -> 52
    //   172: iload #8
    //   174: sipush #2047
    //   177: if_icmpgt -> 228
    //   180: aload #6
    //   182: iload #5
    //   184: iinc #5, 1
    //   187: sipush #192
    //   190: iload #8
    //   192: bipush #6
    //   194: ishr
    //   195: ior
    //   196: i2b
    //   197: bastore
    //   198: aload #6
    //   200: iload #5
    //   202: iinc #5, 1
    //   205: sipush #128
    //   208: iload #8
    //   210: bipush #63
    //   212: iand
    //   213: ior
    //   214: i2b
    //   215: bastore
    //   216: iload #4
    //   218: ifne -> 238
    //   221: goto -> 228
    //   224: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   227: athrow
    //   228: aload_0
    //   229: iload #8
    //   231: iload #5
    //   233: invokespecial Zg : (II)I
    //   236: istore #5
    //   238: iload #4
    //   240: ifne -> 52
    //   243: aload_0
    //   244: iload #5
    //   246: putfield Zi : I
    //   249: return
    // Exception table:
    //   from	to	target	type
    //   5	27	30	java/io/IOException
    //   67	82	85	java/io/IOException
    //   74	105	108	java/io/IOException
    //   119	150	153	java/io/IOException
    //   172	221	224	java/io/IOException
  }
  
  private final void Zl(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: getfield Zi : I
    //   9: bipush #6
    //   11: iload_3
    //   12: iload_2
    //   13: isub
    //   14: imul
    //   15: iadd
    //   16: aload_0
    //   17: getfield ZR : I
    //   20: if_icmple -> 34
    //   23: aload_0
    //   24: invokevirtual ZQ : ()V
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: aload_0
    //   35: getfield Zi : I
    //   38: istore #5
    //   40: aload_0
    //   41: getfield ZY : [B
    //   44: astore #6
    //   46: aload_0
    //   47: getfield Zp : [I
    //   50: astore #7
    //   52: aload_0
    //   53: getfield ZM : I
    //   56: istore #8
    //   58: iload_2
    //   59: iload_3
    //   60: if_icmpge -> 269
    //   63: aload_1
    //   64: iload_2
    //   65: iinc #2, 1
    //   68: caload
    //   69: istore #9
    //   71: iload #9
    //   73: bipush #127
    //   75: if_icmpgt -> 176
    //   78: aload #7
    //   80: iload #9
    //   82: iaload
    //   83: ifne -> 116
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: aload #6
    //   95: iload #5
    //   97: iinc #5, 1
    //   100: iload #9
    //   102: i2b
    //   103: bastore
    //   104: iload #4
    //   106: ifeq -> 58
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   115: athrow
    //   116: aload #7
    //   118: iload #9
    //   120: iaload
    //   121: istore #10
    //   123: iload #10
    //   125: ifle -> 161
    //   128: aload #6
    //   130: iload #5
    //   132: iinc #5, 1
    //   135: bipush #92
    //   137: bastore
    //   138: aload #6
    //   140: iload #5
    //   142: iinc #5, 1
    //   145: iload #10
    //   147: i2b
    //   148: bastore
    //   149: iload #4
    //   151: ifeq -> 58
    //   154: goto -> 161
    //   157: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   160: athrow
    //   161: aload_0
    //   162: iload #9
    //   164: iload #5
    //   166: invokespecial ZP : (II)I
    //   169: istore #5
    //   171: iload #4
    //   173: ifeq -> 58
    //   176: iload #9
    //   178: iload #8
    //   180: if_icmple -> 198
    //   183: aload_0
    //   184: iload #9
    //   186: iload #5
    //   188: invokespecial ZP : (II)I
    //   191: istore #5
    //   193: iload #4
    //   195: ifeq -> 58
    //   198: iload #9
    //   200: sipush #2047
    //   203: if_icmpgt -> 254
    //   206: aload #6
    //   208: iload #5
    //   210: iinc #5, 1
    //   213: sipush #192
    //   216: iload #9
    //   218: bipush #6
    //   220: ishr
    //   221: ior
    //   222: i2b
    //   223: bastore
    //   224: aload #6
    //   226: iload #5
    //   228: iinc #5, 1
    //   231: sipush #128
    //   234: iload #9
    //   236: bipush #63
    //   238: iand
    //   239: ior
    //   240: i2b
    //   241: bastore
    //   242: iload #4
    //   244: ifeq -> 264
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   253: athrow
    //   254: aload_0
    //   255: iload #9
    //   257: iload #5
    //   259: invokespecial Zg : (II)I
    //   262: istore #5
    //   264: iload #4
    //   266: ifeq -> 58
    //   269: aload_0
    //   270: iload #5
    //   272: putfield Zi : I
    //   275: return
    // Exception table:
    //   from	to	target	type
    //   5	27	30	java/io/IOException
    //   71	86	89	java/io/IOException
    //   78	109	112	java/io/IOException
    //   123	154	157	java/io/IOException
    //   198	247	250	java/io/IOException
  }
  
  private final void Zj(String paramString, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: getfield Zi : I
    //   9: bipush #6
    //   11: iload_3
    //   12: iload_2
    //   13: isub
    //   14: imul
    //   15: iadd
    //   16: aload_0
    //   17: getfield ZR : I
    //   20: if_icmple -> 34
    //   23: aload_0
    //   24: invokevirtual ZQ : ()V
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: aload_0
    //   35: getfield Zi : I
    //   38: istore #5
    //   40: aload_0
    //   41: getfield ZY : [B
    //   44: astore #6
    //   46: aload_0
    //   47: getfield Zp : [I
    //   50: astore #7
    //   52: aload_0
    //   53: getfield ZM : I
    //   56: istore #8
    //   58: iload_2
    //   59: iload_3
    //   60: if_icmpge -> 271
    //   63: aload_1
    //   64: iload_2
    //   65: iinc #2, 1
    //   68: invokevirtual charAt : (I)C
    //   71: istore #9
    //   73: iload #9
    //   75: bipush #127
    //   77: if_icmpgt -> 178
    //   80: aload #7
    //   82: iload #9
    //   84: iaload
    //   85: ifne -> 118
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   94: athrow
    //   95: aload #6
    //   97: iload #5
    //   99: iinc #5, 1
    //   102: iload #9
    //   104: i2b
    //   105: bastore
    //   106: iload #4
    //   108: ifne -> 58
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: aload #7
    //   120: iload #9
    //   122: iaload
    //   123: istore #10
    //   125: iload #10
    //   127: ifle -> 163
    //   130: aload #6
    //   132: iload #5
    //   134: iinc #5, 1
    //   137: bipush #92
    //   139: bastore
    //   140: aload #6
    //   142: iload #5
    //   144: iinc #5, 1
    //   147: iload #10
    //   149: i2b
    //   150: bastore
    //   151: iload #4
    //   153: ifne -> 58
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   162: athrow
    //   163: aload_0
    //   164: iload #9
    //   166: iload #5
    //   168: invokespecial ZP : (II)I
    //   171: istore #5
    //   173: iload #4
    //   175: ifne -> 58
    //   178: iload #9
    //   180: iload #8
    //   182: if_icmple -> 200
    //   185: aload_0
    //   186: iload #9
    //   188: iload #5
    //   190: invokespecial ZP : (II)I
    //   193: istore #5
    //   195: iload #4
    //   197: ifne -> 58
    //   200: iload #9
    //   202: sipush #2047
    //   205: if_icmpgt -> 256
    //   208: aload #6
    //   210: iload #5
    //   212: iinc #5, 1
    //   215: sipush #192
    //   218: iload #9
    //   220: bipush #6
    //   222: ishr
    //   223: ior
    //   224: i2b
    //   225: bastore
    //   226: aload #6
    //   228: iload #5
    //   230: iinc #5, 1
    //   233: sipush #128
    //   236: iload #9
    //   238: bipush #63
    //   240: iand
    //   241: ior
    //   242: i2b
    //   243: bastore
    //   244: iload #4
    //   246: ifne -> 266
    //   249: goto -> 256
    //   252: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   255: athrow
    //   256: aload_0
    //   257: iload #9
    //   259: iload #5
    //   261: invokespecial Zg : (II)I
    //   264: istore #5
    //   266: iload #4
    //   268: ifne -> 58
    //   271: aload_0
    //   272: iload #5
    //   274: putfield Zi : I
    //   277: return
    // Exception table:
    //   from	to	target	type
    //   5	27	30	java/io/IOException
    //   73	88	91	java/io/IOException
    //   80	111	114	java/io/IOException
    //   125	156	159	java/io/IOException
    //   200	249	252	java/io/IOException
  }
  
  private final void Zq(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: getfield Zi : I
    //   9: bipush #6
    //   11: iload_3
    //   12: iload_2
    //   13: isub
    //   14: imul
    //   15: iadd
    //   16: aload_0
    //   17: getfield ZR : I
    //   20: if_icmple -> 34
    //   23: aload_0
    //   24: invokevirtual ZQ : ()V
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: aload_0
    //   35: getfield Zi : I
    //   38: istore #5
    //   40: aload_0
    //   41: getfield ZY : [B
    //   44: astore #6
    //   46: aload_0
    //   47: getfield Zp : [I
    //   50: astore #7
    //   52: aload_0
    //   53: getfield ZM : I
    //   56: ifgt -> 68
    //   59: ldc 65535
    //   61: goto -> 72
    //   64: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   67: athrow
    //   68: aload_0
    //   69: getfield ZM : I
    //   72: istore #8
    //   74: aload_0
    //   75: getfield Zr : Lcom/fasterxml/Zyh;
    //   78: astore #9
    //   80: iload_2
    //   81: iload_3
    //   82: if_icmpge -> 419
    //   85: aload_1
    //   86: iload_2
    //   87: iinc #2, 1
    //   90: caload
    //   91: istore #10
    //   93: iload #10
    //   95: bipush #127
    //   97: if_icmpgt -> 292
    //   100: aload #7
    //   102: iload #10
    //   104: iaload
    //   105: ifne -> 138
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: aload #6
    //   117: iload #5
    //   119: iinc #5, 1
    //   122: iload #10
    //   124: i2b
    //   125: bastore
    //   126: iload #4
    //   128: ifeq -> 80
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: aload #7
    //   140: iload #10
    //   142: iaload
    //   143: istore #11
    //   145: iload #11
    //   147: ifle -> 183
    //   150: aload #6
    //   152: iload #5
    //   154: iinc #5, 1
    //   157: bipush #92
    //   159: bastore
    //   160: aload #6
    //   162: iload #5
    //   164: iinc #5, 1
    //   167: iload #11
    //   169: i2b
    //   170: bastore
    //   171: iload #4
    //   173: ifeq -> 80
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   182: athrow
    //   183: iload #11
    //   185: bipush #-2
    //   187: if_icmpne -> 277
    //   190: aload #9
    //   192: iload #10
    //   194: invokevirtual Zs : (I)Lcom/fasterxml/Zb/Zj;
    //   197: astore #12
    //   199: aload #12
    //   201: ifnonnull -> 257
    //   204: aload_0
    //   205: new java/lang/StringBuilder
    //   208: dup
    //   209: invokespecial <init> : ()V
    //   212: sipush #-637
    //   215: sipush #4220
    //   218: invokestatic c : (II)Ljava/lang/String;
    //   221: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: iload #10
    //   226: invokestatic toHexString : (I)Ljava/lang/String;
    //   229: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: sipush #-625
    //   235: sipush #-19951
    //   238: invokestatic c : (II)Ljava/lang/String;
    //   241: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: invokevirtual toString : ()Ljava/lang/String;
    //   247: invokevirtual Zr : (Ljava/lang/String;)V
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   256: athrow
    //   257: aload_0
    //   258: aload #6
    //   260: iload #5
    //   262: aload #12
    //   264: iload_3
    //   265: iload_2
    //   266: isub
    //   267: invokespecial ZV : ([BILcom/fasterxml/Zb/Zj;I)I
    //   270: istore #5
    //   272: iload #4
    //   274: ifeq -> 80
    //   277: aload_0
    //   278: iload #10
    //   280: iload #5
    //   282: invokespecial ZP : (II)I
    //   285: istore #5
    //   287: iload #4
    //   289: ifeq -> 80
    //   292: iload #10
    //   294: iload #8
    //   296: if_icmple -> 314
    //   299: aload_0
    //   300: iload #10
    //   302: iload #5
    //   304: invokespecial ZP : (II)I
    //   307: istore #5
    //   309: iload #4
    //   311: ifeq -> 80
    //   314: aload #9
    //   316: iload #10
    //   318: invokevirtual Zs : (I)Lcom/fasterxml/Zb/Zj;
    //   321: astore #11
    //   323: aload #11
    //   325: ifnull -> 348
    //   328: aload_0
    //   329: aload #6
    //   331: iload #5
    //   333: aload #11
    //   335: iload_3
    //   336: iload_2
    //   337: isub
    //   338: invokespecial ZV : ([BILcom/fasterxml/Zb/Zj;I)I
    //   341: istore #5
    //   343: iload #4
    //   345: ifeq -> 80
    //   348: iload #10
    //   350: sipush #2047
    //   353: if_icmpgt -> 404
    //   356: aload #6
    //   358: iload #5
    //   360: iinc #5, 1
    //   363: sipush #192
    //   366: iload #10
    //   368: bipush #6
    //   370: ishr
    //   371: ior
    //   372: i2b
    //   373: bastore
    //   374: aload #6
    //   376: iload #5
    //   378: iinc #5, 1
    //   381: sipush #128
    //   384: iload #10
    //   386: bipush #63
    //   388: iand
    //   389: ior
    //   390: i2b
    //   391: bastore
    //   392: iload #4
    //   394: ifeq -> 414
    //   397: goto -> 404
    //   400: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   403: athrow
    //   404: aload_0
    //   405: iload #10
    //   407: iload #5
    //   409: invokespecial Zg : (II)I
    //   412: istore #5
    //   414: iload #4
    //   416: ifeq -> 80
    //   419: aload_0
    //   420: iload #5
    //   422: putfield Zi : I
    //   425: return
    // Exception table:
    //   from	to	target	type
    //   5	27	30	java/io/IOException
    //   52	64	64	java/io/IOException
    //   93	108	111	java/io/IOException
    //   100	131	134	java/io/IOException
    //   145	176	179	java/io/IOException
    //   199	250	253	java/io/IOException
    //   348	397	400	java/io/IOException
  }
  
  private final void ZM(String paramString, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: getfield Zi : I
    //   9: bipush #6
    //   11: iload_3
    //   12: iload_2
    //   13: isub
    //   14: imul
    //   15: iadd
    //   16: aload_0
    //   17: getfield ZR : I
    //   20: if_icmple -> 34
    //   23: aload_0
    //   24: invokevirtual ZQ : ()V
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: aload_0
    //   35: getfield Zi : I
    //   38: istore #5
    //   40: aload_0
    //   41: getfield ZY : [B
    //   44: astore #6
    //   46: aload_0
    //   47: getfield Zp : [I
    //   50: astore #7
    //   52: aload_0
    //   53: getfield ZM : I
    //   56: ifgt -> 68
    //   59: ldc 65535
    //   61: goto -> 72
    //   64: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   67: athrow
    //   68: aload_0
    //   69: getfield ZM : I
    //   72: istore #8
    //   74: aload_0
    //   75: getfield Zr : Lcom/fasterxml/Zyh;
    //   78: astore #9
    //   80: iload_2
    //   81: iload_3
    //   82: if_icmpge -> 420
    //   85: aload_1
    //   86: iload_2
    //   87: iinc #2, 1
    //   90: invokevirtual charAt : (I)C
    //   93: istore #10
    //   95: iload #10
    //   97: bipush #127
    //   99: if_icmpgt -> 293
    //   102: aload #7
    //   104: iload #10
    //   106: iaload
    //   107: ifne -> 140
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   116: athrow
    //   117: aload #6
    //   119: iload #5
    //   121: iinc #5, 1
    //   124: iload #10
    //   126: i2b
    //   127: bastore
    //   128: iload #4
    //   130: ifne -> 80
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: aload #7
    //   142: iload #10
    //   144: iaload
    //   145: istore #11
    //   147: iload #11
    //   149: ifle -> 185
    //   152: aload #6
    //   154: iload #5
    //   156: iinc #5, 1
    //   159: bipush #92
    //   161: bastore
    //   162: aload #6
    //   164: iload #5
    //   166: iinc #5, 1
    //   169: iload #11
    //   171: i2b
    //   172: bastore
    //   173: iload #4
    //   175: ifne -> 80
    //   178: goto -> 185
    //   181: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   184: athrow
    //   185: iload #11
    //   187: bipush #-2
    //   189: if_icmpne -> 278
    //   192: aload #9
    //   194: iload #10
    //   196: invokevirtual Zs : (I)Lcom/fasterxml/Zb/Zj;
    //   199: astore #12
    //   201: aload #12
    //   203: ifnonnull -> 258
    //   206: aload_0
    //   207: new java/lang/StringBuilder
    //   210: dup
    //   211: invokespecial <init> : ()V
    //   214: sipush #-628
    //   217: sipush #11024
    //   220: invokestatic c : (II)Ljava/lang/String;
    //   223: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: iload #10
    //   228: invokestatic toHexString : (I)Ljava/lang/String;
    //   231: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: sipush #-611
    //   237: bipush #-60
    //   239: invokestatic c : (II)Ljava/lang/String;
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: invokevirtual toString : ()Ljava/lang/String;
    //   248: invokevirtual Zr : (Ljava/lang/String;)V
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   257: athrow
    //   258: aload_0
    //   259: aload #6
    //   261: iload #5
    //   263: aload #12
    //   265: iload_3
    //   266: iload_2
    //   267: isub
    //   268: invokespecial ZV : ([BILcom/fasterxml/Zb/Zj;I)I
    //   271: istore #5
    //   273: iload #4
    //   275: ifne -> 80
    //   278: aload_0
    //   279: iload #10
    //   281: iload #5
    //   283: invokespecial ZP : (II)I
    //   286: istore #5
    //   288: iload #4
    //   290: ifne -> 80
    //   293: iload #10
    //   295: iload #8
    //   297: if_icmple -> 315
    //   300: aload_0
    //   301: iload #10
    //   303: iload #5
    //   305: invokespecial ZP : (II)I
    //   308: istore #5
    //   310: iload #4
    //   312: ifne -> 80
    //   315: aload #9
    //   317: iload #10
    //   319: invokevirtual Zs : (I)Lcom/fasterxml/Zb/Zj;
    //   322: astore #11
    //   324: aload #11
    //   326: ifnull -> 349
    //   329: aload_0
    //   330: aload #6
    //   332: iload #5
    //   334: aload #11
    //   336: iload_3
    //   337: iload_2
    //   338: isub
    //   339: invokespecial ZV : ([BILcom/fasterxml/Zb/Zj;I)I
    //   342: istore #5
    //   344: iload #4
    //   346: ifne -> 80
    //   349: iload #10
    //   351: sipush #2047
    //   354: if_icmpgt -> 405
    //   357: aload #6
    //   359: iload #5
    //   361: iinc #5, 1
    //   364: sipush #192
    //   367: iload #10
    //   369: bipush #6
    //   371: ishr
    //   372: ior
    //   373: i2b
    //   374: bastore
    //   375: aload #6
    //   377: iload #5
    //   379: iinc #5, 1
    //   382: sipush #128
    //   385: iload #10
    //   387: bipush #63
    //   389: iand
    //   390: ior
    //   391: i2b
    //   392: bastore
    //   393: iload #4
    //   395: ifne -> 415
    //   398: goto -> 405
    //   401: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   404: athrow
    //   405: aload_0
    //   406: iload #10
    //   408: iload #5
    //   410: invokespecial Zg : (II)I
    //   413: istore #5
    //   415: iload #4
    //   417: ifne -> 80
    //   420: aload_0
    //   421: iload #5
    //   423: putfield Zi : I
    //   426: return
    // Exception table:
    //   from	to	target	type
    //   5	27	30	java/io/IOException
    //   52	64	64	java/io/IOException
    //   95	110	113	java/io/IOException
    //   102	133	136	java/io/IOException
    //   147	178	181	java/io/IOException
    //   201	251	254	java/io/IOException
    //   349	398	401	java/io/IOException
  }
  
  private final int ZV(byte[] paramArrayOfbyte, int paramInt1, Zj paramZj, int paramInt2) throws IOException, Zm1 {
    byte[] arrayOfByte = paramZj.Zv();
    int i = arrayOfByte.length;
    try {
      if (i > 6)
        return Zz(paramArrayOfbyte, paramInt1, this.ZR, arrayOfByte, paramInt2); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, paramInt1, i);
    return paramInt1 + i;
  }
  
  private final int Zz(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws IOException, Zm1 {
    int i = paramArrayOfbyte2.length;
    if (paramInt1 + i > paramInt2) {
      this.Zi = paramInt1;
      ZQ();
      paramInt1 = this.Zi;
      try {
        if (i > paramArrayOfbyte1.length) {
          this.ZO.write(paramArrayOfbyte2, 0, i);
          return paramInt1;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    System.arraycopy(paramArrayOfbyte2, 0, paramArrayOfbyte1, paramInt1, i);
    paramInt1 += i;
    try {
      if (paramInt1 + 6 * paramInt3 > paramInt2) {
        this.Zi = paramInt1;
        ZQ();
        return this.Zi;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramInt1;
  }
  
  protected final void Zu(com.fasterxml.Zb.Zy paramZy, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException, Zm1 {
    int j = paramInt2 - 3;
    int k = this.ZR - 6;
    int m = paramZy.ZZ() >> 2;
    int i = Zf.ZI();
    while (paramInt1 <= j) {
      try {
        if (this.Zi > k)
          ZQ(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      int i1 = paramArrayOfbyte[paramInt1++] << 8;
      i1 |= paramArrayOfbyte[paramInt1++] & 0xFF;
      i1 = i1 << 8 | paramArrayOfbyte[paramInt1++] & 0xFF;
      this.Zi = paramZy.ZS(i1, this.ZY, this.Zi);
      if (--m <= 0) {
        this.ZY[this.Zi++] = 92;
        this.ZY[this.Zi++] = 110;
        m = paramZy.ZZ() >> 2;
      } 
      if (i != 0)
        break; 
    } 
    int n = paramInt2 - paramInt1;
    try {
      if (n > 0) {
        try {
          if (this.Zi > k)
            ZQ(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        int i1 = paramArrayOfbyte[paramInt1++] << 16;
        if (n == 2)
          i1 |= (paramArrayOfbyte[paramInt1++] & 0xFF) << 8; 
        this.Zi = paramZy.Zs(i1, n, this.ZY, this.Zi);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  protected final int Zi(com.fasterxml.Zb.Zy paramZy, InputStream paramInputStream, byte[] paramArrayOfbyte, int paramInt) throws IOException, Zm1 {
    // Byte code:
    //   0: iconst_0
    //   1: istore #6
    //   3: invokestatic ZI : ()I
    //   6: iconst_0
    //   7: istore #7
    //   9: bipush #-3
    //   11: istore #8
    //   13: aload_0
    //   14: getfield ZR : I
    //   17: bipush #6
    //   19: isub
    //   20: istore #9
    //   22: aload_1
    //   23: invokevirtual ZZ : ()I
    //   26: iconst_2
    //   27: ishr
    //   28: istore #10
    //   30: istore #5
    //   32: iload #4
    //   34: iconst_2
    //   35: if_icmple -> 231
    //   38: iload #6
    //   40: iload #8
    //   42: if_icmple -> 86
    //   45: aload_0
    //   46: aload_2
    //   47: aload_3
    //   48: iload #6
    //   50: iload #7
    //   52: iload #4
    //   54: invokespecial ZV : (Ljava/io/InputStream;[BIII)I
    //   57: istore #7
    //   59: iconst_0
    //   60: istore #6
    //   62: iload #7
    //   64: iconst_3
    //   65: if_icmpge -> 80
    //   68: iload #5
    //   70: ifeq -> 231
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: iload #7
    //   82: iconst_3
    //   83: isub
    //   84: istore #8
    //   86: aload_0
    //   87: getfield Zi : I
    //   90: iload #9
    //   92: if_icmple -> 106
    //   95: aload_0
    //   96: invokevirtual ZQ : ()V
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   105: athrow
    //   106: aload_3
    //   107: iload #6
    //   109: iinc #6, 1
    //   112: baload
    //   113: bipush #8
    //   115: ishl
    //   116: istore #11
    //   118: iload #11
    //   120: aload_3
    //   121: iload #6
    //   123: iinc #6, 1
    //   126: baload
    //   127: sipush #255
    //   130: iand
    //   131: ior
    //   132: istore #11
    //   134: iload #11
    //   136: bipush #8
    //   138: ishl
    //   139: aload_3
    //   140: iload #6
    //   142: iinc #6, 1
    //   145: baload
    //   146: sipush #255
    //   149: iand
    //   150: ior
    //   151: istore #11
    //   153: iinc #4, -3
    //   156: aload_0
    //   157: aload_1
    //   158: iload #11
    //   160: aload_0
    //   161: getfield ZY : [B
    //   164: aload_0
    //   165: getfield Zi : I
    //   168: invokevirtual ZS : (I[BI)I
    //   171: putfield Zi : I
    //   174: iinc #10, -1
    //   177: iload #10
    //   179: ifgt -> 226
    //   182: aload_0
    //   183: getfield ZY : [B
    //   186: aload_0
    //   187: dup
    //   188: getfield Zi : I
    //   191: dup_x1
    //   192: iconst_1
    //   193: iadd
    //   194: putfield Zi : I
    //   197: bipush #92
    //   199: bastore
    //   200: aload_0
    //   201: getfield ZY : [B
    //   204: aload_0
    //   205: dup
    //   206: getfield Zi : I
    //   209: dup_x1
    //   210: iconst_1
    //   211: iadd
    //   212: putfield Zi : I
    //   215: bipush #110
    //   217: bastore
    //   218: aload_1
    //   219: invokevirtual ZZ : ()I
    //   222: iconst_2
    //   223: ishr
    //   224: istore #10
    //   226: iload #5
    //   228: ifeq -> 32
    //   231: iload #4
    //   233: ifle -> 358
    //   236: aload_0
    //   237: aload_2
    //   238: aload_3
    //   239: iload #6
    //   241: iload #7
    //   243: iload #4
    //   245: invokespecial ZV : (Ljava/io/InputStream;[BIII)I
    //   248: istore #7
    //   250: iconst_0
    //   251: istore #6
    //   253: iload #7
    //   255: ifle -> 358
    //   258: aload_0
    //   259: getfield Zi : I
    //   262: iload #9
    //   264: if_icmple -> 285
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   273: athrow
    //   274: aload_0
    //   275: invokevirtual ZQ : ()V
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   284: athrow
    //   285: aload_3
    //   286: iload #6
    //   288: iinc #6, 1
    //   291: baload
    //   292: bipush #16
    //   294: ishl
    //   295: istore #11
    //   297: iload #6
    //   299: iload #7
    //   301: if_icmpge -> 328
    //   304: iload #11
    //   306: aload_3
    //   307: iload #6
    //   309: baload
    //   310: sipush #255
    //   313: iand
    //   314: bipush #8
    //   316: ishl
    //   317: ior
    //   318: istore #11
    //   320: iconst_2
    //   321: istore #12
    //   323: iload #5
    //   325: ifeq -> 331
    //   328: iconst_1
    //   329: istore #12
    //   331: aload_0
    //   332: aload_1
    //   333: iload #11
    //   335: iload #12
    //   337: aload_0
    //   338: getfield ZY : [B
    //   341: aload_0
    //   342: getfield Zi : I
    //   345: invokevirtual Zs : (II[BI)I
    //   348: putfield Zi : I
    //   351: iload #4
    //   353: iload #12
    //   355: isub
    //   356: istore #4
    //   358: iload #4
    //   360: ireturn
    // Exception table:
    //   from	to	target	type
    //   62	73	76	java/io/IOException
    //   86	99	102	java/io/IOException
    //   253	267	270	java/io/IOException
    //   258	278	281	java/io/IOException
  }
  
  protected final int Zc(com.fasterxml.Zb.Zy paramZy, InputStream paramInputStream, byte[] paramArrayOfbyte) throws IOException, Zm1 {
    byte b = 0;
    int j = 0;
    int k = -3;
    int m = 0;
    int n = this.ZR - 6;
    int i1 = paramZy.ZZ() >> 2;
    int i = Zf.ZH();
    do {
      if (b > k) {
        j = ZV(paramInputStream, paramArrayOfbyte, b, j, paramArrayOfbyte.length);
        b = 0;
        try {
          if (j >= 3 || i == 0) {
            k = j - 3;
          } else {
            break;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
      try {
        if (this.Zi > n)
          ZQ(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      int i2 = paramArrayOfbyte[b++] << 8;
      i2 |= paramArrayOfbyte[b++] & 0xFF;
      i2 = i2 << 8 | paramArrayOfbyte[b++] & 0xFF;
      m += true;
      this.Zi = paramZy.ZS(i2, this.ZY, this.Zi);
      if (--i1 > 0)
        continue; 
      this.ZY[this.Zi++] = 92;
      this.ZY[this.Zi++] = 110;
      i1 = paramZy.ZZ() >> 2;
    } while (i != 0);
    try {
      if (b < j) {
        try {
          if (this.Zi > n)
            ZQ(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        int i2 = paramArrayOfbyte[b++] << 16;
        byte b1 = 1;
        if (b < j) {
          i2 |= (paramArrayOfbyte[b] & 0xFF) << 8;
          b1 = 2;
        } 
        m += b1;
        this.Zi = paramZy.Zs(i2, b1, this.ZY, this.Zi);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return m;
  }
  
  private final int ZV(InputStream paramInputStream, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) throws IOException {
    byte b = 0;
    int i = Zf.ZI();
    while (paramInt1 < paramInt2) {
      paramArrayOfbyte[b++] = paramArrayOfbyte[paramInt1++];
      if (i != 0)
        break; 
    } 
    paramInt1 = 0;
    paramInt2 = b;
    paramInt3 = Math.min(paramInt3, paramArrayOfbyte.length);
    while (true) {
      int j = paramInt3 - paramInt2;
      if (j != 0 || i != 0) {
        int k = paramInputStream.read(paramArrayOfbyte, paramInt2, j);
        try {
          if (k < 0)
            return paramInt2; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        paramInt2 += k;
        if (paramInt2 >= 3)
          break; 
        continue;
      } 
      break;
    } 
    return paramInt2;
  }
  
  private final int Zh(int paramInt1, char[] paramArrayOfchar, int paramInt2, int paramInt3) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore #5
    //   5: iload_1
    //   6: ldc 55296
    //   8: if_icmplt -> 106
    //   11: iload_1
    //   12: ldc 57343
    //   14: if_icmpgt -> 106
    //   17: goto -> 24
    //   20: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   23: athrow
    //   24: iload_3
    //   25: iload #4
    //   27: if_icmpge -> 48
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: aload_2
    //   38: ifnonnull -> 87
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   47: athrow
    //   48: aload_0
    //   49: sipush #-630
    //   52: sipush #17712
    //   55: invokestatic c : (II)Ljava/lang/String;
    //   58: iconst_1
    //   59: anewarray java/lang/Object
    //   62: dup
    //   63: iconst_0
    //   64: iload_1
    //   65: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   68: aastore
    //   69: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   72: invokevirtual Zr : (Ljava/lang/String;)V
    //   75: iload #5
    //   77: ifeq -> 102
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   86: athrow
    //   87: aload_0
    //   88: iload_1
    //   89: aload_2
    //   90: iload_3
    //   91: caload
    //   92: invokevirtual Zz : (II)V
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: iload_3
    //   103: iconst_1
    //   104: iadd
    //   105: ireturn
    //   106: aload_0
    //   107: getfield ZY : [B
    //   110: astore #6
    //   112: aload #6
    //   114: aload_0
    //   115: dup
    //   116: getfield Zi : I
    //   119: dup_x1
    //   120: iconst_1
    //   121: iadd
    //   122: putfield Zi : I
    //   125: sipush #224
    //   128: iload_1
    //   129: bipush #12
    //   131: ishr
    //   132: ior
    //   133: i2b
    //   134: bastore
    //   135: aload #6
    //   137: aload_0
    //   138: dup
    //   139: getfield Zi : I
    //   142: dup_x1
    //   143: iconst_1
    //   144: iadd
    //   145: putfield Zi : I
    //   148: sipush #128
    //   151: iload_1
    //   152: bipush #6
    //   154: ishr
    //   155: bipush #63
    //   157: iand
    //   158: ior
    //   159: i2b
    //   160: bastore
    //   161: aload #6
    //   163: aload_0
    //   164: dup
    //   165: getfield Zi : I
    //   168: dup_x1
    //   169: iconst_1
    //   170: iadd
    //   171: putfield Zi : I
    //   174: sipush #128
    //   177: iload_1
    //   178: bipush #63
    //   180: iand
    //   181: ior
    //   182: i2b
    //   183: bastore
    //   184: iload_3
    //   185: ireturn
    // Exception table:
    //   from	to	target	type
    //   5	17	20	java/io/IOException
    //   11	30	33	java/io/IOException
    //   24	41	44	java/io/IOException
    //   37	80	83	java/io/IOException
    //   48	95	98	java/io/IOException
  }
  
  protected final void Zz(int paramInt1, int paramInt2) throws IOException {
    int j = Zh(paramInt1, paramInt2);
    int i = Zf.ZH();
    try {
      if (this.Zi + 4 > this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte[] arrayOfByte = this.ZY;
    try {
      arrayOfByte[this.Zi++] = (byte)(0xF0 | j >> 18);
      arrayOfByte[this.Zi++] = (byte)(0x80 | j >> 12 & 0x3F);
      arrayOfByte[this.Zi++] = (byte)(0x80 | j >> 6 & 0x3F);
      arrayOfByte[this.Zi++] = (byte)(0x80 | j & 0x3F);
      if (i == 0)
        Zbqc.Zr(new Zbqc[1]); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private final int Zg(int paramInt1, int paramInt2) throws IOException {
    byte[] arrayOfByte1 = Zi();
    byte[] arrayOfByte2 = this.ZY;
    int i = Zf.ZI();
    try {
      if (paramInt1 >= 55296)
        try {
          if (paramInt1 <= 57343) {
            try {
              arrayOfByte2[paramInt2++] = 92;
              arrayOfByte2[paramInt2++] = 117;
              arrayOfByte2[paramInt2++] = arrayOfByte1[paramInt1 >> 12 & 0xF];
              arrayOfByte2[paramInt2++] = arrayOfByte1[paramInt1 >> 8 & 0xF];
              arrayOfByte2[paramInt2++] = arrayOfByte1[paramInt1 >> 4 & 0xF];
              arrayOfByte2[paramInt2++] = arrayOfByte1[paramInt1 & 0xF];
              if (i != 0) {
                arrayOfByte2[paramInt2++] = (byte)(0xE0 | paramInt1 >> 12);
                arrayOfByte2[paramInt2++] = (byte)(0x80 | paramInt1 >> 6 & 0x3F);
                arrayOfByte2[paramInt2++] = (byte)(0x80 | paramInt1 & 0x3F);
                return paramInt2;
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
            return paramInt2;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    arrayOfByte2[paramInt2++] = (byte)(0xE0 | paramInt1 >> 12);
    arrayOfByte2[paramInt2++] = (byte)(0x80 | paramInt1 >> 6 & 0x3F);
    arrayOfByte2[paramInt2++] = (byte)(0x80 | paramInt1 & 0x3F);
    return paramInt2;
  }
  
  private final void ZL() throws IOException {
    try {
      if (this.Zi + 4 >= this.ZR)
        ZQ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    System.arraycopy(ZU, 0, this.ZY, this.Zi, 4);
    this.Zi += 4;
  }
  
  private int ZP(int paramInt1, int paramInt2) throws IOException {
    byte[] arrayOfByte1 = this.ZY;
    byte[] arrayOfByte2 = Zi();
    int i = Zf.ZH();
    arrayOfByte1[paramInt2++] = 92;
    arrayOfByte1[paramInt2++] = 117;
    if (paramInt1 > 255) {
      int j = paramInt1 >> 8 & 0xFF;
      arrayOfByte1[paramInt2++] = arrayOfByte2[j >> 4];
      arrayOfByte1[paramInt2++] = arrayOfByte2[j & 0xF];
      paramInt1 &= 0xFF;
      try {
        if (i == 0) {
          arrayOfByte1[paramInt2++] = 48;
          arrayOfByte1[paramInt2++] = 48;
          arrayOfByte1[paramInt2++] = arrayOfByte2[paramInt1 >> 4];
          arrayOfByte1[paramInt2++] = arrayOfByte2[paramInt1 & 0xF];
          return paramInt2;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      arrayOfByte1[paramInt2++] = arrayOfByte2[paramInt1 >> 4];
      arrayOfByte1[paramInt2++] = arrayOfByte2[paramInt1 & 0xF];
      return paramInt2;
    } 
    arrayOfByte1[paramInt2++] = 48;
    arrayOfByte1[paramInt2++] = 48;
    arrayOfByte1[paramInt2++] = arrayOfByte2[paramInt1 >> 4];
    arrayOfByte1[paramInt2++] = arrayOfByte2[paramInt1 & 0xF];
    return paramInt2;
  }
  
  protected final void ZQ() throws IOException {
    int i = this.Zi;
    try {
      if (i > 0) {
        this.Zi = 0;
        this.ZO.write(this.ZY, 0, i);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private byte[] Zi() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.Zk ? ZJ : Zx;
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¦pK°µóyM½Zp°XUìÿÔ+Òk0L³KÉ°þhëUðtoµ×L%rTr¦c«:ÆÑ[Ox,VoÄTé¯ðø\\bMý×2{Öù¨P-Zòb¨söÝë©ÉØºYÖ\\f0Üdº\\f±-½tµ\~éî½;ìC_nÙ£#TÎÐøªÁÊÃxº¼.y'_'ïîÐÔrý5JL¯g?á]Í¬Ïv-|÷í£yíÆ 3Úßû1ûñØ·Ë:!l_1jDVµÛ5Þ¡ouû:ó%_$\\r(*8 ÈAP,!Ué+Öð-/6È}ÜlFÎä\\b/Ò[¸BO{î,!^|\\r\\\n-kìUtÔÏT2·1-E¹gÝ\\bÑñÆ@Ukdjº§ G&PîjYæ^ÄJsÜ­»äÞ''§ï%Nw.ï=Ôÿ©øvOjÐýUQlù&îzåZb_Ã=9Pi°<ñmÚ3<`ºéÁF"§|{Tk¨Ml"Ý{%åkÔ»a¹-ôÙ7¼\\bvî¬æSãôß`nÃMXÜWÏ¿5Wù)Rr©MËój¥o¿$yjÎÕù%ú×ÕiÍm;Vë ¨ø5Ý z\\r<n´_#Þ-x\\fI¬Ô{tñ]ûØ!4mñí\\f±BýGQã­¥½ãMúuàØªêÝA¨´ËÒ ÕvNe9ø¾CDV_wrV-)\\fò2ÇÕ!~½&ªrY÷õ»ðïÉZ°û0=-ÜAX!æ#?ñ«AbÎàR-6|öàT¡ÕqòÖ0c\\nëuDT¸3Tø5Æ£X.µ÷'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #33
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #114
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
    //   68: ldc 'êðüùòçe¶,Á±éËÎ­)$»{Ópm=Yä#bëVß`{upû|·¯'CÆ\\t(Ðç'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #35
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #76
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
    //   129: putstatic com/fasterxml/Zq/Zy.f : [Ljava/lang/String;
    //   132: bipush #24
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zq/Zy.g : [Ljava/lang/String;
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
    //   212: bipush #86
    //   214: goto -> 244
    //   217: bipush #97
    //   219: goto -> 244
    //   222: bipush #100
    //   224: goto -> 244
    //   227: bipush #121
    //   229: goto -> 244
    //   232: bipush #17
    //   234: goto -> 244
    //   237: bipush #47
    //   239: goto -> 244
    //   242: bipush #26
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
    //   300: iconst_1
    //   301: invokestatic ZB : (Z)[B
    //   304: putstatic com/fasterxml/Zq/Zy.ZJ : [B
    //   307: iconst_0
    //   308: invokestatic ZB : (Z)[B
    //   311: putstatic com/fasterxml/Zq/Zy.Zx : [B
    //   314: iconst_4
    //   315: newarray byte
    //   317: dup
    //   318: iconst_0
    //   319: bipush #110
    //   321: bastore
    //   322: dup
    //   323: iconst_1
    //   324: bipush #117
    //   326: bastore
    //   327: dup
    //   328: iconst_2
    //   329: bipush #108
    //   331: bastore
    //   332: dup
    //   333: iconst_3
    //   334: bipush #108
    //   336: bastore
    //   337: putstatic com/fasterxml/Zq/Zy.ZU : [B
    //   340: iconst_4
    //   341: newarray byte
    //   343: dup
    //   344: iconst_0
    //   345: bipush #116
    //   347: bastore
    //   348: dup
    //   349: iconst_1
    //   350: bipush #114
    //   352: bastore
    //   353: dup
    //   354: iconst_2
    //   355: bipush #117
    //   357: bastore
    //   358: dup
    //   359: iconst_3
    //   360: bipush #101
    //   362: bastore
    //   363: putstatic com/fasterxml/Zq/Zy.ZN : [B
    //   366: iconst_5
    //   367: newarray byte
    //   369: dup
    //   370: iconst_0
    //   371: bipush #102
    //   373: bastore
    //   374: dup
    //   375: iconst_1
    //   376: bipush #97
    //   378: bastore
    //   379: dup
    //   380: iconst_2
    //   381: bipush #108
    //   383: bastore
    //   384: dup
    //   385: iconst_3
    //   386: bipush #115
    //   388: bastore
    //   389: dup
    //   390: iconst_4
    //   391: bipush #101
    //   393: bastore
    //   394: putstatic com/fasterxml/Zq/Zy.Za : [B
    //   397: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String c(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFD8B) & 0xFFFF;
    if (g[i] == null) {
      char[] arrayOfChar = f[i].toCharArray();
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
      char c = 'é';
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
      g[i] = (new String(arrayOfChar)).intern();
    } 
    return g[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq\Zy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */