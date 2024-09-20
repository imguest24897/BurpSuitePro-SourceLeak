package burp;

import java.util.Objects;
import java.util.function.BooleanSupplier;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javax.swing.event.TableModelEvent;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zmu5 extends Zmuc<Zto7> implements Zs97<Zto7> {
  private final ObservableList<Zto7> ZN;
  
  private final Ztsb<Zto7> Zf;
  
  private final Zrw6<Zto7> ZI;
  
  private Zxtf ZR;
  
  private static int ZE;
  
  Zmu5(Zl1k paramZl1k, Zbc paramZbc, ObservableList<Zto7> paramObservableList, Zg2g paramZg2g, Zqg paramZqg, Zx47 paramZx47, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: aload #4
    //   3: aload_3
    //   4: lload #7
    //   6: invokespecial <init> : (Lburp/Zmjx;Ljavafx/collections/ObservableList;J)V
    //   9: aload_0
    //   10: aload_3
    //   11: putfield ZN : Ljavafx/collections/ObservableList;
    //   14: aload_0
    //   15: new burp/Zlk7
    //   18: dup
    //   19: aload #5
    //   21: aload #6
    //   23: aload_0
    //   24: <illegal opcode> ZX : (Lburp/Zmu5;)Lburp/Zri2;
    //   29: aload_0
    //   30: <illegal opcode> getAsInt : (Lburp/Zmu5;)Ljava/util/function/IntSupplier;
    //   35: aload_0
    //   36: getfield Z_ : Lburp/Zxr3;
    //   39: invokespecial <init> : (Lburp/Zxlp;Lburp/Zkoh;Lburp/Zri2;Ljava/util/function/IntSupplier;Lburp/Zxr3;)V
    //   42: putfield Zf : Lburp/Ztsb;
    //   45: aload_0
    //   46: new burp/Zrw6
    //   49: dup
    //   50: aload #4
    //   52: aload_0
    //   53: <illegal opcode> test : (Lburp/Zmu5;)Ljava/util/function/IntPredicate;
    //   58: invokespecial <init> : (Lburp/Zmjx;Ljava/util/function/IntPredicate;)V
    //   61: putfield ZI : Lburp/Zrw6;
    //   64: aload_0
    //   65: <illegal opcode> ZT : ()Lburp/Zxtf;
    //   70: putfield ZR : Lburp/Zxtf;
    //   73: aload_3
    //   74: aload_0
    //   75: aload_3
    //   76: <illegal opcode> onChanged : (Lburp/Zmu5;Ljavafx/collections/ObservableList;)Ljavafx/collections/ListChangeListener;
    //   81: invokeinterface addListener : (Ljavafx/collections/ListChangeListener;)V
    //   86: new burp/Zeps
    //   89: dup
    //   90: aload_0
    //   91: invokespecial <init> : (Lburp/Zmu5;)V
    //   94: astore #9
    //   96: aload_2
    //   97: new burp/Zb3_
    //   100: dup
    //   101: aload_0
    //   102: aload_3
    //   103: invokespecial <init> : (Lburp/Zmu5;Ljavafx/collections/ObservableList;)V
    //   106: invokevirtual ZN : (Lburp/Zluz;)V
    //   109: aload_1
    //   110: aload #9
    //   112: invokeinterface Zw : (Lburp/Zlkw;)V
    //   117: aload_1
    //   118: invokeinterface ZQ : ()V
    //   123: return
  }
  
  public Zr6p<Zto7> ZZ(int paramInt) {
    return this.ZI.ZK(paramInt);
  }
  
  public void ZR(Zmfp paramZmfp) {
    this.ZI.Zz(this.Zf.ZN(paramZmfp));
  }
  
  public void ZI(int paramInt) {
    this.ZI.Zu(paramInt);
  }
  
  public void Zh(int paramInt, Zmfp paramZmfp) {
    this.ZI.Zv(paramInt, this.Zf.ZN(paramZmfp));
  }
  
  void ZM(Zrz2 paramZrz2) {
    addTableModelListener(paramZrz2::lambda$setRequestResponseViewerBridge$2);
  }
  
  void Zd(Zxtf paramZxtf) {
    this.ZR = paramZxtf;
  }
  
  void ZE(Zmdn paramZmdn, BooleanSupplier paramBooleanSupplier, Runnable paramRunnable) {
    if (paramZmdn != null)
      try {
        Objects.requireNonNull(paramZmdn);
        Zmtp zmtp = new Zmtp(this, paramZmdn::Zt, paramBooleanSupplier);
        Zgxy.ZH(zmtp, Zv8r.LOGGER_EDITED_VIEW_FILTER_TIMER);
        Zgxt.Zu(zmtp, paramRunnable);
        ZI(zmtp);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      }  
  }
  
  public void Zx(Zbws paramZbws) {
    super.Zx(paramZbws);
  }
  
  private static void lambda$setRequestResponseViewerBridge$2(Zrz2 paramZrz2, TableModelEvent paramTableModelEvent) {
    if (paramTableModelEvent.getType() == -1)
      paramZrz2.Zw(); 
  }
  
  private void lambda$new$1(ObservableList paramObservableList, ListChangeListener.Change paramChange) {
    int i = Z_();
    while (paramChange.next()) {
      if (paramChange.wasAdded() && paramChange.getAddedSize() == paramObservableList.size()) {
        this.ZR.ZT(false);
        if (i != 0)
          continue; 
        continue;
      } 
      continue;
      if (paramChange.wasRemoved() && paramObservableList.isEmpty()) {
        this.ZR.ZT(true);
        if (i != 0)
          break; 
      } 
    } 
  }
  
  private static void lambda$new$0(boolean paramBoolean) {}
  
  public static void ZD(int paramInt) {
    ZE = paramInt;
  }
  
  public static int Z_() {
    return ZE;
  }
  
  public static int Zt() {
    int i = Z_();
    return (i == 0) ? 37 : 0;
  }
  
  static {
    if (Z_() != 0)
      ZD(8); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmu5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */