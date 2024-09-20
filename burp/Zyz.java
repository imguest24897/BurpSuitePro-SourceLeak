package burp;

import java.util.Arrays;
import java.util.Iterator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zyz extends Zni implements Zmyi {
  private final int[] Zs;
  
  Zyz(int paramInt) {
    this(new int[paramInt]);
  }
  
  private Zyz(int[] paramArrayOfint) {
    this.Zs = paramArrayOfint;
  }
  
  public static Zyz Zd(int[] paramArrayOfint) {
    try {
      if (paramArrayOfint == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zyz(paramArrayOfint);
  }
  
  public int[] ZKg() {
    int[] arrayOfInt = new int[this.Zs.length];
    System.arraycopy(this.Zs, 0, arrayOfInt, 0, this.Zs.length);
    return arrayOfInt;
  }
  
  public Zmyi ZC(int[] paramArrayOfint) {
    try {
      if (paramArrayOfint.length != this.Zs.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    System.arraycopy(paramArrayOfint, 0, this.Zs, 0, paramArrayOfint.length);
    return this;
  }
  
  public void Zg(Zmyi paramZmyi) {
    Zbqc[] arrayOfZbqc = Zdr.ZH();
    try {
      if (paramZmyi.Zpu() < this.Zs.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZmyi instanceof Zyz)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zyz zyz = (Zyz)paramZmyi;
    try {
      System.arraycopy(this.Zs, 0, zyz.Zs, 0, this.Zs.length);
      if (Zbqc.Zwu() == null)
        Zdr.ZN(new Zbqc[5]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public int ZN(int paramInt) {
    return this.Zs[paramInt];
  }
  
  public void ZX(int paramInt1, int paramInt2) {
    this.Zs[paramInt1] = paramInt2;
  }
  
  public int Zpu() {
    return this.Zs.length;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZU(this);
  }
  
  public Zllg<Zmyi> ZYh() {
    return Zmyi.Zp;
  }
  
  public Iterator<Integer> iterator() {
    return Arrays.stream(this.Zs).iterator();
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (ZF(paramObject))
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (paramObject instanceof Zyz) {
      Zyz zyz = (Zyz)paramObject;
      return Arrays.equals(this.Zs, zyz.Zs);
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zyz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */