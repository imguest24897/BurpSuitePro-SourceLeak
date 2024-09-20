package net.portswigger;

class Za2 implements Zga {
  private final Zrmq Zw;
  
  private String ZF = null;
  
  private Za2(Zrmq paramZrmq) {
    this.Zw = paramZrmq;
  }
  
  public void ZU(String paramString) {
    this.ZF = paramString;
  }
  
  public void ZJ(Zrmq paramZrmq) {
    this.Zw.ZN(this.ZF, paramZrmq);
    this.ZF = null;
  }
  
  public Zrmq Zg() {
    return this.Zw;
  }
  
  public boolean ZW() {
    return this.Zw.Zw();
  }
  
  public boolean ZL() {
    return this.Zw.Za();
  }
  
  public boolean Zf() {
    return (this.ZF != null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Za2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */