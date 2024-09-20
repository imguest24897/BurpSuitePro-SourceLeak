package org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
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

abstract class SSLSocketUtil {
  private static AtomicInteger threadNumber = new AtomicInteger();
  
  private static final Method getHandshakeSession;
  
  private static final Method getSSLParameters;
  
  private static final boolean useSocket8;
  
  static ProvSSLSocketDirect create(ContextData paramContextData, boolean paramBoolean1, boolean paramBoolean2, ProvSSLParameters paramProvSSLParameters) {
    return useSocket8 ? new ProvSSLSocketDirect_8(paramContextData, paramBoolean1, paramBoolean2, paramProvSSLParameters) : new ProvSSLSocketDirect(paramContextData, paramBoolean1, paramBoolean2, paramProvSSLParameters);
  }
  
  static ProvSSLSocketDirect create(ContextData paramContextData) {
    return useSocket8 ? new ProvSSLSocketDirect_8(paramContextData) : new ProvSSLSocketDirect(paramContextData);
  }
  
  static ProvSSLSocketDirect create(ContextData paramContextData, InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2) throws IOException {
    return useSocket8 ? new ProvSSLSocketDirect_8(paramContextData, paramInetAddress1, paramInt1, paramInetAddress2, paramInt2) : new ProvSSLSocketDirect(paramContextData, paramInetAddress1, paramInt1, paramInetAddress2, paramInt2);
  }
  
  static ProvSSLSocketDirect create(ContextData paramContextData, InetAddress paramInetAddress, int paramInt) throws IOException {
    return useSocket8 ? new ProvSSLSocketDirect_8(paramContextData, paramInetAddress, paramInt) : new ProvSSLSocketDirect(paramContextData, paramInetAddress, paramInt);
  }
  
  static ProvSSLSocketDirect create(ContextData paramContextData, String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2) throws IOException, UnknownHostException {
    return useSocket8 ? new ProvSSLSocketDirect_8(paramContextData, paramString, paramInt1, paramInetAddress, paramInt2) : new ProvSSLSocketDirect(paramContextData, paramString, paramInt1, paramInetAddress, paramInt2);
  }
  
  static ProvSSLSocketDirect create(ContextData paramContextData, String paramString, int paramInt) throws IOException, UnknownHostException {
    return useSocket8 ? new ProvSSLSocketDirect_8(paramContextData, paramString, paramInt) : new ProvSSLSocketDirect(paramContextData, paramString, paramInt);
  }
  
  static ProvSSLSocketWrap create(ContextData paramContextData, Socket paramSocket, InputStream paramInputStream, boolean paramBoolean) throws IOException {
    return useSocket8 ? new ProvSSLSocketWrap_8(paramContextData, paramSocket, paramInputStream, paramBoolean) : new ProvSSLSocketWrap(paramContextData, paramSocket, paramInputStream, paramBoolean);
  }
  
  static ProvSSLSocketWrap create(ContextData paramContextData, Socket paramSocket, String paramString, int paramInt, boolean paramBoolean) throws IOException {
    return useSocket8 ? new ProvSSLSocketWrap_8(paramContextData, paramSocket, paramString, paramInt, paramBoolean) : new ProvSSLSocketWrap(paramContextData, paramSocket, paramString, paramInt, paramBoolean);
  }
  
  static void handshakeCompleted(Runnable paramRunnable) {
    String str = "BCJSSE-HandshakeCompleted-" + (threadNumber.getAndIncrement() & Integer.MAX_VALUE);
    (new Thread(paramRunnable, str)).start();
  }
  
  static BCExtendedSSLSession importHandshakeSession(SSLSocket paramSSLSocket) {
    if (paramSSLSocket instanceof BCSSLSocket)
      return ((BCSSLSocket)paramSSLSocket).getBCHandshakeSession(); 
    if (null != paramSSLSocket && null != getHandshakeSession) {
      SSLSession sSLSession = (SSLSession)ReflectionUtil.invokeGetter(paramSSLSocket, getHandshakeSession);
      if (null != sSLSession)
        return SSLSessionUtil.importSSLSession(sSLSession); 
    } 
    return null;
  }
  
  static BCSSLParameters importSSLParameters(SSLSocket paramSSLSocket) {
    if (paramSSLSocket instanceof BCSSLSocket)
      return ((BCSSLSocket)paramSSLSocket).getParameters(); 
    if (null == paramSSLSocket || null == getSSLParameters)
      return null; 
    SSLParameters sSLParameters = (SSLParameters)ReflectionUtil.invokeGetter(paramSSLSocket, getSSLParameters);
    if (null == sSLParameters)
      throw new RuntimeException("SSLSocket.getSSLParameters returned null"); 
    return SSLParametersUtil.importSSLParameters(sSLParameters);
  }
  
  static {
    Method[] arrayOfMethod = ReflectionUtil.getMethods("javax.net.ssl.SSLSocket");
    getHandshakeSession = ReflectionUtil.findMethod(arrayOfMethod, "getHandshakeSession");
    getSSLParameters = ReflectionUtil.findMethod(arrayOfMethod, "getSSLParameters");
    useSocket8 = ReflectionUtil.hasMethod(arrayOfMethod, "getApplicationProtocol");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\SSLSocketUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */