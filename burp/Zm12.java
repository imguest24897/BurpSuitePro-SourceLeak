package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.ToolSource;
import burp.api.montoya.http.handler.HttpHandler;
import burp.api.montoya.http.handler.RequestToBeSentAction;
import burp.api.montoya.http.handler.ResponseReceivedAction;
import burp.api.montoya.http.message.responses.HttpResponse;
import java.util.List;

public class Zm12 implements Zkc6 {
  private final Object Zy;
  
  private final List<HttpHandler> Zb;
  
  private final Zktu ZS;
  
  private final Zskl ZA;
  
  private final Zz4k ZF;
  
  public Zm12(List<HttpHandler> paramList, Zktu paramZktu, Zskl paramZskl, Zz4k paramZz4k) {
    this.Zb = paramList;
    this.ZS = paramZktu;
    this.ZA = paramZskl;
    this.ZF = paramZz4k;
    this.Zy = new Object();
  }
  
  public void Zz(Zeew paramZeew, Zxj1 paramZxj1) {
    int i = Zl9.ZK();
    if (this.Zb.isEmpty())
      return; 
    ToolSource toolSource = Zt6v.ZK(paramZeew);
    for (HttpHandler httpHandler : Zepo.<HttpHandler>Zj(this.Zb)) {
      Zztj zztj = this.ZA.Zu(paramZxj1);
      Annotations annotations = this.ZA.ZM(paramZxj1);
      RequestToBeSentAction requestToBeSentAction = httpHandler.handleHttpRequestToBeSent(new Zb33(paramZxj1.Zk(), zztj, annotations, toolSource));
      if (requestToBeSentAction != null)
        this.ZF.Zi(paramZxj1, requestToBeSentAction.request(), requestToBeSentAction.annotations()); 
      if (i == 0)
        break; 
    } 
  }
  
  public void Z_(Zeew paramZeew, Zxj1 paramZxj1) {
    int i = Zl9.ZK();
    if (this.Zb.isEmpty())
      return; 
    ToolSource toolSource = Zt6v.ZK(paramZeew);
    for (HttpHandler httpHandler : Zepo.<HttpHandler>Zj(this.Zb)) {
      Zztj zztj = this.ZA.Zu(paramZxj1);
      HttpResponse httpResponse = this.ZA.Zc(paramZxj1.ZM());
      Annotations annotations = this.ZA.ZM(paramZxj1);
      ResponseReceivedAction responseReceivedAction = httpHandler.handleHttpResponseReceived(new Zske(paramZxj1.Zk(), httpResponse, zztj, annotations, toolSource));
      if (responseReceivedAction != null)
        this.ZF.Zw(paramZxj1, responseReceivedAction.response(), responseReceivedAction.annotations()); 
      if (i == 0)
        break; 
    } 
  }
  
  void ZR() {
    synchronized (this.Zy) {
      this.Zb.clear();
      this.ZS.Zm(this::lambda$refresh$0);
    } 
  }
  
  private void lambda$refresh$0(Zeu1 paramZeu1) {
    this.Zb.addAll(paramZeu1.ZF().Zw());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm12.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */