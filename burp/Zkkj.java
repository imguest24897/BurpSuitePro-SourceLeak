package burp;

public final class Zkkj {
  public static byte[] ZV(byte[] paramArrayOfbyte, Zbnt paramZbnt) {
    int i = Zsbj.Zc(paramArrayOfbyte);
    if (ZQ(paramArrayOfbyte, i))
      return paramArrayOfbyte; 
    if (Zv(i))
      return Zf(paramArrayOfbyte); 
    Zz1p zz1p = Zekx.Zu(null, paramArrayOfbyte, (byte)3, paramZbnt);
    return Zz(zz1p) ? ZP(paramArrayOfbyte, i) : paramArrayOfbyte;
  }
  
  private static boolean ZQ(byte[] paramArrayOfbyte, int paramInt) {
    return (paramArrayOfbyte.length == paramInt);
  }
  
  private static boolean Zv(int paramInt) {
    return (-1 == paramInt);
  }
  
  private static boolean Zz(Zz1p paramZz1p) {
    return (Zsba.URL_ENCODED == paramZz1p.ZY);
  }
  
  private static byte[] Zf(byte[] paramArrayOfbyte) {
    String[] arrayOfString = Zz2j.ZJ();
    byte b = 0;
    if (ZT(paramArrayOfbyte, paramArrayOfbyte.length - 4))
      b = 1; 
    if (ZT(paramArrayOfbyte, paramArrayOfbyte.length - 2))
      b = 2; 
    if (b > 0) {
      byte[] arrayOfByte = new byte[paramArrayOfbyte.length + b * 2];
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramArrayOfbyte.length);
      byte b1 = 0;
      while (b1 < b) {
        arrayOfByte[arrayOfByte.length - 2 * b1 - 2] = 13;
        arrayOfByte[arrayOfByte.length - 2 * b1 - 1] = 10;
        b1++;
        if (arrayOfString == null)
          break; 
      } 
      return arrayOfByte;
    } 
    return paramArrayOfbyte;
  }
  
  private static byte[] ZP(byte[] paramArrayOfbyte, int paramInt) {
    String[] arrayOfString = Zz2j.ZJ();
    int i = paramArrayOfbyte.length;
    while (i > paramInt && !ZT(paramArrayOfbyte, i - 2)) {
      i -= 2;
      if (arrayOfString == null)
        break; 
    } 
    if (paramArrayOfbyte.length != i) {
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, i);
      return arrayOfByte;
    } 
    return paramArrayOfbyte;
  }
  
  private static boolean ZT(byte[] paramArrayOfbyte, int paramInt) {
    return (paramArrayOfbyte[paramInt] != 13 || paramArrayOfbyte[paramInt + 1] != 10);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkkj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */