package org.bouncycastle.tls;

public class HashAlgorithm {
  public static final short none = 0;
  
  public static final short md5 = 1;
  
  public static final short sha1 = 2;
  
  public static final short sha224 = 3;
  
  public static final short sha256 = 4;
  
  public static final short sha384 = 5;
  
  public static final short sha512 = 6;
  
  public static final short Intrinsic = 8;
  
  public static String getName(short paramShort) {
    switch (paramShort) {
      case 0:
        return "none";
      case 1:
        return "md5";
      case 2:
        return "sha1";
      case 3:
        return "sha224";
      case 4:
        return "sha256";
      case 5:
        return "sha384";
      case 6:
        return "sha512";
      case 8:
        return "Intrinsic";
    } 
    return "UNKNOWN";
  }
  
  public static int getOutputSize(short paramShort) {
    switch (paramShort) {
      case 1:
        return 16;
      case 2:
        return 20;
      case 3:
        return 28;
      case 4:
        return 32;
      case 5:
        return 48;
      case 6:
        return 64;
    } 
    return -1;
  }
  
  public static String getText(short paramShort) {
    return getName(paramShort) + "(" + paramShort + ")";
  }
  
  public static boolean isPrivate(short paramShort) {
    return (224 <= paramShort && paramShort <= 255);
  }
  
  public static boolean isRecognized(short paramShort) {
    switch (paramShort) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 8:
        return true;
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\HashAlgorithm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */