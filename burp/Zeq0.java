package burp;

import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.proxy.MessageToBeSentAction;
import burp.api.montoya.proxy.http.InterceptedRequest;
import burp.api.montoya.proxy.http.InterceptedResponse;
import burp.api.montoya.proxy.http.ProxyRequestHandler;
import burp.api.montoya.proxy.http.ProxyRequestReceivedAction;
import burp.api.montoya.proxy.http.ProxyRequestToBeSentAction;
import burp.api.montoya.proxy.http.ProxyResponseHandler;
import burp.api.montoya.proxy.http.ProxyResponseReceivedAction;
import burp.api.montoya.proxy.http.ProxyResponseToBeSentAction;
import java.util.HashSet;
import java.util.Set;
import net.portswigger.Zto;

public class Zeq0 implements ProxyRequestHandler, ProxyResponseHandler {
  private final IProxyListener ZI;
  
  private final Set<Zto<Integer, Integer>> Zp;
  
  private final Ztx8 Zw;
  
  private final Zzqf ZF;
  
  public Zeq0(IProxyListener paramIProxyListener, Ztx8 paramZtx8, Zzqf paramZzqf) {
    this.ZI = paramIProxyListener;
    this.Zw = paramZtx8;
    this.ZF = paramZzqf;
    this.Zp = new HashSet<>();
  }
  
  public ProxyRequestReceivedAction handleRequestReceived(InterceptedRequest paramInterceptedRequest) {
    Zgaa zgaa = new Zgaa((HttpRequest)paramInterceptedRequest, paramInterceptedRequest.annotations(), this.ZF);
    Zgj6 zgj6 = new Zgj6(paramInterceptedRequest, new Zrlb(zgaa));
    this.ZI.processProxyMessage(true, zgj6);
    int i = zgj6.getInterceptAction();
    if (ZC(i))
      this.Zp.add(Zto.ZM(Integer.valueOf(i), Integer.valueOf(paramInterceptedRequest.messageId()))); 
    return Zb0r.ZL(zgaa.Zz(), zgaa.ZY(), Zt6v.Zn(i));
  }
  
  public ProxyRequestToBeSentAction handleRequestToBeSent(InterceptedRequest paramInterceptedRequest) {
    Zto zto = this.Zp.stream().filter(paramInterceptedRequest::lambda$handleRequestToBeSent$0).findFirst().orElse(null);
    if (this.Zp.remove(zto)) {
      Zgaa zgaa = new Zgaa((HttpRequest)paramInterceptedRequest, paramInterceptedRequest.annotations(), this.ZF);
      Zgj6 zgj6 = new Zgj6(paramInterceptedRequest, new Zrlb(zgaa));
      zgj6.setInterceptAction(((Integer)zto.Zq).intValue());
      this.ZI.processProxyMessage(true, zgj6);
      return Zm50.Zn(zgaa.Zz(), zgaa.ZY(), Zt6v.Za(zgj6.getInterceptAction()));
    } 
    return Zm50.Zn((HttpRequest)paramInterceptedRequest, paramInterceptedRequest.annotations(), MessageToBeSentAction.CONTINUE);
  }
  
  public ProxyResponseReceivedAction handleResponseReceived(InterceptedResponse paramInterceptedResponse) {
    Zn3 zn3 = new Zn3((HttpResponse)paramInterceptedResponse, paramInterceptedResponse.initiatingRequest(), paramInterceptedResponse.annotations(), this.ZF);
    Zetw zetw = new Zetw(paramInterceptedResponse, new Zrlb(zn3));
    this.ZI.processProxyMessage(false, zetw);
    int i = zetw.getInterceptAction();
    String[] arrayOfString = Zlel.Zs();
    if (ZC(i))
      this.Zp.add(Zto.ZM(Integer.valueOf(i), Integer.valueOf(paramInterceptedResponse.messageId()))); 
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[5]); 
    return Zb0d.ZE(zn3.ZJ(), zn3.Zd(), Zt6v.Zn(i));
  }
  
  public ProxyResponseToBeSentAction handleResponseToBeSent(InterceptedResponse paramInterceptedResponse) {
    Zto zto = this.Zp.stream().filter(paramInterceptedResponse::lambda$handleResponseToBeSent$1).findFirst().orElse(null);
    if (this.Zp.remove(zto)) {
      Zn3 zn3 = new Zn3((HttpResponse)paramInterceptedResponse, paramInterceptedResponse.initiatingRequest(), paramInterceptedResponse.annotations(), this.ZF);
      Zetw zetw = new Zetw(paramInterceptedResponse, new Zrlb(zn3, this.Zw));
      zetw.setInterceptAction(((Integer)zto.Zq).intValue());
      this.ZI.processProxyMessage(false, zetw);
      return Zevu.Zf(zn3.ZJ(), zn3.Zd(), Zt6v.Za(zetw.getInterceptAction()));
    } 
    return Zevu.Zf((HttpResponse)paramInterceptedResponse, paramInterceptedResponse.annotations(), MessageToBeSentAction.CONTINUE);
  }
  
  private static boolean ZC(int paramInt) {
    switch (paramInt) {
      case 0:
      case 1:
      case 2:
      case 3:
      
      case 16:
      case 17:
      case 18:
      
    } 
    return true;
  }
  
  private static boolean lambda$handleResponseToBeSent$1(InterceptedResponse paramInterceptedResponse, Zto paramZto) {
    return (((Integer)paramZto.Zo).intValue() == paramInterceptedResponse.messageId());
  }
  
  private static boolean lambda$handleRequestToBeSent$0(InterceptedRequest paramInterceptedRequest, Zto paramZto) {
    return (((Integer)paramZto.Zo).intValue() == paramInterceptedRequest.messageId());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeq0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */