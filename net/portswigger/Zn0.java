package net.portswigger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Zn0 implements Zex {
  private final int ZP;
  
  private final Map<String, String> Zs;
  
  private final List<Zn8> ZJ;
  
  private Zn0(int paramInt, Map<String, String> paramMap, List<Zn8> paramList) {
    this.ZP = paramInt;
    TreeMap<String, String> treeMap = new TreeMap<>(paramMap);
    ArrayList<Zn8> arrayList = new ArrayList<>(paramList);
    this.Zs = Collections.unmodifiableMap(treeMap);
    this.ZJ = Collections.unmodifiableList(arrayList);
  }
  
  public int Zb() {
    return this.ZP;
  }
  
  public Map<String, String> ZA() {
    return this.Zs;
  }
  
  public List<Zn8> Zd() {
    return this.ZJ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zn0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */