package org.bouncycastle.cert.path;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.util.Integers;

class CertPathValidationResultBuilder {
  private final CertPathValidationContext context;
  
  private final List<Integer> certIndexes = new ArrayList<>();
  
  private final List<Integer> ruleIndexes = new ArrayList<>();
  
  private final List<CertPathValidationException> exceptions = new ArrayList<>();
  
  CertPathValidationResultBuilder(CertPathValidationContext paramCertPathValidationContext) {
    this.context = paramCertPathValidationContext;
  }
  
  public CertPathValidationResult build() {
    return this.exceptions.isEmpty() ? new CertPathValidationResult(this.context) : new CertPathValidationResult(this.context, toInts(this.certIndexes), toInts(this.ruleIndexes), this.exceptions.<CertPathValidationException>toArray(new CertPathValidationException[this.exceptions.size()]));
  }
  
  public void addException(int paramInt1, int paramInt2, CertPathValidationException paramCertPathValidationException) {
    this.certIndexes.add(Integers.valueOf(paramInt1));
    this.ruleIndexes.add(Integers.valueOf(paramInt2));
    this.exceptions.add(paramCertPathValidationException);
  }
  
  private int[] toInts(List<Integer> paramList) {
    int[] arrayOfInt = new int[paramList.size()];
    for (byte b = 0; b != arrayOfInt.length; b++)
      arrayOfInt[b] = ((Integer)paramList.get(b)).intValue(); 
    return arrayOfInt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\path\CertPathValidationResultBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */