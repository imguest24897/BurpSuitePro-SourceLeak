package net.portswigger.devtools.protocol.types.memory;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.memory.Module")
public class Module {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "uuid")
  public final String uuid;
  
  @Zvd(Zp = "baseAddress")
  public final String baseAddress;
  
  @Zvd(Zp = "size")
  public final Double size;
  
  @Zox
  public Module(@Zc5(Ze = "name") String paramString1, @Zc5(Ze = "uuid") String paramString2, @Zc5(Ze = "baseAddress") String paramString3, @Zc5(Ze = "size") Double paramDouble) {
    String str = SamplingProfileNode.Z_();
    this.name = paramString1;
    this.uuid = paramString2;
    this.baseAddress = paramString3;
    this.size = paramDouble;
    if (str == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\memory\Module.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */