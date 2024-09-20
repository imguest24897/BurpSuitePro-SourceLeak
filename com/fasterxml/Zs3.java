package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zm.Zl;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zw.Zl;
import java.io.IOException;

@Zl
public class Zs3 extends Zz0<Zl> {
  public Zs3() {
    super(Zl.class);
  }
  
  public void Zj(Zl paramZl, Zf paramZf, Zyi paramZyi) throws IOException {
    paramZl.Zm(paramZf);
  }
  
  public final void Zw(Zl paramZl, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Zm(paramZl, Zl.VALUE_EMBEDDED_OBJECT));
    Zj(paramZl, paramZf, paramZyi);
    paramZa.ZP(paramZf, zn);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */