const toggleBtn = document.getElementById('darkButton');
const body = document.body;

toggleBtn.addEventListener('click', () =>{
    body.classList.toggle('dark-mode');

});