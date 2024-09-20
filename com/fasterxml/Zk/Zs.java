package com.fasterxml.Zk;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zj;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zm.Z_;
import com.fasterxml.Zn.Zj;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zoz.Zia;
import com.fasterxml.Zoz.Zp;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zqg;
import com.fasterxml.Zz_;
import java.io.Serializable;

public abstract class Zs extends Zt implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected Zs() {}
  
  protected Zs(Zp paramZp, Z_ paramZ_, Zk paramZk1, Zyd<?> paramZyd, Za paramZa, Zk paramZk2, Zz_ paramZz_, Class<?>[] paramArrayOfClass) {
    super(paramZp, paramZp.Zu(), paramZ_, paramZk1, paramZyd, paramZa, paramZk2, Zb(paramZz_), Zk(paramZz_), paramArrayOfClass);
  }
  
  protected static boolean Zb(Zz_ paramZz_) {
    if (paramZz_ == null)
      return false; 
    Zqg zqg = paramZz_.Zs();
    return (zqg != Zqg.ALWAYS && zqg != Zqg.USE_DEFAULTS);
  }
  
  protected static Object Zk(Zz_ paramZz_) {
    if (paramZz_ == null)
      return Boolean.valueOf(false); 
    Zqg zqg = paramZz_.Zs();
    return (zqg == Zqg.ALWAYS || zqg == Zqg.NON_NULL || zqg == Zqg.USE_DEFAULTS) ? null : Zo;
  }
  
  protected abstract Object ZP(Object paramObject, Zf paramZf, Zyi paramZyi) throws Exception;
  
  public abstract Zs ZS(Zf<?> paramZf, Zia paramZia, Zp paramZp, Zk paramZk);
  
  public void Zy(Object paramObject, Zf paramZf, Zyi paramZyi) throws Exception {
    Object object = ZP(paramObject, paramZf, paramZyi);
    int i = Za.ZH();
    try {
      if (object == null) {
        try {
          if (this.Zy != null) {
            paramZf.Zm((Zj)this.Z_);
            this.Zy.serialize(null, paramZf, paramZyi);
          } 
        } catch (Exception exception) {
          throw b(null);
        } 
        return;
      } 
    } catch (Exception exception) {
      throw b(null);
    } 
    Zyd<Object> zyd = this.ZI;
    if (zyd == null) {
      Class<?> clazz = object.getClass();
      Zj zj = this.ZQ;
      zyd = zj.ZO(clazz);
      if (zyd == null)
        zyd = ZQ(zj, clazz, paramZyi); 
    } 
    try {
      if (this.Zp != null)
        try {
          if (Zo == this.Zp) {
            try {
              if (zyd.Zt(paramZyi, object))
                return; 
            } catch (Exception exception) {
              throw b(null);
            } 
          } else {
            try {
              if (this.Zp.equals(object))
                return; 
            } catch (Exception exception) {
              throw b(null);
            } 
          } 
        } catch (Exception exception) {
          throw b(null);
        }  
    } catch (Exception exception) {
      throw b(null);
    } 
    try {
      if (object == paramObject)
        try {
          if (Zy(paramObject, paramZf, paramZyi, zyd))
            return; 
        } catch (Exception exception) {
          throw b(null);
        }  
    } catch (Exception exception) {
      throw b(null);
    } 
    try {
      paramZf.Zm((Zj)this.Z_);
      if (this.ZB == null) {
        try {
          zyd.serialize(object, paramZf, paramZyi);
          if (i != 0) {
            zyd.Zo(object, paramZf, paramZyi, this.ZB);
            return;
          } 
        } catch (Exception exception) {
          throw b(null);
        } 
        return;
      } 
    } catch (Exception exception) {
      throw b(null);
    } 
    zyd.Zo(object, paramZf, paramZyi, this.ZB);
  }
  
  public void ZD(Object paramObject, Zf paramZf, Zyi paramZyi) throws Exception {
    Object object = ZP(paramObject, paramZf, paramZyi);
    int i = Za.Zi();
    try {
      if (object == null) {
        try {
          if (this.Zy != null) {
            try {
              this.Zy.serialize(null, paramZf, paramZyi);
              if (i == 0) {
                paramZf.ZT();
                return;
              } 
            } catch (Exception exception) {
              throw b(null);
            } 
            return;
          } 
        } catch (Exception exception) {
          throw b(null);
        } 
      } else {
        Zyd<Object> zyd = this.ZI;
        if (zyd == null) {
          Class<?> clazz = object.getClass();
          Zj zj = this.ZQ;
          zyd = zj.ZO(clazz);
          if (zyd == null)
            zyd = ZQ(zj, clazz, paramZyi); 
        } 
        try {
          if (this.Zp != null)
            try {
              if (Zo == this.Zp) {
                try {
                  if (zyd.Zt(paramZyi, object)) {
                    ZM(paramObject, paramZf, paramZyi);
                    return;
                  } 
                } catch (Exception exception) {
                  throw b(null);
                } 
              } else {
                try {
                  if (this.Zp.equals(object)) {
                    ZM(paramObject, paramZf, paramZyi);
                    return;
                  } 
                } catch (Exception exception) {
                  throw b(null);
                } 
              } 
            } catch (Exception exception) {
              throw b(null);
            }  
        } catch (Exception exception) {
          throw b(null);
        } 
        try {
          if (object == paramObject)
            try {
              if (Zy(paramObject, paramZf, paramZyi, zyd))
                return; 
            } catch (Exception exception) {
              throw b(null);
            }  
        } catch (Exception exception) {
          throw b(null);
        } 
        try {
          if (this.ZB == null) {
            try {
              zyd.serialize(object, paramZf, paramZyi);
              if (i == 0)
                zyd.Zo(object, paramZf, paramZyi, this.ZB); 
            } catch (Exception exception) {
              throw b(null);
            } 
            return;
          } 
        } catch (Exception exception) {
          throw b(null);
        } 
        zyd.Zo(object, paramZf, paramZyi, this.ZB);
      } 
    } catch (Exception exception) {
      throw b(null);
    } 
    paramZf.ZT();
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zk\Zs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */