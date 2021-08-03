delete from user_role;
delete from usr;

insert into usr(id, username, password, active) values
(1, 'admin', '$2a$08$YzzGeKL1VgGTUu8pMvRIZuockmQVmeBynFRLux29F56hkofxDuPq.', true),
(2, 'ben', '$2a$08$pC.BCNK8T5Rmg8itJUBRoOo8LXp1oYo7T6xy4xeUnFQIQP16QLJkS', true);

insert into user_role(user_id, roles) values
(1, 'ADMIN'), (1, 'USER'),
(2, 'USER');