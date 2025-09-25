# Telefone
Questão 2 - Telefone

# Comandos na IA:
1. "preciso aplicar o padrão observer nesse projeto, fazendo com que a classe Screen crie dois observadores: O primeiro deve imprimir o dígito mais recente na tela e o segundo imprime "Agora discando 081999887766..." na tela (onde o número exemplo é o número que o modelo possui)"

Com isso, a IA criou a interface Observer e alterou o PhoneModel para ser um Subject(o objeto observado) e já implementou um método para notificar os observadores sempre que um novo número for digitado. Depois, ele alterou a classe Screen para criar os observadores.

2. "altere os métodos no KeyPad para estarem de acordo com o PhoneModel."

Nisso, a IA alterou a classe KeyPad, para se adaptar à nova forma do PhoneModel, e também alterou o nome do void de "adicionarDigito" para "addDigit"
