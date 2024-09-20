package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zb4 {
  private static final String a;
  
  public static String Zd(int paramInt1, int paramInt2) {
    return String.format(a, new Object[] { "i", Integer.valueOf(paramInt1), "y", Integer.valueOf(paramInt2) });
  }
  
  public static Zrp_ ZO(String paramString) {
    try {
      if (!paramString.startsWith("i"))
        return null; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    String[] arrayOfString = paramString.substring(1).split("y", -1);
    try {
      if (arrayOfString.length != 2)
        return null; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      int i = Integer.parseInt(arrayOfString[0], 16);
      int j = Integer.parseInt(arrayOfString[1], 16);
      return new Zrp_(i, j);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #72
    //   2: ldc '_q[[.'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zb4.a : Ljava/lang/String;
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
    //   80: bipush #50
    //   82: goto -> 112
    //   85: bipush #33
    //   87: goto -> 112
    //   90: bipush #28
    //   92: goto -> 112
    //   95: bipush #107
    //   97: goto -> 112
    //   100: bipush #98
    //   102: goto -> 112
    //   105: bipush #96
    //   107: goto -> 112
    //   110: bipush #67
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */