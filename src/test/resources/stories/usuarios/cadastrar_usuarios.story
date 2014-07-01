Narrative:
In order to acesso ao sistema
As a um Usuário
I want to preencher um formulário com os dados necessários

Scenario: Cadastrar o usuário no sistema com sucesso
Given o eleitor José da Silva deseja acompanhar seu representante no governo
When ele preencher o formulário de cadastro com o nome de usuário jose e a senha dasilva e submetê-lo
Then o sistema deve exibir a seguinte mensagem: O usuário jose com a senha dasilva foi cadastrado com sucesso”
