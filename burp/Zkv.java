package burp;

public class Zkv {
  private static String Zw;
  
  public static byte[] Za(boolean[] paramArrayOfboolean) {
    return Zi(paramArrayOfboolean);
  }
  
  public static byte[] Zm(boolean[] paramArrayOfboolean) {
    return Zi(paramArrayOfboolean);
  }
  
  private static byte[] Zi(boolean[] paramArrayOfboolean) {
    String str = ZZ();
    if (paramArrayOfboolean == null)
      return null; 
    byte[] arrayOfByte = new byte[paramArrayOfboolean.length];
    byte b = 0;
    while (b < paramArrayOfboolean.length) {
      arrayOfByte[b] = paramArrayOfboolean[b] ? 1 : 0;
      b++;
      if (str == null)
        break; 
    } 
    return arrayOfByte;
  }
  
  public static void ZZ(String paramString) {
    Zw = paramString;
  }
  
  public static String ZZ() {
    return Zw;
  }
  
  static {
    if (ZZ() == null)
      ZZ("clTPDc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */