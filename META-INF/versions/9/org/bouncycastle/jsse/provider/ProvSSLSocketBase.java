package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.PropertyUtils;
import org.bouncycastle.jsse.provider.SSLSocketUtil;

abstract class ProvSSLSocketBase extends SSLSocket implements BCSSLSocket {
  protected static final boolean provAssumeOriginalHostName = PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.client.assumeOriginalHostName", false);
  
  protected static final boolean provJdkTlsTrustNameService = PropertyUtils.getBooleanSystemProperty("jdk.tls.trustNameService", false);
  
  protected final Closeable socketCloser = (Closeable)new Object(this);
  
  protected final Map<HandshakeCompletedListener, AccessControlContext> listeners = Collections.synchronizedMap(new HashMap<>(4));
  
  public void addHandshakeCompletedListener(HandshakeCompletedListener paramHandshakeCompletedListener) {
    if (paramHandshakeCompletedListener == null)
      throw new IllegalArgumentException("'listener' cannot be null"); 
    this.listeners.put(paramHandshakeCompletedListener, AccessController.getContext());
  }
  
  protected void closeSocket() throws IOException {
    close();
  }
  
  public void connect(String paramString, int paramInt1, int paramInt2) throws IOException {
    setHost(paramString);
    connect(createInetSocketAddress(paramString, paramInt1), paramInt2);
  }
  
  public final boolean getOOBInline() throws SocketException {
    throw new SocketException("This method is ineffective, since sending urgent data is not supported by SSLSockets");
  }
  
  public void removeHandshakeCompletedListener(HandshakeCompletedListener paramHandshakeCompletedListener) {
    if (paramHandshakeCompletedListener == null)
      throw new IllegalArgumentException("'listener' cannot be null"); 
    if (null == this.listeners.remove(paramHandshakeCompletedListener))
      throw new IllegalArgumentException("'listener' is not registered"); 
  }
  
  public final void sendUrgentData(int paramInt) throws IOException {
    throw new SocketException("This method is not supported by SSLSockets");
  }
  
  public final void setOOBInline(boolean paramBoolean) throws SocketException {
    throw new SocketException("This method is ineffective, since sending urgent data is not supported by SSLSockets");
  }
  
  protected InetSocketAddress createInetSocketAddress(InetAddress paramInetAddress, int paramInt) throws IOException {
    return new InetSocketAddress(paramInetAddress, paramInt);
  }
  
  protected InetSocketAddress createInetSocketAddress(String paramString, int paramInt) throws IOException {
    return (null == paramString) ? new InetSocketAddress(InetAddress.getByName(null), paramInt) : new InetSocketAddress(paramString, paramInt);
  }
  
  protected void implBind(InetAddress paramInetAddress, int paramInt) throws IOException {
    bind(createInetSocketAddress(paramInetAddress, paramInt));
  }
  
  protected void implConnect(InetAddress paramInetAddress, int paramInt) throws IOException {
    connect(createInetSocketAddress(paramInetAddress, paramInt), 0);
  }
  
  protected void implConnect(String paramString, int paramInt) throws IOException, UnknownHostException {
    connect(createInetSocketAddress(paramString, paramInt), 0);
  }
  
  protected void notifyHandshakeCompletedListeners(SSLSession paramSSLSession) {
    Collection<Map.Entry<HandshakeCompletedListener, AccessControlContext>> collection = getHandshakeCompletedEntries();
    if (null == collection)
      return; 
    HandshakeCompletedEvent handshakeCompletedEvent = new HandshakeCompletedEvent(this, paramSSLSession);
    Object object = new Object(this, collection, handshakeCompletedEvent);
    SSLSocketUtil.handshakeCompleted((Runnable)object);
  }
  
  private Collection<Map.Entry<HandshakeCompletedListener, AccessControlContext>> getHandshakeCompletedEntries() {
    synchronized (this.listeners) {
      return this.listeners.isEmpty() ? null : new ArrayList<>(this.listeners.entrySet());
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvSSLSocketBase.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */