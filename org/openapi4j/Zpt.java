package org.openapi4j;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class Zpt {
  static List<Zo> Zo(Zx paramZx, Collection<Zo> paramCollection, String paramString) {
    ArrayList<Zo> arrayList = new ArrayList();
    Zbqc[] arrayOfZbqc = Zc.ZL();
    if (paramCollection != null)
      for (Zo zo : paramCollection) {
        if (zo.isRef()) {
          Zh zh = paramZx.Zh().Zg(zo.getCanonicalRef());
          try {
            zo = zh.<Zo>Zg(Zo.class);
          } catch (Zau zau) {}
        } 
        try {
          if (zo != null)
            try {
              if (paramString.equalsIgnoreCase(zo.getIn()))
                arrayList.add(zo); 
            } catch (Zau zau) {
              throw a(null);
            }  
        } catch (Zau zau) {
          throw a(null);
        } 
        if (arrayOfZbqc != null)
          break; 
      }  
    return arrayList;
  }
  
  private static Zau a(Zau paramZau) {
    return paramZau;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zpt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */