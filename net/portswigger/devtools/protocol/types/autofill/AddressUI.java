package net.portswigger.devtools.protocol.types.autofill;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.autofill.AddressUI")
public class AddressUI {
  @Zvd(Zp = "addressFields")
  public final List<AddressFields> addressFields;
  
  @Zox
  public AddressUI(@Zc5(Ze = "addressFields") List<AddressFields> paramList) {
    this.addressFields = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\autofill\AddressUI.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */