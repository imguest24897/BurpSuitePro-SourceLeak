package burp;

import burp.api.montoya.core.Registration;
import burp.api.montoya.scanner.AuditConfiguration;
import burp.api.montoya.scanner.Crawl;
import burp.api.montoya.scanner.CrawlConfiguration;
import burp.api.montoya.scanner.ReportFormat;
import burp.api.montoya.scanner.ScanCheck;
import burp.api.montoya.scanner.Scanner;
import burp.api.montoya.scanner.audit.Audit;
import burp.api.montoya.scanner.audit.AuditIssueHandler;
import burp.api.montoya.scanner.audit.insertionpoint.AuditInsertionPointProvider;
import burp.api.montoya.scanner.audit.issues.AuditIssue;
import burp.api.montoya.scanner.bchecks.BChecks;
import java.nio.file.Path;
import java.util.List;

public class Zz3a implements Scanner {
  private final Scanner ZO;
  
  public Zz3a(Zbiv paramZbiv, Zkl6 paramZkl6, Zbnt paramZbnt, Zr_4 paramZr_4, Zsuv paramZsuv, Zm37 paramZm37, Ztcy paramZtcy, Zlz3 paramZlz3, Zm5z paramZm5z, Ze2 paramZe2, Zkrj paramZkrj, Zskl paramZskl, BChecks paramBChecks, Zm6x paramZm6x) {
    this.ZO = new Zbxt(paramZbiv, paramZkl6, paramZbnt, paramZr_4, paramZsuv, paramZm37, paramZtcy, paramZlz3, paramZm5z, paramZe2, paramZkrj, paramZskl, paramBChecks, paramZm6x);
  }
  
  public Registration registerAuditIssueHandler(AuditIssueHandler paramAuditIssueHandler) {
    return this.ZO.registerAuditIssueHandler(paramAuditIssueHandler);
  }
  
  public Registration registerScanCheck(ScanCheck paramScanCheck) {
    return this.ZO.registerScanCheck(paramScanCheck);
  }
  
  public Registration registerInsertionPointProvider(AuditInsertionPointProvider paramAuditInsertionPointProvider) {
    return this.ZO.registerInsertionPointProvider(paramAuditInsertionPointProvider);
  }
  
  public Crawl startCrawl(CrawlConfiguration paramCrawlConfiguration) {
    return this.ZO.startCrawl(paramCrawlConfiguration);
  }
  
  public Audit startAudit(AuditConfiguration paramAuditConfiguration) {
    return this.ZO.startAudit(paramAuditConfiguration);
  }
  
  public void generateReport(List<AuditIssue> paramList, ReportFormat paramReportFormat, Path paramPath) {
    this.ZO.generateReport(paramList, paramReportFormat, paramPath);
  }
  
  public BChecks bChecks() {
    return this.ZO.bChecks();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz3a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */