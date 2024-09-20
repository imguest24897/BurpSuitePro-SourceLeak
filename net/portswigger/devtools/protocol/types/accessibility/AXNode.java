package net.portswigger.devtools.protocol.types.accessibility;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.accessibility.AXNode")
public class AXNode {
  @Zvd(Zp = "nodeId")
  public final String nodeId;
  
  @Zvd(Zp = "ignored")
  public final Boolean ignored;
  
  @Zvd(Zp = "ignoredReasons")
  @Zj
  public final List<AXProperty> ignoredReasons;
  
  @Zvd(Zp = "role")
  @Zj
  public final AXValue role;
  
  @Zvd(Zp = "chromeRole")
  @Zj
  public final AXValue chromeRole;
  
  @Zvd(Zp = "name")
  @Zj
  public final AXValue name;
  
  @Zvd(Zp = "description")
  @Zj
  public final AXValue description;
  
  @Zvd(Zp = "value")
  @Zj
  public final AXValue value;
  
  @Zvd(Zp = "properties")
  @Zj
  public final List<AXProperty> properties;
  
  @Zvd(Zp = "parentId")
  @Zj
  public final String parentId;
  
  @Zvd(Zp = "childIds")
  @Zj
  public final List<String> childIds;
  
  @Zvd(Zp = "backendDOMNodeId")
  @Zj
  public final Integer backendDOMNodeId;
  
  @Zvd(Zp = "frameId")
  @Zj
  public final String frameId;
  
  private static String ZK;
  
  @Zox
  public AXNode(@Zc5(Ze = "nodeId") String paramString1, @Zc5(Ze = "ignored") Boolean paramBoolean, @Zc5(Ze = "ignoredReasons", ZS = "null") List<AXProperty> paramList1, @Zc5(Ze = "role", ZS = "null") AXValue paramAXValue1, @Zc5(Ze = "chromeRole", ZS = "null") AXValue paramAXValue2, @Zc5(Ze = "name", ZS = "null") AXValue paramAXValue3, @Zc5(Ze = "description", ZS = "null") AXValue paramAXValue4, @Zc5(Ze = "value", ZS = "null") AXValue paramAXValue5, @Zc5(Ze = "properties", ZS = "null") List<AXProperty> paramList2, @Zc5(Ze = "parentId", ZS = "null") String paramString2, @Zc5(Ze = "childIds", ZS = "null") List<String> paramList, @Zc5(Ze = "backendDOMNodeId", ZS = "null") Integer paramInteger, @Zc5(Ze = "frameId", ZS = "null") String paramString3) {
    this.nodeId = paramString1;
    this.ignored = paramBoolean;
    this.ignoredReasons = paramList1;
    this.role = paramAXValue1;
    this.chromeRole = paramAXValue2;
    this.name = paramAXValue3;
    this.description = paramAXValue4;
    this.value = paramAXValue5;
    this.properties = paramList2;
    this.parentId = paramString2;
    this.childIds = paramList;
    String str = Zz();
    this.backendDOMNodeId = paramInteger;
    this.frameId = paramString3;
    if (str == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public static void Zh(String paramString) {
    ZK = paramString;
  }
  
  public static String Zz() {
    return ZK;
  }
  
  static {
    if (Zz() == null)
      Zh("TDemab"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\accessibility\AXNode.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */