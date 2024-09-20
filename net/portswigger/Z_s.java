package net.portswigger;

class Z_s extends Z_j {
  private final Zv0 ZL;
  
  public Z_s(Zv0 paramZv0) {
    this.ZL = paramZv0;
  }
  
  public void ZC(Zrmr paramZrmr) {
    this.ZL.Zg(Zt3.STRING);
  }
  
  public void ZY(Zs7 paramZs7) {
    this.ZL.Zg(Zt3.INTEGER);
  }
  
  public void Zz(Zzz paramZzz) {
    this.ZL.Zg(Zt3.NUMBER);
  }
  
  public void Zr(Zt0 paramZt0) {
    this.ZL.Zg(Zt3.BOOLEAN);
  }
  
  public void ZI(Zoj paramZoj) {
    this.ZL.ZY(true);
    ((Zms)paramZoj.ZQK().get(0)).ZF(this);
  }
  
  public void Zm(Zlq paramZlq) {
    this.ZL.ZY(true);
    paramZlq.ZDP().ZF(this);
  }
  
  protected void Zq(String paramString) {
    this.ZL.ZR(false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Z_s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */