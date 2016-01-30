delete from auditex.detalhe
where id_sumario in (13);

delete from auditex.sumario_situacao
where id_sumario in (13);


-- Criado em 14/05/2012 16:39:01

-- =========================================================================
-- CHAVE
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.CHAVE(
       chave numeric(5) NOT NULL,
       descricao varchar2(50)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.CHAVE IS 'Chaves do Conax que podem ser associadas aos produtos';
COMMENT ON COLUMN AUDITEX.CHAVE.chave IS 'Numero da chave do Conax';
COMMENT ON COLUMN AUDITEX.CHAVE.descricao IS 'Descrição da Chave (indica os canais que libera)';

-- =========================================================================
-- CIDADE
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.CIDADE(
       codigo varchar2(10),
       nome varchar2(50),
       estado varchar2(2)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.CIDADE IS 'Cidades';
COMMENT ON COLUMN AUDITEX.CIDADE.codigo IS 'Codigo da Cidade';
COMMENT ON COLUMN AUDITEX.CIDADE.nome IS 'Nome da Cidade';
COMMENT ON COLUMN AUDITEX.CIDADE.estado IS 'Estado';

-- =========================================================================
-- CORRECAO
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.CORRECAO(
       id numeric(10) NOT NULL,
       id_sumario_correcao numeric(10),
       id_detalhe numeric(10),
       num_serie varchar2(20) NOT NULL,
       status varchar2(1),
       cod_retorno varchar2(10),
       msg_retorno varchar2(400),
       comando varchar2(10),
       chaves varchar2(200),
       comando_formatado varchar2(1000),
       dh_geracao date,
       dh_envio date,
       dh_retorno date,
       retorno_formatado varchar2(1000)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.CORRECAO IS 'Comandos gerados para correção da conciliação';
COMMENT ON COLUMN AUDITEX.CORRECAO.id IS 'Id do registro gerado para correção';
COMMENT ON COLUMN AUDITEX.CORRECAO.id_sumario_correcao IS 'Id do sumario_correcao que gerou este comando';
COMMENT ON COLUMN AUDITEX.CORRECAO.id_detalhe IS 'Id do detalhe corrigido neste comando';
COMMENT ON COLUMN AUDITEX.CORRECAO.num_serie IS 'Numero de Serie do Equipamento';
COMMENT ON COLUMN AUDITEX.CORRECAO.status IS 'Status do Comando:0-Pendente, 1-Comunicando, 8-Ok, 9-Erro';
COMMENT ON COLUMN AUDITEX.CORRECAO.cod_retorno IS 'Codigo de retorno do processameto';
COMMENT ON COLUMN AUDITEX.CORRECAO.msg_retorno IS 'Mensagem de retorno do comando';
COMMENT ON COLUMN AUDITEX.CORRECAO.comando IS 'Comando gerado para processamento';
COMMENT ON COLUMN AUDITEX.CORRECAO.chaves IS 'Chaves enviadas no comando';
COMMENT ON COLUMN AUDITEX.CORRECAO.comando_formatado IS 'Comando formatado para envio para a controladora';
COMMENT ON COLUMN AUDITEX.CORRECAO.dh_geracao IS 'Data de geracao do comando';
COMMENT ON COLUMN AUDITEX.CORRECAO.dh_envio IS 'Data de envio para a controladora';
COMMENT ON COLUMN AUDITEX.CORRECAO.dh_retorno IS 'Data de retorno da controladora';
COMMENT ON COLUMN AUDITEX.CORRECAO.retorno_formatado IS 'Retorno no formato que veio da controladora';

-- =========================================================================
-- DETALHE
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.DETALHE(
       id numeric(10) NOT NULL,
       id_sumario numeric(10) NOT NULL,
       cod_situacao varchar2(3) NOT NULL,
       num_serie varchar2(20) NOT NULL,
       ctrl_ativo varchar2(1),
       ctrl_chaves varchar2(400),
       ctrl_mapa varchar2(10),
       ctrl_contrato varchar2(15),
       sms_ativo varchar2(1),
       sms_chaves varchar2(400),
       sms_mapa varchar2(10),
       sms_contrato varchar2(20),
       ctrl_id numeric(10),
       sms_id numeric(10),
       id_sumario_correcao numeric(10),
       id_correcao numeric(10)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.DETALHE IS 'Detalhamento do Resultado da Conciliação';
COMMENT ON COLUMN AUDITEX.DETALHE.id IS 'Id do detalhe';
COMMENT ON COLUMN AUDITEX.DETALHE.id_sumario IS 'Id do sumario a que pertence este detalhe';
COMMENT ON COLUMN AUDITEX.DETALHE.cod_situacao IS 'Cod da situação a que pertence este detalhe';
COMMENT ON COLUMN AUDITEX.DETALHE.num_serie IS 'Numero de serie do equipto';
COMMENT ON COLUMN AUDITEX.DETALHE.ctrl_ativo IS 'Situação do decoder na controladora';
COMMENT ON COLUMN AUDITEX.DETALHE.ctrl_chaves IS 'Chaves na Controladora';
COMMENT ON COLUMN AUDITEX.DETALHE.ctrl_mapa IS 'Mapa de Canais na Controladora';
COMMENT ON COLUMN AUDITEX.DETALHE.ctrl_contrato IS 'Contrato na Controladora';
COMMENT ON COLUMN AUDITEX.DETALHE.sms_ativo IS 'Situação do decoder no SMS';
COMMENT ON COLUMN AUDITEX.DETALHE.sms_chaves IS 'Chaves no SMS (GX)';
COMMENT ON COLUMN AUDITEX.DETALHE.sms_mapa IS 'Mapa de Canais no SMS';
COMMENT ON COLUMN AUDITEX.DETALHE.sms_contrato IS 'Numero do Contrato no SMS';
COMMENT ON COLUMN AUDITEX.DETALHE.ctrl_id IS 'Id do TERMINAL_CTRL que deu origem ao registro';
COMMENT ON COLUMN AUDITEX.DETALHE.sms_id IS 'Id do TERMINAL_SMS que deu origem ao registro';
COMMENT ON COLUMN AUDITEX.DETALHE.id_sumario_correcao IS 'Id do Sumario_Correcao que corrigiu este decoder';
COMMENT ON COLUMN AUDITEX.DETALHE.id_correcao IS 'Id do comando gerado para a correção';

-- =========================================================================
-- MENU
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.MENU(
       id numeric(10) NOT NULL,
       nivel1 numeric(3) NOT NULL,
       nivel2 numeric(3),
       item varchar2(30) NOT NULL,
       link varchar2(100),
       descricao varchar2(100),
       situacao varchar2(1)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.MENU IS 'Cadastro do menu do sistema';
COMMENT ON COLUMN AUDITEX.MENU.id IS 'Id do menu';
COMMENT ON COLUMN AUDITEX.MENU.nivel1 IS 'Nivel 1 do menu';
COMMENT ON COLUMN AUDITEX.MENU.nivel2 IS 'Nivel 2 do menu (null no nivel 1)';
COMMENT ON COLUMN AUDITEX.MENU.item IS 'Texto exibido no menu do sistema';
COMMENT ON COLUMN AUDITEX.MENU.link IS 'Link disparado no acesso do menu';
COMMENT ON COLUMN AUDITEX.MENU.descricao IS 'Descricao do menu (tooltip)';
COMMENT ON COLUMN AUDITEX.MENU.situacao IS 'Situação do item de menu (Ativo, Cancelado, Teste-só para administradores)';

-- =========================================================================
-- OPERACAO
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.OPERACAO(
       codigo varchar2(10) NOT NULL,
       nome varchar2(50) NOT NULL,
       tecnologia varchar2(1),
       cod_cidade varchar2(10),
       cod_permissor varchar2(5)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.OPERACAO IS 'Operações';
COMMENT ON COLUMN AUDITEX.OPERACAO.codigo IS 'Codigo da operação';
COMMENT ON COLUMN AUDITEX.OPERACAO.nome IS 'Nome da operação';
COMMENT ON COLUMN AUDITEX.OPERACAO.tecnologia IS 'Tecnologia (A-Analogico, D-Digital ou I-Internet)';
COMMENT ON COLUMN AUDITEX.OPERACAO.cod_cidade IS 'Codigo da Cidade da Operacao';
COMMENT ON COLUMN AUDITEX.OPERACAO.cod_permissor IS 'Codigo do Permissor - GX e BBX';

-- =========================================================================
-- PARAMETRO
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.PARAMETRO(
       id numeric(10) NOT NULL,
       nome varchar2(50) NOT NULL,
       tipo varchar2(50) NOT NULL,
       valor varchar2(250),
       observacao varchar2(250)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.PARAMETRO IS 'Parametros gerais do sistema';
COMMENT ON COLUMN AUDITEX.PARAMETRO.id IS 'Id do parametro';
COMMENT ON COLUMN AUDITEX.PARAMETRO.nome IS 'Nome do Parametro';
COMMENT ON COLUMN AUDITEX.PARAMETRO.tipo IS 'Tipo do parametro (agrupamento dos parametros)';
COMMENT ON COLUMN AUDITEX.PARAMETRO.valor IS 'Valor do parametro';
COMMENT ON COLUMN AUDITEX.PARAMETRO.observacao IS 'Observações sobre o Parametro (indicando uso no sistema)';

-- =========================================================================
-- PERFIL
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.PERFIL(
       id numeric(10) NOT NULL,
       descricao varchar2(50) NOT NULL
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.PERFIL IS 'Cadastro de perfil de usuario';
COMMENT ON COLUMN AUDITEX.PERFIL.id IS 'Id do perfil';
COMMENT ON COLUMN AUDITEX.PERFIL.descricao IS 'Descrição do perfil';

-- =========================================================================
-- PERFIL_MENU
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.PERFIL_MENU(
       id numeric(10) NOT NULL,
       id_perfil numeric(10) NOT NULL,
       id_menu numeric(10) NOT NULL
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.PERFIL_MENU IS 'Relação entre perfil e menu de opções';
COMMENT ON COLUMN AUDITEX.PERFIL_MENU.id IS 'Id do relacionamento perfil x menu';
COMMENT ON COLUMN AUDITEX.PERFIL_MENU.id_perfil IS 'Id do perfil';
COMMENT ON COLUMN AUDITEX.PERFIL_MENU.id_menu IS 'Id do menu';

-- =========================================================================
-- PRODUTO
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.PRODUTO(
       codigo numeric(10) NOT NULL,
       descricao varchar2(50)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.PRODUTO IS 'Produto do GXV associado ao contrato';
COMMENT ON COLUMN AUDITEX.PRODUTO.codigo IS 'Codigo do produto no GXV';
COMMENT ON COLUMN AUDITEX.PRODUTO.descricao IS 'Descrição do Produto';

-- =========================================================================
-- PRODUTO_CHAVE
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.PRODUTO_CHAVE(
       id numeric(10) NOT NULL,
       cod_produto numeric(10) NOT NULL,
       chave numeric(5) NOT NULL
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.PRODUTO_CHAVE IS 'Relação de produtos com chaves';
COMMENT ON COLUMN AUDITEX.PRODUTO_CHAVE.id IS 'Id do relacionamento';
COMMENT ON COLUMN AUDITEX.PRODUTO_CHAVE.cod_produto IS 'Codigo do Produto';
COMMENT ON COLUMN AUDITEX.PRODUTO_CHAVE.chave IS 'Chave do Conax';

-- =========================================================================
-- SITUACAO
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.SITUACAO(
       codigo varchar2(3) NOT NULL,
       descricao varchar2(100),
       comando_a varchar2(10),
       comando_d varchar2(10),
       comando_i varchar2(10)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.SITUACAO IS 'Lista de situções da conciliação';
COMMENT ON COLUMN AUDITEX.SITUACAO.codigo IS 'Codigo da tabela de situação (Cod Tecnologia + Codigo Situacao)';
COMMENT ON COLUMN AUDITEX.SITUACAO.descricao IS 'Descrição da situação';
COMMENT ON COLUMN AUDITEX.SITUACAO.comando_a IS 'Comando corretivo da situação para Analógico';
COMMENT ON COLUMN AUDITEX.SITUACAO.comando_d IS 'Comando corretivo da situação para Digital';
COMMENT ON COLUMN AUDITEX.SITUACAO.comando_i IS 'Comando corretivo da situação para Internet';

-- =========================================================================
-- SUMARIO
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.SUMARIO(
       id numeric(10) NOT NULL,
       cod_operacao varchar2(10) NOT NULL,
       id_usuario numeric(10),
       dh_agenda date,
       dh_inicio date,
       dh_fim date,
       status varchar2(1)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.SUMARIO IS 'Totalização da Conciliação executada';
COMMENT ON COLUMN AUDITEX.SUMARIO.id IS 'Id do sumario';
COMMENT ON COLUMN AUDITEX.SUMARIO.cod_operacao IS 'Codigo da Operacao';
COMMENT ON COLUMN AUDITEX.SUMARIO.id_usuario IS 'Id do usuario que executou a conciliacao';
COMMENT ON COLUMN AUDITEX.SUMARIO.dh_agenda IS 'Data e hora agendada';
COMMENT ON COLUMN AUDITEX.SUMARIO.dh_inicio IS 'Data e hora do inicio do processamento';
COMMENT ON COLUMN AUDITEX.SUMARIO.dh_fim IS 'Data e hora do fim do processamento';
COMMENT ON COLUMN AUDITEX.SUMARIO.status IS 'Situação do processamento (0-agendado, 1..7-em processamento, 8-finalizado, 9-cancelado)';

-- =========================================================================
-- SUMARIO_CORRECAO
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.SUMARIO_CORRECAO(
       id numeric(10) NOT NULL,
       id_sumario numeric(10),
       cod_situacao varchar2(3),
       status varchar2(1),
       qtde_solic numeric(5),
       qtde_proc numeric(5),
       id_usuario numeric(10),
       dh_geracao date,
       dh_solic date,
       dh_gerado date,
       dh_comunicacao date,
       dh_comunicado date,
       dh_fim date
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.SUMARIO_CORRECAO IS 'Solicitação de Correção da Conciliação de Terminais';
COMMENT ON COLUMN AUDITEX.SUMARIO_CORRECAO.id IS 'Id do registro solicitando a correção';
COMMENT ON COLUMN AUDITEX.SUMARIO_CORRECAO.id_sumario IS 'Id do sumario que solicitou a correção';
COMMENT ON COLUMN AUDITEX.SUMARIO_CORRECAO.cod_situacao IS 'Codigo da situação para a qual foi solicitada a correção';
COMMENT ON COLUMN AUDITEX.SUMARIO_CORRECAO.status IS 'Status (0-solicitado, 1-gera cmd, 2-gerados, 3-comunicando, 4-comunicado, 8-OK, 9-cancel';
COMMENT ON COLUMN AUDITEX.SUMARIO_CORRECAO.qtde_solic IS 'Quantidade solicitada para corrigir';
COMMENT ON COLUMN AUDITEX.SUMARIO_CORRECAO.qtde_proc IS 'Quantidade processada';
COMMENT ON COLUMN AUDITEX.SUMARIO_CORRECAO.id_usuario IS 'Id do usuario que solicitou a correcao';
COMMENT ON COLUMN AUDITEX.SUMARIO_CORRECAO.dh_geracao IS 'Data e Hora de inicio da geração de comandos (St=1)';
COMMENT ON COLUMN AUDITEX.SUMARIO_CORRECAO.dh_solic IS 'Data e Hora da solicitação da correção (St=0)';
COMMENT ON COLUMN AUDITEX.SUMARIO_CORRECAO.dh_gerado IS 'Data e Hora do fim da geração de comandos (St=2)';
COMMENT ON COLUMN AUDITEX.SUMARIO_CORRECAO.dh_comunicacao IS 'Data e Hora do inicio da comunicação (St=3)';
COMMENT ON COLUMN AUDITEX.SUMARIO_CORRECAO.dh_comunicado IS 'Data e Hora do fim da comunicacao (St=4)';
COMMENT ON COLUMN AUDITEX.SUMARIO_CORRECAO.dh_fim IS 'Data e Hora do fim do processo (St=8 ou 9)';

-- =========================================================================
-- SUMARIO_SITUACAO
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.SUMARIO_SITUACAO(
       id numeric(10) NOT NULL,
       id_sumario numeric(10) NOT NULL,
       cod_situacao varchar2(3) NOT NULL,
       qtde numeric(10)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.SUMARIO_SITUACAO IS 'Total de cada situação para o sumario';
COMMENT ON COLUMN AUDITEX.SUMARIO_SITUACAO.id IS 'Id do registro';
COMMENT ON COLUMN AUDITEX.SUMARIO_SITUACAO.id_sumario IS 'Id do sumario';
COMMENT ON COLUMN AUDITEX.SUMARIO_SITUACAO.cod_situacao IS 'Codigo da Situacao do relatório';
COMMENT ON COLUMN AUDITEX.SUMARIO_SITUACAO.qtde IS 'Quantidade de terminais classificados neste caso';

-- =========================================================================
-- TERMINAL_CTRL_A
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.TERMINAL_CTRL_A(
       id numeric(10) NOT NULL,
       cod_operacao varchar2(10) NOT NULL,
       num_serie varchar2(20) NOT NULL,
       ativo char(1),
       mapaCanais varchar2(10),
       chaves varchar2(400),
       cod_contrato varchar2(20)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.TERMINAL_CTRL_A IS 'Tabela de terminais extraidos da Controladora (ACC)';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_A.id IS 'Id do registro gerado';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_A.cod_operacao IS 'Codigo da operação processada';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_A.num_serie IS 'Numero de Serie do equipamento';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_A.ativo IS 'Status do terminal: Ativo (Y/N)';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_A.mapaCanais IS 'Mapa de canais do terminal (ACC)';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_A.chaves IS 'Chaves da controladora';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_A.cod_contrato IS 'Codigo do contrato associado ao terminal';

-- =========================================================================
-- TERMINAL_CTRL_D
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.TERMINAL_CTRL_D(
       id numeric(10) NOT NULL,
       cod_operacao varchar2(10) NOT NULL,
       num_serie varchar2(20) NOT NULL,
       ativo char(1),
       cod_contrato varchar2(20),
       chaves varchar2(400)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.TERMINAL_CTRL_D IS 'Tabela de terminais extraidos da Controladora (Conax)';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_D.id IS 'Id do registro gerado';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_D.cod_operacao IS 'Codigo da operação processada';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_D.num_serie IS 'Numero de Serie do equipamento';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_D.ativo IS 'Status do terminal: Ativo (Y/N)';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_D.cod_contrato IS 'Codigo do contrato associado ao terminal';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_D.chaves IS 'Chaves da controladora';

-- =========================================================================
-- TERMINAL_CTRL_I
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.TERMINAL_CTRL_I(
       id numeric(10) NOT NULL,
       cod_operacao varchar2(10) NOT NULL,
       num_serie varchar2(20) NOT NULL,
       ativo char(1),
       cod_contrato varchar2(20),
       package_id numeric(10),
       package_def_id numeric(10),
       package_name varchar2(50),
       subscriberId numeric(10),
       upload numeric(10),
       download numeric(10)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.TERMINAL_CTRL_I IS 'Tabela de terminais extraidos da Controladora (BBX)';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_I.id IS 'Id do registro gerado';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_I.cod_operacao IS 'Codigo da operação processada';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_I.num_serie IS 'Numero de Serie do equipamento';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_I.ativo IS 'Status do terminal: Ativo (Y/N)';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_I.cod_contrato IS 'Codigo do contrato associado ao terminal';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_I.package_id IS 'Package Id';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_I.package_def_id IS 'Package Definition Id';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_I.package_name IS 'Package Name';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_I.subscriberId IS 'Subscriber Id';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_I.upload IS 'Upload speed';
COMMENT ON COLUMN AUDITEX.TERMINAL_CTRL_I.download IS 'Download speed';

-- =========================================================================
-- TERMINAL_SMS_A
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.TERMINAL_SMS_A(
       id numeric(10) NOT NULL,
       cod_operacao varchar2(10) NOT NULL,
       cod_contrato varchar2(20),
       num_serie varchar2(20) NOT NULL,
       ativo char(1),
       mapaCanais varchar2(10),
       chaves varchar2(400)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.TERMINAL_SMS_A IS 'Tabela de terminais gerada a partir de dados do GXV (Analogico)';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_A.id IS 'Id do registro gerado';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_A.cod_operacao IS 'Codigo da Operação Associada';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_A.cod_contrato IS 'Codigo do contrato associado ao terminal (abocod)';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_A.num_serie IS 'Numero de Serie do equipamento';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_A.ativo IS 'Status do terminal: Ativo (Y/N)';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_A.mapaCanais IS 'Mapa de canais do terminal (ACC)';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_A.chaves IS 'Chaves da controladora';

-- =========================================================================
-- TERMINAL_SMS_D
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.TERMINAL_SMS_D(
       id numeric(10) NOT NULL,
       cod_operacao varchar2(10) NOT NULL,
       cod_contrato varchar2(20),
       num_serie varchar2(20) NOT NULL,
       ativo char(1),
       chaves varchar2(400),
       caixa varchar2(20)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.TERMINAL_SMS_D IS 'Tabela de terminais gerada a partir de dados do GXV (Digital)';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_D.id IS 'Id do registro gerado';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_D.cod_operacao IS 'Codigo da Operação Associada';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_D.cod_contrato IS 'Codigo do contrato associado ao terminal (abocod)';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_D.num_serie IS 'Numero de Serie do equipamento (smartcard - carcod)';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_D.ativo IS 'Status do terminal: Ativo (Y/N)';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_D.chaves IS 'Chaves da controladora';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_D.caixa IS 'Numero da caixa associada ao SmartCard (decnroser)';

-- =========================================================================
-- TERMINAL_SMS_I
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.TERMINAL_SMS_I(
       id numeric(10) NOT NULL,
       cod_operacao varchar2(10) NOT NULL,
       cod_contrato varchar2(20),
       num_serie varchar2(20) NOT NULL,
       ativo char(1),
       package_def_id numeric(10),
       cod_ponto numeric(10),
       cod_produto numeric(10)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.TERMINAL_SMS_I IS 'Tabela de terminais gerada a partir de dados do GXV (Internet)';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_I.id IS 'Id do registro gerado';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_I.cod_operacao IS 'Codigo da Operação Associada';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_I.cod_contrato IS 'Codigo do contrato associado ao terminal (abocod)';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_I.num_serie IS 'Numero de Serie do equipamento';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_I.ativo IS 'Status do terminal: Ativo (Y/N)';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_I.package_def_id IS 'Package Definition Id';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_I.cod_ponto IS 'Codigo do ponto do equipamento (iconcod)';
COMMENT ON COLUMN AUDITEX.TERMINAL_SMS_I.cod_produto IS 'Codigo do produto associado ao campo';

-- =========================================================================
-- USUARIO
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.USUARIO(
       id numeric(10) NOT NULL,
       nome varchar2(50) NOT NULL,
       email varchar2(100),
       login varchar2(30) NOT NULL,
       senha varchar2(30),
       situacao varchar2(1),
       id_perfil numeric(10) NOT NULL,
       telefone varchar2(50)
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.USUARIO IS 'Cadastro de usuarios do Sistema';
COMMENT ON COLUMN AUDITEX.USUARIO.id IS 'Id do usuario';
COMMENT ON COLUMN AUDITEX.USUARIO.nome IS 'Nome do usuário';
COMMENT ON COLUMN AUDITEX.USUARIO.email IS 'e-mail do usuário';
COMMENT ON COLUMN AUDITEX.USUARIO.login IS 'login do usuario no sistema';
COMMENT ON COLUMN AUDITEX.USUARIO.senha IS 'Senha do usuario (criptografada)';
COMMENT ON COLUMN AUDITEX.USUARIO.situacao IS 'Situacao do usuario (Ativo, Inativo, Cancelado)';
COMMENT ON COLUMN AUDITEX.USUARIO.id_perfil IS 'Id do perfil do usuário';
COMMENT ON COLUMN AUDITEX.USUARIO.telefone IS 'Telefone do Usuário';

-- =========================================================================
-- USUARIO_OPERACAO
-- =========================================================================
-- Criação da TABLE
CREATE TABLE AUDITEX.USUARIO_OPERACAO(
       id numeric(10) NOT NULL,
       id_usuario numeric(10) NOT NULL,
       cod_operacao varchar2(10) NOT NULL
);

-- Criação de Comentários
COMMENT ON TABLE AUDITEX.USUARIO_OPERACAO IS 'Associa usuário às operações que tem acesso';
COMMENT ON COLUMN AUDITEX.USUARIO_OPERACAO.id IS 'Id do registro';
COMMENT ON COLUMN AUDITEX.USUARIO_OPERACAO.id_usuario IS 'Id do usuario';
COMMENT ON COLUMN AUDITEX.USUARIO_OPERACAO.cod_operacao IS 'Codigo da Operação Associada';


-- =========================================================================
-- Criação de Sequences 
-- =========================================================================
CREATE SEQUENCE AUDITEX.CORRECAO_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.DETALHE_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.MENU_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.PARAMETRO_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.PERFIL_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.PERFIL_MENU_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.PRODUTO_CHAVE_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.SUMARIO_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.SUMARIO_CORRECAO_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.SUMARIO_SITUACAO_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.TERMINAL_CTRL_A_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.TERMINAL_CTRL_D_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.TERMINAL_CTRL_I_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.TERMINAL_SMS__A_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.TERMINAL_SMS__D_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.TERMINAL_SMS__I_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.USUARIO_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;
CREATE SEQUENCE AUDITEX.USUARIO_OPERACAO_SEQ START WITH 1 INCREMENT BY 1 MINVALUE 1 MAXVALUE 9999999999 NOCYCLE NOCACHE NOORDER;

-- =========================================================================
-- Criação de Primary Keys
-- =========================================================================
ALTER TABLE AUDITEX.CHAVE ADD CONSTRAINT PK_CHAVE PRIMARY KEY (chave);
ALTER TABLE AUDITEX.CIDADE ADD CONSTRAINT PK_CIDADE PRIMARY KEY (codigo);
ALTER TABLE AUDITEX.CORRECAO ADD CONSTRAINT PK_CORRECAO PRIMARY KEY (id);
ALTER TABLE AUDITEX.DETALHE ADD CONSTRAINT PK_DETALHE PRIMARY KEY (id);
ALTER TABLE AUDITEX.MENU ADD CONSTRAINT PK_MENU PRIMARY KEY (id);
ALTER TABLE AUDITEX.OPERACAO ADD CONSTRAINT PK_OPERACAO PRIMARY KEY (codigo);
ALTER TABLE AUDITEX.PARAMETRO ADD CONSTRAINT PK_PARAMETRO PRIMARY KEY (id);
ALTER TABLE AUDITEX.PERFIL ADD CONSTRAINT PK_PERFIL PRIMARY KEY (id);
ALTER TABLE AUDITEX.PERFIL_MENU ADD CONSTRAINT PK_PERFIL_MENU PRIMARY KEY (id);
ALTER TABLE AUDITEX.PRODUTO ADD CONSTRAINT PK_PRODUTO PRIMARY KEY (codigo);
ALTER TABLE AUDITEX.PRODUTO_CHAVE ADD CONSTRAINT PK_PRODUTO_CHAVE PRIMARY KEY (id);
ALTER TABLE AUDITEX.SITUACAO ADD CONSTRAINT PK_SITUACAO PRIMARY KEY (codigo);
ALTER TABLE AUDITEX.SUMARIO ADD CONSTRAINT PK_SUMARIO PRIMARY KEY (id);
ALTER TABLE AUDITEX.SUMARIO_CORRECAO ADD CONSTRAINT PK_SUMARIO_CORRECAO PRIMARY KEY (id);
ALTER TABLE AUDITEX.SUMARIO_SITUACAO ADD CONSTRAINT PK_SUMARIO_SITUACAO PRIMARY KEY (id);
ALTER TABLE AUDITEX.TERMINAL_CTRL_A ADD CONSTRAINT PK_TERMINAL_CTRL_A PRIMARY KEY (id);
ALTER TABLE AUDITEX.TERMINAL_CTRL_D ADD CONSTRAINT PK_TERMINAL_CTRL_D PRIMARY KEY (id);
ALTER TABLE AUDITEX.TERMINAL_CTRL_I ADD CONSTRAINT PK_TERMINAL_CTRL_I PRIMARY KEY (id);
ALTER TABLE AUDITEX.TERMINAL_SMS_A ADD CONSTRAINT PK_TERMINAL_SMS_A PRIMARY KEY (id);
ALTER TABLE AUDITEX.TERMINAL_SMS_D ADD CONSTRAINT PK_TERMINAL_SMS_D PRIMARY KEY (id);
ALTER TABLE AUDITEX.TERMINAL_SMS_I ADD CONSTRAINT PK_TERMINAL_SMS_I PRIMARY KEY (id);
ALTER TABLE AUDITEX.USUARIO ADD CONSTRAINT PK_USUARIO PRIMARY KEY (id);
ALTER TABLE AUDITEX.USUARIO_OPERACAO ADD CONSTRAINT PK_USUARIO_OPERACAO PRIMARY KEY (id);

-- =========================================================================
-- Criação de Indexes
-- =========================================================================
CREATE INDEX AUDITEX.CORRECAO_idDetalhe ON AUDITEX.CORRECAO(id_detalhe);
CREATE INDEX AUDITEX.CORRECAO_idSumario ON AUDITEX.CORRECAO(id_sumario);
CREATE INDEX AUDITEX.CORRECAO_numSerie ON AUDITEX.CORRECAO(num_serie);
CREATE INDEX AUDITEX.CORRECAO_status ON AUDITEX.CORRECAO(status);
CREATE INDEX AUDITEX.DETALHE_idSituacao ON AUDITEX.DETALHE(id_situacao);
CREATE INDEX AUDITEX.DETALHE_idSumario ON AUDITEX.DETALHE(id_sumario);
CREATE INDEX AUDITEX.DETALHE_numSerie ON AUDITEX.DETALHE(num_serie);
CREATE INDEX AUDITEX.MENU_estruturado ON AUDITEX.MENU(nivel1, nivel2);
CREATE INDEX AUDITEX.PARAMETRO_unico ON AUDITEX.PARAMETRO(tipo, nome);
CREATE INDEX AUDITEX.PERFIL_MENU_menu ON AUDITEX.PERFIL_MENU(id_menu);
CREATE INDEX AUDITEX.PERFIL_MENU_perfil ON AUDITEX.PERFIL_MENU(id_perfil);
CREATE INDEX AUDITEX.PERFIL_MENU_unico ON AUDITEX.PERFIL_MENU(id_perfil, id_menu);
CREATE INDEX AUDITEX.PRODUTO_CHAVE_unico ON AUDITEX.PRODUTO_CHAVE(cod_produto, chave);
CREATE INDEX AUDITEX.SUMARIO_operacao ON AUDITEX.SUMARIO(cod_operacao);
CREATE INDEX AUDITEX.SUMARIO_CORRECAO_codSituacao ON AUDITEX.SUMARIO_CORRECAO(cod_situacao);
CREATE INDEX AUDITEX.SUMARIO_CORRECAO_idSumario ON AUDITEX.SUMARIO_CORRECAO(id_sumario);
CREATE INDEX AUDITEX.SUMARIO_SITUACAO_situacao ON AUDITEX.SUMARIO_SITUACAO(cod_situacao);
CREATE INDEX AUDITEX.SUMARIO_SITUACAO_sumario ON AUDITEX.SUMARIO_SITUACAO(id_sumario);
CREATE INDEX AUDITEX.SUMARIO_SITUACAO_unico ON AUDITEX.SUMARIO_SITUACAO(id_sumario, cod_situacao);
CREATE INDEX AUDITEX.TERMINAL_CTRL_A_codOperacao ON AUDITEX.TERMINAL_CTRL_A(cod_operacao);
CREATE INDEX AUDITEX.TERMINAL_CTRL_A_numSerie ON AUDITEX.TERMINAL_CTRL_A(num_serie);
CREATE INDEX AUDITEX.TERMINAL_CTRL_A_unico ON AUDITEX.TERMINAL_CTRL_A(cod_operacao, num_serie);
CREATE INDEX AUDITEX.TERMINAL_CTRL_D_codOperacao ON AUDITEX.TERMINAL_CTRL_D(cod_operacao);
CREATE INDEX AUDITEX.TERMINAL_CTRL_D_numSerie ON AUDITEX.TERMINAL_CTRL_D(num_serie);
CREATE INDEX AUDITEX.TERMINAL_CTRL_D_unico ON AUDITEX.TERMINAL_CTRL_D(cod_operacao, num_serie);
CREATE INDEX AUDITEX.TERMINAL_CTRL_I_codOperacao ON AUDITEX.TERMINAL_CTRL_I(cod_operacao);
CREATE INDEX AUDITEX.TERMINAL_CTRL_I_numSerie ON AUDITEX.TERMINAL_CTRL_I(num_serie);
CREATE INDEX AUDITEX.TERMINAL_CTRL_I_unico ON AUDITEX.TERMINAL_CTRL_I(cod_operacao, num_serie);
CREATE INDEX AUDITEX.TERMINAL_SMS_A_codOperacao ON AUDITEX.TERMINAL_SMS_A(cod_operacao);
CREATE INDEX AUDITEX.TERMINAL_SMS_A_numSerie ON AUDITEX.TERMINAL_SMS_A(num_serie);
CREATE INDEX AUDITEX.TERMINAL_SMS_A_unico ON AUDITEX.TERMINAL_SMS_A(cod_operacao, num_serie);
CREATE INDEX AUDITEX.TERMINAL_SMS_D_codOperacao ON AUDITEX.TERMINAL_SMS_D(cod_operacao);
CREATE INDEX AUDITEX.TERMINAL_SMS_D_numSerie ON AUDITEX.TERMINAL_SMS_D(num_serie);
CREATE INDEX AUDITEX.TERMINAL_SMS_D_unico ON AUDITEX.TERMINAL_SMS_D(cod_operacao, num_serie);
CREATE INDEX AUDITEX.TERMINAL_SMS_I_codOperacao ON AUDITEX.TERMINAL_SMS_I(cod_operacao);
CREATE INDEX AUDITEX.TERMINAL_SMS_I_numSerie ON AUDITEX.TERMINAL_SMS_I(num_serie);
CREATE INDEX AUDITEX.TERMINAL_SMS_I_unico ON AUDITEX.TERMINAL_SMS_I(cod_operacao, num_serie);
CREATE INDEX AUDITEX.USUARIO_login ON AUDITEX.USUARIO(login);
CREATE INDEX AUDITEX.USUARIO_perfil ON AUDITEX.USUARIO(id_perfil);
CREATE INDEX AUDITEX.USUARIO_OPERACAO_operacao ON AUDITEX.USUARIO_OPERACAO(cod_operacao);
CREATE INDEX AUDITEX.USUARIO_OPERACAO_unico ON AUDITEX.USUARIO_OPERACAO(id_usuario, cod_operacao);
CREATE INDEX AUDITEX.USUARIO_OPERACAO_usuario ON AUDITEX.USUARIO_OPERACAO(id_usuario);

-- =========================================================================
-- Criação de Constraints
-- =========================================================================
ALTER TABLE AUDITEX.MENU ADD CONSTRAINT CK_MENU_situacao CHECK(situacao IN('A','C','T'));
ALTER TABLE AUDITEX.MENU ADD CONSTRAINT UK_MENU_estruturado UNIQUE(nivel1, nivel2);
ALTER TABLE AUDITEX.OPERACAO ADD CONSTRAINT FK_OPERACAO_cidade FOREIGN KEY(cod_cidade) REFERENCES AUDITEX.CIDADE(codigo);
ALTER TABLE AUDITEX.OPERACAO ADD CONSTRAINT CK_OPERACAO_tecnologia CHECK(tecnologia IN('A','D','I'));
ALTER TABLE AUDITEX.PARAMETRO ADD CONSTRAINT UK_PARAMETRO_unico UNIQUE(tipo, nome);
ALTER TABLE AUDITEX.PERFIL_MENU ADD CONSTRAINT UK_PERFIL_MENU_unico UNIQUE(id_perfil, id_menu);
ALTER TABLE AUDITEX.PRODUTO_CHAVE ADD CONSTRAINT UK_PRODUTO_CHAVE_unico UNIQUE(cod_produto, chave);
ALTER TABLE AUDITEX.SUMARIO ADD CONSTRAINT FK_SUMARIO_operacao FOREIGN KEY(cod_operacao) REFERENCES AUDITEX.OPERACAO(codigo);
ALTER TABLE AUDITEX.SUMARIO ADD CONSTRAINT FK_SUMARIO_usuario FOREIGN KEY(id_usuario) REFERENCES AUDITEX.USUARIO(id);
ALTER TABLE AUDITEX.SUMARIO_SITUACAO ADD CONSTRAINT FK_SUMARIO_SITUACAO_situacao FOREIGN KEY(cod_situacao) REFERENCES AUDITEX.SITUACAO(codigo);
ALTER TABLE AUDITEX.SUMARIO_SITUACAO ADD CONSTRAINT FK_SUMARIO_SITUACAO_sumario FOREIGN KEY(id_sumario) REFERENCES AUDITEX.SUMARIO(id);
ALTER TABLE AUDITEX.SUMARIO_SITUACAO ADD CONSTRAINT UK_SUMARIO_SITUACAO_unico UNIQUE(id_sumario, cod_situacao);
ALTER TABLE AUDITEX.TERMINAL_CTRL_A ADD CONSTRAINT UK_TERMINAL_CTRL_A_unico UNIQUE(cod_operacao, num_serie);
ALTER TABLE AUDITEX.TERMINAL_CTRL_A ADD CONSTRAINT YN_TERMINAL_CTRL_A_ativo CHECK(ativo IN ('Y', 'N'));
ALTER TABLE AUDITEX.TERMINAL_CTRL_D ADD CONSTRAINT UK_TERMINAL_CTRL_D_unico UNIQUE(cod_operacao, num_serie);
ALTER TABLE AUDITEX.TERMINAL_CTRL_D ADD CONSTRAINT YN_TERMINAL_CTRL_D_ativo CHECK(ativo IN ('Y', 'N'));
ALTER TABLE AUDITEX.TERMINAL_CTRL_I ADD CONSTRAINT UK_TERMINAL_CTRL_I_unico UNIQUE(cod_operacao, num_serie);
ALTER TABLE AUDITEX.TERMINAL_CTRL_I ADD CONSTRAINT YN_TERMINAL_CTRL_I_ativo CHECK(ativo IN ('Y', 'N'));
ALTER TABLE AUDITEX.TERMINAL_SMS_A ADD CONSTRAINT UK_TERMINAL_SMS_A_unico UNIQUE(cod_operacao, num_serie);
ALTER TABLE AUDITEX.TERMINAL_SMS_A ADD CONSTRAINT YN_TERMINAL_SMS_A_ativo CHECK(ativo IN ('Y', 'N'));
ALTER TABLE AUDITEX.TERMINAL_SMS_D ADD CONSTRAINT UK_TERMINAL_SMS_D_unico UNIQUE(cod_operacao, num_serie);
ALTER TABLE AUDITEX.TERMINAL_SMS_D ADD CONSTRAINT YN_TERMINAL_SMS_D_ativo CHECK(ativo IN ('Y', 'N'));
ALTER TABLE AUDITEX.TERMINAL_SMS_I ADD CONSTRAINT UK_TERMINAL_SMS_I_unico UNIQUE(cod_operacao, num_serie);
ALTER TABLE AUDITEX.TERMINAL_SMS_I ADD CONSTRAINT YN_TERMINAL_SMS_I_ativo CHECK(ativo IN ('Y', 'N'));
ALTER TABLE AUDITEX.USUARIO ADD CONSTRAINT FK_USUARIO_perfil FOREIGN KEY(id_perfil) REFERENCES AUDITEX.PERFIL(id);
ALTER TABLE AUDITEX.USUARIO ADD CONSTRAINT CK_USUARIO_situacao CHECK(situacao IN('A','I','C'));
ALTER TABLE AUDITEX.USUARIO ADD CONSTRAINT UK_USUARIO_login UNIQUE(login);
ALTER TABLE AUDITEX.USUARIO_OPERACAO ADD CONSTRAINT UK_USUARIO_OPERACAO_unico UNIQUE(id_usuario, cod_operacao);

