insert into usuario (id, contrasenha, correo)
select 1, 'user', 'user@correo.com'
where not exists (select 1 from usuario);