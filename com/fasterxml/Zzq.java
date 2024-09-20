package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zk.Za;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.util.Objects;

public abstract class Zzq<T> extends Za<T> implements Zi {
  protected final Zo ZL = null;
  
  protected final Boolean ZQ = null;
  
  protected Zzq(Class<T> paramClass) {
    super(paramClass);
  }
  
  protected Zzq(Zzq<?> paramZzq, Zo paramZo, Boolean paramBoolean) {
    super(paramZzq.Zg, false);
  }
  
  public abstract Zyd<?> ZS(Zo paramZo, Boolean paramBoolean);
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Boolean bool = null;
    if (paramZo != null) {
      Zgy zgy = Z_(paramZyi, paramZo, Zz());
      if (zgy != null) {
        bool = zgy.Zq(Zye.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
        try {
          if (!Objects.equals(bool, this.ZQ))
            return ZS(paramZo, bool); 
        } catch (Zy_ zy_) {
          throw b(null);
        } 
      } 
    } 
    return (Zyd<?>)this;
  }
  
  public void serialize(T paramT, Zf paramZf, Zyi paramZyi) throws IOException {
    try {
      if (Ze(paramZyi))
        try {
          if (Zh(paramT)) {
            ZD(paramT, paramZf, paramZyi);
            return;
          } 
        } catch (IOException iOException) {
          throw b(null);
        }  
    } catch (IOException iOException) {
      throw b(null);
    } 
    paramZf.Zo(paramT);
    ZD(paramT, paramZf, paramZyi);
    paramZf.ZI();
  }
  
  public final void Zo(T paramT, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Zm(paramT, Zl.START_ARRAY));
    paramZf.Z_(paramT);
    ZD(paramT, paramZf, paramZyi);
    paramZa.ZP(paramZf, zn);
  }
  
  protected abstract void ZD(T paramT, Zf paramZf, Zyi paramZyi) throws IOException;
  
  protected final boolean Ze(Zyi paramZyi) {
    return (this.ZQ == null) ? paramZyi.ZW(Zy0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : this.ZQ.booleanValue();
  }
  
  private static IOException b(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */