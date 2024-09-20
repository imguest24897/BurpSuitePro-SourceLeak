package burp;

public class Zg1s {
  private static String[] Zo;
  
  public static String Z_(String paramString1, String paramString2) {
    String[] arrayOfString1 = Zr();
    if ("/".equals(paramString1) || "/".equals(paramString2))
      return "/"; 
    String[] arrayOfString2 = paramString1.split("/");
    String[] arrayOfString3 = paramString2.split("/");
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 1;
    while (b < arrayOfString2.length && b < arrayOfString3.length) {
      if (arrayOfString2[b].equals(arrayOfString3[b])) {
        stringBuilder.append("/").append(arrayOfString2[b]);
        if (arrayOfString1 == null) {
          b++;
          if (arrayOfString1 != null)
            break; 
          continue;
        } 
      } 
      return (stringBuilder.length() == 0) ? "/" : stringBuilder.toString();
    } 
    return stringBuilder.toString();
  }
  
  public static boolean Zi(String paramString1, String paramString2) {
    return !Z_(paramString1, paramString2).equals(paramString1);
  }
  
  public static void Zt(String[] paramArrayOfString) {
    Zo = paramArrayOfString;
  }
  
  public static String[] Zr() {
    return Zo;
  }
  
  static {
    if (Zr() != null)
      Zt(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg1s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */