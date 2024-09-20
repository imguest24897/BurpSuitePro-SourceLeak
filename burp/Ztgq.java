package burp;

public class Ztgq extends RuntimeException {
  private static String[] Zx;
  
  private static final String a;
  
  Ztgq(Zkit paramZkit, Throwable paramThrowable) {
    super(a.formatted(new Object[] { paramZkit.Zy().getAbsolutePath(), ZA(paramThrowable) }, ), paramThrowable);
  }
  
  public boolean ZN() {
    return Zp(getCause());
  }
  
  private static boolean Zp(Throwable paramThrowable) {
    try {
      if (paramThrowable instanceof java.io.IOException)
        return true; 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    paramThrowable = paramThrowable.getCause();
    try {
      if (paramThrowable == null)
        return false; 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    return Zp(paramThrowable);
  }
  
  private static String ZA(Throwable paramThrowable) {
    try {
      if (paramThrowable == null)
        return null; 
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    String str = ZA(paramThrowable.getCause());
    try {
    
    } catch (Ztgq ztgq) {
      throw a(null);
    } 
    return (str == null) ? paramThrowable.getMessage() : str;
  }
  
  public static void ZF(String[] paramArrayOfString) {
    Zx = paramArrayOfString;
  }
  
  public static String[] ZZ() {
    return Zx;
  }
  
  private static Ztgq a(Ztgq paramZtgq) {
    return paramZtgq;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZZ : ()[Ljava/lang/String;
    //   3: ifnonnull -> 13
    //   6: iconst_4
    //   7: anewarray java/lang/String
    //   10: invokestatic ZF : ([Ljava/lang/String;)V
    //   13: bipush #8
    //   15: ldc 'GzR_N:F;\\t_LnYiT_\\r:\\tJ[N:F;V_N(@wt\\t>\\t'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Ztgq.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #70
    //   94: goto -> 124
    //   97: bipush #33
    //   99: goto -> 124
    //   102: bipush #19
    //   104: goto -> 124
    //   107: bipush #114
    //   109: goto -> 124
    //   112: bipush #54
    //   114: goto -> 124
    //   117: bipush #50
    //   119: goto -> 124
    //   122: bipush #102
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
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
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztgq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */