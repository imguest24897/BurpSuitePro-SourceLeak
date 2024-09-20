package com.fasterxml;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zq;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Zql extends Zq2<Year> {
  private static final long serialVersionUID = 1L;
  
  public static final Zql ZN = new Zql();
  
  public Zql() {
    this((DateTimeFormatter)null);
  }
  
  public Zql(DateTimeFormatter paramDateTimeFormatter) {
    super(Year.class, paramDateTimeFormatter);
  }
  
  protected Zql(Zql paramZql, Boolean paramBoolean) {
    super(paramZql, paramBoolean);
  }
  
  public Zql(Zql paramZql, Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    super(paramZql, paramBoolean, paramDateTimeFormatter, paramZqi);
  }
  
  protected Zql Zr(DateTimeFormatter paramDateTimeFormatter) {
    return new Zql(this, Boolean.valueOf(this.Zb), paramDateTimeFormatter, this.Zw);
  }
  
  protected Zql ZD(Boolean paramBoolean) {
    return new Zql(this, paramBoolean);
  }
  
  public Year ZT(Zg paramZg, Zyg paramZyg) throws IOException {
    Zl zl = paramZg.Zh();
    try {
      if (zl == Zl.VALUE_STRING)
        return ZD(paramZg, paramZyg, paramZg.ZR()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (zl == Zl.START_OBJECT)
        return ZD(paramZg, paramZyg, paramZyg.Zc(paramZg, (Zyo)this, ZX())); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (zl == Zl.VALUE_NUMBER_INT)
        return ZF(paramZyg, paramZg.Ze()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (zl == Zl.VALUE_EMBEDDED_OBJECT)
        return (Year)paramZg.ZO(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZg.ZL(Zl.START_ARRAY))
        return (Year)ZF(paramZg, paramZyg); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (Year)Zx(paramZyg, paramZg, new Zl[] { Zl.VALUE_STRING, Zl.VALUE_NUMBER_INT });
  }
  
  protected Year ZD(Zg paramZg, Zyg paramZyg, String paramString) throws IOException {
    String str = paramString.trim();
    try {
      if (str.length() == 0)
        return ZN(paramZg, paramZyg, str); 
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    try {
      if (paramZyg.ZA(Zq.UNTYPED_SCALARS))
        try {
          if (ZV(str))
            return ZF(paramZyg, Zyt.ZC(str)); 
        } catch (DateTimeException dateTimeException) {
          throw a(null);
        }  
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    try {
      try {
        return (this.Za == null) ? Year.parse(str) : Year.parse(str, this.Za);
      } catch (DateTimeException dateTimeException) {
        return (Year)Z_(paramZyg, dateTimeException, str);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  protected Year ZF(Zyg paramZyg, int paramInt) {
    return Year.of(paramInt);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zql.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */