package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zm.Ze;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;

public class Zzy extends Zz0<Object> {
  protected final Ze Zt;
  
  protected final Ze ZV;
  
  protected Zzy(Class<?> paramClass, Ze paramZe1, Ze paramZe2) {
    super(paramClass, false);
    this.Zt = paramZe1;
    this.ZV = paramZe2;
  }
  
  public static Zzy ZK(Class<?> paramClass, Ze paramZe1, Ze paramZe2) {
    return new Zzy(paramClass, paramZe1, paramZe2);
  }
  
  public void serialize(Object paramObject, Zf paramZf, Zyi paramZyi) throws IOException {
    try {
      if (paramZyi.ZW(Zy0.WRITE_ENUMS_USING_TO_STRING)) {
        paramZf.ZY(paramObject.toString());
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Enum enum_ = (Enum)paramObject;
    try {
      if (this.ZV != null) {
        paramZf.Zm(this.ZV.Zy(enum_));
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZyi.ZW(Zy0.WRITE_ENUM_KEYS_USING_INDEX)) {
        paramZf.ZY(String.valueOf(enum_.ordinal()));
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.Zm(this.Zt.Zy(enum_));
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */