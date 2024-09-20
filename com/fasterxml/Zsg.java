package com.fasterxml;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Zsg extends Zsy<OffsetDateTime> {
  private static final long serialVersionUID = 1L;
  
  public static final Zsg ZG = new Zsg();
  
  protected Zsg() {
    super(OffsetDateTime.class, Zsg::lambda$new$0, OffsetDateTime::toEpochSecond, OffsetDateTime::getNano, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
  }
  
  protected Zsg(Zsg paramZsg, Boolean paramBoolean1, Boolean paramBoolean2, DateTimeFormatter paramDateTimeFormatter) {
    super(paramZsg, paramBoolean1, paramBoolean2, paramDateTimeFormatter);
  }
  
  public Zsg(Zsg paramZsg, Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    super(paramZsg, paramBoolean, paramZsg.ZL, paramDateTimeFormatter, paramZqi);
  }
  
  protected Zsu<?> ZI(Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    return new Zsg(this, paramBoolean, paramDateTimeFormatter, paramZqi);
  }
  
  protected Zsu<?> ZF(Boolean paramBoolean1, Boolean paramBoolean2) {
    return new Zsg(this, this.Zt, paramBoolean2, this.ZE);
  }
  
  private static long lambda$new$0(OffsetDateTime paramOffsetDateTime) {
    return paramOffsetDateTime.toInstant().toEpochMilli();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zsg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */