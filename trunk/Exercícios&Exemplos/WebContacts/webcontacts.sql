-- SQL Manager 2005 Lite for PostgreSQL 3.5.0.1
-- ---------------------------------------
-- Host      : localhost
-- Database  : webcontacts
-- Version:  : PostgreSQL 8.1.3 on i686-pc-mingw32, compiled by GCC gcc.exe (GCC) 3.4.2 (mingw-special)


--
-- Definition for type cube (OID = 16403) : 
--
SET search_path = public, pg_catalog;
CREATE TYPE cube (
    INTERNALLENGTH = -1,
    INPUT = cube_in,
    OUTPUT = cube_out,
    ALIGNMENT = double,
    STORAGE = plain
);
--
-- Definition for function cube_in (OID = 16404) : 
--
SET check_function_bodies = false;
CREATE FUNCTION cube_in (cstring) RETURNS cube
    AS '$libdir/cube', 'cube_in'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_out (OID = 16405) : 
--
CREATE FUNCTION cube_out (cube) RETURNS cstring
    AS '$libdir/cube', 'cube_out'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube (OID = 16407) : 
--
CREATE FUNCTION cube (text) RETURNS cube
    AS '$libdir/cube', 'cube'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Data for cast  (OID = 16408)
--
CREATE CAST (text AS cube) WITH FUNCTION cube (text) AS ASSIGNMENT;
--
-- Definition for function cube_eq (OID = 16409) : 
--
CREATE FUNCTION cube_eq (cube, cube) RETURNS boolean
    AS '$libdir/cube', 'cube_eq'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_ne (OID = 16410) : 
--
CREATE FUNCTION cube_ne (cube, cube) RETURNS boolean
    AS '$libdir/cube', 'cube_ne'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_lt (OID = 16411) : 
--
CREATE FUNCTION cube_lt (cube, cube) RETURNS boolean
    AS '$libdir/cube', 'cube_lt'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_gt (OID = 16412) : 
--
CREATE FUNCTION cube_gt (cube, cube) RETURNS boolean
    AS '$libdir/cube', 'cube_gt'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_le (OID = 16413) : 
--
CREATE FUNCTION cube_le (cube, cube) RETURNS boolean
    AS '$libdir/cube', 'cube_le'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_ge (OID = 16414) : 
--
CREATE FUNCTION cube_ge (cube, cube) RETURNS boolean
    AS '$libdir/cube', 'cube_ge'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_cmp (OID = 16415) : 
--
CREATE FUNCTION cube_cmp (cube, cube) RETURNS integer
    AS '$libdir/cube', 'cube_cmp'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_contains (OID = 16416) : 
--
CREATE FUNCTION cube_contains (cube, cube) RETURNS boolean
    AS '$libdir/cube', 'cube_contains'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_contained (OID = 16417) : 
--
CREATE FUNCTION cube_contained (cube, cube) RETURNS boolean
    AS '$libdir/cube', 'cube_contained'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_overlap (OID = 16418) : 
--
CREATE FUNCTION cube_overlap (cube, cube) RETURNS boolean
    AS '$libdir/cube', 'cube_overlap'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_union (OID = 16419) : 
--
CREATE FUNCTION cube_union (cube, cube) RETURNS cube
    AS '$libdir/cube', 'cube_union'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_inter (OID = 16420) : 
--
CREATE FUNCTION cube_inter (cube, cube) RETURNS cube
    AS '$libdir/cube', 'cube_inter'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_size (OID = 16421) : 
--
CREATE FUNCTION cube_size (cube) RETURNS double precision
    AS '$libdir/cube', 'cube_size'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_distance (OID = 16422) : 
--
CREATE FUNCTION cube_distance (cube, cube) RETURNS double precision
    AS '$libdir/cube', 'cube_distance'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_dim (OID = 16423) : 
--
CREATE FUNCTION cube_dim (cube) RETURNS integer
    AS '$libdir/cube', 'cube_dim'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_ll_coord (OID = 16424) : 
--
CREATE FUNCTION cube_ll_coord (cube, integer) RETURNS double precision
    AS '$libdir/cube', 'cube_ll_coord'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_ur_coord (OID = 16425) : 
--
CREATE FUNCTION cube_ur_coord (cube, integer) RETURNS double precision
    AS '$libdir/cube', 'cube_ur_coord'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube (OID = 16426) : 
--
CREATE FUNCTION cube (double precision) RETURNS cube
    AS '$libdir/cube', 'cube_f8'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube (OID = 16427) : 
--
CREATE FUNCTION cube (double precision, double precision) RETURNS cube
    AS '$libdir/cube', 'cube_f8_f8'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube (OID = 16428) : 
--
CREATE FUNCTION cube (cube, double precision) RETURNS cube
    AS '$libdir/cube', 'cube_c_f8'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube (OID = 16429) : 
--
CREATE FUNCTION cube (cube, double precision, double precision) RETURNS cube
    AS '$libdir/cube', 'cube_c_f8_f8'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_is_point (OID = 16430) : 
--
CREATE FUNCTION cube_is_point (cube) RETURNS boolean
    AS '$libdir/cube', 'cube_is_point'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cube_enlarge (OID = 16431) : 
--
CREATE FUNCTION cube_enlarge (cube, double precision, integer) RETURNS cube
    AS '$libdir/cube', 'cube_enlarge'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for operator > (OID = 16432) : 
--
CREATE OPERATOR > (
    PROCEDURE = cube_gt,
    LEFTARG = cube,
    RIGHTARG = cube,
    COMMUTATOR = <,
    NEGATOR = <=,
    RESTRICT = scalargtsel,
    JOIN = scalargtjoinsel
);
--
-- Definition for operator >= (OID = 16433) : 
--
CREATE OPERATOR >= (
    PROCEDURE = cube_ge,
    LEFTARG = cube,
    RIGHTARG = cube,
    COMMUTATOR = <=,
    NEGATOR = <,
    RESTRICT = scalargtsel,
    JOIN = scalargtjoinsel
);
--
-- Definition for operator < (OID = 16434) : 
--
CREATE OPERATOR < (
    PROCEDURE = cube_lt,
    LEFTARG = cube,
    RIGHTARG = cube,
    COMMUTATOR = >,
    NEGATOR = >=,
    RESTRICT = scalarltsel,
    JOIN = scalarltjoinsel
);
--
-- Definition for operator <= (OID = 16435) : 
--
CREATE OPERATOR <= (
    PROCEDURE = cube_le,
    LEFTARG = cube,
    RIGHTARG = cube,
    COMMUTATOR = >=,
    NEGATOR = >,
    RESTRICT = scalarltsel,
    JOIN = scalarltjoinsel
);
--
-- Definition for operator && (OID = 16436) : 
--
CREATE OPERATOR && (
    PROCEDURE = cube_overlap,
    LEFTARG = cube,
    RIGHTARG = cube,
    COMMUTATOR = &&,
    RESTRICT = areasel,
    JOIN = areajoinsel
);
--
-- Definition for operator <> (OID = 16437) : 
--
CREATE OPERATOR <> (
    PROCEDURE = cube_ne,
    LEFTARG = cube,
    RIGHTARG = cube,
    COMMUTATOR = <>,
    NEGATOR = =,
    RESTRICT = neqsel,
    JOIN = neqjoinsel
);
--
-- Definition for operator = (OID = 16438) : 
--
CREATE OPERATOR = (
    PROCEDURE = cube_eq,
    LEFTARG = cube,
    RIGHTARG = cube,
    COMMUTATOR = =,
    NEGATOR = <>,
    RESTRICT = eqsel,
    JOIN = eqjoinsel,
    SORT1 = <,
    SORT2 = <,
    LTCMP = <,
    GTCMP = >
);
--
-- Definition for operator ~ (OID = 16439) : 
--
CREATE OPERATOR ~ (
    PROCEDURE = cube_contained,
    LEFTARG = cube,
    RIGHTARG = cube,
    COMMUTATOR = @,
    RESTRICT = contsel,
    JOIN = contjoinsel
);
--
-- Definition for operator @ (OID = 16440) : 
--
CREATE OPERATOR @ (
    PROCEDURE = cube_contains,
    LEFTARG = cube,
    RIGHTARG = cube,
    COMMUTATOR = ~,
    RESTRICT = contsel,
    JOIN = contjoinsel
);
--
-- Definition for function g_cube_consistent (OID = 16441) : 
--
CREATE FUNCTION g_cube_consistent (internal, cube, integer) RETURNS boolean
    AS '$libdir/cube', 'g_cube_consistent'
    LANGUAGE c;
--
-- Definition for function g_cube_compress (OID = 16442) : 
--
CREATE FUNCTION g_cube_compress (internal) RETURNS internal
    AS '$libdir/cube', 'g_cube_compress'
    LANGUAGE c;
--
-- Definition for function g_cube_decompress (OID = 16443) : 
--
CREATE FUNCTION g_cube_decompress (internal) RETURNS internal
    AS '$libdir/cube', 'g_cube_decompress'
    LANGUAGE c;
--
-- Definition for function g_cube_penalty (OID = 16444) : 
--
CREATE FUNCTION g_cube_penalty (internal, internal, internal) RETURNS internal
    AS '$libdir/cube', 'g_cube_penalty'
    LANGUAGE c STRICT;
--
-- Definition for function g_cube_picksplit (OID = 16445) : 
--
CREATE FUNCTION g_cube_picksplit (internal, internal) RETURNS internal
    AS '$libdir/cube', 'g_cube_picksplit'
    LANGUAGE c;
--
-- Definition for function g_cube_union (OID = 16446) : 
--
CREATE FUNCTION g_cube_union (internal, internal) RETURNS cube
    AS '$libdir/cube', 'g_cube_union'
    LANGUAGE c;
--
-- Definition for function g_cube_same (OID = 16447) : 
--
CREATE FUNCTION g_cube_same (cube, cube, internal) RETURNS internal
    AS '$libdir/cube', 'g_cube_same'
    LANGUAGE c;
--
-- Definition for operator class cube_ops (OID = 16448) : 
--
CREATE OPERATOR CLASS cube_ops
    DEFAULT FOR TYPE cube USING btree AS
    OPERATOR 1 <(cube,cube) ,
    OPERATOR 2 <=(cube,cube) ,
    OPERATOR 3 =(cube,cube) ,
    OPERATOR 4 >=(cube,cube) ,
    OPERATOR 5 >(cube,cube) ,
    FUNCTION 1 cube_cmp(cube,cube);
--
-- Definition for operator class gist_cube_ops (OID = 16449) : 
--
CREATE OPERATOR CLASS gist_cube_ops
    DEFAULT FOR TYPE cube USING gist AS
    OPERATOR 3 &&(cube,cube) ,
    OPERATOR 6 =(cube,cube) ,
    OPERATOR 7 @(cube,cube) ,
    OPERATOR 8 ~(cube,cube) ,
    FUNCTION 1 g_cube_consistent(internal,cube,integer) ,
    FUNCTION 2 g_cube_union(internal,internal) ,
    FUNCTION 3 g_cube_compress(internal) ,
    FUNCTION 4 g_cube_decompress(internal) ,
    FUNCTION 5 g_cube_penalty(internal,internal,internal) ,
    FUNCTION 6 g_cube_picksplit(internal,internal) ,
    FUNCTION 7 g_cube_same(cube,cube,internal);
--
-- Definition for function dblink_connect (OID = 16450) : 
--
CREATE FUNCTION dblink_connect (text) RETURNS text
    AS '$libdir/dblink', 'dblink_connect'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_connect (OID = 16451) : 
--
CREATE FUNCTION dblink_connect (text, text) RETURNS text
    AS '$libdir/dblink', 'dblink_connect'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_disconnect (OID = 16452) : 
--
CREATE FUNCTION dblink_disconnect () RETURNS text
    AS '$libdir/dblink', 'dblink_disconnect'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_disconnect (OID = 16453) : 
--
CREATE FUNCTION dblink_disconnect (text) RETURNS text
    AS '$libdir/dblink', 'dblink_disconnect'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_open (OID = 16454) : 
--
CREATE FUNCTION dblink_open (text, text) RETURNS text
    AS '$libdir/dblink', 'dblink_open'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_open (OID = 16455) : 
--
CREATE FUNCTION dblink_open (text, text, boolean) RETURNS text
    AS '$libdir/dblink', 'dblink_open'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_open (OID = 16456) : 
--
CREATE FUNCTION dblink_open (text, text, text) RETURNS text
    AS '$libdir/dblink', 'dblink_open'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_open (OID = 16457) : 
--
CREATE FUNCTION dblink_open (text, text, text, boolean) RETURNS text
    AS '$libdir/dblink', 'dblink_open'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_fetch (OID = 16458) : 
--
CREATE FUNCTION dblink_fetch (text, integer) RETURNS SETOF record
    AS '$libdir/dblink', 'dblink_fetch'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_fetch (OID = 16459) : 
--
CREATE FUNCTION dblink_fetch (text, integer, boolean) RETURNS SETOF record
    AS '$libdir/dblink', 'dblink_fetch'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_fetch (OID = 16460) : 
--
CREATE FUNCTION dblink_fetch (text, text, integer) RETURNS SETOF record
    AS '$libdir/dblink', 'dblink_fetch'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_fetch (OID = 16461) : 
--
CREATE FUNCTION dblink_fetch (text, text, integer, boolean) RETURNS SETOF record
    AS '$libdir/dblink', 'dblink_fetch'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_close (OID = 16462) : 
--
CREATE FUNCTION dblink_close (text) RETURNS text
    AS '$libdir/dblink', 'dblink_close'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_close (OID = 16463) : 
--
CREATE FUNCTION dblink_close (text, boolean) RETURNS text
    AS '$libdir/dblink', 'dblink_close'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_close (OID = 16464) : 
--
CREATE FUNCTION dblink_close (text, text) RETURNS text
    AS '$libdir/dblink', 'dblink_close'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_close (OID = 16465) : 
--
CREATE FUNCTION dblink_close (text, text, boolean) RETURNS text
    AS '$libdir/dblink', 'dblink_close'
    LANGUAGE c STRICT;
--
-- Definition for function dblink (OID = 16466) : 
--
CREATE FUNCTION dblink (text, text) RETURNS SETOF record
    AS '$libdir/dblink', 'dblink_record'
    LANGUAGE c STRICT;
--
-- Definition for function dblink (OID = 16467) : 
--
CREATE FUNCTION dblink (text, text, boolean) RETURNS SETOF record
    AS '$libdir/dblink', 'dblink_record'
    LANGUAGE c STRICT;
--
-- Definition for function dblink (OID = 16468) : 
--
CREATE FUNCTION dblink (text) RETURNS SETOF record
    AS '$libdir/dblink', 'dblink_record'
    LANGUAGE c STRICT;
--
-- Definition for function dblink (OID = 16469) : 
--
CREATE FUNCTION dblink (text, boolean) RETURNS SETOF record
    AS '$libdir/dblink', 'dblink_record'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_exec (OID = 16470) : 
--
CREATE FUNCTION dblink_exec (text, text) RETURNS text
    AS '$libdir/dblink', 'dblink_exec'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_exec (OID = 16471) : 
--
CREATE FUNCTION dblink_exec (text, text, boolean) RETURNS text
    AS '$libdir/dblink', 'dblink_exec'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_exec (OID = 16472) : 
--
CREATE FUNCTION dblink_exec (text) RETURNS text
    AS '$libdir/dblink', 'dblink_exec'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_exec (OID = 16473) : 
--
CREATE FUNCTION dblink_exec (text, boolean) RETURNS text
    AS '$libdir/dblink', 'dblink_exec'
    LANGUAGE c STRICT;
--
-- Definition for type dblink_pkey_results (OID = 16475) : 
--
CREATE TYPE dblink_pkey_results AS (
        "position" integer,
        colname text
);
--
-- Definition for function dblink_get_pkey (OID = 16476) : 
--
CREATE FUNCTION dblink_get_pkey (text) RETURNS SETOF dblink_pkey_results
    AS '$libdir/dblink', 'dblink_get_pkey'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_build_sql_insert (OID = 16477) : 
--
CREATE FUNCTION dblink_build_sql_insert (text, int2vector, integer, text[], text[]) RETURNS text
    AS '$libdir/dblink', 'dblink_build_sql_insert'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_build_sql_delete (OID = 16478) : 
--
CREATE FUNCTION dblink_build_sql_delete (text, int2vector, integer, text[]) RETURNS text
    AS '$libdir/dblink', 'dblink_build_sql_delete'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_build_sql_update (OID = 16479) : 
--
CREATE FUNCTION dblink_build_sql_update (text, int2vector, integer, text[], text[]) RETURNS text
    AS '$libdir/dblink', 'dblink_build_sql_update'
    LANGUAGE c STRICT;
--
-- Definition for function dblink_current_query (OID = 16480) : 
--
CREATE FUNCTION dblink_current_query () RETURNS text
    AS '$libdir/dblink', 'dblink_current_query'
    LANGUAGE c;
--
-- Definition for function levenshtein (OID = 16481) : 
--
CREATE FUNCTION levenshtein (text, text) RETURNS integer
    AS '$libdir/fuzzystrmatch', 'levenshtein'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function metaphone (OID = 16482) : 
--
CREATE FUNCTION metaphone (text, integer) RETURNS text
    AS '$libdir/fuzzystrmatch', 'metaphone'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function soundex (OID = 16483) : 
--
CREATE FUNCTION soundex (text) RETURNS text
    AS '$libdir/fuzzystrmatch', 'soundex'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function text_soundex (OID = 16484) : 
--
CREATE FUNCTION text_soundex (text) RETURNS text
    AS '$libdir/fuzzystrmatch', 'soundex'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function difference (OID = 16485) : 
--
CREATE FUNCTION difference (text, text) RETURNS integer
    AS '$libdir/fuzzystrmatch', 'difference'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function dmetaphone (OID = 16486) : 
--
CREATE FUNCTION dmetaphone (text) RETURNS text
    AS '$libdir/fuzzystrmatch', 'dmetaphone'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function dmetaphone_alt (OID = 16487) : 
--
CREATE FUNCTION dmetaphone_alt (text) RETURNS text
    AS '$libdir/fuzzystrmatch', 'dmetaphone_alt'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function digest (OID = 16488) : 
--
CREATE FUNCTION digest (text, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pg_digest'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function digest (OID = 16489) : 
--
CREATE FUNCTION digest (bytea, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pg_digest'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function digest_exists (OID = 16490) : 
--
CREATE FUNCTION digest_exists (text) RETURNS boolean
    AS '$libdir/pgcrypto', 'pg_digest_exists'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function hmac (OID = 16491) : 
--
CREATE FUNCTION hmac (text, text, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pg_hmac'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function hmac (OID = 16492) : 
--
CREATE FUNCTION hmac (bytea, bytea, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pg_hmac'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function hmac_exists (OID = 16493) : 
--
CREATE FUNCTION hmac_exists (text) RETURNS boolean
    AS '$libdir/pgcrypto', 'pg_hmac_exists'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function crypt (OID = 16494) : 
--
CREATE FUNCTION crypt (text, text) RETURNS text
    AS '$libdir/pgcrypto', 'pg_crypt'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function gen_salt (OID = 16495) : 
--
CREATE FUNCTION gen_salt (text) RETURNS text
    AS '$libdir/pgcrypto', 'pg_gen_salt'
    LANGUAGE c STRICT;
--
-- Definition for function gen_salt (OID = 16496) : 
--
CREATE FUNCTION gen_salt (text, integer) RETURNS text
    AS '$libdir/pgcrypto', 'pg_gen_salt_rounds'
    LANGUAGE c STRICT;
--
-- Definition for function encrypt (OID = 16497) : 
--
CREATE FUNCTION encrypt (bytea, bytea, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pg_encrypt'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function decrypt (OID = 16498) : 
--
CREATE FUNCTION decrypt (bytea, bytea, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pg_decrypt'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function encrypt_iv (OID = 16499) : 
--
CREATE FUNCTION encrypt_iv (bytea, bytea, bytea, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pg_encrypt_iv'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function decrypt_iv (OID = 16500) : 
--
CREATE FUNCTION decrypt_iv (bytea, bytea, bytea, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pg_decrypt_iv'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function cipher_exists (OID = 16501) : 
--
CREATE FUNCTION cipher_exists (text) RETURNS boolean
    AS '$libdir/pgcrypto', 'pg_cipher_exists'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function pgp_sym_encrypt (OID = 16502) : 
--
CREATE FUNCTION pgp_sym_encrypt (text, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pgp_sym_encrypt_text'
    LANGUAGE c STRICT;
--
-- Definition for function pgp_sym_encrypt_bytea (OID = 16503) : 
--
CREATE FUNCTION pgp_sym_encrypt_bytea (bytea, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pgp_sym_encrypt_bytea'
    LANGUAGE c STRICT;
--
-- Definition for function pgp_sym_encrypt (OID = 16504) : 
--
CREATE FUNCTION pgp_sym_encrypt (text, text, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pgp_sym_encrypt_text'
    LANGUAGE c STRICT;
--
-- Definition for function pgp_sym_encrypt_bytea (OID = 16505) : 
--
CREATE FUNCTION pgp_sym_encrypt_bytea (bytea, text, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pgp_sym_encrypt_bytea'
    LANGUAGE c STRICT;
--
-- Definition for function pgp_sym_decrypt (OID = 16506) : 
--
CREATE FUNCTION pgp_sym_decrypt (bytea, text) RETURNS text
    AS '$libdir/pgcrypto', 'pgp_sym_decrypt_text'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function pgp_sym_decrypt_bytea (OID = 16507) : 
--
CREATE FUNCTION pgp_sym_decrypt_bytea (bytea, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pgp_sym_decrypt_bytea'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function pgp_sym_decrypt (OID = 16508) : 
--
CREATE FUNCTION pgp_sym_decrypt (bytea, text, text) RETURNS text
    AS '$libdir/pgcrypto', 'pgp_sym_decrypt_text'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function pgp_sym_decrypt_bytea (OID = 16509) : 
--
CREATE FUNCTION pgp_sym_decrypt_bytea (bytea, text, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pgp_sym_decrypt_bytea'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function pgp_pub_encrypt (OID = 16510) : 
--
CREATE FUNCTION pgp_pub_encrypt (text, bytea) RETURNS bytea
    AS '$libdir/pgcrypto', 'pgp_pub_encrypt_text'
    LANGUAGE c STRICT;
--
-- Definition for function pgp_pub_encrypt_bytea (OID = 16511) : 
--
CREATE FUNCTION pgp_pub_encrypt_bytea (bytea, bytea) RETURNS bytea
    AS '$libdir/pgcrypto', 'pgp_pub_encrypt_bytea'
    LANGUAGE c STRICT;
--
-- Definition for function pgp_pub_encrypt (OID = 16512) : 
--
CREATE FUNCTION pgp_pub_encrypt (text, bytea, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pgp_pub_encrypt_text'
    LANGUAGE c STRICT;
--
-- Definition for function pgp_pub_encrypt_bytea (OID = 16513) : 
--
CREATE FUNCTION pgp_pub_encrypt_bytea (bytea, bytea, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pgp_pub_encrypt_bytea'
    LANGUAGE c STRICT;
--
-- Definition for function pgp_pub_decrypt (OID = 16514) : 
--
CREATE FUNCTION pgp_pub_decrypt (bytea, bytea) RETURNS text
    AS '$libdir/pgcrypto', 'pgp_pub_decrypt_text'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function pgp_pub_decrypt_bytea (OID = 16515) : 
--
CREATE FUNCTION pgp_pub_decrypt_bytea (bytea, bytea) RETURNS bytea
    AS '$libdir/pgcrypto', 'pgp_pub_decrypt_bytea'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function pgp_pub_decrypt (OID = 16516) : 
--
CREATE FUNCTION pgp_pub_decrypt (bytea, bytea, text) RETURNS text
    AS '$libdir/pgcrypto', 'pgp_pub_decrypt_text'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function pgp_pub_decrypt_bytea (OID = 16517) : 
--
CREATE FUNCTION pgp_pub_decrypt_bytea (bytea, bytea, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pgp_pub_decrypt_bytea'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function pgp_pub_decrypt (OID = 16518) : 
--
CREATE FUNCTION pgp_pub_decrypt (bytea, bytea, text, text) RETURNS text
    AS '$libdir/pgcrypto', 'pgp_pub_decrypt_text'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function pgp_pub_decrypt_bytea (OID = 16519) : 
--
CREATE FUNCTION pgp_pub_decrypt_bytea (bytea, bytea, text, text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pgp_pub_decrypt_bytea'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function pgp_key_id (OID = 16520) : 
--
CREATE FUNCTION pgp_key_id (bytea) RETURNS text
    AS '$libdir/pgcrypto', 'pgp_key_id_w'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function armor (OID = 16521) : 
--
CREATE FUNCTION armor (bytea) RETURNS text
    AS '$libdir/pgcrypto', 'pg_armor'
    LANGUAGE c IMMUTABLE STRICT;
--
-- Definition for function dearmor (OID = 16522) : 
--
CREATE FUNCTION dearmor (text) RETURNS bytea
    AS '$libdir/pgcrypto', 'pg_dearmor'
    LANGUAGE c IMMUTABLE STRICT;
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
--
-- Comments
--
COMMENT ON SCHEMA public IS 'Standard public schema';
COMMENT ON TYPE cube IS 'multi-dimensional cube ''(FLOAT-1, FLOAT-2, ..., FLOAT-N), (FLOAT-1, FLOAT-2, ..., FLOAT-N)''';
COMMENT ON FUNCTION cube (text) IS 'convert text to cube';
COMMENT ON FUNCTION cube_eq (cube, cube) IS 'same as';
COMMENT ON FUNCTION cube_ne (cube, cube) IS 'different';
COMMENT ON FUNCTION cube_lt (cube, cube) IS 'lower than';
COMMENT ON FUNCTION cube_gt (cube, cube) IS 'greater than';
COMMENT ON FUNCTION cube_le (cube, cube) IS 'lower than or equal to';
COMMENT ON FUNCTION cube_ge (cube, cube) IS 'greater than or equal to';
COMMENT ON FUNCTION cube_cmp (cube, cube) IS 'btree comparison function';
COMMENT ON FUNCTION cube_contains (cube, cube) IS 'contains';
COMMENT ON FUNCTION cube_contained (cube, cube) IS 'contained in';
COMMENT ON FUNCTION cube_overlap (cube, cube) IS 'overlaps';
