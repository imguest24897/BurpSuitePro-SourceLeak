package org.openapi4j;

public class Zp4 {
  private static final Zp4 Zr;
  
  private static String ZF;
  
  private static final String b;
  
  public static Zp4 ZF() {
    return Zr;
  }
  
  public Zpu Zr(Zpf paramZpf) throws Zps {
    Zpg<Zpq> zpg = new Zpg<>();
    Zpu zpu = new Zpu();
    try {
      zpg.ZZ(paramZpf, paramZpf, (Zpm)Za0.ZM(), zpu);
      if (zpu.ZH() == Zd.ERROR)
        throw new Zps(b, zpu); 
    } catch (Zps zps) {
      throw a(null);
    } 
    return zpu;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zi : ()Ljava/lang/String;
    //   3: ifnull -> 11
    //   6: ldc 'nCY77'
    //   8: invokestatic Zn : (Ljava/lang/String;)V
    //   11: bipush #67
    //   13: ldc 'oEE_\\fJrAADpVA\^l'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic org/openapi4j/Zp4.b : Ljava/lang/String;
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
    //   92: bipush #99
    //   94: goto -> 124
    //   97: bipush #118
    //   99: goto -> 124
    //   102: bipush #59
    //   104: goto -> 124
    //   107: bipush #104
    //   109: goto -> 124
    //   112: bipush #93
    //   114: goto -> 124
    //   117: bipush #53
    //   119: goto -> 124
    //   122: bipush #38
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
    //   166: new org/openapi4j/Zp4
    //   169: dup
    //   170: invokespecial <init> : ()V
    //   173: putstatic org/openapi4j/Zp4.Zr : Lorg/openapi4j/Zp4;
    //   176: return
  }
  
  public static void Zn(String paramString) {
    ZF = paramString;
  }
  
  public static String Zi() {
    return ZF;
  }
  
  private static Zps a(Zps paramZps) {
    return paramZps;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zp4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */