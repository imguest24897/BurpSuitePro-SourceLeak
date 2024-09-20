package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import org.bouncycastle.jsse.provider.ContextData;
import org.bouncycastle.jsse.provider.ProvSSLServerSocket;

class ProvSSLServerSocketFactory extends SSLServerSocketFactory {
  protected final ContextData contextData;
  
  ProvSSLServerSocketFactory(ContextData paramContextData) {
    this.contextData = paramContextData;
  }
  
  public ServerSocket createServerSocket() throws IOException {
    return (ServerSocket)new ProvSSLServerSocket(this.contextData);
  }
  
  public ServerSocket createServerSocket(int paramInt) throws IOException {
    return (ServerSocket)new ProvSSLServerSocket(this.contextData, paramInt);
  }
  
  public ServerSocket createServerSocket(int paramInt1, int paramInt2) throws IOException {
    return (ServerSocket)new ProvSSLServerSocket(this.contextData, paramInt1, paramInt2);
  }
  
  public ServerSocket createServerSocket(int paramInt1, int paramInt2, InetAddress paramInetAddress) throws IOException {
    return (ServerSocket)new ProvSSLServerSocket(this.contextData, paramInt1, paramInt2, paramInetAddress);
  }
  
  public String[] getDefaultCipherSuites() {
    return this.contextData.getContext().getDefaultCipherSuites(false);
  }
  
  public String[] getSupportedCipherSuites() {
    return this.contextData.getContext().getSupportedCipherSuites();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvSSLServerSocketFactory.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */