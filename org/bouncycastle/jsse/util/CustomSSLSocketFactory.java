package org.bouncycastle.jsse.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocketFactory;

public class CustomSSLSocketFactory extends SSLSocketFactory {
  protected final SSLSocketFactory delegate;
  
  public CustomSSLSocketFactory(SSLSocketFactory paramSSLSocketFactory) {
    if (null == paramSSLSocketFactory)
      throw new NullPointerException("'delegate' cannot be null"); 
    this.delegate = paramSSLSocketFactory;
  }
  
  public Socket createSocket() throws IOException {
    return configureSocket(this.delegate.createSocket());
  }
  
  public Socket createSocket(InetAddress paramInetAddress, int paramInt) throws IOException {
    return configureSocket(this.delegate.createSocket(paramInetAddress, paramInt));
  }
  
  public Socket createSocket(InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2) throws IOException {
    return configureSocket(this.delegate.createSocket(paramInetAddress1, paramInt1, paramInetAddress2, paramInt2));
  }
  
  public Socket createSocket(String paramString, int paramInt) throws IOException, UnknownHostException {
    return configureSocket(this.delegate.createSocket(paramString, paramInt));
  }
  
  public Socket createSocket(String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2) throws IOException, UnknownHostException {
    return configureSocket(this.delegate.createSocket(paramString, paramInt1, paramInetAddress, paramInt2));
  }
  
  public Socket createSocket(Socket paramSocket, InputStream paramInputStream, boolean paramBoolean) throws IOException {
    return configureSocket(this.delegate.createSocket(paramSocket, paramInputStream, paramBoolean));
  }
  
  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean) throws IOException {
    return configureSocket(this.delegate.createSocket(paramSocket, paramString, paramInt, paramBoolean));
  }
  
  public String[] getDefaultCipherSuites() {
    return this.delegate.getDefaultCipherSuites();
  }
  
  public String[] getSupportedCipherSuites() {
    return this.delegate.getSupportedCipherSuites();
  }
  
  protected Socket configureSocket(Socket paramSocket) {
    return paramSocket;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jss\\util\CustomSSLSocketFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */