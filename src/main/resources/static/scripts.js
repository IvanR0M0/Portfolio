document.addEventListener('DOMContentLoaded', () => {
    // --- NUEVO: Manejador de clics para las tarjetas de proyecto ---
    const projectCards = document.querySelectorAll('.project-card');

    projectCards.forEach(card => {
        card.addEventListener('click', () => {
            const url = card.getAttribute('data-url');
            if (url) {
                window.open(url, '_blank');
            }
        });
    });
    // --- LÓGICA DE TEMA (Dark/Light) ---
    const toggleSwitch = document.querySelector('#checkbox');
    const currentTheme = localStorage.getItem('theme');

    if (currentTheme) {
        document.body.classList.add(currentTheme);
        if (currentTheme === 'dark-mode') {
            if (toggleSwitch) toggleSwitch.checked = true;
        }
    }

    if (toggleSwitch) {
        toggleSwitch.addEventListener('change', (e) => {
            if (e.target.checked) {
                document.body.classList.add('dark-mode');
                localStorage.setItem('theme', 'dark-mode');
            } else {
                document.body.classList.remove('dark-mode');
                localStorage.setItem('theme', 'light');
            }
        });
    }

    // --- LÓGICA DEL CARRUSEL (Punto 4: Arreglado) ---
    const carousel = document.getElementById('carousel');
    const leftBtn = document.getElementById('leftBtn');
    const rightBtn = document.getElementById('rightBtn');

    if (carousel && leftBtn && rightBtn) {
        const updateArrows = () => {
            const scrollLeft = carousel.scrollLeft;
            const maxScroll = carousel.scrollWidth - carousel.clientWidth;
            leftBtn.style.opacity = scrollLeft <= 5 ? '0.3' : '1';
            leftBtn.style.pointerEvents = scrollLeft <= 5 ? 'none' : 'auto';
            rightBtn.style.opacity = scrollLeft >= maxScroll - 5 ? '0.3' : '1';
            rightBtn.style.pointerEvents = scrollLeft >= maxScroll - 5 ? 'none' : 'auto';
        };

        const getScrollStep = () => {
            const card = carousel.querySelector('.project-card');
            // Medimos el ancho de la tarjeta + el gap real
            return card ? card.clientWidth + 25 : 300;
        };

        rightBtn.addEventListener('click', () => {
            carousel.scrollBy({ left: getScrollStep(), behavior: 'smooth' });
        });

        leftBtn.addEventListener('click', () => {
            carousel.scrollBy({ left: -getScrollStep(), behavior: 'smooth' });
        });

        carousel.addEventListener('scroll', updateArrows);
        window.addEventListener('resize', updateArrows);
        updateArrows();
    }
});