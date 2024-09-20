package org.bouncycastle.cert.path;

import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.util.Memoable;

public class CertPathValidationContext implements Memoable {
  private Set criticalExtensions;
  
  private Set handledExtensions = new HashSet();
  
  private boolean endEntity;
  
  private int index;
  
  public CertPathValidationContext(Set paramSet) {
    this.criticalExtensions = paramSet;
  }
  
  public void addHandledExtension(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    this.handledExtensions.add(paramASN1ObjectIdentifier);
  }
  
  public void setIsEndEntity(boolean paramBoolean) {
    this.endEntity = paramBoolean;
  }
  
  public Set getUnhandledCriticalExtensionOIDs() {
    HashSet hashSet = new HashSet(this.criticalExtensions);
    hashSet.removeAll(this.handledExtensions);
    return hashSet;
  }
  
  public boolean isEndEntity() {
    return this.endEntity;
  }
  
  public Memoable copy() {
    CertPathValidationContext certPathValidationContext = new CertPathValidationContext(new HashSet(this.criticalExtensions));
    certPathValidationContext.handledExtensions = new HashSet(this.handledExtensions);
    certPathValidationContext.endEntity = this.endEntity;
    certPathValidationContext.index = this.index;
    return certPathValidationContext;
  }
  
  public void reset(Memoable paramMemoable) {
    CertPathValidationContext certPathValidationContext = (CertPathValidationContext)paramMemoable;
    this.criticalExtensions = new HashSet(certPathValidationContext.criticalExtensions);
    this.handledExtensions = new HashSet(certPathValidationContext.handledExtensions);
    this.endEntity = certPathValidationContext.endEntity;
    this.index = certPathValidationContext.index;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\path\CertPathValidationContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */