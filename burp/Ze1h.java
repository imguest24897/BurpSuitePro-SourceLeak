package burp;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Window;
import java.awt.dnd.DropTarget;
import java.awt.event.HierarchyEvent;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.swing.JComponent;
import javax.swing.JRootPane;
import javax.swing.RootPaneContainer;
import javax.swing.SwingUtilities;

public class Ze1h extends JComponent {
  private static final Consumer<Graphics> ZF = Ze1h::lambda$static$0;
  
  private final List<Zgt9> ZJ = new CopyOnWriteArrayList<>();
  
  private final AtomicReference<Consumer<Graphics>> Zv = new AtomicReference<>(ZF);
  
  private final AtomicBoolean ZT = new AtomicBoolean();
  
  private Image Zl;
  
  private Point ZO;
  
  public Ze1h() {
    new DropTarget(this, 3, new Zsmp(this));
  }
  
  public void paint(Graphics paramGraphics) {
    super.paint(paramGraphics);
    ((Consumer<Graphics>)this.Zv.get()).accept(paramGraphics);
    if (this.Zl != null && this.ZT.get()) {
      Point point = new Point(MouseInfo.getPointerInfo().getLocation());
      if (this.ZO != null) {
        Point point1 = new Point(this.ZO);
        SwingUtilities.convertPointFromScreen(point1, this);
        point.x += point1.x;
        point.y += point1.y;
      } 
      paramGraphics.drawImage(this.Zl, point.x, point.y, null);
    } 
  }
  
  public void ZK(Zgt9 paramZgt9) {
    this.ZJ.add(paramZgt9);
  }
  
  public void ZD(Zgt9 paramZgt9) {
    this.ZJ.remove(paramZgt9);
  }
  
  public static void Zu(Zgt9 paramZgt9, Container paramContainer) {
    Zk(paramContainer).ifPresent(paramZgt9::lambda$removeDropReceiverForContainer$1);
  }
  
  public static void ZA(Zgt9 paramZgt9, Component paramComponent) {
    paramComponent.addHierarchyListener(paramZgt9::lambda$addDropReceiverForComponent$2);
    ZN(paramZgt9, paramComponent.getParent());
  }
  
  private static void ZN(Zgt9 paramZgt9, Container paramContainer) {
    if (paramContainer != null)
      Zk(paramContainer).ifPresent(paramZgt9::lambda$addDropReceiverForContainer$3); 
  }
  
  private static Optional<Ze1h> Zk(Container paramContainer) {
    return Optional.<Container>ofNullable(paramContainer).filter(Ze1h::lambda$dropTargetGlassPane$4).map(Ze1h::lambda$dropTargetGlassPane$5).map(JComponent::getRootPane).stream().peek(Ze1h::lambda$dropTargetGlassPane$6).map(JRootPane::getGlassPane).map(Ze1h::lambda$dropTargetGlassPane$7).findFirst();
  }
  
  public static void ZR(BufferedImage paramBufferedImage, Point paramPoint) {
    // Byte code:
    //   0: invokestatic Zc : ()Ljava/util/stream/Stream;
    //   3: aload_0
    //   4: aload_1
    //   5: <illegal opcode> accept : (Ljava/awt/image/BufferedImage;Ljava/awt/Point;)Ljava/util/function/Consumer;
    //   10: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   15: return
  }
  
  public static void ZP() {
    Zc().forEach(Ze1h::lambda$hideDropTargetGlassPane$9);
  }
  
  private static Stream<Ze1h> Zc() {
    return Arrays.<Window>stream(Window.getWindows()).filter(Ze1h::lambda$dropTargetGlassPanes$10).map(Ze1h::lambda$dropTargetGlassPanes$11).map(RootPaneContainer::getRootPane).filter(Objects::nonNull).map(JRootPane::getGlassPane).filter(Ze1h::lambda$dropTargetGlassPanes$12).map(Ze1h::lambda$dropTargetGlassPanes$13);
  }
  
  private static Ze1h lambda$dropTargetGlassPanes$13(Component paramComponent) {
    return (Ze1h)paramComponent;
  }
  
  private static boolean lambda$dropTargetGlassPanes$12(Component paramComponent) {
    return paramComponent instanceof Ze1h;
  }
  
  private static RootPaneContainer lambda$dropTargetGlassPanes$11(Window paramWindow) {
    return (RootPaneContainer)paramWindow;
  }
  
  private static boolean lambda$dropTargetGlassPanes$10(Window paramWindow) {
    return paramWindow instanceof RootPaneContainer;
  }
  
  private static void lambda$hideDropTargetGlassPane$9(Ze1h paramZe1h) {
    paramZe1h.setVisible(false);
    paramZe1h.Zl = null;
    paramZe1h.ZO = null;
  }
  
  private static void lambda$showDropTargetGlassPane$8(BufferedImage paramBufferedImage, Point paramPoint, Ze1h paramZe1h) {
    paramZe1h.Zl = paramBufferedImage;
    paramZe1h.ZO = paramPoint;
    paramZe1h.setVisible(true);
  }
  
  private static Ze1h lambda$dropTargetGlassPane$7(Component paramComponent) {
    return (Ze1h)paramComponent;
  }
  
  private static void lambda$dropTargetGlassPane$6(JRootPane paramJRootPane) {
    if (!(paramJRootPane.getGlassPane() instanceof Ze1h))
      paramJRootPane.setGlassPane(new Ze1h()); 
  }
  
  private static JComponent lambda$dropTargetGlassPane$5(Container paramContainer) {
    return (JComponent)paramContainer;
  }
  
  private static boolean lambda$dropTargetGlassPane$4(Container paramContainer) {
    return paramContainer instanceof JComponent;
  }
  
  private static void lambda$addDropReceiverForContainer$3(Zgt9 paramZgt9, Ze1h paramZe1h) {
    paramZe1h.ZK(paramZgt9);
  }
  
  private static void lambda$addDropReceiverForComponent$2(Zgt9 paramZgt9, HierarchyEvent paramHierarchyEvent) {
    if ((paramHierarchyEvent.getChangeFlags() & 0x1L) != 0L) {
      Zu(paramZgt9, paramHierarchyEvent.getChangedParent());
      ZN(paramZgt9, paramHierarchyEvent.getComponent().getParent());
    } 
  }
  
  private static void lambda$removeDropReceiverForContainer$1(Zgt9 paramZgt9, Ze1h paramZe1h) {
    paramZe1h.ZD(paramZgt9);
  }
  
  private static void lambda$static$0(Graphics paramGraphics) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze1h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */