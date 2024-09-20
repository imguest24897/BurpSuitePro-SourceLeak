package com.fasterxml.Zm;

import com.fasterxml.Zb.Z_;
import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Ze;
import com.fasterxml.Zb.Zk;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zm5;
import com.fasterxml.Zb.Zmd;
import com.fasterxml.Zb.Zmk;
import com.fasterxml.Zb.Zmm;
import com.fasterxml.Zb.Zmv;
import com.fasterxml.Zb.Zq;
import com.fasterxml.Zb.Zy;
import com.fasterxml.Zc.Zf;
import com.fasterxml.Zc.Zz;
import com.fasterxml.Zj.Zv;
import com.fasterxml.Zx.Zm;
import com.fasterxml.Zyt;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class Zt extends Zm {
  protected Zmd Zz;
  
  protected Z_ ZR;
  
  protected final boolean Zw;
  
  protected final boolean ZE;
  
  protected final boolean ZC;
  
  protected Ze5 Zy;
  
  protected int Zf;
  
  protected Zs ZW;
  
  protected boolean Za;
  
  protected transient Zf ZZ;
  
  protected Zm5 Zm;
  
  private static final String[] e;
  
  private static final String[] f;
  
  public Zt(Ze5 paramZe5, Zmd paramZmd, boolean paramBoolean1, boolean paramBoolean2, Ze paramZe, Z_ paramZ_) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aconst_null
    //   6: putfield Zm : Lcom/fasterxml/Zb/Zm5;
    //   9: aload_0
    //   10: aload_1
    //   11: putfield Zy : Lcom/fasterxml/Zm/Ze5;
    //   14: aload_0
    //   15: iconst_m1
    //   16: putfield Zf : I
    //   19: aload_0
    //   20: aload_2
    //   21: putfield Zz : Lcom/fasterxml/Zb/Zmd;
    //   24: aload_0
    //   25: aload #6
    //   27: putfield ZR : Lcom/fasterxml/Zb/Z_;
    //   30: aload_0
    //   31: aload #5
    //   33: invokestatic ZV : (Lcom/fasterxml/Zb/Ze;)Lcom/fasterxml/Zm/Zs;
    //   36: putfield ZW : Lcom/fasterxml/Zm/Zs;
    //   39: aload_0
    //   40: iload_3
    //   41: putfield Zw : Z
    //   44: aload_0
    //   45: iload #4
    //   47: putfield ZE : Z
    //   50: aload_0
    //   51: iload_3
    //   52: ifne -> 60
    //   55: iload #4
    //   57: ifeq -> 68
    //   60: iconst_1
    //   61: goto -> 69
    //   64: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   67: athrow
    //   68: iconst_0
    //   69: putfield ZC : Z
    //   72: return
    // Exception table:
    //   from	to	target	type
    //   55	64	64	java/lang/IllegalStateException
  }
  
  public void Zf(Zm5 paramZm5) {
    this.Zm = paramZm5;
  }
  
  public Zmd Zv() {
    return this.Zz;
  }
  
  public Zmk version() {
    return Zv.ZV;
  }
  
  public Zz<Zq> ZN() {
    return ZH;
  }
  
  public Z_ ZG() {
    return this.ZR;
  }
  
  public void close() throws IOException {
    try {
      if (!this.Za)
        this.Za = true; 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public Zl ZV() throws IOException {
    // Byte code:
    //   0: invokestatic Zo : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Za : Z
    //   8: ifne -> 25
    //   11: aload_0
    //   12: getfield Zy : Lcom/fasterxml/Zm/Ze5;
    //   15: ifnonnull -> 31
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: aconst_null
    //   26: areturn
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_0
    //   32: dup
    //   33: getfield Zf : I
    //   36: iconst_1
    //   37: iadd
    //   38: dup_x1
    //   39: putfield Zf : I
    //   42: bipush #16
    //   44: if_icmplt -> 83
    //   47: aload_0
    //   48: iconst_0
    //   49: putfield Zf : I
    //   52: aload_0
    //   53: aload_0
    //   54: getfield Zy : Lcom/fasterxml/Zm/Ze5;
    //   57: invokevirtual Zw : ()Lcom/fasterxml/Zm/Ze5;
    //   60: putfield Zy : Lcom/fasterxml/Zm/Ze5;
    //   63: aload_0
    //   64: getfield Zy : Lcom/fasterxml/Zm/Ze5;
    //   67: ifnonnull -> 83
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: aconst_null
    //   78: areturn
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload_0
    //   84: aload_0
    //   85: getfield Zy : Lcom/fasterxml/Zm/Ze5;
    //   88: aload_0
    //   89: getfield Zf : I
    //   92: invokevirtual ZQ : (I)Lcom/fasterxml/Zb/Zl;
    //   95: putfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   98: aload_0
    //   99: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   102: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   105: if_acmpne -> 148
    //   108: aload_0
    //   109: invokevirtual Zs9 : ()Ljava/lang/Object;
    //   112: astore_2
    //   113: aload_2
    //   114: instanceof java/lang/String
    //   117: ifeq -> 131
    //   120: aload_2
    //   121: checkcast java/lang/String
    //   124: goto -> 135
    //   127: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   130: athrow
    //   131: aload_2
    //   132: invokevirtual toString : ()Ljava/lang/String;
    //   135: astore_3
    //   136: aload_0
    //   137: getfield ZW : Lcom/fasterxml/Zm/Zs;
    //   140: aload_3
    //   141: invokevirtual ZM : (Ljava/lang/String;)V
    //   144: iload_1
    //   145: ifne -> 296
    //   148: aload_0
    //   149: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   152: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   155: if_acmpne -> 187
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   164: athrow
    //   165: aload_0
    //   166: aload_0
    //   167: getfield ZW : Lcom/fasterxml/Zm/Zs;
    //   170: invokevirtual ZJ : ()Lcom/fasterxml/Zm/Zs;
    //   173: putfield ZW : Lcom/fasterxml/Zm/Zs;
    //   176: iload_1
    //   177: ifne -> 296
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   186: athrow
    //   187: aload_0
    //   188: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   191: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   194: if_acmpne -> 226
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   203: athrow
    //   204: aload_0
    //   205: aload_0
    //   206: getfield ZW : Lcom/fasterxml/Zm/Zs;
    //   209: invokevirtual Zt : ()Lcom/fasterxml/Zm/Zs;
    //   212: putfield ZW : Lcom/fasterxml/Zm/Zs;
    //   215: iload_1
    //   216: ifne -> 296
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   225: athrow
    //   226: aload_0
    //   227: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   230: getstatic com/fasterxml/Zb/Zl.END_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   233: if_acmpeq -> 260
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   242: athrow
    //   243: aload_0
    //   244: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   247: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   250: if_acmpne -> 282
    //   253: goto -> 260
    //   256: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   259: athrow
    //   260: aload_0
    //   261: aload_0
    //   262: getfield ZW : Lcom/fasterxml/Zm/Zs;
    //   265: invokevirtual ZY : ()Lcom/fasterxml/Zm/Zs;
    //   268: putfield ZW : Lcom/fasterxml/Zm/Zs;
    //   271: iload_1
    //   272: ifne -> 296
    //   275: goto -> 282
    //   278: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   281: athrow
    //   282: aload_0
    //   283: getfield ZW : Lcom/fasterxml/Zm/Zs;
    //   286: invokevirtual Za : ()V
    //   289: goto -> 296
    //   292: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   295: athrow
    //   296: aload_0
    //   297: getfield Z_ : Lcom/fasterxml/Zb/Zl;
    //   300: areturn
    // Exception table:
    //   from	to	target	type
    //   4	18	21	java/io/IOException
    //   11	27	27	java/io/IOException
    //   31	70	73	java/io/IOException
    //   47	79	79	java/io/IOException
    //   113	127	127	java/io/IOException
    //   136	158	161	java/io/IOException
    //   148	180	183	java/io/IOException
    //   165	197	200	java/io/IOException
    //   187	219	222	java/io/IOException
    //   204	236	239	java/io/IOException
    //   226	253	256	java/io/IOException
    //   243	275	278	java/io/IOException
    //   260	289	292	java/io/IOException
  }
  
  public String ZU() throws IOException {
    try {
      if (!this.Za)
        try {
          if (this.Zy != null) {
            int i = this.Zf + 1;
            try {
              if (i < 16 && this.Zy.ZQ(i) == Zl.FIELD_NAME) {
                this.Zf = i;
                this.Z_ = Zl.FIELD_NAME;
                Object object = this.Zy.Z_(i);
                try {
                
                } catch (IOException iOException) {
                  throw a(null);
                } 
                String str = (object instanceof String) ? (String)object : object.toString();
                this.ZW.ZM(str);
                return str;
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
            try {
            
            } catch (IOException iOException) {
              throw a(null);
            } 
            return (ZV() == Zl.FIELD_NAME) ? ZS() : null;
          } 
          return null;
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return null;
  }
  
  public Ze ZT1() {
    return this.ZW;
  }
  
  public Zm5 Zz() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.Zm == null) ? Zm5.Zi : this.Zm;
  }
  
  public Zm5 ZQ() {
    return Zz();
  }
  
  @Deprecated
  public Zm5 ZK() {
    return ZQ();
  }
  
  @Deprecated
  public Zm5 Zl() {
    return Zz();
  }
  
  public String ZS() {
    try {
      if (this.Z_ == Zl.START_OBJECT || this.Z_ == Zl.START_ARRAY) {
        Ze ze = this.ZW.Zf();
        return ze.Z_();
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return this.ZW.Z_();
  }
  
  @Deprecated
  public String ZD() {
    return ZS();
  }
  
  public String ZR() {
    try {
      if (this.Z_ == Zl.VALUE_STRING || this.Z_ == Zl.FIELD_NAME) {
        Object object = Zs9();
        try {
          if (object instanceof String)
            return (String)object; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return Zx.Zh(object);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.Z_ == null)
        return null; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      switch (Zg.Z_[this.Z_.ordinal()]) {
        case 7:
        case 8:
          return Zx.Zh(Zs9());
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return this.Z_.ZI();
  }
  
  public char[] ZW() {
    String str = ZR();
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (str == null) ? null : str.toCharArray();
  }
  
  public int Zn() {
    String str = ZR();
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (str == null) ? 0 : str.length();
  }
  
  public int Zk() {
    return 0;
  }
  
  public boolean Zi() {
    return false;
  }
  
  public boolean Zr() {
    if (this.Z_ == Zl.VALUE_NUMBER_FLOAT) {
      Object object = Zs9();
      if (object instanceof Double) {
        double d = ((Double)object).doubleValue();
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return !Double.isFinite(d);
      } 
      if (object instanceof Float) {
        float f = ((Float)object).floatValue();
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return !Double.isFinite(f);
      } 
    } 
    return false;
  }
  
  public BigInteger ZX() throws IOException {
    Number number = Zj(true);
    try {
      if (number instanceof BigInteger)
        return (BigInteger)number; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (number instanceof BigDecimal) {
      BigDecimal bigDecimal = (BigDecimal)number;
      ZG().Zn(bigDecimal.scale());
      return bigDecimal.toBigInteger();
    } 
    return BigInteger.valueOf(number.longValue());
  }
  
  public BigDecimal ZT() throws IOException {
    Number number = Zj(true);
    try {
      if (number instanceof BigDecimal)
        return (BigDecimal)number; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (number instanceof Integer)
        return BigDecimal.valueOf(number.intValue()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (number instanceof Long)
        return BigDecimal.valueOf(number.longValue()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (number instanceof BigInteger)
        return new BigDecimal((BigInteger)number); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return BigDecimal.valueOf(number.doubleValue());
  }
  
  public double ZH() throws IOException {
    return Zb().doubleValue();
  }
  
  public float Zg() throws IOException {
    return Zb().floatValue();
  }
  
  public int Ze() throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    Number number = (this.Z_ == Zl.VALUE_NUMBER_INT) ? (Number)Zs9() : Zb();
    try {
      if (!(number instanceof Integer))
        try {
          return !Zn(number) ? Zg(number) : number.intValue();
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return number.intValue();
  }
  
  public long ZE() throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    Number number = (this.Z_ == Zl.VALUE_NUMBER_INT) ? (Number)Zs9() : Zb();
    try {
      if (!(number instanceof Long))
        try {
          return !Zx(number) ? Zl(number) : number.longValue();
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return number.longValue();
  }
  
  public Zk ZL() throws IOException {
    Object object = ZI();
    try {
      if (object instanceof Integer)
        return Zk.INT; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (object instanceof Long)
        return Zk.LONG; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (object instanceof Double)
        return Zk.DOUBLE; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (object instanceof BigDecimal)
        return Zk.BIG_DECIMAL; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (object instanceof BigInteger)
        return Zk.BIG_INTEGER; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (object instanceof Float)
        return Zk.FLOAT; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (object instanceof Short)
        return Zk.INT; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (object instanceof String) {
        try {
        
        } catch (IOException iOException) {
          throw a(null);
        } 
        return (this.Z_ == Zl.VALUE_NUMBER_FLOAT) ? Zk.BIG_DECIMAL : Zk.BIG_INTEGER;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return null;
  }
  
  public Zmm Z_() throws IOException {
    if (this.Z_ == Zl.VALUE_NUMBER_FLOAT) {
      Object object = Zs9();
      try {
        if (object instanceof Double)
          return Zmm.DOUBLE64; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (object instanceof BigDecimal)
          return Zmm.BIG_DECIMAL; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (object instanceof Float)
          return Zmm.FLOAT32; 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    return Zmm.UNKNOWN;
  }
  
  public final Number Zb() throws IOException {
    return Zj(false);
  }
  
  public Object ZI() throws IOException {
    ZsQ();
    return Zs9();
  }
  
  private Number Zj(boolean paramBoolean) throws IOException {
    ZsQ();
    Object object = Zs9();
    try {
      if (object instanceof Number)
        return (Number)object; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (object instanceof String) {
      String str = (String)object;
      int i = str.length();
      try {
        if (this.Z_ == Zl.VALUE_NUMBER_INT) {
          try {
            if (!paramBoolean)
              try {
                if (i < 19) {
                  try {
                    if (i >= 10)
                      return Long.valueOf(Zyt.ZO(str)); 
                  } catch (IOException iOException) {
                    throw a(null);
                  } 
                  return Integer.valueOf(Zyt.ZC(str));
                } 
                return Zyt.ZI(str, Zt(Zmv.USE_FAST_BIG_NUMBER_PARSER));
              } catch (IOException iOException) {
                throw a(null);
              }  
          } catch (IOException iOException) {
            throw a(null);
          } 
          return Zyt.ZI(str, Zt(Zmv.USE_FAST_BIG_NUMBER_PARSER));
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      if (paramBoolean) {
        BigDecimal bigDecimal = Zyt.Zu(str, Zt(Zmv.USE_FAST_BIG_NUMBER_PARSER));
        try {
          if (bigDecimal == null)
            throw new IllegalStateException(c(21040, -15791) + str + "'"); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return bigDecimal;
      } 
      return Double.valueOf(Zyt.ZE(str, Zt(Zmv.USE_FAST_DOUBLE_PARSER)));
    } 
    throw new IllegalStateException(c(21046, -31099) + Zx.ZZ(object));
  }
  
  private final boolean Zn(Number paramNumber) {
    try {
      if (!(paramNumber instanceof Short)) {
        try {
          if (paramNumber instanceof Byte);
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private final boolean Zx(Number paramNumber) {
    try {
      if (!(paramNumber instanceof Integer))
        try {
          if (!(paramNumber instanceof Short)) {
            try {
              if (paramNumber instanceof Byte);
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            return false;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  protected int Zg(Number paramNumber) throws IOException {
    // Byte code:
    //   0: invokestatic Zo : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: instanceof java/lang/Long
    //   8: ifeq -> 42
    //   11: aload_1
    //   12: invokevirtual longValue : ()J
    //   15: lstore_3
    //   16: lload_3
    //   17: l2i
    //   18: istore #5
    //   20: iload #5
    //   22: i2l
    //   23: lload_3
    //   24: lcmp
    //   25: ifeq -> 39
    //   28: aload_0
    //   29: invokevirtual Z_5 : ()V
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   38: athrow
    //   39: iload #5
    //   41: ireturn
    //   42: aload_1
    //   43: instanceof java/math/BigInteger
    //   46: ifeq -> 96
    //   49: aload_1
    //   50: checkcast java/math/BigInteger
    //   53: astore_3
    //   54: getstatic com/fasterxml/Zm/Zt.Zk : Ljava/math/BigInteger;
    //   57: aload_3
    //   58: invokevirtual compareTo : (Ljava/math/BigInteger;)I
    //   61: ifgt -> 81
    //   64: getstatic com/fasterxml/Zm/Zt.Zs : Ljava/math/BigInteger;
    //   67: aload_3
    //   68: invokevirtual compareTo : (Ljava/math/BigInteger;)I
    //   71: ifge -> 92
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   80: athrow
    //   81: aload_0
    //   82: invokevirtual Z_5 : ()V
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: iload_2
    //   93: ifne -> 231
    //   96: aload_1
    //   97: instanceof java/lang/Double
    //   100: ifne -> 124
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: aload_1
    //   111: instanceof java/lang/Float
    //   114: ifeq -> 166
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   123: athrow
    //   124: aload_1
    //   125: invokevirtual doubleValue : ()D
    //   128: dstore_3
    //   129: dload_3
    //   130: ldc2_w -2.147483648E9
    //   133: dcmpg
    //   134: iflt -> 152
    //   137: dload_3
    //   138: ldc2_w 2.147483647E9
    //   141: dcmpl
    //   142: ifle -> 163
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   151: athrow
    //   152: aload_0
    //   153: invokevirtual Z_5 : ()V
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   162: athrow
    //   163: dload_3
    //   164: d2i
    //   165: ireturn
    //   166: aload_1
    //   167: instanceof java/math/BigDecimal
    //   170: ifeq -> 220
    //   173: aload_1
    //   174: checkcast java/math/BigDecimal
    //   177: astore_3
    //   178: getstatic com/fasterxml/Zm/Zt.ZV : Ljava/math/BigDecimal;
    //   181: aload_3
    //   182: invokevirtual compareTo : (Ljava/math/BigDecimal;)I
    //   185: ifgt -> 205
    //   188: getstatic com/fasterxml/Zm/Zt.Zu : Ljava/math/BigDecimal;
    //   191: aload_3
    //   192: invokevirtual compareTo : (Ljava/math/BigDecimal;)I
    //   195: ifge -> 216
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   204: athrow
    //   205: aload_0
    //   206: invokevirtual Z_5 : ()V
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   215: athrow
    //   216: iload_2
    //   217: ifne -> 231
    //   220: aload_0
    //   221: invokevirtual Z_A : ()V
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   230: athrow
    //   231: aload_1
    //   232: invokevirtual intValue : ()I
    //   235: ireturn
    // Exception table:
    //   from	to	target	type
    //   20	32	35	java/io/IOException
    //   54	74	77	java/io/IOException
    //   64	85	88	java/io/IOException
    //   92	103	106	java/io/IOException
    //   96	117	120	java/io/IOException
    //   129	145	148	java/io/IOException
    //   137	156	159	java/io/IOException
    //   178	198	201	java/io/IOException
    //   188	209	212	java/io/IOException
    //   216	224	227	java/io/IOException
  }
  
  protected long Zl(Number paramNumber) throws IOException {
    // Byte code:
    //   0: invokestatic Zo : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: instanceof java/math/BigInteger
    //   8: ifeq -> 58
    //   11: aload_1
    //   12: checkcast java/math/BigInteger
    //   15: astore_3
    //   16: getstatic com/fasterxml/Zm/Zt.ZS : Ljava/math/BigInteger;
    //   19: aload_3
    //   20: invokevirtual compareTo : (Ljava/math/BigInteger;)I
    //   23: ifgt -> 43
    //   26: getstatic com/fasterxml/Zm/Zt.Zr : Ljava/math/BigInteger;
    //   29: aload_3
    //   30: invokevirtual compareTo : (Ljava/math/BigInteger;)I
    //   33: ifge -> 54
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: aload_0
    //   44: invokevirtual Z_G : ()V
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   53: athrow
    //   54: iload_2
    //   55: ifne -> 193
    //   58: aload_1
    //   59: instanceof java/lang/Double
    //   62: ifne -> 86
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: aload_1
    //   73: instanceof java/lang/Float
    //   76: ifeq -> 128
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: aload_1
    //   87: invokevirtual doubleValue : ()D
    //   90: dstore_3
    //   91: dload_3
    //   92: ldc2_w -9.223372036854776E18
    //   95: dcmpg
    //   96: iflt -> 114
    //   99: dload_3
    //   100: ldc2_w 9.223372036854776E18
    //   103: dcmpl
    //   104: ifle -> 125
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   113: athrow
    //   114: aload_0
    //   115: invokevirtual Z_G : ()V
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: dload_3
    //   126: d2l
    //   127: lreturn
    //   128: aload_1
    //   129: instanceof java/math/BigDecimal
    //   132: ifeq -> 182
    //   135: aload_1
    //   136: checkcast java/math/BigDecimal
    //   139: astore_3
    //   140: getstatic com/fasterxml/Zm/Zt.Zv : Ljava/math/BigDecimal;
    //   143: aload_3
    //   144: invokevirtual compareTo : (Ljava/math/BigDecimal;)I
    //   147: ifgt -> 167
    //   150: getstatic com/fasterxml/Zm/Zt.Zp : Ljava/math/BigDecimal;
    //   153: aload_3
    //   154: invokevirtual compareTo : (Ljava/math/BigDecimal;)I
    //   157: ifge -> 178
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   166: athrow
    //   167: aload_0
    //   168: invokevirtual Z_G : ()V
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   177: athrow
    //   178: iload_2
    //   179: ifne -> 193
    //   182: aload_0
    //   183: invokevirtual Z_A : ()V
    //   186: goto -> 193
    //   189: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   192: athrow
    //   193: aload_1
    //   194: invokevirtual longValue : ()J
    //   197: lreturn
    // Exception table:
    //   from	to	target	type
    //   16	36	39	java/io/IOException
    //   26	47	50	java/io/IOException
    //   54	65	68	java/io/IOException
    //   58	79	82	java/io/IOException
    //   91	107	110	java/io/IOException
    //   99	118	121	java/io/IOException
    //   140	160	163	java/io/IOException
    //   150	171	174	java/io/IOException
    //   178	186	189	java/io/IOException
  }
  
  public Object ZO() {
    try {
      if (this.Z_ == Zl.VALUE_EMBEDDED_OBJECT)
        return Zs9(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return null;
  }
  
  public byte[] Zi(Zy paramZy) throws IOException {
    int i = Zx.ZY();
    if (this.Z_ == Zl.VALUE_EMBEDDED_OBJECT) {
      Object object = Zs9();
      try {
        if (object instanceof byte[])
          return (byte[])object; 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    try {
      if (this.Z_ != Zl.VALUE_STRING)
        throw Zh(c(21045, -25905) + this.Z_ + c(21041, 8742)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str = ZR();
    try {
      if (str == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zf zf = this.ZZ;
    if (zf == null) {
      try {
        this.ZZ = zf = new Zf(100);
        if (i != 0) {
          this.ZZ.Zt();
          ZC(str, zf, paramZy);
          return zf.ZA();
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      ZC(str, zf, paramZy);
      return zf.ZA();
    } 
    this.ZZ.Zt();
    ZC(str, zf, paramZy);
    return zf.ZA();
  }
  
  public int Zh(Zy paramZy, OutputStream paramOutputStream) throws IOException {
    byte[] arrayOfByte = Zi(paramZy);
    try {
      if (arrayOfByte != null) {
        paramOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
        return arrayOfByte.length;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return 0;
  }
  
  public boolean ZM() {
    return this.ZE;
  }
  
  public boolean ZP() {
    return this.Zw;
  }
  
  public Object ZJ() {
    return this.Zy.Zj(this.Zf);
  }
  
  public Object ZZ() {
    return this.Zy.Zs(this.Zf);
  }
  
  protected final Object Zs9() {
    return this.Zy.Z_(this.Zf);
  }
  
  protected final void ZsQ() throws Zd {
    try {
      if (this.Z_ != null)
        try {
          if (this.Z_.ZW())
            return; 
          throw Zh(c(21047, 14726) + this.Z_ + c(21044, -1257));
        } catch (Zd zd) {
          throw a(null);
        }  
    } catch (Zd zd) {
      throw a(null);
    } 
    throw Zh(c(21047, 14726) + this.Z_ + c(21044, -1257));
  }
  
  protected void Z_k() {
    Z_A();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÊlTWµÛû`o¦1×¯ÌÊA]AT\\f eá-ë!Qn*£ô¯/ n¨¡$Kù¢ßBÓGRì<\\n], Èæø£¢9îò®R§õbn¯òsóOÐ4Tû¸Æ,ëDÊ¤õ<®_å{¹B90BîôãhÔ½%''
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #15
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #45
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
    //   68: ldc 'áÉ\\nÇbZà#)@Ndlg~Ò"mz}Fo¦9y=\\n<dÀxþ9­vMö}Bæ3Õ\\rE¹M3É¡Â|t<tîGP2z@+¸(´]ÖØÖi,pUí;pnm=êSð!ìÃÖ±tâDÿ÷a'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #82
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #45
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
    //   129: putstatic com/fasterxml/Zm/Zt.e : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zm/Zt.f : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 236
    //   212: bipush #37
    //   214: goto -> 243
    //   217: bipush #120
    //   219: goto -> 243
    //   222: bipush #120
    //   224: goto -> 243
    //   227: bipush #50
    //   229: goto -> 243
    //   232: iconst_3
    //   233: goto -> 243
    //   236: bipush #27
    //   238: goto -> 243
    //   241: bipush #100
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String c(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5235) & 0xFFFF;
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
      byte b1 = 55;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */