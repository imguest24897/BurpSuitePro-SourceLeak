package burp;

import java.util.Arrays;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zyp<T extends Zgpi> extends Zni implements Zrte<T> {
  private final Zeu4<T> ZC;
  
  private final T[] Zc;
  
  public Zyp(Zeu4<T> paramZeu4, int paramInt) {
    this(paramZeu4, paramZeu4.ZI().ZF(paramInt));
  }
  
  private Zyp(Zeu4<T> paramZeu4, T[] paramArrayOfT) {
    this.ZC = paramZeu4;
    this.Zc = paramArrayOfT;
  }
  
  public static <S extends Zgpi> Zyp ZC(Zeu4<S> paramZeu4, S[] paramArrayOfS) {
    try {
      if (paramArrayOfS == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zyp<>(paramZeu4, paramArrayOfS);
  }
  
  public void ZE(Zrte<T> paramZrte) {
    boolean bool = Zguz.ZE();
    try {
      if (paramZrte.Zpu() < this.Zc.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZrte instanceof Zyp)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zyp zyp = (Zyp)paramZrte;
    try {
      System.arraycopy(this.Zc, 0, zyp.Zc, 0, this.Zc.length);
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        Zguz.Z_(!bool);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public T[] ZbF() {
    Object[] arrayOfObject = this.ZC.ZI().ZF(Zpu());
    System.arraycopy(this.Zc, 0, arrayOfObject, 0, this.Zc.length);
    return (T[])arrayOfObject;
  }
  
  public Zrte<T> ZP(T[] paramArrayOfT) {
    try {
      if (paramArrayOfT.length != this.Zc.length)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    System.arraycopy(paramArrayOfT, 0, this.Zc, 0, paramArrayOfT.length);
    return this;
  }
  
  public T ZdF(int paramInt) {
    return this.Zc[paramInt];
  }
  
  public void ZU(int paramInt, T paramT) {
    this.Zc[paramInt] = paramT;
  }
  
  public int Zpu() {
    return this.Zc.length;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZW(this);
  }
  
  public Zllg<Zrte<T>> ZzH() {
    return new Zguz<>(this.ZC);
  }
  
  public Zeu4<T> ZzK() {
    return this.ZC;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (ZF(paramObject))
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof Zrte))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zrte<Object> zrte = (Zrte)paramObject;
    return Arrays.equals((Object[])ZbF(), zrte.ZbF());
  }
  
  public int hashCode() {
    return Arrays.hashCode((Object[])this.Zc);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zyp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */