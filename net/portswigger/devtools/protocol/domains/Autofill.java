package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.autofill.AddressFormFilled;
import net.portswigger.devtools.protocol.types.autofill.Address;
import net.portswigger.devtools.protocol.types.autofill.CreditCard;

@Zy
public interface Autofill {
  CompletableFuture<Zf<Void>> trigger(@Zu("fieldId") Integer paramInteger, @Zu("card") CreditCard paramCreditCard);
  
  CompletableFuture<Zf<Void>> trigger(@Zu("fieldId") Integer paramInteger, @Zj @Zu("frameId") String paramString, @Zu("card") CreditCard paramCreditCard);
  
  CompletableFuture<Zf<Void>> setAddresses(@Zu("addresses") List<Address> paramList);
  
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  @Zb("addressFormFilled")
  Zs onAddressFormFilled(Zp<AddressFormFilled> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Autofill.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */