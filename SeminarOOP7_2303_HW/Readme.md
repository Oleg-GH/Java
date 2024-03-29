# __ДЗ к семинару 7 (Java ООП, 23.03.2023)__ #

Два проекта на выбор. Реализовать один из них на любом
языке программирования реализующих ООП (в том числе Java). 
Проект должен быть построен с использованием паттерна MVP 
и удовлетворять принципам SOLID.

1. Проект с прошлых уроков с блокнотом. Реализовать
возможность добавления, изменения и удаления записей в 
блокнот (каждая запись отдельный объект)
2. Обычный калькулятор поддерживающий 4 основных действия 
(+,-,*,/). Проект должен соответствовать заданию описанному 
выше.

* создать ui с использованием библиотек для создания desktop
приложений, например swing или JavaFX
* добавить логгирование в проект

## __Предыдущее задание__ ##

Создать проект блокнот в формате MVP.

Суть: пользователь может делать какие-то записи для себя
(список продуктов или запись к врачу, не важно, просто
текст, который надо сохранить). Приложение сохраняет эти
записи и при просьбе пользователя может выдавать список
всех записей. Сохранять можно в обычный список (например,
ArrayList) или в файл*. Все общение с пользователем должно
быть во view части проекта. Можно построить диалог с
пользователем по типу:

выберите команду:

1- добавить фразу,

2- вывести весь список.

Усложнение проекта на свой вкус*. Например, можно сохранять 
в формате JSON или реализовать возможность удаления или 
изменения записей.
