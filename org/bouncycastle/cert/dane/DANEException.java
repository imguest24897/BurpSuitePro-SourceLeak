package org.bouncycastle.cert.dane;

public class DANEException extends Exception {
  private Throwable cause;
  
  public DANEException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public DANEException(String paramString) {
    super(paramString);
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\dane\DANEException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */