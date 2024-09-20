package net.portswigger.devtools.protocol.events.tracing;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.tracing.BufferUsage")
public class BufferUsage implements Zl {
  @Zvd(Zp = "percentFull")
  @Zj
  public final Double percentFull;
  
  @Zvd(Zp = "eventCount")
  @Zj
  public final Double eventCount;
  
  @Zvd(Zp = "value")
  @Zj
  public final Double value;
  
  @Zox
  public BufferUsage(@Zc5(Ze = "percentFull", ZS = "null") Double paramDouble1, @Zc5(Ze = "eventCount", ZS = "null") Double paramDouble2, @Zc5(Ze = "value", ZS = "null") Double paramDouble3) {
    int i = TracingComplete.ZY();
    this.percentFull = paramDouble1;
    this.eventCount = paramDouble2;
    this.value = paramDouble3;
    if (Zbqc.Zwu() == null)
      TracingComplete.ZQ(++i); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\tracing\BufferUsage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */