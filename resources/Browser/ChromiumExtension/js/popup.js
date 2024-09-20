import updateIcon from '../js/utils.js';

window.addEventListener('DOMContentLoaded', function(){
    let lastTabId = localStorage.getItem('lastTabSelected');
    if(!lastTabId) {
        lastTabId = 'nav-recorder-tab';
    }
    var element = document.querySelector('#'+lastTabId);
    var tab = new bootstrap.Tab(element);
    tab.show();
    updateIcon();

    document.querySelectorAll('button[data-bs-toggle="tab"]').forEach(tabElement=>{
        tabElement.addEventListener('shown.bs.tab', function (event) {            
            localStorage.setItem('lastTabSelected', event.target.id);
            updateIcon();
        });
    });
})

chrome.storage.onChanged.addListener(function(changes, namespace) {
    //changes.enabled is an object, the actual value is changes.enabled.newValue
    if (changes && changes.enabled) {
        updateIcon()
    }
});

