package net.portswigger.devtools.protocol.events.tracing;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.tracing.StreamCompression;
import net.portswigger.devtools.protocol.types.tracing.StreamFormat;

@Zsi("net.portswigger.devtools.protocol.events.tracing.TracingComplete")
public class TracingComplete implements Zl {
  @Zvd(Zp = "dataLossOccurred")
  public final Boolean dataLossOccurred;
  
  @Zvd(Zp = "stream")
  @Zj
  public final String stream;
  
  @Zvd(Zp = "traceFormat")
  @Zj
  public final StreamFormat traceFormat;
  
  @Zvd(Zp = "streamCompression")
  @Zj
  public final StreamCompression streamCompression;
  
  private static int ZW;
  
  @Zox
  public TracingComplete(@Zc5(Ze = "dataLossOccurred") Boolean paramBoolean, @Zc5(Ze = "stream", ZS = "null") String paramString, @Zc5(Ze = "traceFormat", ZS = "null") StreamFormat paramStreamFormat, @Zc5(Ze = "streamCompression", ZS = "null") StreamCompression paramStreamCompression) {
    this.dataLossOccurred = paramBoolean;
    int i = ZY();
    this.stream = paramString;
    this.traceFormat = paramStreamFormat;
    this.streamCompression = paramStreamCompression;
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public static void ZQ(int paramInt) {
    ZW = paramInt;
  }
  
  public static int ZY() {
    return ZW;
  }
  
  public static int ZI() {
    int i = ZY();
    return (i == 0) ? 24 : 0;
  }
  
  static {
    if (ZI() == 0)
      ZQ(92); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\tracing\TracingComplete.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */