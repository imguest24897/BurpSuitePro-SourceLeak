let iconContainer = document.getElementById('iconContainer');
let title = document.getElementById('title');
let message = document.getElementById('message');
let buttonContainer = document.getElementById('buttonContainer');

function showRecordingButtons() {
  buttonContainer.innerHTML = '<button id="recordingBtn"></button>';
  iconContainer.innerHTML = '<img src="../images/video-camera.svg" width="75" height="44" />';
  title.textContent = 'Burp Suite Navigation Recorder';
  message.textContent = 'Improve your Burp Suite scan coverage by manually capturing how to perform complex actions on your website.';
  let recordingBtn = document.getElementById('recordingBtn');
  recordingBtn.textContent =  "\u{1F534} Start recording";
  let recording = false;
  let complete = false;
  chrome.storage.sync.get('recording', function(data) {
    recording = data.recording;
    if(recording) {
      recordingBtn.textContent =  "\u{2B1C} Stop recording";
    } else {
      recordingBtn.textContent =  "\u{1F534} Start recording";
    }
  });
  chrome.storage.sync.get('complete', function(data) {
    complete = data.complete;
    if(complete) {
      location = 'complete.html';
    }
  });
  recordingBtn.onclick = function(e) {
    if(recording) {
      recordingBtn.textContent =  "\u{1F534} Start recording";
      recording = false;
      chrome.storage.sync.set({recording: false, complete:true}, function() {
        console.log("Stopped recording");
        location = 'complete.html';
      });
    } else {
      recordingBtn.textContent = "\u{2B1C} Stop recording";
      recording = true;
      chrome.storage.sync.set({recordingDelay: +document.querySelector('#recordingDelay').value, recording: true}, function() {
        console.log("Started recording");
      });
      top.close();
    }
  };
}

function showIncognitoVideo() {
  buttonContainer.innerHTML = '<p><button id="openSettingsBtn">Open settings</button></p><p><a href="#" id="continueWithoutIncogitoLink">Continue without incognito</a></p>';
  iconContainer.innerHTML = '<img src="../images/incognito-animation.gif" class="rounded" />';
  title.textContent = 'Finish setup';
  message.textContent = 'To enable incognito mode for this extension click the button below to open the settings.';
  let openSettingsBtn = document.getElementById('openSettingsBtn');
  openSettingsBtn.addEventListener('click',function(){
    chrome.tabs.query({active: true, currentWindow: true}, function(tabs) {
      message.textContent = 'After changing the incognito setting. Please click this icon again and click the start recording button to begin recording.';
      chrome.tabs.update(tabs[0].id, {url: 'chrome://extensions/?id='+chrome.runtime.id+'#allow-incognito'});
    });
  });
  let continueWithoutIncogitoLink = document.getElementById('continueWithoutIncogitoLink');
  continueWithoutIncogitoLink.addEventListener('click', function(e){
    if(confirm('Are you sure? You should only continue if you can\'t enable your browser\'s incognito mode.')) {
      chrome.storage.sync.set({bypassIncognito: true}, function() {
        showRecordingButtons();
      });
    }
    e.preventDefault();
  });
}

chrome.storage.sync.get('bypassIncognito', function(data) {
  if(data.bypassIncognito) {
      showRecordingButtons();
  } else {
    chrome.extension.isAllowedIncognitoAccess(function (isAllowed) {
      if (isAllowed) {
        showRecordingButtons();
      } else {
        showIncognitoVideo();
      }
    });
  }
});



let helpBtn = document.getElementById('helpBtn');
helpBtn.addEventListener('click', function(){
  let win = window.open('help.html','help','width=500,height=400');
});