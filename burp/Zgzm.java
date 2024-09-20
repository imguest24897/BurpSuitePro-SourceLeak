package burp;

public class Zgzm {
  public static boolean Zc(long paramLong1, long paramLong2) {
    return ((paramLong1 & paramLong2) == paramLong2);
  }
  
  public static byte Zd(byte paramByte, byte... paramVarArgs) {
    return (byte)(paramByte | ZZ(paramVarArgs));
  }
  
  public static byte ZS(byte paramByte, byte... paramVarArgs) {
    return (byte)(paramByte & (ZZ(paramVarArgs) ^ 0xFFFFFFFF));
  }
  
  public static byte ZZ(byte... paramVarArgs) {
    byte b = 0;
    byte[] arrayOfByte = paramVarArgs;
    int i = arrayOfByte.length;
    byte b1 = 0;
    int[] arrayOfInt = Zsw8.ZK();
    while (b1 < i) {
      byte b2 = arrayOfByte[b1];
      b = (byte)(b | b2);
      b1++;
      if (arrayOfInt == null)
        break; 
    } 
    return b;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgzm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */