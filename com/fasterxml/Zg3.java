package com.fasterxml;

import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;

public class Zg3 extends Zg7 {
  public static final Zg3 Zr = new Zg3();
  
  private static final DateTimeFormatter Zn = (new DateTimeFormatterBuilder()).appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
  
  protected YearMonth Zx(String paramString, Zyg paramZyg) throws IOException {
    try {
      return YearMonth.parse(paramString, Zn);
    } catch (DateTimeException dateTimeException) {
      return ZA(paramZyg, YearMonth.class, dateTimeException, paramString);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */