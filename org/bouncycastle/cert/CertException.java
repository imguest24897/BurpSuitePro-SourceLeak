package org.bouncycastle.cert;

public class CertException extends Exception {
  private Throwable cause;
  
  public CertException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public CertException(String paramString) {
    super(paramString);
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\CertException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */