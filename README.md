# Резервации
## Разработено с Jakarta EE 9.1
 
### Бази данни - mysql

|database|username|password|
|--------|--------|--------|
|reservations|reservations|reservations|

### API Guide

|Път|Резултат|
|---|--------|
|`GET /webtest/`|JSF форма за резервация|
|`GET /webtest/index.jsf`|JSF форма за резервация|
|`GET /webtest/webapi/reservation/all`|Информация за всички резервации в JSON формат|
|`GET /webtest/webapi/reservation/{id}`|Информация за резервация #id в JSON формат|
|`POST /webtest/webapi/reservation/`|Създаване на резервация чрез JSON обект|
|`PUT /webtest/webapi/reservation/{id}`|Редакция на резервация чрез JSON обект|
|`DELETE /webtest/webapi/reservation/{id}`|Изтриване на резервация #id|

### Автор

Валентин Стоянов, фн 206588, КН-Задочно, РУ "Ангел Кънчев"