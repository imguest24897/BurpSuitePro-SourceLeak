package burp;

public interface IScanQueueItem {
  String getStatus();
  
  @Deprecated
  byte getPercentageComplete();
  
  int getNumRequests();
  
  int getNumErrors();
  
  int getNumInsertionPoints();
  
  void cancel();
  
  IScanIssue[] getIssues();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IScanQueueItem.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */