package com.fasterxml.Ze;

import com.fasterxml.Zo.Zv;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zp.Zt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zl {
  private final Zk ZR;
  
  private final List<Zi> Zz = new ArrayList<>();
  
  private final Map<String, Object> ZG = new HashMap<>();
  
  protected Zl(Zk paramZk) {
    this.ZR = paramZk;
  }
  
  public void ZU(Zv paramZv, Zt paramZt) {
    Integer integer = Integer.valueOf(this.Zz.size());
    this.Zz.add(new Zi(paramZv, paramZt));
    Zz(paramZv.ZT(), integer);
    Zz(paramZt.ZF(), integer);
  }
  
  private void Zz(String paramString, Integer paramInteger) {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZG : Ljava/util/Map;
    //   7: aload_1
    //   8: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   13: astore #4
    //   15: astore_3
    //   16: aload #4
    //   18: ifnonnull -> 37
    //   21: aload_0
    //   22: getfield ZG : Ljava/util/Map;
    //   25: aload_1
    //   26: aload_2
    //   27: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   32: pop
    //   33: aload_3
    //   34: ifnull -> 106
    //   37: aload #4
    //   39: instanceof java/util/List
    //   42: ifeq -> 65
    //   45: aload #4
    //   47: checkcast java/util/List
    //   50: astore #5
    //   52: aload #5
    //   54: aload_2
    //   55: invokeinterface add : (Ljava/lang/Object;)Z
    //   60: pop
    //   61: aload_3
    //   62: ifnull -> 106
    //   65: new java/util/LinkedList
    //   68: dup
    //   69: invokespecial <init> : ()V
    //   72: astore #5
    //   74: aload #5
    //   76: aload #4
    //   78: invokeinterface add : (Ljava/lang/Object;)Z
    //   83: pop
    //   84: aload #5
    //   86: aload_2
    //   87: invokeinterface add : (Ljava/lang/Object;)Z
    //   92: pop
    //   93: aload_0
    //   94: getfield ZG : Ljava/util/Map;
    //   97: aload_1
    //   98: aload #5
    //   100: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   105: pop
    //   106: return
  }
  
  public Zoq ZE(Zo8 paramZo8) {
    int i = this.Zz.size();
    Zi[] arrayOfZi = new Zi[i];
    String[] arrayOfString = Z_.ZI();
    byte b = 0;
    while (b < i) {
      Zi zi = this.Zz.get(b);
      String str = zi.ZP();
      Zv zv = paramZo8.ZI(str);
      if (zv != null)
        zi.Zg(zv); 
      arrayOfZi[b] = zi;
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return new Zoq(this.ZR, arrayOfZi, this.ZG, null, null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */