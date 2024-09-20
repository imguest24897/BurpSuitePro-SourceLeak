package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zw.Zl;
import java.io.IOException;

@Zl
public final class Zzd extends Zzg<Object> implements Zi {
  private static final long serialVersionUID = 1L;
  
  protected final boolean ZQ;
  
  public Zzd(boolean paramBoolean) {
    super(paramBoolean ? boolean.class : Boolean.class, false);
    this.ZQ = paramBoolean;
  }
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zgy zgy = Z_(paramZyi, paramZo, Zz());
    if (zgy != null) {
      Zqi zqi = zgy.ZI();
      try {
        if (zqi.Zp())
          return new Zsj(this.ZQ); 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
      try {
        if (zqi == Zqi.STRING)
          return new Zs5(this.Zg); 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
    } 
    return this;
  }
  
  public void serialize(Object paramObject, Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.Zs(Boolean.TRUE.equals(paramObject));
  }
  
  public final void Zo(Object paramObject, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    paramZf.Zs(Boolean.TRUE.equals(paramObject));
  }
  
  private static Zy_ a(Zy_ paramZy_) {
    return paramZy_;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */