Feature: Funcionalidad de saucedemo

    Scenario: Login test positivo
        Given Abrir web
        When Introducir usuario "standard_user"
        And Introducir contrasena "secret_sauce"
        And Pulsar boton login
        Then Verificar link nueva ventana "https://www.saucedemo.com/inventory.html"

    Scenario: Login test usuario negativo
        Given Abrir web
        When Introducir mal usuario "incorrectUser"
        And Introducir contrasena "secret_sauce"
        And Pulsar boton login
        Then Verificar mensaje de error "Username and password do not match any user in this service"

    Scenario: Login test contrasena negativa
        Given Abrir web
        When Introducir usuario "standard_user"
        And Introducir mal contrasena "badPassword"
        And Pulsar boton login
        Then Verificar mensaje de error "Username and password do not match any user in this service"

    Scenario: Login test vacio
        Given Abrir web
        When Pulsar boton login
        Then Verificar mensaje de error "Epic sadface: Username is required"

    Scenario: Agregar un producto al carrito
        Given Abrir web
        When Introducir usuario "standard_user"
        And Introducir contrasena "secret_sauce"
        And Pulsar boton login
        When Usuario agrega un producto al carrito
        Then Muestra el "1" correcto de productos

    Scenario: Agregar varios productos al carrito
        Given Abrir web
        When Introducir usuario "standard_user"
        And Introducir contrasena "secret_sauce"
        And Pulsar boton login
        And Agregar Bike Light
        And Agregar Bolt T-Shirt
        Then Muestra el "3" correcto de productos

    Scenario: Remover todos los productos de un carrito
        Given Abrir web
        When Introducir usuario "standard_user"
        And Introducir contrasena "secret_sauce"
        And Pulsar boton login
        And Eliminar BackPack
        And Eliminar Bike
        And Eliminar Bolt
        Then El carrito esta vacio

    Scenario: Completar el proceso de checkout exitosamente
        Given Abrir web
        When Introducir usuario "standard_user"
        And Introducir contrasena "secret_sauce"
        And Pulsar boton login
        And Agregar Bike Light
        And Entrar en el carrito
        And Pulsar checkout
        And Introducir nombre "Pepe"
        And Introducir apellido "Gonzalez"
        And Introducir codigo postal "15981"
        And Pulsar en continue
        And Pulsar finish
        Then Verificar link nueva ventana "https://www.saucedemo.com/checkout-complete.html"
    
    Scenario: Completar checkout sin rellenar los campos
        Given Abrir web
        When Introducir usuario "standard_user"
        And Introducir contrasena "secret_sauce"
        And Pulsar boton login
        And Agregar Bike Light
        And Entrar en el carrito
        And Pulsar checkout
        And Introducir nombre "Pepe"
        And Introducir apellido "Gonzalez"
        And Pulsar en continue
        Then Verificar mensaje de error "Error"
    
    # Scenario: Validar los precios del carrito son correctos
    #     Given El usuario agrega productos en el carrito
    #     When Visualizar el carrito
    #     Then La suma de los productos es correcta

    # Scenario: Verificar todas las imagenes tienen texto alternativo
    #     Given Iniciar sesion
    #     When Visualizar lista de productos
    #     Then Cada imagen tiene un atributo alt con texto descriptivo
    
    # Scenario: Pagina de detalles de un producto
    #     Given Iniciar sesion
    #     When Hacer click en un producto
    #     Then Redirigido a pagina de detalles