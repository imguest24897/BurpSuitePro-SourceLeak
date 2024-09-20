package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Range;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.scanner.audit.insertionpoint.AuditInsertionPoint;
import burp.api.montoya.scanner.audit.insertionpoint.AuditInsertionPointType;
import java.util.Collections;
import java.util.List;

public class Zb_a implements AuditInsertionPoint {
  private final IScannerInsertionPoint Zg;
  
  private final Zzqf ZS;
  
  public Zb_a(IScannerInsertionPoint paramIScannerInsertionPoint, Zzqf paramZzqf) {
    this.Zg = paramIScannerInsertionPoint;
    this.ZS = paramZzqf;
  }
  
  public String name() {
    return this.Zg.getInsertionPointName();
  }
  
  public String baseValue() {
    return this.Zg.getBaseValue();
  }
  
  public HttpRequest buildHttpRequestWithPayload(ByteArray paramByteArray) {
    byte[] arrayOfByte = this.Zg.buildRequest(paramByteArray.getBytes());
    return this.ZS.Zj((IHttpService)null, arrayOfByte);
  }
  
  public List<Range> issueHighlights(ByteArray paramByteArray) {
    int[] arrayOfInt = this.Zg.getPayloadOffsets(paramByteArray.getBytes());
    return (arrayOfInt == null) ? Collections.<Range>emptyList() : List.<Range>of(this.ZS.Z_(arrayOfInt[0], arrayOfInt[1]));
  }
  
  public AuditInsertionPointType type() {
    return Zxxw.ZC(this.Zg.getInsertionPointType());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb_a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */