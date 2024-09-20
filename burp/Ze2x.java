package burp;

public class Ze2x {
  private final int Zs;
  
  private final String ZS;
  
  Ze2x(int paramInt, String paramString) {
    this.Zs = paramInt;
    this.ZS = paramString;
  }
  
  public static boolean Ze(String paramString) {
    boolean bool = Zbjt.Zg();
    if (paramString == null)
      return true; 
    if (paramString.length() > 63)
      return false; 
    char[] arrayOfChar = paramString.toCharArray();
    int i = arrayOfChar.length;
    byte b = 0;
    while (b < i) {
      char c = arrayOfChar[b];
      if (!Character.isDigit(c) && !Character.isLetter(c) && '-' != c && '_' != c)
        return false; 
      b++;
      if (!bool)
        break; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze2x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */