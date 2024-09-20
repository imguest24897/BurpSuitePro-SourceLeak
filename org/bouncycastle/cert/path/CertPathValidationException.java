package org.bouncycastle.cert.path;

public class CertPathValidationException extends Exception {
  private final Exception cause;
  
  public CertPathValidationException(String paramString) {
    this(paramString, null);
  }
  
  public CertPathValidationException(String paramString, Exception paramException) {
    super(paramString);
    this.cause = paramException;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\path\CertPathValidationException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */