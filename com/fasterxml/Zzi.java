package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zn.Zj;
import com.fasterxml.Zn.Zm;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;

public class Zzi extends Zz0<Object> {
  protected transient Zj Zx = Zj.ZQ();
  
  public Zzi() {
    super(String.class, false);
  }
  
  Object readResolve() {
    this.Zx = Zj.ZQ();
    return this;
  }
  
  public void serialize(Object paramObject, Zf paramZf, Zyi paramZyi) throws IOException {
    Class<?> clazz = paramObject.getClass();
    Zj zj = this.Zx;
    Zyd<Object> zyd = zj.ZO(clazz);
    if (zyd == null)
      zyd = Zy(zj, clazz, paramZyi); 
    zyd.serialize(paramObject, paramZf, paramZyi);
  }
  
  protected Zyd<Object> Zy(Zj paramZj, Class<?> paramClass, Zyi paramZyi) throws Zy_ {
    if (paramClass == Object.class) {
      Zzu zzu = new Zzu(8, paramClass);
      this.Zx = paramZj.Zr(paramClass, zzu);
      return zzu;
    } 
    Zm zm = paramZj.ZD(paramClass, paramZyi, null);
    try {
      if (paramZj != zm.Za)
        this.Zx = zm.Za; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return zm.Zm;
  }
  
  private static Zy_ a(Zy_ paramZy_) {
    return paramZy_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */