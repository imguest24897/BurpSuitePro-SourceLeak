package com.fasterxml;

import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.ZoneOffset;

public class Zgu extends Zg7 {
  public static final Zgu ZU = new Zgu();
  
  protected ZoneOffset Zk(String paramString, Zyg paramZyg) throws IOException {
    try {
      return ZoneOffset.of(paramString);
    } catch (DateTimeException dateTimeException) {
      return ZA(paramZyg, ZoneOffset.class, dateTimeException, paramString);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zgu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */