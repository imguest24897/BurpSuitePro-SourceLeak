package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;

@Zl
public class Zs0 extends Zs6<Calendar> {
  public static final Zs0 ZC = new Zs0();
  
  public Zs0() {
    this((Boolean)null, (DateFormat)null);
  }
  
  public Zs0(Boolean paramBoolean, DateFormat paramDateFormat) {
    super(Calendar.class, paramBoolean, paramDateFormat);
  }
  
  public Zs0 Zg(Boolean paramBoolean, DateFormat paramDateFormat) {
    return new Zs0(paramBoolean, paramDateFormat);
  }
  
  protected long Zp(Calendar paramCalendar) {
    return (paramCalendar == null) ? 0L : paramCalendar.getTimeInMillis();
  }
  
  public void ZG(Calendar paramCalendar, Zf paramZf, Zyi paramZyi) throws IOException {
    try {
      if (Zh(paramZyi)) {
        paramZf.Zw(Zp(paramCalendar));
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZP(paramCalendar.getTime(), paramZf, paramZyi);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */