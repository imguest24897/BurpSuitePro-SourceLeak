package burp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import net.portswigger.Zm2;

class Zeuj {
  private final Map<Zmzk, Byte> Za = new HashMap<>();
  
  private final Set<Zmzk> Zt = new HashSet<>();
  
  void ZW(Zs1a paramZs1a) {
    String[] arrayOfString = Zzxk.Zj();
    if (paramZs1a.Zs == Zzxk.CONNECTION_ESTABLISHED) {
      this.Zt.add(paramZs1a.Zd);
      if (arrayOfString != null) {
        byte b3 = ((Byte)this.Za.getOrDefault(paramZs1a.Zd, Byte.valueOf((byte)0))).byteValue();
        byte b4 = (byte)(paramZs1a.Zs.bitValue | b3);
        this.Za.put(paramZs1a.Zd, Byte.valueOf(b4));
        return;
      } 
      return;
    } 
    byte b1 = ((Byte)this.Za.getOrDefault(paramZs1a.Zd, Byte.valueOf((byte)0))).byteValue();
    byte b2 = (byte)(paramZs1a.Zs.bitValue | b1);
    this.Za.put(paramZs1a.Zd, Byte.valueOf(b2));
  }
  
  void ZV() {
    String[] arrayOfString = Zzxk.Zj();
    int i = this.Zt.size();
    if (i > 0)
      Zm2.Zi(Zv8r.NETWORK_SERVERS_CONNECTED_TO, i); 
    for (Map.Entry<Zzxk, AtomicInteger> entry : Zl().entrySet()) {
      Zm2.Zi(((Zzxk)entry.getKey()).quantityType, ((AtomicInteger)entry.getValue()).get());
      if (arrayOfString != null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zzxk.ZZ(new String[5]); 
  }
  
  private Map<Zzxk, AtomicInteger> Zl() {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Iterator<Byte> iterator = this.Za.values().iterator();
    String[] arrayOfString = Zzxk.Zj();
    while (iterator.hasNext()) {
      Byte byte_ = iterator.next();
      Zzxk[] arrayOfZzxk = Zzxk.values();
      int i = arrayOfZzxk.length;
      byte b = 0;
      while (b < i) {
        Zzxk zzxk = arrayOfZzxk[b];
        if (zzxk.bitValue != 0 && (zzxk.bitValue & byte_.byteValue()) == zzxk.bitValue)
          ((AtomicInteger)hashMap.computeIfAbsent(zzxk, Zeuj::lambda$countEventsTypes$0)).incrementAndGet(); 
        b++;
        if (arrayOfString != null)
          break; 
      } 
      if (arrayOfString != null)
        break; 
    } 
    return (Map)hashMap;
  }
  
  private static AtomicInteger lambda$countEventsTypes$0(Zzxk paramZzxk) {
    return new AtomicInteger();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeuj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */