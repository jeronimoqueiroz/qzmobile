
-- PRODUTO

INSERT ALL
 INTO auditex.produto (codigo, descricao) VALUES (1, 'Economico')
 INTO auditex.produto (codigo, descricao) VALUES (2, 'Opcao 05')
 INTO auditex.produto (codigo, descricao) VALUES (3, 'Opcao 10')
 INTO auditex.produto (codigo, descricao) VALUES (4, 'Opcao 20')
 INTO auditex.produto (codigo, descricao) VALUES (5, 'Opcao 30')
 INTO auditex.produto (codigo, descricao) VALUES (6, 'Opcao 60')
 INTO auditex.produto (codigo, descricao) VALUES (7, 'Familia')
 INTO auditex.produto (codigo, descricao) VALUES (8, 'Variedades')
 INTO auditex.produto (codigo, descricao) VALUES (9, 'Esportes')
 INTO auditex.produto (codigo, descricao) VALUES (10, '')
 INTO auditex.produto (codigo, descricao) VALUES (11, 'Telecine 2')
 INTO auditex.produto (codigo, descricao) VALUES (12, 'Telecine 1')
 INTO auditex.produto (codigo, descricao) VALUES (13, 'Premiere 1')
 INTO auditex.produto (codigo, descricao) VALUES (14, 'Premiere 2')
 INTO auditex.produto (codigo, descricao) VALUES (15, 'Premiere 3')
 INTO auditex.produto (codigo, descricao) VALUES (16, 'Premiere 4')
 INTO auditex.produto (codigo, descricao) VALUES (17, 'Premiere 5')
 INTO auditex.produto (codigo, descricao) VALUES (18, 'Premiere 1-2-3-4-5-6-7-8-9-10')
 INTO auditex.produto (codigo, descricao) VALUES (19, 'Combate')
 INTO auditex.produto (codigo, descricao) VALUES (20, 'Playboy')
 INTO auditex.produto (codigo, descricao) VALUES (21, 'Sexy Hot')
 INTO auditex.produto (codigo, descricao) VALUES (22, 'Sex Prive')
 INTO auditex.produto (codigo, descricao) VALUES (23, 'Pac. Adultos')
 INTO auditex.produto (codigo, descricao) VALUES (24, 'Telecine Fun')
 INTO auditex.produto (codigo, descricao) VALUES (25, '')
 INTO auditex.produto (codigo, descricao) VALUES (26, '')
 INTO auditex.produto (codigo, descricao) VALUES (27, 'CANAL PLAYBOY+SEXY HOT DIGITAL')
 INTO auditex.produto (codigo, descricao) VALUES (28, 'Opcao 01 (OPX)')
 INTO auditex.produto (codigo, descricao) VALUES (29, 'Comb+PFC I A+RJ')
 INTO auditex.produto (codigo, descricao) VALUES (30, 'Comb+PFC I A+SP')
 INTO auditex.produto (codigo, descricao) VALUES (31, 'Comb+PFC I B+RJ')
 INTO auditex.produto (codigo, descricao) VALUES (32, 'Comb+PFC I B+SP')
 INTO auditex.produto (codigo, descricao) VALUES (33, 'Comb+PFC II A+RJ+SP')
 INTO auditex.produto (codigo, descricao) VALUES (34, 'Comb+PFC II B+RJ+SP')
 INTO auditex.produto (codigo, descricao) VALUES (35, 'Comb+PFC II A+B+RJ')
 INTO auditex.produto (codigo, descricao) VALUES (36, 'Comb+PFC II A+B+SP')
 INTO auditex.produto (codigo, descricao) VALUES (37, 'PFC I A+Paulista')
 INTO auditex.produto (codigo, descricao) VALUES (38, 'PFC I B+Paulista')
 INTO auditex.produto (codigo, descricao) VALUES (39, 'PFC II A+B+SP')
 INTO auditex.produto (codigo, descricao) VALUES (40, 'PFC II A+RJ+SP')
 INTO auditex.produto (codigo, descricao) VALUES (41, 'PFC II B+RJ+SP')
 INTO auditex.produto (codigo, descricao) VALUES (42, 'PFC A + CARIOCA DIGITAL')
 INTO auditex.produto (codigo, descricao) VALUES (43, 'PFC B + CARIOCA DIGITAL')
 INTO auditex.produto (codigo, descricao) VALUES (44, 'PFC A+B+CARIOCA DIGITAL')
 INTO auditex.produto (codigo, descricao) VALUES (45, 'PFC A+B+CARI+PAUL DIGITAL')
 INTO auditex.produto (codigo, descricao) VALUES (46, 'Opção 10 2011 Corp')
 INTO auditex.produto (codigo, descricao) VALUES (47, 'Opção 60 2011 Corp')
 INTO auditex.produto (codigo, descricao) VALUES (48, 'Opção 01 Corp')
 INTO auditex.produto (codigo, descricao) VALUES (49, 'Opção 30 Corp')
 INTO auditex.produto (codigo, descricao) VALUES (50, 'Opção 30 2011 Corp')
 INTO auditex.produto (codigo, descricao) VALUES (51, 'Telecine 2011')
 INTO auditex.produto (codigo, descricao) VALUES (52, 'Opção 07')
 INTO auditex.produto (codigo, descricao) VALUES (53, 'Opção 07 Corp')
 INTO auditex.produto (codigo, descricao) VALUES (54, 'Premiere 6')
 INTO auditex.produto (codigo, descricao) VALUES (55, 'Premiere 7')
 INTO auditex.produto (codigo, descricao) VALUES (56, 'Premiere 8')
 INTO auditex.produto (codigo, descricao) VALUES (57, 'Premiere 9')
 INTO auditex.produto (codigo, descricao) VALUES (58, 'Premiere 10')
 INTO auditex.produto (codigo, descricao) VALUES (59, 'Premiere BBB')
 INTO auditex.produto (codigo, descricao) VALUES (999, 'Opcao ALL')
SELECT * FROM dual;

-- CHAVE

INSERT ALL
 INTO auditex.chave (chave, descricao) VALUES (121, 'Service 121')
 INTO auditex.chave (chave, descricao) VALUES (122, 'Service 122')
 INTO auditex.chave (chave, descricao) VALUES (123, 'Service 123')
 INTO auditex.chave (chave, descricao) VALUES (124, 'Service 124')
 INTO auditex.chave (chave, descricao) VALUES (125, 'Service 125')
 INTO auditex.chave (chave, descricao) VALUES (126, 'Service 126')
 INTO auditex.chave (chave, descricao) VALUES (127, 'Service 127')
SELECT * FROM dual;


-- PRODUTO_CHAVE

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 1, 101);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 2, 101);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 2, 102);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 2, 118);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 2, 122);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 3, 101);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 3, 102);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 3, 103);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 3, 118);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 3, 119);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 3, 122);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 4, 101);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 4, 102);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 4, 104);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 4, 118);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 4, 122);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 5, 101);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 5, 102);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 5, 105);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 5, 118);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 5, 122);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 6, 101);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 6, 102);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 6, 103);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 6, 104);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 6, 105);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 6, 118);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 6, 119);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 6, 122);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 6, 127);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 7, 103);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 7, 119);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 8, 104);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 9, 105);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 11, 107);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 11, 117);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 12, 106);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 12, 107);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 12, 117);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 13, 108);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 14, 109);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 15, 110);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 16, 111);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 17, 112);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 18, 108);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 18, 109);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 18, 110);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 18, 111);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 18, 112);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 18, 120);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 18, 121);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 18, 123);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 18, 124);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 18, 125);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 19, 113);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 20, 114);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 21, 115);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 22, 116);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 23, 114);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 23, 115);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 23, 116);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 24, 117);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 27, 114);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 27, 115);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 28, 101);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 28, 122);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 29, 108);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 29, 113);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 30, 108);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 30, 113);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 31, 108);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 31, 113);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 32, 108);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 32, 113);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 33, 109);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 33, 113);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 34, 109);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 34, 113);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 35, 109);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 35, 113);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 36, 109);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 36, 113);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 37, 108);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 38, 108);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 39, 109);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 40, 109);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 41, 109);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 42, 108);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 43, 109);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 44, 108);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 44, 109);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 45, 108);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 45, 109);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 46, 101);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 46, 102);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 46, 103);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 46, 118);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 46, 119);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 46, 122);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 47, 101);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 47, 102);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 47, 103);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 47, 104);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 47, 105);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 47, 118);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 47, 119);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 47, 122);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 47, 127);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 48, 101);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 48, 122);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 49, 101);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 49, 102);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 49, 105);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 49, 118);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 49, 122);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 50, 101);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 50, 102);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 50, 105);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 50, 118);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 50, 122);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 51, 106);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 51, 107);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 52, 101);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 52, 118);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 52, 119);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 52, 122);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 53, 101);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 53, 118);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 53, 119);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 53, 122);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 54, 120);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 55, 121);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 56, 123);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 57, 124);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 58, 125);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 59, 126);

INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 101);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 102);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 103);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 104);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 105);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 106);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 107);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 108);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 109);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 110);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 111);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 112);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 113);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 114);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 115);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 116);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 117);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 118);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 119);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 120);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 121);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 122);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 123);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 124);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 125);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 126);
INSERT INTO auditex.produto_chave (id, cod_produto, chave) VALUES (PRODUTO_CHAVE_SEQ.nextval, 999, 127);

