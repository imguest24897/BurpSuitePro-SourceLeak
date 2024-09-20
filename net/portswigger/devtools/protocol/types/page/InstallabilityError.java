package net.portswigger.devtools.protocol.types.page;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.InstallabilityError")
public class InstallabilityError {
  @Zvd(Zp = "errorId")
  public final String errorId;
  
  @Zvd(Zp = "errorArguments")
  public final List<InstallabilityErrorArgument> errorArguments;
  
  @Zox
  public InstallabilityError(@Zc5(Ze = "errorId") String paramString, @Zc5(Ze = "errorArguments") List<InstallabilityErrorArgument> paramList) {
    this.errorId = paramString;
    this.errorArguments = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\InstallabilityError.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */