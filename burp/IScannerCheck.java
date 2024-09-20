package burp;

import java.util.List;

public interface IScannerCheck {
  List<IScanIssue> doPassiveScan(IHttpRequestResponse paramIHttpRequestResponse);
  
  List<IScanIssue> doActiveScan(IHttpRequestResponse paramIHttpRequestResponse, IScannerInsertionPoint paramIScannerInsertionPoint);
  
  int consolidateDuplicateIssues(IScanIssue paramIScanIssue1, IScanIssue paramIScanIssue2);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IScannerCheck.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */