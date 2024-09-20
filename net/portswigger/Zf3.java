package net.portswigger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zf3 {
  private final String Zl;
  
  public Zf3(String paramString) {
    this.Zl = paramString;
  }
  
  public Map<Zba, List<Zgo>> ZU() {
    List<Zrz1> list = (List)(new Zfy(this.Zl)).Zv().stream().filter(Zf3::lambda$parse$0).collect(Collectors.toList());
    Map<Zba, List<Zrz1>> map = Zh(list);
    return Zr(map);
  }
  
  private Map<Zba, List<Zgo>> Zr(Map<Zba, List<Zrz1>> paramMap) {
    Map<Zba, List<Zgo>> map = ZI();
    paramMap.forEach(map::lambda$consolidate$2);
    return map;
  }
  
  private Map<Zba, List<Zrz1>> Zh(List<Zrz1> paramList) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    String[] arrayOfString = Zki.Zl();
    int i = ZU(paramList);
    try {
      if (i != -1) {
        try {
          hashMap.put(Zba.SERVER, paramList.subList(0, i));
          hashMap.put(Zba.PATH, paramList.subList(i, paramList.size()));
          if (arrayOfString == null) {
            hashMap.put(Zba.PATH, paramList);
            return (Map)hashMap;
          } 
        } catch (Zki zki) {
          throw a(null);
        } 
        return (Map)hashMap;
      } 
    } catch (Zki zki) {
      throw a(null);
    } 
    hashMap.put(Zba.PATH, paramList);
    return (Map)hashMap;
  }
  
  private int ZU(List<Zrz1> paramList) {
    Set set = (Set)Stream.<Zkt>of(new Zkt[] { Zkt.PROTOCOL, Zkt.HOST, Zkt.PORT }).collect(Collectors.toSet());
    int i = paramList.size() - 1;
    String[] arrayOfString = Zki.Zl();
    while (i > 0) {
      Zrz1 zrz1 = paramList.get(i);
      try {
        if (set.contains(zrz1.Zg()))
          return i + 1; 
      } catch (Zki zki) {
        throw a(null);
      } 
      i--;
      if (arrayOfString == null)
        break; 
    } 
    return -1;
  }
  
  private Map<Zba, List<Zgo>> ZI() {
    HashMap<Object, Object> hashMap = new HashMap<>();
    hashMap.put(Zba.SERVER, new ArrayList());
    hashMap.put(Zba.PATH, new ArrayList());
    return (Map)hashMap;
  }
  
  private static void lambda$consolidate$2(Map paramMap, Zba paramZba, List paramList) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7: checkcast java/util/List
    //   10: astore_3
    //   11: new java/lang/StringBuilder
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #4
    //   20: aload_2
    //   21: aload #4
    //   23: aload_3
    //   24: <illegal opcode> accept : (Ljava/lang/StringBuilder;Ljava/util/List;)Ljava/util/function/Consumer;
    //   29: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   34: aload #4
    //   36: invokevirtual length : ()I
    //   39: ifle -> 69
    //   42: aload_3
    //   43: new net/portswigger/Zgo
    //   46: dup
    //   47: aload #4
    //   49: invokevirtual toString : ()Ljava/lang/String;
    //   52: iconst_0
    //   53: invokespecial <init> : (Ljava/lang/String;Z)V
    //   56: invokeinterface add : (Ljava/lang/Object;)Z
    //   61: pop
    //   62: goto -> 69
    //   65: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   68: athrow
    //   69: return
    // Exception table:
    //   from	to	target	type
    //   20	62	65	net/portswigger/Zki
  }
  
  private static void lambda$consolidate$1(StringBuilder paramStringBuilder, List<Zgo> paramList, Zrz1 paramZrz1) {
    String[] arrayOfString = Zki.Zl();
    try {
      if (paramZrz1.Zn()) {
        try {
          if (paramStringBuilder.length() > 0) {
            paramList.add(new Zgo(paramStringBuilder.toString(), false));
            paramStringBuilder.delete(0, paramStringBuilder.length());
          } 
        } catch (Zki zki) {
          throw a(null);
        } 
        try {
          paramList.add(new Zgo(paramZrz1.ZD(), paramZrz1.Zn()));
          if (arrayOfString == null) {
            paramStringBuilder.append(paramZrz1.ZD());
            return;
          } 
        } catch (Zki zki) {
          throw a(null);
        } 
        return;
      } 
    } catch (Zki zki) {
      throw a(null);
    } 
    paramStringBuilder.append(paramZrz1.ZD());
  }
  
  private static boolean lambda$parse$0(Zrz1 paramZrz1) {
    try {
    
    } catch (Zki zki) {
      throw a(null);
    } 
    return (paramZrz1.Zg() != Zkt.PARAM_DELIM);
  }
  
  private static Zki a(Zki paramZki) {
    return paramZki;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zf3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */