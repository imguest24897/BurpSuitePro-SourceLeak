package org.bouncycastle.tls;

public class CertChainType {
  public static final short individual_certs = 0;
  
  public static final short pkipath = 1;
  
  public static String getName(short paramShort) {
    switch (paramShort) {
      case 0:
        return "individual_certs";
      case 1:
        return "pkipath";
    } 
    return "UNKNOWN";
  }
  
  public static String getText(short paramShort) {
    return getName(paramShort) + "(" + paramShort + ")";
  }
  
  public static boolean isValid(short paramShort) {
    return (paramShort >= 0 && paramShort <= 1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\CertChainType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */