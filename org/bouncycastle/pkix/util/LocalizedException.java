package org.bouncycastle.pkix.util;

import java.util.Locale;

public class LocalizedException extends Exception {
  protected ErrorBundle message;
  
  private Throwable cause;
  
  public LocalizedException(ErrorBundle paramErrorBundle) {
    super(paramErrorBundle.getText(Locale.getDefault()));
    this.message = paramErrorBundle;
  }
  
  public LocalizedException(ErrorBundle paramErrorBundle, Throwable paramThrowable) {
    super(paramErrorBundle.getText(Locale.getDefault()));
    this.message = paramErrorBundle;
    this.cause = paramThrowable;
  }
  
  public ErrorBundle getErrorMessage() {
    return this.message;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pki\\util\LocalizedException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */