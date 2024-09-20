package net.portswigger.devtools.protocol.types.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.css.CSSPropertyRegistration")
public class CSSPropertyRegistration {
  @Zvd(Zp = "propertyName")
  public final String propertyName;
  
  @Zvd(Zp = "initialValue")
  @Zj
  public final Value initialValue;
  
  @Zvd(Zp = "inherits")
  public final Boolean inherits;
  
  @Zvd(Zp = "syntax")
  public final String syntax;
  
  @Zox
  public CSSPropertyRegistration(@Zc5(Ze = "propertyName") String paramString1, @Zc5(Ze = "initialValue", ZS = "null") Value paramValue, @Zc5(Ze = "inherits") Boolean paramBoolean, @Zc5(Ze = "syntax") String paramString2) {
    this.propertyName = paramString1;
    this.initialValue = paramValue;
    this.inherits = paramBoolean;
    this.syntax = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\CSSPropertyRegistration.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */