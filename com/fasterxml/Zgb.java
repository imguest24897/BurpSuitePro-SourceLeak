package com.fasterxml;

import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Zgb extends Zg7 {
  public static final Zgb Ze = new Zgb();
  
  protected LocalDate ZJ(String paramString, Zyg paramZyg) throws IOException {
    try {
      return LocalDate.parse(paramString, DateTimeFormatter.ISO_LOCAL_DATE);
    } catch (DateTimeException dateTimeException) {
      return ZA(paramZyg, LocalDate.class, dateTimeException, paramString);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zgb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */