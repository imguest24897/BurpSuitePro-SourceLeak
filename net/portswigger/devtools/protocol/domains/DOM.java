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
import net.portswigger.devtools.protocol.events.dom.AttributeModified;
import net.portswigger.devtools.protocol.events.dom.AttributeRemoved;
import net.portswigger.devtools.protocol.events.dom.CharacterDataModified;
import net.portswigger.devtools.protocol.events.dom.ChildNodeCountUpdated;
import net.portswigger.devtools.protocol.events.dom.ChildNodeInserted;
import net.portswigger.devtools.protocol.events.dom.ChildNodeRemoved;
import net.portswigger.devtools.protocol.events.dom.DistributedNodesUpdated;
import net.portswigger.devtools.protocol.events.dom.DocumentUpdated;
import net.portswigger.devtools.protocol.events.dom.InlineStyleInvalidated;
import net.portswigger.devtools.protocol.events.dom.PseudoElementAdded;
import net.portswigger.devtools.protocol.events.dom.PseudoElementRemoved;
import net.portswigger.devtools.protocol.events.dom.SetChildNodes;
import net.portswigger.devtools.protocol.events.dom.ShadowRootPopped;
import net.portswigger.devtools.protocol.events.dom.ShadowRootPushed;
import net.portswigger.devtools.protocol.events.dom.TopLayerElementsUpdated;
import net.portswigger.devtools.protocol.types.dom.BoxModel;
import net.portswigger.devtools.protocol.types.dom.CSSComputedStyleProperty;
import net.portswigger.devtools.protocol.types.dom.EnableIncludeWhitespace;
import net.portswigger.devtools.protocol.types.dom.FrameOwner;
import net.portswigger.devtools.protocol.types.dom.GetElementByRelationRelation;
import net.portswigger.devtools.protocol.types.dom.LogicalAxes;
import net.portswigger.devtools.protocol.types.dom.Node;
import net.portswigger.devtools.protocol.types.dom.NodeForLocation;
import net.portswigger.devtools.protocol.types.dom.PerformSearch;
import net.portswigger.devtools.protocol.types.dom.PhysicalAxes;
import net.portswigger.devtools.protocol.types.dom.Rect;
import net.portswigger.devtools.protocol.types.runtime.RemoteObject;
import net.portswigger.devtools.protocol.types.runtime.StackTrace;

public interface DOM {
  @Zy
  @Zr("classNames")
  CompletableFuture<Zf<List<String>>> collectClassNamesFromSubtree(@Zu("nodeId") Integer paramInteger);
  
  @Zy
  @Zr("nodeId")
  CompletableFuture<Zf<Integer>> copyTo(@Zu("nodeId") Integer paramInteger1, @Zu("targetNodeId") Integer paramInteger2);
  
  @Zy
  @Zr("nodeId")
  CompletableFuture<Zf<Integer>> copyTo(@Zu("nodeId") Integer paramInteger1, @Zu("targetNodeId") Integer paramInteger2, @Zj @Zu("insertBeforeNodeId") Integer paramInteger3);
  
  @Zr("node")
  CompletableFuture<Zf<Node>> describeNode();
  
  @Zr("node")
  CompletableFuture<Zf<Node>> describeNode(@Zj @Zu("nodeId") Integer paramInteger1, @Zj @Zu("backendNodeId") Integer paramInteger2, @Zj @Zu("objectId") String paramString, @Zj @Zu("depth") Integer paramInteger3, @Zj @Zu("pierce") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> scrollIntoViewIfNeeded();
  
  CompletableFuture<Zf<Void>> scrollIntoViewIfNeeded(@Zj @Zu("nodeId") Integer paramInteger1, @Zj @Zu("backendNodeId") Integer paramInteger2, @Zj @Zu("objectId") String paramString, @Zj @Zu("rect") Rect paramRect);
  
  CompletableFuture<Zf<Void>> disable();
  
  @Zy
  CompletableFuture<Zf<Void>> discardSearchResults(@Zu("searchId") String paramString);
  
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Void>> enable(@Zy @Zj @Zu("includeWhitespace") EnableIncludeWhitespace paramEnableIncludeWhitespace);
  
  CompletableFuture<Zf<Void>> focus();
  
  CompletableFuture<Zf<Void>> focus(@Zj @Zu("nodeId") Integer paramInteger1, @Zj @Zu("backendNodeId") Integer paramInteger2, @Zj @Zu("objectId") String paramString);
  
  @Zr("attributes")
  CompletableFuture<Zf<List<String>>> getAttributes(@Zu("nodeId") Integer paramInteger);
  
  @Zr("model")
  CompletableFuture<Zf<BoxModel>> getBoxModel();
  
  @Zr("model")
  CompletableFuture<Zf<BoxModel>> getBoxModel(@Zj @Zu("nodeId") Integer paramInteger1, @Zj @Zu("backendNodeId") Integer paramInteger2, @Zj @Zu("objectId") String paramString);
  
  @Zy
  @Zr("quads")
  CompletableFuture<Zf<List<List<Double>>>> getContentQuads();
  
  @Zy
  @Zr("quads")
  CompletableFuture<Zf<List<List<Double>>>> getContentQuads(@Zj @Zu("nodeId") Integer paramInteger1, @Zj @Zu("backendNodeId") Integer paramInteger2, @Zj @Zu("objectId") String paramString);
  
  @Zr("root")
  CompletableFuture<Zf<Node>> getDocument();
  
  @Zr("root")
  CompletableFuture<Zf<Node>> getDocument(@Zj @Zu("depth") Integer paramInteger, @Zj @Zu("pierce") Boolean paramBoolean);
  
  @Deprecated
  @Zr("nodes")
  CompletableFuture<Zf<List<Node>>> getFlattenedDocument();
  
  @Deprecated
  @Zr("nodes")
  CompletableFuture<Zf<List<Node>>> getFlattenedDocument(@Zj @Zu("depth") Integer paramInteger, @Zj @Zu("pierce") Boolean paramBoolean);
  
  @Zy
  @Zr("nodeIds")
  CompletableFuture<Zf<List<Integer>>> getNodesForSubtreeByStyle(@Zu("nodeId") Integer paramInteger, @Zu("computedStyles") List<CSSComputedStyleProperty> paramList);
  
  @Zy
  @Zr("nodeIds")
  CompletableFuture<Zf<List<Integer>>> getNodesForSubtreeByStyle(@Zu("nodeId") Integer paramInteger, @Zu("computedStyles") List<CSSComputedStyleProperty> paramList, @Zj @Zu("pierce") Boolean paramBoolean);
  
  CompletableFuture<Zf<NodeForLocation>> getNodeForLocation(@Zu("x") Integer paramInteger1, @Zu("y") Integer paramInteger2);
  
  CompletableFuture<Zf<NodeForLocation>> getNodeForLocation(@Zu("x") Integer paramInteger1, @Zu("y") Integer paramInteger2, @Zj @Zu("includeUserAgentShadowDOM") Boolean paramBoolean1, @Zj @Zu("ignorePointerEventsNone") Boolean paramBoolean2);
  
  @Zr("outerHTML")
  CompletableFuture<Zf<String>> getOuterHTML();
  
  @Zr("outerHTML")
  CompletableFuture<Zf<String>> getOuterHTML(@Zj @Zu("nodeId") Integer paramInteger1, @Zj @Zu("backendNodeId") Integer paramInteger2, @Zj @Zu("objectId") String paramString);
  
  @Zy
  @Zr("nodeId")
  CompletableFuture<Zf<Integer>> getRelayoutBoundary(@Zu("nodeId") Integer paramInteger);
  
  @Zy
  @Zr("nodeIds")
  CompletableFuture<Zf<List<Integer>>> getSearchResults(@Zu("searchId") String paramString, @Zu("fromIndex") Integer paramInteger1, @Zu("toIndex") Integer paramInteger2);
  
  @Zy
  CompletableFuture<Zf<Void>> markUndoableState();
  
  @Zr("nodeId")
  CompletableFuture<Zf<Integer>> moveTo(@Zu("nodeId") Integer paramInteger1, @Zu("targetNodeId") Integer paramInteger2);
  
  @Zr("nodeId")
  CompletableFuture<Zf<Integer>> moveTo(@Zu("nodeId") Integer paramInteger1, @Zu("targetNodeId") Integer paramInteger2, @Zj @Zu("insertBeforeNodeId") Integer paramInteger3);
  
  @Zy
  CompletableFuture<Zf<PerformSearch>> performSearch(@Zu("query") String paramString);
  
  @Zy
  CompletableFuture<Zf<PerformSearch>> performSearch(@Zu("query") String paramString, @Zj @Zu("includeUserAgentShadowDOM") Boolean paramBoolean);
  
  @Zy
  @Zr("nodeId")
  CompletableFuture<Zf<Integer>> pushNodeByPathToFrontend(@Zu("path") String paramString);
  
  @Zy
  @Zr("nodeIds")
  CompletableFuture<Zf<List<Integer>>> pushNodesByBackendIdsToFrontend(@Zu("backendNodeIds") List<Integer> paramList);
  
  @Zr("nodeId")
  CompletableFuture<Zf<Integer>> querySelector(@Zu("nodeId") Integer paramInteger, @Zu("selector") String paramString);
  
  @Zr("nodeIds")
  CompletableFuture<Zf<List<Integer>>> querySelectorAll(@Zu("nodeId") Integer paramInteger, @Zu("selector") String paramString);
  
  @Zy
  @Zr("nodeIds")
  CompletableFuture<Zf<List<Integer>>> getTopLayerElements();
  
  @Zy
  @Zr("nodeId")
  CompletableFuture<Zf<Integer>> getElementByRelation(@Zu("nodeId") Integer paramInteger, @Zu("relation") GetElementByRelationRelation paramGetElementByRelationRelation);
  
  @Zy
  CompletableFuture<Zf<Void>> redo();
  
  CompletableFuture<Zf<Void>> removeAttribute(@Zu("nodeId") Integer paramInteger, @Zu("name") String paramString);
  
  CompletableFuture<Zf<Void>> removeNode(@Zu("nodeId") Integer paramInteger);
  
  CompletableFuture<Zf<Void>> requestChildNodes(@Zu("nodeId") Integer paramInteger);
  
  CompletableFuture<Zf<Void>> requestChildNodes(@Zu("nodeId") Integer paramInteger1, @Zj @Zu("depth") Integer paramInteger2, @Zj @Zu("pierce") Boolean paramBoolean);
  
  @Zr("nodeId")
  CompletableFuture<Zf<Integer>> requestNode(@Zu("objectId") String paramString);
  
  @Zr("object")
  CompletableFuture<Zf<RemoteObject>> resolveNode();
  
  @Zr("object")
  CompletableFuture<Zf<RemoteObject>> resolveNode(@Zj @Zu("nodeId") Integer paramInteger1, @Zj @Zu("backendNodeId") Integer paramInteger2, @Zj @Zu("objectGroup") String paramString, @Zj @Zu("executionContextId") Integer paramInteger3);
  
  CompletableFuture<Zf<Void>> setAttributeValue(@Zu("nodeId") Integer paramInteger, @Zu("name") String paramString1, @Zu("value") String paramString2);
  
  CompletableFuture<Zf<Void>> setAttributesAsText(@Zu("nodeId") Integer paramInteger, @Zu("text") String paramString);
  
  CompletableFuture<Zf<Void>> setAttributesAsText(@Zu("nodeId") Integer paramInteger, @Zu("text") String paramString1, @Zj @Zu("name") String paramString2);
  
  CompletableFuture<Zf<Void>> setFileInputFiles(@Zu("files") List<String> paramList);
  
  CompletableFuture<Zf<Void>> setFileInputFiles(@Zu("files") List<String> paramList, @Zj @Zu("nodeId") Integer paramInteger1, @Zj @Zu("backendNodeId") Integer paramInteger2, @Zj @Zu("objectId") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> setNodeStackTracesEnabled(@Zu("enable") Boolean paramBoolean);
  
  @Zy
  @Zr("creation")
  CompletableFuture<Zf<StackTrace>> getNodeStackTraces(@Zu("nodeId") Integer paramInteger);
  
  @Zy
  @Zr("path")
  CompletableFuture<Zf<String>> getFileInfo(@Zu("objectId") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> setInspectedNode(@Zu("nodeId") Integer paramInteger);
  
  @Zr("nodeId")
  CompletableFuture<Zf<Integer>> setNodeName(@Zu("nodeId") Integer paramInteger, @Zu("name") String paramString);
  
  CompletableFuture<Zf<Void>> setNodeValue(@Zu("nodeId") Integer paramInteger, @Zu("value") String paramString);
  
  CompletableFuture<Zf<Void>> setOuterHTML(@Zu("nodeId") Integer paramInteger, @Zu("outerHTML") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> undo();
  
  @Zy
  CompletableFuture<Zf<FrameOwner>> getFrameOwner(@Zu("frameId") String paramString);
  
  @Zy
  @Zr("nodeId")
  CompletableFuture<Zf<Integer>> getContainerForNode(@Zu("nodeId") Integer paramInteger);
  
  @Zy
  @Zr("nodeId")
  CompletableFuture<Zf<Integer>> getContainerForNode(@Zu("nodeId") Integer paramInteger, @Zj @Zu("containerName") String paramString, @Zj @Zu("physicalAxes") PhysicalAxes paramPhysicalAxes, @Zj @Zu("logicalAxes") LogicalAxes paramLogicalAxes);
  
  @Zy
  @Zr("nodeIds")
  CompletableFuture<Zf<List<Integer>>> getQueryingDescendantsForContainer(@Zu("nodeId") Integer paramInteger);
  
  @Zy
  @Zr("nodeId")
  CompletableFuture<Zf<Integer>> getAnchorElement(@Zu("nodeId") Integer paramInteger);
  
  @Zy
  @Zr("nodeId")
  CompletableFuture<Zf<Integer>> getAnchorElement(@Zu("nodeId") Integer paramInteger, @Zj @Zu("anchorSpecifier") String paramString);
  
  @Zb("attributeModified")
  Zs onAttributeModified(Zp<AttributeModified> paramZp) throws Zp;
  
  @Zb("attributeRemoved")
  Zs onAttributeRemoved(Zp<AttributeRemoved> paramZp) throws Zp;
  
  @Zb("characterDataModified")
  Zs onCharacterDataModified(Zp<CharacterDataModified> paramZp) throws Zp;
  
  @Zb("childNodeCountUpdated")
  Zs onChildNodeCountUpdated(Zp<ChildNodeCountUpdated> paramZp) throws Zp;
  
  @Zb("childNodeInserted")
  Zs onChildNodeInserted(Zp<ChildNodeInserted> paramZp) throws Zp;
  
  @Zb("childNodeRemoved")
  Zs onChildNodeRemoved(Zp<ChildNodeRemoved> paramZp) throws Zp;
  
  @Zb("distributedNodesUpdated")
  @Zy
  Zs onDistributedNodesUpdated(Zp<DistributedNodesUpdated> paramZp) throws Zp;
  
  @Zb("documentUpdated")
  Zs onDocumentUpdated(Zp<DocumentUpdated> paramZp) throws Zp;
  
  @Zb("inlineStyleInvalidated")
  @Zy
  Zs onInlineStyleInvalidated(Zp<InlineStyleInvalidated> paramZp) throws Zp;
  
  @Zb("pseudoElementAdded")
  @Zy
  Zs onPseudoElementAdded(Zp<PseudoElementAdded> paramZp) throws Zp;
  
  @Zb("topLayerElementsUpdated")
  @Zy
  Zs onTopLayerElementsUpdated(Zp<TopLayerElementsUpdated> paramZp) throws Zp;
  
  @Zb("pseudoElementRemoved")
  @Zy
  Zs onPseudoElementRemoved(Zp<PseudoElementRemoved> paramZp) throws Zp;
  
  @Zb("setChildNodes")
  Zs onSetChildNodes(Zp<SetChildNodes> paramZp) throws Zp;
  
  @Zb("shadowRootPopped")
  @Zy
  Zs onShadowRootPopped(Zp<ShadowRootPopped> paramZp) throws Zp;
  
  @Zb("shadowRootPushed")
  @Zy
  Zs onShadowRootPushed(Zp<ShadowRootPushed> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\DOM.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */