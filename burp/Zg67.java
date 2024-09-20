package burp;

class Zg67 {
  private static final String a;
  
  static String Zc(Ze4r paramZe4r, int paramInt) {
    char[] arrayOfChar = new char[paramInt];
    boolean bool = Ze8h.ZV();
    byte b = 0;
    while (b < paramInt) {
      arrayOfChar[b] = paramZe4r.ZY(b);
      b++;
      if (bool) {
        Zbqc.Zr(new Zbqc[4]);
        break;
      } 
    } 
    return new String(arrayOfChar);
  }
  
  static void Zx(Ze4r paramZe4r, String paramString) {
    boolean bool = Ze8h.ZV();
    try {
      if (paramString.length() > paramZe4r.Zpu())
        throw new IllegalArgumentException(a); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte b = 0;
    while (b < paramString.length()) {
      paramZe4r.ZB(b, paramString.charAt(b));
      b++;
      if (bool)
        break; 
    } 
    try {
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        Ze8h.Z_(!bool);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #97
    //   2: ldc 'B]ONi"q'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zg67.a : Ljava/lang/String;
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
    //   80: bipush #119
    //   82: goto -> 112
    //   85: bipush #13
    //   87: goto -> 112
    //   90: bipush #83
    //   92: goto -> 112
    //   95: bipush #14
    //   97: goto -> 112
    //   100: bipush #67
    //   102: goto -> 112
    //   105: bipush #103
    //   107: goto -> 112
    //   110: bipush #45
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg67.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */