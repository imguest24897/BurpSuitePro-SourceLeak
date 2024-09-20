package META-INF.versions.9.org.bouncycastle.tls;

public class ClientCertificateType {
  public static final short rsa_sign = 1;
  
  public static final short dss_sign = 2;
  
  public static final short rsa_fixed_dh = 3;
  
  public static final short dss_fixed_dh = 4;
  
  public static final short rsa_ephemeral_dh_RESERVED = 5;
  
  public static final short dss_ephemeral_dh_RESERVED = 6;
  
  public static final short fortezza_dms_RESERVED = 20;
  
  public static final short ecdsa_sign = 64;
  
  public static final short rsa_fixed_ecdh = 65;
  
  public static final short ecdsa_fixed_ecdh = 66;
  
  public static final short gost_sign256 = 67;
  
  public static final short gost_sign512 = 68;
  
  public static String getName(short paramShort) {
    switch (paramShort) {
      case 1:
        return "rsa_sign";
      case 2:
        return "dss_sign";
      case 3:
        return "rsa_fixed_dh";
      case 4:
        return "dss_fixed_dh";
      case 5:
        return "rsa_ephemeral_dh_RESERVED";
      case 6:
        return "dss_ephemeral_dh_RESERVED";
      case 20:
        return "fortezza_dms_RESERVED";
      case 64:
        return "ecdsa_sign";
      case 65:
        return "rsa_fixed_ecdh";
      case 66:
        return "ecdsa_fixed_ecdh";
      case 67:
        return "gost_sign256";
      case 68:
        return "gost_sign512";
    } 
    return "UNKNOWN";
  }
  
  public static String getText(short paramShort) {
    return getName(paramShort) + "(" + getName(paramShort) + ")";
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\ClientCertificateType.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */