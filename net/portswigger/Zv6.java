package net.portswigger;

import java.util.function.Function;

abstract class Zv6 {
  protected static boolean ZU(byte[] paramArrayOfbyte, Function<Byte, Boolean> paramFunction, Function<byte[], byte[]> paramFunction1) {
    return (Zk(paramArrayOfbyte, paramFunction) && Zli.Z_(paramFunction1.apply(paramArrayOfbyte)));
  }
  
  protected static boolean Zk(byte[] paramArrayOfbyte, Function<Byte, Boolean> paramFunction) {
    return (paramArrayOfbyte.length < 4) ? false : Zd(paramArrayOfbyte, paramFunction);
  }
  
  protected static boolean Zd(byte[] paramArrayOfbyte, Function<Byte, Boolean> paramFunction) {
    int[] arrayOfInt = Zvy.ZK();
    if (paramArrayOfbyte.length == 0 || paramArrayOfbyte.length % 4 == 1)
      return false; 
    if (paramArrayOfbyte[paramArrayOfbyte.length - 1] == 61) {
      if (paramArrayOfbyte.length % 4 != 0)
        return false; 
    } else if (paramArrayOfbyte[paramArrayOfbyte.length - 2] == 61) {
      return false;
    } 
    int i = paramArrayOfbyte.length - 2;
    byte b = 0;
    while (b < paramArrayOfbyte.length) {
      byte b1 = paramArrayOfbyte[b];
      if (b1 == 61 && b < i)
        return false; 
      if (!((Boolean)paramFunction.apply(Byte.valueOf(b1))).booleanValue())
        return false; 
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zv6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */