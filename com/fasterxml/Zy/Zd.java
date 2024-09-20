package com.fasterxml.Zy;

import burp.Zbqc;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class Zd<E extends Zu<E>> extends AbstractCollection<E> implements Deque<E> {
  E Zf;
  
  E ZI;
  
  void ZZ(E paramE) {
    E e = this.Zf;
    Zbqc[] arrayOfZbqc = Zr.ZE();
    try {
      this.Zf = paramE;
      if (e == null) {
        try {
          this.ZI = paramE;
          if (arrayOfZbqc == null) {
            e.Zm(paramE);
            paramE.Zj(e);
            return;
          } 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        return;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    e.Zm(paramE);
    paramE.Zj(e);
  }
  
  void Zg(E paramE) {
    E e = this.ZI;
    Zbqc[] arrayOfZbqc = Zr.ZE();
    try {
      this.ZI = paramE;
      if (e == null) {
        try {
          this.Zf = paramE;
          if (arrayOfZbqc == null) {
            e.Zj(paramE);
            paramE.Zm(e);
            return;
          } 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        return;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    e.Zj(paramE);
    paramE.Zm(e);
  }
  
  E Ze() {
    E e1 = this.Zf;
    Zbqc[] arrayOfZbqc = Zr.ZE();
    E e2 = (E)e1.ZK();
    try {
      e1.Zj(null);
      this.Zf = e2;
      if (e2 == null) {
        try {
          this.ZI = null;
          if (arrayOfZbqc == null) {
            e2.Zm(null);
            return e1;
          } 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        return e1;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    e2.Zm(null);
    return e1;
  }
  
  E ZP() {
    E e1 = this.ZI;
    E e2 = (E)e1.Zl();
    e1.Zm(null);
    Zbqc[] arrayOfZbqc = Zr.ZE();
    try {
      this.ZI = e2;
      if (e2 == null) {
        try {
          this.Zf = null;
          if (arrayOfZbqc == null) {
            e2.Zj(null);
            return e1;
          } 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
        return e1;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    e2.Zj(null);
    return e1;
  }
  
  void ZK(E paramE) {
    // Byte code:
    //   0: invokestatic ZE : ()[Lburp/Zbqc;
    //   3: aload_1
    //   4: invokeinterface Zl : ()Lcom/fasterxml/Zy/Zu;
    //   9: astore_3
    //   10: aload_1
    //   11: invokeinterface ZK : ()Lcom/fasterxml/Zy/Zu;
    //   16: astore #4
    //   18: astore_2
    //   19: aload_3
    //   20: ifnonnull -> 40
    //   23: aload_0
    //   24: aload #4
    //   26: putfield Zf : Lcom/fasterxml/Zy/Zu;
    //   29: aload_2
    //   30: ifnonnull -> 62
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   39: athrow
    //   40: aload_3
    //   41: aload #4
    //   43: invokeinterface Zj : (Lcom/fasterxml/Zy/Zu;)V
    //   48: aload_1
    //   49: aconst_null
    //   50: invokeinterface Zm : (Lcom/fasterxml/Zy/Zu;)V
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   61: athrow
    //   62: aload #4
    //   64: ifnonnull -> 83
    //   67: aload_0
    //   68: aload_3
    //   69: putfield ZI : Lcom/fasterxml/Zy/Zu;
    //   72: aload_2
    //   73: ifnonnull -> 105
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   82: athrow
    //   83: aload #4
    //   85: aload_3
    //   86: invokeinterface Zm : (Lcom/fasterxml/Zy/Zu;)V
    //   91: aload_1
    //   92: aconst_null
    //   93: invokeinterface Zj : (Lcom/fasterxml/Zy/Zu;)V
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   104: athrow
    //   105: return
    // Exception table:
    //   from	to	target	type
    //   19	33	36	java/util/NoSuchElementException
    //   23	55	58	java/util/NoSuchElementException
    //   62	76	79	java/util/NoSuchElementException
    //   67	98	101	java/util/NoSuchElementException
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.Zf == null);
  }
  
  void ZZ() {
    try {
      if (isEmpty())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  public int size() {
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zr.ZE();
    E e = this.Zf;
    while (e != null) {
      b++;
      e = e.ZK();
      if (arrayOfZbqc == null)
        break; 
    } 
    return b;
  }
  
  public void clear() {
    E e = this.Zf;
    Zbqc[] arrayOfZbqc = Zr.ZE();
    while (e != null) {
      E e1 = (E)e.ZK();
      e.Zm(null);
      e.Zj(null);
      e = e1;
      if (arrayOfZbqc == null)
        break; 
    } 
    this.Zf = this.ZI = null;
  }
  
  public boolean contains(Object paramObject) {
    try {
      if (paramObject instanceof Zu)
        try {
          if (ZL((Zu)paramObject));
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return false;
  }
  
  boolean ZL(Zu<?> paramZu) {
    try {
      if (paramZu.Zl() == null)
        try {
          if (paramZu.ZK() == null) {
            try {
              if (paramZu == this.Zf);
            } catch (NoSuchElementException noSuchElementException) {
              throw a(null);
            } 
            return false;
          } 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  public void ZP(E paramE) {
    try {
      if (paramE != this.ZI) {
        ZK(paramE);
        Zg(paramE);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  public E ZH() {
    return ZI();
  }
  
  public E ZI() {
    return this.Zf;
  }
  
  public E ZJ() {
    return this.ZI;
  }
  
  public E Zn() {
    ZZ();
    return ZI();
  }
  
  public E ZM() {
    ZZ();
    return ZJ();
  }
  
  public E Zy() {
    return Zn();
  }
  
  public boolean Zq(E paramE) {
    return ZF(paramE);
  }
  
  public boolean Za(E paramE) {
    try {
      if (ZL((Zu<?>)paramE))
        return false; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    ZZ(paramE);
    return true;
  }
  
  public boolean ZF(E paramE) {
    try {
      if (ZL((Zu<?>)paramE))
        return false; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Zg(paramE);
    return true;
  }
  
  public boolean ZT(E paramE) {
    return ZF(paramE);
  }
  
  public void Zm(E paramE) {
    try {
      if (!Za(paramE))
        throw new IllegalArgumentException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  public void ZX(E paramE) {
    try {
      if (!ZF(paramE))
        throw new IllegalArgumentException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
  }
  
  public E ZS() {
    return ZG();
  }
  
  public E ZG() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return isEmpty() ? null : Ze();
  }
  
  public E ZN() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return isEmpty() ? null : ZP();
  }
  
  public E Zp() {
    return ZL();
  }
  
  public boolean remove(Object paramObject) {
    try {
      if (paramObject instanceof Zu)
        try {
          if (Zx((E)paramObject));
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return false;
  }
  
  boolean Zx(E paramE) {
    try {
      if (ZL((Zu<?>)paramE)) {
        ZK(paramE);
        return true;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return false;
  }
  
  public E ZL() {
    ZZ();
    return ZG();
  }
  
  public boolean removeFirstOccurrence(Object paramObject) {
    return remove(paramObject);
  }
  
  public E Za() {
    ZZ();
    return ZN();
  }
  
  public boolean removeLastOccurrence(Object paramObject) {
    return remove(paramObject);
  }
  
  public boolean removeAll(Collection<?> paramCollection) {
    boolean bool = false;
    Zbqc[] arrayOfZbqc = Zr.ZE();
    for (Object object : paramCollection) {
      bool |= remove(object);
      if (arrayOfZbqc == null)
        break; 
    } 
    return bool;
  }
  
  public void Zf(E paramE) {
    Zm(paramE);
  }
  
  public E ZA() {
    return ZL();
  }
  
  public Iterator<E> iterator() {
    return new Zs(this, (Zu)this.Zf);
  }
  
  public Iterator<E> descendingIterator() {
    return new Zw(this, (Zu)this.ZI);
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zy\Zd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */