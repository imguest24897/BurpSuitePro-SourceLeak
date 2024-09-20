package burp;

class Zlz7 implements Zecb {
  private static final String a;
  
  public Zecb ZJ(String paramString, Zl0z paramZl0z) {
    try {
      if (Zltq.Zj.matcher(paramString).find())
        return new Zths(); 
    } catch (Zs0z zs0z) {
      throw a(null);
    } 
    try {
      if (Zltq.Zn.matcher(paramString).find())
        return new Zmlh(); 
    } catch (Zs0z zs0z) {
      throw a(null);
    } 
    try {
      if (Zltq.ZE.matcher(paramString).find())
        throw new Zs0z(a); 
    } catch (Zs0z zs0z) {
      throw a(null);
    } 
    return this;
  }
  
  private static Zs0z a(Zs0z paramZs0z) {
    return paramZs0z;
  }
  
  static {
    // Byte code:
    //   0: bipush #103
    //   2: ldc 'EQ!=}\\r/1_-qsH?b-s68Rju=p$|X016>xZ,=vV0=e&aV6is\\fx1i(xw31Z+s`\\r$e0usH=t@diyHZz%69cT%i8HyP7=u\\t81[!=r8t1n11M,x6&tW7nzH5~T)|x\\fv6V4xx%}4vun10rfn1-sp$|X[H{~L0{y;1iP6E?xtx#e_-qsVv<V1i6T9dM4hb?}\z=;9rK=mbO'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlz7.a : Ljava/lang/String;
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
    //   80: bipush #118
    //   82: goto -> 112
    //   85: bipush #94
    //   87: goto -> 112
    //   90: bipush #35
    //   92: goto -> 112
    //   95: bipush #122
    //   97: goto -> 112
    //   100: bipush #113
    //   102: goto -> 112
    //   105: bipush #15
    //   107: goto -> 112
    //   110: bipush #49
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlz7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */