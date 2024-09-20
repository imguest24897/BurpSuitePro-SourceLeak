package burp;

import java.util.Comparator;
import java.util.Objects;

class Zmzx {
  private static final Comparator<Zmy8> ZO = Comparator.comparing(Zmy8::ZlM).thenComparing(Zmy8::Zl5).thenComparing(Zmy8::Zlg, Comparator.nullsFirst(Comparator.naturalOrder())).thenComparing(Zmy8::ZlU, Comparator.nullsFirst(Comparator.naturalOrder())).thenComparing(Zmy8::ZlO, Comparator.nullsFirst(Comparator.naturalOrder()));
  
  static int ZQ(Zmy8 paramZmy81, Zmy8 paramZmy82) {
    return ZO.compare(paramZmy81, paramZmy82);
  }
  
  static boolean Zv(Zmy8 paramZmy8, Object paramObject) {
    if (paramObject == null || paramZmy8.getClass() != paramObject.getClass())
      return false; 
    Zmy8 zmy8 = (Zmy8)paramObject;
    return (paramZmy8.ZlM() == zmy8.ZlM() && paramZmy8.Zl5() == zmy8.Zl5() && Objects.equals(paramZmy8.Zlg(), zmy8.Zlg()) && Objects.equals(paramZmy8.ZlU(), zmy8.ZlU()) && Objects.equals(paramZmy8.ZlO(), zmy8.ZlO()));
  }
  
  static int ZC(Zmy8 paramZmy8) {
    int i = Zmks.ZS();
    if (Zbqc.Zwu() == null)
      Zmks.ZS(++i); 
    return Objects.hash(new Object[] { Boolean.valueOf(paramZmy8.ZlM()), Integer.valueOf(paramZmy8.Zl5()), paramZmy8.Zlg(), paramZmy8.ZlU(), paramZmy8.ZlO() });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmzx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */