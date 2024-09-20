package burp;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509KeyManager;

class Zgfy implements X509KeyManager {
  private final String ZM;
  
  private final X509Certificate[] ZL;
  
  private Zgfy(String paramString, List<String> paramList) throws Exception {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZM : Ljava/lang/String;
    //   9: invokestatic ZD : ()I
    //   12: new org/bouncycastle/operator/jcajce/JcaContentSignerBuilder
    //   15: dup
    //   16: getstatic burp/Zrtm.ZO : Ljava/lang/String;
    //   19: invokespecial <init> : (Ljava/lang/String;)V
    //   22: getstatic burp/Zbng.ZB : Ljava/security/PrivateKey;
    //   25: invokevirtual build : (Ljava/security/PrivateKey;)Lorg/bouncycastle/operator/ContentSigner;
    //   28: astore #4
    //   30: istore_3
    //   31: getstatic burp/Zbng.ZU : Lorg/bouncycastle/asn1/x500/X500Name;
    //   34: getstatic org/bouncycastle/asn1/x500/style/BCStyle.OU : Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    //   37: invokestatic ZS : (Lorg/bouncycastle/asn1/x500/X500Name;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;
    //   40: astore #5
    //   42: new org/bouncycastle/asn1/x500/X500NameBuilder
    //   45: dup
    //   46: invokespecial <init> : ()V
    //   49: getstatic org/bouncycastle/asn1/x500/style/BCStyle.C : Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    //   52: getstatic burp/Zbng.ZU : Lorg/bouncycastle/asn1/x500/X500Name;
    //   55: getstatic org/bouncycastle/asn1/x500/style/BCStyle.C : Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    //   58: invokestatic ZS : (Lorg/bouncycastle/asn1/x500/X500Name;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;
    //   61: invokevirtual addRDN : (Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)Lorg/bouncycastle/asn1/x500/X500NameBuilder;
    //   64: getstatic org/bouncycastle/asn1/x500/style/BCStyle.O : Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    //   67: getstatic burp/Zbng.ZU : Lorg/bouncycastle/asn1/x500/X500Name;
    //   70: getstatic org/bouncycastle/asn1/x500/style/BCStyle.O : Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    //   73: invokestatic ZS : (Lorg/bouncycastle/asn1/x500/X500Name;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/String;
    //   76: invokevirtual addRDN : (Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)Lorg/bouncycastle/asn1/x500/X500NameBuilder;
    //   79: getstatic org/bouncycastle/asn1/x500/style/BCStyle.OU : Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    //   82: aload #5
    //   84: invokevirtual addRDN : (Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)Lorg/bouncycastle/asn1/x500/X500NameBuilder;
    //   87: getstatic org/bouncycastle/asn1/x500/style/BCStyle.CN : Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    //   90: aload_1
    //   91: invokevirtual addRDN : (Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)Lorg/bouncycastle/asn1/x500/X500NameBuilder;
    //   94: invokevirtual build : ()Lorg/bouncycastle/asn1/x500/X500Name;
    //   97: astore #6
    //   99: invokestatic getInstance : ()Ljava/util/Calendar;
    //   102: astore #7
    //   104: aload #7
    //   106: bipush #6
    //   108: bipush #-14
    //   110: invokevirtual add : (II)V
    //   113: invokestatic getInstance : ()Ljava/util/Calendar;
    //   116: astore #8
    //   118: aload #8
    //   120: bipush #6
    //   122: bipush #-14
    //   124: invokevirtual add : (II)V
    //   127: aload #8
    //   129: iconst_1
    //   130: iconst_1
    //   131: invokevirtual add : (II)V
    //   134: new org/bouncycastle/cert/jcajce/JcaX509v3CertificateBuilder
    //   137: dup
    //   138: getstatic burp/Zbng.ZU : Lorg/bouncycastle/asn1/x500/X500Name;
    //   141: getstatic burp/Zbng.ZF : Lburp/Zr09;
    //   144: invokevirtual Zw : ()Ljava/math/BigInteger;
    //   147: aload #7
    //   149: invokevirtual getTime : ()Ljava/util/Date;
    //   152: aload #8
    //   154: invokevirtual getTime : ()Ljava/util/Date;
    //   157: aload #6
    //   159: getstatic burp/Zbng.ZE : Ljava/security/cert/X509Certificate;
    //   162: invokevirtual getPublicKey : ()Ljava/security/PublicKey;
    //   165: invokespecial <init> : (Lorg/bouncycastle/asn1/x500/X500Name;Ljava/math/BigInteger;Ljava/util/Date;Ljava/util/Date;Lorg/bouncycastle/asn1/x500/X500Name;Ljava/security/PublicKey;)V
    //   168: astore #9
    //   170: new java/util/ArrayList
    //   173: dup
    //   174: invokespecial <init> : ()V
    //   177: astore #10
    //   179: aload_2
    //   180: ifnull -> 200
    //   183: aload_2
    //   184: aload_1
    //   185: invokeinterface contains : (Ljava/lang/Object;)Z
    //   190: ifne -> 224
    //   193: goto -> 200
    //   196: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   199: athrow
    //   200: aload #10
    //   202: new org/bouncycastle/asn1/x509/GeneralName
    //   205: dup
    //   206: iconst_2
    //   207: aload_1
    //   208: invokespecial <init> : (ILjava/lang/String;)V
    //   211: invokeinterface add : (Ljava/lang/Object;)Z
    //   216: pop
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   223: athrow
    //   224: aload_2
    //   225: ifnull -> 280
    //   228: aload_2
    //   229: invokeinterface iterator : ()Ljava/util/Iterator;
    //   234: astore #11
    //   236: aload #11
    //   238: invokeinterface hasNext : ()Z
    //   243: ifeq -> 280
    //   246: aload #11
    //   248: invokeinterface next : ()Ljava/lang/Object;
    //   253: checkcast java/lang/String
    //   256: astore #12
    //   258: aload #10
    //   260: new org/bouncycastle/asn1/x509/GeneralName
    //   263: dup
    //   264: iconst_2
    //   265: aload #12
    //   267: invokespecial <init> : (ILjava/lang/String;)V
    //   270: invokeinterface add : (Ljava/lang/Object;)Z
    //   275: pop
    //   276: iload_3
    //   277: ifeq -> 236
    //   280: new org/bouncycastle/asn1/x509/GeneralNames
    //   283: dup
    //   284: aload #10
    //   286: iconst_0
    //   287: anewarray org/bouncycastle/asn1/x509/GeneralName
    //   290: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   295: checkcast [Lorg/bouncycastle/asn1/x509/GeneralName;
    //   298: invokespecial <init> : ([Lorg/bouncycastle/asn1/x509/GeneralName;)V
    //   301: astore #11
    //   303: aload #9
    //   305: getstatic org/bouncycastle/asn1/x509/Extension.subjectAlternativeName : Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    //   308: iconst_0
    //   309: aload #11
    //   311: invokevirtual addExtension : (Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;ZLorg/bouncycastle/asn1/ASN1Encodable;)Lorg/bouncycastle/cert/X509v3CertificateBuilder;
    //   314: pop
    //   315: aload #9
    //   317: getstatic org/bouncycastle/asn1/x509/Extension.extendedKeyUsage : Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    //   320: iconst_0
    //   321: new org/bouncycastle/asn1/x509/ExtendedKeyUsage
    //   324: dup
    //   325: getstatic org/bouncycastle/asn1/x509/KeyPurposeId.id_kp_serverAuth : Lorg/bouncycastle/asn1/x509/KeyPurposeId;
    //   328: invokespecial <init> : (Lorg/bouncycastle/asn1/x509/KeyPurposeId;)V
    //   331: invokevirtual addExtension : (Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;ZLorg/bouncycastle/asn1/ASN1Encodable;)Lorg/bouncycastle/cert/X509v3CertificateBuilder;
    //   334: pop
    //   335: new org/bouncycastle/cert/jcajce/JcaX509CertificateConverter
    //   338: dup
    //   339: invokespecial <init> : ()V
    //   342: aload #9
    //   344: aload #4
    //   346: invokevirtual build : (Lorg/bouncycastle/operator/ContentSigner;)Lorg/bouncycastle/cert/X509CertificateHolder;
    //   349: invokevirtual getCertificate : (Lorg/bouncycastle/cert/X509CertificateHolder;)Ljava/security/cert/X509Certificate;
    //   352: astore #12
    //   354: aload_0
    //   355: iconst_2
    //   356: anewarray java/security/cert/X509Certificate
    //   359: dup
    //   360: iconst_0
    //   361: aload #12
    //   363: aastore
    //   364: dup
    //   365: iconst_1
    //   366: getstatic burp/Zbng.ZE : Ljava/security/cert/X509Certificate;
    //   369: aastore
    //   370: putfield ZL : [Ljava/security/cert/X509Certificate;
    //   373: return
    // Exception table:
    //   from	to	target	type
    //   179	193	196	java/lang/Exception
    //   183	217	220	java/lang/Exception
  }
  
  public String chooseClientAlias(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    return null;
  }
  
  public String chooseServerAlias(String paramString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    return this.ZM;
  }
  
  public X509Certificate[] getCertificateChain(String paramString) {
    return this.ZL;
  }
  
  public String[] getClientAliases(String paramString, Principal[] paramArrayOfPrincipal) {
    return null;
  }
  
  public PrivateKey getPrivateKey(String paramString) {
    return Zbng.ZB;
  }
  
  public String[] getServerAliases(String paramString, Principal[] paramArrayOfPrincipal) {
    return new String[] { this.ZM };
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgfy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */