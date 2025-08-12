

var toggleBtn = document.getElementById('darkButton');
var body = document.body;

toggleBtn.addEventListener('click', toggleDarkMode);

function toggleDarkMode() {
    body.classList.toggle('dark-mode');
}
