package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ze3h implements Iterable<Zz_1> {
  private static final Zs6r ZG = Ze3h::lambda$static$0;
  
  List<Zz_1> ZX = new ArrayList<>();
  
  private static final Comparator<Zz_1> Z_ = Comparator.comparing(Ze3h::lambda$static$1);
  
  public Ze3h(Zz_1... paramVarArgs) {
    Collections.addAll(this.ZX, paramVarArgs);
  }
  
  public void Zj(Zz_1 paramZz_1) {
    Zuh.Zb((paramZz_1 != null), Zqf.Zv);
    this.ZX.add(paramZz_1);
  }
  
  public boolean ZF() {
    return this.ZX.isEmpty();
  }
  
  public Iterator<Zz_1> iterator() {
    return this.ZX.iterator();
  }
  
  public int Zw() {
    return this.ZX.size();
  }
  
  public Zz_1 ZJ() {
    return this.ZX.getFirst();
  }
  
  public Ze3h Zd() {
    return ZU(Zbfx.Zd);
  }
  
  public Ze3h ZU(Zbfx paramZbfx) {
    HashSet<Zz_1> hashSet = new HashSet();
    Iterator<Zz_1> iterator = this.ZX.iterator();
    String str = Zz_1.ZG();
    while (iterator.hasNext()) {
      Zz_1 zz_1 = iterator.next();
      if (paramZbfx.Zz())
        return this; 
      Zl(zz_1, hashSet);
      if (str == null)
        break; 
    } 
    ArrayList<Zz_1> arrayList = new ArrayList();
    for (Zz_1 zz_1 : this.ZX) {
      if (paramZbfx.Zz())
        return this; 
      if (!hashSet.contains(zz_1))
        arrayList.add(zz_1); 
      if (str == null)
        break; 
    } 
    this.ZX = arrayList;
    return this;
  }
  
  private static void Zl(Zz_1 paramZz_1, Set<Zz_1> paramSet) {
    Stack<Zz_1> stack = new Stack();
    stack.push(paramZz_1);
    String str = Zz_1.ZG();
    while (!stack.isEmpty()) {
      Zz_1 zz_1 = stack.pop();
      Enumeration<Zz_1> enumeration = zz_1.children();
      while (enumeration.hasMoreElements()) {
        Zz_1 zz_11 = enumeration.nextElement();
        if (!paramSet.contains(zz_11)) {
          paramSet.add(zz_11);
          stack.push(zz_11);
        } 
        if (str == null)
          break; 
      } 
      if (str == null)
        break; 
    } 
  }
  
  public Ze3h ZL() {
    return Zi(Zbfx.Zd);
  }
  
  public Ze3h Zi(Zbfx paramZbfx) {
    int i = this.ZX.size();
    byte b = 0;
    String str = Zz_1.ZG();
    while (b < i) {
      Zz_1 zz_1 = this.ZX.get(b);
      for (Zz_1 zz_11 : zz_1.ZD(paramZbfx)) {
        if (zz_11 == zz_1)
          continue; 
        this.ZX.add(zz_11);
        if (str == null)
          break; 
      } 
      b++;
      if (str == null)
        break; 
    } 
    return this;
  }
  
  public Ze3h Zh(Zs6r paramZs6r) {
    String str = Zz_1.ZG();
    byte b = 0;
    while (b < this.ZX.size()) {
      if (!paramZs6r.ZN(this.ZX.get(b))) {
        this.ZX.remove(b);
        b--;
      } 
      b++;
      if (str == null)
        break; 
    } 
    return this;
  }
  
  public Ze3h ZO(Zs6r paramZs6r, Zbfx paramZbfx) {
    ArrayList<Zz_1> arrayList = new ArrayList();
    Iterator<Zz_1> iterator = this.ZX.iterator();
    String str = Zz_1.ZG();
    while (iterator.hasNext()) {
      Zz_1 zz_1 = iterator.next();
      for (Zz_1 zz_11 : zz_1.ZC(paramZs6r, paramZbfx)) {
        arrayList.add(zz_11);
        if (str == null)
          break; 
      } 
      if (str == null)
        break; 
    } 
    this.ZX.clear();
    this.ZX.addAll(arrayList);
    return this;
  }
  
  public Ze3h Zz() {
    return Zh(ZG);
  }
  
  public Ze3h Zb() {
    this.ZX.sort(Z_);
    return this;
  }
  
  public Zez3[] Zi() {
    Zez3[] arrayOfZez3 = new Zez3[this.ZX.size()];
    byte b = 0;
    String str = Zz_1.ZG();
    while (b < this.ZX.size()) {
      arrayOfZez3[b] = ((Zxya)((Zz_1)this.ZX.get(b)).Z_()).ZX;
      b++;
      if (str == null)
        break; 
    } 
    return arrayOfZez3;
  }
  
  public List<Zez3> Zp() {
    ArrayList<Zez3> arrayList = new ArrayList();
    Iterator<Zz_1> iterator = this.ZX.iterator();
    String str = Zz_1.ZG();
    while (iterator.hasNext()) {
      Zz_1 zz_1 = iterator.next();
      arrayList.add(((Zxya)zz_1.Z_()).ZX);
      if (str == null)
        break; 
    } 
    return arrayList;
  }
  
  public List<Zz_1> ZZ() {
    return Collections.unmodifiableList(this.ZX);
  }
  
  private static Zlit lambda$static$1(Zz_1 paramZz_1) {
    return ((Zxya)paramZz_1.Z_()).Zq();
  }
  
  private static boolean lambda$static$0(Zz_1 paramZz_1) {
    return ((Zxya)paramZz_1.Z_()).Zy;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze3h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */