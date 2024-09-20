package org.yaml;

import burp.Zbqc;
import java.io.Reader;
import java.io.StringReader;

public class Zlx {
  private String Zk;
  
  private final Reader ZQ;
  
  private int[] Zz;
  
  private int Zp;
  
  private int ZT = 0;
  
  private boolean Zw;
  
  private int Zn = 0;
  
  private int Za;
  
  private int ZP;
  
  private int Zv;
  
  private final char[] Zl;
  
  private static boolean Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zlx(String paramString) {
    this(new StringReader(paramString));
    this.Zk = a(20143, -6249);
  }
  
  public Zlx(Reader paramReader) {
    boolean bool = ZQ();
    try {
      this.Za = 0;
      this.ZP = 0;
      this.Zv = 0;
      if (paramReader == null)
        throw new NullPointerException(a(20141, -24498)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      this.Zk = a(20142, -4327);
      this.Zz = new int[0];
      this.Zp = 0;
      this.ZQ = paramReader;
      this.Zw = false;
      this.Zl = new char[1025];
      if (bool)
        Zbqc.Zr(new Zbqc[2]); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  public static boolean Zf(int paramInt) {
    // Byte code:
    //   0: iload_0
    //   1: bipush #32
    //   3: if_icmplt -> 19
    //   6: iload_0
    //   7: bipush #126
    //   9: if_icmple -> 151
    //   12: goto -> 19
    //   15: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   18: athrow
    //   19: iload_0
    //   20: bipush #9
    //   22: if_icmpeq -> 151
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   31: athrow
    //   32: iload_0
    //   33: bipush #10
    //   35: if_icmpeq -> 151
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: iload_0
    //   46: bipush #13
    //   48: if_icmpeq -> 151
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: iload_0
    //   59: sipush #133
    //   62: if_icmpeq -> 151
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: iload_0
    //   73: sipush #160
    //   76: if_icmplt -> 99
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: iload_0
    //   87: ldc 55295
    //   89: if_icmple -> 151
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: iload_0
    //   100: ldc 57344
    //   102: if_icmplt -> 125
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   111: athrow
    //   112: iload_0
    //   113: ldc 65533
    //   115: if_icmple -> 151
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: iload_0
    //   126: ldc 65536
    //   128: if_icmplt -> 159
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: iload_0
    //   139: ldc 1114111
    //   141: if_icmpgt -> 159
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: iconst_1
    //   152: goto -> 160
    //   155: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   158: athrow
    //   159: iconst_0
    //   160: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	12	15	java/lang/NullPointerException
    //   6	25	28	java/lang/NullPointerException
    //   19	38	41	java/lang/NullPointerException
    //   32	51	54	java/lang/NullPointerException
    //   45	65	68	java/lang/NullPointerException
    //   58	79	82	java/lang/NullPointerException
    //   72	92	95	java/lang/NullPointerException
    //   86	105	108	java/lang/NullPointerException
    //   99	118	121	java/lang/NullPointerException
    //   112	131	134	java/lang/NullPointerException
    //   125	144	147	java/lang/NullPointerException
    //   138	155	155	java/lang/NullPointerException
  }
  
  public Zt1 ZA() {
    return new Zt1(this.Zk, this.Zn, this.ZP, this.Zv, this.Zz, this.ZT);
  }
  
  public void ZK() {
    Zj(1);
  }
  
  public void Zj(int paramInt) {
    // Byte code:
    //   0: invokestatic Zw : ()Z
    //   3: iconst_0
    //   4: istore_3
    //   5: istore_2
    //   6: iload_3
    //   7: iload_1
    //   8: if_icmpge -> 165
    //   11: aload_0
    //   12: invokespecial Zp : ()Z
    //   15: ifeq -> 165
    //   18: aload_0
    //   19: getfield Zz : [I
    //   22: aload_0
    //   23: dup
    //   24: getfield ZT : I
    //   27: dup_x1
    //   28: iconst_1
    //   29: iadd
    //   30: putfield ZT : I
    //   33: iaload
    //   34: istore #4
    //   36: aload_0
    //   37: iconst_1
    //   38: invokespecial ZR : (I)V
    //   41: getstatic org/yaml/Z_s.ZV : Lorg/yaml/Z_s;
    //   44: iload #4
    //   46: invokevirtual Zj : (I)Z
    //   49: ifne -> 101
    //   52: iload #4
    //   54: bipush #13
    //   56: if_icmpne -> 127
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   65: athrow
    //   66: aload_0
    //   67: invokespecial Zp : ()Z
    //   70: ifeq -> 127
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: aload_0
    //   81: getfield Zz : [I
    //   84: aload_0
    //   85: getfield ZT : I
    //   88: iaload
    //   89: bipush #10
    //   91: if_icmpeq -> 127
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   100: athrow
    //   101: aload_0
    //   102: dup
    //   103: getfield ZP : I
    //   106: iconst_1
    //   107: iadd
    //   108: putfield ZP : I
    //   111: aload_0
    //   112: iconst_0
    //   113: putfield Zv : I
    //   116: iload_2
    //   117: ifne -> 158
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: iload #4
    //   129: ldc 65279
    //   131: if_icmpeq -> 158
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: aload_0
    //   142: dup
    //   143: getfield Zv : I
    //   146: iconst_1
    //   147: iadd
    //   148: putfield Zv : I
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: iinc #3, 1
    //   161: iload_2
    //   162: ifne -> 6
    //   165: return
    // Exception table:
    //   from	to	target	type
    //   36	59	62	java/lang/NullPointerException
    //   52	73	76	java/lang/NullPointerException
    //   66	94	97	java/lang/NullPointerException
    //   80	120	123	java/lang/NullPointerException
    //   101	134	137	java/lang/NullPointerException
    //   127	151	154	java/lang/NullPointerException
  }
  
  public int Zr() {
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return Zp() ? this.Zz[this.ZT] : 0;
  }
  
  public int Zt(int paramInt) {
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return Ze(paramInt) ? this.Zz[this.ZT + paramInt] : 0;
  }
  
  public String Zl(int paramInt) {
    try {
      if (paramInt == 0)
        return ""; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (Ze(paramInt))
        return new String(this.Zz, this.ZT, paramInt); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return new String(this.Zz, this.ZT, Math.min(paramInt, this.Zp - this.ZT));
  }
  
  public String Zr(int paramInt) {
    String str = Zl(paramInt);
    this.ZT += paramInt;
    ZR(paramInt);
    this.Zv += paramInt;
    return str;
  }
  
  private boolean Zp() {
    return Ze(0);
  }
  
  private boolean Ze(int paramInt) {
    try {
      if (!this.Zw)
        try {
          if (this.ZT + paramInt >= this.Zp)
            ZE(); 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (this.ZT + paramInt < this.Zp);
  }
  
  private void ZE() {
    // Byte code:
    //   0: invokestatic ZQ : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield ZQ : Ljava/io/Reader;
    //   8: aload_0
    //   9: getfield Zl : [C
    //   12: iconst_0
    //   13: sipush #1024
    //   16: invokevirtual read : ([CII)I
    //   19: istore_2
    //   20: iload_2
    //   21: ifle -> 238
    //   24: aload_0
    //   25: getfield Zp : I
    //   28: aload_0
    //   29: getfield ZT : I
    //   32: isub
    //   33: istore_3
    //   34: aload_0
    //   35: aload_0
    //   36: getfield Zz : [I
    //   39: aload_0
    //   40: getfield ZT : I
    //   43: aload_0
    //   44: getfield Zp : I
    //   47: iload_2
    //   48: iadd
    //   49: invokestatic copyOfRange : ([III)[I
    //   52: putfield Zz : [I
    //   55: aload_0
    //   56: getfield Zl : [C
    //   59: iload_2
    //   60: iconst_1
    //   61: isub
    //   62: caload
    //   63: invokestatic isHighSurrogate : (C)Z
    //   66: ifeq -> 119
    //   69: aload_0
    //   70: getfield ZQ : Ljava/io/Reader;
    //   73: aload_0
    //   74: getfield Zl : [C
    //   77: iload_2
    //   78: iconst_1
    //   79: invokevirtual read : ([CII)I
    //   82: iconst_m1
    //   83: if_icmpne -> 109
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: aload_0
    //   94: iconst_1
    //   95: putfield Zw : Z
    //   98: iload_1
    //   99: ifeq -> 119
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   108: athrow
    //   109: iinc #2, 1
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   118: athrow
    //   119: bipush #32
    //   121: istore #4
    //   123: iconst_0
    //   124: istore #5
    //   126: iload #5
    //   128: iload_2
    //   129: if_icmpge -> 187
    //   132: aload_0
    //   133: getfield Zl : [C
    //   136: iload #5
    //   138: invokestatic codePointAt : ([CI)I
    //   141: istore #6
    //   143: aload_0
    //   144: getfield Zz : [I
    //   147: iload_3
    //   148: iload #6
    //   150: iastore
    //   151: iload #6
    //   153: invokestatic Zf : (I)Z
    //   156: ifeq -> 173
    //   159: iload #5
    //   161: iload #6
    //   163: invokestatic charCount : (I)I
    //   166: iadd
    //   167: istore #5
    //   169: iload_1
    //   170: ifeq -> 180
    //   173: iload #6
    //   175: istore #4
    //   177: iload_2
    //   178: istore #5
    //   180: iinc #3, 1
    //   183: iload_1
    //   184: ifeq -> 126
    //   187: aload_0
    //   188: iload_3
    //   189: putfield Zp : I
    //   192: aload_0
    //   193: iconst_0
    //   194: putfield ZT : I
    //   197: iload #4
    //   199: bipush #32
    //   201: if_icmpeq -> 234
    //   204: new org/yaml/Zls
    //   207: dup
    //   208: aload_0
    //   209: getfield Zk : Ljava/lang/String;
    //   212: iload_3
    //   213: iconst_1
    //   214: isub
    //   215: iload #4
    //   217: sipush #20140
    //   220: sipush #10562
    //   223: invokestatic a : (II)Ljava/lang/String;
    //   226: invokespecial <init> : (Ljava/lang/String;IILjava/lang/String;)V
    //   229: athrow
    //   230: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   233: athrow
    //   234: iload_1
    //   235: ifeq -> 250
    //   238: aload_0
    //   239: iconst_1
    //   240: putfield Zw : Z
    //   243: goto -> 250
    //   246: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   249: athrow
    //   250: goto -> 263
    //   253: astore_2
    //   254: new org/yaml/Zj3
    //   257: dup
    //   258: aload_2
    //   259: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   262: athrow
    //   263: return
    // Exception table:
    //   from	to	target	type
    //   4	250	253	java/io/IOException
    //   34	86	89	java/io/IOException
    //   69	102	105	java/io/IOException
    //   93	112	115	java/io/IOException
    //   187	230	230	java/io/IOException
    //   234	243	246	java/io/IOException
  }
  
  public int ZO() {
    return this.Zv;
  }
  
  private void ZR(int paramInt) {
    this.Zn += paramInt;
    this.Za += paramInt;
  }
  
  public int Zg() {
    return this.Za;
  }
  
  public void Zo() {
    this.Za = 0;
  }
  
  public int ZY() {
    return this.Zn;
  }
  
  public int ZG() {
    return this.ZP;
  }
  
  public static void Zz(boolean paramBoolean) {
    Zb = paramBoolean;
  }
  
  public static boolean Zw() {
    return Zb;
  }
  
  public static boolean ZQ() {
    boolean bool = Zw();
    try {
      if (!bool)
        return true; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÊWÄùÞÚ\\bM2ÝSÐ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #8
    //   19: istore_1
    //   20: iconst_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: invokestatic Zz : (Z)V
    //   26: iconst_5
    //   27: iinc #0, 1
    //   30: aload_2
    //   31: iload_0
    //   32: dup
    //   33: iload_1
    //   34: iadd
    //   35: invokevirtual substring : (II)Ljava/lang/String;
    //   38: iconst_m1
    //   39: goto -> 144
    //   42: aload #5
    //   44: swap
    //   45: iload_3
    //   46: iinc #3, 1
    //   49: swap
    //   50: aastore
    //   51: iload_0
    //   52: iload_1
    //   53: iadd
    //   54: dup
    //   55: istore_0
    //   56: iload #4
    //   58: if_icmpge -> 70
    //   61: aload_2
    //   62: iload_0
    //   63: invokevirtual charAt : (I)C
    //   66: istore_1
    //   67: goto -> 26
    //   70: ldc 'AÝE-' }íÚ>Öj÷Ì$Rp´>sù"GzjwT >½þÅÒ¼:5.Î§òe7\\b+)9Í'
    //   72: dup
    //   73: astore_2
    //   74: invokevirtual length : ()I
    //   77: istore #4
    //   79: bipush #24
    //   81: istore_1
    //   82: iconst_m1
    //   83: istore_0
    //   84: bipush #74
    //   86: iinc #0, 1
    //   89: aload_2
    //   90: iload_0
    //   91: dup
    //   92: iload_1
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 144
    //   101: aload #5
    //   103: swap
    //   104: iload_3
    //   105: iinc #3, 1
    //   108: swap
    //   109: aastore
    //   110: iload_0
    //   111: iload_1
    //   112: iadd
    //   113: dup
    //   114: istore_0
    //   115: iload #4
    //   117: if_icmpge -> 129
    //   120: aload_2
    //   121: iload_0
    //   122: invokevirtual charAt : (I)C
    //   125: istore_1
    //   126: goto -> 84
    //   129: aload #5
    //   131: putstatic org/yaml/Zlx.a : [Ljava/lang/String;
    //   134: iconst_4
    //   135: anewarray java/lang/String
    //   138: putstatic org/yaml/Zlx.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 260
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #14
    //   214: goto -> 244
    //   217: bipush #23
    //   219: goto -> 244
    //   222: bipush #78
    //   224: goto -> 244
    //   227: bipush #59
    //   229: goto -> 244
    //   232: bipush #116
    //   234: goto -> 244
    //   237: bipush #113
    //   239: goto -> 244
    //   242: bipush #97
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 167
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 163
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 42, 0 -> 101
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4EAF) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zlx.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */