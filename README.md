# VkCoursesHW1
HomeWork Gradle for VK
Общие требования

Нужно создать проект library состоящий из модулей models и controller.
Проект должен в каждом модуле установить зависимость от
com.intellij:annotations:12.0.
Для всех модулей должны быть определены и заданы переменные group и version.

Модуль models

Должен содержать модели сущностей “Автор” и “Книга”. Состав полей и методов сущностей на усмотрение студента курса. Модели “Автор” и “Книга” должны использовать библиотеку Lombok и не содержать никакого кода, кроме описания полей.
Для корректной работы необходимо установить и настроить в IDE плагин Lombok.


Модуль controller

Должен состоять из классов: “Приложение”, являющегося main классом консольного приложения, ”Библиотека” и  “Фабрика библиотеки”, создающего экземпляр библиотеки. “Библиотека” содержит книги, добавляемые в нее. Фабрика может возвращать библиотеку, статически определяемую в коде, вычитываемую из файла или из БД - на усмотрение студента.
Консольное приложение принимает входной параметр - имя автора книги и выводит список книг, написанных им и доступных в библиотеке. Вывод книг осуществляется в консоль, информация о книге выводится в виде json-сериализованного класса. Для сериализации необходимо использовать библиотеку Gson.