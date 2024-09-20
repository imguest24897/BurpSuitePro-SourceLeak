package net.portswigger;

import java.nio.charset.StandardCharsets;

public class Zkb {
  private static int ZK;
  
  public static String ZG(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null) ? null : Zo(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public static String Zo(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramArrayOfbyte == null)
      return null; 
    byte[] arrayOfByte = new byte[paramInt2 * 2];
    for (byte b = 0; b < paramInt2; b++)
      arrayOfByte[2 * b + 1] = paramArrayOfbyte[paramInt1 + b]; 
    return new String(arrayOfByte, StandardCharsets.UTF_16);
  }
  
  public static byte[] Zy(String paramString) {
    return (paramString == null) ? null : Zn(paramString, new byte[paramString.length()], 0);
  }
  
  public static byte[] Zn(String paramString, byte[] paramArrayOfbyte, int paramInt) {
    if (paramString == null)
      return null; 
    int i = paramString.length();
    for (byte b = 0; b < i; b++)
      paramArrayOfbyte[paramInt + b] = (byte)paramString.charAt(b); 
    return paramArrayOfbyte;
  }
  
  public static void ZX(int paramInt) {
    ZK = paramInt;
  }
  
  public static int ZK() {
    return ZK;
  }
  
  public static int ZZ() {
    int i = ZK();
    return (i == 0) ? 46 : 0;
  }
  
  static {
    if (ZK() != 0)
      ZX(100); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zkb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */