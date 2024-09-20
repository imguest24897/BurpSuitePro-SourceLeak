package net.portswigger.devtools.protocol.types.autofill;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.autofill.CreditCard")
public class CreditCard {
  @Zvd(Zp = "number")
  public final String number;
  
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "expiryMonth")
  public final String expiryMonth;
  
  @Zvd(Zp = "expiryYear")
  public final String expiryYear;
  
  @Zvd(Zp = "cvc")
  public final String cvc;
  
  @Zox
  public CreditCard(@Zc5(Ze = "number") String paramString1, @Zc5(Ze = "name") String paramString2, @Zc5(Ze = "expiryMonth") String paramString3, @Zc5(Ze = "expiryYear") String paramString4, @Zc5(Ze = "cvc") String paramString5) {
    this.number = paramString1;
    String str = FillingStrategy.Zj();
    this.name = paramString2;
    this.expiryMonth = paramString3;
    this.expiryYear = paramString4;
    this.cvc = paramString5;
    if (Zbqc.Zwu() == null)
      FillingStrategy.ZT("LhMMvb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\autofill\CreditCard.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */