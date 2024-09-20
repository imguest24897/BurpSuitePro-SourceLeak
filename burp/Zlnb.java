package burp;

public final class Zlnb<T> {
  private final String Zz;
  
  protected Zlnb(String paramString, Class<T> paramClass) {
    if (paramString != null)
      try {
        if (!paramString.isEmpty())
          try {
            if (paramClass != null) {
              this.Zz = paramString;
              return;
            } 
            throw new IllegalArgumentException();
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      }  
    throw new IllegalArgumentException();
  }
  
  public String ZS() {
    return this.Zz;
  }
  
  public String toString() {
    return this.Zz;
  }
  
  public int hashCode() {
    return ZS().hashCode();
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof Zlnb) {
      Zlnb zlnb = (Zlnb)paramObject;
      return this.Zz.equals(zlnb.Zz);
    } 
    return false;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlnb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */