package net.portswigger;

import burp.Zbqc;
import java.util.List;
import java.util.Objects;

@Zsi(value = "AuditItem", ZD = true)
public class Zou {
  @Zvd(Zp = "host")
  public final String ZG;
  
  @Zvd(Zp = "path")
  public final String Zc;
  
  @Zvd(Zp = "method")
  public final String Zz;
  
  @Zvd(Zp = "status")
  public final String Zd;
  
  @Zvd(Zp = "errorTypes")
  public final List<Zi0> Zx;
  
  @Zvd(Zp = "numberOfRequests")
  public final int Ze;
  
  @Zvd(Zp = "numberOfErrors")
  public final int ZU;
  
  @Zvd(Zp = "numberOfInsertionPoints")
  public final int Zk;
  
  @Zvd(Zp = "startTime")
  public final String Zy;
  
  @Zvd(Zp = "endTime")
  public final String Zh;
  
  @Zvd(Zp = "issueSerialNumbers")
  public final List<Long> ZO;
  
  @Zox
  public Zou(@Zc5(Ze = "host") String paramString1, @Zc5(Ze = "path") String paramString2, @Zc5(Ze = "method") String paramString3, @Zc5(Ze = "status") String paramString4, @Zc5(Ze = "errorTypes") List<Zi0> paramList, @Zc5(Ze = "numberOfRequests") int paramInt1, @Zc5(Ze = "numberOfErrors") int paramInt2, @Zc5(Ze = "numberOfInsertionPoints") int paramInt3, @Zc5(Ze = "startTime") String paramString5, @Zc5(Ze = "endTime") String paramString6, @Zc5(Ze = "issueSerialNumbers") List<Long> paramList1) {
    this.ZG = paramString1;
    this.Zc = paramString2;
    this.Zz = paramString3;
    this.Zd = paramString4;
    this.Zx = paramList;
    this.Ze = paramInt1;
    this.ZU = paramInt2;
    this.Zk = paramInt3;
    this.Zy = paramString5;
    this.Zh = paramString6;
    this.ZO = paramList1;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zou zou = (Zou)paramObject;
    return (this.Ze == zou.Ze && this.ZU == zou.ZU && this.Zk == zou.Zk && Objects.equals(this.ZG, zou.ZG) && Objects.equals(this.Zc, zou.Zc) && Objects.equals(this.Zz, zou.Zz) && Objects.equals(this.Zd, zou.Zd) && Objects.equals(this.Zx, zou.Zx) && Objects.equals(this.Zy, zou.Zy) && Objects.equals(this.Zh, zou.Zh) && Objects.equals(this.ZO, zou.ZO));
  }
  
  public int hashCode() {
    String str = Zgx.ZP();
    if (Zbqc.Zwu() == null)
      Zgx.ZC("aecYLc"); 
    return Objects.hash(new Object[] { 
          this.ZG, this.Zc, this.Zz, this.Zd, this.Zx, Integer.valueOf(this.Ze), Integer.valueOf(this.ZU), Integer.valueOf(this.Zk), this.Zy, this.Zh, 
          this.ZO });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zou.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */