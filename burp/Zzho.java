package burp;

import java.util.List;
import java.util.Map;

public class Zzho {
  private final Map<String, String> Z_;
  
  private final List<Zges> ZP;
  
  private final List<Zges> Zw;
  
  private final List<byte[]> Zj;
  
  private final int Zn;
  
  private final int Zo;
  
  private final boolean Zk;
  
  public Zzho(Map<String, String> paramMap, List<Zges> paramList1, List<Zges> paramList2, List<byte[]> paramList, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.Z_ = paramMap;
    this.ZP = paramList1;
    this.Zw = paramList2;
    this.Zj = paramList;
    this.Zn = paramInt1;
    this.Zo = paramInt2;
    this.Zk = paramBoolean;
  }
  
  public Map<String, String> ZZ() {
    return this.Z_;
  }
  
  public List<Zges> ZR() {
    return this.ZP;
  }
  
  public List<Zges> ZO() {
    return this.Zw;
  }
  
  public List<byte[]> Zv() {
    return this.Zj;
  }
  
  public boolean Zu() {
    return (this.Zn > 1 || this.Zo > 1);
  }
  
  public boolean ZV() {
    return this.Zk;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzho.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */