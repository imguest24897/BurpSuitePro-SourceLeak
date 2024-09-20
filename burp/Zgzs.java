package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Zgzs {
  private static final Map<Class<?>, List<Class<?>>> ZQ = new HashMap<>();
  
  private final boolean Zo;
  
  Zgzs(boolean paramBoolean) {
    this.Zo = paramBoolean;
  }
  
  List<Class<?>> Zh(Class<?> paramClass) {
    return this.Zo ? Zd(paramClass) : List.<Class<?>>of(paramClass);
  }
  
  List<Class<?>> ZF(Class<?> paramClass, Set<Class<?>> paramSet) {
    String str = Zm6x.Ze();
    if (this.Zo) {
      ArrayList<Class<?>> arrayList = new ArrayList();
      for (Class<?> clazz : paramSet) {
        if (paramClass.isAssignableFrom(clazz))
          arrayList.add(clazz); 
        if (str == null)
          break; 
      } 
      return arrayList;
    } 
    return List.of(paramClass);
  }
  
  private static List<Class<?>> Zd(Class<?> paramClass) {
    // Byte code:
    //   0: invokestatic Ze : ()Ljava/lang/String;
    //   3: getstatic burp/Zgzs.ZQ : Ljava/util/Map;
    //   6: dup
    //   7: astore_2
    //   8: monitorenter
    //   9: astore_1
    //   10: getstatic burp/Zgzs.ZQ : Ljava/util/Map;
    //   13: aload_0
    //   14: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   19: checkcast java/util/List
    //   22: astore_3
    //   23: aload_3
    //   24: ifnonnull -> 83
    //   27: new java/util/ArrayList
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: astore_3
    //   35: aload_0
    //   36: astore #4
    //   38: aload #4
    //   40: ifnull -> 72
    //   43: aload_3
    //   44: aload #4
    //   46: invokeinterface add : (Ljava/lang/Object;)Z
    //   51: pop
    //   52: aload_3
    //   53: aload #4
    //   55: invokevirtual getInterfaces : ()[Ljava/lang/Class;
    //   58: invokestatic Ze : (Ljava/util/List;[Ljava/lang/Class;)V
    //   61: aload #4
    //   63: invokevirtual getSuperclass : ()Ljava/lang/Class;
    //   66: astore #4
    //   68: aload_1
    //   69: ifnonnull -> 38
    //   72: getstatic burp/Zgzs.ZQ : Ljava/util/Map;
    //   75: aload_0
    //   76: aload_3
    //   77: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   82: pop
    //   83: aload_3
    //   84: aload_2
    //   85: monitorexit
    //   86: areturn
    //   87: astore #5
    //   89: aload_2
    //   90: monitorexit
    //   91: aload #5
    //   93: athrow
    // Exception table:
    //   from	to	target	type
    //   10	86	87	finally
    //   87	91	87	finally
  }
  
  private static void Ze(List<Class<?>> paramList, Class<?>[] paramArrayOfClass) {
    Class<?>[] arrayOfClass = paramArrayOfClass;
    String str = Zm6x.Ze();
    int i = arrayOfClass.length;
    byte b = 0;
    while (b < i) {
      Class<?> clazz = arrayOfClass[b];
      if (!paramList.contains(clazz)) {
        paramList.add(clazz);
        Ze(paramList, clazz.getInterfaces());
      } 
      b++;
      if (str == null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgzs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */