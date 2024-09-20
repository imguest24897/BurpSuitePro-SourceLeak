package com.fasterxml;

import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;

public class Zgs extends Zg7 {
  public static final Zgs Zt = new Zgs();
  
  protected OffsetTime ZF(String paramString, Zyg paramZyg) throws IOException {
    try {
      return OffsetTime.parse(paramString, DateTimeFormatter.ISO_OFFSET_TIME);
    } catch (DateTimeException dateTimeException) {
      return ZA(paramZyg, OffsetTime.class, dateTimeException, paramString);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zgs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */