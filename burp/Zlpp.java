package burp;

import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.scanner.audit.insertionpoint.AuditInsertionPoint;
import burp.api.montoya.scanner.audit.insertionpoint.AuditInsertionPointProvider;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Zlpp implements AuditInsertionPointProvider {
  private final IScannerInsertionPointProvider Zo;
  
  private final Zzqf ZW;
  
  public Zlpp(IScannerInsertionPointProvider paramIScannerInsertionPointProvider, Zzqf paramZzqf) {
    this.Zo = paramIScannerInsertionPointProvider;
    this.ZW = paramZzqf;
  }
  
  public List<AuditInsertionPoint> provideInsertionPoints(HttpRequestResponse paramHttpRequestResponse) {
    Zr0z zr0z = new Zr0z(paramHttpRequestResponse, this.ZW);
    List<IScannerInsertionPoint> list = this.Zo.getInsertionPoints(zr0z);
    return (list == null) ? null : (List<AuditInsertionPoint>)list.stream().filter(Objects::nonNull).map(this::lambda$provideInsertionPoints$0).collect(Collectors.toList());
  }
  
  private Zb_a lambda$provideInsertionPoints$0(IScannerInsertionPoint paramIScannerInsertionPoint) {
    return new Zb_a(paramIScannerInsertionPoint, this.ZW);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlpp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */