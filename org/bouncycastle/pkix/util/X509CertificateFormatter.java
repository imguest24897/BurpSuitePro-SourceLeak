package org.bouncycastle.pkix.util;

import java.io.FileReader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.ExtendedKeyUsage;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.KeyPurposeId;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.operator.DefaultSignatureNameFinder;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

public class X509CertificateFormatter {
  private static Map<ASN1ObjectIdentifier, String> oidMap = new HashMap<>();
  
  private static Map<ASN1ObjectIdentifier, String> keyAlgMap = new HashMap<>();
  
  private static Map<KeyPurposeId, String> extUsageMap = new HashMap<>();
  
  private static Map<Integer, String> usageMap = new HashMap<>();
  
  private static final String spaceStr = "                                                              ";
  
  private static String oidToLabel(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    String str = oidMap.get(paramASN1ObjectIdentifier);
    return (str != null) ? str : paramASN1ObjectIdentifier.getId();
  }
  
  private static String keyAlgToLabel(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    String str = keyAlgMap.get(paramASN1ObjectIdentifier);
    return (str != null) ? str : paramASN1ObjectIdentifier.getId();
  }
  
  private static String spaces(int paramInt) {
    return "                                                              ".substring(0, paramInt);
  }
  
  private static String indent(String paramString1, String paramString2, String paramString3) {
    StringBuilder stringBuilder = new StringBuilder();
    byte b = 0;
    paramString2 = paramString2.substring(0, paramString2.length() - paramString3.length());
    int i;
    while ((i = paramString2.indexOf(paramString3)) > 0) {
      stringBuilder.append(paramString2.substring(b, i));
      stringBuilder.append(paramString3);
      stringBuilder.append(paramString1);
      if (b < paramString2.length())
        paramString2 = paramString2.substring(i + paramString3.length()); 
    } 
    if (stringBuilder.length() == 0)
      return paramString2; 
    stringBuilder.append(paramString2);
    return stringBuilder.toString();
  }
  
  static void prettyPrintData(byte[] paramArrayOfbyte, StringBuilder paramStringBuilder, String paramString) {
    if (paramArrayOfbyte.length > 20) {
      paramStringBuilder.append(Hex.toHexString(paramArrayOfbyte, 0, 20)).append(paramString);
      format(paramStringBuilder, paramArrayOfbyte, paramString);
    } else {
      paramStringBuilder.append(Hex.toHexString(paramArrayOfbyte)).append(paramString);
    } 
  }
  
  static void format(StringBuilder paramStringBuilder, byte[] paramArrayOfbyte, String paramString) {
    for (byte b = 20; b < paramArrayOfbyte.length; b += 20) {
      if (b < paramArrayOfbyte.length - 20) {
        paramStringBuilder.append("                       ").append(Hex.toHexString(paramArrayOfbyte, b, 20)).append(paramString);
      } else {
        paramStringBuilder.append("                       ").append(Hex.toHexString(paramArrayOfbyte, b, paramArrayOfbyte.length - b)).append(paramString);
      } 
    } 
  }
  
  public static String asString(X509CertificateHolder paramX509CertificateHolder) {
    StringBuilder stringBuilder = new StringBuilder();
    String str1 = Strings.lineSeparator();
    String str2 = (new DefaultSignatureNameFinder()).getAlgorithmName(paramX509CertificateHolder.getSignatureAlgorithm());
    str2 = str2.replace("WITH", "with");
    String str3 = keyAlgToLabel(paramX509CertificateHolder.getSubjectPublicKeyInfo().getAlgorithm().getAlgorithm());
    stringBuilder.append("  [0]         Version: ").append(paramX509CertificateHolder.getVersionNumber()).append(str1);
    stringBuilder.append("         SerialNumber: ").append(paramX509CertificateHolder.getSerialNumber()).append(str1);
    stringBuilder.append("             IssuerDN: ").append(paramX509CertificateHolder.getIssuer()).append(str1);
    stringBuilder.append("           Start Date: ").append(paramX509CertificateHolder.getNotBefore()).append(str1);
    stringBuilder.append("           Final Date: ").append(paramX509CertificateHolder.getNotAfter()).append(str1);
    stringBuilder.append("            SubjectDN: ").append(paramX509CertificateHolder.getSubject()).append(str1);
    stringBuilder.append("           Public Key: ").append(str3).append(str1);
    stringBuilder.append("                       ");
    prettyPrintData(paramX509CertificateHolder.getSubjectPublicKeyInfo().getPublicKeyData().getOctets(), stringBuilder, str1);
    Extensions extensions = paramX509CertificateHolder.getExtensions();
    if (extensions != null) {
      Enumeration<ASN1ObjectIdentifier> enumeration = extensions.oids();
      if (enumeration.hasMoreElements())
        stringBuilder.append("           Extensions: ").append(str1); 
      while (enumeration.hasMoreElements()) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = enumeration.nextElement();
        Extension extension = extensions.getExtension(aSN1ObjectIdentifier);
        if (extension.getExtnValue() != null) {
          byte[] arrayOfByte = extension.getExtnValue().getOctets();
          ASN1InputStream aSN1InputStream = new ASN1InputStream(arrayOfByte);
          String str = "                       ";
          try {
            String str4 = oidToLabel(aSN1ObjectIdentifier);
            stringBuilder.append(str).append(str4);
            stringBuilder.append(": critical(").append(extension.isCritical()).append(") ").append(str1);
            str = str + spaces(2 + str4.length());
            if (aSN1ObjectIdentifier.equals((ASN1Primitive)Extension.basicConstraints)) {
              BasicConstraints basicConstraints = BasicConstraints.getInstance(aSN1InputStream.readObject());
              stringBuilder.append(str).append("isCA : " + basicConstraints.isCA()).append(str1);
              if (basicConstraints.isCA()) {
                stringBuilder.append(spaces(2 + str4.length()));
                stringBuilder.append("pathLenConstraint : " + basicConstraints.getPathLenConstraint()).append(str1);
              } 
              continue;
            } 
            if (aSN1ObjectIdentifier.equals((ASN1Primitive)Extension.keyUsage)) {
              KeyUsage keyUsage = KeyUsage.getInstance(aSN1InputStream.readObject());
              stringBuilder.append(str);
              boolean bool = true;
              Iterator<Integer> iterator = usageMap.keySet().iterator();
              while (iterator.hasNext()) {
                int i = ((Integer)iterator.next()).intValue();
                if (keyUsage.hasUsages(i)) {
                  if (!bool) {
                    stringBuilder.append(", ");
                  } else {
                    bool = false;
                  } 
                  stringBuilder.append(usageMap.get(Integer.valueOf(i)));
                } 
              } 
              stringBuilder.append(str1);
              continue;
            } 
            if (aSN1ObjectIdentifier.equals((ASN1Primitive)Extension.extendedKeyUsage)) {
              ExtendedKeyUsage extendedKeyUsage = ExtendedKeyUsage.getInstance(aSN1InputStream.readObject());
              stringBuilder.append(str);
              boolean bool = true;
              for (KeyPurposeId keyPurposeId : extUsageMap.keySet()) {
                if (extendedKeyUsage.hasKeyPurposeId(keyPurposeId)) {
                  if (!bool) {
                    stringBuilder.append(", ");
                  } else {
                    bool = false;
                  } 
                  stringBuilder.append(extUsageMap.get(keyPurposeId));
                } 
              } 
              stringBuilder.append(str1);
              continue;
            } 
            stringBuilder.append(str).append("value = ").append(indent(str + spaces(8), ASN1Dump.dumpAsString(aSN1InputStream.readObject()), str1)).append(str1);
          } catch (Exception exception) {
            stringBuilder.append(aSN1ObjectIdentifier.getId());
            stringBuilder.append(" value = ").append("*****").append(str1);
          } 
          continue;
        } 
        stringBuilder.append(str1);
      } 
    } 
    stringBuilder.append("  Signature Algorithm: ").append(str2).append(str1);
    stringBuilder.append("            Signature: ");
    prettyPrintData(paramX509CertificateHolder.getSignature(), stringBuilder, str1);
    return stringBuilder.toString();
  }
  
  public static void main(String[] paramArrayOfString) throws Exception {
    PEMParser pEMParser = new PEMParser(new FileReader(paramArrayOfString[0]));
    System.out.println(asString((X509CertificateHolder)pEMParser.readObject()));
  }
  
  static {
    oidMap.put(Extension.subjectDirectoryAttributes, "subjectDirectoryAttributes");
    oidMap.put(Extension.subjectKeyIdentifier, "subjectKeyIdentifier");
    oidMap.put(Extension.keyUsage, "keyUsage");
    oidMap.put(Extension.privateKeyUsagePeriod, "privateKeyUsagePeriod");
    oidMap.put(Extension.subjectAlternativeName, "subjectAlternativeName");
    oidMap.put(Extension.issuerAlternativeName, "issuerAlternativeName");
    oidMap.put(Extension.basicConstraints, "basicConstraints");
    oidMap.put(Extension.cRLNumber, "cRLNumber");
    oidMap.put(Extension.reasonCode, "reasonCode");
    oidMap.put(Extension.instructionCode, "instructionCode");
    oidMap.put(Extension.invalidityDate, "invalidityDate");
    oidMap.put(Extension.deltaCRLIndicator, "deltaCRLIndicator");
    oidMap.put(Extension.issuingDistributionPoint, "issuingDistributionPoint");
    oidMap.put(Extension.certificateIssuer, "certificateIssuer");
    oidMap.put(Extension.nameConstraints, "nameConstraints");
    oidMap.put(Extension.cRLDistributionPoints, "cRLDistributionPoints");
    oidMap.put(Extension.certificatePolicies, "certificatePolicies");
    oidMap.put(Extension.policyMappings, "policyMappings");
    oidMap.put(Extension.authorityKeyIdentifier, "authorityKeyIdentifier");
    oidMap.put(Extension.policyConstraints, "policyConstraints");
    oidMap.put(Extension.extendedKeyUsage, "extendedKeyUsage");
    oidMap.put(Extension.freshestCRL, "freshestCRL");
    oidMap.put(Extension.inhibitAnyPolicy, "inhibitAnyPolicy");
    oidMap.put(Extension.authorityInfoAccess, "authorityInfoAccess");
    oidMap.put(Extension.subjectInfoAccess, "subjectInfoAccess");
    oidMap.put(Extension.logoType, "logoType");
    oidMap.put(Extension.biometricInfo, "biometricInfo");
    oidMap.put(Extension.qCStatements, "qCStatements");
    oidMap.put(Extension.auditIdentity, "auditIdentity");
    oidMap.put(Extension.noRevAvail, "noRevAvail");
    oidMap.put(Extension.targetInformation, "targetInformation");
    oidMap.put(Extension.expiredCertsOnCRL, "expiredCertsOnCRL");
    usageMap.put(Integer.valueOf(128), "digitalSignature");
    usageMap.put(Integer.valueOf(64), "nonRepudiation");
    usageMap.put(Integer.valueOf(32), "keyEncipherment");
    usageMap.put(Integer.valueOf(16), "dataEncipherment");
    usageMap.put(Integer.valueOf(8), "keyAgreement");
    usageMap.put(Integer.valueOf(4), "keyCertSign");
    usageMap.put(Integer.valueOf(2), "cRLSign");
    usageMap.put(Integer.valueOf(1), "encipherOnly");
    usageMap.put(Integer.valueOf(32768), "decipherOnly");
    extUsageMap.put(KeyPurposeId.anyExtendedKeyUsage, "anyExtendedKeyUsage");
    extUsageMap.put(KeyPurposeId.id_kp_serverAuth, "id_kp_serverAuth");
    extUsageMap.put(KeyPurposeId.id_kp_clientAuth, "id_kp_clientAuth");
    extUsageMap.put(KeyPurposeId.id_kp_codeSigning, "id_kp_codeSigning");
    extUsageMap.put(KeyPurposeId.id_kp_emailProtection, "id_kp_emailProtection");
    extUsageMap.put(KeyPurposeId.id_kp_ipsecEndSystem, "id_kp_ipsecEndSystem");
    extUsageMap.put(KeyPurposeId.id_kp_ipsecTunnel, "id_kp_ipsecTunnel");
    extUsageMap.put(KeyPurposeId.id_kp_ipsecUser, "id_kp_ipsecUser");
    extUsageMap.put(KeyPurposeId.id_kp_timeStamping, "id_kp_timeStamping");
    extUsageMap.put(KeyPurposeId.id_kp_OCSPSigning, "id_kp_OCSPSigning");
    extUsageMap.put(KeyPurposeId.id_kp_dvcs, "id_kp_dvcs");
    extUsageMap.put(KeyPurposeId.id_kp_sbgpCertAAServerAuth, "id_kp_sbgpCertAAServerAuth");
    extUsageMap.put(KeyPurposeId.id_kp_scvp_responder, "id_kp_scvp_responder");
    extUsageMap.put(KeyPurposeId.id_kp_eapOverPPP, "id_kp_eapOverPPP");
    extUsageMap.put(KeyPurposeId.id_kp_eapOverLAN, "id_kp_eapOverLAN");
    extUsageMap.put(KeyPurposeId.id_kp_scvpServer, "id_kp_scvpServer");
    extUsageMap.put(KeyPurposeId.id_kp_scvpClient, "id_kp_scvpClient");
    extUsageMap.put(KeyPurposeId.id_kp_ipsecIKE, "id_kp_ipsecIKE");
    extUsageMap.put(KeyPurposeId.id_kp_capwapAC, "id_kp_capwapAC");
    extUsageMap.put(KeyPurposeId.id_kp_capwapWTP, "id_kp_capwapWTP");
    extUsageMap.put(KeyPurposeId.id_kp_cmcCA, "id_kp_cmcCA");
    extUsageMap.put(KeyPurposeId.id_kp_cmcRA, "id_kp_cmcRA");
    extUsageMap.put(KeyPurposeId.id_kp_cmKGA, "id_kp_cmKGA");
    extUsageMap.put(KeyPurposeId.id_kp_smartcardlogon, "id_kp_smartcardlogon");
    extUsageMap.put(KeyPurposeId.id_kp_macAddress, "id_kp_macAddress");
    extUsageMap.put(KeyPurposeId.id_kp_msSGC, "id_kp_msSGC");
    extUsageMap.put(KeyPurposeId.id_kp_nsSGC, "id_kp_nsSGC");
    keyAlgMap.put(PKCSObjectIdentifiers.rsaEncryption, "rsaEncryption");
    keyAlgMap.put(X9ObjectIdentifiers.id_ecPublicKey, "id_ecPublicKey");
    keyAlgMap.put(EdECObjectIdentifiers.id_Ed25519, "id_Ed25519");
    keyAlgMap.put(EdECObjectIdentifiers.id_Ed448, "id_Ed448");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pki\\util\X509CertificateFormatter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */