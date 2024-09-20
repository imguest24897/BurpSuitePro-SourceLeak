package burp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zsdz {
  private static final Executor ZV = Executors.newCachedThreadPool();
  
  private static String Ze;
  
  public static void ZJ(Socket paramSocket, byte[] paramArrayOfbyte) throws IOException {
    ZQ(paramSocket, (Iterable)Collections.singleton(paramArrayOfbyte));
  }
  
  public static void ZQ(Socket paramSocket, Iterable<byte[]> paramIterable) throws IOException {
    paramSocket.setSoTimeout(120000);
    OutputStream outputStream = paramSocket.getOutputStream();
    Iterator<byte> iterator = paramIterable.iterator();
    String str = ZN();
    while (iterator.hasNext()) {
      byte[] arrayOfByte = (byte[])iterator.next();
      outputStream.write(arrayOfByte);
      if (str != null) {
        Zbqc.Zr(new Zbqc[4]);
        break;
      } 
    } 
    outputStream.flush();
    ZW(paramSocket);
  }
  
  public static String ZO(Socket paramSocket) {
    return (paramSocket instanceof SSLSocket) ? ((SSLSocket)paramSocket).getApplicationProtocol() : "";
  }
  
  public static List<String> ZH(Socket paramSocket) {
    return (paramSocket instanceof SSLSocket) ? Zl((SSLSocket)paramSocket) : Collections.<String>emptyList();
  }
  
  public static List<String> Zl(SSLSocket paramSSLSocket) {
    String str = ZN();
    if (Zbqc.Zwu() == null)
      ZI("XCKByb"); 
    return Optional.<SSLSocket>of(paramSSLSocket).map(SSLSocket::getSSLParameters).map(SSLParameters::getApplicationProtocols).map(Arrays::asList).orElse(Collections.emptyList());
  }
  
  public static void ZW(Socket paramSocket) {
    try {
      if (paramSocket != null)
        paramSocket.close(); 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
  }
  
  public static void ZQ(Socket paramSocket) {
    ZV.execute(paramSocket::lambda$closeSocketAsync$0);
  }
  
  private static void lambda$closeSocketAsync$0(Socket paramSocket) {
    ZW(paramSocket);
  }
  
  public static void ZI(String paramString) {
    Ze = paramString;
  }
  
  public static String ZN() {
    return Ze;
  }
  
  static {
    if (ZN() != null)
      ZI("ZI0mwb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsdz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */