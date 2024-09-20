package burp;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Zg2f implements Zkvo {
  private final String Zd;
  
  private final String Za;
  
  private final String Zp;
  
  private final long ZB;
  
  private final int Zr;
  
  private final Ze9m Zc;
  
  private final int ZR;
  
  private final String Zq;
  
  private final Zxje Zj;
  
  private final Zlnv Ze;
  
  Zg2f(String paramString1, String paramString2, String paramString3, long paramLong, int paramInt1, Ze9m paramZe9m, int paramInt2, String paramString4, Zxje paramZxje, Zlnv paramZlnv) {
    this.Zd = paramString1;
    this.Za = paramString2;
    this.Zp = paramString3;
    this.ZB = paramLong;
    this.Zr = paramInt1;
    this.Zc = paramZe9m;
    this.ZR = paramInt2;
    this.Zq = paramString4;
    this.Zj = paramZxje;
    this.Ze = paramZlnv;
  }
  
  public Date Zl() {
    return new Date(Zw());
  }
  
  public boolean ZJ(Zrgd paramZrgd) {
    return paramZrgd.Zn().plus((Zc()).expiryCloseTimeInDays, ChronoUnit.DAYS).isAfter(Instant.ofEpochMilli(Zw()));
  }
  
  public String ZF() {
    return this.Zd;
  }
  
  public String Zr() {
    return this.Za;
  }
  
  public String Zb() {
    return this.Ze.ZB(this.Za);
  }
  
  public String ZE() {
    return this.Zp;
  }
  
  public long Zw() {
    return this.ZB;
  }
  
  public int Zm() {
    return this.Zr;
  }
  
  public Ze9m Zc() {
    return this.Zc;
  }
  
  public int Zy() {
    return this.ZR;
  }
  
  public String ZI() {
    return this.Zq;
  }
  
  public Zxje ZW() {
    return this.Zj;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg2f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */