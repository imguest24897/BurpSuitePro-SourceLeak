package burp;

import burp.api.montoya.scanner.audit.issues.AuditIssue;
import burp.api.montoya.ui.contextmenu.AuditIssueContextMenuEvent;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Zrvy extends Zrvt implements AuditIssueContextMenuEvent {
  private final Zezw Z_;
  
  private final Zzqf ZT;
  
  public Zrvy(Zezw paramZezw, Zzqf paramZzqf) {
    super(paramZezw);
    this.Z_ = paramZezw;
    this.ZT = paramZzqf;
  }
  
  public List<AuditIssue> selectedIssues() {
    IScanIssue[] arrayOfIScanIssue = this.Z_.ZF();
    return (arrayOfIScanIssue == null) ? Collections.<AuditIssue>emptyList() : (List<AuditIssue>)Arrays.<IScanIssue>stream(arrayOfIScanIssue).filter(Objects::nonNull).map(this::lambda$selectedIssues$0).collect(Collectors.toList());
  }
  
  private Zlel lambda$selectedIssues$0(IScanIssue paramIScanIssue) {
    return new Zlel(paramIScanIssue, this.ZT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrvy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */