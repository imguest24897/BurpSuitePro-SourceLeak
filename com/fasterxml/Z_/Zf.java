package com.fasterxml.Z_;

import com.fasterxml.Zb.Zl;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zzg;
import java.io.IOException;
import java.nio.file.Path;

public class Zf extends Zzg<Path> {
  private static final long serialVersionUID = 1L;
  
  private static int[] ZR;
  
  public Zf() {
    super(Path.class);
  }
  
  public void ZM(Path paramPath, com.fasterxml.Zb.Zf paramZf, Zyi paramZyi) throws IOException {
    paramZf.ZD(paramPath.toUri().toString());
  }
  
  public void Zw(Path paramPath, com.fasterxml.Zb.Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Ze(paramPath, Path.class, Zl.VALUE_STRING));
    ZM(paramPath, paramZf, paramZyi);
    paramZa.ZP(paramZf, zn);
  }
  
  public static void Zc(int[] paramArrayOfint) {
    ZR = paramArrayOfint;
  }
  
  public static int[] ZZ() {
    return ZR;
  }
  
  static {
    if (ZZ() == null)
      Zc(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Z_\Zf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */