package net.portswigger;

public class Zk2 {
  public int Zb;
  
  public int Zt;
  
  public int Za;
  
  private static final String a;
  
  public Zk2(int paramInt1, int paramInt2, int paramInt3) {
    this.Zb = paramInt1;
    this.Zt = paramInt2;
    this.Za = paramInt3;
  }
  
  public String toString() {
    return String.format(a, new Object[] { Integer.valueOf(this.Zt), Integer.valueOf(this.Za) });
  }
  
  static {
    // Byte code:
    //   0: bipush #73
    //   2: ldc 'VM^"/@i\\r/%^`Oi.o'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zk2.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 99, 5 -> 103
    //   80: bipush #68
    //   82: goto -> 110
    //   85: bipush #104
    //   87: goto -> 110
    //   90: bipush #126
    //   92: goto -> 110
    //   95: iconst_5
    //   96: goto -> 110
    //   99: iconst_3
    //   100: goto -> 110
    //   103: bipush #123
    //   105: goto -> 110
    //   108: bipush #44
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zk2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */