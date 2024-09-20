package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.domstorage.DomStorageItemAdded;
import net.portswigger.devtools.protocol.events.domstorage.DomStorageItemRemoved;
import net.portswigger.devtools.protocol.events.domstorage.DomStorageItemUpdated;
import net.portswigger.devtools.protocol.events.domstorage.DomStorageItemsCleared;
import net.portswigger.devtools.protocol.types.domstorage.StorageId;

@Zy
public interface DOMStorage {
  CompletableFuture<Zf<Void>> clear(@Zu("storageId") StorageId paramStorageId);
  
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  @Zr("entries")
  CompletableFuture<Zf<List<List<String>>>> getDOMStorageItems(@Zu("storageId") StorageId paramStorageId);
  
  CompletableFuture<Zf<Void>> removeDOMStorageItem(@Zu("storageId") StorageId paramStorageId, @Zu("key") String paramString);
  
  CompletableFuture<Zf<Void>> setDOMStorageItem(@Zu("storageId") StorageId paramStorageId, @Zu("key") String paramString1, @Zu("value") String paramString2);
  
  @Zb("domStorageItemAdded")
  Zs onDomStorageItemAdded(Zp<DomStorageItemAdded> paramZp) throws Zp;
  
  @Zb("domStorageItemRemoved")
  Zs onDomStorageItemRemoved(Zp<DomStorageItemRemoved> paramZp) throws Zp;
  
  @Zb("domStorageItemUpdated")
  Zs onDomStorageItemUpdated(Zp<DomStorageItemUpdated> paramZp) throws Zp;
  
  @Zb("domStorageItemsCleared")
  Zs onDomStorageItemsCleared(Zp<DomStorageItemsCleared> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\DOMStorage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */