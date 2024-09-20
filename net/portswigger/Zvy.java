package net.portswigger;

import burp.Zbqc;
import java.util.Base64;

public class Zvy extends Zv6 {
  private static int[] Zy;
  
  public static boolean Zr(byte paramByte) {
    int[] arrayOfInt = ZK();
    if (Zbqc.Zwu() == null)
      Za(new int[2]); 
    return ((paramByte >= 65 && paramByte <= 90) || (paramByte >= 97 && paramByte <= 122) || (paramByte >= 48 && paramByte <= 57) || paramByte == 43 || paramByte == 47 || paramByte == 61);
  }
  
  public static boolean Z_(byte[] paramArrayOfbyte) {
    return ZU(paramArrayOfbyte, Zvy::Zr, Zvy::Zt);
  }
  
  public static boolean Zf(byte[] paramArrayOfbyte) {
    return Zk(paramArrayOfbyte, Zvy::Zr);
  }
  
  public static boolean ZC(byte[] paramArrayOfbyte) {
    return Zd(paramArrayOfbyte, Zvy::Zr);
  }
  
  public static byte[] ZZ(byte[] paramArrayOfbyte) {
    return ZS(paramArrayOfbyte, false);
  }
  
  public static byte[] ZS(byte[] paramArrayOfbyte, boolean paramBoolean) {
    return paramBoolean ? Base64.getMimeEncoder().encode(paramArrayOfbyte) : Base64.getEncoder().encode(paramArrayOfbyte);
  }
  
  public static byte[] Zt(byte[] paramArrayOfbyte) {
    return Base64.getDecoder().decode(Zd(paramArrayOfbyte));
  }
  
  public static String Zx(String paramString) {
    return Zkb.ZG(ZZ(Zkb.Zy(paramString)));
  }
  
  private static byte[] Zd(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = new byte[paramArrayOfbyte.length];
    byte b = 0;
    for (byte b1 : paramArrayOfbyte) {
      switch (b1) {
        case 9:
        case 10:
        case 13:
        case 32:
          break;
        default:
          arrayOfByte1[b++] = b1;
          break;
      } 
    } 
    byte[] arrayOfByte2 = new byte[b];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, b);
    return arrayOfByte2;
  }
  
  public static void Za(int[] paramArrayOfint) {
    Zy = paramArrayOfint;
  }
  
  public static int[] ZK() {
    return Zy;
  }
  
  static {
    if (ZK() != null)
      Za(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zvy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */