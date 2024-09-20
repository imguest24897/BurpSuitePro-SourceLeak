package burp;

class Zx0r {
  private final Zg94 Zl;
  
  private final Zx5h ZL;
  
  private Zx0r(Zg94 paramZg94, Zx5h paramZx5h) {
    this.Zl = paramZg94;
    this.ZL = paramZx5h;
  }
  
  String ZE() {
    int i = this.Zl.ZEi();
    Zmx zmx = this.Zl.ZI().get(i);
    return ZZ(zmx.ZC());
  }
  
  String ZZ(boolean paramBoolean) {
    int i = this.Zl.ZEi();
    Zmx zmx = this.Zl.ZI().get(i);
    int j = zmx.Z_();
    return this.ZL.Zu(j).ZC(1, paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx0r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */