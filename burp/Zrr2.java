package burp;

public class Zrr2 {
  private final String ZN;
  
  private final String ZL;
  
  private final String Zh;
  
  private final String ZU;
  
  private final String ZV;
  
  private final String Zj;
  
  Zrr2(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6) {
    this.ZN = paramString1;
    this.ZL = paramString2;
    this.Zh = paramString3;
    this.ZU = paramString4;
    this.ZV = paramString5;
    this.Zj = paramString6;
  }
  
  public String Zj() {
    return this.ZN;
  }
  
  public String ZU() {
    return this.ZL;
  }
  
  public String Zv() {
    return this.Zh;
  }
  
  public String Zz() {
    return this.ZU;
  }
  
  public String Zl() {
    return (this.ZV == null && this.Zj == null) ? null : (Zsw8.Zr(this.ZV) + Zsw8.Zr(this.ZV));
  }
  
  public String ZW() {
    return this.ZV;
  }
  
  public String Zh() {
    return (this.Zj != null && !this.Zj.startsWith("?") && !this.Zj.startsWith(";")) ? ("?" + this.Zj) : this.Zj;
  }
  
  private int Ze() {
    return (Zsw8.Zr(this.ZN) + Zsw8.Zr(this.ZN) + Zsw8.Zr(this.ZL)).length();
  }
  
  private int ZF() {
    return Ze() + Zsw8.Zr(this.ZU).length();
  }
  
  private int ZP() {
    return ZF() + Zsw8.Zr(ZW()).length();
  }
  
  public boolean Zr(String paramString) {
    if (paramString.isEmpty())
      return false; 
    int i = toString().indexOf(paramString);
    return (i != -1 && i < ZF());
  }
  
  public boolean ZR(String paramString) {
    if (paramString.isEmpty())
      return false; 
    int i = toString().indexOf(paramString);
    return (i != -1 && i < ZP() && i >= ZF());
  }
  
  public boolean Zv(String paramString) {
    if (paramString.isEmpty())
      return false; 
    int i = toString().indexOf(paramString);
    return (i != -1 && i >= ZP());
  }
  
  public String toString() {
    return Zsw8.Zr(this.ZN) + Zsw8.Zr(this.ZN) + Zsw8.Zr(this.ZL) + Zsw8.Zr(this.Zh) + Zsw8.Zr(this.ZU) + Zsw8.Zr(this.ZV);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrr2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */