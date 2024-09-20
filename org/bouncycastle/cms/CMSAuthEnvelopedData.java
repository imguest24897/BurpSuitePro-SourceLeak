package org.bouncycastle.cms;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.AuthEnvelopedData;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.EncryptedContentInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;

public class CMSAuthEnvelopedData implements Encodable {
  RecipientInformationStore recipientInfoStore;
  
  ContentInfo contentInfo;
  
  private OriginatorInformation originatorInfo;
  
  private AlgorithmIdentifier authEncAlg;
  
  private ASN1Set authAttrs;
  
  private byte[] mac;
  
  private ASN1Set unauthAttrs;
  
  public CMSAuthEnvelopedData(byte[] paramArrayOfbyte) throws CMSException {
    this(CMSUtils.readContentInfo(paramArrayOfbyte));
  }
  
  public CMSAuthEnvelopedData(InputStream paramInputStream) throws CMSException {
    this(CMSUtils.readContentInfo(paramInputStream));
  }
  
  public CMSAuthEnvelopedData(ContentInfo paramContentInfo) throws CMSException {
    this.contentInfo = paramContentInfo;
    AuthEnvelopedData authEnvelopedData = AuthEnvelopedData.getInstance(paramContentInfo.getContent());
    if (authEnvelopedData.getOriginatorInfo() != null)
      this.originatorInfo = new OriginatorInformation(authEnvelopedData.getOriginatorInfo()); 
    ASN1Set aSN1Set = authEnvelopedData.getRecipientInfos();
    final EncryptedContentInfo authEncInfo = authEnvelopedData.getAuthEncryptedContentInfo();
    this.authEncAlg = encryptedContentInfo.getContentEncryptionAlgorithm();
    this.mac = authEnvelopedData.getMac().getOctets();
    CMSSecureReadableWithAAD cMSSecureReadableWithAAD = new CMSSecureReadableWithAAD() {
        private OutputStream aadStream;
        
        public ASN1Set getAuthAttrSet() {
          return CMSAuthEnvelopedData.this.authAttrs;
        }
        
        public void setAuthAttrSet(ASN1Set param1ASN1Set) {}
        
        public boolean hasAdditionalData() {
          return (this.aadStream != null && CMSAuthEnvelopedData.this.authAttrs != null);
        }
        
        public ASN1ObjectIdentifier getContentType() {
          return authEncInfo.getContentType();
        }
        
        public InputStream getInputStream() throws IOException {
          if (this.aadStream != null && CMSAuthEnvelopedData.this.authAttrs != null)
            this.aadStream.write(CMSAuthEnvelopedData.this.authAttrs.getEncoded("DER")); 
          return new InputStreamWithMAC(new ByteArrayInputStream(authEncInfo.getEncryptedContent().getOctets()), CMSAuthEnvelopedData.this.mac);
        }
        
        public void setAADStream(OutputStream param1OutputStream) {
          this.aadStream = param1OutputStream;
        }
        
        public OutputStream getAADStream() {
          return this.aadStream;
        }
        
        public byte[] getMAC() {
          return Arrays.clone(CMSAuthEnvelopedData.this.mac);
        }
      };
    this.authAttrs = authEnvelopedData.getAuthAttrs();
    this.unauthAttrs = authEnvelopedData.getUnauthAttrs();
    this.recipientInfoStore = CMSEnvelopedHelper.buildRecipientInformationStore(aSN1Set, this.authEncAlg, cMSSecureReadableWithAAD);
  }
  
  public OriginatorInformation getOriginatorInfo() {
    return this.originatorInfo;
  }
  
  public RecipientInformationStore getRecipientInfos() {
    return this.recipientInfoStore;
  }
  
  public AttributeTable getAuthAttrs() {
    return (this.authAttrs == null) ? null : new AttributeTable(this.authAttrs);
  }
  
  public AttributeTable getUnauthAttrs() {
    return (this.unauthAttrs == null) ? null : new AttributeTable(this.unauthAttrs);
  }
  
  public byte[] getMac() {
    return Arrays.clone(this.mac);
  }
  
  public ContentInfo toASN1Structure() {
    return this.contentInfo;
  }
  
  public byte[] getEncoded() throws IOException {
    return this.contentInfo.getEncoded();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSAuthEnvelopedData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */