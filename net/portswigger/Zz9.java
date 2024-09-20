package net.portswigger;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Zz9 {
  static void Zh(Zrmu paramZrmu, List<Zo3> paramList, Type paramType, Ztj paramZtj) {
    String str = Zby.Zf();
    if (!paramZtj.ZB(paramType))
      return; 
    Zcy zcy = paramZtj.ZM(paramType);
    for (Zo3 zo3 : zcy.Zi.values()) {
      if (!zo3.ZR || str == null) {
        ArrayList<Zo3> arrayList = new ArrayList<>(paramList);
        arrayList.add(zo3);
        Zh(paramZrmu, arrayList, zo3.Zg, paramZtj);
        if (!paramZtj.ZB(zo3.Zg) || !Zz0.Zg.equals(zo3.ZK) || str == null) {
          paramZrmu.ZF(arrayList);
          if (str == null)
            break; 
        } 
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zz9.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */