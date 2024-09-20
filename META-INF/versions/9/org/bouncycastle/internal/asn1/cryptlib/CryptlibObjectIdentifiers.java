package META-INF.versions.9.org.bouncycastle.internal.asn1.cryptlib;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public class CryptlibObjectIdentifiers {
  public static final ASN1ObjectIdentifier cryptlib = new ASN1ObjectIdentifier("1.3.6.1.4.1.3029");
  
  public static final ASN1ObjectIdentifier ecc = cryptlib.branch("1").branch("5");
  
  public static final ASN1ObjectIdentifier curvey25519 = ecc.branch("1");
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\internal\asn1\cryptlib\CryptlibObjectIdentifiers.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */