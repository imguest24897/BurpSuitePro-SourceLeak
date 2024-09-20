package org.bouncycastle.cms;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.KEKRecipientInfo;
import org.bouncycastle.asn1.cms.KEMRecipientInfo;
import org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo;
import org.bouncycastle.asn1.cms.KeyTransRecipientInfo;
import org.bouncycastle.asn1.cms.OtherRecipientInfo;
import org.bouncycastle.asn1.cms.PasswordRecipientInfo;
import org.bouncycastle.asn1.cms.RecipientInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DigestCalculator;

class CMSEnvelopedHelper {
  static RecipientInformationStore buildRecipientInformationStore(ASN1Set paramASN1Set, AlgorithmIdentifier paramAlgorithmIdentifier, CMSSecureReadable paramCMSSecureReadable) {
    ArrayList<RecipientInformation> arrayList = new ArrayList();
    for (byte b = 0; b != paramASN1Set.size(); b++) {
      RecipientInfo recipientInfo = RecipientInfo.getInstance(paramASN1Set.getObjectAt(b));
      readRecipientInfo(arrayList, recipientInfo, paramAlgorithmIdentifier, paramCMSSecureReadable);
    } 
    return new RecipientInformationStore(arrayList);
  }
  
  private static void readRecipientInfo(List<KeyTransRecipientInformation> paramList, RecipientInfo paramRecipientInfo, AlgorithmIdentifier paramAlgorithmIdentifier, CMSSecureReadable paramCMSSecureReadable) {
    ASN1Encodable aSN1Encodable = paramRecipientInfo.getInfo();
    if (aSN1Encodable instanceof KeyTransRecipientInfo) {
      paramList.add(new KeyTransRecipientInformation((KeyTransRecipientInfo)aSN1Encodable, paramAlgorithmIdentifier, paramCMSSecureReadable));
    } else if (aSN1Encodable instanceof OtherRecipientInfo) {
      OtherRecipientInfo otherRecipientInfo = OtherRecipientInfo.getInstance(aSN1Encodable);
      if (CMSObjectIdentifiers.id_ori_kem.equals((ASN1Primitive)otherRecipientInfo.getType()))
        paramList.add(new KEMRecipientInformation(KEMRecipientInfo.getInstance(otherRecipientInfo.getValue()), paramAlgorithmIdentifier, paramCMSSecureReadable)); 
    } else if (aSN1Encodable instanceof KEKRecipientInfo) {
      paramList.add(new KEKRecipientInformation((KEKRecipientInfo)aSN1Encodable, paramAlgorithmIdentifier, paramCMSSecureReadable));
    } else if (aSN1Encodable instanceof KeyAgreeRecipientInfo) {
      KeyAgreeRecipientInformation.readRecipientInfo(paramList, (KeyAgreeRecipientInfo)aSN1Encodable, paramAlgorithmIdentifier, paramCMSSecureReadable);
    } else if (aSN1Encodable instanceof PasswordRecipientInfo) {
      paramList.add(new PasswordRecipientInformation((PasswordRecipientInfo)aSN1Encodable, paramAlgorithmIdentifier, paramCMSSecureReadable));
    } 
  }
  
  static class CMSAuthEnveSecureReadable extends CMSDefaultSecureReadable {
    private AlgorithmIdentifier algorithm;
    
    CMSAuthEnveSecureReadable(AlgorithmIdentifier param1AlgorithmIdentifier, ASN1ObjectIdentifier param1ASN1ObjectIdentifier, CMSReadable param1CMSReadable) {
      super(param1ASN1ObjectIdentifier, param1CMSReadable);
      this.algorithm = param1AlgorithmIdentifier;
    }
    
    public InputStream getInputStream() throws IOException, CMSException {
      return this.readable.getInputStream();
    }
    
    public boolean hasAdditionalData() {
      return false;
    }
  }
  
  static abstract class CMSDefaultSecureReadable implements CMSSecureReadable {
    protected final ASN1ObjectIdentifier contentType;
    
    protected CMSReadable readable;
    
    protected ASN1Set authAttrSet;
    
    CMSDefaultSecureReadable(ASN1ObjectIdentifier param1ASN1ObjectIdentifier, CMSReadable param1CMSReadable) {
      this.contentType = param1ASN1ObjectIdentifier;
      this.readable = param1CMSReadable;
    }
    
    public ASN1ObjectIdentifier getContentType() {
      return this.contentType;
    }
    
    public ASN1Set getAuthAttrSet() {
      return this.authAttrSet;
    }
    
    public void setAuthAttrSet(ASN1Set param1ASN1Set) {
      this.authAttrSet = param1ASN1Set;
    }
  }
  
  static class CMSDigestAuthenticatedSecureReadable extends CMSDefaultSecureReadable {
    private DigestCalculator digestCalculator;
    
    public CMSDigestAuthenticatedSecureReadable(DigestCalculator param1DigestCalculator, ASN1ObjectIdentifier param1ASN1ObjectIdentifier, CMSReadable param1CMSReadable) {
      super(param1ASN1ObjectIdentifier, param1CMSReadable);
      this.digestCalculator = param1DigestCalculator;
    }
    
    public InputStream getInputStream() throws IOException, CMSException {
      return new FilterInputStream(this.readable.getInputStream()) {
          public int read() throws IOException {
            int i = this.in.read();
            if (i >= 0)
              CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable.this.digestCalculator.getOutputStream().write(i); 
            return i;
          }
          
          public int read(byte[] param2ArrayOfbyte, int param2Int1, int param2Int2) throws IOException {
            int i = this.in.read(param2ArrayOfbyte, param2Int1, param2Int2);
            if (i >= 0)
              CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable.this.digestCalculator.getOutputStream().write(param2ArrayOfbyte, param2Int1, i); 
            return i;
          }
        };
    }
    
    public byte[] getDigest() {
      return this.digestCalculator.getDigest();
    }
    
    public boolean hasAdditionalData() {
      return true;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSEnvelopedHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */