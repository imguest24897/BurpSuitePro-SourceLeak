package org.bouncycastle.jsse.util;

import java.net.Socket;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.jsse.BCSSLSocket;

public class SetHostSocketFactory extends CustomSSLSocketFactory {
  private static final Logger LOG = Logger.getLogger(SetHostSocketFactory.class.getName());
  
  protected static final ThreadLocal<SetHostSocketFactory> threadLocal = new ThreadLocal<>();
  
  protected final URL url;
  
  public static SocketFactory getDefault() {
    SSLSocketFactory sSLSocketFactory = threadLocal.get();
    return (null != sSLSocketFactory) ? sSLSocketFactory : SSLSocketFactory.getDefault();
  }
  
  public SetHostSocketFactory(SSLSocketFactory paramSSLSocketFactory, URL paramURL) {
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
    if (this.url != null && paramSocket instanceof BCSSLSocket) {
      BCSSLSocket bCSSLSocket = (BCSSLSocket)paramSocket;
      String str = this.url.getHost();
      if (str != null) {
        LOG.fine("Setting host on socket: " + str);
        bCSSLSocket.setHost(str);
      } 
    } 
    return paramSocket;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jss\\util\SetHostSocketFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */