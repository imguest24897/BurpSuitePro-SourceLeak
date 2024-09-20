package burp;

public class Zk8u {
  public final boolean ZM;
  
  public final boolean ZC;
  
  private static final String a;
  
  private Zk8u(boolean paramBoolean1, boolean paramBoolean2) {
    this.ZM = paramBoolean1;
    this.ZC = paramBoolean2;
  }
  
  public static Zk8u Zh(Zmhe paramZmhe) {
    boolean bool1 = a.equalsIgnoreCase(paramZmhe.Zy().Zr());
    boolean bool2 = Zo(bool1, paramZmhe.Zy().Zv());
    boolean bool = (bool1 && !bool2) ? true : false;
    return new Zk8u(bool2, bool);
  }
  
  private static boolean Zo(boolean paramBoolean, Zsba paramZsba) {
    if (paramBoolean) {
      switch (Zsnc.ZK[paramZsba.ordinal()]) {
        case 1:
        case 2:
        
      } 
      return true;
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #37
    //   2: ldc 'CIQ'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zk8u.a : Ljava/lang/String;
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
    //   80: bipush #54
    //   82: goto -> 112
    //   85: bipush #35
    //   87: goto -> 112
    //   90: bipush #39
    //   92: goto -> 112
    //   95: bipush #126
    //   97: goto -> 112
    //   100: bipush #45
    //   102: goto -> 112
    //   105: bipush #42
    //   107: goto -> 112
    //   110: bipush #74
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk8u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */