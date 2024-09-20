package com.fasterxml.Zh;

import com.fasterxml.Zor.Zk;
import java.lang.reflect.Array;

public final class Zg extends Zv {
  private static final long serialVersionUID = 1L;
  
  protected final Zk Zz;
  
  protected final Object ZQ;
  
  private static final String b;
  
  protected Zg(Zk paramZk, Zr paramZr, Object paramObject1, Object paramObject2, Object paramObject3, boolean paramBoolean) {
    super(paramObject1.getClass(), paramZr, (Zk)null, (Zk[])null, paramZk.hashCode(), paramObject2, paramObject3, paramBoolean);
    this.Zz = paramZk;
    this.ZQ = paramObject1;
  }
  
  public static Zg ZI(Zk paramZk, Zr paramZr) {
    return Zm(paramZk, paramZr, (Object)null, (Object)null);
  }
  
  public static Zg Zm(Zk paramZk, Zr paramZr, Object paramObject1, Object paramObject2) {
    Object object = Array.newInstance(paramZk.Zf(), 0);
    return new Zg(paramZk, paramZr, object, paramObject1, paramObject2, false);
  }
  
  public Zk ZR(Zk paramZk) {
    Object object = Array.newInstance(paramZk.Zf(), 0);
    return new Zg(paramZk, this.ZB, object, this.ZA, this.Zf, this.ZZ);
  }
  
  public Zg ZC(Object paramObject) {
    return (paramObject == this.Zf) ? this : new Zg(this.Zz, this.ZB, this.ZQ, this.ZA, paramObject, this.ZZ);
  }
  
  public Zg ZK(Object paramObject) {
    return (paramObject == this.Zz.Zi()) ? this : new Zg(this.Zz.Zc(paramObject), this.ZB, this.ZQ, this.ZA, this.Zf, this.ZZ);
  }
  
  public Zg Ze(Object paramObject) {
    return (paramObject == this.ZA) ? this : new Zg(this.Zz, this.ZB, this.ZQ, paramObject, this.Zf, this.ZZ);
  }
  
  public Zg Zm(Object paramObject) {
    return (paramObject == this.Zz.ZY()) ? this : new Zg(this.Zz.Zv(paramObject), this.ZB, this.ZQ, this.ZA, this.Zf, this.ZZ);
  }
  
  public Zg ZD() {
    return this.ZZ ? this : new Zg(this.Zz.Zq(), this.ZB, this.ZQ, this.ZA, this.Zf, true);
  }
  
  public Zk Zv(Class<?> paramClass, Zr paramZr, Zk paramZk, Zk[] paramArrayOfZk) {
    return null;
  }
  
  public boolean ZC() {
    return true;
  }
  
  public boolean ZV() {
    return false;
  }
  
  public boolean Zp() {
    return true;
  }
  
  public boolean Zk() {
    return this.Zz.Zk();
  }
  
  public boolean ZH() {
    return true;
  }
  
  public Zk ZB() {
    return this.Zz;
  }
  
  public boolean Zg() {
    return (super.Zg() || this.Zz.Zg());
  }
  
  public StringBuilder Zc(StringBuilder paramStringBuilder) {
    paramStringBuilder.append('[');
    return this.Zz.Zc(paramStringBuilder);
  }
  
  public StringBuilder ZS(StringBuilder paramStringBuilder) {
    paramStringBuilder.append('[');
    return this.Zz.ZS(paramStringBuilder);
  }
  
  public Object[] ZL() {
    return (Object[])this.ZQ;
  }
  
  public String toString() {
    return b + this.Zz + "]";
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject.getClass() != getClass())
      return false; 
    Zg zg = (Zg)paramObject;
    return this.Zz.equals(zg.Zz);
  }
  
  static {
    // Byte code:
    //   0: bipush #54
    //   2: ldc '0coKDW{m\\\tGomVK"i@UMK'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zh/Zg.b : Ljava/lang/String;
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
    //   80: bipush #93
    //   82: goto -> 112
    //   85: bipush #52
    //   87: goto -> 112
    //   90: bipush #43
    //   92: goto -> 112
    //   95: bipush #15
    //   97: goto -> 112
    //   100: bipush #19
    //   102: goto -> 112
    //   105: bipush #81
    //   107: goto -> 112
    //   110: bipush #65
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
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zh\Zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */