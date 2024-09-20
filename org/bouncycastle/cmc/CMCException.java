package org.bouncycastle.cmc;

public class CMCException extends Exception {
  private final Throwable cause;
  
  public CMCException(String paramString) {
    this(paramString, null);
  }
  
  public CMCException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cmc\CMCException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */