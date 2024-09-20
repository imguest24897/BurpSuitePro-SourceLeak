package org.bouncycastle.cert.path;

import java.util.Collections;
import java.util.Set;
import org.bouncycastle.util.Arrays;

public class CertPathValidationResult {
  private final boolean isValid;
  
  private final CertPathValidationException cause;
  
  private final Set unhandledCriticalExtensionOIDs;
  
  private final int certIndex;
  
  private final int ruleIndex;
  
  private CertPathValidationException[] causes;
  
  private int[] certIndexes;
  
  private int[] ruleIndexes;
  
  public CertPathValidationResult(CertPathValidationContext paramCertPathValidationContext) {
    this.unhandledCriticalExtensionOIDs = Collections.unmodifiableSet(paramCertPathValidationContext.getUnhandledCriticalExtensionOIDs());
    this.isValid = this.unhandledCriticalExtensionOIDs.isEmpty();
    this.certIndex = -1;
    this.ruleIndex = -1;
    this.cause = null;
  }
  
  public CertPathValidationResult(CertPathValidationContext paramCertPathValidationContext, int paramInt1, int paramInt2, CertPathValidationException paramCertPathValidationException) {
    this.unhandledCriticalExtensionOIDs = Collections.unmodifiableSet(paramCertPathValidationContext.getUnhandledCriticalExtensionOIDs());
    this.isValid = false;
    this.certIndex = paramInt1;
    this.ruleIndex = paramInt2;
    this.cause = paramCertPathValidationException;
  }
  
  public CertPathValidationResult(CertPathValidationContext paramCertPathValidationContext, int[] paramArrayOfint1, int[] paramArrayOfint2, CertPathValidationException[] paramArrayOfCertPathValidationException) {
    this.unhandledCriticalExtensionOIDs = Collections.unmodifiableSet(paramCertPathValidationContext.getUnhandledCriticalExtensionOIDs());
    this.isValid = false;
    this.cause = paramArrayOfCertPathValidationException[0];
    this.certIndex = paramArrayOfint1[0];
    this.ruleIndex = paramArrayOfint2[0];
    this.causes = paramArrayOfCertPathValidationException;
    this.certIndexes = paramArrayOfint1;
    this.ruleIndexes = paramArrayOfint2;
  }
  
  public boolean isValid() {
    return this.isValid;
  }
  
  public CertPathValidationException getCause() {
    return (this.cause != null) ? this.cause : (!this.unhandledCriticalExtensionOIDs.isEmpty() ? new CertPathValidationException("Unhandled Critical Extensions") : null);
  }
  
  public int getFailingCertIndex() {
    return this.certIndex;
  }
  
  public int getFailingRuleIndex() {
    return this.ruleIndex;
  }
  
  public Set getUnhandledCriticalExtensionOIDs() {
    return this.unhandledCriticalExtensionOIDs;
  }
  
  public boolean isDetailed() {
    return (this.certIndexes != null);
  }
  
  public CertPathValidationException[] getCauses() {
    if (this.causes != null) {
      CertPathValidationException[] arrayOfCertPathValidationException = new CertPathValidationException[this.causes.length];
      System.arraycopy(this.causes, 0, arrayOfCertPathValidationException, 0, this.causes.length);
      return arrayOfCertPathValidationException;
    } 
    return !this.unhandledCriticalExtensionOIDs.isEmpty() ? new CertPathValidationException[] { new CertPathValidationException("Unhandled Critical Extensions") } : null;
  }
  
  public int[] getFailingCertIndexes() {
    return Arrays.clone(this.certIndexes);
  }
  
  public int[] getFailingRuleIndexes() {
    return Arrays.clone(this.ruleIndexes);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\path\CertPathValidationResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */