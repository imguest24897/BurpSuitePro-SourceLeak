package META-INF.versions.9.org.bouncycastle.tls;

public class CertificateType {
  public static final short X509 = 0;
  
  public static final short OpenPGP = 1;
  
  public static final short RawPublicKey = 2;
  
  public static boolean isValid(short paramShort) {
    return (paramShort >= 0 && paramShort <= 2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\CertificateType.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */