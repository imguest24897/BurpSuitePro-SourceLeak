package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.emulation.VirtualTimeBudgetExpired;
import net.portswigger.devtools.protocol.types.dom.RGBA;
import net.portswigger.devtools.protocol.types.emulation.DevicePosture;
import net.portswigger.devtools.protocol.types.emulation.DisabledImageType;
import net.portswigger.devtools.protocol.types.emulation.DisplayFeature;
import net.portswigger.devtools.protocol.types.emulation.MediaFeature;
import net.portswigger.devtools.protocol.types.emulation.PressureMetadata;
import net.portswigger.devtools.protocol.types.emulation.PressureSource;
import net.portswigger.devtools.protocol.types.emulation.PressureState;
import net.portswigger.devtools.protocol.types.emulation.ScreenOrientation;
import net.portswigger.devtools.protocol.types.emulation.SensorMetadata;
import net.portswigger.devtools.protocol.types.emulation.SensorReading;
import net.portswigger.devtools.protocol.types.emulation.SensorType;
import net.portswigger.devtools.protocol.types.emulation.SetEmitTouchEventsForMouseConfiguration;
import net.portswigger.devtools.protocol.types.emulation.SetEmulatedVisionDeficiencyType;
import net.portswigger.devtools.protocol.types.emulation.UserAgentMetadata;
import net.portswigger.devtools.protocol.types.emulation.VirtualTimePolicy;
import net.portswigger.devtools.protocol.types.page.Viewport;

public interface Emulation {
  @Deprecated
  @Zr("result")
  CompletableFuture<Zf<Boolean>> canEmulate();
  
  CompletableFuture<Zf<Void>> clearDeviceMetricsOverride();
  
  CompletableFuture<Zf<Void>> clearGeolocationOverride();
  
  @Zy
  CompletableFuture<Zf<Void>> resetPageScaleFactor();
  
  @Zy
  CompletableFuture<Zf<Void>> setFocusEmulationEnabled(@Zu("enabled") Boolean paramBoolean);
  
  @Zy
  CompletableFuture<Zf<Void>> setAutoDarkModeOverride();
  
  @Zy
  CompletableFuture<Zf<Void>> setAutoDarkModeOverride(@Zj @Zu("enabled") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setCPUThrottlingRate(@Zu("rate") Double paramDouble);
  
  CompletableFuture<Zf<Void>> setDefaultBackgroundColorOverride();
  
  CompletableFuture<Zf<Void>> setDefaultBackgroundColorOverride(@Zj @Zu("color") RGBA paramRGBA);
  
  CompletableFuture<Zf<Void>> setDeviceMetricsOverride(@Zu("width") Integer paramInteger1, @Zu("height") Integer paramInteger2, @Zu("deviceScaleFactor") Double paramDouble, @Zu("mobile") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setDeviceMetricsOverride(@Zu("width") Integer paramInteger1, @Zu("height") Integer paramInteger2, @Zu("deviceScaleFactor") Double paramDouble1, @Zu("mobile") Boolean paramBoolean1, @Zy @Zj @Zu("scale") Double paramDouble2, @Zy @Zj @Zu("screenWidth") Integer paramInteger3, @Zy @Zj @Zu("screenHeight") Integer paramInteger4, @Zy @Zj @Zu("positionX") Integer paramInteger5, @Zy @Zj @Zu("positionY") Integer paramInteger6, @Zy @Zj @Zu("dontSetVisibleSize") Boolean paramBoolean2, @Zj @Zu("screenOrientation") ScreenOrientation paramScreenOrientation, @Zy @Zj @Zu("viewport") Viewport paramViewport, @Zy @Zj @Zu("displayFeature") DisplayFeature paramDisplayFeature, @Deprecated @Zy @Zj @Zu("devicePosture") DevicePosture paramDevicePosture);
  
  @Zy
  CompletableFuture<Zf<Void>> setDevicePostureOverride(@Zu("posture") DevicePosture paramDevicePosture);
  
  @Zy
  CompletableFuture<Zf<Void>> clearDevicePostureOverride();
  
  @Zy
  CompletableFuture<Zf<Void>> setScrollbarsHidden(@Zu("hidden") Boolean paramBoolean);
  
  @Zy
  CompletableFuture<Zf<Void>> setDocumentCookieDisabled(@Zu("disabled") Boolean paramBoolean);
  
  @Zy
  CompletableFuture<Zf<Void>> setEmitTouchEventsForMouse(@Zu("enabled") Boolean paramBoolean);
  
  @Zy
  CompletableFuture<Zf<Void>> setEmitTouchEventsForMouse(@Zu("enabled") Boolean paramBoolean, @Zj @Zu("configuration") SetEmitTouchEventsForMouseConfiguration paramSetEmitTouchEventsForMouseConfiguration);
  
  CompletableFuture<Zf<Void>> setEmulatedMedia();
  
  CompletableFuture<Zf<Void>> setEmulatedMedia(@Zj @Zu("media") String paramString, @Zj @Zu("features") List<MediaFeature> paramList);
  
  CompletableFuture<Zf<Void>> setEmulatedVisionDeficiency(@Zu("type") SetEmulatedVisionDeficiencyType paramSetEmulatedVisionDeficiencyType);
  
  CompletableFuture<Zf<Void>> setGeolocationOverride();
  
  CompletableFuture<Zf<Void>> setGeolocationOverride(@Zj @Zu("latitude") Double paramDouble1, @Zj @Zu("longitude") Double paramDouble2, @Zj @Zu("accuracy") Double paramDouble3);
  
  @Zy
  @Zr("requestedSamplingFrequency")
  CompletableFuture<Zf<Double>> getOverriddenSensorInformation(@Zu("type") SensorType paramSensorType);
  
  @Zy
  CompletableFuture<Zf<Void>> setSensorOverrideEnabled(@Zu("enabled") Boolean paramBoolean, @Zu("type") SensorType paramSensorType);
  
  @Zy
  CompletableFuture<Zf<Void>> setSensorOverrideEnabled(@Zu("enabled") Boolean paramBoolean, @Zu("type") SensorType paramSensorType, @Zj @Zu("metadata") SensorMetadata paramSensorMetadata);
  
  @Zy
  CompletableFuture<Zf<Void>> setSensorOverrideReadings(@Zu("type") SensorType paramSensorType, @Zu("reading") SensorReading paramSensorReading);
  
  @Zy
  CompletableFuture<Zf<Void>> setPressureSourceOverrideEnabled(@Zu("enabled") Boolean paramBoolean, @Zu("source") PressureSource paramPressureSource);
  
  @Zy
  CompletableFuture<Zf<Void>> setPressureSourceOverrideEnabled(@Zu("enabled") Boolean paramBoolean, @Zu("source") PressureSource paramPressureSource, @Zj @Zu("metadata") PressureMetadata paramPressureMetadata);
  
  @Zy
  CompletableFuture<Zf<Void>> setPressureStateOverride(@Zu("source") PressureSource paramPressureSource, @Zu("state") PressureState paramPressureState);
  
  CompletableFuture<Zf<Void>> setIdleOverride(@Zu("isUserActive") Boolean paramBoolean1, @Zu("isScreenUnlocked") Boolean paramBoolean2);
  
  CompletableFuture<Zf<Void>> clearIdleOverride();
  
  @Deprecated
  @Zy
  CompletableFuture<Zf<Void>> setNavigatorOverrides(@Zu("platform") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> setPageScaleFactor(@Zu("pageScaleFactor") Double paramDouble);
  
  CompletableFuture<Zf<Void>> setScriptExecutionDisabled(@Zu("value") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setTouchEmulationEnabled(@Zu("enabled") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setTouchEmulationEnabled(@Zu("enabled") Boolean paramBoolean, @Zj @Zu("maxTouchPoints") Integer paramInteger);
  
  @Zy
  @Zr("virtualTimeTicksBase")
  CompletableFuture<Zf<Double>> setVirtualTimePolicy(@Zu("policy") VirtualTimePolicy paramVirtualTimePolicy);
  
  @Zy
  @Zr("virtualTimeTicksBase")
  CompletableFuture<Zf<Double>> setVirtualTimePolicy(@Zu("policy") VirtualTimePolicy paramVirtualTimePolicy, @Zj @Zu("budget") Double paramDouble1, @Zj @Zu("maxVirtualTimeTaskStarvationCount") Integer paramInteger, @Zj @Zu("initialVirtualTime") Double paramDouble2);
  
  @Zy
  CompletableFuture<Zf<Void>> setLocaleOverride();
  
  @Zy
  CompletableFuture<Zf<Void>> setLocaleOverride(@Zj @Zu("locale") String paramString);
  
  CompletableFuture<Zf<Void>> setTimezoneOverride(@Zu("timezoneId") String paramString);
  
  @Deprecated
  @Zy
  CompletableFuture<Zf<Void>> setVisibleSize(@Zu("width") Integer paramInteger1, @Zu("height") Integer paramInteger2);
  
  @Zy
  CompletableFuture<Zf<Void>> setDisabledImageTypes(@Zu("imageTypes") List<DisabledImageType> paramList);
  
  @Zy
  CompletableFuture<Zf<Void>> setHardwareConcurrencyOverride(@Zu("hardwareConcurrency") Integer paramInteger);
  
  CompletableFuture<Zf<Void>> setUserAgentOverride(@Zu("userAgent") String paramString);
  
  CompletableFuture<Zf<Void>> setUserAgentOverride(@Zu("userAgent") String paramString1, @Zj @Zu("acceptLanguage") String paramString2, @Zj @Zu("platform") String paramString3, @Zy @Zj @Zu("userAgentMetadata") UserAgentMetadata paramUserAgentMetadata);
  
  @Zy
  CompletableFuture<Zf<Void>> setAutomationOverride(@Zu("enabled") Boolean paramBoolean);
  
  @Zb("virtualTimeBudgetExpired")
  @Zy
  Zs onVirtualTimeBudgetExpired(Zp<VirtualTimeBudgetExpired> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Emulation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */