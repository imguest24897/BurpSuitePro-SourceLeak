package org.bouncycastle.jsse.provider;

import java.security.AccessController;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCryptoProvider;
import org.bouncycastle.util.Strings;

public class BouncyCastleJsseProvider extends Provider {
  public static final String PROVIDER_NAME = "BCJSSE";
  
  private static final String JSSE_CONFIG_PROPERTY = "org.bouncycastle.jsse.config";
  
  private static final double PROVIDER_VERSION = 1.0019D;
  
  private static final String PROVIDER_INFO = "Bouncy Castle JSSE Provider Version 1.0.19";
  
  private final Map<String, BcJsseService> serviceMap;
  
  private final Map<String, EngineCreator> creatorMap;
  
  private final boolean isInFipsMode;
  
  private static final Map<Map<String, String>, Map<String, String>> attributeMaps = new HashMap<>();
  
  public BouncyCastleJsseProvider() {
    this(getPropertyValue("org.bouncycastle.jsse.config", "default"));
  }
  
  public BouncyCastleJsseProvider(boolean paramBoolean) {
    super("BCJSSE", 1.0019D, "Bouncy Castle JSSE Provider Version 1.0.19");
    this.serviceMap = new ConcurrentHashMap<>();
    this.creatorMap = new HashMap<>();
    this.isInFipsMode = configure(paramBoolean, new JcaTlsCryptoProvider());
  }
  
  public BouncyCastleJsseProvider(Provider paramProvider) {
    this(false, paramProvider);
  }
  
  public BouncyCastleJsseProvider(boolean paramBoolean, Provider paramProvider) {
    super("BCJSSE", 1.0019D, "Bouncy Castle JSSE Provider Version 1.0.19");
    this.serviceMap = new ConcurrentHashMap<>();
    this.creatorMap = new HashMap<>();
    this.isInFipsMode = configure(paramBoolean, (new JcaTlsCryptoProvider()).setProvider(paramProvider));
  }
  
  public BouncyCastleJsseProvider(String paramString) {
    super("BCJSSE", 1.0019D, "Bouncy Castle JSSE Provider Version 1.0.19");
    JcaTlsCryptoProvider jcaTlsCryptoProvider;
    this.serviceMap = new ConcurrentHashMap<>();
    this.creatorMap = new HashMap<>();
    paramString = paramString.trim();
    boolean bool = false;
    String str = paramString;
    int i = paramString.indexOf(':');
    if (i >= 0) {
      String str1 = paramString.substring(0, i).trim();
      String str2 = paramString.substring(i + 1).trim();
      bool = str1.equalsIgnoreCase("fips");
      str = str2;
    } 
    try {
      jcaTlsCryptoProvider = createCryptoProvider(str);
    } catch (GeneralSecurityException generalSecurityException) {
      throw new IllegalArgumentException("unable to set up JcaTlsCryptoProvider: " + generalSecurityException.getMessage(), generalSecurityException);
    } 
    this.isInFipsMode = configure(bool, jcaTlsCryptoProvider);
  }
  
  public BouncyCastleJsseProvider(boolean paramBoolean, JcaTlsCryptoProvider paramJcaTlsCryptoProvider) {
    super("BCJSSE", 1.0019D, "Bouncy Castle JSSE Provider Version 1.0.19");
    this.serviceMap = new ConcurrentHashMap<>();
    this.creatorMap = new HashMap<>();
    this.isInFipsMode = configure(paramBoolean, paramJcaTlsCryptoProvider);
  }
  
  public Provider configure(String paramString) {
    return new BouncyCastleJsseProvider(paramString);
  }
  
  private JcaTlsCryptoProvider createCryptoProvider(String paramString) throws GeneralSecurityException {
    if (paramString.equalsIgnoreCase("default"))
      return new JcaTlsCryptoProvider(); 
    Provider provider = Security.getProvider(paramString);
    if (provider != null)
      return (new JcaTlsCryptoProvider()).setProvider(provider); 
    try {
      Class<?> clazz = Class.forName(paramString);
      Object object = clazz.newInstance();
      if (object instanceof JcaTlsCryptoProvider)
        return (JcaTlsCryptoProvider)object; 
      if (object instanceof Provider)
        return (new JcaTlsCryptoProvider()).setProvider((Provider)object); 
      throw new IllegalArgumentException("unrecognized class: " + paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new IllegalArgumentException("unable to find Provider/JcaTlsCryptoProvider class: " + paramString);
    } catch (InstantiationException instantiationException) {
      throw new IllegalArgumentException("unable to create Provider/JcaTlsCryptoProvider class '" + paramString + "': " + instantiationException.getMessage(), instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      throw new IllegalArgumentException("unable to create Provider/JcaTlsCryptoProvider class '" + paramString + "': " + illegalAccessException.getMessage(), illegalAccessException);
    } 
  }
  
  private boolean configure(final boolean fipsMode, final JcaTlsCryptoProvider cryptoProvider) {
    addAlgorithmImplementation("KeyManagerFactory.X.509", "org.bouncycastle.jsse.provider.KeyManagerFactory", new EngineCreator() {
          public Object createInstance(Object param1Object) {
            return new ProvKeyManagerFactorySpi(fipsMode, cryptoProvider.getHelper());
          }
        });
    addAlias("Alg.Alias.KeyManagerFactory.X509", "X.509");
    addAlias("Alg.Alias.KeyManagerFactory.PKIX", "X.509");
    addAlgorithmImplementation("TrustManagerFactory.PKIX", "org.bouncycastle.jsse.provider.TrustManagerFactory", new EngineCreator() {
          public Object createInstance(Object param1Object) {
            return new ProvTrustManagerFactorySpi(fipsMode, cryptoProvider.getHelper());
          }
        });
    addAlias("Alg.Alias.TrustManagerFactory.X.509", "PKIX");
    addAlias("Alg.Alias.TrustManagerFactory.X509", "PKIX");
    addAlgorithmImplementation("SSLContext.TLS", "org.bouncycastle.jsse.provider.SSLContext.TLS", new EngineCreator() {
          public Object createInstance(Object param1Object) {
            return new ProvSSLContextSpi(fipsMode, cryptoProvider, null);
          }
        });
    addAlgorithmImplementation("SSLContext.TLSV1", "org.bouncycastle.jsse.provider.SSLContext.TLSv1", new EngineCreator() {
          public Object createInstance(Object param1Object) {
            return new ProvSSLContextSpi(fipsMode, cryptoProvider, BouncyCastleJsseProvider.specifyClientProtocols(new String[] { "TLSv1" }));
          }
        });
    addAlgorithmImplementation("SSLContext.TLSV1.1", "org.bouncycastle.jsse.provider.SSLContext.TLSv1_1", new EngineCreator() {
          public Object createInstance(Object param1Object) {
            return new ProvSSLContextSpi(fipsMode, cryptoProvider, BouncyCastleJsseProvider.specifyClientProtocols(new String[] { "TLSv1.1", "TLSv1" }));
          }
        });
    addAlgorithmImplementation("SSLContext.TLSV1.2", "org.bouncycastle.jsse.provider.SSLContext.TLSv1_2", new EngineCreator() {
          public Object createInstance(Object param1Object) {
            return new ProvSSLContextSpi(fipsMode, cryptoProvider, BouncyCastleJsseProvider.specifyClientProtocols(new String[] { "TLSv1.2", "TLSv1.1", "TLSv1" }));
          }
        });
    addAlgorithmImplementation("SSLContext.TLSV1.3", "org.bouncycastle.jsse.provider.SSLContext.TLSv1_3", new EngineCreator() {
          public Object createInstance(Object param1Object) {
            return new ProvSSLContextSpi(fipsMode, cryptoProvider, BouncyCastleJsseProvider.specifyClientProtocols(new String[] { "TLSv1.3", "TLSv1.2", "TLSv1.1", "TLSv1" }));
          }
        });
    addAlgorithmImplementation("SSLContext.DEFAULT", "org.bouncycastle.jsse.provider.SSLContext.Default", new EngineCreator() {
          public Object createInstance(Object param1Object) throws GeneralSecurityException {
            return new DefaultSSLContextSpi(fipsMode, cryptoProvider);
          }
        });
    addAlias("Alg.Alias.SSLContext.SSL", "TLS");
    addAlias("Alg.Alias.SSLContext.SSLV3", "TLSV1");
    return fipsMode;
  }
  
  void addAttribute(String paramString1, String paramString2, String paramString3) {
    String str = paramString1 + " " + paramString2;
    if (containsKey(str))
      throw new IllegalStateException("duplicate provider attribute key (" + str + ") found"); 
    doPut(str, paramString3);
  }
  
  void addAlgorithmImplementation(String paramString1, String paramString2, EngineCreator paramEngineCreator) {
    if (containsKey(paramString1))
      throw new IllegalStateException("duplicate provider key (" + paramString1 + ") found"); 
    addAttribute(paramString1, "ImplementedIn", "Software");
    doPut(paramString1, paramString2);
    this.creatorMap.put(paramString2, paramEngineCreator);
  }
  
  void addAlias(String paramString1, String paramString2) {
    if (containsKey(paramString1))
      throw new IllegalStateException("duplicate provider key (" + paramString1 + ") found"); 
    doPut(paramString1, paramString2);
  }
  
  public final Provider.Service getService(String paramString1, String paramString2) {
    String str1 = Strings.toUpperCase(paramString2);
    String str2 = paramString1 + "." + str1;
    BcJsseService bcJsseService = this.serviceMap.get(str2);
    if (bcJsseService == null) {
      String str3 = "Alg.Alias." + paramString1 + ".";
      String str4 = (String)get(str3 + str1);
      if (str4 == null)
        str4 = str1; 
      String str5 = (String)get(paramString1 + "." + str4);
      if (str5 == null)
        return null; 
      String str6 = paramString1 + "." + str4 + " ";
      ArrayList<String> arrayList = new ArrayList();
      HashMap<Object, Object> hashMap = new HashMap<>();
      for (String str7 : keySet()) {
        String str8 = str7;
        if (str8.startsWith(str3) && get(str7).equals(paramString2))
          arrayList.add(str8.substring(str3.length())); 
        if (str8.startsWith(str6))
          hashMap.put(str8.substring(str6.length()), get(str8)); 
      } 
      synchronized (this) {
        if (!this.serviceMap.containsKey(str2)) {
          bcJsseService = new BcJsseService(this, paramString1, str1, str5, arrayList, getAttributeMap((Map)hashMap), this.creatorMap.get(str5));
          this.serviceMap.put(str2, bcJsseService);
        } else {
          bcJsseService = this.serviceMap.get(str2);
        } 
      } 
    } 
    return bcJsseService;
  }
  
  public final synchronized Set<Provider.Service> getServices() {
    Set<Provider.Service> set = super.getServices();
    HashSet<Provider.Service> hashSet = new HashSet();
    for (Provider.Service service : set)
      hashSet.add(getService(service.getType(), service.getAlgorithm())); 
    return hashSet;
  }
  
  private static synchronized Map<String, String> getAttributeMap(Map<String, String> paramMap) {
    Map<String, String> map = attributeMaps.get(paramMap);
    if (map != null)
      return map; 
    attributeMaps.put(paramMap, paramMap);
    return paramMap;
  }
  
  private Object doPut(final String key, final String value) {
    return AccessController.doPrivileged(new PrivilegedAction() {
          public Object run() {
            return BouncyCastleJsseProvider.this.put(key, value);
          }
        });
  }
  
  private static List<String> specifyClientProtocols(String... paramVarArgs) {
    return Arrays.asList(paramVarArgs);
  }
  
  public boolean isFipsMode() {
    return this.isInFipsMode;
  }
  
  private static String getPropertyValue(final String propertyName, final String defValue) {
    return AccessController.<String>doPrivileged(new PrivilegedAction<String>() {
          public String run() {
            String str = Security.getProperty(propertyName);
            if (str != null)
              return str; 
            str = System.getProperty(propertyName);
            return (str != null) ? str : defValue;
          }
        });
  }
  
  private static class BcJsseService extends Provider.Service {
    private final EngineCreator creator;
    
    public BcJsseService(Provider param1Provider, String param1String1, String param1String2, String param1String3, List<String> param1List, Map<String, String> param1Map, EngineCreator param1EngineCreator) {
      super(param1Provider, param1String1, param1String2, param1String3, param1List, param1Map);
      this.creator = param1EngineCreator;
    }
    
    public Object newInstance(Object param1Object) throws NoSuchAlgorithmException {
      try {
        Object object = this.creator.createInstance(param1Object);
        if (object == null)
          throw new NoSuchAlgorithmException("No such algorithm in FIPS approved mode: " + getAlgorithm()); 
        return object;
      } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        throw noSuchAlgorithmException;
      } catch (Exception exception) {
        throw new NoSuchAlgorithmException("Unable to invoke creator for " + getAlgorithm() + ": " + exception.getMessage(), exception);
      } 
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\BouncyCastleJsseProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */