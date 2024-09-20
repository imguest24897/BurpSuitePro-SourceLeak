package net.portswigger.devtools.protocol.types.runtime;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.runtime.ObjectPreview")
public class ObjectPreview {
  @Zvd(Zp = "type")
  public final ObjectPreviewType type;
  
  @Zvd(Zp = "subtype")
  @Zj
  public final ObjectPreviewSubtype subtype;
  
  @Zvd(Zp = "description")
  @Zj
  public final String description;
  
  @Zvd(Zp = "overflow")
  public final Boolean overflow;
  
  @Zvd(Zp = "properties")
  public final List<PropertyPreview> properties;
  
  @Zvd(Zp = "entries")
  @Zj
  public final List<EntryPreview> entries;
  
  @Zox
  public ObjectPreview(@Zc5(Ze = "type") ObjectPreviewType paramObjectPreviewType, @Zc5(Ze = "subtype", ZS = "null") ObjectPreviewSubtype paramObjectPreviewSubtype, @Zc5(Ze = "description", ZS = "null") String paramString, @Zc5(Ze = "overflow") Boolean paramBoolean, @Zc5(Ze = "properties") List<PropertyPreview> paramList, @Zc5(Ze = "entries", ZS = "null") List<EntryPreview> paramList1) {
    this.type = paramObjectPreviewType;
    this.subtype = paramObjectPreviewSubtype;
    this.description = paramString;
    this.overflow = paramBoolean;
    this.properties = paramList;
    this.entries = paramList1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\ObjectPreview.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */