package net.portswigger;

import burp.Zbqc;
import java.util.Objects;

@Zsi("ScanMetrics")
public class Zrm3 {
  @Zvd(Zp = "currentUrl")
  public final String ZX;
  
  @Zvd(Zp = "crawlRequestsMade")
  public final int Zg;
  
  @Zvd(Zp = "crawlNetworkErrors")
  public final int ZQ;
  
  @Zvd(Zp = "crawlUniqueLocationsVisited")
  public final int ZZ;
  
  @Zvd(Zp = "crawlRequestsQueued")
  public final int ZB;
  
  @Zvd(Zp = "auditQueueItemsCompleted")
  public final int ZG;
  
  @Zvd(Zp = "auditQueueItemsWaiting")
  public final int Zp;
  
  @Zvd(Zp = "auditRequestsMade")
  public final int ZY;
  
  @Zvd(Zp = "auditNetworkErrors")
  public final int Zw;
  
  @Zvd(Zp = "issueEvents")
  public final int Zr;
  
  @Zvd(Zp = "crawlAndAuditCaption")
  public final String ZW;
  
  @Zvd(Zp = "crawlAndAuditProgress")
  public final int ZD;
  
  @Zvd(Zp = "totalElapsedTime")
  public final int Za;
  
  @Zox
  public Zrm3(@Zc5(Ze = "currentUrl") String paramString1, @Zc5(Ze = "crawlRequestsMade") int paramInt1, @Zc5(Ze = "crawlNetworkErrors") int paramInt2, @Zc5(Ze = "crawlUniqueLocationsVisited") int paramInt3, @Zc5(Ze = "crawlRequestsQueued") int paramInt4, @Zc5(Ze = "auditQueueItemsCompleted") int paramInt5, @Zc5(Ze = "auditQueueItemsWaiting") int paramInt6, @Zc5(Ze = "auditRequestsMade") int paramInt7, @Zc5(Ze = "auditNetworkErrors") int paramInt8, @Zc5(Ze = "issueEvents") int paramInt9, @Zc5(Ze = "crawlAndAuditCaption", ZS = "null") String paramString2, @Zc5(Ze = "crawlAndAuditProgress") int paramInt10, @Zc5(Ze = "totalElapsedTime") int paramInt11) {
    this.ZX = paramString1;
    this.Zg = paramInt1;
    this.ZQ = paramInt2;
    this.ZZ = paramInt3;
    this.ZB = paramInt4;
    this.ZG = paramInt5;
    this.Zp = paramInt6;
    this.ZY = paramInt7;
    this.Zw = paramInt8;
    this.Zr = paramInt9;
    this.ZW = paramString2;
    this.ZD = paramInt10;
    this.Za = paramInt11;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zrm3 zrm3 = (Zrm3)paramObject;
    return (Objects.equals(this.ZX, zrm3.ZX) && this.Zg == zrm3.Zg && this.ZQ == zrm3.ZQ && this.ZZ == zrm3.ZZ && this.ZB == zrm3.ZB && this.ZG == zrm3.ZG && this.Zp == zrm3.Zp && this.ZY == zrm3.ZY && this.Zw == zrm3.Zw && this.Zr == zrm3.Zr && this.ZD == zrm3.ZD && this.Za == zrm3.Za && Objects.equals(this.ZW, zrm3.ZW));
  }
  
  public int hashCode() {
    String str = Zgx.ZP();
    if (str == null)
      Zbqc.Zr(new Zbqc[4]); 
    return Objects.hash(new Object[] { 
          this.ZX, Integer.valueOf(this.Zg), Integer.valueOf(this.ZQ), Integer.valueOf(this.ZZ), Integer.valueOf(this.ZB), Integer.valueOf(this.ZG), Integer.valueOf(this.Zp), Integer.valueOf(this.ZY), Integer.valueOf(this.Zw), Integer.valueOf(this.Zr), 
          this.ZW, Integer.valueOf(this.ZD), Integer.valueOf(this.Za) });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrm3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */