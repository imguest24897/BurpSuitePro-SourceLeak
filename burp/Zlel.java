package burp;

import burp.api.montoya.collaborator.Interaction;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.scanner.audit.issues.AuditIssue;
import burp.api.montoya.scanner.audit.issues.AuditIssueConfidence;
import burp.api.montoya.scanner.audit.issues.AuditIssueDefinition;
import burp.api.montoya.scanner.audit.issues.AuditIssueSeverity;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Zlel implements AuditIssue, Zzsg {
  private final IScanIssue ZW;
  
  private final Zzqf ZJ;
  
  private static String[] Zb;
  
  public Zlel(IScanIssue paramIScanIssue, Zzqf paramZzqf) {
    this.ZW = paramIScanIssue;
    this.ZJ = paramZzqf;
  }
  
  public IScanIssue Zn() {
    return this.ZW;
  }
  
  public String name() {
    return this.ZW.getIssueName();
  }
  
  public String detail() {
    return this.ZW.getIssueDetail();
  }
  
  public String remediation() {
    return this.ZW.getRemediationDetail();
  }
  
  public HttpService httpService() {
    return this.ZJ.Zg(this.ZW.getHttpService());
  }
  
  public String baseUrl() {
    URL uRL = this.ZW.getUrl();
    return (uRL == null) ? null : uRL.toString();
  }
  
  public AuditIssueSeverity severity() {
    return Zt6v.Zk(Zls9.Zq(this.ZW.getSeverity()));
  }
  
  public AuditIssueConfidence confidence() {
    return Zt6v.ZF(Zewc.ZB(this.ZW.getConfidence()));
  }
  
  public List<HttpRequestResponse> requestResponses() {
    IHttpRequestResponse[] arrayOfIHttpRequestResponse = this.ZW.getHttpMessages();
    Objects.requireNonNull(this.ZJ);
    return (arrayOfIHttpRequestResponse == null) ? Collections.<HttpRequestResponse>emptyList() : (List<HttpRequestResponse>)Arrays.<IHttpRequestResponse>stream(arrayOfIHttpRequestResponse).filter(Objects::nonNull).map(this.ZJ::ZU).collect(Collectors.toList());
  }
  
  public List<Interaction> collaboratorInteractions() {
    return Collections.emptyList();
  }
  
  public AuditIssueDefinition definition() {
    return this.ZJ.Za(this.ZW.getIssueName(), this.ZW.getIssueBackground(), this.ZW.getRemediationBackground(), this.ZW.getSeverity());
  }
  
  public Ztub ZV() {
    IScanIssue iScanIssue = this.ZW;
    Zzsg zzsg = (Zzsg)iScanIssue;
    return (iScanIssue instanceof Zzsg) ? zzsg.ZV() : Ztub.ZT();
  }
  
  public static void Zj(String[] paramArrayOfString) {
    Zb = paramArrayOfString;
  }
  
  public static String[] Zs() {
    return Zb;
  }
  
  static {
    if (Zs() == null)
      Zj(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlel.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */