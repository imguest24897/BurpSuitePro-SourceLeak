package burp;

import net.portswigger.javatooling.api.Range;

public class Zkf2 {
  private String Zm;
  
  public Zkf2() {}
  
  public Zkf2(String paramString) {
    this.Zm = paramString;
  }
  
  Range Zw(Range paramRange) {
    if (this.Zm != null) {
      int i = this.Zm.indexOf("§");
      return new Range(paramRange.startIndex() - i, paramRange.endIndex() - i);
    } 
    return paramRange;
  }
  
  int ZI(int paramInt) {
    if (this.Zm != null) {
      String str = this.Zm.substring(0, this.Zm.indexOf("§"));
      return paramInt - (str.split(System.lineSeparator(), -1)).length + 1;
    } 
    return paramInt;
  }
  
  public String ZW(String paramString) {
    return (this.Zm != null) ? this.Zm.replace("§", paramString) : paramString;
  }
  
  public int ZB(int paramInt) {
    return (this.Zm != null) ? (this.Zm.indexOf("§") + paramInt) : paramInt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkf2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */