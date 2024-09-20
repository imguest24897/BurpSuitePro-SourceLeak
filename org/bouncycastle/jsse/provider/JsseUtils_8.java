package org.bouncycastle.jsse.provider;

import java.security.cert.CertPathBuilder;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIMatcher;
import javax.net.ssl.SNIServerName;
import org.bouncycastle.jsse.BCApplicationProtocolSelector;
import org.bouncycastle.jsse.BCSNIHostName;
import org.bouncycastle.jsse.BCSNIMatcher;
import org.bouncycastle.jsse.BCSNIServerName;

abstract class JsseUtils_8 extends JsseUtils_7 {
  static void addStatusResponses(CertPathBuilder paramCertPathBuilder, PKIXBuilderParameters paramPKIXBuilderParameters, Map<X509Certificate, byte[]> paramMap) {
    if (paramMap.isEmpty())
      return; 
    List<PKIXCertPathChecker> list = paramPKIXBuilderParameters.getCertPathCheckers();
    PKIXRevocationChecker pKIXRevocationChecker = getFirstRevocationChecker(list);
    if (null != pKIXRevocationChecker) {
      Map<X509Certificate, byte[]> map = pKIXRevocationChecker.getOcspResponses();
      if (putAnyAbsent((Map)map, (Map)paramMap) > 0) {
        pKIXRevocationChecker.setOcspResponses(map);
        paramPKIXBuilderParameters.setCertPathCheckers(list);
      } 
    } else if (paramPKIXBuilderParameters.isRevocationEnabled()) {
      PKIXRevocationChecker pKIXRevocationChecker1 = (PKIXRevocationChecker)paramCertPathBuilder.getRevocationChecker();
      pKIXRevocationChecker1.setOcspResponses(paramMap);
      paramPKIXBuilderParameters.addCertPathChecker(pKIXRevocationChecker1);
    } 
  }
  
  static <T> BiFunction<T, List<String>, String> exportAPSelector(BCApplicationProtocolSelector<T> paramBCApplicationProtocolSelector) {
    return (null == paramBCApplicationProtocolSelector) ? null : ((paramBCApplicationProtocolSelector instanceof ImportAPSelector) ? ((ImportAPSelector<T>)paramBCApplicationProtocolSelector).unwrap() : new ExportAPSelector<>(paramBCApplicationProtocolSelector));
  }
  
  static SNIMatcher exportSNIMatcher(BCSNIMatcher paramBCSNIMatcher) {
    return (null == paramBCSNIMatcher) ? null : ((paramBCSNIMatcher instanceof ImportSNIMatcher) ? ((ImportSNIMatcher)paramBCSNIMatcher).unwrap() : new ExportSNIMatcher(paramBCSNIMatcher));
  }
  
  static List<SNIMatcher> exportSNIMatchers(Collection<BCSNIMatcher> paramCollection) {
    if (null == paramCollection || paramCollection.isEmpty())
      return Collections.emptyList(); 
    ArrayList<SNIMatcher> arrayList = new ArrayList(paramCollection.size());
    for (BCSNIMatcher bCSNIMatcher : paramCollection)
      arrayList.add(exportSNIMatcher(bCSNIMatcher)); 
    return Collections.unmodifiableList(arrayList);
  }
  
  static Object exportSNIMatchersDynamic(Collection<BCSNIMatcher> paramCollection) {
    return exportSNIMatchers(paramCollection);
  }
  
  static SNIServerName exportSNIServerName(BCSNIServerName paramBCSNIServerName) {
    if (null == paramBCSNIServerName)
      return null; 
    int i = paramBCSNIServerName.getType();
    byte[] arrayOfByte = paramBCSNIServerName.getEncoded();
    switch (i) {
      case 0:
        return new SNIHostName(arrayOfByte);
    } 
    return new UnknownServerName(i, arrayOfByte);
  }
  
  static List<SNIServerName> exportSNIServerNames(Collection<BCSNIServerName> paramCollection) {
    if (null == paramCollection || paramCollection.isEmpty())
      return Collections.emptyList(); 
    ArrayList<SNIServerName> arrayList = new ArrayList(paramCollection.size());
    for (BCSNIServerName bCSNIServerName : paramCollection)
      arrayList.add(exportSNIServerName(bCSNIServerName)); 
    return Collections.unmodifiableList(arrayList);
  }
  
  static Object exportSNIServerNamesDynamic(Collection<BCSNIServerName> paramCollection) {
    return exportSNIServerNames(paramCollection);
  }
  
  static PKIXRevocationChecker getFirstRevocationChecker(List<PKIXCertPathChecker> paramList) {
    for (PKIXCertPathChecker pKIXCertPathChecker : paramList) {
      if (pKIXCertPathChecker instanceof PKIXRevocationChecker)
        return (PKIXRevocationChecker)pKIXCertPathChecker; 
    } 
    return null;
  }
  
  static <T> BCApplicationProtocolSelector<T> importAPSelector(BiFunction<T, List<String>, String> paramBiFunction) {
    return (null == paramBiFunction) ? null : ((paramBiFunction instanceof ExportAPSelector) ? ((ExportAPSelector)paramBiFunction).unwrap() : new ImportAPSelector<>(paramBiFunction));
  }
  
  static BCSNIMatcher importSNIMatcher(SNIMatcher paramSNIMatcher) {
    return (null == paramSNIMatcher) ? null : ((paramSNIMatcher instanceof ExportSNIMatcher) ? ((ExportSNIMatcher)paramSNIMatcher).unwrap() : new ImportSNIMatcher(paramSNIMatcher));
  }
  
  static List<BCSNIMatcher> importSNIMatchers(Collection<SNIMatcher> paramCollection) {
    if (null == paramCollection || paramCollection.isEmpty())
      return Collections.emptyList(); 
    ArrayList<BCSNIMatcher> arrayList = new ArrayList(paramCollection.size());
    for (SNIMatcher sNIMatcher : paramCollection)
      arrayList.add(importSNIMatcher(sNIMatcher)); 
    return Collections.unmodifiableList(arrayList);
  }
  
  static List<BCSNIMatcher> importSNIMatchersDynamic(Object paramObject) {
    return importSNIMatchers((Collection<SNIMatcher>)paramObject);
  }
  
  static BCSNIServerName importSNIServerName(SNIServerName paramSNIServerName) {
    if (null == paramSNIServerName)
      return null; 
    int i = paramSNIServerName.getType();
    byte[] arrayOfByte = paramSNIServerName.getEncoded();
    switch (i) {
      case 0:
        return (BCSNIServerName)new BCSNIHostName(arrayOfByte);
    } 
    return new JsseUtils.BCUnknownServerName(i, arrayOfByte);
  }
  
  static List<BCSNIServerName> importSNIServerNames(Collection<SNIServerName> paramCollection) {
    if (null == paramCollection || paramCollection.isEmpty())
      return Collections.emptyList(); 
    ArrayList<BCSNIServerName> arrayList = new ArrayList(paramCollection.size());
    for (SNIServerName sNIServerName : paramCollection)
      arrayList.add(importSNIServerName(sNIServerName)); 
    return Collections.unmodifiableList(arrayList);
  }
  
  static List<BCSNIServerName> importSNIServerNamesDynamic(Object paramObject) {
    return importSNIServerNames((Collection<SNIServerName>)paramObject);
  }
  
  static <K, V> int putAnyAbsent(Map<K, V> paramMap1, Map<K, V> paramMap2) {
    byte b = 0;
    for (Map.Entry<K, V> entry : paramMap2.entrySet()) {
      if (null == paramMap1.putIfAbsent((K)entry.getKey(), (V)entry.getValue()))
        b++; 
    } 
    return b;
  }
  
  static class ExportAPSelector<T> implements BiFunction<T, List<String>, String> {
    private final BCApplicationProtocolSelector<T> selector;
    
    ExportAPSelector(BCApplicationProtocolSelector<T> param1BCApplicationProtocolSelector) {
      this.selector = param1BCApplicationProtocolSelector;
    }
    
    public String apply(T param1T, List<String> param1List) {
      return this.selector.select(param1T, param1List);
    }
    
    BCApplicationProtocolSelector<T> unwrap() {
      return this.selector;
    }
  }
  
  static class ExportSNIMatcher extends SNIMatcher {
    private final BCSNIMatcher matcher;
    
    ExportSNIMatcher(BCSNIMatcher param1BCSNIMatcher) {
      super(param1BCSNIMatcher.getType());
      this.matcher = param1BCSNIMatcher;
    }
    
    public boolean matches(SNIServerName param1SNIServerName) {
      return this.matcher.matches(JsseUtils_8.importSNIServerName(param1SNIServerName));
    }
    
    BCSNIMatcher unwrap() {
      return this.matcher;
    }
  }
  
  static class ImportAPSelector<T> implements BCApplicationProtocolSelector<T> {
    private final BiFunction<T, List<String>, String> selector;
    
    ImportAPSelector(BiFunction<T, List<String>, String> param1BiFunction) {
      this.selector = param1BiFunction;
    }
    
    public String select(T param1T, List<String> param1List) {
      return this.selector.apply(param1T, param1List);
    }
    
    BiFunction<T, List<String>, String> unwrap() {
      return this.selector;
    }
  }
  
  static class ImportSNIMatcher extends BCSNIMatcher {
    private final SNIMatcher matcher;
    
    ImportSNIMatcher(SNIMatcher param1SNIMatcher) {
      super(param1SNIMatcher.getType());
      this.matcher = param1SNIMatcher;
    }
    
    public boolean matches(BCSNIServerName param1BCSNIServerName) {
      return this.matcher.matches(JsseUtils_8.exportSNIServerName(param1BCSNIServerName));
    }
    
    SNIMatcher unwrap() {
      return this.matcher;
    }
  }
  
  static class UnknownServerName extends SNIServerName {
    UnknownServerName(int param1Int, byte[] param1ArrayOfbyte) {
      super(param1Int, param1ArrayOfbyte);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\JsseUtils_8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */