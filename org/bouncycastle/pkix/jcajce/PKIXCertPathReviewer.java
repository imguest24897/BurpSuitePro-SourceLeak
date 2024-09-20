package org.bouncycastle.pkix.jcajce;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.asn1.x509.qualified.Iso4217CurrencyCode;
import org.bouncycastle.asn1.x509.qualified.MonetaryValue;
import org.bouncycastle.asn1.x509.qualified.QCStatement;
import org.bouncycastle.pkix.PKIXNameConstraintValidator;
import org.bouncycastle.pkix.PKIXNameConstraintValidatorException;
import org.bouncycastle.pkix.util.ErrorBundle;
import org.bouncycastle.pkix.util.LocaleString;
import org.bouncycastle.pkix.util.filter.TrustedInput;
import org.bouncycastle.pkix.util.filter.UntrustedInput;
import org.bouncycastle.pkix.util.filter.UntrustedUrlInput;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Objects;

public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
  private static final String QC_STATEMENT = Extension.qCStatements.getId();
  
  private static final String CRL_DIST_POINTS = Extension.cRLDistributionPoints.getId();
  
  private static final String AUTH_INFO_ACCESS = Extension.authorityInfoAccess.getId();
  
  private static final String RESOURCE_NAME = "org.bouncycastle.pkix.CertPathReviewerMessages";
  
  protected CertPath certPath;
  
  protected PKIXParameters pkixParams;
  
  protected Date currentDate;
  
  protected Date validDate;
  
  protected List certs;
  
  protected int n;
  
  protected List[] notifications;
  
  protected List[] errors;
  
  protected TrustAnchor trustAnchor;
  
  protected PublicKey subjectPublicKey;
  
  protected PolicyNode policyTree;
  
  private boolean initialized;
  
  public void init(CertPath paramCertPath, PKIXParameters paramPKIXParameters) throws CertPathReviewerException {
    if (this.initialized)
      throw new IllegalStateException("object is already initialized!"); 
    this.initialized = true;
    if (paramCertPath == null)
      throw new NullPointerException("certPath was null"); 
    List<? extends Certificate> list = paramCertPath.getCertificates();
    if (list.size() != 1) {
      HashSet<X509Certificate> hashSet = new HashSet();
      for (TrustAnchor trustAnchor : paramPKIXParameters.getTrustAnchors())
        hashSet.add(trustAnchor.getTrustedCert()); 
      ArrayList<? extends Certificate> arrayList = new ArrayList();
      for (byte b = 0; b != list.size(); b++) {
        if (!hashSet.contains(list.get(b)))
          arrayList.add(list.get(b)); 
      } 
      try {
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509", "BC");
        this.certPath = certificateFactory.generateCertPath(arrayList);
      } catch (GeneralSecurityException generalSecurityException) {
        throw new IllegalStateException("unable to rebuild certpath");
      } 
      this.certs = arrayList;
    } else {
      this.certPath = paramCertPath;
      this.certs = paramCertPath.getCertificates();
    } 
    this.n = this.certs.size();
    if (this.certs.isEmpty())
      throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.emptyCertPath")); 
    this.pkixParams = (PKIXParameters)paramPKIXParameters.clone();
    this.currentDate = new Date();
    this.validDate = getValidityDate(this.pkixParams, this.currentDate);
    this.notifications = null;
    this.errors = null;
    this.trustAnchor = null;
    this.subjectPublicKey = null;
    this.policyTree = null;
  }
  
  public PKIXCertPathReviewer(CertPath paramCertPath, PKIXParameters paramPKIXParameters) throws CertPathReviewerException {
    init(paramCertPath, paramPKIXParameters);
  }
  
  public PKIXCertPathReviewer() {}
  
  public CertPath getCertPath() {
    return this.certPath;
  }
  
  public int getCertPathSize() {
    return this.n;
  }
  
  public List[] getErrors() {
    doChecks();
    return this.errors;
  }
  
  public List getErrors(int paramInt) {
    doChecks();
    return this.errors[paramInt + 1];
  }
  
  public List[] getNotifications() {
    doChecks();
    return this.notifications;
  }
  
  public List getNotifications(int paramInt) {
    doChecks();
    return this.notifications[paramInt + 1];
  }
  
  public PolicyNode getPolicyTree() {
    doChecks();
    return this.policyTree;
  }
  
  public PublicKey getSubjectPublicKey() {
    doChecks();
    return this.subjectPublicKey;
  }
  
  public TrustAnchor getTrustAnchor() {
    doChecks();
    return this.trustAnchor;
  }
  
  public boolean isValidCertPath() {
    doChecks();
    boolean bool = true;
    for (byte b = 0; b < this.errors.length; b++) {
      if (!this.errors[b].isEmpty()) {
        bool = false;
        break;
      } 
    } 
    return bool;
  }
  
  protected void addNotification(ErrorBundle paramErrorBundle) {
    this.notifications[0].add(paramErrorBundle);
  }
  
  protected void addNotification(ErrorBundle paramErrorBundle, int paramInt) {
    if (paramInt < -1 || paramInt >= this.n)
      throw new IndexOutOfBoundsException(); 
    this.notifications[paramInt + 1].add(paramErrorBundle);
  }
  
  protected void addError(ErrorBundle paramErrorBundle) {
    this.errors[0].add(paramErrorBundle);
  }
  
  protected void addError(ErrorBundle paramErrorBundle, int paramInt) {
    if (paramInt < -1 || paramInt >= this.n)
      throw new IndexOutOfBoundsException(); 
    this.errors[paramInt + 1].add(paramErrorBundle);
  }
  
  protected void doChecks() {
    if (!this.initialized)
      throw new IllegalStateException("Object not initialized. Call init() first."); 
    if (this.notifications == null) {
      this.notifications = new List[this.n + 1];
      this.errors = new List[this.n + 1];
      for (byte b = 0; b < this.notifications.length; b++) {
        this.notifications[b] = new ArrayList();
        this.errors[b] = new ArrayList();
      } 
      checkSignatures();
      checkNameConstraints();
      checkPathLength();
      checkPolicy();
      checkCriticalExtensions();
    } 
  }
  
  private void checkNameConstraints() {
    X509Certificate x509Certificate = null;
    PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
    try {
      for (int i = this.certs.size() - 1; i > 0; i--) {
        ASN1Sequence aSN1Sequence;
        int j = this.n - i;
        x509Certificate = this.certs.get(i);
        if (!isSelfIssued(x509Certificate)) {
          ASN1Sequence aSN1Sequence1;
          ASN1Sequence aSN1Sequence2;
          X500Principal x500Principal = getSubjectPrincipal(x509Certificate);
          ASN1InputStream aSN1InputStream = new ASN1InputStream(new ByteArrayInputStream(x500Principal.getEncoded()));
          try {
            aSN1Sequence1 = (ASN1Sequence)aSN1InputStream.readObject();
          } catch (IOException iOException) {
            ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.ncSubjectNameError", new Object[] { new UntrustedInput(x500Principal) });
            throw new CertPathReviewerException(errorBundle, iOException, this.certPath, i);
          } 
          try {
            pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence1);
          } catch (PKIXNameConstraintValidatorException pKIXNameConstraintValidatorException) {
            ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.notPermittedDN", new Object[] { new UntrustedInput(x500Principal.getName()) });
            throw new CertPathReviewerException(errorBundle, pKIXNameConstraintValidatorException, this.certPath, i);
          } 
          try {
            pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence1);
          } catch (PKIXNameConstraintValidatorException pKIXNameConstraintValidatorException) {
            ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.excludedDN", new Object[] { new UntrustedInput(x500Principal.getName()) });
            throw new CertPathReviewerException(errorBundle, pKIXNameConstraintValidatorException, this.certPath, i);
          } 
          try {
            aSN1Sequence2 = (ASN1Sequence)getExtensionValue(x509Certificate, SUBJECT_ALTERNATIVE_NAME);
          } catch (AnnotatedException annotatedException) {
            ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.subjAltNameExtError");
            throw new CertPathReviewerException(errorBundle, annotatedException, this.certPath, i);
          } 
          if (aSN1Sequence2 != null)
            for (byte b = 0; b < aSN1Sequence2.size(); b++) {
              GeneralName generalName = GeneralName.getInstance(aSN1Sequence2.getObjectAt(b));
              try {
                pKIXNameConstraintValidator.checkPermitted(generalName);
                pKIXNameConstraintValidator.checkExcluded(generalName);
              } catch (PKIXNameConstraintValidatorException pKIXNameConstraintValidatorException) {
                ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.notPermittedEmail", new Object[] { new UntrustedInput(generalName) });
                throw new CertPathReviewerException(errorBundle, pKIXNameConstraintValidatorException, this.certPath, i);
              } 
            }  
        } 
        try {
          aSN1Sequence = (ASN1Sequence)getExtensionValue(x509Certificate, NAME_CONSTRAINTS);
        } catch (AnnotatedException annotatedException) {
          ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.ncExtError");
          throw new CertPathReviewerException(errorBundle, annotatedException, this.certPath, i);
        } 
        if (aSN1Sequence != null) {
          NameConstraints nameConstraints = NameConstraints.getInstance(aSN1Sequence);
          GeneralSubtree[] arrayOfGeneralSubtree1 = nameConstraints.getPermittedSubtrees();
          if (arrayOfGeneralSubtree1 != null)
            pKIXNameConstraintValidator.intersectPermittedSubtree(arrayOfGeneralSubtree1); 
          GeneralSubtree[] arrayOfGeneralSubtree2 = nameConstraints.getExcludedSubtrees();
          if (arrayOfGeneralSubtree2 != null)
            for (byte b = 0; b != arrayOfGeneralSubtree2.length; b++)
              pKIXNameConstraintValidator.addExcludedSubtree(arrayOfGeneralSubtree2[b]);  
        } 
      } 
    } catch (CertPathReviewerException certPathReviewerException) {
      addError(certPathReviewerException.getErrorMessage(), certPathReviewerException.getIndex());
    } 
  }
  
  private void checkPathLength() {
    int i = this.n;
    byte b = 0;
    X509Certificate x509Certificate = null;
    for (int j = this.certs.size() - 1; j > 0; j--) {
      BasicConstraints basicConstraints;
      int k = this.n - j;
      x509Certificate = this.certs.get(j);
      if (!isSelfIssued(x509Certificate)) {
        if (i <= 0) {
          basicConstraints = (BasicConstraints)createErrorBundle("CertPathReviewer.pathLengthExtended");
          addError((ErrorBundle)basicConstraints);
        } 
        i--;
        b++;
      } 
      try {
        basicConstraints = BasicConstraints.getInstance(getExtensionValue(x509Certificate, BASIC_CONSTRAINTS));
      } catch (AnnotatedException annotatedException) {
        ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.processLengthConstError");
        addError(errorBundle1, j);
        basicConstraints = null;
      } 
      if (basicConstraints != null && basicConstraints.isCA()) {
        ASN1Integer aSN1Integer = basicConstraints.getPathLenConstraintInteger();
        if (aSN1Integer != null)
          i = Math.min(i, aSN1Integer.intPositiveValueExact()); 
      } 
    } 
    ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.totalPathLength", new Object[] { Integers.valueOf(b) });
    addNotification(errorBundle);
  }
  
  private void checkSignatures() {
    PublicKey publicKey;
    TrustAnchor trustAnchor = null;
    X500Principal x500Principal1 = null;
    ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.certPathValidDate", new Object[] { new TrustedInput(this.validDate), new TrustedInput(this.currentDate) });
    addNotification(errorBundle);
    try {
      X509Certificate x509Certificate = this.certs.get(this.certs.size() - 1);
      Collection<TrustAnchor> collection = getTrustAnchors(x509Certificate, this.pkixParams.getTrustAnchors());
      if (collection.size() > 1) {
        ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.conflictingTrustAnchors", new Object[] { Integers.valueOf(collection.size()), new UntrustedInput(x509Certificate.getIssuerX500Principal()) });
        addError(errorBundle1);
      } else if (collection.isEmpty()) {
        ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.noTrustAnchorFound", new Object[] { new UntrustedInput(x509Certificate.getIssuerX500Principal()), Integers.valueOf(this.pkixParams.getTrustAnchors().size()) });
        addError(errorBundle1);
      } else {
        PublicKey publicKey1;
        trustAnchor = collection.iterator().next();
        if (trustAnchor.getTrustedCert() != null) {
          publicKey1 = trustAnchor.getTrustedCert().getPublicKey();
        } else {
          publicKey1 = trustAnchor.getCAPublicKey();
        } 
        try {
          CertPathValidatorUtilities.verifyX509Certificate(x509Certificate, publicKey1, this.pkixParams.getSigProvider());
        } catch (SignatureException signatureException) {
          ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.trustButInvalidCert");
          addError(errorBundle1);
        } catch (Exception exception) {}
      } 
    } catch (CertPathReviewerException certPathReviewerException) {
      addError(certPathReviewerException.getErrorMessage());
    } catch (Throwable throwable) {
      ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.unknown", new Object[] { new UntrustedInput(throwable.getMessage()), new UntrustedInput(throwable) });
      addError(errorBundle1);
    } 
    if (trustAnchor != null) {
      X509Certificate x509Certificate = trustAnchor.getTrustedCert();
      try {
        if (x509Certificate != null) {
          x500Principal1 = getSubjectPrincipal(x509Certificate);
        } else {
          x500Principal1 = new X500Principal(trustAnchor.getCAName());
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.trustDNInvalid", new Object[] { new UntrustedInput(trustAnchor.getCAName()) });
        addError(errorBundle1);
      } 
      if (x509Certificate != null) {
        boolean[] arrayOfBoolean = x509Certificate.getKeyUsage();
        if (arrayOfBoolean != null && (arrayOfBoolean.length <= 5 || !arrayOfBoolean[5])) {
          ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.trustKeyUsage");
          addNotification(errorBundle1);
        } 
      } 
    } 
    errorBundle = null;
    X500Principal x500Principal2 = x500Principal1;
    X509Certificate x509Certificate1 = null;
    AlgorithmIdentifier algorithmIdentifier = null;
    ASN1ObjectIdentifier aSN1ObjectIdentifier = null;
    ASN1Encodable aSN1Encodable = null;
    if (trustAnchor != null) {
      x509Certificate1 = trustAnchor.getTrustedCert();
      if (x509Certificate1 != null) {
        publicKey = x509Certificate1.getPublicKey();
      } else {
        publicKey = trustAnchor.getCAPublicKey();
      } 
      try {
        algorithmIdentifier = getAlgorithmIdentifier(publicKey);
        aSN1ObjectIdentifier = algorithmIdentifier.getAlgorithm();
        aSN1Encodable = algorithmIdentifier.getParameters();
      } catch (CertPathValidatorException certPathValidatorException) {
        ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.trustPubKeyError");
        addError(errorBundle1);
        algorithmIdentifier = null;
      } 
    } 
    X509Certificate x509Certificate2 = null;
    for (int i = this.certs.size() - 1; i >= 0; i--) {
      int j = this.n - i;
      x509Certificate2 = this.certs.get(i);
      if (publicKey != null) {
        try {
          CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, publicKey, this.pkixParams.getSigProvider());
        } catch (GeneralSecurityException generalSecurityException) {
          ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.signatureNotVerified", new Object[] { generalSecurityException.getMessage(), generalSecurityException, generalSecurityException.getClass().getName() });
          addError(errorBundle1, i);
        } 
      } else if (isSelfIssued(x509Certificate2)) {
        try {
          CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, x509Certificate2.getPublicKey(), this.pkixParams.getSigProvider());
          ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.rootKeyIsValidButNotATrustAnchor");
          addError(errorBundle1, i);
        } catch (GeneralSecurityException generalSecurityException) {
          ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.signatureNotVerified", new Object[] { generalSecurityException.getMessage(), generalSecurityException, generalSecurityException.getClass().getName() });
          addError(errorBundle1, i);
        } 
      } else {
        ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.NoIssuerPublicKey");
        byte[] arrayOfByte = x509Certificate2.getExtensionValue(Extension.authorityKeyIdentifier.getId());
        if (arrayOfByte != null) {
          AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(DEROctetString.getInstance(arrayOfByte).getOctets());
          GeneralNames generalNames = authorityKeyIdentifier.getAuthorityCertIssuer();
          if (generalNames != null) {
            GeneralName generalName = generalNames.getNames()[0];
            BigInteger bigInteger = authorityKeyIdentifier.getAuthorityCertSerialNumber();
            if (bigInteger != null) {
              Object[] arrayOfObject = { new LocaleString("org.bouncycastle.pkix.CertPathReviewerMessages", "missingIssuer"), " \"", generalName, "\" ", new LocaleString("org.bouncycastle.pkix.CertPathReviewerMessages", "missingSerial"), " ", bigInteger };
              errorBundle1.setExtraArguments(arrayOfObject);
            } 
          } 
        } 
        addError(errorBundle1, i);
      } 
      try {
        x509Certificate2.checkValidity(this.validDate);
      } catch (CertificateNotYetValidException certificateNotYetValidException) {
        ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.certificateNotYetValid", new Object[] { new TrustedInput(x509Certificate2.getNotBefore()) });
        addError(errorBundle1, i);
      } catch (CertificateExpiredException certificateExpiredException) {
        ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.certificateExpired", new Object[] { new TrustedInput(x509Certificate2.getNotAfter()) });
        addError(errorBundle1, i);
      } 
      if (this.pkixParams.isRevocationEnabled()) {
        CRLDistPoint cRLDistPoint = null;
        try {
          ASN1Primitive aSN1Primitive = getExtensionValue(x509Certificate2, CRL_DIST_POINTS);
          if (aSN1Primitive != null)
            cRLDistPoint = CRLDistPoint.getInstance(aSN1Primitive); 
        } catch (AnnotatedException annotatedException) {
          ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.crlDistPtExtError");
          addError(errorBundle1, i);
        } 
        AuthorityInformationAccess authorityInformationAccess = null;
        try {
          ASN1Primitive aSN1Primitive = getExtensionValue(x509Certificate2, AUTH_INFO_ACCESS);
          if (aSN1Primitive != null)
            authorityInformationAccess = AuthorityInformationAccess.getInstance(aSN1Primitive); 
        } catch (AnnotatedException annotatedException) {
          ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.crlAuthInfoAccError");
          addError(errorBundle1, i);
        } 
        Vector vector1 = getCRLDistUrls(cRLDistPoint);
        Vector vector2 = getOCSPUrls(authorityInformationAccess);
        Iterator iterator = vector1.iterator();
        while (iterator.hasNext()) {
          ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.crlDistPoint", new Object[] { new UntrustedUrlInput(iterator.next()) });
          addNotification(errorBundle1, i);
        } 
        iterator = vector2.iterator();
        while (iterator.hasNext()) {
          ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.ocspLocation", new Object[] { new UntrustedUrlInput(iterator.next()) });
          addNotification(errorBundle1, i);
        } 
        try {
          checkRevocation(this.pkixParams, x509Certificate2, this.validDate, x509Certificate1, publicKey, vector1, vector2, i);
        } catch (CertPathReviewerException certPathReviewerException) {
          addError(certPathReviewerException.getErrorMessage(), i);
        } 
      } 
      if (x500Principal2 != null && !x509Certificate2.getIssuerX500Principal().equals(x500Principal2)) {
        ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.certWrongIssuer", new Object[] { x500Principal2.getName(), x509Certificate2.getIssuerX500Principal().getName() });
        addError(errorBundle1, i);
      } 
      if (j != this.n) {
        if (x509Certificate2 != null && x509Certificate2.getVersion() == 1) {
          ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.noCACert");
          addError(errorBundle1, i);
        } 
        try {
          BasicConstraints basicConstraints = BasicConstraints.getInstance(getExtensionValue(x509Certificate2, BASIC_CONSTRAINTS));
          if (basicConstraints != null) {
            if (!basicConstraints.isCA()) {
              ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.noCACert");
              addError(errorBundle1, i);
            } 
          } else {
            ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.noBasicConstraints");
            addError(errorBundle1, i);
          } 
        } catch (AnnotatedException annotatedException) {
          ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.errorProcesingBC");
          addError(errorBundle1, i);
        } 
        boolean[] arrayOfBoolean = x509Certificate2.getKeyUsage();
        if (arrayOfBoolean != null && (arrayOfBoolean.length <= 5 || !arrayOfBoolean[5])) {
          ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.noCertSign");
          addError(errorBundle1, i);
        } 
      } 
      x509Certificate1 = x509Certificate2;
      x500Principal2 = x509Certificate2.getSubjectX500Principal();
      try {
        publicKey = getNextWorkingKey(this.certs, i);
        algorithmIdentifier = getAlgorithmIdentifier(publicKey);
        aSN1ObjectIdentifier = algorithmIdentifier.getAlgorithm();
        aSN1Encodable = algorithmIdentifier.getParameters();
      } catch (CertPathValidatorException certPathValidatorException) {
        ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.pubKeyError");
        addError(errorBundle1, i);
        algorithmIdentifier = null;
        aSN1ObjectIdentifier = null;
        aSN1Encodable = null;
      } 
    } 
    this.trustAnchor = trustAnchor;
    this.subjectPublicKey = publicKey;
  }
  
  private void checkPolicy() {
    int i;
    int j;
    int k;
    Set<String> set1 = this.pkixParams.getInitialPolicies();
    ArrayList[] arrayOfArrayList = new ArrayList[this.n + 1];
    for (byte b = 0; b < arrayOfArrayList.length; b++)
      arrayOfArrayList[b] = new ArrayList(); 
    HashSet<String> hashSet = new HashSet();
    hashSet.add("2.5.29.32.0");
    PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet, null, new HashSet(), "2.5.29.32.0", false);
    arrayOfArrayList[0].add(pKIXPolicyNode);
    if (this.pkixParams.isExplicitPolicyRequired()) {
      i = 0;
    } else {
      i = this.n + 1;
    } 
    if (this.pkixParams.isAnyPolicyInhibited()) {
      j = 0;
    } else {
      j = this.n + 1;
    } 
    if (this.pkixParams.isPolicyMappingInhibited()) {
      k = 0;
    } else {
      k = this.n + 1;
    } 
    Set<String> set2 = null;
    X509Certificate x509Certificate = null;
    try {
      PKIXPolicyNode pKIXPolicyNode1;
      int m;
      for (m = this.certs.size() - 1; m >= 0; m--) {
        ASN1Sequence aSN1Sequence;
        int n = this.n - m;
        x509Certificate = this.certs.get(m);
        try {
          aSN1Sequence = (ASN1Sequence)getExtensionValue(x509Certificate, CERTIFICATE_POLICIES);
        } catch (AnnotatedException annotatedException) {
          ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.policyExtError");
          throw new CertPathReviewerException(errorBundle, annotatedException, this.certPath, m);
        } 
        if (aSN1Sequence != null && pKIXPolicyNode != null) {
          Enumeration enumeration = aSN1Sequence.getObjects();
          HashSet<String> hashSet1 = new HashSet();
          while (enumeration.hasMoreElements()) {
            PolicyInformation policyInformation = PolicyInformation.getInstance(enumeration.nextElement());
            ASN1ObjectIdentifier aSN1ObjectIdentifier = policyInformation.getPolicyIdentifier();
            hashSet1.add(aSN1ObjectIdentifier.getId());
            if (!"2.5.29.32.0".equals(aSN1ObjectIdentifier.getId())) {
              Set set3;
              try {
                set3 = getQualifierSet(policyInformation.getPolicyQualifiers());
              } catch (CertPathValidatorException certPathValidatorException) {
                ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.policyQualifierError");
                throw new CertPathReviewerException(errorBundle, certPathValidatorException, this.certPath, m);
              } 
              boolean bool = processCertD1i(n, (List[])arrayOfArrayList, aSN1ObjectIdentifier, set3);
              if (!bool)
                processCertD1ii(n, (List[])arrayOfArrayList, aSN1ObjectIdentifier, set3); 
            } 
          } 
          if (set2 == null || set2.contains("2.5.29.32.0")) {
            set2 = hashSet1;
          } else {
            Iterator<String> iterator = set2.iterator();
            HashSet<String> hashSet2 = new HashSet();
            while (iterator.hasNext()) {
              Object object = iterator.next();
              if (hashSet1.contains(object))
                hashSet2.add(object); 
            } 
            set2 = hashSet2;
          } 
          if (j > 0 || (n < this.n && isSelfIssued(x509Certificate))) {
            enumeration = aSN1Sequence.getObjects();
            while (enumeration.hasMoreElements()) {
              PolicyInformation policyInformation = PolicyInformation.getInstance(enumeration.nextElement());
              if ("2.5.29.32.0".equals(policyInformation.getPolicyIdentifier().getId())) {
                Set set3;
                try {
                  set3 = getQualifierSet(policyInformation.getPolicyQualifiers());
                } catch (CertPathValidatorException certPathValidatorException) {
                  ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.policyQualifierError");
                  throw new CertPathReviewerException(errorBundle, certPathValidatorException, this.certPath, m);
                } 
                ArrayList<PKIXPolicyNode> arrayList = arrayOfArrayList[n - 1];
                for (byte b1 = 0; b1 < arrayList.size(); b1++) {
                  PKIXPolicyNode pKIXPolicyNode2 = arrayList.get(b1);
                  for (String str1 : pKIXPolicyNode2.getExpectedPolicies()) {
                    String str2;
                    if (str1 instanceof String) {
                      str2 = str1;
                    } else if (str1 instanceof ASN1ObjectIdentifier) {
                      str2 = ((ASN1ObjectIdentifier)str1).getId();
                    } else {
                      continue;
                    } 
                    boolean bool = false;
                    Iterator<PKIXPolicyNode> iterator = pKIXPolicyNode2.getChildren();
                    while (iterator.hasNext()) {
                      PKIXPolicyNode pKIXPolicyNode3 = iterator.next();
                      if (str2.equals(pKIXPolicyNode3.getValidPolicy()))
                        bool = true; 
                    } 
                    if (!bool) {
                      HashSet<String> hashSet2 = new HashSet();
                      hashSet2.add(str2);
                      PKIXPolicyNode pKIXPolicyNode3 = new PKIXPolicyNode(new ArrayList(), n, hashSet2, pKIXPolicyNode2, set3, str2, false);
                      pKIXPolicyNode2.addChild(pKIXPolicyNode3);
                      arrayOfArrayList[n].add(pKIXPolicyNode3);
                    } 
                  } 
                } 
                break;
              } 
            } 
          } 
          for (int i1 = n - 1; i1 >= 0; i1--) {
            ArrayList<PKIXPolicyNode> arrayList = arrayOfArrayList[i1];
            for (byte b1 = 0; b1 < arrayList.size(); b1++) {
              PKIXPolicyNode pKIXPolicyNode2 = arrayList.get(b1);
              if (!pKIXPolicyNode2.hasChildren()) {
                pKIXPolicyNode = removePolicyNode(pKIXPolicyNode, (List[])arrayOfArrayList, pKIXPolicyNode2);
                if (pKIXPolicyNode == null)
                  break; 
              } 
            } 
          } 
          Set<String> set = x509Certificate.getCriticalExtensionOIDs();
          if (set != null) {
            boolean bool = set.contains(CERTIFICATE_POLICIES);
            ArrayList<PKIXPolicyNode> arrayList = arrayOfArrayList[n];
            for (byte b1 = 0; b1 < arrayList.size(); b1++) {
              PKIXPolicyNode pKIXPolicyNode2 = arrayList.get(b1);
              pKIXPolicyNode2.setCritical(bool);
            } 
          } 
        } 
        if (aSN1Sequence == null)
          pKIXPolicyNode = null; 
        if (i <= 0 && pKIXPolicyNode == null) {
          ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.noValidPolicyTree");
          throw new CertPathReviewerException(errorBundle);
        } 
        if (n != this.n) {
          ASN1Primitive aSN1Primitive;
          try {
            aSN1Primitive = getExtensionValue(x509Certificate, POLICY_MAPPINGS);
          } catch (AnnotatedException annotatedException) {
            ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.policyMapExtError");
            throw new CertPathReviewerException(errorBundle, annotatedException, this.certPath, m);
          } 
          if (aSN1Primitive != null) {
            ASN1Sequence aSN1Sequence1 = (ASN1Sequence)aSN1Primitive;
            for (byte b1 = 0; b1 < aSN1Sequence1.size(); b1++) {
              ASN1Sequence aSN1Sequence2 = (ASN1Sequence)aSN1Sequence1.getObjectAt(b1);
              ASN1ObjectIdentifier aSN1ObjectIdentifier1 = (ASN1ObjectIdentifier)aSN1Sequence2.getObjectAt(0);
              ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier)aSN1Sequence2.getObjectAt(1);
              if ("2.5.29.32.0".equals(aSN1ObjectIdentifier1.getId())) {
                ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.invalidPolicyMapping");
                throw new CertPathReviewerException(errorBundle, this.certPath, m);
              } 
              if ("2.5.29.32.0".equals(aSN1ObjectIdentifier2.getId())) {
                ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.invalidPolicyMapping");
                throw new CertPathReviewerException(errorBundle, this.certPath, m);
              } 
            } 
          } 
          if (aSN1Primitive != null) {
            ASN1Sequence aSN1Sequence1 = (ASN1Sequence)aSN1Primitive;
            HashMap<Object, Object> hashMap = new HashMap<>();
            HashSet<String> hashSet1 = new HashSet();
            for (byte b1 = 0; b1 < aSN1Sequence1.size(); b1++) {
              ASN1Sequence aSN1Sequence2 = (ASN1Sequence)aSN1Sequence1.getObjectAt(b1);
              String str1 = ((ASN1ObjectIdentifier)aSN1Sequence2.getObjectAt(0)).getId();
              String str2 = ((ASN1ObjectIdentifier)aSN1Sequence2.getObjectAt(1)).getId();
              if (!hashMap.containsKey(str1)) {
                HashSet<String> hashSet2 = new HashSet();
                hashSet2.add(str2);
                hashMap.put(str1, hashSet2);
                hashSet1.add(str1);
              } else {
                Set<String> set = (Set)hashMap.get(str1);
                set.add(str2);
              } 
            } 
            for (String str : hashSet1) {
              if (k > 0) {
                try {
                  prepareNextCertB1(n, (List[])arrayOfArrayList, str, hashMap, x509Certificate);
                } catch (AnnotatedException annotatedException) {
                  ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.policyExtError");
                  throw new CertPathReviewerException(errorBundle, annotatedException, this.certPath, m);
                } catch (CertPathValidatorException certPathValidatorException) {
                  ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.policyQualifierError");
                  throw new CertPathReviewerException(errorBundle, certPathValidatorException, this.certPath, m);
                } 
                continue;
              } 
              if (k <= 0)
                pKIXPolicyNode = prepareNextCertB2(n, (List[])arrayOfArrayList, str, pKIXPolicyNode); 
            } 
          } 
          if (!isSelfIssued(x509Certificate)) {
            if (i != 0)
              i--; 
            if (k != 0)
              k--; 
            if (j != 0)
              j--; 
          } 
          try {
            ASN1Sequence aSN1Sequence1 = (ASN1Sequence)getExtensionValue(x509Certificate, POLICY_CONSTRAINTS);
            if (aSN1Sequence1 != null) {
              Enumeration<ASN1TaggedObject> enumeration = aSN1Sequence1.getObjects();
              while (enumeration.hasMoreElements()) {
                int i1;
                ASN1TaggedObject aSN1TaggedObject = enumeration.nextElement();
                switch (aSN1TaggedObject.getTagNo()) {
                  case 0:
                    i1 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                    if (i1 < i)
                      i = i1; 
                  case 1:
                    i1 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                    if (i1 < k)
                      k = i1; 
                } 
              } 
            } 
          } catch (AnnotatedException annotatedException) {
            ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.policyConstExtError");
            throw new CertPathReviewerException(errorBundle, this.certPath, m);
          } 
          try {
            ASN1Integer aSN1Integer = (ASN1Integer)getExtensionValue(x509Certificate, INHIBIT_ANY_POLICY);
            if (aSN1Integer != null) {
              int i1 = aSN1Integer.intValueExact();
              if (i1 < j)
                j = i1; 
            } 
          } catch (AnnotatedException annotatedException) {
            ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.policyInhibitExtError");
            throw new CertPathReviewerException(errorBundle, this.certPath, m);
          } 
        } 
      } 
      if (!isSelfIssued(x509Certificate) && i > 0)
        i--; 
      try {
        ASN1Sequence aSN1Sequence = (ASN1Sequence)getExtensionValue(x509Certificate, POLICY_CONSTRAINTS);
        if (aSN1Sequence != null) {
          Enumeration<ASN1TaggedObject> enumeration = aSN1Sequence.getObjects();
          while (enumeration.hasMoreElements()) {
            int n;
            ASN1TaggedObject aSN1TaggedObject = enumeration.nextElement();
            switch (aSN1TaggedObject.getTagNo()) {
              case 0:
                n = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                if (n == 0)
                  i = 0; 
            } 
          } 
        } 
      } catch (AnnotatedException annotatedException) {
        ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.policyConstExtError");
        throw new CertPathReviewerException(errorBundle, this.certPath, m);
      } 
      if (pKIXPolicyNode == null) {
        if (this.pkixParams.isExplicitPolicyRequired()) {
          ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.explicitPolicy");
          throw new CertPathReviewerException(errorBundle, this.certPath, m);
        } 
        pKIXPolicyNode1 = null;
      } else if (isAnyPolicy(set1)) {
        if (this.pkixParams.isExplicitPolicyRequired()) {
          if (set2.isEmpty()) {
            ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.explicitPolicy");
            throw new CertPathReviewerException(errorBundle, this.certPath, m);
          } 
          HashSet hashSet1 = new HashSet();
          for (byte b1 = 0; b1 < arrayOfArrayList.length; b1++) {
            ArrayList<PKIXPolicyNode> arrayList = arrayOfArrayList[b1];
            for (byte b2 = 0; b2 < arrayList.size(); b2++) {
              PKIXPolicyNode pKIXPolicyNode2 = arrayList.get(b2);
              if ("2.5.29.32.0".equals(pKIXPolicyNode2.getValidPolicy())) {
                Iterator iterator = pKIXPolicyNode2.getChildren();
                while (iterator.hasNext())
                  hashSet1.add(iterator.next()); 
              } 
            } 
          } 
          for (PKIXPolicyNode pKIXPolicyNode2 : hashSet1) {
            String str = pKIXPolicyNode2.getValidPolicy();
            if (!set2.contains(str));
          } 
          if (pKIXPolicyNode != null)
            for (int n = this.n - 1; n >= 0; n--) {
              ArrayList<PKIXPolicyNode> arrayList = arrayOfArrayList[n];
              for (byte b2 = 0; b2 < arrayList.size(); b2++) {
                PKIXPolicyNode pKIXPolicyNode2 = arrayList.get(b2);
                if (!pKIXPolicyNode2.hasChildren())
                  pKIXPolicyNode = removePolicyNode(pKIXPolicyNode, (List[])arrayOfArrayList, pKIXPolicyNode2); 
              } 
            }  
        } 
        pKIXPolicyNode1 = pKIXPolicyNode;
      } else {
        HashSet<PKIXPolicyNode> hashSet1 = new HashSet();
        for (byte b1 = 0; b1 < arrayOfArrayList.length; b1++) {
          ArrayList<PKIXPolicyNode> arrayList = arrayOfArrayList[b1];
          for (byte b2 = 0; b2 < arrayList.size(); b2++) {
            PKIXPolicyNode pKIXPolicyNode2 = arrayList.get(b2);
            if ("2.5.29.32.0".equals(pKIXPolicyNode2.getValidPolicy())) {
              Iterator<PKIXPolicyNode> iterator = pKIXPolicyNode2.getChildren();
              while (iterator.hasNext()) {
                PKIXPolicyNode pKIXPolicyNode3 = iterator.next();
                if (!"2.5.29.32.0".equals(pKIXPolicyNode3.getValidPolicy()))
                  hashSet1.add(pKIXPolicyNode3); 
              } 
            } 
          } 
        } 
        for (PKIXPolicyNode pKIXPolicyNode2 : hashSet1) {
          String str = pKIXPolicyNode2.getValidPolicy();
          if (!set1.contains(str))
            pKIXPolicyNode = removePolicyNode(pKIXPolicyNode, (List[])arrayOfArrayList, pKIXPolicyNode2); 
        } 
        if (pKIXPolicyNode != null)
          for (int n = this.n - 1; n >= 0; n--) {
            ArrayList<PKIXPolicyNode> arrayList = arrayOfArrayList[n];
            for (byte b2 = 0; b2 < arrayList.size(); b2++) {
              PKIXPolicyNode pKIXPolicyNode2 = arrayList.get(b2);
              if (!pKIXPolicyNode2.hasChildren())
                pKIXPolicyNode = removePolicyNode(pKIXPolicyNode, (List[])arrayOfArrayList, pKIXPolicyNode2); 
            } 
          }  
        pKIXPolicyNode1 = pKIXPolicyNode;
      } 
      if (i <= 0 && pKIXPolicyNode1 == null) {
        ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.invalidPolicy");
        throw new CertPathReviewerException(errorBundle);
      } 
      pKIXPolicyNode = pKIXPolicyNode1;
    } catch (CertPathReviewerException certPathReviewerException) {
      addError(certPathReviewerException.getErrorMessage(), certPathReviewerException.getIndex());
      pKIXPolicyNode = null;
    } 
  }
  
  private void checkCriticalExtensions() {
    // Byte code:
    //   0: aload_0
    //   1: getfield pkixParams : Ljava/security/cert/PKIXParameters;
    //   4: invokevirtual getCertPathCheckers : ()Ljava/util/List;
    //   7: astore_1
    //   8: aload_1
    //   9: invokeinterface iterator : ()Ljava/util/Iterator;
    //   14: astore_2
    //   15: aload_2
    //   16: invokeinterface hasNext : ()Z
    //   21: ifeq -> 40
    //   24: aload_2
    //   25: invokeinterface next : ()Ljava/lang/Object;
    //   30: checkcast java/security/cert/PKIXCertPathChecker
    //   33: iconst_0
    //   34: invokevirtual init : (Z)V
    //   37: goto -> 15
    //   40: goto -> 88
    //   43: astore_3
    //   44: ldc_w 'CertPathReviewer.certPathCheckerError'
    //   47: iconst_3
    //   48: anewarray java/lang/Object
    //   51: dup
    //   52: iconst_0
    //   53: aload_3
    //   54: invokevirtual getMessage : ()Ljava/lang/String;
    //   57: aastore
    //   58: dup
    //   59: iconst_1
    //   60: aload_3
    //   61: aastore
    //   62: dup
    //   63: iconst_2
    //   64: aload_3
    //   65: invokevirtual getClass : ()Ljava/lang/Class;
    //   68: invokevirtual getName : ()Ljava/lang/String;
    //   71: aastore
    //   72: invokestatic createErrorBundle : (Ljava/lang/String;[Ljava/lang/Object;)Lorg/bouncycastle/pkix/util/ErrorBundle;
    //   75: astore #4
    //   77: new org/bouncycastle/pkix/jcajce/CertPathReviewerException
    //   80: dup
    //   81: aload #4
    //   83: aload_3
    //   84: invokespecial <init> : (Lorg/bouncycastle/pkix/util/ErrorBundle;Ljava/lang/Throwable;)V
    //   87: athrow
    //   88: aconst_null
    //   89: astore_3
    //   90: aload_0
    //   91: getfield certs : Ljava/util/List;
    //   94: invokeinterface size : ()I
    //   99: iconst_1
    //   100: isub
    //   101: istore #4
    //   103: iload #4
    //   105: iflt -> 484
    //   108: aload_0
    //   109: getfield certs : Ljava/util/List;
    //   112: iload #4
    //   114: invokeinterface get : (I)Ljava/lang/Object;
    //   119: checkcast java/security/cert/X509Certificate
    //   122: astore_3
    //   123: aload_3
    //   124: invokevirtual getCriticalExtensionOIDs : ()Ljava/util/Set;
    //   127: astore #5
    //   129: aload #5
    //   131: ifnull -> 478
    //   134: aload #5
    //   136: invokeinterface isEmpty : ()Z
    //   141: ifeq -> 147
    //   144: goto -> 478
    //   147: aload #5
    //   149: getstatic org/bouncycastle/pkix/jcajce/PKIXCertPathReviewer.KEY_USAGE : Ljava/lang/String;
    //   152: invokeinterface remove : (Ljava/lang/Object;)Z
    //   157: pop
    //   158: aload #5
    //   160: getstatic org/bouncycastle/pkix/jcajce/PKIXCertPathReviewer.CERTIFICATE_POLICIES : Ljava/lang/String;
    //   163: invokeinterface remove : (Ljava/lang/Object;)Z
    //   168: pop
    //   169: aload #5
    //   171: getstatic org/bouncycastle/pkix/jcajce/PKIXCertPathReviewer.POLICY_MAPPINGS : Ljava/lang/String;
    //   174: invokeinterface remove : (Ljava/lang/Object;)Z
    //   179: pop
    //   180: aload #5
    //   182: getstatic org/bouncycastle/pkix/jcajce/PKIXCertPathReviewer.INHIBIT_ANY_POLICY : Ljava/lang/String;
    //   185: invokeinterface remove : (Ljava/lang/Object;)Z
    //   190: pop
    //   191: aload #5
    //   193: getstatic org/bouncycastle/pkix/jcajce/PKIXCertPathReviewer.ISSUING_DISTRIBUTION_POINT : Ljava/lang/String;
    //   196: invokeinterface remove : (Ljava/lang/Object;)Z
    //   201: pop
    //   202: aload #5
    //   204: getstatic org/bouncycastle/pkix/jcajce/PKIXCertPathReviewer.DELTA_CRL_INDICATOR : Ljava/lang/String;
    //   207: invokeinterface remove : (Ljava/lang/Object;)Z
    //   212: pop
    //   213: aload #5
    //   215: getstatic org/bouncycastle/pkix/jcajce/PKIXCertPathReviewer.POLICY_CONSTRAINTS : Ljava/lang/String;
    //   218: invokeinterface remove : (Ljava/lang/Object;)Z
    //   223: pop
    //   224: aload #5
    //   226: getstatic org/bouncycastle/pkix/jcajce/PKIXCertPathReviewer.BASIC_CONSTRAINTS : Ljava/lang/String;
    //   229: invokeinterface remove : (Ljava/lang/Object;)Z
    //   234: pop
    //   235: aload #5
    //   237: getstatic org/bouncycastle/pkix/jcajce/PKIXCertPathReviewer.SUBJECT_ALTERNATIVE_NAME : Ljava/lang/String;
    //   240: invokeinterface remove : (Ljava/lang/Object;)Z
    //   245: pop
    //   246: aload #5
    //   248: getstatic org/bouncycastle/pkix/jcajce/PKIXCertPathReviewer.NAME_CONSTRAINTS : Ljava/lang/String;
    //   251: invokeinterface remove : (Ljava/lang/Object;)Z
    //   256: pop
    //   257: iload #4
    //   259: ifne -> 276
    //   262: aload #5
    //   264: getstatic org/bouncycastle/asn1/x509/Extension.extendedKeyUsage : Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    //   267: invokevirtual getId : ()Ljava/lang/String;
    //   270: invokeinterface remove : (Ljava/lang/Object;)Z
    //   275: pop
    //   276: aload #5
    //   278: getstatic org/bouncycastle/pkix/jcajce/PKIXCertPathReviewer.QC_STATEMENT : Ljava/lang/String;
    //   281: invokeinterface contains : (Ljava/lang/Object;)Z
    //   286: ifeq -> 310
    //   289: aload_0
    //   290: aload_3
    //   291: iload #4
    //   293: invokespecial processQcStatements : (Ljava/security/cert/X509Certificate;I)Z
    //   296: ifeq -> 310
    //   299: aload #5
    //   301: getstatic org/bouncycastle/pkix/jcajce/PKIXCertPathReviewer.QC_STATEMENT : Ljava/lang/String;
    //   304: invokeinterface remove : (Ljava/lang/Object;)Z
    //   309: pop
    //   310: aload_1
    //   311: invokeinterface iterator : ()Ljava/util/Iterator;
    //   316: astore #6
    //   318: aload #6
    //   320: invokeinterface hasNext : ()Z
    //   325: ifeq -> 406
    //   328: aload #6
    //   330: invokeinterface next : ()Ljava/lang/Object;
    //   335: checkcast java/security/cert/PKIXCertPathChecker
    //   338: aload_3
    //   339: aload #5
    //   341: invokevirtual check : (Ljava/security/cert/Certificate;Ljava/util/Collection;)V
    //   344: goto -> 318
    //   347: astore #7
    //   349: ldc_w 'CertPathReviewer.criticalExtensionError'
    //   352: iconst_3
    //   353: anewarray java/lang/Object
    //   356: dup
    //   357: iconst_0
    //   358: aload #7
    //   360: invokevirtual getMessage : ()Ljava/lang/String;
    //   363: aastore
    //   364: dup
    //   365: iconst_1
    //   366: aload #7
    //   368: aastore
    //   369: dup
    //   370: iconst_2
    //   371: aload #7
    //   373: invokevirtual getClass : ()Ljava/lang/Class;
    //   376: invokevirtual getName : ()Ljava/lang/String;
    //   379: aastore
    //   380: invokestatic createErrorBundle : (Ljava/lang/String;[Ljava/lang/Object;)Lorg/bouncycastle/pkix/util/ErrorBundle;
    //   383: astore #8
    //   385: new org/bouncycastle/pkix/jcajce/CertPathReviewerException
    //   388: dup
    //   389: aload #8
    //   391: aload #7
    //   393: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   396: aload_0
    //   397: getfield certPath : Ljava/security/cert/CertPath;
    //   400: iload #4
    //   402: invokespecial <init> : (Lorg/bouncycastle/pkix/util/ErrorBundle;Ljava/lang/Throwable;Ljava/security/cert/CertPath;I)V
    //   405: athrow
    //   406: aload #5
    //   408: invokeinterface isEmpty : ()Z
    //   413: ifne -> 478
    //   416: aload #5
    //   418: invokeinterface iterator : ()Ljava/util/Iterator;
    //   423: astore #8
    //   425: aload #8
    //   427: invokeinterface hasNext : ()Z
    //   432: ifeq -> 478
    //   435: ldc_w 'CertPathReviewer.unknownCriticalExt'
    //   438: iconst_1
    //   439: anewarray java/lang/Object
    //   442: dup
    //   443: iconst_0
    //   444: new org/bouncycastle/asn1/ASN1ObjectIdentifier
    //   447: dup
    //   448: aload #8
    //   450: invokeinterface next : ()Ljava/lang/Object;
    //   455: checkcast java/lang/String
    //   458: invokespecial <init> : (Ljava/lang/String;)V
    //   461: aastore
    //   462: invokestatic createErrorBundle : (Ljava/lang/String;[Ljava/lang/Object;)Lorg/bouncycastle/pkix/util/ErrorBundle;
    //   465: astore #7
    //   467: aload_0
    //   468: aload #7
    //   470: iload #4
    //   472: invokevirtual addError : (Lorg/bouncycastle/pkix/util/ErrorBundle;I)V
    //   475: goto -> 425
    //   478: iinc #4, -1
    //   481: goto -> 103
    //   484: goto -> 500
    //   487: astore_3
    //   488: aload_0
    //   489: aload_3
    //   490: invokevirtual getErrorMessage : ()Lorg/bouncycastle/pkix/util/ErrorBundle;
    //   493: aload_3
    //   494: invokevirtual getIndex : ()I
    //   497: invokevirtual addError : (Lorg/bouncycastle/pkix/util/ErrorBundle;I)V
    //   500: return
    // Exception table:
    //   from	to	target	type
    //   15	40	43	java/security/cert/CertPathValidatorException
    //   15	484	487	org/bouncycastle/pkix/jcajce/CertPathReviewerException
    //   328	344	347	java/security/cert/CertPathValidatorException
  }
  
  private boolean processQcStatements(X509Certificate paramX509Certificate, int paramInt) {
    try {
      boolean bool = false;
      ASN1Sequence aSN1Sequence = (ASN1Sequence)getExtensionValue(paramX509Certificate, QC_STATEMENT);
      for (byte b = 0; b < aSN1Sequence.size(); b++) {
        QCStatement qCStatement = QCStatement.getInstance(aSN1Sequence.getObjectAt(b));
        if (QCStatement.id_etsi_qcs_QcCompliance.equals((ASN1Primitive)qCStatement.getStatementId())) {
          ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.QcEuCompliance");
          addNotification(errorBundle, paramInt);
        } else if (!QCStatement.id_qcs_pkixQCSyntax_v1.equals((ASN1Primitive)qCStatement.getStatementId())) {
          if (QCStatement.id_etsi_qcs_QcSSCD.equals((ASN1Primitive)qCStatement.getStatementId())) {
            ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.QcSSCD");
            addNotification(errorBundle, paramInt);
          } else if (QCStatement.id_etsi_qcs_LimiteValue.equals((ASN1Primitive)qCStatement.getStatementId())) {
            ErrorBundle errorBundle;
            MonetaryValue monetaryValue = MonetaryValue.getInstance(qCStatement.getStatementInfo());
            Iso4217CurrencyCode iso4217CurrencyCode = monetaryValue.getCurrency();
            double d = monetaryValue.getAmount().doubleValue() * Math.pow(10.0D, monetaryValue.getExponent().doubleValue());
            if (monetaryValue.getCurrency().isAlphabetic()) {
              errorBundle = createErrorBundle("CertPathReviewer.QcLimitValueAlpha", new Object[] { monetaryValue.getCurrency().getAlphabetic(), new TrustedInput(new Double(d)), monetaryValue });
            } else {
              errorBundle = createErrorBundle("CertPathReviewer.QcLimitValueNum", new Object[] { Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new TrustedInput(new Double(d)), monetaryValue });
            } 
            addNotification(errorBundle, paramInt);
          } else {
            ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.QcUnknownStatement", new Object[] { qCStatement.getStatementId(), new UntrustedInput(qCStatement) });
            addNotification(errorBundle, paramInt);
            bool = true;
          } 
        } 
      } 
      return !bool;
    } catch (AnnotatedException annotatedException) {
      ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.QcStatementExtError");
      addError(errorBundle, paramInt);
      return false;
    } 
  }
  
  private String IPtoString(byte[] paramArrayOfbyte) {
    String str;
    try {
      str = InetAddress.getByAddress(paramArrayOfbyte).getHostAddress();
    } catch (Exception exception) {
      StringBuffer stringBuffer = new StringBuffer();
      for (byte b = 0; b != paramArrayOfbyte.length; b++) {
        stringBuffer.append(Integer.toHexString(paramArrayOfbyte[b] & 0xFF));
        stringBuffer.append(' ');
      } 
      str = stringBuffer.toString();
    } 
    return str;
  }
  
  protected void checkRevocation(PKIXParameters paramPKIXParameters, X509Certificate paramX509Certificate1, Date paramDate, X509Certificate paramX509Certificate2, PublicKey paramPublicKey, Vector paramVector1, Vector paramVector2, int paramInt) throws CertPathReviewerException {
    checkCRLs(paramPKIXParameters, paramX509Certificate1, paramDate, paramX509Certificate2, paramPublicKey, paramVector1, paramInt);
  }
  
  protected void checkCRLs(PKIXParameters paramPKIXParameters, X509Certificate paramX509Certificate1, Date paramDate, X509Certificate paramX509Certificate2, PublicKey paramPublicKey, Vector paramVector, int paramInt) throws CertPathReviewerException {
    Iterator<?> iterator;
    X509CRLStoreSelector x509CRLStoreSelector = new X509CRLStoreSelector();
    try {
      x509CRLStoreSelector.addIssuerName(getEncodedIssuerPrincipal(paramX509Certificate1).getEncoded());
    } catch (IOException iOException) {
      ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.crlIssuerException");
      throw new CertPathReviewerException(errorBundle, iOException);
    } 
    x509CRLStoreSelector.setCertificateChecking(paramX509Certificate1);
    try {
      Set set = PKIXCRLUtil.findCRLs(x509CRLStoreSelector, paramPKIXParameters);
      iterator = set.iterator();
      if (set.isEmpty()) {
        set = PKIXCRLUtil.findCRLs(new X509CRLStoreSelector(), paramPKIXParameters);
        Iterator<X509CRL> iterator1 = set.iterator();
        ArrayList<X500Principal> arrayList = new ArrayList();
        while (iterator1.hasNext())
          arrayList.add(((X509CRL)iterator1.next()).getIssuerX500Principal()); 
        int i = arrayList.size();
        ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.noCrlInCertstore", new Object[] { new UntrustedInput(x509CRLStoreSelector.getIssuerNames()), new UntrustedInput(arrayList), Integers.valueOf(i) });
        addNotification(errorBundle, paramInt);
      } 
    } catch (AnnotatedException annotatedException) {
      ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.crlExtractionError", new Object[] { annotatedException.getCause().getMessage(), annotatedException.getCause(), annotatedException.getCause().getClass().getName() });
      addError(errorBundle, paramInt);
      iterator = (new ArrayList()).iterator();
    } 
    boolean bool = false;
    X509CRL x509CRL = null;
    while (iterator.hasNext()) {
      x509CRL = (X509CRL)iterator.next();
      Date date1 = x509CRL.getThisUpdate();
      Date date2 = x509CRL.getNextUpdate();
      Object[] arrayOfObject = { new TrustedInput(date1), new TrustedInput(date2) };
      if (date2 == null || paramDate.before(date2)) {
        bool = true;
        ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.localValidCRL", arrayOfObject);
        addNotification(errorBundle1, paramInt);
        break;
      } 
      ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.localInvalidCRL", arrayOfObject);
      addNotification(errorBundle, paramInt);
    } 
    if (!bool) {
      X500Principal x500Principal = paramX509Certificate1.getIssuerX500Principal();
      X509CRL x509CRL1 = null;
      Iterator<String> iterator1 = paramVector.iterator();
      while (iterator1.hasNext()) {
        try {
          String str = iterator1.next();
          x509CRL1 = getCRL(str);
          if (x509CRL1 != null) {
            X500Principal x500Principal1 = x509CRL1.getIssuerX500Principal();
            if (!x500Principal.equals(x500Principal1)) {
              ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.onlineCRLWrongCA", new Object[] { new UntrustedInput(x500Principal1.getName()), new UntrustedInput(x500Principal.getName()), new UntrustedUrlInput(str) });
              addNotification(errorBundle1, paramInt);
              continue;
            } 
            Date date1 = x509CRL1.getThisUpdate();
            Date date2 = x509CRL1.getNextUpdate();
            Object[] arrayOfObject = { new TrustedInput(date1), new TrustedInput(date2), new UntrustedUrlInput(str) };
            if (date2 == null || paramDate.before(date2)) {
              bool = true;
              ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.onlineValidCRL", arrayOfObject);
              addNotification(errorBundle1, paramInt);
              x509CRL = x509CRL1;
              break;
            } 
            ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.onlineInvalidCRL", arrayOfObject);
            addNotification(errorBundle, paramInt);
          } 
        } catch (CertPathReviewerException certPathReviewerException) {
          addNotification(certPathReviewerException.getErrorMessage(), paramInt);
        } 
      } 
    } 
    if (x509CRL != null) {
      ASN1Primitive aSN1Primitive1;
      ASN1Primitive aSN1Primitive2;
      if (paramX509Certificate2 != null) {
        boolean[] arrayOfBoolean = paramX509Certificate2.getKeyUsage();
        if (arrayOfBoolean != null && (arrayOfBoolean.length <= 6 || !arrayOfBoolean[6])) {
          ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.noCrlSigningPermited");
          throw new CertPathReviewerException(errorBundle);
        } 
      } 
      if (paramPublicKey != null) {
        try {
          x509CRL.verify(paramPublicKey, "BC");
        } catch (Exception exception) {
          ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.crlVerifyFailed");
          throw new CertPathReviewerException(errorBundle, exception);
        } 
      } else {
        ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.crlNoIssuerPublicKey");
        throw new CertPathReviewerException(errorBundle);
      } 
      X509CRLEntry x509CRLEntry = x509CRL.getRevokedCertificate(paramX509Certificate1.getSerialNumber());
      if (x509CRLEntry != null) {
        String str = null;
        if (x509CRLEntry.hasExtensions()) {
          ASN1Enumerated aSN1Enumerated;
          try {
            aSN1Enumerated = ASN1Enumerated.getInstance(getExtensionValue(x509CRLEntry, Extension.reasonCode.getId()));
          } catch (AnnotatedException annotatedException) {
            ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.crlReasonExtError");
            throw new CertPathReviewerException(errorBundle1, annotatedException);
          } 
          if (aSN1Enumerated != null)
            str = crlReasons[aSN1Enumerated.intValueExact()]; 
        } 
        if (str == null)
          str = crlReasons[7]; 
        LocaleString localeString = new LocaleString("org.bouncycastle.pkix.CertPathReviewerMessages", str);
        if (!paramDate.before(x509CRLEntry.getRevocationDate())) {
          ErrorBundle errorBundle1 = createErrorBundle("CertPathReviewer.certRevoked", new Object[] { new TrustedInput(x509CRLEntry.getRevocationDate()), localeString });
          throw new CertPathReviewerException(errorBundle1);
        } 
        ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.revokedAfterValidation", new Object[] { new TrustedInput(x509CRLEntry.getRevocationDate()), localeString });
        addNotification(errorBundle, paramInt);
      } else {
        ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.notRevoked");
        addNotification(errorBundle, paramInt);
      } 
      Date date = x509CRL.getNextUpdate();
      if (date != null && !paramDate.before(date)) {
        ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.crlUpdateAvailable", new Object[] { new TrustedInput(date) });
        addNotification(errorBundle, paramInt);
      } 
      try {
        aSN1Primitive1 = getExtensionValue(x509CRL, ISSUING_DISTRIBUTION_POINT);
      } catch (AnnotatedException annotatedException) {
        ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.distrPtExtError");
        throw new CertPathReviewerException(errorBundle);
      } 
      try {
        aSN1Primitive2 = getExtensionValue(x509CRL, DELTA_CRL_INDICATOR);
      } catch (AnnotatedException annotatedException) {
        ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.deltaCrlExtError");
        throw new CertPathReviewerException(errorBundle);
      } 
      if (aSN1Primitive2 != null) {
        Iterator<X509CRL> iterator1;
        X509CRLStoreSelector x509CRLStoreSelector1 = new X509CRLStoreSelector();
        try {
          x509CRLStoreSelector1.addIssuerName(getIssuerPrincipal(x509CRL).getEncoded());
        } catch (IOException iOException) {
          ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.crlIssuerException");
          throw new CertPathReviewerException(errorBundle, iOException);
        } 
        x509CRLStoreSelector1.setMinCRLNumber(((ASN1Integer)aSN1Primitive2).getPositiveValue());
        try {
          x509CRLStoreSelector1.setMaxCRLNumber(((ASN1Integer)getExtensionValue(x509CRL, CRL_NUMBER)).getPositiveValue().subtract(BigInteger.valueOf(1L)));
        } catch (AnnotatedException annotatedException) {
          ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.crlNbrExtError");
          throw new CertPathReviewerException(errorBundle, annotatedException);
        } 
        boolean bool1 = false;
        try {
          iterator1 = PKIXCRLUtil.findCRLs(x509CRLStoreSelector1, paramPKIXParameters).iterator();
        } catch (AnnotatedException annotatedException) {
          ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.crlExtractionError");
          throw new CertPathReviewerException(errorBundle, annotatedException);
        } 
        while (iterator1.hasNext()) {
          ASN1Primitive aSN1Primitive;
          X509CRL x509CRL1 = iterator1.next();
          try {
            aSN1Primitive = getExtensionValue(x509CRL1, ISSUING_DISTRIBUTION_POINT);
          } catch (AnnotatedException annotatedException) {
            ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.distrPtExtError");
            throw new CertPathReviewerException(errorBundle, annotatedException);
          } 
          if (Objects.areEqual(aSN1Primitive1, aSN1Primitive)) {
            bool1 = true;
            break;
          } 
        } 
        if (!bool1) {
          ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.noBaseCRL");
          throw new CertPathReviewerException(errorBundle);
        } 
      } 
      if (aSN1Primitive1 != null) {
        IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(aSN1Primitive1);
        BasicConstraints basicConstraints = null;
        try {
          basicConstraints = BasicConstraints.getInstance(getExtensionValue(paramX509Certificate1, BASIC_CONSTRAINTS));
        } catch (AnnotatedException annotatedException) {
          ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.crlBCExtError");
          throw new CertPathReviewerException(errorBundle, annotatedException);
        } 
        if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
          ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.crlOnlyUserCert");
          throw new CertPathReviewerException(errorBundle);
        } 
        if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
          ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.crlOnlyCaCert");
          throw new CertPathReviewerException(errorBundle);
        } 
        if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
          ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.crlOnlyAttrCert");
          throw new CertPathReviewerException(errorBundle);
        } 
      } 
    } 
    if (!bool) {
      ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.noValidCrlFound");
      throw new CertPathReviewerException(errorBundle);
    } 
  }
  
  protected Vector getCRLDistUrls(CRLDistPoint paramCRLDistPoint) {
    Vector<String> vector = new Vector();
    if (paramCRLDistPoint != null) {
      DistributionPoint[] arrayOfDistributionPoint = paramCRLDistPoint.getDistributionPoints();
      for (byte b = 0; b < arrayOfDistributionPoint.length; b++) {
        DistributionPointName distributionPointName = arrayOfDistributionPoint[b].getDistributionPoint();
        if (distributionPointName.getType() == 0) {
          GeneralName[] arrayOfGeneralName = GeneralNames.getInstance(distributionPointName.getName()).getNames();
          for (byte b1 = 0; b1 < arrayOfGeneralName.length; b1++) {
            if (arrayOfGeneralName[b1].getTagNo() == 6) {
              String str = ((ASN1IA5String)arrayOfGeneralName[b1].getName()).getString();
              vector.add(str);
            } 
          } 
        } 
      } 
    } 
    return vector;
  }
  
  protected Vector getOCSPUrls(AuthorityInformationAccess paramAuthorityInformationAccess) {
    Vector<String> vector = new Vector();
    if (paramAuthorityInformationAccess != null) {
      AccessDescription[] arrayOfAccessDescription = paramAuthorityInformationAccess.getAccessDescriptions();
      for (byte b = 0; b < arrayOfAccessDescription.length; b++) {
        if (arrayOfAccessDescription[b].getAccessMethod().equals((ASN1Primitive)AccessDescription.id_ad_ocsp)) {
          GeneralName generalName = arrayOfAccessDescription[b].getAccessLocation();
          if (generalName.getTagNo() == 6) {
            String str = ((ASN1IA5String)generalName.getName()).getString();
            vector.add(str);
          } 
        } 
      } 
    } 
    return vector;
  }
  
  private X509CRL getCRL(String paramString) throws CertPathReviewerException {
    X509CRL x509CRL = null;
    try {
      URL uRL = new URL(paramString);
      if (uRL.getProtocol().equals("http") || uRL.getProtocol().equals("https")) {
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.connect();
        if (httpURLConnection.getResponseCode() == 200) {
          CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509", "BC");
          x509CRL = (X509CRL)certificateFactory.generateCRL(httpURLConnection.getInputStream());
        } else {
          throw new Exception(httpURLConnection.getResponseMessage());
        } 
      } 
    } catch (Exception exception) {
      ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.loadCrlDistPointError", new Object[] { new UntrustedInput(paramString), exception.getMessage(), exception, exception.getClass().getName() });
      throw new CertPathReviewerException(errorBundle);
    } 
    return x509CRL;
  }
  
  protected Collection getTrustAnchors(X509Certificate paramX509Certificate, Set paramSet) throws CertPathReviewerException {
    ArrayList<TrustAnchor> arrayList = new ArrayList();
    Iterator<TrustAnchor> iterator = paramSet.iterator();
    X509CertSelector x509CertSelector = new X509CertSelector();
    try {
      x509CertSelector.setSubject(getEncodedIssuerPrincipal(paramX509Certificate).getEncoded());
      byte[] arrayOfByte = paramX509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
      if (arrayOfByte != null) {
        ASN1OctetString aSN1OctetString = (ASN1OctetString)ASN1Primitive.fromByteArray(arrayOfByte);
        AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1Primitive.fromByteArray(aSN1OctetString.getOctets()));
        BigInteger bigInteger = authorityKeyIdentifier.getAuthorityCertSerialNumber();
        if (bigInteger != null) {
          x509CertSelector.setSerialNumber(authorityKeyIdentifier.getAuthorityCertSerialNumber());
        } else {
          byte[] arrayOfByte1 = authorityKeyIdentifier.getKeyIdentifier();
          if (arrayOfByte1 != null)
            x509CertSelector.setSubjectKeyIdentifier((new DEROctetString(arrayOfByte1)).getEncoded()); 
        } 
      } 
    } catch (IOException iOException) {
      ErrorBundle errorBundle = createErrorBundle("CertPathReviewer.trustAnchorIssuerError");
      throw new CertPathReviewerException(errorBundle);
    } 
    while (iterator.hasNext()) {
      TrustAnchor trustAnchor = iterator.next();
      if (trustAnchor.getTrustedCert() != null) {
        if (x509CertSelector.match(trustAnchor.getTrustedCert()))
          arrayList.add(trustAnchor); 
        continue;
      } 
      if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null) {
        X500Principal x500Principal1 = getEncodedIssuerPrincipal(paramX509Certificate);
        X500Principal x500Principal2 = new X500Principal(trustAnchor.getCAName());
        if (x500Principal1.equals(x500Principal2))
          arrayList.add(trustAnchor); 
      } 
    } 
    return arrayList;
  }
  
  private static ErrorBundle createErrorBundle(String paramString) {
    ErrorBundle errorBundle = new ErrorBundle("org.bouncycastle.pkix.CertPathReviewerMessages", paramString);
    errorBundle.setClassLoader(PKIXCertPathReviewer.class.getClassLoader());
    return errorBundle;
  }
  
  private static ErrorBundle createErrorBundle(String paramString, Object[] paramArrayOfObject) {
    ErrorBundle errorBundle = new ErrorBundle("org.bouncycastle.pkix.CertPathReviewerMessages", paramString, paramArrayOfObject);
    errorBundle.setClassLoader(PKIXCertPathReviewer.class.getClassLoader());
    return errorBundle;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkix\jcajce\PKIXCertPathReviewer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */