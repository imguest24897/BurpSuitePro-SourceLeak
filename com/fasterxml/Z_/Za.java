package com.fasterxml.Z_;

import com.fasterxml.Zo.Zz1;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyv;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class Za extends Zz1 {
  static final DatatypeFactory ZO;
  
  public Zyo<?> ZV(Zk paramZk, Zyc paramZyc, Zyv paramZyv) {
    Class<QName> clazz = paramZk.Zf();
    try {
      if (clazz == QName.class)
        return (Zyo<?>)new Zh(clazz, 3); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (clazz == XMLGregorianCalendar.class)
        return (Zyo<?>)new Zh(clazz, 2); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (clazz == Duration.class)
        return (Zyo<?>)new Zh(clazz, 1); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  static {
    try {
      ZO = DatatypeFactory.newInstance();
    } catch (DatatypeConfigurationException datatypeConfigurationException) {
      throw new RuntimeException(datatypeConfigurationException);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Z_\Za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */