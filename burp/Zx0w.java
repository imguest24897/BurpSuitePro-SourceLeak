package burp;

public class Zx0w extends Zx0x {
  private static int[] ZH;
  
  private static final String a;
  
  public Zx0w(String paramString) {
    super(paramString);
    setOpaque(false);
    setEditable(false);
    setFocusable(false);
    setCaret(new Zrqt());
    setBorder(Zxt_.Zb);
    setName(a);
  }
  
  public static void ZI(int[] paramArrayOfint) {
    ZH = paramArrayOfint;
  }
  
  public static int[] ZP() {
    return ZH;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZP : ()[I
    //   3: ifnull -> 12
    //   6: iconst_5
    //   7: newarray int
    //   9: invokestatic ZI : ([I)V
    //   12: bipush #57
    //   14: ldc 'QyEXG|bQ'PkUB\wX|\\bY'
    //   16: iconst_m1
    //   17: goto -> 26
    //   20: putstatic burp/Zx0w.a : Ljava/lang/String;
    //   23: goto -> 166
    //   26: dup_x2
    //   27: pop
    //   28: invokevirtual toCharArray : ()[C
    //   31: dup_x1
    //   32: arraylength
    //   33: dup_x2
    //   34: pop
    //   35: iconst_0
    //   36: istore_0
    //   37: dup2_x1
    //   38: pop2
    //   39: dup_x2
    //   40: iconst_1
    //   41: if_icmpgt -> 140
    //   44: dup2
    //   45: swap
    //   46: iload_0
    //   47: dup2_x1
    //   48: caload
    //   49: swap
    //   50: iload_0
    //   51: bipush #7
    //   53: irem
    //   54: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #12
    //   94: goto -> 124
    //   97: bipush #33
    //   99: goto -> 124
    //   102: bipush #15
    //   104: goto -> 124
    //   107: bipush #9
    //   109: goto -> 124
    //   112: bipush #77
    //   114: goto -> 124
    //   117: bipush #83
    //   119: goto -> 124
    //   122: bipush #90
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 47
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 44
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 20
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx0w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */