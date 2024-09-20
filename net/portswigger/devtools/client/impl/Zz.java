package net.portswigger.devtools.client.impl;

public class Zz {
  private static String[] Zg;
  
  public static void Zm(String[] paramArrayOfString) {
    Zg = paramArrayOfString;
  }
  
  public static String[] ZD() {
    return Zg;
  }
  
  static {
    if (ZD() == null)
      Zm(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */