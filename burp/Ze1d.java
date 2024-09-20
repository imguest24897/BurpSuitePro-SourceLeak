package burp;

import java.util.Iterator;

public class Ze1d implements Iterable<String> {
  private final String Zx;
  
  private int ZQ;
  
  private String ZT;
  
  Ze1d(String paramString1, String paramString2, String paramString3) {
    this.Zx = paramString3;
    Zc(paramString1);
    ZV(paramString2);
  }
  
  private void Zc(String paramString) {
    int i = (paramString.split("/")).length;
    this.ZQ = Math.min(Math.max(i + 2, 6), 21);
  }
  
  private void ZV(String paramString) {
    Zbqc[] arrayOfZbqc = Zg3o.ZN();
    if (paramString.contains("/") && paramString.length() > 1) {
      this.ZT = paramString.substring(0, paramString.lastIndexOf("/") + "/".length());
      if (arrayOfZbqc == null) {
        this.ZT = "";
        return;
      } 
      return;
    } 
    this.ZT = "";
  }
  
  public Iterator<String> iterator() {
    return new Zerc(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze1d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */