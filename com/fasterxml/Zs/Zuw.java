package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

@Zl
public class Zuw extends Zu6<Calendar> {
  protected final Constructor<Calendar> ZE = null;
  
  public Zuw() {
    super(Calendar.class);
  }
  
  public Zuw(Class<? extends Calendar> paramClass) {
    super(paramClass);
  }
  
  public Zuw(Zuw paramZuw, DateFormat paramDateFormat, String paramString) {
    super(paramZuw, paramDateFormat, paramString);
  }
  
  protected Zuw ZQ(DateFormat paramDateFormat, String paramString) {
    return new Zuw(this, paramDateFormat, paramString);
  }
  
  public Object Zy(Zyg paramZyg) {
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    gregorianCalendar.setTimeInMillis(0L);
    return gregorianCalendar;
  }
  
  public Calendar ZJ(Zg paramZg, Zyg paramZyg) throws IOException {
    Date date = ZG(paramZg, paramZyg);
    try {
      if (date == null)
        return null; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (this.ZE == null)
        return paramZyg.ZZ(date); 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      Calendar calendar = this.ZE.newInstance(new Object[0]);
      calendar.setTimeInMillis(date.getTime());
      TimeZone timeZone = paramZyg.Z_();
      try {
        if (timeZone != null)
          calendar.setTimeZone(timeZone); 
      } catch (Exception exception) {
        throw a(null);
      } 
      return calendar;
    } catch (Exception exception) {
      return (Calendar)paramZyg.Zs(ZX(), date, exception);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zuw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */