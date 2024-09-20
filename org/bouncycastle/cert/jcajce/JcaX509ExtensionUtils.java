package org.bouncycastle.cert.jcajce;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509ExtensionUtils;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.Integers;

public class JcaX509ExtensionUtils extends X509ExtensionUtils {
  public JcaX509ExtensionUtils() throws NoSuchAlgorithmException {
    super(new SHA1DigestCalculator(MessageDigest.getInstance("SHA1")));
  }
  
  public JcaX509ExtensionUtils(DigestCalculator paramDigestCalculator) {
    super(paramDigestCalculator);
  }
  
  public AuthorityKeyIdentifier createAuthorityKeyIdentifier(X509Certificate paramX509Certificate) throws CertificateEncodingException {
    return createAuthorityKeyIdentifier(new JcaX509CertificateHolder(paramX509Certificate));
  }
  
  public AuthorityKeyIdentifier createAuthorityKeyIdentifier(PublicKey paramPublicKey) {
    return createAuthorityKeyIdentifier(SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded()));
  }
  
  public AuthorityKeyIdentifier createAuthorityKeyIdentifier(PublicKey paramPublicKey, X500Principal paramX500Principal, BigInteger paramBigInteger) {
    return createAuthorityKeyIdentifier(SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded()), new GeneralNames(new GeneralName(X500Name.getInstance(paramX500Principal.getEncoded()))), paramBigInteger);
  }
  
  public AuthorityKeyIdentifier createAuthorityKeyIdentifier(PublicKey paramPublicKey, GeneralNames paramGeneralNames, BigInteger paramBigInteger) {
    return createAuthorityKeyIdentifier(SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded()), paramGeneralNames, paramBigInteger);
  }
  
  public SubjectKeyIdentifier createSubjectKeyIdentifier(PublicKey paramPublicKey) {
    return createSubjectKeyIdentifier(SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded()));
  }
  
  public SubjectKeyIdentifier createTruncatedSubjectKeyIdentifier(PublicKey paramPublicKey) {
    return createTruncatedSubjectKeyIdentifier(SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded()));
  }
  
  public static ASN1Primitive parseExtensionValue(byte[] paramArrayOfbyte) throws IOException {
    return ASN1Primitive.fromByteArray(ASN1OctetString.getInstance(paramArrayOfbyte).getOctets());
  }
  
  public static Collection getIssuerAlternativeNames(X509Certificate paramX509Certificate) throws CertificateParsingException {
    byte[] arrayOfByte = paramX509Certificate.getExtensionValue(Extension.issuerAlternativeName.getId());
    return getAlternativeNames(arrayOfByte);
  }
  
  public static Collection getSubjectAlternativeNames(X509Certificate paramX509Certificate) throws CertificateParsingException {
    byte[] arrayOfByte = paramX509Certificate.getExtensionValue(Extension.subjectAlternativeName.getId());
    return getAlternativeNames(arrayOfByte);
  }
  
  private static Collection getAlternativeNames(byte[] paramArrayOfbyte) throws CertificateParsingException {
    if (paramArrayOfbyte == null)
      return Collections.EMPTY_LIST; 
    try {
      ArrayList<ArrayList<Integer>> arrayList = new ArrayList();
      Enumeration enumeration = DERSequence.getInstance(parseExtensionValue(paramArrayOfbyte)).getObjects();
      while (enumeration.hasMoreElements()) {
        byte[] arrayOfByte;
        String str;
        GeneralName generalName = GeneralName.getInstance(enumeration.nextElement());
        ArrayList<Integer> arrayList1 = new ArrayList();
        arrayList1.add(Integers.valueOf(generalName.getTagNo()));
        switch (generalName.getTagNo()) {
          case 0:
          case 3:
          case 5:
            arrayList1.add(generalName.getEncoded());
            break;
          case 4:
            arrayList1.add(X500Name.getInstance(RFC4519Style.INSTANCE, generalName.getName()).toString());
            break;
          case 1:
          case 2:
          case 6:
            arrayList1.add(((ASN1String)generalName.getName()).getString());
            break;
          case 8:
            arrayList1.add(ASN1ObjectIdentifier.getInstance(generalName.getName()).getId());
            break;
          case 7:
            arrayOfByte = DEROctetString.getInstance(generalName.getName()).getOctets();
            try {
              str = InetAddress.getByAddress(arrayOfByte).getHostAddress();
            } catch (UnknownHostException unknownHostException) {
              continue;
            } 
            arrayList1.add(str);
            break;
          default:
            throw new IOException("Bad tag number: " + generalName.getTagNo());
        } 
        arrayList.add(arrayList1);
      } 
      return Collections.unmodifiableCollection(arrayList);
    } catch (Exception exception) {
      throw new CertificateParsingException(exception.getMessage());
    } 
  }
  
  private static class SHA1DigestCalculator implements DigestCalculator {
    private ByteArrayOutputStream bOut = new ByteArrayOutputStream();
    
    private MessageDigest digest;
    
    public SHA1DigestCalculator(MessageDigest param1MessageDigest) {
      this.digest = param1MessageDigest;
    }
    
    public AlgorithmIdentifier getAlgorithmIdentifier() {
      return new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1);
    }
    
    public OutputStream getOutputStream() {
      return this.bOut;
    }
    
    public byte[] getDigest() {
      byte[] arrayOfByte = this.digest.digest(this.bOut.toByteArray());
      this.bOut.reset();
      return arrayOfByte;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\jcajce\JcaX509ExtensionUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */