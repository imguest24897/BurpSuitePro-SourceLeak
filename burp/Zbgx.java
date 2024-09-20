package burp;

import com.formdev.flatlaf.extras.components.FlatTriStateCheckBox;
import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

public class Zbgx extends Zbgl implements Zxj4 {
  private final Zsc Zs = new Zsc();
  
  private FlatTriStateCheckBox.State Zl = FlatTriStateCheckBox.State.SELECTED;
  
  public Zbgx() {
    this.Zs.setHorizontalAlignment(2);
    this.Zs.setIconTextGap(10);
    this.Zs.setBorder(new EmptyBorder(0, 0, 0, 0));
    add((Component)this.Zs, 0);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    this.Zs.setText(paramObject.toString());
    ZZ(paramJTable.getColumnModel().getColumn(paramInt2).getWidth());
    int i = paramJTable.convertColumnIndexToModel(paramInt2);
    int[] arrayOfInt = Zgnm.Zz();
    this.Zl = ZT(paramJTable.getModel(), i);
    this.Zs.setState(this.Zl);
    if (Zbqc.Zwu() == null)
      Zgnm.ZW(new int[3]); 
    return super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
  }
  
  private FlatTriStateCheckBox.State ZT(TableModel paramTableModel, int paramInt) {
    // Byte code:
    //   0: invokestatic Zz : ()[I
    //   3: aload_1
    //   4: invokeinterface getRowCount : ()I
    //   9: istore #4
    //   11: astore_3
    //   12: iconst_0
    //   13: istore #5
    //   15: iconst_0
    //   16: istore #6
    //   18: iconst_0
    //   19: istore #7
    //   21: iload #7
    //   23: iload #4
    //   25: if_icmpge -> 86
    //   28: aload_0
    //   29: aload_1
    //   30: iload_2
    //   31: iload #7
    //   33: invokevirtual ZN : (Ljavax/swing/table/TableModel;II)Ljava/lang/Boolean;
    //   36: astore #8
    //   38: aload #8
    //   40: ifnonnull -> 47
    //   43: aload_3
    //   44: ifnull -> 79
    //   47: aload #8
    //   49: invokevirtual booleanValue : ()Z
    //   52: ifeq -> 62
    //   55: iconst_1
    //   56: istore #5
    //   58: aload_3
    //   59: ifnull -> 65
    //   62: iconst_1
    //   63: istore #6
    //   65: iload #6
    //   67: ifeq -> 79
    //   70: iload #5
    //   72: ifeq -> 79
    //   75: getstatic com/formdev/flatlaf/extras/components/FlatTriStateCheckBox$State.INDETERMINATE : Lcom/formdev/flatlaf/extras/components/FlatTriStateCheckBox$State;
    //   78: areturn
    //   79: iinc #7, 1
    //   82: aload_3
    //   83: ifnull -> 21
    //   86: iload #5
    //   88: ifeq -> 95
    //   91: getstatic com/formdev/flatlaf/extras/components/FlatTriStateCheckBox$State.SELECTED : Lcom/formdev/flatlaf/extras/components/FlatTriStateCheckBox$State;
    //   94: areturn
    //   95: getstatic com/formdev/flatlaf/extras/components/FlatTriStateCheckBox$State.UNSELECTED : Lcom/formdev/flatlaf/extras/components/FlatTriStateCheckBox$State;
    //   98: areturn
  }
  
  protected Boolean ZN(TableModel paramTableModel, int paramInt1, int paramInt2) {
    return (Boolean)paramTableModel.getValueAt(paramInt2, paramInt1);
  }
  
  public FlatTriStateCheckBox.State ZB() {
    this.Zl = (this.Zl == FlatTriStateCheckBox.State.SELECTED) ? FlatTriStateCheckBox.State.UNSELECTED : FlatTriStateCheckBox.State.SELECTED;
    return this.Zl;
  }
  
  public Rectangle Ze() {
    Icon icon = this.Zs.getIcon();
    if (icon == null)
      return new Rectangle(); 
    Rectangle rectangle = this.Zs.getBounds();
    int i = rectangle.x + 1;
    int j = rectangle.y + rectangle.height - icon.getIconHeight() + 1;
    return new Rectangle(i, j, icon.getIconWidth(), icon.getIconHeight());
  }
  
  public void ZZ(int paramInt) {
    int i = Zz(paramInt);
    this.Zs.setText(Zj(i, this.Zs.getFontMetrics(this.Zs.getFont()), this.Zs.getText()));
  }
  
  int Zm() {
    return this.Zs.getIconTextGap() + this.Zs.getIcon().getIconWidth() + 5;
  }
  
  public void ZW(MouseEvent paramMouseEvent, JTableHeader paramJTableHeader) {
    if (!SwingUtilities.isLeftMouseButton(paramMouseEvent))
      return; 
    if (!isEnabled())
      return; 
    int i = paramJTableHeader.columnAtPoint(paramMouseEvent.getPoint());
    boolean bool = Z_(paramMouseEvent, paramJTableHeader.getHeaderRect(i));
    if (bool) {
      ZC(this, paramJTableHeader.getTable(), i);
      paramMouseEvent.consume();
    } 
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.Zs.setEnabled(paramBoolean);
  }
  
  private boolean Z_(MouseEvent paramMouseEvent, Rectangle paramRectangle) {
    Point point = new Point(paramMouseEvent.getX() - paramRectangle.x, paramMouseEvent.getY() - paramRectangle.y);
    return Ze().contains(point);
  }
  
  private static void ZC(Zbgx paramZbgx, JTable paramJTable, int paramInt) {
    int[] arrayOfInt = Zgnm.Zz();
    boolean bool = (paramZbgx.ZB() == FlatTriStateCheckBox.State.SELECTED) ? true : false;
    int i = paramJTable.getRowCount();
    byte b = 0;
    while (b < i) {
      paramJTable.setValueAt(Boolean.valueOf(bool), b, paramInt);
      b++;
      if (arrayOfInt != null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbgx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */