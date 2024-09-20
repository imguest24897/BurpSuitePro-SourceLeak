package org.bouncycastle.tls;

import java.io.IOException;

public class TlsException extends IOException {
  protected Throwable cause;
  
  public TlsException(String paramString) {
    this(paramString, null);
  }
  
  public TlsException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */