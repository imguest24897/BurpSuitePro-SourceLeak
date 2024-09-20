package net.portswigger.devtools.protocol.types.domsnapshot;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.dom.PseudoType;
import net.portswigger.devtools.protocol.types.dom.ShadowRootType;
import net.portswigger.devtools.protocol.types.domdebugger.EventListener;

@Zsi("net.portswigger.devtools.protocol.types.domsnapshot.DOMNode")
public class DOMNode {
  @Zvd(Zp = "nodeType")
  public final Integer nodeType;
  
  @Zvd(Zp = "nodeName")
  public final String nodeName;
  
  @Zvd(Zp = "nodeValue")
  public final String nodeValue;
  
  @Zvd(Zp = "textValue")
  @Zj
  public final String textValue;
  
  @Zvd(Zp = "inputValue")
  @Zj
  public final String inputValue;
  
  @Zvd(Zp = "inputChecked")
  @Zj
  public final Boolean inputChecked;
  
  @Zvd(Zp = "optionSelected")
  @Zj
  public final Boolean optionSelected;
  
  @Zvd(Zp = "backendNodeId")
  public final Integer backendNodeId;
  
  @Zvd(Zp = "childNodeIndexes")
  @Zj
  public final List<Integer> childNodeIndexes;
  
  @Zvd(Zp = "attributes")
  @Zj
  public final List<NameValue> attributes;
  
  @Zvd(Zp = "pseudoElementIndexes")
  @Zj
  public final List<Integer> pseudoElementIndexes;
  
  @Zvd(Zp = "layoutNodeIndex")
  @Zj
  public final Integer layoutNodeIndex;
  
  @Zvd(Zp = "documentURL")
  @Zj
  public final String documentURL;
  
  @Zvd(Zp = "baseURL")
  @Zj
  public final String baseURL;
  
  @Zvd(Zp = "contentLanguage")
  @Zj
  public final String contentLanguage;
  
  @Zvd(Zp = "documentEncoding")
  @Zj
  public final String documentEncoding;
  
  @Zvd(Zp = "publicId")
  @Zj
  public final String publicId;
  
  @Zvd(Zp = "systemId")
  @Zj
  public final String systemId;
  
  @Zvd(Zp = "frameId")
  @Zj
  public final String frameId;
  
  @Zvd(Zp = "contentDocumentIndex")
  @Zj
  public final Integer contentDocumentIndex;
  
  @Zvd(Zp = "pseudoType")
  @Zj
  public final PseudoType pseudoType;
  
  @Zvd(Zp = "shadowRootType")
  @Zj
  public final ShadowRootType shadowRootType;
  
  @Zvd(Zp = "isClickable")
  @Zj
  public final Boolean isClickable;
  
  @Zvd(Zp = "eventListeners")
  @Zj
  public final List<EventListener> eventListeners;
  
  @Zvd(Zp = "currentSourceURL")
  @Zj
  public final String currentSourceURL;
  
  @Zvd(Zp = "originURL")
  @Zj
  public final String originURL;
  
  @Zvd(Zp = "scrollOffsetX")
  @Zj
  public final Double scrollOffsetX;
  
  @Zvd(Zp = "scrollOffsetY")
  @Zj
  public final Double scrollOffsetY;
  
  @Zox
  public DOMNode(@Zc5(Ze = "nodeType") Integer paramInteger1, @Zc5(Ze = "nodeName") String paramString1, @Zc5(Ze = "nodeValue") String paramString2, @Zc5(Ze = "textValue", ZS = "null") String paramString3, @Zc5(Ze = "inputValue", ZS = "null") String paramString4, @Zc5(Ze = "inputChecked", ZS = "null") Boolean paramBoolean1, @Zc5(Ze = "optionSelected", ZS = "null") Boolean paramBoolean2, @Zc5(Ze = "backendNodeId") Integer paramInteger2, @Zc5(Ze = "childNodeIndexes", ZS = "null") List<Integer> paramList1, @Zc5(Ze = "attributes", ZS = "null") List<NameValue> paramList, @Zc5(Ze = "pseudoElementIndexes", ZS = "null") List<Integer> paramList2, @Zc5(Ze = "layoutNodeIndex", ZS = "null") Integer paramInteger3, @Zc5(Ze = "documentURL", ZS = "null") String paramString5, @Zc5(Ze = "baseURL", ZS = "null") String paramString6, @Zc5(Ze = "contentLanguage", ZS = "null") String paramString7, @Zc5(Ze = "documentEncoding", ZS = "null") String paramString8, @Zc5(Ze = "publicId", ZS = "null") String paramString9, @Zc5(Ze = "systemId", ZS = "null") String paramString10, @Zc5(Ze = "frameId", ZS = "null") String paramString11, @Zc5(Ze = "contentDocumentIndex", ZS = "null") Integer paramInteger4, @Zc5(Ze = "pseudoType", ZS = "null") PseudoType paramPseudoType, @Zc5(Ze = "shadowRootType", ZS = "null") ShadowRootType paramShadowRootType, @Zc5(Ze = "isClickable", ZS = "null") Boolean paramBoolean3, @Zc5(Ze = "eventListeners", ZS = "null") List<EventListener> paramList3, @Zc5(Ze = "currentSourceURL", ZS = "null") String paramString12, @Zc5(Ze = "originURL", ZS = "null") String paramString13, @Zc5(Ze = "scrollOffsetX", ZS = "null") Double paramDouble1, @Zc5(Ze = "scrollOffsetY", ZS = "null") Double paramDouble2) {
    this.nodeType = paramInteger1;
    this.nodeName = paramString1;
    this.nodeValue = paramString2;
    this.textValue = paramString3;
    this.inputValue = paramString4;
    this.inputChecked = paramBoolean1;
    this.optionSelected = paramBoolean2;
    this.backendNodeId = paramInteger2;
    this.childNodeIndexes = paramList1;
    this.attributes = paramList;
    this.pseudoElementIndexes = paramList2;
    this.layoutNodeIndex = paramInteger3;
    this.documentURL = paramString5;
    this.baseURL = paramString6;
    this.contentLanguage = paramString7;
    this.documentEncoding = paramString8;
    this.publicId = paramString9;
    this.systemId = paramString10;
    this.frameId = paramString11;
    this.contentDocumentIndex = paramInteger4;
    String str = Snapshot.ZQ();
    this.pseudoType = paramPseudoType;
    this.shadowRootType = paramShadowRootType;
    this.isClickable = paramBoolean3;
    this.eventListeners = paramList3;
    this.currentSourceURL = paramString12;
    this.originURL = paramString13;
    this.scrollOffsetX = paramDouble1;
    this.scrollOffsetY = paramDouble2;
    if (str == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\domsnapshot\DOMNode.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */