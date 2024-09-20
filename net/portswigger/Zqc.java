package net.portswigger;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Zqc implements Zcd {
  private final Zz2 ZR;
  
  public Zqc(Zz2 paramZz2) {
    this.ZR = paramZz2;
  }
  
  public boolean ZD() {
    return false;
  }
  
  public Socket Zi(Socket paramSocket, String paramString, int paramInt) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    Socket socket = (paramSocket != null) ? paramSocket : new Socket(paramString, paramInt);
    this.ZR.Zq(socket);
    return socket;
  }
  
  public Socket ZX(InetAddress paramInetAddress, String paramString, int paramInt) throws IOException {
    Socket socket = new Socket(paramInetAddress, paramInt);
    this.ZR.Zq(socket);
    return socket;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zqc.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */