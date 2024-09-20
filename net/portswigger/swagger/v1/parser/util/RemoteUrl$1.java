package net.portswigger.swagger.v1.parser.util;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

class RemoteUrl$1 implements X509TrustManager {
  public X509Certificate[] getAcceptedIssuers() {
    return null;
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) {}
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parse\\util\RemoteUrl$1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */