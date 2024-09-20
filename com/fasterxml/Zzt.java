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
public class Zzt extends Zzq<boolean[]> {
  private static final Zk ZO = Zi.ZF().Zt(Boolean.class);
  
  public Zzt() {
    super((Class)boolean[].class);
  }
  
  protected Zzt(Zzt paramZzt, Zo paramZo, Boolean paramBoolean) {
    super(paramZzt, paramZo, paramBoolean);
  }
  
  public Zyd<?> ZS(Zo paramZo, Boolean paramBoolean) {
    return (Zyd<?>)new Zzt(this, paramZo, paramBoolean);
  }
  
  public Za<?> ZS(Za paramZa) {
    return this;
  }
  
  public Zk Zq() {
    return ZO;
  }
  
  public boolean ZT(Zyi paramZyi, boolean[] paramArrayOfboolean) {
    return (paramArrayOfboolean.length == 0);
  }
  
  public boolean ZD(boolean[] paramArrayOfboolean) {
    return (paramArrayOfboolean.length == 1);
  }
  
  public final void ZL(boolean[] paramArrayOfboolean, Zf paramZf, Zyi paramZyi) throws IOException {
    int i = paramArrayOfboolean.length;
    try {
      if (i == 1)
        try {
          if (Ze(paramZyi)) {
            Zk(paramArrayOfboolean, paramZf, paramZyi);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.Zf(paramArrayOfboolean, i);
    Zk(paramArrayOfboolean, paramZf, paramZyi);
    paramZf.ZI();
  }
  
  public void Zk(boolean[] paramArrayOfboolean, Zf paramZf, Zyi paramZyi) throws IOException {
    byte b = 0;
    int i = paramArrayOfboolean.length;
    String str = Zz0.ZG();
    while (b < i) {
      paramZf.Zs(paramArrayOfboolean[b]);
      b++;
      if (str != null)
        break; 
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */