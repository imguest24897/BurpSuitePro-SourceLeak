package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.tree.TreePath;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzm_ extends MouseAdapter implements Zzyl, Zeq, Zky2 {
  private final Zg_q Zl;
  
  private final Zmrj ZC;
  
  private final Zbup ZG;
  
  private final Zmiw ZD;
  
  private final Zmlq Zu;
  
  private final Zbqc Zt;
  
  protected final Zbws ZV;
  
  private static final String a;
  
  public Zzm_(Zmrj paramZmrj, Zg_q paramZg_q, Zbws paramZbws, Zmiw paramZmiw, Zbup paramZbup, Zmlq paramZmlq, Zbqc paramZbqc) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload #7
    //   7: putfield Zt : Lburp/Zbqc;
    //   10: aload #6
    //   12: ifnull -> 19
    //   15: iconst_1
    //   16: goto -> 20
    //   19: iconst_0
    //   20: getstatic net/portswigger/Zqf.Zv : Lnet/portswigger/Zqf;
    //   23: ldc2_w 6
    //   26: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   29: aload_0
    //   30: aload_1
    //   31: putfield ZC : Lburp/Zmrj;
    //   34: aload_0
    //   35: aload_2
    //   36: putfield Zl : Lburp/Zg_q;
    //   39: aload_0
    //   40: aload_3
    //   41: putfield ZV : Lburp/Zbws;
    //   44: aload_0
    //   45: aload #4
    //   47: putfield ZD : Lburp/Zmiw;
    //   50: aload_0
    //   51: aload #5
    //   53: putfield ZG : Lburp/Zbup;
    //   56: aload_0
    //   57: aload #6
    //   59: putfield Zu : Lburp/Zmlq;
    //   62: aload #4
    //   64: aload_0
    //   65: aload_3
    //   66: <illegal opcode> tableChanged : (Lburp/Zzm_;Lburp/Zbws;)Ljavax/swing/event/TableModelListener;
    //   71: invokevirtual addTableModelListener : (Ljavax/swing/event/TableModelListener;)V
    //   74: return
  }
  
  public Component ZT() {
    return this.Zt;
  }
  
  public void Zx(TreePath[] paramArrayOfTreePath, Zbfx paramZbfx, AtomicBoolean paramAtomicBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic Zk : ([Ljavax/swing/tree/TreePath;)Lburp/Ze3h;
    //   4: aload_2
    //   5: invokevirtual ZU : (Lburp/Zbfx;)Lburp/Ze3h;
    //   8: getstatic burp/Zgme.ZO : Lburp/Zs6r;
    //   11: aload_2
    //   12: invokevirtual ZO : (Lburp/Zs6r;Lburp/Zbfx;)Lburp/Ze3h;
    //   15: astore #4
    //   17: aload_2
    //   18: invokeinterface Zz : ()Z
    //   23: ifeq -> 27
    //   26: return
    //   27: aload_0
    //   28: aload #4
    //   30: <illegal opcode> run : (Lburp/Zzm_;Lburp/Ze3h;)Ljava/lang/Runnable;
    //   35: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   38: aload_0
    //   39: aload_3
    //   40: aload #4
    //   42: <illegal opcode> run : (Lburp/Zzm_;Ljava/util/concurrent/atomic/AtomicBoolean;Lburp/Ze3h;)Ljava/lang/Runnable;
    //   47: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   50: return
  }
  
  public void Z_(Zz_1 paramZz_1) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.ZD.ZK(paramZz_1);
    Zmse.ZF(this.ZV);
  }
  
  public void Zj(Ze3h paramZe3h) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.ZD.Z_(paramZe3h);
    Zmse.ZF(this.ZV);
    Iterator<Zz_1> iterator = paramZe3h.iterator();
    String str = Zz_1.ZG();
    while (iterator.hasNext()) {
      Zz_1 zz_1 = iterator.next();
      if (zz_1.equals(this.ZC.ZX())) {
        this.ZC.ZW(null);
        if (str == null)
          continue; 
        break;
      } 
      continue;
      if (str == null)
        break; 
    } 
  }
  
  public void Zp(Zz_1 paramZz_1) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.ZD.ZF(paramZz_1);
    Zmse.ZF(this.ZV);
  }
  
  public void ZE() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    try {
      this.ZV.getSelectionModel().setSelectionInterval(0, 0);
      Zi(0);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public void Zj(Zz_1 paramZz_1) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_2
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: getstatic net/portswigger/Zqf.ZF : Lnet/portswigger/Zqf;
    //   10: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   13: aload_1
    //   14: ifnonnull -> 29
    //   17: aload_0
    //   18: getfield ZC : Lburp/Zmrj;
    //   21: aconst_null
    //   22: invokevirtual ZW : (Lburp/Zz_1;)V
    //   25: aload_2
    //   26: ifnonnull -> 76
    //   29: aload_0
    //   30: getfield ZD : Lburp/Zmiw;
    //   33: aload_1
    //   34: invokevirtual Zj : (Ljava/lang/Object;)I
    //   37: istore_3
    //   38: iload_3
    //   39: iconst_m1
    //   40: if_icmpeq -> 76
    //   43: aload_0
    //   44: getfield ZV : Lburp/Zbws;
    //   47: iload_3
    //   48: invokevirtual convertRowIndexToView : (I)I
    //   51: istore_3
    //   52: iload_3
    //   53: iconst_m1
    //   54: if_icmpeq -> 76
    //   57: aload_0
    //   58: getfield ZV : Lburp/Zbws;
    //   61: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   64: iload_3
    //   65: iload_3
    //   66: invokeinterface setSelectionInterval : (II)V
    //   71: aload_0
    //   72: iload_3
    //   73: invokevirtual Zi : (I)V
    //   76: return
  }
  
  protected void Zi(int paramInt) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    try {
      Zz_1 zz_1 = this.ZD.Zs(this.ZV.convertRowIndexToModel(paramInt));
      try {
        if (zz_1 != null)
          this.ZC.ZW(zz_1); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    Ze3h ze3h = ZP();
    return !ze3h.ZF() ? this.Zl.ZJ(paramInt, ze3h, false) : false;
  }
  
  public void ZK(int paramInt1, int paramInt2) {
    Zi(paramInt1);
  }
  
  private Ze3h ZP() {
    return Zq(null);
  }
  
  private Ze3h Zq(Point paramPoint) {
    Ze3h ze3h = new Ze3h(new Zz_1[0]);
    Objects.requireNonNull(ze3h);
    ZC(this.ZV.ZS(paramPoint)).forEach(ze3h::Zj);
    return ze3h;
  }
  
  private List<Zz_1> ZC(int[] paramArrayOfint) {
    return (List<Zz_1>)Arrays.stream(paramArrayOfint).mapToObj(this::Zy).filter(Objects::nonNull).collect(Collectors.toList());
  }
  
  private Zz_1 Zy(int paramInt) {
    if (paramInt < 0 || paramInt >= this.ZD.getRowCount())
      return null; 
    int i = this.ZV.convertRowIndexToModel(paramInt);
    return this.ZD.ZW(i);
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      ZV(paramMouseEvent, paramMouseEvent.getComponent(), paramMouseEvent.getPoint()); 
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      ZV(paramMouseEvent, paramMouseEvent.getComponent(), paramMouseEvent.getPoint()); 
  }
  
  public void ZV(MouseEvent paramMouseEvent, Component paramComponent, Point paramPoint) {
    Ze3h ze3h = Zq(paramPoint);
    this.Zl.ZG().ZZ(ze3h, paramMouseEvent, paramPoint, paramComponent);
  }
  
  public void ZR(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    TableColumnModel tableColumnModel = this.ZV.getColumnModel();
    TableColumn tableColumn = tableColumnModel.getColumn(paramInt2);
    if (a.equals(tableColumn.getIdentifier())) {
      Zm2.Zo(Zze0.TARGET_SITE_MAP_NOTES_TABLE_CELL_CLICKED);
      this.Zu.ZC();
    } 
  }
  
  private void lambda$showNewNodes$3(AtomicBoolean paramAtomicBoolean, Ze3h paramZe3h) {
    this.ZG.setViewportView(this.ZV);
    if (paramAtomicBoolean.get() && paramZe3h.ZF())
      this.ZC.ZW(null); 
  }
  
  private void lambda$showNewNodes$2(Ze3h paramZe3h) {
    this.ZV.clearSelection();
    this.ZD.Zm(paramZe3h);
  }
  
  private void lambda$new$1(Zbws paramZbws, TableModelEvent paramTableModelEvent) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual getType : ()I
    //   4: ifne -> 41
    //   7: aload_2
    //   8: invokevirtual getFirstRow : ()I
    //   11: ifne -> 41
    //   14: aload_2
    //   15: invokevirtual getLastRow : ()I
    //   18: ldc 2147483647
    //   20: if_icmpne -> 41
    //   23: aload_2
    //   24: invokevirtual getColumn : ()I
    //   27: iconst_m1
    //   28: if_icmpne -> 41
    //   31: aload_0
    //   32: aload_1
    //   33: <illegal opcode> run : (Lburp/Zzm_;Lburp/Zbws;)Ljava/lang/Runnable;
    //   38: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   41: return
  }
  
  private void lambda$new$0(Zbws paramZbws) {
    if (paramZbws.getRowCount() > 0 && (paramZbws.getSelectedRows()).length == 0) {
      paramZbws.getSelectionModel().setSelectionInterval(0, 0);
      Zi(0);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #114
    //   2: ldc 'Hw"B'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzm_.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #116
    //   82: goto -> 112
    //   85: bipush #106
    //   87: goto -> 112
    //   90: bipush #36
    //   92: goto -> 112
    //   95: bipush #85
    //   97: goto -> 112
    //   100: bipush #28
    //   102: goto -> 112
    //   105: bipush #28
    //   107: goto -> 112
    //   110: bipush #100
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzm_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */