package com.fasterxml.Zoz;

import com.fasterxml.Zm.Z_;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Zqb extends Zie {
  protected final HashMap<Class<?>, Annotation> Zh = new HashMap<>();
  
  public Zqb(Object paramObject, Class<?> paramClass1, Annotation paramAnnotation1, Class<?> paramClass2, Annotation paramAnnotation2) {
    super(paramObject);
    this.Zh.put(paramClass1, paramAnnotation1);
    this.Zh.put(paramClass2, paramAnnotation2);
  }
  
  public Z_ Zs() {
    if (this.Zh.size() == 2) {
      Iterator<Map.Entry> iterator = this.Zh.entrySet().iterator();
      Map.Entry entry1 = iterator.next();
      Map.Entry entry2 = iterator.next();
      return new Zir((Class)entry1.getKey(), (Annotation)entry1.getValue(), (Class)entry2.getKey(), (Annotation)entry2.getValue());
    } 
    return new Zih(this.Zh);
  }
  
  public Zih Zk() {
    Zih zih = new Zih();
    int i = Ziv.Zv();
    for (Annotation annotation : this.Zh.values()) {
      zih.ZL(annotation);
      if (i != 0)
        break; 
    } 
    return zih;
  }
  
  public boolean Zu(Annotation paramAnnotation) {
    return this.Zh.containsKey(paramAnnotation.annotationType());
  }
  
  public Zie Zf(Annotation paramAnnotation) {
    this.Zh.put(paramAnnotation.annotationType(), paramAnnotation);
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zqb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */