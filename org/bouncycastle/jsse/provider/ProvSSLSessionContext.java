package org.bouncycastle.jsse.provider;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import org.bouncycastle.tls.SessionID;
import org.bouncycastle.tls.TlsSession;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;

class ProvSSLSessionContext implements SSLSessionContext {
  private static final Logger LOG = Logger.getLogger(ProvSSLSessionContext.class.getName());
  
  private static final int provSessionCacheSize = PropertyUtils.getIntegerSystemProperty("javax.net.ssl.sessionCacheSize", 20480, 0, 2147483647);
  
  protected final Map<SessionID, SessionEntry> sessionsByID = new LinkedHashMap<SessionID, SessionEntry>(16, 0.75F, true) {
      protected boolean removeEldestEntry(Map.Entry<SessionID, ProvSSLSessionContext.SessionEntry> param1Entry) {
        boolean bool = (ProvSSLSessionContext.this.sessionCacheSize > 0 && size() > ProvSSLSessionContext.this.sessionCacheSize) ? true : false;
        if (bool)
          ProvSSLSessionContext.this.removeSessionByPeer(param1Entry.getValue()); 
        return bool;
      }
    };
  
  protected final Map<String, SessionEntry> sessionsByPeer = new HashMap<>();
  
  protected final ReferenceQueue<ProvSSLSession> sessionsQueue = new ReferenceQueue<>();
  
  protected final ContextData contextData;
  
  protected int sessionCacheSize = provSessionCacheSize;
  
  protected int sessionTimeoutSeconds = 86400;
  
  ProvSSLSessionContext(ContextData paramContextData) {
    this.contextData = paramContextData;
  }
  
  ProvSSLContextSpi getSSLContext() {
    return this.contextData.getContext();
  }
  
  JcaTlsCrypto getCrypto() {
    return this.contextData.getCrypto();
  }
  
  synchronized ProvSSLSession getSessionImpl(byte[] paramArrayOfbyte) {
    processQueue();
    return accessSession(mapGet(this.sessionsByID, makeSessionID(paramArrayOfbyte)));
  }
  
  synchronized ProvSSLSession getSessionImpl(String paramString, int paramInt) {
    processQueue();
    SessionEntry sessionEntry = mapGet(this.sessionsByPeer, makePeerKey(paramString, paramInt));
    ProvSSLSession provSSLSession = accessSession(sessionEntry);
    if (provSSLSession != null)
      this.sessionsByID.get(sessionEntry.getSessionID()); 
    return provSSLSession;
  }
  
  synchronized void removeSession(byte[] paramArrayOfbyte) {
    SessionEntry sessionEntry = mapRemove(this.sessionsByID, makeSessionID(paramArrayOfbyte));
    if (null != sessionEntry)
      removeSessionByPeer(sessionEntry); 
  }
  
  synchronized ProvSSLSession reportSession(String paramString, int paramInt, TlsSession paramTlsSession, JsseSessionParameters paramJsseSessionParameters, boolean paramBoolean) {
    processQueue();
    if (!paramBoolean)
      return new ProvSSLSession(this, paramString, paramInt, paramTlsSession, paramJsseSessionParameters); 
    SessionID sessionID = makeSessionID(paramTlsSession.getSessionID());
    SessionEntry sessionEntry = mapGet(this.sessionsByID, sessionID);
    ProvSSLSession provSSLSession = (sessionEntry == null) ? null : sessionEntry.get();
    if (null == provSSLSession || provSSLSession.getTlsSession() != paramTlsSession) {
      provSSLSession = new ProvSSLSession(this, paramString, paramInt, paramTlsSession, paramJsseSessionParameters);
      if (null != sessionID) {
        sessionEntry = new SessionEntry(sessionID, provSSLSession, this.sessionsQueue);
        this.sessionsByID.put(sessionID, sessionEntry);
      } 
    } 
    if (null != sessionEntry)
      mapAdd(this.sessionsByPeer, sessionEntry.getPeerKey(), sessionEntry); 
    return provSSLSession;
  }
  
  public synchronized Enumeration<byte[]> getIds() {
    removeAllExpiredSessions();
    ArrayList<byte[]> arrayList = new ArrayList(this.sessionsByID.size());
    for (SessionID sessionID : this.sessionsByID.keySet())
      arrayList.add(sessionID.getBytes()); 
    return (Enumeration)Collections.enumeration(arrayList);
  }
  
  public SSLSession getSession(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      throw new NullPointerException("'sessionID' cannot be null"); 
    return (SSLSession)getSessionImpl(paramArrayOfbyte);
  }
  
  public synchronized int getSessionCacheSize() {
    return this.sessionCacheSize;
  }
  
  public synchronized int getSessionTimeout() {
    return this.sessionTimeoutSeconds;
  }
  
  public synchronized void setSessionCacheSize(int paramInt) throws IllegalArgumentException {
    if (this.sessionCacheSize == paramInt)
      return; 
    if (paramInt < 0)
      throw new IllegalArgumentException("'size' cannot be < 0"); 
    this.sessionCacheSize = paramInt;
    removeAllExpiredSessions();
    if (this.sessionCacheSize > 0) {
      int i = this.sessionsByID.size();
      if (i > this.sessionCacheSize) {
        Iterator<SessionEntry> iterator = this.sessionsByID.values().iterator();
        while (iterator.hasNext() && i > this.sessionCacheSize) {
          SessionEntry sessionEntry = iterator.next();
          iterator.remove();
          removeSessionByPeer(sessionEntry);
          i--;
        } 
      } 
    } 
  }
  
  public synchronized void setSessionTimeout(int paramInt) throws IllegalArgumentException {
    if (this.sessionTimeoutSeconds == paramInt)
      return; 
    if (paramInt < 0)
      throw new IllegalArgumentException("'seconds' cannot be < 0"); 
    this.sessionTimeoutSeconds = paramInt;
    removeAllExpiredSessions();
  }
  
  private ProvSSLSession accessSession(SessionEntry paramSessionEntry) {
    if (paramSessionEntry != null) {
      ProvSSLSession provSSLSession = paramSessionEntry.get();
      if (provSSLSession != null) {
        long l = System.currentTimeMillis();
        if (!invalidateIfCreatedBefore(paramSessionEntry, getCreationTimeLimit(l))) {
          provSSLSession.accessedAt(l);
          return provSSLSession;
        } 
      } 
      removeSession(paramSessionEntry);
    } 
    return null;
  }
  
  private long getCreationTimeLimit(long paramLong) {
    return (this.sessionTimeoutSeconds < 1) ? Long.MIN_VALUE : (paramLong - 1000L * this.sessionTimeoutSeconds);
  }
  
  private boolean invalidateIfCreatedBefore(SessionEntry paramSessionEntry, long paramLong) {
    ProvSSLSession provSSLSession = paramSessionEntry.get();
    if (provSSLSession == null)
      return true; 
    if (provSSLSession.getCreationTime() < paramLong)
      provSSLSession.invalidatedBySessionContext(); 
    return !provSSLSession.isValid();
  }
  
  private void processQueue() {
    byte b;
    SessionEntry sessionEntry;
    for (b = 0; (sessionEntry = (SessionEntry)this.sessionsQueue.poll()) != null; b++)
      removeSession(sessionEntry); 
    if (b > 0)
      LOG.fine("Processed " + b + " session entries (soft references) from the reference queue"); 
  }
  
  private void removeAllExpiredSessions() {
    processQueue();
    long l = getCreationTimeLimit(System.currentTimeMillis());
    Iterator<SessionEntry> iterator = this.sessionsByID.values().iterator();
    while (iterator.hasNext()) {
      SessionEntry sessionEntry = iterator.next();
      if (invalidateIfCreatedBefore(sessionEntry, l)) {
        iterator.remove();
        removeSessionByPeer(sessionEntry);
      } 
    } 
  }
  
  private void removeSession(SessionEntry paramSessionEntry) {
    mapRemove(this.sessionsByID, paramSessionEntry.getSessionID(), paramSessionEntry);
    removeSessionByPeer(paramSessionEntry);
  }
  
  private boolean removeSessionByPeer(SessionEntry paramSessionEntry) {
    return mapRemove(this.sessionsByPeer, paramSessionEntry.getPeerKey(), paramSessionEntry);
  }
  
  private static String makePeerKey(ProvSSLSession paramProvSSLSession) {
    return (paramProvSSLSession == null) ? null : makePeerKey(paramProvSSLSession.getPeerHost(), paramProvSSLSession.getPeerPort());
  }
  
  private static String makePeerKey(String paramString, int paramInt) {
    return (paramString == null || paramInt < 0) ? null : (paramString + ':' + Integer.toString(paramInt)).toLowerCase(Locale.ENGLISH);
  }
  
  private static SessionID makeSessionID(byte[] paramArrayOfbyte) {
    return TlsUtils.isNullOrEmpty(paramArrayOfbyte) ? null : new SessionID(paramArrayOfbyte);
  }
  
  private static <K, V> void mapAdd(Map<K, V> paramMap, K paramK, V paramV) {
    if (paramMap == null || paramV == null)
      throw new NullPointerException(); 
    if (paramK != null)
      paramMap.put(paramK, paramV); 
  }
  
  private static <K, V> V mapGet(Map<K, V> paramMap, K paramK) {
    if (paramMap == null)
      throw new NullPointerException(); 
    return (paramK == null) ? null : paramMap.get(paramK);
  }
  
  private static <K, V> V mapRemove(Map<K, V> paramMap, K paramK) {
    if (paramMap == null)
      throw new NullPointerException(); 
    return (paramK == null) ? null : paramMap.remove(paramK);
  }
  
  private static <K, V> boolean mapRemove(Map<K, V> paramMap, K paramK, V paramV) {
    if (paramMap == null || paramV == null)
      throw new NullPointerException(); 
    if (paramK != null) {
      V v = paramMap.remove(paramK);
      if (v == paramV)
        return true; 
      if (v != null)
        paramMap.put(paramK, v); 
    } 
    return false;
  }
  
  private static final class SessionEntry extends SoftReference<ProvSSLSession> {
    private final SessionID sessionID;
    
    private final String peerKey;
    
    SessionEntry(SessionID param1SessionID, ProvSSLSession param1ProvSSLSession, ReferenceQueue<ProvSSLSession> param1ReferenceQueue) {
      super(param1ProvSSLSession, param1ReferenceQueue);
      if (param1SessionID == null || param1ProvSSLSession == null || param1ReferenceQueue == null)
        throw new NullPointerException(); 
      this.sessionID = param1SessionID;
      this.peerKey = ProvSSLSessionContext.makePeerKey(param1ProvSSLSession);
    }
    
    public String getPeerKey() {
      return this.peerKey;
    }
    
    public SessionID getSessionID() {
      return this.sessionID;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ProvSSLSessionContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */