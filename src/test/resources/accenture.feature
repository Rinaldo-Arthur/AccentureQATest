#language:pt

Funcionalidade: Formulário para Seguro de Veículo 
    Preenchimento de Formulário para Seguro de Veículo


  Cenário: Preenchimento da ficha para seguro veicular 
    Dado que eu acesse "http://sampleapp.tricentis.com/101/app.php"
    E preencha os dados do veículo 
    E preencha os dados assegurado
    E preencha os dados do produto 
    E selecione a opção de preço
    E preencha os dados para contato 
    Quando enviar os dados 
    Então validar a mensagem "Sending e-mail success!"