package com.fasterxml;

import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.Period;

public class Zg5 extends Zg7 {
  public static final Zg5 ZV = new Zg5();
  
  protected Period Zy(String paramString, Zyg paramZyg) throws IOException {
    try {
      return Period.parse(paramString);
    } catch (DateTimeException dateTimeException) {
      return ZA(paramZyg, Period.class, dateTimeException, paramString);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */