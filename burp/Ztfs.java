package burp;

import java.util.List;

public class Ztfs {
  public final Zkcl ZO;
  
  final boolean Zk;
  
  final Ztj1 Za;
  
  public final Zzxj Zj;
  
  public final List<String> Zp;
  
  public final List<? extends Zll9> ZR;
  
  public final List<int[]> Zo;
  
  public final boolean ZL;
  
  public Ztfs(Zkcl paramZkcl, Zzxj paramZzxj, List<String> paramList, List<? extends Zll9> paramList1) {
    this(paramZkcl, false, null, paramZzxj, paramList, paramList1, null, false);
  }
  
  public Ztfs(List<? extends Zll9> paramList, List<int[]> paramList1) {
    this(Zkcl.SCAN_AUDIT, false, null, null, null, paramList, paramList1, false);
  }
  
  public Ztfs(Zkcl paramZkcl, boolean paramBoolean1, Ztj1 paramZtj1, Zzxj paramZzxj, List<String> paramList, List<? extends Zll9> paramList1, List<int[]> paramList2, boolean paramBoolean2) {
    this.ZO = paramZkcl;
    this.Zk = paramBoolean1;
    this.Za = paramZtj1;
    this.Zj = paramZzxj;
    this.Zp = paramList;
    this.ZR = paramList1;
    this.Zo = paramList2;
    this.ZL = paramBoolean2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztfs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */