package net.portswigger.devtools.protocol.types.runtime;

import java.util.Map;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.runtime.SerializationOptions")
public class SerializationOptions {
  @Zvd(Zp = "serialization")
  public final SerializationOptionsSerialization serialization;
  
  @Zvd(Zp = "maxDepth")
  @Zj
  public final Integer maxDepth;
  
  @Zvd(Zp = "additionalParameters")
  @Zj
  public final Map<String, Zi7> additionalParameters;
  
  @Zox
  public SerializationOptions(@Zc5(Ze = "serialization") SerializationOptionsSerialization paramSerializationOptionsSerialization, @Zc5(Ze = "maxDepth", ZS = "null") Integer paramInteger, @Zc5(Ze = "additionalParameters", ZS = "null") Map<String, Zi7> paramMap) {
    this.serialization = paramSerializationOptionsSerialization;
    this.maxDepth = paramInteger;
    this.additionalParameters = paramMap;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\SerializationOptions.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */