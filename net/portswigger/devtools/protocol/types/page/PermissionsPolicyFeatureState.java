package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.PermissionsPolicyFeatureState")
public class PermissionsPolicyFeatureState {
  @Zvd(Zp = "feature")
  public final PermissionsPolicyFeature feature;
  
  @Zvd(Zp = "allowed")
  public final Boolean allowed;
  
  @Zvd(Zp = "locator")
  @Zj
  public final PermissionsPolicyBlockLocator locator;
  
  @Zox
  public PermissionsPolicyFeatureState(@Zc5(Ze = "feature") PermissionsPolicyFeature paramPermissionsPolicyFeature, @Zc5(Ze = "allowed") Boolean paramBoolean, @Zc5(Ze = "locator", ZS = "null") PermissionsPolicyBlockLocator paramPermissionsPolicyBlockLocator) {
    this.feature = paramPermissionsPolicyFeature;
    this.allowed = paramBoolean;
    this.locator = paramPermissionsPolicyBlockLocator;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\PermissionsPolicyFeatureState.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */