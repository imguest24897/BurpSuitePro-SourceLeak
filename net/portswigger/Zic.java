package net.portswigger;

public class Zic extends Exception {
  private static int[] ZY;
  
  public Zic(String paramString) {
    super(paramString);
  }
  
  public Zic(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public static void Zh(int[] paramArrayOfint) {
    ZY = paramArrayOfint;
  }
  
  public static int[] Ze() {
    return ZY;
  }
  
  static {
    if (Ze() == null)
      Zh(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zic.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */