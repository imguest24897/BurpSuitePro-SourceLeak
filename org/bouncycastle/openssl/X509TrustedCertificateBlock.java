package org.bouncycastle.openssl;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.util.Arrays;

public class X509TrustedCertificateBlock {
  private final X509CertificateHolder certificateHolder;
  
  private final CertificateTrustBlock trustBlock;
  
  public X509TrustedCertificateBlock(X509CertificateHolder paramX509CertificateHolder, CertificateTrustBlock paramCertificateTrustBlock) {
    this.certificateHolder = paramX509CertificateHolder;
    this.trustBlock = paramCertificateTrustBlock;
  }
  
  public X509TrustedCertificateBlock(byte[] paramArrayOfbyte) throws IOException {
    ASN1InputStream aSN1InputStream = new ASN1InputStream(paramArrayOfbyte);
    this.certificateHolder = new X509CertificateHolder(aSN1InputStream.readObject().getEncoded());
    ASN1Primitive aSN1Primitive = aSN1InputStream.readObject();
    if (aSN1Primitive != null) {
      this.trustBlock = new CertificateTrustBlock(aSN1Primitive.getEncoded());
    } else {
      this.trustBlock = null;
    } 
  }
  
  public byte[] getEncoded() throws IOException {
    return Arrays.concatenate(this.certificateHolder.getEncoded(), this.trustBlock.toASN1Sequence().getEncoded());
  }
  
  public X509CertificateHolder getCertificateHolder() {
    return this.certificateHolder;
  }
  
  public CertificateTrustBlock getTrustBlock() {
    return this.trustBlock;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\openssl\X509TrustedCertificateBlock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */