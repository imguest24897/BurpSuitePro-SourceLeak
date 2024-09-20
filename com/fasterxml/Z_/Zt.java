package com.fasterxml.Z_;

import com.fasterxml.Zk.Zk;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zy7;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zs5;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class Zt extends Zk {
  public Zyd<?> Zf(Zy7 paramZy7, Zk paramZk, Zyv paramZyv) {
    Class<?> clazz = paramZk.Zf();
    return (Zyd<?>)((Duration.class.isAssignableFrom(clazz) || QName.class.isAssignableFrom(clazz)) ? Zs5.ZN : (XMLGregorianCalendar.class.isAssignableFrom(clazz) ? Zd.ZD : null));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Z_\Zt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */