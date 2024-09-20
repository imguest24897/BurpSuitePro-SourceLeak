package org.bouncycastle.tls;

public class CertificateCompressionAlgorithm {
  public static final int zlib = 1;
  
  public static final int brotli = 2;
  
  public static final int zstd = 3;
  
  public static String getName(int paramInt) {
    switch (paramInt) {
      case 1:
        return "zlib";
      case 2:
        return "brotli";
      case 3:
        return "zstd";
    } 
    return "UNKNOWN";
  }
  
  public static String getText(int paramInt) {
    return getName(paramInt) + "(" + paramInt + ")";
  }
  
  public static boolean isRecognized(int paramInt) {
    switch (paramInt) {
      case 1:
      case 2:
      case 3:
        return true;
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\CertificateCompressionAlgorithm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */