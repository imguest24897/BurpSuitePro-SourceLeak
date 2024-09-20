package net.portswigger.devtools.protocol.types.tracing;

import burp.Zbqc;
import java.util.List;
import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.tracing.TraceConfig")
public class TraceConfig {
  @Zvd(Zp = "recordMode")
  @Zy
  @Zj
  public final TraceConfigRecordMode recordMode;
  
  @Zvd(Zp = "traceBufferSizeInKb")
  @Zy
  @Zj
  public final Double traceBufferSizeInKb;
  
  @Zvd(Zp = "enableSampling")
  @Zy
  @Zj
  public final Boolean enableSampling;
  
  @Zvd(Zp = "enableSystrace")
  @Zy
  @Zj
  public final Boolean enableSystrace;
  
  @Zvd(Zp = "enableArgumentFilter")
  @Zy
  @Zj
  public final Boolean enableArgumentFilter;
  
  @Zvd(Zp = "includedCategories")
  @Zj
  public final List<String> includedCategories;
  
  @Zvd(Zp = "excludedCategories")
  @Zj
  public final List<String> excludedCategories;
  
  @Zvd(Zp = "syntheticDelays")
  @Zy
  @Zj
  public final List<String> syntheticDelays;
  
  @Zvd(Zp = "memoryDumpConfig")
  @Zy
  @Zj
  public final Map<String, Zi7> memoryDumpConfig;
  
  @Zox
  public TraceConfig(@Zc5(Ze = "recordMode", ZS = "null") TraceConfigRecordMode paramTraceConfigRecordMode, @Zc5(Ze = "traceBufferSizeInKb", ZS = "null") Double paramDouble, @Zc5(Ze = "enableSampling", ZS = "null") Boolean paramBoolean1, @Zc5(Ze = "enableSystrace", ZS = "null") Boolean paramBoolean2, @Zc5(Ze = "enableArgumentFilter", ZS = "null") Boolean paramBoolean3, @Zc5(Ze = "includedCategories", ZS = "null") List<String> paramList1, @Zc5(Ze = "excludedCategories", ZS = "null") List<String> paramList2, @Zc5(Ze = "syntheticDelays", ZS = "null") List<String> paramList3, @Zc5(Ze = "memoryDumpConfig", ZS = "null") Map<String, Zi7> paramMap) {
    this.recordMode = paramTraceConfigRecordMode;
    String str = TracingBackend.Zf();
    this.traceBufferSizeInKb = paramDouble;
    this.enableSampling = paramBoolean1;
    this.enableSystrace = paramBoolean2;
    this.enableArgumentFilter = paramBoolean3;
    this.includedCategories = paramList1;
    this.excludedCategories = paramList2;
    this.syntheticDelays = paramList3;
    this.memoryDumpConfig = paramMap;
    if (str == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\tracing\TraceConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */