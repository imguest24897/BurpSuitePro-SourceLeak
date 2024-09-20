package org.bouncycastle.pkix.jcajce;

import java.net.URI;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.jcajce.PKIXCRLStore;
import org.bouncycastle.jcajce.PKIXCRLStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Iterable;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

public class X509RevocationChecker extends PKIXCertPathChecker {
  public static final int PKIX_VALIDITY_MODEL = 0;
  
  public static final int CHAIN_VALIDITY_MODEL = 1;
  
  private static Logger LOG = Logger.getLogger(X509RevocationChecker.class.getName());
  
  private final Map<X500Principal, Long> failures = new HashMap<>();
  
  private final Set<TrustAnchor> trustAnchors;
  
  private final boolean isCheckEEOnly;
  
  private final int validityModel;
  
  private final List<Store<CRL>> crls;
  
  private final List<CertStore> crlCertStores;
  
  private final JcaJceHelper helper;
  
  private final boolean canSoftFail;
  
  private final long failLogMaxTime;
  
  private final long failHardMaxTime;
  
  private final Date validationDate;
  
  private Date currentDate;
  
  private X500Principal workingIssuerName;
  
  private PublicKey workingPublicKey;
  
  private X509Certificate signingCert;
  
  protected static final String[] crlReasons = new String[] { 
      "unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", 
      "aACompromise" };
  
  private X509RevocationChecker(Builder paramBuilder) {
    this.crls = new ArrayList<>(paramBuilder.crls);
    this.crlCertStores = new ArrayList<>(paramBuilder.crlCertStores);
    this.isCheckEEOnly = paramBuilder.isCheckEEOnly;
    this.validityModel = paramBuilder.validityModel;
    this.trustAnchors = paramBuilder.trustAnchors;
    this.canSoftFail = paramBuilder.canSoftFail;
    this.failLogMaxTime = paramBuilder.failLogMaxTime;
    this.failHardMaxTime = paramBuilder.failHardMaxTime;
    this.validationDate = paramBuilder.validityDate;
    if (paramBuilder.provider != null) {
      this.helper = (JcaJceHelper)new ProviderJcaJceHelper(paramBuilder.provider);
    } else if (paramBuilder.providerName != null) {
      this.helper = (JcaJceHelper)new NamedJcaJceHelper(paramBuilder.providerName);
    } else {
      this.helper = (JcaJceHelper)new DefaultJcaJceHelper();
    } 
  }
  
  public void init(boolean paramBoolean) throws CertPathValidatorException {
    if (paramBoolean)
      throw new IllegalArgumentException("forward processing not supported"); 
    this.currentDate = new Date();
    this.workingIssuerName = null;
  }
  
  public boolean isForwardCheckingSupported() {
    return false;
  }
  
  public Set<String> getSupportedExtensions() {
    return null;
  }
  
  public void check(Certificate paramCertificate, Collection<String> paramCollection) throws CertPathValidatorException {
    PKIXExtendedParameters.Builder builder;
    X509Certificate x509Certificate = (X509Certificate)paramCertificate;
    if (this.isCheckEEOnly && x509Certificate.getBasicConstraints() != -1) {
      this.workingIssuerName = x509Certificate.getSubjectX500Principal();
      this.workingPublicKey = x509Certificate.getPublicKey();
      this.signingCert = x509Certificate;
      return;
    } 
    TrustAnchor trustAnchor = null;
    if (this.workingIssuerName == null) {
      this.workingIssuerName = x509Certificate.getIssuerX500Principal();
      for (TrustAnchor trustAnchor1 : this.trustAnchors) {
        if (this.workingIssuerName.equals(trustAnchor1.getCA()) || this.workingIssuerName.equals(trustAnchor1.getTrustedCert().getSubjectX500Principal()))
          trustAnchor = trustAnchor1; 
      } 
      if (trustAnchor == null)
        throw new CertPathValidatorException("no trust anchor found for " + this.workingIssuerName); 
      this.signingCert = trustAnchor.getTrustedCert();
      this.workingPublicKey = this.signingCert.getPublicKey();
    } 
    ArrayList<X500Principal> arrayList = new ArrayList();
    try {
      PKIXParameters pKIXParameters = new PKIXParameters(this.trustAnchors);
      pKIXParameters.setRevocationEnabled(false);
      pKIXParameters.setDate(this.validationDate);
      for (byte b1 = 0; b1 != this.crlCertStores.size(); b1++) {
        if (LOG.isLoggable(Level.INFO))
          addIssuers(arrayList, this.crlCertStores.get(b1)); 
        pKIXParameters.addCertStore(this.crlCertStores.get(b1));
      } 
      builder = new PKIXExtendedParameters.Builder(pKIXParameters);
      builder.setValidityModel(this.validityModel);
    } catch (GeneralSecurityException generalSecurityException) {
      throw new RuntimeException("error setting up baseParams: " + generalSecurityException.getMessage());
    } 
    byte b;
    for (b = 0; b != this.crls.size(); b++) {
      if (LOG.isLoggable(Level.INFO))
        addIssuers(arrayList, this.crls.get(b)); 
      builder.addCRLStore(new LocalCRLStore(this.crls.get(b)));
    } 
    if (arrayList.isEmpty()) {
      LOG.log(Level.INFO, "configured with 0 pre-loaded CRLs");
    } else if (LOG.isLoggable(Level.FINE)) {
      for (b = 0; b != arrayList.size(); b++)
        LOG.log(Level.FINE, "configuring with CRL for issuer \"" + arrayList.get(b) + "\""); 
    } else {
      LOG.log(Level.INFO, "configured with " + arrayList.size() + " pre-loaded CRLs");
    } 
    PKIXExtendedParameters pKIXExtendedParameters = builder.build();
    Date date = RevocationUtilities.getValidityDate(pKIXExtendedParameters, this.validationDate);
    try {
      checkCRLs(pKIXExtendedParameters, this.currentDate, date, x509Certificate, this.signingCert, this.workingPublicKey, new ArrayList(), this.helper);
    } catch (AnnotatedException annotatedException) {
      throw new CertPathValidatorException(annotatedException.getMessage(), annotatedException.getCause());
    } catch (CRLNotFoundException cRLNotFoundException) {
      Set<CRL> set;
      if (null == x509Certificate.getExtensionValue(Extension.cRLDistributionPoints.getId()))
        throw cRLNotFoundException; 
      try {
        set = downloadCRLs(x509Certificate.getIssuerX500Principal(), date, RevocationUtilities.getExtensionValue(x509Certificate, Extension.cRLDistributionPoints), this.helper);
      } catch (AnnotatedException annotatedException) {
        throw new CertPathValidatorException(annotatedException.getMessage(), annotatedException.getCause());
      } 
      if (!set.isEmpty()) {
        try {
          builder.addCRLStore(new LocalCRLStore((Store<CRL>)new CollectionStore(set)));
          pKIXExtendedParameters = builder.build();
          date = RevocationUtilities.getValidityDate(pKIXExtendedParameters, this.validationDate);
          checkCRLs(pKIXExtendedParameters, this.currentDate, date, x509Certificate, this.signingCert, this.workingPublicKey, new ArrayList(), this.helper);
        } catch (AnnotatedException annotatedException) {
          throw new CertPathValidatorException(annotatedException.getMessage(), annotatedException.getCause());
        } 
      } else {
        if (!this.canSoftFail)
          throw cRLNotFoundException; 
        X500Principal x500Principal = x509Certificate.getIssuerX500Principal();
        Long long_ = this.failures.get(x500Principal);
        if (long_ != null) {
          long l = System.currentTimeMillis() - long_.longValue();
          if (this.failHardMaxTime != -1L && this.failHardMaxTime < l)
            throw cRLNotFoundException; 
          if (l < this.failLogMaxTime) {
            LOG.log(Level.WARNING, "soft failing for issuer: \"" + x500Principal + "\"");
          } else {
            LOG.log(Level.SEVERE, "soft failing for issuer: \"" + x500Principal + "\"");
          } 
        } else {
          this.failures.put(x500Principal, Long.valueOf(System.currentTimeMillis()));
        } 
      } 
    } 
    this.signingCert = x509Certificate;
    this.workingPublicKey = x509Certificate.getPublicKey();
    this.workingIssuerName = x509Certificate.getSubjectX500Principal();
  }
  
  private void addIssuers(final List<X500Principal> issuerList, CertStore paramCertStore) throws CertStoreException {
    paramCertStore.getCRLs(new X509CRLSelector() {
          public boolean match(CRL param1CRL) {
            if (!(param1CRL instanceof X509CRL))
              return false; 
            issuerList.add(((X509CRL)param1CRL).getIssuerX500Principal());
            return false;
          }
        });
  }
  
  private void addIssuers(final List<X500Principal> issuerList, Store<CRL> paramStore) {
    paramStore.getMatches(new Selector<CRL>() {
          public boolean match(CRL param1CRL) {
            if (!(param1CRL instanceof X509CRL))
              return false; 
            issuerList.add(((X509CRL)param1CRL).getIssuerX500Principal());
            return false;
          }
          
          public Object clone() {
            return this;
          }
        });
  }
  
  private Set<CRL> downloadCRLs(X500Principal paramX500Principal, Date paramDate, ASN1Primitive paramASN1Primitive, JcaJceHelper paramJcaJceHelper) {
    CertificateFactory certificateFactory;
    CRLDistPoint cRLDistPoint = CRLDistPoint.getInstance(paramASN1Primitive);
    DistributionPoint[] arrayOfDistributionPoint = cRLDistPoint.getDistributionPoints();
    try {
      certificateFactory = paramJcaJceHelper.createCertificateFactory("X.509");
    } catch (Exception exception) {
      if (LOG.isLoggable(Level.FINE)) {
        LOG.log(Level.FINE, "could not create certFact: " + exception.getMessage(), exception);
      } else {
        LOG.log(Level.INFO, "could not create certFact: " + exception.getMessage());
      } 
      return null;
    } 
    X509CRLSelector x509CRLSelector = new X509CRLSelector();
    x509CRLSelector.addIssuer(paramX500Principal);
    PKIXCRLStoreSelector pKIXCRLStoreSelector = (new PKIXCRLStoreSelector.Builder(x509CRLSelector)).build();
    HashSet<CRL> hashSet = new HashSet();
    for (byte b = 0; b != arrayOfDistributionPoint.length; b++) {
      DistributionPoint distributionPoint = arrayOfDistributionPoint[b];
      DistributionPointName distributionPointName = distributionPoint.getDistributionPoint();
      if (distributionPointName != null && distributionPointName.getType() == 0) {
        GeneralName[] arrayOfGeneralName = GeneralNames.getInstance(distributionPointName.getName()).getNames();
        for (byte b1 = 0; b1 != arrayOfGeneralName.length; b1++) {
          GeneralName generalName = arrayOfGeneralName[b1];
          if (generalName.getTagNo() == 6) {
            URI uRI = null;
            try {
              uRI = new URI(((ASN1String)generalName.getName()).getString());
              PKIXCRLStore pKIXCRLStore = CrlCache.getCrl(certificateFactory, this.validationDate, uRI);
              if (pKIXCRLStore != null)
                hashSet.addAll(PKIXCRLUtil.findCRLs(pKIXCRLStoreSelector, paramDate, Collections.EMPTY_LIST, Collections.singletonList(pKIXCRLStore))); 
            } catch (Exception exception) {
              if (LOG.isLoggable(Level.FINE)) {
                LOG.log(Level.FINE, "CrlDP " + uRI + " ignored: " + exception.getMessage(), exception);
              } else {
                LOG.log(Level.INFO, "CrlDP " + uRI + " ignored: " + exception.getMessage());
              } 
            } 
          } 
        } 
      } 
    } 
    return hashSet;
  }
  
  static List<PKIXCRLStore> getAdditionalStoresFromCRLDistributionPoint(CRLDistPoint paramCRLDistPoint, Map<GeneralName, PKIXCRLStore> paramMap) throws AnnotatedException {
    DistributionPoint[] arrayOfDistributionPoint;
    if (paramCRLDistPoint == null)
      return Collections.emptyList(); 
    try {
      arrayOfDistributionPoint = paramCRLDistPoint.getDistributionPoints();
    } catch (Exception exception) {
      throw new AnnotatedException("could not read distribution points could not be read", exception);
    } 
    ArrayList<PKIXCRLStore> arrayList = new ArrayList();
    for (byte b = 0; b < arrayOfDistributionPoint.length; b++) {
      DistributionPointName distributionPointName = arrayOfDistributionPoint[b].getDistributionPoint();
      if (distributionPointName != null && distributionPointName.getType() == 0) {
        GeneralName[] arrayOfGeneralName = GeneralNames.getInstance(distributionPointName.getName()).getNames();
        for (byte b1 = 0; b1 < arrayOfGeneralName.length; b1++) {
          PKIXCRLStore pKIXCRLStore = paramMap.get(arrayOfGeneralName[b1]);
          if (pKIXCRLStore != null)
            arrayList.add(pKIXCRLStore); 
        } 
      } 
    } 
    return arrayList;
  }
  
  protected void checkCRLs(PKIXExtendedParameters paramPKIXExtendedParameters, Date paramDate1, Date paramDate2, X509Certificate paramX509Certificate1, X509Certificate paramX509Certificate2, PublicKey paramPublicKey, List paramList, JcaJceHelper paramJcaJceHelper) throws AnnotatedException, CertPathValidatorException {
    CRLDistPoint cRLDistPoint;
    try {
      cRLDistPoint = CRLDistPoint.getInstance(RevocationUtilities.getExtensionValue(paramX509Certificate1, Extension.cRLDistributionPoints));
    } catch (Exception exception) {
      throw new AnnotatedException("cannot read CRL distribution point extension", exception);
    } 
    CertStatus certStatus = new CertStatus();
    ReasonsMask reasonsMask = new ReasonsMask();
    AnnotatedException annotatedException = null;
    boolean bool = false;
    if (cRLDistPoint != null) {
      DistributionPoint[] arrayOfDistributionPoint;
      try {
        arrayOfDistributionPoint = cRLDistPoint.getDistributionPoints();
      } catch (Exception exception) {
        throw new AnnotatedException("cannot read distribution points", exception);
      } 
      if (arrayOfDistributionPoint != null) {
        PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder(paramPKIXExtendedParameters);
        try {
          List<PKIXCRLStore> list = getAdditionalStoresFromCRLDistributionPoint(cRLDistPoint, paramPKIXExtendedParameters.getNamedCRLStoreMap());
          Iterator<PKIXCRLStore> iterator = list.iterator();
          while (iterator.hasNext())
            builder.addCRLStore(iterator.next()); 
        } catch (AnnotatedException annotatedException1) {
          throw new AnnotatedException("no additional CRL locations could be decoded from CRL distribution point extension", annotatedException1);
        } 
        PKIXExtendedParameters pKIXExtendedParameters = builder.build();
        Date date = RevocationUtilities.getValidityDate(pKIXExtendedParameters, paramDate1);
        for (byte b = 0; b < arrayOfDistributionPoint.length && certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons(); b++) {
          try {
            RFC3280CertPathUtilities.checkCRL(arrayOfDistributionPoint[b], pKIXExtendedParameters, paramDate1, date, paramX509Certificate1, paramX509Certificate2, paramPublicKey, certStatus, reasonsMask, paramList, paramJcaJceHelper);
            bool = true;
          } catch (AnnotatedException annotatedException1) {
            annotatedException = annotatedException1;
          } 
        } 
      } 
    } 
    if (certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons())
      try {
        X500Principal x500Principal = paramX509Certificate1.getIssuerX500Principal();
        DistributionPoint distributionPoint = new DistributionPoint(new DistributionPointName(0, (ASN1Encodable)new GeneralNames(new GeneralName(4, (ASN1Encodable)X500Name.getInstance(x500Principal.getEncoded())))), null, null);
        PKIXExtendedParameters pKIXExtendedParameters = (PKIXExtendedParameters)paramPKIXExtendedParameters.clone();
        RFC3280CertPathUtilities.checkCRL(distributionPoint, pKIXExtendedParameters, paramDate1, paramDate2, paramX509Certificate1, paramX509Certificate2, paramPublicKey, certStatus, reasonsMask, paramList, paramJcaJceHelper);
        bool = true;
      } catch (AnnotatedException annotatedException1) {
        annotatedException = annotatedException1;
      }  
    if (!bool) {
      if (annotatedException instanceof AnnotatedException)
        throw new CRLNotFoundException("no valid CRL found", annotatedException); 
      throw new CRLNotFoundException("no valid CRL found");
    } 
    if (certStatus.getCertStatus() != 11) {
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
      simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
      String str = "certificate [issuer=\"" + paramX509Certificate1.getIssuerX500Principal() + "\",serialNumber=" + paramX509Certificate1.getSerialNumber() + ",subject=\"" + paramX509Certificate1.getSubjectX500Principal() + "\"] revoked after " + simpleDateFormat.format(certStatus.getRevocationDate());
      str = str + ", reason: " + crlReasons[certStatus.getCertStatus()];
      throw new AnnotatedException(str);
    } 
    if (!reasonsMask.isAllReasons() && certStatus.getCertStatus() == 11)
      certStatus.setCertStatus(12); 
    if (certStatus.getCertStatus() == 12)
      throw new AnnotatedException("certificate status could not be determined"); 
  }
  
  public Object clone() {
    return this;
  }
  
  public static class Builder {
    private Set<TrustAnchor> trustAnchors;
    
    private List<CertStore> crlCertStores = new ArrayList<>();
    
    private List<Store<CRL>> crls = new ArrayList<>();
    
    private boolean isCheckEEOnly;
    
    private int validityModel = 0;
    
    private Provider provider;
    
    private String providerName;
    
    private boolean canSoftFail;
    
    private long failLogMaxTime;
    
    private long failHardMaxTime;
    
    private Date validityDate = new Date();
    
    public Builder(TrustAnchor param1TrustAnchor) {
      this.trustAnchors = Collections.singleton(param1TrustAnchor);
    }
    
    public Builder(Set<TrustAnchor> param1Set) {
      this.trustAnchors = new HashSet<>(param1Set);
    }
    
    public Builder(KeyStore param1KeyStore) throws KeyStoreException {
      this.trustAnchors = new HashSet<>();
      Enumeration<String> enumeration = param1KeyStore.aliases();
      while (enumeration.hasMoreElements()) {
        String str = enumeration.nextElement();
        if (param1KeyStore.isCertificateEntry(str))
          this.trustAnchors.add(new TrustAnchor((X509Certificate)param1KeyStore.getCertificate(str), null)); 
      } 
    }
    
    public Builder addCrls(CertStore param1CertStore) {
      this.crlCertStores.add(param1CertStore);
      return this;
    }
    
    public Builder addCrls(Store<CRL> param1Store) {
      this.crls.add(param1Store);
      return this;
    }
    
    public Builder setDate(Date param1Date) {
      this.validityDate = new Date(param1Date.getTime());
      return this;
    }
    
    public Builder setCheckEndEntityOnly(boolean param1Boolean) {
      this.isCheckEEOnly = param1Boolean;
      return this;
    }
    
    public Builder setSoftFail(boolean param1Boolean, long param1Long) {
      this.canSoftFail = param1Boolean;
      this.failLogMaxTime = param1Long;
      this.failHardMaxTime = -1L;
      return this;
    }
    
    public Builder setSoftFailHardLimit(boolean param1Boolean, long param1Long) {
      this.canSoftFail = param1Boolean;
      this.failLogMaxTime = param1Long * 3L / 4L;
      this.failHardMaxTime = param1Long;
      return this;
    }
    
    public Builder setValidityModel(int param1Int) {
      this.validityModel = param1Int;
      return this;
    }
    
    public Builder usingProvider(Provider param1Provider) {
      this.provider = param1Provider;
      return this;
    }
    
    public Builder usingProvider(String param1String) {
      this.providerName = param1String;
      return this;
    }
    
    public X509RevocationChecker build() {
      return new X509RevocationChecker(this);
    }
  }
  
  private static class LocalCRLStore implements PKIXCRLStore<CRL>, Iterable<CRL> {
    private Collection<CRL> _local;
    
    public LocalCRLStore(Store<CRL> param1Store) {
      this._local = new ArrayList<>(param1Store.getMatches(null));
    }
    
    public Collection<CRL> getMatches(Selector<CRL> param1Selector) {
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkix\jcajce\X509RevocationChecker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */