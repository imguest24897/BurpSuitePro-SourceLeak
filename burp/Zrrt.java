package burp;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

class Zrrt implements Zm1e {
  private final Ze3n ZL;
  
  private final Zsxd Zt;
  
  private final Map<Zkqu, byte[]> ZG;
  
  private final Zsxd ZQ;
  
  private final AtomicReference<Zx_5> ZO;
  
  public Zrrt(Ze3n paramZe3n, Zsxd paramZsxd1, Map<Zkqu, byte[]> paramMap, Zsxd paramZsxd2) {
    this.ZL = paramZe3n;
    this.Zt = paramZsxd1;
    this.ZG = paramMap;
    this.ZQ = paramZsxd2;
    this.ZO = new AtomicReference<>();
  }
  
  public void ZT(Zzxr paramZzxr) {
    if (!paramZzxr.ZY(this.Zt)) {
      Optional optional = this.ZG.entrySet().stream().filter(this::lambda$visit$0).findFirst();
      optional.ifPresent(this::lambda$visit$1);
    } 
  }
  
  public void ZX(Zl2e paramZl2e) {
    if (paramZl2e.ZY(this.Zt))
      this.ZO.set(Ztvl.ZY(this.ZL, this.ZQ, this.Zt.ZG().ZL().ZD(), this.Zt)); 
  }
  
  public Optional<Zx_5> Zc() {
    return Optional.ofNullable(this.ZO.get());
  }
  
  private void lambda$visit$1(Map.Entry paramEntry) {
    this.ZO.set(Ztvl.ZY(this.ZL, this.ZQ, (byte[])paramEntry.getValue(), this.Zt));
  }
  
  private boolean lambda$visit$0(Map.Entry paramEntry) {
    return ((Zkqu)paramEntry.getKey()).ZY(this.Zt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrrt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */