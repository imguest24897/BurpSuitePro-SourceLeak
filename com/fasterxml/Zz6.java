package com.fasterxml;

import java.io.Serializable;

public class Zz6 implements Zvs<Zyo>, Serializable {
  private static final long serialVersionUID = 1L;
  
  protected static final Zz6 Zy;
  
  protected final Object ZI;
  
  protected final Boolean ZQ;
  
  private static final String a;
  
  protected Zz6(Object paramObject, Boolean paramBoolean) {
    this.ZI = paramObject;
    this.ZQ = paramBoolean;
  }
  
  public static Zz6 Zd(Object paramObject, Boolean paramBoolean) {
    if ("".equals(paramObject))
      paramObject = null; 
    return ZL(paramObject, paramBoolean) ? Zy : new Zz6(paramObject, paramBoolean);
  }
  
  public static Zz6 Zo(Zyo paramZyo) {
    return (paramZyo == null) ? Zy : Zd(paramZyo.value(), paramZyo.ZA().ZT());
  }
  
  public static Zz6 Z_(Object paramObject) {
    return Zd(paramObject, null);
  }
  
  public Zz6 ZC(Object paramObject) {
    if (paramObject == null) {
      if (this.ZI == null)
        return this; 
    } else if (paramObject.equals(this.ZI)) {
      return this;
    } 
    return new Zz6(paramObject, this.ZQ);
  }
  
  public Object Zf() {
    return this.ZI;
  }
  
  public boolean Zn() {
    return (this.ZI != null);
  }
  
  public boolean Zo(boolean paramBoolean) {
    return (this.ZQ == null) ? paramBoolean : this.ZQ.booleanValue();
  }
  
  public String toString() {
    return String.format(a, new Object[] { this.ZI, this.ZQ });
  }
  
  public int hashCode() {
    int i = 1;
    if (this.ZI != null)
      i += this.ZI.hashCode(); 
    if (this.ZQ != null)
      i += this.ZQ.hashCode(); 
    return i;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject.getClass() == getClass()) {
      Zz6 zz6 = (Zz6)paramObject;
      if (Zqa.Zp(this.ZQ, zz6.ZQ))
        return (this.ZI == null) ? ((zz6.ZI == null)) : this.ZI.equals(zz6.ZI); 
    } 
    return false;
  }
  
  private static boolean ZL(Object paramObject, Boolean paramBoolean) {
    return (paramObject == null && paramBoolean == null);
  }
  
  static {
    // Byte code:
    //   0: bipush #35
    //   2: ldc '~gupw,}h|`llbgzf0+P;3\\b/m1QOxvlu?'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zz6.a : Ljava/lang/String;
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
    //   80: bipush #23
    //   82: goto -> 112
    //   85: bipush #37
    //   87: goto -> 112
    //   90: bipush #53
    //   92: goto -> 112
    //   95: bipush #88
    //   97: goto -> 112
    //   100: bipush #32
    //   102: goto -> 112
    //   105: bipush #59
    //   107: goto -> 112
    //   110: bipush #97
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
    //   154: new com/fasterxml/Zz6
    //   157: dup
    //   158: aconst_null
    //   159: aconst_null
    //   160: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Boolean;)V
    //   163: putstatic com/fasterxml/Zz6.Zy : Lcom/fasterxml/Zz6;
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */