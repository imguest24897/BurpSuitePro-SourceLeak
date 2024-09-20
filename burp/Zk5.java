package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Zk5 implements Zm_c {
  private final Map<String, List<Zb3t>> Zk = new HashMap<>();
  
  private final Zt3b ZR = new Zt3b(this);
  
  private static Zbqc[] ZF;
  
  public void Zp(Zes3 paramZes3) {
    Zgca zgca = Zt();
    Zb3t zb3t = paramZes3.Zq();
    Zbqc[] arrayOfZbqc = ZF();
    List<Zb3t> list = Zo(Collections.singletonList(zb3t), zb3t);
    for (Zb3t zb3t1 : list) {
      Zv(zb3t1, zgca);
      if (arrayOfZbqc != null) {
        Zbqc.Zr(new Zbqc[2]);
        break;
      } 
    } 
    Zs(paramZes3);
  }
  
  private void Zs(Zes3 paramZes3) {
    Zl3x zl3x = new Zl3x(paramZes3.Zq());
    Iterator<Zb3t> iterator = zl3x.iterator();
    Zbqc[] arrayOfZbqc = ZF();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      if (zb3t.ZO(Zxc6.ExecutionHops) == null)
        this.ZR.Zp(zb3t).ZH(new ArrayList<>(0)); 
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  public List<Zb3t> Zo(List<Zb3t> paramList, Zb3t paramZb3t) {
    byte b = 0;
    List<Zb3t> list = new ArrayList(1);
    Zbqc[] arrayOfZbqc = ZF();
    list.addAll(paramList);
    while (!list.isEmpty() && b < paramZb3t.ZC().size()) {
      Zb3t zb3t = paramZb3t.ZC().get(b++);
      if (Zi(zb3t))
        list = Zf(list, zb3t); 
      if (arrayOfZbqc != null)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      ZD(new Zbqc[1]); 
    return list;
  }
  
  public List<Zb3t> Zf(List<Zb3t> paramList, Zb3t paramZb3t) {
    Zttg zttg = this.ZR.Zp(paramZb3t);
    return zttg.ZH(paramList);
  }
  
  public boolean Zi(Zb3t paramZb3t) {
    Zbqc[] arrayOfZbqc = ZF();
    if (Zl19.ZC(paramZb3t)) {
      Zgcc zgcc = (Zgcc)paramZb3t;
      return ((zgcc.ZK()).ZE == Zgho.OPENING_BRACE || (zgcc.ZK()).ZE == Zgho.CLOSING_BRACE) ? false : ((arrayOfZbqc != null) ? (!Zl19.Zw(paramZb3t)) : true);
    } 
    return !Zl19.Zw(paramZb3t);
  }
  
  public void Zv(Zb3t paramZb3t1, Zb3t paramZb3t2) {
    List<Zb3t> list = paramZb3t1.<List>ZO(Zxc6.ExecutionHops);
    if (list == null) {
      list = new ArrayList(1);
      paramZb3t1.Zm(Zxc6.ExecutionHops, list);
    } 
    list.add(paramZb3t2);
  }
  
  public Zgca Zt() {
    return new Zgca(null, new ArrayList<>(0));
  }
  
  public Map<String, List<Zb3t>> ZG() {
    return this.Zk;
  }
  
  public static void ZD(Zbqc[] paramArrayOfZbqc) {
    ZF = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZF() {
    return ZF;
  }
  
  static {
    if (ZF() != null)
      ZD(new Zbqc[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */