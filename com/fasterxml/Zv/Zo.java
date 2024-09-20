package com.fasterxml.Zv;

import burp.Zbqc;
import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zi;
import com.fasterxml.Zb.Zj;
import com.fasterxml.Zb.Zm1;
import com.fasterxml.Zb.Zmd;
import com.fasterxml.Zb.Zmk;
import com.fasterxml.Zb.Zmw;
import com.fasterxml.Zb.Zp;
import com.fasterxml.Zb.Zr;
import com.fasterxml.Zb.Zy;
import com.fasterxml.Zoi.Zm;
import com.fasterxml.Zoi.Zp;
import com.fasterxml.Zv9;
import com.fasterxml.Zx.Zv;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import org.yaml.Z_k;
import org.yaml.Zb;
import org.yaml.Zgr;
import org.yaml.Zjm;
import org.yaml.Zjv;
import org.yaml.Zl3;
import org.yaml.Zl4;
import org.yaml.Zl5;
import org.yaml.Zl8;
import org.yaml.Zl_;
import org.yaml.Zla;
import org.yaml.Zle;
import org.yaml.Zlu;
import org.yaml.Zlv;
import org.yaml.Zp;
import org.yaml.Zth;

public class Zo extends Zv {
  protected static final Pattern Zr;
  
  protected static final String ZT;
  
  protected final Zr ZJ;
  
  protected int Zg;
  
  protected Writer Zj;
  
  protected Z_k ZR;
  
  protected final Zjv ZH;
  
  private static final Zjm Zc;
  
  private static final Zjm ZG;
  
  private static final Zjm Zs;
  
  private static final Zjm ZZ;
  
  private static final Zjm Zi;
  
  private static final Zjm Zx;
  
  protected Zb ZO;
  
  protected String ZP;
  
  protected String ZM;
  
  protected final Zp Zv;
  
  private static final Zgr Zm;
  
  private static final Zgr Zl;
  
  private static final String[] e;
  
  private static final String[] f;
  
  public Zo(Zv9 paramZv9, int paramInt1, int paramInt2, Zp paramZp, Zmd paramZmd, Writer paramWriter, Zjv paramZjv) throws IOException {
    super(paramInt1, paramZmd, paramZv9);
    this.ZJ = paramZv9.Zz();
    this.Zg = paramInt2;
    boolean bool = Zu.Zr();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      this.Zv = (paramZp == null) ? (Zp)Zm.Zh() : paramZp;
      this.Zj = paramWriter;
      this.ZH = paramZjv;
      this.ZR = Za(paramInt1, paramInt2, paramZjv);
      this.ZO = new Zb(this.Zj, this.ZR);
      ZW((Zlv)new Zth(null, null));
      ZG();
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (IOException iOException) {
          throw a(null);
        } 
        Zu.Zz(!bool);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public Zo(Zv9 paramZv9, int paramInt1, int paramInt2, Zp paramZp, Zmd paramZmd, Writer paramWriter, Z_k paramZ_k) throws IOException {
    super(paramInt1, paramZmd, paramZv9);
    this.ZJ = paramZv9.Zz();
    this.Zg = paramInt2;
    this.Zv = (paramZp == null) ? (Zp)Zm.Zh() : paramZp;
    this.Zj = paramWriter;
    this.ZH = paramZ_k.ZI();
    this.ZR = paramZ_k;
    this.ZO = new Zb(this.Zj, this.ZR);
    ZW((Zlv)new Zth(null, null));
    ZG();
  }
  
  protected Z_k Za(int paramInt1, int paramInt2, Zjv paramZjv) {
    // Byte code:
    //   0: invokestatic Zr : ()Z
    //   3: new org/yaml/Z_k
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore #5
    //   12: istore #4
    //   14: getstatic com/fasterxml/Zv/Zu.CANONICAL_OUTPUT : Lcom/fasterxml/Zv/Zu;
    //   17: aload_0
    //   18: getfield Zg : I
    //   21: invokevirtual ZR : (I)Z
    //   24: ifeq -> 45
    //   27: aload #5
    //   29: iconst_1
    //   30: invokevirtual ZO : (Z)V
    //   33: iload #4
    //   35: ifne -> 66
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: aload #5
    //   47: iconst_0
    //   48: invokevirtual ZO : (Z)V
    //   51: aload #5
    //   53: getstatic org/yaml/Zp.BLOCK : Lorg/yaml/Zp;
    //   56: invokevirtual ZE : (Lorg/yaml/Zp;)V
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   65: athrow
    //   66: aload #5
    //   68: getstatic com/fasterxml/Zv/Zu.SPLIT_LINES : Lcom/fasterxml/Zv/Zu;
    //   71: aload_0
    //   72: getfield Zg : I
    //   75: invokevirtual ZR : (I)Z
    //   78: invokevirtual ZG : (Z)V
    //   81: getstatic com/fasterxml/Zv/Zu.INDENT_ARRAYS : Lcom/fasterxml/Zv/Zu;
    //   84: aload_0
    //   85: getfield Zg : I
    //   88: invokevirtual ZR : (I)Z
    //   91: ifeq -> 113
    //   94: aload #5
    //   96: iconst_1
    //   97: invokevirtual ZM : (I)V
    //   100: aload #5
    //   102: iconst_2
    //   103: invokevirtual Zt : (I)V
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   112: athrow
    //   113: getstatic com/fasterxml/Zv/Zu.INDENT_ARRAYS_WITH_INDICATOR : Lcom/fasterxml/Zv/Zu;
    //   116: aload_0
    //   117: getfield Zg : I
    //   120: invokevirtual ZR : (I)Z
    //   123: ifeq -> 145
    //   126: aload #5
    //   128: iconst_2
    //   129: invokevirtual ZM : (I)V
    //   132: aload #5
    //   134: iconst_1
    //   135: invokevirtual Zz : (Z)V
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   144: athrow
    //   145: getstatic com/fasterxml/Zv/Zu.USE_PLATFORM_LINE_BREAKS : Lcom/fasterxml/Zv/Zu;
    //   148: aload_0
    //   149: getfield Zg : I
    //   152: invokevirtual ZR : (I)Z
    //   155: ifeq -> 173
    //   158: aload #5
    //   160: invokestatic ZG : ()Lorg/yaml/Ztz;
    //   163: invokevirtual Zk : (Lorg/yaml/Ztz;)V
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   172: athrow
    //   173: getstatic com/fasterxml/Zv/Zu.ALLOW_LONG_KEYS : Lcom/fasterxml/Zv/Zu;
    //   176: aload_0
    //   177: getfield Zg : I
    //   180: invokevirtual ZR : (I)Z
    //   183: ifeq -> 201
    //   186: aload #5
    //   188: sipush #1024
    //   191: invokevirtual ZS : (I)V
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   200: athrow
    //   201: aload #5
    //   203: areturn
    // Exception table:
    //   from	to	target	type
    //   14	38	41	java/lang/UnsupportedOperationException
    //   27	59	62	java/lang/UnsupportedOperationException
    //   66	106	109	java/lang/UnsupportedOperationException
    //   113	138	141	java/lang/UnsupportedOperationException
    //   145	166	169	java/lang/UnsupportedOperationException
    //   173	194	197	java/lang/UnsupportedOperationException
  }
  
  public Zr ZV() {
    return this.ZJ;
  }
  
  public Zmk version() {
    return Zk.Zr;
  }
  
  public Zo ZT(Zp paramZp) {
    return this;
  }
  
  public Zf Za(int paramInt1, int paramInt2) {
    this.Zg = this.Zg & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2;
    return (Zf)this;
  }
  
  public final void ZY(String paramString) throws IOException {
    try {
      if (this.Zo.Zc(paramString) == 4)
        Zr(c(21064, -3189)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZZ(paramString);
  }
  
  public final void Zm(Zj paramZj) throws IOException {
    try {
      if (this.Zo.Zc(paramZj.ZV()) == 4)
        Zr(c(21078, 21500)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZZ(paramZj.ZV());
  }
  
  public void ZI(long paramLong) throws IOException {
    String str = Long.valueOf(paramLong).toString();
    try {
      if (this.Zo.Zc(str) == 4)
        Zr(c(21071, 5459)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZM(str, c(21075, -13480), ZG);
  }
  
  private final void ZZ(String paramString) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZM(paramString, c(21061, -5690), this.Zv.ZA(paramString) ? Zs : Zc);
  }
  
  public final void flush() throws IOException {
    try {
      if (Za(Zi.FLUSH_PASSED_TO_STREAM))
        this.Zj.flush(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public void close() throws IOException {
    // Byte code:
    //   0: invokestatic Zr : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: invokevirtual ZU : ()Z
    //   8: ifne -> 129
    //   11: aload_0
    //   12: invokevirtual Zs : ()V
    //   15: aload_0
    //   16: new org/yaml/Zt6
    //   19: dup
    //   20: aconst_null
    //   21: aconst_null
    //   22: invokespecial <init> : (Lorg/yaml/Zt1;Lorg/yaml/Zt1;)V
    //   25: invokevirtual ZW : (Lorg/yaml/Zlv;)V
    //   28: aload_0
    //   29: getfield Zj : Ljava/io/Writer;
    //   32: ifnull -> 125
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   41: athrow
    //   42: aload_0
    //   43: getfield Zb : Lcom/fasterxml/Zv9;
    //   46: invokevirtual Z_ : ()Z
    //   49: ifne -> 76
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   58: athrow
    //   59: aload_0
    //   60: getstatic com/fasterxml/Zb/Zi.AUTO_CLOSE_TARGET : Lcom/fasterxml/Zb/Zi;
    //   63: invokevirtual Za : (Lcom/fasterxml/Zb/Zi;)Z
    //   66: ifeq -> 94
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   75: athrow
    //   76: aload_0
    //   77: getfield Zj : Ljava/io/Writer;
    //   80: invokevirtual close : ()V
    //   83: iload_1
    //   84: ifne -> 125
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: aload_0
    //   95: getstatic com/fasterxml/Zb/Zi.FLUSH_PASSED_TO_STREAM : Lcom/fasterxml/Zb/Zi;
    //   98: invokevirtual Za : (Lcom/fasterxml/Zb/Zi;)Z
    //   101: ifeq -> 125
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   110: athrow
    //   111: aload_0
    //   112: getfield Zj : Ljava/io/Writer;
    //   115: invokevirtual flush : ()V
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: aload_0
    //   126: invokespecial close : ()V
    //   129: return
    // Exception table:
    //   from	to	target	type
    //   4	35	38	java/io/IOException
    //   11	52	55	java/io/IOException
    //   42	69	72	java/io/IOException
    //   59	87	90	java/io/IOException
    //   76	104	107	java/io/IOException
    //   94	118	121	java/io/IOException
  }
  
  public final void Zd() throws IOException {
    Zk(c(21067, -26581));
    this.Zo = this.Zo.Ze();
    this.ZJ.Zj(this.Zo.Zs());
    Zp zp = this.ZR.ZF();
    String str1 = this.ZM;
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool = (str1 == null) ? true : false;
    String str2 = this.ZP;
    try {
      if (str2 != null)
        this.ZP = null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZW((Zlv)new Zla(str2, str1, bool, null, null, zp));
  }
  
  public final void ZI() throws IOException {
    try {
      if (!this.Zo.Zo())
        Zr(c(21058, -17184) + this.Zo.ZF()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZM = null;
    this.Zo = this.Zo.ZJ();
    ZW((Zlv)new Zlu(null, null));
  }
  
  public final void ZJ() throws IOException {
    Zk(c(21086, -32229));
    this.Zo = this.Zo.ZD();
    this.ZJ.Zj(this.Zo.Zs());
    Zp zp = this.ZR.ZF();
    String str1 = this.ZM;
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool = (str1 == null) ? true : false;
    String str2 = this.ZP;
    try {
      if (str2 != null)
        this.ZP = null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZW((Zlv)new Zl3(str2, str1, bool, null, null, zp));
  }
  
  public final void Zh() throws IOException {
    try {
      if (!this.Zo.ZQ())
        Zr(c(21073, -21768) + this.Zo.ZF()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZM = null;
    this.Zo = this.Zo.ZJ();
    ZW((Zlv)new Zl5(null, null));
  }
  
  public void ZD(String paramString) throws IOException, Zm1 {
    // Byte code:
    //   0: invokestatic Zr : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: ifnonnull -> 17
    //   8: aload_0
    //   9: invokevirtual ZT : ()V
    //   12: return
    //   13: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   16: athrow
    //   17: aload_0
    //   18: sipush #21080
    //   21: sipush #31538
    //   24: invokestatic c : (II)Ljava/lang/String;
    //   27: invokevirtual Zk : (Ljava/lang/String;)V
    //   30: aload_1
    //   31: invokevirtual isEmpty : ()Z
    //   34: ifeq -> 59
    //   37: aload_0
    //   38: aload_1
    //   39: sipush #21077
    //   42: sipush #5676
    //   45: invokestatic c : (II)Ljava/lang/String;
    //   48: getstatic com/fasterxml/Zv/Zo.Zs : Lorg/yaml/Zjm;
    //   51: invokevirtual ZM : (Ljava/lang/String;Ljava/lang/String;Lorg/yaml/Zjm;)V
    //   54: return
    //   55: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   58: athrow
    //   59: getstatic com/fasterxml/Zv/Zu.MINIMIZE_QUOTES : Lcom/fasterxml/Zv/Zu;
    //   62: aload_0
    //   63: getfield Zg : I
    //   66: invokevirtual ZR : (I)Z
    //   69: ifeq -> 170
    //   72: aload_1
    //   73: bipush #10
    //   75: invokevirtual indexOf : (I)I
    //   78: iflt -> 96
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   87: athrow
    //   88: getstatic com/fasterxml/Zv/Zo.ZZ : Lorg/yaml/Zjm;
    //   91: astore_3
    //   92: iload_2
    //   93: ifne -> 218
    //   96: aload_0
    //   97: getfield Zv : Lcom/fasterxml/Zoi/Zp;
    //   100: aload_1
    //   101: invokevirtual ZB : (Ljava/lang/String;)Z
    //   104: ifne -> 154
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   113: athrow
    //   114: getstatic com/fasterxml/Zv/Zu.ALWAYS_QUOTE_NUMBERS_AS_STRINGS : Lcom/fasterxml/Zv/Zu;
    //   117: aload_0
    //   118: getfield Zg : I
    //   121: invokevirtual ZR : (I)Z
    //   124: ifeq -> 162
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: getstatic com/fasterxml/Zv/Zo.Zr : Ljava/util/regex/Pattern;
    //   137: aload_1
    //   138: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   141: invokevirtual matches : ()Z
    //   144: ifeq -> 162
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   153: athrow
    //   154: getstatic com/fasterxml/Zv/Zo.Zs : Lorg/yaml/Zjm;
    //   157: astore_3
    //   158: iload_2
    //   159: ifne -> 218
    //   162: getstatic com/fasterxml/Zv/Zo.Zx : Lorg/yaml/Zjm;
    //   165: astore_3
    //   166: iload_2
    //   167: ifne -> 218
    //   170: getstatic com/fasterxml/Zv/Zu.LITERAL_BLOCK_STYLE : Lcom/fasterxml/Zv/Zu;
    //   173: aload_0
    //   174: getfield Zg : I
    //   177: invokevirtual ZR : (I)Z
    //   180: ifeq -> 214
    //   183: goto -> 190
    //   186: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   189: athrow
    //   190: aload_1
    //   191: bipush #10
    //   193: invokevirtual indexOf : (I)I
    //   196: iflt -> 214
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   205: athrow
    //   206: getstatic com/fasterxml/Zv/Zo.ZZ : Lorg/yaml/Zjm;
    //   209: astore_3
    //   210: iload_2
    //   211: ifne -> 218
    //   214: getstatic com/fasterxml/Zv/Zo.Zs : Lorg/yaml/Zjm;
    //   217: astore_3
    //   218: aload_0
    //   219: aload_1
    //   220: sipush #21077
    //   223: sipush #5676
    //   226: invokestatic c : (II)Ljava/lang/String;
    //   229: aload_3
    //   230: invokevirtual ZM : (Ljava/lang/String;Ljava/lang/String;Lorg/yaml/Zjm;)V
    //   233: return
    // Exception table:
    //   from	to	target	type
    //   4	13	13	java/io/IOException
    //   17	55	55	java/io/IOException
    //   59	81	84	java/io/IOException
    //   92	107	110	java/io/IOException
    //   96	127	130	java/io/IOException
    //   114	147	150	java/io/IOException
    //   166	183	186	java/io/IOException
    //   170	199	202	java/io/IOException
  }
  
  public void ZA(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    ZD(new String(paramArrayOfchar, paramInt1, paramInt2));
  }
  
  public final void Zr(Zj paramZj) throws IOException {
    ZD(paramZj.toString());
  }
  
  public void ZM(String paramString) throws IOException {
    ZY();
  }
  
  public void Zt(String paramString, int paramInt1, int paramInt2) throws IOException {
    ZY();
  }
  
  public void Zh(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    ZY();
  }
  
  public void ZB(char paramChar) throws IOException {
    ZY();
  }
  
  public void Ze(String paramString) throws IOException {
    ZY();
  }
  
  public void Z_(Zy paramZy, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    try {
      if (paramArrayOfbyte == null) {
        ZT();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      Zk(c(21076, -18992));
      if (paramInt1 > 0 || paramInt1 + paramInt2 != paramArrayOfbyte.length)
        paramArrayOfbyte = Arrays.copyOfRange(paramArrayOfbyte, paramInt1, paramInt1 + paramInt2); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zf(paramZy, paramArrayOfbyte);
  }
  
  public void Zs(boolean paramBoolean) throws IOException {
    try {
      Zk(c(21065, -31865));
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZM(paramBoolean ? c(21087, 9758) : c(21063, -30183), c(21081, -4528), ZG);
  }
  
  public void Zd(int paramInt) throws IOException {
    Zk(c(21069, 24641));
    ZM(String.valueOf(paramInt), c(21070, 24220), ZG);
  }
  
  public void Zw(long paramLong) throws IOException {
    try {
      if (paramLong <= 2147483647L)
        try {
          if (paramLong >= -2147483648L) {
            Zd((int)paramLong);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zk(c(21062, 21170));
    ZM(String.valueOf(paramLong), c(21082, -845), ZG);
  }
  
  public void Zy(BigInteger paramBigInteger) throws IOException {
    try {
      if (paramBigInteger == null) {
        ZT();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zk(c(21069, 24641));
    ZM(String.valueOf(paramBigInteger.toString()), c(21083, -5380), ZG);
  }
  
  public void ZF(double paramDouble) throws IOException {
    Zk(c(21069, 24641));
    ZM(String.valueOf(paramDouble), c(21084, -18760), ZG);
  }
  
  public void Za(float paramFloat) throws IOException {
    Zk(c(21069, 24641));
    ZM(String.valueOf(paramFloat), c(21057, 8186), ZG);
  }
  
  public void ZI(BigDecimal paramBigDecimal) throws IOException {
    try {
      if (paramBigDecimal == null) {
        ZT();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      Zk(c(21069, 24641));
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str = Za(Zi.WRITE_BIGDECIMAL_AS_PLAIN) ? paramBigDecimal.toPlainString() : paramBigDecimal.toString();
    ZM(str, c(21056, 8173), ZG);
  }
  
  public void Zu(String paramString) throws IOException, Zm1, UnsupportedOperationException {
    try {
      if (paramString == null) {
        ZT();
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zk(c(21069, 24641));
    ZM(paramString, c(21060, 26848), ZG);
  }
  
  public void ZT() throws IOException {
    Zk(c(21079, 6791));
    ZM(c(21068, 22920), c(21072, -10489), ZG);
  }
  
  public boolean ZB() {
    return Zu.USE_NATIVE_OBJECT_ID.ZR(this.Zg);
  }
  
  public boolean ZH() {
    return Zu.USE_NATIVE_TYPE_ID.ZR(this.Zg);
  }
  
  public void Zu(Object paramObject) throws IOException {
    this.ZM = String.valueOf(paramObject);
  }
  
  public void Zf(Object paramObject) throws IOException {
    Zk(c(21059, 23890));
    Zl_ zl_ = new Zl_(String.valueOf(paramObject), null, null);
    ZW((Zlv)zl_);
  }
  
  public void ZV(Object paramObject) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZP = (paramObject == null) ? null : String.valueOf(paramObject);
  }
  
  protected final void Zk(String paramString) throws IOException {
    int i = this.Zo.Zz();
    try {
      if (i == 5)
        Zr(c(21074, 29455) + paramString + c(21085, -24793)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zo.Zk())
        try {
          if (this.Zo.Zl() > 0) {
            Zs();
            ZG();
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  protected void ZS() {}
  
  protected void ZM(String paramString1, String paramString2, Zjm paramZjm) throws IOException {
    ZW((Zlv)Zm(paramString1, paramZjm));
  }
  
  private void Zf(Zy paramZy, byte[] paramArrayOfbyte) throws IOException {
    if (paramZy == Zmw.Zx())
      paramZy = Zmw.ZD; 
    String str1 = Zv();
    String str2 = Zj(paramZy, paramArrayOfbyte, str1);
    ZW((Zlv)new Zl4(null, ZT, Zl, str2, null, null, Zi));
  }
  
  protected Zl4 Zm(String paramString, Zjm paramZjm) {
    String str1 = this.ZM;
    try {
      if (str1 != null)
        this.ZM = null; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    String str2 = this.ZP;
    try {
      if (str2 != null)
        this.ZP = null; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return new Zl4(str2, str1, Zm, paramString, null, null, paramZjm);
  }
  
  private String Zj(Zy paramZy, byte[] paramArrayOfbyte, String paramString) {
    int i = paramArrayOfbyte.length;
    StringBuilder stringBuilder = new StringBuilder(i + (i >> 2) + (i >> 3));
    int j = paramZy.ZZ() >> 2;
    byte b = 0;
    boolean bool = Zu.Zn();
    int k = i - 3;
    while (b <= k) {
      int n = paramArrayOfbyte[b++] << 8;
      n |= paramArrayOfbyte[b++] & 0xFF;
      n = n << 8 | paramArrayOfbyte[b++] & 0xFF;
      paramZy.Zv(stringBuilder, n);
      if (--j <= 0) {
        stringBuilder.append(paramString);
        j = paramZy.ZZ() >> 2;
      } 
      if (bool)
        break; 
    } 
    int m = i - b;
    if (m > 0) {
      int n = paramArrayOfbyte[b++] << 16;
      if (m == 2)
        n |= (paramArrayOfbyte[b++] & 0xFF) << 8; 
      paramZy.ZE(stringBuilder, n, m);
    } 
    return stringBuilder.toString();
  }
  
  protected String Zv() {
    return this.ZR.Zh().ZT();
  }
  
  protected void ZG() throws IOException {
    Map<?, ?> map = Collections.emptyMap();
    boolean bool = Zu.WRITE_DOC_START_MARKER.ZR(this.Zg);
    ZW((Zlv)new Zl8(null, null, bool, this.ZH, map));
  }
  
  protected void Zs() throws IOException {
    ZW((Zlv)new Zle(null, null, false));
  }
  
  protected final void ZW(Zlv paramZlv) throws IOException {
    this.ZO.ZH(paramZlv);
  }
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'R('MpzM~Ñä@ðIÌ VNé´,rÒ3©i¡¥× >ôõSe4qÉø",ü\\tlùÏÕö´Rt÷4v#þÊI6.$Èß¼~HÔº`)3ê»ÔRw¦ÙÒX*ÏöòÉLhôÙz½ó¶Ýøg` ø\\bC¡möÅ ]y#³ú\\nUÏ¬¿Bõ¶ÆýÜÉ´¥Ó-yÖ*éæÊßp#¾J¼«9\\r}'áu°`ú±#Ûõ¨·Ö³¿E0ºÂUáÛñ0(ãò¨W6h-i×(8©fÚÿrc>B¬ª;-=#a e¼² z¹3Ú÷÷Ò»?U¸ÆUHîW<æìrÕ¯Mo;óÇä4Á:îºÂ\\r}449åÓw³ÑÂ^pÜÿ+ÃB hJ3°8µ>òHF\\fÔ*%.ðÓúUMÑ°J+ýÅºzûT_oLûÖV«çÒ8¸©ookFm}+Q]w¹éóéºý+Fáÿê÷L}~ß²\\bY£QIÝ>ð\\nZ½ÊÜL\\fI70à>ëêG(xëdÀà)Ï,#®µùÍ^±AG).*:\AûÄ\\bU÷á·0xËWÅ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #18
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #55
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
    //   68: ldc 'ÄE¸ßÇá8ºs>ôjûoiìX'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #12
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #72
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
    //   129: putstatic com/fasterxml/Zv/Zo.e : [Ljava/lang/String;
    //   132: bipush #32
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zv/Zo.f : [Ljava/lang/String;
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
    //   212: bipush #118
    //   214: goto -> 244
    //   217: bipush #82
    //   219: goto -> 244
    //   222: bipush #95
    //   224: goto -> 244
    //   227: bipush #52
    //   229: goto -> 244
    //   232: bipush #91
    //   234: goto -> 244
    //   237: bipush #7
    //   239: goto -> 244
    //   242: bipush #77
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
    //   300: sipush #21066
    //   303: sipush #4758
    //   306: invokestatic c : (II)Ljava/lang/String;
    //   309: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   312: putstatic com/fasterxml/Zv/Zo.Zr : Ljava/util/regex/Pattern;
    //   315: getstatic org/yaml/Zj9.Zf : Lorg/yaml/Zj9;
    //   318: invokevirtual toString : ()Ljava/lang/String;
    //   321: putstatic com/fasterxml/Zv/Zo.ZT : Ljava/lang/String;
    //   324: getstatic org/yaml/Zjm.PLAIN : Lorg/yaml/Zjm;
    //   327: putstatic com/fasterxml/Zv/Zo.Zc : Lorg/yaml/Zjm;
    //   330: getstatic org/yaml/Zjm.PLAIN : Lorg/yaml/Zjm;
    //   333: putstatic com/fasterxml/Zv/Zo.ZG : Lorg/yaml/Zjm;
    //   336: getstatic org/yaml/Zjm.DOUBLE_QUOTED : Lorg/yaml/Zjm;
    //   339: putstatic com/fasterxml/Zv/Zo.Zs : Lorg/yaml/Zjm;
    //   342: getstatic org/yaml/Zjm.LITERAL : Lorg/yaml/Zjm;
    //   345: putstatic com/fasterxml/Zv/Zo.ZZ : Lorg/yaml/Zjm;
    //   348: getstatic com/fasterxml/Zv/Zo.ZZ : Lorg/yaml/Zjm;
    //   351: putstatic com/fasterxml/Zv/Zo.Zi : Lorg/yaml/Zjm;
    //   354: getstatic org/yaml/Zjm.PLAIN : Lorg/yaml/Zjm;
    //   357: putstatic com/fasterxml/Zv/Zo.Zx : Lorg/yaml/Zjm;
    //   360: new org/yaml/Zgr
    //   363: dup
    //   364: iconst_1
    //   365: iconst_1
    //   366: invokespecial <init> : (ZZ)V
    //   369: putstatic com/fasterxml/Zv/Zo.Zm : Lorg/yaml/Zgr;
    //   372: new org/yaml/Zgr
    //   375: dup
    //   376: iconst_0
    //   377: iconst_0
    //   378: invokespecial <init> : (ZZ)V
    //   381: putstatic com/fasterxml/Zv/Zo.Zl : Lorg/yaml/Zgr;
    //   384: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String c(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5258) & 0xFFFF;
    if (f[i] == null) {
      char[] arrayOfChar = e[i].toCharArray();
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
      byte b1 = 17;
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
      f[i] = (new String(arrayOfChar)).intern();
    } 
    return f[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zv\Zo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */