package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.devtools.protocol.Zu;

public class Zo2 {
  public static List<Zv> ZP(Method paramMethod, Object[] paramArrayOfObject) {
    Parameter[] arrayOfParameter = paramMethod.getParameters();
    Type[] arrayOfType = paramMethod.getGenericParameterTypes();
    ArrayList<Zv> arrayList = new ArrayList();
    int i = Zv.ZTc();
    if (paramArrayOfObject == null)
      return arrayList; 
    byte b = 0;
    while (b < paramArrayOfObject.length) {
      Object object = paramArrayOfObject[b];
      if (object != null) {
        String str = ((Zu)arrayOfParameter[b].<Zu>getAnnotation(Zu.class)).value();
        Type type1 = arrayOfType[b];
        Type type2 = Zz(type1);
        arrayList.add(new Zv(str, type1, type2, object));
      } 
      b++;
      if (i == 0)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zv.ZJ(++i); 
    return arrayList;
  }
  
  private static Type Zz(Type paramType) {
    Type type = null;
    if (paramType instanceof ParameterizedType) {
      Type[] arrayOfType = ((ParameterizedType)paramType).getActualTypeArguments();
      type = arrayOfType[arrayOfType.length - 1];
    } 
    return type;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zo2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */