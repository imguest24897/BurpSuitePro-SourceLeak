package org.bouncycastle.tsp.cms;

import java.net.URI;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.cms.Attributes;
import org.bouncycastle.asn1.cms.MetaData;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.DigestCalculator;

public class CMSTimeStampedGenerator {
  protected MetaData metaData;
  
  protected URI dataUri;
  
  public void setDataUri(URI paramURI) {
    this.dataUri = paramURI;
  }
  
  public void setMetaData(boolean paramBoolean, String paramString1, String paramString2) {
    setMetaData(paramBoolean, paramString1, paramString2, (Attributes)null);
  }
  
  public void setMetaData(boolean paramBoolean, String paramString1, String paramString2, Attributes paramAttributes) {
    DERUTF8String dERUTF8String = null;
    if (paramString1 != null)
      dERUTF8String = new DERUTF8String(paramString1); 
    DERIA5String dERIA5String = null;
    if (paramString2 != null)
      dERIA5String = new DERIA5String(paramString2); 
    setMetaData(paramBoolean, (ASN1UTF8String)dERUTF8String, (ASN1IA5String)dERIA5String, paramAttributes);
  }
  
  private void setMetaData(boolean paramBoolean, ASN1UTF8String paramASN1UTF8String, ASN1IA5String paramASN1IA5String, Attributes paramAttributes) {
    this.metaData = new MetaData(ASN1Boolean.getInstance(paramBoolean), paramASN1UTF8String, paramASN1IA5String, paramAttributes);
  }
  
  public void initialiseMessageImprintDigestCalculator(DigestCalculator paramDigestCalculator) throws CMSException {
    MetaDataUtil metaDataUtil = new MetaDataUtil(this.metaData);
    metaDataUtil.initialiseMessageImprintDigestCalculator(paramDigestCalculator);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\cms\CMSTimeStampedGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */