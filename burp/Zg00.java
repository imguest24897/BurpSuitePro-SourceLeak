package burp;

import java.util.BitSet;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import javafx.collections.ModifiableObservableListBase;
import javafx.collections.ObservableList;

public class Zg00<E> extends ModifiableObservableListBase<E> implements ObservableList<E> {
  private final List<E> ZP;
  
  private static int[] Z_;
  
  public Zg00(List<E> paramList) {
    this.ZP = paramList;
  }
  
  public E get(int paramInt) {
    return this.ZP.get(paramInt);
  }
  
  public int size() {
    return this.ZP.size();
  }
  
  protected void doAdd(int paramInt, E paramE) {
    Objects.checkIndex(paramInt, size() + 1);
    this.ZP.add(paramInt, paramE);
  }
  
  protected E doSet(int paramInt, E paramE) {
    return this.ZP.set(paramInt, paramE);
  }
  
  protected E doRemove(int paramInt) {
    return this.ZP.remove(paramInt);
  }
  
  public void clear() {
    int[] arrayOfInt = Zk();
    if (hasListeners()) {
      beginChange();
      nextRemove(0, (List)this);
    } 
    this.ZP.clear();
    this.modCount++;
    if (hasListeners())
      endChange(); 
    if (Zbqc.Zwu() == null)
      Za(new int[2]); 
  }
  
  public void remove(int paramInt1, int paramInt2) {
    Objects.checkFromToIndex(paramInt1, paramInt2, size());
    beginChange();
    int[] arrayOfInt = Zk();
    int i = paramInt1;
    while (i < paramInt2) {
      remove(paramInt1);
      i++;
      if (arrayOfInt == null) {
        Zbqc.Zr(new Zbqc[4]);
        break;
      } 
    } 
    endChange();
  }
  
  public boolean removeAll(Collection<?> paramCollection) {
    int[] arrayOfInt = Zk();
    if (paramCollection == null || paramCollection.isEmpty() || this.ZP.isEmpty())
      return false; 
    beginChange();
    BitSet bitSet = new BitSet(paramCollection.size());
    int i = 0;
    while (i < size()) {
      if (paramCollection.contains(get(i)))
        bitSet.set(i); 
      i++;
      if (arrayOfInt == null)
        break; 
    } 
    if (!bitSet.isEmpty()) {
      i = size();
      while ((i = bitSet.previousSetBit(i - 1)) >= 0) {
        remove(i);
        if (arrayOfInt == null)
          break; 
      } 
    } 
    endChange();
    return !bitSet.isEmpty();
  }
  
  public boolean retainAll(Collection<?> paramCollection) {
    int[] arrayOfInt = Zk();
    if (paramCollection == null || (paramCollection.isEmpty() && !this.ZP.isEmpty())) {
      clear();
      return true;
    } 
    if (this.ZP.isEmpty())
      return false; 
    beginChange();
    BitSet bitSet = new BitSet(paramCollection.size());
    int i = 0;
    while (i < size()) {
      if (!paramCollection.contains(get(i)))
        bitSet.set(i); 
      i++;
      if (arrayOfInt == null)
        break; 
    } 
    if (!bitSet.isEmpty()) {
      i = size();
      while ((i = bitSet.previousSetBit(i - 1)) >= 0) {
        remove(i);
        if (arrayOfInt == null)
          break; 
      } 
    } 
    endChange();
    return !bitSet.isEmpty();
  }
  
  public static void Za(int[] paramArrayOfint) {
    Z_ = paramArrayOfint;
  }
  
  public static int[] Zk() {
    return Z_;
  }
  
  static {
    if (Zk() == null)
      Za(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg00.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */