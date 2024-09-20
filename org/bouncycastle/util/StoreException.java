package org.bouncycastle.util;

public class StoreException extends RuntimeException {
  private Throwable _e;
  
  public StoreException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this._e = paramThrowable;
  }
  
  public Throwable getCause() {
    return this._e;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastl\\util\StoreException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */