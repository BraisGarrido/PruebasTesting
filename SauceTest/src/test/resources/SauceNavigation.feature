Feature: Funcionalidad de saucedemo

    Scenario Outline: Login test positivo
        Given Abrir web
        When Introducir usuario "<usuario>"
        And Introducir contrasena "<contrasena>"
        And Pulsar boton login
        Then Verificar link nueva ventana "<link>"

        Examples:
            | usuario       | contrasena   | link                                    |
            | standard_user | secret_sauce | https://www.saucedemo.com/inventory.html|

    Scenario Outline: Login test usuario negativo
        Given Abrir web
        When Introducir mal usuario "<malUsuario>"
        And Introducir contrasena "<contrasena>"
        And Pulsar boton login
        Then Verificar mensaje de error "<mensaje>"

        Examples:
            | malUsuario    | contrasena    | mensaje                                                    |
            | incorrectUser | secret_sauce  | Username and password do not match any user in this service |

    Scenario Outline: Login test contrasena negativa
        Given Abrir web
        When Introducir usuario "<usuario>"
        And Introducir mal contrasena "<malContrasena>"
        And Pulsar boton login
        Then Verificar mensaje de error "<mensaje>"

        Examples:
            | usuario       | malContrasena | mensaje                                                     |
            | standard_user | badPassword   | Username and password do not match any user in this service |

    
    Scenario Outline: Login test vacio
        Given Abrir web
        When Pulsar boton login
        Then Verificar mensaje de error "<mensaje>"

        Examples:
            | mensaje                            |
            | Epic sadface: Username is required |

    Scenario Outline: Agregar un producto al carrito
        Given Abrir web
        When Introducir usuario "<usuario>"
        And Introducir contrasena "<contrasena>"
        And Pulsar boton login
        When Usuario agrega un producto al carrito
        Then Muestra el "<numero>" correcto de productos

        Examples:
            | usuario       | contrasena   | numero |
            | standard_user | secret_sauce |   1   |
    
    # Scenario: Remover un producto de un carrito
    #     Given El usuario tiene un producto en el carrito
    #     When El usuario elimina todos los productos del carrito
    #     Then El carrito esta vacio

    # Scenario: Remover todos los productos de un carrito
    #     Given El usuario tiene varios productos en el carrito
    #     When El usuario elimina todos los productos del carrito
    #     Then El carrito esta vacio
    
    # Scenario: Ordenar productos por precio de menor a mayor
    #     Given Iniciar sesion
    #     When El usuario ordena los productos por precio de menor a mayor
    #     Then Los productos estan ordenador adecuadamente

    # Scenario: Ordenador los productos de la A a la Z
    #     Given Iniciar sesion
    #     When Ordenador los productos de la A a la Z
    #     Then Los productos estan ordenados correctamente

    # Scenario: Completar el proceso de checkout exitosamente
    #     Given El usuario tiene productos en el carrito
    #     When El usuario comienza el proceso de checkout
    #     And Ingresa la informacion requerida
    #     And Completa la compra
    #     Then Recibe un mensaje de confimacion
    
    # Scenario: Completar checkout sin rellenar los campos
    #     Given El usuario tiene productos en el carrito
    #     When El usuario inicia el proceso de checkout
    #     And No ingresa todos los campos
    #     Then Aparece mensaje de error
    
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
    
    # Scenario: Cerrar sesion correctamente
    #     Given Iniciar sesion
    #     When Cerrar sesion desde menu
    #     Then Redireccion pagina de login