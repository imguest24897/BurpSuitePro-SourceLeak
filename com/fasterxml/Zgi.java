package com.fasterxml;

import burp.Zbqc;
import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Zgi extends Zg7 {
  public static final Zgi ZE = new Zgi();
  
  private static Zbqc[] Zd;
  
  protected ZonedDateTime Zg(String paramString, Zyg paramZyg) throws IOException {
    try {
      return ZonedDateTime.parse(paramString, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    } catch (DateTimeException dateTimeException) {
      return ZA(paramZyg, ZonedDateTime.class, dateTimeException, paramString);
    } 
  }
  
  static {
    Zq(new Zbqc[1]);
  }
  
  public static void Zq(Zbqc[] paramArrayOfZbqc) {
    Zd = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZV() {
    return Zd;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zgi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */