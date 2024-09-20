package burp;

class Zlg5 extends Zlge {
  private final Zlge ZF;
  
  private static final String c;
  
  public Zlg5(Zlge paramZlge) {
    this.ZF = paramZlge;
  }
  
  public String Zs(Zzvx paramZzvx) {
    return (new Ztg6(c)).Zn(this.ZF.Zs(paramZzvx)).Zm(paramZzvx).toString();
  }
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: ldc 'C=E'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlg5.c : Ljava/lang/String;
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
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 103
    //   80: bipush #16
    //   82: goto -> 109
    //   85: bipush #117
    //   87: goto -> 109
    //   90: iconst_4
    //   91: goto -> 109
    //   94: bipush #12
    //   96: goto -> 109
    //   99: iconst_3
    //   100: goto -> 109
    //   103: bipush #52
    //   105: goto -> 109
    //   108: iconst_2
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlg5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */