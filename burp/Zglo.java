package burp;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public final class Zglo implements Iterable<Zzml> {
  private final int Zp;
  
  private final List<Zzml> ZG;
  
  private final Object Zn;
  
  private int ZK;
  
  public Zglo(int paramInt, List<Zzml> paramList) {
    this.Zp = paramInt;
    this.ZG = paramList;
    this.ZK = 0;
    this.Zn = new Object();
  }
  
  public boolean Zp() {
    return (this.Zp > 0);
  }
  
  public int ZK() {
    return this.Zp;
  }
  
  public boolean Zb() {
    synchronized (this.Zn) {
      return !this.ZG.isEmpty();
    } 
  }
  
  public Optional<Zzml> ZD() {
    synchronized (this.Zn) {
      return (this.ZK < this.ZG.size()) ? Optional.<Zzml>of(this.ZG.get(this.ZK++)) : Optional.<Zzml>empty();
    } 
  }
  
  @NotNull
  public Iterator<Zzml> iterator() {
    return this.ZG.iterator();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zglo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */