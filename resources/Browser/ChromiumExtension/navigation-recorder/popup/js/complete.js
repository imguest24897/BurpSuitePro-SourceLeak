let lastRecording = '';
let copyClipboardBtn = document.getElementById('copyClipboardBtn');
let newRecordingBtn = document.getElementById('newRecordingBtn');
let clearClipboardBtn = document.getElementById('clearClipboardBtn');

clearClipboardBtn.addEventListener('click', function(){
    copyToClipboard(' ');
});

newRecordingBtn.addEventListener('click', function(){
    chrome.storage.sync.set({recordingDelay: +document.querySelector('#recordingDelay').value,recording: true, complete:false}, function() {
        console.log("Started recording");
        top.close();
      });
});

window.addEventListener('load', function(){
    chrome.runtime.sendMessage({messageType:'getLastRecording'}, function(response){
        if(response && response.type === 'lastRecording') {
            lastRecording = response.lastRecording;
            if(!lastRecording.length) {
                chrome.storage.sync.set({recording: false, complete:false}, function() {
                    location = 'popup.html';
                });
            }
        }
    });
});
copyClipboardBtn.addEventListener('click', function(){
    let title = document.getElementById('title');
    let message = document.getElementById('message');    
    title.innerHTML = 'Data copied to clipboard';
    message.textContent = 'Your data has been saved to your clipboard. Please paste this into Burp Suite.';
    copyToClipboard(lastRecording);
});

function copyToClipboard(text) {
    let textarea = document.createElement("textarea");
    textarea.value = text;
    document.body.appendChild(textarea);
    textarea.focus();
    textarea.select();
    document.execCommand("copy");
    document.body.removeChild(textarea);
  }
