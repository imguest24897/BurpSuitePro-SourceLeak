package net.portswigger.devtools.protocol.types.profiler;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.profiler.Profile")
public class Profile {
  @Zvd(Zp = "nodes")
  public final List<ProfileNode> nodes;
  
  @Zvd(Zp = "startTime")
  public final Double startTime;
  
  @Zvd(Zp = "endTime")
  public final Double endTime;
  
  @Zvd(Zp = "samples")
  @Zj
  public final List<Integer> samples;
  
  @Zvd(Zp = "timeDeltas")
  @Zj
  public final List<Integer> timeDeltas;
  
  @Zox
  public Profile(@Zc5(Ze = "nodes") List<ProfileNode> paramList, @Zc5(Ze = "startTime") Double paramDouble1, @Zc5(Ze = "endTime") Double paramDouble2, @Zc5(Ze = "samples", ZS = "null") List<Integer> paramList1, @Zc5(Ze = "timeDeltas", ZS = "null") List<Integer> paramList2) {
    this.nodes = paramList;
    int i = TakePreciseCoverage.ZK();
    this.startTime = paramDouble1;
    this.endTime = paramDouble2;
    this.samples = paramList1;
    this.timeDeltas = paramList2;
    if (Zbqc.Zwu() == null)
      TakePreciseCoverage.ZN(++i); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\profiler\Profile.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */