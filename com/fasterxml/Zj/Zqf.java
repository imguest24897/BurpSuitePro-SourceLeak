package com.fasterxml.Zj;

import com.fasterxml.Zh.Zd;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyp;
import java.io.Serializable;
import java.util.Map;

public class Zqf implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final int Zq = (Zd.values()).length;
  
  protected Zx Zi;
  
  protected final Zr Z_;
  
  protected Zr[] Zg;
  
  protected Map<Class<?>, Zr> ZM;
  
  public Zqf() {
    this(Zx.TryConvert, new Zr(), null, null);
  }
  
  protected Zqf(Zx paramZx, Zr paramZr, Zr[] paramArrayOfZr, Map<Class<?>, Zr> paramMap) {
    this.Z_ = paramZr;
    this.Zi = paramZx;
    this.Zg = paramArrayOfZr;
    this.ZM = paramMap;
  }
  
  public Zx Zn(Zyc paramZyc, Zd paramZd, Class<?> paramClass, Zq paramZq) {
    if (this.ZM != null && paramClass != null) {
      Zr zr = this.ZM.get(paramClass);
      if (zr != null) {
        Zx zx1 = zr.Zd(paramZq);
        if (zx1 != null)
          return zx1; 
      } 
    } 
    if (this.Zg != null && paramZd != null) {
      Zr zr = this.Zg[paramZd.ordinal()];
      if (zr != null) {
        Zx zx1 = zr.Zd(paramZq);
        if (zx1 != null)
          return zx1; 
      } 
    } 
    Zx zx = this.Z_.Zd(paramZq);
    if (zx != null)
      return zx; 
    switch (Zy.Ze[paramZq.ordinal()]) {
      case 1:
        return paramZyc.ZG(Zyp.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT) ? Zx.AsNull : Zx.Fail;
      case 2:
        if (paramZd == Zd.Integer)
          return paramZyc.ZG(Zyp.ACCEPT_FLOAT_AS_INT) ? Zx.TryConvert : Zx.Fail; 
        break;
      case 3:
        if (paramZd == Zd.Enum && paramZyc.ZG(Zyp.FAIL_ON_NUMBERS_FOR_ENUMS))
          return Zx.Fail; 
        break;
    } 
    boolean bool = ZT(paramZd);
    return (bool && !paramZyc.ZB(Zy9.ALLOW_COERCION_OF_SCALARS) && (paramZd != Zd.Float || paramZq != Zq.Integer)) ? Zx.Fail : ((paramZq == Zq.EmptyString) ? ((paramZd == Zd.OtherScalar) ? Zx.TryConvert : ((bool || paramZyc.ZG(Zyp.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) ? Zx.AsNull : Zx.Fail)) : this.Zi);
  }
  
  public Zx ZJ(Zyc paramZyc, Zd paramZd, Class<?> paramClass, Zx paramZx) {
    Boolean bool = null;
    Zx zx = null;
    if (this.ZM != null && paramClass != null) {
      Zr zr = this.ZM.get(paramClass);
      if (zr != null) {
        bool = zr.Zw();
        zx = zr.Zd(Zq.EmptyString);
      } 
    } 
    if (this.Zg != null && paramZd != null) {
      Zr zr = this.Zg[paramZd.ordinal()];
      if (zr != null) {
        if (bool == null)
          bool = zr.Zw(); 
        if (zx == null)
          zx = zr.Zd(Zq.EmptyString); 
      } 
    } 
    if (bool == null)
      bool = this.Z_.Zw(); 
    if (zx == null)
      zx = this.Z_.Zd(Zq.EmptyString); 
    return Boolean.FALSE.equals(bool) ? paramZx : ((zx != null) ? zx : (ZT(paramZd) ? Zx.AsNull : (paramZyc.ZG(Zyp.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) ? Zx.AsNull : paramZx)));
  }
  
  protected boolean ZT(Zd paramZd) {
    return (paramZd == Zd.Float || paramZd == Zd.Integer || paramZd == Zd.Boolean || paramZd == Zd.DateTime);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zj\Zqf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */