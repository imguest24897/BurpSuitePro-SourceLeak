package burp;

import burp.api.montoya.core.Range;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.scanner.audit.issues.AuditIssue;
import burp.api.montoya.ui.contextmenu.AuditIssueContextMenuEvent;
import burp.api.montoya.ui.contextmenu.ContextMenuEvent;
import burp.api.montoya.ui.contextmenu.MessageEditorHttpRequestResponse;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Zrv5 extends Zrvt implements ContextMenuEvent {
  private final Zezw Zt;
  
  private final Zzqf Zc;
  
  private final AuditIssueContextMenuEvent ZM;
  
  public Zrv5(Zezw paramZezw, AuditIssueContextMenuEvent paramAuditIssueContextMenuEvent, Zzqf paramZzqf) {
    super(paramZezw);
    this.Zt = paramZezw;
    this.Zc = paramZzqf;
    this.ZM = paramAuditIssueContextMenuEvent;
  }
  
  public Optional<MessageEditorHttpRequestResponse> messageEditorRequestResponse() {
    IHttpRequestResponse[] arrayOfIHttpRequestResponse = this.Zt.Zs();
    int[] arrayOfInt = this.Zt.ZD();
    if (arrayOfIHttpRequestResponse == null || arrayOfInt == null || !(this.Zt.ZR()).isEditor)
      return Optional.empty(); 
    arrayOfIHttpRequestResponse = (IHttpRequestResponse[])Arrays.<IHttpRequestResponse>stream(arrayOfIHttpRequestResponse).filter(Objects::nonNull).toArray(Zrv5::lambda$messageEditorRequestResponse$0);
    if (arrayOfIHttpRequestResponse.length == 0)
      return Optional.empty(); 
    Range range = this.Zc.ZK(arrayOfInt);
    int i = range.endIndexExclusive();
    if (range.startIndexInclusive() == range.endIndexExclusive())
      range = null; 
    IHttpRequestResponse iHttpRequestResponse = arrayOfIHttpRequestResponse[0];
    Zz2q zz2q = new Zz2q(iHttpRequestResponse, this.Zc);
    MessageEditorHttpRequestResponse.SelectionContext selectionContext = Zt6v.Zu(this.Zt.ZR());
    Zmz7 zmz7 = new Zmz7(range, zz2q, selectionContext, i);
    return Optional.of(zmz7);
  }
  
  public List<HttpRequestResponse> selectedRequestResponses() {
    IHttpRequestResponse[] arrayOfIHttpRequestResponse = this.Zt.Zs();
    return (arrayOfIHttpRequestResponse == null || (this.Zt.ZR()).isEditor) ? Collections.emptyList() : (List<HttpRequestResponse>)Arrays.<IHttpRequestResponse>stream(arrayOfIHttpRequestResponse).filter(Objects::nonNull).map(this::lambda$selectedRequestResponses$1).collect(Collectors.toList());
  }
  
  public List<AuditIssue> selectedIssues() {
    return this.ZM.selectedIssues();
  }
  
  private Zz2q lambda$selectedRequestResponses$1(IHttpRequestResponse paramIHttpRequestResponse) {
    return new Zz2q(paramIHttpRequestResponse, this.Zc);
  }
  
  private static IHttpRequestResponse[] lambda$messageEditorRequestResponse$0(int paramInt) {
    return new IHttpRequestResponse[paramInt];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrv5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */