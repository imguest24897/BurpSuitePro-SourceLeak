package burp;

import burp.api.montoya.scanner.audit.AuditIssueHandler;
import burp.api.montoya.scanner.audit.issues.AuditIssue;

public class Zgbe implements AuditIssueHandler {
  private final IScannerListener Zx;
  
  public Zgbe(IScannerListener paramIScannerListener) {
    this.Zx = paramIScannerListener;
  }
  
  public void handleNewAuditIssue(AuditIssue paramAuditIssue) {
    Zzei zzei = new Zzei(paramAuditIssue);
    this.Zx.newScanIssue(zzei);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgbe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */