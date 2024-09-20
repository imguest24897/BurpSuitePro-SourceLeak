package net.portswigger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import org.openapi4j.Zg;
import org.openapi4j.Zpj;
import org.openapi4j.Zu;

public class Zid {
  private final String ZO;
  
  private final Zpj Zc;
  
  private final Zav Zq;
  
  public Zid(Zqt paramZqt, String paramString, Zpj paramZpj) {
    this.ZO = paramString;
    this.Zc = paramZpj;
    this.Zq = paramZqt.Zi(paramZpj.getSchema());
  }
  
  public String ZZ() {
    return this.ZO;
  }
  
  public Zav ZE() {
    return this.Zq;
  }
  
  public Zrzn ZU(String paramString) {
    return Optional.<Zg>ofNullable(this.Zc.getEncoding(paramString)).map(Zrzn::new).orElse(new Zrzn(new Zg()));
  }
  
  public List<Object> Zp() {
    ArrayList<Object> arrayList = new ArrayList();
    String[] arrayOfString = Zfe.ZG();
    if (this.Zc.getExample() != null)
      arrayList.add(this.Zc.getExample()); 
    if (this.Zc.getExamples() != null)
      for (Zu zu : this.Zc.getExamples().values()) {
        arrayList.add(zu.getValue());
        if (arrayOfString == null)
          break; 
      }  
    Objects.requireNonNull(arrayList);
    this.Zq.Zj().forEach(arrayList::add);
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zid.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */