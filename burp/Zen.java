package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import net.portswigger.Zm2;

class Zen implements Zky2 {
  private final Zsfa ZA;
  
  private final Zbws ZR;
  
  private final Runnable ZG;
  
  private final Zmio ZU;
  
  final Zb5o Zy;
  
  private Zen(Zb5o paramZb5o, Zsfa paramZsfa, Zbws paramZbws, Zmio paramZmio, Runnable paramRunnable) {
    this.ZA = paramZsfa;
    this.ZR = paramZbws;
    this.ZU = paramZmio;
    this.ZG = paramRunnable;
  }
  
  public void ZR(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    Zm2.Zo(Zze0.ORGANIZER_NOTES_TABLE_CELL_CLICKED);
    this.ZG.run();
  }
  
  public void ZV(MouseEvent paramMouseEvent, Component paramComponent, Point paramPoint) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zy : Lburp/Zb5o;
    //   4: aload_3
    //   5: invokevirtual ZH : (Ljava/awt/Point;)Ljava/util/List;
    //   8: astore #4
    //   10: aload #4
    //   12: invokeinterface isEmpty : ()Z
    //   17: ifne -> 42
    //   20: aload_0
    //   21: getfield ZA : Lburp/Zsfa;
    //   24: aload #4
    //   26: aload_0
    //   27: getfield ZR : Lburp/Zbws;
    //   30: aload_3
    //   31: aload_1
    //   32: aload_0
    //   33: aload_3
    //   34: <illegal opcode> run : (Lburp/Zen;Ljava/awt/Point;)Ljava/lang/Runnable;
    //   39: invokevirtual Zm : (Ljava/util/List;Ljava/awt/Component;Ljava/awt/Point;Ljava/awt/event/InputEvent;Ljava/lang/Runnable;)V
    //   42: return
  }
  
  private void ZI(Point paramPoint) {
    Zm2.Zi(Zv8r.ORGANIZER_NOTES_ADDED_VIA_CONTEXT_MENU, 1L);
    int i = this.ZR.rowAtPoint(paramPoint);
    if (i != -1) {
      Zj(i);
      this.ZG.run();
    } 
  }
  
  private void Zj(int paramInt) {
    this.ZR.setRowSelectionInterval(paramInt, paramInt);
    Zzme zzme = this.ZU.ZW(this.ZR.convertRowIndexToModel(paramInt));
    this.Zy.Zn.accept(zzme);
  }
  
  private void lambda$popupTriggered$0(Point paramPoint) {
    ZI(paramPoint);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zen.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */