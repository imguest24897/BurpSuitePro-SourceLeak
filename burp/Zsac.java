package burp;

import java.util.List;

class Zsac {
  private final Zey3 ZT;
  
  private final Ztdc ZZ;
  
  private final Ztai Zm;
  
  Zsac(Zey3 paramZey3, Ztdc paramZtdc, Ztai paramZtai) {
    this.ZT = paramZey3;
    this.ZZ = paramZtdc;
    this.Zm = paramZtai;
  }
  
  void ZC(Zmzk paramZmzk, List<String> paramList) {
    int[] arrayOfInt = Ztdc.Zt();
    if (this.Zm.Zr(Zzu2.CROSS_ORIGIN_RESOURCE_SHARING) || this.Zm.Zr(Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_UNTRUSTED_ORIGIN_TRUSTED) || this.Zm.Zr(Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_ARBITRARY_ORIGIN) || this.Zm.Zr(Zzu2.CROSS_ORIGIN_RESOURCE_SHARING_ALL_SUBDOMAINS_TRUSTED)) {
      Zeye zeye = this.ZT.Zb(Zswd.ZM(paramZmzk, paramList));
      if (zeye.ZX()) {
        this.ZZ.ZM(zeye);
        Zw(zeye, paramZmzk.ZJZ());
        if (arrayOfInt == null) {
          ZI();
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    ZI();
  }
  
  public void Zw(Zeye paramZeye, boolean paramBoolean) {
    (new Ztl2(this.ZT, this.ZZ, this.Zm, paramZeye, paramBoolean)).ZG();
  }
  
  private void ZI() {
    Zeye zeye = this.ZT.Zb(Zs31.Zl);
    if (this.ZZ.Zp(zeye))
      this.ZZ.Zs(zeye); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsac.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */