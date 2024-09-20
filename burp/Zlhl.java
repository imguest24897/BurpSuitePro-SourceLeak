package burp;

import java.util.Collection;
import java.util.List;

public class Zlhl implements Zras<Zm9l> {
  private final Zrim ZF;
  
  private final Zzcs Zf;
  
  private final Collection<Zt8i> Zk;
  
  public Zlhl(Zrim paramZrim, Zzcs paramZzcs, Collection<Zt8i> paramCollection) {
    this.ZF = paramZrim;
    this.Zf = paramZzcs;
    this.Zk = paramCollection;
  }
  
  public List<Zm9l> Zn() {
    Collection<Zeu9> collection = this.ZF.Zh(this.Zf.ZM());
    return collection.stream().map(this::lambda$getCandidateRoomsForMatching$0).toList();
  }
  
  private Zm9l lambda$getCandidateRoomsForMatching$0(Zeu9 paramZeu9) {
    return !this.Zk.isEmpty() ? Zm9l.Zp(paramZeu9) : Zm9l.Ze(paramZeu9);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlhl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */