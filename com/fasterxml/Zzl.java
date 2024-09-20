package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zw.Zl;
import java.io.IOException;

@Zl
public class Zzl extends Zz0<byte[]> {
  private static final long serialVersionUID = 1L;
  
  public Zzl() {
    super((Class)byte[].class);
  }
  
  public boolean ZG(Zyi paramZyi, byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte.length == 0);
  }
  
  public void Zt(byte[] paramArrayOfbyte, Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.Z_(paramZyi.ZH().Zn(), paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public void Zf(byte[] paramArrayOfbyte, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Zm(paramArrayOfbyte, Zl.VALUE_EMBEDDED_OBJECT));
    paramZf.Z_(paramZyi.ZH().Zn(), paramArrayOfbyte, 0, paramArrayOfbyte.length);
    paramZa.ZP(paramZf, zn);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zzl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */