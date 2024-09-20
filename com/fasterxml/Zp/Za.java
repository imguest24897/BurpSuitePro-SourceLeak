package com.fasterxml.Zp;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zc.Zs;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zo2.Zx;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zyc;
import java.io.IOException;

public abstract class Za {
  private static String ZY;
  
  public abstract Za ZS(Zo paramZo);
  
  public abstract Zyc ZU();
  
  public abstract String Zw();
  
  public Zn Zm(Object paramObject, Zl paramZl) {
    Zn zn = new Zn(paramObject, paramZl);
    String str = ZJ();
    switch (Zi.ZE[ZU().ordinal()]) {
      case 1:
        zn.ZJ = Zx.PAYLOAD_PROPERTY;
        zn.Z_ = Zw();
        if (str != null);
        return zn;
      case 2:
        zn.ZJ = Zx.PARENT_PROPERTY;
        zn.Z_ = Zw();
        if (str != null);
        return zn;
      case 3:
        zn.ZJ = Zx.METADATA_PROPERTY;
        zn.Z_ = Zw();
        if (str != null);
        return zn;
      case 4:
        zn.ZJ = Zx.WRAPPER_ARRAY;
        if (str != null);
        return zn;
      case 5:
        zn.ZJ = Zx.WRAPPER_OBJECT;
        if (str != null)
          break; 
        return zn;
    } 
    Zs.ZP();
    return zn;
  }
  
  public Zn ZC(Object paramObject1, Zl paramZl, Object paramObject2) {
    Zn zn = Zm(paramObject1, paramZl);
    zn.ZM = paramObject2;
    return zn;
  }
  
  public Zn Ze(Object paramObject, Class<?> paramClass, Zl paramZl) {
    Zn zn = Zm(paramObject, paramZl);
    zn.Zh = paramClass;
    return zn;
  }
  
  public abstract Zn ZA(Zf paramZf, Zn paramZn) throws IOException;
  
  public abstract Zn ZP(Zf paramZf, Zn paramZn) throws IOException;
  
  public static void Zg(String paramString) {
    ZY = paramString;
  }
  
  public static String ZJ() {
    return ZY;
  }
  
  static {
    if (ZJ() != null)
      Zg("fWgPk"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zp\Za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */