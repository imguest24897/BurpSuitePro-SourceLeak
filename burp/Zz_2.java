package burp;

import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import javax.swing.SortOrder;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class Zz_2<E> {
  private static final Map<Class<?>, Comparator<?>> ZM = Map.of(String.class, Ztn0.ZI, Integer.class, Ztn0.ZG, Long.class, Ztn0.ZL, Date.class, Ztn0.ZF, Ze9n.class, Ztn0.ZS);
  
  private final Zkuq<E> ZA;
  
  private String Za;
  
  private Class<?> ZP;
  
  private Object Zw;
  
  private TableCellRenderer ZY;
  
  private TableCellRenderer Zx;
  
  private TableCellEditor Zi;
  
  private int ZT = -1;
  
  private int Zl = -1;
  
  private int Zy = 15;
  
  private int ZV = Integer.MAX_VALUE;
  
  private boolean ZF = true;
  
  private boolean ZW = true;
  
  private boolean Z_ = true;
  
  private boolean Zn = true;
  
  private boolean ZG = true;
  
  private Comparator<?> Zv;
  
  private boolean Zb;
  
  private Zlcu ZN;
  
  private SortOrder Zj;
  
  private Zzbi<E> ZH;
  
  private boolean Ze = false;
  
  private Zz_2(Zkuq<E> paramZkuq) {
    this.ZA = Objects.<Zkuq<E>>requireNonNull(paramZkuq);
  }
  
  public Zz_2<E> ZL(String paramString) {
    this.Za = paramString;
    return this;
  }
  
  public Zz_2<E> Zg(Class<?> paramClass) {
    this.ZP = paramClass;
    return this;
  }
  
  public Zz_2<E> Z_(Object paramObject) {
    this.Zw = paramObject;
    return this;
  }
  
  public Zz_2<E> Za(TableCellRenderer paramTableCellRenderer) {
    this.ZY = paramTableCellRenderer;
    return this;
  }
  
  public Zz_2<E> ZM(TableCellRenderer paramTableCellRenderer) {
    this.Zx = paramTableCellRenderer;
    return this;
  }
  
  public Zz_2<E> ZE(TableCellEditor paramTableCellEditor) {
    this.Zi = paramTableCellEditor;
    return this;
  }
  
  public Zz_2<E> Za(int paramInt) {
    this.ZT = paramInt;
    return this;
  }
  
  public Zz_2<E> ZZ(int paramInt) {
    return Za(Zz(paramInt));
  }
  
  public Zz_2<E> Zf(int paramInt) {
    this.Zl = paramInt;
    return this;
  }
  
  public Zz_2<E> ZQ(int paramInt) {
    return Zf(Zz(paramInt));
  }
  
  public Zz_2<E> Zk(int paramInt) {
    this.Zy = paramInt;
    return this;
  }
  
  public Zz_2<E> ZG(int paramInt) {
    return Zk(Zz(paramInt));
  }
  
  public Zz_2<E> ZL(int paramInt) {
    this.ZV = paramInt;
    return this;
  }
  
  public Zz_2<E> Zg(int paramInt) {
    return ZL(Zz(paramInt));
  }
  
  public Zz_2<E> Zi(boolean paramBoolean) {
    this.ZF = paramBoolean;
    return this;
  }
  
  public Zz_2<E> ZP(boolean paramBoolean) {
    this.ZW = paramBoolean;
    return this;
  }
  
  public Zz_2<E> ZK(boolean paramBoolean) {
    this.Z_ = paramBoolean;
    return this;
  }
  
  public Zz_2<E> Zx(boolean paramBoolean) {
    this.Zn = paramBoolean;
    return this;
  }
  
  public Zz_2<E> ZU(boolean paramBoolean) {
    this.ZG = paramBoolean;
    return this;
  }
  
  public Zz_2<E> Zh(Comparator<?> paramComparator) {
    this.Zv = paramComparator;
    return this;
  }
  
  public Zz_2<E> ZA(Zlcu paramZlcu) {
    this.ZN = paramZlcu;
    return this;
  }
  
  public Zz_2<E> ZV(SortOrder paramSortOrder) {
    this.Zj = paramSortOrder;
    return this;
  }
  
  public Zz_2<E> ZR(Zzbi<E> paramZzbi) {
    this.ZH = paramZzbi;
    this.Zb = (paramZzbi != null);
    return this;
  }
  
  public Zz_2<E> ZW(boolean paramBoolean) {
    this.Ze = paramBoolean;
    return this;
  }
  
  public Zmk7<E> ZH() {
    this.ZP = Objects.<Class<?>>requireNonNullElse(this.ZP, Object.class);
    if (this.ZP == Boolean.class)
      ZB(); 
    if (this.ZH == null)
      this.ZH = Zz_2::lambda$build$0; 
    if (this.Zv == null)
      this.Zv = ZM.get(this.ZP); 
    if (this.Zj == null)
      this.Zj = SortOrder.UNSORTED; 
    if (this.ZT < 0)
      this.ZT = 75; 
    if (this.Zl < 0)
      this.Zl = this.ZT; 
    if (this.Zw == null)
      if (this.Za != null) {
        this.Zw = this.Za;
      } else {
        this.Zw = UUID.randomUUID().toString();
      }  
    if (this.ZY == null)
      this.ZY = new Zbgz(); 
    return new Zmk7<>(this);
  }
  
  private void ZB() {
    if (this.Zb) {
      Zd();
    } else {
      Zj();
    } 
  }
  
  private void Zd() {
    if (this.Zi == null)
      this.Zi = new Zr29(); 
    if (this.ZY == null)
      this.ZY = new Zbgx(); 
    if (this.Zx == null)
      this.Zx = new Zzg8(); 
  }
  
  private void Zj() {
    if (this.Zx == null)
      this.Zx = new Zbgu(); 
  }
  
  private static int Zz(int paramInt) {
    return (int)(paramInt * Zrt.ZH());
  }
  
  private static void lambda$build$0(Object paramObject1, Object paramObject2) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz_2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */