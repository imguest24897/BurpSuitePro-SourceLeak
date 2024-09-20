package org.bouncycastle.est;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.est.CsrAttrs;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cmc.CMCException;
import org.bouncycastle.cmc.SimplePKIResponse;
import org.bouncycastle.mime.BasicMimeParser;
import org.bouncycastle.mime.ConstantMimeContext;
import org.bouncycastle.mime.Headers;
import org.bouncycastle.mime.MimeContext;
import org.bouncycastle.mime.MimeParserContext;
import org.bouncycastle.mime.MimeParserListener;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.encoders.Base64;

public class ESTService {
  protected static final String CACERTS = "/cacerts";
  
  protected static final String SIMPLE_ENROLL = "/simpleenroll";
  
  protected static final String SIMPLE_REENROLL = "/simplereenroll";
  
  protected static final String FULLCMC = "/fullcmc";
  
  protected static final String SERVERGEN = "/serverkeygen";
  
  protected static final String CSRATTRS = "/csrattrs";
  
  protected static final Set<String> illegalParts = new HashSet<>();
  
  private final String server;
  
  private final ESTClientProvider clientProvider;
  
  private static final Pattern pathInValid = Pattern.compile("^[0-9a-zA-Z_\\-.~!$&'()*+,;:=]+");
  
  ESTService(String paramString1, String paramString2, ESTClientProvider paramESTClientProvider) {
    paramString1 = verifyServer(paramString1);
    if (paramString2 != null) {
      paramString2 = verifyLabel(paramString2);
      this.server = "https://" + paramString1 + "/.well-known/est/" + paramString2;
    } else {
      this.server = "https://" + paramString1 + "/.well-known/est";
    } 
    this.clientProvider = paramESTClientProvider;
  }
  
  public static X509CertificateHolder[] storeToArray(Store<X509CertificateHolder> paramStore) {
    return storeToArray(paramStore, null);
  }
  
  public static X509CertificateHolder[] storeToArray(Store<X509CertificateHolder> paramStore, Selector<X509CertificateHolder> paramSelector) {
    Collection collection = paramStore.getMatches(paramSelector);
    return (X509CertificateHolder[])collection.toArray((Object[])new X509CertificateHolder[collection.size()]);
  }
  
  public CACertsResponse getCACerts() throws ESTException {
    ESTResponse eSTResponse = null;
    Exception exception = null;
    CACertsResponse cACertsResponse = null;
    URL uRL = null;
    boolean bool = false;
    try {
      uRL = new URL(this.server + "/cacerts");
      ESTClient eSTClient = this.clientProvider.makeClient();
      ESTRequest eSTRequest = (new ESTRequestBuilder("GET", uRL)).withClient(eSTClient).build();
      eSTResponse = eSTClient.doRequest(eSTRequest);
      Store<X509CertificateHolder> store = null;
      Store<X509CRLHolder> store1 = null;
      if (eSTResponse.getStatusCode() == 200) {
        String str = eSTResponse.getHeaders().getFirstValue("Content-Type");
        if (str == null || !str.startsWith("application/pkcs7-mime")) {
          String str1 = (str != null) ? (" got " + str) : " but was not present.";
          throw new ESTException("Response : " + uRL.toString() + "Expecting application/pkcs7-mime " + str1, null, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
        } 
        try {
          ASN1InputStream aSN1InputStream = getASN1InputStream(eSTResponse.getInputStream(), eSTResponse.getContentLength());
          SimplePKIResponse simplePKIResponse = new SimplePKIResponse(ContentInfo.getInstance(aSN1InputStream.readObject()));
          store = simplePKIResponse.getCertificates();
          store1 = simplePKIResponse.getCRLs();
        } catch (Throwable throwable) {
          throw new ESTException("Decoding CACerts: " + uRL.toString() + " " + throwable.getMessage(), throwable, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
        } 
      } else if (eSTResponse.getStatusCode() != 204) {
        throw new ESTException("Get CACerts: " + uRL.toString(), null, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
      } 
      cACertsResponse = new CACertsResponse(store, store1, eSTRequest, eSTResponse.getSource(), this.clientProvider.isTrusted());
    } catch (Throwable throwable) {
      bool = true;
      if (throwable instanceof ESTException)
        throw (ESTException)throwable; 
      throw new ESTException(throwable.getMessage(), throwable);
    } finally {
      if (eSTResponse != null)
        try {
          eSTResponse.close();
        } catch (Exception exception1) {
          exception = exception1;
        }  
    } 
    if (exception != null) {
      if (exception instanceof ESTException)
        throw (ESTException)exception; 
      throw new ESTException("Get CACerts: " + uRL.toString(), exception, eSTResponse.getStatusCode(), null);
    } 
    return cACertsResponse;
  }
  
  private ASN1InputStream getASN1InputStream(InputStream paramInputStream, Long paramLong) {
    return (paramLong == null) ? new ASN1InputStream(paramInputStream) : ((paramLong.intValue() == paramLong.longValue()) ? new ASN1InputStream(paramInputStream, paramLong.intValue()) : new ASN1InputStream(paramInputStream));
  }
  
  public EnrollmentResponse simpleEnroll(EnrollmentResponse paramEnrollmentResponse) throws Exception {
    if (!this.clientProvider.isTrusted())
      throw new IllegalStateException("No trust anchors."); 
    ESTResponse eSTResponse = null;
    try {
      ESTClient eSTClient = this.clientProvider.makeClient();
      eSTResponse = eSTClient.doRequest((new ESTRequestBuilder(paramEnrollmentResponse.getRequestToRetry())).withClient(eSTClient).build());
      return handleEnrollResponse(eSTResponse);
    } catch (Throwable throwable) {
      if (throwable instanceof ESTException)
        throw (ESTException)throwable; 
      throw new ESTException(throwable.getMessage(), throwable);
    } finally {
      if (eSTResponse != null)
        eSTResponse.close(); 
    } 
  }
  
  protected EnrollmentResponse enroll(boolean paramBoolean1, PKCS10CertificationRequest paramPKCS10CertificationRequest, ESTAuth paramESTAuth, boolean paramBoolean2) throws IOException {
    if (!this.clientProvider.isTrusted())
      throw new IllegalStateException("No trust anchors."); 
    ESTResponse eSTResponse = null;
    try {
      byte[] arrayOfByte = annotateRequest(paramPKCS10CertificationRequest.getEncoded()).getBytes();
      URL uRL = new URL(this.server + (paramBoolean2 ? "/serverkeygen" : (paramBoolean1 ? "/simplereenroll" : "/simpleenroll")));
      ESTClient eSTClient = this.clientProvider.makeClient();
      ESTRequestBuilder eSTRequestBuilder = (new ESTRequestBuilder("POST", uRL)).withData(arrayOfByte).withClient(eSTClient);
      eSTRequestBuilder.addHeader("Content-Type", "application/pkcs10");
      eSTRequestBuilder.addHeader("Content-Length", "" + arrayOfByte.length);
      eSTRequestBuilder.addHeader("Content-Transfer-Encoding", "base64");
      if (paramESTAuth != null)
        paramESTAuth.applyAuth(eSTRequestBuilder); 
      eSTResponse = eSTClient.doRequest(eSTRequestBuilder.build());
      return handleEnrollResponse(eSTResponse);
    } catch (Throwable throwable) {
      if (throwable instanceof ESTException)
        throw (ESTException)throwable; 
      throw new ESTException(throwable.getMessage(), throwable);
    } finally {
      if (eSTResponse != null)
        eSTResponse.close(); 
    } 
  }
  
  public EnrollmentResponse simpleEnroll(boolean paramBoolean, PKCS10CertificationRequest paramPKCS10CertificationRequest, ESTAuth paramESTAuth) throws IOException {
    return enroll(paramBoolean, paramPKCS10CertificationRequest, paramESTAuth, false);
  }
  
  public EnrollmentResponse simpleEnrollWithServersideCreation(PKCS10CertificationRequest paramPKCS10CertificationRequest, ESTAuth paramESTAuth) throws IOException {
    return enroll(false, paramPKCS10CertificationRequest, paramESTAuth, true);
  }
  
  public EnrollmentResponse enrollPop(boolean paramBoolean1, final PKCS10CertificationRequestBuilder builder, final ContentSigner contentSigner, ESTAuth paramESTAuth, boolean paramBoolean2) throws IOException {
    if (!this.clientProvider.isTrusted())
      throw new IllegalStateException("No trust anchors."); 
    ESTResponse eSTResponse = null;
    try {
      URL uRL = new URL(this.server + (paramBoolean1 ? "/simplereenroll" : "/simpleenroll"));
      ESTClient eSTClient = this.clientProvider.makeClient();
      ESTRequestBuilder eSTRequestBuilder = (new ESTRequestBuilder("POST", uRL)).withClient(eSTClient).withConnectionListener(new ESTSourceConnectionListener<Object, Object>() {
            public ESTRequest onConnection(Source param1Source, ESTRequest param1ESTRequest) throws IOException {
              if (param1Source instanceof TLSUniqueProvider && ((TLSUniqueProvider)param1Source).isTLSUniqueAvailable()) {
                PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder = new PKCS10CertificationRequestBuilder(builder);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] arrayOfByte = ((TLSUniqueProvider)param1Source).getTLSUnique();
                pKCS10CertificationRequestBuilder.setAttribute(PKCSObjectIdentifiers.pkcs_9_at_challengePassword, (ASN1Encodable)new DERPrintableString(Base64.toBase64String(arrayOfByte)));
                byteArrayOutputStream.write(ESTService.this.annotateRequest(pKCS10CertificationRequestBuilder.build(contentSigner).getEncoded()).getBytes());
                byteArrayOutputStream.flush();
                ESTRequestBuilder eSTRequestBuilder = (new ESTRequestBuilder(param1ESTRequest)).withData(byteArrayOutputStream.toByteArray());
                eSTRequestBuilder.setHeader("Content-Type", "application/pkcs10");
                eSTRequestBuilder.setHeader("Content-Transfer-Encoding", "base64");
                eSTRequestBuilder.setHeader("Content-Length", Long.toString(byteArrayOutputStream.size()));
                return eSTRequestBuilder.build();
              } 
              throw new IOException("Source does not supply TLS unique.");
            }
          });
      if (paramESTAuth != null)
        paramESTAuth.applyAuth(eSTRequestBuilder); 
      eSTResponse = eSTClient.doRequest(eSTRequestBuilder.build());
      return handleEnrollResponse(eSTResponse);
    } catch (Throwable throwable) {
      if (throwable instanceof ESTException)
        throw (ESTException)throwable; 
      throw new ESTException(throwable.getMessage(), throwable);
    } finally {
      if (eSTResponse != null)
        eSTResponse.close(); 
    } 
  }
  
  public EnrollmentResponse simpleEnrollPoP(boolean paramBoolean, PKCS10CertificationRequestBuilder paramPKCS10CertificationRequestBuilder, ContentSigner paramContentSigner, ESTAuth paramESTAuth) throws IOException {
    return enrollPop(paramBoolean, paramPKCS10CertificationRequestBuilder, paramContentSigner, paramESTAuth, false);
  }
  
  public EnrollmentResponse simpleEnrollPopWithServersideCreation(PKCS10CertificationRequestBuilder paramPKCS10CertificationRequestBuilder, ContentSigner paramContentSigner, ESTAuth paramESTAuth) throws IOException {
    return enrollPop(false, paramPKCS10CertificationRequestBuilder, paramContentSigner, paramESTAuth, true);
  }
  
  protected EnrollmentResponse handleEnrollResponse(ESTResponse paramESTResponse) throws IOException {
    ESTRequest eSTRequest = paramESTResponse.getOriginalRequest();
    Store<X509CertificateHolder> store = null;
    if (paramESTResponse.getStatusCode() == 202) {
      String str = paramESTResponse.getHeader("Retry-After");
      if (str == null)
        throw new ESTException("Got Status 202 but not Retry-After header from: " + eSTRequest.getURL().toString()); 
      long l = -1L;
      try {
        l = System.currentTimeMillis() + Long.parseLong(str) * 1000L;
      } catch (NumberFormatException numberFormatException) {
        try {
          SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
          simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
          l = simpleDateFormat.parse(str).getTime();
        } catch (Exception exception) {
          throw new ESTException("Unable to parse Retry-After header:" + eSTRequest.getURL().toString() + " " + exception.getMessage(), null, paramESTResponse.getStatusCode(), paramESTResponse.getInputStream());
        } 
      } 
      return new EnrollmentResponse(null, l, eSTRequest, paramESTResponse.getSource());
    } 
    if (paramESTResponse.getStatusCode() == 200 && paramESTResponse.getHeaderOrEmpty("content-type").contains("multipart/mixed")) {
      Headers headers = new Headers(paramESTResponse.getHeaderOrEmpty("content-type"), "base64");
      BasicMimeParser basicMimeParser = new BasicMimeParser(headers, paramESTResponse.getInputStream());
      final Object[] parts = new Object[2];
      basicMimeParser.parse(new MimeParserListener() {
            public MimeContext createContext(MimeParserContext param1MimeParserContext, Headers param1Headers) {
              return (MimeContext)ConstantMimeContext.Instance;
            }
            
            public void object(MimeParserContext param1MimeParserContext, Headers param1Headers, InputStream param1InputStream) throws IOException {
              if (param1Headers.getContentType().contains("application/pkcs8")) {
                ASN1InputStream aSN1InputStream = new ASN1InputStream(param1InputStream);
                parts[0] = PrivateKeyInfo.getInstance(aSN1InputStream.readObject());
                if (aSN1InputStream.readObject() != null)
                  throw new ESTException("Unexpected ASN1 object after private key info"); 
              } else if (param1Headers.getContentType().contains("application/pkcs7-mime")) {
                ASN1InputStream aSN1InputStream = new ASN1InputStream(param1InputStream);
                try {
                  parts[1] = new SimplePKIResponse(ContentInfo.getInstance(aSN1InputStream.readObject()));
                } catch (CMCException cMCException) {
                  throw new IOException(cMCException.getMessage());
                } 
                if (aSN1InputStream.readObject() != null)
                  throw new ESTException("Unexpected ASN1 object after reading certificates"); 
              } 
            }
          });
      if (arrayOfObject[0] == null || arrayOfObject[1] == null)
        throw new ESTException("received neither private key info and certificates"); 
      store = ((SimplePKIResponse)arrayOfObject[1]).getCertificates();
      return new EnrollmentResponse(store, -1L, null, paramESTResponse.getSource(), PrivateKeyInfo.getInstance(arrayOfObject[0]));
    } 
    if (paramESTResponse.getStatusCode() == 200) {
      ASN1InputStream aSN1InputStream = new ASN1InputStream(paramESTResponse.getInputStream());
      SimplePKIResponse simplePKIResponse = null;
      try {
        simplePKIResponse = new SimplePKIResponse(ContentInfo.getInstance(aSN1InputStream.readObject()));
      } catch (CMCException cMCException) {
        throw new ESTException(cMCException.getMessage(), cMCException.getCause());
      } 
      store = simplePKIResponse.getCertificates();
      return new EnrollmentResponse(store, -1L, null, paramESTResponse.getSource());
    } 
    throw new ESTException("Simple Enroll: " + eSTRequest.getURL().toString(), null, paramESTResponse.getStatusCode(), paramESTResponse.getInputStream());
  }
  
  public CSRRequestResponse getCSRAttributes() throws ESTException {
    if (!this.clientProvider.isTrusted())
      throw new IllegalStateException("No trust anchors."); 
    ESTResponse eSTResponse = null;
    CSRAttributesResponse cSRAttributesResponse = null;
    Exception exception = null;
    URL uRL = null;
    try {
      uRL = new URL(this.server + "/csrattrs");
      ESTClient eSTClient = this.clientProvider.makeClient();
      ESTRequest eSTRequest = (new ESTRequestBuilder("GET", uRL)).withClient(eSTClient).build();
      eSTResponse = eSTClient.doRequest(eSTRequest);
      switch (eSTResponse.getStatusCode()) {
        case 200:
          try {
            ASN1InputStream aSN1InputStream = getASN1InputStream(eSTResponse.getInputStream(), eSTResponse.getContentLength());
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(aSN1InputStream.readObject());
            cSRAttributesResponse = new CSRAttributesResponse(CsrAttrs.getInstance(aSN1Sequence));
          } catch (Throwable throwable) {
            throw new ESTException("Decoding CACerts: " + uRL.toString() + " " + throwable.getMessage(), throwable, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
          } 
          break;
        case 204:
          cSRAttributesResponse = null;
          break;
        case 404:
          cSRAttributesResponse = null;
          break;
        default:
          throw new ESTException("CSR Attribute request: " + eSTRequest.getURL().toString(), null, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
      } 
    } catch (Throwable throwable) {
      if (throwable instanceof ESTException)
        throw (ESTException)throwable; 
      throw new ESTException(throwable.getMessage(), throwable);
    } finally {
      if (eSTResponse != null)
        try {
          eSTResponse.close();
        } catch (Exception exception1) {
          exception = exception1;
        }  
    } 
    if (exception != null) {
      if (exception instanceof ESTException)
        throw (ESTException)exception; 
      throw new ESTException(exception.getMessage(), exception, eSTResponse.getStatusCode(), null);
    } 
    return new CSRRequestResponse(cSRAttributesResponse, eSTResponse.getSource());
  }
  
  private String annotateRequest(byte[] paramArrayOfbyte) {
    int i = 0;
    StringWriter stringWriter = new StringWriter();
    PrintWriter printWriter = new PrintWriter(stringWriter);
    while (true) {
      if (i + 48 < paramArrayOfbyte.length) {
        printWriter.print(Base64.toBase64String(paramArrayOfbyte, i, 48));
        i += 48;
      } else {
        printWriter.print(Base64.toBase64String(paramArrayOfbyte, i, paramArrayOfbyte.length - i));
        i = paramArrayOfbyte.length;
      } 
      printWriter.print('\n');
      if (i >= paramArrayOfbyte.length) {
        printWriter.flush();
        return stringWriter.toString();
      } 
    } 
  }
  
  private String verifyLabel(String paramString) {
    while (paramString.endsWith("/") && paramString.length() > 0)
      paramString = paramString.substring(0, paramString.length() - 1); 
    while (paramString.startsWith("/") && paramString.length() > 0)
      paramString = paramString.substring(1); 
    if (paramString.length() == 0)
      throw new IllegalArgumentException("Label set but after trimming '/' is not zero length string."); 
    if (!pathInValid.matcher(paramString).matches())
      throw new IllegalArgumentException("Server path " + paramString + " contains invalid characters"); 
    if (illegalParts.contains(paramString))
      throw new IllegalArgumentException("Label " + paramString + " is a reserved path segment."); 
    return paramString;
  }
  
  private String verifyServer(String paramString) {
    try {
      while (paramString.endsWith("/") && paramString.length() > 0)
        paramString = paramString.substring(0, paramString.length() - 1); 
      if (paramString.contains("://"))
        throw new IllegalArgumentException("Server contains scheme, must only be <dnsname/ipaddress>:port, https:// will be added arbitrarily."); 
      URL uRL = new URL("https://" + paramString);
      if (uRL.getPath().length() == 0 || uRL.getPath().equals("/"))
        return paramString; 
      throw new IllegalArgumentException("Server contains path, must only be <dnsname/ipaddress>:port, a path of '/.well-known/est/<label>' will be added arbitrarily.");
    } catch (Exception exception) {
      if (exception instanceof IllegalArgumentException)
        throw (IllegalArgumentException)exception; 
      throw new IllegalArgumentException("Scheme and host is invalid: " + exception.getMessage(), exception);
    } 
  }
  
  static {
    illegalParts.add("/cacerts".substring(1));
    illegalParts.add("/simpleenroll".substring(1));
    illegalParts.add("/simplereenroll".substring(1));
    illegalParts.add("/fullcmc".substring(1));
    illegalParts.add("/serverkeygen".substring(1));
    illegalParts.add("/csrattrs".substring(1));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\est\ESTService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */