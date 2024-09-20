package burp;

class Zs1g implements Runnable {
  final Zl42 Zk;
  
  private static final String a;
  
  Zs1g(Zl42 paramZl42) {}
  
  public void run() {
    this.Zk.Zy.removeAll();
    this.Zk.Zy.add(this.Zk.Zl.Zg(), a);
    Zmse.ZF(this.Zk.Zy);
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: ldc '\\nN863'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zs1g.a : Ljava/lang/String;
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
    //   80: bipush #67
    //   82: goto -> 112
    //   85: bipush #33
    //   87: goto -> 112
    //   90: bipush #92
    //   92: goto -> 112
    //   95: bipush #72
    //   97: goto -> 112
    //   100: bipush #92
    //   102: goto -> 112
    //   105: bipush #123
    //   107: goto -> 112
    //   110: bipush #54
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs1g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */