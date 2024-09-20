package burp;

import java.awt.Component;
import java.util.List;
import java.util.Optional;

public interface Zmgv {
  Zmzk Zod();
  
  default Zbr Zo3() {
    Zkyt zkyt = Ztud.ZJ(ZoO()).orElse(Zkyt.UNKNOWN);
    return Zbr.Zy(Zos(), zkyt);
  }
  
  default Zgsq Zoe() {
    Zbr zbr = Zo3();
    return Zxd9.ZT(zbr).or(this::lambda$getMessageProtocol$0).map(Zgsq::ZW).orElse(null);
  }
  
  Zstu Zos();
  
  Zstu ZoO();
  
  boolean ZoZ();
  
  long ZoB();
  
  Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x);
  
  List<Component> Zof();
  
  Zepe Zl(Component paramComponent);
  
  private Optional lambda$getMessageProtocol$0() {
    return Ztud.ZJ(ZoO());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmgv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */