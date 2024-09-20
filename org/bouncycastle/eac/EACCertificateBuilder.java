package org.bouncycastle.eac;

import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.eac.CVCertificate;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.asn1.eac.CertificateHolderReference;
import org.bouncycastle.asn1.eac.CertificationAuthorityReference;
import org.bouncycastle.asn1.eac.PackedDate;
import org.bouncycastle.asn1.eac.PublicKeyDataObject;
import org.bouncycastle.eac.operator.EACSigner;

public class EACCertificateBuilder {
  private static final byte[] ZeroArray = new byte[] { 0 };
  
  private PublicKeyDataObject publicKey;
  
  private CertificateHolderAuthorization certificateHolderAuthorization;
  
  private PackedDate certificateEffectiveDate;
  
  private PackedDate certificateExpirationDate;
  
  private CertificateHolderReference certificateHolderReference;
  
  private CertificationAuthorityReference certificationAuthorityReference;
  
  public EACCertificateBuilder(CertificationAuthorityReference paramCertificationAuthorityReference, PublicKeyDataObject paramPublicKeyDataObject, CertificateHolderReference paramCertificateHolderReference, CertificateHolderAuthorization paramCertificateHolderAuthorization, PackedDate paramPackedDate1, PackedDate paramPackedDate2) {
    this.certificationAuthorityReference = paramCertificationAuthorityReference;
    this.publicKey = paramPublicKeyDataObject;
    this.certificateHolderReference = paramCertificateHolderReference;
    this.certificateHolderAuthorization = paramCertificateHolderAuthorization;
    this.certificateEffectiveDate = paramPackedDate1;
    this.certificateExpirationDate = paramPackedDate2;
  }
  
  private CertificateBody buildBody() {
    DERTaggedObject dERTaggedObject = new DERTaggedObject(false, 64, 41, (ASN1Encodable)new DEROctetString(ZeroArray));
    return new CertificateBody((ASN1TaggedObject)dERTaggedObject, this.certificationAuthorityReference, this.publicKey, this.certificateHolderReference, this.certificateHolderAuthorization, this.certificateEffectiveDate, this.certificateExpirationDate);
  }
  
  public EACCertificateHolder build(EACSigner paramEACSigner) throws EACException {
    try {
      CertificateBody certificateBody = buildBody();
      OutputStream outputStream = paramEACSigner.getOutputStream();
      outputStream.write(certificateBody.getEncoded("DER"));
      outputStream.close();
      return new EACCertificateHolder(new CVCertificate(certificateBody, paramEACSigner.getSignature()));
    } catch (Exception exception) {
      throw new EACException("unable to process signature: " + exception.getMessage(), exception);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\eac\EACCertificateBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */