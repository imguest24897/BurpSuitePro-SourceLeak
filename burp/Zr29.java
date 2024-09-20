package burp;

import java.awt.Color;
import java.awt.Component;
import javax.swing.AbstractButton;
import javax.swing.DefaultCellEditor;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class Zr29 extends DefaultCellEditor {
  private static String[] Zr;
  
  public Zr29() {
    super(new Zzdy());
    this.editorComponent.setOpaque(false);
    this.editorComponent.setBackground(new Color(0, 0, 0, 0));
    this.editorComponent.addMouseListener(new Zmj2(this));
  }
  
  public Component getTableCellEditorComponent(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2) {
    this.delegate.setValue(paramObject);
    TableCellRenderer tableCellRenderer = paramJTable.getCellRenderer(paramInt1, paramInt2);
    String[] arrayOfString = Zi();
    Component component = tableCellRenderer.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean, true, paramInt1, paramInt2);
    if (component instanceof JComponent) {
      JComponent jComponent = (JComponent)component;
      this.editorComponent.setBorder(jComponent.getBorder());
    } 
    if (component instanceof AbstractButton) {
      AbstractButton abstractButton = (AbstractButton)component;
      ((AbstractButton)this.editorComponent).setHorizontalAlignment(abstractButton.getHorizontalAlignment());
    } 
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[2]); 
    return this.editorComponent;
  }
  
  public static void Zj(String[] paramArrayOfString) {
    Zr = paramArrayOfString;
  }
  
  public static String[] Zi() {
    return Zr;
  }
  
  static {
    if (Zi() == null)
      Zj(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr29.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */