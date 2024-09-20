package burp;

class Zrql implements Ztmr {
  private final Zkit Zh;
  
  private final Ztg8 Zq;
  
  private final Zeh6 Zg;
  
  Zrql(Zkit paramZkit, Ztg8 paramZtg8, Zeh6 paramZeh6) {
    this.Zh = paramZkit;
    this.Zq = paramZtg8;
    this.Zg = paramZeh6;
  }
  
  public void Zk(long paramLong) {
    Zlx1 zlx11 = this.Zh.<Zlx1>Zo(paramLong, Zlx1.ZY);
    Zlx1 zlx12 = this.Zq.<Zlx1>Zw(zlx11);
    if (zlx12 != null) {
      zlx12.Zy(null);
      this.Zg.Ziv().add(zlx12);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrql.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */