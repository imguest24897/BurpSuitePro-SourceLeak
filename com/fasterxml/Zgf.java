package com.fasterxml;

import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Zgf extends Zg7 {
  public static final Zgf ZO = new Zgf();
  
  protected OffsetDateTime Zu(String paramString, Zyg paramZyg) throws IOException {
    try {
      return OffsetDateTime.parse(paramString, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    } catch (DateTimeException dateTimeException) {
      return ZA(paramZyg, OffsetDateTime.class, dateTimeException, paramString);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zgf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */