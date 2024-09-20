package burp;

import java.awt.Component;
import java.io.IOException;
import java.io.Writer;

public interface Zlhn extends Zgkc {
  String ZmO();
  
  String Zmz();
  
  Zrde ZmQ();
  
  Zefg<Zzi8> Zmq();
  
  String Zmm();
  
  Component ZL(Zrdb paramZrdb);
  
  void Zb(Writer paramWriter, Zsh9 paramZsh9, Zefg<Zxtl> paramZefg) throws IOException;
  
  void Zw(Zvon paramZvon) throws IOException;
  
  default Zehu Zu2() {
    return new Zsbr(this);
  }
  
  default void Zi(Zz_r paramZz_r) {
    ZmQ().Zi(paramZz_r);
  }
  
  default boolean ZR(Zbx0 paramZbx0) {
    return ZmQ().ZR(paramZbx0);
  }
  
  default void Zg(Zb03 paramZb03) {
    ZmQ().Zg(paramZb03);
  }
  
  default int Zuj() {
    return 1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlhn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */