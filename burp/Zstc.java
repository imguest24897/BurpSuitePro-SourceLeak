package burp;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

class Zstc extends DefaultListCellRenderer {
  private ListCellRenderer<Object> ZW;
  
  public Component getListCellRendererComponent(JList<?> paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    Zmy1 zmy1 = (Zmy1)paramObject;
    Zlqb zlqb = zmy1.ZT();
    ListCellRenderer<Object> listCellRenderer = zlqb.ZZ();
    return (listCellRenderer != null) ? listCellRenderer.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2) : ((this.ZW == null) ? super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2) : this.ZW.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2));
  }
  
  public void Ze(ListCellRenderer<Object> paramListCellRenderer) {
    this.ZW = paramListCellRenderer;
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZW instanceof JComponent && this.ZW != this)
      ((JComponent)this.ZW).updateUI(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zstc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */