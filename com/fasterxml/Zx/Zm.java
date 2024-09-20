package com.fasterxml.Zx;

import com.fasterxml.Zb.Ze;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zm0;
import com.fasterxml.Zb.Zm5;
import com.fasterxml.Zb.Zy;
import com.fasterxml.Zc.Zf;
import com.fasterxml.Zc.Zs;
import com.fasterxml.Zi.Zx;
import com.fasterxml.Zqd;
import com.fasterxml.Zyt;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class Zm extends Zg {
  protected static final byte[] ZB;
  
  protected static final int[] Zt;
  
  protected static final BigInteger Zk;
  
  protected static final BigInteger Zs;
  
  protected static final BigInteger ZS;
  
  protected static final BigInteger Zr;
  
  protected static final BigDecimal Zv;
  
  protected static final BigDecimal Zp;
  
  protected static final BigDecimal ZV;
  
  protected static final BigDecimal Zu;
  
  protected Zl Z_;
  
  protected Zl ZG;
  
  private static final String[] c;
  
  private static final String[] d;
  
  protected Zm() {}
  
  protected Zm(int paramInt) {
    super(paramInt);
  }
  
  public abstract Zl ZV() throws IOException;
  
  public Zl Zh() {
    return this.Z_;
  }
  
  public int Zy() {
    Zl zl = this.Z_;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw d(null);
    } 
    return (zl == null) ? 0 : zl.Zs();
  }
  
  public Zl Zj() {
    return this.Z_;
  }
  
  @Deprecated
  public int Zt() {
    Zl zl = this.Z_;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw d(null);
    } 
    return (zl == null) ? 0 : zl.Zs();
  }
  
  public boolean Zq() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw d(null);
    } 
    return (this.Z_ != null);
  }
  
  public boolean Ze(int paramInt) {
    Zl zl = this.Z_;
    try {
      if (zl == null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw d(null);
        } 
        return (0 == paramInt);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw d(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw d(null);
    } 
    return (zl.Zs() == paramInt);
  }
  
  public boolean ZL(Zl paramZl) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw d(null);
    } 
    return (this.Z_ == paramZl);
  }
  
  public boolean Zs() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw d(null);
    } 
    return (this.Z_ == Zl.START_ARRAY);
  }
  
  public boolean Zp() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw d(null);
    } 
    return (this.Z_ == Zl.START_OBJECT);
  }
  
  public boolean ZA() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw d(null);
    } 
    return (this.Z_ == Zl.VALUE_NUMBER_INT);
  }
  
  public Zg Zc() throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   8: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   11: if_acmpeq -> 37
    //   14: aload_0
    //   15: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   18: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   21: if_acmpeq -> 37
    //   24: goto -> 31
    //   27: invokestatic d : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_0
    //   32: areturn
    //   33: invokestatic d : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: iconst_1
    //   38: istore_2
    //   39: aload_0
    //   40: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   43: astore_3
    //   44: aload_3
    //   45: ifnonnull -> 58
    //   48: aload_0
    //   49: invokevirtual Z_k : ()V
    //   52: aload_0
    //   53: areturn
    //   54: invokestatic d : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: aload_3
    //   59: invokevirtual ZT : ()Z
    //   62: ifeq -> 79
    //   65: iinc #2, 1
    //   68: aload_1
    //   69: ifnull -> 147
    //   72: goto -> 79
    //   75: invokestatic d : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   78: athrow
    //   79: aload_3
    //   80: invokevirtual Zf : ()Z
    //   83: ifeq -> 113
    //   86: goto -> 93
    //   89: invokestatic d : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: iinc #2, -1
    //   96: iload_2
    //   97: ifne -> 147
    //   100: goto -> 107
    //   103: invokestatic d : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: aload_0
    //   108: areturn
    //   109: invokestatic d : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   112: athrow
    //   113: aload_3
    //   114: getstatic com/fasterxml/Zb/Zl.NOT_AVAILABLE : Lcom/fasterxml/Zb/Zl;
    //   117: if_acmpne -> 147
    //   120: aload_0
    //   121: sipush #30202
    //   124: sipush #9498
    //   127: invokestatic b : (II)Ljava/lang/String;
    //   130: aload_0
    //   131: invokevirtual getClass : ()Ljava/lang/Class;
    //   134: invokevirtual getName : ()Ljava/lang/String;
    //   137: invokevirtual ZK : (Ljava/lang/String;Ljava/lang/Object;)V
    //   140: goto -> 147
    //   143: invokestatic d : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: goto -> 39
    // Exception table:
    //   from	to	target	type
    //   4	24	27	java/io/IOException
    //   14	33	33	java/io/IOException
    //   44	54	54	java/io/IOException
    //   58	72	75	java/io/IOException
    //   65	86	89	java/io/IOException
    //   79	100	103	java/io/IOException
    //   93	109	109	java/io/IOException
    //   113	140	143	java/io/IOException
  }
  
  protected abstract void Z_k() throws Zm0;
  
  @Deprecated
  public abstract String ZD() throws IOException;
  
  public abstract void close() throws IOException;
  
  public abstract Ze ZT1();
  
  public void Zo() {
    try {
      if (this.Z_ != null) {
        this.ZG = this.Z_;
        this.Z_ = null;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw d(null);
    } 
  }
  
  public abstract String ZR() throws IOException;
  
  public abstract char[] ZW() throws IOException;
  
  public abstract boolean Zi();
  
  public abstract int Zn() throws IOException;
  
  public abstract int Zk() throws IOException;
  
  public abstract byte[] Zi(Zy paramZy) throws IOException;
  
  public int ZC() throws IOException {
    Zl zl = this.Z_;
    try {
      if (zl != Zl.VALUE_NUMBER_INT)
        try {
          return (zl != Zl.VALUE_NUMBER_FLOAT) ? Zv(0) : Ze();
        } catch (IOException iOException) {
          throw d(null);
        }  
    } catch (IOException iOException) {
      throw d(null);
    } 
    return Ze();
  }
  
  public int Zv(int paramInt) throws IOException {
    Zl zl = this.Z_;
    try {
      if (zl != Zl.VALUE_NUMBER_INT)
        try {
          if (zl != Zl.VALUE_NUMBER_FLOAT) {
            try {
              if (zl != null) {
                String str;
                Object object;
                switch (zl.Zs()) {
                  case 6:
                    str = ZR();
                    try {
                      if (ZP(str))
                        return 0; 
                    } catch (IOException iOException) {
                      throw d(null);
                    } 
                    return Zyt.ZV(str, paramInt);
                  case 9:
                    return 1;
                  case 10:
                    return 0;
                  case 11:
                    return 0;
                  case 12:
                    object = ZO();
                    try {
                      if (object instanceof Number)
                        return ((Number)object).intValue(); 
                    } catch (IOException iOException) {
                      throw d(null);
                    } 
                    break;
                } 
              } 
            } catch (IOException iOException) {
              throw d(null);
            } 
            return paramInt;
          } 
          return Ze();
        } catch (IOException iOException) {
          throw d(null);
        }  
    } catch (IOException iOException) {
      throw d(null);
    } 
    return Ze();
  }
  
  public long Zw() throws IOException {
    Zl zl = this.Z_;
    try {
      if (zl != Zl.VALUE_NUMBER_INT)
        try {
          return (zl != Zl.VALUE_NUMBER_FLOAT) ? ZE(0L) : ZE();
        } catch (IOException iOException) {
          throw d(null);
        }  
    } catch (IOException iOException) {
      throw d(null);
    } 
    return ZE();
  }
  
  public long ZE(long paramLong) throws IOException {
    Zl zl = this.Z_;
    try {
      if (zl != Zl.VALUE_NUMBER_INT)
        try {
          if (zl != Zl.VALUE_NUMBER_FLOAT) {
            try {
              if (zl != null) {
                String str;
                Object object;
                switch (zl.Zs()) {
                  case 6:
                    str = ZR();
                    try {
                      if (ZP(str))
                        return 0L; 
                    } catch (IOException iOException) {
                      throw d(null);
                    } 
                    return Zyt.Zd(str, paramLong);
                  case 9:
                    return 1L;
                  case 10:
                  case 11:
                    return 0L;
                  case 12:
                    object = ZO();
                    try {
                      if (object instanceof Number)
                        return ((Number)object).longValue(); 
                    } catch (IOException iOException) {
                      throw d(null);
                    } 
                    break;
                } 
              } 
            } catch (IOException iOException) {
              throw d(null);
            } 
            return paramLong;
          } 
          return ZE();
        } catch (IOException iOException) {
          throw d(null);
        }  
    } catch (IOException iOException) {
      throw d(null);
    } 
    return ZE();
  }
  
  public String Zd() throws IOException {
    return Zd((String)null);
  }
  
  public String Zd(String paramString) throws IOException {
    try {
      if (this.Z_ == Zl.VALUE_STRING)
        return ZR(); 
    } catch (IOException iOException) {
      throw d(null);
    } 
    try {
      if (this.Z_ == Zl.FIELD_NAME)
        return ZS(); 
    } catch (IOException iOException) {
      throw d(null);
    } 
    try {
      if (this.Z_ != null)
        try {
          if (this.Z_ != Zl.VALUE_NULL)
            try {
              return this.Z_.Zl() ? ZR() : paramString;
            } catch (IOException iOException) {
              throw d(null);
            }  
        } catch (IOException iOException) {
          throw d(null);
        }  
    } catch (IOException iOException) {
      throw d(null);
    } 
    return paramString;
  }
  
  protected void ZC(String paramString, Zf paramZf, Zy paramZy) throws IOException {
    try {
      paramZy.Zj(paramString, paramZf);
    } catch (IllegalArgumentException illegalArgumentException) {
      Zk(illegalArgumentException.getMessage());
    } 
  }
  
  protected boolean ZP(String paramString) {
    return b(30205, -28529).equals(paramString);
  }
  
  protected void Zv(String paramString, Zl paramZl, Class<?> paramClass) throws Zx {
    throw new Zx(this, paramString, paramZl, paramClass);
  }
  
  protected void Z_I() throws Zm0 {
    Zm(b(30182, 2433) + this.Z_, this.Z_);
  }
  
  protected void ZF(Zl paramZl) throws Zm0 {
    // Byte code:
    //   0: invokestatic Zn : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   8: if_acmpne -> 25
    //   11: sipush #30200
    //   14: sipush #3330
    //   17: invokestatic b : (II)Ljava/lang/String;
    //   20: astore_3
    //   21: aload_2
    //   22: ifnull -> 77
    //   25: aload_1
    //   26: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   29: if_acmpeq -> 53
    //   32: goto -> 39
    //   35: invokestatic d : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   38: athrow
    //   39: aload_1
    //   40: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_FLOAT : Lcom/fasterxml/Zb/Zl;
    //   43: if_acmpne -> 67
    //   46: goto -> 53
    //   49: invokestatic d : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   52: athrow
    //   53: sipush #30179
    //   56: sipush #-8182
    //   59: invokestatic b : (II)Ljava/lang/String;
    //   62: astore_3
    //   63: aload_2
    //   64: ifnull -> 77
    //   67: sipush #30176
    //   70: sipush #25521
    //   73: invokestatic b : (II)Ljava/lang/String;
    //   76: astore_3
    //   77: aload_0
    //   78: aload_3
    //   79: aload_1
    //   80: invokevirtual Zm : (Ljava/lang/String;Lcom/fasterxml/Zb/Zl;)V
    //   83: return
    // Exception table:
    //   from	to	target	type
    //   21	32	35	com/fasterxml/Zb/Zm0
    //   25	46	49	com/fasterxml/Zb/Zm0
  }
  
  protected void Zm(String paramString, Zl paramZl) throws Zm0 {
    throw new Zqd(this, paramZl, b(30204, 15435) + paramString);
  }
  
  protected void Za(String paramString) throws Zm0 {
    throw ZE(b(30185, 433) + paramString);
  }
  
  protected void ZI(int paramInt) throws Zm0 {
    ZK(paramInt, b(30178, 6643));
  }
  
  protected void Z_5() throws IOException {
    ZV(ZR());
  }
  
  protected void ZV(String paramString) throws IOException {
    ZM(paramString, Zh());
  }
  
  protected void ZM(String paramString, Zl paramZl) throws IOException {
    Zv(String.format(b(30184, 7841), new Object[] { Zv(paramString), Integer.valueOf(-2147483648), Integer.valueOf(2147483647) }), paramZl, int.class);
  }
  
  protected void Z_G() throws IOException {
    ZR(ZR());
  }
  
  protected void ZR(String paramString) throws IOException {
    ZY(paramString, Zh());
  }
  
  protected void ZY(String paramString, Zl paramZl) throws IOException {
    Zv(String.format(b(30180, 20031), new Object[] { Zv(paramString), Long.valueOf(Long.MIN_VALUE), Long.valueOf(Long.MAX_VALUE) }), paramZl, long.class);
  }
  
  protected String Zv(String paramString) {
    int i = paramString.length();
    try {
      if (i < 1000)
        return paramString; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw d(null);
    } 
    try {
      if (paramString.startsWith("-"))
        i--; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw d(null);
    } 
    return String.format(b(30187, 22880), new Object[] { Integer.valueOf(i) });
  }
  
  protected String ZU(String paramString) {
    int i = paramString.length();
    try {
      if (i < 1000)
        return paramString; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw d(null);
    } 
    try {
      if (paramString.startsWith("-"))
        i--; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw d(null);
    } 
    return String.format(b(30201, -26528), new Object[] { Integer.valueOf(i) });
  }
  
  protected void ZK(int paramInt, String paramString) throws Zm0 {
    try {
      if (paramInt < 0)
        Z_I(); 
    } catch (Zm0 zm0) {
      throw d(null);
    } 
    String str = String.format(b(30188, 15830), new Object[] { ZU(paramInt) });
    if (paramString != null)
      str = str + b(30183, -1068) + paramString; 
    throw Zw(str, Z_h());
  }
  
  protected <T> T Zf(int paramInt, String paramString) throws Zm0 {
    String str = String.format(b(30186, -10313), new Object[] { ZU(paramInt) });
    if (paramString != null)
      str = str + b(30189, -6992) + paramString; 
    throw Zw(str, Z_h());
  }
  
  protected void Zg(int paramInt) throws Zm0 {
    char c = (char)paramInt;
    String str = b(30191, 23015) + ZU(c) + b(30203, 11826);
    throw ZE(str);
  }
  
  protected final Zm0 Ze(String paramString, Throwable paramThrowable) {
    return ZU(paramString, paramThrowable);
  }
  
  protected Zm5 Z_h() {
    return Zz();
  }
  
  protected static final String ZU(int paramInt) {
    char c = (char)paramInt;
    try {
      if (Character.isISOControl(c))
        return b(30181, -19209) + paramInt + ")"; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw d(null);
    } 
    try {
      if (paramInt > 255)
        return "'" + c + b(30177, -18590) + paramInt + b(30207, -21527) + Integer.toHexString(paramInt) + ")"; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw d(null);
    } 
    return "'" + c + b(30190, 1693) + paramInt + ")";
  }
  
  protected final void Zk(String paramString) throws Zm0 {
    throw ZE(paramString);
  }
  
  protected final void ZK(String paramString, Object paramObject) throws Zm0 {
    throw ZI(paramString, paramObject);
  }
  
  protected final void Zq(String paramString, Object paramObject1, Object paramObject2) throws Zm0 {
    throw Zw(paramString, paramObject1, paramObject2);
  }
  
  protected final void Z_A() {
    Zs.ZP();
  }
  
  protected final void ZL(String paramString, Throwable paramThrowable) throws Zm0 {
    throw ZU(paramString, paramThrowable);
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ñè|/_ÿ?\\nD·¹Ôd|ãCgC0«]µ¶¿70ÙiL®ù±Úq/%c3¢é-Ü¼·M Åø° }Ó£`TezJÌg ®zøvÂ3÷¶Úth¡ûOÍÈÏ*è½­Ï·tZ¢ÿÏ{\\b|kú÷§@³|}\\t>ô§Ïô¿¡¬Æ$·Hí[;òîî¥ßRyóÊ*iýÜ¬ñà¤ÍèÏ\\r¾ÕÜÓ*\b¶®kïÍ%y*\\bàÝ¤B0­\\bKï¨ì¼å[ó¦ºóìpºT)êâ$¬À¯óc-r·i+.{rÞèèÈ²¨¡ÒÝíAyæ<$4Èä§ÌMUü¡¬ä:!¡Kør³ªréS$®¨ìó@gC1[§«Jý><·ã;lDF±uO(Åßî1ú;éZÿFZsðù\°#.£ã³÷Äõ0ïÅµeø;1¸bðíñhÝ¾à¨\>Rèð}ÙÖË[-f=Ð[²yqBü¥ÂºÁ9À !ö¿¼$)ZÙ5ä @°í(È]¾ªªCFx-%N>³ÎbqeÔ»ÛÍöó²ÁXÛ%ëL tÙOÚ;øþb]²YÖÄ÷ÖÑg{¨*ÝF?q¤û3<¯UÇ ÁüNÄxõ§ô)Ç~wb¾\\rDn¹ïÒé'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #23
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_3
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   64: goto -> 23
    //   67: ldc '±ËÂE\\n¼Èg¥Í19nå §~él'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #23
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #106
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic com/fasterxml/Zx/Zm.c : [Ljava/lang/String;
    //   131: bipush #23
    //   133: anewarray java/lang/String
    //   136: putstatic com/fasterxml/Zx/Zm.d : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #33
    //   214: goto -> 244
    //   217: bipush #111
    //   219: goto -> 244
    //   222: bipush #109
    //   224: goto -> 244
    //   227: bipush #45
    //   229: goto -> 244
    //   232: bipush #117
    //   234: goto -> 244
    //   237: bipush #50
    //   239: goto -> 244
    //   242: bipush #82
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: iconst_0
    //   301: newarray byte
    //   303: putstatic com/fasterxml/Zx/Zm.ZB : [B
    //   306: iconst_0
    //   307: newarray int
    //   309: putstatic com/fasterxml/Zx/Zm.Zt : [I
    //   312: ldc2_w -2147483648
    //   315: invokestatic valueOf : (J)Ljava/math/BigInteger;
    //   318: putstatic com/fasterxml/Zx/Zm.Zk : Ljava/math/BigInteger;
    //   321: ldc2_w 2147483647
    //   324: invokestatic valueOf : (J)Ljava/math/BigInteger;
    //   327: putstatic com/fasterxml/Zx/Zm.Zs : Ljava/math/BigInteger;
    //   330: ldc2_w -9223372036854775808
    //   333: invokestatic valueOf : (J)Ljava/math/BigInteger;
    //   336: putstatic com/fasterxml/Zx/Zm.ZS : Ljava/math/BigInteger;
    //   339: ldc2_w 9223372036854775807
    //   342: invokestatic valueOf : (J)Ljava/math/BigInteger;
    //   345: putstatic com/fasterxml/Zx/Zm.Zr : Ljava/math/BigInteger;
    //   348: new java/math/BigDecimal
    //   351: dup
    //   352: getstatic com/fasterxml/Zx/Zm.ZS : Ljava/math/BigInteger;
    //   355: invokespecial <init> : (Ljava/math/BigInteger;)V
    //   358: putstatic com/fasterxml/Zx/Zm.Zv : Ljava/math/BigDecimal;
    //   361: new java/math/BigDecimal
    //   364: dup
    //   365: getstatic com/fasterxml/Zx/Zm.Zr : Ljava/math/BigInteger;
    //   368: invokespecial <init> : (Ljava/math/BigInteger;)V
    //   371: putstatic com/fasterxml/Zx/Zm.Zp : Ljava/math/BigDecimal;
    //   374: new java/math/BigDecimal
    //   377: dup
    //   378: getstatic com/fasterxml/Zx/Zm.Zk : Ljava/math/BigInteger;
    //   381: invokespecial <init> : (Ljava/math/BigInteger;)V
    //   384: putstatic com/fasterxml/Zx/Zm.ZV : Ljava/math/BigDecimal;
    //   387: new java/math/BigDecimal
    //   390: dup
    //   391: getstatic com/fasterxml/Zx/Zm.Zs : Ljava/math/BigInteger;
    //   394: invokespecial <init> : (Ljava/math/BigInteger;)V
    //   397: putstatic com/fasterxml/Zx/Zm.Zu : Ljava/math/BigDecimal;
    //   400: return
  }
  
  private static Exception d(Exception paramException) {
    return paramException;
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x75E9) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      byte b1 = 110;
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zx\Zm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */