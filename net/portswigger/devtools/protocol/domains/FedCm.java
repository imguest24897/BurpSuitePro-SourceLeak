package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.fedcm.DialogClosed;
import net.portswigger.devtools.protocol.events.fedcm.DialogShown;
import net.portswigger.devtools.protocol.types.fedcm.AccountUrlType;
import net.portswigger.devtools.protocol.types.fedcm.DialogButton;

@Zy
public interface FedCm {
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Void>> enable(@Zj @Zu("disableRejectionDelay") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> selectAccount(@Zu("dialogId") String paramString, @Zu("accountIndex") Integer paramInteger);
  
  CompletableFuture<Zf<Void>> clickDialogButton(@Zu("dialogId") String paramString, @Zu("dialogButton") DialogButton paramDialogButton);
  
  CompletableFuture<Zf<Void>> openUrl(@Zu("dialogId") String paramString, @Zu("accountIndex") Integer paramInteger, @Zu("accountUrlType") AccountUrlType paramAccountUrlType);
  
  CompletableFuture<Zf<Void>> dismissDialog(@Zu("dialogId") String paramString);
  
  CompletableFuture<Zf<Void>> dismissDialog(@Zu("dialogId") String paramString, @Zj @Zu("triggerCooldown") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> resetCooldown();
  
  @Zb("dialogShown")
  Zs onDialogShown(Zp<DialogShown> paramZp) throws Zp;
  
  @Zb("dialogClosed")
  Zs onDialogClosed(Zp<DialogClosed> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\FedCm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */