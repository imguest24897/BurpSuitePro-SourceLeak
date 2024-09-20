package burp;

import burp.api.montoya.core.Range;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.scanner.audit.insertionpoint.AuditInsertionPoint;
import java.util.List;

public class Zg_2 implements IScannerInsertionPoint {
  private final AuditInsertionPoint Zr;
  
  private final Zzqf Zn;
  
  public Zg_2(AuditInsertionPoint paramAuditInsertionPoint, Zzqf paramZzqf) {
    this.Zr = paramAuditInsertionPoint;
    this.Zn = paramZzqf;
  }
  
  public String getInsertionPointName() {
    return this.Zr.name();
  }
  
  public String getBaseValue() {
    return this.Zr.baseValue();
  }
  
  public byte[] buildRequest(byte[] paramArrayOfbyte) {
    HttpRequest httpRequest = this.Zr.buildHttpRequestWithPayload(this.Zn.ZI(paramArrayOfbyte));
    return httpRequest.toByteArray().getBytes();
  }
  
  public int[] getPayloadOffsets(byte[] paramArrayOfbyte) {
    List<Range> list = this.Zr.issueHighlights(this.Zn.ZI(paramArrayOfbyte));
    if (list == null || list.isEmpty())
      return null; 
    Range range = list.get(0);
    return new int[] { range.startIndexInclusive(), range.endIndexExclusive() };
  }
  
  public byte getInsertionPointType() {
    return Zzgg.ZB(this.Zr.type());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg_2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */