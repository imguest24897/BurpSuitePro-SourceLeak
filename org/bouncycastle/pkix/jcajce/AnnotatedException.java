package org.bouncycastle.pkix.jcajce;

class AnnotatedException extends Exception {
  private Throwable _underlyingException;
  
  public AnnotatedException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this._underlyingException = paramThrowable;
  }
  
  public AnnotatedException(String paramString) {
    this(paramString, null);
  }
  
  public Throwable getCause() {
    return this._underlyingException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkix\jcajce\AnnotatedException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */