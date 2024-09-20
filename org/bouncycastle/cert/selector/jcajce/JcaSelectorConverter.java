package org.bouncycastle.cert.selector.jcajce;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.X509CertSelector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.selector.X509CertificateHolderSelector;

public class JcaSelectorConverter {
  public X509CertificateHolderSelector getCertificateHolderSelector(X509CertSelector paramX509CertSelector) {
    try {
      X500Name x500Name = X500Name.getInstance(paramX509CertSelector.getIssuerAsBytes());
      BigInteger bigInteger = paramX509CertSelector.getSerialNumber();
      byte[] arrayOfByte1 = null;
      byte[] arrayOfByte2 = paramX509CertSelector.getSubjectKeyIdentifier();
      if (arrayOfByte2 != null)
        arrayOfByte1 = ASN1OctetString.getInstance(arrayOfByte2).getOctets(); 
      return new X509CertificateHolderSelector(x500Name, bigInteger, arrayOfByte1);
    } catch (IOException iOException) {
      throw new IllegalArgumentException("unable to convert issuer: " + iOException.getMessage());
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\selector\jcajce\JcaSelectorConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */