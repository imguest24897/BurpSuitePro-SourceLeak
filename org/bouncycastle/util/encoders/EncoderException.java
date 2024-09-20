package org.bouncycastle.util.encoders;

public class EncoderException extends IllegalStateException {
  private Throwable cause;
  
  EncoderException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastl\\util\encoders\EncoderException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */