package org.bouncycastle.pkix.jcajce;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;
import org.bouncycastle.jcajce.PKIXCRLStore;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Iterable;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

class CrlCache {
  private static final int DEFAULT_TIMEOUT = 15000;
  
  private static Map<URI, WeakReference<PKIXCRLStore>> cache = Collections.synchronizedMap(new WeakHashMap<>());
  
  static synchronized PKIXCRLStore getCrl(CertificateFactory paramCertificateFactory, Date paramDate, URI paramURI) throws IOException, CRLException {
    Collection collection;
    PKIXCRLStore pKIXCRLStore = null;
    WeakReference<PKIXCRLStore> weakReference = cache.get(paramURI);
    if (weakReference != null)
      pKIXCRLStore = weakReference.get(); 
    if (pKIXCRLStore != null) {
      boolean bool = false;
      for (X509CRL x509CRL : pKIXCRLStore.getMatches(null)) {
        Date date = x509CRL.getNextUpdate();
        if (date != null && date.before(paramDate)) {
          bool = true;
          break;
        } 
      } 
      if (!bool)
        return pKIXCRLStore; 
    } 
    if (paramURI.getScheme().equals("ldap")) {
      collection = getCrlsFromLDAP(paramCertificateFactory, paramURI);
    } else {
      collection = getCrls(paramCertificateFactory, paramURI);
    } 
    LocalCRLStore<CRL> localCRLStore = new LocalCRLStore<>((Store<CRL>)new CollectionStore(collection));
    cache.put(paramURI, new WeakReference<>(localCRLStore));
    return localCRLStore;
  }
  
  private static Collection getCrlsFromLDAP(CertificateFactory paramCertificateFactory, URI paramURI) throws IOException, CRLException {
    Hashtable<Object, Object> hashtable = new Hashtable<>();
    hashtable.put("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
    hashtable.put("java.naming.provider.url", paramURI.toString());
    byte[] arrayOfByte = null;
    try {
      InitialDirContext initialDirContext = new InitialDirContext(hashtable);
      Attributes attributes = initialDirContext.getAttributes("");
      Attribute attribute = attributes.get("certificateRevocationList;binary");
      arrayOfByte = (byte[])attribute.get();
    } catch (NamingException namingException) {
      throw new CRLException("issue connecting to: " + paramURI.toString(), namingException);
    } 
    if (arrayOfByte == null || arrayOfByte.length == 0)
      throw new CRLException("no CRL returned from: " + paramURI); 
    return paramCertificateFactory.generateCRLs(new ByteArrayInputStream(arrayOfByte));
  }
  
  private static Collection getCrls(CertificateFactory paramCertificateFactory, URI paramURI) throws IOException, CRLException {
    HttpURLConnection httpURLConnection = (HttpURLConnection)paramURI.toURL().openConnection();
    httpURLConnection.setConnectTimeout(15000);
    httpURLConnection.setReadTimeout(15000);
    InputStream inputStream = httpURLConnection.getInputStream();
    Collection<? extends CRL> collection = paramCertificateFactory.generateCRLs(inputStream);
    inputStream.close();
    return collection;
  }
  
  private static class LocalCRLStore<T extends CRL> implements PKIXCRLStore, Iterable<CRL> {
    private Collection<CRL> _local;
    
    public LocalCRLStore(Store<CRL> param1Store) {
      this._local = new ArrayList<>(param1Store.getMatches(null));
    }
    
    public Collection getMatches(Selector param1Selector) {
      if (param1Selector == null)
        return new ArrayList<>(this._local); 
      ArrayList<CRL> arrayList = new ArrayList();
      for (CRL cRL : this._local) {
        if (param1Selector.match(cRL))
          arrayList.add(cRL); 
      } 
      return arrayList;
    }
    
    public Iterator<CRL> iterator() {
      return getMatches(null).iterator();
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkix\jcajce\CrlCache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */