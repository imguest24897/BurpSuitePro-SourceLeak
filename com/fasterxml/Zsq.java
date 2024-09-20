package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

@Zl
public class Zsq extends Zs6<Date> {
  public static final Zsq ZJ = new Zsq();
  
  public Zsq() {
    this((Boolean)null, (DateFormat)null);
  }
  
  public Zsq(Boolean paramBoolean, DateFormat paramDateFormat) {
    super(Date.class, paramBoolean, paramDateFormat);
  }
  
  public Zsq ZW(Boolean paramBoolean, DateFormat paramDateFormat) {
    return new Zsq(paramBoolean, paramDateFormat);
  }
  
  protected long ZI(Date paramDate) {
    return (paramDate == null) ? 0L : paramDate.getTime();
  }
  
  public void Zj(Date paramDate, Zf paramZf, Zyi paramZyi) throws IOException {
    try {
      if (Zh(paramZyi)) {
        paramZf.Zw(ZI(paramDate));
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    ZP(paramDate, paramZf, paramZyi);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zsq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */