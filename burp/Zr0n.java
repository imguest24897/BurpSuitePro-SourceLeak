package burp;

import burp.api.montoya.core.Range;
import burp.api.montoya.http.message.HttpRequestResponse;
import java.util.Collections;
import java.util.List;

public class Zr0n extends Zr0z implements IHttpRequestResponseWithMarkers {
  private final List<int[]> Zv;
  
  private final List<int[]> Zz;
  
  public Zr0n(HttpRequestResponse paramHttpRequestResponse, Zzqf paramZzqf, List<Range> paramList1, List<Range> paramList2) {
    super(paramHttpRequestResponse, paramZzqf);
    this.Zv = (paramList1 == null) ? (List)Collections.<int[]>emptyList() : (List)paramList1.stream().map(Zr0n::lambda$new$0).toList();
    this.Zz = (paramList2 == null) ? (List)Collections.<int[]>emptyList() : (List)paramList2.stream().map(Zr0n::lambda$new$0).toList();
  }
  
  public List<int[]> getRequestMarkers() {
    return this.Zv;
  }
  
  public List<int[]> getResponseMarkers() {
    return this.Zz;
  }
  
  private static int[] lambda$new$0(Range paramRange) {
    return new int[] { paramRange.startIndexInclusive(), paramRange.endIndexExclusive() };
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr0n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */