package burp;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class Zmo5 extends JTableHeader implements MouseListener {
  private final Zx8i Zu;
  
  private Zlkk Ze;
  
  private Zt00 ZX;
  
  private Zky2 Za;
  
  private Zx8i ZF;
  
  public Zmo5(TableColumnModel paramTableColumnModel) {
    super(paramTableColumnModel);
    setReorderingAllowed(false);
    Zgwi zgwi = new Zgwi(getDefaultRenderer());
    zgwi.Ze(2);
    setDefaultRenderer(zgwi);
    Zxgb zxgb = new Zxgb(this);
    addMouseListener(zxgb);
    this.Zu = new Zt0c();
  }
  
  public void ZF(Zlkk paramZlkk) {
    this.Ze = paramZlkk;
    setBackground(paramZlkk.ZS());
  }
  
  public void Zz(Zt00 paramZt00) {
    this.ZX = paramZt00;
    setFont(paramZt00.ZV());
  }
  
  public void ZE(int paramInt) {
    TableCellRenderer tableCellRenderer = getDefaultRenderer();
    boolean bool = Zm99.ZQ();
    if (tableCellRenderer instanceof Zgwi) {
      ((Zgwi)tableCellRenderer).Ze(paramInt);
      if (bool) {
        if (tableCellRenderer instanceof JLabel)
          ((JLabel)tableCellRenderer).setHorizontalAlignment(paramInt); 
        return;
      } 
      return;
    } 
    if (tableCellRenderer instanceof JLabel)
      ((JLabel)tableCellRenderer).setHorizontalAlignment(paramInt); 
  }
  
  public Zx8i Zc() {
    return this.ZF;
  }
  
  public void Zh(Zx8i paramZx8i) {
    this.ZF = paramZx8i;
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.Ze != null)
      setBackground(this.Ze.ZS()); 
    if (this.ZX != null)
      Zz(this.ZX); 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
  }
  
  public void ZT(Zky2 paramZky2) {
    if (this.Za == null)
      addMouseListener(this); 
    this.Za = paramZky2;
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: invokestatic ZM : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: invokevirtual isPopupTrigger : ()Z
    //   8: ifeq -> 33
    //   11: aload_0
    //   12: getfield Za : Lburp/Zky2;
    //   15: aload_1
    //   16: aload_1
    //   17: invokevirtual getComponent : ()Ljava/awt/Component;
    //   20: aload_1
    //   21: invokevirtual getPoint : ()Ljava/awt/Point;
    //   24: invokeinterface ZV : (Ljava/awt/event/MouseEvent;Ljava/awt/Component;Ljava/awt/Point;)V
    //   29: iload_2
    //   30: ifne -> 135
    //   33: aload_1
    //   34: invokevirtual getClickCount : ()I
    //   37: iconst_1
    //   38: if_icmpne -> 86
    //   41: new java/awt/Point
    //   44: dup
    //   45: aload_1
    //   46: invokevirtual getX : ()I
    //   49: aload_1
    //   50: invokevirtual getY : ()I
    //   53: invokespecial <init> : (II)V
    //   56: astore_3
    //   57: aload_0
    //   58: aload_3
    //   59: invokevirtual columnAtPoint : (Ljava/awt/Point;)I
    //   62: istore #4
    //   64: iload #4
    //   66: iflt -> 82
    //   69: aload_0
    //   70: getfield Za : Lburp/Zky2;
    //   73: aload_1
    //   74: iconst_0
    //   75: iload #4
    //   77: invokeinterface Zv : (Ljava/awt/event/MouseEvent;II)V
    //   82: iload_2
    //   83: ifne -> 135
    //   86: aload_1
    //   87: invokevirtual getClickCount : ()I
    //   90: iconst_2
    //   91: if_icmpne -> 135
    //   94: new java/awt/Point
    //   97: dup
    //   98: aload_1
    //   99: invokevirtual getX : ()I
    //   102: aload_1
    //   103: invokevirtual getY : ()I
    //   106: invokespecial <init> : (II)V
    //   109: astore_3
    //   110: aload_0
    //   111: aload_3
    //   112: invokevirtual columnAtPoint : (Ljava/awt/Point;)I
    //   115: istore #4
    //   117: iload #4
    //   119: iflt -> 135
    //   122: aload_0
    //   123: getfield Za : Lburp/Zky2;
    //   126: aload_1
    //   127: iconst_0
    //   128: iload #4
    //   130: invokeinterface ZR : (Ljava/awt/event/MouseEvent;II)V
    //   135: return
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      this.Za.ZV(paramMouseEvent, paramMouseEvent.getComponent(), paramMouseEvent.getPoint()); 
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {}
  
  public void mouseEntered(MouseEvent paramMouseEvent) {}
  
  public void mouseExited(MouseEvent paramMouseEvent) {}
  
  static JTable Zb(Zmo5 paramZmo5) {
    return paramZmo5.table;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmo5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */