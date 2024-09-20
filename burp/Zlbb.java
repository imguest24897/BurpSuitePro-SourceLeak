package burp;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

class Zlbb implements Zeu6 {
  final Zkuw Z_;
  
  Zlbb(Zkuw paramZkuw) {}
  
  public void ZR(Zmzk paramZmzk, SSLSocket paramSSLSocket) {
    this.Z_.ZS.ZC().ZR(paramZmzk, paramSSLSocket);
    Zxtv zxtv = this.Z_.Zw.ZF(this.Z_.ZR, paramZmzk);
    String[] arrayOfString = zxtv.Ze();
    SSLParameters sSLParameters = paramSSLSocket.getSSLParameters();
    sSLParameters.setApplicationProtocols(arrayOfString);
    paramSSLSocket.setSSLParameters(sSLParameters);
  }
  
  public void Zf(Zmzk paramZmzk, SSLSession paramSSLSession) throws SSLException {
    this.Z_.ZS.ZC().Zf(paramZmzk, paramSSLSession);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlbb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */