package org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

class ProvSSLServerSocketFactory extends SSLServerSocketFactory {
  protected final ContextData contextData;
  
  ProvSSLServerSocketFactory(ContextData paramContextData) {
    this.contextData = paramContextData;
  }
  
  public ServerSocket createServerSocket() throws IOException {
    return new ProvSSLServerSocket(this.contextData);
  }
  
  public ServerSocket createServerSocket(int paramInt) throws IOException {
    return new ProvSSLServerSocket(this.contextData, paramInt);
  }
  
  public ServerSocket createServerSocket(int paramInt1, int paramInt2) throws IOException {
    return new ProvSSLServerSocket(this.contextData, paramInt1, paramInt2);
  }
  
  public ServerSocket createServerSocket(int paramInt1, int paramInt2, InetAddress paramInetAddress) throws IOException {
    return new ProvSSLServerSocket(this.contextData, paramInt1, paramInt2, paramInetAddress);
  }
  
  public String[] getDefaultCipherSuites() {
    return this.contextData.getContext().getDefaultCipherSuites(false);
  }
  
  public String[] getSupportedCipherSuites() {
    return this.contextData.getContext().getSupportedCipherSuites();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ProvSSLServerSocketFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */