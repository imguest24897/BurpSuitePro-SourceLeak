package com.fasterxml.Zoz;

import com.fasterxml.Zh.Zp;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Ziw implements Zij, Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final Zij ZC;
  
  protected Map<Zp, Class<?>> ZW;
  
  public Ziw(Zij paramZij) {
    this.ZC = paramZij;
  }
  
  public void ZU(Map<Class<?>, Class<?>> paramMap) {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: ifnull -> 17
    //   8: aload_1
    //   9: invokeinterface isEmpty : ()Z
    //   14: ifeq -> 26
    //   17: aload_0
    //   18: aconst_null
    //   19: putfield ZW : Ljava/util/Map;
    //   22: iload_2
    //   23: ifeq -> 115
    //   26: new java/util/HashMap
    //   29: dup
    //   30: aload_1
    //   31: invokeinterface size : ()I
    //   36: invokespecial <init> : (I)V
    //   39: astore_3
    //   40: aload_1
    //   41: invokeinterface entrySet : ()Ljava/util/Set;
    //   46: invokeinterface iterator : ()Ljava/util/Iterator;
    //   51: astore #4
    //   53: aload #4
    //   55: invokeinterface hasNext : ()Z
    //   60: ifeq -> 110
    //   63: aload #4
    //   65: invokeinterface next : ()Ljava/lang/Object;
    //   70: checkcast java/util/Map$Entry
    //   73: astore #5
    //   75: aload_3
    //   76: new com/fasterxml/Zh/Zp
    //   79: dup
    //   80: aload #5
    //   82: invokeinterface getKey : ()Ljava/lang/Object;
    //   87: checkcast java/lang/Class
    //   90: invokespecial <init> : (Ljava/lang/Class;)V
    //   93: aload #5
    //   95: invokeinterface getValue : ()Ljava/lang/Object;
    //   100: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   105: pop
    //   106: iload_2
    //   107: ifeq -> 53
    //   110: aload_0
    //   111: aload_3
    //   112: putfield ZW : Ljava/util/Map;
    //   115: return
  }
  
  public void Zt(Class<?> paramClass1, Class<?> paramClass2) {
    if (this.ZW == null)
      this.ZW = new HashMap<>(); 
    this.ZW.put(new Zp(paramClass1), paramClass2);
  }
  
  public Class<?> ZL(Class<?> paramClass) {
    Class<?> clazz = (this.ZC == null) ? null : this.ZC.ZL(paramClass);
    if (clazz == null && this.ZW != null)
      clazz = this.ZW.get(new Zp(paramClass)); 
    return clazz;
  }
  
  public boolean ZY() {
    if (this.ZW == null) {
      if (this.ZC == null)
        return false; 
      if (this.ZC instanceof Ziw)
        return ((Ziw)this.ZC).ZY(); 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Ziw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */