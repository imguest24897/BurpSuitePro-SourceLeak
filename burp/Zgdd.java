package burp;

import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.sessions.ActionResult;
import burp.api.montoya.http.sessions.SessionHandlingAction;
import burp.api.montoya.http.sessions.SessionHandlingActionData;
import java.util.Objects;

public class Zgdd implements SessionHandlingAction {
  private final ISessionHandlingAction Zy;
  
  private final Zbnt ZG;
  
  private final Ztx8 Zn;
  
  private final Zzqf Zg;
  
  public Zgdd(ISessionHandlingAction paramISessionHandlingAction, Zbnt paramZbnt, Ztx8 paramZtx8, Zzqf paramZzqf) {
    this.Zy = paramISessionHandlingAction;
    this.ZG = paramZbnt;
    this.Zn = paramZtx8;
    this.Zg = paramZzqf;
  }
  
  public String name() {
    return this.Zy.getActionName();
  }
  
  public ActionResult performAction(SessionHandlingActionData paramSessionHandlingActionData) {
    Zgaa zgaa = new Zgaa(paramSessionHandlingActionData.request(), paramSessionHandlingActionData.annotations(), this.Zg);
    IHttpRequestResponse[] arrayOfIHttpRequestResponse = (IHttpRequestResponse[])paramSessionHandlingActionData.macroRequestResponses().stream().filter(Objects::nonNull).map(this::lambda$performAction$0).map(this::lambda$performAction$1).toArray(Zgdd::lambda$performAction$2);
    String[] arrayOfString = Zlel.Zs();
    this.Zy.performAction(new Zrlb(zgaa), arrayOfIHttpRequestResponse);
    if (Zbqc.Zwu() == null)
      Zlel.Zj(new String[5]); 
    return Zmke.Zd(zgaa.Zz(), zgaa.ZY());
  }
  
  private static IHttpRequestResponse[] lambda$performAction$2(int paramInt) {
    return new IHttpRequestResponse[paramInt];
  }
  
  private Zrlb lambda$performAction$1(Zr0x paramZr0x) {
    return new Zrlb(paramZr0x, this.Zn);
  }
  
  private Zr0x lambda$performAction$0(HttpRequestResponse paramHttpRequestResponse) {
    return new Zr0x(paramHttpRequestResponse, this.ZG, this.Zg);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgdd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */