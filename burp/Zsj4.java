package burp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Zsj4 {
  private final Set<String> ZX = new HashSet<>();
  
  public boolean ZH(Zer0 paramZer0) {
    return !this.ZX.add(paramZer0.Zx() + paramZer0.Zx());
  }
  
  Map<Integer, List<Zmaj>> ZW(Map<Integer, List<Zmaj>> paramMap) {
    // Byte code:
    //   0: new java/util/HashMap
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZT : ()I
    //   11: aload_1
    //   12: invokeinterface keySet : ()Ljava/util/Set;
    //   17: invokeinterface iterator : ()Ljava/util/Iterator;
    //   22: astore #4
    //   24: istore_2
    //   25: aload #4
    //   27: invokeinterface hasNext : ()Z
    //   32: ifeq -> 228
    //   35: aload #4
    //   37: invokeinterface next : ()Ljava/lang/Object;
    //   42: checkcast java/lang/Integer
    //   45: astore #5
    //   47: aload_3
    //   48: aload #5
    //   50: new java/util/ArrayList
    //   53: dup
    //   54: invokespecial <init> : ()V
    //   57: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   62: pop
    //   63: aload_1
    //   64: aload #5
    //   66: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   71: checkcast java/util/List
    //   74: invokeinterface iterator : ()Ljava/util/Iterator;
    //   79: astore #6
    //   81: aload #6
    //   83: invokeinterface hasNext : ()Z
    //   88: ifeq -> 224
    //   91: aload #6
    //   93: invokeinterface next : ()Ljava/lang/Object;
    //   98: checkcast burp/Zmaj
    //   101: astore #7
    //   103: aload_3
    //   104: aload #5
    //   106: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   111: checkcast java/util/List
    //   114: astore #8
    //   116: aload #7
    //   118: getfield ZO : Lburp/Zer0;
    //   121: invokeinterface ZO : ()I
    //   126: iconst_1
    //   127: if_icmpeq -> 144
    //   130: aload #8
    //   132: aload #7
    //   134: invokeinterface add : (Ljava/lang/Object;)Z
    //   139: pop
    //   140: iload_2
    //   141: ifne -> 81
    //   144: aload_0
    //   145: aload #8
    //   147: aload #7
    //   149: invokevirtual Zq : (Ljava/util/List;Lburp/Zmaj;)I
    //   152: istore #9
    //   154: aload_0
    //   155: aload #8
    //   157: aload #7
    //   159: invokevirtual ZU : (Ljava/util/List;Lburp/Zmaj;)I
    //   162: istore #10
    //   164: iload #9
    //   166: iconst_2
    //   167: if_icmpne -> 189
    //   170: iload #10
    //   172: ifne -> 189
    //   175: aload_0
    //   176: aload #8
    //   178: aload #7
    //   180: invokevirtual ZK : (Ljava/util/List;Lburp/Zmaj;)Z
    //   183: ifeq -> 189
    //   186: goto -> 81
    //   189: iload #9
    //   191: iconst_2
    //   192: if_icmpne -> 210
    //   195: iload #10
    //   197: iconst_1
    //   198: if_icmpne -> 210
    //   201: aload_0
    //   202: aload_3
    //   203: aload #5
    //   205: aload #7
    //   207: invokevirtual Zn : (Ljava/util/Map;Ljava/lang/Integer;Lburp/Zmaj;)V
    //   210: aload #8
    //   212: aload #7
    //   214: invokeinterface add : (Ljava/lang/Object;)Z
    //   219: pop
    //   220: iload_2
    //   221: ifne -> 81
    //   224: iload_2
    //   225: ifne -> 25
    //   228: aload_3
    //   229: areturn
  }
  
  private boolean ZK(List<Zmaj> paramList, Zmaj paramZmaj) {
    int i = Zlp9.ZT();
    for (Zmaj zmaj : paramList) {
      if (zmaj.ZO.ZA() == paramZmaj.ZO.ZA())
        return true; 
      if (i == 0)
        break; 
    } 
    return false;
  }
  
  private void Zn(Map<Integer, List<Zmaj>> paramMap, Integer paramInteger, Zmaj paramZmaj) {
    int i = Zlp9.Zr();
    Iterator<Zmaj> iterator = ((List)paramMap.get(paramInteger)).iterator();
    while (iterator.hasNext()) {
      Zmaj zmaj = iterator.next();
      if (!zmaj.ZO.Zx().equals(paramZmaj.ZO.Zx()) && zmaj.Zy.equals(paramZmaj.Zy) && zmaj.ZO.ZA() == paramZmaj.ZO.ZA()) {
        iterator.remove();
        if (i != 0)
          continue; 
        break;
      } 
      continue;
      if (i != 0)
        break; 
    } 
  }
  
  private int Zq(List<Zmaj> paramList, Zmaj paramZmaj) {
    byte b = 0;
    Iterator<Zmaj> iterator = paramList.iterator();
    int i = Zlp9.Zr();
    while (iterator.hasNext()) {
      Zmaj zmaj = iterator.next();
      if (zmaj.ZO.ZO() != 1)
        continue; 
      if (zmaj.Zy.equals(paramZmaj.Zy))
        b++; 
      if (i != 0)
        break; 
    } 
    return b;
  }
  
  private int ZU(List<Zmaj> paramList, Zmaj paramZmaj) {
    byte b = 0;
    Iterator<Zmaj> iterator = paramList.iterator();
    int i = Zlp9.ZT();
    while (iterator.hasNext()) {
      Zmaj zmaj = iterator.next();
      if (zmaj.ZO.ZO() != 1)
        continue; 
      if (zmaj.ZO.Zx().equals(paramZmaj.ZO.Zx()))
        b++; 
      if (i == 0)
        break; 
    } 
    return b;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsj4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */