package net.portswigger;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLSocketFactory;

class Z_e implements Zcd {
  final Zz2 ZU;
  
  final Zvz ZJ;
  
  Z_e(Zvz paramZvz, Zz2 paramZz2) {}
  
  public Socket Zi(Socket paramSocket, String paramString, int paramInt) throws IOException {
    SSLSocketFactory sSLSocketFactory = Zzl.ZN(null, paramString, this.ZJ.Zg.<X509Certificate>toArray(new X509Certificate[0]), this.ZJ.ZC).getSocketFactory();
    if (paramSocket == null) {
      Socket socket = sSLSocketFactory.createSocket(paramString, paramInt);
      this.ZU.Zq(socket);
      return socket;
    } 
    return sSLSocketFactory.createSocket(paramSocket, paramString, paramInt, true);
  }
  
  public Socket ZX(InetAddress paramInetAddress, String paramString, int paramInt) throws IOException {
    Socket socket = Zzl.ZN(null, paramString, this.ZJ.Zg.<X509Certificate>toArray(new X509Certificate[0]), this.ZJ.ZC).getSocketFactory().createSocket(paramInetAddress, paramInt);
    this.ZU.Zq(socket);
    return socket;
  }
  
  public boolean ZD() {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Z_e.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */