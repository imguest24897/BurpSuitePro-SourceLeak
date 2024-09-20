package burp;

import java.util.HashMap;
import java.util.Map;

class Zz2y implements Zewu {
  private final Map<Long, Long> ZQ = new HashMap<>();
  
  public void Zi(Zgpi paramZgpi1, Zgpi paramZgpi2) {
    this.ZQ.put(Long.valueOf(((Zxsr)paramZgpi1).ZXU()), Long.valueOf(((Zxsr)paramZgpi2).ZXU()));
  }
  
  public Long ZY(Zgpi paramZgpi, Zkit paramZkit) {
    long l = ((Zxsr)paramZgpi).ZXU();
    Long long_ = this.ZQ.get(Long.valueOf(l));
    return (long_ == null && paramZkit.ZV((Zxsr)paramZgpi)) ? Long.valueOf(l) : long_;
  }
  
  public void Zk() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz2y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */