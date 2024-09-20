package burp;

import java.util.Objects;

public class Zm1f {
  private static int[] ZA;
  
  public static boolean ZV(Zb9v paramZb9v, Object paramObject) {
    int[] arrayOfInt = Za();
    if (paramObject instanceof Zb9v) {
      Zb9v zb9v = (Zb9v)paramObject;
      if (arrayOfInt != null)
        return paramZb9v.ZF(zb9v) ? true : Objects.equals(paramZb9v.Zlb(), zb9v.Zlb()); 
    } 
    return false;
  }
  
  public static int ZY(Zb9v paramZb9v) {
    return Objects.hash(new Object[] { paramZb9v.Zlb() });
  }
  
  public static void ZQ(int[] paramArrayOfint) {
    ZA = paramArrayOfint;
  }
  
  public static int[] Za() {
    return ZA;
  }
  
  static {
    if (Za() == null)
      ZQ(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm1f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */