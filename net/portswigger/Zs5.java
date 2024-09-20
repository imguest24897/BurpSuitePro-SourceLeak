package net.portswigger;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

abstract class Zs5 implements Zrmu {
  private final Zrz7 Zf;
  
  public final TreeMap<String, Map<Zz0, String>> Zq = new TreeMap<>();
  
  public Zs5(Zrz7 paramZrz7) {
    this.Zf = paramZrz7;
  }
  
  public void ZF(List<Zo3> paramList) {
    Zo3 zo3 = paramList.get(paramList.size() - 1);
    String str = this.Zf.ZO(zo3);
    if (!this.Zq.containsKey(str))
      this.Zq.put(str, new TreeMap<>()); 
    Map<Zz0, String> map = this.Zq.get(str);
    map.put(zo3.ZK, ZN(paramList, zo3, str));
  }
  
  abstract String ZN(List<Zo3> paramList, Zo3 paramZo3, String paramString);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zs5.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */