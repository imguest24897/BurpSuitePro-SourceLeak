package burp;

import burp.api.montoya.proxy.http.InterceptedResponse;
import java.net.InetAddress;

public class Zetw implements IInterceptedProxyMessage {
  private final InterceptedResponse ZO;
  
  private final IHttpRequestResponse Zt;
  
  private int Za;
  
  public Zetw(InterceptedResponse paramInterceptedResponse, IHttpRequestResponse paramIHttpRequestResponse) {
    this.ZO = paramInterceptedResponse;
    this.Zt = paramIHttpRequestResponse;
  }
  
  public int getMessageReference() {
    return this.ZO.messageId();
  }
  
  public IHttpRequestResponse getMessageInfo() {
    return this.Zt;
  }
  
  public int getInterceptAction() {
    return this.Za;
  }
  
  public void setInterceptAction(int paramInt) {
    this.Za = paramInt;
  }
  
  public String getListenerInterface() {
    return this.ZO.listenerInterface();
  }
  
  public InetAddress getClientIpAddress() {
    return this.ZO.destinationIpAddress();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zetw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */