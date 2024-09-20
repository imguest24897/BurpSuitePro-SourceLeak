package net.portswigger;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class Zmx {
  public final Field ZW;
  
  public final Type Ze;
  
  public final String ZV;
  
  public final String Za;
  
  private Zmx(Field paramField, String paramString1, String paramString2) {
    this.ZW = paramField;
    this.Ze = paramField.getGenericType();
    this.ZV = paramString1;
    this.Za = Zrmx.Zd(paramString2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zmx.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */