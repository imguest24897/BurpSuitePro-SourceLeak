package burp;

public class Zv8_ implements Zs7f {
  private final Zmgn ZO;
  
  public Zv8_(Zmgn paramZmgn) {
    this.ZO = paramZmgn;
  }
  
  public void ZC(String paramString) {
    this.ZO.ZJ();
    try {
      this.ZO.replaceSelection(paramString);
    } finally {
      this.ZO.ZA();
    } 
  }
  
  public String ZT() {
    return this.ZO.getSelectedText();
  }
  
  public void Zl(String paramString) {
    ZC(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv8_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */