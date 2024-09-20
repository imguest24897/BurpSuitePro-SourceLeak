package burp;

import com.formdev.flatlaf.util.Animator;
import java.awt.Component;
import java.awt.Window;
import java.awt.image.VolatileImage;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;
import javax.swing.RootPaneContainer;

class Zri5 {
  private static final Map<JLayeredPane, JComponent> ZG = new WeakHashMap<>();
  
  private static final Map<JLayeredPane, JComponent> ZN = new WeakHashMap<>();
  
  private static Animator ZM;
  
  private static float ZD;
  
  private static boolean Z_;
  
  static void ZR() {
    if (ZM != null)
      ZM.stop(); 
    ZD = 1.0F;
    ZV(true, ZG);
  }
  
  private static void ZV(boolean paramBoolean, Map<JLayeredPane, JComponent> paramMap) {
    Z_ = true;
    Window[] arrayOfWindow1 = Window.getWindows();
    Window[] arrayOfWindow2 = arrayOfWindow1;
    Zbqc[] arrayOfZbqc = Zlkk.Zw();
    int i = arrayOfWindow2.length;
    byte b = 0;
    while (b < i) {
      Window window = arrayOfWindow2[b];
      if (window instanceof RootPaneContainer && (window.isShowing() || arrayOfZbqc == null)) {
        VolatileImage volatileImage = window.createVolatileImage(window.getWidth(), window.getHeight());
        if (volatileImage != null || arrayOfZbqc == null) {
          JLayeredPane jLayeredPane = ((RootPaneContainer)window).getLayeredPane();
          jLayeredPane.paint(volatileImage.getGraphics());
          Zzyk zzyk = new Zzyk(volatileImage, paramBoolean);
          if (!paramBoolean)
            zzyk.setOpaque(true); 
          zzyk.setSize(jLayeredPane.getSize());
          jLayeredPane.add(zzyk, Integer.valueOf(JLayeredPane.DRAG_LAYER.intValue() + (paramBoolean ? 2 : 1)));
          paramMap.put(jLayeredPane, zzyk);
        } 
      } 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    Z_ = false;
  }
  
  static void Zz() {
    if (ZG.isEmpty())
      return; 
    ZV(false, ZN);
    ZM = new Animator(160, Zri5::lambda$hideSnapshotWithAnimation$0, Zri5::lambda$hideSnapshotWithAnimation$1);
    ZM.setResolution(40);
    ZM.start();
  }
  
  private static void ZI() {
    Zr(ZG);
    Zr(ZN);
  }
  
  private static void Zr(Map<JLayeredPane, JComponent> paramMap) {
    Iterator<Map.Entry> iterator = paramMap.entrySet().iterator();
    Zbqc[] arrayOfZbqc = Zlkk.Zw();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      ((JLayeredPane)entry.getKey()).remove((Component)entry.getValue());
      ((JLayeredPane)entry.getKey()).repaint();
      if (arrayOfZbqc == null)
        break; 
    } 
    paramMap.clear();
  }
  
  private static void lambda$hideSnapshotWithAnimation$1() {
    ZI();
    ZM = null;
  }
  
  private static void lambda$hideSnapshotWithAnimation$0(float paramFloat) {
    Zbqc[] arrayOfZbqc = Zlkk.Zw();
    if (paramFloat < 0.1D || paramFloat > 0.9D)
      return; 
    ZD = 1.0F - paramFloat;
    for (Map.Entry<JLayeredPane, JComponent> entry : ZG.entrySet()) {
      if (((JLayeredPane)entry.getKey()).isShowing())
        ((JComponent)entry.getValue()).repaint(); 
      if (arrayOfZbqc == null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zri5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */