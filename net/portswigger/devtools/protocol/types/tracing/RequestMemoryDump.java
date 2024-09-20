package net.portswigger.devtools.protocol.types.tracing;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.tracing.RequestMemoryDump")
public class RequestMemoryDump {
  @Zvd(Zp = "dumpGuid")
  public final String dumpGuid;
  
  @Zvd(Zp = "success")
  public final Boolean success;
  
  @Zox
  public RequestMemoryDump(@Zc5(Ze = "dumpGuid") String paramString, @Zc5(Ze = "success") Boolean paramBoolean) {
    this.dumpGuid = paramString;
    String str = TracingBackend.Zf();
    this.success = paramBoolean;
    if (Zbqc.Zwu() == null)
      TracingBackend.ZK("iTDaJb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\tracing\RequestMemoryDump.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */