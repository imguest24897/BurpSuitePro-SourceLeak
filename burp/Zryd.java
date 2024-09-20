package burp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class Zryd extends SSLSocketFactory {
  private final SSLSocketFactory ZJ;
  
  public Zryd(SSLSocketFactory paramSSLSocketFactory) {
    this.ZJ = paramSSLSocketFactory;
  }
  
  public String[] getDefaultCipherSuites() {
    return this.ZJ.getDefaultCipherSuites();
  }
  
  public String[] getSupportedCipherSuites() {
    return this.ZJ.getSupportedCipherSuites();
  }
  
  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean) throws IOException {
    return ZU(this.ZJ.createSocket(paramSocket, paramString, paramInt, paramBoolean));
  }
  
  public Socket createSocket(String paramString, int paramInt) throws IOException {
    return ZU(this.ZJ.createSocket(paramString, paramInt));
  }
  
  public Socket createSocket(String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2) throws IOException {
    return ZU(this.ZJ.createSocket(paramString, paramInt1, paramInetAddress, paramInt2));
  }
  
  public Socket createSocket(InetAddress paramInetAddress, int paramInt) throws IOException {
    return ZU(this.ZJ.createSocket(paramInetAddress, paramInt));
  }
  
  public Socket createSocket(InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2) throws IOException {
    return ZU(this.ZJ.createSocket(paramInetAddress1, paramInt1, paramInetAddress2, paramInt2));
  }
  
  private static Zlda ZU(Socket paramSocket) {
    return new Zlda((SSLSocket)paramSocket);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zryd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */