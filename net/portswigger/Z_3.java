package net.portswigger;

public class Z_3 {
  public final String ZZ;
  
  public final String Zu;
  
  private static final String a;
  
  private Z_3(String paramString) {
    if (paramString == null)
      throw new Zk8(String.format(a, new Object[] { paramString })); 
    this.ZZ = paramString;
    this.Zu = paramString.toLowerCase();
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (Zk8 zk8) {
      throw a(null);
    } 
    try {
      if (paramObject != null)
        try {
          if (getClass() == paramObject.getClass()) {
            Z_3 z_3 = (Z_3)paramObject;
            return this.Zu.equals(z_3.Zu);
          } 
          return false;
        } catch (Zk8 zk8) {
          throw a(null);
        }  
    } catch (Zk8 zk8) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean Zr(String paramString) {
    try {
      if (paramString != null)
        try {
          if (this.Zu.equals(paramString.toLowerCase()));
        } catch (Zk8 zk8) {
          throw a(null);
        }  
    } catch (Zk8 zk8) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.Zu.hashCode();
  }
  
  private static Zk8 a(Zk8 paramZk8) {
    return paramZk8;
  }
  
  static {
    // Byte code:
    //   0: bipush #87
    //   2: ldc '#J$@--JL7@!;J!'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Z_3.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #61
    //   82: goto -> 111
    //   85: bipush #115
    //   87: goto -> 111
    //   90: iconst_5
    //   91: goto -> 111
    //   94: bipush #118
    //   96: goto -> 111
    //   99: bipush #36
    //   101: goto -> 111
    //   104: bipush #19
    //   106: goto -> 111
    //   109: bipush #30
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Z_3.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */