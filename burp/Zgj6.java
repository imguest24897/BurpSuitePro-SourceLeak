package burp;

import burp.api.montoya.proxy.http.InterceptedRequest;
import java.net.InetAddress;

public class Zgj6 implements IInterceptedProxyMessage {
  private final InterceptedRequest Zm;
  
  private final IHttpRequestResponse Z_;
  
  private int Zw;
  
  public Zgj6(InterceptedRequest paramInterceptedRequest, IHttpRequestResponse paramIHttpRequestResponse) {
    this.Zm = paramInterceptedRequest;
    this.Z_ = paramIHttpRequestResponse;
  }
  
  public int getMessageReference() {
    return this.Zm.messageId();
  }
  
  public IHttpRequestResponse getMessageInfo() {
    return this.Z_;
  }
  
  public int getInterceptAction() {
    return this.Zw;
  }
  
  public void setInterceptAction(int paramInt) {
    this.Zw = paramInt;
  }
  
  public String getListenerInterface() {
    return this.Zm.listenerInterface();
  }
  
  public InetAddress getClientIpAddress() {
    return this.Zm.sourceIpAddress();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgj6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */