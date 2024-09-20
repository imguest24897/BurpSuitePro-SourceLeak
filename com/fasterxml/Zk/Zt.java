package com.fasterxml.Zk;

import burp.Zbqc;
import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zj;
import com.fasterxml.Zgk;
import com.fasterxml.Zm.Z_;
import com.fasterxml.Zm.Zee;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zn.Zg;
import com.fasterxml.Zn.Zj;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zy7;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyb;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zoz.Zp;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

@Zl
public class Zt extends Zb implements Serializable {
  private static final long serialVersionUID = 1L;
  
  public static final Object Zo;
  
  protected final Zgk Z_;
  
  protected final Zr Zr;
  
  protected final Zk ZT;
  
  protected final Zk Zb;
  
  protected Zk ZW;
  
  protected final transient Z_ ZS;
  
  protected final Ziz ZY;
  
  protected transient Method Zl;
  
  protected transient Field ZX;
  
  protected Zyd<Object> ZI;
  
  protected Zyd<Object> Zy;
  
  protected Za ZB;
  
  protected transient Zj ZQ;
  
  protected final boolean ZC;
  
  protected final Object Zp;
  
  protected final Class<?>[] Zh;
  
  protected transient HashMap<Object, Object> Zz;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zt(Zp paramZp, Ziz paramZiz, Z_ paramZ_, Zk paramZk1, Zyd<?> paramZyd, Za paramZa, Zk paramZk2, boolean paramBoolean, Object paramObject, Class<?>[] paramArrayOfClass) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial <init> : (Lcom/fasterxml/Zoz/Zp;)V
    //   5: aload_0
    //   6: aload_2
    //   7: putfield ZY : Lcom/fasterxml/Zoz/Ziz;
    //   10: invokestatic Zi : ()I
    //   13: aload_0
    //   14: aload_3
    //   15: putfield ZS : Lcom/fasterxml/Zm/Z_;
    //   18: istore #11
    //   20: aload_0
    //   21: new com/fasterxml/Zgk
    //   24: dup
    //   25: aload_1
    //   26: invokevirtual ZT : ()Ljava/lang/String;
    //   29: invokespecial <init> : (Ljava/lang/String;)V
    //   32: putfield Z_ : Lcom/fasterxml/Zgk;
    //   35: aload_0
    //   36: aload_1
    //   37: invokevirtual ZV : ()Lcom/fasterxml/Zor/Zr;
    //   40: putfield Zr : Lcom/fasterxml/Zor/Zr;
    //   43: aload_0
    //   44: aload #4
    //   46: putfield ZT : Lcom/fasterxml/Zor/Zk;
    //   49: aload_0
    //   50: aload #5
    //   52: putfield ZI : Lcom/fasterxml/Zor/Zyd;
    //   55: aload_0
    //   56: aload #5
    //   58: ifnonnull -> 71
    //   61: invokestatic ZQ : ()Lcom/fasterxml/Zn/Zj;
    //   64: goto -> 72
    //   67: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   70: athrow
    //   71: aconst_null
    //   72: putfield ZQ : Lcom/fasterxml/Zn/Zj;
    //   75: aload_0
    //   76: aload #6
    //   78: putfield ZB : Lcom/fasterxml/Zp/Za;
    //   81: aload_0
    //   82: aload #7
    //   84: putfield Zb : Lcom/fasterxml/Zor/Zk;
    //   87: aload_2
    //   88: instanceof com/fasterxml/Zoz/Zi6
    //   91: ifeq -> 122
    //   94: aload_0
    //   95: aconst_null
    //   96: putfield Zl : Ljava/lang/reflect/Method;
    //   99: aload_0
    //   100: aload_2
    //   101: invokevirtual ZI : ()Ljava/lang/reflect/Member;
    //   104: checkcast java/lang/reflect/Field
    //   107: putfield ZX : Ljava/lang/reflect/Field;
    //   110: iload #11
    //   112: ifne -> 181
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   121: athrow
    //   122: aload_2
    //   123: instanceof com/fasterxml/Zoz/Ziq
    //   126: ifeq -> 164
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   135: athrow
    //   136: aload_0
    //   137: aload_2
    //   138: invokevirtual ZI : ()Ljava/lang/reflect/Member;
    //   141: checkcast java/lang/reflect/Method
    //   144: putfield Zl : Ljava/lang/reflect/Method;
    //   147: aload_0
    //   148: aconst_null
    //   149: putfield ZX : Ljava/lang/reflect/Field;
    //   152: iload #11
    //   154: ifne -> 181
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: aload_0
    //   165: aconst_null
    //   166: putfield Zl : Ljava/lang/reflect/Method;
    //   169: aload_0
    //   170: aconst_null
    //   171: putfield ZX : Ljava/lang/reflect/Field;
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   180: athrow
    //   181: aload_0
    //   182: iload #8
    //   184: putfield ZC : Z
    //   187: aload_0
    //   188: aload #9
    //   190: putfield Zp : Ljava/lang/Object;
    //   193: aload_0
    //   194: aconst_null
    //   195: putfield Zy : Lcom/fasterxml/Zor/Zyd;
    //   198: aload_0
    //   199: aload #10
    //   201: putfield Zh : [Ljava/lang/Class;
    //   204: return
    // Exception table:
    //   from	to	target	type
    //   20	67	67	java/lang/IllegalStateException
    //   72	115	118	java/lang/IllegalStateException
    //   94	129	132	java/lang/IllegalStateException
    //   122	157	160	java/lang/IllegalStateException
    //   136	174	177	java/lang/IllegalStateException
  }
  
  protected Zt() {
    super(Zyb.Zf);
    this.ZY = null;
    this.ZS = null;
    this.Z_ = null;
    this.Zr = null;
    this.Zh = null;
    this.ZT = null;
    this.ZI = null;
    this.ZQ = null;
    this.ZB = null;
    this.Zb = null;
    this.Zl = null;
    this.ZX = null;
    this.ZC = false;
    this.Zp = null;
    this.Zy = null;
  }
  
  protected Zt(Zt paramZt) {
    this(paramZt, paramZt.Z_);
  }
  
  protected Zt(Zt paramZt, Zr paramZr) {
    super(paramZt);
    this.Z_ = new Zgk(paramZr.Zb());
    this.Zr = paramZt.Zr;
    int i = Za.ZH();
    try {
      this.ZS = paramZt.ZS;
      this.ZT = paramZt.ZT;
      this.ZY = paramZt.ZY;
      this.Zl = paramZt.Zl;
      this.ZX = paramZt.ZX;
      this.ZI = paramZt.ZI;
      this.Zy = paramZt.Zy;
      if (paramZt.Zz != null)
        this.Zz = new HashMap<>(paramZt.Zz); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      this.Zb = paramZt.Zb;
      this.ZQ = paramZt.ZQ;
      this.ZC = paramZt.ZC;
      this.Zp = paramZt.Zp;
      this.Zh = paramZt.Zh;
      this.ZB = paramZt.ZB;
      this.ZW = paramZt.ZW;
      if (i != 0)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  protected Zt(Zt paramZt, Zgk paramZgk) {
    super(paramZt);
    this.Z_ = paramZgk;
    this.Zr = paramZt.Zr;
    this.ZY = paramZt.ZY;
    this.ZS = paramZt.ZS;
    this.ZT = paramZt.ZT;
    int i = Za.Zi();
    try {
      this.Zl = paramZt.Zl;
      this.ZX = paramZt.ZX;
      this.ZI = paramZt.ZI;
      this.Zy = paramZt.Zy;
      if (paramZt.Zz != null)
        this.Zz = new HashMap<>(paramZt.Zz); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      this.Zb = paramZt.Zb;
      this.ZQ = paramZt.ZQ;
      this.ZC = paramZt.ZC;
      this.Zp = paramZt.Zp;
      this.Zh = paramZt.Zh;
      this.ZB = paramZt.ZB;
      this.ZW = paramZt.ZW;
      if (Zbqc.Zwu() == null)
        Za.Zd(++i); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public Zt Zc(Zee paramZee) {
    String str = paramZee.Zt(this.Z_.ZV());
    try {
      if (str.equals(this.Z_.toString()))
        return this; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return ZE(Zr.Zf(str));
  }
  
  protected Zt ZE(Zr paramZr) {
    return new Zt(this, paramZr);
  }
  
  public void ZM(Za paramZa) {
    this.ZB = paramZa;
  }
  
  public void Zh(Zyd<Object> paramZyd) {
    try {
      if (this.ZI != null)
        try {
          if (this.ZI != paramZyd)
            throw new IllegalStateException(String.format(a(-5294, 27405), new Object[] { Zx.ZZ(this.ZI), Zx.ZZ(paramZyd) })); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.ZI = paramZyd;
  }
  
  public void ZA(Zyd<Object> paramZyd) {
    try {
      if (this.Zy != null)
        try {
          if (this.Zy != paramZyd)
            throw new IllegalStateException(String.format(a(-5282, 29252), new Object[] { Zx.ZZ(this.Zy), Zx.ZZ(paramZyd) })); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zy = paramZyd;
  }
  
  public Zt ZU(Zee paramZee) {
    return (Zt)new Zg(this, paramZee);
  }
  
  public void ZH(Zk paramZk) {
    this.ZW = paramZk;
  }
  
  public void ZC(Zy7 paramZy7) {
    this.ZY.Zh(paramZy7.ZB(Zy9.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
  }
  
  Object readResolve() {
    // Byte code:
    //   0: invokestatic Zi : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield ZY : Lcom/fasterxml/Zoz/Ziz;
    //   8: instanceof com/fasterxml/Zoz/Zi6
    //   11: ifeq -> 44
    //   14: aload_0
    //   15: aconst_null
    //   16: putfield Zl : Ljava/lang/reflect/Method;
    //   19: aload_0
    //   20: aload_0
    //   21: getfield ZY : Lcom/fasterxml/Zoz/Ziz;
    //   24: invokevirtual ZI : ()Ljava/lang/reflect/Member;
    //   27: checkcast java/lang/reflect/Field
    //   30: putfield ZX : Ljava/lang/reflect/Field;
    //   33: iload_1
    //   34: ifne -> 87
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   43: athrow
    //   44: aload_0
    //   45: getfield ZY : Lcom/fasterxml/Zoz/Ziz;
    //   48: instanceof com/fasterxml/Zoz/Ziq
    //   51: ifeq -> 87
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: aload_0
    //   62: aload_0
    //   63: getfield ZY : Lcom/fasterxml/Zoz/Ziz;
    //   66: invokevirtual ZI : ()Ljava/lang/reflect/Member;
    //   69: checkcast java/lang/reflect/Method
    //   72: putfield Zl : Ljava/lang/reflect/Method;
    //   75: aload_0
    //   76: aconst_null
    //   77: putfield ZX : Ljava/lang/reflect/Field;
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   86: athrow
    //   87: aload_0
    //   88: getfield ZI : Lcom/fasterxml/Zor/Zyd;
    //   91: ifnonnull -> 108
    //   94: aload_0
    //   95: invokestatic ZQ : ()Lcom/fasterxml/Zn/Zj;
    //   98: putfield ZQ : Lcom/fasterxml/Zn/Zj;
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload_0
    //   109: areturn
    // Exception table:
    //   from	to	target	type
    //   4	37	40	java/lang/IllegalStateException
    //   14	54	57	java/lang/IllegalStateException
    //   44	80	83	java/lang/IllegalStateException
    //   87	101	104	java/lang/IllegalStateException
  }
  
  public String ZT() {
    return this.Z_.ZV();
  }
  
  public Zr ZS() {
    return new Zr(this.Z_.ZV());
  }
  
  public Zk Zp() {
    return this.ZT;
  }
  
  public Zr Zb() {
    return this.Zr;
  }
  
  public Ziz ZQ() {
    return this.ZY;
  }
  
  public boolean ZJ() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZI != null);
  }
  
  public boolean Zc() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.Zy != null);
  }
  
  public Za ZL() {
    return this.ZB;
  }
  
  public boolean Zv() {
    return this.ZC;
  }
  
  public boolean Zu(Zr paramZr) {
    try {
      if (this.Zr != null)
        return this.Zr.equals(paramZr); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramZr.ZF(this.Z_.ZV()))
        try {
          if (!paramZr.ZW());
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public Zk ZZ() {
    return this.Zb;
  }
  
  public Class<?>[] ZY() {
    return this.Zh;
  }
  
  public void Zy(Object paramObject, Zf paramZf, Zyi paramZyi) throws Exception {
    int i = Za.ZH();
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    Object object = (this.Zl == null) ? this.ZX.get(paramObject) : this.Zl.invoke(paramObject, (Object[])null);
    try {
      if (object == null) {
        try {
          if (this.Zp != null)
            try {
              if (paramZyi.Zz(this.Zp))
                return; 
            } catch (Exception exception) {
              throw a(null);
            }  
        } catch (Exception exception) {
          throw a(null);
        } 
        try {
          if (this.Zy != null) {
            paramZf.Zm((Zj)this.Z_);
            this.Zy.serialize(null, paramZf, paramZyi);
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
        return;
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    Zyd<Object> zyd = this.ZI;
    if (zyd == null) {
      Class<?> clazz = object.getClass();
      Zj zj = this.ZQ;
      zyd = zj.ZO(clazz);
      if (zyd == null)
        zyd = ZQ(zj, clazz, paramZyi); 
    } 
    try {
      if (this.Zp != null)
        try {
          if (Zo == this.Zp) {
            try {
              if (zyd.Zt(paramZyi, object))
                return; 
            } catch (Exception exception) {
              throw a(null);
            } 
          } else {
            try {
              if (this.Zp.equals(object))
                return; 
            } catch (Exception exception) {
              throw a(null);
            } 
          } 
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (object == paramObject)
        try {
          if (Zy(paramObject, paramZf, paramZyi, zyd))
            return; 
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      paramZf.Zm((Zj)this.Z_);
      if (this.ZB == null) {
        try {
          zyd.serialize(object, paramZf, paramZyi);
          if (i != 0) {
            zyd.Zo(object, paramZf, paramZyi, this.ZB);
            return;
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
        return;
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    zyd.Zo(object, paramZf, paramZyi, this.ZB);
  }
  
  public void ZQ(Object paramObject, Zf paramZf, Zyi paramZyi) throws Exception {
    try {
      if (!paramZf.Zu())
        paramZf.Zd(this.Z_.ZV()); 
    } catch (Exception exception) {
      throw a(null);
    } 
  }
  
  public void ZD(Object paramObject, Zf paramZf, Zyi paramZyi) throws Exception {
    int i = Za.ZH();
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    Object object = (this.Zl == null) ? this.ZX.get(paramObject) : this.Zl.invoke(paramObject, (Object[])null);
    try {
      if (object == null) {
        try {
          if (this.Zy != null) {
            try {
              this.Zy.serialize(null, paramZf, paramZyi);
              if (i != 0) {
                paramZf.ZT();
                return;
              } 
            } catch (Exception exception) {
              throw a(null);
            } 
            return;
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
      } else {
        Zyd<Object> zyd = this.ZI;
        if (zyd == null) {
          Class<?> clazz = object.getClass();
          Zj zj = this.ZQ;
          zyd = zj.ZO(clazz);
          if (zyd == null)
            zyd = ZQ(zj, clazz, paramZyi); 
        } 
        try {
          if (this.Zp != null)
            try {
              if (Zo == this.Zp) {
                try {
                  if (zyd.Zt(paramZyi, object)) {
                    ZM(paramObject, paramZf, paramZyi);
                    return;
                  } 
                } catch (Exception exception) {
                  throw a(null);
                } 
              } else {
                try {
                  if (this.Zp.equals(object)) {
                    ZM(paramObject, paramZf, paramZyi);
                    return;
                  } 
                } catch (Exception exception) {
                  throw a(null);
                } 
              } 
            } catch (Exception exception) {
              throw a(null);
            }  
        } catch (Exception exception) {
          throw a(null);
        } 
        try {
          if (object == paramObject)
            try {
              if (Zy(paramObject, paramZf, paramZyi, zyd))
                return; 
            } catch (Exception exception) {
              throw a(null);
            }  
        } catch (Exception exception) {
          throw a(null);
        } 
        try {
          if (this.ZB == null) {
            try {
              zyd.serialize(object, paramZf, paramZyi);
              if (i != 0)
                zyd.Zo(object, paramZf, paramZyi, this.ZB); 
            } catch (Exception exception) {
              throw a(null);
            } 
            return;
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
        zyd.Zo(object, paramZf, paramZyi, this.ZB);
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    paramZf.ZT();
  }
  
  public void ZM(Object paramObject, Zf paramZf, Zyi paramZyi) throws Exception {
    int i = Za.ZH();
    try {
      if (this.Zy != null) {
        try {
          this.Zy.serialize(null, paramZf, paramZyi);
          if (i != 0) {
            paramZf.ZT();
            return;
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
        return;
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    paramZf.ZT();
  }
  
  protected Zyd<Object> ZQ(Zj paramZj, Class<?> paramClass, Zyi paramZyi) throws Zy_ {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: istore #4
    //   5: aload_0
    //   6: getfield ZW : Lcom/fasterxml/Zor/Zk;
    //   9: ifnull -> 38
    //   12: aload_3
    //   13: aload_0
    //   14: getfield ZW : Lcom/fasterxml/Zor/Zk;
    //   17: aload_2
    //   18: invokevirtual ZX : (Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   21: astore #6
    //   23: aload_1
    //   24: aload #6
    //   26: aload_3
    //   27: aload_0
    //   28: invokevirtual ZP : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zn/Zm;
    //   31: astore #5
    //   33: iload #4
    //   35: ifeq -> 47
    //   38: aload_1
    //   39: aload_2
    //   40: aload_3
    //   41: aload_0
    //   42: invokevirtual Zy : (Ljava/lang/Class;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zn/Zm;
    //   45: astore #5
    //   47: aload_1
    //   48: aload #5
    //   50: getfield Za : Lcom/fasterxml/Zn/Zj;
    //   53: if_acmpeq -> 72
    //   56: aload_0
    //   57: aload #5
    //   59: getfield Za : Lcom/fasterxml/Zn/Zj;
    //   62: putfield ZQ : Lcom/fasterxml/Zn/Zj;
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: aload #5
    //   74: getfield Zm : Lcom/fasterxml/Zor/Zyd;
    //   77: areturn
    // Exception table:
    //   from	to	target	type
    //   47	65	68	com/fasterxml/Zor/Zy_
  }
  
  public final Object Zo(Object paramObject) throws Exception {
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    return (this.Zl == null) ? this.ZX.get(paramObject) : this.Zl.invoke(paramObject, (Object[])null);
  }
  
  protected boolean Zy(Object paramObject, Zf paramZf, Zyi paramZyi, Zyd<?> paramZyd) throws IOException {
    int i = Za.Zi();
    try {
      if (!paramZyd.ZY()) {
        try {
          if (paramZyi.ZW(Zy0.FAIL_ON_SELF_REFERENCES)) {
            try {
              if (paramZyd instanceof com.fasterxml.Zzp)
                try {
                  paramZyi.Zm(Zp(), a(-5296, 16949));
                  if (i == 0) {
                    try {
                      if (paramZyi.ZW(Zy0.WRITE_SELF_REFERENCES_AS_NULL)) {
                        try {
                          if (this.Zy != null) {
                            try {
                              if (!paramZf.Zz().Zo())
                                paramZf.Zm((Zj)this.Z_); 
                            } catch (IOException iOException) {
                              throw a(null);
                            } 
                            this.Zy.serialize(null, paramZf, paramZyi);
                          } 
                        } catch (IOException iOException) {
                          throw a(null);
                        } 
                        return true;
                      } 
                    } catch (IOException iOException) {
                      throw a(null);
                    } 
                    return false;
                  } 
                } catch (IOException iOException) {
                  throw a(null);
                }  
            } catch (IOException iOException) {
              throw a(null);
            } 
            return false;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZyi.ZW(Zy0.WRITE_SELF_REFERENCES_AS_NULL)) {
        try {
          if (this.Zy != null) {
            try {
              if (!paramZf.Zz().Zo())
                paramZf.Zm((Zj)this.Z_); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            this.Zy.serialize(null, paramZf, paramZyi);
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return true;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return false;
  }
  
  public String toString() {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: new java/lang/StringBuilder
    //   6: dup
    //   7: bipush #40
    //   9: invokespecial <init> : (I)V
    //   12: astore_2
    //   13: istore_1
    //   14: aload_2
    //   15: sipush #-5293
    //   18: sipush #-4041
    //   21: invokestatic a : (II)Ljava/lang/String;
    //   24: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: aload_0
    //   28: invokevirtual ZT : ()Ljava/lang/String;
    //   31: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: sipush #-5292
    //   37: sipush #29569
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload_0
    //   48: getfield Zl : Ljava/lang/reflect/Method;
    //   51: ifnull -> 107
    //   54: aload_2
    //   55: sipush #-5289
    //   58: sipush #9789
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: aload_0
    //   68: getfield Zl : Ljava/lang/reflect/Method;
    //   71: invokevirtual getDeclaringClass : ()Ljava/lang/Class;
    //   74: invokevirtual getName : ()Ljava/lang/String;
    //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: ldc '#'
    //   82: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: aload_0
    //   86: getfield Zl : Ljava/lang/reflect/Method;
    //   89: invokevirtual getName : ()Ljava/lang/String;
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: iload_1
    //   97: ifeq -> 195
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: aload_0
    //   108: getfield ZX : Ljava/lang/reflect/Field;
    //   111: ifnull -> 174
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: aload_2
    //   122: sipush #-5281
    //   125: sipush #-22239
    //   128: invokestatic a : (II)Ljava/lang/String;
    //   131: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: aload_0
    //   135: getfield ZX : Ljava/lang/reflect/Field;
    //   138: invokevirtual getDeclaringClass : ()Ljava/lang/Class;
    //   141: invokevirtual getName : ()Ljava/lang/String;
    //   144: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: ldc '#'
    //   149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: aload_0
    //   153: getfield ZX : Ljava/lang/reflect/Field;
    //   156: invokevirtual getName : ()Ljava/lang/String;
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: iload_1
    //   164: ifeq -> 195
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   173: athrow
    //   174: aload_2
    //   175: sipush #-5295
    //   178: sipush #18189
    //   181: invokestatic a : (II)Ljava/lang/String;
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: pop
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   194: athrow
    //   195: aload_0
    //   196: getfield ZI : Lcom/fasterxml/Zor/Zyd;
    //   199: ifnonnull -> 227
    //   202: aload_2
    //   203: sipush #-5290
    //   206: sipush #10866
    //   209: invokestatic a : (II)Ljava/lang/String;
    //   212: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: pop
    //   216: iload_1
    //   217: ifeq -> 274
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   226: athrow
    //   227: aload_2
    //   228: new java/lang/StringBuilder
    //   231: dup
    //   232: invokespecial <init> : ()V
    //   235: sipush #-5291
    //   238: sipush #-7252
    //   241: invokestatic a : (II)Ljava/lang/String;
    //   244: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: aload_0
    //   248: getfield ZI : Lcom/fasterxml/Zor/Zyd;
    //   251: invokevirtual getClass : ()Ljava/lang/Class;
    //   254: invokevirtual getName : ()Ljava/lang/String;
    //   257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: invokevirtual toString : ()Ljava/lang/String;
    //   263: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: pop
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   273: athrow
    //   274: aload_2
    //   275: bipush #41
    //   277: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   280: pop
    //   281: aload_2
    //   282: invokevirtual toString : ()Ljava/lang/String;
    //   285: areturn
    // Exception table:
    //   from	to	target	type
    //   14	100	103	java/lang/IllegalStateException
    //   54	114	117	java/lang/IllegalStateException
    //   107	167	170	java/lang/IllegalStateException
    //   121	188	191	java/lang/IllegalStateException
    //   195	220	223	java/lang/IllegalStateException
    //   202	267	270	java/lang/IllegalStateException
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '2·Æ pÙÏóùïT*ßÓÍVKY)ëfJÁ,pØâ´ßÕ®ðkÂÌÞvN:!\\t É¦ æ×:;ÄDý^1ñ÷ö5è½«ÕQk8\\tgÈ=YÎ£Tsìõ_Ð¼­ XéX£{+yXeXdm\\nPä-/ñè\\n7ª¡&þ¡WêáfÚ¼Çü!ûâÌxJ@\\tVìÔ¸[ ¢´=vsÍeåûÝto'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #22
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #99
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
    //   68: ldc 'bÍÒÈ*ßRuvv+wYM?ä¿Ô³ª.Åw»*7\ ©5¶ô¦%¢îÅÖlÚöüµÍ&q=bXkø@±'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #62
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #38
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
    //   129: putstatic com/fasterxml/Zk/Zt.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zk/Zt.b : [Ljava/lang/String;
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
    //   212: bipush #105
    //   214: goto -> 244
    //   217: bipush #22
    //   219: goto -> 244
    //   222: bipush #20
    //   224: goto -> 244
    //   227: bipush #50
    //   229: goto -> 244
    //   232: bipush #62
    //   234: goto -> 244
    //   237: bipush #72
    //   239: goto -> 244
    //   242: bipush #65
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
    //   300: getstatic com/fasterxml/Zqg.NON_EMPTY : Lcom/fasterxml/Zqg;
    //   303: putstatic com/fasterxml/Zk/Zt.Zo : Ljava/lang/Object;
    //   306: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEB56) & 0xFFFF;
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
      byte b1 = 115;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zk\Zt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */