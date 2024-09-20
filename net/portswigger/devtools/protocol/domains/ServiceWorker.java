package net.portswigger.devtools.protocol.domains;

import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.serviceworker.WorkerErrorReported;
import net.portswigger.devtools.protocol.events.serviceworker.WorkerRegistrationUpdated;
import net.portswigger.devtools.protocol.events.serviceworker.WorkerVersionUpdated;

@Zy
public interface ServiceWorker {
  CompletableFuture<Zf<Void>> deliverPushMessage(@Zu("origin") String paramString1, @Zu("registrationId") String paramString2, @Zu("data") String paramString3);
  
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> dispatchSyncEvent(@Zu("origin") String paramString1, @Zu("registrationId") String paramString2, @Zu("tag") String paramString3, @Zu("lastChance") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> dispatchPeriodicSyncEvent(@Zu("origin") String paramString1, @Zu("registrationId") String paramString2, @Zu("tag") String paramString3);
  
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Void>> inspectWorker(@Zu("versionId") String paramString);
  
  CompletableFuture<Zf<Void>> setForceUpdateOnPageLoad(@Zu("forceUpdateOnPageLoad") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> skipWaiting(@Zu("scopeURL") String paramString);
  
  CompletableFuture<Zf<Void>> startWorker(@Zu("scopeURL") String paramString);
  
  CompletableFuture<Zf<Void>> stopAllWorkers();
  
  CompletableFuture<Zf<Void>> stopWorker(@Zu("versionId") String paramString);
  
  CompletableFuture<Zf<Void>> unregister(@Zu("scopeURL") String paramString);
  
  CompletableFuture<Zf<Void>> updateRegistration(@Zu("scopeURL") String paramString);
  
  @Zb("workerErrorReported")
  Zs onWorkerErrorReported(Zp<WorkerErrorReported> paramZp) throws Zp;
  
  @Zb("workerRegistrationUpdated")
  Zs onWorkerRegistrationUpdated(Zp<WorkerRegistrationUpdated> paramZp) throws Zp;
  
  @Zb("workerVersionUpdated")
  Zs onWorkerVersionUpdated(Zp<WorkerVersionUpdated> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\ServiceWorker.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */