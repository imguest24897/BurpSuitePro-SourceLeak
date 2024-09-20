package org.bouncycastle.cms;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.EncryptedContentInfoParser;
import org.bouncycastle.asn1.cms.EnvelopedDataParser;
import org.bouncycastle.asn1.cms.OriginatorInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class CMSEnvelopedDataParser extends CMSContentInfoParser {
  RecipientInformationStore recipientInfoStore;
  
  EnvelopedDataParser envelopedData = new EnvelopedDataParser((ASN1SequenceParser)this._contentInfo.getContent(16));
  
  private AlgorithmIdentifier encAlg;
  
  private AttributeTable unprotectedAttributes;
  
  private boolean attrNotRead = true;
  
  private OriginatorInformation originatorInfo;
  
  public CMSEnvelopedDataParser(byte[] paramArrayOfbyte) throws CMSException, IOException {
    this(new ByteArrayInputStream(paramArrayOfbyte));
  }
  
  public CMSEnvelopedDataParser(InputStream paramInputStream) throws CMSException, IOException {
    super(paramInputStream);
    OriginatorInfo originatorInfo = this.envelopedData.getOriginatorInfo();
    if (originatorInfo != null)
      this.originatorInfo = new OriginatorInformation(originatorInfo); 
    ASN1Set aSN1Set = ASN1Set.getInstance(this.envelopedData.getRecipientInfos().toASN1Primitive());
    EncryptedContentInfoParser encryptedContentInfoParser = this.envelopedData.getEncryptedContentInfo();
    this.encAlg = encryptedContentInfoParser.getContentEncryptionAlgorithm();
    CMSProcessableInputStream cMSProcessableInputStream = new CMSProcessableInputStream(((ASN1OctetStringParser)encryptedContentInfoParser.getEncryptedContent(4)).getOctetStream());
    CMSEnvelopedHelper.CMSAuthEnveSecureReadable cMSAuthEnveSecureReadable = new CMSEnvelopedHelper.CMSAuthEnveSecureReadable(this.encAlg, encryptedContentInfoParser.getContentType(), cMSProcessableInputStream);
    this.recipientInfoStore = CMSEnvelopedHelper.buildRecipientInformationStore(aSN1Set, this.encAlg, cMSAuthEnveSecureReadable);
  }
  
  public String getEncryptionAlgOID() {
    return this.encAlg.getAlgorithm().toString();
  }
  
  public byte[] getEncryptionAlgParams() {
    try {
      return CMSUtils.encodeObj(this.encAlg.getParameters());
    } catch (Exception exception) {
      throw new RuntimeException("exception getting encryption parameters " + exception);
    } 
  }
  
  public AlgorithmIdentifier getContentEncryptionAlgorithm() {
    return this.encAlg;
  }
  
  public OriginatorInformation getOriginatorInfo() {
    return this.originatorInfo;
  }
  
  public RecipientInformationStore getRecipientInfos() {
    return this.recipientInfoStore;
  }
  
  public AttributeTable getUnprotectedAttributes() throws IOException {
    if (this.unprotectedAttributes == null && this.attrNotRead) {
      this.attrNotRead = false;
      this.unprotectedAttributes = CMSUtils.getAttributesTable(this.envelopedData.getUnprotectedAttrs());
    } 
    return this.unprotectedAttributes;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSEnvelopedDataParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */