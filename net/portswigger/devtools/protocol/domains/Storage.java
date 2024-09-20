package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import net.portswigger.Zi7;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.storage.AttributionReportingSourceRegistered;
import net.portswigger.devtools.protocol.events.storage.AttributionReportingTriggerRegistered;
import net.portswigger.devtools.protocol.events.storage.CacheStorageContentUpdated;
import net.portswigger.devtools.protocol.events.storage.CacheStorageListUpdated;
import net.portswigger.devtools.protocol.events.storage.IndexedDBContentUpdated;
import net.portswigger.devtools.protocol.events.storage.IndexedDBListUpdated;
import net.portswigger.devtools.protocol.events.storage.InterestGroupAccessed;
import net.portswigger.devtools.protocol.events.storage.InterestGroupAuctionEventOccurred;
import net.portswigger.devtools.protocol.events.storage.InterestGroupAuctionNetworkRequestCreated;
import net.portswigger.devtools.protocol.events.storage.SharedStorageAccessed;
import net.portswigger.devtools.protocol.events.storage.StorageBucketCreatedOrUpdated;
import net.portswigger.devtools.protocol.events.storage.StorageBucketDeleted;
import net.portswigger.devtools.protocol.types.network.Cookie;
import net.portswigger.devtools.protocol.types.network.CookieParam;
import net.portswigger.devtools.protocol.types.storage.RelatedWebsiteSet;
import net.portswigger.devtools.protocol.types.storage.SharedStorageEntry;
import net.portswigger.devtools.protocol.types.storage.SharedStorageMetadata;
import net.portswigger.devtools.protocol.types.storage.StorageBucket;
import net.portswigger.devtools.protocol.types.storage.TrustTokens;
import net.portswigger.devtools.protocol.types.storage.UsageAndQuota;

@Zy
public interface Storage {
  @Zr("storageKey")
  CompletableFuture<Zf<String>> getStorageKeyForFrame(@Zu("frameId") String paramString);
  
  CompletableFuture<Zf<Void>> clearDataForOrigin(@Zu("origin") String paramString1, @Zu("storageTypes") String paramString2);
  
  CompletableFuture<Zf<Void>> clearDataForStorageKey(@Zu("storageKey") String paramString1, @Zu("storageTypes") String paramString2);
  
  @Zr("cookies")
  CompletableFuture<Zf<List<Cookie>>> getCookies();
  
  @Zr("cookies")
  CompletableFuture<Zf<List<Cookie>>> getCookies(@Zj @Zu("browserContextId") String paramString);
  
  CompletableFuture<Zf<Void>> setCookies(@Zu("cookies") List<CookieParam> paramList);
  
  CompletableFuture<Zf<Void>> setCookies(@Zu("cookies") List<CookieParam> paramList, @Zj @Zu("browserContextId") String paramString);
  
  CompletableFuture<Zf<Void>> clearCookies();
  
  CompletableFuture<Zf<Void>> clearCookies(@Zj @Zu("browserContextId") String paramString);
  
  CompletableFuture<Zf<UsageAndQuota>> getUsageAndQuota(@Zu("origin") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> overrideQuotaForOrigin(@Zu("origin") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> overrideQuotaForOrigin(@Zu("origin") String paramString, @Zj @Zu("quotaSize") Double paramDouble);
  
  CompletableFuture<Zf<Void>> trackCacheStorageForOrigin(@Zu("origin") String paramString);
  
  CompletableFuture<Zf<Void>> trackCacheStorageForStorageKey(@Zu("storageKey") String paramString);
  
  CompletableFuture<Zf<Void>> trackIndexedDBForOrigin(@Zu("origin") String paramString);
  
  CompletableFuture<Zf<Void>> trackIndexedDBForStorageKey(@Zu("storageKey") String paramString);
  
  CompletableFuture<Zf<Void>> untrackCacheStorageForOrigin(@Zu("origin") String paramString);
  
  CompletableFuture<Zf<Void>> untrackCacheStorageForStorageKey(@Zu("storageKey") String paramString);
  
  CompletableFuture<Zf<Void>> untrackIndexedDBForOrigin(@Zu("origin") String paramString);
  
  CompletableFuture<Zf<Void>> untrackIndexedDBForStorageKey(@Zu("storageKey") String paramString);
  
  @Zy
  @Zr("tokens")
  CompletableFuture<Zf<List<TrustTokens>>> getTrustTokens();
  
  @Zy
  @Zr("didDeleteTokens")
  CompletableFuture<Zf<Boolean>> clearTrustTokens(@Zu("issuerOrigin") String paramString);
  
  @Zy
  @Zr("details")
  CompletableFuture<Zf<Map<String, Zi7>>> getInterestGroupDetails(@Zu("ownerOrigin") String paramString1, @Zu("name") String paramString2);
  
  @Zy
  CompletableFuture<Zf<Void>> setInterestGroupTracking(@Zu("enable") Boolean paramBoolean);
  
  @Zy
  CompletableFuture<Zf<Void>> setInterestGroupAuctionTracking(@Zu("enable") Boolean paramBoolean);
  
  @Zy
  @Zr("metadata")
  CompletableFuture<Zf<SharedStorageMetadata>> getSharedStorageMetadata(@Zu("ownerOrigin") String paramString);
  
  @Zy
  @Zr("entries")
  CompletableFuture<Zf<List<SharedStorageEntry>>> getSharedStorageEntries(@Zu("ownerOrigin") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> setSharedStorageEntry(@Zu("ownerOrigin") String paramString1, @Zu("key") String paramString2, @Zu("value") String paramString3);
  
  @Zy
  CompletableFuture<Zf<Void>> setSharedStorageEntry(@Zu("ownerOrigin") String paramString1, @Zu("key") String paramString2, @Zu("value") String paramString3, @Zj @Zu("ignoreIfPresent") Boolean paramBoolean);
  
  @Zy
  CompletableFuture<Zf<Void>> deleteSharedStorageEntry(@Zu("ownerOrigin") String paramString1, @Zu("key") String paramString2);
  
  @Zy
  CompletableFuture<Zf<Void>> clearSharedStorageEntries(@Zu("ownerOrigin") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> resetSharedStorageBudget(@Zu("ownerOrigin") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> setSharedStorageTracking(@Zu("enable") Boolean paramBoolean);
  
  @Zy
  CompletableFuture<Zf<Void>> setStorageBucketTracking(@Zu("storageKey") String paramString, @Zu("enable") Boolean paramBoolean);
  
  @Zy
  CompletableFuture<Zf<Void>> deleteStorageBucket(@Zu("bucket") StorageBucket paramStorageBucket);
  
  @Zy
  @Zr("deletedSites")
  CompletableFuture<Zf<List<String>>> runBounceTrackingMitigations();
  
  @Zy
  CompletableFuture<Zf<Void>> setAttributionReportingLocalTestingMode(@Zu("enabled") Boolean paramBoolean);
  
  @Zy
  CompletableFuture<Zf<Void>> setAttributionReportingTracking(@Zu("enable") Boolean paramBoolean);
  
  @Zy
  @Zr("numSent")
  CompletableFuture<Zf<Integer>> sendPendingAttributionReports();
  
  @Zy
  @Zr("sets")
  CompletableFuture<Zf<List<RelatedWebsiteSet>>> getRelatedWebsiteSets();
  
  @Zb("cacheStorageContentUpdated")
  Zs onCacheStorageContentUpdated(Zp<CacheStorageContentUpdated> paramZp) throws Zp;
  
  @Zb("cacheStorageListUpdated")
  Zs onCacheStorageListUpdated(Zp<CacheStorageListUpdated> paramZp) throws Zp;
  
  @Zb("indexedDBContentUpdated")
  Zs onIndexedDBContentUpdated(Zp<IndexedDBContentUpdated> paramZp) throws Zp;
  
  @Zb("indexedDBListUpdated")
  Zs onIndexedDBListUpdated(Zp<IndexedDBListUpdated> paramZp) throws Zp;
  
  @Zb("interestGroupAccessed")
  Zs onInterestGroupAccessed(Zp<InterestGroupAccessed> paramZp) throws Zp;
  
  @Zb("interestGroupAuctionEventOccurred")
  Zs onInterestGroupAuctionEventOccurred(Zp<InterestGroupAuctionEventOccurred> paramZp) throws Zp;
  
  @Zb("interestGroupAuctionNetworkRequestCreated")
  Zs onInterestGroupAuctionNetworkRequestCreated(Zp<InterestGroupAuctionNetworkRequestCreated> paramZp) throws Zp;
  
  @Zb("sharedStorageAccessed")
  Zs onSharedStorageAccessed(Zp<SharedStorageAccessed> paramZp) throws Zp;
  
  @Zb("storageBucketCreatedOrUpdated")
  Zs onStorageBucketCreatedOrUpdated(Zp<StorageBucketCreatedOrUpdated> paramZp) throws Zp;
  
  @Zb("storageBucketDeleted")
  Zs onStorageBucketDeleted(Zp<StorageBucketDeleted> paramZp) throws Zp;
  
  @Zb("attributionReportingSourceRegistered")
  @Zy
  Zs onAttributionReportingSourceRegistered(Zp<AttributionReportingSourceRegistered> paramZp) throws Zp;
  
  @Zb("attributionReportingTriggerRegistered")
  @Zy
  Zs onAttributionReportingTriggerRegistered(Zp<AttributionReportingTriggerRegistered> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Storage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */