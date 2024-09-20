package burp;

public class Zmcv {
  private static int Za;
  
  private static final String a;
  
  static String Ze(Zzhb paramZzhb) {
    return paramZzhb.getClass().getName() + paramZzhb.getClass().getName() + a;
  }
  
  static boolean Zl(Zzhb paramZzhb, Zlit paramZlit) {
    return paramZlit.Zdz().equals(paramZzhb.Zod());
  }
  
  static boolean Zf(Zzhb paramZzhb, Object paramObject) {
    if (paramObject == null || !(paramObject instanceof Zzhb))
      return false; 
    Zzhb zzhb = (Zzhb)paramObject;
    return paramZzhb.ZlL().equals(zzhb.ZlL());
  }
  
  static int ZA(Zzhb paramZzhb, Zez3 paramZez3) {
    if (paramZez3 == null)
      return -1; 
    int i = paramZzhb.ZlL().compareTo(paramZez3.ZlL());
    if (i == 0 && !Zk8c.ZK(paramZez3))
      i = -1; 
    return i;
  }
  
  public static void Zv(int paramInt) {
    Za = paramInt;
  }
  
  public static int Zb() {
    return Za;
  }
  
  public static int Zm() {
    int i = Zb();
    return (i == 0) ? 64 : 0;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zb : ()I
    //   3: ifeq -> 11
    //   6: bipush #19
    //   8: invokestatic Zv : (I)V
    //   11: bipush #51
    //   13: ldc 'w'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zmcv.a : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #12
    //   94: goto -> 124
    //   97: bipush #100
    //   99: goto -> 124
    //   102: bipush #75
    //   104: goto -> 124
    //   107: bipush #85
    //   109: goto -> 124
    //   112: bipush #73
    //   114: goto -> 124
    //   117: bipush #38
    //   119: goto -> 124
    //   122: bipush #13
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
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
    //   163: goto -> 19
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmcv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */