package com.fasterxml;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Zsa extends Zsy<Instant> {
  private static final long serialVersionUID = 1L;
  
  public static final Zsa ZA = new Zsa();
  
  protected Zsa() {
    super(Instant.class, Instant::toEpochMilli, Instant::getEpochSecond, Instant::getNano, (DateTimeFormatter)null);
  }
  
  protected Zsa(Zsa paramZsa, Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    super(paramZsa, paramBoolean, paramZsa.ZL, paramDateTimeFormatter, paramZqi);
  }
  
  protected Zsa(Zsa paramZsa, Boolean paramBoolean1, Boolean paramBoolean2, DateTimeFormatter paramDateTimeFormatter) {
    super(paramZsa, paramBoolean1, paramBoolean2, paramDateTimeFormatter);
  }
  
  protected Zsu<Instant> ZI(Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    return new Zsa(this, paramBoolean, paramDateTimeFormatter, paramZqi);
  }
  
  protected Zsu<?> ZF(Boolean paramBoolean1, Boolean paramBoolean2) {
    return new Zsa(this, this.Zt, paramBoolean2, this.ZE);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zsa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */