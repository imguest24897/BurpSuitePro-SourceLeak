package burp;

public class Zgql extends Zg2b<Zt6y> {
  static Zmk7<Zt6y> ZM;
  
  protected Zgql() {
    super(new Zgjg<>((Zmk7<Zt6y>[])new Zmk7[] { ZM }));
  }
  
  private static Object lambda$static$0(Zt6y paramZt6y) {
    return paramZt6y;
  }
  
  static {
    // Byte code:
    //   0: bipush #72
    //   2: ldc '~v\'
    //   4: iconst_m1
    //   5: goto -> 12
    //   8: astore_0
    //   9: goto -> 154
    //   12: dup_x2
    //   13: pop
    //   14: invokevirtual toCharArray : ()[C
    //   17: dup_x1
    //   18: arraylength
    //   19: dup_x2
    //   20: pop
    //   21: iconst_0
    //   22: istore_1
    //   23: dup2_x1
    //   24: pop2
    //   25: dup_x2
    //   26: iconst_1
    //   27: if_icmpgt -> 128
    //   30: dup2
    //   31: swap
    //   32: iload_1
    //   33: dup2_x1
    //   34: caload
    //   35: swap
    //   36: iload_1
    //   37: bipush #7
    //   39: irem
    //   40: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #120
    //   82: goto -> 112
    //   85: bipush #45
    //   87: goto -> 112
    //   90: bipush #83
    //   92: goto -> 112
    //   95: bipush #113
    //   97: goto -> 112
    //   100: bipush #117
    //   102: goto -> 112
    //   105: bipush #117
    //   107: goto -> 112
    //   110: bipush #101
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #1, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 33
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_1
    //   132: if_icmpgt -> 30
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
    //   154: <illegal opcode> Zl : ()Lburp/Zkuq;
    //   159: invokestatic Zh : (Lburp/Zkuq;)Lburp/Zz_2;
    //   162: aload_0
    //   163: invokevirtual ZL : (Ljava/lang/String;)Lburp/Zz_2;
    //   166: new burp/Zmqd
    //   169: dup
    //   170: invokespecial <init> : ()V
    //   173: invokevirtual ZM : (Ljavax/swing/table/TableCellRenderer;)Lburp/Zz_2;
    //   176: invokevirtual ZH : ()Lburp/Zmk7;
    //   179: putstatic burp/Zgql.ZM : Lburp/Zmk7;
    //   182: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgql.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */