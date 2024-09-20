package burp;

public class Zs2z implements Zt3w {
  private static String[] ZQ;
  
  public boolean Zz(char paramChar) {
    int i = Character.getType(paramChar);
    return (paramChar == '\t' || paramChar == '\013' || paramChar == '\f' || paramChar == ' ' || paramChar == ' ' || paramChar == '﻿' || i == 12);
  }
  
  public static void ZJ(String[] paramArrayOfString) {
    ZQ = paramArrayOfString;
  }
  
  public static String[] Zx() {
    return ZQ;
  }
  
  static {
    if (Zx() != null)
      ZJ(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs2z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */