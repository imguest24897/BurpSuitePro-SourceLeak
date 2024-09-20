package net.portswigger;

import java.util.List;
import java.util.Objects;

@Zsi("ScanProgress")
public class Zgu extends Zgx {
  @Zvd(Zp = "scanMetrics")
  public final Zrm3 ZX;
  
  @Zvd(Zp = "issueEvents")
  public List<Z_g> Zd;
  
  @Zvd(Zp = "eventLogs")
  public final List<Ztx> Zn;
  
  @Zvd(Zp = "auditQueueItems")
  public final List<Zil> Zl;
  
  @Zvd(Zp = "auditItems")
  public final List<Zou> ZF;
  
  @Zvd(Zp = "enabledIssueTypeIndices")
  public final List<Integer> ZO;
  
  @Zox
  public Zgu(@Zc5(Ze = "taskId") String paramString1, @Zc5(Ze = "scanStatus") Zdc paramZdc, @Zc5(Ze = "scanMetrics") Zrm3 paramZrm3, @Zc5(Ze = "message") String paramString2, @Zc5(Ze = "errorCode", ZS = "null") Integer paramInteger, @Zc5(Ze = "issueEvents") List<Z_g> paramList, @Zc5(Ze = "eventLogs", ZS = "null", ZT = true) List<Ztx> paramList1, @Zc5(Ze = "auditQueueItems", ZS = "null", ZT = true) List<Zil> paramList2, @Zc5(Ze = "auditItems", ZS = "null", ZT = true) List<Zou> paramList3, @Zc5(Ze = "enabledIssueTypeIndices", ZS = "null", ZT = true) List<Integer> paramList4) {
    super(paramString1, paramZdc, paramString2, paramInteger);
    this.ZX = paramZrm3;
    this.Zd = paramList;
    this.Zn = paramList1;
    this.Zl = paramList2;
    this.ZF = paramList3;
    this.ZO = paramList4;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    if (!super.equals(paramObject))
      return false; 
    Zgu zgu = (Zgu)paramObject;
    return (Objects.equals(this.ZX, zgu.ZX) && Objects.equals(this.Zd, zgu.Zd) && Objects.equals(this.Zn, zgu.Zn) && Objects.equals(this.Zl, zgu.Zl) && Objects.equals(this.ZF, zgu.ZF) && Objects.equals(this.ZO, zgu.ZO));
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.ZX, this.Zd, this.Zn, this.Zl, this.ZF, this.ZO });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zgu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */