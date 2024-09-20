package net.portswigger.devtools.protocol.domains;

import java.util.List;
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
import net.portswigger.devtools.protocol.events.layertree.LayerPainted;
import net.portswigger.devtools.protocol.events.layertree.LayerTreeDidChange;
import net.portswigger.devtools.protocol.types.dom.Rect;
import net.portswigger.devtools.protocol.types.layertree.CompositingReasons;
import net.portswigger.devtools.protocol.types.layertree.PictureTile;

@Zy
public interface LayerTree {
  CompletableFuture<Zf<CompositingReasons>> compositingReasons(@Zu("layerId") String paramString);
  
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  @Zr("snapshotId")
  CompletableFuture<Zf<String>> loadSnapshot(@Zu("tiles") List<PictureTile> paramList);
  
  @Zr("snapshotId")
  CompletableFuture<Zf<String>> makeSnapshot(@Zu("layerId") String paramString);
  
  @Zr("timings")
  CompletableFuture<Zf<List<List<Double>>>> profileSnapshot(@Zu("snapshotId") String paramString);
  
  @Zr("timings")
  CompletableFuture<Zf<List<List<Double>>>> profileSnapshot(@Zu("snapshotId") String paramString, @Zj @Zu("minRepeatCount") Integer paramInteger, @Zj @Zu("minDuration") Double paramDouble, @Zj @Zu("clipRect") Rect paramRect);
  
  CompletableFuture<Zf<Void>> releaseSnapshot(@Zu("snapshotId") String paramString);
  
  @Zr("dataURL")
  CompletableFuture<Zf<String>> replaySnapshot(@Zu("snapshotId") String paramString);
  
  @Zr("dataURL")
  CompletableFuture<Zf<String>> replaySnapshot(@Zu("snapshotId") String paramString, @Zj @Zu("fromStep") Integer paramInteger1, @Zj @Zu("toStep") Integer paramInteger2, @Zj @Zu("scale") Double paramDouble);
  
  @Zr("commandLog")
  CompletableFuture<Zf<List<Zi7>>> snapshotCommandLog(@Zu("snapshotId") String paramString);
  
  @Zb("layerPainted")
  Zs onLayerPainted(Zp<LayerPainted> paramZp) throws Zp;
  
  @Zb("layerTreeDidChange")
  Zs onLayerTreeDidChange(Zp<LayerTreeDidChange> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\LayerTree.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */