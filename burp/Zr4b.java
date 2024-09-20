package burp;

public class Zr4b {
  public final String Zh;
  
  public final String Zb;
  
  Zr4b(String paramString1, String paramString2) {
    this.Zh = paramString1;
    this.Zb = paramString2;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zr4b zr4b = (Zr4b)paramObject;
    return this.Zb.equals(zr4b.Zb);
  }
  
  public int hashCode() {
    return this.Zb.hashCode();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr4b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */