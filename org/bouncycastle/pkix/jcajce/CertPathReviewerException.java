package org.bouncycastle.pkix.jcajce;

import java.security.cert.CertPath;
import org.bouncycastle.pkix.util.ErrorBundle;
import org.bouncycastle.pkix.util.LocalizedException;

public class CertPathReviewerException extends LocalizedException {
  private int index = -1;
  
  private CertPath certPath = null;
  
  public CertPathReviewerException(ErrorBundle paramErrorBundle, Throwable paramThrowable) {
    super(paramErrorBundle, paramThrowable);
  }
  
  public CertPathReviewerException(ErrorBundle paramErrorBundle) {
    super(paramErrorBundle);
  }
  
  public CertPathReviewerException(ErrorBundle paramErrorBundle, Throwable paramThrowable, CertPath paramCertPath, int paramInt) {
    super(paramErrorBundle, paramThrowable);
    if (paramCertPath == null || paramInt == -1)
      throw new IllegalArgumentException(); 
    if (paramInt < -1 || paramInt >= paramCertPath.getCertificates().size())
      throw new IndexOutOfBoundsException(); 
    this.certPath = paramCertPath;
    this.index = paramInt;
  }
  
  public CertPathReviewerException(ErrorBundle paramErrorBundle, CertPath paramCertPath, int paramInt) {
    super(paramErrorBundle);
    if (paramCertPath == null || paramInt == -1)
      throw new IllegalArgumentException(); 
    if (paramInt < -1 || paramInt >= paramCertPath.getCertificates().size())
      throw new IndexOutOfBoundsException(); 
    this.certPath = paramCertPath;
    this.index = paramInt;
  }
  
  public CertPath getCertPath() {
    return this.certPath;
  }
  
  public int getIndex() {
    return this.index;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkix\jcajce\CertPathReviewerException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */