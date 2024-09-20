package burp;

class Zgb2 implements Ztxn, Zthe {
  private final Zb10 ZO;
  
  private final Zzen ZV;
  
  private Zgb2(Zb10 paramZb10, Zzen paramZzen) {
    this.ZO = paramZb10;
    this.ZV = paramZzen;
  }
  
  public void ZX(Exception paramException) {
    this.ZO.ZL(paramException);
  }
  
  public void Zh(Exception paramException) {
    this.ZO.ZH(paramException);
  }
  
  public void ZN(Exception paramException, Zb6q paramZb6q) {
    this.ZO.ZE((Zm7u)paramZb6q, paramException);
  }
  
  public void ZP(Exception paramException) {
    this.ZO.Zq(paramException);
  }
  
  public void Ze() {
    this.ZV.ZD(Zewh.ABORTED, this.ZO.Zo());
    this.ZO.Zz();
  }
  
  public void ZM() {
    this.ZV.ZD(Zewh.COMPLETED, this.ZO.Zo());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgb2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */