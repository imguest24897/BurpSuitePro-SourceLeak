package org.bouncycastle.cms.jcajce;

import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.cms.KEMRecipientInfoGenerator;

public class JceKEMRecipientInfoGenerator extends KEMRecipientInfoGenerator {
  public JceKEMRecipientInfoGenerator(X509Certificate paramX509Certificate, ASN1ObjectIdentifier paramASN1ObjectIdentifier) throws CertificateEncodingException {
    super(new IssuerAndSerialNumber((new JcaX509CertificateHolder(paramX509Certificate)).toASN1Structure()), new JceCMSKEMKeyWrapper(paramX509Certificate.getPublicKey(), paramASN1ObjectIdentifier));
  }
  
  public JceKEMRecipientInfoGenerator(byte[] paramArrayOfbyte, PublicKey paramPublicKey, ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    super(paramArrayOfbyte, new JceCMSKEMKeyWrapper(paramPublicKey, paramASN1ObjectIdentifier));
  }
  
  public JceKEMRecipientInfoGenerator setProvider(String paramString) {
    ((JceCMSKEMKeyWrapper)this.wrapper).setProvider(paramString);
    return this;
  }
  
  public JceKEMRecipientInfoGenerator setProvider(Provider paramProvider) {
    ((JceCMSKEMKeyWrapper)this.wrapper).setProvider(paramProvider);
    return this;
  }
  
  public JceKEMRecipientInfoGenerator setSecureRandom(SecureRandom paramSecureRandom) {
    ((JceCMSKEMKeyWrapper)this.wrapper).setSecureRandom(paramSecureRandom);
    return this;
  }
  
  public JceKEMRecipientInfoGenerator setKDF(AlgorithmIdentifier paramAlgorithmIdentifier) {
    ((JceCMSKEMKeyWrapper)this.wrapper).setKDF(paramAlgorithmIdentifier);
    return this;
  }
  
  public JceKEMRecipientInfoGenerator setAlgorithmMapping(ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString) {
    ((JceCMSKEMKeyWrapper)this.wrapper).setAlgorithmMapping(paramASN1ObjectIdentifier, paramString);
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\jcajce\JceKEMRecipientInfoGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */