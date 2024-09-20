package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.ContextData;
import org.bouncycastle.jsse.provider.ProvSSLParameters;
import org.bouncycastle.jsse.provider.ProvSSLSocketDirect;
import org.bouncycastle.jsse.provider.ProvSSLSocketDirect_9;
import org.bouncycastle.jsse.provider.ProvSSLSocketWrap;
import org.bouncycastle.jsse.provider.ProvSSLSocketWrap_9;
import org.bouncycastle.jsse.provider.SSLParametersUtil;
import org.bouncycastle.jsse.provider.SSLSessionUtil;

abstract class SSLSocketUtil {
  private static AtomicInteger threadNumber = new AtomicInteger();
  
  static ProvSSLSocketDirect create(ContextData paramContextData, boolean paramBoolean1, boolean paramBoolean2, ProvSSLParameters paramProvSSLParameters) {
    return (ProvSSLSocketDirect)new ProvSSLSocketDirect_9(paramContextData, paramBoolean1, paramBoolean2, paramProvSSLParameters);
  }
  
  static ProvSSLSocketDirect create(ContextData paramContextData) {
    return (ProvSSLSocketDirect)new ProvSSLSocketDirect_9(paramContextData);
  }
  
  static ProvSSLSocketDirect create(ContextData paramContextData, InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2) throws IOException {
    return (ProvSSLSocketDirect)new ProvSSLSocketDirect_9(paramContextData, paramInetAddress1, paramInt1, paramInetAddress2, paramInt2);
  }
  
  static ProvSSLSocketDirect create(ContextData paramContextData, InetAddress paramInetAddress, int paramInt) throws IOException {
    return (ProvSSLSocketDirect)new ProvSSLSocketDirect_9(paramContextData, paramInetAddress, paramInt);
  }
  
  static ProvSSLSocketDirect create(ContextData paramContextData, String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2) throws IOException, UnknownHostException {
    return (ProvSSLSocketDirect)new ProvSSLSocketDirect_9(paramContextData, paramString, paramInt1, paramInetAddress, paramInt2);
  }
  
  static ProvSSLSocketDirect create(ContextData paramContextData, String paramString, int paramInt) throws IOException, UnknownHostException {
    return (ProvSSLSocketDirect)new ProvSSLSocketDirect_9(paramContextData, paramString, paramInt);
  }
  
  static ProvSSLSocketWrap create(ContextData paramContextData, Socket paramSocket, InputStream paramInputStream, boolean paramBoolean) throws IOException {
    return (ProvSSLSocketWrap)new ProvSSLSocketWrap_9(paramContextData, paramSocket, paramInputStream, paramBoolean);
  }
  
  static ProvSSLSocketWrap create(ContextData paramContextData, Socket paramSocket, String paramString, int paramInt, boolean paramBoolean) throws IOException {
    return (ProvSSLSocketWrap)new ProvSSLSocketWrap_9(paramContextData, paramSocket, paramString, paramInt, paramBoolean);
  }
  
  static void handshakeCompleted(Runnable paramRunnable) {
    String str = "BCJSSE-HandshakeCompleted-" + Integer.toUnsignedString(threadNumber.getAndIncrement());
    (new Thread(null, paramRunnable, str, 0L, false)).start();
  }
  
  static BCExtendedSSLSession importHandshakeSession(SSLSocket paramSSLSocket) {
    if (paramSSLSocket instanceof BCSSLSocket)
      return ((BCSSLSocket)paramSSLSocket).getBCHandshakeSession(); 
    if (null != paramSSLSocket) {
      SSLSession sSLSession = paramSSLSocket.getHandshakeSession();
      if (null != sSLSession)
        return SSLSessionUtil.importSSLSession(sSLSession); 
    } 
    return null;
  }
  
  static BCSSLParameters importSSLParameters(SSLSocket paramSSLSocket) {
    if (paramSSLSocket instanceof BCSSLSocket)
      return ((BCSSLSocket)paramSSLSocket).getParameters(); 
    if (null == paramSSLSocket)
      return null; 
    SSLParameters sSLParameters = paramSSLSocket.getSSLParameters();
    if (null == sSLParameters)
      throw new RuntimeException("SSLSocket.getSSLParameters returned null"); 
    return SSLParametersUtil.importSSLParameters(sSLParameters);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\SSLSocketUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */