package com.fasterxml;

import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.ZoneId;

public class Zgw extends Zg7 {
  public static final Zgw Zw = new Zgw();
  
  protected Object Ze(String paramString, Zyg paramZyg) throws IOException {
    try {
      return ZoneId.of(paramString);
    } catch (DateTimeException dateTimeException) {
      return ZA(paramZyg, ZoneId.class, dateTimeException, paramString);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zgw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */