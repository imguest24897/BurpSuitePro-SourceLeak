package net.portswigger.swagger.urlresolver.exceptions;

public class HostDeniedException extends Exception {
  private static int[] ZX;
  
  public HostDeniedException(String paramString) {
    super(paramString);
  }
  
  public HostDeniedException(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public static void Zt(int[] paramArrayOfint) {
    ZX = paramArrayOfint;
  }
  
  public static int[] Zq() {
    return ZX;
  }
  
  static {
    if (Zq() == null)
      Zt(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagge\\urlresolver\exceptions\HostDeniedException.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */