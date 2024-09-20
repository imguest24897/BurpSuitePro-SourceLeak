package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.swing.SwingUtilities;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zb0v implements Zky2 {
  private final Zbws Zl;
  
  private final Zmue ZN;
  
  private final Zgzz ZI;
  
  private final Zm6x ZE;
  
  public Zb0v(Zbws paramZbws, Zmue paramZmue, Zgzz paramZgzz, Zm6x paramZm6x) {
    this.Zl = paramZbws;
    this.ZN = paramZmue;
    this.ZI = paramZgzz;
    this.ZE = paramZm6x;
  }
  
  public void ZR(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    if (Zo(paramInt2)) {
      Zm2.Zo(Zze0.PROXY_INTERCEPT_NOTES_TABLE_CELL_CLICKED);
      this.ZE.ZB(new Zlw3(this.ZN.Zf(paramInt1)));
    } 
  }
  
  private boolean Zo(int paramInt) {
    return Zg25.Zj.ZS().equals(this.ZN.getColumnName(this.Zl.convertColumnIndexToModel(paramInt)));
  }
  
  public void ZV(MouseEvent paramMouseEvent, Component paramComponent, Point paramPoint) {
    List<Ztf_<?>> list = ZH(paramPoint);
    if (!list.isEmpty())
      this.ZI.ZZ(list, paramComponent, paramPoint, paramMouseEvent); 
  }
  
  private List<Ztf_<?>> ZH(Point paramPoint) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    return Zq(this.Zl.ZS(paramPoint));
  }
  
  private List<Ztf_<?>> Zq(int[] paramArrayOfint) {
    return (List<Ztf_<?>>)Arrays.stream(paramArrayOfint).mapToObj(this::Zs).filter(Objects::nonNull).collect(Collectors.toList());
  }
  
  private Ztf_<?> Zs(int paramInt) {
    if (paramInt < 0 || paramInt >= this.Zl.getRowCount())
      return null; 
    int i = this.Zl.convertRowIndexToModel(paramInt);
    return this.ZN.Zf(i);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb0v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */