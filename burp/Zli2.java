package burp;

import java.awt.Point;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zli2 {
  private final Zerg ZP;
  
  private final Consumer<Zeeg> ZK;
  
  private final Ztpe ZO;
  
  private final BiConsumer<byte[], Zeeg> Zj;
  
  private final Runnable Zb;
  
  private final Zbws ZT;
  
  Zli2(Zerg paramZerg, Consumer<Zeeg> paramConsumer, Zbws paramZbws, Ztpe paramZtpe, BiConsumer<byte[], Zeeg> paramBiConsumer, Runnable paramRunnable) {
    this.ZP = paramZerg;
    this.ZK = paramConsumer;
    this.ZT = paramZbws;
    this.ZO = paramZtpe;
    this.Zj = paramBiConsumer;
    this.Zb = paramRunnable;
  }
  
  Zgz6 ZX() {
    return Z_(null);
  }
  
  Zgz6 Z_(Point paramPoint) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    return ZV(ZR(paramPoint));
  }
  
  private List<Zeeg> ZR(Point paramPoint) {
    return ZY(this.ZT.ZS(paramPoint));
  }
  
  private List<Zeeg> ZY(int[] paramArrayOfint) {
    return (List<Zeeg>)Arrays.stream(paramArrayOfint).mapToObj(this::ZP).filter(Objects::nonNull).collect(Collectors.toList());
  }
  
  private Zeeg ZP(int paramInt) {
    if (paramInt < 0 || paramInt >= this.ZT.getRowCount())
      return null; 
    int i = this.ZT.convertRowIndexToModel(paramInt);
    return this.ZO.Za(i);
  }
  
  private Zgz6 ZV(List<Zeeg> paramList) {
    return paramList.isEmpty() ? Zgz6.Zz : new Zgz6(this.ZP, this.ZK, this.ZO, this.Zj, this.Zb, paramList);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zli2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */