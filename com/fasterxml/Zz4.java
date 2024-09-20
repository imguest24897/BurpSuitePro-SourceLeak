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
public class Zz4 extends Zze<float[]> {
  private static final Zk Za = Zi.ZF().Zt(float.class);
  
  public Zz4() {
    super((Class)float[].class);
  }
  
  public Zz4(Zz4 paramZz4, Zo paramZo, Boolean paramBoolean) {
    super(paramZz4, paramZo, paramBoolean);
  }
  
  public Zyd<?> ZS(Zo paramZo, Boolean paramBoolean) {
    return (Zyd<?>)new Zz4(this, paramZo, paramBoolean);
  }
  
  public Zk Zq() {
    return Za;
  }
  
  public boolean Zr(Zyi paramZyi, float[] paramArrayOffloat) {
    return (paramArrayOffloat.length == 0);
  }
  
  public boolean ZX(float[] paramArrayOffloat) {
    return (paramArrayOffloat.length == 1);
  }
  
  public final void ZZ(float[] paramArrayOffloat, Zf paramZf, Zyi paramZyi) throws IOException {
    int i = paramArrayOffloat.length;
    try {
      if (i == 1)
        try {
          if (Ze(paramZyi)) {
            ZR(paramArrayOffloat, paramZf, paramZyi);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.Zf(paramArrayOffloat, i);
    ZR(paramArrayOffloat, paramZf, paramZyi);
    paramZf.ZI();
  }
  
  public void ZR(float[] paramArrayOffloat, Zf paramZf, Zyi paramZyi) throws IOException {
    byte b = 0;
    int i = paramArrayOffloat.length;
    String str = Zz0.ZG();
    while (b < i) {
      paramZf.Za(paramArrayOffloat[b]);
      b++;
      if (str != null)
        break; 
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */