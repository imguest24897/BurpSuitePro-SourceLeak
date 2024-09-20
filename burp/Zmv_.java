package burp;

class Zmv_ implements Zla3 {
  private final Zkit ZN;
  
  private final Zlu6 Z_;
  
  Zmv_(Zkit paramZkit, Zlu6 paramZlu6) {
    this.ZN = paramZkit;
    this.Z_ = paramZlu6;
  }
  
  public void Zl(Zzir paramZzir) {
    Zsph zsph = paramZzir.ZvA();
    if (zsph == null) {
      Zl3g.Zk(this.ZN, paramZzir);
      this.Z_.Zr();
      return;
    } 
    if (zsph.ZsI() == null) {
      Ztp6.ZI(this.ZN, zsph);
      this.Z_.Zr();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmv_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */