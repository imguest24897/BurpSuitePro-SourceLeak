package burp;

import burp.api.montoya.scanner.audit.issues.AuditIssue;
import burp.api.montoya.scanner.audit.issues.AuditIssueDefinition;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.function.Function;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zzei implements IScanIssue, Zzsg {
  private final AuditIssue Za;
  
  public Zzei(AuditIssue paramAuditIssue) {
    this.Za = paramAuditIssue;
  }
  
  public Zrdb ZD() {
    AuditIssue auditIssue = this.Za;
    if (auditIssue instanceof Proxyable) {
      Proxyable proxyable = (Proxyable)auditIssue;
      Object object = proxyable.proxiedObject();
      if (object instanceof Zkf_) {
        Zkf_ zkf_ = (Zkf_)object;
        return zkf_.ZI();
      } 
    } 
    return null;
  }
  
  public URL getUrl() {
    try {
      String str = this.Za.baseUrl();
      try {
      
      } catch (MalformedURLException malformedURLException) {
        throw a(null);
      } 
      return (str == null) ? null : new URL(str);
    } catch (MalformedURLException malformedURLException) {
      Zah.Zl(malformedURLException, Zk_.UNEXPECTED);
      throw new RuntimeException(malformedURLException);
    } 
  }
  
  public String getIssueName() {
    return this.Za.name();
  }
  
  public int getIssueType() {
    AuditIssueDefinition auditIssueDefinition = this.Za.definition();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (auditIssueDefinition == null) ? Zzu2.EXTENSION_GENERATED.ZS() : auditIssueDefinition.typeIndex();
  }
  
  public String getSeverity() {
    byte b = Zblx.Z_(this.Za.severity());
    return Zls9.Zx(b);
  }
  
  public String getConfidence() {
    byte b = Zblx.Zo(this.Za.confidence());
    return Zewc.ZO(b);
  }
  
  public String getIssueBackground() {
    AuditIssueDefinition auditIssueDefinition = this.Za.definition();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (auditIssueDefinition == null) ? null : auditIssueDefinition.background();
  }
  
  public String getRemediationBackground() {
    AuditIssueDefinition auditIssueDefinition = this.Za.definition();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (auditIssueDefinition == null) ? null : auditIssueDefinition.remediation();
  }
  
  public String getIssueDetail() {
    return this.Za.detail();
  }
  
  public String getRemediationDetail() {
    return this.Za.remediation();
  }
  
  public IHttpRequestResponse[] getHttpMessages() {
    List list = this.Za.requestResponses();
    try {
      if (list == null)
        return new IHttpRequestResponse[0]; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (IHttpRequestResponse[])list.stream().map(Zswa::new).toArray(Zzei::lambda$getHttpMessages$0);
  }
  
  public IHttpService getHttpService() {
    return Zzgg.ZG(this.Za.httpService());
  }
  
  public String getHost() {
    IHttpService iHttpService = getHttpService();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (iHttpService == null) ? null : iHttpService.getHost();
  }
  
  public int getPort() {
    IHttpService iHttpService = getHttpService();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (iHttpService == null) ? 0 : iHttpService.getPort();
  }
  
  public String getProtocol() {
    IHttpService iHttpService = getHttpService();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (iHttpService == null) ? null : iHttpService.getProtocol();
  }
  
  public Ztub ZV() {
    AuditIssue auditIssue = this.Za;
    Zzsg zzsg = (Zzsg)auditIssue;
    return (auditIssue instanceof Zzsg) ? zzsg.ZV() : Ztub.ZT();
  }
  
  private static IHttpRequestResponse[] lambda$getHttpMessages$0(int paramInt) {
    return new IHttpRequestResponse[paramInt];
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzei.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */