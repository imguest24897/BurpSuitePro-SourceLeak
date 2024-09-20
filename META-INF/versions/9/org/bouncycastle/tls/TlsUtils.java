package META-INF.versions.9.org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.bsi.BSIObjectIdentifiers;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.CertificateRequest;
import org.bouncycastle.tls.CertificateStatus;
import org.bouncycastle.tls.CertificateType;
import org.bouncycastle.tls.CertificateVerify;
import org.bouncycastle.tls.CipherSuite;
import org.bouncycastle.tls.CombinedHash;
import org.bouncycastle.tls.DigestInputBuffer;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.ExtensionType;
import org.bouncycastle.tls.HandshakeMessageInput;
import org.bouncycastle.tls.HashAlgorithm;
import org.bouncycastle.tls.KeyExchangeAlgorithm;
import org.bouncycastle.tls.KeyShareEntry;
import org.bouncycastle.tls.MaxFragmentLength;
import org.bouncycastle.tls.NamedGroup;
import org.bouncycastle.tls.OfferedPsks;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.PskIdentity;
import org.bouncycastle.tls.RecordStream;
import org.bouncycastle.tls.SSL3Utils;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.SessionParameters;
import org.bouncycastle.tls.SignatureAlgorithm;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.TlsAuthentication;
import org.bouncycastle.tls.TlsClient;
import org.bouncycastle.tls.TlsClientContext;
import org.bouncycastle.tls.TlsContext;
import org.bouncycastle.tls.TlsCredentialedAgreement;
import org.bouncycastle.tls.TlsCredentialedDecryptor;
import org.bouncycastle.tls.TlsCredentialedSigner;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.TlsExtensionsUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsHandshakeHash;
import org.bouncycastle.tls.TlsKeyExchange;
import org.bouncycastle.tls.TlsKeyExchangeFactory;
import org.bouncycastle.tls.TlsObjectIdentifiers;
import org.bouncycastle.tls.TlsPSK;
import org.bouncycastle.tls.TlsPSKExternal;
import org.bouncycastle.tls.TlsProtocol;
import org.bouncycastle.tls.TlsServer;
import org.bouncycastle.tls.TlsServerCertificate;
import org.bouncycastle.tls.TlsServerCertificateImpl;
import org.bouncycastle.tls.TlsServerContext;
import org.bouncycastle.tls.TlsSession;
import org.bouncycastle.tls.TlsSessionImpl;
import org.bouncycastle.tls.crypto.Tls13Verifier;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsCipher;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsCryptoUtils;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsECConfig;
import org.bouncycastle.tls.crypto.TlsEncryptor;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.tls.crypto.TlsHashOutputStream;
import org.bouncycastle.tls.crypto.TlsKemConfig;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.tls.crypto.TlsStreamSigner;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;
import org.bouncycastle.tls.crypto.TlsVerifier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Shorts;
import org.bouncycastle.util.encoders.Hex;
import org.bouncycastle.util.io.Streams;

public class TlsUtils {
  private static byte[] DOWNGRADE_TLS11 = Hex.decodeStrict("444F574E47524400");
  
  private static byte[] DOWNGRADE_TLS12 = Hex.decodeStrict("444F574E47524401");
  
  private static final Hashtable CERT_SIG_ALG_OIDS = createCertSigAlgOIDs();
  
  private static final Vector DEFAULT_SUPPORTED_SIG_ALGS = createDefaultSupportedSigAlgs();
  
  public static final byte[] EMPTY_BYTES = new byte[0];
  
  public static final short[] EMPTY_SHORTS = new short[0];
  
  public static final int[] EMPTY_INTS = new int[0];
  
  public static final long[] EMPTY_LONGS = new long[0];
  
  public static final String[] EMPTY_STRINGS = new String[0];
  
  static final short MINIMUM_HASH_STRICT = 2;
  
  static final short MINIMUM_HASH_PREFERRED = 4;
  
  private static void addCertSigAlgOID(Hashtable<String, SignatureAndHashAlgorithm> paramHashtable, ASN1ObjectIdentifier paramASN1ObjectIdentifier, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    paramHashtable.put(paramASN1ObjectIdentifier.getId(), paramSignatureAndHashAlgorithm);
  }
  
  private static void addCertSigAlgOID(Hashtable paramHashtable, ASN1ObjectIdentifier paramASN1ObjectIdentifier, short paramShort1, short paramShort2) {
    addCertSigAlgOID(paramHashtable, paramASN1ObjectIdentifier, SignatureAndHashAlgorithm.getInstance(paramShort1, paramShort2));
  }
  
  private static Hashtable createCertSigAlgOIDs() {
    Hashtable<Object, Object> hashtable = new Hashtable<>();
    addCertSigAlgOID(hashtable, NISTObjectIdentifiers.dsa_with_sha224, (short)3, (short)2);
    addCertSigAlgOID(hashtable, NISTObjectIdentifiers.dsa_with_sha256, (short)4, (short)2);
    addCertSigAlgOID(hashtable, NISTObjectIdentifiers.dsa_with_sha384, (short)5, (short)2);
    addCertSigAlgOID(hashtable, NISTObjectIdentifiers.dsa_with_sha512, (short)6, (short)2);
    addCertSigAlgOID(hashtable, OIWObjectIdentifiers.dsaWithSHA1, (short)2, (short)2);
    addCertSigAlgOID(hashtable, OIWObjectIdentifiers.sha1WithRSA, (short)2, (short)1);
    addCertSigAlgOID(hashtable, PKCSObjectIdentifiers.sha1WithRSAEncryption, (short)2, (short)1);
    addCertSigAlgOID(hashtable, PKCSObjectIdentifiers.sha224WithRSAEncryption, (short)3, (short)1);
    addCertSigAlgOID(hashtable, PKCSObjectIdentifiers.sha256WithRSAEncryption, (short)4, (short)1);
    addCertSigAlgOID(hashtable, PKCSObjectIdentifiers.sha384WithRSAEncryption, (short)5, (short)1);
    addCertSigAlgOID(hashtable, PKCSObjectIdentifiers.sha512WithRSAEncryption, (short)6, (short)1);
    addCertSigAlgOID(hashtable, X9ObjectIdentifiers.ecdsa_with_SHA1, (short)2, (short)3);
    addCertSigAlgOID(hashtable, X9ObjectIdentifiers.ecdsa_with_SHA224, (short)3, (short)3);
    addCertSigAlgOID(hashtable, X9ObjectIdentifiers.ecdsa_with_SHA256, (short)4, (short)3);
    addCertSigAlgOID(hashtable, X9ObjectIdentifiers.ecdsa_with_SHA384, (short)5, (short)3);
    addCertSigAlgOID(hashtable, X9ObjectIdentifiers.ecdsa_with_SHA512, (short)6, (short)3);
    addCertSigAlgOID(hashtable, X9ObjectIdentifiers.id_dsa_with_sha1, (short)2, (short)2);
    addCertSigAlgOID(hashtable, EACObjectIdentifiers.id_TA_ECDSA_SHA_1, (short)2, (short)3);
    addCertSigAlgOID(hashtable, EACObjectIdentifiers.id_TA_ECDSA_SHA_224, (short)3, (short)3);
    addCertSigAlgOID(hashtable, EACObjectIdentifiers.id_TA_ECDSA_SHA_256, (short)4, (short)3);
    addCertSigAlgOID(hashtable, EACObjectIdentifiers.id_TA_ECDSA_SHA_384, (short)5, (short)3);
    addCertSigAlgOID(hashtable, EACObjectIdentifiers.id_TA_ECDSA_SHA_512, (short)6, (short)3);
    addCertSigAlgOID(hashtable, EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1, (short)2, (short)1);
    addCertSigAlgOID(hashtable, EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256, (short)4, (short)1);
    addCertSigAlgOID(hashtable, BSIObjectIdentifiers.ecdsa_plain_SHA1, (short)2, (short)3);
    addCertSigAlgOID(hashtable, BSIObjectIdentifiers.ecdsa_plain_SHA224, (short)3, (short)3);
    addCertSigAlgOID(hashtable, BSIObjectIdentifiers.ecdsa_plain_SHA256, (short)4, (short)3);
    addCertSigAlgOID(hashtable, BSIObjectIdentifiers.ecdsa_plain_SHA384, (short)5, (short)3);
    addCertSigAlgOID(hashtable, BSIObjectIdentifiers.ecdsa_plain_SHA512, (short)6, (short)3);
    addCertSigAlgOID(hashtable, EdECObjectIdentifiers.id_Ed25519, SignatureAndHashAlgorithm.ed25519);
    addCertSigAlgOID(hashtable, EdECObjectIdentifiers.id_Ed448, SignatureAndHashAlgorithm.ed448);
    addCertSigAlgOID(hashtable, RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, SignatureAndHashAlgorithm.gostr34102012_256);
    addCertSigAlgOID(hashtable, RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, SignatureAndHashAlgorithm.gostr34102012_512);
    return hashtable;
  }
  
  private static Vector createDefaultSupportedSigAlgs() {
    Vector<SignatureAndHashAlgorithm> vector = new Vector();
    vector.addElement(SignatureAndHashAlgorithm.ed25519);
    vector.addElement(SignatureAndHashAlgorithm.ed448);
    vector.addElement(SignatureAndHashAlgorithm.getInstance((short)4, (short)3));
    vector.addElement(SignatureAndHashAlgorithm.getInstance((short)5, (short)3));
    vector.addElement(SignatureAndHashAlgorithm.getInstance((short)6, (short)3));
    vector.addElement(SignatureAndHashAlgorithm.rsa_pss_rsae_sha256);
    vector.addElement(SignatureAndHashAlgorithm.rsa_pss_rsae_sha384);
    vector.addElement(SignatureAndHashAlgorithm.rsa_pss_rsae_sha512);
    vector.addElement(SignatureAndHashAlgorithm.rsa_pss_pss_sha256);
    vector.addElement(SignatureAndHashAlgorithm.rsa_pss_pss_sha384);
    vector.addElement(SignatureAndHashAlgorithm.rsa_pss_pss_sha512);
    vector.addElement(SignatureAndHashAlgorithm.getInstance((short)4, (short)1));
    vector.addElement(SignatureAndHashAlgorithm.getInstance((short)5, (short)1));
    vector.addElement(SignatureAndHashAlgorithm.getInstance((short)6, (short)1));
    vector.addElement(SignatureAndHashAlgorithm.getInstance((short)4, (short)2));
    vector.addElement(SignatureAndHashAlgorithm.getInstance((short)5, (short)2));
    vector.addElement(SignatureAndHashAlgorithm.getInstance((short)6, (short)2));
    vector.addElement(SignatureAndHashAlgorithm.getInstance((short)3, (short)3));
    vector.addElement(SignatureAndHashAlgorithm.getInstance((short)3, (short)1));
    vector.addElement(SignatureAndHashAlgorithm.getInstance((short)3, (short)2));
    vector.addElement(SignatureAndHashAlgorithm.getInstance((short)2, (short)3));
    vector.addElement(SignatureAndHashAlgorithm.getInstance((short)2, (short)1));
    vector.addElement(SignatureAndHashAlgorithm.getInstance((short)2, (short)2));
    return vector;
  }
  
  public static void checkUint8(short paramShort) throws IOException {
    if (!isValidUint8(paramShort))
      throw new TlsFatalAlert((short)80); 
  }
  
  public static void checkUint8(int paramInt) throws IOException {
    if (!isValidUint8(paramInt))
      throw new TlsFatalAlert((short)80); 
  }
  
  public static void checkUint8(long paramLong) throws IOException {
    if (!isValidUint8(paramLong))
      throw new TlsFatalAlert((short)80); 
  }
  
  public static void checkUint16(int paramInt) throws IOException {
    if (!isValidUint16(paramInt))
      throw new TlsFatalAlert((short)80); 
  }
  
  public static void checkUint16(long paramLong) throws IOException {
    if (!isValidUint16(paramLong))
      throw new TlsFatalAlert((short)80); 
  }
  
  public static void checkUint24(int paramInt) throws IOException {
    if (!isValidUint24(paramInt))
      throw new TlsFatalAlert((short)80); 
  }
  
  public static void checkUint24(long paramLong) throws IOException {
    if (!isValidUint24(paramLong))
      throw new TlsFatalAlert((short)80); 
  }
  
  public static void checkUint32(long paramLong) throws IOException {
    if (!isValidUint32(paramLong))
      throw new TlsFatalAlert((short)80); 
  }
  
  public static void checkUint48(long paramLong) throws IOException {
    if (!isValidUint48(paramLong))
      throw new TlsFatalAlert((short)80); 
  }
  
  public static void checkUint64(long paramLong) throws IOException {
    if (!isValidUint64(paramLong))
      throw new TlsFatalAlert((short)80); 
  }
  
  public static boolean isValidUint8(short paramShort) {
    return ((paramShort & 0xFF) == paramShort);
  }
  
  public static boolean isValidUint8(int paramInt) {
    return ((paramInt & 0xFF) == paramInt);
  }
  
  public static boolean isValidUint8(long paramLong) {
    return ((paramLong & 0xFFL) == paramLong);
  }
  
  public static boolean isValidUint16(int paramInt) {
    return ((paramInt & 0xFFFF) == paramInt);
  }
  
  public static boolean isValidUint16(long paramLong) {
    return ((paramLong & 0xFFFFL) == paramLong);
  }
  
  public static boolean isValidUint24(int paramInt) {
    return ((paramInt & 0xFFFFFF) == paramInt);
  }
  
  public static boolean isValidUint24(long paramLong) {
    return ((paramLong & 0xFFFFFFL) == paramLong);
  }
  
  public static boolean isValidUint32(long paramLong) {
    return ((paramLong & 0xFFFFFFFFL) == paramLong);
  }
  
  public static boolean isValidUint48(long paramLong) {
    return ((paramLong & 0xFFFFFFFFFFFFL) == paramLong);
  }
  
  public static boolean isValidUint64(long paramLong) {
    return true;
  }
  
  public static boolean isSSL(TlsContext paramTlsContext) {
    return paramTlsContext.getServerVersion().isSSL();
  }
  
  public static boolean isTLSv10(ProtocolVersion paramProtocolVersion) {
    return ProtocolVersion.TLSv10.isEqualOrEarlierVersionOf(paramProtocolVersion.getEquivalentTLSVersion());
  }
  
  public static boolean isTLSv10(TlsContext paramTlsContext) {
    return isTLSv10(paramTlsContext.getServerVersion());
  }
  
  public static boolean isTLSv11(ProtocolVersion paramProtocolVersion) {
    return ProtocolVersion.TLSv11.isEqualOrEarlierVersionOf(paramProtocolVersion.getEquivalentTLSVersion());
  }
  
  public static boolean isTLSv11(TlsContext paramTlsContext) {
    return isTLSv11(paramTlsContext.getServerVersion());
  }
  
  public static boolean isTLSv12(ProtocolVersion paramProtocolVersion) {
    return ProtocolVersion.TLSv12.isEqualOrEarlierVersionOf(paramProtocolVersion.getEquivalentTLSVersion());
  }
  
  public static boolean isTLSv12(TlsContext paramTlsContext) {
    return isTLSv12(paramTlsContext.getServerVersion());
  }
  
  public static boolean isTLSv13(ProtocolVersion paramProtocolVersion) {
    return ProtocolVersion.TLSv13.isEqualOrEarlierVersionOf(paramProtocolVersion.getEquivalentTLSVersion());
  }
  
  public static boolean isTLSv13(TlsContext paramTlsContext) {
    return isTLSv13(paramTlsContext.getServerVersion());
  }
  
  public static void writeUint8(short paramShort, OutputStream paramOutputStream) throws IOException {
    paramOutputStream.write(paramShort);
  }
  
  public static void writeUint8(int paramInt, OutputStream paramOutputStream) throws IOException {
    paramOutputStream.write(paramInt);
  }
  
  public static void writeUint8(short paramShort, byte[] paramArrayOfbyte, int paramInt) {
    paramArrayOfbyte[paramInt] = (byte)paramShort;
  }
  
  public static void writeUint8(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    paramArrayOfbyte[paramInt2] = (byte)paramInt1;
  }
  
  public static void writeUint16(int paramInt, OutputStream paramOutputStream) throws IOException {
    paramOutputStream.write(paramInt >>> 8);
    paramOutputStream.write(paramInt);
  }
  
  public static void writeUint16(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    paramArrayOfbyte[paramInt2] = (byte)(paramInt1 >>> 8);
    paramArrayOfbyte[paramInt2 + 1] = (byte)paramInt1;
  }
  
  public static void writeUint24(int paramInt, OutputStream paramOutputStream) throws IOException {
    paramOutputStream.write((byte)(paramInt >>> 16));
    paramOutputStream.write((byte)(paramInt >>> 8));
    paramOutputStream.write((byte)paramInt);
  }
  
  public static void writeUint24(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    paramArrayOfbyte[paramInt2] = (byte)(paramInt1 >>> 16);
    paramArrayOfbyte[paramInt2 + 1] = (byte)(paramInt1 >>> 8);
    paramArrayOfbyte[paramInt2 + 2] = (byte)paramInt1;
  }
  
  public static void writeUint32(long paramLong, OutputStream paramOutputStream) throws IOException {
    paramOutputStream.write((byte)(int)(paramLong >>> 24L));
    paramOutputStream.write((byte)(int)(paramLong >>> 16L));
    paramOutputStream.write((byte)(int)(paramLong >>> 8L));
    paramOutputStream.write((byte)(int)paramLong);
  }
  
  public static void writeUint32(long paramLong, byte[] paramArrayOfbyte, int paramInt) {
    paramArrayOfbyte[paramInt] = (byte)(int)(paramLong >>> 24L);
    paramArrayOfbyte[paramInt + 1] = (byte)(int)(paramLong >>> 16L);
    paramArrayOfbyte[paramInt + 2] = (byte)(int)(paramLong >>> 8L);
    paramArrayOfbyte[paramInt + 3] = (byte)(int)paramLong;
  }
  
  public static void writeUint48(long paramLong, OutputStream paramOutputStream) throws IOException {
    paramOutputStream.write((byte)(int)(paramLong >>> 40L));
    paramOutputStream.write((byte)(int)(paramLong >>> 32L));
    paramOutputStream.write((byte)(int)(paramLong >>> 24L));
    paramOutputStream.write((byte)(int)(paramLong >>> 16L));
    paramOutputStream.write((byte)(int)(paramLong >>> 8L));
    paramOutputStream.write((byte)(int)paramLong);
  }
  
  public static void writeUint48(long paramLong, byte[] paramArrayOfbyte, int paramInt) {
    paramArrayOfbyte[paramInt] = (byte)(int)(paramLong >>> 40L);
    paramArrayOfbyte[paramInt + 1] = (byte)(int)(paramLong >>> 32L);
    paramArrayOfbyte[paramInt + 2] = (byte)(int)(paramLong >>> 24L);
    paramArrayOfbyte[paramInt + 3] = (byte)(int)(paramLong >>> 16L);
    paramArrayOfbyte[paramInt + 4] = (byte)(int)(paramLong >>> 8L);
    paramArrayOfbyte[paramInt + 5] = (byte)(int)paramLong;
  }
  
  public static void writeUint64(long paramLong, OutputStream paramOutputStream) throws IOException {
    paramOutputStream.write((byte)(int)(paramLong >>> 56L));
    paramOutputStream.write((byte)(int)(paramLong >>> 48L));
    paramOutputStream.write((byte)(int)(paramLong >>> 40L));
    paramOutputStream.write((byte)(int)(paramLong >>> 32L));
    paramOutputStream.write((byte)(int)(paramLong >>> 24L));
    paramOutputStream.write((byte)(int)(paramLong >>> 16L));
    paramOutputStream.write((byte)(int)(paramLong >>> 8L));
    paramOutputStream.write((byte)(int)paramLong);
  }
  
  public static void writeUint64(long paramLong, byte[] paramArrayOfbyte, int paramInt) {
    paramArrayOfbyte[paramInt] = (byte)(int)(paramLong >>> 56L);
    paramArrayOfbyte[paramInt + 1] = (byte)(int)(paramLong >>> 48L);
    paramArrayOfbyte[paramInt + 2] = (byte)(int)(paramLong >>> 40L);
    paramArrayOfbyte[paramInt + 3] = (byte)(int)(paramLong >>> 32L);
    paramArrayOfbyte[paramInt + 4] = (byte)(int)(paramLong >>> 24L);
    paramArrayOfbyte[paramInt + 5] = (byte)(int)(paramLong >>> 16L);
    paramArrayOfbyte[paramInt + 6] = (byte)(int)(paramLong >>> 8L);
    paramArrayOfbyte[paramInt + 7] = (byte)(int)paramLong;
  }
  
  public static void writeOpaque8(byte[] paramArrayOfbyte, OutputStream paramOutputStream) throws IOException {
    checkUint8(paramArrayOfbyte.length);
    writeUint8(paramArrayOfbyte.length, paramOutputStream);
    paramOutputStream.write(paramArrayOfbyte);
  }
  
  public static void writeOpaque8(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) throws IOException {
    checkUint8(paramArrayOfbyte1.length);
    writeUint8(paramArrayOfbyte1.length, paramArrayOfbyte2, paramInt);
    System.arraycopy(paramArrayOfbyte1, 0, paramArrayOfbyte2, paramInt + 1, paramArrayOfbyte1.length);
  }
  
  public static void writeOpaque16(byte[] paramArrayOfbyte, OutputStream paramOutputStream) throws IOException {
    checkUint16(paramArrayOfbyte.length);
    writeUint16(paramArrayOfbyte.length, paramOutputStream);
    paramOutputStream.write(paramArrayOfbyte);
  }
  
  public static void writeOpaque16(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) throws IOException {
    checkUint16(paramArrayOfbyte1.length);
    writeUint16(paramArrayOfbyte1.length, paramArrayOfbyte2, paramInt);
    System.arraycopy(paramArrayOfbyte1, 0, paramArrayOfbyte2, paramInt + 2, paramArrayOfbyte1.length);
  }
  
  public static void writeOpaque24(byte[] paramArrayOfbyte, OutputStream paramOutputStream) throws IOException {
    checkUint24(paramArrayOfbyte.length);
    writeUint24(paramArrayOfbyte.length, paramOutputStream);
    paramOutputStream.write(paramArrayOfbyte);
  }
  
  public static void writeOpaque24(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) throws IOException {
    checkUint24(paramArrayOfbyte1.length);
    writeUint24(paramArrayOfbyte1.length, paramArrayOfbyte2, paramInt);
    System.arraycopy(paramArrayOfbyte1, 0, paramArrayOfbyte2, paramInt + 3, paramArrayOfbyte1.length);
  }
  
  public static void writeUint8Array(short[] paramArrayOfshort, OutputStream paramOutputStream) throws IOException {
    for (byte b = 0; b < paramArrayOfshort.length; b++)
      writeUint8(paramArrayOfshort[b], paramOutputStream); 
  }
  
  public static void writeUint8Array(short[] paramArrayOfshort, byte[] paramArrayOfbyte, int paramInt) throws IOException {
    for (byte b = 0; b < paramArrayOfshort.length; b++) {
      writeUint8(paramArrayOfshort[b], paramArrayOfbyte, paramInt);
      paramInt++;
    } 
  }
  
  public static void writeUint8ArrayWithUint8Length(short[] paramArrayOfshort, OutputStream paramOutputStream) throws IOException {
    checkUint8(paramArrayOfshort.length);
    writeUint8(paramArrayOfshort.length, paramOutputStream);
    writeUint8Array(paramArrayOfshort, paramOutputStream);
  }
  
  public static void writeUint8ArrayWithUint8Length(short[] paramArrayOfshort, byte[] paramArrayOfbyte, int paramInt) throws IOException {
    checkUint8(paramArrayOfshort.length);
    writeUint8(paramArrayOfshort.length, paramArrayOfbyte, paramInt);
    writeUint8Array(paramArrayOfshort, paramArrayOfbyte, paramInt + 1);
  }
  
  public static void writeUint16Array(int[] paramArrayOfint, OutputStream paramOutputStream) throws IOException {
    for (byte b = 0; b < paramArrayOfint.length; b++)
      writeUint16(paramArrayOfint[b], paramOutputStream); 
  }
  
  public static void writeUint16Array(int[] paramArrayOfint, byte[] paramArrayOfbyte, int paramInt) throws IOException {
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      writeUint16(paramArrayOfint[b], paramArrayOfbyte, paramInt);
      paramInt += 2;
    } 
  }
  
  public static void writeUint16ArrayWithUint8Length(int[] paramArrayOfint, byte[] paramArrayOfbyte, int paramInt) throws IOException {
    int i = 2 * paramArrayOfint.length;
    checkUint8(i);
    writeUint8(i, paramArrayOfbyte, paramInt);
    writeUint16Array(paramArrayOfint, paramArrayOfbyte, paramInt + 1);
  }
  
  public static void writeUint16ArrayWithUint16Length(int[] paramArrayOfint, OutputStream paramOutputStream) throws IOException {
    int i = 2 * paramArrayOfint.length;
    checkUint16(i);
    writeUint16(i, paramOutputStream);
    writeUint16Array(paramArrayOfint, paramOutputStream);
  }
  
  public static void writeUint16ArrayWithUint16Length(int[] paramArrayOfint, byte[] paramArrayOfbyte, int paramInt) throws IOException {
    int i = 2 * paramArrayOfint.length;
    checkUint16(i);
    writeUint16(i, paramArrayOfbyte, paramInt);
    writeUint16Array(paramArrayOfint, paramArrayOfbyte, paramInt + 2);
  }
  
  public static byte[] decodeOpaque8(byte[] paramArrayOfbyte) throws IOException {
    return decodeOpaque8(paramArrayOfbyte, 0);
  }
  
  public static byte[] decodeOpaque8(byte[] paramArrayOfbyte, int paramInt) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'buf' cannot be null"); 
    if (paramArrayOfbyte.length < 1)
      throw new TlsFatalAlert((short)50); 
    short s = readUint8(paramArrayOfbyte, 0);
    if (paramArrayOfbyte.length != s + 1 || s < paramInt)
      throw new TlsFatalAlert((short)50); 
    return copyOfRangeExact(paramArrayOfbyte, 1, paramArrayOfbyte.length);
  }
  
  public static byte[] decodeOpaque16(byte[] paramArrayOfbyte) throws IOException {
    return decodeOpaque16(paramArrayOfbyte, 0);
  }
  
  public static byte[] decodeOpaque16(byte[] paramArrayOfbyte, int paramInt) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'buf' cannot be null"); 
    if (paramArrayOfbyte.length < 2)
      throw new TlsFatalAlert((short)50); 
    int i = readUint16(paramArrayOfbyte, 0);
    if (paramArrayOfbyte.length != i + 2 || i < paramInt)
      throw new TlsFatalAlert((short)50); 
    return copyOfRangeExact(paramArrayOfbyte, 2, paramArrayOfbyte.length);
  }
  
  public static short decodeUint8(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'buf' cannot be null"); 
    if (paramArrayOfbyte.length != 1)
      throw new TlsFatalAlert((short)50); 
    return readUint8(paramArrayOfbyte, 0);
  }
  
  public static short[] decodeUint8ArrayWithUint8Length(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'buf' cannot be null"); 
    if (paramArrayOfbyte.length < 1)
      throw new TlsFatalAlert((short)50); 
    short s = readUint8(paramArrayOfbyte, 0);
    if (paramArrayOfbyte.length != s + 1)
      throw new TlsFatalAlert((short)50); 
    short[] arrayOfShort = new short[s];
    for (byte b = 0; b < s; b++)
      arrayOfShort[b] = readUint8(paramArrayOfbyte, b + 1); 
    return arrayOfShort;
  }
  
  public static int decodeUint16(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'buf' cannot be null"); 
    if (paramArrayOfbyte.length != 2)
      throw new TlsFatalAlert((short)50); 
    return readUint16(paramArrayOfbyte, 0);
  }
  
  public static int[] decodeUint16ArrayWithUint8Length(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'buf' cannot be null"); 
    short s = readUint8(paramArrayOfbyte, 0);
    if (paramArrayOfbyte.length != s + 1 || (s & 0x1) != 0)
      throw new TlsFatalAlert((short)50); 
    int i = s / 2;
    boolean bool = true;
    int[] arrayOfInt = new int[i];
    for (byte b = 0; b < i; b++) {
      arrayOfInt[b] = readUint16(paramArrayOfbyte, bool);
      bool += true;
    } 
    return arrayOfInt;
  }
  
  public static long decodeUint32(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'buf' cannot be null"); 
    if (paramArrayOfbyte.length != 4)
      throw new TlsFatalAlert((short)50); 
    return readUint32(paramArrayOfbyte, 0);
  }
  
  public static byte[] encodeOpaque8(byte[] paramArrayOfbyte) throws IOException {
    checkUint8(paramArrayOfbyte.length);
    return Arrays.prepend(paramArrayOfbyte, (byte)paramArrayOfbyte.length);
  }
  
  public static byte[] encodeOpaque16(byte[] paramArrayOfbyte) throws IOException {
    checkUint16(paramArrayOfbyte.length);
    byte[] arrayOfByte = new byte[2 + paramArrayOfbyte.length];
    writeUint16(paramArrayOfbyte.length, arrayOfByte, 0);
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 2, paramArrayOfbyte.length);
    return arrayOfByte;
  }
  
  public static byte[] encodeOpaque24(byte[] paramArrayOfbyte) throws IOException {
    checkUint24(paramArrayOfbyte.length);
    byte[] arrayOfByte = new byte[3 + paramArrayOfbyte.length];
    writeUint24(paramArrayOfbyte.length, arrayOfByte, 0);
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 3, paramArrayOfbyte.length);
    return arrayOfByte;
  }
  
  public static byte[] encodeUint8(short paramShort) throws IOException {
    checkUint8(paramShort);
    byte[] arrayOfByte = new byte[1];
    writeUint8(paramShort, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static byte[] encodeUint8ArrayWithUint8Length(short[] paramArrayOfshort) throws IOException {
    byte[] arrayOfByte = new byte[1 + paramArrayOfshort.length];
    writeUint8ArrayWithUint8Length(paramArrayOfshort, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static byte[] encodeUint16(int paramInt) throws IOException {
    checkUint16(paramInt);
    byte[] arrayOfByte = new byte[2];
    writeUint16(paramInt, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static byte[] encodeUint16ArrayWithUint8Length(int[] paramArrayOfint) throws IOException {
    int i = 2 * paramArrayOfint.length;
    byte[] arrayOfByte = new byte[1 + i];
    writeUint16ArrayWithUint8Length(paramArrayOfint, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static byte[] encodeUint16ArrayWithUint16Length(int[] paramArrayOfint) throws IOException {
    int i = 2 * paramArrayOfint.length;
    byte[] arrayOfByte = new byte[2 + i];
    writeUint16ArrayWithUint16Length(paramArrayOfint, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static byte[] encodeUint24(int paramInt) throws IOException {
    checkUint24(paramInt);
    byte[] arrayOfByte = new byte[3];
    writeUint24(paramInt, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static byte[] encodeUint32(long paramLong) throws IOException {
    checkUint32(paramLong);
    byte[] arrayOfByte = new byte[4];
    writeUint32(paramLong, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public static byte[] encodeVersion(ProtocolVersion paramProtocolVersion) throws IOException {
    return new byte[] { (byte)paramProtocolVersion.getMajorVersion(), (byte)paramProtocolVersion.getMinorVersion() };
  }
  
  public static int readInt32(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramArrayOfbyte[paramInt] << 24;
    i |= (paramArrayOfbyte[++paramInt] & 0xFF) << 16;
    i |= (paramArrayOfbyte[++paramInt] & 0xFF) << 8;
    i |= paramArrayOfbyte[++paramInt] & 0xFF;
    return i;
  }
  
  public static short readUint8(InputStream paramInputStream) throws IOException {
    int i = paramInputStream.read();
    if (i < 0)
      throw new EOFException(); 
    return (short)i;
  }
  
  public static short readUint8(byte[] paramArrayOfbyte, int paramInt) {
    return (short)(paramArrayOfbyte[paramInt] & 0xFF);
  }
  
  public static int readUint16(InputStream paramInputStream) throws IOException {
    int i = paramInputStream.read();
    int j = paramInputStream.read();
    if (j < 0)
      throw new EOFException(); 
    return i << 8 | j;
  }
  
  public static int readUint16(byte[] paramArrayOfbyte, int paramInt) {
    int i = (paramArrayOfbyte[paramInt] & 0xFF) << 8;
    i |= paramArrayOfbyte[++paramInt] & 0xFF;
    return i;
  }
  
  public static int readUint24(InputStream paramInputStream) throws IOException {
    int i = paramInputStream.read();
    int j = paramInputStream.read();
    int k = paramInputStream.read();
    if (k < 0)
      throw new EOFException(); 
    return i << 16 | j << 8 | k;
  }
  
  public static int readUint24(byte[] paramArrayOfbyte, int paramInt) {
    int i = (paramArrayOfbyte[paramInt] & 0xFF) << 16;
    i |= (paramArrayOfbyte[++paramInt] & 0xFF) << 8;
    i |= paramArrayOfbyte[++paramInt] & 0xFF;
    return i;
  }
  
  public static long readUint32(InputStream paramInputStream) throws IOException {
    int i = paramInputStream.read();
    int j = paramInputStream.read();
    int k = paramInputStream.read();
    int m = paramInputStream.read();
    if (m < 0)
      throw new EOFException(); 
    return (i << 24 | j << 16 | k << 8 | m) & 0xFFFFFFFFL;
  }
  
  public static long readUint32(byte[] paramArrayOfbyte, int paramInt) {
    int i = (paramArrayOfbyte[paramInt] & 0xFF) << 24;
    i |= (paramArrayOfbyte[++paramInt] & 0xFF) << 16;
    i |= (paramArrayOfbyte[++paramInt] & 0xFF) << 8;
    i |= paramArrayOfbyte[++paramInt] & 0xFF;
    return i & 0xFFFFFFFFL;
  }
  
  public static long readUint48(InputStream paramInputStream) throws IOException {
    int i = readUint24(paramInputStream);
    int j = readUint24(paramInputStream);
    return (i & 0xFFFFFFFFL) << 24L | j & 0xFFFFFFFFL;
  }
  
  public static long readUint48(byte[] paramArrayOfbyte, int paramInt) {
    int i = readUint24(paramArrayOfbyte, paramInt);
    int j = readUint24(paramArrayOfbyte, paramInt + 3);
    return (i & 0xFFFFFFFFL) << 24L | j & 0xFFFFFFFFL;
  }
  
  public static byte[] readAllOrNothing(int paramInt, InputStream paramInputStream) throws IOException {
    if (paramInt < 1)
      return EMPTY_BYTES; 
    byte[] arrayOfByte = new byte[paramInt];
    int i = Streams.readFully(paramInputStream, arrayOfByte);
    if (i == 0)
      return null; 
    if (i != paramInt)
      throw new EOFException(); 
    return arrayOfByte;
  }
  
  public static byte[] readFully(int paramInt, InputStream paramInputStream) throws IOException {
    if (paramInt < 1)
      return EMPTY_BYTES; 
    byte[] arrayOfByte = new byte[paramInt];
    if (paramInt != Streams.readFully(paramInputStream, arrayOfByte))
      throw new EOFException(); 
    return arrayOfByte;
  }
  
  public static void readFully(byte[] paramArrayOfbyte, InputStream paramInputStream) throws IOException {
    int i = paramArrayOfbyte.length;
    if (i > 0 && i != Streams.readFully(paramInputStream, paramArrayOfbyte))
      throw new EOFException(); 
  }
  
  public static byte[] readOpaque8(InputStream paramInputStream) throws IOException {
    short s = readUint8(paramInputStream);
    return readFully(s, paramInputStream);
  }
  
  public static byte[] readOpaque8(InputStream paramInputStream, int paramInt) throws IOException {
    short s = readUint8(paramInputStream);
    if (s < paramInt)
      throw new TlsFatalAlert((short)50); 
    return readFully(s, paramInputStream);
  }
  
  public static byte[] readOpaque8(InputStream paramInputStream, int paramInt1, int paramInt2) throws IOException {
    short s = readUint8(paramInputStream);
    if (s < paramInt1 || paramInt2 < s)
      throw new TlsFatalAlert((short)50); 
    return readFully(s, paramInputStream);
  }
  
  public static byte[] readOpaque16(InputStream paramInputStream) throws IOException {
    int i = readUint16(paramInputStream);
    return readFully(i, paramInputStream);
  }
  
  public static byte[] readOpaque16(InputStream paramInputStream, int paramInt) throws IOException {
    int i = readUint16(paramInputStream);
    if (i < paramInt)
      throw new TlsFatalAlert((short)50); 
    return readFully(i, paramInputStream);
  }
  
  public static byte[] readOpaque24(InputStream paramInputStream) throws IOException {
    int i = readUint24(paramInputStream);
    return readFully(i, paramInputStream);
  }
  
  public static byte[] readOpaque24(InputStream paramInputStream, int paramInt) throws IOException {
    int i = readUint24(paramInputStream);
    if (i < paramInt)
      throw new TlsFatalAlert((short)50); 
    return readFully(i, paramInputStream);
  }
  
  public static short[] readUint8Array(int paramInt, InputStream paramInputStream) throws IOException {
    short[] arrayOfShort = new short[paramInt];
    for (byte b = 0; b < paramInt; b++)
      arrayOfShort[b] = readUint8(paramInputStream); 
    return arrayOfShort;
  }
  
  public static short[] readUint8ArrayWithUint8Length(InputStream paramInputStream, int paramInt) throws IOException {
    short s = readUint8(paramInputStream);
    if (s < paramInt)
      throw new TlsFatalAlert((short)50); 
    return readUint8Array(s, paramInputStream);
  }
  
  public static int[] readUint16Array(int paramInt, InputStream paramInputStream) throws IOException {
    int[] arrayOfInt = new int[paramInt];
    for (byte b = 0; b < paramInt; b++)
      arrayOfInt[b] = readUint16(paramInputStream); 
    return arrayOfInt;
  }
  
  public static ProtocolVersion readVersion(byte[] paramArrayOfbyte, int paramInt) {
    return ProtocolVersion.get(paramArrayOfbyte[paramInt] & 0xFF, paramArrayOfbyte[paramInt + 1] & 0xFF);
  }
  
  public static ProtocolVersion readVersion(InputStream paramInputStream) throws IOException {
    int i = paramInputStream.read();
    int j = paramInputStream.read();
    if (j < 0)
      throw new EOFException(); 
    return ProtocolVersion.get(i, j);
  }
  
  public static ASN1Primitive readASN1Object(byte[] paramArrayOfbyte) throws IOException {
    ASN1InputStream aSN1InputStream = new ASN1InputStream(paramArrayOfbyte);
    ASN1Primitive aSN1Primitive = aSN1InputStream.readObject();
    if (null == aSN1Primitive)
      throw new TlsFatalAlert((short)50); 
    if (null != aSN1InputStream.readObject())
      throw new TlsFatalAlert((short)50); 
    return aSN1Primitive;
  }
  
  public static ASN1Primitive readDERObject(byte[] paramArrayOfbyte) throws IOException {
    ASN1Primitive aSN1Primitive = readASN1Object(paramArrayOfbyte);
    requireDEREncoding((ASN1Object)aSN1Primitive, paramArrayOfbyte);
    return aSN1Primitive;
  }
  
  public static void requireDEREncoding(ASN1Object paramASN1Object, byte[] paramArrayOfbyte) throws IOException {
    byte[] arrayOfByte = paramASN1Object.getEncoded("DER");
    if (!Arrays.areEqual(arrayOfByte, paramArrayOfbyte))
      throw new TlsFatalAlert((short)50); 
  }
  
  public static void writeGMTUnixTime(byte[] paramArrayOfbyte, int paramInt) {
    int i = (int)(System.currentTimeMillis() / 1000L);
    paramArrayOfbyte[paramInt] = (byte)(i >>> 24);
    paramArrayOfbyte[paramInt + 1] = (byte)(i >>> 16);
    paramArrayOfbyte[paramInt + 2] = (byte)(i >>> 8);
    paramArrayOfbyte[paramInt + 3] = (byte)i;
  }
  
  public static void writeVersion(ProtocolVersion paramProtocolVersion, OutputStream paramOutputStream) throws IOException {
    paramOutputStream.write(paramProtocolVersion.getMajorVersion());
    paramOutputStream.write(paramProtocolVersion.getMinorVersion());
  }
  
  public static void writeVersion(ProtocolVersion paramProtocolVersion, byte[] paramArrayOfbyte, int paramInt) {
    paramArrayOfbyte[paramInt] = (byte)paramProtocolVersion.getMajorVersion();
    paramArrayOfbyte[paramInt + 1] = (byte)paramProtocolVersion.getMinorVersion();
  }
  
  public static void addIfSupported(Vector<SignatureAndHashAlgorithm> paramVector, TlsCrypto paramTlsCrypto, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    if (paramTlsCrypto.hasSignatureAndHashAlgorithm(paramSignatureAndHashAlgorithm))
      paramVector.addElement(paramSignatureAndHashAlgorithm); 
  }
  
  public static void addIfSupported(Vector<Integer> paramVector, TlsCrypto paramTlsCrypto, int paramInt) {
    if (paramTlsCrypto.hasNamedGroup(paramInt))
      paramVector.addElement(Integers.valueOf(paramInt)); 
  }
  
  public static void addIfSupported(Vector paramVector, TlsCrypto paramTlsCrypto, int[] paramArrayOfint) {
    for (byte b = 0; b < paramArrayOfint.length; b++)
      addIfSupported(paramVector, paramTlsCrypto, paramArrayOfint[b]); 
  }
  
  public static boolean addToSet(Vector<Integer> paramVector, int paramInt) {
    boolean bool = !paramVector.contains(Integers.valueOf(paramInt)) ? true : false;
    if (bool)
      paramVector.add(Integers.valueOf(paramInt)); 
    return bool;
  }
  
  public static Vector getDefaultDSSSignatureAlgorithms() {
    return getDefaultSignatureAlgorithms((short)2);
  }
  
  public static Vector getDefaultECDSASignatureAlgorithms() {
    return getDefaultSignatureAlgorithms((short)3);
  }
  
  public static Vector getDefaultRSASignatureAlgorithms() {
    return getDefaultSignatureAlgorithms((short)1);
  }
  
  public static SignatureAndHashAlgorithm getDefaultSignatureAlgorithm(short paramShort) {
    switch (paramShort) {
      case 1:
      case 2:
      case 3:
        return SignatureAndHashAlgorithm.getInstance((short)2, paramShort);
    } 
    return null;
  }
  
  public static Vector getDefaultSignatureAlgorithms(short paramShort) {
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = getDefaultSignatureAlgorithm(paramShort);
    return (null == signatureAndHashAlgorithm) ? new Vector() : vectorOfOne(signatureAndHashAlgorithm);
  }
  
  public static Vector getDefaultSupportedSignatureAlgorithms(TlsContext paramTlsContext) {
    return getSupportedSignatureAlgorithms(paramTlsContext, DEFAULT_SUPPORTED_SIG_ALGS);
  }
  
  public static Vector getSupportedSignatureAlgorithms(TlsContext paramTlsContext, Vector<SignatureAndHashAlgorithm> paramVector) {
    TlsCrypto tlsCrypto = paramTlsContext.getCrypto();
    int i = paramVector.size();
    Vector vector = new Vector(i);
    for (byte b = 0; b < i; b++)
      addIfSupported(vector, tlsCrypto, paramVector.elementAt(b)); 
    return vector;
  }
  
  public static SignatureAndHashAlgorithm getSignatureAndHashAlgorithm(TlsContext paramTlsContext, TlsCredentialedSigner paramTlsCredentialedSigner) throws IOException {
    return getSignatureAndHashAlgorithm(paramTlsContext.getServerVersion(), paramTlsCredentialedSigner);
  }
  
  static SignatureAndHashAlgorithm getSignatureAndHashAlgorithm(ProtocolVersion paramProtocolVersion, TlsCredentialedSigner paramTlsCredentialedSigner) throws IOException {
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = null;
    if (isSignatureAlgorithmsExtensionAllowed(paramProtocolVersion)) {
      signatureAndHashAlgorithm = paramTlsCredentialedSigner.getSignatureAndHashAlgorithm();
      if (signatureAndHashAlgorithm == null)
        throw new TlsFatalAlert((short)80); 
    } 
    return signatureAndHashAlgorithm;
  }
  
  public static byte[] getExtensionData(Hashtable paramHashtable, Integer paramInteger) {
    return (paramHashtable == null) ? null : (byte[])paramHashtable.get(paramInteger);
  }
  
  public static boolean hasExpectedEmptyExtensionData(Hashtable paramHashtable, Integer paramInteger, short paramShort) throws IOException {
    byte[] arrayOfByte = getExtensionData(paramHashtable, paramInteger);
    if (arrayOfByte == null)
      return false; 
    if (arrayOfByte.length != 0)
      throw new TlsFatalAlert(paramShort); 
    return true;
  }
  
  public static TlsSession importSession(byte[] paramArrayOfbyte, SessionParameters paramSessionParameters) {
    return (TlsSession)new TlsSessionImpl(paramArrayOfbyte, paramSessionParameters);
  }
  
  static boolean isExtendedMasterSecretOptional(ProtocolVersion paramProtocolVersion) {
    ProtocolVersion protocolVersion = paramProtocolVersion.getEquivalentTLSVersion();
    return (ProtocolVersion.TLSv12.equals(protocolVersion) || ProtocolVersion.TLSv11.equals(protocolVersion) || ProtocolVersion.TLSv10.equals(protocolVersion));
  }
  
  static boolean isExtendedMasterSecretOptional(ProtocolVersion[] paramArrayOfProtocolVersion) {
    if (paramArrayOfProtocolVersion != null)
      for (byte b = 0; b < paramArrayOfProtocolVersion.length; b++) {
        if (isExtendedMasterSecretOptional(paramArrayOfProtocolVersion[b]))
          return true; 
      }  
    return false;
  }
  
  public static boolean isNullOrContainsNull(Object[] paramArrayOfObject) {
    if (null == paramArrayOfObject)
      return true; 
    int i = paramArrayOfObject.length;
    for (byte b = 0; b < i; b++) {
      if (null == paramArrayOfObject[b])
        return true; 
    } 
    return false;
  }
  
  public static boolean isNullOrEmpty(byte[] paramArrayOfbyte) {
    return (null == paramArrayOfbyte || paramArrayOfbyte.length < 1);
  }
  
  public static boolean isNullOrEmpty(short[] paramArrayOfshort) {
    return (null == paramArrayOfshort || paramArrayOfshort.length < 1);
  }
  
  public static boolean isNullOrEmpty(int[] paramArrayOfint) {
    return (null == paramArrayOfint || paramArrayOfint.length < 1);
  }
  
  public static boolean isNullOrEmpty(Object[] paramArrayOfObject) {
    return (null == paramArrayOfObject || paramArrayOfObject.length < 1);
  }
  
  public static boolean isNullOrEmpty(String paramString) {
    return (null == paramString || paramString.length() < 1);
  }
  
  public static boolean isNullOrEmpty(Vector paramVector) {
    return (null == paramVector || paramVector.isEmpty());
  }
  
  public static boolean isSignatureAlgorithmsExtensionAllowed(ProtocolVersion paramProtocolVersion) {
    return (null != paramProtocolVersion && ProtocolVersion.TLSv12.isEqualOrEarlierVersionOf(paramProtocolVersion.getEquivalentTLSVersion()));
  }
  
  public static short getLegacyClientCertType(short paramShort) {
    switch (paramShort) {
      case 1:
        return 1;
      case 2:
        return 2;
      case 3:
        return 64;
    } 
    return -1;
  }
  
  public static short getLegacySignatureAlgorithmClient(short paramShort) {
    switch (paramShort) {
      case 2:
        return 2;
      case 64:
        return 3;
      case 1:
        return 1;
    } 
    return -1;
  }
  
  public static short getLegacySignatureAlgorithmClientCert(short paramShort) {
    switch (paramShort) {
      case 2:
      case 4:
        return 2;
      case 64:
      case 66:
        return 3;
      case 1:
      case 3:
      case 65:
        return 1;
    } 
    return -1;
  }
  
  public static short getLegacySignatureAlgorithmServer(int paramInt) {
    switch (paramInt) {
      case 3:
      case 22:
        return 2;
      case 17:
        return 3;
      case 5:
      case 19:
      case 23:
        return 1;
    } 
    return -1;
  }
  
  public static short getLegacySignatureAlgorithmServerCert(int paramInt) {
    switch (paramInt) {
      case 3:
      case 7:
      case 22:
        return 2;
      case 16:
      case 17:
        return 3;
      case 1:
      case 5:
      case 9:
      case 15:
      case 18:
      case 19:
      case 23:
        return 1;
    } 
    return -1;
  }
  
  public static Vector getLegacySupportedSignatureAlgorithms() {
    Vector<SignatureAndHashAlgorithm> vector = new Vector(3);
    vector.add(SignatureAndHashAlgorithm.getInstance((short)2, (short)2));
    vector.add(SignatureAndHashAlgorithm.getInstance((short)2, (short)3));
    vector.add(SignatureAndHashAlgorithm.getInstance((short)2, (short)1));
    return vector;
  }
  
  public static void encodeSupportedSignatureAlgorithms(Vector<SignatureAndHashAlgorithm> paramVector, OutputStream paramOutputStream) throws IOException {
    if (paramVector == null || paramVector.size() < 1 || paramVector.size() >= 32768)
      throw new IllegalArgumentException("'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)"); 
    int i = 2 * paramVector.size();
    checkUint16(i);
    writeUint16(i, paramOutputStream);
    for (byte b = 0; b < paramVector.size(); b++) {
      SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramVector.elementAt(b);
      if (signatureAndHashAlgorithm.getSignature() == 0)
        throw new IllegalArgumentException("SignatureAlgorithm.anonymous MUST NOT appear in the signature_algorithms extension"); 
      signatureAndHashAlgorithm.encode(paramOutputStream);
    } 
  }
  
  public static Vector parseSupportedSignatureAlgorithms(InputStream paramInputStream) throws IOException {
    int i = readUint16(paramInputStream);
    if (i < 2 || (i & 0x1) != 0)
      throw new TlsFatalAlert((short)50); 
    int j = i / 2;
    Vector<SignatureAndHashAlgorithm> vector = new Vector(j);
    for (byte b = 0; b < j; b++) {
      SignatureAndHashAlgorithm signatureAndHashAlgorithm = SignatureAndHashAlgorithm.parse(paramInputStream);
      if (0 != signatureAndHashAlgorithm.getSignature())
        vector.addElement(signatureAndHashAlgorithm); 
    } 
    return vector;
  }
  
  public static void verifySupportedSignatureAlgorithm(Vector paramVector, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) throws IOException {
    verifySupportedSignatureAlgorithm(paramVector, paramSignatureAndHashAlgorithm, (short)47);
  }
  
  static void verifySupportedSignatureAlgorithm(Vector paramVector, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, short paramShort) throws IOException {
    if (paramVector == null || paramVector.size() < 1 || paramVector.size() >= 32768)
      throw new IllegalArgumentException("'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)"); 
    if (paramSignatureAndHashAlgorithm == null)
      throw new IllegalArgumentException("'signatureAlgorithm' cannot be null"); 
    if (paramSignatureAndHashAlgorithm.getSignature() == 0 || !containsSignatureAlgorithm(paramVector, paramSignatureAndHashAlgorithm))
      throw new TlsFatalAlert(paramShort); 
  }
  
  public static boolean containsSignatureAlgorithm(Vector<SignatureAndHashAlgorithm> paramVector, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) throws IOException {
    for (byte b = 0; b < paramVector.size(); b++) {
      SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramVector.elementAt(b);
      if (signatureAndHashAlgorithm.equals(paramSignatureAndHashAlgorithm))
        return true; 
    } 
    return false;
  }
  
  public static boolean containsAnySignatureAlgorithm(Vector<SignatureAndHashAlgorithm> paramVector, short paramShort) {
    for (byte b = 0; b < paramVector.size(); b++) {
      SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramVector.elementAt(b);
      if (signatureAndHashAlgorithm.getSignature() == paramShort)
        return true; 
    } 
    return false;
  }
  
  public static TlsSecret PRF(SecurityParameters paramSecurityParameters, TlsSecret paramTlsSecret, String paramString, byte[] paramArrayOfbyte, int paramInt) {
    return paramTlsSecret.deriveUsingPRF(paramSecurityParameters.getPRFAlgorithm(), paramString, paramArrayOfbyte, paramInt);
  }
  
  public static TlsSecret PRF(TlsContext paramTlsContext, TlsSecret paramTlsSecret, String paramString, byte[] paramArrayOfbyte, int paramInt) {
    return PRF(paramTlsContext.getSecurityParametersHandshake(), paramTlsSecret, paramString, paramArrayOfbyte, paramInt);
  }
  
  public static byte[] clone(byte[] paramArrayOfbyte) {
    return (null == paramArrayOfbyte) ? (byte[])null : ((paramArrayOfbyte.length == 0) ? EMPTY_BYTES : (byte[])paramArrayOfbyte.clone());
  }
  
  public static String[] clone(String[] paramArrayOfString) {
    return (null == paramArrayOfString) ? (String[])null : ((paramArrayOfString.length < 1) ? EMPTY_STRINGS : (String[])paramArrayOfString.clone());
  }
  
  public static boolean constantTimeAreEqual(int paramInt1, byte[] paramArrayOfbyte1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) {
    int i = 0;
    for (byte b = 0; b < paramInt1; b++)
      i |= paramArrayOfbyte1[paramInt2 + b] ^ paramArrayOfbyte2[paramInt3 + b]; 
    return (0 == i);
  }
  
  public static byte[] copyOfRangeExact(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramInt2 - paramInt1;
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  static byte[] concat(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte = new byte[paramArrayOfbyte1.length + paramArrayOfbyte2.length];
    System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte, 0, paramArrayOfbyte1.length);
    System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte, paramArrayOfbyte1.length, paramArrayOfbyte2.length);
    return arrayOfByte;
  }
  
  static byte[] calculateEndPointHash(TlsContext paramTlsContext, TlsCertificate paramTlsCertificate, byte[] paramArrayOfbyte) throws IOException {
    return calculateEndPointHash(paramTlsContext, paramTlsCertificate, paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  static byte[] calculateEndPointHash(TlsContext paramTlsContext, TlsCertificate paramTlsCertificate, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    short s = 0;
    String str = paramTlsCertificate.getSigAlgOID();
    if (str != null)
      if (PKCSObjectIdentifiers.id_RSASSA_PSS.getId().equals(str)) {
        RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(paramTlsCertificate.getSigAlgParams());
        if (null != rSASSAPSSparams) {
          ASN1ObjectIdentifier aSN1ObjectIdentifier = rSASSAPSSparams.getHashAlgorithm().getAlgorithm();
          if (NISTObjectIdentifiers.id_sha256.equals((ASN1Primitive)aSN1ObjectIdentifier)) {
            s = 4;
          } else if (NISTObjectIdentifiers.id_sha384.equals((ASN1Primitive)aSN1ObjectIdentifier)) {
            s = 5;
          } else if (NISTObjectIdentifiers.id_sha512.equals((ASN1Primitive)aSN1ObjectIdentifier)) {
            s = 6;
          } 
        } 
      } else {
        SignatureAndHashAlgorithm signatureAndHashAlgorithm = (SignatureAndHashAlgorithm)CERT_SIG_ALG_OIDS.get(str);
        if (signatureAndHashAlgorithm != null)
          s = signatureAndHashAlgorithm.getHash(); 
      }  
    switch (s) {
      case 8:
        s = 0;
        break;
      case 1:
      case 2:
        s = 4;
        break;
    } 
    if (0 != s) {
      TlsHash tlsHash = createHash(paramTlsContext.getCrypto(), s);
      if (tlsHash != null) {
        tlsHash.update(paramArrayOfbyte, paramInt1, paramInt2);
        return tlsHash.calculateHash();
      } 
    } 
    return EMPTY_BYTES;
  }
  
  public static byte[] calculateExporterSeed(SecurityParameters paramSecurityParameters, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = paramSecurityParameters.getClientRandom();
    byte[] arrayOfByte2 = paramSecurityParameters.getServerRandom();
    if (null == paramArrayOfbyte)
      return Arrays.concatenate(arrayOfByte1, arrayOfByte2); 
    if (!isValidUint16(paramArrayOfbyte.length))
      throw new IllegalArgumentException("'context' must have length less than 2^16 (or be null)"); 
    byte[] arrayOfByte3 = new byte[2];
    writeUint16(paramArrayOfbyte.length, arrayOfByte3, 0);
    return Arrays.concatenate(arrayOfByte1, arrayOfByte2, arrayOfByte3, paramArrayOfbyte);
  }
  
  private static byte[] calculateFinishedHMAC(SecurityParameters paramSecurityParameters, TlsSecret paramTlsSecret, byte[] paramArrayOfbyte) throws IOException {
    int i = paramSecurityParameters.getPRFCryptoHashAlgorithm();
    int j = paramSecurityParameters.getPRFHashLength();
    return calculateFinishedHMAC(i, j, paramTlsSecret, paramArrayOfbyte);
  }
  
  private static byte[] calculateFinishedHMAC(int paramInt1, int paramInt2, TlsSecret paramTlsSecret, byte[] paramArrayOfbyte) throws IOException {
    TlsSecret tlsSecret = TlsCryptoUtils.hkdfExpandLabel(paramTlsSecret, paramInt1, "finished", EMPTY_BYTES, paramInt2);
    try {
      return tlsSecret.calculateHMAC(paramInt1, paramArrayOfbyte, 0, paramArrayOfbyte.length);
    } finally {
      tlsSecret.destroy();
    } 
  }
  
  static TlsSecret calculateMasterSecret(TlsContext paramTlsContext, TlsSecret paramTlsSecret) {
    String str;
    byte[] arrayOfByte;
    SecurityParameters securityParameters = paramTlsContext.getSecurityParametersHandshake();
    if (securityParameters.isExtendedMasterSecret()) {
      str = "extended master secret";
      arrayOfByte = securityParameters.getSessionHash();
    } else {
      str = "master secret";
      arrayOfByte = concat(securityParameters.getClientRandom(), securityParameters.getServerRandom());
    } 
    return PRF(securityParameters, paramTlsSecret, str, arrayOfByte, 48);
  }
  
  static byte[] calculatePSKBinder(TlsCrypto paramTlsCrypto, boolean paramBoolean, int paramInt, TlsSecret paramTlsSecret, byte[] paramArrayOfbyte) throws IOException {
    int i = TlsCryptoUtils.getHashOutputSize(paramInt);
    String str = paramBoolean ? "ext binder" : "res binder";
    byte[] arrayOfByte = paramTlsCrypto.createHash(paramInt).calculateHash();
    TlsSecret tlsSecret = deriveSecret(paramInt, i, paramTlsSecret, str, arrayOfByte);
    try {
      return calculateFinishedHMAC(paramInt, i, tlsSecret, paramArrayOfbyte);
    } finally {
      tlsSecret.destroy();
    } 
  }
  
  static byte[] calculateVerifyData(TlsContext paramTlsContext, TlsHandshakeHash paramTlsHandshakeHash, boolean paramBoolean) throws IOException {
    SecurityParameters securityParameters = paramTlsContext.getSecurityParametersHandshake();
    ProtocolVersion protocolVersion = securityParameters.getNegotiatedVersion();
    if (isTLSv13(protocolVersion)) {
      TlsSecret tlsSecret1 = paramBoolean ? securityParameters.getBaseKeyServer() : securityParameters.getBaseKeyClient();
      byte[] arrayOfByte1 = getCurrentPRFHash(paramTlsHandshakeHash);
      return calculateFinishedHMAC(securityParameters, tlsSecret1, arrayOfByte1);
    } 
    if (protocolVersion.isSSL())
      return SSL3Utils.calculateVerifyData(paramTlsHandshakeHash, paramBoolean); 
    String str = paramBoolean ? "server finished" : "client finished";
    byte[] arrayOfByte = getCurrentPRFHash(paramTlsHandshakeHash);
    TlsSecret tlsSecret = securityParameters.getMasterSecret();
    int i = securityParameters.getVerifyDataLength();
    return PRF(securityParameters, tlsSecret, str, arrayOfByte, i).extract();
  }
  
  static void establish13PhaseSecrets(TlsContext paramTlsContext, TlsSecret paramTlsSecret1, TlsSecret paramTlsSecret2) throws IOException {
    TlsCrypto tlsCrypto = paramTlsContext.getCrypto();
    SecurityParameters securityParameters = paramTlsContext.getSecurityParametersHandshake();
    int i = securityParameters.getPRFCryptoHashAlgorithm();
    TlsSecret tlsSecret1 = tlsCrypto.hkdfInit(i);
    byte[] arrayOfByte = tlsCrypto.createHash(i).calculateHash();
    TlsSecret tlsSecret2 = paramTlsSecret1;
    if (null == tlsSecret2)
      tlsSecret2 = tlsCrypto.hkdfInit(i).hkdfExtract(i, tlsSecret1); 
    if (null == paramTlsSecret2)
      paramTlsSecret2 = tlsSecret1; 
    TlsSecret tlsSecret3 = deriveSecret(securityParameters, tlsSecret2, "derived", arrayOfByte).hkdfExtract(i, paramTlsSecret2);
    if (paramTlsSecret2 != tlsSecret1)
      paramTlsSecret2.destroy(); 
    TlsSecret tlsSecret4 = deriveSecret(securityParameters, tlsSecret3, "derived", arrayOfByte).hkdfExtract(i, tlsSecret1);
    securityParameters.earlySecret = tlsSecret2;
    securityParameters.handshakeSecret = tlsSecret3;
    securityParameters.masterSecret = tlsSecret4;
  }
  
  private static void establish13TrafficSecrets(TlsContext paramTlsContext, byte[] paramArrayOfbyte, TlsSecret paramTlsSecret, String paramString1, String paramString2, RecordStream paramRecordStream) throws IOException {
    SecurityParameters securityParameters = paramTlsContext.getSecurityParametersHandshake();
    securityParameters.trafficSecretClient = deriveSecret(securityParameters, paramTlsSecret, paramString1, paramArrayOfbyte);
    if (null != paramString2)
      securityParameters.trafficSecretServer = deriveSecret(securityParameters, paramTlsSecret, paramString2, paramArrayOfbyte); 
    paramRecordStream.setPendingCipher(initCipher(paramTlsContext));
  }
  
  static void establish13PhaseApplication(TlsContext paramTlsContext, byte[] paramArrayOfbyte, RecordStream paramRecordStream) throws IOException {
    SecurityParameters securityParameters = paramTlsContext.getSecurityParametersHandshake();
    TlsSecret tlsSecret = securityParameters.getMasterSecret();
    establish13TrafficSecrets(paramTlsContext, paramArrayOfbyte, tlsSecret, "c ap traffic", "s ap traffic", paramRecordStream);
    securityParameters.exporterMasterSecret = deriveSecret(securityParameters, tlsSecret, "exp master", paramArrayOfbyte);
  }
  
  static void establish13PhaseEarly(TlsContext paramTlsContext, byte[] paramArrayOfbyte, RecordStream paramRecordStream) throws IOException {
    SecurityParameters securityParameters = paramTlsContext.getSecurityParametersHandshake();
    TlsSecret tlsSecret = securityParameters.getEarlySecret();
    if (null != paramRecordStream)
      establish13TrafficSecrets(paramTlsContext, paramArrayOfbyte, tlsSecret, "c e traffic", null, paramRecordStream); 
    securityParameters.earlyExporterMasterSecret = deriveSecret(securityParameters, tlsSecret, "e exp master", paramArrayOfbyte);
  }
  
  static void establish13PhaseHandshake(TlsContext paramTlsContext, byte[] paramArrayOfbyte, RecordStream paramRecordStream) throws IOException {
    SecurityParameters securityParameters = paramTlsContext.getSecurityParametersHandshake();
    TlsSecret tlsSecret = securityParameters.getHandshakeSecret();
    establish13TrafficSecrets(paramTlsContext, paramArrayOfbyte, tlsSecret, "c hs traffic", "s hs traffic", paramRecordStream);
    securityParameters.baseKeyClient = securityParameters.getTrafficSecretClient();
    securityParameters.baseKeyServer = securityParameters.getTrafficSecretServer();
  }
  
  static void update13TrafficSecretLocal(TlsContext paramTlsContext) throws IOException {
    update13TrafficSecret(paramTlsContext, paramTlsContext.isServer());
  }
  
  static void update13TrafficSecretPeer(TlsContext paramTlsContext) throws IOException {
    update13TrafficSecret(paramTlsContext, !paramTlsContext.isServer());
  }
  
  private static void update13TrafficSecret(TlsContext paramTlsContext, boolean paramBoolean) throws IOException {
    TlsSecret tlsSecret;
    SecurityParameters securityParameters = paramTlsContext.getSecurityParametersConnection();
    if (paramBoolean) {
      tlsSecret = securityParameters.getTrafficSecretServer();
      securityParameters.trafficSecretServer = update13TrafficSecret(securityParameters, tlsSecret);
    } else {
      tlsSecret = securityParameters.getTrafficSecretClient();
      securityParameters.trafficSecretClient = update13TrafficSecret(securityParameters, tlsSecret);
    } 
    if (null != tlsSecret)
      tlsSecret.destroy(); 
  }
  
  private static TlsSecret update13TrafficSecret(SecurityParameters paramSecurityParameters, TlsSecret paramTlsSecret) throws IOException {
    return TlsCryptoUtils.hkdfExpandLabel(paramTlsSecret, paramSecurityParameters.getPRFCryptoHashAlgorithm(), "traffic upd", EMPTY_BYTES, paramSecurityParameters.getPRFHashLength());
  }
  
  public static ASN1ObjectIdentifier getOIDForHashAlgorithm(short paramShort) {
    switch (paramShort) {
      case 1:
        return PKCSObjectIdentifiers.md5;
      case 2:
        return X509ObjectIdentifiers.id_SHA1;
      case 3:
        return NISTObjectIdentifiers.id_sha224;
      case 4:
        return NISTObjectIdentifiers.id_sha256;
      case 5:
        return NISTObjectIdentifiers.id_sha384;
      case 6:
        return NISTObjectIdentifiers.id_sha512;
    } 
    throw new IllegalArgumentException("invalid HashAlgorithm: " + HashAlgorithm.getText(paramShort));
  }
  
  static int getPRFAlgorithm(SecurityParameters paramSecurityParameters, int paramInt) throws IOException {
    ProtocolVersion protocolVersion = paramSecurityParameters.getNegotiatedVersion();
    boolean bool1 = isTLSv13(protocolVersion);
    boolean bool = (!bool1 && isTLSv12(protocolVersion)) ? true : false;
    boolean bool2 = protocolVersion.isSSL();
    switch (paramInt) {
      case 4865:
      case 4867:
      case 4868:
      case 4869:
        if (bool1)
          return 4; 
        throw new TlsFatalAlert((short)47);
      case 4866:
        if (bool1)
          return 5; 
        throw new TlsFatalAlert((short)47);
      case 198:
      case 199:
        if (bool1)
          return 7; 
        throw new TlsFatalAlert((short)47);
      case 59:
      case 60:
      case 61:
      case 62:
      case 63:
      case 64:
      case 103:
      case 104:
      case 105:
      case 106:
      case 107:
      case 108:
      case 109:
      case 156:
      case 158:
      case 160:
      case 162:
      case 164:
      case 166:
      case 168:
      case 170:
      case 172:
      case 186:
      case 187:
      case 188:
      case 189:
      case 190:
      case 191:
      case 192:
      case 193:
      case 194:
      case 195:
      case 196:
      case 197:
      case 49187:
      case 49189:
      case 49191:
      case 49193:
      case 49195:
      case 49197:
      case 49199:
      case 49201:
      case 49212:
      case 49214:
      case 49216:
      case 49218:
      case 49220:
      case 49222:
      case 49224:
      case 49226:
      case 49228:
      case 49230:
      case 49232:
      case 49234:
      case 49236:
      case 49238:
      case 49240:
      case 49242:
      case 49244:
      case 49246:
      case 49248:
      case 49250:
      case 49252:
      case 49254:
      case 49256:
      case 49258:
      case 49260:
      case 49262:
      case 49264:
      case 49266:
      case 49268:
      case 49270:
      case 49272:
      case 49274:
      case 49276:
      case 49278:
      case 49280:
      case 49282:
      case 49284:
      case 49286:
      case 49288:
      case 49290:
      case 49292:
      case 49294:
      case 49296:
      case 49298:
      case 49308:
      case 49309:
      case 49310:
      case 49311:
      case 49312:
      case 49313:
      case 49314:
      case 49315:
      case 49316:
      case 49317:
      case 49318:
      case 49319:
      case 49320:
      case 49321:
      case 49322:
      case 49323:
      case 49324:
      case 49325:
      case 49326:
      case 49327:
      case 52392:
      case 52393:
      case 52394:
      case 52395:
      case 52396:
      case 52397:
      case 52398:
      case 53249:
      case 53251:
      case 53253:
        if (bool)
          return 2; 
        throw new TlsFatalAlert((short)47);
      case 157:
      case 159:
      case 161:
      case 163:
      case 165:
      case 167:
      case 169:
      case 171:
      case 173:
      case 49188:
      case 49190:
      case 49192:
      case 49194:
      case 49196:
      case 49198:
      case 49200:
      case 49202:
      case 49213:
      case 49215:
      case 49217:
      case 49219:
      case 49221:
      case 49223:
      case 49225:
      case 49227:
      case 49229:
      case 49231:
      case 49233:
      case 49235:
      case 49237:
      case 49239:
      case 49241:
      case 49243:
      case 49245:
      case 49247:
      case 49249:
      case 49251:
      case 49253:
      case 49255:
      case 49257:
      case 49259:
      case 49261:
      case 49263:
      case 49265:
      case 49267:
      case 49269:
      case 49271:
      case 49273:
      case 49275:
      case 49277:
      case 49279:
      case 49281:
      case 49283:
      case 49285:
      case 49287:
      case 49289:
      case 49291:
      case 49293:
      case 49295:
      case 49297:
      case 49299:
      case 53250:
        if (bool)
          return 3; 
        throw new TlsFatalAlert((short)47);
      case 175:
      case 177:
      case 179:
      case 181:
      case 183:
      case 185:
      case 49208:
      case 49211:
      case 49301:
      case 49303:
      case 49305:
      case 49307:
        if (bool1)
          throw new TlsFatalAlert((short)47); 
        return bool ? 3 : (bool2 ? 0 : 1);
    } 
    if (bool1)
      throw new TlsFatalAlert((short)47); 
    return bool ? 2 : (bool2 ? 0 : 1);
  }
  
  static int getPRFAlgorithm13(int paramInt) {
    switch (paramInt) {
      case 4865:
      case 4867:
      case 4868:
      case 4869:
        return 4;
      case 4866:
        return 5;
      case 198:
      case 199:
        return 7;
    } 
    return -1;
  }
  
  static int[] getPRFAlgorithms13(int[] paramArrayOfint) {
    int[] arrayOfInt = new int[Math.min(3, paramArrayOfint.length)];
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramArrayOfint.length; b2++) {
      int i = getPRFAlgorithm13(paramArrayOfint[b2]);
      if (i >= 0 && !Arrays.contains(arrayOfInt, i))
        arrayOfInt[b1++] = i; 
    } 
    return truncate(arrayOfInt, b1);
  }
  
  static byte[] calculateSignatureHash(TlsContext paramTlsContext, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, byte[] paramArrayOfbyte, DigestInputBuffer paramDigestInputBuffer) {
    TlsCrypto tlsCrypto = paramTlsContext.getCrypto();
    TlsHash tlsHash = (TlsHash)((paramSignatureAndHashAlgorithm == null) ? new CombinedHash(tlsCrypto) : createHash(tlsCrypto, paramSignatureAndHashAlgorithm));
    SecurityParameters securityParameters = paramTlsContext.getSecurityParametersHandshake();
    byte[] arrayOfByte = Arrays.concatenate(securityParameters.getClientRandom(), securityParameters.getServerRandom());
    tlsHash.update(arrayOfByte, 0, arrayOfByte.length);
    if (null != paramArrayOfbyte)
      tlsHash.update(paramArrayOfbyte, 0, paramArrayOfbyte.length); 
    paramDigestInputBuffer.updateDigest(tlsHash);
    return tlsHash.calculateHash();
  }
  
  static void sendSignatureInput(TlsContext paramTlsContext, byte[] paramArrayOfbyte, DigestInputBuffer paramDigestInputBuffer, OutputStream paramOutputStream) throws IOException {
    SecurityParameters securityParameters = paramTlsContext.getSecurityParametersHandshake();
    byte[] arrayOfByte = Arrays.concatenate(securityParameters.getClientRandom(), securityParameters.getServerRandom());
    paramOutputStream.write(arrayOfByte);
    if (null != paramArrayOfbyte)
      paramOutputStream.write(paramArrayOfbyte); 
    paramDigestInputBuffer.copyInputTo(paramOutputStream);
    paramOutputStream.close();
  }
  
  static DigitallySigned generateCertificateVerifyClient(TlsClientContext paramTlsClientContext, TlsCredentialedSigner paramTlsCredentialedSigner, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, TlsStreamSigner paramTlsStreamSigner, TlsHandshakeHash paramTlsHandshakeHash) throws IOException {
    byte[] arrayOfByte;
    SecurityParameters securityParameters = paramTlsClientContext.getSecurityParametersHandshake();
    if (isTLSv13(securityParameters.getNegotiatedVersion()))
      throw new TlsFatalAlert((short)80); 
    if (paramTlsStreamSigner != null) {
      paramTlsHandshakeHash.copyBufferTo(paramTlsStreamSigner.getOutputStream());
      arrayOfByte = paramTlsStreamSigner.getSignature();
    } else {
      byte[] arrayOfByte1;
      if (paramSignatureAndHashAlgorithm == null) {
        arrayOfByte1 = securityParameters.getSessionHash();
      } else {
        arrayOfByte1 = paramTlsHandshakeHash.getFinalHash(SignatureScheme.getCryptoHashAlgorithm(paramSignatureAndHashAlgorithm));
      } 
      arrayOfByte = paramTlsCredentialedSigner.generateRawSignature(arrayOfByte1);
    } 
    return new DigitallySigned(paramSignatureAndHashAlgorithm, arrayOfByte);
  }
  
  static DigitallySigned generate13CertificateVerify(TlsContext paramTlsContext, TlsCredentialedSigner paramTlsCredentialedSigner, TlsHandshakeHash paramTlsHandshakeHash) throws IOException {
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramTlsCredentialedSigner.getSignatureAndHashAlgorithm();
    if (null == signatureAndHashAlgorithm)
      throw new TlsFatalAlert((short)80); 
    String str = paramTlsContext.isServer() ? "TLS 1.3, server CertificateVerify" : "TLS 1.3, client CertificateVerify";
    byte[] arrayOfByte = generate13CertificateVerify(paramTlsContext.getCrypto(), paramTlsCredentialedSigner, str, paramTlsHandshakeHash, signatureAndHashAlgorithm);
    return new DigitallySigned(signatureAndHashAlgorithm, arrayOfByte);
  }
  
  private static byte[] generate13CertificateVerify(TlsCrypto paramTlsCrypto, TlsCredentialedSigner paramTlsCredentialedSigner, String paramString, TlsHandshakeHash paramTlsHandshakeHash, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) throws IOException {
    TlsStreamSigner tlsStreamSigner = paramTlsCredentialedSigner.getStreamSigner();
    byte[] arrayOfByte1 = getCertificateVerifyHeader(paramString);
    byte[] arrayOfByte2 = getCurrentPRFHash(paramTlsHandshakeHash);
    if (null != tlsStreamSigner) {
      OutputStream outputStream = tlsStreamSigner.getOutputStream();
      outputStream.write(arrayOfByte1, 0, arrayOfByte1.length);
      outputStream.write(arrayOfByte2, 0, arrayOfByte2.length);
      return tlsStreamSigner.getSignature();
    } 
    TlsHash tlsHash = createHash(paramTlsCrypto, paramSignatureAndHashAlgorithm);
    tlsHash.update(arrayOfByte1, 0, arrayOfByte1.length);
    tlsHash.update(arrayOfByte2, 0, arrayOfByte2.length);
    byte[] arrayOfByte3 = tlsHash.calculateHash();
    return paramTlsCredentialedSigner.generateRawSignature(arrayOfByte3);
  }
  
  static void verifyCertificateVerifyClient(TlsServerContext paramTlsServerContext, CertificateRequest paramCertificateRequest, DigitallySigned paramDigitallySigned, TlsHandshakeHash paramTlsHandshakeHash) throws IOException {
    short s;
    boolean bool;
    SecurityParameters securityParameters = paramTlsServerContext.getSecurityParametersHandshake();
    Certificate certificate = securityParameters.getPeerCertificate();
    TlsCertificate tlsCertificate = certificate.getCertificateAt(0);
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramDigitallySigned.getAlgorithm();
    if (null == signatureAndHashAlgorithm) {
      s = tlsCertificate.getLegacySignatureAlgorithm();
      checkClientCertificateType(paramCertificateRequest, getLegacyClientCertType(s), (short)43);
    } else {
      verifySupportedSignatureAlgorithm(securityParameters.getServerSigAlgs(), signatureAndHashAlgorithm);
      s = signatureAndHashAlgorithm.getSignature();
      checkClientCertificateType(paramCertificateRequest, SignatureAlgorithm.getClientCertificateType(s), (short)47);
    } 
    try {
      TlsVerifier tlsVerifier = tlsCertificate.createVerifier(s);
      TlsStreamVerifier tlsStreamVerifier = tlsVerifier.getStreamVerifier(paramDigitallySigned);
      if (tlsStreamVerifier != null) {
        paramTlsHandshakeHash.copyBufferTo(tlsStreamVerifier.getOutputStream());
        bool = tlsStreamVerifier.isVerified();
      } else {
        byte[] arrayOfByte;
        if (isTLSv12((TlsContext)paramTlsServerContext)) {
          arrayOfByte = paramTlsHandshakeHash.getFinalHash(SignatureScheme.getCryptoHashAlgorithm(signatureAndHashAlgorithm));
        } else {
          arrayOfByte = securityParameters.getSessionHash();
        } 
        bool = tlsVerifier.verifyRawSignature(paramDigitallySigned, arrayOfByte);
      } 
    } catch (TlsFatalAlert tlsFatalAlert) {
      throw tlsFatalAlert;
    } catch (Exception exception) {
      throw new TlsFatalAlert((short)51, exception);
    } 
    if (!bool)
      throw new TlsFatalAlert((short)51); 
  }
  
  static void verify13CertificateVerifyClient(TlsServerContext paramTlsServerContext, TlsHandshakeHash paramTlsHandshakeHash, CertificateVerify paramCertificateVerify) throws IOException {
    SecurityParameters securityParameters = paramTlsServerContext.getSecurityParametersHandshake();
    Vector vector = securityParameters.getServerSigAlgs();
    TlsCertificate tlsCertificate = securityParameters.getPeerCertificate().getCertificateAt(0);
    verify13CertificateVerify(vector, "TLS 1.3, client CertificateVerify", paramTlsHandshakeHash, tlsCertificate, paramCertificateVerify);
  }
  
  static void verify13CertificateVerifyServer(TlsClientContext paramTlsClientContext, TlsHandshakeHash paramTlsHandshakeHash, CertificateVerify paramCertificateVerify) throws IOException {
    SecurityParameters securityParameters = paramTlsClientContext.getSecurityParametersHandshake();
    Vector vector = securityParameters.getClientSigAlgs();
    TlsCertificate tlsCertificate = securityParameters.getPeerCertificate().getCertificateAt(0);
    verify13CertificateVerify(vector, "TLS 1.3, server CertificateVerify", paramTlsHandshakeHash, tlsCertificate, paramCertificateVerify);
  }
  
  private static void verify13CertificateVerify(Vector paramVector, String paramString, TlsHandshakeHash paramTlsHandshakeHash, TlsCertificate paramTlsCertificate, CertificateVerify paramCertificateVerify) throws IOException {
    boolean bool;
    try {
      int i = paramCertificateVerify.getAlgorithm();
      SignatureAndHashAlgorithm signatureAndHashAlgorithm = SignatureScheme.getSignatureAndHashAlgorithm(i);
      verifySupportedSignatureAlgorithm(paramVector, signatureAndHashAlgorithm);
      Tls13Verifier tls13Verifier = paramTlsCertificate.createVerifier(i);
      byte[] arrayOfByte1 = getCertificateVerifyHeader(paramString);
      byte[] arrayOfByte2 = getCurrentPRFHash(paramTlsHandshakeHash);
      OutputStream outputStream = tls13Verifier.getOutputStream();
      outputStream.write(arrayOfByte1, 0, arrayOfByte1.length);
      outputStream.write(arrayOfByte2, 0, arrayOfByte2.length);
      bool = tls13Verifier.verifySignature(paramCertificateVerify.getSignature());
    } catch (TlsFatalAlert tlsFatalAlert) {
      throw tlsFatalAlert;
    } catch (Exception exception) {
      throw new TlsFatalAlert((short)51, exception);
    } 
    if (!bool)
      throw new TlsFatalAlert((short)51); 
  }
  
  private static byte[] getCertificateVerifyHeader(String paramString) {
    int i = paramString.length();
    byte[] arrayOfByte = new byte[64 + i + 1];
    byte b;
    for (b = 0; b < 64; b++)
      arrayOfByte[b] = 32; 
    for (b = 0; b < i; b++) {
      char c = paramString.charAt(b);
      arrayOfByte[64 + b] = (byte)c;
    } 
    arrayOfByte[64 + i] = 0;
    return arrayOfByte;
  }
  
  static void generateServerKeyExchangeSignature(TlsContext paramTlsContext, TlsCredentialedSigner paramTlsCredentialedSigner, byte[] paramArrayOfbyte, DigestInputBuffer paramDigestInputBuffer) throws IOException {
    byte[] arrayOfByte;
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = getSignatureAndHashAlgorithm(paramTlsContext.getServerVersion(), paramTlsCredentialedSigner);
    TlsStreamSigner tlsStreamSigner = paramTlsCredentialedSigner.getStreamSigner();
    if (tlsStreamSigner != null) {
      sendSignatureInput(paramTlsContext, paramArrayOfbyte, paramDigestInputBuffer, tlsStreamSigner.getOutputStream());
      arrayOfByte = tlsStreamSigner.getSignature();
    } else {
      byte[] arrayOfByte1 = calculateSignatureHash(paramTlsContext, signatureAndHashAlgorithm, paramArrayOfbyte, paramDigestInputBuffer);
      arrayOfByte = paramTlsCredentialedSigner.generateRawSignature(arrayOfByte1);
    } 
    DigitallySigned digitallySigned = new DigitallySigned(signatureAndHashAlgorithm, arrayOfByte);
    digitallySigned.encode((OutputStream)paramDigestInputBuffer);
  }
  
  static void verifyServerKeyExchangeSignature(TlsContext paramTlsContext, InputStream paramInputStream, TlsCertificate paramTlsCertificate, byte[] paramArrayOfbyte, DigestInputBuffer paramDigestInputBuffer) throws IOException {
    short s;
    boolean bool;
    DigitallySigned digitallySigned = DigitallySigned.parse(paramTlsContext, paramInputStream);
    SecurityParameters securityParameters = paramTlsContext.getSecurityParametersHandshake();
    int i = securityParameters.getKeyExchangeAlgorithm();
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = digitallySigned.getAlgorithm();
    if (signatureAndHashAlgorithm == null) {
      s = getLegacySignatureAlgorithmServer(i);
    } else {
      s = signatureAndHashAlgorithm.getSignature();
      if (!isValidSignatureAlgorithmForServerKeyExchange(s, i))
        throw new TlsFatalAlert((short)47); 
      verifySupportedSignatureAlgorithm(securityParameters.getClientSigAlgs(), signatureAndHashAlgorithm);
    } 
    TlsVerifier tlsVerifier = paramTlsCertificate.createVerifier(s);
    TlsStreamVerifier tlsStreamVerifier = tlsVerifier.getStreamVerifier(digitallySigned);
    if (tlsStreamVerifier != null) {
      sendSignatureInput(paramTlsContext, paramArrayOfbyte, paramDigestInputBuffer, tlsStreamVerifier.getOutputStream());
      bool = tlsStreamVerifier.isVerified();
    } else {
      byte[] arrayOfByte = calculateSignatureHash(paramTlsContext, signatureAndHashAlgorithm, paramArrayOfbyte, paramDigestInputBuffer);
      bool = tlsVerifier.verifyRawSignature(digitallySigned, arrayOfByte);
    } 
    if (!bool)
      throw new TlsFatalAlert((short)51); 
  }
  
  static void trackHashAlgorithmClient(TlsHandshakeHash paramTlsHandshakeHash, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    int i = SignatureScheme.getCryptoHashAlgorithm(paramSignatureAndHashAlgorithm);
    if (i >= 0)
      paramTlsHandshakeHash.trackHashAlgorithm(i); 
  }
  
  static void trackHashAlgorithms(TlsHandshakeHash paramTlsHandshakeHash, Vector<SignatureAndHashAlgorithm> paramVector) {
    for (byte b = 0; b < paramVector.size(); b++) {
      SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramVector.elementAt(b);
      int i = SignatureScheme.getCryptoHashAlgorithm(signatureAndHashAlgorithm);
      if (i >= 0) {
        paramTlsHandshakeHash.trackHashAlgorithm(i);
      } else if (8 == signatureAndHashAlgorithm.getHash()) {
        paramTlsHandshakeHash.forceBuffering();
      } 
    } 
  }
  
  public static boolean hasSigningCapability(short paramShort) {
    switch (paramShort) {
      case 1:
      case 2:
      case 64:
        return true;
    } 
    return false;
  }
  
  public static Vector vectorOfOne(Object paramObject) {
    Vector<Object> vector = new Vector(1);
    vector.addElement(paramObject);
    return vector;
  }
  
  public static int getCipherType(int paramInt) {
    int i = getEncryptionAlgorithm(paramInt);
    return getEncryptionAlgorithmType(i);
  }
  
  public static int getEncryptionAlgorithm(int paramInt) {
    switch (paramInt) {
      case 10:
      case 13:
      case 16:
      case 19:
      case 22:
      case 27:
      case 139:
      case 143:
      case 147:
      case 49155:
      case 49160:
      case 49165:
      case 49170:
      case 49175:
      case 49178:
      case 49179:
      case 49180:
      case 49204:
        return 7;
      case 47:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 60:
      case 62:
      case 63:
      case 64:
      case 103:
      case 108:
      case 140:
      case 144:
      case 148:
      case 174:
      case 178:
      case 182:
      case 49156:
      case 49161:
      case 49166:
      case 49171:
      case 49176:
      case 49181:
      case 49182:
      case 49183:
      case 49187:
      case 49189:
      case 49191:
      case 49193:
      case 49205:
      case 49207:
        return 8;
      case 4868:
      case 49308:
      case 49310:
      case 49316:
      case 49318:
      case 49324:
      case 53253:
        return 15;
      case 4869:
      case 49312:
      case 49314:
      case 49320:
      case 49322:
      case 49326:
      case 53251:
        return 16;
      case 156:
      case 158:
      case 160:
      case 162:
      case 164:
      case 166:
      case 168:
      case 170:
      case 172:
      case 4865:
      case 49195:
      case 49197:
      case 49199:
      case 49201:
      case 53249:
        return 10;
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
      case 61:
      case 104:
      case 105:
      case 106:
      case 107:
      case 109:
      case 141:
      case 145:
      case 149:
      case 175:
      case 179:
      case 183:
      case 49157:
      case 49162:
      case 49167:
      case 49172:
      case 49177:
      case 49184:
      case 49185:
      case 49186:
      case 49188:
      case 49190:
      case 49192:
      case 49194:
      case 49206:
      case 49208:
        return 9;
      case 49309:
      case 49311:
      case 49317:
      case 49319:
      case 49325:
        return 17;
      case 49313:
      case 49315:
      case 49321:
      case 49323:
      case 49327:
        return 18;
      case 157:
      case 159:
      case 161:
      case 163:
      case 165:
      case 167:
      case 169:
      case 171:
      case 173:
      case 4866:
      case 49196:
      case 49198:
      case 49200:
      case 49202:
      case 53250:
        return 11;
      case 49212:
      case 49214:
      case 49216:
      case 49218:
      case 49220:
      case 49222:
      case 49224:
      case 49226:
      case 49228:
      case 49230:
      case 49252:
      case 49254:
      case 49256:
      case 49264:
        return 22;
      case 49232:
      case 49234:
      case 49236:
      case 49238:
      case 49240:
      case 49242:
      case 49244:
      case 49246:
      case 49248:
      case 49250:
      case 49258:
      case 49260:
      case 49262:
        return 24;
      case 49213:
      case 49215:
      case 49217:
      case 49219:
      case 49221:
      case 49223:
      case 49225:
      case 49227:
      case 49229:
      case 49231:
      case 49253:
      case 49255:
      case 49257:
      case 49265:
        return 23;
      case 49233:
      case 49235:
      case 49237:
      case 49239:
      case 49241:
      case 49243:
      case 49245:
      case 49247:
      case 49249:
      case 49251:
      case 49259:
      case 49261:
      case 49263:
        return 25;
      case 65:
      case 66:
      case 67:
      case 68:
      case 69:
      case 70:
      case 186:
      case 187:
      case 188:
      case 189:
      case 190:
      case 191:
      case 49266:
      case 49268:
      case 49270:
      case 49272:
      case 49300:
      case 49302:
      case 49304:
      case 49306:
        return 12;
      case 49274:
      case 49276:
      case 49278:
      case 49280:
      case 49282:
      case 49284:
      case 49286:
      case 49288:
      case 49290:
      case 49292:
      case 49294:
      case 49296:
      case 49298:
        return 19;
      case 132:
      case 133:
      case 134:
      case 135:
      case 136:
      case 137:
      case 192:
      case 193:
      case 194:
      case 195:
      case 196:
      case 197:
      case 49267:
      case 49269:
      case 49271:
      case 49273:
      case 49301:
      case 49303:
      case 49305:
      case 49307:
        return 13;
      case 49275:
      case 49277:
      case 49279:
      case 49281:
      case 49283:
      case 49285:
      case 49287:
      case 49289:
      case 49291:
      case 49293:
      case 49295:
      case 49297:
      case 49299:
        return 20;
      case 4867:
      case 52392:
      case 52393:
      case 52394:
      case 52395:
      case 52396:
      case 52397:
      case 52398:
        return 21;
      case 2:
      case 44:
      case 45:
      case 46:
      case 49153:
      case 49158:
      case 49163:
      case 49168:
      case 49173:
      case 49209:
        return 0;
      case 59:
      case 176:
      case 180:
      case 184:
      case 49210:
        return 0;
      case 177:
      case 181:
      case 185:
      case 49211:
        return 0;
      case 150:
      case 151:
      case 152:
      case 153:
      case 154:
      case 155:
        return 14;
      case 199:
        return 26;
      case 198:
        return 27;
    } 
    return -1;
  }
  
  public static int getEncryptionAlgorithmType(int paramInt) {
    switch (paramInt) {
      case 10:
      case 11:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 24:
      case 25:
      case 26:
      case 27:
        return 2;
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 12:
      case 13:
      case 14:
      case 22:
      case 23:
      case 28:
        return 1;
      case 0:
      case 1:
      case 2:
        return 0;
    } 
    return -1;
  }
  
  public static int getKeyExchangeAlgorithm(int paramInt) {
    switch (paramInt) {
      case 27:
      case 52:
      case 58:
      case 70:
      case 108:
      case 109:
      case 137:
      case 155:
      case 166:
      case 167:
      case 191:
      case 197:
      case 49222:
      case 49223:
      case 49242:
      case 49243:
      case 49284:
      case 49285:
        return 11;
      case 13:
      case 48:
      case 54:
      case 62:
      case 66:
      case 104:
      case 133:
      case 151:
      case 164:
      case 165:
      case 187:
      case 193:
      case 49214:
      case 49215:
      case 49240:
      case 49241:
      case 49282:
      case 49283:
        return 7;
      case 16:
      case 49:
      case 55:
      case 63:
      case 67:
      case 105:
      case 134:
      case 152:
      case 160:
      case 161:
      case 188:
      case 194:
      case 49216:
      case 49217:
      case 49236:
      case 49237:
      case 49278:
      case 49279:
        return 9;
      case 19:
      case 50:
      case 56:
      case 64:
      case 68:
      case 106:
      case 135:
      case 153:
      case 162:
      case 163:
      case 189:
      case 195:
      case 49218:
      case 49219:
      case 49238:
      case 49239:
      case 49280:
      case 49281:
        return 3;
      case 45:
      case 143:
      case 144:
      case 145:
      case 170:
      case 171:
      case 178:
      case 179:
      case 180:
      case 181:
      case 49254:
      case 49255:
      case 49260:
      case 49261:
      case 49296:
      case 49297:
      case 49302:
      case 49303:
      case 49318:
      case 49319:
      case 49322:
      case 49323:
      case 52397:
        return 14;
      case 22:
      case 51:
      case 57:
      case 69:
      case 103:
      case 107:
      case 136:
      case 154:
      case 158:
      case 159:
      case 190:
      case 196:
      case 49220:
      case 49221:
      case 49234:
      case 49235:
      case 49276:
      case 49277:
      case 49310:
      case 49311:
      case 49314:
      case 49315:
      case 52394:
        return 5;
      case 49173:
      case 49175:
      case 49176:
      case 49177:
        return 20;
      case 49153:
      case 49155:
      case 49156:
      case 49157:
      case 49189:
      case 49190:
      case 49197:
      case 49198:
      case 49226:
      case 49227:
      case 49246:
      case 49247:
      case 49268:
      case 49269:
      case 49288:
      case 49289:
        return 16;
      case 49163:
      case 49165:
      case 49166:
      case 49167:
      case 49193:
      case 49194:
      case 49201:
      case 49202:
      case 49230:
      case 49231:
      case 49250:
      case 49251:
      case 49272:
      case 49273:
      case 49292:
      case 49293:
        return 18;
      case 49158:
      case 49160:
      case 49161:
      case 49162:
      case 49187:
      case 49188:
      case 49195:
      case 49196:
      case 49224:
      case 49225:
      case 49244:
      case 49245:
      case 49266:
      case 49267:
      case 49286:
      case 49287:
      case 49324:
      case 49325:
      case 49326:
      case 49327:
      case 52393:
        return 17;
      case 49204:
      case 49205:
      case 49206:
      case 49207:
      case 49208:
      case 49209:
      case 49210:
      case 49211:
      case 49264:
      case 49265:
      case 49306:
      case 49307:
      case 52396:
      case 53249:
      case 53250:
      case 53251:
      case 53253:
        return 24;
      case 49168:
      case 49170:
      case 49171:
      case 49172:
      case 49191:
      case 49192:
      case 49199:
      case 49200:
      case 49228:
      case 49229:
      case 49248:
      case 49249:
      case 49270:
      case 49271:
      case 49290:
      case 49291:
      case 52392:
        return 19;
      case 198:
      case 199:
      case 4865:
      case 4866:
      case 4867:
      case 4868:
      case 4869:
        return 0;
      case 44:
      case 139:
      case 140:
      case 141:
      case 168:
      case 169:
      case 174:
      case 175:
      case 176:
      case 177:
      case 49252:
      case 49253:
      case 49258:
      case 49259:
      case 49294:
      case 49295:
      case 49300:
      case 49301:
      case 49316:
      case 49317:
      case 49320:
      case 49321:
      case 52395:
        return 13;
      case 2:
      case 10:
      case 47:
      case 53:
      case 59:
      case 60:
      case 61:
      case 65:
      case 132:
      case 150:
      case 156:
      case 157:
      case 186:
      case 192:
      case 49212:
      case 49213:
      case 49232:
      case 49233:
      case 49274:
      case 49275:
      case 49308:
      case 49309:
      case 49312:
      case 49313:
        return 1;
      case 46:
      case 147:
      case 148:
      case 149:
      case 172:
      case 173:
      case 182:
      case 183:
      case 184:
      case 185:
      case 49256:
      case 49257:
      case 49262:
      case 49263:
      case 49298:
      case 49299:
      case 49304:
      case 49305:
      case 52398:
        return 15;
      case 49178:
      case 49181:
      case 49184:
        return 21;
      case 49180:
      case 49183:
      case 49186:
        return 22;
      case 49179:
      case 49182:
      case 49185:
        return 23;
    } 
    return -1;
  }
  
  public static Vector getKeyExchangeAlgorithms(int[] paramArrayOfint) {
    Vector vector = new Vector();
    if (null != paramArrayOfint) {
      for (byte b = 0; b < paramArrayOfint.length; b++)
        addToSet(vector, getKeyExchangeAlgorithm(paramArrayOfint[b])); 
      vector.removeElement(Integers.valueOf(-1));
    } 
    return vector;
  }
  
  public static int getMACAlgorithm(int paramInt) {
    switch (paramInt) {
      case 156:
      case 157:
      case 158:
      case 159:
      case 160:
      case 161:
      case 162:
      case 163:
      case 164:
      case 165:
      case 166:
      case 167:
      case 168:
      case 169:
      case 170:
      case 171:
      case 172:
      case 173:
      case 198:
      case 199:
      case 4865:
      case 4866:
      case 4867:
      case 4868:
      case 4869:
      case 49195:
      case 49196:
      case 49197:
      case 49198:
      case 49199:
      case 49200:
      case 49201:
      case 49202:
      case 49232:
      case 49233:
      case 49234:
      case 49235:
      case 49236:
      case 49237:
      case 49238:
      case 49239:
      case 49240:
      case 49241:
      case 49242:
      case 49243:
      case 49244:
      case 49245:
      case 49246:
      case 49247:
      case 49248:
      case 49249:
      case 49250:
      case 49251:
      case 49258:
      case 49259:
      case 49260:
      case 49261:
      case 49262:
      case 49263:
      case 49274:
      case 49275:
      case 49276:
      case 49277:
      case 49278:
      case 49279:
      case 49280:
      case 49281:
      case 49282:
      case 49283:
      case 49284:
      case 49285:
      case 49286:
      case 49287:
      case 49288:
      case 49289:
      case 49290:
      case 49291:
      case 49292:
      case 49293:
      case 49294:
      case 49295:
      case 49296:
      case 49297:
      case 49298:
      case 49299:
      case 49308:
      case 49309:
      case 49310:
      case 49311:
      case 49312:
      case 49313:
      case 49314:
      case 49315:
      case 49316:
      case 49317:
      case 49318:
      case 49319:
      case 49320:
      case 49321:
      case 49322:
      case 49323:
      case 49324:
      case 49325:
      case 49326:
      case 49327:
      case 52392:
      case 52393:
      case 52394:
      case 52395:
      case 52396:
      case 52397:
      case 52398:
      case 53249:
      case 53250:
      case 53251:
      case 53253:
        return 0;
      case 2:
      case 10:
      case 13:
      case 16:
      case 19:
      case 22:
      case 27:
      case 44:
      case 45:
      case 46:
      case 47:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
      case 65:
      case 66:
      case 67:
      case 68:
      case 69:
      case 70:
      case 132:
      case 133:
      case 134:
      case 135:
      case 136:
      case 137:
      case 139:
      case 140:
      case 141:
      case 143:
      case 144:
      case 145:
      case 147:
      case 148:
      case 149:
      case 150:
      case 151:
      case 152:
      case 153:
      case 154:
      case 155:
      case 49153:
      case 49155:
      case 49156:
      case 49157:
      case 49158:
      case 49160:
      case 49161:
      case 49162:
      case 49163:
      case 49165:
      case 49166:
      case 49167:
      case 49168:
      case 49170:
      case 49171:
      case 49172:
      case 49173:
      case 49175:
      case 49176:
      case 49177:
      case 49178:
      case 49179:
      case 49180:
      case 49181:
      case 49182:
      case 49183:
      case 49184:
      case 49185:
      case 49186:
      case 49204:
      case 49205:
      case 49206:
      case 49209:
        return 2;
      case 59:
      case 60:
      case 61:
      case 62:
      case 63:
      case 64:
      case 103:
      case 104:
      case 105:
      case 106:
      case 107:
      case 108:
      case 109:
      case 174:
      case 176:
      case 178:
      case 180:
      case 182:
      case 184:
      case 186:
      case 187:
      case 188:
      case 189:
      case 190:
      case 191:
      case 192:
      case 193:
      case 194:
      case 195:
      case 196:
      case 197:
      case 49187:
      case 49189:
      case 49191:
      case 49193:
      case 49207:
      case 49210:
      case 49212:
      case 49214:
      case 49216:
      case 49218:
      case 49220:
      case 49222:
      case 49224:
      case 49226:
      case 49228:
      case 49230:
      case 49252:
      case 49254:
      case 49256:
      case 49264:
      case 49266:
      case 49268:
      case 49270:
      case 49272:
      case 49300:
      case 49302:
      case 49304:
      case 49306:
        return 3;
      case 175:
      case 177:
      case 179:
      case 181:
      case 183:
      case 185:
      case 49188:
      case 49190:
      case 49192:
      case 49194:
      case 49208:
      case 49211:
      case 49213:
      case 49215:
      case 49217:
      case 49219:
      case 49221:
      case 49223:
      case 49225:
      case 49227:
      case 49229:
      case 49231:
      case 49253:
      case 49255:
      case 49257:
      case 49265:
      case 49267:
      case 49269:
      case 49271:
      case 49273:
      case 49301:
      case 49303:
      case 49305:
      case 49307:
        return 4;
    } 
    return -1;
  }
  
  public static ProtocolVersion getMinimumVersion(int paramInt) {
    switch (paramInt) {
      case 198:
      case 199:
      case 4865:
      case 4866:
      case 4867:
      case 4868:
      case 4869:
        return ProtocolVersion.TLSv13;
      case 59:
      case 60:
      case 61:
      case 62:
      case 63:
      case 64:
      case 103:
      case 104:
      case 105:
      case 106:
      case 107:
      case 108:
      case 109:
      case 156:
      case 157:
      case 158:
      case 159:
      case 160:
      case 161:
      case 162:
      case 163:
      case 164:
      case 165:
      case 166:
      case 167:
      case 168:
      case 169:
      case 170:
      case 171:
      case 172:
      case 173:
      case 186:
      case 187:
      case 188:
      case 189:
      case 190:
      case 191:
      case 192:
      case 193:
      case 194:
      case 195:
      case 196:
      case 197:
      case 49187:
      case 49188:
      case 49189:
      case 49190:
      case 49191:
      case 49192:
      case 49193:
      case 49194:
      case 49195:
      case 49196:
      case 49197:
      case 49198:
      case 49199:
      case 49200:
      case 49201:
      case 49202:
      case 49212:
      case 49213:
      case 49214:
      case 49215:
      case 49216:
      case 49217:
      case 49218:
      case 49219:
      case 49220:
      case 49221:
      case 49222:
      case 49223:
      case 49224:
      case 49225:
      case 49226:
      case 49227:
      case 49228:
      case 49229:
      case 49230:
      case 49231:
      case 49232:
      case 49233:
      case 49234:
      case 49235:
      case 49236:
      case 49237:
      case 49238:
      case 49239:
      case 49240:
      case 49241:
      case 49242:
      case 49243:
      case 49244:
      case 49245:
      case 49246:
      case 49247:
      case 49248:
      case 49249:
      case 49250:
      case 49251:
      case 49252:
      case 49253:
      case 49254:
      case 49255:
      case 49256:
      case 49257:
      case 49258:
      case 49259:
      case 49260:
      case 49261:
      case 49262:
      case 49263:
      case 49264:
      case 49265:
      case 49266:
      case 49267:
      case 49268:
      case 49269:
      case 49270:
      case 49271:
      case 49272:
      case 49273:
      case 49274:
      case 49275:
      case 49276:
      case 49277:
      case 49278:
      case 49279:
      case 49280:
      case 49281:
      case 49282:
      case 49283:
      case 49284:
      case 49285:
      case 49286:
      case 49287:
      case 49288:
      case 49289:
      case 49290:
      case 49291:
      case 49292:
      case 49293:
      case 49294:
      case 49295:
      case 49296:
      case 49297:
      case 49298:
      case 49299:
      case 49308:
      case 49309:
      case 49310:
      case 49311:
      case 49312:
      case 49313:
      case 49314:
      case 49315:
      case 49316:
      case 49317:
      case 49318:
      case 49319:
      case 49320:
      case 49321:
      case 49322:
      case 49323:
      case 49324:
      case 49325:
      case 49326:
      case 49327:
      case 52392:
      case 52393:
      case 52394:
      case 52395:
      case 52396:
      case 52397:
      case 52398:
      case 53249:
      case 53250:
      case 53251:
      case 53253:
        return ProtocolVersion.TLSv12;
    } 
    return ProtocolVersion.SSLv3;
  }
  
  public static Vector getNamedGroupRoles(int[] paramArrayOfint) {
    return getNamedGroupRoles(getKeyExchangeAlgorithms(paramArrayOfint));
  }
  
  public static Vector getNamedGroupRoles(Vector<Integer> paramVector) {
    Vector vector = new Vector();
    for (byte b = 0; b < paramVector.size(); b++) {
      int i = ((Integer)paramVector.elementAt(b)).intValue();
      switch (i) {
        case 3:
        case 5:
        case 7:
        case 9:
        case 11:
        case 14:
          addToSet(vector, 1);
          break;
        case 18:
        case 19:
        case 20:
        case 24:
          addToSet(vector, 2);
          break;
        case 16:
        case 17:
          addToSet(vector, 2);
          addToSet(vector, 3);
          break;
        case 0:
          addToSet(vector, 1);
          addToSet(vector, 2);
          addToSet(vector, 4);
          break;
      } 
    } 
    return vector;
  }
  
  public static boolean isAEADCipherSuite(int paramInt) throws IOException {
    return (2 == getCipherType(paramInt));
  }
  
  public static boolean isBlockCipherSuite(int paramInt) throws IOException {
    return (1 == getCipherType(paramInt));
  }
  
  public static boolean isStreamCipherSuite(int paramInt) throws IOException {
    return (0 == getCipherType(paramInt));
  }
  
  public static boolean isValidCipherSuiteForSignatureAlgorithms(int paramInt, Vector<Short> paramVector) {
    int i = getKeyExchangeAlgorithm(paramInt);
    switch (i) {
      case 0:
      case 3:
      case 5:
      case 17:
      case 19:
      case 22:
      case 23:
        break;
      default:
        return true;
    } 
    int j = paramVector.size();
    for (byte b = 0; b < j; b++) {
      Short short_ = paramVector.elementAt(b);
      if (null != short_) {
        short s = short_.shortValue();
        if (isValidSignatureAlgorithmForServerKeyExchange(s, i))
          return true; 
      } 
    } 
    return false;
  }
  
  public static boolean isValidCipherSuiteForVersion(int paramInt, ProtocolVersion paramProtocolVersion) {
    return isValidVersionForCipherSuite(paramInt, paramProtocolVersion);
  }
  
  static boolean isValidCipherSuiteSelection(int[] paramArrayOfint, int paramInt) {
    return (null != paramArrayOfint && Arrays.contains(paramArrayOfint, paramInt) && 0 != paramInt && !CipherSuite.isSCSV(paramInt));
  }
  
  static boolean isValidKeyShareSelection(ProtocolVersion paramProtocolVersion, int[] paramArrayOfint, Hashtable paramHashtable, int paramInt) {
    return (null != paramArrayOfint && Arrays.contains(paramArrayOfint, paramInt) && !paramHashtable.containsKey(Integers.valueOf(paramInt)) && NamedGroup.canBeNegotiated(paramInt, paramProtocolVersion));
  }
  
  static boolean isValidSignatureAlgorithmForServerKeyExchange(short paramShort, int paramInt) {
    switch (paramInt) {
      case 5:
      case 19:
      case 23:
        switch (paramShort) {
          case 1:
          case 4:
          case 5:
          case 6:
          case 9:
          case 10:
          case 11:
            return true;
        } 
        return false;
      case 3:
      case 22:
        return (2 == paramShort);
      case 17:
        switch (paramShort) {
          case 3:
          case 7:
          case 8:
            return true;
        } 
        return false;
      case 0:
        return (0 != paramShort);
    } 
    return false;
  }
  
  public static boolean isValidSignatureSchemeForServerKeyExchange(int paramInt1, int paramInt2) {
    short s = SignatureScheme.getSignatureAlgorithm(paramInt1);
    return isValidSignatureAlgorithmForServerKeyExchange(s, paramInt2);
  }
  
  public static boolean isValidVersionForCipherSuite(int paramInt, ProtocolVersion paramProtocolVersion) {
    paramProtocolVersion = paramProtocolVersion.getEquivalentTLSVersion();
    ProtocolVersion protocolVersion = getMinimumVersion(paramInt);
    return (protocolVersion == paramProtocolVersion) ? true : (!protocolVersion.isEarlierVersionOf(paramProtocolVersion) ? false : ((ProtocolVersion.TLSv13.isEqualOrEarlierVersionOf(protocolVersion) || ProtocolVersion.TLSv13.isLaterVersionOf(paramProtocolVersion))));
  }
  
  public static SignatureAndHashAlgorithm chooseSignatureAndHashAlgorithm(TlsContext paramTlsContext, Vector paramVector, short paramShort) throws IOException {
    return chooseSignatureAndHashAlgorithm(paramTlsContext.getServerVersion(), paramVector, paramShort);
  }
  
  public static SignatureAndHashAlgorithm chooseSignatureAndHashAlgorithm(ProtocolVersion paramProtocolVersion, Vector<SignatureAndHashAlgorithm> paramVector, short paramShort) throws IOException {
    if (!isTLSv12(paramProtocolVersion))
      return null; 
    if (paramVector == null)
      paramVector = getDefaultSignatureAlgorithms(paramShort); 
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = null;
    for (byte b = 0; b < paramVector.size(); b++) {
      SignatureAndHashAlgorithm signatureAndHashAlgorithm1 = paramVector.elementAt(b);
      if (signatureAndHashAlgorithm1.getSignature() == paramShort) {
        short s = signatureAndHashAlgorithm1.getHash();
        if (s >= 2)
          if (signatureAndHashAlgorithm == null) {
            signatureAndHashAlgorithm = signatureAndHashAlgorithm1;
          } else {
            short s1 = signatureAndHashAlgorithm.getHash();
            if (s1 < 4) {
              if (s > s1)
                signatureAndHashAlgorithm = signatureAndHashAlgorithm1; 
            } else if (s >= 4 && s < s1) {
              signatureAndHashAlgorithm = signatureAndHashAlgorithm1;
            } 
          }  
      } 
    } 
    if (signatureAndHashAlgorithm == null)
      throw new TlsFatalAlert((short)80); 
    return signatureAndHashAlgorithm;
  }
  
  public static Vector getUsableSignatureAlgorithms(Vector<SignatureAndHashAlgorithm> paramVector) {
    if (paramVector == null) {
      Vector<Short> vector1 = new Vector(3);
      vector1.addElement(Shorts.valueOf((short)1));
      vector1.addElement(Shorts.valueOf((short)2));
      vector1.addElement(Shorts.valueOf((short)3));
      return vector1;
    } 
    Vector<Short> vector = new Vector();
    for (byte b = 0; b < paramVector.size(); b++) {
      SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramVector.elementAt(b);
      if (signatureAndHashAlgorithm.getHash() >= 2) {
        Short short_ = Shorts.valueOf(signatureAndHashAlgorithm.getSignature());
        if (!vector.contains(short_))
          vector.addElement(short_); 
      } 
    } 
    return vector;
  }
  
  public static int getCommonCipherSuite13(ProtocolVersion paramProtocolVersion, int[] paramArrayOfint1, int[] paramArrayOfint2, boolean paramBoolean) {
    int[] arrayOfInt1 = paramArrayOfint1;
    int[] arrayOfInt2 = paramArrayOfint2;
    if (paramBoolean) {
      arrayOfInt1 = paramArrayOfint2;
      arrayOfInt2 = paramArrayOfint1;
    } 
    for (byte b = 0; b < arrayOfInt1.length; b++) {
      int i = arrayOfInt1[b];
      if (Arrays.contains(arrayOfInt2, i) && isValidVersionForCipherSuite(i, paramProtocolVersion))
        return i; 
    } 
    return -1;
  }
  
  public static int[] getCommonCipherSuites(int[] paramArrayOfint1, int[] paramArrayOfint2, boolean paramBoolean) {
    int[] arrayOfInt1 = paramArrayOfint1;
    int[] arrayOfInt2 = paramArrayOfint2;
    if (paramBoolean) {
      arrayOfInt1 = paramArrayOfint2;
      arrayOfInt2 = paramArrayOfint1;
    } 
    byte b1 = 0;
    int i = Math.min(arrayOfInt1.length, arrayOfInt2.length);
    int[] arrayOfInt3 = new int[i];
    for (byte b2 = 0; b2 < arrayOfInt1.length; b2++) {
      int j = arrayOfInt1[b2];
      if (!contains(arrayOfInt3, 0, b1, j) && Arrays.contains(arrayOfInt2, j))
        arrayOfInt3[b1++] = j; 
    } 
    if (b1 < i)
      arrayOfInt3 = Arrays.copyOf(arrayOfInt3, b1); 
    return arrayOfInt3;
  }
  
  public static int[] getSupportedCipherSuites(TlsCrypto paramTlsCrypto, int[] paramArrayOfint) {
    return getSupportedCipherSuites(paramTlsCrypto, paramArrayOfint, 0, paramArrayOfint.length);
  }
  
  public static int[] getSupportedCipherSuites(TlsCrypto paramTlsCrypto, int[] paramArrayOfint, int paramInt) {
    return getSupportedCipherSuites(paramTlsCrypto, paramArrayOfint, 0, paramInt);
  }
  
  public static int[] getSupportedCipherSuites(TlsCrypto paramTlsCrypto, int[] paramArrayOfint, int paramInt1, int paramInt2) {
    int[] arrayOfInt = new int[paramInt2];
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramInt2; b2++) {
      int i = paramArrayOfint[paramInt1 + b2];
      if (isSupportedCipherSuite(paramTlsCrypto, i))
        arrayOfInt[b1++] = i; 
    } 
    if (b1 < paramInt2)
      arrayOfInt = Arrays.copyOf(arrayOfInt, b1); 
    return arrayOfInt;
  }
  
  public static boolean isSupportedCipherSuite(TlsCrypto paramTlsCrypto, int paramInt) {
    int i = getKeyExchangeAlgorithm(paramInt);
    if (!isSupportedKeyExchange(paramTlsCrypto, i))
      return false; 
    int j = getEncryptionAlgorithm(paramInt);
    if (j < 0 || !paramTlsCrypto.hasEncryptionAlgorithm(j))
      return false; 
    int k = getMACAlgorithm(paramInt);
    return !(k != 0 && (k < 0 || !paramTlsCrypto.hasMacAlgorithm(k)));
  }
  
  public static boolean isSupportedKeyExchange(TlsCrypto paramTlsCrypto, int paramInt) {
    switch (paramInt) {
      case 7:
      case 9:
      case 11:
      case 14:
        return paramTlsCrypto.hasDHAgreement();
      case 3:
        return (paramTlsCrypto.hasDHAgreement() && paramTlsCrypto.hasSignatureAlgorithm((short)2));
      case 5:
        return (paramTlsCrypto.hasDHAgreement() && hasAnyRSASigAlgs(paramTlsCrypto));
      case 16:
      case 18:
      case 20:
      case 24:
        return paramTlsCrypto.hasECDHAgreement();
      case 17:
        return (paramTlsCrypto.hasECDHAgreement() && (paramTlsCrypto.hasSignatureAlgorithm((short)3) || paramTlsCrypto.hasSignatureAlgorithm((short)7) || paramTlsCrypto.hasSignatureAlgorithm((short)8)));
      case 19:
        return (paramTlsCrypto.hasECDHAgreement() && hasAnyRSASigAlgs(paramTlsCrypto));
      case 0:
      case 13:
        return true;
      case 1:
      case 15:
        return paramTlsCrypto.hasRSAEncryption();
      case 21:
        return paramTlsCrypto.hasSRPAuthentication();
      case 22:
        return (paramTlsCrypto.hasSRPAuthentication() && paramTlsCrypto.hasSignatureAlgorithm((short)2));
      case 23:
        return (paramTlsCrypto.hasSRPAuthentication() && hasAnyRSASigAlgs(paramTlsCrypto));
    } 
    return false;
  }
  
  static boolean hasAnyRSASigAlgs(TlsCrypto paramTlsCrypto) {
    return (paramTlsCrypto.hasSignatureAlgorithm((short)1) || paramTlsCrypto.hasSignatureAlgorithm((short)4) || paramTlsCrypto.hasSignatureAlgorithm((short)5) || paramTlsCrypto.hasSignatureAlgorithm((short)6) || paramTlsCrypto.hasSignatureAlgorithm((short)9) || paramTlsCrypto.hasSignatureAlgorithm((short)10) || paramTlsCrypto.hasSignatureAlgorithm((short)11));
  }
  
  static byte[] getCurrentPRFHash(TlsHandshakeHash paramTlsHandshakeHash) {
    return paramTlsHandshakeHash.forkPRFHash().calculateHash();
  }
  
  private static TlsHash createHash(TlsCrypto paramTlsCrypto, short paramShort) {
    return paramTlsCrypto.createHash(TlsCryptoUtils.getHash(paramShort));
  }
  
  private static TlsHash createHash(TlsCrypto paramTlsCrypto, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    return paramTlsCrypto.createHash(SignatureScheme.getCryptoHashAlgorithm(paramSignatureAndHashAlgorithm));
  }
  
  private static TlsKeyExchange createKeyExchangeClient(TlsClient paramTlsClient, int paramInt) throws IOException {
    TlsKeyExchangeFactory tlsKeyExchangeFactory = paramTlsClient.getKeyExchangeFactory();
    switch (paramInt) {
      case 11:
        return tlsKeyExchangeFactory.createDHanonKeyExchangeClient(paramInt, paramTlsClient.getDHGroupVerifier());
      case 7:
      case 9:
        return tlsKeyExchangeFactory.createDHKeyExchange(paramInt);
      case 3:
      case 5:
        return tlsKeyExchangeFactory.createDHEKeyExchangeClient(paramInt, paramTlsClient.getDHGroupVerifier());
      case 20:
        return tlsKeyExchangeFactory.createECDHanonKeyExchangeClient(paramInt);
      case 16:
      case 18:
        return tlsKeyExchangeFactory.createECDHKeyExchange(paramInt);
      case 17:
      case 19:
        return tlsKeyExchangeFactory.createECDHEKeyExchangeClient(paramInt);
      case 1:
        return tlsKeyExchangeFactory.createRSAKeyExchange(paramInt);
      case 14:
        return tlsKeyExchangeFactory.createPSKKeyExchangeClient(paramInt, paramTlsClient.getPSKIdentity(), paramTlsClient.getDHGroupVerifier());
      case 13:
      case 15:
      case 24:
        return tlsKeyExchangeFactory.createPSKKeyExchangeClient(paramInt, paramTlsClient.getPSKIdentity(), null);
      case 21:
      case 22:
      case 23:
        return tlsKeyExchangeFactory.createSRPKeyExchangeClient(paramInt, paramTlsClient.getSRPIdentity(), paramTlsClient.getSRPConfigVerifier());
    } 
    throw new TlsFatalAlert((short)80);
  }
  
  private static TlsKeyExchange createKeyExchangeServer(TlsServer paramTlsServer, int paramInt) throws IOException {
    TlsKeyExchangeFactory tlsKeyExchangeFactory = paramTlsServer.getKeyExchangeFactory();
    switch (paramInt) {
      case 11:
        return tlsKeyExchangeFactory.createDHanonKeyExchangeServer(paramInt, paramTlsServer.getDHConfig());
      case 7:
      case 9:
        return tlsKeyExchangeFactory.createDHKeyExchange(paramInt);
      case 3:
      case 5:
        return tlsKeyExchangeFactory.createDHEKeyExchangeServer(paramInt, paramTlsServer.getDHConfig());
      case 20:
        return tlsKeyExchangeFactory.createECDHanonKeyExchangeServer(paramInt, paramTlsServer.getECDHConfig());
      case 16:
      case 18:
        return tlsKeyExchangeFactory.createECDHKeyExchange(paramInt);
      case 17:
      case 19:
        return tlsKeyExchangeFactory.createECDHEKeyExchangeServer(paramInt, paramTlsServer.getECDHConfig());
      case 1:
        return tlsKeyExchangeFactory.createRSAKeyExchange(paramInt);
      case 14:
        return tlsKeyExchangeFactory.createPSKKeyExchangeServer(paramInt, paramTlsServer.getPSKIdentityManager(), paramTlsServer.getDHConfig(), null);
      case 24:
        return tlsKeyExchangeFactory.createPSKKeyExchangeServer(paramInt, paramTlsServer.getPSKIdentityManager(), null, paramTlsServer.getECDHConfig());
      case 13:
      case 15:
        return tlsKeyExchangeFactory.createPSKKeyExchangeServer(paramInt, paramTlsServer.getPSKIdentityManager(), null, null);
      case 21:
      case 22:
      case 23:
        return tlsKeyExchangeFactory.createSRPKeyExchangeServer(paramInt, paramTlsServer.getSRPLoginParameters());
    } 
    throw new TlsFatalAlert((short)80);
  }
  
  static TlsKeyExchange initKeyExchangeClient(TlsClientContext paramTlsClientContext, TlsClient paramTlsClient) throws IOException {
    SecurityParameters securityParameters = paramTlsClientContext.getSecurityParametersHandshake();
    TlsKeyExchange tlsKeyExchange = createKeyExchangeClient(paramTlsClient, securityParameters.getKeyExchangeAlgorithm());
    tlsKeyExchange.init((TlsContext)paramTlsClientContext);
    return tlsKeyExchange;
  }
  
  static TlsKeyExchange initKeyExchangeServer(TlsServerContext paramTlsServerContext, TlsServer paramTlsServer) throws IOException {
    SecurityParameters securityParameters = paramTlsServerContext.getSecurityParametersHandshake();
    TlsKeyExchange tlsKeyExchange = createKeyExchangeServer(paramTlsServer, securityParameters.getKeyExchangeAlgorithm());
    tlsKeyExchange.init((TlsContext)paramTlsServerContext);
    return tlsKeyExchange;
  }
  
  static TlsCipher initCipher(TlsContext paramTlsContext) throws IOException {
    SecurityParameters securityParameters = paramTlsContext.getSecurityParametersHandshake();
    int i = securityParameters.getCipherSuite();
    int j = getEncryptionAlgorithm(i);
    int k = getMACAlgorithm(i);
    if (j < 0 || k < 0)
      throw new TlsFatalAlert((short)80); 
    return paramTlsContext.getCrypto().createCipher(new TlsCryptoParameters(paramTlsContext), j, k);
  }
  
  public static void checkPeerSigAlgs(TlsContext paramTlsContext, TlsCertificate[] paramArrayOfTlsCertificate) throws IOException {
    if (paramTlsContext.isServer()) {
      checkSigAlgOfClientCerts(paramTlsContext, paramArrayOfTlsCertificate);
    } else {
      checkSigAlgOfServerCerts(paramTlsContext, paramArrayOfTlsCertificate);
    } 
  }
  
  private static void checkSigAlgOfClientCerts(TlsContext paramTlsContext, TlsCertificate[] paramArrayOfTlsCertificate) throws IOException {
    SecurityParameters securityParameters = paramTlsContext.getSecurityParametersHandshake();
    short[] arrayOfShort = securityParameters.getClientCertTypes();
    Vector vector = securityParameters.getServerSigAlgsCert();
    int i = paramArrayOfTlsCertificate.length - 1;
    for (byte b = 0; b < i; b++) {
      TlsCertificate tlsCertificate1 = paramArrayOfTlsCertificate[b];
      TlsCertificate tlsCertificate2 = paramArrayOfTlsCertificate[b + 1];
      SignatureAndHashAlgorithm signatureAndHashAlgorithm = getCertSigAndHashAlg(tlsCertificate1, tlsCertificate2);
      boolean bool = false;
      if (null != signatureAndHashAlgorithm)
        if (null == vector) {
          if (null != arrayOfShort)
            for (byte b1 = 0; b1 < arrayOfShort.length; b1++) {
              short s = getLegacySignatureAlgorithmClientCert(arrayOfShort[b1]);
              if (signatureAndHashAlgorithm.getSignature() == s) {
                bool = true;
                break;
              } 
            }  
        } else {
          bool = containsSignatureAlgorithm(vector, signatureAndHashAlgorithm);
        }  
      if (!bool)
        throw new TlsFatalAlert((short)42); 
    } 
  }
  
  private static void checkSigAlgOfServerCerts(TlsContext paramTlsContext, TlsCertificate[] paramArrayOfTlsCertificate) throws IOException {
    SecurityParameters securityParameters = paramTlsContext.getSecurityParametersHandshake();
    Vector vector1 = securityParameters.getClientSigAlgsCert();
    Vector vector2 = securityParameters.getClientSigAlgs();
    if (vector2 == vector1 || isTLSv13(securityParameters.getNegotiatedVersion()))
      vector2 = null; 
    int i = paramArrayOfTlsCertificate.length - 1;
    for (byte b = 0; b < i; b++) {
      TlsCertificate tlsCertificate1 = paramArrayOfTlsCertificate[b];
      TlsCertificate tlsCertificate2 = paramArrayOfTlsCertificate[b + 1];
      SignatureAndHashAlgorithm signatureAndHashAlgorithm = getCertSigAndHashAlg(tlsCertificate1, tlsCertificate2);
      boolean bool = false;
      if (null != signatureAndHashAlgorithm)
        if (null == vector1) {
          short s = getLegacySignatureAlgorithmServerCert(securityParameters.getKeyExchangeAlgorithm());
          bool = (s == signatureAndHashAlgorithm.getSignature()) ? true : false;
        } else {
          bool = (containsSignatureAlgorithm(vector1, signatureAndHashAlgorithm) || (null != vector2 && containsSignatureAlgorithm(vector2, signatureAndHashAlgorithm))) ? true : false;
        }  
      if (!bool)
        throw new TlsFatalAlert((short)42); 
    } 
  }
  
  static void checkTlsFeatures(Certificate paramCertificate, Hashtable paramHashtable1, Hashtable paramHashtable2) throws IOException {
    byte[] arrayOfByte = paramCertificate.getCertificateAt(0).getExtension(TlsObjectIdentifiers.id_pe_tlsfeature);
    if (arrayOfByte != null) {
      ASN1Sequence aSN1Sequence = (ASN1Sequence)readASN1Object(arrayOfByte);
      byte b;
      for (b = 0; b < aSN1Sequence.size(); b++) {
        if (!(aSN1Sequence.getObjectAt(b) instanceof ASN1Integer))
          throw new TlsFatalAlert((short)42); 
      } 
      requireDEREncoding((ASN1Object)aSN1Sequence, arrayOfByte);
      for (b = 0; b < aSN1Sequence.size(); b++) {
        BigInteger bigInteger = ((ASN1Integer)aSN1Sequence.getObjectAt(b)).getPositiveValue();
        if (bigInteger.bitLength() <= 16) {
          Integer integer = Integers.valueOf(bigInteger.intValue());
          if (paramHashtable1.containsKey(integer) && !paramHashtable2.containsKey(integer))
            throw new TlsFatalAlert((short)46); 
        } 
      } 
    } 
  }
  
  static void processClientCertificate(TlsServerContext paramTlsServerContext, Certificate paramCertificate, TlsKeyExchange paramTlsKeyExchange, TlsServer paramTlsServer) throws IOException {
    SecurityParameters securityParameters = paramTlsServerContext.getSecurityParametersHandshake();
    if (null != securityParameters.getPeerCertificate())
      throw new TlsFatalAlert((short)10); 
    boolean bool = isTLSv13(securityParameters.getNegotiatedVersion());
    if (!bool)
      if (paramCertificate.isEmpty()) {
        paramTlsKeyExchange.skipClientCredentials();
      } else {
        paramTlsKeyExchange.processClientCertificate(paramCertificate);
      }  
    securityParameters.peerCertificate = paramCertificate;
    paramTlsServer.notifyClientCertificate(paramCertificate);
  }
  
  static void processServerCertificate(TlsClientContext paramTlsClientContext, CertificateStatus paramCertificateStatus, TlsKeyExchange paramTlsKeyExchange, TlsAuthentication paramTlsAuthentication, Hashtable paramHashtable1, Hashtable paramHashtable2) throws IOException {
    SecurityParameters securityParameters = paramTlsClientContext.getSecurityParametersHandshake();
    boolean bool = isTLSv13(securityParameters.getNegotiatedVersion());
    if (null == paramTlsAuthentication) {
      if (bool)
        throw new TlsFatalAlert((short)80); 
      if (securityParameters.isRenegotiating())
        throw new TlsFatalAlert((short)40); 
      paramTlsKeyExchange.skipServerCredentials();
      securityParameters.tlsServerEndPoint = EMPTY_BYTES;
      return;
    } 
    Certificate certificate = securityParameters.getPeerCertificate();
    checkTlsFeatures(certificate, paramHashtable1, paramHashtable2);
    if (!bool)
      paramTlsKeyExchange.processServerCertificate(certificate); 
    paramTlsAuthentication.notifyServerCertificate((TlsServerCertificate)new TlsServerCertificateImpl(certificate, paramCertificateStatus));
  }
  
  static SignatureAndHashAlgorithm getCertSigAndHashAlg(TlsCertificate paramTlsCertificate1, TlsCertificate paramTlsCertificate2) throws IOException {
    String str = paramTlsCertificate1.getSigAlgOID();
    if (null != str) {
      if (!PKCSObjectIdentifiers.id_RSASSA_PSS.getId().equals(str))
        return (SignatureAndHashAlgorithm)CERT_SIG_ALG_OIDS.get(str); 
      RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(paramTlsCertificate1.getSigAlgParams());
      if (null != rSASSAPSSparams) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = rSASSAPSSparams.getHashAlgorithm().getAlgorithm();
        if (NISTObjectIdentifiers.id_sha256.equals((ASN1Primitive)aSN1ObjectIdentifier)) {
          if (paramTlsCertificate2.supportsSignatureAlgorithmCA((short)9))
            return SignatureAndHashAlgorithm.rsa_pss_pss_sha256; 
          if (paramTlsCertificate2.supportsSignatureAlgorithmCA((short)4))
            return SignatureAndHashAlgorithm.rsa_pss_rsae_sha256; 
        } else if (NISTObjectIdentifiers.id_sha384.equals((ASN1Primitive)aSN1ObjectIdentifier)) {
          if (paramTlsCertificate2.supportsSignatureAlgorithmCA((short)10))
            return SignatureAndHashAlgorithm.rsa_pss_pss_sha384; 
          if (paramTlsCertificate2.supportsSignatureAlgorithmCA((short)5))
            return SignatureAndHashAlgorithm.rsa_pss_rsae_sha384; 
        } else if (NISTObjectIdentifiers.id_sha512.equals((ASN1Primitive)aSN1ObjectIdentifier)) {
          if (paramTlsCertificate2.supportsSignatureAlgorithmCA((short)11))
            return SignatureAndHashAlgorithm.rsa_pss_pss_sha512; 
          if (paramTlsCertificate2.supportsSignatureAlgorithmCA((short)6))
            return SignatureAndHashAlgorithm.rsa_pss_rsae_sha512; 
        } 
      } 
    } 
    return null;
  }
  
  static CertificateRequest validateCertificateRequest(CertificateRequest paramCertificateRequest, TlsKeyExchange paramTlsKeyExchange) throws IOException {
    short[] arrayOfShort = paramTlsKeyExchange.getClientCertificateTypes();
    if (isNullOrEmpty(arrayOfShort))
      throw new TlsFatalAlert((short)10); 
    paramCertificateRequest = normalizeCertificateRequest(paramCertificateRequest, arrayOfShort);
    if (paramCertificateRequest == null)
      throw new TlsFatalAlert((short)47); 
    return paramCertificateRequest;
  }
  
  static CertificateRequest normalizeCertificateRequest(CertificateRequest paramCertificateRequest, short[] paramArrayOfshort) {
    if (containsAll(paramArrayOfshort, paramCertificateRequest.getCertificateTypes()))
      return paramCertificateRequest; 
    short[] arrayOfShort = retainAll(paramCertificateRequest.getCertificateTypes(), paramArrayOfshort);
    return (arrayOfShort.length < 1) ? null : new CertificateRequest(arrayOfShort, paramCertificateRequest.getSupportedSignatureAlgorithms(), paramCertificateRequest.getCertificateAuthorities());
  }
  
  static boolean contains(short[] paramArrayOfshort, int paramInt1, int paramInt2, short paramShort) {
    for (byte b = 0; b < paramInt2; b++) {
      if (paramShort == paramArrayOfshort[paramInt1 + b])
        return true; 
    } 
    return false;
  }
  
  static boolean contains(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    for (byte b = 0; b < paramInt2; b++) {
      if (paramInt3 == paramArrayOfint[paramInt1 + b])
        return true; 
    } 
    return false;
  }
  
  static boolean containsAll(short[] paramArrayOfshort1, short[] paramArrayOfshort2) {
    for (byte b = 0; b < paramArrayOfshort2.length; b++) {
      if (!Arrays.contains(paramArrayOfshort1, paramArrayOfshort2[b]))
        return false; 
    } 
    return true;
  }
  
  static boolean containsNot(short[] paramArrayOfshort, int paramInt1, int paramInt2, short paramShort) {
    for (byte b = 0; b < paramInt2; b++) {
      if (paramShort != paramArrayOfshort[paramInt1 + b])
        return true; 
    } 
    return false;
  }
  
  static short[] retainAll(short[] paramArrayOfshort1, short[] paramArrayOfshort2) {
    short[] arrayOfShort = new short[Math.min(paramArrayOfshort1.length, paramArrayOfshort2.length)];
    byte b1 = 0;
    for (byte b2 = 0; b2 < paramArrayOfshort2.length; b2++) {
      if (Arrays.contains(paramArrayOfshort1, paramArrayOfshort2[b2]))
        arrayOfShort[b1++] = paramArrayOfshort2[b2]; 
    } 
    return truncate(arrayOfShort, b1);
  }
  
  static short[] truncate(short[] paramArrayOfshort, int paramInt) {
    if (paramInt >= paramArrayOfshort.length)
      return paramArrayOfshort; 
    short[] arrayOfShort = new short[paramInt];
    System.arraycopy(paramArrayOfshort, 0, arrayOfShort, 0, paramInt);
    return arrayOfShort;
  }
  
  static int[] truncate(int[] paramArrayOfint, int paramInt) {
    if (paramInt >= paramArrayOfint.length)
      return paramArrayOfint; 
    int[] arrayOfInt = new int[paramInt];
    System.arraycopy(paramArrayOfint, 0, arrayOfInt, 0, paramInt);
    return arrayOfInt;
  }
  
  static TlsCredentialedAgreement requireAgreementCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    if (!(paramTlsCredentials instanceof TlsCredentialedAgreement))
      throw new TlsFatalAlert((short)80); 
    return (TlsCredentialedAgreement)paramTlsCredentials;
  }
  
  static TlsCredentialedDecryptor requireDecryptorCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    if (!(paramTlsCredentials instanceof TlsCredentialedDecryptor))
      throw new TlsFatalAlert((short)80); 
    return (TlsCredentialedDecryptor)paramTlsCredentials;
  }
  
  static TlsCredentialedSigner requireSignerCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    if (!(paramTlsCredentials instanceof TlsCredentialedSigner))
      throw new TlsFatalAlert((short)80); 
    return (TlsCredentialedSigner)paramTlsCredentials;
  }
  
  private static void checkClientCertificateType(CertificateRequest paramCertificateRequest, short paramShort1, short paramShort2) throws IOException {
    if (paramShort1 < 0 || !Arrays.contains(paramCertificateRequest.getCertificateTypes(), paramShort1))
      throw new TlsFatalAlert(paramShort2); 
  }
  
  private static void checkDowngradeMarker(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) throws IOException {
    int i = paramArrayOfbyte2.length;
    if (constantTimeAreEqual(i, paramArrayOfbyte2, 0, paramArrayOfbyte1, paramArrayOfbyte1.length - i))
      throw new TlsFatalAlert((short)47); 
  }
  
  static void checkDowngradeMarker(ProtocolVersion paramProtocolVersion, byte[] paramArrayOfbyte) throws IOException {
    paramProtocolVersion = paramProtocolVersion.getEquivalentTLSVersion();
    if (paramProtocolVersion.isEqualOrEarlierVersionOf(ProtocolVersion.TLSv11))
      checkDowngradeMarker(paramArrayOfbyte, DOWNGRADE_TLS11); 
    if (paramProtocolVersion.isEqualOrEarlierVersionOf(ProtocolVersion.TLSv12))
      checkDowngradeMarker(paramArrayOfbyte, DOWNGRADE_TLS12); 
  }
  
  static void writeDowngradeMarker(ProtocolVersion paramProtocolVersion, byte[] paramArrayOfbyte) throws IOException {
    byte[] arrayOfByte;
    paramProtocolVersion = paramProtocolVersion.getEquivalentTLSVersion();
    if (ProtocolVersion.TLSv12 == paramProtocolVersion) {
      arrayOfByte = DOWNGRADE_TLS12;
    } else if (paramProtocolVersion.isEqualOrEarlierVersionOf(ProtocolVersion.TLSv11)) {
      arrayOfByte = DOWNGRADE_TLS11;
    } else {
      throw new TlsFatalAlert((short)80);
    } 
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, paramArrayOfbyte.length - arrayOfByte.length, arrayOfByte.length);
  }
  
  private static boolean areCertificatesEqual(Certificate paramCertificate1, Certificate paramCertificate2) {
    int i = paramCertificate1.getLength();
    if (paramCertificate2.getLength() == i)
      try {
        for (byte b = 0; b < i; b++) {
          TlsCertificate tlsCertificate1 = paramCertificate1.getCertificateAt(b);
          TlsCertificate tlsCertificate2 = paramCertificate2.getCertificateAt(b);
          if (!Arrays.areEqual(tlsCertificate1.getEncoded(), tlsCertificate2.getEncoded()))
            return false; 
        } 
        return true;
      } catch (IOException iOException) {} 
    return false;
  }
  
  private static boolean isSafeRenegotiationServerCertificate(TlsClientContext paramTlsClientContext, Certificate paramCertificate) {
    SecurityParameters securityParameters = paramTlsClientContext.getSecurityParametersConnection();
    if (securityParameters != null) {
      Certificate certificate = securityParameters.getPeerCertificate();
      if (null != certificate)
        return areCertificatesEqual(certificate, paramCertificate); 
    } 
    return false;
  }
  
  static TlsAuthentication receiveServerCertificate(TlsClientContext paramTlsClientContext, TlsClient paramTlsClient, ByteArrayInputStream paramByteArrayInputStream, Hashtable paramHashtable) throws IOException {
    SecurityParameters securityParameters = paramTlsClientContext.getSecurityParametersHandshake();
    if (KeyExchangeAlgorithm.isAnonymous(securityParameters.getKeyExchangeAlgorithm()) || null != securityParameters.getPeerCertificate())
      throw new TlsFatalAlert((short)10); 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    Certificate.ParseOptions parseOptions = (new Certificate.ParseOptions()).setCertificateType(securityParameters.getServerCertificateType()).setMaxChainLength(paramTlsClient.getMaxCertificateChainLength());
    Certificate certificate = Certificate.parse(parseOptions, (TlsContext)paramTlsClientContext, paramByteArrayInputStream, byteArrayOutputStream);
    TlsProtocol.assertEmpty(paramByteArrayInputStream);
    if (certificate.isEmpty())
      throw new TlsFatalAlert((short)50); 
    if (securityParameters.isRenegotiating() && !isSafeRenegotiationServerCertificate(paramTlsClientContext, certificate))
      throw new TlsFatalAlert((short)46, "Server certificate changed unsafely in renegotiation handshake"); 
    securityParameters.peerCertificate = certificate;
    securityParameters.tlsServerEndPoint = byteArrayOutputStream.toByteArray();
    TlsAuthentication tlsAuthentication = paramTlsClient.getAuthentication();
    if (null == tlsAuthentication)
      throw new TlsFatalAlert((short)80); 
    return tlsAuthentication;
  }
  
  static TlsAuthentication receive13ServerCertificate(TlsClientContext paramTlsClientContext, TlsClient paramTlsClient, ByteArrayInputStream paramByteArrayInputStream, Hashtable paramHashtable) throws IOException {
    SecurityParameters securityParameters = paramTlsClientContext.getSecurityParametersHandshake();
    if (null != securityParameters.getPeerCertificate())
      throw new TlsFatalAlert((short)10); 
    Certificate.ParseOptions parseOptions = (new Certificate.ParseOptions()).setCertificateType(securityParameters.getServerCertificateType()).setMaxChainLength(paramTlsClient.getMaxCertificateChainLength());
    Certificate certificate = Certificate.parse(parseOptions, (TlsContext)paramTlsClientContext, paramByteArrayInputStream, null);
    TlsProtocol.assertEmpty(paramByteArrayInputStream);
    if ((certificate.getCertificateRequestContext()).length > 0)
      throw new TlsFatalAlert((short)47); 
    if (certificate.isEmpty())
      throw new TlsFatalAlert((short)50); 
    securityParameters.peerCertificate = certificate;
    securityParameters.tlsServerEndPoint = null;
    TlsAuthentication tlsAuthentication = paramTlsClient.getAuthentication();
    if (null == tlsAuthentication)
      throw new TlsFatalAlert((short)80); 
    return tlsAuthentication;
  }
  
  static TlsAuthentication skip13ServerCertificate(TlsClientContext paramTlsClientContext) throws IOException {
    SecurityParameters securityParameters = paramTlsClientContext.getSecurityParametersHandshake();
    if (null != securityParameters.getPeerCertificate())
      throw new TlsFatalAlert((short)80); 
    securityParameters.peerCertificate = null;
    securityParameters.tlsServerEndPoint = null;
    return null;
  }
  
  public static boolean containsNonAscii(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      int i = paramArrayOfbyte[b] & 0xFF;
      if (i >= 128)
        return true; 
    } 
    return false;
  }
  
  public static boolean containsNonAscii(String paramString) {
    for (byte b = 0; b < paramString.length(); b++) {
      char c = paramString.charAt(b);
      if (c >= '')
        return true; 
    } 
    return false;
  }
  
  static Hashtable addKeyShareToClientHello(TlsClientContext paramTlsClientContext, TlsClient paramTlsClient, Hashtable paramHashtable) throws IOException {
    if (!isTLSv13(paramTlsClientContext.getClientVersion()) || !paramHashtable.containsKey(TlsExtensionsUtils.EXT_supported_groups))
      return null; 
    int[] arrayOfInt = TlsExtensionsUtils.getSupportedGroupsExtension(paramHashtable);
    Vector vector1 = paramTlsClient.getEarlyKeyShareGroups();
    Hashtable<Object, Object> hashtable = new Hashtable<>(3);
    Vector vector2 = new Vector(2);
    collectKeyShares(paramTlsClientContext, arrayOfInt, vector1, hashtable, vector2);
    TlsExtensionsUtils.addKeyShareClientHello(paramHashtable, vector2);
    return hashtable;
  }
  
  static Hashtable addKeyShareToClientHelloRetry(TlsClientContext paramTlsClientContext, Hashtable paramHashtable, int paramInt) throws IOException {
    int[] arrayOfInt = { paramInt };
    Vector vector1 = vectorOfOne(Integers.valueOf(paramInt));
    Hashtable<Object, Object> hashtable = new Hashtable<>(1, 1.0F);
    Vector vector2 = new Vector(1);
    collectKeyShares(paramTlsClientContext, arrayOfInt, vector1, hashtable, vector2);
    TlsExtensionsUtils.addKeyShareClientHello(paramHashtable, vector2);
    if (hashtable.isEmpty() || vector2.isEmpty())
      throw new TlsFatalAlert((short)80); 
    return hashtable;
  }
  
  private static void collectKeyShares(TlsClientContext paramTlsClientContext, int[] paramArrayOfint, Vector paramVector1, Hashtable<Integer, TlsAgreement> paramHashtable, Vector<KeyShareEntry> paramVector2) throws IOException {
    TlsCrypto tlsCrypto = paramTlsClientContext.getCrypto();
    if (isNullOrEmpty(paramArrayOfint))
      return; 
    if (null == paramVector1 || paramVector1.isEmpty())
      return; 
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      int i = paramArrayOfint[b];
      Integer integer = Integers.valueOf(i);
      if (paramVector1.contains(integer) && !paramHashtable.containsKey(integer) && tlsCrypto.hasNamedGroup(i)) {
        TlsAgreement tlsAgreement = null;
        if (NamedGroup.refersToAnECDHCurve(i)) {
          if (tlsCrypto.hasECDHAgreement())
            tlsAgreement = tlsCrypto.createECDomain(new TlsECConfig(i)).createECDH(); 
        } else if (NamedGroup.refersToASpecificFiniteField(i)) {
          if (tlsCrypto.hasDHAgreement())
            tlsAgreement = tlsCrypto.createDHDomain(new TlsDHConfig(i, true)).createDH(); 
        } else if (NamedGroup.refersToASpecificKem(i) && tlsCrypto.hasKemAgreement()) {
          tlsAgreement = tlsCrypto.createKemDomain(new TlsKemConfig(i, false)).createKem();
        } 
        if (null != tlsAgreement) {
          byte[] arrayOfByte = tlsAgreement.generateEphemeral();
          KeyShareEntry keyShareEntry = new KeyShareEntry(i, arrayOfByte);
          paramVector2.addElement(keyShareEntry);
          paramHashtable.put(integer, tlsAgreement);
        } 
      } 
    } 
  }
  
  static KeyShareEntry selectKeyShare(Vector<KeyShareEntry> paramVector, int paramInt) {
    if (null != paramVector && 1 == paramVector.size()) {
      KeyShareEntry keyShareEntry = paramVector.elementAt(0);
      if (null != keyShareEntry && keyShareEntry.getNamedGroup() == paramInt)
        return keyShareEntry; 
    } 
    return null;
  }
  
  static KeyShareEntry selectKeyShare(TlsCrypto paramTlsCrypto, ProtocolVersion paramProtocolVersion, Vector<KeyShareEntry> paramVector, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    if (null != paramVector && !isNullOrEmpty(paramArrayOfint1) && !isNullOrEmpty(paramArrayOfint2)) {
      byte b = 0;
      while (b < paramVector.size()) {
        KeyShareEntry keyShareEntry = paramVector.elementAt(b);
        int i = keyShareEntry.getNamedGroup();
        if (!NamedGroup.canBeNegotiated(i, paramProtocolVersion) || !Arrays.contains(paramArrayOfint2, i) || !Arrays.contains(paramArrayOfint1, i) || !paramTlsCrypto.hasNamedGroup(i) || (NamedGroup.refersToAnECDHCurve(i) && !paramTlsCrypto.hasECDHAgreement()) || (NamedGroup.refersToASpecificFiniteField(i) && !paramTlsCrypto.hasDHAgreement()) || (NamedGroup.refersToASpecificKem(i) && !paramTlsCrypto.hasKemAgreement())) {
          b++;
          continue;
        } 
        return keyShareEntry;
      } 
    } 
    return null;
  }
  
  static int selectKeyShareGroup(TlsCrypto paramTlsCrypto, ProtocolVersion paramProtocolVersion, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    if (!isNullOrEmpty(paramArrayOfint1) && !isNullOrEmpty(paramArrayOfint2)) {
      byte b = 0;
      while (b < paramArrayOfint1.length) {
        int i = paramArrayOfint1[b];
        if (!NamedGroup.canBeNegotiated(i, paramProtocolVersion) || !Arrays.contains(paramArrayOfint2, i) || !paramTlsCrypto.hasNamedGroup(i) || (NamedGroup.refersToAnECDHCurve(i) && !paramTlsCrypto.hasECDHAgreement()) || (NamedGroup.refersToASpecificFiniteField(i) && !paramTlsCrypto.hasDHAgreement()) || (NamedGroup.refersToASpecificKem(i) && !paramTlsCrypto.hasKemAgreement())) {
          b++;
          continue;
        } 
        return i;
      } 
    } 
    return -1;
  }
  
  static byte[] readEncryptedPMS(TlsContext paramTlsContext, InputStream paramInputStream) throws IOException {
    return isSSL(paramTlsContext) ? SSL3Utils.readEncryptedPMS(paramInputStream) : readOpaque16(paramInputStream);
  }
  
  static void writeEncryptedPMS(TlsContext paramTlsContext, byte[] paramArrayOfbyte, OutputStream paramOutputStream) throws IOException {
    if (isSSL(paramTlsContext)) {
      SSL3Utils.writeEncryptedPMS(paramArrayOfbyte, paramOutputStream);
    } else {
      writeOpaque16(paramArrayOfbyte, paramOutputStream);
    } 
  }
  
  static byte[] getSessionID(TlsSession paramTlsSession) {
    if (null != paramTlsSession) {
      byte[] arrayOfByte = paramTlsSession.getSessionID();
      if (null != arrayOfByte && arrayOfByte.length > 0 && arrayOfByte.length <= 32)
        return arrayOfByte; 
    } 
    return EMPTY_BYTES;
  }
  
  static void adjustTranscriptForRetry(TlsHandshakeHash paramTlsHandshakeHash) throws IOException {
    byte[] arrayOfByte1 = getCurrentPRFHash(paramTlsHandshakeHash);
    paramTlsHandshakeHash.reset();
    int i = arrayOfByte1.length;
    checkUint8(i);
    byte[] arrayOfByte2 = new byte[4 + i];
    writeUint8((short)254, arrayOfByte2, 0);
    writeUint24(i, arrayOfByte2, 1);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 4, i);
    paramTlsHandshakeHash.update(arrayOfByte2, 0, arrayOfByte2.length);
  }
  
  static TlsCredentials establishClientCredentials(TlsAuthentication paramTlsAuthentication, CertificateRequest paramCertificateRequest) throws IOException {
    return validateCredentials(paramTlsAuthentication.getClientCredentials(paramCertificateRequest));
  }
  
  static TlsCredentialedSigner establish13ClientCredentials(TlsAuthentication paramTlsAuthentication, CertificateRequest paramCertificateRequest) throws IOException {
    return validate13Credentials(paramTlsAuthentication.getClientCredentials(paramCertificateRequest));
  }
  
  static void establishClientSigAlgs(SecurityParameters paramSecurityParameters, Hashtable paramHashtable) throws IOException {
    paramSecurityParameters.clientSigAlgs = TlsExtensionsUtils.getSignatureAlgorithmsExtension(paramHashtable);
    paramSecurityParameters.clientSigAlgsCert = TlsExtensionsUtils.getSignatureAlgorithmsCertExtension(paramHashtable);
  }
  
  static TlsCredentials establishServerCredentials(TlsServer paramTlsServer) throws IOException {
    return validateCredentials(paramTlsServer.getCredentials());
  }
  
  static TlsCredentialedSigner establish13ServerCredentials(TlsServer paramTlsServer) throws IOException {
    return validate13Credentials(paramTlsServer.getCredentials());
  }
  
  static void establishServerSigAlgs(SecurityParameters paramSecurityParameters, CertificateRequest paramCertificateRequest) throws IOException {
    paramSecurityParameters.clientCertTypes = paramCertificateRequest.getCertificateTypes();
    paramSecurityParameters.serverSigAlgs = paramCertificateRequest.getSupportedSignatureAlgorithms();
    paramSecurityParameters.serverSigAlgsCert = paramCertificateRequest.getSupportedSignatureAlgorithmsCert();
    if (null == paramSecurityParameters.getServerSigAlgsCert())
      paramSecurityParameters.serverSigAlgsCert = paramSecurityParameters.getServerSigAlgs(); 
  }
  
  static TlsCredentials validateCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    if (null != paramTlsCredentials) {
      int i = 0;
      i += (paramTlsCredentials instanceof TlsCredentialedAgreement) ? 1 : 0;
      i += (paramTlsCredentials instanceof TlsCredentialedDecryptor) ? 1 : 0;
      i += (paramTlsCredentials instanceof TlsCredentialedSigner) ? 1 : 0;
      if (i != 1)
        throw new TlsFatalAlert((short)80); 
    } 
    return paramTlsCredentials;
  }
  
  static TlsCredentialedSigner validate13Credentials(TlsCredentials paramTlsCredentials) throws IOException {
    if (null == paramTlsCredentials)
      return null; 
    if (!(paramTlsCredentials instanceof TlsCredentialedSigner))
      throw new TlsFatalAlert((short)80); 
    return (TlsCredentialedSigner)paramTlsCredentials;
  }
  
  static void negotiatedCipherSuite(SecurityParameters paramSecurityParameters, int paramInt) throws IOException {
    int j;
    paramSecurityParameters.cipherSuite = paramInt;
    paramSecurityParameters.keyExchangeAlgorithm = getKeyExchangeAlgorithm(paramInt);
    int i = getPRFAlgorithm(paramSecurityParameters, paramInt);
    paramSecurityParameters.prfAlgorithm = i;
    switch (i) {
      case 0:
      case 1:
        paramSecurityParameters.prfCryptoHashAlgorithm = -1;
        paramSecurityParameters.prfHashLength = -1;
        break;
      default:
        j = TlsCryptoUtils.getHashForPRF(i);
        paramSecurityParameters.prfCryptoHashAlgorithm = j;
        paramSecurityParameters.prfHashLength = TlsCryptoUtils.getHashOutputSize(j);
        break;
    } 
    ProtocolVersion protocolVersion = paramSecurityParameters.getNegotiatedVersion();
    if (isTLSv13(protocolVersion)) {
      paramSecurityParameters.verifyDataLength = paramSecurityParameters.getPRFHashLength();
    } else {
      paramSecurityParameters.verifyDataLength = protocolVersion.isSSL() ? 36 : 12;
    } 
  }
  
  static void negotiatedVersion(SecurityParameters paramSecurityParameters) throws IOException {
    if (!isSignatureAlgorithmsExtensionAllowed(paramSecurityParameters.getNegotiatedVersion())) {
      paramSecurityParameters.clientSigAlgs = null;
      paramSecurityParameters.clientSigAlgsCert = null;
      return;
    } 
    if (null == paramSecurityParameters.getClientSigAlgs())
      paramSecurityParameters.clientSigAlgs = getLegacySupportedSignatureAlgorithms(); 
    if (null == paramSecurityParameters.getClientSigAlgsCert())
      paramSecurityParameters.clientSigAlgsCert = paramSecurityParameters.getClientSigAlgs(); 
  }
  
  static void negotiatedVersionDTLSClient(TlsClientContext paramTlsClientContext, TlsClient paramTlsClient) throws IOException {
    SecurityParameters securityParameters = paramTlsClientContext.getSecurityParametersHandshake();
    ProtocolVersion protocolVersion = securityParameters.getNegotiatedVersion();
    if (!ProtocolVersion.isSupportedDTLSVersionClient(protocolVersion))
      throw new TlsFatalAlert((short)80); 
    negotiatedVersion(securityParameters);
    paramTlsClient.notifyServerVersion(protocolVersion);
  }
  
  static void negotiatedVersionDTLSServer(TlsServerContext paramTlsServerContext) throws IOException {
    SecurityParameters securityParameters = paramTlsServerContext.getSecurityParametersHandshake();
    ProtocolVersion protocolVersion = securityParameters.getNegotiatedVersion();
    if (!ProtocolVersion.isSupportedDTLSVersionServer(protocolVersion))
      throw new TlsFatalAlert((short)80); 
    negotiatedVersion(securityParameters);
  }
  
  static void negotiatedVersionTLSClient(TlsClientContext paramTlsClientContext, TlsClient paramTlsClient) throws IOException {
    SecurityParameters securityParameters = paramTlsClientContext.getSecurityParametersHandshake();
    ProtocolVersion protocolVersion = securityParameters.getNegotiatedVersion();
    if (!ProtocolVersion.isSupportedTLSVersionClient(protocolVersion))
      throw new TlsFatalAlert((short)80); 
    negotiatedVersion(securityParameters);
    paramTlsClient.notifyServerVersion(protocolVersion);
  }
  
  static void negotiatedVersionTLSServer(TlsServerContext paramTlsServerContext) throws IOException {
    SecurityParameters securityParameters = paramTlsServerContext.getSecurityParametersHandshake();
    ProtocolVersion protocolVersion = securityParameters.getNegotiatedVersion();
    if (!ProtocolVersion.isSupportedTLSVersionServer(protocolVersion))
      throw new TlsFatalAlert((short)80); 
    negotiatedVersion(securityParameters);
  }
  
  static TlsSecret deriveSecret(SecurityParameters paramSecurityParameters, TlsSecret paramTlsSecret, String paramString, byte[] paramArrayOfbyte) throws IOException {
    int i = paramSecurityParameters.getPRFCryptoHashAlgorithm();
    int j = paramSecurityParameters.getPRFHashLength();
    return deriveSecret(i, j, paramTlsSecret, paramString, paramArrayOfbyte);
  }
  
  static TlsSecret deriveSecret(int paramInt1, int paramInt2, TlsSecret paramTlsSecret, String paramString, byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte.length != paramInt2)
      throw new TlsFatalAlert((short)80); 
    return TlsCryptoUtils.hkdfExpandLabel(paramTlsSecret, paramInt1, paramString, paramArrayOfbyte, paramInt2);
  }
  
  static TlsSecret getSessionMasterSecret(TlsCrypto paramTlsCrypto, TlsSecret paramTlsSecret) {
    if (null != paramTlsSecret)
      synchronized (paramTlsSecret) {
        if (paramTlsSecret.isAlive())
          return paramTlsCrypto.adoptSecret(paramTlsSecret); 
      }  
    return null;
  }
  
  static boolean isPermittedExtensionType13(int paramInt1, int paramInt2) {
    switch (paramInt2) {
      case 0:
      case 1:
      case 10:
      case 14:
      case 15:
      case 16:
      case 19:
      case 20:
        switch (paramInt1) {
          case 1:
          case 8:
            return true;
        } 
        return false;
      case 5:
      case 18:
        switch (paramInt1) {
          case 1:
          case 11:
          case 13:
            return true;
        } 
        return false;
      case 13:
      case 27:
      case 47:
      case 50:
        switch (paramInt1) {
          case 1:
          case 13:
            return true;
        } 
        return false;
      case 21:
      case 45:
      case 49:
        switch (paramInt1) {
          case 1:
            return true;
        } 
        return false;
      case 43:
      case 51:
        switch (paramInt1) {
          case 1:
          case 2:
          case 6:
            return true;
        } 
        return false;
      case 41:
        switch (paramInt1) {
          case 1:
          case 2:
            return true;
        } 
        return false;
      case 42:
        switch (paramInt1) {
          case 1:
          case 4:
          case 8:
            return true;
        } 
        return false;
      case 44:
        switch (paramInt1) {
          case 1:
          case 6:
            return true;
        } 
        return false;
      case 48:
        switch (paramInt1) {
          case 13:
            return true;
        } 
        return false;
    } 
    return !ExtensionType.isRecognized(paramInt2);
  }
  
  static void checkExtensionData13(Hashtable paramHashtable, int paramInt, short paramShort) throws IOException {
    Enumeration<Integer> enumeration = paramHashtable.keys();
    while (enumeration.hasMoreElements()) {
      Integer integer = enumeration.nextElement();
      if (null == integer || !isPermittedExtensionType13(paramInt, integer.intValue()))
        throw new TlsFatalAlert(paramShort, "Invalid extension: " + ExtensionType.getText(integer.intValue())); 
    } 
  }
  
  public static TlsSecret generateEncryptedPreMasterSecret(TlsContext paramTlsContext, TlsEncryptor paramTlsEncryptor, OutputStream paramOutputStream) throws IOException {
    ProtocolVersion protocolVersion = paramTlsContext.getRSAPreMasterSecretVersion();
    TlsSecret tlsSecret = paramTlsContext.getCrypto().generateRSAPreMasterSecret(protocolVersion);
    byte[] arrayOfByte = tlsSecret.encrypt(paramTlsEncryptor);
    writeEncryptedPMS(paramTlsContext, arrayOfByte, paramOutputStream);
    return tlsSecret;
  }
  
  static void addPreSharedKeyToClientExtensions(TlsPSK[] paramArrayOfTlsPSK, Hashtable paramHashtable) throws IOException {
    Vector<PskIdentity> vector = new Vector(paramArrayOfTlsPSK.length);
    for (byte b = 0; b < paramArrayOfTlsPSK.length; b++) {
      TlsPSK tlsPSK = paramArrayOfTlsPSK[b];
      vector.add(new PskIdentity(tlsPSK.getIdentity(), 0L));
    } 
    TlsExtensionsUtils.addPreSharedKeyClientHello(paramHashtable, new OfferedPsks(vector));
  }
  
  static OfferedPsks.BindersConfig addPreSharedKeyToClientHello(TlsClientContext paramTlsClientContext, TlsClient paramTlsClient, Hashtable paramHashtable, int[] paramArrayOfint) throws IOException {
    if (!isTLSv13(paramTlsClientContext.getClientVersion()))
      return null; 
    TlsPSKExternal[] arrayOfTlsPSKExternal = getPSKExternalsClient(paramTlsClient, paramArrayOfint);
    if (null == arrayOfTlsPSKExternal)
      return null; 
    short[] arrayOfShort = paramTlsClient.getPskKeyExchangeModes();
    if (isNullOrEmpty(arrayOfShort))
      throw new TlsFatalAlert((short)80, "External PSKs configured but no PskKeyExchangeMode available"); 
    TlsSecret[] arrayOfTlsSecret = getPSKEarlySecrets(paramTlsClientContext.getCrypto(), (TlsPSK[])arrayOfTlsPSKExternal);
    int i = OfferedPsks.getBindersSize((TlsPSK[])arrayOfTlsPSKExternal);
    addPreSharedKeyToClientExtensions((TlsPSK[])arrayOfTlsPSKExternal, paramHashtable);
    TlsExtensionsUtils.addPSKKeyExchangeModesExtension(paramHashtable, arrayOfShort);
    return new OfferedPsks.BindersConfig((TlsPSK[])arrayOfTlsPSKExternal, arrayOfShort, arrayOfTlsSecret, i);
  }
  
  static OfferedPsks.BindersConfig addPreSharedKeyToClientHelloRetry(TlsClientContext paramTlsClientContext, OfferedPsks.BindersConfig paramBindersConfig, Hashtable paramHashtable) throws IOException {
    SecurityParameters securityParameters = paramTlsClientContext.getSecurityParametersHandshake();
    int i = getPRFAlgorithm13(securityParameters.getCipherSuite());
    Vector<Integer> vector = getPSKIndices(paramBindersConfig.psks, i);
    if (vector.isEmpty())
      return null; 
    OfferedPsks.BindersConfig bindersConfig = paramBindersConfig;
    int j = vector.size();
    if (j < paramBindersConfig.psks.length) {
      TlsPSK[] arrayOfTlsPSK = new TlsPSK[j];
      TlsSecret[] arrayOfTlsSecret = new TlsSecret[j];
      int k;
      for (k = 0; k < j; k++) {
        int m = ((Integer)vector.elementAt(k)).intValue();
        arrayOfTlsPSK[k] = paramBindersConfig.psks[m];
        arrayOfTlsSecret[k] = paramBindersConfig.earlySecrets[m];
      } 
      k = OfferedPsks.getBindersSize(arrayOfTlsPSK);
      bindersConfig = new OfferedPsks.BindersConfig(arrayOfTlsPSK, paramBindersConfig.pskKeyExchangeModes, arrayOfTlsSecret, k);
    } 
    addPreSharedKeyToClientExtensions(bindersConfig.psks, paramHashtable);
    return bindersConfig;
  }
  
  static OfferedPsks.SelectedConfig selectPreSharedKey(TlsServerContext paramTlsServerContext, TlsServer paramTlsServer, Hashtable paramHashtable, HandshakeMessageInput paramHandshakeMessageInput, TlsHandshakeHash paramTlsHandshakeHash, boolean paramBoolean) throws IOException {
    boolean bool = false;
    OfferedPsks offeredPsks = TlsExtensionsUtils.getPreSharedKeyClientHello(paramHashtable);
    if (null != offeredPsks) {
      short[] arrayOfShort = TlsExtensionsUtils.getPSKKeyExchangeModesExtension(paramHashtable);
      if (isNullOrEmpty(arrayOfShort))
        throw new TlsFatalAlert((short)109); 
      if (Arrays.contains(arrayOfShort, (short)1)) {
        TlsPSKExternal tlsPSKExternal = paramTlsServer.getExternalPSK(offeredPsks.getIdentities());
        if (null != tlsPSKExternal) {
          int i = offeredPsks.getIndexOfIdentity(new PskIdentity(tlsPSKExternal.getIdentity(), 0L));
          if (i >= 0) {
            byte[] arrayOfByte2;
            byte[] arrayOfByte1 = offeredPsks.getBinders().elementAt(i);
            TlsCrypto tlsCrypto = paramTlsServerContext.getCrypto();
            TlsSecret tlsSecret = getPSKEarlySecret(tlsCrypto, (TlsPSK)tlsPSKExternal);
            boolean bool1 = true;
            int j = TlsCryptoUtils.getHashForPRF(tlsPSKExternal.getPRFAlgorithm());
            bool = true;
            int k = offeredPsks.getBindersSize();
            paramHandshakeMessageInput.updateHashPrefix((TlsHash)paramTlsHandshakeHash, k);
            if (paramBoolean) {
              arrayOfByte2 = paramTlsHandshakeHash.getFinalHash(j);
            } else {
              TlsHash tlsHash = tlsCrypto.createHash(j);
              paramTlsHandshakeHash.copyBufferTo((OutputStream)new TlsHashOutputStream(tlsHash));
              arrayOfByte2 = tlsHash.calculateHash();
            } 
            paramHandshakeMessageInput.updateHashSuffix((TlsHash)paramTlsHandshakeHash, k);
            byte[] arrayOfByte3 = calculatePSKBinder(tlsCrypto, bool1, j, tlsSecret, arrayOfByte2);
            if (Arrays.constantTimeAreEqual(arrayOfByte3, arrayOfByte1))
              return new OfferedPsks.SelectedConfig(i, (TlsPSK)tlsPSKExternal, arrayOfShort, tlsSecret); 
          } 
        } 
      } 
    } 
    if (!bool)
      paramHandshakeMessageInput.updateHash((TlsHash)paramTlsHandshakeHash); 
    return null;
  }
  
  static TlsSecret getPSKEarlySecret(TlsCrypto paramTlsCrypto, TlsPSK paramTlsPSK) {
    int i = TlsCryptoUtils.getHashForPRF(paramTlsPSK.getPRFAlgorithm());
    return paramTlsCrypto.hkdfInit(i).hkdfExtract(i, paramTlsPSK.getKey());
  }
  
  static TlsSecret[] getPSKEarlySecrets(TlsCrypto paramTlsCrypto, TlsPSK[] paramArrayOfTlsPSK) {
    int i = paramArrayOfTlsPSK.length;
    TlsSecret[] arrayOfTlsSecret = new TlsSecret[i];
    for (byte b = 0; b < i; b++)
      arrayOfTlsSecret[b] = getPSKEarlySecret(paramTlsCrypto, paramArrayOfTlsPSK[b]); 
    return arrayOfTlsSecret;
  }
  
  static TlsPSKExternal[] getPSKExternalsClient(TlsClient paramTlsClient, int[] paramArrayOfint) throws IOException {
    Vector<Object> vector = paramTlsClient.getExternalPSKs();
    if (isNullOrEmpty(vector))
      return null; 
    int[] arrayOfInt = getPRFAlgorithms13(paramArrayOfint);
    int i = vector.size();
    TlsPSKExternal[] arrayOfTlsPSKExternal = new TlsPSKExternal[i];
    for (byte b = 0; b < i; b++) {
      TlsPSKExternal tlsPSKExternal1 = (TlsPSKExternal)vector.elementAt(b);
      if (!(tlsPSKExternal1 instanceof TlsPSKExternal))
        throw new TlsFatalAlert((short)80, "External PSKs element is not a TlsPSKExternal"); 
      TlsPSKExternal tlsPSKExternal2 = tlsPSKExternal1;
      if (!Arrays.contains(arrayOfInt, tlsPSKExternal2.getPRFAlgorithm()))
        throw new TlsFatalAlert((short)80, "External PSK incompatible with offered cipher suites"); 
      arrayOfTlsPSKExternal[b] = tlsPSKExternal2;
    } 
    return arrayOfTlsPSKExternal;
  }
  
  static Vector getPSKIndices(TlsPSK[] paramArrayOfTlsPSK, int paramInt) {
    Vector<Integer> vector = new Vector(paramArrayOfTlsPSK.length);
    for (byte b = 0; b < paramArrayOfTlsPSK.length; b++) {
      if (paramArrayOfTlsPSK[b].getPRFAlgorithm() == paramInt)
        vector.add(Integers.valueOf(b)); 
    } 
    return vector;
  }
  
  static short processMaxFragmentLengthExtension(Hashtable paramHashtable1, Hashtable paramHashtable2, short paramShort) throws IOException {
    short s = TlsExtensionsUtils.getMaxFragmentLengthExtension(paramHashtable2);
    if (s >= 0 && (!MaxFragmentLength.isValid(s) || (paramHashtable1 != null && s != TlsExtensionsUtils.getMaxFragmentLengthExtension(paramHashtable1))))
      throw new TlsFatalAlert(paramShort); 
    return s;
  }
  
  static short processClientCertificateTypeExtension(Hashtable paramHashtable1, Hashtable paramHashtable2, short paramShort) throws IOException {
    short s = TlsExtensionsUtils.getClientCertificateTypeExtensionServer(paramHashtable2);
    if (s < 0)
      return 0; 
    if (!CertificateType.isValid(s))
      throw new TlsFatalAlert(paramShort, "Unknown value for client_certificate_type"); 
    short[] arrayOfShort = TlsExtensionsUtils.getClientCertificateTypeExtensionClient(paramHashtable1);
    if (arrayOfShort == null || !contains(arrayOfShort, 0, arrayOfShort.length, s))
      throw new TlsFatalAlert(paramShort, "Invalid selection for client_certificate_type"); 
    return s;
  }
  
  static short processClientCertificateTypeExtension13(Hashtable paramHashtable1, Hashtable paramHashtable2, short paramShort) throws IOException {
    short s = processClientCertificateTypeExtension(paramHashtable1, paramHashtable2, paramShort);
    return validateCertificateType13(s, paramShort);
  }
  
  static short processServerCertificateTypeExtension(Hashtable paramHashtable1, Hashtable paramHashtable2, short paramShort) throws IOException {
    short s = TlsExtensionsUtils.getServerCertificateTypeExtensionServer(paramHashtable2);
    if (s < 0)
      return 0; 
    if (!CertificateType.isValid(s))
      throw new TlsFatalAlert(paramShort, "Unknown value for server_certificate_type"); 
    short[] arrayOfShort = TlsExtensionsUtils.getServerCertificateTypeExtensionClient(paramHashtable1);
    if (arrayOfShort == null || !contains(arrayOfShort, 0, arrayOfShort.length, s))
      throw new TlsFatalAlert(paramShort, "Invalid selection for server_certificate_type"); 
    return s;
  }
  
  static short processServerCertificateTypeExtension13(Hashtable paramHashtable1, Hashtable paramHashtable2, short paramShort) throws IOException {
    short s = processServerCertificateTypeExtension(paramHashtable1, paramHashtable2, paramShort);
    return validateCertificateType13(s, paramShort);
  }
  
  private static short validateCertificateType13(short paramShort1, short paramShort2) throws IOException {
    if (1 == paramShort1)
      throw new TlsFatalAlert(paramShort2, "The OpenPGP certificate type MUST NOT be used with TLS 1.3"); 
    return paramShort1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsUtils.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */