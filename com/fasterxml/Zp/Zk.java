package com.fasterxml.Zp;

import com.fasterxml.Zg_;
import com.fasterxml.Zgn;
import com.fasterxml.Zor.Zy7;
import com.fasterxml.Zor.Zyc;
import java.util.Collection;

public interface Zk<T extends Zk<T>> {
  Class<?> ZP();
  
  Za ZY(Zy7 paramZy7, com.fasterxml.Zor.Zk paramZk, Collection<Zd> paramCollection);
  
  Zt Zn(Zyc paramZyc, com.fasterxml.Zor.Zk paramZk, Collection<Zd> paramCollection);
  
  T ZB(Zg_ paramZg_, Zz paramZz);
  
  default T Zn(Zgn paramZgn, Zz paramZz) {
    return ZB(paramZgn.Zj(), paramZz);
  }
  
  T ZJ(Class<?> paramClass);
  
  default T ZN(Class<?> paramClass) {
    return ZJ(paramClass);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zp\Zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */