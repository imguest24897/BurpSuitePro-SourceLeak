package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zh.Zi;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zw.Zl;
import java.io.IOException;

@Zl
public class Zzm extends Zze<long[]> {
  private static final Zk ZR = Zi.ZF().Zt(long.class);
  
  public Zzm() {
    super((Class)long[].class);
  }
  
  public Zzm(Zzm paramZzm, Zo paramZo, Boolean paramBoolean) {
    super(paramZzm, paramZo, paramBoolean);
  }
  
  public Zyd<?> ZS(Zo paramZo, Boolean paramBoolean) {
    return (Zyd<?>)new Zzm(this, paramZo, paramBoolean);
  }
  
  public Zk Zq() {
    return ZR;
  }
  
  public boolean ZO(Zyi paramZyi, long[] paramArrayOflong) {
    return (paramArrayOflong.length == 0);
  }
  
  public boolean Zl(long[] paramArrayOflong) {
    return (paramArrayOflong.length == 1);
  }
  
  public final void ZX(long[] paramArrayOflong, Zf paramZf, Zyi paramZyi) throws IOException {
    int i = paramArrayOflong.length;
    try {
      if (i == 1)
        try {
          if (Ze(paramZyi)) {
            ZD(paramArrayOflong, paramZf, paramZyi);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.Zx(paramArrayOflong, 0, paramArrayOflong.length);
  }
  
  public void ZD(long[] paramArrayOflong, Zf paramZf, Zyi paramZyi) throws IOException {
    byte b = 0;
    int i = paramArrayOflong.length;
    String str = Zz0.ZG();
    while (b < i) {
      paramZf.Zw(paramArrayOflong[b]);
      b++;
      if (str != null)
        break; 
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */