package burp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Zzd8 {
  private final Zlhe Zy;
  
  private final Ztwa ZU;
  
  private final Zl3v Zv;
  
  public Zzd8(Zlhe paramZlhe, Ztwa paramZtwa, Zl3v paramZl3v) {
    this.Zy = paramZlhe;
    this.ZU = paramZtwa;
    this.Zv = paramZl3v;
  }
  
  public Zsfk ZP(DatagramSocket paramDatagramSocket, DatagramPacket paramDatagramPacket) {
    return new Zsfk(paramDatagramPacket, this.Zy, paramDatagramSocket, this.ZU, this.Zv);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzd8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */