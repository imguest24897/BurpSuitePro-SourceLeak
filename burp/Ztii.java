package burp;

class Ztii implements Ztmr {
  private final Zkit Zf;
  
  private final Ztg8 ZT;
  
  private final Zlod ZW;
  
  Ztii(Zkit paramZkit, Ztg8 paramZtg8, Zlod paramZlod) {
    this.Zf = paramZkit;
    this.ZT = paramZtg8;
    this.ZW = paramZlod;
  }
  
  public void Zk(long paramLong) {
    Zzh2 zzh21 = this.Zf.<Zzh2>Zo(paramLong, Zzh2.ZH);
    Zzh2 zzh22 = this.ZT.<Zzh2>Zw(zzh21);
    if (zzh22 != null)
      this.ZW.ZGW().add(zzh22); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztii.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */