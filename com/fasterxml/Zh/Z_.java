package com.fasterxml.Zh;

import com.fasterxml.Zor.Zk;
import java.util.Objects;

final class Z_ {
  private final Class<?> Za;
  
  private final Zk[] Zy;
  
  private final int ZX;
  
  private static final String a;
  
  public Z_(Class<?> paramClass, Zk[] paramArrayOfZk, int paramInt) {
    this.Za = paramClass;
    this.Zy = paramArrayOfZk;
    this.ZX = 31 * paramClass.hashCode() + paramInt;
  }
  
  public int hashCode() {
    return this.ZX;
  }
  
  public boolean equals(Object paramObject) {
    int[] arrayOfInt = Zd.Zs();
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (paramObject.getClass() != getClass())
      return false; 
    Z_ z_ = (Z_)paramObject;
    if (this.ZX == z_.ZX && this.Za == z_.Za) {
      Zk[] arrayOfZk = z_.Zy;
      int i = this.Zy.length;
      if (i == arrayOfZk.length) {
        byte b = 0;
        while (b < i) {
          if (!Objects.equals(this.Zy[b], arrayOfZk[b]))
            return false; 
          b++;
          if (arrayOfInt != null)
            break; 
        } 
        return true;
      } 
    } 
    return false;
  }
  
  public String toString() {
    return this.Za.getName() + a;
  }
  
  static {
    // Byte code:
    //   0: bipush #54
    //   2: ldc '=+'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zh/Z_.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #55
    //   82: goto -> 111
    //   85: bipush #35
    //   87: goto -> 111
    //   90: iconst_4
    //   91: goto -> 111
    //   94: bipush #46
    //   96: goto -> 111
    //   99: bipush #21
    //   101: goto -> 111
    //   104: bipush #37
    //   106: goto -> 111
    //   109: bipush #19
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zh\Z_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */