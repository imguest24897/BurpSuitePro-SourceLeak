package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class Zug extends Zuy<AtomicInteger> {
  private static final long serialVersionUID = 1L;
  
  public Zug() {
    super(AtomicInteger.class);
  }
  
  public AtomicInteger ZA(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (paramZg.ZA())
        return new AtomicInteger(paramZg.Ze()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Integer integer = ZD(paramZg, paramZyg, AtomicInteger.class);
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (integer == null) ? null : new AtomicInteger(integer.intValue());
  }
  
  public Zd Zb() {
    return Zd.Integer;
  }
  
  public Object Zy(Zyg paramZyg) throws Zy_ {
    return new AtomicInteger();
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zug.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */