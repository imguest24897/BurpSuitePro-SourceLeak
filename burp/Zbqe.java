package burp;

import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.scanner.AuditResult;
import burp.api.montoya.scanner.ConsolidationAction;
import burp.api.montoya.scanner.ScanCheck;
import burp.api.montoya.scanner.audit.insertionpoint.AuditInsertionPoint;
import burp.api.montoya.scanner.audit.issues.AuditIssue;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Zbqe implements ScanCheck {
  private final IScannerCheck Zt;
  
  private final Zzqf Zm;
  
  public Zbqe(IScannerCheck paramIScannerCheck, Zzqf paramZzqf) {
    this.Zt = paramIScannerCheck;
    this.Zm = paramZzqf;
  }
  
  public AuditResult activeAudit(HttpRequestResponse paramHttpRequestResponse, AuditInsertionPoint paramAuditInsertionPoint) {
    List<IScanIssue> list = this.Zt.doActiveScan(new Zr0z(paramHttpRequestResponse, this.Zm), new Zg_2(paramAuditInsertionPoint, this.Zm));
    return (list == null) ? this.Zm.Zi(null) : this.Zm.Zi((List<AuditIssue>)list.stream().filter(Objects::nonNull).map(this::lambda$activeAudit$0).collect(Collectors.toList()));
  }
  
  public AuditResult passiveAudit(HttpRequestResponse paramHttpRequestResponse) {
    List<IScanIssue> list = this.Zt.doPassiveScan(new Zr0z(paramHttpRequestResponse, this.Zm));
    return (list == null) ? this.Zm.Zi(null) : this.Zm.Zi((List<AuditIssue>)list.stream().filter(Objects::nonNull).map(this::lambda$activeAudit$0).collect(Collectors.toList()));
  }
  
  public ConsolidationAction consolidateIssues(AuditIssue paramAuditIssue1, AuditIssue paramAuditIssue2) {
    int i = this.Zt.consolidateDuplicateIssues(new Zzei(paramAuditIssue2), new Zzei(paramAuditIssue1));
    return Zxxw.Zr(i);
  }
  
  private Zlel lambda$activeAudit$0(IScanIssue paramIScanIssue) {
    return new Zlel(paramIScanIssue, this.Zm);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbqe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */