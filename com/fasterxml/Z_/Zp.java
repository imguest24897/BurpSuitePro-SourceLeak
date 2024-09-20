package com.fasterxml.Z_;

import com.fasterxml.Zor.Zr;
import com.fasterxml.Zoz.Zif;
import com.fasterxml.Zoz.Zin;
import com.fasterxml.Zoz.Ziv;
import java.beans.ConstructorProperties;
import java.beans.Transient;

public class Zp extends Zi {
  private final Class<?> ZB;
  
  public Zp() {
    Class<Transient> clazz1 = Transient.class;
    Class<ConstructorProperties> clazz = ConstructorProperties.class;
    this.ZB = clazz;
  }
  
  public Boolean ZE(Ziv paramZiv) {
    Transient transient_ = (Transient)paramZiv.ZU(Transient.class);
    return (transient_ != null) ? Boolean.valueOf(transient_.value()) : null;
  }
  
  public Boolean Zw(Ziv paramZiv) {
    ConstructorProperties constructorProperties = (ConstructorProperties)paramZiv.ZU(ConstructorProperties.class);
    return (constructorProperties != null) ? Boolean.TRUE : null;
  }
  
  public Zr Za(Zin paramZin) {
    Zif zif = paramZin.Zd();
    if (zif != null) {
      ConstructorProperties constructorProperties = (ConstructorProperties)zif.ZU(ConstructorProperties.class);
      if (constructorProperties != null) {
        String[] arrayOfString = constructorProperties.value();
        int i = paramZin.ZF();
        if (i < arrayOfString.length)
          return Zr.Zf(arrayOfString[i]); 
      } 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Z_\Zp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */