package net.portswigger.devtools.protocol.types.dom;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.dom.Node")
public class Node {
  @Zvd(Zp = "nodeId")
  public final Integer nodeId;
  
  @Zvd(Zp = "parentId")
  @Zj
  public final Integer parentId;
  
  @Zvd(Zp = "backendNodeId")
  public final Integer backendNodeId;
  
  @Zvd(Zp = "nodeType")
  public final Integer nodeType;
  
  @Zvd(Zp = "nodeName")
  public final String nodeName;
  
  @Zvd(Zp = "localName")
  public final String localName;
  
  @Zvd(Zp = "nodeValue")
  public final String nodeValue;
  
  @Zvd(Zp = "childNodeCount")
  @Zj
  public final Integer childNodeCount;
  
  @Zvd(Zp = "children")
  @Zj
  public final List<Node> children;
  
  @Zvd(Zp = "attributes")
  @Zj
  public final List<String> attributes;
  
  @Zvd(Zp = "documentURL")
  @Zj
  public final String documentURL;
  
  @Zvd(Zp = "baseURL")
  @Zj
  public final String baseURL;
  
  @Zvd(Zp = "publicId")
  @Zj
  public final String publicId;
  
  @Zvd(Zp = "systemId")
  @Zj
  public final String systemId;
  
  @Zvd(Zp = "internalSubset")
  @Zj
  public final String internalSubset;
  
  @Zvd(Zp = "xmlVersion")
  @Zj
  public final String xmlVersion;
  
  @Zvd(Zp = "name")
  @Zj
  public final String name;
  
  @Zvd(Zp = "value")
  @Zj
  public final String value;
  
  @Zvd(Zp = "pseudoType")
  @Zj
  public final PseudoType pseudoType;
  
  @Zvd(Zp = "pseudoIdentifier")
  @Zj
  public final String pseudoIdentifier;
  
  @Zvd(Zp = "shadowRootType")
  @Zj
  public final ShadowRootType shadowRootType;
  
  @Zvd(Zp = "frameId")
  @Zj
  public final String frameId;
  
  @Zvd(Zp = "contentDocument")
  @Zj
  public final Node contentDocument;
  
  @Zvd(Zp = "shadowRoots")
  @Zj
  public final List<Node> shadowRoots;
  
  @Zvd(Zp = "templateContent")
  @Zj
  public final Node templateContent;
  
  @Zvd(Zp = "pseudoElements")
  @Zj
  public final List<Node> pseudoElements;
  
  @Zvd(Zp = "importedDocument")
  @Deprecated
  @Zj
  public final Node importedDocument;
  
  @Zvd(Zp = "distributedNodes")
  @Zj
  public final List<BackendNode> distributedNodes;
  
  @Zvd(Zp = "isSVG")
  @Zj
  public final Boolean isSVG;
  
  @Zvd(Zp = "compatibilityMode")
  @Zj
  public final CompatibilityMode compatibilityMode;
  
  @Zvd(Zp = "assignedSlot")
  @Zj
  public final BackendNode assignedSlot;
  
  private static int Zz;
  
  @Zox
  public Node(@Zc5(Ze = "nodeId") Integer paramInteger1, @Zc5(Ze = "parentId", ZS = "null") Integer paramInteger2, @Zc5(Ze = "backendNodeId") Integer paramInteger3, @Zc5(Ze = "nodeType") Integer paramInteger4, @Zc5(Ze = "nodeName") String paramString1, @Zc5(Ze = "localName") String paramString2, @Zc5(Ze = "nodeValue") String paramString3, @Zc5(Ze = "childNodeCount", ZS = "null") Integer paramInteger5, @Zc5(Ze = "children", ZS = "null") List<Node> paramList1, @Zc5(Ze = "attributes", ZS = "null") List<String> paramList, @Zc5(Ze = "documentURL", ZS = "null") String paramString4, @Zc5(Ze = "baseURL", ZS = "null") String paramString5, @Zc5(Ze = "publicId", ZS = "null") String paramString6, @Zc5(Ze = "systemId", ZS = "null") String paramString7, @Zc5(Ze = "internalSubset", ZS = "null") String paramString8, @Zc5(Ze = "xmlVersion", ZS = "null") String paramString9, @Zc5(Ze = "name", ZS = "null") String paramString10, @Zc5(Ze = "value", ZS = "null") String paramString11, @Zc5(Ze = "pseudoType", ZS = "null") PseudoType paramPseudoType, @Zc5(Ze = "pseudoIdentifier", ZS = "null") String paramString12, @Zc5(Ze = "shadowRootType", ZS = "null") ShadowRootType paramShadowRootType, @Zc5(Ze = "frameId", ZS = "null") String paramString13, @Zc5(Ze = "contentDocument", ZS = "null") Node paramNode1, @Zc5(Ze = "shadowRoots", ZS = "null") List<Node> paramList2, @Zc5(Ze = "templateContent", ZS = "null") Node paramNode2, @Zc5(Ze = "pseudoElements", ZS = "null") List<Node> paramList3, @Zc5(Ze = "importedDocument", ZS = "null") Node paramNode3, @Zc5(Ze = "distributedNodes", ZS = "null") List<BackendNode> paramList4, @Zc5(Ze = "isSVG", ZS = "null") Boolean paramBoolean, @Zc5(Ze = "compatibilityMode", ZS = "null") CompatibilityMode paramCompatibilityMode, @Zc5(Ze = "assignedSlot", ZS = "null") BackendNode paramBackendNode) {
    this.nodeId = paramInteger1;
    this.parentId = paramInteger2;
    this.backendNodeId = paramInteger3;
    this.nodeType = paramInteger4;
    this.nodeName = paramString1;
    this.localName = paramString2;
    this.nodeValue = paramString3;
    this.childNodeCount = paramInteger5;
    this.children = paramList1;
    this.attributes = paramList;
    this.documentURL = paramString4;
    this.baseURL = paramString5;
    this.publicId = paramString6;
    this.systemId = paramString7;
    this.internalSubset = paramString8;
    this.xmlVersion = paramString9;
    this.name = paramString10;
    this.value = paramString11;
    this.pseudoType = paramPseudoType;
    this.pseudoIdentifier = paramString12;
    this.shadowRootType = paramShadowRootType;
    int i = ZX();
    this.frameId = paramString13;
    this.contentDocument = paramNode1;
    this.shadowRoots = paramList2;
    this.templateContent = paramNode2;
    this.pseudoElements = paramList3;
    this.importedDocument = paramNode3;
    this.distributedNodes = paramList4;
    this.isSVG = paramBoolean;
    this.compatibilityMode = paramCompatibilityMode;
    this.assignedSlot = paramBackendNode;
    if (i != 0)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public static void Zf(int paramInt) {
    Zz = paramInt;
  }
  
  public static int ZF() {
    return Zz;
  }
  
  public static int ZX() {
    int i = ZF();
    return (i == 0) ? 58 : 0;
  }
  
  static {
    if (ZF() == 0)
      Zf(46); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\dom\Node.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */