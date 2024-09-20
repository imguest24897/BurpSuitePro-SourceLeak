package burp;

import java.util.List;

class Zmta implements Zznq {
  final List ZK;
  
  Zmta(Zr7o paramZr7o, List paramList) {}
  
  public void ZS(String paramString) {
    this.ZK.forEach(paramString::lambda$filterApplied$0);
  }
  
  public void Ze(String paramString) {
    this.ZK.stream().map(Ztm_::ZcW).forEach(Zspz::Zlm);
  }
  
  private static void lambda$filterApplied$0(String paramString, Ztm_ paramZtm_) {
    Zbqc[] arrayOfZbqc = Zr7o.Z_z();
    if (paramString.equals(paramZtm_.Zcp().ZZ())) {
      paramZtm_.ZcW().Zlt();
      if (arrayOfZbqc == null) {
        paramZtm_.ZcW().Zlm();
        return;
      } 
      return;
    } 
    paramZtm_.ZcW().Zlm();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmta.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */