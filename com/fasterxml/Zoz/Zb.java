package com.fasterxml.Zoz;

import com.fasterxml.Zh.Zi;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zyb;
import com.fasterxml.Zor.Zz;
import com.fasterxml.Zyj;
import com.fasterxml.Zz_;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Zb extends Zp implements Comparable<Zb> {
  private static final Zz Zp;
  
  protected final boolean ZU;
  
  protected final Zf<?> ZW;
  
  protected final Zt Zf;
  
  protected final Zr ZN;
  
  protected final Zr Zt;
  
  protected Zi3<Zi6> Zk;
  
  protected Zi3<Zin> ZA;
  
  protected Zi3<Ziq> ZJ;
  
  protected Zi3<Ziq> Zb;
  
  protected transient Zyb Zc;
  
  protected transient Zz ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb(Zf<?> paramZf, Zt paramZt, boolean paramBoolean, Zr paramZr) {
    this(paramZf, paramZt, paramBoolean, paramZr, paramZr);
  }
  
  protected Zb(Zf<?> paramZf, Zt paramZt, boolean paramBoolean, Zr paramZr1, Zr paramZr2) {
    this.ZW = paramZf;
    this.Zf = paramZt;
    this.Zt = paramZr1;
    this.ZN = paramZr2;
    this.ZU = paramBoolean;
  }
  
  protected Zb(Zb paramZb, Zr paramZr) {
    this.ZW = paramZb.ZW;
    this.Zf = paramZb.Zf;
    this.Zt = paramZb.Zt;
    this.ZN = paramZr;
    this.Zk = paramZb.Zk;
    this.ZA = paramZb.ZA;
    this.ZJ = paramZb.ZJ;
    this.Zb = paramZb.Zb;
    this.ZU = paramZb.ZU;
  }
  
  public Zb Zk(Zr paramZr) {
    return new Zb(this, paramZr);
  }
  
  public Zb Zb(String paramString) {
    Zr zr = this.ZN.ZJ(paramString);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zr == this.ZN) ? this : new Zb(this, zr);
  }
  
  public int ZH(Zb paramZb) {
    try {
      if (this.ZA != null) {
        try {
          if (paramZb.ZA == null)
            return -1; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        try {
          if (paramZb.ZA != null)
            return 1; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return ZT().compareTo(paramZb.ZT());
  }
  
  public String ZT() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.ZN == null) ? null : this.ZN.Zb();
  }
  
  public Zr ZU() {
    return this.ZN;
  }
  
  public boolean ZL(Zr paramZr) {
    return this.ZN.equals(paramZr);
  }
  
  public String ZW() {
    return this.Zt.Zb();
  }
  
  public Zr ZV() {
    Ziz ziz = Zu();
    try {
      if (ziz != null) {
        try {
          if (this.Zf == null);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return this.Zf.ZP(ziz);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public boolean Zb() {
    try {
      if (!ZB(this.Zk))
        try {
          if (!ZB(this.ZJ))
            try {
              if (!ZB(this.Zb)) {
                try {
                  if (ZT(this.ZA));
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                return false;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public boolean ZF() {
    try {
      if (!ZT(this.Zk))
        try {
          if (!ZT(this.ZJ))
            try {
              if (!ZT(this.Zb)) {
                try {
                  if (ZT(this.ZA));
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                return false;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public Zyb ZC() {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zc : Lcom/fasterxml/Zor/Zyb;
    //   8: ifnonnull -> 191
    //   11: aload_0
    //   12: invokevirtual ZH : ()Lcom/fasterxml/Zoz/Ziz;
    //   15: astore_2
    //   16: aload_2
    //   17: ifnonnull -> 38
    //   20: aload_0
    //   21: getstatic com/fasterxml/Zor/Zyb.Zf : Lcom/fasterxml/Zor/Zyb;
    //   24: putfield Zc : Lcom/fasterxml/Zor/Zyb;
    //   27: iload_1
    //   28: ifeq -> 191
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: aload_0
    //   39: getfield Zf : Lcom/fasterxml/Zor/Zt;
    //   42: aload_2
    //   43: invokevirtual ZZ : (Lcom/fasterxml/Zoz/Ziz;)Ljava/lang/Boolean;
    //   46: astore_3
    //   47: aload_0
    //   48: getfield Zf : Lcom/fasterxml/Zor/Zt;
    //   51: aload_2
    //   52: invokevirtual Z_ : (Lcom/fasterxml/Zoz/Ziv;)Ljava/lang/String;
    //   55: astore #4
    //   57: aload_0
    //   58: getfield Zf : Lcom/fasterxml/Zor/Zt;
    //   61: aload_2
    //   62: invokevirtual ZM : (Lcom/fasterxml/Zoz/Ziv;)Ljava/lang/Integer;
    //   65: astore #5
    //   67: aload_0
    //   68: getfield Zf : Lcom/fasterxml/Zor/Zt;
    //   71: aload_2
    //   72: invokevirtual Zu : (Lcom/fasterxml/Zoz/Ziv;)Ljava/lang/String;
    //   75: astore #6
    //   77: aload_3
    //   78: ifnonnull -> 143
    //   81: aload #5
    //   83: ifnonnull -> 143
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   92: athrow
    //   93: aload #6
    //   95: ifnonnull -> 143
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   104: athrow
    //   105: aload_0
    //   106: aload #4
    //   108: ifnonnull -> 128
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   117: athrow
    //   118: getstatic com/fasterxml/Zor/Zyb.Zf : Lcom/fasterxml/Zor/Zyb;
    //   121: goto -> 136
    //   124: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   127: athrow
    //   128: getstatic com/fasterxml/Zor/Zyb.Zf : Lcom/fasterxml/Zor/Zyb;
    //   131: aload #4
    //   133: invokevirtual ZC : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zyb;
    //   136: putfield Zc : Lcom/fasterxml/Zor/Zyb;
    //   139: iload_1
    //   140: ifeq -> 164
    //   143: aload_0
    //   144: aload_3
    //   145: aload #4
    //   147: aload #5
    //   149: aload #6
    //   151: invokestatic ZB : (Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/fasterxml/Zor/Zyb;
    //   154: putfield Zc : Lcom/fasterxml/Zor/Zyb;
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   163: athrow
    //   164: aload_0
    //   165: getfield ZU : Z
    //   168: ifne -> 191
    //   171: aload_0
    //   172: aload_0
    //   173: aload_0
    //   174: getfield Zc : Lcom/fasterxml/Zor/Zyb;
    //   177: aload_2
    //   178: invokevirtual ZZ : (Lcom/fasterxml/Zor/Zyb;Lcom/fasterxml/Zoz/Ziz;)Lcom/fasterxml/Zor/Zyb;
    //   181: putfield Zc : Lcom/fasterxml/Zor/Zyb;
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   190: athrow
    //   191: aload_0
    //   192: getfield Zc : Lcom/fasterxml/Zor/Zyb;
    //   195: areturn
    // Exception table:
    //   from	to	target	type
    //   16	31	34	java/lang/IllegalArgumentException
    //   77	86	89	java/lang/IllegalArgumentException
    //   81	98	101	java/lang/IllegalArgumentException
    //   93	111	114	java/lang/IllegalArgumentException
    //   105	124	124	java/lang/IllegalArgumentException
    //   136	157	160	java/lang/IllegalArgumentException
    //   164	184	187	java/lang/IllegalArgumentException
  }
  
  protected Zyb ZZ(Zyb paramZyb, Ziz paramZiz) {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aconst_null
    //   3: astore #4
    //   5: aconst_null
    //   6: astore #5
    //   8: aload_0
    //   9: invokevirtual Zj : ()Lcom/fasterxml/Zoz/Ziz;
    //   12: astore #6
    //   14: aload_2
    //   15: ifnull -> 245
    //   18: aload_0
    //   19: getfield Zf : Lcom/fasterxml/Zor/Zt;
    //   22: ifnull -> 108
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   31: athrow
    //   32: aload #6
    //   34: ifnull -> 79
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   43: athrow
    //   44: aload_0
    //   45: getfield Zf : Lcom/fasterxml/Zor/Zt;
    //   48: aload_2
    //   49: invokevirtual Zy : (Lcom/fasterxml/Zoz/Ziv;)Ljava/lang/Boolean;
    //   52: astore #7
    //   54: aload #7
    //   56: ifnull -> 79
    //   59: iconst_0
    //   60: istore_3
    //   61: aload #7
    //   63: invokevirtual booleanValue : ()Z
    //   66: ifeq -> 79
    //   69: aload_1
    //   70: aload #6
    //   72: invokestatic ZV : (Lcom/fasterxml/Zoz/Ziz;)Lcom/fasterxml/Zor/Zd;
    //   75: invokevirtual Zi : (Lcom/fasterxml/Zor/Zd;)Lcom/fasterxml/Zor/Zyb;
    //   78: astore_1
    //   79: aload_0
    //   80: getfield Zf : Lcom/fasterxml/Zor/Zt;
    //   83: aload_2
    //   84: invokevirtual ZO : (Lcom/fasterxml/Zoz/Ziv;)Lcom/fasterxml/Zyk;
    //   87: astore #7
    //   89: aload #7
    //   91: ifnull -> 108
    //   94: aload #7
    //   96: invokevirtual ZI : ()Lcom/fasterxml/Zvg;
    //   99: astore #4
    //   101: aload #7
    //   103: invokevirtual ZV : ()Lcom/fasterxml/Zvg;
    //   106: astore #5
    //   108: iload_3
    //   109: ifne -> 136
    //   112: aload #4
    //   114: ifnull -> 136
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   123: athrow
    //   124: aload #5
    //   126: ifnonnull -> 245
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   135: athrow
    //   136: aload_0
    //   137: aload_2
    //   138: invokevirtual ZM : (Lcom/fasterxml/Zoz/Ziz;)Ljava/lang/Class;
    //   141: astore #7
    //   143: aload_0
    //   144: getfield ZW : Lcom/fasterxml/Zj/Zf;
    //   147: aload #7
    //   149: invokevirtual ZM : (Ljava/lang/Class;)Lcom/fasterxml/Zj/Z_;
    //   152: astore #8
    //   154: aload #8
    //   156: invokevirtual Zs : ()Lcom/fasterxml/Zyk;
    //   159: astore #9
    //   161: aload #9
    //   163: ifnull -> 197
    //   166: aload #4
    //   168: ifnonnull -> 185
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   177: athrow
    //   178: aload #9
    //   180: invokevirtual ZI : ()Lcom/fasterxml/Zvg;
    //   183: astore #4
    //   185: aload #5
    //   187: ifnonnull -> 197
    //   190: aload #9
    //   192: invokevirtual ZV : ()Lcom/fasterxml/Zvg;
    //   195: astore #5
    //   197: iload_3
    //   198: ifeq -> 245
    //   201: aload #6
    //   203: ifnull -> 245
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   212: athrow
    //   213: aload #8
    //   215: invokevirtual ZW : ()Ljava/lang/Boolean;
    //   218: astore #10
    //   220: aload #10
    //   222: ifnull -> 245
    //   225: iconst_0
    //   226: istore_3
    //   227: aload #10
    //   229: invokevirtual booleanValue : ()Z
    //   232: ifeq -> 245
    //   235: aload_1
    //   236: aload #6
    //   238: invokestatic ZB : (Lcom/fasterxml/Zoz/Ziz;)Lcom/fasterxml/Zor/Zd;
    //   241: invokevirtual Zi : (Lcom/fasterxml/Zor/Zd;)Lcom/fasterxml/Zor/Zyb;
    //   244: astore_1
    //   245: iload_3
    //   246: ifne -> 273
    //   249: aload #4
    //   251: ifnull -> 273
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   260: athrow
    //   261: aload #5
    //   263: ifnonnull -> 352
    //   266: goto -> 273
    //   269: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   272: athrow
    //   273: aload_0
    //   274: getfield ZW : Lcom/fasterxml/Zj/Zf;
    //   277: invokevirtual ZF : ()Lcom/fasterxml/Zyk;
    //   280: astore #7
    //   282: aload #4
    //   284: ifnonnull -> 294
    //   287: aload #7
    //   289: invokevirtual ZI : ()Lcom/fasterxml/Zvg;
    //   292: astore #4
    //   294: aload #5
    //   296: ifnonnull -> 306
    //   299: aload #7
    //   301: invokevirtual ZV : ()Lcom/fasterxml/Zvg;
    //   304: astore #5
    //   306: iload_3
    //   307: ifeq -> 352
    //   310: aload_0
    //   311: getfield ZW : Lcom/fasterxml/Zj/Zf;
    //   314: invokevirtual Zv : ()Ljava/lang/Boolean;
    //   317: astore #8
    //   319: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   322: aload #8
    //   324: invokevirtual equals : (Ljava/lang/Object;)Z
    //   327: ifeq -> 352
    //   330: aload #6
    //   332: ifnull -> 352
    //   335: goto -> 342
    //   338: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   341: athrow
    //   342: aload_1
    //   343: aload #6
    //   345: invokestatic Zb : (Lcom/fasterxml/Zoz/Ziz;)Lcom/fasterxml/Zor/Zd;
    //   348: invokevirtual Zi : (Lcom/fasterxml/Zor/Zd;)Lcom/fasterxml/Zor/Zyb;
    //   351: astore_1
    //   352: aload #4
    //   354: ifnonnull -> 369
    //   357: aload #5
    //   359: ifnull -> 378
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   368: athrow
    //   369: aload_1
    //   370: aload #4
    //   372: aload #5
    //   374: invokevirtual Zr : (Lcom/fasterxml/Zvg;Lcom/fasterxml/Zvg;)Lcom/fasterxml/Zor/Zyb;
    //   377: astore_1
    //   378: aload_1
    //   379: areturn
    // Exception table:
    //   from	to	target	type
    //   14	25	28	java/lang/IllegalArgumentException
    //   18	37	40	java/lang/IllegalArgumentException
    //   108	117	120	java/lang/IllegalArgumentException
    //   112	129	132	java/lang/IllegalArgumentException
    //   161	171	174	java/lang/IllegalArgumentException
    //   197	206	209	java/lang/IllegalArgumentException
    //   245	254	257	java/lang/IllegalArgumentException
    //   249	266	269	java/lang/IllegalArgumentException
    //   319	335	338	java/lang/IllegalArgumentException
    //   352	362	365	java/lang/IllegalArgumentException
  }
  
  public Zk ZB() {
    Zi6 zi6;
    Ziq ziq;
    if (this.ZU) {
      ziq = Zz();
      if (ziq == null) {
        zi6 = ZY();
        try {
          if (zi6 == null)
            return Zi.Zs(); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
      return zi6.Zf();
    } 
    Zin zin = ZN();
    if (zin == null) {
      ziq = Zi();
      try {
        if (ziq != null)
          return ziq.ZV(0); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      zi6 = ZY();
    } 
    if (zi6 == null) {
      ziq = Zz();
      try {
        if (ziq == null)
          return Zi.Zs(); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return ziq.Zf();
  }
  
  public Class<?> Zx() {
    return ZB().Zf();
  }
  
  public boolean ZA() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.ZJ != null);
  }
  
  public boolean Zg() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.Zb != null);
  }
  
  public boolean Zy() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.Zk != null);
  }
  
  public boolean Zf() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.ZA != null);
  }
  
  public boolean Zv() {
    try {
      if (this.ZA == null)
        try {
          if (this.Zb == null) {
            try {
              if (this.Zk != null)
                try {
                  if (ZV(this.Zk));
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                }  
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return false;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public boolean Zc() {
    try {
      if (this.ZJ == null) {
        try {
          if (this.Zk != null);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public Ziq Zz() {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: aload_0
    //   4: getfield ZJ : Lcom/fasterxml/Zoz/Zi3;
    //   7: astore_2
    //   8: istore_1
    //   9: aload_2
    //   10: ifnonnull -> 19
    //   13: aconst_null
    //   14: areturn
    //   15: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   18: athrow
    //   19: aload_2
    //   20: getfield ZM : Lcom/fasterxml/Zoz/Zi3;
    //   23: astore_3
    //   24: aload_3
    //   25: ifnonnull -> 40
    //   28: aload_2
    //   29: getfield Zm : Ljava/lang/Object;
    //   32: checkcast com/fasterxml/Zoz/Ziq
    //   35: areturn
    //   36: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   39: athrow
    //   40: aload_3
    //   41: ifnull -> 279
    //   44: aload_2
    //   45: getfield Zm : Ljava/lang/Object;
    //   48: checkcast com/fasterxml/Zoz/Ziq
    //   51: invokevirtual ZE : ()Ljava/lang/Class;
    //   54: astore #4
    //   56: aload_3
    //   57: getfield Zm : Ljava/lang/Object;
    //   60: checkcast com/fasterxml/Zoz/Ziq
    //   63: invokevirtual ZE : ()Ljava/lang/Class;
    //   66: astore #5
    //   68: aload #4
    //   70: aload #5
    //   72: if_acmpeq -> 126
    //   75: aload #4
    //   77: aload #5
    //   79: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   82: ifeq -> 98
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   91: athrow
    //   92: aload_3
    //   93: astore_2
    //   94: iload_1
    //   95: ifeq -> 270
    //   98: aload #5
    //   100: aload #4
    //   102: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   105: ifeq -> 126
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   114: athrow
    //   115: iload_1
    //   116: ifeq -> 270
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   125: athrow
    //   126: aload_0
    //   127: aload_3
    //   128: getfield Zm : Ljava/lang/Object;
    //   131: checkcast com/fasterxml/Zoz/Ziq
    //   134: invokevirtual Zx : (Lcom/fasterxml/Zoz/Ziq;)I
    //   137: istore #6
    //   139: aload_0
    //   140: aload_2
    //   141: getfield Zm : Ljava/lang/Object;
    //   144: checkcast com/fasterxml/Zoz/Ziq
    //   147: invokevirtual Zx : (Lcom/fasterxml/Zoz/Ziq;)I
    //   150: istore #7
    //   152: iload #6
    //   154: iload #7
    //   156: if_icmpeq -> 179
    //   159: iload #6
    //   161: iload #7
    //   163: if_icmpge -> 270
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   172: athrow
    //   173: aload_3
    //   174: astore_2
    //   175: iload_1
    //   176: ifeq -> 270
    //   179: new java/lang/IllegalArgumentException
    //   182: dup
    //   183: new java/lang/StringBuilder
    //   186: dup
    //   187: invokespecial <init> : ()V
    //   190: sipush #-4347
    //   193: sipush #-3850
    //   196: invokestatic a : (II)Ljava/lang/String;
    //   199: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: aload_0
    //   203: invokevirtual ZT : ()Ljava/lang/String;
    //   206: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: sipush #-4333
    //   212: sipush #-5282
    //   215: invokestatic a : (II)Ljava/lang/String;
    //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: aload_2
    //   222: getfield Zm : Ljava/lang/Object;
    //   225: checkcast com/fasterxml/Zoz/Ziq
    //   228: invokevirtual Zo : ()Ljava/lang/String;
    //   231: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: sipush #-4337
    //   237: sipush #7289
    //   240: invokestatic a : (II)Ljava/lang/String;
    //   243: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: aload_3
    //   247: getfield Zm : Ljava/lang/Object;
    //   250: checkcast com/fasterxml/Zoz/Ziq
    //   253: invokevirtual Zo : ()Ljava/lang/String;
    //   256: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: invokevirtual toString : ()Ljava/lang/String;
    //   262: invokespecial <init> : (Ljava/lang/String;)V
    //   265: athrow
    //   266: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   269: athrow
    //   270: aload_3
    //   271: getfield ZM : Lcom/fasterxml/Zoz/Zi3;
    //   274: astore_3
    //   275: iload_1
    //   276: ifeq -> 40
    //   279: aload_0
    //   280: aload_2
    //   281: invokevirtual Zx : ()Lcom/fasterxml/Zoz/Zi3;
    //   284: putfield ZJ : Lcom/fasterxml/Zoz/Zi3;
    //   287: aload_2
    //   288: getfield Zm : Ljava/lang/Object;
    //   291: checkcast com/fasterxml/Zoz/Ziq
    //   294: areturn
    // Exception table:
    //   from	to	target	type
    //   9	15	15	java/lang/IllegalArgumentException
    //   24	36	36	java/lang/IllegalArgumentException
    //   68	85	88	java/lang/IllegalArgumentException
    //   94	108	111	java/lang/IllegalArgumentException
    //   98	119	122	java/lang/IllegalArgumentException
    //   152	166	169	java/lang/IllegalArgumentException
    //   175	266	266	java/lang/IllegalArgumentException
  }
  
  protected Ziq Zn() {
    Zi3<Ziq> zi3 = this.ZJ;
    try {
      if (zi3 == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (Ziq)zi3.Zm;
  }
  
  public Ziq Zi() {
    // Byte code:
    //   0: invokestatic ZM : ()I
    //   3: aload_0
    //   4: getfield Zb : Lcom/fasterxml/Zoz/Zi3;
    //   7: astore_2
    //   8: istore_1
    //   9: aload_2
    //   10: ifnonnull -> 19
    //   13: aconst_null
    //   14: areturn
    //   15: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   18: athrow
    //   19: aload_2
    //   20: getfield ZM : Lcom/fasterxml/Zoz/Zi3;
    //   23: astore_3
    //   24: aload_3
    //   25: ifnonnull -> 40
    //   28: aload_2
    //   29: getfield Zm : Ljava/lang/Object;
    //   32: checkcast com/fasterxml/Zoz/Ziq
    //   35: areturn
    //   36: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   39: athrow
    //   40: aload_3
    //   41: ifnull -> 126
    //   44: aload_0
    //   45: aload_2
    //   46: getfield Zm : Ljava/lang/Object;
    //   49: checkcast com/fasterxml/Zoz/Ziq
    //   52: aload_3
    //   53: getfield Zm : Ljava/lang/Object;
    //   56: checkcast com/fasterxml/Zoz/Ziq
    //   59: invokevirtual Zg : (Lcom/fasterxml/Zoz/Ziq;Lcom/fasterxml/Zoz/Ziq;)Lcom/fasterxml/Zoz/Ziq;
    //   62: astore #4
    //   64: aload #4
    //   66: aload_2
    //   67: getfield Zm : Ljava/lang/Object;
    //   70: if_acmpne -> 84
    //   73: iload_1
    //   74: ifne -> 117
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   83: athrow
    //   84: aload #4
    //   86: aload_3
    //   87: getfield Zm : Ljava/lang/Object;
    //   90: if_acmpne -> 106
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   99: athrow
    //   100: aload_3
    //   101: astore_2
    //   102: iload_1
    //   103: ifne -> 117
    //   106: aload_0
    //   107: aload_2
    //   108: aload_3
    //   109: invokevirtual ZA : (Lcom/fasterxml/Zoz/Zi3;Lcom/fasterxml/Zoz/Zi3;)Lcom/fasterxml/Zoz/Ziq;
    //   112: areturn
    //   113: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   116: athrow
    //   117: aload_3
    //   118: getfield ZM : Lcom/fasterxml/Zoz/Zi3;
    //   121: astore_3
    //   122: iload_1
    //   123: ifne -> 40
    //   126: aload_0
    //   127: aload_2
    //   128: invokevirtual Zx : ()Lcom/fasterxml/Zoz/Zi3;
    //   131: putfield Zb : Lcom/fasterxml/Zoz/Zi3;
    //   134: aload_2
    //   135: getfield Zm : Ljava/lang/Object;
    //   138: checkcast com/fasterxml/Zoz/Ziq
    //   141: areturn
    // Exception table:
    //   from	to	target	type
    //   9	15	15	java/lang/IllegalArgumentException
    //   24	36	36	java/lang/IllegalArgumentException
    //   64	77	80	java/lang/IllegalArgumentException
    //   73	93	96	java/lang/IllegalArgumentException
    //   102	113	113	java/lang/IllegalArgumentException
  }
  
  protected Ziq Zl() {
    Zi3<Ziq> zi3 = this.Zb;
    try {
      if (zi3 == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (Ziq)zi3.Zm;
  }
  
  protected Ziq ZA(Zi3<Ziq> paramZi31, Zi3<Ziq> paramZi32) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: aload #4
    //   11: aload_1
    //   12: getfield Zm : Ljava/lang/Object;
    //   15: invokeinterface add : (Ljava/lang/Object;)Z
    //   20: pop
    //   21: invokestatic ZM : ()I
    //   24: aload #4
    //   26: aload_2
    //   27: getfield Zm : Ljava/lang/Object;
    //   30: invokeinterface add : (Ljava/lang/Object;)Z
    //   35: pop
    //   36: aload_2
    //   37: getfield ZM : Lcom/fasterxml/Zoz/Zi3;
    //   40: astore_2
    //   41: istore_3
    //   42: aload_2
    //   43: ifnull -> 143
    //   46: aload_0
    //   47: aload_1
    //   48: getfield Zm : Ljava/lang/Object;
    //   51: checkcast com/fasterxml/Zoz/Ziq
    //   54: aload_2
    //   55: getfield Zm : Ljava/lang/Object;
    //   58: checkcast com/fasterxml/Zoz/Ziq
    //   61: invokevirtual Zg : (Lcom/fasterxml/Zoz/Ziq;Lcom/fasterxml/Zoz/Ziq;)Lcom/fasterxml/Zoz/Ziq;
    //   64: astore #5
    //   66: aload #5
    //   68: aload_1
    //   69: getfield Zm : Ljava/lang/Object;
    //   72: if_acmpne -> 86
    //   75: iload_3
    //   76: ifne -> 134
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   85: athrow
    //   86: aload #5
    //   88: aload_2
    //   89: getfield Zm : Ljava/lang/Object;
    //   92: if_acmpne -> 115
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   101: athrow
    //   102: aload #4
    //   104: invokeinterface clear : ()V
    //   109: aload_2
    //   110: astore_1
    //   111: iload_3
    //   112: ifne -> 134
    //   115: aload #4
    //   117: aload_2
    //   118: getfield Zm : Ljava/lang/Object;
    //   121: invokeinterface add : (Ljava/lang/Object;)Z
    //   126: pop
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   133: athrow
    //   134: aload_2
    //   135: getfield ZM : Lcom/fasterxml/Zoz/Zi3;
    //   138: astore_2
    //   139: iload_3
    //   140: ifne -> 42
    //   143: aload #4
    //   145: invokeinterface isEmpty : ()Z
    //   150: ifeq -> 173
    //   153: aload_0
    //   154: aload_1
    //   155: invokevirtual Zx : ()Lcom/fasterxml/Zoz/Zi3;
    //   158: putfield Zb : Lcom/fasterxml/Zoz/Zi3;
    //   161: aload_1
    //   162: getfield Zm : Ljava/lang/Object;
    //   165: checkcast com/fasterxml/Zoz/Ziq
    //   168: areturn
    //   169: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   172: athrow
    //   173: aload #4
    //   175: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   180: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   185: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   190: sipush #-4339
    //   193: sipush #-17360
    //   196: invokestatic a : (II)Ljava/lang/String;
    //   199: invokestatic joining : (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
    //   202: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   207: checkcast java/lang/String
    //   210: astore #5
    //   212: new java/lang/IllegalArgumentException
    //   215: dup
    //   216: sipush #-4340
    //   219: sipush #8292
    //   222: invokestatic a : (II)Ljava/lang/String;
    //   225: iconst_2
    //   226: anewarray java/lang/Object
    //   229: dup
    //   230: iconst_0
    //   231: aload_0
    //   232: invokevirtual ZT : ()Ljava/lang/String;
    //   235: aastore
    //   236: dup
    //   237: iconst_1
    //   238: aload #5
    //   240: aastore
    //   241: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   244: invokespecial <init> : (Ljava/lang/String;)V
    //   247: athrow
    // Exception table:
    //   from	to	target	type
    //   66	79	82	java/lang/IllegalArgumentException
    //   75	95	98	java/lang/IllegalArgumentException
    //   111	127	130	java/lang/IllegalArgumentException
    //   143	169	169	java/lang/IllegalArgumentException
  }
  
  protected Ziq Zg(Ziq paramZiq1, Ziq paramZiq2) {
    Class<?> clazz1 = paramZiq1.ZE();
    Class<?> clazz2 = paramZiq2.ZE();
    try {
      if (clazz1 != clazz2) {
        try {
          if (clazz1.isAssignableFrom(clazz2))
            return paramZiq2; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (clazz2.isAssignableFrom(clazz1))
            return paramZiq1; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = ZM(paramZiq2);
    int j = ZM(paramZiq1);
    try {
      if (i != j) {
        try {
          if (i < j)
            return paramZiq2; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return paramZiq1;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.Zf == null) ? null : this.Zf.Zs(this.ZW, paramZiq1, paramZiq2);
  }
  
  public Zi6 ZY() {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   8: ifnonnull -> 17
    //   11: aconst_null
    //   12: areturn
    //   13: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   16: athrow
    //   17: aload_0
    //   18: getfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   21: getfield Zm : Ljava/lang/Object;
    //   24: checkcast com/fasterxml/Zoz/Zi6
    //   27: astore_2
    //   28: aload_0
    //   29: getfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   32: getfield ZM : Lcom/fasterxml/Zoz/Zi3;
    //   35: astore_3
    //   36: aload_3
    //   37: ifnull -> 249
    //   40: aload_3
    //   41: getfield Zm : Ljava/lang/Object;
    //   44: checkcast com/fasterxml/Zoz/Zi6
    //   47: astore #4
    //   49: aload_2
    //   50: invokevirtual ZE : ()Ljava/lang/Class;
    //   53: astore #5
    //   55: aload #4
    //   57: invokevirtual ZE : ()Ljava/lang/Class;
    //   60: astore #6
    //   62: aload #5
    //   64: aload #6
    //   66: if_acmpeq -> 121
    //   69: aload #5
    //   71: aload #6
    //   73: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   76: ifeq -> 93
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   85: athrow
    //   86: aload #4
    //   88: astore_2
    //   89: iload_1
    //   90: ifeq -> 240
    //   93: aload #6
    //   95: aload #5
    //   97: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   100: ifeq -> 121
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   109: athrow
    //   110: iload_1
    //   111: ifeq -> 240
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   120: athrow
    //   121: aload_2
    //   122: invokevirtual ZX : ()Z
    //   125: istore #7
    //   127: aload #4
    //   129: invokevirtual ZX : ()Z
    //   132: istore #8
    //   134: iload #7
    //   136: iload #8
    //   138: if_icmpeq -> 160
    //   141: iload #7
    //   143: ifeq -> 240
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   152: athrow
    //   153: aload #4
    //   155: astore_2
    //   156: iload_1
    //   157: ifeq -> 240
    //   160: new java/lang/IllegalArgumentException
    //   163: dup
    //   164: new java/lang/StringBuilder
    //   167: dup
    //   168: invokespecial <init> : ()V
    //   171: sipush #-4345
    //   174: sipush #-17620
    //   177: invokestatic a : (II)Ljava/lang/String;
    //   180: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: aload_0
    //   184: invokevirtual ZT : ()Ljava/lang/String;
    //   187: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: sipush #-4343
    //   193: sipush #-14515
    //   196: invokestatic a : (II)Ljava/lang/String;
    //   199: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: aload_2
    //   203: invokevirtual Zo : ()Ljava/lang/String;
    //   206: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: sipush #-4337
    //   212: sipush #7289
    //   215: invokestatic a : (II)Ljava/lang/String;
    //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: aload #4
    //   223: invokevirtual Zo : ()Ljava/lang/String;
    //   226: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: invokevirtual toString : ()Ljava/lang/String;
    //   232: invokespecial <init> : (Ljava/lang/String;)V
    //   235: athrow
    //   236: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   239: athrow
    //   240: aload_3
    //   241: getfield ZM : Lcom/fasterxml/Zoz/Zi3;
    //   244: astore_3
    //   245: iload_1
    //   246: ifeq -> 36
    //   249: aload_2
    //   250: areturn
    // Exception table:
    //   from	to	target	type
    //   4	13	13	java/lang/IllegalArgumentException
    //   62	79	82	java/lang/IllegalArgumentException
    //   89	103	106	java/lang/IllegalArgumentException
    //   93	114	117	java/lang/IllegalArgumentException
    //   134	146	149	java/lang/IllegalArgumentException
    //   156	236	236	java/lang/IllegalArgumentException
  }
  
  protected Zi6 Zq() {
    Zi3<Zi6> zi3 = this.Zk;
    try {
      if (zi3 == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (Zi6)zi3.Zm;
  }
  
  public Zin ZN() {
    try {
      if (this.ZA == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zi3<Zin> zi3 = this.ZA;
    while (true) {
      if (((Zin)zi3.Zm).Zd() instanceof Zik)
        return (Zin)zi3.Zm; 
      zi3 = zi3.ZM;
      if (zi3 == null)
        return (Zin)this.ZA.Zm; 
    } 
  }
  
  public Iterator<Zin> Zk() {
    try {
      if (this.ZA == null)
        return Zx.Zd(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zi4<>(this.ZA);
  }
  
  public Ziz Zu() {
    try {
      if (this.ZU)
        return Zj(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Ziz ziz = ZE();
    if (ziz == null)
      ziz = Zj(); 
    return ziz;
  }
  
  protected Ziz ZH() {
    try {
      if (this.ZU) {
        try {
          if (this.ZJ != null)
            return (Ziz)this.ZJ.Zm; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (this.Zk != null)
            return (Ziz)this.Zk.Zm; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return null;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.ZA != null)
        return (Ziz)this.ZA.Zm; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.Zb != null)
        return (Ziz)this.Zb.Zm; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.Zk != null)
        return (Ziz)this.Zk.Zm; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.ZJ != null)
        return (Ziz)this.ZJ.Zm; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  protected int Zx(Ziq paramZiq) {
    String str = paramZiq.ZW();
    try {
      if (str.startsWith(a(-4349, 13467)))
        try {
          if (str.length() > 3)
            return 1; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (str.startsWith(a(-4350, -23401)))
        try {
          if (str.length() > 2)
            return 2; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 3;
  }
  
  protected int ZM(Ziq paramZiq) {
    String str = paramZiq.ZW();
    try {
      if (str.startsWith(a(-4346, 13731)))
        try {
          if (str.length() > 3)
            return 1; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 2;
  }
  
  public Class<?>[] ZR() {
    return Zh(new Zil(this));
  }
  
  public Zz Zw() {
    Zz zz = this.ZS;
    try {
      if (zz != null) {
        try {
          if (zz == Zp)
            return null; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return zz;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    zz = Zh(new Zig(this));
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZS = (zz == null) ? Zp : zz;
    return zz;
  }
  
  public boolean ZI() {
    Boolean bool = Zh(new Za(this));
    try {
      if (bool != null)
        try {
          if (bool.booleanValue());
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public Zv ZM() {
    return Zh(new Zi1(this));
  }
  
  public Zz_ Z_() {
    Ziz ziz = Zj();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zz_ zz_ = (this.Zf == null) ? null : this.Zf.Zp(ziz);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zz_ == null) ? Zz_.Zt() : zz_;
  }
  
  public List<Zr> Zp() {
    Ziz ziz = Zu();
    if (ziz != null) {
      List<Zr> list = this.Zf.Ze(ziz);
      try {
        if (list != null)
          return list; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return Collections.emptyList();
  }
  
  public Zyj ZO() {
    return ZP(new Zi9(this), Zyj.AUTO);
  }
  
  public void Zq(Zi6 paramZi6, Zr paramZr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.Zk = new Zi3<>(paramZi6, this.Zk, paramZr, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public void Zf(Zin paramZin, Zr paramZr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.ZA = new Zi3<>(paramZin, this.ZA, paramZr, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public void Zj(Ziq paramZiq, Zr paramZr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.ZJ = new Zi3<>(paramZiq, this.ZJ, paramZr, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public void ZT(Ziq paramZiq, Zr paramZr, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.Zb = new Zi3<>(paramZiq, this.Zb, paramZr, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public void ZX(Zb paramZb) {
    this.Zk = ZX(this.Zk, paramZb.Zk);
    this.ZA = ZX(this.ZA, paramZb.ZA);
    this.ZJ = ZX(this.ZJ, paramZb.ZJ);
    this.Zb = ZX(this.Zb, paramZb.Zb);
  }
  
  private static <T> Zi3<T> ZX(Zi3<T> paramZi31, Zi3<T> paramZi32) {
    try {
      if (paramZi31 == null)
        return paramZi32; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramZi32 == null)
        return paramZi31; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramZi31.Zz(paramZi32);
  }
  
  public void ZG() {
    this.Zk = Zy(this.Zk);
    this.ZJ = Zy(this.ZJ);
    this.Zb = Zy(this.Zb);
    this.ZA = Zy(this.ZA);
  }
  
  public Zyj Za(boolean paramBoolean, Zh paramZh) {
    Zyj zyj = ZO();
    int i = Ziv.Zv();
    if (zyj == null)
      zyj = Zyj.AUTO; 
    try {
      switch (Zi2.ZA[zyj.ordinal()]) {
        case 1:
          if (paramZh != null) {
            paramZh.Zg(ZT());
            for (Zr zr : Zo()) {
              paramZh.Zg(zr.Zb());
              if (i != 0)
                break; 
            } 
          } 
          try {
            this.Zb = null;
            this.ZA = null;
            if (!this.ZU)
              try {
                this.Zk = null;
                if (i != 0);
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          return zyj;
        case 2:
          try {
            if (i != 0);
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          return zyj;
        case 3:
          try {
            this.ZJ = null;
            if (this.ZU)
              try {
                this.Zk = null;
                if (i != 0)
                  break; 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          return zyj;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      this.ZJ = Za(this.ZJ);
      this.ZA = Za(this.ZA);
      if (paramBoolean) {
        try {
          if (this.ZJ == null) {
            this.Zk = Za(this.Zk);
            this.Zb = Za(this.Zb);
            return zyj;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return zyj;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zk = Za(this.Zk);
    this.Zb = Za(this.Zb);
    return zyj;
  }
  
  public void Zs() {
    this.ZA = null;
  }
  
  public void Zm() {
    this.Zk = Zf(this.Zk);
    this.ZJ = Zf(this.ZJ);
    this.Zb = Zf(this.Zb);
    this.ZA = Zf(this.ZA);
  }
  
  public void Zr(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: istore_2
    //   4: iload_1
    //   5: ifeq -> 139
    //   8: aload_0
    //   9: getfield ZJ : Lcom/fasterxml/Zoz/Zi3;
    //   12: ifnull -> 77
    //   15: goto -> 22
    //   18: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   21: athrow
    //   22: aload_0
    //   23: iconst_0
    //   24: iconst_4
    //   25: anewarray com/fasterxml/Zoz/Zi3
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: getfield ZJ : Lcom/fasterxml/Zoz/Zi3;
    //   34: aastore
    //   35: dup
    //   36: iconst_1
    //   37: aload_0
    //   38: getfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   41: aastore
    //   42: dup
    //   43: iconst_2
    //   44: aload_0
    //   45: getfield ZA : Lcom/fasterxml/Zoz/Zi3;
    //   48: aastore
    //   49: dup
    //   50: iconst_3
    //   51: aload_0
    //   52: getfield Zb : Lcom/fasterxml/Zoz/Zi3;
    //   55: aastore
    //   56: invokespecial ZR : (I[Lcom/fasterxml/Zoz/Zi3;)Lcom/fasterxml/Zoz/Zih;
    //   59: astore_3
    //   60: aload_0
    //   61: aload_0
    //   62: aload_0
    //   63: getfield ZJ : Lcom/fasterxml/Zoz/Zi3;
    //   66: aload_3
    //   67: invokespecial ZJ : (Lcom/fasterxml/Zoz/Zi3;Lcom/fasterxml/Zoz/Zih;)Lcom/fasterxml/Zoz/Zi3;
    //   70: putfield ZJ : Lcom/fasterxml/Zoz/Zi3;
    //   73: iload_2
    //   74: ifeq -> 321
    //   77: aload_0
    //   78: getfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   81: ifnull -> 321
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   90: athrow
    //   91: aload_0
    //   92: iconst_0
    //   93: iconst_3
    //   94: anewarray com/fasterxml/Zoz/Zi3
    //   97: dup
    //   98: iconst_0
    //   99: aload_0
    //   100: getfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   103: aastore
    //   104: dup
    //   105: iconst_1
    //   106: aload_0
    //   107: getfield ZA : Lcom/fasterxml/Zoz/Zi3;
    //   110: aastore
    //   111: dup
    //   112: iconst_2
    //   113: aload_0
    //   114: getfield Zb : Lcom/fasterxml/Zoz/Zi3;
    //   117: aastore
    //   118: invokespecial ZR : (I[Lcom/fasterxml/Zoz/Zi3;)Lcom/fasterxml/Zoz/Zih;
    //   121: astore_3
    //   122: aload_0
    //   123: aload_0
    //   124: aload_0
    //   125: getfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   128: aload_3
    //   129: invokespecial ZJ : (Lcom/fasterxml/Zoz/Zi3;Lcom/fasterxml/Zoz/Zih;)Lcom/fasterxml/Zoz/Zi3;
    //   132: putfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   135: iload_2
    //   136: ifeq -> 321
    //   139: aload_0
    //   140: getfield ZA : Lcom/fasterxml/Zoz/Zi3;
    //   143: ifnull -> 208
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   152: athrow
    //   153: aload_0
    //   154: iconst_0
    //   155: iconst_4
    //   156: anewarray com/fasterxml/Zoz/Zi3
    //   159: dup
    //   160: iconst_0
    //   161: aload_0
    //   162: getfield ZA : Lcom/fasterxml/Zoz/Zi3;
    //   165: aastore
    //   166: dup
    //   167: iconst_1
    //   168: aload_0
    //   169: getfield Zb : Lcom/fasterxml/Zoz/Zi3;
    //   172: aastore
    //   173: dup
    //   174: iconst_2
    //   175: aload_0
    //   176: getfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   179: aastore
    //   180: dup
    //   181: iconst_3
    //   182: aload_0
    //   183: getfield ZJ : Lcom/fasterxml/Zoz/Zi3;
    //   186: aastore
    //   187: invokespecial ZR : (I[Lcom/fasterxml/Zoz/Zi3;)Lcom/fasterxml/Zoz/Zih;
    //   190: astore_3
    //   191: aload_0
    //   192: aload_0
    //   193: aload_0
    //   194: getfield ZA : Lcom/fasterxml/Zoz/Zi3;
    //   197: aload_3
    //   198: invokespecial ZJ : (Lcom/fasterxml/Zoz/Zi3;Lcom/fasterxml/Zoz/Zih;)Lcom/fasterxml/Zoz/Zi3;
    //   201: putfield ZA : Lcom/fasterxml/Zoz/Zi3;
    //   204: iload_2
    //   205: ifeq -> 321
    //   208: aload_0
    //   209: getfield Zb : Lcom/fasterxml/Zoz/Zi3;
    //   212: ifnull -> 270
    //   215: goto -> 222
    //   218: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   221: athrow
    //   222: aload_0
    //   223: iconst_0
    //   224: iconst_3
    //   225: anewarray com/fasterxml/Zoz/Zi3
    //   228: dup
    //   229: iconst_0
    //   230: aload_0
    //   231: getfield Zb : Lcom/fasterxml/Zoz/Zi3;
    //   234: aastore
    //   235: dup
    //   236: iconst_1
    //   237: aload_0
    //   238: getfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   241: aastore
    //   242: dup
    //   243: iconst_2
    //   244: aload_0
    //   245: getfield ZJ : Lcom/fasterxml/Zoz/Zi3;
    //   248: aastore
    //   249: invokespecial ZR : (I[Lcom/fasterxml/Zoz/Zi3;)Lcom/fasterxml/Zoz/Zih;
    //   252: astore_3
    //   253: aload_0
    //   254: aload_0
    //   255: aload_0
    //   256: getfield Zb : Lcom/fasterxml/Zoz/Zi3;
    //   259: aload_3
    //   260: invokespecial ZJ : (Lcom/fasterxml/Zoz/Zi3;Lcom/fasterxml/Zoz/Zih;)Lcom/fasterxml/Zoz/Zi3;
    //   263: putfield Zb : Lcom/fasterxml/Zoz/Zi3;
    //   266: iload_2
    //   267: ifeq -> 321
    //   270: aload_0
    //   271: getfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   274: ifnull -> 321
    //   277: goto -> 284
    //   280: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   283: athrow
    //   284: aload_0
    //   285: iconst_0
    //   286: iconst_2
    //   287: anewarray com/fasterxml/Zoz/Zi3
    //   290: dup
    //   291: iconst_0
    //   292: aload_0
    //   293: getfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   296: aastore
    //   297: dup
    //   298: iconst_1
    //   299: aload_0
    //   300: getfield ZJ : Lcom/fasterxml/Zoz/Zi3;
    //   303: aastore
    //   304: invokespecial ZR : (I[Lcom/fasterxml/Zoz/Zi3;)Lcom/fasterxml/Zoz/Zih;
    //   307: astore_3
    //   308: aload_0
    //   309: aload_0
    //   310: aload_0
    //   311: getfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   314: aload_3
    //   315: invokespecial ZJ : (Lcom/fasterxml/Zoz/Zi3;Lcom/fasterxml/Zoz/Zih;)Lcom/fasterxml/Zoz/Zi3;
    //   318: putfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   321: return
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/lang/IllegalArgumentException
    //   60	84	87	java/lang/IllegalArgumentException
    //   122	146	149	java/lang/IllegalArgumentException
    //   191	215	218	java/lang/IllegalArgumentException
    //   253	277	280	java/lang/IllegalArgumentException
  }
  
  private Zih ZR(int paramInt, Zi3<? extends Ziz>... paramVarArgs) {
    Zih zih = ZZ(paramVarArgs[paramInt]);
    while (++paramInt < paramVarArgs.length) {
      if (paramVarArgs[paramInt] != null)
        return Zih.ZX(zih, ZR(paramInt, paramVarArgs)); 
    } 
    return zih;
  }
  
  private <T extends Ziz> Zih ZZ(Zi3<T> paramZi3) {
    Zih zih = ((Ziz)paramZi3.Zm).Zx();
    if (paramZi3.ZM != null)
      zih = Zih.ZX(zih, ZZ(paramZi3.ZM)); 
    return zih;
  }
  
  private <T extends Ziz> Zi3<T> ZJ(Zi3<T> paramZi3, Zih paramZih) {
    Ziz ziz = (Ziz)((Ziz)paramZi3.Zm).ZE(paramZih);
    if (paramZi3.ZM != null)
      paramZi3 = paramZi3.ZQ(ZJ(paramZi3.ZM, paramZih)); 
    return paramZi3.Zo((T)ziz);
  }
  
  private <T> Zi3<T> Zy(Zi3<T> paramZi3) {
    try {
      if (paramZi3 == null)
        return paramZi3; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramZi3.ZY();
  }
  
  private <T> Zi3<T> Za(Zi3<T> paramZi3) {
    try {
      if (paramZi3 == null)
        return paramZi3; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramZi3.Zr();
  }
  
  private <T> Zi3<T> Zf(Zi3<T> paramZi3) {
    try {
      if (paramZi3 == null)
        return paramZi3; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramZi3.Zz();
  }
  
  private <T> boolean ZB(Zi3<T> paramZi3) {
    int i = Ziv.ZM();
    while (paramZi3 != null) {
      try {
        if (paramZi3.ZE != null)
          try {
            if (paramZi3.ZE.ZA())
              return true; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      paramZi3 = paramZi3.ZM;
      if (i == 0)
        break; 
    } 
    return false;
  }
  
  private <T> boolean ZT(Zi3<T> paramZi3) {
    int i = Ziv.ZM();
    while (paramZi3 != null) {
      try {
        if (paramZi3.ZE != null)
          try {
            if (paramZi3.Zo)
              return true; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      paramZi3 = paramZi3.ZM;
      if (i == 0)
        break; 
    } 
    return false;
  }
  
  public boolean Za() {
    try {
      if (!ZV(this.Zk))
        try {
          if (!ZV(this.ZJ))
            try {
              if (!ZV(this.Zb)) {
                try {
                  if (ZV(this.ZA));
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                return false;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private <T> boolean ZV(Zi3<T> paramZi3) {
    int i = Ziv.ZM();
    while (paramZi3 != null) {
      try {
        if (paramZi3.ZT)
          return true; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      paramZi3 = paramZi3.ZM;
      if (i == 0)
        break; 
    } 
    return false;
  }
  
  public boolean ZZ() {
    try {
      if (!ZX(this.Zk))
        try {
          if (!ZX(this.ZJ))
            try {
              if (!ZX(this.Zb)) {
                try {
                  if (ZX(this.ZA));
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                return false;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private <T> boolean ZX(Zi3<T> paramZi3) {
    int i = Ziv.Zv();
    while (paramZi3 != null) {
      try {
        if (paramZi3.Zd)
          return true; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      paramZi3 = paramZi3.ZM;
      if (i != 0)
        break; 
    } 
    return false;
  }
  
  public boolean ZX() {
    try {
      if (!Zb(this.Zk))
        try {
          if (!Zb(this.ZJ))
            try {
              if (!Zb(this.Zb)) {
                try {
                  if (Zt(this.ZA));
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                return false;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private <T> boolean Zb(Zi3<T> paramZi3) {
    int i = Ziv.Zv();
    while (paramZi3 != null) {
      try {
        if (!paramZi3.Zd)
          try {
            if (paramZi3.ZE != null)
              try {
                if (paramZi3.ZE.ZA())
                  return true; 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      paramZi3 = paramZi3.ZM;
      if (i != 0)
        break; 
    } 
    return false;
  }
  
  private <T> boolean Zt(Zi3<T> paramZi3) {
    int i = Ziv.ZM();
    while (paramZi3 != null) {
      try {
        if (!paramZi3.Zd)
          try {
            if (paramZi3.ZE != null)
              try {
                if (paramZi3.Zo)
                  return true; 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      paramZi3 = paramZi3.ZM;
      if (i == 0)
        break; 
    } 
    return false;
  }
  
  public Set<Zr> Zo() {
    Set<Zr> set = null;
    set = ZI((Zi3)this.Zk, set);
    set = ZI((Zi3)this.ZJ, set);
    set = ZI((Zi3)this.Zb, set);
    set = ZI((Zi3)this.ZA, set);
    try {
      if (set == null)
        return Collections.emptySet(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return set;
  }
  
  public Collection<Zb> Zl(Collection<Zr> paramCollection) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    ZT(paramCollection, (Map)hashMap, this.Zk);
    ZT(paramCollection, (Map)hashMap, this.ZJ);
    ZT(paramCollection, (Map)hashMap, this.Zb);
    ZT(paramCollection, (Map)hashMap, this.ZA);
    return hashMap.values();
  }
  
  private void ZT(Collection<Zr> paramCollection, Map<Zr, Zb> paramMap, Zi3<?> paramZi3) {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: aload_3
    //   4: astore #5
    //   6: aload_3
    //   7: astore #6
    //   9: istore #4
    //   11: aload #6
    //   13: ifnull -> 406
    //   16: aload #6
    //   18: getfield ZE : Lcom/fasterxml/Zor/Zr;
    //   21: astore #7
    //   23: aload #6
    //   25: getfield Zo : Z
    //   28: ifeq -> 43
    //   31: aload #7
    //   33: ifnonnull -> 147
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   42: athrow
    //   43: aload #6
    //   45: getfield ZT : Z
    //   48: ifne -> 70
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   57: athrow
    //   58: iload #4
    //   60: ifeq -> 394
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   69: athrow
    //   70: new java/lang/IllegalStateException
    //   73: dup
    //   74: new java/lang/StringBuilder
    //   77: dup
    //   78: invokespecial <init> : ()V
    //   81: sipush #-4351
    //   84: sipush #9015
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: aload_0
    //   94: getfield ZN : Lcom/fasterxml/Zor/Zr;
    //   97: invokestatic Zk : (Lcom/fasterxml/Zor/Zr;)Ljava/lang/String;
    //   100: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: sipush #-4336
    //   106: sipush #-12303
    //   109: invokestatic a : (II)Ljava/lang/String;
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: aload_1
    //   116: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   119: sipush #-4352
    //   122: sipush #22365
    //   125: invokestatic a : (II)Ljava/lang/String;
    //   128: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: aload #6
    //   133: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   136: invokevirtual toString : ()Ljava/lang/String;
    //   139: invokespecial <init> : (Ljava/lang/String;)V
    //   142: athrow
    //   143: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   146: athrow
    //   147: aload_2
    //   148: aload #7
    //   150: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   155: checkcast com/fasterxml/Zoz/Zb
    //   158: astore #8
    //   160: aload #8
    //   162: ifnonnull -> 203
    //   165: new com/fasterxml/Zoz/Zb
    //   168: dup
    //   169: aload_0
    //   170: getfield ZW : Lcom/fasterxml/Zj/Zf;
    //   173: aload_0
    //   174: getfield Zf : Lcom/fasterxml/Zor/Zt;
    //   177: aload_0
    //   178: getfield ZU : Z
    //   181: aload_0
    //   182: getfield Zt : Lcom/fasterxml/Zor/Zr;
    //   185: aload #7
    //   187: invokespecial <init> : (Lcom/fasterxml/Zj/Zf;Lcom/fasterxml/Zor/Zt;ZLcom/fasterxml/Zor/Zr;Lcom/fasterxml/Zor/Zr;)V
    //   190: astore #8
    //   192: aload_2
    //   193: aload #7
    //   195: aload #8
    //   197: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   202: pop
    //   203: aload #5
    //   205: aload_0
    //   206: getfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   209: if_acmpne -> 236
    //   212: aload #6
    //   214: astore #9
    //   216: aload #8
    //   218: aload #9
    //   220: aload #8
    //   222: getfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   225: invokevirtual ZQ : (Lcom/fasterxml/Zoz/Zi3;)Lcom/fasterxml/Zoz/Zi3;
    //   228: putfield Zk : Lcom/fasterxml/Zoz/Zi3;
    //   231: iload #4
    //   233: ifeq -> 394
    //   236: aload #5
    //   238: aload_0
    //   239: getfield ZJ : Lcom/fasterxml/Zoz/Zi3;
    //   242: if_acmpne -> 276
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   251: athrow
    //   252: aload #6
    //   254: astore #9
    //   256: aload #8
    //   258: aload #9
    //   260: aload #8
    //   262: getfield ZJ : Lcom/fasterxml/Zoz/Zi3;
    //   265: invokevirtual ZQ : (Lcom/fasterxml/Zoz/Zi3;)Lcom/fasterxml/Zoz/Zi3;
    //   268: putfield ZJ : Lcom/fasterxml/Zoz/Zi3;
    //   271: iload #4
    //   273: ifeq -> 394
    //   276: aload #5
    //   278: aload_0
    //   279: getfield Zb : Lcom/fasterxml/Zoz/Zi3;
    //   282: if_acmpne -> 316
    //   285: goto -> 292
    //   288: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   291: athrow
    //   292: aload #6
    //   294: astore #9
    //   296: aload #8
    //   298: aload #9
    //   300: aload #8
    //   302: getfield Zb : Lcom/fasterxml/Zoz/Zi3;
    //   305: invokevirtual ZQ : (Lcom/fasterxml/Zoz/Zi3;)Lcom/fasterxml/Zoz/Zi3;
    //   308: putfield Zb : Lcom/fasterxml/Zoz/Zi3;
    //   311: iload #4
    //   313: ifeq -> 394
    //   316: aload #5
    //   318: aload_0
    //   319: getfield ZA : Lcom/fasterxml/Zoz/Zi3;
    //   322: if_acmpne -> 356
    //   325: goto -> 332
    //   328: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   331: athrow
    //   332: aload #6
    //   334: astore #9
    //   336: aload #8
    //   338: aload #9
    //   340: aload #8
    //   342: getfield ZA : Lcom/fasterxml/Zoz/Zi3;
    //   345: invokevirtual ZQ : (Lcom/fasterxml/Zoz/Zi3;)Lcom/fasterxml/Zoz/Zi3;
    //   348: putfield ZA : Lcom/fasterxml/Zoz/Zi3;
    //   351: iload #4
    //   353: ifeq -> 394
    //   356: new java/lang/IllegalStateException
    //   359: dup
    //   360: new java/lang/StringBuilder
    //   363: dup
    //   364: invokespecial <init> : ()V
    //   367: sipush #-4341
    //   370: sipush #9820
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   379: aload_0
    //   380: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   383: invokevirtual toString : ()Ljava/lang/String;
    //   386: invokespecial <init> : (Ljava/lang/String;)V
    //   389: athrow
    //   390: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   393: athrow
    //   394: aload #6
    //   396: getfield ZM : Lcom/fasterxml/Zoz/Zi3;
    //   399: astore #6
    //   401: iload #4
    //   403: ifeq -> 11
    //   406: return
    // Exception table:
    //   from	to	target	type
    //   23	36	39	java/lang/IllegalArgumentException
    //   31	51	54	java/lang/IllegalArgumentException
    //   43	63	66	java/lang/IllegalArgumentException
    //   58	143	143	java/lang/IllegalArgumentException
    //   216	245	248	java/lang/IllegalArgumentException
    //   256	285	288	java/lang/IllegalArgumentException
    //   296	325	328	java/lang/IllegalArgumentException
    //   336	390	390	java/lang/IllegalArgumentException
  }
  
  private Set<Zr> ZI(Zi3<? extends Ziz> paramZi3, Set<Zr> paramSet) {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: istore_3
    //   4: aload_1
    //   5: ifnull -> 79
    //   8: aload_1
    //   9: getfield Zo : Z
    //   12: ifeq -> 70
    //   15: aload_1
    //   16: getfield ZE : Lcom/fasterxml/Zor/Zr;
    //   19: ifnonnull -> 40
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   28: athrow
    //   29: iload_3
    //   30: ifeq -> 70
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   39: athrow
    //   40: aload_2
    //   41: ifnonnull -> 59
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   50: athrow
    //   51: new java/util/HashSet
    //   54: dup
    //   55: invokespecial <init> : ()V
    //   58: astore_2
    //   59: aload_2
    //   60: aload_1
    //   61: getfield ZE : Lcom/fasterxml/Zor/Zr;
    //   64: invokeinterface add : (Ljava/lang/Object;)Z
    //   69: pop
    //   70: aload_1
    //   71: getfield ZM : Lcom/fasterxml/Zoz/Zi3;
    //   74: astore_1
    //   75: iload_3
    //   76: ifeq -> 4
    //   79: aload_2
    //   80: areturn
    // Exception table:
    //   from	to	target	type
    //   8	22	25	java/lang/IllegalArgumentException
    //   15	33	36	java/lang/IllegalArgumentException
    //   29	44	47	java/lang/IllegalArgumentException
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(-4344, 23394)).append(this.ZN).append(a(-4338, 14927)).append(this.ZA).append(a(-4342, -11612)).append(this.Zk).append(a(-4334, 20296)).append(this.ZJ).append(a(-4348, -27659)).append(this.Zb);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  protected <T> T Zh(Zim<T> paramZim) {
    T t = null;
    try {
      if (this.Zf != null) {
        try {
          if (this.ZU) {
            if (this.ZJ != null)
              t = paramZim.Zq((Ziz)this.ZJ.Zm); 
          } else {
            if (this.ZA != null)
              t = paramZim.Zq((Ziz)this.ZA.Zm); 
            try {
              if (t == null && this.Zb != null)
                t = paramZim.Zq((Ziz)this.Zb.Zm); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (t == null && this.Zk != null)
            t = paramZim.Zq((Ziz)this.Zk.Zm); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return t;
  }
  
  protected <T> T ZP(Zim<T> paramZim, T paramT) {
    try {
      if (this.Zf == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.ZU) {
        if (this.ZJ != null) {
          T t = paramZim.Zq((Ziz)this.ZJ.Zm);
          try {
            if (t != null)
              try {
                if (t != paramT)
                  return t; 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } 
        if (this.Zk != null) {
          T t = paramZim.Zq((Ziz)this.Zk.Zm);
          try {
            if (t != null)
              try {
                if (t != paramT)
                  return t; 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } 
        if (this.ZA != null) {
          T t = paramZim.Zq((Ziz)this.ZA.Zm);
          try {
            if (t != null)
              try {
                if (t != paramT)
                  return t; 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } 
        if (this.Zb != null) {
          T t = paramZim.Zq((Ziz)this.Zb.Zm);
          try {
            if (t != null)
              try {
                if (t != paramT)
                  return t; 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } 
        return null;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (this.ZA != null) {
      T t = paramZim.Zq((Ziz)this.ZA.Zm);
      try {
        if (t != null)
          try {
            if (t != paramT)
              return t; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    if (this.Zb != null) {
      T t = paramZim.Zq((Ziz)this.Zb.Zm);
      try {
        if (t != null)
          try {
            if (t != paramT)
              return t; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    if (this.Zk != null) {
      T t = paramZim.Zq((Ziz)this.Zk.Zm);
      try {
        if (t != null)
          try {
            if (t != paramT)
              return t; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    if (this.ZJ != null) {
      T t = paramZim.Zq((Ziz)this.ZJ.Zm);
      try {
        if (t != null)
          try {
            if (t != paramT)
              return t; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  protected Class<?> ZM(Ziz paramZiz) {
    if (paramZiz instanceof Ziq) {
      Ziq ziq = (Ziq)paramZiz;
      try {
        if (ziq.ZL() > 0)
          return ziq.ZV(0).Zf(); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return paramZiz.Zf().Zf();
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ZLUÉÊÁÕgËJrÛ\\n²rZv=£bWÓçEÑÚ«tì7?0ñÔdjÏÔt-¹Pä£OÑ+ßAÜO¤t¢àÇ¤ÂC^è@µáaöÝ{,Uö\\bâÞáz"v¾Üeµ'·9B(2¾®1ç´Ñ¾u°He§*£k5×:x.u\\rt½ W¸úUïÛ-Mf«&Z ¡ç.Tt[«¬­wg?¸=nàÈìY'Ka[ºGªì°¶Ð\\fu& 9³Æ5ñ¡0e9ÿï\Fõß}£?z9-AòkÆ4MÒ|>¥s­óáSNûæ÷zí_aÖZ  ï+cbiwJTÕí ÏÃ@y\\nÜ>?öãW\\rhC4¾WÕ ^Ù9'ôÉ6 %Ü"YAú|\\f}ª°ÞÒ®:PuÅt£ýÔ¯LBj²Øô\\r_Ybdlßó\\trP'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #75
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'sõc"k\\nj-ÃÕOìº©Öi}S$g¡!Uíá4#>v4¢'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_3
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #98
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic com/fasterxml/Zoz/Zb.a : [Ljava/lang/String;
    //   130: bipush #19
    //   132: anewarray java/lang/String
    //   135: putstatic com/fasterxml/Zoz/Zb.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #58
    //   214: goto -> 244
    //   217: bipush #59
    //   219: goto -> 244
    //   222: bipush #34
    //   224: goto -> 244
    //   227: bipush #75
    //   229: goto -> 244
    //   232: bipush #77
    //   234: goto -> 244
    //   237: bipush #22
    //   239: goto -> 244
    //   242: bipush #27
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: ldc ''
    //   302: invokestatic Zg : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zz;
    //   305: putstatic com/fasterxml/Zoz/Zb.Zp : Lcom/fasterxml/Zor/Zz;
    //   308: return
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEF02) & 0xFFFF;
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
      char c = 'Ú';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */