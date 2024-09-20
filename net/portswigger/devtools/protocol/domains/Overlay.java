package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import net.portswigger.Zi7;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.overlay.InspectModeCanceled;
import net.portswigger.devtools.protocol.events.overlay.InspectNodeRequested;
import net.portswigger.devtools.protocol.events.overlay.NodeHighlightRequested;
import net.portswigger.devtools.protocol.events.overlay.ScreenshotRequested;
import net.portswigger.devtools.protocol.types.dom.RGBA;
import net.portswigger.devtools.protocol.types.overlay.ColorFormat;
import net.portswigger.devtools.protocol.types.overlay.ContainerQueryHighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.FlexNodeHighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.GridNodeHighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.HighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.HingeConfig;
import net.portswigger.devtools.protocol.types.overlay.InspectMode;
import net.portswigger.devtools.protocol.types.overlay.IsolatedElementHighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.ScrollSnapHighlightConfig;
import net.portswigger.devtools.protocol.types.overlay.SourceOrderConfig;
import net.portswigger.devtools.protocol.types.overlay.WindowControlsOverlayConfig;

@Zy
public interface Overlay {
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  @Zr("highlight")
  CompletableFuture<Zf<Map<String, Zi7>>> getHighlightObjectForTest(@Zu("nodeId") Integer paramInteger);
  
  @Zr("highlight")
  CompletableFuture<Zf<Map<String, Zi7>>> getHighlightObjectForTest(@Zu("nodeId") Integer paramInteger, @Zj @Zu("includeDistance") Boolean paramBoolean1, @Zj @Zu("includeStyle") Boolean paramBoolean2, @Zj @Zu("colorFormat") ColorFormat paramColorFormat, @Zj @Zu("showAccessibilityInfo") Boolean paramBoolean3);
  
  @Zr("highlights")
  CompletableFuture<Zf<Map<String, Zi7>>> getGridHighlightObjectsForTest(@Zu("nodeIds") List<Integer> paramList);
  
  @Zr("highlight")
  CompletableFuture<Zf<Map<String, Zi7>>> getSourceOrderHighlightObjectForTest(@Zu("nodeId") Integer paramInteger);
  
  CompletableFuture<Zf<Void>> hideHighlight();
  
  @Deprecated
  CompletableFuture<Zf<Void>> highlightFrame(@Zu("frameId") String paramString);
  
  @Deprecated
  CompletableFuture<Zf<Void>> highlightFrame(@Zu("frameId") String paramString, @Zj @Zu("contentColor") RGBA paramRGBA1, @Zj @Zu("contentOutlineColor") RGBA paramRGBA2);
  
  CompletableFuture<Zf<Void>> highlightNode(@Zu("highlightConfig") HighlightConfig paramHighlightConfig);
  
  CompletableFuture<Zf<Void>> highlightNode(@Zu("highlightConfig") HighlightConfig paramHighlightConfig, @Zj @Zu("nodeId") Integer paramInteger1, @Zj @Zu("backendNodeId") Integer paramInteger2, @Zj @Zu("objectId") String paramString1, @Zj @Zu("selector") String paramString2);
  
  CompletableFuture<Zf<Void>> highlightQuad(@Zu("quad") List<Double> paramList);
  
  CompletableFuture<Zf<Void>> highlightQuad(@Zu("quad") List<Double> paramList, @Zj @Zu("color") RGBA paramRGBA1, @Zj @Zu("outlineColor") RGBA paramRGBA2);
  
  CompletableFuture<Zf<Void>> highlightRect(@Zu("x") Integer paramInteger1, @Zu("y") Integer paramInteger2, @Zu("width") Integer paramInteger3, @Zu("height") Integer paramInteger4);
  
  CompletableFuture<Zf<Void>> highlightRect(@Zu("x") Integer paramInteger1, @Zu("y") Integer paramInteger2, @Zu("width") Integer paramInteger3, @Zu("height") Integer paramInteger4, @Zj @Zu("color") RGBA paramRGBA1, @Zj @Zu("outlineColor") RGBA paramRGBA2);
  
  CompletableFuture<Zf<Void>> highlightSourceOrder(@Zu("sourceOrderConfig") SourceOrderConfig paramSourceOrderConfig);
  
  CompletableFuture<Zf<Void>> highlightSourceOrder(@Zu("sourceOrderConfig") SourceOrderConfig paramSourceOrderConfig, @Zj @Zu("nodeId") Integer paramInteger1, @Zj @Zu("backendNodeId") Integer paramInteger2, @Zj @Zu("objectId") String paramString);
  
  CompletableFuture<Zf<Void>> setInspectMode(@Zu("mode") InspectMode paramInspectMode);
  
  CompletableFuture<Zf<Void>> setInspectMode(@Zu("mode") InspectMode paramInspectMode, @Zj @Zu("highlightConfig") HighlightConfig paramHighlightConfig);
  
  CompletableFuture<Zf<Void>> setShowAdHighlights(@Zu("show") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setPausedInDebuggerMessage();
  
  CompletableFuture<Zf<Void>> setPausedInDebuggerMessage(@Zj @Zu("message") String paramString);
  
  CompletableFuture<Zf<Void>> setShowDebugBorders(@Zu("show") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setShowFPSCounter(@Zu("show") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setShowGridOverlays(@Zu("gridNodeHighlightConfigs") List<GridNodeHighlightConfig> paramList);
  
  CompletableFuture<Zf<Void>> setShowFlexOverlays(@Zu("flexNodeHighlightConfigs") List<FlexNodeHighlightConfig> paramList);
  
  CompletableFuture<Zf<Void>> setShowScrollSnapOverlays(@Zu("scrollSnapHighlightConfigs") List<ScrollSnapHighlightConfig> paramList);
  
  CompletableFuture<Zf<Void>> setShowContainerQueryOverlays(@Zu("containerQueryHighlightConfigs") List<ContainerQueryHighlightConfig> paramList);
  
  CompletableFuture<Zf<Void>> setShowPaintRects(@Zu("result") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setShowLayoutShiftRegions(@Zu("result") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setShowScrollBottleneckRects(@Zu("show") Boolean paramBoolean);
  
  @Deprecated
  CompletableFuture<Zf<Void>> setShowHitTestBorders(@Zu("show") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setShowWebVitals(@Zu("show") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setShowViewportSizeOnResize(@Zu("show") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setShowHinge();
  
  CompletableFuture<Zf<Void>> setShowHinge(@Zj @Zu("hingeConfig") HingeConfig paramHingeConfig);
  
  CompletableFuture<Zf<Void>> setShowIsolatedElements(@Zu("isolatedElementHighlightConfigs") List<IsolatedElementHighlightConfig> paramList);
  
  CompletableFuture<Zf<Void>> setShowWindowControlsOverlay();
  
  CompletableFuture<Zf<Void>> setShowWindowControlsOverlay(@Zj @Zu("windowControlsOverlayConfig") WindowControlsOverlayConfig paramWindowControlsOverlayConfig);
  
  @Zb("inspectNodeRequested")
  Zs onInspectNodeRequested(Zp<InspectNodeRequested> paramZp) throws Zp;
  
  @Zb("nodeHighlightRequested")
  Zs onNodeHighlightRequested(Zp<NodeHighlightRequested> paramZp) throws Zp;
  
  @Zb("screenshotRequested")
  Zs onScreenshotRequested(Zp<ScreenshotRequested> paramZp) throws Zp;
  
  @Zb("inspectModeCanceled")
  Zs onInspectModeCanceled(Zp<InspectModeCanceled> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Overlay.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */