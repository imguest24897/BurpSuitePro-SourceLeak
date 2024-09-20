package com.fasterxml;

import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Zgx extends Zg7 {
  public static final Zgx ZB = new Zgx();
  
  protected LocalDateTime Zy(String paramString, Zyg paramZyg) throws IOException {
    try {
      return LocalDateTime.parse(paramString, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    } catch (DateTimeException dateTimeException) {
      return ZA(paramZyg, LocalDateTime.class, dateTimeException, paramString);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zgx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */