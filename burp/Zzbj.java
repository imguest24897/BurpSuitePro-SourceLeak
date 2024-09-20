package burp;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.util.Map;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.MouseInputListener;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.View;

public class Zzbj extends Zzb8 implements MouseInputListener {
  private int ZX;
  
  private int ZW = -1;
  
  private int ZT;
  
  private float ZZ;
  
  private int Zg;
  
  private float ZK;
  
  private Map<?, ?> Zb;
  
  private int Z_;
  
  private Zmsj ZQ;
  
  private Rectangle Zk;
  
  private int Zo;
  
  public Zzbj(Zmgw paramZmgw) {
    super(paramZmgw);
    setForeground(Color.GRAY);
  }
  
  public void addNotify() {
    super.addNotify();
    if (this.Zx != null)
      this.ZQ.Zu(this.Zx); 
    Zo();
    Zs();
  }
  
  private int ZA() {
    int i = 0;
    if (this.Zx != null)
      i = this.Zx.getLineCount() + ZZ() - 1; 
    return i;
  }
  
  public int ZZ() {
    return this.Zo;
  }
  
  public Dimension getPreferredSize() {
    boolean bool = (this.Zx != null) ? this.Zx.getHeight() : true;
    return new Dimension(this.Zg, bool);
  }
  
  void Z_(DocumentEvent paramDocumentEvent) {
    int i = ZA();
    if (i != this.ZT) {
      if (i / 10 != this.ZT / 10)
        Zo(); 
      this.ZT = i;
      repaint();
    } 
  }
  
  protected void Zc() {
    super.Zc();
    this.ZX = 0;
    Zl(1);
    this.Zk = new Rectangle();
    addMouseListener(this);
    addMouseMotionListener(this);
    this.Zb = Zk80.Zw();
  }
  
  void Zp() {
    Zs();
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {}
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    if (this.Z_ > -1) {
      int i = this.Zx.viewToModel2D(new Point(0, paramMouseEvent.getY()));
      if (i >= 0) {
        this.Zx.setCaretPosition(this.Z_);
        this.Zx.moveCaretPosition(i);
      } 
    } 
  }
  
  public void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
  
  public void mouseMoved(MouseEvent paramMouseEvent) {}
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    int i = Zz85.Zm();
    if (this.Zx == null)
      return; 
    if (paramMouseEvent.getButton() == 1) {
      int j = this.Zx.viewToModel2D(new Point(0, paramMouseEvent.getY()));
      if (j >= 0)
        this.Zx.setCaretPosition(j); 
      this.Z_ = j;
      if (i != 0) {
        this.Z_ = -1;
        return;
      } 
      return;
    } 
    this.Z_ = -1;
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {}
  
  protected void paintComponent(Graphics paramGraphics) {
    if (this.Zx == null)
      return; 
    this.Zk = paramGraphics.getClipBounds(this.Zk);
    if (this.Zk == null)
      this.Zk = getVisibleRect(); 
    if (this.Zk == null)
      return; 
    Color color = getBackground();
    if (ZI() != null)
      color = ZI().getBackground(); 
    paramGraphics.setColor(color);
    paramGraphics.fillRect(0, this.Zk.y, this.Zg, this.Zk.height);
    paramGraphics.setFont(getFont());
    if (this.Zb != null)
      ((Graphics2D)paramGraphics).addRenderingHints(this.Zb); 
    Zy(paramGraphics, this.Zk);
  }
  
  private void Zy(Graphics paramGraphics, Rectangle paramRectangle) {
    int j = getWidth();
    Ztf6 ztf6 = (Ztf6)this.Zx.getUI();
    View view = ztf6.getRootView(this.Zx).getView(0);
    Document document = this.Zx.getDocument();
    int i = Zz85.ZT();
    Element element = document.getDefaultRootElement();
    int k = element.getElementCount();
    int m = this.Zx.viewToModel2D(new Point(paramRectangle.x, paramRectangle.y));
    int n = element.getElementIndex(m);
    Rectangle rectangle1 = ztf6.getVisibleEditorRect();
    Rectangle rectangle2 = ZJ(view, n, rectangle1);
    int i1 = rectangle2.y;
    Zxam zxam = null;
    Zmgw zmgw = this.Zx;
    if (zmgw instanceof Zmgn) {
      Zmgn zmgn = (Zmgn)zmgw;
      zxam = zmgn.Zm();
    } 
    int i2 = j - 4;
    int i3 = paramRectangle.y + paramRectangle.height;
    FontMetrics fontMetrics = paramGraphics.getFontMetrics();
    paramGraphics.setColor(getForeground());
    Graphics2D graphics2D = (Graphics2D)paramGraphics;
    while (i1 < i3) {
      rectangle2 = ZJ(view, n, rectangle1);
      int i4 = n + 1 + ZZ() - 1;
      String str = Integer.toString(i4);
      int i5 = fontMetrics.stringWidth(str);
      graphics2D.drawString(str, (i2 - i5), i1 + this.ZK);
      i1 += rectangle2.height;
      n = Zb(zxam, n) + 1;
      if (n >= k || i == 0)
        break; 
    } 
  }
  
  private int Zb(Zxam paramZxam, int paramInt) {
    int i = Zz85.ZT();
    Zxyv zxyv = (paramZxam == null) ? null : paramZxam.ZY(paramInt);
    if (zxyv == null)
      return paramInt; 
    while (zxyv != null && zxyv.ZF() && zxyv.Z_() != 0) {
      paramInt += zxyv.Z_();
      zxyv = paramZxam.ZY(paramInt);
      if (i == 0)
        break; 
    } 
    return paramInt;
  }
  
  public void removeNotify() {
    super.removeNotify();
    if (this.Zx != null)
      this.ZQ.ZG(this.Zx); 
  }
  
  private void Zj(int paramInt) {
    int i = (this.Zx.getInsets()).top;
    i = (int)(i + paramInt * this.ZZ);
    repaint(0, i, this.Zg, (int)Math.ceil(this.ZZ));
  }
  
  public void setFont(Font paramFont) {
    super.setFont(paramFont);
    Zo();
    Zs();
  }
  
  public void Zl(int paramInt) {
    if (paramInt != this.Zo) {
      this.Zo = paramInt;
      Zo();
      repaint();
    } 
  }
  
  public void ZQ(Zmgw paramZmgw) {
    if (this.ZQ == null)
      this.ZQ = new Zmsj(this); 
    if (this.Zx != null)
      this.ZQ.ZG(paramZmgw); 
    super.ZQ(paramZmgw);
    this.ZT = ZA();
    if (paramZmgw != null) {
      this.ZQ.Zu(paramZmgw);
      Zs();
      Zo();
    } 
  }
  
  private void Zs() {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zx : Lburp/Zmgw;
    //   8: ifnull -> 37
    //   11: aload_0
    //   12: aload_0
    //   13: getfield Zx : Lburp/Zmgw;
    //   16: invokevirtual ZS : ()F
    //   19: putfield ZZ : F
    //   22: aload_0
    //   23: aload_0
    //   24: getfield Zx : Lburp/Zmgw;
    //   27: invokevirtual Zg : ()F
    //   30: putfield ZK : F
    //   33: iload_1
    //   34: ifne -> 49
    //   37: aload_0
    //   38: ldc 20.0
    //   40: putfield ZZ : F
    //   43: aload_0
    //   44: ldc 5.0
    //   46: putfield ZK : F
    //   49: aload_0
    //   50: invokevirtual repaint : ()V
    //   53: return
  }
  
  void Zo() {
    int i = this.Zg;
    this.Zg = 4;
    if (this.Zx != null) {
      Font font = getFont();
      if (font != null) {
        FontMetrics fontMetrics = getFontMetrics(font);
        byte b = 0;
        int j = this.Zx.getLineCount() + ZZ() - 1;
        while (true) {
          j /= 10;
          b++;
          if (j < 10) {
            this.Zg += fontMetrics.charWidth('9') * (b + 1) + 3;
            break;
          } 
        } 
      } 
    } 
    if (this.Zg != i) {
      revalidate();
      Container container = SwingUtilities.getAncestorOfClass(Zvol.class, this);
      if (container != null && this.Zx.getDocument().getLength() > 0) {
        container.doLayout();
        ((Zvol)container).getViewport().doLayout();
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzbj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */