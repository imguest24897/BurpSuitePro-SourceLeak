package burp;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;

class Zm2v extends Zm2i {
  private final Zepx Zy;
  
  final Zbw2 Zi;
  
  Zm2v(Zbw2 paramZbw2, Zepx paramZepx) {
    this.Zy = paramZepx;
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    super.getTableCellRendererComponent(paramJTable, paramObject, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    int i = paramInt1 * 16 + paramInt2 - 1;
    boolean bool = Zbw2.Z_();
    if (i >= this.Zi.ZR.ZC())
      i = -1; 
    Zr4_ zr4_ = (i == -1) ? Zr4_.ZZ : this.Zy.ZT(i);
    Color color1 = (zr4_ == Zr4_.ZZ) ? Zlkk.SOLID_FOREGROUND.ZS() : zr4_.Zm;
    Color color2 = (zr4_ == Zr4_.ZZ) ? Zlkk.BACKGROUND.ZS() : zr4_.ZM;
    setForeground(color1);
    if (!paramBoolean1) {
      setBackground(color2);
      if (bool) {
        if (!color2.equals(Zlkk.BACKGROUND.ZS()))
          setForeground(color2); 
        return this;
      } 
      return this;
    } 
    if (!color2.equals(Zlkk.BACKGROUND.ZS()))
      setForeground(color2); 
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2v.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */