package net.portswigger.devtools.protocol.types.runtime;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.runtime.Properties")
public class Properties {
  @Zvd(Zp = "result")
  public final List<PropertyDescriptor> result;
  
  @Zvd(Zp = "internalProperties")
  @Zj
  public final List<InternalPropertyDescriptor> internalProperties;
  
  @Zvd(Zp = "privateProperties")
  @Zy
  @Zj
  public final List<PrivatePropertyDescriptor> privateProperties;
  
  @Zvd(Zp = "exceptionDetails")
  @Zj
  public final ExceptionDetails exceptionDetails;
  
  @Zox
  public Properties(@Zc5(Ze = "result") List<PropertyDescriptor> paramList, @Zc5(Ze = "internalProperties", ZS = "null") List<InternalPropertyDescriptor> paramList1, @Zc5(Ze = "privateProperties", ZS = "null") List<PrivatePropertyDescriptor> paramList2, @Zc5(Ze = "exceptionDetails", ZS = "null") ExceptionDetails paramExceptionDetails) {
    this.result = paramList;
    this.internalProperties = paramList1;
    this.privateProperties = paramList2;
    this.exceptionDetails = paramExceptionDetails;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\runtime\Properties.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */