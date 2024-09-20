package com.fasterxml;

import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Zgh extends Zg7 {
  public static final Zgh ZZ = new Zgh();
  
  protected LocalTime ZV(String paramString, Zyg paramZyg) throws IOException {
    try {
      return LocalTime.parse(paramString, DateTimeFormatter.ISO_LOCAL_TIME);
    } catch (DateTimeException dateTimeException) {
      return ZA(paramZyg, LocalTime.class, dateTimeException, paramString);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zgh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */