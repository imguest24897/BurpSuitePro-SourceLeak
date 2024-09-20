import updateIcon from '../js/utils.js';

chrome.runtime.onInstalled.addListener(reason => {
    updateIcon();
});