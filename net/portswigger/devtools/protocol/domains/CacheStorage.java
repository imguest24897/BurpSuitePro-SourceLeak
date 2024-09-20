package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.cachestorage.Cache;
import net.portswigger.devtools.protocol.types.cachestorage.CachedResponse;
import net.portswigger.devtools.protocol.types.cachestorage.Header;
import net.portswigger.devtools.protocol.types.cachestorage.RequestEntries;
import net.portswigger.devtools.protocol.types.storage.StorageBucket;

@Zy
public interface CacheStorage {
  CompletableFuture<Zf<Void>> deleteCache(@Zu("cacheId") String paramString);
  
  CompletableFuture<Zf<Void>> deleteEntry(@Zu("cacheId") String paramString1, @Zu("request") String paramString2);
  
  @Zr("caches")
  CompletableFuture<Zf<List<Cache>>> requestCacheNames();
  
  @Zr("caches")
  CompletableFuture<Zf<List<Cache>>> requestCacheNames(@Zj @Zu("securityOrigin") String paramString1, @Zj @Zu("storageKey") String paramString2, @Zj @Zu("storageBucket") StorageBucket paramStorageBucket);
  
  @Zr("response")
  CompletableFuture<Zf<CachedResponse>> requestCachedResponse(@Zu("cacheId") String paramString1, @Zu("requestURL") String paramString2, @Zu("requestHeaders") List<Header> paramList);
  
  CompletableFuture<Zf<RequestEntries>> requestEntries(@Zu("cacheId") String paramString);
  
  CompletableFuture<Zf<RequestEntries>> requestEntries(@Zu("cacheId") String paramString1, @Zj @Zu("skipCount") Integer paramInteger1, @Zj @Zu("pageSize") Integer paramInteger2, @Zj @Zu("pathFilter") String paramString2);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\CacheStorage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */