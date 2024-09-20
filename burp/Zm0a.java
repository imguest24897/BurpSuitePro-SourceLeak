package burp;

import burp.api.montoya.core.Annotations;

class Zm0a {
  private static final String a;
  
  static Annotations ZD(Zk2m paramZk2m) {
    try {
      if (paramZk2m == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zs9n.Zj(paramZk2m);
  }
  
  static Zk2m Zc(Annotations paramAnnotations, Zr_4 paramZr_4) {
    boolean bool = Zsie.Zv();
    try {
      if (paramAnnotations == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (paramAnnotations instanceof Proxyable) {
      Proxyable proxyable = (Proxyable)paramAnnotations;
      try {
        if (bool) {
          Object object = proxyable.proxiedObject();
          if (object instanceof Zs9n) {
            Zs9n zs9n = (Zs9n)object;
            try {
              if (zs9n.ZA())
                return zs9n.Zr; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } 
          return paramZr_4.<Zk2m>ZH(new Zml0(paramAnnotations.notes(), paramAnnotations.highlightColor()));
        } 
        throw new IllegalArgumentException(a);
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    throw new IllegalArgumentException(a);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #52
    //   2: ldc 'w1p~F_J/1tJtZT6ycmGH3yjZj^Y+uhQw\\nW9<FQjEL>hnPjY<}ifO/yuLmYL:x'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zm0a.a : Ljava/lang/String;
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
    //   80: bipush #12
    //   82: goto -> 112
    //   85: bipush #107
    //   87: goto -> 112
    //   90: bipush #40
    //   92: goto -> 112
    //   95: bipush #51
    //   97: goto -> 112
    //   100: bipush #11
    //   102: goto -> 112
    //   105: bipush #48
    //   107: goto -> 112
    //   110: bipush #30
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm0a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */