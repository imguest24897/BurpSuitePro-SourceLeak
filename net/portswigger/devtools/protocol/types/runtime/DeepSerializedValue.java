package net.portswigger.devtools.protocol.types.runtime;

import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.runtime.DeepSerializedValue")
public class DeepSerializedValue {
  @Zvd(Zp = "type")
  public final DeepSerializedValueType type;
  
  @Zvd(Zp = "value")
  @Zj
  public final Zi7 value;
  
  @Zvd(Zp = "objectId")
  @Zj
  public final String objectId;
  
  @Zvd(Zp = "weakLocalObjectReference")
  @Zj
  public final Integer weakLocalObjectReference;
  
  @Zox
  public DeepSerializedValue(@Zc5(Ze = "type") DeepSerializedValueType paramDeepSerializedValueType, @Zc5(Ze = "value", ZS = "null") Zi7 paramZi7, @Zc5(Ze = "objectId", ZS = "null") String paramString, @Zc5(Ze = "weakLocalObjectReference", ZS = "null") Integer paramInteger) {
    this.type = paramDeepSerializedValueType;
    this.value = paramZi7;
    this.objectId = paramString;
    this.weakLocalObjectReference = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\DeepSerializedValue.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */