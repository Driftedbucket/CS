const toggleButton = document.getElementById('darkMode');
const body = document.body;

toggleButton.addEventListener('click', () =>{
    body.classList.toggle('dark-mode');
});