# Projeto Sangue Solidário 🩸

## Não esqueça de assistir o video

[Clique aqui](https://youtu.be/OEYun-3-emQ?feature=shared)

## Resumo do Projeto

O Projeto Sangue Solidário é um aplicativo revolucionário que une doadores de sangue a hospitais cadastrados, simplificando o processo de agendamento de doações. Administrado por usuários autorizados, o sistema permite o cadastro de novos doadores e a marcação de doações online.

## Funcionalidades Principais

- Autenticação de Usuário: 🔒 LoginTelaView - Acesso seguro para os usuários.
- Menu Principal: 🏠 PaginaInicialTelaView - Gerenciamento intuitivo de doadores e agendamentos.
- Cadastro de Usuário: ➕ CadastrarTelaView - Adição rápida de novos doadores.
- Remoção de Doador: 🗑️ RemoverDoadorTelaView - Exclusão simples de doadores do sistema.
- Atualização de Doador: 🔄 AtualizarDoadorTelaView - Atualização fácil das informações de contato dos doadores.
- Agendamento de Doação: 🗓️ AgendarDoacaoTelaView - Agendamento prático e eficiente de doações.

## Banco de Dados

O Projeto Sangue Solidário utiliza um banco de dados MySQL para armazenar informações vitais. Abaixo estão as tabelas criadas para o projeto:

- Tabela de Doadores: Armazena informações sobre os doadores, incluindo nome, data de nascimento, gênero, estado civil, tipo sanguíneo, telefone e email.
- Tabela de Agendamento: Registra os agendamentos de doações, com informações sobre o hospital, data, hora, observações e o ID do doador associado.
- Tabela de Usuários Administradores: Armazena informações sobre os usuários administradores do sistema, incluindo nome, login e senha.

## Biblioteca de Envio de E-mails

O projeto utiliza uma biblioteca para enviar e-mails de confirmação de agendamento para os contatos cadastrados.

## Conclusão

O Projeto Sangue Solidário é uma iniciativa apaixonante que visa simplificar e incentivar a doação de sangue, conectando de forma eficiente doadores e hospitais. Com um sistema moderno de cadastro e agendamento online, o aplicativo contribui significativamente para salvar vidas e promover a solidariedade em nossa sociedade. 🩸💉👩‍⚕️

## Para a criação das tabelas, utilize as seguintes queries:

CREATE TABLE tb_doadores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    data_nascimento VARCHAR(12) NOT NULL,
    genero CHAR(2) NOT NULL,
    estado_civil VARCHAR(50) NOT NULL,
    tipo_sanguineo CHAR(2) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(255) NOT NULL
);

INSERT INTO tb_doadores (nome, data_nascimento, tipo_sanguineo, estado_civil, genero, telefone, email)
VALUES
    ('Vinicius Reis', '1999-05-12', 'B', 'Casado(a)', 'F', '11945678901', 'joana@example.com'),
    ('Pedro Oliveira', '1999-05-12', 'O', 'Divorciado(a)', 'M', '11956789012', 'pedro@example.com'),
    ('Mariana Santos', '1999-05-12', 'A', 'Viúvo(a)', 'F', '11967890123', 'mariana@example.com'),
    ('Lucas Lima', '1999-05-12', 'AB', 'Solteiro(a)', 'M', '11978901234', 'lucas@example.com'),
    ('Carolina Fernandes', '1999-05-12', 'O', 'União Estável', 'F', '11989012345', 'carolina@example.com'),
    ('Gabriel Oliveira', '1999-05-12', 'A', 'Casado(a)', 'M', '11990123456', 'gabriel@example.com'),
    ('Isabela Costa', '1999-05-12', 'AB', 'Divorciado(a)', 'F', '11901234567', 'isabela@example.com'),
    ('Fernando Santos', '1999-05-12', 'O', 'Solteiro(a)', 'M', '11912345678', 'fernando@example.com'),
    ('Amanda Lima', '1999-05-12', 'A', 'Viúvo(a)', 'F', '11923456789', 'amanda@example.com'),
    ('Rafael Fernandes', '1999-05-12', 'B', 'União Estável', 'M', '11934567890', 'rafael@example.com'),
    ('Mariana Oliveira', '1999-05-12', 'O', 'Casado(a)', 'F', '11945678901', 'mariana@example.com'),
    ('Roberto Costa', '0000-00-00', 'A', 'Divorciado(a)', 'M', '11956789012', 'roberto@example.com'),
    ('Luiza Silva', '0000-00-00', 'AB', 'Solteiro(a)', 'F', '11967890123', 'luiza@example.com'),
    ('Marcos Santos', '0000-00-00', 'O', 'Viúvo(a)', 'M', '11978901234', 'marcos@example.com'),
    ('Tatiana Pereira', '0000-00-00', 'A', 'União Estável', 'F', '11989012345', 'tatiana@example.com'),
    ('Carlos Fernandes', '0000-00-00', 'B', 'Casado(a)', 'M', '11990123456', 'carlos@example.com'),
    ('Juliana Oliveira', '0000-00-00', 'O', 'Divorciado(a)', 'F', '11901234567', 'juliana@example.com'),
    ('João Santos', '0000-00-00', 'A', 'Solteiro(a)', 'M', '11912345678', 'joao@example.com'),
    ('Laura Costa', '0000-00-00', 'AB', 'Viúvo(a)', 'F', '11923456789', 'laura@example.com'),
    ('Felipe Lima', '0000-00-00', 'O', 'União Estável', 'M', '11934567890', 'felipe@example.com'),
    ('Ana Oliveira', '0000-00-00', 'A', 'Casado(a)', 'F', '11945678901', 'ana@example.com'),
    ('Lucas Fernandes', '0000-00-00', 'B', 'Divorciado(a)', 'M', '11956789012', 'lucasf@example.com'),
    ('Maria Santos', '0000-00-00', 'O', 'Solteiro(a)', 'F', '11967890123', 'marias@example.com');

Tabela de Agendamento
A tabela tb_agendamento registra os agendamentos de doações, com informações sobre o hospital, data, hora, observações e o ID do doador associado.


CREATE TABLE tb_agendamento (
   id_agendamento int NOT NULL AUTO_INCREMENT PRIMARY KEY,
   hospital varchar(255),
   data_doacao varchar(40),
   hora_doacao varchar(40),
   observacao varchar(255),
   doador_id int,
   CONSTRAINT fk_doador_id FOREIGN KEY (doador_id) REFERENCES tb_doadores(id)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO tb_agendamento (hospital, data_doacao, hora_doacao, observacao, doador_id) VALUES
('Mayo Clinic Rochester', '2024-06-01', '08:00', 'Tem tatuagem recente', 1),
('Hospital Israelita Albert Einstein', '2024-06-02', '09:00', 'Colocou brinco recentemente', 2),
('Massachusetts General Hospital', '2024-06-03', '10:00', 'Fez piercing recentemente', 3),
('Cleveland Clinic', '2024-06-04', '11:00', 'Teve febre recentemente', 4),
('The Mount Sinai Hospital', '2024-06-05', '12:00', 'Está tomando antibióticos', 5),
('Mayo Clinic Rochester', '2024-06-06', '13:00', 'Doou sangue há menos de 3 meses', 6),
('Hospital Israelita Albert Einstein', '2024-06-07', '14:00', 'Teve gripe recentemente', 7),
('Massachusetts General Hospital', '2024-06-08', '15:00', 'Fez cirurgia recente', 8),
('Cleveland Clinic', '2024-06-09', '16:00', 'Está grávida', 9),
('The Mount Sinai Hospital', '2024-06-10', '17:00', 'Fez endoscopia recentemente', 10),
('Mayo Clinic Rochester', '2024-06-11', '08:30', 'Está amamentando', 11),
('Hospital Israelita Albert Einstein', '2024-06-12', '09:30', 'Teve hepatite recentemente', 12),
('Massachusetts General Hospital', '2024-06-13', '10:30', 'Teve malária', 13),
('Cleveland Clinic', '2024-06-14', '11:30', 'Tomou vacina recentemente', 14),
('The Mount Sinai Hospital', '2024-06-15', '12:30', 'Fez viagem internacional recente', 15),
('Mayo Clinic Rochester', '2024-06-16', '13:30', 'Tem pressão alta', 16),
('Hospital Israelita Albert Einstein', '2024-06-17', '14:30', 'Teve dengue recentemente', 17),
('Massachusetts General Hospital', '2024-06-18', '15:30', 'Está com anemia', 18),
('Cleveland Clinic', '2024-06-19', '16:30', 'Está com baixo peso', 19),
('The Mount Sinai Hospital', '2024-06-20', '17:30', 'Está em jejum prolongado', 20);

Tabela de Usuários Administradores
A tabela usuario_admin armazena informações sobre os usuários administradores do sistema, incluindo nome, login e senha.

CREATE TABLE usuario_admin (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    login VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL
);

INSERT INTO usuario_admin (nome, login, senha) VALUES
('Vinicius Reis Miranda', 'admin', 'admin'),
('Osama bin Laden', 'osama', 'cabum');
