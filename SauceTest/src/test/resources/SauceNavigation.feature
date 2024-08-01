Feature: Funcionalidad de login

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
        Then Carrito aparece texto "<texto>"

        Examples:
            | usuario       | contrasena   | texto |
            | standard_user | secret_sauce |   1   |
