package burp;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Zrkb {
  private final List<Ztnz> Zr;
  
  private final List<Zmne> Zn;
  
  Zrkb(List<Ztnz> paramList) {
    this.Zr = Collections.unmodifiableList(paramList);
    this.Zn = new LinkedList<>();
  }
  
  Zrkb ZU(List<Zmne> paramList) {
    String[] arrayOfString = Ztom.ZG();
    for (Zmne zmne : paramList) {
      boolean bool = false;
      ListIterator<Zmne> listIterator = this.Zn.listIterator();
      while (listIterator.hasNext()) {
        Zmne zmne1 = listIterator.next();
        if (zmne1.Zh.ZP(zmne.Zh.Ze)) {
          bool = true;
          if (zmne.ZZ) {
            listIterator.remove();
            listIterator.add(zmne);
            if (arrayOfString != null)
              continue; 
          } 
          break;
        } 
        continue;
        if (arrayOfString != null)
          break; 
      } 
      if (!bool)
        this.Zn.add(zmne); 
      if (arrayOfString != null)
        break; 
    } 
    return this;
  }
  
  List<Ztnz> Zr() {
    LinkedList<Ztnz> linkedList = new LinkedList<>(this.Zr);
    Iterator<Zmne> iterator = this.Zn.iterator();
    String[] arrayOfString = Ztom.ZG();
    while (iterator.hasNext()) {
      Zmne zmne = iterator.next();
      boolean bool = false;
      ListIterator<Ztnz> listIterator = linkedList.listIterator();
      while (listIterator.hasNext()) {
        Ztnz ztnz = listIterator.next();
        if (ztnz.ZP(zmne.Zh.Ze)) {
          bool = true;
          if (zmne.ZZ) {
            listIterator.remove();
            listIterator.add(zmne.Zh);
            if (arrayOfString != null)
              continue; 
          } 
          break;
        } 
        continue;
        if (arrayOfString != null)
          break; 
      } 
      if (!bool)
        linkedList.add(zmne.Zh); 
      if (arrayOfString != null)
        break; 
    } 
    return linkedList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrkb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */