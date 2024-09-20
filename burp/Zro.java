package burp;

import java.util.Objects;
import java.util.Optional;
import net.portswigger.Zda;

class Zro implements Zda {
  final Zzw4 ZE;
  
  Zro(Zzw4 paramZzw4) {}
  
  public boolean ZP() {
    Objects.requireNonNull(this.ZE.ZI);
    return ((Boolean)Optional.<Zxpn>ofNullable(this.ZE.ZU).map(Zxpn::Zs).map(Zbqx::Zqj).orElseGet(this.ZE.ZI::Zqj)).booleanValue();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zro.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */