# API Security Scanner

Этот проект — сканер безопасности API для VTB API Hack. Он проверяет уязвимости в API эндпоинтах.

## Запуск
1. Скомпилируйте: `mvn clean compile`
2. Запустите: `mvn exec:java -Dexec.mainClass="com.example.apisecscanner.cli.Main" -Dexec.args="https://api.example.com"`

## Модули
- core: Основная логика
- scanner: Сканирование уязвимостей
- gost: Поддержка ГОСТ (добавьте позже)
- validator: Валидация
- fuzzer: Фаззинг
- reporter: Отчёты
- cli: Командная строка
