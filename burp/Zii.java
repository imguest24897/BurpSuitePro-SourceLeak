package burp;

class Zii implements Ztm2 {
  private final Zbll Zh;
  
  final Zz1l ZS;
  
  Zii(Zz1l paramZz1l, Zbll paramZbll) {
    this.Zh = paramZbll;
  }
  
  public Zbll Zg() {
    if (this.ZS.ZN == Zk7g.SPOOFABLE_CLIENT_IP && this.ZS.Zh.ZG() == Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_FOR_PAYLOAD) {
      Zewn zewn = this.ZS.Zt.Zo();
      Zbll zbll = Zbll.Zu(zewn);
      this.ZS.Zw(zbll);
      if (!zbll.ZP.isEmpty())
        return zbll; 
    } 
    return this.Zh;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zii.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */