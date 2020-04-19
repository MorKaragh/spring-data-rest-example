# spring-data-rest-example
примерчики

* выгрузка по ID 

    ```localhost:8080/contract/5```

* постранично

    ```http://localhost:8080/contract?page=2```

* поиск по номеру (используем метод из репозитория) 

    ```http://localhost:8080/contract/search/findByNumber?number=test-number-1```