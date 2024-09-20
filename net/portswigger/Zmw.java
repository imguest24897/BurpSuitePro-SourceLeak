package net.portswigger;

import burp.Zbqc;
import java.io.ByteArrayOutputStream;

public class Zmw {
  public static void Zq(byte[] paramArrayOfbyte) {
    ZY(paramArrayOfbyte, 0);
  }
  
  private static void ZY(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte == null)
      return; 
    for (int i = paramInt; i < paramArrayOfbyte.length; i++) {
      if (paramArrayOfbyte[i] < 91 && paramArrayOfbyte[i] > 64)
        paramArrayOfbyte[i] = (byte)(paramArrayOfbyte[i] + 32); 
    } 
  }
  
  public static void ZO(byte[] paramArrayOfbyte) {
    int[] arrayOfInt = Zli.ZX();
    if (paramArrayOfbyte == null)
      return; 
    byte b = 0;
    while (b < paramArrayOfbyte.length) {
      if (paramArrayOfbyte[b] > 96 && paramArrayOfbyte[b] < 123)
        paramArrayOfbyte[b] = (byte)(paramArrayOfbyte[b] - 32); 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  public static void ZX(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null || paramArrayOfbyte.length == 0)
      return; 
    if (paramArrayOfbyte[0] > 96 && paramArrayOfbyte[0] < 123)
      paramArrayOfbyte[0] = (byte)(paramArrayOfbyte[0] - 32); 
    ZY(paramArrayOfbyte, 1);
  }
  
  public static void Zp(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null || paramArrayOfbyte.length == 0)
      return; 
    if (paramArrayOfbyte[0] > 96 && paramArrayOfbyte[0] < 123)
      paramArrayOfbyte[0] = (byte)(paramArrayOfbyte[0] - 32); 
  }
  
  public static byte ZB(byte paramByte) {
    return (paramByte < 91 && paramByte > 64) ? (byte)(paramByte + 32) : paramByte;
  }
  
  public static byte[] Zi(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return ZA(paramArrayOfbyte, 0, paramInt1, paramInt2);
  }
  
  public static byte[] ZA(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    if (paramArrayOfbyte == null)
      return null; 
    if (paramArrayOfbyte.length - paramInt1 <= paramInt2)
      return (paramInt1 == 0) ? paramArrayOfbyte : Zz(paramArrayOfbyte, paramInt1, paramArrayOfbyte.length); 
    byte[] arrayOfByte = new byte[paramInt3 + 4];
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, 0, paramInt3);
    arrayOfByte[paramInt3] = 32;
    arrayOfByte[paramInt3 + 1] = 46;
    arrayOfByte[paramInt3 + 2] = 46;
    arrayOfByte[paramInt3 + 3] = 46;
    return arrayOfByte;
  }
  
  public static byte[] Zq(byte[]... paramVarArgs) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    int[] arrayOfInt = Zli.ZX();
    byte[][] arrayOfByte = paramVarArgs;
    int i = arrayOfByte.length;
    byte b = 0;
    while (b < i) {
      byte[] arrayOfByte1 = arrayOfByte[b];
      byteArrayOutputStream.write(arrayOfByte1, 0, arrayOfByte1.length);
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zli.Zq(new int[1]); 
    return byteArrayOutputStream.toByteArray();
  }
  
  public static byte[] Zz(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramInt2 - paramInt1;
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  public static byte[] Zm(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramArrayOfbyte.length);
    return arrayOfByte;
  }
  
  public static byte[] Zb(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2) {
    int i = paramArrayOfbyte2.length - paramInt2 - paramInt1;
    byte[] arrayOfByte = new byte[paramArrayOfbyte1.length + i];
    System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramInt1);
    System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, paramInt1, paramArrayOfbyte2.length);
    System.arraycopy(paramArrayOfbyte1, paramInt2, arrayOfByte, paramInt1 + paramArrayOfbyte2.length, paramArrayOfbyte1.length - paramInt2);
    int[] arrayOfInt = Zli.ZX();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[2]); 
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zmw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */