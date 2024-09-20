package net.portswigger;

public class Zt1 {
  public static int Zn(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, boolean paramBoolean, int paramInt1, int paramInt2) {
    int i = Zen.ZE();
    if (paramArrayOfbyte1 == null || paramArrayOfbyte2 == null)
      return -1; 
    if (!paramBoolean) {
      paramArrayOfbyte2 = (byte[])paramArrayOfbyte2.clone();
      ZK(paramArrayOfbyte2, 0);
    } 
    int j = paramInt1;
    while (j <= paramInt2 - paramArrayOfbyte2.length) {
      byte b = 0;
      while (true) {
        if (b < paramArrayOfbyte2.length) {
          byte b1 = paramArrayOfbyte1[j + b];
          byte b2 = paramBoolean ? b1 : Zs(b1);
          if (b2 == paramArrayOfbyte2[b] || i == 0) {
            b++;
            if (i == 0)
              return j; 
            continue;
          } 
        } else {
          return j;
        } 
        j++;
        break;
      } 
      if (i == 0)
        break; 
    } 
    return -1;
  }
  
  private static byte Zs(byte paramByte) {
    if (paramByte < 91 && paramByte > 64)
      paramByte = (byte)(paramByte + 32); 
    return paramByte;
  }
  
  private static void ZK(byte[] paramArrayOfbyte, int paramInt) {
    int i = Zen.ZE();
    if (paramArrayOfbyte == null)
      return; 
    int j = paramInt;
    while (j < paramArrayOfbyte.length) {
      if (paramArrayOfbyte[j] < 91 && paramArrayOfbyte[j] > 64)
        paramArrayOfbyte[j] = (byte)(paramArrayOfbyte[j] + 32); 
      j++;
      if (i == 0)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zt1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */