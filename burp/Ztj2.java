package burp;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

class Ztj2 implements Zg3d {
  private final Zefx ZV;
  
  private final Zefx ZD;
  
  private final Zb6q ZO;
  
  private final Zvom ZY;
  
  private final Instant Ze;
  
  private final Instant Z_;
  
  private final Duration Zq;
  
  private final Duration Zs;
  
  private final Exception ZL;
  
  private Ztj2(Zefx paramZefx1, Zefx paramZefx2, Zb6q paramZb6q, Zvom paramZvom, Instant paramInstant1, Instant paramInstant2, Duration paramDuration1, Duration paramDuration2, Exception paramException) {
    this.ZV = paramZefx1;
    this.ZD = paramZefx2;
    this.ZO = paramZb6q;
    this.ZY = paramZvom;
    this.Ze = paramInstant1;
    this.Z_ = paramInstant2;
    this.Zq = paramDuration1;
    this.Zs = paramDuration2;
    this.ZL = paramException;
  }
  
  public Zvom Zb() {
    return this.ZY;
  }
  
  public Exception Zx() {
    return this.ZL;
  }
  
  public Zefx ZR() {
    return this.ZV;
  }
  
  public Zefx ZL() {
    return this.ZD;
  }
  
  public Zb6q Ze() {
    return this.ZO;
  }
  
  public long ZQ() {
    return (this.Ze == null) ? 0L : this.Ze.toEpochMilli();
  }
  
  public long ZA() {
    return (this.Z_ == null) ? 0L : this.Z_.toEpochMilli();
  }
  
  public Duration Zs() {
    return this.Zq;
  }
  
  public Duration ZS() {
    return this.Zs;
  }
  
  public boolean equals(Object paramObject) {
    int i = Zloq.Zo();
    if (paramObject instanceof Zg3d) {
      Zg3d zg3d = (Zg3d)paramObject;
      if (i != 0) {
        Zb6q zb6q1 = Ze();
        Zb6q zb6q2 = zg3d.Ze();
        return (Zb() == zg3d.Zb() && this.ZV.ZT().equals(zg3d.ZR().ZT()) && Arrays.equals(this.ZV.ZD(), zg3d.ZR().ZD()) && ((this.ZD == null && zg3d.ZL() == null) || (this.ZD != null && zg3d.ZL() != null && this.ZD.ZT().equals(zg3d.ZL().ZT()) && Arrays.equals(this.ZD.ZD(), zg3d.ZL().ZD()))) && this.Zq.equals(zg3d.Zs()) && this.Zs.equals(zg3d.ZS()) && ((zb6q1 == null && zb6q2 == null) || (zb6q1 != null && zb6q1.equals(zb6q2))));
      } 
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztj2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */