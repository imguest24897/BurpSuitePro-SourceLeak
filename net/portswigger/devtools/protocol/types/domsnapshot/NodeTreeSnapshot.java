package net.portswigger.devtools.protocol.types.domsnapshot;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.domsnapshot.NodeTreeSnapshot")
public class NodeTreeSnapshot {
  @Zvd(Zp = "parentIndex")
  @Zj
  public final List<Integer> parentIndex;
  
  @Zvd(Zp = "nodeType")
  @Zj
  public final List<Integer> nodeType;
  
  @Zvd(Zp = "shadowRootType")
  @Zj
  public final RareStringData shadowRootType;
  
  @Zvd(Zp = "nodeName")
  @Zj
  public final List<Integer> nodeName;
  
  @Zvd(Zp = "nodeValue")
  @Zj
  public final List<Integer> nodeValue;
  
  @Zvd(Zp = "backendNodeId")
  @Zj
  public final List<Integer> backendNodeId;
  
  @Zvd(Zp = "attributes")
  @Zj
  public final List<List<Integer>> attributes;
  
  @Zvd(Zp = "textValue")
  @Zj
  public final RareStringData textValue;
  
  @Zvd(Zp = "inputValue")
  @Zj
  public final RareStringData inputValue;
  
  @Zvd(Zp = "inputChecked")
  @Zj
  public final RareBooleanData inputChecked;
  
  @Zvd(Zp = "optionSelected")
  @Zj
  public final RareBooleanData optionSelected;
  
  @Zvd(Zp = "contentDocumentIndex")
  @Zj
  public final RareIntegerData contentDocumentIndex;
  
  @Zvd(Zp = "pseudoType")
  @Zj
  public final RareStringData pseudoType;
  
  @Zvd(Zp = "pseudoIdentifier")
  @Zj
  public final RareStringData pseudoIdentifier;
  
  @Zvd(Zp = "isClickable")
  @Zj
  public final RareBooleanData isClickable;
  
  @Zvd(Zp = "currentSourceURL")
  @Zj
  public final RareStringData currentSourceURL;
  
  @Zvd(Zp = "originURL")
  @Zj
  public final RareStringData originURL;
  
  @Zox
  public NodeTreeSnapshot(@Zc5(Ze = "parentIndex", ZS = "null") List<Integer> paramList1, @Zc5(Ze = "nodeType", ZS = "null") List<Integer> paramList2, @Zc5(Ze = "shadowRootType", ZS = "null") RareStringData paramRareStringData1, @Zc5(Ze = "nodeName", ZS = "null") List<Integer> paramList3, @Zc5(Ze = "nodeValue", ZS = "null") List<Integer> paramList4, @Zc5(Ze = "backendNodeId", ZS = "null") List<Integer> paramList5, @Zc5(Ze = "attributes", ZS = "null") List<List<Integer>> paramList, @Zc5(Ze = "textValue", ZS = "null") RareStringData paramRareStringData2, @Zc5(Ze = "inputValue", ZS = "null") RareStringData paramRareStringData3, @Zc5(Ze = "inputChecked", ZS = "null") RareBooleanData paramRareBooleanData1, @Zc5(Ze = "optionSelected", ZS = "null") RareBooleanData paramRareBooleanData2, @Zc5(Ze = "contentDocumentIndex", ZS = "null") RareIntegerData paramRareIntegerData, @Zc5(Ze = "pseudoType", ZS = "null") RareStringData paramRareStringData4, @Zc5(Ze = "pseudoIdentifier", ZS = "null") RareStringData paramRareStringData5, @Zc5(Ze = "isClickable", ZS = "null") RareBooleanData paramRareBooleanData3, @Zc5(Ze = "currentSourceURL", ZS = "null") RareStringData paramRareStringData6, @Zc5(Ze = "originURL", ZS = "null") RareStringData paramRareStringData7) {
    this.parentIndex = paramList1;
    this.nodeType = paramList2;
    this.shadowRootType = paramRareStringData1;
    this.nodeName = paramList3;
    this.nodeValue = paramList4;
    this.backendNodeId = paramList5;
    this.attributes = paramList;
    this.textValue = paramRareStringData2;
    this.inputValue = paramRareStringData3;
    String str = Snapshot.ZQ();
    this.inputChecked = paramRareBooleanData1;
    this.optionSelected = paramRareBooleanData2;
    this.contentDocumentIndex = paramRareIntegerData;
    this.pseudoType = paramRareStringData4;
    this.pseudoIdentifier = paramRareStringData5;
    this.isClickable = paramRareBooleanData3;
    this.currentSourceURL = paramRareStringData6;
    this.originURL = paramRareStringData7;
    if (Zbqc.Zwu() == null)
      Snapshot.ZM("DOZ6Kc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\domsnapshot\NodeTreeSnapshot.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */