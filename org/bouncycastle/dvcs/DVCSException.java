package org.bouncycastle.dvcs;

public class DVCSException extends Exception {
  private static final long serialVersionUID = 389345256020131488L;
  
  private Throwable cause;
  
  public DVCSException(String paramString) {
    super(paramString);
  }
  
  public DVCSException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\dvcs\DVCSException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */