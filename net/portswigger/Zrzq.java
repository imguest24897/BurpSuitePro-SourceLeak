package net.portswigger;

import java.util.Objects;
import java.util.function.Function;

class Zrzq extends Zrzi {
  private final boolean Zm;
  
  private static final String c;
  
  public Zrzq(boolean paramBoolean) {
    this.Zm = paramBoolean;
  }
  
  public boolean Zm() {
    return this.Zm;
  }
  
  public boolean ZJ(boolean paramBoolean) {
    return this.Zm;
  }
  
  public boolean Zh() {
    return true;
  }
  
  public <T> T Zv(Function<Zrmq, T> paramFunction, T paramT) {
    return paramFunction.apply(this);
  }
  
  protected void ZC(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Za1 paramZa1) {
    paramZa1.Zr(this.Zm);
    Zt(paramZa1, false, this.ZU, paramBoolean2, paramBoolean3, paramInt1, paramInt2);
  }
  
  protected String Zg() {
    return c;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zrzq zrzq = (Zrzq)paramObject;
    return (this.Zm == zrzq.Zm);
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Boolean.valueOf(this.Zm) });
  }
  
  public Zrmq Z_() {
    return Zv3.ZK(this.Zm).Zi(this.ZU);
  }
  
  static {
    // Byte code:
    //   0: bipush #104
    //   2: ldc 'TfNzd['
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zrzq.c : Ljava/lang/String;
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
    //   80: bipush #11
    //   82: goto -> 112
    //   85: bipush #83
    //   87: goto -> 112
    //   90: bipush #97
    //   92: goto -> 112
    //   95: bipush #74
    //   97: goto -> 112
    //   100: bipush #119
    //   102: goto -> 112
    //   105: bipush #109
    //   107: goto -> 112
    //   110: bipush #93
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrzq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */