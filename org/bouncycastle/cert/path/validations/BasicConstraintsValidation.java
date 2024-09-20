package org.bouncycastle.cert.path.validations;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.path.CertPathValidation;
import org.bouncycastle.cert.path.CertPathValidationContext;
import org.bouncycastle.cert.path.CertPathValidationException;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Memoable;

public class BasicConstraintsValidation implements CertPathValidation {
  private boolean previousCertWasCA = true;
  
  private Integer maxPathLength = null;
  
  private boolean isMandatory = true;
  
  public BasicConstraintsValidation() {
    this(true);
  }
  
  public BasicConstraintsValidation(boolean paramBoolean) {
    this.isMandatory = paramBoolean;
  }
  
  public void validate(CertPathValidationContext paramCertPathValidationContext, X509CertificateHolder paramX509CertificateHolder) throws CertPathValidationException {
    paramCertPathValidationContext.addHandledExtension(Extension.basicConstraints);
    if (!this.previousCertWasCA)
      throw new CertPathValidationException("Basic constraints violated: issuer is not a CA"); 
    BasicConstraints basicConstraints = BasicConstraints.fromExtensions(paramX509CertificateHolder.getExtensions());
    this.previousCertWasCA = ((basicConstraints != null && basicConstraints.isCA()) || (basicConstraints == null && !this.isMandatory));
    if (this.maxPathLength != null && !paramX509CertificateHolder.getSubject().equals(paramX509CertificateHolder.getIssuer())) {
      if (this.maxPathLength.intValue() < 0)
        throw new CertPathValidationException("Basic constraints violated: path length exceeded"); 
      this.maxPathLength = Integers.valueOf(this.maxPathLength.intValue() - 1);
    } 
    if (basicConstraints != null && basicConstraints.isCA()) {
      ASN1Integer aSN1Integer = basicConstraints.getPathLenConstraintInteger();
      if (aSN1Integer != null) {
        int i = aSN1Integer.intPositiveValueExact();
        if (this.maxPathLength == null || i < this.maxPathLength.intValue())
          this.maxPathLength = Integers.valueOf(i); 
      } 
    } 
  }
  
  public Memoable copy() {
    BasicConstraintsValidation basicConstraintsValidation = new BasicConstraintsValidation();
    basicConstraintsValidation.isMandatory = this.isMandatory;
    basicConstraintsValidation.previousCertWasCA = this.previousCertWasCA;
    basicConstraintsValidation.maxPathLength = this.maxPathLength;
    return (Memoable)basicConstraintsValidation;
  }
  
  public void reset(Memoable paramMemoable) {
    BasicConstraintsValidation basicConstraintsValidation = (BasicConstraintsValidation)paramMemoable;
    this.isMandatory = basicConstraintsValidation.isMandatory;
    this.previousCertWasCA = basicConstraintsValidation.previousCertWasCA;
    this.maxPathLength = basicConstraintsValidation.maxPathLength;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\path\validations\BasicConstraintsValidation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */