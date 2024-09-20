package burp;

import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceAdapter;
import java.awt.dnd.DragSourceContext;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.util.Optional;

class Zel4 extends DragSourceAdapter {
  final Zz5z ZG;
  
  Zel4(Zz5z paramZz5z) {}
  
  public void dragEnter(DragSourceDragEvent paramDragSourceDragEvent) {
    paramDragSourceDragEvent.getDragSourceContext().setCursor(DragSource.DefaultMoveDrop);
  }
  
  public void dragExit(DragSourceEvent paramDragSourceEvent) {
    paramDragSourceEvent.getDragSourceContext().setCursor(this.ZG.ZX);
  }
  
  public void dragDropEnd(DragSourceDropEvent paramDragSourceDropEvent) {
    if (!paramDragSourceDropEvent.getDropSuccess())
      Optional.<DragSourceDropEvent>of(paramDragSourceDropEvent).map(DragSourceEvent::getDragSourceContext).map(DragSourceContext::getTransferable).map(Zlfz::Zw).ifPresent(this.ZG.ZZ); 
    Ze1h.ZP();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zel4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */