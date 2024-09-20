package burp;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

class Ztnb extends Ztn0 {
  static final Zl71 ZT = new Zl71();
  
  private final Supplier<Boolean> Zv;
  
  private final Zgkx Zk;
  
  private final Zgtm Zo;
  
  private final BiFunction<Integer, Integer, Boolean> Z_;
  
  private final Zlns Zd;
  
  private final int Zn;
  
  private List<Zb6u> ZK;
  
  Ztnb(Zgkx paramZgkx, Zgtm paramZgtm, BiFunction<Integer, Integer, Boolean> paramBiFunction, Zlns paramZlns, Supplier<Boolean> paramSupplier) {
    this.Zv = paramSupplier;
    this.Zk = paramZgkx;
    this.Zo = paramZgtm;
    this.Z_ = paramBiFunction;
    this.Zd = paramZlns;
    this.Zn = paramZlns.ZE(Zm0m.DETAILS);
    this.ZK = paramZgkx.ZN();
    this.Zf = paramZlns.Zb();
    this.ZV = paramZlns.ZL();
    this.Zc = paramZlns.Zm();
    this.ZZ = 4;
    this.Zu = false;
  }
  
  void ZY() {
    this.ZK = this.Zk.ZN();
    fireTableDataChanged();
  }
  
  public int getRowCount() {
    return this.ZK.size();
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    Zb6u zb6u = this.ZK.get(paramInt1);
    Zm0m zm0m = this.Zd.Zb(paramInt2);
    return zm0m.getValueAtFunction.apply(zb6u);
  }
  
  public Class<?> getColumnClass(int paramInt) {
    return (paramInt == this.Zn) ? Zl71.class : super.getColumnClass(paramInt);
  }
  
  protected Comparator<?> ZS(int paramInt) {
    return Ztnb::lambda$getColumnComparator$0;
  }
  
  public void Zx(Zbws paramZbws) {
    super.Zx(paramZbws);
    Zmxv zmxv = new Zmxv();
    paramZbws.setDefaultRenderer(String.class, new Zmy5(zmxv, this.Zv));
    paramZbws.setDefaultRenderer(Zl71.class, new Zm25(this.Z_));
    paramZbws.setDefaultEditor(String.class, new Zt4n(paramZbws, this::lambda$configureTableColumns$1, this.Zo, this.Zd, zmxv, this.Zv));
  }
  
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return this.Zk.Zm(this.Zd.Zb(paramInt2));
  }
  
  private Zb6u lambda$configureTableColumns$1(Integer paramInteger) {
    return this.ZK.get(paramInteger.intValue());
  }
  
  private static int lambda$getColumnComparator$0(Object paramObject1, Object paramObject2) {
    return 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztnb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */