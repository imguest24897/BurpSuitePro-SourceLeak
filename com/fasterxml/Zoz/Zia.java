package com.fasterxml.Zoz;

import com.fasterxml.Zh.Zi;
import com.fasterxml.Zh.Zr;
import com.fasterxml.Zm.Z_;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zt;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public final class Zia extends Ziv implements Zis {
  private static final Zid Zt;
  
  protected final Zk Zn;
  
  protected final Class<?> ZX;
  
  protected final Zr ZZ;
  
  protected final List<Zk> ZP;
  
  protected final Zt Zl;
  
  protected final Zi ZQ;
  
  protected final Zij Zk;
  
  protected final Class<?> Zx;
  
  protected final boolean ZY;
  
  protected final Z_ Zq;
  
  protected Zid Zv;
  
  protected Zj ZT;
  
  protected List<Zi6> Z_;
  
  protected transient Boolean ZH;
  
  private static final String a;
  
  Zia(Zk paramZk, Class<?> paramClass1, List<Zk> paramList, Class<?> paramClass2, Z_ paramZ_, Zr paramZr, Zt paramZt, Zij paramZij, Zi paramZi, boolean paramBoolean) {
    this.Zn = paramZk;
    this.ZX = paramClass1;
    this.ZP = paramList;
    this.Zx = paramClass2;
    this.Zq = paramZ_;
    this.ZZ = paramZr;
    this.Zl = paramZt;
    this.Zk = paramZij;
    this.ZQ = paramZi;
    this.ZY = paramBoolean;
  }
  
  Zia(Class<?> paramClass) {
    this.Zn = null;
    this.ZX = paramClass;
    this.ZP = Collections.emptyList();
    this.Zx = null;
    this.Zq = Zie.Zy();
    this.ZZ = Zr.ZN();
    this.Zl = null;
    this.Zk = null;
    this.ZQ = null;
    this.ZY = false;
  }
  
  public Zk ZT(Type paramType) {
    return this.ZQ.Zb(paramType, this.ZZ);
  }
  
  public Class<?> Zm() {
    return this.ZX;
  }
  
  public int ZO() {
    return this.ZX.getModifiers();
  }
  
  public String ZW() {
    return this.ZX.getName();
  }
  
  public <A extends Annotation> A ZU(Class<A> paramClass) {
    return (A)this.Zq.ZH(paramClass);
  }
  
  public boolean ZT(Class<?> paramClass) {
    return this.Zq.Ze(paramClass);
  }
  
  public boolean Zq(Class<? extends Annotation>[] paramArrayOfClass) {
    return this.Zq.ZZ((Class[])paramArrayOfClass);
  }
  
  public Class<?> ZN() {
    return this.ZX;
  }
  
  public Zk Zf() {
    return this.Zn;
  }
  
  public Z_ Zr() {
    return this.Zq;
  }
  
  public boolean ZI() {
    return (this.Zq.ZJ() > 0);
  }
  
  public Zik ZV() {
    return (Zg()).Zb;
  }
  
  public List<Zik> Zx() {
    return (Zg()).Ze;
  }
  
  public List<Ziq> Zj() {
    return (Zg()).Zt;
  }
  
  public Iterable<Ziq> Zl() {
    return Zy();
  }
  
  public Ziq ZO(String paramString, Class<?>[] paramArrayOfClass) {
    return Zy().Zy(paramString, paramArrayOfClass);
  }
  
  public Iterable<Zi6> ZS() {
    return ZR();
  }
  
  public boolean Zk() {
    Boolean bool = this.ZH;
    if (bool == null)
      this.ZH = bool = Boolean.valueOf(Zx.Zg(this.ZX)); 
    return bool.booleanValue();
  }
  
  private final List<Zi6> ZR() {
    // Byte code:
    //   0: invokestatic ZM : ()I
    //   3: aload_0
    //   4: getfield Z_ : Ljava/util/List;
    //   7: astore_2
    //   8: istore_1
    //   9: aload_2
    //   10: ifnonnull -> 58
    //   13: aload_0
    //   14: getfield Zn : Lcom/fasterxml/Zor/Zk;
    //   17: ifnonnull -> 28
    //   20: invokestatic emptyList : ()Ljava/util/List;
    //   23: astore_2
    //   24: iload_1
    //   25: ifne -> 53
    //   28: aload_0
    //   29: getfield Zl : Lcom/fasterxml/Zor/Zt;
    //   32: aload_0
    //   33: aload_0
    //   34: getfield Zk : Lcom/fasterxml/Zoz/Zij;
    //   37: aload_0
    //   38: getfield ZQ : Lcom/fasterxml/Zh/Zi;
    //   41: aload_0
    //   42: getfield Zn : Lcom/fasterxml/Zor/Zk;
    //   45: aload_0
    //   46: getfield ZY : Z
    //   49: invokestatic ZY : (Lcom/fasterxml/Zor/Zt;Lcom/fasterxml/Zoz/Zis;Lcom/fasterxml/Zoz/Zij;Lcom/fasterxml/Zh/Zi;Lcom/fasterxml/Zor/Zk;Z)Ljava/util/List;
    //   52: astore_2
    //   53: aload_0
    //   54: aload_2
    //   55: putfield Z_ : Ljava/util/List;
    //   58: aload_2
    //   59: areturn
  }
  
  private final Zj Zy() {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: aload_0
    //   4: getfield ZT : Lcom/fasterxml/Zoz/Zj;
    //   7: astore_2
    //   8: istore_1
    //   9: aload_2
    //   10: ifnonnull -> 70
    //   13: aload_0
    //   14: getfield Zn : Lcom/fasterxml/Zor/Zk;
    //   17: ifnonnull -> 32
    //   20: new com/fasterxml/Zoz/Zj
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: astore_2
    //   28: iload_1
    //   29: ifeq -> 65
    //   32: aload_0
    //   33: getfield Zl : Lcom/fasterxml/Zor/Zt;
    //   36: aload_0
    //   37: aload_0
    //   38: getfield Zk : Lcom/fasterxml/Zoz/Zij;
    //   41: aload_0
    //   42: getfield ZQ : Lcom/fasterxml/Zh/Zi;
    //   45: aload_0
    //   46: getfield Zn : Lcom/fasterxml/Zor/Zk;
    //   49: aload_0
    //   50: getfield ZP : Ljava/util/List;
    //   53: aload_0
    //   54: getfield Zx : Ljava/lang/Class;
    //   57: aload_0
    //   58: getfield ZY : Z
    //   61: invokestatic ZD : (Lcom/fasterxml/Zor/Zt;Lcom/fasterxml/Zoz/Zis;Lcom/fasterxml/Zoz/Zij;Lcom/fasterxml/Zh/Zi;Lcom/fasterxml/Zor/Zk;Ljava/util/List;Ljava/lang/Class;Z)Lcom/fasterxml/Zoz/Zj;
    //   64: astore_2
    //   65: aload_0
    //   66: aload_2
    //   67: putfield ZT : Lcom/fasterxml/Zoz/Zj;
    //   70: aload_2
    //   71: areturn
  }
  
  private final Zid Zg() {
    // Byte code:
    //   0: invokestatic ZM : ()I
    //   3: aload_0
    //   4: getfield Zv : Lcom/fasterxml/Zoz/Zid;
    //   7: astore_2
    //   8: istore_1
    //   9: aload_2
    //   10: ifnonnull -> 58
    //   13: aload_0
    //   14: getfield Zn : Lcom/fasterxml/Zor/Zk;
    //   17: ifnonnull -> 28
    //   20: getstatic com/fasterxml/Zoz/Zia.Zt : Lcom/fasterxml/Zoz/Zid;
    //   23: astore_2
    //   24: iload_1
    //   25: ifne -> 53
    //   28: aload_0
    //   29: getfield Zl : Lcom/fasterxml/Zor/Zt;
    //   32: aload_0
    //   33: getfield ZQ : Lcom/fasterxml/Zh/Zi;
    //   36: aload_0
    //   37: aload_0
    //   38: getfield Zn : Lcom/fasterxml/Zor/Zk;
    //   41: aload_0
    //   42: getfield Zx : Ljava/lang/Class;
    //   45: aload_0
    //   46: getfield ZY : Z
    //   49: invokestatic ZD : (Lcom/fasterxml/Zor/Zt;Lcom/fasterxml/Zh/Zi;Lcom/fasterxml/Zoz/Zis;Lcom/fasterxml/Zor/Zk;Ljava/lang/Class;Z)Lcom/fasterxml/Zoz/Zid;
    //   52: astore_2
    //   53: aload_0
    //   54: aload_2
    //   55: putfield Zv : Lcom/fasterxml/Zoz/Zid;
    //   58: aload_2
    //   59: areturn
  }
  
  public String toString() {
    return a + this.ZX.getName() + "]";
  }
  
  public int hashCode() {
    return this.ZX.hashCode();
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject == this) ? true : (!Zx.Zi(paramObject, getClass()) ? false : ((((Zia)paramObject).ZX == this.ZX)));
  }
  
  static {
    // Byte code:
    //   0: bipush #92
    //   2: ldc 'nE4W~QG6\\fKyQ'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zoz/Zia.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #105
    //   82: goto -> 112
    //   85: bipush #88
    //   87: goto -> 112
    //   90: bipush #6
    //   92: goto -> 112
    //   95: bipush #49
    //   97: goto -> 112
    //   100: bipush #100
    //   102: goto -> 112
    //   105: bipush #86
    //   107: goto -> 112
    //   110: bipush #45
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: new com/fasterxml/Zoz/Zid
    //   157: dup
    //   158: aconst_null
    //   159: invokestatic emptyList : ()Ljava/util/List;
    //   162: invokestatic emptyList : ()Ljava/util/List;
    //   165: invokespecial <init> : (Lcom/fasterxml/Zoz/Zik;Ljava/util/List;Ljava/util/List;)V
    //   168: putstatic com/fasterxml/Zoz/Zia.Zt : Lcom/fasterxml/Zoz/Zid;
    //   171: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zia.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */