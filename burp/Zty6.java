package burp;

import java.time.temporal.Temporal;
import javax.swing.SortOrder;

public class Zty6 implements Zzwn<Object> {
  private SortOrder ZY = SortOrder.UNSORTED;
  
  public void ZR(SortOrder paramSortOrder) {
    this.ZY = (paramSortOrder == null) ? SortOrder.UNSORTED : paramSortOrder;
  }
  
  public int compare(Object paramObject1, Object paramObject2) {
    if (paramObject1 == paramObject2)
      return 0; 
    if (Zr6p.ZD.equals(paramObject1))
      return (this.ZY == SortOrder.DESCENDING) ? -1 : 1; 
    if (Zr6p.ZD.equals(paramObject2))
      return (this.ZY == SortOrder.DESCENDING) ? 1 : -1; 
    if (paramObject1 instanceof Exception)
      return (this.ZY == SortOrder.DESCENDING) ? -1 : 1; 
    if (paramObject2 instanceof Exception)
      return (this.ZY == SortOrder.DESCENDING) ? 1 : -1; 
    if (paramObject1 == null || paramObject1 == Zgnm.NULL_CELL_VALUE)
      return 1; 
    if (paramObject2 == null || paramObject2 == Zgnm.NULL_CELL_VALUE)
      return -1; 
    if (paramObject1 instanceof Number) {
      Number number = (Number)paramObject1;
      if (paramObject2 instanceof Number) {
        Number number1 = (Number)paramObject2;
        Zk8p zk8p = new Zk8p();
        return zk8p.ZH(number, number1);
      } 
    } 
    if (paramObject1 instanceof Temporal) {
      Temporal temporal = (Temporal)paramObject1;
      if (paramObject2 instanceof Temporal) {
        Temporal temporal1 = (Temporal)paramObject2;
        Zssn zssn = new Zssn();
        return zssn.ZK(temporal, temporal1);
      } 
    } 
    if (paramObject1.getClass() == paramObject2.getClass()) {
      if (paramObject1 instanceof Comparable) {
        Comparable<Object> comparable = (Comparable)paramObject1;
        return Zl(comparable, paramObject2);
      } 
      return paramObject1.toString().compareTo(paramObject2.toString());
    } 
    return paramObject1.getClass().getName().compareTo(paramObject2.getClass().getName());
  }
  
  private int Zl(Comparable<Object> paramComparable, Object paramObject) {
    return paramComparable.compareTo(paramObject);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zty6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */