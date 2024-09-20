package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.indexeddb.DatabaseWithObjectStores;
import net.portswigger.devtools.protocol.types.indexeddb.KeyRange;
import net.portswigger.devtools.protocol.types.indexeddb.Metadata;
import net.portswigger.devtools.protocol.types.indexeddb.RequestData;
import net.portswigger.devtools.protocol.types.storage.StorageBucket;

@Zy
public interface IndexedDB {
  CompletableFuture<Zf<Void>> clearObjectStore(@Zu("databaseName") String paramString1, @Zu("objectStoreName") String paramString2);
  
  CompletableFuture<Zf<Void>> clearObjectStore(@Zj @Zu("securityOrigin") String paramString1, @Zj @Zu("storageKey") String paramString2, @Zj @Zu("storageBucket") StorageBucket paramStorageBucket, @Zu("databaseName") String paramString3, @Zu("objectStoreName") String paramString4);
  
  CompletableFuture<Zf<Void>> deleteDatabase(@Zu("databaseName") String paramString);
  
  CompletableFuture<Zf<Void>> deleteDatabase(@Zj @Zu("securityOrigin") String paramString1, @Zj @Zu("storageKey") String paramString2, @Zj @Zu("storageBucket") StorageBucket paramStorageBucket, @Zu("databaseName") String paramString3);
  
  CompletableFuture<Zf<Void>> deleteObjectStoreEntries(@Zu("databaseName") String paramString1, @Zu("objectStoreName") String paramString2, @Zu("keyRange") KeyRange paramKeyRange);
  
  CompletableFuture<Zf<Void>> deleteObjectStoreEntries(@Zj @Zu("securityOrigin") String paramString1, @Zj @Zu("storageKey") String paramString2, @Zj @Zu("storageBucket") StorageBucket paramStorageBucket, @Zu("databaseName") String paramString3, @Zu("objectStoreName") String paramString4, @Zu("keyRange") KeyRange paramKeyRange);
  
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<RequestData>> requestData(@Zu("databaseName") String paramString1, @Zu("objectStoreName") String paramString2, @Zu("indexName") String paramString3, @Zu("skipCount") Integer paramInteger1, @Zu("pageSize") Integer paramInteger2);
  
  CompletableFuture<Zf<RequestData>> requestData(@Zj @Zu("securityOrigin") String paramString1, @Zj @Zu("storageKey") String paramString2, @Zj @Zu("storageBucket") StorageBucket paramStorageBucket, @Zu("databaseName") String paramString3, @Zu("objectStoreName") String paramString4, @Zu("indexName") String paramString5, @Zu("skipCount") Integer paramInteger1, @Zu("pageSize") Integer paramInteger2, @Zj @Zu("keyRange") KeyRange paramKeyRange);
  
  CompletableFuture<Zf<Metadata>> getMetadata(@Zu("databaseName") String paramString1, @Zu("objectStoreName") String paramString2);
  
  CompletableFuture<Zf<Metadata>> getMetadata(@Zj @Zu("securityOrigin") String paramString1, @Zj @Zu("storageKey") String paramString2, @Zj @Zu("storageBucket") StorageBucket paramStorageBucket, @Zu("databaseName") String paramString3, @Zu("objectStoreName") String paramString4);
  
  @Zr("databaseWithObjectStores")
  CompletableFuture<Zf<DatabaseWithObjectStores>> requestDatabase(@Zu("databaseName") String paramString);
  
  @Zr("databaseWithObjectStores")
  CompletableFuture<Zf<DatabaseWithObjectStores>> requestDatabase(@Zj @Zu("securityOrigin") String paramString1, @Zj @Zu("storageKey") String paramString2, @Zj @Zu("storageBucket") StorageBucket paramStorageBucket, @Zu("databaseName") String paramString3);
  
  @Zr("databaseNames")
  CompletableFuture<Zf<List<String>>> requestDatabaseNames();
  
  @Zr("databaseNames")
  CompletableFuture<Zf<List<String>>> requestDatabaseNames(@Zj @Zu("securityOrigin") String paramString1, @Zj @Zu("storageKey") String paramString2, @Zj @Zu("storageBucket") StorageBucket paramStorageBucket);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\IndexedDB.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */