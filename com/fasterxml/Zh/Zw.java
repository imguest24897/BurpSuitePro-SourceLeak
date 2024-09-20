package com.fasterxml.Zh;

import com.fasterxml.Zor.Zk;

public class Zw extends Zt {
  private static final long serialVersionUID = 1L;
  
  protected final int Zc;
  
  protected Zk Z_;
  
  private static final String b;
  
  public Zw(int paramInt) {
    super(Object.class, Zr.ZN(), Zi.Zs(), null, 1, null, null, false);
    this.Zc = paramInt;
  }
  
  public Zk ZL() {
    return this.Z_;
  }
  
  public void Ze(Zk paramZk) {
    this.Z_ = paramZk;
  }
  
  protected String Z_() {
    return toString();
  }
  
  public StringBuilder Zc(StringBuilder paramStringBuilder) {
    return ZS(paramStringBuilder);
  }
  
  public StringBuilder ZS(StringBuilder paramStringBuilder) {
    paramStringBuilder.append('$').append(this.Zc + 1);
    return paramStringBuilder;
  }
  
  public Zk Zc(Object paramObject) {
    return ZQ();
  }
  
  public Zk ZW(Object paramObject) {
    return ZQ();
  }
  
  public Zk Zv(Object paramObject) {
    return ZQ();
  }
  
  public Zk Zw(Object paramObject) {
    return ZQ();
  }
  
  public Zk ZR(Zk paramZk) {
    return ZQ();
  }
  
  public Zk Zq() {
    return ZQ();
  }
  
  public Zk Zv(Class<?> paramClass, Zr paramZr, Zk paramZk, Zk[] paramArrayOfZk) {
    return ZQ();
  }
  
  public boolean ZH() {
    return false;
  }
  
  public String toString() {
    return ZS(new StringBuilder()).toString();
  }
  
  private <T> T ZQ() {
    throw new UnsupportedOperationException(b + getClass().getName());
  }
  
  static {
    // Byte code:
    //   0: bipush #104
    //   2: ldc 'N<u\UVn"0]\Mm(0@[VJc)0O@Vl<dKPol'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zh/Zw.b : Ljava/lang/String;
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
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #105
    //   82: goto -> 111
    //   85: bipush #36
    //   87: goto -> 111
    //   90: bipush #120
    //   92: goto -> 111
    //   95: bipush #70
    //   97: goto -> 111
    //   100: bipush #92
    //   102: goto -> 111
    //   105: bipush #74
    //   107: goto -> 111
    //   110: iconst_2
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zh\Zw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */