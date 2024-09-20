package net.portswigger.swagger.v1.parser.util;

import java.net.URLConnection;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

class RemoteUrl$3 implements RemoteUrl$ConnectionConfigurator {
  final SSLSocketFactory val$sf;
  
  final HostnameVerifier val$trustAllNames;
  
  public void process(URLConnection paramURLConnection) {
    if (paramURLConnection instanceof HttpsURLConnection) {
      HttpsURLConnection httpsURLConnection = (HttpsURLConnection)paramURLConnection;
      httpsURLConnection.setSSLSocketFactory(sf);
      httpsURLConnection.setHostnameVerifier(trustAllNames);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parse\\util\RemoteUrl$3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */