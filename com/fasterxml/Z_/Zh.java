package com.fasterxml.Z_;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zs.Zub;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class Zh extends Zub<Object> {
  private static final long serialVersionUID = 1L;
  
  protected final int Zf;
  
  public Zh(Class<?> paramClass, int paramInt) {
    super(paramClass);
    this.Zf = paramInt;
  }
  
  public Object deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (this.Zf == 2)
        try {
          if (paramZg.ZL(Zl.VALUE_NUMBER_INT))
            return ZJ(paramZyg, ZG(paramZg, paramZyg)); 
        } catch (IOException iOException) {
          throw b(null);
        }  
    } catch (IOException iOException) {
      throw b(null);
    } 
    return super.deserialize(paramZg, paramZyg);
  }
  
  protected Object ZV(String paramString, Zyg paramZyg) throws IOException {
    try {
      Date date;
      switch (this.Zf) {
        case 1:
          return Za.ZO.newDuration(paramString);
        case 3:
          return QName.valueOf(paramString);
        case 2:
          try {
            date = ZI(paramString, paramZyg);
          } catch (Zy_ zy_) {
            return Za.ZO.newXMLGregorianCalendar(paramString);
          } 
          return ZJ(paramZyg, date);
      } 
    } catch (Zy_ zy_) {
      throw b(null);
    } 
    throw new IllegalStateException();
  }
  
  protected XMLGregorianCalendar ZJ(Zyg paramZyg, Date paramDate) {
    try {
      if (paramDate == null)
        return null; 
    } catch (IllegalStateException illegalStateException) {
      throw b(null);
    } 
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    gregorianCalendar.setTime(paramDate);
    TimeZone timeZone = paramZyg.Z_();
    try {
      if (timeZone != null)
        gregorianCalendar.setTimeZone(timeZone); 
    } catch (IllegalStateException illegalStateException) {
      throw b(null);
    } 
    return Za.ZO.newXMLGregorianCalendar(gregorianCalendar);
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Z_\Zh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */