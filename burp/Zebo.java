package burp;

class Zebo extends Zem5 {
  private final char ZX;
  
  private final int ZN;
  
  Zebo(String paramString, int paramInt) {
    super(paramString);
    this.ZX = paramString.charAt(paramString.length() - 1);
    this.ZN = paramInt;
  }
  
  public String ZJ(String paramString, int paramInt) {
    int i = paramInt + this.Z_.length();
    while (i < paramString.length() && this.ZX == paramString.charAt(i)) {
      if (++i - paramInt > this.ZN)
        return null; 
    } 
    return paramString.substring(paramInt, i);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zebo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */