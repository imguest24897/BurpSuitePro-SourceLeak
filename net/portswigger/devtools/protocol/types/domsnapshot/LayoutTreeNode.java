package net.portswigger.devtools.protocol.types.domsnapshot;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.dom.Rect;

@Zsi("net.portswigger.devtools.protocol.types.domsnapshot.LayoutTreeNode")
public class LayoutTreeNode {
  @Zvd(Zp = "domNodeIndex")
  public final Integer domNodeIndex;
  
  @Zvd(Zp = "boundingBox")
  public final Rect boundingBox;
  
  @Zvd(Zp = "layoutText")
  @Zj
  public final String layoutText;
  
  @Zvd(Zp = "inlineTextNodes")
  @Zj
  public final List<InlineTextBox> inlineTextNodes;
  
  @Zvd(Zp = "styleIndex")
  @Zj
  public final Integer styleIndex;
  
  @Zvd(Zp = "paintOrder")
  @Zj
  public final Integer paintOrder;
  
  @Zvd(Zp = "isStackingContext")
  @Zj
  public final Boolean isStackingContext;
  
  @Zox
  public LayoutTreeNode(@Zc5(Ze = "domNodeIndex") Integer paramInteger1, @Zc5(Ze = "boundingBox") Rect paramRect, @Zc5(Ze = "layoutText", ZS = "null") String paramString, @Zc5(Ze = "inlineTextNodes", ZS = "null") List<InlineTextBox> paramList, @Zc5(Ze = "styleIndex", ZS = "null") Integer paramInteger2, @Zc5(Ze = "paintOrder", ZS = "null") Integer paramInteger3, @Zc5(Ze = "isStackingContext", ZS = "null") Boolean paramBoolean) {
    this.domNodeIndex = paramInteger1;
    this.boundingBox = paramRect;
    this.layoutText = paramString;
    this.inlineTextNodes = paramList;
    this.styleIndex = paramInteger2;
    this.paintOrder = paramInteger3;
    this.isStackingContext = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\domsnapshot\LayoutTreeNode.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */