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
public class Zzr extends Zzq<int[]> {
  private static final Zk Zo = Zi.ZF().Zt(int.class);
  
  public Zzr() {
    super((Class)int[].class);
  }
  
  protected Zzr(Zzr paramZzr, Zo paramZo, Boolean paramBoolean) {
    super(paramZzr, paramZo, paramBoolean);
  }
  
  public Zyd<?> ZS(Zo paramZo, Boolean paramBoolean) {
    return (Zyd<?>)new Zzr(this, paramZo, paramBoolean);
  }
  
  public Za<?> ZS(Za paramZa) {
    return this;
  }
  
  public Zk Zq() {
    return Zo;
  }
  
  public boolean ZJ(Zyi paramZyi, int[] paramArrayOfint) {
    return (paramArrayOfint.length == 0);
  }
  
  public boolean ZR(int[] paramArrayOfint) {
    return (paramArrayOfint.length == 1);
  }
  
  public final void Ze(int[] paramArrayOfint, Zf paramZf, Zyi paramZyi) throws IOException {
    int i = paramArrayOfint.length;
    try {
      if (i == 1)
        try {
          if (Ze(paramZyi)) {
            ZA(paramArrayOfint, paramZf, paramZyi);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.Zm(paramArrayOfint, 0, paramArrayOfint.length);
  }
  
  public void ZA(int[] paramArrayOfint, Zf paramZf, Zyi paramZyi) throws IOException {
    byte b = 0;
    String str = Zz0.ZG();
    int i = paramArrayOfint.length;
    while (b < i) {
      paramZf.Zd(paramArrayOfint[b]);
      b++;
      if (str != null)
        break; 
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */