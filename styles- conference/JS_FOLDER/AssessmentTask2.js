sfunction addContent() {
    var newContent = document.createElement('p');
    newContent.textContent = 'This content will be added if you Scroll the screen';
    document.getElementById('content').appendChild(newContent);
}
window.addEventListener('scroll', function() {
        addContent();
});

