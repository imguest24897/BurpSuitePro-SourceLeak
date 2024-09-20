package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Zeqy {
  private static Zbqc[] ZA;
  
  public void Zp(Zb3t paramZb3t1, Zb3t paramZb3t2) {
    Zbqc[] arrayOfZbqc = ZR();
    if (ZI(paramZb3t1, paramZb3t2))
      return; 
    Zg(paramZb3t1);
    ArrayList<Zb3t> arrayList = new ArrayList();
    ZZ(paramZb3t1, paramZb3t2, arrayList);
    for (Zb3t zb3t : arrayList) {
      Ze(zb3t, paramZb3t2, paramZb3t1);
      if (arrayOfZbqc != null)
        break; 
    } 
    Zm(paramZb3t1, paramZb3t2);
    ZE(paramZb3t1);
  }
  
  private boolean ZI(Zb3t paramZb3t1, Zb3t paramZb3t2) {
    List list = paramZb3t1.<List>ZO(Zxc6.ReachabilityAnalysisDoneFor);
    return (list != null && list.contains(paramZb3t2));
  }
  
  private void Zm(Zb3t paramZb3t1, Zb3t paramZb3t2) {
    List<Zb3t> list = paramZb3t1.<List>ZO(Zxc6.ReachabilityAnalysisDoneFor);
    if (list == null) {
      list = new ArrayList(1);
      paramZb3t1.Zm(Zxc6.ReachabilityAnalysisDoneFor, list);
    } 
    list.add(paramZb3t2);
  }
  
  private void ZZ(Zb3t paramZb3t1, Zb3t paramZb3t2, List<Zb3t> paramList) {
    Zkd_ zkd_ = new Zkd_(paramZb3t1);
    Iterator<Zb3t> iterator = zkd_.iterator();
    Zbqc[] arrayOfZbqc = ZR();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      if (zb3t == paramZb3t2)
        paramList.add(zb3t); 
      List list = zb3t.<List>ZO(Zxc6.FunctionCalls);
      if (list != null) {
        boolean bool = false;
        for (List list1 : list) {
          for (Zgc7 zgc7 : list1) {
            Set set = zgc7.<Set>ZO(Zxc6.ReachableNodes);
            if (set != null && !set.isEmpty()) {
              for (Zb3t zb3t1 : set) {
                if (zb3t1 == paramZb3t2) {
                  paramList.add(zb3t);
                  bool = true;
                  if (arrayOfZbqc != null)
                    continue; 
                  break;
                } 
                continue;
                if (arrayOfZbqc != null)
                  break; 
              } 
              if (bool)
                break; 
            } 
            if (arrayOfZbqc != null)
              break; 
          } 
          if (bool || arrayOfZbqc != null)
            break; 
        } 
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private void Ze(Zb3t paramZb3t1, Zb3t paramZb3t2, Zb3t paramZb3t3) {
    Zkr1<Zkqc> zkr1 = new Zkr1();
    zkr1.Zy(new Zkqc(this, paramZb3t1, 0));
    Zbqc[] arrayOfZbqc = ZR();
    while (zkr1.ZP() != null) {
      Zkqc zkqc = zkr1.Zc();
      paramZb3t1 = zkqc.ZI();
      int i = zkqc.ZT();
      if (Zl19.Zb(paramZb3t1) || Zl19.ZG(paramZb3t1))
        continue; 
      Map<Object, Object> map = paramZb3t1.<Map>ZO(Zxc6.ExecutionCanReach);
      if (map == null) {
        map = new HashMap<>(1);
        paramZb3t1.Zm(Zxc6.ExecutionCanReach, map);
      } 
      Integer integer = (Integer)map.get(paramZb3t2);
      i += Zs(paramZb3t1, paramZb3t3);
      if (integer == null || i < integer.intValue()) {
        map.put(paramZb3t2, Integer.valueOf(i));
        List list = paramZb3t1.<List>ZO(Zxc6.ReverseExecutionHops);
        if (list != null) {
          i++;
          for (Zb3t zb3t : list) {
            zkr1.Zy(new Zkqc(this, zb3t, i));
            if (arrayOfZbqc != null)
              break; 
          } 
        } 
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private int Zs(Zb3t paramZb3t1, Zb3t paramZb3t2) {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: getstatic burp/Zxc6.FunctionCalls : Lburp/Zxc6;
    //   8: invokeinterface ZO : (Lburp/Zxc6;)Ljava/lang/Object;
    //   13: checkcast java/util/List
    //   16: astore #4
    //   18: aload #4
    //   20: ifnonnull -> 25
    //   23: iconst_0
    //   24: ireturn
    //   25: iconst_0
    //   26: istore #5
    //   28: aload #4
    //   30: invokeinterface iterator : ()Ljava/util/Iterator;
    //   35: astore #6
    //   37: aload #6
    //   39: invokeinterface hasNext : ()Z
    //   44: ifeq -> 92
    //   47: aload #6
    //   49: invokeinterface next : ()Ljava/lang/Object;
    //   54: checkcast java/util/List
    //   57: astore #7
    //   59: aload #7
    //   61: aload_2
    //   62: invokeinterface contains : (Ljava/lang/Object;)Z
    //   67: ifeq -> 81
    //   70: iload #5
    //   72: ldc 1000000
    //   74: iadd
    //   75: istore #5
    //   77: aload_3
    //   78: ifnull -> 88
    //   81: iload #5
    //   83: ldc 10000000
    //   85: iadd
    //   86: istore #5
    //   88: aload_3
    //   89: ifnull -> 37
    //   92: iload #5
    //   94: ireturn
  }
  
  private void Zg(Zb3t paramZb3t) {
    Zkdn zkdn = new Zkdn(paramZb3t);
    Iterator<Zb3t> iterator = zkdn.iterator();
    Zbqc[] arrayOfZbqc = ZR();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      List list = zb3t.<List>ZO(Zxc6.ExecutionHops);
      for (Zb3t zb3t1 : list) {
        Zc(zb3t1, zb3t);
        if (arrayOfZbqc != null)
          break; 
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private void ZE(Zb3t paramZb3t) {
    Zkdn zkdn = new Zkdn(paramZb3t);
    Iterator<Zb3t> iterator = zkdn.iterator();
    Zbqc[] arrayOfZbqc = ZR();
    while (iterator.hasNext()) {
      Zb3t zb3t = iterator.next();
      zb3t.Zw(Zxc6.ReverseExecutionHops);
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private void Zc(Zb3t paramZb3t1, Zb3t paramZb3t2) {
    List<Zb3t> list = paramZb3t1.<List>ZO(Zxc6.ReverseExecutionHops);
    if (list == null) {
      list = new ArrayList(1);
      paramZb3t1.Zm(Zxc6.ReverseExecutionHops, list);
    } 
    list.add(paramZb3t2);
  }
  
  public static void ZD(Zbqc[] paramArrayOfZbqc) {
    ZA = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZR() {
    return ZA;
  }
  
  static {
    if (ZR() != null)
      ZD(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeqy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */