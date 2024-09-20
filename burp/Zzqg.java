package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public class Zzqg implements Zrny {
  private final Zs2g Zy;
  
  public Zzqg(Zs2g paramZs2g) {
    this.Zy = paramZs2g;
  }
  
  public Ze1 Zm(int paramInt, List<Zrdb> paramList) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Ztbg ztbg = new Ztbg(Zz1h.ZS);
    int i = Zk9k.Zv();
    Objects.requireNonNull(ztbg);
    paramList.forEach(ztbg::Zp);
    hashMap.put(new Zsu3(), ztbg);
    this.Zy.Zp(paramInt, ztbg);
    byte b1 = 0;
    byte b2 = 0;
    byte b3 = 0;
    byte b4 = 0;
    for (Zrdb zrdb : paramList) {
      switch (zrdb.Zaw()) {
        case 4:
          b1++;
        case 3:
          b2++;
        case 2:
          b3++;
        case 1:
          b4++;
          break;
      } 
      continue;
      if (i != 0)
        break; 
    } 
    Zky4 zky4 = new Zky4(Map.of(Byte.valueOf((byte)4), new AtomicInteger(b1), Byte.valueOf((byte)3), new AtomicInteger(b2), Byte.valueOf((byte)2), new AtomicInteger(b3), Byte.valueOf((byte)1), new AtomicInteger(b4)));
    return new Ze1(zky4, (Map)hashMap);
  }
  
  public void Zq(Collection<Zrdb> paramCollection) {}
  
  public void ZP(Collection<Zrdb> paramCollection) {}
  
  public List<Zrdb> Zs(Predicate<Zez3> paramPredicate) {
    return Collections.emptyList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzqg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */