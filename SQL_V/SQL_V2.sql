use tcu_republica_de_francia

insert into estudiante (Id_estudiante, Apellido_1, Apellido_2, Nombre_Completo)
values ('1-1111-1111','Segura','Sanabria','Sergio');
insert into estudiante (Id_estudiante, Apellido_1, Apellido_2, Nombre_Completo)
values ('155808736328','Hernandez','','Isidro Moises');
insert into estudiante (Id_estudiante, Apellido_1, Apellido_2, Nombre_Completo)
values ('155808736','Fernandez','Montero','Lucia');

insert into Familia(Telefono, Direccion, Contacto_principal)
values ('8999-9999','del palo de jocotes 6 pasos al este','Montero Rosario');
insert into Familia(Telefono, Direccion, Contacto_principal)
values ('8888-8888','del palo de mango 5 pasos al este','Sanabria Santiago');

insert into pago_anual (Monto, Fecha_Cambio)
values ('10000', curdate());
