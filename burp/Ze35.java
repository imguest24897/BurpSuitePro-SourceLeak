package burp;

public class Ze35 extends Ze3y {
  private final Zgcq ZC;
  
  public Ze35(Zes3 paramZes3) {
    this.ZC = (Zgcq)paramZes3.Zq();
  }
  
  public void Zu(Zgcu paramZgcu) {
    Za(paramZgcu);
    if (paramZgcu.Zd() == null) {
      Zk(paramZgcu);
      if (paramZgcu.Zd() == null)
        ZI(paramZgcu); 
    } 
  }
  
  private void Za(Zgcu paramZgcu) {
    if (Zl19.ZR(paramZgcu.ZI())) {
      Zb3t zb3t = paramZgcu.ZI().ZI();
      if (ZK(zb3t, paramZgcu)) {
        Zgc0 zgc0 = (Zgc0)zb3t.ZC().get(0);
        paramZgcu.ZY(new Zgcl(paramZgcu, zgc0));
      } 
    } 
  }
  
  private boolean ZK(Zb3t paramZb3t, Zgcu paramZgcu) {
    return (Zl19.ZZ(paramZb3t) && paramZb3t.ZC().size() == 3 && ((Zb3t)paramZb3t.ZC().get(2)).ZC().get(0) == paramZgcu);
  }
  
  private void Zk(Zgcu paramZgcu) {
    Ze0x ze0x = new Ze0x(paramZgcu);
    Ze18 ze18 = new Ze18(ze0x);
    Zrqv zrqv = new Zrqv(paramZgcu.ZI());
    boolean bool = Zrai.ZH();
    for (Zb3t zb3t : zrqv) {
      zb3t.Zm(ze18);
      if (ze18.ZA() != null) {
        paramZgcu.ZY(ze18.ZA());
        if (!bool)
          continue; 
        break;
      } 
      continue;
      if (!bool)
        break; 
    } 
  }
  
  private void ZI(Zgcu paramZgcu) {
    Zgcz zgcz = new Zgcz(paramZgcu.Zi());
    this.ZC.ZI(zgcz);
    paramZgcu.ZY(zgcz);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze35.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */