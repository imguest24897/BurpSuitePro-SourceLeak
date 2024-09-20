package net.portswigger.devtools.protocol;

import net.portswigger.devtools.protocol.domains.Accessibility;
import net.portswigger.devtools.protocol.domains.Animation;
import net.portswigger.devtools.protocol.domains.Audits;
import net.portswigger.devtools.protocol.domains.Autofill;
import net.portswigger.devtools.protocol.domains.BackgroundService;
import net.portswigger.devtools.protocol.domains.Browser;
import net.portswigger.devtools.protocol.domains.CSS;
import net.portswigger.devtools.protocol.domains.CacheStorage;
import net.portswigger.devtools.protocol.domains.Cast;
import net.portswigger.devtools.protocol.domains.Console;
import net.portswigger.devtools.protocol.domains.DOM;
import net.portswigger.devtools.protocol.domains.DOMDebugger;
import net.portswigger.devtools.protocol.domains.DOMSnapshot;
import net.portswigger.devtools.protocol.domains.DOMStorage;
import net.portswigger.devtools.protocol.domains.Database;
import net.portswigger.devtools.protocol.domains.Debugger;
import net.portswigger.devtools.protocol.domains.DeviceAccess;
import net.portswigger.devtools.protocol.domains.DeviceOrientation;
import net.portswigger.devtools.protocol.domains.Emulation;
import net.portswigger.devtools.protocol.domains.EventBreakpoints;
import net.portswigger.devtools.protocol.domains.Extensions;
import net.portswigger.devtools.protocol.domains.FedCm;
import net.portswigger.devtools.protocol.domains.Fetch;
import net.portswigger.devtools.protocol.domains.FileSystem;
import net.portswigger.devtools.protocol.domains.HeadlessExperimental;
import net.portswigger.devtools.protocol.domains.HeapProfiler;
import net.portswigger.devtools.protocol.domains.IO;
import net.portswigger.devtools.protocol.domains.IndexedDB;
import net.portswigger.devtools.protocol.domains.Input;
import net.portswigger.devtools.protocol.domains.Inspector;
import net.portswigger.devtools.protocol.domains.LayerTree;
import net.portswigger.devtools.protocol.domains.Log;
import net.portswigger.devtools.protocol.domains.Media;
import net.portswigger.devtools.protocol.domains.Memory;
import net.portswigger.devtools.protocol.domains.Network;
import net.portswigger.devtools.protocol.domains.Overlay;
import net.portswigger.devtools.protocol.domains.PWA;
import net.portswigger.devtools.protocol.domains.Page;
import net.portswigger.devtools.protocol.domains.Performance;
import net.portswigger.devtools.protocol.domains.PerformanceTimeline;
import net.portswigger.devtools.protocol.domains.Preload;
import net.portswigger.devtools.protocol.domains.Profiler;
import net.portswigger.devtools.protocol.domains.Runtime;
import net.portswigger.devtools.protocol.domains.Schema;
import net.portswigger.devtools.protocol.domains.Security;
import net.portswigger.devtools.protocol.domains.ServiceWorker;
import net.portswigger.devtools.protocol.domains.Storage;
import net.portswigger.devtools.protocol.domains.SystemInfo;
import net.portswigger.devtools.protocol.domains.Target;
import net.portswigger.devtools.protocol.domains.Tethering;
import net.portswigger.devtools.protocol.domains.Tracing;
import net.portswigger.devtools.protocol.domains.WebAudio;
import net.portswigger.devtools.protocol.domains.WebAuthn;

public interface ChromeDevTools {
  Console getConsole();
  
  Debugger getDebugger();
  
  HeapProfiler getHeapProfiler();
  
  Profiler getProfiler();
  
  Runtime getRuntime();
  
  Schema getSchema();
  
  Accessibility getAccessibility();
  
  Animation getAnimation();
  
  Audits getAudits();
  
  Extensions getExtensions();
  
  Autofill getAutofill();
  
  BackgroundService getBackgroundService();
  
  Browser getBrowser();
  
  CSS getCSS();
  
  CacheStorage getCacheStorage();
  
  Cast getCast();
  
  DOM getDOM();
  
  DOMDebugger getDOMDebugger();
  
  EventBreakpoints getEventBreakpoints();
  
  DOMSnapshot getDOMSnapshot();
  
  DOMStorage getDOMStorage();
  
  Database getDatabase();
  
  DeviceOrientation getDeviceOrientation();
  
  Emulation getEmulation();
  
  HeadlessExperimental getHeadlessExperimental();
  
  IO getIO();
  
  FileSystem getFileSystem();
  
  IndexedDB getIndexedDB();
  
  Input getInput();
  
  Inspector getInspector();
  
  LayerTree getLayerTree();
  
  Log getLog();
  
  Memory getMemory();
  
  Network getNetwork();
  
  Overlay getOverlay();
  
  Page getPage();
  
  Performance getPerformance();
  
  PerformanceTimeline getPerformanceTimeline();
  
  Security getSecurity();
  
  ServiceWorker getServiceWorker();
  
  Storage getStorage();
  
  SystemInfo getSystemInfo();
  
  Target getTarget();
  
  Tethering getTethering();
  
  Tracing getTracing();
  
  Fetch getFetch();
  
  WebAudio getWebAudio();
  
  WebAuthn getWebAuthn();
  
  Media getMedia();
  
  DeviceAccess getDeviceAccess();
  
  Preload getPreload();
  
  FedCm getFedCm();
  
  PWA getPWA();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\ChromeDevTools.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */