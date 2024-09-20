package META-INF.versions.9.org.bouncycastle.tls;

public class IdentifierType {
  public static final short pre_agreed = 0;
  
  public static final short key_sha1_hash = 1;
  
  public static final short x509_name = 2;
  
  public static final short cert_sha1_hash = 3;
  
  public static String getName(short paramShort) {
    switch (paramShort) {
      case 0:
        return "pre_agreed";
      case 1:
        return "key_sha1_hash";
      case 2:
        return "x509_name";
      case 3:
        return "cert_sha1_hash";
    } 
    return "UNKNOWN";
  }
  
  public static String getText(short paramShort) {
    return getName(paramShort) + "(" + getName(paramShort) + ")";
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\IdentifierType.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */