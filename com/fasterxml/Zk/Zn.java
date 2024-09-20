package com.fasterxml.Zk;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zj.Zqn;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zn.Zd;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zy7;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Zp;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zys;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public abstract class Zn extends Zyi implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected transient Map<Object, Zd> ZJ;
  
  protected transient ArrayList<Zys<?>> Zn;
  
  protected transient Zf ZC;
  
  private static final String[] e;
  
  private static final String[] f;
  
  protected Zn() {}
  
  protected Zn(Zyi paramZyi, Zy7 paramZy7, Zl paramZl) {
    super(paramZyi, paramZy7, paramZl);
  }
  
  public abstract Zn ZE(Zy7 paramZy7, Zl paramZl);
  
  public Zyd<Object> ZW(Ziv paramZiv, Object paramObject) throws Zy_ {
    // Byte code:
    //   0: invokestatic Zi : ()I
    //   3: istore_3
    //   4: aload_2
    //   5: ifnonnull -> 14
    //   8: aconst_null
    //   9: areturn
    //   10: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   13: athrow
    //   14: aload_2
    //   15: instanceof com/fasterxml/Zor/Zyd
    //   18: ifeq -> 31
    //   21: aload_2
    //   22: checkcast com/fasterxml/Zor/Zyd
    //   25: astore #4
    //   27: iload_3
    //   28: ifne -> 265
    //   31: aload_2
    //   32: instanceof java/lang/Class
    //   35: ifne -> 105
    //   38: goto -> 45
    //   41: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: aload_0
    //   46: aload_1
    //   47: invokevirtual Zf : ()Lcom/fasterxml/Zor/Zk;
    //   50: new java/lang/StringBuilder
    //   53: dup
    //   54: invokespecial <init> : ()V
    //   57: sipush #11824
    //   60: sipush #-6402
    //   63: invokestatic c : (II)Ljava/lang/String;
    //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload_2
    //   70: invokevirtual getClass : ()Ljava/lang/Class;
    //   73: invokevirtual getName : ()Ljava/lang/String;
    //   76: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: sipush #11830
    //   82: sipush #-14930
    //   85: invokestatic c : (II)Ljava/lang/String;
    //   88: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: invokevirtual toString : ()Ljava/lang/String;
    //   94: invokevirtual Zm : (Lcom/fasterxml/Zor/Zk;Ljava/lang/String;)Ljava/lang/Object;
    //   97: pop
    //   98: goto -> 105
    //   101: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   104: athrow
    //   105: aload_2
    //   106: checkcast java/lang/Class
    //   109: astore #5
    //   111: aload #5
    //   113: ldc com/fasterxml/Zor/Zyh
    //   115: if_acmpeq -> 133
    //   118: aload #5
    //   120: invokestatic Zu : (Ljava/lang/Class;)Z
    //   123: ifeq -> 139
    //   126: goto -> 133
    //   129: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   132: athrow
    //   133: aconst_null
    //   134: areturn
    //   135: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: ldc com/fasterxml/Zor/Zyd
    //   141: aload #5
    //   143: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   146: ifne -> 207
    //   149: aload_0
    //   150: aload_1
    //   151: invokevirtual Zf : ()Lcom/fasterxml/Zor/Zk;
    //   154: new java/lang/StringBuilder
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: sipush #11831
    //   164: sipush #-6012
    //   167: invokestatic c : (II)Ljava/lang/String;
    //   170: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: aload #5
    //   175: invokevirtual getName : ()Ljava/lang/String;
    //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: sipush #11825
    //   184: sipush #-2427
    //   187: invokestatic c : (II)Ljava/lang/String;
    //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: invokevirtual toString : ()Ljava/lang/String;
    //   196: invokevirtual Zm : (Lcom/fasterxml/Zor/Zk;Ljava/lang/String;)Ljava/lang/Object;
    //   199: pop
    //   200: goto -> 207
    //   203: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   206: athrow
    //   207: aload_0
    //   208: getfield Zf : Lcom/fasterxml/Zor/Zy7;
    //   211: invokevirtual Zf : ()Lcom/fasterxml/Zj/Zqn;
    //   214: astore #6
    //   216: aload #6
    //   218: ifnonnull -> 229
    //   221: aconst_null
    //   222: goto -> 241
    //   225: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   228: athrow
    //   229: aload #6
    //   231: aload_0
    //   232: getfield Zf : Lcom/fasterxml/Zor/Zy7;
    //   235: aload_1
    //   236: aload #5
    //   238: invokevirtual ZW : (Lcom/fasterxml/Zor/Zy7;Lcom/fasterxml/Zoz/Ziv;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zyd;
    //   241: astore #4
    //   243: aload #4
    //   245: ifnonnull -> 265
    //   248: aload #5
    //   250: aload_0
    //   251: getfield Zf : Lcom/fasterxml/Zor/Zy7;
    //   254: invokevirtual Zd : ()Z
    //   257: invokestatic ZR : (Ljava/lang/Class;Z)Ljava/lang/Object;
    //   260: checkcast com/fasterxml/Zor/Zyd
    //   263: astore #4
    //   265: aload_0
    //   266: aload #4
    //   268: invokevirtual Ze : (Lcom/fasterxml/Zor/Zyd;)Lcom/fasterxml/Zor/Zyd;
    //   271: areturn
    // Exception table:
    //   from	to	target	type
    //   4	10	10	com/fasterxml/Zor/Zy_
    //   27	38	41	com/fasterxml/Zor/Zy_
    //   31	98	101	com/fasterxml/Zor/Zy_
    //   111	126	129	com/fasterxml/Zor/Zy_
    //   118	135	135	com/fasterxml/Zor/Zy_
    //   139	200	203	com/fasterxml/Zor/Zy_
    //   216	225	225	com/fasterxml/Zor/Zy_
  }
  
  public Object ZQ(Zp paramZp, Class<?> paramClass) {
    if (paramClass == null)
      return null; 
    Zqn zqn = this.Zf.Zf();
    Object object = (zqn == null) ? null : zqn.Zi(this.Zf, paramZp, paramClass);
    if (object == null)
      object = Zx.ZR(paramClass, this.Zf.Zd()); 
    return object;
  }
  
  public boolean Zz(Object paramObject) throws Zy_ {
    try {
      if (paramObject == null)
        return true; 
    } catch (Exception exception) {
      throw b(null);
    } 
    try {
      return paramObject.equals((Object)null);
    } catch (Exception exception) {
      String str = String.format(c(11827, 19176), new Object[] { paramObject.getClass().getName(), exception.getClass().getName(), Zx.Zr(exception) });
      ZJ(paramObject.getClass(), str, exception);
      return false;
    } 
  }
  
  public Zd ZU(Object paramObject, Zys<?> paramZys) {
    // Byte code:
    //   0: invokestatic Zi : ()I
    //   3: istore_3
    //   4: aload_0
    //   5: getfield ZJ : Ljava/util/Map;
    //   8: ifnonnull -> 23
    //   11: aload_0
    //   12: aload_0
    //   13: invokevirtual ZN : ()Ljava/util/Map;
    //   16: putfield ZJ : Ljava/util/Map;
    //   19: iload_3
    //   20: ifne -> 46
    //   23: aload_0
    //   24: getfield ZJ : Ljava/util/Map;
    //   27: aload_1
    //   28: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   33: checkcast com/fasterxml/Zn/Zd
    //   36: astore #4
    //   38: aload #4
    //   40: ifnull -> 46
    //   43: aload #4
    //   45: areturn
    //   46: aconst_null
    //   47: astore #4
    //   49: aload_0
    //   50: getfield Zn : Ljava/util/ArrayList;
    //   53: ifnonnull -> 73
    //   56: aload_0
    //   57: new java/util/ArrayList
    //   60: dup
    //   61: bipush #8
    //   63: invokespecial <init> : (I)V
    //   66: putfield Zn : Ljava/util/ArrayList;
    //   69: iload_3
    //   70: ifne -> 128
    //   73: iconst_0
    //   74: istore #5
    //   76: aload_0
    //   77: getfield Zn : Ljava/util/ArrayList;
    //   80: invokevirtual size : ()I
    //   83: istore #6
    //   85: iload #5
    //   87: iload #6
    //   89: if_icmpge -> 128
    //   92: aload_0
    //   93: getfield Zn : Ljava/util/ArrayList;
    //   96: iload #5
    //   98: invokevirtual get : (I)Ljava/lang/Object;
    //   101: checkcast com/fasterxml/Zys
    //   104: astore #7
    //   106: aload #7
    //   108: aload_2
    //   109: invokevirtual Z_ : (Lcom/fasterxml/Zys;)Z
    //   112: ifeq -> 122
    //   115: aload #7
    //   117: astore #4
    //   119: goto -> 128
    //   122: iinc #5, 1
    //   125: goto -> 85
    //   128: aload #4
    //   130: ifnonnull -> 150
    //   133: aload_2
    //   134: aload_0
    //   135: invokevirtual Zq : (Ljava/lang/Object;)Lcom/fasterxml/Zys;
    //   138: astore #4
    //   140: aload_0
    //   141: getfield Zn : Ljava/util/ArrayList;
    //   144: aload #4
    //   146: invokevirtual add : (Ljava/lang/Object;)Z
    //   149: pop
    //   150: new com/fasterxml/Zn/Zd
    //   153: dup
    //   154: aload #4
    //   156: invokespecial <init> : (Lcom/fasterxml/Zys;)V
    //   159: astore #5
    //   161: aload_0
    //   162: getfield ZJ : Ljava/util/Map;
    //   165: aload_1
    //   166: aload #5
    //   168: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   173: pop
    //   174: aload #5
    //   176: areturn
  }
  
  protected Map<Object, Zd> ZN() {
    return (Map<Object, Zd>)(ZW(Zy0.USE_EQUALITY_FOR_OBJECT_ID) ? new HashMap<>() : new IdentityHashMap<>());
  }
  
  public Zf ZI() {
    return this.ZC;
  }
  
  public void Zz(Zf paramZf, Object paramObject) throws IOException {
    try {
      this.ZC = paramZf;
      if (paramObject == null) {
        ZW(paramZf);
        return;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    Class<?> clazz = paramObject.getClass();
    Zyd<Object> zyd = Zx(clazz, true, null);
    Zr zr = this.Zf.ZT();
    try {
      if (zr == null) {
        try {
          if (this.Zf.Zo(Zy0.WRAP_ROOT_VALUE)) {
            Zk(paramZf, paramObject, zyd, this.Zf.Zt(clazz));
            return;
          } 
        } catch (IOException iOException) {
          throw b(null);
        } 
      } else {
        try {
          if (!zr.Zf()) {
            Zk(paramZf, paramObject, zyd, zr);
            return;
          } 
        } catch (IOException iOException) {
          throw b(null);
        } 
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    ZY(paramZf, paramObject, zyd);
  }
  
  public void ZI(Zf paramZf, Object paramObject, Zk paramZk) throws IOException {
    try {
      this.ZC = paramZf;
      if (paramObject == null) {
        ZW(paramZf);
        return;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    try {
      if (!paramZk.Zf().isAssignableFrom(paramObject.getClass()))
        Zb(paramObject, paramZk); 
    } catch (IOException iOException) {
      throw b(null);
    } 
    Zyd<Object> zyd = ZH(paramZk, true, null);
    Zr zr = this.Zf.ZT();
    try {
      if (zr == null) {
        try {
          if (this.Zf.Zo(Zy0.WRAP_ROOT_VALUE)) {
            Zk(paramZf, paramObject, zyd, this.Zf.Zy(paramZk));
            return;
          } 
        } catch (IOException iOException) {
          throw b(null);
        } 
      } else {
        try {
          if (!zr.Zf()) {
            Zk(paramZf, paramObject, zyd, zr);
            return;
          } 
        } catch (IOException iOException) {
          throw b(null);
        } 
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    ZY(paramZf, paramObject, zyd);
  }
  
  public void ZJ(Zf paramZf, Object paramObject, Zk paramZk, Zyd<Object> paramZyd) throws IOException {
    try {
      this.ZC = paramZf;
      if (paramObject == null) {
        ZW(paramZf);
        return;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    try {
      if (paramZk != null)
        try {
          if (!paramZk.Zf().isAssignableFrom(paramObject.getClass()))
            Zb(paramObject, paramZk); 
        } catch (IOException iOException) {
          throw b(null);
        }  
    } catch (IOException iOException) {
      throw b(null);
    } 
    if (paramZyd == null)
      paramZyd = ZH(paramZk, true, null); 
    Zr zr = this.Zf.ZT();
    try {
      if (zr == null) {
        try {
          if (this.Zf.Zo(Zy0.WRAP_ROOT_VALUE)) {
            try {
            
            } catch (IOException iOException) {
              throw b(null);
            } 
            zr = (paramZk == null) ? this.Zf.Zt(paramObject.getClass()) : this.Zf.Zy(paramZk);
            Zk(paramZf, paramObject, paramZyd, zr);
            return;
          } 
        } catch (IOException iOException) {
          throw b(null);
        } 
      } else {
        try {
          if (!zr.Zf()) {
            Zk(paramZf, paramObject, paramZyd, zr);
            return;
          } 
        } catch (IOException iOException) {
          throw b(null);
        } 
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    ZY(paramZf, paramObject, paramZyd);
  }
  
  public void Zx(Zf paramZf, Object paramObject, Zk paramZk, Zyd<Object> paramZyd, Za paramZa) throws IOException {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: aload_0
    //   4: aload_1
    //   5: putfield ZC : Lcom/fasterxml/Zb/Zf;
    //   8: istore #6
    //   10: aload_2
    //   11: ifnonnull -> 24
    //   14: aload_0
    //   15: aload_1
    //   16: invokevirtual ZW : (Lcom/fasterxml/Zb/Zf;)V
    //   19: return
    //   20: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   23: athrow
    //   24: aload_3
    //   25: ifnull -> 62
    //   28: aload_3
    //   29: invokevirtual Zf : ()Ljava/lang/Class;
    //   32: aload_2
    //   33: invokevirtual getClass : ()Ljava/lang/Class;
    //   36: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   39: ifne -> 62
    //   42: goto -> 49
    //   45: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   48: athrow
    //   49: aload_0
    //   50: aload_2
    //   51: aload_3
    //   52: invokevirtual Zb : (Ljava/lang/Object;Lcom/fasterxml/Zor/Zk;)V
    //   55: goto -> 62
    //   58: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload #4
    //   64: ifnonnull -> 116
    //   67: aload_3
    //   68: ifnull -> 105
    //   71: goto -> 78
    //   74: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: aload_3
    //   79: invokevirtual ZH : ()Z
    //   82: ifeq -> 105
    //   85: goto -> 92
    //   88: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: aload_0
    //   93: aload_3
    //   94: aconst_null
    //   95: invokevirtual ZX : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyd;
    //   98: astore #4
    //   100: iload #6
    //   102: ifeq -> 116
    //   105: aload_0
    //   106: aload_2
    //   107: invokevirtual getClass : ()Ljava/lang/Class;
    //   110: aconst_null
    //   111: invokevirtual Za : (Ljava/lang/Class;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyd;
    //   114: astore #4
    //   116: aload_0
    //   117: getfield Zf : Lcom/fasterxml/Zor/Zy7;
    //   120: invokevirtual ZT : ()Lcom/fasterxml/Zor/Zr;
    //   123: astore #8
    //   125: aload #8
    //   127: ifnonnull -> 182
    //   130: aload_0
    //   131: getfield Zf : Lcom/fasterxml/Zor/Zy7;
    //   134: getstatic com/fasterxml/Zor/Zy0.WRAP_ROOT_VALUE : Lcom/fasterxml/Zor/Zy0;
    //   137: invokevirtual Zo : (Lcom/fasterxml/Zor/Zy0;)Z
    //   140: istore #7
    //   142: iload #7
    //   144: ifeq -> 221
    //   147: aload_1
    //   148: invokevirtual ZJ : ()V
    //   151: aload_0
    //   152: getfield Zf : Lcom/fasterxml/Zor/Zy7;
    //   155: aload_2
    //   156: invokevirtual getClass : ()Ljava/lang/Class;
    //   159: invokevirtual Zt : (Ljava/lang/Class;)Lcom/fasterxml/Zor/Zr;
    //   162: astore #9
    //   164: aload_1
    //   165: aload #9
    //   167: aload_0
    //   168: getfield Zf : Lcom/fasterxml/Zor/Zy7;
    //   171: invokevirtual Zx : (Lcom/fasterxml/Zj/Zf;)Lcom/fasterxml/Zb/Zj;
    //   174: invokevirtual Zm : (Lcom/fasterxml/Zb/Zj;)V
    //   177: iload #6
    //   179: ifeq -> 221
    //   182: aload #8
    //   184: invokevirtual Zf : ()Z
    //   187: ifeq -> 205
    //   190: goto -> 197
    //   193: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   196: athrow
    //   197: iconst_0
    //   198: istore #7
    //   200: iload #6
    //   202: ifeq -> 221
    //   205: iconst_1
    //   206: istore #7
    //   208: aload_1
    //   209: invokevirtual ZJ : ()V
    //   212: aload_1
    //   213: aload #8
    //   215: invokevirtual Zb : ()Ljava/lang/String;
    //   218: invokevirtual ZY : (Ljava/lang/String;)V
    //   221: aload #4
    //   223: aload_2
    //   224: aload_1
    //   225: aload_0
    //   226: aload #5
    //   228: invokevirtual Zo : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zp/Za;)V
    //   231: iload #7
    //   233: ifeq -> 240
    //   236: aload_1
    //   237: invokevirtual Zh : ()V
    //   240: goto -> 253
    //   243: astore #9
    //   245: aload_0
    //   246: aload_1
    //   247: aload #9
    //   249: invokespecial ZJ : (Lcom/fasterxml/Zb/Zf;Ljava/lang/Exception;)Ljava/io/IOException;
    //   252: athrow
    //   253: return
    // Exception table:
    //   from	to	target	type
    //   10	20	20	java/lang/Exception
    //   24	42	45	java/lang/Exception
    //   28	55	58	java/lang/Exception
    //   62	71	74	java/lang/Exception
    //   67	85	88	java/lang/Exception
    //   164	190	193	java/lang/Exception
    //   221	240	243	java/lang/Exception
  }
  
  private final void Zk(Zf paramZf, Object paramObject, Zyd<Object> paramZyd, Zr paramZr) throws IOException {
    try {
      paramZf.ZJ();
      paramZf.Zm(paramZr.Zx((Zf)this.Zf));
      paramZyd.serialize(paramObject, paramZf, this);
      paramZf.Zh();
    } catch (Exception exception) {
      throw ZJ(paramZf, exception);
    } 
  }
  
  private final void ZY(Zf paramZf, Object paramObject, Zyd<Object> paramZyd) throws IOException {
    try {
      paramZyd.serialize(paramObject, paramZf, this);
    } catch (Exception exception) {
      throw ZJ(paramZf, exception);
    } 
  }
  
  protected void ZW(Zf paramZf) throws IOException {
    Zyd zyd = ZJ();
    try {
      zyd.serialize(null, paramZf, this);
    } catch (Exception exception) {
      throw ZJ(paramZf, exception);
    } 
  }
  
  private IOException ZJ(Zf paramZf, Exception paramException) {
    if (paramException instanceof IOException)
      return (IOException)paramException; 
    String str = Zx.Zr(paramException);
    if (str == null)
      str = c(11826, -24137) + paramException.getClass().getName() + "]"; 
    return (IOException)new Zy_((Closeable)paramZf, str, paramException);
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'R9rIÕZZ³µ/ÝCGH¥ô.+4ß ôÆfm(áÉê~¶:WÂ¼Ý÷,¤´ây®n/ÌXh|@~õ¾$kàBCý>5®¤Ö^µ÷½)_ÂMI"Ö'Íì +-RÃ09ºÚÕ/ój·*ÊR]eÑ7xdOôÙH:>Í\\tø[0ädð,\\fù\\f94PS6I!X³ß¢åú=ÝãOYCE'ì­÷ù\\n@íyÁõëÿ [bêW¼¡'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #88
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
    //   68: ldc 'x rzF¡{j?ÑÉzM!ÚZ[T¾V|"gf~qqf2æC)/?"#O>¯ºßö`yºyW Í¥è4Ç3á?Âãí¢Õ9ÓåyÔ:1Ö.ìzr®8q¤RË?ù|ðB'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #38
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #17
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
    //   129: putstatic com/fasterxml/Zk/Zn.e : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zk/Zn.f : [Ljava/lang/String;
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
    //   212: bipush #96
    //   214: goto -> 244
    //   217: bipush #115
    //   219: goto -> 244
    //   222: bipush #69
    //   224: goto -> 244
    //   227: bipush #10
    //   229: goto -> 244
    //   232: bipush #120
    //   234: goto -> 244
    //   237: bipush #38
    //   239: goto -> 244
    //   242: bipush #92
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
  
  private static String c(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2E33) & 0xFFFF;
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
      byte b1 = 40;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zk\Zn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */