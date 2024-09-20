package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.ASN1Util;

public class AuthEnvelopedDataParser {
  private ASN1SequenceParser seq;
  
  private ASN1Integer version;
  
  private ASN1Encodable nextObject;
  
  private boolean originatorInfoCalled;
  
  private boolean isData;
  
  public AuthEnvelopedDataParser(ASN1SequenceParser paramASN1SequenceParser) throws IOException {
    this.seq = paramASN1SequenceParser;
    this.version = ASN1Integer.getInstance(paramASN1SequenceParser.readObject());
    if (!this.version.hasValue(0))
      throw new ASN1ParsingException("AuthEnvelopedData version number must be 0"); 
  }
  
  public ASN1Integer getVersion() {
    return this.version;
  }
  
  public OriginatorInfo getOriginatorInfo() throws IOException {
    this.originatorInfoCalled = true;
    if (this.nextObject == null)
      this.nextObject = this.seq.readObject(); 
    if (this.nextObject instanceof ASN1TaggedObjectParser) {
      ASN1TaggedObjectParser aSN1TaggedObjectParser = (ASN1TaggedObjectParser)this.nextObject;
      if (aSN1TaggedObjectParser.hasContextTag(0)) {
        ASN1SequenceParser aSN1SequenceParser = (ASN1SequenceParser)aSN1TaggedObjectParser.parseBaseUniversal(false, 16);
        this.nextObject = null;
        return OriginatorInfo.getInstance(aSN1SequenceParser.getLoadedObject());
      } 
    } 
    return null;
  }
  
  public ASN1SetParser getRecipientInfos() throws IOException {
    if (!this.originatorInfoCalled)
      getOriginatorInfo(); 
    if (this.nextObject == null)
      this.nextObject = this.seq.readObject(); 
    ASN1SetParser aSN1SetParser = (ASN1SetParser)this.nextObject;
    this.nextObject = null;
    return aSN1SetParser;
  }
  
  public EncryptedContentInfoParser getAuthEncryptedContentInfo() throws IOException {
    if (this.nextObject == null)
      this.nextObject = this.seq.readObject(); 
    if (this.nextObject != null) {
      ASN1SequenceParser aSN1SequenceParser = (ASN1SequenceParser)this.nextObject;
      this.nextObject = null;
      EncryptedContentInfoParser encryptedContentInfoParser = new EncryptedContentInfoParser(aSN1SequenceParser);
      this.isData = CMSObjectIdentifiers.data.equals((ASN1Primitive)encryptedContentInfoParser.getContentType());
      return encryptedContentInfoParser;
    } 
    return null;
  }
  
  public ASN1SetParser getAuthAttrs() throws IOException {
    if (this.nextObject == null)
      this.nextObject = this.seq.readObject(); 
    if (this.nextObject instanceof ASN1TaggedObjectParser) {
      ASN1TaggedObjectParser aSN1TaggedObjectParser = (ASN1TaggedObjectParser)this.nextObject;
      this.nextObject = null;
      return (ASN1SetParser)ASN1Util.parseContextBaseUniversal(aSN1TaggedObjectParser, 1, false, 17);
    } 
    if (!this.isData)
      throw new ASN1ParsingException("authAttrs must be present with non-data content"); 
    return null;
  }
  
  public ASN1OctetString getMac() throws IOException {
    if (this.nextObject == null)
      this.nextObject = this.seq.readObject(); 
    ASN1Encodable aSN1Encodable = this.nextObject;
    this.nextObject = null;
    return ASN1OctetString.getInstance(aSN1Encodable.toASN1Primitive());
  }
  
  public ASN1SetParser getUnauthAttrs() throws IOException {
    if (this.nextObject == null)
      this.nextObject = this.seq.readObject(); 
    if (this.nextObject != null) {
      ASN1TaggedObjectParser aSN1TaggedObjectParser = (ASN1TaggedObjectParser)this.nextObject;
      this.nextObject = null;
      return (ASN1SetParser)ASN1Util.parseContextBaseUniversal(aSN1TaggedObjectParser, 2, false, 17);
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cms\AuthEnvelopedDataParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */