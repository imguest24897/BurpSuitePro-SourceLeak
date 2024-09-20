package burp;

class Zzr1 implements Ztsi {
  private final Zgim ZL;
  
  private boolean Zx;
  
  private Zs_n ZJ;
  
  Zzr1(Zgim paramZgim) {
    this.ZL = paramZgim;
  }
  
  public void ZE(Ztu8 paramZtu8) {
    this.ZL.ZQ(paramZtu8.ZlP());
  }
  
  public void Zs(Ztu8 paramZtu8) {
    this.ZL.ZQ(paramZtu8.ZlP());
  }
  
  public void ZR() {
    if (this.Zx) {
      this.ZL.ZQ(this.ZJ);
      this.ZJ = null;
    } 
  }
  
  public void ZS(Ztu8 paramZtu8) {
    this.Zx = true;
  }
  
  public void Zb(Ztu8 paramZtu8) {}
  
  public void ZQ(Ztu8 paramZtu8, Zs5n paramZs5n) {
    this.Zx = true;
  }
  
  public void ZP(Ztu8 paramZtu8, Zs5n paramZs5n) {
    this.Zx = true;
  }
  
  public void Ze(Ztu8 paramZtu8) {
    this.Zx = false;
    this.ZJ = paramZtu8.ZlP();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzr1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */