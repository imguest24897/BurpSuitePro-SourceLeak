package net.portswigger.swagger;

public class StringUtils {
  private static String Zn;
  
  private static final String b;
  
  public static boolean isEmpty(String paramString) {
    return (paramString == null || paramString.isEmpty());
  }
  
  public static boolean isBlank(String paramString) {
    return (paramString == null || paramString.isBlank());
  }
  
  public static int countMatches(String paramString1, String paramString2) {
    String str = ZU();
    if (isEmpty(paramString1) || isEmpty(paramString2))
      return 0; 
    byte b = 0;
    int i = 0;
    while (i < paramString1.length()) {
      if (paramString1.startsWith(paramString2, i)) {
        b++;
        i += paramString2.length() - 1;
      } 
      i++;
      if (str == null)
        break; 
    } 
    return b;
  }
  
  public static boolean startsWith(String paramString1, String paramString2) {
    return (paramString1 != null && paramString1.startsWith(paramString2));
  }
  
  public static String separatorsToUnix(String paramString) {
    return paramString.replaceAll(b, "/");
  }
  
  public static String trim(String paramString) {
    return (paramString == null) ? null : paramString.trim();
  }
  
  public static String trimToNull(String paramString) {
    String str = trim(paramString);
    return str.isEmpty() ? null : str;
  }
  
  public static void Zu(String paramString) {
    Zn = paramString;
  }
  
  public static String ZU() {
    return Zn;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZU : ()Ljava/lang/String;
    //   3: ifnonnull -> 11
    //   6: ldc 'yFO7E'
    //   8: invokestatic Zu : (Ljava/lang/String;)V
    //   11: bipush #36
    //   13: ldc 'b['
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic net/portswigger/swagger/StringUtils.b : Ljava/lang/String;
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
    //   92: bipush #26
    //   94: goto -> 124
    //   97: bipush #35
    //   99: goto -> 124
    //   102: bipush #120
    //   104: goto -> 124
    //   107: bipush #40
    //   109: goto -> 124
    //   112: bipush #76
    //   114: goto -> 124
    //   117: bipush #28
    //   119: goto -> 124
    //   122: bipush #99
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\StringUtils.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */