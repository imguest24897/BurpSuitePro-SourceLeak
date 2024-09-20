package burp;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import net.portswigger.Zen;
import net.portswigger.Zkb;

public class Zm4n {
  public Zmrn ZG(Zb25... paramVarArgs) {
    EnumSet<E> enumSet = (paramVarArgs.length == 0) ? (EnumSet)EnumSet.<Zb25>allOf(Zb25.class) : (EnumSet)EnumSet.<Enum>copyOf(Arrays.asList((Enum[])paramVarArgs));
    return enumSet::lambda$reportsInteraction$2;
  }
  
  private static boolean lambda$reportsInteraction$2(EnumSet paramEnumSet, Zzvx paramZzvx) {
    Zzvw zzvw = (Zzvw)paramZzvx;
    Zbjl zbjl = zzvw.Zz().ZV();
    boolean bool = false;
    Iterator<Zen> iterator = zzvw.ZP().iterator();
    int[] arrayOfInt = Zmgt.ZK();
    while (iterator.hasNext()) {
      Zen zen = iterator.next();
      List<Zer0> list = zbjl.Ze(zen);
      List list1 = list.stream().filter(paramEnumSet::lambda$reportsInteraction$0).toList();
      if (list1.isEmpty())
        continue; 
      EnumSet<Enum> enumSet = EnumSet.copyOf(list1.stream().map(Zer0::ZA).toList());
      List<Zzbn> list2 = zzvw.Zf();
      byte b = 0;
      while (b < list2.size()) {
        Zzbn zzbn = list2.get(b);
        Zefx zefx = zzbn.ZR();
        if (zefx != null && Zmrn.ZK(zefx, zen) && zzvw.Zb(b, zen, (EnumSet)enumSet)) {
          bool = true;
          Zzz4 zzz4 = new Zzz4(zbjl, zzvw.ZR().Zg(), zzvw.ZX().ZM().Zgv());
          Zewx zewx = zzz4.Ze(zen);
          zzbn.Zg(Zkb.ZG(zewx.Zh()));
          Zkoa zkoa = new Zkoa(zewx, paramZzvx.ZU().Zq(), true, 0L, paramZzvx.ZX().Zod());
          paramZzvx.Zw().Zo(zen);
          List<Zsjh<?>> list3 = list1.stream().flatMap(zkoa::lambda$reportsInteraction$1).toList();
          zzbn.ZM(list3);
        } 
        b++;
        if (arrayOfInt == null)
          break; 
      } 
      if (arrayOfInt == null)
        break; 
    } 
    return bool;
  }
  
  private static Stream lambda$reportsInteraction$1(Zkoa paramZkoa, Zer0 paramZer0) {
    return paramZkoa.Z_(paramZer0).stream();
  }
  
  private static boolean lambda$reportsInteraction$0(EnumSet paramEnumSet, Zer0 paramZer0) {
    return paramEnumSet.contains(paramZer0.ZA());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm4n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */