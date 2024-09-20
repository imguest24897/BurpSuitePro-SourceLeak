package burp;

import java.util.Objects;
import java.util.Optional;

public interface Zg0y {
  static Zg0y ZF(Zl7h paramZl7h, Zr69 paramZr69, Zrp6 paramZrp6) {
    if (paramZr69.Zt()) {
      Objects.requireNonNull(paramZr69);
      return new Zs4p(paramZl7h.ZVe(), paramZl7h.ZVz(), paramZl7h.ZVv(), paramZl7h.ZV4(), paramZr69::Ze, paramZr69.ZD(), paramZrp6);
    } 
    Objects.requireNonNull(paramZr69);
    return new Zs4s(paramZl7h.ZVe(), paramZl7h.ZVz(), paramZl7h.ZVv(), paramZl7h.ZV4(), paramZr69::Ze, paramZr69.ZD(), paramZrp6);
  }
  
  Optional<Ztc6> ZE(Zx51 paramZx51);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg0y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */