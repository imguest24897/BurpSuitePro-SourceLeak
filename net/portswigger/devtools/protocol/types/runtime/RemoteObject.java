package net.portswigger.devtools.protocol.types.runtime;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.runtime.RemoteObject")
public class RemoteObject {
  @Zvd(Zp = "type")
  public final RemoteObjectType type;
  
  @Zvd(Zp = "subtype")
  @Zj
  public final RemoteObjectSubtype subtype;
  
  @Zvd(Zp = "className")
  @Zj
  public final String className;
  
  @Zvd(Zp = "value")
  @Zj
  public final Zi7 value;
  
  @Zvd(Zp = "unserializableValue")
  @Zj
  public final String unserializableValue;
  
  @Zvd(Zp = "description")
  @Zj
  public final String description;
  
  @Zvd(Zp = "deepSerializedValue")
  @Zy
  @Zj
  public final DeepSerializedValue deepSerializedValue;
  
  @Zvd(Zp = "objectId")
  @Zj
  public final String objectId;
  
  @Zvd(Zp = "preview")
  @Zy
  @Zj
  public final ObjectPreview preview;
  
  @Zvd(Zp = "customPreview")
  @Zy
  @Zj
  public final CustomPreview customPreview;
  
  private static boolean Zz;
  
  @Zox
  public RemoteObject(@Zc5(Ze = "type") RemoteObjectType paramRemoteObjectType, @Zc5(Ze = "subtype", ZS = "null") RemoteObjectSubtype paramRemoteObjectSubtype, @Zc5(Ze = "className", ZS = "null") String paramString1, @Zc5(Ze = "value", ZS = "null") Zi7 paramZi7, @Zc5(Ze = "unserializableValue", ZS = "null") String paramString2, @Zc5(Ze = "description", ZS = "null") String paramString3, @Zc5(Ze = "deepSerializedValue", ZS = "null") DeepSerializedValue paramDeepSerializedValue, @Zc5(Ze = "objectId", ZS = "null") String paramString4, @Zc5(Ze = "preview", ZS = "null") ObjectPreview paramObjectPreview, @Zc5(Ze = "customPreview", ZS = "null") CustomPreview paramCustomPreview) {
    this.type = paramRemoteObjectType;
    this.subtype = paramRemoteObjectSubtype;
    boolean bool = ZV();
    this.className = paramString1;
    this.value = paramZi7;
    this.unserializableValue = paramString2;
    this.description = paramString3;
    this.deepSerializedValue = paramDeepSerializedValue;
    this.objectId = paramString4;
    this.preview = paramObjectPreview;
    this.customPreview = paramCustomPreview;
    if (Zbqc.Zwu() == null)
      ZW(!bool); 
  }
  
  public static void ZW(boolean paramBoolean) {
    Zz = paramBoolean;
  }
  
  public static boolean ZR() {
    return Zz;
  }
  
  public static boolean ZV() {
    boolean bool = ZR();
    return !bool;
  }
  
  static {
    if (ZR())
      ZW(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\RemoteObject.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */