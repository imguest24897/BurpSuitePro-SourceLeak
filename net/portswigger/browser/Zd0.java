package net.portswigger.browser;

import java.io.IOException;
import java.util.Optional;
import net.portswigger.Zsm;

public interface Zd0 {
  String ZU() throws Ztk;
  
  default Zdb ZS() throws Ztk {
    return Zi(Ze6.Ze());
  }
  
  Zdb Zi(Ze6 paramZe6) throws Ztk;
  
  Zeg ZI(int paramInt, Zcl paramZcl);
  
  void Zy() throws Ztk;
  
  void ZU(String paramString) throws Ztk;
  
  @Deprecated
  @Zsm("Multi-target support should permit new target creation in page")
  void ZG() throws Ztk;
  
  Optional<Zcv> Zh() throws IOException, Ztk;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zd0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */