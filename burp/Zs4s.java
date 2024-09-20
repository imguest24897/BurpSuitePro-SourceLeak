package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public final class Zs4s extends Zs44 {
  Zs4s(Zxjt paramZxjt, Zg4y paramZg4y, Zsiv paramZsiv, Zlka paramZlka, Supplier<Integer> paramSupplier, Zmv7 paramZmv7, Zrp6 paramZrp6) {
    super(paramZxjt, paramZg4y, paramZsiv, paramZlka, paramSupplier, paramZmv7, paramZrp6);
  }
  
  protected List<Ztc6> Zw(Ztsv paramZtsv, Zm8l paramZm8l, Zr47 paramZr47, Collection<Zrp0> paramCollection) {
    Zst zst = new Zst(this.Zo, this.ZP, paramCollection, paramZr47, this.Zg, this.Zl);
    List<Ztc6> list1 = zst.Zt(Ztsv.ZM8(), paramZm8l, ((Integer)this.ZT.get()).intValue());
    if (list1.isEmpty())
      return Collections.emptyList(); 
    if (paramZtsv.ZMX())
      return list1; 
    List<Ztc6> list2 = list1.stream().flatMap(paramZtsv::lambda$findShortestPathsToMatchingExits$0).toList();
    return list2.isEmpty() ? list1 : list2;
  }
  
  private static Optional<Ztc6> Zb(Ztc6 paramZtc6, Ztsv paramZtsv) {
    return Zf(paramZtc6, paramZtsv).map(paramZtc6::lambda$truncateToAfterStartLocation$1).filter(Zs4s::lambda$truncateToAfterStartLocation$2).map(Zs4s::lambda$truncateToAfterStartLocation$3);
  }
  
  private static Optional<Integer> Zf(Ztc6 paramZtc6, Ztsv paramZtsv) {
    Zbqc[] arrayOfZbqc = Ztc6.ZG();
    byte b = 0;
    while (b < paramZtc6.Zr()) {
      if (ZA(paramZtc6.ZQ(b), paramZtsv))
        return Optional.of(Integer.valueOf(b)); 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return Optional.empty();
  }
  
  private static boolean ZA(Zxs9 paramZxs9, Ztsv paramZtsv) {
    return (Objects.equals(paramZtsv.ZMY(), paramZxs9.ZXh()) && Objects.equals(paramZtsv.ZMr(), paramZxs9.ZXq()) && Objects.equals(paramZtsv.ZMd(), paramZxs9.ZXL()));
  }
  
  private static Ztc6 lambda$truncateToAfterStartLocation$3(List<Zxs9> paramList) {
    return Ztc6.ZD(((Zxs9)paramList.getFirst()).ZXA(), paramList);
  }
  
  private static boolean lambda$truncateToAfterStartLocation$2(List paramList) {
    return !paramList.isEmpty();
  }
  
  private static List lambda$truncateToAfterStartLocation$1(Ztc6 paramZtc6, Integer paramInteger) {
    return paramZtc6.Zu().skip((paramInteger.intValue() + 1)).toList();
  }
  
  private static Stream lambda$findShortestPathsToMatchingExits$0(Ztsv paramZtsv, Ztc6 paramZtc6) {
    return Zb(paramZtc6, paramZtsv).stream();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs4s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */