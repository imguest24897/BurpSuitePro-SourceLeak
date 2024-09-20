package META-INF.versions.9.org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.tls.CertificateStatusRequest;
import org.bouncycastle.tls.CertificateStatusRequestItemV2;
import org.bouncycastle.tls.HeartbeatExtension;
import org.bouncycastle.tls.KeyShareEntry;
import org.bouncycastle.tls.OfferedPsks;
import org.bouncycastle.tls.ProtocolName;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.ServerNameList;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsProtocol;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.TrustedAuthority;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;

public class TlsExtensionsUtils {
  public static final Integer EXT_application_layer_protocol_negotiation = Integers.valueOf(16);
  
  public static final Integer EXT_certificate_authorities = Integers.valueOf(47);
  
  public static final Integer EXT_client_certificate_type = Integers.valueOf(19);
  
  public static final Integer EXT_client_certificate_url = Integers.valueOf(2);
  
  public static final Integer EXT_compress_certificate = Integers.valueOf(27);
  
  public static final Integer EXT_connection_id = Integers.valueOf(54);
  
  public static final Integer EXT_cookie = Integers.valueOf(44);
  
  public static final Integer EXT_early_data = Integers.valueOf(42);
  
  public static final Integer EXT_ec_point_formats = Integers.valueOf(11);
  
  public static final Integer EXT_encrypt_then_mac = Integers.valueOf(22);
  
  public static final Integer EXT_extended_master_secret = Integers.valueOf(23);
  
  public static final Integer EXT_heartbeat = Integers.valueOf(15);
  
  public static final Integer EXT_key_share = Integers.valueOf(51);
  
  public static final Integer EXT_max_fragment_length = Integers.valueOf(1);
  
  public static final Integer EXT_oid_filters = Integers.valueOf(48);
  
  public static final Integer EXT_padding = Integers.valueOf(21);
  
  public static final Integer EXT_post_handshake_auth = Integers.valueOf(49);
  
  public static final Integer EXT_pre_shared_key = Integers.valueOf(41);
  
  public static final Integer EXT_psk_key_exchange_modes = Integers.valueOf(45);
  
  public static final Integer EXT_record_size_limit = Integers.valueOf(28);
  
  public static final Integer EXT_server_certificate_type = Integers.valueOf(20);
  
  public static final Integer EXT_server_name = Integers.valueOf(0);
  
  public static final Integer EXT_signature_algorithms = Integers.valueOf(13);
  
  public static final Integer EXT_signature_algorithms_cert = Integers.valueOf(50);
  
  public static final Integer EXT_status_request = Integers.valueOf(5);
  
  public static final Integer EXT_status_request_v2 = Integers.valueOf(17);
  
  public static final Integer EXT_supported_groups = Integers.valueOf(10);
  
  public static final Integer EXT_supported_versions = Integers.valueOf(43);
  
  public static final Integer EXT_truncated_hmac = Integers.valueOf(4);
  
  public static final Integer EXT_trusted_ca_keys = Integers.valueOf(3);
  
  public static Hashtable ensureExtensionsInitialised(Hashtable paramHashtable) {
    return (paramHashtable == null) ? new Hashtable<>() : paramHashtable;
  }
  
  public static void addALPNExtensionClient(Hashtable<Integer, byte[]> paramHashtable, Vector paramVector) throws IOException {
    paramHashtable.put(EXT_application_layer_protocol_negotiation, createALPNExtensionClient(paramVector));
  }
  
  public static void addALPNExtensionServer(Hashtable<Integer, byte[]> paramHashtable, ProtocolName paramProtocolName) throws IOException {
    paramHashtable.put(EXT_application_layer_protocol_negotiation, createALPNExtensionServer(paramProtocolName));
  }
  
  public static void addCertificateAuthoritiesExtension(Hashtable<Integer, byte[]> paramHashtable, Vector paramVector) throws IOException {
    paramHashtable.put(EXT_certificate_authorities, createCertificateAuthoritiesExtension(paramVector));
  }
  
  public static void addClientCertificateTypeExtensionClient(Hashtable<Integer, byte[]> paramHashtable, short[] paramArrayOfshort) throws IOException {
    paramHashtable.put(EXT_client_certificate_type, createCertificateTypeExtensionClient(paramArrayOfshort));
  }
  
  public static void addClientCertificateTypeExtensionServer(Hashtable<Integer, byte[]> paramHashtable, short paramShort) throws IOException {
    paramHashtable.put(EXT_client_certificate_type, createCertificateTypeExtensionServer(paramShort));
  }
  
  public static void addClientCertificateURLExtension(Hashtable<Integer, byte[]> paramHashtable) {
    paramHashtable.put(EXT_client_certificate_url, createClientCertificateURLExtension());
  }
  
  public static void addCompressCertificateExtension(Hashtable<Integer, byte[]> paramHashtable, int[] paramArrayOfint) throws IOException {
    paramHashtable.put(EXT_compress_certificate, createCompressCertificateExtension(paramArrayOfint));
  }
  
  public static void addConnectionIDExtension(Hashtable<Integer, byte[]> paramHashtable, byte[] paramArrayOfbyte) throws IOException {
    paramHashtable.put(EXT_connection_id, createConnectionIDExtension(paramArrayOfbyte));
  }
  
  public static void addCookieExtension(Hashtable<Integer, byte[]> paramHashtable, byte[] paramArrayOfbyte) throws IOException {
    paramHashtable.put(EXT_cookie, createCookieExtension(paramArrayOfbyte));
  }
  
  public static void addEarlyDataIndication(Hashtable<Integer, byte[]> paramHashtable) {
    paramHashtable.put(EXT_early_data, createEarlyDataIndication());
  }
  
  public static void addEarlyDataMaxSize(Hashtable<Integer, byte[]> paramHashtable, long paramLong) throws IOException {
    paramHashtable.put(EXT_early_data, createEarlyDataMaxSize(paramLong));
  }
  
  public static void addEmptyExtensionData(Hashtable<Integer, byte[]> paramHashtable, Integer paramInteger) {
    paramHashtable.put(paramInteger, createEmptyExtensionData());
  }
  
  public static void addEncryptThenMACExtension(Hashtable<Integer, byte[]> paramHashtable) {
    paramHashtable.put(EXT_encrypt_then_mac, createEncryptThenMACExtension());
  }
  
  public static void addExtendedMasterSecretExtension(Hashtable<Integer, byte[]> paramHashtable) {
    paramHashtable.put(EXT_extended_master_secret, createExtendedMasterSecretExtension());
  }
  
  public static void addHeartbeatExtension(Hashtable<Integer, byte[]> paramHashtable, HeartbeatExtension paramHeartbeatExtension) throws IOException {
    paramHashtable.put(EXT_heartbeat, createHeartbeatExtension(paramHeartbeatExtension));
  }
  
  public static void addKeyShareClientHello(Hashtable<Integer, byte[]> paramHashtable, Vector paramVector) throws IOException {
    paramHashtable.put(EXT_key_share, createKeyShareClientHello(paramVector));
  }
  
  public static void addKeyShareHelloRetryRequest(Hashtable<Integer, byte[]> paramHashtable, int paramInt) throws IOException {
    paramHashtable.put(EXT_key_share, createKeyShareHelloRetryRequest(paramInt));
  }
  
  public static void addKeyShareServerHello(Hashtable<Integer, byte[]> paramHashtable, KeyShareEntry paramKeyShareEntry) throws IOException {
    paramHashtable.put(EXT_key_share, createKeyShareServerHello(paramKeyShareEntry));
  }
  
  public static void addMaxFragmentLengthExtension(Hashtable<Integer, byte[]> paramHashtable, short paramShort) throws IOException {
    paramHashtable.put(EXT_max_fragment_length, createMaxFragmentLengthExtension(paramShort));
  }
  
  public static void addOIDFiltersExtension(Hashtable<Integer, byte[]> paramHashtable1, Hashtable paramHashtable2) throws IOException {
    paramHashtable1.put(EXT_oid_filters, createOIDFiltersExtension(paramHashtable2));
  }
  
  public static void addPaddingExtension(Hashtable<Integer, byte[]> paramHashtable, int paramInt) throws IOException {
    paramHashtable.put(EXT_padding, createPaddingExtension(paramInt));
  }
  
  public static void addPostHandshakeAuthExtension(Hashtable<Integer, byte[]> paramHashtable) {
    paramHashtable.put(EXT_post_handshake_auth, createPostHandshakeAuthExtension());
  }
  
  public static void addPreSharedKeyClientHello(Hashtable<Integer, byte[]> paramHashtable, OfferedPsks paramOfferedPsks) throws IOException {
    paramHashtable.put(EXT_pre_shared_key, createPreSharedKeyClientHello(paramOfferedPsks));
  }
  
  public static void addPreSharedKeyServerHello(Hashtable<Integer, byte[]> paramHashtable, int paramInt) throws IOException {
    paramHashtable.put(EXT_pre_shared_key, createPreSharedKeyServerHello(paramInt));
  }
  
  public static void addPSKKeyExchangeModesExtension(Hashtable<Integer, byte[]> paramHashtable, short[] paramArrayOfshort) throws IOException {
    paramHashtable.put(EXT_psk_key_exchange_modes, createPSKKeyExchangeModesExtension(paramArrayOfshort));
  }
  
  public static void addRecordSizeLimitExtension(Hashtable<Integer, byte[]> paramHashtable, int paramInt) throws IOException {
    paramHashtable.put(EXT_record_size_limit, createRecordSizeLimitExtension(paramInt));
  }
  
  public static void addServerCertificateTypeExtensionClient(Hashtable<Integer, byte[]> paramHashtable, short[] paramArrayOfshort) throws IOException {
    paramHashtable.put(EXT_server_certificate_type, createCertificateTypeExtensionClient(paramArrayOfshort));
  }
  
  public static void addServerCertificateTypeExtensionServer(Hashtable<Integer, byte[]> paramHashtable, short paramShort) throws IOException {
    paramHashtable.put(EXT_server_certificate_type, createCertificateTypeExtensionServer(paramShort));
  }
  
  public static void addServerNameExtensionClient(Hashtable<Integer, byte[]> paramHashtable, Vector paramVector) throws IOException {
    paramHashtable.put(EXT_server_name, createServerNameExtensionClient(paramVector));
  }
  
  public static void addServerNameExtensionServer(Hashtable<Integer, byte[]> paramHashtable) throws IOException {
    paramHashtable.put(EXT_server_name, createServerNameExtensionServer());
  }
  
  public static void addSignatureAlgorithmsExtension(Hashtable<Integer, byte[]> paramHashtable, Vector paramVector) throws IOException {
    paramHashtable.put(EXT_signature_algorithms, createSignatureAlgorithmsExtension(paramVector));
  }
  
  public static void addSignatureAlgorithmsCertExtension(Hashtable<Integer, byte[]> paramHashtable, Vector paramVector) throws IOException {
    paramHashtable.put(EXT_signature_algorithms_cert, createSignatureAlgorithmsCertExtension(paramVector));
  }
  
  public static void addStatusRequestExtension(Hashtable<Integer, byte[]> paramHashtable, CertificateStatusRequest paramCertificateStatusRequest) throws IOException {
    paramHashtable.put(EXT_status_request, createStatusRequestExtension(paramCertificateStatusRequest));
  }
  
  public static void addStatusRequestV2Extension(Hashtable<Integer, byte[]> paramHashtable, Vector paramVector) throws IOException {
    paramHashtable.put(EXT_status_request_v2, createStatusRequestV2Extension(paramVector));
  }
  
  public static void addSupportedGroupsExtension(Hashtable<Integer, byte[]> paramHashtable, Vector paramVector) throws IOException {
    paramHashtable.put(EXT_supported_groups, createSupportedGroupsExtension(paramVector));
  }
  
  public static void addSupportedPointFormatsExtension(Hashtable<Integer, byte[]> paramHashtable, short[] paramArrayOfshort) throws IOException {
    paramHashtable.put(EXT_ec_point_formats, createSupportedPointFormatsExtension(paramArrayOfshort));
  }
  
  public static void addSupportedVersionsExtensionClient(Hashtable<Integer, byte[]> paramHashtable, ProtocolVersion[] paramArrayOfProtocolVersion) throws IOException {
    paramHashtable.put(EXT_supported_versions, createSupportedVersionsExtensionClient(paramArrayOfProtocolVersion));
  }
  
  public static void addSupportedVersionsExtensionServer(Hashtable<Integer, byte[]> paramHashtable, ProtocolVersion paramProtocolVersion) throws IOException {
    paramHashtable.put(EXT_supported_versions, createSupportedVersionsExtensionServer(paramProtocolVersion));
  }
  
  public static void addTruncatedHMacExtension(Hashtable<Integer, byte[]> paramHashtable) {
    paramHashtable.put(EXT_truncated_hmac, createTruncatedHMacExtension());
  }
  
  public static void addTrustedCAKeysExtensionClient(Hashtable<Integer, byte[]> paramHashtable, Vector paramVector) throws IOException {
    paramHashtable.put(EXT_trusted_ca_keys, createTrustedCAKeysExtensionClient(paramVector));
  }
  
  public static void addTrustedCAKeysExtensionServer(Hashtable<Integer, byte[]> paramHashtable) {
    paramHashtable.put(EXT_trusted_ca_keys, createTrustedCAKeysExtensionServer());
  }
  
  public static Vector getALPNExtensionClient(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_application_layer_protocol_negotiation);
    return (arrayOfByte == null) ? null : readALPNExtensionClient(arrayOfByte);
  }
  
  public static ProtocolName getALPNExtensionServer(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_application_layer_protocol_negotiation);
    return (arrayOfByte == null) ? null : readALPNExtensionServer(arrayOfByte);
  }
  
  public static Vector getCertificateAuthoritiesExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_certificate_authorities);
    return (arrayOfByte == null) ? null : readCertificateAuthoritiesExtension(arrayOfByte);
  }
  
  public static short[] getClientCertificateTypeExtensionClient(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_client_certificate_type);
    return (arrayOfByte == null) ? null : readCertificateTypeExtensionClient(arrayOfByte);
  }
  
  public static short getClientCertificateTypeExtensionServer(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_client_certificate_type);
    return (arrayOfByte == null) ? -1 : readCertificateTypeExtensionServer(arrayOfByte);
  }
  
  public static short getClientCertificateTypeExtensionServer(Hashtable paramHashtable, short paramShort) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_client_certificate_type);
    return (arrayOfByte == null) ? paramShort : readCertificateTypeExtensionServer(arrayOfByte);
  }
  
  public static int[] getCompressCertificateExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_compress_certificate);
    return (arrayOfByte == null) ? null : readCompressCertificateExtension(arrayOfByte);
  }
  
  public static byte[] getConnectionIDExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_connection_id);
    return (arrayOfByte == null) ? null : readConnectionIDExtension(arrayOfByte);
  }
  
  public static byte[] getCookieExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_cookie);
    return (arrayOfByte == null) ? null : readCookieExtension(arrayOfByte);
  }
  
  public static long getEarlyDataMaxSize(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_early_data);
    return (arrayOfByte == null) ? -1L : readEarlyDataMaxSize(arrayOfByte);
  }
  
  public static HeartbeatExtension getHeartbeatExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_heartbeat);
    return (arrayOfByte == null) ? null : readHeartbeatExtension(arrayOfByte);
  }
  
  public static Vector getKeyShareClientHello(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_key_share);
    return (arrayOfByte == null) ? null : readKeyShareClientHello(arrayOfByte);
  }
  
  public static int getKeyShareHelloRetryRequest(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_key_share);
    return (arrayOfByte == null) ? -1 : readKeyShareHelloRetryRequest(arrayOfByte);
  }
  
  public static KeyShareEntry getKeyShareServerHello(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_key_share);
    return (arrayOfByte == null) ? null : readKeyShareServerHello(arrayOfByte);
  }
  
  public static short getMaxFragmentLengthExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_max_fragment_length);
    return (arrayOfByte == null) ? -1 : readMaxFragmentLengthExtension(arrayOfByte);
  }
  
  public static Hashtable getOIDFiltersExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_oid_filters);
    return (arrayOfByte == null) ? null : readOIDFiltersExtension(arrayOfByte);
  }
  
  public static int getPaddingExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_padding);
    return (arrayOfByte == null) ? -1 : readPaddingExtension(arrayOfByte);
  }
  
  public static OfferedPsks getPreSharedKeyClientHello(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_pre_shared_key);
    return (arrayOfByte == null) ? null : readPreSharedKeyClientHello(arrayOfByte);
  }
  
  public static int getPreSharedKeyServerHello(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_pre_shared_key);
    return (arrayOfByte == null) ? -1 : readPreSharedKeyServerHello(arrayOfByte);
  }
  
  public static short[] getPSKKeyExchangeModesExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_psk_key_exchange_modes);
    return (arrayOfByte == null) ? null : readPSKKeyExchangeModesExtension(arrayOfByte);
  }
  
  public static int getRecordSizeLimitExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_record_size_limit);
    return (arrayOfByte == null) ? -1 : readRecordSizeLimitExtension(arrayOfByte);
  }
  
  public static short[] getServerCertificateTypeExtensionClient(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_server_certificate_type);
    return (arrayOfByte == null) ? null : readCertificateTypeExtensionClient(arrayOfByte);
  }
  
  public static short getServerCertificateTypeExtensionServer(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_server_certificate_type);
    return (arrayOfByte == null) ? -1 : readCertificateTypeExtensionServer(arrayOfByte);
  }
  
  public static short getServerCertificateTypeExtensionServer(Hashtable paramHashtable, short paramShort) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_server_certificate_type);
    return (arrayOfByte == null) ? paramShort : readCertificateTypeExtensionServer(arrayOfByte);
  }
  
  public static Vector getServerNameExtensionClient(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_server_name);
    return (arrayOfByte == null) ? null : readServerNameExtensionClient(arrayOfByte);
  }
  
  public static Vector getSignatureAlgorithmsExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_signature_algorithms);
    return (arrayOfByte == null) ? null : readSignatureAlgorithmsExtension(arrayOfByte);
  }
  
  public static Vector getSignatureAlgorithmsCertExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_signature_algorithms_cert);
    return (arrayOfByte == null) ? null : readSignatureAlgorithmsCertExtension(arrayOfByte);
  }
  
  public static CertificateStatusRequest getStatusRequestExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_status_request);
    return (arrayOfByte == null) ? null : readStatusRequestExtension(arrayOfByte);
  }
  
  public static Vector getStatusRequestV2Extension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_status_request_v2);
    return (arrayOfByte == null) ? null : readStatusRequestV2Extension(arrayOfByte);
  }
  
  public static int[] getSupportedGroupsExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_supported_groups);
    return (arrayOfByte == null) ? null : readSupportedGroupsExtension(arrayOfByte);
  }
  
  public static short[] getSupportedPointFormatsExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_ec_point_formats);
    return (arrayOfByte == null) ? null : readSupportedPointFormatsExtension(arrayOfByte);
  }
  
  public static ProtocolVersion[] getSupportedVersionsExtensionClient(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_supported_versions);
    return (arrayOfByte == null) ? null : readSupportedVersionsExtensionClient(arrayOfByte);
  }
  
  public static ProtocolVersion getSupportedVersionsExtensionServer(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_supported_versions);
    return (arrayOfByte == null) ? null : readSupportedVersionsExtensionServer(arrayOfByte);
  }
  
  public static Vector getTrustedCAKeysExtensionClient(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_trusted_ca_keys);
    return (arrayOfByte == null) ? null : readTrustedCAKeysExtensionClient(arrayOfByte);
  }
  
  public static boolean hasClientCertificateURLExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_client_certificate_url);
    return (arrayOfByte == null) ? false : readClientCertificateURLExtension(arrayOfByte);
  }
  
  public static boolean hasEarlyDataIndication(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_early_data);
    return (arrayOfByte == null) ? false : readEarlyDataIndication(arrayOfByte);
  }
  
  public static boolean hasEncryptThenMACExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_encrypt_then_mac);
    return (arrayOfByte == null) ? false : readEncryptThenMACExtension(arrayOfByte);
  }
  
  public static boolean hasExtendedMasterSecretExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_extended_master_secret);
    return (arrayOfByte == null) ? false : readExtendedMasterSecretExtension(arrayOfByte);
  }
  
  public static boolean hasServerNameExtensionServer(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_server_name);
    return (arrayOfByte == null) ? false : readServerNameExtensionServer(arrayOfByte);
  }
  
  public static boolean hasPostHandshakeAuthExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_post_handshake_auth);
    return (arrayOfByte == null) ? false : readPostHandshakeAuthExtension(arrayOfByte);
  }
  
  public static boolean hasTruncatedHMacExtension(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_truncated_hmac);
    return (arrayOfByte == null) ? false : readTruncatedHMacExtension(arrayOfByte);
  }
  
  public static boolean hasTrustedCAKeysExtensionServer(Hashtable paramHashtable) throws IOException {
    byte[] arrayOfByte = TlsUtils.getExtensionData(paramHashtable, EXT_trusted_ca_keys);
    return (arrayOfByte == null) ? false : readTrustedCAKeysExtensionServer(arrayOfByte);
  }
  
  public static byte[] createALPNExtensionClient(Vector<ProtocolName> paramVector) throws IOException {
    if (paramVector == null || paramVector.size() < 1)
      throw new TlsFatalAlert((short)80); 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    TlsUtils.writeUint16(0, byteArrayOutputStream);
    for (byte b = 0; b < paramVector.size(); b++) {
      ProtocolName protocolName = paramVector.elementAt(b);
      protocolName.encode(byteArrayOutputStream);
    } 
    return patchOpaque16(byteArrayOutputStream);
  }
  
  public static byte[] createALPNExtensionServer(ProtocolName paramProtocolName) throws IOException {
    Vector<ProtocolName> vector = new Vector();
    vector.addElement(paramProtocolName);
    return createALPNExtensionClient(vector);
  }
  
  public static byte[] createCertificateAuthoritiesExtension(Vector<X500Name> paramVector) throws IOException {
    if (null == paramVector || paramVector.isEmpty())
      throw new TlsFatalAlert((short)80); 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    TlsUtils.writeUint16(0, byteArrayOutputStream);
    for (byte b = 0; b < paramVector.size(); b++) {
      X500Name x500Name = paramVector.elementAt(b);
      byte[] arrayOfByte = x500Name.getEncoded("DER");
      TlsUtils.writeOpaque16(arrayOfByte, byteArrayOutputStream);
    } 
    return patchOpaque16(byteArrayOutputStream);
  }
  
  public static byte[] createCertificateTypeExtensionClient(short[] paramArrayOfshort) throws IOException {
    if (TlsUtils.isNullOrEmpty(paramArrayOfshort) || paramArrayOfshort.length > 255)
      throw new TlsFatalAlert((short)80); 
    return TlsUtils.encodeUint8ArrayWithUint8Length(paramArrayOfshort);
  }
  
  public static byte[] createCertificateTypeExtensionServer(short paramShort) throws IOException {
    return TlsUtils.encodeUint8(paramShort);
  }
  
  public static byte[] createClientCertificateURLExtension() {
    return createEmptyExtensionData();
  }
  
  public static byte[] createCompressCertificateExtension(int[] paramArrayOfint) throws IOException {
    if (TlsUtils.isNullOrEmpty(paramArrayOfint) || paramArrayOfint.length > 127)
      throw new TlsFatalAlert((short)80); 
    return TlsUtils.encodeUint16ArrayWithUint8Length(paramArrayOfint);
  }
  
  public static byte[] createConnectionIDExtension(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new TlsFatalAlert((short)80); 
    return TlsUtils.encodeOpaque8(paramArrayOfbyte);
  }
  
  public static byte[] createCookieExtension(byte[] paramArrayOfbyte) throws IOException {
    if (TlsUtils.isNullOrEmpty(paramArrayOfbyte) || paramArrayOfbyte.length >= 65536)
      throw new TlsFatalAlert((short)80); 
    return TlsUtils.encodeOpaque16(paramArrayOfbyte);
  }
  
  public static byte[] createEarlyDataIndication() {
    return createEmptyExtensionData();
  }
  
  public static byte[] createEarlyDataMaxSize(long paramLong) throws IOException {
    return TlsUtils.encodeUint32(paramLong);
  }
  
  public static byte[] createEmptyExtensionData() {
    return TlsUtils.EMPTY_BYTES;
  }
  
  public static byte[] createEncryptThenMACExtension() {
    return createEmptyExtensionData();
  }
  
  public static byte[] createExtendedMasterSecretExtension() {
    return createEmptyExtensionData();
  }
  
  public static byte[] createHeartbeatExtension(HeartbeatExtension paramHeartbeatExtension) throws IOException {
    if (paramHeartbeatExtension == null)
      throw new TlsFatalAlert((short)80); 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    paramHeartbeatExtension.encode(byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  public static byte[] createKeyShareClientHello(Vector<KeyShareEntry> paramVector) throws IOException {
    if (paramVector == null || paramVector.isEmpty())
      return TlsUtils.encodeUint16(0); 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    TlsUtils.writeUint16(0, byteArrayOutputStream);
    for (byte b = 0; b < paramVector.size(); b++) {
      KeyShareEntry keyShareEntry = paramVector.elementAt(b);
      keyShareEntry.encode(byteArrayOutputStream);
    } 
    return patchOpaque16(byteArrayOutputStream);
  }
  
  public static byte[] createKeyShareHelloRetryRequest(int paramInt) throws IOException {
    return TlsUtils.encodeUint16(paramInt);
  }
  
  public static byte[] createKeyShareServerHello(KeyShareEntry paramKeyShareEntry) throws IOException {
    if (paramKeyShareEntry == null)
      throw new TlsFatalAlert((short)80); 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    paramKeyShareEntry.encode(byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  public static byte[] createMaxFragmentLengthExtension(short paramShort) throws IOException {
    return TlsUtils.encodeUint8(paramShort);
  }
  
  public static byte[] createOIDFiltersExtension(Hashtable paramHashtable) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    TlsUtils.writeUint16(0, byteArrayOutputStream);
    if (null != paramHashtable) {
      Enumeration<ASN1ObjectIdentifier> enumeration = paramHashtable.keys();
      while (enumeration.hasMoreElements()) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = enumeration.nextElement();
        byte[] arrayOfByte1 = (byte[])paramHashtable.get(aSN1ObjectIdentifier);
        if (null == aSN1ObjectIdentifier || null == arrayOfByte1)
          throw new TlsFatalAlert((short)80); 
        byte[] arrayOfByte2 = aSN1ObjectIdentifier.getEncoded("DER");
        TlsUtils.writeOpaque8(arrayOfByte2, byteArrayOutputStream);
        TlsUtils.writeOpaque16(arrayOfByte1, byteArrayOutputStream);
      } 
    } 
    return patchOpaque16(byteArrayOutputStream);
  }
  
  public static byte[] createPaddingExtension(int paramInt) throws IOException {
    TlsUtils.checkUint16(paramInt);
    return new byte[paramInt];
  }
  
  public static byte[] createPostHandshakeAuthExtension() {
    return createEmptyExtensionData();
  }
  
  public static byte[] createPreSharedKeyClientHello(OfferedPsks paramOfferedPsks) throws IOException {
    if (paramOfferedPsks == null)
      throw new TlsFatalAlert((short)80); 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    paramOfferedPsks.encode(byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  public static byte[] createPreSharedKeyServerHello(int paramInt) throws IOException {
    return TlsUtils.encodeUint16(paramInt);
  }
  
  public static byte[] createPSKKeyExchangeModesExtension(short[] paramArrayOfshort) throws IOException {
    if (TlsUtils.isNullOrEmpty(paramArrayOfshort) || paramArrayOfshort.length > 255)
      throw new TlsFatalAlert((short)80); 
    return TlsUtils.encodeUint8ArrayWithUint8Length(paramArrayOfshort);
  }
  
  public static byte[] createRecordSizeLimitExtension(int paramInt) throws IOException {
    if (paramInt < 64)
      throw new TlsFatalAlert((short)80); 
    return TlsUtils.encodeUint16(paramInt);
  }
  
  public static byte[] createServerNameExtensionClient(Vector paramVector) throws IOException {
    if (paramVector == null)
      throw new TlsFatalAlert((short)80); 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    (new ServerNameList(paramVector)).encode(byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  public static byte[] createServerNameExtensionServer() {
    return createEmptyExtensionData();
  }
  
  public static byte[] createSignatureAlgorithmsExtension(Vector paramVector) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    TlsUtils.encodeSupportedSignatureAlgorithms(paramVector, byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  public static byte[] createSignatureAlgorithmsCertExtension(Vector paramVector) throws IOException {
    return createSignatureAlgorithmsExtension(paramVector);
  }
  
  public static byte[] createStatusRequestExtension(CertificateStatusRequest paramCertificateStatusRequest) throws IOException {
    if (paramCertificateStatusRequest == null)
      throw new TlsFatalAlert((short)80); 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    paramCertificateStatusRequest.encode(byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  public static byte[] createStatusRequestV2Extension(Vector<CertificateStatusRequestItemV2> paramVector) throws IOException {
    if (paramVector == null || paramVector.isEmpty())
      throw new TlsFatalAlert((short)80); 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    TlsUtils.writeUint16(0, byteArrayOutputStream);
    for (byte b = 0; b < paramVector.size(); b++) {
      CertificateStatusRequestItemV2 certificateStatusRequestItemV2 = paramVector.elementAt(b);
      certificateStatusRequestItemV2.encode(byteArrayOutputStream);
    } 
    return patchOpaque16(byteArrayOutputStream);
  }
  
  public static byte[] createSupportedGroupsExtension(Vector paramVector) throws IOException {
    if (paramVector == null || paramVector.isEmpty())
      throw new TlsFatalAlert((short)80); 
    int i = paramVector.size();
    int[] arrayOfInt = new int[i];
    for (byte b = 0; b < i; b++)
      arrayOfInt[b] = ((Integer)paramVector.elementAt(b)).intValue(); 
    return TlsUtils.encodeUint16ArrayWithUint16Length(arrayOfInt);
  }
  
  public static byte[] createSupportedPointFormatsExtension(short[] paramArrayOfshort) throws IOException {
    if (paramArrayOfshort == null || !Arrays.contains(paramArrayOfshort, (short)0))
      paramArrayOfshort = Arrays.prepend(paramArrayOfshort, (short)0); 
    return TlsUtils.encodeUint8ArrayWithUint8Length(paramArrayOfshort);
  }
  
  public static byte[] createSupportedVersionsExtensionClient(ProtocolVersion[] paramArrayOfProtocolVersion) throws IOException {
    if (TlsUtils.isNullOrEmpty((Object[])paramArrayOfProtocolVersion) || paramArrayOfProtocolVersion.length > 127)
      throw new TlsFatalAlert((short)80); 
    int i = paramArrayOfProtocolVersion.length;
    byte[] arrayOfByte = new byte[1 + i * 2];
    TlsUtils.writeUint8(i * 2, arrayOfByte, 0);
    for (byte b = 0; b < i; b++)
      TlsUtils.writeVersion(paramArrayOfProtocolVersion[b], arrayOfByte, 1 + b * 2); 
    return arrayOfByte;
  }
  
  public static byte[] createSupportedVersionsExtensionServer(ProtocolVersion paramProtocolVersion) throws IOException {
    return TlsUtils.encodeVersion(paramProtocolVersion);
  }
  
  public static byte[] createTruncatedHMacExtension() {
    return createEmptyExtensionData();
  }
  
  public static byte[] createTrustedCAKeysExtensionClient(Vector<TrustedAuthority> paramVector) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    TlsUtils.writeUint16(0, byteArrayOutputStream);
    if (paramVector != null)
      for (byte b = 0; b < paramVector.size(); b++) {
        TrustedAuthority trustedAuthority = paramVector.elementAt(b);
        trustedAuthority.encode(byteArrayOutputStream);
      }  
    return patchOpaque16(byteArrayOutputStream);
  }
  
  public static byte[] createTrustedCAKeysExtensionServer() {
    return createEmptyExtensionData();
  }
  
  private static boolean readEmptyExtensionData(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    if (paramArrayOfbyte.length != 0)
      throw new TlsFatalAlert((short)47); 
    return true;
  }
  
  public static Vector readALPNExtensionClient(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    int i = TlsUtils.readUint16(byteArrayInputStream);
    if (i != paramArrayOfbyte.length - 2)
      throw new TlsFatalAlert((short)50); 
    Vector<ProtocolName> vector = new Vector();
    while (byteArrayInputStream.available() > 0) {
      ProtocolName protocolName = ProtocolName.parse(byteArrayInputStream);
      vector.addElement(protocolName);
    } 
    return vector;
  }
  
  public static ProtocolName readALPNExtensionServer(byte[] paramArrayOfbyte) throws IOException {
    Vector<ProtocolName> vector = readALPNExtensionClient(paramArrayOfbyte);
    if (vector.size() != 1)
      throw new TlsFatalAlert((short)50); 
    return vector.elementAt(0);
  }
  
  public static Vector readCertificateAuthoritiesExtension(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    if (paramArrayOfbyte.length < 5)
      throw new TlsFatalAlert((short)50); 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    int i = TlsUtils.readUint16(byteArrayInputStream);
    if (i != paramArrayOfbyte.length - 2)
      throw new TlsFatalAlert((short)50); 
    Vector<X500Name> vector = new Vector();
    while (byteArrayInputStream.available() > 0) {
      byte[] arrayOfByte = TlsUtils.readOpaque16(byteArrayInputStream, 1);
      ASN1Primitive aSN1Primitive = TlsUtils.readASN1Object(arrayOfByte);
      X500Name x500Name = X500Name.getInstance(aSN1Primitive);
      TlsUtils.requireDEREncoding((ASN1Object)x500Name, arrayOfByte);
      vector.addElement(x500Name);
    } 
    return vector;
  }
  
  public static short[] readCertificateTypeExtensionClient(byte[] paramArrayOfbyte) throws IOException {
    short[] arrayOfShort = TlsUtils.decodeUint8ArrayWithUint8Length(paramArrayOfbyte);
    if (arrayOfShort.length < 1)
      throw new TlsFatalAlert((short)50); 
    return arrayOfShort;
  }
  
  public static short readCertificateTypeExtensionServer(byte[] paramArrayOfbyte) throws IOException {
    return TlsUtils.decodeUint8(paramArrayOfbyte);
  }
  
  public static boolean readClientCertificateURLExtension(byte[] paramArrayOfbyte) throws IOException {
    return readEmptyExtensionData(paramArrayOfbyte);
  }
  
  public static int[] readCompressCertificateExtension(byte[] paramArrayOfbyte) throws IOException {
    int[] arrayOfInt = TlsUtils.decodeUint16ArrayWithUint8Length(paramArrayOfbyte);
    if (arrayOfInt.length < 1)
      throw new TlsFatalAlert((short)50); 
    return arrayOfInt;
  }
  
  public static byte[] readConnectionIDExtension(byte[] paramArrayOfbyte) throws IOException {
    return TlsUtils.decodeOpaque8(paramArrayOfbyte);
  }
  
  public static byte[] readCookieExtension(byte[] paramArrayOfbyte) throws IOException {
    return TlsUtils.decodeOpaque16(paramArrayOfbyte, 1);
  }
  
  public static boolean readEarlyDataIndication(byte[] paramArrayOfbyte) throws IOException {
    return readEmptyExtensionData(paramArrayOfbyte);
  }
  
  public static long readEarlyDataMaxSize(byte[] paramArrayOfbyte) throws IOException {
    return TlsUtils.decodeUint32(paramArrayOfbyte);
  }
  
  public static boolean readEncryptThenMACExtension(byte[] paramArrayOfbyte) throws IOException {
    return readEmptyExtensionData(paramArrayOfbyte);
  }
  
  public static boolean readExtendedMasterSecretExtension(byte[] paramArrayOfbyte) throws IOException {
    return readEmptyExtensionData(paramArrayOfbyte);
  }
  
  public static HeartbeatExtension readHeartbeatExtension(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    HeartbeatExtension heartbeatExtension = HeartbeatExtension.parse(byteArrayInputStream);
    TlsProtocol.assertEmpty(byteArrayInputStream);
    return heartbeatExtension;
  }
  
  public static Vector readKeyShareClientHello(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    int i = TlsUtils.readUint16(byteArrayInputStream);
    if (i != paramArrayOfbyte.length - 2)
      throw new TlsFatalAlert((short)50); 
    Vector<KeyShareEntry> vector = new Vector();
    while (byteArrayInputStream.available() > 0) {
      KeyShareEntry keyShareEntry = KeyShareEntry.parse(byteArrayInputStream);
      vector.addElement(keyShareEntry);
    } 
    return vector;
  }
  
  public static int readKeyShareHelloRetryRequest(byte[] paramArrayOfbyte) throws IOException {
    return TlsUtils.decodeUint16(paramArrayOfbyte);
  }
  
  public static KeyShareEntry readKeyShareServerHello(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    KeyShareEntry keyShareEntry = KeyShareEntry.parse(byteArrayInputStream);
    TlsProtocol.assertEmpty(byteArrayInputStream);
    return keyShareEntry;
  }
  
  public static short readMaxFragmentLengthExtension(byte[] paramArrayOfbyte) throws IOException {
    return TlsUtils.decodeUint8(paramArrayOfbyte);
  }
  
  public static Hashtable readOIDFiltersExtension(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    if (paramArrayOfbyte.length < 2)
      throw new TlsFatalAlert((short)50); 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    int i = TlsUtils.readUint16(byteArrayInputStream);
    if (i != paramArrayOfbyte.length - 2)
      throw new TlsFatalAlert((short)50); 
    Hashtable<Object, Object> hashtable = new Hashtable<>();
    while (byteArrayInputStream.available() > 0) {
      byte[] arrayOfByte1 = TlsUtils.readOpaque8(byteArrayInputStream, 1);
      ASN1Primitive aSN1Primitive = TlsUtils.readASN1Object(arrayOfByte1);
      ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Primitive);
      TlsUtils.requireDEREncoding((ASN1Object)aSN1ObjectIdentifier, arrayOfByte1);
      if (hashtable.containsKey(aSN1ObjectIdentifier))
        throw new TlsFatalAlert((short)47); 
      byte[] arrayOfByte2 = TlsUtils.readOpaque16(byteArrayInputStream);
      hashtable.put(aSN1ObjectIdentifier, arrayOfByte2);
    } 
    return hashtable;
  }
  
  public static int readPaddingExtension(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    int i = 0;
    for (byte b = 0; b < paramArrayOfbyte.length; b++)
      i |= paramArrayOfbyte[b]; 
    if (i != 0)
      throw new TlsFatalAlert((short)47); 
    return paramArrayOfbyte.length;
  }
  
  public static boolean readPostHandshakeAuthExtension(byte[] paramArrayOfbyte) throws IOException {
    return readEmptyExtensionData(paramArrayOfbyte);
  }
  
  public static OfferedPsks readPreSharedKeyClientHello(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    OfferedPsks offeredPsks = OfferedPsks.parse(byteArrayInputStream);
    TlsProtocol.assertEmpty(byteArrayInputStream);
    return offeredPsks;
  }
  
  public static int readPreSharedKeyServerHello(byte[] paramArrayOfbyte) throws IOException {
    return TlsUtils.decodeUint16(paramArrayOfbyte);
  }
  
  public static short[] readPSKKeyExchangeModesExtension(byte[] paramArrayOfbyte) throws IOException {
    short[] arrayOfShort = TlsUtils.decodeUint8ArrayWithUint8Length(paramArrayOfbyte);
    if (arrayOfShort.length < 1)
      throw new TlsFatalAlert((short)50); 
    return arrayOfShort;
  }
  
  public static int readRecordSizeLimitExtension(byte[] paramArrayOfbyte) throws IOException {
    int i = TlsUtils.decodeUint16(paramArrayOfbyte);
    if (i < 64)
      throw new TlsFatalAlert((short)47); 
    return i;
  }
  
  public static Vector readServerNameExtensionClient(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    ServerNameList serverNameList = ServerNameList.parse(byteArrayInputStream);
    TlsProtocol.assertEmpty(byteArrayInputStream);
    return serverNameList.getServerNameList();
  }
  
  public static boolean readServerNameExtensionServer(byte[] paramArrayOfbyte) throws IOException {
    return readEmptyExtensionData(paramArrayOfbyte);
  }
  
  public static Vector readSignatureAlgorithmsExtension(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    Vector vector = TlsUtils.parseSupportedSignatureAlgorithms(byteArrayInputStream);
    TlsProtocol.assertEmpty(byteArrayInputStream);
    return vector;
  }
  
  public static Vector readSignatureAlgorithmsCertExtension(byte[] paramArrayOfbyte) throws IOException {
    return readSignatureAlgorithmsExtension(paramArrayOfbyte);
  }
  
  public static CertificateStatusRequest readStatusRequestExtension(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    CertificateStatusRequest certificateStatusRequest = CertificateStatusRequest.parse(byteArrayInputStream);
    TlsProtocol.assertEmpty(byteArrayInputStream);
    return certificateStatusRequest;
  }
  
  public static Vector readStatusRequestV2Extension(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    if (paramArrayOfbyte.length < 3)
      throw new TlsFatalAlert((short)50); 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    int i = TlsUtils.readUint16(byteArrayInputStream);
    if (i != paramArrayOfbyte.length - 2)
      throw new TlsFatalAlert((short)50); 
    Vector<CertificateStatusRequestItemV2> vector = new Vector();
    while (byteArrayInputStream.available() > 0) {
      CertificateStatusRequestItemV2 certificateStatusRequestItemV2 = CertificateStatusRequestItemV2.parse(byteArrayInputStream);
      vector.add(certificateStatusRequestItemV2);
    } 
    return vector;
  }
  
  public static int[] readSupportedGroupsExtension(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    int i = TlsUtils.readUint16(byteArrayInputStream);
    if (i < 2 || (i & 0x1) != 0)
      throw new TlsFatalAlert((short)50); 
    int[] arrayOfInt = TlsUtils.readUint16Array(i / 2, byteArrayInputStream);
    TlsProtocol.assertEmpty(byteArrayInputStream);
    return arrayOfInt;
  }
  
  public static short[] readSupportedPointFormatsExtension(byte[] paramArrayOfbyte) throws IOException {
    short[] arrayOfShort = TlsUtils.decodeUint8ArrayWithUint8Length(paramArrayOfbyte);
    if (!Arrays.contains(arrayOfShort, (short)0))
      throw new TlsFatalAlert((short)47); 
    return arrayOfShort;
  }
  
  public static ProtocolVersion[] readSupportedVersionsExtensionClient(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    if (paramArrayOfbyte.length < 3 || paramArrayOfbyte.length > 255 || (paramArrayOfbyte.length & 0x1) == 0)
      throw new TlsFatalAlert((short)50); 
    short s = TlsUtils.readUint8(paramArrayOfbyte, 0);
    if (s != paramArrayOfbyte.length - 1)
      throw new TlsFatalAlert((short)50); 
    int i = s / 2;
    ProtocolVersion[] arrayOfProtocolVersion = new ProtocolVersion[i];
    for (byte b = 0; b < i; b++)
      arrayOfProtocolVersion[b] = TlsUtils.readVersion(paramArrayOfbyte, 1 + b * 2); 
    return arrayOfProtocolVersion;
  }
  
  public static ProtocolVersion readSupportedVersionsExtensionServer(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    if (paramArrayOfbyte.length != 2)
      throw new TlsFatalAlert((short)50); 
    return TlsUtils.readVersion(paramArrayOfbyte, 0);
  }
  
  public static boolean readTruncatedHMacExtension(byte[] paramArrayOfbyte) throws IOException {
    return readEmptyExtensionData(paramArrayOfbyte);
  }
  
  public static Vector readTrustedCAKeysExtensionClient(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'extensionData' cannot be null"); 
    if (paramArrayOfbyte.length < 2)
      throw new TlsFatalAlert((short)50); 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    int i = TlsUtils.readUint16(byteArrayInputStream);
    if (i != paramArrayOfbyte.length - 2)
      throw new TlsFatalAlert((short)50); 
    Vector<TrustedAuthority> vector = new Vector();
    while (byteArrayInputStream.available() > 0) {
      TrustedAuthority trustedAuthority = TrustedAuthority.parse(byteArrayInputStream);
      vector.addElement(trustedAuthority);
    } 
    return vector;
  }
  
  public static boolean readTrustedCAKeysExtensionServer(byte[] paramArrayOfbyte) throws IOException {
    return readEmptyExtensionData(paramArrayOfbyte);
  }
  
  private static byte[] patchOpaque16(ByteArrayOutputStream paramByteArrayOutputStream) throws IOException {
    int i = paramByteArrayOutputStream.size() - 2;
    TlsUtils.checkUint16(i);
    byte[] arrayOfByte = paramByteArrayOutputStream.toByteArray();
    TlsUtils.writeUint16(i, arrayOfByte, 0);
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsExtensionsUtils.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */