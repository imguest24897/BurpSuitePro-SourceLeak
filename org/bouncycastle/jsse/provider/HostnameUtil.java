package org.bouncycastle.jsse.provider;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.BCStyle;
import org.bouncycastle.jsse.BCSNIHostName;
import org.bouncycastle.util.IPAddress;

class HostnameUtil {
  static void checkHostname(String paramString, X509Certificate paramX509Certificate, boolean paramBoolean) throws CertificateException {
    if (null == paramString)
      throw new CertificateException("No hostname specified for HTTPS endpoint ID check"); 
    if (IPAddress.isValid(paramString)) {
      Collection<List<?>> collection = paramX509Certificate.getSubjectAlternativeNames();
      if (null != collection)
        for (List<Integer> list : collection) {
          int i = ((Integer)list.get(0)).intValue();
          if (7 != i)
            continue; 
          String str = (String)list.get(1);
          if (paramString.equalsIgnoreCase(str))
            return; 
          try {
            if (InetAddress.getByName(paramString).equals(InetAddress.getByName(str)))
              return; 
          } catch (UnknownHostException unknownHostException) {
          
          } catch (SecurityException securityException) {}
        }  
      throw new CertificateException("No subject alternative name found matching IP address " + paramString);
    } 
    if (isValidDomainName(paramString)) {
      Collection<List<?>> collection = paramX509Certificate.getSubjectAlternativeNames();
      if (null != collection) {
        boolean bool = false;
        for (List<Integer> list : collection) {
          int i = ((Integer)list.get(0)).intValue();
          if (2 != i)
            continue; 
          bool = true;
          String str = (String)list.get(1);
          if (matchesDNSName(paramString, str, paramBoolean))
            return; 
        } 
        if (bool)
          throw new CertificateException("No subject alternative name found matching domain name " + paramString); 
      } 
      ASN1Primitive aSN1Primitive = findMostSpecificCN(paramX509Certificate.getSubjectX500Principal());
      if (aSN1Primitive instanceof ASN1String && matchesDNSName(paramString, ((ASN1String)aSN1Primitive).getString(), paramBoolean))
        return; 
      throw new CertificateException("No name found matching " + paramString);
    } 
    throw new CertificateException("Invalid hostname specified for HTTPS endpoint ID check");
  }
  
  private static ASN1Primitive findMostSpecificCN(X500Principal paramX500Principal) {
    if (null != paramX500Principal) {
      RDN[] arrayOfRDN = X500Name.getInstance(paramX500Principal.getEncoded()).getRDNs();
      for (int i = arrayOfRDN.length - 1; i >= 0; i--) {
        AttributeTypeAndValue[] arrayOfAttributeTypeAndValue = arrayOfRDN[i].getTypesAndValues();
        for (byte b = 0; b < arrayOfAttributeTypeAndValue.length; b++) {
          AttributeTypeAndValue attributeTypeAndValue = arrayOfAttributeTypeAndValue[b];
          if (BCStyle.CN.equals((ASN1Primitive)attributeTypeAndValue.getType()))
            return attributeTypeAndValue.getValue().toASN1Primitive(); 
        } 
      } 
    } 
    return null;
  }
  
  private static String getLabel(String paramString, int paramInt) {
    int i = paramString.indexOf('.', paramInt);
    if (i < 0)
      i = paramString.length(); 
    return paramString.substring(paramInt, i);
  }
  
  private static boolean isValidDomainName(String paramString) {
    try {
      new BCSNIHostName(paramString);
      return true;
    } catch (RuntimeException runtimeException) {
      return false;
    } 
  }
  
  private static boolean labelMatchesPattern(String paramString1, String paramString2) {
    int i = paramString2.indexOf('*');
    if (i < 0)
      return paramString1.equals(paramString2); 
    int j = 0;
    int k = 0;
    while (true) {
      String str = paramString2.substring(k, i);
      int m = paramString1.indexOf(str, j);
      if (m < 0 || (!k && m > 0))
        return false; 
      j = m + str.length();
      k = i + 1;
      if ((i = paramString2.indexOf('*', k)) < 0) {
        str = paramString1.substring(j);
        String str1 = paramString2.substring(k);
        return str.endsWith(str1);
      } 
    } 
  }
  
  private static boolean matchesDNSName(String paramString1, String paramString2, boolean paramBoolean) {
    try {
      paramString1 = IDNUtil.toUnicode(IDNUtil.toASCII(paramString1, 0), 0);
      paramString2 = IDNUtil.toUnicode(IDNUtil.toASCII(paramString2, 0), 0);
    } catch (RuntimeException runtimeException) {
      return false;
    } 
    if (!validateWildcards(paramString2))
      return false; 
    if (!isValidDomainName(paramString2.replace('*', 'z')))
      return false; 
    paramString1 = paramString1.toLowerCase(Locale.ENGLISH);
    paramString2 = paramString2.toLowerCase(Locale.ENGLISH);
    return paramBoolean ? matchesWildcardsAllLabels(paramString1, paramString2) : matchesWildcardsFirstLabel(paramString1, paramString2);
  }
  
  private static boolean matchesWildcardsAllLabels(String paramString1, String paramString2) {
    StringTokenizer stringTokenizer1 = new StringTokenizer(paramString1, ".");
    StringTokenizer stringTokenizer2 = new StringTokenizer(paramString2, ".");
    if (stringTokenizer1.countTokens() != stringTokenizer2.countTokens())
      return false; 
    while (stringTokenizer1.hasMoreTokens()) {
      String str1 = stringTokenizer1.nextToken();
      String str2 = stringTokenizer2.nextToken();
      if (!labelMatchesPattern(str1, str2))
        return false; 
    } 
    return true;
  }
  
  private static boolean matchesWildcardsFirstLabel(String paramString1, String paramString2) {
    String str1 = getLabel(paramString1, 0);
    String str2 = getLabel(paramString2, 0);
    if (!labelMatchesPattern(str1, str2))
      return false; 
    String str3 = paramString1.substring(str1.length());
    String str4 = paramString2.substring(str2.length());
    return str3.equals(str4);
  }
  
  private static boolean validateWildcards(String paramString) {
    int i = paramString.lastIndexOf('*');
    if (i >= 0) {
      if (paramString.equals("*") || paramString.equals("*."))
        return false; 
      int j = paramString.indexOf('.', i + 1);
      if (j < 0)
        return false; 
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\HostnameUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */