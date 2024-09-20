package burp;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.dnd.DragGestureRecognizer;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentListener;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

abstract class Zr8o extends JComponent implements LayoutManager, Zlqr, Zewb {
  protected final Zgah ZI;
  
  protected final String Zi;
  
  protected final Zxer Zz;
  
  protected final Zzc2 ZC;
  
  protected final Ztca ZN;
  
  protected final Zrsj Zv;
  
  protected final boolean ZE;
  
  protected final Zg85 Zc;
  
  private final DragGestureRecognizer Ze;
  
  private final DocumentListener ZT;
  
  private final AWTEventListener Zd;
  
  private volatile boolean ZW = true;
  
  private Zlkk Zg;
  
  Zr8o(Zgah paramZgah, String paramString, Zxer paramZxer, Zzc2 paramZzc2, Ztca paramZtca, Zrsj paramZrsj, boolean paramBoolean1, boolean paramBoolean2) {
    this.ZI = paramZgah;
    this.Zi = paramString;
    String[] arrayOfString = Zxer.Zr();
    try {
      this.Zz = paramZxer;
      this.ZC = paramZzc2;
      this.ZN = paramZtca;
      this.Zv = paramZrsj;
      this.ZE = paramBoolean1;
      setLayout(this);
      setFocusable(false);
      if (paramBoolean2)
        Zc(Zlkk.GROUPED_TAB_BAR_DEFAULT_TAB_BACKGROUND); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      this.Zc = new Zg85(paramZgah.Zo());
      this.Zc.setFocusable(false);
      this.Zc.setEditable(false);
      this.Zc.setEnabled(false);
      this.Zc.setHorizontalAlignment(0);
      this.Zc.setOpaque(false);
      this.Zc.setBorder(new EmptyBorder(0, 0, 0, 0));
      setEnabled(true);
      add(this.Zc);
      this.Zc.addMouseListener(new Zmyq(this));
      this.Zc.addActionListener(this::lambda$new$0);
      this.Zc.addKeyListener(new Zsxa(this));
      this.Ze = paramZxer.ZT(this.Zc);
      paramZgah.Zo(this::lambda$new$2);
      this.ZT = new Zg76(this, paramZxer);
      this.Zd = this::lambda$new$3;
      if (Zbqc.Zwu() == null)
        Zxer.Zf(new String[5]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public String getText() {
    return this.Zc.getText();
  }
  
  public void setText(String paramString) {
    try {
      if (!paramString.equals(this.Zc.getText())) {
        this.Zc.setText(paramString);
        ZE();
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.ZW = paramBoolean;
    Zd();
  }
  
  public void Zc(Zlkk paramZlkk) {
    this.Zg = paramZlkk;
    setBackground(paramZlkk.ZS());
  }
  
  public void updateUI() {
    try {
      super.updateUI();
      Zd();
      if (this.Zg != null)
        setBackground(this.Zg.ZS()); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public boolean ZZ() {
    return false;
  }
  
  public void ZX(boolean paramBoolean) {}
  
  private void Zd() {
    try {
      if (this.Zc != null)
        EventQueue.invokeLater(this::lambda$updateEnabledStyle$4); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  protected void ZO() {
    this.Zc.setEnabled(true);
    this.Zc.setEditable(true);
    this.Zc.requestFocus();
    this.Zc.selectAll();
    this.Zc.getDocument().addDocumentListener(this.ZT);
    this.Zz.ZF(this.Ze);
    Toolkit.getDefaultToolkit().addAWTEventListener(this.Zd, 16L);
  }
  
  private void Zn() {
    this.Zc.setEnabled(false);
    this.Zc.setEditable(false);
    this.Zc.getDocument().removeDocumentListener(this.ZT);
    Zd();
    this.Zz.Zd(this.Ze);
    Toolkit.getDefaultToolkit().removeAWTEventListener(this.Zd);
    this.ZN.ZV();
    ZE();
  }
  
  private void ZE() {
    String str = this.Zc.getText();
    if (str.isEmpty()) {
      str = " ";
      this.Zc.setText(str);
    } 
    this.ZC.Zv(this.Zz.indexOfTabComponent(this), str);
  }
  
  protected void Z_(MouseEvent paramMouseEvent, Component paramComponent) {
    Window window = Zt2m.ZF(paramComponent);
    Point point = SwingUtilities.convertPoint(paramComponent, paramMouseEvent.getPoint(), window);
    if (point.y >= 0) {
      Point point1 = SwingUtilities.convertPoint(window, point, (Component)this.Zz);
      this.Zz.dispatchEvent(new MouseEvent(this, paramMouseEvent.getID(), paramMouseEvent.getWhen(), paramMouseEvent.getModifiers(), point1.x, point1.y, paramMouseEvent.getClickCount(), paramMouseEvent.isPopupTrigger(), paramMouseEvent.getButton()));
    } 
  }
  
  public void addLayoutComponent(String paramString, Component paramComponent) {}
  
  public void removeLayoutComponent(Component paramComponent) {}
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    Dimension dimension = this.Zc.getPreferredSize();
    return new Dimension(dimension.width + 1, dimension.height + 1);
  }
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    return preferredLayoutSize(paramContainer);
  }
  
  public void layoutContainer(Container paramContainer) {
    this.Zc.setLocation(0, 1);
    Dimension dimension = this.Zc.getPreferredSize();
    dimension.width++;
    this.Zc.setSize(dimension);
  }
  
  public void Zm(Zr6e paramZr6e) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public Component ZD() {
    return this;
  }
  
  public Component Za() {
    return this.Zc;
  }
  
  private void lambda$updateEnabledStyle$4() {
    try {
      this.Zc.invalidate();
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      this.Zc.Zg(this.ZW ? Zlkk.FOREGROUND : Zlkk.TEXT_FIELD_DISABLED_TEXT_COLOUR);
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    this.Zc.Zi(this.ZW ? Zlkk.FOREGROUND : Zlkk.TEXT_FIELD_DISABLED_TEXT_COLOUR);
  }
  
  private void lambda$new$3(AWTEvent paramAWTEvent) {
    try {
      if (paramAWTEvent.getSource() != this.Zc)
        try {
          if (paramAWTEvent instanceof MouseEvent)
            try {
              if (paramAWTEvent.getID() == 501)
                Zn(); 
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            }  
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  private void lambda$new$2(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zr8o;Ljava/lang/String;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void lambda$new$1(String paramString) {
    this.Zc.setText(paramString);
  }
  
  private void lambda$new$0(ActionEvent paramActionEvent) {
    Zn();
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr8o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */