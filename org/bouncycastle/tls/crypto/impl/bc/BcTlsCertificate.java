package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.util.Arrays;

public class BcTlsCertificate extends BcTlsRawKeyCertificate {
  protected final Certificate certificate;
  
  public static BcTlsCertificate convert(BcTlsCrypto paramBcTlsCrypto, TlsCertificate paramTlsCertificate) throws IOException {
    return (paramTlsCertificate instanceof BcTlsCertificate) ? (BcTlsCertificate)paramTlsCertificate : new BcTlsCertificate(paramBcTlsCrypto, paramTlsCertificate.getEncoded());
  }
  
  public static Certificate parseCertificate(byte[] paramArrayOfbyte) throws IOException {
    try {
      ASN1Primitive aSN1Primitive = TlsUtils.readASN1Object(paramArrayOfbyte);
      return Certificate.getInstance(aSN1Primitive);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new TlsFatalAlert((short)42, illegalArgumentException);
    } 
  }
  
  public BcTlsCertificate(BcTlsCrypto paramBcTlsCrypto, byte[] paramArrayOfbyte) throws IOException {
    this(paramBcTlsCrypto, parseCertificate(paramArrayOfbyte));
  }
  
  public BcTlsCertificate(BcTlsCrypto paramBcTlsCrypto, Certificate paramCertificate) {
    super(paramBcTlsCrypto, paramCertificate.getSubjectPublicKeyInfo());
    this.certificate = paramCertificate;
  }
  
  public Certificate getCertificate() {
    return this.certificate;
  }
  
  public byte[] getEncoded() throws IOException {
    return this.certificate.getEncoded("DER");
  }
  
  public byte[] getExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier) throws IOException {
    Extensions extensions = this.certificate.getTBSCertificate().getExtensions();
    if (extensions != null) {
      Extension extension = extensions.getExtension(paramASN1ObjectIdentifier);
      if (extension != null)
        return Arrays.clone(extension.getExtnValue().getOctets()); 
    } 
    return null;
  }
  
  public BigInteger getSerialNumber() {
    return this.certificate.getSerialNumber().getValue();
  }
  
  public String getSigAlgOID() {
    return this.certificate.getSignatureAlgorithm().getAlgorithm().getId();
  }
  
  public ASN1Encodable getSigAlgParams() {
    return this.certificate.getSignatureAlgorithm().getParameters();
  }
  
  protected boolean supportsKeyUsage(int paramInt) {
    Extensions extensions = this.certificate.getTBSCertificate().getExtensions();
    if (extensions != null) {
      KeyUsage keyUsage = KeyUsage.fromExtensions(extensions);
      if (keyUsage != null) {
        int i = keyUsage.getBytes()[0] & 0xFF;
        if ((i & paramInt) != paramInt)
          return false; 
      } 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsCertificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */