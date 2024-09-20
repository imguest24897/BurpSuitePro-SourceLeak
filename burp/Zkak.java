package burp;

import burp.api.montoya.scanner.audit.Audit;
import java.util.function.Function;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zkak implements IScanQueueItem {
  private final Audit Zc;
  
  public Zkak(Audit paramAudit) {
    this.Zc = paramAudit;
  }
  
  public String getStatus() {
    return this.Zc.statusMessage();
  }
  
  public byte getPercentageComplete() {
    return 0;
  }
  
  public int getNumRequests() {
    return this.Zc.requestCount();
  }
  
  public int getNumErrors() {
    return this.Zc.errorCount();
  }
  
  public int getNumInsertionPoints() {
    return this.Zc.insertionPointCount();
  }
  
  public void cancel() {
    this.Zc.delete();
  }
  
  public IScanIssue[] getIssues() {
    try {
      return (IScanIssue[])this.Zc.issues().stream().map(Zzei::new).toArray(Zkak::lambda$getIssues$0);
    } catch (UnsupportedOperationException unsupportedOperationException) {
      Zah.Zl(unsupportedOperationException, Zk_.IGNORED);
      return new IScanIssue[0];
    } 
  }
  
  private static IScanIssue[] lambda$getIssues$0(int paramInt) {
    return new IScanIssue[paramInt];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkak.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */