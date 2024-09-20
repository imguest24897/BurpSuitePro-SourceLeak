package burp;

import burp.api.montoya.scanner.AuditResult;
import burp.api.montoya.scanner.audit.issues.AuditIssue;
import java.util.List;

class Zkto implements AuditResult {
  private final List<AuditIssue> ZR;
  
  Zkto(List<AuditIssue> paramList) {
    this.ZR = paramList;
  }
  
  Zkto(AuditIssue... paramVarArgs) {
    this.ZR = List.of(paramVarArgs);
  }
  
  public List<AuditIssue> auditIssues() {
    return this.ZR;
  }
  
  static AuditResult ZG(List<AuditIssue> paramList) {
    return new Zkto(paramList);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkto.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */