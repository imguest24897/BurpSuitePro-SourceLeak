package net.portswigger.devtools.protocol.events.autofill;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.autofill.AddressUI;
import net.portswigger.devtools.protocol.types.autofill.FilledField;

@Zsi("net.portswigger.devtools.protocol.events.autofill.AddressFormFilled")
public class AddressFormFilled implements Zl {
  @Zvd(Zp = "filledFields")
  public final List<FilledField> filledFields;
  
  @Zvd(Zp = "addressUi")
  public final AddressUI addressUi;
  
  private static String[] Zv;
  
  @Zox
  public AddressFormFilled(@Zc5(Ze = "filledFields") List<FilledField> paramList, @Zc5(Ze = "addressUi") AddressUI paramAddressUI) {
    this.filledFields = paramList;
    this.addressUi = paramAddressUI;
    String[] arrayOfString = ZR();
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public static void ZJ(String[] paramArrayOfString) {
    Zv = paramArrayOfString;
  }
  
  public static String[] ZR() {
    return Zv;
  }
  
  static {
    if (ZR() != null)
      ZJ(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\autofill\AddressFormFilled.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */