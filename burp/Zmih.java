package burp;

import burp.api.montoya.http.handler.HttpHandler;
import burp.api.montoya.http.handler.HttpRequestToBeSent;
import burp.api.montoya.http.handler.HttpResponseReceived;
import burp.api.montoya.http.handler.RequestToBeSentAction;
import burp.api.montoya.http.handler.ResponseReceivedAction;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;

public class Zmih implements HttpHandler {
  private final IHttpListener Zh;
  
  private final Zzqf Zk;
  
  public Zmih(IHttpListener paramIHttpListener, Zzqf paramZzqf) {
    this.Zh = paramIHttpListener;
    this.Zk = paramZzqf;
  }
  
  public RequestToBeSentAction handleHttpRequestToBeSent(HttpRequestToBeSent paramHttpRequestToBeSent) {
    int i = Zzgg.ZT(paramHttpRequestToBeSent.toolSource().toolType());
    Zgaa zgaa = new Zgaa((HttpRequest)paramHttpRequestToBeSent, paramHttpRequestToBeSent.annotations(), this.Zk);
    this.Zh.processHttpMessage(i, true, new Zrlb(zgaa));
    return Zs5_.Zj(zgaa.Zz(), zgaa.ZY());
  }
  
  public ResponseReceivedAction handleHttpResponseReceived(HttpResponseReceived paramHttpResponseReceived) {
    int i = Zzgg.ZT(paramHttpResponseReceived.toolSource().toolType());
    Zn3 zn3 = new Zn3((HttpResponse)paramHttpResponseReceived, paramHttpResponseReceived.initiatingRequest(), paramHttpResponseReceived.annotations(), this.Zk);
    this.Zh.processHttpMessage(i, false, new Zrlb(zn3));
    return Zt64.Zm(zn3.ZJ(), zn3.Zd());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmih.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */