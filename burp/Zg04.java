package burp;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Zg04<E> extends Zg00<E> {
  protected final Object ZC;
  
  public Zg04(List<E> paramList) {
    this(paramList, new Object());
  }
  
  public Zg04(List<E> paramList, Object paramObject) {
    super(paramList);
    this.ZC = paramObject;
  }
  
  public int size() {
    synchronized (this.ZC) {
      return super.size();
    } 
  }
  
  public boolean isEmpty() {
    synchronized (this.ZC) {
      return super.isEmpty();
    } 
  }
  
  public boolean contains(Object paramObject) {
    synchronized (this.ZC) {
      return super.contains(paramObject);
    } 
  }
  
  public Iterator<E> iterator() {
    synchronized (this.ZC) {
      return super.iterator();
    } 
  }
  
  public Object[] toArray() {
    synchronized (this.ZC) {
      return super.toArray();
    } 
  }
  
  public <U> U[] toArray(U[] paramArrayOfU) {
    synchronized (this.ZC) {
      return (U[])super.toArray((Object[])paramArrayOfU);
    } 
  }
  
  public boolean add(E paramE) {
    synchronized (this.ZC) {
      return super.add(paramE);
    } 
  }
  
  public boolean containsAll(Collection<?> paramCollection) {
    synchronized (this.ZC) {
      return super.containsAll(paramCollection);
    } 
  }
  
  public E get(int paramInt) {
    synchronized (this.ZC) {
      return super.get(paramInt);
    } 
  }
  
  public void clear() {
    synchronized (this.ZC) {
      super.clear();
    } 
  }
  
  public int indexOf(Object paramObject) {
    synchronized (this.ZC) {
      return super.indexOf(paramObject);
    } 
  }
  
  public int lastIndexOf(Object paramObject) {
    synchronized (this.ZC) {
      return super.lastIndexOf(paramObject);
    } 
  }
  
  public ListIterator<E> listIterator() {
    synchronized (this.ZC) {
      return super.listIterator();
    } 
  }
  
  public ListIterator<E> listIterator(int paramInt) {
    synchronized (this.ZC) {
      return super.listIterator(paramInt);
    } 
  }
  
  @SafeVarargs
  public final boolean addAll(E... paramVarArgs) {
    synchronized (this.ZC) {
      return super.addAll((Object[])paramVarArgs);
    } 
  }
  
  @SafeVarargs
  public final boolean setAll(E... paramVarArgs) {
    synchronized (this.ZC) {
      return super.setAll((Object[])paramVarArgs);
    } 
  }
  
  @SafeVarargs
  public final boolean removeAll(E... paramVarArgs) {
    synchronized (this.ZC) {
      return super.removeAll((Object[])paramVarArgs);
    } 
  }
  
  @SafeVarargs
  public final boolean retainAll(E... paramVarArgs) {
    synchronized (this.ZC) {
      return super.retainAll((Object[])paramVarArgs);
    } 
  }
  
  public void remove(int paramInt1, int paramInt2) {
    synchronized (this.ZC) {
      super.remove(paramInt1, paramInt2);
    } 
  }
  
  public boolean setAll(Collection<? extends E> paramCollection) {
    synchronized (this.ZC) {
      return super.setAll(paramCollection);
    } 
  }
  
  public boolean addAll(Collection<? extends E> paramCollection) {
    synchronized (this.ZC) {
      return super.addAll(paramCollection);
    } 
  }
  
  public boolean addAll(int paramInt, Collection<? extends E> paramCollection) {
    synchronized (this.ZC) {
      return super.addAll(paramInt, paramCollection);
    } 
  }
  
  public boolean removeAll(Collection<?> paramCollection) {
    synchronized (this.ZC) {
      return super.removeAll(paramCollection);
    } 
  }
  
  public boolean retainAll(Collection<?> paramCollection) {
    synchronized (this.ZC) {
      return super.retainAll(paramCollection);
    } 
  }
  
  public void add(int paramInt, E paramE) {
    synchronized (this.ZC) {
      super.add(paramInt, paramE);
    } 
  }
  
  public E set(int paramInt, E paramE) {
    synchronized (this.ZC) {
      return (E)super.set(paramInt, paramE);
    } 
  }
  
  public boolean remove(Object paramObject) {
    synchronized (this.ZC) {
      return super.remove(paramObject);
    } 
  }
  
  public E remove(int paramInt) {
    synchronized (this.ZC) {
      return (E)super.remove(paramInt);
    } 
  }
  
  public List<E> subList(int paramInt1, int paramInt2) {
    synchronized (this.ZC) {
      return super.subList(paramInt1, paramInt2);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg04.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */