package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.portswigger.Zlz;
import net.portswigger.Zto;

public class Zmvb implements Iterable<Long> {
  private final boolean Z_;
  
  private final Set<Long> Zn;
  
  static Zmvb ZL(long paramLong, Set<Long> paramSet) {
    if (paramLong == 0L)
      return new Zmvb(true, Collections.emptySet()); 
    if (paramLong == -1L)
      return new Zmvb(false, Collections.emptySet()); 
    HashSet<Long> hashSet = new HashSet();
    hashSet.add(Long.valueOf(paramLong));
    if (paramSet != null)
      hashSet.addAll(paramSet); 
    return new Zmvb(false, hashSet);
  }
  
  public static Zmvb ZX() {
    return new Zmvb(false, Collections.emptySet());
  }
  
  public static Zmvb ZE(String paramString) {
    return ZA(Collections.singleton(paramString));
  }
  
  public static Zmvb ZA(Collection<String> paramCollection) {
    return Zj((Set<Long>)paramCollection.stream().filter(Zlz::Zu).map(Zmvb::lambda$fromLabels$0).map(Integer::longValue).collect(Collectors.toSet()));
  }
  
  private static Zmvb Zj(Set<Long> paramSet) {
    return (paramSet.size() > 10) ? new Zmvb(true, Collections.emptySet()) : new Zmvb(false, paramSet);
  }
  
  private Zmvb(boolean paramBoolean, Set<Long> paramSet) {
    this.Z_ = paramBoolean;
    this.Zn = paramSet;
  }
  
  public Zmvb ZK(Zmvb paramZmvb) {
    HashSet<Long> hashSet = new HashSet<>(this.Zn);
    hashSet.addAll(paramZmvb.Zn);
    return Zj(hashSet);
  }
  
  Zto<Long, Ze68> Ze(Zr_4 paramZr_4) {
    int i = Zkmn.Zp();
    if (this.Z_)
      return Zto.ZM(Long.valueOf(0L), null); 
    if (this.Zn.isEmpty())
      return Zto.ZM(Long.valueOf(-1L), null); 
    Iterator<Long> iterator = iterator();
    long l = ((Long)iterator.next()).longValue();
    if (this.Zn.size() == 1)
      return Zto.ZM(Long.valueOf(l), null); 
    Ze68 ze68 = paramZr_4.<Ze68>ZH(new Zmpk(10));
    while (iterator.hasNext()) {
      ze68.add(iterator.next());
      if (i == 0)
        break; 
    } 
    return Zto.ZM(Long.valueOf(l), ze68);
  }
  
  public Iterator<Long> iterator() {
    return this.Zn.iterator();
  }
  
  public Stream<Long> Zv() {
    return this.Zn.stream();
  }
  
  private static Integer lambda$fromLabels$0(String paramString) {
    return Integer.valueOf((new Zeun()).ZT(paramString).ZS());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmvb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */