package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Ztu0 implements Zmdl {
  private final Map<Zro0, List<Zmaj>> Zd = new HashMap<>();
  
  private final Map<Zro0, List<Zmaj>> Zs = new HashMap<>();
  
  private HashMap<Zro0, List<Zmaj>> Zj;
  
  public Iterator<Map.Entry<Zro0, List<Zmaj>>> iterator() {
    // Byte code:
    //   0: aload_0
    //   1: new java/util/HashMap
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: putfield Zj : Ljava/util/HashMap;
    //   11: invokestatic ZX : ()Z
    //   14: aload_0
    //   15: getfield Zd : Ljava/util/Map;
    //   18: invokeinterface entrySet : ()Ljava/util/Set;
    //   23: invokeinterface iterator : ()Ljava/util/Iterator;
    //   28: astore_2
    //   29: istore_1
    //   30: aload_2
    //   31: invokeinterface hasNext : ()Z
    //   36: ifeq -> 153
    //   39: aload_2
    //   40: invokeinterface next : ()Ljava/lang/Object;
    //   45: checkcast java/util/Map$Entry
    //   48: astore_3
    //   49: aload_0
    //   50: getfield Zs : Ljava/util/Map;
    //   53: aload_3
    //   54: invokeinterface getKey : ()Ljava/lang/Object;
    //   59: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   64: checkcast java/util/List
    //   67: astore #4
    //   69: aload #4
    //   71: ifnull -> 100
    //   74: aload_3
    //   75: invokeinterface getValue : ()Ljava/lang/Object;
    //   80: checkcast java/util/List
    //   83: invokeinterface size : ()I
    //   88: aload_0
    //   89: getfield Zs : Ljava/util/Map;
    //   92: invokeinterface size : ()I
    //   97: if_icmple -> 130
    //   100: aload_0
    //   101: getfield Zj : Ljava/util/HashMap;
    //   104: aload_3
    //   105: invokeinterface getKey : ()Ljava/lang/Object;
    //   110: checkcast burp/Zro0
    //   113: aload_3
    //   114: invokeinterface getValue : ()Ljava/lang/Object;
    //   119: checkcast java/util/List
    //   122: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   125: pop
    //   126: iload_1
    //   127: ifeq -> 149
    //   130: aload_0
    //   131: getfield Zj : Ljava/util/HashMap;
    //   134: aload_3
    //   135: invokeinterface getKey : ()Ljava/lang/Object;
    //   140: checkcast burp/Zro0
    //   143: aload #4
    //   145: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   148: pop
    //   149: iload_1
    //   150: ifeq -> 30
    //   153: aload_0
    //   154: getfield Zs : Ljava/util/Map;
    //   157: invokeinterface entrySet : ()Ljava/util/Set;
    //   162: invokeinterface iterator : ()Ljava/util/Iterator;
    //   167: astore_2
    //   168: aload_2
    //   169: invokeinterface hasNext : ()Z
    //   174: ifeq -> 235
    //   177: aload_2
    //   178: invokeinterface next : ()Ljava/lang/Object;
    //   183: checkcast java/util/Map$Entry
    //   186: astore_3
    //   187: aload_0
    //   188: getfield Zd : Ljava/util/Map;
    //   191: aload_3
    //   192: invokeinterface getKey : ()Ljava/lang/Object;
    //   197: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   202: ifnonnull -> 231
    //   205: aload_0
    //   206: getfield Zj : Ljava/util/HashMap;
    //   209: aload_3
    //   210: invokeinterface getKey : ()Ljava/lang/Object;
    //   215: checkcast burp/Zro0
    //   218: aload_3
    //   219: invokeinterface getValue : ()Ljava/lang/Object;
    //   224: checkcast java/util/List
    //   227: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   230: pop
    //   231: iload_1
    //   232: ifeq -> 168
    //   235: aload_0
    //   236: getfield Zj : Ljava/util/HashMap;
    //   239: invokevirtual entrySet : ()Ljava/util/Set;
    //   242: invokeinterface iterator : ()Ljava/util/Iterator;
    //   247: areturn
  }
  
  public void Zr(Zmaj paramZmaj) {
    boolean bool = Zxor.ZM();
    if (Zlp9.Za(Ztwf.Zx, paramZmaj.Zy.ZN())) {
      Zh(paramZmaj, this.Zs);
      if (!bool) {
        if (Zlp9.Za(Ztwo.ZE, paramZmaj.Zy.ZN()))
          Zh(paramZmaj, this.Zd); 
        return;
      } 
      return;
    } 
    if (Zlp9.Za(Ztwo.ZE, paramZmaj.Zy.ZN()))
      Zh(paramZmaj, this.Zd); 
  }
  
  public Zlp9 Zu(Zxs7 paramZxs7) {
    return ((Zmaj)((List)this.Zj.get(paramZxs7.Zl())).get(0)).Zy.ZN();
  }
  
  private void Zh(Zmaj paramZmaj, Map<Zro0, List<Zmaj>> paramMap) {
    Zro0 zro0 = paramZmaj.Zy.Zk();
    List<Zmaj> list = paramMap.get(zro0);
    boolean bool = Zxor.ZX();
    if (list == null) {
      list = new ArrayList();
      paramMap.put(zro0, list);
    } 
    for (Zmaj zmaj : list) {
      if (zmaj.ZO.ZA() == paramZmaj.ZO.ZA())
        return; 
      if (bool)
        break; 
    } 
    list.add(paramZmaj);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztu0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */