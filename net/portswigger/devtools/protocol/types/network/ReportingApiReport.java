package net.portswigger.devtools.protocol.types.network;

import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.ReportingApiReport")
public class ReportingApiReport {
  @Zvd(Zp = "id")
  public final String id;
  
  @Zvd(Zp = "initiatorUrl")
  public final String initiatorUrl;
  
  @Zvd(Zp = "destination")
  public final String destination;
  
  @Zvd(Zp = "type")
  public final String type;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "depth")
  public final Integer depth;
  
  @Zvd(Zp = "completedAttempts")
  public final Integer completedAttempts;
  
  @Zvd(Zp = "body")
  public final Map<String, Zi7> body;
  
  @Zvd(Zp = "status")
  public final ReportStatus status;
  
  @Zox
  public ReportingApiReport(@Zc5(Ze = "id") String paramString1, @Zc5(Ze = "initiatorUrl") String paramString2, @Zc5(Ze = "destination") String paramString3, @Zc5(Ze = "type") String paramString4, @Zc5(Ze = "timestamp") Double paramDouble, @Zc5(Ze = "depth") Integer paramInteger1, @Zc5(Ze = "completedAttempts") Integer paramInteger2, @Zc5(Ze = "body") Map<String, Zi7> paramMap, @Zc5(Ze = "status") ReportStatus paramReportStatus) {
    this.id = paramString1;
    this.initiatorUrl = paramString2;
    this.destination = paramString3;
    this.type = paramString4;
    this.timestamp = paramDouble;
    this.depth = paramInteger1;
    this.completedAttempts = paramInteger2;
    this.body = paramMap;
    this.status = paramReportStatus;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\ReportingApiReport.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */