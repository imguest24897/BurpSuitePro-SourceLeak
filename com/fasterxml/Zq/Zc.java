package com.fasterxml.Zq;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zi;
import com.fasterxml.Zb.Zj;
import com.fasterxml.Zb.Zm1;
import com.fasterxml.Zb.Zmd;
import com.fasterxml.Zb.Zy;
import com.fasterxml.Zv1;
import com.fasterxml.Zv9;
import com.fasterxml.Zvr;
import com.fasterxml.Zyh;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Zc extends Zv {
  protected static final char[] Zv;
  
  protected static final char[] Zm;
  
  protected final Writer ZZ;
  
  protected char Zt;
  
  protected char[] ZT;
  
  protected int ZN;
  
  protected int Za;
  
  protected int Zi;
  
  protected char[] ZJ;
  
  protected Zj Zl;
  
  protected char[] ZR;
  
  private static final String[] f;
  
  private static final String[] g;
  
  private char[] Zs() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.Zk ? Zv : Zm;
  }
  
  public Zc(Zv9 paramZv9, int paramInt, Zmd paramZmd, Writer paramWriter, char paramChar) {
    super(paramZv9, paramInt, paramZmd);
    this.ZZ = paramWriter;
    this.ZT = paramZv9.Zc();
    this.Zi = this.ZT.length;
    this.Zt = paramChar;
    boolean bool = Za(Zo.ESCAPE_FORWARD_SLASHES.Z_());
    try {
      if (paramChar == '"') {
        try {
          if (bool) {
            this.Zp = Zv1.ZI(paramChar, bool);
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.Zp = Zv1.ZI(paramChar, bool);
  }
  
  public void ZY(String paramString) throws IOException {
    int i = this.Zo.Zc(paramString);
    try {
      if (i == 4)
        Zr(c(1809, 15351)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zw(paramString, (i == 1));
  }
  
  public void Zm(Zj paramZj) throws IOException {
    int i = this.Zo.Zc(paramZj.ZV());
    try {
      if (i == 4)
        Zr(c(1814, 1314)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZO(paramZj, (i == 1));
  }
  
  protected final void Zw(String paramString, boolean paramBoolean) throws IOException {
    try {
      if (this.Ze != null) {
        ZT(paramString, paramBoolean);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Za + 1 >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramBoolean)
        this.ZT[this.Za++] = ','; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.ZA) {
        ZF(paramString);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.ZT[this.Za++] = this.Zt;
      ZF(paramString);
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = this.Zt;
  }
  
  protected final void ZO(Zj paramZj, boolean paramBoolean) throws IOException {
    try {
      if (this.Ze != null) {
        ZL(paramZj, paramBoolean);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Za + 1 >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramBoolean)
        this.ZT[this.Za++] = ','; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (this.ZA) {
      char[] arrayOfChar = paramZj.Ze();
      Zh(arrayOfChar, 0, arrayOfChar.length);
      return;
    } 
    this.ZT[this.Za++] = this.Zt;
    int i = paramZj.ZX(this.ZT, this.Za);
    try {
      if (i < 0) {
        ZP(paramZj);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.Za += i;
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = this.Zt;
  }
  
  private final void ZP(Zj paramZj) throws IOException {
    char[] arrayOfChar = paramZj.Ze();
    try {
      Zh(arrayOfChar, 0, arrayOfChar.length);
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = this.Zt;
  }
  
  public void Zd() throws IOException {
    Zk(c(1813, -15577));
    this.Zo = this.Zo.Ze();
    int i = Zf.ZH();
    try {
      ZV().Zj(this.Zo.Zs());
      if (this.Ze != null) {
        try {
          this.Ze.Zy((Zf)this);
          if (i == 0) {
            try {
              if (this.Za >= this.Zi)
                ZD(); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            this.ZT[this.Za++] = '[';
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
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = '[';
  }
  
  public void Zo(Object paramObject) throws IOException {
    Zk(c(1815, -3174));
    int i = Zf.ZI();
    try {
      this.Zo = this.Zo.Zx(paramObject);
      ZV().Zj(this.Zo.Zs());
      if (this.Ze != null) {
        try {
          this.Ze.Zy((Zf)this);
          if (i != 0) {
            try {
              if (this.Za >= this.Zi)
                ZD(); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            this.ZT[this.Za++] = '[';
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
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = '[';
  }
  
  public void Zf(Object paramObject, int paramInt) throws IOException {
    Zk(c(1815, -3174));
    this.Zo = this.Zo.Zx(paramObject);
    ZV().Zj(this.Zo.Zs());
    int i = Zf.ZI();
    try {
      if (this.Ze != null) {
        try {
          this.Ze.Zy((Zf)this);
          if (i != 0) {
            try {
              if (this.Za >= this.Zi)
                ZD(); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            this.ZT[this.Za++] = '[';
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
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = '[';
  }
  
  public void ZI() throws IOException {
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
    //   22: sipush #1819
    //   25: sipush #-1695
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
    //   93: getfield Za : I
    //   96: aload_0
    //   97: getfield Zi : I
    //   100: if_icmplt -> 121
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: aload_0
    //   111: invokevirtual ZD : ()V
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: aload_0
    //   122: getfield ZT : [C
    //   125: aload_0
    //   126: dup
    //   127: getfield Za : I
    //   130: dup_x1
    //   131: iconst_1
    //   132: iadd
    //   133: putfield Za : I
    //   136: bipush #93
    //   138: castore
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
  
  public void ZJ() throws IOException {
    Zk(c(1822, 13436));
    int i = Zf.ZH();
    try {
      this.Zo = this.Zo.ZD();
      ZV().Zj(this.Zo.Zs());
      if (this.Ze != null) {
        try {
          this.Ze.ZN((Zf)this);
          if (i == 0) {
            try {
              if (this.Za >= this.Zi)
                ZD(); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            this.ZT[this.Za++] = '{';
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
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = '{';
  }
  
  public void ZB(Object paramObject) throws IOException {
    Zk(c(1795, -30976));
    int i = Zf.ZI();
    Zf zf = this.Zo.Zu(paramObject);
    try {
      ZV().Zj(this.Zo.Zs());
      this.Zo = zf;
      if (this.Ze != null) {
        try {
          this.Ze.ZN((Zf)this);
          if (i != 0) {
            try {
              if (this.Za >= this.Zi)
                ZD(); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            this.ZT[this.Za++] = '{';
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
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = '{';
  }
  
  public void Ze(Object paramObject, int paramInt) throws IOException {
    ZB(paramObject);
  }
  
  public void Zh() throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   8: invokevirtual ZQ : ()Z
    //   11: ifne -> 57
    //   14: aload_0
    //   15: new java/lang/StringBuilder
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: sipush #1812
    //   25: sipush #-19699
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
    //   82: ifne -> 139
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: aload_0
    //   93: getfield Za : I
    //   96: aload_0
    //   97: getfield Zi : I
    //   100: if_icmplt -> 121
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: aload_0
    //   111: invokevirtual ZD : ()V
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: aload_0
    //   122: getfield ZT : [C
    //   125: aload_0
    //   126: dup
    //   127: getfield Za : I
    //   130: dup_x1
    //   131: iconst_1
    //   132: iadd
    //   133: putfield Za : I
    //   136: bipush #125
    //   138: castore
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
  
  protected final void ZT(String paramString, boolean paramBoolean) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_3
    //   4: iload_2
    //   5: ifeq -> 29
    //   8: aload_0
    //   9: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   12: aload_0
    //   13: invokeinterface ZK : (Lcom/fasterxml/Zb/Zf;)V
    //   18: iload_3
    //   19: ifeq -> 46
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: aload_0
    //   30: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   33: aload_0
    //   34: invokeinterface ZV : (Lcom/fasterxml/Zb/Zf;)V
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: aload_0
    //   47: getfield ZA : Z
    //   50: ifeq -> 69
    //   53: aload_0
    //   54: aload_1
    //   55: invokespecial ZF : (Ljava/lang/String;)V
    //   58: iload_3
    //   59: ifeq -> 165
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: aload_0
    //   70: getfield Za : I
    //   73: aload_0
    //   74: getfield Zi : I
    //   77: if_icmplt -> 98
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   86: athrow
    //   87: aload_0
    //   88: invokevirtual ZD : ()V
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   97: athrow
    //   98: aload_0
    //   99: getfield ZT : [C
    //   102: aload_0
    //   103: dup
    //   104: getfield Za : I
    //   107: dup_x1
    //   108: iconst_1
    //   109: iadd
    //   110: putfield Za : I
    //   113: aload_0
    //   114: getfield Zt : C
    //   117: castore
    //   118: aload_0
    //   119: aload_1
    //   120: invokespecial ZF : (Ljava/lang/String;)V
    //   123: aload_0
    //   124: getfield Za : I
    //   127: aload_0
    //   128: getfield Zi : I
    //   131: if_icmplt -> 145
    //   134: aload_0
    //   135: invokevirtual ZD : ()V
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   144: athrow
    //   145: aload_0
    //   146: getfield ZT : [C
    //   149: aload_0
    //   150: dup
    //   151: getfield Za : I
    //   154: dup_x1
    //   155: iconst_1
    //   156: iadd
    //   157: putfield Za : I
    //   160: aload_0
    //   161: getfield Zt : C
    //   164: castore
    //   165: return
    // Exception table:
    //   from	to	target	type
    //   4	22	25	java/io/IOException
    //   8	39	42	java/io/IOException
    //   46	62	65	java/io/IOException
    //   53	80	83	java/io/IOException
    //   69	91	94	java/io/IOException
    //   98	138	141	java/io/IOException
  }
  
  protected final void ZL(Zj paramZj, boolean paramBoolean) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_3
    //   4: iload_2
    //   5: ifeq -> 29
    //   8: aload_0
    //   9: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   12: aload_0
    //   13: invokeinterface ZK : (Lcom/fasterxml/Zb/Zf;)V
    //   18: iload_3
    //   19: ifeq -> 46
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: aload_0
    //   30: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   33: aload_0
    //   34: invokeinterface ZV : (Lcom/fasterxml/Zb/Zf;)V
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: aload_1
    //   47: invokeinterface Ze : ()[C
    //   52: astore #4
    //   54: aload_0
    //   55: getfield ZA : Z
    //   58: ifeq -> 82
    //   61: aload_0
    //   62: aload #4
    //   64: iconst_0
    //   65: aload #4
    //   67: arraylength
    //   68: invokevirtual Zh : ([CII)V
    //   71: iload_3
    //   72: ifeq -> 183
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: aload_0
    //   83: getfield Za : I
    //   86: aload_0
    //   87: getfield Zi : I
    //   90: if_icmplt -> 111
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: aload_0
    //   101: invokevirtual ZD : ()V
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   110: athrow
    //   111: aload_0
    //   112: getfield ZT : [C
    //   115: aload_0
    //   116: dup
    //   117: getfield Za : I
    //   120: dup_x1
    //   121: iconst_1
    //   122: iadd
    //   123: putfield Za : I
    //   126: aload_0
    //   127: getfield Zt : C
    //   130: castore
    //   131: aload_0
    //   132: aload #4
    //   134: iconst_0
    //   135: aload #4
    //   137: arraylength
    //   138: invokevirtual Zh : ([CII)V
    //   141: aload_0
    //   142: getfield Za : I
    //   145: aload_0
    //   146: getfield Zi : I
    //   149: if_icmplt -> 163
    //   152: aload_0
    //   153: invokevirtual ZD : ()V
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   162: athrow
    //   163: aload_0
    //   164: getfield ZT : [C
    //   167: aload_0
    //   168: dup
    //   169: getfield Za : I
    //   172: dup_x1
    //   173: iconst_1
    //   174: iadd
    //   175: putfield Za : I
    //   178: aload_0
    //   179: getfield Zt : C
    //   182: castore
    //   183: return
    // Exception table:
    //   from	to	target	type
    //   4	22	25	java/io/IOException
    //   8	39	42	java/io/IOException
    //   54	75	78	java/io/IOException
    //   61	93	96	java/io/IOException
    //   82	104	107	java/io/IOException
    //   111	156	159	java/io/IOException
  }
  
  public void ZD(String paramString) throws IOException {
    try {
      Zk(c(1817, -28569));
      if (paramString == null) {
        Zv();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.ZT[this.Za++] = this.Zt;
      ZF(paramString);
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = this.Zt;
  }
  
  public void ZA(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    try {
      Zk(c(1817, -28569));
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.ZT[this.Za++] = this.Zt;
      Zu(paramArrayOfchar, paramInt1, paramInt2);
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = this.Zt;
  }
  
  public void Zr(Zj paramZj) throws IOException {
    try {
      Zk(c(1816, 10244));
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = this.Zt;
    int i = paramZj.ZX(this.ZT, this.Za);
    try {
      if (i < 0) {
        Ze(paramZj);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.Za += i;
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = this.Zt;
  }
  
  private void Ze(Zj paramZj) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface Ze : ()[C
    //   6: astore_3
    //   7: invokestatic ZH : ()I
    //   10: aload_3
    //   11: arraylength
    //   12: istore #4
    //   14: istore_2
    //   15: iload #4
    //   17: bipush #32
    //   19: if_icmpge -> 81
    //   22: aload_0
    //   23: getfield Zi : I
    //   26: aload_0
    //   27: getfield Za : I
    //   30: isub
    //   31: istore #5
    //   33: iload #4
    //   35: iload #5
    //   37: if_icmple -> 51
    //   40: aload_0
    //   41: invokevirtual ZD : ()V
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: aload_3
    //   52: iconst_0
    //   53: aload_0
    //   54: getfield ZT : [C
    //   57: aload_0
    //   58: getfield Za : I
    //   61: iload #4
    //   63: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   66: aload_0
    //   67: dup
    //   68: getfield Za : I
    //   71: iload #4
    //   73: iadd
    //   74: putfield Za : I
    //   77: iload_2
    //   78: ifne -> 103
    //   81: aload_0
    //   82: invokevirtual ZD : ()V
    //   85: aload_0
    //   86: getfield ZZ : Ljava/io/Writer;
    //   89: aload_3
    //   90: iconst_0
    //   91: iload #4
    //   93: invokevirtual write : ([CII)V
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: aload_0
    //   104: getfield Za : I
    //   107: aload_0
    //   108: getfield Zi : I
    //   111: if_icmplt -> 125
    //   114: aload_0
    //   115: invokevirtual ZD : ()V
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: aload_0
    //   126: getfield ZT : [C
    //   129: aload_0
    //   130: dup
    //   131: getfield Za : I
    //   134: dup_x1
    //   135: iconst_1
    //   136: iadd
    //   137: putfield Za : I
    //   140: aload_0
    //   141: getfield Zt : C
    //   144: castore
    //   145: return
    // Exception table:
    //   from	to	target	type
    //   33	44	47	java/io/IOException
    //   51	96	99	java/io/IOException
    //   103	118	121	java/io/IOException
  }
  
  public void ZM(String paramString) throws IOException {
    int j = paramString.length();
    int k = this.Zi - this.Za;
    int i = Zf.ZI();
    if (k == 0) {
      ZD();
      k = this.Zi - this.Za;
    } 
    try {
      if (k >= j) {
        try {
          paramString.getChars(0, j, this.ZT, this.Za);
          this.Za += j;
          if (i != 0) {
            ZB(paramString);
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
    ZB(paramString);
  }
  
  public void Zt(String paramString, int paramInt1, int paramInt2) throws IOException {
    Zp(paramString, paramInt1, paramInt2);
    int i = Zf.ZH();
    int j = this.Zi - this.Za;
    if (j < paramInt2) {
      ZD();
      j = this.Zi - this.Za;
    } 
    try {
      if (j >= paramInt2) {
        try {
          paramString.getChars(paramInt1, paramInt1 + paramInt2, this.ZT, this.Za);
          this.Za += paramInt2;
          if (i == 0) {
            ZB(paramString.substring(paramInt1, paramInt1 + paramInt2));
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
    ZB(paramString.substring(paramInt1, paramInt1 + paramInt2));
  }
  
  public void Zg(Zj paramZj) throws IOException {
    int i = paramZj.ZZ(this.ZT, this.Za);
    try {
      if (i < 0) {
        ZM(paramZj.ZV());
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.Za += i;
  }
  
  public void Zh(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    Zs(paramArrayOfchar, paramInt1, paramInt2);
    if (paramInt2 < 32) {
      int i = this.Zi - this.Za;
      try {
        if (paramInt2 > i)
          ZD(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      System.arraycopy(paramArrayOfchar, paramInt1, this.ZT, this.Za, paramInt2);
      this.Za += paramInt2;
      return;
    } 
    ZD();
    this.ZZ.write(paramArrayOfchar, paramInt1, paramInt2);
  }
  
  public void ZB(char paramChar) throws IOException {
    try {
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = paramChar;
  }
  
  private void ZB(String paramString) throws IOException {
    int j = this.Zi - this.Za;
    paramString.getChars(0, j, this.ZT, this.Za);
    this.Za += j;
    ZD();
    int k = j;
    int m = paramString.length() - j;
    int i = Zf.ZI();
    while (m > this.Zi) {
      int n = this.Zi;
      paramString.getChars(k, k + n, this.ZT, 0);
      this.ZN = 0;
      this.Za = n;
      ZD();
      k += n;
      m -= n;
      if (i != 0)
        break; 
    } 
    paramString.getChars(k, k + m, this.ZT, 0);
    this.ZN = 0;
    this.Za = m;
  }
  
  public void Z_(Zy paramZy, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException, Zm1 {
    try {
      ZX(paramArrayOfbyte, paramInt1, paramInt2);
      Zk(c(1821, -24295));
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.ZT[this.Za++] = this.Zt;
      ZW(paramZy, paramArrayOfbyte, paramInt1, paramInt1 + paramInt2);
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = this.Zt;
  }
  
  public int ZE(Zy paramZy, InputStream paramInputStream, int paramInt) throws IOException, Zm1 {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: sipush #1818
    //   7: sipush #9183
    //   10: invokestatic c : (II)Ljava/lang/String;
    //   13: invokevirtual Zk : (Ljava/lang/String;)V
    //   16: istore #4
    //   18: aload_0
    //   19: getfield Za : I
    //   22: aload_0
    //   23: getfield Zi : I
    //   26: if_icmplt -> 40
    //   29: aload_0
    //   30: invokevirtual ZD : ()V
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   39: athrow
    //   40: aload_0
    //   41: getfield ZT : [C
    //   44: aload_0
    //   45: dup
    //   46: getfield Za : I
    //   49: dup_x1
    //   50: iconst_1
    //   51: iadd
    //   52: putfield Za : I
    //   55: aload_0
    //   56: getfield Zt : C
    //   59: castore
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
    //   78: invokevirtual ZN : (Lcom/fasterxml/Zb/Zy;Ljava/io/InputStream;[B)I
    //   81: istore #6
    //   83: iload #4
    //   85: ifne -> 166
    //   88: aload_0
    //   89: aload_1
    //   90: aload_2
    //   91: aload #5
    //   93: iload_3
    //   94: invokevirtual Zg : (Lcom/fasterxml/Zb/Zy;Ljava/io/InputStream;[BI)I
    //   97: istore #7
    //   99: iload #7
    //   101: ifle -> 163
    //   104: aload_0
    //   105: new java/lang/StringBuilder
    //   108: dup
    //   109: invokespecial <init> : ()V
    //   112: sipush #1820
    //   115: sipush #-15604
    //   118: invokestatic c : (II)Ljava/lang/String;
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: iload #7
    //   126: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   129: sipush #1811
    //   132: sipush #-4747
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
    //   193: getfield Za : I
    //   196: aload_0
    //   197: getfield Zi : I
    //   200: if_icmplt -> 214
    //   203: aload_0
    //   204: invokevirtual ZD : ()V
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   213: athrow
    //   214: aload_0
    //   215: getfield ZT : [C
    //   218: aload_0
    //   219: dup
    //   220: getfield Za : I
    //   223: dup_x1
    //   224: iconst_1
    //   225: iadd
    //   226: putfield Za : I
    //   229: aload_0
    //   230: getfield Zt : C
    //   233: castore
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
      Zk(c(1823, 11791));
      if (this.Zz) {
        Zm(paramShort);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Za + 6 >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.Za = Zvr.Zx(paramShort, this.ZT, this.Za);
  }
  
  private void Zm(short paramShort) throws IOException {
    try {
      if (this.Za + 8 >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = this.Zt;
    this.Za = Zvr.Zx(paramShort, this.ZT, this.Za);
    this.ZT[this.Za++] = this.Zt;
  }
  
  public void Zd(int paramInt) throws IOException {
    try {
      Zk(c(1823, 11791));
      if (this.Zz) {
        Zg(paramInt);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Za + 11 >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.Za = Zvr.Zx(paramInt, this.ZT, this.Za);
  }
  
  private void Zg(int paramInt) throws IOException {
    try {
      if (this.Za + 13 >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = this.Zt;
    this.Za = Zvr.Zx(paramInt, this.ZT, this.Za);
    this.ZT[this.Za++] = this.Zt;
  }
  
  public void Zw(long paramLong) throws IOException {
    try {
      Zk(c(1823, 11791));
      if (this.Zz) {
        Zy(paramLong);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Za + 21 >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.Za = Zvr.Zx(paramLong, this.ZT, this.Za);
  }
  
  private void Zy(long paramLong) throws IOException {
    try {
      if (this.Za + 23 >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = this.Zt;
    this.Za = Zvr.Zx(paramLong, this.ZT, this.Za);
    this.ZT[this.Za++] = this.Zt;
  }
  
  public void Zy(BigInteger paramBigInteger) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: sipush #1823
    //   7: sipush #11791
    //   10: invokestatic c : (II)Ljava/lang/String;
    //   13: invokevirtual Zk : (Ljava/lang/String;)V
    //   16: istore_2
    //   17: aload_1
    //   18: ifnonnull -> 36
    //   21: aload_0
    //   22: invokespecial Zv : ()V
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
    //   55: invokespecial Zw : (Ljava/lang/String;)V
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
              if (Za(Zi.QUOTE_NON_NUMERIC_NUMBERS)) {
                ZD(Zvr.ZR(paramDouble, Za(Zi.USE_FAST_DOUBLE_WRITER)));
                return;
              } 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        } 
        Zk(c(1823, 11791));
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
              if (Za(Zi.QUOTE_NON_NUMERIC_NUMBERS)) {
                ZD(Zvr.Zh(paramFloat, Za(Zi.USE_FAST_DOUBLE_WRITER)));
                return;
              } 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        } 
        Zk(c(1794, -11618));
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
    //   0: invokestatic ZI : ()I
    //   3: aload_0
    //   4: sipush #1823
    //   7: sipush #11791
    //   10: invokestatic c : (II)Ljava/lang/String;
    //   13: invokevirtual Zk : (Ljava/lang/String;)V
    //   16: istore_2
    //   17: aload_1
    //   18: ifnonnull -> 36
    //   21: aload_0
    //   22: invokespecial Zv : ()V
    //   25: iload_2
    //   26: ifeq -> 86
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
    //   56: invokespecial Zw : (Ljava/lang/String;)V
    //   59: iload_2
    //   60: ifeq -> 86
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
    //   4: sipush #1823
    //   7: sipush #11791
    //   10: invokestatic c : (II)Ljava/lang/String;
    //   13: invokevirtual Zk : (Ljava/lang/String;)V
    //   16: istore_2
    //   17: aload_1
    //   18: ifnonnull -> 36
    //   21: aload_0
    //   22: invokespecial Zv : ()V
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
    //   52: invokespecial Zw : (Ljava/lang/String;)V
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
  
  private void Zw(String paramString) throws IOException {
    try {
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.ZT[this.Za++] = this.Zt;
      ZM(paramString);
      if (this.Za >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZT[this.Za++] = this.Zt;
  }
  
  public void Zs(boolean paramBoolean) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: sipush #1808
    //   7: sipush #-15389
    //   10: invokestatic c : (II)Ljava/lang/String;
    //   13: invokevirtual Zk : (Ljava/lang/String;)V
    //   16: istore_2
    //   17: aload_0
    //   18: getfield Za : I
    //   21: iconst_5
    //   22: iadd
    //   23: aload_0
    //   24: getfield Zi : I
    //   27: if_icmplt -> 41
    //   30: aload_0
    //   31: invokevirtual ZD : ()V
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   40: athrow
    //   41: aload_0
    //   42: getfield Za : I
    //   45: istore_3
    //   46: aload_0
    //   47: getfield ZT : [C
    //   50: astore #4
    //   52: iload_1
    //   53: ifeq -> 100
    //   56: aload #4
    //   58: iload_3
    //   59: bipush #116
    //   61: castore
    //   62: aload #4
    //   64: iinc #3, 1
    //   67: iload_3
    //   68: bipush #114
    //   70: castore
    //   71: aload #4
    //   73: iinc #3, 1
    //   76: iload_3
    //   77: bipush #117
    //   79: castore
    //   80: aload #4
    //   82: iinc #3, 1
    //   85: iload_3
    //   86: bipush #101
    //   88: castore
    //   89: iload_2
    //   90: ifne -> 149
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: aload #4
    //   102: iload_3
    //   103: bipush #102
    //   105: castore
    //   106: aload #4
    //   108: iinc #3, 1
    //   111: iload_3
    //   112: bipush #97
    //   114: castore
    //   115: aload #4
    //   117: iinc #3, 1
    //   120: iload_3
    //   121: bipush #108
    //   123: castore
    //   124: aload #4
    //   126: iinc #3, 1
    //   129: iload_3
    //   130: bipush #115
    //   132: castore
    //   133: aload #4
    //   135: iinc #3, 1
    //   138: iload_3
    //   139: bipush #101
    //   141: castore
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   148: athrow
    //   149: aload_0
    //   150: iload_3
    //   151: iconst_1
    //   152: iadd
    //   153: putfield Za : I
    //   156: return
    // Exception table:
    //   from	to	target	type
    //   17	34	37	java/io/IOException
    //   52	93	96	java/io/IOException
    //   56	142	145	java/io/IOException
  }
  
  public void ZT() throws IOException {
    Zk(c(1810, 29018));
    Zv();
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
    //   31: tableswitch default -> 68, 0 -> 68, 1 -> 73, 2 -> 81, 3 -> 89, 4 -> 68, 5 -> 124
    //   68: return
    //   69: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   72: athrow
    //   73: bipush #44
    //   75: istore #4
    //   77: iload_2
    //   78: ifeq -> 130
    //   81: bipush #58
    //   83: istore #4
    //   85: iload_2
    //   86: ifeq -> 130
    //   89: aload_0
    //   90: getfield ZP : Lcom/fasterxml/Zb/Zj;
    //   93: ifnull -> 123
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: aload_0
    //   104: aload_0
    //   105: getfield ZP : Lcom/fasterxml/Zb/Zj;
    //   108: invokeinterface ZV : ()Ljava/lang/String;
    //   113: invokevirtual ZM : (Ljava/lang/String;)V
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: return
    //   124: aload_0
    //   125: aload_1
    //   126: invokevirtual Zg : (Ljava/lang/String;)V
    //   129: return
    //   130: aload_0
    //   131: getfield Za : I
    //   134: aload_0
    //   135: getfield Zi : I
    //   138: if_icmplt -> 152
    //   141: aload_0
    //   142: invokevirtual ZD : ()V
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   151: athrow
    //   152: aload_0
    //   153: getfield ZT : [C
    //   156: aload_0
    //   157: dup
    //   158: getfield Za : I
    //   161: dup_x1
    //   162: iconst_1
    //   163: iadd
    //   164: putfield Za : I
    //   167: iload #4
    //   169: castore
    //   170: return
    // Exception table:
    //   from	to	target	type
    //   12	26	26	java/io/IOException
    //   30	69	69	java/io/IOException
    //   85	96	99	java/io/IOException
    //   89	116	119	java/io/IOException
    //   130	145	148	java/io/IOException
  }
  
  public void flush() throws IOException {
    try {
      ZD();
      if (this.ZZ != null)
        try {
          if (Za(Zi.FLUSH_PASSED_TO_STREAM))
            this.ZZ.flush(); 
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
    //   4: invokestatic ZH : ()I
    //   7: aconst_null
    //   8: astore_2
    //   9: istore_1
    //   10: aload_0
    //   11: getfield ZT : [C
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
    //   51: ifne -> 79
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
    //   80: ifne -> 34
    //   83: aload_0
    //   84: invokevirtual ZD : ()V
    //   87: goto -> 93
    //   90: astore_3
    //   91: aload_3
    //   92: astore_2
    //   93: aload_0
    //   94: iconst_0
    //   95: putfield ZN : I
    //   98: aload_0
    //   99: iconst_0
    //   100: putfield Za : I
    //   103: aload_0
    //   104: getfield ZZ : Ljava/io/Writer;
    //   107: ifnull -> 208
    //   110: aload_0
    //   111: getfield Zb : Lcom/fasterxml/Zv9;
    //   114: invokevirtual Z_ : ()Z
    //   117: ifne -> 137
    //   120: aload_0
    //   121: getstatic com/fasterxml/Zb/Zi.AUTO_CLOSE_TARGET : Lcom/fasterxml/Zb/Zi;
    //   124: invokevirtual Za : (Lcom/fasterxml/Zb/Zi;)Z
    //   127: ifeq -> 155
    //   130: goto -> 137
    //   133: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   136: athrow
    //   137: aload_0
    //   138: getfield ZZ : Ljava/io/Writer;
    //   141: invokevirtual close : ()V
    //   144: iload_1
    //   145: ifne -> 186
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: aload_0
    //   156: getstatic com/fasterxml/Zb/Zi.FLUSH_PASSED_TO_STREAM : Lcom/fasterxml/Zb/Zi;
    //   159: invokevirtual Za : (Lcom/fasterxml/Zb/Zi;)Z
    //   162: ifeq -> 186
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   171: athrow
    //   172: aload_0
    //   173: getfield ZZ : Ljava/io/Writer;
    //   176: invokevirtual flush : ()V
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   185: athrow
    //   186: goto -> 208
    //   189: astore_3
    //   190: aload_2
    //   191: ifnull -> 206
    //   194: aload_3
    //   195: aload_2
    //   196: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   205: athrow
    //   206: aload_3
    //   207: athrow
    //   208: aload_0
    //   209: invokevirtual ZS : ()V
    //   212: aload_2
    //   213: ifnull -> 222
    //   216: aload_2
    //   217: athrow
    //   218: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   221: athrow
    //   222: return
    // Exception table:
    //   from	to	target	type
    //   10	27	30	java/io/IOException
    //   10	87	90	java/io/IOException
    //   46	61	64	java/io/IOException
    //   54	72	75	java/io/IOException
    //   110	130	133	java/io/IOException
    //   110	186	189	java/io/IOException
    //   110	186	189	java/lang/RuntimeException
    //   120	148	151	java/io/IOException
    //   137	165	168	java/io/IOException
    //   155	179	182	java/io/IOException
    //   190	199	202	java/io/IOException
    //   208	218	218	java/io/IOException
  }
  
  protected void ZS() {
    char[] arrayOfChar = this.ZT;
    try {
      if (arrayOfChar != null) {
        this.ZT = null;
        this.Zb.Zf(arrayOfChar);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    arrayOfChar = this.ZR;
    try {
      if (arrayOfChar != null) {
        this.ZR = null;
        this.Zb.ZO(arrayOfChar);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private void ZF(String paramString) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_1
    //   4: invokevirtual length : ()I
    //   7: istore_3
    //   8: istore_2
    //   9: iload_3
    //   10: aload_0
    //   11: getfield Zi : I
    //   14: if_icmple -> 27
    //   17: aload_0
    //   18: aload_1
    //   19: invokespecial Z_ : (Ljava/lang/String;)V
    //   22: return
    //   23: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   26: athrow
    //   27: aload_0
    //   28: getfield Za : I
    //   31: iload_3
    //   32: iadd
    //   33: aload_0
    //   34: getfield Zi : I
    //   37: if_icmple -> 51
    //   40: aload_0
    //   41: invokevirtual ZD : ()V
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: aload_1
    //   52: iconst_0
    //   53: iload_3
    //   54: aload_0
    //   55: getfield ZT : [C
    //   58: aload_0
    //   59: getfield Za : I
    //   62: invokevirtual getChars : (II[CI)V
    //   65: aload_0
    //   66: getfield Zr : Lcom/fasterxml/Zyh;
    //   69: ifnull -> 88
    //   72: aload_0
    //   73: iload_3
    //   74: invokespecial Zq : (I)V
    //   77: iload_2
    //   78: ifne -> 134
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   87: athrow
    //   88: aload_0
    //   89: getfield ZM : I
    //   92: ifeq -> 122
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: aload_0
    //   103: iload_3
    //   104: aload_0
    //   105: getfield ZM : I
    //   108: invokespecial Zz : (II)V
    //   111: iload_2
    //   112: ifne -> 134
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   121: athrow
    //   122: aload_0
    //   123: iload_3
    //   124: invokespecial ZE : (I)V
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: return
    // Exception table:
    //   from	to	target	type
    //   9	23	23	java/io/IOException
    //   27	44	47	java/io/IOException
    //   51	81	84	java/io/IOException
    //   72	95	98	java/io/IOException
    //   88	115	118	java/io/IOException
    //   102	127	130	java/io/IOException
  }
  
  private void ZE(int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: getfield Za : I
    //   7: iload_1
    //   8: iadd
    //   9: istore_3
    //   10: istore_2
    //   11: aload_0
    //   12: getfield Zp : [I
    //   15: astore #4
    //   17: aload #4
    //   19: arraylength
    //   20: istore #5
    //   22: aload_0
    //   23: getfield Za : I
    //   26: iload_3
    //   27: if_icmpge -> 184
    //   30: aload_0
    //   31: getfield ZT : [C
    //   34: aload_0
    //   35: getfield Za : I
    //   38: caload
    //   39: istore #6
    //   41: iload #6
    //   43: iload #5
    //   45: if_icmpge -> 67
    //   48: aload #4
    //   50: iload #6
    //   52: iaload
    //   53: ifeq -> 67
    //   56: iload_2
    //   57: ifne -> 111
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: aload_0
    //   68: dup
    //   69: getfield Za : I
    //   72: iconst_1
    //   73: iadd
    //   74: dup_x1
    //   75: putfield Za : I
    //   78: iload_3
    //   79: if_icmplt -> 100
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: iload_2
    //   90: ifne -> 184
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: iload_2
    //   101: ifne -> 30
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   110: athrow
    //   111: aload_0
    //   112: getfield Za : I
    //   115: aload_0
    //   116: getfield ZN : I
    //   119: isub
    //   120: istore #6
    //   122: iload #6
    //   124: ifle -> 151
    //   127: aload_0
    //   128: getfield ZZ : Ljava/io/Writer;
    //   131: aload_0
    //   132: getfield ZT : [C
    //   135: aload_0
    //   136: getfield ZN : I
    //   139: iload #6
    //   141: invokevirtual write : ([CII)V
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: aload_0
    //   152: getfield ZT : [C
    //   155: aload_0
    //   156: dup
    //   157: getfield Za : I
    //   160: dup_x1
    //   161: iconst_1
    //   162: iadd
    //   163: putfield Za : I
    //   166: caload
    //   167: istore #7
    //   169: aload_0
    //   170: iload #7
    //   172: aload #4
    //   174: iload #7
    //   176: iaload
    //   177: invokespecial Zv : (CI)V
    //   180: iload_2
    //   181: ifne -> 22
    //   184: return
    // Exception table:
    //   from	to	target	type
    //   48	60	63	java/io/IOException
    //   56	82	85	java/io/IOException
    //   67	93	96	java/io/IOException
    //   89	104	107	java/io/IOException
    //   122	144	147	java/io/IOException
  }
  
  private void Z_(String paramString) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: invokevirtual ZD : ()V
    //   7: aload_1
    //   8: invokevirtual length : ()I
    //   11: istore_3
    //   12: istore_2
    //   13: iconst_0
    //   14: istore #4
    //   16: aload_0
    //   17: getfield Zi : I
    //   20: istore #5
    //   22: iload #4
    //   24: iload #5
    //   26: iadd
    //   27: iload_3
    //   28: if_icmple -> 38
    //   31: iload_3
    //   32: iload #4
    //   34: isub
    //   35: goto -> 40
    //   38: iload #5
    //   40: istore #6
    //   42: aload_1
    //   43: iload #4
    //   45: iload #4
    //   47: iload #6
    //   49: iadd
    //   50: aload_0
    //   51: getfield ZT : [C
    //   54: iconst_0
    //   55: invokevirtual getChars : (II[CI)V
    //   58: aload_0
    //   59: getfield Zr : Lcom/fasterxml/Zyh;
    //   62: ifnull -> 82
    //   65: aload_0
    //   66: iload #6
    //   68: invokespecial ZL : (I)V
    //   71: iload_2
    //   72: ifne -> 130
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: aload_0
    //   83: getfield ZM : I
    //   86: ifeq -> 117
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: aload_0
    //   97: iload #6
    //   99: aload_0
    //   100: getfield ZM : I
    //   103: invokespecial ZD : (II)V
    //   106: iload_2
    //   107: ifne -> 130
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   116: athrow
    //   117: aload_0
    //   118: iload #6
    //   120: invokespecial ZM : (I)V
    //   123: goto -> 130
    //   126: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   129: athrow
    //   130: iload #4
    //   132: iload #6
    //   134: iadd
    //   135: istore #4
    //   137: iload #4
    //   139: iload_3
    //   140: if_icmplt -> 16
    //   143: return
    // Exception table:
    //   from	to	target	type
    //   42	75	78	java/io/IOException
    //   65	89	92	java/io/IOException
    //   82	110	113	java/io/IOException
    //   96	123	126	java/io/IOException
  }
  
  private void ZM(int paramInt) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zp : [I
    //   4: astore_3
    //   5: invokestatic ZI : ()I
    //   8: aload_3
    //   9: arraylength
    //   10: istore #4
    //   12: istore_2
    //   13: iconst_0
    //   14: istore #5
    //   16: iload #5
    //   18: istore #6
    //   20: iload #5
    //   22: iload_1
    //   23: if_icmpge -> 156
    //   26: aload_0
    //   27: getfield ZT : [C
    //   30: iload #5
    //   32: caload
    //   33: istore #7
    //   35: iload #7
    //   37: iload #4
    //   39: if_icmpge -> 60
    //   42: aload_3
    //   43: iload #7
    //   45: iaload
    //   46: ifeq -> 60
    //   49: iload_2
    //   50: ifeq -> 79
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   59: athrow
    //   60: iinc #5, 1
    //   63: iload #5
    //   65: iload_1
    //   66: if_icmplt -> 26
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   75: athrow
    //   76: goto -> 79
    //   79: iload #5
    //   81: iload #6
    //   83: isub
    //   84: istore #8
    //   86: iload #8
    //   88: ifle -> 130
    //   91: aload_0
    //   92: getfield ZZ : Ljava/io/Writer;
    //   95: aload_0
    //   96: getfield ZT : [C
    //   99: iload #6
    //   101: iload #8
    //   103: invokevirtual write : ([CII)V
    //   106: iload #5
    //   108: iload_1
    //   109: if_icmplt -> 130
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   118: athrow
    //   119: iload_2
    //   120: ifeq -> 156
    //   123: goto -> 130
    //   126: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   129: athrow
    //   130: iinc #5, 1
    //   133: aload_0
    //   134: aload_0
    //   135: getfield ZT : [C
    //   138: iload #5
    //   140: iload_1
    //   141: iload #7
    //   143: aload_3
    //   144: iload #7
    //   146: iaload
    //   147: invokespecial Zd : ([CIICI)I
    //   150: istore #6
    //   152: iload_2
    //   153: ifeq -> 20
    //   156: return
    // Exception table:
    //   from	to	target	type
    //   42	53	56	java/io/IOException
    //   49	69	72	java/io/IOException
    //   86	112	115	java/io/IOException
    //   91	123	126	java/io/IOException
  }
  
  private void Zu(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: getfield Zr : Lcom/fasterxml/Zyh;
    //   9: ifnull -> 24
    //   12: aload_0
    //   13: aload_1
    //   14: iload_2
    //   15: iload_3
    //   16: invokespecial ZC : ([CII)V
    //   19: return
    //   20: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   23: athrow
    //   24: aload_0
    //   25: getfield ZM : I
    //   28: ifeq -> 47
    //   31: aload_0
    //   32: aload_1
    //   33: iload_2
    //   34: iload_3
    //   35: aload_0
    //   36: getfield ZM : I
    //   39: invokespecial ZR : ([CIII)V
    //   42: return
    //   43: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   46: athrow
    //   47: iload_3
    //   48: iload_2
    //   49: iadd
    //   50: istore_3
    //   51: aload_0
    //   52: getfield Zp : [I
    //   55: astore #5
    //   57: aload #5
    //   59: arraylength
    //   60: istore #6
    //   62: iload_2
    //   63: iload_3
    //   64: if_icmpge -> 294
    //   67: iload_2
    //   68: istore #7
    //   70: aload_1
    //   71: iload_2
    //   72: caload
    //   73: istore #8
    //   75: iload #8
    //   77: iload #6
    //   79: if_icmpge -> 102
    //   82: aload #5
    //   84: iload #8
    //   86: iaload
    //   87: ifeq -> 102
    //   90: iload #4
    //   92: ifne -> 141
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: iinc #2, 1
    //   105: iload_2
    //   106: iload_3
    //   107: if_icmplt -> 129
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   116: athrow
    //   117: iload #4
    //   119: ifne -> 141
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: iload #4
    //   131: ifne -> 70
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: iload_2
    //   142: iload #7
    //   144: isub
    //   145: istore #8
    //   147: iload #8
    //   149: bipush #32
    //   151: if_icmpge -> 230
    //   154: aload_0
    //   155: getfield Za : I
    //   158: iload #8
    //   160: iadd
    //   161: aload_0
    //   162: getfield Zi : I
    //   165: if_icmple -> 186
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   174: athrow
    //   175: aload_0
    //   176: invokevirtual ZD : ()V
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   185: athrow
    //   186: iload #8
    //   188: ifle -> 253
    //   191: aload_1
    //   192: iload #7
    //   194: aload_0
    //   195: getfield ZT : [C
    //   198: aload_0
    //   199: getfield Za : I
    //   202: iload #8
    //   204: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   207: aload_0
    //   208: dup
    //   209: getfield Za : I
    //   212: iload #8
    //   214: iadd
    //   215: putfield Za : I
    //   218: iload #4
    //   220: ifne -> 253
    //   223: goto -> 230
    //   226: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   229: athrow
    //   230: aload_0
    //   231: invokevirtual ZD : ()V
    //   234: aload_0
    //   235: getfield ZZ : Ljava/io/Writer;
    //   238: aload_1
    //   239: iload #7
    //   241: iload #8
    //   243: invokevirtual write : ([CII)V
    //   246: goto -> 253
    //   249: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   252: athrow
    //   253: iload_2
    //   254: iload_3
    //   255: if_icmplt -> 270
    //   258: iload #4
    //   260: ifne -> 294
    //   263: goto -> 270
    //   266: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   269: athrow
    //   270: aload_1
    //   271: iload_2
    //   272: iinc #2, 1
    //   275: caload
    //   276: istore #9
    //   278: aload_0
    //   279: iload #9
    //   281: aload #5
    //   283: iload #9
    //   285: iaload
    //   286: invokespecial ZO : (CI)V
    //   289: iload #4
    //   291: ifne -> 62
    //   294: return
    // Exception table:
    //   from	to	target	type
    //   5	20	20	java/io/IOException
    //   24	43	43	java/io/IOException
    //   82	95	98	java/io/IOException
    //   90	110	113	java/io/IOException
    //   102	122	125	java/io/IOException
    //   117	134	137	java/io/IOException
    //   147	168	171	java/io/IOException
    //   154	179	182	java/io/IOException
    //   186	223	226	java/io/IOException
    //   191	246	249	java/io/IOException
    //   253	263	266	java/io/IOException
  }
  
  private void Zz(int paramInt1, int paramInt2) throws IOException, Zm1 {
    int j = this.Za + paramInt1;
    int i = Zf.ZI();
    int[] arrayOfInt = this.Zp;
    int k = Math.min(arrayOfInt.length, paramInt2 + 1);
    boolean bool = false;
    label34: while (this.Za < j) {
      char c;
      while (true) {
        while (true) {
          c = this.ZT[this.Za];
          break;
        } 
        if (++this.Za >= j) {
          if (i != 0)
            break; 
          break label34;
        } 
      } 
      int m = this.Za - this.ZN;
      try {
        if (m > 0)
          this.ZZ.write(this.ZT, this.ZN, m); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      this.Za++;
      Zv(c, bool);
      if (i != 0)
        break; 
    } 
  }
  
  private void ZD(int paramInt1, int paramInt2) throws IOException, Zm1 {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zp : [I
    //   4: astore #4
    //   6: aload #4
    //   8: arraylength
    //   9: iload_2
    //   10: iconst_1
    //   11: iadd
    //   12: invokestatic min : (II)I
    //   15: istore #5
    //   17: iconst_0
    //   18: istore #6
    //   20: invokestatic ZH : ()I
    //   23: iconst_0
    //   24: istore #7
    //   26: iload #6
    //   28: istore #8
    //   30: istore_3
    //   31: iload #6
    //   33: iload_1
    //   34: if_icmpge -> 190
    //   37: aload_0
    //   38: getfield ZT : [C
    //   41: iload #6
    //   43: caload
    //   44: istore #9
    //   46: iload #9
    //   48: iload #5
    //   50: if_icmpge -> 76
    //   53: aload #4
    //   55: iload #9
    //   57: iaload
    //   58: istore #7
    //   60: iload #7
    //   62: ifeq -> 96
    //   65: iload_3
    //   66: ifne -> 115
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   75: athrow
    //   76: iload #9
    //   78: iload_2
    //   79: if_icmple -> 96
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   88: athrow
    //   89: iconst_m1
    //   90: istore #7
    //   92: iload_3
    //   93: ifne -> 115
    //   96: iinc #6, 1
    //   99: iload #6
    //   101: iload_1
    //   102: if_icmplt -> 37
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   111: athrow
    //   112: goto -> 115
    //   115: iload #6
    //   117: iload #8
    //   119: isub
    //   120: istore #10
    //   122: iload #10
    //   124: ifle -> 166
    //   127: aload_0
    //   128: getfield ZZ : Ljava/io/Writer;
    //   131: aload_0
    //   132: getfield ZT : [C
    //   135: iload #8
    //   137: iload #10
    //   139: invokevirtual write : ([CII)V
    //   142: iload #6
    //   144: iload_1
    //   145: if_icmplt -> 166
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   154: athrow
    //   155: iload_3
    //   156: ifne -> 190
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   165: athrow
    //   166: iinc #6, 1
    //   169: aload_0
    //   170: aload_0
    //   171: getfield ZT : [C
    //   174: iload #6
    //   176: iload_1
    //   177: iload #9
    //   179: iload #7
    //   181: invokespecial Zd : ([CIICI)I
    //   184: istore #8
    //   186: iload_3
    //   187: ifne -> 31
    //   190: return
    // Exception table:
    //   from	to	target	type
    //   60	69	72	java/io/IOException
    //   65	82	85	java/io/IOException
    //   92	105	108	java/io/IOException
    //   122	148	151	java/io/IOException
    //   127	159	162	java/io/IOException
  }
  
  private void ZR(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3) throws IOException, Zm1 {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: iload_3
    //   4: iload_2
    //   5: iadd
    //   6: istore_3
    //   7: istore #5
    //   9: aload_0
    //   10: getfield Zp : [I
    //   13: astore #6
    //   15: aload #6
    //   17: arraylength
    //   18: iload #4
    //   20: iconst_1
    //   21: iadd
    //   22: invokestatic min : (II)I
    //   25: istore #7
    //   27: iconst_0
    //   28: istore #8
    //   30: iload_2
    //   31: iload_3
    //   32: if_icmpge -> 266
    //   35: iload_2
    //   36: istore #9
    //   38: aload_1
    //   39: iload_2
    //   40: caload
    //   41: istore #10
    //   43: iload #10
    //   45: iload #7
    //   47: if_icmpge -> 74
    //   50: aload #6
    //   52: iload #10
    //   54: iaload
    //   55: istore #8
    //   57: iload #8
    //   59: ifeq -> 96
    //   62: iload #5
    //   64: ifne -> 114
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   73: athrow
    //   74: iload #10
    //   76: iload #4
    //   78: if_icmple -> 96
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   87: athrow
    //   88: iconst_m1
    //   89: istore #8
    //   91: iload #5
    //   93: ifne -> 114
    //   96: iinc #2, 1
    //   99: iload_2
    //   100: iload_3
    //   101: if_icmplt -> 38
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   110: athrow
    //   111: goto -> 114
    //   114: iload_2
    //   115: iload #9
    //   117: isub
    //   118: istore #11
    //   120: iload #11
    //   122: bipush #32
    //   124: if_icmpge -> 203
    //   127: aload_0
    //   128: getfield Za : I
    //   131: iload #11
    //   133: iadd
    //   134: aload_0
    //   135: getfield Zi : I
    //   138: if_icmple -> 159
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   147: athrow
    //   148: aload_0
    //   149: invokevirtual ZD : ()V
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   158: athrow
    //   159: iload #11
    //   161: ifle -> 226
    //   164: aload_1
    //   165: iload #9
    //   167: aload_0
    //   168: getfield ZT : [C
    //   171: aload_0
    //   172: getfield Za : I
    //   175: iload #11
    //   177: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   180: aload_0
    //   181: dup
    //   182: getfield Za : I
    //   185: iload #11
    //   187: iadd
    //   188: putfield Za : I
    //   191: iload #5
    //   193: ifne -> 226
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   202: athrow
    //   203: aload_0
    //   204: invokevirtual ZD : ()V
    //   207: aload_0
    //   208: getfield ZZ : Ljava/io/Writer;
    //   211: aload_1
    //   212: iload #9
    //   214: iload #11
    //   216: invokevirtual write : ([CII)V
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   225: athrow
    //   226: iload_2
    //   227: iload_3
    //   228: if_icmplt -> 243
    //   231: iload #5
    //   233: ifne -> 266
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   242: athrow
    //   243: iinc #2, 1
    //   246: aload_0
    //   247: iload #10
    //   249: iload #8
    //   251: invokespecial ZO : (CI)V
    //   254: iload #5
    //   256: ifne -> 30
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   265: athrow
    //   266: return
    // Exception table:
    //   from	to	target	type
    //   57	67	70	java/io/IOException
    //   62	81	84	java/io/IOException
    //   91	104	107	java/io/IOException
    //   120	141	144	java/io/IOException
    //   127	152	155	java/io/IOException
    //   159	196	199	java/io/IOException
    //   164	219	222	java/io/IOException
    //   226	236	239	java/io/IOException
    //   231	259	262	java/io/IOException
  }
  
  private void Zq(int paramInt) throws IOException, Zm1 {
    int j = this.Za + paramInt;
    int[] arrayOfInt = this.Zp;
    int i = Zf.ZI();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte b = (this.ZM < 1) ? 65535 : this.ZM;
    int k = Math.min(arrayOfInt.length, b + 1);
    boolean bool = false;
    Zyh zyh = this.Zr;
    label47: while (this.Za < j) {
      char c;
      while (true) {
        while (true) {
          c = this.ZT[this.Za];
          break;
        } 
        if (++this.Za >= j) {
          if (i != 0)
            break; 
          break label47;
        } 
      } 
      int m = this.Za - this.ZN;
      try {
        if (m > 0)
          this.ZZ.write(this.ZT, this.ZN, m); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      this.Za++;
      Zv(c, bool);
      if (i != 0)
        break; 
    } 
  }
  
  private void ZL(int paramInt) throws IOException, Zm1 {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: getfield Zp : [I
    //   7: astore_3
    //   8: istore_2
    //   9: aload_0
    //   10: getfield ZM : I
    //   13: iconst_1
    //   14: if_icmpge -> 26
    //   17: ldc 65535
    //   19: goto -> 30
    //   22: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   25: athrow
    //   26: aload_0
    //   27: getfield ZM : I
    //   30: istore #4
    //   32: aload_3
    //   33: arraylength
    //   34: iload #4
    //   36: iconst_1
    //   37: iadd
    //   38: invokestatic min : (II)I
    //   41: istore #5
    //   43: aload_0
    //   44: getfield Zr : Lcom/fasterxml/Zyh;
    //   47: astore #6
    //   49: iconst_0
    //   50: istore #7
    //   52: iconst_0
    //   53: istore #8
    //   55: iload #7
    //   57: istore #9
    //   59: iload #7
    //   61: iload_1
    //   62: if_icmpge -> 248
    //   65: aload_0
    //   66: getfield ZT : [C
    //   69: iload #7
    //   71: caload
    //   72: istore #10
    //   74: iload #10
    //   76: iload #5
    //   78: if_icmpge -> 103
    //   81: aload_3
    //   82: iload #10
    //   84: iaload
    //   85: istore #8
    //   87: iload #8
    //   89: ifeq -> 154
    //   92: iload_2
    //   93: ifne -> 173
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: iload #10
    //   105: iload #4
    //   107: if_icmple -> 124
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   116: athrow
    //   117: iconst_m1
    //   118: istore #8
    //   120: iload_2
    //   121: ifne -> 173
    //   124: aload_0
    //   125: aload #6
    //   127: iload #10
    //   129: invokevirtual Zs : (I)Lcom/fasterxml/Zb/Zj;
    //   132: dup_x1
    //   133: putfield Zl : Lcom/fasterxml/Zb/Zj;
    //   136: ifnull -> 154
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: bipush #-2
    //   148: istore #8
    //   150: iload_2
    //   151: ifne -> 173
    //   154: iinc #7, 1
    //   157: iload #7
    //   159: iload_1
    //   160: if_icmplt -> 65
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   169: athrow
    //   170: goto -> 173
    //   173: iload #7
    //   175: iload #9
    //   177: isub
    //   178: istore #11
    //   180: iload #11
    //   182: ifle -> 224
    //   185: aload_0
    //   186: getfield ZZ : Ljava/io/Writer;
    //   189: aload_0
    //   190: getfield ZT : [C
    //   193: iload #9
    //   195: iload #11
    //   197: invokevirtual write : ([CII)V
    //   200: iload #7
    //   202: iload_1
    //   203: if_icmplt -> 224
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   212: athrow
    //   213: iload_2
    //   214: ifne -> 248
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   223: athrow
    //   224: iinc #7, 1
    //   227: aload_0
    //   228: aload_0
    //   229: getfield ZT : [C
    //   232: iload #7
    //   234: iload_1
    //   235: iload #10
    //   237: iload #8
    //   239: invokespecial Zd : ([CIICI)I
    //   242: istore #9
    //   244: iload_2
    //   245: ifne -> 59
    //   248: return
    // Exception table:
    //   from	to	target	type
    //   9	22	22	java/io/IOException
    //   87	96	99	java/io/IOException
    //   92	110	113	java/io/IOException
    //   120	139	142	java/io/IOException
    //   150	163	166	java/io/IOException
    //   180	206	209	java/io/IOException
    //   185	217	220	java/io/IOException
  }
  
  private void ZC(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException, Zm1 {
    // Byte code:
    //   0: iload_3
    //   1: iload_2
    //   2: iadd
    //   3: istore_3
    //   4: invokestatic ZH : ()I
    //   7: aload_0
    //   8: getfield Zp : [I
    //   11: astore #5
    //   13: istore #4
    //   15: aload_0
    //   16: getfield ZM : I
    //   19: iconst_1
    //   20: if_icmpge -> 32
    //   23: ldc 65535
    //   25: goto -> 36
    //   28: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   31: athrow
    //   32: aload_0
    //   33: getfield ZM : I
    //   36: istore #6
    //   38: aload #5
    //   40: arraylength
    //   41: iload #6
    //   43: iconst_1
    //   44: iadd
    //   45: invokestatic min : (II)I
    //   48: istore #7
    //   50: aload_0
    //   51: getfield Zr : Lcom/fasterxml/Zyh;
    //   54: astore #8
    //   56: iconst_0
    //   57: istore #9
    //   59: iload_2
    //   60: iload_3
    //   61: if_icmpge -> 326
    //   64: iload_2
    //   65: istore #10
    //   67: aload_1
    //   68: iload_2
    //   69: caload
    //   70: istore #11
    //   72: iload #11
    //   74: iload #7
    //   76: if_icmpge -> 103
    //   79: aload #5
    //   81: iload #11
    //   83: iaload
    //   84: istore #9
    //   86: iload #9
    //   88: ifeq -> 156
    //   91: iload #4
    //   93: ifne -> 174
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: iload #11
    //   105: iload #6
    //   107: if_icmple -> 125
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   116: athrow
    //   117: iconst_m1
    //   118: istore #9
    //   120: iload #4
    //   122: ifne -> 174
    //   125: aload_0
    //   126: aload #8
    //   128: iload #11
    //   130: invokevirtual Zs : (I)Lcom/fasterxml/Zb/Zj;
    //   133: dup_x1
    //   134: putfield Zl : Lcom/fasterxml/Zb/Zj;
    //   137: ifnull -> 156
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: bipush #-2
    //   149: istore #9
    //   151: iload #4
    //   153: ifne -> 174
    //   156: iinc #2, 1
    //   159: iload_2
    //   160: iload_3
    //   161: if_icmplt -> 67
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   170: athrow
    //   171: goto -> 174
    //   174: iload_2
    //   175: iload #10
    //   177: isub
    //   178: istore #12
    //   180: iload #12
    //   182: bipush #32
    //   184: if_icmpge -> 263
    //   187: aload_0
    //   188: getfield Za : I
    //   191: iload #12
    //   193: iadd
    //   194: aload_0
    //   195: getfield Zi : I
    //   198: if_icmple -> 219
    //   201: goto -> 208
    //   204: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   207: athrow
    //   208: aload_0
    //   209: invokevirtual ZD : ()V
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   218: athrow
    //   219: iload #12
    //   221: ifle -> 286
    //   224: aload_1
    //   225: iload #10
    //   227: aload_0
    //   228: getfield ZT : [C
    //   231: aload_0
    //   232: getfield Za : I
    //   235: iload #12
    //   237: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   240: aload_0
    //   241: dup
    //   242: getfield Za : I
    //   245: iload #12
    //   247: iadd
    //   248: putfield Za : I
    //   251: iload #4
    //   253: ifne -> 286
    //   256: goto -> 263
    //   259: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   262: athrow
    //   263: aload_0
    //   264: invokevirtual ZD : ()V
    //   267: aload_0
    //   268: getfield ZZ : Ljava/io/Writer;
    //   271: aload_1
    //   272: iload #10
    //   274: iload #12
    //   276: invokevirtual write : ([CII)V
    //   279: goto -> 286
    //   282: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   285: athrow
    //   286: iload_2
    //   287: iload_3
    //   288: if_icmplt -> 303
    //   291: iload #4
    //   293: ifne -> 326
    //   296: goto -> 303
    //   299: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   302: athrow
    //   303: iinc #2, 1
    //   306: aload_0
    //   307: iload #11
    //   309: iload #9
    //   311: invokespecial ZO : (CI)V
    //   314: iload #4
    //   316: ifne -> 59
    //   319: goto -> 326
    //   322: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   325: athrow
    //   326: return
    // Exception table:
    //   from	to	target	type
    //   15	28	28	java/io/IOException
    //   86	96	99	java/io/IOException
    //   91	110	113	java/io/IOException
    //   120	140	143	java/io/IOException
    //   151	164	167	java/io/IOException
    //   180	201	204	java/io/IOException
    //   187	212	215	java/io/IOException
    //   219	256	259	java/io/IOException
    //   224	279	282	java/io/IOException
    //   286	296	299	java/io/IOException
    //   291	319	322	java/io/IOException
  }
  
  protected final void ZW(Zy paramZy, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException, Zm1 {
    int j = paramInt2 - 3;
    int k = this.Zi - 6;
    int m = paramZy.ZZ() >> 2;
    int i = Zf.ZH();
    while (paramInt1 <= j) {
      try {
        if (this.Za > k)
          ZD(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      int i1 = paramArrayOfbyte[paramInt1++] << 8;
      i1 |= paramArrayOfbyte[paramInt1++] & 0xFF;
      i1 = i1 << 8 | paramArrayOfbyte[paramInt1++] & 0xFF;
      this.Za = paramZy.ZH(i1, this.ZT, this.Za);
      if (--m <= 0) {
        this.ZT[this.Za++] = '\\';
        this.ZT[this.Za++] = 'n';
        m = paramZy.ZZ() >> 2;
      } 
      if (i == 0)
        break; 
    } 
    int n = paramInt2 - paramInt1;
    try {
      if (n > 0) {
        try {
          if (this.Za > k)
            ZD(); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        int i1 = paramArrayOfbyte[paramInt1++] << 16;
        if (n == 2)
          i1 |= (paramArrayOfbyte[paramInt1++] & 0xFF) << 8; 
        this.Za = paramZy.Zt(i1, n, this.ZT, this.Za);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  protected final int Zg(Zy paramZy, InputStream paramInputStream, byte[] paramArrayOfbyte, int paramInt) throws IOException, Zm1 {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: iconst_0
    //   4: istore #6
    //   6: iconst_0
    //   7: istore #7
    //   9: bipush #-3
    //   11: istore #8
    //   13: aload_0
    //   14: getfield Zi : I
    //   17: bipush #6
    //   19: isub
    //   20: istore #9
    //   22: istore #5
    //   24: aload_1
    //   25: invokevirtual ZZ : ()I
    //   28: iconst_2
    //   29: ishr
    //   30: istore #10
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
    //   54: invokespecial Zl : (Ljava/io/InputStream;[BIII)I
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
    //   87: getfield Za : I
    //   90: iload #9
    //   92: if_icmple -> 106
    //   95: aload_0
    //   96: invokevirtual ZD : ()V
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
    //   161: getfield ZT : [C
    //   164: aload_0
    //   165: getfield Za : I
    //   168: invokevirtual ZH : (I[CI)I
    //   171: putfield Za : I
    //   174: iinc #10, -1
    //   177: iload #10
    //   179: ifgt -> 226
    //   182: aload_0
    //   183: getfield ZT : [C
    //   186: aload_0
    //   187: dup
    //   188: getfield Za : I
    //   191: dup_x1
    //   192: iconst_1
    //   193: iadd
    //   194: putfield Za : I
    //   197: bipush #92
    //   199: castore
    //   200: aload_0
    //   201: getfield ZT : [C
    //   204: aload_0
    //   205: dup
    //   206: getfield Za : I
    //   209: dup_x1
    //   210: iconst_1
    //   211: iadd
    //   212: putfield Za : I
    //   215: bipush #110
    //   217: castore
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
    //   245: invokespecial Zl : (Ljava/io/InputStream;[BIII)I
    //   248: istore #7
    //   250: iconst_0
    //   251: istore #6
    //   253: iload #7
    //   255: ifle -> 358
    //   258: aload_0
    //   259: getfield Za : I
    //   262: iload #9
    //   264: if_icmple -> 285
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   273: athrow
    //   274: aload_0
    //   275: invokevirtual ZD : ()V
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
    //   338: getfield ZT : [C
    //   341: aload_0
    //   342: getfield Za : I
    //   345: invokevirtual Zt : (II[CI)I
    //   348: putfield Za : I
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
  
  protected final int ZN(Zy paramZy, InputStream paramInputStream, byte[] paramArrayOfbyte) throws IOException, Zm1 {
    byte b = 0;
    int j = 0;
    int k = -3;
    int m = 0;
    int n = this.Zi - 6;
    int i = Zf.ZI();
    int i1 = paramZy.ZZ() >> 2;
    do {
      if (b > k) {
        j = Zl(paramInputStream, paramArrayOfbyte, b, j, paramArrayOfbyte.length);
        b = 0;
        try {
          if (j >= 3 || i != 0) {
            k = j - 3;
          } else {
            break;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
      try {
        if (this.Za > n)
          ZD(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      int i2 = paramArrayOfbyte[b++] << 8;
      i2 |= paramArrayOfbyte[b++] & 0xFF;
      i2 = i2 << 8 | paramArrayOfbyte[b++] & 0xFF;
      m += true;
      this.Za = paramZy.ZH(i2, this.ZT, this.Za);
      if (--i1 > 0)
        continue; 
      this.ZT[this.Za++] = '\\';
      this.ZT[this.Za++] = 'n';
      i1 = paramZy.ZZ() >> 2;
    } while (i == 0);
    try {
      if (b < j) {
        try {
          if (this.Za > n)
            ZD(); 
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
        this.Za = paramZy.Zt(i2, b1, this.ZT, this.Za);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return m;
  }
  
  private int Zl(InputStream paramInputStream, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) throws IOException {
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
  
  private final void Zv() throws IOException {
    try {
      if (this.Za + 4 >= this.Zi)
        ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = this.Za;
    char[] arrayOfChar = this.ZT;
    arrayOfChar[i] = 'n';
    arrayOfChar[++i] = 'u';
    arrayOfChar[++i] = 'l';
    arrayOfChar[++i] = 'l';
    this.Za = i + 1;
  }
  
  private void Zv(char paramChar, int paramInt) throws IOException, Zm1 {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_3
    //   4: iload_2
    //   5: iflt -> 102
    //   8: aload_0
    //   9: getfield Za : I
    //   12: iconst_2
    //   13: if_icmplt -> 59
    //   16: goto -> 23
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: aload_0
    //   24: getfield Za : I
    //   27: iconst_2
    //   28: isub
    //   29: istore #4
    //   31: aload_0
    //   32: iload #4
    //   34: putfield ZN : I
    //   37: aload_0
    //   38: getfield ZT : [C
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: bipush #92
    //   48: castore
    //   49: aload_0
    //   50: getfield ZT : [C
    //   53: iload #4
    //   55: iload_2
    //   56: i2c
    //   57: castore
    //   58: return
    //   59: aload_0
    //   60: getfield ZJ : [C
    //   63: astore #4
    //   65: aload #4
    //   67: ifnonnull -> 76
    //   70: aload_0
    //   71: invokespecial Z_ : ()[C
    //   74: astore #4
    //   76: aload_0
    //   77: aload_0
    //   78: getfield Za : I
    //   81: putfield ZN : I
    //   84: aload #4
    //   86: iconst_1
    //   87: iload_2
    //   88: i2c
    //   89: castore
    //   90: aload_0
    //   91: getfield ZZ : Ljava/io/Writer;
    //   94: aload #4
    //   96: iconst_0
    //   97: iconst_2
    //   98: invokevirtual write : ([CII)V
    //   101: return
    //   102: iload_2
    //   103: bipush #-2
    //   105: if_icmpeq -> 436
    //   108: aload_0
    //   109: invokespecial Zs : ()[C
    //   112: astore #4
    //   114: aload_0
    //   115: getfield Za : I
    //   118: bipush #6
    //   120: if_icmplt -> 277
    //   123: aload_0
    //   124: getfield ZT : [C
    //   127: astore #5
    //   129: aload_0
    //   130: getfield Za : I
    //   133: bipush #6
    //   135: isub
    //   136: istore #6
    //   138: aload_0
    //   139: iload #6
    //   141: putfield ZN : I
    //   144: aload #5
    //   146: iload #6
    //   148: bipush #92
    //   150: castore
    //   151: aload #5
    //   153: iinc #6, 1
    //   156: iload #6
    //   158: bipush #117
    //   160: castore
    //   161: iload_1
    //   162: sipush #255
    //   165: if_icmple -> 220
    //   168: iload_1
    //   169: bipush #8
    //   171: ishr
    //   172: sipush #255
    //   175: iand
    //   176: istore #7
    //   178: aload #5
    //   180: iinc #6, 1
    //   183: iload #6
    //   185: aload #4
    //   187: iload #7
    //   189: iconst_4
    //   190: ishr
    //   191: caload
    //   192: castore
    //   193: aload #5
    //   195: iinc #6, 1
    //   198: iload #6
    //   200: aload #4
    //   202: iload #7
    //   204: bipush #15
    //   206: iand
    //   207: caload
    //   208: castore
    //   209: iload_1
    //   210: sipush #255
    //   213: iand
    //   214: i2c
    //   215: istore_1
    //   216: iload_3
    //   217: ifeq -> 247
    //   220: aload #5
    //   222: iinc #6, 1
    //   225: iload #6
    //   227: bipush #48
    //   229: castore
    //   230: aload #5
    //   232: iinc #6, 1
    //   235: iload #6
    //   237: bipush #48
    //   239: castore
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   246: athrow
    //   247: aload #5
    //   249: iinc #6, 1
    //   252: iload #6
    //   254: aload #4
    //   256: iload_1
    //   257: iconst_4
    //   258: ishr
    //   259: caload
    //   260: castore
    //   261: aload #5
    //   263: iinc #6, 1
    //   266: iload #6
    //   268: aload #4
    //   270: iload_1
    //   271: bipush #15
    //   273: iand
    //   274: caload
    //   275: castore
    //   276: return
    //   277: aload_0
    //   278: getfield ZJ : [C
    //   281: astore #5
    //   283: aload #5
    //   285: ifnonnull -> 294
    //   288: aload_0
    //   289: invokespecial Z_ : ()[C
    //   292: astore #5
    //   294: aload_0
    //   295: aload_0
    //   296: getfield Za : I
    //   299: putfield ZN : I
    //   302: iload_1
    //   303: sipush #255
    //   306: if_icmple -> 393
    //   309: iload_1
    //   310: bipush #8
    //   312: ishr
    //   313: sipush #255
    //   316: iand
    //   317: istore #6
    //   319: iload_1
    //   320: sipush #255
    //   323: iand
    //   324: istore #7
    //   326: aload #5
    //   328: bipush #10
    //   330: aload #4
    //   332: iload #6
    //   334: iconst_4
    //   335: ishr
    //   336: caload
    //   337: castore
    //   338: aload #5
    //   340: bipush #11
    //   342: aload #4
    //   344: iload #6
    //   346: bipush #15
    //   348: iand
    //   349: caload
    //   350: castore
    //   351: aload #5
    //   353: bipush #12
    //   355: aload #4
    //   357: iload #7
    //   359: iconst_4
    //   360: ishr
    //   361: caload
    //   362: castore
    //   363: aload #5
    //   365: bipush #13
    //   367: aload #4
    //   369: iload #7
    //   371: bipush #15
    //   373: iand
    //   374: caload
    //   375: castore
    //   376: aload_0
    //   377: getfield ZZ : Ljava/io/Writer;
    //   380: aload #5
    //   382: bipush #8
    //   384: bipush #6
    //   386: invokevirtual write : ([CII)V
    //   389: iload_3
    //   390: ifeq -> 435
    //   393: aload #5
    //   395: bipush #6
    //   397: aload #4
    //   399: iload_1
    //   400: iconst_4
    //   401: ishr
    //   402: caload
    //   403: castore
    //   404: aload #5
    //   406: bipush #7
    //   408: aload #4
    //   410: iload_1
    //   411: bipush #15
    //   413: iand
    //   414: caload
    //   415: castore
    //   416: aload_0
    //   417: getfield ZZ : Ljava/io/Writer;
    //   420: aload #5
    //   422: iconst_2
    //   423: bipush #6
    //   425: invokevirtual write : ([CII)V
    //   428: goto -> 435
    //   431: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   434: athrow
    //   435: return
    //   436: aload_0
    //   437: getfield Zl : Lcom/fasterxml/Zb/Zj;
    //   440: ifnonnull -> 462
    //   443: aload_0
    //   444: getfield Zr : Lcom/fasterxml/Zyh;
    //   447: iload_1
    //   448: invokevirtual Zs : (I)Lcom/fasterxml/Zb/Zj;
    //   451: invokeinterface ZV : ()Ljava/lang/String;
    //   456: astore #4
    //   458: iload_3
    //   459: ifeq -> 478
    //   462: aload_0
    //   463: getfield Zl : Lcom/fasterxml/Zb/Zj;
    //   466: invokeinterface ZV : ()Ljava/lang/String;
    //   471: astore #4
    //   473: aload_0
    //   474: aconst_null
    //   475: putfield Zl : Lcom/fasterxml/Zb/Zj;
    //   478: aload #4
    //   480: invokevirtual length : ()I
    //   483: istore #5
    //   485: aload_0
    //   486: getfield Za : I
    //   489: iload #5
    //   491: if_icmplt -> 524
    //   494: aload_0
    //   495: getfield Za : I
    //   498: iload #5
    //   500: isub
    //   501: istore #6
    //   503: aload_0
    //   504: iload #6
    //   506: putfield ZN : I
    //   509: aload #4
    //   511: iconst_0
    //   512: iload #5
    //   514: aload_0
    //   515: getfield ZT : [C
    //   518: iload #6
    //   520: invokevirtual getChars : (II[CI)V
    //   523: return
    //   524: aload_0
    //   525: aload_0
    //   526: getfield Za : I
    //   529: putfield ZN : I
    //   532: aload_0
    //   533: getfield ZZ : Ljava/io/Writer;
    //   536: aload #4
    //   538: invokevirtual write : (Ljava/lang/String;)V
    //   541: return
    // Exception table:
    //   from	to	target	type
    //   4	16	19	java/io/IOException
    //   216	240	243	java/io/IOException
    //   326	428	431	java/io/IOException
  }
  
  private int Zd(char[] paramArrayOfchar, int paramInt1, int paramInt2, char paramChar, int paramInt3) throws IOException, Zm1 {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore #6
    //   5: iload #5
    //   7: iflt -> 99
    //   10: iload_2
    //   11: iconst_1
    //   12: if_icmple -> 62
    //   15: goto -> 22
    //   18: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   21: athrow
    //   22: iload_2
    //   23: iload_3
    //   24: if_icmpge -> 62
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: iinc #2, -2
    //   37: aload_1
    //   38: iload_2
    //   39: bipush #92
    //   41: castore
    //   42: aload_1
    //   43: iload_2
    //   44: iconst_1
    //   45: iadd
    //   46: iload #5
    //   48: i2c
    //   49: castore
    //   50: iload #6
    //   52: ifne -> 97
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_0
    //   63: getfield ZJ : [C
    //   66: astore #7
    //   68: aload #7
    //   70: ifnonnull -> 79
    //   73: aload_0
    //   74: invokespecial Z_ : ()[C
    //   77: astore #7
    //   79: aload #7
    //   81: iconst_1
    //   82: iload #5
    //   84: i2c
    //   85: castore
    //   86: aload_0
    //   87: getfield ZZ : Ljava/io/Writer;
    //   90: aload #7
    //   92: iconst_0
    //   93: iconst_2
    //   94: invokevirtual write : ([CII)V
    //   97: iload_2
    //   98: ireturn
    //   99: iload #5
    //   101: bipush #-2
    //   103: if_icmpeq -> 436
    //   106: aload_0
    //   107: invokespecial Zs : ()[C
    //   110: astore #7
    //   112: iload_2
    //   113: iconst_5
    //   114: if_icmple -> 270
    //   117: iload_2
    //   118: iload_3
    //   119: if_icmpge -> 270
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   128: athrow
    //   129: iinc #2, -6
    //   132: aload_1
    //   133: iload_2
    //   134: iinc #2, 1
    //   137: bipush #92
    //   139: castore
    //   140: aload_1
    //   141: iload_2
    //   142: iinc #2, 1
    //   145: bipush #117
    //   147: castore
    //   148: iload #4
    //   150: sipush #255
    //   153: if_icmple -> 215
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   162: athrow
    //   163: iload #4
    //   165: bipush #8
    //   167: ishr
    //   168: sipush #255
    //   171: iand
    //   172: istore #8
    //   174: aload_1
    //   175: iload_2
    //   176: iinc #2, 1
    //   179: aload #7
    //   181: iload #8
    //   183: iconst_4
    //   184: ishr
    //   185: caload
    //   186: castore
    //   187: aload_1
    //   188: iload_2
    //   189: iinc #2, 1
    //   192: aload #7
    //   194: iload #8
    //   196: bipush #15
    //   198: iand
    //   199: caload
    //   200: castore
    //   201: iload #4
    //   203: sipush #255
    //   206: iand
    //   207: i2c
    //   208: istore #4
    //   210: iload #6
    //   212: ifne -> 238
    //   215: aload_1
    //   216: iload_2
    //   217: iinc #2, 1
    //   220: bipush #48
    //   222: castore
    //   223: aload_1
    //   224: iload_2
    //   225: iinc #2, 1
    //   228: bipush #48
    //   230: castore
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   237: athrow
    //   238: aload_1
    //   239: iload_2
    //   240: iinc #2, 1
    //   243: aload #7
    //   245: iload #4
    //   247: iconst_4
    //   248: ishr
    //   249: caload
    //   250: castore
    //   251: aload_1
    //   252: iload_2
    //   253: aload #7
    //   255: iload #4
    //   257: bipush #15
    //   259: iand
    //   260: caload
    //   261: castore
    //   262: iinc #2, -5
    //   265: iload #6
    //   267: ifne -> 434
    //   270: aload_0
    //   271: getfield ZJ : [C
    //   274: astore #8
    //   276: aload #8
    //   278: ifnonnull -> 287
    //   281: aload_0
    //   282: invokespecial Z_ : ()[C
    //   285: astore #8
    //   287: aload_0
    //   288: aload_0
    //   289: getfield Za : I
    //   292: putfield ZN : I
    //   295: iload #4
    //   297: sipush #255
    //   300: if_icmple -> 390
    //   303: iload #4
    //   305: bipush #8
    //   307: ishr
    //   308: sipush #255
    //   311: iand
    //   312: istore #9
    //   314: iload #4
    //   316: sipush #255
    //   319: iand
    //   320: istore #10
    //   322: aload #8
    //   324: bipush #10
    //   326: aload #7
    //   328: iload #9
    //   330: iconst_4
    //   331: ishr
    //   332: caload
    //   333: castore
    //   334: aload #8
    //   336: bipush #11
    //   338: aload #7
    //   340: iload #9
    //   342: bipush #15
    //   344: iand
    //   345: caload
    //   346: castore
    //   347: aload #8
    //   349: bipush #12
    //   351: aload #7
    //   353: iload #10
    //   355: iconst_4
    //   356: ishr
    //   357: caload
    //   358: castore
    //   359: aload #8
    //   361: bipush #13
    //   363: aload #7
    //   365: iload #10
    //   367: bipush #15
    //   369: iand
    //   370: caload
    //   371: castore
    //   372: aload_0
    //   373: getfield ZZ : Ljava/io/Writer;
    //   376: aload #8
    //   378: bipush #8
    //   380: bipush #6
    //   382: invokevirtual write : ([CII)V
    //   385: iload #6
    //   387: ifne -> 434
    //   390: aload #8
    //   392: bipush #6
    //   394: aload #7
    //   396: iload #4
    //   398: iconst_4
    //   399: ishr
    //   400: caload
    //   401: castore
    //   402: aload #8
    //   404: bipush #7
    //   406: aload #7
    //   408: iload #4
    //   410: bipush #15
    //   412: iand
    //   413: caload
    //   414: castore
    //   415: aload_0
    //   416: getfield ZZ : Ljava/io/Writer;
    //   419: aload #8
    //   421: iconst_2
    //   422: bipush #6
    //   424: invokevirtual write : ([CII)V
    //   427: goto -> 434
    //   430: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   433: athrow
    //   434: iload_2
    //   435: ireturn
    //   436: aload_0
    //   437: getfield Zl : Lcom/fasterxml/Zb/Zj;
    //   440: ifnonnull -> 464
    //   443: aload_0
    //   444: getfield Zr : Lcom/fasterxml/Zyh;
    //   447: iload #4
    //   449: invokevirtual Zs : (I)Lcom/fasterxml/Zb/Zj;
    //   452: invokeinterface ZV : ()Ljava/lang/String;
    //   457: astore #7
    //   459: iload #6
    //   461: ifne -> 480
    //   464: aload_0
    //   465: getfield Zl : Lcom/fasterxml/Zb/Zj;
    //   468: invokeinterface ZV : ()Ljava/lang/String;
    //   473: astore #7
    //   475: aload_0
    //   476: aconst_null
    //   477: putfield Zl : Lcom/fasterxml/Zb/Zj;
    //   480: aload #7
    //   482: invokevirtual length : ()I
    //   485: istore #8
    //   487: iload_2
    //   488: iload #8
    //   490: if_icmplt -> 525
    //   493: iload_2
    //   494: iload_3
    //   495: if_icmpge -> 525
    //   498: goto -> 505
    //   501: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   504: athrow
    //   505: iload_2
    //   506: iload #8
    //   508: isub
    //   509: istore_2
    //   510: aload #7
    //   512: iconst_0
    //   513: iload #8
    //   515: aload_1
    //   516: iload_2
    //   517: invokevirtual getChars : (II[CI)V
    //   520: iload #6
    //   522: ifne -> 541
    //   525: aload_0
    //   526: getfield ZZ : Ljava/io/Writer;
    //   529: aload #7
    //   531: invokevirtual write : (Ljava/lang/String;)V
    //   534: goto -> 541
    //   537: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   540: athrow
    //   541: iload_2
    //   542: ireturn
    // Exception table:
    //   from	to	target	type
    //   5	15	18	java/io/IOException
    //   10	27	30	java/io/IOException
    //   22	55	58	java/io/IOException
    //   112	122	125	java/io/IOException
    //   117	156	159	java/io/IOException
    //   210	231	234	java/io/IOException
    //   322	427	430	java/io/IOException
    //   487	498	501	java/io/IOException
    //   510	534	537	java/io/IOException
  }
  
  private void ZO(char paramChar, int paramInt) throws IOException, Zm1 {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_3
    //   4: iload_2
    //   5: iflt -> 76
    //   8: aload_0
    //   9: getfield Za : I
    //   12: iconst_2
    //   13: iadd
    //   14: aload_0
    //   15: getfield Zi : I
    //   18: if_icmple -> 39
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: aload_0
    //   29: invokevirtual ZD : ()V
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   38: athrow
    //   39: aload_0
    //   40: getfield ZT : [C
    //   43: aload_0
    //   44: dup
    //   45: getfield Za : I
    //   48: dup_x1
    //   49: iconst_1
    //   50: iadd
    //   51: putfield Za : I
    //   54: bipush #92
    //   56: castore
    //   57: aload_0
    //   58: getfield ZT : [C
    //   61: aload_0
    //   62: dup
    //   63: getfield Za : I
    //   66: dup_x1
    //   67: iconst_1
    //   68: iadd
    //   69: putfield Za : I
    //   72: iload_2
    //   73: i2c
    //   74: castore
    //   75: return
    //   76: iload_2
    //   77: bipush #-2
    //   79: if_icmpeq -> 273
    //   82: aload_0
    //   83: getfield Za : I
    //   86: iconst_5
    //   87: iadd
    //   88: aload_0
    //   89: getfield Zi : I
    //   92: if_icmplt -> 113
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: aload_0
    //   103: invokevirtual ZD : ()V
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   112: athrow
    //   113: aload_0
    //   114: getfield Za : I
    //   117: istore #4
    //   119: aload_0
    //   120: getfield ZT : [C
    //   123: astore #5
    //   125: aload_0
    //   126: invokespecial Zs : ()[C
    //   129: astore #6
    //   131: aload #5
    //   133: iload #4
    //   135: iinc #4, 1
    //   138: bipush #92
    //   140: castore
    //   141: aload #5
    //   143: iload #4
    //   145: iinc #4, 1
    //   148: bipush #117
    //   150: castore
    //   151: iload_1
    //   152: sipush #255
    //   155: if_icmple -> 210
    //   158: iload_1
    //   159: bipush #8
    //   161: ishr
    //   162: sipush #255
    //   165: iand
    //   166: istore #7
    //   168: aload #5
    //   170: iload #4
    //   172: iinc #4, 1
    //   175: aload #6
    //   177: iload #7
    //   179: iconst_4
    //   180: ishr
    //   181: caload
    //   182: castore
    //   183: aload #5
    //   185: iload #4
    //   187: iinc #4, 1
    //   190: aload #6
    //   192: iload #7
    //   194: bipush #15
    //   196: iand
    //   197: caload
    //   198: castore
    //   199: iload_1
    //   200: sipush #255
    //   203: iand
    //   204: i2c
    //   205: istore_1
    //   206: iload_3
    //   207: ifeq -> 237
    //   210: aload #5
    //   212: iload #4
    //   214: iinc #4, 1
    //   217: bipush #48
    //   219: castore
    //   220: aload #5
    //   222: iload #4
    //   224: iinc #4, 1
    //   227: bipush #48
    //   229: castore
    //   230: goto -> 237
    //   233: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   236: athrow
    //   237: aload #5
    //   239: iload #4
    //   241: iinc #4, 1
    //   244: aload #6
    //   246: iload_1
    //   247: iconst_4
    //   248: ishr
    //   249: caload
    //   250: castore
    //   251: aload #5
    //   253: iload #4
    //   255: iinc #4, 1
    //   258: aload #6
    //   260: iload_1
    //   261: bipush #15
    //   263: iand
    //   264: caload
    //   265: castore
    //   266: aload_0
    //   267: iload #4
    //   269: putfield Za : I
    //   272: return
    //   273: aload_0
    //   274: getfield Zl : Lcom/fasterxml/Zb/Zj;
    //   277: ifnonnull -> 299
    //   280: aload_0
    //   281: getfield Zr : Lcom/fasterxml/Zyh;
    //   284: iload_1
    //   285: invokevirtual Zs : (I)Lcom/fasterxml/Zb/Zj;
    //   288: invokeinterface ZV : ()Ljava/lang/String;
    //   293: astore #4
    //   295: iload_3
    //   296: ifeq -> 315
    //   299: aload_0
    //   300: getfield Zl : Lcom/fasterxml/Zb/Zj;
    //   303: invokeinterface ZV : ()Ljava/lang/String;
    //   308: astore #4
    //   310: aload_0
    //   311: aconst_null
    //   312: putfield Zl : Lcom/fasterxml/Zb/Zj;
    //   315: aload #4
    //   317: invokevirtual length : ()I
    //   320: istore #5
    //   322: aload_0
    //   323: getfield Za : I
    //   326: iload #5
    //   328: iadd
    //   329: aload_0
    //   330: getfield Zi : I
    //   333: if_icmple -> 370
    //   336: aload_0
    //   337: invokevirtual ZD : ()V
    //   340: iload #5
    //   342: aload_0
    //   343: getfield Zi : I
    //   346: if_icmple -> 370
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   355: athrow
    //   356: aload_0
    //   357: getfield ZZ : Ljava/io/Writer;
    //   360: aload #4
    //   362: invokevirtual write : (Ljava/lang/String;)V
    //   365: return
    //   366: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   369: athrow
    //   370: aload #4
    //   372: iconst_0
    //   373: iload #5
    //   375: aload_0
    //   376: getfield ZT : [C
    //   379: aload_0
    //   380: getfield Za : I
    //   383: invokevirtual getChars : (II[CI)V
    //   386: aload_0
    //   387: dup
    //   388: getfield Za : I
    //   391: iload #5
    //   393: iadd
    //   394: putfield Za : I
    //   397: return
    // Exception table:
    //   from	to	target	type
    //   4	21	24	java/io/IOException
    //   8	32	35	java/io/IOException
    //   76	95	98	java/io/IOException
    //   82	106	109	java/io/IOException
    //   206	230	233	java/io/IOException
    //   322	349	352	java/io/IOException
    //   336	366	366	java/io/IOException
  }
  
  private char[] Z_() {
    char[] arrayOfChar = new char[14];
    arrayOfChar[0] = '\\';
    arrayOfChar[2] = '\\';
    arrayOfChar[3] = 'u';
    arrayOfChar[4] = '0';
    arrayOfChar[5] = '0';
    arrayOfChar[8] = '\\';
    arrayOfChar[9] = 'u';
    this.ZJ = arrayOfChar;
    return arrayOfChar;
  }
  
  protected void ZD() throws IOException {
    int i = this.Za - this.ZN;
    if (i > 0) {
      int j = this.ZN;
      this.Za = this.ZN = 0;
      this.ZZ.write(this.ZT, j, i);
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '»pÈä4Éöë¾E«¡MètB¾*hTK%¡zNùì/à6"¢[-æ¨H%uÃ©ûãX þeÅsèÛjtT\\n'Éïjf­Þ/]Bbý-2Ñ2 @¨"Ã8 `Ö+Ú¨_Ê»ì é9Þ<Ï?Too;§üM0´ÉZëùÈXFo:!þ¸,¶q|Ø¬sËüÜßl÷äÃ­|F*tYÛcIQSëæXwÁ4óËËG~ngJÛ6ºy½â0zç¡Úý3nî±®è*C×ÍºN?³qK*dà0 SFH"eö\\ní·(eÄrO¬R\\rñ\\tÿþ÷¯1¾Êreá¾Î<¿¹kÊÜz'ö-ÒÒåfB(úw\\rO!ZÓUu3[\\nÆ¹¦#ÜÇÞ:\\t9td­W¤¢ö>1xÌ"Ì4Gú_±ÍÿÑ.Næ:¯'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #12
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #107
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
    //   68: ldc '!Ü³rÊ5ZÏ&àÖëÏâøÌ/ñ/ÇªÊ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #14
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #18
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
    //   129: putstatic com/fasterxml/Zq/Zc.f : [Ljava/lang/String;
    //   132: bipush #18
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zq/Zc.g : [Ljava/lang/String;
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
    //   212: bipush #17
    //   214: goto -> 244
    //   217: bipush #53
    //   219: goto -> 244
    //   222: bipush #21
    //   224: goto -> 244
    //   227: bipush #87
    //   229: goto -> 244
    //   232: bipush #111
    //   234: goto -> 244
    //   237: bipush #27
    //   239: goto -> 244
    //   242: bipush #22
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
    //   301: invokestatic Zo : (Z)[C
    //   304: putstatic com/fasterxml/Zq/Zc.Zv : [C
    //   307: iconst_0
    //   308: invokestatic Zo : (Z)[C
    //   311: putstatic com/fasterxml/Zq/Zc.Zm : [C
    //   314: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String c(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x712) & 0xFFFF;
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
      char c = 'ù';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq\Zc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */