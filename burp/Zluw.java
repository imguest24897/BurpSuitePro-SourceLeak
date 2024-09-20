package burp;

import java.util.List;
import java.util.Locale;

class Zluw {
  private final Ztzq ZZ;
  
  private String ZO;
  
  Zluw(Ztzq paramZtzq) {
    this.ZZ = paramZtzq;
    this.ZO = "";
  }
  
  int ZC() {
    return Zv().size();
  }
  
  Zeu1 ZT(int paramInt) {
    return Zv().get(paramInt);
  }
  
  int ZL(Zeu1 paramZeu1) {
    return Zv().indexOf(paramZeu1);
  }
  
  void Zn(String paramString) {
    this.ZO = paramString.toLowerCase(Locale.UK);
  }
  
  private List<Zeu1> Zv() {
    return this.ZZ.ZT(this::lambda$filteredConfigs$0);
  }
  
  private boolean lambda$filteredConfigs$0(Zeu1 paramZeu1) {
    return (paramZeu1.ZN() != null && paramZeu1.ZN().toLowerCase(Locale.UK).contains(this.ZO));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zluw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */