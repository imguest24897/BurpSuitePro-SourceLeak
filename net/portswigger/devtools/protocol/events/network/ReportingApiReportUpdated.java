package net.portswigger.devtools.protocol.events.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.network.ReportingApiReport;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.network.ReportingApiReportUpdated")
public class ReportingApiReportUpdated implements Zl {
  @Zvd(Zp = "report")
  public final ReportingApiReport report;
  
  @Zox
  public ReportingApiReportUpdated(@Zc5(Ze = "report") ReportingApiReport paramReportingApiReport) {
    this.report = paramReportingApiReport;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\ReportingApiReportUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */