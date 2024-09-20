package org.bouncycastle.tls;

public class CachedInformationType {
  public static final short cert = 1;
  
  public static final short cert_req = 2;
  
  public static String getName(short paramShort) {
    switch (paramShort) {
      case 1:
        return "cert";
      case 2:
        return "cert_req";
    } 
    return "UNKNOWN";
  }
  
  public static String getText(short paramShort) {
    return getName(paramShort) + "(" + paramShort + ")";
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\CachedInformationType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */