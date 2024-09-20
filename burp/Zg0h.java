package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.sessions.ActionResult;
import burp.api.montoya.http.sessions.SessionHandlingAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zg0h {
  private final Zeu1 Zc;
  
  private final SessionHandlingAction ZL;
  
  private final Zbnt ZP;
  
  private final Zskh ZJ;
  
  private final Zskl ZW;
  
  public Zg0h(Zeu1 paramZeu1, SessionHandlingAction paramSessionHandlingAction, Zbnt paramZbnt, Zskh paramZskh, Zskl paramZskl) {
    this.Zc = paramZeu1;
    this.ZL = paramSessionHandlingAction;
    this.ZP = paramZbnt;
    this.ZJ = paramZskh;
    this.ZW = paramZskl;
  }
  
  public String ZM() {
    String str = this.ZL.name();
    return (str == null) ? this.Zc.ZN() : str;
  }
  
  public void Zi(Zmfj paramZmfj, List<Zkg1> paramList) throws Exception {
    try {
    
    } catch (Throwable throwable) {
      throw a(null);
    } 
    List list = (List)((paramList != null) ? Zv(paramList) : Collections.emptyList());
    Zztj zztj = this.ZW.Zu(paramZmfj);
    Annotations annotations = this.ZW.ZM(paramZmfj);
    try {
      ActionResult actionResult = this.ZL.performAction(new Zziz(zztj, annotations, list));
      try {
        if (actionResult != null)
          ZU(paramZmfj, actionResult); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      this.Zc.ZN(throwable, this.ZJ);
      throw new Exception(throwable.getMessage());
    } 
  }
  
  private void ZU(Zmfj paramZmfj, ActionResult paramActionResult) {
    HttpRequest httpRequest = paramActionResult.request();
    Annotations annotations = paramActionResult.annotations();
    if (httpRequest != null) {
      paramZmfj.ZH(httpRequest.toByteArray().getBytes());
      paramZmfj.ZU(Zblx.Zm(httpRequest.httpService(), this.ZP));
    } 
    if (annotations != null) {
      paramZmfj.ZP(annotations.notes());
      paramZmfj.ZB((Zblx.ZA(annotations.highlightColor())).name);
    } 
  }
  
  private List<HttpRequestResponse> Zv(List<Zkg1> paramList) {
    ArrayList<HttpRequestResponse> arrayList = new ArrayList(paramList.size());
    Iterator<Zkg1> iterator = paramList.iterator();
    int i = Zlzj.ZZ();
    while (iterator.hasNext()) {
      Zkg1 zkg1 = iterator.next();
      arrayList.add(this.ZW.Zt(zkg1));
      if (i != 0)
        break; 
    } 
    return arrayList;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg0h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */