package net.portswigger.devtools.protocol.events.heapprofiler;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.heapprofiler.ReportHeapSnapshotProgress")
public class ReportHeapSnapshotProgress implements Zl {
  @Zvd(Zp = "done")
  public final Integer done;
  
  @Zvd(Zp = "total")
  public final Integer total;
  
  @Zvd(Zp = "finished")
  @Zj
  public final Boolean finished;
  
  @Zox
  public ReportHeapSnapshotProgress(@Zc5(Ze = "done") Integer paramInteger1, @Zc5(Ze = "total") Integer paramInteger2, @Zc5(Ze = "finished", ZS = "null") Boolean paramBoolean) {
    this.done = paramInteger1;
    this.total = paramInteger2;
    this.finished = paramBoolean;
    Zbqc[] arrayOfZbqc = ResetProfiles.ZF();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\heapprofiler\ReportHeapSnapshotProgress.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */