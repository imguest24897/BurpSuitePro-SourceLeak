package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zh.Zn;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zm.Zee;
import com.fasterxml.Zn.Zj;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zy2;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zw.Zk;
import java.io.IOException;

public abstract class Zz9<T> extends Zz0<T> implements Zi {
  private static final long serialVersionUID = 1L;
  
  public static final Object ZM = Zqg.NON_EMPTY;
  
  protected final Zk ZG;
  
  protected final Zo ZS;
  
  protected final Za ZX;
  
  protected final Zyd<Object> Zt;
  
  protected final Zee ZD;
  
  protected transient Zj Zi;
  
  protected final Object ZW;
  
  protected final boolean ZO;
  
  public Zz9(Zn paramZn, boolean paramBoolean, Za paramZa, Zyd<Object> paramZyd) {
    super((Zk)paramZn);
    this.ZG = paramZn.Zn();
    this.ZS = null;
    this.ZX = paramZa;
    this.Zt = paramZyd;
    this.ZD = null;
    this.ZW = null;
    this.ZO = false;
    this.Zi = Zj.ZQ();
  }
  
  protected Zz9(Zz9<?> paramZz9, Zo paramZo, Za paramZa, Zyd<?> paramZyd, Zee paramZee, Object paramObject, boolean paramBoolean) {
    super(paramZz9);
    this.ZG = paramZz9.ZG;
    this.Zi = Zj.ZQ();
    this.ZS = paramZo;
    this.ZX = paramZa;
    this.Zt = (Zyd)paramZyd;
    this.ZD = paramZee;
    this.ZW = paramObject;
    this.ZO = paramBoolean;
  }
  
  public Zyd<T> Zq(Zee paramZee) {
    Zyd<Object> zyd = this.Zt;
    if (zyd != null) {
      zyd = zyd.Zq(paramZee);
      try {
        if (zyd == this.Zt)
          return this; 
      } catch (Zy2 zy2) {
        throw a(null);
      } 
    } 
    try {
    
    } catch (Zy2 zy2) {
      throw a(null);
    } 
    Zee zee = (this.ZD == null) ? paramZee : Zee.ZN(paramZee, this.ZD);
    try {
      if (this.Zt == zyd)
        try {
          if (this.ZD == zee)
            return this; 
        } catch (Zy2 zy2) {
          throw a(null);
        }  
    } catch (Zy2 zy2) {
      throw a(null);
    } 
    return Zh(this.ZS, this.ZX, zyd, zee);
  }
  
  protected abstract Zz9<T> Zh(Zo paramZo, Za paramZa, Zyd<?> paramZyd, Zee paramZee);
  
  public abstract Zz9<T> ZD(Object paramObject, boolean paramBoolean);
  
  protected abstract boolean ZD(T paramT);
  
  protected abstract Object Ze(T paramT);
  
  protected abstract Object ZZ(T paramT);
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZX : Lcom/fasterxml/Zp/Za;
    //   7: astore #4
    //   9: astore_3
    //   10: aload #4
    //   12: ifnull -> 23
    //   15: aload #4
    //   17: aload_2
    //   18: invokevirtual ZS : (Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zp/Za;
    //   21: astore #4
    //   23: aload_0
    //   24: aload_1
    //   25: aload_2
    //   26: invokevirtual Zy : (Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyd;
    //   29: astore #5
    //   31: aload #5
    //   33: ifnonnull -> 92
    //   36: aload_0
    //   37: getfield Zt : Lcom/fasterxml/Zor/Zyd;
    //   40: astore #5
    //   42: aload #5
    //   44: ifnonnull -> 83
    //   47: aload_0
    //   48: aload_1
    //   49: aload_2
    //   50: aload_0
    //   51: getfield ZG : Lcom/fasterxml/Zor/Zk;
    //   54: invokevirtual ZJ : (Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zk;)Z
    //   57: ifeq -> 92
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: aload_0
    //   68: aload_1
    //   69: aload_0
    //   70: getfield ZG : Lcom/fasterxml/Zor/Zk;
    //   73: aload_2
    //   74: invokespecial Zj : (Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyd;
    //   77: astore #5
    //   79: aload_3
    //   80: ifnull -> 92
    //   83: aload_1
    //   84: aload #5
    //   86: aload_2
    //   87: invokevirtual Zp : (Lcom/fasterxml/Zor/Zyd;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyd;
    //   90: astore #5
    //   92: aload_0
    //   93: aload_1
    //   94: aload_2
    //   95: aload #5
    //   97: invokevirtual Za : (Lcom/fasterxml/Zor/Zyi;Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zor/Zyd;)Lcom/fasterxml/Zor/Zyd;
    //   100: astore #5
    //   102: aload_0
    //   103: getfield ZS : Lcom/fasterxml/Zor/Zo;
    //   106: aload_2
    //   107: if_acmpne -> 149
    //   110: aload_0
    //   111: getfield ZX : Lcom/fasterxml/Zp/Za;
    //   114: aload #4
    //   116: if_acmpne -> 149
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   125: athrow
    //   126: aload_0
    //   127: getfield Zt : Lcom/fasterxml/Zor/Zyd;
    //   130: aload #5
    //   132: if_acmpne -> 149
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   141: athrow
    //   142: aload_0
    //   143: astore #6
    //   145: aload_3
    //   146: ifnull -> 164
    //   149: aload_0
    //   150: aload_2
    //   151: aload #4
    //   153: aload #5
    //   155: aload_0
    //   156: getfield ZD : Lcom/fasterxml/Zm/Zee;
    //   159: invokevirtual Zh : (Lcom/fasterxml/Zor/Zo;Lcom/fasterxml/Zp/Za;Lcom/fasterxml/Zor/Zyd;Lcom/fasterxml/Zm/Zee;)Lcom/fasterxml/Zz9;
    //   162: astore #6
    //   164: aload_2
    //   165: ifnull -> 432
    //   168: aload_2
    //   169: aload_1
    //   170: invokevirtual ZH : ()Lcom/fasterxml/Zor/Zy7;
    //   173: aload_0
    //   174: invokevirtual Zz : ()Ljava/lang/Class;
    //   177: invokeinterface Zj : (Lcom/fasterxml/Zj/Zf;Ljava/lang/Class;)Lcom/fasterxml/Zz_;
    //   182: astore #7
    //   184: aload #7
    //   186: ifnull -> 432
    //   189: aload #7
    //   191: invokevirtual Zq : ()Lcom/fasterxml/Zqg;
    //   194: astore #8
    //   196: aload #8
    //   198: getstatic com/fasterxml/Zqg.USE_DEFAULTS : Lcom/fasterxml/Zqg;
    //   201: if_acmpeq -> 432
    //   204: getstatic com/fasterxml/Zgc.ZU : [I
    //   207: aload #8
    //   209: invokevirtual ordinal : ()I
    //   212: iaload
    //   213: tableswitch default -> 390, 1 -> 256, 2 -> 302, 3 -> 332, 4 -> 344, 5 -> 380, 6 -> 390
    //   252: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   255: athrow
    //   256: aload_0
    //   257: getfield ZG : Lcom/fasterxml/Zor/Zk;
    //   260: invokestatic ZQ : (Lcom/fasterxml/Zor/Zk;)Ljava/lang/Object;
    //   263: astore #9
    //   265: iconst_1
    //   266: istore #10
    //   268: aload #9
    //   270: ifnull -> 396
    //   273: aload #9
    //   275: invokevirtual getClass : ()Ljava/lang/Class;
    //   278: invokevirtual isArray : ()Z
    //   281: ifeq -> 396
    //   284: goto -> 291
    //   287: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   290: athrow
    //   291: aload #9
    //   293: invokestatic Zp : (Ljava/lang/Object;)Ljava/lang/Object;
    //   296: astore #9
    //   298: aload_3
    //   299: ifnull -> 396
    //   302: iconst_1
    //   303: istore #10
    //   305: aload_0
    //   306: getfield ZG : Lcom/fasterxml/Zor/Zk;
    //   309: invokevirtual ZP : ()Z
    //   312: ifeq -> 325
    //   315: getstatic com/fasterxml/Zz9.ZM : Ljava/lang/Object;
    //   318: goto -> 326
    //   321: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   324: athrow
    //   325: aconst_null
    //   326: astore #9
    //   328: aload_3
    //   329: ifnull -> 396
    //   332: iconst_1
    //   333: istore #10
    //   335: getstatic com/fasterxml/Zz9.ZM : Ljava/lang/Object;
    //   338: astore #9
    //   340: aload_3
    //   341: ifnull -> 396
    //   344: aload_1
    //   345: aconst_null
    //   346: aload #7
    //   348: invokevirtual Zv : ()Ljava/lang/Class;
    //   351: invokevirtual ZQ : (Lcom/fasterxml/Zoz/Zp;Ljava/lang/Class;)Ljava/lang/Object;
    //   354: astore #9
    //   356: aload #9
    //   358: ifnonnull -> 368
    //   361: iconst_1
    //   362: istore #10
    //   364: aload_3
    //   365: ifnull -> 396
    //   368: aload_1
    //   369: aload #9
    //   371: invokevirtual Zz : (Ljava/lang/Object;)Z
    //   374: istore #10
    //   376: aload_3
    //   377: ifnull -> 396
    //   380: aconst_null
    //   381: astore #9
    //   383: iconst_1
    //   384: istore #10
    //   386: aload_3
    //   387: ifnull -> 396
    //   390: aconst_null
    //   391: astore #9
    //   393: iconst_0
    //   394: istore #10
    //   396: aload_0
    //   397: getfield ZW : Ljava/lang/Object;
    //   400: aload #9
    //   402: if_acmpne -> 421
    //   405: aload_0
    //   406: getfield ZO : Z
    //   409: iload #10
    //   411: if_icmpeq -> 432
    //   414: goto -> 421
    //   417: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   420: athrow
    //   421: aload #6
    //   423: aload #9
    //   425: iload #10
    //   427: invokevirtual ZD : (Ljava/lang/Object;Z)Lcom/fasterxml/Zz9;
    //   430: astore #6
    //   432: aload #6
    //   434: areturn
    // Exception table:
    //   from	to	target	type
    //   42	60	63	com/fasterxml/Zor/Zy_
    //   102	119	122	com/fasterxml/Zor/Zy_
    //   110	135	138	com/fasterxml/Zor/Zy_
    //   196	252	252	com/fasterxml/Zor/Zy_
    //   268	284	287	com/fasterxml/Zor/Zy_
    //   305	321	321	com/fasterxml/Zor/Zy_
    //   396	414	417	com/fasterxml/Zor/Zy_
  }
  
  protected boolean ZJ(Zyi paramZyi, Zo paramZo, Zk paramZk) {
    try {
      if (paramZk.Zr())
        return false; 
    } catch (Zy2 zy2) {
      throw a(null);
    } 
    try {
      if (paramZk.ZE())
        return true; 
    } catch (Zy2 zy2) {
      throw a(null);
    } 
    try {
      if (paramZk.ZS())
        return true; 
    } catch (Zy2 zy2) {
      throw a(null);
    } 
    Zt zt = paramZyi.Zv();
    try {
      if (zt != null && paramZo != null) {
        Ziz ziz = paramZo.ZQ();
        if (ziz != null) {
          Zk zk = zt.Zx((Ziv)paramZo.ZQ());
          try {
            if (zk == Zk.STATIC)
              return true; 
          } catch (Zy2 zy2) {
            throw a(null);
          } 
          try {
            if (zk == Zk.DYNAMIC)
              return false; 
          } catch (Zy2 zy2) {
            throw a(null);
          } 
        } 
      } 
    } catch (Zy2 zy2) {
      throw a(null);
    } 
    return paramZyi.Zm(Zy9.USE_STATIC_TYPING);
  }
  
  public boolean Zt(Zyi paramZyi, T paramT) {
    try {
      if (!ZD(paramT))
        return true; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    Object object = Ze(paramT);
    try {
      if (object == null)
        return this.ZO; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    try {
      if (this.ZW == null)
        return false; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    Zyd<Object> zyd = this.Zt;
    if (zyd == null)
      try {
        zyd = ZL(paramZyi, object.getClass());
      } catch (Zy_ zy_) {
        throw new Zy2(zy_);
      }  
    try {
      if (this.ZW == ZM)
        return zyd.Zt(paramZyi, object); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return this.ZW.equals(object);
  }
  
  public boolean ZC() {
    try {
    
    } catch (Zy2 zy2) {
      throw a(null);
    } 
    return (this.ZD != null);
  }
  
  public void serialize(T paramT, Zf paramZf, Zyi paramZyi) throws IOException {
    Object object = ZZ(paramT);
    String str = Zz0.ZG();
    try {
      if (object == null) {
        try {
          if (this.ZD == null)
            paramZyi.ZT(paramZf); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zyd<Object> zyd = this.Zt;
    if (zyd == null)
      zyd = ZL(paramZyi, object.getClass()); 
    try {
      if (this.ZX != null) {
        try {
          zyd.Zo(object, paramZf, paramZyi, this.ZX);
          if (str != null) {
            zyd.serialize(object, paramZf, paramZyi);
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
    zyd.serialize(object, paramZf, paramZyi);
  }
  
  public void Zo(T paramT, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Object object = ZZ(paramT);
    try {
      if (object == null) {
        try {
          if (this.ZD == null)
            paramZyi.ZT(paramZf); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zyd<Object> zyd = this.Zt;
    if (zyd == null)
      zyd = ZL(paramZyi, object.getClass()); 
    zyd.Zo(object, paramZf, paramZyi, paramZa);
  }
  
  private final Zyd<Object> ZL(Zyi paramZyi, Class<?> paramClass) throws Zy_ {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: aload_0
    //   4: getfield Zi : Lcom/fasterxml/Zn/Zj;
    //   7: aload_2
    //   8: invokevirtual ZO : (Ljava/lang/Class;)Lcom/fasterxml/Zor/Zyd;
    //   11: astore #4
    //   13: astore_3
    //   14: aload #4
    //   16: ifnonnull -> 106
    //   19: aload_0
    //   20: getfield ZG : Lcom/fasterxml/Zor/Zk;
    //   23: invokevirtual Zk : ()Z
    //   26: ifeq -> 63
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_1
    //   37: aload_0
    //   38: getfield ZG : Lcom/fasterxml/Zor/Zk;
    //   41: aload_2
    //   42: invokevirtual ZX : (Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zk;
    //   45: astore #5
    //   47: aload_1
    //   48: aload #5
    //   50: aload_0
    //   51: getfield ZS : Lcom/fasterxml/Zor/Zo;
    //   54: invokevirtual ZW : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyd;
    //   57: astore #4
    //   59: aload_3
    //   60: ifnull -> 74
    //   63: aload_1
    //   64: aload_2
    //   65: aload_0
    //   66: getfield ZS : Lcom/fasterxml/Zor/Zo;
    //   69: invokevirtual Zb : (Ljava/lang/Class;Lcom/fasterxml/Zor/Zo;)Lcom/fasterxml/Zor/Zyd;
    //   72: astore #4
    //   74: aload_0
    //   75: getfield ZD : Lcom/fasterxml/Zm/Zee;
    //   78: ifnull -> 92
    //   81: aload #4
    //   83: aload_0
    //   84: getfield ZD : Lcom/fasterxml/Zm/Zee;
    //   87: invokevirtual Zq : (Lcom/fasterxml/Zm/Zee;)Lcom/fasterxml/Zor/Zyd;
    //   90: astore #4
    //   92: aload_0
    //   93: aload_0
    //   94: getfield Zi : Lcom/fasterxml/Zn/Zj;
    //   97: aload_2
    //   98: aload #4
    //   100: invokevirtual Zr : (Ljava/lang/Class;Lcom/fasterxml/Zor/Zyd;)Lcom/fasterxml/Zn/Zj;
    //   103: putfield Zi : Lcom/fasterxml/Zn/Zj;
    //   106: aload #4
    //   108: areturn
    // Exception table:
    //   from	to	target	type
    //   14	29	32	com/fasterxml/Zor/Zy_
  }
  
  private final Zyd<Object> Zj(Zyi paramZyi, Zk paramZk, Zo paramZo) throws Zy_ {
    return paramZyi.ZW(paramZk, paramZo);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */