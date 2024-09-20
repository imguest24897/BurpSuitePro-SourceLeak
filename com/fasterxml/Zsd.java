package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;

public class Zsd extends Zsy<ZonedDateTime> {
  private static final long serialVersionUID = 1L;
  
  public static final Zsd ZU = new Zsd();
  
  protected final Boolean ZV = null;
  
  protected Zsd() {
    this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
  }
  
  public Zsd(DateTimeFormatter paramDateTimeFormatter) {
    super(ZonedDateTime.class, Zsd::lambda$new$0, ChronoZonedDateTime::toEpochSecond, ZonedDateTime::getNano, paramDateTimeFormatter);
  }
  
  @Deprecated
  protected Zsd(Zsd paramZsd, Boolean paramBoolean1, Boolean paramBoolean2, DateTimeFormatter paramDateTimeFormatter, Boolean paramBoolean3) {
    this(paramZsd, paramBoolean1, paramBoolean2, paramDateTimeFormatter, paramZsd.ZQ, paramBoolean3);
  }
  
  protected Zsd(Zsd paramZsd, Boolean paramBoolean1, Boolean paramBoolean2, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi, Boolean paramBoolean3) {
    super(paramZsd, paramBoolean1, paramBoolean2, paramDateTimeFormatter, paramZqi);
  }
  
  protected Zsu<?> ZI(Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    return new Zsd(this, paramBoolean, this.ZL, paramDateTimeFormatter, paramZqi, this.ZV);
  }
  
  protected Zsu<?> ZF(Boolean paramBoolean1, Boolean paramBoolean2) {
    return new Zsd(this, this.Zt, paramBoolean2, this.ZE, paramBoolean1);
  }
  
  public void ZN(ZonedDateTime paramZonedDateTime, Zf paramZf, Zyi paramZyi) throws IOException {
    try {
      if (!Za(paramZyi))
        try {
          if (ZV(paramZyi)) {
            paramZf.ZD(DateTimeFormatter.ISO_ZONED_DATE_TIME.format(paramZonedDateTime));
            return;
          } 
        } catch (IOException iOException) {
          throw b(null);
        }  
    } catch (IOException iOException) {
      throw b(null);
    } 
    super.ZF(paramZonedDateTime, paramZf, paramZyi);
  }
  
  public boolean ZV(Zyi paramZyi) {
    return (this.ZV != null) ? this.ZV.booleanValue() : paramZyi.ZW(Zy0.WRITE_DATES_WITH_ZONE_ID);
  }
  
  protected Zl Zj(Zyi paramZyi) {
    return (!Za(paramZyi) && ZV(paramZyi)) ? Zl.VALUE_STRING : super.Zj(paramZyi);
  }
  
  private static long lambda$new$0(ZonedDateTime paramZonedDateTime) {
    return paramZonedDateTime.toInstant().toEpochMilli();
  }
  
  private static IOException b(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zsd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */