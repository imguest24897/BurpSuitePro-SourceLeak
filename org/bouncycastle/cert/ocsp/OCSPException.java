package org.bouncycastle.cert.ocsp;

public class OCSPException extends Exception {
  private Throwable cause;
  
  public OCSPException(String paramString) {
    super(paramString);
  }
  
  public OCSPException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\ocsp\OCSPException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */