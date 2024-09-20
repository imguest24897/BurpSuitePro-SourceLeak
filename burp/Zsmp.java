package burp;

import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;

class Zsmp implements DropTargetListener {
  final Ze1h ZU;
  
  private Zsmp(Ze1h paramZe1h) {}
  
  public void dragEnter(DropTargetDragEvent paramDropTargetDragEvent) {
    this.ZU.ZT.set(true);
    dragOver(paramDropTargetDragEvent);
  }
  
  public void dragOver(DropTargetDragEvent paramDropTargetDragEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZU : Lburp/Ze1h;
    //   4: getfield ZJ : Ljava/util/List;
    //   7: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   12: aload_1
    //   13: <illegal opcode> test : (Ljava/awt/dnd/DropTargetDragEvent;)Ljava/util/function/Predicate;
    //   18: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   23: invokeinterface findFirst : ()Ljava/util/Optional;
    //   28: aload_0
    //   29: aload_1
    //   30: <illegal opcode> accept : (Lburp/Zsmp;Ljava/awt/dnd/DropTargetDragEvent;)Ljava/util/function/Consumer;
    //   35: aload_0
    //   36: aload_1
    //   37: <illegal opcode> run : (Lburp/Zsmp;Ljava/awt/dnd/DropTargetDragEvent;)Ljava/lang/Runnable;
    //   42: invokevirtual ifPresentOrElse : (Ljava/util/function/Consumer;Ljava/lang/Runnable;)V
    //   45: aload_0
    //   46: getfield ZU : Lburp/Ze1h;
    //   49: invokevirtual repaint : ()V
    //   52: return
  }
  
  public void dropActionChanged(DropTargetDragEvent paramDropTargetDragEvent) {
    dragOver(paramDropTargetDragEvent);
  }
  
  public void dragExit(DropTargetEvent paramDropTargetEvent) {
    this.ZU.Zv.set(Ze1h.ZF);
    this.ZU.ZT.set(false);
    this.ZU.repaint();
  }
  
  public void drop(DropTargetDropEvent paramDropTargetDropEvent) {
    dragExit(paramDropTargetDropEvent);
    this.ZU.ZJ.stream().map(Zgt9::Zbh).filter(paramDropTargetDropEvent::lambda$drop$3).findFirst().ifPresentOrElse(paramDropTargetDropEvent::lambda$drop$4, paramDropTargetDropEvent::lambda$drop$5);
  }
  
  private static void lambda$drop$5(DropTargetDropEvent paramDropTargetDropEvent) {
    paramDropTargetDropEvent.dropComplete(false);
  }
  
  private static void lambda$drop$4(DropTargetDropEvent paramDropTargetDropEvent, Zx0i paramZx0i) {
    paramDropTargetDropEvent.dropComplete(paramZx0i.ZV(paramDropTargetDropEvent));
  }
  
  private static boolean lambda$drop$3(DropTargetDropEvent paramDropTargetDropEvent, Zx0i paramZx0i) {
    return paramZx0i.ZQ(new DropTargetDragEvent(paramDropTargetDropEvent.getDropTargetContext(), paramDropTargetDropEvent.getLocation(), paramDropTargetDropEvent.getDropAction(), paramDropTargetDropEvent.getSourceActions()));
  }
  
  private void lambda$dragOver$2(DropTargetDragEvent paramDropTargetDragEvent) {
    this.ZU.Zv.set(Ze1h.ZF);
    paramDropTargetDragEvent.rejectDrag();
  }
  
  private void lambda$dragOver$1(DropTargetDragEvent paramDropTargetDragEvent, Zgt9 paramZgt9) {
    this.ZU.Zv.set(paramZgt9.Zbq());
    paramDropTargetDragEvent.acceptDrag(paramDropTargetDragEvent.getDropAction());
  }
  
  private static boolean lambda$dragOver$0(DropTargetDragEvent paramDropTargetDragEvent, Zgt9 paramZgt9) {
    return paramZgt9.Zbh().ZQ(paramDropTargetDragEvent);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsmp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */