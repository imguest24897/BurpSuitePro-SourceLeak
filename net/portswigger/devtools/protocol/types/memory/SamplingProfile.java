package net.portswigger.devtools.protocol.types.memory;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.memory.SamplingProfile")
public class SamplingProfile {
  @Zvd(Zp = "samples")
  public final List<SamplingProfileNode> samples;
  
  @Zvd(Zp = "modules")
  public final List<Module> modules;
  
  @Zox
  public SamplingProfile(@Zc5(Ze = "samples") List<SamplingProfileNode> paramList, @Zc5(Ze = "modules") List<Module> paramList1) {
    this.samples = paramList;
    this.modules = paramList1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\memory\SamplingProfile.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */