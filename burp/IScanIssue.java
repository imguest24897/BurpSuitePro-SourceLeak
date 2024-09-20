package burp;

import java.net.URL;

public interface IScanIssue {
  URL getUrl();
  
  String getIssueName();
  
  int getIssueType();
  
  String getSeverity();
  
  String getConfidence();
  
  String getIssueBackground();
  
  String getRemediationBackground();
  
  String getIssueDetail();
  
  String getRemediationDetail();
  
  IHttpRequestResponse[] getHttpMessages();
  
  IHttpService getHttpService();
  
  @Deprecated
  String getHost();
  
  @Deprecated
  int getPort();
  
  @Deprecated
  String getProtocol();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IScanIssue.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */