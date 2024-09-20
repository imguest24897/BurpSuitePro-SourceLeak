import RecorderControl from '../classes/RecorderControl.js';
let recordingControl = new RecorderControl();
let autoFillAddressSetting;
let autoFillCreditCardSetting;
let passwordSavingSetting;
let hasPlatformAuth = false;

function addWindowInformation(events, sender, isIframe) {
  for(let i=0;i<events.length;i++) {
    events[i].frameId = sender.frameId;
    if(sender.tab.id) {
      events[i].tabId = sender.tab.id;
    }
    events[i].windowId = sender.tab.windowId;
    if(typeof events[i].frameId === 'undefined') {
      events[i].frameId = sender.tab.frameId;
    }
    if(typeof events[i].url !== 'string' || !/^https?:/.test(events[i].url)) {
      events[i].url = sender.url;
    }
    events[i].isIframe = isIframe ? true : false
  }
  return events;
}

chrome.runtime.onInstalled.addListener(function() {
  recordingControl.installed();
});
chrome.privacy.services.autofillAddressEnabled.get({}, function(details) {
  autoFillAddressSetting = details.value;
});
chrome.privacy.services.autofillCreditCardEnabled.get({}, function(details) {
  autoFillCreditCardSetting = details.value;
});
chrome.privacy.services.passwordSavingEnabled.get({}, function(details) {
  passwordSavingSetting = details.value;
});
chrome.webNavigation.onBeforeNavigate.addListener(function(e){
  if(e.frameId === 0) {
    recordingControl.pageUnload();
  }
});
chrome.storage.onChanged.addListener(function(changes, namespace) {
  if(!changes.recording) {
    return;
  }
  let recording = changes.recording.newValue;
  recordingControl.setRecordingState(recording);
  if(recording) {
    chrome.privacy.services.autofillAddressEnabled.set({ value: false }, function() {
      if (chrome.runtime.lastError) {      
        console.log("Failed to disable auto fill address", chrome.runtime.lastError);
      }
    });
    chrome.privacy.services.autofillCreditCardEnabled.set({ value: false }, function() {
      if (chrome.runtime.lastError) {      
        console.log("Failed to disable auto credit card", chrome.runtime.lastError);
      }
    });
    chrome.privacy.services.passwordSavingEnabled.set({ value: false }, function() {
      if (chrome.runtime.lastError) {      
        console.log("Failed to disable password saving", chrome.runtime.lastError);
      }
    });
    chrome.storage.sync.get('recordingDelay', function(data) {
      recordingControl.start(+data.recordingDelay);
    });
  } else {
    hasPlatformAuth = false;
    chrome.privacy.services.autofillAddressEnabled.set({ value: autoFillAddressSetting }, function() {
      if (chrome.runtime.lastError) {      
        console.log("Failed to set auto fill address setting", chrome.runtime.lastError);
      }
    });
    chrome.privacy.services.autofillCreditCardEnabled.set({ value: autoFillCreditCardSetting }, function() {
      if (chrome.runtime.lastError) {      
        console.log("Failed to set auto credit card setting", chrome.runtime.lastError);
      }
    });
    chrome.privacy.services.passwordSavingEnabled.set({ value: passwordSavingSetting }, function() {
      if (chrome.runtime.lastError) {      
        console.log("Failed to set password saving", chrome.runtime.lastError);
      }
    });
    recordingControl.finish();
  }
});

chrome.webRequest.onAuthRequired.addListener(
    function(details){
        if(details.frameId === 0 && !details.isProxy) {
          hasPlatformAuth = true;
        }
    },
    {
      urls: [
        '*://*/*'
      ],
      types: ["main_frame"]
    }
);

chrome.webRequest.onCompleted.addListener(function(){
  if(hasPlatformAuth && recordingControl.isRecording()) {
    setTimeout(function(){
      recordingControl.sendWarningMessage();
    }, 500);
  }
},{
  urls: [
    '*://*/*'
  ],
  types: ["main_frame"]
});

chrome.runtime.onMessage.addListener(function(data, sender, sendResponse){
  if(data.messageType === 'collectEvents') {
    recordingControl.storeData(addWindowInformation(data.events, sender, data.isIframe));
  } else if(data.messageType === 'complete') {
    recordingControl.complete();
  } else if(data.messageType === 'getLastRecording') {    
    sendResponse({type:"lastRecording",lastRecording:recordingControl.getLastRecording()});
  } else if(data.messageType === 'collectIframeInfo') {
    recordingControl.collectIframeInfo(data.frameId, sender.tab.windowId, data.iframeInfo);
  }
});