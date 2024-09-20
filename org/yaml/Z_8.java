package org.yaml;

public abstract class Z_8 {
  private final Zt1 Zc;
  
  private final Zt1 Zr;
  
  private static String[] Zl;
  
  private static final String a;
  
  public Z_8(Zt1 paramZt11, Zt1 paramZt12) {
    if (paramZt11 != null)
      try {
        if (paramZt12 != null) {
          this.Zc = paramZt11;
          this.Zr = paramZt12;
          return;
        } 
        throw new Zj3(a);
      } catch (Zj3 zj3) {
        throw b(null);
      }  
    throw new Zj3(a);
  }
  
  public Zt1 ZL() {
    return this.Zc;
  }
  
  public Zt1 Zm() {
    return this.Zr;
  }
  
  public abstract Ztt ZI();
  
  public static void ZX(String[] paramArrayOfString) {
    Zl = paramArrayOfString;
  }
  
  public static String[] ZM() {
    return Zl;
  }
  
  private static Zj3 b(Zj3 paramZj3) {
    return paramZj3;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZM : ()[Ljava/lang/String;
    //   3: ifnull -> 13
    //   6: iconst_1
    //   7: anewarray java/lang/String
    //   10: invokestatic ZX : ([Ljava/lang/String;)V
    //   13: bipush #7
    //   15: ldc 'nF{\\n,_XeiDqK'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic org/yaml/Z_8.a : Ljava/lang/String;
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
    //   92: bipush #61
    //   94: goto -> 124
    //   97: bipush #46
    //   99: goto -> 124
    //   102: bipush #23
    //   104: goto -> 124
    //   107: bipush #104
    //   109: goto -> 124
    //   112: bipush #110
    //   114: goto -> 124
    //   117: bipush #11
    //   119: goto -> 124
    //   122: bipush #98
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Z_8.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */