document.addEventListener('DOMContentLoaded', () => {

    // --- 1. MENÚ MÓVIL (NUEVO) ---
    const btn = document.getElementById('mobile-btn');
    const menu = document.getElementById('nav-menu');
    const links = document.querySelectorAll('#nav-menu a');

    if (btn && menu) {
        btn.addEventListener('click', () => {
            menu.classList.toggle('active');
            // Opcional: animar el botón si le pones estilos extras
            btn.classList.toggle('is-active');
        });

        // Cerrar menú al hacer clic en cualquier enlace (anclas)
        links.forEach(link => {
            link.addEventListener('click', () => {
                menu.classList.remove('active');
            });
        });
    }

    // --- 2. CLICS EN TARJETAS ---
    const projectCards = document.querySelectorAll('.project-card');
    projectCards.forEach(card => {
        card.addEventListener('click', () => {
            const url = card.getAttribute('data-url');
            if (url) {
                window.open(url, '_blank');
            }
        });
    });

    // --- 3. LÓGICA DE TEMA (Dark/Light) ---
    const toggleSwitch = document.querySelector('#checkbox');
    const currentTheme = localStorage.getItem('theme');

    if (currentTheme) {
        document.body.classList.add(currentTheme);
        if (currentTheme === 'dark-mode' && toggleSwitch) {
            toggleSwitch.checked = true;
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

    // --- 4. LÓGICA DEL CARRUSEL ---
    const carousel = document.getElementById('carousel');
    const leftBtn = document.getElementById('leftBtn');
    const rightBtn = document.getElementById('rightBtn');

    if (carousel && leftBtn && rightBtn) {
        const updateArrows = () => {
            const scrollLeft = carousel.scrollLeft;
            const maxScroll = carousel.scrollWidth - carousel.clientWidth;
            leftBtn.style.opacity = scrollLeft <= 5 ? '0.3' : '1';
            leftBtn.style.pointerEvents = scrollLeft <= 5 ? 'none' : 'auto';

            // Usamos un margen de error de 10px para dispositivos móviles
            rightBtn.style.opacity = scrollLeft >= maxScroll - 10 ? '0.3' : '1';
            rightBtn.style.pointerEvents = scrollLeft >= maxScroll - 10 ? 'none' : 'auto';
        };

        const getScrollStep = () => {
            const card = carousel.querySelector('.project-card');
            // En móvil el gap suele ser menor, lo calculamos dinámicamente si es posible
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
        // Pequeño timeout para asegurar que el DOM está renderizado antes de calcular flechas
        setTimeout(updateArrows, 100);
    }
});