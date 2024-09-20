package org.bouncycastle.mime.smime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSAlgorithm;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSSignedDataStreamGenerator;
import org.bouncycastle.cms.SignerInfoGenerator;
import org.bouncycastle.mime.Headers;
import org.bouncycastle.mime.MimeWriter;
import org.bouncycastle.mime.encoding.Base64OutputStream;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.Strings;

public class SMIMESignedWriter extends MimeWriter {
  public static final Map RFC3851_MICALGS;
  
  public static final Map RFC5751_MICALGS;
  
  public static final Map STANDARD_MICALGS;
  
  private final CMSSignedDataStreamGenerator sigGen;
  
  private final String boundary;
  
  private final OutputStream mimeOut;
  
  private final String contentTransferEncoding;
  
  private SMIMESignedWriter(Builder paramBuilder, Map<String, String> paramMap, String paramString, OutputStream paramOutputStream) {
    super(new Headers(mapToLines(paramMap), paramBuilder.contentTransferEncoding));
    this.sigGen = paramBuilder.sigGen;
    this.contentTransferEncoding = paramBuilder.contentTransferEncoding;
    this.boundary = paramString;
    this.mimeOut = paramOutputStream;
  }
  
  public OutputStream getContentStream() throws IOException {
    this.headers.dumpHeaders(this.mimeOut);
    this.mimeOut.write(Strings.toByteArray("\r\n"));
    if (this.boundary == null)
      return null; 
    this.mimeOut.write(Strings.toByteArray("This is an S/MIME signed message\r\n"));
    this.mimeOut.write(Strings.toByteArray("\r\n--"));
    this.mimeOut.write(Strings.toByteArray(this.boundary));
    this.mimeOut.write(Strings.toByteArray("\r\n"));
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream);
    return new ContentOutputStream(this.sigGen.open((OutputStream)base64OutputStream, false, SMimeUtils.createUnclosable(this.mimeOut)), this.mimeOut, byteArrayOutputStream, (OutputStream)base64OutputStream);
  }
  
  static {
    HashMap<Object, Object> hashMap1 = new HashMap<>();
    hashMap1.put(CMSAlgorithm.MD5, "md5");
    hashMap1.put(CMSAlgorithm.SHA1, "sha-1");
    hashMap1.put(CMSAlgorithm.SHA224, "sha-224");
    hashMap1.put(CMSAlgorithm.SHA256, "sha-256");
    hashMap1.put(CMSAlgorithm.SHA384, "sha-384");
    hashMap1.put(CMSAlgorithm.SHA512, "sha-512");
    hashMap1.put(CMSAlgorithm.GOST3411, "gostr3411-94");
    hashMap1.put(CMSAlgorithm.GOST3411_2012_256, "gostr3411-2012-256");
    hashMap1.put(CMSAlgorithm.GOST3411_2012_512, "gostr3411-2012-512");
    RFC5751_MICALGS = Collections.unmodifiableMap(hashMap1);
    HashMap<Object, Object> hashMap2 = new HashMap<>();
    hashMap2.put(CMSAlgorithm.MD5, "md5");
    hashMap2.put(CMSAlgorithm.SHA1, "sha1");
    hashMap2.put(CMSAlgorithm.SHA224, "sha224");
    hashMap2.put(CMSAlgorithm.SHA256, "sha256");
    hashMap2.put(CMSAlgorithm.SHA384, "sha384");
    hashMap2.put(CMSAlgorithm.SHA512, "sha512");
    hashMap2.put(CMSAlgorithm.GOST3411, "gostr3411-94");
    hashMap2.put(CMSAlgorithm.GOST3411_2012_256, "gostr3411-2012-256");
    hashMap2.put(CMSAlgorithm.GOST3411_2012_512, "gostr3411-2012-512");
    RFC3851_MICALGS = Collections.unmodifiableMap(hashMap2);
    STANDARD_MICALGS = RFC5751_MICALGS;
  }
  
  public static class Builder {
    private static final String[] detHeaders = new String[] { "Content-Type" };
    
    private static final String[] detValues = new String[] { "multipart/signed; protocol=\"application/pkcs7-signature\"" };
    
    private static final String[] encHeaders = new String[] { "Content-Type", "Content-Disposition", "Content-Transfer-Encoding", "Content-Description" };
    
    private static final String[] encValues = new String[] { "application/pkcs7-mime; name=\"smime.p7m\"; smime-type=enveloped-data", "attachment; filename=\"smime.p7m\"", "base64", "S/MIME Signed Message" };
    
    private final CMSSignedDataStreamGenerator sigGen = new CMSSignedDataStreamGenerator();
    
    private final Map<String, String> extraHeaders = new LinkedHashMap<>();
    
    private final boolean encapsulated;
    
    private final Map micAlgs = SMIMESignedWriter.STANDARD_MICALGS;
    
    String contentTransferEncoding = "base64";
    
    public Builder() {
      this(false);
    }
    
    public Builder(boolean param1Boolean) {
      this.encapsulated = param1Boolean;
    }
    
    public Builder withHeader(String param1String1, String param1String2) {
      this.extraHeaders.put(param1String1, param1String2);
      return this;
    }
    
    public Builder addCertificate(X509CertificateHolder param1X509CertificateHolder) throws CMSException {
      this.sigGen.addCertificate(param1X509CertificateHolder);
      return this;
    }
    
    public Builder addCertificates(Store param1Store) throws CMSException {
      this.sigGen.addCertificates(param1Store);
      return this;
    }
    
    public Builder addSignerInfoGenerator(SignerInfoGenerator param1SignerInfoGenerator) {
      this.sigGen.addSignerInfoGenerator(param1SignerInfoGenerator);
      return this;
    }
    
    public SMIMESignedWriter build(OutputStream param1OutputStream) {
      String str;
      LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
      if (this.encapsulated) {
        str = null;
        for (byte b = 0; b != encHeaders.length; b++)
          linkedHashMap.put(encHeaders[b], encValues[b]); 
      } else {
        str = generateBoundary();
        StringBuffer stringBuffer = new StringBuffer(detValues[0]);
        addHashHeader(stringBuffer, this.sigGen.getDigestAlgorithms());
        addBoundary(stringBuffer, str);
        linkedHashMap.put(detHeaders[0], stringBuffer.toString());
        for (byte b = 1; b < detHeaders.length; b++)
          linkedHashMap.put(detHeaders[b], detValues[b]); 
      } 
      for (Map.Entry<String, String> entry : this.extraHeaders.entrySet())
        linkedHashMap.put(entry.getKey(), entry.getValue()); 
      return new SMIMESignedWriter(this, linkedHashMap, str, SMimeUtils.autoBuffer(param1OutputStream));
    }
    
    private void addHashHeader(StringBuffer param1StringBuffer, List param1List) {
      byte b = 0;
      null = param1List.iterator();
      TreeSet<String> treeSet = new TreeSet();
      while (null.hasNext()) {
        AlgorithmIdentifier algorithmIdentifier = null.next();
        String str = (String)this.micAlgs.get(algorithmIdentifier.getAlgorithm());
        if (str == null) {
          treeSet.add("unknown");
          continue;
        } 
        treeSet.add(str);
      } 
      for (String str : treeSet) {
        if (!b) {
          if (treeSet.size() != 1) {
            param1StringBuffer.append("; micalg=\"");
          } else {
            param1StringBuffer.append("; micalg=");
          } 
        } else {
          param1StringBuffer.append(',');
        } 
        param1StringBuffer.append(str);
        b++;
      } 
      if (b != 0 && treeSet.size() != 1)
        param1StringBuffer.append('"'); 
    }
    
    private void addBoundary(StringBuffer param1StringBuffer, String param1String) {
      param1StringBuffer.append(";\r\n\tboundary=\"");
      param1StringBuffer.append(param1String);
      param1StringBuffer.append("\"");
    }
    
    private String generateBoundary() {
      SecureRandom secureRandom = new SecureRandom();
      return "==" + (new BigInteger(180, secureRandom)).setBit(179).toString(16) + "=";
    }
  }
  
  private class ContentOutputStream extends OutputStream {
    private final OutputStream main;
    
    private final OutputStream backing;
    
    private final ByteArrayOutputStream sigStream;
    
    private final OutputStream sigBase;
    
    ContentOutputStream(OutputStream param1OutputStream1, OutputStream param1OutputStream2, ByteArrayOutputStream param1ByteArrayOutputStream, OutputStream param1OutputStream3) {
      this.main = param1OutputStream1;
      this.backing = param1OutputStream2;
      this.sigStream = param1ByteArrayOutputStream;
      this.sigBase = param1OutputStream3;
    }
    
    public void write(byte[] param1ArrayOfbyte) throws IOException {
      this.main.write(param1ArrayOfbyte);
    }
    
    public void write(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) throws IOException {
      this.main.write(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    public void write(int param1Int) throws IOException {
      this.main.write(param1Int);
    }
    
    public void close() throws IOException {
      if (SMIMESignedWriter.this.boundary != null) {
        this.main.close();
        this.backing.write(Strings.toByteArray("\r\n--"));
        this.backing.write(Strings.toByteArray(SMIMESignedWriter.this.boundary));
        this.backing.write(Strings.toByteArray("\r\n"));
        this.backing.write(Strings.toByteArray("Content-Type: application/pkcs7-signature; name=\"smime.p7s\"\r\n"));
        this.backing.write(Strings.toByteArray("Content-Transfer-Encoding: base64\r\n"));
        this.backing.write(Strings.toByteArray("Content-Disposition: attachment; filename=\"smime.p7s\"\r\n"));
        this.backing.write(Strings.toByteArray("\r\n"));
        if (this.sigBase != null)
          this.sigBase.close(); 
        this.backing.write(this.sigStream.toByteArray());
        this.backing.write(Strings.toByteArray("\r\n--"));
        this.backing.write(Strings.toByteArray(SMIMESignedWriter.this.boundary));
        this.backing.write(Strings.toByteArray("--\r\n"));
      } 
      if (this.backing != null)
        this.backing.close(); 
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\smime\SMIMESignedWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */