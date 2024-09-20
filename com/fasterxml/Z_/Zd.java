package com.fasterxml.Z_;

import burp.Zbqc;
import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zk.Zi;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zs0;
import com.fasterxml.Zz0;
import java.io.IOException;
import java.util.Calendar;
import javax.xml.datatype.XMLGregorianCalendar;

public class Zd extends Zz0<XMLGregorianCalendar> implements Zi {
  static final Zd ZD = new Zd();
  
  final Zyd<Object> ZT;
  
  public Zd() {
    this((Zyd<?>)Zs0.ZC);
  }
  
  protected Zd(Zyd<?> paramZyd) {
    super(XMLGregorianCalendar.class);
    this.ZT = (Zyd)paramZyd;
  }
  
  public boolean ZE(Zyi paramZyi, XMLGregorianCalendar paramXMLGregorianCalendar) {
    return this.ZT.Zt(paramZyi, Zo(paramXMLGregorianCalendar));
  }
  
  public void Zo(XMLGregorianCalendar paramXMLGregorianCalendar, Zf paramZf, Zyi paramZyi) throws IOException {
    this.ZT.serialize(Zo(paramXMLGregorianCalendar), paramZf, paramZyi);
  }
  
  public void ZA(XMLGregorianCalendar paramXMLGregorianCalendar, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    Zn zn = paramZa.ZA(paramZf, paramZa.Ze(paramXMLGregorianCalendar, XMLGregorianCalendar.class, Zl.VALUE_STRING));
    Zo(paramXMLGregorianCalendar, paramZf, paramZyi);
    int[] arrayOfInt = Zf.ZZ();
    try {
      paramZa.ZP(paramZf, zn);
      if (Zbqc.Zwu() == null)
        Zf.Zc(new int[2]); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zyd<Object> zyd = paramZyi.Zp(this.ZT, paramZo);
    try {
      if (zyd != this.ZT)
        return (Zyd<?>)new Zd(zyd); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return (Zyd<?>)this;
  }
  
  protected Calendar Zo(XMLGregorianCalendar paramXMLGregorianCalendar) {
    return (paramXMLGregorianCalendar == null) ? null : paramXMLGregorianCalendar.toGregorianCalendar();
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Z_\Zd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */