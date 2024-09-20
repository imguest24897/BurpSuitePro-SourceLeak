package com.fasterxml.Zs;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Ze.Zoo;
import com.fasterxml.Ze.Zor;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zm.Zq;
import com.fasterxml.Zo.Zi;
import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zvg;
import com.fasterxml.Zye;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Objects;

public abstract class Zu1<T> extends Zl<T> implements Zi {
  protected final Boolean ZD = null;
  
  private transient Object ZF;
  
  protected final Zzb Zp = null;
  
  private static final String e;
  
  protected Zu1(Class<T> paramClass) {
    super(paramClass);
  }
  
  protected Zu1(Zu1<?> paramZu1, Zzb paramZzb, Boolean paramBoolean) {
    super(paramZu1.ZC);
  }
  
  public static Zyo<?> ZI(Class<?> paramClass) {
    try {
      if (paramClass == int.class)
        return Zu7.ZT; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramClass == long.class)
        return Zu0.Zq; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramClass == byte.class)
        return new Zu5(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramClass == short.class)
        return new Zua(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramClass == float.class)
        return new Zuz(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramClass == double.class)
        return new Zun(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramClass == boolean.class)
        return new Zuu(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramClass == char.class)
        return new Zud(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(e + paramClass);
  }
  
  public Zyo<?> Zq(Zyg paramZyg, Zo paramZo) throws Zy_ {
    Zor zor;
    Boolean bool = ZP(paramZyg, paramZo, this.ZC, Zye.ACCEPT_SINGLE_VALUE_AS_ARRAY);
    Zoo zoo = null;
    Zvg zvg = Zi(paramZyg, paramZo);
    if (zvg == Zvg.SKIP) {
      zoo = Zoo.Zp();
    } else {
      try {
        if (zvg == Zvg.FAIL)
          if (paramZo == null) {
            zor = Zor.ZF(paramZyg.ZW(this.ZC.getComponentType()));
          } else {
            zor = Zor.Zc(paramZo, paramZo.Zp().ZB());
          }  
      } catch (Zy_ zy_) {
        throw a(null);
      } 
    } 
    try {
      if (Objects.equals(bool, this.ZD))
        try {
          if (zor == this.Zp)
            return this; 
        } catch (Zy_ zy_) {
          throw a(null);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return Zk((Zzb)zor, bool);
  }
  
  protected abstract T Zj(T paramT1, T paramT2);
  
  protected abstract T Zk(Zg paramZg, Zyg paramZyg) throws IOException;
  
  protected abstract Zu1<?> Zk(Zzb paramZzb, Boolean paramBoolean);
  
  protected abstract T Zq();
  
  public Zd Zb() {
    return Zd.Array;
  }
  
  public Boolean Zu(Zyc paramZyc) {
    return Boolean.TRUE;
  }
  
  public Zq Zm() {
    return Zq.CONSTANT;
  }
  
  public Object Zy(Zyg paramZyg) throws Zy_ {
    Object object = this.ZF;
    if (object == null)
      this.ZF = object = Zq(); 
    return object;
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    return paramZt.ZF(paramZg, paramZyg);
  }
  
  public T ZI(Zg paramZg, Zyg paramZyg, T paramT) throws IOException {
    Object object = deserialize(paramZg, paramZyg);
    try {
      if (paramT == null)
        return (T)object; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    int i = Array.getLength(paramT);
    try {
      if (i == 0)
        return (T)object; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zj(paramT, (T)object);
  }
  
  protected T Zn(Zg paramZg, Zyg paramZyg) throws IOException {
    // Byte code:
    //   0: aload_1
    //   1: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   4: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   7: ifeq -> 21
    //   10: aload_0
    //   11: aload_1
    //   12: aload_2
    //   13: invokevirtual ZD : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   16: areturn
    //   17: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   20: athrow
    //   21: aload_0
    //   22: getfield ZD : Ljava/lang/Boolean;
    //   25: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   28: if_acmpeq -> 62
    //   31: aload_0
    //   32: getfield ZD : Ljava/lang/Boolean;
    //   35: ifnonnull -> 70
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: aload_2
    //   46: getstatic com/fasterxml/Zor/Zyp.ACCEPT_SINGLE_VALUE_AS_ARRAY : Lcom/fasterxml/Zor/Zyp;
    //   49: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   52: ifeq -> 70
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: iconst_1
    //   63: goto -> 71
    //   66: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: iconst_0
    //   71: istore_3
    //   72: iload_3
    //   73: ifeq -> 87
    //   76: aload_0
    //   77: aload_1
    //   78: aload_2
    //   79: invokevirtual Zk : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   82: areturn
    //   83: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   86: athrow
    //   87: aload_2
    //   88: aload_0
    //   89: getfield ZC : Ljava/lang/Class;
    //   92: aload_1
    //   93: invokevirtual ZB : (Ljava/lang/Class;Lcom/fasterxml/Zb/Zg;)Ljava/lang/Object;
    //   96: areturn
    // Exception table:
    //   from	to	target	type
    //   0	17	17	java/io/IOException
    //   21	38	41	java/io/IOException
    //   31	55	58	java/io/IOException
    //   45	66	66	java/io/IOException
    //   72	83	83	java/io/IOException
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #119
    //   2: ldc 'EiL\q[pNB\\n8]gRBY\\f0R"ON4EvRWR4"'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zs/Zu1.e : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 99, 5 -> 104
    //   80: bipush #38
    //   82: goto -> 111
    //   85: bipush #92
    //   87: goto -> 111
    //   90: bipush #117
    //   92: goto -> 111
    //   95: iconst_5
    //   96: goto -> 111
    //   99: bipush #84
    //   101: goto -> 111
    //   104: bipush #92
    //   106: goto -> 111
    //   109: bipush #9
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zu1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */