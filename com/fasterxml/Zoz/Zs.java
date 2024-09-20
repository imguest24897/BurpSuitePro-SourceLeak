package com.fasterxml.Zoz;

import com.fasterxml.Zh.Zi;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zt;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Zs extends Zl {
  private final Zi ZC;
  
  private final Zij ZP;
  
  private final boolean Z_;
  
  Zs(Zt paramZt, Zi paramZi, Zij paramZij, boolean paramBoolean) {
    super(paramZt);
    this.ZC = paramZi;
    this.ZP = (paramZt == null) ? null : paramZij;
    this.Z_ = paramBoolean;
  }
  
  public static List<Zi6> ZY(Zt paramZt, Zis paramZis, Zij paramZij, Zi paramZi, Zk paramZk, boolean paramBoolean) {
    return (new Zs(paramZt, paramZi, paramZij, paramBoolean)).ZW(paramZis, paramZk);
  }
  
  List<Zi6> ZW(Zis paramZis, Zk paramZk) {
    Map<String, Zi> map = ZU(paramZis, paramZk, null);
    int i = Ziv.ZM();
    if (map == null)
      return Collections.emptyList(); 
    ArrayList<Zi6> arrayList = new ArrayList(map.size());
    for (Zi zi : map.values()) {
      arrayList.add(zi.Za());
      if (i == 0)
        break; 
    } 
    return arrayList;
  }
  
  private Map<String, Zi> ZU(Zis paramZis, Zk paramZk, Map<String, Zi> paramMap) {
    Zk zk = paramZk.Zw();
    int i = Ziv.ZM();
    if (zk == null)
      return paramMap; 
    Class<?> clazz = paramZk.Zf();
    paramMap = ZU(new Ziu(this.ZC, zk.ZR()), zk, paramMap);
    Field[] arrayOfField = clazz.getDeclaredFields();
    int j = arrayOfField.length;
    byte b = 0;
    while (b < j) {
      Field field = arrayOfField[b];
      if (ZB(field) || i == 0) {
        if (paramMap == null)
          paramMap = new LinkedHashMap<>(); 
        Zi zi = new Zi(paramZis, field);
        if (this.Z_)
          zi.Zh = Zc(zi.Zh, field.getDeclaredAnnotations()); 
        paramMap.put(field.getName(), zi);
      } 
      b++;
      if (i == 0)
        break; 
    } 
    if (paramMap != null && this.ZP != null) {
      Class<?> clazz1 = this.ZP.ZL(clazz);
      if (clazz1 != null)
        ZI(clazz1, clazz, paramMap); 
    } 
    return paramMap;
  }
  
  private void ZI(Class<?> paramClass1, Class<?> paramClass2, Map<String, Zi> paramMap) {
    List list = Zx.ZO(paramClass1, paramClass2, true);
    Iterator<Class<?>> iterator = list.iterator();
    int i = Ziv.ZM();
    while (iterator.hasNext()) {
      Class clazz = iterator.next();
      Field[] arrayOfField = clazz.getDeclaredFields();
      int j = arrayOfField.length;
      byte b = 0;
      while (b < j) {
        Field field = arrayOfField[b];
        if (ZB(field) || i == 0) {
          String str = field.getName();
          Zi zi = paramMap.get(str);
          if (zi != null)
            zi.Zh = Zc(zi.Zh, field.getDeclaredAnnotations()); 
        } 
        b++;
        if (i == 0)
          break; 
      } 
      if (i == 0)
        break; 
    } 
  }
  
  private boolean ZB(Field paramField) {
    if (paramField.isEnumConstant())
      return true; 
    if (paramField.isSynthetic())
      return false; 
    int i = paramField.getModifiers();
    return !Modifier.isStatic(i);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */