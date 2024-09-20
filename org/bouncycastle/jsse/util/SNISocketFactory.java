package org.bouncycastle.jsse.util;

import java.net.Socket;
import java.net.URL;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.jsse.BCSNIHostName;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

public class SNISocketFactory extends CustomSSLSocketFactory {
  private static final Logger LOG = Logger.getLogger(SNISocketFactory.class.getName());
  
  protected static final ThreadLocal<SNISocketFactory> threadLocal = new ThreadLocal<>();
  
  protected final URL url;
  
  public static SocketFactory getDefault() {
    SSLSocketFactory sSLSocketFactory = threadLocal.get();
    return (null != sSLSocketFactory) ? sSLSocketFactory : SSLSocketFactory.getDefault();
  }
  
  public SNISocketFactory(SSLSocketFactory paramSSLSocketFactory, URL paramURL) {
    super(paramSSLSocketFactory);
    this.url = paramURL;
  }
  
  public <V> V call(Callable<V> paramCallable) throws Exception {
    try {
      threadLocal.set(this);
      return paramCallable.call();
    } finally {
      threadLocal.remove();
    } 
  }
  
  protected Socket configureSocket(Socket paramSocket) {
    if (paramSocket instanceof BCSSLSocket) {
      BCSSLSocket bCSSLSocket = (BCSSLSocket)paramSocket;
      BCSNIHostName bCSNIHostName = getBCSNIHostName();
      if (null != bCSNIHostName) {
        LOG.fine("Setting SNI on socket: " + bCSNIHostName);
        BCSSLParameters bCSSLParameters = new BCSSLParameters();
        bCSSLParameters.setServerNames(Collections.singletonList(bCSNIHostName));
        bCSSLSocket.setParameters(bCSSLParameters);
      } 
    } 
    return paramSocket;
  }
  
  protected BCSNIHostName getBCSNIHostName() {
    return SNIUtil.getBCSNIHostName(this.url);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jss\\util\SNISocketFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */