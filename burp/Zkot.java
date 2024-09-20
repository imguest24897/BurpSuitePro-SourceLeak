package burp;

import burp.api.montoya.proxy.http.InterceptedHttpMessage;
import java.net.InetAddress;

public class Zkot implements InterceptedHttpMessage {
  private final int ZF;
  
  private final String Za;
  
  private final InetAddress Zl;
  
  private final InetAddress ZV;
  
  public Zkot(int paramInt, String paramString, InetAddress paramInetAddress1, InetAddress paramInetAddress2) {
    this.ZF = paramInt;
    this.Za = paramString;
    this.Zl = paramInetAddress1;
    this.ZV = paramInetAddress2;
  }
  
  public int messageId() {
    return this.ZF;
  }
  
  public String listenerInterface() {
    return this.Za;
  }
  
  public InetAddress sourceIpAddress() {
    return this.Zl;
  }
  
  public InetAddress destinationIpAddress() {
    return this.ZV;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkot.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */