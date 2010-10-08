-- SQL Manager 2005 Lite for PostgreSQL 3.5.0.1
-- ---------------------------------------
-- Host      : localhost
-- Database  : webcontacts
-- Version:  : PostgreSQL 8.1.3 on i686-pc-mingw32, compiled by GCC gcc.exe (GCC) 3.4.2 (mingw-special)


--
-- Structure for table contato (OID = 119948) : 
--
CREATE TABLE contato (
    idcontato serial NOT NULL,
    nome character varying(255),
    contato_principal integer
);
--
-- Structure for table contato_empresa (OID = 119953) : 
--
CREATE TABLE contato_empresa (
    nome_fantasia character varying(255) NOT NULL,
    id integer NOT NULL
);
--
-- Structure for table tipo (OID = 119964) : 
--
CREATE TABLE tipo (
    id serial NOT NULL,
    descricao character varying(20) NOT NULL
);
--
-- Structure for table telefone (OID = 119973) : 
--
CREATE TABLE telefone (
    id serial NOT NULL,
    numero character varying(20) NOT NULL,
    tipo integer NOT NULL,
    contato integer NOT NULL
);
--
-- Data for blobs (OID = 119948) (LIMIT 0,1)
--
INSERT INTO contato (idcontato, nome, contato_principal) VALUES (1, 'Marcelo', NULL);
--
-- Data for blobs (OID = 119964) (LIMIT 0,2)
--
INSERT INTO tipo (id, descricao) VALUES (1, 'Residencial');
INSERT INTO tipo (id, descricao) VALUES (2, 'Comercial');
--
-- Data for blobs (OID = 119973) (LIMIT 0,6)
--
INSERT INTO telefone (id, numero, tipo, contato) VALUES (4, '8131-4775', 1, 1);
INSERT INTO telefone (id, numero, tipo, contato) VALUES (5, '8131-4775', 1, 1);
INSERT INTO telefone (id, numero, tipo, contato) VALUES (6, '8131-4775', 1, 1);
INSERT INTO telefone (id, numero, tipo, contato) VALUES (7, '8131-4775', 1, 1);
INSERT INTO telefone (id, numero, tipo, contato) VALUES (8, '8131-4775', 1, 1);
INSERT INTO telefone (id, numero, tipo, contato) VALUES (9, '8131-4775', 1, 1);
--
-- Definition for index contato_pkey (OID = 119951) : 
--
ALTER TABLE ONLY contato
    ADD CONSTRAINT contato_pkey PRIMARY KEY (idcontato);
--
-- Definition for index tipo_pkey (OID = 119967) : 
--
ALTER TABLE ONLY tipo
    ADD CONSTRAINT tipo_pkey PRIMARY KEY (id);
--
-- Definition for index telefone_pkey (OID = 119976) : 
--
ALTER TABLE ONLY telefone
    ADD CONSTRAINT telefone_pkey PRIMARY KEY (id);
--
-- Definition for index telefone_fk (OID = 119978) : 
--
ALTER TABLE ONLY telefone
    ADD CONSTRAINT telefone_fk FOREIGN KEY (tipo) REFERENCES tipo(id);
--
-- Definition for index telefone_fk1 (OID = 119983) : 
--
ALTER TABLE ONLY telefone
    ADD CONSTRAINT telefone_fk1 FOREIGN KEY (contato) REFERENCES contato(idcontato) ON UPDATE CASCADE ON DELETE CASCADE;
--
-- Definition for index contato_empresa_pkey (OID = 119988) : 
--
ALTER TABLE ONLY contato_empresa
    ADD CONSTRAINT contato_empresa_pkey PRIMARY KEY (id);
--
-- Definition for index contato_empresa_fk (OID = 119990) : 
--
ALTER TABLE ONLY contato_empresa
    ADD CONSTRAINT contato_empresa_fk FOREIGN KEY (id) REFERENCES contato(idcontato) ON UPDATE CASCADE ON DELETE CASCADE;
--
-- Definition for index contato_fk (OID = 119995) : 
--
ALTER TABLE ONLY contato
    ADD CONSTRAINT contato_fk FOREIGN KEY (contato_principal) REFERENCES contato(idcontato) ON UPDATE CASCADE ON DELETE CASCADE;
--
-- Data for sequence public.contato_idcontato_seq (OID = 119946)
--
SELECT pg_catalog.setval('contato_idcontato_seq', 1, true);
--
-- Data for sequence public.tipo_id_seq (OID = 119962)
--
SELECT pg_catalog.setval('tipo_id_seq', 2, true);
--
-- Data for sequence public.telefone_id_seq (OID = 119971)
--
SELECT pg_catalog.setval('telefone_id_seq', 9, true);
