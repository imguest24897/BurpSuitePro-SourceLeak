package org.bouncycastle.eac;

import java.io.IOException;

public class EACIOException extends IOException {
  private Throwable cause;
  
  public EACIOException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public EACIOException(String paramString) {
    super(paramString);
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\eac\EACIOException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */