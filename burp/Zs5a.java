package burp;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zs5a implements Ztae {
  private static final AtomicInteger Zk = new AtomicInteger();
  
  private final Ztwv ZI;
  
  public Zs5a(Ztwv paramZtwv) {
    this.ZI = paramZtwv;
  }
  
  public Zxym ZQ(Zefx paramZefx, Socket paramSocket1, Socket paramSocket2) {
    try {
      Zrg6 zrg6 = new Zrg6(paramSocket1, paramSocket2, this.ZI);
      zrg6.ZI(new Zs2v(this, zrg6));
      return zrg6;
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      throw new RuntimeException(iOException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs5a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */