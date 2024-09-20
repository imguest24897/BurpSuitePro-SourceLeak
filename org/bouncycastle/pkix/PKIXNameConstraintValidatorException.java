package org.bouncycastle.pkix;

public class PKIXNameConstraintValidatorException extends Exception {
  private Throwable cause;
  
  public PKIXNameConstraintValidatorException(String paramString) {
    super(paramString);
  }
  
  public PKIXNameConstraintValidatorException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkix\PKIXNameConstraintValidatorException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */