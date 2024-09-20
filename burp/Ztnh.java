package burp;

import java.util.Comparator;
import java.util.Objects;
import java.util.stream.IntStream;
import javax.swing.RowSorter;
import javax.swing.SortOrder;

class Ztnh extends Ztn0 {
  private final Zzjc ZA;
  
  private final Zr4a ZX;
  
  Ztnh(Zzjc paramZzjc, Zr4a paramZr4a) {
    this.ZA = paramZzjc;
    this.ZX = paramZr4a;
    paramZr4a.Zh(new Zzcl(this));
    this.ZD = new RowSorter.SortKey(1, SortOrder.ASCENDING);
    this.ZZ = 0;
    this.Zc = Zb2j.Zq();
    this.Zf = Zb2j.Zi();
    this.ZV = Zb2j.ZF();
  }
  
  protected Comparator<?> ZS(int paramInt) {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (paramInt == Zb2j.ENABLED.Zp()) ? Ztnh::lambda$getColumnComparator$0 : super.ZS(paramInt);
  }
  
  private void Zn() {
    int i = this.ZA.Zu() - 1;
    fireTableRowsInserted(i, i);
  }
  
  public Zz8p Zl() {
    Objects.requireNonNull(this.ZA);
    long l = IntStream.range(0, getRowCount()).mapToObj(this.ZA::ZK).filter(Zsgq::Zk).count();
    try {
      if (l == 0L)
        return Zz8p.NONE_SELECTED; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (l == getRowCount()) ? Zz8p.ALL_SELECTED : Zz8p.SOME_SELECTED;
  }
  
  public void ZE(boolean paramBoolean) {
    String str = Zed0.Zm();
    byte b = 0;
    while (b < this.ZA.Zu()) {
      Zsgq zsgq = this.ZA.ZK(b);
      zsgq.ZS(paramBoolean);
      b++;
      if (str == null)
        break; 
    } 
    fireTableDataChanged();
    this.ZX.Zi();
  }
  
  public int getRowCount() {
    return this.ZA.Zu();
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    try {
      if (paramInt1 >= 0) {
        try {
          if (paramInt1 >= this.ZA.Zu())
            return null; 
        } catch (MatchException matchException) {
          throw a(null);
        } 
      } else {
        return null;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    Zsgq zsgq = this.ZA.ZK(paramInt1);
    try {
      switch (Zsgm.ZU[Zb2j.Zi(paramInt2).ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return zsgq.ZX();
  }
  
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return Zb2j.Zi(paramInt2).ZN();
  }
  
  public void setValueAt(Object paramObject, int paramInt1, int paramInt2) {
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt1 < this.ZA.Zu()) {
            Zsgq zsgq = this.ZA.ZK(paramInt1);
            try {
              if (Objects.requireNonNull(Zb2j.Zi(paramInt2)) == Zb2j.ENABLED) {
                zsgq.ZS(((Boolean)paramObject).booleanValue());
                fireTableCellUpdated(paramInt1, paramInt2);
                this.ZX.Zi();
              } 
            } catch (MatchException matchException) {
              throw a(null);
            } 
            return;
          } 
          return;
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  private static int lambda$getColumnComparator$0(Object paramObject1, Object paramObject2) {
    return 0;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztnh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */