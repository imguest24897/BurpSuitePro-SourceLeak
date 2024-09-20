package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class Zmut extends Zmuc<Zb2e> {
  private final Integer Zs;
  
  private final List<Zb4f> Zk;
  
  private Zzbt ZF;
  
  public Zmut(ObservableList<Zb2e> paramObservableList, Zzpo paramZzpo) {
    super(paramZzpo.Zw(), paramObservableList);
    this.Zs = paramZzpo.Zx();
    this.Zk = new ArrayList<>();
    paramObservableList.addListener(this::lambda$new$1);
  }
  
  public void Zg(Collection<Zrdb> paramCollection) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 13
    //   4: aload_1
    //   5: invokeinterface isEmpty : ()Z
    //   10: ifeq -> 14
    //   13: return
    //   14: aload_1
    //   15: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   20: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   25: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   30: invokestatic toSet : ()Ljava/util/stream/Collector;
    //   33: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   38: checkcast java/util/Set
    //   41: astore_2
    //   42: aload_0
    //   43: aload_2
    //   44: <illegal opcode> run : (Lburp/Zmut;Ljava/util/Set;)Ljava/lang/Runnable;
    //   49: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   52: aload_0
    //   53: invokevirtual fireTableDataChanged : ()V
    //   56: return
  }
  
  public void Zp(Zzbt paramZzbt) {
    this.ZF = paramZzbt;
    Zc();
  }
  
  public Zzbt ZS() {
    return this.ZF;
  }
  
  public int getRowCount() {
    return (this.Zs == null) ? super.getRowCount() : Math.min(super.getRowCount(), this.Zs.intValue());
  }
  
  public void Zc() {
    Zmt4<Zb2e> zmt4 = new Zmt4(this::ZE);
    ZI(zmt4);
  }
  
  boolean ZE(Zb2e paramZb2e) {
    return (this.ZF == null || this.ZF.Zv(paramZb2e));
  }
  
  public Zb2e ZN(int paramInt) {
    return ZW(paramInt);
  }
  
  public void Zo(Zb4f paramZb4f) {
    this.Zk.add(paramZb4f);
  }
  
  private void lambda$issuesUpdated$3(Set paramSet) {
    // Byte code:
    //   0: iconst_0
    //   1: aload_0
    //   2: invokevirtual getRowCount : ()I
    //   5: invokestatic range : (II)Ljava/util/stream/IntStream;
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> test : (Lburp/Zmut;Ljava/util/Set;)Ljava/util/function/IntPredicate;
    //   15: invokeinterface filter : (Ljava/util/function/IntPredicate;)Ljava/util/stream/IntStream;
    //   20: invokeinterface toArray : ()[I
    //   25: astore_2
    //   26: aload_2
    //   27: arraylength
    //   28: ifle -> 44
    //   31: aload_0
    //   32: aload_2
    //   33: iconst_0
    //   34: iaload
    //   35: aload_2
    //   36: aload_2
    //   37: arraylength
    //   38: iconst_1
    //   39: isub
    //   40: iaload
    //   41: invokevirtual fireTableRowsUpdated : (II)V
    //   44: return
  }
  
  private boolean lambda$issuesUpdated$2(Set paramSet, int paramInt) {
    return paramSet.contains(ZW(paramInt).ZBf());
  }
  
  private void lambda$new$1(ListChangeListener.Change paramChange) {
    String[] arrayOfString = Zg0s.ZW();
    while (paramChange.next()) {
      if (paramChange.wasAdded()) {
        this.Zk.forEach(paramChange::lambda$new$0);
        if (arrayOfString != null)
          break; 
      } 
    } 
  }
  
  private static void lambda$new$0(ListChangeListener.Change paramChange, Zb4f paramZb4f) {
    paramZb4f.ZX(paramChange.getAddedSubList());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmut.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */