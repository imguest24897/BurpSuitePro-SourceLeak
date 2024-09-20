package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.jsse.provider.ContextData;
import org.bouncycastle.jsse.provider.SSLSocketUtil;

class ProvSSLSocketFactory extends SSLSocketFactory {
  protected final ContextData contextData;
  
  ProvSSLSocketFactory(ContextData paramContextData) {
    this.contextData = paramContextData;
  }
  
  public Socket createSocket() throws IOException {
    return (Socket)SSLSocketUtil.create(this.contextData);
  }
  
  public Socket createSocket(InetAddress paramInetAddress, int paramInt) throws IOException {
    return (Socket)SSLSocketUtil.create(this.contextData, paramInetAddress, paramInt);
  }
  
  public Socket createSocket(InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2) throws IOException {
    return (Socket)SSLSocketUtil.create(this.contextData, paramInetAddress1, paramInt1, paramInetAddress2, paramInt2);
  }
  
  public Socket createSocket(String paramString, int paramInt) throws IOException, UnknownHostException {
    return (Socket)SSLSocketUtil.create(this.contextData, paramString, paramInt);
  }
  
  public Socket createSocket(String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2) throws IOException, UnknownHostException {
    return (Socket)SSLSocketUtil.create(this.contextData, paramString, paramInt1, paramInetAddress, paramInt2);
  }
  
  public Socket createSocket(Socket paramSocket, InputStream paramInputStream, boolean paramBoolean) throws IOException {
    return (Socket)SSLSocketUtil.create(this.contextData, paramSocket, paramInputStream, paramBoolean);
  }
  
  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean) throws IOException {
    return (Socket)SSLSocketUtil.create(this.contextData, paramSocket, paramString, paramInt, paramBoolean);
  }
  
  public String[] getDefaultCipherSuites() {
    return this.contextData.getContext().getDefaultCipherSuites(true);
  }
  
  public String[] getSupportedCipherSuites() {
    return this.contextData.getContext().getSupportedCipherSuites();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvSSLSocketFactory.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */