package net.portswigger.devtools.protocol.types.systeminfo;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.systeminfo.Info")
public class Info {
  @Zvd(Zp = "gpu")
  public final GPUInfo gpu;
  
  @Zvd(Zp = "modelName")
  public final String modelName;
  
  @Zvd(Zp = "modelVersion")
  public final String modelVersion;
  
  @Zvd(Zp = "commandLine")
  public final String commandLine;
  
  @Zox
  public Info(@Zc5(Ze = "gpu") GPUInfo paramGPUInfo, @Zc5(Ze = "modelName") String paramString1, @Zc5(Ze = "modelVersion") String paramString2, @Zc5(Ze = "commandLine") String paramString3) {
    this.gpu = paramGPUInfo;
    this.modelName = paramString1;
    this.modelVersion = paramString2;
    this.commandLine = paramString3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\systeminfo\Info.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */