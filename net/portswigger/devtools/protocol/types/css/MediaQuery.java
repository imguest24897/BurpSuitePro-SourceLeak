package net.portswigger.devtools.protocol.types.css;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.css.MediaQuery")
public class MediaQuery {
  @Zvd(Zp = "expressions")
  public final List<MediaQueryExpression> expressions;
  
  @Zvd(Zp = "active")
  public final Boolean active;
  
  @Zox
  public MediaQuery(@Zc5(Ze = "expressions") List<MediaQueryExpression> paramList, @Zc5(Ze = "active") Boolean paramBoolean) {
    this.expressions = paramList;
    this.active = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\MediaQuery.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */