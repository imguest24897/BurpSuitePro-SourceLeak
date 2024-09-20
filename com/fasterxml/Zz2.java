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
public class Zz2 extends Zze<short[]> {
  private static final Zk ZF = Zi.ZF().Zt(short.class);
  
  public Zz2() {
    super((Class)short[].class);
  }
  
  public Zz2(Zz2 paramZz2, Zo paramZo, Boolean paramBoolean) {
    super(paramZz2, paramZo, paramBoolean);
  }
  
  public Zyd<?> ZS(Zo paramZo, Boolean paramBoolean) {
    return (Zyd<?>)new Zz2(this, paramZo, paramBoolean);
  }
  
  public Zk Zq() {
    return ZF;
  }
  
  public boolean Zb(Zyi paramZyi, short[] paramArrayOfshort) {
    return (paramArrayOfshort.length == 0);
  }
  
  public boolean Zj(short[] paramArrayOfshort) {
    return (paramArrayOfshort.length == 1);
  }
  
  public final void Zs(short[] paramArrayOfshort, Zf paramZf, Zyi paramZyi) throws IOException {
    int i = paramArrayOfshort.length;
    try {
      if (i == 1)
        try {
          if (Ze(paramZyi)) {
            Zv(paramArrayOfshort, paramZf, paramZyi);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.Zf(paramArrayOfshort, i);
    Zv(paramArrayOfshort, paramZf, paramZyi);
    paramZf.ZI();
  }
  
  public void Zv(short[] paramArrayOfshort, Zf paramZf, Zyi paramZyi) throws IOException {
    byte b = 0;
    int i = paramArrayOfshort.length;
    String str = Zz0.ZG();
    while (b < i) {
      paramZf.Zd(paramArrayOfshort[b]);
      b++;
      if (str != null)
        break; 
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */