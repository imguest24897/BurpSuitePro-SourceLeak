package net.portswigger.devtools.protocol.events.heapprofiler;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.heapprofiler.AddHeapSnapshotChunk")
public class AddHeapSnapshotChunk implements Zl {
  @Zvd(Zp = "chunk")
  public final String chunk;
  
  @Zox
  public AddHeapSnapshotChunk(@Zc5(Ze = "chunk") String paramString) {
    this.chunk = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\heapprofiler\AddHeapSnapshotChunk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */