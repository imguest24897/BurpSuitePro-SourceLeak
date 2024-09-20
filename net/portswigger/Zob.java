package net.portswigger;

import java.lang.reflect.Type;

public interface Zob<T> {
  T ZN(Type paramType, int paramInt);
  
  T ZC(T paramT, Type paramType, int paramInt);
  
  T Zg(T paramT, int paramInt);
  
  T Zy(T paramT, int paramInt);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zob.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */