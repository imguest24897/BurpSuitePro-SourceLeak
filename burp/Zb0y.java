package burp;

public class Zb0y {
  private static final char[] Zk = new char[] { 
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
      'a', 'b', 'c', 'd', 'e', 'f' };
  
  public static String Zt(byte[] paramArrayOfbyte) {
    int[] arrayOfInt = Zsw8.ZK();
    if (paramArrayOfbyte == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder(paramArrayOfbyte.length * 2);
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = arrayOfByte.length;
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      int j = b1 & 0xFF;
      stringBuilder.append(Zk[j >>> 4]);
      stringBuilder.append(Zk[j & 0xF]);
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb0y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */