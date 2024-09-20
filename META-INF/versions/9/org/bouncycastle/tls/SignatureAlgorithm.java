package META-INF.versions.9.org.bouncycastle.tls;

public class SignatureAlgorithm {
  public static final short anonymous = 0;
  
  public static final short rsa = 1;
  
  public static final short dsa = 2;
  
  public static final short ecdsa = 3;
  
  public static final short ed25519 = 7;
  
  public static final short ed448 = 8;
  
  public static final short rsa_pss_rsae_sha256 = 4;
  
  public static final short rsa_pss_rsae_sha384 = 5;
  
  public static final short rsa_pss_rsae_sha512 = 6;
  
  public static final short rsa_pss_pss_sha256 = 9;
  
  public static final short rsa_pss_pss_sha384 = 10;
  
  public static final short rsa_pss_pss_sha512 = 11;
  
  public static final short ecdsa_brainpoolP256r1tls13_sha256 = 26;
  
  public static final short ecdsa_brainpoolP384r1tls13_sha384 = 27;
  
  public static final short ecdsa_brainpoolP512r1tls13_sha512 = 28;
  
  public static final short gostr34102012_256 = 64;
  
  public static final short gostr34102012_512 = 65;
  
  public static short getClientCertificateType(short paramShort) {
    switch (paramShort) {
      case 1:
      case 4:
      case 5:
      case 6:
      case 9:
      case 10:
      case 11:
        return 1;
      case 2:
        return 2;
      case 3:
      case 7:
      case 8:
        return 64;
      case 64:
        return 67;
      case 65:
        return 68;
    } 
    return -1;
  }
  
  public static String getName(short paramShort) {
    switch (paramShort) {
      case 0:
        return "anonymous";
      case 1:
        return "rsa";
      case 2:
        return "dsa";
      case 3:
        return "ecdsa";
      case 4:
        return "rsa_pss_rsae_sha256";
      case 5:
        return "rsa_pss_rsae_sha384";
      case 6:
        return "rsa_pss_rsae_sha512";
      case 7:
        return "ed25519";
      case 8:
        return "ed448";
      case 9:
        return "rsa_pss_pss_sha256";
      case 10:
        return "rsa_pss_pss_sha384";
      case 11:
        return "rsa_pss_pss_sha512";
      case 26:
        return "ecdsa_brainpoolP256r1tls13_sha256";
      case 27:
        return "ecdsa_brainpoolP384r1tls13_sha384";
      case 28:
        return "ecdsa_brainpoolP512r1tls13_sha512";
      case 64:
        return "gostr34102012_256";
      case 65:
        return "gostr34102012_512";
    } 
    return "UNKNOWN";
  }
  
  public static String getText(short paramShort) {
    return getName(paramShort) + "(" + getName(paramShort) + ")";
  }
  
  public static boolean isRecognized(short paramShort) {
    switch (paramShort) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 26:
      case 27:
      case 28:
      case 64:
      case 65:
        return true;
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\SignatureAlgorithm.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */