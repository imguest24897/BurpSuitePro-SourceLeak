package net.portswigger.devtools.client.impl.connection.local;

public class Zd extends Exception {
  private static int[] ZA;
  
  public Zd(String paramString) {
    super(paramString);
  }
  
  public static void ZB(int[] paramArrayOfint) {
    ZA = paramArrayOfint;
  }
  
  public static int[] Zx() {
    return ZA;
  }
  
  static {
    if (Zx() == null)
      ZB(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\local\Zd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */