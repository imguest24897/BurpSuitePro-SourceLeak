package burp;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.function.Supplier;
import javafx.collections.ObservableList;
import javax.swing.RowSorter;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zmuy extends Zmuc<Zgxp> implements Zb23 {
  private final Zbws Zm;
  
  private final Zr_4 ZT;
  
  private final Zefg<Zzrc> Zi;
  
  private final Zg2c ZY;
  
  private final Zb0h ZL;
  
  private final List<Zzm6> Zb;
  
  private final Zeo4 ZB;
  
  private final Zlee Zn;
  
  private static int ZX;
  
  public Zmuy(Zr_4 paramZr_4, Zefg<Zzrc> paramZefg, Zg2c paramZg2c, Zb0h paramZb0h, ObservableList<Zgxp> paramObservableList, Zeo4 paramZeo4, Zlee paramZlee, int paramInt, Zbws paramZbws) {
    super(paramZg2c, paramObservableList, paramInt);
    this.ZT = paramZr_4;
    this.Zi = paramZefg;
    this.ZY = paramZg2c;
    this.ZL = paramZb0h;
    this.ZB = paramZeo4;
    this.Zn = paramZlee;
    this.Zm = paramZbws;
    this.Zb = new CopyOnWriteArrayList<>();
    paramZbws.ZL(this);
    Zx(paramZbws);
    Zi(paramZbws, paramZefg);
  }
  
  public void Zp(Runnable paramRunnable) {
    Zs0y<Zgxp> zs0y = this.ZB.Zp(this.Zn);
    Objects.requireNonNull(zs0y);
    Zmt4<?> zmt4 = new Zmt4(zs0y::ZH);
    Zgxy.ZH(zmt4, Zv8r.INTRUDER_ATTACK_EDITED_VIEW_FILTER_TIMER);
    Zgxt.Zu(zmt4, paramRunnable);
    ZI((Zln7)zmt4);
  }
  
  public void Zi(Zbws paramZbws, Collection<Zzrc> paramCollection) {
    // Byte code:
    //   0: aload_2
    //   1: ifnull -> 51
    //   4: aload_2
    //   5: invokeinterface isEmpty : ()Z
    //   10: ifne -> 51
    //   13: aload_2
    //   14: invokeinterface size : ()I
    //   19: i2l
    //   20: aload_0
    //   21: getfield ZY : Lburp/Zg2c;
    //   24: invokevirtual Zf : ()Ljava/util/List;
    //   27: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   32: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   37: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   42: invokeinterface count : ()J
    //   47: lcmp
    //   48: ifeq -> 73
    //   51: new javax/swing/RowSorter$SortKey
    //   54: dup
    //   55: getstatic burp/Zlqp.REQUEST_NUMBER : Lburp/Zlqp;
    //   58: getfield legacyPersistedId : I
    //   61: getstatic javax/swing/SortOrder.ASCENDING : Ljavax/swing/SortOrder;
    //   64: invokespecial <init> : (ILjavax/swing/SortOrder;)V
    //   67: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   70: goto -> 100
    //   73: aload_2
    //   74: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   79: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   84: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   89: invokestatic toList : ()Ljava/util/stream/Collector;
    //   92: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   97: checkcast java/util/List
    //   100: astore_3
    //   101: aload_0
    //   102: aload_3
    //   103: aload_1
    //   104: <illegal opcode> run : (Lburp/Zmuy;Ljava/util/List;Lburp/Zbws;)Ljava/lang/Runnable;
    //   109: invokestatic ZO : (Ljava/lang/Runnable;)V
    //   112: return
  }
  
  public void ZW() {
    RowSorter<? extends TableModel> rowSorter = this.Zm.getRowSorter();
    if (rowSorter == null)
      return; 
    List<? extends RowSorter.SortKey> list = rowSorter.getSortKeys();
    if (list == null || list.isEmpty())
      return; 
    List list1 = this.Zi.stream().map(Zzrc::Zen).toList();
    if (list1.size() == list.size() && list1.containsAll(list))
      return; 
    this.Zi.clear();
    list.forEach(this::lambda$persistColumnSortConfiguration$1);
  }
  
  public boolean ZN(int paramInt) {
    TableColumnModel tableColumnModel = this.Zm.getColumnModel();
    if (tableColumnModel instanceof Zrmn) {
      Zrmn zrmn = (Zrmn)tableColumnModel;
      if (zrmn.Zg(paramInt));
    } 
    return false;
  }
  
  public int ZC() {
    return this.ZY.Zu();
  }
  
  public Object ZK(int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: aload_0
    //   3: iload_2
    //   4: <illegal opcode> get : (Lburp/Zmuy;I)Ljava/util/function/Supplier;
    //   9: aload_0
    //   10: iload_2
    //   11: iload_3
    //   12: <illegal opcode> apply : (Lburp/Zmuy;IZ)Ljava/util/function/Function;
    //   17: invokevirtual Zy : (ILjava/util/function/Supplier;Ljava/util/function/Function;)Ljava/lang/Object;
    //   20: areturn
  }
  
  public Object Z_(int paramInt1, int paramInt2, boolean paramBoolean) throws Ztku {
    TableColumnModel tableColumnModel = this.Zm.getColumnModel();
    if (tableColumnModel instanceof Zrmn) {
      Zrmn zrmn = (Zrmn)tableColumnModel;
      return ZK(paramInt1, zrmn.Zm(paramInt2), paramBoolean);
    } 
    return null;
  }
  
  private Object Zy(int paramInt, Supplier<Object> paramSupplier, Function<Zgxp, Object> paramFunction) {
    Zgxp zgxp = ZW(paramInt);
    return (zgxp == null) ? paramSupplier.get() : paramFunction.apply(zgxp);
  }
  
  public void ZT(int paramInt) {
    Zm2.Zo(Zze0.INTRUDER_COPY_COLUMN);
    StringBuilder stringBuilder = new StringBuilder();
    int i = Zp();
    try {
      byte b = 0;
      while (b < this.Zm.getModel().getRowCount()) {
        int j = this.Zm.convertRowIndexToModel(b);
        Object object = Z_(j, paramInt, true);
        stringBuilder.append(object);
        stringBuilder.append(Zlb0.Zp);
        b++;
        if (i == 0)
          break; 
      } 
    } catch (Ztku ztku) {
      Zah.Zl(ztku, Zk_.UNEXPECTED);
    } 
    this.ZL.ZR(stringBuilder.toString());
  }
  
  public void Zq() {
    this.ZY.ZB();
  }
  
  public void fireTableRowsUpdated(int paramInt1, int paramInt2) {
    super.fireTableRowsUpdated(paramInt1, paramInt2);
    if (paramInt1 == paramInt2) {
      Zgxp zgxp = ZW(paramInt1);
      this.Zb.forEach(zgxp::lambda$fireTableRowsUpdated$4);
    } 
  }
  
  public void Zu(Zzm6 paramZzm6) {
    this.Zb.add(paramZzm6);
  }
  
  public void ZO(Zzm6 paramZzm6) {
    this.Zb.remove(paramZzm6);
  }
  
  public TableCellRenderer Zt(int paramInt) {
    return new Zej_(this, this.Zm.getColumnModel(), true);
  }
  
  private static void lambda$fireTableRowsUpdated$4(Zgxp paramZgxp, Zzm6 paramZzm6) {
    paramZzm6.Zl(paramZgxp);
  }
  
  private Object lambda$getValueForColumn$3(int paramInt, boolean paramBoolean, Zgxp paramZgxp) {
    return this.ZY.ZA(paramInt, paramZgxp, paramBoolean);
  }
  
  private Object lambda$getValueForColumn$2(int paramInt) {
    return this.ZY.Zu(paramInt);
  }
  
  private void lambda$persistColumnSortConfiguration$1(RowSorter.SortKey paramSortKey) {
    this.Zi.add(this.ZT.<Zzrc>ZH(new Zs2r(paramSortKey.getColumn(), paramSortKey.getSortOrder())));
  }
  
  private void lambda$buildRowSorter$0(List<? extends RowSorter.SortKey> paramList, Zbws paramZbws) {
    Zm4f zm4f = new Zm4f(this);
    zm4f.setSortKeys(paramList);
    paramZbws.setRowSorter(zm4f);
  }
  
  public static void ZF(int paramInt) {
    ZX = paramInt;
  }
  
  public static int ZK() {
    return ZX;
  }
  
  public static int Zp() {
    int i = ZK();
    return (i == 0) ? 79 : 0;
  }
  
  static {
    if (Zp() == 0)
      ZF(10); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmuy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */