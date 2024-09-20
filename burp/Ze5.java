package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ze5 implements Zlo1 {
  public void ZJ(Zes3 paramZes3) {
    Zkdn zkdn = new Zkdn(paramZes3.Zq());
    Iterator<Zb3t> iterator = zkdn.iterator();
    Zbqc[] arrayOfZbqc = Zk5.ZF();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      if (zkdn.ZX(zb3t))
        continue; 
      Zkge zkge = new Zkge(zb3t);
      for (Zb3t zb3t1 : zkge) {
        if (Zl19.ZD(zb3t1))
          Zi(zb3t, (Zgcs)zb3t1); 
        if (arrayOfZbqc != null)
          break; 
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private void Zi(Zb3t paramZb3t, Zgcs paramZgcs) {
    Ztyn ztyn = Zes8.ZB(paramZgcs);
    if (ztyn != null && ztyn instanceof Zgcj) {
      Zgcj zgcj = (Zgcj)ztyn;
      Zgc7 zgc7 = zgcj.ZM();
      ZL(paramZb3t, zgc7);
      Zf(paramZb3t, zgc7);
    } 
  }
  
  private void Zf(Zb3t paramZb3t, Zgc7 paramZgc7) {
    List<Zb3t> list = paramZgc7.<List>ZO(Zxc6.FunctionCallers);
    if (list == null) {
      list = new ArrayList(1);
      paramZgc7.Zm(Zxc6.FunctionCallers, list);
    } 
    list.add(paramZb3t);
  }
  
  private void ZL(Zb3t paramZb3t, Zgc7 paramZgc7) {
    List<ArrayList<Zgc7>> list = paramZb3t.<List>ZO(Zxc6.FunctionCalls);
    if (list == null) {
      list = new ArrayList(1);
      paramZb3t.Zm(Zxc6.FunctionCalls, list);
    } 
    ArrayList<Zgc7> arrayList = new ArrayList(1);
    arrayList.add(paramZgc7);
    list.add(arrayList);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */