package com.fasterxml.Zh;

import burp.Zbqc;
import com.fasterxml.Zor.Zk;
import java.util.ArrayList;

public final class Zb {
  protected final Zb ZZ;
  
  protected final Class<?> ZO;
  
  private ArrayList<Zu> ZX;
  
  private static final String a;
  
  public Zb(Class<?> paramClass) {
    this(null, paramClass);
  }
  
  private Zb(Zb paramZb, Class<?> paramClass) {
    this.ZZ = paramZb;
    this.ZO = paramClass;
  }
  
  public Zb Zw(Class<?> paramClass) {
    return new Zb(this, paramClass);
  }
  
  public void ZS(Zu paramZu) {
    if (this.ZX == null)
      this.ZX = new ArrayList<>(); 
    this.ZX.add(paramZu);
  }
  
  public void Zf(Zk paramZk) {
    if (this.ZX != null)
      for (Zu zu : this.ZX)
        zu.Zh(paramZk);  
  }
  
  public Zb ZL(Class<?> paramClass) {
    if (this.ZO == paramClass)
      return this; 
    for (Zb zb = this.ZZ; zb != null; zb = zb.ZZ) {
      if (zb.ZO == paramClass)
        return zb; 
    } 
    return null;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    int[] arrayOfInt = Zd.Zs();
    stringBuilder.append(a).append((this.ZX == null) ? "0" : String.valueOf(this.ZX.size())).append(')');
    Zb zb = this;
    while (zb != null) {
      stringBuilder.append(' ').append(zb.ZO.getName());
      zb = zb.ZZ;
      if (arrayOfInt != null) {
        Zbqc.Zr(new Zbqc[4]);
        break;
      } 
    } 
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: ldc '8TCgy_vL4"{IGfoj-'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zh/Zb.a : Ljava/lang/String;
    //   11: goto -> 152
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
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #106
    //   82: goto -> 110
    //   85: bipush #30
    //   87: goto -> 110
    //   90: bipush #38
    //   92: goto -> 110
    //   95: bipush #99
    //   97: goto -> 110
    //   100: bipush #29
    //   102: goto -> 110
    //   105: iconst_3
    //   106: goto -> 110
    //   109: iconst_5
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zh\Zb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */