package burp;

public class Zxn6 extends RuntimeException {
  private static final String a;
  
  public Zxn6() {
    super(a);
  }
  
  static {
    // Byte code:
    //   0: bipush #68
    //   2: ldc '([*~})&fY'im%9*_"'j50fN)'c!-/W3j.4<+_fbv#0#^#c'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxn6.a : Ljava/lang/String;
    //   11: goto -> 151
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
    //   29: if_icmpgt -> 125
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 98, 5 -> 103
    //   80: bipush #17
    //   82: goto -> 109
    //   85: iconst_2
    //   86: goto -> 109
    //   89: bipush #126
    //   91: goto -> 109
    //   94: iconst_2
    //   95: goto -> 109
    //   98: bipush #67
    //   100: goto -> 109
    //   103: bipush #74
    //   105: goto -> 109
    //   108: iconst_4
    //   109: ixor
    //   110: ixor
    //   111: i2c
    //   112: castore
    //   113: iinc #0, 1
    //   116: dup
    //   117: ifne -> 125
    //   120: dup2
    //   121: dup_x1
    //   122: goto -> 35
    //   125: dup2_x1
    //   126: pop2
    //   127: dup_x2
    //   128: iload_0
    //   129: if_icmpgt -> 32
    //   132: pop
    //   133: new java/lang/String
    //   136: dup_x1
    //   137: swap
    //   138: invokespecial <init> : ([C)V
    //   141: invokevirtual intern : ()Ljava/lang/String;
    //   144: swap
    //   145: pop
    //   146: swap
    //   147: pop
    //   148: goto -> 8
    //   151: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxn6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */