package org.bouncycastle.cms;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.cms.OriginatorInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.util.Store;

public class OriginatorInfoGenerator {
  private final List origCerts;
  
  private final List origCRLs;
  
  public OriginatorInfoGenerator(X509CertificateHolder paramX509CertificateHolder) {
    this.origCerts = new ArrayList(1);
    this.origCRLs = null;
    this.origCerts.add(paramX509CertificateHolder.toASN1Structure());
  }
  
  public OriginatorInfoGenerator(Store paramStore) throws CMSException {
    this(paramStore, null);
  }
  
  public OriginatorInfoGenerator(Store paramStore1, Store paramStore2) throws CMSException {
    if (paramStore1 != null) {
      this.origCerts = CMSUtils.getCertificatesFromStore(paramStore1);
    } else {
      this.origCerts = null;
    } 
    if (paramStore2 != null) {
      this.origCRLs = CMSUtils.getCRLsFromStore(paramStore2);
    } else {
      this.origCRLs = null;
    } 
  }
  
  public OriginatorInformation generate() {
    ASN1Set aSN1Set1 = (this.origCerts == null) ? null : CMSUtils.createDerSetFromList(this.origCerts);
    ASN1Set aSN1Set2 = (this.origCRLs == null) ? null : CMSUtils.createDerSetFromList(this.origCRLs);
    return new OriginatorInformation(new OriginatorInfo(aSN1Set1, aSN1Set2));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\OriginatorInfoGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */