package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;

final class Zsj extends Zzg<Object> implements Zi {
  private static final long serialVersionUID = 1L;
  
  protected final boolean ZO;
  
  public Zsj(boolean paramBoolean) {
    super(paramBoolean ? boolean.class : Boolean.class, false);
    this.ZO = paramBoolean;
  }
  
  public void serialize(Object paramObject, Zf paramZf, Zyi paramZyi) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.Zd(Boolean.FALSE.equals(paramObject) ? 0 : 1);
  }
  
  public final void Zo(Object paramObject, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    paramZf.Zs(Boolean.TRUE.equals(paramObject));
  }
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zgy zgy = Z_(paramZyi, paramZo, Boolean.class);
    if (zgy != null) {
      Zqi zqi = zgy.ZI();
      try {
        if (!zqi.Zp())
          return new Zzd(this.ZO); 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
    } 
    return this;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zsj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */