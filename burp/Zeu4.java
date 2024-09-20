package burp;

import java.util.Optional;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public interface Zeu4<T extends Zgpi> {
  Zm31[] Zc();
  
  Zllo<T> ZI();
  
  Zeu4<? extends T> Z_(byte paramByte);
  
  byte Z_();
  
  boolean Zs();
  
  default byte ZD() {
    return 0;
  }
  
  default void ZG(Zkit paramZkit, long paramLong, int paramInt, T paramT) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  default Optional<Zgpi<?>> Zr(Zkit paramZkit, Zgpi<?> paramZgpi) {
    return Optional.empty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeu4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */