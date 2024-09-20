package burp;

class Zmsd implements Ztmr {
  private final Zeu4<? extends Zgna> ZJ;
  
  final Zzj ZD;
  
  Zmsd(Zzj paramZzj, Zeu4<? extends Zgna> paramZeu4) {
    this.ZJ = paramZeu4;
  }
  
  public void Zk(long paramLong) {
    Zgna zgna1 = this.ZD.Zu.<Zgna>Zo(paramLong, (Zeu4)this.ZJ);
    Zgna zgna2 = this.ZD.ZM.<Zgna>Zw(zgna1);
    if (zgna2 != null)
      this.ZD.ZO.ZV_().add(zgna2); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmsd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */