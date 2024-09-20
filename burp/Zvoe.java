package burp;

class Zvoe implements Zewu {
  private final Zewu ZN;
  
  Zvoe(Zewu paramZewu) {
    this.ZN = paramZewu;
  }
  
  public void Zi(Zgpi paramZgpi1, Zgpi paramZgpi2) {
    boolean bool = Zlu6.ZA();
    if (paramZgpi1 instanceof Zxsr) {
      this.ZN.Zi(paramZgpi1, paramZgpi2);
      if (bool) {
        ((Zni)paramZgpi1).ZS((Zxsr)paramZgpi2);
        return;
      } 
      return;
    } 
    ((Zni)paramZgpi1).ZS((Zxsr)paramZgpi2);
  }
  
  public Long ZY(Zgpi paramZgpi, Zkit paramZkit) {
    if (paramZgpi instanceof Zxsr)
      return this.ZN.ZY(paramZgpi, paramZkit); 
    Zxsr zxsr = ((Zni)paramZgpi).Zp8();
    return (zxsr == null) ? null : Long.valueOf(zxsr.ZXU());
  }
  
  public void Zk() {
    this.ZN.Zk();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvoe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */