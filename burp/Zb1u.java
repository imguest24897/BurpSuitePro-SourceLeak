package burp;

import burp.api.montoya.core.Range;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.scanner.audit.Audit;
import burp.api.montoya.scanner.audit.issues.AuditIssue;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Zb1u implements Audit {
  private final Zeih Zd;
  
  private final Zm6x Zb;
  
  private final List<Zbza> ZS;
  
  private final Supplier<Zb9a> Zs;
  
  private final Zbnt ZE;
  
  private final Zkl6 ZL;
  
  private final Zskl Zw;
  
  public Zb1u(Zeih paramZeih, Supplier<Zb9a> paramSupplier, Zbnt paramZbnt, Zkl6 paramZkl6, Zskl paramZskl, Zm6x paramZm6x) {
    this.Zs = paramSupplier;
    this.ZE = paramZbnt;
    this.ZL = paramZkl6;
    this.Zw = paramZskl;
    this.Zd = paramZeih;
    this.Zb = paramZm6x;
    this.ZS = new LinkedList<>();
  }
  
  public int insertionPointCount() {
    return this.ZS.stream().mapToInt(Zbza::ZgP).sum();
  }
  
  public List<AuditIssue> issues() {
    return (List<AuditIssue>)this.ZS.stream().map(Zbza::Zgr).flatMap(Collection::stream).map(this::lambda$issues$0).collect(Collectors.toUnmodifiableList());
  }
  
  public void addRequest(HttpRequest paramHttpRequest) {
    addRequest(paramHttpRequest, null);
  }
  
  public void addRequest(HttpRequest paramHttpRequest, List<Range> paramList) {
    Zmzk zmzk = Zblx.Zm(paramHttpRequest.httpService(), this.ZE);
    Zz1p zz1p = Zekx.Zu(zmzk, paramHttpRequest.toByteArray().getBytes(), (byte)3, this.ZE);
    this.ZS.add(this.Zd.Zk(null, zmzk, Zblx.Zw(paramHttpRequest.toByteArray()), null, zz1p, 0L, 0L, null));
  }
  
  public void addRequestResponse(HttpRequestResponse paramHttpRequestResponse) {
    Zmzk zmzk = Zblx.Zm(paramHttpRequestResponse.httpService(), this.ZE);
    Zz1p zz1p = Zekx.Zu(zmzk, paramHttpRequestResponse.request().toByteArray().getBytes(), (byte)3, this.ZE);
    Zstu zstu = (paramHttpRequestResponse.response() != null) ? Zblx.Zw(paramHttpRequestResponse.response().toByteArray()) : null;
    this.ZS.add(this.Zd.Zk(null, zmzk, Zblx.Zw(paramHttpRequestResponse.request().toByteArray()), zstu, zz1p, 0L, 0L, null));
  }
  
  public int requestCount() {
    return this.ZS.stream().mapToInt(Zbza::ZgR).sum();
  }
  
  public int errorCount() {
    return this.ZS.stream().mapToInt(Zbza::Zgx).sum();
  }
  
  public void delete() {
    this.ZS.forEach(this::lambda$delete$1);
  }
  
  public String statusMessage() {
    return String.join(",", (Iterable<? extends CharSequence>)this.ZS.stream().map(Zbza::Zgu).collect(Collectors.toSet()));
  }
  
  private void lambda$delete$1(Zbza paramZbza) {
    ((Zb9a)this.Zs.get()).ZA(Collections.singletonList(paramZbza));
  }
  
  private Zkf_ lambda$issues$0(Zrdb paramZrdb) {
    return new Zkf_(paramZrdb, this.ZL, this.Zw, this.Zb);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb1u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */