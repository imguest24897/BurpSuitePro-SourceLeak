package com.fasterxml.Zh;

import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Zm {
  private static final TypeVariable<?>[] Zz = (TypeVariable<?>[])AbstractList.class.getTypeParameters();
  
  private static final TypeVariable<?>[] Zw = (TypeVariable<?>[])Collection.class.getTypeParameters();
  
  private static final TypeVariable<?>[] ZP = (TypeVariable<?>[])Iterable.class.getTypeParameters();
  
  private static final TypeVariable<?>[] Zi = (TypeVariable<?>[])List.class.getTypeParameters();
  
  private static final TypeVariable<?>[] ZW = (TypeVariable<?>[])ArrayList.class.getTypeParameters();
  
  private static final TypeVariable<?>[] ZJ = (TypeVariable<?>[])Map.class.getTypeParameters();
  
  private static final TypeVariable<?>[] ZH = (TypeVariable<?>[])HashMap.class.getTypeParameters();
  
  private static final TypeVariable<?>[] Zh = (TypeVariable<?>[])LinkedHashMap.class.getTypeParameters();
  
  public static TypeVariable<?>[] Zy(Class<?> paramClass) {
    return (TypeVariable<?>[])((paramClass == Collection.class) ? Zw : ((paramClass == List.class) ? Zi : ((paramClass == ArrayList.class) ? ZW : ((paramClass == AbstractList.class) ? Zz : ((paramClass == Iterable.class) ? ZP : paramClass.getTypeParameters())))));
  }
  
  public static TypeVariable<?>[] Zl(Class<?> paramClass) {
    return (TypeVariable<?>[])((paramClass == Map.class) ? ZJ : ((paramClass == HashMap.class) ? ZH : ((paramClass == LinkedHashMap.class) ? Zh : paramClass.getTypeParameters())));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zh\Zm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */