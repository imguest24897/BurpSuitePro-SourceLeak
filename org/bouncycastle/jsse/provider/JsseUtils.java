package org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ocsp.OCSPResponse;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jsse.BCSNIHostName;
import org.bouncycastle.jsse.BCSNIMatcher;
import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.jsse.BCX509ExtendedTrustManager;
import org.bouncycastle.jsse.BCX509Key;
import org.bouncycastle.jsse.java.security.BCCryptoPrimitive;
import org.bouncycastle.tls.AlertDescription;
import org.bouncycastle.tls.AlertLevel;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.CertificateEntry;
import org.bouncycastle.tls.CertificateStatus;
import org.bouncycastle.tls.NamedGroup;
import org.bouncycastle.tls.ProtocolName;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.ServerName;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsContext;
import org.bouncycastle.tls.TlsCredentialedDecryptor;
import org.bouncycastle.tls.TlsCredentialedSigner;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.TrustedAuthority;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaDefaultTlsCredentialedSigner;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCertificate;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.tls.crypto.impl.jcajce.JceDefaultTlsCredentialedDecryptor;
import org.bouncycastle.util.encoders.Hex;

abstract class JsseUtils {
  private static final boolean provTlsAllowLegacyMasterSecret = PropertyUtils.getBooleanSystemProperty("jdk.tls.allowLegacyMasterSecret", true);
  
  private static final boolean provTlsAllowLegacyResumption = PropertyUtils.getBooleanSystemProperty("jdk.tls.allowLegacyResumption", false);
  
  private static final int provTlsMaxCertificateChainLength = PropertyUtils.getIntegerSystemProperty("jdk.tls.maxCertificateChainLength", 10, 1, 2147483647);
  
  private static final int provTlsMaxHandshakeMessageSize = PropertyUtils.getIntegerSystemProperty("jdk.tls.maxHandshakeMessageSize", 32768, 1024, 2147483647);
  
  private static final boolean provTlsRequireCloseNotify = PropertyUtils.getBooleanSystemProperty("com.sun.net.ssl.requireCloseNotify", true);
  
  private static final boolean provTlsUseCompatibilityMode = PropertyUtils.getBooleanSystemProperty("jdk.tls.client.useCompatibilityMode", true);
  
  private static final boolean provTlsUseExtendedMasterSecret = PropertyUtils.getBooleanSystemProperty("jdk.tls.useExtendedMasterSecret", true);
  
  static final Set<BCCryptoPrimitive> KEY_AGREEMENT_CRYPTO_PRIMITIVES_BC = Collections.unmodifiableSet(EnumSet.of(BCCryptoPrimitive.KEY_AGREEMENT));
  
  static final Set<BCCryptoPrimitive> KEY_ENCAPSULATION_CRYPTO_PRIMITIVES_BC = Collections.unmodifiableSet(EnumSet.of(BCCryptoPrimitive.KEY_ENCAPSULATION));
  
  static final Set<BCCryptoPrimitive> SIGNATURE_CRYPTO_PRIMITIVES_BC = Collections.unmodifiableSet(EnumSet.of(BCCryptoPrimitive.SIGNATURE));
  
  static String EMPTY_STRING = "";
  
  static X509Certificate[] EMPTY_X509CERTIFICATES = new X509Certificate[0];
  
  static boolean allowLegacyMasterSecret() {
    return provTlsAllowLegacyMasterSecret;
  }
  
  static boolean allowLegacyResumption() {
    return provTlsAllowLegacyResumption;
  }
  
  static void appendCipherSuiteDetail(StringBuilder paramStringBuilder, ProvSSLContextSpi paramProvSSLContextSpi, int paramInt) {
    paramStringBuilder.append("{0x");
    paramStringBuilder.append(Hex.toHexString(new byte[] { (byte)(paramInt >> 8) }));
    paramStringBuilder.append(",0x");
    paramStringBuilder.append(Hex.toHexString(new byte[] { (byte)paramInt }));
    paramStringBuilder.append('}');
    String str = ProvSSLContextSpi.getCipherSuiteName(paramInt);
    if (str == null) {
      paramStringBuilder.append('?');
    } else {
      paramStringBuilder.append('(');
      paramStringBuilder.append(str);
      paramStringBuilder.append(')');
    } 
  }
  
  static String getPeerID(String paramString, ProvTlsManager paramProvTlsManager) {
    long l = ProvSSLConnection.allocateConnectionID();
    int i = paramProvTlsManager.getTransportID();
    return "[" + paramString + " #" + l + " @" + Integer.toHexString(i) + "]";
  }
  
  static String getPeerReport(ProvTlsManager paramProvTlsManager) {
    String str1 = paramProvTlsManager.getPeerHost();
    if (str1 == null)
      str1 = "(unknown)"; 
    int i = paramProvTlsManager.getPeerPort();
    String str2 = (i < 0) ? "(unknown)" : Integer.toString(i);
    return str1 + ":" + str2;
  }
  
  static String getSignatureAlgorithmsReport(String paramString, List<SignatureSchemeInfo> paramList) {
    String[] arrayOfString = SignatureSchemeInfo.getJcaSignatureAlgorithmsBC(paramList);
    StringBuilder stringBuilder = new StringBuilder(paramString);
    stringBuilder.append(':');
    for (String str : arrayOfString) {
      stringBuilder.append(' ');
      stringBuilder.append(str);
    } 
    return stringBuilder.toString();
  }
  
  static void checkSessionCreationEnabled(ProvTlsManager paramProvTlsManager) {
    if (!paramProvTlsManager.getEnableSessionCreation())
      throw new IllegalStateException("Cannot resume session and session creation is disabled"); 
  }
  
  static <T> T[] clone(T[] paramArrayOfT) {
    return (null == paramArrayOfT) ? null : (T[])paramArrayOfT.clone();
  }
  
  static boolean contains(String[] paramArrayOfString, String paramString) {
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (paramString.equals(paramArrayOfString[b]))
        return true; 
    } 
    return false;
  }
  
  static <T> boolean containsNull(T[] paramArrayOfT) {
    for (byte b = 0; b < paramArrayOfT.length; b++) {
      if (null == paramArrayOfT[b])
        return true; 
    } 
    return false;
  }
  
  static String[] copyOf(String[] paramArrayOfString, int paramInt) {
    String[] arrayOfString = new String[paramInt];
    System.arraycopy(paramArrayOfString, 0, arrayOfString, 0, Math.min(paramArrayOfString.length, paramInt));
    return arrayOfString;
  }
  
  static TlsCredentialedDecryptor createCredentialedDecryptor(JcaTlsCrypto paramJcaTlsCrypto, BCX509Key paramBCX509Key) {
    PrivateKey privateKey = paramBCX509Key.getPrivateKey();
    Certificate certificate = getCertificateMessage(paramJcaTlsCrypto, paramBCX509Key.getCertificateChain());
    return (TlsCredentialedDecryptor)new JceDefaultTlsCredentialedDecryptor(paramJcaTlsCrypto, certificate, privateKey);
  }
  
  static TlsCredentialedSigner createCredentialedSigner(TlsContext paramTlsContext, JcaTlsCrypto paramJcaTlsCrypto, BCX509Key paramBCX509Key, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    TlsCryptoParameters tlsCryptoParameters = new TlsCryptoParameters(paramTlsContext);
    PrivateKey privateKey = paramBCX509Key.getPrivateKey();
    Certificate certificate = getCertificateMessage(paramJcaTlsCrypto, paramBCX509Key.getCertificateChain());
    return (TlsCredentialedSigner)new JcaDefaultTlsCredentialedSigner(tlsCryptoParameters, paramJcaTlsCrypto, privateKey, certificate, paramSignatureAndHashAlgorithm);
  }
  
  static TlsCredentialedSigner createCredentialedSigner13(TlsContext paramTlsContext, JcaTlsCrypto paramJcaTlsCrypto, BCX509Key paramBCX509Key, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, byte[] paramArrayOfbyte) {
    TlsCryptoParameters tlsCryptoParameters = new TlsCryptoParameters(paramTlsContext);
    PrivateKey privateKey = paramBCX509Key.getPrivateKey();
    Certificate certificate = getCertificateMessage13(paramJcaTlsCrypto, paramBCX509Key.getCertificateChain(), paramArrayOfbyte);
    return (TlsCredentialedSigner)new JcaDefaultTlsCredentialedSigner(tlsCryptoParameters, paramJcaTlsCrypto, privateKey, certificate, paramSignatureAndHashAlgorithm);
  }
  
  static boolean equals(Object paramObject1, Object paramObject2) {
    return (paramObject1 == paramObject2 || (null != paramObject1 && null != paramObject2 && paramObject1.equals(paramObject2)));
  }
  
  static int getMaxCertificateChainLength() {
    return provTlsMaxCertificateChainLength;
  }
  
  static int getMaxHandshakeMessageSize() {
    return provTlsMaxHandshakeMessageSize;
  }
  
  static ASN1ObjectIdentifier getNamedCurveOID(PublicKey paramPublicKey) {
    try {
      SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded());
      AlgorithmIdentifier algorithmIdentifier = subjectPublicKeyInfo.getAlgorithm();
      if (X9ObjectIdentifiers.id_ecPublicKey.equals((ASN1Primitive)algorithmIdentifier.getAlgorithm())) {
        ASN1Encodable aSN1Encodable = algorithmIdentifier.getParameters();
        if (null != aSN1Encodable) {
          ASN1Primitive aSN1Primitive = aSN1Encodable.toASN1Primitive();
          if (aSN1Primitive instanceof ASN1ObjectIdentifier)
            return (ASN1ObjectIdentifier)aSN1Primitive; 
        } 
      } 
    } catch (Exception exception) {}
    return null;
  }
  
  static String[] resize(String[] paramArrayOfString, int paramInt) {
    if (paramInt < paramArrayOfString.length)
      paramArrayOfString = copyOf(paramArrayOfString, paramInt); 
    return paramArrayOfString;
  }
  
  static String getApplicationProtocol(SecurityParameters paramSecurityParameters) {
    if (null == paramSecurityParameters || !paramSecurityParameters.isApplicationProtocolSet())
      return null; 
    ProtocolName protocolName = paramSecurityParameters.getApplicationProtocol();
    return (null == protocolName) ? "" : protocolName.getUtf8Decoding();
  }
  
  static String getAuthTypeServer(int paramInt) {
    switch (paramInt) {
      case 7:
        return "DH_DSS";
      case 9:
        return "DH_RSA";
      case 3:
        return "DHE_DSS";
      case 5:
        return "DHE_RSA";
      case 16:
        return "ECDH_ECDSA";
      case 18:
        return "ECDH_RSA";
      case 17:
        return "ECDHE_ECDSA";
      case 19:
        return "ECDHE_RSA";
      case 0:
        return "UNKNOWN";
      case 1:
        return "KE:RSA";
      case 22:
        return "SRP_DSS";
      case 23:
        return "SRP_RSA";
    } 
    throw new IllegalArgumentException();
  }
  
  static Vector<X500Name> getCertificateAuthorities(BCX509ExtendedTrustManager paramBCX509ExtendedTrustManager) {
    HashSet<X500Principal> hashSet = new HashSet();
    for (X509Certificate x509Certificate : paramBCX509ExtendedTrustManager.getAcceptedIssuers()) {
      if (x509Certificate.getBasicConstraints() >= 0) {
        hashSet.add(x509Certificate.getSubjectX500Principal());
      } else {
        hashSet.add(x509Certificate.getIssuerX500Principal());
      } 
    } 
    if (hashSet.isEmpty())
      return null; 
    Vector<X500Name> vector = new Vector(hashSet.size());
    for (X500Principal x500Principal : hashSet)
      vector.add(X500Name.getInstance(x500Principal.getEncoded())); 
    return vector;
  }
  
  static Certificate getCertificateMessage(JcaTlsCrypto paramJcaTlsCrypto, X509Certificate[] paramArrayOfX509Certificate) {
    if (TlsUtils.isNullOrEmpty((Object[])paramArrayOfX509Certificate))
      throw new IllegalArgumentException(); 
    TlsCertificate[] arrayOfTlsCertificate = new TlsCertificate[paramArrayOfX509Certificate.length];
    for (byte b = 0; b < paramArrayOfX509Certificate.length; b++)
      arrayOfTlsCertificate[b] = (TlsCertificate)new JcaTlsCertificate(paramJcaTlsCrypto, paramArrayOfX509Certificate[b]); 
    return new Certificate(arrayOfTlsCertificate);
  }
  
  static Certificate getCertificateMessage13(JcaTlsCrypto paramJcaTlsCrypto, X509Certificate[] paramArrayOfX509Certificate, byte[] paramArrayOfbyte) {
    if (TlsUtils.isNullOrEmpty((Object[])paramArrayOfX509Certificate))
      throw new IllegalArgumentException(); 
    CertificateEntry[] arrayOfCertificateEntry = new CertificateEntry[paramArrayOfX509Certificate.length];
    for (byte b = 0; b < paramArrayOfX509Certificate.length; b++) {
      JcaTlsCertificate jcaTlsCertificate = new JcaTlsCertificate(paramJcaTlsCrypto, paramArrayOfX509Certificate[b]);
      Hashtable hashtable = null;
      arrayOfCertificateEntry[b] = new CertificateEntry((TlsCertificate)jcaTlsCertificate, hashtable);
    } 
    return new Certificate(paramArrayOfbyte, arrayOfCertificateEntry);
  }
  
  static X509Certificate getEndEntity(JcaTlsCrypto paramJcaTlsCrypto, Certificate paramCertificate) throws IOException {
    return (paramCertificate == null || paramCertificate.isEmpty()) ? null : getX509Certificate(paramJcaTlsCrypto, paramCertificate.getCertificateAt(0));
  }
  
  static String getJcaSignatureAlgorithmBC(String paramString1, String paramString2) {
    return !paramString1.endsWith("withRSAandMGF1") ? paramString1 : (paramString1 + ":" + paramString2);
  }
  
  static String getKeyType13(String paramString, int paramInt) {
    return (paramInt < 0) ? paramString : (paramString + "/" + NamedGroup.getStandardName(paramInt));
  }
  
  static String getKeyTypeLegacyClient(short paramShort) {
    switch (paramShort) {
      case 2:
        return "DSA";
      case 64:
        return "EC";
      case 1:
        return "RSA";
    } 
    throw new IllegalArgumentException();
  }
  
  static String getKeyTypeLegacyServer(int paramInt) {
    return getAuthTypeServer(paramInt);
  }
  
  static Vector<ProtocolName> getProtocolNames(String[] paramArrayOfString) {
    if (TlsUtils.isNullOrEmpty((Object[])paramArrayOfString))
      return null; 
    Vector<ProtocolName> vector = new Vector(paramArrayOfString.length);
    for (String str : paramArrayOfString)
      vector.add(ProtocolName.asUtf8Encoding(str)); 
    return vector;
  }
  
  static List<String> getProtocolNames(Vector<ProtocolName> paramVector) {
    if (null == paramVector || paramVector.isEmpty())
      return null; 
    ArrayList<String> arrayList = new ArrayList(paramVector.size());
    for (ProtocolName protocolName : paramVector)
      arrayList.add(protocolName.getUtf8Decoding()); 
    return arrayList;
  }
  
  static byte[] getStatusResponse(OCSPResponse paramOCSPResponse) throws IOException {
    return (null == paramOCSPResponse) ? TlsUtils.EMPTY_BYTES : paramOCSPResponse.getEncoded("DER");
  }
  
  static List<byte[]> getStatusResponses(CertificateStatus paramCertificateStatus) throws IOException {
    if (null != paramCertificateStatus) {
      OCSPResponse oCSPResponse;
      Vector<OCSPResponse> vector;
      int i;
      ArrayList<byte[]> arrayList;
      byte b;
      switch (paramCertificateStatus.getStatusType()) {
        case 1:
          oCSPResponse = paramCertificateStatus.getOCSPResponse();
          return (List)Collections.singletonList(getStatusResponse(oCSPResponse));
        case 2:
          vector = paramCertificateStatus.getOCSPResponseList();
          i = vector.size();
          arrayList = new ArrayList(i);
          for (b = 0; b < i; b++) {
            OCSPResponse oCSPResponse1 = vector.elementAt(b);
            arrayList.add(getStatusResponse(oCSPResponse1));
          } 
          return (List)Collections.unmodifiableList(arrayList);
      } 
    } 
    return null;
  }
  
  static X500Principal[] getTrustedIssuers(Vector<TrustedAuthority> paramVector) throws IOException {
    if (null == paramVector || paramVector.isEmpty())
      return null; 
    int i = paramVector.size();
    X500Principal[] arrayOfX500Principal = new X500Principal[i];
    for (byte b = 0; b < i; b++) {
      TrustedAuthority trustedAuthority = paramVector.get(b);
      if (2 != trustedAuthority.getIdentifierType())
        return null; 
      arrayOfX500Principal[b] = toX500Principal(trustedAuthority.getX509Name());
    } 
    return arrayOfX500Principal;
  }
  
  static X509Certificate getX509Certificate(JcaTlsCrypto paramJcaTlsCrypto, TlsCertificate paramTlsCertificate) throws IOException {
    return JcaTlsCertificate.convert(paramJcaTlsCrypto, paramTlsCertificate).getX509Certificate();
  }
  
  static X509Certificate[] getX509CertificateChain(JcaTlsCrypto paramJcaTlsCrypto, Certificate paramCertificate) {
    if (paramCertificate == null || paramCertificate.isEmpty())
      return EMPTY_X509CERTIFICATES; 
    try {
      X509Certificate[] arrayOfX509Certificate = new X509Certificate[paramCertificate.getLength()];
      for (byte b = 0; b < arrayOfX509Certificate.length; b++)
        arrayOfX509Certificate[b] = JcaTlsCertificate.convert(paramJcaTlsCrypto, paramCertificate.getCertificateAt(b)).getX509Certificate(); 
      return arrayOfX509Certificate;
    } catch (IOException iOException) {
      throw new RuntimeException(iOException);
    } 
  }
  
  static X509Certificate[] getX509CertificateChain(Certificate[] paramArrayOfCertificate) {
    if (paramArrayOfCertificate == null)
      return null; 
    if (paramArrayOfCertificate instanceof X509Certificate[])
      return containsNull(paramArrayOfCertificate) ? null : (X509Certificate[])paramArrayOfCertificate; 
    X509Certificate[] arrayOfX509Certificate = new X509Certificate[paramArrayOfCertificate.length];
    for (byte b = 0; b < paramArrayOfCertificate.length; b++) {
      Certificate certificate = paramArrayOfCertificate[b];
      if (!(certificate instanceof X509Certificate))
        return null; 
      arrayOfX509Certificate[b] = (X509Certificate)certificate;
    } 
    return arrayOfX509Certificate;
  }
  
  static X500Principal getSubject(JcaTlsCrypto paramJcaTlsCrypto, Certificate paramCertificate) {
    if (paramCertificate == null || paramCertificate.isEmpty())
      return null; 
    try {
      return getX509Certificate(paramJcaTlsCrypto, paramCertificate.getCertificateAt(0)).getSubjectX500Principal();
    } catch (IOException iOException) {
      throw new RuntimeException(iOException);
    } 
  }
  
  static String getAlertRaisedLogMessage(String paramString, short paramShort1, short paramShort2) {
    return paramString + " raised " + AlertLevel.getText(paramShort1) + " " + AlertDescription.getText(paramShort2) + " alert";
  }
  
  static String getAlertReceivedLogMessage(String paramString, short paramShort1, short paramShort2) {
    return paramString + " received " + AlertLevel.getText(paramShort1) + " " + AlertDescription.getText(paramShort2) + " alert";
  }
  
  static String getKeyAlgorithm(Key paramKey) {
    return (paramKey instanceof PrivateKey) ? getPrivateKeyAlgorithm((PrivateKey)paramKey) : ((paramKey instanceof PublicKey) ? getPublicKeyAlgorithm((PublicKey)paramKey) : paramKey.getAlgorithm());
  }
  
  static String getPrivateKeyAlgorithm(PrivateKey paramPrivateKey) {
    String str = paramPrivateKey.getAlgorithm();
    if ("RSA".equalsIgnoreCase(str)) {
      byte[] arrayOfByte = paramPrivateKey.getEncoded();
      if (arrayOfByte != null) {
        PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(arrayOfByte);
        if (PKCSObjectIdentifiers.id_RSASSA_PSS.equals((ASN1Primitive)privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()))
          return "RSASSA-PSS"; 
      } 
    } 
    return str;
  }
  
  static String getPublicKeyAlgorithm(PublicKey paramPublicKey) {
    String str = paramPublicKey.getAlgorithm();
    if ("RSA".equalsIgnoreCase(str)) {
      SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded());
      if (PKCSObjectIdentifiers.id_RSASSA_PSS.equals((ASN1Primitive)subjectPublicKeyInfo.getAlgorithm().getAlgorithm()))
        return "RSASSA-PSS"; 
    } 
    return str;
  }
  
  static boolean isNameSpecified(String paramString) {
    return !isNullOrEmpty(paramString);
  }
  
  static boolean isNullOrEmpty(String paramString) {
    return (null == paramString || paramString.length() < 1);
  }
  
  static boolean isTLSv12(String paramString) {
    ProtocolVersion protocolVersion = ProvSSLContextSpi.getProtocolVersion(paramString);
    return (null != protocolVersion && TlsUtils.isTLSv12(protocolVersion));
  }
  
  static boolean isTLSv13(String paramString) {
    ProtocolVersion protocolVersion = ProvSSLContextSpi.getProtocolVersion(paramString);
    return (null != protocolVersion && TlsUtils.isTLSv13(protocolVersion));
  }
  
  static X500Principal toX500Principal(X500Name paramX500Name) throws IOException {
    return (null == paramX500Name) ? null : new X500Principal(paramX500Name.getEncoded("DER"));
  }
  
  static X500Principal[] toX500Principals(Vector<X500Name> paramVector) throws IOException {
    if (null == paramVector)
      return null; 
    LinkedHashSet<X500Principal> linkedHashSet = new LinkedHashSet();
    int i = paramVector.size();
    for (byte b = 0; b < i; b++) {
      X500Principal x500Principal = toX500Principal(paramVector.get(b));
      if (null != x500Principal)
        linkedHashSet.add(x500Principal); 
    } 
    return linkedHashSet.<X500Principal>toArray(new X500Principal[0]);
  }
  
  static BCSNIServerName convertSNIServerName(ServerName paramServerName) {
    short s = paramServerName.getNameType();
    byte[] arrayOfByte = paramServerName.getNameData();
    switch (s) {
      case 0:
        return (BCSNIServerName)new BCSNIHostName(arrayOfByte);
    } 
    return new BCUnknownServerName(s, arrayOfByte);
  }
  
  static List<BCSNIServerName> convertSNIServerNames(Vector<ServerName> paramVector) {
    if (null == paramVector || paramVector.isEmpty())
      return Collections.emptyList(); 
    ArrayList<BCSNIServerName> arrayList = new ArrayList(paramVector.size());
    Enumeration<ServerName> enumeration = paramVector.elements();
    while (enumeration.hasMoreElements())
      arrayList.add(convertSNIServerName(enumeration.nextElement())); 
    return Collections.unmodifiableList(arrayList);
  }
  
  static BCSNIServerName findMatchingSNIServerName(Vector<ServerName> paramVector, Collection<BCSNIMatcher> paramCollection) {
    if (!paramVector.isEmpty()) {
      List<BCSNIServerName> list = convertSNIServerNames(paramVector);
      for (BCSNIMatcher bCSNIMatcher : paramCollection) {
        if (null != bCSNIMatcher) {
          int i = bCSNIMatcher.getType();
          for (BCSNIServerName bCSNIServerName : list) {
            if (null != bCSNIServerName && bCSNIServerName.getType() == i && bCSNIMatcher.matches(bCSNIServerName))
              return bCSNIServerName; 
          } 
        } 
      } 
    } 
    return null;
  }
  
  static BCSNIHostName getSNIHostName(List<BCSNIServerName> paramList) {
    if (null != paramList)
      for (BCSNIServerName bCSNIServerName : paramList) {
        if (null != bCSNIServerName && 0 == bCSNIServerName.getType()) {
          if (bCSNIServerName instanceof BCSNIHostName)
            return (BCSNIHostName)bCSNIServerName; 
          try {
            return new BCSNIHostName(bCSNIServerName.getEncoded());
          } catch (RuntimeException runtimeException) {
            return null;
          } 
        } 
      }  
    return null;
  }
  
  static String removeAllWhitespace(String paramString) {
    if (isNullOrEmpty(paramString))
      return paramString; 
    int i = paramString.length();
    char[] arrayOfChar = new char[i];
    byte b1 = 0;
    for (byte b2 = 0; b2 < i; b2++) {
      char c = paramString.charAt(b2);
      if (!Character.isWhitespace(c))
        arrayOfChar[b1++] = c; 
    } 
    return (b1 == 0) ? EMPTY_STRING : ((b1 == i) ? paramString : new String(arrayOfChar, 0, b1));
  }
  
  static boolean requireCloseNotify() {
    return provTlsRequireCloseNotify;
  }
  
  static String stripDoubleQuotes(String paramString) {
    return stripOuterChars(paramString, '"', '"');
  }
  
  static String stripSquareBrackets(String paramString) {
    return stripOuterChars(paramString, '[', ']');
  }
  
  private static String stripOuterChars(String paramString, char paramChar1, char paramChar2) {
    if (paramString != null) {
      int i = paramString.length() - 1;
      if (i > 0 && paramString.charAt(0) == paramChar1 && paramString.charAt(i) == paramChar2)
        return paramString.substring(1, i); 
    } 
    return paramString;
  }
  
  static boolean useCompatibilityMode() {
    return provTlsUseCompatibilityMode;
  }
  
  static boolean useExtendedMasterSecret() {
    return provTlsUseExtendedMasterSecret;
  }
  
  static class BCUnknownServerName extends BCSNIServerName {
    BCUnknownServerName(int param1Int, byte[] param1ArrayOfbyte) {
      super(param1Int, param1ArrayOfbyte);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\JsseUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */