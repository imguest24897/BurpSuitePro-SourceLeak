package org.bouncycastle.cms;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.AuthEnvelopedDataParser;
import org.bouncycastle.asn1.cms.CMSAttributes;
import org.bouncycastle.asn1.cms.EncryptedContentInfoParser;
import org.bouncycastle.asn1.cms.OriginatorInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

public class CMSAuthEnvelopedDataParser extends CMSContentInfoParser {
  private final RecipientInformationStore recipientInfoStore;
  
  private final AuthEnvelopedDataParser authEvnData = new AuthEnvelopedDataParser((ASN1SequenceParser)this._contentInfo.getContent(16));
  
  private final LocalMacProvider localMacProvider;
  
  private final AlgorithmIdentifier encAlg;
  
  private AttributeTable authAttrs;
  
  private ASN1Set authAttrSet;
  
  private AttributeTable unauthAttrs;
  
  private boolean authAttrNotRead = true;
  
  private boolean unauthAttrNotRead = true;
  
  private OriginatorInformation originatorInfo;
  
  public CMSAuthEnvelopedDataParser(byte[] paramArrayOfbyte) throws CMSException, IOException {
    this(new ByteArrayInputStream(paramArrayOfbyte));
  }
  
  public CMSAuthEnvelopedDataParser(InputStream paramInputStream) throws CMSException, IOException {
    super(paramInputStream);
    OriginatorInfo originatorInfo = this.authEvnData.getOriginatorInfo();
    if (originatorInfo != null)
      this.originatorInfo = new OriginatorInformation(originatorInfo); 
    ASN1Set aSN1Set = ASN1Set.getInstance(this.authEvnData.getRecipientInfos().toASN1Primitive());
    final EncryptedContentInfoParser encInfo = this.authEvnData.getAuthEncryptedContentInfo();
    this.encAlg = encryptedContentInfoParser.getContentEncryptionAlgorithm();
    this.localMacProvider = new LocalMacProvider(this.authEvnData, this);
    final CMSProcessableInputStream readable = new CMSProcessableInputStream(new InputStreamWithMAC(((ASN1OctetStringParser)encryptedContentInfoParser.getEncryptedContent(4)).getOctetStream(), this.localMacProvider));
    CMSSecureReadableWithAAD cMSSecureReadableWithAAD = new CMSSecureReadableWithAAD() {
        private OutputStream aadStream;
        
        public ASN1ObjectIdentifier getContentType() {
          return encInfo.getContentType();
        }
        
        public InputStream getInputStream() throws IOException, CMSException {
          return readable.getInputStream();
        }
        
        public ASN1Set getAuthAttrSet() {
          return CMSAuthEnvelopedDataParser.this.authAttrSet;
        }
        
        public void setAuthAttrSet(ASN1Set param1ASN1Set) {}
        
        public boolean hasAdditionalData() {
          return true;
        }
        
        public void setAADStream(OutputStream param1OutputStream) {
          this.aadStream = param1OutputStream;
        }
        
        public OutputStream getAADStream() {
          return this.aadStream;
        }
        
        public byte[] getMAC() {
          return Arrays.clone(CMSAuthEnvelopedDataParser.this.localMacProvider.getMAC());
        }
      };
    this.localMacProvider.setSecureReadable(cMSSecureReadableWithAAD);
    this.recipientInfoStore = CMSEnvelopedHelper.buildRecipientInformationStore(aSN1Set, this.encAlg, cMSSecureReadableWithAAD);
  }
  
  public OriginatorInformation getOriginatorInfo() {
    return this.originatorInfo;
  }
  
  public AlgorithmIdentifier getEncryptionAlgOID() {
    return this.encAlg;
  }
  
  public String getEncAlgOID() {
    return this.encAlg.getAlgorithm().toString();
  }
  
  public byte[] getEncAlgParams() {
    try {
      return CMSUtils.encodeObj(this.encAlg.getParameters());
    } catch (Exception exception) {
      throw new RuntimeException("exception getting encryption parameters " + exception);
    } 
  }
  
  public RecipientInformationStore getRecipientInfos() {
    return this.recipientInfoStore;
  }
  
  public byte[] getMac() throws IOException {
    return Arrays.clone(this.localMacProvider.getMAC());
  }
  
  private ASN1Set getAuthAttrSet() throws IOException {
    if (this.authAttrs == null && this.authAttrNotRead) {
      ASN1SetParser aSN1SetParser = this.authEvnData.getAuthAttrs();
      if (aSN1SetParser != null)
        this.authAttrSet = (ASN1Set)aSN1SetParser.toASN1Primitive(); 
      this.authAttrNotRead = false;
    } 
    return this.authAttrSet;
  }
  
  public AttributeTable getAuthAttrs() throws IOException {
    if (this.authAttrs == null && this.authAttrNotRead) {
      ASN1Set aSN1Set = getAuthAttrSet();
      if (aSN1Set != null)
        this.authAttrs = new AttributeTable(aSN1Set); 
    } 
    return this.authAttrs;
  }
  
  public AttributeTable getUnauthAttrs() throws IOException {
    if (this.unauthAttrs == null && this.unauthAttrNotRead) {
      this.unauthAttrNotRead = false;
      this.unauthAttrs = CMSUtils.getAttributesTable(this.authEvnData.getUnauthAttrs());
    } 
    return this.unauthAttrs;
  }
  
  public byte[] getContentDigest() {
    return (this.authAttrs != null) ? ASN1OctetString.getInstance(this.authAttrs.get(CMSAttributes.messageDigest).getAttrValues().getObjectAt(0)).getOctets() : null;
  }
  
  static class LocalMacProvider implements MACProvider {
    private byte[] mac;
    
    private final AuthEnvelopedDataParser authEnvData;
    
    private final CMSAuthEnvelopedDataParser parser;
    
    private CMSSecureReadableWithAAD readable;
    
    LocalMacProvider(AuthEnvelopedDataParser param1AuthEnvelopedDataParser, CMSAuthEnvelopedDataParser param1CMSAuthEnvelopedDataParser) {
      this.authEnvData = param1AuthEnvelopedDataParser;
      this.parser = param1CMSAuthEnvelopedDataParser;
    }
    
    public void init() throws IOException {
      this.parser.authAttrs = this.parser.getAuthAttrs();
      if (this.parser.authAttrs != null) {
        this.readable.setAuthAttrSet(this.parser.authAttrSet);
        this.readable.getAADStream().write(this.parser.authAttrs.toASN1Structure().getEncoded("DER"));
      } 
      this.mac = this.authEnvData.getMac().getOctets();
    }
    
    void setSecureReadable(CMSSecureReadableWithAAD param1CMSSecureReadableWithAAD) {
      this.readable = param1CMSSecureReadableWithAAD;
    }
    
    public byte[] getMAC() {
      return this.mac;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSAuthEnvelopedDataParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */