package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class Zuv extends Zuy<AtomicBoolean> {
  private static final long serialVersionUID = 1L;
  
  public Zuv() {
    super(AtomicBoolean.class);
  }
  
  public AtomicBoolean ZS(Zg paramZg, Zyg paramZyg) throws IOException {
    Zl zl = paramZg.Zh();
    try {
      if (zl == Zl.VALUE_TRUE)
        return new AtomicBoolean(true); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (zl == Zl.VALUE_FALSE)
        return new AtomicBoolean(false); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Boolean bool = Zf(paramZg, paramZyg, AtomicBoolean.class);
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (bool == null) ? null : new AtomicBoolean(bool.booleanValue());
  }
  
  public Zd Zb() {
    return Zd.Boolean;
  }
  
  public Object Zy(Zyg paramZyg) throws Zy_ {
    return new AtomicBoolean(false);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zuv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */