package burp;

import java.util.Set;

public final class Zgxs {
  private static final Set<String> ZP;
  
  private static final String a;
  
  public static boolean Zc(String paramString) {
    String str = Zbnt.ZW();
    if (ZP.contains(paramString))
      return true; 
    if (paramString == null || paramString.isEmpty() || paramString.startsWith(".") || paramString.contains(a))
      return false; 
    boolean bool = false;
    byte b = 0;
    while (b < paramString.length()) {
      char c = paramString.charAt(b);
      if ((c <= '@' || c >= '[') && (c <= '`' || c >= '{') && (c <= '/' || c >= ':') && c != '-' && c != '.' && c != '_')
        bool = true; 
      b++;
      if (str != null)
        break; 
    } 
    if (bool && !Zmab.ZE(paramString))
      return false; 
    ZP.add(paramString);
    return true;
  }
  
  public static boolean Zv(String paramString) {
    String str = Zbnt.ZW();
    byte b = 0;
    while (b < paramString.length()) {
      char c = paramString.charAt(b);
      if ((c <= '@' || c >= '[') && (c <= '`' || c >= '{') && (c <= '/' || c >= ':') && c != '-' && c != '.' && c != '?' && c != '*' && c != '_')
        return false; 
      b++;
      if (str != null)
        break; 
    } 
    return true;
  }
  
  public static boolean ZO(int paramInt) {
    return (paramInt > 0 && paramInt < 65536);
  }
  
  public static boolean Zw(int paramInt) {
    return (paramInt < 1024);
  }
  
  static {
    // Byte code:
    //   0: bipush #75
    //   2: ldc '4'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgxs.a : Ljava/lang/String;
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
    //   80: bipush #98
    //   82: goto -> 112
    //   85: bipush #81
    //   87: goto -> 112
    //   90: bipush #45
    //   92: goto -> 112
    //   95: bipush #99
    //   97: goto -> 112
    //   100: bipush #96
    //   102: goto -> 112
    //   105: bipush #112
    //   107: goto -> 112
    //   110: bipush #15
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
    //   154: new java/util/HashSet
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic burp/Zgxs.ZP : Ljava/util/Set;
    //   164: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgxs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */