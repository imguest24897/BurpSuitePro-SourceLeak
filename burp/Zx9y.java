package burp;

import java.nio.IntBuffer;
import java.util.Iterator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zx9y extends Zxsr implements Zmyi {
  private final int ZL;
  
  private final IntBuffer ZV;
  
  Zx9y(Zkit paramZkit, long paramLong, int paramInt, Zso4 paramZso4) {
    super(paramZkit, paramLong);
    this.ZL = paramInt;
    this.ZV = paramZso4.ZB();
  }
  
  public Zeu4<Zmyi> ZF() {
    return Zmyi.Zp;
  }
  
  public int Zpu() {
    return this.ZL;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZU(this);
  }
  
  public int[] ZKg() {
    int[] arrayOfInt = new int[this.ZL];
    this.ZV.duplicate().get(arrayOfInt);
    return arrayOfInt;
  }
  
  public Zmyi ZC(int[] paramArrayOfint) {
    try {
      if (paramArrayOfint.length != this.ZL)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZV.duplicate().put(paramArrayOfint);
    return this;
  }
  
  public int ZN(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.ZL)
            return this.ZV.get(paramInt); 
          throw new ArrayIndexOutOfBoundsException();
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void ZX(int paramInt1, int paramInt2) {
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt1 < this.ZL) {
            this.ZV.put(paramInt1, paramInt2);
            return;
          } 
          throw new ArrayIndexOutOfBoundsException();
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void Zg(Zmyi paramZmyi) {
    Zbqc[] arrayOfZbqc = Zdr.ZH();
    try {
      if (paramZmyi.Zpu() < Zpu())
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZmyi instanceof Zx9y)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zx9y zx9y = (Zx9y)paramZmyi;
    try {
      if (this.Za != zx9y.ZPz()) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      zx9y.ZV.duplicate().put(this.ZV.duplicate());
      if (arrayOfZbqc == null)
        Zbqc.Zr(new Zbqc[2]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public Iterator<Integer> iterator() {
    return new Zmim(this);
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (super.equals(paramObject))
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof Zx9y)
        try {
          if (this.ZV.equals(((Zx9y)paramObject).ZV))
            return true; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof Zmyi)
        return Zdr.Zq(this, (Zmyi)paramObject); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx9y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */