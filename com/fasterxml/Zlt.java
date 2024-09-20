package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;
import java.time.Month;

public class Zlt extends Zyd<Month> {
  private final Zyd<Object> ZA;
  
  public Zlt(Zyd<?> paramZyd) {
    this.ZA = (Zyd)paramZyd;
  }
  
  public void ZV(Month paramMonth, Zf paramZf, Zyi paramZyi) throws IOException {
    try {
      if (paramZyi.ZW(Zy0.WRITE_ENUMS_USING_INDEX)) {
        paramZf.Zd(paramMonth.ordinal() + 1);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZA.serialize(paramMonth, paramZf, paramZyi);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zlt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */