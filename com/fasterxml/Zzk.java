package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zh.Zi;
import com.fasterxml.Zk.Za;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zw.Zl;
import java.io.IOException;

@Zl
public class Zzk extends Zzq<double[]> {
  private static final Zk Zc = Zi.ZF().Zt(double.class);
  
  public Zzk() {
    super((Class)double[].class);
  }
  
  protected Zzk(Zzk paramZzk, Zo paramZo, Boolean paramBoolean) {
    super(paramZzk, paramZo, paramBoolean);
  }
  
  public Zyd<?> ZS(Zo paramZo, Boolean paramBoolean) {
    return (Zyd<?>)new Zzk(this, paramZo, paramBoolean);
  }
  
  public Za<?> ZS(Za paramZa) {
    return this;
  }
  
  public Zk Zq() {
    return Zc;
  }
  
  public boolean ZO(Zyi paramZyi, double[] paramArrayOfdouble) {
    return (paramArrayOfdouble.length == 0);
  }
  
  public boolean ZI(double[] paramArrayOfdouble) {
    return (paramArrayOfdouble.length == 1);
  }
  
  public final void Zb(double[] paramArrayOfdouble, Zf paramZf, Zyi paramZyi) throws IOException {
    int i = paramArrayOfdouble.length;
    try {
      if (i == 1)
        try {
          if (Ze(paramZyi)) {
            Zk(paramArrayOfdouble, paramZf, paramZyi);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.ZW(paramArrayOfdouble, 0, paramArrayOfdouble.length);
  }
  
  public void Zk(double[] paramArrayOfdouble, Zf paramZf, Zyi paramZyi) throws IOException {
    byte b = 0;
    String str = Zz0.ZG();
    int i = paramArrayOfdouble.length;
    while (b < i) {
      paramZf.ZF(paramArrayOfdouble[b]);
      b++;
      if (str != null)
        break; 
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */