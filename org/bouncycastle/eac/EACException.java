package org.bouncycastle.eac;

public class EACException extends Exception {
  private Throwable cause;
  
  public EACException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public EACException(String paramString) {
    super(paramString);
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\eac\EACException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */