package burp;

class Zxl8 implements Ztm2 {
  private final Zbll Zy;
  
  final Zz1l ZG;
  
  Zxl8(Zz1l paramZz1l, Zbll paramZbll) {
    this.Zy = paramZbll;
  }
  
  public Zbll Zg() {
    if (this.ZG.ZN == Zk7g.SPOOFABLE_CLIENT_IP && this.ZG.Zh.ZG() == Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_FOR_PAYLOAD) {
      Zewn zewn = this.ZG.Zt.ZT();
      Zbll zbll = Zbll.Zu(zewn);
      this.ZG.Zw(zbll);
      if (!zbll.ZP.isEmpty())
        return zbll; 
    } 
    return this.Zy;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxl8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */