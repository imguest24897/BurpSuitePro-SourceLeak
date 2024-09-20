package burp;

import java.net.Socket;
import java.util.List;

public class Zg07 implements Zz0u {
  private final Zlhe Zd;
  
  private final Zl3v Zu;
  
  private final Zx5k ZA;
  
  private final List<String> Zq;
  
  private final long Zl;
  
  public Zg07(Zlhe paramZlhe, Zl3v paramZl3v, Zx5k paramZx5k, List<String> paramList, long paramLong) {
    this.Zd = paramZlhe;
    this.Zu = paramZl3v;
    this.ZA = paramZx5k;
    this.Zq = paramList;
    this.Zl = paramLong;
  }
  
  public Runnable Zo(Socket paramSocket, Zb25 paramZb25) {
    return new Zsx2(paramZb25, paramSocket, this.Zd, this.Zu, this.ZA, this.Zq, this.Zl);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg07.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */