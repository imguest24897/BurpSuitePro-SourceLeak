package burp;

public class Zeiq implements CharSequence {
  CharSequence Zr;
  
  public Zeiq(CharSequence paramCharSequence) {
    this.Zr = paramCharSequence;
  }
  
  public char charAt(int paramInt) {
    try {
      if (Thread.interrupted())
        throw new RuntimeException(new InterruptedException()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.Zr.charAt(paramInt);
  }
  
  public int length() {
    return this.Zr.length();
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2) {
    return new Zeiq(this.Zr.subSequence(paramInt1, paramInt2));
  }
  
  public String toString() {
    return this.Zr.toString();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeiq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */