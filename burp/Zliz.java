package burp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Zliz implements Iterable<Zo4> {
  private final List<Zo4> Zl;
  
  public Zliz(List<Zo4> paramList) {
    this.Zl = paramList;
  }
  
  public Zo4 Zx(Zmjk paramZmjk) {
    return (Zo4)this.Zl.stream().filter(paramZmjk::lambda$configFor$0).findFirst().orElseThrow(IllegalStateException::new);
  }
  
  public void ZH(int paramInt) {
    try {
      if (!ZU(paramInt))
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Zo4 zo4 = this.Zl.get(paramInt - 1);
    this.Zl.set(paramInt - 1, this.Zl.get(paramInt));
    this.Zl.set(paramInt, zo4);
  }
  
  public void Zb(int paramInt) {
    try {
      if (!Zq(paramInt))
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Zo4 zo4 = this.Zl.get(paramInt + 1);
    this.Zl.set(paramInt + 1, this.Zl.get(paramInt));
    this.Zl.set(paramInt, zo4);
  }
  
  public int ZS() {
    return this.Zl.size();
  }
  
  public Zo4 ZR(int paramInt) {
    return this.Zl.get(paramInt);
  }
  
  public boolean ZU(int paramInt) {
    try {
      if (paramInt > 0)
        try {
          if (!((Zo4)this.Zl.get(paramInt)).Zc())
            try {
              if (!((Zo4)this.Zl.get(paramInt - 1)).Zc());
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean Zq(int paramInt) {
    try {
      if (paramInt < ZS() - 1)
        try {
          if (!((Zo4)this.Zl.get(paramInt)).Zc())
            try {
              if (!((Zo4)this.Zl.get(paramInt + 1)).Zc());
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public Iterator<Zo4> iterator() {
    return (new ArrayList<>(this.Zl)).iterator();
  }
  
  public void forEach(Consumer<? super Zo4> paramConsumer) {
    super.forEach(paramConsumer);
  }
  
  public Comparator<Zle3> ZV() {
    List list = this.Zl.stream().map(Zo4::Z_).toList();
    Comparator<?> comparator = Comparator.comparingInt(list::lambda$createWidgetComparator$1);
    Zbqc[] arrayOfZbqc = Zmjk.Zz();
    try {
      if (arrayOfZbqc == null)
        Zbqc.Zr(new Zbqc[1]); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return Comparator.comparing(Zle3::ZK, comparator);
  }
  
  private static int lambda$createWidgetComparator$1(List paramList, Zmjk paramZmjk) {
    int i = paramList.indexOf(paramZmjk);
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (i == -1) ? Integer.MAX_VALUE : i;
  }
  
  private static boolean lambda$configFor$0(Zmjk paramZmjk, Zo4 paramZo4) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (paramZo4.Z_() == paramZmjk);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zliz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */