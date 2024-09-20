package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zk.Za;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zn.Zj;
import com.fasterxml.Zn.Zm;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zp.Za;
import java.io.IOException;
import java.util.Objects;

public abstract class Zzz<T> extends Za<T> implements Zi {
  protected final Zk ZE;
  
  protected final Zo Zh;
  
  protected final boolean ZO;
  
  protected final Boolean Za;
  
  protected final Za Zy;
  
  protected final Zyd<Object> Zj;
  
  protected Zj ZJ;
  
  protected Zzz(Class<?> paramClass, Zk paramZk, boolean paramBoolean, Za paramZa, Zyd<Object> paramZyd) {
    this(paramClass, paramZk, paramBoolean, paramZa, (Zo)null, paramZyd, (Boolean)null);
  }
  
  protected Zzz(Class<?> paramClass, Zk paramZk, boolean paramBoolean, Za paramZa, Zo paramZo, Zyd<?> paramZyd, Boolean paramBoolean1) {
    super(paramClass, false);
    this.ZE = paramZk;
    this.ZO = (paramBoolean || (paramZk != null && paramZk.ZE()));
    this.Zy = paramZa;
    this.Zh = paramZo;
    this.Zj = (Zyd)paramZyd;
    this.ZJ = Zj.ZQ();
    this.Za = paramBoolean1;
  }
  
  protected Zzz(Zzz<?> paramZzz, Zo paramZo, Za paramZa, Zyd<?> paramZyd, Boolean paramBoolean) {
    super(paramZzz);
    this.ZE = paramZzz.ZE;
    this.ZO = paramZzz.ZO;
    this.Zy = paramZa;
    this.Zh = paramZo;
    this.Zj = (Zyd)paramZyd;
    this.ZJ = Zj.ZQ();
    this.Za = paramBoolean;
  }
  
  public abstract Zzz<T> ZO(Zo paramZo, Za paramZa, Zyd<?> paramZyd, Boolean paramBoolean);
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Za za = this.Zy;
    if (za != null)
      za = za.ZS(paramZo); 
    Zyd<Object> zyd = null;
    Boolean bool = null;
    if (paramZo != null) {
      Zt zt = paramZyi.Zv();
      Ziz ziz = paramZo.ZQ();
      if (ziz != null) {
        Object object = zt.ZS((Ziv)ziz);
        if (object != null)
          zyd = paramZyi.ZW((Ziv)ziz, object); 
      } 
    } 
    Zgy zgy = Z_(paramZyi, paramZo, Zz());
    if (zgy != null)
      bool = zgy.Zq(Zye.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED); 
    if (zyd == null)
      zyd = this.Zj; 
    zyd = Za(paramZyi, paramZo, zyd);
    try {
      if (zyd == null)
        try {
          if (this.ZE != null)
            try {
              if (this.ZO && !this.ZE.Zr())
                zyd = paramZyi.Zo(this.ZE, paramZo); 
            } catch (Zy_ zy_) {
              throw b(null);
            }  
        } catch (Zy_ zy_) {
          throw b(null);
        }  
    } catch (Zy_ zy_) {
      throw b(null);
    } 
    try {
      if (zyd == this.Zj)
        try {
          if (paramZo == this.Zh)
            try {
              if (this.Zy == za)
                try {
                  return (Zyd<?>)(Objects.equals(this.Za, bool) ? this : ZO(paramZo, za, zyd, bool));
                } catch (Zy_ zy_) {
                  throw b(null);
                }  
            } catch (Zy_ zy_) {
              throw b(null);
            }  
        } catch (Zy_ zy_) {
          throw b(null);
        }  
    } catch (Zy_ zy_) {
      throw b(null);
    } 
    return (Zyd<?>)ZO(paramZo, za, zyd, bool);
  }
  
  public Zk Zq() {
    return this.ZE;
  }
  
  public void serialize(T paramT, Zf paramZf, Zyi paramZyi) throws IOException {
    try {
      if (paramZyi.ZW(Zy0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED))
        try {
          if (Zh(paramT)) {
            Zp(paramT, paramZf, paramZyi);
            return;
          } 
        } catch (IOException iOException) {
          throw b(null);
        }  
    } catch (IOException iOException) {
      throw b(null);
    } 
    paramZf.Zo(paramT);
    Zp(paramT, paramZf, paramZyi);
    paramZf.ZI();
  }
  
  public void Zo(T paramT, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Zm(paramT, Zl.START_ARRAY));
    paramZf.Z_(paramT);
    Zp(paramT, paramZf, paramZyi);
    paramZa.ZP(paramZf, zn);
  }
  
  protected abstract void Zp(T paramT, Zf paramZf, Zyi paramZyi) throws IOException;
  
  protected final Zyd<Object> Zu(Zj paramZj, Class<?> paramClass, Zyi paramZyi) throws Zy_ {
    Zm zm = paramZj.Zd(paramClass, paramZyi, this.Zh);
    try {
      if (paramZj != zm.Za)
        this.ZJ = zm.Za; 
    } catch (Zy_ zy_) {
      throw b(null);
    } 
    return zm.Zm;
  }
  
  protected final Zyd<Object> Zv(Zj paramZj, Zk paramZk, Zyi paramZyi) throws Zy_ {
    Zm zm = paramZj.ZN(paramZk, paramZyi, this.Zh);
    try {
      if (paramZj != zm.Za)
        this.ZJ = zm.Za; 
    } catch (Zy_ zy_) {
      throw b(null);
    } 
    return zm.Zm;
  }
  
  private static IOException b(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */