package com.fasterxml;

import burp.Zbqc;
import com.fasterxml.Zc.Zm;
import com.fasterxml.Zc.Zz;
import com.fasterxml.Zk.Zc;
import com.fasterxml.Zo.Zr;
import com.fasterxml.Zo.Zza;
import com.fasterxml.Zo.Zzi;
import com.fasterxml.Zor.Zs;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zoz.Zia;
import com.fasterxml.Zoz.Ziq;
import com.fasterxml.Zu.Zd;
import com.fasterxml.Zu.Zi;
import com.fasterxml.Zu.Zq;
import com.fasterxml.Zu.Zy;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public final class Zyf extends Zq {
  private static final long serialVersionUID = 1L;
  
  private Zz<Zy_> ZA = Zz.ZU((Zm[])Zy_.values());
  
  public Zyf() {
    super(Zyd.ZV);
  }
  
  public void setupModule(Zs paramZs) {
    super.setupModule(paramZs);
    Zi zi = new Zi();
    zi.Zc(Instant.class, (Zyo)Zqz.Zo.ZG(this.ZA));
    Zbqc[] arrayOfZbqc = Zg4.Zf();
    zi.Zc(OffsetDateTime.class, (Zyo)Zqz.ZP.ZG(this.ZA));
    zi.Zc(ZonedDateTime.class, (Zyo)Zqz.ZE.ZG(this.ZA));
    zi.Zc(Duration.class, (Zyo)Zqm.Zj);
    zi.Zc(LocalDateTime.class, (Zyo)Zqn.Zg);
    zi.Zc(LocalDate.class, (Zyo)Zq1.Zm);
    zi.Zc(LocalTime.class, (Zyo)Zqc.ZZ);
    zi.Zc(MonthDay.class, (Zyo)Zq7.ZX);
    zi.Zc(OffsetTime.class, (Zyo)Zqp.Zf);
    zi.Zc(Period.class, Zqx.ZV);
    zi.Zc(Year.class, (Zyo)Zql.ZN);
    zi.Zc(YearMonth.class, (Zyo)Zqb.ZT);
    zi.Zc(ZoneId.class, Zqx.ZE);
    zi.Zc(ZoneOffset.class, Zqx.Zq);
    paramZs.Zn((Zza)zi);
    boolean bool = this.ZA.ZR(Zy_.ONE_BASED_MONTHS);
    paramZs.ZJ(new Zq8(bool));
    paramZs.ZG(new Zqy(bool));
    if (this.ZM != null)
      paramZs.Zn((Zza)this.ZM); 
    Zy zy1 = new Zy();
    zy1.ZG(Duration.class, Zsi.Zm);
    zy1.ZG(Instant.class, Zsa.ZA);
    zy1.ZG(LocalDateTime.class, Zl_.ZI);
    zy1.ZG(LocalDate.class, Zlj.ZI);
    zy1.ZG(LocalTime.class, Zlv.ZR);
    zy1.ZG(MonthDay.class, Zl6.Za);
    zy1.ZG(OffsetDateTime.class, Zsg.ZG);
    zy1.ZG(OffsetTime.class, Zl0.ZW);
    zy1.ZG(Period.class, new Zs5(Period.class));
    zy1.ZG(Year.class, Zlo.ZA);
    zy1.ZG(YearMonth.class, Zlq.Zp);
    zy1.ZG(ZonedDateTime.class, Zsd.ZU);
    zy1.ZG(ZoneId.class, new Zs8());
    zy1.ZG(ZoneOffset.class, new Zs5(ZoneOffset.class));
    paramZs.Zb((Zc)zy1);
    if (this.ZY != null)
      paramZs.Zb((Zc)this.ZY); 
    Zy zy2 = new Zy();
    zy2.ZG(ZonedDateTime.class, Zlk.Zy);
    paramZs.Zn((Zc)zy2);
    if (this.Zt != null)
      paramZs.Zn((Zc)this.Zt); 
    Zd zd = new Zd();
    zd.Zd(Duration.class, Zgp.ZT);
    zd.Zd(Instant.class, Zgl.ZT);
    zd.Zd(LocalDateTime.class, Zgx.ZB);
    zd.Zd(LocalDate.class, Zgb.Ze);
    zd.Zd(LocalTime.class, Zgh.ZZ);
    zd.Zd(MonthDay.class, Zg9.Zt);
    zd.Zd(OffsetDateTime.class, Zgf.ZO);
    zd.Zd(OffsetTime.class, Zgs.Zt);
    zd.Zd(Period.class, Zg5.ZV);
    zd.Zd(Year.class, Zg8.ZX);
    zd.Zd(YearMonth.class, Zg3.Zr);
    zd.Zd(ZonedDateTime.class, Zgi.ZE);
    zd.Zd(ZoneId.class, Zgw.Zw);
    zd.Zd(ZoneOffset.class, Zgu.ZU);
    paramZs.ZX((Zr)zd);
    if (this.Zb != null)
      paramZs.ZX((Zr)this.Zb); 
    paramZs.Za((Zzi)new Zv2(this));
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  protected Ziq Zq(Zia paramZia, String paramString, Class<?>... paramVarArgs) {
    int i = paramVarArgs.length;
    Zbqc[] arrayOfZbqc = Zg4.Zf();
    for (Ziq ziq : paramZia.Zj()) {
      if (paramString.equals(ziq.ZW()) && (ziq.ZL() == i || arrayOfZbqc == null)) {
        byte b = 0;
        while (b < i) {
          Class clazz = ziq.Zz(b).ZN();
          if (!clazz.isAssignableFrom(paramVarArgs[b]));
          b++;
          if (arrayOfZbqc == null)
            break; 
        } 
        return ziq;
      } 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zyf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */