package com.example.winefordinner.presentation

import org.junit.Assert.*

/*
TestCase
1. Начальное открытие с рабочего стола => Начальное состояние HomeFragment
2. Поворот экрана => Начальное состояние HomeFragment
3. Ввод в поле EditText блюда
4. Нажатие на кнопку Подобрать блюдо
5. Возможные варианты после нажатия на кнопку:
5.1 Введено пустое значение => Должен появиться Toast Введите блюдо
5.2 Введено блюдо, отсутствующее в базе=> Должен появиться Toast "Давайте попробуем что-нибудь другое"
5.3 Введено блюдо, которое есть в базе => Рандомный подбор из блюд в репозитории, где в поле
suitableFood указано введенное блюдо.

 */

class WineViewModelTest