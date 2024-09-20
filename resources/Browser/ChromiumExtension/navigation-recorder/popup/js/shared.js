document.getElementById('version').textContent = document.getElementById('version').textContent.replace("{version}", chrome.runtime.getManifest().version);

const delayElement = document.querySelector('#recordingDelay');
delayElement.oninput = function(e){
    const delayText = document.querySelector('#delayText');
    const prefix = 'Recording delay';
    const value = String(this.value);
    if(value === '0') {
        delayText.textContent = prefix + ' (none)';
    } else if(value === '1') {
        delayText.textContent = prefix + ' (real time)';
    } else {
        delayText.textContent = prefix + ' x'+value;
    }

    chrome.storage.sync.set({recordingDelay: +document.querySelector('#recordingDelay').value});
};

chrome.storage.sync.get('recordingDelay', function(data) {
    if(typeof data.recordingDelay !== 'undefined') {
        delayElement.value = data.recordingDelay;
        delayElement.dispatchEvent(new Event('input'))
    }
});

document.querySelector('.logo').onclick = function(){
    let delayContainer = document.querySelector('.recordingDelayContainer');
    if(delayContainer.classList.contains("hide")) {
        chrome.storage.sync.set({showDelayOptions: true}, function () {
            delayContainer.classList.remove('hide');
        });
    } else {
        chrome.storage.sync.set({showDelayOptions: false}, function () {
            delayContainer.classList.add('hide');
        });
    }
};

chrome.storage.sync.get('showDelayOptions', function(data) {
    if(data.showDelayOptions) {
        changeDelayOptionsVisibility(1);
    } else {
        changeDelayOptionsVisibility(0);
    }
});

function changeDelayOptionsVisibility(show) {
    let delayContainer = document.querySelector('.recordingDelayContainer');
    if(show) {
        delayContainer.classList.remove('hide');
    } else {
        delayContainer.classList.add('hide');
    }
}