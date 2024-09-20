package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.AccessController;
import java.security.GeneralSecurityException;
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
import org.bouncycastle.jsse.provider.EngineCreator;
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
    return new org.bouncycastle.jsse.provider.BouncyCastleJsseProvider(paramString);
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
  
  private boolean configure(boolean paramBoolean, JcaTlsCryptoProvider paramJcaTlsCryptoProvider) {
    addAlgorithmImplementation("KeyManagerFactory.X.509", "org.bouncycastle.jsse.provider.KeyManagerFactory", (EngineCreator)new Object(this, paramBoolean, paramJcaTlsCryptoProvider));
    addAlias("Alg.Alias.KeyManagerFactory.X509", "X.509");
    addAlias("Alg.Alias.KeyManagerFactory.PKIX", "X.509");
    addAlgorithmImplementation("TrustManagerFactory.PKIX", "org.bouncycastle.jsse.provider.TrustManagerFactory", (EngineCreator)new Object(this, paramBoolean, paramJcaTlsCryptoProvider));
    addAlias("Alg.Alias.TrustManagerFactory.X.509", "PKIX");
    addAlias("Alg.Alias.TrustManagerFactory.X509", "PKIX");
    addAlgorithmImplementation("SSLContext.TLS", "org.bouncycastle.jsse.provider.SSLContext.TLS", (EngineCreator)new Object(this, paramBoolean, paramJcaTlsCryptoProvider));
    addAlgorithmImplementation("SSLContext.TLSV1", "org.bouncycastle.jsse.provider.SSLContext.TLSv1", (EngineCreator)new Object(this, paramBoolean, paramJcaTlsCryptoProvider));
    addAlgorithmImplementation("SSLContext.TLSV1.1", "org.bouncycastle.jsse.provider.SSLContext.TLSv1_1", (EngineCreator)new Object(this, paramBoolean, paramJcaTlsCryptoProvider));
    addAlgorithmImplementation("SSLContext.TLSV1.2", "org.bouncycastle.jsse.provider.SSLContext.TLSv1_2", (EngineCreator)new Object(this, paramBoolean, paramJcaTlsCryptoProvider));
    addAlgorithmImplementation("SSLContext.TLSV1.3", "org.bouncycastle.jsse.provider.SSLContext.TLSv1_3", (EngineCreator)new Object(this, paramBoolean, paramJcaTlsCryptoProvider));
    addAlgorithmImplementation("SSLContext.DEFAULT", "org.bouncycastle.jsse.provider.SSLContext.Default", (EngineCreator)new Object(this, paramBoolean, paramJcaTlsCryptoProvider));
    addAlias("Alg.Alias.SSLContext.SSL", "TLS");
    addAlias("Alg.Alias.SSLContext.SSLV3", "TLSV1");
    return paramBoolean;
  }
  
  void addAttribute(String paramString1, String paramString2, String paramString3) {
    String str = paramString1 + " " + paramString1;
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
    String str2 = paramString1 + "." + paramString1;
    BcJsseService bcJsseService = this.serviceMap.get(str2);
    if (bcJsseService == null) {
      String str3 = "Alg.Alias." + paramString1 + ".";
      String str4 = (String)get(str3 + str3);
      if (str4 == null)
        str4 = str1; 
      String str5 = (String)get(paramString1 + "." + paramString1);
      if (str5 == null)
        return null; 
      String str6 = paramString1 + "." + paramString1 + " ";
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
    return (Provider.Service)bcJsseService;
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
  
  private Object doPut(String paramString1, String paramString2) {
    return AccessController.doPrivileged((PrivilegedAction<?>)new Object(this, paramString1, paramString2));
  }
  
  private static List<String> specifyClientProtocols(String... paramVarArgs) {
    return Arrays.asList(paramVarArgs);
  }
  
  public boolean isFipsMode() {
    return this.isInFipsMode;
  }
  
  private static String getPropertyValue(String paramString1, String paramString2) {
    return AccessController.<String>doPrivileged((PrivilegedAction<String>)new Object(paramString1, paramString2));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\BouncyCastleJsseProvider.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */