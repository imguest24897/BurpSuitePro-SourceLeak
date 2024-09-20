package com.fasterxml.Zn;

import com.fasterxml.Zor.Zyd;
import java.util.Arrays;

final class Zz extends Zj {
  private final Zv[] Zj;
  
  public Zz(Zj paramZj, Zv[] paramArrayOfZv) {
    super(paramZj);
    this.Zj = paramArrayOfZv;
  }
  
  public Zyd<Object> ZO(Class<?> paramClass) {
    Zv zv = this.Zj[0];
    if (zv.ZM == paramClass)
      return zv.Zy; 
    zv = this.Zj[1];
    if (zv.ZM == paramClass)
      return zv.Zy; 
    zv = this.Zj[2];
    if (zv.ZM == paramClass)
      return zv.Zy; 
    switch (this.Zj.length) {
      case 8:
        zv = this.Zj[7];
        if (zv.ZM == paramClass)
          return zv.Zy; 
      case 7:
        zv = this.Zj[6];
        if (zv.ZM == paramClass)
          return zv.Zy; 
      case 6:
        zv = this.Zj[5];
        if (zv.ZM == paramClass)
          return zv.Zy; 
      case 5:
        zv = this.Zj[4];
        if (zv.ZM == paramClass)
          return zv.Zy; 
      case 4:
        zv = this.Zj[3];
        if (zv.ZM == paramClass)
          return zv.Zy; 
        break;
    } 
    return null;
  }
  
  public Zj Zr(Class<?> paramClass, Zyd<Object> paramZyd) {
    int i = this.Zj.length;
    if (i == 8)
      return (Zj)(this.Zb ? new Za(this, paramClass, paramZyd) : this); 
    Zv[] arrayOfZv = Arrays.<Zv>copyOf(this.Zj, i + 1);
    arrayOfZv[i] = new Zv(paramClass, paramZyd);
    return new Zz(this, arrayOfZv);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Zz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */