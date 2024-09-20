package net.portswigger;

import java.nio.charset.StandardCharsets;

public class Zny {
  private static String Zn;
  
  public static byte[] ZI(String paramString) {
    return paramString.getBytes(StandardCharsets.ISO_8859_1);
  }
  
  public static String ZT(byte[] paramArrayOfbyte) {
    return new String(paramArrayOfbyte, StandardCharsets.ISO_8859_1);
  }
  
  public static byte[] Zv(String paramString) {
    return paramString.getBytes(StandardCharsets.UTF_8);
  }
  
  public static String ZL(byte[] paramArrayOfbyte) {
    return new String(paramArrayOfbyte, StandardCharsets.UTF_8);
  }
  
  public static void ZT(String paramString) {
    Zn = paramString;
  }
  
  public static String ZI() {
    return Zn;
  }
  
  static {
    if (ZI() == null)
      ZT("hvCym"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zny.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */