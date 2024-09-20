package org.bouncycastle.tls;

public class MACAlgorithm {
  public static final int _null = 0;
  
  public static final int md5 = 1;
  
  public static final int sha = 2;
  
  public static final int hmac_md5 = 1;
  
  public static final int hmac_sha1 = 2;
  
  public static final int hmac_sha256 = 3;
  
  public static final int hmac_sha384 = 4;
  
  public static final int hmac_sha512 = 5;
  
  public static String getName(int paramInt) {
    switch (paramInt) {
      case 0:
        return "null";
      case 1:
        return "hmac_md5";
      case 2:
        return "hmac_sha1";
      case 3:
        return "hmac_sha256";
      case 4:
        return "hmac_sha384";
      case 5:
        return "hmac_sha512";
    } 
    return "UNKNOWN";
  }
  
  public static String getText(int paramInt) {
    return getName(paramInt) + "(" + paramInt + ")";
  }
  
  public static boolean isHMAC(int paramInt) {
    switch (paramInt) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        return true;
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\MACAlgorithm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */