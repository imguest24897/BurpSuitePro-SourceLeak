package burp;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Ztqf implements Zxxr {
  private final Zgb6 ZG;
  
  private final Zrgd ZF;
  
  private final Zr1j Zr;
  
  private final Zkh7 ZO;
  
  public Ztqf(Zgb6 paramZgb6, Zrgd paramZrgd, Zr1j paramZr1j, Zkh7 paramZkh7) {
    this.ZG = paramZgb6;
    this.ZF = paramZrgd;
    int i = Ze_m.ZW();
    this.Zr = paramZr1j;
    this.ZO = paramZkh7;
    if (Zbqc.Zwu() == null)
      Ze_m.Zt(++i); 
  }
  
  public Socket ZK(Zmzk paramZmzk, Zrps paramZrps) throws IOException {
    int i = Ze_m.ZS();
    if (paramZrps.ZT()) {
      InetAddress inetAddress1 = paramZmzk.Zx(this.ZG, this.ZF, this.Zr, this.ZO);
      try {
      
      } catch (IOException iOException) {
        throw a(null);
      } 
      InetSocketAddress inetSocketAddress1 = (inetAddress1 == null) ? new InetSocketAddress(paramZmzk.ZJ1(), paramZmzk.ZJO()) : new InetSocketAddress(inetAddress1, paramZmzk.ZJO());
      return ZF(new Socket(), paramZrps, inetSocketAddress1);
    } 
    if (this.ZG.ZfU()) {
      InetSocketAddress inetSocketAddress1 = new InetSocketAddress(this.ZG.Zfp(), this.ZG.ZEm());
      Proxy proxy = new Proxy(Proxy.Type.SOCKS, inetSocketAddress1);
      InetSocketAddress inetSocketAddress2 = Zi(paramZmzk);
      return ZF(new Socket(proxy), paramZrps, inetSocketAddress2);
    } 
    InetAddress inetAddress = paramZmzk.Zx(this.ZG, this.ZF, this.Zr, this.ZO);
    try {
      if (inetAddress == null)
        throw new UnknownHostException(paramZmzk.ZJ1()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, paramZmzk.ZJO());
    if (i != 0)
      Zbqc.Zr(new Zbqc[4]); 
    return ZF(new Socket(), paramZrps, inetSocketAddress);
  }
  
  private static Socket ZF(Socket paramSocket, Zrps paramZrps, SocketAddress paramSocketAddress) throws IOException {
    try {
      paramSocket.connect(paramSocketAddress, paramZrps.Zu());
      return paramSocket;
    } catch (SocketTimeoutException socketTimeoutException) {
      Zah.Zl(socketTimeoutException, Zk_.RETHROWN);
      throw new ConnectException(socketTimeoutException.getMessage());
    } 
  }
  
  private InetSocketAddress Zi(Zmzk paramZmzk) {
    try {
      if (!this.ZG.ZfU() || !this.ZG.ZfS())
        try {
          InetAddress inetAddress = paramZmzk.Zx(this.ZG, this.ZF, this.Zr, this.ZO);
          if (inetAddress != null)
            return new InetSocketAddress(inetAddress, paramZmzk.ZJO()); 
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.UNEXPECTED);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    return InetSocketAddress.createUnresolved(paramZmzk.ZJ1(), paramZmzk.ZJO());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztqf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */