package burp;

class Zg4t implements Ztkw<Zrn3> {
  final Zbc6 Zt;
  
  Zg4t(Zbc6 paramZbc6) {}
  
  public void Zn(Zrn3 paramZrn3) {
    this.Zt.ZU.stream().map(Zg4t::lambda$quickFilterActivated$0).forEach(paramZrn3::lambda$quickFilterActivated$1);
  }
  
  public void ZQ(Zrn3 paramZrn3) {
    this.Zt.ZU.stream().map(Zg4t::lambda$quickFilterDeactivated$2).forEach(paramZrn3::lambda$quickFilterDeactivated$3);
  }
  
  private static void lambda$quickFilterDeactivated$3(Zrn3 paramZrn3, Ztkw<Zrn3> paramZtkw) {
    paramZtkw.ZQ(paramZrn3);
  }
  
  private static Ztkw lambda$quickFilterDeactivated$2(Ztkw paramZtkw) {
    return paramZtkw;
  }
  
  private static void lambda$quickFilterActivated$1(Zrn3 paramZrn3, Ztkw<Zrn3> paramZtkw) {
    paramZtkw.Zn(paramZrn3);
  }
  
  private static Ztkw lambda$quickFilterActivated$0(Ztkw paramZtkw) {
    return paramZtkw;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg4t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */