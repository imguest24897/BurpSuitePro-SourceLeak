package com.fasterxml.Zj;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Zi extends Zt implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected static final Zi Zt = new Zi(Collections.emptyMap());
  
  protected static final Object ZK = new Object();
  
  protected final Map<?, ?> ZG;
  
  protected transient Map<Object, Object> ZH;
  
  protected Zi(Map<?, ?> paramMap) {
    this.ZG = paramMap;
    this.ZH = null;
  }
  
  protected Zi(Map<?, ?> paramMap, Map<Object, Object> paramMap1) {
    this.ZG = paramMap;
    this.ZH = paramMap1;
  }
  
  public static Zt Zq() {
    return Zt;
  }
  
  public Object ZT(Object paramObject) {
    if (this.ZH != null) {
      Object object = this.ZH.get(paramObject);
      if (object != null)
        return (object == ZK) ? null : object; 
    } 
    return this.ZG.get(paramObject);
  }
  
  public Zt ZQ(Object paramObject1, Object paramObject2) {
    // Byte code:
    //   0: invokestatic ZL : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_2
    //   5: ifnonnull -> 64
    //   8: aload_0
    //   9: getfield ZG : Ljava/util/Map;
    //   12: aload_1
    //   13: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   18: ifeq -> 29
    //   21: getstatic com/fasterxml/Zj/Zi.ZK : Ljava/lang/Object;
    //   24: astore_2
    //   25: aload_3
    //   26: ifnull -> 64
    //   29: aload_0
    //   30: getfield ZH : Ljava/util/Map;
    //   33: ifnull -> 49
    //   36: aload_0
    //   37: getfield ZH : Ljava/util/Map;
    //   40: aload_1
    //   41: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   46: ifne -> 51
    //   49: aload_0
    //   50: areturn
    //   51: aload_0
    //   52: getfield ZH : Ljava/util/Map;
    //   55: aload_1
    //   56: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   61: pop
    //   62: aload_0
    //   63: areturn
    //   64: aload_0
    //   65: getfield ZH : Ljava/util/Map;
    //   68: ifnonnull -> 78
    //   71: aload_0
    //   72: aload_1
    //   73: aload_2
    //   74: invokevirtual Zg : (Ljava/lang/Object;Ljava/lang/Object;)Lcom/fasterxml/Zj/Zt;
    //   77: areturn
    //   78: aload_0
    //   79: getfield ZH : Ljava/util/Map;
    //   82: aload_1
    //   83: aload_2
    //   84: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   89: pop
    //   90: aload_0
    //   91: areturn
  }
  
  protected Zt Zg(Object paramObject1, Object paramObject2) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    if (paramObject2 == null)
      paramObject2 = ZK; 
    hashMap.put(paramObject1, paramObject2);
    return new Zi(this.ZG, hashMap);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zj\Zi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */