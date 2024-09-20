package burp;

import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragGestureRecognizer;
import java.awt.dnd.DragSource;
import java.awt.dnd.InvalidDnDOperationException;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.Objects;
import java.util.TooManyListenersException;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zz5z {
  private final Zxer Zf;
  
  private final Zrsj Zi;
  
  private final Zlyt Zk;
  
  private final Zz9w Z_;
  
  private final boolean Zr;
  
  private final Zzo9 ZE;
  
  private final Zvfl ZU;
  
  private final Consumer<Zlfz> ZZ;
  
  private final Cursor ZX;
  
  private DragGestureListener Zj;
  
  Zz5z(Zxer paramZxer, Zrsj paramZrsj, Zz9w paramZz9w, Zlyt paramZlyt, boolean paramBoolean, Consumer<Zlfz> paramConsumer, Cursor paramCursor) {
    this.Zf = paramZxer;
    this.Zi = paramZrsj;
    this.Zk = paramZlyt;
    this.Z_ = paramZz9w;
    this.ZE = new Zzo9((JTabbedPane)paramZxer);
    this.ZU = new Zvfl((JTabbedPane)paramZxer);
    this.Zr = paramBoolean;
    this.ZZ = paramConsumer;
    this.ZX = paramCursor;
    paramZxer.addChangeListener(paramZxer::lambda$new$0);
    Zt(paramZxer);
  }
  
  private static void Zt(Zxer paramZxer) {
    Objects.requireNonNull(paramZxer);
    IntStream.range(0, paramZxer.getTabCount()).mapToObj(paramZxer::getTabComponentAt).filter(Objects::nonNull).forEach(Zz5z::Zq);
  }
  
  private static void Zq(Component paramComponent) {
    if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      Arrays.<Component>stream(container.getComponents()).forEach(Zz5z::Zq);
    } 
    paramComponent.setDropTarget(null);
  }
  
  void ZR() {
    ZB();
    if (!Zb12.ZG()) {
      Zdq zdq = new Zdq(this, this.Zk, this.Z_);
      Objects.requireNonNull(this.ZU);
      Zgt9 zgt9 = new Zgt9(zdq, this.ZU::paint);
      Ze1h.ZA(zgt9, (Component)this.Zf);
      ZA((Component)this.Zf);
    } 
  }
  
  DragGestureRecognizer ZA(Component paramComponent) {
    try {
      if (!Zb12.ZG())
        return (new DragSource()).createDefaultDragGestureRecognizer(paramComponent, 3, this.Zj); 
    } catch (InvalidDnDOperationException invalidDnDOperationException) {
      throw a(null);
    } 
    return null;
  }
  
  void ZX(DragGestureRecognizer paramDragGestureRecognizer) {
    try {
      paramDragGestureRecognizer.addDragGestureListener(this.Zj);
    } catch (TooManyListenersException tooManyListenersException) {
      Zah.Zl(tooManyListenersException, Zk_.UNEXPECTED);
    } 
  }
  
  void ZY(DragGestureRecognizer paramDragGestureRecognizer) {
    paramDragGestureRecognizer.removeDragGestureListener(this.Zj);
  }
  
  private void ZB() {
    this.Zj = this::lambda$initialiseDragGestureListener$1;
  }
  
  private void lambda$initialiseDragGestureListener$1(DragGestureEvent paramDragGestureEvent) {
    try {
      if (!this.Zr)
        try {
          if (this.Zf.getTabCount() <= 1)
            return; 
        } catch (InvalidDnDOperationException invalidDnDOperationException) {
          throw a(null);
        }  
    } catch (InvalidDnDOperationException invalidDnDOperationException) {
      throw a(null);
    } 
    Point point = SwingUtilities.convertPoint(paramDragGestureEvent.getComponent(), paramDragGestureEvent.getDragOrigin(), (Component)this.Zf);
    int i = this.Zf.indexAtLocation(point.x, point.y);
    try {
      if (i >= 0)
        try {
          if (this.Zf.isEnabledAt(i)) {
            BufferedImage bufferedImage1 = Zbog.ZT(new Zga3[] { new Zga3(new Zs3f((Component)this.Zf, this.Zf.getBoundsAt(i)), this.Zf.getLocation()), new Zga3(this.Zf.getComponentAt(i)) });
            BufferedImage bufferedImage2 = Zejn.Zw(bufferedImage1);
            Point point1 = new Point(this.Zf.getBoundsAt(i).getLocation());
            try {
              point1.x -= point.x;
              point1.y -= point.y;
              if (Zkt6.ZN()) {
                point1.x = -point1.x;
                point1.y = -point1.y;
              } 
            } catch (InvalidDnDOperationException invalidDnDOperationException) {
              throw a(null);
            } 
            Zlfz zlfz = new Zlfz((JTabbedPane)this.Zf, point);
            Ze1h.ZR(bufferedImage2, point1);
            Point point2 = MouseInfo.getPointerInfo().getLocation();
            try {
              SwingUtilities.convertPointFromScreen(point2, (Component)this.Zf);
            } catch (InvalidDnDOperationException invalidDnDOperationException) {
              throw a(null);
            } 
            boolean bool = (this.Zk.ZW(point2) != -1) ? true : false;
            try {
            
            } catch (InvalidDnDOperationException invalidDnDOperationException) {
              throw a(null);
            } 
            Cursor cursor = bool ? this.ZX : DragSource.DefaultMoveDrop;
            try {
              paramDragGestureEvent.startDrag(cursor, new BufferedImage(1, 1, 2), new Point(0, 0), new Zstv(zlfz), new Zel4(this));
            } catch (InvalidDnDOperationException invalidDnDOperationException) {
              Zah.Zl(invalidDnDOperationException, Zk_.UNEXPECTED);
              Ze1h.ZP();
            } 
            return;
          } 
          return;
        } catch (InvalidDnDOperationException invalidDnDOperationException) {
          throw a(null);
        }  
    } catch (InvalidDnDOperationException invalidDnDOperationException) {
      throw a(null);
    } 
  }
  
  private static void lambda$new$0(Zxer paramZxer, ChangeEvent paramChangeEvent) {
    Zt(paramZxer);
  }
  
  private static InvalidDnDOperationException a(InvalidDnDOperationException paramInvalidDnDOperationException) {
    return paramInvalidDnDOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz5z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */