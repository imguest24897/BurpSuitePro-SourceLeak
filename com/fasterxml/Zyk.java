package com.fasterxml;

import java.io.Serializable;

public class Zyk implements Zvs<Zvi>, Serializable {
  private static final long serialVersionUID = 1L;
  
  private final Zvg Zq;
  
  private final Zvg Zb;
  
  protected static final Zyk Zn;
  
  private static final String a;
  
  protected Zyk(Zvg paramZvg1, Zvg paramZvg2) {
    this.Zq = paramZvg1;
    this.Zb = paramZvg2;
  }
  
  protected Object readResolve() {
    return Z_(this.Zq, this.Zb) ? Zn : this;
  }
  
  public static Zyk Zi(Zvi paramZvi) {
    return (paramZvi == null) ? Zn : Za(paramZvi.ZE(), paramZvi.Zr());
  }
  
  public static Zyk Za(Zvg paramZvg1, Zvg paramZvg2) {
    if (paramZvg1 == null)
      paramZvg1 = Zvg.DEFAULT; 
    if (paramZvg2 == null)
      paramZvg2 = Zvg.DEFAULT; 
    return Z_(paramZvg1, paramZvg2) ? Zn : new Zyk(paramZvg1, paramZvg2);
  }
  
  public static Zyk ZJ() {
    return Zn;
  }
  
  public Zvg Zy() {
    return this.Zb;
  }
  
  public Zvg ZI() {
    return (this.Zq == Zvg.DEFAULT) ? null : this.Zq;
  }
  
  public Zvg ZV() {
    return (this.Zb == Zvg.DEFAULT) ? null : this.Zb;
  }
  
  public String toString() {
    return String.format(a, new Object[] { this.Zq, this.Zb });
  }
  
  public int hashCode() {
    return this.Zq.ordinal() + (this.Zb.ordinal() << 2);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject.getClass() == getClass()) {
      Zyk zyk = (Zyk)paramObject;
      return (zyk.Zq == this.Zq && zyk.Zb == this.Zb);
    } 
    return false;
  }
  
  private static boolean Z_(Zvg paramZvg1, Zvg paramZvg2) {
    return (paramZvg1 == Zvg.DEFAULT && paramZvg2 == Zvg.DEFAULT);
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: ldc '\\nRF!4D[O$5D%o\\\rPeR%O]/3\\f['
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zyk.a : Ljava/lang/String;
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
    //   80: bipush #74
    //   82: goto -> 112
    //   85: bipush #43
    //   87: goto -> 112
    //   90: bipush #35
    //   92: goto -> 112
    //   95: bipush #107
    //   97: goto -> 112
    //   100: bipush #120
    //   102: goto -> 112
    //   105: bipush #118
    //   107: goto -> 112
    //   110: bipush #103
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
    //   154: new com/fasterxml/Zyk
    //   157: dup
    //   158: getstatic com/fasterxml/Zvg.DEFAULT : Lcom/fasterxml/Zvg;
    //   161: getstatic com/fasterxml/Zvg.DEFAULT : Lcom/fasterxml/Zvg;
    //   164: invokespecial <init> : (Lcom/fasterxml/Zvg;Lcom/fasterxml/Zvg;)V
    //   167: putstatic com/fasterxml/Zyk.Zn : Lcom/fasterxml/Zyk;
    //   170: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zyk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */