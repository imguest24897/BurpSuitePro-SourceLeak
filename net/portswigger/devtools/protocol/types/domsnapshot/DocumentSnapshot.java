package net.portswigger.devtools.protocol.types.domsnapshot;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.domsnapshot.DocumentSnapshot")
public class DocumentSnapshot {
  @Zvd(Zp = "documentURL")
  public final Integer documentURL;
  
  @Zvd(Zp = "title")
  public final Integer title;
  
  @Zvd(Zp = "baseURL")
  public final Integer baseURL;
  
  @Zvd(Zp = "contentLanguage")
  public final Integer contentLanguage;
  
  @Zvd(Zp = "encodingName")
  public final Integer encodingName;
  
  @Zvd(Zp = "publicId")
  public final Integer publicId;
  
  @Zvd(Zp = "systemId")
  public final Integer systemId;
  
  @Zvd(Zp = "frameId")
  public final Integer frameId;
  
  @Zvd(Zp = "nodes")
  public final NodeTreeSnapshot nodes;
  
  @Zvd(Zp = "layout")
  public final LayoutTreeSnapshot layout;
  
  @Zvd(Zp = "textBoxes")
  public final TextBoxSnapshot textBoxes;
  
  @Zvd(Zp = "scrollOffsetX")
  @Zj
  public final Double scrollOffsetX;
  
  @Zvd(Zp = "scrollOffsetY")
  @Zj
  public final Double scrollOffsetY;
  
  @Zvd(Zp = "contentWidth")
  @Zj
  public final Double contentWidth;
  
  @Zvd(Zp = "contentHeight")
  @Zj
  public final Double contentHeight;
  
  @Zox
  public DocumentSnapshot(@Zc5(Ze = "documentURL") Integer paramInteger1, @Zc5(Ze = "title") Integer paramInteger2, @Zc5(Ze = "baseURL") Integer paramInteger3, @Zc5(Ze = "contentLanguage") Integer paramInteger4, @Zc5(Ze = "encodingName") Integer paramInteger5, @Zc5(Ze = "publicId") Integer paramInteger6, @Zc5(Ze = "systemId") Integer paramInteger7, @Zc5(Ze = "frameId") Integer paramInteger8, @Zc5(Ze = "nodes") NodeTreeSnapshot paramNodeTreeSnapshot, @Zc5(Ze = "layout") LayoutTreeSnapshot paramLayoutTreeSnapshot, @Zc5(Ze = "textBoxes") TextBoxSnapshot paramTextBoxSnapshot, @Zc5(Ze = "scrollOffsetX", ZS = "null") Double paramDouble1, @Zc5(Ze = "scrollOffsetY", ZS = "null") Double paramDouble2, @Zc5(Ze = "contentWidth", ZS = "null") Double paramDouble3, @Zc5(Ze = "contentHeight", ZS = "null") Double paramDouble4) {
    this.documentURL = paramInteger1;
    this.title = paramInteger2;
    this.baseURL = paramInteger3;
    this.contentLanguage = paramInteger4;
    this.encodingName = paramInteger5;
    this.publicId = paramInteger6;
    this.systemId = paramInteger7;
    this.frameId = paramInteger8;
    this.nodes = paramNodeTreeSnapshot;
    this.layout = paramLayoutTreeSnapshot;
    this.textBoxes = paramTextBoxSnapshot;
    this.scrollOffsetX = paramDouble1;
    this.scrollOffsetY = paramDouble2;
    this.contentWidth = paramDouble3;
    this.contentHeight = paramDouble4;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\domsnapshot\DocumentSnapshot.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */