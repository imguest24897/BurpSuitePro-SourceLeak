package net.portswigger;

import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;

class Zss implements Znf {
  final SSLContext Zi;
  
  final Zqk ZQ;
  
  Zss(Zqk paramZqk, SSLContext paramSSLContext) {}
  
  public ServerSocketFactory Zd() {
    return this.Zi.getServerSocketFactory();
  }
  
  public boolean Zy() {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zss.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */