package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jsse.BCX509ExtendedKeyManager;
import org.bouncycastle.jsse.BCX509Key;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.jsse.provider.JsseUtils;
import org.bouncycastle.jsse.provider.ProvX509Key;
import org.bouncycastle.jsse.provider.ProvX509KeyManager;
import org.bouncycastle.jsse.provider.TransportData;
import org.bouncycastle.tls.TlsUtils;

class ProvX509KeyManagerSimple extends BCX509ExtendedKeyManager {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jsse.provider.ProvX509KeyManagerSimple.class.getName());
  
  private final boolean isInFipsMode;
  
  private final JcaJceHelper helper;
  
  private final Map<String, Credential> credentials;
  
  private static Map<String, Credential> loadCredentials(KeyStore paramKeyStore, char[] paramArrayOfchar) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
    HashMap<Object, Object> hashMap = new HashMap<>(4);
    if (null != paramKeyStore) {
      Enumeration<String> enumeration = paramKeyStore.aliases();
      while (enumeration.hasMoreElements()) {
        String str = enumeration.nextElement();
        if (!paramKeyStore.entryInstanceOf(str, (Class)KeyStore.PrivateKeyEntry.class))
          continue; 
        PrivateKey privateKey = (PrivateKey)paramKeyStore.getKey(str, paramArrayOfchar);
        if (null == privateKey)
          continue; 
        X509Certificate[] arrayOfX509Certificate = JsseUtils.getX509CertificateChain(paramKeyStore.getCertificateChain(str));
        if (TlsUtils.isNullOrEmpty((Object[])arrayOfX509Certificate))
          continue; 
        hashMap.put(str, new Credential(str, privateKey, arrayOfX509Certificate));
      } 
    } 
    return (Map)Collections.unmodifiableMap(hashMap);
  }
  
  ProvX509KeyManagerSimple(boolean paramBoolean, JcaJceHelper paramJcaJceHelper, KeyStore paramKeyStore, char[] paramArrayOfchar) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
    this.isInFipsMode = paramBoolean;
    this.helper = paramJcaJceHelper;
    this.credentials = loadCredentials(paramKeyStore, paramArrayOfchar);
  }
  
  public String chooseClientAlias(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    return chooseAlias(ProvX509KeyManager.getKeyTypes(paramArrayOfString), paramArrayOfPrincipal, TransportData.from(paramSocket), false);
  }
  
  public BCX509Key chooseClientKeyBC(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    return chooseKeyBC(ProvX509KeyManager.getKeyTypes(paramArrayOfString), paramArrayOfPrincipal, TransportData.from(paramSocket), false);
  }
  
  public String chooseEngineClientAlias(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, SSLEngine paramSSLEngine) {
    return chooseAlias(ProvX509KeyManager.getKeyTypes(paramArrayOfString), paramArrayOfPrincipal, TransportData.from(paramSSLEngine), false);
  }
  
  public BCX509Key chooseEngineClientKeyBC(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, SSLEngine paramSSLEngine) {
    return chooseKeyBC(ProvX509KeyManager.getKeyTypes(paramArrayOfString), paramArrayOfPrincipal, TransportData.from(paramSSLEngine), false);
  }
  
  public String chooseEngineServerAlias(String paramString, Principal[] paramArrayOfPrincipal, SSLEngine paramSSLEngine) {
    return chooseAlias(ProvX509KeyManager.getKeyTypes(new String[] { paramString }, ), paramArrayOfPrincipal, TransportData.from(paramSSLEngine), true);
  }
  
  public BCX509Key chooseEngineServerKeyBC(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, SSLEngine paramSSLEngine) {
    return chooseKeyBC(ProvX509KeyManager.getKeyTypes(paramArrayOfString), paramArrayOfPrincipal, TransportData.from(paramSSLEngine), true);
  }
  
  public String chooseServerAlias(String paramString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    return chooseAlias(ProvX509KeyManager.getKeyTypes(new String[] { paramString }, ), paramArrayOfPrincipal, TransportData.from(paramSocket), true);
  }
  
  public BCX509Key chooseServerKeyBC(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    return chooseKeyBC(ProvX509KeyManager.getKeyTypes(paramArrayOfString), paramArrayOfPrincipal, TransportData.from(paramSocket), true);
  }
  
  public X509Certificate[] getCertificateChain(String paramString) {
    Credential credential = getCredential(paramString);
    return (null == credential) ? null : (X509Certificate[])Credential.access$000(credential).clone();
  }
  
  public String[] getClientAliases(String paramString, Principal[] paramArrayOfPrincipal) {
    return getAliases(ProvX509KeyManager.getKeyTypes(new String[] { paramString }, ), paramArrayOfPrincipal, null, false);
  }
  
  public PrivateKey getPrivateKey(String paramString) {
    Credential credential = getCredential(paramString);
    return (null == credential) ? null : Credential.access$100(credential);
  }
  
  public String[] getServerAliases(String paramString, Principal[] paramArrayOfPrincipal) {
    return getAliases(ProvX509KeyManager.getKeyTypes(new String[] { paramString }, ), paramArrayOfPrincipal, null, true);
  }
  
  protected BCX509Key getKeyBC(String paramString1, String paramString2) {
    Credential credential = getCredential(paramString2);
    return createKeyBC(paramString1, credential);
  }
  
  private String chooseAlias(List<String> paramList, Principal[] paramArrayOfPrincipal, TransportData paramTransportData, boolean paramBoolean) {
    Match match = getBestMatch(paramList, paramArrayOfPrincipal, paramTransportData, paramBoolean);
    if (match.compareTo(Match.NOTHING) < 0) {
      String str1 = paramList.get(match.keyTypeIndex);
      String str2 = getAlias(match);
      if (LOG.isLoggable(Level.FINE))
        LOG.fine("Found matching key of type: " + str1 + ", returning alias: " + str2); 
      return str2;
    } 
    LOG.fine("No matching key found");
    return null;
  }
  
  private BCX509Key chooseKeyBC(List<String> paramList, Principal[] paramArrayOfPrincipal, TransportData paramTransportData, boolean paramBoolean) {
    Match match = getBestMatch(paramList, paramArrayOfPrincipal, paramTransportData, paramBoolean);
    if (match.compareTo(Match.NOTHING) < 0) {
      String str = paramList.get(match.keyTypeIndex);
      BCX509Key bCX509Key = createKeyBC(str, match.credential);
      if (null != bCX509Key) {
        if (LOG.isLoggable(Level.FINE))
          LOG.fine("Found matching key of type: " + str + ", from alias: " + getAlias(match)); 
        return bCX509Key;
      } 
    } 
    LOG.fine("No matching key found");
    return null;
  }
  
  private BCX509Key createKeyBC(String paramString, Credential paramCredential) {
    return (null == paramCredential) ? null : (BCX509Key)new ProvX509Key(paramString, Credential.access$100(paramCredential), Credential.access$000(paramCredential));
  }
  
  private String[] getAliases(List<String> paramList, Principal[] paramArrayOfPrincipal, TransportData paramTransportData, boolean paramBoolean) {
    if (!this.credentials.isEmpty() && !paramList.isEmpty()) {
      int i = paramList.size();
      Set<Principal> set = ProvX509KeyManager.getUniquePrincipals(paramArrayOfPrincipal);
      BCAlgorithmConstraints bCAlgorithmConstraints = TransportData.getAlgorithmConstraints(paramTransportData, true);
      Date date = new Date();
      String str = ProvX509KeyManager.getRequestedHostName(paramTransportData, paramBoolean);
      List<Match> list = null;
      for (Credential credential : this.credentials.values()) {
        Match match = getPotentialMatch(credential, paramList, i, set, bCAlgorithmConstraints, paramBoolean, date, str);
        if (match.compareTo(Match.NOTHING) < 0)
          list = addToMatches(list, match); 
      } 
      if (null != list && !list.isEmpty()) {
        Collections.sort(list);
        return getAliases(list);
      } 
    } 
    return null;
  }
  
  private Match getBestMatch(List<String> paramList, Principal[] paramArrayOfPrincipal, TransportData paramTransportData, boolean paramBoolean) {
    Match match = Match.NOTHING;
    if (!this.credentials.isEmpty() && !paramList.isEmpty()) {
      int i = paramList.size();
      Set<Principal> set = ProvX509KeyManager.getUniquePrincipals(paramArrayOfPrincipal);
      BCAlgorithmConstraints bCAlgorithmConstraints = TransportData.getAlgorithmConstraints(paramTransportData, true);
      Date date = new Date();
      String str = ProvX509KeyManager.getRequestedHostName(paramTransportData, paramBoolean);
      for (Credential credential : this.credentials.values()) {
        Match match1 = getPotentialMatch(credential, paramList, i, set, bCAlgorithmConstraints, paramBoolean, date, str);
        if (match1.compareTo(match) < 0) {
          match = match1;
          if (match.isIdeal())
            return match; 
          if (match.isValid())
            i = Math.min(i, match.keyTypeIndex + 1); 
        } 
      } 
    } 
    return match;
  }
  
  private Match getPotentialMatch(Credential paramCredential, List<String> paramList, int paramInt, Set<Principal> paramSet, BCAlgorithmConstraints paramBCAlgorithmConstraints, boolean paramBoolean, Date paramDate, String paramString) {
    X509Certificate[] arrayOfX509Certificate = Credential.access$000(paramCredential);
    int i = ProvX509KeyManager.getPotentialKeyType(paramList, paramInt, paramSet, paramBCAlgorithmConstraints, paramBoolean, arrayOfX509Certificate);
    if (i >= 0) {
      ProvX509KeyManager.MatchQuality matchQuality = ProvX509KeyManager.getKeyTypeQuality(this.isInFipsMode, this.helper, paramList, paramBCAlgorithmConstraints, paramBoolean, paramDate, paramString, arrayOfX509Certificate, i);
      if (ProvX509KeyManager.MatchQuality.NONE != matchQuality)
        return new Match(matchQuality, i, paramCredential); 
    } 
    return Match.NOTHING;
  }
  
  private Credential getCredential(String paramString) {
    return (null == paramString) ? null : this.credentials.get(paramString);
  }
  
  private static List<Match> addToMatches(List<Match> paramList, Match paramMatch) {
    if (null == paramList)
      paramList = new ArrayList<>(); 
    paramList.add(paramMatch);
    return paramList;
  }
  
  private static String getAlias(Match paramMatch) {
    return Credential.access$200(paramMatch.credential);
  }
  
  private static String[] getAliases(List<Match> paramList) {
    int i = paramList.size();
    byte b = 0;
    String[] arrayOfString = new String[i];
    for (Match match : paramList)
      arrayOfString[b++] = getAlias(match); 
    return arrayOfString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvX509KeyManagerSimple.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */