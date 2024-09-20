package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.accessibility.LoadComplete;
import net.portswigger.devtools.protocol.events.accessibility.NodesUpdated;
import net.portswigger.devtools.protocol.types.accessibility.AXNode;

@Zy
public interface Accessibility {
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  @Zy
  @Zr("nodes")
  CompletableFuture<Zf<List<AXNode>>> getPartialAXTree();
  
  @Zy
  @Zr("nodes")
  CompletableFuture<Zf<List<AXNode>>> getPartialAXTree(@Zj @Zu("nodeId") Integer paramInteger1, @Zj @Zu("backendNodeId") Integer paramInteger2, @Zj @Zu("objectId") String paramString, @Zj @Zu("fetchRelatives") Boolean paramBoolean);
  
  @Zy
  @Zr("nodes")
  CompletableFuture<Zf<List<AXNode>>> getFullAXTree();
  
  @Zy
  @Zr("nodes")
  CompletableFuture<Zf<List<AXNode>>> getFullAXTree(@Zj @Zu("depth") Integer paramInteger, @Zj @Zu("frameId") String paramString);
  
  @Zy
  @Zr("node")
  CompletableFuture<Zf<AXNode>> getRootAXNode();
  
  @Zy
  @Zr("node")
  CompletableFuture<Zf<AXNode>> getRootAXNode(@Zj @Zu("frameId") String paramString);
  
  @Zy
  @Zr("nodes")
  CompletableFuture<Zf<List<AXNode>>> getAXNodeAndAncestors();
  
  @Zy
  @Zr("nodes")
  CompletableFuture<Zf<List<AXNode>>> getAXNodeAndAncestors(@Zj @Zu("nodeId") Integer paramInteger1, @Zj @Zu("backendNodeId") Integer paramInteger2, @Zj @Zu("objectId") String paramString);
  
  @Zy
  @Zr("nodes")
  CompletableFuture<Zf<List<AXNode>>> getChildAXNodes(@Zu("id") String paramString);
  
  @Zy
  @Zr("nodes")
  CompletableFuture<Zf<List<AXNode>>> getChildAXNodes(@Zu("id") String paramString1, @Zj @Zu("frameId") String paramString2);
  
  @Zy
  @Zr("nodes")
  CompletableFuture<Zf<List<AXNode>>> queryAXTree();
  
  @Zy
  @Zr("nodes")
  CompletableFuture<Zf<List<AXNode>>> queryAXTree(@Zj @Zu("nodeId") Integer paramInteger1, @Zj @Zu("backendNodeId") Integer paramInteger2, @Zj @Zu("objectId") String paramString1, @Zj @Zu("accessibleName") String paramString2, @Zj @Zu("role") String paramString3);
  
  @Zb("loadComplete")
  @Zy
  Zs onLoadComplete(Zp<LoadComplete> paramZp) throws Zp;
  
  @Zb("nodesUpdated")
  @Zy
  Zs onNodesUpdated(Zp<NodesUpdated> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Accessibility.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */