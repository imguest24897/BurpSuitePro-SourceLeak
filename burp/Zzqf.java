package burp;

import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.HighlightColor;
import burp.api.montoya.core.Range;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.params.HttpParameter;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.intruder.HttpRequestTemplate;
import burp.api.montoya.scanner.AuditConfiguration;
import burp.api.montoya.scanner.AuditResult;
import burp.api.montoya.scanner.BuiltInAuditConfiguration;
import burp.api.montoya.scanner.CrawlConfiguration;
import burp.api.montoya.scanner.audit.insertionpoint.AuditInsertionPoint;
import burp.api.montoya.scanner.audit.issues.AuditIssue;
import burp.api.montoya.scanner.audit.issues.AuditIssueDefinition;
import burp.api.montoya.sitemap.SiteMapFilter;
import burp.api.montoya.ui.Selection;
import java.util.List;

public interface Zzqf {
  HttpService Zg(IHttpService paramIHttpService);
  
  HttpService Zh(String paramString, int paramInt, boolean paramBoolean);
  
  Annotations Za(String paramString1, String paramString2);
  
  HttpRequest Zo(HttpService paramHttpService, byte[] paramArrayOfbyte);
  
  HttpRequestResponse ZE(IHttpRequestResponse paramIHttpRequestResponse);
  
  HttpRequestResponse ZU(IHttpRequestResponse paramIHttpRequestResponse);
  
  HttpRequestResponse ZP(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2);
  
  HttpRequest ZT(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte);
  
  HttpRequest Zj(IHttpService paramIHttpService, byte[] paramArrayOfbyte);
  
  HttpRequest Z_(String paramString);
  
  HttpRequest Zq(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte);
  
  HttpResponse Zc(byte[] paramArrayOfbyte);
  
  ByteArray ZI(byte[] paramArrayOfbyte);
  
  HighlightColor ZB(String paramString);
  
  Selection ZP(byte[] paramArrayOfbyte);
  
  Range ZK(int[] paramArrayOfint);
  
  Range Z_(int paramInt1, int paramInt2);
  
  AuditIssueDefinition Za(String paramString1, String paramString2, String paramString3, String paramString4);
  
  HttpParameter ZU(IParameter paramIParameter);
  
  AuditInsertionPoint Zx(String paramString, byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  AuditResult Zi(List<AuditIssue> paramList);
  
  HttpRequestTemplate Zp(byte[] paramArrayOfbyte, List<int[]> paramList);
  
  SiteMapFilter ZL(String paramString);
  
  ByteArray Zb(byte[] paramArrayOfbyte);
  
  CrawlConfiguration ZI(String... paramVarArgs);
  
  AuditConfiguration ZC(BuiltInAuditConfiguration paramBuiltInAuditConfiguration);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzqf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */