package org.bouncycastle.jsse.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class URLConnectionUtil {
  protected final SSLSocketFactory sslSocketFactory;
  
  public URLConnectionUtil() {
    this(null);
  }
  
  public URLConnectionUtil(SSLSocketFactory paramSSLSocketFactory) {
    this.sslSocketFactory = paramSSLSocketFactory;
  }
  
  public URLConnection openConnection(URL paramURL) throws IOException {
    return configureConnection(paramURL, paramURL.openConnection());
  }
  
  public URLConnection openConnection(URL paramURL, Proxy paramProxy) throws IOException {
    return configureConnection(paramURL, paramURL.openConnection(paramProxy));
  }
  
  public InputStream openInputStream(URL paramURL) throws IOException {
    return openConnection(paramURL).getInputStream();
  }
  
  public InputStream openStream(URL paramURL) throws IOException {
    return openConnection(paramURL).getInputStream();
  }
  
  protected URLConnection configureConnection(URL paramURL, URLConnection paramURLConnection) {
    if (!(paramURLConnection instanceof HttpsURLConnection))
      return paramURLConnection; 
    HttpsURLConnection httpsURLConnection = (HttpsURLConnection)paramURLConnection;
    SSLSocketFactory sSLSocketFactory = this.sslSocketFactory;
    if (null == sSLSocketFactory)
      sSLSocketFactory = httpsURLConnection.getSSLSocketFactory(); 
    httpsURLConnection.setSSLSocketFactory(createSSLSocketFactory(sSLSocketFactory, paramURL));
    return httpsURLConnection;
  }
  
  protected SSLSocketFactory createSSLSocketFactory(SSLSocketFactory paramSSLSocketFactory, URL paramURL) {
    return new SetHostSocketFactory(paramSSLSocketFactory, paramURL);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jss\\util\URLConnectionUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */