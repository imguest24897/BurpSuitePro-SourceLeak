package org.bouncycastle.tls;

public class NameType {
  public static final short host_name = 0;
  
  public static String getName(short paramShort) {
    switch (paramShort) {
      case 0:
        return "host_name";
    } 
    return "UNKNOWN";
  }
  
  public static String getText(short paramShort) {
    return getName(paramShort) + "(" + paramShort + ")";
  }
  
  public static boolean isRecognized(short paramShort) {
    return (0 == paramShort);
  }
  
  public static boolean isValid(short paramShort) {
    return TlsUtils.isValidUint8(paramShort);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\NameType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */