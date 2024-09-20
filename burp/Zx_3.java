package burp;

public class Zx_3 {
  private String ZN;
  
  private Integer Zj;
  
  private boolean Zh;
  
  public Zx_3 Zb(String paramString) {
    this.ZN = paramString;
    return this;
  }
  
  public Zx_3 ZJ(int paramInt) {
    this.Zj = Integer.valueOf(paramInt);
    this.Zh = false;
    return this;
  }
  
  public Zx_3 Zy() {
    this.Zj = null;
    this.Zh = true;
    return this;
  }
  
  public Zlj9 Zl() {
    return new Zlj9(this.ZN, this.Zj, this.Zh);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx_3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */