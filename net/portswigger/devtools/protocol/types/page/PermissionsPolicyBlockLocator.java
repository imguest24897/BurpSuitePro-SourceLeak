package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.PermissionsPolicyBlockLocator")
public class PermissionsPolicyBlockLocator {
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zvd(Zp = "blockReason")
  public final PermissionsPolicyBlockReason blockReason;
  
  @Zox
  public PermissionsPolicyBlockLocator(@Zc5(Ze = "frameId") String paramString, @Zc5(Ze = "blockReason") PermissionsPolicyBlockReason paramPermissionsPolicyBlockReason) {
    this.frameId = paramString;
    this.blockReason = paramPermissionsPolicyBlockReason;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\PermissionsPolicyBlockLocator.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */