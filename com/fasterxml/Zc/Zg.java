package com.fasterxml.Zc;

import com.fasterxml.Zyt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Zg {
  static final char[] Zs;
  
  private final Zo Zd;
  
  private char[] Zc;
  
  private int ZY;
  
  private int ZT;
  
  private ArrayList<char[]> ZB;
  
  private boolean ZS;
  
  private int Zo;
  
  private char[] ZF;
  
  private int Zp;
  
  private String Ze;
  
  private char[] Zk;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg(Zo paramZo) {
    this.Zd = paramZo;
  }
  
  protected Zg(Zo paramZo, char[] paramArrayOfchar) {
    this(paramZo);
    this.ZF = paramArrayOfchar;
    this.Zp = paramArrayOfchar.length;
    this.ZY = -1;
  }
  
  public static Zg Zb(char[] paramArrayOfchar) {
    return new Zg(null, paramArrayOfchar);
  }
  
  public void Zw() {
    try {
      this.ZY = -1;
      this.Zp = 0;
      this.ZT = 0;
      this.Zc = null;
      this.Zk = null;
      if (this.ZS)
        Zl(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.Zd != null && this.ZF != null) {
        char[] arrayOfChar = this.ZF;
        this.ZF = null;
        this.Zd.Zx(2, arrayOfChar);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public void ZN(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    try {
      this.Ze = null;
      this.Zk = null;
      this.Zc = paramArrayOfchar;
      this.ZY = paramInt1;
      this.ZT = paramInt2;
      if (this.ZS)
        Zl(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public void ZH(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield Zc : [C
    //   5: aload_0
    //   6: iconst_m1
    //   7: putfield ZY : I
    //   10: invokestatic Zc : ()Ljava/lang/String;
    //   13: aload_0
    //   14: iconst_0
    //   15: putfield ZT : I
    //   18: astore #4
    //   20: aload_0
    //   21: aconst_null
    //   22: putfield Ze : Ljava/lang/String;
    //   25: aload_0
    //   26: aconst_null
    //   27: putfield Zk : [C
    //   30: aload_0
    //   31: getfield ZS : Z
    //   34: ifeq -> 53
    //   37: aload_0
    //   38: invokespecial Zl : ()V
    //   41: aload #4
    //   43: ifnull -> 83
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   52: athrow
    //   53: aload_0
    //   54: getfield ZF : [C
    //   57: ifnonnull -> 83
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: aload_0
    //   68: aload_0
    //   69: iload_3
    //   70: invokespecial ZQ : (I)[C
    //   73: putfield ZF : [C
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload_0
    //   84: aload_0
    //   85: iconst_0
    //   86: dup_x1
    //   87: putfield Zo : I
    //   90: putfield Zp : I
    //   93: aload_0
    //   94: aload_1
    //   95: iload_2
    //   96: iload_3
    //   97: invokevirtual Zx : ([CII)V
    //   100: return
    // Exception table:
    //   from	to	target	type
    //   20	46	49	java/io/IOException
    //   37	60	63	java/io/IOException
    //   53	76	79	java/io/IOException
  }
  
  public void ZK(String paramString) throws IOException {
    try {
      this.Zc = null;
      this.ZY = -1;
      this.ZT = 0;
      ZH(paramString.length());
      this.Ze = paramString;
      this.Zk = null;
      if (this.ZS)
        Zl(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.Zp = 0;
  }
  
  private char[] ZQ(int paramInt) {
    try {
      if (this.Zd != null)
        return this.Zd.Zx(2, paramInt); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return new char[Math.max(paramInt, 500)];
  }
  
  private void Zl() {
    this.ZS = false;
    this.ZB.clear();
    this.Zp = this.Zo = 0;
  }
  
  public Zo ZC() {
    return this.Zd;
  }
  
  public int Zt() {
    try {
      if (this.ZY >= 0)
        return this.ZT; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.Zk != null)
        return this.Zk.length; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.Ze != null)
        return this.Ze.length(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return this.Zo + this.Zp;
  }
  
  public int ZP() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZY >= 0) ? this.ZY : 0;
  }
  
  public char[] Zo() throws IOException {
    try {
      if (this.ZY >= 0)
        return this.Zc; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zk != null)
        return this.Zk; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Ze != null)
        return this.Zk = this.Ze.toCharArray(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!this.ZS) {
        try {
        
        } catch (IOException iOException) {
          throw a(null);
        } 
        return (this.ZF == null) ? Zs : this.ZF;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zd();
  }
  
  public String ZK() throws IOException {
    // Byte code:
    //   0: invokestatic Zc : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Ze : Ljava/lang/String;
    //   8: ifnonnull -> 325
    //   11: aload_0
    //   12: getfield Zk : [C
    //   15: ifnull -> 51
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: aload_0
    //   26: new java/lang/String
    //   29: dup
    //   30: aload_0
    //   31: getfield Zk : [C
    //   34: invokespecial <init> : ([C)V
    //   37: putfield Ze : Ljava/lang/String;
    //   40: aload_1
    //   41: ifnull -> 325
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: aload_0
    //   52: getfield ZY : I
    //   55: iflt -> 127
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   64: athrow
    //   65: aload_0
    //   66: getfield ZT : I
    //   69: iconst_1
    //   70: if_icmpge -> 92
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: aload_0
    //   81: ldc ''
    //   83: dup_x1
    //   84: putfield Ze : Ljava/lang/String;
    //   87: areturn
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: aload_0
    //   93: aload_0
    //   94: getfield ZT : I
    //   97: invokevirtual ZH : (I)V
    //   100: aload_0
    //   101: new java/lang/String
    //   104: dup
    //   105: aload_0
    //   106: getfield Zc : [C
    //   109: aload_0
    //   110: getfield ZY : I
    //   113: aload_0
    //   114: getfield ZT : I
    //   117: invokespecial <init> : ([CII)V
    //   120: putfield Ze : Ljava/lang/String;
    //   123: aload_1
    //   124: ifnull -> 325
    //   127: aload_0
    //   128: getfield Zo : I
    //   131: istore_2
    //   132: aload_0
    //   133: getfield Zp : I
    //   136: istore_3
    //   137: iload_2
    //   138: ifne -> 202
    //   141: iload_3
    //   142: ifne -> 169
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   151: athrow
    //   152: aload_0
    //   153: ldc ''
    //   155: putfield Ze : Ljava/lang/String;
    //   158: aload_1
    //   159: ifnull -> 325
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   168: athrow
    //   169: aload_0
    //   170: iload_3
    //   171: invokevirtual ZH : (I)V
    //   174: aload_0
    //   175: new java/lang/String
    //   178: dup
    //   179: aload_0
    //   180: getfield ZF : [C
    //   183: iconst_0
    //   184: iload_3
    //   185: invokespecial <init> : ([CII)V
    //   188: putfield Ze : Ljava/lang/String;
    //   191: aload_1
    //   192: ifnull -> 325
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   201: athrow
    //   202: iload_2
    //   203: iload_3
    //   204: iadd
    //   205: istore #4
    //   207: iload #4
    //   209: ifge -> 225
    //   212: aload_0
    //   213: iload_2
    //   214: iload_3
    //   215: invokevirtual Zu : (II)V
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   224: athrow
    //   225: aload_0
    //   226: iload #4
    //   228: invokevirtual ZH : (I)V
    //   231: new java/lang/StringBuilder
    //   234: dup
    //   235: iload #4
    //   237: invokespecial <init> : (I)V
    //   240: astore #5
    //   242: aload_0
    //   243: getfield ZB : Ljava/util/ArrayList;
    //   246: ifnull -> 301
    //   249: iconst_0
    //   250: istore #6
    //   252: aload_0
    //   253: getfield ZB : Ljava/util/ArrayList;
    //   256: invokevirtual size : ()I
    //   259: istore #7
    //   261: iload #6
    //   263: iload #7
    //   265: if_icmpge -> 301
    //   268: aload_0
    //   269: getfield ZB : Ljava/util/ArrayList;
    //   272: iload #6
    //   274: invokevirtual get : (I)Ljava/lang/Object;
    //   277: checkcast [C
    //   280: astore #8
    //   282: aload #5
    //   284: aload #8
    //   286: iconst_0
    //   287: aload #8
    //   289: arraylength
    //   290: invokevirtual append : ([CII)Ljava/lang/StringBuilder;
    //   293: pop
    //   294: iinc #6, 1
    //   297: aload_1
    //   298: ifnull -> 261
    //   301: aload #5
    //   303: aload_0
    //   304: getfield ZF : [C
    //   307: iconst_0
    //   308: aload_0
    //   309: getfield Zp : I
    //   312: invokevirtual append : ([CII)Ljava/lang/StringBuilder;
    //   315: pop
    //   316: aload_0
    //   317: aload #5
    //   319: invokevirtual toString : ()Ljava/lang/String;
    //   322: putfield Ze : Ljava/lang/String;
    //   325: aload_0
    //   326: getfield Ze : Ljava/lang/String;
    //   329: areturn
    // Exception table:
    //   from	to	target	type
    //   4	18	21	java/io/IOException
    //   11	44	47	java/io/IOException
    //   25	58	61	java/io/IOException
    //   51	73	76	java/io/IOException
    //   65	88	88	java/io/IOException
    //   137	145	148	java/io/IOException
    //   141	162	165	java/io/IOException
    //   152	195	198	java/io/IOException
    //   207	218	221	java/io/IOException
  }
  
  public char[] Zd() throws IOException {
    char[] arrayOfChar = this.Zk;
    if (arrayOfChar == null)
      this.Zk = arrayOfChar = Zv(); 
    return arrayOfChar;
  }
  
  public int ZP(boolean paramBoolean) {
    try {
      if (this.ZY >= 0)
        try {
          if (this.Zc != null) {
            try {
              if (paramBoolean)
                return -Zyt.Zf(this.Zc, this.ZY + 1, this.ZT - 1); 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            return Zyt.Zf(this.Zc, this.ZY, this.ZT);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramBoolean)
        return -Zyt.Zf(this.ZF, 1, this.Zp - 1); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return Zyt.Zf(this.ZF, 0, this.Zp);
  }
  
  public long ZS(boolean paramBoolean) {
    try {
      if (this.ZY >= 0)
        try {
          if (this.Zc != null) {
            try {
              if (paramBoolean)
                return -Zyt.Zl(this.Zc, this.ZY + 1, this.ZT - 1); 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            return Zyt.Zl(this.Zc, this.ZY, this.ZT);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramBoolean)
        return -Zyt.Zl(this.ZF, 1, this.Zp - 1); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return Zyt.Zl(this.ZF, 0, this.Zp);
  }
  
  public void ZA(char paramChar) throws IOException {
    try {
      if (this.ZY >= 0)
        Zy(16); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.Ze = null;
    this.Zk = null;
    char[] arrayOfChar = this.ZF;
    if (this.Zp >= arrayOfChar.length) {
      Za(1);
      ZX();
      arrayOfChar = this.ZF;
    } 
    arrayOfChar[this.Zp++] = paramChar;
  }
  
  public void Zx(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    try {
      if (this.ZY >= 0)
        Zy(paramInt2); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.Ze = null;
    this.Zk = null;
    char[] arrayOfChar = this.ZF;
    int i = arrayOfChar.length - this.Zp;
    try {
      if (i >= paramInt2) {
        System.arraycopy(paramArrayOfchar, paramInt1, arrayOfChar, this.Zp, paramInt2);
        this.Zp += paramInt2;
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Za(paramInt2);
    if (i > 0) {
      System.arraycopy(paramArrayOfchar, paramInt1, arrayOfChar, this.Zp, i);
      paramInt1 += i;
      paramInt2 -= i;
    } 
    while (true) {
      ZX();
      int j = Math.min(this.ZF.length, paramInt2);
      System.arraycopy(paramArrayOfchar, paramInt1, this.ZF, 0, j);
      this.Zp += j;
      paramInt1 += j;
      paramInt2 -= j;
      if (paramInt2 <= 0)
        return; 
    } 
  }
  
  public void Zn(String paramString, int paramInt1, int paramInt2) throws IOException {
    try {
      if (this.ZY >= 0)
        Zy(paramInt2); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.Ze = null;
    this.Zk = null;
    char[] arrayOfChar = this.ZF;
    int i = arrayOfChar.length - this.Zp;
    try {
      if (i >= paramInt2) {
        paramString.getChars(paramInt1, paramInt1 + paramInt2, arrayOfChar, this.Zp);
        this.Zp += paramInt2;
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Za(paramInt2);
    if (i > 0) {
      paramString.getChars(paramInt1, paramInt1 + i, arrayOfChar, this.Zp);
      paramInt2 -= i;
      paramInt1 += i;
    } 
    while (true) {
      ZX();
      int j = Math.min(this.ZF.length, paramInt2);
      paramString.getChars(paramInt1, paramInt1 + j, this.ZF, 0);
      this.Zp += j;
      paramInt1 += j;
      paramInt2 -= j;
      if (paramInt2 <= 0)
        return; 
    } 
  }
  
  private void Za(int paramInt) throws IOException {
    int i = this.Zo + this.Zp + paramInt;
    if (i < 0)
      i = Integer.MAX_VALUE; 
    ZH(i);
  }
  
  public char[] Zk() {
    // Byte code:
    //   0: invokestatic Zc : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZY : I
    //   8: iflt -> 27
    //   11: aload_0
    //   12: iconst_1
    //   13: invokespecial Zy : (I)V
    //   16: aload_1
    //   17: ifnull -> 83
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   26: athrow
    //   27: aload_0
    //   28: getfield ZF : [C
    //   31: astore_2
    //   32: aload_2
    //   33: ifnonnull -> 56
    //   36: aload_0
    //   37: aload_0
    //   38: iconst_0
    //   39: invokespecial ZQ : (I)[C
    //   42: putfield ZF : [C
    //   45: aload_1
    //   46: ifnull -> 83
    //   49: goto -> 56
    //   52: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: aload_0
    //   57: getfield Zp : I
    //   60: aload_2
    //   61: arraylength
    //   62: if_icmplt -> 83
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: aload_0
    //   73: invokespecial ZX : ()V
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload_0
    //   84: getfield ZF : [C
    //   87: areturn
    // Exception table:
    //   from	to	target	type
    //   4	20	23	java/lang/IllegalStateException
    //   32	49	52	java/lang/IllegalStateException
    //   36	65	68	java/lang/IllegalStateException
    //   56	76	79	java/lang/IllegalStateException
  }
  
  public char[] Zz() {
    try {
      this.ZY = -1;
      this.Zp = 0;
      this.ZT = 0;
      this.Zc = null;
      this.Ze = null;
      this.Zk = null;
      if (this.ZS)
        Zl(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    char[] arrayOfChar = this.ZF;
    if (arrayOfChar == null)
      this.ZF = arrayOfChar = ZQ(0); 
    return arrayOfChar;
  }
  
  public int Zj() {
    return this.Zp;
  }
  
  public void ZD(int paramInt) {
    this.Zp = paramInt;
  }
  
  public String ZI(int paramInt) throws IOException {
    try {
      this.Zp = paramInt;
      if (this.Zo > 0)
        return ZK(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = this.Zp;
    try {
      ZH(i);
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str = (i == 0) ? "" : new String(this.ZF, 0, i);
    this.Ze = str;
    return str;
  }
  
  public char[] ZI() throws IOException {
    // Byte code:
    //   0: invokestatic Zc : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZB : Ljava/util/ArrayList;
    //   8: ifnonnull -> 29
    //   11: aload_0
    //   12: new java/util/ArrayList
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: putfield ZB : Ljava/util/ArrayList;
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: aload_0
    //   30: iconst_1
    //   31: putfield ZS : Z
    //   34: aload_0
    //   35: getfield ZB : Ljava/util/ArrayList;
    //   38: aload_0
    //   39: getfield ZF : [C
    //   42: invokevirtual add : (Ljava/lang/Object;)Z
    //   45: pop
    //   46: aload_0
    //   47: getfield ZF : [C
    //   50: arraylength
    //   51: istore_2
    //   52: aload_0
    //   53: dup
    //   54: getfield Zo : I
    //   57: iload_2
    //   58: iadd
    //   59: putfield Zo : I
    //   62: aload_0
    //   63: getfield Zo : I
    //   66: ifge -> 87
    //   69: aload_0
    //   70: aload_0
    //   71: getfield Zo : I
    //   74: iload_2
    //   75: isub
    //   76: iload_2
    //   77: invokevirtual Zu : (II)V
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   86: athrow
    //   87: aload_0
    //   88: iconst_0
    //   89: putfield Zp : I
    //   92: aload_0
    //   93: aload_0
    //   94: getfield Zo : I
    //   97: invokevirtual ZH : (I)V
    //   100: iload_2
    //   101: iload_2
    //   102: iconst_1
    //   103: ishr
    //   104: iadd
    //   105: istore_3
    //   106: iload_3
    //   107: sipush #500
    //   110: if_icmpge -> 121
    //   113: sipush #500
    //   116: istore_3
    //   117: aload_1
    //   118: ifnull -> 137
    //   121: iload_3
    //   122: ldc 65536
    //   124: if_icmple -> 137
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: ldc 65536
    //   136: istore_3
    //   137: aload_0
    //   138: iload_3
    //   139: invokespecial Zm : (I)[C
    //   142: astore #4
    //   144: aload_0
    //   145: aload #4
    //   147: putfield ZF : [C
    //   150: aload #4
    //   152: invokestatic Zwu : ()[Lburp/Zbqc;
    //   155: ifnonnull -> 170
    //   158: ldc 'OmhZZb'
    //   160: invokestatic Zx : (Ljava/lang/String;)V
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   169: athrow
    //   170: areturn
    // Exception table:
    //   from	to	target	type
    //   4	22	25	java/io/IOException
    //   52	80	83	java/io/IOException
    //   117	127	130	java/io/IOException
    //   144	163	166	java/io/IOException
  }
  
  public char[] ZJ() {
    char[] arrayOfChar = this.ZF;
    int i = arrayOfChar.length;
    int j = i + (i >> 1);
    if (j > 65536)
      j = i + (i >> 2); 
    return this.ZF = Arrays.copyOf(arrayOfChar, j);
  }
  
  public String toString() {
    try {
      return ZK();
    } catch (IOException iOException) {
      return a(4278, 15675);
    } 
  }
  
  private void Zy(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZT : I
    //   4: istore_2
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield ZT : I
    //   10: aload_0
    //   11: getfield Zc : [C
    //   14: astore_3
    //   15: aload_0
    //   16: aconst_null
    //   17: putfield Zc : [C
    //   20: aload_0
    //   21: getfield ZY : I
    //   24: istore #4
    //   26: aload_0
    //   27: iconst_m1
    //   28: putfield ZY : I
    //   31: iload_2
    //   32: iload_1
    //   33: iadd
    //   34: istore #5
    //   36: aload_0
    //   37: getfield ZF : [C
    //   40: ifnull -> 60
    //   43: iload #5
    //   45: aload_0
    //   46: getfield ZF : [C
    //   49: arraylength
    //   50: if_icmple -> 77
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   59: athrow
    //   60: aload_0
    //   61: aload_0
    //   62: iload #5
    //   64: invokespecial ZQ : (I)[C
    //   67: putfield ZF : [C
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: iload_2
    //   78: ifle -> 100
    //   81: aload_3
    //   82: iload #4
    //   84: aload_0
    //   85: getfield ZF : [C
    //   88: iconst_0
    //   89: iload_2
    //   90: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: aload_0
    //   101: iconst_0
    //   102: putfield Zo : I
    //   105: aload_0
    //   106: iload_2
    //   107: putfield Zp : I
    //   110: return
    // Exception table:
    //   from	to	target	type
    //   36	53	56	java/lang/IllegalStateException
    //   43	70	73	java/lang/IllegalStateException
    //   77	93	96	java/lang/IllegalStateException
  }
  
  private void ZX() {
    // Byte code:
    //   0: invokestatic Zc : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZB : Ljava/util/ArrayList;
    //   8: ifnonnull -> 29
    //   11: aload_0
    //   12: new java/util/ArrayList
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: putfield ZB : Ljava/util/ArrayList;
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   28: athrow
    //   29: aload_0
    //   30: getfield ZF : [C
    //   33: astore_2
    //   34: aload_0
    //   35: iconst_1
    //   36: putfield ZS : Z
    //   39: aload_0
    //   40: getfield ZB : Ljava/util/ArrayList;
    //   43: aload_2
    //   44: invokevirtual add : (Ljava/lang/Object;)Z
    //   47: pop
    //   48: aload_0
    //   49: dup
    //   50: getfield Zo : I
    //   53: aload_2
    //   54: arraylength
    //   55: iadd
    //   56: putfield Zo : I
    //   59: aload_0
    //   60: getfield Zo : I
    //   63: ifge -> 86
    //   66: aload_0
    //   67: aload_0
    //   68: getfield Zo : I
    //   71: aload_2
    //   72: arraylength
    //   73: isub
    //   74: aload_2
    //   75: arraylength
    //   76: invokevirtual Zu : (II)V
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: aload_0
    //   87: iconst_0
    //   88: putfield Zp : I
    //   91: aload_2
    //   92: arraylength
    //   93: istore_3
    //   94: iload_3
    //   95: iload_3
    //   96: iconst_1
    //   97: ishr
    //   98: iadd
    //   99: istore #4
    //   101: iload #4
    //   103: sipush #500
    //   106: if_icmpge -> 118
    //   109: sipush #500
    //   112: istore #4
    //   114: aload_1
    //   115: ifnull -> 136
    //   118: iload #4
    //   120: ldc 65536
    //   122: if_icmple -> 136
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   131: athrow
    //   132: ldc 65536
    //   134: istore #4
    //   136: aload_0
    //   137: aload_0
    //   138: iload #4
    //   140: invokespecial Zm : (I)[C
    //   143: putfield ZF : [C
    //   146: return
    // Exception table:
    //   from	to	target	type
    //   4	22	25	java/lang/IllegalStateException
    //   34	79	82	java/lang/IllegalStateException
    //   114	125	128	java/lang/IllegalStateException
  }
  
  private char[] Zv() throws IOException {
    String str = Zs.Zc();
    try {
      if (this.Ze != null)
        return this.Ze.toCharArray(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (this.ZY >= 0) {
      int k = this.ZT;
      try {
        if (k < 1)
          return Zs; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      ZH(k);
      int m = this.ZY;
      try {
        if (m == 0)
          return Arrays.copyOf(this.Zc, k); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return Arrays.copyOfRange(this.Zc, m, m + k);
    } 
    int i = Zt();
    try {
      if (i < 1) {
        try {
          if (i < 0)
            Zu(this.Zo, this.Zp); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return Zs;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZH(i);
    int j = 0;
    char[] arrayOfChar = Zm(i);
    if (this.ZB != null) {
      byte b = 0;
      int k = this.ZB.size();
      while (b < k) {
        char[] arrayOfChar1 = this.ZB.get(b);
        int m = arrayOfChar1.length;
        System.arraycopy(arrayOfChar1, 0, arrayOfChar, j, m);
        j += m;
        b++;
        if (str != null)
          break; 
      } 
    } 
    System.arraycopy(this.ZF, 0, arrayOfChar, j, this.Zp);
    return arrayOfChar;
  }
  
  private char[] Zm(int paramInt) {
    return new char[paramInt];
  }
  
  protected void Zu(int paramInt1, int paramInt2) {
    long l = paramInt1 + paramInt2;
    throw new IllegalStateException(a(4276, 6402) + l + a(4279, -7480) + 2147483647);
  }
  
  protected void ZH(int paramInt) throws IOException {}
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'zAºÀ¶è³w\\nUüÐÉ­â@ódýhÛæ6E>¡«o8ò7°#¨ïÎõ@ôÅÏ-ÐþvçV*rÚùèM1"ýô½k_ô\\tâÒ,!:]ßFi]ï. £;µ6l¹_'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #43
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #99
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: aload #5
    //   69: putstatic com/fasterxml/Zc/Zg.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zc/Zg.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #118
    //   154: goto -> 184
    //   157: bipush #33
    //   159: goto -> 184
    //   162: bipush #101
    //   164: goto -> 184
    //   167: bipush #99
    //   169: goto -> 184
    //   172: bipush #126
    //   174: goto -> 184
    //   177: bipush #13
    //   179: goto -> 184
    //   182: bipush #92
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: iconst_0
    //   228: newarray char
    //   230: putstatic com/fasterxml/Zc/Zg.Zs : [C
    //   233: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x10B6) & 0xFFFF;
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
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zc\Zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */