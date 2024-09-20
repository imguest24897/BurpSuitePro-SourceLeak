package org.bouncycastle.oer.its.template.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.oer.OERDefinition;

public class Ieee1609Dot2BaseTypes {
  public static final OERDefinition.Builder UINT3 = OERDefinition.integer(0L, 7L).typeName("UINT3");
  
  public static final OERDefinition.Builder UINT8 = OERDefinition.integer(0L, 255L).typeName("UINT8");
  
  public static final OERDefinition.Builder UINT16 = OERDefinition.integer(0L, 65535L).typeName("UINT16");
  
  public static final OERDefinition.Builder UINT32 = OERDefinition.integer(0L, 4294967295L).typeName("UINT32");
  
  public static final OERDefinition.Builder UINT64 = OERDefinition.integer(BigInteger.ZERO, new BigInteger("18446744073709551615")).typeName("UINT64");
  
  public static final OERDefinition.Builder SequenceOfUint16 = OERDefinition.seqof(new Object[] { UINT16 }).typeName("SequenceOfUint16");
  
  public static final OERDefinition.Builder SequenceOfUint8 = OERDefinition.seqof(new Object[] { UINT8 }).typeName("SequenceOfUint8");
  
  public static final OERDefinition.Builder HashedId3 = OERDefinition.octets(3).typeName("HashedId3");
  
  public static final OERDefinition.Builder HashedId8 = OERDefinition.octets(8).typeName("HashedId8");
  
  public static final OERDefinition.Builder HashedId10 = OERDefinition.octets(10).typeName("HashedId10");
  
  public static final OERDefinition.Builder HashedId32 = OERDefinition.octets(32).typeName("HashedId32");
  
  public static final OERDefinition.Builder SequenceOfHashedId3 = OERDefinition.seqof(new Object[] { HashedId3 }).typeName("SequenceOfHashedId3");
  
  public static final OERDefinition.Builder SequenceOfHashedId8 = OERDefinition.seqof(new Object[] { HashedId8 }).typeName("SequenceOfHashedId8");
  
  public static final OERDefinition.Builder Time32 = UINT32.typeName("Time32");
  
  public static final OERDefinition.Builder Time64 = UINT64.typeName("Time64");
  
  public static final OERDefinition.Builder Duration = OERDefinition.choice(new Object[] { UINT16.label("microseconds"), UINT16.label("milliseconds"), UINT16.label("seconds"), UINT16.label("minutes"), UINT16.label("hours"), UINT16.label("sixtyHours"), UINT16.label("years") }).typeName("Duration");
  
  public static final OERDefinition.Builder ValidityPeriod = OERDefinition.seq(new Object[] { Time32.label("start"), Duration.label("duration") }).typeName("ValidityPeriod");
  
  public static final OERDefinition.Builder IValue = UINT16.copy().typeName("IValue");
  
  public static final OERDefinition.Builder Hostname = OERDefinition.utf8String(0, 255).typeName("Hostname");
  
  public static final OERDefinition.Builder LinkageValue = OERDefinition.octets(9).typeName("LinkageValue");
  
  public static final OERDefinition.Builder GroupLinkageValue = OERDefinition.seq(new Object[] { OERDefinition.octets(4).label("jValue"), OERDefinition.octets(9).label("value") }).typeName("GroupLinkageValue");
  
  public static final OERDefinition.Builder LaId = OERDefinition.octets(2).typeName("LaId");
  
  public static final OERDefinition.Builder LinkageSeed = OERDefinition.octets(16).typeName("LinkageSeed");
  
  public static final OERDefinition.Builder Point256 = OERDefinition.seq(new Object[] { OERDefinition.octets(32).label("x"), OERDefinition.octets(32).label("y") }).typeName("Point256");
  
  public static final OERDefinition.Builder EccP256CurvePoint = OERDefinition.choice(new Object[] { OERDefinition.octets(32).label("x-only"), OERDefinition.nullValue().label("fill"), OERDefinition.octets(32).label("compressed-y-0"), OERDefinition.octets(32).label("compressed-y-1"), Point256.label("uncompressedP256") }).typeName("EccP256CurvePoint");
  
  public static final OERDefinition.Builder EcdsaP256Signature = OERDefinition.seq(new Object[] { EccP256CurvePoint.label("rSig"), OERDefinition.octets(32).label("sSig") }).typeName("EcdsaP256Signature");
  
  public static final OERDefinition.Builder Point384 = OERDefinition.seq(new Object[] { OERDefinition.octets(48).label("x"), OERDefinition.octets(48).label("y") }).typeName("Point384");
  
  public static final OERDefinition.Builder EccP384CurvePoint = OERDefinition.choice(new Object[] { OERDefinition.octets(48).label("x-only"), OERDefinition.nullValue().label("fill"), OERDefinition.octets(48).label("compressed-y-0"), OERDefinition.octets(48).label("compressed-y-1"), Point384.label("uncompressedP384") }).typeName("EccP384CurvePoint");
  
  public static final OERDefinition.Builder EcdsaP384Signature = OERDefinition.seq(new Object[] { EccP384CurvePoint.label("rSig"), OERDefinition.octets(48).label("sSig") }).typeName("EcdsaP384Signature");
  
  public static final OERDefinition.Builder Signature = OERDefinition.choice(new Object[] { EcdsaP256Signature.label("ecdsaNistP256Signature"), EcdsaP256Signature.label("ecdsaBrainpoolP256r1Signature"), OERDefinition.extension(new Object[] { EcdsaP384Signature.label("ecdsaBrainpoolP384r1Signature") }) }).typeName("Signature");
  
  public static final OERDefinition.Builder SymmAlgorithm = OERDefinition.enumeration(new Object[] { OERDefinition.enumItem("aes128Ccm"), OERDefinition.extension(new Object[0]) }).typeName("SymmAlgorithm");
  
  public static final OERDefinition.Builder HashAlgorithm = OERDefinition.enumeration(new Object[] { OERDefinition.enumItem("sha256"), OERDefinition.extension(new Object[] { OERDefinition.enumItem("sha384") }) }).typeName("HashAlgorithm");
  
  public static final OERDefinition.Builder EciesP256EncryptedKey = OERDefinition.seq(new Object[] { EccP256CurvePoint.copy().label("v"), OERDefinition.octets(16).label("c"), OERDefinition.octets(16).label("t") }).typeName("EciesP256EncryptedKey");
  
  public static final OERDefinition.Builder BasePublicEncryptionKey = OERDefinition.choice(new Object[] { EccP256CurvePoint.label("eciesNistP256"), EccP256CurvePoint.label("eciesBrainpoolP256r1"), OERDefinition.extension(new Object[0]) }).typeName("BasePublicEncryptionKey");
  
  public static final OERDefinition.Builder SymmetricEncryptionKey = OERDefinition.choice(new Object[] { OERDefinition.octets(16).label("aes128Ccm"), OERDefinition.extension(new Object[0]) }).typeName("SymmetricEncryptionKey");
  
  public static final OERDefinition.Builder PublicEncryptionKey = OERDefinition.seq(new Object[] { SymmAlgorithm.label("supportedSymmAlg"), BasePublicEncryptionKey.label("publicKey") }).typeName("PublicEncryptionKey");
  
  public static final OERDefinition.Builder EncryptionKey = OERDefinition.choice(new Object[] { PublicEncryptionKey.label("publicOption"), SymmetricEncryptionKey.label("symmetric") }).typeName("EncryptionKey");
  
  public static final OERDefinition.Builder PublicVerificationKey = OERDefinition.choice(new Object[] { EccP256CurvePoint.label("ecdsaNistP256"), EccP256CurvePoint.label("ecdsaBrainpoolP256r1"), OERDefinition.extension(new Object[] { EccP384CurvePoint.label("ecdsaBrainpoolP384r1") }) }).typeName("PublicVerificationKey");
  
  public static final OERDefinition.Builder Psid = OERDefinition.integer().rangeToMAXFrom(0L).typeName("Psid");
  
  public static final OERDefinition.Builder BitmapSsp = OERDefinition.octets(0, 31).typeName("BitmapSsp");
  
  public static final OERDefinition.Builder ServiceSpecificPermissions = OERDefinition.choice(new Object[] { OERDefinition.octets().unbounded().label("opaque"), OERDefinition.extension(new Object[] { BitmapSsp }) }).typeName("ServiceSpecificPermissions");
  
  public static final OERDefinition.Builder PsidSsp = OERDefinition.seq(new Object[] { Psid.label("psid"), OERDefinition.optional(new Object[] { ServiceSpecificPermissions.label("ssp") }) }).typeName("PsidSsp");
  
  public static final OERDefinition.Builder SequenceOfPsidSsp = OERDefinition.seqof(new Object[] { PsidSsp }).typeName("SequenceOfPsidSsp");
  
  public static final OERDefinition.Builder SequenceOfPsid = OERDefinition.seqof(new Object[] { Psid }).typeName("SequenceOfPsid");
  
  public static final OERDefinition.Builder SequenceOfOctetString = OERDefinition.seqof(new Object[] { OERDefinition.octets().rangeToMAXFrom(0L) }).typeName("SequenceOfOctetString");
  
  public static final OERDefinition.Builder BitmapSspRange = OERDefinition.seq(new Object[] { OERDefinition.octets(1, 32).label("sspValue"), OERDefinition.octets(1, 32).label("sspBitMask") }).typeName("BitmapSspRange");
  
  public static final OERDefinition.Builder SspRange = OERDefinition.choice(new Object[] { SequenceOfOctetString.label("opaque"), OERDefinition.nullValue().label("all"), OERDefinition.extension(new Object[] { BitmapSspRange.label("bitmapSspRange") }) }).typeName("SspRange");
  
  public static final OERDefinition.Builder PsidSspRange = OERDefinition.seq(new Object[] { Psid.label("psid"), OERDefinition.optional(new Object[] { SspRange.label("sspRange") }) }).typeName("PsidSspRange");
  
  public static final OERDefinition.Builder SequenceOfPsidSspRange = OERDefinition.seqof(new Object[] { PsidSspRange }).typeName("SequenceOfPsidSspRange");
  
  public static final OERDefinition.Builder SubjectAssurance = OERDefinition.octets(1).typeName("SubjectAssurance");
  
  public static final OERDefinition.Builder CrlSeries = UINT16.typeName("CrlSeries");
  
  public static final OERDefinition.Builder CountryOnly = UINT16.typeName("CountryOnly");
  
  public static final OERDefinition.Builder CountryAndRegions = OERDefinition.seq(new Object[] { CountryOnly.label("countryOnly"), SequenceOfUint8.label("regions") }).typeName("CountryAndRegions");
  
  public static final OERDefinition.Builder RegionAndSubregions = OERDefinition.seq(new Object[] { UINT8.label("region"), SequenceOfUint16.label("subregions") }).typeName("RegionAndSubregions");
  
  public static final OERDefinition.Builder SequenceOfRegionAndSubregions = OERDefinition.seqof(new Object[] { RegionAndSubregions }).typeName("SequenceOfRegionAndSubregions");
  
  public static final OERDefinition.Builder CountryAndSubregions = OERDefinition.seq(new Object[] { CountryOnly.label("country"), SequenceOfRegionAndSubregions.label("regionAndSubregions") }).typeName("CountryAndSubregions");
  
  public static final OERDefinition.Builder IdentifiedRegion = OERDefinition.choice(new Object[] { CountryOnly.label("countryOnly"), CountryAndRegions.label("countryAndRegions"), CountryAndSubregions.label("countryAndSubregions"), OERDefinition.extension(new Object[0]) }).typeName("IdentifiedRegion");
  
  public static final OERDefinition.Builder SequenceOfIdentifiedRegion = OERDefinition.seqof(new Object[] { IdentifiedRegion }).typeName("SequenceOfIdentifiedRegion");
  
  public static final OERDefinition.Builder OneEightyDegreeInt = OERDefinition.integer(-1799999999L, 1800000001L).typeName("OneEightyDegreeInt");
  
  public static final OERDefinition.Builder KnownLongitude = OneEightyDegreeInt.copy().typeName("KnownLongitude");
  
  public static final OERDefinition.Builder UnknownLongitude = OERDefinition.integer().validSwitchValue(new ASN1Encodable[] { (ASN1Encodable)new ASN1Integer(1800000001L) }).typeName("UnknownLongitude");
  
  public static final OERDefinition.Builder NinetyDegreeInt = OERDefinition.integer(-900000000L, 900000001L).typeName("NinetyDegreeInt");
  
  public static final OERDefinition.Builder KnownLatitude = NinetyDegreeInt.copy().typeName("KnownLatitude");
  
  public static final OERDefinition.Builder UnknownLatitude = OERDefinition.integer().validSwitchValue(new ASN1Encodable[] { (ASN1Encodable)new ASN1Integer(900000001L) }).typeName("UnknownLatitude");
  
  public static final OERDefinition.Builder Elevation = UINT16.typeName("Elevation");
  
  public static final OERDefinition.Builder Longitude = OneEightyDegreeInt.copy().typeName("Longitude");
  
  public static final OERDefinition.Builder Latitude = NinetyDegreeInt.copy().typeName("Latitude");
  
  public static final OERDefinition.Builder ThreeDLocation = OERDefinition.seq(new Object[] { Latitude.label("latitude"), Longitude.label("longitude"), Elevation.label("elevation") }).typeName("ThreeDLocation");
  
  public static final OERDefinition.Builder TwoDLocation = OERDefinition.seq(new Object[] { Latitude.label("latitude"), Longitude.label("longitude") }).typeName("TwoDLocation");
  
  public static final OERDefinition.Builder RectangularRegion = OERDefinition.seq(new Object[] { TwoDLocation.label("northWest"), TwoDLocation.label("southEast") }).typeName("RectangularRegion");
  
  public static final OERDefinition.Builder SequenceOfRectangularRegion = OERDefinition.seqof(new Object[] { RectangularRegion }).typeName("SequenceOfRectangularRegion");
  
  public static final OERDefinition.Builder CircularRegion = OERDefinition.seq(new Object[] { TwoDLocation.label("center"), UINT16.label("radius") }).typeName("CircularRegion");
  
  public static final OERDefinition.Builder PolygonalRegion = OERDefinition.seqof(new Object[] { TwoDLocation }).rangeToMAXFrom(3L).typeName("PolygonalRegion");
  
  public static final OERDefinition.Builder GeographicRegion = OERDefinition.choice(new Object[] { CircularRegion.label("circularRegion"), SequenceOfRectangularRegion.label("rectangularRegion"), PolygonalRegion.label("polygonalRegion"), SequenceOfIdentifiedRegion.label("identifiedRegion"), OERDefinition.extension(new Object[0]) }).typeName("GeographicRegion");
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\template\ieee1609dot2\basetypes\Ieee1609Dot2BaseTypes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */