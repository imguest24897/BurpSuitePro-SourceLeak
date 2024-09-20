package burp;

import java.net.Socket;

public class Zko_ implements Zz0u {
  private final Zxo0 ZO;
  
  private final Zl3v ZR;
  
  private final long ZU;
  
  public Zko_(Zxo0 paramZxo0, Zl3v paramZl3v, long paramLong) {
    this.ZO = paramZxo0;
    this.ZR = paramZl3v;
    this.ZU = paramLong;
  }
  
  public Runnable Zo(Socket paramSocket, Zb25 paramZb25) {
    return new Zr_(paramSocket, paramZb25, this.ZO, this.ZR, this.ZU);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zko_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */