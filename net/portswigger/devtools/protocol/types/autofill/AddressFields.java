package net.portswigger.devtools.protocol.types.autofill;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.autofill.AddressFields")
public class AddressFields {
  @Zvd(Zp = "fields")
  public final List<AddressField> fields;
  
  @Zox
  public AddressFields(@Zc5(Ze = "fields") List<AddressField> paramList) {
    this.fields = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\autofill\AddressFields.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */