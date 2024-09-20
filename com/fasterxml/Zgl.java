package com.fasterxml;

import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Zgl extends Zg7 {
  public static final Zgl ZT = new Zgl();
  
  protected Instant Za(String paramString, Zyg paramZyg) throws IOException {
    try {
      return DateTimeFormatter.ISO_INSTANT.<Instant>parse(paramString, Instant::from);
    } catch (DateTimeException dateTimeException) {
      return ZA(paramZyg, Instant.class, dateTimeException, paramString);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zgl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */