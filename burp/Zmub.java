package burp;

import java.util.Comparator;
import java.util.function.BooleanSupplier;
import javax.swing.SortOrder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public abstract class Zmub<E> extends AbstractTableModel implements Zztu, Zzk8<E>, Zg7<E> {
  protected final Zmjx<E> ZM;
  
  protected final Zxr3 Z_;
  
  private BooleanSupplier Ze;
  
  private static String Zy;
  
  protected Zmub(Zmjx<E> paramZmjx) {
    this.ZM = paramZmjx;
    this.Z_ = new Zxr3();
    paramZmjx.ZP(this::fireTableStructureChanged);
  }
  
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return ((Zmk7)this.ZM.Zf().get(paramInt2)).Zs();
  }
  
  public void Zx(Zbws paramZbws) {}
  
  public void Zk(Zbws paramZbws) {}
  
  public Zxr3 ZP() {
    return this.Z_;
  }
  
  public int getColumnCount() {
    return this.ZM.Zf().size();
  }
  
  public String getColumnName(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).ZS();
  }
  
  public Class<?> getColumnClass(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).ZM();
  }
  
  public Object ZV(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).ZW();
  }
  
  public TableCellRenderer Zt(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).ZE();
  }
  
  public TableCellRenderer ZC(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).Zb();
  }
  
  public TableCellEditor Zz(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).ZT();
  }
  
  public int ZS(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).Zd();
  }
  
  public int ZJ(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).ZA();
  }
  
  public int ZM(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).Zn();
  }
  
  public int ZH(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).ZI();
  }
  
  public boolean Ze(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).ZO();
  }
  
  public boolean ZY(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).ZN();
  }
  
  public boolean Zr(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).Zz();
  }
  
  public boolean ZU(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).Zt();
  }
  
  public boolean Zx(String paramString) {
    return this.ZM.Zf().stream().anyMatch(paramString::lambda$columnHidable$0);
  }
  
  public Comparator<?> Zg(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).Zg();
  }
  
  public Zlcu ZR(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).Zq();
  }
  
  public SortOrder Zc(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).Zk();
  }
  
  public boolean Zl(int paramInt) {
    return ((Zmk7)this.ZM.Zf().get(paramInt)).ZX();
  }
  
  public Object ZS(int paramInt, E paramE) {
    return ((Zmk7<E>)this.ZM.Zf().get(paramInt)).Zx().Zl(paramE);
  }
  
  public void ZB(int paramInt, E paramE, Object paramObject) {
    ((Zmk7<E>)this.ZM.Zf().get(paramInt)).Za().ZG(paramE, paramObject);
  }
  
  public void ZE(BooleanSupplier paramBooleanSupplier) {
    this.Ze = paramBooleanSupplier;
  }
  
  private static boolean lambda$columnHidable$0(String paramString, Zmk7 paramZmk7) {
    return (paramString.equals(paramZmk7.ZW()) && paramZmk7.Zt());
  }
  
  public static void Zu(String paramString) {
    Zy = paramString;
  }
  
  public static String ZX() {
    return Zy;
  }
  
  static {
    if (ZX() != null)
      Zu("kaq3Dc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmub.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */