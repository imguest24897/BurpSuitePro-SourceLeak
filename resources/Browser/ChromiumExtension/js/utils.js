export default function updateIcon() {
    let lastTabId = localStorage.getItem('lastTabSelected');

    if (lastTabId === "nav-dom-invader-tab") {
        new Promise((resolve, reject) => chrome.storage.local.get('enabled', function(result) {
            if (typeof result.enabled === 'undefined') {
                resolve(false);
            } else {
                resolve(result.enabled);
            }
        })).then(enabled => {chrome.browserAction.setIcon({path: '../dom-invader-extension/images/DomInvader-128' +
                ((enabled) ? '' : '-off') +
                '.png'});
        });
    }
    else if (lastTabId === "nav-recorder-tab") {
        chrome.browserAction.setIcon({path: '../navigation-recorder/images/WebApp-Recorder-128.png'});
    }
}