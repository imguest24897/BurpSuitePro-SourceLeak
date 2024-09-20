package net.portswigger;

import java.lang.reflect.Method;

public class Zag {
  static Method ZJ(Class<?> paramClass, Method paramMethod) throws NoSuchMethodException {
    return paramClass.getMethod(paramMethod.getName(), paramMethod.getParameterTypes());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zag.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */