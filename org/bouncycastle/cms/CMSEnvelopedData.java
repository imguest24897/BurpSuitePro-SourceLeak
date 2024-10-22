package org.bouncycastle.cms;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.EncryptedContentInfo;
import org.bouncycastle.asn1.cms.EnvelopedData;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Encodable;

public class CMSEnvelopedData implements Encodable {
  RecipientInformationStore recipientInfoStore;
  
  ContentInfo contentInfo;
  
  private AlgorithmIdentifier encAlg;
  
  private ASN1Set unprotectedAttributes;
  
  private OriginatorInformation originatorInfo;
  
  public CMSEnvelopedData(byte[] paramArrayOfbyte) throws CMSException {
    this(CMSUtils.readContentInfo(paramArrayOfbyte));
  }
  
  public CMSEnvelopedData(InputStream paramInputStream) throws CMSException {
    this(CMSUtils.readContentInfo(paramInputStream));
  }
  
  public CMSEnvelopedData(ContentInfo paramContentInfo) throws CMSException {
    this.contentInfo = paramContentInfo;
    try {
      EnvelopedData envelopedData = EnvelopedData.getInstance(paramContentInfo.getContent());
      if (envelopedData.getOriginatorInfo() != null)
        this.originatorInfo = new OriginatorInformation(envelopedData.getOriginatorInfo()); 
      ASN1Set aSN1Set = envelopedData.getRecipientInfos();
      EncryptedContentInfo encryptedContentInfo = envelopedData.getEncryptedContentInfo();
      this.encAlg = encryptedContentInfo.getContentEncryptionAlgorithm();
      CMSProcessableByteArray cMSProcessableByteArray = new CMSProcessableByteArray(encryptedContentInfo.getEncryptedContent().getOctets());
      CMSEnvelopedHelper.CMSAuthEnveSecureReadable cMSAuthEnveSecureReadable = new CMSEnvelopedHelper.CMSAuthEnveSecureReadable(this.encAlg, encryptedContentInfo.getContentType(), cMSProcessableByteArray);
      this.recipientInfoStore = CMSEnvelopedHelper.buildRecipientInformationStore(aSN1Set, this.encAlg, cMSAuthEnveSecureReadable);
      this.unprotectedAttributes = envelopedData.getUnprotectedAttrs();
    } catch (ClassCastException classCastException) {
      throw new CMSException("Malformed content.", classCastException);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new CMSException("Malformed content.", illegalArgumentException);
    } 
  }
  
  public OriginatorInformation getOriginatorInfo() {
    return this.originatorInfo;
  }
  
  public AlgorithmIdentifier getContentEncryptionAlgorithm() {
    return this.encAlg;
  }
  
  public String getEncryptionAlgOID() {
    return this.encAlg.getAlgorithm().getId();
  }
  
  public byte[] getEncryptionAlgParams() {
    try {
      return CMSUtils.encodeObj(this.encAlg.getParameters());
    } catch (Exception exception) {
      throw new RuntimeException("exception getting encryption parameters " + exception);
    } 
  }
  
  public RecipientInformationStore getRecipientInfos() {
    return this.recipientInfoStore;
  }
  
  public ContentInfo toASN1Structure() {
    return this.contentInfo;
  }
  
  public AttributeTable getUnprotectedAttributes() {
    return (this.unprotectedAttributes == null) ? null : new AttributeTable(this.unprotectedAttributes);
  }
  
  public byte[] getEncoded() throws IOException {
    return this.contentInfo.getEncoded();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSEnvelopedData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */