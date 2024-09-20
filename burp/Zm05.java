package burp;

import java.text.Collator;
import java.util.Comparator;
import javax.swing.table.TableModel;
import javax.swing.table.TableStringConverter;

class Zm05<M extends TableModel> extends Zm0y<M, Integer> {
  private static final Comparator<?> Zy = new Zz_5();
  
  protected M ZP;
  
  private TableStringConverter ZJ;
  
  public Zm05() {
    this((M)null);
  }
  
  public Zm05(M paramM) {
    Zi(paramM);
  }
  
  public void Zi(M paramM) {
    this.ZP = paramM;
    Zs(new Zzv1(this));
  }
  
  public TableStringConverter Zh() {
    return this.ZJ;
  }
  
  public Comparator<?> ZZ(int paramInt) {
    Comparator<?> comparator = super.ZZ(paramInt);
    if (comparator != null)
      return comparator; 
    Class<?> clazz = ((TableModel)getModel()).getColumnClass(paramInt);
    return (clazz == String.class) ? Collator.getInstance() : (Comparable.class.isAssignableFrom(clazz) ? Zy : Collator.getInstance());
  }
  
  protected boolean Zr(int paramInt) {
    Comparator<?> comparator = super.ZZ(paramInt);
    if (comparator != null)
      return false; 
    Class<?> clazz = ((TableModel)getModel()).getColumnClass(paramInt);
    return (clazz == String.class) ? false : (!Comparable.class.isAssignableFrom(clazz));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm05.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */