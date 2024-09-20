package burp;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Zr34 {
  private final Map<Zs70, List<Zsd7>> ZC = new HashMap<>();
  
  private Zgo7 ZK;
  
  public void Zm(Zs70 paramZs70, Zg29 paramZg29, Zt3u paramZt3u) {
    Ze(paramZs70, Zgo7.Zq(paramZt3u, paramZg29));
  }
  
  public void ZE(Zs70 paramZs70, Zg29 paramZg29, Zt3u paramZt3u) {
    Ze(paramZs70, Zgo7.Zr(paramZt3u, paramZg29));
  }
  
  public void ZM(Zs70 paramZs70, Zg29 paramZg29, Zt3u paramZt3u) {
    ZG(paramZs70, Zgo7.Zq(paramZt3u, paramZg29));
  }
  
  public void ZT(Zs70 paramZs70, Zg29 paramZg29, Zt3u paramZt3u) {
    ZG(paramZs70, Zgo7.Zr(paramZt3u, paramZg29));
  }
  
  public void Zt(Zt3u paramZt3u) {
    this.ZK = Zgo7.Zq(paramZt3u, Zg29.USER);
  }
  
  public Zgo7 Zh() {
    return this.ZK;
  }
  
  public List<Zsd7> ZV(Zs70 paramZs70) {
    return this.ZC.getOrDefault(paramZs70, new LinkedList<>());
  }
  
  private void Ze(Zs70 paramZs70, Zgo7 paramZgo7) {
    Zs(new Zsd7(paramZs70, paramZgo7, true));
  }
  
  private void ZG(Zs70 paramZs70, Zgo7 paramZgo7) {
    Zs(new Zsd7(paramZs70, paramZgo7, false));
  }
  
  private void Zs(Zsd7 paramZsd7) {
    Zs70 zs70 = paramZsd7.ZOA();
    List<Zsd7> list = ZV(zs70);
    list.add(paramZsd7);
    this.ZC.put(zs70, list);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr34.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */