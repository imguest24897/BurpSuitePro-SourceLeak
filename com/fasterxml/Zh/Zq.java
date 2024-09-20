package com.fasterxml.Zh;

import com.fasterxml.Zor.Zk;
import java.util.Objects;

public class Zq extends Zy {
  private static final long serialVersionUID = 1L;
  
  protected final Zk Zx;
  
  private static final String d;
  
  protected Zq(Class<?> paramClass, Zr paramZr, Zk paramZk1, Zk[] paramArrayOfZk, Zk paramZk2, Object paramObject1, Object paramObject2, boolean paramBoolean) {
    super(paramClass, paramZr, paramZk1, paramArrayOfZk, Objects.hashCode(paramZk2), paramObject1, paramObject2, paramBoolean);
    this.Zx = paramZk2;
  }
  
  public static Zq Zt(Class<?> paramClass, Zr paramZr, Zk paramZk1, Zk[] paramArrayOfZk, Zk paramZk2) {
    return new Zq(paramClass, paramZr, paramZk1, paramArrayOfZk, paramZk2, null, null, false);
  }
  
  public Zk ZR(Zk paramZk) {
    return (this.Zx == paramZk) ? this : new Zq(this.ZM, this.ZB, this.Zg, this.Zs, paramZk, this.ZA, this.Zf, this.ZZ);
  }
  
  public Zq ZL(Object paramObject) {
    return (paramObject == this.Zf) ? this : new Zq(this.ZM, this.ZB, this.Zg, this.Zs, this.Zx, this.ZA, paramObject, this.ZZ);
  }
  
  public Zq Zi(Object paramObject) {
    return (paramObject == this.Zx.Zi()) ? this : new Zq(this.ZM, this.ZB, this.Zg, this.Zs, this.Zx.Zc(paramObject), this.ZA, this.Zf, this.ZZ);
  }
  
  public Zq Zd(Object paramObject) {
    return (paramObject == this.ZA) ? this : new Zq(this.ZM, this.ZB, this.Zg, this.Zs, this.Zx, paramObject, this.Zf, this.ZZ);
  }
  
  public Zq ZG(Object paramObject) {
    return (paramObject == this.Zx.ZY()) ? this : new Zq(this.ZM, this.ZB, this.Zg, this.Zs, this.Zx.Zv(paramObject), this.ZA, this.Zf, this.ZZ);
  }
  
  public Zq ZA() {
    return this.ZZ ? this : new Zq(this.ZM, this.ZB, this.Zg, this.Zs, this.Zx.Zq(), this.ZA, this.Zf, true);
  }
  
  public Zk Zv(Class<?> paramClass, Zr paramZr, Zk paramZk, Zk[] paramArrayOfZk) {
    return new Zq(paramClass, this.ZB, paramZk, paramArrayOfZk, this.Zx, this.ZA, this.Zf, this.ZZ);
  }
  
  protected String Z_() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.ZM.getName());
    if (this.Zx != null && ZA(1)) {
      stringBuilder.append('<');
      stringBuilder.append(this.Zx.Zy());
      stringBuilder.append('>');
    } 
    return stringBuilder.toString();
  }
  
  public Zk ZB() {
    return this.Zx;
  }
  
  public boolean ZG() {
    return true;
  }
  
  public StringBuilder ZS(StringBuilder paramStringBuilder) {
    return Zk(this.ZM, paramStringBuilder, true);
  }
  
  public StringBuilder Zc(StringBuilder paramStringBuilder) {
    Zk(this.ZM, paramStringBuilder, false);
    paramStringBuilder.append('<');
    paramStringBuilder = this.Zx.Zc(paramStringBuilder);
    paramStringBuilder.append(d);
    return paramStringBuilder;
  }
  
  static {
    // Byte code:
    //   0: bipush #96
    //   2: ldc '"&'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zh/Zq.d : Ljava/lang/String;
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
    //   80: bipush #124
    //   82: goto -> 112
    //   85: bipush #125
    //   87: goto -> 112
    //   90: bipush #27
    //   92: goto -> 112
    //   95: bipush #34
    //   97: goto -> 112
    //   100: bipush #13
    //   102: goto -> 112
    //   105: bipush #101
    //   107: goto -> 112
    //   110: bipush #95
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zh\Zq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */