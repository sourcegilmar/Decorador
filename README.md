# Decorador
This is a approach for design pattern DECORATOR.
Basicamente it shows The objects composit and how to implement the Open-Closed principle.
It based upon: Use a cabeça com padrões de projeto, Eric Freeman & Elizabeth Freeman
This project aims to assist students in design pattern classes.

                       Cafezinho
                      ------+------
                            |
 ---------------------------+-----------------------
 CafeCurto     Capuccino   Expresso  DecoradorDeCafe
                                     -------+-------
                                            |       
                         -------------------+----------------------  
                         Canela   Chocolate   Cravo    Leite   Soja
                         
Cafezinho => abstract (COMPONENT)
DecoradorDeCafe => abstract (DECORATOR)
CafeCurto, Capuccino, Expresso (CONCRETE COMPONENTS)
Canela, Chocolate, Cravo, Leite, Soja (CONCRETE DECORATORS)
