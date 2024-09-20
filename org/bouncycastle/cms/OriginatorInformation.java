package org.bouncycastle.cms;

import org.bouncycastle.asn1.cms.OriginatorInfo;
import org.bouncycastle.util.Store;

public class OriginatorInformation {
  private OriginatorInfo originatorInfo;
  
  OriginatorInformation(OriginatorInfo paramOriginatorInfo) {
    this.originatorInfo = paramOriginatorInfo;
  }
  
  public Store getCertificates() {
    return CMSSignedHelper.INSTANCE.getCertificates(this.originatorInfo.getCertificates());
  }
  
  public Store getCRLs() {
    return CMSSignedHelper.INSTANCE.getCRLs(this.originatorInfo.getCRLs());
  }
  
  public OriginatorInfo toASN1Structure() {
    return this.originatorInfo;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\OriginatorInformation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */